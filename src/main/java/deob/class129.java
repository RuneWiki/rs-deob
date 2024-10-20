package deob;

@ObfuscatedName("db")
public class class129 {

    @ObfuscatedName("db.z")
    public static boolean field1721 = false;

    @ObfuscatedName("db.n")
    public static int field1705 = 0;

    @ObfuscatedName("db.v")
    public static int field1706 = 0;

    @ObfuscatedName("db.u")
    public static boolean field1707 = false;

    @ObfuscatedName("db.a")
    public static int field1713 = 0;

    @ObfuscatedName("db.e")
    public static long[] field1714 = new long[1000];

    public class129() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.z(J)Z")
    public static boolean method282(long arg0) {
        return method1529(arg0) == 2;
    }

    @ObfuscatedName("v.v(J)I")
    public static int method19(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("bs.u(II)I")
    public static int method1017(int arg0) {
        return method514(field1714[arg0]);
    }

    @ObfuscatedName("ab.r(J)I")
    public static int method514(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("co.p(II)I")
    public static int method1870(int arg0) {
        return method1529(field1714[arg0]);
    }

    @ObfuscatedName("client.q(J)I")
    public static int method1529(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("co.m(J)I")
    public static int method1871(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("jc.y(IIIZII)J")
    public static long method4525(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("ax.i(III)V")
    public static final void method515(int arg0, int arg1) {
        field1705 = arg0;
        field1706 = arg1;
        field1721 = true;
        field1713 = 0;
        field1707 = false;
    }

    @ObfuscatedName("cs.c(I)V")
    public static final void method1873() {
        field1721 = false;
        field1713 = 0;
    }

    @ObfuscatedName("fz.b(I)I")
    public static final int method3146() {
        return field1705;
    }

    @ObfuscatedName("bj.o(Ldh;IIII)Z")
    public static final boolean method1007(class128 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1721;
        if (!var4) {
            return false;
        }
        if (!field1707) {
            int var5 = Statics.field1795;
            int var6 = Statics.field1797;
            int var7 = Statics.field1785;
            int var8 = Statics.field1799;
            byte var9 = 50;
            short var10 = 3500;
            int var11 = (field1705 - Statics.field1742) * var9 / class131.field1741;
            int var12 = (field1706 - Statics.field1746) * var9 / class131.field1741;
            int var13 = (field1705 - Statics.field1742) * var10 / class131.field1741;
            int var14 = (field1706 - Statics.field1746) * var10 / class131.field1741;
            int var15 = class131.method2721(var12, var9, var6, var5);
            int var16 = class131.method2713(var12, var9, var6, var5);
            int var18 = class131.method2721(var14, var10, var6, var5);
            int var19 = class131.method2713(var14, var10, var6, var5);
            int var21 = class131.method2719(var11, var16, var8, var7);
            int var22 = class131.method2720(var11, var16, var8, var7);
            int var24 = class131.method2719(var13, var19, var8, var7);
            int var25 = class131.method2720(var13, var19, var8, var7);
            Statics.field1708 = (var21 + var24) / 2;
            Statics.field1709 = (var15 + var18) / 2;
            Statics.field1715 = (var22 + var25) / 2;
            Statics.field1305 = (var24 - var21) / 2;
            Statics.field1719 = (var18 - var15) / 2;
            Statics.field1712 = (var25 - var22) / 2;
            Statics.field2730 = Math.abs(Statics.field1305);
            Statics.field1972 = Math.abs(Statics.field1719);
            Statics.field3288 = Math.abs(Statics.field1712);
        }
        int var27 = arg0.field1666 + arg1;
        int var28 = arg0.field1665 + arg2;
        int var29 = arg0.field1668 + arg3;
        int var30 = arg0.field1669;
        int var31 = arg0.field1687;
        int var32 = arg0.field1671;
        int var33 = Statics.field1708 - var27;
        int var34 = Statics.field1709 - var28;
        int var35 = Statics.field1715 - var29;
        if (Math.abs(var33) > Statics.field2730 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field1972 + var31) {
            return false;
        } else if (Math.abs(var35) > Statics.field3288 + var32) {
            return false;
        } else if (Math.abs(Statics.field1719 * var35 - Statics.field1712 * var34) > Statics.field3288 * var31 + Statics.field1972 * var32) {
            return false;
        } else if (Math.abs(Statics.field1712 * var33 - Statics.field1305 * var35) > Statics.field3288 * var30 + Statics.field2730 * var32) {
            return false;
        } else {
            return Math.abs(Statics.field1305 * var34 - Statics.field1719 * var33) <= Statics.field2730 * var31 + Statics.field1972 * var30;
        }
    }
}
