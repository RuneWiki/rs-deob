package deob;

@ObfuscatedName("da")
public class class117 {

    @ObfuscatedName("da.e")
    public static final class117 field1909 = new class117(0);

    @ObfuscatedName("da.o")
    public static final class117 field1904 = new class117(1);

    @ObfuscatedName("da.y")
    public static final class117 field1905 = new class117(2);

    @ObfuscatedName("da.b")
    public final int field1907;

    public class117(int arg0) {
        this.field1907 = arg0;
    }

    @ObfuscatedName("e.e(II)Lda;")
    public static class117 method3(int arg0) {
        class117[] var1 = new class117[] { field1909, field1905, field1904 };
        class117[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class117 var4 = var2[var3];
            if (var4.field1907 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
