package deob;

@ObfuscatedName("dr")
public class class120 {

    public class120() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.g(I)J")
    public static synchronized long method8() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1984) {
            Statics.field1983 += Statics.field1984 - var0;
        }
        Statics.field1984 = var0;
        return Statics.field1983 + var0;
    }
}
