import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class349 extends class325 {

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public int field5091 = 99;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "Lri;")
    public static class74 field5093 = new class74(6, 4);

    @OriginalMember(owner = "client!od", name = "T", descriptor = "Ljava/lang/String;")
    public static String field5099 = null;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "Lqq;")
    public static class333 field5098;

    // $FF: synthetic field
    @OriginalMember(owner = "client!od", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field5102;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II[BI[Leq;IIILya;IZ)V")
    public final void method2070(int arg0, int arg1, byte[] arg2, int arg3, class141[] arg4, int arg5, int arg6, int arg7, class38 arg8, int arg9, boolean arg10) {
        if (arg10) {
            this.method2071((class38) null, (class391) null, 102, -15, -49, (int[]) null);
        }
        ++field5090;
        class391 var12 = new class391(arg2);
        int var13 = -1;
        while (true) {
            int var14 = var12.method2322((byte) 80);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2332(2);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = var15 >> 6 & 63;
                int var19 = var15 >> 12;
                int var20 = var12.method2348(-2);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (~arg1 == ~var19 && ~var18 <= ~arg7 && ~var18 > ~(arg7 + 8) && ~arg9 >= ~var17 && arg9 + 8 > var17) {
                    class220 var23 = class78.field1141.method2103(var13, !arg10);
                    int var24 = class258.method1555(var18 & 7, 4400, var23.field3118, arg5, var17 & 7, var23.field3143, var22) + arg0;
                    int var25 = arg3 + class450.method2659(false, var22, var23.field3118, 7 & var18, arg5, var23.field3143, var17 & 7);
                    if (~var24 < -1 && ~var25 < -1 && ~var24 > ~(super.field4434 + -1) && var25 < super.field4426 + -1) {
                        class141 var26 = null;
                        if (!super.field4433) {
                            int var27 = arg6;
                            if ((class267.field3700[1][var24][var25] & 2) == 2) {
                                var27 = arg6 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg4[var27];
                            }
                        }
                        this.method2072(var13, arg8, var25, var26, arg6, -1, var24, arg6, (byte) 105, arg5 + var22 & 3, var21);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lya;Lsi;III[I)V")
    public final void method2071(class38 arg0, class391 arg1, int arg2, int arg3, int arg4, int[] arg5) {
        ++field5095;
        if (!super.field4433) {
            boolean var7 = false;
            int var8 = 100 / ((arg4 - -53) / 33);
            class373 var9 = null;
            if (arg5 != null) {
                arg5[0] = -1;
            }
            while (true) {
                while (arg1.field5719 < arg1.field5678.length) {
                    int var19 = arg1.method2348(-2);
                    if (~var19 == -1) {
                        var9 = new class373(arg1);
                    } else if (var19 == 1) {
                        int var35 = arg1.method2348(-2);
                        if (~var35 < -1) {
                            for (int var36 = 0; var36 < var35; ++var36) {
                                class525 var37 = new class525(arg0, arg1, 0);
                                if (~var37.field7768 == -32) {
                                    class120 var38 = class104.field1572.method1596(-1, arg1.method2353((byte) 112));
                                    var37.method3125(var38.field1770, 56, var38.field1771, var38.field1769, var38.field1772);
                                }
                                if (~arg0.method263() < -1) {
                                    class153 var39 = var37.field7770;
                                    int var40 = (arg2 << 7) + var39.method1026(true);
                                    int var41 = var39.method1027(-601) + (arg3 << 7);
                                    int var42 = var40 >> 7;
                                    int var43 = var41 >> 7;
                                    if (~var42 <= -1 && var43 >= 0 && ~var42 > ~super.field4434 && var43 < super.field4426) {
                                        var39.method1028(var41, var40, super.field4410[var37.field7772][var42][var43] - var39.method1025((byte) 60), (byte) 83);
                                        if (arg0.method263() > 0) {
                                            class381.method2258(var37);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~var19 == -3) {
                        if (var9 == null) {
                            var9 = new class373();
                        }
                        var9.method2230(arg1, 30914);
                    } else if (~var19 == -129) {
                        if (arg5 != null) {
                            arg5[0] = arg1.method2353((byte) 75);
                            arg5[1] = arg1.method2311((byte) 1);
                            arg5[2] = arg1.method2311((byte) -123);
                            arg5[3] = arg1.method2311((byte) 126);
                            arg5[4] = arg1.method2353((byte) 80);
                        } else {
                            arg1.field5719 += 10;
                        }
                    } else {
                        if (~var19 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field4441 == null) {
                            super.field4441 = new byte[4][][];
                        }
                        for (int var20 = 0; ~var20 > -5; ++var20) {
                            byte var21 = arg1.method2337(-1);
                            if (~var21 == -1 && super.field4441[var20] != null) {
                                int var22 = arg2;
                                int var23 = arg2 - -64;
                                int var24 = arg3;
                                int var25 = arg3 + 64;
                                if (arg2 < 0) {
                                    var22 = 0;
                                } else if (~super.field4434 >= ~arg2) {
                                    var22 = super.field4434;
                                }
                                if (~arg3 > -1) {
                                    var24 = 0;
                                } else if (~arg3 <= ~super.field4426) {
                                    var24 = super.field4426;
                                }
                                if (~var23 <= -1) {
                                    if (var23 >= super.field4434) {
                                        var23 = super.field4434;
                                    }
                                } else {
                                    var23 = 0;
                                }
                                if (~var25 > -1) {
                                    var25 = 0;
                                } else if (~var25 <= ~super.field4426) {
                                    var25 = super.field4426;
                                }
                                while (~var23 < ~var22) {
                                    while (var25 > var24) {
                                        super.field4441[var20][var22][var24] = 0;
                                        ++var24;
                                    }
                                    ++var22;
                                }
                            } else if (var21 != 1) {
                                if (var21 == 2) {
                                    if (super.field4441[var20] == null) {
                                        super.field4441[var20] = new byte[super.field4434 + 1][super.field4426 - -1];
                                    }
                                    if (~var20 < -1) {
                                        int var26 = arg2;
                                        int var27 = arg2 + 64;
                                        int var28 = arg3;
                                        if (~arg3 > -1) {
                                            var28 = 0;
                                        } else if (~arg3 <= ~super.field4426) {
                                            var28 = super.field4426;
                                        }
                                        int var29 = arg3 + 64;
                                        if (arg2 >= 0) {
                                            if (~arg2 <= ~super.field4434) {
                                                var26 = super.field4434;
                                            }
                                        } else {
                                            var26 = 0;
                                        }
                                        if (var27 >= 0) {
                                            if (~super.field4434 >= ~var27) {
                                                var27 = super.field4434;
                                            }
                                        } else {
                                            var27 = 0;
                                        }
                                        if (~var29 <= -1) {
                                            if (super.field4426 <= var29) {
                                                var29 = super.field4426;
                                            }
                                        } else {
                                            var29 = 0;
                                        }
                                        while (~var27 < ~var26) {
                                            while (~var28 > ~var29) {
                                                super.field4441[var20][var26][var28] = super.field4441[var20 + -1][var26][var28];
                                                ++var28;
                                            }
                                            ++var26;
                                        }
                                    }
                                }
                            } else {
                                if (super.field4441[var20] == null) {
                                    super.field4441[var20] = new byte[super.field4434 - -1][super.field4426 + 1];
                                }
                                for (int var30 = 0; ~var30 > -65; var30 += 4) {
                                    for (int var31 = 0; var31 < 64; var31 += 4) {
                                        byte var32 = arg1.method2337(-1);
                                        for (int var33 = arg2 + var30; ~var33 > ~(arg2 + 4 + var30); ++var33) {
                                            for (int var34 = arg3 + var31; ~(var31 - -arg3 + 4) < ~var34; ++var34) {
                                                if (var33 >= 0 && ~var33 > ~super.field4434 && var34 >= 0 && ~var34 > ~super.field4426) {
                                                    super.field4441[var20][var33][var34] = var32;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        var7 = true;
                    }
                }
                if (var9 != null) {
                    for (int var10 = 0; var10 < 8; ++var10) {
                        for (int var11 = 0; var11 < 8; ++var11) {
                            int var12 = (arg2 >> 3) + var10;
                            int var13 = (arg3 >> 3) + var11;
                            if (var12 >= 0 && ~var12 > ~(super.field4434 >> 3) && ~var13 <= -1 && ~var13 > ~(super.field4426 >> 3)) {
                                class102.method760(var12, var13, (byte) -44, var9);
                            }
                        }
                    }
                }
                if (!var7 && super.field4441 != null) {
                    for (int var14 = 0; var14 < 4; ++var14) {
                        if (super.field4441[var14] != null) {
                            for (int var15 = 0; var15 < 16; ++var15) {
                                for (int var16 = 0; ~var16 > -17; ++var16) {
                                    int var17 = (arg2 >> 2) + var15;
                                    int var18 = (arg3 >> 2) + var16;
                                    if (var17 >= 0 && var17 < 26 && var18 >= 0 && ~var18 > -27) {
                                        super.field4441[var14][var17][var18] = 0;
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

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIZ)V")
    public class349(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class511.field7575, class324.field4405);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILya;ILeq;IIIIBII)V")
    public final void method2072(int arg0, class38 arg1, int arg2, class141 arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10) {
        ++field5096;
        if (class20.field269.method1712(class152.field2332, false) || class6.method39(class124.field1854, arg4, (byte) -107, arg2, arg6)) {
            if (arg7 < this.field5091) {
                this.field5091 = arg7;
            }
            class220 var12 = class78.field1141.method2103(arg0, true);
            if (!arg1.method249() || !class20.field269.field7632 || !var12.field3108) {
                int var13;
                int var14;
                if (~arg9 != -2 && arg9 != 3) {
                    var13 = var12.field3118;
                    var14 = var12.field3143;
                } else {
                    var13 = var12.field3143;
                    var14 = var12.field3118;
                }
                int var15;
                int var16;
                if (super.field4434 >= arg6 + var14) {
                    var15 = (var14 + 1 >> 1) + arg6;
                    var16 = (var14 >> 1) + arg6;
                } else {
                    var16 = arg6;
                    var15 = arg6 - -1;
                }
                int var17;
                int var18;
                if (super.field4426 < arg2 + var13) {
                    var17 = arg2 + 1;
                    var18 = arg2;
                } else {
                    var18 = (var13 >> 1) + arg2;
                    var17 = (var13 + 1 >> 1) + arg2;
                }
                class142 var19 = class211.field2950[arg4];
                int var20 = var19.method351(var16, var18) - (-var19.method351(var15, var18) + (-var19.method351(var16, var17) - var19.method351(var15, var17))) >> 2;
                int var21 = (arg6 << 7) + (var14 << 6);
                int var22 = (arg2 << 7) + (var13 << 6);
                boolean var23 = class405.field5946 && !super.field4433 && var12.field3101;
                if (var12.method1372(0)) {
                    class226.method1401(arg6, var12, arg2, arg9, 123, (class438) null, arg7, (class502) null);
                }
                boolean var24 = arg5 == -1 && ~var12.field3133 == 0 && var12.field3061 == null && var12.field3080 == null && !var12.field3141;
                if (!class357.field5215 || (!class217.method1345(0, arg10) || ~var12.field3100 == -2) && (!class391.method2319(arg10, -60) || var12.field3100 != 0)) {
                    if (arg10 == 22) {
                        if (class20.field269.field7649 || var12.field3119 != 0 || ~var12.field3146 == -2 || var12.field3144) {
                            class117 var26;
                            if (var24) {
                                class386 var25 = new class386(arg1, var12, arg4, var21, var20, var22, super.field4433, arg9, var23);
                                var26 = var25;
                                if (var25.method489(113)) {
                                    var25.method486(9229, arg1);
                                }
                            } else {
                                var26 = new class267(arg1, var12, arg7, arg4, var21, var20, var22, super.field4433, arg9, arg5);
                            }
                            class117 var27 = class509.method3048(arg7, arg6, arg2);
                            if (var27 instanceof class377) {
                                ((class377) var27).field5520 = var26;
                            } else {
                                class439.method2609(arg7, arg6, arg2, var26);
                            }
                            if (var12.field3146 == 1 && arg3 != null) {
                                arg3.method949(arg2, arg6, 26);
                            }
                        }
                    } else if (~arg10 != -11 && arg10 != 11) {
                        if (~arg10 <= -13 && arg10 <= 17 || ~arg10 <= -19 && arg10 <= 21) {
                            class116 var28;
                            if (!var24) {
                                var28 = new class253(arg1, var12, arg7, arg4, var21, var20, var22, super.field4433, arg6, arg6 + var14 + -1, arg2, arg2 + -1 + var13, arg10, arg9, arg5);
                            } else {
                                class428 var29 = new class428(arg1, var12, arg7, arg4, var21, var20, var22, super.field4433, arg6, arg6 - (-var14 - -1), arg2, arg2 - 1 + var13, arg10, arg9, var23);
                                var28 = var29;
                                if (var29.method489(93)) {
                                    var29.method486(9229, arg1);
                                }
                            }
                            class116 var30 = class38.method295(arg7, arg6, arg2, field5102 != null ? field5102 : (field5102 = method2078("jn")));
                            if (var30 instanceof class418 && ~var30.field1729 == ~arg6 && ~var30.field1730 == ~arg2) {
                                ((class418) var30).field6066 = var28;
                            } else {
                                class51.method449(var28, false);
                            }
                            if (class405.field5946 && !super.field4433 && ~arg10 <= -13 && ~arg10 >= -18 && arg10 != 13 && ~arg7 < -1 && var12.field3100 != 0) {
                                super.field4420[arg7][arg6][arg2] = (byte) class255.method1532(super.field4420[arg7][arg6][arg2], 4);
                            }
                            if (var12.field3146 != 0 && arg3 != null) {
                                arg3.method946(var12.field3147, 8868, arg6, arg2, var13, var14, !var12.field3122);
                            }
                        } else if (arg10 == 0) {
                            int var31 = var12.field3100;
                            if (class318.field4367 && ~var12.field3100 == 0) {
                                var31 = 1;
                            }
                            class90 var32;
                            if (!var24) {
                                var32 = new class125(arg1, var12, arg7, arg4, var21, var20, var22, super.field4433, arg10, arg9, arg5);
                            } else {
                                class60 var33 = new class60(arg1, var12, arg4, var21, var20, var22, super.field4433, arg10, arg9, var23);
                                var32 = var33;
                                if (var33.method489(109)) {
                                    var33.method486(9229, arg1);
                                }
                            }
                            class90 var34 = class176.method1135(arg7, arg6, arg2);
                            if (var34 instanceof class372) {
                                ((class372) var34).field5440 = var32;
                            } else {
                                class65.method560(arg7, arg6, arg2, var32, (class90) null);
                            }
                            if (class405.field5946) {
                                if (arg9 == 0) {
                                    if (var12.field3092) {
                                        var19.method366(arg6, arg2, 50);
                                        var19.method366(arg6, arg2 + 1, 50);
                                    }
                                    if (~var31 == -2 && !super.field4433) {
                                        super.field4420[arg7][arg6][arg2] = (byte) class255.method1532(super.field4420[arg7][arg6][arg2], 1);
                                    }
                                } else if (~arg9 != -2) {
                                    if (~arg9 == -3) {
                                        if (var12.field3092) {
                                            var19.method366(arg6 + 1, arg2, 50);
                                            var19.method366(arg6 + 1, arg2 + 1, 50);
                                        }
                                        if (~var31 == -2 && !super.field4433) {
                                            super.field4420[arg7][arg6 + 1][arg2] = (byte) class255.method1532(super.field4420[arg7][arg6 + 1][arg2], 1);
                                        }
                                    } else if (~arg9 == -4) {
                                        if (var12.field3092) {
                                            var19.method366(arg6, arg2, 50);
                                            var19.method366(arg6 + 1, arg2, 50);
                                        }
                                        if (~var31 == -2 && !super.field4433) {
                                            super.field4420[arg7][arg6][arg2] = (byte) class255.method1532(super.field4420[arg7][arg6][arg2], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field3092) {
                                        var19.method366(arg6, arg2 + 1, 50);
                                        var19.method366(arg6 + 1, arg2 + 1, 50);
                                    }
                                    if (~var31 == -2 && !super.field4433) {
                                        super.field4420[arg7][arg6][arg2 + 1] = (byte) class255.method1532(super.field4420[arg7][arg6][arg2 + 1], 2);
                                    }
                                }
                            }
                            if (var12.field3146 != 0 && arg3 != null) {
                                arg3.method947(arg10, var12.field3147, arg9, -27419, arg2, !var12.field3122, arg6);
                            }
                            if (var12.field3125 != 16) {
                                class77.method622(arg7, arg6, arg2, var12.field3125);
                            }
                        } else if (~arg10 == -2) {
                            class90 var36;
                            if (var24) {
                                class60 var35 = new class60(arg1, var12, arg4, var21, var20, var22, super.field4433, arg10, arg9, var23);
                                if (var35.method489(106)) {
                                    var35.method486(9229, arg1);
                                }
                                var36 = var35;
                            } else {
                                var36 = new class125(arg1, var12, arg7, arg4, var21, var20, var22, super.field4433, arg10, arg9, arg5);
                            }
                            class90 var37 = class176.method1135(arg7, arg6, arg2);
                            if (var37 instanceof class372) {
                                ((class372) var37).field5440 = var36;
                            } else {
                                class65.method560(arg7, arg6, arg2, var36, (class90) null);
                            }
                            if (var12.field3092 && class405.field5946) {
                                if (~arg9 != -1) {
                                    if (arg9 != 1) {
                                        if (~arg9 != -3) {
                                            if (~arg9 == -4) {
                                                var19.method366(arg6, arg2, 50);
                                            }
                                        } else {
                                            var19.method366(arg6 + 1, arg2, 50);
                                        }
                                    } else {
                                        var19.method366(arg6 + 1, arg2 + 1, 50);
                                    }
                                } else {
                                    var19.method366(arg6, arg2 + 1, 50);
                                }
                            }
                            if (var12.field3146 != 0 && arg3 != null) {
                                arg3.method947(arg10, var12.field3147, arg9, -27419, arg2, !var12.field3122, arg6);
                            }
                        } else if (~arg10 == -3) {
                            int var38 = 3 & arg9 - -1;
                            class90 var39;
                            class90 var40;
                            if (!var24) {
                                var39 = new class125(arg1, var12, arg7, arg4, var21, var20, var22, super.field4433, arg10, arg9 + 4, arg5);
                                var40 = new class125(arg1, var12, arg7, arg4, var21, var20, var22, super.field4433, arg10, var38, arg5);
                            } else {
                                class60 var41 = new class60(arg1, var12, arg4, var21, var20, var22, super.field4433, arg10, arg9 + 4, var23);
                                class60 var42 = new class60(arg1, var12, arg4, var21, var20, var22, super.field4433, arg10, var38, var23);
                                if (var41.method489(101)) {
                                    var41.method486(9229, arg1);
                                }
                                var39 = var41;
                                if (var42.method489(104)) {
                                    var42.method486(9229, arg1);
                                }
                                var40 = var42;
                            }
                            class65.method560(arg7, arg6, arg2, var39, var40);
                            if (~var12.field3100 == -2 && class405.field5946 && !super.field4433) {
                                if (arg9 != 0) {
                                    if (arg9 != 1) {
                                        if (arg9 != 2) {
                                            if (~arg9 == -4) {
                                                super.field4420[arg7][arg6][arg2] = (byte) class255.method1532(super.field4420[arg7][arg6][arg2], 2);
                                                super.field4420[arg7][arg6][arg2] = (byte) class255.method1532(super.field4420[arg7][arg6][arg2], 1);
                                            }
                                        } else {
                                            super.field4420[arg7][arg6 - -1][arg2] = (byte) class255.method1532(super.field4420[arg7][arg6 - -1][arg2], 1);
                                            super.field4420[arg7][arg6][arg2] = (byte) class255.method1532(super.field4420[arg7][arg6][arg2], 2);
                                        }
                                    } else {
                                        super.field4420[arg7][arg6][arg2 + 1] = (byte) class255.method1532(super.field4420[arg7][arg6][arg2 + 1], 2);
                                        super.field4420[arg7][arg6 + 1][arg2] = (byte) class255.method1532(super.field4420[arg7][arg6 + 1][arg2], 1);
                                    }
                                } else {
                                    super.field4420[arg7][arg6][arg2] = (byte) class255.method1532(super.field4420[arg7][arg6][arg2], 1);
                                    super.field4420[arg7][arg6][arg2 + 1] = (byte) class255.method1532(super.field4420[arg7][arg6][arg2 + 1], 2);
                                }
                            }
                            if (var12.field3146 != 0 && arg3 != null) {
                                arg3.method947(arg10, var12.field3147, arg9, -27419, arg2, !var12.field3122, arg6);
                            }
                            if (~var12.field3125 != -17) {
                                class77.method622(arg7, arg6, arg2, var12.field3125);
                            }
                        } else if (~arg10 == -4) {
                            class90 var44;
                            if (var24) {
                                class60 var43 = new class60(arg1, var12, arg4, var21, var20, var22, super.field4433, arg10, arg9, var23);
                                var44 = var43;
                                if (var43.method489(127)) {
                                    var43.method486(9229, arg1);
                                }
                            } else {
                                var44 = new class125(arg1, var12, arg7, arg4, var21, var20, var22, super.field4433, arg10, arg9, arg5);
                            }
                            class90 var45 = class176.method1135(arg7, arg6, arg2);
                            if (!(var45 instanceof class372)) {
                                class65.method560(arg7, arg6, arg2, var44, (class90) null);
                            } else {
                                ((class372) var45).field5440 = var44;
                            }
                            if (var12.field3092 && class405.field5946) {
                                if (~arg9 != -1) {
                                    if (arg9 == 1) {
                                        var19.method366(arg6 + 1, arg2 + 1, 50);
                                    } else if (~arg9 != -3) {
                                        if (~arg9 == -4) {
                                            var19.method366(arg6, arg2, 50);
                                        }
                                    } else {
                                        var19.method366(arg6 + 1, arg2, 50);
                                    }
                                } else {
                                    var19.method366(arg6, arg2 + 1, 50);
                                }
                            }
                            if (var12.field3146 != 0 && arg3 != null) {
                                arg3.method947(arg10, var12.field3147, arg9, -27419, arg2, !var12.field3122, arg6);
                            }
                        } else if (~arg10 == -10) {
                            class116 var46;
                            if (!var24) {
                                var46 = new class253(arg1, var12, arg7, arg4, var21, var20, var22, super.field4433, arg6, var14 - 1 + arg6, arg2, arg2 + -1 + var13, arg10, arg9, arg5);
                            } else {
                                class428 var47 = new class428(arg1, var12, arg7, arg4, var21, var20, var22, super.field4433, arg6, arg6, arg2, arg2, arg10, arg9, var23);
                                var46 = var47;
                                if (var47.method489(104)) {
                                    var47.method486(9229, arg1);
                                }
                            }
                            class116 var48 = class38.method295(arg7, arg6, arg2, field5102 != null ? field5102 : (field5102 = method2078("jn")));
                            if (var48 instanceof class418 && ~var48.field1729 == ~arg6 && ~var48.field1730 == ~arg2) {
                                ((class418) var48).field6066 = var46;
                            } else {
                                class51.method449(var46, false);
                            }
                            if (var12.field3146 != 0 && arg3 != null) {
                                arg3.method946(var12.field3147, 8868, arg6, arg2, var13, var14, !var12.field3122);
                            }
                            if (var12.field3125 != 16) {
                                class77.method622(arg7, arg6, arg2, var12.field3125);
                            }
                        } else {
                            int var49 = -32 % ((arg8 - -20) / 59);
                            if (~arg10 == -5) {
                                class147 var51;
                                if (var24) {
                                    class284 var50 = new class284(arg1, var12, arg4, var21, var20, var22, super.field4433, 0, 0, 0, arg10, arg9);
                                    if (var50.method489(127)) {
                                        var50.method486(9229, arg1);
                                    }
                                    var51 = var50;
                                } else {
                                    var51 = new class317(arg1, var12, arg7, arg4, var21, var20, var22, super.field4433, 0, 0, 0, arg10, arg9, arg5);
                                }
                                class147 var52 = class131.method899(arg7, arg6, arg2);
                                if (!(var52 instanceof class158)) {
                                    class79.method639(arg7, arg6, arg2, var51, (class147) null);
                                } else {
                                    ((class158) var52).field2389 = var51;
                                }
                            } else if (arg10 == 5) {
                                int var53 = 17;
                                class503 var54 = (class503) class176.method1135(arg7, arg6, arg2);
                                if (var54 != null) {
                                    var53 = 1 + class78.field1141.method2103(var54.method490(-29679), true).field3125;
                                }
                                class147 var56;
                                if (var24) {
                                    class284 var55 = new class284(arg1, var12, arg4, var21, var20, var22, super.field4433, 0, class485.field7084[arg9] * var53, class321.field4386[arg9] * var53, arg10, arg9);
                                    if (var55.method489(115)) {
                                        var55.method486(9229, arg1);
                                    }
                                    var56 = var55;
                                } else {
                                    var56 = new class317(arg1, var12, arg7, arg4, var21, var20, var22, super.field4433, 0, class485.field7084[arg9] * var53, class321.field4386[arg9] * var53, arg10, arg9, arg5);
                                }
                                class147 var57 = class131.method899(arg7, arg6, arg2);
                                if (var57 instanceof class158) {
                                    ((class158) var57).field2389 = var56;
                                } else {
                                    class79.method639(arg7, arg6, arg2, var56, (class147) null);
                                }
                            } else if (~arg10 == -7) {
                                int var58 = 9;
                                class503 var59 = (class503) class176.method1135(arg7, arg6, arg2);
                                if (var59 != null) {
                                    var58 = class78.field1141.method2103(var59.method490(-29679), true).field3125 / 2 + 1;
                                }
                                class147 var61;
                                if (var24) {
                                    class284 var60 = new class284(arg1, var12, arg4, var21, var20, var22, super.field4433, arg9, class485.field7084[arg9] * var58, class321.field4386[arg9] * var58, arg10, arg9 + 4);
                                    if (var60.method489(-111)) {
                                        var60.method486(9229, arg1);
                                    }
                                    var61 = var60;
                                } else {
                                    var61 = new class317(arg1, var12, arg7, arg4, var21, var20, var22, super.field4433, arg9, class51.field621[arg9] * var58, class318.field4364[arg9] * var58, arg10, arg9 + 4, arg5);
                                }
                                class147 var62 = class131.method899(arg7, arg6, arg2);
                                if (!(var62 instanceof class158)) {
                                    class79.method639(arg7, arg6, arg2, var61, (class147) null);
                                } else {
                                    ((class158) var62).field2389 = var61;
                                }
                            } else if (arg10 == 7) {
                                int var63 = 3 & arg9 + 2;
                                class147 var65;
                                if (var24) {
                                    class284 var64 = new class284(arg1, var12, arg4, var21, var20, var22, super.field4433, var63, 0, 0, arg10, var63 + 4);
                                    if (var64.method489(-77)) {
                                        var64.method486(9229, arg1);
                                    }
                                    var65 = var64;
                                } else {
                                    var65 = new class317(arg1, var12, arg7, arg4, var21, var20, var22, super.field4433, var63, 0, 0, arg10, var63 - -4, arg5);
                                }
                                class147 var66 = class131.method899(arg7, arg6, arg2);
                                if (!(var66 instanceof class158)) {
                                    class79.method639(arg7, arg6, arg2, var65, (class147) null);
                                } else {
                                    ((class158) var66).field2389 = var65;
                                }
                            } else if (~arg10 == -9) {
                                int var67 = arg9 + 2 & 3;
                                int var68 = 9;
                                class503 var69 = (class503) class176.method1135(arg7, arg6, arg2);
                                if (var69 != null) {
                                    var68 = class78.field1141.method2103(var69.method490(-29679), true).field3125 / 2 + 1;
                                }
                                class147 var72;
                                class147 var73;
                                if (var24) {
                                    class284 var70 = new class284(arg1, var12, arg4, var21, var20, var22, super.field4433, arg9, class51.field621[arg9] * var68, class318.field4364[arg9] * var68, arg10, arg9 + 4);
                                    class284 var71 = new class284(arg1, var12, arg4, var21, var20, var22, super.field4433, arg9, 0, 0, arg10, var67 + 4);
                                    if (var70.method489(89)) {
                                        var70.method486(9229, arg1);
                                    }
                                    var72 = var71;
                                    var73 = var70;
                                    if (var71.method489(-123)) {
                                        var71.method486(9229, arg1);
                                    }
                                } else {
                                    class317 var74 = new class317(arg1, var12, arg7, arg4, var21, var20, var22, super.field4433, arg9, class51.field621[arg9] * var68, class318.field4364[arg9] * var68, arg10, arg9 + 4, arg5);
                                    class317 var75 = new class317(arg1, var12, arg7, arg4, var21, var20, var22, super.field4433, arg9, 0, 0, arg10, var67 - -4, arg5);
                                    var73 = var74;
                                    var72 = var75;
                                }
                                class79.method639(arg7, arg6, arg2, var73, var72);
                            }
                        }
                    } else {
                        class428 var76 = null;
                        int var78;
                        class116 var79;
                        if (var24) {
                            class428 var77 = new class428(arg1, var12, arg7, arg4, var21, var20, var22, super.field4433, arg6, arg6 + var14 - 1, arg2, arg2 + -1 - -var13, arg10, arg9, var23);
                            var76 = var77;
                            var78 = var77.method2531(65535);
                            var79 = var77;
                        } else {
                            var78 = 15;
                            var79 = new class253(arg1, var12, arg7, arg4, var21, var20, var22, super.field4433, arg6, arg6 - -var14 + -1, arg2, arg2 + var13 + -1, arg10, arg9, arg5);
                        }
                        class116 var80 = class38.method295(arg7, arg6, arg2, field5102 != null ? field5102 : (field5102 = method2078("jn")));
                        boolean var81 = false;
                        if (var80 instanceof class418 && var80.field1729 == arg6 && var80.field1730 == arg2) {
                            var81 = true;
                            ((class418) var80).field6066 = var79;
                        }
                        if (var81 || class51.method449(var79, false)) {
                            if (var76 != null && var76.method489(-79)) {
                                var76.method486(9229, arg1);
                            }
                            if (var12.field3092 && class405.field5946) {
                                if (~var78 < -31) {
                                    var78 = 30;
                                }
                                for (int var82 = 0; ~var82 >= ~var14; ++var82) {
                                    for (int var83 = 0; var13 >= var83; ++var83) {
                                        var19.method366(arg6 + var82, arg2 + var83, var78);
                                    }
                                }
                            }
                        }
                        if (var12.field3146 != 0 && arg3 != null) {
                            arg3.method946(var12.field3147, 8868, arg6, arg2, var13, var14, !var12.field3122);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILeq;IIIZLya;)V")
    public final void method2073(int arg0, class141 arg1, int arg2, int arg3, int arg4, boolean arg5, class38 arg6) {
        ++field5101;
        class503 var8 = null;
        if (arg2 == 0) {
            var8 = (class503) class176.method1135(arg4, arg3, arg0);
        }
        if (arg2 == 1) {
            var8 = (class503) class131.method899(arg4, arg3, arg0);
        }
        if (arg2 == 2) {
            var8 = (class503) class38.method295(arg4, arg3, arg0, field5102 != null ? field5102 : (field5102 = method2078("jn")));
        }
        if (arg2 == 3) {
            var8 = (class503) class509.method3048(arg4, arg3, arg0);
        }
        if (arg5) {
            this.method2072(-34, (class38) null, -69, (class141) null, -81, -13, 17, -23, (byte) -40, -121, 72);
        }
        if (var8 != null) {
            class220 var9 = class78.field1141.method2103(var8.method490(-29679), true);
            int var10 = var8.method496(-79);
            int var11 = var8.method499(-15561);
            if (var9.method1372(0)) {
                class381.method2263(arg0, arg4, arg3, var9, -2063105817);
            }
            if (var8.method489(103)) {
                var8.method482(-113, arg6);
            }
            if (~arg2 == -1) {
                class90 var12 = class176.method1135(arg4, arg3, arg0);
                if (!(var12 instanceof class372)) {
                    class485.method2851(arg4, arg3, arg0);
                } else {
                    ((class372) var12).field5440 = null;
                }
                if (~var9.field3146 != -1) {
                    arg1.method950(arg3, var9.field3147, var11, var10, arg0, -27120, !var9.field3122);
                    return;
                }
            } else if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 == -4) {
                        class117 var13 = class509.method3048(arg4, arg3, arg0);
                        if (var13 instanceof class377) {
                            ((class377) var13).field5520 = null;
                        } else {
                            class116.method828(arg4, arg3, arg0);
                        }
                        if (var9.field3146 == 1) {
                            arg1.method948(arg3, arg0, -262145);
                            return;
                        }
                    }
                    return;
                }
                class116 var14 = class38.method295(arg4, arg3, arg0, field5102 != null ? field5102 : (field5102 = method2078("jn")));
                if (var14 instanceof class418 && var14.field1729 == arg3 && ~var14.field1730 == ~arg0) {
                    ((class418) var14).field6066 = null;
                } else {
                    class224.method1393(arg4, arg3, arg0, field5102 != null ? field5102 : (field5102 = method2078("jn")));
                }
                if (~var9.field3146 != -1 && ~super.field4434 < ~(var9.field3143 + arg3) && arg0 - -var9.field3143 < super.field4426 && ~super.field4434 < ~(var9.field3118 + arg3) && ~super.field4426 < ~(arg0 - -var9.field3118)) {
                    arg1.method958(var9.field3118, -1, var9.field3147, arg3, var9.field3143, var11, arg0, !var9.field3122);
                    return;
                }
            } else {
                class147 var15 = class131.method899(arg4, arg3, arg0);
                if (!(var15 instanceof class158)) {
                    class424.method2521(arg4, arg3, arg0);
                    return;
                }
                ((class158) var15).field2389 = null;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
    public static void method2074(byte arg0) {
        field5099 = null;
        int var1 = 35 / ((arg0 - -9) / 60);
        field5093 = null;
        field5098 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIILya;[ILsi;II)V")
    public final void method2075(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class38 arg6, int[] arg7, class391 arg8, int arg9, int arg10) {
        ++field5092;
        if (!super.field4433) {
            boolean var12 = false;
            if (arg7 != null) {
                arg7[0] = -1;
            }
            class373 var13 = null;
            if (arg3 != 0) {
                this.method2070(115, 51, (byte[]) null, -59, (class141[]) null, 33, -27, -31, (class38) null, 52, true);
            }
            int var14 = (7 & arg2) * 8;
            int var15 = (7 & arg10) * 8;
            while (true) {
                while (arg8.field5719 < arg8.field5678.length) {
                    int var20 = arg8.method2348(-2);
                    if (var20 == 0) {
                        var13 = new class373(arg8);
                    } else if (var20 == 1) {
                        int var21 = arg8.method2348(-2);
                        if (~var21 < -1) {
                            for (int var22 = 0; var22 < var21; ++var22) {
                                class525 var23 = new class525(arg6, arg8, 0);
                                if (var23.field7768 == 31) {
                                    class120 var24 = class104.field1572.method1596(arg3 + -1, arg8.method2353((byte) 106));
                                    var23.method3125(var24.field1770, 69, var24.field1771, var24.field1769, var24.field1772);
                                }
                                if (arg6.method263() > 0) {
                                    class153 var25 = var23.field7770;
                                    int var26 = var25.method1026(true) >> 7;
                                    int var27 = var25.method1027(-601) >> 7;
                                    if (~var23.field7772 == ~arg9 && var26 >= var14 && ~var26 > ~(var14 - -8) && ~var15 >= ~var27 && var27 < var15 + 8) {
                                        int var28 = class339.method2012(95, var25.method1027(-601) & 1023, 1023 & var25.method1026(true), arg5) + (arg0 << 7);
                                        int var29 = var28 >> 7;
                                        int var30 = (arg4 << 7) - -class253.method1517(arg5, false, 1023 & var25.method1026(true), 1023 & var25.method1027(-601));
                                        int var31 = var30 >> 7;
                                        if (var29 >= 0 && ~var31 <= -1 && ~var29 > ~super.field4434 && ~var31 > ~super.field4426) {
                                            var25.method1028(var30, var28, super.field4410[arg9][var29][var31] + -var25.method1025((byte) 82), (byte) 115);
                                            if (~arg6.method263() < -1) {
                                                class381.method2258(var23);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2) {
                        if (var13 == null) {
                            var13 = new class373();
                        }
                        var13.method2230(arg8, 30914);
                    } else if (~var20 == -129) {
                        if (arg7 == null) {
                            arg8.field5719 += 10;
                        } else {
                            arg7[0] = arg8.method2353((byte) 120);
                            arg7[1] = arg8.method2311((byte) -85);
                            arg7[2] = arg8.method2311((byte) -42);
                            arg7[3] = arg8.method2311((byte) 125);
                            arg7[4] = arg8.method2353((byte) 111);
                        }
                    } else {
                        if (~var20 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field4441 == null) {
                            super.field4441 = new byte[4][][];
                        }
                        for (int var32 = 0; var32 < 4; ++var32) {
                            byte var33 = arg8.method2337(-1);
                            if (~var33 == -1 && super.field4441[arg1] != null) {
                                if (arg9 >= var32) {
                                    int var34 = arg0;
                                    int var35 = arg0 + 7;
                                    int var36 = arg4;
                                    if (var35 >= 0) {
                                        if (var35 >= super.field4434) {
                                            var35 = super.field4434;
                                        }
                                    } else {
                                        var35 = 0;
                                    }
                                    int var37 = arg4 + 7;
                                    if (~arg4 <= -1) {
                                        if (super.field4426 <= arg4) {
                                            var36 = super.field4426;
                                        }
                                    } else {
                                        var36 = 0;
                                    }
                                    if (arg0 >= 0) {
                                        if (arg0 >= super.field4434) {
                                            var34 = super.field4434;
                                        }
                                    } else {
                                        var34 = 0;
                                    }
                                    if (var37 < 0) {
                                        var37 = 0;
                                    } else if (~var37 <= ~super.field4426) {
                                        var37 = super.field4426;
                                    }
                                    while (var34 < var35) {
                                        while (~var37 < ~var36) {
                                            super.field4441[arg1][var34][var36] = 0;
                                            ++var36;
                                        }
                                        ++var34;
                                    }
                                }
                            } else if (~var33 == -2) {
                                if (super.field4441[arg1] == null) {
                                    super.field4441[arg1] = new byte[super.field4434 - -1][super.field4426 + 1];
                                }
                                for (int var38 = 0; var38 < 64; var38 += 4) {
                                    for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                        byte var40 = arg8.method2337(-1);
                                        if (~var32 >= ~arg9) {
                                            for (int var41 = var38; ~var41 > ~(var38 - -4); ++var41) {
                                                for (int var42 = var39; ~var42 > ~(var39 + 4); ++var42) {
                                                    if (var41 >= var14 && var14 + 8 > var41 && var42 >= var15 && var15 - -8 > var15) {
                                                        int var43 = class438.method2578((byte) -82, var41 & 7, var42 & 7, arg5) + arg0;
                                                        int var44 = arg4 - -class316.method1848(arg5, (byte) 127, var42 & 7, 7 & var41);
                                                        if (var43 >= 0 && super.field4434 > var43 && var44 >= 0 && ~var44 > ~super.field4426) {
                                                            super.field4441[arg1][var43][var44] = var40;
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
                    class102.method760(arg0 >> 3, arg4 >> 3, (byte) -44, var13);
                }
                if (!var12 && super.field4441 != null && super.field4441[arg1] != null) {
                    int var16 = arg0 + 7;
                    int var17 = arg4 + 7;
                    for (int var18 = arg0; ~var18 > ~var16; ++var18) {
                        for (int var19 = arg4; var17 > var19; ++var19) {
                            super.field4441[arg1][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILya;)V")
    public final void method2076(int arg0, class38 arg1) {
        ++field5094;
        class485.method2854(arg1);
        if (arg0 > -112) {
            this.method2073(-10, (class141) null, 70, -54, 106, false, (class38) null);
        }
        if (~super.field4430 < -2) {
            for (int var3 = 0; super.field4434 > var3; ++var3) {
                for (int var4 = 0; ~super.field4426 < ~var4; ++var4) {
                    if (~(class267.field3700[1][var3][var4] & 2) == -3) {
                        class329.method1908(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; super.field4430 > var5; ++var5) {
            for (int var6 = 0; var6 <= super.field4426; ++var6) {
                for (int var7 = 0; var7 <= super.field4434; ++var7) {
                    if (~(super.field4420[var5][var7][var6] & 1) != -1) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (var8 > 0 && ~(1 & super.field4420[var5][var7][var8 + -1]) != -1) {
                            --var8;
                        }
                        int var11 = var5;
                        while (super.field4426 > var9 && ~(super.field4420[var5][var7][var9 + 1] & 1) != -1) {
                            ++var9;
                        }
                        label170: while (var10 > 0) {
                            for (int var12 = var8; ~var12 >= ~var9; ++var12) {
                                if (~(1 & super.field4420[var10 + -1][var7][var12]) == -1) {
                                    break label170;
                                }
                            }
                            --var10;
                        }
                        label159: while (var11 < 3) {
                            for (int var13 = var8; var9 >= var13; ++var13) {
                                if (~(super.field4420[var11 + 1][var7][var13] & 1) == -1) {
                                    break label159;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (var9 + 1 - var8) * (-var10 + 1 + var11);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = super.field4410[var11][var7][var8] + -var15;
                            int var17 = super.field4410[var10][var7][var8];
                            class300.method1756(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) + 128, var16, var17);
                            for (int var18 = var10; ~var11 <= ~var18; ++var18) {
                                for (int var19 = var8; ~var9 <= ~var19; ++var19) {
                                    super.field4420[var18][var7][var19] = (byte) class251.method1501(super.field4420[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((super.field4420[var5][var7][var6] & 2) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (~var20 < -1 && ~(2 & super.field4420[var5][var20 - 1][var6]) != -1) {
                            --var20;
                        }
                        while (super.field4434 > var21 && ~(super.field4420[var5][var21 + 1][var6] & 2) != -1) {
                            ++var21;
                        }
                        int var23 = var5;
                        label224: while (~var22 < -1) {
                            for (int var24 = var20; ~var21 <= ~var24; ++var24) {
                                if (~(2 & super.field4420[var22 + -1][var24][var6]) == -1) {
                                    break label224;
                                }
                            }
                            --var22;
                        }
                        label213: while (var23 < 3) {
                            for (int var25 = var20; var21 >= var25; ++var25) {
                                if (~(2 & super.field4420[var23 - -1][var25][var6]) == -1) {
                                    break label213;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (-var20 + 1 + var21) * (-var22 + 1 + var23);
                        if (~var26 <= -3) {
                            short var27 = 240;
                            int var28 = super.field4410[var23][var20][var6] + -var27;
                            int var29 = super.field4410[var22][var20][var6];
                            class300.method1756(2, var20 << 7, (var21 << 7) + 128, var6 << 7, var6 << 7, var28, var29);
                            for (int var30 = var22; ~var23 <= ~var30; ++var30) {
                                for (int var31 = var20; var31 <= var21; ++var31) {
                                    super.field4420[var30][var31][var6] = (byte) class251.method1501(super.field4420[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((super.field4420[var5][var7][var6] & 4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (~var34 < -1 && (super.field4420[var5][var7][var34 - 1] & 4) != 0) {
                            --var34;
                        }
                        while (super.field4426 > var35 && ~(super.field4420[var5][var7][var35 + 1] & 4) != -1) {
                            ++var35;
                        }
                        label278: while (~var32 < -1) {
                            for (int var36 = var34; var35 >= var36; ++var36) {
                                if ((super.field4420[var5][var32 - 1][var36] & 4) == 0) {
                                    break label278;
                                }
                            }
                            --var32;
                        }
                        label267: while (super.field4434 > var33) {
                            for (int var37 = var34; var37 <= var35; ++var37) {
                                if ((super.field4420[var5][var33 + 1][var37] & 4) == 0) {
                                    break label267;
                                }
                            }
                            ++var33;
                        }
                        if ((var33 - var32 - -1) * (-var34 + var35 + 1) >= 4) {
                            int var38 = super.field4410[var5][var32][var34];
                            class300.method1756(4, var32 << 7, (var33 << 7) + 128, var34 << 7, (var35 << 7) + 128, var38, var38);
                            for (int var39 = var32; ~var39 >= ~var33; ++var39) {
                                for (int var40 = var34; var35 >= var40; ++var40) {
                                    super.field4420[var5][var39][var40] = (byte) class251.method1501(super.field4420[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field4420 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lya;[Leq;[BIZI)V")
    public final void method2077(class38 arg0, class141[] arg1, byte[] arg2, int arg3, boolean arg4, int arg5) {
        ++field5100;
        class391 var7 = new class391(arg2);
        if (!arg4) {
            this.method2071((class38) null, (class391) null, -48, -34, 19, (int[]) null);
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method2322((byte) 49);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method2332(2);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = 63 & var10;
                int var13 = (var10 & 4078) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method2348(-2);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = var13 - -arg5;
                int var19 = arg3 + var12;
                if (~var18 < -1 && ~var19 < -1 && ~(super.field4434 + -1) < ~var18 && ~(super.field4426 - 1) < ~var19) {
                    class141 var20 = null;
                    if (!super.field4433) {
                        int var21 = var14;
                        if (~(2 & class267.field3700[1][var18][var19]) == -3) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg1[var21];
                        }
                    }
                    this.method2072(var8, arg0, var19, var20, var14, -1, var18, var14, (byte) -88, var17, var16);
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2078(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
