package deob;

@ObfuscatedName("dn")
public class class115 {

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.g(I)J")
    public static synchronized long method579() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1956) {
            Statics.field789 += Statics.field1956 - var0;
        }
        Statics.field1956 = var0;
        return Statics.field789 + var0;
    }
}
