package deob;

@ObfuscatedName("dg")
public class class115 {

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.f(I)J")
    public static synchronized long method645() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1979) {
            Statics.field1975 += Statics.field1979 - var0;
        }
        Statics.field1979 = var0;
        return Statics.field1975 + var0;
    }
}
