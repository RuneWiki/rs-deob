package deob;

import java.net.URL;

@ObfuscatedName("eq")
public class class117 {

    @ObfuscatedName("eq.ac")
    public final URL field1445;

    @ObfuscatedName("eq.al")
    public static int field1444 = -1;

    @ObfuscatedName("eq.ak")
    public static int field1447 = -2;

    @ObfuscatedName("eq.ax")
    public volatile int field1446 = field1444;

    @ObfuscatedName("eq.ao")
    public volatile byte[] field1443;

    public class117(URL arg0) {
        this.field1445 = arg0;
    }

    @ObfuscatedName("eq.ac(B)Z")
    public boolean method2731() {
        return field1444 != this.field1446;
    }

    @ObfuscatedName("eq.al(I)[B")
    public byte[] method2727() {
        return this.field1443;
    }

    @ObfuscatedName("eq.ak(I)Ljava/lang/String;")
    public String method2733() {
        return this.field1445.toString();
    }
}
