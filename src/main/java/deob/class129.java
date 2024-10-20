package deob;

@ObfuscatedName("dk")
public class class129 {

    @ObfuscatedName("dk.c")
    public static boolean field1710 = false;

    @ObfuscatedName("dk.x")
    public static int field1716 = 0;

    @ObfuscatedName("dk.t")
    public static int field1708 = 0;

    @ObfuscatedName("dk.g")
    public static boolean field1711 = false;

    @ObfuscatedName("dk.s")
    public static int field1714 = 0;

    @ObfuscatedName("dk.p")
    public static long[] field1715 = new long[1000];

    public class129() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gf.x(J)I")
    public static int method3377(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("le.t(J)I")
    public static int method5490(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("ce.g(II)I")
    public static int method1952(int arg0) {
        return method1950(field1715[arg0]);
    }

    @ObfuscatedName("ce.l(J)I")
    public static int method1950(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("o.u(IIIZII)J")
    public static long method239(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("y.j(III)V")
    public static final void method160(int arg0, int arg1) {
        field1716 = arg0;
        field1708 = arg1;
        field1710 = true;
        field1714 = 0;
        field1711 = false;
    }

    @ObfuscatedName("bo.v(I)V")
    public static final void method1557() {
        field1710 = false;
        field1714 = 0;
    }

    @ObfuscatedName("gx.d(J)V")
    public static final void method3627(long arg0) {
        field1715[++field1714 - 1] = arg0;
    }

    @ObfuscatedName("bv.z(I)Z")
    public static final boolean method973() {
        return field1710;
    }

    @ObfuscatedName("dy.s(I)I")
    public static final int method2302() {
        return field1716;
    }

    @ObfuscatedName("hb.p(I)V")
    public static final void method3799() {
        if (field1711) {
            return;
        }
        int var0 = Statics.field1792;
        int var1 = Statics.field1793;
        int var2 = Statics.field1828;
        int var3 = Statics.field1795;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field1716 - Statics.field1739) * var4 / class131.field1738;
        int var7 = (field1708 - Statics.field1740) * var4 / class131.field1738;
        int var8 = (field1716 - Statics.field1739) * var5 / class131.field1738;
        int var9 = (field1708 - Statics.field1740) * var5 / class131.field1738;
        int var10 = class131.method2777(var7, var4, var1, var0);
        int var11 = class131.method2794(var7, var4, var1, var0);
        int var13 = class131.method2777(var9, var5, var1, var0);
        int var14 = class131.method2794(var9, var5, var1, var0);
        int var16 = class131.method2820(var6, var11, var3, var2);
        int var17 = class131.method2758(var6, var11, var3, var2);
        int var19 = class131.method2820(var8, var14, var3, var2);
        int var20 = class131.method2758(var8, var14, var3, var2);
        Statics.field1712 = (var16 + var19) / 2;
        Statics.field3578 = (var10 + var13) / 2;
        Statics.field2727 = (var17 + var20) / 2;
        Statics.field21 = (var19 - var16) / 2;
        Statics.field1713 = (var13 - var10) / 2;
        Statics.field3080 = (var20 - var17) / 2;
        Statics.field511 = Math.abs(Statics.field21);
        Statics.field76 = Math.abs(Statics.field1713);
        Statics.field2725 = Math.abs(Statics.field3080);
    }

    @ObfuscatedName("af.e(IIIIIIII)Z")
    public static final boolean method566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1708 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1708 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1716 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1716 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}
