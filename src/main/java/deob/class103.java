package deob;

@ObfuscatedName("co")
public class class103 {

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.e(I)J")
    public static synchronized long method833() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1816) {
            Statics.field1815 += Statics.field1816 - var0;
        }
        Statics.field1816 = var0;
        return Statics.field1815 + var0;
    }
}
