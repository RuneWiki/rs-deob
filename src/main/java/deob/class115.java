package deob;

@ObfuscatedName("ds")
public class class115 {

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cx.h(I)J")
    public static synchronized long method2082() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1957) {
            Statics.field1955 += Statics.field1957 - var0;
        }
        Statics.field1957 = var0;
        return Statics.field1955 + var0;
    }
}
