package deob;

@ObfuscatedName("cg")
public final class class100 extends class222 {

    @ObfuscatedName("cg.f")
    public int field1326;

    @ObfuscatedName("cg.w")
    public int field1325;

    @ObfuscatedName("cg.s")
    public int field1324 = 31;

    @ObfuscatedName("cg.f(II)V")
    public void method2589(int arg0) {
        this.field1324 = arg0;
    }

    @ObfuscatedName("cg.v(II)Z")
    public boolean method2584(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1324 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("cg.w(I)Lhs;")
    public final class228 method1977() {
        return class201.method2583(this.field1326).method3656(this.field1325);
    }
}
