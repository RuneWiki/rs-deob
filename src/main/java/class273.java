import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class273 extends class264 {

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "I")
    public static int field4854 = 0;

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "I")
    public static int field4859 = -1;

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "[I")
    public static int[] field4866 = new int[25];

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "Lcf;")
    public static class93 field4864 = class147.method1066("Lade)3)3)3", -48);

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(B)I")
    public static final int method1808(byte arg0) {
        int var1 = 104 / ((arg0 - 13) / 53);
        ++field4863;
        return client.field2739;
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)V")
    public static void method1809(int arg0) {
        if (arg0 != 6820) {
            field4864 = null;
        }
        field4866 = null;
        field4864 = null;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
    public class273() {
        super(3, false);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)V")
    public static final void method1810(int arg0, int arg1) {
        ++field4860;
        if (arg1 != -28940) {
            field4854 = 22;
        }
        if (!class42.field667) {
            arg0 = -1;
        }
        if (~class51.field844 != ~arg0) {
            if (arg0 != -1) {
                class139 var2 = class196.method1408(33, arg0);
                class158 var3 = var2.method1011((byte) -113);
                if (var3 != null) {
                    class169.field2967.method1962(class190.field3481, var3.field2129, var3.field2130, 5292, var3.method1134(), new Point(var2.field2423, var2.field2413));
                    class51.field844 = arg0;
                } else {
                    arg0 = -1;
                }
            }
            if (arg0 == -1 && class51.field844 != -1) {
                class169.field2967.method1962(class190.field3481, -1, -1, arg1 + 34232, (int[]) null, new Point());
                class51.field844 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (arg0 > 11) {
            ++field4865;
            if (~arg1 == -1) {
                super.field4698 = arg2.method1907(16832) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I[Lvf;[BZBIII)V")
    public static final void method1811(int arg0, class102[] arg1, byte[] arg2, boolean arg3, byte arg4, int arg5, int arg6, int arg7) {
        byte var8;
        if (!arg3) {
            var8 = 4;
        } else {
            var8 = 1;
        }
        ++field4861;
        if (!arg3) {
            for (int var9 = 0; var9 < 4; ++var9) {
                for (int var10 = 0; var10 < 64; ++var10) {
                    for (int var11 = 0; var11 < 64; ++var11) {
                        if (arg5 + var10 > 0 && ~(arg5 + var10) > -104 && ~(arg6 + var11) < -1 && arg6 + var11 < 103) {
                            arg1[var9].field1769[arg5 + var10][arg6 + var11] = class58.method333(arg1[var9].field1769[arg5 + var10][arg6 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class280 var12 = new class280(arg2);
        for (int var13 = 0; ~var13 > ~var8; ++var13) {
            for (int var36 = 0; var36 < 64; ++var36) {
                for (int var37 = 0; ~var37 > -65; ++var37) {
                    class264.method1772(0, arg3, arg6 + var37, 104, arg0, var12, arg7, arg5 + var36, var13);
                }
            }
        }
        boolean var14 = false;
        while (~var12.field5027 > ~var12.field5011.length) {
            int var15 = var12.method1907(16832);
            if (var15 != 129) {
                --var12.field5027;
                break;
            }
            for (int var16 = 0; ~var16 > -5; ++var16) {
                byte var17 = var12.method1925(true);
                if (~var17 == -1) {
                    int var18 = arg5;
                    if (~arg5 > -1) {
                        var18 = 0;
                    } else if (~arg5 <= -105) {
                        var18 = 104;
                    }
                    int var19 = arg5 + 64;
                    if (~var19 <= -1) {
                        if (~var19 <= -105) {
                            var19 = 104;
                        }
                    } else {
                        var19 = 0;
                    }
                    int var20 = arg6;
                    if (arg6 < 0) {
                        var20 = 0;
                    } else if (~arg6 <= -105) {
                        var20 = 104;
                    }
                    int var21 = arg6 + 64;
                    if (~var21 <= -1) {
                        if (var21 >= 104) {
                            var21 = 104;
                        }
                    } else {
                        var21 = 0;
                    }
                    while (var19 > var18) {
                        while (~var21 < ~var20) {
                            class134.field2350[var16][var18][var20] = 0;
                            ++var20;
                        }
                        ++var18;
                    }
                } else if (var17 != 1) {
                    if (~var17 == -3 && var16 > 0) {
                        int var22 = arg5;
                        int var23 = arg5 + 64;
                        if (~var23 > -1) {
                            var23 = 0;
                        } else if (~var23 <= -105) {
                            var23 = 104;
                        }
                        if (~arg5 > -1) {
                            var22 = 0;
                        } else if (~arg5 <= -105) {
                            var22 = 104;
                        }
                        int var24 = arg6;
                        int var25 = arg6 + 64;
                        if (var25 < 0) {
                            var25 = 0;
                        } else if (var25 >= 104) {
                            var25 = 104;
                        }
                        if (~arg6 <= -1) {
                            if (~arg6 <= -105) {
                                var24 = 104;
                            }
                        } else {
                            var24 = 0;
                        }
                        while (~var22 > ~var23) {
                            while (var25 > var24) {
                                class134.field2350[var16][var22][var24] = class134.field2350[var16 + -1][var22][var24];
                                ++var24;
                            }
                            ++var22;
                        }
                    }
                } else {
                    for (int var26 = 0; ~var26 > -65; var26 += 4) {
                        for (int var27 = 0; ~var27 > -65; var27 += 4) {
                            byte var28 = var12.method1925(true);
                            for (int var29 = arg5 + var26; ~(arg5 + var26 + 4) < ~var29; ++var29) {
                                for (int var30 = arg6 + var27; ~var30 > ~(var27 + 4 + arg6); ++var30) {
                                    if (~var29 <= -1 && ~var29 > -105 && var30 >= 0 && ~var30 > -105) {
                                        class134.field2350[var16][var29][var30] = var28;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var14 = true;
        }
        if (!var14) {
            for (int var31 = 0; ~var31 > -5; ++var31) {
                for (int var32 = 0; var32 < 16; ++var32) {
                    for (int var33 = 0; var33 < 16; ++var33) {
                        int var34 = (arg6 >> 2) + var33;
                        int var35 = (arg5 >> 2) + var32;
                        if (var35 >= 0 && ~var35 > -27 && ~var34 <= -1 && var34 < 26) {
                            class134.field2350[var31][var35][var34] = 0;
                        }
                    }
                }
            }
        }
        if (arg4 != 111) {
            method1812((byte) 107);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method17(int arg0, boolean arg1) {
        ++field4855;
        int[][] var3 = super.field4705.method1089(arg0, 56);
        if (arg1) {
            method1809(-97);
        }
        if (super.field4705.field2670) {
            int[] var4 = this.method1767(2, arg0, 21654);
            int[][] var5 = this.method1773(-119, 0, arg0);
            int[][] var6 = this.method1773(-128, 1, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[2];
            int[] var11 = var5[0];
            int[] var12 = var5[1];
            int[] var13 = var6[0];
            int[] var14 = var6[2];
            int[] var15 = var6[1];
            for (int var16 = 0; class176.field3060 > var16; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var11[var16];
                    var8[var16] = var12[var16];
                    var9[var16] = var10[var16];
                } else if (~var17 != -1) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var11[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    var9[var16] = var10[var16] * var17 + var14[var16] * var18 >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var15[var16];
                    var9[var16] = var14[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(B)Lli;")
    public static final class288 method1812(byte arg0) {
        if (arg0 != -126) {
            field4866 = null;
        }
        ++field4858;
        return class31.field483 < class86.field1559.length ? class86.field1559[class31.field483++] : null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        if (arg1 > -83) {
            field4857 = 49;
        }
        ++field4856;
        int[] var3 = super.field4716.method532((byte) 70, arg0);
        if (super.field4716.field1424) {
            int[] var4 = this.method1767(0, arg0, 21654);
            int[] var5 = this.method1767(1, arg0, 21654);
            int[] var6 = this.method1767(2, arg0, 21654);
            for (int var7 = 0; ~var7 > ~class176.field3060; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }
}
