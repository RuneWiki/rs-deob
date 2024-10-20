package deob;

@ObfuscatedName("cg")
public class class103 {

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("c.g(B)J")
    public static synchronized long method494() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2015) {
            Statics.field1815 += Statics.field2015 - var0;
        }
        Statics.field2015 = var0;
        return Statics.field1815 + var0;
    }
}
