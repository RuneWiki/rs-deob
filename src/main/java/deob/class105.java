package deob;

@ObfuscatedName("et")
public final class class105 extends class234 {

    @ObfuscatedName("et.aw")
    public int field1346;

    @ObfuscatedName("et.ay")
    public int field1350;

    @ObfuscatedName("et.am")
    public int field1348 = 31;

    @ObfuscatedName("et.aw(II)V")
    public void method2549(int arg0) {
        this.field1348 = arg0;
    }

    @ObfuscatedName("et.ar(IB)Z")
    public boolean method2550(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1348 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("et.ay(I)Ljo;")
    public final class241 method1986() {
        return class208.method2788(this.field1346).method3637(this.field1350);
    }
}
