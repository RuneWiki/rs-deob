package deob;

@ObfuscatedName("el")
public class class132 {

    @ObfuscatedName("el.t")
    public static final class132 field2087 = new class132("LIVE", 0);

    @ObfuscatedName("el.l")
    public static final class132 field2085 = new class132("BUILDLIVE", 3);

    @ObfuscatedName("el.c")
    public static final class132 field2080 = new class132("RC", 1);

    @ObfuscatedName("el.d")
    public static final class132 field2081 = new class132("WIP", 2);

    @ObfuscatedName("el.b")
    public final String field2082;

    @ObfuscatedName("el.i")
    public final int field2083;

    public class132(String arg0, int arg1) {
        this.field2082 = arg0;
        this.field2083 = arg1;
    }

    @ObfuscatedName("al.t(II)Lel;")
    public static class132 method768(int arg0) {
        class132[] var1 = new class132[] { field2080, field2085, field2087, field2081 };
        class132[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class132 var4 = var2[var3];
            if (var4.field2083 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
