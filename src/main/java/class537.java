import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class537 {

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "[J")
    public static long[] field7680 = new long[11];

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "[[J")
    public static long[][] field7682 = new long[8][256];

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "Lqe;")
    public static class469 field7684;

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field7676;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field7677;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
    public static int field7681;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    public static int field7683;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
    public static final void method3151(byte arg0) {
        if (class425.field6314 != -1) {
            class653.method3782(-1, -119, class425.field6314, false, -1);
            class425.field6314 = -1;
        }
        field7679++;
        if (arg0 != -114) {
            field7685 = -37;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZIII)I")
    public static final int method3152(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field7677++;
        int var5 = arg3 & 0xF;
        int var6 = var5 >= 8 ? arg0 : arg2;
        int var7 = var5 < 4 ? arg0 : (var5 == 12 || var5 == 14 ? arg2 : arg4);
        if (!arg1) {
            method3151((byte) -43);
        }
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public static void method3153(int arg0) {
        field7680 = null;
        if (arg0 > -101) {
            method3151((byte) 41);
        }
        field7682 = null;
        field7684 = null;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIZI)V")
    public static final void method3154(int arg0, int arg1, boolean arg2, int arg3) {
        field7676++;
        if (class154.field2501.method2287((long) arg3, (byte) -117) == null) {
            if (class710.field9999) {
                class194 var4 = new class194(arg3, new class54(4096, class661.field9246, arg3), arg0, arg2);
                var4.field2936.method1216(22600, class303.field4296[class650.field9160]);
                class154.field2501.method2278((byte) -100, (long) arg3, var4);
            } else {
                class226.method1522(-32697, arg2, arg3);
            }
        }
        if (arg1 != -8070) {
            method3154(43, -80, true, 121);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)Lqq;")
    public static final class477 method3155(int arg0, int arg1) {
        field7683++;
        if (arg1 == 0) {
            if ((double) class84.field1178 == 3.0D) {
                return class449.field6663;
            }
            if ((double) class84.field1178 == 4.0D) {
                return class284.field4043;
            }
            if ((double) class84.field1178 == 6.0D) {
                return class381.field5751;
            }
            if ((double) class84.field1178 >= 8.0D) {
                return class242.field3537;
            }
        } else if (arg1 == 1) {
            if ((double) class84.field1178 == 3.0D) {
                return class381.field5751;
            }
            if ((double) class84.field1178 == 4.0D) {
                return class242.field3537;
            }
            if ((double) class84.field1178 == 6.0D) {
                return class462.field6807;
            }
            if ((double) class84.field1178 >= 8.0D) {
                return class656.field9196;
            }
        } else if (arg1 == 2) {
            if ((double) class84.field1178 == 3.0D) {
                return class462.field6807;
            }
            if ((double) class84.field1178 == 4.0D) {
                return class656.field9196;
            }
            if ((double) class84.field1178 == 6.0D) {
                return class228.field3353;
            }
            if ((double) class84.field1178 >= 8.0D) {
                return class355.field5168;
            }
        }
        if (arg0 != -18186) {
            field7684 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
    public static final void method3156(int arg0) {
        field7678++;
        if (class647.field9127 == null) {
            return;
        }
        class311.field4401 = new class582();
        if (arg0 != 1914161577) {
            method3157(null, (byte) 93, 72, -120);
        }
        class311.field4401.method3373(class501.field7122, class647.field9127.field810.method2679(class650.field9160, -84), 30, class647.field9127.field814, class647.field9127);
        class597.field8459 = new Thread(class311.field4401, "");
        class597.field8459.start();
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lha;BII)V")
    public static final void method3157(class60 arg0, byte arg1, int arg2, int arg3) {
        field7681++;
        if (arg2 < 0 || arg3 < 0 || class463.field6818 == 0 || class454.field6693 == 0) {
            return;
        }
        if (arg1 <= 94) {
            method3151((byte) -7);
        }
        class738 var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        if (class419.field6265) {
            class368.method2266(90, false);
            var4 = arg0.method504();
            int[] var5 = arg0.method434();
            var6 = var5[0];
            var7 = var5[3];
            var8 = var5[1];
            var9 = var5[2];
            var10 = class324.method2058(false, (byte) 93) + arg2;
            var11 = arg3 + class441.method2734(8, false);
        } else {
            arg0.method500(class347.field5005, class66.field937, class463.field6818, class454.field6693);
            var7 = class454.field6693;
            var6 = class347.field5005;
            var9 = class463.field6818;
            var8 = class66.field937;
            arg0.method476(class501.field7121, class352.field5124, class463.field6818, class454.field6693);
            var4 = arg0.method515();
            var4.method775(class619.field8699, class214.field3201, class36.field372, class555.field7937, class478.field6931, class705.field9937);
            var11 = arg3;
            var10 = arg2;
            arg0.method534(var4);
        }
        if (var7 == 0) {
            var7 = 1;
        }
        if (var9 == 0) {
            var9 = 1;
        }
        class120.method867(105, true);
        if (class531.field7566 != null && (!class282.field3986 || (class295.field4202 & 0x40) != 0)) {
            int var12 = -1;
            int var13 = -1;
            int var14 = arg0.method457();
            int var15 = arg0.method514();
            int var16;
            int var17;
            int var18;
            int var19;
            if (class418.field6258) {
                var16 = var17 = (var10 - var6) * class188.field2859 / var9;
                var19 = var18 = (var11 - var8) * class188.field2859 / var7;
            } else {
                var16 = (var10 - var6) * var14 / var9;
                var17 = (var10 - var6) * var15 / var9;
                var18 = (var11 - var8) * var15 / var7;
                var19 = (var11 - var8) * var14 / var7;
            }
            int[] var20 = new int[] { var16, var19, var14 };
            var4.method771(var20);
            int[] var21 = new int[] { var17, var18, var15 };
            var4.method771(var21);
            float var22 = class280.method1789((float) var20[2], (float) var21[1], (float) var21[0], (float) var20[0], (float) var21[2], 4, (float) var20[1], -125);
            if (var22 > 0.0F) {
                int var23 = var21[0] - var20[0];
                int var24 = var21[2] - var20[2];
                int var25 = (int) ((float) var23 * var22 + (float) var20[0]);
                int var26 = (int) ((float) var24 * var22 + (float) var20[2]);
                var12 = var25 + (class130.field1749.method2579(false) - 1 << 8) >> 9;
                var13 = (class130.field1749.method2579(false) - 1 << 8) + var26 >> 9;
                byte var27 = class130.field1749.field8429;
                if (var27 < 3 && (class60.field847[1][var25 >> 9][var26 >> 9] & 0x2) != 0) {
                    int var87 = var27 + 1;
                }
            }
            if (var12 != -1 && var13 != -1) {
                if (class282.field3986 && (class295.field4202 & 0x40) != 0) {
                    class46 var28 = class700.method3972(class76.field1062, class745.field10436, true);
                    if (var28 == null) {
                        class148.method1087(-34848);
                    } else {
                        class240.method1593(class298.field4229, var12, (byte) -48, false, 0L, class488.field6984, true, -1, 6, var13, true, (long) (var13 | var12 << 0), " ->");
                    }
                } else {
                    if (class297.field4221) {
                        class240.method1593(class430.field6397.method2679(class650.field9160, 85), var12, (byte) 108, false, 0L, -1, true, -1, 50, var13, true, (long) (var13 | var12 << 0), "");
                    }
                    class240.method1593(class337.field4909, var12, (byte) -46, false, 0L, class62.field906, true, -1, 58, var13, true, (long) (var12 << 0 | var13), "");
                    class389.field5847++;
                }
            }
        }
        if (class419.field6265) {
            class148.method1096((byte) -29);
        }
        for (int var29 = 0; var29 < (class419.field6265 ? 2 : 1); var29++) {
            boolean var30 = var29 == 0;
            class127 var31 = var30 ? class177.field2736 : class547.field7814;
            int var32 = arg2;
            int var33 = arg3;
            if (class419.field6265) {
                class368.method2266(90, var30);
                var32 = arg2 + class324.method2058(var30, (byte) 124);
                var33 = arg3 + class441.method2734(8, var30);
            }
            class243 var34 = var31.field1682;
            for (class187 var35 = (class187) var34.method1615((byte) 92); var35 != null; var35 = (class187) var34.method1625(-103)) {
                if ((class516.field7373 || class130.field1749.field8429 == var35.field2848.field8429) && var35.method1311(116, arg0, var32, var33)) {
                    boolean var36 = false;
                    boolean var37 = false;
                    int var38;
                    int var39;
                    if (var35.field2848 instanceof class119) {
                        var38 = ((class119) var35.field2848).field1628;
                        var39 = ((class119) var35.field2848).field1626;
                    } else {
                        var38 = var35.field2848.field8423 >> 9;
                        var39 = var35.field2848.field8428 >> 9;
                    }
                    if (var35.field2848 instanceof class689) {
                        class689 var40 = (class689) var35.field2848;
                        int var41 = var40.method2579(false);
                        if ((var41 & 0x1) == 0 && (var40.field8423 & 0x1FF) == 0 && (var40.field8428 & 0x1FF) == 0 || (var41 & 0x1) == 1 && (var40.field8423 & 0x1FF) == 256 && (var40.field8428 & 0x1FF) == 256) {
                            int var42 = var40.field8423 - (var40.method2579(false) - 1 << 8);
                            int var43 = var40.field8428 - (var40.method2579(false) - 1 << 8);
                            for (int var44 = 0; var44 < class441.field6552; var44++) {
                                class432 var51 = (class432) class497.field7067.method2287((long) class338.field4921[var44], (byte) -117);
                                if (var51 != null) {
                                    class282 var52 = var51.field6439;
                                    if (class357.field5189 != var52.field6103 && var52.field6095) {
                                        int var53 = var52.field8423 - (var52.field4008.field5053 - 1 << 8);
                                        int var54 = var52.field8428 - (var52.field4008.field5053 - 1 << 8);
                                        if (var53 >= var42 && var52.field4008.field5053 <= (var40.method2579(false) - (var53 - var42 >> 9)) && var43 <= var54 && var52.field4008.field5053 <= var40.method2579(false) - (var54 - var43 >> 9)) {
                                            class454.method2779(var52, class130.field1749.field8429 != var35.field2848.field8429, (byte) 100);
                                            var52.field6103 = class357.field5189;
                                        }
                                    }
                                }
                            }
                            int var45 = class254.field3653;
                            int[] var46 = class345.field4993;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class689 var48 = class314.field4456[var46[var47]];
                                if (var48 != null && class357.field5189 != var48.field6103 && var40 != var48 && var48.field6095) {
                                    int var49 = var48.field8423 - (var48.method2579(false) - 1 << 8);
                                    int var50 = var48.field8428 - (var48.method2579(false) - 1 << 8);
                                    if (var42 <= var49 && var48.method2579(false) <= var40.method2579(false) - (var49 - var42 >> 9) && var43 <= var50 && var48.method2579(false) <= var40.method2579(false) - (var50 - var43 >> 9)) {
                                        class184.method1302(class130.field1749.field8429 != var35.field2848.field8429, (byte) 37, var48);
                                        var48.field6103 = class357.field5189;
                                    }
                                }
                            }
                        }
                        if (class357.field5189 == var40.field6103) {
                            continue;
                        }
                        class184.method1302(class130.field1749.field8429 != var35.field2848.field8429, (byte) 37, var40);
                        var40.field6103 = class357.field5189;
                    }
                    if (var35.field2848 instanceof class282) {
                        class282 var55 = (class282) var35.field2848;
                        if (var55.field4008 != null) {
                            if ((var55.field4008.field5053 & 0x1) == 0 && (var55.field8423 & 0x1FF) == 0 && (var55.field8428 & 0x1FF) == 0 || (var55.field4008.field5053 & 0x1) == 1 && (var55.field8423 & 0x1FF) == 256 && (var55.field8428 & 0x1FF) == 256) {
                                int var56 = var55.field8423 - (var55.field4008.field5053 - 1 << 8);
                                int var57 = var55.field8428 - (var55.field4008.field5053 - 1 << 8);
                                for (int var58 = 0; var58 < class441.field6552; var58++) {
                                    class432 var65 = (class432) class497.field7067.method2287((long) class338.field4921[var58], (byte) -117);
                                    if (var65 != null) {
                                        class282 var66 = var65.field6439;
                                        if (class357.field5189 != var66.field6103 && var55 != var66 && var66.field6095) {
                                            int var67 = var66.field8423 - (var66.field4008.field5053 - 1 << 8);
                                            int var68 = var66.field8428 - (var66.field4008.field5053 - 1 << 8);
                                            if (var67 >= var56 && var66.field4008.field5053 <= (var55.field4008.field5053 - (var67 - var56 >> 9)) && var68 >= var57 && var66.field4008.field5053 <= var55.field4008.field5053 - (var68 - var57 >> 9)) {
                                                class454.method2779(var66, class130.field1749.field8429 != var35.field2848.field8429, (byte) 100);
                                                var66.field6103 = class357.field5189;
                                            }
                                        }
                                    }
                                }
                                int var59 = class254.field3653;
                                int[] var60 = class345.field4993;
                                for (int var61 = 0; var61 < var59; var61++) {
                                    class689 var62 = class314.field4456[var60[var61]];
                                    if (var62 != null && class357.field5189 != var62.field6103 && var62.field6095) {
                                        int var63 = var62.field8423 - (var62.method2579(false) - 1 << 8);
                                        int var64 = var62.field8428 - (var62.method2579(false) - 1 << 8);
                                        if (var56 <= var63 && var62.method2579(false) <= var55.field4008.field5053 - (var63 - var56 >> 9) && var64 >= var57 && var62.method2579(false) <= var55.field4008.field5053 - (var64 - var57 >> 9)) {
                                            class184.method1302(class130.field1749.field8429 != var35.field2848.field8429, (byte) 37, var62);
                                            var62.field6103 = class357.field5189;
                                        }
                                    }
                                }
                            }
                            if (class357.field5189 == var55.field6103) {
                                continue;
                            }
                            class454.method2779(var55, class130.field1749.field8429 != var35.field2848.field8429, (byte) 100);
                            var55.field6103 = class357.field5189;
                        }
                    }
                    if (var35.field2848 instanceof class618) {
                        int var69 = class361.field5224 + var38;
                        int var70 = class582.field8288 + var39;
                        class258 var71 = (class258) class12.field173.method2287((long) (var69 | var70 << 14 | var35.field2848.field8429 << 28), (byte) -117);
                        if (var71 != null) {
                            int var72 = 0;
                            class661 var73 = (class661) var71.field3693.method1205(false);
                            while (var73 != null) {
                                class578 var74 = class336.field4876.method2079(var73.field9243, (byte) 94);
                                if (class282.field3986 && class130.field1749.field8429 == var35.field2848.field8429) {
                                    class323 var75 = class616.field8673 == -1 ? null : class153.field2479.method1653(class616.field8673, (byte) -119);
                                    if ((class295.field4202 & 0x1) != 0 && (var75 == null || var74.method3353(var75.field4610, class616.field8673, 0) != var75.field4610)) {
                                        class511.field7285++;
                                        class240.method1593(class298.field4229, var38, (byte) -111, false, (long) var73.field9243, class488.field6984, false, -1, 2, var39, true, (long) var72, class29.field278 + " -> <col=ff9040>" + var74.field8231);
                                    }
                                }
                                if (class130.field1749.field8429 == var35.field2848.field8429) {
                                    String[] var76 = var74.field8194;
                                    for (int var77 = 4; var77 >= 0; var77--) {
                                        if (var76 != null && var76[var77] != null) {
                                            byte var78 = 0;
                                            if (var77 == 0) {
                                                var78 = 51;
                                            }
                                            int var79 = class164.field2593;
                                            if (var77 == 1) {
                                                var78 = 23;
                                            }
                                            if (var77 == 2) {
                                                var78 = 45;
                                            }
                                            if (var77 == 3) {
                                                var78 = 49;
                                            }
                                            if (var77 == 4) {
                                                var78 = 57;
                                            }
                                            if (var74.field8196 == var77) {
                                                var79 = var74.field8156;
                                            }
                                            if (var74.field8188 == var77) {
                                                var79 = var74.field8199;
                                            }
                                            class240.method1593(var76[var77], var38, (byte) -49, false, (long) var73.field9243, var79, false, -1, var78, var39, true, (long) var72, "<col=ff9040>" + var74.field8231);
                                            class247.field3589++;
                                        }
                                    }
                                }
                                class240.method1593(class430.field6392.method2679(class650.field9160, 108), var38, (byte) 119, class130.field1749.field8429 != var35.field2848.field8429, (long) var73.field9243, class481.field6964, false, -1, 1001, var39, true, (long) var72, "<col=ff9040>" + var74.field8231);
                                class92.field1286++;
                                var73 = (class661) var71.field3693.method1194(46);
                                var72++;
                            }
                        }
                    }
                    if (var35.field2848 instanceof class721) {
                        class721 var80 = (class721) var35.field2848;
                        class211 var81 = class239.field3470.method388(var80.method317(125), 100);
                        if (var81.field3172 != null) {
                            var81 = var81.method1442((byte) -80, class83.field1160);
                        }
                        if (var81 != null) {
                            if (class282.field3986 && class130.field1749.field8429 == var35.field2848.field8429) {
                                class323 var82 = class616.field8673 == -1 ? null : class153.field2479.method1653(class616.field8673, (byte) -119);
                                if ((class295.field4202 & 0x4) != 0 && (var82 == null || var81.method1434(var82.field4610, class616.field8673, 81) != var82.field4610)) {
                                    class240.method1593(class298.field4229, var38, (byte) -87, false, class614.method3553(var38, false, var39, var80), class488.field6984, false, -1, 4, var39, true, (long) var80.hashCode(), class29.field278 + " -> <col=00ffff>" + var81.field3169);
                                    class211.field3162++;
                                }
                            }
                            if (class130.field1749.field8429 == var35.field2848.field8429) {
                                String[] var83 = var81.field3180;
                                if (var83 != null) {
                                    for (int var84 = 4; var84 >= 0; var84--) {
                                        if (var83[var84] != null) {
                                            short var85 = 0;
                                            if (var84 == 0) {
                                                var85 = 10;
                                            }
                                            int var86 = class164.field2593;
                                            if (var84 == 1) {
                                                var85 = 8;
                                            }
                                            if (var84 == 2) {
                                                var85 = 18;
                                            }
                                            if (var84 == 3) {
                                                var85 = 3;
                                            }
                                            if (var81.field3134 == var84) {
                                                var86 = var81.field3131;
                                            }
                                            if (var84 == 4) {
                                                var85 = 1011;
                                            }
                                            if (var81.field3153 == var84) {
                                                var86 = var81.field3140;
                                            }
                                            class240.method1593(var83[var84], var38, (byte) 121, false, class614.method3553(var38, false, var39, var80), var86, false, -1, var85, var39, true, (long) var80.hashCode(), "<col=00ffff>" + var81.field3169);
                                            class294.field4197++;
                                        }
                                    }
                                }
                                class236.field3422++;
                                class240.method1593(class430.field6392.method2679(class650.field9160, 81), var38, (byte) 115, class130.field1749.field8429 != var35.field2848.field8429, (long) var81.field3158, class481.field6964, false, -1, 1008, var39, true, (long) var80.hashCode(), "<col=00ffff>" + var81.field3169);
                            }
                        }
                    }
                }
            }
            if (class419.field6265) {
                class148.method1096((byte) -29);
            }
        }
        class120.method867(97, false);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            char var3 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
            long var4 = (long) ((var0 & 0x1) == 0 ? var3 >>> 8 : var3 & 0xFF);
            long var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 ^= 0x11DL;
            }
            long var8 = var6 << 1;
            if (var8 >= 256L) {
                var8 ^= 0x11DL;
            }
            long var10 = var4 ^ var8;
            long var12 = var8 << 1;
            if (var12 >= 256L) {
                var12 ^= 0x11DL;
            }
            long var14 = var12 ^ var4;
            field7682[0][var0] = class717.method4073(class717.method4073(class717.method4073(class717.method4073(class717.method4073(var4 << 32, class717.method4073(var8 << 40, class717.method4073(var4 << 56, var4 << 48))), var12 << 24), var10 << 16), var6 << 8), var14);
            for (int var16 = 1; var16 < 8; var16++) {
                field7682[var16][var0] = class717.method4073(field7682[var16 - 1][var0] << 56, field7682[var16 - 1][var0] >>> 8);
            }
        }
        field7680[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = (var1 - 1) * 8;
            field7680[var1] = class10.method71(class429.method2671(255L, field7682[7][var2 + 7]), class10.method71(class10.method71(class10.method71(class10.method71(class10.method71(class10.method71(class429.method2671(-72057594037927936L, field7682[0][var2]), class429.method2671(field7682[1][var2 + 1], 71776119061217280L)), class429.method2671(field7682[2][var2 + 2], 280375465082880L)), class429.method2671(field7682[3][var2 + 3], 1095216660480L)), class429.method2671(field7682[4][var2 + 4], 4278190080L)), class429.method2671(field7682[5][var2 + 5], 16711680L)), class429.method2671(field7682[6][var2 + 6], 65280L)));
        }
        field7684 = new class469(105, 4);
        field7685 = 0;
    }
}
