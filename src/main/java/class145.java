import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class145 extends class12 {

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "[I")
    public int[] field3174 = new int[1];

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "[I")
    public int[] field3188 = new int[] { -1 };

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "Lpe;")
    public static class109 field3177 = class141.method1120("Das ist eine Mitglieder)2Welt(Q", 0);

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "Lpe;")
    private static class109 field3176 = class141.method1120("flash2:", 0);

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "Lpe;")
    public static class109 field3178 = class141.method1120("Ein kostenloses Spielkonto erstellen)3", 0);

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "Lpe;")
    public static class109 field3182 = field3176;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
    public static int field3187 = 0;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "Lpe;")
    public static class109 field3181 = field3176;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "Lpe;")
    public static class109 field3179 = class141.method1120("<col=ff7000>", 0);

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "Lpe;")
    public static class109 field3180 = class141.method1120("RuneScape wurde aktualisiert(Q", 0);

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "Lpe;")
    public static class109 field3189 = class141.method1120("::gc", 0);

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "[Lk;")
    public static class69[] field3183;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)V")
    public static final void method1138(byte arg0) {
        field3173++;
        class82.field1733.method527((byte) -59);
        int var1 = class82.field1733.method526((byte) 127, 1);
        if (var1 == 0) {
            return;
        }
        if (arg0 > -9) {
            field3183 = null;
        }
        int var2 = class82.field1733.method526((byte) 127, 2);
        if (var2 == 0) {
            class84.field1784[class42.field869++] = 2047;
        } else if (var2 == 1) {
            int var3 = class82.field1733.method526((byte) 127, 3);
            class136.field2975.method1127(-29576, false, var3);
            int var4 = class82.field1733.method526((byte) 127, 1);
            if (var4 == 1) {
                class84.field1784[class42.field869++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class82.field1733.method526((byte) 127, 3);
            class136.field2975.method1127(-29576, true, var5);
            int var6 = class82.field1733.method526((byte) 127, 3);
            class136.field2975.method1127(-29576, true, var6);
            int var7 = class82.field1733.method526((byte) 127, 1);
            if (var7 == 1) {
                class84.field1784[class42.field869++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class82.field1733.method526((byte) 127, 7);
            int var9 = class82.field1733.method526((byte) 127, 7);
            class75.field1513 = class82.field1733.method526((byte) 127, 2);
            int var10 = class82.field1733.method526((byte) 127, 1);
            int var11 = class82.field1733.method526((byte) 127, 1);
            if (var11 == 1) {
                class84.field1784[class42.field869++] = 2047;
            }
            class136.field2975.method1125(var10 == 1, var8, 4683, var9);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILwa;)Lpe;")
    public static final class109 method1139(int arg0, int arg1, class154 arg2) {
        if (arg1 != 25678) {
            field3178 = null;
        }
        field3185++;
        if (!class79.method636(arg0, arg1 ^ 0x644F, class136.method1084(0, arg2)) && arg2.field3470 == null) {
            return null;
        } else if (arg2.field3445 == null || arg0 >= arg2.field3445.length || arg2.field3445[arg0] == null || arg2.field3445[arg0].method870(-56).method898((byte) 122) == 0) {
            return class14.field380 ? class44.method405(new class109[] { class84.field1776, class143.method1132(arg0, 86) }, (byte) -74) : null;
        } else {
            return arg2.field3445[arg0];
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(III)I")
    public static final int method1140(int arg0, int arg1, int arg2) {
        field3172++;
        int var3 = class7.method68((byte) 59, arg2 + 91923, 4, arg1 + 45365) + (class7.method68((byte) -102, arg2 + 37821, arg0, arg1 - -10294) - 128 >> 1) + (class7.method68((byte) 104, arg2, 1, arg1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(B)V")
    public static final void method1141(byte arg0) {
        field3184++;
        if (class17.field423 == 10) {
            int var1 = class82.field1733.method111(120);
            int var2 = class82.field1733.method108(0);
            int var3 = (var2 >> 4 & 0x7) + class13.field333;
            int var4 = class17.field432 + (var2 & 0x7);
            int var5 = class82.field1733.method111(126);
            int var6 = class82.field1733.method105(1375221240);
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && class112.field2436 != var1) {
                class131 var7 = new class131();
                var7.field2882 = var5;
                var7.field2870 = var6;
                if (class92.field1987[class75.field1513][var3][var4] == null) {
                    class92.field1987[class75.field1513][var3][var4] = new class19();
                }
                class92.field1987[class75.field1513][var3][var4].method188(-2, var7);
                class68.method534(var3, var4, -1610612736);
            }
            return;
        }
        if (class17.field423 == 68) {
            byte var8 = class82.field1733.method137(128);
            int var9 = class82.field1733.method111(101);
            byte var10 = class82.field1733.method131(false);
            int var11 = class82.field1733.method111(122);
            int var12 = class82.field1733.method105(1375221240);
            int var13 = class82.field1733.method128((byte) 83);
            byte var14 = class82.field1733.method137(128);
            byte var15 = class82.field1733.method131(false);
            int var16 = class82.field1733.method132((byte) -3);
            int var17 = var16 >> 2;
            int var18 = var16 & 0x3;
            int var19 = class4.field90[var17];
            int var20 = class82.field1733.method142(27467);
            int var21 = (var20 >> 4 & 0x7) + class13.field333;
            int var22 = (var20 & 0x7) + class17.field432;
            class50 var23;
            if (class112.field2436 == var12) {
                var23 = class136.field2975;
            } else {
                var23 = class104.field2194[var12];
            }
            if (var23 != null) {
                class148 var24 = class89.method736(var13, 11893);
                int var25;
                int var26;
                if (var18 == 1 || var18 == 3) {
                    var26 = var24.field3268;
                    var25 = var24.field3240;
                } else {
                    var25 = var24.field3268;
                    var26 = var24.field3240;
                }
                int[][] var27 = class83.field1775[class75.field1513];
                int var28 = var22 + (var25 + 1 >> 1);
                int var29 = var21 + (var26 + 1 >> 1);
                int var30 = (var25 >> 1) + var22;
                int var31 = (var26 >> 1) + var21;
                int var32 = (var21 << 7) + (var26 << 6);
                int var33 = var27[var29][var30] + var27[var31][var30] + var27[var29][var28] + var27[var31][var28] >> 2;
                int var34 = (var22 << 7) + (var25 << 6);
                class155 var35 = var24.method1156(var34, var18, var32, var27, var33, 19981, var17);
                if (var35 != null) {
                    if (var15 < var10) {
                        byte var36 = var10;
                        var10 = var15;
                        var15 = var36;
                    }
                    if (var14 < var8) {
                        byte var37 = var8;
                        var8 = var14;
                        var14 = var37;
                    }
                    class77.method608((byte) -124, 0, var9 + 1, var21, var19, var11 + 1, -1, var22, class75.field1513, 0);
                    var23.field1042 = var10 + var21;
                    var23.field1060 = var21 * 128 + var26 * 64;
                    var23.field1058 = var14 + var22;
                    var23.field1033 = var8 + var22;
                    var23.field1055 = class12.field264 + var9;
                    var23.field1035 = var22 * 128 + var25 * 64;
                    var23.field1059 = var15 + var21;
                    var23.field1031 = var35;
                    var23.field1044 = class12.field264 + var11;
                    var23.field1049 = var33;
                }
            }
        }
        if (class17.field423 == 140) {
            int var38 = class82.field1733.method142(27467);
            int var39 = (var38 >> 4 & 0x7) + class13.field333;
            int var40 = (var38 & 0x7) + class17.field432;
            int var41 = class82.field1733.method132((byte) -36);
            int var42 = var41 >> 2;
            int var43 = var41 & 0x3;
            int var44 = class4.field90[var42];
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                class77.method608((byte) -116, var43, -1, var39, var44, 0, -1, var40, class75.field1513, var42);
            }
        } else if (class17.field423 == 66) {
            int var45 = class82.field1733.method142(27467);
            int var46 = (var45 >> 4 & 0x7) + class13.field333;
            int var47 = (var45 & 0x7) + class17.field432;
            int var48 = class82.field1733.method131(false) + var46;
            int var49 = class82.field1733.method131(false) + var47;
            int var50 = class82.field1733.method114(-8859);
            int var51 = class82.field1733.method105(1375221240);
            int var52 = class82.field1733.method142(27467) * 4;
            int var53 = class82.field1733.method142(27467) * 4;
            int var54 = class82.field1733.method105(1375221240);
            int var55 = class82.field1733.method105(1375221240);
            int var56 = class82.field1733.method142(27467);
            int var57 = class82.field1733.method142(27467);
            if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104 && var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104 && var51 != 65535) {
                int var58 = var48 * 128 + 64;
                int var59 = var46 * 128 + 64;
                int var60 = var47 * 128 + 64;
                int var61 = var49 * 128 + 64;
                class115 var62 = new class115(var51, class75.field1513, var59, var60, class126.method1019(var60, var59, 1, class75.field1513) - var52, var54 - -class12.field264, var55 + class12.field264, var56, var57, var50, var53);
                var62.method952(class12.field264 + var54, var61, class126.method1019(var61, var58, 1, class75.field1513) - var53, var58, 0);
                class147.field3209.method188(-2, var62);
            }
        } else if (class17.field423 == 75) {
            int var63 = class82.field1733.method120(18235);
            int var64 = (var63 >> 4 & 0x7) + class13.field333;
            int var65 = (var63 & 0x7) + class17.field432;
            int var66 = class82.field1733.method136(2);
            if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
                class19 var67 = class92.field1987[class75.field1513][var64][var65];
                if (var67 != null) {
                    for (class131 var68 = (class131) var67.method195((byte) 125); var68 != null; var68 = (class131) var67.method198((byte) -56)) {
                        if ((var66 & 0x7FFF) == var68.field2882) {
                            var68.method101((byte) 126);
                            break;
                        }
                    }
                    if (var67.method195((byte) 101) == null) {
                        class92.field1987[class75.field1513][var64][var65] = null;
                    }
                    class68.method534(var64, var65, -1610612736);
                }
            }
        } else if (class17.field423 == 22) {
            int var69 = class82.field1733.method128((byte) 83);
            int var70 = class82.field1733.method128((byte) 83);
            int var71 = class82.field1733.method142(27467);
            int var72 = (var71 & 0x7) + class17.field432;
            int var73 = (var71 >> 4 & 0x7) + class13.field333;
            if (var73 >= 0 && var72 >= 0 && var73 < 104 && var72 < 104) {
                class131 var74 = new class131();
                var74.field2882 = var69;
                var74.field2870 = var70;
                if (class92.field1987[class75.field1513][var73][var72] == null) {
                    class92.field1987[class75.field1513][var73][var72] = new class19();
                }
                class92.field1987[class75.field1513][var73][var72].method188(-2, var74);
                class68.method534(var73, var72, -1610612736);
            }
        } else if (class17.field423 == 129) {
            int var75 = class82.field1733.method142(27467);
            int var76 = class13.field333 + (var75 >> 4 & 0x7);
            int var77 = class17.field432 + (var75 & 0x7);
            int var78 = class82.field1733.method105(1375221240);
            int var79 = class82.field1733.method105(1375221240);
            int var80 = class82.field1733.method105(1375221240);
            if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                class19 var81 = class92.field1987[class75.field1513][var76][var77];
                if (var81 != null) {
                    for (class131 var82 = (class131) var81.method195((byte) 123); var82 != null; var82 = (class131) var81.method198((byte) -63)) {
                        if ((var78 & 0x7FFF) == var82.field2882 && var82.field2870 == var79) {
                            var82.field2870 = var80;
                            break;
                        }
                    }
                    class68.method534(var76, var77, -1610612736);
                }
            }
        } else {
            if (class17.field423 == 149) {
                int var83 = class82.field1733.method142(27467);
                int var84 = (var83 & 0x7) + class17.field432;
                int var85 = class13.field333 + (var83 >> 4 & 0x7);
                int var86 = class82.field1733.method105(1375221240);
                int var87 = class82.field1733.method142(27467);
                int var88 = var87 >> 4 & 0xF;
                int var89 = var87 & 0x7;
                int var90 = class82.field1733.method142(27467);
                if (var85 >= 0 && var84 >= 0 && var85 < 104 && var84 < 104) {
                    int var91 = var88 + 1;
                    if (var85 - var91 <= class136.field2975.field3120[0] && var85 + var91 >= class136.field2975.field3120[0] && class136.field2975.field3121[0] >= var84 - var91 && class136.field2975.field3121[0] <= var84 + var91 && class8.field201 != 0 && var89 > 0 && class64.field1320 < 50) {
                        class152.field3354[class64.field1320] = var86;
                        class43.field922[class64.field1320] = var89;
                        class131.field2868[class64.field1320] = var90;
                        class154.field3444[class64.field1320] = null;
                        class137.field2998[class64.field1320] = (var84 << 8) + (var85 << 16) + var88;
                        class64.field1320++;
                    }
                }
            }
            if (class17.field423 == 24) {
                int var92 = class82.field1733.method142(27467);
                int var93 = var92 & 0x3;
                int var94 = var92 >> 2;
                int var95 = class4.field90[var94];
                int var96 = class82.field1733.method108(0);
                int var97 = (var96 & 0x7) + class17.field432;
                int var98 = (var96 >> 4 & 0x7) + class13.field333;
                int var99 = class82.field1733.method105(1375221240);
                if (var98 >= 0 && var97 >= 0 && var98 < 104 && var97 < 104) {
                    class77.method608((byte) -127, var93, -1, var98, var95, 0, var99, var97, class75.field1513, var94);
                }
            } else if (class17.field423 == 107) {
                int var100 = class82.field1733.method142(27467);
                int var101 = class17.field432 + (var100 & 0x7);
                int var102 = (var100 >> 4 & 0x7) + class13.field333;
                int var103 = class82.field1733.method105(1375221240);
                int var104 = class82.field1733.method142(27467);
                int var105 = class82.field1733.method105(1375221240);
                if (var102 >= 0 && var101 >= 0 && var102 < 104 && var101 < 104) {
                    int var106 = var102 * 128 + 64;
                    int var107 = var101 * 128 + 64;
                    class35 var108 = new class35(var103, class75.field1513, var106, var107, class126.method1019(var107, var106, 1, class75.field1513) - var104, var105, class12.field264);
                    class83.field1769.method188(-2, var108);
                }
            } else {
                int var109 = 114 / ((arg0 - 58) / 58);
                if (class17.field423 == 67) {
                    int var110 = class82.field1733.method111(111);
                    int var111 = class82.field1733.method142(27467);
                    int var112 = var111 & 0x3;
                    int var113 = var111 >> 2;
                    int var114 = class4.field90[var113];
                    int var115 = class82.field1733.method142(27467);
                    int var116 = (var115 >> 4 & 0x7) + class13.field333;
                    int var117 = (var115 & 0x7) + class17.field432;
                    if (var116 >= 0 && var117 >= 0 && var116 < 103 && var117 < 103) {
                        if (var114 == 0) {
                            class110 var118 = class147.field3201.method700(class75.field1513, var116, var117);
                            if (var118 != null) {
                                int var119 = var118.field2342 >> 14 & 0x7FFF;
                                if (var113 == 2) {
                                    var118.field2329 = new class2(var119, 2, var112 + 4, class75.field1513, var116, var117, var110, false, var118.field2329);
                                    var118.field2336 = new class2(var119, 2, var112 + 1 & 0x3, class75.field1513, var116, var117, var110, false, var118.field2336);
                                } else {
                                    var118.field2329 = new class2(var119, var113, var112, class75.field1513, var116, var117, var110, false, var118.field2329);
                                }
                            }
                        }
                        if (var114 == 1) {
                            class149 var120 = class147.field3201.method676(class75.field1513, var116, var117);
                            if (var120 != null) {
                                int var121 = var120.field3302 >> 14 & 0x7FFF;
                                if (var113 == 4 || var113 == 5) {
                                    var120.field3297 = new class2(var121, 4, var112, class75.field1513, var116, var117, var110, false, var120.field3297);
                                } else if (var113 == 6) {
                                    var120.field3297 = new class2(var121, 4, var112 + 4, class75.field1513, var116, var117, var110, false, var120.field3297);
                                } else if (var113 == 7) {
                                    var120.field3297 = new class2(var121, 4, (var112 + 2 & 0x3) + 4, class75.field1513, var116, var117, var110, false, var120.field3297);
                                } else if (var113 == 8) {
                                    var120.field3297 = new class2(var121, 4, var112 + 4, class75.field1513, var116, var117, var110, false, var120.field3297);
                                    var120.field3292 = new class2(var121, 4, (var112 + 2 & 0x3) + 4, class75.field1513, var116, var117, var110, false, var120.field3292);
                                }
                            }
                        }
                        if (var114 == 2) {
                            if (var113 == 11) {
                                var113 = 10;
                            }
                            class17 var122 = class147.field3201.method655(class75.field1513, var116, var117);
                            if (var122 != null) {
                                var122.field422 = new class2(var122.field431 >> 14 & 0x7FFF, var113, var112, class75.field1513, var116, var117, var110, false, var122.field422);
                            }
                        }
                        if (var114 == 3) {
                            class114 var123 = class147.field3201.method702(class75.field1513, var116, var117);
                            if (var123 != null) {
                                var123.field2517 = new class2(var123.field2511 >> 14 & 0x7FFF, 22, var112, class75.field1513, var116, var117, var110, false, var123.field2517);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public static void method1142(int arg0) {
        field3183 = null;
        field3180 = null;
        field3177 = null;
        if (arg0 != -27104) {
            method1140(20, -125, -67);
        }
        field3178 = null;
        field3181 = null;
        field3189 = null;
        field3182 = null;
        field3176 = null;
        field3179 = null;
    }
}
