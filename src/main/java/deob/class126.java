package deob;

@ObfuscatedName("dn")
public class class126 extends class106 {

    @ObfuscatedName("dn.h")
    public static class103 field1624 = new class103(32);

    @ObfuscatedName("dn.k")
    public int[] field1623 = new int[] { -1 };

    @ObfuscatedName("dn.r")
    public int[] field1625 = new int[] { 0 };

    @ObfuscatedName("cc.r(III)I")
    public static int method1128(int arg0, int arg1) {
        class126 var2 = (class126) field1624.method1259((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1623.length) {
            return var2.field1623[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ar.i(IIIII)V")
    public static void method508(int arg0, int arg1, int arg2, int arg3) {
        class126 var4 = (class126) field1624.method1259((long) arg0);
        if (var4 == null) {
            var4 = new class126();
            field1624.method1265(var4, (long) arg0);
        }
        if (var4.field1623.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1623.length; var7++) {
                var5[var7] = var4.field1623[var7];
                var6[var7] = var4.field1625[var7];
            }
            for (int var8 = var4.field1623.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1623 = var5;
            var4.field1625 = var6;
        }
        var4.field1623[arg1] = arg2;
        var4.field1625[arg1] = arg3;
    }

    @ObfuscatedName("an.e(II)V")
    public static void method695(int arg0) {
        class126 var1 = (class126) field1624.method1259((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1623.length; var2++) {
                var1.field1623[var2] = -1;
                var1.field1625[var2] = 0;
            }
        }
    }

    @ObfuscatedName("ay.a(I)V")
    public static void method541() {
        field1624 = new class103(32);
    }
}
