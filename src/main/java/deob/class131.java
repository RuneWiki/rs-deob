package deob;

@ObfuscatedName("eh")
public class class131 {

    @ObfuscatedName("eh.b")
    public static final class131 field2043 = new class131(0);

    @ObfuscatedName("eh.g")
    public static final class131 field2044 = new class131(1);

    @ObfuscatedName("eh.j")
    public static final class131 field2045 = new class131(2);

    @ObfuscatedName("eh.d")
    public final int field2046;

    @ObfuscatedName("cn.b(I)[Leh;")
    public static class131[] method2026() {
        return new class131[] { field2043, field2044, field2045 };
    }

    public class131(int arg0) {
        this.field2046 = arg0;
    }

    @ObfuscatedName("gn.g(II)Leh;")
    public static class131 method3477(int arg0) {
        class131[] var1 = method2026();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class131 var3 = var1[var2];
            if (var3.field2046 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
