package deob;

@ObfuscatedName("cb")
public class class103 {

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.b(B)J")
    public static synchronized long method29() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1822) {
            Statics.field2874 += Statics.field1822 - var0;
        }
        Statics.field1822 = var0;
        return Statics.field2874 + var0;
    }
}
