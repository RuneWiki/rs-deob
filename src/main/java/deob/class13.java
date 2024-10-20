package deob;

@ObfuscatedName("l")
public class class13 extends class128 {

    @ObfuscatedName("l.i")
    public static class126 field126 = new class126(32);

    @ObfuscatedName("l.e")
    public int[] field125 = new int[] { -1 };

    @ObfuscatedName("l.f")
    public int[] field127 = new int[] { 0 };

    @ObfuscatedName("aw.i(IIB)I")
    public static int method659(int arg0, int arg1) {
        class13 var2 = (class13) field126.method2161((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field125.length) {
            return var2.field125[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("cf.e(III)I")
    public static int method1787(int arg0, int arg1) {
        class13 var2 = (class13) field126.method2161((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field127.length) {
            return var2.field127[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("au.f(IIIII)V")
    public static void method854(int arg0, int arg1, int arg2, int arg3) {
        class13 var4 = (class13) field126.method2161((long) arg0);
        if (var4 == null) {
            var4 = new class13();
            field126.method2162(var4, (long) arg0);
        }
        if (var4.field125.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field125.length; var7++) {
                var5[var7] = var4.field125[var7];
                var6[var7] = var4.field127[var7];
            }
            for (int var8 = var4.field125.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field125 = var5;
            var4.field127 = var6;
        }
        var4.field125[arg1] = arg2;
        var4.field127[arg1] = arg3;
    }

    @ObfuscatedName("p.k(B)V")
    public static void method151() {
        field126 = new class126(32);
    }
}
