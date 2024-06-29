import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class270 extends class88 {

    @OriginalMember(owner = "client!fda", name = "F", descriptor = "I")
    public int field3778 = 99;

    @OriginalMember(owner = "client!fda", name = "P", descriptor = "Leea;")
    public static class114 field3788;

    @OriginalMember(owner = "client!fda", name = "R", descriptor = "Lkca;")
    public static class73 field3790;

    @OriginalMember(owner = "client!fda", name = "S", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!fda", name = "B", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!fda", name = "C", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!fda", name = "D", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!fda", name = "E", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!fda", name = "G", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!fda", name = "H", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!fda", name = "I", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!fda", name = "K", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!fda", name = "M", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!fda", name = "O", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!fda", name = "J", descriptor = "Lq;")
    public static class364 field3782;

    @OriginalMember(owner = "client!fda", name = "L", descriptor = "Lgh;")
    public static class476 field3784;

    @OriginalMember(owner = "client!fda", name = "N", descriptor = "Lgh;")
    public static class476 field3786;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fda", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field3792;

    @OriginalMember(owner = "client!fda", name = "Q", descriptor = "[[Z")
    public static boolean[][] field3789;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "([IIBILoa;Lrt;)V")
    public final void method1759(int[] arg0, int arg1, byte arg2, int arg3, class605 arg4, class194 arg5) {
        if (arg2 != 114) {
            this.method1763((class605) null, (class468) null, -75, 126, 2, 85, 94);
        }
        ++field3781;
        if (!super.field1001) {
            boolean var7 = false;
            class636 var8 = null;
            if (arg0 != null) {
                arg0[0] = -1;
            }
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (~arg5.field2610 > ~arg5.field2622.length) {
                                int var18 = arg5.method1177(255);
                                if (var18 != 0) {
                                    if (~var18 != -2) {
                                        if (var18 != 2) {
                                            if (var18 != 128) {
                                                if (var18 != 129) {
                                                    throw new IllegalStateException("");
                                                }
                                                if (super.field997 == null) {
                                                    super.field997 = new byte[4][][];
                                                }
                                                var7 = true;
                                                for (int var19 = 0; var19 < 4; ++var19) {
                                                    byte var20 = arg5.method1213((byte) 70);
                                                    if (~var20 == -1 && super.field997[var19] != null) {
                                                        int var21 = arg1;
                                                        int var22 = arg1 + 64;
                                                        int var23 = arg3;
                                                        if (~var22 <= -1) {
                                                            if (~var22 <= ~super.field999) {
                                                                var22 = super.field999;
                                                            }
                                                        } else {
                                                            var22 = 0;
                                                        }
                                                        int var24 = arg3 - -64;
                                                        if (arg1 >= 0) {
                                                            if (~arg1 <= ~super.field999) {
                                                                var21 = super.field999;
                                                            }
                                                        } else {
                                                            var21 = 0;
                                                        }
                                                        if (arg3 >= 0) {
                                                            if (arg3 >= super.field1002) {
                                                                var23 = super.field1002;
                                                            }
                                                        } else {
                                                            var23 = 0;
                                                        }
                                                        if (var24 >= 0) {
                                                            if (~var24 <= ~super.field1002) {
                                                                var24 = super.field1002;
                                                            }
                                                        } else {
                                                            var24 = 0;
                                                        }
                                                        while (~var22 < ~var21) {
                                                            while (var24 > var23) {
                                                                super.field997[var19][var21][var23] = 0;
                                                                ++var23;
                                                            }
                                                            ++var21;
                                                        }
                                                    } else if (~var20 != -2) {
                                                        if (var20 == 2) {
                                                            if (super.field997[var19] == null) {
                                                                super.field997[var19] = new byte[super.field999 + 1][super.field1002 + 1];
                                                            }
                                                            if (var19 > 0) {
                                                                int var25 = arg1;
                                                                int var26 = arg1 + 64;
                                                                int var27 = arg3;
                                                                if (arg1 < 0) {
                                                                    var25 = 0;
                                                                } else if (~arg1 <= ~super.field999) {
                                                                    var25 = super.field999;
                                                                }
                                                                if (~arg3 > -1) {
                                                                    var27 = 0;
                                                                } else if (~super.field1002 >= ~arg3) {
                                                                    var27 = super.field1002;
                                                                }
                                                                int var28 = arg3 + 64;
                                                                if (~var26 > -1) {
                                                                    var26 = 0;
                                                                } else if (~var26 <= ~super.field999) {
                                                                    var26 = super.field999;
                                                                }
                                                                if (var28 < 0) {
                                                                    var28 = 0;
                                                                } else if (~var28 <= ~super.field1002) {
                                                                    var28 = super.field1002;
                                                                }
                                                                while (~var26 < ~var25) {
                                                                    while (~var27 > ~var28) {
                                                                        super.field997[var19][var25][var27] = super.field997[var19 + -1][var25][var27];
                                                                        ++var27;
                                                                    }
                                                                    ++var25;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (super.field997[var19] == null) {
                                                            super.field997[var19] = new byte[super.field999 + 1][super.field1002 - -1];
                                                        }
                                                        for (int var29 = 0; ~var29 > -65; var29 += 4) {
                                                            for (int var30 = 0; var30 < 64; var30 += 4) {
                                                                byte var31 = arg5.method1213((byte) 25);
                                                                for (int var32 = arg1 + var29; var32 < arg1 + var29 + 4; ++var32) {
                                                                    for (int var33 = arg3 + var30; var33 < var30 - -arg3 + 4; ++var33) {
                                                                        if (var32 >= 0 && ~var32 > ~super.field999 && ~var33 <= -1 && ~var33 > ~super.field1002) {
                                                                            super.field997[var19][var32][var33] = var31;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (arg0 != null) {
                                                arg0[0] = arg5.method1220(-79);
                                                arg0[1] = arg5.method1233(arg2 + 65166);
                                                arg0[2] = arg5.method1233(65280);
                                                arg0[3] = arg5.method1233(65280);
                                                arg0[4] = arg5.method1220(-59);
                                            } else {
                                                arg5.field2610 += 10;
                                            }
                                        } else {
                                            if (var8 == null) {
                                                var8 = new class636();
                                            }
                                            var8.method3631(arg5, false);
                                        }
                                    } else {
                                        int var34 = arg5.method1177(arg2 + 141);
                                        if (var34 > 0) {
                                            for (int var35 = 0; ~var34 < ~var35; ++var35) {
                                                class49 var36 = new class49(arg4, arg5, 2);
                                                if (var36.field514 == 31) {
                                                    class465 var37 = class3.field23.method424(31, arg5.method1220(112));
                                                    var36.method274(var37.field6911, var37.field6913, (byte) -14, var37.field6910, var37.field6914);
                                                }
                                                if (arg4.method324() > 0) {
                                                    class321 var38 = var36.field522;
                                                    int var39 = var38.method2093((byte) 63) - -(arg1 << 9);
                                                    int var40 = (arg3 << 9) + var38.method2095(true);
                                                    int var41 = var39 >> 9;
                                                    int var42 = var40 >> 9;
                                                    if (~var41 <= -1 && ~var42 <= -1 && super.field999 > var41 && super.field1002 > var42) {
                                                        var38.method1755(true, var39, var40, super.field1006[var36.field520][var41][var42] - var38.method2097((byte) -83));
                                                        class53.method291(var36);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var8 = new class636(arg5);
                                }
                            }
                            if (var8 != null) {
                                for (int var9 = 0; ~var9 > -9; ++var9) {
                                    for (int var10 = 0; var10 < 8; ++var10) {
                                        int var11 = (arg1 >> 3) - -var9;
                                        int var12 = (arg3 >> 3) + var10;
                                        if (var11 >= 0 && ~var11 > ~(super.field999 >> 3) && var12 >= 0 && var12 < super.field1002 >> 3) {
                                            class463.method2837(84, var12, var11, var8);
                                        }
                                    }
                                }
                            }
                            if (!var7 && super.field997 != null) {
                                for (int var13 = 0; var13 < 4; ++var13) {
                                    if (super.field997[var13] != null) {
                                        for (int var14 = 0; ~var14 > -17; ++var14) {
                                            for (int var15 = 0; ~var15 > -17; ++var15) {
                                                int var16 = (arg1 >> 2) + var14;
                                                int var17 = (arg3 >> 2) + var15;
                                                if (~var16 <= -1 && var16 < 26 && var17 >= 0 && var17 < 26) {
                                                    super.field997[var13][var16][var17] = 0;
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
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Loa;I)V")
    public final void method1760(class605 arg0, int arg1) {
        class285.method1844(arg0);
        ++field3774;
        if (arg1 >= -5) {
            this.field3778 = 7;
        }
        if (~super.field1019 < -2) {
            for (int var3 = 0; ~super.field999 < ~var3; ++var3) {
                for (int var4 = 0; super.field1002 > var4; ++var4) {
                    if ((class443.field6617[1][var3][var4] & 2) == 2) {
                        class518.method3070(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; ~var5 > ~super.field1019; ++var5) {
            for (int var6 = 0; ~var6 >= ~super.field1002; ++var6) {
                for (int var7 = 0; var7 <= super.field999; ++var7) {
                    if ((1 & super.field1007[var5][var7][var6]) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        int var11 = var5;
                        while (~super.field1002 < ~var9 && (1 & super.field1007[var5][var7][var9 + 1]) != 0) {
                            ++var9;
                        }
                        while (var8 > 0 && (1 & super.field1007[var5][var7][var8 + -1]) != 0) {
                            --var8;
                        }
                        label170: while (~var10 < -1) {
                            for (int var12 = var8; ~var12 >= ~var9; ++var12) {
                                if ((super.field1007[var10 + -1][var7][var12] & 1) == 0) {
                                    break label170;
                                }
                            }
                            --var10;
                        }
                        label159: while (var11 < 3) {
                            for (int var13 = var8; ~var9 <= ~var13; ++var13) {
                                if (~(super.field1007[var11 + 1][var7][var13] & 1) == -1) {
                                    break label159;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (var9 + 1 + -var8) * (var11 + 1 + -var10);
                        if (var14 >= 2) {
                            short var15 = 960;
                            int var16 = super.field1006[var11][var7][var8] + -var15;
                            int var17 = super.field1006[var10][var7][var8];
                            class472.method2894(1, var7 << 9, var7 << 9, var8 << 9, (var9 << 9) + 512, var16, var17);
                            for (int var18 = var10; ~var18 >= ~var11; ++var18) {
                                for (int var19 = var8; var19 <= var9; ++var19) {
                                    super.field1007[var18][var7][var19] = (byte) class643.method3659(super.field1007[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if (~(2 & super.field1007[var5][var7][var6]) != -1) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (~super.field999 < ~var21 && (2 & super.field1007[var5][var21 + 1][var6]) != 0) {
                            ++var21;
                        }
                        int var23 = var5;
                        while (var20 > 0 && (super.field1007[var5][var20 + -1][var6] & 2) != 0) {
                            --var20;
                        }
                        label223: while (~var22 < -1) {
                            for (int var24 = var20; ~var24 >= ~var21; ++var24) {
                                if ((2 & super.field1007[var22 - 1][var24][var6]) == 0) {
                                    break label223;
                                }
                            }
                            --var22;
                        }
                        label212: while (~var23 > -4) {
                            for (int var25 = var20; ~var25 >= ~var21; ++var25) {
                                if (~(super.field1007[var23 + 1][var25][var6] & 2) == -1) {
                                    break label212;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (-var20 + 1 + var21) * (-var22 + 1 + var23);
                        if (~var26 <= -3) {
                            short var27 = 960;
                            int var28 = super.field1006[var23][var20][var6] + -var27;
                            int var29 = super.field1006[var22][var20][var6];
                            class472.method2894(2, var20 << 9, (var21 << 9) - -512, var6 << 9, var6 << 9, var28, var29);
                            for (int var30 = var22; ~var30 >= ~var23; ++var30) {
                                for (int var31 = var20; var31 <= var21; ++var31) {
                                    super.field1007[var30][var31][var6] = (byte) class643.method3659(super.field1007[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if (~(4 & super.field1007[var5][var7][var6]) != -1) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34;
                        for (var34 = var6; var34 > 0 && (super.field1007[var5][var7][var34 + -1] & 4) != 0; --var34) {
                        }
                        int var35;
                        for (var35 = var6; ~super.field1002 < ~var35 && (4 & super.field1007[var5][var7][var35 - -1]) != 0; ++var35) {
                        }
                        label277: while (var32 > 0) {
                            for (int var36 = var34; ~var35 <= ~var36; ++var36) {
                                if ((4 & super.field1007[var5][var32 + -1][var36]) == 0) {
                                    break label277;
                                }
                            }
                            --var32;
                        }
                        label266: while (super.field999 > var33) {
                            for (int var37 = var34; ~var35 <= ~var37; ++var37) {
                                if (~(super.field1007[var5][var33 - -1][var37] & 4) == -1) {
                                    break label266;
                                }
                            }
                            ++var33;
                        }
                        if (~((-var34 + var35 - -1) * (-var32 + var33 + 1)) <= -5) {
                            int var38 = super.field1006[var5][var32][var34];
                            class472.method2894(4, var32 << 9, (var33 << 9) - -512, var34 << 9, (var35 << 9) + 512, var38, var38);
                            for (int var39 = var32; ~var33 <= ~var39; ++var39) {
                                for (int var40 = var34; ~var40 >= ~var35; ++var40) {
                                    super.field1007[var5][var39][var40] = (byte) class643.method3659(super.field1007[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field1007 = null;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IZ[ILoa;IILrt;IIII)V")
    public final void method1761(int arg0, boolean arg1, int[] arg2, class605 arg3, int arg4, int arg5, class194 arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field3775;
        if (!super.field1001) {
            if (arg2 != null) {
                arg2[0] = -1;
            }
            class636 var13 = null;
            int var14 = (arg10 & 7) * 8;
            int var15 = (7 & arg7) * 8;
            while (true) {
                int var21;
                label243: do {
                    while (true) {
                        while (arg6.field2610 < arg6.field2622.length) {
                            int var20 = arg6.method1177(255);
                            if (~var20 != -1) {
                                if (var20 == 1) {
                                    var21 = arg6.method1177(255);
                                    continue label243;
                                }
                                if (var20 == 2) {
                                    if (var13 == null) {
                                        var13 = new class636();
                                    }
                                    var13.method3631(arg6, false);
                                } else if (var20 == 128) {
                                    if (arg2 != null) {
                                        arg2[0] = arg6.method1220(113);
                                        arg2[1] = arg6.method1233(65280);
                                        arg2[2] = arg6.method1233(65280);
                                        arg2[3] = arg6.method1233(65280);
                                        arg2[4] = arg6.method1220(-17);
                                    } else {
                                        arg6.field2610 += 10;
                                    }
                                } else {
                                    if (var20 != 129) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field997 == null) {
                                        super.field997 = new byte[4][][];
                                    }
                                    for (int var32 = 0; var32 < 4; ++var32) {
                                        byte var33 = arg6.method1213((byte) 77);
                                        if (~var33 == -1 && super.field997[arg5] != null) {
                                            if (~var32 >= ~arg4) {
                                                int var34 = arg0;
                                                int var35 = arg0 - -7;
                                                int var36 = arg9;
                                                int var37 = arg9 + 7;
                                                if (~arg9 > -1) {
                                                    var36 = 0;
                                                } else if (~arg9 <= ~super.field1002) {
                                                    var36 = super.field1002;
                                                }
                                                if (arg0 >= 0) {
                                                    if (super.field999 <= arg0) {
                                                        var34 = super.field999;
                                                    }
                                                } else {
                                                    var34 = 0;
                                                }
                                                if (var35 >= 0) {
                                                    if (var35 >= super.field999) {
                                                        var35 = super.field999;
                                                    }
                                                } else {
                                                    var35 = 0;
                                                }
                                                if (~var37 > -1) {
                                                    var37 = 0;
                                                } else if (~super.field1002 >= ~var37) {
                                                    var37 = super.field1002;
                                                }
                                                while (~var35 < ~var34) {
                                                    while (var37 > var36) {
                                                        super.field997[arg5][var34][var36] = 0;
                                                        ++var36;
                                                    }
                                                    ++var34;
                                                }
                                            }
                                        } else if (~var33 == -2) {
                                            if (super.field997[arg5] == null) {
                                                super.field997[arg5] = new byte[super.field999 + 1][super.field1002 + 1];
                                            }
                                            for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                                for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                                    byte var40 = arg6.method1213((byte) 114);
                                                    if (arg4 >= var32) {
                                                        for (int var41 = var38; var38 + 4 > var41; ++var41) {
                                                            for (int var42 = var39; ~(var39 + 4) < ~var42; ++var42) {
                                                                if (var14 <= var41 && var41 < var14 + 8 && var42 >= var15 && ~var15 > ~(var15 + 8)) {
                                                                    int var43 = arg0 + class163.method950(var41 & 7, arg1, var42 & 7, arg8);
                                                                    int var44 = arg9 + class407.method2576(arg8, var41 & 7, 2843, var42 & 7);
                                                                    if (~var43 <= -1 && ~var43 > ~super.field999 && var44 >= 0 && var44 < super.field1002) {
                                                                        super.field997[arg5][var43][var44] = var40;
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
                                var13 = new class636(arg6);
                            }
                        }
                        if (var13 != null) {
                            class463.method2837(78, arg9 >> 3, arg0 >> 3, var13);
                        }
                        if (!arg1 && super.field997 != null && super.field997[arg5] != null) {
                            int var16 = arg0 - -7;
                            int var17 = arg9 + 7;
                            for (int var18 = arg0; var18 < var16; ++var18) {
                                for (int var19 = arg9; ~var17 < ~var19; ++var19) {
                                    super.field997[arg5][var18][var19] = 0;
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (var21 <= 0);
                for (int var22 = 0; ~var22 > ~var21; ++var22) {
                    class49 var23 = new class49(arg3, arg6, 2);
                    if (~var23.field514 == -32) {
                        class465 var24 = class3.field23.method424(31, arg6.method1220(124));
                        var23.method274(var24.field6911, var24.field6913, (byte) -14, var24.field6910, var24.field6914);
                    }
                    if (~arg3.method324() < -1) {
                        class321 var25 = var23.field522;
                        int var26 = var25.method2093((byte) -85) >> 9;
                        int var27 = var25.method2095(true) >> 9;
                        if (~var23.field520 == ~arg4 && ~var26 <= ~var14 && ~var26 > ~(var14 + 8) && var27 >= var15 && var27 < var15 + 8) {
                            int var28 = class460.method2831(4095 & var25.method2093((byte) -70), var25.method2095(true) & 4095, arg8, 125) + (arg0 << 9);
                            int var29 = var28 >> 9;
                            int var30 = class489.method2941(4095 & var25.method2093((byte) -113), 4095 & var25.method2095(!arg1), true, arg8) + (arg9 << 9);
                            int var31 = var30 >> 9;
                            if (~var29 <= -1 && ~var31 <= -1 && var29 < super.field999 && var31 < super.field1002) {
                                var25.method1755(true, var28, var30, super.field1006[arg4][var29][var31] - var25.method2097((byte) -87));
                                class53.method291(var23);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
    public static final void method1762(int arg0) {
        class635.field9136 = null;
        class264.field3747 = null;
        ++field3779;
        class444.field6646 = false;
        if (arg0 != 11639) {
            method1764((byte) 15);
        }
        class519.field7553 = null;
        class560.field7967 = null;
        class429.field6363 = null;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Loa;Lvi;IIIII)V")
    public final void method1763(class605 arg0, class468 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3780;
        class57 var8 = null;
        if (arg6 == 0) {
            var8 = (class57) class491.method2948(arg3, arg4, arg2);
        }
        if (~arg6 == arg5) {
            var8 = (class57) class458.method2824(arg3, arg4, arg2);
        }
        if (arg6 == 2) {
            var8 = (class57) class226.method1473(arg3, arg4, arg2, field3792 != null ? field3792 : (field3792 = method1770("qn")));
        }
        if (arg6 == 3) {
            var8 = (class57) class157.method911(arg3, arg4, arg2);
        }
        if (var8 != null) {
            class385 var9 = class575.field8301.method1499(-7532, var8.method89(-116));
            int var10 = var8.method95(73);
            int var11 = var8.method92(9812);
            if (var9.method2467((byte) -106)) {
                class541.method3145(arg3, var9, arg4, 842072393, arg2);
            }
            if (var8.method93(-23445)) {
                var8.method102((byte) -80, arg0);
            }
            if (~arg6 != -1) {
                if (arg6 == 1) {
                    class356 var12 = class458.method2824(arg3, arg4, arg2);
                    if (var12 instanceof class561) {
                        ((class561) var12).field7997 = null;
                        return;
                    }
                    class198.method1264(arg3, arg4, arg2);
                    return;
                }
                if (arg6 != 2) {
                    if (arg6 == 3) {
                        class111 var13 = class157.method911(arg3, arg4, arg2);
                        if (!(var13 instanceof class204)) {
                            class34.method192(arg3, arg4, arg2);
                        } else {
                            ((class204) var13).field2740 = null;
                        }
                        if (var9.field5829 == 1) {
                            arg1.method2874(arg2, arg4, -89);
                            return;
                        }
                    }
                    return;
                }
                class144 var14 = class226.method1473(arg3, arg4, arg2, field3792 != null ? field3792 : (field3792 = method1770("qn")));
                if (var14 instanceof class343 && ~var14.field1773 == ~arg4 && ~var14.field1758 == ~arg2) {
                    ((class343) var14).field4887 = null;
                } else {
                    class331.method2155(arg3, arg4, arg2, field3792 != null ? field3792 : (field3792 = method1770("qn")));
                }
                if (~var9.field5829 != -1 && ~super.field999 < ~(var9.field5860 + arg4) && var9.field5860 + arg2 < super.field1002 && ~(arg4 - -var9.field5858) > ~super.field999 && super.field1002 > var9.field5858 + arg2) {
                    arg1.method2863(var9.field5858, var11, true, var9.field5860, !var9.field5834, arg2, arg4, var9.field5812);
                    return;
                }
                return;
            }
            class599 var15 = class491.method2948(arg3, arg4, arg2);
            if (var15 instanceof class249) {
                ((class249) var15).field3538 = null;
            } else {
                class168.method968(arg3, arg4, arg2);
            }
            if (~var9.field5829 != -1) {
                arg1.method2864(arg4, var9.field5812, arg2, (byte) 126, var11, var10, !var9.field5834);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V")
    public static void method1764(byte arg0) {
        field3782 = null;
        field3786 = null;
        field3790 = null;
        field3784 = null;
        field3788 = null;
        field3789 = null;
        if (arg0 != 77) {
            field3786 = null;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(BLrt;)Lmb;")
    public static final class223 method1765(byte arg0, class194 arg1) {
        ++field3776;
        int var2 = 26 / ((arg0 - -26) / 60);
        return new class223(arg1.method1233(65280), arg1.method1233(65280), arg1.method1233(65280), arg1.method1233(65280), arg1.method1180(-832631516), arg1.method1177(255));
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Loa;I[Lvi;I[BI)V")
    public final void method1766(class605 arg0, int arg1, class468[] arg2, int arg3, byte[] arg4, int arg5) {
        ++field3783;
        class194 var7 = new class194(arg4);
        if (arg1 != 50) {
            field3788 = null;
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method1230((byte) 105);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1176((byte) 126);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = 63 & var10;
                int var13 = (4051 & var10) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method1177(255);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = arg3 + var13;
                int var19 = arg5 + var12;
                if (~var18 < -1 && ~var19 < -1 && ~var18 > ~(super.field999 + -1) && ~(super.field1002 + -1) < ~var19) {
                    class468 var20 = null;
                    if (!super.field1001) {
                        int var21 = var14;
                        if ((2 & class443.field6617[1][var18][var19]) == 2) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg2[var21];
                        }
                    }
                    this.method1768(arg0, var14, -1, 6, var8, var16, var19, var18, var17, var20, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(IIIZ)V")
    public class270(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class402.field6088, class108.field1317);
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIZ[Lvi;IIII[BILoa;)V")
    public final void method1767(int arg0, int arg1, boolean arg2, class468[] arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9, class605 arg10) {
        ++field3785;
        if (!arg2) {
            class194 var12 = new class194(arg8);
            int var13 = -1;
            while (true) {
                int var14 = var12.method1230((byte) 105);
                if (var14 == 0) {
                    return;
                }
                var13 += var14;
                int var15 = 0;
                while (true) {
                    int var16 = var12.method1176((byte) -80);
                    if (~var16 == -1) {
                        break;
                    }
                    var15 += var16 + -1;
                    int var17 = 63 & var15;
                    int var18 = var15 >> 6 & 63;
                    int var19 = var15 >> 12;
                    int var20 = var12.method1177(255);
                    int var21 = var20 >> 2;
                    int var22 = var20 & 3;
                    if (arg9 == var19 && arg7 <= var18 && arg7 + 8 > var18 && arg4 <= var17 && ~(arg4 + 8) < ~var17) {
                        class385 var23 = class575.field8301.method1499(-7532, var13);
                        int var24 = class629.method3606(var18 & 7, (byte) -121, arg0, var23.field5858, var17 & 7, var22, var23.field5860) + arg1;
                        int var25 = arg6 + class287.method1857(arg0, var23.field5858, var17 & 7, 114, var18 & 7, var22, var23.field5860);
                        if (~var24 < -1 && var25 > 0 && ~(super.field999 + -1) < ~var24 && var25 < super.field1002 + -1) {
                            class468 var26 = null;
                            if (!super.field1001) {
                                int var27 = arg5;
                                if (~(class443.field6617[1][var24][var25] & 2) == -3) {
                                    var27 = arg5 - 1;
                                }
                                if (~var27 <= -1) {
                                    var26 = arg3[var27];
                                }
                            }
                            this.method1768(arg10, arg5, -1, 6, var13, var21, var25, var24, arg0 + var22 & 3, var26, arg5);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Loa;IIIIIIIILvi;I)V")
    public final void method1768(class605 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class468 arg9, int arg10) {
        ++field3777;
        if (class595.field8694.method2426(class81.field908, arg3 + -11) || class582.method3378(arg7, (byte) -74, arg6, class394.field6023, arg1)) {
            if (~this.field3778 < ~arg10) {
                this.field3778 = arg10;
            }
            class385 var12 = class575.field8301.method1499(arg3 + -7538, arg4);
            if (!arg0.method363() || !class595.field8694.field6539 || !var12.field5804) {
                int var13;
                int var14;
                if (arg8 != 1 && ~arg8 != -4) {
                    var13 = var12.field5860;
                    var14 = var12.field5858;
                } else {
                    var13 = var12.field5858;
                    var14 = var12.field5860;
                }
                int var15;
                int var16;
                if (~(arg7 - -var13) < ~super.field999) {
                    var15 = arg7;
                    var16 = arg7 - -1;
                } else {
                    var15 = (var13 >> 1) + arg7;
                    var16 = (var13 + 1 >> 1) + arg7;
                }
                int var17;
                int var18;
                if (~(arg6 + var14) < ~super.field1002) {
                    var17 = arg6;
                    var18 = arg6 + 1;
                } else {
                    var18 = (var14 - -1 >> 1) + arg6;
                    var17 = arg6 - -(var14 >> 1);
                }
                class132 var19 = class435.field6449[arg1];
                int var20 = var19.method259(var15, var17) + var19.method259(var16, var17) + var19.method259(var15, var18) + var19.method259(var16, var18) >> 2;
                int var21 = (arg7 << 9) + (var13 << 8);
                int var22 = (arg6 << 9) - -(var14 << 8);
                boolean var23 = class444.field6646 && !super.field1001 && var12.field5828;
                if (var12.method2467((byte) -98)) {
                    class474.method2903(arg10, var12, arg3 ^ -105, arg7, arg6, arg8, (class78) null, (class655) null);
                }
                boolean var24 = ~arg2 == 0 && ~var12.field5843 == 0 && var12.field5816 == null && var12.field5793 == null && !var12.field5853;
                if (!class409.field6172 || (!class232.method1493(arg5, -1) || ~var12.field5805 == -2) && (!class55.method409(arg5, (byte) 1) || ~var12.field5805 != -1)) {
                    if (~arg5 == -23) {
                        if (class595.field8694.field6549 || var12.field5806 != 0 || var12.field5829 == 1 || var12.field5879) {
                            class111 var26;
                            if (var24) {
                                class495 var25 = new class495(arg0, var12, arg1, var21, var20, var22, super.field1001, arg8, var23);
                                var26 = var25;
                                if (var25.method93(-23445)) {
                                    var25.method98(16343, arg0);
                                }
                            } else {
                                var26 = new class94(arg0, var12, arg10, arg1, var21, var20, var22, super.field1001, arg8, arg2);
                            }
                            class111 var27 = class157.method911(arg10, arg7, arg6);
                            if (var27 instanceof class204) {
                                ((class204) var27).field2740 = var26;
                            } else {
                                class563.method3254(arg10, arg7, arg6, var26);
                            }
                            if (var12.field5829 == 1 && arg9 != null) {
                                arg9.method2871(-1, arg7, arg6);
                            }
                        }
                    } else if (~arg5 != -11 && arg5 != 11) {
                        if (~arg5 <= -13 && ~arg5 >= -18 || ~arg5 <= -19 && arg5 <= 21) {
                            class144 var29;
                            if (var24) {
                                class344 var28 = new class344(arg0, var12, arg10, arg1, var21, var20, var22, super.field1001, arg7, var13 + -1 + arg7, arg6, arg6 + -1 + var14, arg5, arg8, var23);
                                if (var28.method93(-23445)) {
                                    var28.method98(16343, arg0);
                                }
                                var29 = var28;
                            } else {
                                var29 = new class354(arg0, var12, arg10, arg1, var21, var20, var22, super.field1001, arg7, arg7 + -1 + var13, arg6, arg6 + var14 + -1, arg5, arg8, arg2);
                            }
                            class144 var30 = class226.method1473(arg10, arg7, arg6, field3792 != null ? field3792 : (field3792 = method1770("qn")));
                            if (var30 instanceof class343 && var30.field1773 == arg7 && var30.field1758 == arg6) {
                                ((class343) var30).field4887 = var29;
                            } else {
                                class367.method2355(var29, false);
                            }
                            if (class444.field6646 && !super.field1001 && arg5 >= 12 && ~arg5 >= -18 && arg5 != 13 && ~arg10 < -1 && var12.field5805 != 0) {
                                super.field1007[arg10][arg7][arg6] = (byte) class283.method1834(super.field1007[arg10][arg7][arg6], 4);
                            }
                            if (~var12.field5829 != -1 && arg9 != null) {
                                arg9.method2862(arg6, var14, var13, var12.field5812, arg7, !var12.field5834, (byte) 58);
                            }
                        } else if (~arg5 == -1) {
                            int var31 = var12.field5805;
                            if (class218.field2991 && var12.field5805 == -1) {
                                var31 = 1;
                            }
                            class599 var33;
                            if (var24) {
                                class15 var32 = new class15(arg0, var12, arg1, var21, var20, var22, super.field1001, arg5, arg8, var23);
                                if (var32.method93(-23445)) {
                                    var32.method98(16343, arg0);
                                }
                                var33 = var32;
                            } else {
                                var33 = new class643(arg0, var12, arg10, arg1, var21, var20, var22, super.field1001, arg5, arg8, arg2);
                            }
                            class599 var34 = class491.method2948(arg10, arg7, arg6);
                            if (var34 instanceof class249) {
                                ((class249) var34).field3538 = var33;
                            } else {
                                class16.method105(arg10, arg7, arg6, var33, (class599) null);
                            }
                            if (class444.field6646) {
                                if (arg8 == 0) {
                                    if (var12.field5838) {
                                        var19.method251(arg7, arg6, 50);
                                        var19.method251(arg7, arg6 + 1, 50);
                                    }
                                    if (~var31 == -2 && !super.field1001) {
                                        super.field1007[arg10][arg7][arg6] = (byte) class283.method1834(super.field1007[arg10][arg7][arg6], 1);
                                    }
                                } else if (arg8 != 1) {
                                    if (arg8 == 2) {
                                        if (var12.field5838) {
                                            var19.method251(arg7 + 1, arg6, 50);
                                            var19.method251(arg7 + 1, arg6 - -1, 50);
                                        }
                                        if (var31 == 1 && !super.field1001) {
                                            super.field1007[arg10][arg7 - -1][arg6] = (byte) class283.method1834(super.field1007[arg10][arg7 - -1][arg6], 1);
                                        }
                                    } else if (~arg8 == -4) {
                                        if (var12.field5838) {
                                            var19.method251(arg7, arg6, 50);
                                            var19.method251(arg7 + 1, arg6, 50);
                                        }
                                        if (~var31 == -2 && !super.field1001) {
                                            super.field1007[arg10][arg7][arg6] = (byte) class283.method1834(super.field1007[arg10][arg7][arg6], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field5838) {
                                        var19.method251(arg7, arg6 - -1, 50);
                                        var19.method251(arg7 + 1, arg6 + 1, 50);
                                    }
                                    if (~var31 == -2 && !super.field1001) {
                                        super.field1007[arg10][arg7][arg6 + 1] = (byte) class283.method1834(super.field1007[arg10][arg7][arg6 + 1], 2);
                                    }
                                }
                            }
                            if (~var12.field5829 != -1 && arg9 != null) {
                                arg9.method2861((byte) 103, var12.field5812, arg7, !var12.field5834, arg6, arg8, arg5);
                            }
                            if (var12.field5809 != 64) {
                                class247.method1637(arg10, arg7, arg6, var12.field5809);
                            }
                        } else if (arg5 == 1) {
                            class599 var35;
                            if (!var24) {
                                var35 = new class643(arg0, var12, arg10, arg1, var21, var20, var22, super.field1001, arg5, arg8, arg2);
                            } else {
                                class15 var36 = new class15(arg0, var12, arg1, var21, var20, var22, super.field1001, arg5, arg8, var23);
                                var35 = var36;
                                if (var36.method93(arg3 ^ -23443)) {
                                    var36.method98(16343, arg0);
                                }
                            }
                            class599 var37 = class491.method2948(arg10, arg7, arg6);
                            if (!(var37 instanceof class249)) {
                                class16.method105(arg10, arg7, arg6, var35, (class599) null);
                            } else {
                                ((class249) var37).field3538 = var35;
                            }
                            if (var12.field5838 && class444.field6646) {
                                if (arg8 != 0) {
                                    if (~arg8 != -2) {
                                        if (arg8 != 2) {
                                            if (~arg8 == -4) {
                                                var19.method251(arg7, arg6, 50);
                                            }
                                        } else {
                                            var19.method251(arg7 - -1, arg6, 50);
                                        }
                                    } else {
                                        var19.method251(arg7 + 1, arg6 + 1, 50);
                                    }
                                } else {
                                    var19.method251(arg7, arg6 + 1, 50);
                                }
                            }
                            if (~var12.field5829 != -1 && arg9 != null) {
                                arg9.method2861((byte) 55, var12.field5812, arg7, !var12.field5834, arg6, arg8, arg5);
                            }
                        } else if (~arg5 == -3) {
                            int var38 = arg8 - -1 & 3;
                            class599 var41;
                            class599 var42;
                            if (var24) {
                                class15 var39 = new class15(arg0, var12, arg1, var21, var20, var22, super.field1001, arg5, arg8 + 4, var23);
                                class15 var40 = new class15(arg0, var12, arg1, var21, var20, var22, super.field1001, arg5, var38, var23);
                                if (var39.method93(-23445)) {
                                    var39.method98(16343, arg0);
                                }
                                var41 = var39;
                                var42 = var40;
                                if (var40.method93(-23445)) {
                                    var40.method98(16343, arg0);
                                }
                            } else {
                                var41 = new class643(arg0, var12, arg10, arg1, var21, var20, var22, super.field1001, arg5, arg8 + 4, arg2);
                                var42 = new class643(arg0, var12, arg10, arg1, var21, var20, var22, super.field1001, arg5, var38, arg2);
                            }
                            class16.method105(arg10, arg7, arg6, var41, var42);
                            if (~var12.field5805 == -2 && class444.field6646 && !super.field1001) {
                                if (~arg8 != -1) {
                                    if (~arg8 != -2) {
                                        if (arg8 != 2) {
                                            if (~arg8 == -4) {
                                                super.field1007[arg10][arg7][arg6] = (byte) class283.method1834(super.field1007[arg10][arg7][arg6], 2);
                                                super.field1007[arg10][arg7][arg6] = (byte) class283.method1834(super.field1007[arg10][arg7][arg6], 1);
                                            }
                                        } else {
                                            super.field1007[arg10][arg7 + 1][arg6] = (byte) class283.method1834(super.field1007[arg10][arg7 + 1][arg6], 1);
                                            super.field1007[arg10][arg7][arg6] = (byte) class283.method1834(super.field1007[arg10][arg7][arg6], 2);
                                        }
                                    } else {
                                        super.field1007[arg10][arg7][arg6 + 1] = (byte) class283.method1834(super.field1007[arg10][arg7][arg6 + 1], 2);
                                        super.field1007[arg10][arg7 + 1][arg6] = (byte) class283.method1834(super.field1007[arg10][arg7 + 1][arg6], 1);
                                    }
                                } else {
                                    super.field1007[arg10][arg7][arg6] = (byte) class283.method1834(super.field1007[arg10][arg7][arg6], 1);
                                    super.field1007[arg10][arg7][arg6 + 1] = (byte) class283.method1834(super.field1007[arg10][arg7][arg6 + 1], 2);
                                }
                            }
                            if (var12.field5829 != 0 && arg9 != null) {
                                arg9.method2861((byte) 64, var12.field5812, arg7, !var12.field5834, arg6, arg8, arg5);
                            }
                            if (var12.field5809 != 64) {
                                class247.method1637(arg10, arg7, arg6, var12.field5809);
                            }
                        } else if (~arg5 == -4) {
                            class599 var43;
                            if (!var24) {
                                var43 = new class643(arg0, var12, arg10, arg1, var21, var20, var22, super.field1001, arg5, arg8, arg2);
                            } else {
                                class15 var44 = new class15(arg0, var12, arg1, var21, var20, var22, super.field1001, arg5, arg8, var23);
                                var43 = var44;
                                if (var44.method93(-23445)) {
                                    var44.method98(16343, arg0);
                                }
                            }
                            class599 var45 = class491.method2948(arg10, arg7, arg6);
                            if (var45 instanceof class249) {
                                ((class249) var45).field3538 = var43;
                            } else {
                                class16.method105(arg10, arg7, arg6, var43, (class599) null);
                            }
                            if (var12.field5838 && class444.field6646) {
                                if (arg8 == 0) {
                                    var19.method251(arg7, arg6 - -1, 50);
                                } else if (arg8 == 1) {
                                    var19.method251(arg7 + 1, arg6 - -1, 50);
                                } else if (arg8 != 2) {
                                    if (arg8 == 3) {
                                        var19.method251(arg7, arg6, 50);
                                    }
                                } else {
                                    var19.method251(arg7 + 1, arg6, 50);
                                }
                            }
                            if (var12.field5829 != 0 && arg9 != null) {
                                arg9.method2861((byte) -87, var12.field5812, arg7, !var12.field5834, arg6, arg8, arg5);
                            }
                        } else if (arg5 == 9) {
                            class144 var46;
                            if (!var24) {
                                var46 = new class354(arg0, var12, arg10, arg1, var21, var20, var22, super.field1001, arg7, arg7 + -1 - -var13, arg6, arg6 + var14 + -1, arg5, arg8, arg2);
                            } else {
                                class344 var47 = new class344(arg0, var12, arg10, arg1, var21, var20, var22, super.field1001, arg7, arg7, arg6, arg6, arg5, arg8, var23);
                                if (var47.method93(-23445)) {
                                    var47.method98(16343, arg0);
                                }
                                var46 = var47;
                            }
                            class144 var48 = class226.method1473(arg10, arg7, arg6, field3792 != null ? field3792 : (field3792 = method1770("qn")));
                            if (var48 instanceof class343 && ~var48.field1773 == ~arg7 && ~var48.field1758 == ~arg6) {
                                ((class343) var48).field4887 = var46;
                            } else {
                                class367.method2355(var46, false);
                            }
                            if (~var12.field5829 != -1 && arg9 != null) {
                                arg9.method2862(arg6, var14, var13, var12.field5812, arg7, !var12.field5834, (byte) 58);
                            }
                            if (~var12.field5809 != -65) {
                                class247.method1637(arg10, arg7, arg6, var12.field5809);
                            }
                        } else if (~arg5 == -5) {
                            class356 var50;
                            if (var24) {
                                class83 var49 = new class83(arg0, var12, arg1, var21, var20, var22, super.field1001, 0, 0, 0, arg5, arg8);
                                var50 = var49;
                                if (var49.method93(-23445)) {
                                    var49.method98(16343, arg0);
                                }
                            } else {
                                var50 = new class349(arg0, var12, arg10, arg1, var21, var20, var22, super.field1001, 0, 0, 0, arg5, arg8, arg2);
                            }
                            class356 var51 = class458.method2824(arg10, arg7, arg6);
                            if (var51 instanceof class561) {
                                ((class561) var51).field7997 = var50;
                            } else {
                                class34.method190(arg10, arg7, arg6, var50, (class356) null);
                            }
                        } else if (arg5 == 5) {
                            int var52 = 65;
                            class57 var53 = (class57) class491.method2948(arg10, arg7, arg6);
                            if (var53 != null) {
                                var52 = class575.field8301.method1499(-7532, var53.method89(-56)).field5809 - -1;
                            }
                            class356 var55;
                            if (var24) {
                                class83 var54 = new class83(arg0, var12, arg1, var21, var20, var22, super.field1001, 0, class444.field6643[arg8] * var52, class600.field8767[arg8] * var52, arg5, arg8);
                                if (var54.method93(-23445)) {
                                    var54.method98(16343, arg0);
                                }
                                var55 = var54;
                            } else {
                                var55 = new class349(arg0, var12, arg10, arg1, var21, var20, var22, super.field1001, 0, class444.field6643[arg8] * var52, class600.field8767[arg8] * var52, arg5, arg8, arg2);
                            }
                            class356 var56 = class458.method2824(arg10, arg7, arg6);
                            if (!(var56 instanceof class561)) {
                                class34.method190(arg10, arg7, arg6, var55, (class356) null);
                            } else {
                                ((class561) var56).field7997 = var55;
                            }
                        } else if (arg3 == arg5) {
                            int var57 = 33;
                            class57 var58 = (class57) class491.method2948(arg10, arg7, arg6);
                            if (var58 != null) {
                                var57 = class575.field8301.method1499(-7532, var58.method89(122)).field5809 / 2 + 1;
                            }
                            class356 var60;
                            if (var24) {
                                class83 var59 = new class83(arg0, var12, arg1, var21, var20, var22, super.field1001, arg8, class444.field6643[arg8] * var57, class600.field8767[arg8] * var57, arg5, arg8 - -4);
                                if (var59.method93(-23445)) {
                                    var59.method98(16343, arg0);
                                }
                                var60 = var59;
                            } else {
                                var60 = new class349(arg0, var12, arg10, arg1, var21, var20, var22, super.field1001, arg8, class268.field3765[arg8] * var57, class550.field7847[arg8] * var57, arg5, arg8 + 4, arg2);
                            }
                            class356 var61 = class458.method2824(arg10, arg7, arg6);
                            if (var61 instanceof class561) {
                                ((class561) var61).field7997 = var60;
                            } else {
                                class34.method190(arg10, arg7, arg6, var60, (class356) null);
                            }
                        } else if (arg5 == 7) {
                            int var62 = 3 & arg8 + 2;
                            class356 var63;
                            if (!var24) {
                                var63 = new class349(arg0, var12, arg10, arg1, var21, var20, var22, super.field1001, var62, 0, 0, arg5, var62 + 4, arg2);
                            } else {
                                class83 var64 = new class83(arg0, var12, arg1, var21, var20, var22, super.field1001, var62, 0, 0, arg5, var62 + 4);
                                var63 = var64;
                                if (var64.method93(-23445)) {
                                    var64.method98(16343, arg0);
                                }
                            }
                            class356 var65 = class458.method2824(arg10, arg7, arg6);
                            if (var65 instanceof class561) {
                                ((class561) var65).field7997 = var63;
                            } else {
                                class34.method190(arg10, arg7, arg6, var63, (class356) null);
                            }
                        } else if (arg5 == 8) {
                            int var66 = arg8 + 2 & 3;
                            int var67 = 33;
                            class57 var68 = (class57) class491.method2948(arg10, arg7, arg6);
                            if (var68 != null) {
                                var67 = 1 + class575.field8301.method1499(-7532, var68.method89(-61)).field5809 / 2;
                            }
                            class356 var71;
                            class356 var72;
                            if (var24) {
                                class83 var69 = new class83(arg0, var12, arg1, var21, var20, var22, super.field1001, arg8, class268.field3765[arg8] * var67, class550.field7847[arg8] * var67, arg5, arg8 + 4);
                                class83 var70 = new class83(arg0, var12, arg1, var21, var20, var22, super.field1001, arg8, 0, 0, arg5, var66 + 4);
                                if (var69.method93(-23445)) {
                                    var69.method98(16343, arg0);
                                }
                                var71 = var70;
                                if (var70.method93(-23445)) {
                                    var70.method98(arg3 ^ 16337, arg0);
                                }
                                var72 = var69;
                            } else {
                                class349 var73 = new class349(arg0, var12, arg10, arg1, var21, var20, var22, super.field1001, arg8, class268.field3765[arg8] * var67, class550.field7847[arg8] * var67, arg5, arg8 + 4, arg2);
                                class349 var74 = new class349(arg0, var12, arg10, arg1, var21, var20, var22, super.field1001, arg8, 0, 0, arg5, var66 - -4, arg2);
                                var72 = var73;
                                var71 = var74;
                            }
                            class34.method190(arg10, arg7, arg6, var72, var71);
                        }
                    } else {
                        class344 var75 = null;
                        int var77;
                        class144 var78;
                        if (var24) {
                            class344 var76 = new class344(arg0, var12, arg10, arg1, var21, var20, var22, super.field1001, arg7, arg7 + -1 + var13, arg6, arg6 - 1 + var14, arg5, arg8, var23);
                            var77 = var76.method2213(false);
                            var75 = var76;
                            var78 = var76;
                        } else {
                            var77 = 15;
                            var78 = new class354(arg0, var12, arg10, arg1, var21, var20, var22, super.field1001, arg7, arg7 - (-var13 - -1), arg6, var14 + -1 + arg6, arg5, arg8, arg2);
                        }
                        class144 var79 = class226.method1473(arg10, arg7, arg6, field3792 != null ? field3792 : (field3792 = method1770("qn")));
                        boolean var80 = false;
                        if (var79 instanceof class343 && var79.field1773 == arg7 && var79.field1758 == arg6) {
                            ((class343) var79).field4887 = var78;
                            var80 = true;
                        }
                        if (var80 || class367.method2355(var78, false)) {
                            if (var75 != null && var75.method93(arg3 + -23451)) {
                                var75.method98(16343, arg0);
                            }
                            if (var12.field5838 && class444.field6646) {
                                if (var77 > 30) {
                                    var77 = 30;
                                }
                                for (int var81 = 0; var13 >= var81; ++var81) {
                                    for (int var82 = 0; ~var82 >= ~var14; ++var82) {
                                        var19.method251(arg7 + var81, arg6 - -var82, var77);
                                    }
                                }
                            }
                        }
                        if (var12.field5829 != 0 && arg9 != null) {
                            arg9.method2862(arg6, var14, var13, var12.field5812, arg7, !var12.field5834, (byte) 58);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIIZII)V")
    public static final void method1769(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (class375.field5714 != null && (~arg0 != -4 || class595.field8694.field6546 != arg2 || ~class595.field8694.field6559 != ~arg4)) {
            class514.method3053(arg5 + -21328, class375.field5714, class20.field197);
            class375.field5714 = null;
        }
        ++field3787;
        if (~arg0 == -4 && class375.field5714 == null) {
            class375.field5714 = class240.method1602(arg2, -1, class20.field197, arg4, 0, 0);
            if (class375.field5714 != null) {
                class595.field8694.field6559 = arg4;
                class595.field8694.field6546 = arg2;
                class595.field8694.method2440(class20.field197, -116);
            }
        }
        if (~arg0 == -4 && class375.field5714 == null) {
            method1769(class595.field8694.field6543, arg1, -1, true, -1, 21317);
        } else {
            Container var6;
            if (class375.field5714 == null) {
                if (class114.field1430 == null) {
                    if (class635.field9135 == null) {
                        var6 = class385.field5811;
                    } else {
                        var6 = class635.field9135;
                    }
                    class477.field7037 = var6.getSize().width;
                    class434.field6446 = var6.getSize().height;
                } else {
                    Insets var7 = class114.field1430.getInsets();
                    class477.field7037 = class114.field1430.getSize().width + -var7.left + -var7.right;
                    class434.field6446 = class114.field1430.getSize().height + -var7.top - var7.bottom;
                    var6 = class114.field1430;
                }
            } else {
                var6 = class375.field5714;
                class434.field6446 = arg4;
                class477.field7037 = arg2;
            }
            if (~arg0 == -2) {
                class59.field674 = 0;
                class581.field8366 = class492.field7169;
                class298.field4407 = class629.field9079;
                class324.field4678 = (-class492.field7169 + class477.field7037) / 2;
            } else {
                class23.method146(arg5 ^ 22341);
            }
            if (arg5 == 21317) {
                if (class646.field9321 != class197.field2667) {
                    boolean var10000;
                    if (class581.field8366 < 1024 && class298.field4407 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                if (arg3) {
                    class72.method484((byte) -13);
                } else {
                    class30.field348.setSize(class581.field8366, class298.field4407);
                    class413.field6264.method347(class30.field348);
                    if (class114.field1430 == var6) {
                        Insets var8 = class114.field1430.getInsets();
                        class30.field348.setLocation(class324.field4678 + var8.left, class59.field674 + var8.top);
                    } else {
                        class30.field348.setLocation(class324.field4678, class59.field674);
                    }
                }
                if (arg0 >= 2) {
                    class191.field2513 = true;
                } else {
                    class191.field2513 = false;
                }
                if (~class518.field7542 != 0) {
                    class599.method3480(-123, true);
                }
                if (class170.field2077 != null && class463.method2838(arg5 ^ 21327, class133.field1673)) {
                    class611.method3536(arg5 + -21318);
                }
                for (int var9 = 0; var9 < 100; ++var9) {
                    class136.field1692[var9] = true;
                }
                class630.field9093 = true;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1770(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class572("", 73);
        field3788 = new class114();
        field3790 = new class73(61, 15);
        field3791 = 0;
    }
}
