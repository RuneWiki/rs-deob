import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class752 extends class597 {

    @OriginalMember(owner = "client!el", name = "P", descriptor = "I")
    public int field10251 = 99;

    @OriginalMember(owner = "client!el", name = "K", descriptor = "[I")
    public static int[] field10246 = new int[250];

    @OriginalMember(owner = "client!el", name = "R", descriptor = "I")
    public static int field10253 = -1;

    @OriginalMember(owner = "client!el", name = "H", descriptor = "Lrn;")
    public static class633 field10243 = new class633(56, 8);

    @OriginalMember(owner = "client!el", name = "G", descriptor = "I")
    public static int field10242;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "I")
    public static int field10244;

    @OriginalMember(owner = "client!el", name = "J", descriptor = "I")
    public static int field10245;

    @OriginalMember(owner = "client!el", name = "L", descriptor = "I")
    public static int field10247;

    @OriginalMember(owner = "client!el", name = "M", descriptor = "I")
    public static int field10248;

    @OriginalMember(owner = "client!el", name = "N", descriptor = "I")
    public static int field10249;

    @OriginalMember(owner = "client!el", name = "O", descriptor = "I")
    public static int field10250;

    @OriginalMember(owner = "client!el", name = "Q", descriptor = "I")
    public static int field10252;

    @OriginalMember(owner = "client!el", name = "S", descriptor = "I")
    public static int field10254;

    @OriginalMember(owner = "client!el", name = "T", descriptor = "I")
    public static int field10255;

    @OriginalMember(owner = "client!el", name = "U", descriptor = "I")
    public static int field10256;

    @OriginalMember(owner = "client!el", name = "V", descriptor = "I")
    public static int field10257;

    @OriginalMember(owner = "client!el", name = "W", descriptor = "I")
    public static int field10258;

    // $FF: synthetic field
    @OriginalMember(owner = "client!el", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field10259;

    // $FF: synthetic method
    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method4086(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([Leo;IILha;I[B)V", line = 4)
    public final void method4072(class340[] arg0, int arg1, int arg2, class570 arg3, int arg4, byte[] arg5) {
        if (arg4 != -27402) {
            method4078(-110, 25, -116);
        }
        ++field10250;
        class234 var7 = new class234(arg5);
        int var8 = -1;
        while (true) {
            int var9 = var7.method1510(71);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1505((byte) -6);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 63;
                int var13 = (var10 & 4083) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method1509(true);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = arg1 + var13;
                int var19 = arg2 + var12;
                if (~var18 < -1 && var19 > 0 && ~var18 > ~(super.field7582 - 1) && ~(super.field7599 + -1) < ~var19) {
                    class340 var20 = null;
                    if (!super.field7571) {
                        int var21 = var14;
                        if ((class410.field5439[1][var18][var19] & 2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg0[var21];
                        }
                    }
                    this.method4079(var14, var18, -1, var20, var19, 108, var8, var16, arg3, var17, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIII)Laia;", line = 81)
    public final class274 method4073(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field10249;
        class274 var6 = null;
        if (arg1 == 0) {
            var6 = (class274) class127.method741(arg3, arg2, arg4);
        }
        if (arg0 > -61) {
            field10243 = null;
        }
        if (~arg1 == -2) {
            var6 = (class274) class14.method60(arg3, arg2, arg4);
        }
        if (arg1 == 2) {
            var6 = (class274) class238.method1571(arg3, arg2, arg4, field10259 != null ? field10259 : (field10259 = method4086("aia")));
        }
        if (arg1 == 3) {
            var6 = (class274) class740.method4019(arg3, arg2, arg4);
        }
        return var6;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I[IIILha;Lmc;)V", line = 111)
    public final void method4074(int arg0, int[] arg1, int arg2, int arg3, class570 arg4, class234 arg5) {
        ++field10248;
        if (!super.field7571) {
            boolean var7 = false;
            if (arg1 != null) {
                arg1[0] = -1;
            }
            class133 var8 = null;
            int var9 = 2 % ((arg2 - -54) / 48);
            while (true) {
                while (arg5.field3193.length > arg5.field3133) {
                    int var19 = arg5.method1509(true);
                    if (~var19 == -1) {
                        var8 = new class133(arg5);
                    } else if (~var19 == -2) {
                        int var35 = arg5.method1509(true);
                        if (var35 > 0) {
                            for (int var36 = 0; var35 > var36; ++var36) {
                                class739 var37 = new class739(arg4, arg5, 2);
                                if (~var37.field10000 == -32) {
                                    class330 var38 = class736.field9975.method1977(arg5.method1553((byte) 82), 31);
                                    var37.method4013(var38.field4042, var38.field4035, -88, var38.field4036, var38.field4041);
                                }
                                if (arg4.method893() > 0) {
                                    class757 var39 = var37.field10006;
                                    int var40 = var39.method4121((byte) -124) + (arg3 << 9);
                                    int var41 = (arg0 << 9) + var39.method4123(22290);
                                    int var42 = var40 >> 9;
                                    int var43 = var41 >> 9;
                                    if (~var42 <= -1 && var43 >= 0 && ~super.field7582 < ~var42 && var43 < super.field7599) {
                                        var39.method6(var40, super.field7590[var37.field10005][var42][var43] - var39.method4117(true), (byte) -128, var41);
                                        class398.method2299(var37);
                                    }
                                }
                            }
                        }
                    } else if (var19 == 2) {
                        if (var8 == null) {
                            var8 = new class133();
                        }
                        var8.method775(false, arg5);
                    } else if (var19 == 128) {
                        if (arg1 == null) {
                            arg5.field3133 += 10;
                        } else {
                            arg1[0] = arg5.method1553((byte) -125);
                            arg1[1] = arg5.method1542(27067);
                            arg1[2] = arg5.method1542(27067);
                            arg1[3] = arg5.method1542(27067);
                            arg1[4] = arg5.method1553((byte) -10);
                        }
                    } else {
                        if (~var19 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field7597 == null) {
                            super.field7597 = new byte[4][][];
                        }
                        for (int var20 = 0; var20 < 4; ++var20) {
                            byte var21 = arg5.method1554(27806);
                            if (~var21 == -1 && super.field7597[var20] != null) {
                                int var22 = arg3;
                                int var23 = arg3 + 64;
                                int var24 = arg0;
                                int var25 = arg0 + 64;
                                if (~arg3 <= -1) {
                                    if (super.field7582 <= arg3) {
                                        var22 = super.field7582;
                                    }
                                } else {
                                    var22 = 0;
                                }
                                if (var23 < 0) {
                                    var23 = 0;
                                } else if (~var23 <= ~super.field7582) {
                                    var23 = super.field7582;
                                }
                                if (~arg0 <= -1) {
                                    if (~super.field7599 >= ~arg0) {
                                        var24 = super.field7599;
                                    }
                                } else {
                                    var24 = 0;
                                }
                                if (var25 < 0) {
                                    var25 = 0;
                                } else if (var25 >= super.field7599) {
                                    var25 = super.field7599;
                                }
                                while (~var22 > ~var23) {
                                    while (var24 < var25) {
                                        super.field7597[var20][var22][var24] = 0;
                                        ++var24;
                                    }
                                    ++var22;
                                }
                            } else if (var21 == 1) {
                                if (super.field7597[var20] == null) {
                                    super.field7597[var20] = new byte[super.field7582 + 1][super.field7599 + 1];
                                }
                                for (int var26 = 0; var26 < 64; var26 += 4) {
                                    for (int var27 = 0; var27 < 64; var27 += 4) {
                                        byte var28 = arg5.method1554(27806);
                                        for (int var29 = arg3 + var26; var29 < var26 + 4 + arg3; ++var29) {
                                            for (int var30 = arg0 + var27; arg0 + 4 + var27 > var30; ++var30) {
                                                if (~var29 <= -1 && var29 < super.field7582 && var30 >= 0 && var30 < super.field7599) {
                                                    super.field7597[var20][var29][var30] = var28;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (~var21 == -3) {
                                if (super.field7597[var20] == null) {
                                    super.field7597[var20] = new byte[super.field7582 + 1][super.field7599 + 1];
                                }
                                if (~var20 < -1) {
                                    int var31 = arg3;
                                    int var32 = arg3 - -64;
                                    int var33 = arg0;
                                    if (~arg3 > -1) {
                                        var31 = 0;
                                    } else if (super.field7582 <= arg3) {
                                        var31 = super.field7582;
                                    }
                                    if (arg0 < 0) {
                                        var33 = 0;
                                    } else if (~super.field7599 >= ~arg0) {
                                        var33 = super.field7599;
                                    }
                                    int var34 = arg0 + 64;
                                    if (~var32 > -1) {
                                        var32 = 0;
                                    } else if (~var32 <= ~super.field7582) {
                                        var32 = super.field7582;
                                    }
                                    if (~var34 > -1) {
                                        var34 = 0;
                                    } else if (var34 >= super.field7599) {
                                        var34 = super.field7599;
                                    }
                                    while (var32 > var31) {
                                        while (~var34 < ~var33) {
                                            super.field7597[var20][var31][var33] = super.field7597[var20 - 1][var31][var33];
                                            ++var33;
                                        }
                                        ++var31;
                                    }
                                }
                            }
                        }
                        var7 = true;
                    }
                }
                if (var8 != null) {
                    for (int var10 = 0; ~var10 > -9; ++var10) {
                        for (int var11 = 0; var11 < 8; ++var11) {
                            int var12 = (arg3 >> 3) + var10;
                            int var13 = (arg0 >> 3) + var11;
                            if (var12 >= 0 && super.field7582 >> 3 > var12 && var13 >= 0 && super.field7599 >> 3 > var13) {
                                class254.method1645((byte) 77, var8, var13, var12);
                            }
                        }
                    }
                }
                if (!var7 && super.field7597 != null) {
                    for (int var14 = 0; var14 < 4; ++var14) {
                        if (super.field7597[var14] != null) {
                            for (int var15 = 0; ~var15 > -17; ++var15) {
                                for (int var16 = 0; var16 < 16; ++var16) {
                                    int var17 = (arg3 >> 2) + var15;
                                    int var18 = (arg0 >> 2) - -var16;
                                    if (~var17 <= -1 && var17 < 26 && var18 >= 0 && ~var18 > -27) {
                                        super.field7597[var14][var17][var18] = 0;
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

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IBI)Luaa;", line = 478)
    public static final class391 method4075(int arg0, byte arg1, int arg2) {
        ++field10244;
        class391 var3 = class738.method4006(50, arg0);
        if (arg2 == -1) {
            return var3;
        } else {
            if (arg1 >= -77) {
                method4085((class30) null, -128, (byte) -39);
            }
            return var3 != null && var3.field5145 != null && ~var3.field5145.length < ~arg2 ? var3.field5145[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lwm;B)V", line = 498)
    public static final void method4076(class30 arg0, byte arg1) {
        int var2 = -64 % ((arg1 - -19) / 39);
        class664.field8662 = 0;
        class627.field7964 = 0;
        ++field10242;
        class196.field2717 = new class151();
        class479.field6197 = new class355[1024];
        class358.field4375 = new class513[class251.field3424[class298.field3765] + 1];
        class43.field490 = 0;
        class246.field3375 = 0;
        class395.method2284(arg0, (byte) 4);
        class689.method3681(0, arg0);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lmc;ILha;[IIIIIIII)V", line = 516)
    public final void method4077(class234 arg0, int arg1, class570 arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field10255;
        if (!super.field7571) {
            if (arg7 <= 7) {
                this.method4073(113, -86, -12, 125, 124);
            }
            boolean var12 = false;
            class133 var13 = null;
            if (arg3 != null) {
                arg3[0] = -1;
            }
            int var14 = (7 & arg8) * 8;
            int var15 = (arg4 & 7) * 8;
            while (true) {
                while (arg0.field3193.length > arg0.field3133) {
                    int var20 = arg0.method1509(true);
                    if (~var20 == -1) {
                        var13 = new class133(arg0);
                    } else if (var20 == 1) {
                        int var34 = arg0.method1509(true);
                        if (var34 > 0) {
                            for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                class739 var36 = new class739(arg2, arg0, 2);
                                if (~var36.field10000 == -32) {
                                    class330 var37 = class736.field9975.method1977(arg0.method1553((byte) 12), 31);
                                    var36.method4013(var37.field4042, var37.field4035, -87, var37.field4036, var37.field4041);
                                }
                                if (~arg2.method893() < -1) {
                                    class757 var38 = var36.field10006;
                                    int var39 = var38.method4121((byte) -124) >> 9;
                                    int var40 = var38.method4123(22290) >> 9;
                                    if (var36.field10005 == arg1 && ~var14 >= ~var39 && ~(var14 + 8) < ~var39 && var15 <= var40 && var15 + 8 > var40) {
                                        int var41 = class39.method249(arg5, 4095 & var38.method4123(22290), 4095 & var38.method4121((byte) -124), -10561) + (arg9 << 9);
                                        int var42 = class491.method2741(4095 & var38.method4121((byte) -124), 4095 & var38.method4123(22290), (byte) 89, arg5) + (arg6 << 9);
                                        int var43 = var41 >> 9;
                                        int var44 = var42 >> 9;
                                        if (~var43 <= -1 && var44 >= 0 && ~super.field7582 < ~var43 && super.field7599 > var44) {
                                            var38.method6(var41, super.field7590[arg1][var43][var44] + -var38.method4117(true), (byte) -128, var42);
                                            class398.method2299(var36);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~var20 == -3) {
                        if (var13 == null) {
                            var13 = new class133();
                        }
                        var13.method775(false, arg0);
                    } else if (~var20 == -129) {
                        if (arg3 == null) {
                            arg0.field3133 += 10;
                        } else {
                            arg3[0] = arg0.method1553((byte) -2);
                            arg3[1] = arg0.method1542(27067);
                            arg3[2] = arg0.method1542(27067);
                            arg3[3] = arg0.method1542(27067);
                            arg3[4] = arg0.method1553((byte) 2);
                        }
                    } else {
                        if (var20 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field7597 == null) {
                            super.field7597 = new byte[4][][];
                        }
                        for (int var21 = 0; var21 < 4; ++var21) {
                            byte var22 = arg0.method1554(27806);
                            if (var22 == 0 && super.field7597[arg10] != null) {
                                if (var21 <= arg1) {
                                    int var23 = arg9;
                                    int var24 = arg9 - -7;
                                    int var25 = arg6;
                                    if (var24 >= 0) {
                                        if (~var24 <= ~super.field7582) {
                                            var24 = super.field7582;
                                        }
                                    } else {
                                        var24 = 0;
                                    }
                                    if (arg6 < 0) {
                                        var25 = 0;
                                    } else if (~super.field7599 >= ~arg6) {
                                        var25 = super.field7599;
                                    }
                                    if (arg9 < 0) {
                                        var23 = 0;
                                    } else if (super.field7582 <= arg9) {
                                        var23 = super.field7582;
                                    }
                                    int var26 = arg6 + 7;
                                    if (var26 < 0) {
                                        var26 = 0;
                                    } else if (var26 >= super.field7599) {
                                        var26 = super.field7599;
                                    }
                                    while (var24 > var23) {
                                        while (var26 > var25) {
                                            super.field7597[arg10][var23][var25] = 0;
                                            ++var25;
                                        }
                                        ++var23;
                                    }
                                }
                            } else if (var22 == 1) {
                                if (super.field7597[arg10] == null) {
                                    super.field7597[arg10] = new byte[super.field7582 + 1][super.field7599 + 1];
                                }
                                for (int var27 = 0; var27 < 64; var27 += 4) {
                                    for (int var28 = 0; var28 < 64; var28 += 4) {
                                        byte var29 = arg0.method1554(27806);
                                        if (~var21 >= ~arg1) {
                                            for (int var30 = var27; ~(var27 - -4) < ~var30; ++var30) {
                                                for (int var31 = var28; var31 < var28 - -4; ++var31) {
                                                    if (var30 >= var14 && var14 + 8 > var30 && ~var15 >= ~var31 && ~var15 > ~(var15 + 8)) {
                                                        int var32 = arg9 + class753.method4089(var31 & 7, 7, arg5, var30 & 7);
                                                        int var33 = arg6 - -class427.method2472((byte) 125, arg5, 7 & var31, var30 & 7);
                                                        if (var32 >= 0 && ~super.field7582 < ~var32 && var33 >= 0 && var33 < super.field7599) {
                                                            super.field7597[arg10][var32][var33] = var29;
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
                    class254.method1645((byte) 50, var13, arg6 >> 3, arg9 >> 3);
                }
                if (!var12 && super.field7597 != null && super.field7597[arg10] != null) {
                    int var16 = arg9 + 7;
                    int var17 = arg6 + 7;
                    for (int var18 = arg9; var16 > var18; ++var18) {
                        for (int var19 = arg6; var17 > var19; ++var19) {
                            super.field7597[arg10][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)I", line = 811)
    public static final int method4078(int arg0, int arg1, int arg2) {
        ++field10252;
        if (~arg2 > ~arg0) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        while (~arg0 != -1) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg1 != 4 ? -6 : arg2;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIILeo;IIIILha;II)V", line = 839)
    public final void method4079(int arg0, int arg1, int arg2, class340 arg3, int arg4, int arg5, int arg6, int arg7, class570 arg8, int arg9, int arg10) {
        ++field10256;
        if (~class485.field6252.field6942.method2278(false) != -1 || class408.method2373(class711.field9393, 16, arg4, arg1, arg0)) {
            if (arg10 < this.field10251) {
                this.field10251 = arg10;
            }
            class773 var12 = class390.field4983.method4292(arg6, (byte) -105);
            if (~class485.field6252.field6913.method3304(false) != -1 || !var12.field10450) {
                int var13;
                int var14;
                if (~arg9 != -2 && arg9 != 3) {
                    var13 = var12.field10484;
                    var14 = var12.field10466;
                } else {
                    var14 = var12.field10484;
                    var13 = var12.field10466;
                }
                int var15;
                int var16;
                if (super.field7582 < arg1 - -var14) {
                    var15 = arg1 - -1;
                    var16 = arg1;
                } else {
                    var16 = (var14 >> 1) + arg1;
                    var15 = arg1 - -(var14 + 1 >> 1);
                }
                int var17;
                int var18;
                if (super.field7599 >= arg4 + var13) {
                    var17 = (var13 + 1 >> 1) + arg4;
                    var18 = (var13 >> 1) + arg4;
                } else {
                    var17 = arg4 + 1;
                    var18 = arg4;
                }
                class358 var19 = class116.field1542[arg0];
                int var20 = var19.method2060(var18, -117, var16) - -var19.method2060(var18, -90, var15) - -var19.method2060(var17, -121, var16) + var19.method2060(var17, -105, var15) >> 2;
                int var21 = (arg1 << 9) + (var14 << 8);
                int var22 = (arg4 << 9) - -(var13 << 8);
                boolean var23 = class749.field10224 && !super.field7571 && var12.field10481;
                if (var12.method4220((byte) 112)) {
                    class663.method3612(arg9, arg4, arg1, (class33) null, arg10, (class727) null, 1588241065, var12);
                }
                boolean var24 = ~arg2 == 0 && ~var12.field10543 == 0 && var12.field10525 == null && var12.field10536 == null && !var12.field10448 && !var12.field10521;
                if (!class502.field6440 || (!class123.method727(arg7, true) || var12.field10493 == 1) && (!class461.method2597(arg7, 12) || ~var12.field10493 != -1)) {
                    if (~arg7 == -23) {
                        if (~class485.field6252.field6938.method2223(false) != -1 || var12.field10488 != 0 || ~var12.field10464 == -2 || var12.field10476) {
                            class417 var25;
                            if (!var24) {
                                var25 = new class158(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, arg9, arg2);
                            } else {
                                class785 var26 = new class785(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, arg9, var23);
                                if (var26.method1008((byte) -86)) {
                                    var26.method1014(-7908, arg8);
                                }
                                var25 = var26;
                            }
                            class86.method535(arg10, arg1, arg4, var25);
                            if (~var12.field10464 == -2 && arg3 != null) {
                                arg3.method1974(arg4, arg1, -15175);
                            }
                        }
                    } else if (~arg7 != -11 && ~arg7 != -12) {
                        if (arg5 <= 94) {
                            field10246 = null;
                        }
                        if ((arg7 < 12 || ~arg7 < -18) && (arg7 < 18 || arg7 > 21)) {
                            if (~arg7 == -1) {
                                int var29 = var12.field10493;
                                if (class122.field1639 && var12.field10493 == -1) {
                                    var29 = 1;
                                }
                                class721 var31;
                                if (var24) {
                                    class497 var30 = new class497(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, arg7, arg9, var23);
                                    var31 = var30;
                                    if (var30.method1008((byte) -80)) {
                                        var30.method1014(-7908, arg8);
                                    }
                                } else {
                                    var31 = new class219(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, arg7, arg9, arg2);
                                }
                                class351.method2028(arg10, arg1, arg4, var31, (class721) null);
                                if (~arg9 == -1) {
                                    if (class749.field10224 && var12.field10463) {
                                        var19.method2058(arg1, arg4, 50);
                                        var19.method2058(arg1, arg4 + 1, 50);
                                    }
                                    if (var29 == 1 && !super.field7571) {
                                        class191.method1338(arg4, var12.field10506, (byte) -71, var12.field10453, 1, arg10, arg1);
                                    }
                                } else if (arg9 != 1) {
                                    if (~arg9 == -3) {
                                        if (class749.field10224 && var12.field10463) {
                                            var19.method2058(arg1 + 1, arg4, 50);
                                            var19.method2058(arg1 + 1, arg4 + 1, 50);
                                        }
                                        if (~var29 == -2 && !super.field7571) {
                                            class191.method1338(arg4, var12.field10506, (byte) 121, -var12.field10453, 1, arg10, arg1 - -1);
                                        }
                                    } else if (arg9 == 3) {
                                        if (class749.field10224 && var12.field10463) {
                                            var19.method2058(arg1, arg4, 50);
                                            var19.method2058(arg1 + 1, arg4, 50);
                                        }
                                        if (var29 == 1 && !super.field7571) {
                                            class191.method1338(arg4, var12.field10506, (byte) 118, var12.field10453, 2, arg10, arg1);
                                        }
                                    }
                                } else {
                                    if (class749.field10224 && var12.field10463) {
                                        var19.method2058(arg1, arg4 - -1, 50);
                                        var19.method2058(arg1 + 1, arg4 + 1, 50);
                                    }
                                    if (~var29 == -2 && !super.field7571) {
                                        class191.method1338(arg4 + 1, var12.field10506, (byte) 123, -var12.field10453, 2, arg10, arg1);
                                    }
                                }
                                if (~var12.field10464 != -1 && arg3 != null) {
                                    arg3.method1970(var12.field10479, arg9, arg7, !var12.field10507, arg1, 14261, arg4);
                                }
                                if (~var12.field10470 != -65) {
                                    class779.method4270(arg10, arg1, arg4, var12.field10470);
                                }
                            } else if (~arg7 == -2) {
                                class721 var32;
                                if (!var24) {
                                    var32 = new class219(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, arg7, arg9, arg2);
                                } else {
                                    class497 var33 = new class497(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, arg7, arg9, var23);
                                    if (var33.method1008((byte) -117)) {
                                        var33.method1014(-7908, arg8);
                                    }
                                    var32 = var33;
                                }
                                class351.method2028(arg10, arg1, arg4, var32, (class721) null);
                                if (var12.field10463 && class749.field10224) {
                                    if (arg9 == 0) {
                                        var19.method2058(arg1, arg4 + 1, 50);
                                    } else if (arg9 == 1) {
                                        var19.method2058(arg1 - -1, arg4 + 1, 50);
                                    } else if (arg9 == 2) {
                                        var19.method2058(arg1 + 1, arg4, 50);
                                    } else if (~arg9 == -4) {
                                        var19.method2058(arg1, arg4, 50);
                                    }
                                }
                                if (var12.field10464 != 0 && arg3 != null) {
                                    arg3.method1970(var12.field10479, arg9, arg7, !var12.field10507, arg1, 14261, arg4);
                                }
                            } else if (~arg7 == -3) {
                                int var34 = 3 & arg9 + 1;
                                class721 var35;
                                class721 var36;
                                if (!var24) {
                                    var35 = new class219(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, arg7, arg9 + 4, arg2);
                                    var36 = new class219(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, arg7, var34, arg2);
                                } else {
                                    class497 var37 = new class497(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, arg7, arg9 + 4, var23);
                                    class497 var38 = new class497(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, arg7, var34, var23);
                                    if (var37.method1008((byte) -116)) {
                                        var37.method1014(-7908, arg8);
                                    }
                                    var36 = var38;
                                    if (var38.method1008((byte) -106)) {
                                        var38.method1014(-7908, arg8);
                                    }
                                    var35 = var37;
                                }
                                class351.method2028(arg10, arg1, arg4, var35, var36);
                                if ((~var12.field10493 == -2 || class122.field1639 && var12.field10493 == -1) && !super.field7571) {
                                    if (arg9 == 0) {
                                        class191.method1338(arg4, var12.field10506, (byte) -87, var12.field10453, 1, arg10, arg1);
                                        class191.method1338(arg4 - -1, var12.field10506, (byte) 118, var12.field10453, 2, arg10, arg1);
                                    } else if (arg9 == 1) {
                                        class191.method1338(arg4, var12.field10506, (byte) 122, var12.field10453, 1, arg10, arg1 + 1);
                                        class191.method1338(arg4 + 1, var12.field10506, (byte) 122, var12.field10453, 2, arg10, arg1);
                                    } else if (~arg9 == -3) {
                                        class191.method1338(arg4, var12.field10506, (byte) -53, var12.field10453, 1, arg10, arg1 + 1);
                                        class191.method1338(arg4, var12.field10506, (byte) 122, var12.field10453, 2, arg10, arg1);
                                    } else if (arg9 == 3) {
                                        class191.method1338(arg4, var12.field10506, (byte) 119, var12.field10453, 1, arg10, arg1);
                                        class191.method1338(arg4, var12.field10506, (byte) -95, var12.field10453, 2, arg10, arg1);
                                    }
                                }
                                if (~var12.field10464 != -1 && arg3 != null) {
                                    arg3.method1970(var12.field10479, arg9, arg7, !var12.field10507, arg1, 14261, arg4);
                                }
                                if (~var12.field10470 != -65) {
                                    class779.method4270(arg10, arg1, arg4, var12.field10470);
                                }
                            } else if (arg7 == 3) {
                                class721 var39;
                                if (!var24) {
                                    var39 = new class219(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, arg7, arg9, arg2);
                                } else {
                                    class497 var40 = new class497(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, arg7, arg9, var23);
                                    if (var40.method1008((byte) -117)) {
                                        var40.method1014(-7908, arg8);
                                    }
                                    var39 = var40;
                                }
                                class351.method2028(arg10, arg1, arg4, var39, (class721) null);
                                if (var12.field10463 && class749.field10224) {
                                    if (~arg9 == -1) {
                                        var19.method2058(arg1, arg4 + 1, 50);
                                    } else if (arg9 != 1) {
                                        if (~arg9 == -3) {
                                            var19.method2058(arg1 + 1, arg4, 50);
                                        } else if (~arg9 == -4) {
                                            var19.method2058(arg1, arg4, 50);
                                        }
                                    } else {
                                        var19.method2058(arg1 + 1, arg4 + 1, 50);
                                    }
                                }
                                if (~var12.field10464 != -1 && arg3 != null) {
                                    arg3.method1970(var12.field10479, arg9, arg7, !var12.field10507, arg1, 14261, arg4);
                                }
                            } else if (arg7 == 9) {
                                class620 var42;
                                if (var24) {
                                    class552 var41 = new class552(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, arg1, arg1, arg4, arg4, arg7, arg9, var23);
                                    if (var41.method1008((byte) -121)) {
                                        var41.method1014(-7908, arg8);
                                    }
                                    var42 = var41;
                                } else {
                                    var42 = new class396(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, arg1, arg1 + -1 + var14, arg4, var13 + -1 + arg4, arg7, arg9, arg2);
                                }
                                class376.method2154(var42, false);
                                if (var12.field10493 == 1 && !super.field7571) {
                                    byte var43;
                                    if (~(1 & arg9) == -1) {
                                        var43 = 8;
                                    } else {
                                        var43 = 16;
                                    }
                                    class191.method1338(arg4, var12.field10506, (byte) -73, 0, var43, arg10, arg1);
                                }
                                if (var12.field10464 != 0 && arg3 != null) {
                                    arg3.method1962(var14, arg4, true, var12.field10479, arg1, !var12.field10507, var13);
                                }
                                if (var12.field10470 != 64) {
                                    class779.method4270(arg10, arg1, arg4, var12.field10470);
                                }
                            } else if (arg7 == 4) {
                                class121 var44;
                                if (!var24) {
                                    var44 = new class572(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, 0, 0, arg7, arg9, arg2);
                                } else {
                                    class708 var45 = new class708(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, 0, 0, arg7, arg9);
                                    var44 = var45;
                                    if (var45.method1008((byte) -70)) {
                                        var45.method1014(-7908, arg8);
                                    }
                                }
                                class319.method1862(arg10, arg1, arg4, var44, (class121) null);
                            } else if (~arg7 == -6) {
                                int var46 = 65;
                                class274 var47 = (class274) class127.method741(arg10, arg1, arg4);
                                if (var47 != null) {
                                    var46 = 1 + class390.field4983.method4292(var47.method1010(-6546), (byte) -92).field10470;
                                }
                                class121 var48;
                                if (!var24) {
                                    var48 = new class572(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, class448.field5837[arg9] * var46, class297.field3764[arg9] * var46, arg7, arg9, arg2);
                                } else {
                                    class708 var49 = new class708(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, class448.field5837[arg9] * var46, class297.field3764[arg9] * var46, arg7, arg9);
                                    if (var49.method1008((byte) -75)) {
                                        var49.method1014(-7908, arg8);
                                    }
                                    var48 = var49;
                                }
                                class319.method1862(arg10, arg1, arg4, var48, (class121) null);
                            } else if (arg7 == 6) {
                                int var50 = 33;
                                class274 var51 = (class274) class127.method741(arg10, arg1, arg4);
                                if (var51 != null) {
                                    var50 = class390.field4983.method4292(var51.method1010(-6546), (byte) -79).field10470 / 2 + 1;
                                }
                                class121 var52;
                                if (!var24) {
                                    var52 = new class572(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, class589.field7471[arg9] * var50, class232.field3126[arg9] * var50, arg7, arg9 + 4, arg2);
                                } else {
                                    class708 var53 = new class708(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, class448.field5837[arg9] * var50, class297.field3764[arg9] * var50, arg7, arg9 - -4);
                                    if (var53.method1008((byte) -96)) {
                                        var53.method1014(-7908, arg8);
                                    }
                                    var52 = var53;
                                }
                                class319.method1862(arg10, arg1, arg4, var52, (class121) null);
                            } else if (~arg7 == -8) {
                                int var54 = arg9 + 2 & 3;
                                class121 var55;
                                if (!var24) {
                                    var55 = new class572(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, 0, 0, arg7, var54 - -4, arg2);
                                } else {
                                    class708 var56 = new class708(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, 0, 0, arg7, var54 - -4);
                                    var55 = var56;
                                    if (var56.method1008((byte) -60)) {
                                        var56.method1014(-7908, arg8);
                                    }
                                }
                                class319.method1862(arg10, arg1, arg4, var55, (class121) null);
                            } else if (~arg7 == -9) {
                                int var57 = arg9 + 2 & 3;
                                int var58 = 33;
                                class274 var59 = (class274) class127.method741(arg10, arg1, arg4);
                                if (var59 != null) {
                                    var58 = 1 + class390.field4983.method4292(var59.method1010(-6546), (byte) -76).field10470 / 2;
                                }
                                class121 var62;
                                class121 var63;
                                if (var24) {
                                    class708 var60 = new class708(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, class589.field7471[arg9] * var58, class232.field3126[arg9] * var58, arg7, arg9 + 4);
                                    class708 var61 = new class708(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, 0, 0, arg7, var57 + 4);
                                    if (var60.method1008((byte) -56)) {
                                        var60.method1014(-7908, arg8);
                                    }
                                    var62 = var61;
                                    var63 = var60;
                                    if (var61.method1008((byte) -82)) {
                                        var61.method1014(-7908, arg8);
                                    }
                                } else {
                                    class572 var64 = new class572(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, class589.field7471[arg9] * var58, class232.field3126[arg9] * var58, arg7, arg9 - -4, arg2);
                                    class572 var65 = new class572(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, 0, 0, arg7, var57 + 4, arg2);
                                    var63 = var64;
                                    var62 = var65;
                                }
                                class319.method1862(arg10, arg1, arg4, var63, var62);
                            }
                        } else {
                            class620 var28;
                            if (var24) {
                                class552 var27 = new class552(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, arg1, arg1 - -var14 - 1, arg4, arg4 - (-var13 - -1), arg7, arg9, var23);
                                if (var27.method1008((byte) -68)) {
                                    var27.method1014(-7908, arg8);
                                }
                                var28 = var27;
                            } else {
                                var28 = new class396(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, arg1, arg1 + var14 + -1, arg4, arg4 + var13 + -1, arg7, arg9, arg2);
                            }
                            class376.method2154(var28, false);
                            if (class749.field10224 && !super.field7571 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg10 > 0 && var12.field10493 != 0) {
                                super.field7594[arg10][arg1][arg4] = (byte) class77.method473(super.field7594[arg10][arg1][arg4], 4);
                            }
                            if (~var12.field10464 != -1 && arg3 != null) {
                                arg3.method1962(var14, arg4, true, var12.field10479, arg1, !var12.field10507, var13);
                            }
                        }
                    } else {
                        class552 var66 = null;
                        int var68;
                        class620 var69;
                        if (var24) {
                            class552 var67 = new class552(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, arg1, arg1 + var14 + -1, arg4, arg4 - 1 + var13, arg7, arg9, var23);
                            var68 = var67.method2994((byte) 74);
                            var69 = var67;
                            var66 = var67;
                        } else {
                            var69 = new class396(arg8, var12, arg10, arg0, var21, var20, var22, super.field7571, arg1, arg1 + var14 + -1, arg4, arg4 + var13 - 1, arg7, arg9, arg2);
                            var68 = 15;
                        }
                        if (class376.method2154(var69, false)) {
                            if (var66 != null && var66.method1008((byte) -100)) {
                                var66.method1014(-7908, arg8);
                            }
                            if (var12.field10463 && class749.field10224) {
                                if (~var68 < -31) {
                                    var68 = 30;
                                }
                                for (int var70 = 0; ~var70 >= ~var14; ++var70) {
                                    for (int var71 = 0; ~var13 <= ~var71; ++var71) {
                                        var19.method2058(arg1 + var70, arg4 - -var71, var68);
                                    }
                                }
                            }
                        }
                        if (~var12.field10464 != -1 && arg3 != null) {
                            arg3.method1962(var14, arg4, true, var12.field10479, arg1, !var12.field10507, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIZ)V", line = 1470)
    public class752(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class571.field7223, class235.field3225);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BB)C", line = 1473)
    public static final char method4080(byte arg0, byte arg1) {
        ++field10254;
        int var2 = arg0 & 255;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (arg1 <= 40) {
                field10243 = null;
            }
            if (var2 >= 128 && ~var2 > -161) {
                char var3 = class264.field3516[var2 + -128];
                if (~var3 == -1) {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V", line = 1500)
    public static void method4081(int arg0) {
        field10246 = null;
        field10243 = null;
        if (arg0 < 75) {
            field10246 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLha;[BIII[Leo;IIII)V", line = 1514)
    public final void method4082(boolean arg0, class570 arg1, byte[] arg2, int arg3, int arg4, int arg5, class340[] arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field10247;
        if (!arg0) {
            field10246 = null;
        }
        class234 var12 = new class234(arg2);
        int var13 = -1;
        while (true) {
            int var14 = var12.method1510(110);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1505((byte) -6);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = 63 & var15;
                int var18 = 63 & var15 >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method1509(arg0);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (arg8 == var19 && var18 >= arg9 && var18 < arg9 + 8 && ~arg10 >= ~var17 && arg10 - -8 > var17) {
                    class773 var23 = class390.field4983.method4292(var13, (byte) -115);
                    int var24 = arg3 - -class70.method421(var23.field10484, arg5, (byte) -67, 7 & var17, var23.field10466, var18 & 7, var22);
                    int var25 = arg4 - -class530.method2906(104, var23.field10484, var17 & 7, var18 & 7, var22, var23.field10466, arg5);
                    if (~var24 < -1 && var25 > 0 && super.field7582 + -1 > var24 && ~var25 > ~(super.field7599 + -1)) {
                        class340 var26 = null;
                        if (!super.field7571) {
                            int var27 = arg7;
                            if (~(2 & class410.field5439[1][var24][var25]) == -3) {
                                var27 = arg7 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg6[var27];
                            }
                        }
                        this.method4079(arg7, var24, -1, var26, var25, 125, var13, var21, arg1, 3 & var22 - -arg5, arg7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILha;ILeo;III)V", line = 1596)
    public final void method4083(int arg0, class570 arg1, int arg2, class340 arg3, int arg4, int arg5, int arg6) {
        if (arg4 == -30419) {
            ++field10257;
            class274 var8 = this.method4073(-70, arg2, arg0, arg6, arg5);
            if (var8 != null) {
                class773 var9 = class390.field4983.method4292(var8.method1010(arg4 ^ 28483), (byte) -121);
                int var10 = var8.method1007(true);
                int var11 = var8.method1013((byte) -33);
                if (var9.method4220((byte) 112)) {
                    class714.method3845((byte) 7, arg5, var9, arg0, arg6);
                }
                if (var8.method1008((byte) -52)) {
                    var8.method1015((byte) -127, arg1);
                }
                if (arg2 != 0) {
                    if (arg2 == 1) {
                        class158.method1011(arg6, arg0, arg5);
                        return;
                    }
                    if (~arg2 != -3) {
                        if (~arg2 == -4) {
                            client.method2625(arg6, arg0, arg5);
                            if (var9.field10464 == 1) {
                                arg3.method1973((byte) -89, arg5, arg0);
                                return;
                            }
                        }
                    } else {
                        class126.method736(arg6, arg0, arg5, field10259 != null ? field10259 : (field10259 = method4086("aia")));
                        if (var9.field10464 != 0 && ~(var9.field10466 + arg0) > ~super.field7582 && var9.field10466 + arg5 < super.field7599 && super.field7582 > arg0 - -var9.field10484 && ~super.field7599 < ~(var9.field10484 + arg5)) {
                            arg3.method1964(var9.field10484, arg5, var9.field10479, var11, (byte) -44, !var9.field10507, arg0, var9.field10466);
                        }
                        if (~var10 != -10) {
                            return;
                        }
                        if ((var11 & 1) == 0) {
                            class409.method2375(8, arg5, (byte) 75, arg0, arg6);
                            return;
                        }
                        class409.method2375(16, arg5, (byte) 72, arg0, arg6);
                    }
                    return;
                }
                class136.method789(arg6, arg0, arg5);
                if (~var9.field10464 != -1) {
                    arg3.method1958(var11, !var9.field10507, arg5, arg0, var9.field10479, var10, 128);
                }
                if (var9.field10493 == 1) {
                    if (~var11 == -1) {
                        class409.method2375(1, arg5, (byte) -79, arg0, arg6);
                        return;
                    }
                    if (var11 == 1) {
                        class409.method2375(2, arg5 + 1, (byte) 51, arg0, arg6);
                        return;
                    }
                    if (var11 != 2) {
                        if (var11 == 3) {
                            class409.method2375(2, arg5, (byte) -81, arg0, arg6);
                            return;
                        }
                    } else {
                        class409.method2375(1, arg5, (byte) -97, arg0 + 1, arg6);
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lha;IZ)V", line = 1696)
    public final void method4084(class570 arg0, int arg1, boolean arg2) {
        class534.method2914();
        if (arg1 != -1) {
            field10246 = null;
        }
        ++field10245;
        if (!arg2) {
            if (~super.field7591 < -2) {
                for (int var4 = 0; super.field7582 > var4; ++var4) {
                    for (int var5 = 0; ~super.field7599 < ~var5; ++var5) {
                        if ((class410.field5439[1][var4][var5] & 2) == 2) {
                            class365.method2098(var4, var5);
                        }
                    }
                }
            }
            for (int var6 = 0; var6 < super.field7591; ++var6) {
                for (int var7 = 0; super.field7599 >= var7; ++var7) {
                    for (int var8 = 0; super.field7582 >= var8; ++var8) {
                        if (~(super.field7594[var6][var8][var7] & 4) != -1) {
                            int var9 = var8;
                            int var10 = var8;
                            int var11 = var7;
                            int var12 = var7;
                            while (~var11 < -1 && ~(super.field7594[var6][var8][var11 + -1] & 4) != -1 && ~(-var11 + var12) > -11) {
                                --var11;
                            }
                            while (~var12 > ~super.field7599 && ~(4 & super.field7594[var6][var8][var12 + 1]) != -1 && ~(-var11 + var12) > -11) {
                                ++var12;
                            }
                            label117: while (~var9 < -1 && -var9 + var10 < 10) {
                                for (int var13 = var11; ~var13 >= ~var12; ++var13) {
                                    if (~(4 & super.field7594[var6][var9 + -1][var13]) == -1) {
                                        break label117;
                                    }
                                }
                                --var9;
                            }
                            label104: while (super.field7582 > var10 && ~(var10 - var9) > -11) {
                                for (int var14 = var11; var14 <= var12; ++var14) {
                                    if (~(4 & super.field7594[var6][var10 + 1][var14]) == -1) {
                                        break label104;
                                    }
                                }
                                ++var10;
                            }
                            if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) {
                                int var15 = super.field7590[var6][var9][var11];
                                class599.method3235(var15, (var10 << 9) + 512, true, var9 << 9, var6, (var12 << 9) + 512, 4, var15, var11 << 9);
                                for (int var16 = var9; var16 <= var10; ++var16) {
                                    for (int var17 = var11; var17 <= var12; ++var17) {
                                        super.field7594[var6][var16][var17] = (byte) class249.method1625(super.field7594[var6][var16][var17], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class316.method1850((byte) -8);
        }
        super.field7594 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lwm;IB)Lpu;", line = 1842)
    public static final class772 method4085(class30 arg0, int arg1, byte arg2) {
        ++field10258;
        if (arg2 != 36) {
            field10246 = null;
        }
        class772 var3 = (class772) class624.field7930.method2931((long) arg1, (byte) -92);
        if (var3 == null) {
            if (!class598.field7609) {
                var3 = class483.method2713(arg0.method148((byte) -127, arg1), 0);
            } else {
                var3 = class576.field7320.method977(class388.method2239(arg0, arg1), true);
            }
            class624.field7930.method2918((long) arg1, var3, 105);
        }
        return var3;
    }
}
