import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class32 extends class72 {

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "Z")
    public static volatile boolean field772 = true;

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "Lae;")
    public static class6 field779 = class64.method474(104, "M");

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    public static int field775 = 0;

    @OriginalMember(owner = "client!ee", name = "db", descriptor = "I")
    public static volatile int field785 = 0;

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "Lae;")
    private static class6 field781 = class64.method474(123, "Loading textures )2 ");

    @OriginalMember(owner = "client!ee", name = "hb", descriptor = "I")
    public static int field789 = 0;

    @OriginalMember(owner = "client!ee", name = "jb", descriptor = "I")
    public static int field791 = -1;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "Lae;")
    private static class6 field773 = class64.method474(113, "M");

    @OriginalMember(owner = "client!ee", name = "cb", descriptor = "Lae;")
    public static class6 field784 = field773;

    @OriginalMember(owner = "client!ee", name = "kb", descriptor = "Lae;")
    private static class6 field792 = class64.method474(119, "Click to continue");

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "Lae;")
    public static class6 field771 = field781;

    @OriginalMember(owner = "client!ee", name = "gb", descriptor = "Lae;")
    public static class6 field788 = field792;

    @OriginalMember(owner = "client!ee", name = "lb", descriptor = "Lnc;")
    public static class82 field793 = new class82();

    @OriginalMember(owner = "client!ee", name = "rb", descriptor = "[I")
    public static int[] field799 = new int[32];

    @OriginalMember(owner = "client!ee", name = "tb", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!ee", name = "eb", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!ee", name = "fb", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!ee", name = "ib", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!ee", name = "mb", descriptor = "I")
    private static int field794;

    @OriginalMember(owner = "client!ee", name = "nb", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "client!ee", name = "pb", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "client!ee", name = "qb", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "client!ee", name = "sb", descriptor = "Lq;")
    public static class101 field800;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "Lme;")
    public static class79 field776;

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "[I")
    public int[] field778;

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "[I")
    public int[] field780;

    @OriginalMember(owner = "client!ee", name = "ob", descriptor = "[Lae;")
    public class6[] field796;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field799[var1] = var0 - 1;
            var0 += var0;
        }
        field801 = -1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V", line = 19)
    public static final void method290(byte arg0) {
        if (arg0 > -92) {
            return;
        }
        for (int var1 = 0; var1 < class41.field916; var1++) {
            int var10002 = class64.field1407[var1]--;
            if (class64.field1407[var1] >= -10) {
                class99 var3 = class24.field618[var1];
                if (var3 == null) {
                    var3 = class99.method833(class68.field1499, class138.field3356[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class64.field1407[var1] += var3.method832();
                    class24.field618[var1] = var3;
                }
                if (class64.field1407[var1] < 0) {
                    int var10;
                    if (class111.field2667[var1] == 0) {
                        var10 = class64.field1406;
                    } else {
                        int var4 = (class111.field2667[var1] & 0xFF) * 128;
                        int var5 = class111.field2667[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class12.field229.field1783;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = class111.field2667[var1] >> 8 & 0xFF;
                        int var8 = var7 * 128 + 64 - class12.field229.field1752;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 + var6 - 128;
                        if (var4 < var9) {
                            class64.field1407[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class14.field301 / var4;
                    }
                    class55 var11 = var3.method834().method422(field776);
                    class97 var12 = class97.method821(var11, 100, var10);
                    var12.method825(class129.field3129[var1] - 1);
                    class4.field35.method172(var12);
                    class64.field1407[var1] = -100;
                }
            } else {
                class41.field916--;
                for (int var2 = var1; var2 < class41.field916; var2++) {
                    class138.field3356[var2] = class138.field3356[var2 + 1];
                    class24.field618[var2] = class24.field618[var2 + 1];
                    class129.field3129[var2] = class129.field3129[var2 + 1];
                    class64.field1407[var2] = class64.field1407[var2 + 1];
                    class111.field2667[var2] = class111.field2667[var2 + 1];
                }
                var1--;
            }
        }
        field777++;
        if (class21.field519 <= 0) {
            return;
        }
        class21.field519 -= 20;
        if (class21.field519 < 0) {
            class21.field519 = 0;
        }
        if (class21.field519 == 0 && class76.field1795 != 0 && class138.field3360 != -1) {
            class70.method510(-102, 0, 0, false, class41.field913, class76.field1795, class138.field3360);
            return;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 146)
    public static final void method291(Component arg0, int arg1) {
        if (arg1 == 13331) {
            arg0.addMouseListener(class136.field3309);
            arg0.addMouseMotionListener(class136.field3309);
            arg0.addFocusListener(class136.field3309);
            field782++;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILl;[Lh;)V", line = 176)
    public static final void method292(int arg0, class71 arg1, class47[] arg2) {
        field783++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class108.field2582[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class108.field2582[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method383((byte) -85, var111, var110);
                        }
                    }
                }
            }
        }
        class56.field1231 += (int) (Math.random() * 5.0D) - 2;
        if (class56.field1231 < -8) {
            class56.field1231 = -8;
        }
        class68.field1506 += (int) (Math.random() * 5.0D) - 2;
        if (class68.field1506 < -16) {
            class68.field1506 = -16;
        }
        if (class68.field1506 > 16) {
            class68.field1506 = 16;
        }
        if (class56.field1231 > 8) {
            class56.field1231 = 8;
        }
        int var4 = 0;
        if (arg0 >= -117) {
            field800 = null;
        }
        while (var4 < 4) {
            byte[][] var47 = class22.field560[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class137.field3331[var4][var101 + 1][var50] - class137.field3331[var4][var101 - 1][var50];
                    int var103 = class137.field3331[var4][var101][var50 + 1] - class137.field3331[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = 65536 / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var107 * -50 + var105 * -10 + var106 * -50) / var49 + 96;
                    int var109 = (var47[var101 - 1][var50] >> 2) + (var47[var101 + 1][var50] >> 3) + (var47[var101][var50] >> 1) + (var47[var101][var50 + 1] >> 3) + (var47[var101][var50 + -1] >> 2);
                    class27.field677[var101][var50] = var108 - var109;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class20.field421[var51] = 0;
                class64.field1403[var51] = 0;
                class118.field2809[var51] = 0;
                class46.field1040[var51] = 0;
                class15.field316[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class139.field3373[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class64 var97 = class50.method402(var96 - 1, (byte) 47);
                            class20.field421[var55] += var97.field1409;
                            class64.field1403[var55] += var97.field1408;
                            class118.field2809[var55] += var97.field1390;
                            class46.field1040[var55] += var97.field1389;
                            var10002 = class15.field316[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class139.field3373[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class64 var100 = class50.method402(var99 - 1, (byte) 83);
                            class20.field421[var55] -= var100.field1409;
                            class64.field1403[var55] -= var100.field1408;
                            class118.field2809[var55] -= var100.field1390;
                            class46.field1040[var55] -= var100.field1389;
                            var10002 = class15.field316[var55]--;
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
                        if (var62 >= 0 && var62 < 104) {
                            var56 += class20.field421[var62];
                            var60 += class46.field1040[var62];
                            var58 += class64.field1403[var62];
                            var59 += class15.field316[var62];
                            var57 += class118.field2809[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var58 -= class64.field1403[var63];
                            var60 -= class46.field1040[var63];
                            var59 -= class15.field316[var63];
                            var57 -= class118.field2809[var63];
                            var56 -= class20.field421[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class82.field2017 || (class108.field2582[0][var52][var61] & 0x2) != 0 || (class108.field2582[var4][var52][var61] & 0x10) == 0 && class82.method706(var61, var52, var4, (byte) 23) == class92.field2180)) {
                            if (var4 < class47.field1069) {
                                class47.field1069 = var4;
                            }
                            int var64 = class139.field3373[var4][var52][var61] & 0xFF;
                            int var65 = class57.field1239[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class137.field3331[var4][var52][var61];
                                int var67 = class137.field3331[var4][var52 + 1][var61];
                                int var68 = class137.field3331[var4][var52][var61 + 1];
                                int var69 = class137.field3331[var4][var52 + 1][var61 + 1];
                                int var70 = class27.field677[var52][var61];
                                int var71 = class27.field677[var52 + 1][var61];
                                int var72 = -1;
                                int var73 = class27.field677[var52][var61 + 1];
                                int var74 = class27.field677[var52 + 1][var61 + 1];
                                int var75 = -1;
                                if (var64 > 0) {
                                    int var76 = var56 * 256 / var60;
                                    int var77 = var57 / var59;
                                    int var78 = var58 / var59;
                                    var72 = class136.method1106(var77, var78, 17, var76);
                                    int var79 = class68.field1506 + var77;
                                    int var80 = class56.field1231 + var76 & 0xFF;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 255) {
                                        var79 = 255;
                                    }
                                    var75 = class136.method1106(var79, var78, -107, var80);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class137.field3335[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class122.method1006(var65 - 1, (byte) 120).field2387) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var66 == var69 && var66 == var68) {
                                        class87.field2097[var4][var52][var61] = class105.method885(class87.field2097[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var75 != -1) {
                                    var82 = class29.field685[class68.method497(96, var75, (byte) -128)];
                                }
                                if (var65 == 0) {
                                    arg1.method533(var4, var52, var61, 0, 0, -1, var66, var67, var69, var68, class68.method497(var70, var72, (byte) -113), class68.method497(var71, var72, (byte) -126), class68.method497(var74, var72, (byte) -128), class68.method497(var73, var72, (byte) -127), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class137.field3335[var4][var52][var61] + 1;
                                    byte var84 = class117.field2759[var4][var52][var61];
                                    class102 var85 = class122.method1006(var65 - 1, (byte) 98);
                                    int var86 = var85.field2395;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = class29.field691.method894(105, var86);
                                        var88 = -1;
                                    } else if (var85.field2413 == 16711935) {
                                        var87 = -2;
                                        var88 = -2;
                                        var86 = -1;
                                    } else {
                                        var88 = class136.method1106(var85.field2384, var85.field2415, -101, var85.field2394);
                                        int var89 = var85.field2394 + class56.field1231 & 0xFF;
                                        int var90 = class68.field1506 + var85.field2384;
                                        if (var90 < 0) {
                                            var90 = 0;
                                        } else if (var90 > 255) {
                                            var90 = 255;
                                        }
                                        var87 = class136.method1106(var90, var85.field2415, 76, var89);
                                    }
                                    int var91 = 0;
                                    if (var87 != -2) {
                                        var91 = class29.field685[class49.method396(var87, 96, (byte) 122)];
                                    }
                                    if (var85.field2403 != -1) {
                                        int var92 = class68.field1506 + var85.field2396;
                                        int var93 = class56.field1231 + var85.field2383 & 0xFF;
                                        if (var92 < 0) {
                                            var92 = 0;
                                        } else if (var92 > 255) {
                                            var92 = 255;
                                        }
                                        int var94 = class136.method1106(var92, var85.field2381, -123, var93);
                                        var91 = class29.field685[class49.method396(var94, 96, (byte) 122)];
                                    }
                                    arg1.method533(var4, var52, var61, var83, var84, var86, var66, var67, var69, var68, class68.method497(var70, var72, (byte) -124), class68.method497(var71, var72, (byte) -123), class68.method497(var74, var72, (byte) -121), class68.method497(var73, var72, (byte) -121), class49.method396(var88, var70, (byte) 122), class49.method396(var88, var71, (byte) 122), class49.method396(var88, var74, (byte) 122), class49.method396(var88, var73, (byte) 122), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg1.method527(var4, var54, var53, class82.method706(var53, var54, var4, (byte) 23));
                }
            }
            class139.field3373[var4] = null;
            class57.field1239[var4] = null;
            class137.field3335[var4] = null;
            class117.field2759[var4] = null;
            class22.field560[var4] = null;
            var4++;
        }
        arg1.method560(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class108.field2582[1][var5][var46] & 0x2) == 2) {
                    arg1.method535(var5, var46);
                }
            }
        }
        int var6 = 1;
        int var7 = 2;
        int var8 = 4;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var6 <<= 0x3;
                var8 <<= 0x3;
                var7 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((var6 & class87.field2097[var10][var12][var11]) != 0) {
                            int var13 = var11;
                            int var14 = var10;
                            while (var13 > 0 && (class87.field2097[var10][var12][var13 - 1] & var6) != 0) {
                                var13--;
                            }
                            int var15 = var11;
                            int var16 = var10;
                            while (var15 < 104 && (var6 & class87.field2097[var10][var12][var15 + 1]) != 0) {
                                var15++;
                            }
                            label354: while (var14 > 0) {
                                for (int var17 = var13; var17 <= var15; var17++) {
                                    if ((var6 & class87.field2097[var14 - 1][var12][var17]) == 0) {
                                        break label354;
                                    }
                                }
                                var14--;
                            }
                            label343: while (var16 < var9) {
                                for (int var18 = var13; var18 <= var15; var18++) {
                                    if ((var6 & class87.field2097[var16 + 1][var12][var18]) == 0) {
                                        break label343;
                                    }
                                }
                                var16++;
                            }
                            int var19 = (var15 + 1 - var13) * (var16 + 1 - var14);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class137.field3331[var14][var12][var13];
                                int var22 = class137.field3331[var16][var12][var13] - var20;
                                class71.method553(var9, 1, var12 * 128, var12 * 128, var13 * 128, var15 * 128 + 128, var22, var21);
                                for (int var23 = var14; var23 <= var16; var23++) {
                                    for (int var24 = var13; var24 <= var15; var24++) {
                                        class87.field2097[var23][var12][var24] = class60.method451(class87.field2097[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((var7 & class87.field2097[var10][var12][var11]) != 0) {
                            int var25;
                            for (var25 = var12; var25 > 0 && (class87.field2097[var10][var25 - 1][var11] & var7) != 0; var25--) {
                            }
                            int var26;
                            for (var26 = var12; var26 < 104 && (var7 & class87.field2097[var10][var26 + 1][var11]) != 0; var26++) {
                            }
                            int var27 = var10;
                            int var28;
                            label408: for (var28 = var10; var28 > 0; var28--) {
                                for (int var29 = var25; var29 <= var26; var29++) {
                                    if ((class87.field2097[var28 - 1][var29][var11] & var7) == 0) {
                                        break label408;
                                    }
                                }
                            }
                            label397: while (var27 < var9) {
                                for (int var30 = var25; var30 <= var26; var30++) {
                                    if ((var7 & class87.field2097[var27 + 1][var30][var11]) == 0) {
                                        break label397;
                                    }
                                }
                                var27++;
                            }
                            int var31 = (var27 + 1 - var28) * (var26 + 1 - var25);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class137.field3331[var28][var25][var11];
                                int var34 = class137.field3331[var27][var25][var11] - var32;
                                class71.method553(var9, 2, var25 * 128, var26 * 128 + 128, var11 * 128, var11 * 128, var34, var33);
                                for (int var35 = var28; var35 <= var27; var35++) {
                                    for (int var36 = var25; var36 <= var26; var36++) {
                                        class87.field2097[var35][var36][var11] = class60.method451(class87.field2097[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((var8 & class87.field2097[var10][var12][var11]) != 0) {
                            int var37 = var12;
                            int var38 = var12;
                            int var39;
                            for (var39 = var11; var39 > 0 && (class87.field2097[var10][var12][var39 - 1] & var8) != 0; var39--) {
                            }
                            int var40;
                            for (var40 = var11; var40 < 104 && (class87.field2097[var10][var12][var40 + 1] & var8) != 0; var40++) {
                            }
                            label463: while (var37 > 0) {
                                for (int var41 = var39; var41 <= var40; var41++) {
                                    if ((class87.field2097[var10][var37 - 1][var41] & var8) == 0) {
                                        break label463;
                                    }
                                }
                                var37--;
                            }
                            label452: while (var38 < 104) {
                                for (int var42 = var39; var42 <= var40; var42++) {
                                    if ((class87.field2097[var10][var38 + 1][var42] & var8) == 0) {
                                        break label452;
                                    }
                                }
                                var38++;
                            }
                            if ((var38 + 1 - var37) * (var40 + 1 - var39) >= 4) {
                                int var43 = class137.field3331[var10][var37][var39];
                                class71.method553(var9, 4, var37 * 128, var38 * 128 + 128, var39 * 128, var40 * 128 + 128, var43, var43);
                                for (int var44 = var37; var44 <= var38; var44++) {
                                    for (int var45 = var39; var45 <= var40; var45++) {
                                        class87.field2097[var10][var44][var45] = class60.method451(class87.field2097[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLmc;I)V", line = 904)
    public static final void method293(byte arg0, class76 arg1, int arg2) {
        if (arg1.field1783 < 128 || arg1.field1752 < 128 || arg1.field1783 >= 13184 || arg1.field1752 >= 13184) {
            arg1.field1744 = -1;
            arg1.field1746 = -1;
            arg1.field1727 = 0;
            arg1.field1736 = 0;
            arg1.field1752 = arg1.field1726[0] * 128 + arg1.field1777 * 64;
            arg1.field1783 = arg1.field1796[0] * 128 + arg1.field1777 * 64;
            arg1.method613(0);
        }
        field770++;
        if (arg0 != 116) {
            return;
        }
        if (class12.field229 == arg1 && (arg1.field1783 < 1536 || arg1.field1752 < 1536 || arg1.field1783 >= 11776 || arg1.field1752 >= 11776)) {
            arg1.field1727 = 0;
            arg1.field1746 = -1;
            arg1.field1783 = arg1.field1796[0] * 128 + arg1.field1777 * 64;
            arg1.field1752 = arg1.field1726[0] * 128 + arg1.field1777 * 64;
            arg1.field1744 = -1;
            arg1.field1736 = 0;
            arg1.method613(0);
        }
        if (class5.field61 < arg1.field1727) {
            class30.method275(arg1, false);
        } else if (class5.field61 <= arg1.field1736) {
            class65.method477(arg1, (byte) -80);
        } else {
            class133.method1094(-2, arg1);
        }
        class105.method886(true, arg1);
        class78.method672(arg1, 1000000);
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V", line = 961)
    public static final void method294(int arg0) {
        class37.field852.method941(10);
        field786++;
        if (arg0 != -6414) {
            method291(null, 112);
        }
        class65.field1433 = class29.method258(class65.field1433);
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V", line = 983)
    public static void method295(int arg0) {
        field771 = null;
        field776 = null;
        field799 = null;
        if (arg0 != 24311) {
            method290((byte) -109);
        }
        field792 = null;
        field781 = null;
        field793 = null;
        field788 = null;
        field779 = null;
        field773 = null;
        field784 = null;
        field800 = null;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)V", line = 1015)
    public static final void method296(int arg0, int arg1) {
        field794 += arg1;
        field790++;
        while (class24.field603 <= field794) {
            class126.field3082 -= class126.field3082 >> 2;
            field794 -= class24.field603;
        }
        class126.field3082 -= arg1 * 1000;
        if (class126.field3082 < arg0) {
            class126.field3082 = 0;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIILkd;B)V", line = 1035)
    public static final void method297(int arg0, int arg1, int arg2, class66 arg3, byte arg4) {
        field774++;
        if (class12.field229 == arg3) {
            return;
        }
        int var5 = 42 % ((arg4 + 47) / 41);
        if (class85.field2058 >= 400) {
            return;
        }
        class6 var6;
        if (arg3.field1438 == 0) {
            var6 = class85.method731(new class6[] { arg3.field1456, class51.method407(class12.field229.field1436, arg3.field1436, false), class134.field3264, client.field469, class114.method942((byte) 71, arg3.field1436), class105.field2500 }, 14569);
        } else {
            var6 = class85.method731(new class6[] { arg3.field1456, class134.field3264, class102.field2411, class114.method942((byte) 71, arg3.field1438), class105.field2500 }, 14569);
        }
        if (class19.field382 == 1) {
            class130.field3152++;
            class6.method26(arg0, class76.field1792, arg2, class85.method731(new class6[] { class96.field2290, class121.field2991, var6 }, 14569), (byte) -88, arg1, 58);
        } else if (!class117.field2783) {
            for (int var7 = 4; var7 >= 0; var7--) {
                if (class139.field3379[var7] != null) {
                    short var9 = 0;
                    int var10 = 0;
                    if (class139.field3379[var7].method68(class109.field2645, -66)) {
                        if (arg3.field1436 > class12.field229.field1436) {
                            var9 = 2000;
                        }
                        if (class12.field229.field1463 != 0 && arg3.field1463 != 0) {
                            if (class12.field229.field1463 == arg3.field1463) {
                                var9 = 2000;
                            } else {
                                var9 = 0;
                            }
                        }
                    } else if (class25.field637[var7]) {
                        var9 = 2000;
                    }
                    class138.field3343++;
                    if (var7 == 0) {
                        var10 = var9 + 44;
                    }
                    if (var7 == 1) {
                        var10 = var9 + 22;
                    }
                    if (var7 == 2) {
                        var10 = var9 + 52;
                    }
                    if (var7 == 3) {
                        var10 = var9 + 56;
                    }
                    if (var7 == 4) {
                        var10 = var9 + 1;
                    }
                    class6.method26(arg0, class139.field3379[var7], arg2, class85.method731(new class6[] { class42.field959, var6 }, 14569), (byte) -43, arg1, var10);
                }
            }
        } else if ((class70.field1562 & 0x8) == 8) {
            class96.field2273++;
            class6.method26(arg0, client.field472, arg2, class85.method731(new class6[] { class20.field395, class121.field2991, var6 }, 14569), (byte) -30, arg1, 7);
        }
        for (int var8 = 0; var8 < class85.field2058; var8++) {
            if (class61.field1333[var8] == 33) {
                class57.field1247[var8] = class85.method731(new class6[] { class52.field1182, class104.field2460, class42.field959, var6 }, 14569);
                return;
            }
        }
    }
}
