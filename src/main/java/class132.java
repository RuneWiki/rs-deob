import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class132 extends class331 {

    @OriginalMember(owner = "client!kl", name = "tb", descriptor = "Lsf;")
    private static class108 field2257 = class140.method973(255, "Please wait)3)3)3");

    @OriginalMember(owner = "client!kl", name = "Db", descriptor = "Lsf;")
    public static class108 field2267 = class140.method973(255, "Abandonner");

    @OriginalMember(owner = "client!kl", name = "Bb", descriptor = "Lsf;")
    public static class108 field2265 = class140.method973(255, "Particles: ");

    @OriginalMember(owner = "client!kl", name = "Eb", descriptor = "Lsf;")
    public static class108 field2268 = field2257;

    @OriginalMember(owner = "client!kl", name = "Fb", descriptor = "Lsf;")
    public static class108 field2269 = class140.method973(255, "headicons_prayer");

    @OriginalMember(owner = "client!kl", name = "sb", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!kl", name = "ub", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!kl", name = "wb", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!kl", name = "yb", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!kl", name = "Cb", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!kl", name = "Ab", descriptor = "J")
    public static long field2264;

    @OriginalMember(owner = "client!kl", name = "xb", descriptor = "Lvk;")
    public static class173 field2261;

    @OriginalMember(owner = "client!kl", name = "zb", descriptor = "Z")
    public static boolean field2263;

    @OriginalMember(owner = "client!kl", name = "vb", descriptor = "[I")
    public static int[] field2259;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIJZ)Lsf;", line = 28)
    public static final class108 method906(int arg0, int arg1, long arg2, boolean arg3) {
        field2258++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var5 = 1;
        long var6 = arg2 / (long) arg0;
        while (var6 != 0L) {
            var6 /= (long) arg0;
            var5++;
        }
        int var8 = var5;
        if (arg2 < 0L || arg3) {
            var8 = var5 + 1;
        }
        if (arg1 != 10241) {
            method906(-38, 60, -75L, true);
        }
        byte[] var9 = new byte[var8];
        if (arg2 < 0L) {
            var9[0] = 45;
        } else if (arg3) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var11 = (int) (arg2 % (long) arg0);
            if (var11 < 0) {
                var11 = -var11;
            }
            arg2 /= (long) arg0;
            if (var11 > 9) {
                var11 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var11 + 48);
        }
        class108 var12 = new class108();
        var12.field1870 = var8;
        var12.field1884 = var9;
        return var12;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZI)[[I", line = 98)
    public final int[][] method122(boolean arg0, int arg1) {
        int[][] var3 = this.field224.method2081(arg1, -71);
        if (arg0) {
            field2261 = (class173) null;
        }
        field2260++;
        if (this.field224.field5106 && this.method2266((byte) 1)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = arg1 % this.field5660 * this.field5660;
            for (int var8 = 0; var8 < class116.field2008; var8++) {
                int var9 = this.field5652[var8 % this.field5648 + var7];
                var5[var8] = class162.method1118(255, var9) << 4;
                var6[var8] = class162.method1118(65280, var9) >> 4;
                var4[var8] = class162.method1118(4080, var9 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "(I)V", line = 147)
    public static void method907(int arg0) {
        field2269 = null;
        field2268 = null;
        field2257 = null;
        field2259 = null;
        field2267 = null;
        if (arg0 >= 36) {
            field2261 = null;
            field2265 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(III)V", line = 163)
    public static final void method908(int arg0, int arg1, int arg2) {
        field2256++;
        if (arg0 != 1) {
            return;
        }
        class1 var3 = class182.field3333[class295.field5159][arg2][arg1];
        if (var3 == null) {
            class159.method1105(class295.field5159, arg2, arg1);
            return;
        }
        class248 var4 = null;
        int var5 = -99999999;
        for (class248 var6 = (class248) var3.method13(0); var6 != null; var6 = (class248) var3.method15((byte) 47)) {
            class145 var7 = class144.method994(true, var6.field4302.field2724);
            int var8 = var7.field2558;
            if (var7.field2615 == 1) {
                var8 = (var6.field4302.field2712 + 1) * var8;
            }
            if (var5 < var8) {
                var4 = var6;
                var5 = var8;
            }
        }
        if (var4 == null) {
            class159.method1105(class295.field5159, arg2, arg1);
            return;
        }
        var3.method14((byte) 87, var4);
        class149 var9 = null;
        class248 var10 = (class248) var3.method13(0);
        class149 var11 = null;
        while (var10 != null) {
            class149 var12 = var10.field4302;
            if (var4.field4302.field2724 != var12.field2724) {
                if (var11 == null) {
                    var11 = var12;
                }
                if (var11.field2724 != var12.field2724 && var9 == null) {
                    var9 = var12;
                }
            }
            var10 = (class248) var3.method15((byte) 47);
        }
        long var13 = (long) ((arg1 << 7) + arg2 + 1610612736);
        class175.method1242(class295.field5159, arg2, arg1, class45.method321(arg0 - 105, arg1 * 128 - -64, arg2 * 128 + 64, class295.field5159), var4.field4302, var13, var11, var9);
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(III)I", line = 258)
    public static final int method909(int arg0, int arg1, int arg2) {
        field2266++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg2 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg1 != -29462) {
            field2261 = (class173) null;
        }
        if (arg2 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }
}
