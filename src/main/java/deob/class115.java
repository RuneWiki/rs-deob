package deob;

@ObfuscatedName("dc")
public class class115 {

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ce.i(I)J")
    public static synchronized long method2134() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1959) {
            Statics.field1958 += Statics.field1959 - var0;
        }
        Statics.field1959 = var0;
        return Statics.field1958 + var0;
    }
}
