package deob;

@ObfuscatedName("ew")
public final class class110 extends class248 {

    @ObfuscatedName("ew.ac")
    public int field1416;

    @ObfuscatedName("ew.ae")
    public int field1415;

    @ObfuscatedName("ew.ag")
    public int field1421;

    @ObfuscatedName("ew.am")
    public int field1418;

    @ObfuscatedName("ew.ax")
    public int field1419;

    @ObfuscatedName("ew.aq")
    public boolean field1420;

    @ObfuscatedName("ew.at")
    public int field1417 = 31;

    @ObfuscatedName("ew.ac(II)V")
    public void method2819(int arg0) {
        this.field1417 = arg0;
    }

    @ObfuscatedName("ew.ae(II)Z")
    public boolean method2821(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1417 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ew.ad(B)Ljm;")
    public final class256 method2182() {
        return class211.method2414(this.field1416).method3905(this.field1415);
    }
}
