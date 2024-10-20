package deob;

@ObfuscatedName("de")
public class class123 {

    @ObfuscatedName("de.f")
    public static boolean field1717 = false;

    @ObfuscatedName("de.l")
    public static int field1710 = 0;

    @ObfuscatedName("de.w")
    public static int field1709 = 0;

    @ObfuscatedName("de.s")
    public static boolean field1708 = false;

    @ObfuscatedName("de.v")
    public static int field1707 = 0;

    @ObfuscatedName("de.g")
    public static long[] field1714 = new long[1000];

    public class123() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cc.f(II)I")
    public static int method1925(int arg0) {
        long var1 = field1714[arg0];
        return (int) (var1 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("ah.l(J)I")
    public static int method860(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("h.w(J)I")
    public static int method192(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("bp.s(J)I")
    public static int method1777(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("en.e(IIIZIB)J")
    public static long method3065(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("cm.c(IIB)V")
    public static final void method1827(int arg0, int arg1) {
        field1710 = arg0;
        field1709 = arg1;
        field1717 = true;
        field1707 = 0;
        field1708 = false;
    }

    @ObfuscatedName("bk.p(J)V")
    public static final void method1563(long arg0) {
        field1714[++field1707 - 1] = arg0;
    }

    @ObfuscatedName("as.r(I)Z")
    public static final boolean method603() {
        return field1717;
    }

    @ObfuscatedName("w.m(I)I")
    public static final int method23() {
        return field1709;
    }

    @ObfuscatedName("m.d(Lds;IIII)Z")
    public static final boolean method94(class122 arg0, int arg1, int arg2, int arg3) {
        if (!method603()) {
            return false;
        }
        if (!field1708) {
            int var4 = Statics.field1792;
            int var5 = Statics.field1793;
            int var6 = Statics.field1794;
            int var7 = Statics.field1795;
            byte var8 = 50;
            short var9 = 3500;
            int var10 = (field1710 - Statics.field1736) * var8 / class125.field1735;
            int var11 = (field1709 - Statics.field1726) * var8 / class125.field1735;
            int var12 = (field1710 - Statics.field1736) * var9 / class125.field1735;
            int var13 = (field1709 - Statics.field1726) * var9 / class125.field1735;
            int var14 = class125.method2662(var11, var8, var5, var4);
            int var15 = class125.method2663(var11, var8, var5, var4);
            int var17 = class125.method2662(var13, var9, var5, var4);
            int var18 = class125.method2663(var13, var9, var5, var4);
            int var20 = class125.method2661(var10, var15, var7, var6);
            int var21 = class125.method2705(var10, var15, var7, var6);
            int var23 = class125.method2661(var12, var18, var7, var6);
            int var24 = class125.method2705(var12, var18, var7, var6);
            Statics.field1711 = (var20 + var23) / 2;
            Statics.field1712 = (var14 + var17) / 2;
            Statics.field2623 = (var21 + var24) / 2;
            Statics.field1972 = (var23 - var20) / 2;
            Statics.field593 = (var17 - var14) / 2;
            Statics.field1244 = (var24 - var21) / 2;
            Statics.field2000 = Math.abs(Statics.field1972);
            Statics.field1756 = Math.abs(Statics.field593);
            Statics.field1411 = Math.abs(Statics.field1244);
        }
        int var26 = arg0.field1669 + arg1;
        int var27 = arg0.field1659 + arg2;
        int var28 = arg0.field1671 + arg3;
        int var29 = arg0.field1686;
        int var30 = arg0.field1673;
        int var31 = arg0.field1674;
        int var32 = Statics.field1711 - var26;
        int var33 = Statics.field1712 - var27;
        int var34 = Statics.field2623 - var28;
        if (Math.abs(var32) > Statics.field2000 + var29) {
            return false;
        } else if (Math.abs(var33) > Statics.field1756 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field1411 + var31) {
            return false;
        } else if (Math.abs(Statics.field593 * var34 - Statics.field1244 * var33) > Statics.field1756 * var31 + Statics.field1411 * var30) {
            return false;
        } else if (Math.abs(Statics.field1244 * var32 - Statics.field1972 * var34) > Statics.field2000 * var31 + Statics.field1411 * var29) {
            return false;
        } else {
            return Math.abs(Statics.field1972 * var33 - Statics.field593 * var32) <= Statics.field2000 * var30 + Statics.field1756 * var29;
        }
    }
}
