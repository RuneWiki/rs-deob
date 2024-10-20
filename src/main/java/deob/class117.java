package deob;

@ObfuscatedName("da")
public class class117 {

    @ObfuscatedName("da.z")
    public static final class117 field1887 = new class117(0);

    @ObfuscatedName("da.j")
    public static final class117 field1886 = new class117(1);

    @ObfuscatedName("da.a")
    public static final class117 field1890 = new class117(2);

    @ObfuscatedName("da.y")
    public final int field1885;

    @ObfuscatedName("ah.z(B)[Lda;")
    public static class117[] method998() {
        return new class117[] { field1890, field1887, field1886 };
    }

    public class117(int arg0) {
        this.field1885 = arg0;
    }

    @ObfuscatedName("bp.j(II)Lda;")
    public static class117 method1023(int arg0) {
        class117[] var1 = method998();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class117 var3 = var1[var2];
            if (var3.field1885 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
