package deob;

@ObfuscatedName("do")
public final class class102 extends class225 {

    @ObfuscatedName("do.aj")
    public int field1311;

    @ObfuscatedName("do.al")
    public int field1314;

    @ObfuscatedName("do.ab")
    public int field1318 = 31;

    @ObfuscatedName("do.aj(II)V")
    public void method2524(int arg0) {
        this.field1318 = arg0;
    }

    @ObfuscatedName("do.ac(II)Z")
    public boolean method2526(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1318 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("do.al(I)Lix;")
    public final class231 method1936() {
        return class204.method3453(this.field1311).method3596(this.field1314);
    }
}
