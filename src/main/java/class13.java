import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class13 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public int field149;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "[I")
    public int[] field156;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "[Lhf;")
    public class159[] field157;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field152 = "Created gameworld";

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field153 = 0;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "[I")
    public static int[] field155 = new int[128];

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Lba;")
    public static class157 field154;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static final void method93(byte arg0) {
        field158++;
        if (class45.field592 == 120) {
            int var1 = class92.field1488.method344((byte) 5);
            int var2 = ((var1 & 0x79) >> 4) + class240.field3524;
            int var3 = (var1 & 0x7) + class275.field4456;
            int var4 = class92.field1488.method354(-110);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class2 var5 = class37.field475[class37.field474][var2][var3];
                if (var5 != null) {
                    for (class193 var6 = (class193) var5.method8(-105); var6 != null; var6 = (class193) var5.method12((byte) 69)) {
                        if ((var4 & 0x7FFF) == var6.field2853.field3073) {
                            var6.method1781(5250);
                            break;
                        }
                    }
                    if (var5.method8(-100) == null) {
                        class37.field475[class37.field474][var2][var3] = null;
                    }
                    class87.method641(var2, 3391, var3);
                }
            }
        } else if (class45.field592 == 232) {
            int var7 = class92.field1488.method377((byte) 53);
            int var8 = class240.field3524 + ((var7 & 0x78) >> 4);
            int var9 = (var7 & 0x7) + class275.field4456;
            int var10 = class92.field1488.method366(-16505);
            int var11 = var10 >> 2;
            int var12 = var10 & 0x3;
            int var13 = class210.field3105[var11];
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                class241.method1651(-1, var13, -1, class37.field474, var11, var12, var9, 0, -97, var8);
            }
        } else if (class45.field592 == 47) {
            int var14 = class92.field1488.method327(65280);
            int var15 = class92.field1488.method331(-74);
            int var16 = class92.field1488.method331(-62);
            int var17 = class92.field1488.method359(255);
            int var18 = (var17 & 0x7) + class275.field4456;
            int var19 = ((var17 & 0x78) >> 4) + class240.field3524;
            if (var19 >= 0 && var18 >= 0 && var19 < 104 && var18 < 104 && class279.field4498 != var15) {
                class208 var20 = new class208();
                var20.field3077 = var16;
                var20.field3073 = var14;
                if (class37.field475[class37.field474][var19][var18] == null) {
                    class37.field475[class37.field474][var19][var18] = new class2();
                }
                class37.field475[class37.field474][var19][var18].method13(32, new class193(var20));
                class87.method641(var19, 3391, var18);
            }
        } else if (class45.field592 == 144) {
            int var21 = class92.field1488.method366(-16505);
            int var22 = class240.field3524 + ((var21 & 0x73) >> 4);
            int var23 = (var21 & 0x7) + class275.field4456;
            int var24 = class92.field1488.method331(-93);
            if (var24 == 65535) {
                var24 = -1;
            }
            int var25 = class92.field1488.method366(-16505);
            int var26 = var25 >> 4 & 0xF;
            int var27 = var25 & 0x7;
            int var28 = class92.field1488.method366(-16505);
            int var29 = class92.field1488.method366(-16505);
            if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                int var30 = var26 + 1;
                if (class213.field3139.field3761[0] >= var22 - var30 && class213.field3139.field3761[0] <= (var22 + var30) && var23 - var30 <= class213.field3139.field3686[0] && class213.field3139.field3686[0] <= var23 + var30 && class171.field2582 != 0 && var27 > 0 && class43.field571 < 50 && var24 != -1) {
                    class158.field2463[class43.field571] = var24;
                    class55.field810[class43.field571] = var27;
                    class252.field3798[class43.field571] = var28;
                    class261.field4035[class43.field571] = null;
                    class101.field1714[class43.field571] = (var22 << 16) + (var23 << 8) + var26;
                    class125.field2117[class43.field571] = var29;
                    class43.field571++;
                }
            }
        } else if (class45.field592 == 179) {
            int var31 = class92.field1488.method331(-60);
            if (var31 == 65535) {
                var31 = -1;
            }
            int var32 = class92.field1488.method344((byte) 51);
            int var33 = var32 >> 2;
            int var34 = class210.field3105[var33];
            int var35 = class92.field1488.method366(-16505);
            int var36 = var32 & 0x3;
            int var37 = (var35 >> 4 & 0x7) + class240.field3524;
            int var38 = (var35 & 0x7) + class275.field4456;
            class34.method218(var34, class37.field474, 97, var38, var37, var36, var31, var33);
        } else {
            if (class45.field592 == 133) {
                int var39 = class92.field1488.method351(0);
                int var40 = class92.field1488.method359(255);
                int var41 = ((var40 & 0x7B) >> 4) + class240.field3524;
                int var42 = (var40 & 0x7) + class275.field4456;
                int var43 = class92.field1488.method327(65280);
                int var44 = class92.field1488.method366(-16505);
                int var45 = var44 >> 2;
                int var46 = var44 & 0x3;
                byte var47 = class92.field1488.method342((byte) 124);
                byte var48 = class92.field1488.method357((byte) 41);
                byte var49 = class92.field1488.method335((byte) 26);
                byte var50 = class92.field1488.method357((byte) 41);
                int var51 = class92.field1488.method327(65280);
                int var52 = class92.field1488.method331(-44);
                class225.method1561(var52, var48, var43, var41, var49, var46, var42, var45, var51, var47, (byte) 88, var39, var50);
            }
            if (class45.field592 == 17) {
                int var53 = class92.field1488.method366(-16505);
                int var54 = class240.field3524 * 2 + ((var53 & 0xF9) >> 4);
                int var55 = class275.field4456 * 2 + (var53 & 0xF);
                int var56 = var54 + class92.field1488.method335((byte) 26);
                int var57 = class92.field1488.method335((byte) 26) + var55;
                int var58 = class92.field1488.method337(88);
                int var59 = class92.field1488.method331(-37);
                int var60 = class92.field1488.method366(-16505) * 4;
                int var61 = class92.field1488.method366(-16505) * 4;
                int var62 = class92.field1488.method331(-118);
                int var63 = class92.field1488.method331(-88);
                int var64 = class92.field1488.method366(-16505);
                int var65 = class92.field1488.method366(-16505);
                if (var64 == 255) {
                    var64 = -1;
                }
                if (var54 >= 0 && var55 >= 0 && var54 < 208 && var55 < 208 && var56 >= 0 && var57 >= 0 && var56 < 208 && var57 < 208 && var59 != 65535) {
                    int var66 = var57 * 64;
                    int var67 = var56 * 64;
                    int var68 = var54 * 64;
                    int var69 = var55 * 64;
                    class68 var70 = new class68(var59, class37.field474, var68, var69, class113.method851(class37.field474, 94, var69, var68) - var60, var62 - -class199.field2930, class199.field2930 + var63, var64, var65, var58, var61);
                    var70.method519(var66, var67, class113.method851(class37.field474, 93, var66, var67) - var61, class199.field2930 + var62, -1);
                    class110.field1836.method13(32, new class134(var70));
                }
            } else {
                int var71 = -11 / ((53 - arg0) / 54);
                if (class45.field592 == 158) {
                    int var72 = class92.field1488.method366(-16505);
                    int var73 = (var72 & 0x7) + class275.field4456;
                    int var74 = class240.field3524 + ((var72 & 0x75) >> 4);
                    int var75 = class92.field1488.method331(-98);
                    int var76 = class92.field1488.method366(-16505);
                    int var77 = class92.field1488.method331(-85);
                    if (var74 >= 0 && var73 >= 0 && var74 < 104 && var73 < 104) {
                        int var78 = var73 * 128 + 64;
                        int var79 = var74 * 128 + 64;
                        class179 var80 = new class179(var75, class37.field474, var79, var78, class113.method851(class37.field474, -84, var78, var79) - var76, var77, class199.field2930);
                        class126.field2123.method13(32, new class162(var80));
                    }
                } else if (class45.field592 == 105) {
                    int var81 = class92.field1488.method366(-16505);
                    int var82 = (var81 >> 4 & 0x7) + class240.field3524;
                    int var83 = class275.field4456 + (var81 & 0x7);
                    int var84 = var82 + class92.field1488.method335((byte) 26);
                    int var85 = var83 + class92.field1488.method335((byte) 26);
                    int var86 = class92.field1488.method337(108);
                    int var87 = class92.field1488.method331(-65);
                    int var88 = class92.field1488.method366(-16505) * 4;
                    int var89 = class92.field1488.method366(-16505) * 4;
                    int var90 = class92.field1488.method331(-104);
                    int var91 = class92.field1488.method331(-27);
                    int var92 = class92.field1488.method366(-16505);
                    if (var92 == 255) {
                        var92 = -1;
                    }
                    int var93 = class92.field1488.method366(-16505);
                    if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104 && var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104 && var87 != 65535) {
                        int var94 = var85 * 128 + 64;
                        int var95 = var83 * 128 + 64;
                        int var96 = var84 * 128 + 64;
                        int var97 = var82 * 128 + 64;
                        class68 var98 = new class68(var87, class37.field474, var97, var95, class113.method851(class37.field474, 91, var95, var97) - var88, class199.field2930 + var90, var91 + class199.field2930, var92, var93, var86, var89);
                        var98.method519(var94, var96, class113.method851(class37.field474, -64, var94, var96) - var89, class199.field2930 + var90, -1);
                        class110.field1836.method13(32, new class134(var98));
                    }
                } else if (class45.field592 == 115) {
                    int var99 = class92.field1488.method331(-35);
                    int var100 = class92.field1488.method366(-16505);
                    class48.method297(false, var99).method712(var100, true);
                } else if (class45.field592 == 131) {
                    int var101 = class92.field1488.method344((byte) 48);
                    int var102 = var101 >> 2;
                    int var103 = class210.field3105[var102];
                    int var104 = class92.field1488.method374((byte) 80);
                    int var105 = class92.field1488.method366(-16505);
                    int var106 = class275.field4456 + (var105 & 0x7);
                    int var107 = var101 & 0x3;
                    int var108 = (var105 >> 4 & 0x7) + class240.field3524;
                    if (var108 >= 0 && var106 >= 0 && var108 < 104 && var106 < 104) {
                        class241.method1651(-1, var103, var104, class37.field474, var102, var107, var106, 0, -76, var108);
                    }
                } else if (class45.field592 == 111) {
                    int var109 = class92.field1488.method366(-16505);
                    int var110 = class240.field3524 * 2 + ((var109 & 0xF8) >> 4);
                    int var111 = class275.field4456 * 2 + (var109 & 0xF);
                    int var112 = var110 + class92.field1488.method335((byte) 26);
                    int var113 = class92.field1488.method335((byte) 26) + var111;
                    int var114 = class92.field1488.method337(119);
                    int var115 = class92.field1488.method337(114);
                    int var116 = class92.field1488.method331(-66);
                    int var117 = class92.field1488.method335((byte) 26);
                    int var118 = class92.field1488.method366(-16505) * 4;
                    int var119 = class92.field1488.method331(-84);
                    int var120 = class92.field1488.method331(-114);
                    int var121 = class92.field1488.method366(-16505);
                    if (var121 == 255) {
                        var121 = -1;
                    }
                    int var122 = class92.field1488.method366(-16505);
                    if (var110 >= 0 && var111 >= 0 && var110 < 208 && var111 < 208 && var112 >= 0 && var113 >= 0 && var112 < 208 && var113 < 208 && var116 != 65535) {
                        int var123 = var112 * 64;
                        int var124 = var113 * 64;
                        int var125 = var111 * 64;
                        int var126 = var110 * 64;
                        if (var114 != 0) {
                            int var128;
                            class248 var130;
                            if (var114 >= 0) {
                                int var127 = var114 - 1;
                                var128 = var127 >> 11 & 0xF;
                                int var129 = var127 & 0x7FF;
                                var130 = class255.field3856[var129];
                            } else {
                                int var131 = -var114 - 1;
                                int var132 = var131 & 0x7FF;
                                if (class279.field4498 == var132) {
                                    var130 = class213.field3139;
                                } else {
                                    var130 = class92.field1475[var132];
                                }
                                var128 = var131 >> 11 & 0xF;
                            }
                            if (var130 != null) {
                                class294 var133 = var130.method1708(0);
                                if (var133.field4687 != null && var133.field4687[var128] != null) {
                                    var117 -= var133.field4687[var128][1];
                                    int var134 = var133.field4687[var128][2];
                                    int var135 = var133.field4687[var128][0];
                                    int var136 = class244.field3590[var130.field3668];
                                    int var137 = class244.field3592[var130.field3668];
                                    int var138 = var134 * var136 + var135 * var137 >> 16;
                                    int var139 = var134 * var137 - (var135 * var136) >> 16;
                                    var125 += var139;
                                    var126 += var138;
                                }
                            }
                        }
                        class68 var141 = new class68(var116, class37.field474, var126, var125, class113.method851(class37.field474, -70, var125, var126) - var117, class199.field2930 + var119, class199.field2930 + var120, var121, var122, var115, var118);
                        var141.method519(var124, var123, class113.method851(class37.field474, 110, var124, var123) - var118, class199.field2930 + var119, -1);
                        class110.field1836.method13(32, new class134(var141));
                    }
                } else if (class45.field592 == 114) {
                    int var142 = class92.field1488.method366(-16505);
                    int var143 = class275.field4456 + (var142 & 0x7);
                    int var144 = class240.field3524 + (var142 >> 4 & 0x7);
                    int var145 = class92.field1488.method331(-73);
                    int var146 = class92.field1488.method331(-52);
                    int var147 = class92.field1488.method331(-36);
                    if (var144 >= 0 && var143 >= 0 && var144 < 104 && var143 < 104) {
                        class2 var148 = class37.field475[class37.field474][var144][var143];
                        if (var148 != null) {
                            for (class193 var149 = (class193) var148.method8(-66); var149 != null; var149 = (class193) var148.method12((byte) 69)) {
                                class208 var150 = var149.field2853;
                                if ((var145 & 0x7FFF) == var150.field3073 && var150.field3077 == var146) {
                                    var150.field3077 = var147;
                                    break;
                                }
                            }
                            class87.method641(var144, 3391, var143);
                        }
                    }
                } else if (class45.field592 == 60) {
                    int var151 = class92.field1488.method359(255);
                    int var152 = class275.field4456 + (var151 & 0x7);
                    int var153 = (var151 >> 4 & 0x7) + class240.field3524;
                    int var154 = class92.field1488.method374((byte) 80);
                    int var155 = class92.field1488.method354(-119);
                    if (var153 >= 0 && var152 >= 0 && var153 < 104 && var152 < 104) {
                        class208 var156 = new class208();
                        var156.field3073 = var154;
                        var156.field3077 = var155;
                        if (class37.field475[class37.field474][var153][var152] == null) {
                            class37.field475[class37.field474][var153][var152] = new class2();
                        }
                        class37.field475[class37.field474][var153][var152].method13(32, new class193(var156));
                        class87.method641(var153, 3391, var152);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static final void method94(boolean arg0) {
        field150++;
        if (class160.method1163(0) != 2) {
            return;
        }
        if (!arg0) {
            field152 = null;
        }
        byte var1 = (byte) (class62.field949 - 4 & 0xFF);
        int var2 = class62.field949 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class228.field3361[var3][var2][var16] = var1;
            }
        }
        if (class37.field474 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class209.field3088[var4] = -1000000;
            class284.field4563[var4] = 1000000;
            class169.field2560[var4] = 0;
            class35.field447[var4] = 1000000;
            class57.field824[var4] = 0;
        }
        if (class119.field1931 != 1) {
            int var5 = class113.method851(class37.field474, -7, class260.field4024, class93.field1533);
            if ((var5 - class226.field3324) < 800 && (class253.field3806[class37.field474][class93.field1533 >> 7][class260.field4024 >> 7] & 0x4) != 0) {
                class197.method1395(1, class223.field3286, false, class93.field1533 >> 7, class260.field4024 >> 7, (byte) -121);
                return;
            }
            return;
        }
        if ((class253.field3806[class37.field474][class213.field3139.field3660 >> 7][class213.field3139.field3753 >> 7] & 0x4) != 0) {
            class197.method1395(0, class223.field3286, false, class213.field3139.field3660 >> 7, class213.field3139.field3753 >> 7, (byte) -81);
        }
        if (class115.field1906 >= 310) {
            return;
        }
        int var6 = class93.field1533 >> 7;
        int var7 = class260.field4024 >> 7;
        int var8 = class213.field3139.field3660 >> 7;
        int var9 = class213.field3139.field3753 >> 7;
        int var10;
        if (var6 >= var8) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        int var11;
        if (var7 >= var9) {
            var11 = var7 - var9;
        } else {
            var11 = var9 - var7;
        }
        if (var10 == 0 && var11 == 0 || var10 <= -104 || var10 >= 104 || var11 <= -104 || var11 >= 104) {
            class5.method27(118, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class163.field2520 + "," + class149.field2390, (Throwable) null);
            return;
        }
        if (var10 > var11) {
            int var12 = 32768;
            int var13 = var11 * 65536 / var10;
            while (var6 != var8) {
                if (var8 > var6) {
                    var6++;
                } else if (var8 < var6) {
                    var6--;
                }
                if ((class253.field3806[class37.field474][var6][var7] & 0x4) != 0) {
                    class197.method1395(1, class223.field3286, false, var6, var7, (byte) 97);
                    return;
                }
                var12 += var13;
                if (var12 >= 65536) {
                    var12 -= 65536;
                    if (var7 < var9) {
                        var7++;
                    } else if (var7 > var9) {
                        var7--;
                    }
                    if ((class253.field3806[class37.field474][var6][var7] & 0x4) != 0) {
                        class197.method1395(1, class223.field3286, false, var6, var7, (byte) -103);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var10 * 65536 / var11;
        int var15 = 32768;
        while (var7 != var9) {
            if (var9 > var7) {
                var7++;
            } else if (var7 > var9) {
                var7--;
            }
            if ((class253.field3806[class37.field474][var6][var7] & 0x4) != 0) {
                class197.method1395(1, class223.field3286, false, var6, var7, (byte) -104);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                var15 -= 65536;
                if (var6 < var8) {
                    var6++;
                } else if (var6 > var8) {
                    var6--;
                }
                if ((class253.field3806[class37.field474][var6][var7] & 0x4) != 0) {
                    class197.method1395(1, class223.field3286, false, var6, var7, (byte) -81);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method95(int arg0) {
        int var1 = 110 / ((-arg0 - 40) / 50);
        field152 = null;
        field155 = null;
        field154 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Llc;ZII)Llf;")
    public static final class94 method96(class270 arg0, boolean arg1, int arg2, int arg3) {
        field151++;
        if (class144.method1079(arg3, arg0, arg2, (byte) 59)) {
            if (arg1) {
                field154 = null;
            }
            return class293.method1990(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V")
    public class13(int arg0) {
        this.field149 = arg0;
        this.field156 = new int[this.field149];
        this.field157 = new class159[this.field149];
    }
}
