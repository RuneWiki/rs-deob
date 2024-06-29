import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class75 {

    @OriginalMember(owner = "client!ft", name = "N", descriptor = "I")
    public int field42 = 99;

    @OriginalMember(owner = "client!ft", name = "G", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ft", name = "H", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ft", name = "I", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ft", name = "J", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ft", name = "K", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ft", name = "L", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ft", name = "M", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ft", name = "O", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ft", name = "P", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ft", name = "Q", descriptor = "I")
    public static int field45;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ft", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field46;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lya;I)V")
    public final void method16(class38 arg0, int arg1) {
        ++field44;
        class2.method8(arg0);
        if (arg1 == -10938) {
            if (super.field959 > 1) {
                for (int var3 = 0; super.field961 > var3; ++var3) {
                    for (int var4 = 0; ~super.field952 < ~var4; ++var4) {
                        if ((2 & class379.field4998[1][var3][var4]) == 2) {
                            class467.method2820(var3, var4);
                        }
                    }
                }
            }
            for (int var5 = 0; ~var5 > ~super.field959; ++var5) {
                for (int var6 = 0; ~super.field952 <= ~var6; ++var6) {
                    for (int var7 = 0; ~var7 >= ~super.field961; ++var7) {
                        if (~(super.field955[var5][var7][var6] & 1) != -1) {
                            int var8 = var6;
                            int var9 = var6;
                            int var10 = var5;
                            while (var9 < super.field952 && ~(1 & super.field955[var5][var7][var9 - -1]) != -1) {
                                ++var9;
                            }
                            int var11 = var5;
                            while (var8 > 0 && (1 & super.field955[var5][var7][var8 + -1]) != 0) {
                                --var8;
                            }
                            label170: while (~var10 < -1) {
                                for (int var12 = var8; ~var9 <= ~var12; ++var12) {
                                    if ((super.field955[var10 - 1][var7][var12] & 1) == 0) {
                                        break label170;
                                    }
                                }
                                --var10;
                            }
                            label159: while (var11 < 3) {
                                for (int var13 = var8; var9 >= var13; ++var13) {
                                    if (~(1 & super.field955[var11 + 1][var7][var13]) == -1) {
                                        break label159;
                                    }
                                }
                                ++var11;
                            }
                            int var14 = (var11 - -1 - var10) * (var9 + 1 + -var8);
                            if (~var14 <= -3) {
                                short var15 = 240;
                                int var16 = super.field967[var11][var7][var8] + -var15;
                                int var17 = super.field967[var10][var7][var8];
                                class135.method931(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) + 128, var16, var17);
                                for (int var18 = var10; var18 <= var11; ++var18) {
                                    for (int var19 = var8; ~var9 <= ~var19; ++var19) {
                                        super.field955[var18][var7][var19] = (byte) class378.method2145(super.field955[var18][var7][var19], -2);
                                    }
                                }
                            }
                        }
                        if (~(super.field955[var5][var7][var6] & 2) != -1) {
                            int var20 = var7;
                            int var21 = var7;
                            int var22 = var5;
                            int var23 = var5;
                            while (super.field961 > var21 && ~(2 & super.field955[var5][var21 - -1][var6]) != -1) {
                                ++var21;
                            }
                            while (~var20 < -1 && ~(super.field955[var5][var20 + -1][var6] & 2) != -1) {
                                --var20;
                            }
                            label224: while (~var22 < -1) {
                                for (int var24 = var20; ~var24 >= ~var21; ++var24) {
                                    if ((super.field955[var22 + -1][var24][var6] & 2) == 0) {
                                        break label224;
                                    }
                                }
                                --var22;
                            }
                            label213: while (~var23 > -4) {
                                for (int var25 = var20; ~var25 >= ~var21; ++var25) {
                                    if (~(super.field955[var23 - -1][var25][var6] & 2) == -1) {
                                        break label213;
                                    }
                                }
                                ++var23;
                            }
                            int var26 = (var23 - -1 - var22) * (-var20 + var21 + 1);
                            if (~var26 <= -3) {
                                short var27 = 240;
                                int var28 = super.field967[var23][var20][var6] + -var27;
                                int var29 = super.field967[var22][var20][var6];
                                class135.method931(2, var20 << 7, (var21 << 7) - -128, var6 << 7, var6 << 7, var28, var29);
                                for (int var30 = var22; var30 <= var23; ++var30) {
                                    for (int var31 = var20; var31 <= var21; ++var31) {
                                        super.field955[var30][var31][var6] = (byte) class378.method2145(super.field955[var30][var31][var6], -3);
                                    }
                                }
                            }
                        }
                        if (~(4 & super.field955[var5][var7][var6]) != -1) {
                            int var32 = var7;
                            int var33 = var7;
                            int var34;
                            for (var34 = var6; var34 > 0 && ~(4 & super.field955[var5][var7][var34 + -1]) != -1; --var34) {
                            }
                            int var35;
                            for (var35 = var6; ~var35 > ~super.field952 && (4 & super.field955[var5][var7][var35 - -1]) != 0; ++var35) {
                            }
                            label277: while (var32 > 0) {
                                for (int var36 = var34; var36 <= var35; ++var36) {
                                    if (~(super.field955[var5][var32 - 1][var36] & 4) == -1) {
                                        break label277;
                                    }
                                }
                                --var32;
                            }
                            label266: while (~var33 > ~super.field961) {
                                for (int var37 = var34; var35 >= var37; ++var37) {
                                    if ((super.field955[var5][var33 - -1][var37] & 4) == 0) {
                                        break label266;
                                    }
                                }
                                ++var33;
                            }
                            if (~((-var32 + var33 - -1) * (var35 + 1 + -var34)) <= -5) {
                                int var38 = super.field967[var5][var32][var34];
                                class135.method931(4, var32 << 7, (var33 << 7) - -128, var34 << 7, (var35 << 7) + 128, var38, var38);
                                for (int var39 = var32; var39 <= var33; ++var39) {
                                    for (int var40 = var34; var35 >= var40; ++var40) {
                                        super.field955[var5][var39][var40] = (byte) class378.method2145(super.field955[var5][var39][var40], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            super.field955 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(II[Lis;BLya;II[BIII)V")
    public final void method17(int arg0, int arg1, class348[] arg2, byte arg3, class38 arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9, int arg10) {
        ++field40;
        class463 var12 = new class463(arg7);
        if (arg3 <= 66) {
            this.method17(21, -68, (class348[]) null, (byte) -115, (class38) null, -78, 120, (byte[]) null, -86, 115, -124);
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method2725((byte) -63);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2763(-514944944);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = 63 & var15;
                int var18 = var15 >> 6 & 63;
                int var19 = var15 >> 12;
                int var20 = var12.method2737(false);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (~arg6 == ~var19 && ~arg1 >= ~var18 && arg1 - -8 > var18 && arg0 <= var17 && arg0 + 8 > var17) {
                    class102 var23 = class315.field4017.method1958(-10091, var13);
                    int var24 = class461.method2718(var22, 7 & var18, var17 & 7, var23.field1272, var23.field1282, arg5, 2) + arg8;
                    int var25 = arg9 + class445.method2624(var22, var18 & 7, var23.field1282, var23.field1272, var17 & 7, arg5, 1);
                    if (var24 > 0 && ~var25 < -1 && ~var24 > ~(super.field961 + -1) && ~var25 > ~(super.field952 + -1)) {
                        class348 var26 = null;
                        if (!super.field978) {
                            int var27 = arg10;
                            if (~(class379.field4998[1][var24][var25] & 2) == -3) {
                                var27 = arg10 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg2[var27];
                            }
                        }
                        this.method18(arg5 + var22 & 3, var25, var21, var13, arg10, var26, arg4, arg10, -1, -48, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIIILis;Lya;IIII)V")
    public final void method18(int arg0, int arg1, int arg2, int arg3, int arg4, class348 arg5, class38 arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field35;
        if (class407.field5817.method580(class377.field4959, (byte) -35) || class471.method2842(arg7, (byte) -87, arg10, class415.field5926, arg1)) {
            if (this.field42 > arg4) {
                this.field42 = arg4;
            }
            class102 var12 = class315.field4017.method1958(-10091, arg3);
            if (!arg6.method360() || !class407.field5817.field3625 || !var12.field1248) {
                int var13;
                int var14;
                if (~arg0 != -2 && arg0 != 3) {
                    var13 = var12.field1282;
                    var14 = var12.field1272;
                } else {
                    var14 = var12.field1282;
                    var13 = var12.field1272;
                }
                int var15;
                int var16;
                if (arg10 - -var14 <= super.field961) {
                    var15 = (var14 >> 1) + arg10;
                    var16 = (var14 + 1 >> 1) + arg10;
                } else {
                    var15 = arg10;
                    var16 = arg10 + 1;
                }
                int var17;
                int var18;
                if (super.field952 < arg1 + var13) {
                    var17 = arg1 + 1;
                    var18 = arg1;
                } else {
                    var18 = arg1 - -(var13 >> 1);
                    var17 = (var13 - -1 >> 1) + arg1;
                }
                class143 var19 = class520.field7520[arg7];
                int var20 = var19.method399(var15, var18) - (-var19.method399(var16, var18) + -var19.method399(var15, var17) - var19.method399(var16, var17)) >> 2;
                int var21 = (arg10 << 7) - -(var14 << 6);
                int var22 = (arg1 << 7) + (var13 << 6);
                boolean var23 = class505.field7276 && !super.field978 && var12.field1303;
                if (var12.method763(0)) {
                    class244.method1483(var12, arg1, arg0, (class223) null, (byte) -123, arg10, arg4, (class295) null);
                }
                boolean var24 = arg8 == -1 && var12.field1254 == -1 && var12.field1273 == null && var12.field1291 == null && !var12.field1253;
                if (!class1.field8 || (!class372.method2117(arg2, 12505) || var12.field1260 == 1) && (!class265.method1581(arg2, false) || var12.field1260 != 0)) {
                    if (arg9 > -17) {
                        this.field42 = -6;
                    }
                    if (~arg2 == -23) {
                        if (class407.field5817.field3618 || var12.field1305 != 0 || ~var12.field1246 == -2 || var12.field1262) {
                            class522 var26;
                            if (var24) {
                                class371 var25 = new class371(arg6, var12, arg7, var21, var20, var22, super.field978, arg0, var23);
                                var26 = var25;
                                if (var25.method182(-2286)) {
                                    var25.method184(-5534, arg6);
                                }
                            } else {
                                var26 = new class113(arg6, var12, arg4, arg7, var21, var20, var22, super.field978, arg0, arg8);
                            }
                            class522 var27 = class238.method1430(arg4, arg10, arg1);
                            if (!(var27 instanceof class156)) {
                                class24.method199(arg4, arg10, arg1, var26);
                            } else {
                                ((class156) var27).field1985 = var26;
                            }
                            if (var12.field1246 == 1 && arg5 != null) {
                                arg5.method2000(-116, arg1, arg10);
                            }
                        }
                    } else if (~arg2 != -11 && arg2 != 11) {
                        if (~arg2 <= -13 && arg2 <= 17 || ~arg2 <= -19 && ~arg2 >= -22) {
                            class205 var28;
                            if (!var24) {
                                var28 = new class293(arg6, var12, arg4, arg7, var21, var20, var22, super.field978, arg10, arg10 + var14 + -1, arg1, var13 - 1 + arg1, arg2, arg0, arg8);
                            } else {
                                class227 var29 = new class227(arg6, var12, arg4, arg7, var21, var20, var22, super.field978, arg10, var14 + -1 + arg10, arg1, var13 + -1 + arg1, arg2, arg0, var23);
                                var28 = var29;
                                if (var29.method182(-2286)) {
                                    var29.method184(-5534, arg6);
                                }
                            }
                            class205 var30 = class212.method1314(arg4, arg10, arg1, field46 != null ? field46 : (field46 = method26("fw")));
                            if (var30 instanceof class381 && var30.field2673 == arg10 && ~var30.field2671 == ~arg1) {
                                ((class381) var30).field5012 = var28;
                            } else {
                                class361.method2076(var28, false);
                            }
                            if (class505.field7276 && !super.field978 && ~arg2 <= -13 && arg2 <= 17 && arg2 != 13 && ~arg4 < -1 && var12.field1260 != 0) {
                                super.field955[arg4][arg10][arg1] = (byte) class215.method1323(super.field955[arg4][arg10][arg1], 4);
                            }
                            if (var12.field1246 != 0 && arg5 != null) {
                                arg5.method2003(var12.field1229, -78, arg1, var14, !var12.field1244, arg10, var13);
                            }
                        } else if (arg2 == 0) {
                            int var31 = var12.field1260;
                            if (class296.field3799 && ~var12.field1260 == 0) {
                                var31 = 1;
                            }
                            class314 var33;
                            if (var24) {
                                class482 var32 = new class482(arg6, var12, arg7, var21, var20, var22, super.field978, arg2, arg0, var23);
                                if (var32.method182(-2286)) {
                                    var32.method184(-5534, arg6);
                                }
                                var33 = var32;
                            } else {
                                var33 = new class22(arg6, var12, arg4, arg7, var21, var20, var22, super.field978, arg2, arg0, arg8);
                            }
                            class314 var34 = class20.method173(arg4, arg10, arg1);
                            if (!(var34 instanceof class329)) {
                                class317.method1868(arg4, arg10, arg1, var33, (class314) null);
                            } else {
                                ((class329) var34).field4146 = var33;
                            }
                            if (class505.field7276) {
                                if (arg0 == 0) {
                                    if (var12.field1304) {
                                        var19.method394(arg10, arg1, 50);
                                        var19.method394(arg10, arg1 + 1, 50);
                                    }
                                    if (var31 == 1 && !super.field978) {
                                        super.field955[arg4][arg10][arg1] = (byte) class215.method1323(super.field955[arg4][arg10][arg1], 1);
                                    }
                                } else if (arg0 != 1) {
                                    if (arg0 != 2) {
                                        if (~arg0 == -4) {
                                            if (var12.field1304) {
                                                var19.method394(arg10, arg1, 50);
                                                var19.method394(arg10 - -1, arg1, 50);
                                            }
                                            if (~var31 == -2 && !super.field978) {
                                                super.field955[arg4][arg10][arg1] = (byte) class215.method1323(super.field955[arg4][arg10][arg1], 2);
                                            }
                                        }
                                    } else {
                                        if (var12.field1304) {
                                            var19.method394(arg10 + 1, arg1, 50);
                                            var19.method394(arg10 + 1, arg1 - -1, 50);
                                        }
                                        if (var31 == 1 && !super.field978) {
                                            super.field955[arg4][arg10 + 1][arg1] = (byte) class215.method1323(super.field955[arg4][arg10 + 1][arg1], 1);
                                        }
                                    }
                                } else {
                                    if (var12.field1304) {
                                        var19.method394(arg10, arg1 + 1, 50);
                                        var19.method394(arg10 + 1, arg1 - -1, 50);
                                    }
                                    if (var31 == 1 && !super.field978) {
                                        super.field955[arg4][arg10][arg1 + 1] = (byte) class215.method1323(super.field955[arg4][arg10][arg1 + 1], 2);
                                    }
                                }
                            }
                            if (var12.field1246 != 0 && arg5 != null) {
                                arg5.method1990(arg10, !var12.field1244, arg2, 1, var12.field1229, arg0, arg1);
                            }
                            if (~var12.field1259 != -17) {
                                class9.method56(arg4, arg10, arg1, var12.field1259);
                            }
                        } else if (arg2 == 1) {
                            class314 var35;
                            if (!var24) {
                                var35 = new class22(arg6, var12, arg4, arg7, var21, var20, var22, super.field978, arg2, arg0, arg8);
                            } else {
                                class482 var36 = new class482(arg6, var12, arg7, var21, var20, var22, super.field978, arg2, arg0, var23);
                                if (var36.method182(-2286)) {
                                    var36.method184(-5534, arg6);
                                }
                                var35 = var36;
                            }
                            class314 var37 = class20.method173(arg4, arg10, arg1);
                            if (var37 instanceof class329) {
                                ((class329) var37).field4146 = var35;
                            } else {
                                class317.method1868(arg4, arg10, arg1, var35, (class314) null);
                            }
                            if (var12.field1304 && class505.field7276) {
                                if (~arg0 != -1) {
                                    if (~arg0 == -2) {
                                        var19.method394(arg10 - -1, arg1 + 1, 50);
                                    } else if (arg0 == 2) {
                                        var19.method394(arg10 + 1, arg1, 50);
                                    } else if (~arg0 == -4) {
                                        var19.method394(arg10, arg1, 50);
                                    }
                                } else {
                                    var19.method394(arg10, arg1 - -1, 50);
                                }
                            }
                            if (~var12.field1246 != -1 && arg5 != null) {
                                arg5.method1990(arg10, !var12.field1244, arg2, 1, var12.field1229, arg0, arg1);
                            }
                        } else if (arg2 == 2) {
                            int var38 = 3 & arg0 + 1;
                            class314 var41;
                            class314 var42;
                            if (var24) {
                                class482 var39 = new class482(arg6, var12, arg7, var21, var20, var22, super.field978, arg2, arg0 + 4, var23);
                                class482 var40 = new class482(arg6, var12, arg7, var21, var20, var22, super.field978, arg2, var38, var23);
                                if (var39.method182(-2286)) {
                                    var39.method184(-5534, arg6);
                                }
                                var41 = var40;
                                var42 = var39;
                                if (var40.method182(-2286)) {
                                    var40.method184(-5534, arg6);
                                }
                            } else {
                                var42 = new class22(arg6, var12, arg4, arg7, var21, var20, var22, super.field978, arg2, arg0 - -4, arg8);
                                var41 = new class22(arg6, var12, arg4, arg7, var21, var20, var22, super.field978, arg2, var38, arg8);
                            }
                            class317.method1868(arg4, arg10, arg1, var42, var41);
                            if (~var12.field1260 == -2 && class505.field7276 && !super.field978) {
                                if (arg0 == 0) {
                                    super.field955[arg4][arg10][arg1] = (byte) class215.method1323(super.field955[arg4][arg10][arg1], 1);
                                    super.field955[arg4][arg10][arg1 + 1] = (byte) class215.method1323(super.field955[arg4][arg10][arg1 + 1], 2);
                                } else if (~arg0 != -2) {
                                    if (arg0 == 2) {
                                        super.field955[arg4][arg10 - -1][arg1] = (byte) class215.method1323(super.field955[arg4][arg10 - -1][arg1], 1);
                                        super.field955[arg4][arg10][arg1] = (byte) class215.method1323(super.field955[arg4][arg10][arg1], 2);
                                    } else if (arg0 == 3) {
                                        super.field955[arg4][arg10][arg1] = (byte) class215.method1323(super.field955[arg4][arg10][arg1], 2);
                                        super.field955[arg4][arg10][arg1] = (byte) class215.method1323(super.field955[arg4][arg10][arg1], 1);
                                    }
                                } else {
                                    super.field955[arg4][arg10][arg1 - -1] = (byte) class215.method1323(super.field955[arg4][arg10][arg1 - -1], 2);
                                    super.field955[arg4][arg10 - -1][arg1] = (byte) class215.method1323(super.field955[arg4][arg10 - -1][arg1], 1);
                                }
                            }
                            if (~var12.field1246 != -1 && arg5 != null) {
                                arg5.method1990(arg10, !var12.field1244, arg2, 1, var12.field1229, arg0, arg1);
                            }
                            if (~var12.field1259 != -17) {
                                class9.method56(arg4, arg10, arg1, var12.field1259);
                            }
                        } else if (arg2 == 3) {
                            class314 var44;
                            if (var24) {
                                class482 var43 = new class482(arg6, var12, arg7, var21, var20, var22, super.field978, arg2, arg0, var23);
                                var44 = var43;
                                if (var43.method182(-2286)) {
                                    var43.method184(-5534, arg6);
                                }
                            } else {
                                var44 = new class22(arg6, var12, arg4, arg7, var21, var20, var22, super.field978, arg2, arg0, arg8);
                            }
                            class314 var45 = class20.method173(arg4, arg10, arg1);
                            if (var45 instanceof class329) {
                                ((class329) var45).field4146 = var44;
                            } else {
                                class317.method1868(arg4, arg10, arg1, var44, (class314) null);
                            }
                            if (var12.field1304 && class505.field7276) {
                                if (~arg0 != -1) {
                                    if (arg0 != 1) {
                                        if (~arg0 == -3) {
                                            var19.method394(arg10 + 1, arg1, 50);
                                        } else if (~arg0 == -4) {
                                            var19.method394(arg10, arg1, 50);
                                        }
                                    } else {
                                        var19.method394(arg10 + 1, arg1 + 1, 50);
                                    }
                                } else {
                                    var19.method394(arg10, arg1 + 1, 50);
                                }
                            }
                            if (~var12.field1246 != -1 && arg5 != null) {
                                arg5.method1990(arg10, !var12.field1244, arg2, 1, var12.field1229, arg0, arg1);
                            }
                        } else if (arg2 == 9) {
                            class205 var47;
                            if (var24) {
                                class227 var46 = new class227(arg6, var12, arg4, arg7, var21, var20, var22, super.field978, arg10, arg10, arg1, arg1, arg2, arg0, var23);
                                if (var46.method182(-2286)) {
                                    var46.method184(-5534, arg6);
                                }
                                var47 = var46;
                            } else {
                                var47 = new class293(arg6, var12, arg4, arg7, var21, var20, var22, super.field978, arg10, var14 - 1 + arg10, arg1, var13 + -1 + arg1, arg2, arg0, arg8);
                            }
                            class205 var48 = class212.method1314(arg4, arg10, arg1, field46 != null ? field46 : (field46 = method26("fw")));
                            if (var48 instanceof class381 && var48.field2673 == arg10 && var48.field2671 == arg1) {
                                ((class381) var48).field5012 = var47;
                            } else {
                                class361.method2076(var47, false);
                            }
                            if (~var12.field1246 != -1 && arg5 != null) {
                                arg5.method2003(var12.field1229, -5, arg1, var14, !var12.field1244, arg10, var13);
                            }
                            if (var12.field1259 != 16) {
                                class9.method56(arg4, arg10, arg1, var12.field1259);
                            }
                        } else if (arg2 == 4) {
                            class372 var50;
                            if (var24) {
                                class341 var49 = new class341(arg6, var12, arg7, var21, var20, var22, super.field978, 0, 0, 0, arg2, arg0);
                                if (var49.method182(-2286)) {
                                    var49.method184(-5534, arg6);
                                }
                                var50 = var49;
                            } else {
                                var50 = new class51(arg6, var12, arg4, arg7, var21, var20, var22, super.field978, 0, 0, 0, arg2, arg0, arg8);
                            }
                            class372 var51 = class140.method952(arg4, arg10, arg1);
                            if (!(var51 instanceof class85)) {
                                class475.method2867(arg4, arg10, arg1, var50, (class372) null);
                            } else {
                                ((class85) var51).field1060 = var50;
                            }
                        } else if (~arg2 == -6) {
                            int var52 = 17;
                            class41 var53 = (class41) class20.method173(arg4, arg10, arg1);
                            if (var53 != null) {
                                var52 = 1 + class315.field4017.method1958(-10091, var53.method187(21067)).field1259;
                            }
                            class372 var54;
                            if (!var24) {
                                var54 = new class51(arg6, var12, arg4, arg7, var21, var20, var22, super.field978, 0, class130.field1714[arg0] * var52, class317.field4051[arg0] * var52, arg2, arg0, arg8);
                            } else {
                                class341 var55 = new class341(arg6, var12, arg7, var21, var20, var22, super.field978, 0, class130.field1714[arg0] * var52, class317.field4051[arg0] * var52, arg2, arg0);
                                if (var55.method182(-2286)) {
                                    var55.method184(-5534, arg6);
                                }
                                var54 = var55;
                            }
                            class372 var56 = class140.method952(arg4, arg10, arg1);
                            if (var56 instanceof class85) {
                                ((class85) var56).field1060 = var54;
                            } else {
                                class475.method2867(arg4, arg10, arg1, var54, (class372) null);
                            }
                        } else if (arg2 == 6) {
                            int var57 = 9;
                            class41 var58 = (class41) class20.method173(arg4, arg10, arg1);
                            if (var58 != null) {
                                var57 = class315.field4017.method1958(-10091, var58.method187(21067)).field1259 / 2 + 1;
                            }
                            class372 var60;
                            if (var24) {
                                class341 var59 = new class341(arg6, var12, arg7, var21, var20, var22, super.field978, arg0, class130.field1714[arg0] * var57, class317.field4051[arg0] * var57, arg2, arg0 + 4);
                                if (var59.method182(-2286)) {
                                    var59.method184(-5534, arg6);
                                }
                                var60 = var59;
                            } else {
                                var60 = new class51(arg6, var12, arg4, arg7, var21, var20, var22, super.field978, arg0, class338.field4248[arg0] * var57, class304.field3896[arg0] * var57, arg2, arg0 - -4, arg8);
                            }
                            class372 var61 = class140.method952(arg4, arg10, arg1);
                            if (var61 instanceof class85) {
                                ((class85) var61).field1060 = var60;
                            } else {
                                class475.method2867(arg4, arg10, arg1, var60, (class372) null);
                            }
                        } else if (~arg2 == -8) {
                            int var62 = 3 & arg0 - -2;
                            class372 var64;
                            if (var24) {
                                class341 var63 = new class341(arg6, var12, arg7, var21, var20, var22, super.field978, var62, 0, 0, arg2, var62 - -4);
                                if (var63.method182(-2286)) {
                                    var63.method184(-5534, arg6);
                                }
                                var64 = var63;
                            } else {
                                var64 = new class51(arg6, var12, arg4, arg7, var21, var20, var22, super.field978, var62, 0, 0, arg2, var62 - -4, arg8);
                            }
                            class372 var65 = class140.method952(arg4, arg10, arg1);
                            if (var65 instanceof class85) {
                                ((class85) var65).field1060 = var64;
                            } else {
                                class475.method2867(arg4, arg10, arg1, var64, (class372) null);
                            }
                        } else if (~arg2 == -9) {
                            int var66 = arg0 + 2 & 3;
                            int var67 = 9;
                            class41 var68 = (class41) class20.method173(arg4, arg10, arg1);
                            if (var68 != null) {
                                var67 = class315.field4017.method1958(-10091, var68.method187(21067)).field1259 / 2 - -1;
                            }
                            class372 var71;
                            class372 var72;
                            if (!var24) {
                                class51 var69 = new class51(arg6, var12, arg4, arg7, var21, var20, var22, super.field978, arg0, class338.field4248[arg0] * var67, class304.field3896[arg0] * var67, arg2, arg0 + 4, arg8);
                                class51 var70 = new class51(arg6, var12, arg4, arg7, var21, var20, var22, super.field978, arg0, 0, 0, arg2, var66 - -4, arg8);
                                var71 = var69;
                                var72 = var70;
                            } else {
                                class341 var73 = new class341(arg6, var12, arg7, var21, var20, var22, super.field978, arg0, class338.field4248[arg0] * var67, class304.field3896[arg0] * var67, arg2, arg0 - -4);
                                class341 var74 = new class341(arg6, var12, arg7, var21, var20, var22, super.field978, arg0, 0, 0, arg2, var66 + 4);
                                if (var73.method182(-2286)) {
                                    var73.method184(-5534, arg6);
                                }
                                if (var74.method182(-2286)) {
                                    var74.method184(-5534, arg6);
                                }
                                var71 = var73;
                                var72 = var74;
                            }
                            class475.method2867(arg4, arg10, arg1, var71, var72);
                        }
                    } else {
                        class227 var75 = null;
                        int var77;
                        class205 var78;
                        if (var24) {
                            class227 var76 = new class227(arg6, var12, arg4, arg7, var21, var20, var22, super.field978, arg10, var14 + -1 + arg10, arg1, arg1 - (-var13 + 1), arg2, arg0, var23);
                            var77 = var76.method1384(true);
                            var78 = var76;
                            var75 = var76;
                        } else {
                            var78 = new class293(arg6, var12, arg4, arg7, var21, var20, var22, super.field978, arg10, arg10 + -1 + var14, arg1, var13 + -1 + arg1, arg2, arg0, arg8);
                            var77 = 15;
                        }
                        class205 var79 = class212.method1314(arg4, arg10, arg1, field46 != null ? field46 : (field46 = method26("fw")));
                        boolean var80 = false;
                        if (var79 instanceof class381 && var79.field2673 == arg10 && var79.field2671 == arg1) {
                            ((class381) var79).field5012 = var78;
                            var80 = true;
                        }
                        if (var80 || class361.method2076(var78, false)) {
                            if (var75 != null && var75.method182(-2286)) {
                                var75.method184(-5534, arg6);
                            }
                            if (var12.field1304 && class505.field7276) {
                                if (~var77 < -31) {
                                    var77 = 30;
                                }
                                for (int var81 = 0; ~var14 <= ~var81; ++var81) {
                                    for (int var82 = 0; var82 <= var13; ++var82) {
                                        var19.method394(arg10 + var81, arg1 + var82, var77);
                                    }
                                }
                            }
                        }
                        if (~var12.field1246 != -1 && arg5 != null) {
                            arg5.method2003(var12.field1229, 122, arg1, var14, !var12.field1244, arg10, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)Lpf;")
    public static final class413 method19(byte arg0) {
        if (arg0 > -60) {
            return null;
        } else {
            ++field37;
            class413 var1 = (class413) class456.field6571.method2096(0);
            if (var1 != null) {
                --class438.field6291;
                return var1;
            } else {
                return new class413();
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(IIIZ)V")
    public class4(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class2.field13, class359.field4633);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIILya;Lis;I)V")
    public final void method20(int arg0, int arg1, int arg2, int arg3, class38 arg4, class348 arg5, int arg6) {
        ++field41;
        class41 var8 = null;
        if (~arg0 == -1) {
            var8 = (class41) class20.method173(arg3, arg6, arg1);
        }
        if (arg2 == 2592) {
            if (~arg0 == -2) {
                var8 = (class41) class140.method952(arg3, arg6, arg1);
            }
            if (arg0 == 2) {
                var8 = (class41) class212.method1314(arg3, arg6, arg1, field46 != null ? field46 : (field46 = method26("fw")));
            }
            if (~arg0 == -4) {
                var8 = (class41) class238.method1430(arg3, arg6, arg1);
            }
            if (var8 != null) {
                class102 var9 = class315.field4017.method1958(-10091, var8.method187(21067));
                int var10 = var8.method189(32725);
                int var11 = var8.method178(true);
                if (var9.method763(0)) {
                    class99.method746(-233, arg1, arg6, arg3, var9);
                }
                if (var8.method182(-2286)) {
                    var8.method185(arg2 ^ 13829, arg4);
                }
                if (arg0 == 0) {
                    class314 var12 = class20.method173(arg3, arg6, arg1);
                    if (!(var12 instanceof class329)) {
                        class229.method1391(arg3, arg6, arg1);
                    } else {
                        ((class329) var12).field4146 = null;
                    }
                    if (~var9.field1246 != -1) {
                        arg5.method1996(-1, arg1, var11, arg6, !var9.field1244, var10, var9.field1229);
                        return;
                    }
                } else if (~arg0 != -2) {
                    if (arg0 == 2) {
                        class205 var13 = class212.method1314(arg3, arg6, arg1, field46 != null ? field46 : (field46 = method26("fw")));
                        if (var13 instanceof class381 && var13.field2673 == arg6 && var13.field2671 == arg1) {
                            ((class381) var13).field5012 = null;
                        } else {
                            class381.method2161(arg3, arg6, arg1, field46 != null ? field46 : (field46 = method26("fw")));
                        }
                        if (var9.field1246 != 0 && arg6 - -var9.field1272 < super.field961 && super.field952 > arg1 - -var9.field1272 && ~(var9.field1282 + arg6) > ~super.field961 && var9.field1282 + arg1 < super.field952) {
                            arg5.method1995(var9.field1282, !var9.field1244, arg6, (byte) -60, var11, arg1, var9.field1229, var9.field1272);
                            return;
                        }
                        return;
                    }
                    if (~arg0 == -4) {
                        class522 var14 = class238.method1430(arg3, arg6, arg1);
                        if (!(var14 instanceof class156)) {
                            class242.method1475(arg3, arg6, arg1);
                        } else {
                            ((class156) var14).field1985 = null;
                        }
                        if (var9.field1246 == 1) {
                            arg5.method1993(arg6, arg2 + -2511, arg1);
                            return;
                        }
                    }
                } else {
                    class372 var15 = class140.method952(arg3, arg6, arg1);
                    if (!(var15 instanceof class85)) {
                        class200.method1261(arg3, arg6, arg1);
                        return;
                    }
                    ((class85) var15).field1060 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILfh;II[IIILya;III)V")
    public final void method21(int arg0, class463 arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, class38 arg7, int arg8, int arg9, int arg10) {
        ++field39;
        if (!super.field978) {
            boolean var12 = false;
            if (arg4 != null) {
                arg4[0] = -1;
            }
            class524 var13 = null;
            int var14 = (arg0 & 7) * 8;
            int var15 = (7 & arg5) * 8;
            if (arg9 != 30208) {
                this.method17(56, 64, (class348[]) null, (byte) 76, (class38) null, -60, 73, (byte[]) null, -23, -88, -85);
            }
            while (true) {
                int var21;
                label241: do {
                    while (true) {
                        while (arg1.field6631 < arg1.field6618.length) {
                            int var20 = arg1.method2737(false);
                            if (var20 != 0) {
                                if (~var20 == -2) {
                                    var21 = arg1.method2737(false);
                                    continue label241;
                                }
                                if (~var20 == -3) {
                                    if (var13 == null) {
                                        var13 = new class524();
                                    }
                                    var13.method3126(arg1, (byte) 67);
                                } else if (var20 == 128) {
                                    if (arg4 == null) {
                                        arg1.field6631 += 10;
                                    } else {
                                        arg4[0] = arg1.method2758((byte) 79);
                                        arg4[1] = arg1.method2791(true);
                                        arg4[2] = arg1.method2791(true);
                                        arg4[3] = arg1.method2791(true);
                                        arg4[4] = arg1.method2758((byte) 113);
                                    }
                                } else {
                                    if (var20 != 129) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field956 == null) {
                                        super.field956 = new byte[4][][];
                                    }
                                    for (int var32 = 0; ~var32 > -5; ++var32) {
                                        byte var33 = arg1.method2793(32767);
                                        if (var33 == 0 && super.field956[arg10] != null) {
                                            if (var32 <= arg2) {
                                                int var34 = arg6;
                                                int var35 = arg6 - -7;
                                                int var36 = arg8;
                                                int var37 = arg8 + 7;
                                                if (~arg8 <= -1) {
                                                    if (~arg8 <= ~super.field952) {
                                                        var36 = super.field952;
                                                    }
                                                } else {
                                                    var36 = 0;
                                                }
                                                if (arg6 >= 0) {
                                                    if (super.field961 <= arg6) {
                                                        var34 = super.field961;
                                                    }
                                                } else {
                                                    var34 = 0;
                                                }
                                                if (~var35 <= -1) {
                                                    if (super.field961 <= var35) {
                                                        var35 = super.field961;
                                                    }
                                                } else {
                                                    var35 = 0;
                                                }
                                                if (~var37 <= -1) {
                                                    if (~var37 <= ~super.field952) {
                                                        var37 = super.field952;
                                                    }
                                                } else {
                                                    var37 = 0;
                                                }
                                                while (var35 > var34) {
                                                    while (~var37 < ~var36) {
                                                        super.field956[arg10][var34][var36] = 0;
                                                        ++var36;
                                                    }
                                                    ++var34;
                                                }
                                            }
                                        } else if (~var33 == -2) {
                                            if (super.field956[arg10] == null) {
                                                super.field956[arg10] = new byte[super.field961 + 1][super.field952 - -1];
                                            }
                                            for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                                for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                                    byte var40 = arg1.method2793(32767);
                                                    if (~arg2 <= ~var32) {
                                                        for (int var41 = var38; ~var41 > ~(var38 + 4); ++var41) {
                                                            for (int var42 = var39; var42 < var39 + 4; ++var42) {
                                                                if (~var14 >= ~var41 && ~(var14 + 8) < ~var41 && ~var15 >= ~var42 && var15 < var15 + 8) {
                                                                    int var43 = class470.method2841(false, var41 & 7, arg3, var42 & 7) + arg6;
                                                                    int var44 = arg8 - -class222.method1352(var41 & 7, var42 & 7, arg3, -9);
                                                                    if (var43 >= 0 && ~var43 > ~super.field961 && ~var44 <= -1 && ~var44 > ~super.field952) {
                                                                        super.field956[arg10][var43][var44] = var40;
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
                                var13 = new class524(arg1);
                            }
                        }
                        if (var13 != null) {
                            class124.method875(arg9 + -30153, var13, arg6 >> 3, arg8 >> 3);
                        }
                        if (!var12 && super.field956 != null && super.field956[arg10] != null) {
                            int var16 = arg6 + 7;
                            int var17 = arg8 + 7;
                            for (int var18 = arg6; ~var16 < ~var18; ++var18) {
                                for (int var19 = arg8; var17 > var19; ++var19) {
                                    super.field956[arg10][var18][var19] = 0;
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (~var21 >= -1);
                for (int var22 = 0; ~var22 > ~var21; ++var22) {
                    class177 var23 = new class177(arg7, arg1, 0);
                    if (~var23.field2335 == -32) {
                        class440 var24 = class38.field503.method1601((byte) -126, arg1.method2758((byte) 118));
                        var23.method1134(var24.field6303, var24.field6305, var24.field6304, var24.field6306, arg9 ^ 30464);
                    }
                    if (arg7.method314() > 0) {
                        class256 var25 = var23.field2337;
                        int var26 = var25.method1539((byte) 100) >> 7;
                        int var27 = var25.method1537(arg9 ^ -409113468) >> 7;
                        if (~var23.field2343 == ~arg2 && var14 <= var26 && var14 - -8 > var26 && var27 >= var15 && var27 < var15 + 8) {
                            int var28 = class452.method2696(arg3, var25.method1537(-409134460) & 1023, false, 1023 & var25.method1539((byte) 86)) + (arg6 << 7);
                            int var29 = var28 >> 7;
                            int var30 = class314.method1842(var25.method1537(arg9 + -409164668) & 1023, (byte) -99, 1023 & var25.method1539((byte) 98), arg3) + (arg8 << 7);
                            int var31 = var30 >> 7;
                            if (~var29 <= -1 && var31 >= 0 && super.field961 > var29 && ~super.field952 < ~var31) {
                                var25.method1532(2, var30, super.field967[arg2][var29][var31] + -var25.method1536((byte) 103), var28);
                                if (~arg7.method314() < -1) {
                                    class524.method3127(var23);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lya;II[B[Lis;I)V")
    public final void method22(class38 arg0, int arg1, int arg2, byte[] arg3, class348[] arg4, int arg5) {
        ++field38;
        class463 var7 = new class463(arg3);
        if (arg1 == 28476) {
            int var8 = -1;
            while (true) {
                int var9 = var7.method2725((byte) -63);
                if (var9 == 0) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.method2763(-514944944);
                    if (~var11 == -1) {
                        break;
                    }
                    var10 += var11 + -1;
                    int var12 = 63 & var10;
                    int var13 = (4045 & var10) >> 6;
                    int var14 = var10 >> 12;
                    int var15 = var7.method2737(false);
                    int var16 = var15 >> 2;
                    int var17 = var15 & 3;
                    int var18 = arg5 + var13;
                    int var19 = arg2 + var12;
                    if (~var18 < -1 && var19 > 0 && var18 < super.field961 + -1 && ~(super.field952 - 1) < ~var19) {
                        class348 var20 = null;
                        if (!super.field978) {
                            int var21 = var14;
                            if ((2 & class379.field4998[1][var18][var19]) == 2) {
                                var21 = var14 - 1;
                            }
                            if (var21 >= 0) {
                                var20 = arg4[var21];
                            }
                        }
                        this.method18(var17, var19, var16, var8, var14, var20, arg0, var14, -1, -96, var18);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lfh;I[ILya;ZI)V")
    public final void method23(class463 arg0, int arg1, int[] arg2, class38 arg3, boolean arg4, int arg5) {
        ++field43;
        if (!super.field978) {
            boolean var7 = false;
            class524 var8 = null;
            if (arg2 != null) {
                arg2[0] = -1;
            }
            while (true) {
                int var19;
                label314: do {
                    while (true) {
                        while (~arg0.field6631 > ~arg0.field6618.length) {
                            int var18 = arg0.method2737(false);
                            if (var18 != 0) {
                                if (var18 == 1) {
                                    var19 = arg0.method2737(false);
                                    continue label314;
                                }
                                if (~var18 == -3) {
                                    if (var8 == null) {
                                        var8 = new class524();
                                    }
                                    var8.method3126(arg0, (byte) 21);
                                } else if (var18 == 128) {
                                    if (arg2 == null) {
                                        arg0.field6631 += 10;
                                    } else {
                                        arg2[0] = arg0.method2758((byte) 120);
                                        arg2[1] = arg0.method2791(true);
                                        arg2[2] = arg0.method2791(true);
                                        arg2[3] = arg0.method2791(arg4);
                                        arg2[4] = arg0.method2758((byte) 120);
                                    }
                                } else {
                                    if (~var18 != -130) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field956 == null) {
                                        super.field956 = new byte[4][][];
                                    }
                                    var7 = true;
                                    for (int var28 = 0; var28 < 4; ++var28) {
                                        byte var29 = arg0.method2793(32767);
                                        if (~var29 == -1 && super.field956[var28] != null) {
                                            int var30 = arg1;
                                            int var31 = arg1 + 64;
                                            int var32 = arg5;
                                            if (~var31 > -1) {
                                                var31 = 0;
                                            } else if (var31 >= super.field961) {
                                                var31 = super.field961;
                                            }
                                            if (~arg1 > -1) {
                                                var30 = 0;
                                            } else if (~super.field961 >= ~arg1) {
                                                var30 = super.field961;
                                            }
                                            int var33 = arg5 - -64;
                                            if (~arg5 > -1) {
                                                var32 = 0;
                                            } else if (~super.field952 >= ~arg5) {
                                                var32 = super.field952;
                                            }
                                            if (var33 < 0) {
                                                var33 = 0;
                                            } else if (super.field952 <= var33) {
                                                var33 = super.field952;
                                            }
                                            while (~var30 > ~var31) {
                                                while (var32 < var33) {
                                                    super.field956[var28][var30][var32] = 0;
                                                    ++var32;
                                                }
                                                ++var30;
                                            }
                                        } else if (var29 != 1) {
                                            if (var29 == 2) {
                                                if (super.field956[var28] == null) {
                                                    super.field956[var28] = new byte[super.field961 + 1][super.field952 - -1];
                                                }
                                                if (var28 > 0) {
                                                    int var34 = arg1;
                                                    int var35 = arg1 + 64;
                                                    int var36 = arg5;
                                                    if (var35 >= 0) {
                                                        if (~var35 <= ~super.field961) {
                                                            var35 = super.field961;
                                                        }
                                                    } else {
                                                        var35 = 0;
                                                    }
                                                    if (~arg5 <= -1) {
                                                        if (super.field952 <= arg5) {
                                                            var36 = super.field952;
                                                        }
                                                    } else {
                                                        var36 = 0;
                                                    }
                                                    int var37 = arg5 + 64;
                                                    if (~arg1 <= -1) {
                                                        if (super.field961 <= arg1) {
                                                            var34 = super.field961;
                                                        }
                                                    } else {
                                                        var34 = 0;
                                                    }
                                                    if (var37 >= 0) {
                                                        if (var37 >= super.field952) {
                                                            var37 = super.field952;
                                                        }
                                                    } else {
                                                        var37 = 0;
                                                    }
                                                    while (~var35 < ~var34) {
                                                        while (~var36 > ~var37) {
                                                            super.field956[var28][var34][var36] = super.field956[var28 + -1][var34][var36];
                                                            ++var36;
                                                        }
                                                        ++var34;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (super.field956[var28] == null) {
                                                super.field956[var28] = new byte[super.field961 + 1][super.field952 - -1];
                                            }
                                            for (int var38 = 0; var38 < 64; var38 += 4) {
                                                for (int var39 = 0; var39 < 64; var39 += 4) {
                                                    byte var40 = arg0.method2793(32767);
                                                    for (int var41 = arg1 + var38; var38 - -arg1 + 4 > var41; ++var41) {
                                                        for (int var42 = var39 - -arg5; arg5 + var39 + 4 > var42; ++var42) {
                                                            if (var41 >= 0 && super.field961 > var41 && ~var42 <= -1 && super.field952 > var42) {
                                                                super.field956[var28][var41][var42] = var40;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var8 = new class524(arg0);
                            }
                        }
                        if (!arg4) {
                            return;
                        }
                        if (var8 != null) {
                            for (int var9 = 0; var9 < 8; ++var9) {
                                for (int var10 = 0; ~var10 > -9; ++var10) {
                                    int var11 = (arg1 >> 3) + var9;
                                    int var12 = (arg5 >> 3) + var10;
                                    if (~var11 <= -1 && ~var11 > ~(super.field961 >> 3) && ~var12 <= -1 && ~(super.field952 >> 3) < ~var12) {
                                        class124.method875(63, var8, var11, var12);
                                    }
                                }
                            }
                        }
                        if (!var7 && super.field956 != null) {
                            for (int var13 = 0; ~var13 > -5; ++var13) {
                                if (super.field956[var13] != null) {
                                    for (int var14 = 0; ~var14 > -17; ++var14) {
                                        for (int var15 = 0; ~var15 > -17; ++var15) {
                                            int var16 = (arg1 >> 2) + var14;
                                            int var17 = (arg5 >> 2) - -var15;
                                            if (~var16 <= -1 && var16 < 26 && var17 >= 0 && var17 < 26) {
                                                super.field956[var13][var16][var17] = 0;
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
                for (int var20 = 0; ~var19 < ~var20; ++var20) {
                    class177 var21 = new class177(arg3, arg0, 0);
                    if (var21.field2335 == 31) {
                        class440 var22 = class38.field503.method1601((byte) -113, arg0.method2758((byte) 120));
                        var21.method1134(var22.field6303, var22.field6305, var22.field6304, var22.field6306, 256);
                    }
                    if (arg3.method314() > 0) {
                        class256 var23 = var21.field2337;
                        int var24 = var23.method1539((byte) 115) + (arg1 << 7);
                        int var25 = var23.method1537(-409134460) - -(arg5 << 7);
                        int var26 = var24 >> 7;
                        int var27 = var25 >> 7;
                        if (~var26 <= -1 && ~var27 <= -1 && ~super.field961 < ~var26 && super.field952 > var27) {
                            var23.method1532(2, var25, super.field967[var21.field2343][var26][var27] + -var23.method1536((byte) 115), var24);
                            if (~arg3.method314() < -1) {
                                class524.method3127(var21);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(JI)V")
    public static final void method24(long arg0, int arg1) {
        ++field45;
        int var3 = class238.field3047;
        if (arg1 == -22870) {
            int var4 = class527.field7783;
            if (~class119.field1603 != ~var3) {
                int var5 = -class119.field1603 + var3;
                int var6 = (int) ((long) var5 * arg0 / 320L);
                if (var5 <= 0) {
                    if (~var6 == -1) {
                        var6 = -1;
                    } else if (~var6 > ~var5) {
                        var6 = var5;
                    }
                } else if (~var6 != -1) {
                    if (var6 > var5) {
                        var6 = var5;
                    }
                } else {
                    var6 = 1;
                }
                class119.field1603 += var6;
            }
            if (class56.field740 != var4) {
                int var7 = -class56.field740 + var4;
                int var8 = (int) ((long) var7 * arg0 / 320L);
                if (var7 <= 0) {
                    if (var8 == 0) {
                        var8 = -1;
                    } else if (~var8 > ~var7) {
                        var8 = var7;
                    }
                } else if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
                class56.field740 += var8;
            }
            if (!class407.field5817.field3615) {
                class463.field6626 += (float) arg0 * class461.field6598 / 40.0F * 8.0F;
                class49.field629 += (float) arg0 * class59.field773 / 40.0F * 8.0F;
            }
            class389.method2212(-4);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lfw;III)J")
    public static final long method25(class41 arg0, int arg1, int arg2, int arg3) {
        ++field36;
        if (arg3 != 0) {
            method25((class41) null, -58, 95, -61);
        }
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class102 var10 = class315.field4017.method1958(-10091, arg0.method187(21067));
        long var11 = (long) (1073741824 | arg0.method189(arg3 + 32725) << 14 | arg2 | arg1 << 7 | arg0.method178(true) << 20);
        if (~var10.field1305 == -1) {
            var11 |= var8;
        }
        if (~var10.field1276 == -2) {
            var11 |= var4;
        }
        if (var10.field1308) {
            var11 |= var6;
        }
        return var11 | (long) arg0.method187(21067) << 32;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method26(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
