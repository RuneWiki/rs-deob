package deob;

@ObfuscatedName("ds")
public class class119 {

    @ObfuscatedName("ds.g")
    public static final class119 field1892 = new class119(0);

    @ObfuscatedName("ds.j")
    public static final class119 field1897 = new class119(1);

    @ObfuscatedName("ds.z")
    public static final class119 field1893 = new class119(2);

    @ObfuscatedName("ds.b")
    public final int field1895;

    public class119(int arg0) {
        this.field1895 = arg0;
    }

    @ObfuscatedName("da.g(II)Lds;")
    public static class119 method2352(int arg0) {
        class119[] var1 = new class119[] { field1893, field1897, field1892 };
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
