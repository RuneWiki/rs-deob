import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class27 extends class224 {

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    private int field372 = 3216;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "I")
    private int field377 = 4096;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    private int field374 = 3216;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "[I")
    private int[] field381 = new int[3];

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V")
    public final void method18(int arg0) {
        ++field370;
        this.method232(1);
        if (arg0 > -4) {
            this.method14(-24, true);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBIIII)V")
    public static final void method231(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field382;
        for (int var6 = arg3; arg0 + arg3 >= var6; ++var6) {
            for (int var12 = arg2; arg2 + arg4 >= var12; ++var12) {
                if (~var12 <= -1 && var12 < 104 && var6 >= 0 && ~var6 > -105) {
                    class245.field3933[arg5][var12][var6] = 127;
                }
            }
        }
        int var7 = -13 / ((10 - arg1) / 61);
        for (int var8 = arg3; ~(arg0 + arg3) < ~var8; ++var8) {
            for (int var11 = arg2; var11 < arg2 + arg4; ++var11) {
                if (var11 >= 0 && var11 < 104 && var8 >= 0 && var8 < 104) {
                    class200.field3128[arg5][var11][var8] = arg5 > 0 ? class200.field3128[arg5 + -1][var11][var8] : 0;
                }
            }
        }
        if (~arg2 < -1 && arg2 < 104) {
            for (int var9 = arg3 - -1; var9 < arg3 - -arg0; ++var9) {
                if (~var9 <= -1 && var9 < 104) {
                    class200.field3128[arg5][arg2][var9] = class200.field3128[arg5][arg2 - 1][var9];
                }
            }
        }
        if (~arg3 < -1 && ~arg3 > -105) {
            for (int var10 = arg2 + 1; var10 < arg2 + arg4; ++var10) {
                if (var10 >= 0 && ~var10 > -105) {
                    class200.field3128[arg5][var10][arg3] = class200.field3128[arg5][var10][arg3 - 1];
                }
            }
        }
        if (arg2 >= 0 && ~arg3 <= -1 && arg2 < 104 && arg3 < 104) {
            if (~arg5 == -1) {
                if (arg2 > 0 && ~class200.field3128[arg5][arg2 + -1][arg3] != -1) {
                    class200.field3128[arg5][arg2][arg3] = class200.field3128[arg5][arg2 - 1][arg3];
                    return;
                }
                if (~arg3 < -1 && class200.field3128[arg5][arg2][arg3 + -1] != 0) {
                    class200.field3128[arg5][arg2][arg3] = class200.field3128[arg5][arg2][arg3 + -1];
                    return;
                }
                if (~arg2 < -1 && ~arg3 < -1 && class200.field3128[arg5][arg2 + -1][arg3 + -1] != 0) {
                    class200.field3128[arg5][arg2][arg3] = class200.field3128[arg5][arg2 + -1][arg3 + -1];
                    return;
                }
            } else {
                if (arg2 <= 0 || class200.field3128[arg5 + -1][arg2 - 1][arg3] == class200.field3128[arg5][arg2 - 1][arg3]) {
                    if (~arg3 < -1 && ~class200.field3128[arg5 - 1][arg2][arg3 - 1] != ~class200.field3128[arg5][arg2][arg3 + -1]) {
                        class200.field3128[arg5][arg2][arg3] = class200.field3128[arg5][arg2][arg3 + -1];
                        return;
                    }
                    if (~arg2 < -1 && ~arg3 < -1 && class200.field3128[arg5][arg2 - 1][arg3 + -1] != class200.field3128[arg5 + -1][arg2 + -1][arg3 + -1]) {
                        class200.field3128[arg5][arg2][arg3] = class200.field3128[arg5][arg2 - 1][arg3 + -1];
                        return;
                    }
                    return;
                }
                class200.field3128[arg5][arg2][arg3] = class200.field3128[arg5][arg2 + -1][arg3];
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        ++field378;
        if (!arg1) {
            this.method14(10, false);
        }
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (super.field3625.field4425) {
            int var4 = class52.field721 * this.field377 >> 12;
            int[] var5 = this.method1527(arg0 - 1 & class261.field4217, 0, (byte) 84);
            int[] var6 = this.method1527(arg0, 0, (byte) 84);
            int[] var7 = this.method1527(arg0 - -1 & class261.field4217, 0, (byte) 84);
            for (int var8 = 0; class78.field1108 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class206.field3220 & var8 + -1] + -var6[var8 + 1 & class206.field3220]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class205.field3212[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field381[2] * var14 >> 12;
                int var18 = this.field381[0] * var15 >> 12;
                int var19 = this.field381[1] * var16 >> 12;
                var3[var8] = var18 + var19 - -var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
    private final void method232(int arg0) {
        double var2 = Math.cos((double) ((float) this.field374 / 4096.0F));
        this.field381[0] = (int) (var2 * Math.sin((double) ((float) this.field372 / 4096.0F)) * 4096.0D);
        ++field375;
        this.field381[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field372 / 4096.0F)));
        this.field381[2] = (int) (Math.sin((double) ((float) this.field374 / 4096.0F)) * 4096.0D);
        int var4 = this.field381[arg0] * this.field381[1] >> 12;
        int var5 = this.field381[2] * this.field381[2] >> 12;
        int var6 = this.field381[0] * this.field381[0] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var6 + var5 >> 12)));
        if (var7 != 0) {
            this.field381[1] = (this.field381[1] << 12) / var7;
            this.field381[0] = (this.field381[0] << 12) / var7;
            this.field381[2] = (this.field381[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        ++field376;
        if (arg2 > -46) {
            method231(-1, (byte) 106, 4, -37, 8, 45);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field374 = arg0.method190(-3);
                }
            } else {
                this.field372 = arg0.method190(-3);
            }
        } else {
            this.field377 = arg0.method190(-3);
        }
    }

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)V")
    public static final void method233(int arg0) {
        ++class262.field4231;
        if (arg0 == -30617) {
            ++field380;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class27() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lef;III)V")
    public static final void method234(class214 arg0, int arg1, int arg2, int arg3) {
        ++field371;
        if (~arg0.field3382 == -2) {
            class244.method1647(arg0.field3425, 0, arg0.field3474, -1, 0, 0L, (short) 34, "");
            ++class68.field960;
        }
        if (~arg0.field3382 == -3 && !class45.field572) {
            String var4 = class94.method630(arg0, arg3 + -20588);
            if (var4 != null) {
                class244.method1647(var4, arg3 + -20707, arg0.field3474, -1, -1, 0L, (short) 15, "<col=00ff00>" + arg0.field3410);
                ++class93.field1452;
            }
        }
        if (arg3 == 20707) {
            if (~arg0.field3382 == -4) {
                ++class242.field3878;
                class244.method1647(class274.field4374, 0, arg0.field3474, -1, 0, 0L, (short) 50, "");
            }
            if (~arg0.field3382 == -5) {
                class244.method1647(arg0.field3425, 0, arg0.field3474, -1, 0, 0L, (short) 8, "");
                ++class214.field3383;
            }
            if (arg0.field3382 == 5) {
                ++class247.field3957;
                class244.method1647(arg0.field3425, 0, arg0.field3474, -1, 0, 0L, (short) 31, "");
            }
            if (~arg0.field3382 == -7 && class249.field3995 == null) {
                class244.method1647(arg0.field3425, arg3 ^ 20707, arg0.field3474, -1, -1, 0L, (short) 30, "");
                ++class152.field2253;
            }
            if (~arg0.field3447 == -3) {
                int var5 = 0;
                for (int var6 = 0; ~arg0.field3486 < ~var6; ++var6) {
                    for (int var7 = 0; arg0.field3426 > var7; ++var7) {
                        int var8 = (arg0.field3402 + 32) * var6;
                        int var9 = (arg0.field3354 + 32) * var7;
                        if (~var5 > -21) {
                            var8 += arg0.field3476[var5];
                            var9 += arg0.field3466[var5];
                        }
                        if (~arg1 <= ~var9 && arg2 >= var8 && ~arg1 > ~(var9 + 32) && ~(var8 + 32) < ~arg2) {
                            class2.field17 = var5;
                            class194.field3056 = arg0;
                            if (arg0.field3341[var5] > 0) {
                                class72 var10 = client.method1038(arg0);
                                class253 var11 = class162.method1112(arg0.field3341[var5] + -1, (byte) 106);
                                if (~class66.field921 == -2 && var10.method491(117)) {
                                    if (class252.field4028 != arg0.field3474 || class63.field872 != var5) {
                                        ++class62.field853;
                                        class244.method1647(class218.field3547, 0, arg0.field3474, -1, var5, (long) var11.field4033, (short) 46, class53.field736 + " -> <col=ff9040>" + var11.field4035);
                                    }
                                } else if (class45.field572 && var10.method491(123)) {
                                    class110 var12 = class151.field2243 == -1 ? null : class222.method1512(arg3 + -20709, class151.field2243);
                                    if (~(16 & class207.field3238) != -1 && (var12 == null || var11.method1693(class151.field2243, var12.field1667, arg3 ^ 20707) != var12.field1667)) {
                                        class244.method1647(class30.field399, arg3 ^ 20707, arg0.field3474, class23.field291, var5, (long) var11.field4033, (short) 18, class155.field2307 + " -> <col=ff9040>" + var11.field4035);
                                        ++class80.field1157;
                                    }
                                } else {
                                    ++class118.field1731;
                                    String[] var13 = var11.field4084;
                                    if (class68.field951) {
                                        var13 = class73.method500(81, var13);
                                    }
                                    if (var10.method491(arg3 + -20585)) {
                                        for (int var14 = 4; var14 >= 3; --var14) {
                                            if (var13 != null && var13[var14] != null) {
                                                byte var15;
                                                if (~var14 == -4) {
                                                    var15 = 4;
                                                } else {
                                                    var15 = 43;
                                                }
                                                ++class100.field1551;
                                                class244.method1647(var13[var14], arg3 ^ 20707, arg0.field3474, -1, var5, (long) var11.field4033, var15, "<col=ff9040>" + var11.field4035);
                                            }
                                        }
                                    }
                                    if (var10.method488(18395)) {
                                        ++class21.field258;
                                        class244.method1647(class218.field3547, 0, arg0.field3474, class68.field956, var5, (long) var11.field4033, (short) 11, "<col=ff9040>" + var11.field4035);
                                    }
                                    if (var10.method491(124) && var13 != null) {
                                        for (int var16 = 2; ~var16 <= -1; --var16) {
                                            if (var13[var16] != null) {
                                                byte var17 = 0;
                                                if (var16 == 0) {
                                                    var17 = 48;
                                                }
                                                ++class175.field2744;
                                                if (~var16 == -2) {
                                                    var17 = 5;
                                                }
                                                if (var16 == 2) {
                                                    var17 = 21;
                                                }
                                                class244.method1647(var13[var16], 0, arg0.field3474, -1, var5, (long) var11.field4033, var17, "<col=ff9040>" + var11.field4035);
                                            }
                                        }
                                    }
                                    String[] var18 = arg0.field3345;
                                    if (class68.field951) {
                                        var18 = class73.method500(81, var18);
                                    }
                                    if (var18 != null) {
                                        for (int var19 = 4; ~var19 <= -1; --var19) {
                                            if (var18[var19] != null) {
                                                byte var20 = 0;
                                                ++class38.field505;
                                                if (var19 == 0) {
                                                    var20 = 32;
                                                }
                                                if (~var19 == -2) {
                                                    var20 = 40;
                                                }
                                                if (~var19 == -3) {
                                                    var20 = 13;
                                                }
                                                if (~var19 == -4) {
                                                    var20 = 9;
                                                }
                                                if (~var19 == -5) {
                                                    var20 = 57;
                                                }
                                                class244.method1647(var18[var19], 0, arg0.field3474, -1, var5, (long) var11.field4033, var20, "<col=ff9040>" + var11.field4035);
                                            }
                                        }
                                    }
                                    class244.method1647(class172.field2702, 0, arg0.field3474, class107.field1645, var5, (long) var11.field4033, (short) 1007, "<col=ff9040>" + var11.field4035);
                                }
                            }
                        }
                        ++var5;
                    }
                }
            }
            if (arg0.field3360) {
                if (class45.field572) {
                    if (client.method1038(arg0).method493((byte) -128) && (class207.field3238 & 32) != 0) {
                        class244.method1647(class30.field399, arg3 + -20707, arg0.field3474, class23.field291, arg0.field3471, 0L, (short) 59, class155.field2307 + " -> " + arg0.field3460);
                        ++class121.field1759;
                        return;
                    }
                } else {
                    for (int var21 = 9; ~var21 <= -6; --var21) {
                        String var25 = class31.method256(var21, arg0, (byte) 37);
                        if (var25 != null) {
                            ++class75.field1070;
                            class244.method1647(var25, 0, arg0.field3474, class129.method881((byte) 123, arg0, var21), arg0.field3471, (long) (var21 - -1), (short) 1006, arg0.field3460);
                        }
                    }
                    String var22 = class94.method630(arg0, 115);
                    if (var22 != null) {
                        ++class93.field1452;
                        class244.method1647(var22, arg3 ^ 20707, arg0.field3474, -1, arg0.field3471, 0L, (short) 15, arg0.field3460);
                    }
                    for (int var23 = 4; var23 >= 0; --var23) {
                        String var24 = class31.method256(var23, arg0, (byte) 37);
                        if (var24 != null) {
                            class244.method1647(var24, arg3 ^ 20707, arg0.field3474, class129.method881((byte) 104, arg0, var23), arg0.field3471, (long) (var23 + 1), (short) 25, arg0.field3460);
                            ++class75.field1070;
                        }
                    }
                    if (!client.method1038(arg0).method490(1)) {
                        return;
                    }
                    class244.method1647(class278.field4422, 0, arg0.field3474, -1, arg0.field3471, 0L, (short) 30, "");
                    ++class152.field2253;
                }
            }
        }
    }
}
