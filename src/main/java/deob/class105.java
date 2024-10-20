package deob;

@ObfuscatedName("ed")
public final class class105 extends class233 {

    @ObfuscatedName("ed.au")
    public int field1363;

    @ObfuscatedName("ed.ae")
    public int field1364;

    @ObfuscatedName("ed.at")
    public int field1367 = 31;

    @ObfuscatedName("ed.au(IS)V")
    public void method2558(int arg0) {
        this.field1367 = arg0;
    }

    @ObfuscatedName("ed.ao(II)Z")
    public boolean method2557(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1367 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ed.ae(I)Ljr;")
    public final class240 method1990() {
        return class207.method3280(this.field1363).method3658(this.field1364);
    }
}
