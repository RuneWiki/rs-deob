import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class760 extends class488 {

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
    public int field10440 = 99;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "Log;")
    public static class673 field10443 = new class673();

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "[I")
    public static int[] field10449 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "Ljb;")
    public static class519 field10446 = new class519(69, -2);

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    public static int field10435;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
    public static int field10436;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
    public static int field10437;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    public static int field10438;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
    public static int field10439;

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
    public static int field10441;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
    public static int field10442;

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    public static int field10444;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    public static int field10445;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
    public static int field10447;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
    public static int field10448;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field10450;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIII)Lnf;")
    public final class602 method4179(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field10447;
        if (arg1 != 7) {
            field10443 = null;
        }
        class602 var6 = null;
        if (~arg3 == -1) {
            var6 = (class602) class634.method3501(arg4, arg0, arg2);
        }
        if (arg3 == 1) {
            var6 = (class602) class506.method2944(arg4, arg0, arg2);
        }
        if (arg3 == 2) {
            var6 = (class602) class4.method28(arg4, arg0, arg2, field10450 != null ? field10450 : (field10450 = method4192("nf")));
        }
        if (arg3 == 3) {
            var6 = (class602) class257.method1754(arg4, arg0, arg2);
        }
        return var6;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIBLeq;ILha;I)V")
    public final void method4180(int arg0, int arg1, byte arg2, class224 arg3, int arg4, class66 arg5, int arg6) {
        ++field10441;
        if (arg2 <= 99) {
            method4185(-70);
        }
        class602 var8 = this.method4179(arg1, 7, arg0, arg4, arg6);
        if (var8 != null) {
            class412 var9 = class210.field2705.method1362(0, var8.method1748(5875));
            int var10 = var8.method1750(29244);
            int var11 = var8.method1744(21215);
            if (var9.method2477(1635)) {
                class214.method1384(arg0, 17617, arg6, arg1, var9);
            }
            if (var8.method1747((byte) 20)) {
                var8.method1742(arg5, (byte) 109);
            }
            if (~arg4 != -1) {
                if (~arg4 != -2) {
                    if (~arg4 == -3) {
                        class612.method3407(arg6, arg1, arg0, field10450 != null ? field10450 : (field10450 = method4192("nf")));
                        if (var9.field5895 != 0 && ~super.field6804 < ~(var9.field5851 + arg1) && ~super.field6813 < ~(var9.field5851 + arg0) && ~super.field6804 < ~(var9.field5853 + arg1) && ~super.field6813 < ~(var9.field5853 + arg0)) {
                            arg3.method1421(var9.field5853, 512, arg0, var9.field5851, !var9.field5931, arg1, var11, var9.field5885);
                        }
                        if (~var10 == -10) {
                            if (~(var11 & 1) != -1) {
                                class214.method1387(16, arg6, arg1, (byte) -122, arg0);
                                return;
                            }
                            class214.method1387(8, arg6, arg1, (byte) -124, arg0);
                            return;
                        }
                    } else {
                        if (arg4 != 3) {
                            return;
                        }
                        class254.method1692(arg6, arg1, arg0);
                        if (~var9.field5895 != -2) {
                            return;
                        }
                        arg3.method1436(arg0, arg1, -17953);
                    }
                    return;
                } else {
                    class5.method31(arg6, arg1, arg0);
                    return;
                }
            }
            class45.method300(arg6, arg1, arg0);
            if (~var9.field5895 != -1) {
                arg3.method1433(arg1, arg0, (byte) -9, !var9.field5931, var9.field5885, var10, var11);
            }
            if (var9.field5849 == 1) {
                if (~var11 == -1) {
                    class214.method1387(1, arg6, arg1, (byte) -125, arg0);
                    return;
                }
                if (~var11 == -2) {
                    class214.method1387(2, arg6, arg1, (byte) -127, arg0 + 1);
                    return;
                }
                if (~var11 != -3) {
                    if (~var11 == -4) {
                        class214.method1387(2, arg6, arg1, (byte) -123, arg0);
                        return;
                    }
                } else {
                    class214.method1387(1, arg6, arg1 + 1, (byte) -128, arg0);
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
    public static void method4181(boolean arg0) {
        field10443 = null;
        if (!arg0) {
            field10449 = null;
        }
        field10446 = null;
        field10449 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIILha;Ldt;[I)V")
    public final void method4182(int arg0, int arg1, int arg2, class66 arg3, class254 arg4, int[] arg5) {
        ++field10444;
        if (!super.field6799) {
            boolean var7 = false;
            class74 var8 = null;
            if (arg0 < 52) {
                this.method4187(false, (byte) -20, (class66) null);
            }
            if (arg5 != null) {
                arg5[0] = -1;
            }
            while (true) {
                int var19;
                label313: do {
                    while (true) {
                        while (arg4.field3789.length > arg4.field3725) {
                            int var18 = arg4.method1731((byte) 64);
                            if (~var18 != -1) {
                                if (~var18 == -2) {
                                    var19 = arg4.method1731((byte) 64);
                                    continue label313;
                                }
                                if (~var18 == -3) {
                                    if (var8 == null) {
                                        var8 = new class74();
                                    }
                                    var8.method603(-90, arg4);
                                } else if (var18 == 128) {
                                    if (arg5 != null) {
                                        arg5[0] = arg4.method1728((byte) 62);
                                        arg5[1] = arg4.method1695(423951304);
                                        arg5[2] = arg4.method1695(423951304);
                                        arg5[3] = arg4.method1695(423951304);
                                        arg5[4] = arg4.method1728((byte) 124);
                                    } else {
                                        arg4.field3725 += 10;
                                    }
                                } else {
                                    if (var18 != 129) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field6787 == null) {
                                        super.field6787 = new byte[4][][];
                                    }
                                    for (int var28 = 0; ~var28 > -5; ++var28) {
                                        byte var29 = arg4.method1737(true);
                                        if (~var29 == -1 && super.field6787[var28] != null) {
                                            int var30 = arg2;
                                            int var31 = arg2 + 64;
                                            int var32 = arg1;
                                            if (var31 >= 0) {
                                                if (super.field6804 <= var31) {
                                                    var31 = super.field6804;
                                                }
                                            } else {
                                                var31 = 0;
                                            }
                                            int var33 = arg1 - -64;
                                            if (~arg1 <= -1) {
                                                if (~arg1 <= ~super.field6813) {
                                                    var32 = super.field6813;
                                                }
                                            } else {
                                                var32 = 0;
                                            }
                                            if (arg2 < 0) {
                                                var30 = 0;
                                            } else if (~arg2 <= ~super.field6804) {
                                                var30 = super.field6804;
                                            }
                                            if (~var33 <= -1) {
                                                if (~var33 <= ~super.field6813) {
                                                    var33 = super.field6813;
                                                }
                                            } else {
                                                var33 = 0;
                                            }
                                            while (~var31 < ~var30) {
                                                while (~var33 < ~var32) {
                                                    super.field6787[var28][var30][var32] = 0;
                                                    ++var32;
                                                }
                                                ++var30;
                                            }
                                        } else if (~var29 != -2) {
                                            if (~var29 == -3) {
                                                if (super.field6787[var28] == null) {
                                                    super.field6787[var28] = new byte[super.field6804 - -1][super.field6813 + 1];
                                                }
                                                if (var28 > 0) {
                                                    int var34 = arg2;
                                                    int var35 = arg2 + 64;
                                                    int var36 = arg1;
                                                    int var37 = arg1 + 64;
                                                    if (arg2 >= 0) {
                                                        if (arg2 >= super.field6804) {
                                                            var34 = super.field6804;
                                                        }
                                                    } else {
                                                        var34 = 0;
                                                    }
                                                    if (var35 < 0) {
                                                        var35 = 0;
                                                    } else if (~super.field6804 >= ~var35) {
                                                        var35 = super.field6804;
                                                    }
                                                    if (~arg1 <= -1) {
                                                        if (~super.field6813 >= ~arg1) {
                                                            var36 = super.field6813;
                                                        }
                                                    } else {
                                                        var36 = 0;
                                                    }
                                                    if (var37 < 0) {
                                                        var37 = 0;
                                                    } else if (~super.field6813 >= ~var37) {
                                                        var37 = super.field6813;
                                                    }
                                                    while (~var35 < ~var34) {
                                                        while (var36 < var37) {
                                                            super.field6787[var28][var34][var36] = super.field6787[var28 - 1][var34][var36];
                                                            ++var36;
                                                        }
                                                        ++var34;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (super.field6787[var28] == null) {
                                                super.field6787[var28] = new byte[super.field6804 + 1][super.field6813 + 1];
                                            }
                                            for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                                for (int var39 = 0; var39 < 64; var39 += 4) {
                                                    byte var40 = arg4.method1737(true);
                                                    for (int var41 = var38 - -arg2; ~var41 > ~(var38 - (-arg2 - 4)); ++var41) {
                                                        for (int var42 = arg1 + var39; arg1 + var39 + 4 > var42; ++var42) {
                                                            if (var41 >= 0 && ~super.field6804 < ~var41 && ~var42 <= -1 && super.field6813 > var42) {
                                                                super.field6787[var28][var41][var42] = var40;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var7 = true;
                                }
                            } else {
                                var8 = new class74(arg4);
                            }
                        }
                        if (var8 != null) {
                            for (int var9 = 0; var9 < 8; ++var9) {
                                for (int var10 = 0; var10 < 8; ++var10) {
                                    int var11 = (arg2 >> 3) - -var9;
                                    int var12 = (arg1 >> 3) - -var10;
                                    if (var11 >= 0 && ~var11 > ~(super.field6804 >> 3) && ~var12 <= -1 && var12 < super.field6813 >> 3) {
                                        class531.method3069(600, var11, var8, var12);
                                    }
                                }
                            }
                        }
                        if (!var7 && super.field6787 != null) {
                            for (int var13 = 0; var13 < 4; ++var13) {
                                if (super.field6787[var13] != null) {
                                    for (int var14 = 0; ~var14 > -17; ++var14) {
                                        for (int var15 = 0; ~var15 > -17; ++var15) {
                                            int var16 = (arg2 >> 2) + var14;
                                            int var17 = (arg1 >> 2) - -var15;
                                            if (~var16 <= -1 && var16 < 26 && ~var17 <= -1 && var17 < 26) {
                                                super.field6787[var13][var16][var17] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (~var19 >= -1);
                for (int var20 = 0; var20 < var19; ++var20) {
                    class447 var21 = new class447(arg3, arg4, 2);
                    if (var21.field6427 == 31) {
                        class563 var22 = class224.field2905.method4001(true, arg4.method1728((byte) 20));
                        var21.method2662(var22.field7710, -124, var22.field7711, var22.field7705, var22.field7704);
                    }
                    if (arg3.method489() > 0) {
                        class127 var23 = var21.field6422;
                        int var24 = (arg2 << 9) + var23.method899(true);
                        int var25 = var23.method901((byte) -115) - -(arg1 << 9);
                        int var26 = var24 >> 9;
                        int var27 = var25 >> 9;
                        if (var26 >= 0 && var27 >= 0 && var26 < super.field6804 && var27 < super.field6813) {
                            var23.method905((byte) 28, var24, super.field6792[var21.field6434][var26][var27] - var23.method904(90), var25);
                            class422.method2538(var21);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)Z")
    public static final boolean method4183(byte arg0, int arg1, int arg2) {
        ++field10442;
        int var3 = 81 / ((-63 - arg0) / 46);
        return ~(arg2 & 52) != -1;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(IIIZ)V")
    public class760(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class107.field1511, class103.field1471);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Leq;ILha;IIIIIIII)V")
    public final void method4184(class224 arg0, int arg1, class66 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field10438;
        if (~class125.field1721.field5155.method591(43) != -1 || class616.method3419(arg8, class786.field10794, -1, arg7, arg6)) {
            if (arg4 < this.field10440) {
                this.field10440 = arg4;
            }
            class412 var12 = class210.field2705.method1362(0, arg5);
            if (class125.field1721.field5167.method1438(43) != 0 || !var12.field5864) {
                int var13;
                int var14;
                if (arg9 != 1 && arg9 != 3) {
                    var13 = var12.field5853;
                    var14 = var12.field5851;
                } else {
                    var13 = var12.field5851;
                    var14 = var12.field5853;
                }
                int var15;
                int var16;
                if (super.field6804 >= arg6 + var14) {
                    var15 = arg6 - -(var14 >> 1);
                    var16 = (var14 + 1 >> 1) + arg6;
                } else {
                    var16 = arg6 + 1;
                    var15 = arg6;
                }
                int var17;
                int var18;
                if (~(arg8 + var13) >= ~super.field6813) {
                    var17 = (var13 >> 1) + arg8;
                    var18 = (var13 + 1 >> 1) + arg8;
                } else {
                    var18 = arg8 + 1;
                    var17 = arg8;
                }
                int var19 = -5 % ((arg3 - 40) / 62);
                class295 var20 = class645.field8694[arg7];
                int var21 = var20.method1898(var17, var15, (byte) -47) - (-var20.method1898(var17, var16, (byte) -85) - var20.method1898(var18, var15, (byte) -97) - var20.method1898(var18, var16, (byte) -107)) >> 2;
                int var22 = (arg6 << 9) + (var14 << 8);
                int var23 = (arg8 << 9) - -(var13 << 8);
                boolean var24 = class250.field3499 && !super.field6799 && var12.field5906;
                if (var12.method2477(1635)) {
                    class603.method3373(arg9, arg4, var12, 19515, arg6, (class22) null, arg8, (class758) null);
                }
                boolean var25 = ~arg1 == 0 && var12.field5844 == -1 && var12.field5893 == null && var12.field5919 == null && !var12.field5903 && !var12.field5854;
                if (!class385.field5604 || (!class651.method3622(-1, arg10) || ~var12.field5849 == -2) && (!class181.method1230(arg10, -18) || var12.field5849 != 0)) {
                    if (arg10 == 22) {
                        if (~class125.field1721.field5166.method2848(43) != -1 || ~var12.field5905 != -1 || var12.field5895 == 1 || var12.field5904) {
                            class629 var27;
                            if (var25) {
                                class782 var26 = new class782(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, arg9, var24);
                                if (var26.method1747((byte) 107)) {
                                    var26.method1752(arg2, (byte) -62);
                                }
                                var27 = var26;
                            } else {
                                var27 = new class618(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, arg9, arg1);
                            }
                            class272.method1805(arg4, arg6, arg8, var27);
                            if (var12.field5895 == 1 && arg0 != null) {
                                arg0.method1432(arg8, -1537, arg6);
                            }
                        }
                    } else if (arg10 != 10 && arg10 != 11) {
                        if (arg10 >= 12 && arg10 <= 17 || arg10 >= 18 && arg10 <= 21) {
                            class539 var28;
                            if (!var25) {
                                var28 = new class344(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, arg6, arg6 + var14 - 1, arg8, arg8 - 1 + var13, arg10, arg9, arg1);
                            } else {
                                class256 var29 = new class256(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, arg6, arg6 + -1 - -var14, arg8, arg8 + -1 + var13, arg10, arg9, var24);
                                var28 = var29;
                                if (var29.method1747((byte) -103)) {
                                    var29.method1752(arg2, (byte) -45);
                                }
                            }
                            class359.method2278(var28, false);
                            if (class250.field3499 && !super.field6799 && arg10 >= 12 && arg10 <= 17 && arg10 != 13 && arg4 > 0 && ~var12.field5849 != -1) {
                                super.field6794[arg4][arg6][arg8] = (byte) class670.method3699(super.field6794[arg4][arg6][arg8], 4);
                            }
                            if (~var12.field5895 != -1 && arg0 != null) {
                                arg0.method1431(arg6, !var12.field5931, var12.field5885, arg8, var13, var14, true);
                            }
                        } else if (~arg10 == -1) {
                            int var30 = var12.field5849;
                            if (class742.field10037 && var12.field5849 == -1) {
                                var30 = 1;
                            }
                            class481 var32;
                            if (var25) {
                                class278 var31 = new class278(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, arg10, arg9, var24);
                                var32 = var31;
                                if (var31.method1747((byte) 74)) {
                                    var31.method1752(arg2, (byte) -27);
                                }
                            } else {
                                var32 = new class515(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, arg10, arg9, arg1);
                            }
                            class494.method2910(arg4, arg6, arg8, var32, (class481) null);
                            if (~arg9 != -1) {
                                if (~arg9 != -2) {
                                    if (~arg9 != -3) {
                                        if (arg9 == 3) {
                                            if (class250.field3499 && var12.field5890) {
                                                var20.method204(arg6, arg8, 50);
                                                var20.method204(arg6 + 1, arg8, 50);
                                            }
                                            if (var30 == 1 && !super.field6799) {
                                                class305.method1979(var12.field5867, var12.field5914, arg6, arg8, 2, false, arg4);
                                            }
                                        }
                                    } else {
                                        if (class250.field3499 && var12.field5890) {
                                            var20.method204(arg6 + 1, arg8, 50);
                                            var20.method204(arg6 - -1, arg8 + 1, 50);
                                        }
                                        if (var30 == 1 && !super.field6799) {
                                            class305.method1979(-var12.field5867, var12.field5914, arg6 + 1, arg8, 1, false, arg4);
                                        }
                                    }
                                } else {
                                    if (class250.field3499 && var12.field5890) {
                                        var20.method204(arg6, arg8 + 1, 50);
                                        var20.method204(arg6 - -1, arg8 + 1, 50);
                                    }
                                    if (var30 == 1 && !super.field6799) {
                                        class305.method1979(-var12.field5867, var12.field5914, arg6, arg8 + 1, 2, false, arg4);
                                    }
                                }
                            } else {
                                if (class250.field3499 && var12.field5890) {
                                    var20.method204(arg6, arg8, 50);
                                    var20.method204(arg6, arg8 + 1, 50);
                                }
                                if (~var30 == -2 && !super.field6799) {
                                    class305.method1979(var12.field5867, var12.field5914, arg6, arg8, 1, false, arg4);
                                }
                            }
                            if (var12.field5895 != 0 && arg0 != null) {
                                arg0.method1428(arg8, -127, !var12.field5931, arg10, arg6, arg9, var12.field5885);
                            }
                            if (~var12.field5897 != -65) {
                                class785.method4307(arg4, arg6, arg8, var12.field5897);
                            }
                        } else if (~arg10 == -2) {
                            class481 var34;
                            if (var25) {
                                class278 var33 = new class278(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, arg10, arg9, var24);
                                var34 = var33;
                                if (var33.method1747((byte) -102)) {
                                    var33.method1752(arg2, (byte) -117);
                                }
                            } else {
                                var34 = new class515(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, arg10, arg9, arg1);
                            }
                            class494.method2910(arg4, arg6, arg8, var34, (class481) null);
                            if (var12.field5890 && class250.field3499) {
                                if (~arg9 != -1) {
                                    if (arg9 == 1) {
                                        var20.method204(arg6 + 1, arg8 + 1, 50);
                                    } else if (arg9 != 2) {
                                        if (~arg9 == -4) {
                                            var20.method204(arg6, arg8, 50);
                                        }
                                    } else {
                                        var20.method204(arg6 + 1, arg8, 50);
                                    }
                                } else {
                                    var20.method204(arg6, arg8 - -1, 50);
                                }
                            }
                            if (var12.field5895 != 0 && arg0 != null) {
                                arg0.method1428(arg8, 53, !var12.field5931, arg10, arg6, arg9, var12.field5885);
                            }
                        } else if (arg10 == 2) {
                            int var35 = arg9 - -1 & 3;
                            class481 var38;
                            class481 var39;
                            if (var25) {
                                class278 var36 = new class278(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, arg10, arg9 - -4, var24);
                                class278 var37 = new class278(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, arg10, var35, var24);
                                if (var36.method1747((byte) -124)) {
                                    var36.method1752(arg2, (byte) -48);
                                }
                                var38 = var37;
                                if (var37.method1747((byte) -121)) {
                                    var37.method1752(arg2, (byte) -22);
                                }
                                var39 = var36;
                            } else {
                                var39 = new class515(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, arg10, arg9 + 4, arg1);
                                var38 = new class515(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, arg10, var35, arg1);
                            }
                            class494.method2910(arg4, arg6, arg8, var39, var38);
                            if ((var12.field5849 == 1 || class742.field10037 && var12.field5849 == -1) && !super.field6799) {
                                if (~arg9 == -1) {
                                    class305.method1979(var12.field5867, var12.field5914, arg6, arg8, 1, false, arg4);
                                    class305.method1979(var12.field5867, var12.field5914, arg6, arg8 - -1, 2, false, arg4);
                                } else if (arg9 == 1) {
                                    class305.method1979(var12.field5867, var12.field5914, arg6 + 1, arg8, 1, false, arg4);
                                    class305.method1979(var12.field5867, var12.field5914, arg6, arg8 - -1, 2, false, arg4);
                                } else if (~arg9 != -3) {
                                    if (arg9 == 3) {
                                        class305.method1979(var12.field5867, var12.field5914, arg6, arg8, 1, false, arg4);
                                        class305.method1979(var12.field5867, var12.field5914, arg6, arg8, 2, false, arg4);
                                    }
                                } else {
                                    class305.method1979(var12.field5867, var12.field5914, arg6 + 1, arg8, 1, false, arg4);
                                    class305.method1979(var12.field5867, var12.field5914, arg6, arg8, 2, false, arg4);
                                }
                            }
                            if (var12.field5895 != 0 && arg0 != null) {
                                arg0.method1428(arg8, -120, !var12.field5931, arg10, arg6, arg9, var12.field5885);
                            }
                            if (~var12.field5897 != -65) {
                                class785.method4307(arg4, arg6, arg8, var12.field5897);
                            }
                        } else if (~arg10 == -4) {
                            class481 var41;
                            if (var25) {
                                class278 var40 = new class278(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, arg10, arg9, var24);
                                var41 = var40;
                                if (var40.method1747((byte) 32)) {
                                    var40.method1752(arg2, (byte) -123);
                                }
                            } else {
                                var41 = new class515(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, arg10, arg9, arg1);
                            }
                            class494.method2910(arg4, arg6, arg8, var41, (class481) null);
                            if (var12.field5890 && class250.field3499) {
                                if (~arg9 == -1) {
                                    var20.method204(arg6, arg8 + 1, 50);
                                } else if (arg9 == 1) {
                                    var20.method204(arg6 + 1, arg8 + 1, 50);
                                } else if (arg9 == 2) {
                                    var20.method204(arg6 + 1, arg8, 50);
                                } else if (arg9 == 3) {
                                    var20.method204(arg6, arg8, 50);
                                }
                            }
                            if (var12.field5895 != 0 && arg0 != null) {
                                arg0.method1428(arg8, 70, !var12.field5931, arg10, arg6, arg9, var12.field5885);
                            }
                        } else if (arg10 == 9) {
                            class539 var42;
                            if (!var25) {
                                var42 = new class344(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, arg6, arg6 + var14 + -1, arg8, var13 + -1 + arg8, arg10, arg9, arg1);
                            } else {
                                class256 var43 = new class256(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, arg6, arg6, arg8, arg8, arg10, arg9, var24);
                                var42 = var43;
                                if (var43.method1747((byte) -122)) {
                                    var43.method1752(arg2, (byte) -19);
                                }
                            }
                            class359.method2278(var42, false);
                            if (~var12.field5849 == -2 && !super.field6799) {
                                byte var44;
                                if (~(arg9 & 1) == -1) {
                                    var44 = 8;
                                } else {
                                    var44 = 16;
                                }
                                class305.method1979(0, var12.field5914, arg6, arg8, var44, false, arg4);
                            }
                            if (~var12.field5895 != -1 && arg0 != null) {
                                arg0.method1431(arg6, !var12.field5931, var12.field5885, arg8, var13, var14, true);
                            }
                            if (var12.field5897 != 64) {
                                class785.method4307(arg4, arg6, arg8, var12.field5897);
                            }
                        } else if (~arg10 == -5) {
                            class569 var46;
                            if (var25) {
                                class619 var45 = new class619(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, 0, 0, arg10, arg9);
                                if (var45.method1747((byte) 47)) {
                                    var45.method1752(arg2, (byte) -107);
                                }
                                var46 = var45;
                            } else {
                                var46 = new class372(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, 0, 0, arg10, arg9, arg1);
                            }
                            class158.method1096(arg4, arg6, arg8, var46, (class569) null);
                        } else if (~arg10 == -6) {
                            int var47 = 65;
                            class602 var48 = (class602) class634.method3501(arg4, arg6, arg8);
                            if (var48 != null) {
                                var47 = 1 + class210.field2705.method1362(0, var48.method1748(5875)).field5897;
                            }
                            class569 var49;
                            if (!var25) {
                                var49 = new class372(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, class198.field2563[arg9] * var47, class676.field9067[arg9] * var47, arg10, arg9, arg1);
                            } else {
                                class619 var50 = new class619(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, class198.field2563[arg9] * var47, class676.field9067[arg9] * var47, arg10, arg9);
                                var49 = var50;
                                if (var50.method1747((byte) -103)) {
                                    var50.method1752(arg2, (byte) -114);
                                }
                            }
                            class158.method1096(arg4, arg6, arg8, var49, (class569) null);
                        } else if (arg10 == 6) {
                            int var51 = 33;
                            class602 var52 = (class602) class634.method3501(arg4, arg6, arg8);
                            if (var52 != null) {
                                var51 = class210.field2705.method1362(0, var52.method1748(5875)).field5897 / 2 + 1;
                            }
                            class569 var54;
                            if (var25) {
                                class619 var53 = new class619(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, class198.field2563[arg9] * var51, class676.field9067[arg9] * var51, arg10, arg9 + 4);
                                var54 = var53;
                                if (var53.method1747((byte) 52)) {
                                    var53.method1752(arg2, (byte) -50);
                                }
                            } else {
                                var54 = new class372(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, class110.field1527[arg9] * var51, class309.field4385[arg9] * var51, arg10, arg9 + 4, arg1);
                            }
                            class158.method1096(arg4, arg6, arg8, var54, (class569) null);
                        } else if (arg10 == 7) {
                            int var55 = arg9 + 2 & 3;
                            class569 var57;
                            if (var25) {
                                class619 var56 = new class619(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, 0, 0, arg10, var55 + 4);
                                if (var56.method1747((byte) -120)) {
                                    var56.method1752(arg2, (byte) -41);
                                }
                                var57 = var56;
                            } else {
                                var57 = new class372(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, 0, 0, arg10, var55 + 4, arg1);
                            }
                            class158.method1096(arg4, arg6, arg8, var57, (class569) null);
                        } else if (~arg10 == -9) {
                            int var58 = 3 & arg9 - -2;
                            int var59 = 33;
                            class602 var60 = (class602) class634.method3501(arg4, arg6, arg8);
                            if (var60 != null) {
                                var59 = 1 + class210.field2705.method1362(0, var60.method1748(5875)).field5897 / 2;
                            }
                            class569 var63;
                            class569 var64;
                            if (var25) {
                                class619 var61 = new class619(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, class110.field1527[arg9] * var59, class309.field4385[arg9] * var59, arg10, arg9 - -4);
                                class619 var62 = new class619(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, 0, 0, arg10, var58 + 4);
                                if (var61.method1747((byte) 61)) {
                                    var61.method1752(arg2, (byte) -106);
                                }
                                if (var62.method1747((byte) 111)) {
                                    var62.method1752(arg2, (byte) -33);
                                }
                                var63 = var62;
                                var64 = var61;
                            } else {
                                class372 var65 = new class372(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, class110.field1527[arg9] * var59, class309.field4385[arg9] * var59, arg10, arg9 + 4, arg1);
                                var64 = var65;
                                class372 var66 = new class372(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, 0, 0, arg10, var58 - -4, arg1);
                                var63 = var66;
                            }
                            class158.method1096(arg4, arg6, arg8, var64, var63);
                        }
                    } else {
                        class256 var67 = null;
                        int var68;
                        class539 var69;
                        if (!var25) {
                            var68 = 15;
                            var69 = new class344(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, arg6, arg6 + var14 + -1, arg8, arg8 - 1 + var13, arg10, arg9, arg1);
                        } else {
                            class256 var70 = new class256(arg2, var12, arg4, arg7, var22, var21, var23, super.field6799, arg6, var14 + -1 + arg6, arg8, var13 + -1 + arg8, arg10, arg9, var24);
                            var68 = var70.method1743((byte) -114);
                            var67 = var70;
                            var69 = var70;
                        }
                        if (class359.method2278(var69, false)) {
                            if (var67 != null && var67.method1747((byte) 114)) {
                                var67.method1752(arg2, (byte) -75);
                            }
                            if (var12.field5890 && class250.field3499) {
                                if (~var68 < -31) {
                                    var68 = 30;
                                }
                                for (int var71 = 0; ~var71 >= ~var14; ++var71) {
                                    for (int var72 = 0; ~var13 <= ~var72; ++var72) {
                                        var20.method204(arg6 + var71, arg8 + var72, var68);
                                    }
                                }
                            }
                        }
                        if (var12.field5895 != 0 && arg0 != null) {
                            arg0.method1431(arg6, !var12.field5931, var12.field5885, arg8, var13, var14, true);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static final void method4185(int arg0) {
        ++field10437;
        if (arg0 >= 48) {
            for (class116 var1 = (class116) class138.field1861.method1249((byte) -103); var1 != null; var1 = (class116) class138.field1861.method1246(true)) {
                if (var1.field1570.method2594(118)) {
                    class384.method2389(0, var1.field1563);
                } else {
                    var1.field1570.method2909(-66);
                    try {
                        var1.field1570.method2586((byte) 127);
                    } catch (Exception var5) {
                        class607.method3379("TV: " + var1.field1563, var5, true);
                        class384.method2389(0, var1.field1563);
                    }
                    if (!var1.field1567 && !var1.field1564) {
                        class728 var3 = var1.field1570.method2599(false);
                        if (var3 != null) {
                            class774 var4 = var3.method4028(-87);
                            if (var4 != null) {
                                var4.method4261(var1.field1562, (byte) -111);
                                class701.field9285.method21(var4);
                                var1.field1567 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III[BLha;[Leq;IIIII)V")
    public final void method4186(int arg0, int arg1, int arg2, byte[] arg3, class66 arg4, class224[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field10448;
        if (arg0 != 3) {
            field10449 = null;
        }
        class254 var12 = new class254(arg3);
        int var13 = -1;
        while (true) {
            int var14 = var12.method1707(-32768);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1673(-32768);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = 63 & var15;
                int var18 = 63 & var15 >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method1731((byte) 64);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (arg10 == var19 && var18 >= arg9 && ~(arg9 - -8) < ~var18 && ~arg1 >= ~var17 && ~var17 > ~(arg1 + 8)) {
                    class412 var23 = class210.field2705.method1362(0, var13);
                    int var24 = arg2 - -class117.method846(var23.field5853, arg8, 7 & var17, true, var23.field5851, var22, var18 & 7);
                    int var25 = arg6 - -class787.method4311(var23.field5851, false, var22, var23.field5853, 7 & var18, var17 & 7, arg8);
                    if (~var24 < -1 && var25 > 0 && var24 < super.field6804 - 1 && ~(super.field6813 + -1) < ~var25) {
                        class224 var26 = null;
                        if (!super.field6799) {
                            int var27 = arg7;
                            if (~(class328.field4667[1][var24][var25] & 2) == -3) {
                                var27 = arg7 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg5[var27];
                            }
                        }
                        this.method4184(var26, -1, arg4, 102, arg7, var13, var24, arg7, var25, arg8 + var22 & 3, var21);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZBLha;)V")
    public final void method4187(boolean arg0, byte arg1, class66 arg2) {
        class194.method1281();
        if (arg1 != 21) {
            field10449 = null;
        }
        ++field10435;
        if (!arg0) {
            if (~super.field6789 < -2) {
                for (int var4 = 0; var4 < super.field6804; ++var4) {
                    for (int var5 = 0; ~super.field6813 < ~var5; ++var5) {
                        if (~(2 & class328.field4667[1][var4][var5]) == -3) {
                            class631.method3483(var4, var5);
                        }
                    }
                }
            }
            for (int var6 = 0; var6 < super.field6789; ++var6) {
                for (int var7 = 0; ~super.field6813 <= ~var7; ++var7) {
                    for (int var8 = 0; ~super.field6804 <= ~var8; ++var8) {
                        if ((super.field6794[var6][var8][var7] & 4) != 0) {
                            int var9 = var8;
                            int var10 = var8;
                            int var11 = var7;
                            int var12 = var7;
                            while (~var11 < -1 && (4 & super.field6794[var6][var8][var11 + -1]) != 0 && -var11 + var12 < 10) {
                                --var11;
                            }
                            while (~super.field6813 < ~var12 && (4 & super.field6794[var6][var8][var12 + 1]) != 0 && ~(-var11 + var12) > -11) {
                                ++var12;
                            }
                            label117: while (~var9 < -1 && ~(-var9 + var10) > -11) {
                                for (int var13 = var11; ~var12 <= ~var13; ++var13) {
                                    if ((4 & super.field6794[var6][var9 - 1][var13]) == 0) {
                                        break label117;
                                    }
                                }
                                --var9;
                            }
                            label104: while (super.field6804 > var10 && -var9 + var10 < 10) {
                                for (int var14 = var11; var12 >= var14; ++var14) {
                                    if ((4 & super.field6794[var6][var10 + 1][var14]) == 0) {
                                        break label104;
                                    }
                                }
                                ++var10;
                            }
                            if ((-var11 + var12 + 1) * (var10 + 1 + -var9) >= 4) {
                                int var15 = super.field6792[var6][var9][var11];
                                class672.method3704(var6, var11 << 9, (byte) -112, 4, (var12 << 9) + 512, var15, var15, (var10 << 9) + 512, var9 << 9);
                                for (int var16 = var9; ~var10 <= ~var16; ++var16) {
                                    for (int var17 = var11; var17 <= var12; ++var17) {
                                        super.field6794[var6][var16][var17] = (byte) class519.method3018(super.field6794[var6][var16][var17], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class607.method3378((byte) 27);
        }
        super.field6794 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lfq;Z[[[BIB)Z")
    public static final boolean method4188(class214 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class148.field1989) {
            return false;
        } else {
            int var5 = arg0.field2802 >> class478.field6717;
            int var6 = var5;
            int var7 = arg0.field2810 >> class478.field6717;
            int var8 = var7;
            if (arg0 instanceof class539) {
                var6 = ((class539) arg0).field7455;
                var8 = ((class539) arg0).field7453;
                var5 = ((class539) arg0).field7466;
                var7 = ((class539) arg0).field7467;
            }
            for (int var9 = var5; var9 <= var6; ++var9) {
                for (int var10 = var7; var10 <= var8; ++var10) {
                    if (arg0.field2809 < class504.field7090 && var9 >= class226.field2923 && var9 < class308.field4376 && var10 >= class177.field2342 && var10 < class684.field9133) {
                        if ((arg2 == null || arg0.field2813 < arg3 || arg2[arg0.field2813][var9][var10] != arg4) && arg0.method1383(90) && !arg0.method1389(class34.field372, true)) {
                            return false;
                        }
                        if (!arg1 && var9 >= class130.field1787 - 16 && var9 <= class130.field1787 + 16 && var10 >= class468.field6610 - 16 && var10 <= class468.field6610 + 16) {
                            if (class522.field7253) {
                                class267.field3910[class25.field249++].method1094(arg0, (byte) 47);
                                class25.field249 %= class496.field6975;
                            } else {
                                arg0.method131(class34.field372, (byte) 53);
                            }
                        }
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([BII[Leq;ILha;)V")
    public final void method4189(byte[] arg0, int arg1, int arg2, class224[] arg3, int arg4, class66 arg5) {
        ++field10436;
        if (arg2 != 1) {
            method4188((class214) null, false, (byte[][][]) null, 37, (byte) -77);
        }
        class254 var7 = new class254(arg0);
        int var8 = -1;
        while (true) {
            int var9 = var7.method1707(-32768);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1673(-32768);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = 63 & var10;
                int var13 = 63 & var10 >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method1731((byte) 64);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = arg1 + var13;
                int var19 = var12 - -arg4;
                if (var18 > 0 && var19 > 0 && ~(super.field6804 + -1) < ~var18 && super.field6813 + -1 > var19) {
                    class224 var20 = null;
                    if (!super.field6799) {
                        int var21 = var14;
                        if (~(class328.field4667[1][var18][var19] & 2) == -3) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg3[var21];
                        }
                    }
                    this.method4184(var20, -1, arg5, -102, var14, var8, var18, var14, var19, var17, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lha;IBIIII[IIILdt;)V")
    public final void method4190(class66 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, class254 arg10) {
        ++field10445;
        if (!super.field6799) {
            boolean var12 = false;
            if (arg2 < 35) {
                field10443 = null;
            }
            if (arg7 != null) {
                arg7[0] = -1;
            }
            class74 var13 = null;
            int var14 = (7 & arg1) * 8;
            int var15 = (7 & arg5) * 8;
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (~arg10.field3725 > ~arg10.field3789.length) {
                                int var20 = arg10.method1731((byte) 64);
                                if (~var20 != -1) {
                                    if (~var20 != -2) {
                                        if (~var20 != -3) {
                                            if (~var20 != -129) {
                                                if (var20 != 129) {
                                                    throw new IllegalStateException("");
                                                }
                                                if (super.field6787 == null) {
                                                    super.field6787 = new byte[4][][];
                                                }
                                                for (int var21 = 0; ~var21 > -5; ++var21) {
                                                    byte var22 = arg10.method1737(true);
                                                    if (var22 == 0 && super.field6787[arg4] != null) {
                                                        if (arg9 >= var21) {
                                                            int var23 = arg3;
                                                            int var24 = arg3 + 7;
                                                            int var25 = arg6;
                                                            if (~var24 <= -1) {
                                                                if (~var24 <= ~super.field6804) {
                                                                    var24 = super.field6804;
                                                                }
                                                            } else {
                                                                var24 = 0;
                                                            }
                                                            if (~arg3 <= -1) {
                                                                if (arg3 >= super.field6804) {
                                                                    var23 = super.field6804;
                                                                }
                                                            } else {
                                                                var23 = 0;
                                                            }
                                                            int var26 = arg6 + 7;
                                                            if (arg6 < 0) {
                                                                var25 = 0;
                                                            } else if (~arg6 <= ~super.field6813) {
                                                                var25 = super.field6813;
                                                            }
                                                            if (var26 >= 0) {
                                                                if (~super.field6813 >= ~var26) {
                                                                    var26 = super.field6813;
                                                                }
                                                            } else {
                                                                var26 = 0;
                                                            }
                                                            while (~var24 < ~var23) {
                                                                while (var25 < var26) {
                                                                    super.field6787[arg4][var23][var25] = 0;
                                                                    ++var25;
                                                                }
                                                                ++var23;
                                                            }
                                                        }
                                                    } else if (var22 == 1) {
                                                        if (super.field6787[arg4] == null) {
                                                            super.field6787[arg4] = new byte[super.field6804 - -1][super.field6813 + 1];
                                                        }
                                                        for (int var27 = 0; var27 < 64; var27 += 4) {
                                                            for (int var28 = 0; var28 < 64; var28 += 4) {
                                                                byte var29 = arg10.method1737(true);
                                                                if (~arg9 <= ~var21) {
                                                                    for (int var30 = var27; ~var30 > ~(var27 - -4); ++var30) {
                                                                        for (int var31 = var28; ~(var28 - -4) < ~var31; ++var31) {
                                                                            if (var30 >= var14 && var30 < var14 + 8 && ~var15 >= ~var31 && var15 + 8 > var15) {
                                                                                int var32 = arg3 + class671.method3700(var30 & 7, (byte) 65, arg8, var31 & 7);
                                                                                int var33 = class702.method3829(-2, 7 & var31, var30 & 7, arg8) + arg6;
                                                                                if (~var32 <= -1 && super.field6804 > var32 && var33 >= 0 && super.field6813 > var33) {
                                                                                    super.field6787[arg4][var32][var33] = var29;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (arg7 != null) {
                                                arg7[0] = arg10.method1728((byte) 97);
                                                arg7[1] = arg10.method1695(423951304);
                                                arg7[2] = arg10.method1695(423951304);
                                                arg7[3] = arg10.method1695(423951304);
                                                arg7[4] = arg10.method1728((byte) 14);
                                            } else {
                                                arg10.field3725 += 10;
                                            }
                                        } else {
                                            if (var13 == null) {
                                                var13 = new class74();
                                            }
                                            var13.method603(-117, arg10);
                                        }
                                    } else {
                                        int var34 = arg10.method1731((byte) 64);
                                        if (var34 > 0) {
                                            for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                                class447 var36 = new class447(arg0, arg10, 2);
                                                if (~var36.field6427 == -32) {
                                                    class563 var37 = class224.field2905.method4001(true, arg10.method1728((byte) 84));
                                                    var36.method2662(var37.field7710, -119, var37.field7711, var37.field7705, var37.field7704);
                                                }
                                                if (arg0.method489() > 0) {
                                                    class127 var38 = var36.field6422;
                                                    int var39 = var38.method899(true) >> 9;
                                                    int var40 = var38.method901((byte) -115) >> 9;
                                                    if (~var36.field6434 == ~arg9 && var14 <= var39 && var14 + 8 > var39 && var15 <= var40 && var15 + 8 > var40) {
                                                        int var41 = class489.method2863(4095 & var38.method899(true), arg8, 4095 & var38.method901((byte) -115), (byte) -32) + (arg3 << 9);
                                                        int var42 = var41 >> 9;
                                                        int var43 = class451.method2680(var38.method899(true) & 4095, (byte) -107, arg8, var38.method901((byte) -115) & 4095) + (arg6 << 9);
                                                        int var44 = var43 >> 9;
                                                        if (~var42 <= -1 && var44 >= 0 && ~super.field6804 < ~var42 && ~var44 > ~super.field6813) {
                                                            var38.method905((byte) 125, var41, super.field6792[arg9][var42][var44] - var38.method904(30), var43);
                                                            class422.method2538(var36);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var13 = new class74(arg10);
                                }
                            }
                            if (var13 != null) {
                                class531.method3069(600, arg3 >> 3, var13, arg6 >> 3);
                            }
                            if (!var12 && super.field6787 != null && super.field6787[arg4] != null) {
                                int var16 = arg3 - -7;
                                int var17 = arg6 - -7;
                                for (int var18 = arg3; var16 > var18; ++var18) {
                                    for (int var19 = arg6; var17 > var19; ++var19) {
                                        super.field6787[arg4][var18][var19] = 0;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZII)Z")
    public static final boolean method4191(boolean arg0, int arg1, int arg2) {
        ++field10439;
        if (!arg0) {
            field10443 = null;
        }
        return ~(50560 & arg1) != -1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4192(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
