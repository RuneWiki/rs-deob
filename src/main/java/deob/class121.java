package deob;

@ObfuscatedName("ds")
public class class121 {

    @ObfuscatedName("ds.z")
    public static boolean field1651 = false;

    @ObfuscatedName("ds.w")
    public static int field1649 = 0;

    @ObfuscatedName("ds.s")
    public static int field1650 = 0;

    @ObfuscatedName("ds.l")
    public static boolean field1653 = false;

    @ObfuscatedName("ds.f")
    public static int field1657 = 0;

    @ObfuscatedName("ds.g")
    public static long[] field1648 = new long[1000];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bc.z(J)Z")
    public static boolean method1576(long arg0) {
        boolean var2 = arg0 != 0L;
        if (var2) {
            boolean var3 = (int) (arg0 >>> 16 & 0x1L) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("a.w(II)J")
    public static long method243(int arg0) {
        return field1648[arg0];
    }

    @ObfuscatedName("l.s(IB)I")
    public static int method33(int arg0) {
        return method584(field1648[arg0]);
    }

    @ObfuscatedName("ap.l(J)I")
    public static int method584(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("ah.u(IB)I")
    public static int method416(int arg0) {
        return method2280(field1648[arg0]);
    }

    @ObfuscatedName("dy.q(J)I")
    public static int method2280(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("cb.i(II)I")
    public static int method1735(int arg0) {
        return method594(field1648[arg0]);
    }

    @ObfuscatedName("ar.x(J)I")
    public static int method594(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("bt.e(IIIZII)J")
    public static long method1686(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("aj.p(IIB)V")
    public static final void method834(int arg0, int arg1) {
        field1649 = arg0;
        field1650 = arg1;
        field1651 = true;
        field1657 = 0;
        field1653 = false;
    }

    @ObfuscatedName("fh.b(I)Z")
    public static final boolean method3143() {
        return field1651;
    }

    @ObfuscatedName("co.n(I)I")
    public static final int method1755() {
        return field1649;
    }

    @ObfuscatedName("u.f(I)V")
    public static final void method57() {
        if (field1653) {
            return;
        }
        int var0 = Statics.field1760;
        int var1 = Statics.field1738;
        int var2 = Statics.field1741;
        int var3 = Statics.field1772;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field1649 - Statics.field1688) * var4 / class123.field1679;
        int var7 = (field1650 - Statics.field1690) * var4 / class123.field1679;
        int var8 = (field1649 - Statics.field1688) * var5 / class123.field1679;
        int var9 = (field1650 - Statics.field1690) * var5 / class123.field1679;
        int var10 = class123.method2603(var7, var4, var1, var0);
        int var11 = class123.method2586(var7, var4, var1, var0);
        int var13 = class123.method2603(var9, var5, var1, var0);
        int var14 = class123.method2586(var9, var5, var1, var0);
        int var16 = class123.method2601(var6, var11, var3, var2);
        int var17 = class123.method2602(var6, var11, var3, var2);
        int var19 = class123.method2601(var8, var14, var3, var2);
        int var20 = class123.method2602(var8, var14, var3, var2);
        Statics.field1658 = (var16 + var19) / 2;
        Statics.field1660 = (var10 + var13) / 2;
        Statics.field2284 = (var17 + var20) / 2;
        Statics.field3722 = (var19 - var16) / 2;
        Statics.field1652 = (var13 - var10) / 2;
        Statics.field1655 = (var20 - var17) / 2;
        Statics.field1336 = Math.abs(Statics.field3722);
        Statics.field1656 = Math.abs(Statics.field1652);
        Statics.field3758 = Math.abs(Statics.field1655);
    }

    @ObfuscatedName("hr.g(IIIIIIII)Z")
    public static final boolean method4128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1650 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1650 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1649 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1649 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}
