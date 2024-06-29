import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class312 extends class634 {

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "[I")
    private int[] field3871 = new int[257];

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "D")
    public static double field3872;

    @OriginalMember(owner = "client!aj", name = "F", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!aj", name = "H", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!aj", name = "G", descriptor = "Lsb;")
    public static class290 field3864;

    // $FF: synthetic field
    @OriginalMember(owner = "client!aj", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field3877;

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "[[I")
    private int[][] field3866;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(B)V")
    private final void method1852(byte arg0) {
        if (arg0 != 39) {
            field3870 = -64;
        }
        ++field3865;
        int var2 = this.field3866.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var2 < ~var6 && this.field3866[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var2 >= ~var4) {
                    int[] var7 = this.field3866[var2 + -1];
                    var8 = var7[1];
                    var9 = var7[2];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field3866[var4];
                    if (~var4 >= -1) {
                        var9 = var11[2];
                        var8 = var11[1];
                        var10 = var11[3];
                    } else {
                        int[] var12 = this.field3866[var4 + -1];
                        int var13 = (var5 - var12[0] << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var10 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                    }
                }
                int var15 = var10 >> 4;
                int var16 = var9 >> 4;
                int var17 = var8 >> 4;
                if (~var15 > -1) {
                    var15 = 0;
                } else if (~var15 < -256) {
                    var15 = 255;
                }
                if (var17 >= 0) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (~var16 > -1) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                this.field3871[var3] = class695.method3919(class695.method3919(var16 << 8, var17 << 16), var15);
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (~arg0 == -1) {
            int var4 = arg1.method1423(-109);
            if (~var4 != -1) {
                this.method1856(var4, 126);
            } else {
                this.field3866 = new int[arg1.method1423(-64)][4];
                for (int var5 = 0; this.field3866.length > var5; ++var5) {
                    this.field3866[var5][0] = arg1.method1476(94);
                    this.field3866[var5][1] = arg1.method1423(-119) << 4;
                    this.field3866[var5][2] = arg1.method1423(-128) << 4;
                    this.field3866[var5][3] = arg1.method1423(-115) << 4;
                }
            }
        }
        if (!arg2) {
            ++field3868;
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(B)V")
    public final void method87(byte arg0) {
        ++field3876;
        if (this.field3866 == null) {
            this.method1856(1, 125);
        }
        this.method1852((byte) 39);
        if (arg0 <= 65) {
            method1854(124, -116, (class58) null);
        }
    }

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "(I)Lvg;")
    public static final class52 method1853(int arg0) {
        if (arg0 > -96) {
            method1855(-27);
        }
        ++field3867;
        try {
            return (class52) Class.forName("cea").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILha;)Z")
    public static final boolean method1854(int arg0, int arg1, class58 arg2) {
        ++field3863;
        if (arg1 != 4) {
            return false;
        } else {
            int var3 = (class489.field6976 - 104) / 2;
            int var4 = (class153.field1677 - 104) / 2;
            boolean var5 = true;
            for (int var6 = var3; ~var6 > ~(var3 - -104); ++var6) {
                for (int var57 = var4; var4 + 104 > var57; ++var57) {
                    for (int var58 = arg0; var58 <= 3; ++var58) {
                        if (class755.method4199(arg1 + -4, arg0, var58, var6, var57)) {
                            int var59 = var58;
                            if (class728.method4056(var57, var6, (byte) -114)) {
                                var59 = var58 - 1;
                            }
                            if (~var59 <= -1) {
                                var5 &= class102.method706(var59, 8, var6, var57);
                            }
                        }
                    }
                }
            }
            if (!var5) {
                return false;
            } else {
                int[] var7 = new int[262144];
                for (int var8 = 0; ~var8 > ~var7.length; ++var8) {
                    var7[var8] = -16777216;
                }
                class638.field9164 = arg2.method430(512, arg1 + -83, var7, 512, 512, 0);
                class533.method3132(0);
                int var9 = (int) (Math.random() * 20.0D) + 238 + -10 + (-10 + (int) (20.0D * Math.random()) + 238 << 8) + (238 + ((int) (Math.random() * 20.0D) - 10) << 16) | -16777216;
                int var10 = (int) (20.0D * Math.random()) + 238 - 10 << 16 | -16777216;
                int var11 = (int) (8.0D * Math.random()) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
                boolean[][] var12 = new boolean[class468.field6698 + 1 - -2][class468.field6698 - -1 + 2];
                for (int var13 = var3; var3 + 104 > var13; var13 += class468.field6698) {
                    for (int var36 = var4; ~(var4 + 104) < ~var36; var36 += class468.field6698) {
                        int var37 = 0;
                        int var38 = 0;
                        int var39 = var13;
                        if (~var13 < -1) {
                            var39 = var13 - 1;
                            var37 += 4;
                        }
                        int var40 = var36;
                        if (var36 > 0) {
                            var40 = var36 - 1;
                        }
                        int var41 = class468.field6698 + var13;
                        if (~var41 > -105) {
                            ++var41;
                        }
                        int var42 = class468.field6698 + var36;
                        if (~var42 > -105) {
                            var38 += 4;
                            ++var42;
                        }
                        arg2.method432(0, 0, class468.field6698 * 4 + var37, class468.field6698 * 4 + var38);
                        arg2.method378(-16777216);
                        for (int var43 = arg0; var43 <= 3; ++var43) {
                            for (int var50 = 0; class468.field6698 >= var50; ++var50) {
                                for (int var56 = 0; ~var56 >= ~class468.field6698; ++var56) {
                                    var12[var50][var56] = class755.method4199(0, arg0, var43, var39 + var50, var40 + var56);
                                }
                            }
                            class11.field88[var43].method1662(0, 0, 1024, var39, var40, var41, var42, var12);
                            if (!class488.field6975) {
                                for (int var51 = -4; ~var51 > ~class468.field6698; ++var51) {
                                    for (int var52 = -4; ~var52 > ~class468.field6698; ++var52) {
                                        int var53 = var13 + var51;
                                        int var54 = var36 + var52;
                                        if (var3 <= var53 && ~var4 >= ~var54 && class755.method4199(0, arg0, var43, var53, var54)) {
                                            int var55 = var43;
                                            if (class728.method4056(var54, var53, (byte) 107)) {
                                                var55 = var43 - 1;
                                            }
                                            if (~var55 <= -1) {
                                                class57.method314((-var52 + class468.field6698) * 4 + var38 - 4, var51 * 4 + var37, var53, var10, true, var54, var55, arg2, var9);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (class488.field6975) {
                            class302 var44 = class205.field2430[arg0];
                            for (int var45 = 0; var45 < class468.field6698; ++var45) {
                                for (int var46 = 0; ~var46 > ~class468.field6698; ++var46) {
                                    int var47 = var13 + var45;
                                    int var48 = var36 + var46;
                                    int var49 = var44.field3770[var47 - var44.field3759][-var44.field3761 + var48];
                                    if (~(1076101120 & var49) != -1) {
                                        arg2.method410(-1713569622, var37 - -(var45 * 4), 4, arg1 + -35, (-var46 + class468.field6698) * 4 + var38 + -4, 4);
                                    } else if ((8388608 & var49) == 0) {
                                        if ((33554432 & var49) != 0) {
                                            arg2.method412(var45 * 4 + var37 - -3, (-var46 + class468.field6698) * 4 + -4 + var38, -1713569622, arg1 + 19150, 4);
                                        } else if (~(134217728 & var49) != -1) {
                                            arg2.method374(127, 4, var37 - -(var45 * 4), (-var46 + class468.field6698) * 4 + var38 + 3 + -4, -1713569622);
                                        } else if ((var49 & 536870912) != 0) {
                                            arg2.method412(var45 * 4 + var37, (-var46 + class468.field6698) * 4 + var38 + -4, -1713569622, 19154, 4);
                                        }
                                    } else {
                                        arg2.method374(126, 4, var45 * 4 + var37, (-var46 + class468.field6698) * 4 - 4 + var38, -1713569622);
                                    }
                                }
                            }
                        }
                        arg2.method370(var37, var38, class468.field6698 * 4, class468.field6698 * 4, var11, 2);
                        class638.field9164.method826((-var3 + var13) * 4 + 48, -(class468.field6698 * 4) + 464 + -((-var4 + var36) * 4), class468.field6698 * 4, class468.field6698 * 4, var37, var38);
                    }
                }
                arg2.method393();
                arg2.method378(-16777215);
                class486.method2933(true);
                class732.field10252 = 0;
                class224.field2568.method1728(29632);
                if (!class488.field6975) {
                    for (int var14 = var3; ~var14 > ~(var3 + 104); ++var14) {
                        for (int var20 = var4; ~var20 > ~(var4 + 104); ++var20) {
                            for (int var21 = arg0; arg0 - -1 >= var21 && var21 <= 3; ++var21) {
                                if (class755.method4199(0, arg0, var21, var14, var20)) {
                                    class281 var22 = (class281) class199.method1201(var21, var14, var20);
                                    if (var22 == null) {
                                        var22 = (class281) class229.method1330(var21, var14, var20, field3877 != null ? field3877 : (field3877 = method1857("wha")));
                                    }
                                    if (var22 == null) {
                                        var22 = (class281) class628.method3602(var21, var14, var20);
                                    }
                                    if (var22 == null) {
                                        var22 = (class281) class603.method3426(var21, var14, var20);
                                    }
                                    if (var22 != null) {
                                        class316 var23 = class445.field6442.method3972((byte) 105, var22.method1241((byte) 99));
                                        if (!var23.field3959 || class511.field7290) {
                                            int var24 = var23.field4000;
                                            if (var23.field4045 != null) {
                                                for (int var25 = 0; var25 < var23.field4045.length; ++var25) {
                                                    if (~var23.field4045[var25] != 0) {
                                                        class316 var26 = class445.field6442.method3972((byte) 113, var23.field4045[var25]);
                                                        if (~var26.field4000 <= -1) {
                                                            var24 = var26.field4000;
                                                        }
                                                    }
                                                }
                                            }
                                            if (~var24 <= -1) {
                                                boolean var27 = false;
                                                if (var24 >= 0) {
                                                    class228 var28 = class337.field4323.method2054(36, var24);
                                                    if (var28 != null && var28.field2599) {
                                                        var27 = true;
                                                    }
                                                }
                                                int var29 = var14;
                                                int var30 = var20;
                                                if (var27) {
                                                    int[][] var31 = class205.field2430[var21].field3770;
                                                    int var32 = class205.field2430[var21].field3759;
                                                    int var33 = class205.field2430[var21].field3761;
                                                    for (int var34 = 0; ~var34 > -11; ++var34) {
                                                        int var35 = (int) (Math.random() * 4.0D);
                                                        if (~var35 == -1 && ~var29 < ~var3 && ~(var14 + -3) > ~var29 && (var31[var29 + -1 + -var32][-var33 + var30] & 2883848) == 0) {
                                                            --var29;
                                                        }
                                                        if (var35 == 1 && var3 + 104 + -1 > var29 && ~(var14 + 3) < ~var29 && ~(var31[var29 + 1 + -var32][-var33 + var30] & 2883968) == -1) {
                                                            ++var29;
                                                        }
                                                        if (~var35 == -3 && ~var30 < ~var4 && ~var30 < ~(var20 + -3) && (var31[-var32 + var29][-var33 + var30 - 1] & 2883842) == 0) {
                                                            --var30;
                                                        }
                                                        if (~var35 == -4 && ~var30 > ~(var4 - -104 - 1) && ~(var20 - -3) < ~var30 && ~(2883872 & var31[-var32 + var29][-var33 + var30 - -1]) == -1) {
                                                            ++var30;
                                                        }
                                                    }
                                                }
                                                class227.field2593[class732.field10252] = var23.field3962;
                                                class494.field7002[class732.field10252] = var29;
                                                class360.field4623[class732.field10252] = var30;
                                                ++class732.field10252;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class230.field2685 != null) {
                        class65.field663.field5531 = 1;
                        class337.field4323.method2056(true, 64, 1024);
                        for (int var15 = 0; var15 < class230.field2685.field9447; ++var15) {
                            int var16 = class230.field2685.field9449[var15];
                            if (var16 >> 28 == class90.field937.field4628) {
                                int var17 = (var16 >> 14 & 16383) + -class464.field6624;
                                int var18 = (var16 & 16383) + -class181.field2144;
                                if (var17 >= 0 && ~class489.field6976 < ~var17 && var18 >= 0 && var18 < class153.field1677) {
                                    class224.field2568.method1721((byte) -93, new class716(var15));
                                } else {
                                    class228 var19 = class337.field4323.method2054(36, class230.field2685.field9446[var15]);
                                    if (var19.field2641 != null && ~(var19.field2606 + var17) <= -1 && class489.field6976 > var17 - -var19.field2608 && var19.field2615 + var18 >= 0 && var19.field2644 + var18 < class153.field1677) {
                                        class224.field2568.method1721((byte) 107, new class716(var15));
                                    }
                                }
                            }
                        }
                        class337.field4323.method2056(true, 64, 128);
                        class65.field663.field5531 = 2;
                        class65.field663.method2492((byte) 118);
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "(I)V")
    public static void method1855(int arg0) {
        int var1 = -66 / ((arg0 - -37) / 51);
        field3864 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
    private final void method1856(int arg0, int arg1) {
        ++field3869;
        if (arg1 <= 122) {
            method1854(-117, 107, (class58) null);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field3866 = new int[4][4];
                                    this.field3866[0][3] = 0;
                                    this.field3866[0][1] = 0;
                                    this.field3866[0][0] = 2048;
                                    this.field3866[0][2] = 4096;
                                    this.field3866[1][0] = 2867;
                                    this.field3866[1][1] = 4096;
                                    this.field3866[1][3] = 0;
                                    this.field3866[1][2] = 4096;
                                    this.field3866[2][1] = 4096;
                                    this.field3866[2][2] = 4096;
                                    this.field3866[2][3] = 0;
                                    this.field3866[2][0] = 3276;
                                    this.field3866[3][0] = 4096;
                                    this.field3866[3][1] = 4096;
                                    this.field3866[3][3] = 0;
                                    this.field3866[3][2] = 0;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field3866 = new int[16][4];
                                this.field3866[0][0] = 0;
                                this.field3866[0][2] = 192;
                                this.field3866[0][1] = 80;
                                this.field3866[0][3] = 321;
                                this.field3866[1][3] = 562;
                                this.field3866[1][0] = 155;
                                this.field3866[1][1] = 321;
                                this.field3866[1][2] = 449;
                                this.field3866[2][1] = 578;
                                this.field3866[2][0] = 389;
                                this.field3866[2][3] = 803;
                                this.field3866[2][2] = 690;
                                this.field3866[3][2] = 995;
                                this.field3866[3][0] = 671;
                                this.field3866[3][3] = 1140;
                                this.field3866[3][1] = 947;
                                this.field3866[4][0] = 897;
                                this.field3866[4][2] = 1397;
                                this.field3866[4][1] = 1285;
                                this.field3866[4][3] = 1509;
                                this.field3866[5][0] = 1175;
                                this.field3866[5][1] = 1525;
                                this.field3866[5][3] = 1413;
                                this.field3866[5][2] = 1429;
                                this.field3866[6][1] = 1734;
                                this.field3866[6][3] = 1333;
                                this.field3866[6][2] = 1461;
                                this.field3866[6][0] = 1368;
                                this.field3866[7][1] = 1413;
                                this.field3866[7][3] = 1702;
                                this.field3866[7][0] = 1507;
                                this.field3866[7][2] = 1525;
                                this.field3866[8][3] = 2056;
                                this.field3866[8][2] = 1590;
                                this.field3866[8][0] = 1736;
                                this.field3866[8][1] = 1108;
                                this.field3866[9][0] = 2088;
                                this.field3866[9][3] = 2666;
                                this.field3866[9][1] = 1766;
                                this.field3866[9][2] = 2056;
                                this.field3866[10][2] = 2586;
                                this.field3866[10][1] = 2409;
                                this.field3866[10][0] = 2355;
                                this.field3866[10][3] = 3276;
                                this.field3866[11][3] = 3228;
                                this.field3866[11][0] = 2691;
                                this.field3866[11][2] = 3148;
                                this.field3866[11][1] = 3116;
                                this.field3866[12][1] = 3806;
                                this.field3866[12][3] = 3196;
                                this.field3866[12][0] = 3031;
                                this.field3866[12][2] = 3710;
                                this.field3866[13][3] = 3019;
                                this.field3866[13][2] = 3421;
                                this.field3866[13][0] = 3522;
                                this.field3866[13][1] = 3437;
                                this.field3866[14][0] = 3727;
                                this.field3866[14][1] = 3116;
                                this.field3866[14][3] = 3228;
                                this.field3866[14][2] = 3148;
                                this.field3866[15][0] = 4096;
                                this.field3866[15][1] = 2377;
                                this.field3866[15][2] = 2505;
                                this.field3866[15][3] = 2746;
                            }
                        } else {
                            this.field3866 = new int[6][4];
                            this.field3866[0][1] = 0;
                            this.field3866[0][2] = 0;
                            this.field3866[0][3] = 0;
                            this.field3866[0][0] = 0;
                            this.field3866[1][2] = 0;
                            this.field3866[1][1] = 0;
                            this.field3866[1][3] = 1493;
                            this.field3866[1][0] = 1843;
                            this.field3866[2][0] = 2457;
                            this.field3866[2][1] = 0;
                            this.field3866[2][2] = 0;
                            this.field3866[2][3] = 2939;
                            this.field3866[3][1] = 0;
                            this.field3866[3][2] = 1124;
                            this.field3866[3][0] = 2781;
                            this.field3866[3][3] = 3565;
                            this.field3866[4][2] = 3084;
                            this.field3866[4][0] = 3481;
                            this.field3866[4][3] = 4031;
                            this.field3866[4][1] = 546;
                            this.field3866[5][2] = 4096;
                            this.field3866[5][3] = 4096;
                            this.field3866[5][0] = 4096;
                            this.field3866[5][1] = 4096;
                        }
                    } else {
                        this.field3866 = new int[7][4];
                        this.field3866[0][1] = 0;
                        this.field3866[0][3] = 4096;
                        this.field3866[0][0] = 0;
                        this.field3866[0][2] = 0;
                        this.field3866[1][0] = 663;
                        this.field3866[1][2] = 4096;
                        this.field3866[1][1] = 0;
                        this.field3866[1][3] = 4096;
                        this.field3866[2][1] = 0;
                        this.field3866[2][3] = 0;
                        this.field3866[2][2] = 4096;
                        this.field3866[2][0] = 1363;
                        this.field3866[3][1] = 4096;
                        this.field3866[3][0] = 2048;
                        this.field3866[3][2] = 4096;
                        this.field3866[3][3] = 0;
                        this.field3866[4][2] = 0;
                        this.field3866[4][1] = 4096;
                        this.field3866[4][3] = 0;
                        this.field3866[4][0] = 2727;
                        this.field3866[5][0] = 3411;
                        this.field3866[5][1] = 4096;
                        this.field3866[5][3] = 4096;
                        this.field3866[5][2] = 0;
                        this.field3866[6][0] = 4096;
                        this.field3866[6][2] = 0;
                        this.field3866[6][1] = 0;
                        this.field3866[6][3] = 4096;
                    }
                } else {
                    this.field3866 = new int[8][4];
                    this.field3866[0][1] = 2650;
                    this.field3866[0][3] = 2361;
                    this.field3866[0][2] = 2602;
                    this.field3866[0][0] = 0;
                    this.field3866[1][3] = 1558;
                    this.field3866[1][0] = 2867;
                    this.field3866[1][2] = 1799;
                    this.field3866[1][1] = 2313;
                    this.field3866[2][3] = 1413;
                    this.field3866[2][2] = 1734;
                    this.field3866[2][1] = 2618;
                    this.field3866[2][0] = 3072;
                    this.field3866[3][2] = 1220;
                    this.field3866[3][1] = 2296;
                    this.field3866[3][3] = 947;
                    this.field3866[3][0] = 3276;
                    this.field3866[4][0] = 3481;
                    this.field3866[4][2] = 963;
                    this.field3866[4][3] = 722;
                    this.field3866[4][1] = 2072;
                    this.field3866[5][2] = 2152;
                    this.field3866[5][1] = 2730;
                    this.field3866[5][0] = 3686;
                    this.field3866[5][3] = 1766;
                    this.field3866[6][2] = 1060;
                    this.field3866[6][3] = 915;
                    this.field3866[6][0] = 3891;
                    this.field3866[6][1] = 2232;
                    this.field3866[7][2] = 1413;
                    this.field3866[7][1] = 1686;
                    this.field3866[7][3] = 1140;
                    this.field3866[7][0] = 4096;
                }
            } else {
                this.field3866 = new int[2][4];
                this.field3866[0][2] = 0;
                this.field3866[0][1] = 0;
                this.field3866[0][0] = 0;
                this.field3866[0][3] = 0;
                this.field3866[1][0] = 4096;
                this.field3866[1][3] = 4096;
                this.field3866[1][1] = 4096;
                this.field3866[1][2] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    public class312() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)[[I")
    public final int[][] method7(byte arg0, int arg1) {
        ++field3873;
        int[][] var3 = super.field9126.method132(0, arg1);
        if (super.field9126.field295) {
            int[] var4 = this.method3641(arg1, 20604, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class635.field9139; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field3871[var9];
                var5[var8] = class327.method1956(16711680, var10) >> 12;
                var6[var8] = class327.method1956(var10, 65280) >> 4;
                var7[var8] = class327.method1956(var10, 255) << 4;
            }
        }
        int var11 = -51 / ((-56 - arg0) / 53);
        return var3;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1857(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
