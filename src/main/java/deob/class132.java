package deob;

@ObfuscatedName("eg")
public class class132 {

    @ObfuscatedName("eg.a")
    public static final class132 field2061 = new class132("LIVE", 0);

    @ObfuscatedName("eg.x")
    public static final class132 field2055 = new class132("BUILDLIVE", 3);

    @ObfuscatedName("eg.e")
    public static final class132 field2057 = new class132("RC", 1);

    @ObfuscatedName("eg.r")
    public static final class132 field2058 = new class132("WIP", 2);

    @ObfuscatedName("eg.p")
    public final String field2056;

    @ObfuscatedName("eg.n")
    public final int field2060;

    public class132(String arg0, int arg1) {
        this.field2056 = arg0;
        this.field2060 = arg1;
    }

    @ObfuscatedName("cg.a(IB)Leg;")
    public static class132 method1984(int arg0) {
        class132[] var1 = new class132[] { field2058, field2057, field2061, field2055 };
        class132[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class132 var4 = var2[var3];
            if (var4.field2060 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
