package deob;

@ObfuscatedName("ct")
public class class100 {

    public class100() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.z(B)J")
    public static synchronized long method496() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1791) {
            Statics.field1795 += Statics.field1791 - var0;
        }
        Statics.field1791 = var0;
        return Statics.field1795 + var0;
    }
}
