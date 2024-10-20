package deob;

import java.net.URL;

@ObfuscatedName("ek")
public class class121 {

    @ObfuscatedName("ek.ac")
    public final URL field1503;

    @ObfuscatedName("ek.ae")
    public static int field1506 = -1;

    @ObfuscatedName("ek.ag")
    public static int field1504 = -2;

    @ObfuscatedName("ek.am")
    public volatile int field1505 = field1506;

    @ObfuscatedName("ek.ax")
    public volatile byte[] field1510;

    public class121(URL arg0) {
        this.field1503 = arg0;
    }

    @ObfuscatedName("ek.ac(I)Z")
    public boolean method2996() {
        return field1506 != this.field1505;
    }

    @ObfuscatedName("ek.ae(I)[B")
    public byte[] method2997() {
        return this.field1510;
    }

    @ObfuscatedName("ek.ag(I)Ljava/lang/String;")
    public String method2998() {
        return this.field1503.toString();
    }
}
