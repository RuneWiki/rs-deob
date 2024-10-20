package deob;

@ObfuscatedName("cn")
public class class100 {

    public class100() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.m(I)J")
    public static synchronized long method100() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1786) {
            Statics.field1788 += Statics.field1786 - var0;
        }
        Statics.field1786 = var0;
        return Statics.field1788 + var0;
    }
}
