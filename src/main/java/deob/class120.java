package deob;

@ObfuscatedName("dg")
public class class120 {

    public class120() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("as.c(I)J")
    public static synchronized long method774() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2010) {
            Statics.field1983 += Statics.field2010 - var0;
        }
        Statics.field2010 = var0;
        return Statics.field1983 + var0;
    }
}
