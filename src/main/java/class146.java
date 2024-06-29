import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class146 {

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field3632 = 0;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Lfc;")
    private static class39 field3634 = class90.method774("scroll:", -93);

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Lfc;")
    public static class39 field3639 = class90.method774("Bitte benutzen Sie eine andere Welt)3", -94);

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Lfc;")
    public static class39 field3642 = class90.method774(" zuerst von Ihrer Ignorieren)2Liste(Q", -108);

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "[I")
    public static int[] field3633 = new int[4000];

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field3647 = 0;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "Lfc;")
    public static class39 field3648 = field3634;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Lfc;")
    public static class39 field3640 = class90.method774("Texturen geladen)3", -99);

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Lfc;")
    public static class39 field3649 = field3634;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "Lfc;")
    public static class39 field3645 = class90.method774("Sie haben gerade eine andere Welt verlassen)3", -107);

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "Lfc;")
    public static class39 field3651 = class90.method774("An:", -125);

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "[Lb;")
    public static class8[] field3643;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "[[B")
    public static byte[][] field3641;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III[Lob;BIIIIIII)V", line = 5)
    public static final void method1172(int arg0, int arg1, int arg2, class99[] arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field3637++;
        if (arg11 < arg1 || arg0 > arg9 || arg7 <= arg11 || arg6 <= arg9) {
            return;
        }
        int var12 = 0;
        if (arg4 <= 123) {
            field3642 = null;
        }
        while (arg3.length > var12) {
            class99 var13 = arg3[var12];
            if (var13 != null && var13.field2348 == arg2 && (!var13.field2389 || !class44.method515(var13, (byte) -119))) {
                label445: {
                    int var14 = var13.field2450 + arg1 - arg5;
                    int var15 = var13.field2368 + arg0 - arg8;
                    if ((var13.field2409 >= 0 || var13.field2371 != 0) && arg11 >= var14 && var15 <= arg9 && arg11 < var14 + var13.field2357 && arg9 < var15 + var13.field2381) {
                        if (var13.field2409 >= 0) {
                            class100.field2465 = var13.field2409;
                        } else {
                            class100.field2465 = var12;
                        }
                    }
                    if (var13.field2452 == 8 && arg11 >= var14 && arg9 >= var15 && var13.field2357 + var14 > arg11 && var15 + var13.field2381 > arg9) {
                        class1.field5 = var12;
                    }
                    if (var13.field2452 == 0) {
                        if (!var13.field2389 && class44.method515(var13, (byte) -119) && !class109.method951(var12, arg10, (byte) -2)) {
                            break label445;
                        }
                        method1172(var15, var14, var13.field2406, arg3, (byte) 126, var13.field2429, var13.field2381 + var15, var13.field2357 + var14, var13.field2447, arg9, arg10, arg11);
                        if (var13.field2416 != null) {
                            method1172(var15, var14, var13.field2406, var13.field2416, (byte) 125, var13.field2429, var13.field2381 + var15, var14 - -var13.field2357, var13.field2447, arg9, arg10, arg11);
                        }
                        if (var13.field2381 < var13.field2361 && !var13.field2389) {
                            class43.method512(arg9, var13.field2357 + var14, true, var13, arg11, var15, var13.field2361, var13.field2381, arg10);
                        }
                        if (!var13.field2389) {
                            break label445;
                        }
                    }
                    if (var13.field2334 == 1 && arg11 >= var14 && arg9 >= var15 && arg11 < var13.field2357 + var14 && var15 + var13.field2381 > arg9) {
                        boolean var16 = false;
                        if (var13.field2399 != 0) {
                            var16 = class121.method1038(122, var13);
                        }
                        if (!var16) {
                            class36.field996++;
                            class92.method786(0, 58, 0, 44, var13.field2406, class107.field2693, var13.field2438);
                        }
                    }
                    if (var13.field2334 == 2 && !class97.field2313 && var14 <= arg11 && var15 <= arg9 && var13.field2357 + var14 > arg11 && arg9 < var13.field2381 + var15) {
                        class39 var17 = class128.method1063(-32738, var13);
                        if (var17 != null) {
                            class50.field1249++;
                            class92.method786(-1, 45, 0, 2, var13.field2406, class137.method1111(new class39[] { class118.field3093, var13.field2413 }, (byte) -111), var17);
                        }
                    }
                    if (var13.field2334 == 3 && arg11 >= var14 && arg9 >= var15 && var13.field2357 + var14 > arg11 && arg9 < var13.field2381 + var15) {
                        class127.field3229++;
                        byte var18;
                        if (arg10 == 3) {
                            var18 = 28;
                        } else {
                            var18 = 46;
                        }
                        class92.method786(0, var18, 0, 70, var13.field2406, class107.field2693, class1.field8);
                    }
                    if (var13.field2334 == 4 && arg11 >= var14 && arg9 >= var15 && var13.field2357 + var14 > arg11 && arg9 < var13.field2381 + var15) {
                        class92.method786(0, 12, 0, 123, var13.field2406, class107.field2693, var13.field2438);
                        class126.field3201++;
                    }
                    if (var13.field2334 == 5 && var14 <= arg11 && var15 <= arg9 && arg11 < var13.field2357 + var14 && var13.field2381 + var15 > arg9) {
                        class140.field3527++;
                        class92.method786(0, 7, 0, 6, var13.field2406, class107.field2693, var13.field2438);
                    }
                    if (var13.field2334 == 6 && class37.field1010 == -1 && var14 <= arg11 && arg9 >= var15 && var14 + var13.field2357 > arg11 && var13.field2381 + var15 > arg9) {
                        class104.field2618++;
                        class92.method786(-1, 15, 0, 11, var13.field2406, class107.field2693, var13.field2438);
                    }
                    if (var13.field2452 == 2) {
                        int var19 = 0;
                        for (int var20 = 0; var20 < var13.field2381; var20++) {
                            for (int var21 = 0; var21 < var13.field2357; var21++) {
                                int var22 = (var13.field2421 + 32) * var21 + var14;
                                int var23 = (var13.field2420 + 32) * var20 + var15;
                                if (var19 < 20) {
                                    var22 += var13.field2355[var19];
                                    var23 += var13.field2442[var19];
                                }
                                if (arg11 >= var22 && arg9 >= var23 && var22 + 32 > arg11 && arg9 < var23 + 32) {
                                    class39.field1053 = var19;
                                    class75.field1716 = var13.field2406;
                                    if (var13.field2340[var19] > 0) {
                                        class109 var24 = class37.method421(true, var13.field2340[var19] - 1);
                                        if (class92.field2146 == 1 && class104.method928(class89.method768(var13, 76), -23)) {
                                            if (class107.field2689 != var13.field2406 || class88.field2049 != var19) {
                                                class86.field1924++;
                                                class92.method786(var19, 9, var24.field2781, 70, var13.field2406, class137.method1111(new class39[] { class76.field1741, class56.field1403, var24.field2787 }, (byte) -86), class50.field1267);
                                            }
                                        } else if (!class97.field2313 || !class104.method928(class89.method768(var13, 111), 116)) {
                                            class39[] var25 = var24.field2764;
                                            if (class124.field3192) {
                                                var25 = class99.method824(var25, (byte) -19);
                                            }
                                            if (class104.method928(class89.method768(var13, -95), 126)) {
                                                for (int var26 = 4; var26 >= 3; var26--) {
                                                    if (var25 != null && var25[var26] != null) {
                                                        class45.field1225++;
                                                        byte var27;
                                                        if (var26 == 3) {
                                                            var27 = 25;
                                                        } else {
                                                            var27 = 42;
                                                        }
                                                        class92.method786(var19, var27, var24.field2781, 44, var13.field2406, class137.method1111(new class39[] { class99.field2382, var24.field2787 }, (byte) -121), var25[var26]);
                                                    } else if (var26 == 4) {
                                                        class92.method786(var19, 42, var24.field2781, 98, var13.field2406, class137.method1111(new class39[] { class99.field2382, var24.field2787 }, (byte) 95), class26.field748);
                                                        class9.field249++;
                                                    }
                                                }
                                            }
                                            if (class12.method149(-70, class89.method768(var13, 101))) {
                                                class92.method786(var19, 32, var24.field2781, 107, var13.field2406, class137.method1111(new class39[] { class99.field2382, var24.field2787 }, (byte) -42), class50.field1267);
                                                class87.field1973++;
                                            }
                                            class131.field3293++;
                                            if (class104.method928(class89.method768(var13, -89), 122) && var25 != null) {
                                                for (int var28 = 2; var28 >= 0; var28--) {
                                                    if (var25[var28] != null) {
                                                        byte var29 = 0;
                                                        class116.field3029++;
                                                        if (var28 == 0) {
                                                            var29 = 51;
                                                        }
                                                        if (var28 == 1) {
                                                            var29 = 41;
                                                        }
                                                        if (var28 == 2) {
                                                            var29 = 22;
                                                        }
                                                        class92.method786(var19, var29, var24.field2781, 49, var13.field2406, class137.method1111(new class39[] { class99.field2382, var24.field2787 }, (byte) -88), var25[var28]);
                                                    }
                                                }
                                            }
                                            class39[] var30 = var13.field2390;
                                            if (class124.field3192) {
                                                var30 = class99.method824(var30, (byte) -19);
                                            }
                                            if (var30 != null) {
                                                for (int var31 = 4; var31 >= 0; var31--) {
                                                    if (var30[var31] != null) {
                                                        class86.field1941++;
                                                        byte var32 = 0;
                                                        if (var31 == 0) {
                                                            var32 = 18;
                                                        }
                                                        if (var31 == 1) {
                                                            var32 = 47;
                                                        }
                                                        if (var31 == 2) {
                                                            var32 = 38;
                                                        }
                                                        if (var31 == 3) {
                                                            var32 = 40;
                                                        }
                                                        if (var31 == 4) {
                                                            var32 = 44;
                                                        }
                                                        class92.method786(var19, var32, var24.field2781, 70, var13.field2406, class137.method1111(new class39[] { class99.field2382, var24.field2787 }, (byte) -123), var30[var31]);
                                                    }
                                                }
                                            }
                                            class92.method786(var19, 1006, var24.field2781, 114, var13.field2406, class137.method1111(new class39[] { class99.field2382, var24.field2787 }, (byte) -102), class42.field1151);
                                        } else if ((class109.field2790 & 0x10) == 16) {
                                            class92.method786(var19, 14, var24.field2781, 113, var13.field2406, class137.method1111(new class39[] { class103.field2591, class56.field1403, var24.field2787 }, (byte) -58), class96.field2232);
                                            class128.field3249++;
                                        }
                                    }
                                }
                                var19++;
                            }
                        }
                    }
                    if (var13.field2389) {
                        if (class97.field2313) {
                            if (class98.method816(123, class89.method768(var13, -55)) && (class109.field2790 & 0x20) == 32 && var14 <= arg11 && var15 <= arg9 && arg11 < var14 + var13.field2357 && var13.field2381 + var15 > arg9) {
                                class39.field1082++;
                                class92.method786(var13.field2412, 50, 0, 123, var13.field2406, class137.method1111(new class39[] { class103.field2591, class63.field1557, var13.field2402 }, (byte) 104), class96.field2232);
                            }
                        } else if (arg11 >= var14 && var15 <= arg9 && arg11 < var13.field2357 + var14 && arg9 < var13.field2381 + var15) {
                            for (int var33 = 9; var33 >= 5; var33--) {
                                class39 var37 = class63.method622(false, var13, var33);
                                if (var37 != null) {
                                    class92.method786(var13.field2412, 35, var33 + 1, 60, var13.field2406, var13.field2402, var37);
                                    class87.field1979++;
                                }
                            }
                            class39 var34 = class128.method1063(-32738, var13);
                            if (var34 != null) {
                                class50.field1249++;
                                class92.method786(var13.field2412, 45, 0, 25, var13.field2406, var13.field2402, var34);
                            }
                            for (int var35 = 4; var35 >= 0; var35--) {
                                class39 var36 = class63.method622(false, var13, var35);
                                if (var36 != null) {
                                    class92.method786(var13.field2412, 35, var35 + 1, 21, var13.field2406, var13.field2402, var36);
                                    class87.field1979++;
                                }
                            }
                            if (client.method235(class89.method768(var13, 115), -9)) {
                                class104.field2618++;
                                class92.method786(var13.field2412, 15, 0, 31, var13.field2406, class107.field2693, var13.field2438);
                            }
                        }
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)Z", line = 434)
    public static final boolean method1173(int arg0) {
        field3635++;
        try {
            int var1 = 120 % ((-arg0 - 69) / 55);
            if (class101.field2547 == 2) {
                if (class115.field3018 == null) {
                    class115.field3018 = class64.method626(class61.field1497, class142.field3562, class75.field1723);
                    if (class115.field3018 == null) {
                        return false;
                    }
                }
                if (class142.field3567 == null) {
                    class142.field3567 = new class26(class30.field839, class44.field1205);
                }
                if (class103.field2582.method173(class61.field1500, false, 22050, class142.field3567, class115.field3018)) {
                    class103.field2582.method165(128);
                    class103.field2582.method187((byte) -125, class150.field3711);
                    class103.field2582.method192(class115.field3018, class139.field3513, -92);
                    class142.field3567 = null;
                    class115.field3018 = null;
                    class61.field1497 = null;
                    class101.field2547 = 0;
                    return true;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            class103.field2582.method161(-16257);
            class142.field3567 = null;
            class61.field1497 = null;
            class115.field3018 = null;
            class101.field2547 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 489)
    public static final void method1174(int arg0) {
        if (class13.field343 == 1) {
            if (class34.field889 >= 539 && class34.field889 <= 573 && class26.field758 >= 169 && class26.field758 < 205 && class25.field740[0] != -1) {
                class142.field3564 = true;
                class104.field2638 = true;
                class104.field2633 = 0;
            }
            if (class34.field889 >= 569 && class34.field889 <= 599 && class26.field758 >= 168 && class26.field758 < 205 && class25.field740[1] != -1) {
                class104.field2638 = true;
                class142.field3564 = true;
                class104.field2633 = 1;
            }
            if (class34.field889 >= 597 && class34.field889 <= 627 && class26.field758 >= 168 && class26.field758 < 205 && class25.field740[2] != -1) {
                class104.field2638 = true;
                class104.field2633 = 2;
                class142.field3564 = true;
            }
            if (class34.field889 >= 625 && class34.field889 <= 669 && class26.field758 >= 168 && class26.field758 < 203 && class25.field740[3] != -1) {
                class104.field2638 = true;
                class104.field2633 = 3;
                class142.field3564 = true;
            }
            if (class34.field889 >= 666 && class34.field889 <= 696 && class26.field758 >= 168 && class26.field758 < 205 && class25.field740[4] != -1) {
                class142.field3564 = true;
                class104.field2633 = 4;
                class104.field2638 = true;
            }
            if (class34.field889 >= 694 && class34.field889 <= 724 && class26.field758 >= 168 && class26.field758 < 205 && class25.field740[5] != -1) {
                class104.field2638 = true;
                class104.field2633 = 5;
                class142.field3564 = true;
            }
            if (class34.field889 >= 722 && class34.field889 <= 756 && class26.field758 >= 169 && class26.field758 < 205 && class25.field740[6] != -1) {
                class104.field2633 = 6;
                class142.field3564 = true;
                class104.field2638 = true;
            }
            if (class34.field889 >= 540 && class34.field889 <= 574 && class26.field758 >= 466 && class26.field758 < 502 && class25.field740[7] != -1) {
                class142.field3564 = true;
                class104.field2633 = 7;
                class104.field2638 = true;
            }
            if (class34.field889 >= 572 && class34.field889 <= 602 && class26.field758 >= 466 && class26.field758 < 503 && class25.field740[8] != -1) {
                class104.field2633 = 8;
                class104.field2638 = true;
                class142.field3564 = true;
            }
            if (class34.field889 >= 599 && class34.field889 <= 629 && class26.field758 >= 466 && class26.field758 < 503 && class25.field740[9] != -1) {
                class142.field3564 = true;
                class104.field2638 = true;
                class104.field2633 = 9;
            }
            if (class34.field889 >= 627 && class34.field889 <= 671 && class26.field758 >= 467 && class26.field758 < 502 && class25.field740[10] != -1) {
                class104.field2633 = 10;
                class142.field3564 = true;
                class104.field2638 = true;
            }
            if (class34.field889 >= 669 && class34.field889 <= 699 && class26.field758 >= 466 && class26.field758 < 503 && class25.field740[11] != -1) {
                class142.field3564 = true;
                class104.field2638 = true;
                class104.field2633 = 11;
            }
            if (class34.field889 >= 696 && class34.field889 <= 726 && class26.field758 >= 466 && class26.field758 < 503 && class25.field740[12] != -1) {
                class104.field2638 = true;
                class142.field3564 = true;
                class104.field2633 = 12;
            }
            if (class34.field889 >= 724 && class34.field889 <= 758 && class26.field758 >= 466 && class26.field758 < 502 && class25.field740[13] != -1) {
                class142.field3564 = true;
                class104.field2638 = true;
                class104.field2633 = 13;
            }
        }
        int var1 = -11 / ((1 - arg0) / 38);
        field3650++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V", line = 624)
    public static void method1175(boolean arg0) {
        field3648 = null;
        field3645 = null;
        field3641 = null;
        field3649 = null;
        if (arg0) {
            field3651 = null;
        }
        field3639 = null;
        field3633 = null;
        field3643 = null;
        field3640 = null;
        field3651 = null;
        field3642 = null;
        field3634 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lfc;ZLfc;BILoc;)V", line = 644)
    public static final void method1176(class39 arg0, boolean arg1, class39 arg2, byte arg3, int arg4, class100 arg5) {
        field3636++;
        if (arg3 < 31) {
            method1175(false);
        }
        int var6 = arg5.method848(arg2, (byte) -79);
        int var7 = arg5.method834(arg0, false, var6);
        class75.method672(var6, var7, arg1, arg5, false, arg4);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lb;BII)V", line = 661)
    public static final void method1177(class8 arg0, byte arg1, int arg2, int arg3) {
        field3646++;
        if (arg1 <= 50) {
            return;
        }
        int var4 = arg2 * arg2 + arg3 * arg3;
        if (var4 <= 4225 || var4 >= 90000) {
            class121.method1035(arg3, arg0, arg2, (byte) -28);
            return;
        }
        int var5 = class62.field1532 + class26.field753 & 0x7FF;
        int var6 = class40.field1124[var5];
        int var7 = class40.field1114[var5];
        int var8 = var6 * 256 / (class153.field3759 + 256);
        int var9 = var7 * 256 / (class153.field3759 + 256);
        int var10 = arg3 * var9 - arg2 * var8 >> 16;
        int var11 = arg2 * var9 + arg3 * var8 >> 16;
        double var12 = Math.atan2((double) var11, (double) var10);
        int var14 = (int) (Math.sin(var12) * 63.0D);
        int var15 = (int) (Math.cos(var12) * 57.0D);
        class55.field1388.method103(var14 + 94 - 6, -var15 + 83 + -20, 20, 20, 15, 15, var12, 256);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)I", line = 724)
    public static final int method1178(int arg0, int arg1, int arg2) {
        if (arg1 != -7008) {
            field3634 = null;
        }
        field3644++;
        int var3 = class139.method1144(-1, 4, arg2 + 45365, arg0 - -91923) + (class139.method1144(-1, 2, arg2 + 10294, arg0 + 37821) - 128 >> 1) + (class139.method1144(-1, 1, arg2, arg0) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }
}
