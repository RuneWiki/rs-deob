package deob;

@ObfuscatedName("co")
public class class102 extends class185 {

    @ObfuscatedName("co.f")
    public static class155 field1316 = new class155(128);

    @ObfuscatedName("co.b")
    public int[] field1318;

    @ObfuscatedName("co.l")
    public int[] field1313;

    @ObfuscatedName("co.m")
    public String[] field1314;

    @ObfuscatedName("co.z")
    public int field1312;

    @ObfuscatedName("co.q")
    public int field1315;

    @ObfuscatedName("co.k")
    public int field1311;

    @ObfuscatedName("co.c")
    public int field1317;

    @ObfuscatedName("co.u")
    public class327[] field1319;

    @ObfuscatedName("ao.f(II)Lco;")
    public static class102 method293(int arg0) {
        class102 var1 = (class102) field1316.method3155((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1780.method3905(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class102 var3 = method3423(var2);
            field1316.method3157(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("at.b(IIII)Lco;")
    public static class102 method649(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class102 var5 = method1081(var3, arg0);
        if (var5 == null) {
            int var6 = (arg2 + 40000 << 8) + arg0;
            class102 var8 = method1081(var6, arg0);
            return var8 == null ? null : var8;
        } else {
            return var5;
        }
    }

    @ObfuscatedName("bq.l(III)Lco;")
    public static class102 method1081(int arg0, int arg1) {
        class102 var2 = (class102) field1316.method3155((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field1780.method3923(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field1780.method3912(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class102 var6 = method3423(var5);
            if (var6 != null) {
                field1316.method3157(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("gz.m([BI)Lco;")
    public static class102 method3423(byte[] arg0) {
        class102 var1 = new class102();
        class311 var2 = new class311(arg0);
        var2.field3741 = var2.field3742.length - 2;
        int var3 = var2.method5163();
        int var4 = var2.field3742.length - 2 - var3 - 12;
        var2.field3741 = var4;
        int var5 = var2.method5330();
        var1.field1312 = var2.method5163();
        var1.field1315 = var2.method5163();
        var1.field1311 = var2.method5163();
        var1.field1317 = var2.method5163();
        int var6 = var2.method5276();
        if (var6 > 0) {
            var1.field1319 = var1.method2146(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method5163();
                class327 var9 = new class327(var8 > 0 ? class198.method234(var8) : 1);
                var1.field1319[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method5330();
                    int var11 = var2.method5330();
                    var9.method5576(new class189(var11), (long) var10);
                }
            }
        }
        var2.field3741 = 0;
        var2.method5188();
        var1.field1318 = new int[var5];
        var1.field1313 = new int[var5];
        var1.field1314 = new String[var5];
        int var12 = 0;
        while (var2.field3741 < var4) {
            int var13 = var2.method5163();
            if (var13 == 3) {
                var1.field1314[var12] = var2.method5189();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1313[var12] = var2.method5276();
            } else {
                var1.field1313[var12] = var2.method5330();
            }
            var1.field1318[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("co.z(II)[Lll;")
    public class327[] method2146(int arg0) {
        return new class327[arg0];
    }
}
