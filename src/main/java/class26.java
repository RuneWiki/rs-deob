import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class26 implements Runnable {

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "[Lud;")
    public volatile class184[] field541 = new class184[2];

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Z")
    public volatile boolean field538 = false;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Z")
    public volatile boolean field534 = false;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lsg;")
    public static class169 field535 = class165.method1060("(U(Y", 1536);

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field537 = 0;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "[J")
    public static long[] field533 = new long[32];

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field547 = 0;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "Z")
    public static boolean field544 = false;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Lua;")
    public static class181 field546 = new class181(64);

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field550 = 0;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "[J")
    public static long[] field548 = new long[100];

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Lsg;")
    public static class169 field549 = class165.method1060("Ausw-=hlen", 1536);

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Lma;")
    public class109 field539;

    @OriginalMember(owner = "client!cf", name = "run", descriptor = "()V")
    public final void run() {
        field543++;
        this.field534 = true;
        try {
            while (!this.field538) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class184 var2 = this.field541[var1];
                    if (var2 != null) {
                        var2.method1218(-25666);
                    }
                }
                client.method203(10L, (byte) -118);
                class138.method926(this.field539, null, 1);
            }
        } catch (Exception var9) {
            class21.method142(115, null, var9);
        } finally {
            Object var6 = null;
            this.field534 = false;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static final void method183(int arg0) {
        field542++;
        if (class86.field1571 == 248) {
            int var1 = class85.field1559.method827((byte) 35);
            int var2 = class85.field1559.method811(arg0 ^ 0x44B38CB9);
            int var3 = class85.field1559.method809((byte) -106);
            int var4 = (var3 >> 4 & 0x7) + class17.field377;
            int var5 = class94.field1761 + (var3 & 0x7);
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                class145 var6 = new class145();
                var6.field2694 = var2;
                var6.field2691 = var1;
                if (class60.field1112[class61.field1132][var4][var5] == null) {
                    class60.field1112[class61.field1132][var4][var5] = new class22();
                }
                class60.field1112[class61.field1132][var4][var5].method149(0, var6);
                class206.method1345(var4, var5, false);
            }
        } else if (class86.field1571 == 225) {
            int var7 = class85.field1559.method809((byte) -118);
            int var8 = var7 & 0x3;
            int var9 = var7 >> 2;
            int var10 = class192.field3800[var9];
            int var11 = class85.field1559.method819((byte) 22);
            int var12 = (var11 >> 4 & 0x7) + class17.field377;
            int var13 = (var11 & 0x7) + class94.field1761;
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                class182.method1211(var13, class61.field1132, 0, -1, -1, var12, false, var9, var8, var10);
            }
        } else if (class86.field1571 == 151) {
            int var14 = class85.field1559.method819((byte) 22);
            int var15 = (var14 & 0x7) + class94.field1761;
            int var16 = (var14 >> 4 & 0x7) + class17.field377;
            int var17 = class85.field1559.method824((byte) 65) + var16;
            int var18 = class85.field1559.method824((byte) -111) + var15;
            int var19 = class85.field1559.method818(1629612104);
            int var20 = class85.field1559.method785(true);
            int var21 = class85.field1559.method819((byte) 22) * 4;
            int var22 = class85.field1559.method819((byte) 22) * 4;
            int var23 = class85.field1559.method785(true);
            int var24 = class85.field1559.method785(true);
            int var25 = class85.field1559.method819((byte) 22);
            int var26 = class85.field1559.method819((byte) 22);
            if (var16 >= 0 && var15 >= 0 && var16 < 104 && var15 < 104 && var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104 && var20 != 65535) {
                int var27 = var17 * 128 + 64;
                int var28 = var18 * 128 + 64;
                int var29 = var16 * 128 + 64;
                int var30 = var15 * 128 + 64;
                class7 var31 = new class7(var20, class61.field1132, var29, var30, class183.method1215(var29, class61.field1132, var30, 0) - var21, var23 - -class162.field3107, var24 + class162.field3107, var25, var26, var19, var22);
                var31.method41(var27, -9066, var28, class183.method1215(var27, class61.field1132, var28, arg0 ^ 0x44B3B562) - var22, class162.field3107 + var23);
                class163.field3121.method149(arg0 - 1152628066, var31);
            }
        } else if (class86.field1571 == 43) {
            int var32 = class85.field1559.method819((byte) 22);
            int var33 = (var32 & 0x7) + class94.field1761;
            int var34 = (var32 >> 4 & 0x7) + class17.field377;
            int var35 = class85.field1559.method795((byte) 26);
            int var36 = class85.field1559.method806(1645316808);
            int var37 = var36 >> 2;
            int var38 = class192.field3800[var37];
            int var39 = var36 & 0x3;
            if (var34 >= 0 && var33 >= 0 && var34 < 104 && var33 < 104) {
                class182.method1211(var33, class61.field1132, 0, -1, var35, var34, false, var37, var39, var38);
            }
        } else if (class86.field1571 == 148) {
            int var40 = class85.field1559.method819((byte) 22);
            int var41 = class17.field377 + (var40 >> 4 & 0x7);
            int var42 = class94.field1761 + (var40 & 0x7);
            int var43 = class85.field1559.method785(true);
            int var44 = class85.field1559.method785(true);
            int var45 = class85.field1559.method785(true);
            if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                class22 var46 = class60.field1112[class61.field1132][var41][var42];
                if (var46 != null) {
                    for (class145 var47 = (class145) var46.method145(0); var47 != null; var47 = (class145) var46.method152((byte) -128)) {
                        if ((var43 & 0x7FFF) == var47.field2691 && var47.field2694 == var44) {
                            var47.field2694 = var45;
                            break;
                        }
                    }
                    class206.method1345(var41, var42, false);
                }
            }
        } else {
            if (arg0 != 1152628066) {
                field537 = 126;
            }
            if (class86.field1571 == 39) {
                byte var48 = class85.field1559.method777(arg0 - 1152628154);
                int var49 = class85.field1559.method809((byte) -106);
                int var50 = var49 & 0x3;
                int var51 = var49 >> 2;
                int var52 = class192.field3800[var51];
                int var53 = class85.field1559.method811(14811);
                int var54 = class85.field1559.method811(arg0 - 1152613255);
                int var55 = class85.field1559.method819((byte) 22);
                int var56 = class94.field1761 + (var55 & 0x7);
                int var57 = (var55 >> 4 & 0x7) + class17.field377;
                byte var58 = class85.field1559.method788((byte) 114);
                byte var59 = class85.field1559.method777(arg0 - 1152628008);
                int var60 = class85.field1559.method811(14811);
                int var61 = class85.field1559.method827((byte) 56);
                byte var62 = class85.field1559.method782(1);
                class196 var63;
                if (class206.field4041 == var54) {
                    var63 = class4.field79;
                } else {
                    var63 = class65.field1213[var54];
                }
                if (var63 != null) {
                    class17 var64 = class138.method925(6, var60);
                    int[][] var65 = class139.field2588[class61.field1132];
                    int var66;
                    int var67;
                    if (var50 == 1 || var50 == 3) {
                        var67 = var64.field369;
                        var66 = var64.field400;
                    } else {
                        var66 = var64.field369;
                        var67 = var64.field400;
                    }
                    int var68 = (var66 >> 1) + var57;
                    int var69 = (var67 >> 1) + var56;
                    int var70 = var56 + (var67 + 1 >> 1);
                    int var71 = (var66 + 1 >> 1) + var57;
                    int var72 = (var57 << 7) + (var66 << 6);
                    int var73 = var65[var68][var70] + var65[var71][var70] + var65[var71][var69] + var65[var68][var69] >> 2;
                    int var74 = (var56 << 7) + (var67 << 6);
                    class24 var75 = var64.method100(var65, var73, var51, var50, 25024, var74, var72);
                    if (var75 != null) {
                        class182.method1211(var56, class61.field1132, var53 + 1, var61 + 1, -1, var57, false, 0, 0, var52);
                        var63.field3854 = class162.field3107 + var53;
                        if (var62 < var59) {
                            byte var76 = var59;
                            var59 = var62;
                            var62 = var76;
                        }
                        var63.field3853 = var75;
                        var63.field3867 = var73;
                        var63.field3848 = class162.field3107 + var61;
                        var63.field3861 = var57 + var62;
                        var63.field3865 = var57 * 128 + var66 * 64;
                        if (var58 < var48) {
                            byte var77 = var48;
                            var48 = var58;
                            var58 = var77;
                        }
                        var63.field3849 = var48 + var56;
                        var63.field3858 = var56 + var58;
                        var63.field3857 = var56 * 128 + var67 * 64;
                        var63.field3850 = var57 + var59;
                    }
                }
            }
            if (class86.field1571 == 108) {
                int var78 = class85.field1559.method819((byte) 22);
                int var79 = (var78 & 0x7) + class94.field1761;
                int var80 = (var78 >> 4 & 0x7) + class17.field377;
                int var81 = class85.field1559.method785(true);
                int var82 = class85.field1559.method819((byte) 22);
                int var83 = class85.field1559.method785(true);
                if (var80 >= 0 && var79 >= 0 && var80 < 104 && var79 < 104) {
                    int var84 = var79 * 128 + 64;
                    int var85 = var80 * 128 + 64;
                    class192 var86 = new class192(var81, class61.field1132, var85, var84, class183.method1215(var85, class61.field1132, var84, 0) - var82, var83, class162.field3107);
                    class182.field3549.method149(arg0 ^ 0x44B3B562, var86);
                }
            } else {
                if (class86.field1571 == 31) {
                    int var87 = class85.field1559.method819((byte) 22);
                    int var88 = (var87 >> 4 & 0x7) + class17.field377;
                    int var89 = (var87 & 0x7) + class94.field1761;
                    int var90 = class85.field1559.method785(true);
                    int var91 = class85.field1559.method819((byte) 22);
                    int var92 = var91 >> 4 & 0xF;
                    int var93 = class85.field1559.method819((byte) 22);
                    int var94 = var91 & 0x7;
                    if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                        int var95 = var92 + 1;
                        if (var88 - var95 <= class4.field79.field3734[0] && class4.field79.field3734[0] <= var88 + var95 && var89 - var95 <= class4.field79.field3729[0] && var89 + var95 >= class4.field79.field3729[0] && class20.field435 != 0 && var94 > 0 && class103.field1886 < 50) {
                            class118.field2200[class103.field1886] = var90;
                            class66.field1245[class103.field1886] = var94;
                            class158.field3031[class103.field1886] = var93;
                            class51.field894[class103.field1886] = null;
                            class90.field1640[class103.field1886] = (var88 << 16) + (var89 << 8) + var92;
                            class103.field1886++;
                        }
                    }
                }
                if (class86.field1571 == 124) {
                    int var96 = class85.field1559.method809((byte) -125);
                    int var97 = (var96 >> 4 & 0x7) + class17.field377;
                    int var98 = (var96 & 0x7) + class94.field1761;
                    int var99 = class85.field1559.method819((byte) 22);
                    int var100 = var99 & 0x3;
                    int var101 = var99 >> 2;
                    int var102 = class192.field3800[var101];
                    int var103 = class85.field1559.method811(14811);
                    if (var97 >= 0 && var98 >= 0 && var97 < 103 && var98 < 103) {
                        if (var102 == 0) {
                            class5 var104 = class196.field3840.method897(class61.field1132, var97, var98);
                            if (var104 != null) {
                                int var105 = var104.field109 >> 14 & 0x7FFF;
                                if (var101 == 2) {
                                    var104.field103 = new class162(var105, 2, var100 + 4, class61.field1132, var97, var98, var103, false, var104.field103);
                                    var104.field99 = new class162(var105, 2, var100 + 1 & 0x3, class61.field1132, var97, var98, var103, false, var104.field99);
                                } else {
                                    var104.field103 = new class162(var105, var101, var100, class61.field1132, var97, var98, var103, false, var104.field103);
                                }
                            }
                        }
                        if (var102 == 1) {
                            class129 var106 = class196.field3840.method893(class61.field1132, var97, var98);
                            if (var106 != null) {
                                int var107 = var106.field2411 >> 14 & 0x7FFF;
                                if (var101 == 4 || var101 == 5) {
                                    var106.field2412 = new class162(var107, 4, var100, class61.field1132, var97, var98, var103, false, var106.field2412);
                                } else if (var101 == 6) {
                                    var106.field2412 = new class162(var107, 4, var100 + 4, class61.field1132, var97, var98, var103, false, var106.field2412);
                                } else if (var101 == 7) {
                                    var106.field2412 = new class162(var107, 4, (var100 + 2 & 0x3) + 4, class61.field1132, var97, var98, var103, false, var106.field2412);
                                } else if (var101 == 8) {
                                    var106.field2412 = new class162(var107, 4, var100 + 4, class61.field1132, var97, var98, var103, false, var106.field2412);
                                    var106.field2416 = new class162(var107, 4, (var100 + 2 & 0x3) + 4, class61.field1132, var97, var98, var103, false, var106.field2416);
                                }
                            }
                        }
                        if (var102 == 2) {
                            class141 var108 = class196.field3840.method892(class61.field1132, var97, var98);
                            if (var101 == 11) {
                                var101 = 10;
                            }
                            if (var108 != null) {
                                var108.field2634 = new class162(var108.field2625 >> 14 & 0x7FFF, var101, var100, class61.field1132, var97, var98, var103, false, var108.field2634);
                            }
                        }
                        if (var102 == 3) {
                            class154 var109 = class196.field3840.method868(class61.field1132, var97, var98);
                            if (var109 != null) {
                                var109.field2958 = new class162(var109.field2961 >> 14 & 0x7FFF, 22, var100, class61.field1132, var97, var98, var103, false, var109.field2958);
                            }
                        }
                    }
                } else if (class86.field1571 == 15) {
                    int var110 = class85.field1559.method819((byte) 22);
                    int var111 = class17.field377 + (var110 >> 4 & 0x7);
                    int var112 = (var110 & 0x7) + class94.field1761;
                    int var113 = class85.field1559.method795((byte) 26);
                    if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
                        class22 var114 = class60.field1112[class61.field1132][var111][var112];
                        if (var114 != null) {
                            for (class145 var115 = (class145) var114.method145(arg0 ^ 0x44B3B562); var115 != null; var115 = (class145) var114.method152((byte) -128)) {
                                if ((var113 & 0x7FFF) == var115.field2691) {
                                    var115.method1213(9104);
                                    break;
                                }
                            }
                            if (var114.method145(0) == null) {
                                class60.field1112[class61.field1132][var111][var112] = null;
                            }
                            class206.method1345(var111, var112, false);
                        }
                    }
                } else if (class86.field1571 == 67) {
                    int var116 = class85.field1559.method795((byte) 26);
                    int var117 = class85.field1559.method827((byte) 43);
                    int var118 = class85.field1559.method811(14811);
                    int var119 = class85.field1559.method784(arg0 ^ 0x44B3B51C);
                    int var120 = (var119 & 0x7) + class94.field1761;
                    int var121 = (var119 >> 4 & 0x7) + class17.field377;
                    if (var121 >= 0 && var120 >= 0 && var121 < 104 && var120 < 104 && class206.field4041 != var118) {
                        class145 var122 = new class145();
                        var122.field2691 = var116;
                        var122.field2694 = var117;
                        if (class60.field1112[class61.field1132][var121][var120] == null) {
                            class60.field1112[class61.field1132][var121][var120] = new class22();
                        }
                        class60.field1112[class61.field1132][var121][var120].method149(0, var122);
                        class206.method1345(var121, var120, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static void method184(int arg0) {
        field533 = null;
        field548 = null;
        field546 = null;
        field535 = null;
        if (arg0 > -102) {
            method185(-79, -67, -114);
        }
        field549 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)I")
    public static final int method185(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field550 = -35;
        }
        if (arg1 < arg2) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        field536++;
        return arg1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B[Lqf;IIIIIII)V")
    public static final void method186(byte arg0, class150[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field540++;
        for (int var9 = 0; var9 < arg1.length; var9++) {
            class150 var10 = arg1[var9];
            if (var10 != null && (!var10.field2778 || var10.field2882 == 0 || var10.field2818 || class70.method436(var10, -105) != 0 || class180.field3498 == var10) && var10.field2893 == arg4 && (!var10.field2778 || !class187.method1233(var10, 0))) {
                int var11 = var10.field2805 + arg3;
                int var12 = var10.field2903 + arg5;
                if (class37.field726 == var10) {
                    class155.field2983 = var11;
                    class58.field1098 = var12;
                    class63.field1169 = true;
                }
                int var13;
                int var14;
                int var15;
                int var16;
                if (var10.field2882 == 2) {
                    var13 = arg8;
                    var14 = arg6;
                    var15 = arg7;
                    var16 = arg2;
                } else if (var10.field2882 == 9) {
                    int var17 = var11;
                    int var18 = var12;
                    int var19 = var10.field2875 + var11;
                    if (var11 > var19) {
                        var17 = var19;
                        var19 = var11;
                    }
                    int var21 = var12 + var10.field2770;
                    if (var12 > var21) {
                        var18 = var21;
                        var21 = var12;
                    }
                    var19++;
                    var21++;
                    var14 = arg6 > var19 ? var19 : arg6;
                    var15 = var17 <= arg7 ? arg7 : var17;
                    var16 = var21 < arg2 ? var21 : arg2;
                    var13 = var18 <= arg8 ? arg8 : var18;
                } else {
                    var15 = var11 <= arg7 ? arg7 : var11;
                    var13 = arg8 < var12 ? var12 : arg8;
                    int var23 = var10.field2875 + var11;
                    var14 = arg6 > var23 ? var23 : arg6;
                    int var24 = var10.field2770 + var12;
                    var16 = arg2 <= var24 ? arg2 : var24;
                }
                if (!var10.field2778 || var15 < var14 && var13 < var16) {
                    if (var10.field2872 == 1337) {
                        class64.method404(92, var10);
                    } else if (var10.field2872 == 1338) {
                        class89.method525(var12, var11, -28010);
                    } else {
                        if (var10.field2882 == 0) {
                            if (!var10.field2778 && class187.method1233(var10, 0) && class129.field2419 != var10) {
                                continue;
                            }
                            method186((byte) 73, arg1, var16, var11 - var10.field2860, var10.field2878, var12 - var10.field2811, var14, var15, var13);
                            if (var10.field2784 != null) {
                                method186((byte) 65, var10.field2784, var16, var11 - var10.field2860, var10.field2878, var12 - var10.field2811, var14, var15, var13);
                            }
                            class80 var25 = (class80) class202.field3948.method1045((long) var10.field2878, (byte) -77);
                            if (var25 != null) {
                                class125.method768(var13, var11, var16, (byte) -88, var25.field1475, var15, var12, var14);
                            }
                        }
                        if (var10.field2778) {
                            boolean var26;
                            if (class22.field459 >= var15 && class150.field2806 >= var13 && class22.field459 < var14 && var16 > class150.field2806) {
                                var26 = true;
                            } else {
                                var26 = false;
                            }
                            boolean var27 = false;
                            if (class32.field684 == 1 && var26) {
                                var27 = true;
                            }
                            boolean var28 = false;
                            if (class56.field1040 == 1 && class178.field3480 >= var15 && var13 <= class42.field796 && var14 > class178.field3480 && var16 > class42.field796) {
                                var28 = true;
                            }
                            if (var28) {
                                class131.method858(class42.field796 - var12, -var11 + class178.field3480, var10, (byte) -104);
                            }
                            if (class37.field726 != null && class37.field726 != var10 && var26 && class90.method526(class70.method436(var10, -113), (byte) -107)) {
                                class126.field2304 = var10;
                            }
                            if (class180.field3498 == var10) {
                                class56.field1024 = true;
                                class64.field1189 = var12;
                                class69.field1291 = var11;
                            }
                            if (var10.field2818) {
                                if (var26 && class115.field2118 != 0 && var10.field2881 != null) {
                                    class200 var29 = new class200();
                                    var29.field3911 = var10.field2881;
                                    var29.field3904 = class115.field2118;
                                    var29.field3907 = var10;
                                    class190.field3753.method149(0, var29);
                                }
                                if (class37.field726 != null || class171.field3307 != null || class189.field3707) {
                                    var27 = false;
                                    var26 = false;
                                    var28 = false;
                                }
                                if (!var10.field2776 && var28) {
                                    var10.field2776 = true;
                                    if (var10.field2867 != null) {
                                        class200 var30 = new class200();
                                        var30.field3913 = class178.field3480 - var11;
                                        var30.field3911 = var10.field2867;
                                        var30.field3907 = var10;
                                        var30.field3904 = class42.field796 - var12;
                                        class190.field3753.method149(0, var30);
                                    }
                                }
                                if (var10.field2776 && var27 && var10.field2853 != null) {
                                    class200 var31 = new class200();
                                    var31.field3911 = var10.field2853;
                                    var31.field3907 = var10;
                                    var31.field3904 = class150.field2806 - var12;
                                    var31.field3913 = class22.field459 - var11;
                                    class190.field3753.method149(0, var31);
                                }
                                if (var10.field2776 && !var27) {
                                    var10.field2776 = false;
                                    if (var10.field2895 != null) {
                                        class200 var32 = new class200();
                                        var32.field3907 = var10;
                                        var32.field3904 = class150.field2806 - var12;
                                        var32.field3913 = class22.field459 - var11;
                                        var32.field3911 = var10.field2895;
                                        class199.field3890.method149(0, var32);
                                    }
                                }
                                if (var27 && var10.field2845 != null) {
                                    class200 var33 = new class200();
                                    var33.field3904 = class150.field2806 - var12;
                                    var33.field3907 = var10;
                                    var33.field3913 = class22.field459 - var11;
                                    var33.field3911 = var10.field2845;
                                    class190.field3753.method149(0, var33);
                                }
                                if (!var10.field2812 && var26) {
                                    var10.field2812 = true;
                                    if (var10.field2785 != null) {
                                        class200 var34 = new class200();
                                        var34.field3907 = var10;
                                        var34.field3904 = class150.field2806 - var12;
                                        var34.field3913 = class22.field459 - var11;
                                        var34.field3911 = var10.field2785;
                                        class190.field3753.method149(0, var34);
                                    }
                                }
                                if (var10.field2812 && var26 && var10.field2894 != null) {
                                    class200 var35 = new class200();
                                    var35.field3904 = class150.field2806 - var12;
                                    var35.field3907 = var10;
                                    var35.field3911 = var10.field2894;
                                    var35.field3913 = class22.field459 - var11;
                                    class190.field3753.method149(0, var35);
                                }
                                if (var10.field2812 && !var26) {
                                    var10.field2812 = false;
                                    if (var10.field2787 != null) {
                                        class200 var36 = new class200();
                                        var36.field3907 = var10;
                                        var36.field3911 = var10.field2787;
                                        var36.field3904 = class150.field2806 - var12;
                                        var36.field3913 = class22.field459 - var11;
                                        class199.field3890.method149(0, var36);
                                    }
                                }
                                if (var10.field2780 != null) {
                                    class200 var37 = new class200();
                                    var37.field3907 = var10;
                                    var37.field3911 = var10.field2780;
                                    class87.field1601.method149(0, var37);
                                }
                                if (var10.field2777 != null && class118.field2202 > var10.field2862) {
                                    if (var10.field2861 == null || class118.field2202 - var10.field2862 > 32) {
                                        class200 var42 = new class200();
                                        var42.field3907 = var10;
                                        var42.field3911 = var10.field2777;
                                        class190.field3753.method149(0, var42);
                                    } else {
                                        label385: for (int var38 = var10.field2862; var38 < class118.field2202; var38++) {
                                            int var39 = class68.field1282[var38 & 0x1F];
                                            for (int var40 = 0; var40 < var10.field2861.length; var40++) {
                                                if (var10.field2861[var40] == var39) {
                                                    class200 var41 = new class200();
                                                    var41.field3907 = var10;
                                                    var41.field3911 = var10.field2777;
                                                    class190.field3753.method149(0, var41);
                                                    break label385;
                                                }
                                            }
                                        }
                                    }
                                    var10.field2862 = class118.field2202;
                                }
                                if (var10.field2797 != null && var10.field2783 < class189.field3676) {
                                    if (var10.field2885 == null || class189.field3676 - var10.field2783 > 32) {
                                        class200 var47 = new class200();
                                        var47.field3911 = var10.field2797;
                                        var47.field3907 = var10;
                                        class190.field3753.method149(0, var47);
                                    } else {
                                        label365: for (int var43 = var10.field2783; var43 < class189.field3676; var43++) {
                                            int var44 = class137.field2545[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var10.field2885.length; var45++) {
                                                if (var10.field2885[var45] == var44) {
                                                    class200 var46 = new class200();
                                                    var46.field3911 = var10.field2797;
                                                    var46.field3907 = var10;
                                                    class190.field3753.method149(0, var46);
                                                    break label365;
                                                }
                                            }
                                        }
                                    }
                                    var10.field2783 = class189.field3676;
                                }
                                if (var10.field2823 != null && class66.field1244 > var10.field2779) {
                                    if (var10.field2795 == null || class66.field1244 - var10.field2779 > 32) {
                                        class200 var52 = new class200();
                                        var52.field3907 = var10;
                                        var52.field3911 = var10.field2823;
                                        class190.field3753.method149(0, var52);
                                    } else {
                                        label345: for (int var48 = var10.field2779; var48 < class66.field1244; var48++) {
                                            int var49 = class2.field41[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var10.field2795.length; var50++) {
                                                if (var10.field2795[var50] == var49) {
                                                    class200 var51 = new class200();
                                                    var51.field3911 = var10.field2823;
                                                    var51.field3907 = var10;
                                                    class190.field3753.method149(0, var51);
                                                    break label345;
                                                }
                                            }
                                        }
                                    }
                                    var10.field2779 = class66.field1244;
                                }
                                if (class8.field222 > var10.field2826 && var10.field2857 != null) {
                                    class200 var53 = new class200();
                                    var53.field3911 = var10.field2857;
                                    var53.field3907 = var10;
                                    class190.field3753.method149(0, var53);
                                }
                                if (class8.field215 > var10.field2826 && var10.field2876 != null) {
                                    class200 var54 = new class200();
                                    var54.field3907 = var10;
                                    var54.field3911 = var10.field2876;
                                    class190.field3753.method149(0, var54);
                                }
                                if (class11.field270 > var10.field2826 && var10.field2840 != null) {
                                    class200 var55 = new class200();
                                    var55.field3911 = var10.field2840;
                                    var55.field3907 = var10;
                                    class190.field3753.method149(0, var55);
                                }
                                if (var10.field2826 < class143.field2670 && var10.field2839 != null) {
                                    class200 var56 = new class200();
                                    var56.field3911 = var10.field2839;
                                    var56.field3907 = var10;
                                    class190.field3753.method149(0, var56);
                                }
                                if (var10.field2826 < class69.field1298 && var10.field2831 != null) {
                                    class200 var57 = new class200();
                                    var57.field3907 = var10;
                                    var57.field3911 = var10.field2831;
                                    class190.field3753.method149(0, var57);
                                }
                                var10.field2826 = class58.field1078;
                                if (var10.field2799 != null) {
                                    for (int var58 = 0; var58 < class32.field679; var58++) {
                                        class200 var59 = new class200();
                                        var59.field3907 = var10;
                                        var59.field3908 = class54.field991[var58];
                                        var59.field3901 = class107.field1961[var58];
                                        var59.field3911 = var10.field2799;
                                        class190.field3753.method149(0, var59);
                                    }
                                }
                            }
                        }
                        if (!var10.field2778) {
                            if (class37.field726 != null || class171.field3307 != null || class189.field3707) {
                                return;
                            }
                            if ((var10.field2817 >= 0 || var10.field2852 != 0) && var15 <= class22.field459 && class150.field2806 >= var13 && var14 > class22.field459 && var16 > class150.field2806) {
                                if (var10.field2817 >= 0) {
                                    class129.field2419 = arg1[var10.field2817];
                                } else {
                                    class129.field2419 = var10;
                                }
                            }
                            if (var10.field2882 == 8 && var15 <= class22.field459 && var13 <= class150.field2806 && class22.field459 < var14 && var16 > class150.field2806) {
                                class9.field236 = var10;
                            }
                            if (var10.field2770 < var10.field2837) {
                                class41.method267(var10, var10.field2875 + var11, class22.field459, var12, var10.field2837, class150.field2806, (byte) -127, var10.field2770);
                            }
                        }
                    }
                }
            }
        }
        if (arg0 <= 59) {
            field546 = null;
        }
    }
}
