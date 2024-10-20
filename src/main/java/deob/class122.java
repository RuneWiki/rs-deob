package deob;

@ObfuscatedName("dd")
public class class122 {

    public class122() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.e(B)J")
    public static synchronized long method37() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2009) {
            Statics.field2007 += Statics.field2009 - var0;
        }
        Statics.field2009 = var0;
        return Statics.field2007 + var0;
    }
}
