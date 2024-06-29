import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class599 extends class337 {

    @OriginalMember(owner = "client!bfa", name = "m", descriptor = "J")
    public long field7616;

    @OriginalMember(owner = "client!bfa", name = "o", descriptor = "Lwu;")
    public static class582 field7618 = new class582("", 18);

    @OriginalMember(owner = "client!bfa", name = "r", descriptor = "Lrn;")
    public static class633 field7621 = new class633(7, 7);

    @OriginalMember(owner = "client!bfa", name = "l", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!bfa", name = "n", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!bfa", name = "p", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!bfa", name = "q", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!bfa", name = "s", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIZIIIIII)V")
    public static final void method3235(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!arg2) {
            method3239(34, 85, null, null, -96);
        }
        field7619++;
        class505.field6464[class269.field3552++] = new class318(arg6, arg4, arg3, arg1, arg1, arg3, arg7, arg0, arg0, arg7, arg8, arg8, arg5, arg5);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IILha;I)V")
    public static final void method3236(int arg0, int arg1, class570 arg2, int arg3) {
        field7617++;
        if (arg3 < 0 || arg1 < 0 || class648.field8276 == 0 || class88.field1219 == 0) {
            return;
        }
        class465 var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        if (class602.field7657) {
            class784.method4301(false, 0);
            var4 = arg2.method880();
            int[] var5 = arg2.method916();
            var6 = var5[2];
            var7 = var5[3];
            var8 = var5[0];
            var9 = var5[1];
            var10 = arg3 + class759.method4128(5, false);
            var11 = class517.method2860(false, false) + arg1;
        } else {
            arg2.method967(class756.field10306, class695.field8911, class648.field8276, class88.field1219);
            var6 = class648.field8276;
            var8 = class756.field10306;
            var7 = class88.field1219;
            var9 = class695.field8911;
            arg2.method915(class299.field3789, class400.field5291, class648.field8276, class88.field1219);
            var4 = arg2.method994();
            var4.method465(class273.field3582, class32.field323, class33.field341, class687.field8845, class131.field1741, class651.field8308);
            var10 = arg3;
            var11 = arg1;
            arg2.method991(var4);
        }
        if (var6 == 0) {
            var6 = 1;
        }
        class351.method2027((byte) -111, true);
        if (var7 == 0) {
            var7 = 1;
        }
        if (class383.field4790 != null && (!class47.field549 || (class610.field7710 & 0x40) != 0)) {
            int var12 = -1;
            int var13 = -1;
            int var14 = arg2.method951();
            int var15 = arg2.method985();
            int var16;
            int var17;
            int var18;
            int var19;
            if (class653.field8360) {
                var17 = var16 = (var11 - var9) * class628.field7974 / var7;
                var19 = var18 = (var10 - var8) * class628.field7974 / var6;
            } else {
                var19 = (var10 - var8) * var14 / var6;
                var17 = (var11 - var9) * var14 / var7;
                var16 = (var11 - var9) * var15 / var7;
                var18 = (var10 - var8) * var15 / var6;
            }
            int[] var20 = new int[] { var19, var17, var14 };
            var4.method447(var20);
            int[] var21 = new int[] { var18, var16, var15 };
            var4.method447(var21);
            float var22 = class185.method1306((float) var21[0], (float) var20[2], (float) var20[0], 4, (byte) 125, (float) var21[1], (float) var21[2], (float) var20[1]);
            if (var22 > 0.0F) {
                int var23 = var21[0] - var20[0];
                int var24 = var21[2] - var20[2];
                int var25 = (int) ((float) var23 * var22 + (float) var20[0]);
                int var26 = (int) ((float) var24 * var22 + (float) var20[2]);
                var12 = (class422.field5564.method190((byte) -70) - 1 << 8) + var25 >> 9;
                var13 = var26 + (class422.field5564.method190((byte) -128) - 1 << 8) >> 9;
                byte var27 = class422.field5564.field2895;
                if (var27 < 3 && (class410.field5439[1][var25 >> 9][var26 >> 9] & 0x2) != 0) {
                    int var87 = var27 + 1;
                }
            }
            if (var12 != -1 && var13 != -1) {
                if (class47.field549 && (class610.field7710 & 0x40) != 0) {
                    class391 var28 = class752.method4075(class170.field2260, (byte) -80, class777.field10600);
                    if (var28 == null) {
                        class38.method230((byte) 47);
                    } else {
                        class259.method1655(class726.field9525, false, -1, class559.field7106, arg0 ^ 0xFFFFC480, true, 0L, var13, 5, (long) (var13 | var12 << 0), var12, " ->", true);
                    }
                } else {
                    if (class253.field3438) {
                        class259.method1655(class659.field8571.method3589(class496.field6338, arg0 ^ 0x7BB3), false, -1, -1, 6070, true, 0L, var13, 4, (long) (var13 | var12 << 0), var12, "", true);
                    }
                    class321.field3981++;
                    class259.method1655(class494.field6324, false, -1, class67.field882, arg0 ^ 0xFFFFC480, true, 0L, var13, 16, (long) (var13 | var12 << 0), var12, "", true);
                }
            }
        }
        if (class602.field7657) {
            class679.method3652(-1);
        }
        if (arg0 != -11466) {
            field7621 = null;
        }
        for (int var29 = 0; var29 < (class602.field7657 ? 2 : 1); var29++) {
            boolean var30 = var29 == 0;
            class780 var31 = var30 ? class108.field1468 : class734.field9967;
            int var32 = arg3;
            int var33 = arg1;
            if (class602.field7657) {
                class784.method4301(var30, 0);
                var32 = arg3 + class759.method4128(5, var30);
                var33 = arg1 + class517.method2860(var30, false);
            }
            class151 var34 = var31.field10644;
            for (class266 var35 = (class266) var34.method857(-89); var35 != null; var35 = (class266) var34.method864(true)) {
                if ((class542.field6809 || class422.field5564.field2895 == var35.field3528.field2895) && var35.method1678(arg2, arg0 ^ 0xFFFFB7DB, var32, var33)) {
                    boolean var36 = false;
                    boolean var37 = false;
                    int var38;
                    int var39;
                    if ((var35.field3528 instanceof class620)) {
                        var38 = ((class620) var35.field3528).field7844;
                        var39 = ((class620) var35.field3528).field7852;
                    } else {
                        var38 = var35.field3528.field2900 >> 9;
                        var39 = var35.field3528.field2896 >> 9;
                    }
                    if (var35.field3528 instanceof class33) {
                        class33 var40 = (class33) var35.field3528;
                        int var41 = var40.method190((byte) -82);
                        if ((var41 & 0x1) == 0 && (var40.field2896 & 0x1FF) == 0 && (var40.field2900 & 0x1FF) == 0 || (var41 & 0x1) == 1 && (var40.field2896 & 0x1FF) == 256 && (var40.field2900 & 0x1FF) == 256) {
                            int var42 = var40.field2896 - (var40.method190((byte) -127) - 1 << 8);
                            int var43 = var40.field2900 - (var40.method190((byte) -112) - 1 << 8);
                            for (int var44 = 0; var44 < class349.field4271; var44++) {
                                class232 var51 = (class232) class444.field5811.method2616((long) class88.field1224[var44], (byte) -98);
                                if (var51 != null) {
                                    class727 var52 = var51.field3125;
                                    if (class693.field8900 != var52.field4754 && var52.field4688) {
                                        int var53 = var52.field2896 - (var52.field9545.field3314 - 1 << 8);
                                        int var54 = var52.field2900 - (var52.field9545.field3314 - 1 << 8);
                                        if (var42 <= var53 && var52.field9545.field3314 <= var40.method190((byte) -118) - (var53 - var42 >> 9) && var43 <= var54 && var52.field9545.field3314 <= var40.method190((byte) 77) - (var54 - var43 >> 9)) {
                                            class323.method1874(25, var52, class422.field5564.field2895 != var35.field3528.field2895);
                                            var52.field4754 = class693.field8900;
                                        }
                                    }
                                }
                            }
                            int var45 = class20.field189;
                            int[] var46 = class503.field6451;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class33 var48 = class263.field3508[var46[var47]];
                                if (var48 != null && class693.field8900 != var48.field4754 && var40 != var48 && var48.field4688) {
                                    int var49 = var48.field2896 - (var48.method190((byte) -58) - 1 << 8);
                                    int var50 = var48.field2900 - (var48.method190((byte) -93) - 1 << 8);
                                    if (var42 <= var49 && var48.method190((byte) -121) <= (var40.method190((byte) 90) - (var49 - var42 >> 9)) && var50 >= var43 && var48.method190((byte) 115) <= var40.method190((byte) -37) - (var50 - var43 >> 9)) {
                                        class582.method3115(var48, -124, class422.field5564.field2895 != var35.field3528.field2895);
                                        var48.field4754 = class693.field8900;
                                    }
                                }
                            }
                        }
                        if (class693.field8900 == var40.field4754) {
                            continue;
                        }
                        class582.method3115(var40, -124, class422.field5564.field2895 != var35.field3528.field2895);
                        var40.field4754 = class693.field8900;
                    }
                    if (var35.field3528 instanceof class727) {
                        class727 var55 = (class727) var35.field3528;
                        if (var55.field9545 != null) {
                            if ((var55.field9545.field3314 & 0x1) == 0 && (var55.field2896 & 0x1FF) == 0 && (var55.field2900 & 0x1FF) == 0 || (var55.field9545.field3314 & 0x1) == 1 && (var55.field2896 & 0x1FF) == 256 && (var55.field2900 & 0x1FF) == 256) {
                                int var56 = var55.field2896 - (var55.field9545.field3314 - 1 << 8);
                                int var57 = var55.field2900 - (var55.field9545.field3314 - 1 << 8);
                                for (int var58 = 0; var58 < class349.field4271; var58++) {
                                    class232 var65 = (class232) class444.field5811.method2616((long) class88.field1224[var58], (byte) 60);
                                    if (var65 != null) {
                                        class727 var66 = var65.field3125;
                                        if (class693.field8900 != var66.field4754 && var55 != var66 && var66.field4688) {
                                            int var67 = var66.field2896 - (var66.field9545.field3314 - 1 << 8);
                                            int var68 = var66.field2900 - (var66.field9545.field3314 - 1 << 8);
                                            if (var56 <= var67 && var66.field9545.field3314 <= (var55.field9545.field3314 - (var67 - var56 >> 9)) && var68 >= var57 && var66.field9545.field3314 <= (var55.field9545.field3314 - (var68 - var57 >> 9))) {
                                                class323.method1874(25, var66, class422.field5564.field2895 != var35.field3528.field2895);
                                                var66.field4754 = class693.field8900;
                                            }
                                        }
                                    }
                                }
                                int var59 = class20.field189;
                                int[] var60 = class503.field6451;
                                for (int var61 = 0; var61 < var59; var61++) {
                                    class33 var62 = class263.field3508[var60[var61]];
                                    if (var62 != null && class693.field8900 != var62.field4754 && var62.field4688) {
                                        int var63 = var62.field2896 - (var62.method190((byte) -99) - 1 << 8);
                                        int var64 = var62.field2900 - (var62.method190((byte) -32) - 1 << 8);
                                        if (var63 >= var56 && var62.method190((byte) -24) <= var55.field9545.field3314 - (var63 - var56 >> 9) && var57 <= var64 && var62.method190((byte) 113) <= var55.field9545.field3314 - (var64 - var57 >> 9)) {
                                            class582.method3115(var62, arg0 + 11342, class422.field5564.field2895 != var35.field3528.field2895);
                                            var62.field4754 = class693.field8900;
                                        }
                                    }
                                }
                            }
                            if (class693.field8900 == var55.field4754) {
                                continue;
                            }
                            class323.method1874(25, var55, class422.field5564.field2895 != var35.field3528.field2895);
                            var55.field4754 = class693.field8900;
                        }
                    }
                    if (var35.field3528 instanceof class449) {
                        int var69 = var39 + class714.field9407;
                        int var70 = class240.field3293 + var38;
                        class89 var71 = (class89) class407.field5401.method2616((long) (var70 << 14 | var35.field3528.field2895 << 28 | var69), (byte) -102);
                        if (var71 != null) {
                            int var72 = 0;
                            for (class64 var73 = (class64) var71.field1228.method3604(arg0 ^ 0x2CA8); var73 != null; var73 = (class64) var71.field1228.method3603((byte) -107)) {
                                class48 var74 = class640.field8189.method705(var73.field838, arg0 - 1);
                                if (class47.field549 && class422.field5564.field2895 == var35.field3528.field2895) {
                                    class558 var75 = class4.field55 == -1 ? null : class761.field10377.method4101(class4.field55, 11);
                                    if ((class610.field7710 & 0x1) != 0 && (var75 == null || var74.method295(class4.field55, (byte) -70, var75.field7096) != var75.field7096)) {
                                        class230.field3096++;
                                        class259.method1655(class726.field9525, false, -1, class559.field7106, 6070, false, (long) var73.field838, var38, 21, (long) var72, var39, class130.field1732 + " -> <col=ff9040>" + var74.field624, true);
                                    }
                                }
                                if (class422.field5564.field2895 == var35.field3528.field2895) {
                                    String[] var76 = var74.field564;
                                    for (int var77 = 4; var77 >= 0; var77--) {
                                        if (var76 != null && var76[var77] != null) {
                                            byte var78 = 0;
                                            int var79 = class299.field3794;
                                            if (var77 == 0) {
                                                var78 = 8;
                                            }
                                            if (var77 == 1) {
                                                var78 = 51;
                                            }
                                            if (var77 == 2) {
                                                var78 = 48;
                                            }
                                            if (var77 == 3) {
                                                var78 = 30;
                                            }
                                            if (var77 == 4) {
                                                var78 = 20;
                                            }
                                            if (var74.field625 == var77) {
                                                var79 = var74.field622;
                                            }
                                            if (var74.field563 == var77) {
                                                var79 = var74.field577;
                                            }
                                            class259.method1655(var76[var77], false, -1, var79, arg0 ^ 0xFFFFC480, false, (long) var73.field838, var38, var78, (long) var72, var39, "<col=ff9040>" + var74.field624, true);
                                            class474.field6161++;
                                        }
                                    }
                                }
                                class400.field5288++;
                                class259.method1655(class659.field8566.method3589(class496.field6338, -22395), class422.field5564.field2895 != var35.field3528.field2895, -1, class81.field1146, 6070, false, (long) var73.field838, var38, 1003, (long) var72, var39, "<col=ff9040>" + var74.field624, true);
                                var72++;
                            }
                        }
                    }
                    if (var35.field3528 instanceof class274) {
                        class274 var80 = (class274) var35.field3528;
                        class773 var81 = class390.field4983.method4292(var80.method1010(-6546), (byte) -127);
                        if (var81.field10536 != null) {
                            var81 = var81.method4213(class381.field4705, arg0 ^ 0x2CA7);
                        }
                        if (var81 != null) {
                            if (class47.field549 && class422.field5564.field2895 == var35.field3528.field2895) {
                                class558 var82 = class4.field55 == -1 ? null : class761.field10377.method4101(class4.field55, 11);
                                if ((class610.field7710 & 0x4) != 0 && (var82 == null || var81.method4211((byte) -41, var82.field7096, class4.field55) != var82.field7096)) {
                                    class337.field4105++;
                                    class259.method1655(class726.field9525, false, -1, class559.field7106, 6070, false, class700.method3799(var39, (byte) 110, var38, var80), var38, 53, (long) var80.hashCode(), var39, class130.field1732 + " -> <col=00ffff>" + var81.field10487, true);
                                }
                            }
                            if (class422.field5564.field2895 == var35.field3528.field2895) {
                                String[] var83 = var81.field10529;
                                if (var83 != null) {
                                    for (int var84 = 4; var84 >= 0; var84--) {
                                        if (var83[var84] != null) {
                                            short var85 = 0;
                                            if (var84 == 0) {
                                                var85 = 15;
                                            }
                                            int var86 = class299.field3794;
                                            if (var84 == 1) {
                                                var85 = 46;
                                            }
                                            if (var84 == 2) {
                                                var85 = 23;
                                            }
                                            if (var84 == 3) {
                                                var85 = 13;
                                            }
                                            if (var84 == 4) {
                                                var85 = 1002;
                                            }
                                            if (var81.field10541 == var84) {
                                                var86 = var81.field10528;
                                            }
                                            if (var81.field10540 == var84) {
                                                var86 = var81.field10465;
                                            }
                                            class699.field9264++;
                                            class259.method1655(var83[var84], false, -1, var86, 6070, false, class700.method3799(var39, (byte) 111, var38, var80), var38, var85, (long) var80.hashCode(), var39, "<col=00ffff>" + var81.field10487, true);
                                        }
                                    }
                                }
                                class549.field6884++;
                                class259.method1655(class659.field8566.method3589(class496.field6338, -22395), class422.field5564.field2895 != var35.field3528.field2895, -1, class81.field1146, arg0 ^ 0xFFFFC480, false, (long) var81.field10531, var38, 1009, (long) var80.hashCode(), var39, "<col=00ffff>" + var81.field10487, true);
                            }
                        }
                    }
                }
            }
            if (class602.field7657) {
                class679.method3652(-1);
            }
        }
        class351.method2027((byte) -125, false);
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "()V")
    public class599() {
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(J)V")
    public class599(long arg0) {
        this.field7616 = arg0;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V")
    public static final void method3237(int arg0) {
        field7620++;
        if (arg0 != 583371395) {
            return;
        }
        if (class217.method1424(false, class332.field4052) || class176.method1123(-122, class332.field4052)) {
            class389.method2247(5000, class148.field1890 >> 12, class97.field1309 >> 12, (byte) -123);
        } else {
            int var1 = class422.field5564.field4767[0] >> 3;
            int var2 = class422.field5564.field4758[0] >> 3;
            if (var1 >= 0 && var1 < class240.field3280 >> 3 && var2 >= 0 && var2 < (class276.field3602 >> 3)) {
                class389.method2247(5000, var2, var1, (byte) -96);
            } else {
                class389.method2247(0, class276.field3602 >> 4, class240.field3280 >> 4, (byte) -105);
            }
        }
        class748.method4065(6175);
        class177.method1136(-585072574);
        class458.method2589((byte) 103);
        class620.method3317((byte) -122);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Z)V")
    public static void method3238(boolean arg0) {
        field7618 = null;
        field7621 = null;
        if (!arg0) {
            method3238(false);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(II[S[Ljava/lang/String;I)V")
    public static final void method3239(int arg0, int arg1, short[] arg2, String[] arg3, int arg4) {
        if (arg4 < arg0) {
            int var5 = (arg4 + arg0) / 2;
            int var6 = arg4;
            String var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            for (int var9 = arg4; var9 < arg0; var9++) {
                if (var7 == null || arg3[var9] != null && arg3[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var8;
            method3239(var6 - 1, -1, arg2, arg3, arg4);
            method3239(arg0, -1, arg2, arg3, var6 + 1);
        }
        if (arg1 == -1) {
            field7615++;
        }
    }
}
