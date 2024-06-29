import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class44 extends class45 {

    @OriginalMember(owner = "client!db", name = "y", descriptor = "[B")
    public byte[] field693;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field683 = 0;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "Z")
    public static boolean field690 = true;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "Lth;")
    public static class57 field691;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "Lth;")
    public static class57 field694;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "[Lam;")
    public static class152[] field687;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z[Lic;B[[[I)V", line = 9)
    public static final void method325(boolean arg0, class22[] arg1, byte arg2, int[][][] arg3) {
        field689++;
        byte var4;
        if (arg0) {
            var4 = 1;
        } else {
            var4 = 4;
        }
        if (!arg0) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        if ((class178.field2856[var5][var6][var7] & 0x1) == 1) {
                            int var8 = var5;
                            if ((class178.field2856[1][var6][var7] & 0x2) == 2) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method134(var7, var6, -64);
                            }
                        }
                    }
                }
            }
            class186.field2998 += (int) (Math.random() * 5.0D) - 2;
            class311.field4964 += (int) (Math.random() * 5.0D) - 2;
            if (class311.field4964 < -8) {
                class311.field4964 = -8;
            }
            if (class186.field2998 < -16) {
                class186.field2998 = -16;
            }
            if (class311.field4964 > 8) {
                class311.field4964 = 8;
            }
            if (class186.field2998 > 16) {
                class186.field2998 = 16;
            }
        }
        int var9 = class311.field4964 >> 2 << 10;
        int var10 = class186.field2998 >> 1;
        if (arg2 != 73) {
            return;
        }
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var4; var13++) {
            byte[][] var14 = class74.field1267[var13];
            if (!class42.field607) {
                int var15 = (int) Math.sqrt(5100.0D);
                int var16 = var15 * 768 >> 8;
                for (int var17 = 1; var17 < 103; var17++) {
                    for (int var18 = 1; var18 < 103; var18++) {
                        byte var19 = 74;
                        int var20 = class101.field1656[var13][var18 + 1][var17] - class101.field1656[var13][var18 - 1][var17];
                        int var21 = class101.field1656[var13][var18][var17 + 1] - class101.field1656[var13][var18][var17 - 1];
                        int var22 = (int) Math.sqrt((double) (var20 * var20 + var21 * var21 + 65536));
                        int var23 = (var20 << 8) / var22;
                        int var24 = -65536 / var22;
                        int var25 = (var14[var18][var17 + 1] >> 3) + (var14[var18 - 1][var17] >> 2) + (var14[var18][var17] >> 1) + (var14[var18][var17 + -1] >> 2) + (var14[var18 + 1][var17] >> 3);
                        int var26 = (var21 << 8) / var22;
                        int var27 = (var26 * -50 + var23 * -50 + var24 * -10) / var16 + var19;
                        var11[var18][var17] = var27 - var25;
                    }
                }
            } else if (class3.field36) {
                for (int var44 = 1; var44 < 103; var44++) {
                    for (int var45 = 1; var45 < 103; var45++) {
                        int var46 = (var14[var45][var44 + 1] >> 3) + (var14[var45][var44] >> 1) + (var14[var45 - -1][var44] >> 3) + (var14[var45 + -1][var44] >> 2) + (var14[var45][var44 + -1] >> 2);
                        byte var47 = 74;
                        var11[var45][var44] = var47 - var46;
                    }
                }
            } else {
                int var28 = (int) class167.field2659[1];
                int var29 = (int) class167.field2659[0];
                int var30 = (int) class167.field2659[2];
                int var31 = (int) Math.sqrt((double) (var30 * var30 + var28 * var28 + var29 * var29));
                int var32 = var31 * 1024 >> 8;
                for (int var33 = 1; var33 < 103; var33++) {
                    for (int var34 = 1; var34 < 103; var34++) {
                        byte var35 = 96;
                        int var36 = class101.field1656[var13][var34 + 1][var33] - class101.field1656[var13][var34 - 1][var33];
                        int var37 = class101.field1656[var13][var34][var33 + 1] - class101.field1656[var13][var34][var33 - 1];
                        int var38 = (int) Math.sqrt((double) (var36 * var36 + var37 * var37 + 65536));
                        int var39 = (var36 << 8) / var38;
                        int var40 = -65536 / var38;
                        int var41 = (var37 << 8) / var38;
                        int var42 = (var14[var34][var33 + 1] >> 3) + (var14[var34][var33] >> 1) + (var14[var34 + 1][var33] >> 3) + ((var14[var34 + -1][var33] >> 2) - -(var14[var34][var33 + -1] >> 2));
                        int var43 = (var29 * var39 - (-(var28 * var40) - (var30 * var41))) / var32 + var35;
                        var11[var34][var33] = var43 - ((int) ((float) var42 * 1.7F));
                    }
                }
            }
            for (int var48 = 0; var48 < 104; var48++) {
                class176.field2830[var48] = 0;
                class94.field1574[var48] = 0;
                class23.field271[var48] = 0;
                class118.field2000[var48] = 0;
                class172.field2755[var48] = 0;
            }
            for (int var49 = -5; var49 < 104; var49++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    int var51 = var49 + 5;
                    int var10002;
                    if (var51 < 104) {
                        int var52 = class40.field590[var13][var51][var50] & 0xFF;
                        if (var52 > 0) {
                            class279 var53 = class273.method2045(1, var52 - 1);
                            class176.field2830[var50] += var53.field4592;
                            class94.field1574[var50] += var53.field4593;
                            class23.field271[var50] += var53.field4590;
                            class118.field2000[var50] += var53.field4586;
                            var10002 = class172.field2755[var50]++;
                        }
                    }
                    int var54 = var49 - 5;
                    if (var54 >= 0) {
                        int var55 = class40.field590[var13][var54][var50] & 0xFF;
                        if (var55 > 0) {
                            class279 var56 = class273.method2045(1, var55 - 1);
                            class176.field2830[var50] -= var56.field4592;
                            class94.field1574[var50] -= var56.field4593;
                            class23.field271[var50] -= var56.field4590;
                            class118.field2000[var50] -= var56.field4586;
                            var10002 = class172.field2755[var50]--;
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
                            var59 += class23.field271[var63];
                            var60 += class118.field2000[var63];
                            var57 += class176.field2830[var63];
                            var61 += class172.field2755[var63];
                            var58 += class94.field1574[var63];
                        }
                        int var64 = var62 - 5;
                        if (var64 >= 0) {
                            var61 -= class172.field2755[var64];
                            var58 -= class94.field1574[var64];
                            var59 -= class23.field271[var64];
                            var60 -= class118.field2000[var64];
                            var57 -= class176.field2830[var64];
                        }
                        if (var62 >= 0 && var61 > 0) {
                            var12[var49][var62] = class181.method1422(15463, var59 / var61, var58 / var61, var57 * 256 / var60);
                        }
                    }
                }
            }
            for (int var65 = 1; var65 < 103; var65++) {
                label770: for (int var66 = 1; var66 < 103; var66++) {
                    if (arg0 || class215.method1621(25) || (class178.field2856[0][var65][var66] & 0x2) != 0 || (class178.field2856[var13][var65][var66] & 0x10) == 0 && class90.method718(var66, 2, var65, var13) == class344.field5468) {
                        if (class123.field2108 > var13) {
                            class123.field2108 = var13;
                        }
                        int var67 = class40.field590[var13][var65][var66] & 0xFF;
                        int var68 = class127.field2162[var13][var65][var66] & 0xFF;
                        if (var67 > 0 || var68 > 0) {
                            int var69 = class101.field1656[var13][var65][var66];
                            int var70 = class101.field1656[var13][var65 + 1][var66];
                            int var71 = class101.field1656[var13][var65 + 1][var66 + 1];
                            int var72 = class101.field1656[var13][var65][var66 + 1];
                            if (var13 > 0) {
                                boolean var73 = true;
                                if (var67 == 0 && class319.field5081[var13][var65][var66] != 0) {
                                    var73 = false;
                                }
                                if (var68 > 0 && !class124.method974(-82, var68 - 1).field453) {
                                    var73 = false;
                                }
                                if (var73 && var69 == var70 && var69 == var71 && var69 == var72) {
                                    class336.field5320[var13][var65][var66] = class75.method624(class336.field5320[var13][var65][var66], 4);
                                }
                            }
                            int var74;
                            int var77;
                            if (var67 > 0) {
                                var74 = var12[var65][var66];
                                int var75 = (var74 & 0x7F) + var10;
                                if (var75 < 0) {
                                    var75 = 0;
                                } else if (var75 > 127) {
                                    var75 = 127;
                                }
                                int var76 = (var9 + var74 & 0xFC00) + (var74 & 0x380) + var75;
                                var77 = class153.field2444[class157.method1218(96, 127, var76)];
                            } else {
                                var77 = 0;
                                var74 = -1;
                            }
                            int var78 = var11[var65][var66];
                            int var79 = var11[var65 + 1][var66];
                            int var80 = var11[var65][var66 + 1];
                            int var81 = var11[var65 + 1][var66 + 1];
                            if (var68 == 0) {
                                class71.method602(var13, var65, var66, 0, 0, -1, var69, var70, var71, var72, class157.method1218(var78, arg2 ^ 0x36, var74), class157.method1218(var79, arg2 ^ 0x36, var74), class157.method1218(var81, arg2 ^ 0x36, var74), class157.method1218(var80, arg2 ^ 0x36, var74), 0, 0, 0, 0, var77, 0);
                                if (class42.field607 && var13 > 0 && var74 != -1 && class273.method2045(arg2 - 72, var67 + -1).field4594) {
                                    class249.method1919(0, 0, true, false, var65, var66, var69 - class101.field1656[0][var65][var66], var70 - class101.field1656[0][var65 + 1][var66], var71 - class101.field1656[0][var65 + 1][var66 + 1], var72 - class101.field1656[0][var65][var66 - -1]);
                                }
                                if (class42.field607 && !arg0 && class128.field2168 != null && var13 == 0) {
                                    for (int var82 = var65 - 1; var82 <= (var65 + 1); var82++) {
                                        for (int var83 = var66 - 1; var83 <= var66 + 1; var83++) {
                                            if ((var65 != var82 || var66 != var83) && var82 >= 0 && var82 < 104 && var83 >= 0 && var83 < 104) {
                                                int var84 = class127.field2162[var13][var82][var83] & 0xFF;
                                                if (var84 != 0) {
                                                    class31 var85 = class124.method974(-116, var84 - 1);
                                                    if (var85.field444 != -1 && class27.method170((byte) -83, class153.field2439.method776(var85.field444, (byte) 41))) {
                                                        class128.field2168[var65][var66] = (var85.field441 << 24) + var85.field448;
                                                        continue label770;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var86 = class319.field5081[var13][var65][var66] + 1;
                                byte var87 = class329.field5232[var13][var65][var66];
                                class31 var88 = class124.method974(-54, var68 - 1);
                                if (class42.field607 && !arg0 && class128.field2168 != null && var13 == 0) {
                                    if (var88.field444 != -1 && class27.method170((byte) -125, class153.field2439.method776(var88.field444, (byte) 106))) {
                                        class128.field2168[var65][var66] = (var88.field441 << 24) + var88.field448;
                                    } else {
                                        label751: for (int var89 = var65 - 1; var89 <= (var65 + 1); var89++) {
                                            for (int var90 = var66 - 1; var90 <= var66 + 1; var90++) {
                                                if ((var65 != var89 || var66 != var90) && var89 >= 0 && var89 < 104 && var90 >= 0 && var90 < 104) {
                                                    int var91 = class127.field2162[var13][var89][var90] & 0xFF;
                                                    if (var91 != 0) {
                                                        class31 var92 = class124.method974(-108, var91 - 1);
                                                        if (var92.field444 != -1 && class27.method170((byte) -93, class153.field2439.method776(var92.field444, (byte) 92))) {
                                                            class128.field2168[var65][var66] = (var92.field441 << 24) + var92.field448;
                                                            break label751;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var93 = var88.field444;
                                if (var93 >= 0 && !class153.field2439.method764(var93, (byte) 65)) {
                                    var93 = -1;
                                }
                                int var94;
                                int var95;
                                if (var93 >= 0) {
                                    var94 = -1;
                                    var95 = class153.field2444[class168.method1309(96, class153.field2439.method770(var93, -41), 121)];
                                } else if (var88.field440 == -1) {
                                    var94 = -2;
                                    var95 = 0;
                                } else {
                                    var94 = var88.field440;
                                    int var96 = (var94 & 0x7F) + var10;
                                    if (var96 < 0) {
                                        var96 = 0;
                                    } else if (var96 > 127) {
                                        var96 = 127;
                                    }
                                    int var97 = (var9 + var94 & 0xFC00) + (var94 & 0x380) + var96;
                                    var95 = class153.field2444[class168.method1309(96, var97, arg2 ^ 0x30)];
                                }
                                if (var88.field439 >= 0) {
                                    int var98 = var88.field439;
                                    int var99 = (var98 & 0x7F) + var10;
                                    if (var99 < 0) {
                                        var99 = 0;
                                    } else if (var99 > 127) {
                                        var99 = 127;
                                    }
                                    int var100 = (var9 + var98 & 0xFC00) + (var98 & 0x380) + var99;
                                    var95 = class153.field2444[class168.method1309(96, var100, arg2 + 54)];
                                }
                                class71.method602(var13, var65, var66, var86, var87, var93, var69, var70, var71, var72, class157.method1218(var78, 127, var74), class157.method1218(var79, 127, var74), class157.method1218(var81, arg2 + 54, var74), class157.method1218(var80, 127, var74), class168.method1309(var78, var94, arg2 ^ 0x35), class168.method1309(var79, var94, 127), class168.method1309(var81, var94, 121), class168.method1309(var80, var94, 122), var77, var95);
                                if (class42.field607 && var13 > 0) {
                                    class249.method1919(var86, var87, var94 == -2 || !var88.field442, var74 == -1 || !class273.method2045(1, var67 - 1).field4594, var65, var66, var69 - class101.field1656[0][var65][var66], -class101.field1656[0][var65 - -1][var66] + var70, var71 - class101.field1656[0][var65 + 1][var66 + 1], -class101.field1656[0][var65][var66 + 1] + var72);
                                }
                            }
                        }
                    }
                }
            }
            if (class42.field607) {
                float[][] var101 = new float[105][105];
                int[][] var102 = class101.field1656[var13];
                float[][] var103 = new float[105][105];
                float[][] var104 = new float[105][105];
                int var105 = 1;
                while (true) {
                    if (var105 > 103) {
                        if (arg0) {
                            class299[] var115 = class86.method683(var104, class101.field1656[var13], class208.field3270[0], class319.field5081[var13], class178.field2856, class329.field5232[var13], class128.field2168, var101, class127.field2162[var13], class40.field590[var13], 18632, arg3, var103, var12, var11, var13);
                            class135.method1030(var13, var115);
                            break;
                        }
                        class299[] var110 = class86.method683(var104, class101.field1656[var13], (int[][]) null, class319.field5081[var13], class178.field2856, class329.field5232[var13], (int[][]) null, var101, class127.field2162[var13], class40.field590[var13], 18632, arg3, var103, var12, var11, var13);
                        class299[] var111 = class297.method2130(var13, class127.field2162[var13], var104, class329.field5232[var13], var101, class319.field5081[var13], class101.field1656[var13], -28265, class40.field590[var13], class178.field2856, var11, var103);
                        class299[] var112 = new class299[var110.length + var111.length];
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var112[var113] = var110[var113];
                        }
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var112[var110.length + var114] = var111[var114];
                        }
                        class135.method1030(var13, var112);
                        class316.method2240(var103, class127.field2162[var13], class101.field1656[var13], class40.field590[var13], var104, var101, (byte) -64, class329.field5232[var13], var13, class319.field5081[var13], class30.field429, class30.field428);
                        break;
                    }
                    for (int var106 = 1; var106 <= 103; var106++) {
                        int var107 = var102[var106 + 1][var105] - var102[var106 - 1][var105];
                        int var108 = var102[var106][var105 + 1] - var102[var106][var105 - 1];
                        float var109 = (float) Math.sqrt((double) (var107 * var107 + (var108 * var108) + 65536));
                        var104[var106][var105] = (float) var107 / var109;
                        var101[var106][var105] = -256.0F / var109;
                        var103[var106][var105] = (float) var108 / var109;
                    }
                    var105++;
                }
            }
            class40.field590[var13] = (byte[][]) null;
            class127.field2162[var13] = (byte[][]) null;
            class319.field5081[var13] = (byte[][]) null;
            class329.field5232[var13] = (byte[][]) null;
            class74.field1267[var13] = (byte[][]) null;
        }
        class181.method1414(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var116 = 0; var116 < 104; var116++) {
            for (int var117 = 0; var117 < 104; var117++) {
                if ((class178.field2856[1][var116][var117] & 0x2) == 2) {
                    class89.method704(var116, var117);
                }
            }
        }
        for (int var118 = 0; var118 < 4; var118++) {
            for (int var119 = 0; var119 <= 104; var119++) {
                for (int var120 = 0; var120 <= 104; var120++) {
                    if ((class336.field5320[var118][var120][var119] & 0x1) != 0) {
                        int var121 = var119;
                        int var122 = var119;
                        while (var121 > 0 && (class336.field5320[var118][var120][var121 - 1] & 0x1) != 0) {
                            var121--;
                        }
                        while (var122 < 104 && (class336.field5320[var118][var120][var122 + 1] & 0x1) != 0) {
                            var122++;
                        }
                        int var123;
                        label453: for (var123 = var118; var123 > 0; var123--) {
                            for (int var124 = var121; var124 <= var122; var124++) {
                                if ((class336.field5320[var123 - 1][var120][var124] & 0x1) == 0) {
                                    break label453;
                                }
                            }
                        }
                        int var125;
                        label441: for (var125 = var118; var125 < 3; var125++) {
                            for (int var126 = var121; var126 <= var122; var126++) {
                                if ((class336.field5320[var125 + 1][var120][var126] & 0x1) == 0) {
                                    break label441;
                                }
                            }
                        }
                        int var127 = (var122 + 1 - var121) * (var125 + 1 - var123);
                        if (var127 >= 8) {
                            short var128 = 240;
                            int var129 = class101.field1656[var123][var120][var121];
                            int var130 = class101.field1656[var125][var120][var121] - var128;
                            class245.method1877(1, var120 * 128, var120 * 128, var121 * 128, var122 * 128 + 128, var130, var129);
                            for (int var131 = var123; var131 <= var125; var131++) {
                                for (int var132 = var121; var132 <= var122; var132++) {
                                    class336.field5320[var131][var120][var132] = class343.method2418(class336.field5320[var131][var120][var132], -2);
                                }
                            }
                        }
                    }
                    if ((class336.field5320[var118][var120][var119] & 0x2) != 0) {
                        int var133 = var120;
                        int var134 = var120;
                        int var135 = var118;
                        while (var133 > 0 && (class336.field5320[var118][var133 - 1][var119] & 0x2) != 0) {
                            var133--;
                        }
                        int var136 = var118;
                        while (var134 < 104 && (class336.field5320[var118][var134 + 1][var119] & 0x2) != 0) {
                            var134++;
                        }
                        label507: while (var136 > 0) {
                            for (int var137 = var133; var137 <= var134; var137++) {
                                if ((class336.field5320[var136 - 1][var137][var119] & 0x2) == 0) {
                                    break label507;
                                }
                            }
                            var136--;
                        }
                        label496: while (var135 < 3) {
                            for (int var138 = var133; var138 <= var134; var138++) {
                                if ((class336.field5320[var135 + 1][var138][var119] & 0x2) == 0) {
                                    break label496;
                                }
                            }
                            var135++;
                        }
                        int var139 = (var134 + 1 - var133) * (var135 + 1 - var136);
                        if (var139 >= 8) {
                            short var140 = 240;
                            int var141 = class101.field1656[var135][var133][var119] - var140;
                            int var142 = class101.field1656[var136][var133][var119];
                            class245.method1877(2, var133 * 128, var134 * 128 + 128, var119 * 128, var119 * 128, var141, var142);
                            for (int var143 = var136; var143 <= var135; var143++) {
                                for (int var144 = var133; var144 <= var134; var144++) {
                                    class336.field5320[var143][var144][var119] = class343.method2418(class336.field5320[var143][var144][var119], -3);
                                }
                            }
                        }
                    }
                    if ((class336.field5320[var118][var120][var119] & 0x4) != 0) {
                        int var145 = var120;
                        int var146 = var120;
                        int var147;
                        for (var147 = var119; var147 > 0 && (class336.field5320[var118][var120][var147 - 1] & 0x4) != 0; var147--) {
                        }
                        int var148;
                        for (var148 = var119; var148 < 104 && (class336.field5320[var118][var120][var148 + 1] & 0x4) != 0; var148++) {
                        }
                        label561: while (var145 > 0) {
                            for (int var149 = var147; var149 <= var148; var149++) {
                                if ((class336.field5320[var118][var145 - 1][var149] & 0x4) == 0) {
                                    break label561;
                                }
                            }
                            var145--;
                        }
                        label550: while (var146 < 104) {
                            for (int var150 = var147; var150 <= var148; var150++) {
                                if ((class336.field5320[var118][var146 + 1][var150] & 0x4) == 0) {
                                    break label550;
                                }
                            }
                            var146++;
                        }
                        if (((var148 + 1 - var147) * (var146 + 1 - var145)) >= 4) {
                            int var151 = class101.field1656[var118][var145][var147];
                            class245.method1877(4, var145 * 128, var146 * 128 + 128, var147 * 128, var148 * 128 + 128, var151, var151);
                            for (int var152 = var145; var152 <= var146; var152++) {
                                for (int var153 = var147; var153 <= var148; var153++) {
                                    class336.field5320[var118][var152][var153] = class343.method2418(class336.field5320[var118][var152][var153], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BZ)Z", line = 992)
    public static final boolean method326(byte arg0, boolean arg1) {
        int var2 = 111 / ((48 - arg0) / 38);
        boolean var3 = class68.method578();
        field686++;
        if (arg1 == var3) {
            return true;
        }
        if (!arg1) {
            class68.method584();
        } else if (!class68.method582() || !class68.method579() || !class68.method586()) {
            arg1 = false;
        }
        class238.field3932 = arg1;
        class16.method87(class128.field2163, (byte) -64);
        if (var3 == arg1) {
            return false;
        } else {
            ((class98) class153.field2439).method756(255);
            return true;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLgf;Lvl;)Lua;", line = 1031)
    public static final class299 method327(byte arg0, class31 arg1, class164 arg2) {
        field685++;
        int var3 = -26 / ((23 - arg0) / 62);
        long var4 = ((long) arg1.field451 << 56) + ((long) arg1.field448 << 32) - (long) (-(arg1.field444 + 1 << 16) + -arg1.field445);
        class299 var6 = (class299) arg2.method1268(-63, var4);
        if (var6 == null) {
            var6 = new class299(arg1.field444, (float) arg1.field445, true, false, arg1.field448);
            arg2.method1273(1, var4, var6);
        }
        return var6;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V", line = 1051)
    public static final void method328(int arg0, int arg1) {
        field684++;
        class321 var2 = class46.method370(5, (byte) -106, arg0);
        var2.method2261(-129);
        int var3 = -29 % ((arg1 - 19) / 32);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "([B)V", line = 1065)
    public class44(byte[] arg0) {
        this.field693 = arg0;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 1074)
    public static void method329(int arg0) {
        if (arg0 != 1890799240) {
            field683 = -71;
        }
        field687 = null;
        field694 = null;
        field691 = null;
    }
}
