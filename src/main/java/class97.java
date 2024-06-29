import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class97 {

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "Z")
    public boolean field1341 = false;

    @OriginalMember(owner = "client!pia", name = "e", descriptor = "Z")
    public boolean field1343 = true;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "I")
    public int field1339 = 512;

    @OriginalMember(owner = "client!pia", name = "h", descriptor = "I")
    public int field1346 = -1;

    @OriginalMember(owner = "client!pia", name = "d", descriptor = "I")
    public int field1342 = 0;

    @OriginalMember(owner = "client!pia", name = "q", descriptor = "I")
    public int field1355 = 127;

    @OriginalMember(owner = "client!pia", name = "k", descriptor = "I")
    public int field1349 = 64;

    @OriginalMember(owner = "client!pia", name = "u", descriptor = "Z")
    public boolean field1359 = true;

    @OriginalMember(owner = "client!pia", name = "n", descriptor = "I")
    public int field1352 = 1190717;

    @OriginalMember(owner = "client!pia", name = "v", descriptor = "I")
    public int field1360 = -1;

    @OriginalMember(owner = "client!pia", name = "w", descriptor = "I")
    public int field1361 = 8;

    @OriginalMember(owner = "client!pia", name = "t", descriptor = "[I")
    public static int[] field1358 = new int[14];

    @OriginalMember(owner = "client!pia", name = "r", descriptor = "I")
    public static int field1356 = 0;

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!pia", name = "f", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!pia", name = "g", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!pia", name = "j", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!pia", name = "l", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!pia", name = "m", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!pia", name = "o", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!pia", name = "p", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!pia", name = "s", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!pia", name = "i", descriptor = "Lls;")
    public class142 field1347;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(Lsl;Z)V", line = 6)
    public final void method775(class461 arg0, boolean arg1) {
        field1353++;
        while (true) {
            int var3 = arg0.method2600((byte) -128);
            if (var3 == 0) {
                if (arg1) {
                    return;
                } else {
                    this.field1355 = -66;
                    return;
                }
            }
            this.method777(arg0, -6, var3);
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V", line = 34)
    public final void method776(int arg0) {
        this.field1361 = this.field1345 | this.field1361 << 8;
        if (arg0 < 98) {
            this.field1349 = -5;
        }
        field1354++;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(Lsl;II)V", line = 45)
    private final void method777(class461 arg0, int arg1, int arg2) {
        if (arg1 != -6) {
            this.field1347 = null;
        }
        if (arg2 == 1) {
            this.field1342 = class573.method3281(arg0.method2576((byte) 96), false);
        } else if (arg2 == 2) {
            this.field1360 = arg0.method2600((byte) -123);
        } else if (arg2 == 3) {
            this.field1360 = arg0.method2566(-2);
            if (this.field1360 == 65535) {
                this.field1360 = -1;
            }
        } else if (arg2 == 5) {
            this.field1359 = false;
        } else if (arg2 == 7) {
            this.field1346 = class573.method3281(arg0.method2576((byte) 115), false);
        } else if (arg2 == 8) {
            this.field1347.field2022 = this.field1345;
        } else if (arg2 == 9) {
            this.field1339 = arg0.method2566(-2) << 2;
        } else if (arg2 == 10) {
            this.field1343 = false;
        } else if (arg2 == 11) {
            this.field1361 = arg0.method2600((byte) -125);
        } else if (arg2 == 12) {
            this.field1341 = true;
        } else if (arg2 == 13) {
            this.field1352 = arg0.method2576((byte) 104);
        } else if (arg2 == 14) {
            this.field1349 = arg0.method2600((byte) -127) << 2;
        } else if (arg2 == 16) {
            this.field1355 = arg0.method2600((byte) -125);
        }
        field1350++;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIILqca;)V", line = 118)
    public static final void method778(int arg0, int arg1, int arg2, class118 arg3) {
        class14 var4 = class700.method3936(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field279 = arg3;
        int var5 = class395.field5009 == class195.field2669 ? 1 : 0;
        if (arg3.method83((byte) -69)) {
            if (arg3.method85(-126)) {
                arg3.field5791 = class72.field1005[var5];
                class72.field1005[var5] = arg3;
                return;
            }
            arg3.field5791 = class730.field10164[var5];
            class730.field10164[var5] = arg3;
            class563.field7924 = true;
            return;
        }
        arg3.field5791 = class259.field3278[var5];
        class259.field3278[var5] = arg3;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(B)V", line = 152)
    public static void method779(byte arg0) {
        if (arg0 != 35) {
            field1358 = null;
        }
        field1358 = null;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(Z)V", line = 169)
    public static final void method780(boolean arg0) {
        field1348++;
        if (!arg0 && class607.field8439 != null) {
            class14.field273 = new class155();
            class14.field273.method1085(class250.field3212, class607.field8439, class607.field8439.field4012, class607.field8439.field4007.method2547(-85, class243.field3143), 9577);
            class721.field10040 = new Thread(class14.field273, "");
            class721.field10040.start();
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIIBIIII[Lria;Z)V", line = 207)
    public static final void method781(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, class288[] arg9, boolean arg10) {
        field1340++;
        class386.field4930.method534(arg3, arg8, arg1, arg2);
        if (arg4 != -9) {
            field1356 = -14;
        }
        for (int var11 = 0; var11 < arg9.length; var11++) {
            class288 var12 = arg9[var11];
            if (var12 != null && (var12.field3743 == arg6 || arg6 == -1412584499 && class617.field8508 == var12)) {
                int var13 = var12.field3635 + arg5;
                int var14 = var12.field3687 + arg0;
                int var15 = var13 + var12.field3617 + 1;
                int var16 = var12.field3714 + var14 + 1;
                int var17;
                if (arg7 == -1) {
                    class694.field9642[class654.field9100].setBounds(var12.field3635 + arg5, var12.field3687 + arg0, var12.field3617, var12.field3714);
                    var17 = class654.field9100++;
                } else {
                    var17 = arg7;
                }
                var12.field3667 = var17;
                var12.field3639 = class463.field6224;
                if (!client.method1821(var12)) {
                    if (var12.field3715 != 0) {
                        class277.method1635(127, var12);
                    }
                    int var18 = var12.field3635 + arg5;
                    int var19 = var12.field3687 + arg0;
                    int var20 = 0;
                    int var21 = 0;
                    if (class676.field9448) {
                        var20 = class209.method1347(0);
                        var21 = class453.method2540(-72);
                    }
                    int var22 = var12.field3734;
                    if (class711.field9869 && (client.method1833(var12).field3291 != 0 || var12.field3655 == 0) && var22 > 127) {
                        var22 = 127;
                    }
                    if (class617.field8508 == var12) {
                        if (arg6 != -1412584499 && (class269.field3390 == var12.field3736 || class378.field4836 == var12.field3736)) {
                            class244.field3161 = arg9;
                            field1357 = arg5;
                            class173.field2391 = arg0;
                            continue;
                        }
                        if (class363.field4685 && class100.field1390) {
                            int var23 = class680.field9495.method1118((byte) 127) + var20;
                            int var24 = var21 + class680.field9495.method1115(arg4 + 13);
                            int var25 = var23 - class698.field9721;
                            int var26 = var24 - class147.field2050;
                            if (var25 < class259.field3280) {
                                var25 = class259.field3280;
                            }
                            if (var12.field3617 + var25 > class259.field3280 - -class302.field3957.field3617) {
                                var25 = class302.field3957.field3617 + class259.field3280 - var12.field3617;
                            }
                            if (var26 < class142.field2010) {
                                var26 = class142.field2010;
                            }
                            if ((var12.field3714 + var26) > (class142.field2010 + class302.field3957.field3714)) {
                                var26 = class302.field3957.field3714 + class142.field2010 - var12.field3714;
                            }
                            var18 = var25;
                            var19 = var26;
                        }
                        if (class378.field4836 == var12.field3736) {
                            var22 = 128;
                        }
                    }
                    int var27;
                    int var28;
                    int var29;
                    int var30;
                    if (var12.field3655 == 2) {
                        var27 = arg8;
                        var28 = arg1;
                        var29 = arg2;
                        var30 = arg3;
                    } else {
                        int var31 = var12.field3617 + var18;
                        int var32 = var12.field3714 + var19;
                        var27 = arg8 < var19 ? var19 : arg8;
                        var30 = arg3 < var18 ? var18 : arg3;
                        if (var12.field3655 == 9) {
                            var31++;
                            var32++;
                        }
                        var28 = arg1 > var31 ? var31 : arg1;
                        var29 = var32 < arg2 ? var32 : arg2;
                    }
                    if (var28 > var30 && var29 > var27) {
                        if (var12.field3715 != 0) {
                            if (class360.field4657 == var12.field3715 || class198.field2704 == var12.field3715) {
                                class326.method1901(var12, -1, var18, var19);
                                if (!class676.field9448) {
                                    class729.method4069(class198.field2704 == var12.field3715, var19, var12.field3714, var18, var12.field3617, false);
                                    class386.field4930.method534(arg3, arg8, arg1, arg2);
                                }
                                class559.field7782[var17] = true;
                                continue;
                            }
                            if (class72.field1003 == var12.field3715) {
                                if (var12.method1726(class386.field4930, 119) != null) {
                                    class14.method102(true);
                                    class244.method1521(var19, var18, class386.field4930, (byte) -99, var12);
                                    class755.field10530[var17] = true;
                                    class386.field4930.method534(arg3, arg8, arg1, arg2);
                                    if (class676.field9448) {
                                        if (arg10) {
                                            class236.method1478(-117, var14, var15, var13, var16);
                                        } else {
                                            class7.method35(var16, var14, 6462, var13, var15);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class396.field5053 == var12.field3715) {
                                if (var12.method1726(class386.field4930, arg4 ^ 0xFFFFFF8C) != null) {
                                    class459.method2554(var18, true, var19, var12);
                                    class755.field10530[var17] = true;
                                    class386.field4930.method534(arg3, arg8, arg1, arg2);
                                    if (class676.field9448) {
                                        if (arg10) {
                                            class236.method1478(-115, var14, var15, var13, var16);
                                        } else {
                                            class7.method35(var16, var14, 6462, var13, var15);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class738.field10262 == var12.field3715) {
                                class468.method2663(class386.field4930, var12.field3617, class124.field1793, var19, var18, var12.field3714, 125);
                                class559.field7782[var17] = true;
                                class386.field4930.method534(arg3, arg8, arg1, arg2);
                                continue;
                            }
                            if (class260.field3283 == var12.field3715) {
                                class452.method2539(var12.field3714, 2132, class386.field4930, var18, var12.field3617, var19);
                                class559.field7782[var17] = true;
                                class386.field4930.method534(arg3, arg8, arg1, arg2);
                                continue;
                            }
                            if (class725.field10113 == var12.field3715) {
                                if (!class556.field7748 && !class553.field7720) {
                                    continue;
                                }
                                int var33 = var12.field3617 + var18;
                                if (class676.field9448) {
                                    if (arg10) {
                                        class236.method1478(-119, var14, var15, var13, var16);
                                    } else {
                                        class7.method35(var16, var14, 6462, var13, var15);
                                    }
                                }
                                int var34 = var19 + 15;
                                if (class556.field7748) {
                                    int var35 = -256;
                                    if (class5.field54 < 20) {
                                        var35 = -65536;
                                    }
                                    class372.field4774.method559(var35, (byte) -107, "Fps:" + class5.field54, var33, -1, var34);
                                    var34 += 15;
                                    Runtime var36 = Runtime.getRuntime();
                                    int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                    int var38 = -256;
                                    if (var37 > 98304) {
                                        var38 = -65536;
                                        if (class721.field10035) {
                                            class229.method1461((byte) -108);
                                            for (int var39 = 0; var39 < 10; var39++) {
                                                System.gc();
                                            }
                                            var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                            if (var37 > 65536) {
                                                class283.method1695(-83, 4, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                            }
                                        }
                                    }
                                    class372.field4774.method559(var38, (byte) -113, "Mem:" + var37 + "k", var33, -1, var34);
                                    var34 += 15;
                                    class372.field4774.method559(-256, (byte) -122, "In:" + class298.field3913 + "B/s Out:" + class63.field881 + "B/s", var33, -1, var34);
                                    var34 += 15;
                                    int var40 = class386.field4930.method537() / 1024;
                                    class372.field4774.method559(var40 <= 65536 ? -256 : -65536, (byte) -78, "Offheap:" + var40 + "k", var33, -1, var34);
                                    var34 += 15;
                                    int var41 = 0;
                                    int var42 = 0;
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < 37; var44++) {
                                        if (class523.field7321[var44] != null) {
                                            var41 += class523.field7321[var44].method2702((byte) -93);
                                            var42 += class523.field7321[var44].method2696((byte) -77);
                                            var43 += class523.field7321[var44].method2700(0);
                                        }
                                    }
                                    int var45 = var43 * 100 / var41;
                                    int var46 = var42 * 10000 / var41;
                                    String var47 = "Cache:" + class669.method3759((byte) 98, 2, 0, (long) var46, true) + "% (" + var45 + "%)";
                                    class164.field2272.method559(-256, (byte) -126, var47, var33, -1, var34);
                                    var34 += 12;
                                }
                                if (field1356 > 0) {
                                    class164.field2272.method559(-256, (byte) -114, "Particles: " + class611.field8466 + " / " + field1356, var33, -1, var34);
                                }
                                var34 += 12;
                                if (class553.field7720) {
                                    class164.field2272.method559(-256, (byte) -104, "Polys: " + class386.field4930.method440() + " Models: " + class386.field4930.method470(), var33, -1, var34);
                                    var34 += 12;
                                    class164.field2272.method559(-256, (byte) -85, "Ls: " + class582.field8144 + " La: " + class708.field9841 + " NPC: " + class437.field5822 + " Pl: " + class88.field1227, var33, -1, var34);
                                    class663.method3738((byte) 109);
                                    var34 += 12;
                                }
                                class559.field7782[var17] = true;
                                continue;
                            }
                        }
                        if (var12.field3655 == 0) {
                            if (class524.field7329 == var12.field3715 && class386.field4930.method442()) {
                                class386.field4930.method472(var18, var19, var12.field3617, var12.field3714);
                            }
                            method781(var19 - var12.field3737, var28, var29, var30, (byte) -9, var18 - var12.field3628, var12.field3696, var17, var27, arg9, arg10);
                            if (var12.field3779 != null) {
                                method781(var19 - var12.field3737, var28, var29, var30, (byte) -9, var18 - var12.field3628, var12.field3696, var17, var27, var12.field3779, arg10);
                            }
                            class491 var48 = (class491) class290.field3804.method1160((long) var12.field3696, 123);
                            if (var48 != null) {
                                class708.method3967(0, var30, var48.field6978, var29, var18, var27, var19, var28, var17);
                            }
                            if (class524.field7329 == var12.field3715 && class386.field4930.method442()) {
                                class386.field4930.method522();
                            }
                            class386.field4930.method534(arg3, arg8, arg1, arg2);
                        }
                        if (class374.field4798[var17] || class52.field739 > 1) {
                            if (var12.field3655 == 3) {
                                if (var22 == 0) {
                                    if (var12.field3707) {
                                        class386.field4930.method528(var18, var19, var12.field3617, var12.field3714, var12.field3671, 0);
                                    } else {
                                        class386.field4930.method460(var18, var19, var12.field3617, var12.field3714, var12.field3671, 0);
                                    }
                                } else if (var12.field3707) {
                                    class386.field4930.method528(var18, var19, var12.field3617, var12.field3714, 255 - (var22 & 0xFF) << 24 | var12.field3671 & 0xFFFFFF, 1);
                                } else {
                                    class386.field4930.method460(var18, var19, var12.field3617, var12.field3714, 255 - (var22 & 0xFF) << 24 | var12.field3671 & 0xFFFFFF, 1);
                                }
                                if (class676.field9448) {
                                    if (arg10) {
                                        class236.method1478(-112, var14, var15, var13, var16);
                                    } else {
                                        class7.method35(var16, var14, arg4 + 6471, var13, var15);
                                    }
                                }
                            } else if (var12.field3655 == 4) {
                                class61 var49 = var12.method1717(class386.field4930, 29485);
                                if (var49 != null) {
                                    int var50 = var12.field3671;
                                    String var51 = var12.field3732;
                                    if (var12.field3700 != -1) {
                                        class639 var52 = class21.field381.method1583(120, var12.field3700);
                                        var51 = var52.field8881;
                                        if (var51 == null) {
                                            var51 = "null";
                                        }
                                        if ((var52.field8873 == 1 || var12.field3643 != 1) && var12.field3643 != -1) {
                                            var51 = "<col=ff9040>" + var51 + "</col> x" + class232.method1467(var12.field3643, (byte) -123);
                                        }
                                    }
                                    if (var12.field3670 != -1) {
                                        var51 = class578.method3303(true, var12.field3670);
                                        if (var51 == null) {
                                            var51 = "";
                                        }
                                    }
                                    if (class345.field4361 == var12) {
                                        var51 = class454.field6034.method2547(-99, class243.field3143);
                                        var50 = var12.field3671;
                                    }
                                    if (class473.field6357) {
                                        class386.field4930.method525(var18, var19, var18 + var12.field3617, var12.field3714 + var19);
                                    }
                                    var49.method564(var12.field3658, null, class537.field7454, 0, var12.field3749, var12.field3747, -119, var12.field3713 ? 255 - (var22 & 0xFF) << 24 : -1, null, 0, var18, var50 | 255 - (var22 & 0xFF) << 24, var12.field3714, var12.field3617, var12.field3729, var51, var19);
                                    if (class473.field6357) {
                                        class386.field4930.method534(arg3, arg8, arg1, arg2);
                                    }
                                    if (var51.trim().length() > 0) {
                                        if (!class473.field6357) {
                                            class274 var53 = class229.method1459(var12.field3626, class386.field4930, -2);
                                            int var54 = var53.method1618(var12.field3617, class537.field7454, var51, 46);
                                            int var55 = var53.method1622(class537.field7454, var51, var12.field3617, 120, var12.field3658);
                                            if (class676.field9448) {
                                                if (arg10) {
                                                    class236.method1478(73, var19, var18 + var54, var18, var19 + var55);
                                                } else {
                                                    class7.method35(var19 + var55, var19, arg4 ^ 0xFFFFE6C9, var18, var18 + var54);
                                                }
                                            }
                                        } else if (class676.field9448) {
                                            if (arg10) {
                                                class236.method1478(126, var14, var15, var13, var16);
                                            } else {
                                                class7.method35(var16, var14, 6462, var13, var15);
                                            }
                                        }
                                    }
                                } else if (class594.field8303) {
                                    class207.method1332((byte) -127, var12);
                                }
                            } else if (var12.field3655 == 5) {
                                if (var12.field3758 < 0) {
                                    class481 var57;
                                    if (var12.field3700 != -1) {
                                        class470 var56 = var12.field3726 ? class380.field4847.field10081 : null;
                                        var57 = class21.field381.method1586(var12.field3700, class386.field4930, var56, var12.field3643, var12.field3769 | 0xFF000000, var12.field3634, var12.field3651, 372);
                                    } else if (var12.field3670 == -1) {
                                        var57 = var12.method1718(class386.field4930, (byte) 70);
                                    } else {
                                        var57 = class415.method2327(var12.field3670, class386.field4930, 0);
                                    }
                                    if (var57 != null) {
                                        int var58 = var57.method142();
                                        int var59 = var57.method149();
                                        int var60 = (var12.field3671 == 0 ? 16777215 : var12.field3671 & 0xFFFFFF) | 255 - (var22 & 0xFF) << 24;
                                        if (var12.field3672) {
                                            class386.field4930.method525(var18, var19, var18 + var12.field3617, var12.field3714 + var19);
                                            if (var12.field3645 != 0) {
                                                int var61 = (var58 + var12.field3617 - 1) / var58;
                                                int var62 = (var12.field3714 + var59 - 1) / var59;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var12.field3671 == 0) {
                                                            var57.method2765((float) var58 / 2.0F + (float) (var18 + (var58 * var63)), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field3645);
                                                        } else {
                                                            var57.method2758((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field3645, 0, var60, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var12.field3671 == 0 && var22 == 0) {
                                                var57.method2766(var18, var19, var12.field3617, var12.field3714);
                                            } else {
                                                var57.method138(var18, var19, var12.field3617, var12.field3714, 0, var60, 1);
                                            }
                                            class386.field4930.method534(arg3, arg8, arg1, arg2);
                                        } else if (var12.field3671 == 0 && var22 == 0) {
                                            if (var12.field3645 != 0) {
                                                var57.method2765((float) var12.field3617 / 2.0F + (float) var18, (float) var12.field3714 / 2.0F + (float) var19, var12.field3617 * 4096 / var58, var12.field3645);
                                            } else if (var12.field3617 == var58 && var12.field3714 == var59) {
                                                var57.method2759(var18, var19);
                                            } else {
                                                var57.method2760(var18, var19, var12.field3617, var12.field3714);
                                            }
                                        } else if (var12.field3645 != 0) {
                                            var57.method2758((float) var12.field3617 / 2.0F + (float) var18, (float) var12.field3714 / 2.0F + (float) var19, var12.field3617 * 4096 / var58, var12.field3645, 0, var60, 1);
                                        } else if (var12.field3617 == var58 && var12.field3714 == var59) {
                                            var57.method148(var18, var19, 0, var60, 1);
                                        } else {
                                            var57.method2761(var18, var19, var12.field3617, var12.field3714, 0, var60, 1);
                                        }
                                    } else if (class594.field8303) {
                                        class207.method1332((byte) -92, var12);
                                    }
                                } else {
                                    var12.method1719(class623.field8571, (byte) -120, class507.field7153).method2337(0, var12.field3617, var18, var12.field3694 << 3, 0, var12.field3714, arg4 + 1102, class386.field4930, var12.field3698 << 3, var19);
                                }
                                if (class676.field9448) {
                                    if (arg10) {
                                        class236.method1478(-104, var14, var15, var13, var16);
                                    } else {
                                        class7.method35(var16, var14, 6462, var13, var15);
                                    }
                                }
                            } else if (var12.field3655 == 6) {
                                class682.method3838(-200);
                                Object var65 = null;
                                class474 var66 = null;
                                int var67 = 0;
                                if (var12.field3700 != -1) {
                                    class639 var75 = class21.field381.method1583(arg4 ^ 0x30, var12.field3700);
                                    if (var75 != null) {
                                        class639 var76 = var75.method3585(-123, var12.field3643);
                                        class56 var77 = var12.field3648 == -1 ? null : class66.field941.method1299((byte) -106, var12.field3648);
                                        class470 var78 = var12.field3726 ? class380.field4847.field10081 : null;
                                        var66 = var76.method3586(var77, class386.field4930, var78, var12.field3776, 255, var12.field3616, 1, 2048, var12.field3748);
                                        if (var66 == null) {
                                            class207.method1332((byte) -100, var12);
                                        } else {
                                            var67 = -var66.method286() >> 1;
                                        }
                                    }
                                } else if (var12.field3689 == 5) {
                                    int var72 = var12.field3755;
                                    if (var72 >= 0 && var72 < 2048) {
                                        class724 var73 = class5.field49[var72];
                                        class56 var74 = var12.field3648 == -1 ? null : class66.field941.method1299((byte) -107, var12.field3648);
                                        if (var73 != null && (class54.field755 == var72 || class638.method3578(var73.field10062, arg4 ^ 0xFFFFE329) == var12.field3668)) {
                                            var66 = var73.field10081.method2677(class679.field9486, 2048, 0, var12.field3616, var74, var12.field3776, null, class300.field3941, 0, class729.field10151, null, 12, -1, class66.field941, null, 0, class21.field381, class516.field7236, class386.field4930, var12.field3748, true);
                                        }
                                    }
                                } else if (var12.field3689 == 8 || var12.field3689 == 9) {
                                    class515 var69 = class534.method3075(false, var12.field3755, -115);
                                    class56 var70 = var12.field3648 == -1 ? null : class66.field941.method1299((byte) -79, var12.field3648);
                                    if (var69 != null) {
                                        class470 var71 = var12.field3726 ? class380.field4847.field10081 : null;
                                        var66 = var69.method2995(2048, var12.field3616, class386.field4930, var71, var12.field3689 == 9, true, var12.field3776, var12.field3748, var12.field3668, var70);
                                    }
                                } else if (var12.field3648 == -1) {
                                    var66 = var12.method1723((class552) var65, class66.field941, class380.field4847.field10081, class516.field7236, -1, class729.field10151, class21.field381, class679.field9486, 0, 1, null, 2048, -1, class300.field3941, class386.field4930);
                                    if (var66 == null && class594.field8303) {
                                        class207.method1332((byte) -93, var12);
                                    }
                                } else {
                                    class56 var68 = class66.field941.method1299((byte) -80, var12.field3648);
                                    var66 = var12.method1723((class552) var65, class66.field941, class380.field4847.field10081, class516.field7236, var12.field3776, class729.field10151, class21.field381, class679.field9486, var12.field3748, 1, var68, 2048, var12.field3616, class300.field3941, class386.field4930);
                                    if (var66 == null && class594.field8303) {
                                        class207.method1332((byte) -88, var12);
                                    }
                                }
                                if (var66 != null) {
                                    int var79;
                                    if (var12.field3680 > 0) {
                                        var79 = (var12.field3617 << 9) / var12.field3680;
                                    } else {
                                        var79 = 512;
                                    }
                                    int var80;
                                    if (var12.field3690 > 0) {
                                        var80 = (var12.field3714 << 9) / var12.field3690;
                                    } else {
                                        var80 = 512;
                                    }
                                    int var81 = var12.field3617 / 2 + var18;
                                    int var82 = var12.field3714 / 2 + var19;
                                    if (!var12.field3757) {
                                        var82 += var12.field3644 * var80 >> 9;
                                        var81 += var12.field3767 * var79 >> 9;
                                    }
                                    class651.field9066.method595();
                                    class386.field4930.method505(class651.field9066);
                                    class386.field4930.method437(var81, var82, var79, var80);
                                    class386.field4930.method512();
                                    if (var12.field3612) {
                                        class386.field4930.method504(false);
                                    }
                                    if (var12.field3757) {
                                        class14.field271.method590(var12.field3765);
                                        class14.field271.method594(var12.field3708);
                                        class14.field271.method608(var12.field3657);
                                        class14.field271.method600(var12.field3767, var12.field3644, var12.field3724);
                                    } else {
                                        int var83 = (var12.field3693 << 2) * class16.field320[var12.field3765 << 3] >> 14;
                                        int var84 = (var12.field3693 << 2) * class16.field322[var12.field3765 << 3] >> 14;
                                        class14.field271.method610(-var12.field3657 << 3);
                                        class14.field271.method594(var12.field3708 << 3);
                                        class14.field271.method600(var12.field3722 << 2, (var12.field3659 << 2) + var67 + var83, (var12.field3659 << 2) + var84);
                                        class14.field271.method601(var12.field3765 << 3);
                                    }
                                    var12.method1711(class463.field6224, var66, class14.field271, class386.field4930, (byte) -122);
                                    if (class473.field6357) {
                                        class386.field4930.method525(var18, var19, var12.field3617 + var18, var12.field3714 + var19);
                                    }
                                    if (var12.field3757) {
                                        if (var12.field3741) {
                                            var66.method255(class14.field271, null, var12.field3693, 1);
                                        } else {
                                            var66.method250(class14.field271, null, 1);
                                            if (var12.field3751 != null) {
                                                class386.field4930.method455(var12.field3751.method2979());
                                            }
                                        }
                                    } else if (var12.field3741) {
                                        var66.method255(class14.field271, null, var12.field3693 << 2, 1);
                                    } else {
                                        var66.method250(class14.field271, null, 1);
                                        if (var12.field3751 != null) {
                                            class386.field4930.method455(var12.field3751.method2979());
                                        }
                                    }
                                    if (class473.field6357) {
                                        class386.field4930.method534(arg3, arg8, arg1, arg2);
                                    }
                                    if (var12.field3612) {
                                        class386.field4930.method504(true);
                                    }
                                }
                                if (class676.field9448) {
                                    if (arg10) {
                                        class236.method1478(-104, var14, var15, var13, var16);
                                    } else {
                                        class7.method35(var16, var14, 6462, var13, var15);
                                    }
                                }
                            } else if (var12.field3655 == 9) {
                                int var85;
                                int var86;
                                int var87;
                                int var88;
                                if (var12.field3619) {
                                    var85 = var19 + var12.field3714;
                                    var87 = var18;
                                    var86 = var12.field3617 + var18;
                                    var88 = var19;
                                } else {
                                    var85 = var19;
                                    var86 = var12.field3617 + var18;
                                    var87 = var18;
                                    var88 = var12.field3714 + var19;
                                }
                                if (var12.field3718 == 1) {
                                    class386.field4930.method438(var87, var85, var86, var88, var12.field3671, 0);
                                } else {
                                    class386.field4930.method475(var87, var85, var86, var88, var12.field3671, var12.field3718, 0);
                                }
                                if (class676.field9448) {
                                    if (arg10) {
                                        class236.method1478(arg4 ^ 0x7C, var14, var15, var13, var16);
                                    } else {
                                        class7.method35(var16, var14, 6462, var13, var15);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "(I)V", line = 1068)
    public static final void method782(int arg0) {
        field1351++;
        if (class623.field8573) {
            return;
        }
        if (arg0 != 0) {
            method779((byte) 63);
        }
        class749.field10471 += (24.0F - class749.field10471) / 2.0F;
        class366.field4718 = true;
        class623.field8573 = true;
    }
}
