import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class178 {

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "S")
    public static short field2766 = 32767;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2770 = "Loaded update list";

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field2773 = new String[500];

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "[I")
    public static int[] field2775 = new int[2500];

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2776 = "Loaded textures";

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "Lbe;")
    public static class30 field2771;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2765;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "[I")
    public static int[] field2764;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "[I")
    public static int[] field2769;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZ[Lwi;[[[I)V")
    public static final void method1194(int arg0, boolean arg1, class142[] arg2, int[][][] arg3) {
        byte var4;
        if (arg1) {
            var4 = 1;
        } else {
            var4 = 4;
        }
        if (!arg1) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        if ((class128.field1972[var5][var6][var7] & 0x1) == 1) {
                            int var8 = var5;
                            if ((class128.field1972[1][var6][var7] & 0x2) == 2) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method961(var7, var6, (byte) -33);
                            }
                        }
                    }
                }
            }
            class300.field4931 += (int) (Math.random() * 5.0D) - 2;
            if (class300.field4931 < -16) {
                class300.field4931 = -16;
            }
            class67.field982 += (int) (Math.random() * 5.0D) - 2;
            if (class67.field982 < -8) {
                class67.field982 = -8;
            }
            if (class67.field982 > 8) {
                class67.field982 = 8;
            }
            if (class300.field4931 > 16) {
                class300.field4931 = 16;
            }
        }
        if (arg0 != -1) {
            field2767 = -122;
        }
        field2772++;
        int var9 = class67.field982 >> 2 << 10;
        int var10 = class300.field4931 >> 1;
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var4; var13++) {
            byte[][] var52 = class92.field1406[var13];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var53 * 768 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class242.field3842[var13][var101 + 1][var55] - class242.field3842[var13][var101 - 1][var55];
                    byte var103 = 74;
                    int var104 = class242.field3842[var13][var101][var55 + 1] - class242.field3842[var13][var101][var55 - 1];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + (var102 * var102 + 65536)));
                    int var106 = (var102 << 8) / var105;
                    int var107 = -65536 / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var106 * -50 + var107 * -10 + var108 * -50) / var54 + var103;
                    int var110 = (var52[var101 - 1][var55] >> 2) + (var52[var101 + 1][var55] >> 3) + (var52[var101][var55] >> 1) + (var52[var101][var55 - -1] >> 3) + (var52[var101][var55 - 1] >> 2);
                    var12[var101][var55] = var109 - var110;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class144.field2263[var56] = 0;
                field2769[var56] = 0;
                class196.field3121[var56] = 0;
                class78.field1244[var56] = 0;
                class11.field141[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var86 = 0; var86 < 104; var86++) {
                    int var95 = var57 + 5;
                    int var10002;
                    if (var95 < 104) {
                        int var96 = class216.field3442[var13][var95][var86] & 0xFF;
                        if (var96 > 0) {
                            class63 var97 = class183.method1215(var96 - 1, true);
                            class144.field2263[var86] += var97.field939;
                            field2769[var86] += var97.field943;
                            class196.field3121[var86] += var97.field942;
                            class78.field1244[var86] += var97.field937;
                            var10002 = class11.field141[var86]++;
                        }
                    }
                    int var98 = var57 - 5;
                    if (var98 >= 0) {
                        int var99 = class216.field3442[var13][var98][var86] & 0xFF;
                        if (var99 > 0) {
                            class63 var100 = class183.method1215(var99 - 1, true);
                            class144.field2263[var86] -= var100.field939;
                            field2769[var86] -= var100.field943;
                            class196.field3121[var86] -= var100.field942;
                            class78.field1244[var86] -= var100.field937;
                            var10002 = class11.field141[var86]--;
                        }
                    }
                }
                if (var57 >= 0) {
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    for (int var92 = -5; var92 < 104; var92++) {
                        int var93 = var92 + 5;
                        if (var93 < 104) {
                            var88 += class196.field3121[var93];
                            var91 += class11.field141[var93];
                            var87 += class144.field2263[var93];
                            var89 += field2769[var93];
                            var90 += class78.field1244[var93];
                        }
                        int var94 = var92 - 5;
                        if (var94 >= 0) {
                            var88 -= class196.field3121[var94];
                            var87 -= class144.field2263[var94];
                            var89 -= field2769[var94];
                            var90 -= class78.field1244[var94];
                            var91 -= class11.field141[var94];
                        }
                        if (var92 >= 0 && var91 > 0) {
                            var11[var57][var92] = class47.method296((byte) 126, var87 * 256 / var90, var88 / var91, var89 / var91);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var59 = 1; var59 < 103; var59++) {
                    if (arg1 || class165.method1108(arg0 + 1) || (class128.field1972[0][var58][var59] & 0x2) != 0 || (class128.field1972[var13][var58][var59] & 0x10) == 0 && class236.method1637(var58, var59, var13, false) == class102.field1537) {
                        if (var13 < class161.field2538) {
                            class161.field2538 = var13;
                        }
                        int var60 = class216.field3442[var13][var58][var59] & 0xFF;
                        int var61 = class225.field3573[var13][var58][var59] & 0xFF;
                        if (var60 > 0 || var61 > 0) {
                            int var62 = class242.field3842[var13][var58][var59];
                            int var63 = class242.field3842[var13][var58 + 1][var59];
                            int var64 = class242.field3842[var13][var58 + 1][var59 + 1];
                            int var65 = class242.field3842[var13][var58][var59 + 1];
                            if (var13 > 0) {
                                boolean var66 = true;
                                if (var60 == 0 && class22.field282[var13][var58][var59] != 0) {
                                    var66 = false;
                                }
                                if (var61 > 0 && !class195.method1358(var61 - 1, true).field3429) {
                                    var66 = false;
                                }
                                if (var66 && var62 == var63 && var62 == var64 && var62 == var65) {
                                    class202.field3233[var13][var58][var59] = class82.method554(class202.field3233[var13][var58][var59], 4);
                                }
                            }
                            int var67;
                            int var70;
                            if (var60 > 0) {
                                var67 = var11[var58][var59];
                                int var68 = (var67 & 0x7F) + var10;
                                if (var68 < 0) {
                                    var68 = 0;
                                } else if (var68 > 127) {
                                    var68 = 127;
                                }
                                int var69 = (var9 + var67 & 0xFC00) + var68 + (var67 & 0x380);
                                var70 = class172.field2654[class120.method783(96, arg0 ^ 0xFFFFFF80, var69)];
                            } else {
                                var67 = -1;
                                var70 = 0;
                            }
                            int var71 = var12[var58 + 1][var59];
                            int var72 = var12[var58][var59];
                            int var73 = var12[var58][var59 + 1];
                            int var74 = var12[var58 + 1][var59 + 1];
                            if (var61 == 0) {
                                class120.method785(var13, var58, var59, 0, 0, -1, var62, var63, var64, var65, class120.method783(var72, arg0 ^ 0xFFFFFF80, var67), class120.method783(var71, arg0 ^ 0xFFFFFF80, var67), class120.method783(var74, 127, var67), class120.method783(var73, 127, var67), 0, 0, 0, 0, var70, 0);
                            } else {
                                int var75 = class22.field282[var13][var58][var59] + 1;
                                byte var76 = class137.field2118[var13][var58][var59];
                                class215 var77 = class195.method1358(var61 - 1, true);
                                int var78 = var77.field3436;
                                if (var78 >= 0 && !class172.field2670.method1121(0, var78)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var80;
                                if (var78 >= 0) {
                                    var79 = class172.field2654[class52.method311(true, class172.field2670.method1120(var78, arg0 - 113), 96)];
                                    var80 = -1;
                                } else if (var77.field3432 == -1) {
                                    var79 = 0;
                                    var80 = -2;
                                } else {
                                    var80 = var77.field3432;
                                    int var81 = (var80 & 0x7F) + var10;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 127) {
                                        var81 = 127;
                                    }
                                    int var82 = (var9 + var80 & 0xFC00) + (var80 & 0x380) + var81;
                                    var79 = class172.field2654[class52.method311(true, var82, 96)];
                                }
                                if (var77.field3428 >= 0) {
                                    int var83 = var77.field3428;
                                    int var84 = (var83 & 0x7F) + var10;
                                    if (var84 < 0) {
                                        var84 = 0;
                                    } else if (var84 > 127) {
                                        var84 = 127;
                                    }
                                    int var85 = (var9 + var83 & 0xFC00) + (var83 & 0x380) + var84;
                                    var79 = class172.field2654[class52.method311(true, var85, 96)];
                                }
                                class120.method785(var13, var58, var59, var75, var76, var78, var62, var63, var64, var65, class120.method783(var72, 127, var67), class120.method783(var71, 127, var67), class120.method783(var74, 127, var67), class120.method783(var73, arg0 + 128, var67), class52.method311(true, var80, var72), class52.method311(true, var80, var71), class52.method311(true, var80, var74), class52.method311(true, var80, var73), var70, var79);
                            }
                        }
                    }
                }
            }
            class216.field3442[var13] = null;
            class225.field3573[var13] = null;
            class22.field282[var13] = null;
            class137.field2118[var13] = null;
            class92.field1406[var13] = null;
        }
        class82.method559(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var51 = 0; var51 < 104; var51++) {
                if ((class128.field1972[1][var14][var51] & 0x2) == 2) {
                    method1196(var14, var51);
                }
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 <= 104; var16++) {
                for (int var17 = 0; var17 <= 104; var17++) {
                    if ((class202.field3233[var15][var17][var16] & 0x1) != 0) {
                        int var18 = var16;
                        int var19;
                        for (var19 = var16; var19 < 104 && (class202.field3233[var15][var17][var19 + 1] & 0x1) != 0; var19++) {
                        }
                        while (var18 > 0 && (class202.field3233[var15][var17][var18 - 1] & 0x1) != 0) {
                            var18--;
                        }
                        int var20 = var15;
                        int var21 = var15;
                        label352: while (var20 > 0) {
                            for (int var22 = var18; var22 <= var19; var22++) {
                                if ((class202.field3233[var20 - 1][var17][var22] & 0x1) == 0) {
                                    break label352;
                                }
                            }
                            var20--;
                        }
                        label341: while (var21 < 3) {
                            for (int var23 = var18; var23 <= var19; var23++) {
                                if ((class202.field3233[var21 + 1][var17][var23] & 0x1) == 0) {
                                    break label341;
                                }
                            }
                            var21++;
                        }
                        int var24 = (var21 - (var20 - 1)) * (var19 + 1 - var18);
                        if (var24 >= 8) {
                            short var25 = 240;
                            int var26 = class242.field3842[var21][var17][var18] - var25;
                            int var27 = class242.field3842[var20][var17][var18];
                            class67.method423(1, var17 * 128, var17 * 128, var18 * 128, var19 * 128 + 128, var26, var27);
                            for (int var28 = var20; var28 <= var21; var28++) {
                                for (int var29 = var18; var29 <= var19; var29++) {
                                    class202.field3233[var28][var17][var29] = class10.method53(class202.field3233[var28][var17][var29], -2);
                                }
                            }
                        }
                    }
                    if ((class202.field3233[var15][var17][var16] & 0x2) != 0) {
                        int var30;
                        for (var30 = var17; var30 > 0 && (class202.field3233[var15][var30 - 1][var16] & 0x2) != 0; var30--) {
                        }
                        int var31 = var15;
                        int var32;
                        for (var32 = var17; var32 < 104 && (class202.field3233[var15][var32 + 1][var16] & 0x2) != 0; var32++) {
                        }
                        int var33 = var15;
                        label406: while (var31 > 0) {
                            for (int var34 = var30; var34 <= var32; var34++) {
                                if ((class202.field3233[var31 - 1][var34][var16] & 0x2) == 0) {
                                    break label406;
                                }
                            }
                            var31--;
                        }
                        label395: while (var33 < 3) {
                            for (int var35 = var30; var35 <= var32; var35++) {
                                if ((class202.field3233[var33 + 1][var35][var16] & 0x2) == 0) {
                                    break label395;
                                }
                            }
                            var33++;
                        }
                        int var36 = (var33 + 1 - var31) * (var32 + 1 - var30);
                        if (var36 >= 8) {
                            short var37 = 240;
                            int var38 = class242.field3842[var33][var30][var16] - var37;
                            int var39 = class242.field3842[var31][var30][var16];
                            class67.method423(2, var30 * 128, var32 * 128 + 128, var16 * 128, var16 * 128, var38, var39);
                            for (int var40 = var31; var40 <= var33; var40++) {
                                for (int var41 = var30; var41 <= var32; var41++) {
                                    class202.field3233[var40][var41][var16] = class10.method53(class202.field3233[var40][var41][var16], -3);
                                }
                            }
                        }
                    }
                    if ((class202.field3233[var15][var17][var16] & 0x4) != 0) {
                        int var42 = var17;
                        int var43 = var16;
                        int var44;
                        for (var44 = var16; var44 < 104 && (class202.field3233[var15][var17][var44 + 1] & 0x4) != 0; var44++) {
                        }
                        while (var43 > 0 && (class202.field3233[var15][var17][var43 - 1] & 0x4) != 0) {
                            var43--;
                        }
                        label462: while (var42 > 0) {
                            for (int var45 = var43; var45 <= var44; var45++) {
                                if ((class202.field3233[var15][var42 - 1][var45] & 0x4) == 0) {
                                    break label462;
                                }
                            }
                            var42--;
                        }
                        int var46;
                        label450: for (var46 = var17; var46 < 104; var46++) {
                            for (int var47 = var43; var47 <= var44; var47++) {
                                if ((class202.field3233[var15][var46 + 1][var47] & 0x4) == 0) {
                                    break label450;
                                }
                            }
                        }
                        if ((var44 - (var43 - 1)) * (var46 + 1 - var42) >= 4) {
                            int var48 = class242.field3842[var15][var42][var43];
                            class67.method423(4, var42 * 128, var46 * 128 + 128, var43 * 128, var44 * 128 + 128, var48, var48);
                            for (int var49 = var42; var49 <= var46; var49++) {
                                for (int var50 = var43; var50 <= var44; var50++) {
                                    class202.field3233[var15][var49][var50] = class10.method53(class202.field3233[var15][var49][var50], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V")
    public static void method1195(boolean arg0) {
        field2765 = null;
        field2764 = null;
        field2773 = null;
        field2775 = null;
        field2770 = null;
        if (!arg0) {
            method1195(true);
        }
        field2771 = null;
        field2776 = null;
        field2769 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V")
    private static final void method1196(int arg0, int arg1) {
        class154 var2 = class27.field346[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class154 var4 = class27.field346[var3][arg0][arg1] = class27.field346[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2416--;
                for (int var5 = 0; var5 < var4.field2431; var5++) {
                    class114 var6 = var4.field2418[var5];
                    if ((var6.field1712 >> 29 & 0x3L) == 2L && var6.field1724 == arg0 && var6.field1719 == arg1) {
                        var6.field1725--;
                    }
                }
            }
        }
        if (class27.field346[0][arg0][arg1] == null) {
            class27.field346[0][arg0][arg1] = new class154(0, arg0, arg1);
        }
        class27.field346[0][arg0][arg1].field2435 = var2;
        class27.field346[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILma;)Lel;")
    public static final class218 method1197(int arg0, int arg1, class202 arg2) {
        field2774++;
        class218 var3 = new class218(arg1, arg2.method1403(-126), arg2.method1403(-126), arg2.method1440(20404), arg2.method1440(20404), arg2.method1420((byte) 0) == 1, arg2.method1420((byte) 0));
        int var4 = arg2.method1420((byte) 0);
        if (arg0 > -56) {
            field2771 = null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field3484.method1952(new class277(arg2.method1420((byte) 0), arg2.method1420((byte) 0), arg2.method1419(119), arg2.method1419(106), arg2.method1419(81), arg2.method1419(91), arg2.method1419(95), arg2.method1419(119), arg2.method1419(96), arg2.method1419(69)), 76);
        }
        var3.method1527(-110);
        return var3;
    }
}
