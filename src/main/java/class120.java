import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class120 extends RuntimeException {

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Ljava/lang/String;")
    public String field2568;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2565;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Z")
    public static volatile boolean field2557 = true;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Llc;")
    public static class69 field2561 = class69.method470((byte) -128, "@yel@");

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Llc;")
    public static class69 field2560 = class69.method470((byte) -126, "From ");

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field2559 = -1;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Llc;")
    public static class69 field2566 = class69.method470((byte) -110, "cyan:");

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field2570 = 0;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Llc;")
    public static class69 field2567 = class69.method470((byte) -127, "Please use a different world)3");

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field2569 = 0;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Lwd;")
    public static class129 field2562;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lcb;")
    public static class15 field2571;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IBII)I")
    public static final int method878(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg0 / arg3;
        field2564++;
        int var5 = arg2 / arg3;
        int var6 = arg3 - 1 & arg2;
        int var7 = arg3 - 1 & arg0;
        int var8 = class127.method933(var5, (byte) -92, var4);
        int var9 = class127.method933(var5, (byte) -115, var4 + 1);
        int var10 = class127.method933(var5 + 1, (byte) 113, var4);
        int var11 = -48 / ((arg1 + 17) / 35);
        int var12 = class127.method933(var5 + 1, (byte) -93, var4 + 1);
        int var13 = class76.method536(var8, var7, var9, arg3, 111);
        int var14 = class76.method536(var10, var7, var12, arg3, 102);
        return class76.method536(var13, var6, var14, arg3, 123);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([IIIZZLjava/awt/Graphics;)V")
    public static final void method879(int[] arg0, int arg1, int arg2, boolean arg3, boolean arg4, Graphics arg5) {
        class107.field2317.method606(-2);
        class60.field1247.method80(0, 0);
        field2558++;
        if (arg4) {
            if (arg0[arg2] != -1) {
                if (arg2 == 0) {
                    class119.field2542.method80(22, 10);
                }
                if (arg2 == 1) {
                    class121.field2601.method80(54, 8);
                }
                if (arg2 == 2) {
                    class121.field2601.method80(82, 8);
                }
                if (arg2 == 3) {
                    class82.field1859.method80(110, 8);
                }
                if (arg2 == 4) {
                    class112.field2449.method80(153, 8);
                }
                if (arg2 == 5) {
                    class112.field2449.method80(181, 8);
                }
                if (arg2 == 6) {
                    class115.field2494.method80(209, 9);
                }
            }
            if (arg0[0] != -1 && arg1 != 0) {
                class29.field605[0].method80(29, 13);
            }
            if (arg0[1] != -1 && arg1 != 1) {
                class29.field605[1].method80(53, 11);
            }
            if (arg0[2] != -1 && arg1 != 2) {
                class29.field605[2].method80(82, 11);
            }
            if (arg0[3] != -1 && arg1 != 3) {
                class29.field605[3].method80(115, 12);
            }
            if (arg0[4] != -1 && arg1 != 4) {
                class29.field605[4].method80(153, 13);
            }
            if (arg0[5] != -1 && arg1 != 5) {
                class29.field605[5].method80(180, 11);
            }
            if (arg0[6] != -1 && arg1 != 6) {
                class29.field605[6].method80(208, 13);
            }
        }
        class107.field2317.method69(arg5, 160, arg3, 516);
        class63.field1333.method606(-2);
        class108.field2398.method80(0, 0);
        if (arg4) {
            if (arg0[arg2] != -1) {
                if (arg2 == 7) {
                    class36.field737.method80(42, 0);
                }
                if (arg2 == 8) {
                    class13.field267.method80(74, 0);
                }
                if (arg2 == 9) {
                    class13.field267.method80(102, 0);
                }
                if (arg2 == 10) {
                    class18.field381.method80(130, 1);
                }
                if (arg2 == 11) {
                    class60.field1245.method80(173, 0);
                }
                if (arg2 == 12) {
                    class60.field1245.method80(201, 0);
                }
                if (arg2 == 13) {
                    class47.field981.method80(229, 0);
                }
            }
            if (arg0[8] != -1 && arg1 != 8) {
                class29.field605[7].method80(74, 2);
            }
            if (arg0[9] != -1 && arg1 != 9) {
                class29.field605[8].method80(102, 3);
            }
            if (arg0[10] != -1 && arg1 != 10) {
                class29.field605[9].method80(137, 4);
            }
            if (arg0[11] != -1 && arg1 != 11) {
                class29.field605[10].method80(174, 2);
            }
            if (arg0[12] != -1 && arg1 != 12) {
                class29.field605[11].method80(201, 2);
            }
            if (arg0[13] != -1 && arg1 != 13) {
                class29.field605[12].method80(226, 2);
            }
        }
        class63.field1333.method69(arg5, 466, true, 496);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)I")
    public static final int method880(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 31) {
            field2566 = null;
        }
        field2572++;
        int var4 = 256 - arg0;
        return ((arg1 & 0xFF00FF) * arg0 + (arg3 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg3 & 0xFF00) * var4 + ((arg1 & 0xFF00) * arg0) & 0xFF0000) >> 8;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static final void method881(int arg0) {
        if (class90.field1960 == 118) {
            int var1 = class3.field22.method703((byte) -128);
            int var2 = (var1 >> 4 & 0x7) + class6.field103;
            int var3 = (var1 & 0x7) + class56.field1188;
            int var4 = class3.field22.method665(8666);
            int var5 = class3.field22.method703((byte) -112);
            int var6 = var5 >> 4 & 0xF;
            int var7 = var5 & 0x7;
            if (var2 - var6 <= class46.field974.field1041[0] && class46.field974.field1041[0] <= var2 + var6 && var3 - var6 <= class46.field974.field1097[0] && var3 + var6 >= class46.field974.field1097[0] && class102.field2204 != 0 && var7 > 0 && class121.field2594 < 50) {
                class49.field1020[class121.field2594] = var4;
                class72.field1617[class121.field2594] = var7;
                class92.field2010[class121.field2594] = 0;
                class43.field851[class121.field2594] = null;
                class121.field2594++;
            }
        }
        field2563++;
        if (arg0 > -77) {
            return;
        }
        if (class90.field1960 == 129) {
            int var8 = class3.field22.method671(-86);
            int var9 = class3.field22.method709(-47);
            int var10 = var9 >> 2;
            int var11 = var9 & 0x3;
            int var12 = class51.field1106[var10];
            int var13 = class3.field22.method666(3053);
            int var14 = class6.field103 + (var13 >> 4 & 0x7);
            int var15 = class56.field1188 + (var13 & 0x7);
            if (var14 >= 0 && var15 >= 0 && var14 < 103 && var15 < 103) {
                int var16 = class22.field451[class71.field1588][var14 + 1][var15];
                int var17 = class22.field451[class71.field1588][var14][var15];
                int var18 = class22.field451[class71.field1588][var14 + 1][var15 + 1];
                int var19 = class22.field451[class71.field1588][var14][var15 + 1];
                if (var12 == 0) {
                    class112 var20 = field2562.method946(class71.field1588, var14, var15);
                    if (var20 != null) {
                        int var21 = var20.field2450 >> 14 & 0x7FFF;
                        if (var10 == 2) {
                            var20.field2440 = new class30(var21, 2, var11 + 4, var17, var16, var18, var19, var8, false);
                            var20.field2451 = new class30(var21, 2, var11 + 1 & 0x3, var17, var16, var18, var19, var8, false);
                        } else {
                            var20.field2440 = new class30(var21, var10, var11, var17, var16, var18, var19, var8, false);
                        }
                    }
                }
                if (var12 == 1) {
                    class103 var22 = field2562.method944(class71.field1588, var14, var15);
                    if (var22 != null) {
                        var22.field2231 = new class30(var22.field2229 >> 14 & 0x7FFF, 4, 0, var17, var16, var18, var19, var8, false);
                    }
                }
                if (var12 == 2) {
                    if (var10 == 11) {
                        var10 = 10;
                    }
                    class11 var23 = field2562.method973(class71.field1588, var14, var15);
                    if (var23 != null) {
                        var23.field226 = new class30(var23.field221 >> 14 & 0x7FFF, var10, var11, var17, var16, var18, var19, var8, false);
                    }
                }
                if (var12 == 3) {
                    class19 var24 = field2562.method965(class71.field1588, var14, var15);
                    if (var24 != null) {
                        var24.field432 = new class30(var24.field414 >> 14 & 0x7FFF, 22, var11, var17, var16, var18, var19, var8, false);
                    }
                }
            }
        } else if (class90.field1960 == 69) {
            int var25 = class3.field22.method703((byte) -85);
            int var26 = (var25 >> 4 & 0x7) + class6.field103;
            int var27 = class56.field1188 + (var25 & 0x7);
            int var28 = class3.field22.method711(true) + var26;
            int var29 = class3.field22.method711(true) + var27;
            int var30 = class3.field22.method695(31);
            int var31 = class3.field22.method665(8666);
            int var32 = class3.field22.method703((byte) -64) * 4;
            int var33 = class3.field22.method703((byte) -53) * 4;
            int var34 = class3.field22.method665(8666);
            int var35 = class3.field22.method665(8666);
            int var36 = class3.field22.method703((byte) 107);
            int var37 = class3.field22.method703((byte) -59);
            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104 && var31 != 65535) {
                int var38 = var29 * 128 + 64;
                int var39 = var28 * 128 + 64;
                int var40 = var27 * 128 + 64;
                int var41 = var26 * 128 + 64;
                class25 var42 = new class25(var31, class71.field1588, var41, var40, class53.method341(0, var41, var40, class71.field1588) - var32, class62.field1282 + var34, var35 + class62.field1282, var36, var37, var30, var33);
                var42.method167(class62.field1282 + var34, var39, var38, class53.method341(0, var39, var38, class71.field1588) - var33, -19860);
                class16.field289.method577(var42, -89);
            }
        } else if (class90.field1960 == 135) {
            int var43 = class3.field22.method703((byte) -74);
            int var44 = (var43 & 0x7) + class56.field1188;
            int var45 = (var43 >> 4 & 0x7) + class6.field103;
            int var46 = class3.field22.method665(8666);
            int var47 = class3.field22.method703((byte) 112);
            int var48 = class3.field22.method665(8666);
            if (var45 >= 0 && var44 >= 0 && var45 < 104 && var44 < 104) {
                int var49 = var44 * 128 + 64;
                int var50 = var45 * 128 + 64;
                class22 var51 = new class22(var46, class71.field1588, var50, var49, class53.method341(0, var50, var49, class71.field1588) - var47, var48, class62.field1282);
                class68.field1484.method577(var51, -36);
            }
        } else if (class90.field1960 == 35) {
            int var52 = class3.field22.method703((byte) -115);
            int var53 = (var52 >> 4 & 0x7) + class6.field103;
            int var54 = class56.field1188 + (var52 & 0x7);
            int var55 = class3.field22.method703((byte) -66);
            int var56 = var55 >> 2;
            int var57 = var55 & 0x3;
            int var58 = class51.field1106[var56];
            if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                class43.method252(0, -1, class71.field1588, var54, var53, -1, var56, var58, -119, var57);
            }
        } else if (class90.field1960 == 63) {
            int var59 = class3.field22.method703((byte) -58);
            int var60 = (var59 >> 4 & 0x7) + class6.field103;
            int var61 = (var59 & 0x7) + class56.field1188;
            int var62 = class3.field22.method665(8666);
            int var63 = class3.field22.method665(8666);
            int var64 = class3.field22.method665(8666);
            if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                class80 var65 = class92.field2014[class71.field1588][var60][var61];
                if (var65 != null) {
                    for (class35 var66 = (class35) var65.method580((byte) 84); var66 != null; var66 = (class35) var65.method576((byte) 115)) {
                        if ((var62 & 0x7FFF) == var66.field687 && var66.field694 == var63) {
                            var66.field694 = var64;
                            break;
                        }
                    }
                    class80.method570(var61, 16537, var60);
                }
            }
        } else if (class90.field1960 == 46) {
            int var67 = class3.field22.method705(-32);
            int var68 = class3.field22.method670(-121);
            int var69 = class3.field22.method671(-77);
            int var70 = class3.field22.method694(-95);
            int var71 = (var70 >> 4 & 0x7) + class6.field103;
            int var72 = (var70 & 0x7) + class56.field1188;
            if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104 && class2.field10 != var68) {
                class35 var73 = new class35();
                var73.field687 = var69;
                var73.field694 = var67;
                if (class92.field2014[class71.field1588][var71][var72] == null) {
                    class92.field2014[class71.field1588][var71][var72] = new class80();
                }
                class92.field2014[class71.field1588][var71][var72].method577(var73, -34);
                class80.method570(var72, 16537, var71);
            }
        } else if (class90.field1960 == 56) {
            int var74 = class3.field22.method670(-125);
            int var75 = class3.field22.method694(123);
            int var76 = (var75 >> 4 & 0x7) + class6.field103;
            int var77 = (var75 & 0x7) + class56.field1188;
            int var78 = class3.field22.method671(-107);
            if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                class35 var79 = new class35();
                var79.field687 = var74;
                var79.field694 = var78;
                if (class92.field2014[class71.field1588][var76][var77] == null) {
                    class92.field2014[class71.field1588][var76][var77] = new class80();
                }
                class92.field2014[class71.field1588][var76][var77].method577(var79, -50);
                class80.method570(var77, 16537, var76);
            }
        } else {
            if (class90.field1960 == 21) {
                int var80 = class3.field22.method670(-126);
                int var81 = class3.field22.method666(3053);
                int var82 = class56.field1188 + (var81 & 0x7);
                int var83 = (var81 >> 4 & 0x7) + class6.field103;
                int var84 = class3.field22.method705(-48);
                int var85 = class3.field22.method666(3053);
                int var86 = var85 >> 2;
                int var87 = class51.field1106[var86];
                int var88 = var85 & 0x3;
                byte var89 = class3.field22.method700((byte) -115);
                byte var90 = class3.field22.method683((byte) 88);
                byte var91 = class3.field22.method711(true);
                byte var92 = class3.field22.method683((byte) 85);
                int var93 = class3.field22.method670(-118);
                int var94 = class3.field22.method671(-96);
                class60 var95;
                if (class2.field10 == var80) {
                    var95 = class46.field974;
                } else {
                    var95 = class123.field2682[var80];
                }
                if (var95 != null) {
                    class121 var96 = class110.method821(var93, 724);
                    int var97 = class22.field451[class71.field1588][var83][var82];
                    int var98 = class22.field451[class71.field1588][var83 + 1][var82];
                    int var99 = class22.field451[class71.field1588][var83][var82 + 1];
                    int var100 = class22.field451[class71.field1588][var83 + 1][var82 + 1];
                    class44 var101 = var96.method884(var99, var86, var97, var98, var100, var88, 96);
                    if (var101 != null) {
                        class43.method252(var84 + 1, -1, class71.field1588, var82, var83, var94 + 1, 0, var87, -71, 0);
                        var95.field1232 = var101;
                        int var102 = var96.field2574;
                        int var103 = var96.field2575;
                        var95.field1235 = class62.field1282 + var84;
                        var95.field1220 = class62.field1282 + var94;
                        if (var92 > var90) {
                            byte var104 = var92;
                            var92 = var90;
                            var90 = var104;
                        }
                        if (var88 == 1 || var88 == 3) {
                            var103 = var96.field2574;
                            var102 = var96.field2575;
                        }
                        var95.field1226 = var82 * 128 + var103 * 64;
                        var95.field1231 = var83 * 128 + var102 * 64;
                        if (var89 < var91) {
                            byte var105 = var91;
                            var91 = var89;
                            var89 = var105;
                        }
                        var95.field1219 = class53.method341(0, var95.field1231, var95.field1226, class71.field1588);
                        var95.field1210 = var83 + var92;
                        var95.field1214 = var83 + var90;
                        var95.field1233 = var82 + var89;
                        var95.field1221 = var82 + var91;
                    }
                }
            }
            if (class90.field1960 == 244) {
                int var106 = class3.field22.method671(-85);
                int var107 = class3.field22.method709(-110);
                int var108 = class56.field1188 + (var107 & 0x7);
                int var109 = (var107 >> 4 & 0x7) + class6.field103;
                int var110 = class3.field22.method694(-114);
                int var111 = var110 & 0x3;
                int var112 = var110 >> 2;
                int var113 = class51.field1106[var112];
                if (var109 >= 0 && var108 >= 0 && var109 < 104 && var108 < 104) {
                    class43.method252(0, var106, class71.field1588, var108, var109, -1, var112, var113, 115, var111);
                }
            } else if (class90.field1960 == 221) {
                int var114 = class3.field22.method666(3053);
                int var115 = class56.field1188 + (var114 & 0x7);
                int var116 = (var114 >> 4 & 0x7) + class6.field103;
                int var117 = class3.field22.method665(8666);
                if (var116 >= 0 && var115 >= 0 && var116 < 104 && var115 < 104) {
                    class80 var118 = class92.field2014[class71.field1588][var116][var115];
                    if (var118 != null) {
                        for (class35 var119 = (class35) var118.method580((byte) -82); var119 != null; var119 = (class35) var118.method576((byte) 90)) {
                            if ((var117 & 0x7FFF) == var119.field687) {
                                var119.method502(0);
                                break;
                            }
                        }
                        if (var118.method580((byte) -76) == null) {
                            class92.field2014[class71.field1588][var116][var115] = null;
                        }
                        class80.method570(var115, 16537, var116);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class120(Throwable arg0, String arg1) {
        this.field2568 = arg1;
        this.field2565 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    public static void method882(boolean arg0) {
        field2567 = null;
        field2561 = null;
        if (arg0) {
            field2562 = null;
            field2566 = null;
            field2560 = null;
            field2571 = null;
        }
    }
}
