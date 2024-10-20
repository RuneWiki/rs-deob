package deob;

@ObfuscatedName("cl")
public class class103 {

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.e(B)J")
    public static synchronized long method527() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1815) {
            Statics.field1813 += Statics.field1815 - var0;
        }
        Statics.field1815 = var0;
        return Statics.field1813 + var0;
    }
}
