import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class191 implements class124 {

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field2843 = -1;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "I")
    public static int field2850 = 1400;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "Lnn;")
    public static class151 field2845 = new class151("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "[Lro;")
    public static class112[] field2848;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "([IJBI)Ljava/lang/String;")
    public final String method737(int[] arg0, long arg1, byte arg2, int arg3) {
        field2849++;
        if (arg3 == 0) {
            class132 var6 = class286.method1770(false, arg0[0]);
            return var6.method779((int) arg1, (byte) 108);
        } else if (arg3 == 1 || arg3 == 10) {
            class167 var7 = class186.field2796.method1106(50, (int) arg1);
            return var7.field2329;
        } else if (arg2 <= 94) {
            return null;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class286.method1770(false, arg0[0]).method779((int) arg1, (byte) 127);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(CZ)C")
    public static final char method1152(char arg0, boolean arg1) {
        field2844++;
        if (arg1) {
            method1155(-128);
        }
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public static void method1153(int arg0) {
        field2848 = null;
        if (arg0 <= 22) {
            field2846 = -32;
        }
        field2845 = null;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIII[Lfh;III)V")
    public static final void method1154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class170[] arg6, int arg7, int arg8, int arg9) {
        field2847++;
        class196.field2965.method436(arg5, arg9, arg2, arg4);
        int var10 = 0;
        if (arg7 != -1) {
            return;
        }
        while (var10 < arg6.length) {
            class170 var11 = arg6[var10];
            if (var11 != null && (var11.field2474 == arg3 || arg3 == -1412584499 && class14.field173 == var11)) {
                int var12;
                if (arg0 == -1) {
                    class247.field3700[class174.field2662].setBounds(var11.field2476 + arg1, var11.field2478 + arg8, var11.field2561, var11.field2501);
                    var12 = class174.field2662++;
                } else {
                    var12 = arg0;
                }
                var11.field2528 = class26.field332;
                var11.field2490 = var12;
                if (!client.method2783(var11)) {
                    label556: {
                        if (var11.field2473 != 0) {
                            class3.method22(0, var11);
                        }
                        int var13 = var11.field2476 + arg1;
                        int var14 = var11.field2478 + arg8;
                        int var15 = var11.field2563;
                        if (class120.field1586 && (client.method2796(var11).field4689 != 0 || var11.field2558 == 0) && var15 > 127) {
                            var15 = 127;
                        }
                        if (class14.field173 == var11) {
                            if (arg3 != -1412584499 && (class188.field2820 == var11.field2508 || class388.field5732 == var11.field2508)) {
                                class429.field6307 = arg6;
                                class228.field3491 = arg1;
                                class367.field5388 = arg8;
                                break label556;
                            }
                            if (class365.field5368 && class72.field956) {
                                int var16 = class74.field1004.method505((byte) -118);
                                int var17 = class74.field1004.method501(109);
                                int var18 = var17 - class146.field2029;
                                int var19 = var16 - class247.field3703;
                                if (var19 < class456.field6764) {
                                    var19 = class456.field6764;
                                }
                                if (var18 < class446.field6574) {
                                    var18 = class446.field6574;
                                }
                                if (class456.field6764 + class402.field6011.field2561 < var11.field2561 + var19) {
                                    var19 = class456.field6764 + class402.field6011.field2561 - var11.field2561;
                                }
                                var13 = var19;
                                if ((var18 + var11.field2501) > (class446.field6574 + class402.field6011.field2501)) {
                                    var18 = class446.field6574 + class402.field6011.field2501 - var11.field2501;
                                }
                                var14 = var18;
                            }
                            if (class388.field5732 == var11.field2508) {
                                var15 = 128;
                            }
                        }
                        int var20;
                        int var21;
                        int var22;
                        int var23;
                        if (var11.field2558 == 2) {
                            var20 = arg4;
                            var21 = arg5;
                            var22 = arg2;
                            var23 = arg9;
                        } else {
                            int var24 = var13 + var11.field2561;
                            int var25 = var11.field2501 + var14;
                            if (var11.field2558 == 9) {
                                var24++;
                                var25++;
                            }
                            var23 = var14 <= arg9 ? arg9 : var14;
                            var21 = arg5 < var13 ? var13 : arg5;
                            var20 = var25 >= arg4 ? arg4 : var25;
                            var22 = var24 >= arg2 ? arg2 : var24;
                        }
                        if (var22 > var21 && var23 < var20) {
                            if (var11.field2473 != 0) {
                                if (class210.field3162 == var11.field2473 || class17.field248 == var11.field2473) {
                                    class373.method2240(var11.field2561, var13, arg7 ^ 0x3C9, class17.field248 == var11.field2473, var11.field2501, var14);
                                    class6.field71[var12] = true;
                                    class196.field2965.method436(arg5, arg9, arg2, arg4);
                                    break label556;
                                }
                                if (class431.field6331 == var11.field2473) {
                                    if (var11.method1047((byte) 80, class196.field2965) != null) {
                                        class374.method2244((byte) -78);
                                        class170.method1039(var13, var14, var11, class196.field2965, 120);
                                        class71.field931[var12] = true;
                                        class196.field2965.method436(arg5, arg9, arg2, arg4);
                                    }
                                    break label556;
                                }
                                if (class80.field1057 == var11.field2473) {
                                    if (var11.method1047((byte) 80, class196.field2965) != null) {
                                        class312.method1902(var11, 16383, var13, var14);
                                        class71.field931[var12] = true;
                                        class196.field2965.method436(arg5, arg9, arg2, arg4);
                                    }
                                    break label556;
                                }
                                if (field2850 == var11.field2473) {
                                    class430.method2644(var13, class362.field5334, class196.field2965, var11.field2561, (byte) 29, var11.field2501, var14);
                                    class6.field71[var12] = true;
                                    class196.field2965.method436(arg5, arg9, arg2, arg4);
                                    break label556;
                                }
                                if (class87.field1233 == var11.field2473) {
                                    class344.method2099(var13, class196.field2965, var11.field2501, var14, var11.field2561, -1442514344);
                                    class6.field71[var12] = true;
                                    class196.field2965.method436(arg5, arg9, arg2, arg4);
                                    break label556;
                                }
                                if (class450.field6621 == var11.field2473) {
                                    if (!class212.field3194 && !class326.field4901) {
                                        break label556;
                                    }
                                    int var26 = var11.field2561 + var13;
                                    int var27 = var14 + 15;
                                    if (class212.field3194) {
                                        class380.field5552.method860(arg7 + 32, -256, -1, "Fps:" + class388.field5733, var27, var26);
                                        var27 += 15;
                                        Runtime var28 = Runtime.getRuntime();
                                        int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                        int var30 = -256;
                                        if (var29 > 65536) {
                                            var30 = -65536;
                                        }
                                        class380.field5552.method860(31, var30, -1, "Mem:" + var29 + "k", var27, var26);
                                        var27 += 15;
                                        int var31 = class196.field2965.method430() / 1024;
                                        class380.field5552.method860(arg7 + 32, var31 > 65536 ? -65536 : -256, -1, "Offheap:" + var31 + "k", var27, var26);
                                        var27 += 15;
                                        int var32 = 0;
                                        int var33 = 0;
                                        int var34 = 0;
                                        for (int var35 = 0; var35 < 29; var35++) {
                                            var32 += class151.field2087[var35].method2816(true);
                                            var33 += class151.field2087[var35].method2811(100);
                                            var34 += class151.field2087[var35].method2812(arg7 ^ 0xFFFFFFA0);
                                        }
                                        int var36 = var34 * 100 / var32;
                                        int var37 = var33 * 10000 / var32;
                                        String var38 = "Cache:" + class282.method1734((long) var37, 0, 2, 120, true) + "% (" + var36 + "%)";
                                        class284.field4334.method860(31, -256, -1, var38, var27, var26);
                                        var27 += 12;
                                    }
                                    if (class388.field5742 > 0) {
                                        class284.field4334.method860(arg7 + 32, -256, -1, "Particles: " + class280.field4292 + " / " + class388.field5742, var27, var26);
                                    }
                                    var27 += 12;
                                    if (class326.field4901) {
                                        class284.field4334.method860(arg7 + 32, -256, -1, "Polys: " + class196.field2965.method361() + " Models: " + class196.field2965.method442(), var27, var26);
                                        var27 += 12;
                                        class284.field4334.method860(31, -256, -1, "Ls: " + class241.field3631 + " La: " + class217.field3298 + " NPC: " + class399.field5961 + " Pl: " + class238.field3569, var27, var26);
                                        var27 += 12;
                                        class391.method2413(0);
                                    }
                                    class6.field71[var12] = true;
                                    break label556;
                                }
                            }
                            if (var11.field2558 == 0) {
                                if (class405.field6029 == var11.field2473 && class196.field2965.method387()) {
                                    class196.field2965.method396(var13, var14, var11.field2561, var11.field2501);
                                }
                                method1154(var12, var13 - var11.field2521, var22, var11.field2525, var20, var21, arg6, -1, var14 - var11.field2559, var23);
                                if (var11.field2625 != null) {
                                    method1154(var12, var13 - var11.field2521, var22, var11.field2525, var20, var21, var11.field2625, arg7, var14 - var11.field2559, var23);
                                }
                                class333 var39 = (class333) class308.field4647.method2302((long) var11.field2525, 23576);
                                if (var39 != null) {
                                    class267.method1660(var12, var20, 1, var13, var39.field4965, var23, var21, var22, var14);
                                }
                                if (class405.field6029 == var11.field2473 && class196.field2965.method387()) {
                                    class196.field2965.method445();
                                    class174.field2665 = true;
                                }
                                class196.field2965.method436(arg5, arg9, arg2, arg4);
                            }
                            if (class71.field914[var12] || class243.field3649 > 1) {
                                if (var11.field2558 == 3) {
                                    if (var15 == 0) {
                                        if (var11.field2565) {
                                            class196.field2965.method358(var13, var14, var11.field2561, var11.field2501, var11.field2589, 0);
                                        } else {
                                            class196.field2965.method422(var13, var14, var11.field2561, var11.field2501, var11.field2589, 0);
                                        }
                                    } else if (var11.field2565) {
                                        class196.field2965.method358(var13, var14, var11.field2561, var11.field2501, 255 - (var15 & 0xFF) << 24 | var11.field2589 & 0xFFFFFF, 1);
                                    } else {
                                        class196.field2965.method422(var13, var14, var11.field2561, var11.field2501, 255 - (var15 & 0xFF) << 24 | var11.field2589 & 0xFFFFFF, 1);
                                    }
                                } else if (var11.field2558 == 4) {
                                    class137 var40 = var11.method1046(class196.field2965, 2);
                                    if (var40 != null) {
                                        int var41 = var11.field2589;
                                        String var42 = var11.field2568;
                                        if (var11.field2592 != -1) {
                                            class167 var43 = class186.field2796.method1106(50, var11.field2592);
                                            var42 = var43.field2329;
                                            if (var42 == null) {
                                                var42 = "null";
                                            }
                                            if ((var43.field2356 == 1 || var11.field2545 != 1) && var11.field2545 != -1) {
                                                var42 = "<col=ff9040>" + var42 + "</col> x" + class378.method2274(var11.field2545, arg7 + 31783);
                                            }
                                        }
                                        if (class98.field1359 == var11) {
                                            var42 = class311.field4686.method937((byte) -49, class27.field356);
                                            var41 = var11.field2589;
                                        }
                                        if (class189.field2841) {
                                            class196.field2965.method354(var13, var14, var13 + var11.field2561, var11.field2501 + var14);
                                        }
                                        var40.method871(var11.field2501, var11.field2584 ? 255 - (var15 & 0xFF) << 24 : -1, var41 | 255 - (var15 & 0xFF) << 24, 0, 0, (int[]) null, var13, class107.field1426, arg7 ^ 0x663, var14, var11.field2561, (class153) null, var42, var11.field2555, var11.field2544, var11.field2483);
                                        if (class189.field2841) {
                                            class196.field2965.method436(arg5, arg9, arg2, arg4);
                                        }
                                    } else if (class465.field6847) {
                                        class405.method2543(var11, arg7 ^ 0xFFFFFF83);
                                    }
                                } else if (var11.field2558 == 5) {
                                    if (var11.field2597 < 0) {
                                        class234 var45;
                                        if (var11.field2592 == -1) {
                                            var45 = var11.method1044(106, class196.field2965);
                                        } else {
                                            class128 var44 = var11.field2532 ? class113.field1500.field2443 : null;
                                            var45 = class186.field2796.method1115(var11.field2539 | 0xFF000000, var11.field2545, -111, var11.field2543, var11.field2592, class196.field2965, var11.field2593, var44);
                                        }
                                        if (var45 != null) {
                                            int var46 = var45.method1226();
                                            int var47 = var45.method1219();
                                            if (var11.field2564) {
                                                class196.field2965.method354(var13, var14, var11.field2561 + var13, var14 - -var11.field2501);
                                                if (var11.field2531 != 0) {
                                                    int var49 = (var11.field2561 + var46 - 1) / var46;
                                                    int var50 = (var47 + var11.field2501 - 1) / var47;
                                                    for (int var51 = 0; var51 < var49; var51++) {
                                                        for (int var52 = 0; var52 < var50; var52++) {
                                                            var45.method1414((float) var46 / 2.0F + (float) (var13 + (var46 * var51)), (float) var47 / 2.0F + (float) (var14 - -(var47 * var52)), 4096, var11.field2531);
                                                        }
                                                    }
                                                } else if (var15 == 0) {
                                                    var45.method1228(var13, var14, var11.field2561, var11.field2501, 0, 0, 1);
                                                } else {
                                                    var45.method1228(var13, var14, var11.field2561, var11.field2501, 1, 255 - (var15 & 0xFF) << 24 | 0xFFFFFF, 1);
                                                }
                                                class196.field2965.method436(arg5, arg9, arg2, arg4);
                                            } else if (var15 != 0) {
                                                int var48 = 255 - (var15 & 0xFF) << 24 | 0xFFFFFF;
                                                if (var11.field2531 != 0) {
                                                    var45.method1416((float) var11.field2561 / 2.0F + (float) var13, (float) var11.field2501 / 2.0F + (float) var14, var11.field2561 * 4096 / var46, var11.field2531, 1, var48, 1);
                                                } else if (var11.field2561 == var46 && var11.field2501 == var47) {
                                                    var45.method1218(var13, var14, 1, var48, 1);
                                                } else {
                                                    var45.method1222(var13, var14, var11.field2561, var11.field2501, 1, var48, 1);
                                                }
                                            } else if (var11.field2531 != 0) {
                                                var45.method1414((float) var11.field2561 / 2.0F + (float) var13, (float) var11.field2501 / 2.0F + (float) var14, var11.field2561 * 4096 / var46, var11.field2531);
                                            } else if (var11.field2561 == var46 && var11.field2501 == var47) {
                                                var45.method1408(var13, var14);
                                            } else {
                                                var45.method1409(var13, var14, var11.field2561, var11.field2501);
                                            }
                                        } else if (class465.field6847) {
                                            class405.method2543(var11, 126);
                                        }
                                    } else {
                                        var11.method1045(805095472).method772(var11.field2610 << 3, 0, var13, 0, var11.field2594 << 3, var14, var11.field2501, 0, var11.field2561, class196.field2965);
                                    }
                                } else if (var11.field2558 == 6) {
                                    class21.method139(arg7 - 24765);
                                    class292 var53 = null;
                                    int var54 = 0;
                                    if (var11.field2592 != -1) {
                                        class167 var55 = class186.field2796.method1106(50, var11.field2592);
                                        if (var55 != null) {
                                            class167 var56 = var55.method1001((byte) 70, var11.field2545);
                                            class379 var57 = var11.field2576 == -1 ? null : class98.method629(var11.field2576, (byte) -115);
                                            class128 var58 = var11.field2532 ? class113.field1500.field2443 : null;
                                            var53 = var56.method1006(1, 1024, var11.field2489, class196.field2965, (byte) 91, var11.field2609, var11.field2619, var57, var58);
                                            if (var53 == null) {
                                                class405.method2543(var11, arg7 ^ 0xFFFFFF80);
                                            } else {
                                                var54 = -var53.method1263() / 2;
                                            }
                                        }
                                    } else if (var11.field2606 == 5) {
                                        int var59 = var11.field2616;
                                        if (var59 >= 0 && var59 < 2048) {
                                            class169 var60 = class140.field1883[var59];
                                            class379 var61 = var11.field2576 == -1 ? null : class98.method629(var11.field2576, (byte) -115);
                                            if (var60 != null && (class386.field5703 == var59 || class394.method2496(-91, var60.field2459) == var11.field2604)) {
                                                var53 = var60.field2443.method753((class410[]) null, 0, true, var61, class186.field2796, class196.field2965, var11.field2609, 1024, -128, var11.field2489, (class379) null, 0, var11.field2619, -1);
                                            }
                                        }
                                    } else if (var11.field2606 == 8 || var11.field2606 == 9) {
                                        class148 var63 = class432.method2655((byte) 119, false, var11.field2616);
                                        class379 var64 = var11.field2576 == -1 ? null : class98.method629(var11.field2576, (byte) -115);
                                        if (var63 != null) {
                                            class128 var65 = var11.field2532 ? class113.field1500.field2443 : null;
                                            var53 = var63.method920(var11.field2619, 1024, class196.field2965, var11.field2606 == 9, var11.field2489, (byte) -24, var65, var64, var11.field2604, var11.field2609);
                                        }
                                    } else if (var11.field2576 == -1) {
                                        var53 = var11.method1037(-1, -16527, class113.field1500.field2443, class196.field2965, -1, 1024, class186.field2796, (class379) null, 0);
                                        if (var53 == null && class465.field6847) {
                                            class405.method2543(var11, 126);
                                        }
                                    } else {
                                        class379 var62 = class98.method629(var11.field2576, (byte) -115);
                                        var53 = var11.method1037(var11.field2619, -16527, class113.field1500.field2443, class196.field2965, var11.field2609, 1024, class186.field2796, var62, var11.field2489);
                                        if (var53 == null && class465.field6847) {
                                            class405.method2543(var11, arg7 ^ 0xFFFFFF81);
                                        }
                                    }
                                    if (var53 != null) {
                                        int var66;
                                        if (var11.field2599 <= 0) {
                                            var66 = 512;
                                        } else {
                                            var66 = (var11.field2561 << 9) / var11.field2599;
                                        }
                                        int var67;
                                        if (var11.field2500 > 0) {
                                            var67 = (var11.field2501 << 9) / var11.field2500;
                                        } else {
                                            var67 = 512;
                                        }
                                        int var68 = (var11.field2468 * var66 >> 9) + (var13 + (var11.field2561 / 2));
                                        int var69 = (var11.field2522 * var67 >> 9) + var11.field2501 / 2 + var14;
                                        class94.field1312.method601();
                                        class196.field2965.method397(class94.field1312);
                                        int var70 = class110.field1450[var11.field2620 << 3] * var11.field2538 >> 15;
                                        int var71 = class110.field1452[var11.field2620 << 3] * var11.field2538 >> 15;
                                        class196.field2965.method399(var68, var69, var66, var67);
                                        class196.field2965.method423((float) var11.field2608, var11.field2526 ? (float) var11.field2554 : (float) var11.field2554 * 1.5F);
                                        if (arg3 == -1412584499 || class174.field2665) {
                                            class196.field2965.method433();
                                            class196.field2965.method353();
                                            class196.field2965.method436(arg5, arg9, arg2, arg4);
                                            class174.field2665 = false;
                                        }
                                        if (var11.field2562) {
                                            class196.field2965.method443(false);
                                        }
                                        class243.field3647.method609(-var11.field2484 << 3);
                                        class243.field3647.method607(var11.field2587 << 3);
                                        class243.field3647.method604(var11.field2510, var54 + var11.field2623 + var70, var11.field2623 + var71);
                                        class243.field3647.method603(var11.field2620 << 3);
                                        if (class189.field2841) {
                                            class196.field2965.method354(var13, var14, var11.field2561 + var13, var11.field2501 + var14);
                                        }
                                        if (var11.field2526) {
                                            var53.method1283(class243.field3647, (class158) null, var11.field2538, 1);
                                        } else {
                                            var53.method1282(class243.field3647, (class158) null, 1);
                                        }
                                        if (class189.field2841) {
                                            class196.field2965.method436(arg5, arg9, arg2, arg4);
                                        }
                                        if (var11.field2562) {
                                            class196.field2965.method443(true);
                                        }
                                    }
                                } else if (var11.field2558 == 9) {
                                    int var72;
                                    int var73;
                                    int var74;
                                    int var75;
                                    if (var11.field2572) {
                                        var73 = var14 + var11.field2501;
                                        var72 = var13;
                                        var74 = var11.field2561 + var13;
                                        var75 = var14;
                                    } else {
                                        var72 = var13;
                                        var73 = var14;
                                        var74 = var13 + var11.field2561;
                                        var75 = var14 + var11.field2501;
                                    }
                                    if (var11.field2581 == 1) {
                                        class196.field2965.method382(var72, var73, var74, var75, var11.field2589, 0);
                                    } else {
                                        class196.field2965.method368(var72, var73, var74, var75, var11.field2589, var11.field2581, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V")
    public static final void method1155(int arg0) {
        field2842++;
        int[] var1 = new int[class186.field2796.field2743];
        int var2 = 0;
        for (int var3 = 0; var3 < class186.field2796.field2743; var3++) {
            class167 var5 = class186.field2796.method1106(50, var3);
            if (var5.field2346 >= 0 || var5.field2397 >= 0) {
                var1[var2++] = var3;
            }
        }
        class295.field4483 = new int[var2];
        for (int var4 = arg0; var4 < var2; var4++) {
            class295.field4483[var4] = var1[var4];
        }
    }
}
