import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class151 {

    @OriginalMember(owner = "client!r", name = "h", descriptor = "[I")
    private int[] field2467;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field2463 = 0;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "[I")
    public static int[] field2460 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field2462 = 0;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "Lrn;")
    public static class18 field2471;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "Lrn;")
    public static class18 field2472;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "[Z")
    public static boolean[] field2468;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V", line = 11)
    public static final void method1252(int arg0, int arg1) {
        class103.method898(class103.field1551, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        int var2 = 14 % ((37 - arg1) / 37);
        field2461++;
        class103.method893(-50.0F, -60.0F, -50.0F);
        class103.method896(class103.field1545, 0, false);
        class103.method892();
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 27)
    public static final void method1253(byte arg0) {
        field2466++;
        if (class123.field1966 == 67) {
            int var124 = class244.field3803.method281(75);
            int var125 = class300.field4647 * 2 + (var124 >> 4 & 0xF);
            int var126 = class168.field2673 * 2 + (var124 & 0xF);
            int var127 = class244.field3803.method286((byte) 118) + var125;
            int var128 = var126 + class244.field3803.method286((byte) 127);
            int var129 = class244.field3803.method296(-92);
            int var130 = class244.field3803.method296(-89);
            int var131 = class244.field3803.method314((byte) 56);
            int var132 = class244.field3803.method286((byte) 115);
            int var133 = class244.field3803.method281(-125) * 4;
            int var134 = class244.field3803.method314((byte) 60);
            int var135 = class244.field3803.method314((byte) 118);
            int var136 = class244.field3803.method281(9);
            int var137 = class244.field3803.method281(-125);
            if (var136 == 255) {
                var136 = -1;
            }
            if (var125 >= 0 && var126 >= 0 && var125 < 208 && var126 < 208 && var127 >= 0 && var128 >= 0 && var127 < 208 && var128 < 208 && var131 != 65535) {
                int var138 = var125 * 64;
                int var139 = var126 * 64;
                int var140 = var127 * 64;
                if (var129 != 0) {
                    class91 var143;
                    int var144;
                    if (var129 < 0) {
                        int var141 = -var129 - 1;
                        int var142 = var141 & 0x7FF;
                        if (class118.field1813 == var142) {
                            var143 = class173.field2746;
                        } else {
                            var143 = class177.field2795[var142];
                        }
                        var144 = (var141 & 0x7E52) >> 11;
                    } else {
                        int var145 = var129 - 1;
                        var144 = var145 >> 11 & 0xF;
                        int var146 = var145 & 0x7FF;
                        var143 = class110.field1683[var146];
                    }
                    if (var143 != null) {
                        class109 var147 = var143.method813((byte) 71);
                        if (var147.field1670 != null && var147.field1670[var144] != null) {
                            var132 -= var147.field1670[var144][1];
                            int var148 = var147.field1670[var144][0];
                            int var149 = var147.field1670[var144][2];
                            int var150 = class107.field1604[var143.field1320];
                            int var151 = class107.field1605[var143.field1320];
                            int var152 = var148 * var151 + var149 * var150 >> 16;
                            int var153 = var149 * var151 - (var148 * var150) >> 16;
                            var139 += var153;
                            var138 += var152;
                        }
                    }
                }
                int var155 = var128 * 64;
                class337 var156 = new class337(var131, class119.field1826, var138, var139, class193.method1469(var139, var138, (byte) -47, class119.field1826) - var132, var134 - -class360.field5718, class360.field5718 + var135, var136, var137, var130, var133);
                var156.method2367(false, class360.field5718 + var134, var140, var155, class193.method1469(var155, var140, (byte) -47, class119.field1826) - var133);
                class72.field1075.method2245(new class176(var156), 66);
            }
        } else if (class123.field1966 == 49) {
            int var122 = class244.field3803.method314((byte) 87);
            int var123 = class244.field3803.method281(-126);
            class43.method437(127, var122).method1566(var123, (byte) 28);
        } else if (class123.field1966 == 146) {
            int var1 = class244.field3803.method281(80);
            int var2 = ((var1 & 0x77) >> 4) + class300.field4647;
            int var3 = class168.field2673 + (var1 & 0x7);
            int var4 = class244.field3803.method286((byte) 96) + var2;
            int var5 = var3 + class244.field3803.method286((byte) 124);
            int var6 = class244.field3803.method296(-71);
            int var7 = class244.field3803.method314((byte) 36);
            int var8 = class244.field3803.method281(-128) * 4;
            int var9 = class244.field3803.method281(-125) * 4;
            int var10 = class244.field3803.method314((byte) 125);
            int var11 = class244.field3803.method314((byte) 76);
            int var12 = class244.field3803.method281(-127);
            int var13 = class244.field3803.method281(-124);
            if (var12 == 255) {
                var12 = -1;
            }
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104 && var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var7 != 65535) {
                int var14 = var3 * 128 + 64;
                int var15 = var2 * 128 + 64;
                int var16 = var4 * 128 + 64;
                int var17 = var5 * 128 + 64;
                class337 var18 = new class337(var7, class119.field1826, var15, var14, class193.method1469(var14, var15, (byte) -47, class119.field1826) - var8, class360.field5718 + var10, var11 + class360.field5718, var12, var13, var6, var9);
                var18.method2367(false, class360.field5718 + var10, var16, var17, class193.method1469(var17, var16, (byte) -47, class119.field1826) - var9);
                class72.field1075.method2245(new class176(var18), 89);
            }
        } else if (class123.field1966 == 17) {
            int var19 = class244.field3803.method275(2);
            int var20 = class244.field3803.method305(-32769);
            int var21 = var20 >> 2;
            int var22 = var20 & 0x3;
            int var23 = class113.field1742[var21];
            int var24 = class244.field3803.method281(-124);
            int var25 = class168.field2673 + (var24 & 0x7);
            int var26 = (var24 >> 4 & 0x7) + class300.field4647;
            if (var26 >= 0 && var25 >= 0 && var26 < 104 && var25 < 104) {
                class338.method2374(var26, 15, var23, -1, class119.field1826, 0, var21, var22, var19, var25);
            }
        } else if (class123.field1966 == 81) {
            int var27 = class244.field3803.method281(113);
            int var28 = ((var27 & 0x72) >> 4) + class300.field4647;
            int var29 = (var27 & 0x7) + class168.field2673;
            int var30 = class244.field3803.method307((byte) -95);
            int var31 = var30 >> 2;
            int var32 = var30 & 0x3;
            int var33 = class113.field1742[var31];
            int var34 = class244.field3803.method275(2);
            if (var34 == 65535) {
                var34 = -1;
            }
            class303.method2188(var34, var32, var31, var28, 3, class119.field1826, var29, var33);
        } else if (class123.field1966 == 50) {
            int var113 = class244.field3803.method281(-128);
            int var114 = (var113 >> 4 & 0x7) + class300.field4647;
            int var115 = (var113 & 0x7) + class168.field2673;
            int var116 = class244.field3803.method314((byte) 92);
            int var117 = class244.field3803.method281(17);
            int var118 = class244.field3803.method314((byte) 89);
            if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
                int var119 = var115 * 128 + 64;
                int var120 = var114 * 128 + 64;
                class3 var121 = new class3(var116, class119.field1826, var120, var119, class193.method1469(var119, var120, (byte) -47, class119.field1826) - var117, var118, class360.field5718);
                class356.field5668.method2245(new class76(var121), 39);
            }
        } else {
            int var35 = -20 / ((arg0 + 1) / 60);
            if (class123.field1966 == 200) {
                int var104 = class244.field3803.method281(-127);
                int var105 = ((var104 & 0x76) >> 4) + class300.field4647;
                int var106 = (var104 & 0x7) + class168.field2673;
                int var107 = class244.field3803.method314((byte) 41);
                int var108 = class244.field3803.method314((byte) 91);
                int var109 = class244.field3803.method314((byte) 77);
                if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104) {
                    class317 var110 = class349.field5540[class119.field1826][var105][var106];
                    if (var110 != null) {
                        for (class236 var111 = (class236) var110.method2244((byte) -125); var111 != null; var111 = (class236) var110.method2241(-1)) {
                            class4 var112 = var111.field3669;
                            if ((var107 & 0x7FFF) == var112.field51 && var112.field55 == var108) {
                                var112.field55 = var109;
                                break;
                            }
                        }
                        class18.method207(var106, var105, true);
                    }
                }
            } else {
                if (class123.field1966 == 173) {
                    int var36 = class244.field3803.method287(128);
                    int var37 = var36 & 0x3;
                    int var38 = var36 >> 2;
                    byte var39 = class244.field3803.method286((byte) 91);
                    byte var40 = class244.field3803.method292(-114);
                    int var41 = class244.field3803.method305(-32769);
                    int var42 = ((var41 & 0x70) >> 4) + class300.field4647;
                    int var43 = (var41 & 0x7) + class168.field2673;
                    int var44 = class244.field3803.method261((byte) -112);
                    int var45 = class244.field3803.method264(-128);
                    int var46 = class244.field3803.method314((byte) 41);
                    byte var47 = class244.field3803.method292(-124);
                    int var48 = class244.field3803.method261((byte) 83);
                    byte var49 = class244.field3803.method286((byte) 119);
                    if (!class240.field3737) {
                        class162.method1296(0, var44, var37, var49, var43, var38, var39, var48, var46, var40, var47, var42, var45);
                    }
                }
                if (class123.field1966 == 90) {
                    int var50 = class244.field3803.method307((byte) -72);
                    int var51 = var50 & 0x3;
                    int var52 = var50 >> 2;
                    int var53 = class113.field1742[var52];
                    int var54 = class244.field3803.method281(14);
                    int var55 = ((var54 & 0x75) >> 4) + class300.field4647;
                    int var56 = (var54 & 0x7) + class168.field2673;
                    if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
                        class338.method2374(var55, 15, var53, -1, class119.field1826, 0, var52, var51, -1, var56);
                    }
                } else if (class123.field1966 == 113) {
                    int var57 = class244.field3803.method281(89);
                    int var58 = ((var57 & 0xFC) >> 4) + class300.field4647 * 2;
                    int var59 = (var57 & 0xF) + class168.field2673 * 2;
                    int var60 = class244.field3803.method286((byte) 127) + var58;
                    int var61 = class244.field3803.method286((byte) 117) + var59;
                    int var62 = class244.field3803.method296(-102);
                    int var63 = class244.field3803.method314((byte) 42);
                    int var64 = class244.field3803.method281(-125) * 4;
                    int var65 = class244.field3803.method281(21) * 4;
                    int var66 = class244.field3803.method314((byte) 127);
                    int var67 = class244.field3803.method314((byte) 80);
                    int var68 = class244.field3803.method281(77);
                    int var69 = class244.field3803.method281(53);
                    if (var68 == 255) {
                        var68 = -1;
                    }
                    if (var58 >= 0 && var59 >= 0 && var58 < 208 && var59 < 208 && var60 >= 0 && var61 >= 0 && var60 < 208 && var61 < 208 && var63 != 65535) {
                        int var70 = var59 * 64;
                        int var71 = var58 * 64;
                        class337 var72 = new class337(var63, class119.field1826, var71, var70, class193.method1469(var70, var71, (byte) -47, class119.field1826) - var64, class360.field5718 + var66, var67 + class360.field5718, var68, var69, var62, var65);
                        int var73 = var61 * 64;
                        int var74 = var60 * 64;
                        var72.method2367(false, class360.field5718 + var66, var74, var73, class193.method1469(var73, var74, (byte) -47, class119.field1826) - var65);
                        class72.field1075.method2245(new class176(var72), 90);
                    }
                } else if (class123.field1966 == 21) {
                    int var98 = class244.field3803.method281(-127);
                    int var99 = (var98 & 0x7) + class168.field2673;
                    int var100 = (var98 >> 4 & 0x7) + class300.field4647;
                    int var101 = class244.field3803.method314((byte) 89);
                    int var102 = class244.field3803.method275(2);
                    if (var100 >= 0 && var99 >= 0 && var100 < 104 && var99 < 104) {
                        class4 var103 = new class4();
                        var103.field51 = var102;
                        var103.field55 = var101;
                        if (class349.field5540[class119.field1826][var100][var99] == null) {
                            class349.field5540[class119.field1826][var100][var99] = new class317();
                        }
                        class349.field5540[class119.field1826][var100][var99].method2245(new class236(var103), 40);
                        class18.method207(var99, var100, true);
                    }
                } else if (class123.field1966 == 130) {
                    int var75 = class244.field3803.method305(-32769);
                    int var76 = (var75 & 0x7) + class168.field2673;
                    int var77 = (var75 >> 4 & 0x7) + class300.field4647;
                    int var78 = class244.field3803.method261((byte) -117);
                    if (var77 >= 0 && var76 >= 0 && var77 < 104 && var76 < 104) {
                        class317 var79 = class349.field5540[class119.field1826][var77][var76];
                        if (var79 != null) {
                            for (class236 var80 = (class236) var79.method2244((byte) -127); var80 != null; var80 = (class236) var79.method2241(-1)) {
                                if ((var78 & 0x7FFF) == var80.field3669.field51) {
                                    var80.method1357(947647010);
                                    break;
                                }
                            }
                            if (var79.method2244((byte) -128) == null) {
                                class349.field5540[class119.field1826][var77][var76] = null;
                            }
                            class18.method207(var76, var77, true);
                        }
                    }
                } else if (class123.field1966 == 134) {
                    int var81 = class244.field3803.method275(2);
                    int var82 = class244.field3803.method274((byte) -11);
                    int var83 = class244.field3803.method281(95);
                    int var84 = (var83 >> 4 & 0x7) + class300.field4647;
                    int var85 = (var83 & 0x7) + class168.field2673;
                    int var86 = class244.field3803.method275(2);
                    if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104 && class118.field1813 != var82) {
                        class4 var87 = new class4();
                        var87.field51 = var81;
                        var87.field55 = var86;
                        if (class349.field5540[class119.field1826][var84][var85] == null) {
                            class349.field5540[class119.field1826][var84][var85] = new class317();
                        }
                        class349.field5540[class119.field1826][var84][var85].method2245(new class236(var87), 37);
                        class18.method207(var85, var84, true);
                    }
                } else if (class123.field1966 == 179) {
                    int var88 = class244.field3803.method281(-126);
                    int var89 = (var88 & 0x7) + class168.field2673;
                    int var90 = ((var88 & 0x7B) >> 4) + class300.field4647;
                    int var91 = class244.field3803.method314((byte) 125);
                    if (var91 == 65535) {
                        var91 = -1;
                    }
                    int var92 = class244.field3803.method281(-125);
                    int var93 = var92 & 0x7;
                    int var94 = var92 >> 4 & 0xF;
                    int var95 = class244.field3803.method281(-127);
                    int var96 = class244.field3803.method281(-124);
                    if (var90 >= 0 && var89 >= 0 && var90 < 104 && var89 < 104) {
                        int var97 = var94 + 1;
                        if (class173.field2746.field1300[0] >= var90 - var97 && var90 + var97 >= class173.field2746.field1300[0] && var89 - var97 <= class173.field2746.field1290[0] && class173.field2746.field1290[0] <= (var89 + var97) && class287.field4454 != 0 && var93 > 0 && class181.field2851 < 50 && var91 != -1) {
                            class173.field2745[class181.field2851] = var91;
                            class192.field3023[class181.field2851] = var93;
                            class228.field3557[class181.field2851] = var95;
                            class201.field3108[class181.field2851] = null;
                            class297.field4618[class181.field2851] = (var90 << 16) + (var89 << 8) + var94;
                            class43.field694[class181.field2851] = var96;
                            class181.field2851++;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 623)
    public static void method1254(int arg0) {
        int var1 = 88 / ((arg0 + 53) / 33);
        field2468 = null;
        field2472 = null;
        field2460 = null;
        field2471 = null;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I", line = 634)
    public final int method1255(int arg0, int arg1) {
        field2470++;
        int var3 = (this.field2467.length >> 1) - 1;
        if (arg0 != -20168) {
            field2465 = -49;
        }
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field2467[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2467[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z[[I)V", line = 670)
    public static final void method1256(boolean arg0, int[][] arg1) {
        field2469++;
        class133.field2235 = arg1;
        if (arg0) {
            field2463 = 114;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "([I)V", line = 683)
    public class151(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field2467 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field2467[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field2467[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field2467[var5 + var5] = arg0[var4];
            this.field2467[var5 + var5 + 1] = var4++;
        }
    }
}
