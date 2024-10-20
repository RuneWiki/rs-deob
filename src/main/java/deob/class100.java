package deob;

@ObfuscatedName("cz")
public class class100 extends class195 {

    @ObfuscatedName("cz.i")
    public static class190 field1553 = new class190(128);

    @ObfuscatedName("cz.c")
    public int[] field1538;

    @ObfuscatedName("cz.e")
    public int[] field1549;

    @ObfuscatedName("cz.v")
    public String[] field1540;

    @ObfuscatedName("cz.b")
    public int field1552;

    @ObfuscatedName("cz.y")
    public int field1542;

    @ObfuscatedName("cz.h")
    public int field1537;

    @ObfuscatedName("cz.x")
    public int field1544;

    @ObfuscatedName("cz.f")
    public class187[] field1545;

    @ObfuscatedName("ep.i(II)Lcz;")
    public static class100 method2653(int arg0) {
        class100 var1 = (class100) field1553.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field349.method3769(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class100 var3 = method1413(var2);
            field1553.method3222(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("bv.c(Lhk;III)Lcz;")
    public static class100 method997(class220 arg0, int arg1, int arg2) {
        int var3 = class225.method2652(arg1, arg0);
        class100 var4 = method442(var3, arg0);
        if (var4 == null) {
            int var5 = class225.method21(arg2, arg0);
            class100 var6 = method442(var5, arg0);
            return var6 == null ? null : var6;
        } else {
            return var4;
        }
    }

    @ObfuscatedName("al.e(ILhk;I)Lcz;")
    public static class100 method442(int arg0, class220 arg1) {
        class100 var2 = (class100) field1553.method3220((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field349.method3785(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field349.method3775(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class100 var6 = method1413(var5);
            if (var6 != null) {
                field1553.method3222(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("ce.v([BI)Lcz;")
    public static class100 method1413(byte[] arg0) {
        class100 var1 = new class100();
        class174 var2 = new class174(arg0);
        var2.field2407 = var2.field2415.length - 2;
        int var3 = var2.method2872();
        int var4 = var2.field2415.length - 2 - var3 - 12;
        var2.field2407 = var4;
        int var5 = var2.method2875();
        var1.field1552 = var2.method2872();
        var1.field1542 = var2.method2872();
        var1.field1537 = var2.method2872();
        var1.field1544 = var2.method2872();
        int var6 = var2.method2870();
        if (var6 > 0) {
            var1.field1545 = var1.method1699(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method2872();
                class187 var9 = new class187(class178.method219(var8));
                var1.field1545[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method2875();
                    int var11 = var2.method2875();
                    var9.method3194(new class199(var11), (long) var10);
                }
            }
        }
        var2.field2407 = 0;
        var2.method2877();
        var1.field1538 = new int[var5];
        var1.field1549 = new int[var5];
        var1.field1540 = new String[var5];
        int var12 = 0;
        while (var2.field2407 < var4) {
            int var13 = var2.method2872();
            if (var13 == 3) {
                var1.field1540[var12] = var2.method2878();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1549[var12] = var2.method2870();
            } else {
                var1.field1549[var12] = var2.method2875();
            }
            var1.field1538[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cz.b(II)[Lgq;")
    public class187[] method1699(int arg0) {
        return new class187[arg0];
    }
}
