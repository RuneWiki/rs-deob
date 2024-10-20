package deob;

@ObfuscatedName("eh")
public class class131 {

    @ObfuscatedName("eh.u")
    public static final class131 field2048 = new class131("LIVE", 0);

    @ObfuscatedName("eh.k")
    public static final class131 field2045 = new class131("BUILDLIVE", 3);

    @ObfuscatedName("eh.x")
    public static final class131 field2046 = new class131("RC", 1);

    @ObfuscatedName("eh.m")
    public static final class131 field2047 = new class131("WIP", 2);

    @ObfuscatedName("eh.n")
    public final String field2044;

    @ObfuscatedName("eh.q")
    public final int field2049;

    public class131(String arg0, int arg1) {
        this.field2044 = arg0;
        this.field2049 = arg1;
    }

    @ObfuscatedName("m.u(II)Leh;")
    public static class131 method33(int arg0) {
        class131[] var1 = new class131[] { field2046, field2045, field2047, field2048 };
        class131[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class131 var4 = var2[var3];
            if (var4.field2049 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
