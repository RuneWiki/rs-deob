import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class23 extends class235 {

    @OriginalMember(owner = "client!ks", name = "O", descriptor = "I")
    public int field263 = 99;

    @OriginalMember(owner = "client!ks", name = "M", descriptor = "Lsc;")
    public static class270 field261 = new class270(6, 0, 4, 2);

    @OriginalMember(owner = "client!ks", name = "S", descriptor = "Lpu;")
    public static class179 field267 = new class179("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!ks", name = "T", descriptor = "Leg;")
    public static class34 field268 = new class34("", 17);

    @OriginalMember(owner = "client!ks", name = "U", descriptor = "[I")
    public static int[] field269 = new int[200];

    @OriginalMember(owner = "client!ks", name = "V", descriptor = "I")
    public static int field270 = 13156520;

    @OriginalMember(owner = "client!ks", name = "X", descriptor = "Lmo;")
    public static class271 field272 = new class271(13, 4);

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!ks", name = "F", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!ks", name = "H", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!ks", name = "I", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!ks", name = "J", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!ks", name = "K", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!ks", name = "L", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ks", name = "N", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!ks", name = "P", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!ks", name = "Q", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!ks", name = "R", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!ks", name = "W", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!ks", name = "Y", descriptor = "I")
    public static int field273;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ks", name = "Z", descriptor = "Ljava/lang/Class;")
    public static Class field274;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method151(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IB)V", line = 3)
    public static final void method140(int arg0, byte arg1) {
        if (class107.field1627 == null) {
            class107.field1627 = new byte[4][class338.field5076][class250.field4077];
        }
        ++field258;
        if (arg0 == 8607) {
            for (int var2 = 0; ~var2 > -5; ++var2) {
                for (int var3 = 0; ~var3 > ~class338.field5076; ++var3) {
                    for (int var4 = 0; ~var4 > ~class250.field4077; ++var4) {
                        class107.field1627[var2][var3][var4] = arg1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IILza;Luh;III)V", line = 41)
    public final void method141(int arg0, int arg1, class299 arg2, class407 arg3, int arg4, int arg5, int arg6) {
        ++field266;
        if (arg1 > 65) {
            class161 var8 = null;
            if (~arg0 == -1) {
                var8 = (class161) class454.method2781(arg4, arg5, arg6);
            }
            if (arg0 == 1) {
                var8 = (class161) class124.method921(arg4, arg5, arg6);
            }
            if (~arg0 == -3) {
                var8 = (class161) class35.method217(arg4, arg5, arg6, field274 != null ? field274 : (field274 = method151("bs")));
            }
            if (~arg0 == -4) {
                var8 = (class161) class404.method2542(arg4, arg5, arg6);
            }
            if (var8 != null) {
                class395 var9 = class247.field3693.method2281(var8.method99((byte) -107), -9380);
                int var10 = var8.method103(-97);
                int var11 = var8.method97(89);
                if (var9.method2486(155)) {
                    class482.method2909(arg4, var9, 364175271, arg6, arg5);
                }
                if (var8.method104((byte) 94)) {
                    var8.method100((byte) 51, arg2);
                }
                if (arg0 != 0) {
                    if (~arg0 == -2) {
                        class202 var12 = class124.method921(arg4, arg5, arg6);
                        if (!(var12 instanceof class275)) {
                            class343.method2208(arg4, arg5, arg6);
                            return;
                        }
                        ((class275) var12).field4321 = null;
                        return;
                    }
                    if (arg0 == 2) {
                        class76 var13 = class35.method217(arg4, arg5, arg6, field274 != null ? field274 : (field274 = method151("bs")));
                        if (var13 instanceof class451 && var13.field1283 == arg5 && var13.field1277 == arg6) {
                            ((class451) var13).field6699 = null;
                        } else {
                            class312.method2071(arg4, arg5, arg6, field274 != null ? field274 : (field274 = method151("bs")));
                        }
                        if (var9.field5827 != 0 && var9.field5826 + arg5 < super.field3542 && super.field3528 > var9.field5826 + arg6 && super.field3542 > var9.field5830 + arg5 && ~(arg6 - -var9.field5830) > ~super.field3528) {
                            arg3.method2561(var11, -1, var9.field5826, arg5, arg6, var9.field5830, !var9.field5806, var9.field5820);
                            return;
                        }
                        return;
                    }
                    if (arg0 == 3) {
                        class481 var14 = class404.method2542(arg4, arg5, arg6);
                        if (var14 instanceof class195) {
                            ((class195) var14).field3048 = null;
                        } else {
                            class174.method1241(arg4, arg5, arg6);
                        }
                        if (var9.field5827 == 1) {
                            arg3.method2567((byte) 27, arg5, arg6);
                            return;
                        }
                    }
                    return;
                }
                class501 var15 = class454.method2781(arg4, arg5, arg6);
                if (var15 instanceof class435) {
                    ((class435) var15).field6478 = null;
                } else {
                    class147.method1048(arg4, arg5, arg6);
                }
                if (var9.field5827 != 0) {
                    arg3.method2563(arg5, 121, var11, arg6, var9.field5820, !var9.field5806, var10);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZLza;Lfh;[II)V", line = 156)
    public final void method142(int arg0, boolean arg1, class299 arg2, class194 arg3, int[] arg4, int arg5) {
        ++field256;
        if (!super.field3522) {
            boolean var7 = false;
            if (arg1) {
                class52 var8 = null;
                if (arg4 != null) {
                    arg4[0] = -1;
                }
                while (true) {
                    while (arg3.field2973.length > arg3.field2982) {
                        int var18 = arg3.method1337((byte) 32);
                        if (~var18 == -1) {
                            var8 = new class52(arg3);
                        } else if (var18 == 1) {
                            int var19 = arg3.method1337((byte) 14);
                            if (var19 > 0) {
                                for (int var20 = 0; var19 > var20; ++var20) {
                                    class181 var21 = new class181(arg2, arg3, 0);
                                    if (var21.field2768 == 31) {
                                        class203 var22 = class61.field958.method200(18167, arg3.method1396(15));
                                        var21.method1272(var22.field3143, var22.field3145, var22.field3137, (byte) 52, var22.field3140);
                                    }
                                    if (~arg2.method572() < -1) {
                                        class344 var23 = var21.field2775;
                                        int var24 = var23.method2214((byte) 120) - -(arg5 << 7);
                                        int var25 = (arg0 << 7) + var23.method2216(-1);
                                        int var26 = var24 >> 7;
                                        int var27 = var25 >> 7;
                                        if (~var26 <= -1 && var27 >= 0 && super.field3542 > var26 && ~var27 > ~super.field3528) {
                                            var23.method835(var24, var25, 120, super.field3527[var21.field2764][var26][var27] + -var23.method2217(true));
                                            class481.method2900(var21);
                                        }
                                    }
                                }
                            }
                        } else if (~var18 == -3) {
                            if (var8 == null) {
                                var8 = new class52();
                            }
                            var8.method344(arg3, (byte) 117);
                        } else if (var18 == 128) {
                            if (arg4 != null) {
                                arg4[0] = arg3.method1396(-95);
                                arg4[1] = arg3.method1384(true);
                                arg4[2] = arg3.method1384(true);
                                arg4[3] = arg3.method1384(true);
                                arg4[4] = arg3.method1396(-112);
                            } else {
                                arg3.field2982 += 10;
                            }
                        } else {
                            if (~var18 != -130) {
                                throw new IllegalStateException("");
                            }
                            if (super.field3520 == null) {
                                super.field3520 = new byte[4][][];
                            }
                            var7 = true;
                            for (int var28 = 0; ~var28 > -5; ++var28) {
                                byte var29 = arg3.method1398(50);
                                if (var29 == 0 && super.field3520[var28] != null) {
                                    int var30 = arg5;
                                    int var31 = arg5 - -64;
                                    int var32 = arg0;
                                    int var33 = arg0 + 64;
                                    if (arg0 < 0) {
                                        var32 = 0;
                                    } else if (arg0 >= super.field3528) {
                                        var32 = super.field3528;
                                    }
                                    if (arg5 >= 0) {
                                        if (~arg5 <= ~super.field3542) {
                                            var30 = super.field3542;
                                        }
                                    } else {
                                        var30 = 0;
                                    }
                                    if (~var31 > -1) {
                                        var31 = 0;
                                    } else if (super.field3542 <= var31) {
                                        var31 = super.field3542;
                                    }
                                    if (~var33 <= -1) {
                                        if (~super.field3528 >= ~var33) {
                                            var33 = super.field3528;
                                        }
                                    } else {
                                        var33 = 0;
                                    }
                                    while (var30 < var31) {
                                        while (var32 < var33) {
                                            super.field3520[var28][var30][var32] = 0;
                                            ++var32;
                                        }
                                        ++var30;
                                    }
                                } else if (~var29 == -2) {
                                    if (super.field3520[var28] == null) {
                                        super.field3520[var28] = new byte[super.field3542 + 1][super.field3528 + 1];
                                    }
                                    for (int var34 = 0; var34 < 64; var34 += 4) {
                                        for (int var35 = 0; ~var35 > -65; var35 += 4) {
                                            byte var36 = arg3.method1398(65);
                                            for (int var37 = var34 - -arg5; var37 < var34 - -arg5 + 4; ++var37) {
                                                for (int var38 = arg0 + var35; ~var38 > ~(var35 + 4 + arg0); ++var38) {
                                                    if (var37 >= 0 && var37 < super.field3542 && ~var38 <= -1 && super.field3528 > var38) {
                                                        super.field3520[var28][var37][var38] = var36;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (var29 == 2) {
                                    if (super.field3520[var28] == null) {
                                        super.field3520[var28] = new byte[super.field3542 + 1][super.field3528 + 1];
                                    }
                                    if (~var28 < -1) {
                                        int var39 = arg5;
                                        int var40 = arg5 + 64;
                                        int var41 = arg0;
                                        if (~arg5 > -1) {
                                            var39 = 0;
                                        } else if (~arg5 <= ~super.field3542) {
                                            var39 = super.field3542;
                                        }
                                        int var42 = arg0 + 64;
                                        if (~arg0 <= -1) {
                                            if (~arg0 <= ~super.field3528) {
                                                var41 = super.field3528;
                                            }
                                        } else {
                                            var41 = 0;
                                        }
                                        if (var40 >= 0) {
                                            if (~super.field3542 >= ~var40) {
                                                var40 = super.field3542;
                                            }
                                        } else {
                                            var40 = 0;
                                        }
                                        if (~var42 > -1) {
                                            var42 = 0;
                                        } else if (~super.field3528 >= ~var42) {
                                            var42 = super.field3528;
                                        }
                                        while (~var39 > ~var40) {
                                            while (var42 > var41) {
                                                super.field3520[var28][var39][var41] = super.field3520[var28 + -1][var39][var41];
                                                ++var41;
                                            }
                                            ++var39;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var8 != null) {
                        for (int var9 = 0; var9 < 8; ++var9) {
                            for (int var10 = 0; ~var10 > -9; ++var10) {
                                int var11 = (arg5 >> 3) - -var9;
                                int var12 = (arg0 >> 3) - -var10;
                                if (~var11 <= -1 && var11 < super.field3542 >> 3 && ~var12 <= -1 && var12 < super.field3528 >> 3) {
                                    class438.method2714(var12, (byte) -114, var8, var11);
                                }
                            }
                        }
                    }
                    if (!var7 && super.field3520 != null) {
                        for (int var13 = 0; ~var13 > -5; ++var13) {
                            if (super.field3520[var13] != null) {
                                for (int var14 = 0; ~var14 > -17; ++var14) {
                                    for (int var15 = 0; var15 < 16; ++var15) {
                                        int var16 = (arg5 >> 2) + var14;
                                        int var17 = (arg0 >> 2) + var15;
                                        if (~var16 <= -1 && ~var16 > -27 && var17 >= 0 && ~var17 > -27) {
                                            super.field3520[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZIIIILuh;IILza;I)V", line = 532)
    public final void method143(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class407 arg6, int arg7, int arg8, class299 arg9, int arg10) {
        ++field259;
        if (class40.field667.method416(127, class108.field1631) || class379.method2415(-3, arg2, arg3, arg8, class213.field3236)) {
            if (this.field263 > arg10) {
                this.field263 = arg10;
            }
            class395 var12 = class247.field3693.method2281(arg5, -9380);
            if (!arg9.method570() || !class40.field667.field4217 || !var12.field5823) {
                int var13;
                int var14;
                if (~arg4 != -2 && ~arg4 != -4) {
                    var13 = var12.field5826;
                    var14 = var12.field5830;
                } else {
                    var13 = var12.field5830;
                    var14 = var12.field5826;
                }
                int var15;
                int var16;
                if (super.field3542 < arg3 + var13) {
                    var15 = arg3;
                    var16 = arg3 + 1;
                } else {
                    var16 = (var13 + 1 >> 1) + arg3;
                    var15 = (var13 >> 1) + arg3;
                }
                int var17;
                int var18;
                if (super.field3528 >= arg8 - -var14) {
                    var17 = (var14 >> 1) + arg8;
                    var18 = (var14 + 1 >> 1) + arg8;
                } else {
                    var17 = arg8;
                    var18 = arg8 + 1;
                }
                class11 var19 = class407.field6024[arg2];
                int var20 = var19.method56(var15, var17) + var19.method56(var16, var17) + (var19.method56(var15, var18) - -var19.method56(var16, var18)) >> 2;
                int var21 = (arg3 << 7) + (var13 << 6);
                if (!arg1) {
                    int var22 = (arg8 << 7) + (var14 << 6);
                    boolean var23 = class491.field7199 && !super.field3522 && var12.field5792;
                    if (var12.method2486(155)) {
                        class200.method1413((class46) null, arg3, var12, arg10, (byte) 117, (class511) null, arg8, arg4);
                    }
                    boolean var24 = arg0 == -1 && ~var12.field5780 == 0 && var12.field5804 == null && var12.field5825 == null && !var12.field5802;
                    if (!class156.field2404 || (!class407.method2559(3518, arg7) || var12.field5767 == 1) && (!class271.method1866(false, arg7) || var12.field5767 != 0)) {
                        if (arg7 == 22) {
                            if (class40.field667.field4195 || ~var12.field5840 != -1 || ~var12.field5827 == -2 || var12.field5787) {
                                class481 var26;
                                if (var24) {
                                    class331 var25 = new class331(arg9, var12, arg2, var21, var20, var22, super.field3522, arg4, var23);
                                    if (var25.method104((byte) 5)) {
                                        var25.method96(arg9, (byte) 106);
                                    }
                                    var26 = var25;
                                } else {
                                    var26 = new class86(arg9, var12, arg10, arg2, var21, var20, var22, super.field3522, arg4, arg0);
                                }
                                class481 var27 = class404.method2542(arg10, arg3, arg8);
                                if (var27 instanceof class195) {
                                    ((class195) var27).field3048 = var26;
                                } else {
                                    class397.method2507(arg10, arg3, arg8, var26);
                                }
                                if (var12.field5827 == 1 && arg6 != null) {
                                    arg6.method2564(arg3, arg8, -115);
                                }
                            }
                        } else if (arg7 != 10 && ~arg7 != -12) {
                            if (arg7 >= 12 && ~arg7 >= -18 || arg7 >= 18 && arg7 <= 21) {
                                class76 var29;
                                if (var24) {
                                    class506 var28 = new class506(arg9, var12, arg10, arg2, var21, var20, var22, super.field3522, arg3, arg3 + -1 + var13, arg8, arg8 + -1 + var14, arg7, arg4, var23);
                                    var29 = var28;
                                    if (var28.method104((byte) 97)) {
                                        var28.method96(arg9, (byte) 116);
                                    }
                                } else {
                                    var29 = new class17(arg9, var12, arg10, arg2, var21, var20, var22, super.field3522, arg3, arg3 - -var13 + -1, arg8, arg8 - -var14 - 1, arg7, arg4, arg0);
                                }
                                class76 var30 = class35.method217(arg10, arg3, arg8, field274 != null ? field274 : (field274 = method151("bs")));
                                if (var30 instanceof class451 && ~var30.field1283 == ~arg3 && ~var30.field1277 == ~arg8) {
                                    ((class451) var30).field6699 = var29;
                                } else {
                                    class321.method2123(var29, false);
                                }
                                if (class491.field7199 && !super.field3522 && arg7 >= 12 && arg7 <= 17 && ~arg7 != -14 && ~arg10 < -1 && ~var12.field5767 != -1) {
                                    super.field3535[arg10][arg3][arg8] = (byte) class19.method118(super.field3535[arg10][arg3][arg8], 4);
                                }
                                if (var12.field5827 != 0 && arg6 != null) {
                                    arg6.method2558(arg3, -89, var12.field5820, arg8, !var12.field5806, var14, var13);
                                }
                            } else if (~arg7 == -1) {
                                int var31 = var12.field5767;
                                if (class256.field4121 && var12.field5767 == -1) {
                                    var31 = 1;
                                }
                                class501 var33;
                                if (var24) {
                                    class401 var32 = new class401(arg9, var12, arg2, var21, var20, var22, super.field3522, arg7, arg4, var23);
                                    if (var32.method104((byte) -90)) {
                                        var32.method96(arg9, (byte) 87);
                                    }
                                    var33 = var32;
                                } else {
                                    var33 = new class117(arg9, var12, arg10, arg2, var21, var20, var22, super.field3522, arg7, arg4, arg0);
                                }
                                class501 var34 = class454.method2781(arg10, arg3, arg8);
                                if (var34 instanceof class435) {
                                    ((class435) var34).field6478 = var33;
                                } else {
                                    class450.method2765(arg10, arg3, arg8, var33, (class501) null);
                                }
                                if (class491.field7199) {
                                    if (~arg4 == -1) {
                                        if (var12.field5761) {
                                            var19.method58(arg3, arg8, 50);
                                            var19.method58(arg3, arg8 + 1, 50);
                                        }
                                        if (var31 == 1 && !super.field3522) {
                                            super.field3535[arg10][arg3][arg8] = (byte) class19.method118(super.field3535[arg10][arg3][arg8], 1);
                                        }
                                    } else if (arg4 == 1) {
                                        if (var12.field5761) {
                                            var19.method58(arg3, arg8 + 1, 50);
                                            var19.method58(arg3 - -1, arg8 + 1, 50);
                                        }
                                        if (var31 == 1 && !super.field3522) {
                                            super.field3535[arg10][arg3][arg8 + 1] = (byte) class19.method118(super.field3535[arg10][arg3][arg8 + 1], 2);
                                        }
                                    } else if (~arg4 == -3) {
                                        if (var12.field5761) {
                                            var19.method58(arg3 + 1, arg8, 50);
                                            var19.method58(arg3 + 1, arg8 + 1, 50);
                                        }
                                        if (var31 == 1 && !super.field3522) {
                                            super.field3535[arg10][arg3 - -1][arg8] = (byte) class19.method118(super.field3535[arg10][arg3 - -1][arg8], 1);
                                        }
                                    } else if (arg4 == 3) {
                                        if (var12.field5761) {
                                            var19.method58(arg3, arg8, 50);
                                            var19.method58(arg3 + 1, arg8, 50);
                                        }
                                        if (var31 == 1 && !super.field3522) {
                                            super.field3535[arg10][arg3][arg8] = (byte) class19.method118(super.field3535[arg10][arg3][arg8], 2);
                                        }
                                    }
                                }
                                if (var12.field5827 != 0 && arg6 != null) {
                                    arg6.method2569(arg8, var12.field5820, arg7, !var12.field5806, 1, arg4, arg3);
                                }
                                if (var12.field5843 != 16) {
                                    class159.method1148(arg10, arg3, arg8, var12.field5843);
                                }
                            } else if (arg7 == 1) {
                                class501 var35;
                                if (!var24) {
                                    var35 = new class117(arg9, var12, arg10, arg2, var21, var20, var22, super.field3522, arg7, arg4, arg0);
                                } else {
                                    class401 var36 = new class401(arg9, var12, arg2, var21, var20, var22, super.field3522, arg7, arg4, var23);
                                    if (var36.method104((byte) -83)) {
                                        var36.method96(arg9, (byte) 118);
                                    }
                                    var35 = var36;
                                }
                                class501 var37 = class454.method2781(arg10, arg3, arg8);
                                if (var37 instanceof class435) {
                                    ((class435) var37).field6478 = var35;
                                } else {
                                    class450.method2765(arg10, arg3, arg8, var35, (class501) null);
                                }
                                if (var12.field5761 && class491.field7199) {
                                    if (arg4 == 0) {
                                        var19.method58(arg3, arg8 + 1, 50);
                                    } else if (arg4 == 1) {
                                        var19.method58(arg3 + 1, arg8 + 1, 50);
                                    } else if (~arg4 == -3) {
                                        var19.method58(arg3 - -1, arg8, 50);
                                    } else if (~arg4 == -4) {
                                        var19.method58(arg3, arg8, 50);
                                    }
                                }
                                if (var12.field5827 != 0 && arg6 != null) {
                                    arg6.method2569(arg8, var12.field5820, arg7, !var12.field5806, 1, arg4, arg3);
                                }
                            } else if (~arg7 == -3) {
                                int var38 = arg4 - -1 & 3;
                                class501 var41;
                                class501 var42;
                                if (var24) {
                                    class401 var39 = new class401(arg9, var12, arg2, var21, var20, var22, super.field3522, arg7, arg4 + 4, var23);
                                    class401 var40 = new class401(arg9, var12, arg2, var21, var20, var22, super.field3522, arg7, var38, var23);
                                    if (var39.method104((byte) 27)) {
                                        var39.method96(arg9, (byte) 110);
                                    }
                                    var41 = var40;
                                    var42 = var39;
                                    if (var40.method104((byte) -104)) {
                                        var40.method96(arg9, (byte) 106);
                                    }
                                } else {
                                    var42 = new class117(arg9, var12, arg10, arg2, var21, var20, var22, super.field3522, arg7, arg4 + 4, arg0);
                                    var41 = new class117(arg9, var12, arg10, arg2, var21, var20, var22, super.field3522, arg7, var38, arg0);
                                }
                                class450.method2765(arg10, arg3, arg8, var42, var41);
                                if (var12.field5767 == 1 && class491.field7199 && !super.field3522) {
                                    if (arg4 == 0) {
                                        super.field3535[arg10][arg3][arg8] = (byte) class19.method118(super.field3535[arg10][arg3][arg8], 1);
                                        super.field3535[arg10][arg3][arg8 + 1] = (byte) class19.method118(super.field3535[arg10][arg3][arg8 + 1], 2);
                                    } else if (arg4 != 1) {
                                        if (~arg4 == -3) {
                                            super.field3535[arg10][arg3 + 1][arg8] = (byte) class19.method118(super.field3535[arg10][arg3 + 1][arg8], 1);
                                            super.field3535[arg10][arg3][arg8] = (byte) class19.method118(super.field3535[arg10][arg3][arg8], 2);
                                        } else if (arg4 == 3) {
                                            super.field3535[arg10][arg3][arg8] = (byte) class19.method118(super.field3535[arg10][arg3][arg8], 2);
                                            super.field3535[arg10][arg3][arg8] = (byte) class19.method118(super.field3535[arg10][arg3][arg8], 1);
                                        }
                                    } else {
                                        super.field3535[arg10][arg3][arg8 + 1] = (byte) class19.method118(super.field3535[arg10][arg3][arg8 + 1], 2);
                                        super.field3535[arg10][arg3 + 1][arg8] = (byte) class19.method118(super.field3535[arg10][arg3 + 1][arg8], 1);
                                    }
                                }
                                if (var12.field5827 != 0 && arg6 != null) {
                                    arg6.method2569(arg8, var12.field5820, arg7, !var12.field5806, 1, arg4, arg3);
                                }
                                if (~var12.field5843 != -17) {
                                    class159.method1148(arg10, arg3, arg8, var12.field5843);
                                }
                            } else if (arg7 == 3) {
                                class501 var43;
                                if (!var24) {
                                    var43 = new class117(arg9, var12, arg10, arg2, var21, var20, var22, super.field3522, arg7, arg4, arg0);
                                } else {
                                    class401 var44 = new class401(arg9, var12, arg2, var21, var20, var22, super.field3522, arg7, arg4, var23);
                                    var43 = var44;
                                    if (var44.method104((byte) -120)) {
                                        var44.method96(arg9, (byte) 127);
                                    }
                                }
                                class501 var45 = class454.method2781(arg10, arg3, arg8);
                                if (!(var45 instanceof class435)) {
                                    class450.method2765(arg10, arg3, arg8, var43, (class501) null);
                                } else {
                                    ((class435) var45).field6478 = var43;
                                }
                                if (var12.field5761 && class491.field7199) {
                                    if (arg4 != 0) {
                                        if (arg4 == 1) {
                                            var19.method58(arg3 + 1, arg8 + 1, 50);
                                        } else if (~arg4 == -3) {
                                            var19.method58(arg3 + 1, arg8, 50);
                                        } else if (~arg4 == -4) {
                                            var19.method58(arg3, arg8, 50);
                                        }
                                    } else {
                                        var19.method58(arg3, arg8 + 1, 50);
                                    }
                                }
                                if (~var12.field5827 != -1 && arg6 != null) {
                                    arg6.method2569(arg8, var12.field5820, arg7, !var12.field5806, 1, arg4, arg3);
                                }
                            } else if (~arg7 == -10) {
                                class76 var46;
                                if (!var24) {
                                    var46 = new class17(arg9, var12, arg10, arg2, var21, var20, var22, super.field3522, arg3, arg3 + var13 + -1, arg8, arg8 + -1 - -var14, arg7, arg4, arg0);
                                } else {
                                    class506 var47 = new class506(arg9, var12, arg10, arg2, var21, var20, var22, super.field3522, arg3, arg3, arg8, arg8, arg7, arg4, var23);
                                    var46 = var47;
                                    if (var47.method104((byte) -92)) {
                                        var47.method96(arg9, (byte) 100);
                                    }
                                }
                                class76 var48 = class35.method217(arg10, arg3, arg8, field274 != null ? field274 : (field274 = method151("bs")));
                                if (var48 instanceof class451 && ~var48.field1283 == ~arg3 && var48.field1277 == arg8) {
                                    ((class451) var48).field6699 = var46;
                                } else {
                                    class321.method2123(var46, false);
                                }
                                if (~var12.field5827 != -1 && arg6 != null) {
                                    arg6.method2558(arg3, -66, var12.field5820, arg8, !var12.field5806, var14, var13);
                                }
                                if (var12.field5843 != 16) {
                                    class159.method1148(arg10, arg3, arg8, var12.field5843);
                                }
                            } else if (~arg7 == -5) {
                                class202 var49;
                                if (!var24) {
                                    var49 = new class223(arg9, var12, arg10, arg2, var21, var20, var22, super.field3522, 0, 0, 0, arg7, arg4, arg0);
                                } else {
                                    class441 var50 = new class441(arg9, var12, arg2, var21, var20, var22, super.field3522, 0, 0, 0, arg7, arg4);
                                    if (var50.method104((byte) 5)) {
                                        var50.method96(arg9, (byte) 113);
                                    }
                                    var49 = var50;
                                }
                                class202 var51 = class124.method921(arg10, arg3, arg8);
                                if (!(var51 instanceof class275)) {
                                    class224.method1546(arg10, arg3, arg8, var49, (class202) null);
                                } else {
                                    ((class275) var51).field4321 = var49;
                                }
                            } else if (~arg7 == -6) {
                                int var52 = 17;
                                class161 var53 = (class161) class454.method2781(arg10, arg3, arg8);
                                if (var53 != null) {
                                    var52 = 1 + class247.field3693.method2281(var53.method99((byte) -107), -9380).field5843;
                                }
                                class202 var55;
                                if (var24) {
                                    class441 var54 = new class441(arg9, var12, arg2, var21, var20, var22, super.field3522, 0, class372.field5522[arg4] * var52, class133.field1961[arg4] * var52, arg7, arg4);
                                    var55 = var54;
                                    if (var54.method104((byte) 19)) {
                                        var54.method96(arg9, (byte) 126);
                                    }
                                } else {
                                    var55 = new class223(arg9, var12, arg10, arg2, var21, var20, var22, super.field3522, 0, class372.field5522[arg4] * var52, class133.field1961[arg4] * var52, arg7, arg4, arg0);
                                }
                                class202 var56 = class124.method921(arg10, arg3, arg8);
                                if (!(var56 instanceof class275)) {
                                    class224.method1546(arg10, arg3, arg8, var55, (class202) null);
                                } else {
                                    ((class275) var56).field4321 = var55;
                                }
                            } else if (arg7 == 6) {
                                int var57 = 9;
                                class161 var58 = (class161) class454.method2781(arg10, arg3, arg8);
                                if (var58 != null) {
                                    var57 = 1 + class247.field3693.method2281(var58.method99((byte) -107), -9380).field5843 / 2;
                                }
                                class202 var59;
                                if (!var24) {
                                    var59 = new class223(arg9, var12, arg10, arg2, var21, var20, var22, super.field3522, arg4, class89.field1444[arg4] * var57, class404.field5977[arg4] * var57, arg7, arg4 - -4, arg0);
                                } else {
                                    class441 var60 = new class441(arg9, var12, arg2, var21, var20, var22, super.field3522, arg4, class372.field5522[arg4] * var57, class133.field1961[arg4] * var57, arg7, arg4 + 4);
                                    var59 = var60;
                                    if (var60.method104((byte) -101)) {
                                        var60.method96(arg9, (byte) 122);
                                    }
                                }
                                class202 var61 = class124.method921(arg10, arg3, arg8);
                                if (!(var61 instanceof class275)) {
                                    class224.method1546(arg10, arg3, arg8, var59, (class202) null);
                                } else {
                                    ((class275) var61).field4321 = var59;
                                }
                            } else if (arg7 == 7) {
                                int var62 = 3 & arg4 + 2;
                                class202 var64;
                                if (var24) {
                                    class441 var63 = new class441(arg9, var12, arg2, var21, var20, var22, super.field3522, var62, 0, 0, arg7, var62 + 4);
                                    var64 = var63;
                                    if (var63.method104((byte) 127)) {
                                        var63.method96(arg9, (byte) 114);
                                    }
                                } else {
                                    var64 = new class223(arg9, var12, arg10, arg2, var21, var20, var22, super.field3522, var62, 0, 0, arg7, var62 + 4, arg0);
                                }
                                class202 var65 = class124.method921(arg10, arg3, arg8);
                                if (var65 instanceof class275) {
                                    ((class275) var65).field4321 = var64;
                                } else {
                                    class224.method1546(arg10, arg3, arg8, var64, (class202) null);
                                }
                            } else if (arg7 == 8) {
                                int var66 = 3 & arg4 + 2;
                                int var67 = 9;
                                class161 var68 = (class161) class454.method2781(arg10, arg3, arg8);
                                if (var68 != null) {
                                    var67 = class247.field3693.method2281(var68.method99((byte) -107), -9380).field5843 / 2 + 1;
                                }
                                class202 var71;
                                class202 var72;
                                if (var24) {
                                    class441 var69 = new class441(arg9, var12, arg2, var21, var20, var22, super.field3522, arg4, class89.field1444[arg4] * var67, class404.field5977[arg4] * var67, arg7, arg4 - -4);
                                    class441 var70 = new class441(arg9, var12, arg2, var21, var20, var22, super.field3522, arg4, 0, 0, arg7, var66 + 4);
                                    if (var69.method104((byte) 63)) {
                                        var69.method96(arg9, (byte) 116);
                                    }
                                    var71 = var70;
                                    var72 = var69;
                                    if (var70.method104((byte) -104)) {
                                        var70.method96(arg9, (byte) 113);
                                    }
                                } else {
                                    class223 var73 = new class223(arg9, var12, arg10, arg2, var21, var20, var22, super.field3522, arg4, class89.field1444[arg4] * var67, class404.field5977[arg4] * var67, arg7, arg4 + 4, arg0);
                                    class223 var74 = new class223(arg9, var12, arg10, arg2, var21, var20, var22, super.field3522, arg4, 0, 0, arg7, var66 - -4, arg0);
                                    var72 = var73;
                                    var71 = var74;
                                }
                                class224.method1546(arg10, arg3, arg8, var72, var71);
                            }
                        } else {
                            class506 var75 = null;
                            class76 var77;
                            int var78;
                            if (var24) {
                                class506 var76 = new class506(arg9, var12, arg10, arg2, var21, var20, var22, super.field3522, arg3, arg3 - -var13 + -1, arg8, arg8 - (-var14 + 1), arg7, arg4, var23);
                                var77 = var76;
                                var78 = var76.method3018(false);
                                var75 = var76;
                            } else {
                                var77 = new class17(arg9, var12, arg10, arg2, var21, var20, var22, super.field3522, arg3, arg3 - (-var13 - -1), arg8, arg8 + var14 + -1, arg7, arg4, arg0);
                                var78 = 15;
                            }
                            class76 var79 = class35.method217(arg10, arg3, arg8, field274 != null ? field274 : (field274 = method151("bs")));
                            boolean var80 = false;
                            if (var79 instanceof class451 && ~var79.field1283 == ~arg3 && var79.field1277 == arg8) {
                                ((class451) var79).field6699 = var77;
                                var80 = true;
                            }
                            if (var80 || class321.method2123(var77, false)) {
                                if (var75 != null && var75.method104((byte) -94)) {
                                    var75.method96(arg9, (byte) 116);
                                }
                                if (var12.field5761 && class491.field7199) {
                                    if (~var78 < -31) {
                                        var78 = 30;
                                    }
                                    for (int var81 = 0; var13 >= var81; ++var81) {
                                        for (int var82 = 0; var82 <= var14; ++var82) {
                                            var19.method58(arg3 + var81, arg8 + var82, var78);
                                        }
                                    }
                                }
                            }
                            if (~var12.field5827 != -1 && arg6 != null) {
                                arg6.method2558(arg3, -44, var12.field5820, arg8, !var12.field5806, var14, var13);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lza;B)V", line = 1244)
    public final void method144(class299 arg0, byte arg1) {
        class250.method1789(arg0);
        ++field265;
        if (~super.field3545 < -2) {
            for (int var3 = 0; var3 < super.field3542; ++var3) {
                for (int var4 = 0; var4 < super.field3528; ++var4) {
                    if ((class229.field3460[1][var3][var4] & 2) == 2) {
                        class414.method2597(var3, var4);
                    }
                }
            }
        }
        if (arg1 == 10) {
            for (int var5 = 0; ~super.field3545 < ~var5; ++var5) {
                for (int var6 = 0; ~super.field3528 <= ~var6; ++var6) {
                    for (int var7 = 0; super.field3542 >= var7; ++var7) {
                        if ((1 & super.field3535[var5][var7][var6]) != 0) {
                            int var8 = var6;
                            int var9 = var6;
                            int var10 = var5;
                            int var11 = var5;
                            while (~var8 < -1 && (1 & super.field3535[var5][var7][var8 + -1]) != 0) {
                                --var8;
                            }
                            while (var9 < super.field3528 && ~(super.field3535[var5][var7][var9 + 1] & 1) != -1) {
                                ++var9;
                            }
                            label169: while (~var10 < -1) {
                                for (int var12 = var8; ~var9 <= ~var12; ++var12) {
                                    if (~(1 & super.field3535[var10 + -1][var7][var12]) == -1) {
                                        break label169;
                                    }
                                }
                                --var10;
                            }
                            label158: while (var11 < 3) {
                                for (int var13 = var8; var13 <= var9; ++var13) {
                                    if ((super.field3535[var11 + 1][var7][var13] & 1) == 0) {
                                        break label158;
                                    }
                                }
                                ++var11;
                            }
                            int var14 = (-var8 + var9 + 1) * (var11 + 1 + -var10);
                            if (~var14 <= -3) {
                                short var15 = 240;
                                int var16 = super.field3527[var11][var7][var8] + -var15;
                                int var17 = super.field3527[var10][var7][var8];
                                class105.method838(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) - -128, var16, var17);
                                for (int var18 = var10; var18 <= var11; ++var18) {
                                    for (int var19 = var8; ~var19 >= ~var9; ++var19) {
                                        super.field3535[var18][var7][var19] = (byte) class307.method2028(super.field3535[var18][var7][var19], -2);
                                    }
                                }
                            }
                        }
                        if ((super.field3535[var5][var7][var6] & 2) != 0) {
                            int var20 = var7;
                            int var21 = var7;
                            int var22 = var5;
                            int var23 = var5;
                            while (super.field3542 > var21 && ~(super.field3535[var5][var21 + 1][var6] & 2) != -1) {
                                ++var21;
                            }
                            while (var20 > 0 && ~(2 & super.field3535[var5][var20 - 1][var6]) != -1) {
                                --var20;
                            }
                            label222: while (var22 > 0) {
                                for (int var24 = var20; ~var21 <= ~var24; ++var24) {
                                    if (~(super.field3535[var22 + -1][var24][var6] & 2) == -1) {
                                        break label222;
                                    }
                                }
                                --var22;
                            }
                            label211: while (~var23 > -4) {
                                for (int var25 = var20; ~var21 <= ~var25; ++var25) {
                                    if ((super.field3535[var23 - -1][var25][var6] & 2) == 0) {
                                        break label211;
                                    }
                                }
                                ++var23;
                            }
                            int var26 = (var23 - var22 + 1) * (-var20 + var21 + 1);
                            if (~var26 <= -3) {
                                short var27 = 240;
                                int var28 = super.field3527[var23][var20][var6] + -var27;
                                int var29 = super.field3527[var22][var20][var6];
                                class105.method838(2, var20 << 7, (var21 << 7) + 128, var6 << 7, var6 << 7, var28, var29);
                                for (int var30 = var22; ~var30 >= ~var23; ++var30) {
                                    for (int var31 = var20; var31 <= var21; ++var31) {
                                        super.field3535[var30][var31][var6] = (byte) class307.method2028(super.field3535[var30][var31][var6], -3);
                                    }
                                }
                            }
                        }
                        if ((4 & super.field3535[var5][var7][var6]) != 0) {
                            int var32 = var7;
                            int var33 = var7;
                            int var34 = var6;
                            int var35 = var6;
                            while (~var34 < -1 && ~(super.field3535[var5][var7][var34 + -1] & 4) != -1) {
                                --var34;
                            }
                            while (var35 < super.field3528 && ~(super.field3535[var5][var7][var35 + 1] & 4) != -1) {
                                ++var35;
                            }
                            label275: while (var32 > 0) {
                                for (int var36 = var34; var35 >= var36; ++var36) {
                                    if (~(super.field3535[var5][var32 + -1][var36] & 4) == -1) {
                                        break label275;
                                    }
                                }
                                --var32;
                            }
                            label264: while (~var33 > ~super.field3542) {
                                for (int var37 = var34; ~var37 >= ~var35; ++var37) {
                                    if ((super.field3535[var5][var33 + 1][var37] & 4) == 0) {
                                        break label264;
                                    }
                                }
                                ++var33;
                            }
                            if (~((var33 + 1 - var32) * (-var34 + var35 + 1)) <= -5) {
                                int var38 = super.field3527[var5][var32][var34];
                                class105.method838(4, var32 << 7, (var33 << 7) - -128, var34 << 7, (var35 << 7) + 128, var38, var38);
                                for (int var39 = var32; var33 >= var39; ++var39) {
                                    for (int var40 = var34; var40 <= var35; ++var40) {
                                        super.field3535[var5][var39][var40] = (byte) class307.method2028(super.field3535[var5][var39][var40], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            super.field3535 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V", line = 1533)
    public static void method145(int arg0) {
        field272 = null;
        field269 = null;
        field268 = null;
        int var1 = -92 % ((19 - arg0) / 58);
        field267 = null;
        field261 = null;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(IIIZ)V", line = 1546)
    public class23(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class314.field4777, class118.field1813);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIBI)V", line = 1549)
    public static final void method146(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field255;
        int var6 = -92 % ((arg4 - 74) / 34);
        int var7 = -arg3 + arg5;
        int var8 = -arg2 + arg1;
        if (~var7 == -1) {
            if (~var8 != -1) {
                class59.method387(arg3, arg1, 0, arg2, arg0);
            }
        } else if (var8 == 0) {
            class326.method2145(true, arg3, arg2, arg5, arg0);
        } else {
            int var9 = (var8 << 12) / var7;
            int var10 = arg2 - (arg3 * var9 >> 12);
            int var11;
            int var12;
            if (arg5 >= class232.field3492) {
                if (~arg5 < ~class36.field453) {
                    var11 = (class36.field453 * var9 >> 12) + var10;
                    var12 = class36.field453;
                } else {
                    var12 = arg5;
                    var11 = arg1;
                }
            } else {
                var11 = (class232.field3492 * var9 >> 12) + var10;
                var12 = class232.field3492;
            }
            int var13;
            int var14;
            if (class232.field3492 > arg3) {
                var13 = class232.field3492;
                var14 = (class232.field3492 * var9 >> 12) + var10;
            } else if (~arg3 >= ~class36.field453) {
                var14 = arg2;
                var13 = arg3;
            } else {
                var13 = class36.field453;
                var14 = (class36.field453 * var9 >> 12) + var10;
            }
            if (~class487.field7124 < ~var14) {
                var13 = (class487.field7124 - var10 << 12) / var9;
                var14 = class487.field7124;
            } else if (class232.field3493 < var14) {
                var13 = (class232.field3493 - var10 << 12) / var9;
                var14 = class232.field3493;
            }
            if (class487.field7124 <= var11) {
                if (var11 > class232.field3493) {
                    var12 = (-var10 + class232.field3493 << 12) / var9;
                    var11 = class232.field3493;
                }
            } else {
                var12 = (-var10 + class487.field7124 << 12) / var9;
                var11 = class487.field7124;
            }
            class462.method2832(var13, arg0, 0, var14, var11, var12);
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)Lwr;", line = 1653)
    public static final class537 method147(int arg0) {
        ++field260;
        return arg0 != 19042 ? null : class362.field5327;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "([BLza;IIIIIIIB[Luh;)V", line = 1672)
    public final void method148(byte[] arg0, class299 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, class407[] arg10) {
        ++field257;
        class194 var12 = new class194(arg0);
        if (arg9 < 48) {
            this.method142(98, false, (class299) null, (class194) null, (int[]) null, -8);
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method1390(1905);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1340(-103);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = (4092 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method1337((byte) 109);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (arg5 == var19 && arg6 <= var18 && var18 < arg6 - -8 && ~arg4 >= ~var17 && arg4 - -8 > var17) {
                    class395 var23 = class247.field3693.method2281(var13, -9380);
                    int var24 = class398.method2508(32, var23.field5826, 7 & var18, arg8, 7 & var17, var22, var23.field5830) + arg7;
                    int var25 = arg3 + class29.method171(var23.field5830, var23.field5826, arg8, 7 & var18, var22, (byte) -88, 7 & var17);
                    if (~var24 < -1 && var25 > 0 && ~var24 > ~(super.field3542 + -1) && ~var25 > ~(super.field3528 + -1)) {
                        class407 var26 = null;
                        if (!super.field3522) {
                            int var27 = arg2;
                            if (~(class229.field3460[1][var24][var25] & 2) == -3) {
                                var27 = arg2 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg10[var27];
                            }
                        }
                        this.method143(-1, false, arg2, var24, var22 - -arg8 & 3, var13, var26, var21, var25, arg1, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II[IIILza;IBIILfh;)V", line = 1758)
    public final void method149(int arg0, int arg1, int[] arg2, int arg3, int arg4, class299 arg5, int arg6, byte arg7, int arg8, int arg9, class194 arg10) {
        ++field264;
        int var12 = 95 / ((arg7 - -52) / 61);
        if (!super.field3522) {
            boolean var13 = false;
            class52 var14 = null;
            if (arg2 != null) {
                arg2[0] = -1;
            }
            int var15 = (arg4 & 7) * 8;
            int var16 = (arg9 & 7) * 8;
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (arg10.field2973.length > arg10.field2982) {
                                int var21 = arg10.method1337((byte) -122);
                                if (~var21 != -1) {
                                    if (var21 != 1) {
                                        if (var21 != 2) {
                                            if (~var21 == -129) {
                                                if (arg2 != null) {
                                                    arg2[0] = arg10.method1396(36);
                                                    arg2[1] = arg10.method1384(true);
                                                    arg2[2] = arg10.method1384(true);
                                                    arg2[3] = arg10.method1384(true);
                                                    arg2[4] = arg10.method1396(21);
                                                } else {
                                                    arg10.field2982 += 10;
                                                }
                                            } else {
                                                if (var21 != 129) {
                                                    throw new IllegalStateException("");
                                                }
                                                if (super.field3520 == null) {
                                                    super.field3520 = new byte[4][][];
                                                }
                                                for (int var22 = 0; ~var22 > -5; ++var22) {
                                                    byte var23 = arg10.method1398(36);
                                                    if (~var23 == -1 && super.field3520[arg8] != null) {
                                                        if (var22 <= arg1) {
                                                            int var24 = arg0;
                                                            int var25 = arg0 + 7;
                                                            int var26 = arg6;
                                                            if (~arg6 <= -1) {
                                                                if (~arg6 <= ~super.field3528) {
                                                                    var26 = super.field3528;
                                                                }
                                                            } else {
                                                                var26 = 0;
                                                            }
                                                            int var27 = arg6 - -7;
                                                            if (var25 < 0) {
                                                                var25 = 0;
                                                            } else if (var25 >= super.field3542) {
                                                                var25 = super.field3542;
                                                            }
                                                            if (~arg0 <= -1) {
                                                                if (~super.field3542 >= ~arg0) {
                                                                    var24 = super.field3542;
                                                                }
                                                            } else {
                                                                var24 = 0;
                                                            }
                                                            if (var27 < 0) {
                                                                var27 = 0;
                                                            } else if (~var27 <= ~super.field3528) {
                                                                var27 = super.field3528;
                                                            }
                                                            while (var24 < var25) {
                                                                while (var27 > var26) {
                                                                    super.field3520[arg8][var24][var26] = 0;
                                                                    ++var26;
                                                                }
                                                                ++var24;
                                                            }
                                                        }
                                                    } else if (var23 == 1) {
                                                        if (super.field3520[arg8] == null) {
                                                            super.field3520[arg8] = new byte[super.field3542 + 1][super.field3528 + 1];
                                                        }
                                                        for (int var28 = 0; var28 < 64; var28 += 4) {
                                                            for (int var29 = 0; ~var29 > -65; var29 += 4) {
                                                                byte var30 = arg10.method1398(31);
                                                                if (arg1 >= var22) {
                                                                    for (int var31 = var28; ~(var28 + 4) < ~var31; ++var31) {
                                                                        for (int var32 = var29; ~var32 > ~(var29 + 4); ++var32) {
                                                                            if (var31 >= var15 && var15 + 8 > var31 && ~var16 >= ~var32 && ~var16 > ~(var16 + 8)) {
                                                                                int var33 = class398.method2509((byte) 123, 7 & var32, arg3, 7 & var31) + arg0;
                                                                                int var34 = class336.method2187(112, arg3, var31 & 7, 7 & var32) + arg6;
                                                                                if (~var33 <= -1 && var33 < super.field3542 && var34 >= 0 && super.field3528 > var34) {
                                                                                    super.field3520[arg8][var33][var34] = var30;
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
                                        } else {
                                            if (var14 == null) {
                                                var14 = new class52();
                                            }
                                            var14.method344(arg10, (byte) -14);
                                        }
                                    } else {
                                        int var35 = arg10.method1337((byte) 31);
                                        if (~var35 < -1) {
                                            for (int var36 = 0; var36 < var35; ++var36) {
                                                class181 var37 = new class181(arg5, arg10, 0);
                                                if (~var37.field2768 == -32) {
                                                    class203 var38 = class61.field958.method200(18167, arg10.method1396(-102));
                                                    var37.method1272(var38.field3143, var38.field3145, var38.field3137, (byte) 97, var38.field3140);
                                                }
                                                if (~arg5.method572() < -1) {
                                                    class344 var39 = var37.field2775;
                                                    int var40 = var39.method2214((byte) 120) >> 7;
                                                    int var41 = var39.method2216(-1) >> 7;
                                                    if (~var37.field2764 == ~arg1 && var40 >= var15 && ~(var15 + 8) < ~var40 && var41 >= var16 && ~(var16 + 8) < ~var41) {
                                                        int var42 = (arg0 << 7) - -class159.method1144((byte) 96, arg3, var39.method2214((byte) 126) & 1023, 1023 & var39.method2216(-1));
                                                        int var43 = (arg6 << 7) + class92.method784(-119, 1023 & var39.method2216(-1), var39.method2214((byte) 127) & 1023, arg3);
                                                        int var44 = var42 >> 7;
                                                        int var45 = var43 >> 7;
                                                        if (~var44 <= -1 && var45 >= 0 && super.field3542 > var44 && ~super.field3528 < ~var45) {
                                                            var39.method835(var42, var43, 126, super.field3527[arg1][var44][var45] - var39.method2217(true));
                                                            class481.method2900(var37);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var14 = new class52(arg10);
                                }
                            }
                            if (var14 != null) {
                                class438.method2714(arg6 >> 3, (byte) -114, var14, arg0 >> 3);
                            }
                            if (!var13 && super.field3520 != null && super.field3520[arg8] != null) {
                                int var17 = arg0 + 7;
                                int var18 = arg6 + 7;
                                for (int var19 = arg0; var19 < var17; ++var19) {
                                    for (int var20 = arg6; var18 > var20; ++var20) {
                                        super.field3520[arg8][var19][var20] = 0;
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

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "([BILza;[Luh;BI)V", line = 2052)
    public final void method150(byte[] arg0, int arg1, class299 arg2, class407[] arg3, byte arg4, int arg5) {
        int var7 = -114 % ((arg4 - 27) / 61);
        ++field254;
        class194 var8 = new class194(arg0);
        int var9 = -1;
        while (true) {
            int var10 = var8.method1390(1905);
            if (var10 == 0) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var8.method1340(-41);
                if (~var12 == -1) {
                    break;
                }
                var11 += var12 + -1;
                int var13 = var11 & 63;
                int var14 = (4094 & var11) >> 6;
                int var15 = var11 >> 12;
                int var16 = var8.method1337((byte) 107);
                int var17 = var16 >> 2;
                int var18 = 3 & var16;
                int var19 = arg5 + var14;
                int var20 = arg1 + var13;
                if (~var19 < -1 && var20 > 0 && var19 < super.field3542 + -1 && super.field3528 - 1 > var20) {
                    class407 var21 = null;
                    if (!super.field3522) {
                        int var22 = var15;
                        if (~(2 & class229.field3460[1][var19][var20]) == -3) {
                            var22 = var15 - 1;
                        }
                        if (~var22 <= -1) {
                            var21 = arg3[var22];
                        }
                    }
                    this.method143(-1, false, var15, var19, var18, var9, var21, var17, var20, arg2, var15);
                }
            }
        }
    }
}
