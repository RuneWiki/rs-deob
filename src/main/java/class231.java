import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class231 {

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Z")
    public static boolean field4154 = false;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Lkh;")
    public static class117 field4151 = class224.method1450((byte) -64, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!va", name = "i", descriptor = "Lkh;")
    public static class117 field4157 = null;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Ldi;")
    public static class43 field4156;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
    public static final void method1489(boolean arg0) {
        class167.field3010 = null;
        field4159++;
        if (arg0) {
            class58.field1196 = null;
            class200.field3638 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)V")
    public static final void method1490(boolean arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class173.field3126[var1] = true;
        }
        field4149++;
        if (arg0) {
            method1490(false);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)I")
    public static final int method1491(byte arg0, int arg1) {
        field4158++;
        if (arg1 >= 65 && arg1 <= 90 || !(arg1 < 192 || arg1 > 222 || arg1 == 215)) {
            return arg1 + 32;
        } else if (arg0 > -67) {
            return 122;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method1492(int arg0) {
        field4156 = null;
        field4151 = null;
        if (arg0 == -29726) {
            field4157 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([BIIIII[Lab;IZII)V")
    public static final void method1493(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class3[] arg6, int arg7, boolean arg8, int arg9, int arg10) {
        if (arg9 != -19915) {
            return;
        }
        byte var11;
        if (arg8) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg8) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if (arg3 + var12 > 0 && arg3 + var12 < 103 && arg5 + var13 > 0 && arg5 + var13 < 103) {
                        arg6[arg4].field45[arg3 + var12][arg5 + var13] = class209.method1370(arg6[arg4].field45[arg3 + var12][arg5 + var13], -16777217);
                    }
                }
            }
        }
        field4155++;
        class145 var14 = new class145(arg0);
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg7 == var15 && var16 >= arg1 && arg1 + 8 > var16 && arg2 <= var17 && var17 < arg2 + 8) {
                        class48.method381(var14, arg8, arg10, 0, arg4, 0, arg5 + class104.method700(var17 & 0x7, var16 & 0x7, arg10, arg9 - 1069), (byte) 63, arg3 + class28.method236(var17 & 0x7, var16 & 0x7, 3, arg10));
                    } else {
                        class48.method381(var14, arg8, 0, 0, 0, 0, -1, (byte) 90, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z[Lab;Z)V")
    public static final void method1494(boolean arg0, class3[] arg1, boolean arg2) {
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
                        if ((class233.field4200[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class233.field4200[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg1[var7].method15(-3, var5, var6);
                            }
                        }
                    }
                }
            }
            class160.field2929 += (int) (Math.random() * 5.0D) - 2;
            if (class160.field2929 < -8) {
                class160.field2929 = -8;
            }
            if (class160.field2929 > 8) {
                class160.field2929 = 8;
            }
            class21.field567 += (int) (Math.random() * 5.0D) - 2;
            if (class21.field567 < -16) {
                class21.field567 = -16;
            }
            if (class21.field567 > 16) {
                class21.field567 = 16;
            }
        }
        field4153++;
        int var8 = class160.field2929 >> 2 << 10;
        int var9 = class21.field567 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var55 = class225.field4049[var12];
            byte var56 = 74;
            short var57 = 768;
            int var58 = (int) Math.sqrt(5100.0D);
            int var59 = var57 * var58 >> 8;
            for (int var60 = 1; var60 < 103; var60++) {
                for (int var108 = 1; var108 < 103; var108++) {
                    int var110 = class156.field2839[var12][var108 + 1][var60] - class156.field2839[var12][var108 - 1][var60];
                    int var111 = class156.field2839[var12][var108][var60 + 1] - class156.field2839[var12][var108][var60 - 1];
                    int var112 = (int) Math.sqrt((double) (var111 * var111 + var110 * var110 + 65536));
                    int var113 = (var111 << 8) / var112;
                    int var114 = (var110 << 8) / var112;
                    int var115 = -65536 / var112;
                    int var116 = (var114 * -50 + var113 * -50 + var115 * -10) / var59 + var56;
                    int var117 = (var55[var108 - 1][var60] >> 2) + (var55[var108][var60 + 1] >> 3) + (var55[var108][var60] >> 1) + (var55[var108][var60 + -1] >> 2) + (var55[var108 - -1][var60] >> 3);
                    var10[var108][var60] = var116 - var117;
                }
            }
            for (int var61 = 0; var61 < 104; var61++) {
                class88.field1635[var61] = 0;
                class167.field3016[var61] = 0;
                class184.field3305[var61] = 0;
                class180.field3260[var61] = 0;
                class140.field2556[var61] = 0;
            }
            for (int var62 = -5; var62 < 104; var62++) {
                for (int var93 = 0; var93 < 104; var93++) {
                    int var102 = var62 + 5;
                    int var10002;
                    if (var102 < 104) {
                        int var103 = class196.field3496[var12][var102][var93] & 0xFF;
                        if (var103 > 0) {
                            class215 var104 = class194.method1294((byte) -105, var103 - 1);
                            class88.field1635[var93] += var104.field3911;
                            class167.field3016[var93] += var104.field3915;
                            class184.field3305[var93] += var104.field3912;
                            class180.field3260[var93] += var104.field3909;
                            var10002 = class140.field2556[var93]++;
                        }
                    }
                    int var105 = var62 - 5;
                    if (var105 >= 0) {
                        int var106 = class196.field3496[var12][var105][var93] & 0xFF;
                        if (var106 > 0) {
                            class215 var107 = class194.method1294((byte) -108, var106 - 1);
                            class88.field1635[var93] -= var107.field3911;
                            class167.field3016[var93] -= var107.field3915;
                            class184.field3305[var93] -= var107.field3912;
                            class180.field3260[var93] -= var107.field3909;
                            var10002 = class140.field2556[var93]--;
                        }
                    }
                }
                if (var62 >= 0) {
                    int var94 = 0;
                    int var95 = 0;
                    int var96 = 0;
                    int var97 = 0;
                    int var98 = 0;
                    for (int var99 = -5; var99 < 104; var99++) {
                        int var100 = var99 - 5;
                        int var101 = var99 + 5;
                        if (var101 < 104) {
                            var96 += class184.field3305[var101];
                            var98 += class140.field2556[var101];
                            var97 += class180.field3260[var101];
                            var94 += class88.field1635[var101];
                            var95 += class167.field3016[var101];
                        }
                        if (var100 >= 0) {
                            var97 -= class180.field3260[var100];
                            var94 -= class88.field1635[var100];
                            var98 -= class140.field2556[var100];
                            var96 -= class184.field3305[var100];
                            var95 -= class167.field3016[var100];
                        }
                        if (var99 >= 0 && var98 > 0) {
                            var11[var62][var99] = class128.method877(-77, var95 / var98, var94 * 256 / var97, var96 / var98);
                        }
                    }
                }
            }
            for (int var63 = 1; var63 < 103; var63++) {
                for (int var66 = 1; var66 < 103; var66++) {
                    if (!arg2) {
                        if (class167.field3021 && (class233.field4200[0][var63][var66] & 0x2) == 0 && ((class233.field4200[var12][var63][var66] & 0x10) != 0 || class40.method353(var66, var12, var63, -118) != class228.field4104)) {
                            continue;
                        }
                        if (class33.field770 > var12) {
                            class33.field770 = var12;
                        }
                    }
                    int var67 = class73.field1394[var12][var63][var66] & 0xFF;
                    int var68 = class196.field3496[var12][var63][var66] & 0xFF;
                    if (var68 > 0 || var67 > 0) {
                        int var69 = class156.field2839[var12][var63][var66];
                        int var70 = class156.field2839[var12][var63 + 1][var66];
                        int var71 = class156.field2839[var12][var63 + 1][var66 + 1];
                        int var72 = class156.field2839[var12][var63][var66 + 1];
                        if (var12 > 0) {
                            boolean var73 = true;
                            if (var68 == 0 && class120.field2268[var12][var63][var66] != 0) {
                                var73 = false;
                            }
                            if (var67 > 0 && !class145.method990(4, var67 - 1).field2436) {
                                var73 = false;
                            }
                            if (var73 && var69 == var70 && var69 == var71 && var69 == var72) {
                                class38.field873[var12][var63][var66] = class40.method352(class38.field873[var12][var63][var66], 2340);
                            }
                        }
                        int var74;
                        int var77;
                        if (var68 > 0) {
                            var74 = var11[var63][var66];
                            int var75 = (var74 & 0x7F) + var9;
                            if (var75 < 0) {
                                var75 = 0;
                            } else if (var75 > 127) {
                                var75 = 127;
                            }
                            int var76 = (var74 + var8 & 0xFC00) + (var74 & 0x380) + var75;
                            var77 = class89.field1654[class207.method1366(var76, -43, 96)];
                        } else {
                            var77 = 0;
                            var74 = -1;
                        }
                        int var78 = var10[var63][var66];
                        int var79 = var10[var63 + 1][var66 + 1];
                        int var80 = var10[var63 + 1][var66];
                        int var81 = var10[var63][var66 + 1];
                        if (var67 == 0) {
                            class226.method1461(var12, var63, var66, 0, 0, -1, var69, var70, var71, var72, class207.method1366(var74, -70, var78), class207.method1366(var74, -82, var80), class207.method1366(var74, -71, var79), class207.method1366(var74, -80, var81), 0, 0, 0, 0, var77, 0);
                        } else {
                            int var82 = class120.field2268[var12][var63][var66] + 1;
                            byte var83 = class109.field2062[var12][var63][var66];
                            class135 var84 = class145.method990(4, var67 - 1);
                            if (!arg2 && class58.field1199 != null && var12 == 0) {
                                class58.field1199[var63][var66] = (var84.field2432 << 24) + var84.field2429;
                            }
                            int var85 = var84.field2430;
                            if (var85 >= 0 && !class89.field1657.method538(4988, var85)) {
                                var85 = -1;
                            }
                            int var86;
                            int var87;
                            if (var85 >= 0) {
                                var86 = class89.field1654[class179.method1241(class89.field1657.method531(var85, (byte) -128), 23757, 96)];
                                var87 = -1;
                            } else if (var84.field2434 == -1) {
                                var86 = 0;
                                var87 = -2;
                            } else {
                                var87 = var84.field2434;
                                int var88 = (var87 & 0x7F) + var9;
                                if (var88 < 0) {
                                    var88 = 0;
                                } else if (var88 > 127) {
                                    var88 = 127;
                                }
                                int var89 = (var8 + var87 & 0xFC00) + (var87 & 0x380) + var88;
                                var86 = class89.field1654[class179.method1241(var89, 23757, 96)];
                            }
                            if (var84.field2435 >= 0) {
                                int var90 = var84.field2435;
                                int var91 = (var90 & 0x7F) + var9;
                                if (var91 < 0) {
                                    var91 = 0;
                                } else if (var91 > 127) {
                                    var91 = 127;
                                }
                                int var92 = (var8 + var90 & 0xFC00) - (-(var90 & 0x380) - var91);
                                var86 = class89.field1654[class179.method1241(var92, 23757, 96)];
                            }
                            class226.method1461(var12, var63, var66, var82, var83, var85, var69, var70, var71, var72, class207.method1366(var74, -85, var78), class207.method1366(var74, -66, var80), class207.method1366(var74, -84, var79), class207.method1366(var74, -113, var81), class179.method1241(var87, 23757, var78), class179.method1241(var87, 23757, var80), class179.method1241(var87, 23757, var79), class179.method1241(var87, 23757, var81), var77, var86);
                        }
                    }
                }
            }
            if (!arg2) {
                for (int var64 = 1; var64 < 103; var64++) {
                    for (int var65 = 1; var65 < 103; var65++) {
                        class227.method1472(var12, var65, var64, class40.method353(var64, var12, var65, -87));
                    }
                }
            }
            class196.field3496[var12] = null;
            class73.field1394[var12] = null;
            class120.field2268[var12] = null;
            class109.field2062[var12] = null;
            class225.field4049[var12] = null;
        }
        if (!arg0) {
            field4157 = null;
        }
        class240.method1522(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var54 = 0; var54 < 104; var54++) {
                if ((class233.field4200[1][var13][var54] & 0x2) == 2) {
                    class1.method2(var13, var54);
                }
            }
        }
        int var14 = 2;
        int var15 = 4;
        int var16 = 1;
        for (int var17 = 0; var17 < 4; var17++) {
            if (var17 > 0) {
                var14 <<= 0x3;
                var15 <<= 0x3;
                var16 <<= 0x3;
            }
            for (int var18 = 0; var18 <= var17; var18++) {
                for (int var19 = 0; var19 <= 104; var19++) {
                    for (int var20 = 0; var20 <= 104; var20++) {
                        if ((var16 & class38.field873[var18][var20][var19]) != 0) {
                            int var21 = var19;
                            int var22 = var19;
                            while (var21 > 0 && (var16 & class38.field873[var18][var20][var21 - 1]) != 0) {
                                var21--;
                            }
                            while (var22 < 104 && (class38.field873[var18][var20][var22 + 1] & var16) != 0) {
                                var22++;
                            }
                            int var23 = var18;
                            int var24;
                            label377: for (var24 = var18; var24 > 0; var24--) {
                                for (int var25 = var21; var25 <= var22; var25++) {
                                    if ((class38.field873[var24 - 1][var20][var25] & var16) == 0) {
                                        break label377;
                                    }
                                }
                            }
                            label366: while (var17 > var23) {
                                for (int var26 = var21; var26 <= var22; var26++) {
                                    if ((class38.field873[var23 + 1][var20][var26] & var16) == 0) {
                                        break label366;
                                    }
                                }
                                var23++;
                            }
                            int var27 = (var22 + 1 - var21) * (-var24 + 1 + var23);
                            if (var27 >= 8) {
                                short var28 = 240;
                                int var29 = class156.field2839[var24][var20][var21];
                                int var30 = class156.field2839[var23][var20][var21] - var28;
                                class70.method492(var17, 1, var20 * 128, var20 * 128, var21 * 128, var22 * 128 + 128, var30, var29);
                                for (int var31 = var24; var31 <= var23; var31++) {
                                    for (int var32 = var21; var32 <= var22; var32++) {
                                        class38.field873[var31][var20][var32] = class209.method1370(class38.field873[var31][var20][var32], ~var16);
                                    }
                                }
                            }
                        }
                        if ((class38.field873[var18][var20][var19] & var14) != 0) {
                            int var33;
                            for (var33 = var20; var33 > 0 && (var14 & class38.field873[var18][var33 - 1][var19]) != 0; var33--) {
                            }
                            int var34 = var20;
                            int var35 = var18;
                            int var36 = var18;
                            while (var34 < 104 && (class38.field873[var18][var34 + 1][var19] & var14) != 0) {
                                var34++;
                            }
                            label431: while (var35 > 0) {
                                for (int var37 = var33; var37 <= var34; var37++) {
                                    if ((class38.field873[var35 - 1][var37][var19] & var14) == 0) {
                                        break label431;
                                    }
                                }
                                var35--;
                            }
                            label420: while (var17 > var36) {
                                for (int var38 = var33; var38 <= var34; var38++) {
                                    if ((var14 & class38.field873[var36 + 1][var38][var19]) == 0) {
                                        break label420;
                                    }
                                }
                                var36++;
                            }
                            int var39 = (var34 + 1 - var33) * (var36 + 1 + -var35);
                            if (var39 >= 8) {
                                short var40 = 240;
                                int var41 = class156.field2839[var36][var33][var19] - var40;
                                int var42 = class156.field2839[var35][var33][var19];
                                class70.method492(var17, 2, var33 * 128, var34 * 128 + 128, var19 * 128, var19 * 128, var41, var42);
                                for (int var43 = var35; var43 <= var36; var43++) {
                                    for (int var44 = var33; var44 <= var34; var44++) {
                                        class38.field873[var43][var44][var19] = class209.method1370(class38.field873[var43][var44][var19], ~var14);
                                    }
                                }
                            }
                        }
                        if ((class38.field873[var18][var20][var19] & var15) != 0) {
                            int var45 = var20;
                            int var46;
                            for (var46 = var19; var46 > 0 && (var15 & class38.field873[var18][var20][var46 - 1]) != 0; var46--) {
                            }
                            int var47 = var20;
                            int var48;
                            for (var48 = var19; var48 < 104 && (class38.field873[var18][var20][var48 + 1] & var15) != 0; var48++) {
                            }
                            label485: while (var45 > 0) {
                                for (int var49 = var46; var49 <= var48; var49++) {
                                    if ((var15 & class38.field873[var18][var45 - 1][var49]) == 0) {
                                        break label485;
                                    }
                                }
                                var45--;
                            }
                            label474: while (var47 < 104) {
                                for (int var50 = var46; var50 <= var48; var50++) {
                                    if ((var15 & class38.field873[var18][var47 + 1][var50]) == 0) {
                                        break label474;
                                    }
                                }
                                var47++;
                            }
                            if ((var47 + 1 - var45) * (-var46 + 1 + var48) >= 4) {
                                int var51 = class156.field2839[var18][var45][var46];
                                class70.method492(var17, 4, var45 * 128, var47 * 128 + 128, var46 * 128, var48 * 128 + 128, var51, var51);
                                for (int var52 = var45; var52 <= var47; var52++) {
                                    for (int var53 = var46; var53 <= var48; var53++) {
                                        class38.field873[var18][var52][var53] = class209.method1370(class38.field873[var18][var52][var53], ~var15);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public static final void method1495(int arg0) {
        if (arg0 == 0) {
            field4152++;
            class25.field624 = true;
            class167.field3021 = true;
        }
    }
}
