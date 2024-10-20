package deob;

@ObfuscatedName("dj")
public class class115 {

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.k(I)J")
    public static synchronized long method124() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1927) {
            Statics.field1931 += Statics.field1927 - var0;
        }
        Statics.field1927 = var0;
        return Statics.field1931 + var0;
    }
}
