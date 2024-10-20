package deob;

@ObfuscatedName("cz")
public class class103 {

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.k(B)J")
    public static synchronized long method470() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1832) {
            Statics.field1833 += Statics.field1832 - var0;
        }
        Statics.field1832 = var0;
        return Statics.field1833 + var0;
    }
}
