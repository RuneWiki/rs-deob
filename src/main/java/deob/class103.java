package deob;

@ObfuscatedName("cz")
public class class103 {

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cw.g(B)J")
    public static synchronized long method1837() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1833) {
            Statics.field1829 += Statics.field1833 - var0;
        }
        Statics.field1833 = var0;
        return Statics.field1829 + var0;
    }
}
