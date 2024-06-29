import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class29 extends class183 {

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field502 = 0;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "Z")
    public static boolean field521 = true;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public int field504;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public int field522;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "Ljb;")
    public class100 field510;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "Ljb;")
    public class100 field519;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "Ljj;")
    public static class108 field524;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "Lve;")
    public static class225 field514;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "Lde;")
    public class39 field508;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "[I")
    public int[] field506;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "[Lod;")
    public static class155[] field517;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZIIIII[Lvc;III)V")
    public static final void method201(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class223[] arg6, int arg7, int arg8, int arg9) {
        field512++;
        class99.method707(arg4, arg9, arg1, arg7);
        class206.method1345();
        int var10 = 0;
        if (!arg0) {
            return;
        }
        while (arg6.length > var10) {
            class223 var11 = arg6[var10];
            if (var11 != null && (var11.field4170 == arg2 || arg2 == -1412584499 && class235.field4364 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class172.field2999[field502] = var11.field4039 + arg5;
                    class166.field2860[field502] = var11.field4043 + arg8;
                    class128.field2277[field502] = var11.field4130;
                    class158.field2749[field502] = var11.field4134;
                    var12 = field502++;
                } else {
                    var12 = arg3;
                }
                var11.field4155 = class46.field868;
                var11.field4157 = var12;
                if (!var11.field4118 || !class54.method391(var11, (byte) -63)) {
                    label785: {
                        if (var11.field4033 > 0) {
                            class27.method194(0, var11);
                        }
                        int var13 = var11.field4043 + arg8;
                        int var14 = var11.field4102;
                        int var15 = var11.field4039 + arg5;
                        if (class153.field2669 && (class117.method821(var11, 21064) != 0 || var11.field4076 == 0) && var14 > 127) {
                            var14 = 127;
                        }
                        if (class235.field4364 == var11) {
                            if (arg2 != -1412584499 && !var11.field4114) {
                                class225.field4233 = arg6;
                                class13.field260 = arg8;
                                class84.field1638 = arg5;
                                break label785;
                            }
                            if (!var11.field4114) {
                                var14 = 128;
                            }
                            if (class112.field2018 && class171.field2986) {
                                int var16 = class27.field486;
                                int var17 = var16 - class213.field3824;
                                if (class213.field3825 > var17) {
                                    var17 = class213.field3825;
                                }
                                int var18 = class7.field151;
                                if (class213.field3825 + class61.field1148.field4130 < var11.field4130 + var17) {
                                    var17 = class213.field3825 + class61.field1148.field4130 - var11.field4130;
                                }
                                int var19 = var18 - class215.field3919;
                                var15 = var17;
                                if (class70.field1320 > var19) {
                                    var19 = class70.field1320;
                                }
                                if (class70.field1320 + class61.field1148.field4134 < var11.field4134 + var19) {
                                    var19 = class61.field1148.field4134 + class70.field1320 - var11.field4134;
                                }
                                var13 = var19;
                            }
                        }
                        int var20;
                        int var21;
                        int var22;
                        int var23;
                        if (var11.field4076 == 2) {
                            var20 = arg9;
                            var21 = arg1;
                            var22 = arg7;
                            var23 = arg4;
                        } else {
                            var23 = arg4 < var15 ? var15 : arg4;
                            int var24 = var11.field4130 + var15;
                            int var25 = var11.field4134 + var13;
                            var20 = arg9 >= var13 ? arg9 : var13;
                            if (var11.field4076 == 9) {
                                var25++;
                                var24++;
                            }
                            var21 = arg1 <= var24 ? arg1 : var24;
                            var22 = arg7 > var25 ? var25 : arg7;
                        }
                        if (!var11.field4118 || var21 > var23 && var20 < var22) {
                            label792: {
                                if (var11.field4033 != 0) {
                                    if (var11.field4033 == 1337) {
                                        class120.field2141 = var13;
                                        class135.field2422 = var15;
                                        class154.method992(var13, var11.field4134, var11.field4130, var15, !arg0);
                                        class99.method707(arg4, arg9, arg1, arg7);
                                        break label792;
                                    }
                                    if (var11.field4033 == 1338) {
                                        if (var11.method1442(127)) {
                                            class40.method282(-1958521625, var12, var11, var13, var15);
                                            class99.method707(arg4, arg9, arg1, arg7);
                                        }
                                        break label792;
                                    }
                                    if (var11.field4033 == 1339) {
                                        if (var11.method1442(125)) {
                                            class133.method900(var11, 3, var12, var15, var13);
                                            class99.method707(arg4, arg9, arg1, arg7);
                                        }
                                        break label792;
                                    }
                                    if (var11.field4033 == 1400) {
                                        class153.method988(var11.field4130, var15, (byte) 104, var13, var11.field4134);
                                        class68.field1289[var12] = true;
                                        class187.field3219[var12] = true;
                                        class99.method707(arg4, arg9, arg1, arg7);
                                        break label792;
                                    }
                                    if (var11.field4033 == 1401) {
                                        class22.method160(var11.field4134, 0, var13, var11.field4130, var15);
                                        class68.field1289[var12] = true;
                                        class187.field3219[var12] = true;
                                        class99.method707(arg4, arg9, arg1, arg7);
                                        break label792;
                                    }
                                }
                                if (var11.field4076 == 0 && var11.field4086 && class27.field486 >= var23 && class7.field151 >= var20 && var21 > class27.field486 && var22 > class7.field151 && !class58.field1086 && !class153.field2669) {
                                    class30.field525[0] = class105.field1929;
                                    class73.field1380[0] = class94.field1752;
                                    class108.field1990[0] = 1003;
                                    class179.field3071 = 1;
                                }
                                int var26 = class27.field486;
                                int var27 = class7.field151;
                                if (!class58.field1086 && var23 <= var26 && var20 <= var27 && var21 > var26 && var27 < var22) {
                                    class128.method878(var27 - var13, var11, 28236, var26 - var15);
                                }
                                if (var11.field4076 == 0) {
                                    if (!var11.field4118 && class54.method391(var11, (byte) -63) && class226.field4253 != var11) {
                                        break label792;
                                    }
                                    if (!var11.field4118) {
                                        if (var11.field4026 > var11.field4025 - var11.field4134) {
                                            var11.field4026 = var11.field4025 - var11.field4134;
                                        }
                                        if (var11.field4026 < 0) {
                                            var11.field4026 = 0;
                                        }
                                    }
                                    method201(true, var21, var11.field4040, var12, var23, var15 - var11.field4132, arg6, var22, var13 - var11.field4026, var20);
                                    if (var11.field4169 != null) {
                                        method201(true, var21, var11.field4040, var12, var23, var15 - var11.field4132, var11.field4169, var22, var13 - var11.field4026, var20);
                                    }
                                    class104 var28 = (class104) class129.field2294.method828((long) var11.field4040, (byte) -40);
                                    if (var28 != null) {
                                        if (var28.field1892 == 0 && class27.field486 >= var23 && class7.field151 >= var20 && var21 > class27.field486 && var22 > class7.field151 && !class58.field1086 && !class153.field2669) {
                                            class179.field3071 = 1;
                                            class108.field1990[0] = 1003;
                                            class30.field525[0] = class105.field1929;
                                            class73.field1380[0] = class94.field1752;
                                        }
                                        class31.method215(var22, var28.field1893, var15, -125, var21, var23, var20, var12, var13);
                                    }
                                    class99.method707(arg4, arg9, arg1, arg7);
                                    class206.method1345();
                                }
                                if (class210.field3749[var12] || class103.field1888 > 1) {
                                    if (var11.field4076 == 0 && !var11.field4118 && var11.field4025 > var11.field4134) {
                                        class227.method1492((byte) 113, var11.field4025, var11.field4026, var11.field4134, var13, var11.field4130 + var15);
                                    }
                                    if (var11.field4076 != 1) {
                                        if (var11.field4076 == 2) {
                                            int var29 = 0;
                                            for (int var30 = 0; var30 < var11.field4158; var30++) {
                                                for (int var31 = 0; var31 < var11.field4136; var31++) {
                                                    int var32 = var15 + (var11.field4145 + 32) * var31;
                                                    int var33 = (var11.field4108 + 32) * var30 + var13;
                                                    if (var29 < 20) {
                                                        var32 += var11.field4111[var29];
                                                        var33 += var11.field4153[var29];
                                                    }
                                                    if (var11.field4166[var29] > 0) {
                                                        boolean var34 = false;
                                                        boolean var35 = false;
                                                        int var36 = var11.field4166[var29] - 1;
                                                        if (arg4 < var32 + 32 && arg1 > var32 && var33 + 32 > arg9 && arg7 > var33 || class220.field3989 == var11 && class80.field1560 == var29) {
                                                            class155 var37;
                                                            if (class39.field719 == 1 && class129.field2300 == var29 && class172.field2998 == var11.field4040) {
                                                                var37 = class191.method1201(var36, 0, 2, var11.field4060[var29], (byte) 68, var11.field4164);
                                                            } else {
                                                                var37 = class191.method1201(var36, 3153952, 1, var11.field4060[var29], (byte) 68, var11.field4164);
                                                            }
                                                            if (var37 == null) {
                                                                class225.method1457(-65, var11);
                                                            } else if (class220.field3989 == var11 && class80.field1560 == var29) {
                                                                int var38 = class7.field151 - class59.field1097;
                                                                int var39 = class27.field486 - class4.field59;
                                                                if (var39 < 5 && var39 > -5) {
                                                                    var39 = 0;
                                                                }
                                                                if (var38 < 5 && var38 > -5) {
                                                                    var38 = 0;
                                                                }
                                                                if (class66.field1260 < 5) {
                                                                    var38 = 0;
                                                                    var39 = 0;
                                                                }
                                                                var37.method1020(var32 + var39, var33 - -var38, 128);
                                                                if (arg2 != -1) {
                                                                    int var40 = class99.field1820;
                                                                    int var41 = class99.field1821;
                                                                    class223 var42 = arg6[arg2 & 0xFFFF];
                                                                    if (var33 + var38 < var41 && var42.field4026 > 0) {
                                                                        int var43 = (var41 - var33 - var38) * class102.field1855 / 3;
                                                                        if (var43 > class102.field1855 * 10) {
                                                                            var43 = class102.field1855 * 10;
                                                                        }
                                                                        if (var43 > var42.field4026) {
                                                                            var43 = var42.field4026;
                                                                        }
                                                                        var42.field4026 -= var43;
                                                                        class59.field1097 += var43;
                                                                        class225.method1457(89, var42);
                                                                    }
                                                                    if (var33 + var38 + 32 > var40 && var42.field4026 < var42.field4025 - var42.field4134) {
                                                                        int var44 = (var33 + var38 + 32 - var40) * class102.field1855 / 3;
                                                                        if (class102.field1855 * 10 < var44) {
                                                                            var44 = class102.field1855 * 10;
                                                                        }
                                                                        if (var42.field4025 - var42.field4134 - var42.field4026 < var44) {
                                                                            var44 = var42.field4025 - var42.field4134 - var42.field4026;
                                                                        }
                                                                        var42.field4026 += var44;
                                                                        class59.field1097 -= var44;
                                                                        class225.method1457(-76, var42);
                                                                    }
                                                                }
                                                            } else if (class35.field623 == var11 && class140.field2512 == var29) {
                                                                var37.method1020(var32, var33, 128);
                                                            } else {
                                                                var37.method1010(var32, var33);
                                                            }
                                                        }
                                                    } else if (var11.field4023 != null && var29 < 20) {
                                                        class155 var45 = var11.method1440(true, var29);
                                                        if (var45 != null) {
                                                            var45.method1010(var32, var33);
                                                        } else if (class57.field1057) {
                                                            class225.method1457(-47, var11);
                                                        }
                                                    }
                                                    var29++;
                                                }
                                            }
                                        } else if (var11.field4076 == 3) {
                                            int var46;
                                            if (class20.method155(0, var11)) {
                                                var46 = var11.field4089;
                                                if (class226.field4253 == var11 && var11.field4068 != 0) {
                                                    var46 = var11.field4068;
                                                }
                                            } else {
                                                var46 = var11.field4080;
                                                if (class226.field4253 == var11 && var11.field4119 != 0) {
                                                    var46 = var11.field4119;
                                                }
                                            }
                                            if (var14 == 0) {
                                                if (var11.field4091) {
                                                    class99.method688(var15, var13, var11.field4130, var11.field4134, var46);
                                                } else {
                                                    class99.method696(var15, var13, var11.field4130, var11.field4134, var46);
                                                }
                                            } else if (var11.field4091) {
                                                class99.method694(var15, var13, var11.field4130, var11.field4134, var46, 256 - (var14 & 0xFF));
                                            } else {
                                                class99.method686(var15, var13, var11.field4130, var11.field4134, var46, 256 - (var14 & 0xFF));
                                            }
                                        } else if (var11.field4076 == 4) {
                                            class69 var47 = var11.method1437(class36.field650, false);
                                            if (var47 != null) {
                                                class44 var48 = var11.field4071;
                                                int var49;
                                                if (class20.method155(0, var11)) {
                                                    var49 = var11.field4089;
                                                    if (class226.field4253 == var11 && var11.field4068 != 0) {
                                                        var49 = var11.field4068;
                                                    }
                                                    if (var11.field4092.method340(3) > 0) {
                                                        var48 = var11.field4092;
                                                    }
                                                } else {
                                                    var49 = var11.field4080;
                                                    if (class226.field4253 == var11 && var11.field4119 != 0) {
                                                        var49 = var11.field4119;
                                                    }
                                                }
                                                if (var11.field4118 && var11.field4078 != -1) {
                                                    class214 var50 = class192.method1227(-31700, var11.field4078);
                                                    var48 = var50.field3837;
                                                    if (var48 == null) {
                                                        var48 = class166.field2873;
                                                    }
                                                    if ((var50.field3853 == 1 || var11.field4024 != 1) && var11.field4024 != -1) {
                                                        var48 = class70.method555(new class44[] { class78.field1499, var48, class220.field3982, class225.method1456(var11.field4024, (byte) -14) }, -3);
                                                    }
                                                }
                                                if (class10.field215 == var11) {
                                                    var48 = class10.field206;
                                                    var49 = var11.field4080;
                                                }
                                                if (!var11.field4118) {
                                                    var48 = class71.method559(var11, (byte) -85, var48);
                                                }
                                                var47.method403(var48, var15, var13, var11.field4130, var11.field4134, var49, var11.field4121 ? 0 : -1, var11.field4099, var11.field4021, var11.field4073);
                                            } else if (class57.field1057) {
                                                class225.method1457(-85, var11);
                                            }
                                        } else if (var11.field4076 == 5) {
                                            if (var11.field4118) {
                                                class155 var51;
                                                if (var11.field4078 == -1) {
                                                    var51 = var11.method1444(0, false);
                                                } else {
                                                    var51 = class191.method1201(var11.field4078, var11.field4122, var11.field4104, var11.field4024, (byte) 68, var11.field4164);
                                                }
                                                if (var51 != null) {
                                                    int var52 = var51.field2689;
                                                    int var53 = var51.field2692;
                                                    if (var11.field4171) {
                                                        int var55 = (var52 + var11.field4130 - 1) / var52;
                                                        int var56 = (var53 + var11.field4134 - 1) / var53;
                                                        class99.method698(var15, var13, var15 + var11.field4130, var11.field4134 + var13);
                                                        int var57 = 0;
                                                        while (true) {
                                                            if (var55 <= var57) {
                                                                class99.method707(arg4, arg9, arg1, arg7);
                                                                break;
                                                            }
                                                            for (int var58 = 0; var58 < var56; var58++) {
                                                                if (var11.field4079 != 0) {
                                                                    var51.method1003(var52 * var57 + var15 + var52 / 2, var53 * var58 + (var13 - -(var53 / 2)), var11.field4079, 4096);
                                                                } else if (var14 == 0) {
                                                                    var51.method1010(var52 * var57 + var15, var13 - -(var53 * var58));
                                                                } else {
                                                                    var51.method1020(var52 * var57 + var15, var53 * var58 + var13, 256 - (var14 & 0xFF));
                                                                }
                                                            }
                                                            var57++;
                                                        }
                                                    } else {
                                                        int var54 = var11.field4130 * 4096 / var52;
                                                        if (var11.field4079 != 0) {
                                                            var51.method1003(var11.field4130 / 2 + var15, var11.field4134 / 2 + var13, var11.field4079, var54);
                                                        } else if (var14 != 0) {
                                                            var51.method1006(var15, var13, var11.field4130, var11.field4134, 256 - (var14 & 0xFF));
                                                        } else if (var11.field4130 == var52 && var11.field4134 == var53) {
                                                            var51.method1010(var15, var13);
                                                        } else {
                                                            var51.method1024(var15, var13, var11.field4130, var11.field4134);
                                                        }
                                                    }
                                                } else if (class57.field1057) {
                                                    class225.method1457(-123, var11);
                                                }
                                            } else {
                                                class155 var59 = var11.method1444(0, class20.method155(0, var11));
                                                if (var59 != null) {
                                                    var59.method1010(var15, var13);
                                                } else if (class57.field1057) {
                                                    class225.method1457(85, var11);
                                                }
                                            }
                                        } else if (var11.field4076 == 6) {
                                            boolean var60 = class20.method155(0, var11);
                                            class127 var61 = null;
                                            int var62 = 0;
                                            int var63;
                                            if (var60) {
                                                var63 = var11.field4146;
                                            } else {
                                                var63 = var11.field4105;
                                            }
                                            if (var11.field4078 != -1) {
                                                class214 var68 = class192.method1227(-31700, var11.field4078);
                                                if (var68 != null) {
                                                    class214 var69 = var68.method1388(var11.field4024, (byte) 64);
                                                    var61 = var69.method1383(1, 0, (byte) 28, null);
                                                    if (var61 == null) {
                                                        class225.method1457(-115, var11);
                                                    } else {
                                                        var62 = -var61.method67() / 2;
                                                    }
                                                }
                                            } else if (var11.field4052 == 5) {
                                                if (var11.field4050 == -1) {
                                                    var61 = class76.field1469.method246(-1, null, -1, null, (byte) -67);
                                                } else {
                                                    int var65 = var11.field4050 & 0x7FF;
                                                    if (class123.field2188 == var65) {
                                                        var65 = 2047;
                                                    }
                                                    class24 var66 = class122.field2168[var65];
                                                    class204 var67 = var63 == -1 ? null : class94.method672(var63, 50);
                                                    if (var66 != null && (int) var66.field395.method306(-58) << 11 == (var11.field4050 & 0xFFFFF800)) {
                                                        var61 = var66.field407.method246(var11.field4044, null, 0, var67, (byte) -80);
                                                    }
                                                }
                                            } else if (var63 == -1) {
                                                var61 = var11.method1446(null, var60, class96.field1774.field407, -1, (byte) -80);
                                                if (var61 == null && class57.field1057) {
                                                    class225.method1457(102, var11);
                                                }
                                            } else {
                                                class204 var64 = class94.method672(var63, 82);
                                                var61 = var11.method1446(var64, var60, class96.field1774.field407, var11.field4044, (byte) -121);
                                                if (var61 == null && class57.field1057) {
                                                    class225.method1457(76, var11);
                                                }
                                            }
                                            if (var61 != null) {
                                                int var70;
                                                if (var11.field4037 > 0) {
                                                    var70 = (var11.field4130 << 8) / var11.field4037;
                                                } else {
                                                    var70 = 256;
                                                }
                                                int var71;
                                                if (var11.field4144 > 0) {
                                                    var71 = (var11.field4134 << 8) / var11.field4144;
                                                } else {
                                                    var71 = 256;
                                                }
                                                int var72 = (var11.field4098 * var70 >> 8) + var11.field4130 / 2 + var15;
                                                int var73 = (var11.field4022 * var71 >> 8) + var11.field4134 / 2 + var13;
                                                class206.method1328(var72, var73);
                                                int var74 = class206.field3684[var11.field4036] * var11.field4135 >> 16;
                                                int var75 = class206.field3700[var11.field4036] * var11.field4135 >> 16;
                                                if (!var11.field4118) {
                                                    var61.method47(0, var11.field4081, 0, var11.field4036, 0, var74, var75);
                                                } else if (var11.field4042) {
                                                    ((class6) var61).method41(0, var11.field4081, var11.field4133, var11.field4036, var11.field4094, var62 + var74 + var11.field4077, var75 - -var11.field4077, var11.field4135);
                                                } else {
                                                    var61.method47(0, var11.field4081, var11.field4133, var11.field4036, var11.field4094, var62 + var74 + var11.field4077, var11.field4077 + var75);
                                                }
                                                class206.method1331();
                                            }
                                        } else {
                                            label774: {
                                                if (var11.field4076 == 7) {
                                                    class69 var76 = var11.method1437(class36.field650, false);
                                                    if (var76 == null) {
                                                        if (class57.field1057) {
                                                            class225.method1457(124, var11);
                                                        }
                                                        break label774;
                                                    }
                                                    int var77 = 0;
                                                    for (int var78 = 0; var78 < var11.field4158; var78++) {
                                                        for (int var79 = 0; var79 < var11.field4136; var79++) {
                                                            if (var11.field4166[var77] > 0) {
                                                                class214 var80 = class192.method1227(-31700, var11.field4166[var77] - 1);
                                                                class44 var81;
                                                                if (var80.field3853 != 1 && var11.field4060[var77] == 1) {
                                                                    var81 = class70.method555(new class44[] { class78.field1499, var80.field3837, class44.field832 }, -3);
                                                                } else {
                                                                    var81 = class70.method555(new class44[] { class78.field1499, var80.field3837, class220.field3982, class225.method1456(var11.field4060[var77], (byte) -128) }, -3);
                                                                }
                                                                int var82 = (var11.field4108 + 12) * var78 + var13;
                                                                int var83 = (var11.field4145 + 115) * var79 + var15;
                                                                if (var11.field4099 == 0) {
                                                                    var76.method428(var81, var83, var82, var11.field4080, var11.field4121 ? 0 : -1);
                                                                } else if (var11.field4099 == 1) {
                                                                    var76.method401(var81, var83 + 57, var82, var11.field4080, var11.field4121 ? 0 : -1);
                                                                } else {
                                                                    var76.method426(var81, var83 + 114, var82, var11.field4080, var11.field4121 ? 0 : -1);
                                                                }
                                                            }
                                                            var77++;
                                                        }
                                                    }
                                                }
                                                if (var11.field4076 == 8 && class48.field903 == var11 && class181.field3137 == class163.field2812) {
                                                    int var84 = 0;
                                                    int var85 = 0;
                                                    class69 var86 = class74.field1424;
                                                    class44 var87 = var11.field4071;
                                                    class44 var88 = class71.method559(var11, (byte) -85, var87);
                                                    while (var88.method340(3) > 0) {
                                                        int var96 = var88.method297(83, class83.field1622);
                                                        class44 var97;
                                                        if (var96 == -1) {
                                                            var97 = var88;
                                                            var88 = class94.field1752;
                                                        } else {
                                                            var97 = var88.method318(126, var96, 0);
                                                            var88 = var88.method332(var96 + 4, (byte) 39);
                                                        }
                                                        int var98 = var86.method424(var97);
                                                        var85 += var86.field1035 + 1;
                                                        if (var84 < var98) {
                                                            var84 = var98;
                                                        }
                                                    }
                                                    var85 += 7;
                                                    var84 += 6;
                                                    int var89 = var11.field4134 + var13 + 5;
                                                    if (var89 + var85 > arg7) {
                                                        var89 = arg7 - var85;
                                                    }
                                                    int var90 = var15 + var11.field4130 - var84 - 5;
                                                    if (var90 < var15 + 5) {
                                                        var90 = var15 + 5;
                                                    }
                                                    if (arg1 < var90 + var84) {
                                                        var90 = arg1 - var84;
                                                    }
                                                    class99.method688(var90, var89, var84, var85, 16777120);
                                                    class99.method696(var90, var89, var84, var85, 0);
                                                    int var91 = var86.field1035 + var89 + 2;
                                                    class44 var92 = var11.field4071;
                                                    class44 var93 = class71.method559(var11, (byte) -85, var92);
                                                    while (var93.method340(3) > 0) {
                                                        int var94 = var93.method297(119, class83.field1622);
                                                        class44 var95;
                                                        if (var94 == -1) {
                                                            var95 = var93;
                                                            var93 = class94.field1752;
                                                        } else {
                                                            var95 = var93.method318(125, var94, 0);
                                                            var93 = var93.method332(var94 + 4, (byte) 28);
                                                        }
                                                        var86.method428(var95, var90 + 3, var91, 0, -1);
                                                        var91 += var86.field1035 + 1;
                                                    }
                                                }
                                                if (var11.field4076 == 9) {
                                                    int var99;
                                                    int var100;
                                                    int var101;
                                                    int var102;
                                                    if (var11.field4138) {
                                                        var99 = var11.field4134 + var13;
                                                        var100 = var15 + var11.field4130;
                                                        var101 = var13;
                                                        var102 = var15;
                                                    } else {
                                                        var100 = var11.field4130 + var15;
                                                        var102 = var15;
                                                        var99 = var13;
                                                        var101 = var11.field4134 + var13;
                                                    }
                                                    if (var11.field4143 == 1) {
                                                        class99.method697(var102, var99, var100, var101, var11.field4080);
                                                    } else {
                                                        class99.method689(var102, var99, var100, var101, var11.field4080, var11.field4143);
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
            var10++;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)I")
    public static int method202(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZI)Ldj;")
    public static final class44 method203(int arg0, int arg1, boolean arg2, int arg3) {
        field511++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg0 == 22666) {
            int var4 = 1;
            for (int var5 = arg1 / arg3; var5 != 0; var5 /= arg3) {
                var4++;
            }
            int var6 = var4;
            if (arg1 < 0 || arg2) {
                var6 = var4 + 1;
            }
            byte[] var7 = new byte[var6];
            if (arg1 < 0) {
                var7[0] = 45;
            } else if (arg2) {
                var7[0] = 43;
            }
            for (int var8 = 0; var8 < var4; var8++) {
                int var10 = arg1 % arg3;
                if (var10 < 0) {
                    var10 = -var10;
                }
                arg1 /= arg3;
                if (var10 > 9) {
                    var10 += 39;
                }
                var7[var6 - var8 - 1] = (byte) (var10 + 48);
            }
            class44 var9 = new class44();
            var9.field849 = var6;
            var9.field822 = var7;
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
    public static void method204(int arg0) {
        if (arg0 != -31339) {
            method201(true, 125, 26, 54, 92, 40, null, -33, 79, -104);
        }
        field514 = null;
        field517 = null;
        field524 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lnf;Laf;II)V")
    public static final void method205(class147 arg0, class7 arg1, int arg2, int arg3) {
        byte[] var4 = null;
        class190 var5 = class13.field245;
        synchronized (class13.field245) {
            class224 var6 = (class224) class13.field245.method1189(0);
            if (arg3 > -125) {
                field517 = null;
            }
            while (var6 != null) {
                if ((long) arg2 == var6.field3186 && var6.field4179 == arg1 && var6.field4185 == 0) {
                    var4 = var6.field4177;
                    break;
                }
                var6 = (class224) class13.field245.method1192((byte) -77);
            }
        }
        field507++;
        if (var4 == null) {
            byte[] var7 = arg1.method77(arg2, (byte) 80);
            arg0.method961(arg2, true, var7, 91, arg1);
        } else {
            arg0.method961(arg2, true, var4, 113, arg1);
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
    public final void method206(int arg0) {
        if (arg0 != 0) {
            this.method206(31);
        }
        field523++;
        int var2 = this.field513;
        class39 var3 = this.field508.method274(103);
        if (var3 == null) {
            this.field506 = null;
            this.field503 = 0;
            this.field520 = 0;
            this.field513 = -1;
            this.field515 = 0;
        } else {
            this.field515 = var3.field703;
            this.field503 = var3.field700;
            this.field513 = var3.field699;
            this.field506 = var3.field697;
            this.field520 = var3.field736 * 128;
        }
        if (this.field513 != var2 && this.field510 != null) {
            class36.field634.method109(this.field510);
            this.field510 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
    public static final void method207(int arg0, int arg1, int arg2) {
        class68 var3 = class32.field567[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field1300; var4++) {
            class106 var5 = var3.field1314[var4];
            if ((var5.field1953 >> 29 & 0x3L) == 2L && var5.field1945 == arg1 && var5.field1955 == arg2) {
                class186.method1157(var5);
                return;
            }
        }
    }
}
