package deob;

@ObfuscatedName("da")
public class class129 {

    @ObfuscatedName("da.c")
    public static boolean field1735 = false;

    @ObfuscatedName("da.t")
    public static int field1728 = 0;

    @ObfuscatedName("da.o")
    public static int field1731 = 0;

    @ObfuscatedName("da.e")
    public static boolean field1729 = false;

    @ObfuscatedName("da.n")
    public static int field1736 = 0;

    @ObfuscatedName("da.x")
    public static long[] field1733 = new long[1000];

    public class129() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bh.c(J)Z")
    public static boolean method1587(long arg0) {
        return method2662(arg0) == 2;
    }

    @ObfuscatedName("at.t(J)Z")
    public static boolean method703(long arg0) {
        return arg0 != 0L && !method608(arg0);
    }

    @ObfuscatedName("dp.o(II)J")
    public static long method2799(int arg0) {
        return field1733[arg0];
    }

    @ObfuscatedName("m.e(IB)I")
    public static int method108(int arg0) {
        long var1 = field1733[arg0];
        return (int) (var1 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("l.i(J)I")
    public static int method76(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("am.g(II)I")
    public static int method669(int arg0) {
        return method149(field1733[arg0]);
    }

    @ObfuscatedName("x.d(J)I")
    public static int method149(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("dz.l(J)I")
    public static int method2662(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("ar.j(J)Z")
    public static boolean method608(long arg0) {
        return (int) (arg0 >>> 16 & 0x1L) == 1;
    }

    @ObfuscatedName("d.m(J)I")
    public static int method65(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("bf.p(IIIZII)J")
    public static long method855(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("bn.h(III)V")
    public static final void method1099(int arg0, int arg1) {
        field1728 = arg0;
        field1731 = arg1;
        field1735 = true;
        field1736 = 0;
        field1729 = false;
    }

    @ObfuscatedName("eo.v(J)V")
    public static final void method3161(long arg0) {
        field1733[++field1736 - 1] = arg0;
    }

    @ObfuscatedName("dj.n(I)Z")
    public static final boolean method2379() {
        return field1735;
    }

    @ObfuscatedName("gu.x(I)I")
    public static final int method3553() {
        return field1728;
    }

    @ObfuscatedName("bt.w(B)V")
    public static final void method1062() {
        if (field1729) {
            return;
        }
        int var0 = Statics.field1798;
        int var1 = Statics.field1824;
        int var2 = Statics.field1799;
        int var3 = Statics.field1836;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field1728 - Statics.field1767) * var4 / class131.field1766;
        int var7 = (field1731 - Statics.field1768) * var4 / class131.field1766;
        int var8 = (field1728 - Statics.field1767) * var5 / class131.field1766;
        int var9 = (field1731 - Statics.field1768) * var5 / class131.field1766;
        int var10 = class131.method2823(var7, var4, var1, var0);
        int var11 = class131.method2824(var7, var4, var1, var0);
        int var13 = class131.method2823(var9, var5, var1, var0);
        int var14 = class131.method2824(var9, var5, var1, var0);
        int var16 = class131.method2848(var6, var11, var3, var2);
        int var17 = class131.method2822(var6, var11, var3, var2);
        int var19 = class131.method2848(var8, var14, var3, var2);
        int var20 = class131.method2822(var8, var14, var3, var2);
        Statics.field1730 = (var16 + var19) / 2;
        Statics.field1732 = (var10 + var13) / 2;
        Statics.field1737 = (var17 + var20) / 2;
        Statics.field1513 = (var19 - var16) / 2;
        Statics.field1734 = (var13 - var10) / 2;
        Statics.field1743 = (var20 - var17) / 2;
        Statics.field1979 = Math.abs(Statics.field1513);
        Statics.field27 = Math.abs(Statics.field1734);
        Statics.field382 = Math.abs(Statics.field1743);
    }

    @ObfuscatedName("dr.q(IIIIIIII)Z")
    public static final boolean method2547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1731 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1731 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1728 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1728 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}
