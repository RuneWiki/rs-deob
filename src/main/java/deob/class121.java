package deob;

@ObfuscatedName("dk")
public class class121 {

    @ObfuscatedName("dk.b")
    public static final class121 field1924 = new class121(0);

    @ObfuscatedName("dk.e")
    public static final class121 field1925 = new class121(1);

    @ObfuscatedName("dk.i")
    public static final class121 field1927 = new class121(2);

    @ObfuscatedName("dk.k")
    public final int field1929;

    @ObfuscatedName("cv.b(I)[Ldk;")
    public static class121[] method1865() {
        return new class121[] { field1924, field1927, field1925 };
    }

    public class121(int arg0) {
        this.field1929 = arg0;
    }

    @ObfuscatedName("o.e(II)Ldk;")
    public static class121 method80(int arg0) {
        class121[] var1 = method1865();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class121 var3 = var1[var2];
            if (var3.field1929 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
