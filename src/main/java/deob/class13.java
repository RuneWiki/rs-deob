package deob;

@ObfuscatedName("r")
public class class13 extends class149 {

    @ObfuscatedName("r.d")
    public static class147 field133 = new class147(32);

    @ObfuscatedName("r.c")
    public int[] field122 = new int[] { -1 };

    @ObfuscatedName("r.n")
    public int[] field127 = new int[] { 0 };

    @ObfuscatedName("gq.d(III)I")
    public static int method3386(int arg0, int arg1) {
        class13 var2 = (class13) field133.method2611((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field122.length) {
            return var2.field122[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ax.c(III)I")
    public static int method591(int arg0, int arg1) {
        class13 var2 = (class13) field133.method2611((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field127.length) {
            return var2.field127[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ct.n(IIIIB)V")
    public static void method1632(int arg0, int arg1, int arg2, int arg3) {
        class13 var4 = (class13) field133.method2611((long) arg0);
        if (var4 == null) {
            var4 = new class13();
            field133.method2612(var4, (long) arg0);
        }
        if (var4.field122.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field122.length; var7++) {
                var5[var7] = var4.field122[var7];
                var6[var7] = var4.field127[var7];
            }
            for (int var8 = var4.field122.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field122 = var5;
            var4.field127 = var6;
        }
        var4.field122[arg1] = arg2;
        var4.field127[arg1] = arg3;
    }

    @ObfuscatedName("s.q(IB)V")
    public static void method179(int arg0) {
        class13 var1 = (class13) field133.method2611((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field122.length; var2++) {
                var1.field122[var2] = -1;
                var1.field127[var2] = 0;
            }
        }
    }

    @ObfuscatedName("an.t(II)V")
    public static void method867(int arg0) {
        class13 var1 = (class13) field133.method2611((long) arg0);
        if (var1 != null) {
            var1.method2652();
        }
    }
}
