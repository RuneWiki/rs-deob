package deob;

@ObfuscatedName("co")
public class class103 {

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ba.i(I)J")
    public static synchronized long method1055() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1815) {
            Statics.field1814 += Statics.field1815 - var0;
        }
        Statics.field1815 = var0;
        return Statics.field1814 + var0;
    }
}
