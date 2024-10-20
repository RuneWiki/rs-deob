package deob;

@ObfuscatedName("dm")
public class class129 {

    @ObfuscatedName("dm.m")
    public static boolean field1724 = false;

    @ObfuscatedName("dm.f")
    public static int field1714 = 0;

    @ObfuscatedName("dm.q")
    public static int field1726 = 0;

    @ObfuscatedName("dm.w")
    public static boolean field1716 = false;

    @ObfuscatedName("dm.i")
    public static int field1725 = 0;

    @ObfuscatedName("dm.a")
    public static long[] field1723 = new long[1000];

    public class129() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.m(II)I")
    public static int method664(int arg0) {
        return method117(field1723[arg0]);
    }

    @ObfuscatedName("d.f(J)I")
    public static int method117(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("l.q(IS)I")
    public static int method63(int arg0) {
        long var1 = field1723[arg0];
        return (int) (var1 >>> 14 & 0x3L);
    }

    @ObfuscatedName("bf.w(IB)I")
    public static int method1643(int arg0) {
        return method4558(field1723[arg0]);
    }

    @ObfuscatedName("jm.o(J)I")
    public static int method4558(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("kx.u(IIIZII)J")
    public static long method5179(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("cb.g(J)V")
    public static final void method1902(long arg0) {
        field1723[++field1725 - 1] = arg0;
    }

    @ObfuscatedName("dp.l(Ldu;IIII)Z")
    public static final boolean method2278(class128 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1724;
        if (!var4) {
            return false;
        }
        if (!field1716) {
            int var5 = Statics.field1805;
            int var6 = Statics.field1797;
            int var7 = Statics.field1807;
            int var8 = Statics.field1816;
            byte var9 = 50;
            short var10 = 3500;
            int var11 = (field1714 - Statics.field1746) * var9 / class131.field1745;
            int var12 = (field1726 - Statics.field1747) * var9 / class131.field1745;
            int var13 = (field1714 - Statics.field1746) * var10 / class131.field1745;
            int var14 = (field1726 - Statics.field1747) * var10 / class131.field1745;
            int var15 = class131.method2756(var12, var9, var6, var5);
            int var16 = class131.method2757(var12, var9, var6, var5);
            int var18 = class131.method2756(var14, var10, var6, var5);
            int var19 = class131.method2757(var14, var10, var6, var5);
            int var21 = class131.method2754(var11, var16, var8, var7);
            int var22 = class131.method2755(var11, var16, var8, var7);
            int var24 = class131.method2754(var13, var19, var8, var7);
            int var25 = class131.method2755(var13, var19, var8, var7);
            Statics.field1500 = (var21 + var24) / 2;
            Statics.field1718 = (var15 + var18) / 2;
            Statics.field1719 = (var22 + var25) / 2;
            Statics.field1720 = (var24 - var21) / 2;
            Statics.field3812 = (var18 - var15) / 2;
            Statics.field1777 = (var25 - var22) / 2;
            Statics.field1077 = Math.abs(Statics.field1720);
            Statics.field1721 = Math.abs(Statics.field3812);
            Statics.field3266 = Math.abs(Statics.field1777);
        }
        int var27 = arg0.field1682 + arg1;
        int var28 = arg0.field1667 + arg2;
        int var29 = arg0.field1706 + arg3;
        int var30 = arg0.field1679;
        int var31 = arg0.field1680;
        int var32 = arg0.field1681;
        int var33 = Statics.field1500 - var27;
        int var34 = Statics.field1718 - var28;
        int var35 = Statics.field1719 - var29;
        if (Math.abs(var33) > Statics.field1077 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field1721 + var31) {
            return false;
        } else if (Math.abs(var35) > Statics.field3266 + var32) {
            return false;
        } else if (Math.abs(Statics.field3812 * var35 - Statics.field1777 * var34) > Statics.field3266 * var31 + Statics.field1721 * var32) {
            return false;
        } else if (Math.abs(Statics.field1777 * var33 - Statics.field1720 * var35) > Statics.field3266 * var30 + Statics.field1077 * var32) {
            return false;
        } else {
            return Math.abs(Statics.field1720 * var34 - Statics.field3812 * var33) <= Statics.field1721 * var30 + Statics.field1077 * var31;
        }
    }

    @ObfuscatedName("jz.e(IIIIIIIS)Z")
    public static final boolean method4747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1726 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1726 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1714 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1714 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}
