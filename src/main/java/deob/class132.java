package deob;

@ObfuscatedName("ec")
public class class132 {

    @ObfuscatedName("ec.g")
    public static final class132 field2050 = new class132("LIVE", 0);

    @ObfuscatedName("ec.m")
    public static final class132 field2047 = new class132("BUILDLIVE", 3);

    @ObfuscatedName("ec.v")
    public static final class132 field2048 = new class132("RC", 1);

    @ObfuscatedName("ec.r")
    public static final class132 field2049 = new class132("WIP", 2);

    @ObfuscatedName("ec.n")
    public final String field2052;

    @ObfuscatedName("ec.i")
    public final int field2046;

    @ObfuscatedName("x.g(I)[Lec;")
    public static class132[] method157() {
        return new class132[] { field2050, field2048, field2047, field2049 };
    }

    public class132(String arg0, int arg1) {
        this.field2052 = arg0;
        this.field2046 = arg1;
    }

    @ObfuscatedName("j.m(II)Lec;")
    public static class132 method150(int arg0) {
        class132[] var1 = method157();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class132 var3 = var1[var2];
            if (var3.field2046 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
