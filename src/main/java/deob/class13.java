package deob;

@ObfuscatedName("v")
public class class13 extends class128 {

    @ObfuscatedName("v.x")
    public static class126 field144 = new class126(32);

    @ObfuscatedName("v.j")
    public int[] field145 = new int[] { -1 };

    @ObfuscatedName("v.c")
    public int[] field147 = new int[] { 0 };

    @ObfuscatedName("j.x(IIS)I")
    public static int method19(int arg0, int arg1) {
        class13 var2 = (class13) field144.method2247((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field147.length; var4++) {
                if (var2.field145[var4] == arg1) {
                    var3 += var2.field147[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ct.j(IIIII)V")
    public static void method1900(int arg0, int arg1, int arg2, int arg3) {
        class13 var4 = (class13) field144.method2247((long) arg0);
        if (var4 == null) {
            var4 = new class13();
            field144.method2245(var4, (long) arg0);
        }
        if (var4.field145.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field145.length; var7++) {
                var5[var7] = var4.field145[var7];
                var6[var7] = var4.field147[var7];
            }
            for (int var8 = var4.field145.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field145 = var5;
            var4.field147 = var6;
        }
        var4.field145[arg1] = arg2;
        var4.field147[arg1] = arg3;
    }

    @ObfuscatedName("eu.c(II)V")
    public static void method2854(int arg0) {
        class13 var1 = (class13) field144.method2247((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field145.length; var2++) {
                var1.field145[var2] = -1;
                var1.field147[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ab.d(IB)V")
    public static void method769(int arg0) {
        class13 var1 = (class13) field144.method2247((long) arg0);
        if (var1 != null) {
            var1.method2278();
        }
    }

    @ObfuscatedName("e.w(I)V")
    public static void method168() {
        field144 = new class126(32);
    }
}
