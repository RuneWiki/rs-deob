package deob;

@ObfuscatedName("cl")
public class class102 extends class185 {

    @ObfuscatedName("cl.n")
    public static class155 field1299 = new class155(128);

    @ObfuscatedName("cl.v")
    public int[] field1294;

    @ObfuscatedName("cl.d")
    public int[] field1302;

    @ObfuscatedName("cl.c")
    public String[] field1296;

    @ObfuscatedName("cl.y")
    public int field1293;

    @ObfuscatedName("cl.h")
    public int field1298;

    @ObfuscatedName("cl.z")
    public int field1297;

    @ObfuscatedName("cl.e")
    public int field1300;

    @ObfuscatedName("cl.q")
    public class327[] field1301;

    @ObfuscatedName("cg.n(IB)Lcl;")
    public static class102 method2170(int arg0) {
        class102 var1 = (class102) field1299.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field183.method4032(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class102 var3 = method3192(var2);
            field1299.method3217(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("f.v(IIIB)Lcl;")
    public static class102 method137(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class102 var5 = method36(var3, arg0);
        if (var5 == null) {
            int var6 = (arg2 + 40000 << 8) + arg0;
            class102 var8 = method36(var6, arg0);
            return var8 == null ? null : var8;
        } else {
            return var5;
        }
    }

    @ObfuscatedName("y.d(III)Lcl;")
    public static class102 method36(int arg0, int arg1) {
        class102 var2 = (class102) field1299.method3220((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field183.method4001(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field183.method3990(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class102 var6 = method3192(var5);
            if (var6 != null) {
                field1299.method3217(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("ej.c([BI)Lcl;")
    public static class102 method3192(byte[] arg0) {
        class102 var1 = new class102();
        class311 var2 = new class311(arg0);
        var2.field3747 = var2.field3746.length - 2;
        int var3 = var2.method5247();
        int var4 = var2.field3746.length - 2 - var3 - 12;
        var2.field3747 = var4;
        int var5 = var2.method5455();
        var1.field1293 = var2.method5247();
        var1.field1298 = var2.method5247();
        var1.field1297 = var2.method5247();
        var1.field1300 = var2.method5247();
        int var6 = var2.method5310();
        if (var6 > 0) {
            var1.field1301 = var1.method2198(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method5247();
                class327 var9 = new class327(var8 > 0 ? class198.method3190(var8) : 1);
                var1.field1301[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method5455();
                    int var11 = var2.method5455();
                    var9.method5649(new class189(var11), (long) var10);
                }
            }
        }
        var2.field3747 = 0;
        var2.method5253();
        var1.field1294 = new int[var5];
        var1.field1302 = new int[var5];
        var1.field1296 = new String[var5];
        int var12 = 0;
        while (var2.field3747 < var4) {
            int var13 = var2.method5247();
            if (var13 == 3) {
                var1.field1296[var12] = var2.method5465();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1302[var12] = var2.method5310();
            } else {
                var1.field1302[var12] = var2.method5455();
            }
            var1.field1294[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cl.y(II)[Llg;")
    public class327[] method2198(int arg0) {
        return new class327[arg0];
    }
}
