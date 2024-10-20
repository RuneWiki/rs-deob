package deob;

@ObfuscatedName("j")
public class class13 extends class128 {

    @ObfuscatedName("j.o")
    public static class126 field119 = new class126(32);

    @ObfuscatedName("j.m")
    public int[] field117 = new int[] { -1 };

    @ObfuscatedName("j.b")
    public int[] field116 = new int[] { 0 };

    @ObfuscatedName("ge.o(IIB)I")
    public static int method3568(int arg0, int arg1) {
        class13 var2 = (class13) field119.method2151((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field116.length; var4++) {
                if (var2.field117[var4] == arg1) {
                    var3 += var2.field116[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ar.m(IIIIB)V")
    public static void method736(int arg0, int arg1, int arg2, int arg3) {
        class13 var4 = (class13) field119.method2151((long) arg0);
        if (var4 == null) {
            var4 = new class13();
            field119.method2143(var4, (long) arg0);
        }
        if (var4.field117.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field117.length; var7++) {
                var5[var7] = var4.field117[var7];
                var6[var7] = var4.field116[var7];
            }
            for (int var8 = var4.field117.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field117 = var5;
            var4.field116 = var6;
        }
        var4.field117[arg1] = arg2;
        var4.field116[arg1] = arg3;
    }

    @ObfuscatedName("y.b(II)V")
    public static void method145(int arg0) {
        class13 var1 = (class13) field119.method2151((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field117.length; var2++) {
                var1.field117[var2] = -1;
                var1.field116[var2] = 0;
            }
        }
    }

    @ObfuscatedName("az.g(I)V")
    public static void method787() {
        field119 = new class126(32);
    }
}
