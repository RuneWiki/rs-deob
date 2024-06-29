import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class643 extends class642 {

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    private int field9220 = 0;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    private int field9233 = 0;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
    private int field9228 = 0;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "[I")
    public static int[] field9229 = new int[14];

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "[I")
    public static int[] field9219 = new int[3];

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public static int field9225 = 0;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "J")
    public static long field9237 = 20000000L;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public static int field9218;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public static int field9221;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public static int field9222;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
    public static int field9223;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    private int field9224;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    private int field9226;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
    public static int field9227;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
    public static int field9230;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    private int field9231;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    private int field9232;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
    private int field9234;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    public static int field9235;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "I")
    private int field9236;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)Z")
    public static final boolean method3659(int arg0) {
        ++field9221;
        if (class264.field3451 < 1) {
            return false;
        } else {
            int var1 = -31 / ((5 - arg0) / 32);
            return true;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBII)V")
    private final void method3660(int arg0, byte arg1, int arg2, int arg3) {
        ++field9223;
        int var5 = ~arg0 <= ~arg3 ? arg0 : arg3;
        int var6 = ~arg2 >= ~var5 ? var5 : arg2;
        int var7 = ~arg0 >= ~arg3 ? arg0 : arg3;
        if (arg1 != 8) {
            method3663(54);
        }
        int var8 = var7 > arg2 ? arg2 : var7;
        this.field9232 = (var8 - -var6) / 2;
        int var9 = var6 - var8;
        if (~this.field9232 < -1 && ~this.field9232 > -4097) {
            this.field9226 = (var9 << 12) / (~this.field9232 >= -2049 ? this.field9232 * 2 : -(this.field9232 * 2) + 8192);
        } else {
            this.field9226 = 0;
        }
        if (~var9 < -1) {
            int var10 = (-arg3 + var6 << 12) / var9;
            int var11 = (-arg0 + var6 << 12) / var9;
            int var12 = (-arg2 + var6 << 12) / var9;
            if (~arg3 == ~var6) {
                this.field9231 = ~arg0 != ~var8 ? -var11 + 4096 : var12 + 20480;
            } else if (arg0 != var6) {
                this.field9231 = arg3 == var8 ? var11 + 12288 : -var10 + 20480;
            } else {
                this.field9231 = ~arg2 == ~var8 ? var10 + 4096 : -var12 + 12288;
            }
            this.field9231 /= 6;
        } else {
            this.field9231 = 0;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[[I")
    public final int[][] method138(int arg0, int arg1) {
        ++field9222;
        if (arg0 != 21402) {
            this.method3661(111, -23, 27, -11);
        }
        int[][] var3 = super.field9211.method1068(0, arg1);
        if (super.field9211.field2131) {
            int[][] var4 = this.method3657(arg1, true, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class338.field4909 > var11; ++var11) {
                this.method3660(var6[var11], (byte) 8, var7[var11], var5[var11]);
                this.field9231 += this.field9228;
                this.field9226 += this.field9233;
                this.field9232 += this.field9220;
                while (this.field9231 < 0) {
                    this.field9231 += 4096;
                }
                if (this.field9226 < 0) {
                    this.field9226 = 0;
                }
                while (~this.field9231 < -4097) {
                    this.field9231 -= 4096;
                }
                if (this.field9232 < 0) {
                    this.field9232 = 0;
                }
                if (~this.field9226 < -4097) {
                    this.field9226 = 4096;
                }
                if (this.field9232 > 4096) {
                    this.field9232 = 4096;
                }
                this.method3661(this.field9226, arg0 ^ -31348, this.field9231, this.field9232);
                var8[var11] = this.field9234;
                var9[var11] = this.field9236;
                var10[var11] = this.field9224;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    public class643() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
    private final void method3661(int arg0, int arg1, int arg2, int arg3) {
        ++field9218;
        if (arg1 != -10730) {
            this.method138(-13, -110);
        }
        int var5 = arg3 <= 2048 ? (arg0 + 4096) * arg3 >> 12 : arg0 + arg3 + -(arg0 * arg3 >> 12);
        if (~var5 >= -1) {
            this.field9234 = this.field9236 = this.field9224 = arg3;
        } else {
            int var6 = arg2 * 6;
            int var7 = -var5 + arg3 - -arg3;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (var9 != 1) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (var9 == 5) {
                                    this.field9234 = var5;
                                    this.field9224 = var15;
                                    this.field9236 = var7;
                                }
                            } else {
                                this.field9236 = var7;
                                this.field9224 = var5;
                                this.field9234 = var14;
                            }
                        } else {
                            this.field9236 = var15;
                            this.field9224 = var5;
                            this.field9234 = var7;
                        }
                    } else {
                        this.field9236 = var5;
                        this.field9224 = var14;
                        this.field9234 = var7;
                    }
                } else {
                    this.field9234 = var15;
                    this.field9236 = var5;
                    this.field9224 = var7;
                }
            } else {
                this.field9224 = var7;
                this.field9236 = var14;
                this.field9234 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILeh;Lr;I)V")
    public static final void method3662(int arg0, class203 arg1, class98 arg2, int arg3) {
        ++field9230;
        if (class474.field6809 != null && ~arg1.field2766 <= ~arg3) {
            for (int var4 = 0; var4 < class474.field6809.length; ++var4) {
                if (~class474.field6809[var4] != 999999 && (~class474.field6809[var4] <= ~arg1.field2780[0] || ~arg1.field2780[1] >= ~class474.field6809[var4] || arg1.field2780[2] <= class474.field6809[var4] || class474.field6809[var4] >= arg1.field2780[3]) && (class501.field7089[var4] >= arg1.field2770[0] || class501.field7089[var4] >= arg1.field2770[1] || ~class501.field7089[var4] <= ~arg1.field2770[2] || ~arg1.field2770[3] >= ~class501.field7089[var4]) && (~arg1.field2770[0] <= ~class236.field3109[var4] || ~class236.field3109[var4] >= ~arg1.field2770[1] || arg1.field2770[2] >= class236.field3109[var4] || arg1.field2770[3] >= class236.field3109[var4]) && (~class486.field6916[var4] <= ~arg1.field2772[0] || ~arg1.field2772[1] >= ~class486.field6916[var4] || class486.field6916[var4] >= arg1.field2772[2] || ~class486.field6916[var4] <= ~arg1.field2772[3]) && (~arg1.field2772[0] <= ~class280.field3709[var4] || ~class280.field3709[var4] >= ~arg1.field2772[1] || class280.field3709[var4] <= arg1.field2772[2] || ~class280.field3709[var4] >= ~arg1.field2772[3])) {
                    return;
                }
            }
        }
        if (arg0 == -19717) {
            if (~arg1.field2779 == -2) {
                int var5 = -class361.field5293 + arg1.field2781 + class176.field2466;
                if (~var5 <= -1 && class176.field2466 - -class176.field2466 >= var5) {
                    int var6 = -class545.field8045 + arg1.field2777 + class176.field2466;
                    if (~var6 <= -1) {
                        if (~(class176.field2466 + class176.field2466) > ~var6) {
                            return;
                        }
                    } else {
                        var6 = 0;
                    }
                    int var7 = -class545.field8045 + arg1.field2782 + class176.field2466;
                    if (~(class176.field2466 + class176.field2466) > ~var7) {
                        var7 = class176.field2466 + class176.field2466;
                    } else if (var7 < 0) {
                        return;
                    }
                    boolean var8 = false;
                    while (var7 >= var6) {
                        if (class406.field6066[var5][var6++]) {
                            var8 = true;
                            break;
                        }
                    }
                    if (var8) {
                        float var9 = (float) (class653.field9353 - arg1.field2770[0]);
                        if (var9 < 0.0F) {
                            var9 *= -1.0F;
                        }
                        if (!(var9 < (float) class304.field4510)) {
                            if (class9.method71(arg1, 0, 34)) {
                                if (class9.method71(arg1, 1, 64)) {
                                    if (class9.method71(arg1, 2, 70)) {
                                        if (class9.method71(arg1, 3, 33)) {
                                            class619.field8969[class231.field3064++] = arg1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (arg1.field2779 == 2) {
                int var10 = -class545.field8045 + arg1.field2777 - -class176.field2466;
                if (~var10 <= -1 && ~var10 >= ~(class176.field2466 - -class176.field2466)) {
                    int var11 = -class361.field5293 + arg1.field2781 - -class176.field2466;
                    if (~var11 <= -1) {
                        if (class176.field2466 + class176.field2466 < var11) {
                            return;
                        }
                    } else {
                        var11 = 0;
                    }
                    int var12 = -class361.field5293 + arg1.field2783 - -class176.field2466;
                    if (class176.field2466 + class176.field2466 >= var12) {
                        if (var12 < 0) {
                            return;
                        }
                    } else {
                        var12 = class176.field2466 + class176.field2466;
                    }
                    boolean var13 = false;
                    while (var11 <= var12) {
                        if (class406.field6066[var11++][var10]) {
                            var13 = true;
                            break;
                        }
                    }
                    if (var13) {
                        float var14 = (float) (class46.field717 - arg1.field2772[0]);
                        if (var14 < 0.0F) {
                            var14 *= -1.0F;
                        }
                        if (!((float) class304.field4510 > var14)) {
                            if (class9.method71(arg1, 0, 92)) {
                                if (class9.method71(arg1, 1, 80)) {
                                    if (class9.method71(arg1, 2, 29)) {
                                        if (class9.method71(arg1, 3, 64)) {
                                            class619.field8969[class231.field3064++] = arg1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (arg1.field2779 != 16 && arg1.field2779 != 8) {
                if (~arg1.field2779 == -5) {
                    float var15 = (float) (arg1.field2780[0] + -class36.field559);
                    if (!(var15 <= (float) class250.field3281)) {
                        int var16 = -class545.field8045 + class176.field2466 + arg1.field2777;
                        if (var16 >= 0) {
                            if (~(class176.field2466 + class176.field2466) > ~var16) {
                                return;
                            }
                        } else {
                            var16 = 0;
                        }
                        int var17 = arg1.field2782 - (class545.field8045 - class176.field2466);
                        if (~(class176.field2466 + class176.field2466) <= ~var17) {
                            if (var17 < 0) {
                                return;
                            }
                        } else {
                            var17 = class176.field2466 + class176.field2466;
                        }
                        int var18 = arg1.field2781 - (class361.field5293 - class176.field2466);
                        if (~var18 > -1) {
                            var18 = 0;
                        } else if (~var18 < ~(class176.field2466 + class176.field2466)) {
                            return;
                        }
                        int var19 = -class361.field5293 + arg1.field2783 + class176.field2466;
                        if (class176.field2466 + class176.field2466 < var19) {
                            var19 = class176.field2466 - -class176.field2466;
                        } else if (~var19 > -1) {
                            return;
                        }
                        boolean var20 = false;
                        label296: for (int var21 = var18; var19 >= var21; ++var21) {
                            for (int var22 = var16; var22 <= var17; ++var22) {
                                if (class406.field6066[var21][var22]) {
                                    var20 = true;
                                    break label296;
                                }
                            }
                        }
                        if (var20) {
                            if (class9.method71(arg1, 0, 98)) {
                                if (class9.method71(arg1, 1, 16)) {
                                    if (class9.method71(arg1, 2, 101)) {
                                        if (class9.method71(arg1, 3, arg0 + 19792)) {
                                            class619.field8969[class231.field3064++] = arg1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                int var23 = arg1.field2781 - class361.field5293 - -class176.field2466;
                if (var23 >= 0 && var23 <= class176.field2466 + class176.field2466) {
                    int var24 = arg1.field2777 - class545.field8045 + class176.field2466;
                    if (var24 >= 0 && ~(class176.field2466 - -class176.field2466) <= ~var24) {
                        if (class406.field6066[var23][var24]) {
                            float var25 = (float) (class653.field9353 - arg1.field2770[0]);
                            if (var25 < 0.0F) {
                                var25 *= -1.0F;
                            }
                            float var26 = (float) (class46.field717 - arg1.field2772[0]);
                            if (var26 < 0.0F) {
                                var26 *= -1.0F;
                            }
                            if (!((float) class304.field4510 > var25) || !(var26 < (float) class304.field4510)) {
                                if (class9.method71(arg1, 0, arg0 ^ -19754)) {
                                    if (class9.method71(arg1, 1, 27)) {
                                        if (class9.method71(arg1, 2, 120)) {
                                            if (class9.method71(arg1, 3, 116)) {
                                                class619.field8969[class231.field3064++] = arg1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)V")
    public static void method3663(int arg0) {
        field9219 = null;
        int var1 = 107 / ((64 - arg0) / 62);
        field9229 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILgk;B)V")
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field9220 = (arg1.method3128(32767) << 12) / 100;
                }
            } else {
                this.field9233 = (arg1.method3128(32767) << 12) / 100;
            }
        } else {
            this.field9228 = arg1.method3129(101);
        }
        if (arg2 < 29) {
            method3663(125);
        }
        ++field9235;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)Z")
    public static final boolean method3664(int arg0, boolean arg1) {
        ++field9227;
        if (arg0 != 21 && ~arg0 != -19 && ~arg0 != -12 && ~arg0 != -5 && arg0 != 1003) {
            if (arg0 != 9 && ~arg0 != -1008) {
                if (arg1) {
                    method3659(111);
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}
