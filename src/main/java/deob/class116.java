package deob;

@ObfuscatedName("de")
public class class116 {

    public class116() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cq.b(I)J")
    public static synchronized long method1946() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1957) {
            Statics.field1953 += Statics.field1957 - var0;
        }
        Statics.field1957 = var0;
        return Statics.field1953 + var0;
    }
}
