package deob;

@ObfuscatedName("b")
public class class13 extends class176 {

    @ObfuscatedName("b.z")
    public static class169 field205 = new class169(32);

    @ObfuscatedName("b.n")
    public int[] field199 = new int[] { -1 };

    @ObfuscatedName("b.u")
    public int[] field200 = new int[] { 0 };

    @ObfuscatedName("p.z(IIB)I")
    public static int method554(int arg0, int arg1) {
        class13 var2 = (class13) field205.method3208((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field199.length) {
            return var2.field199[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("m.n(III)I")
    public static int method503(int arg0, int arg1) {
        class13 var2 = (class13) field205.method3208((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field200.length) {
            return var2.field200[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("c.u(IIB)I")
    public static int method525(int arg0, int arg1) {
        class13 var2 = (class13) field205.method3208((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field200.length; var4++) {
                if (var2.field199[var4] == arg1) {
                    var3 += var2.field200[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ae.t(IIIII)V")
    public static void method794(int arg0, int arg1, int arg2, int arg3) {
        class13 var4 = (class13) field205.method3208((long) arg0);
        if (var4 == null) {
            var4 = new class13();
            field205.method3210(var4, (long) arg0);
        }
        if (var4.field199.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field199.length; var7++) {
                var5[var7] = var4.field199[var7];
                var6[var7] = var4.field200[var7];
            }
            for (int var8 = var4.field199.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field199 = var5;
            var4.field200 = var6;
        }
        var4.field199[arg1] = arg2;
        var4.field200[arg1] = arg3;
    }

    @ObfuscatedName("q.e(IB)V")
    public static void method522(int arg0) {
        class13 var1 = (class13) field205.method3208((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field199.length; var2++) {
                var1.field199[var2] = -1;
                var1.field200[var2] = 0;
            }
        }
    }

    @ObfuscatedName("client.a(II)V")
    public static void method495(int arg0) {
        class13 var1 = (class13) field205.method3208((long) arg0);
        if (var1 != null) {
            var1.method3288();
        }
    }

    @ObfuscatedName("gc.l(I)V")
    public static void method3414() {
        field205 = new class169(32);
    }
}
