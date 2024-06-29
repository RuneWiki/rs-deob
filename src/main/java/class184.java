import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class184 extends class101 {

    @OriginalMember(owner = "client!rfa", name = "Q", descriptor = "I")
    public int field3107 = 99;

    @OriginalMember(owner = "client!rfa", name = "R", descriptor = "Z")
    public static boolean field3108 = false;

    @OriginalMember(owner = "client!rfa", name = "H", descriptor = "Lrl;")
    public static class672 field3098 = new class672(59, 12);

    @OriginalMember(owner = "client!rfa", name = "G", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!rfa", name = "I", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!rfa", name = "J", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!rfa", name = "K", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!rfa", name = "L", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!rfa", name = "M", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!rfa", name = "N", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!rfa", name = "O", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!rfa", name = "P", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!rfa", name = "S", descriptor = "I")
    public static int field3109;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rfa", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field3110;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILr;ILnc;III)V")
    public final void method1492(int arg0, class167 arg1, int arg2, class23 arg3, int arg4, int arg5, int arg6) {
        ++field3102;
        class302 var8 = null;
        int var9 = -90 / ((arg5 - -30) / 54);
        if (arg0 == 0) {
            var8 = (class302) class681.method3880(arg6, arg4, arg2);
        }
        if (~arg0 == -2) {
            var8 = (class302) class351.method2360(arg6, arg4, arg2);
        }
        if (~arg0 == -3) {
            var8 = (class302) class618.method3589(arg6, arg4, arg2, field3110 != null ? field3110 : (field3110 = method1502("ofa")));
        }
        if (~arg0 == -4) {
            var8 = (class302) class643.method3728(arg6, arg4, arg2);
        }
        if (var8 != null) {
            class698 var10 = class213.field3537.method94(var8.method394((byte) -123), (byte) -42);
            int var11 = var8.method413((byte) 11);
            int var12 = var8.method401((byte) 62);
            if (var10.method3942((byte) -60)) {
                class57.method666(var10, arg4, arg6, arg2, (byte) -126);
            }
            if (var8.method395(-29400)) {
                var8.method396(-32646, arg1);
            }
            if (~arg0 == -1) {
                class315.method2150(arg6, arg4, arg2);
                if (~var10.field9842 != -1) {
                    arg3.method377(arg4, !var10.field9767, arg2, var12, var10.field9834, (byte) 20, var11);
                }
                if (~var10.field9831 == -2) {
                    if (~var12 != -1) {
                        if (~var12 != -2) {
                            if (var12 != 2) {
                                if (~var12 == -4) {
                                    class650.method3754(arg2, 2, arg6, false, arg4);
                                    return;
                                }
                            } else {
                                class650.method3754(arg2, 1, arg6, false, arg4 + 1);
                            }
                            return;
                        }
                        class650.method3754(arg2 + 1, 2, arg6, false, arg4);
                        return;
                    }
                    class650.method3754(arg2, 1, arg6, false, arg4);
                    return;
                }
            } else if (arg0 != 1) {
                if (arg0 == 2) {
                    class224.method1648(arg6, arg4, arg2, field3110 != null ? field3110 : (field3110 = method1502("ofa")));
                    if (var10.field9842 != 0 && super.field1657 > var10.field9851 + arg4 && ~super.field1656 < ~(var10.field9851 + arg2) && ~(var10.field9829 + arg4) > ~super.field1657 && ~super.field1656 < ~(var10.field9829 + arg2)) {
                        arg3.method387(arg2, var10.field9834, !var10.field9767, var10.field9829, arg4, var10.field9851, var12, -49);
                        return;
                    }
                    return;
                }
                if (arg0 == 3) {
                    class205.method1581(arg6, arg4, arg2);
                    if (var10.field9842 == 1) {
                        arg3.method375(-262145, arg4, arg2);
                        return;
                    }
                }
            } else {
                class9.method193(arg6, arg4, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(IIIZ)V")
    public class184(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class472.field6984, class61.field789);
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)V")
    public static void method1493(byte arg0) {
        int var1 = 28 / ((51 - arg0) / 62);
        field3098 = null;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Z)V")
    public static final void method1494(boolean arg0) {
        ++field3097;
        if (class660.field9192 != class31.field451) {
            try {
                class358.method2403("tbrefresh", class157.field2684, -29103);
            } catch (Throwable var1) {
            }
            if (!arg0) {
                method1498(false);
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "([BIILr;[Lnc;B)V")
    public final void method1495(byte[] arg0, int arg1, int arg2, class167 arg3, class23[] arg4, byte arg5) {
        if (arg5 != 77) {
            field3098 = null;
        }
        ++field3099;
        class6 var7 = new class6(arg0);
        int var8 = -1;
        while (true) {
            int var9 = var7.method60(false);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method88((byte) 90);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = var10 & 63;
                int var13 = (var10 & 4090) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method70(-9059);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = arg1 + var13;
                int var19 = var12 - -arg2;
                if (var18 > 0 && ~var19 < -1 && var18 < super.field1657 + -1 && ~var19 > ~(super.field1656 + -1)) {
                    class23 var20 = null;
                    if (!super.field1661) {
                        int var21 = var14;
                        if ((class690.field9676[1][var18][var19] & 2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg4[var21];
                        }
                    }
                    this.method1497(var20, var8, -1, var14, var18, var19, arg3, var14, var17, var16, -2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lie;ILr;[IBI)V")
    public final void method1496(class6 arg0, int arg1, class167 arg2, int[] arg3, byte arg4, int arg5) {
        if (arg4 != 73) {
            method1498(false);
        }
        ++field3105;
        if (!super.field1661) {
            boolean var7 = false;
            if (arg3 != null) {
                arg3[0] = -1;
            }
            class491 var8 = null;
            while (true) {
                while (true) {
                    while (true) {
                        while (~arg0.field96.length < ~arg0.field57) {
                            int var18 = arg0.method70(-9059);
                            if (~var18 != -1) {
                                if (~var18 != -2) {
                                    if (~var18 == -3) {
                                        if (var8 == null) {
                                            var8 = new class491();
                                        }
                                        var8.method3006((byte) 100, arg0);
                                    } else if (var18 == 128) {
                                        if (arg3 != null) {
                                            arg3[0] = arg0.method67(12021);
                                            arg3[1] = arg0.method45(arg4 + -8725);
                                            arg3[2] = arg0.method45(arg4 + -8725);
                                            arg3[3] = arg0.method45(-8652);
                                            arg3[4] = arg0.method67(12021);
                                        } else {
                                            arg0.field57 += 10;
                                        }
                                    } else {
                                        if (var18 != 129) {
                                            throw new IllegalStateException("");
                                        }
                                        if (super.field1679 == null) {
                                            super.field1679 = new byte[4][][];
                                        }
                                        var7 = true;
                                        for (int var19 = 0; var19 < 4; ++var19) {
                                            byte var20 = arg0.method81(true);
                                            if (~var20 == -1 && super.field1679[var19] != null) {
                                                int var21 = arg1;
                                                int var22 = arg1 + 64;
                                                int var23 = arg5;
                                                int var24 = arg5 - -64;
                                                if (~var22 > -1) {
                                                    var22 = 0;
                                                } else if (~super.field1657 >= ~var22) {
                                                    var22 = super.field1657;
                                                }
                                                if (~arg1 <= -1) {
                                                    if (~arg1 <= ~super.field1657) {
                                                        var21 = super.field1657;
                                                    }
                                                } else {
                                                    var21 = 0;
                                                }
                                                if (~arg5 <= -1) {
                                                    if (arg5 >= super.field1656) {
                                                        var23 = super.field1656;
                                                    }
                                                } else {
                                                    var23 = 0;
                                                }
                                                if (~var24 <= -1) {
                                                    if (super.field1656 <= var24) {
                                                        var24 = super.field1656;
                                                    }
                                                } else {
                                                    var24 = 0;
                                                }
                                                while (~var22 < ~var21) {
                                                    while (~var23 > ~var24) {
                                                        super.field1679[var19][var21][var23] = 0;
                                                        ++var23;
                                                    }
                                                    ++var21;
                                                }
                                            } else if (~var20 != -2) {
                                                if (~var20 == -3) {
                                                    if (super.field1679[var19] == null) {
                                                        super.field1679[var19] = new byte[super.field1657 - -1][super.field1656 + 1];
                                                    }
                                                    if (~var19 < -1) {
                                                        int var25 = arg1;
                                                        int var26 = arg1 + 64;
                                                        int var27 = arg5;
                                                        if (~var26 > -1) {
                                                            var26 = 0;
                                                        } else if (~super.field1657 >= ~var26) {
                                                            var26 = super.field1657;
                                                        }
                                                        if (~arg1 <= -1) {
                                                            if (~super.field1657 >= ~arg1) {
                                                                var25 = super.field1657;
                                                            }
                                                        } else {
                                                            var25 = 0;
                                                        }
                                                        int var28 = arg5 + 64;
                                                        if (~arg5 <= -1) {
                                                            if (super.field1656 <= arg5) {
                                                                var27 = super.field1656;
                                                            }
                                                        } else {
                                                            var27 = 0;
                                                        }
                                                        if (~var28 <= -1) {
                                                            if (~var28 <= ~super.field1656) {
                                                                var28 = super.field1656;
                                                            }
                                                        } else {
                                                            var28 = 0;
                                                        }
                                                        while (var25 < var26) {
                                                            while (var27 < var28) {
                                                                super.field1679[var19][var25][var27] = super.field1679[var19 + -1][var25][var27];
                                                                ++var27;
                                                            }
                                                            ++var25;
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (super.field1679[var19] == null) {
                                                    super.field1679[var19] = new byte[super.field1657 + 1][super.field1656 + 1];
                                                }
                                                for (int var29 = 0; var29 < 64; var29 += 4) {
                                                    for (int var30 = 0; ~var30 > -65; var30 += 4) {
                                                        byte var31 = arg0.method81(true);
                                                        for (int var32 = arg1 + var29; ~(arg1 + var29 + 4) < ~var32; ++var32) {
                                                            for (int var33 = arg5 + var30; ~(arg5 + var30 + 4) < ~var33; ++var33) {
                                                                if (var32 >= 0 && super.field1657 > var32 && ~var33 <= -1 && ~super.field1656 < ~var33) {
                                                                    super.field1679[var19][var32][var33] = var31;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    int var34 = arg0.method70(arg4 + -9132);
                                    if (~var34 < -1) {
                                        for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                            class263 var36 = new class263(arg2, arg0, 2);
                                            if (~var36.field4292 == -32) {
                                                class209 var37 = class357.field5693.method2624(true, arg0.method67(12021));
                                                var36.method1870(var37.field3498, var37.field3495, var37.field3494, var37.field3493, true);
                                            }
                                            if (arg2.method267() > 0) {
                                                class674 var38 = var36.field4300;
                                                int var39 = (arg1 << 9) + var38.method3857((byte) -35);
                                                int var40 = var38.method3859((byte) 117) - -(arg5 << 9);
                                                int var41 = var39 >> 9;
                                                int var42 = var40 >> 9;
                                                if (var41 >= 0 && ~var42 <= -1 && ~super.field1657 < ~var41 && ~super.field1656 < ~var42) {
                                                    var38.method187(var40, super.field1676[var36.field4302][var41][var42] + -var38.method3851((byte) -111), 0, var39);
                                                    class493.method3009(var36);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var8 = new class491(arg0);
                            }
                        }
                        if (var8 != null) {
                            for (int var9 = 0; ~var9 > -9; ++var9) {
                                for (int var10 = 0; ~var10 > -9; ++var10) {
                                    int var11 = (arg1 >> 3) + var9;
                                    int var12 = (arg5 >> 3) + var10;
                                    if (var11 >= 0 && var11 < super.field1657 >> 3 && var12 >= 0 && var12 < super.field1656 >> 3) {
                                        class327.method2203(var8, (byte) 53, var11, var12);
                                    }
                                }
                            }
                        }
                        if (!var7 && super.field1679 != null) {
                            for (int var13 = 0; ~var13 > -5; ++var13) {
                                if (super.field1679[var13] != null) {
                                    for (int var14 = 0; ~var14 > -17; ++var14) {
                                        for (int var15 = 0; ~var15 > -17; ++var15) {
                                            int var16 = (arg1 >> 2) + var14;
                                            int var17 = (arg5 >> 2) + var15;
                                            if (var16 >= 0 && ~var16 > -27 && ~var17 <= -1 && var17 < 26) {
                                                super.field1679[var13][var16][var17] = 0;
                                            }
                                        }
                                    }
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

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lnc;IIIIILr;IIII)V")
    public final void method1497(class23 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class167 arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field3101;
        if (class17.field282.method2089(class497.field7259, -1) || class612.method3563(arg10 + -125, arg5, class70.field887, arg3, arg4)) {
            if (~this.field3107 < ~arg7) {
                this.field3107 = arg7;
            }
            class698 var12 = class213.field3537.method94(arg1, (byte) -42);
            if (!arg6.method305() || !class17.field282.field4872 || !var12.field9801) {
                int var13;
                int var14;
                if (~arg8 != arg10 && ~arg8 != -4) {
                    var13 = var12.field9829;
                    var14 = var12.field9851;
                } else {
                    var13 = var12.field9851;
                    var14 = var12.field9829;
                }
                int var15;
                int var16;
                if (arg4 + var14 > super.field1657) {
                    var15 = arg4 + 1;
                    var16 = arg4;
                } else {
                    var16 = (var14 >> 1) + arg4;
                    var15 = (var14 - -1 >> 1) + arg4;
                }
                int var17;
                int var18;
                if (~super.field1656 <= ~(arg5 + var13)) {
                    var17 = (var13 >> 1) + arg5;
                    var18 = (var13 + 1 >> 1) + arg5;
                } else {
                    var18 = arg5 + 1;
                    var17 = arg5;
                }
                class37 var19 = class587.field8346[arg3];
                int var20 = var19.method479(var17, var16, arg10 ^ 109) + var19.method479(var17, var15, -110) - -var19.method479(var18, var16, arg10 ^ 110) + var19.method479(var18, var15, arg10 + 82) >> 2;
                int var21 = (arg4 << 9) + (var14 << 8);
                int var22 = (arg5 << 9) + (var13 << 8);
                boolean var23 = class246.field3927 && !super.field1661 && var12.field9820;
                if (var12.method3942((byte) -60)) {
                    class24.method410(arg5, var12, (class589) null, arg4, arg8, arg7, (byte) 56, (class304) null);
                }
                boolean var24 = arg2 == -1 && var12.field9803 == -1 && var12.field9787 == null && var12.field9826 == null && !var12.field9806;
                if (!class510.field7443 || (!class153.method1255(arg9, 86) || var12.field9831 == 1) && (!class550.method3317(arg10 + -71, arg9) || ~var12.field9831 != -1)) {
                    if (~arg9 == -23) {
                        if (class17.field282.field4881 || var12.field9830 != 0 || var12.field9842 == 1 || var12.field9785) {
                            class539 var26;
                            if (var24) {
                                class24 var25 = new class24(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, arg8, var23);
                                if (var25.method395(-29400)) {
                                    var25.method407(arg6, 110);
                                }
                                var26 = var25;
                            } else {
                                var26 = new class299(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, arg8, arg2);
                            }
                            class272.method1920(arg7, arg4, arg5, var26);
                            if (~var12.field9842 == -2 && arg0 != null) {
                                arg0.method378(arg10 ^ -3, arg5, arg4);
                            }
                        }
                    } else if (arg9 != 10 && arg9 != 11) {
                        if (arg9 >= 12 && ~arg9 >= -18 || arg9 >= 18 && ~arg9 >= -22) {
                            class459 var27;
                            if (!var24) {
                                var27 = new class208(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, arg4, arg4 + var14 - 1, arg5, arg5 + -1 - -var13, arg9, arg8, arg2);
                            } else {
                                class91 var28 = new class91(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, arg4, arg4 + var14 + -1, arg5, arg5 + -1 - -var13, arg9, arg8, var23);
                                if (var28.method395(-29400)) {
                                    var28.method407(arg6, arg10 ^ -54);
                                }
                                var27 = var28;
                            }
                            class259.method1830(var27, false);
                            if (class246.field3927 && !super.field1661 && ~arg9 <= -13 && ~arg9 >= -18 && arg9 != 13 && arg7 > 0 && ~var12.field9831 != -1) {
                                super.field1668[arg7][arg4][arg5] = (byte) class81.method769(super.field1668[arg7][arg4][arg5], 4);
                            }
                            if (var12.field9842 != 0 && arg0 != null) {
                                arg0.method386(var12.field9834, var14, arg4, (byte) -90, !var12.field9767, arg5, var13);
                            }
                        } else if (~arg9 == -1) {
                            int var29 = var12.field9831;
                            if (class441.field6716 && var12.field9831 == -1) {
                                var29 = 1;
                            }
                            class563 var31;
                            if (var24) {
                                class353 var30 = new class353(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, arg9, arg8, var23);
                                if (var30.method395(-29400)) {
                                    var30.method407(arg6, arg10 + 33);
                                }
                                var31 = var30;
                            } else {
                                var31 = new class436(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, arg9, arg8, arg2);
                            }
                            class660.method3786(arg7, arg4, arg5, var31, (class563) null);
                            if (arg8 == 0) {
                                if (class246.field3927 && var12.field9846) {
                                    var19.method476(arg4, arg5, 50);
                                    var19.method476(arg4, arg5 - -1, 50);
                                }
                                if (var29 == 1 && !super.field1661) {
                                    class575.method3374(1, -68, var12.field9802, arg4, arg5, arg7, var12.field9821);
                                }
                            } else if (arg8 != 1) {
                                if (~arg8 == -3) {
                                    if (class246.field3927 && var12.field9846) {
                                        var19.method476(arg4 + 1, arg5, 50);
                                        var19.method476(arg4 + 1, arg5 + 1, 50);
                                    }
                                    if (var29 == 1 && !super.field1661) {
                                        class575.method3374(1, -62, -var12.field9802, arg4 + 1, arg5, arg7, var12.field9821);
                                    }
                                } else if (~arg8 == -4) {
                                    if (class246.field3927 && var12.field9846) {
                                        var19.method476(arg4, arg5, 50);
                                        var19.method476(arg4 - -1, arg5, 50);
                                    }
                                    if (~var29 == -2 && !super.field1661) {
                                        class575.method3374(2, -88, var12.field9802, arg4, arg5, arg7, var12.field9821);
                                    }
                                }
                            } else {
                                if (class246.field3927 && var12.field9846) {
                                    var19.method476(arg4, arg5 + 1, 50);
                                    var19.method476(arg4 + 1, arg5 - -1, 50);
                                }
                                if (~var29 == -2 && !super.field1661) {
                                    class575.method3374(2, -61, -var12.field9802, arg4, arg5 + 1, arg7, var12.field9821);
                                }
                            }
                            if (var12.field9842 != 0 && arg0 != null) {
                                arg0.method376(!var12.field9767, arg8, arg9, arg4, (byte) 61, var12.field9834, arg5);
                            }
                            if (~var12.field9761 != -65) {
                                class17.method252(arg7, arg4, arg5, var12.field9761);
                            }
                        } else if (~arg9 == -2) {
                            class563 var32;
                            if (!var24) {
                                var32 = new class436(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, arg9, arg8, arg2);
                            } else {
                                class353 var33 = new class353(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, arg9, arg8, var23);
                                if (var33.method395(-29400)) {
                                    var33.method407(arg6, -87);
                                }
                                var32 = var33;
                            }
                            class660.method3786(arg7, arg4, arg5, var32, (class563) null);
                            if (var12.field9846 && class246.field3927) {
                                if (~arg8 == -1) {
                                    var19.method476(arg4, arg5 + 1, 50);
                                } else if (~arg8 != -2) {
                                    if (~arg8 != -3) {
                                        if (arg8 == 3) {
                                            var19.method476(arg4, arg5, 50);
                                        }
                                    } else {
                                        var19.method476(arg4 + 1, arg5, 50);
                                    }
                                } else {
                                    var19.method476(arg4 - -1, arg5 + 1, 50);
                                }
                            }
                            if (var12.field9842 != 0 && arg0 != null) {
                                arg0.method376(!var12.field9767, arg8, arg9, arg4, (byte) 61, var12.field9834, arg5);
                            }
                        } else if (arg9 == 2) {
                            int var34 = arg8 + 1 & 3;
                            class563 var35;
                            class563 var36;
                            if (!var24) {
                                var35 = new class436(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, arg9, arg8 - -4, arg2);
                                var36 = new class436(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, arg9, var34, arg2);
                            } else {
                                class353 var37 = new class353(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, arg9, arg8 - -4, var23);
                                class353 var38 = new class353(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, arg9, var34, var23);
                                if (var37.method395(arg10 + -29398)) {
                                    var37.method407(arg6, -78);
                                }
                                var36 = var38;
                                var35 = var37;
                                if (var38.method395(-29400)) {
                                    var38.method407(arg6, 84);
                                }
                            }
                            class660.method3786(arg7, arg4, arg5, var35, var36);
                            if ((~var12.field9831 == -2 || class441.field6716 && ~var12.field9831 == 0) && !super.field1661) {
                                if (arg8 == 0) {
                                    class575.method3374(1, arg10 ^ 59, var12.field9802, arg4, arg5, arg7, var12.field9821);
                                    class575.method3374(2, arg10 + -103, var12.field9802, arg4, arg5 + 1, arg7, var12.field9821);
                                } else if (~arg8 == -2) {
                                    class575.method3374(1, -69, var12.field9802, arg4 - -1, arg5, arg7, var12.field9821);
                                    class575.method3374(2, arg10 ^ 69, var12.field9802, arg4, arg5 + 1, arg7, var12.field9821);
                                } else if (~arg8 == -3) {
                                    class575.method3374(1, -112, var12.field9802, arg4 + 1, arg5, arg7, var12.field9821);
                                    class575.method3374(2, -114, var12.field9802, arg4, arg5, arg7, var12.field9821);
                                } else if (arg8 == 3) {
                                    class575.method3374(1, -43, var12.field9802, arg4, arg5, arg7, var12.field9821);
                                    class575.method3374(2, -119, var12.field9802, arg4, arg5, arg7, var12.field9821);
                                }
                            }
                            if (~var12.field9842 != -1 && arg0 != null) {
                                arg0.method376(!var12.field9767, arg8, arg9, arg4, (byte) 61, var12.field9834, arg5);
                            }
                            if (var12.field9761 != 64) {
                                class17.method252(arg7, arg4, arg5, var12.field9761);
                            }
                        } else if (arg9 == 3) {
                            class563 var39;
                            if (!var24) {
                                var39 = new class436(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, arg9, arg8, arg2);
                            } else {
                                class353 var40 = new class353(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, arg9, arg8, var23);
                                var39 = var40;
                                if (var40.method395(-29400)) {
                                    var40.method407(arg6, 63);
                                }
                            }
                            class660.method3786(arg7, arg4, arg5, var39, (class563) null);
                            if (var12.field9846 && class246.field3927) {
                                if (arg8 != 0) {
                                    if (~arg8 != -2) {
                                        if (~arg8 != -3) {
                                            if (~arg8 == -4) {
                                                var19.method476(arg4, arg5, 50);
                                            }
                                        } else {
                                            var19.method476(arg4 + 1, arg5, 50);
                                        }
                                    } else {
                                        var19.method476(arg4 - -1, arg5 + 1, 50);
                                    }
                                } else {
                                    var19.method476(arg4, arg5 + 1, 50);
                                }
                            }
                            if (~var12.field9842 != -1 && arg0 != null) {
                                arg0.method376(!var12.field9767, arg8, arg9, arg4, (byte) 61, var12.field9834, arg5);
                            }
                        } else if (~arg9 == -10) {
                            class459 var41;
                            if (!var24) {
                                var41 = new class208(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, arg4, arg4 - -var14 + -1, arg5, arg5 + var13 + -1, arg9, arg8, arg2);
                            } else {
                                class91 var42 = new class91(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, arg4, arg4, arg5, arg5, arg9, arg8, var23);
                                if (var42.method395(-29400)) {
                                    var42.method407(arg6, -105);
                                }
                                var41 = var42;
                            }
                            class259.method1830(var41, false);
                            if (~var12.field9842 != -1 && arg0 != null) {
                                arg0.method386(var12.field9834, var14, arg4, (byte) -90, !var12.field9767, arg5, var13);
                            }
                            if (~var12.field9761 != -65) {
                                class17.method252(arg7, arg4, arg5, var12.field9761);
                            }
                        } else if (arg9 == 4) {
                            class180 var44;
                            if (var24) {
                                class305 var43 = new class305(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, 0, 0, arg9, arg8);
                                var44 = var43;
                                if (var43.method395(-29400)) {
                                    var43.method407(arg6, 110);
                                }
                            } else {
                                var44 = new class695(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, 0, 0, arg9, arg8, arg2);
                            }
                            class341.method2332(arg7, arg4, arg5, var44, (class180) null);
                        } else if (arg9 == 5) {
                            int var45 = 65;
                            class302 var46 = (class302) class681.method3880(arg7, arg4, arg5);
                            if (var46 != null) {
                                var45 = class213.field3537.method94(var46.method394((byte) -104), (byte) -42).field9761 - -1;
                            }
                            class180 var48;
                            if (var24) {
                                class305 var47 = new class305(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, class314.field4935[arg8] * var45, class299.field4676[arg8] * var45, arg9, arg8);
                                if (var47.method395(arg10 ^ 29398)) {
                                    var47.method407(arg6, -60);
                                }
                                var48 = var47;
                            } else {
                                var48 = new class695(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, class314.field4935[arg8] * var45, class299.field4676[arg8] * var45, arg9, arg8, arg2);
                            }
                            class341.method2332(arg7, arg4, arg5, var48, (class180) null);
                        } else if (~arg9 == -7) {
                            int var49 = 33;
                            class302 var50 = (class302) class681.method3880(arg7, arg4, arg5);
                            if (var50 != null) {
                                var49 = 1 + class213.field3537.method94(var50.method394((byte) -87), (byte) -42).field9761 / 2;
                            }
                            class180 var52;
                            if (var24) {
                                class305 var51 = new class305(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, class314.field4935[arg8] * var49, class299.field4676[arg8] * var49, arg9, arg8 + 4);
                                if (var51.method395(arg10 + -29398)) {
                                    var51.method407(arg6, arg10 ^ -77);
                                }
                                var52 = var51;
                            } else {
                                var52 = new class695(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, class153.field2559[arg8] * var49, class272.field4388[arg8] * var49, arg9, arg8 - -4, arg2);
                            }
                            class341.method2332(arg7, arg4, arg5, var52, (class180) null);
                        } else if (arg9 == 7) {
                            int var53 = arg8 + 2 & 3;
                            class180 var55;
                            if (var24) {
                                class305 var54 = new class305(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, 0, 0, arg9, var53 - -4);
                                if (var54.method395(arg10 ^ 29398)) {
                                    var54.method407(arg6, -114);
                                }
                                var55 = var54;
                            } else {
                                var55 = new class695(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, 0, 0, arg9, var53 + 4, arg2);
                            }
                            class341.method2332(arg7, arg4, arg5, var55, (class180) null);
                        } else if (arg9 == 8) {
                            int var56 = 3 & arg8 + 2;
                            int var57 = 33;
                            class302 var58 = (class302) class681.method3880(arg7, arg4, arg5);
                            if (var58 != null) {
                                var57 = 1 + class213.field3537.method94(var58.method394((byte) -114), (byte) -42).field9761 / 2;
                            }
                            class180 var61;
                            class180 var62;
                            if (!var24) {
                                class695 var59 = new class695(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, class153.field2559[arg8] * var57, class272.field4388[arg8] * var57, arg9, arg8 + 4, arg2);
                                class695 var60 = new class695(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, 0, 0, arg9, var56 + 4, arg2);
                                var61 = var59;
                                var62 = var60;
                            } else {
                                class305 var63 = new class305(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, class153.field2559[arg8] * var57, class272.field4388[arg8] * var57, arg9, arg8 + 4);
                                class305 var64 = new class305(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, 0, 0, arg9, var56 - -4);
                                if (var63.method395(arg10 + -29398)) {
                                    var63.method407(arg6, -93);
                                }
                                if (var64.method395(arg10 ^ 29398)) {
                                    var64.method407(arg6, arg10 + -64);
                                }
                                var61 = var63;
                                var62 = var64;
                            }
                            class341.method2332(arg7, arg4, arg5, var61, var62);
                        }
                    } else {
                        class91 var65 = null;
                        class459 var66;
                        int var67;
                        if (!var24) {
                            var66 = new class208(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, arg4, arg4 - 1 + var14, arg5, arg5 + var13 + -1, arg9, arg8, arg2);
                            var67 = 15;
                        } else {
                            class91 var68 = new class91(arg6, var12, arg7, arg3, var21, var20, var22, super.field1661, arg4, var14 + -1 + arg4, arg5, arg5 + -1 + var13, arg9, arg8, var23);
                            var66 = var68;
                            var65 = var68;
                            var67 = var68.method810((byte) -38);
                        }
                        if (class259.method1830(var66, false)) {
                            if (var65 != null && var65.method395(arg10 ^ 29398)) {
                                var65.method407(arg6, arg10 ^ 104);
                            }
                            if (var12.field9846 && class246.field3927) {
                                if (var67 > 30) {
                                    var67 = 30;
                                }
                                for (int var69 = 0; ~var14 <= ~var69; ++var69) {
                                    for (int var70 = 0; var13 >= var70; ++var70) {
                                        var19.method476(arg4 + var69, arg5 + var70, var67);
                                    }
                                }
                            }
                        }
                        if (var12.field9842 != 0 && arg0 != null) {
                            arg0.method386(var12.field9834, var14, arg4, (byte) -90, !var12.field9767, arg5, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(Z)V")
    public static final void method1498(boolean arg0) {
        ++field3104;
        if (class402.field6207.field7655 && ~class331.field5115.field6971 != 0) {
            class463.method2895(class331.field5115.field6971, class331.field5115.field6959, -21117);
        }
        if (!arg0) {
            field3108 = false;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIILr;III[Lnc;II[B)V")
    public final void method1499(int arg0, int arg1, int arg2, class167 arg3, int arg4, int arg5, int arg6, class23[] arg7, int arg8, int arg9, byte[] arg10) {
        ++field3103;
        int var12 = -57 / ((-42 - arg5) / 59);
        class6 var13 = new class6(arg10);
        int var14 = -1;
        while (true) {
            int var15 = var13.method60(false);
            if (~var15 == -1) {
                return;
            }
            var14 += var15;
            int var16 = 0;
            while (true) {
                int var17 = var13.method88((byte) 90);
                if (var17 == 0) {
                    break;
                }
                var16 += var17 - 1;
                int var18 = var16 & 63;
                int var19 = var16 >> 6 & 63;
                int var20 = var16 >> 12;
                int var21 = var13.method70(-9059);
                int var22 = var21 >> 2;
                int var23 = 3 & var21;
                if (arg0 == var20 && arg2 <= var19 && ~var19 > ~(arg2 - -8) && arg1 <= var18 && var18 < arg1 + 8) {
                    class698 var24 = class213.field3537.method94(var14, (byte) -42);
                    int var25 = class110.method1029(var23, var24.field9829, var24.field9851, 7 & var18, var19 & 7, arg6, -117) + arg4;
                    int var26 = class481.method2969(var24.field9829, arg6, 89, var24.field9851, var18 & 7, var23, var19 & 7) + arg8;
                    if (~var25 < -1 && var26 > 0 && var25 < super.field1657 - 1 && ~var26 > ~(super.field1656 + -1)) {
                        class23 var27 = null;
                        if (!super.field1661) {
                            int var28 = arg9;
                            if ((2 & class690.field9676[1][var25][var26]) == 2) {
                                var28 = arg9 - 1;
                            }
                            if (~var28 <= -1) {
                                var27 = arg7[var28];
                            }
                        }
                        this.method1497(var27, var14, -1, arg9, var25, var26, arg3, arg9, var23 - -arg6 & 3, var22, -2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZLr;Z)V")
    public final void method1500(boolean arg0, class167 arg1, boolean arg2) {
        class653.method3761();
        if (!arg2) {
            ++field3106;
            if (!arg0) {
                if (~super.field1670 < -2) {
                    for (int var4 = 0; ~super.field1657 < ~var4; ++var4) {
                        for (int var5 = 0; ~super.field1656 < ~var5; ++var5) {
                            if (~(class690.field9676[1][var4][var5] & 2) == -3) {
                                class386.method2515(var4, var5);
                            }
                        }
                    }
                }
                for (int var6 = 0; super.field1670 > var6; ++var6) {
                    for (int var7 = 0; var7 <= super.field1656; ++var7) {
                        for (int var8 = 0; ~super.field1657 <= ~var8; ++var8) {
                            if (~(4 & super.field1668[var6][var8][var7]) != -1) {
                                int var9 = var8;
                                int var10 = var8;
                                int var11 = var7;
                                int var12 = var7;
                                while (~var11 < -1 && ~(super.field1668[var6][var8][var11 + -1] & 4) != -1 && -var11 + var12 < 10) {
                                    --var11;
                                }
                                while (super.field1656 > var12 && (super.field1668[var6][var8][var12 + 1] & 4) != 0 && ~(-var11 + var12) > -11) {
                                    ++var12;
                                }
                                label117: while (~var9 < -1 && ~(-var9 + var10) > -11) {
                                    for (int var13 = var11; var12 >= var13; ++var13) {
                                        if ((super.field1668[var6][var9 + -1][var13] & 4) == 0) {
                                            break label117;
                                        }
                                    }
                                    --var9;
                                }
                                label104: while (super.field1657 > var10 && var10 - var9 < 10) {
                                    for (int var14 = var11; var12 >= var14; ++var14) {
                                        if (~(super.field1668[var6][var10 + 1][var14] & 4) == -1) {
                                            break label104;
                                        }
                                    }
                                    ++var10;
                                }
                                if (~((var12 - var11 + 1) * (-var9 + var10 + 1)) <= -5) {
                                    int var15 = super.field1676[var6][var9][var11];
                                    class476.method2960(var15, var9 << 9, var11 << 9, var6, var15, 96, (var12 << 9) + 512, 4, (var10 << 9) - -512);
                                    for (int var16 = var9; ~var16 >= ~var10; ++var16) {
                                        for (int var17 = var11; var12 >= var17; ++var17) {
                                            super.field1668[var6][var16][var17] = (byte) class453.method2846(super.field1668[var6][var16][var17], -5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class654.method3769((byte) 42);
            }
            super.field1668 = null;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I[IIIIILr;Lie;III)V")
    public final void method1501(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, class167 arg6, class6 arg7, int arg8, int arg9, int arg10) {
        ++field3109;
        if (arg5 > -84) {
            this.field3107 = 22;
        }
        if (!super.field1661) {
            boolean var12 = false;
            class491 var13 = null;
            if (arg1 != null) {
                arg1[0] = -1;
            }
            int var14 = (7 & arg10) * 8;
            int var15 = (7 & arg9) * 8;
            while (true) {
                while (~arg7.field57 > ~arg7.field96.length) {
                    int var20 = arg7.method70(-9059);
                    if (var20 == 0) {
                        var13 = new class491(arg7);
                    } else if (~var20 == -2) {
                        int var21 = arg7.method70(-9059);
                        if (var21 > 0) {
                            for (int var22 = 0; var22 < var21; ++var22) {
                                class263 var23 = new class263(arg6, arg7, 2);
                                if (var23.field4292 == 31) {
                                    class209 var24 = class357.field5693.method2624(true, arg7.method67(12021));
                                    var23.method1870(var24.field3498, var24.field3495, var24.field3494, var24.field3493, true);
                                }
                                if (arg6.method267() > 0) {
                                    class674 var25 = var23.field4300;
                                    int var26 = var25.method3857((byte) -35) >> 9;
                                    int var27 = var25.method3859((byte) 117) >> 9;
                                    if (~var23.field4302 == ~arg4 && var26 >= var14 && var26 < var14 - -8 && var27 >= var15 && ~var27 > ~(var15 - -8)) {
                                        int var28 = class653.method3760(arg2, var25.method3859((byte) 117) & 4095, (byte) -128, var25.method3857((byte) -35) & 4095) + (arg0 << 9);
                                        int var29 = class106.method1003(8, arg2, var25.method3859((byte) 117) & 4095, var25.method3857((byte) -35) & 4095) + (arg3 << 9);
                                        int var30 = var28 >> 9;
                                        int var31 = var29 >> 9;
                                        if (~var30 <= -1 && var31 >= 0 && var30 < super.field1657 && ~super.field1656 < ~var31) {
                                            var25.method187(var29, super.field1676[arg4][var30][var31] - var25.method3851((byte) -118), 0, var28);
                                            class493.method3009(var23);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~var20 == -3) {
                        if (var13 == null) {
                            var13 = new class491();
                        }
                        var13.method3006((byte) 100, arg7);
                    } else if (~var20 == -129) {
                        if (arg1 == null) {
                            arg7.field57 += 10;
                        } else {
                            arg1[0] = arg7.method67(12021);
                            arg1[1] = arg7.method45(-8652);
                            arg1[2] = arg7.method45(-8652);
                            arg1[3] = arg7.method45(-8652);
                            arg1[4] = arg7.method67(12021);
                        }
                    } else {
                        if (~var20 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field1679 == null) {
                            super.field1679 = new byte[4][][];
                        }
                        for (int var32 = 0; ~var32 > -5; ++var32) {
                            byte var33 = arg7.method81(true);
                            if (var33 == 0 && super.field1679[arg8] != null) {
                                if (var32 <= arg4) {
                                    int var34 = arg0;
                                    int var35 = arg0 + 7;
                                    int var36 = arg3;
                                    if (arg0 < 0) {
                                        var34 = 0;
                                    } else if (~arg0 <= ~super.field1657) {
                                        var34 = super.field1657;
                                    }
                                    if (~arg3 <= -1) {
                                        if (~super.field1656 >= ~arg3) {
                                            var36 = super.field1656;
                                        }
                                    } else {
                                        var36 = 0;
                                    }
                                    if (var35 >= 0) {
                                        if (~var35 <= ~super.field1657) {
                                            var35 = super.field1657;
                                        }
                                    } else {
                                        var35 = 0;
                                    }
                                    int var37 = arg3 + 7;
                                    if (~var37 > -1) {
                                        var37 = 0;
                                    } else if (~var37 <= ~super.field1656) {
                                        var37 = super.field1656;
                                    }
                                    while (~var34 > ~var35) {
                                        while (~var36 > ~var37) {
                                            super.field1679[arg8][var34][var36] = 0;
                                            ++var36;
                                        }
                                        ++var34;
                                    }
                                }
                            } else if (var33 == 1) {
                                if (super.field1679[arg8] == null) {
                                    super.field1679[arg8] = new byte[super.field1657 - -1][super.field1656 - -1];
                                }
                                for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                    for (int var39 = 0; var39 < 64; var39 += 4) {
                                        byte var40 = arg7.method81(true);
                                        if (var32 <= arg4) {
                                            for (int var41 = var38; var41 < var38 + 4; ++var41) {
                                                for (int var42 = var39; ~(var39 - -4) < ~var42; ++var42) {
                                                    if (~var41 <= ~var14 && ~(var14 - -8) < ~var41 && var42 >= var15 && ~var15 > ~(var15 + 8)) {
                                                        int var43 = class626.method3655(arg2, -110, var41 & 7, var42 & 7) + arg0;
                                                        int var44 = class219.method1630(arg2, -1, var41 & 7, 7 & var42) + arg3;
                                                        if (~var43 <= -1 && ~super.field1657 < ~var43 && var44 >= 0 && var44 < super.field1656) {
                                                            super.field1679[arg8][var43][var44] = var40;
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
                }
                if (var13 != null) {
                    class327.method2203(var13, (byte) 95, arg0 >> 3, arg3 >> 3);
                }
                if (!var12 && super.field1679 != null && super.field1679[arg8] != null) {
                    int var16 = arg0 + 7;
                    int var17 = arg3 + 7;
                    for (int var18 = arg0; ~var18 > ~var16; ++var18) {
                        for (int var19 = arg3; ~var17 < ~var19; ++var19) {
                            super.field1679[arg8][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1502(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
