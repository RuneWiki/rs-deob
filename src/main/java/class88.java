import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class88 {

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1655 = -1;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Ltg;")
    public static class184 field1661 = class135.method812("::noclip", 3);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "Ltg;")
    public static class184 field1662 = class135.method812(":assistreq:", 3);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public int field1651;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public int field1657;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public int field1660;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "J")
    public long field1652;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Lrd;")
    public static class163 field1654;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Lfb;")
    public class52 field1658;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static void method523(byte arg0) {
        field1662 = null;
        if (arg0 <= 118) {
            field1662 = null;
        }
        field1654 = null;
        field1661 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I[Lgf;)V")
    public static final void method524(int arg0, class65[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var113 = 0; var113 < 104; var113++) {
                for (int var114 = 0; var114 < 104; var114++) {
                    if ((class46.field878[var2][var113][var114] & 0x1) == 1) {
                        int var115 = var2;
                        if ((class46.field878[1][var113][var114] & 0x2) == 2) {
                            var115 = var2 - 1;
                        }
                        if (var115 >= 0) {
                            arg1[var115].method378(var114, -3, var113);
                        }
                    }
                }
            }
        }
        field1659++;
        class151.field2717 += (int) (Math.random() * 5.0D) - 2;
        if (class151.field2717 < -16) {
            class151.field2717 = -16;
        }
        class55.field975 += (int) (Math.random() * 5.0D) - 2;
        if (class151.field2717 > 16) {
            class151.field2717 = 16;
        }
        if (class55.field975 < -8) {
            class55.field975 = -8;
        }
        if (class55.field975 > 8) {
            class55.field975 = 8;
        }
        int var3 = class55.field975 >> 2 << 10;
        int[][] var4 = new int[104][104];
        int[][] var5 = new int[104][104];
        if (arg0 != -1) {
            method523((byte) 61);
        }
        int var6 = class151.field2717 >> 1;
        for (int var7 = 0; var7 < 4; var7++) {
            byte[][] var50 = class191.field3724[var7];
            byte var51 = 96;
            int var52 = (int) Math.sqrt(5100.0D);
            short var53 = 768;
            int var54 = var52 * var53 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var103 = 1; var103 < 103; var103++) {
                    int var105 = class179.field3418[var7][var103][var55 + 1] - class179.field3418[var7][var103][var55 - 1];
                    int var106 = class179.field3418[var7][var103 + 1][var55] - class179.field3418[var7][var103 - 1][var55];
                    int var107 = (int) Math.sqrt((double) (var105 * var105 + var106 * var106 + 65536));
                    int var108 = (var106 << 8) / var107;
                    int var109 = (var105 << 8) / var107;
                    int var110 = 65536 / var107;
                    int var111 = (var109 * -50 + var108 * -50 + var110 * -10) / var54 + var51;
                    int var112 = (var50[var103 + 1][var55] >> 3) + (var50[var103 - 1][var55] >> 2) + (var50[var103][var55 - -1] >> 3) + (var50[var103][var55] >> 1) + (var50[var103][var55 - 1] >> 2);
                    var5[var103][var55] = var111 - var112;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class71.field1341[var56] = 0;
                class101.field1865[var56] = 0;
                class170.field3234[var56] = 0;
                class145.field2618[var56] = 0;
                class83.field1475[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var88 = 0; var88 < 104; var88++) {
                    int var97 = var57 + 5;
                    int var10002;
                    if (var97 < 104) {
                        int var98 = class167.field2987[var7][var97][var88] & 0xFF;
                        if (var98 > 0) {
                            class156 var99 = class81.method454(var98 - 1, arg0 + 5);
                            class71.field1341[var88] += var99.field2793;
                            class101.field1865[var88] += var99.field2803;
                            class170.field3234[var88] += var99.field2795;
                            class145.field2618[var88] += var99.field2797;
                            var10002 = class83.field1475[var88]++;
                        }
                    }
                    int var100 = var57 - 5;
                    if (var100 >= 0) {
                        int var101 = class167.field2987[var7][var100][var88] & 0xFF;
                        if (var101 > 0) {
                            class156 var102 = class81.method454(var101 - 1, 4);
                            class71.field1341[var88] -= var102.field2793;
                            class101.field1865[var88] -= var102.field2803;
                            class170.field3234[var88] -= var102.field2795;
                            class145.field2618[var88] -= var102.field2797;
                            var10002 = class83.field1475[var88]--;
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
                            var91 += class101.field1865[var96];
                            var89 += class71.field1341[var96];
                            var90 += class145.field2618[var96];
                            var92 += class170.field3234[var96];
                            var93 += class83.field1475[var96];
                        }
                        if (var95 >= 0) {
                            var92 -= class170.field3234[var95];
                            var91 -= class101.field1865[var95];
                            var89 -= class71.field1341[var95];
                            var90 -= class145.field2618[var95];
                            var93 -= class83.field1475[var95];
                        }
                        if (var94 >= 0 && var93 > 0) {
                            var4[var57][var94] = class19.method122(var92 / var93, var89 * 256 / var90, 3, var91 / var93);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var61 = 1; var61 < 103; var61++) {
                    if (!class55.field970 || (class46.field878[0][var58][var61] & 0x2) != 0 || (class46.field878[var7][var58][var61] & 0x10) == 0 && class189.method1203(0, var58, var61, var7) == class87.field1598) {
                        if (var7 < class60.field1124) {
                            class60.field1124 = var7;
                        }
                        int var62 = class123.field2237[var7][var58][var61] & 0xFF;
                        int var63 = class167.field2987[var7][var58][var61] & 0xFF;
                        if (var63 > 0 || var62 > 0) {
                            int var64 = class179.field3418[var7][var58][var61];
                            int var65 = class179.field3418[var7][var58 + 1][var61];
                            int var66 = class179.field3418[var7][var58 + 1][var61 + 1];
                            int var67 = class179.field3418[var7][var58][var61 + 1];
                            if (var7 > 0) {
                                boolean var68 = true;
                                if (var63 == 0 && class29.field492[var7][var58][var61] != 0) {
                                    var68 = false;
                                }
                                if (var62 > 0 && !class47.method270(-121, var62 - 1).field3397) {
                                    var68 = false;
                                }
                                if (var68 && var64 == var65 && var64 == var66 && var64 == var67) {
                                    class189.field3679[var7][var58][var61] = class123.method748(class189.field3679[var7][var58][var61], 2340);
                                }
                            }
                            int var69;
                            int var70;
                            if (var63 <= 0) {
                                var69 = -1;
                                var70 = 0;
                            } else {
                                var69 = var4[var58][var61];
                                int var71 = (var69 & 0x7F) + var6;
                                if (var71 < 0) {
                                    var71 = 0;
                                } else if (var71 > 127) {
                                    var71 = 127;
                                }
                                int var72 = (var69 + var3 & 0xFC00) + (var69 & 0x380) + var71;
                                var70 = class23.field421[method525(0, var72, 96)];
                            }
                            int var73 = var5[var58][var61];
                            int var74 = var5[var58 + 1][var61];
                            int var75 = var5[var58 + 1][var61 + 1];
                            int var76 = var5[var58][var61 + 1];
                            if (var62 == 0) {
                                class149.method915(var7, var58, var61, 0, 0, -1, var64, var65, var66, var67, method525(arg0 + 1, var69, var73), method525(0, var69, var74), method525(0, var69, var75), method525(0, var69, var76), 0, 0, 0, 0, var70, 0);
                            } else {
                                byte var77 = class129.field2327[var7][var58][var61];
                                int var78 = class29.field492[var7][var58][var61] + 1;
                                class178 var79 = class47.method270(arg0 ^ 0x22, var62 - 1);
                                int var80 = var79.field3399;
                                if (var80 >= 0 && !class23.field427.method367(27094, var80)) {
                                    var80 = -1;
                                }
                                int var81;
                                int var82;
                                if (var80 >= 0) {
                                    var81 = class23.field421[class100.method623(-97, 96, class23.field427.method366(var80, arg0 ^ 0xFFFFFFA1))];
                                    var82 = -1;
                                } else if (var79.field3401 == -1) {
                                    var82 = -2;
                                    var81 = 0;
                                } else {
                                    var82 = var79.field3401;
                                    int var83 = (var82 & 0x7F) + var6;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var82 + var3 & 0xFC00) + (var82 & 0x380) + var83;
                                    var81 = class23.field421[class100.method623(-103, 96, var84)];
                                }
                                if (var79.field3389 >= 0) {
                                    int var85 = var79.field3389;
                                    int var86 = (var85 & 0x7F) + var6;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 127) {
                                        var86 = 127;
                                    }
                                    int var87 = (var3 + var85 & 0xFC00) - (-(var85 & 0x380) - var86);
                                    var81 = class23.field421[class100.method623(-128, 96, var87)];
                                }
                                class149.method915(var7, var58, var61, var78, var77, var80, var64, var65, var66, var67, method525(~arg0, var69, var73), method525(0, var69, var74), method525(arg0 + 1, var69, var75), method525(0, var69, var76), class100.method623(arg0 - 122, var73, var82), class100.method623(-102, var74, var82), class100.method623(-110, var75, var82), class100.method623(-91, var76, var82), var70, var81);
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < 103; var59++) {
                for (int var60 = 1; var60 < 103; var60++) {
                    class82.method458(var7, var60, var59, class189.method1203(0, var60, var59, var7));
                }
            }
            class167.field2987[var7] = null;
            class123.field2237[var7] = null;
            class29.field492[var7] = null;
            class129.field2327[var7] = null;
            class191.field3724[var7] = null;
        }
        class111.method689(-50, -10, -50);
        for (int var8 = 0; var8 < 104; var8++) {
            for (int var49 = 0; var49 < 104; var49++) {
                if ((class46.field878[1][var8][var49] & 0x2) == 2) {
                    class158.method953(var8, var49);
                }
            }
        }
        int var9 = 1;
        int var10 = 2;
        int var11 = 4;
        for (int var12 = 0; var12 < 4; var12++) {
            if (var12 > 0) {
                var9 <<= 0x3;
                var10 <<= 0x3;
                var11 <<= 0x3;
            }
            for (int var13 = 0; var13 <= var12; var13++) {
                for (int var14 = 0; var14 <= 104; var14++) {
                    for (int var15 = 0; var15 <= 104; var15++) {
                        if ((var9 & class189.field3679[var13][var15][var14]) != 0) {
                            int var16;
                            for (var16 = var14; var16 > 0 && (var9 & class189.field3679[var13][var15][var16 - 1]) != 0; var16--) {
                            }
                            int var17 = var14;
                            int var18 = var13;
                            while (var17 < 104 && (class189.field3679[var13][var15][var17 + 1] & var9) != 0) {
                                var17++;
                            }
                            int var19 = var13;
                            label358: while (var18 > 0) {
                                for (int var20 = var16; var20 <= var17; var20++) {
                                    if ((var9 & class189.field3679[var18 - 1][var15][var20]) == 0) {
                                        break label358;
                                    }
                                }
                                var18--;
                            }
                            label347: while (var19 < var12) {
                                for (int var21 = var16; var21 <= var17; var21++) {
                                    if ((var9 & class189.field3679[var19 + 1][var15][var21]) == 0) {
                                        break label347;
                                    }
                                }
                                var19++;
                            }
                            int var22 = (var17 + 1 - var16) * (var19 + 1 - var18);
                            if (var22 >= 8) {
                                short var23 = 240;
                                int var24 = class179.field3418[var19][var15][var16] - var23;
                                int var25 = class179.field3418[var18][var15][var16];
                                class116.method708(var12, 1, var15 * 128, var15 * 128, var16 * 128, var17 * 128 + 128, var24, var25);
                                for (int var26 = var18; var26 <= var19; var26++) {
                                    for (int var27 = var16; var27 <= var17; var27++) {
                                        class189.field3679[var26][var15][var27] = class10.method61(class189.field3679[var26][var15][var27], ~var9);
                                    }
                                }
                            }
                        }
                        if ((class189.field3679[var13][var15][var14] & var10) != 0) {
                            int var28 = var15;
                            int var29 = var15;
                            while (var28 > 0 && (var10 & class189.field3679[var13][var28 - 1][var14]) != 0) {
                                var28--;
                            }
                            while (var29 < 104 && (var10 & class189.field3679[var13][var29 + 1][var14]) != 0) {
                                var29++;
                            }
                            int var30 = var13;
                            int var31 = var13;
                            label413: while (var30 > 0) {
                                for (int var32 = var28; var32 <= var29; var32++) {
                                    if ((var10 & class189.field3679[var30 - 1][var32][var14]) == 0) {
                                        break label413;
                                    }
                                }
                                var30--;
                            }
                            label402: while (var31 < var12) {
                                for (int var33 = var28; var33 <= var29; var33++) {
                                    if ((class189.field3679[var31 + 1][var33][var14] & var10) == 0) {
                                        break label402;
                                    }
                                }
                                var31++;
                            }
                            int var34 = (var29 + 1 - var28) * (var31 + 1 - var30);
                            if (var34 >= 8) {
                                short var35 = 240;
                                int var36 = class179.field3418[var30][var28][var14];
                                int var37 = class179.field3418[var31][var28][var14] - var35;
                                class116.method708(var12, 2, var28 * 128, var29 * 128 + 128, var14 * 128, var14 * 128, var37, var36);
                                for (int var38 = var30; var38 <= var31; var38++) {
                                    for (int var39 = var28; var39 <= var29; var39++) {
                                        class189.field3679[var38][var39][var14] = class10.method61(class189.field3679[var38][var39][var14], ~var10);
                                    }
                                }
                            }
                        }
                        if ((var11 & class189.field3679[var13][var15][var14]) != 0) {
                            int var40 = var15;
                            int var41 = var14;
                            int var42 = var15;
                            int var43;
                            for (var43 = var14; var43 < 104 && (var11 & class189.field3679[var13][var15][var43 + 1]) != 0; var43++) {
                            }
                            while (var41 > 0 && (var11 & class189.field3679[var13][var15][var41 - 1]) != 0) {
                                var41--;
                            }
                            label467: while (var42 > 0) {
                                for (int var44 = var41; var44 <= var43; var44++) {
                                    if ((var11 & class189.field3679[var13][var42 - 1][var44]) == 0) {
                                        break label467;
                                    }
                                }
                                var42--;
                            }
                            label456: while (var40 < 104) {
                                for (int var45 = var41; var45 <= var43; var45++) {
                                    if ((class189.field3679[var13][var40 + 1][var45] & var11) == 0) {
                                        break label456;
                                    }
                                }
                                var40++;
                            }
                            if ((var40 + 1 - var42) * (var43 - var41 + 1) >= 4) {
                                int var46 = class179.field3418[var13][var42][var41];
                                class116.method708(var12, 4, var42 * 128, var40 * 128 + 128, var41 * 128, var43 * 128 + 128, var46, var46);
                                for (int var47 = var42; var47 <= var40; var47++) {
                                    for (int var48 = var41; var48 <= var43; var48++) {
                                        class189.field3679[var13][var47][var48] = class10.method61(class189.field3679[var13][var47][var48], ~var11);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)I")
    private static final int method525(int arg0, int arg1, int arg2) {
        field1656++;
        if (~arg1 == arg0) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }
}
