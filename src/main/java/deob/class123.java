package deob;

@ObfuscatedName("dh")
public class class123 {

    @ObfuscatedName("dh.f")
    public static boolean field1702 = false;

    @ObfuscatedName("dh.h")
    public static int field1693 = 0;

    @ObfuscatedName("dh.e")
    public static int field1708 = 0;

    @ObfuscatedName("dh.b")
    public static boolean field1695 = false;

    @ObfuscatedName("dh.m")
    public static int field1710 = 0;

    @ObfuscatedName("dh.q")
    public static long[] field1694 = new long[1000];

    public class123() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ga.f(J)Z")
    public static boolean method3556(long arg0) {
        boolean var2 = arg0 != 0L;
        if (var2) {
            boolean var3 = (int) (arg0 >>> 16 & 0x1L) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("bf.h(II)J")
    public static long method1710(int arg0) {
        return field1694[arg0];
    }

    @ObfuscatedName("bt.e(II)I")
    public static int method1078(int arg0) {
        return method106(field1694[arg0]);
    }

    @ObfuscatedName("s.b(J)I")
    public static int method106(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("fs.l(J)I")
    public static int method3222(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("bw.d(J)I")
    public static int method957(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("bz.n(II)I")
    public static int method1727(int arg0) {
        return method4074(field1694[arg0]);
    }

    @ObfuscatedName("ht.s(J)I")
    public static int method4074(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("ab.g(IIIZII)J")
    public static long method649(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("bd.k(J)V")
    public static final void method1000(long arg0) {
        field1694[++field1710 - 1] = arg0;
    }

    @ObfuscatedName("a.m(I)I")
    public static final int method122() {
        return field1708;
    }

    @ObfuscatedName("bu.q(Lds;IIIS)Z")
    public static final boolean method1015(class122 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1702;
        if (!var4) {
            return false;
        }
        if (!field1695) {
            int var5 = Statics.field1789;
            int var6 = Statics.field1788;
            int var7 = Statics.field1791;
            int var8 = Statics.field1769;
            byte var9 = 50;
            short var10 = 3500;
            int var11 = (field1693 - Statics.field1725) * var9 / class125.field1717;
            int var12 = (field1708 - Statics.field1730) * var9 / class125.field1717;
            int var13 = (field1693 - Statics.field1725) * var10 / class125.field1717;
            int var14 = (field1708 - Statics.field1730) * var10 / class125.field1717;
            int var15 = class125.method2650(var12, var9, var6, var5);
            int var16 = class125.method2623(var12, var9, var6, var5);
            int var18 = class125.method2650(var14, var10, var6, var5);
            int var19 = class125.method2623(var14, var10, var6, var5);
            int var21 = class125.method2620(var11, var16, var8, var7);
            int var22 = class125.method2674(var11, var16, var8, var7);
            int var24 = class125.method2620(var13, var19, var8, var7);
            int var25 = class125.method2674(var13, var19, var8, var7);
            Statics.field1706 = (var21 + var24) / 2;
            Statics.field1703 = (var15 + var18) / 2;
            Statics.field1696 = (var22 + var25) / 2;
            Statics.field1699 = (var24 - var21) / 2;
            Statics.field1700 = (var18 - var15) / 2;
            Statics.field27 = (var25 - var22) / 2;
            Statics.field1059 = Math.abs(Statics.field1699);
            Statics.field2417 = Math.abs(Statics.field1700);
            Statics.field1701 = Math.abs(Statics.field27);
        }
        int var27 = arg0.field1622 + arg1;
        int var28 = arg0.field1655 + arg2;
        int var29 = arg0.field1656 + arg3;
        int var30 = arg0.field1657;
        int var31 = arg0.field1630;
        int var32 = arg0.field1659;
        int var33 = Statics.field1706 - var27;
        int var34 = Statics.field1703 - var28;
        int var35 = Statics.field1696 - var29;
        if (Math.abs(var33) > Statics.field1059 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field2417 + var31) {
            return false;
        } else if (Math.abs(var35) > Statics.field1701 + var32) {
            return false;
        } else if (Math.abs(Statics.field1700 * var35 - Statics.field27 * var34) > Statics.field2417 * var32 + Statics.field1701 * var31) {
            return false;
        } else if (Math.abs(Statics.field27 * var33 - Statics.field1699 * var35) > Statics.field1701 * var30 + Statics.field1059 * var32) {
            return false;
        } else {
            return Math.abs(Statics.field1699 * var34 - Statics.field1700 * var33) <= Statics.field2417 * var30 + Statics.field1059 * var31;
        }
    }

    @ObfuscatedName("ed.x(IIIIIIII)Z")
    public static final boolean method3001(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1708 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1708 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1693 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1693 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}
