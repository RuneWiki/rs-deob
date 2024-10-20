package deob;

@ObfuscatedName("dv")
public class class123 {

    @ObfuscatedName("dv.c")
    public static boolean field1724 = false;

    @ObfuscatedName("dv.q")
    public static int field1718 = 0;

    @ObfuscatedName("dv.m")
    public static int field1725 = 0;

    @ObfuscatedName("dv.j")
    public static boolean field1720 = false;

    @ObfuscatedName("dv.p")
    public static int field1717 = 0;

    @ObfuscatedName("dv.n")
    public static long[] field1728 = new long[1000];

    public class123() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bx.c(J)Z")
    public static boolean method1666(long arg0) {
        boolean var2 = arg0 != 0L;
        if (var2) {
            boolean var3 = (int) (arg0 >>> 16 & 0x1L) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("fv.q(II)J")
    public static long method3127(int arg0) {
        return field1728[arg0];
    }

    @ObfuscatedName("dw.m(J)I")
    public static int method2285(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("dz.j(II)I")
    public static int method2551(int arg0) {
        return method618(field1728[arg0]);
    }

    @ObfuscatedName("ac.g(J)I")
    public static int method618(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("dp.i(J)I")
    public static int method2261(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("dj.h(IIIZIB)J")
    public static long method2401(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("j.l(III)V")
    public static final void method44(int arg0, int arg1) {
        field1718 = arg0;
        field1725 = arg1;
        field1724 = true;
        field1717 = 0;
        field1720 = false;
    }

    @ObfuscatedName("ix.o(B)V")
    public static final void method4202() {
        field1724 = false;
        field1717 = 0;
    }

    @ObfuscatedName("fq.k(J)V")
    public static final void method3171(long arg0) {
        field1728[++field1717 - 1] = arg0;
    }

    @ObfuscatedName("cd.v(I)I")
    public static final int method1747() {
        return field1718;
    }

    @ObfuscatedName("ai.p(B)V")
    public static final void method919() {
        if (field1720) {
            return;
        }
        int var0 = Statics.field1839;
        int var1 = Statics.field1809;
        int var2 = Statics.field1797;
        int var3 = Statics.field1811;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field1718 - Statics.field1753) * var4 / class125.field1756;
        int var7 = (field1725 - Statics.field1760) * var4 / class125.field1756;
        int var8 = (field1718 - Statics.field1753) * var5 / class125.field1756;
        int var9 = (field1725 - Statics.field1760) * var5 / class125.field1756;
        int var10 = class125.method2575(var7, var4, var1, var0);
        int var11 = class125.method2620(var7, var4, var1, var0);
        int var13 = class125.method2575(var9, var5, var1, var0);
        int var14 = class125.method2620(var9, var5, var1, var0);
        int var16 = class125.method2582(var6, var11, var3, var2);
        int var17 = class125.method2574(var6, var11, var3, var2);
        int var19 = class125.method2582(var8, var14, var3, var2);
        int var20 = class125.method2574(var8, var14, var3, var2);
        Statics.field1862 = (var16 + var19) / 2;
        Statics.field2318 = (var10 + var13) / 2;
        Statics.field529 = (var17 + var20) / 2;
        Statics.field1721 = (var19 - var16) / 2;
        Statics.field639 = (var13 - var10) / 2;
        Statics.field1847 = (var20 - var17) / 2;
        Statics.field1723 = Math.abs(Statics.field1721);
        Statics.field602 = Math.abs(Statics.field639);
        Statics.field39 = Math.abs(Statics.field1847);
    }

    @ObfuscatedName("kq.n(IIIIIIII)Z")
    public static final boolean method5124(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1725 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1725 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1718 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1718 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}
