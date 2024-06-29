import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class794 extends class36 {

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
    public int field11554 = 99;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field11558 = new String[] { method5733(method5732("+O\u000e,")), method5733(method5732(">\u0014Ln\u007f")), method5733(method5732("#VL\u0007*")), method5733(method5732("#VL\u0003*")), method5733(method5732("#VL\n*")), method5733(method5732("7N")), method5733(method5732(")U\u0005'g!U\u00174")), method5733(method5732("#VL\t*")), method5733(method5732("#VL\u0006*")), method5733(method5732("#VL\u0004*")), method5733(method5732("#VL\u000b*")), method5733(method5732("#VL\b*")), method5733(method5732("#VL\u0005*")), method5733(method5732("#VL\u0002*")), method5733(method5732("#VL\u0001*")) };

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "[I")
    public static int[] field11545 = new int[1];

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "I")
    public static int field11546;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
    public static int field11547;

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
    public static int field11548;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
    public static int field11549;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
    public static int field11550;

    @OriginalMember(owner = "client!fl", name = "U", descriptor = "I")
    public static int field11551;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    public static int field11552;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
    public static int field11553;

    @OriginalMember(owner = "client!fl", name = "T", descriptor = "I")
    public static int field11555;

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
    public static int field11556;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field11557;

    // $FF: synthetic method
    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method5731(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILuda;Lha;IIIBIIII)V", line = 3)
    public final void method5720(int arg0, class302 arg1, class18 arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        try {
            ++field11556;
            if (class451.field6612.field9089.method5427(3) != 0 || class676.method4844(arg10, true, arg3, class475.field6973, arg0)) {
                if (~this.field11554 < ~arg4) {
                    this.field11554 = arg4;
                }
                class789 var12 = class101.field1359.method2832(122, arg7);
                if (~class451.field6612.field9092.method2151(3) != -1 || !var12.field11470) {
                    int var13;
                    int var14;
                    if (arg9 != 1 && arg9 != 3) {
                        var13 = var12.field11390;
                        var14 = var12.field11452;
                    } else {
                        var14 = var12.field11390;
                        var13 = var12.field11452;
                    }
                    int var15 = -105 % ((-6 - arg6) / 58);
                    int var16;
                    int var17;
                    if (~super.field453 > ~(arg3 + var14)) {
                        var16 = arg3;
                        var17 = arg3 + 1;
                    } else {
                        var17 = (var14 - -1 >> 1) + arg3;
                        var16 = (var14 >> 1) + arg3;
                    }
                    int var18;
                    int var19;
                    if (arg10 + var13 <= super.field455) {
                        var18 = arg10 - -(var13 >> 1);
                        var19 = (var13 + 1 >> 1) + arg10;
                    } else {
                        var18 = arg10;
                        var19 = arg10 + 1;
                    }
                    class751 var20 = class107.field1413[arg0];
                    int var21 = var20.method5442(var16, var18, 31844) + var20.method5442(var17, var18, 31844) + var20.method5442(var16, var19, 31844) - -var20.method5442(var17, var19, 31844) >> 2;
                    int var22 = (arg3 << 9) + (var14 << 8);
                    int var23 = (arg10 << 9) + (var13 << 8);
                    boolean var24 = class529.field7681 && !super.field458 && var12.field11466;
                    if (var12.method5675(170)) {
                        class54.method568((class339) null, arg10, arg9, arg3, (class717) null, var12, arg4, false);
                    }
                    boolean var25 = ~arg5 == 0 && !var12.method5691(-114) && var12.field11465 == null && !var12.field11389 && !var12.field11417;
                    if (!class228.field3307 || (!class559.method4182(98, arg8) || var12.field11446 == 1) && (!class336.method2701(arg8, 103) || var12.field11446 != 0)) {
                        if (arg8 == 22) {
                            if (class451.field6612.field9091.method3900(3) != 0 || ~var12.field11409 != -1 || var12.field11480 == 1 || var12.field11462) {
                                class122 var27;
                                if (var25) {
                                    class325 var26 = new class325(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, arg9, var24);
                                    var27 = var26;
                                    if (var26.method590(116)) {
                                        var26.method589(false, arg2);
                                    }
                                } else {
                                    var27 = new class800(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, arg9, arg5);
                                }
                                class30.method329(arg4, arg3, arg10, var27);
                                if (~var12.field11480 == -2 && arg1 != null) {
                                    arg1.method2417(arg10, arg3, false);
                                }
                            }
                        } else if (arg8 != 10 && ~arg8 != -12) {
                            if (~arg8 <= -13 && ~arg8 >= -18 || arg8 >= 18 && arg8 <= 21) {
                                class604 var35;
                                if (var25) {
                                    class468 var34 = new class468(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, arg3, arg3 + var14 - 1, arg10, var13 + -1 + arg10, arg8, arg9, var24);
                                    if (var34.method590(100)) {
                                        var34.method589(false, arg2);
                                    }
                                    var35 = var34;
                                } else {
                                    var35 = new class55(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, arg3, arg3 + -1 + var14, arg10, var13 + -1 + arg10, arg8, arg9, arg5);
                                }
                                class90.method889(var35, false);
                                if (class529.field7681 && !super.field458 && ~arg8 <= -13 && ~arg8 >= -18 && ~arg8 != -14 && arg4 > 0 && var12.field11446 != 0) {
                                    super.field445[arg4][arg3][arg10] = (byte) class10.method71(super.field445[arg4][arg3][arg10], 4);
                                }
                                if (~var12.field11480 != -1 && arg1 != null) {
                                    arg1.method2429(arg10, var14, var13, var12.field11413, (byte) -57, !var12.field11463, arg3);
                                }
                            } else if (arg8 == 0) {
                                int var36 = var12.field11446;
                                if (class323.field4409 && var12.field11446 == -1) {
                                    var36 = 1;
                                }
                                class571 var37;
                                if (!var25) {
                                    var37 = new class466(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, arg8, arg9, arg5);
                                } else {
                                    class563 var38 = new class563(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, arg8, arg9, var24);
                                    var37 = var38;
                                    if (var38.method590(119)) {
                                        var38.method589(false, arg2);
                                    }
                                }
                                class693.method4944(arg4, arg3, arg10, var37, (class571) null);
                                if (arg9 != 0) {
                                    if (arg9 == 1) {
                                        if (class529.field7681 && var12.field11426) {
                                            var20.method2478(arg3, arg10 - -1, 50);
                                            var20.method2478(arg3 + 1, arg10 + 1, 50);
                                        }
                                        if (~var36 == -2 && !super.field458) {
                                            class234.method1942(-var12.field11479, 8, arg4, arg10 + 1, arg3, var12.field11392, 2);
                                        }
                                    } else if (~arg9 != -3) {
                                        if (arg9 == 3) {
                                            if (class529.field7681 && var12.field11426) {
                                                var20.method2478(arg3, arg10, 50);
                                                var20.method2478(arg3 - -1, arg10, 50);
                                            }
                                            if (~var36 == -2 && !super.field458) {
                                                class234.method1942(var12.field11479, 8, arg4, arg10, arg3, var12.field11392, 2);
                                            }
                                        }
                                    } else {
                                        if (class529.field7681 && var12.field11426) {
                                            var20.method2478(arg3 - -1, arg10, 50);
                                            var20.method2478(arg3 + 1, arg10 + 1, 50);
                                        }
                                        if (~var36 == -2 && !super.field458) {
                                            class234.method1942(-var12.field11479, 8, arg4, arg10, arg3 + 1, var12.field11392, 1);
                                        }
                                    }
                                } else {
                                    if (class529.field7681 && var12.field11426) {
                                        var20.method2478(arg3, arg10, 50);
                                        var20.method2478(arg3, arg10 + 1, 50);
                                    }
                                    if (~var36 == -2 && !super.field458) {
                                        class234.method1942(var12.field11479, 8, arg4, arg10, arg3, var12.field11392, 1);
                                    }
                                }
                                if (var12.field11480 != 0 && arg1 != null) {
                                    arg1.method2428(arg8, arg9, var12.field11413, arg3, arg10, 2, !var12.field11463);
                                }
                                if (~var12.field11418 != -65) {
                                    class23.method271(arg4, arg3, arg10, var12.field11418);
                                }
                            } else if (~arg8 == -2) {
                                class571 var39;
                                if (!var25) {
                                    var39 = new class466(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, arg8, arg9, arg5);
                                } else {
                                    class563 var40 = new class563(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, arg8, arg9, var24);
                                    var39 = var40;
                                    if (var40.method590(107)) {
                                        var40.method589(false, arg2);
                                    }
                                }
                                class693.method4944(arg4, arg3, arg10, var39, (class571) null);
                                if (var12.field11426 && class529.field7681) {
                                    if (~arg9 != -1) {
                                        if (arg9 == 1) {
                                            var20.method2478(arg3 + 1, arg10 + 1, 50);
                                        } else if (~arg9 != -3) {
                                            if (arg9 == 3) {
                                                var20.method2478(arg3, arg10, 50);
                                            }
                                        } else {
                                            var20.method2478(arg3 - -1, arg10, 50);
                                        }
                                    } else {
                                        var20.method2478(arg3, arg10 + 1, 50);
                                    }
                                }
                                if (~var12.field11480 != -1 && arg1 != null) {
                                    arg1.method2428(arg8, arg9, var12.field11413, arg3, arg10, 2, !var12.field11463);
                                }
                            } else if (~arg8 == -3) {
                                int var41 = 3 & arg9 + 1;
                                class571 var44;
                                class571 var45;
                                if (var25) {
                                    class563 var42 = new class563(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, arg8, arg9 + 4, var24);
                                    class563 var43 = new class563(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, arg8, var41, var24);
                                    if (var42.method590(97)) {
                                        var42.method589(false, arg2);
                                    }
                                    if (var43.method590(106)) {
                                        var43.method589(false, arg2);
                                    }
                                    var44 = var42;
                                    var45 = var43;
                                } else {
                                    var44 = new class466(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, arg8, arg9 + 4, arg5);
                                    var45 = new class466(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, arg8, var41, arg5);
                                }
                                class693.method4944(arg4, arg3, arg10, var44, var45);
                                if ((~var12.field11446 == -2 || class323.field4409 && ~var12.field11446 == 0) && !super.field458) {
                                    if (arg9 == 0) {
                                        class234.method1942(var12.field11479, 8, arg4, arg10, arg3, var12.field11392, 1);
                                        class234.method1942(var12.field11479, 8, arg4, arg10 + 1, arg3, var12.field11392, 2);
                                    } else if (~arg9 == -2) {
                                        class234.method1942(var12.field11479, 8, arg4, arg10, arg3 + 1, var12.field11392, 1);
                                        class234.method1942(var12.field11479, 8, arg4, arg10 + 1, arg3, var12.field11392, 2);
                                    } else if (~arg9 == -3) {
                                        class234.method1942(var12.field11479, 8, arg4, arg10, arg3 + 1, var12.field11392, 1);
                                        class234.method1942(var12.field11479, 8, arg4, arg10, arg3, var12.field11392, 2);
                                    } else if (arg9 == 3) {
                                        class234.method1942(var12.field11479, 8, arg4, arg10, arg3, var12.field11392, 1);
                                        class234.method1942(var12.field11479, 8, arg4, arg10, arg3, var12.field11392, 2);
                                    }
                                }
                                if (var12.field11480 != 0 && arg1 != null) {
                                    arg1.method2428(arg8, arg9, var12.field11413, arg3, arg10, 2, !var12.field11463);
                                }
                                if (~var12.field11418 != -65) {
                                    class23.method271(arg4, arg3, arg10, var12.field11418);
                                }
                            } else if (arg8 == 3) {
                                class571 var46;
                                if (!var25) {
                                    var46 = new class466(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, arg8, arg9, arg5);
                                } else {
                                    class563 var47 = new class563(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, arg8, arg9, var24);
                                    var46 = var47;
                                    if (var47.method590(118)) {
                                        var47.method589(false, arg2);
                                    }
                                }
                                class693.method4944(arg4, arg3, arg10, var46, (class571) null);
                                if (var12.field11426 && class529.field7681) {
                                    if (~arg9 != -1) {
                                        if (~arg9 != -2) {
                                            if (arg9 != 2) {
                                                if (arg9 == 3) {
                                                    var20.method2478(arg3, arg10, 50);
                                                }
                                            } else {
                                                var20.method2478(arg3 + 1, arg10, 50);
                                            }
                                        } else {
                                            var20.method2478(arg3 + 1, arg10 - -1, 50);
                                        }
                                    } else {
                                        var20.method2478(arg3, arg10 + 1, 50);
                                    }
                                }
                                if (var12.field11480 != 0 && arg1 != null) {
                                    arg1.method2428(arg8, arg9, var12.field11413, arg3, arg10, 2, !var12.field11463);
                                }
                            } else if (arg8 == 9) {
                                class604 var49;
                                if (var25) {
                                    class468 var48 = new class468(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, arg3, arg3, arg10, arg10, arg8, arg9, var24);
                                    var49 = var48;
                                    if (var48.method590(108)) {
                                        var48.method589(false, arg2);
                                    }
                                } else {
                                    var49 = new class55(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, arg3, arg3 - -var14 + -1, arg10, arg10 + var13 - 1, arg8, arg9, arg5);
                                }
                                class90.method889(var49, false);
                                if (~var12.field11446 == -2 && !super.field458) {
                                    byte var50;
                                    if ((1 & arg9) == 0) {
                                        var50 = 8;
                                    } else {
                                        var50 = 16;
                                    }
                                    class234.method1942(0, 8, arg4, arg10, arg3, var12.field11392, var50);
                                }
                                if (var12.field11480 != 0 && arg1 != null) {
                                    arg1.method2429(arg10, var14, var13, var12.field11413, (byte) -64, !var12.field11463, arg3);
                                }
                                if (var12.field11418 != 64) {
                                    class23.method271(arg4, arg3, arg10, var12.field11418);
                                }
                            } else if (arg8 == 4) {
                                class656 var51;
                                if (!var25) {
                                    var51 = new class710(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, 0, 0, arg8, arg9, arg5);
                                } else {
                                    class138 var52 = new class138(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, 0, 0, arg8, arg9);
                                    var51 = var52;
                                    if (var52.method590(125)) {
                                        var52.method589(false, arg2);
                                    }
                                }
                                class139.method1213(arg4, arg3, arg10, var51, (class656) null);
                            } else if (~arg8 == -6) {
                                int var53 = 65;
                                class675 var54 = (class675) class185.method1526(arg4, arg3, arg10);
                                if (var54 != null) {
                                    var53 = class101.field1359.method2832(126, var54.method584(false)).field11418 + 1;
                                }
                                class656 var56;
                                if (var25) {
                                    class138 var55 = new class138(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, class156.field1991[arg9] * var53, class435.field6336[arg9] * var53, arg8, arg9);
                                    var56 = var55;
                                    if (var55.method590(101)) {
                                        var55.method589(false, arg2);
                                    }
                                } else {
                                    var56 = new class710(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, class156.field1991[arg9] * var53, class435.field6336[arg9] * var53, arg8, arg9, arg5);
                                }
                                class139.method1213(arg4, arg3, arg10, var56, (class656) null);
                            } else if (~arg8 == -7) {
                                int var57 = 33;
                                class675 var58 = (class675) class185.method1526(arg4, arg3, arg10);
                                if (var58 != null) {
                                    var57 = class101.field1359.method2832(126, var58.method584(false)).field11418 / 2 - -1;
                                }
                                class656 var60;
                                if (var25) {
                                    class138 var59 = new class138(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, class156.field1991[arg9] * var57, class435.field6336[arg9] * var57, arg8, arg9 + 4);
                                    if (var59.method590(115)) {
                                        var59.method589(false, arg2);
                                    }
                                    var60 = var59;
                                } else {
                                    var60 = new class710(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, class754.field10771[arg9] * var57, class791.field11510[arg9] * var57, arg8, arg9 - -4, arg5);
                                }
                                class139.method1213(arg4, arg3, arg10, var60, (class656) null);
                            } else if (arg8 == 7) {
                                int var61 = 3 & arg9 + 2;
                                class656 var63;
                                if (var25) {
                                    class138 var62 = new class138(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, 0, 0, arg8, var61 + 4);
                                    if (var62.method590(125)) {
                                        var62.method589(false, arg2);
                                    }
                                    var63 = var62;
                                } else {
                                    var63 = new class710(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, 0, 0, arg8, var61 - -4, arg5);
                                }
                                class139.method1213(arg4, arg3, arg10, var63, (class656) null);
                            } else if (~arg8 == -9) {
                                int var64 = arg9 + 2 & 3;
                                int var65 = 33;
                                class675 var66 = (class675) class185.method1526(arg4, arg3, arg10);
                                if (var66 != null) {
                                    var65 = 1 + class101.field1359.method2832(119, var66.method584(false)).field11418 / 2;
                                }
                                class656 var69;
                                class656 var70;
                                if (var25) {
                                    class138 var67 = new class138(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, class754.field10771[arg9] * var65, class791.field11510[arg9] * var65, arg8, arg9 + 4);
                                    class138 var68 = new class138(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, 0, 0, arg8, var64 + 4);
                                    if (var67.method590(106)) {
                                        var67.method589(false, arg2);
                                    }
                                    var69 = var67;
                                    var70 = var68;
                                    if (var68.method590(122)) {
                                        var68.method589(false, arg2);
                                    }
                                } else {
                                    class710 var71 = new class710(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, class754.field10771[arg9] * var65, class791.field11510[arg9] * var65, arg8, arg9 + 4, arg5);
                                    var69 = var71;
                                    class710 var72 = new class710(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, 0, 0, arg8, var64 + 4, arg5);
                                    var70 = var72;
                                }
                                class139.method1213(arg4, arg3, arg10, var69, var70);
                            }
                        } else {
                            class468 var28 = null;
                            int var30;
                            class604 var31;
                            if (var25) {
                                class468 var29 = new class468(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, arg3, arg3 + var14 + -1, arg10, arg10 - 1 + var13, arg8, arg9, var24);
                                var28 = var29;
                                var30 = var29.method3591(131072);
                                var31 = var29;
                            } else {
                                var31 = new class55(arg2, var12, arg4, arg0, var22, var21, var23, super.field458, arg3, arg3 + var14 + -1, arg10, arg10 + var13 + -1, arg8, arg9, arg5);
                                var30 = 15;
                            }
                            if (class90.method889(var31, false)) {
                                if (var28 != null && var28.method590(115)) {
                                    var28.method589(false, arg2);
                                }
                                if (var12.field11426 && class529.field7681) {
                                    if (var30 > 30) {
                                        var30 = 30;
                                    }
                                    for (int var32 = 0; ~var32 >= ~var14; ++var32) {
                                        for (int var33 = 0; ~var33 >= ~var13; ++var33) {
                                            var20.method2478(arg3 + var32, arg10 + var33, var30);
                                        }
                                    }
                                }
                            }
                            if (~var12.field11480 != -1 && arg1 != null) {
                                arg1.method2429(arg10, var14, var13, var12.field11413, (byte) -71, !var12.field11463, arg3);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var74) {
            throw class665.method4799(var74, field11558[13] + arg0 + ',' + (arg1 != null ? field11558[1] : field11558[0]) + ',' + (arg2 != null ? field11558[1] : field11558[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljc;IIIIILha;BII)V", line = 625)
    public final void method5721(class711 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class18 arg6, byte arg7, int arg8, int arg9) {
        try {
            ++field11555;
            if (!super.field458) {
                if (arg7 <= 30) {
                    this.field11554 = 72;
                }
                boolean var11 = false;
                class277 var12 = null;
                int var13 = (arg2 & 7) * 8;
                int var14 = (arg3 & 7) * 8;
                while (true) {
                    while (true) {
                        while (true) {
                            while (true) {
                                while (~arg0.field9945 > ~arg0.field9996.length) {
                                    int var15 = arg0.method5128(0);
                                    if (var15 != 0) {
                                        if (var15 != 1) {
                                            if (var15 != 2) {
                                                if (~var15 != -129) {
                                                    if (var15 != 129) {
                                                        throw new IllegalStateException("");
                                                    }
                                                    if (super.field447 == null) {
                                                        super.field447 = new byte[4][][];
                                                    }
                                                    for (int var16 = 0; var16 < 4; ++var16) {
                                                        byte var17 = arg0.method5125((byte) 111);
                                                        if (var17 == 0 && super.field447[arg8] != null) {
                                                            if (~var16 >= ~arg4) {
                                                                int var18 = arg5;
                                                                int var19 = arg5 - -7;
                                                                int var20 = arg9;
                                                                if (~arg9 > -1) {
                                                                    var20 = 0;
                                                                } else if (~arg9 <= ~super.field455) {
                                                                    var20 = super.field455;
                                                                }
                                                                if (~arg5 > -1) {
                                                                    var18 = 0;
                                                                } else if (arg5 >= super.field453) {
                                                                    var18 = super.field453;
                                                                }
                                                                int var21 = arg9 + 7;
                                                                if (~var19 <= -1) {
                                                                    if (~var19 <= ~super.field453) {
                                                                        var19 = super.field453;
                                                                    }
                                                                } else {
                                                                    var19 = 0;
                                                                }
                                                                if (var21 >= 0) {
                                                                    if (~super.field455 >= ~var21) {
                                                                        var21 = super.field455;
                                                                    }
                                                                } else {
                                                                    var21 = 0;
                                                                }
                                                                while (~var18 > ~var19) {
                                                                    while (~var20 > ~var21) {
                                                                        super.field447[arg8][var18][var20] = 0;
                                                                        ++var20;
                                                                    }
                                                                    ++var18;
                                                                }
                                                            }
                                                        } else if (~var17 == -2) {
                                                            if (super.field447[arg8] == null) {
                                                                super.field447[arg8] = new byte[super.field453 - -1][super.field455 + 1];
                                                            }
                                                            for (int var22 = 0; ~var22 > -65; var22 += 4) {
                                                                for (int var23 = 0; var23 < 64; var23 += 4) {
                                                                    byte var24 = arg0.method5125((byte) 115);
                                                                    if (~arg4 <= ~var16) {
                                                                        for (int var25 = var22; ~var25 > ~(var22 + 4); ++var25) {
                                                                            for (int var26 = var23; var26 < var23 + 4; ++var26) {
                                                                                if (var25 >= var13 && ~var25 > ~(var13 + 8) && var26 >= var14 && ~var26 > ~(var14 + 8)) {
                                                                                    int var27 = class152.method1293((byte) -119, 7 & var26, 7 & var25, arg1) + arg5;
                                                                                    int var28 = class470.method3608(7 & var25, 7 & var26, arg1, -115) + arg9;
                                                                                    if (~var27 <= -1 && ~var27 > ~super.field453 && var28 >= 0 && super.field455 > var28) {
                                                                                        super.field447[arg8][var27][var28] = var24;
                                                                                        var11 = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (var12 == null) {
                                                        var12 = new class277();
                                                    }
                                                    var12.method2259(-104, arg0);
                                                }
                                            } else {
                                                if (var12 == null) {
                                                    var12 = new class277();
                                                }
                                                var12.method2257((byte) -124, arg0);
                                            }
                                        } else {
                                            int var29 = arg0.method5128(0);
                                            if (~var29 < -1) {
                                                for (int var30 = 0; ~var30 > ~var29; ++var30) {
                                                    class382 var31 = new class382(arg6, arg0, 2);
                                                    if (~var31.field5563 == -32) {
                                                        class210 var32 = class345.field5030.method4355(arg0.method5116((byte) -113), (byte) 92);
                                                        var31.method3015(var32.field3056, var32.field3052, var32.field3051, 2, var32.field3054);
                                                    }
                                                    if (~arg6.method198() < -1) {
                                                        class330 var33 = var31.field5573;
                                                        int var34 = var33.method2595((byte) -127) >> 9;
                                                        int var35 = var33.method2592(true) >> 9;
                                                        if (~var31.field5559 == ~arg4 && var34 >= var13 && var13 + 8 > var34 && var14 <= var35 && var35 < var14 + 8) {
                                                            int var36 = class20.method253(-72, 4095 & var33.method2592(true), var33.method2595((byte) 98) & 4095, arg1) + (arg5 << 9);
                                                            int var37 = class598.method4411(4095 & var33.method2592(true), var33.method2595((byte) -40) & 4095, arg1, true) + (arg9 << 9);
                                                            int var38 = var36 >> 9;
                                                            int var39 = var37 >> 9;
                                                            if (~var38 <= -1 && var39 >= 0 && var38 < super.field453 && var39 < super.field455) {
                                                                var33.method2596(var37, super.field456[arg4][var38][var39] + -var33.method2590((byte) 104), 2, var36);
                                                                class159.method1345(var31);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (var12 != null) {
                                        var12.method2262(87, arg0);
                                    } else {
                                        var12 = new class277(arg0);
                                    }
                                }
                                if (var12 != null) {
                                    class32.method343(-59, arg9 >> 3, var12, arg5 >> 3);
                                }
                                if (!var11 && super.field447 != null && super.field447[arg8] != null) {
                                    int var40 = arg5 - -7;
                                    int var41 = arg9 + 7;
                                    for (int var42 = arg5; var42 < var40; ++var42) {
                                        for (int var43 = arg9; var41 > var43; ++var43) {
                                            super.field447[arg8][var42][var43] = 0;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var45) {
            throw class665.method4799(var45, field11558[8] + (arg0 != null ? field11558[1] : field11558[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field11558[1] : field11558[0]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V", line = 913)
    public static void method5722(byte arg0) {
        try {
            field11545 = null;
            if (arg0 >= -27) {
                method5722((byte) 42);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11558[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZIIII)Lrt;", line = 924)
    public final class675 method5723(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field11551;
            class675 var6 = null;
            if (arg4 == 0) {
                var6 = (class675) class185.method1526(arg1, arg3, arg2);
            }
            if (arg0) {
                this.field11554 = 103;
            }
            if (arg4 == 1) {
                var6 = (class675) class501.method3838(arg1, arg3, arg2);
            }
            if (arg4 == 2) {
                var6 = (class675) class590.method4352(arg1, arg3, arg2, field11557 != null ? field11557 : (field11557 = method5731(field11558[5])));
            }
            if (~arg4 == -4) {
                var6 = (class675) class254.method2130(arg1, arg3, arg2);
            }
            return var6;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field11558[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILjava/lang/String;)I", line = 952)
    public static final int method5724(int arg0, String arg1) {
        try {
            ++field11549;
            if (arg0 != -5) {
                return -48;
            } else {
                for (int var2 = 0; ~class200.field2957.length < ~var2; ++var2) {
                    if (class200.field2957[var2].equalsIgnoreCase(arg1)) {
                        return var2;
                    }
                }
                return -1;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11558[2] + arg0 + ',' + (arg1 != null ? field11558[1] : field11558[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[Luda;[BLha;BI)V", line = 973)
    public final void method5725(int arg0, class302[] arg1, byte[] arg2, class18 arg3, byte arg4, int arg5) {
        try {
            ++field11548;
            if (arg4 == 0) {
                class711 var7 = new class711(arg2);
                int var8 = -1;
                while (true) {
                    int var9 = var7.method5105((byte) 28);
                    if (~var9 == -1) {
                        return;
                    }
                    var8 += var9;
                    int var10 = 0;
                    while (true) {
                        int var11 = var7.method5090(-124);
                        if (~var11 == -1) {
                            break;
                        }
                        var10 += var11 + -1;
                        int var12 = var10 & 63;
                        int var13 = var10 >> 6 & 63;
                        int var14 = var10 >> 12;
                        int var15 = var7.method5128(0);
                        int var16 = var15 >> 2;
                        int var17 = var15 & 3;
                        int var18 = arg5 + var13;
                        int var19 = var12 - -arg0;
                        if (var18 > 0 && var19 > 0 && ~(super.field453 - 1) < ~var18 && ~(super.field455 - 1) < ~var19) {
                            class302 var20 = null;
                            if (!super.field458) {
                                int var21 = var14;
                                if (~(class76.field1089[1][var18][var19] & 2) == -3) {
                                    var21 = var14 - 1;
                                }
                                if (var21 >= 0) {
                                    var20 = arg1[var21];
                                }
                            }
                            this.method5720(var14, var20, arg3, var18, var14, -1, (byte) -106, var8, var16, var17, var19);
                        }
                    }
                }
            }
        } catch (RuntimeException var23) {
            throw class665.method4799(var23, field11558[11] + arg0 + ',' + (arg1 != null ? field11558[1] : field11558[0]) + ',' + (arg2 != null ? field11558[1] : field11558[0]) + ',' + (arg3 != null ? field11558[1] : field11558[0]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(IIIZ)V", line = 1047)
    public class794(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class248.field3552, class129.field1611);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZLha;Z)V", line = 1051)
    public final void method5726(boolean arg0, class18 arg1, boolean arg2) {
        try {
            class559.method4181();
            ++field11550;
            if (arg0) {
                this.field11554 = -110;
            }
            if (!arg2) {
                if (super.field440 > 1) {
                    for (int var4 = 0; var4 < super.field453; ++var4) {
                        for (int var5 = 0; ~super.field455 < ~var5; ++var5) {
                            if ((2 & class76.field1089[1][var4][var5]) == 2) {
                                class72.method754(var4, var5);
                            }
                        }
                    }
                }
                for (int var6 = 0; var6 < super.field440; ++var6) {
                    for (int var7 = 0; ~var7 >= ~super.field455; ++var7) {
                        for (int var8 = 0; ~super.field453 <= ~var8; ++var8) {
                            if ((4 & super.field445[var6][var8][var7]) != 0) {
                                int var9 = var8;
                                int var10 = var8;
                                int var11 = var7;
                                int var12 = var7;
                                while (var11 > 0 && ~(super.field445[var6][var8][var11 + -1] & 4) != -1 && -var11 + var12 < 10) {
                                    --var11;
                                }
                                while (~super.field455 < ~var12 && ~(super.field445[var6][var8][var12 - -1] & 4) != -1 && -var11 + var12 < 10) {
                                    ++var12;
                                }
                                label150: while (var9 > 0 && ~(-var9 + var10) > -11) {
                                    for (int var13 = var11; var12 >= var13; ++var13) {
                                        if ((4 & super.field445[var6][var9 - 1][var13]) == 0) {
                                            break label150;
                                        }
                                    }
                                    --var9;
                                }
                                label137: while (var10 < super.field453 && -var9 + var10 < 10) {
                                    for (int var14 = var11; ~var14 >= ~var12; ++var14) {
                                        if ((super.field445[var6][var10 - -1][var14] & 4) == 0) {
                                            break label137;
                                        }
                                    }
                                    ++var10;
                                }
                                if (~((var12 - var11 - -1) * (var10 - -1 + -var9)) <= -5) {
                                    int var15 = super.field456[var6][var9][var11];
                                    class125.method1116((var10 << 9) - -512, (var12 << 9) + 512, var9 << 9, var15, 19, var11 << 9, 4, var15, var6);
                                    for (int var16 = var9; ~var16 >= ~var10; ++var16) {
                                        for (int var17 = var11; var12 >= var17; ++var17) {
                                            super.field445[var6][var16][var17] = (byte) class434.method3377(super.field445[var6][var16][var17], -5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class238.method1973(255);
            }
            super.field445 = null;
        } catch (RuntimeException var19) {
            throw class665.method4799(var19, field11558[3] + arg0 + ',' + (arg1 != null ? field11558[1] : field11558[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)V", line = 1197)
    public static final void method5727(int arg0, boolean arg1) {
        try {
            class779[] var2 = class60.field926;
            for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                class779 var4 = var2[var3];
                var4.method5604(1350);
            }
            ++field11553;
            client.method4980(17712);
            class731.method5323(-4245);
            class217.method1837();
            for (int var5 = 0; ~var5 > -5; ++var5) {
                class195.field2919[var5].method2432(true);
            }
            class63.method672(false, 64);
            System.gc();
            class235.method1948(2, (byte) -29);
            class399.field5812 = false;
            class291.field4106 = arg0;
            class486.method3746((byte) -110);
            class470.method3615(true, (byte) -86);
            class601.method4441((byte) 72);
            class159.method1343((byte) -126);
            class126.method1122(arg0 + 121);
            if (arg1) {
                class699.method5035(13, 31754);
            } else {
                class699.method5035(3, 31754);
                try {
                    class192.method1601(field11558[6], class290.field4091, 4368);
                } catch (Throwable var7) {
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field11558[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILuda;IILha;)V", line = 1250)
    public final void method5728(int arg0, int arg1, int arg2, class302 arg3, int arg4, int arg5, class18 arg6) {
        try {
            ++field11547;
            class675 var8 = this.method5723(false, arg1, arg2, arg4, arg5);
            if (var8 != null) {
                class789 var9 = class101.field1359.method2832(arg0 ^ -158987177, var8.method584(false));
                int var10 = var8.method572(arg0 ^ -158987150);
                int var11 = var8.method585(-20175);
                if (var9.method5675(170)) {
                    class60.method653(-104, arg2, var9, arg4, arg1);
                }
                if (var8.method590(103)) {
                    var8.method581(-18864, arg6);
                }
                if (~arg5 != -1) {
                    if (arg5 == 1) {
                        class440.method3427(arg1, arg4, arg2);
                    } else if (arg5 != 2) {
                        if (arg5 == 3) {
                            class251.method2048(arg1, arg4, arg2);
                            if (~var9.field11480 == -2) {
                                arg3.method2423(arg4, (byte) 62, arg2);
                            }
                        }
                    } else {
                        class355.method2839(arg1, arg4, arg2, field11557 != null ? field11557 : (field11557 = method5731(field11558[5])));
                        if (var9.field11480 != 0 && ~super.field453 < ~(var9.field11452 + arg4) && ~super.field455 < ~(var9.field11452 + arg2) && ~super.field453 < ~(arg4 - -var9.field11390) && ~(var9.field11390 + arg2) > ~super.field455) {
                            arg3.method2421(arg2, var11, var9.field11413, var9.field11452, -7045, !var9.field11463, var9.field11390, arg4);
                        }
                        if (var10 == 9) {
                            if ((1 & var11) == 0) {
                                class750.method5431(arg4, (byte) -65, arg1, 8, arg2);
                            } else {
                                class750.method5431(arg4, (byte) -101, arg1, 16, arg2);
                            }
                        }
                    }
                } else {
                    class696.method5017(arg1, arg4, arg2);
                    if (var9.field11480 != 0) {
                        arg3.method2431(var11, var10, arg2, var9.field11413, 134217728, !var9.field11463, arg4);
                    }
                    if (~var9.field11446 == -2) {
                        if (~var11 == -1) {
                            class750.method5431(arg4, (byte) -69, arg1, 1, arg2);
                        } else if (~var11 != -2) {
                            if (var11 != 2) {
                                if (~var11 == -4) {
                                    class750.method5431(arg4, (byte) -122, arg1, 2, arg2);
                                }
                            } else {
                                class750.method5431(arg4 - -1, (byte) -121, arg1, 1, arg2);
                            }
                        } else {
                            class750.method5431(arg4, (byte) -107, arg1, 2, arg2 - -1);
                        }
                    }
                }
            }
            if (arg0 != -158987223) {
                field11545 = null;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field11558[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11558[1] : field11558[0]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field11558[1] : field11558[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([Luda;ILha;IIIIII[BI)V", line = 1344)
    public final void method5729(class302[] arg0, int arg1, class18 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10) {
        try {
            int var12 = -50 / ((65 - arg7) / 49);
            ++field11546;
            class711 var13 = new class711(arg9);
            int var14 = -1;
            while (true) {
                int var15 = var13.method5105((byte) 28);
                if (var15 == 0) {
                    return;
                }
                var14 += var15;
                int var16 = 0;
                while (true) {
                    int var17 = var13.method5090(-113);
                    if (~var17 == -1) {
                        break;
                    }
                    var16 += var17 + -1;
                    int var18 = var16 & 63;
                    int var19 = (var16 & 4093) >> 6;
                    int var20 = var16 >> 12;
                    int var21 = var13.method5128(0);
                    int var22 = var21 >> 2;
                    int var23 = 3 & var21;
                    if (~arg10 == ~var20 && arg1 <= var19 && var19 < arg1 + 8 && ~var18 <= ~arg6 && ~(arg6 + 8) < ~var18) {
                        class789 var24 = class101.field1359.method2832(123, var14);
                        int var25 = class78.method778(var18 & 7, arg3, var19 & 7, var23, var24.field11390, false, var24.field11452) + arg5;
                        int var26 = class277.method2260(var19 & 7, (byte) 109, var18 & 7, var24.field11452, var24.field11390, var23, arg3) + arg4;
                        if (var25 > 0 && var26 > 0 && ~var25 > ~(super.field453 + -1) && ~(super.field455 + -1) < ~var26) {
                            class302 var27 = null;
                            if (!super.field458) {
                                int var28 = arg8;
                                if ((2 & class76.field1089[1][var25][var26]) == 2) {
                                    var28 = arg8 - 1;
                                }
                                if (var28 >= 0) {
                                    var27 = arg0[var28];
                                }
                            }
                            this.method5720(arg8, var27, arg2, var25, arg8, -1, (byte) 126, var14, var22, arg3 + var23 & 3, var26);
                        }
                    }
                }
            }
        } catch (RuntimeException var30) {
            throw class665.method4799(var30, field11558[14] + (arg0 != null ? field11558[1] : field11558[0]) + ',' + arg1 + ',' + (arg2 != null ? field11558[1] : field11558[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field11558[1] : field11558[0]) + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILha;Ljc;)V", line = 1424)
    public final void method5730(int arg0, int arg1, int arg2, class18 arg3, class711 arg4) {
        try {
            ++field11552;
            if (!super.field458) {
                boolean var6 = false;
                class277 var7 = null;
                if (arg1 != 9907) {
                    this.field11554 = 66;
                }
                while (true) {
                    while (arg4.field9945 < arg4.field9996.length) {
                        int var8 = arg4.method5128(0);
                        if (var8 == 0) {
                            if (var7 == null) {
                                var7 = new class277(arg4);
                            } else {
                                var7.method2262(117, arg4);
                            }
                        } else if (var8 == 1) {
                            int var9 = arg4.method5128(arg1 ^ 9907);
                            if (var9 > 0) {
                                for (int var10 = 0; ~var9 < ~var10; ++var10) {
                                    class382 var11 = new class382(arg3, arg4, 2);
                                    if (~var11.field5563 == -32) {
                                        class210 var12 = class345.field5030.method4355(arg4.method5116((byte) -110), (byte) 91);
                                        var11.method3015(var12.field3056, var12.field3052, var12.field3051, 2, var12.field3054);
                                    }
                                    if (arg3.method198() > 0) {
                                        class330 var13 = var11.field5573;
                                        int var14 = var13.method2595((byte) 111) + (arg0 << 9);
                                        int var15 = (arg2 << 9) + var13.method2592(true);
                                        int var16 = var14 >> 9;
                                        int var17 = var15 >> 9;
                                        if (var16 >= 0 && ~var17 <= -1 && ~var16 > ~super.field453 && var17 < super.field455) {
                                            var13.method2596(var15, super.field456[var11.field5559][var16][var17] + -var13.method2590((byte) 103), arg1 ^ 9905, var14);
                                            class159.method1345(var11);
                                        }
                                    }
                                }
                            }
                        } else if (~var8 == -3) {
                            if (var7 == null) {
                                var7 = new class277();
                            }
                            var7.method2257((byte) -124, arg4);
                        } else if (var8 == 128) {
                            if (var7 == null) {
                                var7 = new class277();
                            }
                            var7.method2259(63, arg4);
                        } else {
                            if (var8 != 129) {
                                throw new IllegalStateException("");
                            }
                            if (super.field447 == null) {
                                super.field447 = new byte[4][][];
                            }
                            for (int var18 = 0; var18 < 4; ++var18) {
                                byte var19 = arg4.method5125((byte) -30);
                                if (var19 == 0 && super.field447[var18] != null) {
                                    int var20 = arg0;
                                    int var21 = arg0 + 64;
                                    int var22 = arg2;
                                    if (var21 < 0) {
                                        var21 = 0;
                                    } else if (~var21 <= ~super.field453) {
                                        var21 = super.field453;
                                    }
                                    if (arg0 >= 0) {
                                        if (arg0 >= super.field453) {
                                            var20 = super.field453;
                                        }
                                    } else {
                                        var20 = 0;
                                    }
                                    int var23 = arg2 + 64;
                                    if (arg2 >= 0) {
                                        if (~super.field455 >= ~arg2) {
                                            var22 = super.field455;
                                        }
                                    } else {
                                        var22 = 0;
                                    }
                                    if (~var23 <= -1) {
                                        if (var23 >= super.field455) {
                                            var23 = super.field455;
                                        }
                                    } else {
                                        var23 = 0;
                                    }
                                    while (~var21 < ~var20) {
                                        while (~var22 > ~var23) {
                                            super.field447[var18][var20][var22] = 0;
                                            ++var22;
                                        }
                                        ++var20;
                                    }
                                } else if (~var19 == -2) {
                                    if (super.field447[var18] == null) {
                                        super.field447[var18] = new byte[super.field453 - -1][super.field455 + 1];
                                    }
                                    for (int var24 = 0; var24 < 64; var24 += 4) {
                                        for (int var25 = 0; var25 < 64; var25 += 4) {
                                            byte var26 = arg4.method5125((byte) 122);
                                            for (int var27 = var24 - -arg0; var24 + 4 - -arg0 > var27; ++var27) {
                                                for (int var28 = arg2 + var25; ~(arg2 + var25 + 4) < ~var28; ++var28) {
                                                    if (var27 >= 0 && super.field453 > var27 && ~var28 <= -1 && ~super.field455 < ~var28) {
                                                        super.field447[var18][var27][var28] = var26;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (~var19 == -3) {
                                    if (super.field447[var18] == null) {
                                        super.field447[var18] = new byte[super.field453 + 1][super.field455 + 1];
                                    }
                                    if (var18 > 0) {
                                        int var29 = arg0;
                                        int var30 = arg0 + 64;
                                        int var31 = arg2;
                                        if (arg0 >= 0) {
                                            if (super.field453 <= arg0) {
                                                var29 = super.field453;
                                            }
                                        } else {
                                            var29 = 0;
                                        }
                                        int var32 = arg2 - -64;
                                        if (~var30 > -1) {
                                            var30 = 0;
                                        } else if (var30 >= super.field453) {
                                            var30 = super.field453;
                                        }
                                        if (arg2 >= 0) {
                                            if (~arg2 <= ~super.field455) {
                                                var31 = super.field455;
                                            }
                                        } else {
                                            var31 = 0;
                                        }
                                        if (var32 >= 0) {
                                            if (~super.field455 >= ~var32) {
                                                var32 = super.field455;
                                            }
                                        } else {
                                            var32 = 0;
                                        }
                                        while (~var29 > ~var30) {
                                            while (var31 < var32) {
                                                super.field447[var18][var29][var31] = super.field447[var18 + -1][var29][var31];
                                                ++var31;
                                            }
                                            ++var29;
                                        }
                                    }
                                }
                            }
                            var6 = true;
                        }
                    }
                    if (var7 != null) {
                        for (int var33 = 0; ~var33 > -9; ++var33) {
                            for (int var34 = 0; var34 < 8; ++var34) {
                                int var35 = (arg0 >> 3) + var33;
                                int var36 = (arg2 >> 3) + var34;
                                if (var35 >= 0 && super.field453 >> 3 > var35 && ~var36 <= -1 && ~(super.field455 >> 3) < ~var36) {
                                    class32.method343(-33, var36, var7, var35);
                                }
                            }
                        }
                    }
                    if (!var6 && super.field447 != null) {
                        for (int var37 = 0; var37 < 4; ++var37) {
                            if (super.field447[var37] != null) {
                                for (int var38 = 0; ~var38 > -17; ++var38) {
                                    for (int var39 = 0; ~var39 > -17; ++var39) {
                                        int var40 = (arg0 >> 2) + var38;
                                        int var41 = (arg2 >> 2) + var39;
                                        if (~var40 <= -1 && var40 < 26 && var41 >= 0 && ~var41 > -27) {
                                            super.field447[var37][var40][var41] = 0;
                                        }
                                    }
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        } catch (RuntimeException var43) {
            throw class665.method4799(var43, field11558[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11558[1] : field11558[0]) + ',' + (arg4 != null ? field11558[1] : field11558[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5732(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 2);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5733(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 69;
                    break;
                case 1:
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 98;
                    break;
                case 3:
                    var10005 = 64;
                    break;
                default:
                    var10005 = 2;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
