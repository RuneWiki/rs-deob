package deob;

@ObfuscatedName("df")
public class class119 {

    @ObfuscatedName("df.x")
    public static final class119 field1914 = new class119(0);

    @ObfuscatedName("df.v")
    public static final class119 field1913 = new class119(1);

    @ObfuscatedName("df.m")
    public static final class119 field1918 = new class119(2);

    @ObfuscatedName("df.e")
    public final int field1915;

    @ObfuscatedName("h.x(I)[Ldf;")
    public static class119[] method28() {
        return new class119[] { field1913, field1914, field1918 };
    }

    public class119(int arg0) {
        this.field1915 = arg0;
    }

    @ObfuscatedName("de.v(II)Ldf;")
    public static class119 method2435(int arg0) {
        class119[] var1 = method28();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class119 var3 = var1[var2];
            if (var3.field1915 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
