package deob;

@ObfuscatedName("cj")
public class class101 extends class196 {

    @ObfuscatedName("cj.j")
    public static class191 field1549 = new class191(128);

    @ObfuscatedName("cj.h")
    public int[] field1539;

    @ObfuscatedName("cj.f")
    public int[] field1540;

    @ObfuscatedName("cj.p")
    public String[] field1541;

    @ObfuscatedName("cj.x")
    public int field1542;

    @ObfuscatedName("cj.g")
    public int field1543;

    @ObfuscatedName("cj.c")
    public int field1544;

    @ObfuscatedName("cj.l")
    public int field1545;

    @ObfuscatedName("cj.w")
    public class188[] field1548;

    @ObfuscatedName("cn.j(II)Lcj;")
    public static class101 method1459(int arg0) {
        class101 var1 = (class101) field1549.method3271((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2056.method3773(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class101 var3 = method218(var2);
            field1549.method3270(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("e.h(Lhn;IIB)Lcj;")
    public static class101 method86(class221 arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0.field2797;
        class101 var5 = method3616(var3, arg0);
        if (var5 == null) {
            int var6 = (arg2 + 40000 << 8) + arg0.field2797;
            class101 var8 = method3616(var6, arg0);
            return var8 == null ? null : var8;
        } else {
            return var5;
        }
    }

    @ObfuscatedName("hq.f(ILhn;I)Lcj;")
    public static class101 method3616(int arg0, class221 arg1) {
        class101 var2 = (class101) field1549.method3271((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field2056.method3789(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field2056.method3779(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class101 var6 = method218(var5);
            if (var6 != null) {
                field1549.method3270(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("ao.p([BI)Lcj;")
    public static class101 method218(byte[] arg0) {
        class101 var1 = new class101();
        class175 var2 = new class175(arg0);
        var2.field2394 = var2.field2390.length - 2;
        int var3 = var2.method3023();
        int var4 = var2.field2390.length - 2 - var3 - 12;
        var2.field2394 = var4;
        int var5 = var2.method2908();
        var1.field1542 = var2.method3023();
        var1.field1543 = var2.method3023();
        var1.field1544 = var2.method3023();
        var1.field1545 = var2.method3023();
        int var6 = var2.method2903();
        if (var6 > 0) {
            var1.field1548 = var1.method1709(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3023();
                class188 var9 = new class188(Statics.method2764(var8));
                var1.field1548[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method2908();
                    int var11 = var2.method2908();
                    var9.method3233(new class200(var11), (long) var10);
                }
            }
        }
        var2.field2394 = 0;
        var2.method2910();
        var1.field1539 = new int[var5];
        var1.field1540 = new int[var5];
        var1.field1541 = new String[var5];
        int var12 = 0;
        while (var2.field2394 < var4) {
            int var13 = var2.method3023();
            if (var13 == 3) {
                var1.field1541[var12] = var2.method2911();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1540[var12] = var2.method2903();
            } else {
                var1.field1540[var12] = var2.method2908();
            }
            var1.field1539[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cj.x(IB)[Lgd;")
    public class188[] method1709(int arg0) {
        return new class188[arg0];
    }
}
