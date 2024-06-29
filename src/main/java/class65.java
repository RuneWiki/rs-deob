import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class65 extends class13 {

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "Z")
    public boolean field1505 = false;

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "I")
    public int field1516 = -1;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "[I")
    private int[] field1496 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    public static int field1502 = 2;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "Lec;")
    private static class32 field1500 = class73.method594("Too many incorrect logins from your address)3", true);

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "Lec;")
    public static class32 field1506 = class73.method594("sl_flags", true);

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "Lec;")
    public static class32 field1513 = class73.method594("Spieler kann nicht gefunden werden: ", true);

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "Lec;")
    public static class32 field1509 = class73.method594("<)4col>", true);

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "Lec;")
    public static class32 field1515 = field1500;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "[Lre;")
    public static class123[] field1510 = new class123[50];

    @OriginalMember(owner = "client!jc", name = "gb", descriptor = "Lec;")
    public static class32 field1521 = class73.method594(":trade:", true);

    @OriginalMember(owner = "client!jc", name = "hb", descriptor = "Lec;")
    private static class32 field1522 = class73.method594("Username: ", true);

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "Lec;")
    public static class32 field1507 = field1522;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!jc", name = "db", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!jc", name = "fb", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "Lb;")
    public static class8 field1512;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "[I")
    private int[] field1511;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "[S")
    private short[] field1497;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "[S")
    private short[] field1504;

    @OriginalMember(owner = "client!jc", name = "cb", descriptor = "[S")
    private short[] field1517;

    @OriginalMember(owner = "client!jc", name = "eb", descriptor = "[S")
    private short[] field1519;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)Z")
    public final boolean method496(int arg0) {
        field1514++;
        if (this.field1511 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1511.length; var3++) {
            if (!class15.field307.method213(this.field1511[var3], true, 0)) {
                var2 = false;
            }
        }
        if (arg0 < 20) {
            this.method503(55);
        }
        return var2;
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V")
    public static void method497(int arg0) {
        field1513 = null;
        field1522 = null;
        field1510 = null;
        field1509 = null;
        field1521 = null;
        field1507 = null;
        field1506 = null;
        field1512 = null;
        field1500 = null;
        field1515 = null;
        int var1 = -72 % ((arg0 + 49) / 59);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLjd;)V")
    public final void method498(byte arg0, class66 arg1) {
        field1503++;
        while (true) {
            int var3 = arg1.method533(255);
            if (var3 == 0) {
                int var4 = 4 / ((-arg0 - 46) / 54);
                return;
            }
            this.method502(var3, arg1, (byte) -125);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)Z")
    public final boolean method499(byte arg0) {
        boolean var2 = true;
        int var3 = 0;
        if (arg0 != 107) {
            return false;
        }
        while (var3 < 5) {
            if (this.field1496[var3] != -1 && !class15.field307.method213(this.field1496[var3], true, 0)) {
                var2 = false;
            }
            var3++;
        }
        field1508++;
        return var2;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([Lqf;ILvd;)V")
    public static final void method500(class117[] arg0, int arg1, class150 arg2) {
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class3.field50[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class3.field50[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method919(var110, var111, 0);
                        }
                    }
                }
            }
        }
        field1520++;
        class115.field2766 += (int) (Math.random() * 5.0D) - 2;
        class54.field1277 += (int) (Math.random() * 5.0D) - 2;
        if (class115.field2766 < -16) {
            class115.field2766 = -16;
        }
        if (class54.field1277 < -8) {
            class54.field1277 = -8;
        }
        if (class54.field1277 > 8) {
            class54.field1277 = 8;
        }
        if (class115.field2766 > 16) {
            class115.field2766 = 16;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class85.field1986[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class70.field1631[var4][var101][var50 + 1] - class70.field1631[var4][var101][var50 - 1];
                    int var103 = class70.field1631[var4][var101 + 1][var50] - class70.field1631[var4][var101 - 1][var50];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = (var103 << 8) / var104;
                    int var106 = (var47[var101][var50 + 1] >> 3) + ((var47[var101 - 1][var50] >> 2) - (-(var47[var101][var50 - 1] >> 2) - (var47[var101][var50] >> 1) - (var47[var101 + 1][var50] >> 3)));
                    int var107 = 65536 / var104;
                    int var108 = (var102 << 8) / var104;
                    int var109 = (var105 * -50 + var107 * -10 + var108 * -50) / var49 + 96;
                    class31.field590[var101][var50] = var109 - var106;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class37.field895[var51] = 0;
                class68.field1593[var51] = 0;
                class106.field2513[var51] = 0;
                class33.field699[var51] = 0;
                class143.field3274[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class117.field2816[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class34 var97 = class152.method1179(-1, var96 - 1);
                            class37.field895[var55] += var97.field723;
                            class68.field1593[var55] += var97.field707;
                            class106.field2513[var55] += var97.field705;
                            class33.field699[var55] += var97.field725;
                            var10002 = class143.field3274[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class117.field2816[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class34 var100 = class152.method1179(-1, var99 - 1);
                            class37.field895[var55] -= var100.field723;
                            class68.field1593[var55] -= var100.field707;
                            class106.field2513[var55] -= var100.field705;
                            class33.field699[var55] -= var100.field725;
                            var10002 = class143.field3274[var55]--;
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
                        if (var62 >= 0 && var62 < 104) {
                            var59 += class33.field699[var62];
                            var57 += class68.field1593[var62];
                            var60 += class143.field3274[var62];
                            var56 += class37.field895[var62];
                            var58 += class106.field2513[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var56 -= class37.field895[var63];
                            var59 -= class33.field699[var63];
                            var57 -= class68.field1593[var63];
                            var58 -= class106.field2513[var63];
                            var60 -= class143.field3274[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class154.field3531 || (class3.field50[0][var52][var61] & 0x2) != 0 || (class3.field50[var4][var52][var61] & 0x10) == 0 && class34.method288(var4, 122, var61, var52) == class115.field2745)) {
                            if (class151.field3474 > var4) {
                                class151.field3474 = var4;
                            }
                            int var64 = class117.field2816[var4][var52][var61] & 0xFF;
                            int var65 = class111.field2614[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class70.field1631[var4][var52][var61];
                                int var67 = class70.field1631[var4][var52 + 1][var61];
                                int var68 = class70.field1631[var4][var52 + 1][var61 + 1];
                                int var69 = class70.field1631[var4][var52][var61 + 1];
                                int var70 = class31.field590[var52][var61];
                                int var71 = class31.field590[var52 + 1][var61 + 1];
                                int var72 = class31.field590[var52 + 1][var61];
                                int var73 = -1;
                                int var74 = -1;
                                int var75 = class31.field590[var52][var61 + 1];
                                if (var64 > 0) {
                                    int var76 = var57 / var60;
                                    int var77 = var58 / var60;
                                    int var78 = var56 * 256 / var59;
                                    var73 = class100.method797(2, var78, var77, var76);
                                    int var79 = class115.field2766 + var77;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 255) {
                                        var79 = 255;
                                    }
                                    int var80 = class54.field1277 + var78 & 0xFF;
                                    var74 = class100.method797(2, var80, var79, var76);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class134.field3131[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class50.method397(4, var65 - 1).field1339) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var66 == var68 && var66 == var69) {
                                        class103.field2428[var4][var52][var61] = class107.method864(class103.field2428[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var74 != -1) {
                                    var82 = class7.field123[class125.method985(96, var74, (byte) 115)];
                                }
                                if (var65 == 0) {
                                    arg2.method1146(var4, var52, var61, 0, 0, -1, var66, var67, var68, var69, class125.method985(var70, var73, (byte) 126), class125.method985(var72, var73, (byte) 109), class125.method985(var71, var73, (byte) 122), class125.method985(var75, var73, (byte) 112), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class134.field3131[var4][var52][var61] + 1;
                                    byte var84 = class134.field3125[var4][var52][var61];
                                    class57 var85 = class50.method397(4, var65 - 1);
                                    int var86 = var85.field1337;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var88 = -1;
                                        var87 = class7.field126.method559(var86, false);
                                    } else if (var85.field1317 == 16711935) {
                                        var86 = -1;
                                        var87 = -2;
                                        var88 = -2;
                                    } else {
                                        var88 = class100.method797(arg1 + 2, var85.field1333, var85.field1331, var85.field1334);
                                        int var89 = class54.field1277 + var85.field1333 & 0xFF;
                                        int var90 = class115.field2766 + var85.field1331;
                                        if (var90 < 0) {
                                            var90 = 0;
                                        } else if (var90 > 255) {
                                            var90 = 255;
                                        }
                                        var87 = class100.method797(2, var89, var90, var85.field1334);
                                    }
                                    int var91 = 0;
                                    if (var87 != -2) {
                                        var91 = class7.field123[class56.method439(var87, 96, arg1 ^ 0x6C)];
                                    }
                                    if (var85.field1313 != -1) {
                                        int var92 = var85.field1336 + class54.field1277 & 0xFF;
                                        int var93 = var85.field1323 + class115.field2766;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class100.method797(2, var92, var93, var85.field1316);
                                        var91 = class7.field123[class56.method439(var94, 96, arg1 + 92)];
                                    }
                                    arg2.method1146(var4, var52, var61, var83, var84, var86, var66, var67, var68, var69, class125.method985(var70, var73, (byte) 123), class125.method985(var72, var73, (byte) 113), class125.method985(var71, var73, (byte) 107), class125.method985(var75, var73, (byte) 100), class56.method439(var88, var70, arg1 ^ 0x3A), class56.method439(var88, var72, arg1 ^ 0x7F), class56.method439(var88, var71, 37), class56.method439(var88, var75, 56), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg2.method1124(var4, var54, var53, class34.method288(var4, 119, var53, var54));
                }
            }
            class117.field2816[var4] = null;
            class111.field2614[var4] = null;
            class134.field3131[var4] = null;
            class134.field3125[var4] = null;
            class85.field1986[var4] = null;
        }
        arg2.method1142(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class3.field50[1][var5][var46] & 0x2) == 2) {
                    arg2.method1159(var5, var46);
                }
            }
        }
        int var6 = 1;
        int var7 = 2;
        int var8 = 4;
        for (int var9 = arg1; var9 < 4; var9++) {
            if (var9 > 0) {
                var8 <<= 0x3;
                var7 <<= 0x3;
                var6 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((class103.field2428[var10][var12][var11] & var6) != 0) {
                            int var13;
                            for (var13 = var11; var13 > 0 && (var6 & class103.field2428[var10][var12][var13 - 1]) != 0; var13--) {
                            }
                            int var14;
                            for (var14 = var11; var14 < 104 && (var6 & class103.field2428[var10][var12][var14 + 1]) != 0; var14++) {
                            }
                            int var15 = var10;
                            int var16;
                            label353: for (var16 = var10; var16 > 0; var16--) {
                                for (int var17 = var13; var17 <= var14; var17++) {
                                    if ((class103.field2428[var16 - 1][var12][var17] & var6) == 0) {
                                        break label353;
                                    }
                                }
                            }
                            label342: while (var15 < var9) {
                                for (int var18 = var13; var18 <= var14; var18++) {
                                    if ((class103.field2428[var15 + 1][var12][var18] & var6) == 0) {
                                        break label342;
                                    }
                                }
                                var15++;
                            }
                            int var19 = (var14 + 1 - var13) * (var15 + 1 - var16);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class70.field1631[var15][var12][var13] - var20;
                                int var22 = class70.field1631[var16][var12][var13];
                                class150.method1147(var9, 1, var12 * 128, var12 * 128, var13 * 128, var14 * 128 + 128, var21, var22);
                                for (int var23 = var16; var23 <= var15; var23++) {
                                    for (int var24 = var13; var24 <= var14; var24++) {
                                        class103.field2428[var23][var12][var24] = class41.method326(class103.field2428[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((var7 & class103.field2428[var10][var12][var11]) != 0) {
                            int var25 = var12;
                            int var26 = var12;
                            while (var25 > 0 && (class103.field2428[var10][var25 - 1][var11] & var7) != 0) {
                                var25--;
                            }
                            int var27 = var10;
                            while (var26 < 104 && (var7 & class103.field2428[var10][var26 + 1][var11]) != 0) {
                                var26++;
                            }
                            int var28 = var10;
                            label408: while (var27 > 0) {
                                for (int var29 = var25; var29 <= var26; var29++) {
                                    if ((class103.field2428[var27 - 1][var29][var11] & var7) == 0) {
                                        break label408;
                                    }
                                }
                                var27--;
                            }
                            label397: while (var28 < var9) {
                                for (int var30 = var25; var30 <= var26; var30++) {
                                    if ((class103.field2428[var28 + 1][var30][var11] & var7) == 0) {
                                        break label397;
                                    }
                                }
                                var28++;
                            }
                            int var31 = (var28 + 1 - var27) * (var26 + 1 - var25);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class70.field1631[var28][var25][var11] - var32;
                                int var34 = class70.field1631[var27][var25][var11];
                                class150.method1147(var9, 2, var25 * 128, var26 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var27; var35 <= var28; var35++) {
                                    for (int var36 = var25; var36 <= var26; var36++) {
                                        class103.field2428[var35][var36][var11] = class41.method326(class103.field2428[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((class103.field2428[var10][var12][var11] & var8) != 0) {
                            int var37 = var12;
                            int var38;
                            for (var38 = var11; var38 < 104 && (var8 & class103.field2428[var10][var12][var38 + 1]) != 0; var38++) {
                            }
                            int var39 = var11;
                            int var40 = var12;
                            while (var39 > 0 && (class103.field2428[var10][var12][var39 - 1] & var8) != 0) {
                                var39--;
                            }
                            label463: while (var37 > 0) {
                                for (int var41 = var39; var41 <= var38; var41++) {
                                    if ((var8 & class103.field2428[var10][var37 - 1][var41]) == 0) {
                                        break label463;
                                    }
                                }
                                var37--;
                            }
                            label452: while (var40 < 104) {
                                for (int var42 = var39; var42 <= var38; var42++) {
                                    if ((var8 & class103.field2428[var10][var40 + 1][var42]) == 0) {
                                        break label452;
                                    }
                                }
                                var40++;
                            }
                            if ((var38 + 1 - var39) * (var40 + 1 - var37) >= 4) {
                                int var43 = class70.field1631[var10][var37][var39];
                                class150.method1147(var9, 4, var37 * 128, var40 * 128 + 128, var39 * 128, var38 * 128 + 128, var43, var43);
                                for (int var44 = var37; var44 <= var40; var44++) {
                                    for (int var45 = var39; var45 <= var38; var45++) {
                                        class103.field2428[var10][var44][var45] = class41.method326(class103.field2428[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)Lp;")
    public final class104 method501(byte arg0) {
        if (arg0 >= -73) {
            return null;
        }
        field1501++;
        if (this.field1511 == null) {
            return null;
        }
        class104[] var2 = new class104[this.field1511.length];
        for (int var3 = 0; var3 < this.field1511.length; var3++) {
            var2[var3] = class104.method842(class15.field307, this.field1511[var3], 0);
        }
        class104 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class104(var2, var2.length);
        }
        if (this.field1497 != null) {
            for (int var5 = 0; var5 < this.field1497.length; var5++) {
                var4.method835(this.field1497[var5], this.field1517[var5]);
            }
        }
        if (this.field1519 != null) {
            for (int var6 = 0; var6 < this.field1519.length; var6++) {
                var4.method855(this.field1519[var6], this.field1504[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILjd;B)V")
    private final void method502(int arg0, class66 arg1, byte arg2) {
        field1499++;
        if (arg0 == 1) {
            this.field1516 = arg1.method533(255);
        } else if (arg0 == 2) {
            int var4 = arg1.method533(255);
            this.field1511 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1511[var5] = arg1.method532(0);
            }
        } else if (arg0 == 3) {
            this.field1505 = true;
        } else if (arg0 == 40) {
            int var8 = arg1.method533(255);
            this.field1517 = new short[var8];
            this.field1497 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1497[var9] = (short) arg1.method532(0);
                this.field1517[var9] = (short) arg1.method532(0);
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method533(255);
            this.field1504 = new short[var6];
            this.field1519 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1519[var7] = (short) arg1.method532(0);
                this.field1504[var7] = (short) arg1.method532(0);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field1496[arg0 - 60] = arg1.method532(0);
        }
        if (arg2 > -122) {
            this.field1505 = false;
        }
    }

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)Lp;")
    public final class104 method503(int arg0) {
        class104[] var2 = new class104[5];
        field1498++;
        int var3 = 0;
        for (int var4 = arg0; var4 < 5; var4++) {
            if (this.field1496[var4] != -1) {
                var2[var3++] = class104.method842(class15.field307, this.field1496[var4], 0);
            }
        }
        class104 var5 = new class104(var2, var3);
        if (this.field1497 != null) {
            for (int var6 = 0; var6 < this.field1497.length; var6++) {
                var5.method835(this.field1497[var6], this.field1517[var6]);
            }
        }
        if (this.field1519 != null) {
            for (int var7 = 0; var7 < this.field1519.length; var7++) {
                var5.method855(this.field1519[var7], this.field1504[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "(I)V")
    public static final void method504(int arg0) {
        field1518++;
        if (class4.field68 > 0) {
            class91.method725(-10015);
            return;
        }
        class54.method426(0, 40);
        class80.field1841 = class143.field3275;
        class143.field3275 = null;
        if (arg0 > -97) {
            field1507 = null;
        }
    }
}
