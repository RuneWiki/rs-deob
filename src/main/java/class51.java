import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class51 extends class288 {

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    private int field717 = 6;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
    public static int field711 = 1;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "Z")
    public static boolean field712 = false;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "[I")
    public static int[] field721 = new int[2048];

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "[I")
    public static int[] field718 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    public static int field719 = 0;

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "Ljava/lang/String;")
    public static String field723 = "Close";

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ[BIIIIIII[Lpi;)[I")
    public static final int[] method399(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class281[] arg10) {
        ++field724;
        if (!arg1) {
            for (int var11 = 0; var11 < 8; ++var11) {
                for (int var12 = 0; var12 < 8; ++var12) {
                    int var13 = arg4 + class153.method1033(arg3, -1, var11 & 7, 7 & var12);
                    int var14 = class197.method1328(7 & var12, var11 & 7, arg3, 64) + arg7;
                    if (~var13 < -1 && ~var13 > -104 && ~var14 < -1 && var14 < 103) {
                        arg10[arg9].field4497[var13][var14] = class204.method1369(arg10[arg9].field4497[var13][var14], -2097153);
                    }
                }
            }
        }
        byte var15;
        if (!arg1) {
            var15 = 4;
        } else {
            var15 = 1;
        }
        int var16 = (arg8 & 7) * 8;
        int var17 = (7 & arg5) * 8;
        class264 var18 = new class264(arg2);
        int var19 = (-8 & arg5) << 3;
        int var20 = (-8 & arg8) << 3;
        byte var21 = 0;
        byte var22 = 0;
        if (arg6 >= -60) {
            field718 = null;
        }
        if (arg3 == 1) {
            var21 = 1;
        } else if (arg3 == 2) {
            var21 = 1;
            var22 = 1;
        } else if (~arg3 == -4) {
            var22 = 1;
        }
        for (int var23 = 0; ~var23 > ~var15; ++var23) {
            for (int var44 = 0; ~var44 > -65; ++var44) {
                for (int var45 = 0; var45 < 64; ++var45) {
                    if (~arg0 == ~var23 && var44 >= var17 && ~(var17 + 8) <= ~var44 && ~var16 >= ~var45 && ~var45 >= ~(var16 + 8)) {
                        if (var17 - -8 != var44 && var16 + 8 != var45) {
                            int var46 = arg4 - -class153.method1033(arg3, -1, var44 & 7, var45 & 7);
                            int var47 = arg7 + class197.method1328(var45 & 7, 7 & var44, arg3, 64);
                            class25.method178(var46, (byte) 72, var47, arg9, arg3, arg1, var19 + var44, false, var20 + var45, var18, var22, var21);
                            if (var44 == 63 || var45 == 63) {
                                int var48 = var44 == 63 ? 64 : var44;
                                int var49 = ~var45 == -64 ? 64 : var45;
                                int var50;
                                int var51;
                                if (~arg3 == -1) {
                                    var50 = var49 - var16 + arg7;
                                    var51 = arg4 - (-var48 + var17);
                                } else if (~arg3 == -2) {
                                    var50 = -var48 - -var17 + arg7 + 8;
                                    var51 = arg4 + var49 + -var16;
                                } else if (arg3 == 2) {
                                    var51 = arg4 - -8 + (var17 - var48);
                                    var50 = -var49 + var16 + arg7 + 8;
                                } else {
                                    var50 = -var17 + var48 + arg7;
                                    var51 = 8 - -var16 - var49 + arg4;
                                }
                                if (var51 >= 0 && ~var51 > -105 && var50 >= 0 && var50 < 104) {
                                    class229.field3641[arg9][var51][var50] = class229.field3641[arg9][var22 + var46][var47 - -var21];
                                }
                            }
                        } else {
                            int var52;
                            int var53;
                            if (arg3 != 0) {
                                if (arg3 != 1) {
                                    if (~arg3 != -3) {
                                        var52 = -var17 + var44 + arg7;
                                        var53 = -var45 + arg4 + 8 + var16;
                                    } else {
                                        var53 = arg4 - -var17 - var44 + 8;
                                        var52 = arg7 + var16 + -var45 + 8;
                                    }
                                } else {
                                    var53 = -var16 + var45 + arg4;
                                    var52 = var17 + 8 + -var44 + arg7;
                                }
                            } else {
                                var53 = arg4 - (-var44 + var17);
                                var52 = -var16 + arg7 + var45;
                            }
                            class25.method178(var53, (byte) -125, var52, arg9, 0, arg1, var19 - -var44, true, var20 + var45, var18, 0, 0);
                        }
                    } else {
                        class25.method178(-1, (byte) 27, -1, 0, 0, arg1, 0, false, 0, var18, 0, 0);
                    }
                }
            }
        }
        boolean var24 = false;
        boolean var25 = false;
        while (~var18.field4198.length < ~var18.field4195) {
            int var26 = var18.method1779(-62);
            if (~var26 == -129) {
                class168.field2733[0] = var18.method1777(-120);
                class168.field2733[1] = var18.method1756(-112);
                var24 = true;
                class168.field2733[2] = var18.method1756(-93);
                class168.field2733[3] = var18.method1756(-104);
                class168.field2733[4] = var18.method1777(-54);
            } else {
                if (var26 != 129) {
                    --var18.field4195;
                    break;
                }
                for (int var27 = 0; var27 < 4; ++var27) {
                    byte var28 = var18.method1767(16711680);
                    if (var28 != 0) {
                        if (~var28 == -2) {
                            for (int var29 = 0; var29 < 64; var29 += 4) {
                                for (int var30 = 0; var30 < 64; var30 += 4) {
                                    byte var31 = var18.method1767(16711680);
                                    if (arg0 >= var27) {
                                        for (int var32 = var29; ~var32 > ~(var29 + 4); ++var32) {
                                            for (int var33 = var30; ~var33 > ~(var30 + 4); ++var33) {
                                                if (var32 >= var17 && ~(var17 + 8) < ~var32 && var33 >= var16 && ~(var16 + 8) < ~var16) {
                                                    int var34 = class153.method1033(arg3, -1, 7 & var32, var33 & 7) + arg4;
                                                    int var35 = class197.method1328(var33 & 7, 7 & var32, arg3, 64) + arg7;
                                                    if (var34 >= 0 && ~var34 > -105 && var35 >= 0 && var35 < 104) {
                                                        class79.field1091[arg9][var34][var35] = var31;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (arg0 >= var27) {
                        int var36 = arg4;
                        int var37 = arg4 + 7;
                        if (~arg4 > -1) {
                            var36 = 0;
                        } else if (~arg4 <= -105) {
                            var36 = 104;
                        }
                        int var38 = arg7;
                        int var39 = arg7 - -7;
                        if (~var39 <= -1) {
                            if (var39 >= 104) {
                                var39 = 104;
                            }
                        } else {
                            var39 = 0;
                        }
                        if (arg7 >= 0) {
                            if (arg7 >= 104) {
                                var38 = 104;
                            }
                        } else {
                            var38 = 0;
                        }
                        if (~var37 > -1) {
                            var37 = 0;
                        } else if (var37 >= 104) {
                            var37 = 104;
                        }
                        while (~var37 < ~var36) {
                            while (~var38 > ~var39) {
                                class79.field1091[arg9][var36][var38] = 0;
                                ++var38;
                            }
                            ++var36;
                        }
                    }
                }
            }
        }
        if (!var25) {
            int var40 = arg4 + 7;
            int var41 = arg7 + 7;
            for (int var42 = arg4; var40 > var42; ++var42) {
                for (int var43 = arg7; ~var41 < ~var43; ++var43) {
                    class79.field1091[arg9][var42][var43] = 0;
                }
            }
        }
        if (var24) {
            return class168.field2733;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BB)V")
    public static final void method400(byte arg0, byte arg1) {
        ++field716;
        if (class243.field3894 == null) {
            class243.field3894 = new byte[4][104][104];
        }
        if (arg1 >= -29) {
            method400((byte) -91, (byte) 15);
        }
        for (int var2 = 0; var2 < 4; ++var2) {
            for (int var3 = 0; ~var3 > -105; ++var3) {
                for (int var4 = 0; ~var4 > -105; ++var4) {
                    class243.field3894[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)[[I")
    public final int[][] method34(int arg0, int arg1) {
        if (arg0 != 1) {
            field711 = -41;
        }
        ++field720;
        int[][] var3 = super.field4598.method812(arg1, 65535);
        if (super.field4598.field1954) {
            int[][] var4 = this.method1930(0, arg1, (byte) -121);
            int[][] var5 = this.method1930(1, arg1, (byte) 17);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var4[2];
            int[] var12 = var5[1];
            int[] var13 = var5[0];
            int[] var14 = var5[2];
            int var15 = this.field717;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~var16 > ~class186.field2986; ++var16) {
                                                                int var17 = var14[var16];
                                                                int var18 = var9[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var12[var16];
                                                                int var21 = var11[var16];
                                                                int var22 = var10[var16];
                                                                var6[var16] = var19 + var22 + -(var19 * var22 >> 11);
                                                                var7[var16] = -(var18 * var20 >> 11) + var18 + var20;
                                                                var8[var16] = var17 + var21 + -(var17 * var21 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class186.field2986 > var23; ++var23) {
                                                            int var24 = var10[var23];
                                                            int var25 = var9[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var13[var23];
                                                            int var28 = var12[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = var24 <= var27 ? -var24 + var27 : -var27 + var24;
                                                            var7[var23] = var25 > var28 ? -var28 + var25 : var28 - var25;
                                                            var8[var23] = ~var29 > ~var26 ? var26 - var29 : -var26 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class186.field2986 > var30; ++var30) {
                                                        int var31 = var12[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var10[var30];
                                                        int var34 = var9[var30];
                                                        int var35 = var13[var30];
                                                        int var36 = var14[var30];
                                                        var6[var30] = var33 > var35 ? var33 : var35;
                                                        var7[var30] = var31 >= var34 ? var31 : var34;
                                                        var8[var30] = var36 >= var32 ? var36 : var32;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class186.field2986; ++var37) {
                                                    int var38 = var13[var37];
                                                    int var39 = var10[var37];
                                                    int var40 = var14[var37];
                                                    int var41 = var12[var37];
                                                    int var42 = var11[var37];
                                                    int var43 = var9[var37];
                                                    var6[var37] = ~var38 >= ~var39 ? var38 : var39;
                                                    var7[var37] = ~var43 <= ~var41 ? var41 : var43;
                                                    var8[var37] = var40 > var42 ? var42 : var40;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class186.field2986; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var10[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = ~var46 != -1 ? -((-var13[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                var7[var44] = var45 == 0 ? 0 : -((-var12[var44] + 4096 << 12) / var45) + 4096;
                                                var8[var44] = ~var47 != -1 ? -((4096 - var14[var44] << 12) / var47) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class186.field2986 < ~var48; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var11[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = var49 == 4096 ? 4096 : (var13[var48] << 12) / (-var49 + 4096);
                                            var7[var48] = ~var51 != -4097 ? (var12[var48] << 12) / (-var51 + 4096) : 4096;
                                            var8[var48] = ~var50 != -4097 ? (var14[var48] << 12) / (-var50 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class186.field2986 > var52; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var12[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = ~var53 <= -2049 ? -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var10[var52] * var53 >> 11;
                                        var7[var52] = ~var54 <= -2049 ? -((-var9[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var9[var52] * var54 >> 11;
                                        var8[var52] = var55 < 2048 ? var11[var52] * var55 >> 11 : -((-var11[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class186.field2986; ++var56) {
                                    var6[var56] = -((4096 - var13[var56]) * (-var10[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var14[var56]) * (-var11[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class186.field2986; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var12[var57];
                                int var60 = var13[var57];
                                var6[var57] = var60 != 0 ? (var10[var57] << 12) / var60 : 4096;
                                var7[var57] = ~var59 == -1 ? 4096 : (var9[var57] << 12) / var59;
                                var8[var57] = var58 != 0 ? (var11[var57] << 12) / var58 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class186.field2986; ++var61) {
                            var6[var61] = var10[var61] * var13[var61] >> 12;
                            var7[var61] = var9[var61] * var12[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class186.field2986 < ~var62; ++var62) {
                        var6[var62] = var10[var62] + -var13[var62];
                        var7[var62] = var9[var62] - var12[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; class186.field2986 > var63; ++var63) {
                    var6[var63] = var10[var63] + var13[var63];
                    var7[var63] = var9[var63] - -var12[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V")
    public static void method401(int arg0) {
        field721 = null;
        field723 = null;
        int var1 = 98 / ((-56 - arg0) / 52);
        field718 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/StringBuffer;ICI)Ljava/lang/StringBuffer;")
    public static final StringBuffer method402(StringBuffer arg0, int arg1, char arg2, int arg3) {
        ++field722;
        int var4 = arg0.length();
        arg0.setLength(arg3);
        if (arg1 != -9) {
            return null;
        } else {
            for (int var5 = var4; ~arg3 < ~var5; ++var5) {
                arg0.setCharAt(var5, arg2);
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        ++field713;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field4612 = ~arg0.method1779(arg1 + -88) == -2;
            }
        } else {
            this.field717 = arg0.method1779(arg1 + -35);
        }
        if (arg1 != -19) {
            this.method34(-21, 22);
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class51() {
        super(2, false);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field714;
            int[] var3 = super.field4609.method579((byte) -62, arg1);
            if (super.field4609.field1059) {
                int[] var4 = this.method1931((byte) -124, 0, arg1);
                int[] var5 = this.method1931((byte) -122, 1, arg1);
                int var6 = this.field717;
                if (var6 != 1) {
                    if (var6 != 2) {
                        if (~var6 != -4) {
                            if (~var6 != -5) {
                                if (~var6 != -6) {
                                    if (var6 != 6) {
                                        if (~var6 != -8) {
                                            if (~var6 != -9) {
                                                if (var6 != 9) {
                                                    if (~var6 != -11) {
                                                        if (~var6 != -12) {
                                                            if (var6 == 12) {
                                                                for (int var7 = 0; ~class186.field2986 < ~var7; ++var7) {
                                                                    int var8 = var5[var7];
                                                                    int var9 = var4[var7];
                                                                    var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; ~var10 > ~class186.field2986; ++var10) {
                                                                int var11 = var4[var10];
                                                                int var12 = var5[var10];
                                                                var3[var10] = var12 >= var11 ? -var11 + var12 : -var12 + var11;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; ~var13 > ~class186.field2986; ++var13) {
                                                            int var14 = var5[var13];
                                                            int var15 = var4[var13];
                                                            var3[var13] = ~var15 < ~var14 ? var15 : var14;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; class186.field2986 > var16; ++var16) {
                                                        int var17 = var4[var16];
                                                        int var18 = var5[var16];
                                                        var3[var16] = var18 > var17 ? var17 : var18;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; class186.field2986 > var19; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = var20 == 0 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < class186.field2986; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (4096 - var22);
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; ~var23 > ~class186.field2986; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = ~var24 <= -2049 ? -((4096 - var24) * (-var4[var23] + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; var25 < class186.field2986; ++var25) {
                                        var3[var25] = -((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class186.field2986; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                                }
                            }
                        } else {
                            for (int var28 = 0; ~class186.field2986 < ~var28; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; var29 < class186.field2986; ++var29) {
                            var3[var29] = var4[var29] + -var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; ~var30 > ~class186.field2986; ++var30) {
                        var3[var30] = var4[var30] - -var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(Z)V")
    public static final void method403(boolean arg0) {
        ++field715;
        if (class170.field2750 != null) {
            class106 var1 = class170.field2750;
            synchronized (class170.field2750) {
                class170.field2750 = null;
            }
        }
        if (arg0) {
            field711 = -109;
        }
    }
}
