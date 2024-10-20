package deob;

@ObfuscatedName("cs")
public class class102 extends class185 {

    @ObfuscatedName("cs.h")
    public static class155 field1300 = new class155(128);

    @ObfuscatedName("cs.v")
    public int[] field1301;

    @ObfuscatedName("cs.x")
    public int[] field1295;

    @ObfuscatedName("cs.w")
    public String[] field1296;

    @ObfuscatedName("cs.t")
    public int field1297;

    @ObfuscatedName("cs.j")
    public int field1298;

    @ObfuscatedName("cs.n")
    public int field1299;

    @ObfuscatedName("cs.p")
    public int field1293;

    @ObfuscatedName("cs.l")
    public class327[] field1306;

    @ObfuscatedName("co.h(II)Lcs;")
    public static class102 method2150(int arg0) {
        class102 var1 = (class102) field1300.method3147((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2362.method3834(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class102 var3 = method1668(var2);
            field1300.method3145(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("ct.v(IIIS)Lcs;")
    public static class102 method2023(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class102 var5 = (class102) field1300.method3147((long) (var3 << 16));
        class102 var6;
        if (var5 == null) {
            String var7 = String.valueOf(var3);
            int var8 = Statics.field2362.method3880(var7);
            if (var8 == -1) {
                var6 = null;
            } else {
                label47: {
                    byte[] var9 = Statics.field2362.method3841(var8);
                    if (var9 != null) {
                        if (var9.length <= 1) {
                            var6 = null;
                            break label47;
                        }
                        class102 var10 = method1668(var9);
                        if (var10 != null) {
                            field1300.method3145(var10, (long) (var3 << 16));
                            var6 = var10;
                            break label47;
                        }
                    }
                    var6 = null;
                }
            }
        } else {
            var6 = var5;
        }
        if (var6 != null) {
            return var6;
        }
        int var12 = class232.method3611(arg2, arg0);
        class102 var13 = (class102) field1300.method3147((long) (var12 << 16));
        class102 var14;
        if (var13 == null) {
            String var15 = String.valueOf(var12);
            int var16 = Statics.field2362.method3880(var15);
            if (var16 == -1) {
                var14 = null;
            } else {
                byte[] var17 = Statics.field2362.method3841(var16);
                if (var17 != null) {
                    if (var17.length <= 1) {
                        var14 = null;
                        return var14 == null ? null : var14;
                    }
                    class102 var18 = method1668(var17);
                    if (var18 != null) {
                        field1300.method3145(var18, (long) (var12 << 16));
                        var14 = var18;
                        return var14 == null ? null : var14;
                    }
                }
                var14 = null;
            }
        } else {
            var14 = var13;
        }
        return var14 == null ? null : var14;
    }

    @ObfuscatedName("cx.x([BB)Lcs;")
    public static class102 method1668(byte[] arg0) {
        class102 var1 = new class102();
        class311 var2 = new class311(arg0);
        var2.field3752 = var2.field3753.length - 2;
        int var3 = var2.method5342();
        int var4 = var2.field3753.length - 2 - var3 - 12;
        var2.field3752 = var4;
        int var5 = var2.method5120();
        var1.field1297 = var2.method5342();
        var1.field1298 = var2.method5342();
        var1.field1299 = var2.method5342();
        var1.field1293 = var2.method5342();
        int var6 = var2.method5274();
        if (var6 > 0) {
            var1.field1306 = var1.method2122(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method5342();
                class327 var9 = new class327(var8 > 0 ? class198.method1722(var8) : 1);
                var1.field1306[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method5120();
                    int var11 = var2.method5120();
                    var9.method5503(new class189(var11), (long) var10);
                }
            }
        }
        var2.field3752 = 0;
        var2.method5209();
        var1.field1301 = new int[var5];
        var1.field1295 = new int[var5];
        var1.field1296 = new String[var5];
        int var12 = 0;
        while (var2.field3752 < var4) {
            int var13 = var2.method5342();
            if (var13 == 3) {
                var1.field1296[var12] = var2.method5202();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1295[var12] = var2.method5274();
            } else {
                var1.field1295[var12] = var2.method5120();
            }
            var1.field1301[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cs.w(II)[Lla;")
    public class327[] method2122(int arg0) {
        return new class327[arg0];
    }
}
