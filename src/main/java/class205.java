import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class205 extends class273 {

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public int field2830 = 99;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "Lcu;")
    public static class145 field2837 = new class145(48, -1);

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
    public static int field2838;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cd", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field2839;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1318(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ[BILqa;II[Lcl;III)V", line = 3)
    public final void method1310(int arg0, boolean arg1, byte[] arg2, int arg3, class162 arg4, int arg5, int arg6, class173[] arg7, int arg8, int arg9, int arg10) {
        ++field2838;
        if (arg1) {
            class379 var12 = new class379(arg2);
            int var13 = -1;
            while (true) {
                int var14 = var12.method2196((byte) -47);
                if (~var14 == -1) {
                    return;
                }
                var13 += var14;
                int var15 = 0;
                while (true) {
                    int var16 = var12.method2199((byte) 85);
                    if (~var16 == -1) {
                        break;
                    }
                    var15 += var16 + -1;
                    int var17 = var15 & 63;
                    int var18 = (var15 & 4081) >> 6;
                    int var19 = var15 >> 12;
                    int var20 = var12.method2238(255);
                    int var21 = var20 >> 2;
                    int var22 = var20 & 3;
                    if (arg9 == var19 && ~var18 <= ~arg0 && ~var18 > ~(arg0 + 8) && var17 >= arg8 && arg8 + 8 > var17) {
                        class1 var23 = class402.field5388.method1994(-17294, var13);
                        int var24 = class168.method1132(var23.field82, (byte) 48, var22, var23.field16, arg5, 7 & var18, 7 & var17) + arg6;
                        int var25 = class335.method1919(var23.field82, var22, var17 & 7, var23.field16, 7 & var18, arg5, 1059) + arg3;
                        if (~var24 < -1 && var25 > 0 && ~var24 > ~(super.field3585 + -1) && var25 < super.field3586 + -1) {
                            class173 var26 = null;
                            if (!super.field3592) {
                                int var27 = arg10;
                                if ((2 & class117.field1677[1][var24][var25]) == 2) {
                                    var27 = arg10 - 1;
                                }
                                if (~var27 <= -1) {
                                    var26 = arg7[var27];
                                }
                            }
                            this.method1314(-1, 38, arg4, var25, var26, 3 & arg5 + var22, var13, var24, arg10, arg10, var21);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(IIIZ)V", line = 86)
    public class205(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class516.field7655, class310.field4072);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lqa;B)V", line = 90)
    public final void method1311(class162 arg0, byte arg1) {
        ++field2829;
        class104.method726(arg0);
        if (~super.field3591 < -2) {
            for (int var3 = 0; super.field3585 > var3; ++var3) {
                for (int var4 = 0; ~super.field3586 < ~var4; ++var4) {
                    if ((class117.field1677[1][var3][var4] & 2) == 2) {
                        class380.method2253(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; ~super.field3591 < ~var5; ++var5) {
            for (int var6 = 0; var6 <= super.field3586; ++var6) {
                for (int var7 = 0; ~var7 >= ~super.field3585; ++var7) {
                    if ((1 & super.field3599[var5][var7][var6]) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        int var11 = var5;
                        while (~var8 < -1 && ~(1 & super.field3599[var5][var7][var8 - 1]) != -1) {
                            --var8;
                        }
                        while (var9 < super.field3586 && (super.field3599[var5][var7][var9 - -1] & 1) != 0) {
                            ++var9;
                        }
                        label169: while (~var10 < -1) {
                            for (int var12 = var8; ~var12 >= ~var9; ++var12) {
                                if ((super.field3599[var10 + -1][var7][var12] & 1) == 0) {
                                    break label169;
                                }
                            }
                            --var10;
                        }
                        label158: while (var11 < 3) {
                            for (int var13 = var8; ~var13 >= ~var9; ++var13) {
                                if (~(super.field3599[var11 + 1][var7][var13] & 1) == -1) {
                                    break label158;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (var11 - (var10 + -1)) * (-var8 + var9 + 1);
                        if (~var14 <= -3) {
                            short var15 = 240;
                            int var16 = super.field3574[var11][var7][var8] + -var15;
                            int var17 = super.field3574[var10][var7][var8];
                            class487.method2794(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) + 128, var16, var17);
                            for (int var18 = var10; var18 <= var11; ++var18) {
                                for (int var19 = var8; ~var9 <= ~var19; ++var19) {
                                    super.field3599[var18][var7][var19] = (byte) class494.method2839(super.field3599[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if (~(2 & super.field3599[var5][var7][var6]) != -1) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        int var23 = var5;
                        while (~var20 < -1 && ~(2 & super.field3599[var5][var20 - 1][var6]) != -1) {
                            --var20;
                        }
                        while (~var21 > ~super.field3585 && (2 & super.field3599[var5][var21 - -1][var6]) != 0) {
                            ++var21;
                        }
                        label222: while (~var22 < -1) {
                            for (int var24 = var20; ~var21 <= ~var24; ++var24) {
                                if (~(2 & super.field3599[var22 - 1][var24][var6]) == -1) {
                                    break label222;
                                }
                            }
                            --var22;
                        }
                        label211: while (var23 < 3) {
                            for (int var25 = var20; var21 >= var25; ++var25) {
                                if ((2 & super.field3599[var23 + 1][var25][var6]) == 0) {
                                    break label211;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (-var20 + 1 + var21) * (var23 + 1 + -var22);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = super.field3574[var23][var20][var6] + -var27;
                            int var29 = super.field3574[var22][var20][var6];
                            class487.method2794(2, var20 << 7, (var21 << 7) + 128, var6 << 7, var6 << 7, var28, var29);
                            for (int var30 = var22; var30 <= var23; ++var30) {
                                for (int var31 = var20; ~var31 >= ~var21; ++var31) {
                                    super.field3599[var30][var31][var6] = (byte) class494.method2839(super.field3599[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if (~(super.field3599[var5][var7][var6] & 4) != -1) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (var34 > 0 && (4 & super.field3599[var5][var7][var34 + -1]) != 0) {
                            --var34;
                        }
                        while (~super.field3586 < ~var35 && ~(super.field3599[var5][var7][var35 + 1] & 4) != -1) {
                            ++var35;
                        }
                        label275: while (~var32 < -1) {
                            for (int var36 = var34; var36 <= var35; ++var36) {
                                if (~(super.field3599[var5][var32 + -1][var36] & 4) == -1) {
                                    break label275;
                                }
                            }
                            --var32;
                        }
                        label264: while (var33 < super.field3585) {
                            for (int var37 = var34; ~var37 >= ~var35; ++var37) {
                                if (~(4 & super.field3599[var5][var33 - -1][var37]) == -1) {
                                    break label264;
                                }
                            }
                            ++var33;
                        }
                        if (~((var33 + 1 + -var32) * (var35 + 1 + -var34)) <= -5) {
                            int var38 = super.field3574[var5][var32][var34];
                            class487.method2794(4, var32 << 7, (var33 << 7) + 128, var34 << 7, (var35 << 7) + 128, var38, var38);
                            for (int var39 = var32; ~var39 >= ~var33; ++var39) {
                                for (int var40 = var34; ~var40 >= ~var35; ++var40) {
                                    super.field3599[var5][var39][var40] = (byte) class494.method2839(super.field3599[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field3599 = null;
        if (arg1 != 89) {
            field2837 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 376)
    public static void method1312(byte arg0) {
        if (arg0 != -54) {
            method1312((byte) 7);
        }
        field2837 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZIILcl;ILqa;)V", line = 390)
    public final void method1313(int arg0, boolean arg1, int arg2, int arg3, class173 arg4, int arg5, class162 arg6) {
        if (!arg1) {
            field2831 = -102;
        }
        ++field2834;
        class338 var8 = null;
        if (arg5 == 0) {
            var8 = (class338) class234.method1453(arg3, arg0, arg2);
        }
        if (arg5 == 1) {
            var8 = (class338) class463.method2642(arg3, arg0, arg2);
        }
        if (arg5 == 2) {
            var8 = (class338) class504.method2874(arg3, arg0, arg2, field2839 != null ? field2839 : (field2839 = method1318("np")));
        }
        if (~arg5 == -4) {
            var8 = (class338) class466.method2648(arg3, arg0, arg2);
        }
        if (var8 != null) {
            class1 var9 = class402.field5388.method1994(-17294, var8.method347((byte) -87));
            int var10 = var8.method345(-1736);
            int var11 = var8.method344(-4534);
            if (var9.method18(true)) {
                class374.method2169(arg0, -94, arg2, var9, arg3);
            }
            if (var8.method338(-104)) {
                var8.method340(arg6, 20203);
            }
            if (arg5 != 0) {
                if (arg5 == 1) {
                    class11 var12 = class463.method2642(arg3, arg0, arg2);
                    if (var12 instanceof class291) {
                        ((class291) var12).field3806 = null;
                        return;
                    }
                    class211.method1335(arg3, arg0, arg2);
                    return;
                }
                if (~arg5 != -3) {
                    if (arg5 == 3) {
                        class431 var13 = class466.method2648(arg3, arg0, arg2);
                        if (!(var13 instanceof class358)) {
                            class110.method764(arg3, arg0, arg2);
                        } else {
                            ((class358) var13).field4835 = null;
                        }
                        if (~var9.field84 == -2) {
                            arg4.method1161(arg2, arg0, -97);
                            return;
                        }
                    }
                    return;
                }
                class37 var14 = class504.method2874(arg3, arg0, arg2, field2839 != null ? field2839 : (field2839 = method1318("np")));
                if (var14 instanceof class124 && var14.field581 == arg0 && var14.field587 == arg2) {
                    ((class124) var14).field1828 = null;
                } else {
                    class179.method1187(arg3, arg0, arg2, field2839 != null ? field2839 : (field2839 = method1318("np")));
                }
                if (~var9.field84 != -1 && ~(var9.field82 + arg0) > ~super.field3585 && super.field3586 > var9.field82 + arg2 && arg0 - -var9.field16 < super.field3585 && ~(arg2 - -var9.field16) > ~super.field3586) {
                    arg4.method1153(var9.field16, arg0, (byte) 11, !var9.field32, var9.field82, var11, arg2, var9.field75);
                    return;
                }
                return;
            }
            class56 var15 = class234.method1453(arg3, arg0, arg2);
            if (!(var15 instanceof class286)) {
                class33.method262(arg3, arg0, arg2);
            } else {
                ((class286) var15).field3732 = null;
            }
            if (var9.field84 != 0) {
                arg4.method1163(var11, arg0, var10, var9.field75, 3, !var9.field32, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILqa;ILcl;IIIIII)V", line = 505)
    public final void method1314(int arg0, int arg1, class162 arg2, int arg3, class173 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field2832;
        if (class154.field2244.method1855((byte) -101, class166.field2414) || class63.method436(arg8, arg3, arg7, class455.field6229, -2860)) {
            if (arg9 < this.field2830) {
                this.field2830 = arg9;
            }
            class1 var12 = class402.field5388.method1994(-17294, arg6);
            if (!arg2.method519() || !class154.field2244.field7754 || !var12.field18) {
                int var13;
                int var14;
                if (arg5 != 1 && ~arg5 != -4) {
                    var13 = var12.field82;
                    var14 = var12.field16;
                } else {
                    var13 = var12.field16;
                    var14 = var12.field82;
                }
                int var15;
                int var16;
                if (~super.field3585 > ~(arg7 + var13)) {
                    var15 = arg7 + 1;
                    var16 = arg7;
                } else {
                    var15 = (var13 + 1 >> 1) + arg7;
                    var16 = (var13 >> 1) + arg7;
                }
                int var17;
                int var18;
                if (~super.field3586 > ~(arg3 - -var14)) {
                    var17 = arg3 + 1;
                    var18 = arg3;
                } else {
                    var18 = arg3 - -(var14 >> 1);
                    var17 = (var14 + 1 >> 1) + arg3;
                }
                if (arg1 < 15) {
                    this.method1314(20, 16, (class162) null, -29, (class173) null, 36, -121, -116, -30, -103, 113);
                }
                class35 var19 = class141.field2049[arg8];
                int var20 = var19.method272(var16, var18) - -var19.method272(var15, var18) - (-var19.method272(var16, var17) + -var19.method272(var15, var17)) >> 2;
                int var21 = (arg7 << 7) + (var13 << 6);
                int var22 = (arg3 << 7) + (var14 << 6);
                boolean var23 = class285.field3723 && !super.field3592 && var12.field77;
                if (var12.method18(true)) {
                    class229.method1430(var12, 71, (class515) null, (class117) null, arg7, arg5, arg9, arg3);
                }
                boolean var24 = ~arg0 == 0 && ~var12.field74 == 0 && var12.field43 == null && var12.field58 == null && !var12.field42;
                if (!class57.field885 || (!class324.method1871(false, arg10) || ~var12.field47 == -2) && (!class61.method429(arg10, 2) || var12.field47 != 0)) {
                    if (arg10 == 22) {
                        if (class154.field2244.field7764 || ~var12.field83 != -1 || ~var12.field84 == -2 || var12.field69) {
                            class431 var25;
                            if (!var24) {
                                var25 = new class180(arg2, var12, arg9, arg8, var21, var20, var22, super.field3592, arg5, arg0);
                            } else {
                                class456 var26 = new class456(arg2, var12, arg8, var21, var20, var22, super.field3592, arg5, var23);
                                if (var26.method338(-28)) {
                                    var26.method337(-7803, arg2);
                                }
                                var25 = var26;
                            }
                            class431 var27 = class466.method2648(arg9, arg7, arg3);
                            if (!(var27 instanceof class358)) {
                                class427.method2461(arg9, arg7, arg3, var25);
                            } else {
                                ((class358) var27).field4835 = var25;
                            }
                            if (var12.field84 == 1 && arg4 != null) {
                                arg4.method1158(arg7, (byte) -35, arg3);
                            }
                        }
                    } else if (~arg10 != -11 && arg10 != 11) {
                        if (arg10 >= 12 && ~arg10 >= -18 || ~arg10 <= -19 && ~arg10 >= -22) {
                            class37 var29;
                            if (var24) {
                                class77 var28 = new class77(arg2, var12, arg9, arg8, var21, var20, var22, super.field3592, arg7, arg7 - 1 + var13, arg3, arg3 + -1 + var14, arg10, arg5, var23);
                                var29 = var28;
                                if (var28.method338(-24)) {
                                    var28.method337(-7803, arg2);
                                }
                            } else {
                                var29 = new class271(arg2, var12, arg9, arg8, var21, var20, var22, super.field3592, arg7, arg7 - 1 + var13, arg3, arg3 + var14 + -1, arg10, arg5, arg0);
                            }
                            class37 var30 = class504.method2874(arg9, arg7, arg3, field2839 != null ? field2839 : (field2839 = method1318("np")));
                            if (var30 instanceof class124 && var30.field581 == arg7 && ~var30.field587 == ~arg3) {
                                ((class124) var30).field1828 = var29;
                            } else {
                                class48.method357(var29, false);
                            }
                            if (class285.field3723 && !super.field3592 && arg10 >= 12 && ~arg10 >= -18 && ~arg10 != -14 && ~arg9 < -1 && ~var12.field47 != -1) {
                                super.field3599[arg9][arg7][arg3] = (byte) class191.method1230(super.field3599[arg9][arg7][arg3], 4);
                            }
                            if (~var12.field84 != -1 && arg4 != null) {
                                arg4.method1149(!var12.field32, var12.field75, var13, arg7, var14, arg3, false);
                            }
                        } else if (arg10 == 0) {
                            int var31 = var12.field47;
                            if (class83.field1240 && var12.field47 == -1) {
                                var31 = 1;
                            }
                            class56 var33;
                            if (var24) {
                                class51 var32 = new class51(arg2, var12, arg8, var21, var20, var22, super.field3592, arg10, arg5, var23);
                                var33 = var32;
                                if (var32.method338(-38)) {
                                    var32.method337(-7803, arg2);
                                }
                            } else {
                                var33 = new class47(arg2, var12, arg9, arg8, var21, var20, var22, super.field3592, arg10, arg5, arg0);
                            }
                            class56 var34 = class234.method1453(arg9, arg7, arg3);
                            if (!(var34 instanceof class286)) {
                                class310.method1800(arg9, arg7, arg3, var33, (class56) null);
                            } else {
                                ((class286) var34).field3732 = var33;
                            }
                            if (class285.field3723) {
                                if (~arg5 != -1) {
                                    if (arg5 != 1) {
                                        if (arg5 == 2) {
                                            if (var12.field67) {
                                                var19.method277(arg7 + 1, arg3, 50);
                                                var19.method277(arg7 + 1, arg3 - -1, 50);
                                            }
                                            if (var31 == 1 && !super.field3592) {
                                                super.field3599[arg9][arg7 + 1][arg3] = (byte) class191.method1230(super.field3599[arg9][arg7 + 1][arg3], 1);
                                            }
                                        } else if (arg5 == 3) {
                                            if (var12.field67) {
                                                var19.method277(arg7, arg3, 50);
                                                var19.method277(arg7 + 1, arg3, 50);
                                            }
                                            if (~var31 == -2 && !super.field3592) {
                                                super.field3599[arg9][arg7][arg3] = (byte) class191.method1230(super.field3599[arg9][arg7][arg3], 2);
                                            }
                                        }
                                    } else {
                                        if (var12.field67) {
                                            var19.method277(arg7, arg3 - -1, 50);
                                            var19.method277(arg7 + 1, arg3 + 1, 50);
                                        }
                                        if (~var31 == -2 && !super.field3592) {
                                            super.field3599[arg9][arg7][arg3 + 1] = (byte) class191.method1230(super.field3599[arg9][arg7][arg3 + 1], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field67) {
                                        var19.method277(arg7, arg3, 50);
                                        var19.method277(arg7, arg3 + 1, 50);
                                    }
                                    if (var31 == 1 && !super.field3592) {
                                        super.field3599[arg9][arg7][arg3] = (byte) class191.method1230(super.field3599[arg9][arg7][arg3], 1);
                                    }
                                }
                            }
                            if (var12.field84 != 0 && arg4 != null) {
                                arg4.method1162(arg5, arg10, (byte) 110, var12.field75, !var12.field32, arg3, arg7);
                            }
                            if (~var12.field39 != -17) {
                                class371.method2149(arg9, arg7, arg3, var12.field39);
                            }
                        } else if (arg10 == 1) {
                            class56 var35;
                            if (!var24) {
                                var35 = new class47(arg2, var12, arg9, arg8, var21, var20, var22, super.field3592, arg10, arg5, arg0);
                            } else {
                                class51 var36 = new class51(arg2, var12, arg8, var21, var20, var22, super.field3592, arg10, arg5, var23);
                                if (var36.method338(-61)) {
                                    var36.method337(-7803, arg2);
                                }
                                var35 = var36;
                            }
                            class56 var37 = class234.method1453(arg9, arg7, arg3);
                            if (var37 instanceof class286) {
                                ((class286) var37).field3732 = var35;
                            } else {
                                class310.method1800(arg9, arg7, arg3, var35, (class56) null);
                            }
                            if (var12.field67 && class285.field3723) {
                                if (~arg5 != -1) {
                                    if (~arg5 == -2) {
                                        var19.method277(arg7 + 1, arg3 + 1, 50);
                                    } else if (arg5 == 2) {
                                        var19.method277(arg7 + 1, arg3, 50);
                                    } else if (arg5 == 3) {
                                        var19.method277(arg7, arg3, 50);
                                    }
                                } else {
                                    var19.method277(arg7, arg3 + 1, 50);
                                }
                            }
                            if (~var12.field84 != -1 && arg4 != null) {
                                arg4.method1162(arg5, arg10, (byte) 108, var12.field75, !var12.field32, arg3, arg7);
                            }
                        } else if (~arg10 == -3) {
                            int var38 = 3 & arg5 - -1;
                            class56 var41;
                            class56 var42;
                            if (var24) {
                                class51 var39 = new class51(arg2, var12, arg8, var21, var20, var22, super.field3592, arg10, arg5 + 4, var23);
                                class51 var40 = new class51(arg2, var12, arg8, var21, var20, var22, super.field3592, arg10, var38, var23);
                                if (var39.method338(-84)) {
                                    var39.method337(-7803, arg2);
                                }
                                if (var40.method338(-116)) {
                                    var40.method337(-7803, arg2);
                                }
                                var41 = var39;
                                var42 = var40;
                            } else {
                                var41 = new class47(arg2, var12, arg9, arg8, var21, var20, var22, super.field3592, arg10, arg5 + 4, arg0);
                                var42 = new class47(arg2, var12, arg9, arg8, var21, var20, var22, super.field3592, arg10, var38, arg0);
                            }
                            class310.method1800(arg9, arg7, arg3, var41, var42);
                            if (~var12.field47 == -2 && class285.field3723 && !super.field3592) {
                                if (arg5 != 0) {
                                    if (arg5 != 1) {
                                        if (arg5 != 2) {
                                            if (~arg5 == -4) {
                                                super.field3599[arg9][arg7][arg3] = (byte) class191.method1230(super.field3599[arg9][arg7][arg3], 2);
                                                super.field3599[arg9][arg7][arg3] = (byte) class191.method1230(super.field3599[arg9][arg7][arg3], 1);
                                            }
                                        } else {
                                            super.field3599[arg9][arg7 + 1][arg3] = (byte) class191.method1230(super.field3599[arg9][arg7 + 1][arg3], 1);
                                            super.field3599[arg9][arg7][arg3] = (byte) class191.method1230(super.field3599[arg9][arg7][arg3], 2);
                                        }
                                    } else {
                                        super.field3599[arg9][arg7][arg3 - -1] = (byte) class191.method1230(super.field3599[arg9][arg7][arg3 - -1], 2);
                                        super.field3599[arg9][arg7 - -1][arg3] = (byte) class191.method1230(super.field3599[arg9][arg7 - -1][arg3], 1);
                                    }
                                } else {
                                    super.field3599[arg9][arg7][arg3] = (byte) class191.method1230(super.field3599[arg9][arg7][arg3], 1);
                                    super.field3599[arg9][arg7][arg3 - -1] = (byte) class191.method1230(super.field3599[arg9][arg7][arg3 - -1], 2);
                                }
                            }
                            if (var12.field84 != 0 && arg4 != null) {
                                arg4.method1162(arg5, arg10, (byte) -82, var12.field75, !var12.field32, arg3, arg7);
                            }
                            if (var12.field39 != 16) {
                                class371.method2149(arg9, arg7, arg3, var12.field39);
                            }
                        } else if (~arg10 == -4) {
                            class56 var43;
                            if (!var24) {
                                var43 = new class47(arg2, var12, arg9, arg8, var21, var20, var22, super.field3592, arg10, arg5, arg0);
                            } else {
                                class51 var44 = new class51(arg2, var12, arg8, var21, var20, var22, super.field3592, arg10, arg5, var23);
                                var43 = var44;
                                if (var44.method338(-123)) {
                                    var44.method337(-7803, arg2);
                                }
                            }
                            class56 var45 = class234.method1453(arg9, arg7, arg3);
                            if (var45 instanceof class286) {
                                ((class286) var45).field3732 = var43;
                            } else {
                                class310.method1800(arg9, arg7, arg3, var43, (class56) null);
                            }
                            if (var12.field67 && class285.field3723) {
                                if (arg5 != 0) {
                                    if (arg5 != 1) {
                                        if (arg5 == 2) {
                                            var19.method277(arg7 + 1, arg3, 50);
                                        } else if (~arg5 == -4) {
                                            var19.method277(arg7, arg3, 50);
                                        }
                                    } else {
                                        var19.method277(arg7 + 1, arg3 + 1, 50);
                                    }
                                } else {
                                    var19.method277(arg7, arg3 - -1, 50);
                                }
                            }
                            if (~var12.field84 != -1 && arg4 != null) {
                                arg4.method1162(arg5, arg10, (byte) -85, var12.field75, !var12.field32, arg3, arg7);
                            }
                        } else if (~arg10 == -10) {
                            class37 var46;
                            if (!var24) {
                                var46 = new class271(arg2, var12, arg9, arg8, var21, var20, var22, super.field3592, arg7, arg7 - -var13 + -1, arg3, arg3 - (-var14 + 1), arg10, arg5, arg0);
                            } else {
                                class77 var47 = new class77(arg2, var12, arg9, arg8, var21, var20, var22, super.field3592, arg7, arg7, arg3, arg3, arg10, arg5, var23);
                                var46 = var47;
                                if (var47.method338(-42)) {
                                    var47.method337(-7803, arg2);
                                }
                            }
                            class37 var48 = class504.method2874(arg9, arg7, arg3, field2839 != null ? field2839 : (field2839 = method1318("np")));
                            if (var48 instanceof class124 && var48.field581 == arg7 && var48.field587 == arg3) {
                                ((class124) var48).field1828 = var46;
                            } else {
                                class48.method357(var46, false);
                            }
                            if (var12.field84 != 0 && arg4 != null) {
                                arg4.method1149(!var12.field32, var12.field75, var13, arg7, var14, arg3, false);
                            }
                            if (var12.field39 != 16) {
                                class371.method2149(arg9, arg7, arg3, var12.field39);
                            }
                        } else if (~arg10 == -5) {
                            class11 var49;
                            if (!var24) {
                                var49 = new class478(arg2, var12, arg9, arg8, var21, var20, var22, super.field3592, 0, 0, 0, arg10, arg5, arg0);
                            } else {
                                class245 var50 = new class245(arg2, var12, arg8, var21, var20, var22, super.field3592, 0, 0, 0, arg10, arg5);
                                var49 = var50;
                                if (var50.method338(-79)) {
                                    var50.method337(-7803, arg2);
                                }
                            }
                            class11 var51 = class463.method2642(arg9, arg7, arg3);
                            if (!(var51 instanceof class291)) {
                                class399.method2328(arg9, arg7, arg3, var49, (class11) null);
                            } else {
                                ((class291) var51).field3806 = var49;
                            }
                        } else if (~arg10 == -6) {
                            int var52 = 17;
                            class338 var53 = (class338) class234.method1453(arg9, arg7, arg3);
                            if (var53 != null) {
                                var52 = 1 + class402.field5388.method1994(-17294, var53.method347((byte) -87)).field39;
                            }
                            class11 var54;
                            if (!var24) {
                                var54 = new class478(arg2, var12, arg9, arg8, var21, var20, var22, super.field3592, 0, class80.field1191[arg5] * var52, class129.field1881[arg5] * var52, arg10, arg5, arg0);
                            } else {
                                class245 var55 = new class245(arg2, var12, arg8, var21, var20, var22, super.field3592, 0, class80.field1191[arg5] * var52, class129.field1881[arg5] * var52, arg10, arg5);
                                if (var55.method338(-113)) {
                                    var55.method337(-7803, arg2);
                                }
                                var54 = var55;
                            }
                            class11 var56 = class463.method2642(arg9, arg7, arg3);
                            if (var56 instanceof class291) {
                                ((class291) var56).field3806 = var54;
                            } else {
                                class399.method2328(arg9, arg7, arg3, var54, (class11) null);
                            }
                        } else if (~arg10 == -7) {
                            int var57 = 9;
                            class338 var58 = (class338) class234.method1453(arg9, arg7, arg3);
                            if (var58 != null) {
                                var57 = 1 + class402.field5388.method1994(-17294, var58.method347((byte) -87)).field39 / 2;
                            }
                            class11 var60;
                            if (var24) {
                                class245 var59 = new class245(arg2, var12, arg8, var21, var20, var22, super.field3592, arg5, class80.field1191[arg5] * var57, class129.field1881[arg5] * var57, arg10, arg5 + 4);
                                var60 = var59;
                                if (var59.method338(-44)) {
                                    var59.method337(-7803, arg2);
                                }
                            } else {
                                var60 = new class478(arg2, var12, arg9, arg8, var21, var20, var22, super.field3592, arg5, class517.field7656[arg5] * var57, class236.field3165[arg5] * var57, arg10, arg5 + 4, arg0);
                            }
                            class11 var61 = class463.method2642(arg9, arg7, arg3);
                            if (var61 instanceof class291) {
                                ((class291) var61).field3806 = var60;
                            } else {
                                class399.method2328(arg9, arg7, arg3, var60, (class11) null);
                            }
                        } else if (arg10 == 7) {
                            int var62 = arg5 + 2 & 3;
                            class11 var64;
                            if (var24) {
                                class245 var63 = new class245(arg2, var12, arg8, var21, var20, var22, super.field3592, var62, 0, 0, arg10, var62 - -4);
                                var64 = var63;
                                if (var63.method338(-119)) {
                                    var63.method337(-7803, arg2);
                                }
                            } else {
                                var64 = new class478(arg2, var12, arg9, arg8, var21, var20, var22, super.field3592, var62, 0, 0, arg10, var62 + 4, arg0);
                            }
                            class11 var65 = class463.method2642(arg9, arg7, arg3);
                            if (var65 instanceof class291) {
                                ((class291) var65).field3806 = var64;
                            } else {
                                class399.method2328(arg9, arg7, arg3, var64, (class11) null);
                            }
                        } else if (arg10 == 8) {
                            int var66 = arg5 + 2 & 3;
                            int var67 = 9;
                            class338 var68 = (class338) class234.method1453(arg9, arg7, arg3);
                            if (var68 != null) {
                                var67 = 1 + class402.field5388.method1994(-17294, var68.method347((byte) -87)).field39 / 2;
                            }
                            class11 var71;
                            class11 var72;
                            if (!var24) {
                                class478 var69 = new class478(arg2, var12, arg9, arg8, var21, var20, var22, super.field3592, arg5, class517.field7656[arg5] * var67, class236.field3165[arg5] * var67, arg10, arg5 + 4, arg0);
                                class478 var70 = new class478(arg2, var12, arg9, arg8, var21, var20, var22, super.field3592, arg5, 0, 0, arg10, var66 + 4, arg0);
                                var71 = var69;
                                var72 = var70;
                            } else {
                                class245 var73 = new class245(arg2, var12, arg8, var21, var20, var22, super.field3592, arg5, class517.field7656[arg5] * var67, class236.field3165[arg5] * var67, arg10, arg5 + 4);
                                class245 var74 = new class245(arg2, var12, arg8, var21, var20, var22, super.field3592, arg5, 0, 0, arg10, var66 + 4);
                                if (var73.method338(-92)) {
                                    var73.method337(-7803, arg2);
                                }
                                var72 = var74;
                                if (var74.method338(-103)) {
                                    var74.method337(-7803, arg2);
                                }
                                var71 = var73;
                            }
                            class399.method2328(arg9, arg7, arg3, var71, var72);
                        }
                    } else {
                        class77 var75 = null;
                        int var77;
                        class37 var78;
                        if (var24) {
                            class77 var76 = new class77(arg2, var12, arg9, arg8, var21, var20, var22, super.field3592, arg7, arg7 - -var13 + -1, arg3, arg3 - -var14 + -1, arg10, arg5, var23);
                            var77 = var76.method488(2048);
                            var75 = var76;
                            var78 = var76;
                        } else {
                            var78 = new class271(arg2, var12, arg9, arg8, var21, var20, var22, super.field3592, arg7, arg7 + var13 + -1, arg3, var14 - 1 + arg3, arg10, arg5, arg0);
                            var77 = 15;
                        }
                        class37 var79 = class504.method2874(arg9, arg7, arg3, field2839 != null ? field2839 : (field2839 = method1318("np")));
                        boolean var80 = false;
                        if (var79 instanceof class124 && ~var79.field581 == ~arg7 && var79.field587 == arg3) {
                            ((class124) var79).field1828 = var78;
                            var80 = true;
                        }
                        if (var80 || class48.method357(var78, false)) {
                            if (var75 != null && var75.method338(-88)) {
                                var75.method337(-7803, arg2);
                            }
                            if (var12.field67 && class285.field3723) {
                                if (~var77 < -31) {
                                    var77 = 30;
                                }
                                for (int var81 = 0; var81 <= var13; ++var81) {
                                    for (int var82 = 0; ~var82 >= ~var14; ++var82) {
                                        var19.method277(arg7 - -var81, arg3 + var82, var77);
                                    }
                                }
                            }
                        }
                        if (~var12.field84 != -1 && arg4 != null) {
                            arg4.method1149(!var12.field32, var12.field75, var13, arg7, var14, arg3, false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[Lcl;[BILqa;I)V", line = 1225)
    public final void method1315(int arg0, class173[] arg1, byte[] arg2, int arg3, class162 arg4, int arg5) {
        ++field2833;
        if (arg5 > 51) {
            class379 var7 = new class379(arg2);
            int var8 = -1;
            while (true) {
                int var9 = var7.method2196((byte) -47);
                if (~var9 == -1) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.method2199((byte) 92);
                    if (~var11 == -1) {
                        break;
                    }
                    var10 += var11 - 1;
                    int var12 = var10 & 63;
                    int var13 = var10 >> 6 & 63;
                    int var14 = var10 >> 12;
                    int var15 = var7.method2238(255);
                    int var16 = var15 >> 2;
                    int var17 = 3 & var15;
                    int var18 = arg0 + var13;
                    int var19 = arg3 + var12;
                    if (~var18 < -1 && ~var19 < -1 && var18 < super.field3585 + -1 && var19 < super.field3586 + -1) {
                        class173 var20 = null;
                        if (!super.field3592) {
                            int var21 = var14;
                            if (~(2 & class117.field1677[1][var18][var19]) == -3) {
                                var21 = var14 - 1;
                            }
                            if (var21 >= 0) {
                                var20 = arg1[var21];
                            }
                        }
                        this.method1314(-1, 31, arg4, var19, var20, var17, var8, var18, var14, var14, var16);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILmd;[IIIIILqa;III)V", line = 1300)
    public final void method1316(int arg0, class379 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, class162 arg7, int arg8, int arg9, int arg10) {
        ++field2836;
        if (!super.field3592) {
            boolean var12 = false;
            class149 var13 = null;
            if (arg2 != null) {
                arg2[0] = -1;
            }
            int var14 = (arg5 & 7) * 8;
            int var15 = (arg6 & 7) * 8;
            while (true) {
                while (arg1.field5152.length > arg1.field5173) {
                    int var20 = arg1.method2238(255);
                    if (var20 == 0) {
                        var13 = new class149(arg1);
                    } else if (var20 == 1) {
                        int var34 = arg1.method2238(255);
                        if (~var34 < -1) {
                            for (int var35 = 0; var34 > var35; ++var35) {
                                class360 var36 = new class360(arg7, arg1, 0);
                                if (var36.field4866 == 31) {
                                    class405 var37 = class201.field2792.method2833(-11521, arg1.method2212((byte) 83));
                                    var36.method2096(var37.field5569, var37.field5572, var37.field5573, var37.field5574, 115);
                                }
                                if (arg7.method597() > 0) {
                                    class451 var38 = var36.field4867;
                                    int var39 = var38.method2577((byte) -61) >> 7;
                                    int var40 = var38.method2582((byte) 70) >> 7;
                                    if (var36.field4850 == arg10 && ~var14 >= ~var39 && ~var39 > ~(var14 + 8) && var15 <= var40 && ~(var15 - -8) < ~var40) {
                                        int var41 = class257.method1544(var38.method2582((byte) 70) & 1023, arg8 + 125, arg0, var38.method2577((byte) -107) & 1023) + (arg3 << 7);
                                        int var42 = var41 >> 7;
                                        int var43 = class478.method2741(var38.method2582((byte) 70) & 1023, (byte) 80, arg0, var38.method2577((byte) -93) & 1023) + (arg4 << 7);
                                        int var44 = var43 >> 7;
                                        if (~var42 <= -1 && ~var44 <= -1 && ~var42 > ~super.field3585 && ~super.field3586 < ~var44) {
                                            var38.method169((byte) 124, var41, var43, super.field3574[arg10][var42][var44] + -var38.method2581(arg8 ^ 28));
                                            if (arg7.method597() > 0) {
                                                class215.method1348(var36);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2) {
                        if (var13 == null) {
                            var13 = new class149();
                        }
                        var13.method1027(arg1, arg8 + 8);
                    } else if (~var20 == -129) {
                        if (arg2 == null) {
                            arg1.field5173 += 10;
                        } else {
                            arg2[0] = arg1.method2212((byte) 83);
                            arg2[1] = arg1.method2202(-26372);
                            arg2[2] = arg1.method2202(-26372);
                            arg2[3] = arg1.method2202(class106.method743(arg8, -26372));
                            arg2[4] = arg1.method2212((byte) 83);
                        }
                    } else {
                        if (var20 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field3593 == null) {
                            super.field3593 = new byte[4][][];
                        }
                        for (int var21 = 0; var21 < 4; ++var21) {
                            byte var22 = arg1.method2194(arg8 + -1);
                            if (var22 == 0 && super.field3593[arg9] != null) {
                                if (arg10 >= var21) {
                                    int var23 = arg3;
                                    int var24 = arg3 + 7;
                                    int var25 = arg4;
                                    if (arg4 < 0) {
                                        var25 = 0;
                                    } else if (~arg4 <= ~super.field3586) {
                                        var25 = super.field3586;
                                    }
                                    if (var24 < 0) {
                                        var24 = 0;
                                    } else if (var24 >= super.field3585) {
                                        var24 = super.field3585;
                                    }
                                    if (~arg3 > -1) {
                                        var23 = 0;
                                    } else if (arg3 >= super.field3585) {
                                        var23 = super.field3585;
                                    }
                                    int var26 = arg4 + 7;
                                    if (var26 >= 0) {
                                        if (super.field3586 <= var26) {
                                            var26 = super.field3586;
                                        }
                                    } else {
                                        var26 = 0;
                                    }
                                    while (var23 < var24) {
                                        while (var25 < var26) {
                                            super.field3593[arg9][var23][var25] = 0;
                                            ++var25;
                                        }
                                        ++var23;
                                    }
                                }
                            } else if (~var22 == -2) {
                                if (super.field3593[arg9] == null) {
                                    super.field3593[arg9] = new byte[super.field3585 + 1][super.field3586 - -1];
                                }
                                for (int var27 = 0; ~var27 > -65; var27 += 4) {
                                    for (int var28 = 0; ~var28 > -65; var28 += 4) {
                                        byte var29 = arg1.method2194(arg8 + -1);
                                        if (~var21 >= ~arg10) {
                                            for (int var30 = var27; var30 < var27 - -4; ++var30) {
                                                for (int var31 = var28; var31 < var28 - -4; ++var31) {
                                                    if (var14 <= var30 && ~(var14 - -8) < ~var30 && ~var31 <= ~var15 && ~(var15 + 8) < ~var15) {
                                                        int var32 = arg3 - -class241.method1483(-30927, var30 & 7, arg0, var31 & 7);
                                                        int var33 = class40.method294(var31 & 7, (byte) -58, arg0, 7 & var30) + arg4;
                                                        if (var32 >= 0 && super.field3585 > var32 && var33 >= 0 && ~var33 > ~super.field3586) {
                                                            super.field3593[arg9][var32][var33] = var29;
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
                    class425.method2450(arg3 >> 3, arg4 >> 3, (byte) 124, var13);
                }
                if (!var12 && super.field3593 != null && super.field3593[arg9] != null) {
                    int var16 = arg3 + 7;
                    int var17 = arg4 + 7;
                    for (int var18 = arg3; ~var18 > ~var16; ++var18) {
                        for (int var19 = arg4; var17 > var19; ++var19) {
                            super.field3593[arg9][var18][var19] = 0;
                        }
                    }
                }
                if (arg8 != 0) {
                    this.method1317(46, (class162) null, -88, -123, (int[]) null, (class379) null);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILqa;II[ILmd;)V", line = 1594)
    public final void method1317(int arg0, class162 arg1, int arg2, int arg3, int[] arg4, class379 arg5) {
        ++field2835;
        if (!super.field3592) {
            boolean var7 = false;
            if (arg4 != null) {
                arg4[0] = -1;
            }
            class149 var8 = null;
            while (true) {
                int var19;
                label318: do {
                    while (true) {
                        while (~arg5.field5152.length < ~arg5.field5173) {
                            int var18 = arg5.method2238(255);
                            if (var18 != 0) {
                                if (~var18 == -2) {
                                    var19 = arg5.method2238(255);
                                    continue label318;
                                }
                                if (~var18 == -3) {
                                    if (var8 == null) {
                                        var8 = new class149();
                                    }
                                    var8.method1027(arg5, 8);
                                } else if (var18 == 128) {
                                    if (arg4 != null) {
                                        arg4[0] = arg5.method2212((byte) 83);
                                        arg4[1] = arg5.method2202(-26372);
                                        arg4[2] = arg5.method2202(class106.method743(arg2, -24536));
                                        arg4[3] = arg5.method2202(class106.method743(arg2, -24536));
                                        arg4[4] = arg5.method2212((byte) 83);
                                    } else {
                                        arg5.field5173 += 10;
                                    }
                                } else {
                                    if (~var18 != -130) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field3593 == null) {
                                        super.field3593 = new byte[4][][];
                                    }
                                    var7 = true;
                                    for (int var28 = 0; ~var28 > -5; ++var28) {
                                        byte var29 = arg5.method2194(-1);
                                        if (var29 == 0 && super.field3593[var28] != null) {
                                            int var30 = arg0;
                                            int var31 = arg0 + 64;
                                            int var32 = arg3;
                                            if (var31 < 0) {
                                                var31 = 0;
                                            } else if (super.field3585 <= var31) {
                                                var31 = super.field3585;
                                            }
                                            if (~arg0 <= -1) {
                                                if (~super.field3585 >= ~arg0) {
                                                    var30 = super.field3585;
                                                }
                                            } else {
                                                var30 = 0;
                                            }
                                            if (~arg3 > -1) {
                                                var32 = 0;
                                            } else if (super.field3586 <= arg3) {
                                                var32 = super.field3586;
                                            }
                                            int var33 = arg3 + 64;
                                            if (~var33 <= -1) {
                                                if (~var33 <= ~super.field3586) {
                                                    var33 = super.field3586;
                                                }
                                            } else {
                                                var33 = 0;
                                            }
                                            while (var30 < var31) {
                                                while (~var32 > ~var33) {
                                                    super.field3593[var28][var30][var32] = 0;
                                                    ++var32;
                                                }
                                                ++var30;
                                            }
                                        } else if (~var29 == -2) {
                                            if (super.field3593[var28] == null) {
                                                super.field3593[var28] = new byte[super.field3585 - -1][super.field3586 + 1];
                                            }
                                            for (int var34 = 0; var34 < 64; var34 += 4) {
                                                for (int var35 = 0; ~var35 > -65; var35 += 4) {
                                                    byte var36 = arg5.method2194(arg2 ^ -14549);
                                                    for (int var37 = arg0 + var34; arg0 + var34 + 4 > var37; ++var37) {
                                                        for (int var38 = arg3 + var35; var35 - -arg3 + 4 > var38; ++var38) {
                                                            if (var37 >= 0 && super.field3585 > var37 && var38 >= 0 && super.field3586 > var38) {
                                                                super.field3593[var28][var37][var38] = var36;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (~var29 == -3) {
                                            if (super.field3593[var28] == null) {
                                                super.field3593[var28] = new byte[super.field3585 + 1][super.field3586 + 1];
                                            }
                                            if (~var28 < -1) {
                                                int var39 = arg0;
                                                int var40 = arg0 + 64;
                                                int var41 = arg3;
                                                if (arg0 >= 0) {
                                                    if (super.field3585 <= arg0) {
                                                        var39 = super.field3585;
                                                    }
                                                } else {
                                                    var39 = 0;
                                                }
                                                if (~var40 > -1) {
                                                    var40 = 0;
                                                } else if (super.field3585 <= var40) {
                                                    var40 = super.field3585;
                                                }
                                                int var42 = arg3 + 64;
                                                if (~arg3 > -1) {
                                                    var41 = 0;
                                                } else if (~arg3 <= ~super.field3586) {
                                                    var41 = super.field3586;
                                                }
                                                if (var42 >= 0) {
                                                    if (~var42 <= ~super.field3586) {
                                                        var42 = super.field3586;
                                                    }
                                                } else {
                                                    var42 = 0;
                                                }
                                                while (~var39 > ~var40) {
                                                    while (var41 < var42) {
                                                        super.field3593[var28][var39][var41] = super.field3593[var28 + -1][var39][var41];
                                                        ++var41;
                                                    }
                                                    ++var39;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var8 = new class149(arg5);
                            }
                        }
                        if (var8 != null) {
                            for (int var9 = 0; ~var9 > -9; ++var9) {
                                for (int var10 = 0; ~var10 > -9; ++var10) {
                                    int var11 = (arg0 >> 3) + var9;
                                    int var12 = (arg3 >> 3) + var10;
                                    if (var11 >= 0 && super.field3585 >> 3 > var11 && var12 >= 0 && super.field3586 >> 3 > var12) {
                                        class425.method2450(var11, var12, (byte) 116, var8);
                                    }
                                }
                            }
                        }
                        if (arg2 != 14548) {
                            field2831 = -39;
                        }
                        if (!var7 && super.field3593 != null) {
                            for (int var13 = 0; ~var13 > -5; ++var13) {
                                if (super.field3593[var13] != null) {
                                    for (int var14 = 0; var14 < 16; ++var14) {
                                        for (int var15 = 0; ~var15 > -17; ++var15) {
                                            int var16 = (arg0 >> 2) - -var14;
                                            int var17 = (arg3 >> 2) - -var15;
                                            if (~var16 <= -1 && var16 < 26 && var17 >= 0 && ~var17 > -27) {
                                                super.field3593[var13][var16][var17] = 0;
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
                    class360 var21 = new class360(arg1, arg5, 0);
                    if (~var21.field4866 == -32) {
                        class405 var22 = class201.field2792.method2833(-11521, arg5.method2212((byte) 83));
                        var21.method2096(var22.field5569, var22.field5572, var22.field5573, var22.field5574, 126);
                    }
                    if (~arg1.method597() < -1) {
                        class451 var23 = var21.field4867;
                        int var24 = (arg0 << 7) + var23.method2577((byte) -84);
                        int var25 = var23.method2582((byte) 70) + (arg3 << 7);
                        int var26 = var24 >> 7;
                        int var27 = var25 >> 7;
                        if (~var26 <= -1 && ~var27 <= -1 && ~super.field3585 < ~var26 && ~super.field3586 < ~var27) {
                            var23.method169((byte) 114, var24, var25, super.field3574[var21.field4850][var26][var27] + -var23.method2581(28));
                            if (~arg1.method597() < -1) {
                                class215.method1348(var21);
                            }
                        }
                    }
                }
            }
        }
    }
}
