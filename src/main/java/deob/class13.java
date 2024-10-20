package deob;

@ObfuscatedName("i")
public class class13 extends class128 {

    @ObfuscatedName("i.k")
    public static class126 field122 = new class126(32);

    @ObfuscatedName("i.y")
    public int[] field123 = new int[] { -1 };

    @ObfuscatedName("i.o")
    public int[] field118 = new int[] { 0 };

    @ObfuscatedName("c.k(III)I")
    public static int method123(int arg0, int arg1) {
        class13 var2 = (class13) field122.method2171((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field123.length) {
            return var2.field123[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("fz.y(IIB)I")
    public static int method3056(int arg0, int arg1) {
        class13 var2 = (class13) field122.method2171((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field118.length) {
            return var2.field118[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("q.o(IIIII)V")
    public static void method95(int arg0, int arg1, int arg2, int arg3) {
        class13 var4 = (class13) field122.method2171((long) arg0);
        if (var4 == null) {
            var4 = new class13();
            field122.method2173(var4, (long) arg0);
        }
        if (var4.field123.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field123.length; var7++) {
                var5[var7] = var4.field123[var7];
                var6[var7] = var4.field118[var7];
            }
            for (int var8 = var4.field123.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field123 = var5;
            var4.field118 = var6;
        }
        var4.field123[arg1] = arg2;
        var4.field118[arg1] = arg3;
    }

    @ObfuscatedName("cl.r(II)V")
    public static void method1794(int arg0) {
        class13 var1 = (class13) field122.method2171((long) arg0);
        if (var1 != null) {
            var1.method2214();
        }
    }

    @ObfuscatedName("ab.w(I)V")
    public static void method823() {
        field122 = new class126(32);
    }
}
