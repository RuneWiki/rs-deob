package deob;

@ObfuscatedName("dy")
public class class130 {

    @ObfuscatedName("dy.h")
    public static final class130 field2041 = new class130(0);

    @ObfuscatedName("dy.q")
    public static final class130 field2044 = new class130(1);

    @ObfuscatedName("dy.v")
    public static final class130 field2040 = new class130(2);

    @ObfuscatedName("dy.n")
    public final int field2043;

    @ObfuscatedName("i.h(I)[Ldy;")
    public static class130[] method174() {
        return new class130[] { field2040, field2044, field2041 };
    }

    public class130(int arg0) {
        this.field2043 = arg0;
    }

    @ObfuscatedName("ee.q(II)Ldy;")
    public static class130 method2976(int arg0) {
        class130[] var1 = method174();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class130 var3 = var1[var2];
            if (var3.field2043 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
