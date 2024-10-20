package deob;

@ObfuscatedName("dz")
public class class117 {

    @ObfuscatedName("dz.k")
    public static final class117 field1898 = new class117(0);

    @ObfuscatedName("dz.y")
    public static final class117 field1896 = new class117(1);

    @ObfuscatedName("dz.s")
    public static final class117 field1897 = new class117(2);

    @ObfuscatedName("dz.g")
    public final int field1899;

    public class117(int arg0) {
        this.field1899 = arg0;
    }

    @ObfuscatedName("dy.k(IB)Ldz;")
    public static class117 method2286(int arg0) {
        class117[] var1 = new class117[] { field1898, field1897, field1896 };
        class117[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class117 var4 = var2[var3];
            if (var4.field1899 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
