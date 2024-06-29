import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class473 extends class425 implements class115 {

    @OriginalMember(owner = "client!lq", name = "P", descriptor = "Lwc;")
    public class58 field6652;

    @OriginalMember(owner = "client!lq", name = "G", descriptor = "Z")
    private boolean field6644;

    @OriginalMember(owner = "client!lq", name = "A", descriptor = "Lej;")
    public static class104 field6639;

    @OriginalMember(owner = "client!lq", name = "X", descriptor = "Loca;")
    public static class221 field6660;

    @OriginalMember(owner = "client!lq", name = "Y", descriptor = "Z")
    public static boolean field6661;

    @OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!lq", name = "C", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!lq", name = "D", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!lq", name = "E", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!lq", name = "F", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!lq", name = "H", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!lq", name = "I", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!lq", name = "J", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!lq", name = "L", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!lq", name = "M", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!lq", name = "N", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!lq", name = "Q", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!lq", name = "R", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!lq", name = "T", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!lq", name = "U", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!lq", name = "V", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!lq", name = "W", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!lq", name = "S", descriptor = "Lao;")
    public static class240 field6655;

    @OriginalMember(owner = "client!lq", name = "O", descriptor = "Lnk;")
    private class611 field6651;

    @OriginalMember(owner = "client!lq", name = "Z", descriptor = "[[I")
    public static int[][] field6662;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(ZLqa;)Lvw;")
    public final class254 method483(boolean arg0, class207 arg1) {
        ++field6641;
        class157 var3 = this.field6652.method526(super.field6037, 2048, true, arg1, super.field6029, 0, false);
        if (var3 == null) {
            return null;
        } else {
            class163 var4 = arg1.method1344();
            var4.method1054(super.field6037, super.field6042, super.field6029);
            class254 var5 = null;
            if (this.field6644) {
                var5 = class110.method772(1, 1);
            }
            if (this.field6652.field1034 == null) {
                var3.method154(var4, var5 != null ? var5.field3525[0] : null, 0);
            } else {
                class274 var6 = this.field6652.field1034.method2768();
                arg1.method1366(var3, var6, var4, var5 == null ? null : var5.field3525[0], 0);
            }
            if (this.field6651 == null) {
                this.field6651 = class563.method3213(super.field6042, var3, super.field6037, super.field6029, true);
            } else {
                class510.method2947(var3, super.field6029, 0, this.field6651, super.field6037, super.field6042);
            }
            this.field6652.method517(super.field6036, super.field6031, var3, arg1, super.field6028, arg0, super.field6030, (byte) -76);
            return var5;
        }
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)Z")
    public final boolean method264(int arg0) {
        ++field6638;
        return arg0 != 1;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method488(class207 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 1) {
            field6661 = true;
        }
        ++field6658;
        class157 var5 = this.field6652.method526(super.field6037, 131072, false, arg0, super.field6029, 0, false);
        if (var5 == null) {
            return false;
        } else {
            class163 var6 = arg0.method1344();
            var6.method1054(super.field6037, super.field6042, super.field6029);
            return var5.method143(arg1, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)V")
    public final void method262(int arg0) {
        ++field6647;
        if (arg0 != 1) {
            field6661 = true;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2746(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == 1) {
            ++field6653;
            int var7 = class559.field7738;
            class549.field7604 = 0;
            int[] var8 = class358.field4825;
            for (int var9 = 0; ~(class480.field6764 + var7) < ~var9; ++var9) {
                class593 var32 = null;
                class33 var33;
                if (~var7 >= ~var9) {
                    var33 = ((class576) class278.field3837.method1242(arg1 + -1, (long) class586.field8386[-var7 + var9])).field7929;
                    var32 = ((class109) var33).field1669;
                    if (var32.field8532 != null) {
                        var32 = var32.method3516(class189.field2681, arg1 ^ 108);
                        if (var32 == null) {
                            continue;
                        }
                    }
                } else {
                    var33 = class349.field4696[var8[var9]];
                }
                if (~var33.field588 <= -1 && (~class143.field2215 == ~var33.field557 || ~class645.field9372.field6035 == ~var33.field6035)) {
                    class644.method3711(arg3, var33, arg6 >> 1, arg2 >> 1, var33.method344(-1), -9275, arg4);
                    if (~class328.field4394[0] <= -1) {
                        if (var33.field608 != null && (~var9 <= ~var7 || class632.field9247 == 0 || ~class632.field9247 == -4 || class632.field9247 == 1 && class621.method3617(((class188) var33).field2630, -104)) && class549.field7604 < class265.field3692) {
                            class265.field3695[class549.field7604] = class40.field798.method2810(var33.field608, (byte) 124) / 2;
                            class265.field3696[class549.field7604] = class328.field4394[0];
                            class265.field3697[class549.field7604] = class328.field4394[1];
                            class265.field3693[class549.field7604] = var33.field581;
                            class265.field3700[class549.field7604] = var33.field561;
                            class265.field3702[class549.field7604] = var33.field574;
                            class265.field3694[class549.field7604] = var33.field608;
                            ++class549.field7604;
                        }
                        int var34 = class328.field4394[1] + arg5;
                        int var45;
                        if (!var33.field558 && ~class405.field5763 > ~var33.field541) {
                            boolean var35 = true;
                            byte var36 = 1;
                            int var37;
                            if (~var9 <= ~var7) {
                                var37 = var32.field8528;
                                if (~var37 == 0) {
                                    var37 = var33.method349(true).field1608;
                                }
                            } else {
                                class188 var38 = class349.field4696[var8[var9]];
                                var37 = var33.method349(true).field1608;
                                if (var38.field2661) {
                                    var36 = 2;
                                }
                            }
                            class52[] var39 = class41.field805;
                            if (var37 != -1) {
                                class52[] var40 = (class52[]) class41.field809.method3252((long) var37, (byte) 82);
                                if (var40 == null) {
                                    class38[] var41 = class38.method397(class645.field9371, var37, 0);
                                    if (var41 != null) {
                                        var40 = new class52[var41.length];
                                        for (int var42 = 0; var41.length > var42; ++var42) {
                                            var40[var42] = class69.field1165.method1332(var41[var42], true);
                                        }
                                        class41.field809.method3243(var40, (long) var37, -120);
                                    }
                                }
                                if (var40 != null && ~var40.length <= -3) {
                                    var39 = var40;
                                }
                            }
                            if (var36 >= var39.length) {
                                var36 = 1;
                            }
                            class52 var43 = var39[0];
                            class52 var44 = var39[var36];
                            var45 = var34 - Math.max(class40.field798.field6799, var43.method422());
                            int var46 = class328.field4394[0] + arg0 + -(var43.method429() >> 1);
                            int var47 = var43.method429() * var33.field568 / 255;
                            if (~var33.field568 < -1 && ~var47 > -3) {
                                var47 = 2;
                            }
                            var43.method497(var46, var45);
                            class69.field1165.method1303(var46, var45, var46 + var47, var43.method422() + var45);
                            var44.method497(var46, var45);
                            class69.field1165.method1308(arg0, arg5, arg0 - -arg6, arg2 + arg5);
                        } else {
                            var45 = var34 - Math.max(class40.field798.field6799, class41.field805[0].method422());
                        }
                        var45 -= 2;
                        if (!var33.field558) {
                            if (class405.field5763 < var33.field534) {
                                class52 var48 = class233.field3285[var33.field593 ? 2 : 0];
                                class52 var49 = class233.field3285[var33.field593 ? 3 : 1];
                                boolean var50 = true;
                                int var51;
                                if (!(var33 instanceof class109)) {
                                    var51 = var33.method349(true).field1620;
                                } else {
                                    var51 = var32.field8570;
                                    if (var51 == -1) {
                                        var51 = var33.method349(true).field1620;
                                    }
                                }
                                if (var51 != -1) {
                                    class52[] var52 = (class52[]) class365.field4963.method3252((long) var51, (byte) 59);
                                    if (var52 == null) {
                                        class38[] var53 = class38.method397(class645.field9371, var51, 0);
                                        if (var53 != null) {
                                            var52 = new class52[var53.length];
                                            for (int var54 = 0; ~var54 > ~var53.length; ++var54) {
                                                var52[var54] = class69.field1165.method1332(var53[var54], true);
                                            }
                                            class365.field4963.method3243(var52, (long) var51, -77);
                                        }
                                    }
                                    if (var52 != null && ~var52.length == -5) {
                                        var49 = var52[var33.field593 ? 3 : 1];
                                        var48 = var52[!var33.field593 ? 0 : 2];
                                    }
                                }
                                int var55 = -class405.field5763 + var33.field534;
                                int var56;
                                if (var33.field530 >= var55) {
                                    var56 = var48.method429();
                                } else {
                                    int var57 = var55 - var33.field530;
                                    int var58 = var33.field525 == 0 ? 0 : (-var57 + var33.field526) / var33.field525 * var33.field525;
                                    var56 = var48.method429() * var58 / var33.field526;
                                }
                                int var59 = var48.method422();
                                var45 -= var59;
                                int var60 = class328.field4394[0] + arg0 + -(var48.method429() >> 1);
                                var48.method497(var60, var45);
                                class69.field1165.method1303(var60, var45, var60 - -var56, var45 + var59);
                                var49.method497(var60, var45);
                                class69.field1165.method1308(arg0, arg5, arg0 + arg6, arg2 + arg5);
                                var45 -= 2;
                            }
                            if (~var9 <= ~var7) {
                                if (~var32.field8562 <= -1 && var32.field8562 < class69.field1171.length) {
                                    class52 var61 = class69.field1171[var32.field8562];
                                    var45 -= 25;
                                    var61.method497(class328.field4394[0] + arg0 + -(var61.method429() >> 1), var45);
                                    var45 -= 2;
                                }
                            } else {
                                class188 var62 = (class188) var33;
                                if (var62.field2634 != -1) {
                                    var45 -= 25;
                                    class194.field2752[var62.field2634].method497(class328.field4394[0] + arg0 - 12, var45);
                                    var45 -= 2;
                                }
                                if (var62.field2637 != -1) {
                                    var45 -= 25;
                                    class69.field1171[var62.field2637].method497(arg0 - -class328.field4394[0] + -12, var45);
                                    var45 -= 2;
                                }
                            }
                        }
                        int var10000;
                        if (!(var33 instanceof class188)) {
                            int var63 = 0;
                            class201[] var64 = class132.field2113;
                            for (int var65 = 0; var64.length > var65; ++var65) {
                                class201 var67 = var64[var65];
                                if (var67 != null && ~var67.field2819 == -2 && ~class586.field8386[-var7 + var9] == ~var67.field2817) {
                                    class52 var68 = class60.field1064[var67.field2824];
                                    if (~var63 > ~var68.method422()) {
                                        var63 = var68.method422();
                                    }
                                    if (~(class405.field5763 % 20) > -11) {
                                        var68.method497(arg0 + -12 - -class328.field4394[0], -var68.method422() + var45);
                                    }
                                }
                            }
                            if (var63 > 0) {
                                var10000 = var45 - (var63 + 2);
                            }
                        } else if (~var9 <= -1) {
                            int var69 = 0;
                            class201[] var70 = class132.field2113;
                            for (int var71 = 0; ~var71 > ~var70.length; ++var71) {
                                class201 var73 = var70[var71];
                                if (var73 != null && var73.field2819 == 10 && ~var8[var9] == ~var73.field2817) {
                                    class52 var74 = class60.field1064[var73.field2824];
                                    if (~var74.method422() < ~var69) {
                                        var69 = var74.method422();
                                    }
                                    var74.method497(class328.field4394[0] + arg0 - 12, -var74.method422() + var45);
                                }
                            }
                            if (var69 > 0) {
                                var10000 = var45 - (var69 + 2);
                            }
                        }
                        for (int var75 = 0; var75 < 4; ++var75) {
                            if (var33.field564[var75] > class405.field5763) {
                                int var76 = var33.method344(arg1 + -2) / 2;
                                class644.method3711(arg3, var33, arg6 >> 1, arg2 >> 1, var76, arg1 + -9276, arg4);
                                if (class328.field4394[0] > -1) {
                                    int var77 = class628.field9192[var33.field598[var75]].method429();
                                    if (var75 == 1) {
                                        class328.field4394[1] -= 20;
                                    }
                                    if (var75 == 2) {
                                        class328.field4394[0] -= var77 - 9;
                                        class328.field4394[1] -= 10;
                                    }
                                    if (var75 == 3) {
                                        class328.field4394[1] -= 10;
                                        class328.field4394[0] += var77 + -9;
                                    }
                                    class628.field9192[var33.field598[var75]].method497(arg0 - (var77 >> 1) + class328.field4394[0], class328.field4394[1] + arg5 + -12);
                                    class503.field6998.method666(class328.field4394[1] + arg5 - -3, -1, class328.field4394[0] + arg0 + -1, arg1 ^ 73, Integer.toString(var33.field545[var75]), 0);
                                }
                            }
                        }
                    }
                }
            }
            for (int var10 = 0; class99.field1511 > var10; ++var10) {
                int var28 = class580.field7975[var10];
                class33 var29;
                if (~var28 > -2049) {
                    var29 = class349.field4696[var28];
                } else {
                    var29 = ((class576) class278.field3837.method1242(0, (long) (var28 + -2048))).field7929;
                }
                int var30 = class318.field4314[var10];
                class33 var31;
                if (~var30 <= -2049) {
                    var31 = ((class576) class278.field3837.method1242(0, (long) (var30 - 2048))).field7929;
                } else {
                    var31 = class349.field4696[var30];
                }
                class184.method1151(arg5, arg3, arg2, arg4, var29, arg0, var31, arg6, 2, --var29.field582);
            }
            int var11 = class40.field798.field6799 - -2 + class40.field798.field6813;
            for (int var12 = 0; var12 < class549.field7604; ++var12) {
                int var13 = class265.field3696[var12];
                int var14 = class265.field3697[var12];
                int var15 = class265.field3695[var12];
                boolean var16 = true;
                while (var16) {
                    var16 = false;
                    for (int var27 = 0; var27 < var12; ++var27) {
                        if (~(class265.field3697[var27] + -var11) > ~(var14 + 2) && class265.field3697[var27] + 2 > -var11 + var14 && -var15 + var13 < class265.field3696[var27] + class265.field3695[var27] && class265.field3696[var27] + -class265.field3695[var27] < var13 + var15 && ~(class265.field3697[var27] + -var11) > ~var14) {
                            var14 = class265.field3697[var27] + -var11;
                            var16 = true;
                        }
                    }
                }
                class265.field3697[var12] = var14;
                String var17 = class265.field3694[var12];
                if (class510.field7142 == 0) {
                    int var18 = 16776960;
                    if (~class265.field3693[var12] > -7) {
                        var18 = class332.field4437[class265.field3693[var12]];
                    }
                    if (class265.field3693[var12] == 6) {
                        var18 = class143.field2215 % 20 >= 10 ? 16776960 : 16711680;
                    }
                    if (~class265.field3693[var12] == -8) {
                        var18 = ~(class143.field2215 % 20) > -11 ? 255 : 65535;
                    }
                    if (class265.field3693[var12] == 8) {
                        var18 = class143.field2215 % 20 >= 10 ? 8454016 : 45056;
                    }
                    if (~class265.field3693[var12] == -10) {
                        int var19 = -class265.field3702[var12] + 150;
                        if (var19 >= 50) {
                            if (~var19 > -101) {
                                var18 = -(var19 * 327680) - -33160960;
                            } else if (~var19 > -151) {
                                var18 = 65280 - -((var19 + -100) * 5);
                            }
                        } else {
                            var18 = 16711680 - -(var19 * 1280);
                        }
                    }
                    if (class265.field3693[var12] == 10) {
                        int var20 = 150 - class265.field3702[var12];
                        if (~var20 <= -51) {
                            if (~var20 > -101) {
                                var18 = 16711935 - (var20 * 327680 - 16384000);
                            } else if (var20 < 150) {
                                var18 = -32768000 - (-(var20 * 327680) - 255) - (var20 + -100) * 5;
                            }
                        } else {
                            var18 = 16711680 - -(var20 * 5);
                        }
                    }
                    if (class265.field3693[var12] == 11) {
                        int var21 = -class265.field3702[var12] + 150;
                        if (var21 < 50) {
                            var18 = 16777215 - var21 * 327685;
                        } else if (~var21 > -101) {
                            var18 = (var21 - 50) * 327685 + 65280;
                        } else if (var21 < 150) {
                            var18 = -((var21 + -100) * 327680) + 16777215;
                        }
                    }
                    int var22 = var18 | -16777216;
                    if (~class265.field3700[var12] == -1) {
                        class515.field7246.method666(arg5 + var14, var22, arg0 + var13, 44, var17, -16777216);
                    }
                    if (~class265.field3700[var12] == -2) {
                        class515.field7246.method662(arg5 + var14, var22, -1, class143.field2215, var17, arg0 + var13, -16777216);
                    }
                    if (~class265.field3700[var12] == -3) {
                        class515.field7246.method660(arg5 + var14, 60, class143.field2215, var22, -16777216, var17, arg0 + var13);
                    }
                    if (class265.field3700[var12] == 3) {
                        class515.field7246.method668(var22, class143.field2215, var17, arg0 + var13, (byte) -78, -16777216, -class265.field3702[var12] + 150, arg5 + var14);
                    }
                    if (class265.field3700[var12] == 4) {
                        int var23 = (150 - class265.field3702[var12]) * (100 + class40.field798.method2810(var17, (byte) 124)) / 150;
                        class69.field1165.method1303(arg0 + -50 + var13, arg5, arg0 + var13 + 50, arg2 + arg5);
                        class515.field7246.method663(-121, -16777216, arg0 + var13 + -var23 + 50, var17, arg5 + var14, var22);
                        class69.field1165.method1308(arg0, arg5, arg0 + arg6, arg2 + arg5);
                    }
                    if (class265.field3700[var12] == 5) {
                        int var24 = -class265.field3702[var12] + 150;
                        int var25 = 0;
                        if (~var24 <= -26) {
                            if (~var24 < -126) {
                                var25 = var24 + -125;
                            }
                        } else {
                            var25 = var24 - 25;
                        }
                        int var26 = class40.field798.field6813 + class40.field798.field6799;
                        class69.field1165.method1303(arg0, arg5 - 1 + var14 + -var26, arg0 + arg6, arg5 + var14 + 5);
                        class515.field7246.method666(arg5 + var14 + var25, var22, arg0 - -var13, 110, var17, -16777216);
                        class69.field1165.method1308(arg0, arg5, arg0 + arg6, arg2 + arg5);
                    }
                } else {
                    class515.field7246.method666(arg5 - -var14, -256, arg0 + var13, 85, var17, -16777216);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "(I)I")
    public final int method492(int arg0) {
        if (arg0 != 0) {
            return -56;
        } else {
            ++field6654;
            return this.field6652.method523((byte) 57);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2747(int arg0, String arg1) {
        ++field6649;
        if (arg0 != 0) {
            method2747(-26, (String) null);
        }
        if (!class288.field3967.startsWith("win")) {
            if (!class288.field3967.startsWith("linux")) {
                if (class288.field3967.startsWith("mac")) {
                    return "lib" + arg1 + ".jnilib";
                } else {
                    throw new RuntimeException();
                }
            } else {
                return "lib" + arg1 + ".so";
            }
        } else {
            return arg1 + ".dll";
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lqa;B)V")
    public final void method487(class207 arg0, byte arg1) {
        ++field6657;
        class157 var3 = this.field6652.method526(super.field6037, 262144, true, arg0, super.field6029, 0, true);
        if (var3 != null) {
            this.field6652.method517(super.field6036, super.field6031, var3, arg0, super.field6028, false, super.field6030, (byte) -60);
        }
        if (arg1 != 21) {
            method2746(-45, -27, 34, -30, 21, -5, -47);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLqa;I)Lr;")
    public final class157 method744(byte arg0, class207 arg1, int arg2) {
        ++field6659;
        int var4 = -125 / ((-54 - arg0) / 60);
        return this.field6652.method526(0, arg2, false, arg1, 0, 0, false);
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(Z)I")
    public final int method752(boolean arg0) {
        if (!arg0) {
            this.field6644 = true;
        }
        ++field6656;
        return this.field6652.field1016;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)I")
    public final int method748(boolean arg0) {
        ++field6650;
        if (arg0) {
            this.method751(47, (class207) null);
        }
        return this.field6652.field1031;
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)Z")
    public final boolean method747(int arg0) {
        if (arg0 != -23611) {
            return true;
        } else {
            ++field6645;
            return this.field6652.method527((byte) -85);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILqa;)V")
    public final void method751(int arg0, class207 arg1) {
        ++field6648;
        this.field6652.method518(arg1, 8821);
        if (arg0 >= 0) {
            this.method751(-97, (class207) null);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLqa;)V")
    public final void method746(byte arg0, class207 arg1) {
        ++field6640;
        if (arg0 < -50) {
            this.field6652.method528(true, arg1);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
    public final void method750(int arg0) {
        if (arg0 > 88) {
            ++field6643;
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)I")
    public final int method749(int arg0) {
        ++field6642;
        if (arg0 != 24194) {
            field6639 = null;
        }
        return this.field6652.field1038;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IZIILjt;ILqa;)V")
    public final void method258(int arg0, boolean arg1, int arg2, int arg3, class87 arg4, int arg5, class207 arg6) {
        if (arg2 < 79) {
            this.method490(true, (class207) null);
        }
        ++field6646;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "(I)V")
    public static void method2748(int arg0) {
        field6639 = null;
        if (arg0 == -29417) {
            field6660 = null;
            field6662 = null;
            field6655 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lqa;Lss;IIIIIZIIIIIII)V")
    public class473(class207 arg0, class364 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field4900 == -2, class400.method2393(arg13, 5, arg12));
        this.field6652 = new class58(arg0, arg1, arg12, arg13, super.field6035, arg3, arg4, arg6, arg7, arg14);
        this.field6644 = arg1.field4881 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZLqa;)Lnk;")
    public final class611 method490(boolean arg0, class207 arg1) {
        ++field6637;
        if (arg0) {
            field6662 = null;
        }
        return this.field6651;
    }

    static {
        new class104("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field6639 = new class104("flash3:", "blinken3:", "clignotant3:", "brilho3:");
        field6660 = new class221(9, 0, 4, 1);
        field6661 = false;
    }
}
