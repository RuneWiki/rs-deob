package deob;

@ObfuscatedName("el")
public final class class105 extends class276 {

    @ObfuscatedName("el.am")
    public int field1338;

    @ObfuscatedName("el.ap")
    public int field1335;

    @ObfuscatedName("el.aj")
    public int field1336 = 31;

    @ObfuscatedName("el.am(IB)V")
    public void method2639(int arg0) {
        this.field1336 = arg0;
    }

    @ObfuscatedName("el.af(IB)Z")
    public boolean method2640(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1336 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("el.ap(I)Lko;")
    public final class283 method2053() {
        return class203.method5762(this.field1338).method3670(this.field1335);
    }
}
