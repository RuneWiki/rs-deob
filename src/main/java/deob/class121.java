package deob;

@ObfuscatedName("du")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ea.t(B)J")
    public static synchronized long method2693() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2032) {
            Statics.field2028 += Statics.field2032 - var0;
        }
        Statics.field2032 = var0;
        return Statics.field2028 + var0;
    }
}
