package com.jagex.oldscape.pub;

public interface RefreshAccessTokenResponse {

    String getRefreshToken();

    boolean isSuccess();

    String getAccessToken();
}
