package deob;

@ObfuscatedName("cq")
public class class100 extends class195 {

    @ObfuscatedName("cq.p")
    public static class190 field1534 = new class190(128);

    @ObfuscatedName("cq.m")
    public int[] field1528;

    @ObfuscatedName("cq.e")
    public int[] field1529;

    @ObfuscatedName("cq.t")
    public String[] field1530;

    @ObfuscatedName("cq.w")
    public int field1531;

    @ObfuscatedName("cq.z")
    public int field1532;

    @ObfuscatedName("cq.j")
    public int field1538;

    @ObfuscatedName("cq.i")
    public int field1533;

    @ObfuscatedName("cq.f")
    public class187[] field1535;

    @ObfuscatedName("az.p(II)Lcq;")
    public static class100 method575(int arg0) {
        class100 var1 = (class100) field1534.method3182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field833.method3720(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class100 var3 = method618(var2);
            field1534.method3179(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("aw.m([BI)Lcq;")
    public static class100 method618(byte[] arg0) {
        class100 var1 = new class100();
        class174 var2 = new class174(arg0);
        var2.field2408 = var2.field2415.length - 2;
        int var3 = var2.method2824();
        int var4 = var2.field2415.length - 2 - var3 - 12;
        var2.field2408 = var4;
        int var5 = var2.method2803();
        var1.field1531 = var2.method2824();
        var1.field1532 = var2.method2824();
        var1.field1538 = var2.method2824();
        var1.field1533 = var2.method2824();
        int var6 = var2.method2810();
        if (var6 > 0) {
            var1.field1535 = var1.method1644(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method2824();
                class187 var9 = new class187(class178.method3692(var8));
                var1.field1535[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method2803();
                    int var11 = var2.method2803();
                    var9.method3159(new class199(var11), (long) var10);
                }
            }
        }
        var2.field2408 = 0;
        var2.method2817();
        var1.field1528 = new int[var5];
        var1.field1529 = new int[var5];
        var1.field1530 = new String[var5];
        int var12 = 0;
        while (var2.field2408 < var4) {
            int var13 = var2.method2824();
            if (var13 == 3) {
                var1.field1530[var12] = var2.method2818();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1529[var12] = var2.method2810();
            } else {
                var1.field1529[var12] = var2.method2803();
            }
            var1.field1528[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cq.e(II)[Lgj;")
    public class187[] method1644(int arg0) {
        return new class187[arg0];
    }
}
