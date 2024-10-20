package deob;

@ObfuscatedName("dh")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.i(I)J")
    public static synchronized long method145() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2017) {
            Statics.field2014 += Statics.field2017 - var0;
        }
        Statics.field2017 = var0;
        return Statics.field2014 + var0;
    }
}
