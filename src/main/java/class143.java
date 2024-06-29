import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class143 {

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Lgi;")
    public static class109 field2234 = new class109(64);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "F")
    private static float field2232;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "[[B")
    public static byte[][] field2233;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIILj;JZ)V", line = 4)
    public static final void method1056(int arg0, int arg1, int arg2, int arg3, class7 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class113 var8 = new class113();
        var8.field1728 = arg4;
        var8.field1730 = arg1 * 128 + 64;
        var8.field1733 = arg2 * 128 + 64;
        var8.field1724 = arg3;
        var8.field1729 = arg5;
        var8.field1734 = arg6;
        if (class324.field5032[arg0][arg1][arg2] == null) {
            class324.field5032[arg0][arg1][arg2] = new class204(arg0, arg1, arg2);
        }
        class324.field5032[arg0][arg1][arg2].field3347 = var8;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 29)
    public static void method1057(int arg0) {
        field2233 = (byte[][]) null;
        if (arg0 <= -126) {
            field2234 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)I", line = 45)
    public static final int method1058(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class84.field1177) {
            arg0 = 1000000;
            class84.field1177 = false;
        }
        field2235++;
        class149 var5 = class61.field870[arg3][arg2];
        float var6 = var5.field2317;
        int var7 = var5.field2304;
        float var8 = ((float) arg1 * 0.1F + 0.7F) * var5.field2309;
        float var9 = var5.field2301;
        int var10 = var5.field2313;
        int var11 = var5.field2308;
        class328 var12 = var5.field2302;
        if (!class43.field541) {
            var11 = 0;
        }
        float var13 = var5.field2307;
        float var14 = var5.field2312;
        float var15 = var5.field2305;
        if (class195.field3190 != var7 || class342.field5324 != var8 || class333.field5193 != var9 || class103.field1502 != var6 || class103.field1500 != var10 || class330.field5094 != var11 || class341.field5313 != var12 || class69.field970 != var13 || class49.field700 != var14 || class177.field2955 != var15) {
            class243.field3839 = class15.field172;
            class23.field313 = class139.field2194;
            class63.field919 = class229.field3637;
            class245.field3864 = class197.field3208;
            class165.field2750 = class53.field748;
            class186.field3075 = class271.field4373;
            class335.field5238 = class310.field4832;
            class164.field2732 = class145.field2267;
            class182.field3007 = class100.field1460;
            field2232 = class199.field3239;
            if (class144.field2249 == null || class335.field5238 == class144.field2249) {
                class144.field2249 = new class328();
            }
            class330.field5094 = var11;
            class86.field1192 = 0;
            class177.field2955 = var15;
            class69.field970 = var13;
            class342.field5324 = var8;
            class341.field5313 = var12;
            class103.field1502 = var6;
            class333.field5193 = var9;
            class49.field700 = var14;
            class103.field1500 = var10;
            class195.field3190 = var7;
        }
        if (arg4 != -4) {
            return 3;
        }
        if (class86.field1192 < 65536) {
            class86.field1192 += arg0 * 250;
            if (class86.field1192 < 65536) {
                int var16 = class86.field1192 >> 8;
                int var17 = 65536 - class86.field1192 >> 8;
                class100.field1460 = ((class182.field3007 & 0xFF00) * var17 + (class103.field1500 & 0xFF00) * var16 & 0xFF0000) + ((class182.field3007 & 0xFF00FF) * var17 + (class103.field1500 & 0xFF00FF) * var16 & 0xFF00FF00) >> 8;
                class271.field4373 = ((class195.field3190 & 0xFF00FF) * var16 + (class186.field3075 & 0xFF00FF) * var17 & 0xFF00FF00) + ((class195.field3190 & 0xFF00) * var16 + (class186.field3075 & 0xFF00) * var17 & 0xFF0000) >> 8;
                class15.field172 = class330.field5094 * var16 + class243.field3839 * var17 >> 8;
                float var18 = (float) (65536 - class86.field1192) / 65536.0F;
                float var19 = (float) class86.field1192 / 65536.0F;
                class53.field748 = class49.field700 * var19 + class165.field2750 * var18;
                class199.field3239 = class69.field970 * var19 + field2232 * var18;
                class229.field3637 = class63.field919 * var18 + class342.field5324 * var19;
                class145.field2267 = class333.field5193 * var19 + class164.field2732 * var18;
                class197.field3208 = class245.field3864 * var18 + class103.field1502 * var19;
                class139.field2194 = class23.field313 * var18 + class177.field2955 * var19;
                if (class341.field5313 != class335.field5238) {
                    if (class335.field5238 == null || class341.field5313 == null) {
                        class310.field4832 = null;
                    } else {
                        class310.field4832 = class144.field2249.method2300(class335.field5238, class341.field5313, (float) class86.field1192 / 65536.0F);
                    }
                }
            } else {
                class197.field3208 = class103.field1502;
                class86.field1192 = 65536;
                class139.field2194 = class177.field2955;
                class335.field5238 = null;
                class100.field1460 = class103.field1500;
                class15.field172 = class330.field5094;
                class310.field4832 = class341.field5313;
                class229.field3637 = class342.field5324;
                class199.field3239 = class69.field970;
                class145.field2267 = class333.field5193;
                class53.field748 = class49.field700;
                class271.field4373 = class195.field3190;
            }
        }
        return class100.field1460;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZIIIIIII[I)V", line = 172)
    public static final void method1059(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        int var11 = arg7;
        field2236++;
        if (arg7 >= class59.field830) {
            return;
        }
        if (class59.field834 > arg7) {
            var11 = class59.field834;
        }
        int var12 = arg0 + arg7;
        if (class59.field834 >= var12) {
            return;
        }
        if (class59.field830 < var12) {
            var12 = class59.field830;
        }
        int var13 = arg5;
        if (arg5 >= class59.field826) {
            return;
        }
        if (class59.field832 > arg5) {
            var13 = class59.field832;
        }
        int var14 = arg5 + arg6;
        if (class59.field832 >= var14) {
            return;
        }
        if (arg8 == 9) {
            arg8 = 1;
            arg1 = arg1 + 1 & 0x3;
        }
        if (arg8 == 10) {
            arg1 = arg1 + 3 & 0x3;
            arg8 = 1;
        }
        if (arg8 == 11) {
            arg8 = 8;
            arg1 = arg1 + 3 & 0x3;
        }
        int var15 = class59.field827 * var13 + var11;
        if (class59.field826 < var14) {
            var14 = class59.field826;
        }
        int var16 = var14 - arg5;
        int var17 = var13 - arg5;
        int var18 = class59.field827 + var11 - var12;
        int var19 = var12 - arg7;
        int var20 = var11 - arg7;
        int var21 = arg0 - var20;
        int var22 = arg0 - var19;
        int var23 = arg6 - var17;
        int var24 = arg6 - var16;
        if (arg8 != 1) {
            int var33 = -126 % ((arg3 - 29) / 38);
            if (arg8 == 2) {
                if (arg1 == 0) {
                    for (int var82 = var23 - 1; var82 >= var24; var82--) {
                        for (int var83 = var20; var83 < var19; var83++) {
                            if ((var82 >> 1) >= var83) {
                                arg10[var15] = arg9;
                            } else if (arg2) {
                                arg10[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                } else if (arg1 == 1) {
                    for (int var84 = var17; var84 < var16; var84++) {
                        for (int var85 = var20; var85 < var19; var85++) {
                            if (var15 >= 0 && arg10.length > var15) {
                                if (var84 << 1 <= var85) {
                                    arg10[var15] = arg9;
                                } else if (arg2) {
                                    arg10[var15] = arg4;
                                }
                                var15++;
                            } else {
                                var15++;
                            }
                        }
                        var15 += var18;
                    }
                } else if (arg1 == 2) {
                    for (int var86 = var17; var86 < var16; var86++) {
                        for (int var87 = var21 - 1; var87 >= var22; var87--) {
                            if (var87 <= (var86 >> 1)) {
                                arg10[var15] = arg9;
                            } else if (arg2) {
                                arg10[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                } else if (arg1 == 3) {
                    for (int var88 = var23 - 1; var88 >= var24; var88--) {
                        for (int var89 = var21 - 1; var89 >= var22; var89--) {
                            if (var88 << 1 <= var89) {
                                arg10[var15] = arg9;
                            } else if (arg2) {
                                arg10[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                }
            } else if (arg8 == 3) {
                if (arg1 == 0) {
                    for (int var74 = var23 - 1; var74 >= var24; var74--) {
                        for (int var75 = var21 - 1; var75 >= var22; var75--) {
                            if ((var74 >> 1) >= var75) {
                                arg10[var15] = arg9;
                            } else if (arg2) {
                                arg10[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                } else if (arg1 == 1) {
                    for (int var80 = var23 - 1; var80 >= var24; var80--) {
                        for (int var81 = var20; var81 < var19; var81++) {
                            if ((var80 << 1) <= var81) {
                                arg10[var15] = arg9;
                            } else if (arg2) {
                                arg10[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                } else if (arg1 == 2) {
                    for (int var76 = var17; var76 < var16; var76++) {
                        for (int var77 = var20; var77 < var19; var77++) {
                            if (var76 >> 1 >= var77) {
                                arg10[var15] = arg9;
                            } else if (arg2) {
                                arg10[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                } else if (arg1 == 3) {
                    for (int var78 = var17; var78 < var16; var78++) {
                        for (int var79 = var21 - 1; var79 >= var22; var79--) {
                            if ((var78 << 1) <= var79) {
                                arg10[var15] = arg9;
                            } else if (arg2) {
                                arg10[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                }
            } else if (arg8 == 4) {
                if (arg1 == 0) {
                    for (int var66 = var23 - 1; var66 >= var24; var66--) {
                        for (int var67 = var20; var67 < var19; var67++) {
                            if (var66 >> 1 <= var67) {
                                arg10[var15] = arg9;
                            } else if (arg2) {
                                arg10[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                } else if (arg1 == 1) {
                    for (int var68 = var17; var68 < var16; var68++) {
                        for (int var69 = var20; var69 < var19; var69++) {
                            if (var68 << 1 >= var69) {
                                arg10[var15] = arg9;
                            } else if (arg2) {
                                arg10[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                } else if (arg1 == 2) {
                    for (int var70 = var17; var70 < var16; var70++) {
                        for (int var71 = var21 - 1; var71 >= var22; var71--) {
                            if (var71 >= var70 >> 1) {
                                arg10[var15] = arg9;
                            } else if (arg2) {
                                arg10[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                } else if (arg1 == 3) {
                    for (int var72 = var23 - 1; var72 >= var24; var72--) {
                        for (int var73 = var21 - 1; var73 >= var22; var73--) {
                            if (var72 << 1 >= var73) {
                                arg10[var15] = arg9;
                            } else if (arg2) {
                                arg10[var15] = arg4;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                }
            } else if (arg8 != 5) {
                if (arg8 == 6) {
                    if (arg1 == 0) {
                        for (int var42 = var17; var42 < var16; var42++) {
                            for (int var43 = var20; var43 < var19; var43++) {
                                if (var43 <= (arg0 / 2)) {
                                    arg10[var15] = arg9;
                                } else if (arg2) {
                                    arg10[var15] = arg4;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                    if (arg1 == 1) {
                        for (int var64 = var17; var64 < var16; var64++) {
                            for (int var65 = var20; var65 < var19; var65++) {
                                if ((arg6 / 2) >= var64) {
                                    arg10[var15] = arg9;
                                } else if (arg2) {
                                    arg10[var15] = arg4;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                    if (arg1 == 2) {
                        for (int var62 = var17; var62 < var16; var62++) {
                            for (int var63 = var20; var63 < var19; var63++) {
                                if (var63 >= arg0 / 2) {
                                    arg10[var15] = arg9;
                                } else if (arg2) {
                                    arg10[var15] = arg4;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                    if (arg1 == 3) {
                        for (int var60 = var17; var60 < var16; var60++) {
                            for (int var61 = var20; var61 < var19; var61++) {
                                if (arg6 / 2 <= var60) {
                                    arg10[var15] = arg9;
                                } else if (arg2) {
                                    arg10[var15] = arg4;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                }
                if (arg8 == 7) {
                    if (arg1 == 0) {
                        for (int var50 = var17; var50 < var16; var50++) {
                            for (int var51 = var20; var51 < var19; var51++) {
                                if (var51 <= (var50 - (arg6 / 2))) {
                                    arg10[var15] = arg9;
                                } else if (arg2) {
                                    arg10[var15] = arg4;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                    if (arg1 == 1) {
                        for (int var48 = var23 - 1; var48 >= var24; var48--) {
                            for (int var49 = var20; var49 < var19; var49++) {
                                if ((var48 - (arg6 / 2)) >= var49) {
                                    arg10[var15] = arg9;
                                } else if (arg2) {
                                    arg10[var15] = arg4;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                    if (arg1 == 2) {
                        for (int var44 = var23 - 1; var44 >= var24; var44--) {
                            for (int var45 = var21 - 1; var45 >= var22; var45--) {
                                if (var45 <= (var44 - arg6 / 2)) {
                                    arg10[var15] = arg9;
                                } else if (arg2) {
                                    arg10[var15] = arg4;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                    if (arg1 == 3) {
                        for (int var46 = var17; var46 < var16; var46++) {
                            for (int var47 = var21 - 1; var47 >= var22; var47--) {
                                if (var46 - (arg6 / 2) >= var47) {
                                    arg10[var15] = arg9;
                                } else if (arg2) {
                                    arg10[var15] = arg4;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                }
                if (arg8 == 8) {
                    if (arg1 == 0) {
                        for (int var58 = var17; var58 < var16; var58++) {
                            for (int var59 = var20; var59 < var19; var59++) {
                                if ((var58 - (arg6 / 2)) <= var59) {
                                    arg10[var15] = arg9;
                                } else if (arg2) {
                                    arg10[var15] = arg4;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                    if (arg1 == 1) {
                        for (int var52 = var23 - 1; var52 >= var24; var52--) {
                            for (int var53 = var20; var53 < var19; var53++) {
                                if (var53 >= (var52 - (arg6 / 2))) {
                                    arg10[var15] = arg9;
                                } else if (arg2) {
                                    arg10[var15] = arg4;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                    if (arg1 == 2) {
                        for (int var54 = var23 - 1; var54 >= var24; var54--) {
                            for (int var55 = var21 - 1; var55 >= var22; var55--) {
                                if (var54 - (arg6 / 2) <= var55) {
                                    arg10[var15] = arg9;
                                } else if (arg2) {
                                    arg10[var15] = arg4;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                    if (arg1 == 3) {
                        for (int var56 = var17; var56 < var16; var56++) {
                            for (int var57 = var21 - 1; var57 >= var22; var57--) {
                                if ((var56 - (arg6 / 2)) <= var57) {
                                    arg10[var15] = arg9;
                                } else if (arg2) {
                                    arg10[var15] = arg4;
                                }
                                var15++;
                            }
                            var15 += var18;
                        }
                        return;
                    }
                }
            } else if (arg1 == 0) {
                for (int var34 = var23 - 1; var34 >= var24; var34--) {
                    for (int var35 = var21 - 1; var35 >= var22; var35--) {
                        if (var35 >= (var34 >> 1)) {
                            arg10[var15] = arg9;
                        } else if (arg2) {
                            arg10[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg1 == 1) {
                for (int var36 = var23 - 1; var36 >= var24; var36--) {
                    for (int var37 = var20; var37 < var19; var37++) {
                        if (var37 <= (var36 << 1)) {
                            arg10[var15] = arg9;
                        } else if (arg2) {
                            arg10[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg1 == 2) {
                for (int var38 = var17; var38 < var16; var38++) {
                    for (int var39 = var20; var39 < var19; var39++) {
                        if ((var38 >> 1) <= var39) {
                            arg10[var15] = arg9;
                        } else if (arg2) {
                            arg10[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg1 == 3) {
                for (int var40 = var17; var40 < var16; var40++) {
                    for (int var41 = var21 - 1; var41 >= var22; var41--) {
                        if ((var40 << 1) >= var41) {
                            arg10[var15] = arg9;
                        } else if (arg2) {
                            arg10[var15] = arg4;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg1 == 0) {
            for (int var25 = var17; var25 < var16; var25++) {
                for (int var26 = var20; var26 < var19; var26++) {
                    if (var26 <= var25) {
                        arg10[var15] = arg9;
                    } else if (arg2) {
                        arg10[var15] = arg4;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg1 == 1) {
            for (int var31 = var23 - 1; var31 >= var24; var31--) {
                for (int var32 = var20; var32 < var19; var32++) {
                    if (var31 >= var32) {
                        arg10[var15] = arg9;
                    } else if (arg2) {
                        arg10[var15] = arg4;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg1 == 2) {
            for (int var27 = var17; var27 < var16; var27++) {
                for (int var28 = var20; var28 < var19; var28++) {
                    if (var27 <= var28) {
                        arg10[var15] = arg9;
                    } else if (arg2) {
                        arg10[var15] = arg4;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg1 == 3) {
            for (int var29 = var23 - 1; var29 >= var24; var29--) {
                for (int var30 = var20; var30 < var19; var30++) {
                    if (var30 >= var29) {
                        arg10[var15] = arg9;
                    } else if (arg2) {
                        arg10[var15] = arg4;
                    }
                    var15++;
                }
                var15 += var18;
            }
        }
    }
}
