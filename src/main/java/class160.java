import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class160 {

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Lna;")
    public static class26 field2508 = class69.method505("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", (byte) -123);

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field2510 = 0;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)V", line = 6)
    public static final void method1086(int arg0, boolean arg1) {
        class56.field908 = arg1;
        field2507++;
        if (class56.field908) {
            int var15 = class300.field5157.method620((byte) -109);
            int var16 = class300.field5157.method620((byte) -120);
            int var17 = class300.field5157.method593(true);
            int var18 = class300.field5157.method620((byte) -91);
            class300.field5157.method1422((byte) 112);
            for (int var19 = 0; var19 < 4; var19++) {
                for (int var20 = 0; var20 < 13; var20++) {
                    for (int var21 = 0; var21 < 13; var21++) {
                        int var22 = class300.field5157.method1427((byte) -11, 1);
                        if (var22 == 1) {
                            class78.field1190[var19][var20][var21] = class300.field5157.method1427((byte) -11, 26);
                        } else {
                            class78.field1190[var19][var20][var21] = -1;
                        }
                    }
                }
            }
            class300.field5157.method1433(false);
            int var23 = (class259.field4228 - class300.field5157.field1301) / 16;
            class224.field3545 = new int[var23][4];
            for (int var24 = 0; var24 < var23; var24++) {
                for (int var25 = 0; var25 < 4; var25++) {
                    class224.field3545[var24][var25] = class300.field5157.method637((byte) -124);
                }
            }
            int var26 = class300.field5157.method576(1);
            class132.field2010 = new int[var23];
            class225.field3573 = new int[var23];
            client.field4126 = new int[var23];
            class84.field1372 = new byte[var23][];
            class185.field2874 = null;
            class303.field5224 = new int[var23];
            class47.field761 = new byte[var23][];
            class51.field808 = new byte[var23][];
            class293.field4884 = new int[var23];
            class201.field3136 = (byte[][]) null;
            class2.field15 = new byte[var23][];
            int var27 = 0;
            for (int var28 = 0; var28 < 4; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    for (int var30 = 0; var30 < 13; var30++) {
                        int var31 = class78.field1190[var28][var29][var30];
                        if (var31 != -1) {
                            int var32 = var31 >> 14 & 0x3FF;
                            int var33 = (var31 & 0x3FFA) >> 3;
                            int var34 = (var32 / 8 << 8) + var33 / 8;
                            for (int var35 = 0; var35 < var27; var35++) {
                                if (class293.field4884[var35] == var34) {
                                    var34 = -1;
                                    break;
                                }
                            }
                            if (var34 != -1) {
                                class293.field4884[var27] = var34;
                                int var36 = var34 & 0xFF;
                                int var37 = (var34 & 0xFF6C) >> 8;
                                client.field4126[var27] = class98.field1597.method1876(class236.method1587(new class26[] { class214.field3344, class149.method1019((byte) 9, var37), class292.field4858, class149.method1019((byte) 9, var36) }, (byte) -90), (byte) -30);
                                class225.field3573[var27] = class98.field1597.method1876(class236.method1587(new class26[] { class154.field2403, class149.method1019((byte) 9, var37), class292.field4858, class149.method1019((byte) 9, var36) }, (byte) -117), (byte) -30);
                                class303.field5224[var27] = class98.field1597.method1876(class236.method1587(new class26[] { class313.field5343, class149.method1019((byte) 9, var37), class292.field4858, class149.method1019((byte) 9, var36) }, (byte) -85), (byte) -30);
                                class132.field2010[var27] = class98.field1597.method1876(class236.method1587(new class26[] { class216.field3386, class149.method1019((byte) 9, var37), class292.field4858, class149.method1019((byte) 9, var36) }, (byte) -93), (byte) -30);
                                var27++;
                            }
                        }
                    }
                }
            }
            class233.method1568(var17, var26, var16, var18, false, var15, true);
        } else {
            int var2 = class300.field5157.method597(-128);
            int var3 = (class259.field4228 - class300.field5157.field1301) / 16;
            class224.field3545 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    class224.field3545[var4][var5] = class300.field5157.method637((byte) 123);
                }
            }
            int var6 = class300.field5157.method593(true);
            int var7 = class300.field5157.method576(1);
            int var8 = class300.field5157.method597(107);
            int var9 = class300.field5157.method597(-124);
            class293.field4884 = new int[var3];
            class51.field808 = new byte[var3][];
            class201.field3136 = (byte[][]) null;
            class303.field5224 = new int[var3];
            class47.field761 = new byte[var3][];
            class84.field1372 = new byte[var3][];
            class185.field2874 = null;
            client.field4126 = new int[var3];
            class2.field15 = new byte[var3][];
            class225.field3573 = new int[var3];
            class132.field2010 = new int[var3];
            int var10 = 0;
            boolean var11 = false;
            if ((var7 / 8 == 48 || (var7 / 8) == 49) && var8 / 8 == 48) {
                var11 = true;
            }
            if (var7 / 8 == 48 && var8 / 8 == 148) {
                var11 = true;
            }
            for (int var12 = (var7 - 6) / 8; var12 <= (var7 + 6) / 8; var12++) {
                for (int var13 = (var8 - 6) / 8; var13 <= ((var8 + 6) / 8); var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var11 && var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || !(var12 != 49 || var13 != 47)) {
                        class293.field4884[var10] = var14;
                        client.field4126[var10] = -1;
                        class225.field3573[var10] = -1;
                        class303.field5224[var10] = -1;
                        class132.field2010[var10] = -1;
                    } else {
                        class293.field4884[var10] = var14;
                        client.field4126[var10] = class98.field1597.method1876(class236.method1587(new class26[] { class214.field3344, class149.method1019((byte) 9, var12), class292.field4858, class149.method1019((byte) 9, var13) }, (byte) -69), (byte) -30);
                        class225.field3573[var10] = class98.field1597.method1876(class236.method1587(new class26[] { class154.field2403, class149.method1019((byte) 9, var12), class292.field4858, class149.method1019((byte) 9, var13) }, (byte) -77), (byte) -30);
                        class303.field5224[var10] = class98.field1597.method1876(class236.method1587(new class26[] { class313.field5343, class149.method1019((byte) 9, var12), class292.field4858, class149.method1019((byte) 9, var13) }, (byte) -107), (byte) -30);
                        class132.field2010[var10] = class98.field1597.method1876(class236.method1587(new class26[] { class216.field3386, class149.method1019((byte) 9, var12), class292.field4858, class149.method1019((byte) 9, var13) }, (byte) -91), (byte) -30);
                    }
                    var10++;
                }
            }
            class233.method1568(var6, var8, var7, var9, false, var2, true);
        }
        if (arg0 != 0) {
            field2510 = 124;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 255)
    public static void method1087(int arg0) {
        if (arg0 != 8642) {
            field2508 = (class26) null;
        }
        field2508 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 270)
    public static final void method1088(byte arg0) {
        class141.field2149 = null;
        field2509++;
        class82.field1281 = null;
        if (arg0 <= 103) {
            method1090(46, 44, 46);
        }
        class98.field1596 = null;
        class205.field3203 = (byte[][]) null;
        class58.field936 = null;
        class190.field2975 = null;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V", line = 298)
    public static final void method1089(int arg0) {
        field2511++;
        class218 var1 = new class218();
        if (arg0 <= 101) {
            method1092(22, (class266) null);
        }
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class79.field1248[var2][var3] = var1;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)Ldf;", line = 329)
    public static final class164 method1090(int arg0, int arg1, int arg2) {
        class55 var3 = class36.field585[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class164 var4 = var3.field889;
            var3.field889 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V", line = 340)
    public static final void method1091(byte arg0) {
        field2514++;
        if (class26.field384 == 195) {
            int var146 = class300.field5157.method625(true);
            int var147 = var146 & 0x3;
            int var148 = var146 >> 2;
            int var149 = class222.field3519[var148];
            int var150 = class300.field5157.method642((byte) -85);
            int var151 = ((var150 & 0x7D) >> 4) + class64.field1023;
            int var152 = (var150 & 0x7) + class204.field3190;
            if (var151 >= 0 && var152 >= 0 && var151 < 104 && var152 < 104) {
                class246.method1697(class279.field4651, var152, -101, var147, var151, -1, -1, var149, var148, 0);
            }
        } else if (class26.field384 == 33) {
            int var1 = class300.field5157.method605(-58);
            int var2 = class300.field5157.method642((byte) -63);
            int var3 = (var2 & 0x7) + class204.field3190;
            int var4 = ((var2 & 0x78) >> 4) + class64.field1023;
            int var5 = class300.field5157.method597(-108);
            if (var4 >= 0 && var3 >= 0 && var4 < 104 && var3 < 104) {
                class141 var6 = new class141();
                var6.field2147 = var5;
                var6.field2155 = var1;
                if (class268.field4433[class279.field4651][var4][var3] == null) {
                    class268.field4433[class279.field4651][var4][var3] = new class32();
                }
                class268.field4433[class279.field4651][var4][var3].method257(true, new class2(var6));
                class244.method1683(var3, (byte) 65, var4);
            }
        } else if (class26.field384 == 121) {
            int var7 = class300.field5157.method642((byte) -102);
            int var8 = (var7 >> 4 & 0xF) + class64.field1023 * 2;
            int var9 = (var7 & 0xF) + class204.field3190 * 2;
            int var10 = var8 + class300.field5157.method599(false);
            int var11 = class300.field5157.method599(false) + var9;
            int var12 = class300.field5157.method626((byte) 73);
            int var13 = class300.field5157.method576(1);
            int var14 = class300.field5157.method642((byte) -56) * 4;
            int var15 = class300.field5157.method642((byte) -97) * 4;
            int var16 = class300.field5157.method576(1);
            int var17 = class300.field5157.method576(1);
            int var18 = class300.field5157.method642((byte) -90);
            if (var18 == 255) {
                var18 = -1;
            }
            int var19 = class300.field5157.method642((byte) -51);
            if (var8 >= 0 && var9 >= 0 && var8 < 208 && var9 < 208 && var10 >= 0 && var11 >= 0 && var10 < 208 && var11 < 208 && var13 != 65535) {
                int var20 = var11 * 64;
                int var21 = var10 * 64;
                int var22 = var9 * 64;
                int var23 = var8 * 64;
                class319 var24 = new class319(var13, class279.field4651, var23, var22, class17.method118(class279.field4651, 1, var23, var22) - var14, class229.field3626 + var16, class229.field3626 + var17, var18, var19, var12, var15);
                var24.method2216(var20, 1, class229.field3626 + var16, -var15 + class17.method118(class279.field4651, 1, var21, var20), var21);
                class18.field258.method257(true, new class280(var24));
            }
        } else if (class26.field384 == 17) {
            int var25 = class300.field5157.method642((byte) -116);
            int var26 = (var25 >> 4 & 0x7) + class64.field1023;
            int var27 = class204.field3190 + (var25 & 0x7);
            int var28 = class300.field5157.method576(1);
            int var29 = class300.field5157.method642((byte) -109);
            int var30 = class300.field5157.method576(1);
            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
                int var31 = var26 * 128 + 64;
                int var32 = var27 * 128 + 64;
                class272 var33 = new class272(var28, class279.field4651, var31, var32, class17.method118(class279.field4651, 1, var31, var32) - var29, var30, class229.field3626);
                class303.field5219.method257(true, new class63(var33));
            }
        } else if (class26.field384 == 179) {
            int var138 = class300.field5157.method590((byte) -111);
            int var139 = var138 >> 2;
            int var140 = var138 & 0x3;
            int var141 = class222.field3519[var139];
            int var142 = class300.field5157.method642((byte) -113);
            int var143 = class64.field1023 + ((var142 & 0x7D) >> 4);
            int var144 = (var142 & 0x7) + class204.field3190;
            int var145 = class300.field5157.method597(117);
            if (var143 >= 0 && var144 >= 0 && var143 < 104 && var144 < 104) {
                class246.method1697(class279.field4651, var144, -91, var140, var143, -1, var145, var141, var139, 0);
            }
        } else if (class26.field384 == 20) {
            int var130 = class300.field5157.method593(true);
            int var131 = ((var130 & 0x7D) >> 4) + class64.field1023;
            int var132 = (var130 & 0x7) + class204.field3190;
            int var133 = class300.field5157.method593(true);
            int var134 = var133 >> 2;
            int var135 = var133 & 0x3;
            int var136 = class222.field3519[var134];
            int var137 = class300.field5157.method605(-104);
            if (var137 == 65535) {
                var137 = -1;
            }
            class121.method836(class279.field4651, 125, var135, var134, var132, var136, var131, var137);
        } else {
            if (class26.field384 == 202) {
                int var34 = class300.field5157.method642((byte) -99);
                int var35 = var34 >> 2;
                int var36 = var34 & 0x3;
                int var37 = class300.field5157.method642((byte) -90);
                int var38 = (var37 >> 4 & 0x7) + class64.field1023;
                int var39 = (var37 & 0x7) + class204.field3190;
                byte var40 = class300.field5157.method628(0);
                byte var41 = class300.field5157.method628(0);
                byte var42 = class300.field5157.method588(false);
                int var43 = class300.field5157.method597(-106);
                int var44 = class300.field5157.method605(-116);
                byte var45 = class300.field5157.method599(false);
                int var46 = class300.field5157.method576(1);
                int var47 = class300.field5157.method627(-1741292848);
                if (!class255.field4184) {
                    class115.method803(var45, var46, var47, var44, var39, var42, var36, var40, var38, var35, -745213428, var41, var43);
                }
            }
            if (class26.field384 == 14) {
                int var48 = class300.field5157.method642((byte) -28);
                int var49 = (var48 & 0x7) + class204.field3190;
                int var50 = ((var48 & 0x77) >> 4) + class64.field1023;
                int var51 = class300.field5157.method576(1);
                int var52 = class300.field5157.method576(1);
                int var53 = class300.field5157.method576(1);
                if (var50 >= 0 && var49 >= 0 && var50 < 104 && var49 < 104) {
                    class32 var54 = class268.field4433[class279.field4651][var50][var49];
                    if (var54 != null) {
                        for (class2 var55 = (class2) var54.method264(-96); var55 != null; var55 = (class2) var54.method263(4)) {
                            class141 var56 = var55.field23;
                            if ((var51 & 0x7FFF) == var56.field2155 && var56.field2147 == var52) {
                                var56.field2147 = var53;
                                break;
                            }
                        }
                        class244.method1683(var49, (byte) 65, var50);
                    }
                }
            } else if (class26.field384 == 135) {
                int var57 = class300.field5157.method620((byte) -113);
                int var58 = class300.field5157.method625(true);
                int var59 = (var58 & 0x7) + class204.field3190;
                int var60 = (var58 >> 4 & 0x7) + class64.field1023;
                int var61 = class300.field5157.method605(-66);
                int var62 = class300.field5157.method605(-96);
                if (var60 >= 0 && var59 >= 0 && var60 < 104 && var59 < 104 && class327.field5668 != var57) {
                    class141 var63 = new class141();
                    var63.field2147 = var61;
                    var63.field2155 = var62;
                    if (class268.field4433[class279.field4651][var60][var59] == null) {
                        class268.field4433[class279.field4651][var60][var59] = new class32();
                    }
                    class268.field4433[class279.field4651][var60][var59].method257(true, new class2(var63));
                    class244.method1683(var59, (byte) 65, var60);
                }
            } else if (arg0 <= -67) {
                if (class26.field384 == 16) {
                    int var112 = class300.field5157.method642((byte) -71);
                    int var113 = class64.field1023 + (var112 >> 4 & 0x7);
                    int var114 = (var112 & 0x7) + class204.field3190;
                    int var115 = var113 + class300.field5157.method599(false);
                    int var116 = class300.field5157.method599(false) + var114;
                    int var117 = class300.field5157.method626((byte) 67);
                    int var118 = class300.field5157.method576(1);
                    int var119 = class300.field5157.method642((byte) -109) * 4;
                    int var120 = class300.field5157.method642((byte) -50) * 4;
                    int var121 = class300.field5157.method576(1);
                    int var122 = class300.field5157.method576(1);
                    int var123 = class300.field5157.method642((byte) -48);
                    int var124 = class300.field5157.method642((byte) -35);
                    if (var123 == 255) {
                        var123 = -1;
                    }
                    if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104 && var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104 && var118 != 65535) {
                        int var125 = var116 * 128 + 64;
                        int var126 = var114 * 128 + 64;
                        int var127 = var113 * 128 + 64;
                        int var128 = var115 * 128 + 64;
                        class319 var129 = new class319(var118, class279.field4651, var127, var126, class17.method118(class279.field4651, 1, var127, var126) - var119, class229.field3626 + var121, class229.field3626 + var122, var123, var124, var117, var120);
                        var129.method2216(var125, 1, class229.field3626 + var121, class17.method118(class279.field4651, 1, var128, var125) - var120, var128);
                        class18.field258.method257(true, new class280(var129));
                    }
                } else if (class26.field384 == 104) {
                    int var64 = class300.field5157.method642((byte) -80);
                    int var65 = (var64 & 0xF) + class204.field3190 * 2;
                    int var66 = class64.field1023 * 2 + (var64 >> 4 & 0xF);
                    int var67 = class300.field5157.method599(false) + var66;
                    int var68 = class300.field5157.method599(false) + var65;
                    int var69 = class300.field5157.method626((byte) 93);
                    int var70 = class300.field5157.method626((byte) 12);
                    int var71 = class300.field5157.method576(1);
                    int var72 = class300.field5157.method599(false);
                    int var73 = class300.field5157.method642((byte) -67) * 4;
                    int var74 = class300.field5157.method576(1);
                    int var75 = class300.field5157.method576(1);
                    int var76 = class300.field5157.method642((byte) -35);
                    int var77 = class300.field5157.method642((byte) -105);
                    if (var76 == 255) {
                        var76 = -1;
                    }
                    if (var66 >= 0 && var65 >= 0 && var66 < 208 && var65 < 208 && var67 >= 0 && var68 >= 0 && var67 < 208 && var68 < 208 && var71 != 65535) {
                        int var78 = var67 * 64;
                        int var79 = var66 * 64;
                        int var80 = var68 * 64;
                        int var81 = var65 * 64;
                        if (var69 != 0) {
                            int var84;
                            class241 var85;
                            if (var69 >= 0) {
                                int var82 = var69 - 1;
                                int var83 = var82 & 0x7FF;
                                var84 = var82 >> 11 & 0xF;
                                var85 = class185.field2877[var83];
                            } else {
                                int var86 = -var69 - 1;
                                var84 = (var86 & 0x796D) >> 11;
                                int var87 = var86 & 0x7FF;
                                if (class327.field5668 == var87) {
                                    var85 = class13.field221;
                                } else {
                                    var85 = class268.field4427[var87];
                                }
                            }
                            if (var85 != null) {
                                class236 var88 = var85.method1656(false);
                                if (var88.field3741 != null && var88.field3741[var84] != null) {
                                    int var89 = var88.field3741[var84][0];
                                    var72 -= var88.field3741[var84][1];
                                    int var90 = var88.field3741[var84][2];
                                    int var91 = class200.field3104[var85.field3922];
                                    int var92 = class200.field3115[var85.field3922];
                                    int var93 = var89 * var92 + var90 * var91 >> 16;
                                    int var94 = var90 * var92 - (var89 * var91) >> 16;
                                    var81 += var94;
                                    var79 += var93;
                                }
                            }
                        }
                        class319 var96 = new class319(var71, class279.field4651, var79, var81, class17.method118(class279.field4651, 1, var79, var81) - var72, class229.field3626 + var74, class229.field3626 + var75, var76, var77, var70, var73);
                        var96.method2216(var80, 1, class229.field3626 + var74, -var73 + class17.method118(class279.field4651, 1, var78, var80), var78);
                        class18.field258.method257(true, new class280(var96));
                    }
                } else if (class26.field384 == 97) {
                    int var97 = class300.field5157.method642((byte) -34);
                    int var98 = (var97 >> 4 & 0x7) + class64.field1023;
                    int var99 = (var97 & 0x7) + class204.field3190;
                    int var100 = class300.field5157.method576(1);
                    if (var100 == 65535) {
                        var100 = -1;
                    }
                    int var101 = class300.field5157.method642((byte) -84);
                    int var102 = (var101 & 0xF2) >> 4;
                    int var103 = class300.field5157.method642((byte) -54);
                    int var104 = var101 & 0x7;
                    if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                        int var105 = var102 + 1;
                        if (class13.field221.field3904[0] >= (var98 - var105) && (var98 + var105) >= class13.field221.field3904[0] && class13.field221.field3890[0] >= var99 - var105 && class13.field221.field3890[0] <= var99 + var105 && class42.field696 != 0 && var104 > 0 && class101.field1624 < 50 && var100 != -1) {
                            class186.field2891[class101.field1624] = var100;
                            class10.field128[class101.field1624] = var104;
                            class26.field437[class101.field1624] = var103;
                            class13.field194[class101.field1624] = null;
                            class98.field1603[class101.field1624] = (var98 << 16) + (var99 << 8) + var102;
                            class101.field1624++;
                        }
                    }
                } else if (class26.field384 == 240) {
                    int var106 = class300.field5157.method593(true);
                    int var107 = (var106 & 0x7) + class204.field3190;
                    int var108 = ((var106 & 0x71) >> 4) + class64.field1023;
                    int var109 = class300.field5157.method576(1);
                    if (var108 >= 0 && var107 >= 0 && var108 < 104 && var107 < 104) {
                        class32 var110 = class268.field4433[class279.field4651][var108][var107];
                        if (var110 != null) {
                            for (class2 var111 = (class2) var110.method264(-94); var111 != null; var111 = (class2) var110.method263(4)) {
                                if ((var109 & 0x7FFF) == var111.field23.field2155) {
                                    var111.method1006(-1024);
                                    break;
                                }
                            }
                            if (var110.method264(-57) == null) {
                                class268.field4433[class279.field4651][var108][var107] = null;
                            }
                            class244.method1683(var107, (byte) 65, var108);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILve;)V", line = 919)
    public static final void method1092(int arg0, class266 arg1) {
        field2513++;
        class145.field2204 = arg1.method1876(class272.field4536, (byte) -30);
        class36.field590 = arg1.method1876(class279.field4654, (byte) -30);
        class46.field724 = arg1.method1876(class46.field733, (byte) -30);
        class89.field1484 = arg1.method1876(class203.field3179, (byte) -30);
        class76.field1163 = arg1.method1876(class194.field3019, (byte) -30);
        client.field4111 = arg1.method1876(class134.field2039, (byte) -30);
        class96.field1571 = arg1.method1876(class149.field2326, (byte) -30);
        if (arg0 != 208) {
            field2510 = 0;
        }
        class236.field3766 = arg1.method1876(class287.field4805, (byte) -30);
        class240.field3875 = arg1.method1876(class29.field500, (byte) -30);
        class50.field786 = arg1.method1876(class101.field1628, (byte) -30);
        class84.field1379 = arg1.method1876(class190.field2984, (byte) -30);
        class199.field3094 = arg1.method1876(class292.field4865, (byte) -30);
        class308.field5306 = arg1.method1876(class101.field1640, (byte) -30);
        class88.field1457 = arg1.method1876(class22.field320, (byte) -30);
        class27.field444 = arg1.method1876(class281.field4693, (byte) -30);
        class7.field86 = arg1.method1876(class272.field4539, (byte) -30);
        class282.field4698 = arg1.method1876(class89.field1461, (byte) -30);
        class188.field2966 = arg1.method1876(class178.field2796, (byte) -30);
    }
}
