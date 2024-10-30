package com.jagex.twitchtv;

import com.jagex.game.client.TwitchEventSubject;
import deob.ObfuscatedName;

public class TwitchEventReport extends TwitchEvent {

    public String message;

    public TwitchEventReport(int arg0, String arg1) {
        super(arg0);
        this.message = arg1;
    }

    @ObfuscatedName("com/jagex/twitchtv/TwitchEventReport.e([I[J[Ljava/lang/Object;)V")
    public void method13(int[] arg0, long[] arg1, Object[] arg2) {
        arg0[0] = this.eventType;
        arg2[0] = this.message;
    }

    @ObfuscatedName("com/jagex/twitchtv/TwitchEventReport.n()Lud;")
    public TwitchEventSubject method12() {
        return TwitchEventSubject.REPORT;
    }
}
