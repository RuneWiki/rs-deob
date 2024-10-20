package deob;

@ObfuscatedName("ex")
public class class132 {

    @ObfuscatedName("ex.x")
    public static final class132 field2039 = new class132("LIVE", 0);

    @ObfuscatedName("ex.p")
    public static final class132 field2037 = new class132("BUILDLIVE", 3);

    @ObfuscatedName("ex.k")
    public static final class132 field2036 = new class132("RC", 1);

    @ObfuscatedName("ex.a")
    public static final class132 field2040 = new class132("WIP", 2);

    @ObfuscatedName("ex.q")
    public final String field2042;

    @ObfuscatedName("ex.j")
    public final int field2041;

    public class132(String arg0, int arg1) {
        this.field2042 = arg0;
        this.field2041 = arg1;
    }

    @ObfuscatedName("cd.x(II)Lex;")
    public static class132 method1996(int arg0) {
        class132[] var1 = new class132[] { field2040, field2037, field2039, field2036 };
        class132[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class132 var4 = var2[var3];
            if (var4.field2041 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
