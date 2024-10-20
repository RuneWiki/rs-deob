package deob;

@ObfuscatedName("df")
public class class117 {

    @ObfuscatedName("df.y")
    public static final class117 field1905 = new class117(0);

    @ObfuscatedName("df.u")
    public static final class117 field1904 = new class117(1);

    @ObfuscatedName("df.k")
    public static final class117 field1906 = new class117(2);

    @ObfuscatedName("df.v")
    public final int field1913;

    @ObfuscatedName("h.y(B)[Ldf;")
    public static class117[] method472() {
        return new class117[] { field1904, field1906, field1905 };
    }

    public class117(int arg0) {
        this.field1913 = arg0;
    }

    @ObfuscatedName("k.u(II)Ldf;")
    public static class117 method15(int arg0) {
        class117[] var1 = method472();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class117 var3 = var1[var2];
            if (var3.field1913 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
