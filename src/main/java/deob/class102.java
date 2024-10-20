package deob;

@ObfuscatedName("ce")
public class class102 extends class185 {

    @ObfuscatedName("ce.x")
    public static class155 field1308 = new class155(128);

    @ObfuscatedName("ce.m")
    public int[] field1298;

    @ObfuscatedName("ce.k")
    public int[] field1301;

    @ObfuscatedName("ce.d")
    public String[] field1300;

    @ObfuscatedName("ce.w")
    public int field1303;

    @ObfuscatedName("ce.v")
    public int field1302;

    @ObfuscatedName("ce.q")
    public int field1307;

    @ObfuscatedName("ce.z")
    public int field1297;

    @ObfuscatedName("ce.t")
    public class326[] field1305;

    @ObfuscatedName("am.x(II)Lce;")
    public static class102 method439(int arg0) {
        class102 var1 = (class102) field1308.method3146((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field312.method3869(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class102 var3 = method1090(var2);
            field1308.method3152(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("bx.k([BI)Lce;")
    public static class102 method1090(byte[] arg0) {
        class102 var1 = new class102();
        class310 var2 = new class310(arg0);
        var2.field3711 = var2.field3710.length - 2;
        int var3 = var2.method5139();
        int var4 = var2.field3710.length - 2 - var3 - 12;
        var2.field3711 = var4;
        int var5 = var2.method5142();
        var1.field1303 = var2.method5139();
        var1.field1302 = var2.method5139();
        var1.field1307 = var2.method5139();
        var1.field1297 = var2.method5139();
        int var6 = var2.method5137();
        if (var6 > 0) {
            var1.field1305 = var1.method2138(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method5139();
                class326 var9 = new class326(var8 > 0 ? class198.method3666(var8) : 1);
                var1.field1305[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method5142();
                    int var11 = var2.method5142();
                    var9.method5514(new class189(var11), (long) var10);
                }
            }
        }
        var2.field3711 = 0;
        var2.method5145();
        var1.field1298 = new int[var5];
        var1.field1301 = new int[var5];
        var1.field1300 = new String[var5];
        int var12 = 0;
        while (var2.field3711 < var4) {
            int var13 = var2.method5139();
            if (var13 == 3) {
                var1.field1300[var12] = var2.method5257();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1301[var12] = var2.method5137();
            } else {
                var1.field1301[var12] = var2.method5142();
            }
            var1.field1298[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("ce.d(II)[Lln;")
    public class326[] method2138(int arg0) {
        return new class326[arg0];
    }
}
