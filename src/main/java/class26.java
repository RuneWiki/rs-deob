import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class class26 extends class62 {

    @OriginalMember(owner = "client!ea", name = "bb", descriptor = "I")
    public int field563 = 1000;

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "Llc;")
    public static class69 field560 = class69.method470((byte) -121, "glow1:");

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "I")
    public static int field559 = 0;

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "Leb;")
    public static class27 field557 = new class27(5000);

    @OriginalMember(owner = "client!ea", name = "cb", descriptor = "Llc;")
    public static class69 field564 = class69.method470((byte) -121, "From:  ");

    @OriginalMember(owner = "client!ea", name = "db", descriptor = "I")
    public static int field565 = 0;

    @OriginalMember(owner = "client!ea", name = "fb", descriptor = "Llc;")
    public static class69 field567 = class69.method470((byte) -99, "_");

    @OriginalMember(owner = "client!ea", name = "eb", descriptor = "I")
    public static int field566 = 0;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!ea", name = "ab", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(Z)V")
    public static void method170(boolean arg0) {
        field564 = null;
        field557 = null;
        if (arg0) {
            field566 = -44;
        }
        field567 = null;
        field560 = null;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(Z)Lhb;")
    public class44 method144(boolean arg0) {
        field562++;
        if (!arg0) {
            field564 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIII)V")
    public void method171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field561++;
        class44 var10 = this.method144(true);
        if (var10 != null) {
            this.field563 = var10.field563;
            var10.method171(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLwd;[Lvb;)V")
    public static final void method172(byte arg0, class129 arg1, class122[] arg2) {
        if (arg0 != -122) {
            method170(true);
        }
        field556++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class43.field856[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class43.field856[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method908((byte) 27, var110, var111);
                        }
                    }
                }
            }
        }
        class25.field518 += (int) (Math.random() * 5.0D) - 2;
        class70.field1553 += (int) (Math.random() * 5.0D) - 2;
        if (class70.field1553 < -8) {
            class70.field1553 = -8;
        }
        if (class25.field518 < -16) {
            class25.field518 = -16;
        }
        if (class70.field1553 > 8) {
            class70.field1553 = 8;
        }
        if (class25.field518 > 16) {
            class25.field518 = 16;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class91.field1987[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class22.field451[var4][var101 + 1][var50] - class22.field451[var4][var101 - 1][var50];
                    int var103 = class22.field451[var4][var101][var50 + 1] - class22.field451[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = (var103 << 8) / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = 65536 / var104;
                    int var108 = (var47[var101][var50 + 1] >> 3) + (var47[var101 + 1][var50] >> 3) + (var47[var101][var50] >> 1) + (var47[var101 + -1][var50] >> 2) + (var47[var101][var50 + -1] >> 2);
                    int var109 = (var107 * -10 + var105 * -50 + var106 * -50) / var49 + 96;
                    class49.field1003[var101][var50] = var109 - var108;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class125.field2708[var51] = 0;
                class24.field493[var51] = 0;
                class29.field604[var51] = 0;
                class67.field1390[var51] = 0;
                class46.field959[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class62.field1271[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class78 var97 = class78.method553(var96 - 1, (byte) 92);
                            class125.field2708[var55] += var97.field1756;
                            class24.field493[var55] += var97.field1755;
                            class29.field604[var55] += var97.field1767;
                            class67.field1390[var55] += var97.field1765;
                            var10002 = class46.field959[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class62.field1271[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class78 var100 = class78.method553(var99 - 1, (byte) 92);
                            class125.field2708[var55] -= var100.field1756;
                            class24.field493[var55] -= var100.field1755;
                            class29.field604[var55] -= var100.field1767;
                            class67.field1390[var55] -= var100.field1765;
                            var10002 = class46.field959[var55]--;
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
                            var57 += class125.field2708[var62];
                            var58 += class29.field604[var62];
                            var60 += class46.field959[var62];
                            var56 += class24.field493[var62];
                            var59 += class67.field1390[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var58 -= class29.field604[var63];
                            var56 -= class24.field493[var63];
                            var60 -= class46.field959[var63];
                            var57 -= class125.field2708[var63];
                            var59 -= class67.field1390[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class13.field264 || (class43.field856[0][var52][var61] & 0x2) != 0 || (class43.field856[var4][var52][var61] & 0x10) == 0 && class106.method788(var61, arg0 ^ 0xFFFFF347, var4, var52) == class103.field2228)) {
                            if (class90.field1971 > var4) {
                                class90.field1971 = var4;
                            }
                            int var64 = class62.field1271[var4][var52][var61] & 0xFF;
                            int var65 = class27.field581[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class22.field451[var4][var52][var61];
                                int var67 = class22.field451[var4][var52 + 1][var61];
                                int var68 = class22.field451[var4][var52 + 1][var61 + 1];
                                int var69 = class22.field451[var4][var52][var61 + 1];
                                int var70 = class49.field1003[var52][var61];
                                int var71 = class49.field1003[var52 + 1][var61];
                                int var72 = class49.field1003[var52 + 1][var61 + 1];
                                int var73 = -1;
                                int var74 = -1;
                                int var75 = class49.field1003[var52][var61 + 1];
                                if (var64 > 0) {
                                    int var76 = var57 * 256 / var59;
                                    int var77 = var56 / var60;
                                    int var78 = var58 / var60;
                                    var73 = class25.method169(-127, var76, var78, var77);
                                    int var79 = class70.field1553 + var76 & 0xFF;
                                    int var80 = class25.field518 + var78;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 255) {
                                        var80 = 255;
                                    }
                                    var74 = class25.method169(-127, var79, var80, var77);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class76.field1711[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class50.method331(var65 - 1, 4).field756) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var66 == var68 && var66 == var69) {
                                        class90.field1958[var4][var52][var61] = class107.method795(class90.field1958[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var74 != -1) {
                                    var82 = class117.field2524[class83.method602(96, 2, var74)];
                                }
                                if (var65 == 0) {
                                    arg1.method963(var4, var52, var61, 0, 0, -1, var66, var67, var68, var69, class83.method602(var70, arg0 + 124, var73), class83.method602(var71, arg0 + 124, var73), class83.method602(var72, 2, var73), class83.method602(var75, 2, var73), 0, 0, 0, 0, var82, 0);
                                } else {
                                    byte var83 = class114.field2473[var4][var52][var61];
                                    int var84 = class76.field1711[var4][var52][var61] + 1;
                                    class39 var85 = class50.method331(var65 - 1, 4);
                                    int var86 = var85.field768;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var88 = class117.field2525.method38(1625, var86);
                                        var87 = -1;
                                    } else if (var85.field760 == 16711935) {
                                        var87 = -2;
                                        var86 = -1;
                                        var88 = -2;
                                    } else {
                                        var87 = class25.method169(-127, var85.field767, var85.field763, var85.field766);
                                        int var89 = class70.field1553 + var85.field767 & 0xFF;
                                        int var90 = class25.field518 + var85.field763;
                                        if (var90 < 0) {
                                            var90 = 0;
                                        } else if (var90 > 255) {
                                            var90 = 255;
                                        }
                                        var88 = class25.method169(-126, var89, var90, var85.field766);
                                    }
                                    int var91 = 0;
                                    if (var88 != -2) {
                                        var91 = class117.field2524[class43.method251(-1, var88, 96)];
                                    }
                                    if (var85.field751 != -1) {
                                        int var92 = class25.field518 + var85.field759;
                                        int var93 = class70.field1553 + var85.field765 & 0xFF;
                                        if (var92 < 0) {
                                            var92 = 0;
                                        } else if (var92 > 255) {
                                            var92 = 255;
                                        }
                                        int var94 = class25.method169(-128, var93, var92, var85.field762);
                                        var91 = class117.field2524[class43.method251(-1, var94, 96)];
                                    }
                                    arg1.method963(var4, var52, var61, var84, var83, var86, var66, var67, var68, var69, class83.method602(var70, arg0 + 124, var73), class83.method602(var71, arg0 ^ 0xFFFFFF84, var73), class83.method602(var72, arg0 ^ 0xFFFFFF84, var73), class83.method602(var75, 2, var73), class43.method251(-1, var87, var70), class43.method251(-1, var87, var71), class43.method251(-1, var87, var72), class43.method251(-1, var87, var75), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg1.method984(var4, var54, var53, class106.method788(var53, 3265, var4, var54));
                }
            }
            class62.field1271[var4] = null;
            class27.field581[var4] = null;
            class76.field1711[var4] = null;
            class114.field2473[var4] = null;
            class91.field1987[var4] = null;
        }
        arg1.method978(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class43.field856[1][var5][var46] & 0x2) == 2) {
                    arg1.method950(var5, var46);
                }
            }
        }
        int var6 = 1;
        int var7 = 2;
        int var8 = 4;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var6 <<= 0x3;
                var7 <<= 0x3;
                var8 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((var6 & class90.field1958[var10][var12][var11]) != 0) {
                            int var13 = var11;
                            int var14;
                            for (var14 = var11; var14 > 0 && (class90.field1958[var10][var12][var14 - 1] & var6) != 0; var14--) {
                            }
                            while (var13 < 104 && (var6 & class90.field1958[var10][var12][var13 + 1]) != 0) {
                                var13++;
                            }
                            int var15 = var10;
                            int var16 = var10;
                            label354: while (var15 > 0) {
                                for (int var17 = var14; var17 <= var13; var17++) {
                                    if ((var6 & class90.field1958[var15 - 1][var12][var17]) == 0) {
                                        break label354;
                                    }
                                }
                                var15--;
                            }
                            label343: while (var9 > var16) {
                                for (int var18 = var14; var18 <= var13; var18++) {
                                    if ((var6 & class90.field1958[var16 + 1][var12][var18]) == 0) {
                                        break label343;
                                    }
                                }
                                var16++;
                            }
                            int var19 = (var13 + 1 - var14) * (var16 + 1 - var15);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class22.field451[var16][var12][var14] - var20;
                                int var22 = class22.field451[var15][var12][var14];
                                class129.method951(var9, 1, var12 * 128, var12 * 128, var14 * 128, var13 * 128 + 128, var21, var22);
                                for (int var23 = var15; var23 <= var16; var23++) {
                                    for (int var24 = var14; var24 <= var13; var24++) {
                                        class90.field1958[var23][var12][var24] = class23.method151(class90.field1958[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((class90.field1958[var10][var12][var11] & var7) != 0) {
                            int var25 = var12;
                            int var26 = var10;
                            int var27 = var12;
                            int var28 = var10;
                            while (var27 < 104 && (class90.field1958[var10][var27 + 1][var11] & var7) != 0) {
                                var27++;
                            }
                            while (var25 > 0 && (class90.field1958[var10][var25 - 1][var11] & var7) != 0) {
                                var25--;
                            }
                            label408: while (var26 > 0) {
                                for (int var29 = var25; var29 <= var27; var29++) {
                                    if ((class90.field1958[var26 - 1][var29][var11] & var7) == 0) {
                                        break label408;
                                    }
                                }
                                var26--;
                            }
                            label397: while (var28 < var9) {
                                for (int var30 = var25; var30 <= var27; var30++) {
                                    if ((var7 & class90.field1958[var28 + 1][var30][var11]) == 0) {
                                        break label397;
                                    }
                                }
                                var28++;
                            }
                            int var31 = (var27 + 1 - var25) * (var28 + 1 - var26);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class22.field451[var28][var25][var11] - var32;
                                int var34 = class22.field451[var26][var25][var11];
                                class129.method951(var9, 2, var25 * 128, var27 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var26; var35 <= var28; var35++) {
                                    for (int var36 = var25; var36 <= var27; var36++) {
                                        class90.field1958[var35][var36][var11] = class23.method151(class90.field1958[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((var8 & class90.field1958[var10][var12][var11]) != 0) {
                            int var37 = var12;
                            int var38 = var11;
                            int var39 = var12;
                            while (var38 > 0 && (class90.field1958[var10][var12][var38 - 1] & var8) != 0) {
                                var38--;
                            }
                            int var40;
                            for (var40 = var11; var40 < 104 && (var8 & class90.field1958[var10][var12][var40 + 1]) != 0; var40++) {
                            }
                            label461: while (var37 > 0) {
                                for (int var41 = var38; var41 <= var40; var41++) {
                                    if ((class90.field1958[var10][var37 - 1][var41] & var8) == 0) {
                                        break label461;
                                    }
                                }
                                var37--;
                            }
                            label450: while (var39 < 104) {
                                for (int var42 = var38; var42 <= var40; var42++) {
                                    if ((var8 & class90.field1958[var10][var39 + 1][var42]) == 0) {
                                        break label450;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var37) * (var40 + 1 + -var38) >= 4) {
                                int var43 = class22.field451[var10][var37][var38];
                                class129.method951(var9, 4, var37 * 128, var39 * 128 + 128, var38 * 128, var40 * 128 + 128, var43, var43);
                                for (int var44 = var37; var44 <= var39; var44++) {
                                    for (int var45 = var38; var45 <= var40; var45++) {
                                        class90.field1958[var10][var44][var45] = class23.method151(class90.field1958[var10][var44][var45], ~var8);
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
