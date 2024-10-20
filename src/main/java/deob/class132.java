package deob;

@ObfuscatedName("ex")
public class class132 {

    @ObfuscatedName("ex.b")
    public static boolean field1872 = false;

    @ObfuscatedName("ex.q")
    public static int field1875 = 0;

    @ObfuscatedName("ex.o")
    public static int field1874 = 0;

    @ObfuscatedName("ex.p")
    public static boolean field1877 = false;

    @ObfuscatedName("ex.v")
    public static int field1878 = 0;

    @ObfuscatedName("ex.s")
    public static int[] field1879 = new int[1000];

    public class132() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bw.b(III)V")
    public static final void method1027(int arg0, int arg1) {
        field1875 = arg0;
        field1874 = arg1;
        field1872 = true;
        field1878 = 0;
        field1877 = false;
    }

    @ObfuscatedName("am.q(II)V")
    public static final void method229(int arg0) {
        field1879[++field1878 - 1] = arg0;
    }

    @ObfuscatedName("aj.o(I)V")
    public static final void method256() {
        if (field1877) {
            return;
        }
        int var0 = Statics.field1940;
        int var1 = Statics.field1959;
        int var2 = Statics.field1932;
        int var3 = Statics.field1978;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field1875 - Statics.field1903) * var4 / class134.field1898;
        int var7 = (field1874 - Statics.field1904) * var4 / class134.field1898;
        int var8 = (field1875 - Statics.field1903) * var5 / class134.field1898;
        int var9 = (field1874 - Statics.field1904) * var5 / class134.field1898;
        int var10 = class134.method2662(var7, var4, var1, var0);
        int var11 = class134.method2616(var7, var4, var1, var0);
        int var13 = class134.method2662(var9, var5, var1, var0);
        int var14 = class134.method2616(var9, var5, var1, var0);
        int var16 = class134.method2613(var6, var11, var3, var2);
        int var17 = class134.method2661(var6, var11, var3, var2);
        int var19 = class134.method2613(var8, var14, var3, var2);
        int var20 = class134.method2661(var8, var14, var3, var2);
        Statics.field2252 = (var16 + var19) / 2;
        Statics.field2092 = (var10 + var13) / 2;
        Statics.field295 = (var17 + var20) / 2;
        Statics.field1876 = (var19 - var16) / 2;
        Statics.field600 = (var13 - var10) / 2;
        Statics.field1873 = (var20 - var17) / 2;
        Statics.field814 = Math.abs(Statics.field1876);
        Statics.field301 = Math.abs(Statics.field600);
        Statics.field275 = Math.abs(Statics.field1873);
    }

    @ObfuscatedName("a.p(Lee;IIII)Z")
    public static final boolean method5(class131 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1872;
        if (!var4) {
            return false;
        }
        method256();
        int var5 = arg0.field1823 + arg1;
        int var6 = arg0.field1835 + arg2;
        int var7 = arg0.field1836 + arg3;
        int var8 = arg0.field1837;
        int var9 = arg0.field1826;
        int var10 = arg0.field1868;
        int var11 = Statics.field2252 - var5;
        int var12 = Statics.field2092 - var6;
        int var13 = Statics.field295 - var7;
        if (Math.abs(var11) > Statics.field814 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field301 + var9) {
            return false;
        } else if (Math.abs(var13) > Statics.field275 + var10) {
            return false;
        } else if (Math.abs(Statics.field600 * var13 - Statics.field1873 * var12) > Statics.field301 * var10 + Statics.field275 * var9) {
            return false;
        } else if (Math.abs(Statics.field1873 * var11 - Statics.field1876 * var13) > Statics.field814 * var10 + Statics.field275 * var8) {
            return false;
        } else {
            return Math.abs(Statics.field1876 * var12 - Statics.field600 * var11) <= Statics.field814 * var9 + Statics.field301 * var8;
        }
    }
}
