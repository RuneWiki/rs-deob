package deob;

@ObfuscatedName("dl")
public class class121 {

    @ObfuscatedName("dl.v")
    public static final class121 field1926 = new class121(0);

    @ObfuscatedName("dl.t")
    public static final class121 field1921 = new class121(1);

    @ObfuscatedName("dl.f")
    public static final class121 field1922 = new class121(2);

    @ObfuscatedName("dl.j")
    public final int field1923;

    @ObfuscatedName("dm.v(I)[Ldl;")
    public static class121[] method2582() {
        return new class121[] { field1926, field1922, field1921 };
    }

    public class121(int arg0) {
        this.field1923 = arg0;
    }

    @ObfuscatedName("p.t(II)Ldl;")
    public static class121 method81(int arg0) {
        class121[] var1 = method2582();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class121 var3 = var1[var2];
            if (var3.field1923 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
