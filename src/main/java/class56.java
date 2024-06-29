import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class56 extends class323 {

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    public int field1082 = 99;

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "J")
    public static long field1090 = 0L;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "Lnea;")
    public static class664 field1088 = new class664(55, 0);

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "Lrw;")
    public static class703 field1092 = new class703(5, 1);

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "I")
    public static int field1094 = 0;

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "[I")
    public static int[] field1095 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
    public static int field1093;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bd", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field1096;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[IIILmo;Lr;BIII)V")
    public final void method605(int arg0, int arg1, int[] arg2, int arg3, int arg4, class695 arg5, class166 arg6, byte arg7, int arg8, int arg9, int arg10) {
        ++field1087;
        if (!super.field4760) {
            boolean var12 = false;
            class248 var13 = null;
            if (arg2 != null) {
                arg2[0] = -1;
            }
            int var14 = (arg3 & 7) * 8;
            if (arg7 != 41) {
                this.method616((class166) null, false, -90);
            }
            int var15 = (7 & arg0) * 8;
            while (true) {
                while (arg5.field9796.length > arg5.field9761) {
                    int var20 = arg5.method3826(false);
                    if (~var20 == -1) {
                        var13 = new class248(arg5);
                    } else if (var20 == 1) {
                        int var34 = arg5.method3826(false);
                        if (var34 > 0) {
                            for (int var35 = 0; var35 < var34; ++var35) {
                                class506 var36 = new class506(arg6, arg5, 2);
                                if (var36.field7155 == 31) {
                                    class227 var37 = class472.field6748.method1812(arg5.method3847((byte) 118), 1);
                                    var36.method2914(var37.field3192, var37.field3191, false, var37.field3184, var37.field3188);
                                }
                                if (~arg6.method173() < -1) {
                                    class498 var38 = var36.field7165;
                                    int var39 = var38.method2883(127) >> 9;
                                    int var40 = var38.method2875(true) >> 9;
                                    if (var36.field7160 == arg4 && ~var14 >= ~var39 && var14 + 8 > var39 && var40 >= var15 && ~(var15 + 8) < ~var40) {
                                        int var41 = class416.method2505(var38.method2883(126) & 4095, arg8, -1, 4095 & var38.method2875(true)) + (arg10 << 9);
                                        int var42 = var41 >> 9;
                                        int var43 = class630.method3510(-31990, arg8, 4095 & var38.method2875(true), 4095 & var38.method2883(127)) + (arg9 << 9);
                                        int var44 = var43 >> 9;
                                        if (var42 >= 0 && var44 >= 0 && super.field4763 > var42 && ~super.field4785 < ~var44) {
                                            var38.method772(var41, var43, super.field4765[arg4][var42][var44] + -var38.method2877(arg7 ^ -42), 43);
                                            class165.method1144(var36);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~var20 == -3) {
                        if (var13 == null) {
                            var13 = new class248();
                        }
                        var13.method1667(8, arg5);
                    } else if (~var20 == -129) {
                        if (arg2 != null) {
                            arg2[0] = arg5.method3847((byte) 118);
                            arg2[1] = arg5.method3814(false);
                            arg2[2] = arg5.method3814(false);
                            arg2[3] = arg5.method3814(false);
                            arg2[4] = arg5.method3847((byte) 118);
                        } else {
                            arg5.field9761 += 10;
                        }
                    } else {
                        if (var20 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field4780 == null) {
                            super.field4780 = new byte[4][][];
                        }
                        for (int var21 = 0; ~var21 > -5; ++var21) {
                            byte var22 = arg5.method3827((byte) 31);
                            if (~var22 == -1 && super.field4780[arg1] != null) {
                                if (~arg4 <= ~var21) {
                                    int var23 = arg10;
                                    int var24 = arg10 - -7;
                                    int var25 = arg9;
                                    if (~arg10 > -1) {
                                        var23 = 0;
                                    } else if (super.field4763 <= arg10) {
                                        var23 = super.field4763;
                                    }
                                    if (var24 >= 0) {
                                        if (~var24 <= ~super.field4763) {
                                            var24 = super.field4763;
                                        }
                                    } else {
                                        var24 = 0;
                                    }
                                    if (~arg9 > -1) {
                                        var25 = 0;
                                    } else if (arg9 >= super.field4785) {
                                        var25 = super.field4785;
                                    }
                                    int var26 = arg9 - -7;
                                    if (var26 < 0) {
                                        var26 = 0;
                                    } else if (var26 >= super.field4785) {
                                        var26 = super.field4785;
                                    }
                                    while (var23 < var24) {
                                        while (var25 < var26) {
                                            super.field4780[arg1][var23][var25] = 0;
                                            ++var25;
                                        }
                                        ++var23;
                                    }
                                }
                            } else if (~var22 == -2) {
                                if (super.field4780[arg1] == null) {
                                    super.field4780[arg1] = new byte[super.field4763 - -1][super.field4785 + 1];
                                }
                                for (int var27 = 0; ~var27 > -65; var27 += 4) {
                                    for (int var28 = 0; ~var28 > -65; var28 += 4) {
                                        byte var29 = arg5.method3827((byte) -61);
                                        if (var21 <= arg4) {
                                            for (int var30 = var27; var30 < var27 + 4; ++var30) {
                                                for (int var31 = var28; ~(var28 + 4) < ~var31; ++var31) {
                                                    if (var30 >= var14 && ~(var14 + 8) < ~var30 && var15 <= var31 && var15 + 8 > var15) {
                                                        int var32 = class392.method2410(arg8, var30 & 7, 7 & var31, 1) + arg10;
                                                        int var33 = arg9 - -class239.method1637(arg8, 86, var30 & 7, 7 & var31);
                                                        if (~var32 <= -1 && ~var32 > ~super.field4763 && ~var33 <= -1 && ~super.field4785 < ~var33) {
                                                            super.field4780[arg1][var32][var33] = var29;
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
                    class575.method3260((byte) 81, arg10 >> 3, var13, arg9 >> 3);
                }
                if (!var12 && super.field4780 != null && super.field4780[arg1] != null) {
                    int var16 = arg10 + 7;
                    int var17 = arg9 - -7;
                    for (int var18 = arg10; var16 > var18; ++var18) {
                        for (int var19 = arg9; ~var19 > ~var17; ++var19) {
                            super.field4780[arg1][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([B[Lcp;IILr;B)V")
    public final void method606(byte[] arg0, class674[] arg1, int arg2, int arg3, class166 arg4, byte arg5) {
        ++field1081;
        class695 var7 = new class695(arg0);
        if (arg5 == -36) {
            int var8 = -1;
            while (true) {
                int var9 = var7.method3822(32767);
                if (var9 == 0) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.method3815(-32768);
                    if (~var11 == -1) {
                        break;
                    }
                    var10 += var11 - 1;
                    int var12 = 63 & var10;
                    int var13 = var10 >> 6 & 63;
                    int var14 = var10 >> 12;
                    int var15 = var7.method3826(false);
                    int var16 = var15 >> 2;
                    int var17 = 3 & var15;
                    int var18 = arg2 + var13;
                    int var19 = arg3 + var12;
                    if (var18 > 0 && ~var19 < -1 && ~(super.field4763 + -1) < ~var18 && ~var19 > ~(super.field4785 + -1)) {
                        class674 var20 = null;
                        if (!super.field4760) {
                            int var21 = var14;
                            if ((2 & class672.field9500[1][var18][var19]) == 2) {
                                var21 = var14 - 1;
                            }
                            if (~var21 <= -1) {
                                var20 = arg1[var21];
                            }
                        }
                        this.method615(var20, var17, var14, var19, 50, var8, -1, arg4, var14, var16, var18);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[BIIIILr;I[Lcp;II)V")
    public final void method607(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, class166 arg6, int arg7, class674[] arg8, int arg9, int arg10) {
        ++field1077;
        if (arg4 == 0) {
            class695 var12 = new class695(arg1);
            int var13 = -1;
            while (true) {
                int var14 = var12.method3822(32767);
                if (var14 == 0) {
                    return;
                }
                var13 += var14;
                int var15 = 0;
                while (true) {
                    int var16 = var12.method3815(arg4 ^ -32768);
                    if (var16 == 0) {
                        break;
                    }
                    var15 += var16 + -1;
                    int var17 = 63 & var15;
                    int var18 = (var15 & 4045) >> 6;
                    int var19 = var15 >> 12;
                    int var20 = var12.method3826(false);
                    int var21 = var20 >> 2;
                    int var22 = var20 & 3;
                    if (arg10 == var19 && ~arg7 >= ~var18 && arg7 + 8 > var18 && arg5 <= var17 && arg5 + 8 > var17) {
                        class550 var23 = class101.field1572.method2617((byte) -117, var13);
                        int var24 = class531.method3030(-1, var22, arg9, 7 & var18, var17 & 7, var23.field7752, var23.field7733) + arg2;
                        int var25 = arg0 + class527.method3023(-1, var23.field7733, var18 & 7, arg9, var23.field7752, var22, var17 & 7);
                        if (var24 > 0 && var25 > 0 && super.field4763 + -1 > var24 && ~var25 > ~(super.field4785 + -1)) {
                            class674 var26 = null;
                            if (!super.field4760) {
                                int var27 = arg3;
                                if ((class672.field9500[1][var24][var25] & 2) == 2) {
                                    var27 = arg3 - 1;
                                }
                                if (~var27 <= -1) {
                                    var26 = arg8[var27];
                                }
                            }
                            this.method615(var26, arg9 + var22 & 3, arg3, var25, 50, var13, -1, arg6, arg3, var21, var24);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZ)V")
    public static final void method608(int arg0, boolean arg1) {
        if (arg1) {
            ++field1084;
            class191 var2 = class6.method38(6, -80, arg0);
            var2.method1284((byte) -117);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[IIILmo;Lr;)V")
    public final void method609(int arg0, int[] arg1, int arg2, int arg3, class695 arg4, class166 arg5) {
        ++field1083;
        if (!super.field4760) {
            boolean var7 = false;
            if (arg1 != null) {
                arg1[0] = -1;
            }
            class248 var8 = null;
            while (true) {
                int var19;
                label315: do {
                    while (true) {
                        while (arg4.field9796.length > arg4.field9761) {
                            int var18 = arg4.method3826(false);
                            if (~var18 != -1) {
                                if (var18 == 1) {
                                    var19 = arg4.method3826(false);
                                    continue label315;
                                }
                                if (~var18 == -3) {
                                    if (var8 == null) {
                                        var8 = new class248();
                                    }
                                    var8.method1667(8, arg4);
                                } else if (var18 == 128) {
                                    if (arg1 != null) {
                                        arg1[0] = arg4.method3847((byte) 118);
                                        arg1[1] = arg4.method3814(false);
                                        arg1[2] = arg4.method3814(false);
                                        arg1[3] = arg4.method3814(false);
                                        arg1[4] = arg4.method3847((byte) 118);
                                    } else {
                                        arg4.field9761 += 10;
                                    }
                                } else {
                                    if (var18 != 129) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field4780 == null) {
                                        super.field4780 = new byte[4][][];
                                    }
                                    for (int var28 = 0; ~var28 > -5; ++var28) {
                                        byte var29 = arg4.method3827((byte) 78);
                                        if (var29 == 0 && super.field4780[var28] != null) {
                                            int var30 = arg2;
                                            int var31 = arg2 + 64;
                                            int var32 = arg0;
                                            int var33 = arg0 + 64;
                                            if (~var31 <= -1) {
                                                if (~var31 <= ~super.field4763) {
                                                    var31 = super.field4763;
                                                }
                                            } else {
                                                var31 = 0;
                                            }
                                            if (~arg0 > -1) {
                                                var32 = 0;
                                            } else if (super.field4785 <= arg0) {
                                                var32 = super.field4785;
                                            }
                                            if (arg2 < 0) {
                                                var30 = 0;
                                            } else if (~super.field4763 >= ~arg2) {
                                                var30 = super.field4763;
                                            }
                                            if (~var33 <= -1) {
                                                if (~var33 <= ~super.field4785) {
                                                    var33 = super.field4785;
                                                }
                                            } else {
                                                var33 = 0;
                                            }
                                            while (~var30 > ~var31) {
                                                while (var32 < var33) {
                                                    super.field4780[var28][var30][var32] = 0;
                                                    ++var32;
                                                }
                                                ++var30;
                                            }
                                        } else if (var29 != 1) {
                                            if (var29 == 2) {
                                                if (super.field4780[var28] == null) {
                                                    super.field4780[var28] = new byte[super.field4763 - -1][super.field4785 + 1];
                                                }
                                                if (~var28 < -1) {
                                                    int var34 = arg2;
                                                    int var35 = arg2 + 64;
                                                    int var36 = arg0;
                                                    int var37 = arg0 + 64;
                                                    if (~var35 > -1) {
                                                        var35 = 0;
                                                    } else if (~var35 <= ~super.field4763) {
                                                        var35 = super.field4763;
                                                    }
                                                    if (~arg2 <= -1) {
                                                        if (~arg2 <= ~super.field4763) {
                                                            var34 = super.field4763;
                                                        }
                                                    } else {
                                                        var34 = 0;
                                                    }
                                                    if (arg0 >= 0) {
                                                        if (~super.field4785 >= ~arg0) {
                                                            var36 = super.field4785;
                                                        }
                                                    } else {
                                                        var36 = 0;
                                                    }
                                                    if (var37 >= 0) {
                                                        if (~super.field4785 >= ~var37) {
                                                            var37 = super.field4785;
                                                        }
                                                    } else {
                                                        var37 = 0;
                                                    }
                                                    while (~var35 < ~var34) {
                                                        while (~var36 > ~var37) {
                                                            super.field4780[var28][var34][var36] = super.field4780[var28 + -1][var34][var36];
                                                            ++var36;
                                                        }
                                                        ++var34;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (super.field4780[var28] == null) {
                                                super.field4780[var28] = new byte[super.field4763 - -1][super.field4785 - -1];
                                            }
                                            for (int var38 = 0; var38 < 64; var38 += 4) {
                                                for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                                    byte var40 = arg4.method3827((byte) 40);
                                                    for (int var41 = arg2 + var38; var41 < arg2 + var38 + 4; ++var41) {
                                                        for (int var42 = var39 - -arg0; var42 < arg0 + var39 + 4; ++var42) {
                                                            if (~var41 <= -1 && var41 < super.field4763 && var42 >= 0 && ~super.field4785 < ~var42) {
                                                                super.field4780[var28][var41][var42] = var40;
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
                                var8 = new class248(arg4);
                            }
                        }
                        if (arg3 < 17) {
                            field1092 = null;
                        }
                        if (var8 != null) {
                            for (int var9 = 0; var9 < 8; ++var9) {
                                for (int var10 = 0; var10 < 8; ++var10) {
                                    int var11 = (arg2 >> 3) + var9;
                                    int var12 = (arg0 >> 3) - -var10;
                                    if (~var11 <= -1 && ~(super.field4763 >> 3) < ~var11 && var12 >= 0 && super.field4785 >> 3 > var12) {
                                        class575.method3260((byte) 81, var11, var8, var12);
                                    }
                                }
                            }
                        }
                        if (!var7 && super.field4780 != null) {
                            for (int var13 = 0; ~var13 > -5; ++var13) {
                                if (super.field4780[var13] != null) {
                                    for (int var14 = 0; ~var14 > -17; ++var14) {
                                        for (int var15 = 0; ~var15 > -17; ++var15) {
                                            int var16 = (arg2 >> 2) + var14;
                                            int var17 = (arg0 >> 2) + var15;
                                            if (var16 >= 0 && var16 < 26 && ~var17 <= -1 && ~var17 > -27) {
                                                super.field4780[var13][var16][var17] = 0;
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
                    class506 var21 = new class506(arg5, arg4, 2);
                    if (~var21.field7155 == -32) {
                        class227 var22 = class472.field6748.method1812(arg4.method3847((byte) 118), 1);
                        var21.method2914(var22.field3192, var22.field3191, false, var22.field3184, var22.field3188);
                    }
                    if (~arg5.method173() < -1) {
                        class498 var23 = var21.field7165;
                        int var24 = var23.method2883(126) - -(arg2 << 9);
                        int var25 = (arg0 << 9) + var23.method2875(true);
                        int var26 = var24 >> 9;
                        int var27 = var25 >> 9;
                        if (var26 >= 0 && var27 >= 0 && ~super.field4763 < ~var26 && var27 < super.field4785) {
                            var23.method772(var24, var25, super.field4765[var21.field7160][var26][var27] + -var23.method2877(-1), 91);
                            class165.method1144(var21);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(IIIZ)V")
    public class56(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class52.field1041, class483.field6869);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public static final void method610(int arg0) {
        if (arg0 >= -103) {
            method614((int[]) null, 47);
        }
        ++field1091;
        class512.field7202.method122(class637.field9005, !class287.field4270.field3681 ? -1 : class421.field6140 + 256 << 2, 0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILmo;)V")
    public static final void method611(int arg0, class695 arg1) {
        ++field1085;
        int var2 = arg1.method3815(-32768);
        class127.field1895 = new class386[var2];
        for (int var3 = 0; var3 < var2; ++var3) {
            class127.field1895[var3] = new class386();
            class127.field1895[var3].field5438 = arg1.method3815(-32768);
            class127.field1895[var3].field5434 = arg1.method3874(127);
        }
        class32.field497 = arg1.method3815(-32768);
        class390.field5790 = arg1.method3815(-32768);
        class475.field6775 = arg1.method3815(-32768);
        class656.field9195 = new class178[class390.field5790 + 1 + -class32.field497];
        int var4 = 0;
        int var5 = -53 / ((15 - arg0) / 35);
        while (class475.field6775 > var4) {
            int var6 = arg1.method3815(-32768);
            class178 var7 = class656.field9195[var6] = new class178();
            var7.field2927 = arg1.method3826(false);
            var7.field2920 = arg1.method3880(8);
            var7.field2535 = class32.field497 + var6;
            var7.field2539 = arg1.method3874(125);
            var7.field2532 = arg1.method3874(126);
            ++var4;
        }
        class124.field1871 = arg1.method3880(8);
        class683.field9624 = true;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static void method612(byte arg0) {
        field1088 = null;
        field1092 = null;
        int var1 = 45 % ((arg0 - 79) / 43);
        field1095 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILcp;ILr;III)V")
    public final void method613(int arg0, class674 arg1, int arg2, class166 arg3, int arg4, int arg5, int arg6) {
        ++field1078;
        class614 var8 = null;
        if (arg2 == arg4) {
            var8 = (class614) class149.method1061(arg6, arg5, arg0);
        }
        if (arg2 == 1) {
            var8 = (class614) class98.method797(arg6, arg5, arg0);
        }
        if (arg2 == 2) {
            var8 = (class614) class349.method2155(arg6, arg5, arg0, field1096 != null ? field1096 : (field1096 = method617("rda")));
        }
        if (arg2 == 3) {
            var8 = (class614) class124.method946(arg6, arg5, arg0);
        }
        if (var8 != null) {
            class550 var9 = class101.field1572.method2617((byte) -113, var8.method1179(true));
            int var10 = var8.method1186(-9960);
            int var11 = var8.method1175(24563);
            if (var9.method3119(31877)) {
                class239.method1628(arg4 + 124, arg5, arg6, arg0, var9);
            }
            if (var8.method1180(114)) {
                var8.method1172(arg3, 67);
            }
            if (arg2 != 0) {
                if (~arg2 == -2) {
                    class32.method358(arg6, arg5, arg0);
                    return;
                }
                if (~arg2 != -3) {
                    if (~arg2 == -4) {
                        class239.method1627(arg6, arg5, arg0);
                        if (~var9.field7806 == -2) {
                            arg1.method3755(arg5, arg0, 96);
                            return;
                        }
                    }
                    return;
                }
                class94.method777(arg6, arg5, arg0, field1096 != null ? field1096 : (field1096 = method617("rda")));
                if (~var9.field7806 != -1 && super.field4763 > var9.field7752 + arg5 && ~(var9.field7752 + arg0) > ~super.field4785 && ~super.field4763 < ~(var9.field7733 + arg5) && ~super.field4785 < ~(var9.field7733 + arg0)) {
                    arg1.method3745(arg0, var9.field7752, var9.field7773, arg5, var11, !var9.field7795, var9.field7733, 131072);
                    return;
                }
                return;
            }
            class230.method1587(arg6, arg5, arg0);
            if (var9.field7806 != 0) {
                arg1.method3744(var9.field7773, arg4 ^ -116, var10, var11, arg0, !var9.field7795, arg5);
            }
            if (var9.field7776 == 1) {
                if (~var11 != -1) {
                    if (var11 != 1) {
                        if (~var11 == -3) {
                            class49.method555(arg6, 1, arg0, arg5 + 1, (byte) -92);
                            return;
                        }
                        if (var11 == 3) {
                            class49.method555(arg6, 2, arg0, arg5, (byte) -56);
                            return;
                        }
                    } else {
                        class49.method555(arg6, 2, arg0 + 1, arg5, (byte) -113);
                    }
                    return;
                }
                class49.method555(arg6, 1, arg0, arg5, (byte) -125);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([II)Ljava/lang/String;")
    public static final String method614(int[] arg0, int arg1) {
        ++field1079;
        StringBuffer var2 = new StringBuffer();
        int var3 = class406.field5943;
        for (int var4 = arg1; arg0.length > var4; ++var4) {
            class282 var5 = class325.field4802.method865(true, arg0[var4]);
            if (~var5.field4252 != 0) {
                class702 var6 = (class702) class657.field9227.method2287(arg1 + 1, (long) var5.field4252);
                if (var6 == null) {
                    class113 var7 = class113.method875(class703.field9909, var5.field4252, 0);
                    if (var7 != null) {
                        var6 = class282.field4228.method138(var7, true);
                        class657.field9227.method2291(var6, (long) var5.field4252, 1);
                    }
                }
                if (var6 != null) {
                    class210.field2948[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    ++var3;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lcp;IIIIIILr;III)V")
    public final void method615(class674 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class166 arg7, int arg8, int arg9, int arg10) {
        ++field1089;
        if (class287.field4270.method2747(125, class328.field4859) || class278.method1815(5, arg2, arg3, class97.field1532, arg10)) {
            if (arg8 < this.field1082) {
                this.field1082 = arg8;
            }
            class550 var12 = class101.field1572.method2617((byte) -104, arg5);
            if (!arg7.method148() || !class287.field4270.field3724 || !var12.field7768) {
                int var13;
                int var14;
                if (arg1 != 1 && arg1 != 3) {
                    var13 = var12.field7733;
                    var14 = var12.field7752;
                } else {
                    var14 = var12.field7733;
                    var13 = var12.field7752;
                }
                if (arg4 != 50) {
                    this.field1082 = 63;
                }
                int var15;
                int var16;
                if (~(arg10 + var14) < ~super.field4763) {
                    var15 = arg10 - -1;
                    var16 = arg10;
                } else {
                    var16 = (var14 >> 1) + arg10;
                    var15 = arg10 - -(var14 + 1 >> 1);
                }
                int var17;
                int var18;
                if (~(arg3 - -var13) >= ~super.field4785) {
                    var17 = arg3 - -(var13 >> 1);
                    var18 = (var13 + 1 >> 1) + arg3;
                } else {
                    var17 = arg3;
                    var18 = arg3 - -1;
                }
                class37 var19 = class296.field4340[arg2];
                int var20 = var19.method432(var16, false, var17) + var19.method432(var15, false, var17) - -var19.method432(var16, false, var18) - -var19.method432(var15, false, var18) >> 2;
                int var21 = (arg10 << 9) + (var14 << 8);
                int var22 = (arg3 << 9) - -(var13 << 8);
                boolean var23 = class699.field9885 && !super.field4760 && var12.field7780;
                if (var12.method3119(31877)) {
                    class83.method738(arg10, (class577) null, arg8, arg3, var12, -25535, arg1, (class491) null);
                }
                boolean var24 = arg6 == -1 && ~var12.field7758 == 0 && var12.field7790 == null && var12.field7781 == null && !var12.field7784;
                if (!class590.field8272 || (!class327.method2060(arg9, 24) || ~var12.field7776 == -2) && (!class270.method1760(39, arg9) || ~var12.field7776 != -1)) {
                    if (~arg9 == -23) {
                        if (class287.field4270.field3714 || ~var12.field7746 != -1 || var12.field7806 == 1 || var12.field7748) {
                            class701 var25;
                            if (!var24) {
                                var25 = new class619(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, arg1, arg6);
                            } else {
                                class221 var26 = new class221(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, arg1, var23);
                                if (var26.method1180(116)) {
                                    var26.method1176(arg7, false);
                                }
                                var25 = var26;
                            }
                            class531.method3028(arg8, arg10, arg3, var25);
                            if (var12.field7806 == 1 && arg0 != null) {
                                arg0.method3746(-115, arg10, arg3);
                            }
                        }
                    } else if (~arg9 != -11 && arg9 != 11) {
                        if (arg9 >= 12 && arg9 <= 17 || ~arg9 <= -19 && arg9 <= 21) {
                            class454 var28;
                            if (var24) {
                                class622 var27 = new class622(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, arg10, var14 + -1 + arg10, arg3, arg3 + -1 + var13, arg9, arg1, var23);
                                var28 = var27;
                                if (var27.method1180(122)) {
                                    var27.method1176(arg7, false);
                                }
                            } else {
                                var28 = new class172(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, arg10, var14 + -1 + arg10, arg3, arg3 + -1 + var13, arg9, arg1, arg6);
                            }
                            class598.method3381(var28, false);
                            if (class699.field9885 && !super.field4760 && arg9 >= 12 && arg9 <= 17 && ~arg9 != -14 && ~arg8 < -1 && ~var12.field7776 != -1) {
                                super.field4774[arg8][arg10][arg3] = (byte) class486.method2826(super.field4774[arg8][arg10][arg3], 4);
                            }
                            if (~var12.field7806 != -1 && arg0 != null) {
                                arg0.method3747(!var12.field7795, var12.field7773, arg10, var13, arg3, (byte) 82, var14);
                            }
                        } else if (~arg9 == -1) {
                            int var29 = var12.field7776;
                            if (class123.field1861 && ~var12.field7776 == 0) {
                                var29 = 1;
                            }
                            class244 var30;
                            if (!var24) {
                                var30 = new class564(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, arg9, arg1, arg6);
                            } else {
                                class176 var31 = new class176(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, arg9, arg1, var23);
                                var30 = var31;
                                if (var31.method1180(108)) {
                                    var31.method1176(arg7, false);
                                }
                            }
                            class408.method2467(arg8, arg10, arg3, var30, (class244) null);
                            if (arg1 == 0) {
                                if (class699.field9885 && var12.field7787) {
                                    var19.method440(arg10, arg3, 50);
                                    var19.method440(arg10, arg3 - -1, 50);
                                }
                                if (var29 == 1 && !super.field4760) {
                                    class407.method2464(arg10, arg3, true, var12.field7782, var12.field7721, arg8, 1);
                                }
                            } else if (~arg1 != -2) {
                                if (arg1 == 2) {
                                    if (class699.field9885 && var12.field7787) {
                                        var19.method440(arg10 + 1, arg3, 50);
                                        var19.method440(arg10 + 1, arg3 + 1, 50);
                                    }
                                    if (~var29 == -2 && !super.field4760) {
                                        class407.method2464(arg10 + 1, arg3, true, -var12.field7782, var12.field7721, arg8, 1);
                                    }
                                } else if (arg1 == 3) {
                                    if (class699.field9885 && var12.field7787) {
                                        var19.method440(arg10, arg3, 50);
                                        var19.method440(arg10 - -1, arg3, 50);
                                    }
                                    if (var29 == 1 && !super.field4760) {
                                        class407.method2464(arg10, arg3, true, var12.field7782, var12.field7721, arg8, 2);
                                    }
                                }
                            } else {
                                if (class699.field9885 && var12.field7787) {
                                    var19.method440(arg10, arg3 + 1, 50);
                                    var19.method440(arg10 + 1, arg3 - -1, 50);
                                }
                                if (var29 == 1 && !super.field4760) {
                                    class407.method2464(arg10, arg3 + 1, true, -var12.field7782, var12.field7721, arg8, 2);
                                }
                            }
                            if (~var12.field7806 != -1 && arg0 != null) {
                                arg0.method3739(arg1, arg3, arg9, !var12.field7795, arg10, var12.field7773, (byte) -88);
                            }
                            if (~var12.field7803 != -65) {
                                class221.method1453(arg8, arg10, arg3, var12.field7803);
                            }
                        } else if (arg9 == 1) {
                            class244 var32;
                            if (!var24) {
                                var32 = new class564(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, arg9, arg1, arg6);
                            } else {
                                class176 var33 = new class176(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, arg9, arg1, var23);
                                if (var33.method1180(123)) {
                                    var33.method1176(arg7, false);
                                }
                                var32 = var33;
                            }
                            class408.method2467(arg8, arg10, arg3, var32, (class244) null);
                            if (var12.field7787 && class699.field9885) {
                                if (arg1 != 0) {
                                    if (arg1 != 1) {
                                        if (arg1 != 2) {
                                            if (arg1 == 3) {
                                                var19.method440(arg10, arg3, 50);
                                            }
                                        } else {
                                            var19.method440(arg10 + 1, arg3, 50);
                                        }
                                    } else {
                                        var19.method440(arg10 + 1, arg3 - -1, 50);
                                    }
                                } else {
                                    var19.method440(arg10, arg3 + 1, 50);
                                }
                            }
                            if (var12.field7806 != 0 && arg0 != null) {
                                arg0.method3739(arg1, arg3, arg9, !var12.field7795, arg10, var12.field7773, (byte) 47);
                            }
                        } else if (~arg9 == -3) {
                            int var34 = arg1 - -1 & 3;
                            class244 var35;
                            class244 var36;
                            if (!var24) {
                                var35 = new class564(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, arg9, arg1 + 4, arg6);
                                var36 = new class564(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, arg9, var34, arg6);
                            } else {
                                class176 var37 = new class176(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, arg9, arg1 + 4, var23);
                                class176 var38 = new class176(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, arg9, var34, var23);
                                if (var37.method1180(107)) {
                                    var37.method1176(arg7, false);
                                }
                                if (var38.method1180(108)) {
                                    var38.method1176(arg7, false);
                                }
                                var35 = var37;
                                var36 = var38;
                            }
                            class408.method2467(arg8, arg10, arg3, var35, var36);
                            if ((var12.field7776 == 1 || class123.field1861 && ~var12.field7776 == 0) && !super.field4760) {
                                if (arg1 != 0) {
                                    if (arg1 == 1) {
                                        class407.method2464(arg10 + 1, arg3, true, var12.field7782, var12.field7721, arg8, 1);
                                        class407.method2464(arg10, arg3 + 1, true, var12.field7782, var12.field7721, arg8, 2);
                                    } else if (~arg1 != -3) {
                                        if (~arg1 == -4) {
                                            class407.method2464(arg10, arg3, true, var12.field7782, var12.field7721, arg8, 1);
                                            class407.method2464(arg10, arg3, true, var12.field7782, var12.field7721, arg8, 2);
                                        }
                                    } else {
                                        class407.method2464(arg10 - -1, arg3, true, var12.field7782, var12.field7721, arg8, 1);
                                        class407.method2464(arg10, arg3, true, var12.field7782, var12.field7721, arg8, 2);
                                    }
                                } else {
                                    class407.method2464(arg10, arg3, true, var12.field7782, var12.field7721, arg8, 1);
                                    class407.method2464(arg10, arg3 + 1, true, var12.field7782, var12.field7721, arg8, 2);
                                }
                            }
                            if (~var12.field7806 != -1 && arg0 != null) {
                                arg0.method3739(arg1, arg3, arg9, !var12.field7795, arg10, var12.field7773, (byte) 42);
                            }
                            if (var12.field7803 != 64) {
                                class221.method1453(arg8, arg10, arg3, var12.field7803);
                            }
                        } else if (~arg9 == -4) {
                            class244 var40;
                            if (var24) {
                                class176 var39 = new class176(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, arg9, arg1, var23);
                                if (var39.method1180(arg4 ^ 90)) {
                                    var39.method1176(arg7, false);
                                }
                                var40 = var39;
                            } else {
                                var40 = new class564(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, arg9, arg1, arg6);
                            }
                            class408.method2467(arg8, arg10, arg3, var40, (class244) null);
                            if (var12.field7787 && class699.field9885) {
                                if (~arg1 != -1) {
                                    if (arg1 != 1) {
                                        if (~arg1 == -3) {
                                            var19.method440(arg10 - -1, arg3, 50);
                                        } else if (~arg1 == -4) {
                                            var19.method440(arg10, arg3, 50);
                                        }
                                    } else {
                                        var19.method440(arg10 - -1, arg3 - -1, 50);
                                    }
                                } else {
                                    var19.method440(arg10, arg3 + 1, 50);
                                }
                            }
                            if (var12.field7806 != 0 && arg0 != null) {
                                arg0.method3739(arg1, arg3, arg9, !var12.field7795, arg10, var12.field7773, (byte) -114);
                            }
                        } else if (arg9 == 9) {
                            class454 var42;
                            if (var24) {
                                class622 var41 = new class622(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, arg10, arg10, arg3, arg3, arg9, arg1, var23);
                                var42 = var41;
                                if (var41.method1180(113)) {
                                    var41.method1176(arg7, false);
                                }
                            } else {
                                var42 = new class172(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, arg10, var14 + -1 + arg10, arg3, var13 + -1 + arg3, arg9, arg1, arg6);
                            }
                            class598.method3381(var42, false);
                            if (var12.field7806 != 0 && arg0 != null) {
                                arg0.method3747(!var12.field7795, var12.field7773, arg10, var13, arg3, (byte) 48, var14);
                            }
                            if (var12.field7803 != 64) {
                                class221.method1453(arg8, arg10, arg3, var12.field7803);
                            }
                        } else if (arg9 == 4) {
                            class126 var43;
                            if (!var24) {
                                var43 = new class594(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, 0, 0, arg9, arg1, arg6);
                            } else {
                                class485 var44 = new class485(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, 0, 0, arg9, arg1);
                                if (var44.method1180(111)) {
                                    var44.method1176(arg7, false);
                                }
                                var43 = var44;
                            }
                            class484.method2817(arg8, arg10, arg3, var43, (class126) null);
                        } else if (arg9 == 5) {
                            int var45 = 65;
                            class614 var46 = (class614) class149.method1061(arg8, arg10, arg3);
                            if (var46 != null) {
                                var45 = class101.field1572.method2617((byte) -108, var46.method1179(true)).field7803 - -1;
                            }
                            class126 var47;
                            if (!var24) {
                                var47 = new class594(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, class662.field9361[arg1] * var45, class401.field5907[arg1] * var45, arg9, arg1, arg6);
                            } else {
                                class485 var48 = new class485(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, class662.field9361[arg1] * var45, class401.field5907[arg1] * var45, arg9, arg1);
                                var47 = var48;
                                if (var48.method1180(127)) {
                                    var48.method1176(arg7, false);
                                }
                            }
                            class484.method2817(arg8, arg10, arg3, var47, (class126) null);
                        } else if (~arg9 == -7) {
                            int var49 = 33;
                            class614 var50 = (class614) class149.method1061(arg8, arg10, arg3);
                            if (var50 != null) {
                                var49 = class101.field1572.method2617((byte) -88, var50.method1179(true)).field7803 / 2 - -1;
                            }
                            class126 var52;
                            if (var24) {
                                class485 var51 = new class485(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, class662.field9361[arg1] * var49, class401.field5907[arg1] * var49, arg9, arg1 + 4);
                                var52 = var51;
                                if (var51.method1180(117)) {
                                    var51.method1176(arg7, false);
                                }
                            } else {
                                var52 = new class594(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, class657.field9216[arg1] * var49, class612.field8571[arg1] * var49, arg9, arg1 + 4, arg6);
                            }
                            class484.method2817(arg8, arg10, arg3, var52, (class126) null);
                        } else if (arg9 == 7) {
                            int var53 = arg1 - -2 & 3;
                            class126 var54;
                            if (!var24) {
                                var54 = new class594(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, 0, 0, arg9, var53 + 4, arg6);
                            } else {
                                class485 var55 = new class485(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, 0, 0, arg9, var53 + 4);
                                if (var55.method1180(arg4 + 58)) {
                                    var55.method1176(arg7, false);
                                }
                                var54 = var55;
                            }
                            class484.method2817(arg8, arg10, arg3, var54, (class126) null);
                        } else if (arg9 == 8) {
                            int var56 = 3 & arg1 + 2;
                            int var57 = 33;
                            class614 var58 = (class614) class149.method1061(arg8, arg10, arg3);
                            if (var58 != null) {
                                var57 = class101.field1572.method2617((byte) -120, var58.method1179(true)).field7803 / 2 + 1;
                            }
                            class126 var61;
                            class126 var62;
                            if (!var24) {
                                class594 var59 = new class594(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, class657.field9216[arg1] * var57, class612.field8571[arg1] * var57, arg9, arg1 - -4, arg6);
                                class594 var60 = new class594(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, 0, 0, arg9, var56 + 4, arg6);
                                var61 = var59;
                                var62 = var60;
                            } else {
                                class485 var63 = new class485(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, class657.field9216[arg1] * var57, class612.field8571[arg1] * var57, arg9, arg1 + 4);
                                class485 var64 = new class485(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, 0, 0, arg9, var56 + 4);
                                if (var63.method1180(122)) {
                                    var63.method1176(arg7, false);
                                }
                                var61 = var63;
                                var62 = var64;
                                if (var64.method1180(109)) {
                                    var64.method1176(arg7, false);
                                }
                            }
                            class484.method2817(arg8, arg10, arg3, var61, var62);
                        }
                    } else {
                        class622 var65 = null;
                        class454 var66;
                        int var67;
                        if (!var24) {
                            var66 = new class172(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, arg10, arg10 - (-var14 + 1), arg3, arg3 + var13 + -1, arg9, arg1, arg6);
                            var67 = 15;
                        } else {
                            class622 var68 = new class622(arg7, var12, arg8, arg2, var21, var20, var22, super.field4760, arg10, arg10 + var14 + -1, arg3, arg3 - 1 + var13, arg9, arg1, var23);
                            var65 = var68;
                            var67 = var68.method3454(0);
                            var66 = var68;
                        }
                        if (class598.method3381(var66, false)) {
                            if (var65 != null && var65.method1180(117)) {
                                var65.method1176(arg7, false);
                            }
                            if (var12.field7787 && class699.field9885) {
                                if (var67 > 30) {
                                    var67 = 30;
                                }
                                for (int var69 = 0; ~var69 >= ~var14; ++var69) {
                                    for (int var70 = 0; var13 >= var70; ++var70) {
                                        var19.method440(arg10 + var69, arg3 + var70, var67);
                                    }
                                }
                            }
                        }
                        if (~var12.field7806 != -1 && arg0 != null) {
                            arg0.method3747(!var12.field7795, var12.field7773, arg10, var13, arg3, (byte) 53, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lr;ZI)V")
    public final void method616(class166 arg0, boolean arg1, int arg2) {
        class405.method2457();
        if (arg2 <= -121) {
            ++field1086;
            if (!arg1) {
                if (super.field4779 > 1) {
                    for (int var4 = 0; super.field4763 > var4; ++var4) {
                        for (int var5 = 0; super.field4785 > var5; ++var5) {
                            if (~(class672.field9500[1][var4][var5] & 2) == -3) {
                                class640.method3568(var4, var5);
                            }
                        }
                    }
                }
                for (int var6 = 0; ~var6 > ~super.field4779; ++var6) {
                    for (int var7 = 0; ~var7 >= ~super.field4785; ++var7) {
                        for (int var8 = 0; var8 <= super.field4763; ++var8) {
                            if (~(4 & super.field4774[var6][var8][var7]) != -1) {
                                int var9 = var8;
                                int var10 = var8;
                                int var11 = var7;
                                int var12 = var7;
                                while (~var11 < -1 && (4 & super.field4774[var6][var8][var11 + -1]) != 0) {
                                    --var11;
                                }
                                while (~var12 > ~super.field4785 && (super.field4774[var6][var8][var12 + 1] & 4) != 0) {
                                    ++var12;
                                }
                                label107: while (~var9 < -1) {
                                    for (int var13 = var11; ~var13 >= ~var12; ++var13) {
                                        if (~(super.field4774[var6][var9 + -1][var13] & 4) == -1) {
                                            break label107;
                                        }
                                    }
                                    --var9;
                                }
                                label96: while (~var10 > ~super.field4763) {
                                    for (int var14 = var11; var14 <= var12; ++var14) {
                                        if (~(super.field4774[var6][var10 + 1][var14] & 4) == -1) {
                                            break label96;
                                        }
                                    }
                                    ++var10;
                                }
                                if ((-var9 + var10 - -1) * (-var11 + 1 + var12) >= 4) {
                                    int var15 = super.field4765[var6][var9][var11];
                                    class325.method2045(var6, 4, (var10 << 9) + 512, var15, (var12 << 9) + 512, -1, var9 << 9, var11 << 9, var15);
                                    for (int var16 = var9; var10 >= var16; ++var16) {
                                        for (int var17 = var11; ~var12 <= ~var17; ++var17) {
                                            super.field4774[var6][var16][var17] = (byte) class689.method3797(super.field4774[var6][var16][var17], -5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class248.method1670((byte) 118);
            }
            super.field4774 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method617(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
