package deob;

@ObfuscatedName("dt")
public class class115 {

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("l.z(I)J")
    public static synchronized long method82() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1963) {
            Statics.field1964 += Statics.field1963 - var0;
        }
        Statics.field1963 = var0;
        return Statics.field1964 + var0;
    }
}
