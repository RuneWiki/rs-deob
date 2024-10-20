package deob;

@ObfuscatedName("di")
public class class130 {

    @ObfuscatedName("di.o")
    public static final class130 field2051 = new class130(0);

    @ObfuscatedName("di.f")
    public static final class130 field2045 = new class130(1);

    @ObfuscatedName("di.i")
    public static final class130 field2048 = new class130(2);

    @ObfuscatedName("di.h")
    public final int field2047;

    public class130(int arg0) {
        this.field2047 = arg0;
    }

    @ObfuscatedName("dc.o(II)Ldi;")
    public static class130 method2496(int arg0) {
        class130[] var1 = new class130[] { field2051, field2045, field2048 };
        class130[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class130 var4 = var2[var3];
            if (var4.field2047 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
