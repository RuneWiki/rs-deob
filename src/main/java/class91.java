import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class91 extends class53 {

    @OriginalMember(owner = "client!ue", name = "Db", descriptor = "[Z")
    public static boolean[] field1452 = new boolean[100];

    @OriginalMember(owner = "client!ue", name = "Jb", descriptor = "S")
    public static short field1458 = 320;

    @OriginalMember(owner = "client!ue", name = "Tb", descriptor = "[Z")
    public static boolean[] field1468 = new boolean[100];

    @OriginalMember(owner = "client!ue", name = "Eb", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ue", name = "Fb", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!ue", name = "Gb", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!ue", name = "Hb", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!ue", name = "Ib", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!ue", name = "Kb", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!ue", name = "Lb", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!ue", name = "Nb", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ue", name = "Ob", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!ue", name = "Pb", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ue", name = "Qb", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client!ue", name = "Sb", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!ue", name = "Ub", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ue", name = "Wb", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ue", name = "Mb", descriptor = "Lp;")
    private class84 field1461;

    @OriginalMember(owner = "client!ue", name = "Rb", descriptor = "Lclient;")
    public static client field1466;

    @OriginalMember(owner = "client!ue", name = "Vb", descriptor = "[Ljava/lang/String;")
    public static String[] field1470;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)J")
    public static final long method678(int arg0, int arg1, int arg2) {
        class313 var3 = class223.field3286[arg0][arg1][arg2];
        return var3 != null && var3.field5027 != null ? var3.field5027.field3151 : 0L;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(Z)V")
    public static void method679(boolean arg0) {
        field1468 = null;
        field1470 = null;
        field1452 = null;
        if (!arg0) {
            field1458 = 73;
        }
        field1466 = null;
    }

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "(I)V")
    public final void method680(int arg0) {
        this.field1465 = super.field735 * arg0;
        ++field1456;
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(Z)I")
    public final int method681(boolean arg0) {
        ++field1467;
        if (!arg0) {
            field1466 = null;
        }
        return super.field758[super.field735++] + -this.field1461.method623(-1515058839) & 255;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B[I)V")
    public final void method682(byte arg0, int[] arg1) {
        int var3 = -88 / ((-15 - arg0) / 55);
        this.field1461 = new class84(arg1);
        ++field1460;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)V")
    public final void method683(boolean arg0, int arg1) {
        ++field1462;
        super.field758[super.field735++] = (byte) (this.field1461.method623(-1515058839) + arg1);
        if (!arg0) {
            field1458 = -101;
        }
    }

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "(II)I")
    public final int method684(int arg0, int arg1) {
        if (arg0 != 8) {
            this.method686(-10);
        }
        ++field1454;
        return arg1 * 8 + -this.field1465;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZIIII[BI[Lii;)[I")
    public static final int[] method685(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9, class228[] arg10) {
        ++field1469;
        int var11 = (arg5 & 7) * 8;
        byte var12;
        if (arg3) {
            var12 = 1;
        } else {
            var12 = 4;
        }
        if (!arg3) {
            for (int var13 = 0; ~var13 > -9; ++var13) {
                for (int var14 = 0; ~var14 > -9; ++var14) {
                    int var15 = arg2 - -class52.method317(arg7, var14 & 7, var13 & 7, (byte) 110);
                    int var16 = arg0 + class114.method857(7 & var14, arg7, 7 & var13, 7);
                    if (~var15 < -1 && var15 < 103 && var16 > 0 && ~var16 > -104) {
                        arg10[arg4].field3351[var15][var16] = class301.method2056(arg10[arg4].field3351[var15][var16], -2097153);
                    }
                }
            }
        }
        int var17 = (7 & arg1) * arg9;
        int var18 = (arg5 & -8) << 3;
        int var19 = arg1 << 3 & -64;
        class53 var20 = new class53(arg8);
        byte var21 = 0;
        byte var22 = 0;
        if (arg7 == 1) {
            var22 = 1;
        } else if (arg7 != 2) {
            if (~arg7 == -4) {
                var21 = 1;
            }
        } else {
            var22 = 1;
            var21 = 1;
        }
        for (int var23 = 0; var12 > var23; ++var23) {
            for (int var44 = 0; ~var44 > -65; ++var44) {
                for (int var45 = 0; var45 < 64; ++var45) {
                    if (arg6 == var23 && ~var11 >= ~var44 && ~var44 >= ~(var11 + 8) && var45 >= var17 && ~(var17 + 8) <= ~var45) {
                        if (~(var11 + 8) != ~var44 && ~(var17 + 8) != ~var45) {
                            int var46 = class52.method317(arg7, var45 & 7, 7 & var44, (byte) 110) + arg2;
                            int var47 = class114.method857(7 & var45, arg7, var44 & 7, 7) + arg0;
                            class277.method1922((byte) 105, var46, var19 + var45, var21, arg4, var47, arg3, var22, var18 + var44, arg7, var20, false);
                            if (var44 == 63 || ~var45 == -64) {
                                int var48 = var45 != 63 ? var45 : 64;
                                int var49 = var44 != 63 ? var44 : 64;
                                int var50;
                                int var51;
                                if (arg7 != 0) {
                                    if (arg7 == 1) {
                                        var50 = arg2 - (-var48 + var17);
                                        var51 = 8 - var49 + arg0 + var11;
                                    } else if (arg7 != 2) {
                                        var50 = arg2 + 8 - var48 - -var17;
                                        var51 = -var11 + arg0 + var49;
                                    } else {
                                        var51 = -var48 - (-var17 - (arg0 - -8));
                                        var50 = -var49 - (-var11 - (arg2 + 8));
                                    }
                                } else {
                                    var51 = arg0 + var48 + -var17;
                                    var50 = arg2 - (-var49 - -var11);
                                }
                                if (~var50 <= -1 && ~var50 > -105 && var51 >= 0 && ~var51 > -105) {
                                    class103.field1792[arg4][var50][var51] = class103.field1792[arg4][var46 - -var21][var47 - -var22];
                                }
                            }
                        } else {
                            int var52;
                            int var53;
                            if (~arg7 != -1) {
                                if (arg7 != 1) {
                                    if (arg7 != 2) {
                                        var52 = -var11 + arg0 + var44;
                                        var53 = arg2 - -var17 - var45 + 8;
                                    } else {
                                        var53 = arg2 + 8 - (-var11 + var44);
                                        var52 = -var45 + var17 + arg0 + 8;
                                    }
                                } else {
                                    var52 = arg0 - -8 + (var11 - var44);
                                    var53 = arg2 - (-var45 + var17);
                                }
                            } else {
                                var53 = var44 - var11 + arg2;
                                var52 = arg0 - (-var45 + var17);
                            }
                            class277.method1922((byte) 105, var53, var19 + var45, 0, arg4, var52, arg3, 0, var18 + var44, 0, var20, true);
                        }
                    } else {
                        class277.method1922((byte) 105, -1, 0, 0, 0, -1, arg3, 0, 0, 0, var20, false);
                    }
                }
            }
        }
        boolean var24 = false;
        boolean var25 = false;
        while (var20.field735 < var20.field758.length) {
            int var26 = var20.method366(-16505);
            if (~var26 == -129) {
                class123.field2042[0] = var20.method331(-4);
                class123.field2042[1] = var20.method337(92);
                var24 = true;
                class123.field2042[2] = var20.method337(arg9 + 102);
                class123.field2042[3] = var20.method337(117);
                class123.field2042[4] = var20.method331(-104);
            } else {
                if (var26 != 129) {
                    --var20.field735;
                    break;
                }
                for (int var27 = 0; ~var27 > -5; ++var27) {
                    byte var28 = var20.method335((byte) 26);
                    if (var28 == 0) {
                        if (~arg6 <= ~var27) {
                            int var29 = arg2;
                            if (arg2 >= 0) {
                                if (~arg2 <= -105) {
                                    var29 = 104;
                                }
                            } else {
                                var29 = 0;
                            }
                            int var30 = arg0;
                            int var31 = arg2 + 7;
                            if (var31 < 0) {
                                var31 = 0;
                            } else if (~var31 <= -105) {
                                var31 = 104;
                            }
                            if (arg0 >= 0) {
                                if (~arg0 <= -105) {
                                    var30 = 104;
                                }
                            } else {
                                var30 = 0;
                            }
                            int var32 = arg0 + 7;
                            if (var32 >= 0) {
                                if (var32 >= 104) {
                                    var32 = 104;
                                }
                            } else {
                                var32 = 0;
                            }
                            while (~var31 < ~var29) {
                                while (~var30 > ~var32) {
                                    class26.field286[arg4][var29][var30] = 0;
                                    ++var30;
                                }
                                ++var29;
                            }
                        }
                    } else if (var28 == 1) {
                        for (int var33 = 0; var33 < 64; var33 += 4) {
                            for (int var34 = 0; ~var34 > -65; var34 += 4) {
                                byte var35 = var20.method335((byte) 26);
                                if (var27 <= arg6) {
                                    for (int var36 = var33; ~(var33 + 4) < ~var36; ++var36) {
                                        for (int var37 = var34; var37 < var34 + 4; ++var37) {
                                            if (~var11 >= ~var36 && var36 < var11 + 8 && ~var17 >= ~var37 && var17 - -8 > var17) {
                                                int var38 = arg2 - -class52.method317(arg7, var37 & 7, var36 & 7, (byte) 110);
                                                int var39 = class114.method857(var37 & 7, arg7, 7 & var36, 7) + arg0;
                                                if (~var38 <= -1 && var38 < 104 && ~var39 <= -1 && var39 < 104) {
                                                    class26.field286[arg4][var38][var39] = var35;
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
        if (!var25) {
            int var40 = arg2 + 7;
            int var41 = arg0 + 7;
            for (int var42 = arg2; ~var40 < ~var42; ++var42) {
                for (int var43 = arg0; var41 > var43; ++var43) {
                    class26.field286[arg4][var42][var43] = 0;
                }
            }
        }
        if (var24) {
            return class123.field2042;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "(I)V")
    public final void method686(int arg0) {
        if (arg0 != 0) {
            this.method682((byte) -123, (int[]) null);
        }
        ++field1463;
        super.field735 = (this.field1465 + 7) / 8;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(I)V")
    public class91(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(IB)V")
    public static final void method687(int arg0, byte arg1) {
        if (arg1 != -128) {
            field1459 = 76;
        }
        ++field1464;
        if (class309.method2092(91923, arg0)) {
            class263[] var2 = class134.field2195[arg0];
            for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                class263 var4 = var2[var3];
                if (var4 != null) {
                    var4.field4130 = 0;
                    var4.field4156 = 1;
                    var4.field4076 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(BI)I")
    public final int method688(byte arg0, int arg1) {
        ++field1453;
        int var3 = this.field1465 >> 3;
        int var4 = 0;
        int var5 = -(this.field1465 & 7) + 8;
        this.field1465 += arg1;
        while (arg1 > var5) {
            var4 += (super.field758[var3++] & class133.field2179[var5]) << -var5 + arg1;
            arg1 -= var5;
            var5 = 8;
        }
        int var6;
        if (~arg1 != ~var5) {
            var6 = (super.field758[var3] >> -arg1 + var5 & class133.field2179[arg1]) + var4;
        } else {
            var6 = (super.field758[var3] & class133.field2179[var5]) + var4;
        }
        int var7 = 78 % ((arg0 - -61) / 41);
        return var6;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([BIIB)V")
    public final void method689(byte[] arg0, int arg1, int arg2, byte arg3) {
        for (int var5 = 0; ~arg2 < ~var5; ++var5) {
            arg0[arg1 + var5] = (byte) (super.field758[super.field735++] + -this.field1461.method623(-1515058839));
        }
        if (arg3 > -47) {
            method687(-80, (byte) 35);
        }
        ++field1471;
    }
}
