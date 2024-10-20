package deob;

@ObfuscatedName("cc")
public class class100 extends class195 {

    @ObfuscatedName("cc.i")
    public static class190 field1535 = new class190(128);

    @ObfuscatedName("cc.h")
    public int[] field1528;

    @ObfuscatedName("cc.u")
    public int[] field1530;

    @ObfuscatedName("cc.q")
    public String[] field1533;

    @ObfuscatedName("cc.g")
    public int field1531;

    @ObfuscatedName("cc.v")
    public int field1532;

    @ObfuscatedName("cc.t")
    public int field1534;

    @ObfuscatedName("cc.p")
    public int field1527;

    @ObfuscatedName("cc.l")
    public class187[] field1529;

    @ObfuscatedName("cw.i(II)Lcc;")
    public static class100 method1610(int arg0) {
        class100 var1 = (class100) field1535.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field801.method3836(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class100 var3 = method137(var2);
            field1535.method3316(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("s.h([BI)Lcc;")
    public static class100 method137(byte[] arg0) {
        class100 var1 = new class100();
        class174 var2 = new class174(arg0);
        var2.field2384 = var2.field2387.length - 2;
        int var3 = var2.method2932();
        int var4 = var2.field2387.length - 2 - var3 - 12;
        var2.field2384 = var4;
        int var5 = var2.method2927();
        var1.field1531 = var2.method2932();
        var1.field1532 = var2.method2932();
        var1.field1534 = var2.method2932();
        var1.field1527 = var2.method2932();
        int var6 = var2.method2930();
        if (var6 > 0) {
            var1.field1529 = var1.method1730(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method2932();
                class187 var9 = new class187(class178.method1740(var8));
                var1.field1529[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method2927();
                    int var11 = var2.method2927();
                    var9.method3291(new class199(var11), (long) var10);
                }
            }
        }
        var2.field2384 = 0;
        var2.method2937();
        var1.field1528 = new int[var5];
        var1.field1530 = new int[var5];
        var1.field1533 = new String[var5];
        int var12 = 0;
        while (var2.field2384 < var4) {
            int var13 = var2.method2932();
            if (var13 == 3) {
                var1.field1533[var12] = var2.method2938();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1530[var12] = var2.method2930();
            } else {
                var1.field1530[var12] = var2.method2927();
            }
            var1.field1528[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cc.u(IB)[Lgm;")
    public class187[] method1730(int arg0) {
        return new class187[arg0];
    }
}
