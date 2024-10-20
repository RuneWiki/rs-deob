package deob;

@ObfuscatedName("du")
public class class119 {

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ff.k(I)J")
    public static synchronized long method3068() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2033) {
            Statics.field2695 += Statics.field2033 - var0;
        }
        Statics.field2033 = var0;
        return Statics.field2695 + var0;
    }
}
