package deob;

@ObfuscatedName("dq")
public class class115 {

    public class115() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cv.h(B)J")
    public static synchronized long method2007() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1967) {
            Statics.field1965 += Statics.field1967 - var0;
        }
        Statics.field1967 = var0;
        return Statics.field1965 + var0;
    }
}
