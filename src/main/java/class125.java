import java.awt.Font;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class125 extends class64 {

    @OriginalMember(owner = "client!nh", name = "db", descriptor = "I")
    private int field2280 = 1;

    @OriginalMember(owner = "client!nh", name = "jb", descriptor = "I")
    private int field2286 = 1;

    @OriginalMember(owner = "client!nh", name = "mb", descriptor = "[J")
    public static long[] field2289 = new long[32];

    @OriginalMember(owner = "client!nh", name = "bb", descriptor = "Lsg;")
    private static class169 field2278 = class165.method1060("wishes to duel with you)3", 1536);

    @OriginalMember(owner = "client!nh", name = "rb", descriptor = "Lsg;")
    public static class169 field2294 = class165.method1060("scrollen:", 1536);

    @OriginalMember(owner = "client!nh", name = "sb", descriptor = "Lsg;")
    public static class169 field2295 = class165.method1060("(U5", 1536);

    @OriginalMember(owner = "client!nh", name = "cb", descriptor = "Lsg;")
    public static class169 field2279 = field2278;

    @OriginalMember(owner = "client!nh", name = "ub", descriptor = "Lsg;")
    public static class169 field2297 = class165.method1060("auf einer freien Welt zu spielen)3", 1536);

    @OriginalMember(owner = "client!nh", name = "wb", descriptor = "Lsg;")
    public static class169 field2299 = class165.method1060("Bitte versuchen Sie)1", 1536);

    @OriginalMember(owner = "client!nh", name = "yb", descriptor = "Lsg;")
    public static class169 field2301 = class165.method1060("gelb:", 1536);

    @OriginalMember(owner = "client!nh", name = "eb", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!nh", name = "gb", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!nh", name = "ib", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!nh", name = "kb", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!nh", name = "nb", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!nh", name = "ob", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!nh", name = "tb", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!nh", name = "vb", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!nh", name = "xb", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!nh", name = "lb", descriptor = "Lqd;")
    public static class148 field2288;

    @OriginalMember(owner = "client!nh", name = "hb", descriptor = "Ljava/awt/Font;")
    public static Font field2284;

    @OriginalMember(owner = "client!nh", name = "qb", descriptor = "Ljava/awt/Image;")
    public static Image field2293;

    @OriginalMember(owner = "client!nh", name = "fb", descriptor = "Z")
    public static boolean field2282;

    @OriginalMember(owner = "client!nh", name = "pb", descriptor = "[I")
    public static int[] field2292;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(Z)V")
    public static void method766(boolean arg0) {
        field2292 = null;
        field2289 = null;
        field2297 = null;
        field2294 = null;
        field2278 = null;
        field2284 = null;
        if (arg0) {
            field2295 = null;
            field2279 = null;
            field2288 = null;
            field2293 = null;
            field2299 = null;
            field2301 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(ILqf;)Lqf;")
    public static final class150 method767(int arg0, class150 arg1) {
        ++field2290;
        int var2 = class41.method268(8651, class70.method436(arg1, arg0 ^ 7508));
        if (~var2 == -1) {
            return null;
        } else if (arg0 != -7472) {
            return null;
        } else {
            for (int var3 = 0; var3 < var2; ++var3) {
                arg1 = class62.method385((byte) 41, arg1.field2893);
                if (arg1 == null) {
                    return null;
                }
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method768(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2298;
        if (arg3 != -88) {
            field2297 = null;
        }
        if (class44.method280(arg4, true)) {
            class26.method186((byte) 87, class142.field2647[arg4], arg2, arg1, -1, arg6, arg7, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        ++field2287;
        int var4 = -42 / ((-60 - arg0) / 36);
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field1183 = arg1.method819((byte) 22) == 1;
                }
            } else {
                this.field2286 = arg1.method819((byte) 22);
            }
        } else {
            this.field2280 = arg1.method819((byte) 22);
        }
    }

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)V")
    public static final void method769(int arg0) {
        ++field2281;
        int var1 = class164.field3150 * 128 + 64;
        int var2 = class138.field2560 * 128 + 64;
        int var3 = class183.method1215(var1, class61.field1132, var2, 0) + -class143.field2669;
        if (class7.field159 < var1) {
            class7.field159 += (-class7.field159 + var1) * class122.field2247 / 1000 + class190.field3750;
            if (~class7.field159 < ~var1) {
                class7.field159 = var1;
            }
        }
        if (var2 > class138.field2569) {
            class138.field2569 += (-class138.field2569 + var2) * class122.field2247 / 1000 + class190.field3750;
            if (~var2 > ~class138.field2569) {
                class138.field2569 = var2;
            }
        }
        if (var2 < class138.field2569) {
            class138.field2569 -= (class138.field2569 - var2) * class122.field2247 / 1000 + class190.field3750;
            if (class138.field2569 < var2) {
                class138.field2569 = var2;
            }
        }
        if (~class182.field3559 > ~var3) {
            class182.field3559 += class190.field3750 - -((-class182.field3559 + var3) * class122.field2247 / 1000);
            if (~var3 > ~class182.field3559) {
                class182.field3559 = var3;
            }
        }
        if (var3 < class182.field3559) {
            class182.field3559 -= (class182.field3559 - var3) * class122.field2247 / 1000 + class190.field3750;
            if (~class182.field3559 > ~var3) {
                class182.field3559 = var3;
            }
        }
        int var4 = class196.field3851 * 128 - -64;
        if (~var1 > ~class7.field159) {
            class7.field159 -= (-var1 + class7.field159) * class122.field2247 / 1000 + class190.field3750;
            if (~var1 < ~class7.field159) {
                class7.field159 = var1;
            }
        }
        int var5 = class51.field924 * 128 - -64;
        int var6 = class183.method1215(var5, class61.field1132, var4, 0) - class175.field3418;
        int var7 = -class7.field159 + var5;
        if (arg0 > -60) {
            field2284 = null;
        }
        int var8 = -class138.field2569 + var4;
        int var9 = var6 - class182.field3559;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = 2047 & (int) (325.949D * Math.atan2((double) var9, (double) var10));
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = 2047 & (int) (Math.atan2((double) var7, (double) var8) * -325.949D);
        if (var11 > 383) {
            var11 = 383;
        }
        if (var11 > class148.field2743) {
            class148.field2743 += class155.field2977 - -((-class148.field2743 + var11) * class112.field2050 / 1000);
            if (var11 < class148.field2743) {
                class148.field2743 = var11;
            }
        }
        if (var11 < class148.field2743) {
            class148.field2743 -= class155.field2977 - -((class148.field2743 - var11) * class112.field2050 / 1000);
            if (class148.field2743 < var11) {
                class148.field2743 = var11;
            }
        }
        int var13 = -class177.field3468 + var12;
        if (~var13 < -1025) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (~var13 < -1) {
            class177.field3468 += class112.field2050 * var13 / 1000 + class155.field2977;
            class177.field3468 &= 2047;
        }
        if (~var13 > -1) {
            class177.field3468 -= class155.field2977 - -(-var13 * class112.field2050 / 1000);
            class177.field3468 &= 2047;
        }
        int var14 = var12 - class177.field3468;
        if (~var14 < -1025) {
            var14 -= 2048;
        }
        if (~var14 > 1023) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || ~var14 < -1 && ~var13 > -1) {
            class177.field3468 = var12;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        if (arg1 != 19) {
            field2295 = null;
        }
        int[] var3 = super.field1192.method19((byte) 124, arg0);
        if (super.field1192.field75) {
            int var4 = this.field2280 + 1 + this.field2280;
            int var5 = this.field2286 + 1 + this.field2286;
            int[][] var6 = new int[var5][];
            for (int var7 = arg0 - this.field2286; ~(this.field2286 + arg0) <= ~var7; ++var7) {
                int[] var11 = this.method394(arg1 + 20312, 0, class89.field1616 & var7);
                int[] var12 = new int[class147.field2715];
                int var13 = 0;
                for (int var14 = -this.field2280; ~var14 >= ~this.field2280; ++var14) {
                    var13 += var11[var14 & class8.field217];
                }
                int var15 = 0;
                while (~class147.field2715 < ~var15) {
                    var12[var15] = var13 / var4;
                    int var16 = var13 - var11[var15 - this.field2280 & class8.field217];
                    ++var15;
                    var13 = var11[var15 - -this.field2280 & class8.field217] + var16;
                }
                var6[-arg0 + this.field2286 + var7] = var12;
            }
            for (int var8 = 0; class147.field2715 > var8; ++var8) {
                int var9 = 0;
                for (int var10 = 0; ~var5 < ~var10; ++var10) {
                    var9 += var6[var10][var8];
                }
                var3[var8] = var9 / var5;
            }
        }
        ++field2283;
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method59(byte arg0, int arg1) {
        ++field2300;
        if (arg0 != -40) {
            field2282 = true;
        }
        int[][] var3 = super.field1195.method177(arg0 + 1233, arg1);
        if (super.field1195.field532) {
            int var4 = this.field2286 - -this.field2286 + 1;
            int var5 = this.field2280 + 1 + this.field2280;
            int[][][] var6 = new int[var4][][];
            for (int var7 = arg1 - this.field2286; ~(this.field2286 + arg1) <= ~var7; ++var7) {
                int[][] var17 = this.method402(false, var7 & class89.field1616, 0);
                int[][] var18 = new int[3][class147.field2715];
                int var19 = 0;
                int var20 = 0;
                int var21 = 0;
                int[] var22 = var17[0];
                int[] var23 = var17[1];
                int[] var24 = var17[2];
                for (int var25 = -this.field2280; ~this.field2280 <= ~var25; ++var25) {
                    int var35 = class8.field217 & var25;
                    var19 += var22[var35];
                    var21 += var23[var35];
                    var20 += var24[var35];
                }
                int[] var26 = var18[1];
                int[] var27 = var18[0];
                int[] var28 = var18[2];
                int var29 = 0;
                while (~var29 > ~class147.field2715) {
                    var27[var29] = var19 / var5;
                    var26[var29] = var21 / var5;
                    var28[var29] = var20 / var5;
                    int var30 = -this.field2280 + var29 & class8.field217;
                    int var31 = var20 - var24[var30];
                    int var32 = var19 - var22[var30];
                    int var33 = var21 - var23[var30];
                    ++var29;
                    int var34 = this.field2280 + var29 & class8.field217;
                    var19 = var22[var34] + var32;
                    var20 = var24[var34] + var31;
                    var21 = var23[var34] + var33;
                }
                var6[this.field2286 + var7 + -arg1] = var18;
            }
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; class147.field2715 > var11; ++var11) {
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                for (int var15 = 0; ~var15 > ~var4; ++var15) {
                    int[][] var16 = var6[var15];
                    var14 += var16[2][var11];
                    var12 += var16[0][var11];
                    var13 += var16[1][var11];
                }
                var9[var11] = var12 / var4;
                var8[var11] = var13 / var4;
                var10[var11] = var14 / var4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class125() {
        super(1, false);
    }
}
