package deob;

@ObfuscatedName("cq")
public class class104 {

    public class104() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.g(I)J")
    public static synchronized long method528() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1806) {
            Statics.field1802 += Statics.field1806 - var0;
        }
        Statics.field1806 = var0;
        return Statics.field1802 + var0;
    }
}
