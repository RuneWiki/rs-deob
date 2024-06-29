import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class290 {

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "[[I")
    public static int[][] field4450 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field4452 = 0;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "[Z")
    public static boolean[] field4453 = new boolean[100];

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field4454 = 0;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "Z")
    public static boolean field4460 = true;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "Z")
    public static boolean field4459 = false;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "Lsi;")
    public static class334 field4449;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 6)
    public static void method1950(int arg0) {
        field4450 = (int[][]) null;
        field4453 = null;
        field4449 = null;
        if (arg0 >= -86) {
            field4452 = 53;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)V", line = 22)
    public static final void method1951(int arg0, int arg1) {
        if (arg0 < 53) {
            field4450 = (int[][]) ((int[][]) null);
        }
        field4458++;
        class2 var2 = class212.method1433(arg1, 12, -13802);
        var2.method16((byte) 77);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z[[[IZ[Lu;)V", line = 41)
    public static final void method1952(boolean arg0, int[][][] arg1, boolean arg2, class25[] arg3) {
        field4457++;
        if (arg0) {
            return;
        }
        byte var4;
        if (arg2) {
            var4 = 1;
        } else {
            var4 = 4;
        }
        if (!arg2) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        if ((class99.field1749[var5][var6][var7] & 0x1) == 1) {
                            int var8 = var5;
                            if ((class99.field1749[1][var6][var7] & 0x2) == 2) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg3[var8].method212((byte) 121, var6, var7);
                            }
                        }
                    }
                }
            }
            class187.field3030 += (int) (Math.random() * 5.0D) - 2;
            if (class187.field3030 < -8) {
                class187.field3030 = -8;
            }
            if (class187.field3030 > 8) {
                class187.field3030 = 8;
            }
            class233.field3650 += (int) (Math.random() * 5.0D) - 2;
            if (class233.field3650 < -16) {
                class233.field3650 = -16;
            }
            if (class233.field3650 > 16) {
                class233.field3650 = 16;
            }
        }
        int var9 = class187.field3030 >> 2 << 10;
        int[][] var10 = new int[104][104];
        int var11 = class233.field3650 >> 1;
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var4; var13++) {
            byte[][] var14 = class46.field957[var13];
            if (!class249.field3893) {
                int var35 = (int) Math.sqrt(5100.0D);
                int var36 = var35 * 768 >> 8;
                for (int var37 = 1; var37 < 103; var37++) {
                    for (int var38 = 1; var38 < 103; var38++) {
                        byte var39 = 74;
                        int var40 = class45.field923[var13][var38 + 1][var37] - class45.field923[var13][var38 - 1][var37];
                        int var41 = class45.field923[var13][var38][var37 + 1] - class45.field923[var13][var38][var37 - 1];
                        int var42 = (int) Math.sqrt((double) (var40 * var40 - (-var41 * var41 - 65536)));
                        int var43 = (var40 << 8) / var42;
                        int var44 = -65536 / var42;
                        int var45 = (var41 << 8) / var42;
                        int var46 = (var14[var38 - 1][var37] >> 2) + (var14[var38][var37 - 1] >> 2) + (var14[var38][var37 + 1] >> 3) + (var14[var38 + 1][var37] >> 3) + (var14[var38][var37] >> 1);
                        int var47 = (var43 * -50 + var44 * -10 + (var45 * -50)) / var36 + var39;
                        var12[var38][var37] = var47 - var46;
                    }
                }
            } else if (class334.field5115) {
                for (int var31 = 1; var31 < 103; var31++) {
                    for (int var32 = 1; var32 < 103; var32++) {
                        byte var33 = 74;
                        int var34 = (var14[var32][var31 + 1] >> 3) + ((var14[var32 + 1][var31] >> 3) + (var14[var32][var31 - 1] >> 2)) + (var14[var32 + -1][var31] >> 2) + (var14[var32][var31] >> 1);
                        var12[var32][var31] = var33 - var34;
                    }
                }
            } else {
                int var15 = (int) class65.field1242[0];
                int var16 = (int) class65.field1242[1];
                int var17 = (int) class65.field1242[2];
                int var18 = (int) Math.sqrt((double) (var17 * var17 + var15 * var15 + var16 * var16));
                int var19 = var18 * 1024 >> 8;
                for (int var20 = 1; var20 < 103; var20++) {
                    for (int var21 = 1; var21 < 103; var21++) {
                        int var22 = class45.field923[var13][var21 + 1][var20] - class45.field923[var13][var21 - 1][var20];
                        byte var23 = 96;
                        int var24 = class45.field923[var13][var21][var20 + 1] - class45.field923[var13][var21][var20 - 1];
                        int var25 = (int) Math.sqrt((double) (var22 * var22 + var24 * var24 + 65536));
                        int var26 = (var22 << 8) / var25;
                        int var27 = -65536 / var25;
                        int var28 = (var14[var21][var20 - 1] >> 2) + ((var14[var21 - 1][var20] >> 2) + (var14[var21 + 1][var20] >> 3)) + (var14[var21][var20 + 1] >> 3) + (var14[var21][var20] >> 1);
                        int var29 = (var24 << 8) / var25;
                        int var30 = (var15 * var26 - (-(var16 * var27) - var17 * var29)) / var19 + var23;
                        var12[var21][var20] = var30 - ((int) ((float) var28 * 1.7F));
                    }
                }
            }
            for (int var48 = 0; var48 < 104; var48++) {
                class50.field1014[var48] = 0;
                class319.field4874[var48] = 0;
                class331.field5079[var48] = 0;
                class328.field5032[var48] = 0;
                class69.field1474[var48] = 0;
            }
            for (int var49 = -5; var49 < 104; var49++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    int var51 = var49 + 5;
                    int var10002;
                    if (var51 < 104) {
                        int var52 = class160.field2607[var13][var51][var50] & 0xFF;
                        if (var52 > 0) {
                            class177 var53 = class179.method1127(arg0, var52 - 1);
                            class50.field1014[var50] += var53.field2845;
                            class319.field4874[var50] += var53.field2859;
                            class331.field5079[var50] += var53.field2867;
                            class328.field5032[var50] += var53.field2858;
                            var10002 = class69.field1474[var50]++;
                        }
                    }
                    int var54 = var49 - 5;
                    if (var54 >= 0) {
                        int var55 = class160.field2607[var13][var54][var50] & 0xFF;
                        if (var55 > 0) {
                            class177 var56 = class179.method1127(false, var55 - 1);
                            class50.field1014[var50] -= var56.field2845;
                            class319.field4874[var50] -= var56.field2859;
                            class331.field5079[var50] -= var56.field2867;
                            class328.field5032[var50] -= var56.field2858;
                            var10002 = class69.field1474[var50]--;
                        }
                    }
                }
                if (var49 >= 0) {
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    int var61 = 0;
                    for (int var62 = -5; var62 < 104; var62++) {
                        int var63 = var62 + 5;
                        int var64 = var62 - 5;
                        if (var63 < 104) {
                            var58 += class328.field5032[var63];
                            var60 += class331.field5079[var63];
                            var59 += class69.field1474[var63];
                            var61 += class319.field4874[var63];
                            var57 += class50.field1014[var63];
                        }
                        if (var64 >= 0) {
                            var60 -= class331.field5079[var64];
                            var58 -= class328.field5032[var64];
                            var61 -= class319.field4874[var64];
                            var59 -= class69.field1474[var64];
                            var57 -= class50.field1014[var64];
                        }
                        if (var62 >= 0 && var59 > 0) {
                            var10[var49][var62] = class209.method1419(-1, var61 / var59, var57 * 256 / var58, var60 / var59);
                        }
                    }
                }
            }
            for (int var65 = 1; var65 < 103; var65++) {
                label768: for (int var66 = 1; var66 < 103; var66++) {
                    if (arg2 || class19.method127(1) || (class99.field1749[0][var65][var66] & 0x2) != 0 || (class99.field1749[var13][var65][var66] & 0x10) == 0 && class72.method555(var65, var13, var66, 0) == field4454) {
                        if (class72.field1499 > var13) {
                            class72.field1499 = var13;
                        }
                        int var67 = class160.field2607[var13][var65][var66] & 0xFF;
                        int var68 = class325.field4968[var13][var65][var66] & 0xFF;
                        if (var67 > 0 || var68 > 0) {
                            int var69 = class45.field923[var13][var65][var66];
                            int var70 = class45.field923[var13][var65 + 1][var66 + 1];
                            int var71 = class45.field923[var13][var65 + 1][var66];
                            int var72 = class45.field923[var13][var65][var66 + 1];
                            if (var13 > 0) {
                                boolean var73 = true;
                                if (var67 == 0 && class269.field4162[var13][var65][var66] != 0) {
                                    var73 = false;
                                }
                                if (var68 > 0 && !class194.method1241(var68 - 1, false).field1764) {
                                    var73 = false;
                                }
                                if (var73 && var69 == var71 && var69 == var70 && var69 == var72) {
                                    class267.field4121[var13][var65][var66] = class212.method1434(class267.field4121[var13][var65][var66], 4);
                                }
                            }
                            int var74;
                            int var75;
                            if (var67 <= 0) {
                                var74 = -1;
                                var75 = 0;
                            } else {
                                var74 = var10[var65][var66];
                                int var76 = (var74 & 0x7F) + var11;
                                if (var76 < 0) {
                                    var76 = 0;
                                } else if (var76 > 127) {
                                    var76 = 127;
                                }
                                int var77 = (var74 + var9 & 0xFC00) + (var74 & 0x380) + var76;
                                var75 = class284.field4387[class187.method1194(1904560007, var77, 96)];
                            }
                            int var78 = var12[var65][var66];
                            int var79 = var12[var65 + 1][var66 + 1];
                            int var80 = var12[var65 + 1][var66];
                            int var81 = var12[var65][var66 + 1];
                            if (var68 == 0) {
                                class293.method1962(var13, var65, var66, 0, 0, -1, var69, var71, var70, var72, class187.method1194(1904560007, var74, var78), class187.method1194(1904560007, var74, var80), class187.method1194(1904560007, var74, var79), class187.method1194(1904560007, var74, var81), 0, 0, 0, 0, var75, 0);
                                if (class249.field3893 && var13 > 0 && var74 != -1 && class179.method1127(false, var67 - 1).field2844) {
                                    class60.method473(0, 0, true, false, var65, var66, var69 - class45.field923[0][var65][var66], var71 - class45.field923[0][var65 + 1][var66], var70 - class45.field923[0][var65 + 1][var66 + 1], -class45.field923[0][var65][var66 + 1] + var72);
                                }
                                if (class249.field3893 && !arg2 && class25.field498 != null && var13 == 0) {
                                    for (int var97 = var65 - 1; var97 <= var65 + 1; var97++) {
                                        for (int var98 = var66 - 1; var98 <= var66 + 1; var98++) {
                                            if ((var65 != var97 || var66 != var98) && var97 >= 0 && var97 < 104 && var98 >= 0 && var98 < 104) {
                                                int var99 = class325.field4968[var13][var97][var98] & 0xFF;
                                                if (var99 != 0) {
                                                    class101 var100 = class194.method1241(var99 - 1, false);
                                                    if (var100.field1762 != -1 && class85.method598(class284.field4393.method398((byte) 111, var100.field1762), -1)) {
                                                        class25.field498[var65][var66] = (var100.field1770 << 24) + var100.field1779;
                                                        continue label768;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var82 = class269.field4162[var13][var65][var66] + 1;
                                byte var83 = class153.field2507[var13][var65][var66];
                                class101 var84 = class194.method1241(var68 - 1, false);
                                if (class249.field3893 && !arg2 && class25.field498 != null && var13 == 0) {
                                    if (var84.field1762 != -1 && class85.method598(class284.field4393.method398((byte) 81, var84.field1762), -1)) {
                                        class25.field498[var65][var66] = (var84.field1770 << 24) + var84.field1779;
                                    } else {
                                        label734: for (int var85 = var65 - 1; var85 <= (var65 + 1); var85++) {
                                            for (int var86 = var66 - 1; var86 <= (var66 + 1); var86++) {
                                                if ((var65 != var85 || var66 != var86) && var85 >= 0 && var85 < 104 && var86 >= 0 && var86 < 104) {
                                                    int var87 = class325.field4968[var13][var85][var86] & 0xFF;
                                                    if (var87 != 0) {
                                                        class101 var88 = class194.method1241(var87 - 1, false);
                                                        if (var88.field1762 != -1 && class85.method598(class284.field4393.method398((byte) 115, var88.field1762), -1)) {
                                                            class25.field498[var65][var66] = (var88.field1770 << 24) + var88.field1779;
                                                            break label734;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var89 = var84.field1762;
                                if (var89 >= 0 && !class284.field4393.method409(var89, 9)) {
                                    var89 = -1;
                                }
                                int var90;
                                int var91;
                                if (var89 >= 0) {
                                    var90 = -1;
                                    var91 = class284.field4387[class49.method374(96, 127, class284.field4393.method388(var89, true))];
                                } else if (var84.field1765 == -1) {
                                    var90 = -2;
                                    var91 = 0;
                                } else {
                                    var90 = var84.field1765;
                                    int var92 = (var90 & 0x7F) + var11;
                                    if (var92 < 0) {
                                        var92 = 0;
                                    } else if (var92 > 127) {
                                        var92 = 127;
                                    }
                                    int var93 = (var9 + var90 & 0xFC00) + var92 + (var90 & 0x380);
                                    var91 = class284.field4387[class49.method374(96, 127, var93)];
                                }
                                if (var84.field1775 >= 0) {
                                    int var94 = var84.field1775;
                                    int var95 = (var94 & 0x7F) + var11;
                                    if (var95 < 0) {
                                        var95 = 0;
                                    } else if (var95 > 127) {
                                        var95 = 127;
                                    }
                                    int var96 = (var94 & 0x380) + (var94 + var9 & 0xFC00) + var95;
                                    var91 = class284.field4387[class49.method374(96, 127, var96)];
                                }
                                class293.method1962(var13, var65, var66, var82, var83, var89, var69, var71, var70, var72, class187.method1194(1904560007, var74, var78), class187.method1194(1904560007, var74, var80), class187.method1194(1904560007, var74, var79), class187.method1194(1904560007, var74, var81), class49.method374(var78, 127, var90), class49.method374(var80, 127, var90), class49.method374(var79, 127, var90), class49.method374(var81, 127, var90), var75, var91);
                                if (class249.field3893 && var13 > 0) {
                                    class60.method473(var82, var83, var90 == -2 || !var84.field1768, var74 == -1 || !class179.method1127(false, var67 - 1).field2844, var65, var66, var69 - class45.field923[0][var65][var66], -class45.field923[0][var65 - -1][var66] + var71, var70 - class45.field923[0][var65 + 1][var66 + 1], -class45.field923[0][var65][var66 + 1] + var72);
                                }
                            }
                        }
                    }
                }
            }
            if (class249.field3893) {
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                float[][] var103 = new float[105][105];
                int[][] var104 = class45.field923[var13];
                int var105 = 1;
                while (true) {
                    if (var105 > 103) {
                        if (arg2) {
                            class16[] var110 = class286.method1929(class99.field1749, var102, var101, class25.field498, class269.field4162[var13], var12, class160.field2607[var13], var10, arg1, var103, var13, class46.field954[0], class153.field2507[var13], class45.field923[var13], (byte) 21, class325.field4968[var13]);
                            class47.method366(var13, var110);
                            break;
                        }
                        class16[] var111 = class286.method1929(class99.field1749, var102, var101, (int[][]) null, class269.field4162[var13], var12, class160.field2607[var13], var10, arg1, var103, var13, (int[][]) null, class153.field2507[var13], class45.field923[var13], (byte) 21, class325.field4968[var13]);
                        class16[] var112 = class266.method1767(class153.field2507[var13], var101, class325.field4968[var13], var102, class160.field2607[var13], var13, var103, (byte) 59, class45.field923[var13], class99.field1749, var12, class269.field4162[var13]);
                        class16[] var113 = new class16[var111.length + var112.length];
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var113[var114] = var111[var114];
                        }
                        for (int var115 = 0; var115 < var112.length; var115++) {
                            var113[var111.length + var115] = var112[var115];
                        }
                        class47.method366(var13, var113);
                        class46.method364(class45.field923[var13], (byte) 92, class310.field4719, var101, class310.field4711, class160.field2607[var13], class153.field2507[var13], class269.field4162[var13], var103, var13, class325.field4968[var13], var102);
                        break;
                    }
                    for (int var106 = 1; var106 <= 103; var106++) {
                        int var107 = var104[var106 + 1][var105] - var104[var106 - 1][var105];
                        int var108 = var104[var106][var105 + 1] - var104[var106][var105 - 1];
                        float var109 = (float) Math.sqrt((double) (var108 * var108 + (var107 * var107 + 65536)));
                        var102[var106][var105] = (float) var107 / var109;
                        var101[var106][var105] = -256.0F / var109;
                        var103[var106][var105] = (float) var108 / var109;
                    }
                    var105++;
                }
            }
            class160.field2607[var13] = (byte[][]) null;
            class325.field4968[var13] = (byte[][]) null;
            class269.field4162[var13] = (byte[][]) null;
            class153.field2507[var13] = (byte[][]) null;
            class46.field957[var13] = (byte[][]) null;
        }
        class219.method1459(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var116 = 0; var116 < 104; var116++) {
            for (int var117 = 0; var117 < 104; var117++) {
                if ((class99.field1749[1][var116][var117] & 0x2) == 2) {
                    class200.method1275(var116, var117);
                }
            }
        }
        for (int var118 = 0; var118 < 4; var118++) {
            for (int var119 = 0; var119 <= 104; var119++) {
                for (int var120 = 0; var120 <= 104; var120++) {
                    if ((class267.field4121[var118][var120][var119] & 0x1) != 0) {
                        int var121 = var119;
                        int var122;
                        for (var122 = var119; var122 < 104 && (class267.field4121[var118][var120][var122 + 1] & 0x1) != 0; var122++) {
                        }
                        while (var121 > 0 && (class267.field4121[var118][var120][var121 - 1] & 0x1) != 0) {
                            var121--;
                        }
                        int var123 = var118;
                        int var124 = var118;
                        label450: while (var123 > 0) {
                            for (int var125 = var121; var125 <= var122; var125++) {
                                if ((class267.field4121[var123 - 1][var120][var125] & 0x1) == 0) {
                                    break label450;
                                }
                            }
                            var123--;
                        }
                        label439: while (var124 < 3) {
                            for (int var126 = var121; var126 <= var122; var126++) {
                                if ((class267.field4121[var124 + 1][var120][var126] & 0x1) == 0) {
                                    break label439;
                                }
                            }
                            var124++;
                        }
                        int var127 = (var122 + 1 - var121) * (var124 + 1 - var123);
                        if (var127 >= 8) {
                            short var128 = 240;
                            int var129 = class45.field923[var124][var120][var121] - var128;
                            int var130 = class45.field923[var123][var120][var121];
                            class330.method2289(1, var120 * 128, var120 * 128, var121 * 128, var122 * 128 + 128, var129, var130);
                            for (int var131 = var123; var131 <= var124; var131++) {
                                for (int var132 = var121; var132 <= var122; var132++) {
                                    class267.field4121[var131][var120][var132] = class61.method475(class267.field4121[var131][var120][var132], -2);
                                }
                            }
                        }
                    }
                    if ((class267.field4121[var118][var120][var119] & 0x2) != 0) {
                        int var133 = var120;
                        int var134;
                        for (var134 = var120; var134 < 104 && (class267.field4121[var118][var134 + 1][var119] & 0x2) != 0; var134++) {
                        }
                        while (var133 > 0 && (class267.field4121[var118][var133 - 1][var119] & 0x2) != 0) {
                            var133--;
                        }
                        int var135;
                        label505: for (var135 = var118; var135 > 0; var135--) {
                            for (int var136 = var133; var136 <= var134; var136++) {
                                if ((class267.field4121[var135 - 1][var136][var119] & 0x2) == 0) {
                                    break label505;
                                }
                            }
                        }
                        int var137;
                        label493: for (var137 = var118; var137 < 3; var137++) {
                            for (int var138 = var133; var138 <= var134; var138++) {
                                if ((class267.field4121[var137 + 1][var138][var119] & 0x2) == 0) {
                                    break label493;
                                }
                            }
                        }
                        int var139 = (var134 + 1 - var133) * (var137 + 1 - var135);
                        if (var139 >= 8) {
                            short var140 = 240;
                            int var141 = class45.field923[var137][var133][var119] - var140;
                            int var142 = class45.field923[var135][var133][var119];
                            class330.method2289(2, var133 * 128, var134 * 128 + 128, var119 * 128, var119 * 128, var141, var142);
                            for (int var143 = var135; var143 <= var137; var143++) {
                                for (int var144 = var133; var144 <= var134; var144++) {
                                    class267.field4121[var143][var144][var119] = class61.method475(class267.field4121[var143][var144][var119], -3);
                                }
                            }
                        }
                    }
                    if ((class267.field4121[var118][var120][var119] & 0x4) != 0) {
                        int var145 = var120;
                        int var146;
                        for (var146 = var119; var146 > 0 && (class267.field4121[var118][var120][var146 - 1] & 0x4) != 0; var146--) {
                        }
                        int var147 = var120;
                        int var148;
                        for (var148 = var119; var148 < 104 && (class267.field4121[var118][var120][var148 + 1] & 0x4) != 0; var148++) {
                        }
                        label559: while (var145 > 0) {
                            for (int var149 = var146; var149 <= var148; var149++) {
                                if ((class267.field4121[var118][var145 - 1][var149] & 0x4) == 0) {
                                    break label559;
                                }
                            }
                            var145--;
                        }
                        label548: while (var147 < 104) {
                            for (int var150 = var146; var150 <= var148; var150++) {
                                if ((class267.field4121[var118][var147 + 1][var150] & 0x4) == 0) {
                                    break label548;
                                }
                            }
                            var147++;
                        }
                        if ((var147 - (var145 - 1)) * (var148 - (var146 - 1)) >= 4) {
                            int var151 = class45.field923[var118][var145][var146];
                            class330.method2289(4, var145 * 128, var147 * 128 + 128, var146 * 128, var148 * 128 + 128, var151, var151);
                            for (int var152 = var145; var152 <= var147; var152++) {
                                for (int var153 = var146; var153 <= var148; var153++) {
                                    class267.field4121[var118][var152][var153] = class61.method475(class267.field4121[var118][var152][var153], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)Z", line = 1016)
    public static final boolean method1953(byte arg0) {
        field4456++;
        try {
            if (class18.field327 == 2) {
                if (class116.field2044 == null) {
                    class116.field2044 = class304.method2019(class147.field2402, class112.field1976, class38.field731);
                    if (class116.field2044 == null) {
                        return false;
                    }
                }
                if (class298.field4529 == null) {
                    class298.field4529 = new class244(class259.field4022, class80.field1574);
                }
                if (class29.field561.method2204(22050, class116.field2044, class133.field2246, (byte) -106, class298.field4529)) {
                    class29.field561.method2206((byte) 122);
                    class29.field561.method2231(class204.field3340, -121);
                    class29.field561.method2201(class116.field2044, class291.field4472, -2);
                    class116.field2044 = null;
                    class298.field4529 = null;
                    class18.field327 = 0;
                    class147.field2402 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class29.field561.method2199(-47);
            class298.field4529 = null;
            class116.field2044 = null;
            class18.field327 = 0;
            class147.field2402 = null;
        }
        if (arg0 >= -13) {
            field4449 = (class334) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIII)V", line = 1068)
    public static final void method1954(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 >= class147.field2416 && class259.field4024 >= arg3 && class59.field1162 <= arg4 && arg1 <= class186.field3028) {
            if (arg0 == 1) {
                class24.method201(-25895, arg3, arg4, arg1, arg5, arg6);
            } else {
                class136.method891(arg4, 0, arg6, arg3, arg5, arg1, arg0);
            }
        } else if (arg0 == 1) {
            class131.method863(arg4, 0, arg3, arg1, arg6, arg5);
        } else {
            class86.method601(arg4, 6421, arg5, arg0, arg1, arg3, arg6);
        }
        field4451++;
        if (arg2 != -2) {
            field4449 = (class334) null;
        }
    }
}
