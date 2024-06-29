import java.awt.Component;
import java.awt.Graphics;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public abstract class class209 {

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "[Lmh;")
    public static class62[] field3536 = new class62[100];

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field3544 = 0;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "Lmh;")
    public static class62 field3538 = class201.method1405(true, "welle:");

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "Lmh;")
    public static class62 field3540 = class201.method1405(true, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "[I")
    public static int[] field3539;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 15)
    public static final void method1460(int arg0) {
        field3545++;
        if (arg0 <= 98) {
            method1461((class123) null, 50, -83, -36, 30, -41);
        }
        if (class158.field2537 != null) {
            class158.field2537.method859(0);
        }
        if (class221.field3800 != null) {
            class221.field3800.method859(0);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljm;IIIII)V", line = 31)
    public static final void method1461(class123 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class164.field2669 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class114.field1900) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class252.field4273 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class166 var14 = class256.field4320[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class37.field569[var11][var12 + 1][var13] + class37.field569[var11][var12][var13] + class37.field569[var11][var12][var13 + 1] + class37.field569[var11][var12 + 1][var13 + 1]) / 4 - (class37.field569[arg1][arg2 + 1][arg3] + class37.field569[arg1][arg2][arg3] + class37.field569[arg1][arg2][arg3 + 1] + class37.field569[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class54 var16 = var14.field2706;
                                    if (var16 != null) {
                                        if (var16.field786.method578()) {
                                            arg0.method572(var16.field786, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field788 != null && var16.field788.method578()) {
                                            arg0.method572(var16.field788, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field2724; var17++) {
                                        class164 var18 = var14.field2713[var17];
                                        if (var18 != null && var18.field2672.method578() && (var18.field2651 == var12 || var7 == var12) && (var18.field2670 == var13 || var9 == var13)) {
                                            int var19 = var18.field2661 + 1 - var18.field2651;
                                            int var20 = var18.field2657 + 1 - var18.field2670;
                                            arg0.method572(var18.field2672, (var18.field2651 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2670 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 132)
    public static final void method1462(Component arg0, byte arg1) {
        field3546++;
        Method var2 = class285.field4886;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        if (arg1 != -120) {
            method1466((class92) null, (byte) -64);
        }
        arg0.addKeyListener(class111.field1810);
        arg0.addFocusListener(class111.field1810);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V", line = 158)
    public static void method1463(byte arg0) {
        field3538 = null;
        if (arg0 != -4) {
            method1460(-83);
        }
        field3539 = null;
        field3540 = null;
        field3536 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lhi;Lhi;I)I", line = 182)
    public static final int method1464(class26 arg0, class26 arg1, int arg2) {
        field3541++;
        int var3 = 0;
        if (arg1.method136(5, class52.field739)) {
            var3++;
        }
        if (arg1.method136(5, class304.field5232)) {
            var3++;
        }
        if (arg1.method136(5, class156.field2508)) {
            var3++;
        }
        if (arg0.method136(5, class52.field739)) {
            var3++;
        }
        if (arg2 >= -45) {
            return 28;
        }
        if (arg0.method136(5, class304.field5232)) {
            var3++;
        }
        if (arg0.method136(5, class156.field2508)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZZ[Lwc;)V", line = 216)
    public static final void method1465(boolean arg0, boolean arg1, class218[] arg2) {
        field3543++;
        byte var3;
        if (arg0) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg0) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class42.field641[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class42.field641[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg2[var7].method1548(var5, 2097152, var6);
                            }
                        }
                    }
                }
            }
            class276.field4741 += (int) (Math.random() * 5.0D) - 2;
            class251.field4247 += (int) (Math.random() * 5.0D) - 2;
            if (class276.field4741 < -16) {
                class276.field4741 = -16;
            }
            if (class276.field4741 > 16) {
                class276.field4741 = 16;
            }
            if (class251.field4247 < -8) {
                class251.field4247 = -8;
            }
            if (class251.field4247 > 8) {
                class251.field4247 = 8;
            }
        }
        int var8 = class251.field4247 >> 2 << 10;
        int var9 = class276.field4741 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        if (!arg1) {
            method1461((class123) null, 62, -101, -63, 21, 6);
        }
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var13 = class72.field1110[var12];
            if (client.field5162) {
                for (int var14 = 1; var14 < 103; var14++) {
                    for (int var15 = 1; var15 < 103; var15++) {
                        byte var16 = 74;
                        int var17 = (var13[var15][var14 + 1] >> 3) + (var13[var15][var14] >> 1) + (var13[var15 + -1][var14] >> 2) + (var13[var15][var14 + -1] >> 2) + (var13[var15 + 1][var14] >> 3);
                        var10[var15][var14] = var16 - var17;
                    }
                }
            } else {
                int var18 = (int) class179.field2849[0];
                int var19 = (int) class179.field2849[1];
                int var20 = (int) class179.field2849[2];
                int var21 = (int) Math.sqrt((double) (var18 * var18 + var19 * var19 + var20 * var20));
                int var22 = var21 * 1024 >> 8;
                for (int var23 = 1; var23 < 103; var23++) {
                    for (int var24 = 1; var24 < 103; var24++) {
                        byte var25 = 96;
                        int var26 = class37.field569[var12][var24 + 1][var23] - class37.field569[var12][var24 - 1][var23];
                        int var27 = class37.field569[var12][var24][var23 + 1] - class37.field569[var12][var24][var23 - 1];
                        int var28 = (int) Math.sqrt((double) (var26 * var26 + var27 * var27 + 65536));
                        int var29 = (var26 << 8) / var28;
                        int var30 = -65536 / var28;
                        int var31 = (var27 << 8) / var28;
                        int var32 = (var18 * var29 + (var19 * var30) + (var20 * var31)) / var22 + var25;
                        int var33 = (var13[var24 - 1][var23] >> 2) + (var13[var24][var23] >> 1) + (var13[var24 + 1][var23] >> 3) + (var13[var24][var23 - -1] >> 3) + (var13[var24][var23 + -1] >> 2);
                        var10[var24][var23] = var32 - ((int) ((float) var33 * 1.7F));
                    }
                }
            }
            for (int var34 = 0; var34 < 104; var34++) {
                class78.field1312[var34] = 0;
                class206.field3494[var34] = 0;
                class98.field1621[var34] = 0;
                class274.field4639[var34] = 0;
                class252.field4282[var34] = 0;
            }
            for (int var35 = -5; var35 < 104; var35++) {
                for (int var36 = 0; var36 < 104; var36++) {
                    int var37 = var35 + 5;
                    int var10002;
                    if (var37 < 104) {
                        int var38 = class129.field2120[var12][var37][var36] & 0xFF;
                        if (var38 > 0) {
                            class5 var39 = class156.method1153(var38 - 1, true);
                            class78.field1312[var36] += var39.field48;
                            class206.field3494[var36] += var39.field63;
                            class98.field1621[var36] += var39.field49;
                            class274.field4639[var36] += var39.field61;
                            var10002 = class252.field4282[var36]++;
                        }
                    }
                    int var40 = var35 - 5;
                    if (var40 >= 0) {
                        int var41 = class129.field2120[var12][var40][var36] & 0xFF;
                        if (var41 > 0) {
                            class5 var42 = class156.method1153(var41 - 1, true);
                            class78.field1312[var36] -= var42.field48;
                            class206.field3494[var36] -= var42.field63;
                            class98.field1621[var36] -= var42.field49;
                            class274.field4639[var36] -= var42.field61;
                            var10002 = class252.field4282[var36]--;
                        }
                    }
                }
                if (var35 >= 0) {
                    int var43 = 0;
                    int var44 = 0;
                    int var45 = 0;
                    int var46 = 0;
                    int var47 = 0;
                    for (int var48 = -5; var48 < 104; var48++) {
                        int var49 = var48 + 5;
                        if (var49 < 104) {
                            var43 += class78.field1312[var49];
                            var46 += class252.field4282[var49];
                            var44 += class206.field3494[var49];
                            var45 += class274.field4639[var49];
                            var47 += class98.field1621[var49];
                        }
                        int var50 = var48 - 5;
                        if (var50 >= 0) {
                            var44 -= class206.field3494[var50];
                            var43 -= class78.field1312[var50];
                            var46 -= class252.field4282[var50];
                            var45 -= class274.field4639[var50];
                            var47 -= class98.field1621[var50];
                        }
                        if (var48 >= 0 && var46 > 0) {
                            var11[var35][var48] = class72.method516(var44 / var46, (byte) 40, var43 * 256 / var45, var47 / var46);
                        }
                    }
                }
            }
            for (int var51 = 1; var51 < 103; var51++) {
                label733: for (int var52 = 1; var52 < 103; var52++) {
                    if (arg0 || class149.method1073((byte) -127) || (class42.field641[0][var51][var52] & 0x2) != 0 || (class42.field641[var12][var51][var52] & 0x10) == 0 && class281.method1918(var12, (byte) -107, var51, var52) == class190.field3028) {
                        if (class169.field2737 > var12) {
                            class169.field2737 = var12;
                        }
                        int var53 = class129.field2120[var12][var51][var52] & 0xFF;
                        int var54 = class35.field473[var12][var51][var52] & 0xFF;
                        if (var53 > 0 || var54 > 0) {
                            int var55 = class37.field569[var12][var51][var52];
                            int var56 = class37.field569[var12][var51 + 1][var52];
                            int var57 = class37.field569[var12][var51 + 1][var52 + 1];
                            int var58 = class37.field569[var12][var51][var52 + 1];
                            if (var12 > 0) {
                                boolean var59 = true;
                                if (var53 == 0 && class121.field2020[var12][var51][var52] != 0) {
                                    var59 = false;
                                }
                                if (var54 > 0 && !class247.method1726(var54 - 1, (byte) -65).field467) {
                                    var59 = false;
                                }
                                if (var59 && var55 == var56 && var55 == var57 && var55 == var58) {
                                    class143.field2283[var12][var51][var52] = class270.method1854(class143.field2283[var12][var51][var52], 4);
                                }
                            }
                            int var60;
                            int var61;
                            if (var53 <= 0) {
                                var60 = -1;
                                var61 = 0;
                            } else {
                                var60 = var11[var51][var52];
                                int var62 = (var60 & 0x7F) + var9;
                                if (var62 < 0) {
                                    var62 = 0;
                                } else if (var62 > 127) {
                                    var62 = 127;
                                }
                                int var63 = (var60 + var8 & 0xFC00) + (var60 & 0x380) + var62;
                                var61 = class23.field246[class191.method1335(96, (byte) -100, var63)];
                            }
                            int var64 = var10[var51][var52];
                            int var65 = var10[var51 + 1][var52 + 1];
                            int var66 = var10[var51 + 1][var52];
                            int var67 = var10[var51][var52 + 1];
                            if (var54 == 0) {
                                class146.method1067(var12, var51, var52, 0, 0, -1, var55, var56, var57, var58, class191.method1335(var64, (byte) -102, var60), class191.method1335(var66, (byte) 92, var60), class191.method1335(var65, (byte) -110, var60), class191.method1335(var67, (byte) 91, var60), 0, 0, 0, 0, var61, 0);
                                if (var12 > 0 && var60 != -1 && class156.method1153(var53 - 1, true).field60) {
                                    class168.method1206(0, 0, true, false, var51, var52, var55 - class37.field569[0][var51][var52], -class37.field569[0][var51 + 1][var52] + var56, var57 - class37.field569[0][var51 + 1][var52 + 1], -class37.field569[0][var51][var52 - -1] + var58);
                                }
                                if (!arg0 && class96.field1563 != null && var12 == 0) {
                                    for (int var68 = var51 - 1; var68 <= var51 + 1; var68++) {
                                        for (int var69 = var52 - 1; var69 <= (var52 + 1); var69++) {
                                            if ((var51 != var68 || var52 != var69) && var68 >= 0 && var68 < 104 && var69 >= 0 && var69 < 104) {
                                                int var70 = class35.field473[var12][var68][var69] & 0xFF;
                                                if (var70 != 0) {
                                                    class35 var71 = class247.method1726(var70 - 1, (byte) 61);
                                                    if (var71.field461 != -1 && class23.field248.method192(var71.field461, 255) == 4) {
                                                        class96.field1563[var51][var52] = (var71.field472 << 24) + var71.field464;
                                                        continue label733;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var72 = class121.field2020[var12][var51][var52] + 1;
                                byte var73 = class206.field3502[var12][var51][var52];
                                class35 var74 = class247.method1726(var54 - 1, (byte) 35);
                                if (!arg0 && class96.field1563 != null && var12 == 0) {
                                    if (var74.field461 != -1 && class23.field248.method192(var74.field461, 255) == 4) {
                                        class96.field1563[var51][var52] = (var74.field472 << 24) + var74.field464;
                                    } else {
                                        label715: for (int var75 = var51 - 1; var75 <= (var51 + 1); var75++) {
                                            for (int var76 = var52 - 1; var76 <= var52 + 1; var76++) {
                                                if ((var51 != var75 || var52 != var76) && var75 >= 0 && var75 < 104 && var76 >= 0 && var76 < 104) {
                                                    int var77 = class35.field473[var12][var75][var76] & 0xFF;
                                                    if (var77 != 0) {
                                                        class35 var78 = class247.method1726(var77 - 1, (byte) -67);
                                                        if (var78.field461 != -1 && class23.field248.method192(var78.field461, 255) == 4) {
                                                            class96.field1563[var51][var52] = (var78.field472 << 24) + var78.field464;
                                                            break label715;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var79 = var74.field461;
                                if (var79 >= 0 && !class23.field248.method175(15411, var79)) {
                                    var79 = -1;
                                }
                                int var80;
                                int var81;
                                if (var79 >= 0) {
                                    var81 = -1;
                                    var80 = class23.field246[class176.method1241(65408, 96, class23.field248.method173((byte) -74, var79))];
                                } else if (var74.field466 == -1) {
                                    var80 = 0;
                                    var81 = -2;
                                } else {
                                    var81 = var74.field466;
                                    int var82 = (var81 & 0x7F) + var9;
                                    if (var82 < 0) {
                                        var82 = 0;
                                    } else if (var82 > 127) {
                                        var82 = 127;
                                    }
                                    int var83 = (var81 & 0x380) + ((var8 + var81 & 0xFC00) + var82);
                                    var80 = class23.field246[class176.method1241(65408, 96, var83)];
                                }
                                if (var74.field456 >= 0) {
                                    int var84 = var74.field456;
                                    int var85 = (var84 & 0x7F) + var9;
                                    if (var85 < 0) {
                                        var85 = 0;
                                    } else if (var85 > 127) {
                                        var85 = 127;
                                    }
                                    int var86 = (var8 + var84 & 0xFC00) + (var84 & 0x380) + var85;
                                    var80 = class23.field246[class176.method1241(65408, 96, var86)];
                                }
                                class146.method1067(var12, var51, var52, var72, var73, var79, var55, var56, var57, var58, class191.method1335(var64, (byte) 122, var60), class191.method1335(var66, (byte) 123, var60), class191.method1335(var65, (byte) 86, var60), class191.method1335(var67, (byte) 99, var60), class176.method1241(65408, var64, var81), class176.method1241(65408, var66, var81), class176.method1241(65408, var65, var81), class176.method1241(65408, var67, var81), var61, var80);
                                if (var12 > 0) {
                                    class168.method1206(var72, var73, var81 == -2 || !var74.field462, var60 == -1 || !class156.method1153(var53 - 1, true).field60, var51, var52, var55 - class37.field569[0][var51][var52], -class37.field569[0][var51 + 1][var52] + var56, var57 - class37.field569[0][var51 + 1][var52 + 1], -class37.field569[0][var51][var52 + 1] + var58);
                                }
                            }
                        }
                    }
                }
            }
            float[][] var87 = new float[105][105];
            float[][] var88 = new float[105][105];
            float[][] var89 = new float[105][105];
            int[][] var90 = class37.field569[var12];
            for (int var91 = 1; var91 <= 103; var91++) {
                for (int var92 = 1; var92 <= 103; var92++) {
                    int var93 = var90[var92 + 1][var91] - var90[var92 - 1][var91];
                    int var94 = var90[var92][var91 + 1] - var90[var92][var91 - 1];
                    float var95 = (float) Math.sqrt((double) (var94 * var94 + var93 * var93 + 65536));
                    var87[var92][var91] = (float) var93 / var95;
                    var88[var92][var91] = -256.0F / var95;
                    var89[var92][var91] = (float) var94 / var95;
                }
            }
            if (arg0) {
                class224[] var101 = class270.method1853(var87, class42.field641, var10, class121.field2020[var12], class37.field569[var12], class72.field1106[0], var11, var88, var12, class96.field1563, var89, class129.field2120[var12], class206.field3502[var12], 16777215, class35.field473[var12]);
                class254.method1773(var12, var101);
            } else {
                class224[] var96 = class270.method1853(var87, class42.field641, var10, class121.field2020[var12], class37.field569[var12], (int[][]) null, var11, var88, var12, (int[][]) null, var89, class129.field2120[var12], class206.field3502[var12], 16777215, class35.field473[var12]);
                class224[] var97 = class22.method102(var12, var89, class35.field473[var12], var87, class37.field569[var12], class121.field2020[var12], class129.field2120[var12], (byte) -9, var10, var88, class42.field641, class206.field3502[var12]);
                class224[] var98 = new class224[var96.length + var97.length];
                for (int var99 = 0; var99 < var96.length; var99++) {
                    var98[var99] = var96[var99];
                }
                for (int var100 = 0; var100 < var97.length; var100++) {
                    var98[var96.length + var100] = var97[var100];
                }
                class254.method1773(var12, var98);
                class100.method797(var88, class37.field569[var12], var89, class121.field2020[var12], class206.field3502[var12], class117.field1951, var87, -127, class117.field1950, var12, class129.field2120[var12], class35.field473[var12]);
            }
            class129.field2120[var12] = (byte[][]) null;
            class35.field473[var12] = (byte[][]) null;
            class121.field2020[var12] = (byte[][]) null;
            class206.field3502[var12] = (byte[][]) null;
            class72.field1110[var12] = (byte[][]) null;
        }
        class182.method1284(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var102 = 0; var102 < 104; var102++) {
            for (int var103 = 0; var103 < 104; var103++) {
                if ((class42.field641[1][var102][var103] & 0x2) == 2) {
                    class54.method352(var102, var103);
                }
            }
        }
        for (int var104 = 0; var104 < 4; var104++) {
            for (int var105 = 0; var105 <= 104; var105++) {
                for (int var106 = 0; var106 <= 104; var106++) {
                    if ((class143.field2283[var104][var106][var105] & 0x1) != 0) {
                        int var107 = var104;
                        int var108 = var104;
                        int var109 = var105;
                        int var110 = var105;
                        while (var109 < 104 && (class143.field2283[var104][var106][var109 + 1] & 0x1) != 0) {
                            var109++;
                        }
                        while (var110 > 0 && (class143.field2283[var104][var106][var110 - 1] & 0x1) != 0) {
                            var110--;
                        }
                        label433: while (var108 > 0) {
                            for (int var111 = var110; var111 <= var109; var111++) {
                                if ((class143.field2283[var108 - 1][var106][var111] & 0x1) == 0) {
                                    break label433;
                                }
                            }
                            var108--;
                        }
                        label422: while (var107 < 3) {
                            for (int var112 = var110; var112 <= var109; var112++) {
                                if ((class143.field2283[var107 + 1][var106][var112] & 0x1) == 0) {
                                    break label422;
                                }
                            }
                            var107++;
                        }
                        int var113 = (var107 + 1 - var108) * (var109 + 1 - var110);
                        if (var113 >= 8) {
                            short var114 = 240;
                            int var115 = class37.field569[var107][var106][var110] - var114;
                            int var116 = class37.field569[var108][var106][var110];
                            class267.method1841(1, var106 * 128, var106 * 128, var110 * 128, var109 * 128 + 128, var115, var116);
                            for (int var117 = var108; var117 <= var107; var117++) {
                                for (int var118 = var110; var118 <= var109; var118++) {
                                    class143.field2283[var117][var106][var118] = class234.method1648(class143.field2283[var117][var106][var118], -2);
                                }
                            }
                        }
                    }
                    if ((class143.field2283[var104][var106][var105] & 0x2) != 0) {
                        int var119 = var106;
                        int var120 = var106;
                        while (var119 < 104 && (class143.field2283[var104][var119 + 1][var105] & 0x2) != 0) {
                            var119++;
                        }
                        int var121 = var104;
                        while (var120 > 0 && (class143.field2283[var104][var120 - 1][var105] & 0x2) != 0) {
                            var120--;
                        }
                        label487: while (var121 > 0) {
                            for (int var122 = var120; var122 <= var119; var122++) {
                                if ((class143.field2283[var121 - 1][var122][var105] & 0x2) == 0) {
                                    break label487;
                                }
                            }
                            var121--;
                        }
                        int var123;
                        label475: for (var123 = var104; var123 < 3; var123++) {
                            for (int var124 = var120; var124 <= var119; var124++) {
                                if ((class143.field2283[var123 + 1][var124][var105] & 0x2) == 0) {
                                    break label475;
                                }
                            }
                        }
                        int var125 = (var119 + 1 - var120) * (var123 + 1 - var121);
                        if (var125 >= 8) {
                            int var126 = class37.field569[var121][var120][var105];
                            short var127 = 240;
                            int var128 = class37.field569[var123][var120][var105] - var127;
                            class267.method1841(2, var120 * 128, var119 * 128 + 128, var105 * 128, var105 * 128, var128, var126);
                            for (int var129 = var121; var129 <= var123; var129++) {
                                for (int var130 = var120; var130 <= var119; var130++) {
                                    class143.field2283[var129][var130][var105] = class234.method1648(class143.field2283[var129][var130][var105], -3);
                                }
                            }
                        }
                    }
                    if ((class143.field2283[var104][var106][var105] & 0x4) != 0) {
                        int var131 = var106;
                        int var132 = var106;
                        int var133;
                        for (var133 = var105; var133 > 0 && (class143.field2283[var104][var106][var133 - 1] & 0x4) != 0; var133--) {
                        }
                        int var134;
                        for (var134 = var105; var134 < 104 && (class143.field2283[var104][var106][var134 + 1] & 0x4) != 0; var134++) {
                        }
                        label541: while (var131 > 0) {
                            for (int var135 = var133; var135 <= var134; var135++) {
                                if ((class143.field2283[var104][var131 - 1][var135] & 0x4) == 0) {
                                    break label541;
                                }
                            }
                            var131--;
                        }
                        label530: while (var132 < 104) {
                            for (int var136 = var133; var136 <= var134; var136++) {
                                if ((class143.field2283[var104][var132 + 1][var136] & 0x4) == 0) {
                                    break label530;
                                }
                            }
                            var132++;
                        }
                        if ((var132 + 1 - var131) * (var134 + 1 - var133) >= 4) {
                            int var137 = class37.field569[var104][var131][var133];
                            class267.method1841(4, var131 * 128, var132 * 128 + 128, var133 * 128, var134 * 128 + 128, var137, var137);
                            for (int var138 = var131; var138 <= var132; var138++) {
                                for (int var139 = var133; var139 <= var134; var139++) {
                                    class143.field2283[var104][var138][var139] = class234.method1648(class143.field2283[var104][var138][var139], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lmi;B)V", line = 1156)
    public static final void method1466(class92 arg0, byte arg1) {
        field3537++;
        int var2 = -1 % ((48 - arg1) / 42);
        while (true) {
            while (arg0.field1476 < arg0.field1495.length) {
                int var3 = 0;
                int var4 = 0;
                boolean var5 = false;
                if (arg0.method702(-1) == 1) {
                    var4 = arg0.method702(-1);
                    var3 = arg0.method702(-1);
                    var5 = true;
                }
                int var6 = arg0.method702(-1);
                int var7 = arg0.method702(-1);
                int var8 = var6 * 64 - class22.field239;
                int var9 = class164.field2666 + class248.field4219 - (var7 * 64) - 1;
                if (var8 >= 0 && var9 - 63 >= 0 && (var8 + 63) < class184.field2955 && class248.field4219 > var9) {
                    int var10 = var8 >> 6;
                    int var11 = var9 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var5 || (var4 * 8) <= var12 && var12 < var4 * 8 + 8 && var3 * 8 <= var13 && (var3 * 8 + 8) > var13) {
                                byte var14 = arg0.method743((byte) 62);
                                if (var14 != 0) {
                                    if (class41.field619[var10][var11] == null) {
                                        class41.field619[var10][var11] = new byte[4096];
                                    }
                                    class41.field619[var10][var11][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg0.method743((byte) 110);
                                    if (class226.field3941[var10][var11] == null) {
                                        class226.field3941[var10][var11] = new byte[4096];
                                    }
                                    class226.field3941[var10][var11][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var5 ? 64 : 4096); var16++) {
                        byte var17 = arg0.method743((byte) 55);
                        if (var17 != 0) {
                            arg0.field1476++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V", line = 1254)
    protected class209() {
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
    public abstract void method1459(int arg0, int arg1, int arg2, Graphics arg3, int arg4, byte arg5);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Graphics;IIZ)V")
    public abstract void method1467(Graphics arg0, int arg1, int arg2, boolean arg3);
}
