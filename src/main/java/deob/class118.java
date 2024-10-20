package deob;

import java.net.URL;

@ObfuscatedName("ea")
public class class118 {

    @ObfuscatedName("ea.ak")
    public final URL field1493;

    @ObfuscatedName("ea.al")
    public static int field1488 = -1;

    @ObfuscatedName("ea.aj")
    public static int field1487 = -2;

    @ObfuscatedName("ea.az")
    public volatile int field1490 = field1488;

    @ObfuscatedName("ea.af")
    public volatile byte[] field1491;

    public class118(URL arg0) {
        this.field1493 = arg0;
    }

    @ObfuscatedName("ea.ak(I)Z")
    public boolean method2797() {
        return field1488 != this.field1490;
    }

    @ObfuscatedName("ea.al(I)[B")
    public byte[] method2798() {
        return this.field1491;
    }

    @ObfuscatedName("ea.aj(I)Ljava/lang/String;")
    public String method2799() {
        return this.field1493.toString();
    }
}
