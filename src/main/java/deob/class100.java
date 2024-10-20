package deob;

@ObfuscatedName("dx")
public final class class100 extends class225 {

    @ObfuscatedName("dx.af")
    public int field1317;

    @ObfuscatedName("dx.an")
    public int field1313;

    @ObfuscatedName("dx.ac")
    public int field1318 = 31;

    @ObfuscatedName("dx.af(IB)V")
    public void method2529(int arg0) {
        this.field1318 = arg0;
    }

    @ObfuscatedName("dx.aw(II)Z")
    public boolean method2532(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1318 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("dx.an(B)Lit;")
    public final class232 method1921() {
        return class202.method2286(this.field1317).method3737(this.field1313);
    }
}
