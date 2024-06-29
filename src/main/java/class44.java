import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class44 extends class40 {

    @OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
    private int field595 = 4;

    @OriginalMember(owner = "client!sh", name = "P", descriptor = "I")
    private int field593 = 4;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "Lub;")
    public static class15 field592 = new class15(32);

    @OriginalMember(owner = "client!sh", name = "V", descriptor = "I")
    public static int field599 = -2;

    @OriginalMember(owner = "client!sh", name = "W", descriptor = "Lmi;")
    public static class288 field600 = new class288(8);

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!sh", name = "Q", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!sh", name = "S", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!sh", name = "T", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!sh", name = "U", descriptor = "Ls;")
    public static class154 field598;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILvq;I)V", line = 4)
    private static final void method294(int arg0, class269 arg1, int arg2) {
        if (arg2 <= 81) {
            method294(10, (class269) null, 47);
        }
        ++field591;
        class401.method2514(arg1);
        if (~arg0 < -2) {
            for (int var3 = 0; var3 < class80.field1034; ++var3) {
                for (int var4 = 0; var4 < class381.field5414; ++var4) {
                    if ((2 & class320.field4692[1][var3][var4]) == 2) {
                        class6.method25(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; ~var5 > ~arg0; ++var5) {
            for (int var6 = 0; ~var6 >= ~class381.field5414; ++var6) {
                for (int var7 = 0; ~var7 >= ~class80.field1034; ++var7) {
                    if ((class284.field4138[var5][var7][var6] & 1) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        int var11 = var5;
                        while (class381.field5414 > var9 && ~(1 & class284.field4138[var5][var7][var9 + 1]) != -1) {
                            ++var9;
                        }
                        while (~var8 < -1 && ~(1 & class284.field4138[var5][var7][var8 + -1]) != -1) {
                            --var8;
                        }
                        label169: while (~var10 < -1) {
                            for (int var12 = var8; ~var12 >= ~var9; ++var12) {
                                if (~(1 & class284.field4138[var10 + -1][var7][var12]) == -1) {
                                    break label169;
                                }
                            }
                            --var10;
                        }
                        label158: while (var11 < 3) {
                            for (int var13 = var8; var13 <= var9; ++var13) {
                                if (~(1 & class284.field4138[var11 + 1][var7][var13]) == -1) {
                                    break label158;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (var9 - var8 - -1) * (-var10 + var11 + 1);
                        if (~var14 <= -3) {
                            short var15 = 240;
                            int var16 = class207.field2975[var11][var7][var8] - var15;
                            int var17 = class207.field2975[var10][var7][var8];
                            class371.method2379(1, var7 * 128, var7 * 128, var8 * 128, var9 * 128 + 128, var16, var17);
                            for (int var18 = var10; var11 >= var18; ++var18) {
                                for (int var19 = var8; var19 <= var9; ++var19) {
                                    class284.field4138[var18][var7][var19] = (byte) class209.method1483(class284.field4138[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((2 & class284.field4138[var5][var7][var6]) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        int var23 = var5;
                        while (~var20 < -1 && (class284.field4138[var5][var20 + -1][var6] & 2) != 0) {
                            --var20;
                        }
                        while (var21 < class80.field1034 && (class284.field4138[var5][var21 + 1][var6] & 2) != 0) {
                            ++var21;
                        }
                        label222: while (~var22 < -1) {
                            for (int var24 = var20; ~var24 >= ~var21; ++var24) {
                                if (~(2 & class284.field4138[var22 + -1][var24][var6]) == -1) {
                                    break label222;
                                }
                            }
                            --var22;
                        }
                        label211: while (~var23 > -4) {
                            for (int var25 = var20; var21 >= var25; ++var25) {
                                if (~(2 & class284.field4138[var23 + 1][var25][var6]) == -1) {
                                    break label211;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (var23 - (-1 - -var22)) * (-var20 + var21 + 1);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = class207.field2975[var23][var20][var6] + -var27;
                            int var29 = class207.field2975[var22][var20][var6];
                            class371.method2379(2, var20 * 128, var21 * 128 - -128, var6 * 128, var6 * 128, var28, var29);
                            for (int var30 = var22; ~var30 >= ~var23; ++var30) {
                                for (int var31 = var20; ~var21 <= ~var31; ++var31) {
                                    class284.field4138[var30][var31][var6] = (byte) class209.method1483(class284.field4138[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((4 & class284.field4138[var5][var7][var6]) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34;
                        for (var34 = var6; ~var34 < -1 && (class284.field4138[var5][var7][var34 - 1] & 4) != 0; --var34) {
                        }
                        int var35;
                        for (var35 = var6; ~var35 > ~class381.field5414 && (class284.field4138[var5][var7][var35 + 1] & 4) != 0; ++var35) {
                        }
                        label275: while (~var32 < -1) {
                            for (int var36 = var34; var36 <= var35; ++var36) {
                                if ((class284.field4138[var5][var32 + -1][var36] & 4) == 0) {
                                    break label275;
                                }
                            }
                            --var32;
                        }
                        label264: while (~var33 > ~class80.field1034) {
                            for (int var37 = var34; ~var37 >= ~var35; ++var37) {
                                if ((class284.field4138[var5][var33 - -1][var37] & 4) == 0) {
                                    break label264;
                                }
                            }
                            ++var33;
                        }
                        if (~((var35 - var34 + 1) * (var33 + 1 + -var32)) <= -5) {
                            int var38 = class207.field2975[var5][var32][var34];
                            class371.method2379(4, var32 * 128, var33 * 128 + 128, var34 * 128, var35 * 128 + 128, var38, var38);
                            for (int var39 = var32; var33 >= var39; ++var39) {
                                for (int var40 = var34; var40 <= var35; ++var40) {
                                    class284.field4138[var5][var39][var40] = (byte) class209.method1483(class284.field4138[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(Z)V", line = 292)
    public static void method295(boolean arg0) {
        field592 = null;
        field598 = null;
        if (arg0) {
            field592 = null;
        }
        field600 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)[I", line = 304)
    public final int[] method44(byte arg0, int arg1) {
        ++field596;
        if (arg0 >= -20) {
            return null;
        } else {
            int[] var3 = super.field551.method185(65280, arg1);
            if (super.field551.field441) {
                int var4 = class410.field5886 / this.field595;
                int var5 = class440.field6297 / this.field593;
                int[] var6;
                if (~var5 >= -1) {
                    var6 = this.method266((byte) -116, 0, 0);
                } else {
                    int var7 = arg1 % var5;
                    var6 = this.method266((byte) -116, class440.field6297 * var7 / var5, 0);
                }
                for (int var8 = 0; ~class410.field5886 < ~var8; ++var8) {
                    if (~var4 >= -1) {
                        var3[var8] = var6[0];
                    } else {
                        int var9 = var8 % var4;
                        var3[var8] = var6[class410.field5886 * var9 / var4];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V", line = 358)
    public class44() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILlf;)V", line = 361)
    public final void method43(int arg0, int arg1, class130 arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field593 = arg2.method837(true);
            }
        } else {
            this.field595 = arg2.method837(true);
        }
        ++field597;
        if (arg1 < 79) {
            field600 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILvq;Lbi;II)V", line = 398)
    public static final void method296(int arg0, int arg1, class269 arg2, class282 arg3, int arg4, int arg5) {
        ++field594;
        class320 var6 = class41.method281(arg3.field4077, true);
        if (~var6.field4680 != 0) {
            int var7;
            if (!arg3.field4117) {
                var7 = 0;
            } else {
                int var8 = arg3.field4072 + arg5;
                var7 = var8 & 3;
            }
            class256 var9 = var6.method2125(var7, arg2, arg3.field4096, (byte) -97);
            if (var9 != null) {
                int var10 = arg3.field4090;
                int var11 = arg3.field4085;
                if ((1 & var7) == arg4) {
                    var10 = arg3.field4085;
                    var11 = arg3.field4090;
                }
                int var12 = var9.method83();
                int var13 = var9.method75();
                if (var6.field4682) {
                    var12 = var10 * 4;
                    var13 = var11 * 4;
                }
                if (~var6.field4679 == -1) {
                    var9.method1774(arg0, -((var11 + -1) * 4) + arg1, var12, var13);
                } else {
                    var9.method74(arg0, -((var11 + -1) * 4) + arg1, var12, var13, 1, -16777216 | var6.field4679, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V", line = 449)
    public static final void method297(int arg0) {
        ++field588;
        class6.method31((byte) 122, false);
        class255.field3774 = 0;
        boolean var1 = true;
        for (int var2 = 0; ~class2.field12.length < ~var2; ++var2) {
            if (class222.field3177[var2] != -1 && class2.field12[var2] == null) {
                class2.field12[var2] = class226.field3370.method643(class222.field3177[var2], 0, true);
                if (class2.field12[var2] == null) {
                    var1 = false;
                    ++class255.field3774;
                }
            }
            if (class403.field5654[var2] != -1 && class75.field991[var2] == null) {
                class75.field991[var2] = class226.field3370.method631(class393.field5531[var2], (byte) 73, class403.field5654[var2], 0);
                if (class75.field991[var2] == null) {
                    var1 = false;
                    ++class255.field3774;
                }
            }
            if (class289.field4210[var2] != -1 && class377.field5378[var2] == null) {
                class377.field5378[var2] = class226.field3370.method643(class289.field4210[var2], 0, true);
                if (class377.field5378[var2] == null) {
                    ++class255.field3774;
                    var1 = false;
                }
            }
            if (~class291.field4236[var2] != 0 && class295.field4271[var2] == null) {
                class295.field4271[var2] = class226.field3370.method643(class291.field4236[var2], 0, true);
                if (class295.field4271[var2] == null) {
                    ++class255.field3774;
                    var1 = false;
                }
            }
            if (class450.field6456 != null && class439.field6265[var2] == null && ~class450.field6456[var2] != 0) {
                class439.field6265[var2] = class226.field3370.method631(class393.field5531[var2], (byte) 77, class450.field6456[var2], 0);
                if (class439.field6265[var2] == null) {
                    var1 = false;
                    ++class255.field3774;
                }
            }
        }
        if (class24.field297 == null) {
            if (class374.field5330 != null && class284.field4140.method641(0, class374.field5330.field2432 + "_staticelements")) {
                if (!class284.field4140.method636(class374.field5330.field2432 + "_staticelements", (byte) 107)) {
                    ++class255.field3774;
                    var1 = false;
                } else {
                    class24.field297 = client.method1173(class311.field4503, class374.field5330.field2432 + "_staticelements", 127, class284.field4140);
                }
            } else {
                class24.field297 = new class30(0);
            }
        }
        if (!var1) {
            class382.field5419 = 1;
        } else {
            boolean var3 = true;
            class275.field3968 = 0;
            for (int var4 = 0; var4 < class2.field12.length; ++var4) {
                byte[] var21 = class75.field991[var4];
                if (var21 != null) {
                    int var22 = (class199.field2844[var4] >> 8) * 64 + -class306.field4459;
                    int var23 = (class199.field2844[var4] & 255) * 64 - class342.field4959;
                    if (class241.field3551) {
                        var22 = 10;
                        var23 = 10;
                    }
                    var3 &= class433.method2705(-1, var22, var21, var23);
                }
                byte[] var24 = class295.field4271[var4];
                if (var24 != null) {
                    int var25 = (class199.field2844[var4] >> 8) * 64 + -class306.field4459;
                    int var26 = (255 & class199.field2844[var4]) * 64 + -class342.field4959;
                    if (class241.field3551) {
                        var26 = 10;
                        var25 = 10;
                    }
                    var3 &= class433.method2705(-1, var25, var24, var26);
                }
            }
            if (!var3) {
                class382.field5419 = 2;
            } else {
                if (class382.field5419 != 0) {
                    class135.method1044(true, 30585, class169.field2394.method2284((byte) -92, class309.field4497) + "<br>(100%)", class402.field5648);
                }
                class127.method769(0);
                class166.method1198(-22156);
                boolean var5 = false;
                if (class59.field786.method930() && class51.field664) {
                    for (int var6 = 0; var6 < class2.field12.length; ++var6) {
                        if (class295.field4271[var6] != null || class377.field5378[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (!class125.field1678) {
                    var7 = class321.field4702[class393.field5533];
                } else {
                    var7 = class246.field3676[class393.field5533];
                }
                if (class59.field786.method918()) {
                    ++var7;
                }
                class181.method1297(4, class80.field1034, class381.field5414, var7, var5, class59.field786.method953() > 0);
                int var8 = 0;
                int var9 = -87 % ((arg0 - -82) / 43);
                while (var8 < 4) {
                    class85.field1090[var8].method277(true);
                    ++var8;
                }
                class397.method2490(1);
                class331.method2173(-69, false);
                class342.method2243((byte) 49);
                class127.method769(0);
                System.gc();
                class6.method31((byte) 84, true);
                class407.method2567(-1863581283, 4, false);
                int[][] var10 = null;
                if (!class241.field3551) {
                    class378.method2413(false, (byte) 102);
                    class53.method342(class181.field2555.field4595[0] >> 3, class181.field2555.field4601[0] >> 3, 8);
                    class373.method2388((byte) 41);
                    class238.method1621(false, 4, class59.field786, (int[][]) null, true);
                    var10 = class207.field2975[0];
                    class6.method31((byte) 67, true);
                    class20.method113(23473, false);
                    if (class439.field6265 != null) {
                        class411.method2603((byte) 58);
                    }
                }
                if (class241.field3551) {
                    class114.method687(false, -8);
                    class53.method342(class181.field2555.field4595[0] >> 3, class181.field2555.field4601[0] >> 3, 8);
                    class373.method2388((byte) 41);
                    class238.method1621(false, 4, class59.field786, (int[][]) null, true);
                    var10 = class207.field2975[0];
                    class6.method31((byte) 29, true);
                    class354.method2317(false, 0);
                }
                class166.method1198(-22156);
                class6.method31((byte) 125, true);
                class358.method2332(4, class59.field786, (class92) null, false, (byte) 14, class85.field1090);
                method294(4, class59.field786, 93);
                class6.method31((byte) 32, true);
                int var11 = class122.field1639;
                if (~var11 < ~class158.field2302) {
                    var11 = class158.field2302;
                }
                if (var11 < class158.field2302 + -1) {
                    var11 = class158.field2302 + -1;
                }
                if (!class296.method2000((byte) -35)) {
                    class340.method2233(var11);
                } else {
                    class340.method2233(0);
                }
                class378.method2412(30);
                if (var5) {
                    class228.method1588(true);
                    class407.method2567(-1863581283, 1, true);
                    if (!class241.field3551) {
                        class378.method2413(true, (byte) -30);
                        class238.method1621(true, 1, class59.field786, var10, true);
                        class6.method31((byte) 26, true);
                        class20.method113(23473, true);
                        method294(1, class59.field786, 99);
                    }
                    if (class241.field3551) {
                        class114.method687(true, -8);
                        class238.method1621(true, 1, class59.field786, var10, true);
                        class6.method31((byte) 82, true);
                        class354.method2317(true, 0);
                    }
                    class166.method1198(-22156);
                    class6.method31((byte) 43, true);
                    class358.method2332(1, class59.field786, class126.field1734[0], true, (byte) 14, class85.field1090);
                    method294(1, class59.field786, 82);
                    class6.method31((byte) 33, true);
                    class378.method2412(-126);
                    class228.method1588(false);
                }
                for (int var12 = 0; ~var12 > -5; ++var12) {
                    for (int var19 = 0; ~var19 > ~class80.field1034; ++var19) {
                        for (int var20 = 0; ~var20 > ~class381.field5414; ++var20) {
                            class122.method738(var12, var19, var20, (byte) -115);
                        }
                    }
                }
                class87.method521(-124);
                class127.method769(0);
                class52.method340((byte) -110);
                class166.method1198(-22156);
                class261.field3860 = false;
                class302.method2034((byte) 104);
                if (class369.field5255 != null && class199.field2847 != null && ~class423.field6041 == -26) {
                    ++class341.field4931;
                    class407.field5761.method2048(2040, 194);
                    class407.field5761.method849(1057001181, (byte) -97);
                }
                if (!class241.field3551) {
                    int var13 = (-(class80.field1034 >> 4) + class327.field4741) / 8;
                    int var14 = (class327.field4741 - -(class80.field1034 >> 4)) / 8;
                    int var15 = (class171.field2415 - (class381.field5414 >> 4)) / 8;
                    int var16 = (class171.field2415 - -(class381.field5414 >> 4)) / 8;
                    for (int var17 = var13 + -1; var14 - -1 >= var17; ++var17) {
                        for (int var18 = var15 + -1; var16 + 1 >= var18; ++var18) {
                            if (~var17 > ~var13 || ~var14 > ~var17 || var18 < var15 || var16 < var18) {
                                class226.field3370.method642("m" + var17 + "_" + var18, -108);
                                class226.field3370.method642("l" + var17 + "_" + var18, -100);
                            }
                        }
                    }
                }
                if (class423.field6041 == 28) {
                    class390.method2463(10, true);
                } else {
                    class390.method2463(30, true);
                    if (class199.field2847 != null) {
                        class407.field5761.method2048(2040, 215);
                    }
                }
                class370.method2378(-1);
                class127.method769(0);
                class380.method2424(9356);
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)V", line = 890)
    public static final void method298(int arg0, int arg1) {
        ++field590;
        if (arg0 != -1) {
            field600 = null;
        }
        class173.field2446.method91(4, arg1);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[[I", line = 901)
    public final int[][] method112(int arg0, int arg1) {
        ++field589;
        int[][] var3 = super.field555.method2070(0, arg1);
        if (super.field555.field4489) {
            int var4 = class410.field5886 / this.field595;
            int var5 = class440.field6297 / this.field593;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method261(0, 28552, class440.field6297 * var6 / var5);
            } else {
                var7 = this.method261(0, 28552, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class410.field5886; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class410.field5886 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return arg0 != 1 ? null : var3;
    }
}
