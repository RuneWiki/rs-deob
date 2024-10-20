package deob;

@ObfuscatedName("de")
public class class130 {

    @ObfuscatedName("de.k")
    public static final class130 field2022 = new class130(0);

    @ObfuscatedName("de.h")
    public static final class130 field2017 = new class130(1);

    @ObfuscatedName("de.o")
    public static final class130 field2019 = new class130(2);

    @ObfuscatedName("de.z")
    public final int field2018;

    @ObfuscatedName("a.k(I)[Lde;")
    public static class130[] method181() {
        return new class130[] { field2017, field2022, field2019 };
    }

    public class130(int arg0) {
        this.field2018 = arg0;
    }

    @ObfuscatedName("m.h(II)Lde;")
    public static class130 method190(int arg0) {
        class130[] var1 = method181();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class130 var3 = var1[var2];
            if (var3.field2018 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
