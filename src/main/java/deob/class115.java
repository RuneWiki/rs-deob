package deob;

import java.net.URL;

@ObfuscatedName("ea")
public class class115 {

    @ObfuscatedName("ea.at")
    public final URL field1430;

    @ObfuscatedName("ea.ah")
    public static int field1429 = -1;

    @ObfuscatedName("ea.ar")
    public static int field1433 = -2;

    @ObfuscatedName("ea.ao")
    public volatile int field1428 = field1429;

    @ObfuscatedName("ea.ab")
    public volatile byte[] field1432;

    public class115(URL arg0) {
        this.field1430 = arg0;
    }

    @ObfuscatedName("ea.at(I)Z")
    public boolean method2770() {
        return field1429 != this.field1428;
    }

    @ObfuscatedName("ea.ah(B)[B")
    public byte[] method2774() {
        return this.field1432;
    }

    @ObfuscatedName("ea.ar(I)Ljava/lang/String;")
    public String method2777() {
        return this.field1430.toString();
    }
}
