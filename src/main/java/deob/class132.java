package deob;

@ObfuscatedName("er")
public class class132 {

    @ObfuscatedName("er.p")
    public static boolean field1877 = false;

    @ObfuscatedName("er.i")
    public static int field1871 = 0;

    @ObfuscatedName("er.w")
    public static int field1872 = 0;

    @ObfuscatedName("er.s")
    public static boolean field1873 = false;

    @ObfuscatedName("er.v")
    public static int field1878 = 0;

    @ObfuscatedName("er.n")
    public static int[] field1875 = new int[1000];

    public class132() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ig.p(I)V")
    public static final void method4012() {
        field1877 = false;
        field1878 = 0;
    }

    @ObfuscatedName("ak.i(I)I")
    public static final int method623() {
        return field1871;
    }

    @ObfuscatedName("o.w(S)I")
    public static final int method61() {
        return field1872;
    }

    @ObfuscatedName("l.s(Len;IIII)Z")
    public static final boolean method133(class131 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1877;
        if (!var4) {
            return false;
        }
        if (!field1873) {
            int var5 = Statics.field1956;
            int var6 = Statics.field1991;
            int var7 = Statics.field1958;
            int var8 = Statics.field1959;
            byte var9 = 50;
            short var10 = 3500;
            int var11 = (field1871 - Statics.field1907) * var9 / class134.field1896;
            int var12 = (field1872 - Statics.field1898) * var9 / class134.field1896;
            int var13 = (field1871 - Statics.field1907) * var10 / class134.field1896;
            int var14 = (field1872 - Statics.field1898) * var10 / class134.field1896;
            int var15 = class134.method2568(var12, var9, var6, var5);
            int var16 = class134.method2559(var12, var9, var6, var5);
            int var18 = class134.method2568(var14, var10, var6, var5);
            int var19 = class134.method2559(var14, var10, var6, var5);
            int var21 = class134.method2566(var11, var16, var8, var7);
            int var22 = class134.method2567(var11, var16, var8, var7);
            int var24 = class134.method2566(var13, var19, var8, var7);
            int var25 = class134.method2567(var13, var19, var8, var7);
            Statics.field1874 = (var21 + var24) / 2;
            Statics.field3826 = (var15 + var18) / 2;
            Statics.field719 = (var22 + var25) / 2;
            Statics.field418 = (var24 - var21) / 2;
            Statics.field1870 = (var18 - var15) / 2;
            Statics.field1255 = (var25 - var22) / 2;
            Statics.field1876 = Math.abs(Statics.field418);
            Statics.field622 = Math.abs(Statics.field1870);
            Statics.field265 = Math.abs(Statics.field1255);
        }
        int var27 = arg0.field1844 + arg1;
        int var28 = arg0.field1833 + arg2;
        int var29 = arg0.field1834 + arg3;
        int var30 = arg0.field1835;
        int var31 = arg0.field1804;
        int var32 = arg0.field1837;
        int var33 = Statics.field1874 - var27;
        int var34 = Statics.field3826 - var28;
        int var35 = Statics.field719 - var29;
        if (Math.abs(var33) > Statics.field1876 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field622 + var31) {
            return false;
        } else if (Math.abs(var35) > Statics.field265 + var32) {
            return false;
        } else if (Math.abs(Statics.field1870 * var35 - Statics.field1255 * var34) > Statics.field622 * var32 + Statics.field265 * var31) {
            return false;
        } else if (Math.abs(Statics.field1255 * var33 - Statics.field418 * var35) > Statics.field265 * var30 + Statics.field1876 * var32) {
            return false;
        } else {
            return Math.abs(Statics.field418 * var34 - Statics.field1870 * var33) <= Statics.field622 * var30 + Statics.field1876 * var31;
        }
    }
}
