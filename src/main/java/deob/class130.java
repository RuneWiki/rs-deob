package deob;

@ObfuscatedName("di")
public class class130 {

    @ObfuscatedName("di.m")
    public static final class130 field2020 = new class130(0);

    @ObfuscatedName("di.l")
    public static final class130 field2021 = new class130(1);

    @ObfuscatedName("di.y")
    public static final class130 field2019 = new class130(2);

    @ObfuscatedName("di.u")
    public final int field2022;

    @ObfuscatedName("l.m(I)[Ldi;")
    public static class130[] method7() {
        return new class130[] { field2019, field2021, field2020 };
    }

    public class130(int arg0) {
        this.field2022 = arg0;
    }

    @ObfuscatedName("c.l(IB)Ldi;")
    public static class130 method161(int arg0) {
        class130[] var1 = method7();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class130 var3 = var1[var2];
            if (var3.field2022 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
