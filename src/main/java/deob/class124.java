package deob;

@ObfuscatedName("dl")
public final class class124 extends class106 {

    @ObfuscatedName("dl.h")
    public static class104 field1601 = new class104();

    @ObfuscatedName("dl.k")
    public int field1600;

    @ObfuscatedName("dl.r")
    public class153 field1613;

    @ObfuscatedName("dl.l")
    public int field1612;

    @ObfuscatedName("dl.i")
    public int field1599;

    @ObfuscatedName("dl.e")
    public int field1603;

    @ObfuscatedName("dl.a")
    public int field1602;

    @ObfuscatedName("dl.g")
    public int field1605;

    @ObfuscatedName("dl.w")
    public int field1606;

    @ObfuscatedName("dl.v")
    public class146 field1607;

    @ObfuscatedName("dl.u")
    public int field1608;

    @ObfuscatedName("dl.m")
    public int field1609;

    @ObfuscatedName("dl.b")
    public int[] field1610;

    @ObfuscatedName("dl.f")
    public int field1604;

    @ObfuscatedName("dl.d")
    public class146 field1611;

    @ObfuscatedName("p.r(I)V")
    public static void method325() {
        for (class124 var0 = (class124) field1601.method1305(); var0 != null; var0 = (class124) field1601.method1287()) {
            if (var0.field1607 != null) {
                Statics.field1115.method2181(var0.field1607);
                var0.field1607 = null;
            }
            if (var0.field1611 != null) {
                Statics.field1115.method2181(var0.field1611);
                var0.field1611 = null;
            }
        }
        field1601.method1279();
    }

    @ObfuscatedName("dv.l(I)V")
    public static void method1464() {
        for (class124 var0 = (class124) field1601.method1305(); var0 != null; var0 = (class124) field1601.method1287()) {
            if (var0.field1613 != null) {
                var0.method1471();
            }
        }
    }

    @ObfuscatedName("dl.i(I)V")
    public void method1471() {
        int var1 = this.field1606;
        class153 var2 = this.field1613.method2342();
        if (var2 == null) {
            this.field1606 = -1;
            this.field1605 = 0;
            this.field1608 = 0;
            this.field1609 = 0;
            this.field1610 = null;
        } else {
            this.field1606 = var2.field2345;
            this.field1605 = var2.field2346 * 128;
            this.field1608 = var2.field2347;
            this.field1609 = var2.field2348;
            this.field1610 = var2.field2349;
        }
        if (this.field1606 != var1 && this.field1607 != null) {
            Statics.field1115.method2181(this.field1607);
            this.field1607 = null;
        }
    }

    @ObfuscatedName("av.e(IIILep;IB)V")
    public static void method547(int arg0, int arg1, int arg2, class153 arg3, int arg4) {
        class124 var5 = new class124();
        var5.field1600 = arg0;
        var5.field1612 = arg1 * 128;
        var5.field1599 = arg2 * 128;
        int var6 = arg3.field2315;
        int var7 = arg3.field2312;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2312;
            var7 = arg3.field2315;
        }
        var5.field1603 = (arg1 + var6) * 128;
        var5.field1602 = (arg2 + var7) * 128;
        var5.field1606 = arg3.field2345;
        var5.field1605 = arg3.field2346 * 128;
        var5.field1608 = arg3.field2347;
        var5.field1609 = arg3.field2348;
        var5.field1610 = arg3.field2349;
        if (arg3.field2301 != null) {
            var5.field1613 = arg3;
            var5.method1471();
        }
        field1601.method1284(var5);
        if (var5.field1610 != null) {
            var5.field1604 = var5.field1608 + (int) (Math.random() * (double) (var5.field1609 - var5.field1608));
        }
    }
}
