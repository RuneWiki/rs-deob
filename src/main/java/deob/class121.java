package deob;

@ObfuscatedName("db")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cz.j(I)J")
    public static synchronized long method2140() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2006) {
            Statics.field2768 += Statics.field2006 - var0;
        }
        Statics.field2006 = var0;
        return Statics.field2768 + var0;
    }
}
