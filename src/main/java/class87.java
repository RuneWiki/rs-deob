import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class87 extends class64 {

    @OriginalMember(owner = "client!oc", name = "ob", descriptor = "Lmc;")
    public static class75 field2145 = class30.method234(true, "Mio");

    @OriginalMember(owner = "client!oc", name = "vb", descriptor = "J")
    public static long field2152 = 0L;

    @OriginalMember(owner = "client!oc", name = "nb", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!oc", name = "pb", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!oc", name = "qb", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!oc", name = "rb", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!oc", name = "sb", descriptor = "I")
    public int field2149;

    @OriginalMember(owner = "client!oc", name = "tb", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!oc", name = "ub", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!oc", name = "wb", descriptor = "I")
    public int field2153;

    @OriginalMember(owner = "client!oc", name = "xb", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V", line = 5)
    public static final void method724(int arg0) {
        field2147++;
        if (class107.field2692 == 27) {
            int var1 = class97.field2448.method494(20471);
            int var2 = var1 >> 2;
            int var3 = var1 & 0x3;
            int var4 = class45.field1107[var2];
            int var5 = class97.field2448.method519((byte) -110);
            int var6 = class65.field1710 + (var5 & 0x7);
            int var7 = class8.field147 + (var5 >> 4 & 0x7);
            if (var7 >= 0 && var6 >= 0 && var7 < 104 && var6 < 104) {
                class37.method284(var7, var3, var4, var6, -1, class99.field2510, 0, 1387, -1, var2);
            }
        } else if (class107.field2692 == 77) {
            int var8 = class97.field2448.method494(20471);
            int var9 = (var8 & 0x7) + class65.field1710;
            int var10 = (var8 >> 4 & 0x7) + class8.field147;
            int var11 = class97.field2448.method524(255);
            int var12 = class97.field2448.method514(-25530);
            if (var10 >= 0 && var9 >= 0 && var10 < 104 && var9 < 104) {
                class87 var13 = new class87();
                var13.field2149 = var12;
                var13.field2153 = var11;
                if (class112.field2847[class99.field2510][var10][var9] == null) {
                    class112.field2847[class99.field2510][var10][var9] = new class32();
                }
                class112.field2847[class99.field2510][var10][var9].method245(var13, 0);
                class109.method896(-106, var9, var10);
            }
        } else if (class107.field2692 == 160) {
            int var14 = class97.field2448.method524(255);
            int var15 = class97.field2448.method494(20471);
            int var16 = (var15 >> 4 & 0x7) + class8.field147;
            int var17 = class65.field1710 + (var15 & 0x7);
            int var18 = class97.field2448.method507((byte) -56);
            int var19 = class97.field2448.method524(255);
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104 && class92.field2285 != var19) {
                class87 var20 = new class87();
                var20.field2149 = var18;
                var20.field2153 = var14;
                if (class112.field2847[class99.field2510][var16][var17] == null) {
                    class112.field2847[class99.field2510][var16][var17] = new class32();
                }
                class112.field2847[class99.field2510][var16][var17].method245(var20, 0);
                class109.method896(-105, var17, var16);
            }
        } else {
            if (class107.field2692 == 54) {
                int var21 = class97.field2448.method494(20471);
                int var22 = class8.field147 + (var21 >> 4 & 0x7);
                int var23 = (var21 & 0x7) + class65.field1710;
                int var24 = class97.field2448.method507((byte) -34);
                int var25 = class97.field2448.method494(20471);
                int var26 = var25 & 0x7;
                int var27 = var25 >> 4 & 0xF;
                int var28 = class97.field2448.method494(20471);
                if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                    int var29 = var27 + 1;
                    if (var22 - var29 <= class52.field1315.field1270[0] && class52.field1315.field1270[0] <= var22 + var29 && var23 - var29 <= class52.field1315.field1236[0] && class52.field1315.field1236[0] <= var23 + var29 && class75.field1893 != 0 && var26 > 0 && class79.field1993 < 50) {
                        class98.field2464[class79.field1993] = var24;
                        class72.field1822[class79.field1993] = var26;
                        class36.field858[class79.field1993] = var28;
                        class109.field2766[class79.field1993] = null;
                        class58.field1449[class79.field1993] = (var23 << 8) + (var22 << 16) + var27;
                        class79.field1993++;
                    }
                }
            }
            if (class107.field2692 == 102) {
                int var30 = class97.field2448.method494(20471);
                int var31 = (var30 & 0x7) + class65.field1710;
                int var32 = class8.field147 + (var30 >> 4 & 0x7);
                int var33 = class97.field2448.method517(128) + var32;
                int var34 = class97.field2448.method517(128) + var31;
                int var35 = class97.field2448.method534(true);
                int var36 = class97.field2448.method507((byte) -74);
                int var37 = class97.field2448.method494(20471) * 4;
                int var38 = class97.field2448.method494(20471) * 4;
                int var39 = class97.field2448.method507((byte) -35);
                int var40 = class97.field2448.method507((byte) -111);
                int var41 = class97.field2448.method494(20471);
                int var42 = class97.field2448.method494(20471);
                if (var32 >= 0 && var31 >= 0 && var32 < 104 && var31 < 104 && var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && var36 != 65535) {
                    int var43 = var32 * 128 + 64;
                    int var44 = var33 * 128 + 64;
                    int var45 = var31 * 128 + 64;
                    int var46 = var34 * 128 + 64;
                    class108 var47 = new class108(var36, class99.field2510, var43, var45, class126.method1000(var45, class99.field2510, false, var43) - var37, class34.field781 + var39, class34.field781 + var40, var41, var42, var35, var38);
                    var47.method891(class34.field781 + var39, var46, var44, class126.method1000(var46, class99.field2510, false, var44) - var38, (byte) -93);
                    class52.field1312.method245(var47, 0);
                }
            } else if (class107.field2692 == 59) {
                int var48 = class97.field2448.method494(20471);
                int var49 = (var48 >> 4 & 0x7) + class8.field147;
                int var50 = (var48 & 0x7) + class65.field1710;
                int var51 = class97.field2448.method507((byte) -126);
                int var52 = class97.field2448.method507((byte) -117);
                int var53 = class97.field2448.method507((byte) -128);
                if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                    class32 var54 = class112.field2847[class99.field2510][var49][var50];
                    if (var54 != null) {
                        for (class87 var55 = (class87) var54.method248(32); var55 != null; var55 = (class87) var54.method252(64)) {
                            if ((var51 & 0x7FFF) == var55.field2153 && var55.field2149 == var52) {
                                var55.field2149 = var53;
                                break;
                            }
                        }
                        class109.method896(-124, var50, var49);
                    }
                }
            } else if (class107.field2692 == 203) {
                int var56 = class97.field2448.method519((byte) 81);
                int var57 = var56 >> 2;
                int var58 = class45.field1107[var57];
                int var59 = var56 & 0x3;
                int var60 = class97.field2448.method528(-129);
                int var61 = (var60 & 0x7) + class65.field1710;
                int var62 = class8.field147 + (var60 >> 4 & 0x7);
                int var63 = class97.field2448.method524(255);
                if (var62 >= 0 && var61 >= 0 && var62 < 104 && var61 < 104) {
                    class37.method284(var62, var59, var58, var61, var63, class99.field2510, 0, 1387, -1, var57);
                }
            } else if (class107.field2692 == 165) {
                int var64 = class97.field2448.method494(20471);
                int var65 = (var64 >> 4 & 0x7) + class8.field147;
                int var66 = (var64 & 0x7) + class65.field1710;
                int var67 = class97.field2448.method507((byte) -81);
                int var68 = class97.field2448.method494(20471);
                int var69 = class97.field2448.method507((byte) -51);
                if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104) {
                    int var70 = var66 * 128 + 64;
                    int var71 = var65 * 128 + 64;
                    class94 var72 = new class94(var67, class99.field2510, var71, var70, class126.method1000(var70, class99.field2510, false, var71) - var68, var69, class34.field781);
                    class31.field689.method245(var72, 0);
                }
            } else {
                if (class107.field2692 == 216) {
                    byte var73 = class97.field2448.method527(-338467704);
                    int var74 = class97.field2448.method514(-25530);
                    int var75 = class97.field2448.method524(255);
                    byte var76 = class97.field2448.method535(42);
                    byte var77 = class97.field2448.method535(122);
                    int var78 = class97.field2448.method528(-129);
                    int var79 = var78 >> 2;
                    int var80 = var78 & 0x3;
                    int var81 = class45.field1107[var79];
                    int var82 = class97.field2448.method516(false);
                    byte var83 = class97.field2448.method535(124);
                    int var84 = class97.field2448.method516(false);
                    int var85 = class97.field2448.method528(-129);
                    int var86 = class65.field1710 + (var85 & 0x7);
                    class122 var87;
                    if (class92.field2285 == var74) {
                        var87 = class52.field1315;
                    } else {
                        var87 = class40.field957[var74];
                    }
                    int var88 = class8.field147 + (var85 >> 4 & 0x7);
                    if (var87 != null) {
                        class59 var89 = class50.method387(-26274, var75);
                        int var90 = class15.field280[class99.field2510][var88][var86 + 1];
                        int var91 = class15.field280[class99.field2510][var88][var86];
                        int var92 = class15.field280[class99.field2510][var88 + 1][var86];
                        int var93 = class15.field280[class99.field2510][var88 + 1][var86 + 1];
                        class93 var94 = var89.method476(var90, var92, 68, var93, var91, var80, var79);
                        if (var94 != null) {
                            class37.method284(var88, 0, var81, var86, -1, class99.field2510, var84 + 1, 1387, var82 + 1, 0);
                            var87.field2990 = var94;
                            var87.field3002 = class34.field781 + var84;
                            if (var77 > var83) {
                                byte var95 = var77;
                                var77 = var83;
                                var83 = var95;
                            }
                            var87.field2998 = var82 + class34.field781;
                            int var96 = var89.field1525;
                            if (var76 < var73) {
                                byte var97 = var73;
                                var73 = var76;
                                var76 = var97;
                            }
                            int var98 = var89.field1530;
                            if (var80 == 1 || var80 == 3) {
                                var98 = var89.field1525;
                                var96 = var89.field1530;
                            }
                            var87.field2977 = var86 * 128 + var96 * 64;
                            var87.field2970 = var88 * 128 + var98 * 64;
                            var87.field2983 = class126.method1000(var87.field2977, class99.field2510, false, var87.field2970);
                            var87.field2991 = var77 + var88;
                            var87.field2968 = var86 + var73;
                            var87.field3006 = var88 + var83;
                            var87.field2987 = var86 + var76;
                        }
                    }
                }
                if (class107.field2692 == 92) {
                    int var99 = class97.field2448.method507((byte) -48);
                    int var100 = class97.field2448.method519((byte) 39);
                    int var101 = (var100 >> 4 & 0x7) + class8.field147;
                    int var102 = class65.field1710 + (var100 & 0x7);
                    if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
                        class32 var103 = class112.field2847[class99.field2510][var101][var102];
                        if (var103 != null) {
                            for (class87 var104 = (class87) var103.method248(32); var104 != null; var104 = (class87) var103.method252(76)) {
                                if ((var99 & 0x7FFF) == var104.field2153) {
                                    var104.method589(true);
                                    break;
                                }
                            }
                            if (var103.method248(32) == null) {
                                class112.field2847[class99.field2510][var101][var102] = null;
                            }
                            class109.method896(-106, var102, var101);
                        }
                    }
                } else if (class107.field2692 == 106) {
                    int var105 = class97.field2448.method507((byte) -115);
                    int var106 = class97.field2448.method515((byte) 66);
                    int var107 = (var106 & 0x7) + class65.field1710;
                    int var108 = (var106 >> 4 & 0x7) + class8.field147;
                    int var109 = class97.field2448.method519((byte) -112);
                    int var110 = var109 & 0x3;
                    int var111 = var109 >> 2;
                    int var112 = class45.field1107[var111];
                    if (var108 >= 0 && var107 >= 0 && var108 < 103 && var107 < 103) {
                        int var113 = class15.field280[class99.field2510][var108][var107];
                        int var114 = class15.field280[class99.field2510][var108 + 1][var107 + 1];
                        int var115 = class15.field280[class99.field2510][var108 + 1][var107];
                        int var116 = class15.field280[class99.field2510][var108][var107 + 1];
                        if (var112 == 0) {
                            class3 var117 = class107.field2679.method231(class99.field2510, var108, var107);
                            if (var117 != null) {
                                int var118 = var117.field48 >> 14 & 0x7FFF;
                                if (var111 == 2) {
                                    var117.field41 = new class127(var118, 2, var110 + 4, var113, var115, var114, var116, var105, false);
                                    var117.field49 = new class127(var118, 2, var110 + 1 & 0x3, var113, var115, var114, var116, var105, false);
                                } else {
                                    var117.field41 = new class127(var118, var111, var110, var113, var115, var114, var116, var105, false);
                                }
                            }
                        }
                        if (var112 == 1) {
                            class131 var119 = class107.field2679.method220(class99.field2510, var108, var107);
                            if (var119 != null) {
                                var119.field3177 = new class127(var119.field3193 >> 14 & 0x7FFF, 4, 0, var113, var115, var114, var116, var105, false);
                            }
                        }
                        if (var112 == 2) {
                            if (var111 == 11) {
                                var111 = 10;
                            }
                            class125 var120 = class107.field2679.method183(class99.field2510, var108, var107);
                            if (var120 != null) {
                                var120.field3054 = new class127(var120.field3064 >> 14 & 0x7FFF, var111, var110, var113, var115, var114, var116, var105, false);
                            }
                        }
                        if (var112 == 3) {
                            class78 var121 = class107.field2679.method216(class99.field2510, var108, var107);
                            if (var121 != null) {
                                var121.field1961 = new class127(var121.field1960 >> 14 & 0x7FFF, 22, var110, var113, var115, var114, var116, var105, false);
                            }
                        }
                    }
                } else {
                    int var122 = 16 % ((arg0 - 29) / 55);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIII)V", line = 551)
    public static final void method725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2144++;
        if (!class92.field2270) {
            arg1 = 0;
        }
        if (class3.field51 == arg0 && class108.field2739 == arg5 && class28.field591 == arg1) {
            return;
        }
        class28.field591 = arg1;
        class108.field2739 = arg5;
        class3.field51 = arg0;
        class17.method121(25, -9411);
        class26.method173(false, null, 114, class7.field96);
        int var6 = class55.field1367;
        int var7 = class62.field1618;
        class62.field1618 = (arg0 - 6) * 8;
        class55.field1367 = (arg5 - 6) * 8;
        int var8 = class62.field1618 - var7;
        int var9 = class55.field1367 - var6;
        int var10 = class62.field1618;
        int var11 = class55.field1367;
        for (int var12 = 0; var12 < 32768; var12++) {
            class97 var28 = class12.field231[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field1270[var29] -= var8;
                    var28.field1236[var29] -= var9;
                }
                var28.field1242 -= var9 * 128;
                var28.field1233 -= var8 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class122 var26 = class40.field957[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field1270[var27] -= var8;
                    var26.field1236[var27] -= var9;
                }
                var26.field1242 -= var9 * 128;
                var26.field1233 -= var8 * 128;
            }
        }
        class99.field2510 = arg1;
        class52.field1315.method394(arg3, false, true, arg4);
        byte var14 = 0;
        byte var15 = 104;
        byte var16 = 0;
        byte var17 = 104;
        byte var18 = 1;
        if (var9 < 0) {
            var18 = -1;
            var17 = -1;
            var16 = 103;
        }
        byte var19 = 1;
        if (var8 < 0) {
            var15 = -1;
            var14 = 103;
            var19 = -1;
        }
        for (int var20 = var14; var20 != var15; var20 += var19) {
            for (int var22 = var16; var22 != var17; var22 += var18) {
                int var23 = var8 + var20;
                int var24 = var9 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class112.field2847[var25][var20][var22] = class112.field2847[var25][var23][var24];
                    } else {
                        class112.field2847[var25][var20][var22] = null;
                    }
                }
            }
        }
        if (arg2 != -8628) {
            field2145 = null;
        }
        for (class24 var21 = (class24) class40.field949.method248(32); var21 != null; var21 = (class24) class40.field949.method252(82)) {
            var21.field473 -= var8;
            var21.field457 -= var9;
            if (var21.field473 < 0 || var21.field457 < 0 || var21.field473 >= 104 || var21.field457 >= 104) {
                var21.method589(true);
            }
        }
        class79.field1993 = 0;
        if (class74.field1853 != 0) {
            class37.field892 -= var9;
            class74.field1853 -= var8;
        }
        class129.field3152 = false;
        class88.field2160 = -1;
        class31.field689.method256(false);
        class52.field1312.method256(false);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Led;IIIIILba;ZII)V", line = 742)
    public static final void method726(class29 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class8 arg6, boolean arg7, int arg8, int arg9) {
        field2146++;
        int var10 = class15.field280[arg3][arg5][arg2];
        int var11 = class15.field280[arg3][arg5 + 1][arg2];
        int var12 = class15.field280[arg3][arg5 + 1][arg2 + 1];
        int var13 = class15.field280[arg3][arg5][arg2 + 1];
        if (arg7) {
            method728(-126);
        }
        int var14 = var10 + var11 + var13 + var12 >> 2;
        int var15 = (arg2 << 7) + (arg1 << 14) + arg5 + 1073741824;
        class59 var16 = class50.method387(-26274, arg1);
        if (var16.field1521 == 0) {
            var15 += Integer.MIN_VALUE;
        }
        int var17 = (arg9 << 6) + arg8;
        if (var16.field1488 == 1) {
            var17 += 256;
        }
        if (arg8 == 22) {
            class64 var18;
            if (var16.field1491 == -1 && var16.field1484 == null) {
                var18 = var16.method476(var13, var11, 68, var12, var10, arg9, 22);
            } else {
                var18 = new class127(arg1, 22, arg9, var10, var11, var12, var13, var16.field1491, true);
            }
            arg0.method229(arg4, arg5, arg2, var14, var18, var15, var17);
            if (var16.field1508 && var16.field1521 == 1) {
                arg6.method43(2097152, arg2, arg5);
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class64 var38;
            if (var16.field1491 == -1 && var16.field1484 == null) {
                var38 = var16.method476(var13, var11, 68, var12, var10, arg9, 10);
            } else {
                var38 = new class127(arg1, 10, arg9, var10, var11, var12, var13, var16.field1491, true);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg9 == 1 || arg9 == 3) {
                    var40 = var16.field1525;
                    var39 = var16.field1530;
                } else {
                    var39 = var16.field1525;
                    var40 = var16.field1530;
                }
                int var41 = 0;
                if (arg8 == 11) {
                    var41 += 256;
                }
                arg0.method205(arg4, arg5, arg2, var14, var40, var39, var38, var41, var15, var17);
            }
            if (var16.field1508) {
                arg6.method38(arg2, arg5, var16.field1530, var16.field1486, arg9, 256, var16.field1525);
            }
        } else if (arg8 >= 12) {
            class64 var19;
            if (var16.field1491 == -1 && var16.field1484 == null) {
                var19 = var16.method476(var13, var11, 68, var12, var10, arg9, arg8);
            } else {
                var19 = new class127(arg1, arg8, arg9, var10, var11, var12, var13, var16.field1491, true);
            }
            arg0.method205(arg4, arg5, arg2, var14, 1, 1, var19, 0, var15, var17);
            if (var16.field1508) {
                arg6.method38(arg2, arg5, var16.field1530, var16.field1486, arg9, 256, var16.field1525);
            }
        } else if (arg8 == 0) {
            class64 var20;
            if (var16.field1491 == -1 && var16.field1484 == null) {
                var20 = var16.method476(var13, var11, 68, var12, var10, arg9, 0);
            } else {
                var20 = new class127(arg1, 0, arg9, var10, var11, var12, var13, var16.field1491, true);
            }
            arg0.method230(arg4, arg5, arg2, var14, var20, null, class5.field68[arg9], 0, var15, var17);
            if (var16.field1508) {
                arg6.method50(arg9, arg8, arg5, var16.field1486, arg2, 1);
            }
        } else if (arg8 == 1) {
            class64 var21;
            if (var16.field1491 == -1 && var16.field1484 == null) {
                var21 = var16.method476(var13, var11, 68, var12, var10, arg9, 1);
            } else {
                var21 = new class127(arg1, 1, arg9, var10, var11, var12, var13, var16.field1491, true);
            }
            arg0.method230(arg4, arg5, arg2, var14, var21, null, class35.field828[arg9], 0, var15, var17);
            if (var16.field1508) {
                arg6.method50(arg9, arg8, arg5, var16.field1486, arg2, 1);
            }
        } else if (arg8 == 2) {
            int var22 = arg9 + 1 & 0x3;
            class64 var23;
            class64 var24;
            if (var16.field1491 == -1 && var16.field1484 == null) {
                var23 = var16.method476(var13, var11, 68, var12, var10, arg9 + 4, 2);
                var24 = var16.method476(var13, var11, 68, var12, var10, var22, 2);
            } else {
                var23 = new class127(arg1, 2, arg9 + 4, var10, var11, var12, var13, var16.field1491, true);
                var24 = new class127(arg1, 2, var22, var10, var11, var12, var13, var16.field1491, true);
            }
            arg0.method230(arg4, arg5, arg2, var14, var23, var24, class5.field68[arg9], class5.field68[var22], var15, var17);
            if (var16.field1508) {
                arg6.method50(arg9, arg8, arg5, var16.field1486, arg2, 1);
            }
        } else if (arg8 == 3) {
            class64 var25;
            if (var16.field1491 == -1 && var16.field1484 == null) {
                var25 = var16.method476(var13, var11, 68, var12, var10, arg9, 3);
            } else {
                var25 = new class127(arg1, 3, arg9, var10, var11, var12, var13, var16.field1491, true);
            }
            arg0.method230(arg4, arg5, arg2, var14, var25, null, class35.field828[arg9], 0, var15, var17);
            if (var16.field1508) {
                arg6.method50(arg9, arg8, arg5, var16.field1486, arg2, 1);
            }
        } else if (arg8 == 9) {
            class64 var26;
            if (var16.field1491 == -1 && var16.field1484 == null) {
                var26 = var16.method476(var13, var11, 68, var12, var10, arg9, arg8);
            } else {
                var26 = new class127(arg1, arg8, arg9, var10, var11, var12, var13, var16.field1491, true);
            }
            arg0.method205(arg4, arg5, arg2, var14, 1, 1, var26, 0, var15, var17);
            if (var16.field1508) {
                arg6.method38(arg2, arg5, var16.field1530, var16.field1486, arg9, 256, var16.field1525);
            }
        } else {
            if (var16.field1500) {
                if (arg9 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg9 == 2) {
                    int var29 = var13;
                    var13 = var11;
                    var11 = var29;
                    int var30 = var12;
                    var12 = var10;
                    var10 = var30;
                } else if (arg9 == 3) {
                    int var28 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var28;
                }
            }
            if (arg8 == 4) {
                class64 var31;
                if (var16.field1491 == -1 && var16.field1484 == null) {
                    var31 = var16.method476(var13, var11, 68, var12, var10, 0, 4);
                } else {
                    var31 = new class127(arg1, 4, 0, var10, var11, var12, var13, var16.field1491, true);
                }
                arg0.method215(arg4, arg5, arg2, var14, var31, class5.field68[arg9], arg9 * 512, 0, 0, var15, var17);
            } else if (arg8 == 5) {
                int var32 = 16;
                int var33 = arg0.method207(arg4, arg5, arg2);
                if (var33 > 0) {
                    var32 = class50.method387(-26274, var33 >> 14 & 0x7FFF).field1509;
                }
                class64 var34;
                if (var16.field1491 == -1 && var16.field1484 == null) {
                    var34 = var16.method476(var13, var11, 68, var12, var10, 0, 4);
                } else {
                    var34 = new class127(arg1, 4, 0, var10, var11, var12, var13, var16.field1491, true);
                }
                arg0.method215(arg4, arg5, arg2, var14, var34, class5.field68[arg9], arg9 * 512, class63.field1668[arg9] * var32, class117.field2894[arg9] * var32, var15, var17);
            } else if (arg8 == 6) {
                class64 var35;
                if (var16.field1491 == -1 && var16.field1484 == null) {
                    var35 = var16.method476(var13, var11, 68, var12, var10, 0, 4);
                } else {
                    var35 = new class127(arg1, 4, 0, var10, var11, var12, var13, var16.field1491, true);
                }
                arg0.method215(arg4, arg5, arg2, var14, var35, 256, arg9, 0, 0, var15, var17);
            } else if (arg8 == 7) {
                class64 var36;
                if (var16.field1491 == -1 && var16.field1484 == null) {
                    var36 = var16.method476(var13, var11, 68, var12, var10, 0, 4);
                } else {
                    var36 = new class127(arg1, 4, 0, var10, var11, var12, var13, var16.field1491, true);
                }
                arg0.method215(arg4, arg5, arg2, var14, var36, 512, arg9, 0, 0, var15, var17);
            } else if (arg8 == 8) {
                class64 var37;
                if (var16.field1491 == -1 && var16.field1484 == null) {
                    var37 = var16.method476(var13, var11, 68, var12, var10, 0, 4);
                } else {
                    var37 = new class127(arg1, 4, 0, var10, var11, var12, var13, var16.field1491, true);
                }
                arg0.method215(arg4, arg5, arg2, var14, var37, 768, arg9, 0, 0, var15, var17);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lmc;B)Z", line = 1055)
    public static final boolean method727(class75 arg0, byte arg1) {
        field2148++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class12.field226; var2++) {
            if (arg0.method634(class12.field242[var2], 1)) {
                return true;
            }
        }
        int var3 = -118 % ((arg1 - 64) / 48);
        return arg0.method634(class52.field1315.field3003, 1);
    }

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)V", line = 1090)
    public static void method728(int arg0) {
        field2145 = null;
        if (arg0 != 1) {
            method725(-32, 94, -67, 7, 115, -3);
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Z)Lpc;", line = 1104)
    public final class93 method561(boolean arg0) {
        field2151++;
        return arg0 ? null : class43.method326(this.field2153, 0).method65(true, this.field2149, false);
    }
}
