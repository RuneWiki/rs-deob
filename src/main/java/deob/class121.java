package deob;

@ObfuscatedName("dy")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.f(I)J")
    public static synchronized long method133() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2000) {
            Statics.field2003 += Statics.field2000 - var0;
        }
        Statics.field2000 = var0;
        return Statics.field2003 + var0;
    }
}
