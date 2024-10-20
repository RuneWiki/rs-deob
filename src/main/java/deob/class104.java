package deob;

@ObfuscatedName("cj")
public class class104 {

    public class104() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bd.f(I)J")
    public static synchronized long method1417() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2924) {
            Statics.field1827 += Statics.field2924 - var0;
        }
        Statics.field2924 = var0;
        return Statics.field1827 + var0;
    }
}
