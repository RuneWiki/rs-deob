package deob;

@ObfuscatedName("dw")
public class class115 {

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.n(B)J")
    public static synchronized long method179() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1968) {
            Statics.field1963 += Statics.field1968 - var0;
        }
        Statics.field1968 = var0;
        return Statics.field1963 + var0;
    }
}
