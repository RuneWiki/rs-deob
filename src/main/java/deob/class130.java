package deob;

@ObfuscatedName("dl")
public class class130 {

    @ObfuscatedName("dl.c")
    public static final class130 field2029 = new class130(0);

    @ObfuscatedName("dl.h")
    public static final class130 field2026 = new class130(1);

    @ObfuscatedName("dl.k")
    public static final class130 field2027 = new class130(2);

    @ObfuscatedName("dl.t")
    public final int field2028;

    @ObfuscatedName("ad.c(I)[Ldl;")
    public static class130[] method704() {
        return new class130[] { field2026, field2027, field2029 };
    }

    public class130(int arg0) {
        this.field2028 = arg0;
    }

    @ObfuscatedName("ew.h(IB)Ldl;")
    public static class130 method2896(int arg0) {
        class130[] var1 = method704();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class130 var3 = var1[var2];
            if (var3.field2028 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
