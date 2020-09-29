package com.park.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 配置信息在 properties 配置文件中提示 demo
 *
 * @author Aaron
 * @date 2020/9/29 14:35
 */
@Component
@ConfigurationProperties(prefix = "customer.meta")
public class MetaConfig {
    /**
     * 名称
     */
    private String name;

    /**
     * 地址
     */
    private String ip = "127.0.0.1";

    /**
     * 端口
     */
    private int port = 9797;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
