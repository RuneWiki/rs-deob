import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class22 extends class189 {

    @OriginalMember(owner = "client!kg", name = "Hb", descriptor = "Luf;")
    public static class168 field262 = class148.method1019(-1720, "<col=ffff00>");

    @OriginalMember(owner = "client!kg", name = "Ib", descriptor = "Lk;")
    public static class36 field263 = new class36(64);

    @OriginalMember(owner = "client!kg", name = "Vb", descriptor = "[[I")
    public static int[][] field276 = new int[104][104];

    @OriginalMember(owner = "client!kg", name = "Ub", descriptor = "I")
    public static int field275 = 0;

    @OriginalMember(owner = "client!kg", name = "Tb", descriptor = "[I")
    public static int[] field274 = new int[200];

    @OriginalMember(owner = "client!kg", name = "Sb", descriptor = "Luf;")
    public static class168 field273 = class148.method1019(-1720, "Fps:");

    @OriginalMember(owner = "client!kg", name = "Xb", descriptor = "Luf;")
    public static class168 field278 = class148.method1019(-1720, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!kg", name = "Kb", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!kg", name = "Lb", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!kg", name = "Nb", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!kg", name = "Ob", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!kg", name = "Pb", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!kg", name = "Qb", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!kg", name = "Mb", descriptor = "Lrd;")
    public class196 field267;

    @OriginalMember(owner = "client!kg", name = "Jb", descriptor = "Lg;")
    public static class242 field264;

    @OriginalMember(owner = "client!kg", name = "Rb", descriptor = "Lfj;")
    public static class283 field272;

    @OriginalMember(owner = "client!kg", name = "Yb", descriptor = "Lwa;")
    public static class284 field279;

    @OriginalMember(owner = "client!kg", name = "Wb", descriptor = "[Lgk;")
    public static class265[] field277;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)Z", line = 13)
    public final boolean method111(int arg0) {
        field269++;
        if (arg0 != 0) {
            method114(10, (class33) null, (class241) null, (class241) null, true);
        }
        return this.field267 != null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIIIJ)V", line = 29)
    public final void method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field270++;
        if (this.field267 == null) {
            return;
        }
        class190 var11 = this.field3044 != -1 && this.field3005 == 0 ? class119.method858(true, this.field3044) : null;
        class190 var12 = this.field3045 == -1 || this.field3045 == this.field3002 && var11 != null ? null : class119.method858(true, this.field3045);
        class152 var13 = this.field267.method1386(this.field3009, var12, var11, this.field3053, (byte) 7);
        if (var13 == null) {
            return;
        }
        this.field2999 = var13.method116();
        class196 var14 = this.field267;
        if (var14.field3188 != null) {
            var14 = var14.method1387((byte) -1);
        }
        if (class164.field2631 && var14.field3172) {
            class152 var15 = class116.method844(this.field267.field3207, this.field267.field3203, var13, this.field267.field3211, this.field3021, (byte) 103, var12 == null ? this.field3009 : this.field3053, this.field3055, this.field267.field3196, this.field3010, this.field267.field3199, var12 == null ? var11 : var12, this.field3027, arg0);
            float var16 = class90.method606();
            float var17 = class90.method607();
            class90.method619();
            class90.method627(var16, var17 - 150.0F);
            var15.method112(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
            class90.method642();
            class90.method627(var16, var17);
        }
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        if (this.field267.field3224 != 0 || this.field267.field3195 != 0) {
            int var21 = class173.field2812[arg0];
            int var22 = class173.field2818[arg0];
            short var23 = this.field267.field3195;
            short var24 = this.field267.field3224;
            int var25 = -var24 / 2;
            int var26 = -var23 / 2;
            int var27 = var21 * var26 + var22 * var25 >> 16;
            int var28 = -var23 / 2;
            int var29 = var22 * var26 - (var21 * var25) >> 16;
            int var30 = class62.method349(128, class79.field1127, this.field3021 + var29, this.field3027 + var27);
            int var31 = var24 / 2;
            int var32 = -var24 / 2;
            int var33 = var22 * var28 - (var21 * var31) >> 16;
            int var34 = var23 / 2;
            int var35 = var22 * var34 - (var21 * var32) >> 16;
            int var36 = var21 * var28 + var22 * var31 >> 16;
            int var37 = var21 * var34 + var22 * var32 >> 16;
            int var38 = class62.method349(128, class79.field1127, this.field3021 + var33, this.field3027 + var36);
            int var39 = var24 / 2;
            int var40 = var23 / 2;
            int var41 = class62.method349(128, class79.field1127, this.field3021 + var35, this.field3027 + var37);
            int var42 = var21 * var40 + var22 * var39 >> 16;
            int var43 = var38 <= var30 ? var38 : var30;
            int var44 = var30 >= var41 ? var41 : var30;
            int var45 = var22 * var40 - (var21 * var39) >> 16;
            int var46 = class62.method349(128, class79.field1127, this.field3021 + var45, this.field3027 + var42);
            int var47 = var30 + var46;
            int var48 = var46 <= var38 ? var46 : var38;
            int var49 = var46 > var41 ? var41 : var46;
            if ((var38 + var41) < var47) {
                var47 = var38 + var41;
            }
            if (var23 != 0) {
                var18 = (int) (Math.atan2((double) (var43 - var49), (double) var23) * 325.95D) & 0x7FF;
                if (var18 != 0) {
                    var13.method666(var18);
                }
            }
            if (var24 != 0) {
                var19 = (int) (Math.atan2((double) (var44 - var48), (double) var24) * 325.95D) & 0x7FF;
                if (var19 != 0) {
                    var13.method657(var19);
                }
            }
            var20 = (var47 >> 1) - this.field3055;
            if (var20 != 0) {
                var13.method710(0, var20, 0);
            }
        }
        class152 var50 = null;
        if (this.field3026 != -1 && this.field3042 != -1) {
            class5 var51 = class270.method1873(this.field3026, false);
            var50 = var51.method11(-4, this.field3042);
            if (var50 != null) {
                var50.method710(0, -this.field3047, 0);
                if (var51.field69) {
                    if (var18 != 0) {
                        var50.method666(var18);
                    }
                    if (var19 != 0) {
                        var50.method657(var19);
                    }
                    if (var20 != 0) {
                        var50.method710(0, var20, 0);
                    }
                }
            }
        }
        if (this.field267.field3211 == 1) {
            var13.field2354 = true;
        }
        var13.method112(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        if (var50 != null) {
            if (this.field267.field3211 == 1) {
                var50.field2354 = true;
            }
            var50.method112(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(JZII)Luf;", line = 226)
    public static final class168 method113(long arg0, boolean arg1, int arg2, int arg3) {
        field265++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var5 = 1;
        long var6 = arg0 / (long) arg3;
        while (var6 != 0L) {
            var6 /= (long) arg3;
            var5++;
        }
        int var8 = var5;
        if (arg0 < 0L || arg1) {
            var8 = var5 + 1;
        }
        int var9 = -86 % ((-arg2 - 17) / 52);
        byte[] var10 = new byte[var8];
        if (arg0 < 0L) {
            var10[0] = 45;
        } else if (arg1) {
            var10[0] = 43;
        }
        for (int var11 = 0; var11 < var5; var11++) {
            int var12 = (int) (arg0 % (long) arg3);
            if (var12 < 0) {
                var12 = -var12;
            }
            arg0 /= (long) arg3;
            if (var12 > 9) {
                var12 += 39;
            }
            var10[var8 - var11 - 1] = (byte) (var12 + 48);
        }
        class168 var13 = new class168();
        var13.field2716 = var10;
        var13.field2692 = var8;
        return var13;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILcb;Ldk;Ldk;Z)V", line = 289)
    public static final void method114(int arg0, class33 arg1, class241 arg2, class241 arg3, boolean arg4) {
        field271++;
        class70.field927 = arg2;
        class179.field2895 = arg3;
        class259.field4397 = arg4;
        int var5 = class70.field927.method1640(-53) - 1;
        class101.field1572 = var5 * 256 + class70.field927.method1633(-26, var5);
        class182.field2917 = arg1;
        if (arg0 >= -38) {
            method117((byte) -47);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)I", line = 308)
    public static final int method115(int arg0, int arg1) {
        field268++;
        return arg0 == arg1 ? -1 : class95.method720(arg1, 0);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "()I", line = 320)
    public final int method116() {
        field266++;
        return this.field2999;
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(B)V", line = 328)
    public static void method117(byte arg0) {
        field264 = null;
        field263 = null;
        field279 = null;
        field272 = null;
        field276 = (int[][]) null;
        if (arg0 < 33) {
            field275 = -8;
        }
        field262 = null;
        field273 = null;
        field274 = null;
        field278 = null;
        field277 = null;
    }
}
