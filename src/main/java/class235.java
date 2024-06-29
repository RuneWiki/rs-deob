import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class235 extends class85 {

    @OriginalMember(owner = "client!sca", name = "K", descriptor = "I")
    public int field3120 = 99;

    @OriginalMember(owner = "client!sca", name = "I", descriptor = "Leba;")
    public static class550 field3118 = new class550(84, 0);

    @OriginalMember(owner = "client!sca", name = "H", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!sca", name = "L", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!sca", name = "M", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!sca", name = "N", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!sca", name = "O", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!sca", name = "Q", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!sca", name = "R", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!sca", name = "S", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!sca", name = "T", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!sca", name = "J", descriptor = "Lbda;")
    public static class437 field3119;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sca", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field3130;

    @OriginalMember(owner = "client!sca", name = "P", descriptor = "[I")
    public static int[] field3125;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1463(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lr;I[B[Lev;IIIBIII)V", line = 4)
    public final void method1455(class562 arg0, int arg1, byte[] arg2, class593[] arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10) {
        ++field3117;
        if (arg7 > -90) {
            field3125 = null;
        }
        class157 var12 = new class157(arg2);
        int var13 = -1;
        while (true) {
            int var14 = var12.method910(88);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method964(37);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 63;
                int var18 = (var15 & 4053) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method930(255);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (~arg8 == ~var19 && var18 >= arg5 && ~var18 > ~(arg5 + 8) && var17 >= arg1 && ~(arg1 - -8) < ~var17) {
                    class600 var23 = class118.field1510.method3921(var13, -66);
                    int var24 = arg9 - -class604.method3364(var18 & 7, arg10, var22, 7 & var17, var23.field8343, var23.field8290, -5);
                    int var25 = class398.method2273(var18 & 7, var22, -12384, 7 & var17, var23.field8290, var23.field8343, arg10) + arg4;
                    if (var24 > 0 && ~var25 < -1 && var24 < super.field1025 + -1 && var25 < super.field1039 + -1) {
                        class593 var26 = null;
                        if (!super.field1035) {
                            int var27 = arg6;
                            if (~(2 & class31.field440[1][var24][var25]) == -3) {
                                var27 = arg6 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg3[var27];
                            }
                        }
                        this.method1462(-1, arg6, var24, 3 & arg10 + var22, var26, arg0, var25, 6766, var13, arg6, var21);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I[IIILio;Lr;IIIBI)V", line = 88)
    public final void method1456(int arg0, int[] arg1, int arg2, int arg3, class157 arg4, class562 arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
        ++field3121;
        if (!super.field1035) {
            boolean var12 = false;
            class34 var13 = null;
            if (arg1 != null) {
                arg1[0] = -1;
            }
            int var14 = (arg7 & 7) * 8;
            int var15 = (arg10 & 7) * 8;
            if (arg9 == -73) {
                while (true) {
                    while (arg4.field2199.length > arg4.field2219) {
                        int var20 = arg4.method930(255);
                        if (~var20 == -1) {
                            var13 = new class34(arg4);
                        } else if (~var20 == -2) {
                            int var34 = arg4.method930(255);
                            if (var34 > 0) {
                                for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                    class628 var36 = new class628(arg5, arg4, 2);
                                    if (~var36.field8688 == -32) {
                                        class541 var37 = class400.field5311.method14(arg4.method963(arg9 ^ 49), arg9 ^ 39);
                                        var36.method3478(var37.field7418, var37.field7413, var37.field7414, (byte) 12, var37.field7412);
                                    }
                                    if (arg5.method1133() > 0) {
                                        class392 var38 = var36.field8687;
                                        int var39 = var38.method2258((byte) -42) >> 9;
                                        int var40 = var38.method2257(-17895) >> 9;
                                        if (~var36.field8702 == ~arg3 && ~var14 >= ~var39 && ~var39 > ~(var14 - -8) && var40 >= var15 && ~(var15 + 8) < ~var40) {
                                            int var41 = class52.method307(4095 & var38.method2258((byte) -100), arg6, true, 4095 & var38.method2257(-17895)) + (arg2 << 9);
                                            int var42 = var41 >> 9;
                                            int var43 = class538.method3025(5, var38.method2258((byte) -79) & 4095, 4095 & var38.method2257(-17895), arg6) + (arg8 << 9);
                                            int var44 = var43 >> 9;
                                            if (var42 >= 0 && ~var44 <= -1 && super.field1025 > var42 && var44 < super.field1039) {
                                                var38.method211(super.field1034[arg3][var42][var44] + -var38.method2261((byte) 37), var41, var43, (byte) 79);
                                                class616.method3407(var36);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (~var20 == -3) {
                            if (var13 == null) {
                                var13 = new class34();
                            }
                            var13.method201(-124, arg4);
                        } else if (~var20 == -129) {
                            if (arg1 != null) {
                                arg1[0] = arg4.method963(-128);
                                arg1[1] = arg4.method928(arg9 + 2016790297);
                                arg1[2] = arg4.method928(arg9 + 2016790297);
                                arg1[3] = arg4.method928(2016790224);
                                arg1[4] = arg4.method963(-122);
                            } else {
                                arg4.field2219 += 10;
                            }
                        } else {
                            if (~var20 != -130) {
                                throw new IllegalStateException("");
                            }
                            if (super.field1044 == null) {
                                super.field1044 = new byte[4][][];
                            }
                            for (int var21 = 0; ~var21 > -5; ++var21) {
                                byte var22 = arg4.method969(3);
                                if (~var22 == -1 && super.field1044[arg0] != null) {
                                    if (~arg3 <= ~var21) {
                                        int var23 = arg2;
                                        int var24 = arg2 + 7;
                                        int var25 = arg8;
                                        if (~var24 <= -1) {
                                            if (~var24 <= ~super.field1025) {
                                                var24 = super.field1025;
                                            }
                                        } else {
                                            var24 = 0;
                                        }
                                        if (arg8 >= 0) {
                                            if (~super.field1039 >= ~arg8) {
                                                var25 = super.field1039;
                                            }
                                        } else {
                                            var25 = 0;
                                        }
                                        if (arg2 >= 0) {
                                            if (super.field1025 <= arg2) {
                                                var23 = super.field1025;
                                            }
                                        } else {
                                            var23 = 0;
                                        }
                                        int var26 = arg8 + 7;
                                        if (var26 < 0) {
                                            var26 = 0;
                                        } else if (super.field1039 <= var26) {
                                            var26 = super.field1039;
                                        }
                                        while (var24 > var23) {
                                            while (var25 < var26) {
                                                super.field1044[arg0][var23][var25] = 0;
                                                ++var25;
                                            }
                                            ++var23;
                                        }
                                    }
                                } else if (~var22 == -2) {
                                    if (super.field1044[arg0] == null) {
                                        super.field1044[arg0] = new byte[super.field1025 + 1][super.field1039 + 1];
                                    }
                                    for (int var27 = 0; var27 < 64; var27 += 4) {
                                        for (int var28 = 0; var28 < 64; var28 += 4) {
                                            byte var29 = arg4.method969(3);
                                            if (~arg3 <= ~var21) {
                                                for (int var30 = var27; var27 + 4 > var30; ++var30) {
                                                    for (int var31 = var28; var31 < var28 - -4; ++var31) {
                                                        if (~var30 <= ~var14 && ~var30 > ~(var14 + 8) && var15 <= var31 && var15 < var15 + 8) {
                                                            int var32 = arg2 - -class267.method1594(var30 & 7, arg6, var31 & 7, -15763);
                                                            int var33 = arg8 + class579.method3196(var31 & 7, 7 & var30, 11336, arg6);
                                                            if (var32 >= 0 && ~super.field1025 < ~var32 && var33 >= 0 && super.field1039 > var33) {
                                                                super.field1044[arg0][var32][var33] = var29;
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
                        class200.method1283((byte) -51, arg2 >> 3, var13, arg8 >> 3);
                    }
                    if (!var12 && super.field1044 != null && super.field1044[arg0] != null) {
                        int var16 = arg2 + 7;
                        int var17 = arg8 + 7;
                        for (int var18 = arg2; var18 < var16; ++var18) {
                            for (int var19 = arg8; var17 > var19; ++var19) {
                                super.field1044[arg0][var18][var19] = 0;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIIILev;ILr;)V", line = 385)
    public final void method1457(int arg0, int arg1, int arg2, int arg3, class593 arg4, int arg5, class562 arg6) {
        ++field3127;
        class599 var8 = null;
        if (~arg1 == -1) {
            var8 = (class599) class41.method225(arg3, arg2, arg5);
        }
        if (arg0 == -5) {
            if (arg1 == 1) {
                var8 = (class599) class595.method3304(arg3, arg2, arg5);
            }
            if (arg1 == 2) {
                var8 = (class599) class303.method1782(arg3, arg2, arg5, field3130 != null ? field3130 : (field3130 = method1463("ge")));
            }
            if (arg1 == 3) {
                var8 = (class599) class50.method266(arg3, arg2, arg5);
            }
            if (var8 != null) {
                class600 var9 = class118.field1510.method3921(var8.method710((byte) 105), -53);
                int var10 = var8.method699((byte) -39);
                int var11 = var8.method706(16259);
                if (var9.method3322(8254)) {
                    class323.method1876(var9, -257174775, arg5, arg3, arg2);
                }
                if (var8.method705(125)) {
                    var8.method707(arg6, (byte) -100);
                }
                if (~arg1 == -1) {
                    class200.method1284(arg3, arg2, arg5);
                    if (var9.field8327 != 0) {
                        arg4.method3298(var9.field8338, var10, var11, arg2, arg5, !var9.field8342, 29165);
                    }
                    if (var9.field8278 == 1) {
                        if (~var11 != -1) {
                            if (var11 != 1) {
                                if (~var11 != -3) {
                                    if (~var11 == -4) {
                                        class226.method1410(arg2, -48, 2, arg5, arg3);
                                        return;
                                    }
                                } else {
                                    class226.method1410(arg2 + 1, 116, 1, arg5, arg3);
                                }
                                return;
                            }
                            class226.method1410(arg2, 124, 2, arg5 + 1, arg3);
                            return;
                        }
                        class226.method1410(arg2, 19, 1, arg5, arg3);
                        return;
                    }
                    return;
                }
                if (arg1 == 1) {
                    class146.method833(arg3, arg2, arg5);
                    return;
                }
                if (~arg1 == -3) {
                    class274.method1648(arg3, arg2, arg5, field3130 != null ? field3130 : (field3130 = method1463("ge")));
                    if (var9.field8327 != 0 && ~(arg2 - -var9.field8290) > ~super.field1025 && ~super.field1039 < ~(var9.field8290 + arg5) && ~(var9.field8343 + arg2) > ~super.field1025 && var9.field8343 + arg5 < super.field1039) {
                        arg4.method3285(var9.field8343, var9.field8338, 63, var9.field8290, arg5, arg2, !var9.field8342, var11);
                        return;
                    }
                    return;
                }
                if (~arg1 == -4) {
                    class329.method1913(arg3, arg2, arg5);
                    if (~var9.field8327 == -2) {
                        arg4.method3288(arg0 ^ -20756, arg5, arg2);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(BILr;Lio;[II)V", line = 487)
    public final void method1458(byte arg0, int arg1, class562 arg2, class157 arg3, int[] arg4, int arg5) {
        ++field3122;
        if (!super.field1035) {
            boolean var7 = false;
            if (arg4 != null) {
                arg4[0] = -1;
            }
            class34 var8 = null;
            while (true) {
                while (arg3.field2219 < arg3.field2199.length) {
                    int var18 = arg3.method930(255);
                    if (var18 == 0) {
                        var8 = new class34(arg3);
                    } else if (var18 == 1) {
                        int var34 = arg3.method930(255);
                        if (var34 > 0) {
                            for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                class628 var36 = new class628(arg2, arg3, 2);
                                if (var36.field8688 == 31) {
                                    class541 var37 = class400.field5311.method14(arg3.method963(-122), -104);
                                    var36.method3478(var37.field7418, var37.field7413, var37.field7414, (byte) 125, var37.field7412);
                                }
                                if (~arg2.method1133() < -1) {
                                    class392 var38 = var36.field8687;
                                    int var39 = var38.method2258((byte) -97) - -(arg5 << 9);
                                    int var40 = var38.method2257(-17895) - -(arg1 << 9);
                                    int var41 = var39 >> 9;
                                    int var42 = var40 >> 9;
                                    if (~var41 <= -1 && var42 >= 0 && var41 < super.field1025 && var42 < super.field1039) {
                                        var38.method211(super.field1034[var36.field8702][var41][var42] + -var38.method2261((byte) 37), var39, var40, (byte) 79);
                                        class616.method3407(var36);
                                    }
                                }
                            }
                        }
                    } else if (~var18 == -3) {
                        if (var8 == null) {
                            var8 = new class34();
                        }
                        var8.method201(-121, arg3);
                    } else if (var18 == 128) {
                        if (arg4 == null) {
                            arg3.field2219 += 10;
                        } else {
                            arg4[0] = arg3.method963(-127);
                            arg4[1] = arg3.method928(2016790224);
                            arg4[2] = arg3.method928(2016790224);
                            arg4[3] = arg3.method928(2016790224);
                            arg4[4] = arg3.method963(-127);
                        }
                    } else {
                        if (~var18 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field1044 == null) {
                            super.field1044 = new byte[4][][];
                        }
                        for (int var19 = 0; ~var19 > -5; ++var19) {
                            byte var20 = arg3.method969(3);
                            if (var20 == 0 && super.field1044[var19] != null) {
                                int var21 = arg5;
                                int var22 = arg5 - -64;
                                int var23 = arg1;
                                int var24 = arg1 + 64;
                                if (~var22 > -1) {
                                    var22 = 0;
                                } else if (super.field1025 <= var22) {
                                    var22 = super.field1025;
                                }
                                if (~arg1 > -1) {
                                    var23 = 0;
                                } else if (~arg1 <= ~super.field1039) {
                                    var23 = super.field1039;
                                }
                                if (arg5 >= 0) {
                                    if (arg5 >= super.field1025) {
                                        var21 = super.field1025;
                                    }
                                } else {
                                    var21 = 0;
                                }
                                if (var24 >= 0) {
                                    if (~var24 <= ~super.field1039) {
                                        var24 = super.field1039;
                                    }
                                } else {
                                    var24 = 0;
                                }
                                while (var22 > var21) {
                                    while (~var23 > ~var24) {
                                        super.field1044[var19][var21][var23] = 0;
                                        ++var23;
                                    }
                                    ++var21;
                                }
                            } else if (~var20 == -2) {
                                if (super.field1044[var19] == null) {
                                    super.field1044[var19] = new byte[super.field1025 - -1][super.field1039 + 1];
                                }
                                for (int var25 = 0; var25 < 64; var25 += 4) {
                                    for (int var26 = 0; ~var26 > -65; var26 += 4) {
                                        byte var27 = arg3.method969(3);
                                        for (int var28 = arg5 + var25; var28 < var25 - -arg5 + 4; ++var28) {
                                            for (int var29 = arg1 + var26; var29 < arg1 + var26 - -4; ++var29) {
                                                if (var28 >= 0 && ~var28 > ~super.field1025 && var29 >= 0 && ~var29 > ~super.field1039) {
                                                    super.field1044[var19][var28][var29] = var27;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (~var20 == -3) {
                                if (super.field1044[var19] == null) {
                                    super.field1044[var19] = new byte[super.field1025 + 1][super.field1039 + 1];
                                }
                                if (~var19 < -1) {
                                    int var30 = arg5;
                                    int var31 = arg5 - -64;
                                    int var32 = arg1;
                                    int var33 = arg1 + 64;
                                    if (~var31 > -1) {
                                        var31 = 0;
                                    } else if (super.field1025 <= var31) {
                                        var31 = super.field1025;
                                    }
                                    if (arg1 < 0) {
                                        var32 = 0;
                                    } else if (~super.field1039 >= ~arg1) {
                                        var32 = super.field1039;
                                    }
                                    if (arg5 < 0) {
                                        var30 = 0;
                                    } else if (~super.field1025 >= ~arg5) {
                                        var30 = super.field1025;
                                    }
                                    if (~var33 <= -1) {
                                        if (~super.field1039 >= ~var33) {
                                            var33 = super.field1039;
                                        }
                                    } else {
                                        var33 = 0;
                                    }
                                    while (var30 < var31) {
                                        while (~var32 > ~var33) {
                                            super.field1044[var19][var30][var32] = super.field1044[var19 + -1][var30][var32];
                                            ++var32;
                                        }
                                        ++var30;
                                    }
                                }
                            }
                        }
                        var7 = true;
                    }
                }
                if (arg0 > -109) {
                    return;
                }
                if (var8 != null) {
                    for (int var9 = 0; ~var9 > -9; ++var9) {
                        for (int var10 = 0; ~var10 > -9; ++var10) {
                            int var11 = (arg5 >> 3) + var9;
                            int var12 = (arg1 >> 3) + var10;
                            if (~var11 <= -1 && ~(super.field1025 >> 3) < ~var11 && ~var12 <= -1 && ~(super.field1039 >> 3) < ~var12) {
                                class200.method1283((byte) -51, var11, var8, var12);
                            }
                        }
                    }
                }
                if (!var7 && super.field1044 != null) {
                    for (int var13 = 0; var13 < 4; ++var13) {
                        if (super.field1044[var13] != null) {
                            for (int var14 = 0; ~var14 > -17; ++var14) {
                                for (int var15 = 0; ~var15 > -17; ++var15) {
                                    int var16 = (arg5 >> 2) - -var14;
                                    int var17 = (arg1 >> 2) + var15;
                                    if (var16 >= 0 && var16 < 26 && var17 >= 0 && var17 < 26) {
                                        super.field1044[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IZLr;)V", line = 853)
    public final void method1459(int arg0, boolean arg1, class562 arg2) {
        ++field3126;
        if (arg0 != 4) {
            this.method1459(112, false, (class562) null);
        }
        class101.method567();
        if (!arg1) {
            if (super.field1038 > 1) {
                for (int var4 = 0; var4 < super.field1025; ++var4) {
                    for (int var5 = 0; super.field1039 > var5; ++var5) {
                        if (~(2 & class31.field440[1][var4][var5]) == -3) {
                            class162.method995(var4, var5);
                        }
                    }
                }
            }
            for (int var6 = 0; var6 < super.field1038; ++var6) {
                for (int var7 = 0; var7 <= super.field1039; ++var7) {
                    for (int var8 = 0; ~super.field1025 <= ~var8; ++var8) {
                        if ((super.field1036[var6][var8][var7] & 4) != 0) {
                            int var9 = var8;
                            int var10 = var8;
                            int var11;
                            for (var11 = var7; var11 > 0 && ~(super.field1036[var6][var8][var11 - 1] & 4) != -1; --var11) {
                            }
                            int var12;
                            for (var12 = var7; ~var12 > ~super.field1039 && ~(super.field1036[var6][var8][var12 + 1] & 4) != -1; ++var12) {
                            }
                            label108: while (~var9 < -1) {
                                for (int var13 = var11; var12 >= var13; ++var13) {
                                    if ((super.field1036[var6][var9 + -1][var13] & 4) == 0) {
                                        break label108;
                                    }
                                }
                                --var9;
                            }
                            label97: while (super.field1025 > var10) {
                                for (int var14 = var11; var12 >= var14; ++var14) {
                                    if ((4 & super.field1036[var6][var10 - -1][var14]) == 0) {
                                        break label97;
                                    }
                                }
                                ++var10;
                            }
                            if ((var10 - var9 + 1) * (-var11 + 1 + var12) >= 4) {
                                int var15 = super.field1034[var6][var9][var11];
                                class170.method1159(var15, var15, (var10 << 9) + 512, var9 << 9, var11 << 9, true, (var12 << 9) + 512, var6, 4);
                                for (int var16 = var9; var16 <= var10; ++var16) {
                                    for (int var17 = var11; ~var17 >= ~var12; ++var17) {
                                        super.field1036[var6][var16][var17] = (byte) class15.method97(super.field1036[var6][var16][var17], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class625.method3471(0);
        }
        super.field1036 = null;
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(IIIZ)V", line = 1712)
    public class235(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class37.field501, class35.field492);
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)V", line = 1001)
    public static void method1460(int arg0) {
        if (arg0 <= 103) {
            field3124 = 127;
        }
        field3118 = null;
        field3125 = null;
        field3119 = null;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lr;I[B[Lev;II)V", line = 1014)
    public final void method1461(class562 arg0, int arg1, byte[] arg2, class593[] arg3, int arg4, int arg5) {
        ++field3123;
        if (arg4 != -9592) {
            method1460(-117);
        }
        class157 var7 = new class157(arg2);
        int var8 = -1;
        while (true) {
            int var9 = var7.method910(63);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method964(124);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = var10 & 63;
                int var13 = 63 & var10 >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method930(255);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = arg1 + var13;
                int var19 = arg5 + var12;
                if (~var18 < -1 && ~var19 < -1 && ~var18 > ~(super.field1025 + -1) && ~(super.field1039 + -1) < ~var19) {
                    class593 var20 = null;
                    if (!super.field1035) {
                        int var21 = var14;
                        if (~(class31.field440[1][var18][var19] & 2) == -3) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg3[var21];
                        }
                    }
                    this.method1462(-1, var14, var18, var17, var20, arg0, var19, 6766, var8, var14, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIIILev;Lr;IIIII)V", line = 1090)
    public final void method1462(int arg0, int arg1, int arg2, int arg3, class593 arg4, class562 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field3128;
        if (class602.field8408.method3554(class618.field8566, (byte) -116) || class452.method2541(class32.field454, arg6, arg1, arg2, 0)) {
            if (arg9 < this.field3120) {
                this.field3120 = arg9;
            }
            class600 var12 = class118.field1510.method3921(arg8, -93);
            if (!arg5.method1087() || !class602.field8408.field4311 || !var12.field8291) {
                if (arg7 != 6766) {
                    field3125 = null;
                }
                int var13;
                int var14;
                if (arg3 != 1 && arg3 != 3) {
                    var13 = var12.field8290;
                    var14 = var12.field8343;
                } else {
                    var13 = var12.field8343;
                    var14 = var12.field8290;
                }
                int var15;
                int var16;
                if (~(arg2 - -var13) >= ~super.field1025) {
                    var15 = (var13 + 1 >> 1) + arg2;
                    var16 = arg2 - -(var13 >> 1);
                } else {
                    var16 = arg2;
                    var15 = arg2 + 1;
                }
                int var17;
                int var18;
                if (super.field1039 >= arg6 + var14) {
                    var17 = (var14 >> 1) + arg6;
                    var18 = (var14 + 1 >> 1) + arg6;
                } else {
                    var17 = arg6;
                    var18 = arg6 + 1;
                }
                class270 var19 = class246.field3214[arg1];
                int var20 = var19.method1611(var16, true, var17) - (-var19.method1611(var15, true, var17) + -var19.method1611(var16, true, var18) + -var19.method1611(var15, true, var18)) >> 2;
                int var21 = (arg2 << 9) + (var13 << 8);
                int var22 = (arg6 << 9) + (var14 << 8);
                boolean var23 = class699.field9857 && !super.field1035 && var12.field8311;
                if (var12.method3322(8254)) {
                    class519.method2943(arg9, (class573) null, (class351) null, arg3, arg2, arg6, true, var12);
                }
                boolean var24 = ~arg0 == 0 && var12.field8313 == -1 && var12.field8288 == null && var12.field8257 == null && !var12.field8277;
                if (!class200.field2709 || (!class519.method2941(-10550, arg10) || var12.field8278 == 1) && (!class404.method2306(false, arg10) || ~var12.field8278 != -1)) {
                    if (~arg10 == -23) {
                        if (class602.field8408.field4300 || ~var12.field8293 != -1 || var12.field8327 == 1 || var12.field8266) {
                            class271 var25;
                            if (!var24) {
                                var25 = new class317(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, arg3, arg0);
                            } else {
                                class465 var26 = new class465(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, arg3, var23);
                                var25 = var26;
                                if (var26.method705(98)) {
                                    var26.method700(arg5, arg7 ^ -18608);
                                }
                            }
                            class252.method1533(arg9, arg2, arg6, var25);
                            if (~var12.field8327 == -2 && arg4 != null) {
                                arg4.method3289(1088, arg2, arg6);
                            }
                        }
                    } else if (~arg10 != -11 && ~arg10 != -12) {
                        if (~arg10 <= -13 && ~arg10 >= -18 || ~arg10 <= -19 && ~arg10 >= -22) {
                            class29 var27;
                            if (!var24) {
                                var27 = new class660(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, arg2, arg2 + var13 - 1, arg6, arg6 + -1 + var14, arg10, arg3, arg0);
                            } else {
                                class120 var28 = new class120(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, arg2, arg2 - -var13 + -1, arg6, arg6 + var14 + -1, arg10, arg3, var23);
                                var27 = var28;
                                if (var28.method705(75)) {
                                    var28.method700(arg5, -21186);
                                }
                            }
                            class616.method3409(var27, false);
                            if (class699.field9857 && !super.field1035 && arg10 >= 12 && ~arg10 >= -18 && arg10 != 13 && ~arg9 < -1 && var12.field8278 != 0) {
                                super.field1036[arg9][arg2][arg6] = (byte) class665.method3789(super.field1036[arg9][arg2][arg6], 4);
                            }
                            if (~var12.field8327 != -1 && arg4 != null) {
                                arg4.method3291(!var12.field8342, arg2, arg6, (byte) 77, var14, var13, var12.field8338);
                            }
                        } else if (~arg10 == -1) {
                            int var29 = var12.field8278;
                            if (class96.field1157 && var12.field8278 == -1) {
                                var29 = 1;
                            }
                            class190 var31;
                            if (var24) {
                                class617 var30 = new class617(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, arg10, arg3, var23);
                                if (var30.method705(75)) {
                                    var30.method700(arg5, -21186);
                                }
                                var31 = var30;
                            } else {
                                var31 = new class370(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, arg10, arg3, arg0);
                            }
                            class688.method3893(arg9, arg2, arg6, var31, (class190) null);
                            if (~arg3 == -1) {
                                if (class699.field9857 && var12.field8308) {
                                    var19.method1358(arg2, arg6, 50);
                                    var19.method1358(arg2, arg6 - -1, 50);
                                }
                                if (var29 == 1 && !super.field1035) {
                                    class608.method3376(arg9, arg7 + -6768, arg6, 1, var12.field8295, arg2, var12.field8282);
                                }
                            } else if (arg3 == 1) {
                                if (class699.field9857 && var12.field8308) {
                                    var19.method1358(arg2, arg6 + 1, 50);
                                    var19.method1358(arg2 + 1, arg6 + 1, 50);
                                }
                                if (var29 == 1 && !super.field1035) {
                                    class608.method3376(arg9, arg7 + -6768, arg6 + 1, 2, var12.field8295, arg2, -var12.field8282);
                                }
                            } else if (arg3 != 2) {
                                if (~arg3 == -4) {
                                    if (class699.field9857 && var12.field8308) {
                                        var19.method1358(arg2, arg6, 50);
                                        var19.method1358(arg2 + 1, arg6, 50);
                                    }
                                    if (var29 == 1 && !super.field1035) {
                                        class608.method3376(arg9, arg7 + -6768, arg6, 2, var12.field8295, arg2, var12.field8282);
                                    }
                                }
                            } else {
                                if (class699.field9857 && var12.field8308) {
                                    var19.method1358(arg2 + 1, arg6, 50);
                                    var19.method1358(arg2 + 1, arg6 - -1, 50);
                                }
                                if (~var29 == -2 && !super.field1035) {
                                    class608.method3376(arg9, -2, arg6, 1, var12.field8295, arg2 - -1, -var12.field8282);
                                }
                            }
                            if (var12.field8327 != 0 && arg4 != null) {
                                arg4.method3296(var12.field8338, arg6, arg2, !var12.field8342, arg7 + -6713, arg10, arg3);
                            }
                            if (var12.field8317 != 64) {
                                class215.method1367(arg9, arg2, arg6, var12.field8317);
                            }
                        } else if (arg10 == 1) {
                            class190 var33;
                            if (var24) {
                                class617 var32 = new class617(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, arg10, arg3, var23);
                                var33 = var32;
                                if (var32.method705(94)) {
                                    var32.method700(arg5, -21186);
                                }
                            } else {
                                var33 = new class370(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, arg10, arg3, arg0);
                            }
                            class688.method3893(arg9, arg2, arg6, var33, (class190) null);
                            if (var12.field8308 && class699.field9857) {
                                if (arg3 != 0) {
                                    if (~arg3 != -2) {
                                        if (arg3 != 2) {
                                            if (~arg3 == -4) {
                                                var19.method1358(arg2, arg6, 50);
                                            }
                                        } else {
                                            var19.method1358(arg2 + 1, arg6, 50);
                                        }
                                    } else {
                                        var19.method1358(arg2 + 1, arg6 - -1, 50);
                                    }
                                } else {
                                    var19.method1358(arg2, arg6 + 1, 50);
                                }
                            }
                            if (~var12.field8327 != -1 && arg4 != null) {
                                arg4.method3296(var12.field8338, arg6, arg2, !var12.field8342, 94, arg10, arg3);
                            }
                        } else if (arg10 == 2) {
                            int var34 = 3 & arg3 + 1;
                            class190 var35;
                            class190 var36;
                            if (!var24) {
                                var35 = new class370(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, arg10, arg3 + 4, arg0);
                                var36 = new class370(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, arg10, var34, arg0);
                            } else {
                                class617 var37 = new class617(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, arg10, arg3 + 4, var23);
                                class617 var38 = new class617(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, arg10, var34, var23);
                                if (var37.method705(89)) {
                                    var37.method700(arg5, -21186);
                                }
                                if (var38.method705(arg7 + -6644)) {
                                    var38.method700(arg5, -21186);
                                }
                                var36 = var38;
                                var35 = var37;
                            }
                            class688.method3893(arg9, arg2, arg6, var35, var36);
                            if ((~var12.field8278 == -2 || class96.field1157 && var12.field8278 == -1) && !super.field1035) {
                                if (~arg3 != -1) {
                                    if (~arg3 != -2) {
                                        if (~arg3 == -3) {
                                            class608.method3376(arg9, arg7 ^ -6768, arg6, 1, var12.field8295, arg2 + 1, var12.field8282);
                                            class608.method3376(arg9, arg7 + -6768, arg6, 2, var12.field8295, arg2, var12.field8282);
                                        } else if (arg3 == 3) {
                                            class608.method3376(arg9, -2, arg6, 1, var12.field8295, arg2, var12.field8282);
                                            class608.method3376(arg9, arg7 ^ -6768, arg6, 2, var12.field8295, arg2, var12.field8282);
                                        }
                                    } else {
                                        class608.method3376(arg9, arg7 + -6768, arg6, 1, var12.field8295, arg2 + 1, var12.field8282);
                                        class608.method3376(arg9, arg7 + -6768, arg6 + 1, 2, var12.field8295, arg2, var12.field8282);
                                    }
                                } else {
                                    class608.method3376(arg9, -2, arg6, 1, var12.field8295, arg2, var12.field8282);
                                    class608.method3376(arg9, arg7 + -6768, arg6 + 1, 2, var12.field8295, arg2, var12.field8282);
                                }
                            }
                            if (~var12.field8327 != -1 && arg4 != null) {
                                arg4.method3296(var12.field8338, arg6, arg2, !var12.field8342, 74, arg10, arg3);
                            }
                            if (var12.field8317 != 64) {
                                class215.method1367(arg9, arg2, arg6, var12.field8317);
                            }
                        } else if (arg10 == 3) {
                            class190 var39;
                            if (!var24) {
                                var39 = new class370(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, arg10, arg3, arg0);
                            } else {
                                class617 var40 = new class617(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, arg10, arg3, var23);
                                var39 = var40;
                                if (var40.method705(arg7 + -6692)) {
                                    var40.method700(arg5, arg7 + -27952);
                                }
                            }
                            class688.method3893(arg9, arg2, arg6, var39, (class190) null);
                            if (var12.field8308 && class699.field9857) {
                                if (arg3 == 0) {
                                    var19.method1358(arg2, arg6 + 1, 50);
                                } else if (arg3 != 1) {
                                    if (arg3 == 2) {
                                        var19.method1358(arg2 + 1, arg6, 50);
                                    } else if (~arg3 == -4) {
                                        var19.method1358(arg2, arg6, 50);
                                    }
                                } else {
                                    var19.method1358(arg2 + 1, arg6 + 1, 50);
                                }
                            }
                            if (var12.field8327 != 0 && arg4 != null) {
                                arg4.method3296(var12.field8338, arg6, arg2, !var12.field8342, arg7 ^ 6680, arg10, arg3);
                            }
                        } else if (arg10 == 9) {
                            class29 var42;
                            if (var24) {
                                class120 var41 = new class120(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, arg2, arg2, arg6, arg6, arg10, arg3, var23);
                                var42 = var41;
                                if (var41.method705(arg7 + -6673)) {
                                    var41.method700(arg5, arg7 ^ -18608);
                                }
                            } else {
                                var42 = new class660(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, arg2, arg2 + -1 + var13, arg6, var14 - 1 + arg6, arg10, arg3, arg0);
                            }
                            class616.method3409(var42, false);
                            if (~var12.field8327 != -1 && arg4 != null) {
                                arg4.method3291(!var12.field8342, arg2, arg6, (byte) 115, var14, var13, var12.field8338);
                            }
                            if (~var12.field8317 != -65) {
                                class215.method1367(arg9, arg2, arg6, var12.field8317);
                            }
                        } else if (~arg10 == -5) {
                            class363 var44;
                            if (var24) {
                                class583 var43 = new class583(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, 0, 0, arg10, arg3);
                                var44 = var43;
                                if (var43.method705(122)) {
                                    var43.method700(arg5, arg7 ^ -18608);
                                }
                            } else {
                                var44 = new class681(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, 0, 0, arg10, arg3, arg0);
                            }
                            class141.method794(arg9, arg2, arg6, var44, (class363) null);
                        } else if (~arg10 == -6) {
                            int var45 = 65;
                            class599 var46 = (class599) class41.method225(arg9, arg2, arg6);
                            if (var46 != null) {
                                var45 = 1 + class118.field1510.method3921(var46.method710((byte) 93), -120).field8317;
                            }
                            class363 var47;
                            if (!var24) {
                                var47 = new class681(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, class603.field8423[arg3] * var45, class179.field2513[arg3] * var45, arg10, arg3, arg0);
                            } else {
                                class583 var48 = new class583(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, class603.field8423[arg3] * var45, class179.field2513[arg3] * var45, arg10, arg3);
                                var47 = var48;
                                if (var48.method705(123)) {
                                    var48.method700(arg5, -21186);
                                }
                            }
                            class141.method794(arg9, arg2, arg6, var47, (class363) null);
                        } else if (~arg10 == -7) {
                            int var49 = 33;
                            class599 var50 = (class599) class41.method225(arg9, arg2, arg6);
                            if (var50 != null) {
                                var49 = class118.field1510.method3921(var50.method710((byte) 102), -114).field8317 / 2 + 1;
                            }
                            class363 var51;
                            if (!var24) {
                                var51 = new class681(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, class394.field5264[arg3] * var49, class588.field8120[arg3] * var49, arg10, arg3 + 4, arg0);
                            } else {
                                class583 var52 = new class583(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, class603.field8423[arg3] * var49, class179.field2513[arg3] * var49, arg10, arg3 - -4);
                                if (var52.method705(71)) {
                                    var52.method700(arg5, arg7 ^ -18608);
                                }
                                var51 = var52;
                            }
                            class141.method794(arg9, arg2, arg6, var51, (class363) null);
                        } else if (arg10 == 7) {
                            int var53 = 3 & arg3 - -2;
                            class363 var54;
                            if (!var24) {
                                var54 = new class681(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, 0, 0, arg10, var53 + 4, arg0);
                            } else {
                                class583 var55 = new class583(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, 0, 0, arg10, var53 - -4);
                                if (var55.method705(98)) {
                                    var55.method700(arg5, arg7 ^ -18608);
                                }
                                var54 = var55;
                            }
                            class141.method794(arg9, arg2, arg6, var54, (class363) null);
                        } else if (~arg10 == -9) {
                            int var56 = 3 & arg3 + 2;
                            int var57 = 33;
                            class599 var58 = (class599) class41.method225(arg9, arg2, arg6);
                            if (var58 != null) {
                                var57 = class118.field1510.method3921(var58.method710((byte) 79), arg7 + -6822).field8317 / 2 - -1;
                            }
                            class363 var61;
                            class363 var62;
                            if (var24) {
                                class583 var59 = new class583(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, class394.field5264[arg3] * var57, class588.field8120[arg3] * var57, arg10, arg3 + 4);
                                class583 var60 = new class583(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, 0, 0, arg10, var56 - -4);
                                if (var59.method705(arg7 + -6684)) {
                                    var59.method700(arg5, -21186);
                                }
                                if (var60.method705(arg7 ^ 6680)) {
                                    var60.method700(arg5, arg7 + -27952);
                                }
                                var61 = var59;
                                var62 = var60;
                            } else {
                                class681 var63 = new class681(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, class394.field5264[arg3] * var57, class588.field8120[arg3] * var57, arg10, arg3 + 4, arg0);
                                class681 var64 = new class681(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, 0, 0, arg10, var56 - -4, arg0);
                                var61 = var63;
                                var62 = var64;
                            }
                            class141.method794(arg9, arg2, arg6, var61, var62);
                        }
                    } else {
                        class120 var65 = null;
                        int var66;
                        class29 var67;
                        if (!var24) {
                            var66 = 15;
                            var67 = new class660(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, arg2, arg2 + var13 + -1, arg6, arg6 + var14 + -1, arg10, arg3, arg0);
                        } else {
                            class120 var68 = new class120(arg5, var12, arg9, arg1, var21, var20, var22, super.field1035, arg2, arg2 - (-var13 + 1), arg6, arg6 + -1 + var14, arg10, arg3, var23);
                            var65 = var68;
                            var66 = var68.method701(-92);
                            var67 = var68;
                        }
                        if (class616.method3409(var67, false)) {
                            if (var65 != null && var65.method705(120)) {
                                var65.method700(arg5, -21186);
                            }
                            if (var12.field8308 && class699.field9857) {
                                if (var66 > 30) {
                                    var66 = 30;
                                }
                                for (int var69 = 0; var13 >= var69; ++var69) {
                                    for (int var70 = 0; var14 >= var70; ++var70) {
                                        var19.method1358(arg2 + var69, arg6 + var70, var66);
                                    }
                                }
                            }
                        }
                        if (~var12.field8327 != -1 && arg4 != null) {
                            arg4.method3291(!var12.field8342, arg2, arg6, (byte) 103, var14, var13, var12.field8338);
                        }
                    }
                }
            }
        }
    }
}
