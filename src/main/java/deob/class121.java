package deob;

@ObfuscatedName("dr")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.a(B)J")
    public static synchronized long method245() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2002) {
            Statics.field344 += Statics.field2002 - var0;
        }
        Statics.field2002 = var0;
        return Statics.field344 + var0;
    }
}
