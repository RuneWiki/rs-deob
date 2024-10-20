package deob;

@ObfuscatedName("cs")
public class class102 extends class185 {

    @ObfuscatedName("cs.m")
    public static class155 field1321 = new class155(128);

    @ObfuscatedName("cs.o")
    public int[] field1311;

    @ObfuscatedName("cs.q")
    public int[] field1312;

    @ObfuscatedName("cs.j")
    public String[] field1313;

    @ObfuscatedName("cs.p")
    public int field1314;

    @ObfuscatedName("cs.g")
    public int field1315;

    @ObfuscatedName("cs.n")
    public int field1319;

    @ObfuscatedName("cs.u")
    public int field1317;

    @ObfuscatedName("cs.a")
    public class326[] field1318;

    @ObfuscatedName("ao.m(II)Lcs;")
    public static class102 method251(int arg0) {
        class102 var1 = (class102) field1321.method3127((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field626.method3891(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class102 var3 = Statics.method620(var2);
            field1321.method3137(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("p.o(IIII)Lcs;")
    public static class102 method32(int arg0, int arg1, int arg2) {
        int var3 = class232.method2805(arg1, arg0);
        class102 var4 = method4089(var3, arg0);
        if (var4 == null) {
            int var5 = (arg2 + 40000 << 8) + arg0;
            class102 var7 = method4089(var5, arg0);
            return var7 == null ? null : var7;
        } else {
            return var4;
        }
    }

    @ObfuscatedName("if.q(III)Lcs;")
    public static class102 method4089(int arg0, int arg1) {
        class102 var2 = (class102) field1321.method3127((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field626.method3909(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field626.method3955(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class102 var6 = Statics.method620(var5);
            if (var6 != null) {
                field1321.method3137(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("cs.p(II)[Llf;")
    public class326[] method2134(int arg0) {
        return new class326[arg0];
    }
}
