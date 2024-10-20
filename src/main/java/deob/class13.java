package deob;

@ObfuscatedName("h")
public class class13 extends class128 {

    @ObfuscatedName("h.p")
    public static class126 field115 = new class126(32);

    @ObfuscatedName("h.g")
    public int[] field116 = new int[] { -1 };

    @ObfuscatedName("h.x")
    public int[] field120 = new int[] { 0 };

    @ObfuscatedName("d.p(III)I")
    public static int method48(int arg0, int arg1) {
        class13 var2 = (class13) field115.method2199((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field116.length) {
            return var2.field116[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("du.g(III)I")
    public static int method2079(int arg0, int arg1) {
        class13 var2 = (class13) field115.method2199((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field120.length; var4++) {
                if (var2.field116[var4] == arg1) {
                    var3 += var2.field120[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("fd.x(IIIII)V")
    public static void method2929(int arg0, int arg1, int arg2, int arg3) {
        class13 var4 = (class13) field115.method2199((long) arg0);
        if (var4 == null) {
            var4 = new class13();
            field115.method2189(var4, (long) arg0);
        }
        if (var4.field116.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field116.length; var7++) {
                var5[var7] = var4.field116[var7];
                var6[var7] = var4.field120[var7];
            }
            for (int var8 = var4.field116.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field116 = var5;
            var4.field120 = var6;
        }
        var4.field116[arg1] = arg2;
        var4.field120[arg1] = arg3;
    }

    @ObfuscatedName("gj.q(II)V")
    public static void method3206(int arg0) {
        class13 var1 = (class13) field115.method2199((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field116.length; var2++) {
                var1.field116[var2] = -1;
                var1.field120[var2] = 0;
            }
        }
    }
}
