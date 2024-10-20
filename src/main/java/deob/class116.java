package deob;

import java.net.URL;

@ObfuscatedName("eb")
public class class116 {

    @ObfuscatedName("eb.aq")
    public final URL field1448;

    @ObfuscatedName("eb.aw")
    public static int field1447 = -1;

    @ObfuscatedName("eb.al")
    public static int field1446 = -2;

    @ObfuscatedName("eb.ai")
    public volatile int field1449 = field1447;

    @ObfuscatedName("eb.ar")
    public volatile byte[] field1450;

    public class116(URL arg0) {
        this.field1448 = arg0;
    }

    @ObfuscatedName("eb.aq(I)Z")
    public boolean method2778() {
        return field1447 != this.field1449;
    }

    @ObfuscatedName("eb.aw(S)[B")
    public byte[] method2780() {
        return this.field1450;
    }

    @ObfuscatedName("eb.al(B)Ljava/lang/String;")
    public String method2781() {
        return this.field1448.toString();
    }
}
