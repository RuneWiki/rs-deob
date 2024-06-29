import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class223 extends class228 {

    @OriginalMember(owner = "client!md", name = "bb", descriptor = "I")
    private int field3876 = 0;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "I")
    private int field3873 = 1;

    @OriginalMember(owner = "client!md", name = "gb", descriptor = "I")
    private int field3881 = 5;

    @OriginalMember(owner = "client!md", name = "V", descriptor = "I")
    private int field3870 = 2048;

    @OriginalMember(owner = "client!md", name = "jb", descriptor = "[B")
    private byte[] field3884 = new byte[512];

    @OriginalMember(owner = "client!md", name = "lb", descriptor = "I")
    private int field3886 = 2;

    @OriginalMember(owner = "client!md", name = "nb", descriptor = "[S")
    private short[] field3888 = new short[512];

    @OriginalMember(owner = "client!md", name = "hb", descriptor = "I")
    private int field3882 = 5;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "Loa;")
    private static class99 field3867 = class221.method1463(2844, "Loading title screen )2 ");

    @OriginalMember(owner = "client!md", name = "db", descriptor = "Loa;")
    public static class99 field3878 = field3867;

    @OriginalMember(owner = "client!md", name = "ab", descriptor = "[I")
    public static int[] field3875 = new int[2];

    @OriginalMember(owner = "client!md", name = "fb", descriptor = "I")
    public static int field3880 = 0;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!md", name = "X", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!md", name = "Z", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!md", name = "cb", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!md", name = "eb", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!md", name = "ib", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!md", name = "mb", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!md", name = "kb", descriptor = "[I")
    public static int[] field3885;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "[[[B")
    public static byte[][][] field3871;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "(B)V")
    public static void method1473(byte arg0) {
        field3875 = null;
        field3867 = null;
        field3871 = null;
        field3878 = null;
        if (arg0 > 107) {
            field3885 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg2 == -7618) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (~arg0 != -3) {
                        if (~arg0 != -4) {
                            if (~arg0 != -5) {
                                if (~arg0 != -6) {
                                    if (arg0 == 6) {
                                        this.field3882 = arg1.method1693((byte) -123);
                                    }
                                } else {
                                    this.field3881 = arg1.method1693((byte) -96);
                                }
                            } else {
                                this.field3873 = arg1.method1693((byte) -127);
                            }
                        } else {
                            this.field3886 = arg1.method1693((byte) -115);
                        }
                    } else {
                        this.field3870 = arg1.method1740((byte) 79);
                    }
                } else {
                    this.field3876 = arg1.method1693((byte) 74);
                }
            } else {
                this.field3881 = this.field3882 = arg1.method1693((byte) -109);
            }
            ++field3869;
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
    public final void method278(int arg0) {
        this.field3884 = class131.method869(255, this.field3876);
        ++field3877;
        if (arg0 != -8) {
            method1473((byte) -6);
        }
        this.method1478((byte) 85);
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(III)I")
    public static final int method1474(int arg0, int arg1, int arg2) {
        ++field3887;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg1 == arg2) {
            if (~arg0 <= -3) {
                if (~arg0 < -127) {
                    arg0 = 126;
                }
            } else {
                arg0 = 2;
            }
            return arg0;
        } else {
            int var3 = (127 & arg2) * arg0 >> 7;
            if (~var3 > -3) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (65408 & arg2) + var3;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([Lob;BZ)V")
    public static final void method1475(class131[] arg0, byte arg1, boolean arg2) {
        ++field3883;
        byte var3;
        if (!arg2) {
            var3 = 4;
        } else {
            var3 = 1;
        }
        if (!arg2) {
            for (int var4 = 0; ~var4 > -5; ++var4) {
                for (int var5 = 0; var5 < 104; ++var5) {
                    for (int var6 = 0; ~var6 > -105; ++var6) {
                        if (~(1 & class230.field3973[var4][var5][var6]) == -2) {
                            int var7 = var4;
                            if ((2 & class230.field3973[1][var5][var6]) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg0[var7].method866(-12585, var5, var6);
                            }
                        }
                    }
                }
            }
            class259.field4518 += -2 + (int) (Math.random() * 5.0D);
            if (~class259.field4518 > 7) {
                class259.field4518 = -8;
            }
            class242.field4194 += (int) (Math.random() * 5.0D) - 2;
            if (~class242.field4194 > 15) {
                class242.field4194 = -16;
            }
            if (class259.field4518 > 8) {
                class259.field4518 = 8;
            }
            if (~class242.field4194 < -17) {
                class242.field4194 = 16;
            }
        }
        if (arg1 != 75) {
            method1476(false, -109);
        }
        int var8 = class242.field4194 >> 1;
        int[][] var9 = new int[104][104];
        int var10 = class259.field4518 >> 2 << 10;
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var3 > var12; ++var12) {
            byte[][] var51 = class180.field3136[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; ~var54 > -104; ++var54) {
                for (int var100 = 1; var100 < 103; ++var100) {
                    byte var101 = 74;
                    int var102 = class189.field3337[var12][var100][var54 - -1] + -class189.field3337[var12][var100][var54 + -1];
                    int var103 = class189.field3337[var12][var100 + 1][var54] + -class189.field3337[var12][var100 + -1][var54];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var103 << 8) / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = -65536 / var104;
                    int var108 = (var51[var100][var54 + 1] >> 3) + (var51[var100 + -1][var54] >> 2) - -(var51[var100 + 1][var54] >> 3) + (var51[var100][var54 + -1] >> 2) + (var51[var100][var54] >> 1);
                    int var109 = (var107 * -10 + var105 * -50 + var106 * -50) / var53 + var101;
                    var11[var100][var54] = -var108 + var109;
                }
            }
            for (int var55 = 0; var55 < 104; ++var55) {
                class280.field4903[var55] = 0;
                class80.field1416[var55] = 0;
                class200.field3480[var55] = 0;
                class30.field557[var55] = 0;
                class133.field2320[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; ++var56) {
                for (int var85 = 0; ~var85 > -105; ++var85) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = 255 & class24.field357[var12][var94][var85];
                        if (~var95 < -1) {
                            class179 var96 = class248.method1607(arg1 + 180, var95 + -1);
                            class280.field4903[var85] += var96.field3117;
                            class80.field1416[var85] += var96.field3108;
                            class200.field3480[var85] += var96.field3121;
                            class30.field557[var85] += var96.field3119;
                            var10002 = class133.field2320[var85]++;
                        }
                    }
                    int var97 = var56 + -5;
                    if (~var97 <= -1) {
                        int var98 = class24.field357[var12][var97][var85] & 255;
                        if (~var98 < -1) {
                            class179 var99 = class248.method1607(255, var98 + -1);
                            class280.field4903[var85] -= var99.field3117;
                            class80.field1416[var85] -= var99.field3108;
                            class200.field3480[var85] -= var99.field3121;
                            class30.field557[var85] -= var99.field3119;
                            var10002 = class133.field2320[var85]--;
                        }
                    }
                }
                if (~var56 <= -1) {
                    int var86 = 0;
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    for (int var91 = -5; ~var91 > -105; ++var91) {
                        int var92 = var91 - -5;
                        if (var92 < 104) {
                            var88 += class30.field557[var92];
                            var89 += class80.field1416[var92];
                            var87 += class200.field3480[var92];
                            var90 += class133.field2320[var92];
                            var86 += class280.field4903[var92];
                        }
                        int var93 = var91 + -5;
                        if (~var93 <= -1) {
                            var88 -= class30.field557[var93];
                            var86 -= class280.field4903[var93];
                            var90 -= class133.field2320[var93];
                            var87 -= class200.field3480[var93];
                            var89 -= class80.field1416[var93];
                        }
                        if (var91 >= 0 && var90 > 0) {
                            var9[var56][var91] = class200.method1342(var87 / var90, (byte) 117, var86 * 256 / var88, var89 / var90);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; ++var57) {
                for (int var58 = 1; ~var58 > -104; ++var58) {
                    if (arg2 || class139.method951(436421925) || (2 & class230.field3973[0][var57][var58]) != 0 || ~(16 & class230.field3973[var12][var57][var58]) == -1 && class58.method396((byte) -122, var57, var12, var58) == class12.field112) {
                        if (var12 < class255.field4408) {
                            class255.field4408 = var12;
                        }
                        int var59 = 255 & class111.field2001[var12][var57][var58];
                        int var60 = class24.field357[var12][var57][var58] & 255;
                        if (var60 > 0 || var59 > 0) {
                            int var61 = class189.field3337[var12][var57 + 1][var58];
                            int var62 = class189.field3337[var12][var57][var58 - -1];
                            int var63 = class189.field3337[var12][var57][var58];
                            int var64 = class189.field3337[var12][var57 - -1][var58 - -1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (~var60 == -1 && class224.field3897[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (~var59 < -1 && !class17.method102(4, var59 + -1).field2663) {
                                    var65 = false;
                                }
                                if (var65 && ~var61 == ~var63 && ~var63 == ~var64 && ~var62 == ~var63) {
                                    class13.field114[var12][var57][var58] = class179.method1194(class13.field114[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var69;
                            if (var60 > 0) {
                                var66 = var9[var57][var58];
                                int var67 = (var66 & 127) - -var8;
                                if (var67 < 0) {
                                    var67 = 0;
                                } else if (~var67 < -128) {
                                    var67 = 127;
                                }
                                int var68 = (var10 + var66 & 64512) + (896 & var66) + var67;
                                var69 = class134.field2349[class29.method252(var68, 96, (byte) -78)];
                            } else {
                                var69 = 0;
                                var66 = -1;
                            }
                            int var70 = var11[var57][var58];
                            int var71 = var11[var57 + 1][var58];
                            int var72 = var11[var57 + 1][var58 + 1];
                            int var73 = var11[var57][var58 + 1];
                            if (var59 == 0) {
                                class76.method530(var12, var57, var58, 0, 0, -1, var63, var61, var64, var62, class29.method252(var66, var70, (byte) -104), class29.method252(var66, var71, (byte) -82), class29.method252(var66, var72, (byte) -73), class29.method252(var66, var73, (byte) -72), 0, 0, 0, 0, var69, 0);
                            } else {
                                int var74 = class224.field3897[var12][var57][var58] + 1;
                                byte var75 = class69.field1148[var12][var57][var58];
                                class152 var76 = class17.method102(arg1 ^ 79, var59 + -1);
                                int var77 = var76.field2669;
                                if (var77 >= 0 && !class134.field2338.method835(32401, var77)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var79;
                                if (var77 >= 0) {
                                    var78 = -1;
                                    var79 = class134.field2349[method1474(96, -1, class134.field2338.method836(var77, 11775))];
                                } else if (~var76.field2664 != 0) {
                                    var78 = var76.field2664;
                                    int var80 = (var78 & 127) + var8;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (~var80 < -128) {
                                        var80 = 127;
                                    }
                                    int var81 = (var78 - -var10 & 64512) + (896 & var78) - -var80;
                                    var79 = class134.field2349[method1474(96, -1, var81)];
                                } else {
                                    var78 = -2;
                                    var79 = 0;
                                }
                                if (~var76.field2662 <= -1) {
                                    int var82 = var76.field2662;
                                    int var83 = (var82 & 127) + var8;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (~var83 < -128) {
                                        var83 = 127;
                                    }
                                    int var84 = (64512 & var10 + var82) + (var82 & 896) + var83;
                                    var79 = class134.field2349[method1474(96, -1, var84)];
                                }
                                class76.method530(var12, var57, var58, var74, var75, var77, var63, var61, var64, var62, class29.method252(var66, var70, (byte) -128), class29.method252(var66, var71, (byte) -100), class29.method252(var66, var72, (byte) -80), class29.method252(var66, var73, (byte) -107), method1474(var70, -1, var78), method1474(var71, -1, var78), method1474(var72, arg1 + -76, var78), method1474(var73, -1, var78), var69, var79);
                            }
                        }
                    }
                }
            }
            class24.field357[var12] = null;
            class111.field2001[var12] = null;
            class224.field3897[var12] = null;
            class69.field1148[var12] = null;
            class180.field3136[var12] = null;
        }
        class123.method815(-50, -10, -50);
        if (!arg2) {
            for (int var13 = 0; ~var13 > -105; ++var13) {
                for (int var50 = 0; ~var50 > -105; ++var50) {
                    if (~(class230.field3973[1][var13][var50] & 2) == -3) {
                        class41.method312(var13, var50);
                    }
                }
            }
            for (int var14 = 0; ~var14 > -5; ++var14) {
                for (int var15 = 0; ~var15 >= -105; ++var15) {
                    for (int var16 = 0; ~var16 >= -105; ++var16) {
                        if ((class13.field114[var14][var16][var15] & 1) != 0) {
                            int var17 = var15;
                            int var18;
                            for (var18 = var15; ~var18 > -105 && (1 & class13.field114[var14][var16][var18 + 1]) != 0; ++var18) {
                            }
                            while (~var17 < -1 && ~(class13.field114[var14][var16][var17 + -1] & 1) != -1) {
                                --var17;
                            }
                            int var19 = var14;
                            int var20;
                            label351: for (var20 = var14; ~var20 < -1; --var20) {
                                for (int var21 = var17; var21 <= var18; ++var21) {
                                    if ((1 & class13.field114[var20 - 1][var16][var21]) == 0) {
                                        break label351;
                                    }
                                }
                            }
                            label340: while (var19 < 3) {
                                for (int var22 = var17; ~var22 >= ~var18; ++var22) {
                                    if ((class13.field114[var19 + 1][var16][var22] & 1) == 0) {
                                        break label340;
                                    }
                                }
                                ++var19;
                            }
                            int var23 = (var19 + 1 - var20) * (-var17 + 1 + var18);
                            if (var23 >= 8) {
                                short var24 = 240;
                                int var25 = class189.field3337[var19][var16][var17] + -var24;
                                int var26 = class189.field3337[var20][var16][var17];
                                class265.method1764(1, var16 * 128, var16 * 128, var17 * 128, var18 * 128 + 128, var25, var26);
                                for (int var27 = var20; var27 <= var19; ++var27) {
                                    for (int var28 = var17; ~var28 >= ~var18; ++var28) {
                                        class13.field114[var27][var16][var28] = class71.method502(class13.field114[var27][var16][var28], -2);
                                    }
                                }
                            }
                        }
                        if (~(class13.field114[var14][var16][var15] & 2) != -1) {
                            int var29;
                            for (var29 = var16; var29 > 0 && (class13.field114[var14][var29 + -1][var15] & 2) != 0; --var29) {
                            }
                            int var30 = var16;
                            int var31 = var14;
                            while (~var30 > -105 && ~(class13.field114[var14][var30 + 1][var15] & 2) != -1) {
                                ++var30;
                            }
                            int var32 = var14;
                            label405: while (var31 > 0) {
                                for (int var33 = var29; ~var33 >= ~var30; ++var33) {
                                    if ((2 & class13.field114[var31 - 1][var33][var15]) == 0) {
                                        break label405;
                                    }
                                }
                                --var31;
                            }
                            label394: while (var32 < 3) {
                                for (int var34 = var29; var34 <= var30; ++var34) {
                                    if ((class13.field114[var32 + 1][var34][var15] & 2) == 0) {
                                        break label394;
                                    }
                                }
                                ++var32;
                            }
                            int var35 = (var32 - (var31 + -1)) * (-var29 + var30 + 1);
                            if (~var35 <= -9) {
                                short var36 = 240;
                                int var37 = class189.field3337[var32][var29][var15] + -var36;
                                int var38 = class189.field3337[var31][var29][var15];
                                class265.method1764(2, var29 * 128, var30 * 128 + 128, var15 * 128, var15 * 128, var37, var38);
                                for (int var39 = var31; ~var32 <= ~var39; ++var39) {
                                    for (int var40 = var29; ~var30 <= ~var40; ++var40) {
                                        class13.field114[var39][var40][var15] = class71.method502(class13.field114[var39][var40][var15], -3);
                                    }
                                }
                            }
                        }
                        if (~(4 & class13.field114[var14][var16][var15]) != -1) {
                            int var41 = var16;
                            int var42 = var16;
                            int var43 = var15;
                            int var44;
                            for (var44 = var15; var44 > 0 && ~(class13.field114[var14][var16][var44 + -1] & 4) != -1; --var44) {
                            }
                            while (var43 < 104 && (class13.field114[var14][var16][var43 + 1] & 4) != 0) {
                                ++var43;
                            }
                            label460: while (var41 > 0) {
                                for (int var45 = var44; var43 >= var45; ++var45) {
                                    if ((class13.field114[var14][var41 + -1][var45] & 4) == 0) {
                                        break label460;
                                    }
                                }
                                --var41;
                            }
                            label449: while (~var42 > -105) {
                                for (int var46 = var44; var46 <= var43; ++var46) {
                                    if ((4 & class13.field114[var14][var42 - -1][var46]) == 0) {
                                        break label449;
                                    }
                                }
                                ++var42;
                            }
                            if ((var43 - -1 + -var44) * (-var41 + var42 + 1) >= 4) {
                                int var47 = class189.field3337[var14][var41][var44];
                                class265.method1764(4, var41 * 128, var42 * 128 - -128, var44 * 128, var43 * 128 + 128, var47, var47);
                                for (int var48 = var41; var48 <= var42; ++var48) {
                                    for (int var49 = var44; ~var43 <= ~var49; ++var49) {
                                        class13.field114[var14][var48][var49] = class71.method502(class13.field114[var14][var48][var49], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(ZI)V")
    public static final void method1476(boolean arg0, int arg1) {
        if (arg0) {
            if (class9.field75 != -1) {
                class183.method1253(class9.field75, (byte) -74);
            }
            for (class2 var2 = (class2) class57.field959.method1552(102); var2 != null; var2 = (class2) class57.field959.method1549(82)) {
                class210.method1410(true, (byte) -106, var2);
            }
            class9.field75 = -1;
            class57.field959 = new class237(8);
            class171.method1152(0);
            class9.field75 = class190.field3341;
            class43.method326(-32039, false);
            class106.method730(0);
            class123.method814(class9.field75, 0);
        }
        ++field3872;
        class168.field3006 = new class183();
        if (arg1 >= -111) {
            method1473((byte) 56);
        }
        class168.field3006.field1301 = 3000;
        class168.field3006.field1325 = 3000;
        class95.method638(class280.field4908, (byte) 62);
        class138.method943(0, 10);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        if (arg1 != -3) {
            this.method1478((byte) -112);
        }
        ++field3879;
        int[] var3 = super.field3952.method1262(arg0, arg1 + 7495);
        if (super.field3952.field3276) {
            int var4 = class54.field879[arg0] * this.field3882 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~var7 > ~class234.field4046; ++var7) {
                class280.field4909 = Integer.MAX_VALUE;
                class277.field4871 = Integer.MAX_VALUE;
                class190.field3351 = Integer.MAX_VALUE;
                class59.field983 = Integer.MAX_VALUE;
                int var8 = class281.field4923[var7] * this.field3881 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = this.field3884[255 & (var11 >= this.field3882 ? var11 - this.field3882 : var11)] & 255;
                    for (int var14 = var9 - 1; ~var10 <= ~var14; ++var14) {
                        int var15 = (this.field3884[255 & (this.field3881 <= var14 ? -this.field3881 + var14 : var14) + var13] & 255) * 2;
                        int var27 = var15 + 1;
                        int var16 = var8 - (this.field3888[var15] - -(var14 << 12));
                        int var17 = -(var11 << 12) + var4 + -this.field3888[var27];
                        int var18 = this.field3873;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (~var16 > -1 ? -var16 : var16) - -(~var17 > -1 ? -var17 : var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 <= -1 ? var17 : -var17;
                                int var26 = var16 >= 0 ? var16 : -var16;
                                var19 = var26 <= var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~class59.field983 < ~var19) {
                            class280.field4909 = class277.field4871;
                            class277.field4871 = class190.field3351;
                            class190.field3351 = class59.field983;
                            class59.field983 = var19;
                        } else if (class190.field3351 > var19) {
                            class280.field4909 = class277.field4871;
                            class277.field4871 = class190.field3351;
                            class190.field3351 = var19;
                        } else if (var19 < class277.field4871) {
                            class280.field4909 = class277.field4871;
                            class277.field4871 = var19;
                        } else if (var19 < class280.field4909) {
                            class280.field4909 = var19;
                        }
                    }
                }
                int var12 = this.field3886;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class59.field983 + class190.field3351;
                                }
                            } else {
                                var3[var7] = class280.field4909;
                            }
                        } else {
                            var3[var7] = class277.field4871;
                        }
                    } else {
                        var3[var7] = class190.field3351;
                    }
                } else {
                    var3[var7] = class59.field983;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILtg;Ltg;)V")
    public static final void method1477(int arg0, class182 arg1, class182 arg2) {
        class69.field1143 = arg2;
        class97.field1632 = arg1;
        if (arg0 >= -90) {
            field3885 = null;
        }
        ++field3868;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    public class223() {
        super(0, true);
    }

    @OriginalMember(owner = "client!md", name = "h", descriptor = "(B)V")
    private final void method1478(byte arg0) {
        ++field3874;
        if (arg0 != 85) {
            field3867 = null;
        }
        Random var2 = new Random((long) this.field3876);
        this.field3888 = new short[512];
        if (~this.field3870 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field3888[var3] = (short) class88.method606(var2, this.field3870, false);
            }
        }
    }
}
