package deob;

@ObfuscatedName("da")
public final class class125 extends class107 {

    @ObfuscatedName("da.o")
    public static class105 field1617 = new class105();

    @ObfuscatedName("da.c")
    public int field1604;

    @ObfuscatedName("da.h")
    public int field1605;

    @ObfuscatedName("da.r")
    public class154 field1603;

    @ObfuscatedName("da.d")
    public int field1613;

    @ObfuscatedName("da.k")
    public int field1607;

    @ObfuscatedName("da.u")
    public int field1616;

    @ObfuscatedName("da.v")
    public int field1610;

    @ObfuscatedName("da.f")
    public int field1608;

    @ObfuscatedName("da.s")
    public int field1612;

    @ObfuscatedName("da.j")
    public class147 field1611;

    @ObfuscatedName("da.e")
    public int field1609;

    @ObfuscatedName("da.t")
    public int[] field1614;

    @ObfuscatedName("da.y")
    public int field1615;

    @ObfuscatedName("da.b")
    public class147 field1606;

    @ObfuscatedName("cq.r(B)V")
    public static void method1008() {
        for (class125 var0 = (class125) field1617.method1298(); var0 != null; var0 = (class125) field1617.method1299()) {
            if (var0.field1611 != null) {
                Statics.field1493.method2185(var0.field1611);
                var0.field1611 = null;
            }
            if (var0.field1606 != null) {
                Statics.field1493.method2185(var0.field1606);
                var0.field1606 = null;
            }
        }
        field1617.method1292();
    }

    @ObfuscatedName("cb.d(I)V")
    public static void method1099() {
        for (class125 var0 = (class125) field1617.method1298(); var0 != null; var0 = (class125) field1617.method1299()) {
            if (var0.field1603 != null) {
                var0.method1481();
            }
        }
    }

    @ObfuscatedName("da.k(B)V")
    public void method1481() {
        int var1 = this.field1608;
        class154 var2 = this.field1603.method2365();
        if (var2 == null) {
            this.field1608 = -1;
            this.field1610 = 0;
            this.field1612 = 0;
            this.field1609 = 0;
            this.field1614 = null;
        } else {
            this.field1608 = var2.field2345;
            this.field1610 = var2.field2346 * 128;
            this.field1612 = var2.field2330;
            this.field1609 = var2.field2312;
            this.field1614 = var2.field2317;
        }
        if (this.field1608 != var1 && this.field1611 != null) {
            Statics.field1493.method2185(this.field1611);
            this.field1611 = null;
        }
    }

    @ObfuscatedName("k.u(IIIIB)V")
    public static void method87(int arg0, int arg1, int arg2, int arg3) {
        for (class125 var4 = (class125) field1617.method1298(); var4 != null; var4 = (class125) field1617.method1299()) {
            if (var4.field1608 != -1 || var4.field1614 != null) {
                int var5 = 0;
                if (arg1 > var4.field1607) {
                    var5 += arg1 - var4.field1607;
                } else if (arg1 < var4.field1605) {
                    var5 += var4.field1605 - arg1;
                }
                if (arg2 > var4.field1616) {
                    var5 += arg2 - var4.field1616;
                } else if (arg2 < var4.field1613) {
                    var5 += var4.field1613 - arg2;
                }
                if (var5 - 64 > var4.field1610 || client.field2173 == 0 || var4.field1604 != arg0) {
                    if (var4.field1611 != null) {
                        Statics.field1493.method2185(var4.field1611);
                        var4.field1611 = null;
                    }
                    if (var4.field1606 != null) {
                        Statics.field1493.method2185(var4.field1606);
                        var4.field1606 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field2173 * (var4.field1610 - var5) / var4.field1610;
                    if (var4.field1611 != null) {
                        var4.field1611.method2059(var6);
                    } else if (var4.field1608 >= 0) {
                        class22 var7 = class22.method263(Statics.field51, var4.field1608, 0);
                        if (var7 != null) {
                            class146 var8 = var7.method256().method2051(Statics.field810);
                            class147 var9 = class147.method2055(var8, 100, var6);
                            var9.method2058(-1);
                            Statics.field1493.method2194(var9);
                            var4.field1611 = var9;
                        }
                    }
                    if (var4.field1606 != null) {
                        var4.field1606.method2059(var6);
                        if (!var4.field1606.method1327()) {
                            var4.field1606 = null;
                        }
                    } else if (var4.field1614 != null && (var4.field1615 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1614.length);
                        class22 var11 = class22.method263(Statics.field51, var4.field1614[var10], 0);
                        if (var11 != null) {
                            class146 var12 = var11.method256().method2051(Statics.field810);
                            class147 var13 = class147.method2055(var12, 100, var6);
                            var13.method2058(0);
                            Statics.field1493.method2194(var13);
                            var4.field1606 = var13;
                            var4.field1615 = var4.field1612 + (int) (Math.random() * (double) (var4.field1609 - var4.field1612));
                        }
                    }
                }
            }
        }
    }
}
