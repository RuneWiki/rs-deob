package deob;

@ObfuscatedName("dy")
public class class119 {

    public class119() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.e(I)J")
    public static synchronized long method415() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2035) {
            Statics.field2038 += Statics.field2035 - var0;
        }
        Statics.field2035 = var0;
        return Statics.field2038 + var0;
    }
}
