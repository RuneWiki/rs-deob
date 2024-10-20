package deob;

@ObfuscatedName("cj")
public class class104 {

    public class104() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("en.l(I)J")
    public static synchronized long method2616() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field1801) {
            Statics.field1798 += Statics.field1801 - var0;
        }
        Statics.field1801 = var0;
        return Statics.field1798 + var0;
    }
}
