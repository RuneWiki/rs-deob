import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class154 extends class732 {

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    public int field2144 = 99;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "[Ljava/lang/String;")
    private static final String[] field2154 = new String[] { method1402(method1401("<I\u000by")), method1402(method1401(")\u0012I;$")), method1402(method1401("\"VIFq")), method1402(method1401("\"VIAq")), method1402(method1401("\"VIZq")), method1402(method1401("\"VIEq")), method1402(method1401("\"VIDq")), method1402(method1401("6L")), method1402(method1401("\"VIBq")), method1402(method1401("\"VICq")), method1402(method1401("\"VIGq")), method1402(method1401("\"VI@q")) };

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "[B")
    public static byte[] field2145 = new byte[520];

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "I")
    public static int field2152;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field2153;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "[Loe;")
    public static class210[] field2141;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1400(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIILwq;[IIILha;)V", line = 5)
    public final void method1391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class176 arg6, int[] arg7, int arg8, int arg9, class63 arg10) {
        try {
            ++field2147;
            if (!super.field10721) {
                if (arg0 < -23) {
                    boolean var12 = false;
                    if (arg7 != null) {
                        arg7[0] = -1;
                    }
                    class758 var13 = null;
                    int var14 = (arg1 & 7) * 8;
                    int var15 = (arg4 & 7) * 8;
                    while (true) {
                        while (arg6.field2805.length > arg6.field2799) {
                            int var16 = arg6.method1645((byte) -110);
                            if (~var16 == -1) {
                                var13 = new class758(arg6);
                            } else if (~var16 == -2) {
                                int var30 = arg6.method1645((byte) -111);
                                if (var30 > 0) {
                                    for (int var31 = 0; ~var31 > ~var30; ++var31) {
                                        class610 var32 = new class610(arg10, arg6, 2);
                                        if (~var32.field8784 == -32) {
                                            class145 var33 = class199.field3154.method5690((byte) 43, arg6.method1687((byte) -71));
                                            var32.method4450(var33.field2052, 10, var33.field2055, var33.field2050, var33.field2047);
                                        }
                                        if (arg10.method177() > 0) {
                                            class731 var34 = var32.field8782;
                                            int var35 = var34.method5300(32) >> 9;
                                            int var36 = var34.method5298(-4) >> 9;
                                            if (var32.field8793 == arg3 && var35 >= var14 && ~(var14 + 8) < ~var35 && ~var36 <= ~var15 && var36 < var15 + 8) {
                                                int var37 = class182.method1713(var34.method5298(-4) & 4095, arg2, 3, 4095 & var34.method5300(32)) + (arg5 << 9);
                                                int var38 = var37 >> 9;
                                                int var39 = class164.method1542(true, var34.method5298(-4) & 4095, 4095 & var34.method5300(32), arg2) + (arg9 << 9);
                                                int var40 = var39 >> 9;
                                                if (var38 >= 0 && ~var40 <= -1 && ~var38 > ~super.field10725 && ~super.field10727 < ~var40) {
                                                    var34.method1254(var37, 64, super.field10741[arg3][var38][var40] - var34.method5297(false), var39);
                                                    class543.method4040(var32);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (~var16 == -3) {
                                if (var13 == null) {
                                    var13 = new class758();
                                }
                                var13.method5479(arg6, (byte) -22);
                            } else if (~var16 == -129) {
                                if (arg7 == null) {
                                    arg6.field2799 += 10;
                                } else {
                                    arg7[0] = arg6.method1687((byte) -87);
                                    arg7[1] = arg6.method1657(77);
                                    arg7[2] = arg6.method1657(105);
                                    arg7[3] = arg6.method1657(123);
                                    arg7[4] = arg6.method1687((byte) -105);
                                }
                            } else {
                                if (~var16 != -130) {
                                    throw new IllegalStateException("");
                                }
                                if (super.field10739 == null) {
                                    super.field10739 = new byte[4][][];
                                }
                                for (int var17 = 0; ~var17 > -5; ++var17) {
                                    byte var18 = arg6.method1672(-90);
                                    if (var18 == 0 && super.field10739[arg8] != null) {
                                        if (~arg3 <= ~var17) {
                                            int var19 = arg5;
                                            int var20 = arg5 + 7;
                                            int var21 = arg9;
                                            if (~arg9 > -1) {
                                                var21 = 0;
                                            } else if (~arg9 <= ~super.field10727) {
                                                var21 = super.field10727;
                                            }
                                            if (var20 >= 0) {
                                                if (super.field10725 <= var20) {
                                                    var20 = super.field10725;
                                                }
                                            } else {
                                                var20 = 0;
                                            }
                                            int var22 = arg9 + 7;
                                            if (~arg5 > -1) {
                                                var19 = 0;
                                            } else if (~super.field10725 >= ~arg5) {
                                                var19 = super.field10725;
                                            }
                                            if (~var22 > -1) {
                                                var22 = 0;
                                            } else if (super.field10727 <= var22) {
                                                var22 = super.field10727;
                                            }
                                            while (~var19 > ~var20) {
                                                while (~var21 > ~var22) {
                                                    super.field10739[arg8][var19][var21] = 0;
                                                    ++var21;
                                                }
                                                ++var19;
                                            }
                                        }
                                    } else if (~var18 == -2) {
                                        if (super.field10739[arg8] == null) {
                                            super.field10739[arg8] = new byte[super.field10725 + 1][super.field10727 - -1];
                                        }
                                        for (int var23 = 0; ~var23 > -65; var23 += 4) {
                                            for (int var24 = 0; var24 < 64; var24 += 4) {
                                                byte var25 = arg6.method1672(-101);
                                                if (arg3 >= var17) {
                                                    for (int var26 = var23; ~var26 > ~(var23 + 4); ++var26) {
                                                        for (int var27 = var24; var24 + 4 > var27; ++var27) {
                                                            if (~var26 <= ~var14 && var14 - -8 > var26 && var15 <= var27 && ~var15 > ~(var15 + 8)) {
                                                                int var28 = class595.method4356(var26 & 7, arg2, 7 & var27, 1) + arg5;
                                                                int var29 = class767.method5530(arg2, var26 & 7, 7 & var27, 74) + arg9;
                                                                if (~var28 <= -1 && var28 < super.field10725 && var29 >= 0 && var29 < super.field10727) {
                                                                    super.field10739[arg8][var28][var29] = var25;
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
                            class705.method5126(-5327, var13, arg9 >> 3, arg5 >> 3);
                        }
                        if (!var12 && super.field10739 != null && super.field10739[arg8] != null) {
                            int var41 = arg5 + 7;
                            int var42 = arg9 + 7;
                            for (int var43 = arg5; var41 > var43; ++var43) {
                                for (int var44 = arg9; ~var42 < ~var44; ++var44) {
                                    super.field10739[arg8][var43][var44] = 0;
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        } catch (RuntimeException var46) {
            throw class590.method4333(var46, field2154[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field2154[1] : field2154[0]) + ',' + (arg7 != null ? field2154[1] : field2154[0]) + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field2154[1] : field2154[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(IIIZ)V", line = 301)
    public class154(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class452.field6991, class295.field4813);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lha;[Lii;IIIII[BIII)V", line = 305)
    public final void method1392(class63 arg0, class580[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9, int arg10) {
        try {
            ++field2151;
            if (arg4 == 2) {
                class176 var12 = new class176(arg7);
                int var13 = -1;
                while (true) {
                    int var14 = var12.method1649((byte) 73);
                    if (~var14 == -1) {
                        return;
                    }
                    var13 += var14;
                    int var15 = 0;
                    while (true) {
                        int var16 = var12.method1660(false);
                        if (~var16 == -1) {
                            break;
                        }
                        var15 += var16 - 1;
                        int var17 = var15 & 63;
                        int var18 = var15 >> 6 & 63;
                        int var19 = var15 >> 12;
                        int var20 = var12.method1645((byte) -108);
                        int var21 = var20 >> 2;
                        int var22 = var20 & 3;
                        if (~arg6 == ~var19 && arg10 <= var18 && ~(arg10 + 8) < ~var18 && ~var17 <= ~arg5 && ~var17 > ~(arg5 + 8)) {
                            class362 var23 = class370.field5999.method4002(117, var13);
                            int var24 = class79.method822(arg9, var22, 97, var18 & 7, var17 & 7, var23.field5842, var23.field5894) + arg3;
                            int var25 = arg8 + class173.method1597(var22, var17 & 7, var23.field5894, var18 & 7, var23.field5842, 23055, arg9);
                            if (~var24 < -1 && var25 > 0 && ~var24 > ~(super.field10725 + -1) && var25 < super.field10727 + -1) {
                                class580 var26 = null;
                                if (!super.field10721) {
                                    int var27 = arg2;
                                    if ((2 & class224.field3519[1][var24][var25]) == 2) {
                                        var27 = arg2 - 1;
                                    }
                                    if (~var27 <= -1) {
                                        var26 = arg1[var27];
                                    }
                                }
                                this.method1397((byte) -97, arg0, var13, var21, 3 & var22 - -arg9, -1, arg2, arg2, var25, var24, var26);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var29) {
            throw class590.method4333(var29, field2154[11] + (arg0 != null ? field2154[1] : field2154[0]) + ',' + (arg1 != null ? field2154[1] : field2154[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field2154[1] : field2154[0]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILha;Z)V", line = 392)
    public final void method1393(int arg0, class63 arg1, boolean arg2) {
        try {
            if (arg0 != -9) {
                this.method1397((byte) -6, (class63) null, 126, -126, 60, -64, -106, -37, 82, 105, (class580) null);
            }
            class393.method3193();
            ++field2143;
            if (!arg2) {
                if (super.field10717 > 1) {
                    for (int var4 = 0; super.field10725 > var4; ++var4) {
                        for (int var5 = 0; super.field10727 > var5; ++var5) {
                            if ((class224.field3519[1][var4][var5] & 2) == 2) {
                                class652.method4751(var4, var5);
                            }
                        }
                    }
                }
                for (int var6 = 0; var6 < super.field10717; ++var6) {
                    for (int var7 = 0; ~var7 >= ~super.field10727; ++var7) {
                        for (int var8 = 0; super.field10725 >= var8; ++var8) {
                            if ((super.field10745[var6][var8][var7] & 4) != 0) {
                                int var9 = var8;
                                int var10 = var8;
                                int var11 = var7;
                                int var12 = var7;
                                while (var11 > 0 && ~(super.field10745[var6][var8][var11 + -1] & 4) != -1 && -var11 + var12 < 10) {
                                    --var11;
                                }
                                while (~var12 > ~super.field10727 && ~(super.field10745[var6][var8][var12 + 1] & 4) != -1 && ~(-var11 + var12) > -11) {
                                    ++var12;
                                }
                                label150: while (~var9 < -1 && ~(-var9 + var10) > -11) {
                                    for (int var13 = var11; ~var12 <= ~var13; ++var13) {
                                        if (~(super.field10745[var6][var9 + -1][var13] & 4) == -1) {
                                            break label150;
                                        }
                                    }
                                    --var9;
                                }
                                label137: while (~super.field10725 < ~var10 && ~(-var9 + var10) > -11) {
                                    for (int var14 = var11; var12 >= var14; ++var14) {
                                        if ((4 & super.field10745[var6][var10 + 1][var14]) == 0) {
                                            break label137;
                                        }
                                    }
                                    ++var10;
                                }
                                if ((var12 - (var11 - 1)) * (-var9 + var10 + 1) >= 4) {
                                    int var15 = super.field10741[var6][var9][var11];
                                    class87.method864((var12 << 9) + 512, var15, var11 << 9, 4, 119, var15, var9 << 9, (var10 << 9) + 512, var6);
                                    for (int var16 = var9; ~var10 <= ~var16; ++var16) {
                                        for (int var17 = var11; var12 >= var17; ++var17) {
                                            super.field10745[var6][var16][var17] = (byte) class292.method2485(super.field10745[var6][var16][var17], -5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class711.method5163(true);
            }
            super.field10745 = null;
        } catch (RuntimeException var19) {
            throw class590.method4333(var19, field2154[2] + arg0 + ',' + (arg1 != null ? field2154[1] : field2154[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V", line = 531)
    public static void method1394(boolean arg0) {
        try {
            if (arg0) {
                method1394(true);
            }
            field2141 = null;
            field2145 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2154[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lha;[Lii;BII[B)V", line = 549)
    public final void method1395(class63 arg0, class580[] arg1, byte arg2, int arg3, int arg4, byte[] arg5) {
        try {
            ++field2142;
            class176 var7 = new class176(arg5);
            if (arg2 != -103) {
                this.method1396(-58, -9, -118, -81, (class63) null, (class580) null, -103);
            }
            int var8 = -1;
            while (true) {
                int var9 = var7.method1649((byte) 112);
                if (var9 == 0) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.method1660(false);
                    if (~var11 == -1) {
                        break;
                    }
                    var10 += var11 + -1;
                    int var12 = 63 & var10;
                    int var13 = 63 & var10 >> 6;
                    int var14 = var10 >> 12;
                    int var15 = var7.method1645((byte) -74);
                    int var16 = var15 >> 2;
                    int var17 = 3 & var15;
                    int var18 = arg4 + var13;
                    int var19 = arg3 + var12;
                    if (var18 > 0 && var19 > 0 && ~var18 > ~(super.field10725 + -1) && var19 < super.field10727 - 1) {
                        class580 var20 = null;
                        if (!super.field10721) {
                            int var21 = var14;
                            if (~(class224.field3519[1][var18][var19] & 2) == -3) {
                                var21 = var14 - 1;
                            }
                            if (~var21 <= -1) {
                                var20 = arg1[var21];
                            }
                        }
                        this.method1397((byte) -114, arg0, var8, var16, var17, -1, var14, var14, var19, var18, var20);
                    }
                }
            }
        } catch (RuntimeException var23) {
            throw class590.method4333(var23, field2154[10] + (arg0 != null ? field2154[1] : field2154[0]) + ',' + (arg1 != null ? field2154[1] : field2154[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field2154[1] : field2154[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIILha;Lii;I)V", line = 624)
    public final void method1396(int arg0, int arg1, int arg2, int arg3, class63 arg4, class580 arg5, int arg6) {
        try {
            ++field2150;
            class3 var8 = this.method1399(arg6, (byte) 125, arg2, arg0, arg3);
            if (arg1 == 18879) {
                if (var8 != null) {
                    class362 var9 = class370.field5999.method4002(arg1 + -18753, var8.method32((byte) -95));
                    int var10 = var8.method34(16388);
                    int var11 = var8.method35((byte) -55);
                    if (var9.method2988(-150)) {
                        class578.method4234((byte) -102, arg0, arg3, var9, arg2);
                    }
                    if (var8.method33((byte) -12)) {
                        var8.method31(-27998, arg4);
                    }
                    if (arg6 != 0) {
                        if (~arg6 == -2) {
                            class312.method2676(arg2, arg3, arg0);
                            return;
                        }
                        if (~arg6 == -3) {
                            class324.method2753(arg2, arg3, arg0, field2153 != null ? field2153 : (field2153 = method1400(field2154[7])));
                            if (var9.field5916 != 0 && ~super.field10725 < ~(arg3 - -var9.field5842) && super.field10727 > var9.field5842 + arg0 && var9.field5894 + arg3 < super.field10725 && super.field10727 > var9.field5894 + arg0) {
                                arg5.method4260(arg0, var9.field5914, var9.field5894, var9.field5842, -15, var11, arg3, !var9.field5862);
                            }
                            if (~var10 == -10) {
                                if ((var11 & 1) != 0) {
                                    class413.method3302(28131, arg2, arg0, arg3, 16);
                                    return;
                                }
                                class413.method3302(arg1 ^ 9308, arg2, arg0, arg3, 8);
                                return;
                            }
                            return;
                        }
                        if (arg6 == 3) {
                            class199.method1820(arg2, arg3, arg0);
                            if (var9.field5916 == 1) {
                                arg5.method4246(arg0, arg3, (byte) 38);
                                return;
                            }
                        }
                    } else {
                        class182.method1714(arg2, arg3, arg0);
                        if (var9.field5916 != 0) {
                            arg5.method4249(arg3, false, var9.field5914, var10, arg0, var11, !var9.field5862);
                        }
                        if (var9.field5880 != 1) {
                            return;
                        }
                        if (var11 != 0) {
                            if (~var11 != -2) {
                                if (~var11 != -3) {
                                    if (~var11 == -4) {
                                        class413.method3302(28131, arg2, arg0, arg3, 2);
                                        return;
                                    }
                                } else {
                                    class413.method3302(arg1 + 9252, arg2, arg0, arg3 + 1, 1);
                                }
                                return;
                            }
                            class413.method3302(28131, arg2, arg0 + 1, arg3, 2);
                            return;
                        }
                        class413.method3302(28131, arg2, arg0, arg3, 1);
                    }
                }
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field2154[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2154[1] : field2154[0]) + ',' + (arg5 != null ? field2154[1] : field2154[0]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLha;IIIIIIIILii;)V", line = 718)
    public final void method1397(byte arg0, class63 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class580 arg10) {
        try {
            ++field2152;
            if (~class623.field8996.field6356.method4838(true) != -1 || class223.method1962(arg7, 79, class262.field4264, arg8, arg9)) {
                if (arg0 > -92) {
                    field2145 = null;
                }
                if (arg6 < this.field2144) {
                    this.field2144 = arg6;
                }
                class362 var12 = class370.field5999.method4002(-85, arg2);
                if (~class623.field8996.field6363.method1140(true) != -1 || !var12.field5863) {
                    int var13;
                    int var14;
                    if (arg4 != 1 && ~arg4 != -4) {
                        var13 = var12.field5842;
                        var14 = var12.field5894;
                    } else {
                        var13 = var12.field5894;
                        var14 = var12.field5842;
                    }
                    int var15;
                    int var16;
                    if (arg9 + var13 > super.field10725) {
                        var15 = arg9 - -1;
                        var16 = arg9;
                    } else {
                        var16 = (var13 >> 1) + arg9;
                        var15 = arg9 - -(var13 + 1 >> 1);
                    }
                    int var17;
                    int var18;
                    if (~(arg8 + var14) >= ~super.field10727) {
                        var17 = (var14 + 1 >> 1) + arg8;
                        var18 = (var14 >> 1) + arg8;
                    } else {
                        var17 = arg8 + 1;
                        var18 = arg8;
                    }
                    class293 var19 = class740.field10902[arg7];
                    int var20 = var19.method2495(var18, 1, var16) + var19.method2495(var18, 1, var15) - (-var19.method2495(var17, 1, var16) - var19.method2495(var17, 1, var15)) >> 2;
                    int var21 = (arg9 << 9) + (var13 << 8);
                    int var22 = (arg8 << 9) + (var14 << 8);
                    boolean var23 = class563.field8190 && !super.field10721 && var12.field5920;
                    if (var12.method2988(-150)) {
                        class615.method4474((class426) null, var12, (byte) -22, arg4, arg6, arg9, (class738) null, arg8);
                    }
                    boolean var24 = ~arg5 == 0 && ~var12.field5912 == 0 && var12.field5854 == null && var12.field5873 == null && !var12.field5882 && !var12.field5925;
                    if (!class42.field475 || (!class417.method3324(arg3, (byte) -25) || ~var12.field5880 == -2) && (!class289.method2436((byte) 85, arg3) || ~var12.field5880 != -1)) {
                        if (~arg3 == -23) {
                            if (class623.field8996.field6371.method3911(true) != 0 || ~var12.field5843 != -1 || var12.field5916 == 1 || var12.field5910) {
                                class513 var26;
                                if (var24) {
                                    class6 var25 = new class6(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, arg4, var23);
                                    if (var25.method33((byte) -12)) {
                                        var25.method29(arg1, 119);
                                    }
                                    var26 = var25;
                                } else {
                                    var26 = new class786(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, arg4, arg5);
                                }
                                class13.method92(arg6, arg9, arg8, var26);
                                if (var12.field5916 == 1 && arg10 != null) {
                                    arg10.method4262(arg8, arg9, 4043);
                                }
                            }
                        } else if (~arg3 != -11 && ~arg3 != -12) {
                            if ((~arg3 > -13 || arg3 > 17) && (arg3 < 18 || ~arg3 < -22)) {
                                if (~arg3 == -1) {
                                    int var35 = var12.field5880;
                                    if (class606.field8732 && var12.field5880 == -1) {
                                        var35 = 1;
                                    }
                                    class350 var36;
                                    if (!var24) {
                                        var36 = new class340(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, arg3, arg4, arg5);
                                    } else {
                                        class121 var37 = new class121(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, arg3, arg4, var23);
                                        var36 = var37;
                                        if (var37.method33((byte) -12)) {
                                            var37.method29(arg1, -44);
                                        }
                                    }
                                    class478.method3650(arg6, arg9, arg8, var36, (class350) null);
                                    if (~arg4 == -1) {
                                        if (class563.field8190 && var12.field5878) {
                                            var19.method706(arg9, arg8, 50);
                                            var19.method706(arg9, arg8 + 1, 50);
                                        }
                                        if (var35 == 1 && !super.field10721) {
                                            class264.method2294(arg8, (byte) 88, var12.field5832, 1, arg9, arg6, var12.field5829);
                                        }
                                    } else if (arg4 != 1) {
                                        if (~arg4 == -3) {
                                            if (class563.field8190 && var12.field5878) {
                                                var19.method706(arg9 + 1, arg8, 50);
                                                var19.method706(arg9 + 1, arg8 + 1, 50);
                                            }
                                            if (var35 == 1 && !super.field10721) {
                                                class264.method2294(arg8, (byte) 119, -var12.field5832, 1, arg9 - -1, arg6, var12.field5829);
                                            }
                                        } else if (arg4 == 3) {
                                            if (class563.field8190 && var12.field5878) {
                                                var19.method706(arg9, arg8, 50);
                                                var19.method706(arg9 + 1, arg8, 50);
                                            }
                                            if (~var35 == -2 && !super.field10721) {
                                                class264.method2294(arg8, (byte) 83, var12.field5832, 2, arg9, arg6, var12.field5829);
                                            }
                                        }
                                    } else {
                                        if (class563.field8190 && var12.field5878) {
                                            var19.method706(arg9, arg8 + 1, 50);
                                            var19.method706(arg9 + 1, arg8 + 1, 50);
                                        }
                                        if (~var35 == -2 && !super.field10721) {
                                            class264.method2294(arg8 + 1, (byte) 115, -var12.field5832, 2, arg9, arg6, var12.field5829);
                                        }
                                    }
                                    if (~var12.field5916 != -1 && arg10 != null) {
                                        arg10.method4258(arg4, var12.field5914, !var12.field5862, -17996, arg3, arg8, arg9);
                                    }
                                    if (~var12.field5838 != -65) {
                                        class28.method282(arg6, arg9, arg8, var12.field5838);
                                    }
                                } else if (~arg3 == -2) {
                                    class350 var38;
                                    if (!var24) {
                                        var38 = new class340(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, arg3, arg4, arg5);
                                    } else {
                                        class121 var39 = new class121(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, arg3, arg4, var23);
                                        var38 = var39;
                                        if (var39.method33((byte) -12)) {
                                            var39.method29(arg1, -104);
                                        }
                                    }
                                    class478.method3650(arg6, arg9, arg8, var38, (class350) null);
                                    if (var12.field5878 && class563.field8190) {
                                        if (arg4 != 0) {
                                            if (~arg4 != -2) {
                                                if (~arg4 != -3) {
                                                    if (~arg4 == -4) {
                                                        var19.method706(arg9, arg8, 50);
                                                    }
                                                } else {
                                                    var19.method706(arg9 + 1, arg8, 50);
                                                }
                                            } else {
                                                var19.method706(arg9 + 1, arg8 + 1, 50);
                                            }
                                        } else {
                                            var19.method706(arg9, arg8 + 1, 50);
                                        }
                                    }
                                    if (~var12.field5916 != -1 && arg10 != null) {
                                        arg10.method4258(arg4, var12.field5914, !var12.field5862, -17996, arg3, arg8, arg9);
                                    }
                                } else if (arg3 == 2) {
                                    int var40 = 3 & arg4 + 1;
                                    class350 var41;
                                    class350 var42;
                                    if (!var24) {
                                        var41 = new class340(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, arg3, arg4 + 4, arg5);
                                        var42 = new class340(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, arg3, var40, arg5);
                                    } else {
                                        class121 var43 = new class121(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, arg3, arg4 - -4, var23);
                                        class121 var44 = new class121(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, arg3, var40, var23);
                                        if (var43.method33((byte) -12)) {
                                            var43.method29(arg1, -68);
                                        }
                                        var41 = var43;
                                        if (var44.method33((byte) -12)) {
                                            var44.method29(arg1, -59);
                                        }
                                        var42 = var44;
                                    }
                                    class478.method3650(arg6, arg9, arg8, var41, var42);
                                    if ((var12.field5880 == 1 || class606.field8732 && ~var12.field5880 == 0) && !super.field10721) {
                                        if (arg4 == 0) {
                                            class264.method2294(arg8, (byte) 95, var12.field5832, 1, arg9, arg6, var12.field5829);
                                            class264.method2294(arg8 + 1, (byte) 123, var12.field5832, 2, arg9, arg6, var12.field5829);
                                        } else if (arg4 != 1) {
                                            if (~arg4 == -3) {
                                                class264.method2294(arg8, (byte) 121, var12.field5832, 1, arg9 + 1, arg6, var12.field5829);
                                                class264.method2294(arg8, (byte) 113, var12.field5832, 2, arg9, arg6, var12.field5829);
                                            } else if (~arg4 == -4) {
                                                class264.method2294(arg8, (byte) 108, var12.field5832, 1, arg9, arg6, var12.field5829);
                                                class264.method2294(arg8, (byte) 122, var12.field5832, 2, arg9, arg6, var12.field5829);
                                            }
                                        } else {
                                            class264.method2294(arg8, (byte) 75, var12.field5832, 1, arg9 + 1, arg6, var12.field5829);
                                            class264.method2294(arg8 + 1, (byte) 89, var12.field5832, 2, arg9, arg6, var12.field5829);
                                        }
                                    }
                                    if (var12.field5916 != 0 && arg10 != null) {
                                        arg10.method4258(arg4, var12.field5914, !var12.field5862, -17996, arg3, arg8, arg9);
                                    }
                                    if (var12.field5838 != 64) {
                                        class28.method282(arg6, arg9, arg8, var12.field5838);
                                    }
                                } else if (arg3 == 3) {
                                    class350 var46;
                                    if (var24) {
                                        class121 var45 = new class121(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, arg3, arg4, var23);
                                        var46 = var45;
                                        if (var45.method33((byte) -12)) {
                                            var45.method29(arg1, 88);
                                        }
                                    } else {
                                        var46 = new class340(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, arg3, arg4, arg5);
                                    }
                                    class478.method3650(arg6, arg9, arg8, var46, (class350) null);
                                    if (var12.field5878 && class563.field8190) {
                                        if (~arg4 != -1) {
                                            if (~arg4 == -2) {
                                                var19.method706(arg9 + 1, arg8 - -1, 50);
                                            } else if (~arg4 == -3) {
                                                var19.method706(arg9 + 1, arg8, 50);
                                            } else if (arg4 == 3) {
                                                var19.method706(arg9, arg8, 50);
                                            }
                                        } else {
                                            var19.method706(arg9, arg8 - -1, 50);
                                        }
                                    }
                                    if (~var12.field5916 != -1 && arg10 != null) {
                                        arg10.method4258(arg4, var12.field5914, !var12.field5862, -17996, arg3, arg8, arg9);
                                    }
                                } else if (~arg3 == -10) {
                                    class185 var47;
                                    if (!var24) {
                                        var47 = new class62(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, arg9, var13 - 1 + arg9, arg8, arg8 + var14 + -1, arg3, arg4, arg5);
                                    } else {
                                        class596 var48 = new class596(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, arg9, arg9, arg8, arg8, arg3, arg4, var23);
                                        if (var48.method33((byte) -12)) {
                                            var48.method29(arg1, -69);
                                        }
                                        var47 = var48;
                                    }
                                    class146.method1340(var47, false);
                                    if (~var12.field5880 == -2 && !super.field10721) {
                                        byte var49;
                                        if ((arg4 & 1) != 0) {
                                            var49 = 16;
                                        } else {
                                            var49 = 8;
                                        }
                                        class264.method2294(arg8, (byte) 104, 0, var49, arg9, arg6, var12.field5829);
                                    }
                                    if (~var12.field5916 != -1 && arg10 != null) {
                                        arg10.method4253(arg9, (byte) -13, var14, !var12.field5862, arg8, var12.field5914, var13);
                                    }
                                    if (var12.field5838 != 64) {
                                        class28.method282(arg6, arg9, arg8, var12.field5838);
                                    }
                                } else if (arg3 == 4) {
                                    class438 var50;
                                    if (!var24) {
                                        var50 = new class271(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, 0, 0, arg3, arg4, arg5);
                                    } else {
                                        class194 var51 = new class194(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, 0, 0, arg3, arg4);
                                        if (var51.method33((byte) -12)) {
                                            var51.method29(arg1, -48);
                                        }
                                        var50 = var51;
                                    }
                                    class490.method3717(arg6, arg9, arg8, var50, (class438) null);
                                } else if (~arg3 == -6) {
                                    int var52 = 65;
                                    class3 var53 = (class3) class244.method2102(arg6, arg9, arg8);
                                    if (var53 != null) {
                                        var52 = class370.field5999.method4002(112, var53.method32((byte) -95)).field5838 + 1;
                                    }
                                    class438 var55;
                                    if (var24) {
                                        class194 var54 = new class194(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, class86.field1288[arg4] * var52, class57.field710[arg4] * var52, arg3, arg4);
                                        if (var54.method33((byte) -12)) {
                                            var54.method29(arg1, 111);
                                        }
                                        var55 = var54;
                                    } else {
                                        var55 = new class271(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, class86.field1288[arg4] * var52, class57.field710[arg4] * var52, arg3, arg4, arg5);
                                    }
                                    class490.method3717(arg6, arg9, arg8, var55, (class438) null);
                                } else if (~arg3 == -7) {
                                    int var56 = 33;
                                    class3 var57 = (class3) class244.method2102(arg6, arg9, arg8);
                                    if (var57 != null) {
                                        var56 = 1 + class370.field5999.method4002(119, var57.method32((byte) -95)).field5838 / 2;
                                    }
                                    class438 var59;
                                    if (var24) {
                                        class194 var58 = new class194(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, class86.field1288[arg4] * var56, class57.field710[arg4] * var56, arg3, arg4 + 4);
                                        var59 = var58;
                                        if (var58.method33((byte) -12)) {
                                            var58.method29(arg1, 90);
                                        }
                                    } else {
                                        var59 = new class271(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, class83.field1260[arg4] * var56, class608.field8763[arg4] * var56, arg3, arg4 + 4, arg5);
                                    }
                                    class490.method3717(arg6, arg9, arg8, var59, (class438) null);
                                } else if (~arg3 == -8) {
                                    int var60 = arg4 + 2 & 3;
                                    class438 var62;
                                    if (var24) {
                                        class194 var61 = new class194(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, 0, 0, arg3, var60 + 4);
                                        if (var61.method33((byte) -12)) {
                                            var61.method29(arg1, -98);
                                        }
                                        var62 = var61;
                                    } else {
                                        var62 = new class271(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, 0, 0, arg3, var60 + 4, arg5);
                                    }
                                    class490.method3717(arg6, arg9, arg8, var62, (class438) null);
                                } else if (~arg3 == -9) {
                                    int var63 = 3 & arg4 + 2;
                                    int var64 = 33;
                                    class3 var65 = (class3) class244.method2102(arg6, arg9, arg8);
                                    if (var65 != null) {
                                        var64 = 1 + class370.field5999.method4002(-67, var65.method32((byte) -95)).field5838 / 2;
                                    }
                                    class438 var68;
                                    class438 var69;
                                    if (var24) {
                                        class194 var66 = new class194(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, class83.field1260[arg4] * var64, class608.field8763[arg4] * var64, arg3, arg4 + 4);
                                        class194 var67 = new class194(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, 0, 0, arg3, var63 + 4);
                                        if (var66.method33((byte) -12)) {
                                            var66.method29(arg1, -59);
                                        }
                                        var68 = var67;
                                        var69 = var66;
                                        if (var67.method33((byte) -12)) {
                                            var67.method29(arg1, -92);
                                        }
                                    } else {
                                        class271 var70 = new class271(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, class83.field1260[arg4] * var64, class608.field8763[arg4] * var64, arg3, arg4 + 4, arg5);
                                        var69 = var70;
                                        class271 var71 = new class271(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, 0, 0, arg3, var63 - -4, arg5);
                                        var68 = var71;
                                    }
                                    class490.method3717(arg6, arg9, arg8, var69, var68);
                                }
                            } else {
                                class185 var33;
                                if (!var24) {
                                    var33 = new class62(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, arg9, var13 + -1 + arg9, arg8, arg8 - (-var14 - -1), arg3, arg4, arg5);
                                } else {
                                    class596 var34 = new class596(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, arg9, arg9 - -var13 + -1, arg8, arg8 + var14 + -1, arg3, arg4, var23);
                                    var33 = var34;
                                    if (var34.method33((byte) -12)) {
                                        var34.method29(arg1, 95);
                                    }
                                }
                                class146.method1340(var33, false);
                                if (class563.field8190 && !super.field10721 && ~arg3 <= -13 && arg3 <= 17 && arg3 != 13 && arg6 > 0 && var12.field5880 != 0) {
                                    super.field10745[arg6][arg9][arg8] = (byte) class553.method4099(super.field10745[arg6][arg9][arg8], 4);
                                }
                                if (var12.field5916 != 0 && arg10 != null) {
                                    arg10.method4253(arg9, (byte) -13, var14, !var12.field5862, arg8, var12.field5914, var13);
                                }
                            }
                        } else {
                            class596 var27 = null;
                            class185 var28;
                            int var29;
                            if (!var24) {
                                var28 = new class62(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, arg9, arg9 + var13 - 1, arg8, arg8 - -var14 + -1, arg3, arg4, arg5);
                                var29 = 15;
                            } else {
                                class596 var30 = new class596(arg1, var12, arg6, arg7, var21, var20, var22, super.field10721, arg9, arg9 + -1 - -var13, arg8, arg8 + var14 + -1, arg3, arg4, var23);
                                var28 = var30;
                                var27 = var30;
                                var29 = var30.method4361((byte) 0);
                            }
                            if (class146.method1340(var28, false)) {
                                if (var27 != null && var27.method33((byte) -12)) {
                                    var27.method29(arg1, 93);
                                }
                                if (var12.field5878 && class563.field8190) {
                                    if (~var29 < -31) {
                                        var29 = 30;
                                    }
                                    for (int var31 = 0; ~var13 <= ~var31; ++var31) {
                                        for (int var32 = 0; ~var14 <= ~var32; ++var32) {
                                            var19.method706(arg9 - -var31, arg8 + var32, var29);
                                        }
                                    }
                                }
                            }
                            if (var12.field5916 != 0 && arg10 != null) {
                                arg10.method4253(arg9, (byte) -13, var14, !var12.field5862, arg8, var12.field5914, var13);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var73) {
            throw class590.method4333(var73, field2154[4] + arg0 + ',' + (arg1 != null ? field2154[1] : field2154[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field2154[1] : field2154[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILwq;[ILha;BI)V", line = 1350)
    public final void method1398(int arg0, class176 arg1, int[] arg2, class63 arg3, byte arg4, int arg5) {
        try {
            ++field2148;
            if (!super.field10721) {
                boolean var7 = false;
                class758 var8 = null;
                if (arg2 != null) {
                    arg2[0] = -1;
                }
                int var9 = 118 / ((arg4 - 29) / 39);
                while (true) {
                    int var11;
                    label375: do {
                        while (true) {
                            while (~arg1.field2799 > ~arg1.field2805.length) {
                                int var10 = arg1.method1645((byte) -128);
                                if (~var10 != -1) {
                                    if (var10 == 1) {
                                        var11 = arg1.method1645((byte) -70);
                                        continue label375;
                                    }
                                    if (~var10 == -3) {
                                        if (var8 == null) {
                                            var8 = new class758();
                                        }
                                        var8.method5479(arg1, (byte) -22);
                                    } else if (~var10 == -129) {
                                        if (arg2 == null) {
                                            arg1.field2799 += 10;
                                        } else {
                                            arg2[0] = arg1.method1687((byte) -102);
                                            arg2[1] = arg1.method1657(106);
                                            arg2[2] = arg1.method1657(91);
                                            arg2[3] = arg1.method1657(122);
                                            arg2[4] = arg1.method1687((byte) -41);
                                        }
                                    } else {
                                        if (~var10 != -130) {
                                            throw new IllegalStateException("");
                                        }
                                        if (super.field10739 == null) {
                                            super.field10739 = new byte[4][][];
                                        }
                                        for (int var20 = 0; ~var20 > -5; ++var20) {
                                            byte var21 = arg1.method1672(127);
                                            if (var21 == 0 && super.field10739[var20] != null) {
                                                int var31 = arg0;
                                                int var32 = arg0 + 64;
                                                int var33 = arg5;
                                                if (~arg5 <= -1) {
                                                    if (arg5 >= super.field10727) {
                                                        var33 = super.field10727;
                                                    }
                                                } else {
                                                    var33 = 0;
                                                }
                                                int var34 = arg5 + 64;
                                                if (~arg0 <= -1) {
                                                    if (arg0 >= super.field10725) {
                                                        var31 = super.field10725;
                                                    }
                                                } else {
                                                    var31 = 0;
                                                }
                                                if (~var32 <= -1) {
                                                    if (var32 >= super.field10725) {
                                                        var32 = super.field10725;
                                                    }
                                                } else {
                                                    var32 = 0;
                                                }
                                                if (~var34 <= -1) {
                                                    if (~var34 <= ~super.field10727) {
                                                        var34 = super.field10727;
                                                    }
                                                } else {
                                                    var34 = 0;
                                                }
                                                while (var31 < var32) {
                                                    while (var34 > var33) {
                                                        super.field10739[var20][var31][var33] = 0;
                                                        ++var33;
                                                    }
                                                    ++var31;
                                                }
                                            } else if (~var21 != -2) {
                                                if (var21 == 2) {
                                                    if (super.field10739[var20] == null) {
                                                        super.field10739[var20] = new byte[super.field10725 - -1][super.field10727 + 1];
                                                    }
                                                    if (var20 > 0) {
                                                        int var22 = arg0;
                                                        int var23 = arg0 + 64;
                                                        int var24 = arg5;
                                                        int var25 = arg5 + 64;
                                                        if (~arg0 <= -1) {
                                                            if (~super.field10725 >= ~arg0) {
                                                                var22 = super.field10725;
                                                            }
                                                        } else {
                                                            var22 = 0;
                                                        }
                                                        if (var23 < 0) {
                                                            var23 = 0;
                                                        } else if (super.field10725 <= var23) {
                                                            var23 = super.field10725;
                                                        }
                                                        if (arg5 >= 0) {
                                                            if (~arg5 <= ~super.field10727) {
                                                                var24 = super.field10727;
                                                            }
                                                        } else {
                                                            var24 = 0;
                                                        }
                                                        if (~var25 > -1) {
                                                            var25 = 0;
                                                        } else if (~var25 <= ~super.field10727) {
                                                            var25 = super.field10727;
                                                        }
                                                        while (var23 > var22) {
                                                            while (var24 < var25) {
                                                                super.field10739[var20][var22][var24] = super.field10739[var20 + -1][var22][var24];
                                                                ++var24;
                                                            }
                                                            ++var22;
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (super.field10739[var20] == null) {
                                                    super.field10739[var20] = new byte[super.field10725 + 1][super.field10727 + 1];
                                                }
                                                for (int var26 = 0; var26 < 64; var26 += 4) {
                                                    for (int var27 = 0; var27 < 64; var27 += 4) {
                                                        byte var28 = arg1.method1672(-51);
                                                        for (int var29 = var26 - -arg0; var29 < var26 + 4 + arg0; ++var29) {
                                                            for (int var30 = arg5 + var27; arg5 + var27 + 4 > var30; ++var30) {
                                                                if (~var29 <= -1 && ~super.field10725 < ~var29 && var30 >= 0 && var30 < super.field10727) {
                                                                    super.field10739[var20][var29][var30] = var28;
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
                                    var8 = new class758(arg1);
                                }
                            }
                            if (var8 != null) {
                                for (int var35 = 0; ~var35 > -9; ++var35) {
                                    for (int var36 = 0; ~var36 > -9; ++var36) {
                                        int var37 = (arg0 >> 3) + var35;
                                        int var38 = (arg5 >> 3) + var36;
                                        if (~var37 <= -1 && ~var37 > ~(super.field10725 >> 3) && var38 >= 0 && ~(super.field10727 >> 3) < ~var38) {
                                            class705.method5126(-5327, var8, var38, var37);
                                        }
                                    }
                                }
                            }
                            if (!var7 && super.field10739 != null) {
                                for (int var39 = 0; ~var39 > -5; ++var39) {
                                    if (super.field10739[var39] != null) {
                                        for (int var40 = 0; var40 < 16; ++var40) {
                                            for (int var41 = 0; ~var41 > -17; ++var41) {
                                                int var42 = (arg0 >> 2) - -var40;
                                                int var43 = (arg5 >> 2) + var41;
                                                if (~var42 <= -1 && var42 < 26 && ~var43 <= -1 && var43 < 26) {
                                                    super.field10739[var39][var42][var43] = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                                return;
                            }
                            return;
                        }
                    } while (~var11 >= -1);
                    for (int var12 = 0; ~var11 < ~var12; ++var12) {
                        class610 var13 = new class610(arg3, arg1, 2);
                        if (var13.field8784 == 31) {
                            class145 var14 = class199.field3154.method5690((byte) 43, arg1.method1687((byte) -114));
                            var13.method4450(var14.field2052, 10, var14.field2055, var14.field2050, var14.field2047);
                        }
                        if (~arg3.method177() < -1) {
                            class731 var15 = var13.field8782;
                            int var16 = var15.method5300(32) - -(arg0 << 9);
                            int var17 = (arg5 << 9) + var15.method5298(-4);
                            int var18 = var16 >> 9;
                            int var19 = var17 >> 9;
                            if (~var18 <= -1 && var19 >= 0 && ~super.field10725 < ~var18 && ~var19 > ~super.field10727) {
                                var15.method1254(var16, 64, super.field10741[var13.field8793][var18][var19] - var15.method5297(false), var17);
                                class543.method4040(var13);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var45) {
            throw class590.method4333(var45, field2154[9] + arg0 + ',' + (arg1 != null ? field2154[1] : field2154[0]) + ',' + (arg2 != null ? field2154[1] : field2154[0]) + ',' + (arg3 != null ? field2154[1] : field2154[0]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBIII)Ldp;", line = 1716)
    public final class3 method1399(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        try {
            ++field2146;
            class3 var6 = null;
            if (arg1 < 9) {
                field2149 = -86;
            }
            if (arg0 == 0) {
                var6 = (class3) class244.method2102(arg2, arg4, arg3);
            }
            if (arg0 == 1) {
                var6 = (class3) class479.method3658(arg2, arg4, arg3);
            }
            if (~arg0 == -3) {
                var6 = (class3) class59.method614(arg2, arg4, arg3, field2153 != null ? field2153 : (field2153 = method1400(field2154[7])));
            }
            if (~arg0 == -4) {
                var6 = (class3) class605.method4422(arg2, arg4, arg3);
            }
            return var6;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2154[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1401(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 89);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1402(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 82;
                    break;
                case 1:
                    var10005 = 60;
                    break;
                case 2:
                    var10005 = 103;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
