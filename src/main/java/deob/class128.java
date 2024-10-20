package deob;

@ObfuscatedName("dz")
public class class128 {

    @ObfuscatedName("dz.n")
    public static boolean field1717 = false;

    @ObfuscatedName("dz.h")
    public static int field1723 = 0;

    @ObfuscatedName("dz.l")
    public static int field1719 = 0;

    @ObfuscatedName("dz.g")
    public static boolean field1720 = false;

    @ObfuscatedName("dz.m")
    public static int field1726 = 0;

    @ObfuscatedName("dz.v")
    public static long[] field1731 = new long[1000];

    public class128() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gd.n(II)J")
    public static long method3734(int arg0) {
        return field1731[arg0];
    }

    @ObfuscatedName("ce.h(II)I")
    public static int method1942(int arg0) {
        return method4430(field1731[arg0]);
    }

    @ObfuscatedName("im.l(J)I")
    public static int method4430(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("av.g(J)I")
    public static int method731(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("cr.b(J)I")
    public static int method1929(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("d.a(J)Z")
    public static boolean method107(long arg0) {
        return (int) (arg0 >>> 16 & 0x1L) == 1;
    }

    @ObfuscatedName("ab.c(IS)I")
    public static int method639(int arg0) {
        return method1149(field1731[arg0]);
    }

    @ObfuscatedName("ba.z(J)I")
    public static int method1149(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("client.j(IIIZII)J")
    public static long method1570(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("fs.d(I)V")
    public static final void method3441() {
        field1717 = false;
        field1726 = 0;
    }

    @ObfuscatedName("dd.i(J)V")
    public static final void method2781(long arg0) {
        field1731[++field1726 - 1] = arg0;
    }

    @ObfuscatedName("d.m(B)Z")
    public static final boolean method84() {
        return field1717;
    }

    @ObfuscatedName("q.v(Ldq;IIII)Z")
    public static final boolean method283(class127 arg0, int arg1, int arg2, int arg3) {
        if (!method84()) {
            return false;
        }
        if (!field1720) {
            int var4 = Statics.field1812;
            int var5 = Statics.field1813;
            int var6 = Statics.field1838;
            int var7 = Statics.field1815;
            byte var8 = 50;
            short var9 = 3500;
            int var10 = (field1723 - Statics.field1755) * var8 / class130.field1750;
            int var11 = (field1719 - Statics.field1756) * var8 / class130.field1750;
            int var12 = (field1723 - Statics.field1755) * var9 / class130.field1750;
            int var13 = (field1719 - Statics.field1756) * var9 / class130.field1750;
            int var14 = class130.method2806(var11, var8, var5, var4);
            int var15 = class130.method2851(var11, var8, var5, var4);
            int var17 = class130.method2806(var13, var9, var5, var4);
            int var18 = class130.method2851(var13, var9, var5, var4);
            int var20 = class130.method2804(var10, var15, var7, var6);
            int var21 = class130.method2805(var10, var15, var7, var6);
            int var23 = class130.method2804(var12, var18, var7, var6);
            int var24 = class130.method2805(var12, var18, var7, var6);
            Statics.field1721 = (var20 + var23) / 2;
            Statics.field1718 = (var14 + var17) / 2;
            Statics.field1727 = (var21 + var24) / 2;
            Statics.field1724 = (var23 - var20) / 2;
            Statics.field1725 = (var17 - var14) / 2;
            Statics.field1230 = (var24 - var21) / 2;
            Statics.field1418 = Math.abs(Statics.field1724);
            Statics.field3299 = Math.abs(Statics.field1725);
            Statics.field2 = Math.abs(Statics.field1230);
        }
        int var26 = arg0.field1679 + arg1;
        int var27 = arg0.field1680 + arg2;
        int var28 = arg0.field1681 + arg3;
        int var29 = arg0.field1682;
        int var30 = arg0.field1683;
        int var31 = arg0.field1685;
        int var32 = Statics.field1721 - var26;
        int var33 = Statics.field1718 - var27;
        int var34 = Statics.field1727 - var28;
        if (Math.abs(var32) > Statics.field1418 + var29) {
            return false;
        } else if (Math.abs(var33) > Statics.field3299 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field2 + var31) {
            return false;
        } else if (Math.abs(Statics.field1725 * var34 - Statics.field1230 * var33) > Statics.field3299 * var31 + Statics.field2 * var30) {
            return false;
        } else if (Math.abs(Statics.field1230 * var32 - Statics.field1724 * var34) > Statics.field2 * var29 + Statics.field1418 * var31) {
            return false;
        } else {
            return Math.abs(Statics.field1724 * var33 - Statics.field1725 * var32) <= Statics.field3299 * var29 + Statics.field1418 * var30;
        }
    }

    @ObfuscatedName("ao.r(IIIIIIIB)Z")
    public static final boolean method559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1719 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1719 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1723 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1723 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}
