import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class90 extends class151 {

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "Lbg;")
    public static class19 field1585 = new class19();

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "Lmb;")
    public static class132 field1591 = class166.method1092("Ung-Ultiges Anmelde)2Paket)3", 127);

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "Lmb;")
    public static class132 field1595 = class166.method1092("<br>(X", 124);

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
    public static int field1592 = 2;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public int field1569;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public int field1570;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public int field1571;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public int field1572;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public int field1575;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public int field1576;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public int field1578;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
    public int field1579;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public int field1580;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    public int field1581;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public int field1582;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    public int field1599;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "Lnc;")
    public class144 field1597;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "Lqc;")
    public class177 field1577;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "Lui;")
    public class223 field1596;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "Leh;")
    public class53 field1594;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLpb;Lmb;Lmb;)[Lvi;")
    public static final class233[] method558(byte arg0, class165 arg1, class132 arg2, class132 arg3) {
        field1583++;
        int var4 = arg1.method1065(arg2, -1);
        if (arg0 == -17) {
            int var5 = arg1.method1090(arg0 + 16, arg3, var4);
            return class180.method1159(arg1, var5, -3, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([[II)V")
    public static final void method559(int[][] arg0, int arg1) {
        field1588++;
        if (arg1 != -26218) {
            method560(null, 48);
        }
        class61.field1033 = arg0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([Ltf;I)V")
    public static final void method560(class210[] arg0, int arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var113 = 0; var113 < 104; var113++) {
                for (int var114 = 0; var114 < 104; var114++) {
                    if ((class148.field2722[var2][var113][var114] & 0x1) == 1) {
                        int var115 = var2;
                        if ((class148.field2722[1][var113][var114] & 0x2) == 2) {
                            var115 = var2 - 1;
                        }
                        if (var115 >= 0) {
                            arg0[var115].method1304(var114, var113, (byte) 101);
                        }
                    }
                }
            }
        }
        int[][] var3 = new int[104][104];
        class122.field2281 += (int) (Math.random() * 5.0D) - 2;
        field1574++;
        if (class122.field2281 < -8) {
            class122.field2281 = -8;
        }
        if (class122.field2281 > 8) {
            class122.field2281 = 8;
        }
        int[][] var4 = new int[104][104];
        class46.field789 += (int) (Math.random() * 5.0D) - 2;
        if (class46.field789 < -16) {
            class46.field789 = -16;
        }
        if (class46.field789 > 16) {
            class46.field789 = 16;
        }
        int var5 = class46.field789 >> 1;
        int var6 = class122.field2281 >> 2 << 10;
        for (int var7 = 0; var7 < 4; var7++) {
            byte[][] var50 = class226.field4101[var7];
            byte var51 = 74;
            short var52 = 768;
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var52 * var53 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var103 = 1; var103 < 103; var103++) {
                    int var105 = class190.field3531[var7][var103 + 1][var55] - class190.field3531[var7][var103 - 1][var55];
                    int var106 = class190.field3531[var7][var103][var55 + 1] - class190.field3531[var7][var103][var55 - 1];
                    int var107 = (int) Math.sqrt((double) (var105 * var105 + var106 * var106 + 65536));
                    int var108 = (var105 << 8) / var107;
                    int var109 = -65536 / var107;
                    int var110 = (var106 << 8) / var107;
                    int var111 = (var109 * -10 + var108 * -50 + var110 * -50) / var54 + var51;
                    int var112 = (var50[var103][var55] >> 1) + ((var50[var103 - 1][var55] >> 2) + (var50[var103 + 1][var55] >> 3) - (-(var50[var103][var55 - 1] >> 2) + -(var50[var103][var55 + 1] >> 3)));
                    var3[var103][var55] = var111 - var112;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class141.field2653[var56] = 0;
                class4.field47[var56] = 0;
                class219.field4001[var56] = 0;
                class113.field2187[var56] = 0;
                class230.field4146[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var88 = 0; var88 < 104; var88++) {
                    int var97 = var57 + 5;
                    int var10002;
                    if (var97 < 104) {
                        int var98 = class165.field3020[var7][var97][var88] & 0xFF;
                        if (var98 > 0) {
                            class2 var99 = class23.method152(true, var98 - 1);
                            class141.field2653[var88] += var99.field26;
                            class4.field47[var88] += var99.field23;
                            class219.field4001[var88] += var99.field14;
                            class113.field2187[var88] += var99.field34;
                            var10002 = class230.field4146[var88]++;
                        }
                    }
                    int var100 = var57 - 5;
                    if (var100 >= 0) {
                        int var101 = class165.field3020[var7][var100][var88] & 0xFF;
                        if (var101 > 0) {
                            class2 var102 = class23.method152(true, var101 - 1);
                            class141.field2653[var88] -= var102.field26;
                            class4.field47[var88] -= var102.field23;
                            class219.field4001[var88] -= var102.field14;
                            class113.field2187[var88] -= var102.field34;
                            var10002 = class230.field4146[var88]--;
                        }
                    }
                }
                if (var57 >= 0) {
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    int var92 = 0;
                    int var93 = 0;
                    for (int var94 = -5; var94 < 104; var94++) {
                        int var95 = var94 - 5;
                        int var96 = var94 + 5;
                        if (var96 < 104) {
                            var89 += class141.field2653[var96];
                            var93 += class230.field4146[var96];
                            var92 += class113.field2187[var96];
                            var90 += class4.field47[var96];
                            var91 += class219.field4001[var96];
                        }
                        if (var95 >= 0) {
                            var92 -= class113.field2187[var95];
                            var89 -= class141.field2653[var95];
                            var93 -= class230.field4146[var95];
                            var90 -= class4.field47[var95];
                            var91 -= class219.field4001[var95];
                        }
                        if (var94 >= 0 && var93 > 0) {
                            var4[var57][var94] = class135.method924(var89 * 256 / var92, 217, var91 / var93, var90 / var93);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var61 = 1; var61 < 103; var61++) {
                    if (!class66.field1096 || (class148.field2722[0][var58][var61] & 0x2) != 0 || (class148.field2722[var7][var58][var61] & 0x10) == 0 && class77.method481(var58, var7, var61, -92) == class132.field2450) {
                        if (var7 < class57.field968) {
                            class57.field968 = var7;
                        }
                        int var62 = class222.field4035[var7][var58][var61] & 0xFF;
                        int var63 = class165.field3020[var7][var58][var61] & 0xFF;
                        if (var63 > 0 || var62 > 0) {
                            int var64 = class190.field3531[var7][var58][var61];
                            int var65 = class190.field3531[var7][var58 + 1][var61];
                            int var66 = class190.field3531[var7][var58 + 1][var61 + 1];
                            int var67 = class190.field3531[var7][var58][var61 + 1];
                            if (var7 > 0) {
                                boolean var68 = true;
                                if (var63 == 0 && class56.field955[var7][var58][var61] != 0) {
                                    var68 = false;
                                }
                                if (var62 > 0 && !class67.method417(4, var62 - 1).field645) {
                                    var68 = false;
                                }
                                if (var68 && var64 == var65 && var64 == var66 && var64 == var67) {
                                    class111.field2107[var7][var58][var61] = class219.method1368(class111.field2107[var7][var58][var61], 2340);
                                }
                            }
                            int var69;
                            int var72;
                            if (var63 > 0) {
                                var69 = var4[var58][var61];
                                int var70 = (var69 & 0x7F) + var5;
                                if (var70 < 0) {
                                    var70 = 0;
                                } else if (var70 > 127) {
                                    var70 = 127;
                                }
                                int var71 = (var6 + var69 & 0xFC00) + (var69 & 0x380) + var70;
                                var72 = class50.field857[class232.method1473(var71, 96, true)];
                            } else {
                                var72 = 0;
                                var69 = -1;
                            }
                            int var73 = var3[var58][var61];
                            int var74 = var3[var58 + 1][var61];
                            int var75 = var3[var58 + 1][var61 + 1];
                            int var76 = var3[var58][var61 + 1];
                            if (var62 == 0) {
                                class37.method267(var7, var58, var61, 0, 0, -1, var64, var65, var66, var67, class232.method1473(var69, var73, true), class232.method1473(var69, var74, true), class232.method1473(var69, var75, true), class232.method1473(var69, var76, true), 0, 0, 0, 0, var72, 0);
                            } else {
                                byte var77 = class12.field163[var7][var58][var61];
                                int var78 = class56.field955[var7][var58][var61] + 1;
                                class40 var79 = class67.method417(4, var62 - 1);
                                int var80 = var79.field650;
                                if (var80 >= 0 && !class50.field859.method491(true, var80)) {
                                    var80 = -1;
                                }
                                int var81;
                                int var84;
                                if (var80 >= 0) {
                                    var81 = -1;
                                    var84 = class50.field857[class161.method1044(class50.field859.method489(var80, (byte) -92), 96, 2)];
                                } else if (var79.field647 == -1) {
                                    var81 = -2;
                                    var84 = 0;
                                } else {
                                    var81 = var79.field647;
                                    int var82 = (var81 & 0x7F) + var5;
                                    if (var82 < 0) {
                                        var82 = 0;
                                    } else if (var82 > 127) {
                                        var82 = 127;
                                    }
                                    int var83 = (var6 + var81 & 0xFC00) + (var81 & 0x380) + var82;
                                    var84 = class50.field857[class161.method1044(var83, 96, 2)];
                                }
                                if (var79.field659 >= 0) {
                                    int var85 = var79.field659;
                                    int var86 = (var85 & 0x7F) + var5;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 127) {
                                        var86 = 127;
                                    }
                                    int var87 = (var6 + var85 & 0xFC00) + (var85 & 0x380) + var86;
                                    var84 = class50.field857[class161.method1044(var87, 96, 2)];
                                }
                                class37.method267(var7, var58, var61, var78, var77, var80, var64, var65, var66, var67, class232.method1473(var69, var73, true), class232.method1473(var69, var74, true), class232.method1473(var69, var75, true), class232.method1473(var69, var76, true), class161.method1044(var81, var73, 2), class161.method1044(var81, var74, 2), class161.method1044(var81, var75, 2), class161.method1044(var81, var76, arg1 ^ 0x6), var72, var84);
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < 103; var59++) {
                for (int var60 = 1; var60 < 103; var60++) {
                    class8.method31(var7, var60, var59, class77.method481(var60, var7, var59, -103));
                }
            }
            class165.field3020[var7] = null;
            class222.field4035[var7] = null;
            class56.field955[var7] = null;
            class12.field163[var7] = null;
            class226.field4101[var7] = null;
        }
        class108.method688(-50, -10, -50);
        for (int var8 = 0; var8 < 104; var8++) {
            for (int var49 = 0; var49 < 104; var49++) {
                if ((class148.field2722[1][var8][var49] & 0x2) == 2) {
                    class156.method1019(var8, var49);
                }
            }
        }
        int var9 = 1;
        int var10 = 2;
        int var11 = arg1;
        for (int var12 = 0; var12 < 4; var12++) {
            if (var12 > 0) {
                var9 <<= 0x3;
                var11 <<= 0x3;
                var10 <<= 0x3;
            }
            for (int var13 = 0; var13 <= var12; var13++) {
                for (int var14 = 0; var14 <= 104; var14++) {
                    for (int var15 = 0; var15 <= 104; var15++) {
                        if ((var9 & class111.field2107[var13][var15][var14]) != 0) {
                            int var16;
                            for (var16 = var14; var16 > 0 && (var9 & class111.field2107[var13][var15][var16 - 1]) != 0; var16--) {
                            }
                            int var17 = var14;
                            int var18 = var13;
                            while (var17 < 104 && (class111.field2107[var13][var15][var17 + 1] & var9) != 0) {
                                var17++;
                            }
                            int var19 = var13;
                            label356: while (var18 > 0) {
                                for (int var20 = var16; var20 <= var17; var20++) {
                                    if ((class111.field2107[var18 - 1][var15][var20] & var9) == 0) {
                                        break label356;
                                    }
                                }
                                var18--;
                            }
                            label345: while (var12 > var19) {
                                for (int var21 = var16; var21 <= var17; var21++) {
                                    if ((class111.field2107[var19 + 1][var15][var21] & var9) == 0) {
                                        break label345;
                                    }
                                }
                                var19++;
                            }
                            int var22 = (var19 + 1 - var18) * (var17 + 1 - var16);
                            if (var22 >= 8) {
                                short var23 = 240;
                                int var24 = class190.field3531[var19][var15][var16] - var23;
                                int var25 = class190.field3531[var18][var15][var16];
                                class187.method1199(var12, 1, var15 * 128, var15 * 128, var16 * 128, var17 * 128 + 128, var24, var25);
                                for (int var26 = var18; var26 <= var19; var26++) {
                                    for (int var27 = var16; var27 <= var17; var27++) {
                                        class111.field2107[var26][var15][var27] = class75.method450(class111.field2107[var26][var15][var27], ~var9);
                                    }
                                }
                            }
                        }
                        if ((var10 & class111.field2107[var13][var15][var14]) != 0) {
                            int var28;
                            for (var28 = var15; var28 > 0 && (class111.field2107[var13][var28 - 1][var14] & var10) != 0; var28--) {
                            }
                            int var29 = var13;
                            int var30;
                            for (var30 = var15; var30 < 104 && (class111.field2107[var13][var30 + 1][var14] & var10) != 0; var30++) {
                            }
                            label412: while (var29 > 0) {
                                for (int var31 = var28; var31 <= var30; var31++) {
                                    if ((var10 & class111.field2107[var29 - 1][var31][var14]) == 0) {
                                        break label412;
                                    }
                                }
                                var29--;
                            }
                            int var32;
                            label400: for (var32 = var13; var32 < var12; var32++) {
                                for (int var33 = var28; var33 <= var30; var33++) {
                                    if ((var10 & class111.field2107[var32 + 1][var33][var14]) == 0) {
                                        break label400;
                                    }
                                }
                            }
                            int var34 = (var30 + 1 - var28) * (var32 + 1 - var29);
                            if (var34 >= 8) {
                                short var35 = 240;
                                int var36 = class190.field3531[var32][var28][var14] - var35;
                                int var37 = class190.field3531[var29][var28][var14];
                                class187.method1199(var12, 2, var28 * 128, var30 * 128 + 128, var14 * 128, var14 * 128, var36, var37);
                                for (int var38 = var29; var38 <= var32; var38++) {
                                    for (int var39 = var28; var39 <= var30; var39++) {
                                        class111.field2107[var38][var39][var14] = class75.method450(class111.field2107[var38][var39][var14], ~var10);
                                    }
                                }
                            }
                        }
                        if ((var11 & class111.field2107[var13][var15][var14]) != 0) {
                            int var40 = var15;
                            int var41 = var15;
                            int var42;
                            for (var42 = var14; var42 < 104 && (var11 & class111.field2107[var13][var15][var42 + 1]) != 0; var42++) {
                            }
                            int var43;
                            for (var43 = var14; var43 > 0 && (class111.field2107[var13][var15][var43 - 1] & var11) != 0; var43--) {
                            }
                            label466: while (var40 > 0) {
                                for (int var44 = var43; var44 <= var42; var44++) {
                                    if ((class111.field2107[var13][var40 - 1][var44] & var11) == 0) {
                                        break label466;
                                    }
                                }
                                var40--;
                            }
                            label455: while (var41 < 104) {
                                for (int var45 = var43; var45 <= var42; var45++) {
                                    if ((var11 & class111.field2107[var13][var41 + 1][var45]) == 0) {
                                        break label455;
                                    }
                                }
                                var41++;
                            }
                            if ((var42 + 1 - var43) * (var41 + 1 - var40) >= 4) {
                                int var46 = class190.field3531[var13][var40][var43];
                                class187.method1199(var12, 4, var40 * 128, var41 * 128 + 128, var43 * 128, var42 * 128 + 128, var46, var46);
                                for (int var47 = var40; var47 <= var41; var47++) {
                                    for (int var48 = var43; var48 <= var42; var48++) {
                                        class111.field2107[var13][var47][var48] = class75.method450(class111.field2107[var13][var47][var48], ~var11);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBILii;)V")
    public static final void method561(int arg0, byte arg1, int arg2, class96 arg3) {
        if (arg1 < 71) {
            method563((byte) -58);
        }
        field1573++;
        if (class15.field217 != null || class202.field3721 || (arg3 == null || class137.method934(arg3, 255) == null)) {
            return;
        }
        class15.field217 = arg3;
        class39.field638 = class137.method934(arg3, 255);
        class136.field2560 = 0;
        class187.field3471 = false;
        class62.field1041 = arg0;
        class230.field4147 = arg2;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V")
    public final void method562(byte arg0) {
        field1598++;
        this.field1577 = null;
        this.field1594 = null;
        this.field1596 = null;
        if (arg0 < 24) {
            this.field1584 = 71;
        }
        this.field1597 = null;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(B)V")
    public static void method563(byte arg0) {
        int var1 = -22 / ((33 - arg0) / 39);
        field1585 = null;
        field1591 = null;
        field1595 = null;
    }
}
