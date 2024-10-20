package deob;

@ObfuscatedName("a")
public class class13 extends class128 {

    @ObfuscatedName("a.b")
    public static class126 field137 = new class126(32);

    @ObfuscatedName("a.e")
    public int[] field141 = new int[] { -1 };

    @ObfuscatedName("a.c")
    public int[] field136 = new int[] { 0 };

    @ObfuscatedName("du.e(III)I")
    public static int method2110(int arg0, int arg1) {
        class13 var2 = (class13) field137.method2259((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field136.length) {
            return var2.field136[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("a.c(IIS)I")
    public static int method186(int arg0, int arg1) {
        class13 var2 = (class13) field137.method2259((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field136.length; var4++) {
                if (var2.field141[var4] == arg1) {
                    var3 += var2.field136[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("n.l(IIIII)V")
    public static void method217(int arg0, int arg1, int arg2, int arg3) {
        class13 var4 = (class13) field137.method2259((long) arg0);
        if (var4 == null) {
            var4 = new class13();
            field137.method2267(var4, (long) arg0);
        }
        if (var4.field141.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field141.length; var7++) {
                var5[var7] = var4.field141[var7];
                var6[var7] = var4.field136[var7];
            }
            for (int var8 = var4.field141.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field141 = var5;
            var4.field136 = var6;
        }
        var4.field141[arg1] = arg2;
        var4.field136[arg1] = arg3;
    }

    @ObfuscatedName("r.y(II)V")
    public static void method104(int arg0) {
        class13 var1 = (class13) field137.method2259((long) arg0);
        if (var1 != null) {
            var1.method2298();
        }
    }
}
