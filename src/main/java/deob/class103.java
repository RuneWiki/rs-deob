package deob;

@ObfuscatedName("cn")
public class class103 {

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ak.j(B)J")
    public static synchronized long method553() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1831) {
            Statics.field1829 += Statics.field1831 - var0;
        }
        Statics.field1831 = var0;
        return Statics.field1829 + var0;
    }
}
