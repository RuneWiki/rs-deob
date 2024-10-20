package deob;

@ObfuscatedName("es")
public class class100 {

    @ObfuscatedName("es.o")
    public static final class100 field1379 = new class100("RC", 1);

    @ObfuscatedName("es.j")
    public static final class100 field1374 = new class100("LIVE", 0);

    @ObfuscatedName("es.h")
    public final String field1375;

    @ObfuscatedName("es.t")
    public static final class100 field1371 = new class100("WIP", 2);

    @ObfuscatedName("es.r")
    public final int field1376;

    @ObfuscatedName("es.p")
    public static final class100 field1372 = new class100("BUILDLIVE", 3);

    public class100(String arg0, int arg1) {
        this.field1375 = arg0;
        this.field1376 = arg1;
    }

    @ObfuscatedName("d.j(S)[Les;")
    public static class100[] method824() {
        return new class100[] { field1372, field1374, field1379, field1371 };
    }

    @ObfuscatedName("l.p(II)Les;")
    public static class100 method936(int arg0) {
        class100[] var1 = method824();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class100 var3 = var1[var2];
            if (var3.field1376 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
