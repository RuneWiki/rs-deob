package deob;

@ObfuscatedName("dr")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.g(B)J")
    public static synchronized long method226() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1999) {
            Statics.field1995 += Statics.field1999 - var0;
        }
        Statics.field1999 = var0;
        return Statics.field1995 + var0;
    }
}
