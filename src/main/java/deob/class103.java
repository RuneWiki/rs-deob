package deob;

@ObfuscatedName("ca")
public class class103 {

    public class103() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bf.n(B)J")
    public static synchronized long method1066() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1804) {
            Statics.field1800 += Statics.field1804 - var0;
        }
        Statics.field1804 = var0;
        return Statics.field1800 + var0;
    }
}
