package deob;

@ObfuscatedName("dd")
public class class129 {

    @ObfuscatedName("dd.u")
    public static boolean field1739 = false;

    @ObfuscatedName("dd.f")
    public static int field1731 = 0;

    @ObfuscatedName("dd.b")
    public static int field1734 = 0;

    @ObfuscatedName("dd.g")
    public static boolean field1733 = false;

    @ObfuscatedName("dd.e")
    public static int field1736 = 0;

    @ObfuscatedName("dd.n")
    public static long[] field1737 = new long[1000];

    public class129() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iv.u(J)Z")
    public static boolean method4172(long arg0) {
        int var2 = (int) (arg0 >>> 14 & 0x3L);
        return var2 == 2;
    }

    @ObfuscatedName("et.f(J)Z")
    public static boolean method3051(long arg0) {
        boolean var2 = arg0 != 0L;
        if (var2) {
            boolean var3 = (int) (arg0 >>> 16 & 0x1L) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("dk.b(II)J")
    public static long method2301(int arg0) {
        return field1737[arg0];
    }

    @ObfuscatedName("bl.g(II)I")
    public static int method1600(int arg0) {
        long var1 = field1737[arg0];
        return (int) (var1 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("k.z(IB)I")
    public static int method123(int arg0) {
        return method246(field1737[arg0]);
    }

    @ObfuscatedName("t.p(J)I")
    public static int method246(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("bm.h(J)I")
    public static int method1028(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("bx.y(IIIZII)J")
    public static long method960(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("fh.w(III)V")
    public static final void method3307(int arg0, int arg1) {
        field1731 = arg0;
        field1734 = arg1;
        field1739 = true;
        field1736 = 0;
        field1733 = false;
    }

    @ObfuscatedName("io.i(I)V")
    public static final void method4206() {
        field1739 = false;
        field1736 = 0;
    }

    @ObfuscatedName("go.k(B)I")
    public static final int method3396() {
        return field1734;
    }

    @ObfuscatedName("cp.x(B)V")
    public static final void method2100() {
        if (field1733) {
            return;
        }
        int var0 = Statics.field1807;
        int var1 = Statics.field1819;
        int var2 = Statics.field1820;
        int var3 = Statics.field1853;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field1731 - Statics.field1760) * var4 / class131.field1748;
        int var7 = (field1734 - Statics.field1755) * var4 / class131.field1748;
        int var8 = (field1731 - Statics.field1760) * var5 / class131.field1748;
        int var9 = (field1734 - Statics.field1755) * var5 / class131.field1748;
        int var10 = class131.method2783(var7, var4, var1, var0);
        int var11 = class131.method2779(var7, var4, var1, var0);
        int var13 = class131.method2783(var9, var5, var1, var0);
        int var14 = class131.method2779(var9, var5, var1, var0);
        int var16 = class131.method2789(var6, var11, var3, var2);
        int var17 = class131.method2802(var6, var11, var3, var2);
        int var19 = class131.method2789(var8, var14, var3, var2);
        int var20 = class131.method2802(var8, var14, var3, var2);
        Statics.field262 = (var16 + var19) / 2;
        Statics.field6 = (var10 + var13) / 2;
        Statics.field37 = (var17 + var20) / 2;
        Statics.field1738 = (var19 - var16) / 2;
        Statics.field1740 = (var13 - var10) / 2;
        Statics.field3653 = (var20 - var17) / 2;
        Statics.field1881 = Math.abs(Statics.field1738);
        Statics.field2356 = Math.abs(Statics.field1740);
        Statics.field604 = Math.abs(Statics.field3653);
    }

    @ObfuscatedName("bh.o(Ldf;IIIB)Z")
    public static final boolean method1789(class128 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1739;
        if (!var4) {
            return false;
        }
        method2100();
        int var5 = arg0.field1692 + arg1;
        int var6 = arg0.field1672 + arg2;
        int var7 = arg0.field1694 + arg3;
        int var8 = arg0.field1695;
        int var9 = arg0.field1696;
        int var10 = arg0.field1697;
        int var11 = Statics.field262 - var5;
        int var12 = Statics.field6 - var6;
        int var13 = Statics.field37 - var7;
        if (Math.abs(var11) > Statics.field1881 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field2356 + var9) {
            return false;
        } else if (Math.abs(var13) > Statics.field604 + var10) {
            return false;
        } else if (Math.abs(Statics.field1740 * var13 - Statics.field3653 * var12) > Statics.field604 * var9 + Statics.field2356 * var10) {
            return false;
        } else if (Math.abs(Statics.field3653 * var11 - Statics.field1738 * var13) > Statics.field604 * var8 + Statics.field1881 * var10) {
            return false;
        } else {
            return Math.abs(Statics.field1738 * var12 - Statics.field1740 * var11) <= Statics.field2356 * var8 + Statics.field1881 * var9;
        }
    }
}
