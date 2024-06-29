import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class49 extends class121 {

    @OriginalMember(owner = "client!ha", name = "mb", descriptor = "I")
    public int field1199 = 0;

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "Loc;")
    private static class99 field1180 = class48.method402((byte) -104, " seconds)3");

    @OriginalMember(owner = "client!ha", name = "ab", descriptor = "Loc;")
    public static class99 field1187 = class48.method402((byte) -104, " )2> @yel@");

    @OriginalMember(owner = "client!ha", name = "eb", descriptor = "Loc;")
    private static class99 field1191 = class48.method402((byte) -104, "Friends");

    @OriginalMember(owner = "client!ha", name = "Z", descriptor = "Loc;")
    private static class99 field1186 = class48.method402((byte) -104, "On");

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "I")
    public static int field1179 = 0;

    @OriginalMember(owner = "client!ha", name = "fb", descriptor = "[I")
    public static int[] field1192 = new int[5];

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "Loc;")
    public static class99 field1178 = field1191;

    @OriginalMember(owner = "client!ha", name = "ob", descriptor = "Loc;")
    public static class99 field1201 = field1180;

    @OriginalMember(owner = "client!ha", name = "hb", descriptor = "Loc;")
    public static class99 field1194 = field1186;

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "Loc;")
    private static class99 field1185 = class48.method402((byte) -104, "Classic");

    @OriginalMember(owner = "client!ha", name = "pb", descriptor = "Z")
    public static boolean field1202 = false;

    @OriginalMember(owner = "client!ha", name = "nb", descriptor = "Loc;")
    public static class99 field1200 = field1185;

    @OriginalMember(owner = "client!ha", name = "qb", descriptor = "Loc;")
    public static class99 field1203 = class48.method402((byte) -104, ")1j");

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!ha", name = "cb", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!ha", name = "db", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!ha", name = "gb", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!ha", name = "ib", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!ha", name = "jb", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!ha", name = "kb", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!ha", name = "lb", descriptor = "Lef;")
    public static class35 field1198;

    @OriginalMember(owner = "client!ha", name = "bb", descriptor = "[Ldc;")
    public static class24[] field1188;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZI)V")
    public static final void method406(boolean arg0, int arg1) {
        if (class69.field1770.field3115 >> 7 == class69.field1765 && class69.field1770.field3077 >> 7 == class143.field3585) {
            class69.field1765 = 0;
        }
        field1183++;
        if (arg1 < 32) {
            field1194 = null;
        }
        int var2 = class101.field2446;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            int var4;
            class126 var5;
            if (arg0) {
                var4 = 33538048;
                var5 = class69.field1770;
            } else {
                var5 = class59.field1571[class67.field1729[var3]];
                var4 = class67.field1729[var3] << 14;
            }
            if (var5 != null && var5.method1032(-16)) {
                var5.field3022 = false;
                if ((class27.field684 && class101.field2446 > 50 || class101.field2446 > 200) && !arg0 && var5.field3126 == var5.field3092) {
                    var5.field3022 = true;
                }
                int var6 = var5.field3077 >> 7;
                int var7 = var5.field3115 >> 7;
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    if (var5.field3016 == null || class101.field2444 < var5.field3025 || class101.field2444 >= var5.field3019) {
                        if ((var5.field3115 & 0x7F) == 64 && (var5.field3077 & 0x7F) == 64) {
                            if (class118.field2898[var7][var6] == class81.field2012) {
                                continue;
                            }
                            class118.field2898[var7][var6] = class81.field2012;
                        }
                        var5.field3017 = class137.method1144(true, var5.field3115, var5.field3077, class84.field2116);
                        class68.field1757.method38(class84.field2116, var5.field3115, var5.field3077, var5.field3017, 60, var5, var5.field3107, var4, var5.field3089);
                    } else {
                        var5.field3022 = false;
                        var5.field3017 = class137.method1144(true, var5.field3115, var5.field3077, class84.field2116);
                        class68.field1757.method84(class84.field2116, var5.field3115, var5.field3077, var5.field3017, 60, var5, var5.field3107, var4, var5.field3024, var5.field3013, var5.field3023, var5.field3033);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BILve;Lef;)V")
    public static final void method407(byte arg0, int arg1, class144 arg2, class35 arg3) {
        field1181++;
        byte[] var4 = null;
        class83 var5 = class21.field510;
        synchronized (class21.field510) {
            for (class132 var6 = (class132) class21.field510.method722(108); var6 != null; var6 = (class132) class21.field510.method716(true)) {
                if ((long) arg1 == var6.field1138 && var6.field3212 == arg2 && var6.field3218 == 0) {
                    var4 = var6.field3219;
                    break;
                }
            }
        }
        if (var4 == null) {
            int var7 = 46 / ((81 - arg0) / 41);
            byte[] var8 = arg2.method1181(arg1, (byte) -3);
            arg3.method300(var8, arg2, (byte) 0, arg1, true);
        } else {
            arg3.method300(var4, arg2, (byte) 0, arg1, true);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLpc;BLpc;)V")
    public static final void method408(boolean arg0, class105 arg1, byte arg2, class105 arg3) {
        class113.field2827 = arg3;
        class3.field65 = arg0;
        field1195++;
        if (arg2 <= 107) {
            field1185 = null;
        }
        class47.field1144 = arg1;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public static final void method409(int arg0) {
        if (arg0 != 104) {
            field1180 = null;
        }
        if (class148.field3670 == 195) {
            byte var1 = class39.field965.method485(104);
            byte var2 = class39.field965.method516(1104110672);
            byte var3 = class39.field965.method484(-128);
            int var4 = class39.field965.method475(arg0 - 102);
            int var5 = var4 >> 2;
            int var6 = class77.field1910[var5];
            int var7 = class39.field965.method478(false);
            int var8 = class39.field965.method504((byte) 36);
            int var9 = var4 & 0x3;
            int var10 = class39.field965.method479(101);
            int var11 = (var10 & 0x7) + class93.field2267;
            int var12 = (var10 >> 4 & 0x7) + class33.field791;
            int var13 = class39.field965.method504((byte) 24);
            byte var14 = class39.field965.method486(-128);
            int var15 = class39.field965.method478(false);
            class126 var16;
            if (class94.field2292 == var8) {
                var16 = class69.field1770;
            } else {
                var16 = class59.field1571[var8];
            }
            if (var16 != null) {
                class16 var17 = class83.method717(6, var7);
                int var18 = class121.field2964[class84.field2116][var12][var11];
                int var19 = class121.field2964[class84.field2116][var12 + 1][var11];
                int var20 = class121.field2964[class84.field2116][var12][var11 + 1];
                int var21 = class121.field2964[class84.field2116][var12 + 1][var11 + 1];
                class26 var22 = var17.method163(var18, var5, var20, var21, (byte) -128, var9, var19);
                if (var22 != null) {
                    class125.method1022(0, (byte) 113, var15 + 1, class84.field2116, var6, 0, var12, -1, var11, var13 + 1);
                    var16.field3016 = var22;
                    int var23 = var17.field376;
                    int var24 = var17.field425;
                    if (var3 > var2) {
                        byte var25 = var3;
                        var3 = var2;
                        var2 = var25;
                    }
                    if (var9 == 1 || var9 == 3) {
                        var24 = var17.field376;
                        var23 = var17.field425;
                    }
                    var16.field3021 = var12 * 128 + var24 * 64;
                    var16.field3037 = var11 * 128 + var23 * 64;
                    var16.field3025 = class101.field2444 + var15;
                    if (var14 < var1) {
                        byte var26 = var1;
                        var1 = var14;
                        var14 = var26;
                    }
                    var16.field3019 = class101.field2444 + var13;
                    var16.field3031 = class137.method1144(true, var16.field3021, var16.field3037, class84.field2116);
                    var16.field3033 = var11 + var14;
                    var16.field3013 = var1 + var11;
                    var16.field3024 = var12 + var3;
                    var16.field3023 = var12 + var2;
                }
            }
        }
        field1193++;
        if (class148.field3670 == 167) {
            int var27 = class39.field965.method510(arg0 - 223);
            int var28 = (var27 >> 4 & 0x7) + class33.field791;
            int var29 = (var27 & 0x7) + class93.field2267;
            int var30 = class39.field965.method504((byte) 87);
            int var31 = class39.field965.method489(arg0 ^ 0x68);
            int var32 = var31 >> 2;
            int var33 = class77.field1910[var32];
            int var34 = var31 & 0x3;
            if (var28 >= 0 && var29 >= 0 && var28 < 103 && var29 < 103) {
                int var35 = class121.field2964[class84.field2116][var28 + 1][var29];
                int var36 = class121.field2964[class84.field2116][var28][var29];
                int var37 = class121.field2964[class84.field2116][var28][var29 + 1];
                int var38 = class121.field2964[class84.field2116][var28 + 1][var29 + 1];
                if (var33 == 0) {
                    class55 var39 = class68.field1757.method55(class84.field2116, var28, var29);
                    if (var39 != null) {
                        int var40 = var39.field1417 >> 14 & 0x7FFF;
                        if (var32 == 2) {
                            var39.field1408 = new class32(var40, 2, var34 + 4, var36, var35, var38, var37, var30, false, var39.field1408);
                            var39.field1422 = new class32(var40, 2, var34 + 1 & 0x3, var36, var35, var38, var37, var30, false, var39.field1422);
                        } else {
                            var39.field1408 = new class32(var40, var32, var34, var36, var35, var38, var37, var30, false, var39.field1408);
                        }
                    }
                }
                if (var33 == 1) {
                    class66 var41 = class68.field1757.method63(class84.field2116, var28, var29);
                    if (var41 != null) {
                        var41.field1703 = new class32(var41.field1694 >> 14 & 0x7FFF, 4, 0, var36, var35, var38, var37, var30, false, var41.field1703);
                    }
                }
                if (var33 == 2) {
                    if (var32 == 11) {
                        var32 = 10;
                    }
                    class5 var42 = class68.field1757.method41(class84.field2116, var28, var29);
                    if (var42 != null) {
                        var42.field118 = new class32(var42.field103 >> 14 & 0x7FFF, var32, var34, var36, var35, var38, var37, var30, false, var42.field118);
                    }
                }
                if (var33 == 3) {
                    class100 var43 = class68.field1757.method66(class84.field2116, var28, var29);
                    if (var43 != null) {
                        var43.field2420 = new class32(var43.field2423 >> 14 & 0x7FFF, 22, var34, var36, var35, var38, var37, var30, false, var43.field2420);
                    }
                }
            }
        } else if (class148.field3670 == 51) {
            int var44 = class39.field965.method504((byte) 68);
            int var45 = class39.field965.method504((byte) 124);
            int var46 = class39.field965.method475(arg0 ^ 0x6A);
            int var47 = (var46 >> 4 & 0x7) + class33.field791;
            int var48 = (var46 & 0x7) + class93.field2267;
            int var49 = class39.field965.method478(false);
            if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104 && class94.field2292 != var45) {
                class112 var50 = new class112();
                var50.field2800 = var49;
                var50.field2799 = var44;
                if (class18.field476[class84.field2116][var47][var48] == null) {
                    class18.field476[class84.field2116][var47][var48] = new class83();
                }
                class18.field476[class84.field2116][var47][var48].method720(var50, 0);
                class89.method753(var47, (byte) 89, var48);
            }
        } else if (class148.field3670 == 153) {
            int var51 = class39.field965.method510(-118);
            int var52 = var51 >> 2;
            int var53 = class77.field1910[var52];
            int var54 = var51 & 0x3;
            int var55 = class39.field965.method497(29);
            int var56 = class39.field965.method479(125);
            int var57 = (var56 & 0x7) + class93.field2267;
            int var58 = (var56 >> 4 & 0x7) + class33.field791;
            if (var58 >= 0 && var57 >= 0 && var58 < 104 && var57 < 104) {
                class125.method1022(var54, (byte) 112, 0, class84.field2116, var53, var52, var58, var55, var57, -1);
            }
        } else {
            if (class148.field3670 == 186) {
                int var59 = class39.field965.method510(arg0 - 221);
                int var60 = (var59 >> 4 & 0x7) + class33.field791;
                int var61 = (var59 & 0x7) + class93.field2267;
                int var62 = class39.field965.method506(arg0 - 105);
                int var63 = class39.field965.method510(-113);
                int var64 = var63 & 0x7;
                int var65 = class39.field965.method510(arg0 - 215);
                int var66 = var63 >> 4 & 0xF;
                if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                    int var67 = var66 + 1;
                    if (var60 - var67 <= class69.field1770.field3100[0] && class69.field1770.field3100[0] <= var60 + var67 && var61 - var67 <= class69.field1770.field3096[0] && var61 + var67 >= class69.field1770.field3096[0] && class81.field2013 != 0 && var64 > 0 && class31.field748 < 50) {
                        class2.field41[class31.field748] = var62;
                        class53.field1262[class31.field748] = var64;
                        class67.field1709[class31.field748] = var65;
                        class59.field1561[class31.field748] = null;
                        class79.field1953[class31.field748] = (var61 << 8) + (var60 << 16) + var66;
                        class31.field748++;
                    }
                }
            }
            if (class148.field3670 == 103) {
                int var68 = class39.field965.method510(-118);
                int var69 = (var68 >> 4 & 0x7) + class33.field791;
                int var70 = (var68 & 0x7) + class93.field2267;
                int var71 = class39.field965.method506(-1);
                int var72 = class39.field965.method506(arg0 - 105);
                int var73 = class39.field965.method506(-1);
                if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
                    class83 var74 = class18.field476[class84.field2116][var69][var70];
                    if (var74 != null) {
                        for (class112 var75 = (class112) var74.method722(arg0 ^ 0x6); var75 != null; var75 = (class112) var74.method716(true)) {
                            if ((var71 & 0x7FFF) == var75.field2799 && var75.field2800 == var72) {
                                var75.field2800 = var73;
                                break;
                            }
                        }
                        class89.method753(var69, (byte) -29, var70);
                    }
                }
            } else if (class148.field3670 == 241) {
                int var76 = class39.field965.method510(-111);
                int var77 = class33.field791 + (var76 >> 4 & 0x7);
                int var78 = class93.field2267 + (var76 & 0x7);
                int var79 = class39.field965.method506(-1);
                int var80 = class39.field965.method510(-117);
                int var81 = class39.field965.method506(-1);
                if (var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104) {
                    int var82 = var78 * 128 + 64;
                    int var83 = var77 * 128 + 64;
                    class67 var84 = new class67(var79, class84.field2116, var83, var82, class137.method1144(true, var83, var82, class84.field2116) - var80, var81, class101.field2444);
                    class125.field3010.method720(var84, 0);
                }
            } else if (class148.field3670 == 128) {
                int var85 = class39.field965.method489(0);
                int var86 = (var85 & 0x7) + class93.field2267;
                int var87 = class33.field791 + (var85 >> 4 & 0x7);
                int var88 = class39.field965.method478(false);
                if (var87 >= 0 && var86 >= 0 && var87 < 104 && var86 < 104) {
                    class83 var89 = class18.field476[class84.field2116][var87][var86];
                    if (var89 != null) {
                        for (class112 var90 = (class112) var89.method722(114); var90 != null; var90 = (class112) var89.method716(true)) {
                            if ((var88 & 0x7FFF) == var90.field2799) {
                                var90.method394((byte) 116);
                                break;
                            }
                        }
                        if (var89.method722(arg0 ^ 0x1B) == null) {
                            class18.field476[class84.field2116][var87][var86] = null;
                        }
                        class89.method753(var87, (byte) -74, var86);
                    }
                }
            } else if (class148.field3670 == 178) {
                int var91 = class39.field965.method475(2);
                int var92 = (var91 >> 4 & 0x7) + class33.field791;
                int var93 = (var91 & 0x7) + class93.field2267;
                int var94 = class39.field965.method475(2);
                int var95 = var94 & 0x3;
                int var96 = var94 >> 2;
                int var97 = class77.field1910[var96];
                if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104) {
                    class125.method1022(var95, (byte) 113, 0, class84.field2116, var97, var96, var92, -1, var93, -1);
                }
            } else if (class148.field3670 == 149) {
                int var98 = class39.field965.method506(-1);
                int var99 = class39.field965.method479(arg0 + 16);
                int var100 = class33.field791 + (var99 >> 4 & 0x7);
                int var101 = (var99 & 0x7) + class93.field2267;
                int var102 = class39.field965.method506(-1);
                if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                    class112 var103 = new class112();
                    var103.field2800 = var102;
                    var103.field2799 = var98;
                    if (class18.field476[class84.field2116][var100][var101] == null) {
                        class18.field476[class84.field2116][var100][var101] = new class83();
                    }
                    class18.field476[class84.field2116][var100][var101].method720(var103, 0);
                    class89.method753(var100, (byte) -25, var101);
                }
            } else if (class148.field3670 == 6) {
                int var104 = class39.field965.method510(-125);
                int var105 = class33.field791 + (var104 >> 4 & 0x7);
                int var106 = (var104 & 0x7) + class93.field2267;
                int var107 = class39.field965.method485(104) + var105;
                int var108 = var106 + class39.field965.method485(104);
                int var109 = class39.field965.method501(-82);
                int var110 = class39.field965.method506(arg0 ^ 0xFFFFFF97);
                int var111 = class39.field965.method510(-114) * 4;
                int var112 = class39.field965.method510(-120) * 4;
                int var113 = class39.field965.method506(-1);
                int var114 = class39.field965.method506(arg0 - 105);
                int var115 = class39.field965.method510(-119);
                int var116 = class39.field965.method510(-110);
                if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104 && var110 != 65535) {
                    int var117 = var107 * 128 + 64;
                    int var118 = var108 * 128 + 64;
                    int var119 = var105 * 128 + 64;
                    int var120 = var106 * 128 + 64;
                    class111 var121 = new class111(var110, class84.field2116, var119, var120, class137.method1144(true, var119, var120, class84.field2116) - var111, class101.field2444 + var113, class101.field2444 + var114, var115, var116, var109, var112);
                    var121.method950((byte) 112, class137.method1144(true, var117, var118, class84.field2116) - var112, var117, var118, class101.field2444 + var113);
                    class140.field3466.method720(var121, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
    public static final void method410(int arg0) {
        class46.field1131.method1116(0);
        class11.field259 = 1;
        if (arg0 != 11244) {
            field1180 = null;
        }
        field1184++;
        class55.field1410 = null;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)V")
    public static void method411(byte arg0) {
        field1185 = null;
        field1186 = null;
        field1192 = null;
        field1187 = null;
        field1178 = null;
        field1201 = null;
        field1191 = null;
        field1188 = null;
        field1194 = null;
        field1200 = null;
        int var1 = 78 / ((-arg0 - 7) / 35);
        field1203 = null;
        field1180 = null;
        field1198 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZLib;)V")
    private final void method412(int arg0, boolean arg1, class57 arg2) {
        field1189++;
        if (arg1) {
            method411((byte) 45);
        }
        if (arg0 == 5) {
            this.field1199 = arg2.method506(-1);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZZI)I")
    public static final int method413(boolean arg0, boolean arg1, int arg2) {
        int var3 = 0;
        field1197++;
        if (arg2 != 7) {
            return -90;
        }
        if (arg1) {
            var3 += class84.field2082 + class144.field3591;
        }
        if (arg0) {
            var3 += class84.field2115 + class102.field2485;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLib;)V")
    public final void method414(byte arg0, class57 arg1) {
        while (true) {
            int var3 = arg1.method510(-119);
            if (var3 == 0) {
                int var4 = -48 % ((71 - arg0) / 49);
                field1182++;
                return;
            }
            this.method412(var3, false, arg1);
        }
    }
}
