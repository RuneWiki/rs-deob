package deob;

@ObfuscatedName("fz")
public class class1 {

    @ObfuscatedName("fz.b")
    public static int[] field4;

    @ObfuscatedName("fz.c")
    public static int[] field2;

    @ObfuscatedName("fz.v")
    public static int[] field3 = new int[32];

    public class1() throws Throwable {
        throw new Error();
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3[var1] = var0 - 1;
            var0 += var0;
        }
        field2 = new int[2000];
        field4 = new int[2000];
    }

    @ObfuscatedName("dg.c(III)V")
    public static void method730(int arg0, int arg1) {
        class174 var2 = (class174) class174.field2671.method1196((long) arg0);
        class174 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2670.method1298(14, arg0);
            class174 var5 = new class174();
            if (var4 != null) {
                var5.method3146(new class28(var4));
            }
            class174.field2671.method1184(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field2672;
        int var8 = var3.field2673;
        int var9 = var3.field2674;
        int var10 = field3[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field4[var7] = field4[var7] & ~var11 | arg1 << var8 & var11;
    }

    @ObfuscatedName("b.v(IB)I")
    public static int method945(int arg0) {
        class174 var1 = (class174) class174.field2671.method1196((long) arg0);
        class174 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field2670.method1298(14, arg0);
            class174 var4 = new class174();
            if (var3 != null) {
                var4.method3146(new class28(var3));
            }
            class174.field2671.method1184(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field2672;
        int var7 = var2.field2673;
        int var8 = var2.field2674;
        int var9 = field3[var8 - var7];
        return field4[var6] >> var7 & var9;
    }
}
