import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class585 {

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "B")
    public byte field8695;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public int field8700;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public int field8694;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public int field8703;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public int field8693;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public int field8692;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field8691 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Lnj;")
    private static class487 field8689 = new class487("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Lud;")
    public static class119 field8702 = new class119();

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field8688;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "Lgu;")
    public static class126 field8699;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Lor;")
    public class217 field8696;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Lav;")
    public class299 field8697;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Leg;")
    public class48 field8698;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lmca;")
    public class5 field8687;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
    public static void method3417(boolean arg0) {
        field8699 = null;
        field8691 = null;
        if (!arg0) {
            method3418(19, 91, -34, -14, 94, null, 71, 43, -112, -35);
        }
        field8689 = null;
        field8702 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIII[Lwca;IIII)V")
    public static final void method3418(int arg0, int arg1, int arg2, int arg3, int arg4, class311[] arg5, int arg6, int arg7, int arg8, int arg9) {
        field8701++;
        class379.field5558.method1022(arg8, arg0, arg1, arg6);
        int var10 = 0;
        int var11 = -52 % ((arg9 - 22) / 36);
        while (arg5.length > var10) {
            class311 var12 = arg5[var10];
            if (var12 != null && (var12.field4551 == arg7 || arg7 == -1412584499 && class106.field1333 == var12)) {
                int var13;
                if (arg3 == -1) {
                    class280.field4162[class395.field5741].setBounds(var12.field4596 + arg4, var12.field4568 + arg2, var12.field4543, var12.field4620);
                    var13 = class395.field5741++;
                } else {
                    var13 = arg3;
                }
                var12.field4638 = var13;
                var12.field4682 = class576.field8505;
                if (!client.method3618(var12)) {
                    label586: {
                        if (var12.field4678 != 0) {
                            class140.method850(-16190, var12);
                        }
                        int var14 = var12.field4596 + arg4;
                        int var15 = var12.field4568 + arg2;
                        int var16 = var12.field4653;
                        if (class220.field3252 && (client.method3619(var12).field8904 != 0 || var12.field4655 == 0) && var16 > 127) {
                            var16 = 127;
                        }
                        if (class106.field1333 == var12) {
                            if (arg7 != -1412584499 && (class42.field490 == var12.field4623 || class216.field3198 == var12.field4623)) {
                                class625.field9163 = arg5;
                                class182.field2787 = arg2;
                                class19.field176 = arg4;
                                break label586;
                            }
                            if (class59.field711 && class591.field8751) {
                                int var17 = class350.field5071.method635(-192);
                                int var18 = class350.field5071.method633((byte) 29);
                                int var19 = var18 - class465.field6732;
                                int var20 = var17 - class158.field2107;
                                if (class215.field3151 > var20) {
                                    var20 = class215.field3151;
                                }
                                if (class408.field5833 > var19) {
                                    var19 = class408.field5833;
                                }
                                if (class215.field3151 + class533.field7896.field4543 < var20 - -var12.field4543) {
                                    var20 = class215.field3151 + class533.field7896.field4543 - var12.field4543;
                                }
                                if (var12.field4620 + var19 > class408.field5833 + class533.field7896.field4620) {
                                    var19 = class408.field5833 + class533.field7896.field4620 - var12.field4620;
                                }
                                var14 = var20;
                                var15 = var19;
                            }
                            if (class216.field3198 == var12.field4623) {
                                var16 = 128;
                            }
                        }
                        int var21;
                        int var22;
                        int var23;
                        int var24;
                        if (var12.field4655 == 2) {
                            var21 = arg8;
                            var22 = arg1;
                            var23 = arg6;
                            var24 = arg0;
                        } else {
                            int var25 = var12.field4543 + var14;
                            int var26 = var12.field4620 + var15;
                            if (var12.field4655 == 9) {
                                var26++;
                                var25++;
                            }
                            var21 = arg8 >= var14 ? arg8 : var14;
                            var24 = var15 <= arg0 ? arg0 : var15;
                            var23 = arg6 > var26 ? var26 : arg6;
                            var22 = arg1 <= var25 ? arg1 : var25;
                        }
                        if (var21 < var22 && var24 < var23) {
                            label613: {
                                if (var12.field4678 != 0) {
                                    if (class480.field7291 == var12.field4678 || class462.field6680 == var12.field4678) {
                                        class63.method398(var12.field4620, var15, var14, class462.field6680 == var12.field4678, var12.field4543, (byte) 109);
                                        class587.field8718[var13] = true;
                                        class379.field5558.method1022(arg8, arg0, arg1, arg6);
                                        break label613;
                                    }
                                    if (class69.field784 == var12.field4678) {
                                        if (var12.method1920(class379.field5558, 0) != null) {
                                            class171.method1090(-13787);
                                            class511.method3047(var14, -83, var12, class379.field5558, var15);
                                            class644.field9344[var13] = true;
                                            class379.field5558.method1022(arg8, arg0, arg1, arg6);
                                        }
                                        break label613;
                                    }
                                    if (class513.field7597 == var12.field4678) {
                                        if (var12.method1920(class379.field5558, 0) != null) {
                                            class290.method1796(var14, -30238, var15, var12);
                                            class644.field9344[var13] = true;
                                            class379.field5558.method1022(arg8, arg0, arg1, arg6);
                                        }
                                        break label613;
                                    }
                                    if (class4.field41 == var12.field4678) {
                                        class126.method769(var15, var12.field4543, var12.field4620, var14, class379.field5558, (byte) 124, class39.field441);
                                        class587.field8718[var13] = true;
                                        class379.field5558.method1022(arg8, arg0, arg1, arg6);
                                        break label613;
                                    }
                                    if (class205.field3051 == var12.field4678) {
                                        class92.method533(class379.field5558, var14, var12.field4543, -14175, var12.field4620, var15);
                                        class587.field8718[var13] = true;
                                        class379.field5558.method1022(arg8, arg0, arg1, arg6);
                                        break label613;
                                    }
                                    if (class92.field1149 == var12.field4678) {
                                        if (!class64.field740 && !class533.field7897) {
                                            break label613;
                                        }
                                        int var27 = var12.field4543 + var14;
                                        int var28 = var15 + 15;
                                        if (class64.field740) {
                                            int var29 = -256;
                                            if (class553.field8230 < 20) {
                                                var29 = -65536;
                                            }
                                            class259.field3800.method1670("Fps:" + class553.field8230, var28, -1, 13891, var29, var27);
                                            var28 += 15;
                                            Runtime var30 = Runtime.getRuntime();
                                            int var31 = (int) ((var30.totalMemory() - var30.freeMemory()) / 1024L);
                                            int var32 = -256;
                                            if (var31 > 65536) {
                                                if (class515.field7619) {
                                                    class441.method2689(-127);
                                                    for (int var33 = 0; var33 < 10; var33++) {
                                                        System.gc();
                                                    }
                                                    var31 = (int) ((var30.totalMemory() - var30.freeMemory()) / 1024L);
                                                    if (var31 > 65536) {
                                                        class62.method389("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", 0);
                                                    }
                                                }
                                                var32 = -65536;
                                            }
                                            class259.field3800.method1670("Mem:" + var31 + "k", var28, -1, 13891, var32, var27);
                                            var28 += 15;
                                            class259.field3800.method1670("In:" + class447.field6566 + "B/s Out:" + class281.field4174 + "B/s", var28, -1, 13891, -256, var27);
                                            var28 += 15;
                                            int var34 = class379.field5558.method1029() / 1024;
                                            class259.field3800.method1670("Offheap:" + var34 + "k", var28, -1, 13891, var34 <= 65536 ? -256 : -65536, var27);
                                            var28 += 15;
                                            int var35 = 0;
                                            int var36 = 0;
                                            int var37 = 0;
                                            for (int var38 = 0; var38 < 32; var38++) {
                                                var35 += class532.field7888[var38].method1553(false);
                                                var36 += class532.field7888[var38].method1547(-1);
                                                var37 += class532.field7888[var38].method1554(false);
                                            }
                                            int var39 = var37 * 100 / var35;
                                            int var40 = var36 * 10000 / var35;
                                            String var41 = "Cache:" + class85.method491(true, (long) var40, 0, (byte) -66, 2) + "% (" + var39 + "%)";
                                            class463.field6700.method1670(var41, var28, -1, 13891, -256, var27);
                                            var28 += 12;
                                        }
                                        if (class566.field8392 > 0) {
                                            class463.field6700.method1670("Particles: " + class149.field1923 + " / " + class566.field8392, var28, -1, 13891, -256, var27);
                                        }
                                        var28 += 12;
                                        if (class533.field7897) {
                                            class463.field6700.method1670("Polys: " + class379.field5558.method311() + " Models: " + class379.field5558.method1024(), var28, -1, 13891, -256, var27);
                                            var28 += 12;
                                            class463.field6700.method1670("Ls: " + class339.field4979 + " La: " + class259.field3802 + " NPC: " + class551.field8208 + " Pl: " + class461.field6670, var28, -1, 13891, -256, var27);
                                            var28 += 12;
                                            class434.method2649((byte) -48);
                                        }
                                        class587.field8718[var13] = true;
                                        break label613;
                                    }
                                }
                                if (var12.field4655 == 0) {
                                    if (class205.field3055 == var12.field4678 && class379.field5558.method345()) {
                                        class379.field5558.method280(var14, var15, var12.field4543, var12.field4620);
                                    }
                                    method3418(var24, var22, var15 - var12.field4668, var13, var14 - var12.field4672, arg5, var23, var12.field4667, var21, 120);
                                    if (var12.field4652 != null) {
                                        method3418(var24, var22, var15 - var12.field4668, var13, var14 - var12.field4672, var12.field4652, var23, var12.field4667, var21, -82);
                                    }
                                    class184 var42 = (class184) class600.field8865.method1333((long) var12.field4667, false);
                                    if (var42 != null) {
                                        class42.method221(var14, var15, var22, var24, (byte) 93, var42.field2796, var21, var13, var23);
                                    }
                                    if (class205.field3055 == var12.field4678 && class379.field5558.method345()) {
                                        class379.field5558.method303();
                                        class385.field5638 = true;
                                    }
                                    class379.field5558.method1022(arg8, arg0, arg1, arg6);
                                }
                                if (class359.field5215[var13] || class40.field446 > 1) {
                                    if (var12.field4655 == 3) {
                                        if (var16 == 0) {
                                            if (var12.field4666) {
                                                class379.field5558.method980(var14, var15, var12.field4543, var12.field4620, var12.field4562, 0);
                                            } else {
                                                class379.field5558.method1032(var14, var15, var12.field4543, var12.field4620, var12.field4562, 0);
                                            }
                                        } else if (var12.field4666) {
                                            class379.field5558.method980(var14, var15, var12.field4543, var12.field4620, 255 - (var16 & 0xFF) << 24 | var12.field4562 & 0xFFFFFF, 1);
                                        } else {
                                            class379.field5558.method1032(var14, var15, var12.field4543, var12.field4620, var12.field4562 & 0xFFFFFF | 255 - (var16 & 0xFF) << 24, 1);
                                        }
                                    } else if (var12.field4655 == 4) {
                                        class262 var43 = var12.method1910(class379.field5558, 874312624);
                                        if (var43 != null) {
                                            int var44 = var12.field4562;
                                            String var45 = var12.field4539;
                                            if (var12.field4661 != -1) {
                                                class414 var46 = class216.field3204.method3357(var12.field4661, (byte) -69);
                                                var45 = var46.field5900;
                                                if (var45 == null) {
                                                    var45 = "null";
                                                }
                                                if ((var46.field5939 == 1 || var12.field4527 != 1) && var12.field4527 != -1) {
                                                    var45 = "<col=ff9040>" + var45 + "</col> x" + class87.method516(true, var12.field4527);
                                                }
                                            }
                                            if (class135.field1798 == var12) {
                                                var45 = field8689.method2953(3181, class77.field889);
                                                var44 = var12.field4562;
                                            }
                                            if (class509.field7571) {
                                                class379.field5558.method993(var14, var15, var12.field4543 + var14, var15 - -var12.field4620);
                                            }
                                            var43.method1666(class372.field5384, var12.field4521 ? 255 - (var16 & 0xFF) << 24 : -1, 0, (byte) -93, null, var12.field4543, 255 - (var16 & 0xFF) << 24 | var44, var12.field4620, var12.field4525, 0, var12.field4619, var12.field4556, var45, var15, null, var14, var12.field4565);
                                            if (class509.field7571) {
                                                class379.field5558.method1022(arg8, arg0, arg1, arg6);
                                            }
                                        } else if (class394.field5727) {
                                            class619.method3586(123, var12);
                                        }
                                    } else if (var12.field4655 == 5) {
                                        if (var12.field4680 >= 0) {
                                            var12.method1914(class458.field6652, true, class28.field255).method187(var12.field4620, var12.field4543, 0, -43, var12.field4520 << 3, var15, class379.field5558, var12.field4631 << 3, var14, 0);
                                        } else {
                                            class116 var47;
                                            if (var12.field4661 == -1) {
                                                var47 = var12.method1911(class379.field5558, 0);
                                            } else {
                                                class170 var48 = var12.field4615 ? class239.field3493.field2711 : null;
                                                var47 = class216.field3204.method3364(class379.field5558, var12.field4661, var12.field4527, var12.field4557 | 0xFF000000, var12.field4597, var12.field4526, -6728, var48);
                                            }
                                            if (var47 != null) {
                                                int var49 = var47.method722();
                                                int var50 = var47.method714();
                                                int var51 = 255 - (var16 & 0xFF) << 24 | (var12.field4562 == 0 ? 16777215 : var12.field4562 & 0xFFFFFF);
                                                if (var12.field4587) {
                                                    class379.field5558.method993(var14, var15, var14 + var12.field4543, var12.field4620 + var15);
                                                    if (var12.field4599 != 0) {
                                                        int var52 = (var49 + var12.field4543 - 1) / var49;
                                                        int var53 = (var12.field4620 - (1 - var50)) / var50;
                                                        for (int var54 = 0; var54 < var52; var54++) {
                                                            for (int var55 = 0; var55 < var53; var55++) {
                                                                if (var12.field4562 == 0) {
                                                                    var47.method716((float) var49 / 2.0F + (float) (var14 + (var49 * var54)), (float) var50 / 2.0F + (float) (var15 - -(var50 * var55)), 4096, var12.field4599);
                                                                } else {
                                                                    var47.method711((float) var49 / 2.0F + (float) (var14 + (var49 * var54)), (float) var50 / 2.0F + (float) (var50 * var55 + var15), 4096, var12.field4599, 0, var51, 1);
                                                                }
                                                            }
                                                        }
                                                    } else if (var12.field4562 == 0 && var16 == 0) {
                                                        var47.method717(var14, var15, var12.field4543, var12.field4620);
                                                    } else {
                                                        var47.method710(var14, var15, var12.field4543, var12.field4620, 0, var51, 1);
                                                    }
                                                    class379.field5558.method1022(arg8, arg0, arg1, arg6);
                                                } else if (var12.field4562 == 0 && var16 == 0) {
                                                    if (var12.field4599 != 0) {
                                                        var47.method716((float) var12.field4543 / 2.0F + (float) var14, (float) var12.field4620 / 2.0F + (float) var15, var12.field4543 * 4096 / var49, var12.field4599);
                                                    } else if (var12.field4543 == var49 && var12.field4620 == var50) {
                                                        var47.method723(var14, var15);
                                                    } else {
                                                        var47.method715(var14, var15, var12.field4543, var12.field4620);
                                                    }
                                                } else if (var12.field4599 != 0) {
                                                    var47.method711((float) var12.field4543 / 2.0F + (float) var14, (float) var12.field4620 / 2.0F + (float) var15, var12.field4543 * 4096 / var49, var12.field4599, 0, var51, 1);
                                                } else if (var12.field4543 == var49 && var12.field4620 == var50) {
                                                    var47.method237(var14, var15, 0, var51, 1);
                                                } else {
                                                    var47.method234(var14, var15, var12.field4543, var12.field4620, 0, var51, 1);
                                                }
                                            } else if (class394.field5727) {
                                                class619.method3586(51, var12);
                                            }
                                        }
                                    } else if (var12.field4655 == 6) {
                                        class425.method2514((byte) 99);
                                        class520 var56 = null;
                                        int var57 = 0;
                                        if (var12.field4661 != -1) {
                                            class414 var65 = class216.field3204.method3357(var12.field4661, (byte) -67);
                                            if (var65 != null) {
                                                class414 var66 = var65.method2470(-1, var12.field4527);
                                                class224 var67 = var12.field4628 == -1 ? null : class470.field7205.method3498(false, var12.field4628);
                                                class170 var68 = var12.field4615 ? class239.field3493.field2711 : null;
                                                var56 = var66.method2466(var12.field4542, var68, 0, var12.field4613, var12.field4516, 2048, 1, var67, class379.field5558);
                                                if (var56 == null) {
                                                    class619.method3586(65, var12);
                                                } else {
                                                    var57 = -var56.method1954() >> 1;
                                                }
                                            }
                                        } else if (var12.field4535 == 5) {
                                            int var62 = var12.field4650;
                                            if (var62 >= 0 && var62 < 2048) {
                                                class179 var63 = class383.field5604[var62];
                                                class224 var64 = var12.field4628 == -1 ? null : class470.field7205.method3498(false, var12.field4628);
                                                if (var63 != null && (class404.field5807 == var62 || class245.method1571(var63.field2718, (byte) -104) == var12.field4624)) {
                                                    var56 = var63.field2711.method1086(0, null, var12.field4516, var64, -1, class470.field7205, class406.field5823, class216.field3204, 0, class345.field5023, true, class42.field507, true, null, var12.field4613, class379.field5558, 2048, var12.field4542, class369.field5329);
                                                }
                                            }
                                        } else if (var12.field4535 == 8 || var12.field4535 == 9) {
                                            class580 var59 = method3419(-14473, false, var12.field4650);
                                            class224 var60 = var12.field4628 == -1 ? null : class470.field7205.method3498(false, var12.field4628);
                                            if (var59 != null) {
                                                class170 var61 = var12.field4615 ? class239.field3493.field2711 : null;
                                                var56 = var59.method3392(var12.field4542, var12.field4613, var61, class379.field5558, 2048, 15013, var12.field4516, var12.field4624, var60, var12.field4535 == 9);
                                            }
                                        } else if (var12.field4628 == -1) {
                                            var56 = var12.method1916(class369.field5329, 0, class406.field5823, class239.field3493.field2711, (byte) -72, class470.field7205, null, 2048, class42.field507, -1, -1, class216.field3204, class345.field5023, class379.field5558);
                                            if (var56 == null && class394.field5727) {
                                                class619.method3586(126, var12);
                                            }
                                        } else {
                                            class224 var58 = class470.field7205.method3498(false, var12.field4628);
                                            var56 = var12.method1916(class369.field5329, var12.field4542, class406.field5823, class239.field3493.field2711, (byte) -72, class470.field7205, var58, 2048, class42.field507, var12.field4516, var12.field4613, class216.field3204, class345.field5023, class379.field5558);
                                            if (var56 == null && class394.field5727) {
                                                class619.method3586(27, var12);
                                            }
                                        }
                                        if (var56 != null) {
                                            int var69;
                                            if (var12.field4612 > 0) {
                                                var69 = (var12.field4543 << 9) / var12.field4612;
                                            } else {
                                                var69 = 512;
                                            }
                                            int var70;
                                            if (var12.field4646 > 0) {
                                                var70 = (var12.field4620 << 9) / var12.field4646;
                                            } else {
                                                var70 = 512;
                                            }
                                            int var71 = var12.field4543 / 2 + (var14 + (var12.field4640 * var69 >> 9));
                                            int var72 = var12.field4620 / 2 + (var12.field4664 * var70 >> 9) + var15;
                                            class385.field5628.method620();
                                            class379.field5558.method999(class385.field5628);
                                            class379.field5558.method1016(var71, var72, var69, var70);
                                            class379.field5558.method1009((float) (var12.field4603 << 0), var12.field4552 ? (float) (var12.field4604 << 0) : (float) (var12.field4604 << 0) * 1.5F);
                                            if (arg7 == -1412584499 || class385.field5638) {
                                                class379.field5558.method985();
                                                class379.field5558.method322();
                                                class379.field5558.method1022(arg8, arg0, arg1, arg6);
                                                class385.field5638 = false;
                                            }
                                            if (var12.field4578) {
                                                class379.field5558.method992(false);
                                            }
                                            int var73 = (var12.field4643 << 0) * class14.field129[var12.field4528 << 3] >> 15;
                                            int var74 = (var12.field4643 << 0) * class14.field130[var12.field4528 << 3] >> 15;
                                            class237.field3470.method604(-var12.field4605 << 3);
                                            class237.field3470.method616(var12.field4594 << 3);
                                            class237.field3470.method619(var12.field4564 << 0, (var12.field4537 << 0) + var73 + var57, (var12.field4537 << 0) + var74);
                                            class237.field3470.method611(var12.field4528 << 3);
                                            if (class509.field7571) {
                                                class379.field5558.method993(var14, var15, var12.field4543 + var14, var12.field4620 + var15);
                                            }
                                            if (var12.field4552) {
                                                var56.method1975(class237.field3470, null, var12.field4643 << 0, 1);
                                            } else {
                                                var56.method1965(class237.field3470, null, 1);
                                            }
                                            if (class509.field7571) {
                                                class379.field5558.method1022(arg8, arg0, arg1, arg6);
                                            }
                                            if (var12.field4578) {
                                                class379.field5558.method992(true);
                                            }
                                            class379.field5558.method1009(0.0F, 0.0F);
                                        }
                                    } else if (var12.field4655 == 9) {
                                        int var75;
                                        int var76;
                                        int var77;
                                        int var78;
                                        if (var12.field4519) {
                                            var75 = var12.field4543 + var14;
                                            var76 = var14;
                                            var77 = var12.field4620 + var15;
                                            var78 = var15;
                                        } else {
                                            var78 = var12.field4620 + var15;
                                            var75 = var12.field4543 + var14;
                                            var76 = var14;
                                            var77 = var15;
                                        }
                                        if (var12.field4584 == 1) {
                                            class379.field5558.method983(var76, var77, var75, var78, var12.field4562, 0);
                                        } else {
                                            class379.field5558.method997(var76, var77, var75, var78, var12.field4562, var12.field4584, 0);
                                        }
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

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(BIIIII)V")
    public class585(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8695 = arg0;
        this.field8700 = arg5;
        this.field8694 = arg3;
        this.field8703 = arg2;
        this.field8693 = arg1;
        this.field8692 = arg4;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZI)Lcv;")
    public static final class580 method3419(int arg0, boolean arg1, int arg2) {
        if (arg0 == -14473) {
            field8688++;
            long var3 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg2);
            return (class580) class143.field1860.method1333(var3, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
    public static final void method3420(int arg0, int arg1, int arg2) {
        field8690++;
        class621 var3 = class442.method2691(arg2, 7, true);
        var3.method3592((byte) 110);
        if (arg0 != 16777215) {
            field8689 = null;
        }
        var3.field9068 = arg1;
    }
}
