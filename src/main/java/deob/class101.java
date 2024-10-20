package deob;

@ObfuscatedName("cr")
public final class class101 extends class218 {

    @ObfuscatedName("cr.h")
    public int field1360;

    @ObfuscatedName("cr.e")
    public int field1352;

    @ObfuscatedName("cr.x")
    public int field1354 = 31;

    @ObfuscatedName("cr.h(II)V")
    public void method2475(int arg0) {
        this.field1354 = arg0;
    }

    @ObfuscatedName("cr.m(IB)Z")
    public boolean method2476(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1354 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("cr.e(I)Lhh;")
    public final class224 method1915() {
        return class197.method3345(this.field1360).method3582(this.field1352);
    }
}
