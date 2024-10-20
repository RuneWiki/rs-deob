package deob;

@ObfuscatedName("da")
public class class117 {

    @ObfuscatedName("da.j")
    public static final class117 field1917 = new class117(0);

    @ObfuscatedName("da.z")
    public static final class117 field1906 = new class117(1);

    @ObfuscatedName("da.y")
    public static final class117 field1915 = new class117(2);

    @ObfuscatedName("da.h")
    public final int field1909;

    public class117(int arg0) {
        this.field1909 = arg0;
    }

    @ObfuscatedName("dx.j(II)Lda;")
    public static class117 method2486(int arg0) {
        class117[] var1 = new class117[] { field1915, field1917, field1906 };
        class117[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class117 var4 = var2[var3];
            if (var4.field1909 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
