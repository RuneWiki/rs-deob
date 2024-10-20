package deob;

@ObfuscatedName("ew")
public final class class106 extends class249 {

    @ObfuscatedName("ew.az")
    public int field1367;

    @ObfuscatedName("ew.ah")
    public int field1372;

    @ObfuscatedName("ew.at")
    public int field1369 = 31;

    @ObfuscatedName("ew.az(II)V")
    public void method2557(int arg0) {
        this.field1369 = arg0;
    }

    @ObfuscatedName("ew.af(II)Z")
    public boolean method2564(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1369 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ew.ah(I)Ljn;")
    public final class256 method1979() {
        return class223.method87(this.field1367).method3811(this.field1372);
    }
}
