package deob;

@ObfuscatedName("di")
public class class129 {

    @ObfuscatedName("di.q")
    public static boolean field1754 = false;

    @ObfuscatedName("di.w")
    public static int field1743 = 0;

    @ObfuscatedName("di.e")
    public static int field1744 = 0;

    @ObfuscatedName("di.p")
    public static boolean field1745 = false;

    @ObfuscatedName("di.r")
    public static int field1749 = 0;

    @ObfuscatedName("di.v")
    public static long[] field1751 = new long[1000];

    public class129() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jz.q(II)I")
    public static int method4773(int arg0) {
        long var1 = field1751[arg0];
        return (int) (var1 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("cb.w(IB)I")
    public static int method1985(int arg0) {
        long var1 = field1751[arg0];
        return (int) (var1 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("p.e(IB)I")
    public static int method24(int arg0) {
        return method364(field1751[arg0]);
    }

    @ObfuscatedName("as.p(J)I")
    public static int method364(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("bf.k(II)I")
    public static int method1619(int arg0) {
        return method632(field1751[arg0]);
    }

    @ObfuscatedName("an.l(J)I")
    public static int method632(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("dv.b(IIIZII)J")
    public static long method2597(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("gu.i(I)V")
    public static final void method3342() {
        field1754 = false;
        field1749 = 0;
    }

    @ObfuscatedName("ek.c(Ldm;IIIB)Z")
    public static final boolean method3009(class128 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1754;
        if (!var4) {
            return false;
        }
        if (!field1745) {
            int var5 = Statics.field1828;
            int var6 = Statics.field1802;
            int var7 = Statics.field1830;
            int var8 = Statics.field1831;
            byte var9 = 50;
            short var10 = 3500;
            int var11 = (field1743 - Statics.field1775) * var9 / class131.field1774;
            int var12 = (field1744 - Statics.field1776) * var9 / class131.field1774;
            int var13 = (field1743 - Statics.field1775) * var10 / class131.field1774;
            int var14 = (field1744 - Statics.field1776) * var10 / class131.field1774;
            int var15 = class131.method2738(var12, var9, var6, var5);
            int var16 = class131.method2739(var12, var9, var6, var5);
            int var18 = class131.method2738(var14, var10, var6, var5);
            int var19 = class131.method2739(var14, var10, var6, var5);
            int var21 = class131.method2725(var11, var16, var8, var7);
            int var22 = class131.method2737(var11, var16, var8, var7);
            int var24 = class131.method2725(var13, var19, var8, var7);
            int var25 = class131.method2737(var13, var19, var8, var7);
            Statics.field1872 = (var21 + var24) / 2;
            Statics.field1746 = (var15 + var18) / 2;
            Statics.field1747 = (var22 + var25) / 2;
            Statics.field1243 = (var24 - var21) / 2;
            Statics.field49 = (var18 - var15) / 2;
            Statics.field423 = (var25 - var22) / 2;
            Statics.field528 = Math.abs(Statics.field1243);
            Statics.field1742 = Math.abs(Statics.field49);
            Statics.field1161 = Math.abs(Statics.field423);
        }
        int var27 = arg0.field1735 + arg1;
        int var28 = arg0.field1705 + arg2;
        int var29 = arg0.field1701 + arg3;
        int var30 = arg0.field1672;
        int var31 = arg0.field1708;
        int var32 = arg0.field1675;
        int var33 = Statics.field1872 - var27;
        int var34 = Statics.field1746 - var28;
        int var35 = Statics.field1747 - var29;
        if (Math.abs(var33) > Statics.field528 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field1742 + var31) {
            return false;
        } else if (Math.abs(var35) > Statics.field1161 + var32) {
            return false;
        } else if (Math.abs(Statics.field49 * var35 - Statics.field423 * var34) > Statics.field1742 * var32 + Statics.field1161 * var31) {
            return false;
        } else if (Math.abs(Statics.field423 * var33 - Statics.field1243 * var35) > Statics.field528 * var32 + Statics.field1161 * var30) {
            return false;
        } else {
            return Math.abs(Statics.field1243 * var34 - Statics.field49 * var33) <= Statics.field528 * var31 + Statics.field1742 * var30;
        }
    }
}
