package deob;

@ObfuscatedName("p")
public class class13 extends class128 {

    @ObfuscatedName("p.b")
    public static class126 field127 = new class126(32);

    @ObfuscatedName("p.l")
    public int[] field121 = new int[] { -1 };

    @ObfuscatedName("p.i")
    public int[] field122 = new int[] { 0 };

    @ObfuscatedName("i.b(IIB)I")
    public static int method32(int arg0, int arg1) {
        class13 var2 = (class13) field127.method2280((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field121.length) {
            return var2.field121[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ht.l(III)I")
    public static int method4116(int arg0, int arg1) {
        class13 var2 = (class13) field127.method2280((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field122.length; var4++) {
                if (var2.field121[var4] == arg1) {
                    var3 += var2.field122[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("t.i(IIIIB)V")
    public static void method44(int arg0, int arg1, int arg2, int arg3) {
        class13 var4 = (class13) field127.method2280((long) arg0);
        if (var4 == null) {
            var4 = new class13();
            field127.method2277(var4, (long) arg0);
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

    @ObfuscatedName("bs.t(II)V")
    public static void method1438(int arg0) {
        class13 var1 = (class13) field127.method2280((long) arg0);
        if (var1 != null) {
            var1.method2313();
        }
    }

    @ObfuscatedName("fv.k(I)V")
    public static void method3031() {
        field127 = new class126(32);
    }
}
