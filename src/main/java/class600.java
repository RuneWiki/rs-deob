import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class600 extends class67 {

    @OriginalMember(owner = "client!gn", name = "K", descriptor = "I")
    public int field8645 = 99;

    @OriginalMember(owner = "client!gn", name = "L", descriptor = "Ldv;")
    public static class566 field8646 = new class566(16, 4);

    @OriginalMember(owner = "client!gn", name = "S", descriptor = "Lej;")
    public static class104 field8653 = new class104("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!gn", name = "T", descriptor = "Z")
    public static boolean field8654 = false;

    @OriginalMember(owner = "client!gn", name = "G", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!gn", name = "H", descriptor = "I")
    public static int field8642;

    @OriginalMember(owner = "client!gn", name = "I", descriptor = "I")
    public static int field8643;

    @OriginalMember(owner = "client!gn", name = "J", descriptor = "I")
    public static int field8644;

    @OriginalMember(owner = "client!gn", name = "M", descriptor = "I")
    public static int field8647;

    @OriginalMember(owner = "client!gn", name = "N", descriptor = "I")
    public static int field8648;

    @OriginalMember(owner = "client!gn", name = "O", descriptor = "I")
    public static int field8649;

    @OriginalMember(owner = "client!gn", name = "P", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!gn", name = "Q", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!gn", name = "R", descriptor = "I")
    public static int field8652;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gn", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field8655;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
    public static void method3531(int arg0) {
        field8646 = null;
        if (arg0 > 84) {
            field8653 = null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(IIIZ)V")
    public class600(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class141.field2191, class493.field6910);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BIILqa;Ldaa;[I)V")
    public final void method3532(byte arg0, int arg1, int arg2, class207 arg3, class11 arg4, int[] arg5) {
        ++field8650;
        if (!super.field1124) {
            boolean var7 = false;
            if (arg0 < 18) {
                field8653 = null;
            }
            class524 var8 = null;
            if (arg5 != null) {
                arg5[0] = -1;
            }
            while (true) {
                while (true) {
                    while (true) {
                        while (~arg4.field165 > ~arg4.field138.length) {
                            int var18 = arg4.method110((byte) 34);
                            if (var18 != 0) {
                                if (var18 != 1) {
                                    if (var18 == 2) {
                                        if (var8 == null) {
                                            var8 = new class524();
                                        }
                                        var8.method3021(arg4, -50);
                                    } else if (var18 == 128) {
                                        if (arg5 == null) {
                                            arg4.field165 += 10;
                                        } else {
                                            arg5[0] = arg4.method93((byte) 118);
                                            arg5[1] = arg4.method111(-128);
                                            arg5[2] = arg4.method111(-123);
                                            arg5[3] = arg4.method111(-125);
                                            arg5[4] = arg4.method93((byte) 82);
                                        }
                                    } else {
                                        if (var18 != 129) {
                                            throw new IllegalStateException("");
                                        }
                                        if (super.field1144 == null) {
                                            super.field1144 = new byte[4][][];
                                        }
                                        for (int var19 = 0; var19 < 4; ++var19) {
                                            byte var20 = arg4.method67(65280);
                                            if (~var20 == -1 && super.field1144[var19] != null) {
                                                int var21 = arg2;
                                                int var22 = arg2 - -64;
                                                int var23 = arg1;
                                                if (arg2 < 0) {
                                                    var21 = 0;
                                                } else if (arg2 >= super.field1117) {
                                                    var21 = super.field1117;
                                                }
                                                if (~arg1 <= -1) {
                                                    if (arg1 >= super.field1119) {
                                                        var23 = super.field1119;
                                                    }
                                                } else {
                                                    var23 = 0;
                                                }
                                                if (var22 < 0) {
                                                    var22 = 0;
                                                } else if (super.field1117 <= var22) {
                                                    var22 = super.field1117;
                                                }
                                                int var24 = arg1 + 64;
                                                if (~var24 > -1) {
                                                    var24 = 0;
                                                } else if (~super.field1119 >= ~var24) {
                                                    var24 = super.field1119;
                                                }
                                                while (~var22 < ~var21) {
                                                    while (~var23 > ~var24) {
                                                        super.field1144[var19][var21][var23] = 0;
                                                        ++var23;
                                                    }
                                                    ++var21;
                                                }
                                            } else if (~var20 != -2) {
                                                if (~var20 == -3) {
                                                    if (super.field1144[var19] == null) {
                                                        super.field1144[var19] = new byte[super.field1117 - -1][super.field1119 + 1];
                                                    }
                                                    if (var19 > 0) {
                                                        int var25 = arg2;
                                                        int var26 = arg2 - -64;
                                                        int var27 = arg1;
                                                        if (arg2 >= 0) {
                                                            if (~arg2 <= ~super.field1117) {
                                                                var25 = super.field1117;
                                                            }
                                                        } else {
                                                            var25 = 0;
                                                        }
                                                        if (~arg1 <= -1) {
                                                            if (super.field1119 <= arg1) {
                                                                var27 = super.field1119;
                                                            }
                                                        } else {
                                                            var27 = 0;
                                                        }
                                                        int var28 = arg1 + 64;
                                                        if (var26 < 0) {
                                                            var26 = 0;
                                                        } else if (var26 >= super.field1117) {
                                                            var26 = super.field1117;
                                                        }
                                                        if (~var28 <= -1) {
                                                            if (var28 >= super.field1119) {
                                                                var28 = super.field1119;
                                                            }
                                                        } else {
                                                            var28 = 0;
                                                        }
                                                        while (var26 > var25) {
                                                            while (~var28 < ~var27) {
                                                                super.field1144[var19][var25][var27] = super.field1144[var19 - 1][var25][var27];
                                                                ++var27;
                                                            }
                                                            ++var25;
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (super.field1144[var19] == null) {
                                                    super.field1144[var19] = new byte[super.field1117 + 1][super.field1119 + 1];
                                                }
                                                for (int var29 = 0; ~var29 > -65; var29 += 4) {
                                                    for (int var30 = 0; var30 < 64; var30 += 4) {
                                                        byte var31 = arg4.method67(65280);
                                                        for (int var32 = arg2 + var29; ~(arg2 - -4 + var29) < ~var32; ++var32) {
                                                            for (int var33 = arg1 + var30; var33 < var30 - -4 + arg1; ++var33) {
                                                                if (var32 >= 0 && ~super.field1117 < ~var32 && var33 >= 0 && ~super.field1119 < ~var33) {
                                                                    super.field1144[var19][var32][var33] = var31;
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
                                    int var34 = arg4.method110((byte) 56);
                                    if (var34 > 0) {
                                        for (int var35 = 0; ~var34 < ~var35; ++var35) {
                                            class579 var36 = new class579(arg3, arg4, 0);
                                            if (var36.field7965 == 31) {
                                                class376 var37 = class534.field7475.method2058(arg4.method93((byte) 125), 31);
                                                var36.method3317(var37.field5060, var37.field5061, var37.field5057, var37.field5063, -16161);
                                            }
                                            if (arg3.method1313() > 0) {
                                                class223 var38 = var36.field7959;
                                                int var39 = (arg2 << 7) + var38.method1434(7);
                                                int var40 = var38.method1429(4330) - -(arg1 << 7);
                                                int var41 = var39 >> 7;
                                                int var42 = var40 >> 7;
                                                if (var41 >= 0 && var42 >= 0 && var41 < super.field1117 && ~super.field1119 < ~var42) {
                                                    var38.method506(var39, var40, (byte) -115, super.field1128[var36.field7956][var41][var42] + -var38.method1431(106));
                                                    class312.method1947(var36);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var8 = new class524(arg4);
                            }
                        }
                        if (var8 != null) {
                            for (int var9 = 0; var9 < 8; ++var9) {
                                for (int var10 = 0; var10 < 8; ++var10) {
                                    int var11 = (arg2 >> 3) + var9;
                                    int var12 = (arg1 >> 3) + var10;
                                    if (var11 >= 0 && ~(super.field1117 >> 3) < ~var11 && var12 >= 0 && super.field1119 >> 3 > var12) {
                                        class297.method1897(var8, 1, var11, var12);
                                    }
                                }
                            }
                        }
                        if (!var7 && super.field1144 != null) {
                            for (int var13 = 0; ~var13 > -5; ++var13) {
                                if (super.field1144[var13] != null) {
                                    for (int var14 = 0; var14 < 16; ++var14) {
                                        for (int var15 = 0; var15 < 16; ++var15) {
                                            int var16 = (arg2 >> 2) - -var14;
                                            int var17 = (arg1 >> 2) - -var15;
                                            if (~var16 <= -1 && ~var16 > -27 && ~var17 <= -1 && ~var17 > -27) {
                                                super.field1144[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ldaa;IIIIII[IILqa;I)V")
    public final void method3533(class11 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, class207 arg9, int arg10) {
        ++field8644;
        if (arg5 != -13196) {
            this.method3539((class207) null, (byte) 40);
        }
        if (!super.field1124) {
            boolean var12 = false;
            class524 var13 = null;
            if (arg7 != null) {
                arg7[0] = -1;
            }
            int var14 = (arg3 & 7) * 8;
            int var15 = (7 & arg10) * 8;
            while (true) {
                while (~arg0.field138.length < ~arg0.field165) {
                    int var20 = arg0.method110((byte) 67);
                    if (var20 == 0) {
                        var13 = new class524(arg0);
                    } else if (var20 == 1) {
                        int var34 = arg0.method110((byte) 43);
                        if (~var34 < -1) {
                            for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                class579 var36 = new class579(arg9, arg0, 0);
                                if (~var36.field7965 == -32) {
                                    class376 var37 = class534.field7475.method2058(arg0.method93((byte) 91), arg5 ^ -13205);
                                    var36.method3317(var37.field5060, var37.field5061, var37.field5057, var37.field5063, -16161);
                                }
                                if (~arg9.method1313() < -1) {
                                    class223 var38 = var36.field7959;
                                    int var39 = var38.method1434(arg5 + 13203) >> 7;
                                    int var40 = var38.method1429(arg5 ^ -9058) >> 7;
                                    if (var36.field7956 == arg8 && ~var39 <= ~var14 && ~(var14 + 8) < ~var39 && ~var15 >= ~var40 && ~(var15 - -8) < ~var40) {
                                        int var41 = class487.method2833(var38.method1434(arg5 ^ -13197) & 1023, (byte) 84, arg6, var38.method1429(4330) & 1023) + (arg1 << 7);
                                        int var42 = var41 >> 7;
                                        int var43 = class21.method243(1023 & var38.method1434(7), 1023 & var38.method1429(arg5 + 17526), arg5 + 10156, arg6) + (arg4 << 7);
                                        int var44 = var43 >> 7;
                                        if (~var42 <= -1 && ~var44 <= -1 && ~super.field1117 < ~var42 && super.field1119 > var44) {
                                            var38.method506(var41, var43, (byte) -115, super.field1128[arg8][var42][var44] + -var38.method1431(126));
                                            class312.method1947(var36);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2) {
                        if (var13 == null) {
                            var13 = new class524();
                        }
                        var13.method3021(arg0, arg5 ^ 13242);
                    } else if (var20 == 128) {
                        if (arg7 == null) {
                            arg0.field165 += 10;
                        } else {
                            arg7[0] = arg0.method93((byte) 121);
                            arg7[1] = arg0.method111(-126);
                            arg7[2] = arg0.method111(-124);
                            arg7[3] = arg0.method111(-120);
                            arg7[4] = arg0.method93((byte) 76);
                        }
                    } else {
                        if (var20 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field1144 == null) {
                            super.field1144 = new byte[4][][];
                        }
                        for (int var21 = 0; var21 < 4; ++var21) {
                            byte var22 = arg0.method67(65280);
                            if (var22 == 0 && super.field1144[arg2] != null) {
                                if (arg8 >= var21) {
                                    int var23 = arg1;
                                    int var24 = arg1 + 7;
                                    int var25 = arg4;
                                    int var26 = arg4 + 7;
                                    if (~arg4 > -1) {
                                        var25 = 0;
                                    } else if (super.field1119 <= arg4) {
                                        var25 = super.field1119;
                                    }
                                    if (arg1 < 0) {
                                        var23 = 0;
                                    } else if (~arg1 <= ~super.field1117) {
                                        var23 = super.field1117;
                                    }
                                    if (var24 >= 0) {
                                        if (~super.field1117 >= ~var24) {
                                            var24 = super.field1117;
                                        }
                                    } else {
                                        var24 = 0;
                                    }
                                    if (var26 >= 0) {
                                        if (~var26 <= ~super.field1119) {
                                            var26 = super.field1119;
                                        }
                                    } else {
                                        var26 = 0;
                                    }
                                    while (var23 < var24) {
                                        while (var25 < var26) {
                                            super.field1144[arg2][var23][var25] = 0;
                                            ++var25;
                                        }
                                        ++var23;
                                    }
                                }
                            } else if (~var22 == -2) {
                                if (super.field1144[arg2] == null) {
                                    super.field1144[arg2] = new byte[super.field1117 + 1][super.field1119 - -1];
                                }
                                for (int var27 = 0; ~var27 > -65; var27 += 4) {
                                    for (int var28 = 0; var28 < 64; var28 += 4) {
                                        byte var29 = arg0.method67(65280);
                                        if (~arg8 <= ~var21) {
                                            for (int var30 = var27; ~(var27 + 4) < ~var30; ++var30) {
                                                for (int var31 = var28; ~var31 > ~(var28 + 4); ++var31) {
                                                    if (var30 >= var14 && ~(var14 + 8) < ~var30 && ~var31 <= ~var15 && ~var15 > ~(var15 + 8)) {
                                                        int var32 = arg1 - -class62.method536(var30 & 7, arg5 + 13322, arg6, var31 & 7);
                                                        int var33 = arg4 - -class29.method312(arg6, var31 & 7, -120, 7 & var30);
                                                        if (var32 >= 0 && ~var32 > ~super.field1117 && var33 >= 0 && ~var33 > ~super.field1119) {
                                                            super.field1144[arg2][var32][var33] = var29;
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
                    class297.method1897(var13, 1, arg1 >> 3, arg4 >> 3);
                }
                if (!var12 && super.field1144 != null && super.field1144[arg2] != null) {
                    int var16 = arg1 + 7;
                    int var17 = arg4 + 7;
                    for (int var18 = arg1; var18 < var16; ++var18) {
                        for (int var19 = arg4; var19 < var17; ++var19) {
                            super.field1144[arg2][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lqa;IILld;IIIIIII)V")
    public final void method3534(class207 arg0, int arg1, int arg2, class145 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field8647;
        if (class491.field6875.method2608(class103.field1570, (byte) -109) || class454.method2667(arg7, true, class67.field1116, arg9, arg5)) {
            if (~this.field8645 < ~arg1) {
                this.field8645 = arg1;
            }
            class364 var12 = class18.field227.method1201((byte) -114, arg8);
            if (!arg0.method1305() || !class491.field6875.field3361 || !var12.field4916) {
                int var13;
                int var14;
                if (~arg2 != -2 && arg2 != 3) {
                    var13 = var12.field4910;
                    var14 = var12.field4926;
                } else {
                    var14 = var12.field4910;
                    var13 = var12.field4926;
                }
                int var15;
                int var16;
                if (~super.field1117 <= ~(arg7 + var13)) {
                    var15 = (var13 >> 1) + arg7;
                    var16 = arg7 - -(var13 + 1 >> 1);
                } else {
                    var16 = arg7 + 1;
                    var15 = arg7;
                }
                if (arg6 != 24486) {
                    this.method3532((byte) 54, -107, -13, (class207) null, (class11) null, (int[]) null);
                }
                int var17;
                int var18;
                if (~(arg9 - -var14) < ~super.field1119) {
                    var17 = arg9;
                    var18 = arg9 - -1;
                } else {
                    var17 = (var14 >> 1) + arg9;
                    var18 = arg9 - -(var14 + 1 >> 1);
                }
                class174 var19 = class590.field8430[arg5];
                int var20 = var19.method1104(var15, var17) + (var19.method1104(var16, var17) + var19.method1104(var15, var18) - -var19.method1104(var16, var18)) >> 2;
                int var21 = (arg7 << 7) + (var13 << 6);
                int var22 = (arg9 << 7) + (var14 << 6);
                boolean var23 = class472.field6626 && !super.field1124 && var12.field4875;
                if (var12.method2175(false)) {
                    class434.method2578((class188) null, arg7, arg2, (class109) null, arg1, arg9, 279765095, var12);
                }
                boolean var24 = arg4 == -1 && ~var12.field4901 == 0 && var12.field4932 == null && var12.field4904 == null && !var12.field4873;
                if (!class566.field7827 || (!class360.method2158(arg10, (byte) -97) || ~var12.field4939 == -2) && (!class501.method2907((byte) 107, arg10) || var12.field4939 != 0)) {
                    if (~arg10 == -23) {
                        if (class491.field6875.field3367 || var12.field4881 != 0 || var12.field4893 == 1 || var12.field4902) {
                            class197 var26;
                            if (var24) {
                                class218 var25 = new class218(arg0, var12, arg5, var21, var20, var22, super.field1124, arg2, var23);
                                if (var25.method747(-23611)) {
                                    var25.method746((byte) -107, arg0);
                                }
                                var26 = var25;
                            } else {
                                var26 = new class217(arg0, var12, arg1, arg5, var21, var20, var22, super.field1124, arg2, arg4);
                            }
                            class197 var27 = class404.method2411(arg1, arg7, arg9);
                            if (!(var27 instanceof class469)) {
                                class112.method782(arg1, arg7, arg9, var26);
                            } else {
                                ((class469) var27).field6602 = var26;
                            }
                            if (~var12.field4893 == -2 && arg3 != null) {
                                arg3.method968(arg9, arg6 + -24484, arg7);
                            }
                        }
                    } else if (arg10 != 10 && ~arg10 != -12) {
                        if (~arg10 <= -13 && arg10 <= 17 || arg10 >= 18 && arg10 <= 21) {
                            class425 var29;
                            if (var24) {
                                class602 var28 = new class602(arg0, var12, arg1, arg5, var21, var20, var22, super.field1124, arg7, arg7 - -var13 - 1, arg9, arg9 - -var14 + -1, arg10, arg2, var23);
                                if (var28.method747(arg6 ^ -925)) {
                                    var28.method746((byte) -87, arg0);
                                }
                                var29 = var28;
                            } else {
                                var29 = new class473(arg0, var12, arg1, arg5, var21, var20, var22, super.field1124, arg7, arg7 + var13 + -1, arg9, arg9 - -var14 + -1, arg10, arg2, arg4);
                            }
                            class425 var30 = class582.method3324(arg1, arg7, arg9, field8655 != null ? field8655 : (field8655 = method3542("wf")));
                            if (var30 instanceof class130 && ~var30.field6036 == ~arg7 && var30.field6028 == arg9) {
                                ((class130) var30).field2073 = var29;
                            } else {
                                class108.method761(var29, false);
                            }
                            if (class472.field6626 && !super.field1124 && arg10 >= 12 && arg10 <= 17 && arg10 != 13 && arg1 > 0 && ~var12.field4939 != -1) {
                                super.field1131[arg1][arg7][arg9] = (byte) class73.method578(super.field1131[arg1][arg7][arg9], 4);
                            }
                            if (~var12.field4893 != -1 && arg3 != null) {
                                arg3.method954(var12.field4946, !var12.field4929, arg9, var14, var13, arg7, 101);
                            }
                        } else if (~arg10 == -1) {
                            int var31 = var12.field4939;
                            if (class35.field657 && ~var12.field4939 == 0) {
                                var31 = 1;
                            }
                            class344 var32;
                            if (!var24) {
                                var32 = new class106(arg0, var12, arg1, arg5, var21, var20, var22, super.field1124, arg10, arg2, arg4);
                            } else {
                                class397 var33 = new class397(arg0, var12, arg5, var21, var20, var22, super.field1124, arg10, arg2, var23);
                                var32 = var33;
                                if (var33.method747(-23611)) {
                                    var33.method746((byte) -119, arg0);
                                }
                            }
                            class344 var34 = class265.method1739(arg1, arg7, arg9);
                            if (!(var34 instanceof class214)) {
                                class444.method2628(arg1, arg7, arg9, var32, (class344) null);
                            } else {
                                ((class214) var34).field3030 = var32;
                            }
                            if (class472.field6626) {
                                if (~arg2 != -1) {
                                    if (~arg2 != -2) {
                                        if (~arg2 != -3) {
                                            if (~arg2 == -4) {
                                                if (var12.field4930) {
                                                    var19.method1097(arg7, arg9, 50);
                                                    var19.method1097(arg7 - -1, arg9, 50);
                                                }
                                                if (~var31 == -2 && !super.field1124) {
                                                    super.field1131[arg1][arg7][arg9] = (byte) class73.method578(super.field1131[arg1][arg7][arg9], 2);
                                                }
                                            }
                                        } else {
                                            if (var12.field4930) {
                                                var19.method1097(arg7 + 1, arg9, 50);
                                                var19.method1097(arg7 + 1, arg9 + 1, 50);
                                            }
                                            if (var31 == 1 && !super.field1124) {
                                                super.field1131[arg1][arg7 - -1][arg9] = (byte) class73.method578(super.field1131[arg1][arg7 - -1][arg9], 1);
                                            }
                                        }
                                    } else {
                                        if (var12.field4930) {
                                            var19.method1097(arg7, arg9 + 1, 50);
                                            var19.method1097(arg7 + 1, arg9 - -1, 50);
                                        }
                                        if (var31 == 1 && !super.field1124) {
                                            super.field1131[arg1][arg7][arg9 + 1] = (byte) class73.method578(super.field1131[arg1][arg7][arg9 + 1], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field4930) {
                                        var19.method1097(arg7, arg9, 50);
                                        var19.method1097(arg7, arg9 + 1, 50);
                                    }
                                    if (var31 == 1 && !super.field1124) {
                                        super.field1131[arg1][arg7][arg9] = (byte) class73.method578(super.field1131[arg1][arg7][arg9], 1);
                                    }
                                }
                            }
                            if (~var12.field4893 != -1 && arg3 != null) {
                                arg3.method960(arg9, var12.field4946, false, !var12.field4929, arg2, arg7, arg10);
                            }
                            if (var12.field4938 != 16) {
                                class35.method352(arg1, arg7, arg9, var12.field4938);
                            }
                        } else if (~arg10 == -2) {
                            class344 var36;
                            if (var24) {
                                class397 var35 = new class397(arg0, var12, arg5, var21, var20, var22, super.field1124, arg10, arg2, var23);
                                if (var35.method747(-23611)) {
                                    var35.method746((byte) -99, arg0);
                                }
                                var36 = var35;
                            } else {
                                var36 = new class106(arg0, var12, arg1, arg5, var21, var20, var22, super.field1124, arg10, arg2, arg4);
                            }
                            class344 var37 = class265.method1739(arg1, arg7, arg9);
                            if (var37 instanceof class214) {
                                ((class214) var37).field3030 = var36;
                            } else {
                                class444.method2628(arg1, arg7, arg9, var36, (class344) null);
                            }
                            if (var12.field4930 && class472.field6626) {
                                if (~arg2 == -1) {
                                    var19.method1097(arg7, arg9 - -1, 50);
                                } else if (arg2 == 1) {
                                    var19.method1097(arg7 + 1, arg9 + 1, 50);
                                } else if (~arg2 != -3) {
                                    if (arg2 == 3) {
                                        var19.method1097(arg7, arg9, 50);
                                    }
                                } else {
                                    var19.method1097(arg7 + 1, arg9, 50);
                                }
                            }
                            if (var12.field4893 != 0 && arg3 != null) {
                                arg3.method960(arg9, var12.field4946, false, !var12.field4929, arg2, arg7, arg10);
                            }
                        } else if (arg10 == 2) {
                            int var38 = 3 & arg2 + 1;
                            class344 var39;
                            class344 var40;
                            if (!var24) {
                                var39 = new class106(arg0, var12, arg1, arg5, var21, var20, var22, super.field1124, arg10, arg2 + 4, arg4);
                                var40 = new class106(arg0, var12, arg1, arg5, var21, var20, var22, super.field1124, arg10, var38, arg4);
                            } else {
                                class397 var41 = new class397(arg0, var12, arg5, var21, var20, var22, super.field1124, arg10, arg2 - -4, var23);
                                class397 var42 = new class397(arg0, var12, arg5, var21, var20, var22, super.field1124, arg10, var38, var23);
                                if (var41.method747(arg6 + -48097)) {
                                    var41.method746((byte) -100, arg0);
                                }
                                var39 = var41;
                                var40 = var42;
                                if (var42.method747(-23611)) {
                                    var42.method746((byte) -60, arg0);
                                }
                            }
                            class444.method2628(arg1, arg7, arg9, var39, var40);
                            if (~var12.field4939 == -2 && class472.field6626 && !super.field1124) {
                                if (arg2 != 0) {
                                    if (~arg2 != -2) {
                                        if (~arg2 != -3) {
                                            if (~arg2 == -4) {
                                                super.field1131[arg1][arg7][arg9] = (byte) class73.method578(super.field1131[arg1][arg7][arg9], 2);
                                                super.field1131[arg1][arg7][arg9] = (byte) class73.method578(super.field1131[arg1][arg7][arg9], 1);
                                            }
                                        } else {
                                            super.field1131[arg1][arg7 - -1][arg9] = (byte) class73.method578(super.field1131[arg1][arg7 - -1][arg9], 1);
                                            super.field1131[arg1][arg7][arg9] = (byte) class73.method578(super.field1131[arg1][arg7][arg9], 2);
                                        }
                                    } else {
                                        super.field1131[arg1][arg7][arg9 + 1] = (byte) class73.method578(super.field1131[arg1][arg7][arg9 + 1], 2);
                                        super.field1131[arg1][arg7 + 1][arg9] = (byte) class73.method578(super.field1131[arg1][arg7 + 1][arg9], 1);
                                    }
                                } else {
                                    super.field1131[arg1][arg7][arg9] = (byte) class73.method578(super.field1131[arg1][arg7][arg9], 1);
                                    super.field1131[arg1][arg7][arg9 - -1] = (byte) class73.method578(super.field1131[arg1][arg7][arg9 - -1], 2);
                                }
                            }
                            if (~var12.field4893 != -1 && arg3 != null) {
                                arg3.method960(arg9, var12.field4946, false, !var12.field4929, arg2, arg7, arg10);
                            }
                            if (var12.field4938 != 16) {
                                class35.method352(arg1, arg7, arg9, var12.field4938);
                            }
                        } else if (arg10 == 3) {
                            class344 var44;
                            if (var24) {
                                class397 var43 = new class397(arg0, var12, arg5, var21, var20, var22, super.field1124, arg10, arg2, var23);
                                if (var43.method747(arg6 + -48097)) {
                                    var43.method746((byte) -124, arg0);
                                }
                                var44 = var43;
                            } else {
                                var44 = new class106(arg0, var12, arg1, arg5, var21, var20, var22, super.field1124, arg10, arg2, arg4);
                            }
                            class344 var45 = class265.method1739(arg1, arg7, arg9);
                            if (var45 instanceof class214) {
                                ((class214) var45).field3030 = var44;
                            } else {
                                class444.method2628(arg1, arg7, arg9, var44, (class344) null);
                            }
                            if (var12.field4930 && class472.field6626) {
                                if (~arg2 != -1) {
                                    if (~arg2 != -2) {
                                        if (arg2 != 2) {
                                            if (arg2 == 3) {
                                                var19.method1097(arg7, arg9, 50);
                                            }
                                        } else {
                                            var19.method1097(arg7 + 1, arg9, 50);
                                        }
                                    } else {
                                        var19.method1097(arg7 + 1, arg9 + 1, 50);
                                    }
                                } else {
                                    var19.method1097(arg7, arg9 + 1, 50);
                                }
                            }
                            if (~var12.field4893 != -1 && arg3 != null) {
                                arg3.method960(arg9, var12.field4946, false, !var12.field4929, arg2, arg7, arg10);
                            }
                        } else if (arg10 == 9) {
                            class425 var46;
                            if (!var24) {
                                var46 = new class473(arg0, var12, arg1, arg5, var21, var20, var22, super.field1124, arg7, arg7 + var13 + -1, arg9, var14 + -1 + arg9, arg10, arg2, arg4);
                            } else {
                                class602 var47 = new class602(arg0, var12, arg1, arg5, var21, var20, var22, super.field1124, arg7, arg7, arg9, arg9, arg10, arg2, var23);
                                if (var47.method747(arg6 + -48097)) {
                                    var47.method746((byte) -117, arg0);
                                }
                                var46 = var47;
                            }
                            class425 var48 = class582.method3324(arg1, arg7, arg9, field8655 != null ? field8655 : (field8655 = method3542("wf")));
                            if (var48 instanceof class130 && var48.field6036 == arg7 && var48.field6028 == arg9) {
                                ((class130) var48).field2073 = var46;
                            } else {
                                class108.method761(var46, false);
                            }
                            if (~var12.field4893 != -1 && arg3 != null) {
                                arg3.method954(var12.field4946, !var12.field4929, arg9, var14, var13, arg7, -91);
                            }
                            if (~var12.field4938 != -17) {
                                class35.method352(arg1, arg7, arg9, var12.field4938);
                            }
                        } else if (~arg10 == -5) {
                            class23 var50;
                            if (var24) {
                                class332 var49 = new class332(arg0, var12, arg5, var21, var20, var22, super.field1124, 0, 0, 0, arg10, arg2);
                                var50 = var49;
                                if (var49.method747(-23611)) {
                                    var49.method746((byte) -102, arg0);
                                }
                            } else {
                                var50 = new class386(arg0, var12, arg1, arg5, var21, var20, var22, super.field1124, 0, 0, 0, arg10, arg2, arg4);
                            }
                            class23 var51 = class548.method3127(arg1, arg7, arg9);
                            if (var51 instanceof class191) {
                                ((class191) var51).field2703 = var50;
                            } else {
                                method3540(arg1, arg7, arg9, var50, (class23) null);
                            }
                        } else if (~arg10 == -6) {
                            int var52 = 17;
                            class115 var53 = (class115) class265.method1739(arg1, arg7, arg9);
                            if (var53 != null) {
                                var52 = class18.field227.method1201((byte) 71, var53.method748(false)).field4938 - -1;
                            }
                            class23 var55;
                            if (var24) {
                                class332 var54 = new class332(arg0, var12, arg5, var21, var20, var22, super.field1124, 0, class476.field6701[arg2] * var52, class323.field4360[arg2] * var52, arg10, arg2);
                                var55 = var54;
                                if (var54.method747(-23611)) {
                                    var54.method746((byte) -54, arg0);
                                }
                            } else {
                                var55 = new class386(arg0, var12, arg1, arg5, var21, var20, var22, super.field1124, 0, class476.field6701[arg2] * var52, class323.field4360[arg2] * var52, arg10, arg2, arg4);
                            }
                            class23 var56 = class548.method3127(arg1, arg7, arg9);
                            if (var56 instanceof class191) {
                                ((class191) var56).field2703 = var55;
                            } else {
                                method3540(arg1, arg7, arg9, var55, (class23) null);
                            }
                        } else if (~arg10 == -7) {
                            int var57 = 9;
                            class115 var58 = (class115) class265.method1739(arg1, arg7, arg9);
                            if (var58 != null) {
                                var57 = 1 + class18.field227.method1201((byte) 111, var58.method748(false)).field4938 / 2;
                            }
                            class23 var60;
                            if (var24) {
                                class332 var59 = new class332(arg0, var12, arg5, var21, var20, var22, super.field1124, arg2, class476.field6701[arg2] * var57, class323.field4360[arg2] * var57, arg10, arg2 - -4);
                                var60 = var59;
                                if (var59.method747(arg6 ^ -925)) {
                                    var59.method746((byte) -85, arg0);
                                }
                            } else {
                                var60 = new class386(arg0, var12, arg1, arg5, var21, var20, var22, super.field1124, arg2, class180.field2560[arg2] * var57, class403.field5731[arg2] * var57, arg10, arg2 + 4, arg4);
                            }
                            class23 var61 = class548.method3127(arg1, arg7, arg9);
                            if (!(var61 instanceof class191)) {
                                method3540(arg1, arg7, arg9, var60, (class23) null);
                            } else {
                                ((class191) var61).field2703 = var60;
                            }
                        } else if (~arg10 == -8) {
                            int var62 = arg2 + 2 & 3;
                            class23 var63;
                            if (!var24) {
                                var63 = new class386(arg0, var12, arg1, arg5, var21, var20, var22, super.field1124, var62, 0, 0, arg10, var62 + 4, arg4);
                            } else {
                                class332 var64 = new class332(arg0, var12, arg5, var21, var20, var22, super.field1124, var62, 0, 0, arg10, var62 - -4);
                                if (var64.method747(arg6 + -48097)) {
                                    var64.method746((byte) -100, arg0);
                                }
                                var63 = var64;
                            }
                            class23 var65 = class548.method3127(arg1, arg7, arg9);
                            if (var65 instanceof class191) {
                                ((class191) var65).field2703 = var63;
                            } else {
                                method3540(arg1, arg7, arg9, var63, (class23) null);
                            }
                        } else if (arg10 == 8) {
                            int var66 = 3 & arg2 - -2;
                            int var67 = 9;
                            class115 var68 = (class115) class265.method1739(arg1, arg7, arg9);
                            if (var68 != null) {
                                var67 = 1 + class18.field227.method1201((byte) -107, var68.method748(false)).field4938 / 2;
                            }
                            class23 var71;
                            class23 var72;
                            if (!var24) {
                                class386 var69 = new class386(arg0, var12, arg1, arg5, var21, var20, var22, super.field1124, arg2, class180.field2560[arg2] * var67, class403.field5731[arg2] * var67, arg10, arg2 + 4, arg4);
                                class386 var70 = new class386(arg0, var12, arg1, arg5, var21, var20, var22, super.field1124, arg2, 0, 0, arg10, var66 - -4, arg4);
                                var71 = var69;
                                var72 = var70;
                            } else {
                                class332 var73 = new class332(arg0, var12, arg5, var21, var20, var22, super.field1124, arg2, class180.field2560[arg2] * var67, class403.field5731[arg2] * var67, arg10, arg2 + 4);
                                class332 var74 = new class332(arg0, var12, arg5, var21, var20, var22, super.field1124, arg2, 0, 0, arg10, var66 + 4);
                                if (var73.method747(arg6 ^ -925)) {
                                    var73.method746((byte) -95, arg0);
                                }
                                var71 = var73;
                                var72 = var74;
                                if (var74.method747(-23611)) {
                                    var74.method746((byte) -81, arg0);
                                }
                            }
                            method3540(arg1, arg7, arg9, var71, var72);
                        }
                    } else {
                        class602 var75 = null;
                        int var76;
                        class425 var77;
                        if (!var24) {
                            var76 = 15;
                            var77 = new class473(arg0, var12, arg1, arg5, var21, var20, var22, super.field1124, arg7, arg7 - -var13 + -1, arg9, arg9 - (-var14 - -1), arg10, arg2, arg4);
                        } else {
                            class602 var78 = new class602(arg0, var12, arg1, arg5, var21, var20, var22, super.field1124, arg7, arg7 - -var13 + -1, arg9, arg9 - -var14 + -1, arg10, arg2, var23);
                            var77 = var78;
                            var76 = var78.method3549(52);
                            var75 = var78;
                        }
                        class425 var79 = class582.method3324(arg1, arg7, arg9, field8655 != null ? field8655 : (field8655 = method3542("wf")));
                        boolean var80 = false;
                        if (var79 instanceof class130 && ~var79.field6036 == ~arg7 && ~var79.field6028 == ~arg9) {
                            var80 = true;
                            ((class130) var79).field2073 = var77;
                        }
                        if (var80 || class108.method761(var77, false)) {
                            if (var75 != null && var75.method747(-23611)) {
                                var75.method746((byte) -95, arg0);
                            }
                            if (var12.field4930 && class472.field6626) {
                                if (var76 > 30) {
                                    var76 = 30;
                                }
                                for (int var81 = 0; var13 >= var81; ++var81) {
                                    for (int var82 = 0; var14 >= var82; ++var82) {
                                        var19.method1097(arg7 + var81, arg9 + var82, var76);
                                    }
                                }
                            }
                        }
                        if (~var12.field4893 != -1 && arg3 != null) {
                            arg3.method954(var12.field4946, !var12.field4929, arg9, var14, var13, arg7, 96);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([Lld;BLqa;II[B)V")
    public final void method3535(class145[] arg0, byte arg1, class207 arg2, int arg3, int arg4, byte[] arg5) {
        ++field8643;
        if (arg1 != -31) {
            field8653 = null;
        }
        class11 var7 = new class11(arg5);
        int var8 = -1;
        while (true) {
            int var9 = var7.method82(-97);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method112(-8838);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = 63 & var10;
                int var13 = var10 >> 6 & 63;
                int var14 = var10 >> 12;
                int var15 = var7.method110((byte) 124);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = arg3 + var13;
                int var19 = arg4 + var12;
                if (var18 > 0 && var19 > 0 && ~(super.field1117 + -1) < ~var18 && super.field1119 + -1 > var19) {
                    class145 var20 = null;
                    if (!super.field1124) {
                        int var21 = var14;
                        if ((class80.field1299[1][var18][var19] & 2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg0[var21];
                        }
                    }
                    this.method3534(arg2, var14, var17, var20, -1, var14, arg1 + 24517, var18, var8, var19, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILqa;ILld;II)V")
    public final void method3536(int arg0, int arg1, class207 arg2, int arg3, class145 arg4, int arg5, int arg6) {
        ++field8648;
        class115 var8 = null;
        if (~arg3 == -1) {
            var8 = (class115) class265.method1739(arg5, arg6, arg1);
        }
        if (arg3 == 1) {
            var8 = (class115) class548.method3127(arg5, arg6, arg1);
        }
        if (arg3 == 2) {
            var8 = (class115) class582.method3324(arg5, arg6, arg1, field8655 != null ? field8655 : (field8655 = method3542("wf")));
        }
        if (~arg3 == -4) {
            var8 = (class115) class404.method2411(arg5, arg6, arg1);
        }
        if (arg0 != 28677) {
            method3540(115, 12, 122, (class23) null, (class23) null);
        }
        if (var8 != null) {
            class364 var9 = class18.field227.method1201((byte) 85, var8.method748(false));
            int var10 = var8.method752(true);
            int var11 = var8.method749(24194);
            if (var9.method2175(false)) {
                class496.method2871(arg0 + -28750, arg6, arg5, arg1, var9);
            }
            if (var8.method747(arg0 + -52288)) {
                var8.method751(-91, arg2);
            }
            if (arg3 != 0) {
                if (~arg3 != -2) {
                    if (~arg3 == -3) {
                        class425 var12 = class582.method3324(arg5, arg6, arg1, field8655 != null ? field8655 : (field8655 = method3542("wf")));
                        if (var12 instanceof class130 && var12.field6036 == arg6 && ~var12.field6028 == ~arg1) {
                            ((class130) var12).field2073 = null;
                        } else {
                            class78.method605(arg5, arg6, arg1, field8655 != null ? field8655 : (field8655 = method3542("wf")));
                        }
                        if (~var9.field4893 != -1 && ~super.field1117 < ~(var9.field4910 + arg6) && super.field1119 > var9.field4910 + arg1 && ~super.field1117 < ~(var9.field4926 + arg6) && ~(arg1 - -var9.field4926) > ~super.field1119) {
                            arg4.method955(var9.field4946, false, var11, arg6, var9.field4910, !var9.field4929, arg1, var9.field4926);
                            return;
                        }
                        return;
                    }
                    if (arg3 == 3) {
                        class197 var13 = class404.method2411(arg5, arg6, arg1);
                        if (var13 instanceof class469) {
                            ((class469) var13).field6602 = null;
                        } else {
                            class194.method1208(arg5, arg6, arg1);
                        }
                        if (~var9.field4893 == -2) {
                            arg4.method964(-262145, arg1, arg6);
                            return;
                        }
                    }
                } else {
                    class23 var14 = class548.method3127(arg5, arg6, arg1);
                    if (var14 instanceof class191) {
                        ((class191) var14).field2703 = null;
                        return;
                    }
                    class133.method901(arg5, arg6, arg1);
                }
                return;
            }
            class344 var15 = class265.method1739(arg5, arg6, arg1);
            if (var15 instanceof class214) {
                ((class214) var15).field3030 = null;
            } else {
                class431.method2562(arg5, arg6, arg1);
            }
            if (var9.field4893 != 0) {
                arg4.method966(!var9.field4929, var9.field4946, arg1, var11, var10, arg6, true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILmc;)Ljava/lang/String;")
    public static final String method3537(int arg0, int arg1, class114 arg2) {
        ++field8641;
        if (arg1 != 0) {
            return null;
        } else if (!client.method1534(arg2).method2894(arg0, (byte) 111) && arg2.field1821 == null) {
            return null;
        } else if (arg2.field1795 != null && ~arg0 > ~arg2.field1795.length && arg2.field1795[arg0] != null && arg2.field1795[arg0].trim().length() != 0) {
            return arg2.field1795[arg0];
        } else {
            return class168.field2427 ? "Hidden-" + arg0 : null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lan;BLn;)V")
    public static final void method3538(class21 arg0, byte arg1, class17 arg2) {
        if (arg1 != 74) {
            field8654 = true;
        }
        class58.field1057 = arg2;
        ++field8652;
        class442.field6300 = arg0;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lqa;B)V")
    public final void method3539(class207 arg0, byte arg1) {
        if (arg1 != -86) {
            method3538((class21) null, (byte) 42, (class17) null);
        }
        ++field8651;
        class274.method1769(arg0);
        if (super.field1142 > 1) {
            for (int var3 = 0; super.field1117 > var3; ++var3) {
                for (int var4 = 0; ~var4 > ~super.field1119; ++var4) {
                    if ((2 & class80.field1299[1][var3][var4]) == 2) {
                        class213.method1394(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; super.field1142 > var5; ++var5) {
            for (int var6 = 0; super.field1119 >= var6; ++var6) {
                for (int var7 = 0; ~var7 >= ~super.field1117; ++var7) {
                    if (~(super.field1131[var5][var7][var6] & 1) != -1) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        int var11 = var5;
                        while (var9 < super.field1119 && ~(1 & super.field1131[var5][var7][var9 + 1]) != -1) {
                            ++var9;
                        }
                        while (var8 > 0 && (1 & super.field1131[var5][var7][var8 + -1]) != 0) {
                            --var8;
                        }
                        label170: while (~var10 < -1) {
                            for (int var12 = var8; ~var9 <= ~var12; ++var12) {
                                if (~(super.field1131[var10 - 1][var7][var12] & 1) == -1) {
                                    break label170;
                                }
                            }
                            --var10;
                        }
                        label159: while (~var11 > -4) {
                            for (int var13 = var8; var9 >= var13; ++var13) {
                                if ((super.field1131[var11 + 1][var7][var13] & 1) == 0) {
                                    break label159;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (-var8 + var9 - -1) * (-var10 + 1 + var11);
                        if (~var14 <= -3) {
                            short var15 = 240;
                            int var16 = super.field1128[var11][var7][var8] + -var15;
                            int var17 = super.field1128[var10][var7][var8];
                            class422.method2518(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) + 128, var16, var17);
                            for (int var18 = var10; ~var18 >= ~var11; ++var18) {
                                for (int var19 = var8; ~var19 >= ~var9; ++var19) {
                                    super.field1131[var18][var7][var19] = (byte) class589.method3454(super.field1131[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if (~(2 & super.field1131[var5][var7][var6]) != -1) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (~var20 < -1 && (2 & super.field1131[var5][var20 - 1][var6]) != 0) {
                            --var20;
                        }
                        while (var21 < super.field1117 && ~(2 & super.field1131[var5][var21 - -1][var6]) != -1) {
                            ++var21;
                        }
                        int var23 = var5;
                        label223: while (var22 > 0) {
                            for (int var24 = var20; var21 >= var24; ++var24) {
                                if ((2 & super.field1131[var22 + -1][var24][var6]) == 0) {
                                    break label223;
                                }
                            }
                            --var22;
                        }
                        label212: while (~var23 > -4) {
                            for (int var25 = var20; var25 <= var21; ++var25) {
                                if ((2 & super.field1131[var23 - -1][var25][var6]) == 0) {
                                    break label212;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (-var20 + var21 + 1) * (-var22 + 1 + var23);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = super.field1128[var23][var20][var6] + -var27;
                            int var29 = super.field1128[var22][var20][var6];
                            class422.method2518(2, var20 << 7, (var21 << 7) - -128, var6 << 7, var6 << 7, var28, var29);
                            for (int var30 = var22; ~var23 <= ~var30; ++var30) {
                                for (int var31 = var20; ~var21 <= ~var31; ++var31) {
                                    super.field1131[var30][var31][var6] = (byte) class589.method3454(super.field1131[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((super.field1131[var5][var7][var6] & 4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34;
                        for (var34 = var6; ~var34 < -1 && ~(4 & super.field1131[var5][var7][var34 + -1]) != -1; --var34) {
                        }
                        int var35;
                        for (var35 = var6; var35 < super.field1119 && ~(super.field1131[var5][var7][var35 + 1] & 4) != -1; ++var35) {
                        }
                        label277: while (~var32 < -1) {
                            for (int var36 = var34; ~var36 >= ~var35; ++var36) {
                                if ((4 & super.field1131[var5][var32 + -1][var36]) == 0) {
                                    break label277;
                                }
                            }
                            --var32;
                        }
                        label266: while (var33 < super.field1117) {
                            for (int var37 = var34; ~var37 >= ~var35; ++var37) {
                                if ((super.field1131[var5][var33 + 1][var37] & 4) == 0) {
                                    break label266;
                                }
                            }
                            ++var33;
                        }
                        if ((-var34 - -1 + var35) * (var33 + 1 + -var32) >= 4) {
                            int var38 = super.field1128[var5][var32][var34];
                            class422.method2518(4, var32 << 7, (var33 << 7) + 128, var34 << 7, (var35 << 7) + 128, var38, var38);
                            for (int var39 = var32; ~var33 <= ~var39; ++var39) {
                                for (int var40 = var34; ~var40 >= ~var35; ++var40) {
                                    super.field1131[var5][var39][var40] = (byte) class589.method3454(super.field1131[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field1131 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIILfba;Lfba;)V")
    public static final void method3540(int arg0, int arg1, int arg2, class23 arg3, class23 arg4) {
        class622 var5 = class452.method2656(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field8981 = arg3;
            var5.field8977 = arg4;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II[BIIIZLqa;[Lld;II)V")
    public final void method3541(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, boolean arg6, class207 arg7, class145[] arg8, int arg9, int arg10) {
        if (arg6) {
            this.field8645 = -13;
        }
        ++field8642;
        class11 var12 = new class11(arg2);
        int var13 = -1;
        while (true) {
            int var14 = var12.method82(-127);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method112(-8838);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = 63 & var15;
                int var18 = (4079 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method110((byte) 114);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (arg4 == var19 && ~var18 <= ~arg1 && var18 < arg1 + 8 && ~var17 <= ~arg9 && arg9 - -8 > var17) {
                    class364 var23 = class18.field227.method1201((byte) 66, var13);
                    int var24 = class293.method1883((byte) 56, var23.field4926, var22, var18 & 7, var23.field4910, arg0, 7 & var17) + arg10;
                    int var25 = class534.method3070(var17 & 7, var22, arg0, var23.field4926, false, var23.field4910, var18 & 7) + arg5;
                    if (var24 > 0 && ~var25 < -1 && super.field1117 + -1 > var24 && var25 < super.field1119 + -1) {
                        class145 var26 = null;
                        if (!super.field1124) {
                            int var27 = arg3;
                            if (~(2 & class80.field1299[1][var24][var25]) == -3) {
                                var27 = arg3 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg8[var27];
                            }
                        }
                        this.method3534(arg7, arg3, 3 & arg0 + var22, var26, -1, arg3, 24486, var24, var13, var25, var21);
                    }
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3542(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
