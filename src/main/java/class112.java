import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class class112 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lfi;")
    public static class33 field1978 = new class33();

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Lij;")
    private static class50 field1984 = class78.method578(125, "glow2:");

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Lij;")
    public static class50 field1986 = field1984;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lij;")
    public static class50 field1983 = field1984;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([BB)V")
    public abstract void method592(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)[B")
    public abstract byte[] method591(int arg0);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)I")
    public static final int method816(int arg0, byte arg1) {
        field1979++;
        int var2 = -122 / ((arg1 + 27) / 56);
        if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
            return arg0 + 32;
        } else if (arg0 == 159) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public static void method817(int arg0) {
        field1984 = null;
        field1986 = null;
        field1983 = null;
        if (arg0 >= 63) {
            field1978 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
    public static final void method818(int arg0) {
        class25.field538.method763(0);
        if (arg0 != 4) {
            method817(-42);
        }
        field1987++;
        class123.field2164.method763(0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([Llj;BZ)V")
    public static final void method819(class44[] arg0, byte arg1, boolean arg2) {
        field1981++;
        if (!arg2) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class210.field3495[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class210.field3495[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg0[var6].method339(44, var4, var5);
                            }
                        }
                    }
                }
            }
            class49.field876 += (int) (Math.random() * 5.0D) - 2;
            class52.field947 += (int) (Math.random() * 5.0D) - 2;
            if (class49.field876 < -16) {
                class49.field876 = -16;
            }
            if (class49.field876 > 16) {
                class49.field876 = 16;
            }
            if (class52.field947 < -8) {
                class52.field947 = -8;
            }
            if (class52.field947 > 8) {
                class52.field947 = 8;
            }
        }
        byte var7;
        if (arg2) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int var8 = class52.field947 >> 2 << 10;
        int var9 = -44 % ((arg1 - 26) / 47);
        int[][] var10 = new int[104][104];
        int var11 = class49.field876 >> 1;
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var7; var13++) {
            byte[][] var56 = class196.field3250[var13];
            int var57 = (int) Math.sqrt(5100.0D);
            int var58 = var57 * 768 >> 8;
            for (int var59 = 1; var59 < 103; var59++) {
                for (int var107 = 1; var107 < 103; var107++) {
                    byte var108 = 74;
                    int var109 = class245.field4257[var13][var107][var59 + 1] - class245.field4257[var13][var107][var59 - 1];
                    int var110 = class245.field4257[var13][var107 + 1][var59] - class245.field4257[var13][var107 - 1][var59];
                    int var111 = (int) Math.sqrt((double) (var110 * var110 + var109 * var109 + 65536));
                    int var112 = -65536 / var111;
                    int var113 = (var109 << 8) / var111;
                    int var114 = (var110 << 8) / var111;
                    int var115 = (var113 * -50 + var112 * -10 + var114 * -50) / var58 + var108;
                    int var116 = (var56[var107][var59] >> 1) + ((var56[var107 - 1][var59] >> 2) + (var56[var107][var59 - 1] >> 2) + (var56[var107 + 1][var59] >> 3) + (var56[var107][var59 + 1] >> 3));
                    var12[var107][var59] = var115 - var116;
                }
            }
            for (int var60 = 0; var60 < 104; var60++) {
                class201.field3315[var60] = 0;
                class172.field2871[var60] = 0;
                class80.field1466[var60] = 0;
                class36.field701[var60] = 0;
                class155.field2702[var60] = 0;
            }
            for (int var61 = -5; var61 < 104; var61++) {
                for (int var92 = 0; var92 < 104; var92++) {
                    int var101 = var61 + 5;
                    int var10002;
                    if (var101 < 104) {
                        int var102 = class203.field3383[var13][var101][var92] & 0xFF;
                        if (var102 > 0) {
                            class231 var103 = class26.method245(var102 - 1, (byte) -128);
                            class201.field3315[var92] += var103.field3880;
                            class172.field2871[var92] += var103.field3867;
                            class80.field1466[var92] += var103.field3874;
                            class36.field701[var92] += var103.field3885;
                            var10002 = class155.field2702[var92]++;
                        }
                    }
                    int var104 = var61 - 5;
                    if (var104 >= 0) {
                        int var105 = class203.field3383[var13][var104][var92] & 0xFF;
                        if (var105 > 0) {
                            class231 var106 = class26.method245(var105 - 1, (byte) -127);
                            class201.field3315[var92] -= var106.field3880;
                            class172.field2871[var92] -= var106.field3867;
                            class80.field1466[var92] -= var106.field3874;
                            class36.field701[var92] -= var106.field3885;
                            var10002 = class155.field2702[var92]--;
                        }
                    }
                }
                if (var61 >= 0) {
                    int var93 = 0;
                    int var94 = 0;
                    int var95 = 0;
                    int var96 = 0;
                    int var97 = 0;
                    for (int var98 = -5; var98 < 104; var98++) {
                        int var99 = var98 + 5;
                        int var100 = var98 - 5;
                        if (var99 < 104) {
                            var93 += class201.field3315[var99];
                            var97 += class155.field2702[var99];
                            var94 += class172.field2871[var99];
                            var96 += class36.field701[var99];
                            var95 += class80.field1466[var99];
                        }
                        if (var100 >= 0) {
                            var97 -= class155.field2702[var100];
                            var95 -= class80.field1466[var100];
                            var93 -= class201.field3315[var100];
                            var94 -= class172.field2871[var100];
                            var96 -= class36.field701[var100];
                        }
                        if (var98 >= 0 && var97 > 0) {
                            var10[var61][var98] = class194.method1310(var93 * 256 / var96, 118, var94 / var97, var95 / var97);
                        }
                    }
                }
            }
            for (int var62 = 1; var62 < 103; var62++) {
                for (int var65 = 1; var65 < 103; var65++) {
                    if (arg2 || class174.method1198(0) || (class210.field3495[0][var62][var65] & 0x2) != 0 || (class210.field3495[var13][var62][var65] & 0x10) == 0 && class170.method1181(var62, (byte) 76, var13, var65) == class93.field1746) {
                        if (class139.field2416 > var13) {
                            class139.field2416 = var13;
                        }
                        int var66 = class203.field3383[var13][var62][var65] & 0xFF;
                        int var67 = class102.field1869[var13][var62][var65] & 0xFF;
                        if (var66 > 0 || var67 > 0) {
                            int var68 = class245.field4257[var13][var62 + 1][var65];
                            int var69 = class245.field4257[var13][var62 + 1][var65 + 1];
                            int var70 = class245.field4257[var13][var62][var65];
                            int var71 = class245.field4257[var13][var62][var65 + 1];
                            if (var13 > 0) {
                                boolean var72 = true;
                                if (var66 == 0 && class186.field3056[var13][var62][var65] != 0) {
                                    var72 = false;
                                }
                                if (var67 > 0 && !class106.method797(var67 - 1, 6).field41) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var70 && var69 == var70 && var70 == var71) {
                                    class179.field2984[var13][var62][var65] = class29.method261(class179.field2984[var13][var62][var65], 2340);
                                }
                            }
                            int var73;
                            int var74;
                            if (var66 <= 0) {
                                var73 = 0;
                                var74 = -1;
                            } else {
                                var74 = var10[var62][var65];
                                int var75 = (var74 & 0x7F) + var11;
                                if (var75 < 0) {
                                    var75 = 0;
                                } else if (var75 > 127) {
                                    var75 = 127;
                                }
                                int var76 = (var8 + var74 & 0xFC00) + var75 + (var74 & 0x380);
                                var73 = class13.field321[class229.method1559(var76, 96, 27353)];
                            }
                            int var77 = var12[var62 + 1][var65];
                            int var78 = var12[var62][var65 + 1];
                            int var79 = var12[var62][var65];
                            int var80 = var12[var62 + 1][var65 + 1];
                            if (var67 == 0) {
                                class241.method1643(var13, var62, var65, 0, 0, -1, var70, var68, var69, var71, class229.method1559(var74, var79, 27353), class229.method1559(var74, var77, 27353), class229.method1559(var74, var80, 27353), class229.method1559(var74, var78, 27353), 0, 0, 0, 0, var73, 0);
                            } else {
                                int var81 = class186.field3056[var13][var62][var65] + 1;
                                byte var82 = class130.field2280[var13][var62][var65];
                                class3 var83 = class106.method797(var67 - 1, 6);
                                int var84 = var83.field40;
                                if (var84 >= 0 && !class13.field309.method544(36, var84)) {
                                    var84 = -1;
                                }
                                int var85;
                                int var86;
                                if (var84 >= 0) {
                                    var85 = -1;
                                    var86 = class13.field321[class161.method1131(-3, class13.field309.method545(-5423, var84), 96)];
                                } else if (var83.field49 == -1) {
                                    var85 = -2;
                                    var86 = 0;
                                } else {
                                    var85 = var83.field49;
                                    int var87 = (var85 & 0x7F) + var11;
                                    if (var87 < 0) {
                                        var87 = 0;
                                    } else if (var87 > 127) {
                                        var87 = 127;
                                    }
                                    int var88 = (var8 + var85 & 0xFC00) + (var85 & 0x380) + var87;
                                    var86 = class13.field321[class161.method1131(-3, var88, 96)];
                                }
                                if (var83.field45 >= 0) {
                                    int var89 = var83.field45;
                                    int var90 = (var89 & 0x7F) + var11;
                                    if (var90 < 0) {
                                        var90 = 0;
                                    } else if (var90 > 127) {
                                        var90 = 127;
                                    }
                                    int var91 = (var89 & 0x380) + (var89 + var8 & 0xFC00) + var90;
                                    var86 = class13.field321[class161.method1131(-3, var91, 96)];
                                }
                                class241.method1643(var13, var62, var65, var81, var82, var84, var70, var68, var69, var71, class229.method1559(var74, var79, 27353), class229.method1559(var74, var77, 27353), class229.method1559(var74, var80, 27353), class229.method1559(var74, var78, 27353), class161.method1131(-3, var85, var79), class161.method1131(-3, var85, var77), class161.method1131(-3, var85, var80), class161.method1131(-3, var85, var78), var73, var86);
                            }
                        }
                    }
                }
            }
            if (!arg2) {
                for (int var63 = 1; var63 < 103; var63++) {
                    for (int var64 = 1; var64 < 103; var64++) {
                        if ((class210.field3495[0][var64][var63] & 0x2) == 0) {
                            class222.method1519(var13, var64, var63, class170.method1181(var64, (byte) 76, var13, var63));
                        } else {
                            class222.method1519(var13, var64, var63, 0);
                        }
                    }
                }
            }
            class203.field3383[var13] = null;
            class102.field1869[var13] = null;
            class186.field3056[var13] = null;
            class130.field2280[var13] = null;
            class196.field3250[var13] = null;
        }
        class151.method1055(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var55 = 0; var55 < 104; var55++) {
                if ((class210.field3495[1][var14][var55] & 0x2) == 2) {
                    class22.method185(var14, var55);
                }
            }
        }
        int var15 = 1;
        int var16 = 4;
        int var17 = 2;
        for (int var18 = 0; var18 < 4; var18++) {
            if (var18 > 0) {
                var17 <<= 0x3;
                var16 <<= 0x3;
                var15 <<= 0x3;
            }
            for (int var19 = 0; var19 <= var18; var19++) {
                for (int var20 = 0; var20 <= 104; var20++) {
                    for (int var21 = 0; var21 <= 104; var21++) {
                        if ((class179.field2984[var19][var21][var20] & var15) != 0) {
                            int var22;
                            for (var22 = var20; var22 < 104 && (var15 & class179.field2984[var19][var21][var22 + 1]) != 0; var22++) {
                            }
                            int var23;
                            for (var23 = var20; var23 > 0 && (class179.field2984[var19][var21][var23 - 1] & var15) != 0; var23--) {
                            }
                            int var24 = var19;
                            int var25 = var19;
                            label371: while (var24 > 0) {
                                for (int var26 = var23; var26 <= var22; var26++) {
                                    if ((class179.field2984[var24 - 1][var21][var26] & var15) == 0) {
                                        break label371;
                                    }
                                }
                                var24--;
                            }
                            label360: while (var25 < var18) {
                                for (int var27 = var23; var27 <= var22; var27++) {
                                    if ((var15 & class179.field2984[var25 + 1][var21][var27]) == 0) {
                                        break label360;
                                    }
                                }
                                var25++;
                            }
                            int var28 = (var22 + 1 - var23) * (var25 + 1 - var24);
                            if (var28 >= 8) {
                                short var29 = 240;
                                int var30 = class245.field4257[var25][var21][var23] - var29;
                                int var31 = class245.field4257[var24][var21][var23];
                                class142.method992(var18, 1, var21 * 128, var21 * 128, var23 * 128, var22 * 128 + 128, var30, var31);
                                for (int var32 = var24; var32 <= var25; var32++) {
                                    for (int var33 = var23; var33 <= var22; var33++) {
                                        class179.field2984[var32][var21][var33] = class51.method413(class179.field2984[var32][var21][var33], ~var15);
                                    }
                                }
                            }
                        }
                        if ((class179.field2984[var19][var21][var20] & var17) != 0) {
                            int var34 = var21;
                            int var35;
                            for (var35 = var21; var35 < 104 && (var17 & class179.field2984[var19][var35 + 1][var20]) != 0; var35++) {
                            }
                            while (var34 > 0 && (class179.field2984[var19][var34 - 1][var20] & var17) != 0) {
                                var34--;
                            }
                            int var36 = var19;
                            int var37 = var19;
                            label426: while (var36 > 0) {
                                for (int var38 = var34; var38 <= var35; var38++) {
                                    if ((class179.field2984[var36 - 1][var38][var20] & var17) == 0) {
                                        break label426;
                                    }
                                }
                                var36--;
                            }
                            label415: while (var37 < var18) {
                                for (int var39 = var34; var39 <= var35; var39++) {
                                    if ((class179.field2984[var37 + 1][var39][var20] & var17) == 0) {
                                        break label415;
                                    }
                                }
                                var37++;
                            }
                            int var40 = (var37 + 1 - var36) * (var35 + 1 - var34);
                            if (var40 >= 8) {
                                int var41 = class245.field4257[var36][var34][var20];
                                short var42 = 240;
                                int var43 = class245.field4257[var37][var34][var20] - var42;
                                class142.method992(var18, 2, var34 * 128, var35 * 128 + 128, var20 * 128, var20 * 128, var43, var41);
                                for (int var44 = var36; var44 <= var37; var44++) {
                                    for (int var45 = var34; var45 <= var35; var45++) {
                                        class179.field2984[var44][var45][var20] = class51.method413(class179.field2984[var44][var45][var20], ~var17);
                                    }
                                }
                            }
                        }
                        if ((var16 & class179.field2984[var19][var21][var20]) != 0) {
                            int var46 = var21;
                            int var47 = var21;
                            int var48 = var20;
                            int var49 = var20;
                            while (var48 < 104 && (class179.field2984[var19][var21][var48 + 1] & var16) != 0) {
                                var48++;
                            }
                            while (var49 > 0 && (class179.field2984[var19][var21][var49 - 1] & var16) != 0) {
                                var49--;
                            }
                            label480: while (var46 > 0) {
                                for (int var50 = var49; var50 <= var48; var50++) {
                                    if ((var16 & class179.field2984[var19][var46 - 1][var50]) == 0) {
                                        break label480;
                                    }
                                }
                                var46--;
                            }
                            label469: while (var47 < 104) {
                                for (int var51 = var49; var51 <= var48; var51++) {
                                    if ((class179.field2984[var19][var47 + 1][var51] & var16) == 0) {
                                        break label469;
                                    }
                                }
                                var47++;
                            }
                            if ((var47 + 1 - var46) * (var48 + 1 - var49) >= 4) {
                                int var52 = class245.field4257[var19][var46][var49];
                                class142.method992(var18, 4, var46 * 128, var47 * 128 + 128, var49 * 128, var48 * 128 + 128, var52, var52);
                                for (int var53 = var46; var53 <= var47; var53++) {
                                    for (int var54 = var49; var54 <= var48; var54++) {
                                        class179.field2984[var19][var53][var54] = class51.method413(class179.field2984[var19][var53][var54], ~var16);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
