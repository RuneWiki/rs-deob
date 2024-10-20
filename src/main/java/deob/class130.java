package deob;

@ObfuscatedName("di")
public class class130 {

    @ObfuscatedName("di.i")
    public static final class130 field2047 = new class130(0);

    @ObfuscatedName("di.v")
    public static final class130 field2043 = new class130(1);

    @ObfuscatedName("di.r")
    public static final class130 field2044 = new class130(2);

    @ObfuscatedName("di.n")
    public final int field2046;

    @ObfuscatedName("de.i(B)[Ldi;")
    public static class130[] method2616() {
        return new class130[] { field2044, field2043, field2047 };
    }

    public class130(int arg0) {
        this.field2046 = arg0;
    }

    @ObfuscatedName("dh.v(IB)Ldi;")
    public static class130 method2268(int arg0) {
        class130[] var1 = method2616();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class130 var3 = var1[var2];
            if (var3.field2046 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
