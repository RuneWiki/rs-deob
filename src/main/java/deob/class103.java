package deob;

@ObfuscatedName("ck")
public class class103 {

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ch.t(I)J")
    public static synchronized long method2037() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1812) {
            Statics.field1984 += Statics.field1812 - var0;
        }
        Statics.field1812 = var0;
        return Statics.field1984 + var0;
    }
}
