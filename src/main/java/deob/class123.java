package deob;

@ObfuscatedName("dv")
public class class123 {

    @ObfuscatedName("dv.g")
    public static boolean field1712 = false;

    @ObfuscatedName("dv.r")
    public static int field1713 = 0;

    @ObfuscatedName("dv.e")
    public static int field1716 = 0;

    @ObfuscatedName("dv.q")
    public static boolean field1709 = false;

    @ObfuscatedName("dv.j")
    public static int field1714 = 0;

    @ObfuscatedName("dv.x")
    public static long[] field1715 = new long[1000];

    public class123() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.r(J)Z")
    public static boolean method225(long arg0) {
        boolean var2 = arg0 != 0L;
        if (var2) {
            boolean var3 = (int) (arg0 >>> 16 & 0x1L) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("ky.e(II)I")
    public static int method5290(int arg0) {
        return method315(field1715[arg0]);
    }

    @ObfuscatedName("s.q(J)I")
    public static int method315(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("ab.i(II)I")
    public static int method595(int arg0) {
        long var1 = field1715[arg0];
        return (int) (var1 >>> 14 & 0x3L);
    }

    @ObfuscatedName("v.p(IB)I")
    public static int method180(int arg0) {
        return method1031(field1715[arg0]);
    }

    @ObfuscatedName("bp.m(J)I")
    public static int method1031(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("g.d(IIIZII)J")
    public static long method13(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("ai.j(B)V")
    public static final void method685() {
        field1712 = false;
        field1714 = 0;
    }

    @ObfuscatedName("bc.x(I)I")
    public static final int method1571() {
        return field1716;
    }

    @ObfuscatedName("aq.v(Ldl;IIIB)Z")
    public static final boolean method982(class122 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1712;
        if (!var4) {
            return false;
        }
        if (!field1709) {
            int var5 = Statics.field1770;
            int var6 = Statics.field1797;
            int var7 = Statics.field1798;
            int var8 = Statics.field1799;
            byte var9 = 50;
            short var10 = 3500;
            int var11 = (field1713 - Statics.field1740) * var9 / class125.field1742;
            int var12 = (field1716 - Statics.field1731) * var9 / class125.field1742;
            int var13 = (field1713 - Statics.field1740) * var10 / class125.field1742;
            int var14 = (field1716 - Statics.field1731) * var10 / class125.field1742;
            int var15 = class125.method2796(var12, var9, var6, var5);
            int var16 = class125.method2810(var12, var9, var6, var5);
            int var18 = class125.method2796(var14, var10, var6, var5);
            int var19 = class125.method2810(var14, var10, var6, var5);
            int var21 = class125.method2786(var11, var16, var8, var7);
            int var22 = class125.method2795(var11, var16, var8, var7);
            int var24 = class125.method2786(var13, var19, var8, var7);
            int var25 = class125.method2795(var13, var19, var8, var7);
            Statics.field1710 = (var21 + var24) / 2;
            Statics.field553 = (var15 + var18) / 2;
            Statics.field606 = (var22 + var25) / 2;
            Statics.field3223 = (var24 - var21) / 2;
            Statics.field1244 = (var18 - var15) / 2;
            Statics.field1514 = (var25 - var22) / 2;
            Statics.field3726 = Math.abs(Statics.field3223);
            Statics.field397 = Math.abs(Statics.field1244);
            Statics.field3720 = Math.abs(Statics.field1514);
        }
        int var27 = arg0.field1677 + arg1;
        int var28 = arg0.field1672 + arg2;
        int var29 = arg0.field1659 + arg3;
        int var30 = arg0.field1674;
        int var31 = arg0.field1675;
        int var32 = arg0.field1692;
        int var33 = Statics.field1710 - var27;
        int var34 = Statics.field553 - var28;
        int var35 = Statics.field606 - var29;
        if (Math.abs(var33) > Statics.field3726 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field397 + var31) {
            return false;
        } else if (Math.abs(var35) > Statics.field3720 + var32) {
            return false;
        } else if (Math.abs(Statics.field1244 * var35 - Statics.field1514 * var34) > Statics.field397 * var32 + Statics.field3720 * var31) {
            return false;
        } else if (Math.abs(Statics.field1514 * var33 - Statics.field3223 * var35) > Statics.field3726 * var32 + Statics.field3720 * var30) {
            return false;
        } else {
            return Math.abs(Statics.field3223 * var34 - Statics.field1244 * var33) <= Statics.field397 * var30 + Statics.field3726 * var31;
        }
    }

    @ObfuscatedName("l.h(IIIIIIII)Z")
    public static final boolean method67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1716 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1716 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1713 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1713 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}
