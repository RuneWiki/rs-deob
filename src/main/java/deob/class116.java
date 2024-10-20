package deob;

@ObfuscatedName("dp")
public class class116 {

    public class116() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dq.a(I)J")
    public static synchronized long method2781() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1973) {
            Statics.field1971 += Statics.field1973 - var0;
        }
        Statics.field1973 = var0;
        return Statics.field1971 + var0;
    }
}
