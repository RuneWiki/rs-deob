package deob;

@ObfuscatedName("ee")
public class class131 {

    @ObfuscatedName("ee.z")
    public static final class131 field2031 = new class131("LIVE", 0);

    @ObfuscatedName("ee.h")
    public static final class131 field2024 = new class131("BUILDLIVE", 3);

    @ObfuscatedName("ee.c")
    public static final class131 field2026 = new class131("RC", 1);

    @ObfuscatedName("ee.p")
    public static final class131 field2023 = new class131("WIP", 2);

    @ObfuscatedName("ee.i")
    public final String field2030;

    @ObfuscatedName("ee.v")
    public final int field2028;

    public class131(String arg0, int arg1) {
        this.field2030 = arg0;
        this.field2028 = arg1;
    }

    @ObfuscatedName("r.z(II)Lee;")
    public static class131 method214(int arg0) {
        class131[] var1 = new class131[] { field2024, field2026, field2023, field2031 };
        class131[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class131 var4 = var2[var3];
            if (var4.field2028 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
