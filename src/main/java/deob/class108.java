package deob;

@ObfuscatedName("em")
public final class class108 extends class256 {

    @ObfuscatedName("em.ak")
    public int field1401;

    @ObfuscatedName("em.al")
    public int field1394;

    @ObfuscatedName("em.aj")
    public int field1395;

    @ObfuscatedName("em.az")
    public int field1400;

    @ObfuscatedName("em.af")
    public int field1397;

    @ObfuscatedName("em.aa")
    public boolean field1396;

    @ObfuscatedName("em.ab")
    public int field1399 = 31;

    @ObfuscatedName("em.ak(II)V")
    public void method2628(int arg0) {
        this.field1399 = arg0;
    }

    @ObfuscatedName("em.al(IB)Z")
    public boolean method2629(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1399 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("em.ah(I)Lkb;")
    public final class264 method2007() {
        return class225.method369(this.field1401).method3932(this.field1394);
    }
}
