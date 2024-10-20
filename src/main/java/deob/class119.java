package deob;

@ObfuscatedName("dd")
public class class119 {

    @ObfuscatedName("dd.f")
    public static final class119 field1932 = new class119(0);

    @ObfuscatedName("dd.k")
    public static final class119 field1926 = new class119(1);

    @ObfuscatedName("dd.y")
    public static final class119 field1927 = new class119(2);

    @ObfuscatedName("dd.e")
    public final int field1928;

    @ObfuscatedName("cb.f(I)[Ldd;")
    public static class119[] method1811() {
        return new class119[] { field1926, field1932, field1927 };
    }

    public class119(int arg0) {
        this.field1928 = arg0;
    }

    @ObfuscatedName("u.k(II)Ldd;")
    public static class119 method182(int arg0) {
        class119[] var1 = method1811();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class119 var3 = var1[var2];
            if (var3.field1928 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
