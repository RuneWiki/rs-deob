import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class422 extends class140 {

    @OriginalMember(owner = "client!mha", name = "s", descriptor = "I")
    public int field5875 = -1;

    @OriginalMember(owner = "client!mha", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field5869 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!mha", name = "n", descriptor = "Z")
    public static boolean field5870 = false;

    @OriginalMember(owner = "client!mha", name = "r", descriptor = "I")
    public static int field5874 = 1400;

    @OriginalMember(owner = "client!mha", name = "k", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!mha", name = "p", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!mha", name = "u", descriptor = "I")
    public int field5877;

    @OriginalMember(owner = "client!mha", name = "v", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!mha", name = "q", descriptor = "Ltb;")
    public static class503 field5873;

    @OriginalMember(owner = "client!mha", name = "t", descriptor = "Liia;")
    public static class538 field5876;

    @OriginalMember(owner = "client!mha", name = "l", descriptor = "Ljava/lang/String;")
    public String field5868;

    @OriginalMember(owner = "client!mha", name = "o", descriptor = "Ljava/lang/String;")
    public String field5871;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(Lha;III)V", line = 4)
    public static final void method2487(class475 arg0, int arg1, int arg2, int arg3) {
        ++field5867;
        if (~arg3 <= -1 && ~arg2 <= -1 && ~class514.field7085 != -1 && ~class48.field675 != -1) {
            if (arg1 <= 62) {
                field5876 = null;
            }
            int var4;
            int var5;
            int var6;
            int var7;
            class765 var8;
            int var9;
            int var10;
            if (!class593.field8489) {
                arg0.method449(class586.field8431, class479.field6582, class514.field7085, class48.field675);
                var4 = class479.field6582;
                var5 = class586.field8431;
                var6 = class48.field675;
                var7 = class514.field7085;
                arg0.method488(class402.field5550, class424.field5896, class514.field7085, class48.field675);
                var8 = arg0.method463();
                var8.method1567(class509.field7002, class728.field10149, class686.field9706, class727.field10123, class128.field2152, class344.field4884);
                var9 = arg3;
                arg0.method498(var8);
                var10 = arg2;
            } else {
                class302.method1879(false, 5117);
                var8 = arg0.method489();
                int[] var11 = arg0.method459();
                var4 = var11[1];
                var6 = var11[3];
                var5 = var11[0];
                var7 = var11[2];
                var9 = class431.method2538(0, false) + arg3;
                var10 = class119.method1051(0, false) + arg2;
            }
            class259.method1688((byte) 7, true);
            if (var7 == 0) {
                var7 = 1;
            }
            if (~var6 == -1) {
                var6 = 1;
            }
            if (class495.field6799 != null && (!class295.field4298 || (64 & class345.field4896) != 0)) {
                int var12 = -1;
                int var13 = -1;
                int var14 = arg0.method462();
                int var15 = arg0.method445();
                int var16;
                int var17;
                int var18;
                int var19;
                if (class765.field10581) {
                    var17 = var16 = (var10 - var4) * class349.field4956 / var6;
                    var19 = var18 = (var9 - var5) * class349.field4956 / var7;
                } else {
                    var16 = (var10 - var4) * var15 / var6;
                    var19 = (-var5 + var9) * var14 / var7;
                    var18 = (-var5 + var9) * var15 / var7;
                    var17 = (var10 - var4) * var14 / var6;
                }
                int[] var20 = new int[] { var19, var17, var14 };
                int[] var21 = new int[] { var18, var16, var15 };
                var8.method1555(var20);
                var8.method1555(var21);
                float var22 = class193.method1377((float) var21[1], (float) var20[2], false, (float) var21[2], 4, (float) var20[1], (float) var20[0], (float) var21[0]);
                if (var22 > 0.0F) {
                    int var23 = var21[0] + -var20[0];
                    int var24 = var21[2] - var20[2];
                    int var25 = (int) ((float) var23 * var22 + (float) var20[0]);
                    int var26 = (int) ((float) var24 * var22 + (float) var20[2]);
                    var12 = (class719.field10041.method209(true) - 1 << 8) + var25 >> 9;
                    var13 = var26 + (-1 + class719.field10041.method209(true) << 8) >> 9;
                    byte var27 = class719.field10041.field10361;
                    if (~var27 > -4 && ~(class336.field4782[1][var25 >> 9][var26 >> 9] & 2) != -1) {
                        int var87 = var27 + 1;
                    }
                }
                if (var12 != -1 && var13 != -1) {
                    if (class295.field4298 && (class345.field4896 & 64) != 0) {
                        class519 var28 = class153.method1203(0, class65.field979, class568.field7906);
                        if (var28 != null) {
                            class526.method3076(-1, true, 0L, 500, " ->", var13, var12, false, true, class745.field10364, (long) (var12 << 0 | var13), 48, class470.field6405);
                        } else {
                            class558.method3253(-89);
                        }
                    } else {
                        if (class711.field9932) {
                            class526.method3076(-1, true, 0L, 500, "", var13, var12, false, true, -1, (long) (var12 << 0 | var13), 45, class563.field7825.method3281(class423.field5892, -1));
                        }
                        ++class360.field5089;
                        class526.method3076(-1, true, 0L, 500, "", var13, var12, false, true, class367.field5189, (long) (var12 << 0 | var13), 2, class143.field2332);
                    }
                }
            }
            if (class593.field8489) {
                class570.method3301(72);
            }
            for (int var29 = 0; var29 < (class593.field8489 ? 2 : 1); ++var29) {
                boolean var30 = ~var29 == -1;
                class724 var31 = !var30 ? class576.field8303 : class316.field4495;
                int var32 = arg3;
                int var33 = arg2;
                if (class593.field8489) {
                    class302.method1879(var30, 5117);
                    var32 = arg3 + class431.method2538(0, var30);
                    var33 = arg2 + class119.method1051(0, var30);
                }
                class271 var34 = var31.field10091;
                for (class162 var35 = (class162) var34.method1730((byte) 116); var35 != null; var35 = (class162) var34.method1729((byte) 100)) {
                    if ((class458.field6260 || ~class719.field10041.field10361 == ~var35.field2501.field10361) && var35.method1232(var33, var32, 117, arg0)) {
                        boolean var36 = false;
                        boolean var37 = false;
                        int var38;
                        int var39;
                        if (var35.field2501 instanceof class208) {
                            var38 = ((class208) var35.field2501).field3027;
                            var39 = ((class208) var35.field2501).field3035;
                        } else {
                            var39 = var35.field2501.field10350 >> 9;
                            var38 = var35.field2501.field10347 >> 9;
                        }
                        if (var35.field2501 instanceof class21) {
                            class21 var40 = (class21) var35.field2501;
                            int var41 = var40.method209(true);
                            if (~(1 & var41) == -1 && (511 & var40.field10347) == 0 && (511 & var40.field10350) == 0 || (var41 & 1) == 1 && (511 & var40.field10347) == 256 && ~(var40.field10350 & 511) == -257) {
                                int var42 = var40.field10347 + -(-1 + var40.method209(true) << 8);
                                int var43 = var40.field10350 + -(var40.method209(true) - 1 << 8);
                                for (int var44 = 0; var44 < class657.field9270; ++var44) {
                                    class647 var51 = (class647) class486.field6697.method4253((long) class350.field4963[var44], -1);
                                    if (var51 != null) {
                                        class506 var52 = var51.field9191;
                                        if (~class594.field8494 != ~var52.field4071 && var52.field4120) {
                                            int var53 = -(var52.field6964.field2737 + -1 << 8) + var52.field10347;
                                            int var54 = var52.field10350 - (var52.field6964.field2737 + -1 << 8);
                                            if (var42 <= var53 && var52.field6964.field2737 <= -(var53 - var42 >> 9) + var40.method209(true) && ~var54 <= ~var43 && var52.field6964.field2737 <= var40.method209(true) - (var54 - var43 >> 9)) {
                                                class699.method3919(var52, 3707, ~class719.field10041.field10361 != ~var35.field2501.field10361);
                                                var52.field4071 = class594.field8494;
                                            }
                                        }
                                    }
                                }
                                int var45 = class469.field6382;
                                int[] var46 = class464.field6311;
                                for (int var47 = 0; var47 < var45; ++var47) {
                                    class21 var48 = class588.field8451[var46[var47]];
                                    if (var48 != null && class594.field8494 != var48.field4071 && var40 != var48 && var48.field4120) {
                                        int var49 = var48.field10347 - (-1 + var48.method209(true) << 8);
                                        int var50 = var48.field10350 + -(var48.method209(true) + -1 << 8);
                                        if (~var49 <= ~var42 && var48.method209(true) <= var40.method209(true) - (var49 - var42 >> 9) && ~var43 >= ~var50 && var48.method209(true) <= var40.method209(true) + -(-var43 + var50 >> 9)) {
                                            class98.method802((byte) 63, var48, class719.field10041.field10361 != var35.field2501.field10361);
                                            var48.field4071 = class594.field8494;
                                        }
                                    }
                                }
                            }
                            if (class594.field8494 == var40.field4071) {
                                continue;
                            }
                            class98.method802((byte) 63, var40, class719.field10041.field10361 != var35.field2501.field10361);
                            var40.field4071 = class594.field8494;
                        }
                        if (var35.field2501 instanceof class506) {
                            class506 var55 = (class506) var35.field2501;
                            if (var55.field6964 != null) {
                                if ((1 & var55.field6964.field2737) == 0 && ~(511 & var55.field10347) == -1 && ~(511 & var55.field10350) == -1 || ~(var55.field6964.field2737 & 1) == -2 && (var55.field10347 & 511) == 256 && ~(var55.field10350 & 511) == -257) {
                                    int var56 = -(var55.field6964.field2737 + -1 << 8) + var55.field10347;
                                    int var57 = -(var55.field6964.field2737 + -1 << 8) + var55.field10350;
                                    for (int var58 = 0; ~var58 > ~class657.field9270; ++var58) {
                                        class647 var65 = (class647) class486.field6697.method4253((long) class350.field4963[var58], -1);
                                        if (var65 != null) {
                                            class506 var66 = var65.field9191;
                                            if (~class594.field8494 != ~var66.field4071 && var55 != var66 && var66.field4120) {
                                                int var67 = -(var66.field6964.field2737 - 1 << 8) + var66.field10347;
                                                int var68 = -(var66.field6964.field2737 + -1 << 8) + var66.field10350;
                                                if (~var56 >= ~var67 && var66.field6964.field2737 <= var55.field6964.field2737 - (-var56 + var67 >> 9) && var68 >= var57 && ~var66.field6964.field2737 >= ~(var55.field6964.field2737 - (-var57 + var68 >> 9))) {
                                                    class699.method3919(var66, 3707, class719.field10041.field10361 != var35.field2501.field10361);
                                                    var66.field4071 = class594.field8494;
                                                }
                                            }
                                        }
                                    }
                                    int var59 = class469.field6382;
                                    int[] var60 = class464.field6311;
                                    for (int var61 = 0; ~var61 > ~var59; ++var61) {
                                        class21 var62 = class588.field8451[var60[var61]];
                                        if (var62 != null && class594.field8494 != var62.field4071 && var62.field4120) {
                                            int var63 = var62.field10347 - (-1 + var62.method209(true) << 8);
                                            int var64 = var62.field10350 - (var62.method209(true) - 1 << 8);
                                            if (var63 >= var56 && ~var62.method209(true) >= ~(-(-var56 + var63 >> 9) + var55.field6964.field2737) && ~var57 >= ~var64 && var62.method209(true) <= -(-var57 + var64 >> 9) + var55.field6964.field2737) {
                                                class98.method802((byte) 63, var62, ~class719.field10041.field10361 != ~var35.field2501.field10361);
                                                var62.field4071 = class594.field8494;
                                            }
                                        }
                                    }
                                }
                                if (class594.field8494 == var55.field4071) {
                                    continue;
                                }
                                class699.method3919(var55, 3707, ~class719.field10041.field10361 != ~var35.field2501.field10361);
                                var55.field4071 = class594.field8494;
                            }
                        }
                        if (var35.field2501 instanceof class753) {
                            int var69 = class222.field3266 + var38;
                            int var70 = var39 - -class697.field9798;
                            class482 var71 = (class482) class400.field5509.method4253((long) (var70 << 14 | var35.field2501.field10361 << 28 | var69), -1);
                            if (var71 != null) {
                                int var72 = 0;
                                for (class636 var73 = (class636) var71.field6618.method3724((byte) -60); var73 != null; var73 = (class636) var71.field6618.method3733(27852)) {
                                    class42 var74 = field5873.method2937((byte) -68, var73.field8989);
                                    if (class295.field4298 && ~class719.field10041.field10361 == ~var35.field2501.field10361) {
                                        class93 var75 = class626.field8893 != -1 ? class498.field6854.method3434(class626.field8893, 10549) : null;
                                        if ((1 & class345.field4896) != 0 && (var75 == null || ~var74.method308(class626.field8893, (byte) 72, var75.field1331) != ~var75.field1331)) {
                                            class526.method3076(-1, false, (long) var73.field8989, 500, class460.field6275 + " -> <col=ff9040>" + var74.field554, var39, var38, false, true, class745.field10364, (long) var72, 13, class470.field6405);
                                            ++class400.field5518;
                                        }
                                    }
                                    if (~class719.field10041.field10361 == ~var35.field2501.field10361) {
                                        String[] var76 = var74.field568;
                                        for (int var77 = 4; var77 >= 0; --var77) {
                                            if (var76 != null && var76[var77] != null) {
                                                byte var78 = 0;
                                                if (~var77 == -1) {
                                                    var78 = 23;
                                                }
                                                int var79 = class28.field297;
                                                if (~var77 == -2) {
                                                    var78 = 25;
                                                }
                                                if (~var77 == -3) {
                                                    var78 = 6;
                                                }
                                                if (var77 == 3) {
                                                    var78 = 47;
                                                }
                                                if (var74.field561 == var77) {
                                                    var79 = var74.field535;
                                                }
                                                if (var77 == 4) {
                                                    var78 = 60;
                                                }
                                                if (var74.field569 == var77) {
                                                    var79 = var74.field511;
                                                }
                                                class526.method3076(-1, false, (long) var73.field8989, 500, "<col=ff9040>" + var74.field554, var39, var38, false, true, var79, (long) var72, var78, var76[var77]);
                                                ++class721.field10063;
                                            }
                                        }
                                    }
                                    class526.method3076(-1, false, (long) var73.field8989, 500, "<col=ff9040>" + var74.field554, var39, var38, class719.field10041.field10361 != var35.field2501.field10361, true, class645.field9176, (long) var72, 1007, class563.field7820.method3281(class423.field5892, -1));
                                    ++class684.field9681;
                                    ++var72;
                                }
                            }
                        }
                        if (var35.field2501 instanceof class226) {
                            class226 var80 = (class226) var35.field2501;
                            class416 var81 = class312.field4418.method369((byte) 125, var80.method1165((byte) 102));
                            if (var81.field5736 != null) {
                                var81 = var81.method2458(class578.field8328, -1);
                            }
                            if (var81 != null) {
                                if (class295.field4298 && ~class719.field10041.field10361 == ~var35.field2501.field10361) {
                                    class93 var82 = class626.field8893 != -1 ? class498.field6854.method3434(class626.field8893, 10549) : null;
                                    if (~(4 & class345.field4896) != -1 && (var82 == null || ~var81.method2450(var82.field1331, -40, class626.field8893) != ~var82.field1331)) {
                                        class526.method3076(-1, false, class75.method689(var39, var38, var80, 15606), 500, class460.field6275 + " -> <col=00ffff>" + var81.field5731, var39, var38, false, true, class745.field10364, (long) var80.hashCode(), 44, class470.field6405);
                                        ++class124.field2127;
                                    }
                                }
                                if (class719.field10041.field10361 == var35.field2501.field10361) {
                                    String[] var83 = var81.field5748;
                                    if (var83 != null) {
                                        for (int var84 = 4; var84 >= 0; --var84) {
                                            if (var83[var84] != null) {
                                                short var85 = 0;
                                                if (~var84 == -1) {
                                                    var85 = 4;
                                                }
                                                int var86 = class28.field297;
                                                if (var84 == 1) {
                                                    var85 = 52;
                                                }
                                                if (var84 == 2) {
                                                    var85 = 8;
                                                }
                                                if (var84 == 3) {
                                                    var85 = 46;
                                                }
                                                if (var81.field5740 == var84) {
                                                    var86 = var81.field5772;
                                                }
                                                if (var84 == 4) {
                                                    var85 = 1008;
                                                }
                                                if (var81.field5698 == var84) {
                                                    var86 = var81.field5733;
                                                }
                                                class526.method3076(-1, false, class75.method689(var39, var38, var80, 15606), 500, "<col=00ffff>" + var81.field5731, var39, var38, false, true, var86, (long) var80.hashCode(), var85, var83[var84]);
                                                ++class496.field6803;
                                            }
                                        }
                                    }
                                    class526.method3076(-1, false, (long) var81.field5746, 500, "<col=00ffff>" + var81.field5731, var39, var38, class719.field10041.field10361 != var35.field2501.field10361, true, class645.field9176, (long) var80.hashCode(), 1006, class563.field7820.method3281(class423.field5892, -1));
                                    ++class43.field578;
                                }
                            }
                        }
                    }
                }
                if (class593.field8489) {
                    class570.method3301(65);
                }
            }
            class259.method1688((byte) 7, false);
        }
    }

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "(I)Lgf;", line = 553)
    public final class74 method2488(int arg0) {
        if (arg0 != -1) {
            field5870 = false;
        }
        ++field5878;
        return class583.field8379[super.field2305];
    }

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(B)V", line = 579)
    public static void method2489(byte arg0) {
        field5869 = null;
        field5876 = null;
        if (arg0 != -62) {
            field5873 = null;
        }
        field5873 = null;
    }
}
