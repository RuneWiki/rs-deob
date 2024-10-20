package deob;

@ObfuscatedName("ep")
public class class130 implements class384 {

    @ObfuscatedName("ep.at")
    public static final class130 field1514 = new class130(0, 0);

    @ObfuscatedName("ep.ah")
    public static final class130 field1515 = new class130(1, 1);

    @ObfuscatedName("ep.ar")
    public static final class130 field1513 = new class130(2, 2);

    @ObfuscatedName("ep.ao")
    public static final class130 field1519 = new class130(3, 3);

    @ObfuscatedName("ep.ab")
    public static final class130 field1511 = new class130(4, 4);

    @ObfuscatedName("ep.au")
    public final int field1516;

    @ObfuscatedName("ep.aa")
    public final int field1517;

    public class130(int arg0, int arg1) {
        this.field1516 = arg0;
        this.field1517 = arg1;
    }

    @ObfuscatedName("ep.ah(B)I")
    public int method41() {
        return this.field1517;
    }

    @ObfuscatedName("ch.at(II)Lep;")
    public static class130 method2029(int arg0) {
        class130[] var1 = new class130[] { field1514, field1515, field1513, field1519, field1511 };
        class130 var2 = (class130) class385.method164(var1, arg0);
        if (var2 == null) {
            var2 = field1514;
        }
        return var2;
    }
}
