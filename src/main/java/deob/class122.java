package deob;

@ObfuscatedName("di")
public class class122 {

    @ObfuscatedName("di.n")
    public static final class122 field1960 = new class122(0);

    @ObfuscatedName("di.o")
    public static final class122 field1965 = new class122(1);

    @ObfuscatedName("di.a")
    public static final class122 field1959 = new class122(2);

    @ObfuscatedName("di.w")
    public final int field1961;

    public class122(int arg0) {
        this.field1961 = arg0;
    }

    @ObfuscatedName("i.n(IS)Ldi;")
    public static class122 method86(int arg0) {
        class122[] var1 = new class122[] { field1965, field1959, field1960 };
        class122[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class122 var4 = var2[var3];
            if (var4.field1961 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
