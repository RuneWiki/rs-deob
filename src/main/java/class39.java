import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class39 {

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "[I")
    private int[] field1062 = new int[256];

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "[I")
    private int[] field1059 = new int[256];

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Z")
    public static boolean field1056 = false;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "La;")
    public static class1 field1057 = class113.method934(-11538, "titlebutton");

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field1060 = 0;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Lcb;")
    public static class15 field1061 = new class15(64);

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "La;")
    public static class1 field1066 = class113.method934(-11538, ": ");

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "Z")
    public static boolean field1070 = true;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "La;")
    public static class1 field1068 = class113.method934(-11538, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public static int field1073 = -1;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "La;")
    private static class1 field1069 = class113.method934(-11538, "Invalid username or password)3");

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "La;")
    public static class1 field1077 = field1069;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "La;")
    public static class1 field1078 = class113.method934(-11538, "blinken3:");

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "La;")
    public static class1 field1074 = class113.method934(-11538, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "Lcb;")
    public static class15 field1067 = new class15(64);

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "La;")
    public static class1 field1080 = class113.method934(-11538, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    private int field1048;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    private int field1049;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    private int field1053;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "Le;")
    public static class25 field1075;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "Llc;")
    public static class69 field1072;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "Z")
    public static boolean field1063;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "[I")
    public static int[] field1079;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lab;I[Lad;)V", line = 3)
    public static final void method426(class3 arg0, int arg1, class5[] arg2) {
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class34.field899[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class34.field899[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method116((byte) -28, var111, var110);
                        }
                    }
                }
            }
        }
        class114.field2825 += (int) (Math.random() * 5.0D) - 2;
        class80.field2028 += (int) (Math.random() * 5.0D) - 2;
        field1055++;
        if (class114.field2825 < -8) {
            class114.field2825 = -8;
        }
        if (class114.field2825 > 8) {
            class114.field2825 = 8;
        }
        if (class80.field2028 < -16) {
            class80.field2028 = -16;
        }
        if (class80.field2028 > 16) {
            class80.field2028 = 16;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class37.field1004[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class57.field1454[var4][var101 + 1][var50] - class57.field1454[var4][var101 - 1][var50];
                    int var103 = class57.field1454[var4][var101][var50 + 1] - class57.field1454[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = 65536 / var104;
                    int var106 = (var47[var101][var50] >> 1) + (var47[var101][var50 + 1] >> 3) + (var47[var101 - 1][var50] >> 2) + (var47[var101][var50 + -1] >> 2) + (var47[var101 + 1][var50] >> 3);
                    int var107 = (var102 << 8) / var104;
                    int var108 = (var103 << 8) / var104;
                    int var109 = (var108 * -50 + var107 * -50 + var105 * -10) / var49 + 96;
                    class47.field1249[var101][var50] = var109 - var106;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class116.field2909[var51] = 0;
                class117.field2933[var51] = 0;
                class32.field857[var51] = 0;
                class133.field3249[var51] = 0;
                class52.field1388[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class85.field2134[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class76 var97 = class22.method318((byte) -66, var96 - 1);
                            class116.field2909[var55] += var97.field1887;
                            class117.field2933[var55] += var97.field1896;
                            class32.field857[var55] += var97.field1885;
                            class133.field3249[var55] += var97.field1890;
                            var10002 = class52.field1388[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class85.field2134[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class76 var100 = class22.method318((byte) -95, var99 - 1);
                            class116.field2909[var55] -= var100.field1887;
                            class117.field2933[var55] -= var100.field1896;
                            class32.field857[var55] -= var100.field1885;
                            class133.field3249[var55] -= var100.field1890;
                            var10002 = class52.field1388[var55]--;
                        }
                    }
                }
                if (var52 >= 1 && var52 < 103) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 109; var61++) {
                        int var62 = var61 + 5;
                        int var63 = var61 - 5;
                        if (var62 >= 0 && var62 < 104) {
                            var60 += class133.field3249[var62];
                            var57 += class117.field2933[var62];
                            var59 += class52.field1388[var62];
                            var58 += class32.field857[var62];
                            var56 += class116.field2909[var62];
                        }
                        if (var63 >= 0 && var63 < 104) {
                            var57 -= class117.field2933[var63];
                            var59 -= class52.field1388[var63];
                            var58 -= class32.field857[var63];
                            var60 -= class133.field3249[var63];
                            var56 -= class116.field2909[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class93.field2335 || (class34.field899[0][var52][var61] & 0x2) != 0 || (class34.field899[var4][var52][var61] & 0x10) == 0 && class117.method967(var4, var61, 0, var52) == class57.field1475)) {
                            if (var4 < class129.field3178) {
                                class129.field3178 = var4;
                            }
                            int var64 = class85.field2134[var4][var52][var61] & 0xFF;
                            int var65 = class122.field3056[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class57.field1454[var4][var52][var61];
                                int var67 = class57.field1454[var4][var52 + 1][var61];
                                int var68 = class57.field1454[var4][var52 + 1][var61 + 1];
                                int var69 = class57.field1454[var4][var52][var61 + 1];
                                int var70 = class47.field1249[var52][var61];
                                int var71 = class47.field1249[var52 + 1][var61];
                                int var72 = class47.field1249[var52 + 1][var61 + 1];
                                int var73 = -1;
                                int var74 = class47.field1249[var52][var61 + 1];
                                int var75 = -1;
                                if (var64 > 0) {
                                    int var76 = var56 * 256 / var60;
                                    int var77 = var57 / var59;
                                    int var78 = var58 / var59;
                                    var73 = class24.method323(var77, var78, arg1 - 27260, var76);
                                    int var79 = class80.field2028 + var78;
                                    int var80 = var76 + class114.field2825 & 0xFF;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 255) {
                                        var79 = 255;
                                    }
                                    var75 = class24.method323(var77, var79, 44, var80);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class34.field911[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class130.method1029(var65 - 1, arg1 + -27320).field914) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var66 == var68 && var66 == var69) {
                                        class11.field413[var4][var52][var61] = class76.method708(class11.field413[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var75 != -1) {
                                    var82 = class27.field765[class116.method958(var75, 96, (byte) 73)];
                                }
                                if (var65 == 0) {
                                    arg0.method56(var4, var52, var61, 0, 0, -1, var66, var67, var68, var69, class116.method958(var73, var70, (byte) 73), class116.method958(var73, var71, (byte) 73), class116.method958(var73, var72, (byte) 73), class116.method958(var73, var74, (byte) 73), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class34.field911[var4][var52][var61] + 1;
                                    byte var84 = class75.field1875[var4][var52][var61];
                                    class34 var85 = class130.method1029(var65 - 1, 4);
                                    int var86 = var85.field898;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = -1;
                                        var88 = class27.field772.method696(true, var86);
                                    } else if (var85.field921 == 16711935) {
                                        var87 = -2;
                                        var86 = -1;
                                        var88 = -2;
                                    } else {
                                        var87 = class24.method323(var85.field913, var85.field896, -120, var85.field908);
                                        int var89 = class114.field2825 + var85.field908 & 0xFF;
                                        int var90 = class80.field2028 + var85.field896;
                                        if (var90 < 0) {
                                            var90 = 0;
                                        } else if (var90 > 255) {
                                            var90 = 255;
                                        }
                                        var88 = class24.method323(var85.field913, var90, arg1 ^ 0xFFFF9534, var89);
                                    }
                                    int var91 = 0;
                                    if (var88 != -2) {
                                        var91 = class27.field765[class74.method692(var88, 96, true)];
                                    }
                                    if (var85.field912 != -1) {
                                        int var92 = class114.field2825 + var85.field910 & 0xFF;
                                        int var93 = class80.field2028 + var85.field906;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class24.method323(var85.field922, var93, arg1 - 27445, var92);
                                        var91 = class27.field765[class74.method692(var94, 96, true)];
                                    }
                                    arg0.method56(var4, var52, var61, var83, var84, var86, var66, var67, var68, var69, class116.method958(var73, var70, (byte) 73), class116.method958(var73, var71, (byte) 73), class116.method958(var73, var72, (byte) 73), class116.method958(var73, var74, (byte) 73), class74.method692(var87, var70, true), class74.method692(var87, var71, true), class74.method692(var87, var72, true), class74.method692(var87, var74, true), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg0.method87(var4, var54, var53, class117.method967(var4, var53, 0, var54));
                }
            }
            class85.field2134[var4] = null;
            class122.field3056[var4] = null;
            class34.field911[var4] = null;
            class75.field1875[var4] = null;
            class37.field1004[var4] = null;
        }
        arg0.method75(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class34.field899[1][var5][var46] & 0x2) == 2) {
                    arg0.method49(var5, var46);
                }
            }
        }
        int var6 = 1;
        int var7 = 2;
        int var8 = 4;
        if (arg1 != 27324) {
            method426(null, 6, null);
        }
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var6 <<= 0x3;
                var8 <<= 0x3;
                var7 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((class11.field413[var10][var12][var11] & var6) != 0) {
                            int var13;
                            for (var13 = var11; var13 > 0 && (var6 & class11.field413[var10][var12][var13 - 1]) != 0; var13--) {
                            }
                            int var14;
                            for (var14 = var11; var14 < 104 && (class11.field413[var10][var12][var14 + 1] & var6) != 0; var14++) {
                            }
                            int var15 = var10;
                            int var16 = var10;
                            label355: while (var15 > 0) {
                                for (int var17 = var13; var17 <= var14; var17++) {
                                    if ((class11.field413[var15 - 1][var12][var17] & var6) == 0) {
                                        break label355;
                                    }
                                }
                                var15--;
                            }
                            label344: while (var16 < var9) {
                                for (int var18 = var13; var18 <= var14; var18++) {
                                    if ((var6 & class11.field413[var16 + 1][var12][var18]) == 0) {
                                        break label344;
                                    }
                                }
                                var16++;
                            }
                            int var19 = (var14 + 1 - var13) * (var16 + 1 - var15);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class57.field1454[var16][var12][var13] - var20;
                                int var22 = class57.field1454[var15][var12][var13];
                                class3.method73(var9, 1, var12 * 128, var12 * 128, var13 * 128, var14 * 128 + 128, var21, var22);
                                for (int var23 = var15; var23 <= var16; var23++) {
                                    for (int var24 = var13; var24 <= var14; var24++) {
                                        class11.field413[var23][var12][var24] = class132.method1034(class11.field413[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((var7 & class11.field413[var10][var12][var11]) != 0) {
                            int var25;
                            for (var25 = var12; var25 > 0 && (var7 & class11.field413[var10][var25 - 1][var11]) != 0; var25--) {
                            }
                            int var26 = var10;
                            int var27 = var12;
                            int var28 = var10;
                            while (var27 < 104 && (var7 & class11.field413[var10][var27 + 1][var11]) != 0) {
                                var27++;
                            }
                            label410: while (var28 > 0) {
                                for (int var29 = var25; var29 <= var27; var29++) {
                                    if ((class11.field413[var28 - 1][var29][var11] & var7) == 0) {
                                        break label410;
                                    }
                                }
                                var28--;
                            }
                            label399: while (var26 < var9) {
                                for (int var30 = var25; var30 <= var27; var30++) {
                                    if ((var7 & class11.field413[var26 + 1][var30][var11]) == 0) {
                                        break label399;
                                    }
                                }
                                var26++;
                            }
                            int var31 = (var27 + 1 - var25) * (var26 + 1 - var28);
                            if (var31 >= 8) {
                                int var32 = class57.field1454[var28][var25][var11];
                                short var33 = 240;
                                int var34 = class57.field1454[var26][var25][var11] - var33;
                                class3.method73(var9, 2, var25 * 128, var27 * 128 + 128, var11 * 128, var11 * 128, var34, var32);
                                for (int var35 = var28; var35 <= var26; var35++) {
                                    for (int var36 = var25; var36 <= var27; var36++) {
                                        class11.field413[var35][var36][var11] = class132.method1034(class11.field413[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((class11.field413[var10][var12][var11] & var8) != 0) {
                            int var37 = var12;
                            int var38 = var12;
                            int var39 = var11;
                            int var40 = var11;
                            while (var39 > 0 && (class11.field413[var10][var12][var39 - 1] & var8) != 0) {
                                var39--;
                            }
                            while (var40 < 104 && (var8 & class11.field413[var10][var12][var40 + 1]) != 0) {
                                var40++;
                            }
                            label464: while (var37 > 0) {
                                for (int var41 = var39; var41 <= var40; var41++) {
                                    if ((var8 & class11.field413[var10][var37 - 1][var41]) == 0) {
                                        break label464;
                                    }
                                }
                                var37--;
                            }
                            label453: while (var38 < 104) {
                                for (int var42 = var39; var42 <= var40; var42++) {
                                    if ((var8 & class11.field413[var10][var38 + 1][var42]) == 0) {
                                        break label453;
                                    }
                                }
                                var38++;
                            }
                            if ((var40 + 1 - var39) * (var38 + 1 - var37) >= 4) {
                                int var43 = class57.field1454[var10][var37][var39];
                                class3.method73(var9, 4, var37 * 128, var38 * 128 + 128, var39 * 128, var40 * 128 + 128, var43, var43);
                                for (int var44 = var37; var44 <= var38; var44++) {
                                    for (int var45 = var39; var45 <= var40; var45++) {
                                        class11.field413[var10][var44][var45] = class132.method1034(class11.field413[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V", line = 751)
    public static void method427(boolean arg0) {
        field1080 = null;
        field1066 = null;
        field1069 = null;
        field1077 = null;
        field1075 = null;
        field1057 = null;
        field1061 = null;
        field1078 = null;
        field1067 = null;
        field1074 = null;
        if (arg0) {
            field1072 = null;
            field1079 = null;
            field1068 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(JI)V", line = 778)
    public static final void method428(long arg0, int arg1) {
        try {
            int var3 = -93 / ((-arg1 - 50) / 45);
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
        field1058++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V", line = 820)
    private final void method429(byte arg0) {
        this.field1064 += ++this.field1053;
        field1052++;
        int var2 = -29 % ((arg0 + 18) / 58);
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = this.field1062[var3];
            if ((var3 & 0x2) == 0) {
                if ((var3 & 0x1) == 0) {
                    this.field1049 ^= this.field1049 << 13;
                } else {
                    this.field1049 ^= this.field1049 >>> 6;
                }
            } else if ((var3 & 0x1) == 0) {
                this.field1049 ^= this.field1049 << 2;
            } else {
                this.field1049 ^= this.field1049 >>> 16;
            }
            this.field1049 += this.field1062[var3 + 128 & 0xFF];
            int var5;
            this.field1062[var3] = var5 = this.field1062[class132.method1034(var4, 1020) >> 2] + this.field1064 + this.field1049;
            this.field1059[var3] = this.field1064 = var4 + this.field1062[class132.method1034(var5 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V", line = 868)
    public static final void method430(byte arg0) {
        field1065++;
        if (arg0 != 118) {
            field1070 = true;
        }
        for (class22 var1 = (class22) class92.field2287.method805((byte) -90); var1 != null; var1 = (class22) class92.field2287.method812(-4)) {
            if (var1.field693 == -1) {
                var1.field695 = 0;
                class81.method736(var1, 19813);
            } else {
                var1.method742(arg0 ^ 0xFFFFFF89);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)I", line = 896)
    public final int method431(int arg0) {
        field1071++;
        if (arg0 > -54) {
            return -67;
        }
        if (this.field1048-- == 0) {
            this.method429((byte) -92);
            this.field1048 = 255;
        }
        return this.field1059[this.field1048];
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V", line = 913)
    private final void method432(boolean arg0) {
        field1054++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var7 + var62;
            int var66 = var65 ^ var62 << 8;
            int var67 = var4 + var66;
            int var68 = var5 + var64;
            int var69 = var62 + var68;
            var6 = var69 ^ var68 >>> 16;
            int var70 = var3 + var6;
            int var71 = var67 + var68;
            var5 = var71 ^ var67 << 10;
            int var72 = var2 + var5;
            int var73 = var67 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var70 + var72;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var64;
            int var75 = var4 + var61;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var66;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1059[var11 + 7] + var2;
            int var38 = this.field1059[var11 + 3] + var6;
            int var39 = this.field1059[var11] + var9;
            int var40 = this.field1059[var11 + 1] + var8;
            int var41 = this.field1059[var11 + 4] + var5;
            int var42 = this.field1059[var11 + 6] + var3;
            int var43 = this.field1059[var11 + 5] + var4;
            int var44 = this.field1059[var11 + 2] + var7;
            int var45 = var39 ^ var40 << 11;
            int var46 = var38 + var45;
            int var47 = var40 + var44;
            int var48 = var47 ^ var44 >>> 2;
            int var49 = var41 + var48;
            int var50 = var44 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            int var53 = var43 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var49 + var53;
            int var55 = var6 + var42;
            var5 = var54 ^ var53 << 10;
            int var56 = var5 + var37;
            int var57 = var53 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            int var60 = var56 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field1062[var11] = var9;
            this.field1062[var11 + 1] = var8;
            this.field1062[var11 + 2] = var7;
            this.field1062[var11 + 3] = var6;
            this.field1062[var11 + 4] = var5;
            this.field1062[var11 + 5] = var4;
            this.field1062[var11 + 6] = var3;
            this.field1062[var11 + 7] = var2;
        }
        int var12 = 0;
        if (!arg0) {
            field1067 = null;
        }
        while (var12 < 256) {
            int var13 = this.field1062[var12 + 7] + var2;
            int var14 = this.field1062[var12 + 6] + var3;
            int var15 = this.field1062[var12 + 2] + var7;
            int var16 = this.field1062[var12 + 3] + var6;
            int var17 = this.field1062[var12 + 5] + var4;
            int var18 = this.field1062[var12] + var9;
            int var19 = this.field1062[var12 + 4] + var5;
            int var20 = this.field1062[var12 + 1] + var8;
            int var21 = var18 ^ var20 << 11;
            int var22 = var16 + var21;
            int var23 = var15 + var20;
            int var24 = var23 ^ var15 >>> 2;
            int var25 = var15 + var22;
            int var26 = var25 ^ var22 << 8;
            int var27 = var17 + var26;
            int var28 = var19 + var24;
            int var29 = var22 + var28;
            var6 = var29 ^ var28 >>> 16;
            int var30 = var6 + var14;
            int var31 = var27 + var28;
            var5 = var31 ^ var27 << 10;
            int var32 = var5 + var13;
            int var33 = var27 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var8 = var3 + var24;
            var9 = var8 + var34;
            var7 = var2 + var26;
            this.field1062[var12] = var9;
            this.field1062[var12 + 1] = var8;
            this.field1062[var12 + 2] = var7;
            this.field1062[var12 + 3] = var6;
            this.field1062[var12 + 4] = var5;
            this.field1062[var12 + 5] = var4;
            this.field1062[var12 + 6] = var3;
            this.field1062[var12 + 7] = var2;
            var12 += 8;
        }
        this.method429((byte) -90);
        this.field1048 = 256;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([I)V", line = 1061)
    public class39(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1059[var2] = arg0[var2];
        }
        this.method432(true);
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)I", line = 1117)
    public static final int method433(byte arg0) {
        if (arg0 < 117) {
            method433((byte) 125);
        }
        field1051++;
        return 5;
    }
}
