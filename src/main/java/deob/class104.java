package deob;

@ObfuscatedName("cz")
public class class104 {

    public class104() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bk.c(I)J")
    public static synchronized long method1388() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1805) {
            Statics.field3012 += Statics.field1805 - var0;
        }
        Statics.field1805 = var0;
        return Statics.field3012 + var0;
    }
}
