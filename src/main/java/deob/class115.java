package deob;

@ObfuscatedName("dd")
public class class115 {

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cd.j(I)J")
    public static synchronized long method2038() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1962) {
            Statics.field1959 += Statics.field1962 - var0;
        }
        Statics.field1962 = var0;
        return Statics.field1959 + var0;
    }
}
