import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class190 extends class147 {

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "I")
    public static int field2603 = 0;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "[I")
    public static int[] field2598 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!hq", name = "w", descriptor = "F")
    public float field2604;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "I")
    public int field2601;

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "I")
    public int field2602;

    @OriginalMember(owner = "client!hq", name = "x", descriptor = "I")
    public int field2605;

    @OriginalMember(owner = "client!hq", name = "y", descriptor = "I")
    public int field2606;

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "I")
    public int field2607;

    @OriginalMember(owner = "client!hq", name = "A", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "Lrg;")
    public static class395 field2597;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "[Z")
    public static boolean[] field2599;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)V", line = 6)
    public static final void method1037(byte arg0, int arg1) {
        field2596++;
        if (class196.field2695 == arg1) {
            return;
        }
        class159.field1895 = class289.field4316 = class34.field417[arg1];
        class231.field3205.method1422(50, (int) ((double) class159.field1895 * 34.46D));
        class299.field4462 = new int[class159.field1895][class289.field4316];
        class79.field952 = new int[4][class159.field1895 >> 3][class289.field4316 >> 3];
        class417.field6014 = new int[class159.field1895][class289.field4316];
        for (int var2 = 0; var2 < 4; var2++) {
            class174.field2093[var2] = class142.method674(true, class159.field1895, class289.field4316);
        }
        class276.field3945 = new byte[4][class159.field1895][class289.field4316];
        class437.method2597(4, class159.field1895, class289.field4316, (byte) 27);
        class216.method1206(class289.field4316 >> 3, class159.field1895 >> 3, class231.field3205, true);
        int var3 = -82 / ((-arg0 - 44) / 63);
        class196.field2695 = arg1;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II[Lab;IIIIIII)V", line = 41)
    public static final void method1038(int arg0, int arg1, class256[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 != 2048) {
            field2599 = null;
        }
        field2600++;
        class231.field3205.method1351(arg8, arg1, arg5, arg6);
        for (int var10 = 0; var10 < arg2.length; var10++) {
            class256 var11 = arg2[var10];
            if (var11 != null && (var11.field3646 == arg9 || arg9 == -1412584499 && class484.field6868 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class18.field235[class358.field5172].setBounds(var11.field3703 + arg7, var11.field3576 - -arg4, var11.field3597, var11.field3707);
                    var12 = class358.field5172++;
                } else {
                    var12 = arg3;
                }
                var11.field3594 = var12;
                var11.field3559 = class204.field2796;
                if (!client.method1675(var11)) {
                    if (var11.field3591 != 0) {
                        class414.method2455(var11, 2485);
                    }
                    int var13 = var11.field3703 + arg7;
                    int var14 = var11.field3576 + arg4;
                    int var15 = var11.field3644;
                    if (class192.field2640 && (client.method1660(var11).field4087 != 0 || var11.field3654 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class484.field6868 == var11) {
                        if (arg9 != -1412584499 && (class110.field1316 == var11.field3581 || class44.field567 == var11.field3581)) {
                            class215.field2968 = arg2;
                            class480.field6790 = arg4;
                            class285.field4221 = arg7;
                            continue;
                        }
                        if (class157.field1873 && class105.field1271) {
                            int var16 = class278.field3966.method837(arg0 - 2049);
                            int var17 = class278.field3966.method838(123);
                            int var18 = var17 - class318.field4635;
                            int var19 = var16 - class101.field1231;
                            if (class404.field5750 > var19) {
                                var19 = class404.field5750;
                            }
                            if (class404.field5750 + class487.field6916.field3597 < var11.field3597 + var19) {
                                var19 = class404.field5750 + class487.field6916.field3597 - var11.field3597;
                            }
                            if (class297.field4435 > var18) {
                                var18 = class297.field4435;
                            }
                            var13 = var19;
                            if ((var11.field3707 + var18) > (class297.field4435 + class487.field6916.field3707)) {
                                var18 = class297.field4435 + class487.field6916.field3707 - var11.field3707;
                            }
                            var14 = var18;
                        }
                        if (class44.field567 == var11.field3581) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field3654 == 2) {
                        var20 = arg6;
                        var21 = arg1;
                        var22 = arg8;
                        var23 = arg5;
                    } else {
                        int var24 = var13 + var11.field3597;
                        int var25 = var11.field3707 + var14;
                        var21 = arg1 >= var14 ? arg1 : var14;
                        if (var11.field3654 == 9) {
                            var25++;
                            var24++;
                        }
                        var22 = arg8 < var13 ? var13 : arg8;
                        var20 = arg6 <= var25 ? arg6 : var25;
                        var23 = var24 < arg5 ? var24 : arg5;
                    }
                    if (var23 > var22 && var21 < var20) {
                        if (var11.field3591 != 0) {
                            if (class437.field6276 == var11.field3591 || class305.field4502 == var11.field3591) {
                                class340.method2067(class305.field4502 == var11.field3591, var11.field3597, arg0 - 27576, var13, var11.field3707, var14);
                                class61.field764[var12] = true;
                                class231.field3205.method1351(arg8, arg1, arg5, arg6);
                                continue;
                            }
                            if (class263.field3803 == var11.field3591) {
                                if (var11.method1576(class231.field3205, 18785) != null) {
                                    class199.method1094((byte) -47);
                                    class87.method442(var11, class231.field3205, var14, var13, true);
                                    class217.field2994[var12] = true;
                                    class231.field3205.method1351(arg8, arg1, arg5, arg6);
                                }
                                continue;
                            }
                            if (class187.field2523 == var11.field3591) {
                                if (var11.method1576(class231.field3205, arg0 + 16737) != null) {
                                    class346.method2097(var11, 0, var14, var13);
                                    class217.field2994[var12] = true;
                                    class231.field3205.method1351(arg8, arg1, arg5, arg6);
                                }
                                continue;
                            }
                            if (class21.field293 == var11.field3591) {
                                class224.method1235(var14, var11.field3597, class314.field4583, class231.field3205, var11.field3707, var13, (byte) 48);
                                class61.field764[var12] = true;
                                class231.field3205.method1351(arg8, arg1, arg5, arg6);
                                continue;
                            }
                            if (class196.field2679 == var11.field3591) {
                                class217.method1219(var11.field3597, var14, class231.field3205, var13, var11.field3707, arg0 ^ 0x800);
                                class61.field764[var12] = true;
                                class231.field3205.method1351(arg8, arg1, arg5, arg6);
                                continue;
                            }
                            if (class440.field6303 == var11.field3591) {
                                if (!class327.field4709 && !class46.field595) {
                                    continue;
                                }
                                int var26 = var11.field3597 + var13;
                                int var27 = var14 + 15;
                                if (class327.field4709) {
                                    class273.field3875.method1125("Fps:" + class354.field5086, var26, -1, -256, var27, (byte) -83);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (var29 > 65536) {
                                        var30 = -65536;
                                    }
                                    class273.field3875.method1125("Mem:" + var29 + "k", var26, -1, var30, var27, (byte) -83);
                                    var27 += 15;
                                    class273.field3875.method1125("In:" + class217.field3042 + "B/s Out:" + class146.field1765 + "B/s", var26, -1, -256, var27, (byte) -83);
                                    var27 += 15;
                                    int var31 = class231.field3205.method1409() / 1024;
                                    class273.field3875.method1125("Offheap:" + var31 + "k", var26, -1, ~var31 >= -65537 ? -256 : -65536, var27, (byte) -83);
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < 29; var35++) {
                                        var32 += class442.field6315[var35].method2847((byte) 1);
                                        var33 += class442.field6315[var35].method2852(0);
                                        var34 += class442.field6315[var35].method2851(arg0 + 18704);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class328.method1991(false, (long) var37, 2, true, 0) + "% (" + var36 + "%)";
                                    class304.field4500.method1125(var38, var26, -1, -256, var27, (byte) -83);
                                    var27 += 12;
                                }
                                if (class480.field6794 > 0) {
                                    class304.field4500.method1125("Particles: " + class318.field4632 + " / " + class480.field6794, var26, -1, -256, var27, (byte) -83);
                                }
                                var27 += 12;
                                if (class46.field595) {
                                    class304.field4500.method1125("Polys: " + class231.field3205.method1431() + " Models: " + class231.field3205.method1462(), var26, -1, -256, var27, (byte) -83);
                                    var27 += 12;
                                    class304.field4500.method1125("Ls: " + class100.field1218 + " La: " + class137.field1662 + " NPC: " + class61.field765 + " Pl: " + class145.field1742, var26, -1, -256, var27, (byte) -83);
                                    var27 += 12;
                                    class362.method2202(0);
                                }
                                class61.field764[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field3654 == 0) {
                            if (class251.field3528 == var11.field3591 && class231.field3205.method1373()) {
                                class231.field3205.method1488(var13, var14, var11.field3597, var11.field3707);
                            }
                            method1038(2048, var21, arg2, var12, var14 - var11.field3658, var23, var20, var13 - var11.field3638, var22, var11.field3659);
                            if (var11.field3643 != null) {
                                method1038(2048, var21, var11.field3643, var12, var14 - var11.field3658, var23, var20, var13 - var11.field3638, var22, var11.field3659);
                            }
                            class68 var39 = (class68) class369.field5270.method233(110, (long) var11.field3659);
                            if (var39 != null) {
                                class154.method745(var20, var13, var21, var39.field850, var22, var14, (byte) 123, var12, var23);
                            }
                            if (class251.field3528 == var11.field3591 && class231.field3205.method1373()) {
                                class231.field3205.method1450();
                                class231.field3208 = true;
                            }
                            class231.field3205.method1351(arg8, arg1, arg5, arg6);
                        }
                        if (class412.field5866[var12] || class17.field216 > 1) {
                            if (var11.field3654 == 3) {
                                if (var15 == 0) {
                                    if (var11.field3626) {
                                        class231.field3205.method1483(var13, var14, var11.field3597, var11.field3707, var11.field3679, 0);
                                    } else {
                                        class231.field3205.method1459(var13, var14, var11.field3597, var11.field3707, var11.field3679, 0);
                                    }
                                } else if (var11.field3626) {
                                    class231.field3205.method1483(var13, var14, var11.field3597, var11.field3707, var11.field3679 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                } else {
                                    class231.field3205.method1459(var13, var14, var11.field3597, var11.field3707, 255 - (var15 & 0xFF) << 24 | var11.field3679 & 0xFFFFFF, 1);
                                }
                            } else if (var11.field3654 == 4) {
                                class206 var40 = var11.method1581(-1, class231.field3205);
                                if (var40 != null) {
                                    int var41 = var11.field3679;
                                    String var42 = var11.field3663;
                                    if (var11.field3585 != -1) {
                                        class385 var43 = class422.field6096.method121(var11.field3585, -1);
                                        var42 = var43.field5469;
                                        if (var42 == null) {
                                            var42 = "null";
                                        }
                                        if ((var43.field5536 == 1 || var11.field3655 != 1) && var11.field3655 != -1) {
                                            var42 = "<col=ff9040>" + var42 + "</col> x" + class13.method100(var11.field3655, -58);
                                        }
                                    }
                                    if (class345.field4934 == var11) {
                                        var42 = class404.field5744.method205((byte) 105, class68.field849);
                                        var41 = var11.field3679;
                                    }
                                    if (class223.field3096) {
                                        class231.field3205.method1340(var13, var14, var13 + var11.field3597, var11.field3707 + var14);
                                    }
                                    var40.method1139(var11.field3666, (class313) null, var14, (int[]) null, var11.field3625, 0, var11.field3597, 0, 0, class83.field1014, var13, var42, var11.field3618 ? 255 - (var15 & 0xFF) << 24 : -1, var11.field3564, var11.field3707, 255 - (var15 & 0xFF) << 24 | var41);
                                    if (class223.field3096) {
                                        class231.field3205.method1351(arg8, arg1, arg5, arg6);
                                    }
                                } else if (class180.field2294) {
                                    class398.method2383(var11, 64);
                                }
                            } else if (var11.field3654 == 5) {
                                if (var11.field3640 >= 0) {
                                    var11.method1573(class459.field6482, -138675032, class128.field1576).method1042(var11.field3672 << 3, var11.field3707, 0, var13, var11.field3597, class231.field3205, 0, var11.field3635 << 3, 0, var14);
                                } else {
                                    class395 var44;
                                    if (var11.field3585 == -1) {
                                        var44 = var11.method1577(87, class231.field3205);
                                    } else {
                                        class448 var45 = var11.field3616 ? class19.field258.field2722 : null;
                                        var44 = class422.field6096.method115(var11.field3655, var11.field3585, -75, var11.field3615, var45, var11.field3694, class231.field3205, var11.field3701 | 0xFF000000);
                                    }
                                    if (var44 != null) {
                                        int var46 = var44.method216();
                                        int var47 = var44.method222();
                                        if (var11.field3704) {
                                            class231.field3205.method1340(var13, var14, var11.field3597 + var13, var11.field3707 + var14);
                                            if (var11.field3673 != 0) {
                                                int var49 = (-(-var46 - var11.field3597) - 1) / var46;
                                                int var50 = (var47 + var11.field3707 - 1) / var47;
                                                for (int var51 = 0; var51 < var49; var51++) {
                                                    for (int var52 = 0; var52 < var50; var52++) {
                                                        var44.method2366((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field3673);
                                                    }
                                                }
                                            } else if (var15 == 0) {
                                                var44.method215(var13, var14, var11.field3597, var11.field3707, 0, 0, 1);
                                            } else {
                                                var44.method215(var13, var14, var11.field3597, var11.field3707, 1, 255 - (var15 & 0xFF) << 24 | 0xFFFFFF, 1);
                                            }
                                            class231.field3205.method1351(arg8, arg1, arg5, arg6);
                                        } else if (var15 != 0) {
                                            int var48 = 255 - (var15 & 0xFF) << 24 | 0xFFFFFF;
                                            if (var11.field3673 != 0) {
                                                var44.method2362((float) var11.field3597 / 2.0F + (float) var13, (float) var11.field3707 / 2.0F + (float) var14, var11.field3597 * 4096 / var46, var11.field3673, 1, var48, 1);
                                            } else if (var11.field3597 == var46 && var11.field3707 == var47) {
                                                var44.method214(var13, var14, 1, var48, 1);
                                            } else {
                                                var44.method225(var13, var14, var11.field3597, var11.field3707, 1, var48, 1);
                                            }
                                        } else if (var11.field3673 != 0) {
                                            var44.method2366((float) var11.field3597 / 2.0F + (float) var13, (float) var11.field3707 / 2.0F + (float) var14, var11.field3597 * 4096 / var46, var11.field3673);
                                        } else if (var11.field3597 == var46 && var11.field3707 == var47) {
                                            var44.method2363(var13, var14);
                                        } else {
                                            var44.method2364(var13, var14, var11.field3597, var11.field3707);
                                        }
                                    } else if (class180.field2294) {
                                        class398.method2383(var11, arg0 ^ 0x866);
                                    }
                                }
                            } else if (var11.field3654 == 6) {
                                class404.method2415((byte) -128);
                                class352 var53 = null;
                                int var54 = 0;
                                if (var11.field3585 != -1) {
                                    class385 var55 = class422.field6096.method121(var11.field3585, -1);
                                    if (var55 != null) {
                                        class385 var56 = var55.method2316((byte) -54, var11.field3655);
                                        class207 var57 = var11.field3572 == -1 ? null : class175.field2103.method1267(arg0 - 2085, var11.field3572);
                                        class448 var58 = var11.field3616 ? class19.field258.field2722 : null;
                                        var53 = var56.method2324(var11.field3637, 1024, var57, var58, var11.field3696, 1, -125, var11.field3639, class231.field3205);
                                        if (var53 == null) {
                                            class398.method2383(var11, 11);
                                        } else {
                                            var54 = -var53.method1733() / 2;
                                        }
                                    }
                                } else if (var11.field3596 == 5) {
                                    int var59 = var11.field3674;
                                    if (var59 >= 0 && var59 < 2048) {
                                        class198 var60 = class46.field596[var59];
                                        class207 var61 = var11.field3572 == -1 ? null : class175.field2103.method1267(-57, var11.field3572);
                                        if (var60 != null && (class61.field760 == var59 || class288.method1821(4189, var60.field2736) == var11.field3610)) {
                                            var53 = var60.field2722.method2630((class207) null, class415.field6001, 0, true, class19.field254, class231.field3205, 1024, 0, var11.field3637, (class178[]) null, -1, class422.field6096, var11.field3696, arg0 ^ 0xFFFFE926, class175.field2103, var61, var11.field3639, class75.field909, class390.field5575);
                                        }
                                    }
                                } else if (var11.field3596 == 8 || var11.field3596 == 9) {
                                    class458 var63 = class230.method1272((byte) -127, false, var11.field3674);
                                    class207 var64 = var11.field3572 == -1 ? null : class175.field2103.method1267(-49, var11.field3572);
                                    if (var63 != null) {
                                        class448 var65 = var11.field3616 ? class19.field258.field2722 : null;
                                        var53 = var63.method2698(class231.field3205, -1, var11.field3596 == 9, var11.field3696, var11.field3610, var64, var11.field3639, var11.field3637, 1024, var65);
                                    }
                                } else if (var11.field3572 == -1) {
                                    var53 = var11.method1580(class19.field254, class422.field6096, 0, -1, class75.field909, -1, class175.field2103, true, class390.field5575, class231.field3205, class415.field6001, 1024, class19.field258.field2722, (class207) null);
                                    if (var53 == null && class180.field2294) {
                                        class398.method2383(var11, arg0 ^ 0x863);
                                    }
                                } else {
                                    class207 var62 = class175.field2103.method1267(-65, var11.field3572);
                                    var53 = var11.method1580(class19.field254, class422.field6096, var11.field3696, var11.field3639, class75.field909, var11.field3637, class175.field2103, true, class390.field5575, class231.field3205, class415.field6001, 1024, class19.field258.field2722, var62);
                                    if (var53 == null && class180.field2294) {
                                        class398.method2383(var11, 11);
                                    }
                                }
                                if (var53 != null) {
                                    int var66;
                                    if (var11.field3614 <= 0) {
                                        var66 = 512;
                                    } else {
                                        var66 = (var11.field3597 << 9) / var11.field3614;
                                    }
                                    int var67;
                                    if (var11.field3667 > 0) {
                                        var67 = (var11.field3707 << 9) / var11.field3667;
                                    } else {
                                        var67 = 512;
                                    }
                                    int var68 = (var11.field3647 * var66 >> 9) + var11.field3597 / 2 + var13;
                                    int var69 = (var11.field3691 * var67 >> 9) + var11.field3707 / 2 + var14;
                                    class29.field379.method561();
                                    class231.field3205.method1404(class29.field379);
                                    int var70 = class16.field212[var11.field3567 << 3] * var11.field3607 >> 15;
                                    int var71 = class16.field214[var11.field3567 << 3] * var11.field3607 >> 15;
                                    class231.field3205.method1468(var68, var69, var66, var67);
                                    class231.field3205.method1498((float) var11.field3651, var11.field3677 ? (float) var11.field3693 : (float) var11.field3693 * 1.5F);
                                    if (arg9 == -1412584499 || class231.field3208) {
                                        class231.field3205.method1352();
                                        class231.field3205.method1341();
                                        class231.field3205.method1351(arg8, arg1, arg5, arg6);
                                        class231.field3208 = false;
                                    }
                                    if (var11.field3619) {
                                        class231.field3205.method1376(false);
                                    }
                                    class181.field2327.method555(-var11.field3675 << 3);
                                    class181.field2327.method554(var11.field3681 << 3);
                                    class181.field2327.method550(var11.field3587, var11.field3710 + var70 + var54, var11.field3710 + var71);
                                    class181.field2327.method552(var11.field3567 << 3);
                                    if (class223.field3096) {
                                        class231.field3205.method1340(var13, var14, var11.field3597 + var13, var11.field3707 + var14);
                                    }
                                    if (var11.field3677) {
                                        var53.method1713(class181.field2327, (class465) null, var11.field3607, 1);
                                    } else {
                                        var53.method1716(class181.field2327, (class465) null, 1);
                                    }
                                    if (class223.field3096) {
                                        class231.field3205.method1351(arg8, arg1, arg5, arg6);
                                    }
                                    if (var11.field3619) {
                                        class231.field3205.method1376(true);
                                    }
                                }
                            } else if (var11.field3654 == 9) {
                                int var72;
                                int var73;
                                int var74;
                                int var75;
                                if (var11.field3668) {
                                    var73 = var11.field3707 + var14;
                                    var75 = var11.field3597 + var13;
                                    var74 = var14;
                                    var72 = var13;
                                } else {
                                    var72 = var13;
                                    var73 = var14;
                                    var74 = var11.field3707 + var14;
                                    var75 = var11.field3597 + var13;
                                }
                                if (var11.field3584 == 1) {
                                    class231.field3205.method1392(var72, var73, var75, var74, var11.field3679, 0);
                                } else {
                                    class231.field3205.method1375(var72, var73, var75, var74, var11.field3679, var11.field3584, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BZIZI)V", line = 695)
    public static final void method1039(byte arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        class135.method641(arg4, 119, arg2, arg1, arg3, 0, class28.field368.length - 1);
        field2608++;
        class346.field4947 = null;
        class76.field916 = 0;
        if (arg0 <= 111) {
            field2603 = 126;
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(Z)V", line = 712)
    public static void method1040(boolean arg0) {
        field2598 = null;
        if (!arg0) {
            field2599 = null;
            field2597 = null;
        }
    }
}
