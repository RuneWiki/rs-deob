package deob;

@ObfuscatedName("f")
public class class13 extends class128 {

    @ObfuscatedName("f.x")
    public static class126 field113 = new class126(32);

    @ObfuscatedName("f.n")
    public int[] field109 = new int[] { -1 };

    @ObfuscatedName("f.g")
    public int[] field114 = new int[] { 0 };

    @ObfuscatedName("cb.x(III)I")
    public static int method1897(int arg0, int arg1) {
        class13 var2 = (class13) field113.method2286((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field109.length) {
            return var2.field109[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("dk.n(III)I")
    public static int method2182(int arg0, int arg1) {
        class13 var2 = (class13) field113.method2286((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field114.length) {
            return var2.field114[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("i.g(IIIIB)V")
    public static void method113(int arg0, int arg1, int arg2, int arg3) {
        class13 var4 = (class13) field113.method2286((long) arg0);
        if (var4 == null) {
            var4 = new class13();
            field113.method2287(var4, (long) arg0);
        }
        if (var4.field109.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field109.length; var7++) {
                var5[var7] = var4.field109[var7];
                var6[var7] = var4.field114[var7];
            }
            for (int var8 = var4.field109.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field109 = var5;
            var4.field114 = var6;
        }
        var4.field109[arg1] = arg2;
        var4.field114[arg1] = arg3;
    }

    @ObfuscatedName("ft.v(II)V")
    public static void method3142(int arg0) {
        class13 var1 = (class13) field113.method2286((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field109.length; var2++) {
                var1.field109[var2] = -1;
                var1.field114[var2] = 0;
            }
        }
    }

    @ObfuscatedName("c.y(II)V")
    public static void method193(int arg0) {
        class13 var1 = (class13) field113.method2286((long) arg0);
        if (var1 != null) {
            var1.method2327();
        }
    }
}
