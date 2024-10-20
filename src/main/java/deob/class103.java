package deob;

@ObfuscatedName("co")
public class class103 {

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ce.e(B)J")
    public static synchronized long method1957() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1823) {
            Statics.field1816 += Statics.field1823 - var0;
        }
        Statics.field1823 = var0;
        return Statics.field1816 + var0;
    }
}
