package deob;

@ObfuscatedName("cr")
public class class100 extends class195 {

    @ObfuscatedName("cr.e")
    public static class190 field1540 = new class190(128);

    @ObfuscatedName("cr.o")
    public int[] field1534;

    @ObfuscatedName("cr.m")
    public int[] field1535;

    @ObfuscatedName("cr.g")
    public String[] field1536;

    @ObfuscatedName("cr.d")
    public int field1537;

    @ObfuscatedName("cr.b")
    public int field1539;

    @ObfuscatedName("cr.k")
    public int field1533;

    @ObfuscatedName("cr.f")
    public int field1541;

    @ObfuscatedName("cr.j")
    public class187[] field1538;

    @ObfuscatedName("al.e(II)Lcr;")
    public static class100 method434(int arg0) {
        class100 var1 = (class100) field1540.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2396.method3760(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class100 var3 = method4094(var2);
            field1540.method3250(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("bi.o(Lhl;III)Lcr;")
    public static class100 method1376(class220 arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0.field2782;
        class100 var5 = method308(var3, arg0);
        if (var5 == null) {
            int var6 = (arg2 + 40000 << 8) + arg0.field2782;
            class100 var8 = method308(var6, arg0);
            return var8 == null ? null : var8;
        } else {
            return var5;
        }
    }

    @ObfuscatedName("ai.m(ILhl;I)Lcr;")
    public static class100 method308(int arg0, class220 arg1) {
        class100 var2 = (class100) field1540.method3248((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field2396.method3776(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field2396.method3797(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class100 var6 = method4094(var5);
            if (var6 != null) {
                field1540.method3250(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("il.g([BI)Lcr;")
    public static class100 method4094(byte[] arg0) {
        class100 var1 = new class100();
        class174 var2 = new class174(arg0);
        var2.field2370 = var2.field2373.length - 2;
        int var3 = var2.method2930();
        int var4 = var2.field2373.length - 2 - var3 - 12;
        var2.field2370 = var4;
        int var5 = var2.method2896();
        var1.field1537 = var2.method2930();
        var1.field1539 = var2.method2930();
        var1.field1533 = var2.method2930();
        var1.field1541 = var2.method2930();
        int var6 = var2.method2891();
        if (var6 > 0) {
            var1.field1538 = var1.method1691(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method2930();
                class187 var9 = new class187(class178.method2666(var8));
                var1.field1538[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method2896();
                    int var11 = var2.method2896();
                    var9.method3234(new class199(var11), (long) var10);
                }
            }
        }
        var2.field2370 = 0;
        var2.method2898();
        var1.field1534 = new int[var5];
        var1.field1535 = new int[var5];
        var1.field1536 = new String[var5];
        int var12 = 0;
        while (var2.field2370 < var4) {
            int var13 = var2.method2930();
            if (var13 == 3) {
                var1.field1536[var12] = var2.method2899();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1535[var12] = var2.method2891();
            } else {
                var1.field1535[var12] = var2.method2896();
            }
            var1.field1534[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cr.d(II)[Lgf;")
    public class187[] method1691(int arg0) {
        return new class187[arg0];
    }
}
