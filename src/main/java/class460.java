import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class460 {

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Ljava/lang/String;")
    public String field6486;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public int field6488;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field6487 = 0;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([II[[[BII[IIIZII[I[IB[IIZI)V")
    public static final void method2724(int[] arg0, int arg1, byte[][][] arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int[] arg11, int[] arg12, byte arg13, int[] arg14, int arg15, boolean arg16, int arg17) {
        field6483++;
        if (class215.field3119 == -1) {
            return;
        }
        int[] var18 = class569.field7823.method188();
        int var19 = var18[0];
        int var20 = var18[1];
        int var21 = var18[2];
        int var22 = var18[3];
        int var23 = var21;
        int var24 = var22;
        if (class215.field3119 == 1) {
            var23 = (int) ((double) class368.field5247 * (double) var21 / (double) class218.field3157);
            var24 = (int) ((double) class368.field5247 * (double) var22 / (double) class218.field3157);
        }
        if (!class30.field778) {
            if (class215.field3119 == 1) {
                class88.method833(0);
            }
            int var25 = arg6 - class232.field3379;
            int var26 = arg9 - class519.field7215;
            int var27 = arg7 - class710.field9631;
            int var28 = (int) (((double) var27 * class384.field5575 + (double) var25 * class34.field856 + (double) var26 * class516.field7186) * (double) var23 / (double) arg17);
            int var29 = (int) (((double) var27 * class749.field10378 + (double) var25 * class72.field1314 + (double) var26 * class67.field1268) * (double) var24 / (double) arg17);
            double var30 = (double) var27 * class30.field777 + (double) var25 * class356.field5062 + (double) var26 * class7.field53;
            int var32 = class2.field20 + var28 - class248.field3596;
            int var33 = class147.field2462 + var29 - class480.field6685;
            int var34 = class241.field3512 + var32;
            int var35 = class368.field5247 + var33;
            if (!(var32 < 0 || var33 < 0 || var34 > class225.field3209 || class218.field3157 < var35) || class215.field3119 == 2) {
                class501.field7002 = var32;
                class512.field7129 = var33;
                if (class215.field3119 == 2) {
                    class500.field6986 = -var30;
                }
            } else if (var34 > 0 && var35 > 0 && var32 < class225.field3209 && class218.field3157 > var33) {
                int var36 = var32 - class2.field20;
                int var37 = var33 - class147.field2462;
                int var38 = 0;
                int var39 = 0;
                int var40 = 0;
                int var41 = 0;
                double var42 = 0.0D;
                if (class215.field3119 == 0) {
                    var42 = class500.field6986 + var30;
                    var38 = var36;
                    var39 = var37;
                } else if (class215.field3119 == 1) {
                    var40 = var36 / class273.field3847;
                    var41 = var37 / class386.field5603;
                    var38 = class273.field3847 * var40;
                    var39 = class386.field5603 * var41;
                    var42 = (class500.field6986 + var30) * (double) (var36 * var38 + var37 * var39) / (double) (var36 * var36 + var37 * var37);
                }
                double var44 = -var42;
                int var46 = 0;
                int var47 = 0;
                int var48 = 0;
                int var49 = 0;
                int var50 = 0;
                int var51;
                int var52;
                int var53;
                int var54;
                if (var38 >= 0) {
                    var51 = 0;
                    var52 = class225.field3209 - var38;
                    if (class215.field3119 == 1) {
                        var50 = var40;
                        var48 = class589.field8025 - var40;
                    }
                    var53 = var38;
                    var54 = var52;
                } else {
                    var52 = class225.field3209 + var38;
                    var54 = 0;
                    var51 = -var38;
                    var53 = var51;
                    if (class215.field3119 == 1) {
                        var50 = -var40;
                        var48 = 0;
                    }
                }
                int var55 = 0;
                int var56;
                int var57;
                int var58;
                int var59;
                int var60;
                int var61;
                if (var39 >= 0) {
                    var56 = class218.field3157 - var39;
                    var57 = 0;
                    var58 = var56;
                    var59 = var39;
                    var60 = 0;
                    if (class215.field3119 == 1) {
                        var49 = 0;
                        var47 = var41;
                        var46 = class391.field5761 - var41;
                        var55 = var46;
                    }
                    var61 = var56;
                } else {
                    var57 = -var39;
                    var58 = 0;
                    var56 = class218.field3157 + var39;
                    var59 = var57;
                    var61 = var56;
                    var60 = var57;
                    if (class215.field3119 == 1) {
                        var47 = -var41;
                        var46 = 0;
                        var55 = class391.field5761 + var41;
                        var49 = var47;
                    }
                }
                class174 var62 = class582.field7972.field6262;
                for (class228 var63 = (class228) var62.method1301(8); var63 != null; var63 = (class228) var62.method1307((byte) 122)) {
                    class317[] var69 = var63.field3313;
                    boolean var70 = true;
                    for (int var71 = 0; var71 < var69.length; var71++) {
                        class317 var72 = var69[var71];
                        int var73 = var72.field4383;
                        int var74 = var72.field4380;
                        int var75 = var72.field4384;
                        int var76 = var72.field4382;
                        int var77 = var72.field4381;
                        int var78;
                        var72.field4382 = var78 = var76 - var39;
                        int var79;
                        var72.field4383 = var79 = var73 - var38;
                        int var80;
                        var72.field4384 = var80 = var75 - var38;
                        int var81;
                        var72.field4380 = var81 = var74 - var39;
                        if (var70) {
                            int var82 = (var80 > var79 ? var79 : var80) - var77;
                            if (class225.field3209 >= var82) {
                                int var83 = (var81 < var78 ? var81 : var78) - var77;
                                if (class218.field3157 >= var83) {
                                    int var84 = (var79 < var80 ? var80 : var79) + var77;
                                    if (var84 >= 0) {
                                        int var85 = (var78 > var81 ? var78 : var81) + var77;
                                        if (var85 >= 0) {
                                            var70 = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var70) {
                        var63.method4018(false);
                        class520.method3028(var63, arg1 ^ 0x4B);
                    }
                }
                if (class215.field3119 == 0) {
                    class569.field7823.method302(class691.field9342);
                }
                class569.field7823.method301(-var38, -var39);
                class569.field7823.method235(var51, var57, var52, var56, var44);
                class184.method1343(true, class500.field6986 + var44);
                class310.field4317 = class500.field6986 + var44;
                if (class215.field3119 == 1) {
                    class731.field9884 = var20 - class480.field6685 - var39;
                    class349.field4874 = var24;
                    class679.field9210 = var19 - var38 - class248.field3596;
                    class700.field9470 = var23;
                    class569.field7823.method179(class679.field9210, class731.field9884, class700.field9470, class349.field4874);
                } else {
                    class700.field9470 = var23;
                    class731.field9884 = var20 - class480.field6685 - (-class147.field2462 - -var39);
                    class679.field9210 = var19 + class2.field20 - class248.field3596 - var38;
                    class349.field4874 = var24;
                    class569.field7823.method179(class679.field9210, class731.field9884, class700.field9470, class349.field4874);
                }
                class609.method3466(class582.field7972);
                if (var59 > 0) {
                    class569.field7823.method303(0, var58, class225.field3209, var58 + var59);
                    class569.field7823.method324();
                    class569.field7823.method220(class377.field5333);
                    class635.method3620(arg15, arg6, arg9, arg7, arg2, arg5, arg11, arg12, arg14, arg0, arg4, arg13, arg10, arg3, arg8, arg16, arg17, 1, false);
                }
                if (var53 > 0) {
                    class569.field7823.method303(var54, var60, var54 + var53, var60 + var61);
                    class569.field7823.method324();
                    class569.field7823.method220(class377.field5333);
                    class635.method3620(arg15, arg6, arg9, arg7, arg2, arg5, arg11, arg12, arg14, arg0, arg4, arg13, arg10, arg3, arg8, arg16, arg17, 1, false);
                }
                class569.field7823.method305();
                class126.method1063();
                if (class215.field3119 == 0) {
                    class569.field7823.method213();
                }
                class480.field6685 += var39;
                class248.field3596 += var38;
                class500.field6986 += var44;
                class512.field7129 = var29 + class147.field2462 - class480.field6685;
                class501.field7002 = class2.field20 + var28 - class248.field3596;
                if (class215.field3119 == 1) {
                    class94.field1656 += var40;
                    class369.field5253 += var41;
                    for (int var64 = 0; var64 < class391.field5761; var64++) {
                        int var65 = class179.method1318(var64 + class369.field5253, (byte) -15, class391.field5761) * class589.field8025;
                        for (int var66 = 0; var66 < class589.field8025; var66++) {
                            int var67 = class179.method1318(class94.field1656 + var66, (byte) -15, class589.field8025) + var65;
                            boolean var68 = var64 >= var46 && var46 + var47 > var64 || var64 >= var49 && (var49 + var55) > var64 && var66 >= var48 && var66 < (var48 + var50);
                            class478.field6662[var67].method2959(class273.field3847 * var66, class386.field5603 * var64, class273.field3847, class386.field5603, 0, 0, var68, true);
                        }
                    }
                }
            } else {
                class30.field778 = true;
            }
        }
        if (class30.field778) {
            class710.field9631 = arg7;
            class519.field7215 = arg9;
            class512.field7129 = class147.field2462;
            class248.field3596 = 0;
            class501.field7002 = class2.field20;
            class232.field3379 = arg6;
            class480.field6685 = 0;
            class500.field6986 = 0.0D;
            if (class215.field3119 == 0) {
                class569.field7823.method302(class691.field9342);
            }
            class569.field7823.method305();
            class569.field7823.method324();
            class569.field7823.method220(class377.field5333);
            class99.field1740.method747(class232.field3379, class519.field7215, class710.field9631, class15.field251, class67.field1267, class581.field7961);
            class569.field7823.method210(class99.field1740);
            if (class215.field3119 == 1) {
                class731.field9884 = var20;
                class679.field9210 = var19;
                class349.field4874 = var24;
                class700.field9470 = var23;
                class569.field7823.method179(class679.field9210, class731.field9884, class700.field9470, class349.field4874);
            } else {
                class679.field9210 = var19 + class2.field20;
                class731.field9884 = class147.field2462 + var20;
                class700.field9470 = var23;
                class349.field4874 = var24;
                class569.field7823.method179(class679.field9210, class731.field9884, class700.field9470, class349.field4874);
            }
            class310.field4317 = 0.0D;
            class582.field7972.method2654((byte) 69);
            class609.method3466(class582.field7972);
            class635.method3620(arg15, arg6, arg9, arg7, arg2, arg5, arg11, arg12, arg14, arg0, arg4, arg13, arg10, arg3, arg8, arg16, arg17, 1, false);
            class126.method1063();
            class30.field778 = false;
            if (class215.field3119 == 0) {
                class569.field7823.method213();
            }
            if (class215.field3119 == 1) {
                class601.method3418(-117);
            }
        }
        if (class215.field3119 == 0) {
            class691.field9342.method2958(class501.field7002, class512.field7129, class241.field3512, class368.field5247, 0, 0, true, true);
        }
        class576.field7925++;
        class184.method1343(true, class500.field6986);
        class121.field2060 = class500.field6986;
        if (class215.field3119 == 0 || class215.field3119 == 2) {
            if (class215.field3119 == 2) {
                class569.field7823.method220(class377.field5333);
                class569.field7823.method324();
            }
            class65.field1252 = var23;
            class417.field6036 = var24;
            class660.field9033 = class2.field20 + var19 - class501.field7002 - class248.field3596;
            class583.field7977 = class147.field2462 + var20 - class480.field6685 - class512.field7129;
            class569.field7823.method179(class660.field9033, class583.field7977, class65.field1252, class417.field6036);
        } else if (class215.field3119 == 1) {
            class65.field1252 = var23;
            class660.field9033 = var19 - class248.field3596;
            class583.field7977 = var20 - class480.field6685;
            class417.field6036 = var24;
            class569.field7823.method179(class660.field9033, class583.field7977, class65.field1252, class417.field6036);
            class569.field7823.method303(class501.field7002, class512.field7129, class501.field7002 + class241.field3512, class512.field7129 + class368.field5247);
        }
        class635.method3620(arg15, arg6, arg9, arg7, arg2, arg5, arg11, arg12, arg14, arg0, arg4, arg13, arg10, arg3, arg8, arg16, arg17, class215.field3119 == 2 ? 0 : 2, class215.field3119 == 1);
        class569.field7823.method305();
        class569.field7823.method179(var19, var20, var21, var22);
        if (arg1 != -2) {
            field6487 = -82;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILkda;)V")
    public static final void method2725(int arg0, class390 arg1) {
        field6484++;
        if (arg1.field5694 != -1) {
            class691 var2 = class456.field6436.method1021(arg1.field5694, 7);
            if (var2 == null || var2.field9327 == null) {
                arg1.field5639 = false;
                arg1.field5694 = -1;
            } else {
                label361: {
                    arg1.field5629++;
                    if (arg1.field5671 < var2.field9327.length && var2.field9357[arg1.field5671] < arg1.field5629) {
                        arg1.field5738++;
                        arg1.field5671++;
                        arg1.field5629 = 1;
                        if (!arg1.field5735) {
                            class190.method1366(arg1, arg1.field5671, var2, -58);
                        }
                    }
                    if (arg1.field5671 >= var2.field9327.length) {
                        arg1.field5671 = 0;
                        arg1.field5629 = 0;
                        if (arg1.field5639) {
                            arg1.field5694 = arg1.method2445((byte) 72).method2498((byte) -16);
                            if (arg1.field5694 == -1) {
                                arg1.field5639 = false;
                                break label361;
                            }
                            var2 = class456.field6436.method1021(arg1.field5694, 7);
                        }
                        if (!arg1.field5735) {
                            class190.method1366(arg1, arg1.field5671, var2, -23);
                        }
                    }
                    arg1.field5738 = arg1.field5671 + 1;
                    if (var2.field9327 == null) {
                        arg1.field5694 = -1;
                        arg1.field5639 = false;
                    } else if (arg1.field5738 >= var2.field9327.length) {
                        arg1.field5738 = 0;
                    }
                }
            }
        }
        if (arg1.field5695 != -1 && class641.field8810 >= arg1.field5651) {
            class654 var3 = class104.field1840.method3016((byte) 90, arg1.field5695);
            int var4 = var3.field8980;
            if (var4 == -1) {
                arg1.field5695 = -1;
            } else {
                label362: {
                    class691 var5 = class456.field6436.method1021(var4, 7);
                    if (var3.field8964) {
                        if (var5.field9352 == 3) {
                            if (arg1.field5748 > 0 && arg1.field5665 <= class641.field8810 && class641.field8810 > arg1.field5726) {
                                arg1.field5695 = -1;
                                break label362;
                            }
                        } else if (var5.field9352 == 1 && arg1.field5748 > 0 && arg1.field5665 <= class641.field8810 && class641.field8810 > arg1.field5726) {
                            arg1.field5651 = class641.field8810 + 1;
                            break label362;
                        }
                    }
                    if (var5 == null || var5.field9327 == null) {
                        arg1.field5695 = -1;
                    } else {
                        if (arg1.field5666 < 0) {
                            arg1.field5666 = 0;
                            if (!arg1.field5735) {
                                class190.method1366(arg1, 0, var5, -89);
                            }
                        }
                        arg1.field5669++;
                        if (arg1.field5666 < var5.field9327.length && var5.field9357[arg1.field5666] < arg1.field5669) {
                            arg1.field5666++;
                            arg1.field5669 = 1;
                            if (!arg1.field5735) {
                                class190.method1366(arg1, arg1.field5666, var5, -17);
                            }
                        }
                        if (var5.field9327.length <= arg1.field5666) {
                            if (var3.field8964) {
                                arg1.field5731++;
                                arg1.field5666 -= var5.field9328;
                                if (var5.field9334 <= arg1.field5731) {
                                    arg1.field5695 = -1;
                                } else if (arg1.field5666 < 0 || arg1.field5666 >= var5.field9327.length) {
                                    arg1.field5695 = -1;
                                } else if (!arg1.field5735) {
                                    class190.method1366(arg1, arg1.field5666, var5, -70);
                                }
                            } else {
                                arg1.field5695 = -1;
                            }
                        }
                        arg1.field5709 = arg1.field5666 + 1;
                        if (var5.field9327.length <= arg1.field5709) {
                            if (var3.field8964) {
                                arg1.field5709 -= var5.field9328;
                                if (arg1.field5731 + 1 >= var5.field9334) {
                                    arg1.field5709 = -1;
                                } else if (arg1.field5709 < 0 || var5.field9327.length <= arg1.field5709) {
                                    arg1.field5709 = -1;
                                }
                            } else {
                                arg1.field5709 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field5717 != -1 && class641.field8810 >= arg1.field5637) {
            class654 var6 = class104.field1840.method3016((byte) 93, arg1.field5717);
            int var7 = var6.field8980;
            if (var7 == -1) {
                arg1.field5717 = -1;
            } else {
                label366: {
                    class691 var8 = class456.field6436.method1021(var7, 7);
                    if (var6.field8964) {
                        if (var8.field9352 == 3) {
                            if (arg1.field5748 > 0 && class641.field8810 >= arg1.field5665 && class641.field8810 > arg1.field5726) {
                                arg1.field5717 = -1;
                                break label366;
                            }
                        } else if (var8.field9352 == 1 && arg1.field5748 > 0 && class641.field8810 >= arg1.field5665 && arg1.field5726 < class641.field8810) {
                            arg1.field5637 = class641.field8810 + 1;
                            break label366;
                        }
                    }
                    if (var8 == null || var8.field9327 == null) {
                        arg1.field5717 = -1;
                    } else {
                        if (arg1.field5650 < 0) {
                            arg1.field5650 = 0;
                            if (!arg1.field5735) {
                                class190.method1366(arg1, 0, var8, -70);
                            }
                        }
                        arg1.field5699++;
                        if (var8.field9327.length > arg1.field5650 && var8.field9357[arg1.field5650] < arg1.field5699) {
                            arg1.field5650++;
                            arg1.field5699 = 1;
                            if (!arg1.field5735) {
                                class190.method1366(arg1, arg1.field5650, var8, -114);
                            }
                        }
                        if (arg1.field5650 >= var8.field9327.length) {
                            if (var6.field8964) {
                                arg1.field5691++;
                                arg1.field5650 -= var8.field9328;
                                if (var8.field9334 <= arg1.field5691) {
                                    arg1.field5717 = -1;
                                } else if (arg1.field5650 < 0 || arg1.field5650 >= var8.field9327.length) {
                                    arg1.field5717 = -1;
                                } else if (!arg1.field5735) {
                                    class190.method1366(arg1, arg1.field5650, var8, -92);
                                }
                            } else {
                                arg1.field5717 = -1;
                            }
                        }
                        arg1.field5702 = arg1.field5650 + 1;
                        if (var8.field9327.length <= arg1.field5702) {
                            if (var6.field8964) {
                                arg1.field5702 -= var8.field9328;
                                if (arg1.field5691 + 1 >= var8.field9334) {
                                    arg1.field5702 = -1;
                                } else if (arg1.field5702 < 0 || var8.field9327.length <= arg1.field5702) {
                                    arg1.field5702 = -1;
                                }
                            } else {
                                arg1.field5702 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field5712 != -1 && arg1.field5644 <= 1) {
            class691 var9 = class456.field6436.method1021(arg1.field5712, 7);
            if (var9.field9352 == 3) {
                if (arg1.field5748 > 0 && arg1.field5665 <= class641.field8810 && class641.field8810 > arg1.field5726) {
                    arg1.field5712 = -1;
                    arg1.field5662 = null;
                }
            } else if (var9.field9352 == 1 && arg1.field5748 > 0 && arg1.field5665 <= class641.field8810 && arg1.field5726 < class641.field8810) {
                arg1.field5644 = 2;
            }
        }
        if (arg1.field5712 != -1 && arg1.field5644 == 0) {
            class691 var10 = class456.field6436.method1021(arg1.field5712, 7);
            if (var10 == null || var10.field9327 == null) {
                arg1.field5712 = -1;
                arg1.field5662 = null;
            } else {
                arg1.field5658++;
                if (var10.field9327.length > arg1.field5693 && arg1.field5658 > var10.field9357[arg1.field5693]) {
                    arg1.field5693++;
                    arg1.field5658 = 1;
                    if (!arg1.field5735) {
                        class190.method1366(arg1, arg1.field5693, var10, -34);
                    }
                }
                if (var10.field9327.length <= arg1.field5693) {
                    arg1.field5693 -= var10.field9328;
                    arg1.field5720++;
                    if (var10.field9334 <= arg1.field5720) {
                        arg1.field5662 = null;
                        arg1.field5712 = -1;
                    } else if (arg1.field5693 < 0 || var10.field9327.length <= arg1.field5693) {
                        arg1.field5662 = null;
                        arg1.field5712 = -1;
                    } else if (!arg1.field5735) {
                        class190.method1366(arg1, arg1.field5693, var10, -88);
                    }
                }
                arg1.field5670 = arg1.field5693 + 1;
                if (arg1.field5670 >= var10.field9327.length) {
                    arg1.field5670 -= var10.field9328;
                    if (var10.field9334 <= arg1.field5720 + 1) {
                        arg1.field5670 = -1;
                    } else if (arg1.field5670 < 0 || var10.field9327.length <= arg1.field5670) {
                        arg1.field5670 = -1;
                    }
                }
            }
        }
        int var11 = -86 / ((-arg0 - 18) / 51);
        if (arg1.field5644 > 0) {
            arg1.field5644--;
        }
        for (int var12 = 0; var12 < arg1.field5734.length; var12++) {
            class117 var13 = arg1.field5734[var12];
            if (var13 != null) {
                if (var13.field1991 > 0) {
                    var13.field1991--;
                } else {
                    class691 var14 = class456.field6436.method1021(var13.field1997, 7);
                    if (var14 == null || var14.field9327 == null) {
                        arg1.field5734[var12] = null;
                    } else {
                        var13.field1999++;
                        if (var13.field1994 < var14.field9327.length && var14.field9357[var13.field1994] < var13.field1999) {
                            var13.field1994++;
                            var13.field1999 = 1;
                            if (!arg1.field5735) {
                                class190.method1366(arg1, var13.field1994, var14, -108);
                            }
                        }
                        if (var13.field1994 >= var14.field9327.length) {
                            var13.field1994 -= var14.field9328;
                            var13.field1988++;
                            if (var13.field1988 >= var14.field9334) {
                                arg1.field5734[var12] = null;
                            } else if (var13.field1994 < 0 || var14.field9327.length <= var13.field1994) {
                                arg1.field5734[var12] = null;
                            } else if (!arg1.field5735) {
                                class190.method1366(arg1, var13.field1994, var14, -46);
                            }
                        }
                        var13.field1998 = var13.field1994 + 1;
                        if (var14.field9327.length <= var13.field1998) {
                            var13.field1998 -= var14.field9328;
                            if (var14.field9334 <= var13.field1988 + 1) {
                                var13.field1998 = -1;
                            } else if (var13.field1998 < 0 || var14.field9327.length <= var13.field1998) {
                                var13.field1998 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIII)Lwh;")
    public static final class149 method2726(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6489++;
        long var7 = (long) arg3 * 76724863L ^ (long) arg0 * 32147369L ^ (long) arg1 * 986053L ^ (long) arg2 * 67481L ^ (long) arg4 * 97549L ^ (long) arg6 * 475427L;
        class149 var9 = (class149) class278.field3921.method992(var7, 90);
        if (var9 != null) {
            return var9;
        }
        class149 var10 = class112.field1938.method253(arg2, arg4, arg6, arg1, arg0, arg3);
        if (arg5 != -1) {
            method2726(58, 63, -99, -89, -7, 18, 71);
        }
        class278.field3921.method991(var10, var7, (byte) -106);
        return var10;
    }

    @OriginalMember(owner = "client!sj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6490++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class460(String arg0, int arg1) {
        this.field6486 = arg0;
        this.field6488 = arg1;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)Z")
    public static final boolean method2727(int arg0, int arg1, int arg2) {
        field6485++;
        if (arg1 == 32768) {
            return (arg2 & 0x8000) != 0;
        } else {
            return true;
        }
    }
}
