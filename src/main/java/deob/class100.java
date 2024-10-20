package deob;

@ObfuscatedName("cv")
public class class100 extends class195 {

    @ObfuscatedName("cv.c")
    public static class190 field1507 = new class190(128);

    @ObfuscatedName("cv.o")
    public int[] field1500;

    @ObfuscatedName("cv.i")
    public int[] field1501;

    @ObfuscatedName("cv.u")
    public String[] field1502;

    @ObfuscatedName("cv.g")
    public int field1499;

    @ObfuscatedName("cv.m")
    public int field1506;

    @ObfuscatedName("cv.s")
    public int field1505;

    @ObfuscatedName("cv.x")
    public int field1504;

    @ObfuscatedName("cv.p")
    public class187[] field1503;

    @ObfuscatedName("cy.c(Lhg;III)Lcv;")
    public static class100 method1445(class220 arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0.field2770;
        class100 var5 = (class100) field1507.method3220((long) (var3 << 16));
        class100 var6;
        if (var5 == null) {
            String var7 = String.valueOf(var3);
            int var8 = Statics.field272.method3730(var7);
            if (var8 == -1) {
                var6 = null;
            } else {
                label47: {
                    byte[] var9 = Statics.field272.method3720(var8);
                    if (var9 != null) {
                        if (var9.length <= 1) {
                            var6 = null;
                            break label47;
                        }
                        class100 var10 = method946(var9);
                        if (var10 != null) {
                            field1507.method3233(var10, (long) (var3 << 16));
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
        int var12 = (arg2 + 40000 << 8) + arg0.field2770;
        class100 var14 = (class100) field1507.method3220((long) (var12 << 16));
        class100 var15;
        if (var14 == null) {
            String var16 = String.valueOf(var12);
            int var17 = Statics.field272.method3730(var16);
            if (var17 == -1) {
                var15 = null;
            } else {
                byte[] var18 = Statics.field272.method3720(var17);
                if (var18 != null) {
                    if (var18.length <= 1) {
                        var15 = null;
                        return var15 == null ? null : var15;
                    }
                    class100 var19 = method946(var18);
                    if (var19 != null) {
                        field1507.method3233(var19, (long) (var12 << 16));
                        var15 = var19;
                        return var15 == null ? null : var15;
                    }
                }
                var15 = null;
            }
        } else {
            var15 = var14;
        }
        return var15 == null ? null : var15;
    }

    @ObfuscatedName("bs.o([BI)Lcv;")
    public static class100 method946(byte[] arg0) {
        class100 var1 = new class100();
        class174 var2 = new class174(arg0);
        var2.field2357 = var2.field2355.length - 2;
        int var3 = var2.method2861();
        int var4 = var2.field2355.length - 2 - var3 - 12;
        var2.field2357 = var4;
        int var5 = var2.method2987();
        var1.field1499 = var2.method2861();
        var1.field1506 = var2.method2861();
        var1.field1505 = var2.method2861();
        var1.field1504 = var2.method2861();
        int var6 = var2.method2843();
        if (var6 > 0) {
            var1.field1503 = var1.method1648(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method2861();
                class187 var9 = new class187(class178.method522(var8));
                var1.field1503[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method2987();
                    int var11 = var2.method2987();
                    var9.method3189(new class199(var11), (long) var10);
                }
            }
        }
        var2.field2357 = 0;
        var2.method2866();
        var1.field1500 = new int[var5];
        var1.field1501 = new int[var5];
        var1.field1502 = new String[var5];
        int var12 = 0;
        while (var2.field2357 < var4) {
            int var13 = var2.method2861();
            if (var13 == 3) {
                var1.field1502[var12] = var2.method2867();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1501[var12] = var2.method2843();
            } else {
                var1.field1501[var12] = var2.method2987();
            }
            var1.field1500[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cv.i(II)[Lgk;")
    public class187[] method1648(int arg0) {
        return new class187[arg0];
    }
}
