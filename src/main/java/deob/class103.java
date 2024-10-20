package deob;

@ObfuscatedName("cz")
public class class103 {

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dr.k(B)J")
    public static synchronized long method2455() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field900) {
            Statics.field1837 += Statics.field900 - var0;
        }
        Statics.field900 = var0;
        return Statics.field1837 + var0;
    }
}
