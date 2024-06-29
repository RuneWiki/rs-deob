import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class111 extends class270 {

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    private int field1801 = 0;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
    private int field1810 = 1;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    private int field1806 = 0;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    public static int field1802 = 0;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
    public static int field1808 = 0;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIZIIIBZIILja;Lc;)V")
    public static final void method966(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, byte arg7, boolean arg8, int arg9, int arg10, class90 arg11, class158 arg12) {
        ++field1803;
        if (class122.method1034(24037) || class202.method1538(arg1, arg4, class140.field2216, 582, arg2)) {
            if (arg2 < class305.field4455) {
                class305.field4455 = arg2;
            }
            class45 var13 = class451.method2812(115, arg0);
            if (~class288.field4303 != -2 || !var13.field689) {
                int var14;
                int var15;
                if (~arg10 != -2 && ~arg10 != -4) {
                    var14 = var13.field717;
                    var15 = var13.field724;
                } else {
                    var14 = var13.field724;
                    var15 = var13.field717;
                }
                int var16;
                int var17;
                if (~(arg1 + var14) < ~class183.field2703) {
                    var16 = arg1 + 1;
                    var17 = arg1;
                } else {
                    var17 = arg1 - -(var14 >> 1);
                    var16 = (var14 + 1 >> 1) + arg1;
                }
                int var18;
                int var19;
                if (~class66.field1056 <= ~(arg4 + var15)) {
                    var18 = (var15 >> 1) + arg4;
                    var19 = (var15 + 1 >> 1) + arg4;
                } else {
                    var18 = arg4;
                    var19 = arg4 + 1;
                }
                class126 var20 = class50.field816[arg5];
                int var21 = var20.method794(var17, var18) + (var20.method794(var16, var18) - (-var20.method794(var17, var19) + -var20.method794(var16, var19))) >> 2;
                int var22 = (arg1 << 7) - -(var14 << 6);
                int var23 = (arg4 << 7) + (var15 << 6);
                boolean var24 = arg8 && !arg3 && var13.field722;
                if (var13.method370((byte) -108)) {
                    class402.method2554(arg1, arg2, (class127) null, arg10, arg4, var13, (byte) -120, (class98) null);
                }
                boolean var25 = arg6 == -1 && ~var13.field715 == 0 && var13.field732 == null && var13.field681 == null && !var13.field740;
                if (!class260.field3916 || var13.field734 == 1) {
                    if (~arg9 == -23) {
                        if (class310.field4525 || var13.field697 != 0 || var13.field714 == 1 || var13.field735) {
                            class49 var27;
                            if (var25) {
                                class217 var26 = new class217(arg11, var13, arg5, var22, var21, var23, arg3, arg10, var24);
                                if (var26.method1018((byte) -110)) {
                                    var26.method1022(true, arg11);
                                }
                                var27 = var26;
                            } else {
                                var27 = new class446(arg11, var13, arg10, arg2, arg5, var22, var21, var23, arg3, arg6);
                            }
                            class367.method2337(arg2, arg1, arg4, var27);
                            if (var13.field714 == 1 && arg12 != null) {
                                arg12.method1241(false, arg1, arg4);
                            }
                        }
                    } else if (~arg9 != -11 && arg9 != 11) {
                        if (~arg9 <= -13 && ~arg9 >= -18 || ~arg9 <= -19 && arg9 <= 21) {
                            class447 var28;
                            if (!var25) {
                                var28 = new class381(arg11, var13, arg9, arg10, arg2, arg5, var22, var21, var23, arg3, arg1, arg1 - (-var14 + 1), arg4, arg4 + -1 - -var15, arg6);
                            } else {
                                class245 var29 = new class245(arg11, var13, arg2, arg5, var22, var21, var23, arg3, arg1, var14 + -1 + arg1, arg4, arg4 + -1 - -var15, arg9, arg10, var24);
                                if (var29.method1018((byte) -103)) {
                                    var29.method1022(true, arg11);
                                }
                                var28 = var29;
                            }
                            class74.method587(var28, false);
                            if (arg8 && !arg3 && ~arg9 <= -13 && ~arg9 >= -18 && ~arg9 != -14 && arg2 > 0 && var13.field734 != 0) {
                                class390.field5615[arg2][arg1][arg4] = (byte) class439.method2744(class390.field5615[arg2][arg1][arg4], 4);
                            }
                            if (~var13.field714 != -1 && arg12 != null) {
                                arg12.method1253(!var13.field711, (byte) 66, arg4, var13.field694, arg1, var15, var14);
                            }
                        } else if (arg9 == 0) {
                            class148 var30;
                            if (!var25) {
                                var30 = new class320(arg11, var13, 0, arg10, arg2, arg5, var22, var21, var23, arg3, arg6);
                            } else {
                                class121 var31 = new class121(arg11, var13, arg5, var22, var21, var23, arg3, arg9, arg10, var24);
                                var30 = var31;
                                if (var31.method1018((byte) -108)) {
                                    var31.method1022(true, arg11);
                                }
                            }
                            class218.method1650(arg2, arg1, arg4, var30, (class148) null);
                            if (arg8) {
                                if (~arg10 == -1) {
                                    if (var13.field696) {
                                        var20.method800(arg1, arg4, 50);
                                        var20.method800(arg1, arg4 + 1, 50);
                                    }
                                    if (var13.field734 == 1 && !arg3) {
                                        class390.field5615[arg2][arg1][arg4] = (byte) class439.method2744(class390.field5615[arg2][arg1][arg4], 1);
                                    }
                                } else if (~arg10 != -2) {
                                    if (arg10 != 2) {
                                        if (~arg10 == -4) {
                                            if (var13.field696) {
                                                var20.method800(arg1, arg4, 50);
                                                var20.method800(arg1 - -1, arg4, 50);
                                            }
                                            if (~var13.field734 == -2 && !arg3) {
                                                class390.field5615[arg2][arg1][arg4] = (byte) class439.method2744(class390.field5615[arg2][arg1][arg4], 2);
                                            }
                                        }
                                    } else {
                                        if (var13.field696) {
                                            var20.method800(arg1 + 1, arg4, 50);
                                            var20.method800(arg1 - -1, arg4 - -1, 50);
                                        }
                                        if (var13.field734 == 1 && !arg3) {
                                            class390.field5615[arg2][arg1 + 1][arg4] = (byte) class439.method2744(class390.field5615[arg2][arg1 + 1][arg4], 1);
                                        }
                                    }
                                } else {
                                    if (var13.field696) {
                                        var20.method800(arg1, arg4 + 1, 50);
                                        var20.method800(arg1 - -1, arg4 + 1, 50);
                                    }
                                    if (var13.field734 == 1 && !arg3) {
                                        class390.field5615[arg2][arg1][arg4 - -1] = (byte) class439.method2744(class390.field5615[arg2][arg1][arg4 - -1], 2);
                                    }
                                }
                            }
                            if (~var13.field714 != -1 && arg12 != null) {
                                arg12.method1250(true, arg1, !var13.field711, arg10, arg9, arg4, var13.field694);
                            }
                            if (var13.field674 != 16) {
                                class306.method2094(arg2, arg1, arg4, var13.field674);
                            }
                        } else if (arg9 == 1) {
                            class148 var33;
                            if (var25) {
                                class121 var32 = new class121(arg11, var13, arg5, var22, var21, var23, arg3, arg9, arg10, var24);
                                var33 = var32;
                                if (var32.method1018((byte) -91)) {
                                    var32.method1022(true, arg11);
                                }
                            } else {
                                var33 = new class320(arg11, var13, 1, arg10, arg2, arg5, var22, var21, var23, arg3, arg6);
                            }
                            class218.method1650(arg2, arg1, arg4, var33, (class148) null);
                            if (var13.field696 && arg8) {
                                if (arg10 != 0) {
                                    if (arg10 != 1) {
                                        if (~arg10 == -3) {
                                            var20.method800(arg1 - -1, arg4, 50);
                                        } else if (arg10 == 3) {
                                            var20.method800(arg1, arg4, 50);
                                        }
                                    } else {
                                        var20.method800(arg1 + 1, arg4 - -1, 50);
                                    }
                                } else {
                                    var20.method800(arg1, arg4 - -1, 50);
                                }
                            }
                            if (~var13.field714 != -1 && arg12 != null) {
                                arg12.method1250(true, arg1, !var13.field711, arg10, arg9, arg4, var13.field694);
                            }
                        } else if (~arg9 == -3) {
                            int var34 = arg10 - -1 & 3;
                            class148 var35;
                            class148 var36;
                            if (!var25) {
                                var35 = new class320(arg11, var13, 2, arg10 + 4, arg2, arg5, var22, var21, var23, arg3, arg6);
                                var36 = new class320(arg11, var13, 2, var34, arg2, arg5, var22, var21, var23, arg3, arg6);
                            } else {
                                class121 var37 = new class121(arg11, var13, arg5, var22, var21, var23, arg3, arg9, arg10 + 4, var24);
                                class121 var38 = new class121(arg11, var13, arg5, var22, var21, var23, arg3, arg9, var34, var24);
                                if (var37.method1018((byte) -24)) {
                                    var37.method1022(true, arg11);
                                }
                                if (var38.method1018((byte) -75)) {
                                    var38.method1022(true, arg11);
                                }
                                var35 = var37;
                                var36 = var38;
                            }
                            class218.method1650(arg2, arg1, arg4, var35, var36);
                            if (~var13.field734 == -2 && arg8 && !arg3) {
                                if (~arg10 != -1) {
                                    if (arg10 == 1) {
                                        class390.field5615[arg2][arg1][arg4 + 1] = (byte) class439.method2744(class390.field5615[arg2][arg1][arg4 + 1], 2);
                                        class390.field5615[arg2][arg1 + 1][arg4] = (byte) class439.method2744(class390.field5615[arg2][arg1 + 1][arg4], 1);
                                    } else if (~arg10 == -3) {
                                        class390.field5615[arg2][arg1 + 1][arg4] = (byte) class439.method2744(class390.field5615[arg2][arg1 + 1][arg4], 1);
                                        class390.field5615[arg2][arg1][arg4] = (byte) class439.method2744(class390.field5615[arg2][arg1][arg4], 2);
                                    } else if (~arg10 == -4) {
                                        class390.field5615[arg2][arg1][arg4] = (byte) class439.method2744(class390.field5615[arg2][arg1][arg4], 2);
                                        class390.field5615[arg2][arg1][arg4] = (byte) class439.method2744(class390.field5615[arg2][arg1][arg4], 1);
                                    }
                                } else {
                                    class390.field5615[arg2][arg1][arg4] = (byte) class439.method2744(class390.field5615[arg2][arg1][arg4], 1);
                                    class390.field5615[arg2][arg1][arg4 + 1] = (byte) class439.method2744(class390.field5615[arg2][arg1][arg4 + 1], 2);
                                }
                            }
                            if (var13.field714 != 0 && arg12 != null) {
                                arg12.method1250(true, arg1, !var13.field711, arg10, arg9, arg4, var13.field694);
                            }
                            if (~var13.field674 != -17) {
                                class306.method2094(arg2, arg1, arg4, var13.field674);
                            }
                        } else {
                            int var39 = -112 % ((-31 - arg7) / 56);
                            if (~arg9 == -4) {
                                class148 var41;
                                if (var25) {
                                    class121 var40 = new class121(arg11, var13, arg5, var22, var21, var23, arg3, arg9, arg10, var24);
                                    var41 = var40;
                                    if (var40.method1018((byte) -70)) {
                                        var40.method1022(true, arg11);
                                    }
                                } else {
                                    var41 = new class320(arg11, var13, 3, arg10, arg2, arg5, var22, var21, var23, arg3, arg6);
                                }
                                class218.method1650(arg2, arg1, arg4, var41, (class148) null);
                                if (var13.field696 && arg8) {
                                    if (~arg10 != -1) {
                                        if (arg10 != 1) {
                                            if (arg10 == 2) {
                                                var20.method800(arg1 + 1, arg4, 50);
                                            } else if (arg10 == 3) {
                                                var20.method800(arg1, arg4, 50);
                                            }
                                        } else {
                                            var20.method800(arg1 + 1, arg4 + 1, 50);
                                        }
                                    } else {
                                        var20.method800(arg1, arg4 - -1, 50);
                                    }
                                }
                                if (var13.field714 != 0 && arg12 != null) {
                                    arg12.method1250(true, arg1, !var13.field711, arg10, arg9, arg4, var13.field694);
                                }
                            } else if (arg9 == 9) {
                                class447 var42;
                                if (!var25) {
                                    var42 = new class381(arg11, var13, arg9, arg10, arg2, arg5, var22, var21, var23, arg3, arg1, arg1 - -var14 + -1, arg4, arg4 - 1 + var15, arg6);
                                } else {
                                    class245 var43 = new class245(arg11, var13, arg2, arg5, var22, var21, var23, arg3, arg1, arg1, arg4, arg4, arg9, arg10, var24);
                                    var42 = var43;
                                    if (var43.method1018((byte) -122)) {
                                        var43.method1022(true, arg11);
                                    }
                                }
                                class74.method587(var42, false);
                                if (~var13.field714 != -1 && arg12 != null) {
                                    arg12.method1253(!var13.field711, (byte) 74, arg4, var13.field694, arg1, var15, var14);
                                }
                                if (~var13.field674 != -17) {
                                    class306.method2094(arg2, arg1, arg4, var13.field674);
                                }
                            } else if (arg9 == 4) {
                                class350 var45;
                                if (var25) {
                                    class187 var44 = new class187(arg11, var13, arg5, var22, var21, var23, arg3, 0, 0, 0, arg9, arg10);
                                    var45 = var44;
                                    if (var44.method1018((byte) -84)) {
                                        var44.method1022(true, arg11);
                                    }
                                } else {
                                    var45 = new class211(arg11, var13, arg9, arg10, arg2, arg5, var22, var21, var23, arg3, 0, 0, 0, arg6);
                                }
                                class324.method2149(arg2, arg1, arg4, var45, (class350) null);
                            } else if (arg9 == 5) {
                                int var46 = 16;
                                class395 var47 = (class395) class219.method1656(arg2, arg1, arg4);
                                if (var47 != null) {
                                    var46 = class451.method2812(124, var47.method1013(false)).field674;
                                }
                                class350 var49;
                                if (var25) {
                                    class187 var48 = new class187(arg11, var13, arg5, var22, var21, var23, arg3, 0, class444.field6468[arg10] * var46, class287.field4293[arg10] * var46, arg9, arg10);
                                    if (var48.method1018((byte) -71)) {
                                        var48.method1022(true, arg11);
                                    }
                                    var49 = var48;
                                } else {
                                    var49 = new class211(arg11, var13, arg9, arg10, arg2, arg5, var22, var21, var23, arg3, 0, class444.field6468[arg10] * var46, class287.field4293[arg10] * var46, arg6);
                                }
                                class324.method2149(arg2, arg1, arg4, var49, (class350) null);
                            } else if (~arg9 == -7) {
                                int var50 = 8;
                                class395 var51 = (class395) class219.method1656(arg2, arg1, arg4);
                                if (var51 != null) {
                                    var50 = class451.method2812(52, var51.method1013(false)).field674 / 2;
                                }
                                class350 var52;
                                if (!var25) {
                                    var52 = new class211(arg11, var13, arg9, arg10 + 4, arg2, arg5, var22, var21, var23, arg3, arg10, class219.field3257[arg10] * var50, class124.field1968[arg10] * var50, arg6);
                                } else {
                                    class187 var53 = new class187(arg11, var13, arg5, var22, var21, var23, arg3, arg10, class444.field6468[arg10] * var50, class287.field4293[arg10] * var50, arg9, arg10 + 4);
                                    var52 = var53;
                                    if (var53.method1018((byte) -22)) {
                                        var53.method1022(true, arg11);
                                    }
                                }
                                class324.method2149(arg2, arg1, arg4, var52, (class350) null);
                            } else if (arg9 == 7) {
                                int var54 = 3 & arg10 + 2;
                                class350 var56;
                                if (var25) {
                                    class187 var55 = new class187(arg11, var13, arg5, var22, var21, var23, arg3, var54, 0, 0, arg9, var54 - -4);
                                    if (var55.method1018((byte) -112)) {
                                        var55.method1022(true, arg11);
                                    }
                                    var56 = var55;
                                } else {
                                    var56 = new class211(arg11, var13, arg9, var54 + 4, arg2, arg5, var22, var21, var23, arg3, var54, 0, 0, arg6);
                                }
                                class324.method2149(arg2, arg1, arg4, var56, (class350) null);
                            } else if (~arg9 == -9) {
                                int var57 = 3 & arg10 + 2;
                                int var58 = 8;
                                class395 var59 = (class395) class219.method1656(arg2, arg1, arg4);
                                if (var59 != null) {
                                    var58 = class451.method2812(95, var59.method1013(false)).field674 / 2;
                                }
                                class350 var62;
                                class350 var63;
                                if (!var25) {
                                    class211 var60 = new class211(arg11, var13, arg9, arg10, arg2, arg5, var22, var21, var23, arg3, arg10, class219.field3257[arg10] * var58, class124.field1968[arg10] * var58, arg6);
                                    class211 var61 = new class211(arg11, var13, arg9, arg10, arg2, arg5, var22, var21, var23, arg3, arg10, 0, 0, arg6);
                                    var62 = var60;
                                    var63 = var61;
                                } else {
                                    class187 var64 = new class187(arg11, var13, arg5, var22, var21, var23, arg3, arg10, class219.field3257[arg10] * var58, class124.field1968[arg10] * var58, arg9, arg10 + 4);
                                    class187 var65 = new class187(arg11, var13, arg5, var22, var21, var23, arg3, arg10, 0, 0, arg9, var57 + 4);
                                    if (var64.method1018((byte) -95)) {
                                        var64.method1022(true, arg11);
                                    }
                                    var63 = var65;
                                    if (var65.method1018((byte) -21)) {
                                        var65.method1022(true, arg11);
                                    }
                                    var62 = var64;
                                }
                                class324.method2149(arg2, arg1, arg4, var62, var63);
                            }
                        }
                    } else {
                        class245 var66 = null;
                        class447 var67;
                        int var68;
                        if (!var25) {
                            var67 = new class381(arg11, var13, arg9, arg10, arg2, arg5, var22, var21, var23, arg3, arg1, arg1 + -1 - -var14, arg4, var15 + -1 + arg4, arg6);
                            var68 = 15;
                        } else {
                            class245 var69 = new class245(arg11, var13, arg2, arg5, var22, var21, var23, arg3, arg1, var14 + -1 + arg1, arg4, var15 + -1 + arg4, arg9, arg10, var24);
                            var68 = var69.method1784(-104);
                            var66 = var69;
                            var67 = var69;
                        }
                        if (class74.method587(var67, false)) {
                            if (var66 != null && var66.method1018((byte) -115)) {
                                var66.method1022(true, arg11);
                            }
                            if (var13.field696 && arg8) {
                                if (var68 > 30) {
                                    var68 = 30;
                                }
                                for (int var70 = 0; ~var14 <= ~var70; ++var70) {
                                    for (int var71 = 0; var71 <= var15; ++var71) {
                                        var20.method800(arg1 + var70, arg4 + var71, var68);
                                    }
                                }
                            }
                        }
                        if (var13.field714 != 0 && arg12 != null) {
                            arg12.method1253(!var13.field711, (byte) 49, arg4, var13.field694, arg1, var15, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLec;I)V")
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg0 != 108) {
            field1802 = 1;
        }
        ++field1804;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -4) {
                    this.field1810 = arg1.method271((byte) 119);
                }
            } else {
                this.field1806 = arg1.method271((byte) 101);
            }
        } else {
            this.field1801 = arg1.method271((byte) 102);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)[I")
    public final int[] method81(byte arg0, int arg1) {
        ++field1805;
        int[] var3 = super.field4053.method396(arg1, -30);
        if (arg0 < 26) {
            this.field1801 = -124;
        }
        if (super.field4053.field815) {
            int var4 = class364.field5185[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class161.field2445; ++var6) {
                int var7 = class136.field2168[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field1801 == 0) {
                    var9 = (-var4 + var7) * this.field1810;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field1810 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (~this.field1806 != -1) {
                    if (~this.field1806 == -3) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class42.field640[var12 >> 4 & 255] - -4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
    public class111() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
    public final void method83(boolean arg0) {
        if (!arg0) {
            field1807 = -61;
        }
        ++field1809;
        class164.method1269(0);
    }
}
