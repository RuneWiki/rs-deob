package deob;

@ObfuscatedName("cc")
public class class101 extends class196 {

    @ObfuscatedName("cc.e")
    public static class191 field1526 = new class191(128);

    @ObfuscatedName("cc.n")
    public int[] field1523;

    @ObfuscatedName("cc.g")
    public int[] field1522;

    @ObfuscatedName("cc.y")
    public String[] field1525;

    @ObfuscatedName("cc.w")
    public int field1532;

    @ObfuscatedName("cc.k")
    public int field1527;

    @ObfuscatedName("cc.v")
    public int field1528;

    @ObfuscatedName("cc.z")
    public int field1529;

    @ObfuscatedName("cc.r")
    public class188[] field1530;

    @ObfuscatedName("au.e(IB)Lcc;")
    public static class101 method234(int arg0) {
        class101 var1 = (class101) field1526.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3390.method3817(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class101 var3 = method1690(var2);
            field1526.method3278(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("q.n(Lhc;III)Lcc;")
    public static class101 method178(class221 arg0, int arg1, int arg2) {
        int var3 = class226.method3101(arg1, arg0);
        class101 var4 = method45(var3, arg0);
        if (var4 == null) {
            int var5 = (arg2 + 40000 << 8) + arg0.field2770;
            class101 var7 = method45(var5, arg0);
            return var7 == null ? null : var7;
        } else {
            return var4;
        }
    }

    @ObfuscatedName("u.g(ILhc;I)Lcc;")
    public static class101 method45(int arg0, class221 arg1) {
        class101 var2 = (class101) field1526.method3288((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field3390.method3829(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field3390.method3823(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class101 var6 = method1690(var5);
            if (var6 != null) {
                field1526.method3278(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("ce.y([BI)Lcc;")
    public static class101 method1690(byte[] arg0) {
        class101 var1 = new class101();
        class175 var2 = new class175(arg0);
        var2.field2381 = var2.field2376.length - 2;
        int var3 = var2.method3091();
        int var4 = var2.field2376.length - 2 - var3 - 12;
        var2.field2381 = var4;
        int var5 = var2.method2933();
        var1.field1532 = var2.method3091();
        var1.field1527 = var2.method3091();
        var1.field1528 = var2.method3091();
        var1.field1529 = var2.method3091();
        int var6 = var2.method2928();
        if (var6 > 0) {
            var1.field1530 = var1.method1743(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3091();
                class188 var9 = new class188(class179.method75(var8));
                var1.field1530[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method2933();
                    int var11 = var2.method2933();
                    var9.method3250(new class200(var11), (long) var10);
                }
            }
        }
        var2.field2381 = 0;
        var2.method2935();
        var1.field1523 = new int[var5];
        var1.field1522 = new int[var5];
        var1.field1525 = new String[var5];
        int var12 = 0;
        while (var2.field2381 < var4) {
            int var13 = var2.method3091();
            if (var13 == 3) {
                var1.field1525[var12] = var2.method3113();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1522[var12] = var2.method2928();
            } else {
                var1.field1522[var12] = var2.method2933();
            }
            var1.field1523[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cc.w(II)[Lgw;")
    public class188[] method1743(int arg0) {
        return new class188[arg0];
    }
}
