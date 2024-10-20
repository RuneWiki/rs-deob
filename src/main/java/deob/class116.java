package deob;

import java.net.URL;

@ObfuscatedName("el")
public class class116 {

    @ObfuscatedName("el.az")
    public final URL field1470;

    @ObfuscatedName("el.ah")
    public static int field1463 = -1;

    @ObfuscatedName("el.af")
    public static int field1465 = -2;

    @ObfuscatedName("el.at")
    public volatile int field1466 = field1463;

    @ObfuscatedName("el.an")
    public volatile byte[] field1467;

    public class116(URL arg0) {
        this.field1470 = arg0;
    }

    @ObfuscatedName("el.az(B)Z")
    public boolean method2712() {
        return field1463 != this.field1466;
    }

    @ObfuscatedName("el.ah(I)[B")
    public byte[] method2714() {
        return this.field1467;
    }

    @ObfuscatedName("el.af(B)Ljava/lang/String;")
    public String method2723() {
        return this.field1470.toString();
    }
}
