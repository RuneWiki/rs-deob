import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class159 extends class141 {

    @OriginalMember(owner = "client!ln", name = "t", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!ln", name = "A", descriptor = "I")
    private int field2763;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "[[I")
    public int[][] field2749;

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "[I")
    public int[] field2758;

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "[Z")
    public boolean[] field2755;

    @OriginalMember(owner = "client!ln", name = "x", descriptor = "Lhi;")
    private static class82 field2760 = class95.method664((byte) -91, "Drop");

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "Lhi;")
    public static class82 field2750 = field2760;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "Lhn;")
    public static class317 field2751 = new class317(64);

    @OriginalMember(owner = "client!ln", name = "C", descriptor = "Lhi;")
    public static class82 field2765 = null;

    @OriginalMember(owner = "client!ln", name = "D", descriptor = "Lhi;")
    public static class82 field2766 = class95.method664((byte) -46, "<col=00ff00>");

    @OriginalMember(owner = "client!ln", name = "B", descriptor = "Lhi;")
    private static class82 field2764 = class95.method664((byte) -34, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!ln", name = "E", descriptor = "Lhi;")
    public static class82 field2767 = field2764;

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!ln", name = "y", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "[I")
    public static int[] field2752;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BI)V", line = 9)
    public static final void method1149(byte arg0, int arg1) {
        field2759++;
        class227 var2 = class215.method1531(-1, 10, arg1);
        int var3 = -61 % ((5 - arg0) / 55);
        var2.method1624((byte) -101);
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)V", line = 38)
    public static void method1150(byte arg0) {
        field2765 = null;
        field2760 = null;
        field2764 = null;
        field2767 = null;
        field2751 = null;
        field2750 = null;
        field2752 = null;
        if (arg0 != 15) {
            field2765 = (class82) null;
        }
        field2766 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILsm;)V", line = 55)
    public static final void method1151(int arg0, class120 arg1) {
        field2757++;
        class112.field2032 = 3;
        class137.method933(true, true);
        class61.field960 = 0;
        class113.field2040 = true;
        int var2 = 64 / ((-arg0 - 61) / 35);
        class93.field1660 = 0;
        class146.field2467 = 0;
        class52.field839 = true;
        class244.field4232 = true;
        class112.field2033 = 0;
        class126.field2220 = true;
        class308.field5238 = true;
        class77.field1320 = true;
        class138.field2373 = 127;
        class198.field3384 = true;
        class134.field2321 = 127;
        class75.field1303 = true;
        class33.field504 = 2;
        class208.field3641 = true;
        class256.field4409 = true;
        class284.field4771 = 255;
        class133.field2295 = true;
        class295.method2024(2);
        class87.field1554 = false;
        class123.field2155 = 0;
        class300.field5098 = false;
        class261.field4470 = 0;
        class8 var3 = null;
        try {
            class301 var4 = arg1.method829(-99, "runescape");
            while (var4.field5121 == 0) {
                class290.method2001(1L, false);
            }
            if (var4.field5121 == 1) {
                int var5 = 0;
                var3 = (class8) var4.field5122;
                byte[] var6 = new byte[(int) var3.method50(1)];
                while (var5 < var6.length) {
                    int var7 = var3.method47(var6, 247, var6.length - var5, var5);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                    var5 += var7;
                }
                class302.method2079((byte) -16, new class153(var6));
            }
        } catch (Exception var11) {
        }
        try {
            if (var3 != null) {
                var3.method48(59);
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V", line = 132)
    public static final void method1152(boolean arg0) {
        field2753++;
        if (class187.field3155 == 24) {
            int var1 = class35.field545.method1082(-75);
            int var2 = (var1 & 0x7) + class230.field3969;
            int var3 = (var1 >> 4 & 0x7) + class92.field1645;
            int var4 = class35.field545.method1090(false);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class35.field545.method1082(-106);
            int var6 = var5 >> 4 & 0xF;
            int var7 = var5 & 0x7;
            int var8 = class35.field545.method1082(-124);
            if (var3 >= 0 && var2 >= 0 && var3 < 104 && var2 < 104) {
                int var9 = var6 + 1;
                if (class168.field2932.field1723[0] >= (var3 - var9) && class168.field2932.field1723[0] <= (var3 + var9) && class168.field2932.field1720[0] >= var2 - var9 && class168.field2932.field1720[0] <= var2 + var9 && class138.field2373 != 0 && var7 > 0 && class21.field282 < 50 && var4 != -1) {
                    class184.field3130[class21.field282] = var4;
                    class22.field310[class21.field282] = var7;
                    class105.field1862[class21.field282] = var8;
                    class238.field4141[class21.field282] = null;
                    class56.field897[class21.field282] = (var2 << 8) + (var3 << 16) + var6;
                    class21.field282++;
                }
            }
        } else if (class187.field3155 == 98) {
            int var10 = class35.field545.method1068(-13190);
            int var11 = (var10 >> 4 & 0x7) + class92.field1645;
            int var12 = (var10 & 0x7) + class230.field3969;
            int var13 = class35.field545.method1076(-119);
            int var14 = class35.field545.method1100(-32768);
            int var15 = class35.field545.method1078(!arg0);
            if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104 && class109.field1949 != var14) {
                class288 var16 = new class288();
                var16.field4844 = var13;
                var16.field4840 = var15;
                if (class107.field1889[class297.field5058][var11][var12] == null) {
                    class107.field1889[class297.field5058][var11][var12] = new class277();
                }
                class107.field1889[class297.field5058][var11][var12].method1940((byte) -88, new class315(var16));
                class122.method837(var11, (byte) 127, var12);
            }
        } else if (class187.field3155 == 49) {
            int var17 = class35.field545.method1076(-81);
            int var18 = class35.field545.method1105((byte) -20);
            int var19 = ((var18 & 0x78) >> 4) + class92.field1645;
            int var20 = (var18 & 0x7) + class230.field3969;
            int var21 = class35.field545.method1068(-13190);
            int var22 = var21 >> 2;
            int var23 = class290.field4875[var22];
            int var24 = var21 & 0x3;
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                class54.method380(var24, var20, -1, var19, class297.field5058, var17, var23, -15001, var22, 0);
            }
        } else if (class187.field3155 == 76) {
            int var128 = class35.field545.method1082(-27);
            int var129 = ((var128 & 0x79) >> 4) + class92.field1645;
            int var130 = class230.field3969 + (var128 & 0x7);
            int var131 = class35.field545.method1090(false);
            int var132 = class35.field545.method1082(-103);
            int var133 = class35.field545.method1090(false);
            if (var129 >= 0 && var130 >= 0 && var129 < 104 && var130 < 104) {
                int var134 = var129 * 128 + 64;
                int var135 = var130 * 128 + 64;
                class168 var136 = new class168(var131, class297.field5058, var134, var135, class21.method145(var134, var135, class297.field5058, (byte) 63) - var132, var133, class212.field3708);
                class60.field947.method1940((byte) 102, new class42(var136));
            }
        } else if (arg0) {
            if (class187.field3155 == 210) {
                int var122 = class35.field545.method1068(-13190);
                int var123 = ((var122 & 0x79) >> 4) + class92.field1645;
                int var124 = class230.field3969 + (var122 & 0x7);
                int var125 = class35.field545.method1076(-102);
                int var126 = class35.field545.method1090(false);
                if (var123 >= 0 && var124 >= 0 && var123 < 104 && var124 < 104) {
                    class288 var127 = new class288();
                    var127.field4844 = var126;
                    var127.field4840 = var125;
                    if (class107.field1889[class297.field5058][var123][var124] == null) {
                        class107.field1889[class297.field5058][var123][var124] = new class277();
                    }
                    class107.field1889[class297.field5058][var123][var124].method1940((byte) 124, new class315(var127));
                    class122.method837(var123, (byte) 15, var124);
                }
            } else if (class187.field3155 == 163) {
                int var114 = class35.field545.method1090(false);
                if (var114 == 65535) {
                    var114 = -1;
                }
                int var115 = class35.field545.method1072(65280);
                int var116 = var115 >> 2;
                int var117 = var115 & 0x3;
                int var118 = class290.field4875[var116];
                int var119 = class35.field545.method1105((byte) -20);
                int var120 = class92.field1645 + (var119 >> 4 & 0x7);
                int var121 = (var119 & 0x7) + class230.field3969;
                class79.method499(var118, (byte) -65, var120, class297.field5058, var117, var114, var116, var121);
            } else if (class187.field3155 == 193) {
                int var105 = class35.field545.method1082(-40);
                int var106 = (var105 >> 4 & 0x7) + class92.field1645;
                int var107 = class230.field3969 + (var105 & 0x7);
                int var108 = class35.field545.method1090(false);
                int var109 = class35.field545.method1090(false);
                int var110 = class35.field545.method1090(false);
                if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104) {
                    class277 var111 = class107.field1889[class297.field5058][var106][var107];
                    if (var111 != null) {
                        for (class315 var112 = (class315) var111.method1936(16173); var112 != null; var112 = (class315) var111.method1926((byte) 90)) {
                            class288 var113 = var112.field5428;
                            if ((var108 & 0x7FFF) == var113.field4840 && var113.field4844 == var109) {
                                var113.field4844 = var110;
                                break;
                            }
                        }
                        class122.method837(var106, (byte) 116, var107);
                    }
                }
            } else if (class187.field3155 == 255) {
                int var98 = class35.field545.method1105((byte) -20);
                int var99 = var98 >> 2;
                int var100 = var98 & 0x3;
                int var101 = class290.field4875[var99];
                int var102 = class35.field545.method1105((byte) -20);
                int var103 = (var102 & 0x7) + class230.field3969;
                int var104 = class92.field1645 + ((var102 & 0x7F) >> 4);
                if (var104 >= 0 && var103 >= 0 && var104 < 104 && var103 < 104) {
                    class54.method380(var100, var103, -1, var104, class297.field5058, -1, var101, -15001, var99, 0);
                }
            } else if (class187.field3155 == 46) {
                int var25 = class35.field545.method1082(-49);
                int var26 = class92.field1645 + ((var25 & 0x74) >> 4);
                int var27 = (var25 & 0x7) + class230.field3969;
                int var28 = var26 + class35.field545.method1104(-1);
                int var29 = class35.field545.method1104(-1) + var27;
                int var30 = class35.field545.method1052(31521);
                int var31 = class35.field545.method1090(false);
                int var32 = class35.field545.method1082(-119) * 4;
                int var33 = class35.field545.method1082(-98) * 4;
                int var34 = class35.field545.method1090(false);
                int var35 = class35.field545.method1090(false);
                int var36 = class35.field545.method1082(-106);
                int var37 = class35.field545.method1082(-112);
                if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104 && var31 != 65535) {
                    int var38 = var26 * 128 + 64;
                    int var39 = var29 * 128 + 64;
                    int var40 = var27 * 128 + 64;
                    class38 var41 = new class38(var31, class297.field5058, var38, var40, class21.method145(var38, var40, class297.field5058, (byte) -105) - var32, var34 - -class212.field3708, var35 + class212.field3708, var36, var37, var30, var33);
                    int var42 = var28 * 128 + 64;
                    var41.method297(class21.method145(var42, var39, class297.field5058, (byte) 101) - var33, class212.field3708 + var34, var39, var42, -1);
                    class22.field300.method1940((byte) 47, new class61(var41));
                }
            } else if (class187.field3155 == 121) {
                int var43 = class35.field545.method1076(-59);
                int var44 = class35.field545.method1082(-120);
                int var45 = (var44 >> 4 & 0x7) + class92.field1645;
                int var46 = (var44 & 0x7) + class230.field3969;
                if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                    class277 var47 = class107.field1889[class297.field5058][var45][var46];
                    if (var47 != null) {
                        for (class315 var48 = (class315) var47.method1936(16173); var48 != null; var48 = (class315) var47.method1926((byte) 90)) {
                            if ((var43 & 0x7FFF) == var48.field5428.field4840) {
                                var48.method961((byte) 78);
                                break;
                            }
                        }
                        if (var47.method1936(16173) == null) {
                            class107.field1889[class297.field5058][var45][var46] = null;
                        }
                        class122.method837(var45, (byte) 109, var46);
                    }
                }
            } else {
                if (class187.field3155 == 211) {
                    int var49 = class35.field545.method1078(false);
                    byte var50 = class35.field545.method1086(10);
                    int var51 = class35.field545.method1100(-32768);
                    byte var52 = class35.field545.method1104(-1);
                    int var53 = class35.field545.method1078(false);
                    int var54 = class35.field545.method1068(-13190);
                    int var55 = var54 >> 2;
                    int var56 = var54 & 0x3;
                    int var57 = class290.field4875[var55];
                    int var58 = class35.field545.method1072(65280);
                    int var59 = (var58 >> 4 & 0x7) + class92.field1645;
                    int var60 = class230.field3969 + (var58 & 0x7);
                    int var61 = class35.field545.method1076(-99);
                    byte var62 = class35.field545.method1095(30369);
                    byte var63 = class35.field545.method1104(-1);
                    class81 var64;
                    if (class109.field1949 == var53) {
                        var64 = class168.field2932;
                    } else {
                        var64 = class29.field405[var53];
                    }
                    if (!class147.field2485 && var64 != null) {
                        class157 var65 = class99.method682(var49, (byte) -112);
                        int var66;
                        int var67;
                        if (var56 == 1 || var56 == 3) {
                            var66 = var65.field2704;
                            var67 = var65.field2725;
                        } else {
                            var66 = var65.field2725;
                            var67 = var65.field2704;
                        }
                        int var68 = (var67 + 1 >> 1) + var59;
                        int var69 = (var66 >> 1) + var60;
                        int var70 = (var66 + 1 >> 1) + var60;
                        int[][] var71 = class245.field4255[class297.field5058];
                        int[][] var72 = (int[][]) null;
                        int var73 = var59 + (var67 >> 1);
                        if (class297.field5058 < 3) {
                            var72 = class245.field4255[class297.field5058 + 1];
                        }
                        int var74 = (var59 << 7) + (var67 << 6);
                        int var75 = (var60 << 7) + (var66 << 6);
                        int var76 = var71[var68][var70] + var71[var73][var69] - (-var71[var68][var69] - var71[var73][var70]) >> 2;
                        class22 var77 = var65.method1118(var55, var65.field2683, (class186) null, var76, false, var56, var75, var72, var74, var71, (byte) -92);
                        if (var77 != null) {
                            if (var62 < var52) {
                                byte var78 = var52;
                                var52 = var62;
                                var62 = var78;
                            }
                            if (var50 > var63) {
                                byte var79 = var50;
                                var50 = var63;
                                var63 = var79;
                            }
                            class54.method380(0, var60, var51 + 1, var59, class297.field5058, -1, var57, -15001, 0, var61 + 1);
                            var64.field1391 = var60 * 128 + var66 * 64;
                            var64.field1410 = var50 + var60;
                            var64.field1381 = var59 * 128 + var67 * 64;
                            var64.field1413 = class212.field3708 + var61;
                            var64.field1386 = var60 + var63;
                            var64.field1400 = var76;
                            var64.field1397 = (class155) var77.field298;
                            var64.field1376 = var52 + var59;
                            var64.field1398 = class212.field3708 + var51;
                            var64.field1383 = var59 + var62;
                        }
                    }
                }
                if (class187.field3155 == 43) {
                    int var80 = class35.field545.method1082(-26);
                    int var81 = ((var80 & 0xFD) >> 4) + class92.field1645 * 2;
                    int var82 = (var80 & 0xF) + class230.field3969 * 2;
                    int var83 = class35.field545.method1104(-1) + var81;
                    int var84 = class35.field545.method1104(-1) + var82;
                    int var85 = class35.field545.method1052(31521);
                    int var86 = class35.field545.method1090(false);
                    int var87 = class35.field545.method1082(-88) * 4;
                    int var88 = class35.field545.method1082(-58) * 4;
                    int var89 = class35.field545.method1090(false);
                    int var90 = class35.field545.method1090(false);
                    int var91 = class35.field545.method1082(-57);
                    int var92 = class35.field545.method1082(-43);
                    if (var81 >= 0 && var82 >= 0 && var81 < 208 && var82 < 208 && var83 >= 0 && var84 >= 0 && var83 < 208 && var84 < 208 && var86 != 65535) {
                        int var93 = var83 * 64;
                        int var94 = var84 * 64;
                        int var95 = var81 * 64;
                        int var96 = var82 * 64;
                        class38 var97 = new class38(var86, class297.field5058, var95, var96, class21.method145(var95, var96, class297.field5058, (byte) -124) - var87, var89 - -class212.field3708, class212.field3708 + var90, var91, var92, var85, var88);
                        var97.method297(class21.method145(var93, var94, class297.field5058, (byte) -96) - var88, class212.field3708 + var89, var94, var93, -1);
                        class22.field300.method1940((byte) 119, new class61(var97));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I[Ljava/lang/Object;[JIB)V", line = 684)
    public static final void method1153(int arg0, Object[] arg1, long[] arg2, int arg3, byte arg4) {
        field2761++;
        if (arg0 < arg3) {
            int var5 = (arg0 + arg3) / 2;
            long var6 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var6;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg3];
            int var9 = arg0;
            arg1[arg3] = var8;
            for (int var10 = arg0; var10 < arg3; var10++) {
                if (arg2[var10] < ((long) (var10 & 0x1) + var6)) {
                    long var11 = arg2[var10];
                    arg2[var10] = arg2[var9];
                    arg2[var9] = var11;
                    Object var13 = arg1[var10];
                    arg1[var10] = arg1[var9];
                    arg1[var9++] = var13;
                }
            }
            arg2[arg3] = arg2[var9];
            arg2[var9] = var6;
            arg1[arg3] = arg1[var9];
            arg1[var9] = var8;
            method1153(arg0, arg1, arg2, var9 - 1, (byte) 107);
            method1153(var9 + 1, arg1, arg2, arg3, (byte) 55);
        }
        if (arg4 < 30) {
            method1152(false);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIBI)I", line = 738)
    public static final int method1154(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 > -56) {
            method1149((byte) 50, -66);
        }
        field2754++;
        if (arg0 == arg3) {
            return arg3;
        } else {
            int var4 = 128 - arg1;
            int var5 = ((arg0 & 0xFF00FF00) >>> 7) * arg1 + ((arg3 & 0xFF00FF00) >>> 7) * var4 & 0xFF00FF00;
            int var6 = (arg0 & 0xFF00FF) * arg1 + (arg3 & 0xFF00FF) * var4 & 0xFF00FF00;
            return var5 + (var6 >> 7);
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(I[B)V", line = 756)
    public class159(int arg0, byte[] arg1) {
        this.field2756 = arg0;
        class153 var3 = new class153(arg1);
        this.field2763 = var3.method1082(-69);
        this.field2749 = new int[this.field2763][];
        this.field2758 = new int[this.field2763];
        this.field2755 = new boolean[this.field2763];
        for (int var4 = 0; var4 < this.field2763; var4++) {
            this.field2758[var4] = var3.method1082(-91);
        }
        for (int var5 = 0; var5 < this.field2763; var5++) {
            this.field2755[var5] = var3.method1082(-39) == 1;
        }
        for (int var6 = 0; var6 < this.field2763; var6++) {
            this.field2749[var6] = new int[var3.method1082(-88)];
        }
        for (int var7 = 0; var7 < this.field2763; var7++) {
            for (int var8 = 0; var8 < this.field2749[var7].length; var8++) {
                this.field2749[var7][var8] = var3.method1082(-99);
            }
        }
    }
}
