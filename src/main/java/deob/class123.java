package deob;

@ObfuscatedName("db")
public class class123 {

    @ObfuscatedName("db.v")
    public static boolean field1708 = false;

    @ObfuscatedName("db.s")
    public static int field1709 = 0;

    @ObfuscatedName("db.o")
    public static int field1704 = 0;

    @ObfuscatedName("db.k")
    public static boolean field1705 = false;

    @ObfuscatedName("db.a")
    public static int field1706 = 0;

    @ObfuscatedName("db.z")
    public static long[] field1710 = new long[1000];

    public class123() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dp.v(I)I")
    public static int method2321() {
        return field1706;
    }

    @ObfuscatedName("ja.s(J)Z")
    public static boolean method4895(long arg0) {
        return method1846(arg0) == 2;
    }

    @ObfuscatedName("eh.o(J)Z")
    public static boolean method2997(long arg0) {
        return arg0 != 0L && !method27(arg0);
    }

    @ObfuscatedName("az.k(II)I")
    public static int method910(int arg0) {
        long var1 = field1710[arg0];
        return (int) (var1 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("ce.u(J)I")
    public static int method1846(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("o.i(J)Z")
    public static boolean method27(long arg0) {
        return (int) (arg0 >>> 16 & 0x1L) == 1;
    }

    @ObfuscatedName("af.t(II)I")
    public static int method533(int arg0) {
        return method936(field1710[arg0]);
    }

    @ObfuscatedName("al.c(J)I")
    public static int method936(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("hs.w(IIIZII)J")
    public static long method3900(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("jp.a(III)V")
    public static final void method4653(int arg0, int arg1) {
        field1709 = arg0;
        field1704 = arg1;
        field1708 = true;
        field1706 = 0;
        field1705 = false;
    }

    @ObfuscatedName("bw.z(I)V")
    public static final void method986() {
        field1708 = false;
        field1706 = 0;
    }

    @ObfuscatedName("n.e(Lda;IIII)Z")
    public static final boolean method460(class122 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1708;
        if (!var4) {
            return false;
        }
        if (!field1705) {
            int var5 = Statics.field1790;
            int var6 = Statics.field1791;
            int var7 = Statics.field1792;
            int var8 = Statics.field1793;
            byte var9 = 50;
            short var10 = 3500;
            int var11 = (field1709 - Statics.field1732) * var9 / class125.field1730;
            int var12 = (field1704 - Statics.field1719) * var9 / class125.field1730;
            int var13 = (field1709 - Statics.field1732) * var10 / class125.field1730;
            int var14 = (field1704 - Statics.field1719) * var10 / class125.field1730;
            int var15 = class125.method2601(var12, var9, var6, var5);
            int var16 = class125.method2614(var12, var9, var6, var5);
            int var18 = class125.method2601(var14, var10, var6, var5);
            int var19 = class125.method2614(var14, var10, var6, var5);
            int var21 = class125.method2593(var11, var16, var8, var7);
            int var22 = class125.method2651(var11, var16, var8, var7);
            int var24 = class125.method2593(var13, var19, var8, var7);
            int var25 = class125.method2651(var13, var19, var8, var7);
            Statics.field1703 = (var21 + var24) / 2;
            Statics.field1707 = (var15 + var18) / 2;
            Statics.field1711 = (var22 + var25) / 2;
            Statics.field1702 = (var24 - var21) / 2;
            Statics.field1157 = (var18 - var15) / 2;
            Statics.field231 = (var25 - var22) / 2;
            Statics.field1849 = Math.abs(Statics.field1702);
            Statics.field223 = Math.abs(Statics.field1157);
            Statics.field1076 = Math.abs(Statics.field231);
        }
        int var27 = arg0.field1664 + arg1;
        int var28 = arg0.field1657 + arg2;
        int var29 = arg0.field1647 + arg3;
        int var30 = arg0.field1667;
        int var31 = arg0.field1668;
        int var32 = arg0.field1669;
        int var33 = Statics.field1703 - var27;
        int var34 = Statics.field1707 - var28;
        int var35 = Statics.field1711 - var29;
        if (Math.abs(var33) > Statics.field1849 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field223 + var31) {
            return false;
        } else if (Math.abs(var35) > Statics.field1076 + var32) {
            return false;
        } else if (Math.abs(Statics.field1157 * var35 - Statics.field231 * var34) > Statics.field223 * var32 + Statics.field1076 * var31) {
            return false;
        } else if (Math.abs(Statics.field231 * var33 - Statics.field1702 * var35) > Statics.field1849 * var32 + Statics.field1076 * var30) {
            return false;
        } else {
            return Math.abs(Statics.field1702 * var34 - Statics.field1157 * var33) <= Statics.field223 * var30 + Statics.field1849 * var31;
        }
    }

    @ObfuscatedName("bf.q(IIIIIIII)Z")
    public static final boolean method1081(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1704 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1704 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1709 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1709 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}
