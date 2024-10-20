package deob;

@ObfuscatedName("cz")
public final class class100 extends class215 {

    @ObfuscatedName("cz.a")
    public int field1303;

    @ObfuscatedName("cz.f")
    public int field1298;

    @ObfuscatedName("cz.x")
    public int field1299 = 31;

    @ObfuscatedName("cz.a(IB)V")
    public void method2438(int arg0) {
        this.field1299 = arg0;
    }

    @ObfuscatedName("cz.c(IB)Z")
    public boolean method2437(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1299 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("cz.f(I)Lha;")
    public final class221 method1929() {
        return class195.method5052(this.field1303).method3470(this.field1298);
    }
}
