import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class160 extends class46 {

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public int field2402;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public static int field2412 = 0;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field2406 = 0;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field2400 = 0;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "Ll;")
    public static class133 field2413;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "Loj;")
    public static class284 field2416;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V", line = 5)
    public static void method1081(int arg0) {
        field2413 = null;
        if (arg0 != -1) {
            field2413 = (class133) null;
        }
        field2416 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)Z", line = 21)
    public final boolean method1082(byte arg0) {
        if (arg0 == 124) {
            field2417++;
            return ((this.field2403 & 0x27F93916) >> 29) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)Z", line = 32)
    public final boolean method1083(int arg0) {
        if (arg0 >= -91) {
            return true;
        } else {
            field2414++;
            return ((this.field2403 & 0x1AD9C3BB) >> 28) != 0;
        }
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)Z", line = 44)
    public final boolean method1084(int arg0) {
        if (arg0 != -1) {
            this.field2403 = -99;
        }
        field2404++;
        return ((this.field2403 & 0x33E1DF) >> 21) != 0;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Z)Z", line = 57)
    public final boolean method1085(boolean arg0) {
        field2418++;
        if (arg0) {
            return (this.field2403 >> 22 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)Z", line = 71)
    public final boolean method1086(int arg0, int arg1) {
        field2409++;
        if (arg1 > -15) {
            method1094((byte) 3, -42);
        }
        return (this.field2403 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)Z", line = 84)
    public final boolean method1087(byte arg0) {
        if (arg0 != -37) {
            this.method1093(-55);
        }
        field2408++;
        return (this.field2403 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)I", line = 95)
    public final int method1088(byte arg0) {
        field2405++;
        if (arg0 >= -72) {
            this.method1083(66);
        }
        return class253.method1747((byte) -46, this.field2403);
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)Z", line = 106)
    public final boolean method1089(byte arg0) {
        if (arg0 <= 53) {
            field2400 = 77;
        }
        field2399++;
        return (this.field2403 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([Lvg;ZB[[[I)V", line = 120)
    public static final void method1090(class303[] arg0, boolean arg1, byte arg2, int[][][] arg3) {
        if (!arg1) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class92.field1468[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class92.field1468[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg0[var7].method2060(arg2 ^ 0xFFFFFFD2, var5, var6);
                            }
                        }
                    }
                }
            }
            class31.field449 += (int) (Math.random() * 5.0D) - 2;
            if (class31.field449 < -8) {
                class31.field449 = -8;
            }
            if (class31.field449 > 8) {
                class31.field449 = 8;
            }
            class260.field4067 += (int) (Math.random() * 5.0D) - 2;
            if (class260.field4067 < -16) {
                class260.field4067 = -16;
            }
            if (class260.field4067 > 16) {
                class260.field4067 = 16;
            }
        }
        byte var8;
        if (arg1) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        int var9 = class31.field449 >> 2 << 10;
        field2407++;
        if (arg2 != -88) {
            method1081(-70);
        }
        int var10 = class260.field4067 >> 1;
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var8; var13++) {
            byte[][] var14 = class228.field3626[var13];
            if (!class94.field1516) {
                int var15 = (int) Math.sqrt(5100.0D);
                int var16 = var15 * 768 >> 8;
                for (int var17 = 1; var17 < 103; var17++) {
                    for (int var18 = 1; var18 < 103; var18++) {
                        byte var19 = 74;
                        int var20 = class218.field3321[var13][var18 + 1][var17] - class218.field3321[var13][var18 - 1][var17];
                        int var21 = class218.field3321[var13][var18][var17 + 1] - class218.field3321[var13][var18][var17 - 1];
                        int var22 = (int) Math.sqrt((double) (var20 * var20 + var21 * var21 + 65536));
                        int var23 = (var14[var18][var17 + 1] >> 3) + (var14[var18 + 1][var17] >> 3) + ((var14[var18 - 1][var17] >> 2) - -(var14[var18][var17 - 1] >> 2)) + (var14[var18][var17] >> 1);
                        int var24 = (var20 << 8) / var22;
                        int var25 = -65536 / var22;
                        int var26 = (var21 << 8) / var22;
                        int var27 = (var24 * -50 + var26 * -50 + (var25 * -10)) / var16 + var19;
                        var11[var18][var17] = var27 - var23;
                    }
                }
            } else if (class208.field3191) {
                for (int var28 = 1; var28 < 103; var28++) {
                    for (int var29 = 1; var29 < 103; var29++) {
                        byte var30 = 74;
                        int var31 = (var14[var29][var28 + 1] >> 3) + (var14[var29][var28 - 1] >> 2) + (var14[var29 - -1][var28] >> 3) + ((var14[var29 + -1][var28] >> 2) - -(var14[var29][var28] >> 1));
                        var11[var29][var28] = var30 - var31;
                    }
                }
            } else {
                int var32 = (int) class250.field3947[0];
                int var33 = (int) class250.field3947[1];
                int var34 = (int) class250.field3947[2];
                int var35 = (int) Math.sqrt((double) (var33 * var33 + var32 * var32 + var34 * var34));
                int var36 = var35 * 1024 >> 8;
                for (int var37 = 1; var37 < 103; var37++) {
                    for (int var38 = 1; var38 < 103; var38++) {
                        int var39 = class218.field3321[var13][var38][var37 + 1] - class218.field3321[var13][var38][var37 - 1];
                        int var40 = class218.field3321[var13][var38 + 1][var37] - class218.field3321[var13][var38 - 1][var37];
                        byte var41 = 96;
                        int var42 = (int) Math.sqrt((double) (var40 * var40 + (var39 * var39) + 65536));
                        int var43 = (var40 << 8) / var42;
                        int var44 = (var39 << 8) / var42;
                        int var45 = -65536 / var42;
                        int var46 = (var32 * var43 + var33 * var45 + (var34 * var44)) / var36 + var41;
                        int var47 = (var14[var38 + 1][var37] >> 3) + (var14[var38][var37 - 1] >> 2) + (var14[var38 - 1][var37] >> 2) - (-(var14[var38][var37 + 1] >> 3) + -(var14[var38][var37] >> 1));
                        var11[var38][var37] = var46 - ((int) ((float) var47 * 1.7F));
                    }
                }
            }
            for (int var48 = 0; var48 < 104; var48++) {
                class152.field2289[var48] = 0;
                class63.field1013[var48] = 0;
                class247.field3920[var48] = 0;
                class234.field3729[var48] = 0;
                class18.field244[var48] = 0;
            }
            for (int var49 = -5; var49 < 104; var49++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    int var51 = var49 + 5;
                    int var10002;
                    if (var51 < 104) {
                        int var52 = class239.field3816[var13][var51][var50] & 0xFF;
                        if (var52 > 0) {
                            class50 var53 = class223.method1581(var52 - 1, -28950);
                            class152.field2289[var50] += var53.field809;
                            class63.field1013[var50] += var53.field805;
                            class247.field3920[var50] += var53.field799;
                            class234.field3729[var50] += var53.field800;
                            var10002 = class18.field244[var50]++;
                        }
                    }
                    int var54 = var49 - 5;
                    if (var54 >= 0) {
                        int var55 = class239.field3816[var13][var54][var50] & 0xFF;
                        if (var55 > 0) {
                            class50 var56 = class223.method1581(var55 - 1, -28950);
                            class152.field2289[var50] -= var56.field809;
                            class63.field1013[var50] -= var56.field805;
                            class247.field3920[var50] -= var56.field799;
                            class234.field3729[var50] -= var56.field800;
                            var10002 = class18.field244[var50]--;
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
                        if (var63 < 104) {
                            var59 += class63.field1013[var63];
                            var60 += class234.field3729[var63];
                            var57 += class152.field2289[var63];
                            var58 += class247.field3920[var63];
                            var61 += class18.field244[var63];
                        }
                        int var64 = var62 - 5;
                        if (var64 >= 0) {
                            var58 -= class247.field3920[var64];
                            var57 -= class152.field2289[var64];
                            var60 -= class234.field3729[var64];
                            var59 -= class63.field1013[var64];
                            var61 -= class18.field244[var64];
                        }
                        if (var62 >= 0 && var61 > 0) {
                            var12[var49][var62] = class121.method884((byte) -68, var57 * 256 / var60, var59 / var61, var58 / var61);
                        }
                    }
                }
            }
            for (int var65 = 1; var65 < 103; var65++) {
                label779: for (int var66 = 1; var66 < 103; var66++) {
                    if (arg1 || class19.method150(-102) || (class92.field1468[0][var65][var66] & 0x2) != 0 || (class92.field1468[var13][var65][var66] & 0x10) == 0 && class342.method2365(var66, arg2 ^ 0xFFFFFFA9, var65, var13) == class276.field4262) {
                        if (class237.field3779 > var13) {
                            class237.field3779 = var13;
                        }
                        int var67 = class264.field4104[var13][var65][var66] & 0xFF;
                        int var68 = class239.field3816[var13][var65][var66] & 0xFF;
                        if (var68 > 0 || var67 > 0) {
                            int var69 = class218.field3321[var13][var65][var66];
                            int var70 = class218.field3321[var13][var65 + 1][var66 + 1];
                            int var71 = class218.field3321[var13][var65 + 1][var66];
                            int var72 = class218.field3321[var13][var65][var66 + 1];
                            if (var13 > 0) {
                                boolean var73 = true;
                                if (var68 == 0 && class339.field5307[var13][var65][var66] != 0) {
                                    var73 = false;
                                }
                                if (var67 > 0 && !class43.method371(var67 - 1, false).field4029) {
                                    var73 = false;
                                }
                                if (var73 && var69 == var71 && var69 == var70 && var69 == var72) {
                                    class61.field989[var13][var65][var66] = class222.method1577(class61.field989[var13][var65][var66], 4);
                                }
                            }
                            int var74;
                            int var75;
                            if (var68 <= 0) {
                                var74 = -1;
                                var75 = 0;
                            } else {
                                var74 = var12[var65][var66];
                                int var76 = (var74 & 0x7F) + var10;
                                if (var76 < 0) {
                                    var76 = 0;
                                } else if (var76 > 127) {
                                    var76 = 127;
                                }
                                int var77 = (var9 + var74 & 0xFC00) + var76 + (var74 & 0x380);
                                var75 = class15.field215[class149.method1033(-7044, 96, var77)];
                            }
                            int var78 = var11[var65 + 1][var66];
                            int var79 = var11[var65][var66];
                            int var80 = var11[var65 + 1][var66 + 1];
                            int var81 = var11[var65][var66 + 1];
                            if (var67 == 0) {
                                class182.method1301(var13, var65, var66, 0, 0, -1, var69, var71, var70, var72, class149.method1033(arg2 - 6956, var79, var74), class149.method1033(-7044, var78, var74), class149.method1033(-7044, var80, var74), class149.method1033(-7044, var81, var74), 0, 0, 0, 0, var75, 0);
                                if (class94.field1516 && var13 > 0 && var74 != -1 && class223.method1581(var68 - 1, -28950).field797) {
                                    class6.method40(0, 0, true, false, var65, var66, var69 - class218.field3321[0][var65][var66], -class218.field3321[0][var65 + 1][var66] + var71, var70 - class218.field3321[0][var65 + 1][var66 + 1], -class218.field3321[0][var65][var66 + 1] + var72);
                                }
                                if (class94.field1516 && !arg1 && class121.field1848 != null && var13 == 0) {
                                    for (int var82 = var65 - 1; var82 <= (var65 + 1); var82++) {
                                        for (int var83 = var66 - 1; var83 <= (var66 + 1); var83++) {
                                            if ((var65 != var82 || var66 != var83) && var82 >= 0 && var82 < 104 && var83 >= 0 && var83 < 104) {
                                                int var84 = class264.field4104[var13][var82][var83] & 0xFF;
                                                if (var84 != 0) {
                                                    class257 var85 = class43.method371(var84 - 1, false);
                                                    if (var85.field4022 != -1 && class89.method646((byte) -57, class15.field207.method2079((byte) 42, var85.field4022))) {
                                                        class121.field1848[var65][var66] = (var85.field4037 << 24) + var85.field4023;
                                                        continue label779;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var86 = class339.field5307[var13][var65][var66] + 1;
                                byte var87 = class1.field8[var13][var65][var66];
                                class257 var88 = class43.method371(var67 - 1, false);
                                if (class94.field1516 && !arg1 && class121.field1848 != null && var13 == 0) {
                                    if (var88.field4022 != -1 && class89.method646((byte) -57, class15.field207.method2079((byte) 42, var88.field4022))) {
                                        class121.field1848[var65][var66] = (var88.field4037 << 24) + var88.field4023;
                                    } else {
                                        label760: for (int var89 = var65 - 1; var89 <= (var65 + 1); var89++) {
                                            for (int var90 = var66 - 1; var90 <= var66 + 1; var90++) {
                                                if ((var65 != var89 || var66 != var90) && var89 >= 0 && var89 < 104 && var90 >= 0 && var90 < 104) {
                                                    int var91 = class264.field4104[var13][var89][var90] & 0xFF;
                                                    if (var91 != 0) {
                                                        class257 var92 = class43.method371(var91 - 1, false);
                                                        if (var92.field4022 != -1 && class89.method646((byte) -57, class15.field207.method2079((byte) 42, var92.field4022))) {
                                                            class121.field1848[var65][var66] = (var92.field4037 << 24) + var92.field4023;
                                                            break label760;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var93 = var88.field4022;
                                if (var93 >= 0 && !class15.field207.method2092(var93, arg2 - 19915)) {
                                    var93 = -1;
                                }
                                int var94;
                                int var95;
                                if (var93 >= 0) {
                                    var95 = class15.field215[class12.method92(-385541369, 96, class15.field207.method2085(var93, (byte) -84))];
                                    var94 = -1;
                                } else if (var88.field4034 == -1) {
                                    var94 = -2;
                                    var95 = 0;
                                } else {
                                    var94 = var88.field4034;
                                    int var96 = (var94 & 0x7F) + var10;
                                    if (var96 < 0) {
                                        var96 = 0;
                                    } else if (var96 > 127) {
                                        var96 = 127;
                                    }
                                    int var97 = (var94 & 0x380) + ((var94 + var9 & 0xFC00) + var96);
                                    var95 = class15.field215[class12.method92(-385541369, 96, var97)];
                                }
                                if (var88.field4026 >= 0) {
                                    int var98 = var88.field4026;
                                    int var99 = (var98 & 0x7F) + var10;
                                    if (var99 < 0) {
                                        var99 = 0;
                                    } else if (var99 > 127) {
                                        var99 = 127;
                                    }
                                    int var100 = (var9 + var98 & 0xFC00) + (var98 & 0x380) + var99;
                                    var95 = class15.field215[class12.method92(arg2 - 385541281, 96, var100)];
                                }
                                class182.method1301(var13, var65, var66, var86, var87, var93, var69, var71, var70, var72, class149.method1033(-7044, var79, var74), class149.method1033(-7044, var78, var74), class149.method1033(-7044, var80, var74), class149.method1033(arg2 - 6956, var81, var74), class12.method92(-385541369, var79, var94), class12.method92(arg2 ^ 0x16FAE4AF, var78, var94), class12.method92(arg2 ^ 0x16FAE4AF, var80, var94), class12.method92(arg2 ^ 0x16FAE4AF, var81, var94), var75, var95);
                                if (class94.field1516 && var13 > 0) {
                                    class6.method40(var86, var87, var94 == -2 || !var88.field4038, var74 == -1 || !class223.method1581(var68 - 1, -28950).field797, var65, var66, var69 - class218.field3321[0][var65][var66], -class218.field3321[0][var65 + 1][var66] + var71, var70 - class218.field3321[0][var65 + 1][var66 + 1], -class218.field3321[0][var65][var66 - -1] + var72);
                                }
                            }
                        }
                    }
                }
            }
            if (class94.field1516) {
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                float[][] var103 = new float[105][105];
                int[][] var104 = class218.field3321[var13];
                int var105 = 1;
                while (true) {
                    if (var105 > 103) {
                        if (arg1) {
                            class127[] var115 = class60.method475(class92.field1468, class239.field3816[var13], class339.field5307[var13], var11, arg3, class264.field4104[var13], class121.field1848, var101, -119, var102, class216.field3293[0], var12, var13, class1.field8[var13], class218.field3321[var13], var103);
                            class85.method603(var13, var115);
                            break;
                        }
                        class127[] var110 = class60.method475(class92.field1468, class239.field3816[var13], class339.field5307[var13], var11, arg3, class264.field4104[var13], (int[][]) null, var101, -29, var102, (int[][]) null, var12, var13, class1.field8[var13], class218.field3321[var13], var103);
                        class127[] var111 = class304.method2076(var102, var101, class264.field4104[var13], class339.field5307[var13], (byte) -34, var13, class239.field3816[var13], var103, var11, class218.field3321[var13], class92.field1468, class1.field8[var13]);
                        class127[] var112 = new class127[var110.length + var111.length];
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var112[var113] = var110[var113];
                        }
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var112[var114 + var110.length] = var111[var114];
                        }
                        class85.method603(var13, var112);
                        class205.method1455(class1.field8[var13], class339.field5307[var13], var102, -10272, var13, class183.field2755, class183.field2763, var103, class264.field4104[var13], var101, class239.field3816[var13], class218.field3321[var13]);
                        break;
                    }
                    for (int var106 = 1; var106 <= 103; var106++) {
                        int var107 = var104[var106 + 1][var105] - var104[var106 - 1][var105];
                        int var108 = var104[var106][var105 + 1] - var104[var106][var105 - 1];
                        float var109 = (float) Math.sqrt((double) (var107 * var107 + var108 * var108 + 65536));
                        var102[var106][var105] = (float) var107 / var109;
                        var101[var106][var105] = -256.0F / var109;
                        var103[var106][var105] = (float) var108 / var109;
                    }
                    var105++;
                }
            }
            class239.field3816[var13] = (byte[][]) null;
            class264.field4104[var13] = (byte[][]) null;
            class339.field5307[var13] = (byte[][]) null;
            class1.field8[var13] = (byte[][]) null;
            class228.field3626[var13] = (byte[][]) null;
        }
        class92.method656(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var116 = 0; var116 < 104; var116++) {
            for (int var117 = 0; var117 < 104; var117++) {
                if ((class92.field1468[1][var116][var117] & 0x2) == 2) {
                    class242.method1680(var116, var117);
                }
            }
        }
        for (int var118 = 0; var118 < 4; var118++) {
            for (int var119 = 0; var119 <= 104; var119++) {
                for (int var120 = 0; var120 <= 104; var120++) {
                    if ((class61.field989[var118][var120][var119] & 0x1) != 0) {
                        int var121;
                        for (var121 = var119; var121 > 0 && (class61.field989[var118][var120][var121 - 1] & 0x1) != 0; var121--) {
                        }
                        int var122;
                        for (var122 = var119; var122 < 104 && (class61.field989[var118][var120][var122 + 1] & 0x1) != 0; var122++) {
                        }
                        int var123;
                        label460: for (var123 = var118; var123 > 0; var123--) {
                            for (int var124 = var121; var124 <= var122; var124++) {
                                if ((class61.field989[var123 - 1][var120][var124] & 0x1) == 0) {
                                    break label460;
                                }
                            }
                        }
                        int var125;
                        label448: for (var125 = var118; var125 < 3; var125++) {
                            for (int var126 = var121; var126 <= var122; var126++) {
                                if ((class61.field989[var125 + 1][var120][var126] & 0x1) == 0) {
                                    break label448;
                                }
                            }
                        }
                        int var127 = (var122 + 1 - var121) * (var125 + 1 - var123);
                        if (var127 >= 8) {
                            short var128 = 240;
                            int var129 = class218.field3321[var125][var120][var121] - var128;
                            int var130 = class218.field3321[var123][var120][var121];
                            class162.method1104(1, var120 * 128, var120 * 128, var121 * 128, var122 * 128 + 128, var129, var130);
                            for (int var131 = var123; var131 <= var125; var131++) {
                                for (int var132 = var121; var132 <= var122; var132++) {
                                    class61.field989[var131][var120][var132] = class270.method1860(class61.field989[var131][var120][var132], -2);
                                }
                            }
                        }
                    }
                    if ((class61.field989[var118][var120][var119] & 0x2) != 0) {
                        int var133;
                        for (var133 = var120; var133 > 0 && (class61.field989[var118][var133 - 1][var119] & 0x2) != 0; var133--) {
                        }
                        int var134;
                        for (var134 = var120; var134 < 104 && (class61.field989[var118][var134 + 1][var119] & 0x2) != 0; var134++) {
                        }
                        int var135 = var118;
                        int var136;
                        label515: for (var136 = var118; var136 > 0; var136--) {
                            for (int var137 = var133; var137 <= var134; var137++) {
                                if ((class61.field989[var136 - 1][var137][var119] & 0x2) == 0) {
                                    break label515;
                                }
                            }
                        }
                        label504: while (var135 < 3) {
                            for (int var138 = var133; var138 <= var134; var138++) {
                                if ((class61.field989[var135 + 1][var138][var119] & 0x2) == 0) {
                                    break label504;
                                }
                            }
                            var135++;
                        }
                        int var139 = (var134 + 1 - var133) * (var135 + 1 - var136);
                        if (var139 >= 8) {
                            short var140 = 240;
                            int var141 = class218.field3321[var135][var133][var119] - var140;
                            int var142 = class218.field3321[var136][var133][var119];
                            class162.method1104(2, var133 * 128, var134 * 128 + 128, var119 * 128, var119 * 128, var141, var142);
                            for (int var143 = var136; var143 <= var135; var143++) {
                                for (int var144 = var133; var144 <= var134; var144++) {
                                    class61.field989[var143][var144][var119] = class270.method1860(class61.field989[var143][var144][var119], -3);
                                }
                            }
                        }
                    }
                    if ((class61.field989[var118][var120][var119] & 0x4) != 0) {
                        int var145 = var120;
                        int var146 = var120;
                        int var147;
                        for (var147 = var119; var147 > 0 && (class61.field989[var118][var120][var147 - 1] & 0x4) != 0; var147--) {
                        }
                        int var148;
                        for (var148 = var119; var148 < 104 && (class61.field989[var118][var120][var148 + 1] & 0x4) != 0; var148++) {
                        }
                        label570: while (var145 > 0) {
                            for (int var149 = var147; var149 <= var148; var149++) {
                                if ((class61.field989[var118][var145 - 1][var149] & 0x4) == 0) {
                                    break label570;
                                }
                            }
                            var145--;
                        }
                        label559: while (var146 < 104) {
                            for (int var150 = var147; var150 <= var148; var150++) {
                                if ((class61.field989[var118][var146 + 1][var150] & 0x4) == 0) {
                                    break label559;
                                }
                            }
                            var146++;
                        }
                        if ((var146 + 1 - var145) * (var148 + 1 - var147) >= 4) {
                            int var151 = class218.field3321[var118][var145][var147];
                            class162.method1104(4, var145 * 128, var146 * 128 + 128, var147 * 128, var148 * 128 + 128, var151, var151);
                            for (int var152 = var145; var152 <= var146; var152++) {
                                for (int var153 = var147; var153 <= var148; var153++) {
                                    class61.field989[var118][var152][var153] = class270.method1860(class61.field989[var118][var152][var153], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(II)V", line = 1101)
    public class160(int arg0, int arg1) {
        this.field2403 = arg0;
        this.field2402 = arg1;
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)I", line = 1124)
    public static final int method1091(int arg0) {
        field2415++;
        if (arg0 != 127) {
            field2412 = -65;
        }
        return class73.field1193.method2182((byte) 69);
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(Z)Z", line = 1135)
    public final boolean method1092(boolean arg0) {
        if (arg0) {
            this.field2402 = -104;
        }
        field2401++;
        return (this.field2403 & 0x649354F9) >> 30 != 0;
    }

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)I", line = 1146)
    public final int method1093(int arg0) {
        field2410++;
        if (arg0 != -2093898926) {
            field2400 = 31;
        }
        return this.field2403 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)I", line = 1157)
    public static final int method1094(byte arg0, int arg1) {
        field2411++;
        int var2 = 79 % ((55 - arg0) / 50);
        int var3 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var4 = arg1 * 6 - 61440;
        int var5 = (arg1 * var4 >> 12) + 40960;
        return var3 * var5 >> 12;
    }
}
