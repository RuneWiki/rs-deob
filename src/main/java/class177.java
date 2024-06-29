import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class177 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Lok;")
    public static class146 field2995 = class235.method1724(-12908, "um");

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Lhd;")
    public static class117 field3000 = new class117(4);

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Z")
    public static boolean field3003 = false;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field3004 = 0;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "[I")
    public static int[] field3005 = new int[5];

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2999;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "[I")
    public static int[] field3002;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method1403(boolean arg0) {
        class57.method451(false, -84);
        field3001++;
        System.gc();
        if (!arg0) {
            method1406(7, 115, 70, -100, -118, 109, -66, 44, (class264[]) null, 74);
        }
        class1.method4(-41, 25);
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V", line = 25)
    public class177() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILwe;[B)V", line = 36)
    public final void method1404(int arg0, class47 arg1, byte[] arg2) {
        field2996++;
        if (arg1.field860[arg1.field857] != 31 || arg1.field860[arg1.field857 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (arg0 >= -10) {
            field2995 = (class146) null;
        }
        if (this.field2999 == null) {
            this.field2999 = new Inflater(true);
        }
        try {
            this.field2999.setInput(arg1.field860, arg1.field857 + 10, -arg1.field857 + -10 + arg1.field860.length + -8);
            this.field2999.inflate(arg2);
        } catch (Exception var5) {
            this.field2999.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2999.reset();
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 67)
    public static void method1405(int arg0) {
        field3002 = null;
        if (arg0 == 23326) {
            field3005 = null;
            field3000 = null;
            field2995 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIII[Lr;I)V", line = 93)
    public static final void method1406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class264[] arg8, int arg9) {
        if (class271.field4640) {
            class131.method973(arg2, arg5, arg4, arg7);
        } else {
            class181.method1420(arg2, arg5, arg4, arg7);
            class109.method734();
        }
        field2998++;
        if (arg6 != 22) {
            method1405(18);
        }
        for (int var10 = 0; var10 < arg8.length; var10++) {
            class264 var11 = arg8[var10];
            if (var11 != null && (var11.field4497 == arg0 || arg0 == -1412584499 && class213.field3521 == var11)) {
                int var12;
                if (arg9 == -1) {
                    class175.field2922[class227.field3783] = var11.field4434 + arg3;
                    class298.field5068[class227.field3783] = var11.field4424 + arg1;
                    class91.field1442[class227.field3783] = var11.field4393;
                    class52.field952[class227.field3783] = var11.field4381;
                    var12 = class227.field3783++;
                } else {
                    var12 = arg9;
                }
                var11.field4505 = class203.field3385;
                var11.field4388 = var12;
                if (!var11.field4462 || !client.method1795(var11)) {
                    if (var11.field4470 > 0) {
                        class140.method1025(0, var11);
                    }
                    int var13 = var11.field4424 + arg1;
                    int var14 = var11.field4483;
                    int var15 = var11.field4434 + arg3;
                    if (class128.field2096 && (client.method1789(var11) != 0 || var11.field4536 == 0) && var14 > 127) {
                        var14 = 127;
                    }
                    if (class213.field3521 == var11) {
                        if (arg0 != -1412584499 && !var11.field4401) {
                            class260.field4326 = arg8;
                            class107.field1736 = arg3;
                            class295.field5006 = arg1;
                            continue;
                        }
                        if (class195.field3246 && class88.field1398) {
                            int var16 = class232.field3875;
                            int var17 = var16 - class248.field4146;
                            int var18 = class316.field5368;
                            if (class267.field4602 > var17) {
                                var17 = class267.field4602;
                            }
                            int var19 = var18 - class218.field3608;
                            if (var19 < class302.field5162) {
                                var19 = class302.field5162;
                            }
                            if (class302.field5162 + class33.field636.field4381 < var11.field4381 + var19) {
                                var19 = class302.field5162 + class33.field636.field4381 - var11.field4381;
                            }
                            var13 = var19;
                            if ((class267.field4602 + class33.field636.field4393) < (var17 + var11.field4393)) {
                                var17 = class267.field4602 + class33.field636.field4393 - var11.field4393;
                            }
                            var15 = var17;
                        }
                        if (!var11.field4401) {
                            var14 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field4536 == 2) {
                        var20 = arg4;
                        var21 = arg7;
                        var22 = arg2;
                        var23 = arg5;
                    } else {
                        var23 = var13 > arg5 ? var13 : arg5;
                        int var24 = var15 + var11.field4393;
                        var22 = var15 <= arg2 ? arg2 : var15;
                        int var25 = var11.field4381 + var13;
                        if (var11.field4536 == 9) {
                            var24++;
                            var25++;
                        }
                        var20 = var24 >= arg4 ? arg4 : var24;
                        var21 = arg7 <= var25 ? arg7 : var25;
                    }
                    if (!var11.field4462 || var20 > var22 && var23 < var21) {
                        if (var11.field4470 != 0) {
                            if (var11.field4470 == 1337 || var11.field4470 == 1403 && class271.field4640) {
                                class190.field3141 = var15;
                                class207.field3452 = var11;
                                class25.field437 = var13;
                                class179.method1408(var15, (byte) 43, var11.field4381, var11.field4470 == 1403, var11.field4393, var13);
                                if (class271.field4640) {
                                    class131.method973(arg2, arg5, arg4, arg7);
                                } else {
                                    class181.method1420(arg2, arg5, arg4, arg7);
                                }
                                continue;
                            }
                            if (var11.field4470 == 1338) {
                                if (!var11.method1918(arg6 ^ 0x16)) {
                                    continue;
                                }
                                class249.method1821(var13, 3, var15, var12, var11);
                                if (class271.field4640) {
                                    class131.method973(arg2, arg5, arg4, arg7);
                                } else {
                                    class181.method1420(arg2, arg5, arg4, arg7);
                                }
                                if (class166.field2802 != 0 && class166.field2802 != 3 || class295.field4998 || var22 > class263.field4372 || var23 > class250.field4183 || var20 <= class263.field4372 || var21 <= class250.field4183) {
                                    continue;
                                }
                                int var41 = class263.field4372 - var15;
                                int var42 = class250.field4183 - var13;
                                int var43 = var11.field4451[var42];
                                if (var43 > var41 || var11.field4429[var42] + var43 < var41) {
                                    continue;
                                }
                                int var44 = var42 - var11.field4381 / 2;
                                int var45 = var41 - var11.field4393 / 2;
                                int var46 = class87.field1378 + class158.field2668 & 0x7FF;
                                int var47 = class109.field1750[var46];
                                int var48 = (class238.field3976 + 256) * var47 >> 8;
                                int var49 = class109.field1757[var46];
                                int var50 = (class238.field3976 + 256) * var49 >> 8;
                                int var51 = var44 * var48 + var45 * var50 >> 11;
                                int var52 = class102.field1639.field5409 + var51 >> 7;
                                int var53 = var44 * var50 - (var45 * var48) >> 11;
                                int var54 = class102.field1639.field5380 - var53 >> 7;
                                if (class272.field4668 && (class180.field3023 & 0x40) != 0) {
                                    class264 var55 = class165.method1289(client.field4081, true, class214.field3535);
                                    if (var55 == null) {
                                        class126.method864(113);
                                    } else {
                                        class281.method2039(var54, 1L, (short) 19, arg6 + 12219, -1, var52, class32.field617, class135.field2257);
                                    }
                                    continue;
                                }
                                if (class95.field1530 == 1) {
                                    class281.method2039(var54, 1L, (short) 5, 12241, -1, var52, class161.field2740, class92.field1484);
                                }
                                class281.method2039(var54, 1L, (short) 22, 12241, -1, var52, class161.field2740, class197.field3280);
                                continue;
                            }
                            if (var11.field4470 == 1339) {
                                if (var11.method1918(0)) {
                                    class36.method261(var15, var12, var11, (byte) -60, var13);
                                    if (class271.field4640) {
                                        class131.method973(arg2, arg5, arg4, arg7);
                                    } else {
                                        class181.method1420(arg2, arg5, arg4, arg7);
                                    }
                                }
                                continue;
                            }
                            if (var11.field4470 == 1400) {
                                class143.method1056(var11.field4393, var11.field4381, var15, var13, arg6 + 9303);
                                class14.field264[var12] = true;
                                class269.field4623[var12] = true;
                                if (class271.field4640) {
                                    class131.method973(arg2, arg5, arg4, arg7);
                                } else {
                                    class181.method1420(arg2, arg5, arg4, arg7);
                                }
                                continue;
                            }
                            if (var11.field4470 == 1401) {
                                class237.method1730(19384, var11.field4393, var11.field4381, var15, var13);
                                class14.field264[var12] = true;
                                class269.field4623[var12] = true;
                                if (class271.field4640) {
                                    class131.method973(arg2, arg5, arg4, arg7);
                                } else {
                                    class181.method1420(arg2, arg5, arg4, arg7);
                                }
                                continue;
                            }
                            if (var11.field4470 == 1402) {
                                if (!class271.field4640) {
                                    class275.method2006(var13, false, var15);
                                    class14.field264[var12] = true;
                                    class269.field4623[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field4470 == 1405) {
                                if (!class214.field3526) {
                                    continue;
                                }
                                int var26 = var11.field4393 + var15;
                                int var27 = var13 + 15;
                                class187.field3109.method222(class112.method758(120, new class146[] { class4.field47, class82.method585(14744, client.field4083) }), var26, var27, 16776960, -1);
                                int var141 = var27 + 15;
                                Runtime var28 = Runtime.getRuntime();
                                int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                int var30 = 16776960;
                                if (var29 > 65536) {
                                    var30 = 16711680;
                                }
                                class187.field3109.method222(class112.method758(123, new class146[] { class301.field5111, class82.method585(14744, var29), class180.field3021 }), var26, var141, var30, -1);
                                var27 = var141 + 15;
                                if (class271.field4640) {
                                    int var31 = 16776960;
                                    int var32 = (class68.field1129 + class68.field1128 + class68.field1130) / 1024;
                                    if (var32 > 65536) {
                                        var31 = 16711680;
                                    }
                                    class187.field3109.method222(class112.method758(125, new class146[] { class272.field4666, class82.method585(14744, var32), class180.field3021 }), var26, var27, var31, -1);
                                    var27 += 15;
                                }
                                int var33 = 16776960;
                                int var34 = 0;
                                int var35 = 0;
                                int var36 = 0;
                                for (int var37 = 0; var37 < 28; var37++) {
                                    var34 += class296.field5040[var37].method235((byte) 0);
                                    var35 += class296.field5040[var37].method239(0);
                                    var36 += class296.field5040[var37].method236(false);
                                }
                                int var38 = var36 * 100 / var34;
                                int var39 = var35 * 10000 / var34;
                                class146 var40 = class112.method758(-34, new class146[] { class226.field3777, class157.method1229(2, 0, (byte) -126, true, (long) var39), class199.field3336, class82.method585(14744, var38), class202.field3367 });
                                class274.field4725.method222(var40, var26, var27, var33, -1);
                                class14.field264[var12] = true;
                                class269.field4623[var12] = true;
                                var27 += 12;
                                continue;
                            }
                            if (var11.field4470 == 1406) {
                                class19.field372 = var15;
                                class295.field5004 = var11;
                                class17.field350 = var13;
                                continue;
                            }
                        }
                        if (!class295.field4998) {
                            if (var11.field4536 == 0 && var11.field4499 && class263.field4372 >= var22 && class250.field4183 >= var23 && class263.field4372 < var20 && var21 > class250.field4183 && !class128.field2096) {
                                class224.field3739[0] = 1001;
                                class21.field405[0] = client.field4085;
                                class227.field3782[0] = class187.field3118;
                                class45.field763 = 1;
                                class214.field3525[0] = class161.field2740;
                            }
                            if (class263.field4372 >= var22 && class250.field4183 >= var23 && class263.field4372 < var20 && var21 > class250.field4183) {
                                class303.method2145(class250.field4183 - var13, var11, class263.field4372 - var15, (byte) 26);
                            }
                        }
                        if (var11.field4536 == 0) {
                            if (!var11.field4462 && client.method1795(var11) && class124.field2037 != var11) {
                                continue;
                            }
                            if (!var11.field4462) {
                                if ((var11.field4513 - var11.field4381) < var11.field4377) {
                                    var11.field4377 = var11.field4513 - var11.field4381;
                                }
                                if (var11.field4377 < 0) {
                                    var11.field4377 = 0;
                                }
                            }
                            method1406(var11.field4461, var13 - var11.field4377, var22, var15 - var11.field4430, var20, var23, 22, var21, arg8, var12);
                            if (var11.field4402 != null) {
                                method1406(var11.field4461, var13 - var11.field4377, var22, var15 - var11.field4430, var20, var23, 22, var21, var11.field4402, var12);
                            }
                            class142 var56 = (class142) class135.field2266.method810((byte) -127, (long) var11.field4461);
                            if (var56 != null) {
                                if (var56.field2367 == 0 && !class295.field4998 && var22 <= class263.field4372 && class250.field4183 >= var23 && class263.field4372 < var20 && class250.field4183 < var21 && !class128.field2096) {
                                    class21.field405[0] = client.field4085;
                                    class45.field763 = 1;
                                    class227.field3782[0] = class187.field3118;
                                    class214.field3525[0] = class161.field2740;
                                    class224.field3739[0] = 1001;
                                }
                                class278.method2023(var12, var23, arg6 ^ 0xABCDABDB, var15, var22, var20, var56.field2370, var13, var21);
                            }
                            if (class271.field4640) {
                                class131.method973(arg2, arg5, arg4, arg7);
                            } else {
                                class181.method1420(arg2, arg5, arg4, arg7);
                                class109.method734();
                            }
                        }
                        if (class79.field1270[var12] || class150.field2556 > 1) {
                            if (var11.field4536 == 0 && !var11.field4462 && var11.field4381 < var11.field4513) {
                                class124.method856(var11.field4513, var11.field4377, var13, -18752, var11.field4381, var15 + var11.field4393);
                            }
                            if (var11.field4536 != 1) {
                                if (var11.field4536 == 2) {
                                    int var57 = 0;
                                    for (int var58 = 0; var58 < var11.field4523; var58++) {
                                        for (int var59 = 0; var59 < var11.field4445; var59++) {
                                            int var60 = var13 + ((var11.field4399 + 32) * var58);
                                            int var61 = (var11.field4436 + 32) * var59 + var15;
                                            if (var57 < 20) {
                                                var61 += var11.field4512[var57];
                                                var60 += var11.field4458[var57];
                                            }
                                            if (var11.field4437[var57] > 0) {
                                                boolean var63 = false;
                                                boolean var64 = false;
                                                int var65 = var11.field4437[var57] - 1;
                                                if (arg2 < (var61 + 32) && arg4 > var61 && arg5 < var60 + 32 && arg7 > var60 || class43.field738 == var11 && class296.field5037 == var57) {
                                                    class70 var66;
                                                    if (class161.field2736 == 1 && class281.field4827 == var57 && class283.field4849 == var11.field4461) {
                                                        var66 = class19.method142(var65, var11.field4529, 2, (byte) 15, 0, var11.field4492[var57]);
                                                    } else {
                                                        var66 = class19.method142(var65, var11.field4529, 1, (byte) 15, 3153952, var11.field4492[var57]);
                                                    }
                                                    if (class109.field1754) {
                                                        class14.field264[var12] = true;
                                                    }
                                                    if (var66 == null) {
                                                        class164.method1280(false, var11);
                                                    } else if (class43.field738 == var11 && class296.field5037 == var57) {
                                                        int var67 = class232.field3875 - class237.field3953;
                                                        int var68 = class316.field5368 - class57.field1008;
                                                        if (var67 < 5 && var67 > -5) {
                                                            var67 = 0;
                                                        }
                                                        if (var68 < 5 && var68 > -5) {
                                                            var68 = 0;
                                                        }
                                                        if (class217.field3576 < 5) {
                                                            var68 = 0;
                                                            var67 = 0;
                                                        }
                                                        var66.method53(var61 + var67, var60 + var68, 128);
                                                        if (arg0 != -1) {
                                                            class264 var69 = arg8[arg0 & 0xFFFF];
                                                            int var70;
                                                            int var71;
                                                            if (class271.field4640) {
                                                                var71 = class131.field2221;
                                                                var70 = class131.field2222;
                                                            } else {
                                                                var70 = class181.field3041;
                                                                var71 = class181.field3036;
                                                            }
                                                            if (var71 > var60 + var68 && var69.field4377 > 0) {
                                                                int var72 = (var71 - var60 - var68) * class214.field3534 / 3;
                                                                if (var72 > (class214.field3534 * 10)) {
                                                                    var72 = class214.field3534 * 10;
                                                                }
                                                                if (var72 > var69.field4377) {
                                                                    var72 = var69.field4377;
                                                                }
                                                                var69.field4377 -= var72;
                                                                class57.field1008 += var72;
                                                                class164.method1280(false, var69);
                                                            }
                                                            if (var68 + var60 + 32 > var70 && (var69.field4513 - var69.field4381) > var69.field4377) {
                                                                int var73 = (var68 + var60 + 32 - var70) * class214.field3534 / 3;
                                                                if (var73 > (class214.field3534 * 10)) {
                                                                    var73 = class214.field3534 * 10;
                                                                }
                                                                if (var73 > (var69.field4513 - var69.field4377 - var69.field4381)) {
                                                                    var73 = var69.field4513 - var69.field4381 - var69.field4377;
                                                                }
                                                                class57.field1008 -= var73;
                                                                var69.field4377 += var73;
                                                                class164.method1280(false, var69);
                                                            }
                                                        }
                                                    } else if (class280.field4804 == var11 && class152.field2583 == var57) {
                                                        var66.method53(var61, var60, 128);
                                                    } else {
                                                        var66.method47(var61, var60);
                                                    }
                                                }
                                            } else if (var11.field4506 != null && var57 < 20) {
                                                class70 var62 = var11.method1909((byte) -86, var57);
                                                if (var62 != null) {
                                                    var62.method47(var61, var60);
                                                } else if (class83.field1326) {
                                                    class164.method1280(false, var11);
                                                }
                                            }
                                            var57++;
                                        }
                                    }
                                } else if (var11.field4536 == 3) {
                                    int var74;
                                    if (class79.method565(var11, -12433)) {
                                        var74 = var11.field4379;
                                        if (class124.field2037 == var11 && var11.field4479 != 0) {
                                            var74 = var11.field4479;
                                        }
                                    } else {
                                        var74 = var11.field4442;
                                        if (class124.field2037 == var11 && var11.field4500 != 0) {
                                            var74 = var11.field4500;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var11.field4547) {
                                            if (class271.field4640) {
                                                class131.method978(var15, var13, var11.field4393, var11.field4381, var74);
                                            } else {
                                                class181.method1416(var15, var13, var11.field4393, var11.field4381, var74);
                                            }
                                        } else if (class271.field4640) {
                                            class131.method965(var15, var13, var11.field4393, var11.field4381, var74);
                                        } else {
                                            class181.method1435(var15, var13, var11.field4393, var11.field4381, var74);
                                        }
                                    } else if (var11.field4547) {
                                        if (class271.field4640) {
                                            class131.method974(var15, var13, var11.field4393, var11.field4381, var74, 256 - (var14 & 0xFF));
                                        } else {
                                            class181.method1428(var15, var13, var11.field4393, var11.field4381, var74, 256 - (var14 & 0xFF));
                                        }
                                    } else if (class271.field4640) {
                                        class131.method975(var15, var13, var11.field4393, var11.field4381, var74, 256 - (var14 & 0xFF));
                                    } else {
                                        class181.method1429(var15, var13, var11.field4393, var11.field4381, var74, 256 - (var14 & 0xFF));
                                    }
                                } else if (var11.field4536 == 4) {
                                    class30 var137 = var11.method1919(class102.field1651, arg6 ^ 0x7B);
                                    if (var137 != null) {
                                        class146 var138 = var11.field4453;
                                        int var139;
                                        if (class79.method565(var11, -12433)) {
                                            var139 = var11.field4379;
                                            if (class124.field2037 == var11 && var11.field4479 != 0) {
                                                var139 = var11.field4479;
                                            }
                                            if (var11.field4535.method1094((byte) -6) > 0) {
                                                var138 = var11.field4535;
                                            }
                                        } else {
                                            var139 = var11.field4442;
                                            if (class124.field2037 == var11 && var11.field4500 != 0) {
                                                var139 = var11.field4500;
                                            }
                                        }
                                        if (var11.field4462 && var11.field4394 != -1) {
                                            class248 var140 = class84.method589(false, var11.field4394);
                                            var138 = var140.field4149;
                                            if (var138 == null) {
                                                var138 = class254.field4236;
                                            }
                                            if ((var140.field4118 == 1 || var11.field4447 != 1) && var11.field4447 != -1) {
                                                var138 = class112.method758(120, new class146[] { class145.field2420, var138, class211.field3500, class113.method775(var11.field4447, arg6 - 16) });
                                            }
                                        }
                                        if (class31.field575 == var11) {
                                            var139 = var11.field4442;
                                            var138 = class224.field3738;
                                        }
                                        if (!var11.field4462) {
                                            var138 = class119.method814(var11, var138, 23870);
                                        }
                                        var137.method197(var138, var15, var13, var11.field4393, var11.field4381, var139, var11.field4395 ? 0 : -1, var11.field4375, var11.field4419, var11.field4421);
                                    } else if (class83.field1326) {
                                        class164.method1280(false, var11);
                                    }
                                } else if (var11.field4536 == 5) {
                                    if (var11.field4462) {
                                        class70 var75;
                                        if (var11.field4394 == -1) {
                                            var75 = var11.method1910(true, false);
                                        } else {
                                            var75 = class19.method142(var11.field4394, var11.field4529, var11.field4489, (byte) 15, var11.field4389, var11.field4447);
                                        }
                                        if (var75 != null) {
                                            int var76 = var75.field1144;
                                            int var77 = var75.field1140;
                                            if (var11.field4538) {
                                                int var78 = (var11.field4381 + var77 - 1) / var77;
                                                int var79 = (var76 - (1 - var11.field4393)) / var76;
                                                if (class271.field4640) {
                                                    class131.method964(var15, var13, var11.field4393 + var15, var11.field4381 + var13);
                                                    boolean var80 = class21.method152((byte) -80, var75.field1145);
                                                    class8 var81 = (class8) var75;
                                                    boolean var82 = class21.method152((byte) -117, var75.field1155);
                                                    if (var80 && var82) {
                                                        if (var14 == 0) {
                                                            var81.method54(var15, var13, var79, var78);
                                                        } else {
                                                            var81.method51(var15, var13, 256 - (var14 & 0xFF), var79, var78);
                                                        }
                                                    } else if (var80) {
                                                        for (int var83 = 0; var83 < var78; var83++) {
                                                            if (var14 == 0) {
                                                                var81.method54(var15, var77 * var83 + var13, var79, 1);
                                                            } else {
                                                                var81.method51(var15, var77 * var83 + var13, -(var14 & 0xFF) + 256, var79, 1);
                                                            }
                                                        }
                                                    } else if (var82) {
                                                        for (int var84 = 0; var84 < var79; var84++) {
                                                            if (var14 == 0) {
                                                                var81.method54(var15 + (var76 * var84), var13, 1, var78);
                                                            } else {
                                                                var81.method51(var76 * var84 + var15, var13, 256 - (var14 & 0xFF), 1, var78);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var85 = 0; var85 < var79; var85++) {
                                                            for (int var86 = 0; var86 < var78; var86++) {
                                                                if (var14 == 0) {
                                                                    var75.method47(var76 * var85 + var15, var77 * var86 + var13);
                                                                } else {
                                                                    var75.method53(var76 * var85 + var15, var13 - -(var77 * var86), 256 - (var14 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class131.method973(arg2, arg5, arg4, arg7);
                                                } else {
                                                    class181.method1427(var15, var13, var11.field4393 + var15, var11.field4381 + var13);
                                                    for (int var87 = 0; var87 < var79; var87++) {
                                                        for (int var88 = 0; var88 < var78; var88++) {
                                                            if (var11.field4405 != 0) {
                                                                var75.method517(var11.field4405, 4096, var76 / 2 + var76 * var87 + var15, (byte) 71, var77 * var88 + var77 / 2 + var13);
                                                            } else if (var14 == 0) {
                                                                var75.method47(var76 * var87 + var15, var77 * var88 + var13);
                                                            } else {
                                                                var75.method53(var15 + (var76 * var87), var77 * var88 + var13, 256 - (var14 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class181.method1420(arg2, arg5, arg4, arg7);
                                                }
                                            } else {
                                                int var89 = var11.field4393 * 4096 / var76;
                                                if (var11.field4405 != 0) {
                                                    var75.method517(var11.field4405, var89, var11.field4393 / 2 + var15, (byte) 71, var11.field4381 / 2 + var13);
                                                } else if (var14 != 0) {
                                                    var75.method50(var15, var13, var11.field4393, var11.field4381, 256 - (var14 & 0xFF));
                                                } else if (var11.field4393 == var76 && var11.field4381 == var77) {
                                                    var75.method47(var15, var13);
                                                } else {
                                                    var75.method58(var15, var13, var11.field4393, var11.field4381);
                                                }
                                            }
                                        } else if (class83.field1326) {
                                            class164.method1280(false, var11);
                                        }
                                    } else {
                                        class70 var90 = var11.method1910(true, class79.method565(var11, -12433));
                                        if (var90 != null) {
                                            var90.method47(var15, var13);
                                        } else if (class83.field1326) {
                                            class164.method1280(false, var11);
                                        }
                                    }
                                } else if (var11.field4536 == 6) {
                                    boolean var91 = class79.method565(var11, -12433);
                                    int var92;
                                    if (var91) {
                                        var92 = var11.field4488;
                                    } else {
                                        var92 = var11.field4378;
                                    }
                                    int var93 = 0;
                                    class208 var94 = null;
                                    if (var11.field4394 != -1) {
                                        class248 var99 = class84.method589(false, var11.field4394);
                                        if (var99 != null) {
                                            class248 var100 = var99.method1810(arg6 - 135, var11.field4447);
                                            class287 var101 = var92 == -1 ? null : class306.method2156(127, var92);
                                            var94 = var100.method1818(1, var11.field4474, 103, var101);
                                            if (var94 == null) {
                                                class164.method1280(false, var11);
                                            } else {
                                                var93 = -var94.method325() / 2;
                                            }
                                        }
                                    } else if (var11.field4384 == 5) {
                                        if (var11.field4544 == -1) {
                                            var94 = class40.field718.method648((class287) null, -1, true, (class287) null, -1, (byte) -108);
                                        } else {
                                            int var95 = var11.field4544 & 0x7FF;
                                            if (class161.field2730 == var95) {
                                                var95 = 2047;
                                            }
                                            class234 var96 = class75.field1215[var95];
                                            class287 var97 = var92 == -1 ? null : class306.method2156(123, var92);
                                            if (var96 != null && ((int) var96.field3891.method1123(arg6 ^ 0xFFFFCA74) << 11) == (var11.field4544 & 0xFFFFF800)) {
                                                var94 = var96.field3923.method648((class287) null, var11.field4474, true, var97, 0, (byte) -107);
                                            }
                                        }
                                    } else if (var92 == -1) {
                                        var94 = var11.method1920(arg6 ^ 0xFFFFFF97, (class287) null, -1, class102.field1639.field3923, var91);
                                        if (var94 == null && class83.field1326) {
                                            class164.method1280(false, var11);
                                        }
                                    } else {
                                        class287 var98 = class306.method2156(122, var92);
                                        var94 = var11.method1920(-82, var98, var11.field4474, class102.field1639.field3923, var91);
                                        if (var94 == null && class83.field1326) {
                                            class164.method1280(false, var11);
                                        }
                                    }
                                    if (var94 != null) {
                                        int var102;
                                        if (var11.field4383 > 0) {
                                            var102 = (var11.field4381 << 8) / var11.field4383;
                                        } else {
                                            var102 = 256;
                                        }
                                        int var103;
                                        if (var11.field4541 <= 0) {
                                            var103 = 256;
                                        } else {
                                            var103 = (var11.field4393 << 8) / var11.field4541;
                                        }
                                        int var104 = (var11.field4411 * var102 >> 8) + var11.field4381 / 2 + var13;
                                        int var105 = (var11.field4537 * var103 >> 8) + var11.field4393 / 2 + var15;
                                        if (class271.field4640) {
                                            if (var11.field4465) {
                                                class271.method1985(var105, var104, var11.field4403, var11.field4494, var103, var102);
                                            } else {
                                                class271.method1972(var105, var104, var103, var102);
                                                class271.method1959((float) var11.field4527, (float) var11.field4494 * 1.5F);
                                            }
                                            class271.method1981();
                                            class271.method1971(true);
                                            class271.method1962(false);
                                            class207.method1573(-50, class273.field4684);
                                            if (class189.field3125) {
                                                class131.method976();
                                                class271.method1982();
                                                class131.method973(arg2, arg5, arg4, arg7);
                                                class189.field3125 = false;
                                            }
                                            if (var11.field4450) {
                                                class271.method1960();
                                            }
                                            int var108 = class109.field1750[var11.field4410] * var11.field4403 >> 16;
                                            int var109 = class109.field1757[var11.field4410] * var11.field4403 >> 16;
                                            if (var11.field4462) {
                                                var94.method1380(0, var11.field4514, var11.field4420, var11.field4410, var11.field4487, var11.field4540 + var108 + var93, var11.field4540 + var109, -1L);
                                            } else {
                                                var94.method1380(0, var11.field4514, 0, var11.field4410, 0, var108, var109, -1L);
                                            }
                                            if (var11.field4450) {
                                                class271.method1963();
                                            }
                                        } else {
                                            class109.method724(var105, var104);
                                            int var106 = class109.field1757[var11.field4410] * var11.field4403 >> 16;
                                            int var107 = class109.field1750[var11.field4410] * var11.field4403 >> 16;
                                            if (!var11.field4462) {
                                                var94.method1380(0, var11.field4514, 0, var11.field4410, 0, var107, var106, -1L);
                                            } else if (var11.field4465) {
                                                ((class220) var94).method1632(0, var11.field4514, var11.field4420, var11.field4410, var11.field4487, var107 + var93 + var11.field4540, var11.field4540 + var106, var11.field4403);
                                            } else {
                                                var94.method1380(0, var11.field4514, var11.field4420, var11.field4410, var11.field4487, var93 + var107 + var11.field4540, var106 - -var11.field4540, -1L);
                                            }
                                            class109.method733();
                                        }
                                    }
                                } else {
                                    if (var11.field4536 == 7) {
                                        class30 var110 = var11.method1919(class102.field1651, 124);
                                        if (var110 == null) {
                                            if (class83.field1326) {
                                                class164.method1280(false, var11);
                                            }
                                            continue;
                                        }
                                        int var111 = 0;
                                        for (int var112 = 0; var112 < var11.field4523; var112++) {
                                            for (int var113 = 0; var113 < var11.field4445; var113++) {
                                                if (var11.field4437[var111] > 0) {
                                                    class248 var114 = class84.method589(false, var11.field4437[var111] - 1);
                                                    class146 var115;
                                                    if (var114.field4118 != 1 && var11.field4492[var111] == 1) {
                                                        var115 = class112.method758(-34, new class146[] { class145.field2420, var114.field4149, class199.field3326 });
                                                    } else {
                                                        var115 = class112.method758(arg6 ^ 0x68, new class146[] { class145.field2420, var114.field4149, class211.field3500, class113.method775(var11.field4492[var111], arg6 - 16) });
                                                    }
                                                    int var116 = (var11.field4436 + 115) * var113 + var15;
                                                    int var117 = (var11.field4399 + 12) * var112 + var13;
                                                    if (var11.field4375 == 0) {
                                                        var110.method210(var115, var116, var117, var11.field4442, var11.field4395 ? 0 : -1);
                                                    } else if (var11.field4375 == 1) {
                                                        var110.method209(var115, var116 + 57, var117, var11.field4442, var11.field4395 ? 0 : -1);
                                                    } else {
                                                        var110.method222(var115, var116 + 114, var117, var11.field4442, var11.field4395 ? 0 : -1);
                                                    }
                                                }
                                                var111++;
                                            }
                                        }
                                    }
                                    if (var11.field4536 == 8 && class102.field1661 == var11 && class254.field4234 == class102.field1643) {
                                        int var118 = 0;
                                        int var119 = 0;
                                        class146 var120 = var11.field4453;
                                        class30 var121 = class187.field3109;
                                        class146 var122 = class119.method814(var11, var120, 23870);
                                        while (var122.method1094((byte) -111) > 0) {
                                            int var123 = var122.method1081(class272.field4667, -1);
                                            class146 var124;
                                            if (var123 == -1) {
                                                var124 = var122;
                                                var122 = class161.field2740;
                                            } else {
                                                var124 = var122.method1078(0, var123, false);
                                                var122 = var122.method1111(-82, var123 + 4);
                                            }
                                            int var125 = var121.method207(var124);
                                            var119 += var121.field553 + 1;
                                            if (var125 > var118) {
                                                var118 = var125;
                                            }
                                        }
                                        var118 += 6;
                                        int var126 = var15 + var11.field4393 - var118 - 5;
                                        if (var126 < var15 + 5) {
                                            var126 = var15 + 5;
                                        }
                                        if ((var118 + var126) > arg4) {
                                            var126 = arg4 - var118;
                                        }
                                        int var127 = var13 + var11.field4381 + 5;
                                        var119 += 7;
                                        if ((var119 + var127) > arg7) {
                                            var127 = arg7 - var119;
                                        }
                                        if (class271.field4640) {
                                            class131.method978(var126, var127, var118, var119, 16777120);
                                            class131.method965(var126, var127, var118, var119, 0);
                                        } else {
                                            class181.method1416(var126, var127, var118, var119, 16777120);
                                            class181.method1435(var126, var127, var118, var119, 0);
                                        }
                                        int var128 = var121.field553 + var127 + 2;
                                        class146 var129 = var11.field4453;
                                        class146 var130 = class119.method814(var11, var129, arg6 + 23848);
                                        while (var130.method1094((byte) -10) > 0) {
                                            int var131 = var130.method1081(class272.field4667, -1);
                                            class146 var132;
                                            if (var131 == -1) {
                                                var132 = var130;
                                                var130 = class161.field2740;
                                            } else {
                                                var132 = var130.method1078(0, var131, false);
                                                var130 = var130.method1111(arg6 + 94, var131 - -4);
                                            }
                                            var121.method210(var132, var126 + 3, var128, 0, -1);
                                            var128 += var121.field553 + 1;
                                        }
                                    }
                                    if (var11.field4536 == 9) {
                                        int var133;
                                        int var134;
                                        int var135;
                                        int var136;
                                        if (var11.field4415) {
                                            var133 = var11.field4381 + var13;
                                            var134 = var13;
                                            var135 = var15;
                                            var136 = var15 + var11.field4393;
                                        } else {
                                            var135 = var15;
                                            var134 = var11.field4381 + var13;
                                            var133 = var13;
                                            var136 = var11.field4393 + var15;
                                        }
                                        if (var11.field4503 == 1) {
                                            if (class271.field4640) {
                                                class131.method972(var135, var133, var136, var134, var11.field4442);
                                            } else {
                                                class181.method1423(var135, var133, var136, var134, var11.field4442);
                                            }
                                        } else if (class271.field4640) {
                                            class131.method979(var135, var133, var136, var134, var11.field4442, var11.field4503);
                                        } else {
                                            class181.method1426(var135, var133, var136, var134, var11.field4442, var11.field4503);
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

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(III)V", line = 1386)
    private class177(int arg0, int arg1, int arg2) {
    }
}
