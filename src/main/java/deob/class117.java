package deob;

@ObfuscatedName("dr")
public class class117 {

    @ObfuscatedName("dr.n")
    public static final class117 field1898 = new class117(0);

    @ObfuscatedName("dr.x")
    public static final class117 field1895 = new class117(1);

    @ObfuscatedName("dr.k")
    public static final class117 field1897 = new class117(2);

    @ObfuscatedName("dr.i")
    public final int field1894;

    public class117(int arg0) {
        this.field1894 = arg0;
    }

    @ObfuscatedName("bw.n(II)Ldr;")
    public static class117 method1417(int arg0) {
        class117[] var1 = new class117[] { field1895, field1898, field1897 };
        class117[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class117 var4 = var2[var3];
            if (var4.field1894 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
