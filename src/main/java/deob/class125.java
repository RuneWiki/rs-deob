package deob;

@ObfuscatedName("dc")
public class class125 {

    @ObfuscatedName("dc.j")
    public static final class125 field1956 = new class125(0);

    @ObfuscatedName("dc.y")
    public static final class125 field1952 = new class125(1);

    @ObfuscatedName("dc.z")
    public static final class125 field1954 = new class125(2);

    @ObfuscatedName("dc.l")
    public final int field1951;

    public class125(int arg0) {
        this.field1951 = arg0;
    }

    @ObfuscatedName("dm.j(IS)Ldc;")
    public static class125 method2568(int arg0) {
        class125[] var1 = new class125[] { field1954, field1952, field1956 };
        class125[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class125 var4 = var2[var3];
            if (var4.field1951 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
