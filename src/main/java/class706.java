import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class706 extends class205 {

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field9959 = 0;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "Lcb;")
    public static class631 field9960 = new class631(5, 4);

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field9961;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field9963;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field9964;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Lfc;")
    public static class731 field9962;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V", line = 5)
    public static void method3917(boolean arg0) {
        if (arg0) {
            field9962 = null;
            field9960 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BILcd;)V", line = 17)
    public static final void method3918(byte arg0, int arg1, class22 arg2) {
        field9963++;
        if (class1.field2) {
            arg1 = 0;
            class1.field2 = false;
        }
        int var3 = 51 / ((arg0 - 39) / 63);
        if (class449.field6549 != null && class449.field6549.method118((byte) 120, arg2)) {
            return;
        }
        class449.field6549 = arg2;
        class246.field3953 = class18.method109(-11121);
        class576.field8163 = arg1;
        class672.field9515 = arg1;
        if (class672.field9515 != 0) {
            class748.field10447 = class624.field8744;
            class86.field1264 = class429.field6283;
            class678.field9559 = class416.field6111;
            class352.field5147 = class195.field3356;
            class332.field4882 = class442.field6428;
            class565.field8013 = class467.field6802;
            class356.field5389 = class758.field10560;
            class85.field1252 = class3.field15;
            class193.field3337 = class103.field1529;
            class293.field4497 = class257.field4037;
            return;
        }
        class143.method1107(0);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BIIIZIII[Lraa;II)V", line = 60)
    public static final void method3919(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, class353[] arg8, int arg9, int arg10) {
        class364.field5573.method240(arg2, arg3, arg7, arg9);
        if (arg0 < 31) {
            method3917(true);
        }
        field9961++;
        for (int var11 = 0; var11 < arg8.length; var11++) {
            class353 var12 = arg8[var11];
            if (var12 != null && (var12.field5202 == arg10 || arg10 == -1412584499 && class146.field2298 == var12)) {
                int var13 = var12.field5359 + arg5;
                int var14 = var12.field5296 + arg6;
                int var15 = var12.field5230 + var13 + 1;
                int var16 = var12.field5280 + var14 + 1;
                int var17;
                if (arg1 == -1) {
                    class466.field6792[class429.field6280].setBounds(var12.field5359 + arg5, var12.field5296 + arg6, var12.field5230, var12.field5280);
                    var17 = class429.field6280++;
                } else {
                    var17 = arg1;
                }
                var12.field5369 = var17;
                var12.field5239 = class199.field3403;
                if (!client.method2739(var12)) {
                    if (var12.field5235 != 0) {
                        class155.method1167(var12, -119);
                    }
                    int var18 = var12.field5359 + arg5;
                    int var19 = var12.field5296 + arg6;
                    int var20 = 0;
                    int var21 = 0;
                    if (class250.field3989) {
                        var20 = class499.method3028(0);
                        var21 = class545.method3197(-57);
                    }
                    int var22 = var12.field5294;
                    if (class107.field1563 && (client.method2735(var12).field4391 != 0 || var12.field5306 == 0) && var22 > 127) {
                        var22 = 127;
                    }
                    if (class146.field2298 == var12) {
                        if (arg10 != -1412584499 && (class521.field7527 == var12.field5272 || class18.field192 == var12.field5272)) {
                            class652.field9258 = arg5;
                            class221.field3593 = arg8;
                            class60.field943 = arg6;
                            continue;
                        }
                        if (class233.field3749 && class476.field6916) {
                            int var23 = var20 + class651.field9244.method2915(-8463);
                            int var24 = var21 + class651.field9244.method2921((byte) -125);
                            int var25 = var24 - class752.field10476;
                            int var26 = var23 - class189.field3190;
                            if (class138.field2167 > var26) {
                                var26 = class138.field2167;
                            }
                            if (var26 + var12.field5230 > class138.field2167 + class23.field236.field5230) {
                                var26 = class138.field2167 + class23.field236.field5230 - var12.field5230;
                            }
                            if (var25 < class757.field10540) {
                                var25 = class757.field10540;
                            }
                            var18 = var26;
                            if (var25 + var12.field5280 > class757.field10540 - -class23.field236.field5280) {
                                var25 = class757.field10540 + class23.field236.field5280 - var12.field5280;
                            }
                            var19 = var25;
                        }
                        if (class18.field192 == var12.field5272) {
                            var22 = 128;
                        }
                    }
                    int var29;
                    int var30;
                    int var31;
                    int var32;
                    if (var12.field5306 == 2) {
                        var29 = arg3;
                        var32 = arg7;
                        var31 = arg9;
                        var30 = arg2;
                    } else {
                        int var27 = var12.field5230 + var18;
                        int var28 = var12.field5280 + var19;
                        if (var12.field5306 == 9) {
                            var28++;
                            var27++;
                        }
                        var29 = var19 > arg3 ? var19 : arg3;
                        var30 = arg2 >= var18 ? arg2 : var18;
                        var31 = var28 >= arg9 ? arg9 : var28;
                        var32 = var27 >= arg7 ? arg7 : var27;
                    }
                    if (var30 < var32 && var29 < var31) {
                        if (var12.field5235 != 0) {
                            if (class376.field5662 == var12.field5235 || class110.field1710 == var12.field5235) {
                                class373.method2371(var12, -17, var18, var19);
                                if (!class250.field3989) {
                                    class368.method2349(var19, var12.field5230, var18, class110.field1710 == var12.field5235, -21120, var12.field5280);
                                    class364.field5573.method240(arg2, arg3, arg7, arg9);
                                }
                                class6.field66[var17] = true;
                                continue;
                            }
                            if (class351.field5135 == var12.field5235) {
                                if (var12.method2262(class364.field5573, -126) != null) {
                                    class493.method2998((byte) -115);
                                    class63.method631(class364.field5573, var18, var19, 19595, var12);
                                    class376.field5666[var17] = true;
                                    class364.field5573.method240(arg2, arg3, arg7, arg9);
                                    if (class250.field3989) {
                                        if (arg4) {
                                            class438.method2696(var14, var16, var15, (byte) 94, var13);
                                        } else {
                                            class254.method1725(var13, var14, var15, false, var16);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class29.field284 == var12.field5235) {
                                if (var12.method2262(class364.field5573, 122) != null) {
                                    class556.method3241(var19, var12, var18, (byte) -54);
                                    class376.field5666[var17] = true;
                                    class364.field5573.method240(arg2, arg3, arg7, arg9);
                                    if (class250.field3989) {
                                        if (arg4) {
                                            class438.method2696(var14, var16, var15, (byte) 76, var13);
                                        } else {
                                            class254.method1725(var13, var14, var15, false, var16);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class425.field6243 == var12.field5235) {
                                class477.method2903(class352.field5158, false, var18, class364.field5573, var12.field5230, var12.field5280, var19);
                                class6.field66[var17] = true;
                                class364.field5573.method240(arg2, arg3, arg7, arg9);
                                continue;
                            }
                            if (class596.field8449 == var12.field5235) {
                                class262.method1750(var12.field5230, var12.field5280, var19, var18, 1, class364.field5573);
                                class6.field66[var17] = true;
                                class364.field5573.method240(arg2, arg3, arg7, arg9);
                                continue;
                            }
                            if (class460.field6673 == var12.field5235) {
                                if (!class758.field10580 && !class226.field3630) {
                                    continue;
                                }
                                int var33 = var18 + var12.field5230;
                                if (class250.field3989) {
                                    if (arg4) {
                                        class438.method2696(var14, var16, var15, (byte) 83, var13);
                                    } else {
                                        class254.method1725(var13, var14, var15, false, var16);
                                    }
                                }
                                int var34 = var19 + 15;
                                if (class758.field10580) {
                                    int var35 = -256;
                                    if (class595.field8435 < 20) {
                                        var35 = -65536;
                                    }
                                    class74.field1105.method2482("Fps:" + class595.field8435, -1, var33, 0, var35, var34);
                                    var34 += 15;
                                    Runtime var36 = Runtime.getRuntime();
                                    int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                    int var38 = -256;
                                    if (var37 > 98304) {
                                        var38 = -65536;
                                        if (class564.field7994) {
                                            class637.method3606(-28907);
                                            for (int var39 = 0; var39 < 10; var39++) {
                                                System.gc();
                                            }
                                            var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                            if (var37 > 65536) {
                                                class564.method3268("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", 17137, 4);
                                            }
                                        }
                                    }
                                    class74.field1105.method2482("Mem:" + var37 + "k", -1, var33, 0, var38, var34);
                                    var34 += 15;
                                    class74.field1105.method2482("In:" + class530.field7618 + "B/s Out:" + class553.field7875 + "B/s", -1, var33, 0, -256, var34);
                                    var34 += 15;
                                    int var40 = class364.field5573.method332() / 1024;
                                    class74.field1105.method2482("Offheap:" + var40 + "k", -1, var33, 0, var40 > 65536 ? -65536 : -256, var34);
                                    var34 += 15;
                                    int var41 = 0;
                                    int var42 = 0;
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < 37; var44++) {
                                        if (class442.field6424[var44] != null) {
                                            var41 += class442.field6424[var44].method3589((byte) 0);
                                            var42 += class442.field6424[var44].method3585(true);
                                            var43 += class442.field6424[var44].method3583(-30536);
                                        }
                                    }
                                    int var45 = var43 * 100 / var41;
                                    int var46 = var42 * 10000 / var41;
                                    String var47 = "Cache:" + class235.method1622(2, 0, -18764, true, (long) var46) + "% (" + var45 + "%)";
                                    class236.field3788.method2482(var47, -1, var33, 0, -256, var34);
                                    var34 += 12;
                                }
                                if (class3.field17 > 0) {
                                    class236.field3788.method2482("Particles: " + class413.field6087 + " / " + class3.field17, -1, var33, 0, -256, var34);
                                }
                                var34 += 12;
                                if (class226.field3630) {
                                    class236.field3788.method2482("Polys: " + class364.field5573.method1273() + " Models: " + class364.field5573.method300(), -1, var33, 0, -256, var34);
                                    var34 += 12;
                                    class236.field3788.method2482("Ls: " + class98.field1464 + " La: " + class540.field7713 + " NPC: " + class407.field6032 + " Pl: " + class362.field5473, -1, var33, 0, -256, var34);
                                    var34 += 12;
                                    class26.method148(0);
                                }
                                class6.field66[var17] = true;
                                continue;
                            }
                        }
                        if (var12.field5306 == 0) {
                            if (class638.field8963 == var12.field5235 && class364.field5573.method1237()) {
                                class364.field5573.method1281(var18, var19, var12.field5230, var12.field5280);
                            }
                            method3919((byte) 83, var17, var30, var29, arg4, var18 - var12.field5284, var19 - var12.field5299, var32, arg8, var31, var12.field5349);
                            if (var12.field5335 != null) {
                                method3919((byte) 110, var17, var30, var29, arg4, var18 - var12.field5284, var19 - var12.field5299, var32, var12.field5335, var31, var12.field5349);
                            }
                            class520 var48 = (class520) class36.field340.method3512(true, (long) var12.field5349);
                            if (var48 != null) {
                                class118.method935(var19, var18, var17, var30, var31, var48.field7511, var32, (byte) 68, var29);
                            }
                            if (class638.field8963 == var12.field5235 && class364.field5573.method1237()) {
                                class364.field5573.method1285();
                            }
                            class364.field5573.method240(arg2, arg3, arg7, arg9);
                        }
                        if (class580.field8207[var17] || field9959 > 1) {
                            if (var12.field5306 == 3) {
                                if (var22 == 0) {
                                    if (var12.field5331) {
                                        class364.field5573.method410(var18, var19, var12.field5230, var12.field5280, var12.field5278, 0);
                                    } else {
                                        class364.field5573.method224(var18, var19, var12.field5230, var12.field5280, var12.field5278, 0);
                                    }
                                } else if (var12.field5331) {
                                    class364.field5573.method410(var18, var19, var12.field5230, var12.field5280, 255 - (var22 & 0xFF) << 24 | var12.field5278 & 0xFFFFFF, 1);
                                } else {
                                    class364.field5573.method224(var18, var19, var12.field5230, var12.field5280, 255 - (var22 & 0xFF) << 24 | var12.field5278 & 0xFFFFFF, 1);
                                }
                                if (class250.field3989) {
                                    if (arg4) {
                                        class438.method2696(var14, var16, var15, (byte) 115, var13);
                                    } else {
                                        class254.method1725(var13, var14, var15, false, var16);
                                    }
                                }
                            } else if (var12.field5306 == 4) {
                                class400 var49 = var12.method2249((byte) 102, class364.field5573);
                                if (var49 != null) {
                                    int var50 = var12.field5278;
                                    String var51 = var12.field5231;
                                    if (var12.field5328 != -1) {
                                        class688 var52 = class556.field7917.method741(116, var12.field5328);
                                        var51 = var52.field9714;
                                        if (var51 == null) {
                                            var51 = "null";
                                        }
                                        if ((var52.field9761 == 1 || var12.field5367 != 1) && var12.field5367 != -1) {
                                            var51 = "<col=ff9040>" + var51 + "</col> x" + class261.method1743(125, var12.field5367);
                                        }
                                    }
                                    if (var12.field5327 != -1) {
                                        var51 = class610.method3488(var12.field5327, (byte) 70);
                                        if (var51 == null) {
                                            var51 = "";
                                        }
                                    }
                                    if (class139.field2176 == var12) {
                                        var51 = class641.field9024.method3621(115, class467.field6804);
                                        var50 = var12.field5278;
                                    }
                                    if (class273.field4184) {
                                        class364.field5573.method298(var18, var19, var18 + var12.field5230, var12.field5280 + var19);
                                    }
                                    var49.method2480(var12.field5230, var18, var12.field5295 ? 255 - (var22 & 0xFF) << 24 : -1, 127, var12.field5285, null, var12.field5274, var12.field5341, null, class438.field6393, var50 | 255 - (var22 & 0xFF) << 24, 0, var12.field5280, var51, var12.field5212, 0, var19);
                                    if (class273.field4184) {
                                        class364.field5573.method240(arg2, arg3, arg7, arg9);
                                    }
                                    if (var51.trim().length() > 0) {
                                        if (!class273.field4184) {
                                            class54 var53 = class723.method3988(-29123, class364.field5573, var12.field5252);
                                            int var54 = var53.method506(0, var51, var12.field5230, class438.field6393);
                                            int var55 = var53.method512(var12.field5285, class438.field6393, 1384, var51, var12.field5230);
                                            if (class250.field3989) {
                                                if (arg4) {
                                                    class438.method2696(var19, var19 + var55, var18 + var54, (byte) 80, var18);
                                                } else {
                                                    class254.method1725(var18, var19, var18 + var54, false, var19 + var55);
                                                }
                                            }
                                        } else if (class250.field3989) {
                                            if (arg4) {
                                                class438.method2696(var14, var16, var15, (byte) 127, var13);
                                            } else {
                                                class254.method1725(var13, var14, var15, false, var16);
                                            }
                                        }
                                    }
                                } else if (class68.field1061) {
                                    class717.method3960(var12, (byte) 101);
                                }
                            } else if (var12.field5306 == 5) {
                                if (var12.field5339 >= 0) {
                                    var12.method2257((byte) 82, class416.field6122, class691.field9803).method2150(-12886, var19, var18, 0, var12.field5230, class364.field5573, var12.field5280, var12.field5198 << 3, 0, var12.field5246 << 3);
                                } else {
                                    class34 var56;
                                    if (var12.field5328 != -1) {
                                        class426 var57 = var12.field5337 ? class145.field2251.field8138 : null;
                                        var56 = class556.field7917.method744(var12.field5316 | 0xFF000000, (byte) -61, var12.field5362, var12.field5328, var57, var12.field5367, class364.field5573, var12.field5233);
                                    } else if (var12.field5327 == -1) {
                                        var56 = var12.method2263(-1, class364.field5573);
                                    } else {
                                        var56 = class122.method963(var12.field5327, class364.field5573, (byte) 74);
                                    }
                                    if (var56 != null) {
                                        int var58 = var56.method177();
                                        int var59 = var56.method184();
                                        int var60 = (var12.field5278 == 0 ? 16777215 : var12.field5278 & 0xFFFFFF) | 255 - (var22 & 0xFF) << 24;
                                        if (var12.field5265) {
                                            class364.field5573.method298(var18, var19, var12.field5230 + var18, var19 - -var12.field5280);
                                            if (var12.field5219 != 0) {
                                                int var61 = (var58 + var12.field5230 - 1) / var58;
                                                int var62 = (var12.field5280 + var59 - 1) / var59;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var12.field5278 == 0) {
                                                            var56.method176((float) var58 / 2.0F + (float) (var18 + (var58 * var63)), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field5219);
                                                        } else {
                                                            var56.method189((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field5219, 0, var60, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var12.field5278 == 0 && var22 == 0) {
                                                var56.method188(var18, var19, var12.field5230, var12.field5280);
                                            } else {
                                                var56.method181(var18, var19, var12.field5230, var12.field5280, 0, var60, 1);
                                            }
                                            class364.field5573.method240(arg2, arg3, arg7, arg9);
                                        } else if (var12.field5278 == 0 && var22 == 0) {
                                            if (var12.field5219 != 0) {
                                                var56.method176((float) var12.field5230 / 2.0F + (float) var18, (float) var12.field5280 / 2.0F + (float) var19, var12.field5230 * 4096 / var58, var12.field5219);
                                            } else if (var12.field5230 == var58 && var12.field5280 == var59) {
                                                var56.method182(var18, var19);
                                            } else {
                                                var56.method187(var18, var19, var12.field5230, var12.field5280);
                                            }
                                        } else if (var12.field5219 != 0) {
                                            var56.method189((float) var12.field5230 / 2.0F + (float) var18, (float) var12.field5280 / 2.0F + (float) var19, var12.field5230 * 4096 / var58, var12.field5219, 0, var60, 1);
                                        } else if (var12.field5230 == var58 && var12.field5280 == var59) {
                                            var56.method48(var18, var19, 0, var60, 1);
                                        } else {
                                            var56.method191(var18, var19, var12.field5230, var12.field5280, 0, var60, 1);
                                        }
                                    } else if (class68.field1061) {
                                        class717.method3960(var12, (byte) 38);
                                    }
                                }
                                if (class250.field3989) {
                                    if (arg4) {
                                        class438.method2696(var14, var16, var15, (byte) 97, var13);
                                    } else {
                                        class254.method1725(var13, var14, var15, false, var16);
                                    }
                                }
                            } else if (var12.field5306 == 6) {
                                class496.method3012((byte) -64);
                                class282 var65 = null;
                                int var66 = 0;
                                if (var12.field5328 != -1) {
                                    class688 var74 = class556.field7917.method741(-50, var12.field5328);
                                    if (var74 != null) {
                                        class688 var75 = var74.method3839(10, var12.field5367);
                                        class82 var76 = var12.field5290 == -1 ? null : class83.field1219.method2358((byte) 80, var12.field5290);
                                        class426 var77 = var12.field5337 ? class145.field2251.field8138 : null;
                                        var65 = var75.method3835(2048, var76, var77, 1, var12.field5242, class364.field5573, var12.field5266, (byte) -101, var12.field5245);
                                        if (var65 == null) {
                                            class717.method3960(var12, (byte) 82);
                                        } else {
                                            var66 = -var65.method1033() >> 1;
                                        }
                                    }
                                } else if (var12.field5249 == 5) {
                                    int var71 = var12.field5276;
                                    if (var71 >= 0 && var71 < 2048) {
                                        class573 var72 = class279.field4271[var71];
                                        class82 var73 = var12.field5290 == -1 ? null : class83.field1219.method2358((byte) 84, var12.field5290);
                                        if (var72 != null && (class673.field9516 == var71 || class666.method3732(false, var72.field8146) == var12.field5364)) {
                                            var65 = var72.field8138.method2664(null, class364.field5573, class174.field2980, 0, class422.field6216, 2048, -1, class740.field10382, var12.field5245, null, 0, class83.field1219, class556.field7917, true, 0, null, 118, var73, var12.field5266, var12.field5242, class581.field8222);
                                        }
                                    }
                                } else if (var12.field5249 == 8 || var12.field5249 == 9) {
                                    class33 var68 = class446.method2724(var12.field5276, 9, false);
                                    class82 var69 = var12.field5290 == -1 ? null : class83.field1219.method2358((byte) 82, var12.field5290);
                                    if (var68 != null) {
                                        class426 var70 = var12.field5337 ? class145.field2251.field8138 : null;
                                        var65 = var68.method171(var12.field5266, 2048, var70, var12.field5364, (byte) -116, var12.field5245, var12.field5242, var12.field5249 == 9, var69, class364.field5573);
                                    }
                                } else if (var12.field5290 == -1) {
                                    var65 = var12.method2252(0, -1, class581.field8222, class422.field6216, class83.field1219, class556.field7917, 2048, class174.field2980, class740.field10382, class364.field5573, null, -1, false, class145.field2251.field8138);
                                    if (var65 == null && class68.field1061) {
                                        class717.method3960(var12, (byte) 71);
                                    }
                                } else {
                                    class82 var67 = class83.field1219.method2358((byte) 100, var12.field5290);
                                    var65 = var12.method2252(var12.field5266, var12.field5245, class581.field8222, class422.field6216, class83.field1219, class556.field7917, 2048, class174.field2980, class740.field10382, class364.field5573, var67, var12.field5242, false, class145.field2251.field8138);
                                    if (var65 == null && class68.field1061) {
                                        class717.method3960(var12, (byte) 119);
                                    }
                                }
                                if (var65 != null) {
                                    int var78;
                                    if (var12.field5325 <= 0) {
                                        var78 = 512;
                                    } else {
                                        var78 = (var12.field5230 << 9) / var12.field5325;
                                    }
                                    int var79;
                                    if (var12.field5356 <= 0) {
                                        var79 = 512;
                                    } else {
                                        var79 = (var12.field5280 << 9) / var12.field5356;
                                    }
                                    int var80 = var12.field5230 / 2 + var18;
                                    int var81 = var12.field5280 / 2 + var19;
                                    if (!var12.field5261) {
                                        var81 += var12.field5291 * var79 >> 9;
                                        var80 += var12.field5332 * var78 >> 9;
                                    }
                                    class257.field4038.method677();
                                    class364.field5573.method244(class257.field4038);
                                    class364.field5573.method288(var80, var81, var78, var79);
                                    class364.field5573.method1287();
                                    if (var12.field5200) {
                                        class364.field5573.method326(false);
                                    }
                                    if (var12.field5261) {
                                        class44.field744.method674(var12.field5301);
                                        class44.field744.method678(var12.field5368);
                                        class44.field744.method667(var12.field5267);
                                        class44.field744.method671(var12.field5332, var12.field5291, var12.field5345);
                                    } else {
                                        int var82 = (var12.field5253 << 2) * class582.field8226[var12.field5301 << 3] >> 14;
                                        int var83 = (var12.field5253 << 2) * class582.field8230[var12.field5301 << 3] >> 14;
                                        class44.field744.method670(-var12.field5267 << 3);
                                        class44.field744.method678(var12.field5368 << 3);
                                        class44.field744.method671(var12.field5244 << 2, (var12.field5227 << 2) + var82 + var66, var83 - -(var12.field5227 << 2));
                                        class44.field744.method672(var12.field5301 << 3);
                                    }
                                    var12.method2251(class44.field744, 114, class364.field5573, class199.field3403, var65);
                                    if (class273.field4184) {
                                        class364.field5573.method298(var18, var19, var18 + var12.field5230, var12.field5280 + var19);
                                    }
                                    if (var12.field5261) {
                                        if (var12.field5236) {
                                            var65.method1026(class44.field744, null, var12.field5253, 1);
                                        } else {
                                            var65.method1007(class44.field744, null, 1);
                                            if (var12.field5312 != null) {
                                                class364.field5573.method420(var12.field5312.method3546());
                                            }
                                        }
                                    } else if (var12.field5236) {
                                        var65.method1026(class44.field744, null, var12.field5253 << 2, 1);
                                    } else {
                                        var65.method1007(class44.field744, null, 1);
                                        if (var12.field5312 != null) {
                                            class364.field5573.method420(var12.field5312.method3546());
                                        }
                                    }
                                    if (class273.field4184) {
                                        class364.field5573.method240(arg2, arg3, arg7, arg9);
                                    }
                                    if (var12.field5200) {
                                        class364.field5573.method326(true);
                                    }
                                }
                                if (class250.field3989) {
                                    if (arg4) {
                                        class438.method2696(var14, var16, var15, (byte) 118, var13);
                                    } else {
                                        class254.method1725(var13, var14, var15, false, var16);
                                    }
                                }
                            } else if (var12.field5306 == 9) {
                                int var84;
                                int var85;
                                int var86;
                                int var87;
                                if (var12.field5297) {
                                    var85 = var18;
                                    var84 = var12.field5280 + var19;
                                    var86 = var12.field5230 + var18;
                                    var87 = var19;
                                } else {
                                    var84 = var19;
                                    var85 = var18;
                                    var86 = var12.field5230 + var18;
                                    var87 = var12.field5280 + var19;
                                }
                                if (var12.field5293 == 1) {
                                    class364.field5573.method315(var85, var84, var86, var87, var12.field5278, 0);
                                } else {
                                    class364.field5573.method283(var85, var84, var86, var87, var12.field5278, var12.field5293, 0);
                                }
                                if (class250.field3989) {
                                    if (arg4) {
                                        class438.method2696(var14, var16, var15, (byte) 103, var13);
                                    } else {
                                        class254.method1725(var13, var14, var15, false, var16);
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
