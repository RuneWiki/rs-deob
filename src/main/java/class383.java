import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class383 extends class61 {

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    public int field5504 = (int) (class97.method664((byte) -50) / 1000L);

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "S")
    public short field5502;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "Ljava/lang/String;")
    public String field5497;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "[Lcia;")
    public static class490[] field5501;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V", line = 4)
    public static final void method2402(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class280.field4072 = true;
        class518.field7229 = class441.field6132.method1481() > 0;
        class369.field5216 = arg15;
        class103.field1410 = arg1 >> class371.field5241;
        class307.field4314 = arg3 >> class371.field5241;
        class49.field730 = arg1;
        class76.field1113 = arg3;
        class552.field7672 = arg2;
        class334.field4716 = class103.field1410 - class218.field2854;
        if (class334.field4716 < 0) {
            class252.field3695 = -class334.field4716;
            class334.field4716 = 0;
        } else {
            class252.field3695 = 0;
        }
        class621.field8318 = class307.field4314 - class218.field2854;
        if (class621.field8318 < 0) {
            class141.field1997 = -class621.field8318;
            class621.field8318 = 0;
        } else {
            class141.field1997 = 0;
        }
        class273.field3964 = class218.field2854 + class103.field1410;
        if (class273.field3964 > class61.field877) {
            class273.field3964 = class61.field877;
        }
        class719.field10004 = class307.field4314 + class218.field2854;
        if (class719.field10004 > class713.field9959) {
            class719.field10004 = class713.field9959;
        }
        boolean[][] var19 = class417.field5900;
        boolean[][] var20 = class679.field9426;
        if (class369.field5216) {
            for (int var21 = 0; var21 < class218.field2854 + class218.field2854 + 2; var21++) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class218.field2854 + class218.field2854 + 2; var24++) {
                    if (var24 > 1) {
                        class391.field5626[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class103.field1410 + var21 - class218.field2854;
                    int var26 = class307.field4314 + var24 - class218.field2854;
                    if (var25 >= 0 && var26 >= 0 && var25 < class61.field877 && var26 < class713.field9959) {
                        int var27 = var25 << class371.field5241;
                        int var28 = var26 << class371.field5241;
                        int var29 = class550.field7649[class550.field7649.length - 1].method2171(var26, var25, 31) - (0x3E8 << class371.field5241 - 7);
                        int var30 = class371.field5240 == null ? class550.field7649[0].method2171(var26, var25, 31) + class368.field5213 : class371.field5240[0].method2171(var26, var25, 31) + class368.field5213;
                        var23 = arg16 >= 0 ? class441.field6132.method1488(var27, var29, var28, var27, var30, var28, arg16) : class441.field6132.method1548(var27, var29, var28, var27, var30, var28);
                        class679.field9426[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class679.field9426[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class391.field5626[var24 - 1] & class391.field5626[var24] & var22 & var23;
                        class417.field5900[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class391.field5626[class218.field2854 + class218.field2854] = var22;
                class391.field5626[class218.field2854 + class218.field2854 + 1] = var23;
            }
            if (arg16 >= 0) {
                class280.field4072 = false;
            } else {
                class431.field6024 = arg5;
                class571.field7883 = arg6;
                class562.field7807 = arg7;
                class240.field3582 = arg8;
                class356.field5119 = arg9;
                class115.method734(arg10, (byte) 126, class441.field6132);
            }
        } else {
            if (class13.field120 == null) {
                class13.field120 = new boolean[class61.field877 + class61.field877 + 1][class713.field9959 + class61.field877 + 1];
            }
            for (int var32 = 0; var32 < class13.field120.length; var32++) {
                for (int var42 = 0; var42 < class13.field120[0].length; var42++) {
                    class13.field120[var32][var42] = true;
                }
            }
            class679.field9426 = class13.field120;
            class417.field5900 = class13.field120;
            class334.field4716 = 0;
            class621.field8318 = 0;
            class273.field3964 = class61.field877;
            class719.field10004 = class713.field9959;
            class280.field4072 = false;
        }
        class437.method2691(class441.field6132, (byte) 25);
        if (!class269.field3931.field5702) {
            class244 var33 = class269.field3931.field5701;
            for (class3 var34 = (class3) var33.method1638(false); var34 != null; var34 = (class3) var33.method1645(0)) {
                var34.method3012(118);
                class300.method1978(0, var34);
            }
        }
        if (class518.field7229) {
            for (int var35 = 0; var35 < class486.field6796; var35++) {
                class532.field7385[var35].method826(arg0, false, arg14);
            }
        }
        if (class520.field7248) {
            class680.field9460 = class441.field6132.method1407();
            class441.field6132.method1454(class549.field7629);
            int var36 = (class549.field7629[2] - class549.field7629[0]) / class515.field7130;
            for (int var37 = 0; var37 < class515.field7130 - 1; var37++) {
                class454.field6293[var37] = (var37 + 1) * var36 + class159.field2223[var37];
            }
            for (int var38 = 0; var38 < class280.field4069.length; var38++) {
                class280.field4069[var38].method633();
            }
        }
        if (class319.field4435 != null) {
            if (class520.field7248) {
                class260.method1758(0);
            }
            class732.method4078(true);
            class441.field6132.method1411(-1, 1583160, 40, 127);
            class299.method1972(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class520.field7248) {
                class619.method3494();
            }
            class441.field6132.method1531();
            class732.method4078(false);
        }
        class299.method1972(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class520.field7248) {
            for (int var39 = 0; var39 < class370.field5229; var39++) {
                class507.field7051[var39] = class172.field2387[var39];
            }
            class260.method1758(0);
            for (int var40 = 0; var40 < class280.field4069.length; var40++) {
                class280.field4069[var40].method633();
            }
        }
        if (class520.field7248) {
            class619.method3494();
            for (int var41 = 0; var41 < class370.field5229; var41++) {
                class172.field2387[var41] = class507.field7051[var41];
            }
            if (class265.field3895 == 2) {
                int var10002;
                if (class667.field9196[0] < class667.field9196[1]) {
                    if (class454.field6293[0] + class159.field2223[0] > class549.field7629[0]) {
                        var10002 = class159.field2223[0]++;
                    }
                } else if (class667.field9196[0] > class667.field9196[1] && class454.field6293[0] + class159.field2223[0] < class549.field7629[2]) {
                    var10002 = class159.field2223[0]--;
                }
            }
        }
        if (!class369.field5216) {
            class417.field5900 = var19;
            class679.field9426 = var20;
        }
        class577.method3367();
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[[[BI[I[I[IIZII[I[IBIZII)V", line = 283)
    public static final void method2403(int arg0, int arg1, byte[][][] arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int arg7, boolean arg8, int arg9, int arg10, int[] arg11, int[] arg12, byte arg13, int arg14, boolean arg15, int arg16, int arg17) {
        field5500++;
        if (class521.field7260 == -1) {
            return;
        }
        int[] var18 = class496.field6948.method1407();
        int var19 = var18[0];
        int var20 = var18[1];
        int var21 = var18[2];
        int var22 = var18[3];
        int var23 = var21;
        int var24 = var22;
        if (class521.field7260 == 1) {
            var24 = (int) ((double) class196.field2637 * (double) var22 / (double) class239.field3574);
            var23 = (int) ((double) class196.field2637 * (double) var21 / (double) class239.field3574);
        }
        if (arg9 <= 31) {
            return;
        }
        if (!class569.field7870) {
            if (class521.field7260 == 1) {
                class206.method1239(true);
            }
            int var25 = arg0 - class702.field9786;
            int var26 = arg17 - class81.field1173;
            int var27 = arg1 - class280.field4070;
            int var28 = (int) (((double) var27 * class207.field2713 + (double) var25 * class589.field8026 + (double) var26 * class481.field6710) * (double) var23 / (double) arg10);
            int var29 = (int) (((double) var27 * class30.field362 + (double) var25 * class229.field3098 + (double) var26 * class302.field4270) * (double) var24 / (double) arg10);
            double var30 = (double) var27 * class24.field310 + (double) var25 * class758.field10571 + (double) var26 * class95.field1306;
            int var32 = class436.field6091 + var28 - class445.field6178;
            int var33 = class758.field10576 + var29 - class752.field10372;
            int var34 = class462.field6420 + var32;
            int var35 = var33 + class196.field2637;
            if (!(var32 < 0 || var33 < 0 || class559.field7774 < var34 || var35 > class239.field3574) || class521.field7260 == 2) {
                class154.field2107 = var32;
                if (class521.field7260 == 2) {
                    class667.field9219 = -var30;
                }
                class26.field325 = var33;
            } else if (var34 > 0 && var35 > 0 && var32 < class559.field7774 && class239.field3574 > var33) {
                int var36 = var32 - class436.field6091;
                int var37 = var33 - class758.field10576;
                int var38 = 0;
                int var39 = 0;
                int var40 = 0;
                int var41 = 0;
                double var42 = 0.0D;
                if (class521.field7260 == 0) {
                    var42 = class667.field9219 + var30;
                    var39 = var37;
                    var38 = var36;
                } else if (class521.field7260 == 1) {
                    var40 = var36 / class494.field6919;
                    var41 = var37 / class319.field4441;
                    var38 = class494.field6919 * var40;
                    var39 = class319.field4441 * var41;
                    var42 = (class667.field9219 + var30) * (double) (var36 * var38 + var37 * var39) / (double) (var36 * var36 + var37 * var37);
                }
                double var44 = -var42;
                int var46 = 0;
                int var47 = 0;
                int var48 = 0;
                int var49 = 0;
                int var50 = 0;
                int var51 = 0;
                int var52;
                int var53;
                int var54;
                int var55;
                if (var38 >= 0) {
                    var52 = 0;
                    var53 = class559.field7774 - var38;
                    var54 = var53;
                    if (class521.field7260 == 1) {
                        var48 = class557.field7745 - var40;
                        var50 = var40;
                    }
                    var55 = var38;
                } else {
                    var54 = 0;
                    var53 = class559.field7774 + var38;
                    var52 = -var38;
                    if (class521.field7260 == 1) {
                        var48 = 0;
                        var50 = -var40;
                    }
                    var55 = var52;
                }
                int var56;
                int var57;
                int var58;
                int var59;
                int var60;
                int var61;
                if (var39 >= 0) {
                    var56 = 0;
                    var57 = class239.field3574 - var39;
                    var58 = var39;
                    if (class521.field7260 == 1) {
                        var46 = class17.field172 - var41;
                        var49 = 0;
                        var47 = var41;
                        var51 = var46;
                    }
                    var59 = var57;
                    var60 = 0;
                    var61 = var57;
                } else {
                    var56 = -var39;
                    var57 = class239.field3574 + var39;
                    var61 = 0;
                    var58 = var56;
                    if (class521.field7260 == 1) {
                        var46 = 0;
                        var47 = -var41;
                        var49 = var47;
                        var51 = class17.field172 + var41;
                    }
                    var59 = var57;
                    var60 = var56;
                }
                class244 var62 = class72.field1094.field5701;
                for (class3 var63 = (class3) var62.method1638(false); var63 != null; var63 = (class3) var62.method1645(0)) {
                    class574[] var69 = var63.field18;
                    boolean var70 = true;
                    for (int var71 = 0; var71 < var69.length; var71++) {
                        class574 var72 = var69[var71];
                        int var73 = var72.field7911;
                        int var74 = var72.field7909;
                        int var75 = var72.field7913;
                        int var76 = var72.field7912;
                        int var77;
                        var72.field7909 = var77 = var74 - var39;
                        int var78;
                        var72.field7913 = var78 = var75 - var38;
                        int var79 = var72.field7914;
                        int var80;
                        var72.field7912 = var80 = var76 - var39;
                        int var81;
                        var72.field7911 = var81 = var73 - var38;
                        if (var70) {
                            int var82 = (var81 < var78 ? var81 : var78) - var79;
                            if (class559.field7774 >= var82) {
                                int var83 = (var77 >= var80 ? var80 : var77) - var79;
                                if (class239.field3574 >= var83) {
                                    int var84 = (var78 > var81 ? var78 : var81) + var79;
                                    if (var84 >= 0) {
                                        int var85 = var79 + (var77 >= var80 ? var77 : var80);
                                        if (var85 >= 0) {
                                            var70 = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var70) {
                        var63.method3012(109);
                        class300.method1978(0, var63);
                    }
                }
                if (class521.field7260 == 0) {
                    class496.field6948.method325(class382.field5486);
                }
                class496.field6948.method264(-var38, -var39);
                class496.field6948.method308(var52, var56, var53, var57, var44);
                class523.method3114(0, class667.field9219 + var44);
                class263.field3858 = class667.field9219 + var44;
                if (class521.field7260 == 1) {
                    class385.field5531 = var19 - class445.field6178 - var38;
                    class312.field4338 = var24;
                    class84.field1199 = var23;
                    class124.field1715 = var20 - class752.field10372 - var39;
                    class496.field6948.method1421(class385.field5531, class124.field1715, class84.field1199, class312.field4338);
                } else {
                    class84.field1199 = var23;
                    class124.field1715 = class758.field10576 + var20 - class752.field10372 - var39;
                    class385.field5531 = var19 + class436.field6091 - class445.field6178 - var38;
                    class312.field4338 = var24;
                    class496.field6948.method1421(class385.field5531, class124.field1715, class84.field1199, class312.field4338);
                }
                class442.method2707(class72.field1094);
                if (var58 > 0) {
                    class496.field6948.method1544(0, var61, class559.field7774, var58 + var61);
                    class496.field6948.method346();
                    class496.field6948.method273(class121.field1601);
                    method2402(arg16, arg0, arg17, arg1, arg2, arg4, arg5, arg11, arg12, arg6, arg3, arg13, arg7, arg14, arg15, arg8, arg10, 1, false);
                }
                if (var55 > 0) {
                    class496.field6948.method1544(var54, var60, var54 + var55, var59 + var60);
                    class496.field6948.method346();
                    class496.field6948.method273(class121.field1601);
                    method2402(arg16, arg0, arg17, arg1, arg2, arg4, arg5, arg11, arg12, arg6, arg3, arg13, arg7, arg14, arg15, arg8, arg10, 1, false);
                }
                class496.field6948.method1437();
                class338.method2149();
                if (class521.field7260 == 0) {
                    class496.field6948.method302();
                }
                class667.field9219 += var44;
                class752.field10372 += var39;
                class445.field6178 += var38;
                class154.field2107 = class436.field6091 + var28 - class445.field6178;
                class26.field325 = class758.field10576 + var29 - class752.field10372;
                if (class521.field7260 == 1) {
                    class517.field7217 += var41;
                    class172.field2389 += var40;
                    for (int var64 = 0; var64 < class17.field172; var64++) {
                        int var65 = class328.method2109((byte) 115, class17.field172, var64 + class517.field7217) * class557.field7745;
                        for (int var66 = 0; var66 < class557.field7745; var66++) {
                            int var67 = var65 + class328.method2109((byte) 81, class557.field7745, class172.field2389 + var66);
                            boolean var68 = var46 <= var64 && var46 + var47 > var64 || var49 <= var64 && var64 < (var49 + var51) && var66 >= var48 && var66 < var48 + var50;
                            class634.field8539[var67].method26(class494.field6919 * var66, class319.field4441 * var64, class494.field6919, class319.field4441, 0, 0, var68, true);
                        }
                    }
                }
            } else {
                class569.field7870 = true;
            }
        }
        if (class569.field7870) {
            class752.field10372 = 0;
            class154.field2107 = class436.field6091;
            class81.field1173 = arg17;
            class667.field9219 = 0.0D;
            class702.field9786 = arg0;
            class445.field6178 = 0;
            class280.field4070 = arg1;
            class26.field325 = class758.field10576;
            if (class521.field7260 == 0) {
                class496.field6948.method325(class382.field5486);
            }
            class496.field6948.method1437();
            class496.field6948.method346();
            class496.field6948.method273(class121.field1601);
            class515.field7152.method875(class702.field9786, class81.field1173, class280.field4070, class344.field4893, class375.field5277, class653.field8743);
            class496.field6948.method1444(class515.field7152);
            if (class521.field7260 == 1) {
                class312.field4338 = var24;
                class84.field1199 = var23;
                class385.field5531 = var19;
                class124.field1715 = var20;
                class496.field6948.method1421(class385.field5531, class124.field1715, class84.field1199, class312.field4338);
            } else {
                class124.field1715 = var20 + class758.field10576;
                class84.field1199 = var23;
                class385.field5531 = class436.field6091 + var19;
                class312.field4338 = var24;
                class496.field6948.method1421(class385.field5531, class124.field1715, class84.field1199, class312.field4338);
            }
            class263.field3858 = 0.0D;
            class72.field1094.method2473((byte) 61);
            class442.method2707(class72.field1094);
            method2402(arg16, arg0, arg17, arg1, arg2, arg4, arg5, arg11, arg12, arg6, arg3, arg13, arg7, arg14, arg15, arg8, arg10, 1, false);
            class338.method2149();
            class569.field7870 = false;
            if (class521.field7260 == 0) {
                class496.field6948.method302();
            }
            if (class521.field7260 == 1) {
                class596.method3421((byte) -67);
            }
        }
        if (class521.field7260 == 0) {
            class382.field5486.method25(class154.field2107, class26.field325, class462.field6420, class196.field2637, 0, 0, true, true);
        }
        class114.field1525++;
        class523.method3114(0, class667.field9219);
        class291.field4182 = class667.field9219;
        if (class521.field7260 == 0 || class521.field7260 == 2) {
            if (class521.field7260 == 2) {
                class496.field6948.method273(class121.field1601);
                class496.field6948.method346();
            }
            class371.field5242 = var23;
            class244.field3620 = var24;
            class30.field364 = class758.field10576 + var20 - class752.field10372 - class26.field325;
            class229.field3083 = class436.field6091 + var19 - class154.field2107 - class445.field6178;
            class496.field6948.method1421(class229.field3083, class30.field364, class371.field5242, class244.field3620);
        } else if (class521.field7260 == 1) {
            class244.field3620 = var24;
            class371.field5242 = var23;
            class30.field364 = var20 - class752.field10372;
            class229.field3083 = var19 - class445.field6178;
            class496.field6948.method1421(class229.field3083, class30.field364, class371.field5242, class244.field3620);
            class496.field6948.method1544(class154.field2107, class26.field325, class462.field6420 + class154.field2107, class26.field325 + class196.field2637);
        }
        method2402(arg16, arg0, arg17, arg1, arg2, arg4, arg5, arg11, arg12, arg6, arg3, arg13, arg7, arg14, arg15, arg8, arg10, class521.field7260 == 2 ? 0 : 2, class521.field7260 == 1);
        class496.field6948.method1437();
        class496.field6948.method1421(var19, var20, var21, var22);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Z", line = 726)
    public static final boolean method2404(int arg0, int arg1, int arg2) {
        int var3 = 77 / ((arg0 + 16) / 60);
        field5496++;
        return class525.method3122(6, arg1, arg2) & class329.method2115(arg1, arg2, 0);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)I", line = 739)
    public static final int method2405(int arg0, int arg1, int arg2) {
        if (arg1 > -24) {
            return -13;
        } else {
            field5498++;
            return arg0 == 1 || arg0 == 3 ? class67.field1031[arg2 & 0x3] : class184.field2527[arg2 & 0x3];
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V", line = 754)
    public static void method2406(int arg0) {
        field5501 = null;
        if (arg0 != 24116) {
            method2407((byte) -1, 126, null, 78);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI[BI)[B", line = 765)
    public static final byte[] method2407(byte arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 >= -57) {
            return null;
        }
        field5499++;
        byte[] var4;
        if (arg1 > 0) {
            var4 = new byte[arg3];
            for (int var5 = 0; var5 < arg3; var5++) {
                var4[var5] = arg2[arg1 + var5];
            }
        } else {
            var4 = arg2;
        }
        class615 var6 = new class615();
        var6.method3487((byte) 26);
        var6.method3483(var4, (byte) 21, (long) (arg3 * 8));
        byte[] var7 = new byte[64];
        var6.method3485(0, 124, var7);
        return var7;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 802)
    public class383(String arg0, int arg1) {
        this.field5502 = (short) arg1;
        this.field5497 = arg0;
    }
}
