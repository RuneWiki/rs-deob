package deob;

@ObfuscatedName("db")
public class class115 {

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.y(B)J")
    public static synchronized long method671() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1951) {
            Statics.field637 += Statics.field1951 - var0;
        }
        Statics.field1951 = var0;
        return Statics.field637 + var0;
    }
}
