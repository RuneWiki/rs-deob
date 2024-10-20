package deob;

@ObfuscatedName("dc")
public class class130 {

    @ObfuscatedName("dc.h")
    public static final class130 field2061 = new class130(0);

    @ObfuscatedName("dc.m")
    public static final class130 field2053 = new class130(1);

    @ObfuscatedName("dc.i")
    public static final class130 field2054 = new class130(2);

    @ObfuscatedName("dc.q")
    public final int field2056;

    @ObfuscatedName("an.h(B)[Ldc;")
    public static class130[] method1033() {
        return new class130[] { field2061, field2054, field2053 };
    }

    public class130(int arg0) {
        this.field2056 = arg0;
    }

    @ObfuscatedName("ag.m(II)Ldc;")
    public static class130 method755(int arg0) {
        class130[] var1 = method1033();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class130 var3 = var1[var2];
            if (var3.field2056 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
