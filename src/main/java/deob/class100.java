package deob;

@ObfuscatedName("cq")
public class class100 extends class198 {

    @ObfuscatedName("cq.s")
    public static class193 field1522 = new class193(128);

    @ObfuscatedName("cq.c")
    public int[] field1530;

    @ObfuscatedName("cq.f")
    public int[] field1523;

    @ObfuscatedName("cq.m")
    public String[] field1521;

    @ObfuscatedName("cq.h")
    public int field1524;

    @ObfuscatedName("cq.t")
    public int field1526;

    @ObfuscatedName("cq.p")
    public int field1525;

    @ObfuscatedName("cq.d")
    public int field1528;

    @ObfuscatedName("cq.n")
    public class190[] field1529;

    @ObfuscatedName("en.s(IB)Lcq;")
    public static class100 method2694(int arg0) {
        class100 var1 = (class100) field1522.method3319((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field18.method3840(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class100 var3 = method469(var2);
            field1522.method3315(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("ag.f([BB)Lcq;")
    public static class100 method469(byte[] arg0) {
        class100 var1 = new class100();
        class177 var2 = new class177(arg0);
        var2.field2402 = var2.field2403.length - 2;
        int var3 = var2.method2967();
        int var4 = var2.field2403.length - 2 - var3 - 12;
        var2.field2402 = var4;
        int var5 = var2.method2970();
        var1.field1524 = var2.method2967();
        var1.field1526 = var2.method2967();
        var1.field1525 = var2.method2967();
        var1.field1528 = var2.method2967();
        int var6 = var2.method2965();
        if (var6 > 0) {
            var1.field1529 = var1.method1737(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method2967();
                class190 var9 = new class190(class181.method3979(var8));
                var1.field1529[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method2970();
                    int var11 = var2.method2970();
                    var9.method3291(new class202(var11), (long) var10);
                }
            }
        }
        var2.field2402 = 0;
        var2.method3091();
        var1.field1530 = new int[var5];
        var1.field1523 = new int[var5];
        var1.field1521 = new String[var5];
        int var12 = 0;
        while (var2.field2402 < var4) {
            int var13 = var2.method2967();
            if (var13 == 3) {
                var1.field1521[var12] = var2.method2973();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1523[var12] = var2.method2965();
            } else {
                var1.field1523[var12] = var2.method2970();
            }
            var1.field1530[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cq.m(II)[Lgm;")
    public class190[] method1737(int arg0) {
        return new class190[arg0];
    }
}
