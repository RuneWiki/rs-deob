package deob;

@ObfuscatedName("dx")
public class class115 {

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("c.a(I)J")
    public static synchronized long method207() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1967) {
            Statics.field1964 += Statics.field1967 - var0;
        }
        Statics.field1967 = var0;
        return Statics.field1964 + var0;
    }
}
