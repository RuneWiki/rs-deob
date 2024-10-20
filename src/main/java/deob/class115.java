package deob;

@ObfuscatedName("df")
public class class115 {

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cn.m(I)J")
    public static synchronized long method2177() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1938) {
            Statics.field1935 += Statics.field1938 - var0;
        }
        Statics.field1938 = var0;
        return Statics.field1935 + var0;
    }
}
