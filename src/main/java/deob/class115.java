package deob;

import java.net.URL;

@ObfuscatedName("et")
public class class115 {

    @ObfuscatedName("et.au")
    public final URL field1454;

    @ObfuscatedName("et.ae")
    public static int field1455 = -1;

    @ObfuscatedName("et.ao")
    public static int field1456 = -2;

    @ObfuscatedName("et.at")
    public volatile int field1457 = field1455;

    @ObfuscatedName("et.ac")
    public volatile byte[] field1458;

    public class115(URL arg0) {
        this.field1454 = arg0;
    }

    @ObfuscatedName("et.au(I)Z")
    public boolean method2722() {
        return field1455 != this.field1457;
    }

    @ObfuscatedName("et.ae(I)[B")
    public byte[] method2728() {
        return this.field1458;
    }

    @ObfuscatedName("et.ao(I)Ljava/lang/String;")
    public String method2723() {
        return this.field1454.toString();
    }
}
