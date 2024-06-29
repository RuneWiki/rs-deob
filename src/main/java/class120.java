import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class class120 {

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lrf;")
    public static class163 field2528 = class53.method392(-105, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "[[I")
    public static int[][] field2526 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "Lrf;")
    public static class163 field2525 = class53.method392(95, "Die Verbindung konnte");

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "[I")
    public static int[] field2530 = new int[32];

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Lrf;")
    public static class163 field2527 = class53.method392(104, " <col=ffffff>");

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Lrf;")
    public static class163 field2523 = class53.method392(41, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2524 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "Lrf;")
    private static class163 field2532 = class53.method392(103, "Type");

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "Lrf;")
    public static class163 field2531 = field2532;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I[B)V")
    public abstract void method816(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static final void method817(int arg0) {
        field2529++;
        if (class105.field2185 == 83) {
            int var1 = class105.field2195.method344(255);
            int var2 = class170.field3457 + (var1 >> 4 & 0x7);
            int var3 = class107.field2219 + (var1 & 0x7);
            int var4 = var2 + class105.field2195.method353(12);
            int var5 = var3 + class105.field2195.method353(arg0 - 77);
            int var6 = class105.field2195.method389(arg0 ^ 0x160);
            int var7 = class105.field2195.method390((byte) 100);
            int var8 = class105.field2195.method344(255) * 4;
            int var9 = class105.field2195.method344(255) * 4;
            int var10 = class105.field2195.method390((byte) 99);
            int var11 = class105.field2195.method390((byte) 92);
            int var12 = class105.field2195.method344(255);
            int var13 = class105.field2195.method344(255);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104 && var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var7 != 65535) {
                int var14 = var4 * 128 + 64;
                int var15 = var5 * 128 + 64;
                int var16 = var2 * 128 + 64;
                int var17 = var3 * 128 + 64;
                class168 var18 = new class168(var7, class60.field1227, var16, var17, class175.method1186(var16, class60.field1227, var17, arg0) - var8, var10 - -class51.field1023, class51.field1023 + var11, var12, var13, var6, var9);
                var18.method1139(arg0 ^ 0xFFFFFF8B, class175.method1186(var14, class60.field1227, var15, 1) - var9, var15, class51.field1023 + var10, var14);
                class158.field3228.method51(arg0 ^ 0x1, var18);
            }
        } else if (class105.field2185 == 53) {
            int var19 = class105.field2195.method378(false);
            int var20 = (var19 >> 4 & 0x7) + class170.field3457;
            int var21 = class107.field2219 + (var19 & 0x7);
            int var22 = class105.field2195.method378(false);
            int var23 = var22 & 0x3;
            int var24 = var22 >> 2;
            int var25 = class146.field2992[var24];
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                class38.method243((byte) 114, var24, 0, var23, -1, -1, var21, class60.field1227, var20, var25);
            }
        } else if (class105.field2185 == 27) {
            int var26 = class105.field2195.method390((byte) 124);
            int var27 = class105.field2195.method350(false);
            int var28 = (var27 >> 4 & 0x7) + class170.field3457;
            int var29 = class107.field2219 + (var27 & 0x7);
            int var30 = class105.field2195.method390((byte) 124);
            int var31 = class105.field2195.method349((byte) 93);
            if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104 && class200.field3962 != var26) {
                class148 var32 = new class148();
                var32.field3057 = var31;
                var32.field3054 = var30;
                if (class69.field1434[class60.field1227][var28][var29] == null) {
                    class69.field1434[class60.field1227][var28][var29] = new class5();
                }
                class69.field1434[class60.field1227][var28][var29].method51(0, var32);
                class88.method616((byte) -17, var29, var28);
            }
        } else if (class105.field2185 == 109) {
            int var33 = class105.field2195.method349((byte) 93);
            int var34 = class105.field2195.method378(false);
            int var35 = (var34 >> 4 & 0x7) + class170.field3457;
            int var36 = class107.field2219 + (var34 & 0x7);
            if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                class5 var37 = class69.field1434[class60.field1227][var35][var36];
                if (var37 != null) {
                    for (class148 var38 = (class148) var37.method46(-123); var38 != null; var38 = (class148) var37.method53(arg0 + 7759443)) {
                        if ((var33 & 0x7FFF) == var38.field3057) {
                            var38.method630(arg0 + 7);
                            break;
                        }
                    }
                    if (var37.method46(arg0 - 121) == null) {
                        class69.field1434[class60.field1227][var35][var36] = null;
                    }
                    class88.method616((byte) -17, var36, var35);
                }
            }
        } else if (class105.field2185 == 107) {
            int var39 = class105.field2195.method338((byte) 102);
            int var40 = (var39 & 0x7) + class107.field2219;
            int var41 = class170.field3457 + (var39 >> 4 & 0x7);
            int var42 = class105.field2195.method344(255);
            int var43 = var42 >> 2;
            int var44 = var42 & 0x3;
            int var45 = class146.field2992[var43];
            int var46 = class105.field2195.method349((byte) 93);
            if (var41 >= 0 && var40 >= 0 && var41 < 104 && var40 < 104) {
                class38.method243((byte) 107, var43, 0, var44, -1, var46, var40, class60.field1227, var41, var45);
            }
        } else if (class105.field2185 == 248) {
            int var47 = class105.field2195.method349((byte) 93);
            int var48 = class105.field2195.method338((byte) 98);
            int var49 = (var48 >> 4 & 0x7) + class170.field3457;
            int var50 = (var48 & 0x7) + class107.field2219;
            int var51 = class105.field2195.method390((byte) 91);
            if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                class148 var52 = new class148();
                var52.field3054 = var47;
                var52.field3057 = var51;
                if (class69.field1434[class60.field1227][var49][var50] == null) {
                    class69.field1434[class60.field1227][var49][var50] = new class5();
                }
                class69.field1434[class60.field1227][var49][var50].method51(0, var52);
                class88.method616((byte) -17, var50, var49);
            }
        } else if (class105.field2185 == 198) {
            int var53 = class105.field2195.method344(255);
            int var54 = (var53 >> 4 & 0x7) + class170.field3457;
            int var55 = (var53 & 0x7) + class107.field2219;
            int var56 = class105.field2195.method390((byte) 113);
            int var57 = class105.field2195.method390((byte) 97);
            int var58 = class105.field2195.method390((byte) 117);
            if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                class5 var59 = class69.field1434[class60.field1227][var54][var55];
                if (var59 != null) {
                    for (class148 var60 = (class148) var59.method46(5); var60 != null; var60 = (class148) var59.method53(7759444)) {
                        if ((var56 & 0x7FFF) == var60.field3057 && var60.field3054 == var57) {
                            var60.field3054 = var58;
                            break;
                        }
                    }
                    class88.method616((byte) -17, var55, var54);
                }
            }
        } else {
            if (class105.field2185 == 212) {
                int var61 = class105.field2195.method390((byte) 97);
                int var62 = class105.field2195.method390((byte) 120);
                byte var63 = class105.field2195.method381((byte) 35);
                int var64 = class105.field2195.method387((byte) 88);
                int var65 = class105.field2195.method350(false);
                int var66 = var65 & 0x3;
                int var67 = var65 >> 2;
                int var68 = class146.field2992[var67];
                int var69 = class105.field2195.method350(false);
                int var70 = (var69 & 0x7) + class107.field2219;
                int var71 = (var69 >> 4 & 0x7) + class170.field3457;
                byte var72 = class105.field2195.method353(-79);
                int var73 = class105.field2195.method390((byte) 127);
                byte var74 = class105.field2195.method388(false);
                byte var75 = class105.field2195.method381((byte) 35);
                class38 var76;
                if (class200.field3962 == var61) {
                    var76 = class56.field1136;
                } else {
                    var76 = class121.field2553[var61];
                }
                if (var76 != null) {
                    class61 var77 = class199.method1314((byte) 127, var73);
                    int var78;
                    int var79;
                    if (var66 == 1 || var66 == 3) {
                        var78 = var77.field1250;
                        var79 = var77.field1257;
                    } else {
                        var78 = var77.field1257;
                        var79 = var77.field1250;
                    }
                    int var80 = (var79 + 1 >> 1) + var70;
                    int var81 = (var78 >> 1) + var71;
                    int var82 = (var78 + 1 >> 1) + var71;
                    int var83 = (var79 >> 1) + var70;
                    int var84 = (var71 << 7) + (var78 << 6);
                    int[][] var85 = class154.field3199[class60.field1227];
                    int var86 = (var70 << 7) + (var79 << 6);
                    int var87 = var85[var81][var83] + var85[var82][var83] + var85[var81][var80] + var85[var82][var80] >> 2;
                    class91 var88 = var77.method437(var84, var67, var87, -23866, var85, var86, var66);
                    if (var88 != null) {
                        class38.method243((byte) 112, 0, var62 + 1, 0, var64 + 1, -1, var70, class60.field1227, var71, var68);
                        var76.field782 = var88;
                        var76.field762 = class51.field1023 + var62;
                        var76.field790 = class51.field1023 + var64;
                        var76.field772 = var70 * 128 + var79 * 64;
                        if (var72 > var63) {
                            byte var89 = var72;
                            var72 = var63;
                            var63 = var89;
                        }
                        var76.field759 = var71 + var72;
                        if (var75 > var74) {
                            byte var90 = var75;
                            var75 = var74;
                            var74 = var90;
                        }
                        var76.field768 = var70 + var74;
                        var76.field776 = var71 * 128 + var78 * 64;
                        var76.field760 = var87;
                        var76.field755 = var70 + var75;
                        var76.field787 = var63 + var71;
                    }
                }
            }
            if (class105.field2185 == 179) {
                int var91 = class105.field2195.method344(arg0 ^ 0xFE);
                int var92 = (var91 >> 4 & 0x7) + class170.field3457;
                int var93 = class107.field2219 + (var91 & 0x7);
                int var94 = class105.field2195.method390((byte) 116);
                int var95 = class105.field2195.method344(255);
                int var96 = class105.field2195.method390((byte) 111);
                if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104) {
                    int var97 = var93 * 128 + 64;
                    int var98 = var92 * 128 + 64;
                    class77 var99 = new class77(var94, class60.field1227, var98, var97, class175.method1186(var98, class60.field1227, var97, 1) - var95, var96, class51.field1023);
                    class79.field1602.method51(0, var99);
                }
            } else {
                if (arg0 != 1) {
                    field2521 = 112;
                }
                if (class105.field2185 == 121) {
                    int var100 = class105.field2195.method344(arg0 + 254);
                    int var101 = (var100 >> 4 & 0x7) + class170.field3457;
                    int var102 = (var100 & 0x7) + class107.field2219;
                    int var103 = class105.field2195.method390((byte) 113);
                    if (var103 == 65535) {
                        var103 = -1;
                    }
                    int var104 = class105.field2195.method344(255);
                    int var105 = var104 >> 4 & 0xF;
                    int var106 = var104 & 0x7;
                    int var107 = class105.field2195.method344(255);
                    if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
                        int var108 = var105 + 1;
                        if (class56.field1136.field692[0] >= var101 - var108 && class56.field1136.field692[0] <= var101 + var108 && class56.field1136.field718[0] >= var102 - var108 && class56.field1136.field718[0] <= var102 + var108 && class151.field3113 != 0 && var106 > 0 && class95.field2033 < 50 && var103 != -1) {
                            class16.field274[class95.field2033] = var103;
                            client.field599[class95.field2033] = var106;
                            class188.field3746[class95.field2033] = var107;
                            class13.field247[class95.field2033] = null;
                            class202.field3988[class95.field2033] = (var101 << 16) + (var102 << 8) + var105;
                            class95.field2033++;
                        }
                    }
                }
                if (class105.field2185 == 127) {
                    int var109 = class105.field2195.method350(false);
                    int var110 = var109 >> 2;
                    int var111 = var109 & 0x3;
                    int var112 = class146.field2992[var110];
                    int var113 = class105.field2195.method390((byte) 109);
                    int var114 = class105.field2195.method350(false);
                    int var115 = class170.field3457 + (var114 >> 4 & 0x7);
                    int var116 = (var114 & 0x7) + class107.field2219;
                    if (var115 >= 0 && var116 >= 0 && var115 < 103 && var116 < 103) {
                        if (var112 == 0) {
                            class72 var117 = class189.method1272(class60.field1227, var115, var116);
                            if (var117 != null) {
                                int var118 = (int) (var117.field1520 >>> 32) & Integer.MAX_VALUE;
                                if (var110 == 2) {
                                    var117.field1502 = new class56(var118, 2, var111 + 4, class60.field1227, var115, var116, var113, false, var117.field1502);
                                    var117.field1504 = new class56(var118, 2, var111 + 1 & 0x3, class60.field1227, var115, var116, var113, false, var117.field1504);
                                } else {
                                    var117.field1502 = new class56(var118, var110, var111, class60.field1227, var115, var116, var113, false, var117.field1502);
                                }
                            }
                        }
                        if (var112 == 1) {
                            class122 var119 = class37.method238(class60.field1227, var115, var116);
                            if (var119 != null) {
                                int var120 = Integer.MAX_VALUE & (int) (var119.field2573 >>> 32);
                                if (var110 == 4 || var110 == 5) {
                                    var119.field2579 = new class56(var120, 4, var111, class60.field1227, var115, var116, var113, false, var119.field2579);
                                } else if (var110 == 6) {
                                    var119.field2579 = new class56(var120, 4, var111 + 4, class60.field1227, var115, var116, var113, false, var119.field2579);
                                } else if (var110 == 7) {
                                    var119.field2579 = new class56(var120, 4, (var111 + 2 & 0x3) + 4, class60.field1227, var115, var116, var113, false, var119.field2579);
                                } else if (var110 == 8) {
                                    var119.field2579 = new class56(var120, 4, var111 + 4, class60.field1227, var115, var116, var113, false, var119.field2579);
                                    var119.field2570 = new class56(var120, 4, (var111 + 2 & 0x3) + 4, class60.field1227, var115, var116, var113, false, var119.field2570);
                                }
                            }
                        }
                        if (var112 == 2) {
                            if (var110 == 11) {
                                var110 = 10;
                            }
                            class121 var121 = class9.method73(class60.field1227, var115, var116);
                            if (var121 != null) {
                                var121.field2546 = new class56((int) (var121.field2536 >>> 32) & Integer.MAX_VALUE, var110, var111, class60.field1227, var115, var116, var113, false, var121.field2546);
                            }
                        }
                        if (var112 == 3) {
                            class9 var122 = class186.method1262(class60.field1227, var115, var116);
                            if (var122 != null) {
                                var122.field184 = new class56((int) (var122.field192 >>> 32) & Integer.MAX_VALUE, 22, var111, class60.field1227, var115, var116, var113, false, var122.field184);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)[B")
    public abstract byte[] method818(byte arg0);

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
    public static void method819(byte arg0) {
        if (arg0 != -49) {
            method820(-69, false);
        }
        field2526 = null;
        field2524 = null;
        field2525 = null;
        field2527 = null;
        field2523 = null;
        field2532 = null;
        field2530 = null;
        field2528 = null;
        field2531 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZ)V")
    public static final void method820(int arg0, boolean arg1) {
        field2522++;
        if (!class114.method781(arg0, (byte) -124)) {
            return;
        }
        class84[] var2 = class84.field1798[arg0];
        int var3 = 0;
        if (!arg1) {
            method820(95, true);
        }
        while (var2.length > var3) {
            class84 var4 = var2[var3];
            if (var4 != null) {
                var4.field1715 = 0;
                var4.field1785 = 0;
            }
            var3++;
        }
    }
}
