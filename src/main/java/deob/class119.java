package deob;

import java.net.URL;

@ObfuscatedName("ez")
public class class119 {

    @ObfuscatedName("ez.aq")
    public final URL field1484;

    @ObfuscatedName("ez.ad")
    public static int field1480 = -1;

    @ObfuscatedName("ez.ag")
    public static int field1486 = -2;

    @ObfuscatedName("ez.ak")
    public volatile int field1483 = field1480;

    @ObfuscatedName("ez.ap")
    public volatile byte[] field1479;

    public class119(URL arg0) {
        this.field1484 = arg0;
    }

    @ObfuscatedName("ez.aq(S)Z")
    public boolean method2822() {
        return field1480 != this.field1483;
    }

    @ObfuscatedName("ez.ad(I)[B")
    public byte[] method2823() {
        return this.field1479;
    }

    @ObfuscatedName("ez.ag(I)Ljava/lang/String;")
    public String method2825() {
        return this.field1484.toString();
    }
}
