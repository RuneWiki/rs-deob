import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class287 extends class215 {

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "I")
    private int field4576 = 0;

    @OriginalMember(owner = "client!rl", name = "U", descriptor = "I")
    private int field4579 = 0;

    @OriginalMember(owner = "client!rl", name = "W", descriptor = "I")
    private int field4581 = 1;

    @OriginalMember(owner = "client!rl", name = "X", descriptor = "Z")
    public static boolean field4582 = false;

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "Lte;")
    public static class244 field4577 = new class244(64);

    @OriginalMember(owner = "client!rl", name = "cb", descriptor = "[Ljava/lang/String;")
    public static String[] field4587 = new String[1000];

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!rl", name = "V", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!rl", name = "Y", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!rl", name = "Z", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!rl", name = "ab", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!rl", name = "bb", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIII)I")
    public static final int method1933(int arg0, int arg1, int arg2, int arg3) {
        ++field4572;
        int var4 = arg3 & 3;
        if (~var4 == -1) {
            return arg0;
        } else if (var4 == 1) {
            return -arg1 + 7;
        } else {
            int var5 = 118 / ((-52 - arg2) / 43);
            return ~var4 == -3 ? 7 - arg0 : arg1;
        }
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)V")
    public static void method1934(byte arg0) {
        field4577 = null;
        field4587 = null;
        if (arg0 > -6) {
            field4582 = true;
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V")
    public final void method331(byte arg0) {
        if (arg0 != -49) {
            method1934((byte) -102);
        }
        ++field4573;
        class247.method1716(arg0 + 305);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([BII)I")
    public static final int method1935(byte[] arg0, int arg1, int arg2) {
        if (arg1 < 111) {
            method1936(121);
        }
        ++field4580;
        return class20.method111(0, arg0, false, arg2);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 3) {
                    this.field4581 = arg2.method584(arg0 ^ 1521146131);
                }
            } else {
                this.field4579 = arg2.method584(255);
            }
        } else {
            this.field4576 = arg2.method584(255);
        }
        if (arg0 != 1521146348) {
            method1935((byte[]) null, -37, -56);
        }
        ++field4585;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
    public class287() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        int[] var3 = super.field3445.method1755(arg0, (byte) 115);
        if (arg1 != 255) {
            method1933(90, 119, -42, 73);
        }
        ++field4575;
        if (super.field3445.field4163) {
            int var4 = class76.field956[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~var6 > ~class244.field4015; ++var6) {
                int var7 = class166.field2657[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field4576 == 0) {
                    var9 = (-var4 + var7) * this.field4581;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field4581 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (this.field4579 == 0) {
                    var12 = class177.field2810[var12 >> 4 & 255] - -4096 >> 1;
                } else if (~this.field4579 == -3) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "(I)V")
    public static final void method1936(int arg0) {
        ++field4586;
        if (!class269.field4305) {
            if (!class129.field2065) {
                class152.field2359 += (12.0F - class152.field2359) / 2.0F;
            } else {
                class238.field3933 = (float) ((int) class238.field3933 + 47 & -16);
            }
            int var1 = 0 % ((-1 - arg0) / 47);
            class269.field4305 = true;
            class253.field4120 = true;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIII[Lwb;III)V")
    public static final void method1937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class123[] arg6, int arg7, int arg8, int arg9) {
        ++field4583;
        class217.method1520(arg2, arg7, arg0, arg9);
        class174.method1194();
        for (int var10 = 0; ~var10 > ~arg6.length; ++var10) {
            class123 var11 = arg6[var10];
            if (var11 != null && (~var11.field1911 == ~arg8 || arg8 == -1412584499 && class5.field75 == var11)) {
                int var12;
                if (~arg5 == 0) {
                    class233.field3858[class221.field3561] = var11.field1899 + arg1;
                    class148.field2328[class221.field3561] = var11.field1896 - -arg3;
                    class180.field2869[class221.field3561] = var11.field1879;
                    class256.field4160[class221.field3561] = var11.field1809;
                    var12 = class221.field3561++;
                } else {
                    var12 = arg5;
                }
                var11.field1898 = class73.field924;
                var11.field1903 = var12;
                if (!var11.field1796 || !client.method736(var11)) {
                    if (var11.field1848 > 0) {
                        class177.method1228(var11, (byte) -97);
                    }
                    int var13 = var11.field1896 - -arg3;
                    int var14 = var11.field1899 + arg1;
                    int var15 = var11.field1801;
                    if (class60.field764 && (client.method735(var11).field2703 != 0 || var11.field1778 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class5.field75 == var11) {
                        if (arg8 != -1412584499 && !var11.field1887) {
                            class180.field2856 = arg6;
                            class152.field2356 = arg3;
                            class137.field2199 = arg1;
                            continue;
                        }
                        if (!var11.field1887) {
                            var15 = 128;
                        }
                        if (class293.field4652 && field4582) {
                            int var16 = class113.field1623;
                            int var17 = var16 - class148.field2331;
                            if (~class128.field2055 < ~var17) {
                                var17 = class128.field2055;
                            }
                            if (class128.field2055 + class150.field2343.field1879 < var17 - -var11.field1879) {
                                var17 = -var11.field1879 + class128.field2055 - -class150.field2343.field1879;
                            }
                            int var18 = class92.field1156;
                            int var19 = var18 - class189.field3069;
                            if (class289.field4602 > var19) {
                                var19 = class289.field4602;
                            }
                            var14 = var17;
                            if (~(var11.field1809 + var19) < ~(class289.field4602 - -class150.field2343.field1809)) {
                                var19 = -var11.field1809 + class289.field4602 + class150.field2343.field1809;
                            }
                            var13 = var19;
                        }
                    }
                    int var20;
                    int var22;
                    int var24;
                    int var25;
                    if (~var11.field1778 != -3) {
                        var20 = ~var14 >= ~arg2 ? arg2 : var14;
                        int var21 = var11.field1879 + var14;
                        var22 = ~var13 >= ~arg7 ? arg7 : var13;
                        int var23 = var11.field1809 + var13;
                        if (~var11.field1778 == -10) {
                            ++var23;
                            ++var21;
                        }
                        var24 = arg9 > var23 ? var23 : arg9;
                        var25 = arg0 <= var21 ? arg0 : var21;
                    } else {
                        var24 = arg9;
                        var20 = arg2;
                        var25 = arg0;
                        var22 = arg7;
                    }
                    if (!var11.field1796 || ~var20 > ~var25 && var22 < var24) {
                        if (var11.field1848 != 0) {
                            if (~var11.field1848 == -1338 || ~var11.field1848 == -1404) {
                                class211.field3400 = var14;
                                class110.field1556 = var11;
                                class195.field3116 = var13;
                                class216.method1512(~var11.field1848 == -1404, var14, var11.field1809, var13, var11.field1879, 9847);
                                class21.field279[var12] = true;
                                class217.method1520(arg2, arg7, arg0, arg9);
                                continue;
                            }
                            if (var11.field1848 == 1338) {
                                if (!var11.method809((byte) -114)) {
                                    continue;
                                }
                                class108.method665(var12, var14, var13, (byte) 114, var11);
                                class217.method1520(arg2, arg7, arg0, arg9);
                                if (class211.field3399 != 0 && ~class211.field3399 != -4 || class262.field4250 || var20 > class98.field1297 || var22 > class273.field4369 || var25 <= class98.field1297 || ~var24 >= ~class273.field4369) {
                                    continue;
                                }
                                int var26 = -var14 + class98.field1297;
                                int var27 = class273.field4369 - var13;
                                int var28 = var11.field1839[var27];
                                if (~var28 < ~var26 || var11.field1799[var27] + var28 < var26) {
                                    continue;
                                }
                                int var29 = var26 - var11.field1879 / 2;
                                int var30 = var27 - var11.field1809 / 2;
                                int var31 = 2047 & (int) class226.field3639 + class84.field1045;
                                int var32 = class174.field2753[var31];
                                int var33 = (class14.field185 + 256) * var32 >> 8;
                                int var34 = class174.field2759[var31];
                                int var35 = (class14.field185 + 256) * var34 >> 8;
                                int var36 = var29 * var35 + var30 * var33 >> 11;
                                int var37 = var30 * var35 + -(var29 * var33) >> 11;
                                int var38 = class286.field4571.field3818 - (-var36 + (class286.field4571.method1638(-6377) - 1) * 64) >> 7;
                                int var39 = -var37 + class286.field4571.field3820 + -(class286.field4571.method1638(-6377) * 64) - -64 >> 7;
                                if (class247.field4076 && ~(64 & class78.field984) != -1) {
                                    class123 var40 = class247.method1714(class236.field3913, class236.field3911, 0);
                                    if (var40 != null) {
                                        class195.method1373(var39, " ->", class78.field983, 1L, (byte) -83, var38, class283.field4511, (short) 57);
                                    } else {
                                        class278.method1858(-1);
                                    }
                                    continue;
                                }
                                if (~class297.field4695 == -2) {
                                    class195.method1373(var39, "", -1, 1L, (byte) -76, var38, class113.field1627, (short) 22);
                                }
                                class195.method1373(var39, "", -1, 1L, (byte) -80, var38, class139.field2229, (short) 33);
                                continue;
                            }
                            if (~var11.field1848 == -1340) {
                                if (var11.method809((byte) -114)) {
                                    class293.method1968(var13, var14, var12, var11, 7182);
                                    class217.method1520(arg2, arg7, arg0, arg9);
                                }
                                continue;
                            }
                            if (var11.field1848 == 1400) {
                                class132.method894(var14, var13, var11.field1809, var11.field1879, false);
                                class21.field279[var12] = true;
                                class103.field1386[var12] = true;
                                class217.method1520(arg2, arg7, arg0, arg9);
                                continue;
                            }
                            if (~var11.field1848 == -1402) {
                                class201.method1401(var13, 16777215, var11.field1879, var14, var11.field1809);
                                class21.field279[var12] = true;
                                class103.field1386[var12] = true;
                                class217.method1520(arg2, arg7, arg0, arg9);
                                continue;
                            }
                            if (var11.field1848 == 1402) {
                                class292.method1964(var14, (byte) -27, var13);
                                class21.field279[var12] = true;
                                class103.field1386[var12] = true;
                                continue;
                            }
                            if (~var11.field1848 == -1406) {
                                if (!class255.field4134) {
                                    continue;
                                }
                                int var41 = var11.field1879 + var14;
                                int var42 = var13 + 15;
                                class166.field2664.method689("Fps:" + class276.field4409, var41, var42, 16776960, -1);
                                Runtime var43 = Runtime.getRuntime();
                                int var44 = 16776960;
                                int var45 = (int) ((var43.totalMemory() + -var43.freeMemory()) / 1024L);
                                if (~var45 < -65537) {
                                    var44 = 16711680;
                                }
                                var42 += 15;
                                int var46 = 0;
                                int var47 = 0;
                                int var48 = 0;
                                class166.field2664.method689("Mem:" + var45 + "k", var41, var42, var44, -1);
                                int var49 = 16776960;
                                for (int var50 = 0; var50 < 29; ++var50) {
                                    var46 += class296.field4682[var50].method1565(-3850);
                                    var48 += class296.field4682[var50].method1560((byte) -120);
                                    var47 += class296.field4682[var50].method1566((byte) 85);
                                }
                                int var51 = var47 * 100 / var46;
                                var42 += 15;
                                int var52 = var48 * 10000 / var46;
                                String var53 = "Cache:" + class210.method1475(2, (byte) -96, (long) var52, true, 0) + "% (" + var51 + "%)";
                                class5.field84.method689(var53, var41, var42, var49, -1);
                                class21.field279[var12] = true;
                                class103.field1386[var12] = true;
                                var42 += 12;
                                continue;
                            }
                            if (~var11.field1848 == -1407) {
                                class147.field2306 = var14;
                                class28.field403 = var11;
                                class171.field2715 = var13;
                                continue;
                            }
                        }
                        if (!class262.field4250) {
                            if (~var11.field1778 == -1 && var11.field1741 && ~class98.field1297 <= ~var20 && var22 <= class273.field4369 && var25 > class98.field1297 && ~class273.field4369 > ~var24 && !class60.field764) {
                                class187.field2989[0] = class136.field2157;
                                class155.field2423[0] = 1005;
                                class191.field3084[0] = class280.field4449;
                                class78.field977[0] = "";
                                class34.field437 = 1;
                            }
                            if (~var20 >= ~class98.field1297 && var22 <= class273.field4369 && var25 > class98.field1297 && var24 > class273.field4369) {
                                class4.method23(var11, -var13 + class273.field4369, (byte) -46, -var14 + class98.field1297);
                            }
                        }
                        if (~var11.field1778 == -1) {
                            if (!var11.field1796 && client.method736(var11) && class272.field4352 != var11) {
                                continue;
                            }
                            if (!var11.field1796) {
                                if (-var11.field1809 + var11.field1853 < var11.field1872) {
                                    var11.field1872 = -var11.field1809 + var11.field1853;
                                }
                                if (var11.field1872 < 0) {
                                    var11.field1872 = 0;
                                }
                            }
                            method1937(var25, -var11.field1835 + var14, var20, -var11.field1872 + var13, 99, var12, arg6, var22, var11.field1844, var24);
                            if (var11.field1748 != null) {
                                method1937(var25, -var11.field1835 + var14, var20, -var11.field1872 + var13, 126, var12, var11.field1748, var22, var11.field1844, var24);
                            }
                            class86 var54 = (class86) class92.field1139.method708((long) var11.field1844, 124);
                            if (var54 != null) {
                                if (var54.field1061 == 0 && !class262.field4250 && class98.field1297 >= var20 && ~var22 >= ~class273.field4369 && ~var25 < ~class98.field1297 && class273.field4369 < var24 && !class60.field764) {
                                    class187.field2989[0] = class136.field2157;
                                    class191.field3084[0] = class280.field4449;
                                    class155.field2423[0] = 1005;
                                    class78.field977[0] = "";
                                    class34.field437 = 1;
                                }
                                class122.method793(var13, var54.field1064, var12, var24, var14, 523091273, var22, var20, var25);
                            }
                            class217.method1520(arg2, arg7, arg0, arg9);
                            class174.method1194();
                        }
                        if (class225.field3616[var12] || ~class244.field4005 < -2) {
                            if (~var11.field1778 == -1 && !var11.field1796 && ~var11.field1853 < ~var11.field1809) {
                                class113.method744(var11.field1853, var11.field1809, var11.field1872, var13, var11.field1879 + var14, (byte) 59);
                            }
                            if (var11.field1778 != 1) {
                                if (~var11.field1778 == -3) {
                                    int var55 = 0;
                                    for (int var56 = 0; ~var56 > ~var11.field1833; ++var56) {
                                        for (int var57 = 0; ~var57 > ~var11.field1918; ++var57) {
                                            int var58 = (32 - -var11.field1854) * var57 + var14;
                                            int var59 = (32 - -var11.field1914) * var56 + var13;
                                            if (var55 < 20) {
                                                var59 += var11.field1869[var55];
                                                var58 += var11.field1904[var55];
                                            }
                                            if (var11.field1757[var55] <= 0) {
                                                if (var11.field1803 != null && var55 < 20) {
                                                    class56 var60 = var11.method802(var55, -6289);
                                                    if (var60 != null) {
                                                        var60.method315(var58, var59);
                                                    } else if (class236.field3893) {
                                                        class129.method875((byte) -21, var11);
                                                    }
                                                }
                                            } else {
                                                boolean var61 = false;
                                                boolean var62 = false;
                                                int var63 = var11.field1757[var55] + -1;
                                                if (~arg2 > ~(var58 + 32) && var58 < arg0 && ~(var59 - -32) < ~arg7 && ~arg9 < ~var59 || class242.field3982 == var11 && class272.field4349 == var55) {
                                                    class56 var64;
                                                    if (class32.field432 == 1 && class126.field2032 == var55 && class215.field3464 == var11.field1844) {
                                                        var64 = class177.method1227(var11.field1850, 2, var63, 0, (class134) null, 150, var11.field1905[var55]);
                                                    } else {
                                                        var64 = class177.method1227(var11.field1850, 1, var63, 3153952, (class134) null, 150, var11.field1905[var55]);
                                                    }
                                                    if (class174.field2757) {
                                                        class21.field279[var12] = true;
                                                    }
                                                    if (var64 == null) {
                                                        class129.method875((byte) -21, var11);
                                                    } else if (class242.field3982 == var11 && ~class272.field4349 == ~var55) {
                                                        int var65 = class92.field1156 - class93.field1184;
                                                        int var66 = -class173.field2740 + class113.field1623;
                                                        if (var66 < 5 && var66 > -5) {
                                                            var66 = 0;
                                                        }
                                                        if (var65 < 5 && ~var65 < 4) {
                                                            var65 = 0;
                                                        }
                                                        if (class105.field1410 < 5) {
                                                            var65 = 0;
                                                            var66 = 0;
                                                        }
                                                        var64.method325(var58 + var66, var59 + var65, 128);
                                                        if (arg8 != -1) {
                                                            class123 var67 = arg6[arg8 & 65535];
                                                            int var68 = class217.field3482;
                                                            int var69 = class217.field3479;
                                                            if (~var69 < ~(var59 + var65) && ~var67.field1872 < -1) {
                                                                int var70 = (var69 - var65 + -var59) * class32.field427 / 3;
                                                                if (var70 > class32.field427 * 10) {
                                                                    var70 = class32.field427 * 10;
                                                                }
                                                                if (~var67.field1872 > ~var70) {
                                                                    var70 = var67.field1872;
                                                                }
                                                                var67.field1872 -= var70;
                                                                class93.field1184 += var70;
                                                                class129.method875((byte) -21, var67);
                                                            }
                                                            if (var59 + var65 + 32 > var68 && ~var67.field1872 > ~(-var67.field1809 + var67.field1853)) {
                                                                int var71 = (var59 + 32 + var65 - var68) * class32.field427 / 3;
                                                                if (~(class32.field427 * 10) > ~var71) {
                                                                    var71 = class32.field427 * 10;
                                                                }
                                                                if (-var67.field1872 + var67.field1853 + -var67.field1809 < var71) {
                                                                    var71 = -var67.field1809 + var67.field1853 - var67.field1872;
                                                                }
                                                                var67.field1872 += var71;
                                                                class93.field1184 -= var71;
                                                                class129.method875((byte) -21, var67);
                                                            }
                                                        }
                                                    } else if (class130.field2081 == var11 && class73.field906 == var55) {
                                                        var64.method325(var58, var59, 128);
                                                    } else {
                                                        var64.method315(var58, var59);
                                                    }
                                                }
                                            }
                                            ++var55;
                                        }
                                    }
                                } else if (~var11.field1778 == -4) {
                                    int var72;
                                    if (!class294.method1971(var11, 4)) {
                                        var72 = var11.field1779;
                                        if (class272.field4352 == var11 && var11.field1745 != 0) {
                                            var72 = var11.field1745;
                                        }
                                    } else {
                                        var72 = var11.field1880;
                                        if (class272.field4352 == var11 && ~var11.field1873 != -1) {
                                            var72 = var11.field1873;
                                        }
                                    }
                                    if (~var15 == -1) {
                                        if (var11.field1831) {
                                            class217.method1526(var14, var13, var11.field1879, var11.field1809, var72);
                                        } else {
                                            class217.method1528(var14, var13, var11.field1879, var11.field1809, var72);
                                        }
                                    } else if (var11.field1831) {
                                        class217.method1540(var14, var13, var11.field1879, var11.field1809, var72, -(var15 & 255) + 256);
                                    } else {
                                        class217.method1537(var14, var13, var11.field1879, var11.field1809, var72, -(var15 & 255) + 256);
                                    }
                                } else if (~var11.field1778 == -5) {
                                    class109 var73 = var11.method800(-124, class258.field4179);
                                    if (var73 == null) {
                                        if (class236.field3893) {
                                            class129.method875((byte) -21, var11);
                                        }
                                    } else {
                                        String var74 = var11.field1751;
                                        int var75;
                                        if (class294.method1971(var11, 4)) {
                                            var75 = var11.field1880;
                                            if (class272.field4352 == var11 && ~var11.field1873 != -1) {
                                                var75 = var11.field1873;
                                            }
                                            if (~var11.field1762.length() < -1) {
                                                var74 = var11.field1762;
                                            }
                                        } else {
                                            var75 = var11.field1779;
                                            if (class272.field4352 == var11 && var11.field1745 != 0) {
                                                var75 = var11.field1745;
                                            }
                                        }
                                        if (var11.field1796 && ~var11.field1806 != 0) {
                                            class108 var76 = class256.method1753(-2, var11.field1806);
                                            var74 = var76.field1504;
                                            if (var74 == null) {
                                                var74 = "null";
                                            }
                                            if ((var76.field1492 == 1 || var11.field1805 != 1) && ~var11.field1805 != 0) {
                                                var74 = "<col=ff9040>" + var74 + "</col> x" + class91.method498(var11.field1805, 8);
                                            }
                                        }
                                        if (class108.field1486 == var11) {
                                            var74 = class88.field1086;
                                            var75 = var11.field1779;
                                        }
                                        if (!var11.field1796) {
                                            var74 = class137.method936(var11, var74, (byte) 108);
                                        }
                                        var73.method694(var74, var14, var13, var11.field1879, var11.field1809, var75, !var11.field1749 ? -1 : 0, var11.field1868, var11.field1876, var11.field1845);
                                    }
                                } else if (~var11.field1778 == -6) {
                                    if (!var11.field1796) {
                                        class56 var77 = var11.method796((byte) 66, class294.method1971(var11, 4));
                                        if (var77 != null) {
                                            var77.method315(var14, var13);
                                        } else if (class236.field3893) {
                                            class129.method875((byte) -21, var11);
                                        }
                                    } else if (var11.field1760 >= 0) {
                                        class257 var78 = var11.method799((byte) 0);
                                        var78.method1760(0, var14, var13, var11.field1879, var11.field1809, var11.field1841, var11.field1830, 0);
                                    } else {
                                        class56 var79;
                                        if (~var11.field1806 == 0) {
                                            var79 = var11.method796((byte) 41, false);
                                        } else if (var11.field1798 && class286.field4571.field4219 != null) {
                                            var79 = class177.method1227(var11.field1850, var11.field1752, var11.field1806, var11.field1792, class286.field4571.field4219, 150, var11.field1805);
                                        } else {
                                            var79 = class177.method1227(var11.field1850, var11.field1752, var11.field1806, var11.field1792, (class134) null, 150, var11.field1805);
                                        }
                                        if (var79 == null) {
                                            if (class236.field3893) {
                                                class129.method875((byte) -21, var11);
                                            }
                                        } else {
                                            int var80 = var79.field717;
                                            int var81 = var79.field721;
                                            if (!var11.field1773) {
                                                int var86 = var11.field1879 * 4096 / var81;
                                                if (var11.field1814 != 0) {
                                                    var79.method321(var86, var13 - -(var11.field1809 / 2), (byte) -110, var11.field1814, var11.field1879 / 2 + var14);
                                                } else if (~var15 == -1) {
                                                    if (var11.field1879 == var81 && ~var11.field1809 == ~var80) {
                                                        var79.method315(var14, var13);
                                                    } else {
                                                        var79.method320(var14, var13, var11.field1879, var11.field1809);
                                                    }
                                                } else {
                                                    var79.method316(var14, var13, var11.field1879, var11.field1809, 256 - (var15 & 255));
                                                }
                                            } else {
                                                int var82 = (var11.field1879 - 1 - -var81) / var81;
                                                int var83 = (var80 - 1 + var11.field1809) / var80;
                                                class217.method1525(var14, var13, var11.field1879 + var14, var11.field1809 + var13);
                                                for (int var84 = 0; ~var82 < ~var84; ++var84) {
                                                    for (int var85 = 0; ~var83 < ~var85; ++var85) {
                                                        if (var11.field1814 == 0) {
                                                            if (var15 == 0) {
                                                                var79.method315(var81 * var84 + var14, var13 - -(var80 * var85));
                                                            } else {
                                                                var79.method325(var81 * var84 + var14, var13 - -(var80 * var85), -(255 & var15) + 256);
                                                            }
                                                        } else {
                                                            var79.method321(4096, var80 * var85 + var80 / 2 + var13, (byte) -74, var11.field1814, var81 * var84 + (var14 - -(var81 / 2)));
                                                        }
                                                    }
                                                }
                                                class217.method1520(arg2, arg7, arg0, arg9);
                                            }
                                        }
                                    }
                                } else if (var11.field1778 == 6) {
                                    int var87 = 0;
                                    class158 var88 = null;
                                    boolean var89 = class294.method1971(var11, 4);
                                    int var90;
                                    if (!var89) {
                                        var90 = var11.field1783;
                                    } else {
                                        var90 = var11.field1791;
                                    }
                                    if (var11.field1806 == -1) {
                                        if (~var11.field1769 != -6) {
                                            if (~var90 == 0) {
                                                var88 = var11.method806(0, var89, class286.field4571.field4219, -1, -10, (class165) null, -1);
                                                if (var88 == null && class236.field3893) {
                                                    class129.method875((byte) -21, var11);
                                                }
                                            } else {
                                                class165 var91 = class208.method1458((byte) 112, var90);
                                                var88 = var11.method806(var11.field1894, var89, class286.field4571.field4219, var11.field1780, -10, var91, var11.field1900);
                                                if (var88 == null && class236.field3893) {
                                                    class129.method875((byte) -21, var11);
                                                }
                                            }
                                        } else if (var11.field1818 == -1) {
                                            var88 = class171.field2722.method911(-1, -1, -1, 125, (class165) null, 0, (class165) null, 0, -1, true, (class201[]) null);
                                        } else {
                                            int var92 = 2047 & var11.field1818;
                                            if (~class185.field2958 == ~var92) {
                                                var92 = 2047;
                                            }
                                            class259 var93 = class89.field1113[var92];
                                            class165 var94 = var90 == -1 ? null : class208.method1458((byte) -126, var90);
                                            if (var93 != null && (int) class185.method1296((byte) -103, var93.field4208) << 11 == (var11.field1818 & -2048)) {
                                                var88 = var93.field4219.method911(-1, 0, var11.field1900, 72, (class165) null, 0, var94, 0, -1, true, (class201[]) null);
                                            }
                                        }
                                    } else {
                                        class108 var95 = class256.method1753(-2, var11.field1806);
                                        if (var95 != null) {
                                            class108 var96 = var95.method663(var11.field1805, (byte) -80);
                                            class165 var97 = var90 == -1 ? null : class208.method1458((byte) 101, var90);
                                            if (var11.field1798 && class286.field4571.field4219 != null) {
                                                var88 = var96.method653(var11.field1780, var11.field1900, (byte) -25, 1, class286.field4571.field4219, var97, var11.field1894);
                                            } else {
                                                var88 = var96.method653(var11.field1780, var11.field1900, (byte) -25, 1, (class134) null, var97, var11.field1894);
                                            }
                                            if (var88 == null) {
                                                class129.method875((byte) -21, var11);
                                            } else {
                                                var87 = -var88.method102() / 2;
                                            }
                                        }
                                    }
                                    if (var88 != null) {
                                        int var98;
                                        if (var11.field1906 > 0) {
                                            var98 = (var11.field1879 << 8) / var11.field1906;
                                        } else {
                                            var98 = 256;
                                        }
                                        int var99;
                                        if (~var11.field1901 < -1) {
                                            var99 = (var11.field1809 << 8) / var11.field1901;
                                        } else {
                                            var99 = 256;
                                        }
                                        int var100 = (var11.field1861 * var99 >> 8) + var11.field1809 / 2 + var13;
                                        int var101 = var11.field1879 / 2 + var14 - -(var11.field1774 * var98 >> 8);
                                        class174.method1205(var101, var100);
                                        int var102 = class174.field2759[var11.field1804] * var11.field1878 >> 16;
                                        int var103 = class174.field2753[var11.field1804] * var11.field1878 >> 16;
                                        if (var11.field1796) {
                                            if (!var11.field1753) {
                                                var88.method831(0, var11.field1907, var11.field1756, var11.field1804, var11.field1815, var103 - -var87 - -var11.field1810, var11.field1810 + var102, -1L);
                                            } else {
                                                ((class125) var88).method848(0, var11.field1907, var11.field1756, var11.field1804, var11.field1815, var87 + var103 - -var11.field1810, var102 - -var11.field1810, var11.field1878);
                                            }
                                        } else {
                                            var88.method831(0, var11.field1907, 0, var11.field1804, 0, var103, var102, -1L);
                                        }
                                        class174.method1193();
                                    }
                                } else {
                                    if (~var11.field1778 == -8) {
                                        class109 var104 = var11.method800(-116, class258.field4179);
                                        if (var104 == null) {
                                            if (class236.field3893) {
                                                class129.method875((byte) -21, var11);
                                            }
                                            continue;
                                        }
                                        int var105 = 0;
                                        for (int var106 = 0; var106 < var11.field1833; ++var106) {
                                            for (int var107 = 0; var107 < var11.field1918; ++var107) {
                                                if (var11.field1757[var105] > 0) {
                                                    class108 var108 = class256.method1753(-2, var11.field1757[var105] - 1);
                                                    String var109;
                                                    if (var108.field1492 != 1 && var11.field1905[var105] == 1) {
                                                        var109 = "<col=ff9040>" + var108.field1504 + "</col>";
                                                    } else {
                                                        var109 = "<col=ff9040>" + var108.field1504 + "</col> x" + class91.method498(var11.field1905[var105], 8);
                                                    }
                                                    int var110 = var14 - -((var11.field1854 + 115) * var107);
                                                    int var111 = (var11.field1914 + 12) * var106 + var13;
                                                    if (~var11.field1868 == -1) {
                                                        var104.method687(var109, var110, var111, var11.field1779, var11.field1749 ? 0 : -1);
                                                    } else if (~var11.field1868 != -2) {
                                                        var104.method689(var109, var110 - -115 + -1, var111, var11.field1779, !var11.field1749 ? -1 : 0);
                                                    } else {
                                                        var104.method685(var109, var110 + 57, var111, var11.field1779, var11.field1749 ? 0 : -1);
                                                    }
                                                }
                                                ++var105;
                                            }
                                        }
                                    }
                                    if (var11.field1778 == 8 && class82.field1009 == var11 && class247.field4071 == class219.field3512) {
                                        int var112 = 0;
                                        int var113 = 0;
                                        class109 var114 = class166.field2664;
                                        String var115 = var11.field1751;
                                        String var116 = class137.method936(var11, var115, (byte) -72);
                                        while (~var116.length() < -1) {
                                            int var124 = var116.indexOf("<br>");
                                            String var125;
                                            if (var124 != -1) {
                                                var125 = var116.substring(0, var124);
                                                var116 = var116.substring(var124 + 4);
                                            } else {
                                                var125 = var116;
                                                var116 = "";
                                            }
                                            int var126 = var114.method692(var125);
                                            var113 += var114.field1535 - -1;
                                            if (var112 < var126) {
                                                var112 = var126;
                                            }
                                        }
                                        var113 += 7;
                                        int var117 = var11.field1809 + var13 + 5;
                                        if (arg9 < var117 - -var113) {
                                            var117 = -var113 + arg9;
                                        }
                                        var112 += 6;
                                        int var118 = var14 - -var11.field1879 - (var112 + 5);
                                        if (~(var14 + 5) < ~var118) {
                                            var118 = var14 + 5;
                                        }
                                        if (~arg0 > ~(var112 + var118)) {
                                            var118 = -var112 + arg0;
                                        }
                                        class217.method1526(var118, var117, var112, var113, 16777120);
                                        class217.method1528(var118, var117, var112, var113, 0);
                                        String var119 = var11.field1751;
                                        int var120 = var114.field1535 + 2 + var117;
                                        String var121 = class137.method936(var11, var119, (byte) -107);
                                        while (~var121.length() < -1) {
                                            int var122 = var121.indexOf("<br>");
                                            String var123;
                                            if (~var122 == 0) {
                                                var123 = var121;
                                                var121 = "";
                                            } else {
                                                var123 = var121.substring(0, var122);
                                                var121 = var121.substring(var122 + 4);
                                            }
                                            var114.method687(var123, var118 - -3, var120, 0, -1);
                                            var120 += var114.field1535 + 1;
                                        }
                                    }
                                    if (var11.field1778 == 9) {
                                        int var127;
                                        int var128;
                                        int var129;
                                        int var130;
                                        if (var11.field1754) {
                                            var127 = var11.field1809 + var13;
                                            var128 = var13;
                                            var129 = var11.field1879 + var14;
                                            var130 = var14;
                                        } else {
                                            var129 = var11.field1879 + var14;
                                            var127 = var13;
                                            var128 = var11.field1809 + var13;
                                            var130 = var14;
                                        }
                                        if (~var11.field1851 != -2) {
                                            class217.method1538(var130, var127, var129, var128, var11.field1779, var11.field1851);
                                        } else {
                                            class217.method1521(var130, var127, var129, var128, var11.field1779);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg4 < 21) {
            field4582 = true;
        }
    }
}
