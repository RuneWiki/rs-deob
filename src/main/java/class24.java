import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class24 {

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "[I")
    public static int[] field279 = new int[64];

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Ljava/lang/String;")
    public static String field281 = "white:";

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
    public static int[] field282;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[[[I")
    public static int[][][] field280;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static final void method173(byte arg0) {
        if (arg0 >= 85) {
            field283++;
            class45.field651.method1556((byte) 113);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z[Lth;[[[II)V")
    public static final void method174(boolean arg0, class113[] arg1, int[][][] arg2, int arg3) {
        field277++;
        if (arg3 < 6) {
            field282 = null;
        }
        if (!arg0) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class86.field1277[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class86.field1277[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg1[var7].method831(var5, 2883968, var6);
                            }
                        }
                    }
                }
            }
            class274.field4410 += (int) (Math.random() * 5.0D) - 2;
            class200.field3205 += (int) (Math.random() * 5.0D) - 2;
            if (class274.field4410 < -16) {
                class274.field4410 = -16;
            }
            if (class200.field3205 < -8) {
                class200.field3205 = -8;
            }
            if (class200.field3205 > 8) {
                class200.field3205 = 8;
            }
            if (class274.field4410 > 16) {
                class274.field4410 = 16;
            }
        }
        int var8 = class200.field3205 >> 2 << 10;
        int var9 = class274.field4410 >> 1;
        byte var10;
        if (arg0) {
            var10 = 1;
        } else {
            var10 = 4;
        }
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var10; var13++) {
            byte[][] var52 = class59.field830[var13];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var53 * 768 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    byte var102 = 74;
                    int var103 = class220.field3533[var13][var101 + 1][var55] - class220.field3533[var13][var101 - 1][var55];
                    int var104 = class220.field3533[var13][var101][var55 + 1] - class220.field3533[var13][var101][var55 - 1];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + var103 * var103 + 65536));
                    int var106 = (var103 << 8) / var105;
                    int var107 = -65536 / var105;
                    int var108 = (var52[var101][var55 - 1] >> 2) + (var52[var101 - 1][var55] >> 2) + (var52[var101][var55] >> 1) + (var52[var101][var55 + 1] >> 3) + (var52[var101 + 1][var55] >> 3);
                    int var109 = (var104 << 8) / var105;
                    int var110 = (var106 * -50 + var107 * -10 + var109 * -50) / var54 + var102;
                    var12[var101][var55] = var110 - var108;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class51.field741[var56] = 0;
                class266.field4305[var56] = 0;
                class126.field1859[var56] = 0;
                class11.field125[var56] = 0;
                class297.field4689[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var86 = 0; var86 < 104; var86++) {
                    int var95 = var57 + 5;
                    int var10002;
                    if (var95 < 104) {
                        int var96 = class94.field1402[var13][var95][var86] & 0xFF;
                        if (var96 > 0) {
                            class193 var97 = class297.method1995(1, var96 - 1);
                            class51.field741[var86] += var97.field3100;
                            class266.field4305[var86] += var97.field3115;
                            class126.field1859[var86] += var97.field3114;
                            class11.field125[var86] += var97.field3109;
                            var10002 = class297.field4689[var86]++;
                        }
                    }
                    int var98 = var57 - 5;
                    if (var98 >= 0) {
                        int var99 = class94.field1402[var13][var98][var86] & 0xFF;
                        if (var99 > 0) {
                            class193 var100 = class297.method1995(1, var99 - 1);
                            class51.field741[var86] -= var100.field3100;
                            class266.field4305[var86] -= var100.field3115;
                            class126.field1859[var86] -= var100.field3114;
                            class11.field125[var86] -= var100.field3109;
                            var10002 = class297.field4689[var86]--;
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
                            var87 += class51.field741[var93];
                            var90 += class11.field125[var93];
                            var88 += class266.field4305[var93];
                            var89 += class126.field1859[var93];
                            var91 += class297.field4689[var93];
                        }
                        int var94 = var92 - 5;
                        if (var94 >= 0) {
                            var91 -= class297.field4689[var94];
                            var90 -= class11.field125[var94];
                            var89 -= class126.field1859[var94];
                            var88 -= class266.field4305[var94];
                            var87 -= class51.field741[var94];
                        }
                        if (var92 >= 0 && var91 > 0) {
                            var11[var57][var92] = class135.method973(var88 / var91, var89 / var91, var87 * 256 / var90, (byte) 107);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var59 = 1; var59 < 103; var59++) {
                    if (arg0 || class77.method566((byte) -70) || (class86.field1277[0][var58][var59] & 0x2) != 0 || (class86.field1277[var13][var58][var59] & 0x10) == 0 && class38.method299(var13, var59, var58, 32768) == class11.field134) {
                        if (var13 < class29.field357) {
                            class29.field357 = var13;
                        }
                        int var60 = class94.field1402[var13][var58][var59] & 0xFF;
                        int var61 = class163.field2647[var13][var58][var59] & 0xFF;
                        if (var60 > 0 || var61 > 0) {
                            int var62 = class220.field3533[var13][var58 + 1][var59];
                            int var63 = class220.field3533[var13][var58 + 1][var59 + 1];
                            int var64 = class220.field3533[var13][var58][var59 + 1];
                            int var65 = class220.field3533[var13][var58][var59];
                            if (var13 > 0) {
                                boolean var66 = true;
                                if (var60 == 0 && class145.field2371[var13][var58][var59] != 0) {
                                    var66 = false;
                                }
                                if (var61 > 0 && !class270.method1875(0, var61 - 1).field3340) {
                                    var66 = false;
                                }
                                if (var66 && var62 == var65 && var63 == var65 && var64 == var65) {
                                    class26.field302[var13][var58][var59] = class244.method1747(class26.field302[var13][var58][var59], 4);
                                }
                            }
                            int var67;
                            int var70;
                            if (var60 > 0) {
                                var67 = var11[var58][var59];
                                int var68 = (var67 & 0x7F) + var9;
                                if (var68 < 0) {
                                    var68 = 0;
                                } else if (var68 > 127) {
                                    var68 = 127;
                                }
                                int var69 = (var67 & 0x380) + ((var8 + var67 & 0xFC00) + var68);
                                var70 = class47.field680[class193.method1434(-124, var69, 96)];
                            } else {
                                var67 = -1;
                                var70 = 0;
                            }
                            int var71 = var12[var58][var59];
                            int var72 = var12[var58 + 1][var59 + 1];
                            int var73 = var12[var58 + 1][var59];
                            int var74 = var12[var58][var59 + 1];
                            if (var61 == 0) {
                                class57.method420(var13, var58, var59, 0, 0, -1, var65, var62, var63, var64, class193.method1434(-104, var67, var71), class193.method1434(-80, var67, var73), class193.method1434(-70, var67, var72), class193.method1434(-110, var67, var74), 0, 0, 0, 0, var70, 0);
                            } else {
                                int var75 = class145.field2371[var13][var58][var59] + 1;
                                byte var76 = class240.field3832[var13][var58][var59];
                                class208 var77 = class270.method1875(0, var61 - 1);
                                int var78 = var77.field3335;
                                if (var78 >= 0 && !class47.field689.method227(var78, -31)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var80;
                                if (var78 >= 0) {
                                    var79 = class47.field680[class43.method328(127, class47.field689.method237(var78, 65535), 96)];
                                    var80 = -1;
                                } else if (var77.field3345 == -1) {
                                    var80 = -2;
                                    var79 = 0;
                                } else {
                                    var80 = var77.field3345;
                                    int var81 = (var80 & 0x7F) + var9;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 127) {
                                        var81 = 127;
                                    }
                                    int var82 = (var80 & 0x380) + (var80 + var8 & 0xFC00) + var81;
                                    var79 = class47.field680[class43.method328(118, var82, 96)];
                                }
                                if (var77.field3339 >= 0) {
                                    int var83 = var77.field3339;
                                    int var84 = (var83 & 0x7F) + var9;
                                    if (var84 < 0) {
                                        var84 = 0;
                                    } else if (var84 > 127) {
                                        var84 = 127;
                                    }
                                    int var85 = (var83 + var8 & 0xFC00) + (var83 & 0x380) + var84;
                                    var79 = class47.field680[class43.method328(-122, var85, 96)];
                                }
                                class57.method420(var13, var58, var59, var75, var76, var78, var65, var62, var63, var64, class193.method1434(-84, var67, var71), class193.method1434(-80, var67, var73), class193.method1434(-116, var67, var72), class193.method1434(-109, var67, var74), class43.method328(-124, var80, var71), class43.method328(112, var80, var73), class43.method328(118, var80, var72), class43.method328(113, var80, var74), var70, var79);
                            }
                        }
                    }
                }
            }
            class94.field1402[var13] = null;
            class163.field2647[var13] = null;
            class145.field2371[var13] = null;
            class240.field3832[var13] = null;
            class59.field830[var13] = null;
        }
        class215.method1544(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var51 = 0; var51 < 104; var51++) {
                if ((class86.field1277[1][var14][var51] & 0x2) == 2) {
                    class195.method1445(var14, var51);
                }
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 <= 104; var16++) {
                for (int var17 = 0; var17 <= 104; var17++) {
                    if ((class26.field302[var15][var17][var16] & 0x1) != 0) {
                        int var18;
                        for (var18 = var16; var18 > 0 && (class26.field302[var15][var17][var18 - 1] & 0x1) != 0; var18--) {
                        }
                        int var19;
                        for (var19 = var16; var19 < 104 && (class26.field302[var15][var17][var19 + 1] & 0x1) != 0; var19++) {
                        }
                        int var20 = var15;
                        int var21 = var15;
                        label351: while (var20 > 0) {
                            for (int var22 = var18; var22 <= var19; var22++) {
                                if ((class26.field302[var20 - 1][var17][var22] & 0x1) == 0) {
                                    break label351;
                                }
                            }
                            var20--;
                        }
                        label340: while (var21 < 3) {
                            for (int var23 = var18; var23 <= var19; var23++) {
                                if ((class26.field302[var21 + 1][var17][var23] & 0x1) == 0) {
                                    break label340;
                                }
                            }
                            var21++;
                        }
                        int var24 = (var21 + 1 - var20) * (var19 + 1 - var18);
                        if (var24 >= 8) {
                            short var25 = 240;
                            int var26 = class220.field3533[var20][var17][var18];
                            int var27 = class220.field3533[var21][var17][var18] - var25;
                            class5.method26(1, var17 * 128, var17 * 128, var18 * 128, var19 * 128 + 128, var27, var26);
                            for (int var28 = var20; var28 <= var21; var28++) {
                                for (int var29 = var18; var29 <= var19; var29++) {
                                    class26.field302[var28][var17][var29] = class179.method1337(class26.field302[var28][var17][var29], -2);
                                }
                            }
                        }
                    }
                    if ((class26.field302[var15][var17][var16] & 0x2) != 0) {
                        int var30;
                        for (var30 = var17; var30 > 0 && (class26.field302[var15][var30 - 1][var16] & 0x2) != 0; var30--) {
                        }
                        int var31 = var17;
                        int var32 = var15;
                        int var33 = var15;
                        while (var31 < 104 && (class26.field302[var15][var31 + 1][var16] & 0x2) != 0) {
                            var31++;
                        }
                        label406: while (var32 > 0) {
                            for (int var34 = var30; var34 <= var31; var34++) {
                                if ((class26.field302[var32 - 1][var34][var16] & 0x2) == 0) {
                                    break label406;
                                }
                            }
                            var32--;
                        }
                        label395: while (var33 < 3) {
                            for (int var35 = var30; var35 <= var31; var35++) {
                                if ((class26.field302[var33 + 1][var35][var16] & 0x2) == 0) {
                                    break label395;
                                }
                            }
                            var33++;
                        }
                        int var36 = (var31 + 1 - var30) * (var33 + 1 - var32);
                        if (var36 >= 8) {
                            short var37 = 240;
                            int var38 = class220.field3533[var33][var30][var16] - var37;
                            int var39 = class220.field3533[var32][var30][var16];
                            class5.method26(2, var30 * 128, var31 * 128 + 128, var16 * 128, var16 * 128, var38, var39);
                            for (int var40 = var32; var40 <= var33; var40++) {
                                for (int var41 = var30; var41 <= var31; var41++) {
                                    class26.field302[var40][var41][var16] = class179.method1337(class26.field302[var40][var41][var16], -3);
                                }
                            }
                        }
                    }
                    if ((class26.field302[var15][var17][var16] & 0x4) != 0) {
                        int var42 = var17;
                        int var43 = var17;
                        int var44 = var16;
                        int var45;
                        for (var45 = var16; var45 < 104 && (class26.field302[var15][var17][var45 + 1] & 0x4) != 0; var45++) {
                        }
                        while (var44 > 0 && (class26.field302[var15][var17][var44 - 1] & 0x4) != 0) {
                            var44--;
                        }
                        label460: while (var42 > 0) {
                            for (int var46 = var44; var46 <= var45; var46++) {
                                if ((class26.field302[var15][var42 - 1][var46] & 0x4) == 0) {
                                    break label460;
                                }
                            }
                            var42--;
                        }
                        label449: while (var43 < 104) {
                            for (int var47 = var44; var47 <= var45; var47++) {
                                if ((class26.field302[var15][var43 + 1][var47] & 0x4) == 0) {
                                    break label449;
                                }
                            }
                            var43++;
                        }
                        if (((var45 + 1 - var44) * (var43 + 1 - var42)) >= 4) {
                            int var48 = class220.field3533[var15][var42][var44];
                            class5.method26(4, var42 * 128, var43 * 128 + 128, var44 * 128, var45 * 128 + 128, var48, var48);
                            for (int var49 = var42; var49 <= var43; var49++) {
                                for (int var50 = var44; var50 <= var45; var50++) {
                                    class26.field302[var15][var49][var50] = class179.method1337(class26.field302[var15][var49][var50], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Llc;IILlc;Z)Lil;")
    public static final class165 method175(class86 arg0, int arg1, int arg2, class86 arg3, boolean arg4) {
        int[] var5 = arg0.method641(0, arg2);
        boolean var6 = true;
        field284++;
        if (arg1 < 15) {
            method174(false, (class113[]) null, (int[][][]) null, -37);
        }
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg0.method648((byte) -110, var5[var7], arg2);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg4) {
                    var10 = arg3.method648((byte) -121, var9, 0);
                } else {
                    var10 = arg3.method648((byte) -92, 0, var9);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class165(arg0, arg3, arg2, arg4);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
    public static void method176(byte arg0) {
        field282 = null;
        if (arg0 < 63) {
            method177(-26, (String) null, true, -43);
        }
        field280 = null;
        field279 = null;
        field281 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/lang/String;ZI)I")
    public static final int method177(int arg0, String arg1, boolean arg2, int arg3) {
        field286++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        if (arg0 != -123) {
            method174(false, (class113[]) null, (int[][][]) null, 35);
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg3 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if ((var10 / arg3) != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZZIIII)V")
    public static final void method178(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -1) {
            field281 = null;
        }
        field285++;
        if (arg4 <= arg5) {
            return;
        }
        int var7 = (arg4 + arg5) / 2;
        int var8 = arg5;
        class223 var9 = class169.field2725[var7];
        class169.field2725[var7] = class169.field2725[arg4];
        class169.field2725[arg4] = var9;
        for (int var10 = arg5; var10 < arg4; var10++) {
            if (class156.method1157(arg1, arg0, arg2, -1, var9, arg3, class169.field2725[var10]) <= 0) {
                class223 var11 = class169.field2725[var10];
                class169.field2725[var10] = class169.field2725[var8];
                class169.field2725[var8++] = var11;
            }
        }
        class169.field2725[arg4] = class169.field2725[var8];
        class169.field2725[var8] = var9;
        method178(arg0, arg1, arg2, arg3, var8 - 1, arg5, -1);
        method178(arg0, arg1, arg2, arg3, arg4, var8 + 1, -1);
    }
}
