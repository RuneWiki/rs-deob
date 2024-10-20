package deob;

@ObfuscatedName("ch")
public class class100 extends class195 {

    @ObfuscatedName("ch.n")
    public static class190 field1535 = new class190(128);

    @ObfuscatedName("ch.p")
    public int[] field1538;

    @ObfuscatedName("ch.i")
    public int[] field1540;

    @ObfuscatedName("ch.j")
    public String[] field1536;

    @ObfuscatedName("ch.f")
    public int field1537;

    @ObfuscatedName("ch.m")
    public int field1534;

    @ObfuscatedName("ch.c")
    public int field1539;

    @ObfuscatedName("ch.z")
    public int field1543;

    @ObfuscatedName("ch.h")
    public class187[] field1541;

    @ObfuscatedName("cu.n(IB)Lch;")
    public static class100 method1610(int arg0) {
        class100 var1 = (class100) field1535.method3280((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1879.method3880(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class100 var3 = method163(var2);
            field1535.method3282(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("az.p(Lhy;III)Lch;")
    public static class100 method662(class220 arg0, int arg1, int arg2) {
        int var3 = class225.method1914(arg1, arg0);
        class100 var4 = method24(var3, arg0);
        if (var4 == null) {
            int var5 = Statics.method2884(arg2, arg0);
            class100 var6 = method24(var5, arg0);
            return var6 == null ? null : var6;
        } else {
            return var4;
        }
    }

    @ObfuscatedName("c.i(ILhy;B)Lch;")
    public static class100 method24(int arg0, class220 arg1) {
        class100 var2 = (class100) field1535.method3280((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field1879.method3846(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field1879.method3836(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class100 var6 = method163(var5);
            if (var6 != null) {
                field1535.method3282(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("l.j([BI)Lch;")
    public static class100 method163(byte[] arg0) {
        class100 var1 = new class100();
        class174 var2 = new class174(arg0);
        var2.field2400 = var2.field2401.length - 2;
        int var3 = var2.method3065();
        int var4 = var2.field2401.length - 2 - var3 - 12;
        var2.field2400 = var4;
        int var5 = var2.method3058();
        var1.field1537 = var2.method3065();
        var1.field1534 = var2.method3065();
        var1.field1539 = var2.method3065();
        var1.field1543 = var2.method3065();
        int var6 = var2.method2925();
        if (var6 > 0) {
            var1.field1541 = var1.method1709(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3065();
                class187 var9 = new class187(class178.method76(var8));
                var1.field1541[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3058();
                    int var11 = var2.method3058();
                    var9.method3244(new class199(var11), (long) var10);
                }
            }
        }
        var2.field2400 = 0;
        var2.method3041();
        var1.field1538 = new int[var5];
        var1.field1540 = new int[var5];
        var1.field1536 = new String[var5];
        int var12 = 0;
        while (var2.field2400 < var4) {
            int var13 = var2.method3065();
            if (var13 == 3) {
                var1.field1536[var12] = var2.method3098();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1540[var12] = var2.method2925();
            } else {
                var1.field1540[var12] = var2.method3058();
            }
            var1.field1538[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("ch.f(II)[Lgj;")
    public class187[] method1709(int arg0) {
        return new class187[arg0];
    }
}
