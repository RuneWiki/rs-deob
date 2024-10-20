package deob;

@ObfuscatedName("u")
public class class13 extends class128 {

    @ObfuscatedName("u.q")
    public static class126 field145 = new class126(32);

    @ObfuscatedName("u.d")
    public int[] field139 = new int[] { -1 };

    @ObfuscatedName("u.h")
    public int[] field140 = new int[] { 0 };

    @ObfuscatedName("bi.q(III)I")
    public static int method1424(int arg0, int arg1) {
        class13 var2 = (class13) field145.method2260((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field140.length) {
            return var2.field140[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bd.d(IIB)I")
    public static int method1142(int arg0, int arg1) {
        class13 var2 = (class13) field145.method2260((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field140.length; var4++) {
                if (var2.field139[var4] == arg1) {
                    var3 += var2.field140[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ad.h(IIIII)V")
    public static void method706(int arg0, int arg1, int arg2, int arg3) {
        class13 var4 = (class13) field145.method2260((long) arg0);
        if (var4 == null) {
            var4 = new class13();
            field145.method2261(var4, (long) arg0);
        }
        if (var4.field139.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field139.length; var7++) {
                var5[var7] = var4.field139[var7];
                var6[var7] = var4.field140[var7];
            }
            for (int var8 = var4.field139.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field139 = var5;
            var4.field140 = var6;
        }
        var4.field139[arg1] = arg2;
        var4.field140[arg1] = arg3;
    }

    @ObfuscatedName("em.p(II)V")
    public static void method2600(int arg0) {
        class13 var1 = (class13) field145.method2260((long) arg0);
        if (var1 != null) {
            var1.method2310();
        }
    }
}
