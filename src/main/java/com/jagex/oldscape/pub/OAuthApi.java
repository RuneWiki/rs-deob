package com.jagex.oldscape.pub;

public interface OAuthApi {

    long getAccountHash();

    void setOtlTokenRequester(OtlTokenRequester arg0);

    boolean isOnLoginScreen();

    void setRefreshTokenRequester(RefreshAccessTokenRequester arg0);
}
