package deob;

@ObfuscatedName("cy")
public class class100 extends class195 {

    @ObfuscatedName("cy.i")
    public static class190 field1552 = new class190(128);

    @ObfuscatedName("cy.w")
    public int[] field1561;

    @ObfuscatedName("cy.a")
    public int[] field1553;

    @ObfuscatedName("cy.t")
    public String[] field1554;

    @ObfuscatedName("cy.s")
    public int field1555;

    @ObfuscatedName("cy.r")
    public int field1556;

    @ObfuscatedName("cy.v")
    public int field1557;

    @ObfuscatedName("cy.y")
    public int field1558;

    @ObfuscatedName("cy.j")
    public class187[] field1559;

    @ObfuscatedName("client.i(Lhh;III)Lcy;")
    public static class100 method1109(class220 arg0, int arg1, int arg2) {
        int var3 = class225.method2355(arg1, arg0);
        class100 var4 = method4214(var3, arg0);
        if (var4 == null) {
            int var5 = class225.method909(arg2, arg0);
            class100 var6 = method4214(var5, arg0);
            return var6 == null ? null : var6;
        } else {
            return var4;
        }
    }

    @ObfuscatedName("ig.w(ILhh;I)Lcy;")
    public static class100 method4214(int arg0, class220 arg1) {
        class100 var2 = (class100) field1552.method3235((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field2353.method3800(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field2353.method3774(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class100 var6 = method643(var5);
            if (var6 != null) {
                field1552.method3234(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("ag.a([BI)Lcy;")
    public static class100 method643(byte[] arg0) {
        class100 var1 = new class100();
        class174 var2 = new class174(arg0);
        var2.field2399 = var2.field2405.length - 2;
        int var3 = var2.method2882();
        int var4 = var2.field2405.length - 2 - var3 - 12;
        var2.field2399 = var4;
        int var5 = var2.method2885();
        var1.field1555 = var2.method2882();
        var1.field1556 = var2.method2882();
        var1.field1557 = var2.method2882();
        var1.field1558 = var2.method2882();
        int var6 = var2.method3061();
        if (var6 > 0) {
            var1.field1559 = var1.method1707(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method2882();
                class187 var9 = new class187(class178.method740(var8));
                var1.field1559[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method2885();
                    int var11 = var2.method2885();
                    var9.method3198(new class199(var11), (long) var10);
                }
            }
        }
        var2.field2399 = 0;
        var2.method3011();
        var1.field1561 = new int[var5];
        var1.field1553 = new int[var5];
        var1.field1554 = new String[var5];
        int var12 = 0;
        while (var2.field2399 < var4) {
            int var13 = var2.method2882();
            if (var13 == 3) {
                var1.field1554[var12] = var2.method2884();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1553[var12] = var2.method3061();
            } else {
                var1.field1553[var12] = var2.method2885();
            }
            var1.field1561[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cy.t(II)[Lgn;")
    public class187[] method1707(int arg0) {
        return new class187[arg0];
    }
}
