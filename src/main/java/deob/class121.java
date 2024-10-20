package deob;

@ObfuscatedName("dm")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("db.b(I)J")
    public static synchronized long method2221() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2001) {
            Statics.field2000 += Statics.field2001 - var0;
        }
        Statics.field2001 = var0;
        return Statics.field2000 + var0;
    }
}
