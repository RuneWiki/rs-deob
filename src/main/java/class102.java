import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class class102 {

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "[I")
    public static int[] field1910 = new int[5];

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static volatile int field1912 = 0;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lwa;")
    public static class200 field1908;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "[Lbf;")
    public static class17[] field1914;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method668(int arg0, Component arg1);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static void method669(byte arg0) {
        field1914 = null;
        if (arg0 <= -3) {
            field1908 = null;
            field1910 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)I")
    public abstract int method670(byte arg0);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III[Lwa;BIIIII)V")
    public static final void method671(int arg0, int arg1, int arg2, class200[] arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class62.method409(arg1, arg2, arg8, arg0);
        class113.method745();
        if (arg4 != 26) {
            return;
        }
        field1909++;
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class200 var11 = arg3[var10];
            if (var11 != null && (var11.field3794 == arg7 || arg7 == -1412584499 && class100.field1871 == var11)) {
                int var12;
                if (arg9 == -1) {
                    class67.field1176[class11.field175] = var11.field3822 + arg5;
                    class33.field499[class11.field175] = var11.field3842 + arg6;
                    class70.field1201[class11.field175] = var11.field3845;
                    class4.field32[class11.field175] = var11.field3925;
                    var12 = class11.field175++;
                } else {
                    var12 = arg9;
                }
                var11.field3781 = var12;
                var11.field3797 = class120.field2304;
                if (!var11.field3927 || !class185.method1195(var11, (byte) 49)) {
                    if (var11.field3865 > 0) {
                        class125.method866(var11, 256);
                    }
                    int var13 = var11.field3842 + arg6;
                    int var14 = var11.field3822 + arg5;
                    int var15 = var11.field3899;
                    if (class100.field1871 == var11) {
                        if (arg7 != -1412584499 && !var11.field3913) {
                            class46.field754 = arg3;
                            class149.field2873 = arg5;
                            class98.field1799 = arg6;
                            continue;
                        }
                        if (!var11.field3913) {
                            var15 = 128;
                        }
                        if (class184.field3507 && class13.field209) {
                            int var16 = class79.field1389;
                            int var17 = var16 - class108.field2015;
                            if (var17 < class194.field3694) {
                                var17 = class194.field3694;
                            }
                            if (var11.field3845 + var17 > class194.field3694 - -class11.field174.field3845) {
                                var17 = class11.field174.field3845 + class194.field3694 - var11.field3845;
                            }
                            int var18 = class89.field1559;
                            int var19 = var18 - class109.field2034;
                            if (var19 < class49.field854) {
                                var19 = class49.field854;
                            }
                            var14 = var17;
                            if (var19 + var11.field3925 > class49.field854 - -class11.field174.field3925) {
                                var19 = class49.field854 + class11.field174.field3925 - var11.field3925;
                            }
                            var13 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field3888 == 2) {
                        var20 = arg2;
                        var21 = arg0;
                        var22 = arg1;
                        var23 = arg8;
                    } else if (var11.field3888 == 9) {
                        int var26 = var14;
                        int var27 = var13;
                        int var28 = var11.field3925 + var13;
                        int var29 = var11.field3845 + var14;
                        if (var29 < var14) {
                            var26 = var29;
                            var29 = var14;
                        }
                        var22 = var26 <= arg1 ? arg1 : var26;
                        var29++;
                        var23 = var29 < arg8 ? var29 : arg8;
                        if (var13 > var28) {
                            var27 = var28;
                            var28 = var13;
                        }
                        var20 = var27 > arg2 ? var27 : arg2;
                        var28++;
                        var21 = var28 < arg0 ? var28 : arg0;
                    } else {
                        int var24 = var11.field3845 + var14;
                        var22 = arg1 >= var14 ? arg1 : var14;
                        var20 = arg2 >= var13 ? arg2 : var13;
                        var23 = var24 >= arg8 ? arg8 : var24;
                        int var25 = var13 + var11.field3925;
                        var21 = arg0 > var25 ? var25 : arg0;
                    }
                    if (!var11.field3927 || var22 < var23 && var20 < var21) {
                        if (var11.field3865 != 0) {
                            if (var11.field3865 == 1337) {
                                class151.field2895 = var14;
                                class75.field1292 = var13;
                                class36.method240(var11.field3845, 2047, var11.field3925, var13, var14);
                                class62.method409(arg1, arg2, arg8, arg0);
                                continue;
                            }
                            if (var11.field3865 == 1338) {
                                class73.method457(var13, var12, var14, arg4 ^ 0x16DA);
                                class62.method409(arg1, arg2, arg8, arg0);
                                continue;
                            }
                        }
                        int var32 = class79.field1389;
                        int var33 = class89.field1559;
                        if (!class180.field3415 && var32 >= var22 && var20 <= var33 && var23 > var32 && var21 > var33) {
                            class99.method648(var11, var33 - var13, arg4 + -22, var32 - var14);
                        }
                        if (var11.field3888 == 0) {
                            if (!var11.field3927 && class185.method1195(var11, (byte) 52) && class77.field1342 != var11) {
                                continue;
                            }
                            if (!var11.field3927) {
                                if (var11.field3873 - var11.field3925 < var11.field3907) {
                                    var11.field3907 = var11.field3873 - var11.field3925;
                                }
                                if (var11.field3907 < 0) {
                                    var11.field3907 = 0;
                                }
                            }
                            method671(var21, var22, var20, arg3, (byte) 26, var14 - var11.field3829, -var11.field3907 + var13, var11.field3833, var23, var12);
                            if (var11.field3796 != null) {
                                method671(var21, var22, var20, var11.field3796, (byte) 26, var14 - var11.field3829, -var11.field3907 + var13, var11.field3833, var23, var12);
                            }
                            class118 var34 = (class118) class165.field3162.method213(arg4 ^ 0xFFFFFFB9, (long) var11.field3833);
                            if (var34 != null) {
                                if (var34.field2281 == 0 && var22 <= class79.field1389 && class89.field1559 >= var20 && var23 > class79.field1389 && class89.field1559 < var21 && !class180.field3415 && !class206.field4004) {
                                    class53.field946 = 1;
                                    class116.field2235[0] = class76.field1325;
                                    class148.field2845[0] = class10.field119;
                                    class75.field1308[0] = 1005;
                                }
                                class154.method1045(var34.field2272, var13, var21, var22, var20, (byte) 78, var12, var14, var23);
                            }
                            class62.method409(arg1, arg2, arg8, arg0);
                            class113.method745();
                        }
                        if (class42.field702[var12] || class93.field1682 > 1) {
                            if (var11.field3888 == 0 && !var11.field3927 && var11.field3925 < var11.field3873) {
                                class32.method210(-1, var13, var11.field3845 + var14, var11.field3925, var11.field3907, var11.field3873);
                            }
                            if (var11.field3888 != 1) {
                                if (var11.field3888 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var11.field3925; var36++) {
                                        for (int var37 = 0; var37 < var11.field3845; var37++) {
                                            int var38 = (var11.field3828 + 32) * var36 + var13;
                                            int var39 = var14 + (var11.field3880 + 32) * var37;
                                            if (var35 < 20) {
                                                var39 += var11.field3787[var35];
                                                var38 += var11.field3901[var35];
                                            }
                                            if (var11.field3883[var35] > 0) {
                                                boolean var41 = false;
                                                boolean var42 = false;
                                                int var43 = var11.field3883[var35] - 1;
                                                if (var39 + 32 > arg1 && arg8 > var39 && arg2 < var38 + 32 && var38 < arg0 || class33.field511 == var11 && class80.field1406 == var35) {
                                                    class17 var44;
                                                    if (class135.field2539 == 1 && class184.field3506 == var35 && class185.field3520 == var11.field3833) {
                                                        var44 = class117.method840(2, var11.field3905[var35], (byte) -94, 0, false, var43);
                                                    } else {
                                                        var44 = class117.method840(1, var11.field3905[var35], (byte) -91, 3153952, false, var43);
                                                    }
                                                    if (var44 == null) {
                                                        class168.method1116(var11, -88);
                                                    } else if (class33.field511 == var11 && class80.field1406 == var35) {
                                                        int var45 = class89.field1559 - class184.field3493;
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        int var46 = class79.field1389 - class196.field3714;
                                                        if (var46 < 5 && var46 > -5) {
                                                            var46 = 0;
                                                        }
                                                        if (class129.field2459 < 5) {
                                                            var46 = 0;
                                                            var45 = 0;
                                                        }
                                                        var44.method104(var39 + var46, var38 + var45, 128);
                                                        if (arg7 != -1) {
                                                            class200 var47 = arg3[arg7 & 0xFFFF];
                                                            int var48 = class62.field1049;
                                                            int var49 = class62.field1048;
                                                            if (var38 + var45 < var48 && var47.field3907 > 0) {
                                                                int var50 = (var48 - var38 - var45) * class145.field2769 / 3;
                                                                if (var50 > class145.field2769 * 10) {
                                                                    var50 = class145.field2769 * 10;
                                                                }
                                                                if (var47.field3907 < var50) {
                                                                    var50 = var47.field3907;
                                                                }
                                                                class184.field3493 += var50;
                                                                var47.field3907 -= var50;
                                                                class168.method1116(var47, -75);
                                                            }
                                                            if (var38 + var45 + 32 > var49 && var47.field3873 - var47.field3925 > var47.field3907) {
                                                                int var51 = (var38 + var45 + 32 - var49) * class145.field2769 / 3;
                                                                if (class145.field2769 * 10 < var51) {
                                                                    var51 = class145.field2769 * 10;
                                                                }
                                                                if (var51 > var47.field3873 - var47.field3925 - var47.field3907) {
                                                                    var51 = var47.field3873 - var47.field3925 - var47.field3907;
                                                                }
                                                                var47.field3907 += var51;
                                                                class184.field3493 -= var51;
                                                                class168.method1116(var47, arg4 - 150);
                                                            }
                                                        }
                                                    } else if (class169.field3255 == var11 && class129.field2446 == var35) {
                                                        var44.method104(var39, var38, 128);
                                                    } else {
                                                        var44.method105(var39, var38);
                                                    }
                                                }
                                            } else if (var11.field3795 != null && var35 < 20) {
                                                class17 var40 = var11.method1295(var35, (byte) 110);
                                                if (var40 != null) {
                                                    var40.method105(var39, var38);
                                                } else if (class129.field2441) {
                                                    class168.method1116(var11, -82);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var11.field3888 == 3) {
                                    int var52;
                                    if (class206.method1333(var11, (byte) 116)) {
                                        var52 = var11.field3918;
                                        if (class77.field1342 == var11 && var11.field3774 != 0) {
                                            var52 = var11.field3774;
                                        }
                                    } else {
                                        var52 = var11.field3800;
                                        if (class77.field1342 == var11 && var11.field3771 != 0) {
                                            var52 = var11.field3771;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field3783) {
                                            class62.method412(var14, var13, var11.field3845, var11.field3925, var52);
                                        } else {
                                            class62.method417(var14, var13, var11.field3845, var11.field3925, var52);
                                        }
                                    } else if (var11.field3783) {
                                        class62.method406(var14, var13, var11.field3845, var11.field3925, var52, 256 - (var15 & 0xFF));
                                    } else {
                                        class62.method416(var14, var13, var11.field3845, var11.field3925, var52, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field3888 == 4) {
                                    class177 var53 = var11.method1289((byte) -68);
                                    if (var53 != null) {
                                        class10 var54 = var11.field3922;
                                        int var55;
                                        if (class206.method1333(var11, (byte) 120)) {
                                            var55 = var11.field3918;
                                            if (class77.field1342 == var11 && var11.field3774 != 0) {
                                                var55 = var11.field3774;
                                            }
                                            if (var11.field3877.method40((byte) -59) > 0) {
                                                var54 = var11.field3877;
                                            }
                                        } else {
                                            var55 = var11.field3800;
                                            if (class77.field1342 == var11 && var11.field3771 != 0) {
                                                var55 = var11.field3771;
                                            }
                                        }
                                        if (var11.field3927 && var11.field3766 != -1) {
                                            class94 var56 = class104.method678(arg4 ^ 0x1EE, var11.field3766);
                                            var54 = var56.field1718;
                                            if (var54 == null) {
                                                var54 = class39.field664;
                                            }
                                            if ((var56.field1693 == 1 || var11.field3919 != 1) && var11.field3919 != -1) {
                                                var54 = class67.method440(0, new class10[] { class116.field2220, var54, class45.field730, class84.method512(var11.field3919, (byte) 36) });
                                            }
                                        }
                                        if (class137.field2569 == var11) {
                                            var55 = var11.field3800;
                                            var54 = class141.field2657;
                                        }
                                        if (!var11.field3927) {
                                            var54 = class95.method629(var11, false, var54);
                                        }
                                        var53.method1275(var54, var14, var13, var11.field3845, var11.field3925, var55, var11.field3818 ? 0 : -1, var11.field3867, var11.field3848, var11.field3874);
                                    } else if (class129.field2441) {
                                        class168.method1116(var11, -74);
                                    }
                                } else if (var11.field3888 == 5) {
                                    if (var11.field3927) {
                                        class17 var57;
                                        if (var11.field3766 == -1) {
                                            var57 = var11.method1302(true, false);
                                        } else {
                                            var57 = class117.method840(var11.field3864, var11.field3919, (byte) -105, var11.field3836, false, var11.field3766);
                                        }
                                        if (var57 != null) {
                                            int var58 = var57.field256;
                                            int var59 = var57.field260;
                                            if (var11.field3885) {
                                                class62.method414(var14, var13, var11.field3845 + var14, var11.field3925 + var13);
                                                int var61 = (var11.field3845 + var58 - 1) / var58;
                                                int var62 = (var11.field3925 + var59 - 1) / var59;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var11.field3876 != 0) {
                                                            var57.method102(var58 / 2 + var58 * var63 + var14, var59 * var64 + (var13 - -(var59 / 2)), var11.field3876, 4096);
                                                        } else if (var15 == 0) {
                                                            var57.method105(var58 * var63 + var14, var13 - -(var59 * var64));
                                                        } else {
                                                            var57.method104(var14 + var58 * var63, var59 * var64 + var13, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class62.method409(arg1, arg2, arg8, arg0);
                                            } else {
                                                int var60 = var11.field3845 * 4096 / var58;
                                                if (var11.field3876 != 0) {
                                                    var57.method102(var11.field3845 / 2 + var14, var13 - -(var11.field3925 / 2), var11.field3876, var60);
                                                } else if (var15 != 0) {
                                                    var57.method106(var14, var13, var11.field3845, var11.field3925, 256 - (var15 & 0xFF));
                                                } else if (var11.field3845 == var58 && var11.field3925 == var59) {
                                                    var57.method105(var14, var13);
                                                } else {
                                                    var57.method112(var14, var13, var11.field3845, var11.field3925);
                                                }
                                            }
                                        } else if (class129.field2441) {
                                            class168.method1116(var11, -82);
                                        }
                                    } else {
                                        class17 var65 = var11.method1302(true, class206.method1333(var11, (byte) 115));
                                        if (var65 != null) {
                                            var65.method105(var14, var13);
                                        } else if (class129.field2441) {
                                            class168.method1116(var11, -83);
                                        }
                                    }
                                } else if (var11.field3888 == 6) {
                                    boolean var66 = class206.method1333(var11, (byte) 118);
                                    class164 var67 = null;
                                    int var68;
                                    if (var66) {
                                        var68 = var11.field3763;
                                    } else {
                                        var68 = var11.field3920;
                                    }
                                    int var69 = 0;
                                    if (var11.field3766 != -1) {
                                        class94 var74 = class104.method678(500, var11.field3766);
                                        if (var74 != null) {
                                            class94 var75 = var74.method615(var11.field3919, false);
                                            var67 = var75.method622(1, 0, null, 0);
                                            if (var67 == null) {
                                                class168.method1116(var11, arg4 - 122);
                                            } else {
                                                var67.method1093();
                                                var69 = -var67.field2341 / 2;
                                            }
                                        }
                                    } else if (var11.field3841 == 5) {
                                        if (var11.field3788 == -1) {
                                            var67 = class160.field3077.method825(null, null, false, -1, -1);
                                        } else {
                                            int var71 = var11.field3788 & 0x7FF;
                                            if (class78.field1370 == var71) {
                                                var71 = 2047;
                                            }
                                            class38 var72 = class2.field10[var71];
                                            class77 var73 = var68 == -1 ? null : class142.method958((byte) -98, var68);
                                            if (var72 != null && (int) var72.field602.method62((byte) -97) << 11 == (var11.field3788 & 0xFFFFF800)) {
                                                var67 = var72.field609.method825(null, var73, false, var11.field3893, 0);
                                            }
                                        }
                                    } else if (var68 == -1) {
                                        var67 = var11.method1294(var66, null, -1, false, class145.field2767.field609);
                                        if (var67 == null && class129.field2441) {
                                            class168.method1116(var11, -90);
                                        }
                                    } else {
                                        class77 var70 = class142.method958((byte) -118, var68);
                                        var67 = var11.method1294(var66, var70, var11.field3893, false, class145.field2767.field609);
                                        if (var67 == null && class129.field2441) {
                                            class168.method1116(var11, arg4 ^ 0xFFFFFFAA);
                                        }
                                    }
                                    if (var67 != null) {
                                        class113.method752(var11.field3845 / 2 + var11.field3782 + var14, var11.field3925 / 2 + var13 - -var11.field3887);
                                        int var76 = class113.field2120[var11.field3827] * var11.field3807 >> 16;
                                        int var77 = class113.field2124[var11.field3827] * var11.field3807 >> 16;
                                        if (!var11.field3927) {
                                            var67.method1095(0, var11.field3909, 0, var11.field3827, 0, var77, var76);
                                        } else if (var11.field3853) {
                                            var67.method1081(0, var11.field3909, var11.field3825, var11.field3827, var11.field3862, var11.field3902 + var69 + var77, var11.field3902 + var76, var11.field3807);
                                        } else {
                                            var67.method1095(0, var11.field3909, var11.field3825, var11.field3827, var11.field3862, var69 + var77 + var11.field3902, var76 - -var11.field3902);
                                        }
                                        class113.method754();
                                    }
                                } else {
                                    if (var11.field3888 == 7) {
                                        class177 var78 = var11.method1289((byte) -52);
                                        if (var78 == null) {
                                            if (class129.field2441) {
                                                class168.method1116(var11, -108);
                                            }
                                            continue;
                                        }
                                        int var79 = 0;
                                        for (int var80 = 0; var80 < var11.field3925; var80++) {
                                            for (int var81 = 0; var81 < var11.field3845; var81++) {
                                                if (var11.field3883[var79] > 0) {
                                                    class94 var82 = class104.method678(500, var11.field3883[var79] - 1);
                                                    class10 var83;
                                                    if (var82.field1693 != 1 && var11.field3905[var79] == 1) {
                                                        var83 = class67.method440(0, new class10[] { class116.field2220, var82.field1718, class184.field3502 });
                                                    } else {
                                                        var83 = class67.method440(0, new class10[] { class116.field2220, var82.field1718, class45.field730, class84.method512(var11.field3905[var79], (byte) 36) });
                                                    }
                                                    int var84 = (var11.field3880 + 115) * var81 + var14;
                                                    int var85 = var13 + (var11.field3828 + 12) * var80;
                                                    if (var11.field3867 == 0) {
                                                        var78.method1266(var83, var84, var85, var11.field3800, var11.field3818 ? 0 : -1);
                                                    } else if (var11.field3867 == 1) {
                                                        var78.method1262(var83, var11.field3845 / 2 + var84, var85, var11.field3800, var11.field3818 ? 0 : -1);
                                                    } else {
                                                        var78.method1265(var83, var11.field3845 + var84 - 1, var85, var11.field3800, var11.field3818 ? 0 : -1);
                                                    }
                                                }
                                                var79++;
                                            }
                                        }
                                    }
                                    if (var11.field3888 == 8 && field1908 == var11 && class58.field1024 == class155.field3012) {
                                        int var86 = 0;
                                        class177 var87 = class133.field2496;
                                        int var88 = 0;
                                        class10 var89 = var11.field3922;
                                        class10 var90 = class95.method629(var11, false, var89);
                                        while (var90.method40((byte) -94) > 0) {
                                            int var98 = var90.method53((byte) -126, class128.field2440);
                                            class10 var99;
                                            if (var98 == -1) {
                                                var99 = var90;
                                                var90 = class10.field119;
                                            } else {
                                                var99 = var90.method44(var98, 0, (byte) -111);
                                                var90 = var90.method52((byte) -118, var98 + 4);
                                            }
                                            int var100 = var87.method1270(var99);
                                            var88 += var87.field3754 + 1;
                                            if (var100 > var86) {
                                                var86 = var100;
                                            }
                                        }
                                        var86 += 6;
                                        var88 += 7;
                                        int var91 = var11.field3845 + var14 - var86 - 5;
                                        int var92 = var11.field3925 + var13 + 5;
                                        if (arg0 < var88 + var92) {
                                            var92 = arg0 - var88;
                                        }
                                        if (var14 + 5 > var91) {
                                            var91 = var14 + 5;
                                        }
                                        if (var91 + var86 > arg8) {
                                            var91 = arg8 - var86;
                                        }
                                        class62.method412(var91, var92, var86, var88, 16777120);
                                        class62.method417(var91, var92, var86, var88, 0);
                                        class10 var93 = var11.field3922;
                                        int var94 = var87.field3754 + var92 + 2;
                                        class10 var95 = class95.method629(var11, false, var93);
                                        while (var95.method40((byte) -24) > 0) {
                                            int var96 = var95.method53((byte) 68, class128.field2440);
                                            class10 var97;
                                            if (var96 == -1) {
                                                var97 = var95;
                                                var95 = class10.field119;
                                            } else {
                                                var97 = var95.method44(var96, 0, (byte) 113);
                                                var95 = var95.method52((byte) -118, var96 + 4);
                                            }
                                            var87.method1266(var97, var91 + 3, var94, 0, -1);
                                            var94 += var87.field3754 + 1;
                                        }
                                    }
                                    if (var11.field3888 == 9) {
                                        if (var11.field3881 == 1) {
                                            class62.method413(var14, var13, var11.field3845 + var14, var13 - -var11.field3925, var11.field3800);
                                        } else {
                                            int var101 = var11.field3845 < 0 ? -var11.field3845 : var11.field3845;
                                            int var102 = var11.field3925 < 0 ? -var11.field3925 : var11.field3925;
                                            int var103 = var101;
                                            if (var102 > var101) {
                                                var103 = var102;
                                            }
                                            if (var103 != 0) {
                                                int var104 = (var11.field3845 << 16) / var103;
                                                int var105 = (var11.field3925 << 16) / var103;
                                                if (var105 > var104) {
                                                    var105 = -var105;
                                                } else {
                                                    var104 = -var104;
                                                }
                                                int var106 = var11.field3881 * var105 + 1 >> 17;
                                                int var107 = var11.field3881 * var105 >> 17;
                                                int var108 = var11.field3881 * var104 >> 17;
                                                int var109 = var11.field3881 * var104 + 1 >> 17;
                                                int var110 = var14 - arg1;
                                                int var111 = var13 - arg2;
                                                int var112 = var110 + var107;
                                                int var113 = var110 + var11.field3845 - var106;
                                                int var114 = var107 + var110 + var11.field3845;
                                                int var115 = var110 - var106;
                                                int var116 = var108 + var111;
                                                int var117 = var111 - var109;
                                                int var118 = var111 + var11.field3925 + var108;
                                                int var119 = var11.field3925 + var111 - var109;
                                                class113.method751(var112, var115, var113);
                                                class113.method758(var116, var117, var119, var112, var115, var113, var11.field3800);
                                                class113.method751(var112, var113, var114);
                                                class113.method758(var116, var119, var118, var112, var113, var114, var11.field3800);
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
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lai;BLai;Lc;)[Lta;")
    public static final class173[] method672(class10 arg0, byte arg1, class10 arg2, class21 arg3) {
        field1907++;
        if (arg1 <= 64) {
            return null;
        } else {
            int var4 = arg3.method156(0, arg0);
            int var5 = arg3.method154(var4, true, arg2);
            return class126.method873(var5, (byte) 118, var4, arg3);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method673(Component arg0, byte arg1);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZB)V")
    public static final void method674(boolean arg0, byte arg1) {
        field1913++;
        if (class20.field297 == null) {
            return;
        }
        try {
            class114 var2 = new class114(4);
            var2.method781(0, arg0 ? 2 : 3);
            var2.method805(0, (byte) -125);
            class20.field297.method557(4, var2.field2160, 0, 119);
            if (arg1 < 122) {
                field1910 = null;
            }
        } catch (IOException var4) {
            try {
                class20.field297.method552(-5034);
            } catch (Exception var3) {
            }
            class64.field1066++;
            class20.field297 = null;
        }
    }
}
