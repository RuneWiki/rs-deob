package deob;

import java.net.URL;

@ObfuscatedName("ez")
public class class110 {

    @ObfuscatedName("ez.af")
    public final URL field1409;

    @ObfuscatedName("ez.an")
    public static int field1408 = -1;

    @ObfuscatedName("ez.aw")
    public static int field1407 = -2;

    @ObfuscatedName("ez.ac")
    public volatile int field1406 = field1408;

    @ObfuscatedName("ez.au")
    public volatile byte[] field1410;

    public class110(URL arg0) {
        this.field1409 = arg0;
    }

    @ObfuscatedName("ez.af(B)Z")
    public boolean method2708() {
        return field1408 != this.field1406;
    }

    @ObfuscatedName("ez.an(B)[B")
    public byte[] method2710() {
        return this.field1410;
    }

    @ObfuscatedName("ez.aw(B)Ljava/lang/String;")
    public String method2718() {
        return this.field1409.toString();
    }
}
