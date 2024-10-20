package deob;

@ObfuscatedName("du")
public class class117 {

    @ObfuscatedName("du.g")
    public static final class117 field1919 = new class117(0);

    @ObfuscatedName("du.s")
    public static final class117 field1911 = new class117(1);

    @ObfuscatedName("du.v")
    public static final class117 field1915 = new class117(2);

    @ObfuscatedName("du.o")
    public final int field1912;

    @ObfuscatedName("l.g(B)[Ldu;")
    public static class117[] method88() {
        return new class117[] { field1911, field1915, field1919 };
    }

    public class117(int arg0) {
        this.field1912 = arg0;
    }

    @ObfuscatedName("y.s(II)Ldu;")
    public static class117 method500(int arg0) {
        class117[] var1 = method88();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class117 var3 = var1[var2];
            if (var3.field1912 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
