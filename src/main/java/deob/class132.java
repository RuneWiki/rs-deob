package deob;

@ObfuscatedName("eb")
public class class132 {

    @ObfuscatedName("eb.i")
    public static final class132 field2065 = new class132("LIVE", 0);

    @ObfuscatedName("eb.v")
    public static final class132 field2070 = new class132("BUILDLIVE", 3);

    @ObfuscatedName("eb.m")
    public static final class132 field2066 = new class132("RC", 1);

    @ObfuscatedName("eb.j")
    public static final class132 field2072 = new class132("WIP", 2);

    @ObfuscatedName("eb.o")
    public final String field2068;

    @ObfuscatedName("eb.l")
    public final int field2069;

    public class132(String arg0, int arg1) {
        this.field2068 = arg0;
        this.field2069 = arg1;
    }

    @ObfuscatedName("ap.i(II)Leb;")
    public static class132 method736(int arg0) {
        class132[] var1 = new class132[] { field2066, field2072, field2070, field2065 };
        class132[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class132 var4 = var2[var3];
            if (var4.field2069 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
