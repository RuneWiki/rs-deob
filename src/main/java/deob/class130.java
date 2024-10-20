package deob;

@ObfuscatedName("du")
public class class130 {

    @ObfuscatedName("du.g")
    public static final class130 field2056 = new class130(0);

    @ObfuscatedName("du.b")
    public static final class130 field2051 = new class130(1);

    @ObfuscatedName("du.w")
    public static final class130 field2052 = new class130(2);

    @ObfuscatedName("du.d")
    public final int field2053;

    @ObfuscatedName("dz.g(I)[Ldu;")
    public static class130[] method2268() {
        return new class130[] { field2051, field2056, field2052 };
    }

    public class130(int arg0) {
        this.field2053 = arg0;
    }

    @ObfuscatedName("ab.b(II)Ldu;")
    public static class130 method668(int arg0) {
        class130[] var1 = method2268();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class130 var3 = var1[var2];
            if (var3.field2053 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
