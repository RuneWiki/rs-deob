package deob;

@ObfuscatedName("ez")
public class class132 {

    @ObfuscatedName("ez.d")
    public static final class132 field2063 = new class132("LIVE", 0);

    @ObfuscatedName("ez.g")
    public static final class132 field2056 = new class132("BUILDLIVE", 3);

    @ObfuscatedName("ez.a")
    public static final class132 field2057 = new class132("RC", 1);

    @ObfuscatedName("ez.t")
    public static final class132 field2059 = new class132("WIP", 2);

    @ObfuscatedName("ez.f")
    public final String field2060;

    @ObfuscatedName("ez.c")
    public final int field2061;

    @ObfuscatedName("bu.d(I)[Lez;")
    public static class132[] method1345() {
        return new class132[] { field2056, field2059, field2057, field2063 };
    }

    public class132(String arg0, int arg1) {
        this.field2060 = arg0;
        this.field2061 = arg1;
    }

    @ObfuscatedName("ar.g(II)Lez;")
    public static class132 method684(int arg0) {
        class132[] var1 = method1345();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class132 var3 = var1[var2];
            if (var3.field2061 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
