import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class90 {

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "[I")
    public static int[] field1579 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field1586 = 0;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field1585 = 127;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "[S")
    public static short[] field1587 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Lui;")
    public static class73 field1581;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILtg;)[Lqh;")
    public static final class24[] method660(int arg0, int arg1, class75 arg2) {
        field1578++;
        if (class164.method1184(arg0, arg2, (byte) -120)) {
            if (arg1 != 60) {
                field1579 = null;
            }
            return class134.method1008(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I")
    public static final int method661(int arg0) {
        field1583++;
        if (arg0 != 26483) {
            field1579 = null;
        }
        if (class4.field41) {
            return 0;
        } else if (class181.method1249((byte) 62)) {
            return class85.field1497 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BZ[Lqb;)V")
    public static final void method662(byte arg0, boolean arg1, class72[] arg2) {
        field1580++;
        byte var3;
        if (arg1) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg1) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class138.field2461[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class138.field2461[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg2[var7].method499(true, var5, var6);
                            }
                        }
                    }
                }
            }
            class118.field2125 += (int) (Math.random() * 5.0D) - 2;
            class158.field2872 += (int) (Math.random() * 5.0D) - 2;
            if (class118.field2125 < -16) {
                class118.field2125 = -16;
            }
            if (class118.field2125 > 16) {
                class118.field2125 = 16;
            }
            if (class158.field2872 < -8) {
                class158.field2872 = -8;
            }
            if (class158.field2872 > 8) {
                class158.field2872 = 8;
            }
        }
        if (arg0 <= 68) {
            method662((byte) 66, false, (class72[]) null);
        }
        int var8 = class118.field2125 >> 1;
        int var9 = class158.field2872 >> 2 << 10;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var51 = class135.field2392[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    byte var101 = 74;
                    int var102 = class78.field1393[var12][var100 + 1][var54] - class78.field1393[var12][var100 - 1][var54];
                    int var103 = class78.field1393[var12][var100][var54 + 1] - class78.field1393[var12][var100][var54 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = -65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var51[var100][var54 - 1] >> 2) + (var51[var100][var54 + 1] >> 3) + (var51[var100][var54] >> 1) + (var51[var100 - 1][var54] >> 2) + (var51[var100 + 1][var54] >> 3);
                    int var109 = (var107 * -50 + var105 * -50 + var106 * -10) / var53 + var101;
                    var11[var100][var54] = var109 - var108;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class203.field3479[var55] = 0;
                class162.field2925[var55] = 0;
                class255.field4530[var55] = 0;
                class226.field3889[var55] = 0;
                class72.field1191[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class233.field4006[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class45 var96 = class138.method1036(-28994, var95 - 1);
                            class203.field3479[var85] += var96.field761;
                            class162.field2925[var85] += var96.field756;
                            class255.field4530[var85] += var96.field759;
                            class226.field3889[var85] += var96.field753;
                            var10002 = class72.field1191[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class233.field4006[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class45 var99 = class138.method1036(-28994, var98 - 1);
                            class203.field3479[var85] -= var99.field761;
                            class162.field2925[var85] -= var99.field756;
                            class255.field4530[var85] -= var99.field759;
                            class226.field3889[var85] -= var99.field753;
                            var10002 = class72.field1191[var85]--;
                        }
                    }
                }
                if (var56 >= 0) {
                    int var86 = 0;
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    for (int var91 = -5; var91 < 104; var91++) {
                        int var92 = var91 + 5;
                        int var93 = var91 - 5;
                        if (var92 < 104) {
                            var89 += class226.field3889[var92];
                            var87 += class255.field4530[var92];
                            var86 += class203.field3479[var92];
                            var90 += class72.field1191[var92];
                            var88 += class162.field2925[var92];
                        }
                        if (var93 >= 0) {
                            var89 -= class226.field3889[var93];
                            var88 -= class162.field2925[var93];
                            var86 -= class203.field3479[var93];
                            var90 -= class72.field1191[var93];
                            var87 -= class255.field4530[var93];
                        }
                        if (var91 >= 0 && var90 > 0) {
                            var10[var56][var91] = class13.method112(var88 / var90, var87 / var90, 120, var86 * 256 / var89);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg1 || class181.method1249((byte) 62) || (class138.field2461[0][var57][var58] & 0x2) != 0 || (class138.field2461[var12][var57][var58] & 0x10) == 0 && class91.method672(var57, 0, var12, var58) == class93.field1632) {
                        if (var12 < class88.field1552) {
                            class88.field1552 = var12;
                        }
                        int var59 = class233.field4006[var12][var57][var58] & 0xFF;
                        int var60 = class103.field1834[var12][var57][var58] & 0xFF;
                        if (var59 > 0 || var60 > 0) {
                            int var61 = class78.field1393[var12][var57][var58];
                            int var62 = class78.field1393[var12][var57 + 1][var58];
                            int var63 = class78.field1393[var12][var57][var58 + 1];
                            int var64 = class78.field1393[var12][var57 + 1][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var59 == 0 && class228.field3924[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var60 > 0 && !class114.method851(var60 - 1, 1).field4187) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var62 && var61 == var64 && var61 == var63) {
                                    class216.field3683[var12][var57][var58] = class67.method471(class216.field3683[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var69;
                            if (var59 > 0) {
                                var66 = var10[var57][var58];
                                int var67 = (var66 & 0x7F) + var8;
                                if (var67 < 0) {
                                    var67 = 0;
                                } else if (var67 > 127) {
                                    var67 = 127;
                                }
                                int var68 = (var9 + var66 & 0xFC00) + (var66 & 0x380) + var67;
                                var69 = class160.field2895[client.method766(var68, (byte) 30, 96)];
                            } else {
                                var66 = -1;
                                var69 = 0;
                            }
                            int var70 = var11[var57 + 1][var58];
                            int var71 = var11[var57][var58];
                            int var72 = var11[var57 + 1][var58 + 1];
                            int var73 = var11[var57][var58 + 1];
                            if (var60 == 0) {
                                class237.method1625(var12, var57, var58, 0, 0, -1, var61, var62, var64, var63, client.method766(var66, (byte) 91, var71), client.method766(var66, (byte) 107, var70), client.method766(var66, (byte) 58, var72), client.method766(var66, (byte) 77, var73), 0, 0, 0, 0, var69, 0);
                            } else {
                                int var74 = class228.field3924[var12][var57][var58] + 1;
                                byte var75 = class117.field2098[var12][var57][var58];
                                class242 var76 = class114.method851(var60 - 1, 1);
                                int var77 = var76.field4191;
                                if (var77 >= 0 && !class160.field2897.method138(var77, 0)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var79;
                                if (var77 >= 0) {
                                    var78 = class160.field2895[class115.method856(class160.field2897.method139(var77, false), (byte) -51, 96)];
                                    var79 = -1;
                                } else if (var76.field4194 == -1) {
                                    var79 = -2;
                                    var78 = 0;
                                } else {
                                    var79 = var76.field4194;
                                    int var80 = (var79 & 0x7F) + var8;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 127) {
                                        var80 = 127;
                                    }
                                    int var81 = (var9 + var79 & 0xFC00) + (var79 & 0x380) + var80;
                                    var78 = class160.field2895[class115.method856(var81, (byte) -75, 96)];
                                }
                                if (var76.field4199 >= 0) {
                                    int var82 = var76.field4199;
                                    int var83 = (var82 & 0x7F) + var8;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var9 + var82 & 0xFC00) + (var82 & 0x380) + var83;
                                    var78 = class160.field2895[class115.method856(var84, (byte) -59, 96)];
                                }
                                class237.method1625(var12, var57, var58, var74, var75, var77, var61, var62, var64, var63, client.method766(var66, (byte) 113, var71), client.method766(var66, (byte) 55, var70), client.method766(var66, (byte) 48, var72), client.method766(var66, (byte) 108, var73), class115.method856(var79, (byte) -57, var71), class115.method856(var79, (byte) -98, var70), class115.method856(var79, (byte) -64, var72), class115.method856(var79, (byte) -49, var73), var69, var78);
                            }
                        }
                    }
                }
            }
            class233.field4006[var12] = null;
            class103.field1834[var12] = null;
            class228.field3924[var12] = null;
            class117.field2098[var12] = null;
            class135.field2392[var12] = null;
        }
        class145.method1074(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class138.field2461[1][var13][var50] & 0x2) == 2) {
                    class210.method1413(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class216.field3683[var14][var16][var15] & 0x1) != 0) {
                        int var17 = var14;
                        int var18 = var15;
                        int var19 = var15;
                        while (var18 < 104 && (class216.field3683[var14][var16][var18 + 1] & 0x1) != 0) {
                            var18++;
                        }
                        while (var19 > 0 && (class216.field3683[var14][var16][var19 - 1] & 0x1) != 0) {
                            var19--;
                        }
                        int var20 = var14;
                        label350: while (var17 > 0) {
                            for (int var21 = var19; var21 <= var18; var21++) {
                                if ((class216.field3683[var17 - 1][var16][var21] & 0x1) == 0) {
                                    break label350;
                                }
                            }
                            var17--;
                        }
                        label339: while (var20 < 3) {
                            for (int var22 = var19; var22 <= var18; var22++) {
                                if ((class216.field3683[var20 + 1][var16][var22] & 0x1) == 0) {
                                    break label339;
                                }
                            }
                            var20++;
                        }
                        int var23 = (var20 + 1 - var17) * (var18 + 1 - var19);
                        if (var23 >= 8) {
                            short var24 = 240;
                            int var25 = class78.field1393[var20][var16][var19] - var24;
                            int var26 = class78.field1393[var17][var16][var19];
                            class86.method637(1, var16 * 128, var16 * 128, var19 * 128, var18 * 128 + 128, var25, var26);
                            for (int var27 = var17; var27 <= var20; var27++) {
                                for (int var28 = var19; var28 <= var18; var28++) {
                                    class216.field3683[var27][var16][var28] = class214.method1427(class216.field3683[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class216.field3683[var14][var16][var15] & 0x2) != 0) {
                        int var29 = var14;
                        int var30 = var14;
                        int var31 = var16;
                        int var32 = var16;
                        while (var31 > 0 && (class216.field3683[var14][var31 - 1][var15] & 0x2) != 0) {
                            var31--;
                        }
                        while (var32 < 104 && (class216.field3683[var14][var32 + 1][var15] & 0x2) != 0) {
                            var32++;
                        }
                        label404: while (var29 > 0) {
                            for (int var33 = var31; var33 <= var32; var33++) {
                                if ((class216.field3683[var29 - 1][var33][var15] & 0x2) == 0) {
                                    break label404;
                                }
                            }
                            var29--;
                        }
                        label393: while (var30 < 3) {
                            for (int var34 = var31; var34 <= var32; var34++) {
                                if ((class216.field3683[var30 + 1][var34][var15] & 0x2) == 0) {
                                    break label393;
                                }
                            }
                            var30++;
                        }
                        int var35 = (var32 + 1 - var31) * (var30 + 1 - var29);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class78.field1393[var30][var31][var15] - var36;
                            int var38 = class78.field1393[var29][var31][var15];
                            class86.method637(2, var31 * 128, var32 * 128 + 128, var15 * 128, var15 * 128, var37, var38);
                            for (int var39 = var29; var39 <= var30; var39++) {
                                for (int var40 = var31; var40 <= var32; var40++) {
                                    class216.field3683[var39][var40][var15] = class214.method1427(class216.field3683[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class216.field3683[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var16;
                        int var42 = var15;
                        int var43;
                        for (var43 = var15; var43 < 104 && (class216.field3683[var14][var16][var43 + 1] & 0x4) != 0; var43++) {
                        }
                        int var44 = var16;
                        while (var42 > 0 && (class216.field3683[var14][var16][var42 - 1] & 0x4) != 0) {
                            var42--;
                        }
                        label457: while (var41 > 0) {
                            for (int var45 = var42; var45 <= var43; var45++) {
                                if ((class216.field3683[var14][var41 - 1][var45] & 0x4) == 0) {
                                    break label457;
                                }
                            }
                            var41--;
                        }
                        label446: while (var44 < 104) {
                            for (int var46 = var42; var46 <= var43; var46++) {
                                if ((class216.field3683[var14][var44 + 1][var46] & 0x4) == 0) {
                                    break label446;
                                }
                            }
                            var44++;
                        }
                        if ((var44 + 1 - var41) * (var43 + 1 - var42) >= 4) {
                            int var47 = class78.field1393[var14][var41][var42];
                            class86.method637(4, var41 * 128, var44 * 128 + 128, var42 * 128, var43 * 128 + 128, var47, var47);
                            for (int var48 = var41; var48 <= var44; var48++) {
                                for (int var49 = var42; var49 <= var43; var49++) {
                                    class216.field3683[var14][var48][var49] = class214.method1427(class216.field3683[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Lvb;")
    public static final class61 method663(int arg0, int arg1) {
        class61 var2 = (class61) class9.field205.method1307((byte) -69, (long) arg0);
        field1584++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class1.field4.method571(1, arg0 & 0x7FFF, -87);
        } else {
            var3 = class129.field2303.method571(1, arg0, arg1 ^ 0x7B);
        }
        class61 var4 = new class61();
        if (var3 != null) {
            var4.method447(-1, new class216(var3));
        }
        if (arg0 >= 32768) {
            var4.method444((byte) 45);
        }
        if (arg1 != 0) {
            method665(true, (class120) null, 97, 41, 116);
        }
        class9.field205.method1312(true, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public static void method664(int arg0) {
        field1579 = null;
        field1581 = null;
        field1587 = null;
        if (arg0 != 124) {
            method664(67);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLak;III)V")
    public static final void method665(boolean arg0, class120 arg1, int arg2, int arg3, int arg4) {
        field1588++;
        if (!arg0 || class226.field3894 >= 400) {
            return;
        }
        if (arg1.field2189 != null) {
            arg1 = arg1.method895(-1);
        }
        if (arg1 == null || !arg1.field2173) {
            return;
        }
        class98 var5 = arg1.field2200;
        if (arg1.field2195 != 0) {
            var5 = class186.method1288(new class98[] { var5, class157.method1135(9637, class163.field2943.field3324, arg1.field2195), class108.field1938, class158.field2870, class125.method930(25904, arg1.field2195), class197.field3398 }, 31618);
        }
        if (class111.field1975 == 1) {
            class226.method1560(class186.method1288(new class98[] { class55.field879, class258.field4549, var5 }, 31618), class210.field3603, (short) 34, (byte) -35, arg4, arg3, (long) arg2);
            class147.field2572++;
        } else if (!class56.field892) {
            class98[] var6 = arg1.field2156;
            class111.field1978++;
            if (class78.field1389) {
                var6 = class92.method675(7759, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class245.field4315 != 0 || !var6[var7].method731((byte) 126, class110.field1966))) {
                        byte var8 = 0;
                        class188.field3251++;
                        if (var7 == 0) {
                            var8 = 1;
                        }
                        if (var7 == 1) {
                            var8 = 43;
                        }
                        if (var7 == 2) {
                            var8 = 35;
                        }
                        if (var7 == 3) {
                            var8 = 45;
                        }
                        if (var7 == 4) {
                            var8 = 16;
                        }
                        class226.method1560(class186.method1288(new class98[] { class104.field1856, var5 }, 31618), var6[var7], var8, (byte) -79, arg4, arg3, (long) arg2);
                    }
                }
            }
            if (class245.field4315 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method731((byte) 113, class110.field1966)) {
                        short var10 = 0;
                        short var11 = 0;
                        class117.field2089++;
                        if (arg1.field2195 > class163.field2943.field3324) {
                            var10 = 2000;
                        }
                        if (var9 == 0) {
                            var11 = 1;
                        }
                        if (var9 == 1) {
                            var11 = 43;
                        }
                        if (var9 == 2) {
                            var11 = 35;
                        }
                        if (var9 == 3) {
                            var11 = 45;
                        }
                        if (var9 == 4) {
                            var11 = 16;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class226.method1560(class186.method1288(new class98[] { class104.field1856, var5 }, 31618), var6[var9], var11, (byte) 121, arg4, arg3, (long) arg2);
                    }
                }
            }
            class226.method1560(class186.method1288(new class98[] { class104.field1856, var5 }, 31618), class102.field1817, (short) 1001, (byte) -94, arg4, arg3, (long) arg2);
        } else if ((class12.field236 & 0x2) == 2) {
            class34.field593++;
            class226.method1560(class186.method1288(new class98[] { class91.field1609, class258.field4549, var5 }, 31618), class67.field1080, (short) 13, (byte) 112, arg4, arg3, (long) arg2);
            return;
        }
    }
}
