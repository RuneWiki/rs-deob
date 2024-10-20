package deob;

@ObfuscatedName("dd")
public class class122 {

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.i(I)J")
    public static synchronized long method195() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2011) {
            Statics.field2010 += Statics.field2011 - var0;
        }
        Statics.field2011 = var0;
        return Statics.field2010 + var0;
    }
}
