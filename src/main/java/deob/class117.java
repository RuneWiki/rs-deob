package deob;

@ObfuscatedName("de")
public class class117 {

    @ObfuscatedName("de.k")
    public static final class117 field1922 = new class117(0);

    @ObfuscatedName("de.b")
    public static final class117 field1925 = new class117(1);

    @ObfuscatedName("de.e")
    public static final class117 field1920 = new class117(2);

    @ObfuscatedName("de.i")
    public final int field1923;

    public class117(int arg0) {
        this.field1923 = arg0;
    }

    @ObfuscatedName("z.k(II)Lde;")
    public static class117 method78(int arg0) {
        class117[] var1 = new class117[] { field1920, field1922, field1925 };
        class117[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class117 var4 = var2[var3];
            if (var4.field1923 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
