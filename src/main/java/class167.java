import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class167 extends class189 {

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
    private int field2775 = 0;

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "Z")
    public boolean field2784 = false;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "Z")
    public boolean field2771 = true;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "Loe;")
    public final class71 field2767;

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "Ldk;")
    public final class193 field2787;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "Lsk;")
    public class243 field2781;

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "Lib;")
    public final class56 field2794;

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "J")
    private long field2785;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "Leg;")
    public static class37 field2768 = class174.method1167(":assist:", 127);

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "Leg;")
    public static class37 field2782 = class174.method1167("(Y<)4col>", 116);

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "Leg;")
    public static class37 field2788 = class174.method1167("<col=80ff00>", 123);

    @OriginalMember(owner = "client!ti", name = "Y", descriptor = "[I")
    public static int[] field2797 = new int[2];

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public int field2762;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    private int field2763;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    private int field2764;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    private int field2766;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    private int field2769;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    private int field2770;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "I")
    private int field2777;

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "I")
    public int field2778;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
    private int field2780;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
    private int field2783;

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "I")
    private int field2786;

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
    private int field2789;

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
    private int field2790;

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
    private int field2792;

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!ti", name = "W", descriptor = "I")
    public int field2795;

    @OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
    private int field2796;

    @OriginalMember(owner = "client!ti", name = "ab", descriptor = "I")
    private int field2799;

    @OriginalMember(owner = "client!ti", name = "cb", descriptor = "I")
    private int field2801;

    @OriginalMember(owner = "client!ti", name = "db", descriptor = "I")
    private int field2802;

    @OriginalMember(owner = "client!ti", name = "Z", descriptor = "Llc;")
    public static class251 field2798;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "[Lja;")
    public static class105[] field2776;

    @OriginalMember(owner = "client!ti", name = "bb", descriptor = "[[I")
    public static int[][] field2800;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZJIIIB)V")
    public final void method1120(boolean arg0, long arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (this.field2784) {
            arg0 = false;
        } else if (this.field2794.field876 > class193.field3310) {
            arg0 = false;
        } else if (this.field2790 == this.field2777 && this.field2777 == this.field2770 && this.field2801 == this.field2792 && this.field2801 == this.field2763 && this.field2799 == this.field2796 && this.field2799 == this.field2786) {
            arg0 = false;
        } else if (this.field2794.field879 != -1) {
            int var8 = (int) (arg1 - this.field2785);
            if (this.field2794.field889 || var8 <= this.field2794.field879) {
                var8 %= this.field2794.field879;
            } else {
                arg0 = false;
            }
            if (!this.field2794.field906 && this.field2794.field859 > var8) {
                arg0 = false;
            }
            if (this.field2794.field906 && var8 >= this.field2794.field859) {
                arg0 = false;
            }
        }
        if (arg0) {
            this.field2775 += (int) (((double) this.field2794.field912 + Math.random() * (double) (this.field2794.field873 - this.field2794.field912)) * (double) arg3);
            if (this.field2775 > 63) {
                int var9 = this.field2775 >> 6;
                this.field2775 &= 0x3F;
                if (this.field2771) {
                    int var10 = this.field2801 - this.field2792;
                    int var11 = this.field2777 - this.field2790;
                    int var12 = this.field2799 - this.field2796;
                    int var13 = this.field2770 - this.field2790;
                    int var14 = this.field2763 - this.field2792;
                    this.field2766 = var11 * var14 - var10 * var13;
                    int var15 = this.field2786 - this.field2796;
                    this.field2789 = var12 * var13 - var11 * var15;
                    this.field2783 = var10 * var15 - (var12 * var14);
                    while (true) {
                        if (this.field2783 <= 32767 && this.field2789 <= 32767 && this.field2766 <= 32767 && this.field2783 >= -32767 && this.field2789 >= -32767 && this.field2766 >= -32767) {
                            int var16 = (int) Math.sqrt((double) (this.field2789 * this.field2789 + this.field2783 * this.field2783 + (this.field2766 * this.field2766)));
                            if (var16 <= 0) {
                                var16 = 1;
                            }
                            this.field2789 = this.field2789 * 32767 / var16;
                            this.field2783 = this.field2783 * 32767 / var16;
                            this.field2766 = this.field2766 * 32767 / var16;
                            if (this.field2794.field870 > 0 || this.field2794.field866 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field2766, (double) this.field2783) * 2047.0D / 6.283185307179586D);
                                int var19 = (int) (Math.atan2((double) (this.field2783 * this.field2783 + this.field2766 * this.field2766), (double) this.field2789) * 2047.0D / 6.283185307179586D);
                                this.field2769 = this.field2794.field870 - this.field2794.field897;
                                this.field2802 = this.field2794.field866 - this.field2794.field875;
                                this.field2764 = this.field2794.field875 + var19 - (this.field2802 / 2);
                                int var20 = var18 - this.field2787.field3320;
                                this.field2780 = this.field2794.field897 + var20 - (this.field2769 / 2);
                            } else if (this.field2787.field3320 != 0) {
                                int var17 = this.field2783 * arg2 + this.field2766 * arg4 >> 16;
                                this.field2766 = this.field2766 * arg2 - (this.field2783 * arg4) >> 16;
                                this.field2783 = var17;
                            }
                            this.field2771 = false;
                            break;
                        }
                        this.field2766 >>= 0x1;
                        this.field2789 >>= 0x1;
                        this.field2783 >>= 0x1;
                    }
                }
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22 = this.field2789;
                    int var23 = this.field2783;
                    int var24 = this.field2766;
                    if (this.field2794.field870 > 0 || this.field2794.field866 > 0) {
                        int var25 = this.field2780 + (int) (Math.random() * (double) this.field2769);
                        int var26 = var25 & 0x7FF;
                        int var27 = class76.field1192[var26] >> 1;
                        int var28 = class76.field1189[var26] >> 1;
                        int var29 = this.field2764 + ((int) (Math.random() * (double) this.field2802));
                        int var30 = var29 & 0x3FF;
                        int var31 = class76.field1192[var30] >> 1;
                        var23 = var28 * var31 >> 16;
                        var24 = var27 * var31 >> 16;
                        int var32 = class76.field1189[var30] >> 1;
                        var22 = var32 * -1;
                    }
                    int var33 = (int) (Math.random() * 255.0D);
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (255 - var34) * var33 >> 8;
                    int var36 = 255 - var35 - var34;
                    int var37 = this.field2777 * var35 + this.field2790 * var34 + this.field2770 * var36 >> 8;
                    int var38 = this.field2763 * var36 + this.field2801 * var35 + this.field2792 * var34 >> 8;
                    int var39 = this.field2786 * var36 + this.field2799 * var35 + this.field2796 * var34 >> 8;
                    if (this.field2787.field3320 != 0) {
                        int var40 = arg2 * var37 + arg4 * var39 >> 16;
                        var39 = arg2 * var39 - (arg4 * var37) >> 16;
                        var37 = var40;
                    }
                    int var41 = this.field2794.field868 + ((int) (Math.random() * (double) (this.field2794.field902 - this.field2794.field868)));
                    int var42 = (int) (Math.random() * (double) (this.field2794.field914 - this.field2794.field898)) + this.field2794.field898;
                    int var45;
                    if (this.field2794.field856) {
                        double var43 = Math.random();
                        var45 = (int) ((double) this.field2794.field907 * var43 + (double) this.field2794.field863) << 24 | (int) ((double) this.field2794.field858 * var43 + (double) this.field2794.field852) << 8 | (int) ((double) this.field2794.field855 * var43 + (double) this.field2794.field887) << 16 | (int) ((double) this.field2794.field865 * var43 + (double) this.field2794.field900);
                    } else {
                        var45 = (int) ((double) this.field2794.field907 * Math.random() + (double) this.field2794.field863) << 24 | (int) ((double) this.field2794.field855 * Math.random() + (double) this.field2794.field887) << 16 | (int) ((double) this.field2794.field858 * Math.random() + (double) this.field2794.field852) << 8 | (int) ((double) this.field2794.field900 + Math.random() * (double) this.field2794.field865);
                    }
                    if (class193.field3305 == class193.field3295) {
                        new class6(this, this.field2787.field3321 + var37, this.field2787.field3326 + var38, this.field2787.field3325 + var39, var23, var22, var24, var42, var41, var45);
                    } else {
                        class6 var47 = class193.field3291[class193.field3305];
                        class193.field3305 = class193.field3305 + 1 & 0x3FF;
                        var47.method39(this, this.field2787.field3321 + var37, this.field2787.field3326 - -var38, this.field2787.field3325 + var39, var23, var22, var24, var42, var41, var45);
                    }
                }
            }
        }
        this.field2762 = 0;
        class6 var48 = (class6) this.field2781.method1678(arg5 + 97);
        if (arg5 != -76) {
            this.method1123(-55, 26, -122, 125, -108, -88, 94, 10, 44, -12);
        }
        while (var48 != null) {
            var48.method38(arg1, arg3);
            this.field2762++;
            var48 = (class6) this.field2781.method1677(arg5 ^ 0xFFFFFFC2);
        }
        class193.field3303 += this.field2762;
        field2772++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILeg;)Lqk;")
    public static final class7 method1121(int arg0, class37 arg1) {
        field2791++;
        class7 var2 = (class7) class78.field1212.method1566(-3);
        if (arg0 > -47) {
            field2779 = -58;
        }
        while (var2 != null) {
            if (var2.field114.method223(arg1, (byte) 63)) {
                return var2;
            }
            var2 = (class7) class78.field1212.method1570(3);
        }
        return null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILbl;Lie;ZIIIIIIIIZI)Lbl;")
    public static final class253 method1122(int arg0, class253 arg1, class2 arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, int arg13) {
        field2774++;
        long var14 = ((long) arg4 << 32) + (long) (arg10 - (-(arg8 << 16) - (arg0 << 24))) + ((long) arg11 << 48);
        class253 var16 = (class253) class89.field1422.method1411(-96, var14);
        if (var16 == null) {
            byte var17;
            if (arg10 == 1) {
                var17 = 9;
            } else if (arg10 == 2) {
                var17 = 12;
            } else if (arg10 == 3) {
                var17 = 15;
            } else if (arg10 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            int[][] var20 = new int[var18][var17];
            class211 var21 = new class211(var17 * var18 + 1, var17 * var18 * 2 + -var17, 0);
            int var22 = var21.method1499(0, 0, 0);
            for (int var23 = 0; var23 < var18; var23++) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = class76.field1189[var33] * var31 + arg7 >> 16;
                    int var35 = class76.field1192[var33] * var30 + arg5 >> 16;
                    var20[var23][var32] = var21.method1499(var35, 0, var34);
                }
            }
            for (int var24 = 0; var24 < var18; var24++) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg0 * var25 + arg8 * var26 >> 8);
                short var28 = (short) (((arg4 & 0x380) * var26 + (arg11 & 0x380) * var25 & 0x38000) + ((arg4 & 0xFC00) * var26 + (arg11 & 0xFC00) * var25 & 0xFC0000) + ((arg4 & 0x7F) * var26 + (arg11 & 0x7F) * var25 & 0x7F00) >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var21.method1501(var22, var20[0][(var29 + 1) % var17], var20[0][var29], (byte) 1, var28, var27);
                    } else {
                        var21.method1501(var20[var24 - 1][var29], var20[var24 - 1][(var29 + 1) % var17], var20[var24][(var29 + 1) % var17], (byte) 1, var28, var27);
                        var21.method1501(var20[var24 - 1][var29], var20[var24][(var29 + 1) % var17], var20[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var21.method1480(64, 768, -50, -10, -50);
            class89.field1422.method1404(var14, arg3, var16);
        }
        int var36 = arg10 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        if (arg3) {
            return null;
        }
        int var40 = var36;
        int var41 = arg1.method1449();
        if (arg12) {
            if (arg9 > 128 && arg9 < 896) {
                var37 -= 128;
            }
            if (arg9 > 640 && arg9 < 1408) {
                var40 = var36 + 128;
            }
            if (arg9 > 1664 || arg9 < 384) {
                var38 -= 128;
            }
            if (arg9 > 1152 && arg9 < 1920) {
                var39 = var36 + 128;
            }
        }
        if (var41 < var37) {
            var41 = var37;
        }
        int var42 = arg1.method1458();
        class63 var43 = null;
        if (var39 < var42) {
            var42 = var39;
        }
        int var44 = arg1.method1465();
        if (var44 < var38) {
            var44 = var38;
        }
        int var45 = arg1.method1466();
        if (arg2 != null) {
            int var46 = arg2.field24[arg6];
            var43 = class203.method1416((byte) -82, var46 >> 16);
            arg6 = var46 & 0xFFFF;
        }
        if (var40 < var45) {
            var45 = var40;
        }
        class253 var47;
        if (var43 == null) {
            var47 = var16.method1464(true, true);
            var47.method1469((var42 - var41) / 2, 128, (var45 - var44) / 2);
            var47.method1457((var41 + var42) / 2, 0, (var44 + var45) / 2);
        } else {
            var47 = var16.method1464(!var43.method446(false, arg6), true);
            var47.method1469((var42 - var41) / 2, 128, (var45 - var44) / 2);
            var47.method1457((var41 + var42) / 2, 0, (var44 + var45) / 2);
            var47.method1444(var43, arg6);
        }
        if (arg9 != 0) {
            var47.method1445(arg9);
        }
        class209 var48 = (class209) var47;
        if (arg13 != class262.method1768(class237.field4140, arg5 + var41, arg7 + var44, (byte) -120) || arg13 != class262.method1768(class237.field4140, arg5 + var42, arg7 - -var45, (byte) -92)) {
            for (int var49 = 0; var49 < var48.field3551; var49++) {
                var48.field3540[var49] += class262.method1768(class237.field4140, var48.field3558[var49] + arg5, var48.field3534[var49] + arg7, (byte) -123) - arg13;
            }
            var48.field3537 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2770 = arg7;
        this.field2763 = arg6;
        this.field2790 = arg3;
        if (arg5 != 64512) {
            this.field2771 = false;
        }
        this.field2801 = arg2;
        this.field2777 = arg0;
        this.field2799 = arg8;
        this.field2792 = arg1;
        field2765++;
        this.field2796 = arg4;
        this.field2786 = arg9;
        int var11 = (this.field2790 + this.field2770 + this.field2777) / 3 + this.field2787.field3321;
        int var12 = (this.field2799 + this.field2796 + this.field2786) / 3 + this.field2787.field3325;
        int var13 = (this.field2801 + this.field2763 + this.field2792) / 3 + this.field2787.field3326;
        if (this.field2795 != var11 || this.field2793 != var13 || this.field2778 != var12) {
            this.field2795 = var11;
            this.field2771 = true;
            this.field2778 = var12;
            this.field2793 = var13;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
    public static void method1124(int arg0) {
        field2782 = null;
        field2798 = null;
        if (arg0 != -9997) {
            return;
        }
        field2768 = null;
        field2776 = null;
        field2797 = null;
        field2788 = null;
        field2800 = null;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Loe;Ldk;J)V")
    public class167(class71 arg0, class193 arg1, long arg2) {
        this.field2767 = arg0;
        this.field2787 = arg1;
        this.field2781 = new class243();
        this.field2775 = (int) ((double) this.field2775 + Math.random() * 64.0D);
        this.field2794 = this.field2767.field1119;
        this.field2785 = arg2;
    }
}
