package deob;

@ObfuscatedName("ds")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.i(S)J")
    public static synchronized long method142() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1762) {
            Statics.field2013 += Statics.field1762 - var0;
        }
        Statics.field1762 = var0;
        return Statics.field2013 + var0;
    }
}
