package deob;

@ObfuscatedName("da")
public class class115 {

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eo.c(B)J")
    public static synchronized long method2622() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1940) {
            Statics.field1938 += Statics.field1940 - var0;
        }
        Statics.field1940 = var0;
        return Statics.field1938 + var0;
    }
}
