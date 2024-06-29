import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class106 {

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public int field2672 = 0;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public int field2681 = 0;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "La;")
    public static class1 field2662 = class113.method934(-11538, "@whi@ )4 ");

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public static int field2676 = 0;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "La;")
    public static class1 field2665 = class113.method934(-11538, " hat sich ausgeloggt)3");

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "La;")
    private static class1 field2679 = class113.method934(-11538, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "La;")
    public static class1 field2682 = class113.method934(-11538, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "La;")
    private static class1 field2674 = class113.method934(-11538, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "La;")
    public static class1 field2678 = field2679;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "La;")
    public static class1 field2670 = field2674;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Lcb;")
    public static class15 field2666 = new class15(64);

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "Lcb;")
    public static class15 field2683 = new class15(50);

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "La;")
    public static class1 field2685 = class113.method934(-11538, "backright2");

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "[J")
    public static long[] field2686 = new long[100];

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "La;")
    public static class1 field2684 = class113.method934(-11538, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "La;")
    public static class1 field2688 = class113.method934(-11538, "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>");

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public int field2661;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public int field2663;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public int field2671;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public int field2673;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public int field2680;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "Lbc;")
    public static class10 field2687;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Lvb;")
    public class128 field2668;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "Le;")
    public static class25 field2689;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V", line = 6)
    public static final void method889(byte arg0) {
        field2675++;
        if (class112.field2764 == 49) {
            int var1 = class15.field489.method153(255);
            int var2 = (var1 & 0x7) + class34.field894;
            int var3 = (var1 >> 4 & 0x7) + class57.field1474;
            int var4 = class15.field489.method153(255);
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = class130.field3189[var5];
            int var8 = class15.field489.method181(false);
            if (var3 >= 0 && var2 >= 0 && var3 < 103 && var2 < 103) {
                int var9 = class57.field1454[class2.field76][var3][var2];
                int var10 = class57.field1454[class2.field76][var3 + 1][var2];
                int var11 = class57.field1454[class2.field76][var3 + 1][var2 + 1];
                int var12 = class57.field1454[class2.field76][var3][var2 + 1];
                if (var7 == 0) {
                    class17 var13 = class130.field3186.method83(class2.field76, var3, var2);
                    if (var13 != null) {
                        int var14 = var13.field532 >> 14 & 0x7FFF;
                        if (var5 == 2) {
                            var13.field537 = new class54(var14, 2, var6 + 4, var9, var10, var11, var12, var8, false);
                            var13.field536 = new class54(var14, 2, var6 + 1 & 0x3, var9, var10, var11, var12, var8, false);
                        } else {
                            var13.field537 = new class54(var14, var5, var6, var9, var10, var11, var12, var8, false);
                        }
                    }
                }
                if (var7 == 1) {
                    class106 var15 = class130.field3186.method57(class2.field76, var3, var2);
                    if (var15 != null) {
                        var15.field2668 = new class54(var15.field2681 >> 14 & 0x7FFF, 4, 0, var9, var10, var11, var12, var8, false);
                    }
                }
                if (var7 == 2) {
                    class37 var16 = class130.field3186.method64(class2.field76, var3, var2);
                    if (var5 == 11) {
                        var5 = 10;
                    }
                    if (var16 != null) {
                        var16.field986 = new class54(var16.field981 >> 14 & 0x7FFF, var5, var6, var9, var10, var11, var12, var8, false);
                    }
                }
                if (var7 == 3) {
                    class52 var17 = class130.field3186.method90(class2.field76, var3, var2);
                    if (var17 != null) {
                        var17.field1376 = new class54(var17.field1364 >> 14 & 0x7FFF, 22, var6, var9, var10, var11, var12, var8, false);
                    }
                }
            }
        } else if (class112.field2764 == 241) {
            int var18 = class15.field489.method148((byte) 124);
            int var19 = var18 & 0x3;
            int var20 = var18 >> 2;
            int var21 = class130.field3189[var20];
            int var22 = class15.field489.method146(65280);
            int var23 = class15.field489.method153(255);
            int var24 = (var23 & 0x7) + class34.field894;
            int var25 = (var23 >> 4 & 0x7) + class57.field1474;
            if (var25 >= 0 && var24 >= 0 && var25 < 104 && var24 < 104) {
                class49.method516(var22, true, var25, var19, -1, class2.field76, var24, var21, var20, 0);
            }
        } else {
            if (class112.field2764 == 9) {
                int var26 = class15.field489.method145(false);
                int var27 = (var26 & 0x7) + class34.field894;
                int var28 = (var26 >> 4 & 0x7) + class57.field1474;
                int var29 = class15.field489.method146(65280);
                int var30 = class15.field489.method145(false);
                int var31 = var30 >> 4 & 0xF;
                int var32 = var30 & 0x7;
                int var33 = class15.field489.method145(false);
                if (var28 >= 0 && var27 >= 0 && var28 < 104 && var27 < 104) {
                    int var34 = var31 + 1;
                    if (var28 - var34 <= class104.field2624.field1965[0] && var28 + var34 >= class104.field2624.field1965[0] && var27 - var34 <= class104.field2624.field2012[0] && var27 + var34 >= class104.field2624.field2012[0] && class62.field1562 != 0 && var32 > 0 && class36.field966 < 50) {
                        class95.field2372[class36.field966] = var29;
                        class115.field2848[class36.field966] = var32;
                        class22.field685[class36.field966] = var33;
                        class36.field956[class36.field966] = null;
                        class60.field1524[class36.field966] = (var27 << 8) + (var28 << 16) + var31;
                        class36.field966++;
                    }
                }
            }
            if (class112.field2764 == 202) {
                int var35 = class15.field489.method145(false);
                int var36 = (var35 >> 4 & 0x7) + class57.field1474;
                int var37 = class34.field894 + (var35 & 0x7);
                int var38 = class15.field489.method146(65280);
                int var39 = class15.field489.method145(false);
                int var40 = class15.field489.method146(65280);
                if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                    int var41 = var37 * 128 + 64;
                    int var42 = var36 * 128 + 64;
                    class116 var43 = new class116(var38, class2.field76, var42, var41, class78.method715((byte) -124, class2.field76, var42, var41) - var39, var40, class82.field2066);
                    class112.field2759.method807(var43, -111);
                }
            } else if (class112.field2764 == 99) {
                int var44 = class15.field489.method145(false);
                int var45 = (var44 >> 4 & 0x7) + class57.field1474;
                int var46 = (var44 & 0x7) + class34.field894;
                int var47 = class15.field489.method146(65280);
                int var48 = class15.field489.method146(65280);
                int var49 = class15.field489.method146(65280);
                if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                    class92 var50 = class17.field553[class2.field76][var45][var46];
                    if (var50 != null) {
                        for (class59 var51 = (class59) var50.method805((byte) -90); var51 != null; var51 = (class59) var50.method812(-4)) {
                            if ((var47 & 0x7FFF) == var51.field1502 && var51.field1493 == var48) {
                                var51.field1493 = var49;
                                break;
                            }
                        }
                        class127.method1014((byte) -80, var46, var45);
                    }
                }
            } else if (class112.field2764 == 143) {
                int var52 = class15.field489.method153(255);
                int var53 = class34.field894 + (var52 & 0x7);
                int var54 = class57.field1474 + (var52 >> 4 & 0x7);
                int var55 = class15.field489.method148((byte) 122);
                int var56 = var55 & 0x3;
                int var57 = var55 >> 2;
                int var58 = class130.field3189[var57];
                if (var54 >= 0 && var53 >= 0 && var54 < 104 && var53 < 104) {
                    class49.method516(-1, true, var54, var56, -1, class2.field76, var53, var58, var57, 0);
                }
            } else {
                if (class112.field2764 == 229) {
                    byte var59 = class15.field489.method172(-82);
                    int var60 = class15.field489.method138((byte) 75);
                    byte var61 = class15.field489.method185(124);
                    byte var62 = class15.field489.method185(109);
                    int var63 = class15.field489.method153(255);
                    int var64 = var63 & 0x3;
                    int var65 = var63 >> 2;
                    int var66 = class130.field3189[var65];
                    int var67 = class15.field489.method157((byte) -70);
                    int var68 = (var67 & 0x7) + class34.field894;
                    int var69 = class57.field1474 + (var67 >> 4 & 0x7);
                    int var70 = class15.field489.method146(65280);
                    byte var71 = class15.field489.method144((byte) 19);
                    int var72 = class15.field489.method167((byte) -70);
                    int var73 = class15.field489.method181(false);
                    class2 var74;
                    if (class67.field1686 == var60) {
                        var74 = class104.field2624;
                    } else {
                        var74 = class80.field2033[var60];
                    }
                    if (var74 != null) {
                        class49 var75 = class32.method390(var72, (byte) 125);
                        int var76 = class57.field1454[class2.field76][var69][var68];
                        int var77 = class57.field1454[class2.field76][var69][var68 + 1];
                        int var78 = class57.field1454[class2.field76][var69 + 1][var68 + 1];
                        int var79 = class57.field1454[class2.field76][var69 + 1][var68];
                        class91 var80 = var75.method507(var78, var77, var64, var76, var65, (byte) 124, var79);
                        if (var80 != null) {
                            if (var59 < var71) {
                                byte var81 = var71;
                                var71 = var59;
                                var59 = var81;
                            }
                            if (var61 < var62) {
                                byte var82 = var62;
                                var62 = var61;
                                var61 = var82;
                            }
                            class49.method516(-1, true, var69, 0, var73 + 1, class2.field76, var68, var66, 0, var70 + 1);
                            var74.field83 = class82.field2066 + var73;
                            int var83 = var75.field1288;
                            var74.field74 = var80;
                            var74.field92 = class82.field2066 + var70;
                            int var84 = var75.field1300;
                            if (var64 == 1 || var64 == 3) {
                                var84 = var75.field1288;
                                var83 = var75.field1300;
                            }
                            var74.field80 = var69 * 128 + var83 * 64;
                            var74.field100 = var68 * 128 + var84 * 64;
                            var74.field81 = class78.method715((byte) -127, class2.field76, var74.field80, var74.field100);
                            var74.field90 = var62 + var68;
                            var74.field67 = var69 + var71;
                            var74.field71 = var69 + var59;
                            var74.field98 = var61 + var68;
                        }
                    }
                }
                if (class112.field2764 == 74) {
                    int var85 = class15.field489.method145(false);
                    int var86 = (var85 >> 4 & 0x7) + class57.field1474;
                    int var87 = (var85 & 0x7) + class34.field894;
                    int var88 = class15.field489.method138((byte) 60);
                    if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104) {
                        class92 var89 = class17.field553[class2.field76][var86][var87];
                        if (var89 != null) {
                            for (class59 var90 = (class59) var89.method805((byte) -90); var90 != null; var90 = (class59) var89.method812(-4)) {
                                if ((var88 & 0x7FFF) == var90.field1502) {
                                    var90.method742(-1);
                                    break;
                                }
                            }
                            if (var89.method805((byte) -90) == null) {
                                class17.field553[class2.field76][var86][var87] = null;
                            }
                            class127.method1014((byte) -80, var87, var86);
                        }
                    }
                } else if (class112.field2764 == 1) {
                    int var91 = class15.field489.method145(false);
                    int var92 = (var91 & 0x7) + class34.field894;
                    int var93 = class57.field1474 + (var91 >> 4 & 0x7);
                    int var94 = var93 + class15.field489.method185(100);
                    int var95 = var92 + class15.field489.method185(124);
                    int var96 = class15.field489.method140((byte) -109);
                    int var97 = class15.field489.method146(65280);
                    int var98 = class15.field489.method145(false) * 4;
                    int var99 = class15.field489.method145(false) * 4;
                    int var100 = class15.field489.method146(65280);
                    int var101 = class15.field489.method146(65280);
                    int var102 = class15.field489.method145(false);
                    int var103 = class15.field489.method145(false);
                    if (var93 >= 0 && var92 >= 0 && var93 < 104 && var92 < 104 && var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104 && var97 != 65535) {
                        int var104 = var94 * 128 + 64;
                        int var105 = var93 * 128 + 64;
                        int var106 = var92 * 128 + 64;
                        class19 var107 = new class19(var97, class2.field76, var105, var106, class78.method715((byte) -121, class2.field76, var105, var106) - var98, var100 - -class82.field2066, var101 + class82.field2066, var102, var103, var96, var99);
                        int var108 = var95 * 128 + 64;
                        var107.method301(class82.field2066 + var100, 0, var108, class78.method715((byte) -124, class2.field76, var104, var108) - var99, var104);
                        class86.field2163.method807(var107, -73);
                    }
                } else {
                    if (arg0 >= -110) {
                        method892(32);
                    }
                    if (class112.field2764 == 19) {
                        int var109 = class15.field489.method181(false);
                        int var110 = class15.field489.method181(false);
                        int var111 = class15.field489.method146(65280);
                        int var112 = class15.field489.method153(255);
                        int var113 = (var112 >> 4 & 0x7) + class57.field1474;
                        int var114 = (var112 & 0x7) + class34.field894;
                        if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104 && class67.field1686 != var110) {
                            class59 var115 = new class59();
                            var115.field1502 = var111;
                            var115.field1493 = var109;
                            if (class17.field553[class2.field76][var113][var114] == null) {
                                class17.field553[class2.field76][var113][var114] = new class92();
                            }
                            class17.field553[class2.field76][var113][var114].method807(var115, 64);
                            class127.method1014((byte) -80, var114, var113);
                        }
                    } else if (class112.field2764 == 175) {
                        int var116 = class15.field489.method167((byte) -70);
                        int var117 = class15.field489.method146(65280);
                        int var118 = class15.field489.method145(false);
                        int var119 = (var118 & 0x7) + class34.field894;
                        int var120 = (var118 >> 4 & 0x7) + class57.field1474;
                        if (var120 >= 0 && var119 >= 0 && var120 < 104 && var119 < 104) {
                            class59 var121 = new class59();
                            var121.field1493 = var117;
                            var121.field1502 = var116;
                            if (class17.field553[class2.field76][var120][var119] == null) {
                                class17.field553[class2.field76][var120][var119] = new class92();
                            }
                            class17.field553[class2.field76][var120][var119].method807(var121, -118);
                            class127.method1014((byte) -80, var119, var120);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBII)V", line = 546)
    public static final void method890(int arg0, byte arg1, int arg2, int arg3) {
        if (class9.field323 != 0 && arg2 != 0 && class36.field966 < 50) {
            class95.field2372[class36.field966] = arg0;
            class115.field2848[class36.field966] = arg2;
            class22.field685[class36.field966] = arg3;
            class36.field956[class36.field966] = null;
            class60.field1524[class36.field966] = 0;
            class36.field966++;
        }
        field2667++;
        if (arg1 <= 24) {
            field2666 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILbc;Lbc;)V", line = 585)
    public static final void method891(int arg0, class10 arg1, class10 arg2) {
        class79.field1938.method1057((byte) 90);
        field2664++;
        if (class103.field2602 == 0 || class103.field2602 == 5) {
            byte var3 = 20;
            arg1.method210(class98.field2408, 180, 74 - var3, 16777215);
            int var4 = 82 - var3;
            class111.method925(28, var4, 304, 34, 9179409);
            class111.method925(29, var4 + 1, 302, 32, 0);
            class111.method916(30, var4 + 2, class133.field3277 * 3, 30, 9179409);
            class111.method916(class133.field3277 * 3 + 30, var4 - -2, 300 - class133.field3277 * 3, 30, 0);
            arg1.method210(class123.field3082, 180, 105 - var3, 16777215);
        }
        if (class103.field2602 == 20) {
            byte var5 = 40;
            class114.field2809.method330(0, 0);
            arg1.method212(class123.field3063, 180, var5, 16776960, true);
            int var19 = var5 + 15;
            arg1.method212(class123.field3080, 180, var19, 16776960, true);
            int var20 = var19 + 15;
            arg1.method212(class123.field3065, 180, var20, 16776960, true);
            int var21 = var20 + 15;
            int var22 = var21 + 10;
            arg1.method207(class116.method959(126, new class1[] { class121.field3005, class123.field3074 }), 90, var22, 16777215, true);
            int var24 = var22 + 15;
            arg1.method207(class116.method959(-121, new class1[] { class38.field1038, class123.field3058.method12(false) }), 92, var24, 16777215, true);
            int var26 = var24 + 15;
        }
        if (class103.field2602 == 10) {
            class114.field2809.method330(0, 0);
            if (class53.field1398 == 0) {
                byte var13 = 80;
                byte var14 = 100;
                arg1.method212(client.field583, 180, var13, 16776960, true);
                int var34 = var13 + 30;
                byte var15 = 120;
                class117.field2922.method330(var14 - 73, var15 - 20);
                arg1.method196(class105.field2642, var14 - 73, var15 + -20, 144, 40, 16777215, true, 1, 1, 0);
                short var16 = 260;
                class117.field2922.method330(var16 - 73, var15 + -20);
                arg1.method196(class85.field2152, var16 - 73, var15 + -20, 144, 40, 16777215, true, 1, 1, 0);
            } else if (class53.field1398 == 2) {
                byte var6 = 40;
                byte var7 = 100;
                arg1.method212(class123.field3063, 180, var6, 16776960, true);
                int var23 = var6 + 15;
                short var8 = 150;
                arg1.method212(class123.field3080, 180, var23, 16776960, true);
                int var25 = var23 + 15;
                arg1.method212(class123.field3065, 180, var25, 16776960, true);
                int var27 = var25 + 15;
                int var28 = var27 + 10;
                arg1.method207(class116.method959(-113, new class1[] { class121.field3005, class123.field3074, class82.field2066 % 40 < 20 & class82.field2087 == 0 ? class46.field1206 : class123.field3070 }), 90, var28, 16777215, true);
                int var29 = var28 + 15;
                arg1.method207(class116.method959(arg0 + 18924, new class1[] { class38.field1038, class123.field3058.method12(false), class82.field2066 % 40 < 20 & class82.field2087 == 1 ? class46.field1206 : class123.field3070 }), 92, var29, 16777215, true);
                class117.field2922.method330(var7 - 73, var8 + -20);
                int var30 = var29 + 15;
                arg1.method212(class35.field927, var7, var8 + 5, 16777215, true);
                short var9 = 260;
                class117.field2922.method330(var9 - 73, var8 + -20);
                arg1.method212(class134.field3305, var9, var8 + 5, 16777215, true);
            } else if (class53.field1398 == 3) {
                arg1.method212(class133.field3268, 180, 40, 16776960, true);
                short var10 = 180;
                short var11 = 150;
                byte var12 = 65;
                arg1.method212(class112.field2760, 180, var12, 16777215, true);
                int var31 = var12 + 15;
                arg1.method212(field2678, 180, var31, 16777215, true);
                int var32 = var31 + 15;
                arg1.method212(field2670, 180, var32, 16777215, true);
                int var33 = var32 + 15;
                arg1.method212(class97.field2403, 180, var33, 16777215, true);
                class117.field2922.method330(var10 - 73, var11 - 20);
                arg1.method212(class134.field3305, var10, var11 + 5, 16777215, true);
                int var35 = var33 + 15;
            }
        }
        client.method282(0);
        try {
            Graphics var17 = class122.field3052.getGraphics();
            class79.field1938.method102(0, 202, var17, 171);
            if (arg0 != -19010) {
                method889((byte) 41);
            }
            class14.field473.method102(arg0 ^ 0xFFFFB5BE, 0, var17, 0);
            class54.field1438.method102(0, 637, var17, 0);
            if (class97.field2405) {
                class97.field2405 = false;
                class81.field2047.method102(0, 128, var17, 0);
                class103.field2611.method102(0, 202, var17, 371);
                class31.field845.method102(0, 0, var17, 265);
                class107.field2704.method102(0, 562, var17, 265);
                class49.field1309.method102(0, 128, var17, 171);
                class134.field3301.method102(0, 562, var17, 171);
            }
        } catch (Exception var18) {
            class122.field3052.repaint();
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 724)
    public static void method892(int arg0) {
        field2689 = null;
        field2687 = null;
        field2666 = null;
        field2662 = null;
        field2670 = null;
        field2665 = null;
        field2684 = null;
        field2688 = null;
        field2685 = null;
        field2674 = null;
        if (arg0 != 0) {
            method890(-77, (byte) 57, -36, 56);
        }
        field2683 = null;
        field2678 = null;
        field2686 = null;
        field2682 = null;
        field2679 = null;
    }
}
