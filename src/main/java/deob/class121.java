package deob;

@ObfuscatedName("dw")
public class class121 {

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bi.d(I)J")
    public static synchronized long method1250() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2004) {
            Statics.field2005 += Statics.field2004 - var0;
        }
        Statics.field2004 = var0;
        return Statics.field2005 + var0;
    }
}
