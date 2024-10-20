package deob;

@ObfuscatedName("cj")
public class class103 {

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.g(I)J")
    public static synchronized long method19() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1820) {
            Statics.field1818 += Statics.field1820 - var0;
        }
        Statics.field1820 = var0;
        return Statics.field1818 + var0;
    }
}
