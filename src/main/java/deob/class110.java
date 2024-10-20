package deob;

@ObfuscatedName("ec")
public final class class110 extends class248 {

    @ObfuscatedName("ec.ap")
    public int field1411;

    @ObfuscatedName("ec.aw")
    public int field1404;

    @ObfuscatedName("ec.ak")
    public int field1405;

    @ObfuscatedName("ec.aj")
    public int field1412;

    @ObfuscatedName("ec.ai")
    public int field1407;

    @ObfuscatedName("ec.ay")
    public boolean field1408;

    @ObfuscatedName("ec.ae")
    public int field1409 = 31;

    @ObfuscatedName("ec.am")
    public class176 field1410;

    @ObfuscatedName("ec.ap(II)V")
    public void method2925(int arg0) {
        this.field1409 = arg0;
    }

    @ObfuscatedName("ec.aw(II)Z")
    public boolean method2928(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1409 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ec.au(I)Ljy;")
    public final class256 method2245() {
        class211 var1 = class211.method7530(this.field1411);
        return this.field1410 == null ? var1.method4010(this.field1404) : var1.method4029(this.field1410);
    }

    @ObfuscatedName("ec.ak(Lgz;B)V")
    public void method2927(class176 arg0) {
        this.field1410 = arg0;
    }

    @ObfuscatedName("ec.aj(I)Lgz;")
    public class176 method2924() {
        return this.field1410;
    }

    @ObfuscatedName("ec.ai(I)V")
    public void method2929() {
        this.field1410 = null;
    }
}
