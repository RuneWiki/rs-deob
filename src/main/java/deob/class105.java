package deob;

@ObfuscatedName("ec")
public final class class105 extends class273 {

    @ObfuscatedName("ec.at")
    public int field1344;

    @ObfuscatedName("ec.ah")
    public int field1342;

    @ObfuscatedName("ec.ao")
    public int field1343 = 31;

    @ObfuscatedName("ec.at(II)V")
    public void method2615(int arg0) {
        this.field1343 = arg0;
    }

    @ObfuscatedName("ec.ar(II)Z")
    public boolean method2616(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1343 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ec.ah(B)Lka;")
    public final class280 method2019() {
        return class203.method3907(this.field1344).method3641(this.field1342);
    }
}
