package deob;

@ObfuscatedName("dc")
public class class115 {

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.v(B)J")
    public static synchronized long method819() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field585) {
            Statics.field1965 += Statics.field585 - var0;
        }
        Statics.field585 = var0;
        return Statics.field1965 + var0;
    }
}
