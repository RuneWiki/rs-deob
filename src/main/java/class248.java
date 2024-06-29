import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class248 extends class269 {

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "Z")
    public static boolean field3966 = false;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "Z")
    public static boolean field3965 = false;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "[I")
    public static int[] field3967 = new int[32768];

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "Llf;")
    public static class211 field3960 = new class211(64);

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3971 = "Loading textures - ";

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V")
    public static final void method1666(int arg0, int arg1) {
        if (arg0 != 9613) {
            field3966 = false;
        }
        field3964++;
        class287 var2 = class261.method1786(arg1, false, 12);
        var2.method1912((byte) -54);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLlj;I)Ljava/lang/String;")
    public static final String method1667(byte arg0, class25 arg1, int arg2) {
        field3962++;
        try {
            int var3 = arg1.method192((byte) -20);
            if (var3 > arg2) {
                var3 = arg2;
            }
            if (arg0 != 124) {
                method1671((String) null, -60);
            }
            byte[] var4 = new byte[var3];
            arg1.field349 += class151.field2242.method1119(arg1.field349, var4, arg1.field339, 0, 16, var3);
            return class6.method32(false, var3, 0, var4);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z[Lld;B)V")
    public static final void method1668(boolean arg0, class79[] arg1, byte arg2) {
        byte var3;
        if (arg0) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        field3970++;
        if (!arg0) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class35.field449[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class35.field449[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg1[var7].method534((byte) 7, var6, var5);
                            }
                        }
                    }
                }
            }
            class170.field2664 += (int) (Math.random() * 5.0D) - 2;
            if (class170.field2664 < -16) {
                class170.field2664 = -16;
            }
            class286.field4535 += (int) (Math.random() * 5.0D) - 2;
            if (class170.field2664 > 16) {
                class170.field2664 = 16;
            }
            if (class286.field4535 < -8) {
                class286.field4535 = -8;
            }
            if (class286.field4535 > 8) {
                class286.field4535 = 8;
            }
        }
        int var8 = class286.field4535 >> 2 << 10;
        int var9 = class170.field2664 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        int var12 = 0;
        if (arg2 != -81) {
            method1666(49, 52);
        }
        while (var3 > var12) {
            byte[][] var51 = class245.field3933[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    byte var101 = 74;
                    int var102 = class200.field3128[var12][var100 + 1][var54] - class200.field3128[var12][var100 - 1][var54];
                    int var103 = class200.field3128[var12][var100][var54 + 1] - class200.field3128[var12][var100][var54 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = -65536 / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var107 * -50 + var105 * -10 + var106 * -50) / var53 + var101;
                    int var109 = (var51[var100][var54] >> 1) + (var51[var100][var54 - 1] >> 2) + ((var51[var100][var54 + 1] >> 3) + (var51[var100 + -1][var54] >> 2) - -(var51[var100 - -1][var54] >> 3));
                    var10[var100][var54] = var108 - var109;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class94.field1462[var55] = 0;
                class108.field1657[var55] = 0;
                class231.field3720[var55] = 0;
                class262.field4226[var55] = 0;
                class290.field4576[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class4.field49[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class39 var96 = class164.method1128(var95 - 1, 17237);
                            class94.field1462[var85] += var96.field535;
                            class108.field1657[var85] += var96.field531;
                            class231.field3720[var85] += var96.field536;
                            class262.field4226[var85] += var96.field525;
                            var10002 = class290.field4576[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class4.field49[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class39 var99 = class164.method1128(var98 - 1, 17237);
                            class94.field1462[var85] -= var99.field535;
                            class108.field1657[var85] -= var99.field531;
                            class231.field3720[var85] -= var99.field536;
                            class262.field4226[var85] -= var99.field525;
                            var10002 = class290.field4576[var85]--;
                        }
                    }
                }
                if (var56 >= 0) {
                    int var86 = 0;
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    for (int var91 = -5; var91 < 104; var91++) {
                        int var92 = var91 + 5;
                        if (var92 < 104) {
                            var87 += class94.field1462[var92];
                            var86 += class108.field1657[var92];
                            var89 += class262.field4226[var92];
                            var88 += class231.field3720[var92];
                            var90 += class290.field4576[var92];
                        }
                        int var93 = var91 - 5;
                        if (var93 >= 0) {
                            var88 -= class231.field3720[var93];
                            var90 -= class290.field4576[var93];
                            var87 -= class94.field1462[var93];
                            var86 -= class108.field1657[var93];
                            var89 -= class262.field4226[var93];
                        }
                        if (var91 >= 0 && var90 > 0) {
                            var11[var56][var91] = class225.method1536(var86 / var90, (byte) -67, var87 * 256 / var89, var88 / var90);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg0 || class26.method227(10920) || (class35.field449[0][var57][var58] & 0x2) != 0 || (class35.field449[var12][var57][var58] & 0x10) == 0 && class31.method253(var58, var57, var12, arg2 ^ 0xFFFFF05F) == class104.field1610) {
                        if (var12 < class23.field292) {
                            class23.field292 = var12;
                        }
                        int var59 = class4.field49[var12][var57][var58] & 0xFF;
                        int var60 = class110.field1665[var12][var57][var58] & 0xFF;
                        if (var59 > 0 || var60 > 0) {
                            int var61 = class200.field3128[var12][var57 + 1][var58];
                            int var62 = class200.field3128[var12][var57][var58];
                            int var63 = class200.field3128[var12][var57 + 1][var58 + 1];
                            int var64 = class200.field3128[var12][var57][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var59 == 0 && class157.field2427[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var60 > 0 && !class222.method1510(arg2 - 6741, var60 + -1).field2901) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var62 && var62 == var63 && var62 == var64) {
                                    class80.field1149[var12][var57][var58] = class120.method787(class80.field1149[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var67;
                            if (var59 <= 0) {
                                var66 = 0;
                                var67 = -1;
                            } else {
                                var67 = var11[var57][var58];
                                int var68 = (var67 & 0x7F) + var9;
                                if (var68 < 0) {
                                    var68 = 0;
                                } else if (var68 > 127) {
                                    var68 = 127;
                                }
                                int var69 = (var8 + var67 & 0xFC00) + (var67 & 0x380) + var68;
                                var66 = class171.field2676[class239.method1620(96, 59, var69)];
                            }
                            int var70 = var10[var57][var58];
                            int var71 = var10[var57 + 1][var58];
                            int var72 = var10[var57 + 1][var58 + 1];
                            int var73 = var10[var57][var58 + 1];
                            if (var60 == 0) {
                                class218.method1472(var12, var57, var58, 0, 0, -1, var62, var61, var63, var64, class239.method1620(var70, 117, var67), class239.method1620(var71, arg2 + 197, var67), class239.method1620(var72, 115, var67), class239.method1620(var73, 126, var67), 0, 0, 0, 0, var66, 0);
                            } else {
                                int var74 = class157.field2427[var12][var57][var58] + 1;
                                byte var75 = class185.field2899[var12][var57][var58];
                                class185 var76 = class222.method1510(arg2 ^ 0x1AF5, var60 - 1);
                                int var77 = var76.field2898;
                                if (var77 >= 0 && !class171.field2689.method261(var77, arg2 ^ 0xB)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var79;
                                if (var77 >= 0) {
                                    var79 = class171.field2676[class261.method1793(class171.field2689.method259((byte) 57, var77), 115, 96)];
                                    var78 = -1;
                                } else if (var76.field2902 == -1) {
                                    var78 = -2;
                                    var79 = 0;
                                } else {
                                    var78 = var76.field2902;
                                    int var80 = (var78 & 0x7F) + var9;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 127) {
                                        var80 = 127;
                                    }
                                    int var81 = (var8 + var78 & 0xFC00) - (-(var78 & 0x380) - var80);
                                    var79 = class171.field2676[class261.method1793(var81, 93, 96)];
                                }
                                if (var76.field2905 >= 0) {
                                    int var82 = var76.field2905;
                                    int var83 = (var82 & 0x7F) + var9;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var82 & 0x380) + (var8 + var82 & 0xFC00) + var83;
                                    var79 = class171.field2676[class261.method1793(var84, arg2 + 187, 96)];
                                }
                                class218.method1472(var12, var57, var58, var74, var75, var77, var62, var61, var63, var64, class239.method1620(var70, 72, var67), class239.method1620(var71, 91, var67), class239.method1620(var72, 109, var67), class239.method1620(var73, 73, var67), class261.method1793(var78, arg2 ^ 0xFFFFFFCC, var70), class261.method1793(var78, 121, var71), class261.method1793(var78, 107, var72), class261.method1793(var78, 119, var73), var66, var79);
                            }
                        }
                    }
                }
            }
            class4.field49[var12] = null;
            class110.field1665[var12] = null;
            class157.field2427[var12] = null;
            class185.field2899[var12] = null;
            class245.field3933[var12] = null;
            var12++;
        }
        class124.method843(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class35.field449[1][var13][var50] & 0x2) == 2) {
                    class201.method1383(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class80.field1149[var14][var16][var15] & 0x1) != 0) {
                        int var17;
                        for (var17 = var15; var17 > 0 && (class80.field1149[var14][var16][var17 - 1] & 0x1) != 0; var17--) {
                        }
                        int var18;
                        for (var18 = var15; var18 < 104 && (class80.field1149[var14][var16][var18 + 1] & 0x1) != 0; var18++) {
                        }
                        int var19 = var14;
                        int var20 = var14;
                        label349: while (var19 > 0) {
                            for (int var21 = var17; var21 <= var18; var21++) {
                                if ((class80.field1149[var19 - 1][var16][var21] & 0x1) == 0) {
                                    break label349;
                                }
                            }
                            var19--;
                        }
                        label338: while (var20 < 3) {
                            for (int var22 = var17; var22 <= var18; var22++) {
                                if ((class80.field1149[var20 + 1][var16][var22] & 0x1) == 0) {
                                    break label338;
                                }
                            }
                            var20++;
                        }
                        int var23 = (var18 + 1 - var17) * (var20 + 1 - var19);
                        if (var23 >= 8) {
                            int var24 = class200.field3128[var19][var16][var17];
                            short var25 = 240;
                            int var26 = class200.field3128[var20][var16][var17] - var25;
                            class157.method1060(1, var16 * 128, var16 * 128, var17 * 128, var18 * 128 + 128, var26, var24);
                            for (int var27 = var19; var27 <= var20; var27++) {
                                for (int var28 = var17; var28 <= var18; var28++) {
                                    class80.field1149[var27][var16][var28] = class224.method1526(class80.field1149[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class80.field1149[var14][var16][var15] & 0x2) != 0) {
                        int var29;
                        for (var29 = var16; var29 > 0 && (class80.field1149[var14][var29 - 1][var15] & 0x2) != 0; var29--) {
                        }
                        int var30 = var14;
                        int var31 = var14;
                        int var32;
                        for (var32 = var16; var32 < 104 && (class80.field1149[var14][var32 + 1][var15] & 0x2) != 0; var32++) {
                        }
                        label404: while (var30 > 0) {
                            for (int var33 = var29; var33 <= var32; var33++) {
                                if ((class80.field1149[var30 - 1][var33][var15] & 0x2) == 0) {
                                    break label404;
                                }
                            }
                            var30--;
                        }
                        label393: while (var31 < 3) {
                            for (int var34 = var29; var34 <= var32; var34++) {
                                if ((class80.field1149[var31 + 1][var34][var15] & 0x2) == 0) {
                                    break label393;
                                }
                            }
                            var31++;
                        }
                        int var35 = (var32 + 1 - var29) * (var31 + 1 - var30);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class200.field3128[var31][var29][var15] - var36;
                            int var38 = class200.field3128[var30][var29][var15];
                            class157.method1060(2, var29 * 128, var32 * 128 + 128, var15 * 128, var15 * 128, var37, var38);
                            for (int var39 = var30; var39 <= var31; var39++) {
                                for (int var40 = var29; var40 <= var32; var40++) {
                                    class80.field1149[var39][var40][var15] = class224.method1526(class80.field1149[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class80.field1149[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var16;
                        int var42 = var16;
                        int var43 = var15;
                        int var44;
                        for (var44 = var15; var44 > 0 && (class80.field1149[var14][var16][var44 - 1] & 0x4) != 0; var44--) {
                        }
                        while (var43 < 104 && (class80.field1149[var14][var16][var43 + 1] & 0x4) != 0) {
                            var43++;
                        }
                        label458: while (var41 > 0) {
                            for (int var45 = var44; var45 <= var43; var45++) {
                                if ((class80.field1149[var14][var41 - 1][var45] & 0x4) == 0) {
                                    break label458;
                                }
                            }
                            var41--;
                        }
                        label447: while (var42 < 104) {
                            for (int var46 = var44; var46 <= var43; var46++) {
                                if ((class80.field1149[var14][var42 + 1][var46] & 0x4) == 0) {
                                    break label447;
                                }
                            }
                            var42++;
                        }
                        if (((var42 + 1 - var41) * (var43 + 1 - var44)) >= 4) {
                            int var47 = class200.field3128[var14][var41][var44];
                            class157.method1060(4, var41 * 128, var42 * 128 + 128, var44 * 128, var43 * 128 + 128, var47, var47);
                            for (int var48 = var41; var48 <= var42; var48++) {
                                for (int var49 = var44; var49 <= var43; var49++) {
                                    class80.field1149[var14][var48][var49] = class224.method1526(class80.field1149[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BILdl;)Lhc;")
    public static final class229 method1669(byte arg0, int arg1, class123 arg2) {
        field3968++;
        if (class98.method653(arg0 ^ 0xFFFFFFF1, arg1, arg2)) {
            return arg0 == 14 ? class34.method275((byte) 121) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static void method1670(int arg0) {
        field3960 = null;
        field3967 = null;
        field3971 = null;
        if (arg0 != 5) {
            field3969 = -24;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1671(String arg0, int arg1) {
        System.out.println("Error: " + class287.method1915(arg0, "%0a", "\n", (byte) 83));
        if (arg1 != 7705) {
            field3967 = null;
        }
        field3961++;
    }
}
