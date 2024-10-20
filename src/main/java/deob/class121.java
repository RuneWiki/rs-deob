package deob;

@ObfuscatedName("dl")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dw.i(B)J")
    public static synchronized long method2124() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2017) {
            Statics.field2009 += Statics.field2017 - var0;
        }
        Statics.field2017 = var0;
        return Statics.field2009 + var0;
    }
}
