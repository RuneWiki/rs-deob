package deob;

@ObfuscatedName("dd")
public class class116 {

    public class116() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("es.f(I)J")
    public static synchronized long method2672() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1980) {
            Statics.field1982 += Statics.field1980 - var0;
        }
        Statics.field1980 = var0;
        return Statics.field1982 + var0;
    }
}
