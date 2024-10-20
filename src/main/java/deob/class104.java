package deob;

@ObfuscatedName("dr")
public final class class104 extends class232 {

    @ObfuscatedName("dr.at")
    public int field1319;

    @ObfuscatedName("dr.an")
    public int field1316;

    @ObfuscatedName("dr.as")
    public int field1315 = 31;

    @ObfuscatedName("dr.at(II)V")
    public void method2518(int arg0) {
        this.field1315 = arg0;
    }

    @ObfuscatedName("dr.av(IB)Z")
    public boolean method2524(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1315 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("dr.an(I)Ljd;")
    public final class239 method1952() {
        return class206.method5155(this.field1319).method3628(this.field1316);
    }
}
