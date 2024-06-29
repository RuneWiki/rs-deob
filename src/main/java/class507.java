import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class507 extends class270 {

    @OriginalMember(owner = "client!wn", name = "P", descriptor = "I")
    public int field7499 = 99;

    @OriginalMember(owner = "client!wn", name = "K", descriptor = "I")
    public static int field7494 = 0;

    @OriginalMember(owner = "client!wn", name = "M", descriptor = "F")
    public static float field7496;

    @OriginalMember(owner = "client!wn", name = "E", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!wn", name = "J", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!wn", name = "L", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!wn", name = "N", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!wn", name = "O", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!wn", name = "Q", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!wn", name = "R", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!wn", name = "S", descriptor = "I")
    public static int field7502;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wn", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field7503;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I[IILya;ILiv;)V")
    public final void method3024(int arg0, int[] arg1, int arg2, class38 arg3, int arg4, class65 arg5) {
        ++field7492;
        if (!super.field3990) {
            boolean var7 = false;
            if (arg1 != null) {
                arg1[0] = -1;
            }
            class196 var8 = null;
            while (true) {
                while (arg5.field827 < arg5.field783.length) {
                    int var18 = arg5.method577(255);
                    if (~var18 == -1) {
                        var8 = new class196(arg5);
                    } else if (~var18 == -2) {
                        int var34 = arg5.method577(255);
                        if (var34 > 0) {
                            for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                class521 var36 = new class521(arg3, arg5, 0);
                                if (~var36.field7651 == -32) {
                                    class393 var37 = class171.field2434.method3023(arg5.method623((byte) -125), 70);
                                    var36.method3096(var37.field5782, var37.field5787, var37.field5785, var37.field5779, (byte) -101);
                                }
                                if (arg3.method322() > 0) {
                                    class124 var38 = var36.field7653;
                                    int var39 = (arg4 << 7) + var38.method980(false);
                                    int var40 = var38.method983((byte) -56) - -(arg2 << 7);
                                    int var41 = var39 >> 7;
                                    int var42 = var40 >> 7;
                                    if (~var41 <= -1 && var42 >= 0 && super.field3993 > var41 && super.field3975 > var42) {
                                        var38.method770(var39, super.field3996[var36.field7662][var41][var42] - var38.method981((byte) 27), var40, (byte) 21);
                                        if (arg3.method322() > 0) {
                                            class82.method740(var36);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~var18 == -3) {
                        if (var8 == null) {
                            var8 = new class196();
                        }
                        var8.method1369((byte) -31, arg5);
                    } else if (var18 == 128) {
                        if (arg1 == null) {
                            arg5.field827 += 10;
                        } else {
                            arg1[0] = arg5.method623((byte) -72);
                            arg1[1] = arg5.method599((byte) 1);
                            arg1[2] = arg5.method599((byte) 1);
                            arg1[3] = arg5.method599((byte) 1);
                            arg1[4] = arg5.method623((byte) 88);
                        }
                    } else {
                        if (var18 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field3981 == null) {
                            super.field3981 = new byte[4][][];
                        }
                        var7 = true;
                        for (int var19 = 0; var19 < 4; ++var19) {
                            byte var20 = arg5.method629(false);
                            if (var20 == 0 && super.field3981[var19] != null) {
                                int var21 = arg4;
                                int var22 = arg4 + 64;
                                int var23 = arg2;
                                if (~arg2 > -1) {
                                    var23 = 0;
                                } else if (~super.field3975 >= ~arg2) {
                                    var23 = super.field3975;
                                }
                                if (arg4 >= 0) {
                                    if (super.field3993 <= arg4) {
                                        var21 = super.field3993;
                                    }
                                } else {
                                    var21 = 0;
                                }
                                if (var22 < 0) {
                                    var22 = 0;
                                } else if (~super.field3993 >= ~var22) {
                                    var22 = super.field3993;
                                }
                                int var24 = arg2 + 64;
                                if (~var24 > -1) {
                                    var24 = 0;
                                } else if (var24 >= super.field3975) {
                                    var24 = super.field3975;
                                }
                                while (var22 > var21) {
                                    while (var24 > var23) {
                                        super.field3981[var19][var21][var23] = 0;
                                        ++var23;
                                    }
                                    ++var21;
                                }
                            } else if (var20 != 1) {
                                if (~var20 == -3) {
                                    if (super.field3981[var19] == null) {
                                        super.field3981[var19] = new byte[super.field3993 + 1][super.field3975 + 1];
                                    }
                                    if (var19 > 0) {
                                        int var25 = arg4;
                                        int var26 = arg4 - -64;
                                        int var27 = arg2;
                                        if (var26 < 0) {
                                            var26 = 0;
                                        } else if (super.field3993 <= var26) {
                                            var26 = super.field3993;
                                        }
                                        if (~arg2 <= -1) {
                                            if (~arg2 <= ~super.field3975) {
                                                var27 = super.field3975;
                                            }
                                        } else {
                                            var27 = 0;
                                        }
                                        int var28 = arg2 - -64;
                                        if (~arg4 > -1) {
                                            var25 = 0;
                                        } else if (~super.field3993 >= ~arg4) {
                                            var25 = super.field3993;
                                        }
                                        if (~var28 <= -1) {
                                            if (~var28 <= ~super.field3975) {
                                                var28 = super.field3975;
                                            }
                                        } else {
                                            var28 = 0;
                                        }
                                        while (~var25 > ~var26) {
                                            while (var28 > var27) {
                                                super.field3981[var19][var25][var27] = super.field3981[var19 + -1][var25][var27];
                                                ++var27;
                                            }
                                            ++var25;
                                        }
                                    }
                                }
                            } else {
                                if (super.field3981[var19] == null) {
                                    super.field3981[var19] = new byte[super.field3993 + 1][super.field3975 - -1];
                                }
                                for (int var29 = 0; ~var29 > -65; var29 += 4) {
                                    for (int var30 = 0; ~var30 > -65; var30 += 4) {
                                        byte var31 = arg5.method629(false);
                                        for (int var32 = var29 - -arg4; var32 < arg4 + var29 + 4; ++var32) {
                                            for (int var33 = arg2 + var30; ~(var30 - -arg2 + 4) < ~var33; ++var33) {
                                                if (var32 >= 0 && super.field3993 > var32 && var33 >= 0 && var33 < super.field3975) {
                                                    super.field3981[var19][var32][var33] = var31;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (var8 != null) {
                    for (int var9 = 0; ~var9 > -9; ++var9) {
                        for (int var10 = 0; ~var10 > -9; ++var10) {
                            int var11 = (arg4 >> 3) + var9;
                            int var12 = (arg2 >> 3) + var10;
                            if (var11 >= 0 && var11 < super.field3993 >> 3 && ~var12 <= -1 && var12 < super.field3975 >> 3) {
                                class92.method816(var8, false, var11, var12);
                            }
                        }
                    }
                }
                if (arg0 != 0) {
                    return;
                }
                if (!var7 && super.field3981 != null) {
                    for (int var13 = 0; ~var13 > -5; ++var13) {
                        if (super.field3981[var13] != null) {
                            for (int var14 = 0; var14 < 16; ++var14) {
                                for (int var15 = 0; ~var15 > -17; ++var15) {
                                    int var16 = (arg4 >> 2) + var14;
                                    int var17 = (arg2 >> 2) + var15;
                                    if (var16 >= 0 && ~var16 > -27 && var17 >= 0 && var17 < 26) {
                                        super.field3981[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lya;ILsd;IIII)V")
    public final void method3025(class38 arg0, int arg1, class62 arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7498;
        class529 var8 = null;
        if (arg3 == 0) {
            var8 = (class529) class344.method2079(arg4, arg6, arg5);
        }
        if (~arg3 == -2) {
            var8 = (class529) class510.method3040(arg4, arg6, arg5);
        }
        if (~arg3 == -3) {
            var8 = (class529) class262.method1683(arg4, arg6, arg5, field7503 != null ? field7503 : (field7503 = method3032("f")));
        }
        if (~arg3 == arg1) {
            var8 = (class529) class282.method1802(arg4, arg6, arg5);
        }
        if (var8 != null) {
            class222 var9 = class384.field5645.method786(var8.method28(true), 0);
            int var10 = var8.method27(-45);
            int var11 = var8.method22((byte) -70);
            if (var9.method1507(0)) {
                class301.method1893(arg5, arg6, 36161, arg4, var9);
            }
            if (var8.method30(10869)) {
                var8.method26(true, arg0);
            }
            if (arg3 == 0) {
                class235 var12 = class344.method2079(arg4, arg6, arg5);
                if (!(var12 instanceof class220)) {
                    class72.method675(arg4, arg6, arg5);
                } else {
                    ((class220) var12).field3163 = null;
                }
                if (var9.field3267 != 0) {
                    arg2.method563(arg1 ^ 86, var11, var10, arg5, arg6, var9.field3230, !var9.field3187);
                    return;
                }
            } else if (arg3 != 1) {
                if (~arg3 == -3) {
                    class431 var13 = class262.method1683(arg4, arg6, arg5, field7503 != null ? field7503 : (field7503 = method3032("f")));
                    if (var13 instanceof class450 && ~var13.field6332 == ~arg6 && var13.field6339 == arg5) {
                        ((class450) var13).field6628 = null;
                    } else {
                        class353.method2129(arg4, arg6, arg5, field7503 != null ? field7503 : (field7503 = method3032("f")));
                    }
                    if (var9.field3267 != 0 && super.field3993 > var9.field3206 + arg6 && ~super.field3975 < ~(var9.field3206 + arg5) && super.field3993 > arg6 - -var9.field3180 && ~super.field3975 < ~(var9.field3180 + arg5)) {
                        arg2.method552(arg5, var11, var9.field3230, arg1 ^ -22914, var9.field3206, arg6, !var9.field3187, var9.field3180);
                        return;
                    }
                    return;
                }
                if (~arg3 == -4) {
                    class363 var14 = class282.method1802(arg4, arg6, arg5);
                    if (var14 instanceof class70) {
                        ((class70) var14).field895 = null;
                    } else {
                        class180.method1267(arg4, arg6, arg5);
                    }
                    if (~var9.field3267 == -2) {
                        arg2.method562(arg6, arg5, false);
                        return;
                    }
                }
            } else {
                class386 var15 = class510.method3040(arg4, arg6, arg5);
                if (!(var15 instanceof class209)) {
                    class346.method2095(arg4, arg6, arg5);
                    return;
                }
                ((class209) var15).field3024 = null;
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "([Lsd;I[BIILya;)V")
    public final void method3026(class62[] arg0, int arg1, byte[] arg2, int arg3, int arg4, class38 arg5) {
        ++field7501;
        if (arg4 == 1) {
            class65 var7 = new class65(arg2);
            int var8 = -1;
            while (true) {
                int var9 = var7.method586(44);
                if (var9 == 0) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.method593((byte) 79);
                    if (var11 == 0) {
                        break;
                    }
                    var10 += var11 + -1;
                    int var12 = var10 & 63;
                    int var13 = var10 >> 6 & 63;
                    int var14 = var10 >> 12;
                    int var15 = var7.method577(255);
                    int var16 = var15 >> 2;
                    int var17 = 3 & var15;
                    int var18 = arg3 + var13;
                    int var19 = arg1 + var12;
                    if (~var18 < -1 && ~var19 < -1 && super.field3993 + -1 > var18 && ~var19 > ~(super.field3975 + -1)) {
                        class62 var20 = null;
                        if (!super.field3990) {
                            int var21 = var14;
                            if (~(2 & class238.field3497[1][var18][var19]) == -3) {
                                var21 = var14 - 1;
                            }
                            if (~var21 <= -1) {
                                var20 = arg0[var21];
                            }
                        }
                        this.method3029(var18, var14, var17, -1, var8, arg5, var16, var19, var14, (byte) 26, var20);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILiv;[ILya;IIIIII)V")
    public final void method3027(int arg0, int arg1, class65 arg2, int[] arg3, class38 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field7495;
        if (!super.field3990) {
            boolean var12 = false;
            class196 var13 = null;
            if (arg3 != null) {
                arg3[0] = -1;
            }
            int var14 = (arg6 & 7) * 8;
            int var15 = (7 & arg5) * arg8;
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (arg2.field827 < arg2.field783.length) {
                                int var20 = arg2.method577(arg8 ^ 247);
                                if (~var20 != -1) {
                                    if (~var20 != -2) {
                                        if (var20 != 2) {
                                            if (var20 != 128) {
                                                if (~var20 != -130) {
                                                    throw new IllegalStateException("");
                                                }
                                                if (super.field3981 == null) {
                                                    super.field3981 = new byte[4][][];
                                                }
                                                for (int var21 = 0; var21 < 4; ++var21) {
                                                    byte var22 = arg2.method629(false);
                                                    if (var22 == 0 && super.field3981[arg0] != null) {
                                                        if (var21 <= arg9) {
                                                            int var23 = arg10;
                                                            int var24 = arg10 + 7;
                                                            int var25 = arg1;
                                                            if (~arg1 <= -1) {
                                                                if (~super.field3975 >= ~arg1) {
                                                                    var25 = super.field3975;
                                                                }
                                                            } else {
                                                                var25 = 0;
                                                            }
                                                            if (var24 < 0) {
                                                                var24 = 0;
                                                            } else if (var24 >= super.field3993) {
                                                                var24 = super.field3993;
                                                            }
                                                            int var26 = arg1 + 7;
                                                            if (~arg10 <= -1) {
                                                                if (super.field3993 <= arg10) {
                                                                    var23 = super.field3993;
                                                                }
                                                            } else {
                                                                var23 = 0;
                                                            }
                                                            if (var26 < 0) {
                                                                var26 = 0;
                                                            } else if (~super.field3975 >= ~var26) {
                                                                var26 = super.field3975;
                                                            }
                                                            while (~var23 > ~var24) {
                                                                while (~var26 < ~var25) {
                                                                    super.field3981[arg0][var23][var25] = 0;
                                                                    ++var25;
                                                                }
                                                                ++var23;
                                                            }
                                                        }
                                                    } else if (var22 == 1) {
                                                        if (super.field3981[arg0] == null) {
                                                            super.field3981[arg0] = new byte[super.field3993 - -1][super.field3975 + 1];
                                                        }
                                                        for (int var27 = 0; ~var27 > -65; var27 += 4) {
                                                            for (int var28 = 0; var28 < 64; var28 += 4) {
                                                                byte var29 = arg2.method629(false);
                                                                if (var21 <= arg9) {
                                                                    for (int var30 = var27; var27 + 4 > var30; ++var30) {
                                                                        for (int var31 = var28; var31 < var28 + 4; ++var31) {
                                                                            if (var30 >= var14 && var14 + 8 > var30 && ~var31 <= ~var15 && var15 + 8 > var15) {
                                                                                int var32 = arg10 - -class291.method1839(var31 & 7, arg7, 64, 7 & var30);
                                                                                int var33 = class531.method3132(arg7, (byte) -115, 7 & var30, var31 & 7) + arg1;
                                                                                if (var32 >= 0 && ~super.field3993 < ~var32 && ~var33 <= -1 && ~var33 > ~super.field3975) {
                                                                                    super.field3981[arg0][var32][var33] = var29;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (arg3 == null) {
                                                arg2.field827 += 10;
                                            } else {
                                                arg3[0] = arg2.method623((byte) 84);
                                                arg3[1] = arg2.method599((byte) 1);
                                                arg3[2] = arg2.method599((byte) 1);
                                                arg3[3] = arg2.method599((byte) 1);
                                                arg3[4] = arg2.method623((byte) 109);
                                            }
                                        } else {
                                            if (var13 == null) {
                                                var13 = new class196();
                                            }
                                            var13.method1369((byte) -31, arg2);
                                        }
                                    } else {
                                        int var34 = arg2.method577(255);
                                        if (var34 > 0) {
                                            for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                                class521 var36 = new class521(arg4, arg2, 0);
                                                if (~var36.field7651 == -32) {
                                                    class393 var37 = class171.field2434.method3023(arg2.method623((byte) 93), 96);
                                                    var36.method3096(var37.field5782, var37.field5787, var37.field5785, var37.field5779, (byte) 124);
                                                }
                                                if (~arg4.method322() < -1) {
                                                    class124 var38 = var36.field7653;
                                                    int var39 = var38.method980(false) >> 7;
                                                    int var40 = var38.method983((byte) -124) >> 7;
                                                    if (var36.field7662 == arg9 && ~var39 <= ~var14 && var39 < var14 + 8 && ~var40 <= ~var15 && ~(var15 + 8) < ~var40) {
                                                        int var41 = (arg10 << 7) - -class155.method1103(arg7, var38.method983((byte) -52) & 1023, -32457, 1023 & var38.method980(false));
                                                        int var42 = (arg1 << 7) - -class334.method2037(1023 & var38.method983((byte) -74), 1023 & var38.method980(false), false, arg7);
                                                        int var43 = var41 >> 7;
                                                        int var44 = var42 >> 7;
                                                        if (~var43 <= -1 && ~var44 <= -1 && super.field3993 > var43 && super.field3975 > var44) {
                                                            var38.method770(var41, super.field3996[arg9][var43][var44] - var38.method981((byte) 27), var42, (byte) 21);
                                                            if (~arg4.method322() < -1) {
                                                                class82.method740(var36);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var13 = new class196(arg2);
                                }
                            }
                            if (var13 != null) {
                                class92.method816(var13, false, arg10 >> 3, arg1 >> 3);
                            }
                            if (!var12 && super.field3981 != null && super.field3981[arg0] != null) {
                                int var16 = arg10 + 7;
                                int var17 = arg1 - -7;
                                for (int var18 = arg10; ~var18 > ~var16; ++var18) {
                                    for (int var19 = arg1; ~var19 > ~var17; ++var19) {
                                        super.field3981[arg0][var18][var19] = 0;
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

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "([BIIIIILya;I[Lsd;IB)V")
    public final void method3028(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7, class62[] arg8, int arg9, byte arg10) {
        ++field7500;
        class65 var12 = new class65(arg0);
        if (arg10 == 103) {
            int var13 = -1;
            while (true) {
                int var14 = var12.method586(41);
                if (~var14 == -1) {
                    return;
                }
                var13 += var14;
                int var15 = 0;
                while (true) {
                    int var16 = var12.method593((byte) 99);
                    if (var16 == 0) {
                        break;
                    }
                    var15 += var16 + -1;
                    int var17 = var15 & 63;
                    int var18 = (4084 & var15) >> 6;
                    int var19 = var15 >> 12;
                    int var20 = var12.method577(255);
                    int var21 = var20 >> 2;
                    int var22 = 3 & var20;
                    if (arg9 == var19 && arg2 <= var18 && ~(arg2 + 8) < ~var18 && var17 >= arg7 && var17 < arg7 + 8) {
                        class222 var23 = class384.field5645.method786(var13, 0);
                        int var24 = class432.method2625(7 & var18, arg3, var23.field3180, var17 & 7, 15993, var22, var23.field3206) + arg1;
                        int var25 = arg4 + class111.method904(var23.field3206, var22, arg3, (byte) 108, var23.field3180, var17 & 7, 7 & var18);
                        if (~var24 < -1 && ~var25 < -1 && super.field3993 + -1 > var24 && var25 < super.field3975 + -1) {
                            class62 var26 = null;
                            if (!super.field3990) {
                                int var27 = arg5;
                                if (~(2 & class238.field3497[1][var24][var25]) == -3) {
                                    var27 = arg5 - 1;
                                }
                                if (~var27 <= -1) {
                                    var26 = arg8[var27];
                                }
                            }
                            this.method3029(var24, arg5, arg3 + var22 & 3, -1, var13, arg6, var21, var25, arg5, (byte) 45, var26);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIILya;IIIBLsd;)V")
    public final void method3029(int arg0, int arg1, int arg2, int arg3, int arg4, class38 arg5, int arg6, int arg7, int arg8, byte arg9, class62 arg10) {
        ++field7502;
        if (class478.field7044.method2072(class65.field802, 127) || class389.method2392(arg0, class51.field575, (byte) 56, arg8, arg7)) {
            if (this.field7499 > arg1) {
                this.field7499 = arg1;
            }
            class222 var12 = class384.field5645.method786(arg4, 0);
            if (!arg5.method311() || !class478.field7044.field3356 || !var12.field3221) {
                int var13;
                int var14;
                if (arg2 != 1 && arg2 != 3) {
                    var13 = var12.field3206;
                    var14 = var12.field3180;
                } else {
                    var13 = var12.field3180;
                    var14 = var12.field3206;
                }
                int var15;
                int var16;
                if (super.field3993 >= arg0 + var13) {
                    var15 = (var13 >> 1) + arg0;
                    var16 = (var13 + 1 >> 1) + arg0;
                } else {
                    var15 = arg0;
                    var16 = arg0 + 1;
                }
                if (arg9 < 18) {
                    this.method3029(-74, 32, 17, -72, 23, (class38) null, 4, 37, 72, (byte) -46, (class62) null);
                }
                int var17;
                int var18;
                if (~(arg7 - -var14) < ~super.field3975) {
                    var17 = arg7 + 1;
                    var18 = arg7;
                } else {
                    var17 = (var14 + 1 >> 1) + arg7;
                    var18 = (var14 >> 1) + arg7;
                }
                class142 var19 = class131.field1899[arg8];
                int var20 = var19.method430(var15, var18) + (var19.method430(var16, var18) + var19.method430(var15, var17) - -var19.method430(var16, var17)) >> 2;
                int var21 = (arg0 << 7) - -(var13 << 6);
                int var22 = (arg7 << 7) - -(var14 << 6);
                boolean var23 = class411.field6106 && !super.field3990 && var12.field3204;
                if (var12.method1507(0)) {
                    class477.method2886(arg0, -1, (class461) null, (class364) null, arg7, arg2, arg1, var12);
                }
                boolean var24 = arg3 == -1 && ~var12.field3247 == 0 && var12.field3196 == null && var12.field3233 == null && !var12.field3248;
                if (!class104.field1461 || (!class156.method1106(arg6, (byte) -38) || var12.field3226 == 1) && (!class526.method3119(85, arg6) || var12.field3226 != 0)) {
                    if (arg6 == 22) {
                        if (class478.field7044.field3354 || var12.field3200 != 0 || ~var12.field3267 == -2 || var12.field3260) {
                            class363 var26;
                            if (var24) {
                                class237 var25 = new class237(arg5, var12, arg8, var21, var20, var22, super.field3990, arg2, var23);
                                if (var25.method30(10869)) {
                                    var25.method31(arg5, -12694);
                                }
                                var26 = var25;
                            } else {
                                var26 = new class4(arg5, var12, arg1, arg8, var21, var20, var22, super.field3990, arg2, arg3);
                            }
                            class363 var27 = class282.method1802(arg1, arg0, arg7);
                            if (!(var27 instanceof class70)) {
                                class315.method1966(arg1, arg0, arg7, var26);
                            } else {
                                ((class70) var27).field895 = var26;
                            }
                            if (~var12.field3267 == -2 && arg10 != null) {
                                arg10.method550(-1, arg7, arg0);
                            }
                        }
                    } else if (~arg6 != -11 && ~arg6 != -12) {
                        if (~arg6 <= -13 && ~arg6 >= -18 || ~arg6 <= -19 && ~arg6 >= -22) {
                            class431 var29;
                            if (var24) {
                                class131 var28 = new class131(arg5, var12, arg1, arg8, var21, var20, var22, super.field3990, arg0, arg0 + -1 + var13, arg7, var14 - 1 + arg7, arg6, arg2, var23);
                                var29 = var28;
                                if (var28.method30(10869)) {
                                    var28.method31(arg5, -12694);
                                }
                            } else {
                                var29 = new class153(arg5, var12, arg1, arg8, var21, var20, var22, super.field3990, arg0, arg0 + var13 + -1, arg7, arg7 + var14 + -1, arg6, arg2, arg3);
                            }
                            class431 var30 = class262.method1683(arg1, arg0, arg7, field7503 != null ? field7503 : (field7503 = method3032("f")));
                            if (var30 instanceof class450 && ~var30.field6332 == ~arg0 && ~var30.field6339 == ~arg7) {
                                ((class450) var30).field6628 = var29;
                            } else {
                                class322.method1989(var29, false);
                            }
                            if (class411.field6106 && !super.field3990 && arg6 >= 12 && ~arg6 >= -18 && ~arg6 != -14 && arg1 > 0 && ~var12.field3226 != -1) {
                                super.field3973[arg1][arg0][arg7] = (byte) class244.method1606(super.field3973[arg1][arg0][arg7], 4);
                            }
                            if (~var12.field3267 != -1 && arg10 != null) {
                                arg10.method556(var13, var12.field3230, 16624, var14, !var12.field3187, arg0, arg7);
                            }
                        } else if (arg6 == 0) {
                            int var31 = var12.field3226;
                            if (class429.field6316 && ~var12.field3226 == 0) {
                                var31 = 1;
                            }
                            class235 var32;
                            if (!var24) {
                                var32 = new class61(arg5, var12, arg1, arg8, var21, var20, var22, super.field3990, arg6, arg2, arg3);
                            } else {
                                class420 var33 = new class420(arg5, var12, arg8, var21, var20, var22, super.field3990, arg6, arg2, var23);
                                var32 = var33;
                                if (var33.method30(10869)) {
                                    var33.method31(arg5, -12694);
                                }
                            }
                            class235 var34 = class344.method2079(arg1, arg0, arg7);
                            if (!(var34 instanceof class220)) {
                                class111.method903(arg1, arg0, arg7, var32, (class235) null);
                            } else {
                                ((class220) var34).field3163 = var32;
                            }
                            if (class411.field6106) {
                                if (~arg2 != -1) {
                                    if (~arg2 != -2) {
                                        if (~arg2 == -3) {
                                            if (var12.field3253) {
                                                var19.method418(arg0 - -1, arg7, 50);
                                                var19.method418(arg0 + 1, arg7 + 1, 50);
                                            }
                                            if (~var31 == -2 && !super.field3990) {
                                                super.field3973[arg1][arg0 + 1][arg7] = (byte) class244.method1606(super.field3973[arg1][arg0 + 1][arg7], 1);
                                            }
                                        } else if (arg2 == 3) {
                                            if (var12.field3253) {
                                                var19.method418(arg0, arg7, 50);
                                                var19.method418(arg0 + 1, arg7, 50);
                                            }
                                            if (var31 == 1 && !super.field3990) {
                                                super.field3973[arg1][arg0][arg7] = (byte) class244.method1606(super.field3973[arg1][arg0][arg7], 2);
                                            }
                                        }
                                    } else {
                                        if (var12.field3253) {
                                            var19.method418(arg0, arg7 + 1, 50);
                                            var19.method418(arg0 + 1, arg7 + 1, 50);
                                        }
                                        if (var31 == 1 && !super.field3990) {
                                            super.field3973[arg1][arg0][arg7 + 1] = (byte) class244.method1606(super.field3973[arg1][arg0][arg7 + 1], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field3253) {
                                        var19.method418(arg0, arg7, 50);
                                        var19.method418(arg0, arg7 + 1, 50);
                                    }
                                    if (~var31 == -2 && !super.field3990) {
                                        super.field3973[arg1][arg0][arg7] = (byte) class244.method1606(super.field3973[arg1][arg0][arg7], 1);
                                    }
                                }
                            }
                            if (~var12.field3267 != -1 && arg10 != null) {
                                arg10.method560(arg7, var12.field3230, arg0, 268435456, arg2, !var12.field3187, arg6);
                            }
                            if (var12.field3203 != 16) {
                                class312.method1943(arg1, arg0, arg7, var12.field3203);
                            }
                        } else if (arg6 == 1) {
                            class235 var36;
                            if (var24) {
                                class420 var35 = new class420(arg5, var12, arg8, var21, var20, var22, super.field3990, arg6, arg2, var23);
                                if (var35.method30(10869)) {
                                    var35.method31(arg5, -12694);
                                }
                                var36 = var35;
                            } else {
                                var36 = new class61(arg5, var12, arg1, arg8, var21, var20, var22, super.field3990, arg6, arg2, arg3);
                            }
                            class235 var37 = class344.method2079(arg1, arg0, arg7);
                            if (!(var37 instanceof class220)) {
                                class111.method903(arg1, arg0, arg7, var36, (class235) null);
                            } else {
                                ((class220) var37).field3163 = var36;
                            }
                            if (var12.field3253 && class411.field6106) {
                                if (~arg2 != -1) {
                                    if (~arg2 != -2) {
                                        if (~arg2 != -3) {
                                            if (arg2 == 3) {
                                                var19.method418(arg0, arg7, 50);
                                            }
                                        } else {
                                            var19.method418(arg0 + 1, arg7, 50);
                                        }
                                    } else {
                                        var19.method418(arg0 + 1, arg7 + 1, 50);
                                    }
                                } else {
                                    var19.method418(arg0, arg7 + 1, 50);
                                }
                            }
                            if (var12.field3267 != 0 && arg10 != null) {
                                arg10.method560(arg7, var12.field3230, arg0, 268435456, arg2, !var12.field3187, arg6);
                            }
                        } else if (~arg6 == -3) {
                            int var38 = arg2 - -1 & 3;
                            class235 var41;
                            class235 var42;
                            if (var24) {
                                class420 var39 = new class420(arg5, var12, arg8, var21, var20, var22, super.field3990, arg6, arg2 + 4, var23);
                                class420 var40 = new class420(arg5, var12, arg8, var21, var20, var22, super.field3990, arg6, var38, var23);
                                if (var39.method30(10869)) {
                                    var39.method31(arg5, -12694);
                                }
                                var41 = var40;
                                var42 = var39;
                                if (var40.method30(10869)) {
                                    var40.method31(arg5, -12694);
                                }
                            } else {
                                var42 = new class61(arg5, var12, arg1, arg8, var21, var20, var22, super.field3990, arg6, arg2 - -4, arg3);
                                var41 = new class61(arg5, var12, arg1, arg8, var21, var20, var22, super.field3990, arg6, var38, arg3);
                            }
                            class111.method903(arg1, arg0, arg7, var42, var41);
                            if (~var12.field3226 == -2 && class411.field6106 && !super.field3990) {
                                if (~arg2 != -1) {
                                    if (~arg2 != -2) {
                                        if (arg2 == 2) {
                                            super.field3973[arg1][arg0 + 1][arg7] = (byte) class244.method1606(super.field3973[arg1][arg0 + 1][arg7], 1);
                                            super.field3973[arg1][arg0][arg7] = (byte) class244.method1606(super.field3973[arg1][arg0][arg7], 2);
                                        } else if (~arg2 == -4) {
                                            super.field3973[arg1][arg0][arg7] = (byte) class244.method1606(super.field3973[arg1][arg0][arg7], 2);
                                            super.field3973[arg1][arg0][arg7] = (byte) class244.method1606(super.field3973[arg1][arg0][arg7], 1);
                                        }
                                    } else {
                                        super.field3973[arg1][arg0][arg7 + 1] = (byte) class244.method1606(super.field3973[arg1][arg0][arg7 + 1], 2);
                                        super.field3973[arg1][arg0 + 1][arg7] = (byte) class244.method1606(super.field3973[arg1][arg0 + 1][arg7], 1);
                                    }
                                } else {
                                    super.field3973[arg1][arg0][arg7] = (byte) class244.method1606(super.field3973[arg1][arg0][arg7], 1);
                                    super.field3973[arg1][arg0][arg7 + 1] = (byte) class244.method1606(super.field3973[arg1][arg0][arg7 + 1], 2);
                                }
                            }
                            if (var12.field3267 != 0 && arg10 != null) {
                                arg10.method560(arg7, var12.field3230, arg0, 268435456, arg2, !var12.field3187, arg6);
                            }
                            if (var12.field3203 != 16) {
                                class312.method1943(arg1, arg0, arg7, var12.field3203);
                            }
                        } else if (~arg6 == -4) {
                            class235 var44;
                            if (var24) {
                                class420 var43 = new class420(arg5, var12, arg8, var21, var20, var22, super.field3990, arg6, arg2, var23);
                                if (var43.method30(10869)) {
                                    var43.method31(arg5, -12694);
                                }
                                var44 = var43;
                            } else {
                                var44 = new class61(arg5, var12, arg1, arg8, var21, var20, var22, super.field3990, arg6, arg2, arg3);
                            }
                            class235 var45 = class344.method2079(arg1, arg0, arg7);
                            if (var45 instanceof class220) {
                                ((class220) var45).field3163 = var44;
                            } else {
                                class111.method903(arg1, arg0, arg7, var44, (class235) null);
                            }
                            if (var12.field3253 && class411.field6106) {
                                if (~arg2 != -1) {
                                    if (arg2 != 1) {
                                        if (arg2 != 2) {
                                            if (arg2 == 3) {
                                                var19.method418(arg0, arg7, 50);
                                            }
                                        } else {
                                            var19.method418(arg0 + 1, arg7, 50);
                                        }
                                    } else {
                                        var19.method418(arg0 - -1, arg7 + 1, 50);
                                    }
                                } else {
                                    var19.method418(arg0, arg7 + 1, 50);
                                }
                            }
                            if (~var12.field3267 != -1 && arg10 != null) {
                                arg10.method560(arg7, var12.field3230, arg0, 268435456, arg2, !var12.field3187, arg6);
                            }
                        } else if (arg6 == 9) {
                            class431 var46;
                            if (!var24) {
                                var46 = new class153(arg5, var12, arg1, arg8, var21, var20, var22, super.field3990, arg0, var13 + -1 + arg0, arg7, arg7 + var14 + -1, arg6, arg2, arg3);
                            } else {
                                class131 var47 = new class131(arg5, var12, arg1, arg8, var21, var20, var22, super.field3990, arg0, arg0, arg7, arg7, arg6, arg2, var23);
                                var46 = var47;
                                if (var47.method30(10869)) {
                                    var47.method31(arg5, -12694);
                                }
                            }
                            class431 var48 = class262.method1683(arg1, arg0, arg7, field7503 != null ? field7503 : (field7503 = method3032("f")));
                            if (var48 instanceof class450 && ~var48.field6332 == ~arg0 && ~var48.field6339 == ~arg7) {
                                ((class450) var48).field6628 = var46;
                            } else {
                                class322.method1989(var46, false);
                            }
                            if (~var12.field3267 != -1 && arg10 != null) {
                                arg10.method556(var13, var12.field3230, 16624, var14, !var12.field3187, arg0, arg7);
                            }
                            if (~var12.field3203 != -17) {
                                class312.method1943(arg1, arg0, arg7, var12.field3203);
                            }
                        } else if (arg6 == 4) {
                            class386 var50;
                            if (var24) {
                                class28 var49 = new class28(arg5, var12, arg8, var21, var20, var22, super.field3990, 0, 0, 0, arg6, arg2);
                                if (var49.method30(10869)) {
                                    var49.method31(arg5, -12694);
                                }
                                var50 = var49;
                            } else {
                                var50 = new class463(arg5, var12, arg1, arg8, var21, var20, var22, super.field3990, 0, 0, 0, arg6, arg2, arg3);
                            }
                            class386 var51 = class510.method3040(arg1, arg0, arg7);
                            if (!(var51 instanceof class209)) {
                                class356.method2148(arg1, arg0, arg7, var50, (class386) null);
                            } else {
                                ((class209) var51).field3024 = var50;
                            }
                        } else if (arg6 == 5) {
                            int var52 = 17;
                            class529 var53 = (class529) class344.method2079(arg1, arg0, arg7);
                            if (var53 != null) {
                                var52 = class384.field5645.method786(var53.method28(true), 0).field3203 + 1;
                            }
                            class386 var55;
                            if (var24) {
                                class28 var54 = new class28(arg5, var12, arg8, var21, var20, var22, super.field3990, 0, class495.field7248[arg2] * var52, class506.field7490[arg2] * var52, arg6, arg2);
                                if (var54.method30(10869)) {
                                    var54.method31(arg5, -12694);
                                }
                                var55 = var54;
                            } else {
                                var55 = new class463(arg5, var12, arg1, arg8, var21, var20, var22, super.field3990, 0, class495.field7248[arg2] * var52, class506.field7490[arg2] * var52, arg6, arg2, arg3);
                            }
                            class386 var56 = class510.method3040(arg1, arg0, arg7);
                            if (!(var56 instanceof class209)) {
                                class356.method2148(arg1, arg0, arg7, var55, (class386) null);
                            } else {
                                ((class209) var56).field3024 = var55;
                            }
                        } else if (arg6 == 6) {
                            int var57 = 9;
                            class529 var58 = (class529) class344.method2079(arg1, arg0, arg7);
                            if (var58 != null) {
                                var57 = 1 + class384.field5645.method786(var58.method28(true), 0).field3203 / 2;
                            }
                            class386 var60;
                            if (var24) {
                                class28 var59 = new class28(arg5, var12, arg8, var21, var20, var22, super.field3990, arg2, class495.field7248[arg2] * var57, class506.field7490[arg2] * var57, arg6, arg2 + 4);
                                var60 = var59;
                                if (var59.method30(10869)) {
                                    var59.method31(arg5, -12694);
                                }
                            } else {
                                var60 = new class463(arg5, var12, arg1, arg8, var21, var20, var22, super.field3990, arg2, class467.field6876[arg2] * var57, class388.field5743[arg2] * var57, arg6, arg2 - -4, arg3);
                            }
                            class386 var61 = class510.method3040(arg1, arg0, arg7);
                            if (var61 instanceof class209) {
                                ((class209) var61).field3024 = var60;
                            } else {
                                class356.method2148(arg1, arg0, arg7, var60, (class386) null);
                            }
                        } else if (~arg6 == -8) {
                            int var62 = 3 & arg2 + 2;
                            class386 var63;
                            if (!var24) {
                                var63 = new class463(arg5, var12, arg1, arg8, var21, var20, var22, super.field3990, var62, 0, 0, arg6, var62 + 4, arg3);
                            } else {
                                class28 var64 = new class28(arg5, var12, arg8, var21, var20, var22, super.field3990, var62, 0, 0, arg6, var62 - -4);
                                var63 = var64;
                                if (var64.method30(10869)) {
                                    var64.method31(arg5, -12694);
                                }
                            }
                            class386 var65 = class510.method3040(arg1, arg0, arg7);
                            if (!(var65 instanceof class209)) {
                                class356.method2148(arg1, arg0, arg7, var63, (class386) null);
                            } else {
                                ((class209) var65).field3024 = var63;
                            }
                        } else if (arg6 == 8) {
                            int var66 = arg2 - -2 & 3;
                            int var67 = 9;
                            class529 var68 = (class529) class344.method2079(arg1, arg0, arg7);
                            if (var68 != null) {
                                var67 = class384.field5645.method786(var68.method28(true), 0).field3203 / 2 - -1;
                            }
                            class386 var71;
                            class386 var72;
                            if (!var24) {
                                class463 var69 = new class463(arg5, var12, arg1, arg8, var21, var20, var22, super.field3990, arg2, class467.field6876[arg2] * var67, class388.field5743[arg2] * var67, arg6, arg2 + 4, arg3);
                                class463 var70 = new class463(arg5, var12, arg1, arg8, var21, var20, var22, super.field3990, arg2, 0, 0, arg6, var66 + 4, arg3);
                                var71 = var69;
                                var72 = var70;
                            } else {
                                class28 var73 = new class28(arg5, var12, arg8, var21, var20, var22, super.field3990, arg2, class467.field6876[arg2] * var67, class388.field5743[arg2] * var67, arg6, arg2 - -4);
                                class28 var74 = new class28(arg5, var12, arg8, var21, var20, var22, super.field3990, arg2, 0, 0, arg6, var66 - -4);
                                if (var73.method30(10869)) {
                                    var73.method31(arg5, -12694);
                                }
                                var72 = var74;
                                if (var74.method30(10869)) {
                                    var74.method31(arg5, -12694);
                                }
                                var71 = var73;
                            }
                            class356.method2148(arg1, arg0, arg7, var71, var72);
                        }
                    } else {
                        class131 var75 = null;
                        class431 var77;
                        int var78;
                        if (var24) {
                            class131 var76 = new class131(arg5, var12, arg1, arg8, var21, var20, var22, super.field3990, arg0, var13 + -1 + arg0, arg7, arg7 + var14 + -1, arg6, arg2, var23);
                            var77 = var76;
                            var75 = var76;
                            var78 = var76.method1005(20922);
                        } else {
                            var77 = new class153(arg5, var12, arg1, arg8, var21, var20, var22, super.field3990, arg0, arg0 + var13 + -1, arg7, arg7 + var14 + -1, arg6, arg2, arg3);
                            var78 = 15;
                        }
                        class431 var79 = class262.method1683(arg1, arg0, arg7, field7503 != null ? field7503 : (field7503 = method3032("f")));
                        boolean var80 = false;
                        if (var79 instanceof class450 && ~var79.field6332 == ~arg0 && ~var79.field6339 == ~arg7) {
                            var80 = true;
                            ((class450) var79).field6628 = var77;
                        }
                        if (var80 || class322.method1989(var77, false)) {
                            if (var75 != null && var75.method30(10869)) {
                                var75.method31(arg5, -12694);
                            }
                            if (var12.field3253 && class411.field6106) {
                                if (~var78 < -31) {
                                    var78 = 30;
                                }
                                for (int var81 = 0; ~var13 <= ~var81; ++var81) {
                                    for (int var82 = 0; ~var14 <= ~var82; ++var82) {
                                        var19.method418(arg0 - -var81, arg7 - -var82, var78);
                                    }
                                }
                            }
                        }
                        if (var12.field3267 != 0 && arg10 != null) {
                            arg10.method556(var13, var12.field3230, 16624, var14, !var12.field3187, arg0, arg7);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)[Lbf;")
    public static final class372[] method3030(boolean arg0) {
        ++field7493;
        if (!arg0) {
            field7494 = -81;
        }
        return new class372[] { class306.field4342, class112.field1579, class102.field1431, class9.field113, class182.field2578, class276.field4068, class511.field7546, class523.field7689, class104.field1446, class171.field2437, class354.field4946, class482.field7087, class85.field1157, class213.field3065, class276.field4069 };
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(IIIZ)V")
    public class507(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class109.field1547, class500.field7422);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILya;)V")
    public final void method3031(int arg0, class38 arg1) {
        ++field7497;
        class517.method3075(arg1);
        if (~super.field4002 < -2) {
            for (int var3 = 0; ~super.field3993 < ~var3; ++var3) {
                for (int var4 = 0; ~super.field3975 < ~var4; ++var4) {
                    if ((2 & class238.field3497[1][var3][var4]) == 2) {
                        class171.method1210(var3, var4);
                    }
                }
            }
        }
        int var5 = -115 / ((42 - arg0) / 46);
        for (int var6 = 0; ~var6 > ~super.field4002; ++var6) {
            for (int var7 = 0; var7 <= super.field3975; ++var7) {
                for (int var8 = 0; ~super.field3993 <= ~var8; ++var8) {
                    if (~(1 & super.field3973[var6][var8][var7]) != -1) {
                        int var9 = var7;
                        int var10 = var7;
                        int var11 = var6;
                        while (~super.field3975 < ~var10 && (1 & super.field3973[var6][var8][var10 + 1]) != 0) {
                            ++var10;
                        }
                        while (~var9 < -1 && (super.field3973[var6][var8][var9 + -1] & 1) != 0) {
                            --var9;
                        }
                        int var12 = var6;
                        label168: while (~var11 < -1) {
                            for (int var13 = var9; var10 >= var13; ++var13) {
                                if ((super.field3973[var11 + -1][var8][var13] & 1) == 0) {
                                    break label168;
                                }
                            }
                            --var11;
                        }
                        label157: while (var12 < 3) {
                            for (int var14 = var9; var10 >= var14; ++var14) {
                                if ((1 & super.field3973[var12 - -1][var8][var14]) == 0) {
                                    break label157;
                                }
                            }
                            ++var12;
                        }
                        int var15 = (var10 + 1 - var9) * (var12 + 1 + -var11);
                        if (~var15 <= -3) {
                            short var16 = 240;
                            int var17 = super.field3996[var12][var8][var9] - var16;
                            int var18 = super.field3996[var11][var8][var9];
                            class323.method1997(1, var8 << 7, var8 << 7, var9 << 7, (var10 << 7) - -128, var17, var18);
                            for (int var19 = var11; ~var12 <= ~var19; ++var19) {
                                for (int var20 = var9; var20 <= var10; ++var20) {
                                    super.field3973[var19][var8][var20] = (byte) class345.method2089(super.field3973[var19][var8][var20], -2);
                                }
                            }
                        }
                    }
                    if ((super.field3973[var6][var8][var7] & 2) != 0) {
                        int var21 = var8;
                        int var22 = var8;
                        int var23 = var6;
                        while (var22 < super.field3993 && ~(super.field3973[var6][var22 + 1][var7] & 2) != -1) {
                            ++var22;
                        }
                        while (~var21 < -1 && ~(super.field3973[var6][var21 + -1][var7] & 2) != -1) {
                            --var21;
                        }
                        int var24 = var6;
                        label222: while (var23 > 0) {
                            for (int var25 = var21; var25 <= var22; ++var25) {
                                if (~(2 & super.field3973[var23 + -1][var25][var7]) == -1) {
                                    break label222;
                                }
                            }
                            --var23;
                        }
                        label211: while (~var24 > -4) {
                            for (int var26 = var21; ~var26 >= ~var22; ++var26) {
                                if ((super.field3973[var24 - -1][var26][var7] & 2) == 0) {
                                    break label211;
                                }
                            }
                            ++var24;
                        }
                        int var27 = (-var21 + var22 - -1) * (var24 + 1 + -var23);
                        if (~var27 <= -3) {
                            short var28 = 240;
                            int var29 = super.field3996[var24][var21][var7] - var28;
                            int var30 = super.field3996[var23][var21][var7];
                            class323.method1997(2, var21 << 7, (var22 << 7) - -128, var7 << 7, var7 << 7, var29, var30);
                            for (int var31 = var23; var24 >= var31; ++var31) {
                                for (int var32 = var21; var22 >= var32; ++var32) {
                                    super.field3973[var31][var32][var7] = (byte) class345.method2089(super.field3973[var31][var32][var7], -3);
                                }
                            }
                        }
                    }
                    if ((4 & super.field3973[var6][var8][var7]) != 0) {
                        int var33 = var8;
                        int var34 = var8;
                        int var35;
                        for (var35 = var7; ~var35 < -1 && (super.field3973[var6][var8][var35 + -1] & 4) != 0; --var35) {
                        }
                        int var36;
                        for (var36 = var7; ~var36 > ~super.field3975 && (4 & super.field3973[var6][var8][var36 + 1]) != 0; ++var36) {
                        }
                        label276: while (var33 > 0) {
                            for (int var37 = var35; var36 >= var37; ++var37) {
                                if (~(super.field3973[var6][var33 + -1][var37] & 4) == -1) {
                                    break label276;
                                }
                            }
                            --var33;
                        }
                        label265: while (~var34 > ~super.field3993) {
                            for (int var38 = var35; var36 >= var38; ++var38) {
                                if ((super.field3973[var6][var34 + 1][var38] & 4) == 0) {
                                    break label265;
                                }
                            }
                            ++var34;
                        }
                        if (~((var34 - -1 + -var33) * (var36 - var35 + 1)) <= -5) {
                            int var39 = super.field3996[var6][var33][var35];
                            class323.method1997(4, var33 << 7, (var34 << 7) + 128, var35 << 7, (var36 << 7) + 128, var39, var39);
                            for (int var40 = var33; ~var34 <= ~var40; ++var40) {
                                for (int var41 = var35; var41 <= var36; ++var41) {
                                    super.field3973[var6][var40][var41] = (byte) class345.method2089(super.field3973[var6][var40][var41], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field3973 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3032(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
