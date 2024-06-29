import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public abstract class class127 {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Lr;")
    public static class118 field2901 = class153.method1136(125, " x ");

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "[I")
    public static int[] field2908 = new int[50];

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Lr;")
    private static class118 field2912 = class153.method1136(110, "This computers address has been blocked");

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Lr;")
    public static class118 field2900 = field2912;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lr;")
    public static class118 field2910 = class153.method1136(98, "sl_button");

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "Lr;")
    public static class118 field2916 = class153.method1136(103, "<img=1>");

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Lge;")
    public static class47 field2913 = new class47(64);

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Lr;")
    private static class118 field2918 = class153.method1136(118, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "Lr;")
    public static class118 field2917 = field2918;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lgb;")
    public static class45 field2902;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Lgf;")
    public static class48 field2915;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Lba;")
    public static class9 field2919;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "[I")
    public static int[] field2904;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "[Ln;")
    public static class90[] field2914;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method984(int arg0) {
        field2915 = null;
        field2914 = null;
        field2910 = null;
        field2902 = null;
        field2919 = null;
        field2912 = null;
        field2913 = null;
        field2904 = null;
        if (arg0 != 850814254) {
            field2916 = null;
        }
        field2918 = null;
        field2908 = null;
        field2917 = null;
        field2916 = null;
        field2901 = null;
        field2900 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lr;I)I")
    public static final int method985(class118 arg0, int arg1) {
        if (arg1 != 0) {
            field2915 = null;
        }
        field2907++;
        if (class15.field390 == 1) {
            return 7;
        } else if (arg0.method915(class20.field487, (byte) 123)) {
            return 1;
        } else if (arg0.method915(class75.field1846, (byte) 40)) {
            return 1;
        } else if (arg0.method915(class13.field278, (byte) 69)) {
            return 2;
        } else if (arg0.method915(class13.field283, (byte) 113)) {
            return 2;
        } else if (arg0.method915(class151.field3388, (byte) 116)) {
            return 3;
        } else if (arg0.method915(class118.field2766, (byte) 70)) {
            return 4;
        } else if (arg0.method915(class122.field2816, (byte) 80)) {
            return 4;
        } else if (arg0.method915(class136.field3063, (byte) 36)) {
            return 5;
        } else if (arg0.method915(class128.field2957, (byte) 54)) {
            return 6;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static final void method986(int arg0) {
        field2911++;
        if (class80.field1947 == 230) {
            int var1 = class53.field1253.method831((byte) 76);
            int var2 = var1 >> 2;
            int var3 = var1 & 0x3;
            int var4 = class43.field1035[var2];
            int var5 = class53.field1253.method819(false);
            int var6 = class53.field1253.method831((byte) 76);
            int var7 = (var6 >> 4 & 0x7) + class14.field360;
            int var8 = (var6 & 0x7) + class91.field2182;
            if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) {
                if (var4 == 0) {
                    class108 var9 = class68.field1583.method1145(class106.field2468, var7, var8);
                    if (var9 != null) {
                        int var10 = var9.field2518 >> 14 & 0x7FFF;
                        if (var2 == 2) {
                            var9.field2507 = new class157(var10, 2, var3 + 4, class106.field2468, var7, var8, var5, false, var9.field2507);
                            var9.field2504 = new class157(var10, 2, var3 + 1 & 0x3, class106.field2468, var7, var8, var5, false, var9.field2504);
                        } else {
                            var9.field2507 = new class157(var10, var2, var3, class106.field2468, var7, var8, var5, false, var9.field2507);
                        }
                    }
                }
                if (var4 == 1) {
                    class80 var11 = class68.field1583.method1167(class106.field2468, var7, var8);
                    if (var11 != null) {
                        int var12 = var11.field1943 >> 14 & 0x7FFF;
                        if (var2 == 4 || var2 == 5) {
                            var11.field1940 = new class157(var12, 4, var3, class106.field2468, var7, var8, var5, false, var11.field1940);
                        } else if (var2 == 6) {
                            var11.field1940 = new class157(var12, 4, var3 + 4, class106.field2468, var7, var8, var5, false, var11.field1940);
                        } else if (var2 == 7) {
                            var11.field1940 = new class157(var12, 4, (var3 + 2 & 0x3) + 4, class106.field2468, var7, var8, var5, false, var11.field1940);
                        } else if (var2 == 8) {
                            var11.field1940 = new class157(var12, 4, var3 + 4, class106.field2468, var7, var8, var5, false, var11.field1940);
                            var11.field1945 = new class157(var12, 4, (var3 + 2 & 0x3) + 4, class106.field2468, var7, var8, var5, false, var11.field1945);
                        }
                    }
                }
                if (var4 == 2) {
                    class137 var13 = class68.field1583.method1162(class106.field2468, var7, var8);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var13 != null) {
                        var13.field3120 = new class157(var13.field3127 >> 14 & 0x7FFF, var2, var3, class106.field2468, var7, var8, var5, false, var13.field3120);
                    }
                }
                if (var4 == 3) {
                    class64 var14 = class68.field1583.method1184(class106.field2468, var7, var8);
                    if (var14 != null) {
                        var14.field1459 = new class157(var14.field1463 >> 14 & 0x7FFF, 22, var3, class106.field2468, var7, var8, var5, false, var14.field1459);
                    }
                }
            }
            return;
        }
        if (arg0 != -19910) {
            field2900 = null;
        }
        if (class80.field1947 == 242) {
            int var15 = class53.field1253.method831((byte) 76);
            int var16 = (var15 >> 4 & 0x7) + class14.field360;
            int var17 = (var15 & 0x7) + class91.field2182;
            int var18 = class53.field1253.method838((byte) 5);
            int var19 = class53.field1253.method838((byte) 5);
            int var20 = class53.field1253.method838((byte) 5);
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                class113 var21 = class84.field2022[class106.field2468][var16][var17];
                if (var21 != null) {
                    for (class84 var22 = (class84) var21.method889(-7); var22 != null; var22 = (class84) var21.method884(true)) {
                        if ((var18 & 0x7FFF) == var22.field2016 && var22.field2001 == var19) {
                            var22.field2001 = var20;
                            break;
                        }
                    }
                    class35.method289(var17, arg0 ^ 0xFFFFB23A, var16);
                }
            }
        } else if (class80.field1947 == 146) {
            int var23 = class53.field1253.method819(false);
            int var24 = class53.field1253.method797(113);
            int var25 = class53.field1253.method803(arg0 + 19789);
            int var26 = (var25 >> 4 & 0x7) + class14.field360;
            int var27 = (var25 & 0x7) + class91.field2182;
            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
                class84 var28 = new class84();
                var28.field2001 = var24;
                var28.field2016 = var23;
                if (class84.field2022[class106.field2468][var26][var27] == null) {
                    class84.field2022[class106.field2468][var26][var27] = new class113();
                }
                class84.field2022[class106.field2468][var26][var27].method883(var28, -26866);
                class35.method289(var27, 0, var26);
            }
        } else if (class80.field1947 == 209) {
            int var29 = class53.field1253.method831((byte) 76);
            int var30 = (var29 & 0x7) + class91.field2182;
            int var31 = (var29 >> 4 & 0x7) + class14.field360;
            int var32 = class53.field1253.method807(false) + var31;
            int var33 = var30 + class53.field1253.method807(false);
            int var34 = class53.field1253.method790((byte) 127);
            int var35 = class53.field1253.method838((byte) 5);
            int var36 = class53.field1253.method831((byte) 76) * 4;
            int var37 = class53.field1253.method831((byte) 76) * 4;
            int var38 = class53.field1253.method838((byte) 5);
            int var39 = class53.field1253.method838((byte) 5);
            int var40 = class53.field1253.method831((byte) 76);
            int var41 = class53.field1253.method831((byte) 76);
            if (var31 >= 0 && var30 >= 0 && var31 < 104 && var30 < 104 && var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104 && var35 != 65535) {
                int var42 = var31 * 128 + 64;
                int var43 = var33 * 128 + 64;
                int var44 = var32 * 128 + 64;
                int var45 = var30 * 128 + 64;
                class24 var46 = new class24(var35, class106.field2468, var42, var45, class46.method386(-15186, class106.field2468, var42, var45) - var36, var38 - -class65.field1479, var39 + class65.field1479, var40, var41, var34, var37);
                var46.method217(class46.method386(-15186, class106.field2468, var44, var43) - var37, class65.field1479 + var38, 7, var44, var43);
                class140.field3186.method883(var46, arg0 - 6956);
            }
        } else {
            if (class80.field1947 == 100) {
                int var47 = class53.field1253.method823(17986);
                int var48 = class14.field360 + (var47 >> 4 & 0x7);
                int var49 = (var47 & 0x7) + class91.field2182;
                int var50 = class53.field1253.method838((byte) 5);
                int var51 = class53.field1253.method819(false);
                int var52 = class53.field1253.method832(arg0 ^ 0x5DA8);
                int var53 = class53.field1253.method832(-4206);
                byte var54 = class53.field1253.method807(false);
                int var55 = class53.field1253.method823(17986);
                int var56 = var55 & 0x3;
                int var57 = var55 >> 2;
                int var58 = class43.field1035[var57];
                byte var59 = class53.field1253.method804((byte) 21);
                byte var60 = class53.field1253.method818(arg0 + 19910);
                byte var61 = class53.field1253.method818(arg0 ^ 0xFFFFB23A);
                class132 var62;
                if (class94.field2240 == var53) {
                    var62 = class89.field2150;
                } else {
                    var62 = class108.field2526[var53];
                }
                if (var62 != null) {
                    class148 var63 = class47.method396(117, var52);
                    int var64;
                    int var65;
                    if (var56 == 1 || var56 == 3) {
                        var65 = var63.field3279;
                        var64 = var63.field3287;
                    } else {
                        var64 = var63.field3279;
                        var65 = var63.field3287;
                    }
                    int var66 = (var64 >> 1) + var48;
                    int var67 = (var64 + 1 >> 1) + var48;
                    int var68 = (var65 + 1 >> 1) + var49;
                    int var69 = var49 + (var65 >> 1);
                    int[][] var70 = class72.field1668[class106.field2468];
                    int var71 = var70[var66][var69] + var70[var67][var69] + var70[var66][var68] + var70[var67][var68] >> 2;
                    int var72 = (var48 << 7) + (var64 << 6);
                    int var73 = (var49 << 7) + (var65 << 6);
                    class155 var74 = var63.method1091(var70, var71, -50, var56, var72, var73, var57);
                    if (var74 != null) {
                        class55.method496(var58, 0, 0, var48, var50 + 1, var49, -1, var51 + 1, class106.field2468, (byte) -25);
                        var62.field3017 = var71;
                        var62.field2998 = var48 * 128 + var64 * 64;
                        var62.field3004 = class65.field1479 + var51;
                        var62.field3013 = var74;
                        var62.field3008 = var49 * 128 + var65 * 64;
                        var62.field3002 = var50 + class65.field1479;
                        if (var60 > var54) {
                            byte var75 = var60;
                            var60 = var54;
                            var54 = var75;
                        }
                        var62.field3015 = var48 + var60;
                        if (var59 < var61) {
                            byte var76 = var61;
                            var61 = var59;
                            var59 = var76;
                        }
                        var62.field3001 = var49 + var59;
                        var62.field2997 = var48 + var54;
                        var62.field3020 = var49 + var61;
                    }
                }
            }
            if (class80.field1947 == 92) {
                int var77 = class53.field1253.method819(false);
                int var78 = class53.field1253.method831((byte) 76);
                int var79 = var78 >> 2;
                int var80 = class43.field1035[var79];
                int var81 = var78 & 0x3;
                int var82 = class53.field1253.method803(-126);
                int var83 = (var82 & 0x7) + class91.field2182;
                int var84 = (var82 >> 4 & 0x7) + class14.field360;
                if (var84 >= 0 && var83 >= 0 && var84 < 104 && var83 < 104) {
                    class55.method496(var80, var79, var81, var84, -1, var83, var77, 0, class106.field2468, (byte) -25);
                }
            } else if (class80.field1947 == 178) {
                int var85 = class53.field1253.method831((byte) 76);
                int var86 = class91.field2182 + (var85 & 0x7);
                int var87 = (var85 >> 4 & 0x7) + class14.field360;
                int var88 = class53.field1253.method823(arg0 ^ 0xFFFFF478);
                int var89 = var88 & 0x3;
                int var90 = var88 >> 2;
                int var91 = class43.field1035[var90];
                if (var87 >= 0 && var86 >= 0 && var87 < 104 && var86 < 104) {
                    class55.method496(var91, var90, var89, var87, -1, var86, -1, 0, class106.field2468, (byte) -25);
                }
            } else if (class80.field1947 == 116) {
                int var92 = class53.field1253.method797(arg0 ^ 0xFFFFB240);
                int var93 = class53.field1253.method803(-120);
                int var94 = class91.field2182 + (var93 & 0x7);
                int var95 = (var93 >> 4 & 0x7) + class14.field360;
                if (var95 >= 0 && var94 >= 0 && var95 < 104 && var94 < 104) {
                    class113 var96 = class84.field2022[class106.field2468][var95][var94];
                    if (var96 != null) {
                        for (class84 var97 = (class84) var96.method889(-68); var97 != null; var97 = (class84) var96.method884(true)) {
                            if ((var92 & 0x7FFF) == var97.field2016) {
                                var97.method768(arg0 ^ 0x4DC5);
                                break;
                            }
                        }
                        if (var96.method889(127) == null) {
                            class84.field2022[class106.field2468][var95][var94] = null;
                        }
                        class35.method289(var94, 0, var95);
                    }
                }
            } else if (class80.field1947 == 167) {
                int var98 = class53.field1253.method803(-114);
                int var99 = (var98 & 0x7) + class91.field2182;
                int var100 = (var98 >> 4 & 0x7) + class14.field360;
                int var101 = class53.field1253.method819(false);
                int var102 = class53.field1253.method797(120);
                int var103 = class53.field1253.method819(false);
                if (var100 >= 0 && var99 >= 0 && var100 < 104 && var99 < 104 && class94.field2240 != var101) {
                    class84 var104 = new class84();
                    var104.field2001 = var102;
                    var104.field2016 = var103;
                    if (class84.field2022[class106.field2468][var100][var99] == null) {
                        class84.field2022[class106.field2468][var100][var99] = new class113();
                    }
                    class84.field2022[class106.field2468][var100][var99].method883(var104, arg0 - 6956);
                    class35.method289(var99, arg0 ^ 0xFFFFB23A, var100);
                }
            } else {
                if (class80.field1947 == 145) {
                    int var105 = class53.field1253.method831((byte) 76);
                    int var106 = (var105 >> 4 & 0x7) + class14.field360;
                    int var107 = (var105 & 0x7) + class91.field2182;
                    int var108 = class53.field1253.method838((byte) 5);
                    int var109 = class53.field1253.method831((byte) 76);
                    int var110 = var109 >> 4 & 0xF;
                    int var111 = var109 & 0x7;
                    int var112 = class53.field1253.method831((byte) 76);
                    if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104) {
                        int var113 = var110 + 1;
                        if (var106 - var113 <= class89.field2150.field710[0] && class89.field2150.field710[0] <= var106 + var113 && var107 - var113 <= class89.field2150.field755[0] && class89.field2150.field755[0] <= var107 + var113 && class91.field2178 != 0 && var111 > 0 && class108.field2525 < 50) {
                            field2908[class108.field2525] = var108;
                            class74.field1839[class108.field2525] = var111;
                            class142.field3220[class108.field2525] = var112;
                            class51.field1218[class108.field2525] = null;
                            class11.field262[class108.field2525] = (var106 << 16) + var110 + (var107 << 8);
                            class108.field2525++;
                        }
                    }
                }
                if (class80.field1947 == 175) {
                    int var114 = class53.field1253.method831((byte) 76);
                    int var115 = (var114 >> 4 & 0x7) + class14.field360;
                    int var116 = class91.field2182 + (var114 & 0x7);
                    int var117 = class53.field1253.method838((byte) 5);
                    int var118 = class53.field1253.method831((byte) 76);
                    int var119 = class53.field1253.method838((byte) 5);
                    if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                        int var120 = var116 * 128 + 64;
                        int var121 = var115 * 128 + 64;
                        class88 var122 = new class88(var117, class106.field2468, var121, var120, class46.method386(-15186, class106.field2468, var121, var120) - var118, var119, class65.field1479);
                        class99.field2289.method883(var122, -26866);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static final void method987(byte arg0) {
        if (arg0 != 89) {
            field2900 = null;
        }
        field2906++;
        field2913.method394(12693);
        class41.field969.method394(arg0 + 12604);
        class24.field603.method394(12693);
        class10.field225.method394(arg0 ^ 0x31CC);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method30(int arg0, Component arg1);

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)I")
    public abstract int method31(byte arg0);

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public static final void method988(int arg0) {
        class53.field1253.method726(-5);
        field2903++;
        int var1 = class53.field1253.method725(8, 8);
        if (var1 < class115.field2702) {
            for (int var2 = var1; var2 < class115.field2702; var2++) {
                class2.field37[class83.field1994++] = class68.field1580[var2];
            }
        }
        if (class115.field2702 < var1) {
            throw new RuntimeException("gnpov1");
        } else if (arg0 == -13237) {
            class115.field2702 = 0;
            for (int var3 = 0; var3 < var1; var3++) {
                int var4 = class68.field1580[var3];
                class83 var5 = class74.field1833[var4];
                int var6 = class53.field1253.method725(8, 1);
                if (var6 == 0) {
                    class68.field1580[class115.field2702++] = var4;
                    var5.field742 = class65.field1479;
                } else {
                    int var7 = class53.field1253.method725(8, 2);
                    if (var7 == 0) {
                        class68.field1580[class115.field2702++] = var4;
                        var5.field742 = class65.field1479;
                        class157.field3628[class92.field2216++] = var4;
                    } else if (var7 == 1) {
                        class68.field1580[class115.field2702++] = var4;
                        var5.field742 = class65.field1479;
                        int var8 = class53.field1253.method725(8, 3);
                        var5.method257((byte) -18, false, var8);
                        int var9 = class53.field1253.method725(8, 1);
                        if (var9 == 1) {
                            class157.field3628[class92.field2216++] = var4;
                        }
                    } else if (var7 == 2) {
                        class68.field1580[class115.field2702++] = var4;
                        var5.field742 = class65.field1479;
                        int var10 = class53.field1253.method725(8, 3);
                        var5.method257((byte) -18, true, var10);
                        int var11 = class53.field1253.method725(8, 3);
                        var5.method257((byte) -18, true, var11);
                        int var12 = class53.field1253.method725(8, 1);
                        if (var12 == 1) {
                            class157.field3628[class92.field2216++] = var4;
                        }
                    } else if (var7 == 3) {
                        class2.field37[class83.field1994++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method29(Component arg0, byte arg1);
}
