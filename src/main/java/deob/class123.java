package deob;

@ObfuscatedName("dl")
public class class123 {

    @ObfuscatedName("dl.y")
    public static boolean field1706 = false;

    @ObfuscatedName("dl.c")
    public static int field1701 = 0;

    @ObfuscatedName("dl.n")
    public static int field1702 = 0;

    @ObfuscatedName("dl.u")
    public static boolean field1703 = false;

    @ObfuscatedName("dl.q")
    public static int field1708 = 0;

    @ObfuscatedName("dl.l")
    public static long[] field1709 = new long[1000];

    public class123() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.y(B)I")
    public static int method1405() {
        return field1708;
    }

    @ObfuscatedName("fp.c(II)I")
    public static int method3163(int arg0) {
        return method4534(field1709[arg0]);
    }

    @ObfuscatedName("jw.n(J)I")
    public static int method4534(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("ja.u(J)I")
    public static int method4726(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("id.i(IIIZIB)J")
    public static long method4240(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("fn.p(B)Z")
    public static final boolean method3084() {
        return field1706;
    }

    @ObfuscatedName("ak.e(I)I")
    public static final int method708() {
        return field1701;
    }

    @ObfuscatedName("ad.s(I)V")
    public static final void method459() {
        if (field1703) {
            return;
        }
        int var0 = Statics.field1790;
        int var1 = Statics.field1771;
        int var2 = Statics.field1784;
        int var3 = Statics.field1793;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field1701 - Statics.field1734) * var4 / class125.field1733;
        int var7 = (field1702 - Statics.field1732) * var4 / class125.field1733;
        int var8 = (field1701 - Statics.field1734) * var5 / class125.field1733;
        int var9 = (field1702 - Statics.field1732) * var5 / class125.field1733;
        int var10 = class125.method2610(var7, var4, var1, var0);
        int var11 = class125.method2614(var7, var4, var1, var0);
        int var13 = class125.method2610(var9, var5, var1, var0);
        int var14 = class125.method2614(var9, var5, var1, var0);
        int var16 = class125.method2656(var6, var11, var3, var2);
        int var17 = class125.method2609(var6, var11, var3, var2);
        int var19 = class125.method2656(var8, var14, var3, var2);
        int var20 = class125.method2609(var8, var14, var3, var2);
        Statics.field1704 = (var16 + var19) / 2;
        Statics.field1705 = (var10 + var13) / 2;
        Statics.field1711 = (var17 + var20) / 2;
        Statics.field1946 = (var19 - var16) / 2;
        Statics.field3310 = (var13 - var10) / 2;
        Statics.field1079 = (var20 - var17) / 2;
        Statics.field1707 = Math.abs(Statics.field1946);
        Statics.field528 = Math.abs(Statics.field3310);
        Statics.field3141 = Math.abs(Statics.field1079);
    }

    @ObfuscatedName("dj.v(Lde;IIII)Z")
    public static final boolean method2319(class122 arg0, int arg1, int arg2, int arg3) {
        if (!method3084()) {
            return false;
        }
        method459();
        int var4 = arg0.field1630 + arg1;
        int var5 = arg0.field1663 + arg2;
        int var6 = arg0.field1674 + arg3;
        int var7 = arg0.field1665;
        int var8 = arg0.field1662;
        int var9 = arg0.field1667;
        int var10 = Statics.field1704 - var4;
        int var11 = Statics.field1705 - var5;
        int var12 = Statics.field1711 - var6;
        if (Math.abs(var10) > Statics.field1707 + var7) {
            return false;
        } else if (Math.abs(var11) > Statics.field528 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field3141 + var9) {
            return false;
        } else if (Math.abs(Statics.field3310 * var12 - Statics.field1079 * var11) > Statics.field528 * var9 + Statics.field3141 * var8) {
            return false;
        } else if (Math.abs(Statics.field1079 * var10 - Statics.field1946 * var12) > Statics.field3141 * var7 + Statics.field1707 * var9) {
            return false;
        } else {
            return Math.abs(Statics.field1946 * var11 - Statics.field3310 * var10) <= Statics.field528 * var7 + Statics.field1707 * var8;
        }
    }

    @ObfuscatedName("y.k(IIIIIIII)Z")
    public static final boolean method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1702 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1702 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1701 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1701 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}
