package deob;

@ObfuscatedName("dt")
public class class116 {

    public class116() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("en.e(S)J")
    public static synchronized long method2794() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1956) {
            Statics.field1955 += Statics.field1956 - var0;
        }
        Statics.field1956 = var0;
        return Statics.field1955 + var0;
    }
}
