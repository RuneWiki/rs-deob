import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class44 {

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Lvc;")
    private static class137 field487 = class45.method325("(X", -46);

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "[I")
    public static int[] field484 = new int[5];

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lvc;")
    private static class137 field483 = class45.method325("Invalid loginserver requested)3", -46);

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field491 = 2;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field498 = 0;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field481 = 0;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lvc;")
    public static class137 field488 = field483;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static volatile int field493 = 0;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Lvc;")
    public static class137 field499 = class45.method325("(Udns", -46);

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Lia;")
    public static class57 field490;

    @OriginalMember(owner = "client!client", name = "A", descriptor = "[[I")
    public static int[][] field479;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[Lic;Ll;)V")
    public static final void method184(boolean arg0, class59[] arg1, class74 arg2) {
        field497++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class70.field1490[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class70.field1490[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method423(var110, -70, var111);
                        }
                    }
                }
            }
        }
        class89.field2140 += (int) (Math.random() * 5.0D) - 2;
        class34.field733 += (int) (Math.random() * 5.0D) - 2;
        if (class34.field733 < -16) {
            class34.field733 = -16;
        }
        if (class34.field733 > 16) {
            class34.field733 = 16;
        }
        if (class89.field2140 < -8) {
            class89.field2140 = -8;
        }
        if (class89.field2140 > 8) {
            class89.field2140 = 8;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class28.field615[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class61.field1329[var4][var101 + 1][var50] - class61.field1329[var4][var101 - 1][var50];
                    int var103 = class61.field1329[var4][var101][var50 + 1] - class61.field1329[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = (var103 << 8) / var104;
                    int var107 = 65536 / var104;
                    int var108 = (var47[var101][var50] >> 1) + (var47[var101 + 1][var50] >> 3) + (var47[var101 + -1][var50] >> 2) - (-(var47[var101][var50 + -1] >> 2) - (var47[var101][var50 - -1] >> 3));
                    int var109 = (var105 * -50 + var107 * -10 + var106 * -50) / var49 + 96;
                    class12.field272[var101][var50] = var109 - var108;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class127.field3000[var51] = 0;
                class11.field239[var51] = 0;
                class37.field828[var51] = 0;
                class114.field2694[var51] = 0;
                class36.field787[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class78.field1746[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class7 var97 = class91.method672(-1019, var96 - 1);
                            class127.field3000[var55] += var97.field136;
                            class11.field239[var55] += var97.field153;
                            class37.field828[var55] += var97.field135;
                            class114.field2694[var55] += var97.field144;
                            var10002 = class36.field787[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class78.field1746[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class7 var100 = class91.method672(-1019, var99 - 1);
                            class127.field3000[var55] -= var100.field136;
                            class11.field239[var55] -= var100.field153;
                            class37.field828[var55] -= var100.field135;
                            class114.field2694[var55] -= var100.field144;
                            var10002 = class36.field787[var55]--;
                        }
                    }
                }
                if (var52 >= 1 && var52 < 103) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 109; var61++) {
                        int var62 = var61 + 5;
                        int var63 = var61 - 5;
                        if (var62 >= 0 && var62 < 104) {
                            var56 += class127.field3000[var62];
                            var60 += class36.field787[var62];
                            var57 += class11.field239[var62];
                            var59 += class37.field828[var62];
                            var58 += class114.field2694[var62];
                        }
                        if (var63 >= 0 && var63 < 104) {
                            var60 -= class36.field787[var63];
                            var57 -= class11.field239[var63];
                            var56 -= class127.field3000[var63];
                            var58 -= class114.field2694[var63];
                            var59 -= class37.field828[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class25.field603 || (class70.field1490[0][var52][var61] & 0x2) != 0 || (class70.field1490[var4][var52][var61] & 0x10) == 0 && class111.method866((byte) -22, var4, var52, var61) == class23.field559)) {
                            if (class92.field2191 > var4) {
                                class92.field2191 = var4;
                            }
                            int var64 = class78.field1746[var4][var52][var61] & 0xFF;
                            int var65 = class98.field2300[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class61.field1329[var4][var52][var61];
                                int var67 = class61.field1329[var4][var52 + 1][var61];
                                int var68 = class61.field1329[var4][var52 + 1][var61 + 1];
                                int var69 = class12.field272[var52 + 1][var61];
                                int var70 = class61.field1329[var4][var52][var61 + 1];
                                int var71 = class12.field272[var52][var61];
                                int var72 = class12.field272[var52 + 1][var61 + 1];
                                int var73 = -1;
                                int var74 = -1;
                                int var75 = class12.field272[var52][var61 + 1];
                                if (var64 > 0) {
                                    int var76 = var56 * 256 / var58;
                                    int var77 = var59 / var60;
                                    int var78 = var57 / var60;
                                    var74 = class132.method972(var77, var78, var76, -21194);
                                    int var79 = class34.field733 + var77;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 255) {
                                        var79 = 255;
                                    }
                                    int var80 = class89.field2140 + var76 & 0xFF;
                                    var73 = class132.method972(var79, var78, var80, -21194);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class84.field1896[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class120.method910(false, var65 - 1).field1065) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var66 == var68 && var66 == var70) {
                                        class75.field1683[var4][var52][var61] = class49.method351(class75.field1683[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var73 != -1) {
                                    var82 = class97.field2267[class107.method780(var73, 96, 12345678)];
                                }
                                if (var65 == 0) {
                                    arg2.method515(var4, var52, var61, 0, 0, -1, var66, var67, var68, var70, class107.method780(var74, var71, 12345678), class107.method780(var74, var69, 12345678), class107.method780(var74, var72, 12345678), class107.method780(var74, var75, 12345678), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class84.field1896[var4][var52][var61] + 1;
                                    byte var84 = class134.field3108[var4][var52][var61];
                                    class48 var85 = class120.method910(arg0, var65 - 1);
                                    int var86 = var85.field1070;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = -1;
                                        var88 = class97.field2256.method11(!arg0, var86);
                                    } else if (var85.field1066 == 16711935) {
                                        var87 = -2;
                                        var88 = -2;
                                        var86 = -1;
                                    } else {
                                        var87 = class132.method972(var85.field1073, var85.field1060, var85.field1057, -21194);
                                        int var89 = class89.field2140 + var85.field1057 & 0xFF;
                                        int var90 = class34.field733 + var85.field1073;
                                        if (var90 < 0) {
                                            var90 = 0;
                                        } else if (var90 > 255) {
                                            var90 = 255;
                                        }
                                        var88 = class132.method972(var90, var85.field1060, var89, -21194);
                                    }
                                    int var91 = 0;
                                    if (var88 != -2) {
                                        var91 = class97.field2267[class105.method765(var88, 96, (byte) -126)];
                                    }
                                    if (var85.field1059 != -1) {
                                        int var92 = var85.field1067 + class89.field2140 & 0xFF;
                                        int var93 = class34.field733 + var85.field1058;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class132.method972(var93, var85.field1061, var92, -21194);
                                        var91 = class97.field2267[class105.method765(var94, 96, (byte) -111)];
                                    }
                                    arg2.method515(var4, var52, var61, var83, var84, var86, var66, var67, var68, var70, class107.method780(var74, var71, 12345678), class107.method780(var74, var69, 12345678), class107.method780(var74, var72, 12345678), class107.method780(var74, var75, 12345678), class105.method765(var87, var71, (byte) -112), class105.method765(var87, var69, (byte) -123), class105.method765(var87, var72, (byte) -115), class105.method765(var87, var75, (byte) -127), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg2.method512(var4, var54, var53, class111.method866((byte) -22, var4, var54, var53));
                }
            }
            class78.field1746[var4] = null;
            class98.field2300[var4] = null;
            class84.field1896[var4] = null;
            class134.field3108[var4] = null;
            class28.field615[var4] = null;
        }
        arg2.method527(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class70.field1490[1][var5][var46] & 0x2) == 2) {
                    arg2.method544(var5, var46);
                }
            }
        }
        if (arg0) {
            return;
        }
        int var6 = 1;
        int var7 = 2;
        int var8 = 4;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var7 <<= 0x3;
                var6 <<= 0x3;
                var8 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((class75.field1683[var10][var12][var11] & var6) != 0) {
                            int var13 = var11;
                            int var14 = var10;
                            while (var13 < 104 && (var6 & class75.field1683[var10][var12][var13 + 1]) != 0) {
                                var13++;
                            }
                            int var15 = var11;
                            int var16 = var10;
                            while (var15 > 0 && (var6 & class75.field1683[var10][var12][var15 - 1]) != 0) {
                                var15--;
                            }
                            label360: while (var14 > 0) {
                                for (int var17 = var15; var17 <= var13; var17++) {
                                    if ((class75.field1683[var14 - 1][var12][var17] & var6) == 0) {
                                        break label360;
                                    }
                                }
                                var14--;
                            }
                            label349: while (var16 < var9) {
                                for (int var18 = var15; var18 <= var13; var18++) {
                                    if ((var6 & class75.field1683[var16 + 1][var12][var18]) == 0) {
                                        break label349;
                                    }
                                }
                                var16++;
                            }
                            int var19 = (var13 + 1 - var15) * (var16 + 1 - var14);
                            if (var19 >= 8) {
                                int var20 = class61.field1329[var14][var12][var15];
                                short var21 = 240;
                                int var22 = class61.field1329[var16][var12][var15] - var21;
                                class74.method548(var9, 1, var12 * 128, var12 * 128, var15 * 128, var13 * 128 + 128, var22, var20);
                                for (int var23 = var14; var23 <= var16; var23++) {
                                    for (int var24 = var15; var24 <= var13; var24++) {
                                        class75.field1683[var23][var12][var24] = class45.method323(class75.field1683[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((var7 & class75.field1683[var10][var12][var11]) != 0) {
                            int var25;
                            for (var25 = var12; var25 > 0 && (class75.field1683[var10][var25 - 1][var11] & var7) != 0; var25--) {
                            }
                            int var26 = var12;
                            int var27 = var10;
                            int var28 = var10;
                            while (var26 < 104 && (class75.field1683[var10][var26 + 1][var11] & var7) != 0) {
                                var26++;
                            }
                            label414: while (var28 > 0) {
                                for (int var29 = var25; var29 <= var26; var29++) {
                                    if ((class75.field1683[var28 - 1][var29][var11] & var7) == 0) {
                                        break label414;
                                    }
                                }
                                var28--;
                            }
                            label403: while (var9 > var27) {
                                for (int var30 = var25; var30 <= var26; var30++) {
                                    if ((class75.field1683[var27 + 1][var30][var11] & var7) == 0) {
                                        break label403;
                                    }
                                }
                                var27++;
                            }
                            int var31 = (var27 + 1 - var28) * (var26 + 1 + -var25);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class61.field1329[var28][var25][var11];
                                int var34 = class61.field1329[var27][var25][var11] - var32;
                                class74.method548(var9, 2, var25 * 128, var26 * 128 + 128, var11 * 128, var11 * 128, var34, var33);
                                for (int var35 = var28; var35 <= var27; var35++) {
                                    for (int var36 = var25; var36 <= var26; var36++) {
                                        class75.field1683[var35][var36][var11] = class45.method323(class75.field1683[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((var8 & class75.field1683[var10][var12][var11]) != 0) {
                            int var37 = var12;
                            int var38 = var12;
                            int var39;
                            for (var39 = var11; var39 > 0 && (var8 & class75.field1683[var10][var12][var39 - 1]) != 0; var39--) {
                            }
                            int var40;
                            for (var40 = var11; var40 < 104 && (var8 & class75.field1683[var10][var12][var40 + 1]) != 0; var40++) {
                            }
                            label468: while (var38 > 0) {
                                for (int var41 = var39; var41 <= var40; var41++) {
                                    if ((class75.field1683[var10][var38 - 1][var41] & var8) == 0) {
                                        break label468;
                                    }
                                }
                                var38--;
                            }
                            label457: while (var37 < 104) {
                                for (int var42 = var39; var42 <= var40; var42++) {
                                    if ((var8 & class75.field1683[var10][var37 + 1][var42]) == 0) {
                                        break label457;
                                    }
                                }
                                var37++;
                            }
                            if ((var37 + 1 - var38) * (-var39 - -1 + var40) >= 4) {
                                int var43 = class61.field1329[var10][var38][var39];
                                class74.method548(var9, 4, var38 * 128, var37 * 128 + 128, var39 * 128, var40 * 128 + 128, var43, var43);
                                for (int var44 = var38; var44 <= var37; var44++) {
                                    for (int var45 = var39; var45 <= var40; var45++) {
                                        class75.field1683[var10][var44][var45] = class45.method323(class75.field1683[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Z")
    public static final boolean method185(int arg0, int arg1) {
        field501++;
        int var2 = 22 / ((arg0 - 67) / 59);
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method186(byte arg0) {
        if (class64.field1351) {
            class129.method960(class124.field2871, -1);
            class12.method78(class124.field2871, (byte) -106);
            if (class83.field1856 != null) {
                class83.field1856.method17(class124.field2871, -1);
            }
            this.method317(2616);
            class72.method501(false, class124.field2871);
            class29.method227(class124.field2871, 0);
            if (class83.field1856 != null) {
                class83.field1856.method19(class124.field2871, 50);
            }
        }
        if (class107.field2493 == 0) {
            class115.method891(class67.field1389, null, class115.field2733, 110);
        } else if (class107.field2493 == 5) {
            class86.method632(class42.field925, (byte) 106, class10.field206);
        } else if (class107.field2493 == 10) {
            class86.method632(class42.field925, (byte) 97, class10.field206);
        } else if (class107.field2493 == 20) {
            class86.method632(class42.field925, (byte) 109, class10.field206);
        } else if (class107.field2493 == 25) {
            if (class102.field2381 == 1) {
                if (class13.field279 > class123.field2851) {
                    class123.field2851 = class13.field279;
                }
                int var2 = (class123.field2851 - class13.field279) * 50 / class123.field2851;
                class7.method42((byte) -23, class114.field2723, class88.method666(-104, new class137[] { field487, class61.method435(var2, 103), class115.field2731 }), true);
            } else if (class102.field2381 == 2) {
                if (class125.field2883 < class114.field2700) {
                    class125.field2883 = class114.field2700;
                }
                int var3 = (class125.field2883 - class114.field2700) * 50 / class125.field2883 + 50;
                class7.method42((byte) -23, class114.field2723, class88.method666(112, new class137[] { field487, class61.method435(var3, 71), class115.field2731 }), true);
            } else {
                class7.method42((byte) -23, class114.field2723, null, false);
            }
        } else if (class107.field2493 == 30) {
            class12.method76(-25045);
        } else if (class107.field2493 == 35) {
            class106.method768(-78);
        } else if (class107.field2493 == 40) {
            class7.method42((byte) -23, class30.field674, class109.field2563, false);
        }
        class95.field2245 = 0;
        field485++;
        class105.field2444 = 0;
        int var4 = -120 / ((arg0 - 51) / 54);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method187(int arg0) {
        field504++;
        if (arg0 != -21226) {
            field481 = 126;
        }
        try {
            Graphics var1 = class124.field2871.getGraphics();
            class28.field620.method61(17, var1, 357, (byte) -43);
        } catch (Exception var2) {
            class124.field2871.repaint();
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field496++;
        if (!this.method307(-103)) {
            return;
        }
        class82.field1853 = Integer.parseInt(this.getParameter("worldid"));
        class72.field1516 = Integer.parseInt(this.getParameter("modewhat"));
        class115.field2744 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class11.method68(15);
        } else {
            class84.method611(11);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class73.field1559 = true;
        } else {
            class73.field1559 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class67.method478(1000);
            class13.field297 = 1;
        }
        this.method316(765, 448, false, 503, class72.field1516 + 32);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method188(int arg0) {
        field505++;
        if (~class107.field2493 != arg0) {
            boolean var2 = class59.method416(true);
            if (!var2) {
                this.method197(50);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BILla;)V")
    public static final void method189(byte arg0, int arg1, class75 arg2) {
        if (arg0 < 78) {
            field499 = null;
        }
        field489++;
        class2.method14(arg2.field1672, 25358, arg1, arg2.field1646);
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method190(int arg0) {
        field486++;
        if (!class7.field148) {
            return;
        }
        class28.field620 = null;
        class4.field105 = null;
        class110.field2599 = null;
        class99.field2305 = null;
        class6.field107 = null;
        class72.field1522 = null;
        class6.field121 = null;
        class13.field290 = null;
        class43.field931 = null;
        class105.field2428 = null;
        class103.field2398 = null;
        class4.field104 = null;
        class33.field707 = null;
        class6.field115 = null;
        class116.field2751 = null;
        class107.field2482 = null;
        class105.field2427 = null;
        class73.field1544 = null;
        class93.field2213 = null;
        class91.field2157 = null;
        if (arg0 != 1) {
            field484 = null;
        }
        class134.field3107 = null;
        class84.field1903 = null;
        class7.field148 = false;
        class8.field186 = null;
        class21.field426 = null;
        class48.field1081 = null;
        class11.field222 = null;
        class48.field1079 = null;
        class95.field2244 = null;
        class115.field2745 = null;
        class19.field410 = null;
        class10.field208 = null;
        class98.field2282 = null;
        class116.field2766 = null;
        class49.field1104 = null;
        field490 = null;
        class75.field1690 = null;
        class59.field1272 = null;
        class120.field2805 = null;
        class82.field1844 = null;
        class92.field2178 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method191(int arg0) {
        class132.field3075 = class115.field2744 == 0 ? 443 : class82.field1853 + 50000;
        class134.field3102 = class115.field2744 == 0 ? 43594 : class82.field1853 + 40000;
        field494++;
        class116.field2754 = class134.field3102;
        class141.method1083(120);
        class72.method501(false, class124.field2871);
        class29.method227(class124.field2871, 0);
        class83.field1856 = class10.method67(arg0 ^ 0x9B96);
        if (class83.field1856 != null) {
            class83.field1856.method19(class124.field2871, arg0 - 39950);
        }
        class131.field3051 = class50.field1126;
        try {
            if (class131.field3048.field1110 != null) {
                class91.field2170 = new class111(class131.field3048.field1110, 5200, 0);
                for (int var2 = 0; var2 < 14; var2++) {
                    class141.field3322[var2] = new class111(class131.field3048.field1120[var2], 6000, 0);
                }
                class45.field1018 = new class111(class131.field3048.field1123, 6000, 0);
                class143.field3374 = new class21(255, class91.field2170, class45.field1018, 500000);
                class131.field3048.field1120 = null;
                class131.field3048.field1110 = null;
                class131.field3048.field1123 = null;
            }
        } catch (IOException var3) {
            class45.field1018 = null;
            class143.field3374 = null;
            class91.field2170 = null;
        }
        if (class115.field2744 != 0) {
            class106.field2458 = true;
        }
        class45.field1021 = new class85();
        if (arg0 != 40000) {
            field487 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method192(int arg0) {
        field492++;
        method193((byte) 54);
        class137.method994(85);
        class44.method315(-6);
        class131.method964((byte) -77);
        class93.method677((byte) -118);
        class19.method170((byte) -64);
        class109.method811(-1854422280);
        class61.method436((byte) 49);
        class39.method283(119);
        class111.method865(-1);
        class21.method183(true);
        class56.method387((byte) -117);
        class110.method849(-50);
        class145.method1145();
        class74.method526();
        class59.method422(48);
        class125.method935(0);
        class100.method729(30330);
        class85.method618(-31);
        class2.method20((byte) 105);
        class112.method872(-100);
        class99.method719(-35);
        class58.method408(0);
        class143.method1096((byte) -59);
        class75.method563(-64);
        class73.method506((byte) 77);
        class139.method1066((byte) -99);
        class107.method775((byte) -98);
        class116.method897(-16142);
        class77.method572(-50);
        class105.method766((byte) -100);
        class14.method100();
        class144.method1126();
        class106.method769(101);
        class104.method755((byte) 0);
        class12.method77(-77);
        class69.method487(-1);
        class134.method992((byte) 118);
        class132.method969(-6863);
        class103.method750(1);
        class35.method251(false);
        class49.method355(-64);
        class71.method496(-119);
        class33.method246((byte) 109);
        class52.method374();
        class70.method492(true);
        class84.method610(100);
        class60.method430(true);
        class123.method922(22771);
        class88.method648((byte) 111);
        class29.method226(-2);
        class13.method82(0);
        class86.method633(2047);
        class78.method578(117);
        class11.method73((byte) -78);
        class63.method463(1504);
        class8.method59(114);
        class38.method273(-28);
        class34.method249(false);
        class97.method690();
        class62.method444();
        class72.method505((byte) 111);
        class124.method929(true);
        class121.method913(true);
        class48.method347(-94);
        class7.method44((byte) 117);
        class102.method746((byte) 97);
        class126.method941(23739);
        class141.method1088((byte) -112);
        class25.method211(0);
        class108.method782((byte) -84);
        class10.method65(false);
        class53.method375((byte) 119);
        class45.method326((byte) -87);
        class1.method3(false);
        class20.method174();
        class36.method258((byte) 24);
        class89.method670((byte) -116);
        class67.method473((byte) -125);
        class142.method1094(98);
        class82.method602(-30093);
        class37.method269((byte) 69);
        class24.method209(true);
        class46.method333((byte) 115);
        class42.method297(true);
        class79.method583();
        class68.method484(-568);
        class127.method954((byte) -117);
        class128.method956(true);
        class129.method959(-1);
        class120.method906(32);
        class92.method675(true);
        class6.method37(-85);
        class119.method905(-125);
        class22.method199(-517);
        class30.method231((byte) -99);
        class4.method25((byte) 126);
        class40.method290(26578);
        class32.method238((byte) 38);
        class23.method206(true);
        class28.method221(0);
        class43.method302((byte) -36);
        class101.method736();
        class122.method914((byte) 80);
        class65.method471();
        class83.method607((byte) 56);
        class113.method882();
        class80.method589(-25035);
        class98.method712((byte) -17);
        class115.method894(true);
        class114.method890(-44);
        class51.method373();
        class16.method148();
        class64.method467((byte) -45);
        class91.method673((byte) -30);
        class47.method343((byte) 114);
        class133.method989();
        if (arg0 <= 98) {
            field481 = -52;
        }
        class95.method684(false);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public static void method193(byte arg0) {
        field483 = null;
        field479 = null;
        if (arg0 < 49) {
            field491 = -110;
        }
        field487 = null;
        field499 = null;
        field490 = null;
        field484 = null;
        field488 = null;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class13.method87(-119);
            }
            class82.field1853 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class115.field2744 = 0;
            } else if (arg0[1].equals("office")) {
                class115.field2744 = 1;
            } else if (arg0[1].equals("local")) {
                class115.field2744 = 2;
            } else {
                class13.method87(-54);
            }
            if (arg0[2].equals("live")) {
                class72.field1516 = 0;
            } else if (arg0[2].equals("rc")) {
                class72.field1516 = 1;
            } else if (arg0[2].equals("wip")) {
                class72.field1516 = 2;
            } else {
                class13.method87(-64);
            }
            if (arg0[3].equals("lowmem")) {
                class11.method68(15);
            } else if (arg0[3].equals("highmem")) {
                class84.method611(11);
            } else {
                class13.method87(-94);
            }
            if (arg0[4].equals("free")) {
                class73.field1559 = false;
            } else if (arg0[4].equals("members")) {
                class73.field1559 = true;
            } else {
                class13.method87(-125);
            }
            if (arg0[5].equals("english")) {
                class13.field297 = 0;
            } else if (arg0[5].equals("german")) {
                class67.method478(1000);
                class13.field297 = 1;
            } else {
                class13.method87(-116);
            }
            client var1 = new client();
            var1.method306("runescape", class72.field1516 + 32, true, 765, 503, 448, InetAddress.getLocalHost(), 14);
        } catch (Exception var3) {
            class110.method850((byte) -70, null, var3);
        }
        field482++;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method194(int arg0) {
        field495++;
        class112.field2667++;
        this.method188(arg0 ^ 0x81F);
        if (arg0 != -3064) {
            this.method194(61);
        }
        class36.method260(0);
        class13.method89(76);
        class103.method751((byte) 110);
        class115.method892(127);
        class46.method335(arg0 ^ 0xB85);
        if (class83.field1856 != null) {
            int var2 = class83.field1856.method15(-1);
            class105.field2444 += var2;
            class114.field2706 = var2;
        }
        if (class107.field2493 == 0) {
            class84.method609(true);
            class120.method908((byte) -127);
        } else if (class107.field2493 == 5) {
            class84.method609(true);
            class120.method908((byte) -126);
        } else if (class107.field2493 == 10) {
            class36.method262(arg0 ^ 0xBC6);
        } else if (class107.field2493 == 20) {
            class36.method262(arg0 + 3157);
            class36.method266(-30465);
        } else if (class107.field2493 == 25) {
            class30.method230((byte) 72);
        }
        if (class107.field2493 == 30) {
            class32.method236(0);
        } else if (class107.field2493 == 35) {
            class32.method236(0);
        } else if (class107.field2493 == 40) {
            class36.method266(-30465);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method195(boolean arg0) {
        if (class47.field1050 != null) {
            class47.field1050.field390 = false;
        }
        field502++;
        class47.field1050 = null;
        if (class69.field1446 != null) {
            class69.field1446.method434(79);
            class69.field1446 = null;
        }
        class46.method334((byte) -105);
        class59.method417(126);
        class83.field1856 = null;
        class13.method83(-31526);
        class37.method270((byte) 125);
        class42.method300(60);
        class139.method1064(-128);
        try {
            if (class91.field2170 != null) {
                class91.field2170.method859(-2131);
            }
            if (class141.field3322 != null) {
                for (int var2 = 0; var2 < class141.field3322.length; var2++) {
                    if (class141.field3322[var2] != null) {
                        class141.field3322[var2].method859(-2131);
                    }
                }
            }
            if (!arg0 && class45.field1018 != null) {
                class45.field1018.method859(-2131);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method196(int arg0, int arg1) {
        if (arg0 != 29893) {
            method193((byte) 87);
        }
        class141.field3293 = null;
        class139.field3220 = 0;
        field480++;
        if (class134.field3102 == class116.field2754) {
            class116.field2754 = class132.field3075;
        } else {
            class116.field2754 = class134.field3102;
        }
        class108.field2518 = null;
        class143.field3397++;
        if (class143.field3397 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class107.field2493 > 5) {
                class72.field1521 = 3000;
            } else {
                this.method318("js5connect_full", 0);
                class107.field2493 = 1000;
            }
        } else if (class143.field3397 >= 2 && arg1 == 6) {
            this.method318("js5connect_outofdate", 0);
            class107.field2493 = 1000;
        } else if (class143.field3397 >= 4) {
            if (class107.field2493 > 5) {
                class72.field1521 = 3000;
            } else {
                this.method318("js5connect", 0);
                class107.field2493 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method197(int arg0) {
        field500++;
        if (class75.field1696 >= 4) {
            this.method318("js5crc", 0);
            class107.field2493 = 1000;
            return;
        }
        if (class24.field579 >= 4) {
            if (class107.field2493 <= 5) {
                this.method318("js5io", 0);
                class107.field2493 = 1000;
                return;
            }
            class24.field579 = 3;
            class72.field1521 = 3000;
        }
        if (class72.field1521-- > 0) {
            return;
        }
        try {
            if (class139.field3220 == 0) {
                class108.field2518 = class131.field3048.method360(class116.field2754, 0);
                class139.field3220++;
            }
            if (class139.field3220 == 1) {
                if (class108.field2518.field3131 == 2) {
                    this.method196(29893, -1);
                    return;
                }
                if (class108.field2518.field3131 == 1) {
                    class139.field3220++;
                }
            }
            if (class139.field3220 == 2) {
                class141.field3293 = new class61((Socket) class108.field2518.field3129, class131.field3048);
                class109 var2 = new class109(5);
                var2.method837(-85, 15);
                var2.method817(-2770, 448);
                class141.field3293.method440(0, 5, false, var2.field2547);
                class139.field3220++;
                class91.field2153 = class60.method432(true);
            }
            if (class139.field3220 == 3) {
                if (class107.field2493 <= 5 || class141.field3293.method438(-85) > 0) {
                    int var3 = class141.field3293.method433(-10648);
                    if (var3 != 0) {
                        this.method196(29893, var3);
                        return;
                    }
                    class139.field3220++;
                } else if (class60.method432(true) - class91.field2153 > 30000L) {
                    this.method196(29893, -2);
                    return;
                }
            }
            if (class139.field3220 == 4) {
                class29.method225(false, class107.field2493 > 20, class141.field3293);
                class139.field3220 = 0;
                class108.field2518 = null;
                class141.field3293 = null;
                class143.field3397 = 0;
            }
        } catch (IOException var4) {
            this.method196(29893, -3);
        }
        if (arg0 < 15) {
            field498 = -7;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
    public static final void method198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field503++;
        if (class132.field3088 == arg4 && class11.field249 == arg1 && (class23.field559 == arg2 || !class25.field603)) {
            return;
        }
        class132.field3088 = arg4;
        class11.field249 = arg1;
        class23.field559 = arg2;
        if (!class25.field603) {
            class23.field559 = 0;
        }
        class33.method245(25, -119);
        class7.method42((byte) -23, class114.field2723, null, false);
        int var6 = class91.field2163;
        class91.field2163 = (arg1 - 6) * 8;
        int var7 = class91.field2163 - var6;
        int var8 = class58.field1227;
        class58.field1227 = (arg4 - 6) * 8;
        int var9 = class58.field1227 - var8;
        int var10 = class58.field1227;
        int var11 = class91.field2163;
        for (int var12 = 0; var12 < 32768; var12++) {
            class56 var28 = class125.field2914[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field1647[var29] -= var9;
                    var28.field1624[var29] -= var7;
                }
                var28.field1672 -= var9 * 128;
                var28.field1646 -= var7 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class125 var26 = class102.field2358[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field1647[var27] -= var9;
                    var26.field1624[var27] -= var7;
                }
                var26.field1646 -= var7 * 128;
                var26.field1672 -= var9 * 128;
            }
        }
        class28.field627 = arg2;
        class104.field2412.method559(false, (byte) -103, arg5, arg0);
        byte var14 = 104;
        byte var15 = 1;
        byte var16 = 0;
        byte var17 = 104;
        byte var18 = 1;
        if (var7 < 0) {
            var16 = 103;
            var17 = -1;
            var18 = -1;
        }
        byte var19 = 0;
        if (var9 < 0) {
            var19 = 103;
            var15 = -1;
            var14 = -1;
        }
        for (int var20 = var19; var20 != var14; var20 += var15) {
            for (int var22 = var16; var22 != var17; var22 += var18) {
                int var23 = var7 + var22;
                int var24 = var9 + var20;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
                        class40.field914[var25][var20][var22] = class40.field914[var25][var24][var23];
                    } else {
                        class40.field914[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class73 var21 = (class73) class2.field44.method726(0); var21 != null; var21 = (class73) class2.field44.method731((byte) -117)) {
            var21.field1558 -= var7;
            var21.field1548 -= var9;
            if (var21.field1548 < 0 || var21.field1558 < 0 || var21.field1548 >= 104 || var21.field1558 >= 104) {
                var21.method776(0);
            }
        }
        if (class48.field1088 != arg3) {
            class72.field1535 -= var7;
            class48.field1088 -= var9;
        }
        class120.field2809 = -1;
        class68.field1394 = 0;
        class32.field691 = false;
        class128.field3008.method728(79);
        class73.field1540.method728(49);
    }
}
