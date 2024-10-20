package deob;

@ObfuscatedName("cg")
public class class100 extends class195 {

    @ObfuscatedName("cg.a")
    public static class190 field1531 = new class190(128);

    @ObfuscatedName("cg.j")
    public int[] field1529;

    @ObfuscatedName("cg.n")
    public int[] field1530;

    @ObfuscatedName("cg.r")
    public String[] field1533;

    @ObfuscatedName("cg.v")
    public int field1532;

    @ObfuscatedName("cg.e")
    public int field1535;

    @ObfuscatedName("cg.l")
    public int field1534;

    @ObfuscatedName("cg.s")
    public int field1539;

    @ObfuscatedName("cg.w")
    public class187[] field1536;

    @ObfuscatedName("bb.a(ILhx;I)Lcg;")
    public static class100 method886(int arg0, class220 arg1) {
        class100 var2 = (class100) field1531.method3245((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field3661.method3777(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field3661.method3768(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class100 var6 = method1524(var5);
            if (var6 != null) {
                field1531.method3247(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("ch.j([BI)Lcg;")
    public static class100 method1524(byte[] arg0) {
        class100 var1 = new class100();
        class174 var2 = new class174(arg0);
        var2.field2394 = var2.field2391.length - 2;
        int var3 = var2.method2873();
        int var4 = var2.field2391.length - 2 - var3 - 12;
        var2.field2394 = var4;
        int var5 = var2.method2876();
        var1.field1532 = var2.method2873();
        var1.field1535 = var2.method2873();
        var1.field1534 = var2.method2873();
        var1.field1539 = var2.method2873();
        int var6 = var2.method2871();
        if (var6 > 0) {
            var1.field1536 = var1.method1679(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method2873();
                class187 var9 = new class187(class178.method2668(var8));
                var1.field1536[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method2876();
                    int var11 = var2.method2876();
                    var9.method3225(new class199(var11), (long) var10);
                }
            }
        }
        var2.field2394 = 0;
        var2.method2878();
        var1.field1529 = new int[var5];
        var1.field1530 = new int[var5];
        var1.field1533 = new String[var5];
        int var12 = 0;
        while (var2.field2394 < var4) {
            int var13 = var2.method2873();
            if (var13 == 3) {
                var1.field1533[var12] = var2.method2879();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1530[var12] = var2.method2871();
            } else {
                var1.field1530[var12] = var2.method2876();
            }
            var1.field1529[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cg.n(IB)[Lgl;")
    public class187[] method1679(int arg0) {
        return new class187[arg0];
    }
}
