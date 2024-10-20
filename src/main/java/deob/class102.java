package deob;

@ObfuscatedName("cy")
public class class102 extends class185 {

    @ObfuscatedName("cy.z")
    public static class155 field1309 = new class155(128);

    @ObfuscatedName("cy.k")
    public int[] field1308;

    @ObfuscatedName("cy.s")
    public int[] field1316;

    @ObfuscatedName("cy.t")
    public String[] field1310;

    @ObfuscatedName("cy.i")
    public int field1311;

    @ObfuscatedName("cy.o")
    public int field1315;

    @ObfuscatedName("cy.x")
    public int field1313;

    @ObfuscatedName("cy.w")
    public int field1314;

    @ObfuscatedName("cy.g")
    public class326[] field1312;

    @ObfuscatedName("am.z(II)Lcy;")
    public static class102 method319(int arg0) {
        class102 var1 = (class102) field1309.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field630.method3873(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class102 var3 = method3241(var2);
            field1309.method3169(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("gg.k(IIIB)Lcy;")
    public static class102 method3471(int arg0, int arg1, int arg2) {
        int var3 = class232.method95(arg1, arg0);
        class102 var4 = (class102) field1309.method3170((long) (var3 << 16));
        class102 var5;
        if (var4 == null) {
            String var6 = String.valueOf(var3);
            int var7 = Statics.field630.method3909(var6);
            if (var7 == -1) {
                var5 = null;
            } else {
                label47: {
                    byte[] var8 = Statics.field630.method3879(var7);
                    if (var8 != null) {
                        if (var8.length <= 1) {
                            var5 = null;
                            break label47;
                        }
                        class102 var9 = method3241(var8);
                        if (var9 != null) {
                            field1309.method3169(var9, (long) (var3 << 16));
                            var5 = var9;
                            break label47;
                        }
                    }
                    var5 = null;
                }
            }
        } else {
            var5 = var4;
        }
        if (var5 != null) {
            return var5;
        }
        int var11 = (arg2 + 40000 << 8) + arg0;
        class102 var13 = (class102) field1309.method3170((long) (var11 << 16));
        class102 var14;
        if (var13 == null) {
            String var15 = String.valueOf(var11);
            int var16 = Statics.field630.method3909(var15);
            if (var16 == -1) {
                var14 = null;
            } else {
                byte[] var17 = Statics.field630.method3879(var16);
                if (var17 != null) {
                    if (var17.length <= 1) {
                        var14 = null;
                        return var14 == null ? null : var14;
                    }
                    class102 var18 = method3241(var17);
                    if (var18 != null) {
                        field1309.method3169(var18, (long) (var11 << 16));
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

    @ObfuscatedName("fe.s([BS)Lcy;")
    public static class102 method3241(byte[] arg0) {
        class102 var1 = new class102();
        class310 var2 = new class310(arg0);
        var2.field3734 = var2.field3731.length - 2;
        int var3 = var2.method5195();
        int var4 = var2.field3731.length - 2 - var3 - 12;
        var2.field3734 = var4;
        int var5 = var2.method5270();
        var1.field1311 = var2.method5195();
        var1.field1315 = var2.method5195();
        var1.field1313 = var2.method5195();
        var1.field1314 = var2.method5195();
        int var6 = var2.method5193();
        if (var6 > 0) {
            var1.field1312 = var1.method2123(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method5195();
                class326 var9 = new class326(var8 > 0 ? class198.method4962(var8) : 1);
                var1.field1312[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method5270();
                    int var11 = var2.method5270();
                    var9.method5583(new class189(var11), (long) var10);
                }
            }
        }
        var2.field3734 = 0;
        var2.method5201();
        var1.field1308 = new int[var5];
        var1.field1316 = new int[var5];
        var1.field1310 = new String[var5];
        int var12 = 0;
        while (var2.field3734 < var4) {
            int var13 = var2.method5195();
            if (var13 == 3) {
                var1.field1310[var12] = var2.method5202();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1316[var12] = var2.method5193();
            } else {
                var1.field1316[var12] = var2.method5270();
            }
            var1.field1308[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cy.t(II)[Llq;")
    public class326[] method2123(int arg0) {
        return new class326[arg0];
    }
}
