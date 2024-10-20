package deob;

@ObfuscatedName("de")
public class class122 {

    @ObfuscatedName("de.o")
    public static final class122 field1939 = new class122(0);

    @ObfuscatedName("de.l")
    public static final class122 field1940 = new class122(1);

    @ObfuscatedName("de.g")
    public static final class122 field1942 = new class122(2);

    @ObfuscatedName("de.u")
    public final int field1941;

    public class122(int arg0) {
        this.field1941 = arg0;
    }

    @ObfuscatedName("ac.o(II)Lde;")
    public static class122 method627(int arg0) {
        class122[] var1 = new class122[] { field1939, field1942, field1940 };
        class122[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class122 var4 = var2[var3];
            if (var4.field1941 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
