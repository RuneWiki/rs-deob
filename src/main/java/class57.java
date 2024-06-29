import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class57 extends class37 {

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
    private int field1413 = 0;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "Ldd;")
    public static class35 field1418 = class180.method1196((byte) 127, ")2");

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "Ldd;")
    public static class35 field1417 = class180.method1196((byte) 127, "Nehmen");

    @OriginalMember(owner = "client!ff", name = "eb", descriptor = "I")
    public static int field1427 = -1;

    @OriginalMember(owner = "client!ff", name = "fb", descriptor = "Ldd;")
    public static class35 field1428 = class180.method1196((byte) -20, "blinken1:");

    @OriginalMember(owner = "client!ff", name = "gb", descriptor = "[I")
    public static int[] field1429 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "Lld;")
    public static class111 field1419 = new class111(128);

    @OriginalMember(owner = "client!ff", name = "kb", descriptor = "Ldd;")
    private static class35 field1433 = class180.method1196((byte) 126, "cyan:");

    @OriginalMember(owner = "client!ff", name = "lb", descriptor = "Ldd;")
    public static class35 field1434 = field1433;

    @OriginalMember(owner = "client!ff", name = "mb", descriptor = "Ldd;")
    public static class35 field1435 = class180.method1196((byte) 126, "Fallen lassen");

    @OriginalMember(owner = "client!ff", name = "ob", descriptor = "[I")
    public static int[] field1437 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ff", name = "pb", descriptor = "Ldd;")
    public static class35 field1438 = field1433;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!ff", name = "cb", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!ff", name = "hb", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!ff", name = "nb", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "J")
    public static long field1416;

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "Lo;")
    public static class134 field1420;

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "[I")
    private int[] field1412;

    @OriginalMember(owner = "client!ff", name = "db", descriptor = "[I")
    private int[] field1426;

    @OriginalMember(owner = "client!ff", name = "ib", descriptor = "[[I")
    private int[][] field1431;

    @OriginalMember(owner = "client!ff", name = "jb", descriptor = "[[[I")
    public static int[][][] field1432;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        ++field1423;
        if (super.field816.field3661) {
            int[] var4 = this.method369(0, arg1, (byte) 124);
            int var5 = this.field1413;
            if (~var5 != -3) {
                if (~var5 == -2) {
                    for (int var6 = 0; ~class72.field1719 < ~var6; ++var6) {
                        int var7 = var4[var6];
                        int var8;
                        for (var8 = 1; this.field1431.length + -1 > var8 && ~this.field1431[var8][0] >= ~var7; ++var8) {
                        }
                        int[] var9 = this.field1431[var8];
                        int[] var10 = this.field1431[var8 + -1];
                        int var11 = (var7 - var10[0] << 12) / (var9[0] - var10[0]);
                        int var12 = 4096 - class3.field43[255 & var11 >> 5] >> 1;
                        int var13 = 4096 - var12;
                        var3[var6] = var9[1] * var12 + var10[1] * var13 >> 12;
                    }
                } else {
                    for (int var14 = 0; ~var14 > ~class72.field1719; ++var14) {
                        int var15 = var4[var14];
                        int var16;
                        for (var16 = 1; var16 < this.field1431.length + -1 && ~this.field1431[var16][0] >= ~var15; ++var16) {
                        }
                        int[] var17 = this.field1431[var16 + -1];
                        int[] var18 = this.field1431[var16];
                        int var19 = (-var17[0] + var15 << 12) / (var18[0] + -var17[0]);
                        int var20 = -var19 + 4096;
                        var3[var14] = var17[1] * var20 + var18[1] * var19 >> 12;
                    }
                }
            } else {
                for (int var21 = 0; ~var21 > ~class72.field1719; ++var21) {
                    int var22 = var4[var21];
                    int var23;
                    for (var23 = 1; ~(this.field1431.length + -1) < ~var23 && var22 >= this.field1431[var23][0]; ++var23) {
                    }
                    int[] var24 = this.field1431[var23 + -1];
                    int[] var25 = this.field1431[var23];
                    int var26 = this.method499(var23 + -2, arg0 ^ 21867)[1];
                    int var27 = var24[1];
                    int var28 = var25[1];
                    int var29 = this.method499(var23 - -1, 21792)[1];
                    int var30 = (-var24[0] + var22 << 12) / (var25[0] + -var24[0]);
                    int var31 = var30 * var30 >> 12;
                    int var33 = var29 - (var26 + var28) + var27;
                    int var34 = -var26 + var28;
                    int var35 = -var27 + var26 + -var33;
                    int var36 = var31 * var35 >> 12;
                    int var37 = (var30 * var33 >> 12) * var31 >> 12;
                    int var38 = var30 * var34 >> 12;
                    var3[var21] = var36 + var37 + var38 + var27;
                }
            }
        }
        if (arg0 != 75) {
            method501(83, (byte) -80, -90, -93, false, (byte) 91, (class134) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public final void method11(boolean arg0) {
        if (this.field1431 == null) {
            this.field1431 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field1415;
        if (arg0) {
            this.field1413 = -61;
        }
        if (~this.field1431.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field1413 == 2) {
                this.method500(5146);
            }
            class75.method591(4096);
        }
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)V")
    public static void method498(byte arg0) {
        field1437 = null;
        field1419 = null;
        field1435 = null;
        field1438 = null;
        field1432 = null;
        field1434 = null;
        field1433 = null;
        field1418 = null;
        field1417 = null;
        field1428 = null;
        field1420 = null;
        field1429 = null;
        if (arg0 < 9) {
            method501(23, (byte) -69, 22, 24, false, (byte) 47, (class134) null);
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)[I")
    private final int[] method499(int arg0, int arg1) {
        if (arg1 != 21792) {
            return null;
        } else {
            ++field1414;
            if (~arg0 > -1) {
                return this.field1412;
            } else {
                return ~this.field1431.length >= ~arg0 ? this.field1426 : this.field1431[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V")
    private final void method500(int arg0) {
        ++field1430;
        int[] var2 = this.field1431[0];
        int[] var3 = this.field1431[1];
        int[] var4 = this.field1431[this.field1431.length - 2];
        if (arg0 != 5146) {
            this.method7((byte) -103, 96);
        }
        int[] var5 = this.field1431[this.field1431.length - 1];
        this.field1412 = new int[] { var2[0] + var2[0] + -var3[0], var2[1] + var2[1] + -var3[1] };
        this.field1426 = new int[] { var4[0] - var5[0] - -var4[0], var4[1] + var4[1] - var5[1] };
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBIIZBLo;)V")
    public static final void method501(int arg0, byte arg1, int arg2, int arg3, boolean arg4, byte arg5, class134 arg6) {
        ++field1422;
        long var7 = (long) ((arg3 << 16) + arg0);
        class121 var9 = (class121) class34.field694.method796(true, var7);
        if (var9 == null) {
            class121 var10 = (class121) class4.field64.method796(true, var7);
            if (var10 == null) {
                class121 var11 = (class121) class113.field2482.method796(true, var7);
                if (arg5 != 95) {
                    method502(-128, 50);
                }
                if (var11 != null) {
                    if (arg4) {
                        var11.method1256((byte) 119);
                        class34.field694.method789(var11, true, var7);
                        ++class130.field2811;
                        --class106.field2359;
                    }
                } else {
                    if (!arg4) {
                        class121 var12 = (class121) class9.field172.method796(true, var7);
                        if (var12 != null) {
                            return;
                        }
                    }
                    class121 var13 = new class121();
                    var13.field2657 = arg6;
                    var13.field2652 = arg2;
                    var13.field2653 = arg1;
                    if (!arg4) {
                        class79.field1843.method1168(var13, (byte) 106);
                        class113.field2482.method789(var13, true, var7);
                        ++class106.field2359;
                    } else {
                        class34.field694.method789(var13, true, var7);
                        ++class130.field2811;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        if (arg1 == 1) {
            if (arg0 == 0) {
                this.field1413 = arg2.method221(-117);
                this.field1431 = new int[arg2.method221(-85)][2];
                for (int var4 = 0; var4 < this.field1431.length; ++var4) {
                    this.field1431[var4][0] = arg2.method256((byte) -78);
                    this.field1431[var4][1] = arg2.method256((byte) -78);
                }
            }
            ++field1421;
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(II)V")
    public static final void method502(int arg0, int arg1) {
        ++field1424;
        if (~arg1 != 2) {
            if (~arg1 != 1) {
                if (~arg1 == 0) {
                    class188.method1243(class146.field3090, client.field620, class113.field2500, -106);
                } else if (~arg1 == -4) {
                    class188.method1243(class172.field3447, class113.field2503, class113.field2520, -92);
                } else if (~arg1 != -5) {
                    if (~arg1 != -6) {
                        if (~arg1 != -7) {
                            if (arg1 == 7) {
                                class188.method1243(class74.field1776, class110.field2439, class113.field2504, 56);
                            } else if (~arg1 != -9) {
                                if (~arg1 != -10) {
                                    if (~arg1 != -11) {
                                        if (arg1 == 11) {
                                            class188.method1243(class190.field3835, class72.field1708, class113.field2487, -95);
                                        } else if (~arg1 != -13) {
                                            if (~arg1 != -14) {
                                                if (arg1 != 14) {
                                                    if (arg1 != 16) {
                                                        if (arg1 != 17) {
                                                            if (~arg1 != -19) {
                                                                if (arg1 != 19) {
                                                                    if (~arg1 != -21) {
                                                                        if (arg1 != 22) {
                                                                            if (arg1 != 23) {
                                                                                if (~arg1 == -25) {
                                                                                    class188.method1243(class99.field2184, class75.field1801, class113.field2501, -87);
                                                                                } else if (arg1 != 25) {
                                                                                    if (~arg1 == -27) {
                                                                                        class188.method1243(class2.field25, class179.field3676, class113.field2485, 87);
                                                                                    } else if (arg1 == 27) {
                                                                                        class188.method1243(class105.field2352, class113.field2525, class113.field2508, arg0 ^ -81);
                                                                                    } else {
                                                                                        class188.method1243(class146.field3078, class50.field1088, class113.field2491, arg0 ^ -22);
                                                                                    }
                                                                                } else {
                                                                                    class188.method1243(class146.field3084, class40.field881, class113.field2529, 31);
                                                                                }
                                                                            } else {
                                                                                class188.method1243(class168.field3383, class108.field2406, class113.field2522, arg0 ^ 99);
                                                                            }
                                                                        } else {
                                                                            class188.method1243(class19.field374, class32.field665, class113.field2492, arg0 ^ 119);
                                                                        }
                                                                    } else {
                                                                        class188.method1243(class146.field3080, class82.field1897, class113.field2514, 29);
                                                                    }
                                                                } else {
                                                                    class188.method1243(class159.field3230, class7.field99, class74.field1793, -124);
                                                                }
                                                            } else {
                                                                class188.method1243(class13.field239, class51.field1149, class113.field2476, 85);
                                                            }
                                                        } else {
                                                            class188.method1243(class43.field930, class55.field1248, class113.field2490, -85);
                                                        }
                                                    } else {
                                                        class188.method1243(class183.field3765, class158.field3217, class113.field2510, arg0 + -100);
                                                    }
                                                } else {
                                                    class188.method1243(class168.field3376, class71.field1702, class113.field2479, 89);
                                                }
                                            } else {
                                                class188.method1243(class146.field3088, class100.field2201, class113.field2478, -125);
                                            }
                                        } else {
                                            class188.method1243(class9.field190, class201.field4017, class113.field2499, -110);
                                        }
                                    } else {
                                        class188.method1243(class175.field3574, class127.field2760, class113.field2502, arg0 + -90);
                                    }
                                } else {
                                    class188.method1243(class108.field2410, class176.field3594, class113.field2489, -87);
                                }
                            } else {
                                class188.method1243(class55.field1341, class127.field2749, class113.field2531, 54);
                            }
                        } else {
                            class188.method1243(class48.field1050, class203.field4052, class113.field2527, 55);
                        }
                    } else {
                        class188.method1243(class170.field3393, class24.field482, class113.field2493, -96);
                    }
                } else {
                    class188.method1243(class72.field1713, class72.field1722, class113.field2481, 80);
                }
            } else {
                class188.method1243(class46.field991, class113.field2475, class113.field2480, 78);
            }
        } else {
            class188.method1243(class146.field3085, class126.field2744, class113.field2521, 64);
        }
        class59.method509(10, (byte) 112);
        if (arg0 != -19) {
            field1438 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class57() {
        super(1, true);
    }
}
