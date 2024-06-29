import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class256 extends class202 {

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    public int field4461 = 0;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "Loh;")
    public static class263 field4463 = class253.method1681(-122, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!of", name = "E", descriptor = "I")
    public static int field4464 = 128;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "Loh;")
    private static class263 field4467 = class253.method1681(-122, "wishes to trade with you)3");

    @OriginalMember(owner = "client!of", name = "w", descriptor = "Loh;")
    public static class263 field4457 = field4467;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!of", name = "I", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V")
    public static void method1695(byte arg0) {
        if (arg0 == -60) {
            field4467 = null;
            field4463 = null;
            field4457 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)I")
    public static final int method1696(int arg0, int arg1, int arg2) {
        if (arg1 <= 73) {
            field4457 = null;
        }
        field4462++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIB)V")
    public static final void method1697(int arg0, int arg1, byte arg2) {
        if (class238.field4164 > 0) {
            class272.method1854(class238.field4164, (byte) 104);
            class238.field4164 = 0;
        }
        field4458++;
        short var3 = 256;
        int var4 = 0;
        int var5 = 0;
        int var6 = class133.field2442 * arg1;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var9 = (var3 - var7) * class142.field2600[var7] / var3;
            if (var9 < 0) {
                var9 = 0;
            }
            var4 += var9;
            for (int var10 = var9; var10 < 128; var10++) {
                int var12 = class133.field2445[var6++ + arg0];
                int var13 = class159.field2886[var4++];
                if (var13 == 0) {
                    class5.field87.field2571[var5++] = var12;
                } else {
                    int var14 = var13 + 18;
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    int var15 = 256 - var13 - 18;
                    int var16 = class190.field3418[var13];
                    if (var15 > 255) {
                        var15 = 255;
                    }
                    class5.field87.field2571[var5++] = class263.method1777(var14 * class263.method1777(16711935, var16) + class263.method1777(16711935, var12) * var15, -16711936) + class263.method1777(var14 * class263.method1777(65280, var16) + class263.method1777(65280, var12) * var15, 16711680) >> 8;
                }
            }
            for (int var11 = 0; var11 < var9; var11++) {
                class5.field87.field2571[var5++] = class133.field2445[var6++ + arg0];
            }
            var6 += class133.field2442 - 128;
        }
        int var8 = -21 / ((-arg2 - 34) / 60);
        class5.field87.method934(arg0, arg1);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I[Lpg;Z)V")
    public static final void method1698(int arg0, class73[] arg1, boolean arg2) {
        field4466++;
        byte var3;
        if (arg2) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg2) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class77.field1576[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class77.field1576[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg1[var7].method488(var5, var6, arg0 ^ 0x72ED);
                            }
                        }
                    }
                }
            }
            class141.field2588 += (int) (Math.random() * 5.0D) - 2;
            if (class141.field2588 < -16) {
                class141.field2588 = -16;
            }
            if (class141.field2588 > 16) {
                class141.field2588 = 16;
            }
            class138.field2556 += (int) (Math.random() * 5.0D) - 2;
            if (class138.field2556 < -8) {
                class138.field2556 = -8;
            }
            if (class138.field2556 > 8) {
                class138.field2556 = 8;
            }
        }
        int var8 = class138.field2556 >> 2 << 10;
        int var9 = class141.field2588 >> 1;
        if (arg0 != 128) {
            field4463 = null;
        }
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var51 = class232.field4052[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    int var101 = class112.field2102[var12][var100 + 1][var54] - class112.field2102[var12][var100 - 1][var54];
                    byte var102 = 74;
                    int var103 = class112.field2102[var12][var100][var54 + 1] - class112.field2102[var12][var100][var54 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + (var101 * var101 + 65536)));
                    int var105 = (var101 << 8) / var104;
                    int var106 = -65536 / var104;
                    int var107 = (var51[var100 - 1][var54] >> 2) + (var51[var100][var54] >> 1) + (var51[var100][var54 - -1] >> 3) + (var51[var100][var54 - 1] >> 2) + (var51[var100 - -1][var54] >> 3);
                    int var108 = (var103 << 8) / var104;
                    int var109 = (var106 * -10 + (var105 * -50 + (var108 * -50))) / var53 + var102;
                    var10[var100][var54] = var109 - var107;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class232.field4062[var55] = 0;
                class35.field821[var55] = 0;
                class255.field4448[var55] = 0;
                class181.field3291[var55] = 0;
                class86.field1727[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class103.field1967[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class19 var96 = class47.method297(var95 - 1, 21758);
                            class232.field4062[var85] += var96.field435;
                            class35.field821[var85] += var96.field434;
                            class255.field4448[var85] += var96.field425;
                            class181.field3291[var85] += var96.field427;
                            var10002 = class86.field1727[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class103.field1967[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class19 var99 = class47.method297(var98 - 1, arg0 ^ 0x547E);
                            class232.field4062[var85] -= var99.field435;
                            class35.field821[var85] -= var99.field434;
                            class255.field4448[var85] -= var99.field425;
                            class181.field3291[var85] -= var99.field427;
                            var10002 = class86.field1727[var85]--;
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
                        int var92 = var91 - 5;
                        int var93 = var91 + 5;
                        if (var93 < 104) {
                            var89 += class86.field1727[var93];
                            var90 += class255.field4448[var93];
                            var86 += class35.field821[var93];
                            var87 += class232.field4062[var93];
                            var88 += class181.field3291[var93];
                        }
                        if (var92 >= 0) {
                            var88 -= class181.field3291[var92];
                            var86 -= class35.field821[var92];
                            var90 -= class255.field4448[var92];
                            var89 -= class86.field1727[var92];
                            var87 -= class232.field4062[var92];
                        }
                        if (var91 >= 0 && var89 > 0) {
                            var11[var56][var91] = class151.method994(var90 / var89, false, var86 / var89, var87 * 256 / var88);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg2 || class77.method526(-26670) || (class77.field1576[0][var57][var58] & 0x2) != 0 || (class77.field1576[var12][var57][var58] & 0x10) == 0 && class54.method348(var58, 3282, var57, var12) == class171.field3128) {
                        if (class51.field1100 > var12) {
                            class51.field1100 = var12;
                        }
                        int var59 = class103.field1967[var12][var57][var58] & 0xFF;
                        int var60 = class75.field1543[var12][var57][var58] & 0xFF;
                        if (var59 > 0 || var60 > 0) {
                            int var61 = class112.field2102[var12][var57][var58];
                            int var62 = class112.field2102[var12][var57 + 1][var58];
                            int var63 = class112.field2102[var12][var57 + 1][var58 + 1];
                            int var64 = class112.field2102[var12][var57][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var59 == 0 && class86.field1730[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var60 > 0 && !class22.method165(4, var60 - 1).field3968) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var62 && var61 == var63 && var61 == var64) {
                                    client.field2763[var12][var57][var58] = class160.method1052(client.field2763[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var69;
                            if (var59 > 0) {
                                var66 = var11[var57][var58];
                                int var67 = (var66 & 0x7F) + var9;
                                if (var67 < 0) {
                                    var67 = 0;
                                } else if (var67 > 127) {
                                    var67 = 127;
                                }
                                int var68 = (var8 + var66 & 0xFC00) + (var66 & 0x380) + var67;
                                var69 = class270.field4767[class4.method24(var68, (byte) 57, 96)];
                            } else {
                                var69 = 0;
                                var66 = -1;
                            }
                            int var70 = var10[var57][var58];
                            int var71 = var10[var57 + 1][var58];
                            int var72 = var10[var57 + 1][var58 + 1];
                            int var73 = var10[var57][var58 + 1];
                            if (var60 == 0) {
                                class191.method1257(var12, var57, var58, 0, 0, -1, var61, var62, var63, var64, class4.method24(var66, (byte) 105, var70), class4.method24(var66, (byte) 114, var71), class4.method24(var66, (byte) 86, var72), class4.method24(var66, (byte) 95, var73), 0, 0, 0, 0, var69, 0);
                            } else {
                                byte var74 = class275.field4821[var12][var57][var58];
                                int var75 = class86.field1730[var12][var57][var58] + 1;
                                class225 var76 = class22.method165(arg0 ^ 0x84, var60 - 1);
                                int var77 = var76.field3966;
                                if (var77 >= 0 && !class270.field4764.method52(var77, 0)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var79;
                                if (var77 >= 0) {
                                    var78 = class270.field4767[method1696(96, 78, class270.field4764.method60(arg0 + 65407, var77))];
                                    var79 = -1;
                                } else if (var76.field3974 == -1) {
                                    var79 = -2;
                                    var78 = 0;
                                } else {
                                    var79 = var76.field3974;
                                    int var80 = (var79 & 0x7F) + var9;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 127) {
                                        var80 = 127;
                                    }
                                    int var81 = (var8 + var79 & 0xFC00) + (var79 & 0x380) + var80;
                                    var78 = class270.field4767[method1696(96, 116, var81)];
                                }
                                if (var76.field3977 >= 0) {
                                    int var82 = var76.field3977;
                                    int var83 = (var82 & 0x7F) + var9;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var8 + var82 & 0xFC00) + (var82 & 0x380) + var83;
                                    var78 = class270.field4767[method1696(96, arg0 - 32, var84)];
                                }
                                class191.method1257(var12, var57, var58, var75, var74, var77, var61, var62, var63, var64, class4.method24(var66, (byte) 50, var70), class4.method24(var66, (byte) 71, var71), class4.method24(var66, (byte) 42, var72), class4.method24(var66, (byte) 111, var73), method1696(var70, 98, var79), method1696(var71, arg0 ^ 0xD2, var79), method1696(var72, arg0 ^ 0xEA, var79), method1696(var73, arg0 ^ 0xEE, var79), var69, var78);
                            }
                        }
                    }
                }
            }
            class103.field1967[var12] = null;
            class75.field1543[var12] = null;
            class86.field1730[var12] = null;
            class275.field4821[var12] = null;
            class232.field4052[var12] = null;
        }
        class77.method527(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class77.field1576[1][var13][var50] & 0x2) == 2) {
                    class253.method1685(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((client.field2763[var14][var16][var15] & 0x1) != 0) {
                        int var17;
                        for (var17 = var15; var17 > 0 && (client.field2763[var14][var16][var17 - 1] & 0x1) != 0; var17--) {
                        }
                        int var18;
                        for (var18 = var15; var18 < 104 && (client.field2763[var14][var16][var18 + 1] & 0x1) != 0; var18++) {
                        }
                        int var19;
                        label355: for (var19 = var14; var19 > 0; var19--) {
                            for (int var20 = var17; var20 <= var18; var20++) {
                                if ((client.field2763[var19 - 1][var16][var20] & 0x1) == 0) {
                                    break label355;
                                }
                            }
                        }
                        int var21;
                        label343: for (var21 = var14; var21 < 3; var21++) {
                            for (int var22 = var17; var22 <= var18; var22++) {
                                if ((client.field2763[var21 + 1][var16][var22] & 0x1) == 0) {
                                    break label343;
                                }
                            }
                        }
                        int var23 = (var21 + 1 - var19) * (var18 + 1 - var17);
                        if (var23 >= 8) {
                            short var24 = 240;
                            int var25 = class112.field2102[var21][var16][var17] - var24;
                            int var26 = class112.field2102[var19][var16][var17];
                            class151.method995(1, var16 * 128, var16 * 128, var17 * 128, var18 * 128 + 128, var25, var26);
                            for (int var27 = var19; var27 <= var21; var27++) {
                                for (int var28 = var17; var28 <= var18; var28++) {
                                    client.field2763[var27][var16][var28] = class263.method1777(client.field2763[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((client.field2763[var14][var16][var15] & 0x2) != 0) {
                        int var29;
                        for (var29 = var16; var29 > 0 && (client.field2763[var14][var29 - 1][var15] & 0x2) != 0; var29--) {
                        }
                        int var30 = var16;
                        int var31 = var14;
                        while (var30 < 104 && (client.field2763[var14][var30 + 1][var15] & 0x2) != 0) {
                            var30++;
                        }
                        label411: while (var31 > 0) {
                            for (int var32 = var29; var32 <= var30; var32++) {
                                if ((client.field2763[var31 - 1][var32][var15] & 0x2) == 0) {
                                    break label411;
                                }
                            }
                            var31--;
                        }
                        int var33;
                        label399: for (var33 = var14; var33 < 3; var33++) {
                            for (int var34 = var29; var34 <= var30; var34++) {
                                if ((client.field2763[var33 + 1][var34][var15] & 0x2) == 0) {
                                    break label399;
                                }
                            }
                        }
                        int var35 = (var30 + 1 - var29) * (var33 + 1 - var31);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class112.field2102[var33][var29][var15] - var36;
                            int var38 = class112.field2102[var31][var29][var15];
                            class151.method995(2, var29 * 128, var30 * 128 + 128, var15 * 128, var15 * 128, var37, var38);
                            for (int var39 = var31; var39 <= var33; var39++) {
                                for (int var40 = var29; var40 <= var30; var40++) {
                                    client.field2763[var39][var40][var15] = class263.method1777(client.field2763[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((client.field2763[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var15;
                        int var42 = var16;
                        int var43 = var15;
                        while (var41 < 104 && (client.field2763[var14][var16][var41 + 1] & 0x4) != 0) {
                            var41++;
                        }
                        int var44 = var16;
                        while (var43 > 0 && (client.field2763[var14][var16][var43 - 1] & 0x4) != 0) {
                            var43--;
                        }
                        label465: while (var44 > 0) {
                            for (int var45 = var43; var45 <= var41; var45++) {
                                if ((client.field2763[var14][var44 - 1][var45] & 0x4) == 0) {
                                    break label465;
                                }
                            }
                            var44--;
                        }
                        label454: while (var42 < 104) {
                            for (int var46 = var43; var46 <= var41; var46++) {
                                if ((client.field2763[var14][var42 + 1][var46] & 0x4) == 0) {
                                    break label454;
                                }
                            }
                            var42++;
                        }
                        if (((var42 - (var44 - 1)) * (var41 + 1 - var43)) >= 4) {
                            int var47 = class112.field2102[var14][var44][var43];
                            class151.method995(4, var44 * 128, var42 * 128 + 128, var43 * 128, var41 * 128 + 128, var47, var47);
                            for (int var48 = var44; var48 <= var42; var48++) {
                                for (int var49 = var43; var49 <= var41; var49++) {
                                    client.field2763[var14][var48][var49] = class263.method1777(client.field2763[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method1699(Random arg0, int arg1, int arg2) {
        field4459++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class154.method1015((byte) -93, arg2)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            if (arg1 < 107) {
                field4464 = -77;
            }
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class101.method685(arg2, var4, -149566721);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lsi;II)V")
    private final void method1700(class194 arg0, int arg1, int arg2) {
        if (arg1 == 2) {
            this.field4461 = arg0.method1294((byte) 3);
        }
        if (arg2 > -52) {
            method1697(101, -40, (byte) 106);
        }
        field4460++;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(ILsi;)V")
    public final void method1701(int arg0, class194 arg1) {
        while (true) {
            int var3 = arg1.method1301(-8317);
            if (var3 == 0) {
                field4465++;
                if (arg0 > -95) {
                    this.field4461 = 35;
                    return;
                }
                return;
            }
            this.method1700(arg1, var3, -57);
        }
    }
}
