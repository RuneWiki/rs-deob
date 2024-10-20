package deob;

@ObfuscatedName("dm")
public class class107 {

    public class107() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dh.o(B)J")
    public static synchronized long method2661() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1836) {
            Statics.field1840 += Statics.field1836 - var0;
        }
        Statics.field1836 = var0;
        return Statics.field1840 + var0;
    }
}
