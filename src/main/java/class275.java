import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class275 {

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lmh;")
    public static class128 field4757 = class22.method156(126, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "[I")
    public static int[] field4762 = new int[100];

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field4760 = 0;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Lmh;")
    public static class128 field4767 = class22.method156(126, "(R");

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Ls;")
    public static class261 field4765 = new class261(50);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Lmh;")
    public static class128 field4770 = class22.method156(126, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field4769 = 0;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public int field4758;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public int field4761;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public int field4766;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Lfb;")
    public static class55 field4772;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V", line = 8)
    public static final void method1928(int arg0, int arg1, int arg2, int arg3) {
        field4754++;
        class229 var4 = class241.method1638(9, -45, arg1);
        var4.method1574(3199);
        var4.field3980 = arg3;
        var4.field3981 = arg0;
        if (arg2 != 1) {
            method1929(-96, -27, 3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V", line = 24)
    public static final void method1929(int arg0, int arg1, int arg2) {
        class104.field1778[arg0] = arg2;
        if (arg1 != -27870) {
            field4760 = -96;
        }
        field4759++;
        class215 var3 = (class215) class301.field5114.method728(false, (long) arg0);
        if (var3 == null) {
            class215 var4 = new class215(class71.method470(true) + 500L);
            class301.field5114.method730(var4, (long) arg0, (byte) -99);
        } else {
            var3.field3789 = class71.method470(true) + 500L;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 50)
    public static void method1930(boolean arg0) {
        if (arg0) {
            field4771 = -22;
        }
        field4772 = null;
        field4762 = null;
        field4767 = null;
        field4770 = null;
        field4765 = null;
        field4757 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([[BI[[FI[[I[[F[[B[Lwc;[[BI[[B[[F)V", line = 68)
    private static final void method1931(byte[][] arg0, int arg1, float[][] arg2, int arg3, int[][] arg4, float[][] arg5, byte[][] arg6, class97[] arg7, byte[][] arg8, int arg9, byte[][] arg10, float[][] arg11) {
        int var12 = -2 % ((-arg1 - 24) / 58);
        for (int var13 = 0; var13 < arg9; var13++) {
            class97 var14 = arg7[var13];
            if (var14.field1686 == arg3) {
                class280 var15 = new class280();
                int var16 = 0;
                int var17 = (var14.field1657 >> 7) - var14.field1646;
                int var18 = (var14.field1660 >> 7) + var14.field1646;
                if (var18 > 103) {
                    var18 = 103;
                }
                int var19 = (var14.field1660 >> 7) - var14.field1646;
                if (var19 < 0) {
                    var16 -= var19;
                    var19 = 0;
                }
                for (int var20 = var19; var20 <= var18; var20++) {
                    short var21 = var14.field1653[var16];
                    int var22 = var17 + (var21 >> 8);
                    int var23 = (var21 & 0xFF) + (var22 - 1);
                    if (var23 > 103) {
                        var23 = 103;
                    }
                    if (var22 < 0) {
                        var22 = 0;
                    }
                    for (int var24 = var22; var24 <= var23; var24++) {
                        int var25 = arg8[var24][var20] & 0xFF;
                        int var26 = arg6[var24][var20] & 0xFF;
                        boolean var27 = false;
                        if (var25 == 0) {
                            if (var26 == 0) {
                                continue;
                            }
                            class201 var28 = class75.method493(var26 - 1, 4);
                            if (var28.field3562 == -1) {
                                continue;
                            }
                            if (arg0[var24][var20] != 0) {
                                int[] var29 = class313.field5285[arg0[var24][var20]];
                                var15.field4846 += ((var29.length >> 1) - 2) * 3;
                                var15.field4843 += var29.length >> 1;
                                continue;
                            }
                        } else if (var26 != 0) {
                            class201 var30 = class75.method493(var26 - 1, 4);
                            if (var30.field3562 == -1) {
                                byte var32 = arg0[var24][var20];
                                if (var32 != 0) {
                                    int[] var33 = class167.field2868[var32];
                                    var15.field4846 += (var33.length >> 1) * 3 - 6;
                                    var15.field4843 += var33.length >> 1;
                                }
                                continue;
                            }
                            byte var31 = arg0[var24][var20];
                            if (var31 != 0) {
                                var27 = true;
                            }
                        }
                        class5 var34 = class314.method2172(arg3, var24, var20);
                        if (var34 != null) {
                            int var35 = (int) (var34.field89 >> 14) & 0x3F;
                            if (var35 == 9) {
                                int var36 = (int) (var34.field89 >> 20) & 0x3;
                                int[] var37 = null;
                                if ((var36 & 0x1) == 0) {
                                    boolean var46 = var22 <= var24 - 1;
                                    boolean var47 = (var24 + 1) <= var23;
                                    if (!var46 && var18 >= (var20 + 1)) {
                                        short var48 = var14.field1653[var16 + 1];
                                        int var49 = var17 + (var48 >> 8);
                                        int var50 = var49 + (var48 & 0xFF);
                                        var46 = var24 > var49 && var50 > var24;
                                    }
                                    if (!var47 && (var20 - 1) >= var19) {
                                        short var51 = var14.field1653[var16 - 1];
                                        int var52 = (var51 >> 8) + var17;
                                        int var53 = (var51 & 0xFF) + var52;
                                        var47 = var52 < var24 && var24 < var53;
                                    }
                                    if (var46 && var47) {
                                        var37 = class313.field5285[0];
                                    } else if (var46) {
                                        var37 = class313.field5285[1];
                                    } else if (var47) {
                                        var37 = class313.field5285[1];
                                    }
                                } else {
                                    boolean var38 = var24 - 1 >= var22;
                                    boolean var39 = var23 >= (var24 + 1);
                                    if (!var38 && var19 <= var20 - 1) {
                                        short var40 = var14.field1653[var16 - 1];
                                        int var41 = (var40 >> 8) + var17;
                                        int var42 = (var40 & 0xFF) + var41;
                                        var38 = var41 < var24 && var24 < var42;
                                    }
                                    if (!var39 && (var20 + 1) <= var18) {
                                        short var43 = var14.field1653[var16 + 1];
                                        int var44 = (var43 >> 8) + var17;
                                        int var45 = var44 + (var43 & 0xFF);
                                        var39 = var24 > var44 && var24 < var45;
                                    }
                                    if (var38 && var39) {
                                        var37 = class313.field5285[0];
                                    } else if (var38) {
                                        var37 = class313.field5285[1];
                                    } else if (var39) {
                                        var37 = class313.field5285[1];
                                    }
                                }
                                if (var37 != null) {
                                    var15.field4846 += (var37.length >> 1) * 3 - 6;
                                    var15.field4843 += var37.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var27) {
                            int[] var55 = class313.field5285[arg0[var24][var20]];
                            int[] var56 = class167.field2868[arg0[var24][var20]];
                            var15.field4846 += ((var55.length >> 1) - 2) * 3;
                            var15.field4846 += (var56.length >> 1) * 3 - 6;
                            var15.field4843 += var55.length >> 1;
                            var15.field4843 += var56.length >> 1;
                        } else {
                            int[] var54 = class313.field5285[0];
                            var15.field4846 += ((var54.length >> 1) - 2) * 3;
                            var15.field4843 += var54.length >> 1;
                        }
                    }
                    var16++;
                }
                var15.method1955();
                int var57 = 0;
                if ((var14.field1660 >> 7) - var14.field1646 < 0) {
                    var57 -= (var14.field1660 >> 7) - var14.field1646;
                }
                for (int var58 = var19; var58 <= var18; var58++) {
                    short var59 = var14.field1653[var57];
                    int var60 = (var59 >> 8) + var17;
                    int var61 = (var59 & 0xFF) + var60 - 1;
                    if (var61 > 103) {
                        var61 = 103;
                    }
                    if (var60 < 0) {
                        var60 = 0;
                    }
                    for (int var62 = var60; var62 <= var61; var62++) {
                        int var63 = arg6[var62][var58] & 0xFF;
                        byte var64 = arg10[var62][var58];
                        boolean var65 = false;
                        int var66 = arg8[var62][var58] & 0xFF;
                        if (var66 == 0) {
                            if (var63 == 0) {
                                continue;
                            }
                            class201 var69 = class75.method493(var63 - 1, 4);
                            if (var69.field3562 == -1) {
                                continue;
                            }
                            if (arg0[var62][var58] != 0) {
                                class88.method551(arg10[var62][var58], var58, arg2, class313.field5285[arg0[var62][var58]], var62, arg11, var14, arg5, (byte) 43, var15, arg4);
                                continue;
                            }
                        } else if (var63 == 0) {
                            var64 = 0;
                        } else {
                            class201 var67 = class75.method493(var63 - 1, 4);
                            if (var67.field3562 == -1) {
                                class88.method551(arg10[var62][var58], var58, arg2, class167.field2868[arg0[var62][var58]], var62, arg11, var14, arg5, (byte) 43, var15, arg4);
                                continue;
                            }
                            byte var68 = arg0[var62][var58];
                            if (var68 != 0) {
                                var65 = true;
                            }
                        }
                        class5 var70 = class314.method2172(arg3, var62, var58);
                        if (var70 != null) {
                            int var71 = (int) (var70.field89 >> 14) & 0x3F;
                            if (var71 == 9) {
                                int[] var72 = null;
                                int var73 = (int) (var70.field89 >> 20) & 0x3;
                                if ((var73 & 0x1) == 0) {
                                    boolean var82 = var62 - 1 >= var60;
                                    if (!var82 && var58 + 1 <= var18) {
                                        short var83 = var14.field1653[var57 + 1];
                                        int var84 = var17 + (var83 >> 8);
                                        int var85 = (var83 & 0xFF) + var84;
                                        var82 = var84 < var62 && var62 < var85;
                                    }
                                    boolean var86 = var61 >= (var62 + 1);
                                    if (!var86 && var58 - 1 >= var19) {
                                        short var87 = var14.field1653[var57 - 1];
                                        int var88 = (var87 >> 8) + var17;
                                        int var89 = (var87 & 0xFF) + var88;
                                        var86 = var62 > var88 && var62 < var89;
                                    }
                                    if (var82 && var86) {
                                        var72 = class313.field5285[0];
                                    } else if (var82) {
                                        var72 = class313.field5285[1];
                                        var64 = 1;
                                    } else if (var86) {
                                        var72 = class313.field5285[1];
                                        var64 = 3;
                                    }
                                } else {
                                    boolean var74 = (var62 - 1) >= var60;
                                    boolean var75 = (var62 + 1) <= var61;
                                    if (!var74 && var19 <= (var58 - 1)) {
                                        short var76 = var14.field1653[var57 - 1];
                                        int var77 = var17 + (var76 >> 8);
                                        int var78 = (var76 & 0xFF) + var77;
                                        var74 = var62 > var77 && var62 < var78;
                                    }
                                    if (!var75 && var18 >= var58 + 1) {
                                        short var79 = var14.field1653[var57 + 1];
                                        int var80 = var17 + (var79 >> 8);
                                        int var81 = (var79 & 0xFF) + var80;
                                        var75 = var62 > var80 && var62 < var81;
                                    }
                                    if (var74 && var75) {
                                        var72 = class313.field5285[0];
                                    } else if (var74) {
                                        var72 = class313.field5285[1];
                                        var64 = 0;
                                    } else if (var75) {
                                        var64 = 2;
                                        var72 = class313.field5285[1];
                                    }
                                }
                                if (var72 != null) {
                                    class88.method551(var64, var58, arg2, var72, var62, arg11, var14, arg5, (byte) 43, var15, arg4);
                                }
                                continue;
                            }
                        }
                        if (var65) {
                            class88.method551(arg10[var62][var58], var58, arg2, class167.field2868[arg0[var62][var58]], var62, arg11, var14, arg5, (byte) 43, var15, arg4);
                            class88.method551(arg10[var62][var58], var58, arg2, class313.field5285[arg0[var62][var58]], var62, arg11, var14, arg5, (byte) 43, var15, arg4);
                        } else {
                            class88.method551(var64, var58, arg2, class313.field5285[0], var62, arg11, var14, arg5, (byte) 43, var15, arg4);
                        }
                    }
                    var57++;
                }
                if (var15.field4833 > 0 && var15.field4844 > 0) {
                    var15.method1956();
                    var14.field1667 = var15;
                }
            }
        }
        field4763++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZIBI[BI[Lid;)V", line = 594)
    public static final void method1932(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, byte arg6, int arg7, byte[] arg8, int arg9, class249[] arg10) {
        field4764++;
        if (!arg4) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if (arg1 + var11 > 0 && (arg1 + var11) < 103 && arg9 + var12 > 0 && arg9 + var12 < 103) {
                        arg10[arg2].field4306[arg1 + var11][arg9 + var12] = class238.method1622(arg10[arg2].field4306[arg1 + var11][arg9 + var12], -16777217);
                    }
                }
            }
        }
        if (arg6 != 21) {
            return;
        }
        byte var13;
        if (arg4) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class194 var14 = new class194(arg8);
        for (int var15 = 0; var15 < var13; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg0 == var15 && var16 >= arg7 && arg7 + 8 > var16 && arg5 <= var17 && (arg5 + 8) > var17) {
                        class3.method21(arg9 + class140.method920(arg3, var17 & 0x7, var16 & 0x7, 1), arg2, arg3, -105, 0, var14, arg4, 0, class55.method371(var16 & 0x7, var17 & 0x7, true, arg3) + arg1);
                    } else {
                        class3.method21(-1, 0, 0, -105, 0, var14, arg4, 0, -1);
                    }
                }
            }
        }
        if (!class247.field4247 || arg4) {
            return;
        }
        class182 var18 = null;
        while (true) {
            while (var14.field3417.length > var14.field3380) {
                int var19 = var14.method1325(7627);
                if (var19 == 0) {
                    var18 = new class182(var14);
                } else if (var19 == 1) {
                    int var20 = var14.method1325(7627);
                    if (var20 > 0) {
                        for (int var21 = 0; var21 < var20; var21++) {
                            class97 var22 = new class97(var14);
                            int var23 = var22.field1657 >> 7;
                            int var24 = var22.field1660 >> 7;
                            if (var22.field1686 == arg0 && arg7 <= var23 && var23 < (arg7 + 8) && var24 >= arg5 && arg5 + 8 > var24) {
                                int var25 = class97.method611(var22.field1657 & 0x3FF, var22.field1660 & 0x3FF, arg3, true) + (arg1 << 7);
                                int var26 = (arg9 << 7) + class153.method1019(arg3, (byte) 85, var22.field1657 & 0x3FF, var22.field1660 & 0x3FF);
                                var22.field1657 = var25;
                                int var27 = var22.field1657 >> 7;
                                var22.field1660 = var26;
                                int var28 = var22.field1660 >> 7;
                                if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                                    var22.field1651 = class250.field4334[var22.field1686][var27][var28] - var22.field1651;
                                    class46.method322(var22);
                                }
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            if (var18 == null) {
                var18 = new class182();
            }
            class178.field3136[arg1 >> 3][arg9 >> 3] = var18;
            break;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lbg;B)V", line = 742)
    public final void method1933(class194 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1325(7627);
            if (var3 == 0) {
                field4756++;
                if (arg1 != 87) {
                    field4765 = (class261) null;
                }
                return;
            }
            this.method1935(true, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI[Lid;)V", line = 763)
    public static final void method1934(boolean arg0, int arg1, class249[] arg2) {
        field4755++;
        if (!arg0) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class301.field5117[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class301.field5117[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg2[var6].method1741(var4, 37, var5);
                            }
                        }
                    }
                }
            }
            class261.field4521 += (int) (Math.random() * 5.0D) - 2;
            if (class261.field4521 < -8) {
                class261.field4521 = -8;
            }
            if (class261.field4521 > 8) {
                class261.field4521 = 8;
            }
            class156.field2684 += (int) (Math.random() * 5.0D) - 2;
            if (class156.field2684 < -16) {
                class156.field2684 = -16;
            }
            if (class156.field2684 > 16) {
                class156.field2684 = 16;
            }
        }
        byte var7;
        if (arg0) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int var8 = class261.field4521 >> 2 << 10;
        int var9 = class156.field2684 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        if (arg1 != -1125844504) {
            return;
        }
        for (int var12 = 0; var12 < var7; var12++) {
            byte[][] var13 = class252.field4355[var12];
            if (!class247.field4247) {
                int var34 = (int) Math.sqrt(5100.0D);
                int var35 = var34 * 768 >> 8;
                for (int var36 = 1; var36 < 103; var36++) {
                    for (int var37 = 1; var37 < 103; var37++) {
                        byte var38 = 74;
                        int var39 = class250.field4334[var12][var37 + 1][var36] - class250.field4334[var12][var37 - 1][var36];
                        int var40 = class250.field4334[var12][var37][var36 + 1] - class250.field4334[var12][var37][var36 - 1];
                        int var41 = (int) Math.sqrt((double) (var39 * var39 + var40 * var40 + 65536));
                        int var42 = (var39 << 8) / var41;
                        int var43 = -65536 / var41;
                        int var44 = (var40 << 8) / var41;
                        int var45 = (var43 * -10 + var42 * -50 + var44 * -50) / var35 + var38;
                        int var46 = (var13[var37][var36] >> 1) + (var13[var37][var36 + 1] >> 3) + (var13[var37][var36 + -1] >> 2) + (var13[var37 + 1][var36] >> 3) + (var13[var37 + -1][var36] >> 2);
                        var11[var37][var36] = var45 - var46;
                    }
                }
            } else if (class90.field1536) {
                for (int var14 = 1; var14 < 103; var14++) {
                    for (int var15 = 1; var15 < 103; var15++) {
                        int var16 = (var13[var15][var14] >> 1) + (var13[var15 - 1][var14] >> 2) + (var13[var15 + 1][var14] >> 3) + (var13[var15][var14 - 1] >> 2) + (var13[var15][var14 + 1] >> 3);
                        byte var17 = 74;
                        var11[var15][var14] = var17 - var16;
                    }
                }
            } else {
                int var18 = (int) class119.field2011[0];
                int var19 = (int) class119.field2011[1];
                int var20 = (int) class119.field2011[2];
                int var21 = (int) Math.sqrt((double) (var18 * var18 + var19 * var19 + var20 * var20));
                int var22 = var21 * 1024 >> 8;
                for (int var23 = 1; var23 < 103; var23++) {
                    for (int var24 = 1; var24 < 103; var24++) {
                        byte var25 = 96;
                        int var26 = class250.field4334[var12][var24 + 1][var23] - class250.field4334[var12][var24 - 1][var23];
                        int var27 = class250.field4334[var12][var24][var23 + 1] - class250.field4334[var12][var24][var23 - 1];
                        int var28 = (int) Math.sqrt((double) (var26 * var26 - (-(var27 * var27) - 65536)));
                        int var29 = -65536 / var28;
                        int var30 = (var26 << 8) / var28;
                        int var31 = (var27 << 8) / var28;
                        int var32 = (var20 * var31 + (var18 * var30 + (var19 * var29))) / var22 + var25;
                        int var33 = (var13[var24][var23 - 1] >> 2) + (var13[var24 + 1][var23] >> 3) + (var13[var24][var23] >> 1) + ((var13[var24 + -1][var23] >> 2) - -(var13[var24][var23 - -1] >> 3));
                        var11[var24][var23] = var32 - (int) ((float) var33 * 1.7F);
                    }
                }
            }
            for (int var47 = 0; var47 < 104; var47++) {
                class314.field5316[var47] = 0;
                class159.field2727[var47] = 0;
                class7.field145[var47] = 0;
                class183.field3205[var47] = 0;
                class176.field3101[var47] = 0;
            }
            for (int var48 = -5; var48 < 104; var48++) {
                for (int var49 = 0; var49 < 104; var49++) {
                    int var50 = var48 + 5;
                    int var10002;
                    if (var50 < 104) {
                        int var51 = class22.field553[var12][var50][var49] & 0xFF;
                        if (var51 > 0) {
                            class225 var52 = class182.method1240((byte) 99, var51 - 1);
                            class314.field5316[var49] += var52.field3939;
                            class159.field2727[var49] += var52.field3922;
                            class7.field145[var49] += var52.field3933;
                            class183.field3205[var49] += var52.field3937;
                            var10002 = class176.field3101[var49]++;
                        }
                    }
                    int var53 = var48 - 5;
                    if (var53 >= 0) {
                        int var54 = class22.field553[var12][var53][var49] & 0xFF;
                        if (var54 > 0) {
                            class225 var55 = class182.method1240((byte) 99, var54 - 1);
                            class314.field5316[var49] -= var55.field3939;
                            class159.field2727[var49] -= var55.field3922;
                            class7.field145[var49] -= var55.field3933;
                            class183.field3205[var49] -= var55.field3937;
                            var10002 = class176.field3101[var49]--;
                        }
                    }
                }
                if (var48 >= 0) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 104; var61++) {
                        int var62 = var61 + 5;
                        if (var62 < 104) {
                            var58 += class183.field3205[var62];
                            var57 += class159.field2727[var62];
                            var60 += class7.field145[var62];
                            var56 += class314.field5316[var62];
                            var59 += class176.field3101[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0) {
                            var58 -= class183.field3205[var63];
                            var57 -= class159.field2727[var63];
                            var56 -= class314.field5316[var63];
                            var60 -= class7.field145[var63];
                            var59 -= class176.field3101[var63];
                        }
                        if (var61 >= 0 && var59 > 0) {
                            var10[var48][var61] = class103.method639(true, var57 / var59, var56 * 256 / var58, var60 / var59);
                        }
                    }
                }
            }
            for (int var64 = 1; var64 < 103; var64++) {
                label771: for (int var65 = 1; var65 < 103; var65++) {
                    if (arg0 || class117.method702(true) || (class301.field5117[0][var64][var65] & 0x2) != 0 || (class301.field5117[var12][var64][var65] & 0x10) == 0 && class287.method1979(var12, var65, (byte) -82, var64) == class281.field4855) {
                        if (var12 < class50.field986) {
                            class50.field986 = var12;
                        }
                        int var66 = class22.field553[var12][var64][var65] & 0xFF;
                        int var67 = class157.field2694[var12][var64][var65] & 0xFF;
                        if (var66 > 0 || var67 > 0) {
                            int var68 = class250.field4334[var12][var64][var65];
                            int var69 = class250.field4334[var12][var64 + 1][var65];
                            int var70 = class250.field4334[var12][var64 + 1][var65 + 1];
                            int var71 = class250.field4334[var12][var64][var65 + 1];
                            if (var12 > 0) {
                                boolean var72 = true;
                                if (var66 == 0 && class121.field2048[var12][var64][var65] != 0) {
                                    var72 = false;
                                }
                                if (var67 > 0 && !class75.method493(var67 - 1, arg1 + 1125844508).field3565) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var69 && var68 == var70 && var68 == var71) {
                                    class4.field80[var12][var64][var65] = class279.method1951(class4.field80[var12][var64][var65], 4);
                                }
                            }
                            int var73;
                            int var76;
                            if (var66 > 0) {
                                var73 = var10[var64][var65];
                                int var74 = (var73 & 0x7F) + var9;
                                if (var74 < 0) {
                                    var74 = 0;
                                } else if (var74 > 127) {
                                    var74 = 127;
                                }
                                int var75 = (var8 + var73 & 0xFC00) + (var73 & 0x380) + var74;
                                var76 = class141.field2413[class166.method1087(126, 96, var75)];
                            } else {
                                var76 = 0;
                                var73 = -1;
                            }
                            int var77 = var11[var64][var65];
                            int var78 = var11[var64 + 1][var65];
                            int var79 = var11[var64 + 1][var65 + 1];
                            int var80 = var11[var64][var65 + 1];
                            if (var67 == 0) {
                                class156.method1034(var12, var64, var65, 0, 0, -1, var68, var69, var70, var71, class166.method1087(126, var77, var73), class166.method1087(126, var78, var73), class166.method1087(arg1 + 1125844630, var79, var73), class166.method1087(126, var80, var73), 0, 0, 0, 0, var76, 0);
                                if (class247.field4247 && var12 > 0 && var73 != -1 && class182.method1240((byte) 99, var66 - 1).field3929) {
                                    class312.method2132(0, 0, true, false, var64, var65, var68 - class250.field4334[0][var64][var65], -class250.field4334[0][var64 - -1][var65] + var69, var70 - class250.field4334[0][var64 + 1][var65 + 1], -class250.field4334[0][var64][var65 + 1] + var71);
                                }
                                if (class247.field4247 && !arg0 && class91.field1557 != null && var12 == 0) {
                                    for (int var96 = var64 - 1; var96 <= var64 + 1; var96++) {
                                        for (int var97 = var65 - 1; var97 <= var65 + 1; var97++) {
                                            if ((var64 != var96 || var65 != var97) && var96 >= 0 && var96 < 104 && var97 >= 0 && var97 < 104) {
                                                int var98 = class157.field2694[var12][var96][var97] & 0xFF;
                                                if (var98 != 0) {
                                                    class201 var99 = class75.method493(var98 - 1, arg1 ^ 0xBCE4F9EC);
                                                    if (var99.field3566 != -1 && class141.field2419.method101(var99.field3566, arg1 + 1125844416) == 4) {
                                                        class91.field1557[var64][var65] = (var99.field3555 << 24) + var99.field3558;
                                                        continue label771;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var81 = class121.field2048[var12][var64][var65] + 1;
                                byte var82 = class9.field205[var12][var64][var65];
                                class201 var83 = class75.method493(var67 - 1, 4);
                                if (class247.field4247 && !arg0 && class91.field1557 != null && var12 == 0) {
                                    if (var83.field3566 != -1 && class141.field2419.method101(var83.field3566, -79) == 4) {
                                        class91.field1557[var64][var65] = (var83.field3555 << 24) + var83.field3558;
                                    } else {
                                        label737: for (int var84 = var64 - 1; var84 <= var64 + 1; var84++) {
                                            for (int var85 = var65 - 1; var85 <= var65 + 1; var85++) {
                                                if ((var64 != var84 || var65 != var85) && var84 >= 0 && var84 < 104 && var85 >= 0 && var85 < 104) {
                                                    int var86 = class157.field2694[var12][var84][var85] & 0xFF;
                                                    if (var86 != 0) {
                                                        class201 var87 = class75.method493(var86 - 1, 4);
                                                        if (var87.field3566 != -1 && class141.field2419.method101(var87.field3566, arg1 + 1125844609) == 4) {
                                                            class91.field1557[var64][var65] = (var87.field3555 << 24) + var87.field3558;
                                                            break label737;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var88 = var83.field3566;
                                if (var88 >= 0 && !class141.field2419.method105(var88, (byte) 42)) {
                                    var88 = -1;
                                }
                                int var89;
                                int var90;
                                if (var88 >= 0) {
                                    var89 = class141.field2413[class284.method1971(class141.field2419.method97(var88, 0), -126, 96)];
                                    var90 = -1;
                                } else if (var83.field3562 == -1) {
                                    var89 = 0;
                                    var90 = -2;
                                } else {
                                    var90 = var83.field3562;
                                    int var91 = (var90 & 0x7F) + var9;
                                    if (var91 < 0) {
                                        var91 = 0;
                                    } else if (var91 > 127) {
                                        var91 = 127;
                                    }
                                    int var92 = (var8 + var90 & 0xFC00) - (-(var90 & 0x380) - var91);
                                    var89 = class141.field2413[class284.method1971(var92, arg1 + 1125844591, 96)];
                                }
                                if (var83.field3556 >= 0) {
                                    int var93 = var83.field3556;
                                    int var94 = (var93 & 0x7F) + var9;
                                    if (var94 < 0) {
                                        var94 = 0;
                                    } else if (var94 > 127) {
                                        var94 = 127;
                                    }
                                    int var95 = (var93 + var8 & 0xFC00) + (var93 & 0x380) + var94;
                                    var89 = class141.field2413[class284.method1971(var95, 115, 96)];
                                }
                                class156.method1034(var12, var64, var65, var81, var82, var88, var68, var69, var70, var71, class166.method1087(126, var77, var73), class166.method1087(arg1 ^ 0xBCE4F996, var78, var73), class166.method1087(126, var79, var73), class166.method1087(126, var80, var73), class284.method1971(var90, 118, var77), class284.method1971(var90, arg1 + 1125844435, var78), class284.method1971(var90, -121, var79), class284.method1971(var90, 79, var80), var76, var89);
                                if (class247.field4247 && var12 > 0) {
                                    class312.method2132(var81, var82, var90 == -2 || !var83.field3569, var73 == -1 || !class182.method1240((byte) 99, var66 - 1).field3929, var64, var65, var68 - class250.field4334[0][var64][var65], var69 - class250.field4334[0][var64 - -1][var65], var70 - class250.field4334[0][var64 + 1][var65 + 1], -class250.field4334[0][var64][var65 + 1] + var71);
                                }
                            }
                        }
                    }
                }
            }
            if (class247.field4247) {
                float[][] var100 = new float[105][105];
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                int[][] var103 = class250.field4334[var12];
                int var104 = 1;
                while (true) {
                    if (var104 > 103) {
                        if (arg0) {
                            class154[] var114 = class161.method1064(var10, var100, class121.field2048[var12], var12, var101, class250.field4334[var12], -48, class91.field1557, var102, var11, class301.field5117, class267.field4626[0], class157.field2694[var12], class22.field553[var12], class9.field205[var12]);
                            class104.method644(var12, var114);
                            break;
                        }
                        class154[] var109 = class161.method1064(var10, var100, class121.field2048[var12], var12, var101, class250.field4334[var12], 104, (int[][]) null, var102, var11, class301.field5117, (int[][]) null, class157.field2694[var12], class22.field553[var12], class9.field205[var12]);
                        class154[] var110 = class110.method669(class9.field205[var12], var101, var100, class22.field553[var12], var102, class301.field5117, class121.field2048[var12], var11, class157.field2694[var12], var12, class250.field4334[var12], false);
                        class154[] var111 = new class154[var109.length + var110.length];
                        for (int var112 = 0; var112 < var109.length; var112++) {
                            var111[var112] = var109[var112];
                        }
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var111[var109.length + var113] = var110[var113];
                        }
                        class104.method644(var12, var111);
                        method1931(class121.field2048[var12], arg1 + 1125844390, var102, var12, class250.field4334[var12], var100, class157.field2694[var12], class46.field919, class22.field553[var12], class46.field931, class9.field205[var12], var101);
                        break;
                    }
                    for (int var105 = 1; var105 <= 103; var105++) {
                        int var106 = var103[var105 + 1][var104] - var103[var105 - 1][var104];
                        int var107 = var103[var105][var104 + 1] - var103[var105][var104 - 1];
                        float var108 = (float) Math.sqrt((double) (var106 * var106 - (-(var107 * var107) - 65536)));
                        var100[var105][var104] = (float) var106 / var108;
                        var102[var105][var104] = -256.0F / var108;
                        var101[var105][var104] = (float) var107 / var108;
                    }
                    var104++;
                }
            }
            class22.field553[var12] = (byte[][]) null;
            class157.field2694[var12] = (byte[][]) null;
            class121.field2048[var12] = (byte[][]) null;
            class9.field205[var12] = (byte[][]) null;
            class252.field4355[var12] = (byte[][]) null;
        }
        class105.method646(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var115 = 0; var115 < 104; var115++) {
            for (int var116 = 0; var116 < 104; var116++) {
                if ((class301.field5117[1][var115][var116] & 0x2) == 2) {
                    class128.method860(var115, var116);
                }
            }
        }
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 <= 104; var118++) {
                for (int var119 = 0; var119 <= 104; var119++) {
                    if ((class4.field80[var117][var119][var118] & 0x1) != 0) {
                        int var120 = var118;
                        int var121 = var118;
                        int var122 = var117;
                        while (var121 < 104 && (class4.field80[var117][var119][var121 + 1] & 0x1) != 0) {
                            var121++;
                        }
                        int var123 = var117;
                        while (var120 > 0 && (class4.field80[var117][var119][var120 - 1] & 0x1) != 0) {
                            var120--;
                        }
                        label454: while (var123 > 0) {
                            for (int var124 = var120; var124 <= var121; var124++) {
                                if ((class4.field80[var123 - 1][var119][var124] & 0x1) == 0) {
                                    break label454;
                                }
                            }
                            var123--;
                        }
                        label443: while (var122 < 3) {
                            for (int var125 = var120; var125 <= var121; var125++) {
                                if ((class4.field80[var122 + 1][var119][var125] & 0x1) == 0) {
                                    break label443;
                                }
                            }
                            var122++;
                        }
                        int var126 = (var121 + 1 - var120) * (var122 + 1 - var123);
                        if (var126 >= 8) {
                            int var127 = class250.field4334[var123][var119][var120];
                            short var128 = 240;
                            int var129 = class250.field4334[var122][var119][var120] - var128;
                            class57.method381(1, var119 * 128, var119 * 128, var120 * 128, var121 * 128 + 128, var129, var127);
                            for (int var130 = var123; var130 <= var122; var130++) {
                                for (int var131 = var120; var131 <= var121; var131++) {
                                    class4.field80[var130][var119][var131] = class238.method1622(class4.field80[var130][var119][var131], -2);
                                }
                            }
                        }
                    }
                    if ((class4.field80[var117][var119][var118] & 0x2) != 0) {
                        int var132;
                        for (var132 = var119; var132 > 0 && (class4.field80[var117][var132 - 1][var118] & 0x2) != 0; var132--) {
                        }
                        int var133;
                        for (var133 = var119; var133 < 104 && (class4.field80[var117][var133 + 1][var118] & 0x2) != 0; var133++) {
                        }
                        int var134 = var117;
                        int var135 = var117;
                        label508: while (var134 > 0) {
                            for (int var136 = var132; var136 <= var133; var136++) {
                                if ((class4.field80[var134 - 1][var136][var118] & 0x2) == 0) {
                                    break label508;
                                }
                            }
                            var134--;
                        }
                        label497: while (var135 < 3) {
                            for (int var137 = var132; var137 <= var133; var137++) {
                                if ((class4.field80[var135 + 1][var137][var118] & 0x2) == 0) {
                                    break label497;
                                }
                            }
                            var135++;
                        }
                        int var138 = (var133 + 1 - var132) * (var135 + 1 - var134);
                        if (var138 >= 8) {
                            int var139 = class250.field4334[var134][var132][var118];
                            short var140 = 240;
                            int var141 = class250.field4334[var135][var132][var118] - var140;
                            class57.method381(2, var132 * 128, var133 * 128 + 128, var118 * 128, var118 * 128, var141, var139);
                            for (int var142 = var134; var142 <= var135; var142++) {
                                for (int var143 = var132; var143 <= var133; var143++) {
                                    class4.field80[var142][var143][var118] = class238.method1622(class4.field80[var142][var143][var118], -3);
                                }
                            }
                        }
                    }
                    if ((class4.field80[var117][var119][var118] & 0x4) != 0) {
                        int var144 = var119;
                        int var145 = var118;
                        int var146 = var118;
                        int var147 = var119;
                        while (var145 > 0 && (class4.field80[var117][var119][var145 - 1] & 0x4) != 0) {
                            var145--;
                        }
                        while (var146 < 104 && (class4.field80[var117][var119][var146 + 1] & 0x4) != 0) {
                            var146++;
                        }
                        label563: while (var147 > 0) {
                            for (int var148 = var145; var148 <= var146; var148++) {
                                if ((class4.field80[var117][var147 - 1][var148] & 0x4) == 0) {
                                    break label563;
                                }
                            }
                            var147--;
                        }
                        label552: while (var144 < 104) {
                            for (int var149 = var145; var149 <= var146; var149++) {
                                if ((class4.field80[var117][var144 + 1][var149] & 0x4) == 0) {
                                    break label552;
                                }
                            }
                            var144++;
                        }
                        if (((var144 + 1 - var147) * (var146 + 1 - var145)) >= 4) {
                            int var150 = class250.field4334[var117][var147][var145];
                            class57.method381(4, var147 * 128, var144 * 128 + 128, var145 * 128, var146 * 128 + 128, var150, var150);
                            for (int var151 = var147; var151 <= var144; var151++) {
                                for (int var152 = var145; var152 <= var146; var152++) {
                                    class4.field80[var117][var151][var152] = class238.method1622(class4.field80[var117][var151][var152], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZILbg;)V", line = 1742)
    private final void method1935(boolean arg0, int arg1, class194 arg2) {
        field4768++;
        if (!arg0) {
            method1930(false);
        }
        if (arg1 == 1) {
            this.field4766 = arg2.method1308(-81);
            this.field4761 = arg2.method1325(7627);
            this.field4758 = arg2.method1325(7627);
        }
    }
}
