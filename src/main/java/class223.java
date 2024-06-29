import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class223 extends class231 {

    @OriginalMember(owner = "client!te", name = "t", descriptor = "Z")
    public boolean field3742 = false;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "Z")
    public boolean field3756 = true;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "I")
    private int field3772 = 0;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "Lvb;")
    public class193 field3750;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "Lge;")
    public class139 field3755;

    @OriginalMember(owner = "client!te", name = "U", descriptor = "Lie;")
    public class169 field3769;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "J")
    private long field3759;

    @OriginalMember(owner = "client!te", name = "S", descriptor = "Lli;")
    public class12 field3767;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field3758 = 0;

    @OriginalMember(owner = "client!te", name = "O", descriptor = "[Lbf;")
    public static class31[] field3763 = new class31[14];

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    private int field3734;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public int field3735;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public int field3736;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public int field3739;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    private int field3740;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    private int field3743;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    private int field3746;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    private int field3748;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    private int field3749;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    private int field3752;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    private int field3753;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    private int field3760;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "I")
    private int field3761;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "I")
    private int field3762;

    @OriginalMember(owner = "client!te", name = "P", descriptor = "I")
    private int field3764;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    private int field3765;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    private int field3766;

    @OriginalMember(owner = "client!te", name = "T", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!te", name = "V", descriptor = "I")
    public int field3770;

    @OriginalMember(owner = "client!te", name = "W", descriptor = "I")
    private int field3771;

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
    private int field3773;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)I")
    public static final int method1580(int arg0, int arg1, int arg2) {
        int var3 = class269.method1890(4, arg0 + 91923, (byte) 83, arg1 + 45365) - (-(class269.method1890(2, arg0 + 37821, (byte) 83, arg1 - -10294) + -128 >> 1) + -(class269.method1890(1, arg0, (byte) 83, arg1) + -128 >> 2)) - 128;
        field3751++;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        if (arg2 > -116) {
            method1581(-65, (class207) null);
        }
        return var4;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILhg;)Z")
    public static final boolean method1581(int arg0, class207 arg1) {
        field3738++;
        if (arg1.field3442 == null) {
            return false;
        } else if (arg0 < 29) {
            return true;
        } else {
            for (int var2 = 0; var2 < arg1.field3442.length; var2++) {
                int var3 = class180.method1313(-28178, arg1, var2);
                int var4 = arg1.field3377[var2];
                if (arg1.field3442[var2] == 2) {
                    if (var3 >= var4) {
                        return false;
                    }
                } else if (arg1.field3442[var2] == 3) {
                    if (var3 <= var4) {
                        return false;
                    }
                } else if (arg1.field3442[var2] == 4) {
                    if (var3 == var4) {
                        return false;
                    }
                } else if (var3 != var4) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
    public static final void method1582(int arg0) {
        if (arg0 < 15) {
            field3758 = -87;
        }
        class31.field518.method97(105);
        field3768++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
    public static void method1583(boolean arg0) {
        field3763 = null;
        if (!arg0) {
            method1587(29, (String) null);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIIIIB)V")
    public final void method1584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        this.field3764 = arg7;
        this.field3760 = arg2;
        this.field3773 = arg4;
        this.field3771 = arg0;
        this.field3734 = arg3;
        this.field3749 = arg1;
        this.field3765 = arg8;
        field3745++;
        this.field3740 = arg5;
        int var11 = (this.field3773 + this.field3760 + this.field3764) / 3 + this.field3755.field2288;
        this.field3746 = arg6;
        int var12 = (this.field3734 + this.field3765 + this.field3771) / 3 + this.field3755.field2295;
        int var13 = (this.field3749 + this.field3740 + this.field3746) / 3 + this.field3755.field2301;
        if (this.field3736 != var11 || this.field3770 != var12 || this.field3739 != var13) {
            this.field3736 = var11;
            this.field3770 = var12;
            this.field3739 = var13;
            this.field3756 = true;
        }
        if (arg9 != -51) {
            field3741 = 95;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(JIIIIZ)V")
    public final void method1585(long arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3754++;
        if (this.field3742) {
            arg5 = false;
        } else if (this.field3767.field252 > class139.field2298) {
            arg5 = false;
        } else if (class259.field4354[class139.field2298] < class139.field2267) {
            arg5 = false;
        } else if (this.field3773 == this.field3764 && this.field3773 == this.field3760 && this.field3771 == this.field3734 && this.field3771 == this.field3765 && this.field3746 == this.field3740 && this.field3749 == this.field3740) {
            arg5 = false;
        } else if (this.field3767.field254 != -1) {
            int var8 = (int) (arg0 - this.field3759);
            if (this.field3767.field259 || var8 <= this.field3767.field254) {
                var8 %= this.field3767.field254;
            } else {
                arg5 = false;
            }
            if (!this.field3767.field202 && this.field3767.field249 > var8) {
                arg5 = false;
            }
            if (this.field3767.field202 && this.field3767.field249 <= var8) {
                arg5 = false;
            }
        }
        if (arg5) {
            this.field3772 += (int) ((double) arg2 * (Math.random() * (double) (this.field3767.field265 - this.field3767.field241) + (double) this.field3767.field241));
            if (this.field3772 > 63) {
                int var9 = this.field3772 >> 6;
                this.field3772 &= 0x3F;
                if (this.field3756) {
                    int var10 = this.field3773 - this.field3764;
                    int var11 = this.field3771 - this.field3734;
                    int var12 = this.field3760 - this.field3764;
                    int var13 = this.field3765 - this.field3734;
                    int var14 = this.field3749 - this.field3746;
                    int var15 = this.field3740 - this.field3746;
                    this.field3743 = var10 * var13 - var11 * var12;
                    this.field3761 = var11 * var14 - (var13 * var15);
                    this.field3752 = var12 * var15 - var10 * var14;
                    while (true) {
                        if (this.field3761 <= 32767 && this.field3752 <= 32767 && this.field3743 <= 32767 && this.field3761 >= -32767 && this.field3752 >= -32767 && this.field3743 >= -32767) {
                            int var16 = (int) Math.sqrt((double) (this.field3752 * this.field3752 + this.field3761 * this.field3761 + this.field3743 * this.field3743));
                            if (var16 <= 0) {
                                var16 = 1;
                            }
                            this.field3743 = this.field3743 * 32767 / var16;
                            this.field3761 = this.field3761 * 32767 / var16;
                            this.field3752 = this.field3752 * 32767 / var16;
                            if (this.field3767.field243 > 0 || this.field3767.field225 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field3743, (double) this.field3761) * 2047.0D / 6.283185307179586D);
                                int var19 = (int) (Math.atan2((double) this.field3752, Math.sqrt((double) (this.field3761 * this.field3761 + this.field3743 * this.field3743))) * 2047.0D / 6.283185307179586D);
                                this.field3748 = this.field3767.field243 - this.field3767.field232;
                                this.field3753 = this.field3767.field225 - this.field3767.field235;
                                int var20 = var18 - this.field3755.field2300;
                                this.field3766 = this.field3767.field232 + var20 - (this.field3748 / 2);
                                this.field3762 = var19 - (this.field3753 / 2 - this.field3767.field235);
                            } else if (this.field3755.field2300 != 0) {
                                int var17 = this.field3761 * arg1 + this.field3743 * arg3 >> 16;
                                this.field3743 = this.field3743 * arg1 - this.field3761 * arg3 >> 16;
                                this.field3761 = var17;
                            }
                            this.field3756 = false;
                            break;
                        }
                        this.field3743 >>= 0x1;
                        this.field3761 >>= 0x1;
                        this.field3752 >>= 0x1;
                    }
                }
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field3767.field243 <= 0 && this.field3767.field225 <= 0) {
                        var22 = this.field3743;
                        var23 = this.field3761;
                        var24 = this.field3752;
                    } else {
                        int var25 = this.field3766 + (int) ((double) this.field3748 * Math.random());
                        int var26 = var25 & 0x7FF;
                        int var27 = class128.field2133[var26] >> 1;
                        int var28 = class128.field2130[var26] >> 1;
                        int var29 = (int) ((double) this.field3753 * Math.random()) + this.field3762;
                        int var30 = var29 & 0x3FF;
                        int var31 = class128.field2130[var30] >> 1;
                        var24 = var31 * -1;
                        int var32 = class128.field2133[var30] >> 1;
                        var22 = var27 * var32 >> 15;
                        var23 = var28 * var32 >> 15;
                    }
                    int var33 = (int) (Math.random() * 255.0D);
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (255 - var33) * var34 >> 8;
                    int var36 = 255 - var33 - var35;
                    int var37 = this.field3760 * var36 + this.field3773 * var35 + this.field3764 * var33 >> 8;
                    int var38 = this.field3740 * var35 + this.field3749 * var36 + this.field3746 * var33 >> 8;
                    int var39 = this.field3734 * var33 + this.field3771 * var35 + this.field3765 * var36 >> 8;
                    if (this.field3755.field2300 != 0) {
                        int var40 = arg1 * var37 + arg3 * var38 >> 16;
                        var38 = arg1 * var38 - (arg3 * var37) >> 16;
                        var37 = var40;
                    }
                    int var41 = this.field3767.field209 + (int) (Math.random() * (double) (this.field3767.field236 - this.field3767.field209));
                    int var42 = this.field3767.field228 + (int) (Math.random() * (double) (this.field3767.field224 - this.field3767.field228));
                    int var45;
                    if (this.field3767.field215) {
                        double var43 = Math.random();
                        var45 = (int) ((double) this.field3767.field237 * var43 + (double) this.field3767.field257) << 16 | (int) ((double) this.field3767.field233 * var43 + (double) this.field3767.field206) << 8 | (int) ((double) this.field3767.field219 * var43 + (double) this.field3767.field239) | (int) ((double) this.field3767.field244 * var43 + (double) this.field3767.field245) << 24;
                    } else {
                        var45 = (int) ((double) this.field3767.field245 + (double) this.field3767.field244 * Math.random()) << 24 | (int) (Math.random() * (double) this.field3767.field233 + (double) this.field3767.field206) << 8 | (int) (Math.random() * (double) this.field3767.field237 + (double) this.field3767.field257) << 16 | (int) (Math.random() * (double) this.field3767.field219 + (double) this.field3767.field239);
                    }
                    if (class139.field2283 == class139.field2276) {
                        new class38(this, this.field3755.field2288 + var37, this.field3755.field2295 - -var39, this.field3755.field2301 + var38, var23, var24, var22, var41, var42, var45);
                    } else {
                        class38 var47 = class139.field2277[class139.field2276];
                        class139.field2276 = class139.field2276 + 1 & 0x3FF;
                        var47.method234(this, this.field3755.field2288 + var37, this.field3755.field2295 - -var39, this.field3755.field2301 + var38, var23, var24, var22, var41, var42, var45);
                    }
                }
            }
        }
        this.field3735 = arg4;
        for (class38 var48 = (class38) this.field3769.method1265(8211); var48 != null; var48 = (class38) this.field3769.method1266(8226)) {
            var48.method233(arg0, arg2);
            this.field3735++;
        }
        class139.field2272 += this.field3735;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)V")
    public static final void method1586(int arg0, int arg1, int arg2, int arg3) {
        field3747++;
        int var4 = class289.field4767 * arg3 >> 8;
        if (arg0 != var4 && arg1 != -1) {
            class203.method1421(arg1, false, 0, 120, var4, class123.field2090);
            class101.field1601 = true;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1587(int arg0, String arg1) {
        field3757++;
        if (arg1 == null) {
            return;
        }
        String var2 = class207.method1458(-101, arg1);
        if (var2 == null) {
            return;
        }
        int var3 = 83 % ((-arg0 - 4) / 44);
        for (int var4 = 0; var4 < class86.field1425; var4++) {
            String var5 = class207.method1458(-128, class180.field2876[var4]);
            if (var5 != null && var5.equals(var2)) {
                class302.field4920++;
                class86.field1425--;
                for (int var6 = var4; var6 < class86.field1425; var6++) {
                    class180.field2876[var6] = class180.field2876[var6 + 1];
                    class122.field2043[var6] = class122.field2043[var6 + 1];
                    class122.field2045[var6] = class122.field2045[var6 + 1];
                    class152.field2533[var6] = class152.field2533[var6 + 1];
                    class88.field1455[var6] = class88.field1455[var6 + 1];
                }
                class293.field4824 = class196.field3162;
                class236.field3980.method640((byte) 97, 11);
                class236.field3980.method1780(class73.method517(-1, arg1), 75);
                class236.field3980.method1786(-25149, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lvb;Lge;J)V")
    public class223(class193 arg0, class139 arg1, long arg2) {
        this.field3750 = arg0;
        this.field3755 = arg1;
        this.field3769 = new class169();
        this.field3759 = arg2;
        this.field3772 = (int) ((double) this.field3772 + Math.random() * 64.0D);
        this.field3767 = this.field3750.field3108;
    }
}
