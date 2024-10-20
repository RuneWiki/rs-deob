package deob;

@ObfuscatedName("du")
public class class115 {

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ct.n(B)J")
    public static synchronized long method1998() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1955) {
            Statics.field1952 += Statics.field1955 - var0;
        }
        Statics.field1955 = var0;
        return Statics.field1952 + var0;
    }
}
