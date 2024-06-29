import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class245 extends class730 {

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public int field3623 = 99;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "Lqk;")
    public static class1 field3622 = new class1(58, -1);

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "Lqk;")
    public static class1 field3631 = new class1(48, 3);

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "I")
    public static int field3630;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tf", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field3632;

    // $FF: synthetic method
    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1645(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IJI)Ltia;", line = 6)
    public static final class17 method1634(int arg0, long arg1, int arg2) {
        ++field3624;
        if (arg0 != 1) {
            return null;
        } else {
            class17 var4 = (class17) class433.field6018.method3669(false, arg1 | (long) arg2 << 56);
            if (var4 == null) {
                var4 = new class17(arg2, arg1);
                class433.field6018.method3666((byte) 65, var4.field762, var4);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILha;Lgga;[II)V", line = 26)
    public final void method1635(int arg0, int arg1, class473 arg2, class511 arg3, int[] arg4, int arg5) {
        ++field3629;
        if (!super.field10088) {
            if (arg0 != -4) {
                method1643(36);
            }
            boolean var7 = false;
            if (arg4 != null) {
                arg4[0] = -1;
            }
            class783 var8 = null;
            while (true) {
                int var19;
                label314: do {
                    while (true) {
                        while (~arg3.field6979.length < ~arg3.field6962) {
                            int var18 = arg3.method3013(-127);
                            if (var18 != 0) {
                                if (var18 == 1) {
                                    var19 = arg3.method3013(arg0 + 35);
                                    continue label314;
                                }
                                if (~var18 == -3) {
                                    if (var8 == null) {
                                        var8 = new class783();
                                    }
                                    var8.method4302(-101, arg3);
                                } else if (var18 == 128) {
                                    if (arg4 == null) {
                                        arg3.field6962 += 10;
                                    } else {
                                        arg4[0] = arg3.method3002(-1);
                                        arg4[1] = arg3.method3034(1);
                                        arg4[2] = arg3.method3034(1);
                                        arg4[3] = arg3.method3034(1);
                                        arg4[4] = arg3.method3002(-1);
                                    }
                                } else {
                                    if (var18 != 129) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field10086 == null) {
                                        super.field10086 = new byte[4][][];
                                    }
                                    var7 = true;
                                    for (int var28 = 0; ~var28 > -5; ++var28) {
                                        byte var29 = arg3.method3030(-25984);
                                        if (var29 == 0 && super.field10086[var28] != null) {
                                            int var30 = arg1;
                                            int var31 = arg1 + 64;
                                            int var32 = arg5;
                                            int var33 = arg5 + 64;
                                            if (~arg5 <= -1) {
                                                if (~super.field10087 >= ~arg5) {
                                                    var32 = super.field10087;
                                                }
                                            } else {
                                                var32 = 0;
                                            }
                                            if (~var31 > -1) {
                                                var31 = 0;
                                            } else if (~var31 <= ~super.field10077) {
                                                var31 = super.field10077;
                                            }
                                            if (~arg1 <= -1) {
                                                if (~arg1 <= ~super.field10077) {
                                                    var30 = super.field10077;
                                                }
                                            } else {
                                                var30 = 0;
                                            }
                                            if (~var33 <= -1) {
                                                if (~var33 <= ~super.field10087) {
                                                    var33 = super.field10087;
                                                }
                                            } else {
                                                var33 = 0;
                                            }
                                            while (var31 > var30) {
                                                while (var32 < var33) {
                                                    super.field10086[var28][var30][var32] = 0;
                                                    ++var32;
                                                }
                                                ++var30;
                                            }
                                        } else if (var29 != 1) {
                                            if (~var29 == -3) {
                                                if (super.field10086[var28] == null) {
                                                    super.field10086[var28] = new byte[super.field10077 - -1][super.field10087 + 1];
                                                }
                                                if (~var28 < -1) {
                                                    int var34 = arg1;
                                                    int var35 = arg1 + 64;
                                                    int var36 = arg5;
                                                    if (arg5 < 0) {
                                                        var36 = 0;
                                                    } else if (~super.field10087 >= ~arg5) {
                                                        var36 = super.field10087;
                                                    }
                                                    if (var35 >= 0) {
                                                        if (super.field10077 <= var35) {
                                                            var35 = super.field10077;
                                                        }
                                                    } else {
                                                        var35 = 0;
                                                    }
                                                    if (~arg1 <= -1) {
                                                        if (~arg1 <= ~super.field10077) {
                                                            var34 = super.field10077;
                                                        }
                                                    } else {
                                                        var34 = 0;
                                                    }
                                                    int var37 = arg5 + 64;
                                                    if (var37 >= 0) {
                                                        if (var37 >= super.field10087) {
                                                            var37 = super.field10087;
                                                        }
                                                    } else {
                                                        var37 = 0;
                                                    }
                                                    while (~var35 < ~var34) {
                                                        while (var36 < var37) {
                                                            super.field10086[var28][var34][var36] = super.field10086[var28 + -1][var34][var36];
                                                            ++var36;
                                                        }
                                                        ++var34;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (super.field10086[var28] == null) {
                                                super.field10086[var28] = new byte[super.field10077 + 1][super.field10087 + 1];
                                            }
                                            for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                                for (int var39 = 0; var39 < 64; var39 += 4) {
                                                    byte var40 = arg3.method3030(arg0 ^ 25980);
                                                    for (int var41 = arg1 + var38; ~var41 > ~(arg1 + var38 - -4); ++var41) {
                                                        for (int var42 = arg5 + var39; var42 < arg5 + var39 - -4; ++var42) {
                                                            if (~var41 <= -1 && ~var41 > ~super.field10077 && var42 >= 0 && super.field10087 > var42) {
                                                                super.field10086[var28][var41][var42] = var40;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var8 = new class783(arg3);
                            }
                        }
                        if (var8 != null) {
                            for (int var9 = 0; var9 < 8; ++var9) {
                                for (int var10 = 0; ~var10 > -9; ++var10) {
                                    int var11 = (arg1 >> 3) + var9;
                                    int var12 = (arg5 >> 3) + var10;
                                    if (~var11 <= -1 && var11 < super.field10077 >> 3 && ~var12 <= -1 && ~var12 > ~(super.field10087 >> 3)) {
                                        class393.method2425((byte) 123, var11, var12, var8);
                                    }
                                }
                            }
                        }
                        if (!var7 && super.field10086 != null) {
                            for (int var13 = 0; ~var13 > -5; ++var13) {
                                if (super.field10086[var13] != null) {
                                    for (int var14 = 0; var14 < 16; ++var14) {
                                        for (int var15 = 0; ~var15 > -17; ++var15) {
                                            int var16 = (arg1 >> 2) - -var14;
                                            int var17 = (arg5 >> 2) + var15;
                                            if (~var16 <= -1 && ~var16 > -27 && var17 >= 0 && ~var17 > -27) {
                                                super.field10086[var13][var16][var17] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (var19 <= 0);
                for (int var20 = 0; var20 < var19; ++var20) {
                    class555 var21 = new class555(arg2, arg3, 2);
                    if (~var21.field7692 == -32) {
                        class568 var22 = class444.field6154.method3188(arg3.method3002(arg0 + 3), (byte) 49);
                        var21.method3264(var22.field8010, (byte) -77, var22.field8003, var22.field8001, var22.field8009);
                    }
                    if (~arg2.method143() < -1) {
                        class251 var23 = var21.field7687;
                        int var24 = var23.method1683(arg0 ^ -10918) - -(arg1 << 9);
                        int var25 = var23.method1686(false) - -(arg5 << 9);
                        int var26 = var24 >> 9;
                        int var27 = var25 >> 9;
                        if (var26 >= 0 && var27 >= 0 && var26 < super.field10077 && super.field10087 > var27) {
                            var23.method55(var24, 26119132, var25, super.field10085[var21.field7696][var26][var27] - var23.method1687(1110));
                            class72.method536(var21);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lha;Lgga;II[IIIIZII)V", line = 391)
    public final void method1636(class473 arg0, class511 arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        ++field3621;
        if (!super.field10088) {
            class783 var13 = null;
            if (arg4 != null) {
                arg4[0] = -1;
            }
            int var14 = (7 & arg6) * 8;
            int var15 = (7 & arg3) * 8;
            while (true) {
                while (~arg1.field6962 > ~arg1.field6979.length) {
                    int var20 = arg1.method3013(-128);
                    if (~var20 == -1) {
                        var13 = new class783(arg1);
                    } else if (var20 == 1) {
                        int var21 = arg1.method3013(-6);
                        if (~var21 < -1) {
                            for (int var22 = 0; var22 < var21; ++var22) {
                                class555 var23 = new class555(arg0, arg1, 2);
                                if (var23.field7692 == 31) {
                                    class568 var24 = class444.field6154.method3188(arg1.method3002(-1), (byte) 49);
                                    var23.method3264(var24.field8010, (byte) -98, var24.field8003, var24.field8001, var24.field8009);
                                }
                                if (arg0.method143() > 0) {
                                    class251 var25 = var23.field7687;
                                    int var26 = var25.method1683(10918) >> 9;
                                    int var27 = var25.method1686(false) >> 9;
                                    if (var23.field7696 == arg5 && ~var26 <= ~var14 && ~(var14 - -8) < ~var26 && ~var15 >= ~var27 && var15 + 8 > var27) {
                                        int var28 = class462.method2778(var25.method1686(false) & 4095, var25.method1683(10918) & 4095, -109, arg10) + (arg2 << 9);
                                        int var29 = class436.method2623(var25.method1686(arg8) & 4095, 4095 & var25.method1683(10918), arg10, 1) + (arg7 << 9);
                                        int var30 = var28 >> 9;
                                        int var31 = var29 >> 9;
                                        if (var30 >= 0 && var31 >= 0 && super.field10077 > var30 && var31 < super.field10087) {
                                            var25.method55(var28, 26119132, var29, super.field10085[arg5][var30][var31] + -var25.method1687(1110));
                                            class72.method536(var23);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2) {
                        if (var13 == null) {
                            var13 = new class783();
                        }
                        var13.method4302(-124, arg1);
                    } else if (~var20 == -129) {
                        if (arg4 == null) {
                            arg1.field6962 += 10;
                        } else {
                            arg4[0] = arg1.method3002(-1);
                            arg4[1] = arg1.method3034(1);
                            arg4[2] = arg1.method3034(1);
                            arg4[3] = arg1.method3034(1);
                            arg4[4] = arg1.method3002(-1);
                        }
                    } else {
                        if (~var20 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field10086 == null) {
                            super.field10086 = new byte[4][][];
                        }
                        for (int var32 = 0; var32 < 4; ++var32) {
                            byte var33 = arg1.method3030(-25984);
                            if (var33 == 0 && super.field10086[arg9] != null) {
                                if (var32 <= arg5) {
                                    int var34 = arg2;
                                    int var35 = arg2 + 7;
                                    int var36 = arg7;
                                    int var37 = arg7 + 7;
                                    if (arg7 < 0) {
                                        var36 = 0;
                                    } else if (~super.field10087 >= ~arg7) {
                                        var36 = super.field10087;
                                    }
                                    if (~var35 <= -1) {
                                        if (~super.field10077 >= ~var35) {
                                            var35 = super.field10077;
                                        }
                                    } else {
                                        var35 = 0;
                                    }
                                    if (~arg2 <= -1) {
                                        if (~super.field10077 >= ~arg2) {
                                            var34 = super.field10077;
                                        }
                                    } else {
                                        var34 = 0;
                                    }
                                    if (~var37 > -1) {
                                        var37 = 0;
                                    } else if (~var37 <= ~super.field10087) {
                                        var37 = super.field10087;
                                    }
                                    while (~var35 < ~var34) {
                                        while (var36 < var37) {
                                            super.field10086[arg9][var34][var36] = 0;
                                            ++var36;
                                        }
                                        ++var34;
                                    }
                                }
                            } else if (~var33 == -2) {
                                if (super.field10086[arg9] == null) {
                                    super.field10086[arg9] = new byte[super.field10077 - -1][super.field10087 + 1];
                                }
                                for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                    for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                        byte var40 = arg1.method3030(-25984);
                                        if (~var32 >= ~arg5) {
                                            for (int var41 = var38; ~(var38 + 4) < ~var41; ++var41) {
                                                for (int var42 = var39; var42 < var39 - -4; ++var42) {
                                                    if (~var14 >= ~var41 && var41 < var14 + 8 && ~var42 <= ~var15 && ~(var15 - -8) < ~var15) {
                                                        int var43 = class457.method2749(7 & var42, var41 & 7, arg10, -1) + arg2;
                                                        int var44 = class32.method266(var42 & 7, (byte) -74, 7 & var41, arg10) + arg7;
                                                        if (var43 >= 0 && ~super.field10077 < ~var43 && ~var44 <= -1 && super.field10087 > var44) {
                                                            super.field10086[arg9][var43][var44] = var40;
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
                    class393.method2425((byte) 123, arg2 >> 3, arg7 >> 3, var13);
                }
                if (!arg8 && super.field10086 != null && super.field10086[arg9] != null) {
                    int var16 = arg2 + 7;
                    int var17 = arg7 + 7;
                    for (int var18 = arg2; var16 > var18; ++var18) {
                        for (int var19 = arg7; var17 > var19; ++var19) {
                            super.field10086[arg9][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBIII)Loc;", line = 683)
    public final class466 method1637(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 92) {
            return null;
        } else {
            ++field3619;
            class466 var6 = null;
            if (arg4 == 0) {
                var6 = (class466) class174.method1110(arg0, arg3, arg2);
            }
            if (~arg4 == -2) {
                var6 = (class466) class371.method2310(arg0, arg3, arg2);
            }
            if (~arg4 == -3) {
                var6 = (class466) class485.method2882(arg0, arg3, arg2, field3632 != null ? field3632 : (field3632 = method1645("oc")));
            }
            if (arg4 == 3) {
                var6 = (class466) class349.method2197(arg0, arg3, arg2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(F[FFIIIIIIIF[FII)V", line = 709)
    public static final void method1638(float arg0, float[] arg1, float arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, float arg10, float[] arg11, int arg12, int arg13) {
        int var14 = arg13 - arg6;
        int var15 = arg3 - arg8;
        ++field3625;
        int var16 = arg9 - arg4;
        float var17 = arg11[2] * (float) var15 + arg11[0] * (float) var16 + arg11[1] * (float) var14;
        float var18 = arg11[5] * (float) var15 + arg11[4] * (float) var14 + arg11[3] * (float) var16;
        float var19 = arg11[8] * (float) var15 + arg11[6] * (float) var16 + arg11[7] * (float) var14;
        if (arg12 <= -7) {
            float var20;
            float var21;
            if (arg5 != 0) {
                if (~arg5 != -2) {
                    if (arg5 == 2) {
                        var20 = -var18 + arg0 + 0.5F;
                        var21 = -var17 + arg10 + 0.5F;
                    } else if (~arg5 == -4) {
                        var20 = -var18 + arg0 + 0.5F;
                        var21 = arg10 + var17 + 0.5F;
                    } else if (arg5 != 4) {
                        var20 = -var18 + arg0 + 0.5F;
                        var21 = -var19 + arg2 + 0.5F;
                    } else {
                        var20 = -var18 + arg0 + 0.5F;
                        var21 = arg2 + var19 + 0.5F;
                    }
                } else {
                    var21 = arg10 + var17 + 0.5F;
                    var20 = arg2 + var19 + 0.5F;
                }
            } else {
                var21 = arg10 + var17 + 0.5F;
                var20 = -var19 + arg2 + 0.5F;
            }
            if (~arg7 != -2) {
                if (arg7 != 2) {
                    if (~arg7 == -4) {
                        float var22 = var21;
                        var21 = var20;
                        var20 = -var22;
                    }
                } else {
                    var21 = -var21;
                    var20 = -var20;
                }
            } else {
                float var23 = var21;
                var21 = -var20;
                var20 = var23;
            }
            arg1[1] = var20;
            arg1[0] = var21;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([Lsn;ZII[BLha;)V", line = 795)
    public final void method1639(class739[] arg0, boolean arg1, int arg2, int arg3, byte[] arg4, class473 arg5) {
        ++field3630;
        class511 var7 = new class511(arg4);
        if (!arg1) {
            this.method1640(-28, 99, -92, 25, 29, (class473) null, 92, -76, -81, (class739) null, 59);
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method3041(109);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method3043(-31927);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = 63 & var10;
                int var13 = (var10 & 4059) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method3013(-123);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = arg3 + var13;
                int var19 = arg2 + var12;
                if (~var18 < -1 && var19 > 0 && var18 < super.field10077 + -1 && ~var19 > ~(super.field10087 - 1)) {
                    class739 var20 = null;
                    if (!super.field10088) {
                        int var21 = var14;
                        if ((class533.field7338[1][var18][var19] & 2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg0[var21];
                        }
                    }
                    this.method1640(var17, var14, -1, var14, var8, arg5, -275, var18, var19, var20, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIILha;IIILsn;I)V", line = 871)
    public final void method1640(int arg0, int arg1, int arg2, int arg3, int arg4, class473 arg5, int arg6, int arg7, int arg8, class739 arg9, int arg10) {
        ++field3627;
        if (class688.field9602.field8542.method1756((byte) -98) != 0 || class421.method2541(arg1, class464.field6471, -1, arg8, arg7)) {
            if (this.field3623 > arg3) {
                this.field3623 = arg3;
            }
            class286 var12 = class390.field5558.method3065(22, arg4);
            if (~class688.field9602.field8506.method1732((byte) -98) != -1 || !var12.field4163) {
                int var13;
                int var14;
                if (arg0 != 1 && ~arg0 != -4) {
                    var13 = var12.field4146;
                    var14 = var12.field4148;
                } else {
                    var13 = var12.field4148;
                    var14 = var12.field4146;
                }
                int var15;
                int var16;
                if (super.field10077 < arg7 + var13) {
                    var15 = arg7;
                    var16 = arg7 + 1;
                } else {
                    var16 = arg7 - -(var13 + 1 >> 1);
                    var15 = (var13 >> 1) + arg7;
                }
                int var17;
                int var18;
                if (super.field10087 < arg8 + var14) {
                    var17 = arg8 + 1;
                    var18 = arg8;
                } else {
                    var18 = (var14 >> 1) + arg8;
                    var17 = (var14 + 1 >> 1) + arg8;
                }
                class418 var19 = class661.field9303[arg1];
                int var20 = var19.method2525(var15, var18, (byte) 114) - (-var19.method2525(var16, var18, (byte) 114) - var19.method2525(var15, var17, (byte) 114) + -var19.method2525(var16, var17, (byte) 114)) >> 2;
                int var21 = (arg7 << 9) - -(var13 << 8);
                int var22 = (arg8 << 9) + (var14 << 8);
                boolean var23 = class546.field7590 && !super.field10088 && var12.field4164;
                if (var12.method1885(0)) {
                    class713.method4002((class359) null, var12, arg7, arg8, (class723) null, arg0, arg3, false);
                }
                boolean var24 = ~arg2 == 0 && var12.field4204 == -1 && var12.field4159 == null && var12.field4136 == null && !var12.field4179 && !var12.field4184;
                if (!class122.field1615 || (!class661.method3776(arg10, 0) || var12.field4120 == 1) && (!class262.method1727(-13, arg10) || var12.field4120 != 0)) {
                    if (arg10 == 22) {
                        if (class688.field9602.field8508.method491((byte) -98) != 0 || ~var12.field4137 != -1 || ~var12.field4138 == -2 || var12.field4205) {
                            class727 var25;
                            if (!var24) {
                                var25 = new class236(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, arg0, arg2);
                            } else {
                                class221 var26 = new class221(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, arg0, var23);
                                var25 = var26;
                                if (var26.method755((byte) -111)) {
                                    var26.method763(arg5, false);
                                }
                            }
                            class361.method2275(arg3, arg7, arg8, var25);
                            if (var12.field4138 == 1 && arg9 != null) {
                                arg9.method4094(arg6 ^ -262419, arg7, arg8);
                            }
                        }
                    } else if (~arg10 != -11 && ~arg10 != -12) {
                        if ((arg10 < 12 || ~arg10 < -18) && (arg10 < 18 || ~arg10 < -22)) {
                            if (~arg10 == -1) {
                                int var29 = var12.field4120;
                                if (class378.field5428 && ~var12.field4120 == 0) {
                                    var29 = 1;
                                }
                                class391 var30;
                                if (!var24) {
                                    var30 = new class107(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, arg10, arg0, arg2);
                                } else {
                                    class754 var31 = new class754(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, arg10, arg0, var23);
                                    if (var31.method755((byte) -111)) {
                                        var31.method763(arg5, false);
                                    }
                                    var30 = var31;
                                }
                                class666.method3795(arg3, arg7, arg8, var30, (class391) null);
                                if (arg0 == 0) {
                                    if (class546.field7590 && var12.field4158) {
                                        var19.method1376(arg7, arg8, 50);
                                        var19.method1376(arg7, arg8 + 1, 50);
                                    }
                                    if (var29 == 1 && !super.field10088) {
                                        class259.method1711(1, arg7, var12.field4201, arg3, arg8, var12.field4127, arg6 + 159);
                                    }
                                } else if (~arg0 == -2) {
                                    if (class546.field7590 && var12.field4158) {
                                        var19.method1376(arg7, arg8 + 1, 50);
                                        var19.method1376(arg7 - -1, arg8 - -1, 50);
                                    }
                                    if (~var29 == -2 && !super.field10088) {
                                        class259.method1711(2, arg7, -var12.field4201, arg3, arg8 - -1, var12.field4127, arg6 + 193);
                                    }
                                } else if (arg0 == 2) {
                                    if (class546.field7590 && var12.field4158) {
                                        var19.method1376(arg7 - -1, arg8, 50);
                                        var19.method1376(arg7 + 1, arg8 + 1, 50);
                                    }
                                    if (~var29 == -2 && !super.field10088) {
                                        class259.method1711(1, arg7 + 1, -var12.field4201, arg3, arg8, var12.field4127, -76);
                                    }
                                } else if (~arg0 == -4) {
                                    if (class546.field7590 && var12.field4158) {
                                        var19.method1376(arg7, arg8, 50);
                                        var19.method1376(arg7 + 1, arg8, 50);
                                    }
                                    if (var29 == 1 && !super.field10088) {
                                        class259.method1711(2, arg7, var12.field4201, arg3, arg8, var12.field4127, -116);
                                    }
                                }
                                if (~var12.field4138 != -1 && arg9 != null) {
                                    arg9.method4095(arg10, 40, !var12.field4150, arg8, var12.field4178, arg0, arg7);
                                }
                                if (var12.field4135 != 64) {
                                    class121.method856(arg3, arg7, arg8, var12.field4135);
                                }
                            } else if (arg10 == 1) {
                                class391 var32;
                                if (!var24) {
                                    var32 = new class107(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, arg10, arg0, arg2);
                                } else {
                                    class754 var33 = new class754(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, arg10, arg0, var23);
                                    var32 = var33;
                                    if (var33.method755((byte) -111)) {
                                        var33.method763(arg5, false);
                                    }
                                }
                                class666.method3795(arg3, arg7, arg8, var32, (class391) null);
                                if (var12.field4158 && class546.field7590) {
                                    if (~arg0 != -1) {
                                        if (arg0 == 1) {
                                            var19.method1376(arg7 - -1, arg8 + 1, 50);
                                        } else if (arg0 != 2) {
                                            if (~arg0 == -4) {
                                                var19.method1376(arg7, arg8, 50);
                                            }
                                        } else {
                                            var19.method1376(arg7 + 1, arg8, 50);
                                        }
                                    } else {
                                        var19.method1376(arg7, arg8 + 1, 50);
                                    }
                                }
                                if (~var12.field4138 != -1 && arg9 != null) {
                                    arg9.method4095(arg10, 96, !var12.field4150, arg8, var12.field4178, arg0, arg7);
                                }
                            } else if (arg10 == 2) {
                                int var34 = 3 & arg0 - -1;
                                class391 var35;
                                class391 var36;
                                if (!var24) {
                                    var35 = new class107(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, arg10, arg0 + 4, arg2);
                                    var36 = new class107(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, arg10, var34, arg2);
                                } else {
                                    class754 var37 = new class754(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, arg10, arg0 - -4, var23);
                                    class754 var38 = new class754(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, arg10, var34, var23);
                                    if (var37.method755((byte) -111)) {
                                        var37.method763(arg5, false);
                                    }
                                    var36 = var38;
                                    if (var38.method755((byte) -111)) {
                                        var38.method763(arg5, false);
                                    }
                                    var35 = var37;
                                }
                                class666.method3795(arg3, arg7, arg8, var35, var36);
                                if ((~var12.field4120 == -2 || class378.field5428 && ~var12.field4120 == 0) && !super.field10088) {
                                    if (arg0 == 0) {
                                        class259.method1711(1, arg7, var12.field4201, arg3, arg8, var12.field4127, -79);
                                        class259.method1711(2, arg7, var12.field4201, arg3, arg8 - -1, var12.field4127, arg6 + 181);
                                    } else if (arg0 == 1) {
                                        class259.method1711(1, arg7 + 1, var12.field4201, arg3, arg8, var12.field4127, -73);
                                        class259.method1711(2, arg7, var12.field4201, arg3, arg8 + 1, var12.field4127, -107);
                                    } else if (arg0 != 2) {
                                        if (arg0 == 3) {
                                            class259.method1711(1, arg7, var12.field4201, arg3, arg8, var12.field4127, -116);
                                            class259.method1711(2, arg7, var12.field4201, arg3, arg8, var12.field4127, arg6 + 192);
                                        }
                                    } else {
                                        class259.method1711(1, arg7 + 1, var12.field4201, arg3, arg8, var12.field4127, arg6 ^ 358);
                                        class259.method1711(2, arg7, var12.field4201, arg3, arg8, var12.field4127, -70);
                                    }
                                }
                                if (var12.field4138 != 0 && arg9 != null) {
                                    arg9.method4095(arg10, 30, !var12.field4150, arg8, var12.field4178, arg0, arg7);
                                }
                                if (var12.field4135 != 64) {
                                    class121.method856(arg3, arg7, arg8, var12.field4135);
                                }
                            } else if (arg10 == 3) {
                                class391 var40;
                                if (var24) {
                                    class754 var39 = new class754(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, arg10, arg0, var23);
                                    var40 = var39;
                                    if (var39.method755((byte) -111)) {
                                        var39.method763(arg5, false);
                                    }
                                } else {
                                    var40 = new class107(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, arg10, arg0, arg2);
                                }
                                class666.method3795(arg3, arg7, arg8, var40, (class391) null);
                                if (var12.field4158 && class546.field7590) {
                                    if (arg0 == 0) {
                                        var19.method1376(arg7, arg8 + 1, 50);
                                    } else if (~arg0 == -2) {
                                        var19.method1376(arg7 + 1, arg8 + 1, 50);
                                    } else if (arg0 == 2) {
                                        var19.method1376(arg7 + 1, arg8, 50);
                                    } else if (~arg0 == -4) {
                                        var19.method1376(arg7, arg8, 50);
                                    }
                                }
                                if (~var12.field4138 != -1 && arg9 != null) {
                                    arg9.method4095(arg10, 40, !var12.field4150, arg8, var12.field4178, arg0, arg7);
                                }
                            } else if (arg10 == 9) {
                                class253 var41;
                                if (!var24) {
                                    var41 = new class681(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, arg7, arg7 - (-var13 + 1), arg8, arg8 + var14 + -1, arg10, arg0, arg2);
                                } else {
                                    class368 var42 = new class368(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, arg7, arg7, arg8, arg8, arg10, arg0, var23);
                                    var41 = var42;
                                    if (var42.method755((byte) -111)) {
                                        var42.method763(arg5, false);
                                    }
                                }
                                class497.method2922(var41, false);
                                if (~var12.field4120 == -2 && !super.field10088) {
                                    byte var43;
                                    if ((arg0 & 1) != 0) {
                                        var43 = 16;
                                    } else {
                                        var43 = 8;
                                    }
                                    class259.method1711(var43, arg7, 0, arg3, arg8, var12.field4127, -117);
                                }
                                if (var12.field4138 != 0 && arg9 != null) {
                                    arg9.method4092(256, !var12.field4150, var14, arg7, var12.field4178, var13, arg8);
                                }
                                if (~var12.field4135 != -65) {
                                    class121.method856(arg3, arg7, arg8, var12.field4135);
                                }
                            } else {
                                if (arg6 != -275) {
                                    field3631 = null;
                                }
                                if (~arg10 == -5) {
                                    class770 var44;
                                    if (!var24) {
                                        var44 = new class521(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, 0, 0, arg10, arg0, arg2);
                                    } else {
                                        class111 var45 = new class111(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, 0, 0, arg10, arg0);
                                        var44 = var45;
                                        if (var45.method755((byte) -111)) {
                                            var45.method763(arg5, false);
                                        }
                                    }
                                    class278.method1805(arg3, arg7, arg8, var44, (class770) null);
                                } else if (~arg10 == -6) {
                                    int var46 = 65;
                                    class466 var47 = (class466) class174.method1110(arg3, arg7, arg8);
                                    if (var47 != null) {
                                        var46 = 1 + class390.field5558.method3065(-118, var47.method760(arg6 ^ 27365)).field4135;
                                    }
                                    class770 var49;
                                    if (var24) {
                                        class111 var48 = new class111(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, class106.field1243[arg0] * var46, class259.field3805[arg0] * var46, arg10, arg0);
                                        var49 = var48;
                                        if (var48.method755((byte) -111)) {
                                            var48.method763(arg5, false);
                                        }
                                    } else {
                                        var49 = new class521(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, class106.field1243[arg0] * var46, class259.field3805[arg0] * var46, arg10, arg0, arg2);
                                    }
                                    class278.method1805(arg3, arg7, arg8, var49, (class770) null);
                                } else if (~arg10 == -7) {
                                    int var50 = 33;
                                    class466 var51 = (class466) class174.method1110(arg3, arg7, arg8);
                                    if (var51 != null) {
                                        var50 = class390.field5558.method3065(-128, var51.method760(-27640)).field4135 / 2 - -1;
                                    }
                                    class770 var52;
                                    if (!var24) {
                                        var52 = new class521(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, class290.field4274[arg0] * var50, class65.field722[arg0] * var50, arg10, arg0 - -4, arg2);
                                    } else {
                                        class111 var53 = new class111(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, class106.field1243[arg0] * var50, class259.field3805[arg0] * var50, arg10, arg0 - -4);
                                        var52 = var53;
                                        if (var53.method755((byte) -111)) {
                                            var53.method763(arg5, false);
                                        }
                                    }
                                    class278.method1805(arg3, arg7, arg8, var52, (class770) null);
                                } else if (arg10 == 7) {
                                    int var54 = 3 & arg0 + 2;
                                    class770 var55;
                                    if (!var24) {
                                        var55 = new class521(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, 0, 0, arg10, var54 + 4, arg2);
                                    } else {
                                        class111 var56 = new class111(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, 0, 0, arg10, var54 + 4);
                                        if (var56.method755((byte) -111)) {
                                            var56.method763(arg5, false);
                                        }
                                        var55 = var56;
                                    }
                                    class278.method1805(arg3, arg7, arg8, var55, (class770) null);
                                } else if (arg10 == 8) {
                                    int var57 = arg0 - -2 & 3;
                                    int var58 = 33;
                                    class466 var59 = (class466) class174.method1110(arg3, arg7, arg8);
                                    if (var59 != null) {
                                        var58 = class390.field5558.method3065(arg6 + 148, var59.method760(-27640)).field4135 / 2 + 1;
                                    }
                                    class770 var61;
                                    class770 var63;
                                    if (!var24) {
                                        class521 var60 = new class521(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, class290.field4274[arg0] * var58, class65.field722[arg0] * var58, arg10, arg0 + 4, arg2);
                                        var61 = var60;
                                        class521 var62 = new class521(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, 0, 0, arg10, var57 + 4, arg2);
                                        var63 = var62;
                                    } else {
                                        class111 var64 = new class111(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, class290.field4274[arg0] * var58, class65.field722[arg0] * var58, arg10, arg0 - -4);
                                        class111 var65 = new class111(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, 0, 0, arg10, var57 + 4);
                                        if (var64.method755((byte) -111)) {
                                            var64.method763(arg5, false);
                                        }
                                        var63 = var65;
                                        var61 = var64;
                                        if (var65.method755((byte) -111)) {
                                            var65.method763(arg5, false);
                                        }
                                    }
                                    class278.method1805(arg3, arg7, arg8, var61, var63);
                                }
                            }
                        } else {
                            class253 var28;
                            if (var24) {
                                class368 var27 = new class368(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, arg7, arg7 - 1 + var13, arg8, arg8 - -var14 + -1, arg10, arg0, var23);
                                if (var27.method755((byte) -111)) {
                                    var27.method763(arg5, false);
                                }
                                var28 = var27;
                            } else {
                                var28 = new class681(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, arg7, arg7 + var13 - 1, arg8, arg8 - (-var14 - -1), arg10, arg0, arg2);
                            }
                            class497.method2922(var28, false);
                            if (class546.field7590 && !super.field10088 && ~arg10 <= -13 && ~arg10 >= -18 && ~arg10 != -14 && ~arg3 < -1 && var12.field4120 != 0) {
                                super.field10092[arg3][arg7][arg8] = (byte) class613.method3544(super.field10092[arg3][arg7][arg8], 4);
                            }
                            if (var12.field4138 != 0 && arg9 != null) {
                                arg9.method4092(arg6 ^ -19, !var12.field4150, var14, arg7, var12.field4178, var13, arg8);
                            }
                        }
                    } else {
                        class368 var66 = null;
                        class253 var68;
                        int var69;
                        if (var24) {
                            class368 var67 = new class368(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, arg7, var13 + -1 + arg7, arg8, arg8 + -1 + var14, arg10, arg0, var23);
                            var66 = var67;
                            var68 = var67;
                            var69 = var67.method2293(-36);
                        } else {
                            var68 = new class681(arg5, var12, arg3, arg1, var21, var20, var22, super.field10088, arg7, arg7 + var13 + -1, arg8, arg8 - (-var14 + 1), arg10, arg0, arg2);
                            var69 = 15;
                        }
                        if (class497.method2922(var68, false)) {
                            if (var66 != null && var66.method755((byte) -111)) {
                                var66.method763(arg5, false);
                            }
                            if (var12.field4158 && class546.field7590) {
                                if (~var69 < -31) {
                                    var69 = 30;
                                }
                                for (int var70 = 0; ~var13 <= ~var70; ++var70) {
                                    for (int var71 = 0; var71 <= var14; ++var71) {
                                        var19.method1376(arg7 + var70, arg8 + var71, var69);
                                    }
                                }
                            }
                        }
                        if (var12.field4138 != 0 && arg9 != null) {
                            arg9.method4092(256, !var12.field4150, var14, arg7, var12.field4178, var13, arg8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIILsn;Lha;I)V", line = 1500)
    public final void method1641(int arg0, int arg1, int arg2, int arg3, class739 arg4, class473 arg5, int arg6) {
        ++field3626;
        if (arg6 != 8) {
            field3631 = null;
        }
        class466 var8 = this.method1637(arg0, (byte) 124, arg1, arg3, arg2);
        if (var8 != null) {
            class286 var9 = class390.field5558.method3065(-119, var8.method760(arg6 ^ -27648));
            int var10 = var8.method756((byte) -53);
            int var11 = var8.method762(true);
            if (var9.method1885(0)) {
                class706.method3987(arg3, var9, 39, arg0, arg1);
            }
            if (var8.method755((byte) -111)) {
                var8.method757(arg5, 73);
            }
            if (arg2 != 0) {
                if (arg2 == 1) {
                    class23.method93(arg0, arg3, arg1);
                    return;
                }
                if (arg2 == 2) {
                    class709.method3994(arg0, arg3, arg1, field3632 != null ? field3632 : (field3632 = method1645("oc")));
                    if (var9.field4138 != 0 && super.field10077 > var9.field4146 + arg3 && ~(arg1 - -var9.field4146) > ~super.field10087 && var9.field4148 + arg3 < super.field10077 && ~(var9.field4148 + arg1) > ~super.field10087) {
                        arg4.method4103(arg3, arg1, var9.field4146, var9.field4148, var9.field4178, var11, arg6 + 26268, !var9.field4150);
                    }
                    if (var10 == 9) {
                        if ((var11 & 1) != 0) {
                            class402.method2467(arg0, false, 16, arg3, arg1);
                            return;
                        }
                        class402.method2467(arg0, false, 8, arg3, arg1);
                        return;
                    }
                } else {
                    if (~arg2 != -4) {
                        return;
                    }
                    class697.method3934(arg0, arg3, arg1);
                    if (~var9.field4138 != -2) {
                        return;
                    }
                    arg4.method4099(arg1, arg3, arg6 + -9);
                }
                return;
            }
            class201.method1297(arg0, arg3, arg1);
            if (var9.field4138 != 0) {
                arg4.method4088(arg3, var9.field4178, var10, (byte) 30, var11, !var9.field4150, arg1);
            }
            if (~var9.field4120 == -2) {
                if (~var11 == -1) {
                    class402.method2467(arg0, false, 1, arg3, arg1);
                    return;
                }
                if (~var11 != -2) {
                    if (var11 == 2) {
                        class402.method2467(arg0, false, 1, arg3 + 1, arg1);
                        return;
                    }
                    if (var11 == 3) {
                        class402.method2467(arg0, false, 2, arg3, arg1);
                        return;
                    }
                } else {
                    class402.method2467(arg0, false, 2, arg3, arg1 + 1);
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZILha;III[BI[Lsn;I)V", line = 1597)
    public final void method1642(int arg0, boolean arg1, int arg2, class473 arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, class739[] arg9, int arg10) {
        ++field3628;
        class511 var12 = new class511(arg7);
        if (!arg1) {
            field3631 = null;
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method3041(85);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method3043(-31927);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 63;
                int var18 = (4074 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method3013(119);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (~arg8 == ~var19 && var18 >= arg4 && ~(arg4 + 8) < ~var18 && var17 >= arg0 && var17 < arg0 - -8) {
                    class286 var23 = class390.field5558.method3065(125, var13);
                    int var24 = class230.method1533(7 & var18, 23467, var23.field4146, var23.field4148, var22, 7 & var17, arg2) + arg5;
                    int var25 = class86.method648(arg1, 7 & var18, var23.field4148, arg2, var23.field4146, var17 & 7, var22) + arg6;
                    if (var24 > 0 && var25 > 0 && var24 < super.field10077 - 1 && var25 < super.field10087 - 1) {
                        class739 var26 = null;
                        if (!super.field10088) {
                            int var27 = arg10;
                            if (~(2 & class533.field7338[1][var24][var25]) == -3) {
                                var27 = arg10 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg9[var27];
                            }
                        }
                        this.method1640(3 & arg2 + var22, arg10, -1, arg10, var13, arg3, -275, var24, var25, var26, var21);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V", line = 1677)
    public static void method1643(int arg0) {
        field3631 = null;
        field3622 = null;
        if (arg0 != -1) {
            field3631 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(IIIZ)V", line = 1832)
    public class245(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class231.field3485, class632.field8833);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lha;ZB)V", line = 1695)
    public final void method1644(class473 arg0, boolean arg1, byte arg2) {
        int var4 = -47 % ((3 - arg2) / 41);
        class84.method639();
        ++field3620;
        if (!arg1) {
            if (super.field10098 > 1) {
                for (int var5 = 0; ~var5 > ~super.field10077; ++var5) {
                    for (int var6 = 0; ~var6 > ~super.field10087; ++var6) {
                        if (~(2 & class533.field7338[1][var5][var6]) == -3) {
                            class124.method871(var5, var6);
                        }
                    }
                }
            }
            for (int var7 = 0; super.field10098 > var7; ++var7) {
                for (int var8 = 0; ~var8 >= ~super.field10087; ++var8) {
                    for (int var9 = 0; ~super.field10077 <= ~var9; ++var9) {
                        if ((super.field10092[var7][var9][var8] & 4) != 0) {
                            int var10 = var9;
                            int var11 = var9;
                            int var12 = var8;
                            int var13 = var8;
                            while (~var12 < -1 && ~(super.field10092[var7][var9][var12 - 1] & 4) != -1 && var13 - var12 < 10) {
                                --var12;
                            }
                            while (super.field10087 > var13 && ~(4 & super.field10092[var7][var9][var13 + 1]) != -1 && -var12 + var13 < 10) {
                                ++var13;
                            }
                            label114: while (~var10 < -1 && -var10 + var11 < 10) {
                                for (int var14 = var12; ~var13 <= ~var14; ++var14) {
                                    if ((4 & super.field10092[var7][var10 + -1][var14]) == 0) {
                                        break label114;
                                    }
                                }
                                --var10;
                            }
                            label101: while (super.field10077 > var11 && ~(var11 - var10) > -11) {
                                for (int var15 = var12; ~var13 <= ~var15; ++var15) {
                                    if (~(super.field10092[var7][var11 + 1][var15] & 4) == -1) {
                                        break label101;
                                    }
                                }
                                ++var11;
                            }
                            if ((var11 - (var10 - 1)) * (-var12 - -1 + var13) >= 4) {
                                int var16 = super.field10085[var7][var10][var12];
                                class174.method1113(var16, 115, (var11 << 9) + 512, (var13 << 9) + 512, var12 << 9, var7, 4, var10 << 9, var16);
                                for (int var17 = var10; ~var11 <= ~var17; ++var17) {
                                    for (int var18 = var12; ~var13 <= ~var18; ++var18) {
                                        super.field10092[var7][var17][var18] = (byte) class407.method2490(super.field10092[var7][var17][var18], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class164.method1032(8);
        }
        super.field10092 = null;
    }
}
