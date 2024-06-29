import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class643 extends class646 {

    @OriginalMember(owner = "client!cca", name = "R", descriptor = "I")
    private int field9136 = 0;

    @OriginalMember(owner = "client!cca", name = "Q", descriptor = "I")
    private int field9135 = 0;

    @OriginalMember(owner = "client!cca", name = "Y", descriptor = "I")
    private int field9143 = 0;

    @OriginalMember(owner = "client!cca", name = "P", descriptor = "I")
    public static int field9134 = 0;

    @OriginalMember(owner = "client!cca", name = "V", descriptor = "[I")
    public static int[] field9140 = new int[] { 7500, 500 };

    @OriginalMember(owner = "client!cca", name = "X", descriptor = "Z")
    public static boolean field9142 = false;

    @OriginalMember(owner = "client!cca", name = "I", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!cca", name = "J", descriptor = "I")
    private int field9128;

    @OriginalMember(owner = "client!cca", name = "K", descriptor = "I")
    private int field9129;

    @OriginalMember(owner = "client!cca", name = "L", descriptor = "I")
    private int field9130;

    @OriginalMember(owner = "client!cca", name = "M", descriptor = "I")
    public static int field9131;

    @OriginalMember(owner = "client!cca", name = "N", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!cca", name = "O", descriptor = "I")
    private int field9133;

    @OriginalMember(owner = "client!cca", name = "S", descriptor = "I")
    private int field9137;

    @OriginalMember(owner = "client!cca", name = "T", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!cca", name = "U", descriptor = "I")
    public static int field9139;

    @OriginalMember(owner = "client!cca", name = "W", descriptor = "I")
    public static int field9141;

    @OriginalMember(owner = "client!cca", name = "Z", descriptor = "I")
    private int field9144;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIII)V", line = 7)
    private final void method3615(int arg0, int arg1, int arg2, int arg3) {
        ++field9141;
        int var5 = arg2 > 2048 ? arg2 + arg3 + -(arg2 * arg3 >> 12) : (arg3 + 4096) * arg2 >> 12;
        if (arg0 <= 4) {
            method3617(true);
        }
        if (var5 > 0) {
            int var6 = arg1 * 6;
            int var7 = -var5 + arg2 + arg2;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 == -1) {
                this.field9133 = var5;
                this.field9128 = var14;
                this.field9137 = var7;
                return;
            }
            if (var9 == 1) {
                this.field9128 = var5;
                this.field9137 = var7;
                this.field9133 = var15;
                return;
            }
            if (var9 == 2) {
                this.field9137 = var14;
                this.field9128 = var5;
                this.field9133 = var7;
                return;
            }
            if (var9 == 3) {
                this.field9133 = var7;
                this.field9128 = var15;
                this.field9137 = var5;
                return;
            }
            if (var9 == 4) {
                this.field9133 = var14;
                this.field9128 = var7;
                this.field9137 = var5;
                return;
            }
            if (~var9 == -6) {
                this.field9133 = var5;
                this.field9128 = var7;
                this.field9137 = var15;
                return;
            }
        } else {
            this.field9133 = this.field9128 = this.field9137 = arg2;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIBI)V", line = 118)
    private final void method3616(int arg0, int arg1, byte arg2, int arg3) {
        ++field9131;
        int var5 = ~arg1 > ~arg3 ? arg3 : arg1;
        int var6 = ~var5 > ~arg0 ? arg0 : var5;
        int var7 = arg3 >= arg1 ? arg1 : arg3;
        int var8 = ~var7 < ~arg0 ? arg0 : var7;
        int var9 = var6 - var8;
        this.field9129 = (var6 + var8) / 2;
        if (~var9 >= -1) {
            this.field9130 = 0;
        } else {
            int var10 = (-arg3 + var6 << 12) / var9;
            int var11 = (-arg1 + var6 << 12) / var9;
            int var12 = (-arg0 + var6 << 12) / var9;
            if (~arg3 != ~var6) {
                if (~arg1 != ~var6) {
                    this.field9130 = ~arg3 == ~var8 ? var11 + 12288 : -var10 + 20480;
                } else {
                    this.field9130 = arg0 != var8 ? -var12 + 12288 : var10 + 4096;
                }
            } else {
                this.field9130 = ~arg1 != ~var8 ? -var11 + 4096 : var12 + 20480;
            }
            this.field9130 /= 6;
        }
        if (arg2 >= -48) {
            this.method3615(65, 3, -60, -111);
        }
        if (~this.field9129 < -1 && this.field9129 < 4096) {
            this.field9144 = (var9 << 12) / (this.field9129 > 2048 ? -(this.field9129 * 2) + 8192 : this.field9129 * 2);
        } else {
            this.field9144 = 0;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(II)[[I", line = 173)
    public final int[][] method298(int arg0, int arg1) {
        ++field9127;
        if (arg0 != -12424) {
            method3618((class101) null, 126, -2, (class98) null, -12);
        }
        int[][] var3 = super.field9164.method1002(88, arg1);
        if (super.field9164.field2082) {
            int[][] var4 = this.method3626(106, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class89.field1330 < ~var11; ++var11) {
                this.method3616(var7[var11], var6[var11], (byte) -121, var5[var11]);
                this.field9144 += this.field9136;
                this.field9129 += this.field9143;
                for (this.field9130 += this.field9135; this.field9130 < 0; this.field9130 += 4096) {
                }
                while (~this.field9130 < -4097) {
                    this.field9130 -= 4096;
                }
                if (this.field9144 < 0) {
                    this.field9144 = 0;
                }
                if (~this.field9144 < -4097) {
                    this.field9144 = 4096;
                }
                if (this.field9129 < 0) {
                    this.field9129 = 0;
                }
                if (~this.field9129 < -4097) {
                    this.field9129 = 4096;
                }
                this.method3615(48, this.field9130, this.field9129, this.field9144);
                var8[var11] = this.field9133;
                var9[var11] = this.field9128;
                var10[var11] = this.field9137;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(Z)V", line = 247)
    public static void method3617(boolean arg0) {
        if (!arg0) {
            method3617(true);
        }
        field9140 = null;
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "()V", line = 260)
    public class643() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lek;IB)V", line = 273)
    public final void method295(class465 arg0, int arg1, byte arg2) {
        ++field9138;
        if (arg2 <= 7) {
            this.method3616(17, -4, (byte) -68, 75);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field9143 = (arg0.method2712(-77) << 12) / 100;
                }
            } else {
                this.field9136 = (arg0.method2712(-69) << 12) / 100;
            }
        } else {
            this.field9135 = arg0.method2744(-1);
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lis;IILr;I)V", line = 319)
    public static final void method3618(class101 arg0, int arg1, int arg2, class98 arg3, int arg4) {
        if (arg2 != 16383) {
            field9142 = false;
        }
        ++field9139;
        class591 var5 = arg0.method842((byte) 124, arg3);
        if (var5 != null) {
            arg3.method771(arg1, arg4, arg0.field1604 + arg1, arg0.field1651 + arg4);
            if (class472.field6789 != 2 && class472.field6789 != 5 && class660.field9296 != null) {
                int var6;
                int var7;
                int var8;
                int var9;
                if (~class40.field544 != -5) {
                    var6 = class103.field1708.field3154;
                    var7 = 4096 - class239.field3523 * 16;
                    var8 = (int) (-class473.field6790) + class419.field5957 & 16383;
                    var9 = class103.field1708.field3155;
                } else {
                    var8 = 16383 & (int) (-class473.field6790);
                    var7 = 4096;
                    var6 = class108.field1761;
                    var9 = class386.field5659;
                }
                int var10 = 48 - -(var9 / 128) + -((class430.field6136 + -104) * 2);
                int var11 = class580.field8504 * 4 + -(var6 / 128) + -((class580.field8504 + -104) * 2) + 48;
                class660.field9296.method1639((float) arg0.field1604 / 2.0F + (float) arg1, (float) arg0.field1651 / 2.0F + (float) arg4, (float) var10, (float) var11, var7, var8 << 2, var5, arg1, arg4);
                for (class83 var12 = (class83) class690.field9787.method3905(arg2 ^ -16270); var12 != null; var12 = (class83) class690.field9787.method3899(0)) {
                    int var58 = var12.field1264;
                    int var59 = (16383 & class189.field2961.field2514[var58] >> 14) - class143.field2474;
                    int var60 = (class189.field2961.field2514[var58] & 16383) + -class63.field917;
                    int var61 = var59 * 4 + -(var9 / 128) + 2;
                    int var62 = var60 * 4 - var6 / 128 + 2;
                    class392.method2382(var61, arg1, 305, var62, var5, arg3, arg0, class189.field2961.field2509[var58], arg4);
                }
                for (int var13 = 0; class537.field7890 > var13; ++var13) {
                    int var55 = class564.field8255[var13] * 4 + -(var9 / 128) + 2;
                    int var56 = class586.field8572[var13] * 4 - var6 / 128 + 2;
                    class119 var57 = class14.field224.method2834(0, class187.field2930[var13]);
                    if (var57.field1924 != null) {
                        var57 = var57.method969(class230.field3404, 92);
                        if (var57 == null || var57.field1893 == -1) {
                            continue;
                        }
                    }
                    class392.method2382(var55, arg1, arg2 + -16078, var56, var5, arg3, arg0, var57.field1893, arg4);
                }
                for (class430 var14 = (class430) class480.field6870.method2815(0); var14 != null; var14 = (class430) class480.field6870.method2814(arg2 + -16379)) {
                    int var50 = (int) (var14.field6265 >> 28 & 3L);
                    if (~class511.field7605 == ~var50) {
                        int var51 = (int) (var14.field6265 & 16383L) - class143.field2474;
                        int var52 = -class63.field917 + (int) (16383L & var14.field6265 >> 14);
                        int var53 = var51 * 4 + -(var9 / 128) + 2;
                        int var54 = var52 * 4 + -(var6 / 128) + 2;
                        class323.method1932(var53, arg1, arg0, class399.field5770[0], var54, var5, arg2 + -720, arg4);
                    }
                }
                for (int var15 = 0; ~class310.field4304 < ~var15; ++var15) {
                    class6 var45 = (class6) class314.field4359.method2818(-22803, (long) class253.field3667[var15]);
                    if (var45 != null) {
                        class88 var46 = var45.field49;
                        if (var46.method653((byte) 83) && ~class103.field1708.field3158 == ~var46.field3158) {
                            class528 var47 = var46.field1309;
                            if (var47 != null && var47.field7758 != null) {
                                var47 = var47.method3110(class230.field3404, false);
                            }
                            if (var47 != null && var47.field7750 && var47.field7780) {
                                int var48 = var46.field3155 / 128 - var9 / 128;
                                int var49 = var46.field3154 / 128 + -(var6 / 128);
                                if (~var47.field7744 == 0) {
                                    class323.method1932(var48, arg1, arg0, class399.field5770[1], var49, var5, 15663, arg4);
                                } else {
                                    class392.method2382(var48, arg1, 305, var49, var5, arg3, arg0, var47.field7744, arg4);
                                }
                            }
                        }
                    }
                }
                int var16 = field9134;
                int[] var17 = class98.field1458;
                for (int var18 = 0; ~var18 > ~var16; ++var18) {
                    class270 var37 = class76.field1186[var17[var18]];
                    if (var37 != null && var37.method1700((byte) -111) && !var37.field3856 && class103.field1708 != var37 && ~class103.field1708.field3158 == ~var37.field3158) {
                        int var38 = var37.field3155 / 128 + -(var9 / 128);
                        int var39 = var37.field3154 / 128 - var6 / 128;
                        boolean var40 = false;
                        for (int var41 = 0; var41 < class520.field7677; ++var41) {
                            if (var37.field3848.equals(class437.field6290[var41]) && ~class311.field4318[var41] != -1) {
                                var40 = true;
                                break;
                            }
                        }
                        boolean var42 = false;
                        for (int var43 = 0; var43 < class320.field4407; ++var43) {
                            if (var37.field3848.equals(class230.field3409[var43].field482)) {
                                var42 = true;
                                break;
                            }
                        }
                        boolean var44 = false;
                        if (class103.field1708.field3846 != 0 && ~var37.field3846 != -1 && class103.field1708.field3846 == var37.field3846) {
                            var44 = true;
                        }
                        if (!var37.field3886) {
                            if (var40) {
                                class323.method1932(var38, arg1, arg0, class399.field5770[3], var39, var5, 15663, arg4);
                            } else if (var42) {
                                class323.method1932(var38, arg1, arg0, class399.field5770[5], var39, var5, 15663, arg4);
                            } else if (var44) {
                                class323.method1932(var38, arg1, arg0, class399.field5770[4], var39, var5, 15663, arg4);
                            } else {
                                class323.method1932(var38, arg1, arg0, class399.field5770[2], var39, var5, arg2 + -720, arg4);
                            }
                        } else {
                            class323.method1932(var38, arg1, arg0, class399.field5770[6], var39, var5, 15663, arg4);
                        }
                    }
                }
                class258[] var19 = class481.field6873;
                for (int var20 = 0; var20 < var19.length; ++var20) {
                    class258 var23 = var19[var20];
                    if (var23 != null && var23.field3709 != 0 && class148.field2508 % 20 < 10) {
                        if (var23.field3709 == 1) {
                            class6 var24 = (class6) class314.field4359.method2818(-22803, (long) var23.field3705);
                            if (var24 != null) {
                                class88 var25 = var24.field49;
                                int var26 = var25.field3155 / 128 + -(var9 / 128);
                                int var27 = var25.field3154 / 128 + -(var6 / 128);
                                class255.method1623(var26, var23.field3701, arg1, var27, 360000L, (byte) 56, arg0, var5, arg4);
                            }
                        }
                        if (var23.field3709 == 2) {
                            int var28 = var23.field3698 / 128 + -(var9 / 128);
                            int var29 = var23.field3704 / 128 - var6 / 128;
                            long var30 = (long) (var23.field3706 << 7);
                            long var32 = var30 * var30;
                            class255.method1623(var28, var23.field3701, arg1, var29, var32, (byte) 60, arg0, var5, arg4);
                        }
                        if (~var23.field3709 == -11 && var23.field3705 >= 0 && class76.field1186.length > var23.field3705) {
                            class270 var34 = class76.field1186[var23.field3705];
                            if (var34 != null) {
                                int var35 = var34.field3155 / 128 + -(var9 / 128);
                                int var36 = var34.field3154 / 128 + -(var6 / 128);
                                class255.method1623(var35, var23.field3701, arg1, var36, 360000L, (byte) 116, arg0, var5, arg4);
                            }
                        }
                    }
                }
                if (class40.field544 != 4) {
                    if (~class400.field5777 != -1) {
                        int var21 = class400.field5777 * 4 + 2 - (var9 / 128 - class103.field1708.method1108(83) * 2) - 2;
                        int var22 = class202.field3126 * 4 - -2 + -(var6 / 128) + (2 * class103.field1708.method1108(127) - 2);
                        class323.method1932(var21, arg1, arg0, class44.field593[!class153.field2547 ? 0 : 1], var22, var5, arg2 ^ 720, arg4);
                    }
                    if (!class103.field1708.field3856) {
                        arg3.method792(3, (byte) -88, 3, arg4 + -1 - -(arg0.field1651 / 2), -1, arg0.field1604 / 2 + arg1 + -1);
                        return;
                    }
                }
            } else {
                arg3.method780(-16777216, var5, arg1, arg4);
            }
        }
    }
}
