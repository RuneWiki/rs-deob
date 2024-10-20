package deob;

@ObfuscatedName("dg")
public class class119 {

    @ObfuscatedName("dg.l")
    public static final class119 field1894 = new class119(0);

    @ObfuscatedName("dg.y")
    public static final class119 field1898 = new class119(1);

    @ObfuscatedName("dg.g")
    public static final class119 field1893 = new class119(2);

    @ObfuscatedName("dg.j")
    public final int field1895;

    public class119(int arg0) {
        this.field1895 = arg0;
    }

    @ObfuscatedName("cs.l(IS)Ldg;")
    public static class119 method1785(int arg0) {
        class119[] var1 = new class119[] { field1893, field1894, field1898 };
        class119[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class119 var4 = var2[var3];
            if (var4.field1895 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
