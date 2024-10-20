package deob;

@ObfuscatedName("y")
public class class13 extends class128 {

    @ObfuscatedName("y.n")
    public static class126 field123 = new class126(32);

    @ObfuscatedName("y.d")
    public int[] field121 = new int[] { -1 };

    @ObfuscatedName("y.m")
    public int[] field122 = new int[] { 0 };

    @ObfuscatedName("t.n(IIS)I")
    public static int method606(int arg0, int arg1) {
        class13 var2 = (class13) field123.method2229((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field121.length) {
            return var2.field121[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("g.d(IIB)I")
    public static int method106(int arg0, int arg1) {
        class13 var2 = (class13) field123.method2229((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field122.length) {
            return var2.field122[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("d.m(IIIIB)V")
    public static void method20(int arg0, int arg1, int arg2, int arg3) {
        class13 var4 = (class13) field123.method2229((long) arg0);
        if (var4 == null) {
            var4 = new class13();
            field123.method2230(var4, (long) arg0);
        }
        if (var4.field121.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field121.length; var7++) {
                var5[var7] = var4.field121[var7];
                var6[var7] = var4.field122[var7];
            }
            for (int var8 = var4.field121.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field121 = var5;
            var4.field122 = var6;
        }
        var4.field121[arg1] = arg2;
        var4.field122[arg1] = arg3;
    }

    @ObfuscatedName("ar.h(IS)V")
    public static void method866(int arg0) {
        class13 var1 = (class13) field123.method2229((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field121.length; var2++) {
                var1.field121[var2] = -1;
                var1.field122[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ez.w(I)V")
    public static void method2357() {
        field123 = new class126(32);
    }
}
