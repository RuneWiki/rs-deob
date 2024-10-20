package deob;

@ObfuscatedName("dz")
public class class119 {

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.s(I)J")
    public static synchronized long method2280() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2010) {
            Statics.field575 += Statics.field2010 - var0;
        }
        Statics.field2010 = var0;
        return Statics.field575 + var0;
    }
}
