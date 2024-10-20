package deob;

@ObfuscatedName("cd")
public class class100 extends class195 {

    @ObfuscatedName("cd.d")
    public static class190 field1502 = new class190(128);

    @ObfuscatedName("cd.q")
    public int[] field1501;

    @ObfuscatedName("cd.x")
    public int[] field1500;

    @ObfuscatedName("cd.y")
    public String[] field1503;

    @ObfuscatedName("cd.e")
    public int field1508;

    @ObfuscatedName("cd.f")
    public int field1505;

    @ObfuscatedName("cd.v")
    public int field1506;

    @ObfuscatedName("cd.t")
    public int field1504;

    @ObfuscatedName("cd.i")
    public class187[] field1507;

    @ObfuscatedName("be.d(ILhh;B)Lcd;")
    public static class100 method1386(int arg0, class220 arg1) {
        class100 var2 = (class100) field1502.method3252((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field925.method3766(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field925.method3756(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class100 var6 = method2175(var5);
            if (var6 != null) {
                field1502.method3256(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("da.q([BB)Lcd;")
    public static class100 method2175(byte[] arg0) {
        class100 var1 = new class100();
        class174 var2 = new class174(arg0);
        var2.field2364 = var2.field2367.length - 2;
        int var3 = var2.method2916();
        int var4 = var2.field2367.length - 2 - var3 - 12;
        var2.field2364 = var4;
        int var5 = var2.method2935();
        var1.field1508 = var2.method2916();
        var1.field1505 = var2.method2916();
        var1.field1506 = var2.method2916();
        var1.field1504 = var2.method2916();
        int var6 = var2.method2921();
        if (var6 > 0) {
            var1.field1507 = var1.method1697(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method2916();
                class187 var9 = new class187(class178.method228(var8));
                var1.field1507[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method2935();
                    int var11 = var2.method2935();
                    var9.method3231(new class199(var11), (long) var10);
                }
            }
        }
        var2.field2364 = 0;
        var2.method2958();
        var1.field1501 = new int[var5];
        var1.field1500 = new int[var5];
        var1.field1503 = new String[var5];
        int var12 = 0;
        while (var2.field2364 < var4) {
            int var13 = var2.method2916();
            if (var13 == 3) {
                var1.field1503[var12] = var2.method2922();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1500[var12] = var2.method2921();
            } else {
                var1.field1500[var12] = var2.method2935();
            }
            var1.field1501[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cd.x(II)[Lgc;")
    public class187[] method1697(int arg0) {
        return new class187[arg0];
    }
}
