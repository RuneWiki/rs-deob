package deob;

@ObfuscatedName("dz")
public class class129 {

    @ObfuscatedName("dz.f")
    public static boolean field1724 = false;

    @ObfuscatedName("dz.i")
    public static int field1715 = 0;

    @ObfuscatedName("dz.y")
    public static int field1717 = 0;

    @ObfuscatedName("dz.w")
    public static boolean field1723 = false;

    @ObfuscatedName("dz.k")
    public static int field1722 = 0;

    @ObfuscatedName("dz.s")
    public static long[] field1726 = new long[1000];

    public class129() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gb.f(I)I")
    public static int method3340() {
        return field1722;
    }

    @ObfuscatedName("ae.i(J)Z")
    public static boolean method649(long arg0) {
        boolean var2 = arg0 != 0L;
        if (var2) {
            boolean var3 = (int) (arg0 >>> 16 & 0x1L) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("s.y(IS)J")
    public static long method132(int arg0) {
        return field1726[arg0];
    }

    @ObfuscatedName("ke.w(J)I")
    public static int method4906(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("db.p(IB)I")
    public static int method2504(int arg0) {
        long var1 = field1726[arg0];
        return (int) (var1 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("fp.b(IS)I")
    public static int method3255(int arg0) {
        return method4620(field1726[arg0]);
    }

    @ObfuscatedName("jz.e(J)I")
    public static int method4620(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("r.x(II)I")
    public static int method259(int arg0) {
        return method12(field1726[arg0]);
    }

    @ObfuscatedName("y.a(J)I")
    public static int method12(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("aj.d(IIIZII)J")
    public static long method673(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("hl.c(B)V")
    public static final void method3736() {
        field1724 = false;
        field1722 = 0;
    }

    @ObfuscatedName("hg.o(I)I")
    public static final int method3716() {
        return field1715;
    }

    @ObfuscatedName("dc.l(I)I")
    public static final int method2541() {
        return field1717;
    }

    @ObfuscatedName("al.t(B)V")
    public static final void method643() {
        if (field1723) {
            return;
        }
        int var0 = Statics.field1804;
        int var1 = Statics.field1805;
        int var2 = Statics.field1807;
        int var3 = Statics.field1810;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field1715 - Statics.field1749) * var4 / class131.field1748;
        int var7 = (field1717 - Statics.field1750) * var4 / class131.field1748;
        int var8 = (field1715 - Statics.field1749) * var5 / class131.field1748;
        int var9 = (field1717 - Statics.field1750) * var5 / class131.field1748;
        int var10 = class131.method2763(var7, var4, var1, var0);
        int var11 = class131.method2764(var7, var4, var1, var0);
        int var13 = class131.method2763(var9, var5, var1, var0);
        int var14 = class131.method2764(var9, var5, var1, var0);
        int var16 = class131.method2761(var6, var11, var3, var2);
        int var17 = class131.method2827(var6, var11, var3, var2);
        int var19 = class131.method2761(var8, var14, var3, var2);
        int var20 = class131.method2827(var8, var14, var3, var2);
        Statics.field1718 = (var16 + var19) / 2;
        Statics.field246 = (var10 + var13) / 2;
        Statics.field1719 = (var17 + var20) / 2;
        Statics.field1720 = (var19 - var16) / 2;
        Statics.field294 = (var13 - var10) / 2;
        Statics.field337 = (var20 - var17) / 2;
        Statics.field1721 = Math.abs(Statics.field1720);
        Statics.field3262 = Math.abs(Statics.field294);
        Statics.field2473 = Math.abs(Statics.field337);
    }

    @ObfuscatedName("ag.n(IIIIIIII)Z")
    public static final boolean method580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1717 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1717 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1715 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1715 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}
