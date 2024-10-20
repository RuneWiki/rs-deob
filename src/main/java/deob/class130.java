package deob;

@ObfuscatedName("ek")
public class class130 implements class388 {

    @ObfuscatedName("ek.am")
    public static final class130 field1514 = new class130(0, 0);

    @ObfuscatedName("ek.ap")
    public static final class130 field1511 = new class130(1, 1);

    @ObfuscatedName("ek.af")
    public static final class130 field1513 = new class130(2, 2);

    @ObfuscatedName("ek.aj")
    public static final class130 field1516 = new class130(3, 3);

    @ObfuscatedName("ek.aq")
    public static final class130 field1515 = new class130(4, 4);

    @ObfuscatedName("ek.ar")
    public final int field1512;

    @ObfuscatedName("ek.ag")
    public final int field1517;

    public class130(int arg0, int arg1) {
        this.field1512 = arg0;
        this.field1517 = arg1;
    }

    @ObfuscatedName("ek.ap(I)I")
    public int method34() {
        return this.field1517;
    }

    @ObfuscatedName("ad.am(IB)Lek;")
    public static class130 method164(int arg0) {
        class130[] var1 = new class130[] { field1514, field1511, field1513, field1516, field1515 };
        class130 var2 = (class130) class389.method6514(var1, arg0);
        if (var2 == null) {
            var2 = field1514;
        }
        return var2;
    }
}
