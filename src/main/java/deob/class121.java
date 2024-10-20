package deob;

@ObfuscatedName("dz")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.p(B)J")
    public static synchronized long method548() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2001) {
            Statics.field2004 += Statics.field2001 - var0;
        }
        Statics.field2001 = var0;
        return Statics.field2004 + var0;
    }
}
