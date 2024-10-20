package deob;

@ObfuscatedName("q")
public class class13 extends class128 {

    @ObfuscatedName("q.u")
    public static class126 field132 = new class126(32);

    @ObfuscatedName("q.x")
    public int[] field135 = new int[] { -1 };

    @ObfuscatedName("q.i")
    public int[] field131 = new int[] { 0 };

    @ObfuscatedName("c.u(III)I")
    public static int method76(int arg0, int arg1) {
        class13 var2 = (class13) field132.method2190((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field135.length) {
            return var2.field135[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("u.x(IIIII)V")
    public static void method2(int arg0, int arg1, int arg2, int arg3) {
        class13 var4 = (class13) field132.method2190((long) arg0);
        if (var4 == null) {
            var4 = new class13();
            field132.method2191(var4, (long) arg0);
        }
        if (var4.field135.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field135.length; var7++) {
                var5[var7] = var4.field135[var7];
                var6[var7] = var4.field131[var7];
            }
            for (int var8 = var4.field135.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field135 = var5;
            var4.field131 = var6;
        }
        var4.field135[arg1] = arg2;
        var4.field131[arg1] = arg3;
    }

    @ObfuscatedName("bi.i(II)V")
    public static void method1080(int arg0) {
        class13 var1 = (class13) field132.method2190((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field135.length; var2++) {
                var1.field135[var2] = -1;
                var1.field131[var2] = 0;
            }
        }
    }

    @ObfuscatedName("fm.a(II)V")
    public static void method3036(int arg0) {
        class13 var1 = (class13) field132.method2190((long) arg0);
        if (var1 != null) {
            var1.method2228();
        }
    }
}
