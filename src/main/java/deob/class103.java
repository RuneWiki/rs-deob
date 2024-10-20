package deob;

@ObfuscatedName("cp")
public class class103 {

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.p(I)J")
    public static synchronized long method550() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1816) {
            Statics.field723 += Statics.field1816 - var0;
        }
        Statics.field1816 = var0;
        return Statics.field723 + var0;
    }
}
