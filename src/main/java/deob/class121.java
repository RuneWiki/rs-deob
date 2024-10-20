package deob;

import java.net.URL;

@ObfuscatedName("ei")
public class class121 {

    @ObfuscatedName("ei.ap")
    public final URL field1501;

    @ObfuscatedName("ei.aw")
    public static int field1499 = -1;

    @ObfuscatedName("ei.ak")
    public static int field1498 = -2;

    @ObfuscatedName("ei.aj")
    public volatile int field1497 = field1499;

    @ObfuscatedName("ei.ai")
    public volatile byte[] field1500;

    public class121(URL arg0) {
        this.field1501 = arg0;
    }

    @ObfuscatedName("ei.ap(I)Z")
    public boolean method3110() {
        return field1499 != this.field1497;
    }

    @ObfuscatedName("ei.aw(B)[B")
    public byte[] method3111() {
        return this.field1500;
    }

    @ObfuscatedName("ei.ak(I)Ljava/lang/String;")
    public String method3112() {
        return this.field1501.toString();
    }
}
