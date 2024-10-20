package deob;

@ObfuscatedName("ew")
public class class132 {

    @ObfuscatedName("ew.s")
    public static boolean field1880 = false;

    @ObfuscatedName("ew.g")
    public static int field1883 = 0;

    @ObfuscatedName("ew.m")
    public static int field1879 = 0;

    @ObfuscatedName("ew.h")
    public static boolean field1881 = false;

    @ObfuscatedName("ew.f")
    public static int field1878 = 0;

    @ObfuscatedName("ew.q")
    public static int[] field1884 = new int[1000];

    public class132() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.s(I)V")
    public static final void method156() {
        field1880 = false;
        field1878 = 0;
    }

    @ObfuscatedName("ez.g(IB)V")
    public static final void method2953(int arg0) {
        field1884[++field1878 - 1] = arg0;
    }

    @ObfuscatedName("cl.m(I)V")
    public static final void method1892() {
        if (field1881) {
            return;
        }
        int var0 = Statics.field1994;
        int var1 = Statics.field1998;
        int var2 = Statics.field1978;
        int var3 = Statics.field1989;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field1883 - Statics.field1901) * var4 / class134.field1913;
        int var7 = (field1879 - Statics.field1906) * var4 / class134.field1913;
        int var8 = (field1883 - Statics.field1901) * var5 / class134.field1913;
        int var9 = (field1879 - Statics.field1906) * var5 / class134.field1913;
        int var10 = class134.method2647(var7, var4, var1, var0);
        int var11 = class134.method2661(var7, var4, var1, var0);
        int var13 = class134.method2647(var9, var5, var1, var0);
        int var14 = class134.method2661(var9, var5, var1, var0);
        int var16 = class134.method2645(var6, var11, var3, var2);
        int var17 = class134.method2646(var6, var11, var3, var2);
        int var19 = class134.method2645(var8, var14, var3, var2);
        int var20 = class134.method2646(var8, var14, var3, var2);
        Statics.field446 = (var16 + var19) / 2;
        Statics.field2531 = (var10 + var13) / 2;
        Statics.field29 = (var17 + var20) / 2;
        Statics.field1882 = (var19 - var16) / 2;
        Statics.field2710 = (var13 - var10) / 2;
        Statics.field426 = (var20 - var17) / 2;
        Statics.field2693 = Math.abs(Statics.field1882);
        Statics.field1317 = Math.abs(Statics.field2710);
        Statics.field483 = Math.abs(Statics.field426);
    }

    @ObfuscatedName("fk.h(Les;IIII)Z")
    public static final boolean method3045(class131 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1880;
        if (!var4) {
            return false;
        }
        method1892();
        int var5 = arg0.field1812 + arg1;
        int var6 = arg0.field1816 + arg2;
        int var7 = arg0.field1842 + arg3;
        int var8 = arg0.field1843;
        int var9 = arg0.field1875;
        int var10 = arg0.field1809;
        int var11 = Statics.field446 - var5;
        int var12 = Statics.field2531 - var6;
        int var13 = Statics.field29 - var7;
        if (Math.abs(var11) > Statics.field2693 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field1317 + var9) {
            return false;
        } else if (Math.abs(var13) > Statics.field483 + var10) {
            return false;
        } else if (Math.abs(Statics.field2710 * var13 - Statics.field426 * var12) > Statics.field483 * var9 + Statics.field1317 * var10) {
            return false;
        } else if (Math.abs(Statics.field426 * var11 - Statics.field1882 * var13) > Statics.field483 * var8 + Statics.field2693 * var10) {
            return false;
        } else {
            return Math.abs(Statics.field1882 * var12 - Statics.field2710 * var11) <= Statics.field2693 * var9 + Statics.field1317 * var8;
        }
    }

    @ObfuscatedName("n.i(IIIIIIII)Z")
    public static final boolean method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1879 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1879 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1883 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1883 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}
