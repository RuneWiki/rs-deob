package deob;

@ObfuscatedName("da")
public class class119 {

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.f(I)J")
    public static synchronized long method137() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2034) {
            Statics.field2035 += Statics.field2034 - var0;
        }
        Statics.field2034 = var0;
        return Statics.field2035 + var0;
    }
}
