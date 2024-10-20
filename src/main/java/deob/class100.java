package deob;

@ObfuscatedName("cm")
public class class100 extends class198 {

    @ObfuscatedName("cm.w")
    public static class193 field1545 = new class193(128);

    @ObfuscatedName("cm.o")
    public int[] field1543;

    @ObfuscatedName("cm.x")
    public int[] field1544;

    @ObfuscatedName("cm.k")
    public String[] field1550;

    @ObfuscatedName("cm.f")
    public int field1546;

    @ObfuscatedName("cm.i")
    public int field1547;

    @ObfuscatedName("cm.j")
    public int field1548;

    @ObfuscatedName("cm.m")
    public int field1549;

    @ObfuscatedName("cm.u")
    public class190[] field1542;

    @ObfuscatedName("b.o([BS)Lcm;")
    public static class100 method165(byte[] arg0) {
        class100 var1 = new class100();
        class177 var2 = new class177(arg0);
        var2.field2412 = var2.field2419.length - 2;
        int var3 = var2.method2886();
        int var4 = var2.field2419.length - 2 - var3 - 12;
        var2.field2412 = var4;
        int var5 = var2.method2904();
        var1.field1546 = var2.method2886();
        var1.field1547 = var2.method2886();
        var1.field1548 = var2.method2886();
        var1.field1549 = var2.method2886();
        int var6 = var2.method2931();
        if (var6 > 0) {
            var1.field1542 = var1.method1673(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method2886();
                class190 var9 = new class190(class181.method492(var8));
                var1.field1542[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method2904();
                    int var11 = var2.method2904();
                    var9.method3213(new class202(var11), (long) var10);
                }
            }
        }
        var2.field2412 = 0;
        var2.method2891();
        var1.field1543 = new int[var5];
        var1.field1544 = new int[var5];
        var1.field1550 = new String[var5];
        int var12 = 0;
        while (var2.field2412 < var4) {
            int var13 = var2.method2886();
            if (var13 == 3) {
                var1.field1550[var12] = var2.method2892();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1544[var12] = var2.method2931();
            } else {
                var1.field1544[var12] = var2.method2904();
            }
            var1.field1543[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cm.x(IB)[Lgq;")
    public class190[] method1673(int arg0) {
        return new class190[arg0];
    }
}
