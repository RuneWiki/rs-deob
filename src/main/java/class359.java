import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class359 extends class623 {

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public int field5209 = 99;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "Lnj;")
    public static class487 field5212 = new class487("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "[Z")
    public static boolean[] field5215 = new boolean[100];

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field5214 = 0;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public static int field5213;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vc", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field5216;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I[B[Lgea;IILqa;IIIII)V")
    public final void method2202(int arg0, byte[] arg1, class82[] arg2, int arg3, int arg4, class167 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field5211;
        class428 var12 = new class428(arg1);
        if (arg10 <= 55) {
            this.method2206(110, -118, (class82) null, 25, -120, 111, (class167) null);
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method2602(25);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2573(-14319);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = 63 & var15;
                int var18 = (var15 & 4035) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method2561((byte) 127);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (arg0 == var19 && arg3 <= var18 && ~var18 > ~(arg3 + 8) && var17 >= arg8 && ~var17 > ~(arg8 + 8)) {
                    class158 var23 = class312.field4690.method2004(false, var13);
                    int var24 = arg9 - -class261.method1664(arg6, -256, var23.field2014, 7 & var18, var17 & 7, var22, var23.field2017);
                    int var25 = arg7 + class510.method3044(var22, var17 & 7, var23.field2017, var23.field2014, arg6, (byte) -45, 7 & var18);
                    if (var24 > 0 && var25 > 0 && var24 < super.field9139 + -1 && ~var25 > ~(super.field9125 + -1)) {
                        class82 var26 = null;
                        if (!super.field9135) {
                            int var27 = arg4;
                            if ((2 & class237.field3473[1][var24][var25]) == 2) {
                                var27 = arg4 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg2[var27];
                            }
                        }
                        this.method2208(arg5, var25, 3 & arg6 + var22, var21, var24, 0, arg4, arg4, var13, var26, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
    public static void method2203(boolean arg0) {
        if (!arg0) {
            method2203(true);
        }
        field5212 = null;
        field5215 = null;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(IIIZ)V")
    public class359(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class636.field9264, class264.field3924);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I[BIILqa;[Lgea;)V")
    public final void method2204(int arg0, byte[] arg1, int arg2, int arg3, class167 arg4, class82[] arg5) {
        ++field5207;
        int var7 = 65 % ((arg3 - 26) / 40);
        class428 var8 = new class428(arg1);
        int var9 = -1;
        while (true) {
            int var10 = var8.method2602(-115);
            if (~var10 == -1) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var8.method2573(-14319);
                if (~var12 == -1) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 63;
                int var14 = (var11 & 4037) >> 6;
                int var15 = var11 >> 12;
                int var16 = var8.method2561((byte) 119);
                int var17 = var16 >> 2;
                int var18 = var16 & 3;
                int var19 = arg2 + var14;
                int var20 = arg0 + var13;
                if (~var19 < -1 && var20 > 0 && ~(super.field9139 + -1) < ~var19 && var20 < super.field9125 + -1) {
                    class82 var21 = null;
                    if (!super.field9135) {
                        int var22 = var15;
                        if ((class237.field3473[1][var19][var20] & 2) == 2) {
                            var22 = var15 - 1;
                        }
                        if (~var22 <= -1) {
                            var21 = arg5[var22];
                        }
                    }
                    this.method2208(arg4, var20, var18, var17, var19, 0, var15, var15, var9, var21, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILqa;IIII[IILps;IZ)V")
    public final void method2205(int arg0, class167 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, class428 arg8, int arg9, boolean arg10) {
        ++field5210;
        if (!super.field9135) {
            class278 var13 = null;
            if (arg6 != null) {
                arg6[0] = -1;
            }
            int var14 = (arg9 & 7) * 8;
            int var15 = (7 & arg3) * 8;
            while (true) {
                while (~arg8.field6221 > ~arg8.field6162.length) {
                    int var20 = arg8.method2561((byte) -102);
                    if (var20 == 0) {
                        var13 = new class278(arg8);
                    } else if (~var20 == -2) {
                        int var34 = arg8.method2561((byte) -123);
                        if (~var34 < -1) {
                            for (int var35 = 0; ~var34 < ~var35; ++var35) {
                                class323 var36 = new class323(arg1, arg8, 0);
                                if (~var36.field4790 == -32) {
                                    class390 var37 = class191.field2897.method2920(arg8.method2620(115), true);
                                    var36.method2023(var37.field5684, -92, var37.field5689, var37.field5683, var37.field5693);
                                }
                                if (~arg1.method994() < -1) {
                                    class535 var38 = var36.field4799;
                                    int var39 = var38.method3151(-42) >> 7;
                                    int var40 = var38.method3143(-118) >> 7;
                                    if (var36.field4791 == arg2 && ~var14 >= ~var39 && ~(var14 - -8) < ~var39 && ~var15 >= ~var40 && var40 < var15 + 8) {
                                        int var41 = class14.method60(arg5, var38.method3151(-55) & 1023, var38.method3143(-124) & 1023, (byte) -124) + (arg7 << 7);
                                        int var42 = var41 >> 7;
                                        int var43 = (arg4 << 7) + class508.method3037(arg5, (byte) 105, var38.method3143(-98) & 1023, var38.method3151(-92) & 1023);
                                        int var44 = var43 >> 7;
                                        if (~var42 <= -1 && var44 >= 0 && ~super.field9139 < ~var42 && super.field9125 > var44) {
                                            var38.method93(-1, var41, var43, super.field9138[arg2][var42][var44] + -var38.method3150(2));
                                            class259.method1637(var36);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2) {
                        if (var13 == null) {
                            var13 = new class278();
                        }
                        var13.method1755(arg8, 8);
                    } else if (var20 == 128) {
                        if (arg6 == null) {
                            arg8.field6221 += 10;
                        } else {
                            arg6[0] = arg8.method2620(30);
                            arg6[1] = arg8.method2622((byte) 126);
                            arg6[2] = arg8.method2622((byte) 126);
                            arg6[3] = arg8.method2622((byte) 125);
                            arg6[4] = arg8.method2620(97);
                        }
                    } else {
                        if (var20 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field9136 == null) {
                            super.field9136 = new byte[4][][];
                        }
                        for (int var21 = 0; var21 < 4; ++var21) {
                            byte var22 = arg8.method2570((byte) 57);
                            if (~var22 == -1 && super.field9136[arg0] != null) {
                                if (arg2 >= var21) {
                                    int var23 = arg7;
                                    int var24 = arg7 + 7;
                                    int var25 = arg4;
                                    if (~arg4 > -1) {
                                        var25 = 0;
                                    } else if (~arg4 <= ~super.field9125) {
                                        var25 = super.field9125;
                                    }
                                    int var26 = arg4 - -7;
                                    if (~arg7 <= -1) {
                                        if (super.field9139 <= arg7) {
                                            var23 = super.field9139;
                                        }
                                    } else {
                                        var23 = 0;
                                    }
                                    if (var24 >= 0) {
                                        if (super.field9139 <= var24) {
                                            var24 = super.field9139;
                                        }
                                    } else {
                                        var24 = 0;
                                    }
                                    if (~var26 <= -1) {
                                        if (var26 >= super.field9125) {
                                            var26 = super.field9125;
                                        }
                                    } else {
                                        var26 = 0;
                                    }
                                    while (~var23 > ~var24) {
                                        while (~var26 < ~var25) {
                                            super.field9136[arg0][var23][var25] = 0;
                                            ++var25;
                                        }
                                        ++var23;
                                    }
                                }
                            } else if (~var22 == -2) {
                                if (super.field9136[arg0] == null) {
                                    super.field9136[arg0] = new byte[super.field9139 + 1][super.field9125 + 1];
                                }
                                for (int var27 = 0; ~var27 > -65; var27 += 4) {
                                    for (int var28 = 0; ~var28 > -65; var28 += 4) {
                                        byte var29 = arg8.method2570((byte) 57);
                                        if (~arg2 <= ~var21) {
                                            for (int var30 = var27; var30 < var27 - -4; ++var30) {
                                                for (int var31 = var28; var31 < var28 + 4; ++var31) {
                                                    if (~var14 >= ~var30 && ~var30 > ~(var14 - -8) && var31 >= var15 && var15 + 8 > var15) {
                                                        int var32 = class459.method2739(arg5, 7 & var30, 7 & var31, 3) + arg7;
                                                        int var33 = class77.method451(arg5, 7 & var31, var30 & 7, (byte) 85) + arg4;
                                                        if (~var32 <= -1 && super.field9139 > var32 && ~var33 <= -1 && var33 < super.field9125) {
                                                            super.field9136[arg0][var32][var33] = var29;
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
                    class51.method266(var13, arg7 >> 3, arg4 >> 3, (byte) 118);
                }
                if (!arg10 && super.field9136 != null && super.field9136[arg0] != null) {
                    int var16 = arg7 + 7;
                    int var17 = arg4 - -7;
                    for (int var18 = arg7; var16 > var18; ++var18) {
                        for (int var19 = arg4; var19 < var17; ++var19) {
                            super.field9136[arg0][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILgea;IIILqa;)V")
    public final void method2206(int arg0, int arg1, class82 arg2, int arg3, int arg4, int arg5, class167 arg6) {
        ++field5206;
        class438 var8 = null;
        if (~arg0 == -1) {
            var8 = (class438) class491.method2972(arg3, arg1, arg4);
        }
        if (arg0 == arg5) {
            var8 = (class438) class427.method2549(arg3, arg1, arg4);
        }
        if (arg0 == 2) {
            var8 = (class438) class488.method2956(arg3, arg1, arg4, field5216 != null ? field5216 : (field5216 = method2210("ej")));
        }
        if (arg0 == 3) {
            var8 = (class438) class287.method1784(arg3, arg1, arg4);
        }
        if (var8 != null) {
            class158 var9 = class312.field4690.method2004(false, var8.method173(39));
            int var10 = var8.method171(true);
            int var11 = var8.method170(-5527);
            if (var9.method927(false)) {
                class394.method2374(var9, arg3, 0, arg4, arg1);
            }
            if (var8.method162(-177)) {
                var8.method174(arg6, (byte) 2);
            }
            if (~arg0 != -1) {
                if (~arg0 == -2) {
                    class73 var12 = class427.method2549(arg3, arg1, arg4);
                    if (!(var12 instanceof class50)) {
                        class608.method3537(arg3, arg1, arg4);
                        return;
                    }
                    ((class50) var12).field585 = null;
                    return;
                }
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        class33 var13 = class287.method1784(arg3, arg1, arg4);
                        if (var13 instanceof class46) {
                            ((class46) var13).field538 = null;
                        } else {
                            class228.method1489(arg3, arg1, arg4);
                        }
                        if (var9.field2059 == 1) {
                            arg2.method466(arg4, 127, arg1);
                            return;
                        }
                    }
                    return;
                }
                class237 var14 = class488.method2956(arg3, arg1, arg4, field5216 != null ? field5216 : (field5216 = method2210("ej")));
                if (var14 instanceof class34 && ~var14.field3469 == ~arg1 && var14.field3472 == arg4) {
                    ((class34) var14).field367 = null;
                } else {
                    class452.method2723(arg3, arg1, arg4, field5216 != null ? field5216 : (field5216 = method2210("ej")));
                }
                if (~var9.field2059 != -1 && ~super.field9139 < ~(arg1 - -var9.field2017) && super.field9125 > var9.field2017 + arg4 && var9.field2014 + arg1 < super.field9139 && ~super.field9125 < ~(var9.field2014 + arg4)) {
                    arg2.method475(32405, var11, arg4, arg1, var9.field2014, var9.field2017, var9.field2067, !var9.field2038);
                    return;
                }
                return;
            }
            class578 var15 = class491.method2972(arg3, arg1, arg4);
            if (var15 instanceof class431) {
                ((class431) var15).field6312 = null;
            } else {
                class174.method1130(arg3, arg1, arg4);
            }
            if (~var9.field2059 != -1) {
                arg2.method467(arg4, !var9.field2038, var10, arg1, var9.field2067, var11, (byte) -99);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lqa;I)V")
    public final void method2207(class167 arg0, int arg1) {
        ++field5208;
        class530.method3130(arg0);
        if (~super.field9132 < -2) {
            for (int var3 = 0; var3 < super.field9139; ++var3) {
                for (int var4 = 0; ~super.field9125 < ~var4; ++var4) {
                    if ((class237.field3473[1][var3][var4] & 2) == 2) {
                        class368.method2247(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; super.field9132 > var5; ++var5) {
            for (int var6 = 0; super.field9125 >= var6; ++var6) {
                for (int var7 = 0; ~var7 >= ~super.field9139; ++var7) {
                    if (~(super.field9120[var5][var7][var6] & 1) != -1) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (~var9 > ~super.field9125 && (super.field9120[var5][var7][var9 + 1] & 1) != 0) {
                            ++var9;
                        }
                        while (var8 > 0 && ~(1 & super.field9120[var5][var7][var8 + -1]) != -1) {
                            --var8;
                        }
                        int var11 = var5;
                        label172: while (var10 > 0) {
                            for (int var12 = var8; var12 <= var9; ++var12) {
                                if ((1 & super.field9120[var10 - 1][var7][var12]) == 0) {
                                    break label172;
                                }
                            }
                            --var10;
                        }
                        label161: while (var11 < 3) {
                            for (int var13 = var8; ~var9 <= ~var13; ++var13) {
                                if ((1 & super.field9120[var11 + 1][var7][var13]) == 0) {
                                    break label161;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (var11 + 1 - var10) * (-var8 + var9 + 1);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = super.field9138[var11][var7][var8] - var15;
                            int var17 = super.field9138[var10][var7][var8];
                            class191.method1241(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) - -128, var16, var17);
                            for (int var18 = var10; var18 <= var11; ++var18) {
                                for (int var19 = var8; ~var19 >= ~var9; ++var19) {
                                    super.field9120[var18][var7][var19] = (byte) class637.method3693(super.field9120[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if (~(2 & super.field9120[var5][var7][var6]) != -1) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (~super.field9139 < ~var21 && (2 & super.field9120[var5][var21 - -1][var6]) != 0) {
                            ++var21;
                        }
                        int var23 = var5;
                        while (var20 > 0 && (2 & super.field9120[var5][var20 + -1][var6]) != 0) {
                            --var20;
                        }
                        label226: while (var22 > 0) {
                            for (int var24 = var20; ~var24 >= ~var21; ++var24) {
                                if (~(super.field9120[var22 + -1][var24][var6] & 2) == -1) {
                                    break label226;
                                }
                            }
                            --var22;
                        }
                        label215: while (var23 < 3) {
                            for (int var25 = var20; var21 >= var25; ++var25) {
                                if (~(super.field9120[var23 + 1][var25][var6] & 2) == -1) {
                                    break label215;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (-var20 + 1 + var21) * (var23 + 1 + -var22);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = super.field9138[var23][var20][var6] + -var27;
                            int var29 = super.field9138[var22][var20][var6];
                            class191.method1241(2, var20 << 7, (var21 << 7) - -128, var6 << 7, var6 << 7, var28, var29);
                            for (int var30 = var22; ~var30 >= ~var23; ++var30) {
                                for (int var31 = var20; ~var31 >= ~var21; ++var31) {
                                    super.field9120[var30][var31][var6] = (byte) class637.method3693(super.field9120[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if (~(super.field9120[var5][var7][var6] & 4) != -1) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34;
                        for (var34 = var6; ~var34 < -1 && (super.field9120[var5][var7][var34 - 1] & 4) != 0; --var34) {
                        }
                        int var35;
                        for (var35 = var6; ~super.field9125 < ~var35 && (super.field9120[var5][var7][var35 + 1] & 4) != 0; ++var35) {
                        }
                        label280: while (~var32 < -1) {
                            for (int var36 = var34; ~var35 <= ~var36; ++var36) {
                                if (~(super.field9120[var5][var32 + -1][var36] & 4) == -1) {
                                    break label280;
                                }
                            }
                            --var32;
                        }
                        label269: while (~var33 > ~super.field9139) {
                            for (int var37 = var34; ~var35 <= ~var37; ++var37) {
                                if (~(4 & super.field9120[var5][var33 + 1][var37]) == -1) {
                                    break label269;
                                }
                            }
                            ++var33;
                        }
                        if (~((-var32 + var33 + 1) * (-var34 + var35 + 1)) <= -5) {
                            int var38 = super.field9138[var5][var32][var34];
                            class191.method1241(4, var32 << 7, (var33 << 7) + 128, var34 << 7, (var35 << 7) + 128, var38, var38);
                            for (int var39 = var32; ~var39 >= ~var33; ++var39) {
                                for (int var40 = var34; var40 <= var35; ++var40) {
                                    super.field9120[var5][var39][var40] = (byte) class637.method3693(super.field9120[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != -508390937) {
            this.field5209 = -38;
        }
        super.field9120 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lqa;IIIIIIIILgea;I)V")
    public final void method2208(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class82 arg9, int arg10) {
        ++field5205;
        if (class94.field1158.method2675(arg5 ^ arg5, class239.field3499) || class169.method1076(arg4, arg6, arg1, -15708, class97.field1205)) {
            if (~this.field5209 < ~arg7) {
                this.field5209 = arg7;
            }
            class158 var12 = class312.field4690.method2004(false, arg8);
            if (!arg0.method1012() || !class94.field1158.field262 || !var12.field2091) {
                int var13;
                int var14;
                if (arg2 != 1 && ~arg2 != -4) {
                    var13 = var12.field2017;
                    var14 = var12.field2014;
                } else {
                    var14 = var12.field2017;
                    var13 = var12.field2014;
                }
                int var15;
                int var16;
                if (~(arg4 - -var13) >= ~super.field9139) {
                    var15 = (var13 >> 1) + arg4;
                    var16 = arg4 - -(var13 + 1 >> 1);
                } else {
                    var15 = arg4;
                    var16 = arg4 + 1;
                }
                int var17;
                int var18;
                if (~(arg1 - -var14) >= ~super.field9125) {
                    var17 = (var14 >> 1) + arg1;
                    var18 = arg1 - -(var14 - -1 >> 1);
                } else {
                    var17 = arg1;
                    var18 = arg1 - -1;
                }
                class543 var19 = class235.field3455[arg6];
                int var20 = var19.method1319(var15, var17) + (var19.method1319(var16, var17) - -var19.method1319(var15, var18) - -var19.method1319(var16, var18)) >> 2;
                int var21 = (arg4 << 7) + (var13 << 6);
                int var22 = (arg1 << 7) + (var14 << 6);
                boolean var23 = class336.field4936 && !super.field9135 && var12.field2032;
                if (var12.method927(false)) {
                    class118.method727(arg1, (class179) null, (byte) 67, arg2, var12, arg7, arg4, (class383) null);
                }
                boolean var24 = arg10 == -1 && var12.field2076 == -1 && var12.field2086 == null && var12.field2035 == null && !var12.field2081;
                if (!class177.field2696 || (!class526.method3107(arg3, (byte) 97) || var12.field2015 == 1) && (!class55.method360(arg3, (byte) 80) || ~var12.field2015 != -1)) {
                    if (arg3 == 22) {
                        if (class94.field1158.field268 || var12.field2028 != 0 || var12.field2059 == 1 || var12.field2036) {
                            class33 var26;
                            if (var24) {
                                class187 var25 = new class187(arg0, var12, arg6, var21, var20, var22, super.field9135, arg2, var23);
                                var26 = var25;
                                if (var25.method162(-177)) {
                                    var25.method158(arg0, (byte) -98);
                                }
                            } else {
                                var26 = new class188(arg0, var12, arg7, arg6, var21, var20, var22, super.field9135, arg2, arg10);
                            }
                            class33 var27 = class287.method1784(arg7, arg4, arg1);
                            if (!(var27 instanceof class46)) {
                                class273.method1729(arg7, arg4, arg1, var26);
                            } else {
                                ((class46) var27).field538 = var26;
                            }
                            if (~var12.field2059 == -2 && arg9 != null) {
                                arg9.method478((byte) -120, arg4, arg1);
                            }
                        }
                    } else if (arg3 != 10 && arg3 != 11) {
                        if (~arg3 <= -13 && ~arg3 >= -18 || ~arg3 <= -19 && arg3 <= 21) {
                            class237 var28;
                            if (!var24) {
                                var28 = new class100(arg0, var12, arg7, arg6, var21, var20, var22, super.field9135, arg4, arg4 - (-var13 + 1), arg1, var14 + -1 + arg1, arg3, arg2, arg10);
                            } else {
                                class70 var29 = new class70(arg0, var12, arg7, arg6, var21, var20, var22, super.field9135, arg4, arg4 - 1 + var13, arg1, arg1 - 1 + var14, arg3, arg2, var23);
                                var28 = var29;
                                if (var29.method162(-177)) {
                                    var29.method158(arg0, (byte) -82);
                                }
                            }
                            class237 var30 = class488.method2956(arg7, arg4, arg1, field5216 != null ? field5216 : (field5216 = method2210("ej")));
                            if (var30 instanceof class34 && ~var30.field3469 == ~arg4 && ~var30.field3472 == ~arg1) {
                                ((class34) var30).field367 = var28;
                            } else {
                                class390.method2355(var28, false);
                            }
                            if (class336.field4936 && !super.field9135 && arg3 >= 12 && arg3 <= 17 && ~arg3 != -14 && ~arg7 < -1 && var12.field2015 != 0) {
                                super.field9120[arg7][arg4][arg1] = (byte) class313.method1926(super.field9120[arg7][arg4][arg1], 4);
                            }
                            if (var12.field2059 != 0 && arg9 != null) {
                                arg9.method484(var13, var12.field2067, var14, !var12.field2038, arg5 + -2016, arg1, arg4);
                            }
                        } else if (~arg3 == -1) {
                            int var31 = var12.field2015;
                            if (class235.field3454 && var12.field2015 == -1) {
                                var31 = 1;
                            }
                            class578 var32;
                            if (!var24) {
                                var32 = new class71(arg0, var12, arg7, arg6, var21, var20, var22, super.field9135, arg3, arg2, arg10);
                            } else {
                                class403 var33 = new class403(arg0, var12, arg6, var21, var20, var22, super.field9135, arg3, arg2, var23);
                                if (var33.method162(-177)) {
                                    var33.method158(arg0, (byte) -90);
                                }
                                var32 = var33;
                            }
                            class578 var34 = class491.method2972(arg7, arg4, arg1);
                            if (!(var34 instanceof class431)) {
                                class403.method2414(arg7, arg4, arg1, var32, (class578) null);
                            } else {
                                ((class431) var34).field6312 = var32;
                            }
                            if (class336.field4936) {
                                if (~arg2 == -1) {
                                    if (var12.field2057) {
                                        var19.method1317(arg4, arg1, 50);
                                        var19.method1317(arg4, arg1 + 1, 50);
                                    }
                                    if (var31 == 1 && !super.field9135) {
                                        super.field9120[arg7][arg4][arg1] = (byte) class313.method1926(super.field9120[arg7][arg4][arg1], 1);
                                    }
                                } else if (~arg2 == -2) {
                                    if (var12.field2057) {
                                        var19.method1317(arg4, arg1 + 1, 50);
                                        var19.method1317(arg4 + 1, arg1 - -1, 50);
                                    }
                                    if (var31 == 1 && !super.field9135) {
                                        super.field9120[arg7][arg4][arg1 + 1] = (byte) class313.method1926(super.field9120[arg7][arg4][arg1 + 1], 2);
                                    }
                                } else if (arg2 != 2) {
                                    if (arg2 == 3) {
                                        if (var12.field2057) {
                                            var19.method1317(arg4, arg1, 50);
                                            var19.method1317(arg4 + 1, arg1, 50);
                                        }
                                        if (var31 == 1 && !super.field9135) {
                                            super.field9120[arg7][arg4][arg1] = (byte) class313.method1926(super.field9120[arg7][arg4][arg1], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field2057) {
                                        var19.method1317(arg4 - -1, arg1, 50);
                                        var19.method1317(arg4 + 1, arg1 + 1, 50);
                                    }
                                    if (~var31 == -2 && !super.field9135) {
                                        super.field9120[arg7][arg4 + 1][arg1] = (byte) class313.method1926(super.field9120[arg7][arg4 + 1][arg1], 1);
                                    }
                                }
                            }
                            if (~var12.field2059 != -1 && arg9 != null) {
                                arg9.method477(!var12.field2038, arg4, arg1, arg5 ^ 111, var12.field2067, arg3, arg2);
                            }
                            if (~var12.field2077 != -17) {
                                class20.method92(arg7, arg4, arg1, var12.field2077);
                            }
                        } else if (arg3 == 1) {
                            class578 var35;
                            if (!var24) {
                                var35 = new class71(arg0, var12, arg7, arg6, var21, var20, var22, super.field9135, arg3, arg2, arg10);
                            } else {
                                class403 var36 = new class403(arg0, var12, arg6, var21, var20, var22, super.field9135, arg3, arg2, var23);
                                var35 = var36;
                                if (var36.method162(-177)) {
                                    var36.method158(arg0, (byte) -92);
                                }
                            }
                            class578 var37 = class491.method2972(arg7, arg4, arg1);
                            if (!(var37 instanceof class431)) {
                                class403.method2414(arg7, arg4, arg1, var35, (class578) null);
                            } else {
                                ((class431) var37).field6312 = var35;
                            }
                            if (var12.field2057 && class336.field4936) {
                                if (~arg2 == -1) {
                                    var19.method1317(arg4, arg1 + 1, 50);
                                } else if (arg2 == 1) {
                                    var19.method1317(arg4 + 1, arg1 - -1, 50);
                                } else if (~arg2 != -3) {
                                    if (arg2 == 3) {
                                        var19.method1317(arg4, arg1, 50);
                                    }
                                } else {
                                    var19.method1317(arg4 + 1, arg1, 50);
                                }
                            }
                            if (~var12.field2059 != -1 && arg9 != null) {
                                arg9.method477(!var12.field2038, arg4, arg1, 90, var12.field2067, arg3, arg2);
                            }
                        } else if (arg3 == 2) {
                            int var38 = 3 & arg2 + 1;
                            class578 var39;
                            class578 var40;
                            if (!var24) {
                                var39 = new class71(arg0, var12, arg7, arg6, var21, var20, var22, super.field9135, arg3, arg2 + 4, arg10);
                                var40 = new class71(arg0, var12, arg7, arg6, var21, var20, var22, super.field9135, arg3, var38, arg10);
                            } else {
                                class403 var41 = new class403(arg0, var12, arg6, var21, var20, var22, super.field9135, arg3, arg2 + 4, var23);
                                class403 var42 = new class403(arg0, var12, arg6, var21, var20, var22, super.field9135, arg3, var38, var23);
                                if (var41.method162(-177)) {
                                    var41.method158(arg0, (byte) -115);
                                }
                                var39 = var41;
                                if (var42.method162(-177)) {
                                    var42.method158(arg0, (byte) -78);
                                }
                                var40 = var42;
                            }
                            class403.method2414(arg7, arg4, arg1, var39, var40);
                            if (var12.field2015 == 1 && class336.field4936 && !super.field9135) {
                                if (~arg2 != -1) {
                                    if (arg2 == 1) {
                                        super.field9120[arg7][arg4][arg1 - -1] = (byte) class313.method1926(super.field9120[arg7][arg4][arg1 - -1], 2);
                                        super.field9120[arg7][arg4 - -1][arg1] = (byte) class313.method1926(super.field9120[arg7][arg4 - -1][arg1], 1);
                                    } else if (~arg2 == -3) {
                                        super.field9120[arg7][arg4 + 1][arg1] = (byte) class313.method1926(super.field9120[arg7][arg4 + 1][arg1], 1);
                                        super.field9120[arg7][arg4][arg1] = (byte) class313.method1926(super.field9120[arg7][arg4][arg1], 2);
                                    } else if (arg2 == 3) {
                                        super.field9120[arg7][arg4][arg1] = (byte) class313.method1926(super.field9120[arg7][arg4][arg1], 2);
                                        super.field9120[arg7][arg4][arg1] = (byte) class313.method1926(super.field9120[arg7][arg4][arg1], 1);
                                    }
                                } else {
                                    super.field9120[arg7][arg4][arg1] = (byte) class313.method1926(super.field9120[arg7][arg4][arg1], 1);
                                    super.field9120[arg7][arg4][arg1 + 1] = (byte) class313.method1926(super.field9120[arg7][arg4][arg1 + 1], 2);
                                }
                            }
                            if (var12.field2059 != 0 && arg9 != null) {
                                arg9.method477(!var12.field2038, arg4, arg1, arg5 + -61, var12.field2067, arg3, arg2);
                            }
                            if (~var12.field2077 != -17) {
                                class20.method92(arg7, arg4, arg1, var12.field2077);
                            }
                        } else if (arg3 == 3) {
                            class578 var43;
                            if (!var24) {
                                var43 = new class71(arg0, var12, arg7, arg6, var21, var20, var22, super.field9135, arg3, arg2, arg10);
                            } else {
                                class403 var44 = new class403(arg0, var12, arg6, var21, var20, var22, super.field9135, arg3, arg2, var23);
                                if (var44.method162(arg5 + -177)) {
                                    var44.method158(arg0, (byte) -110);
                                }
                                var43 = var44;
                            }
                            class578 var45 = class491.method2972(arg7, arg4, arg1);
                            if (!(var45 instanceof class431)) {
                                class403.method2414(arg7, arg4, arg1, var43, (class578) null);
                            } else {
                                ((class431) var45).field6312 = var43;
                            }
                            if (var12.field2057 && class336.field4936) {
                                if (~arg2 == -1) {
                                    var19.method1317(arg4, arg1 - -1, 50);
                                } else if (~arg2 != -2) {
                                    if (arg2 != 2) {
                                        if (arg2 == 3) {
                                            var19.method1317(arg4, arg1, 50);
                                        }
                                    } else {
                                        var19.method1317(arg4 + 1, arg1, 50);
                                    }
                                } else {
                                    var19.method1317(arg4 + 1, arg1 - -1, 50);
                                }
                            }
                            if (var12.field2059 != 0 && arg9 != null) {
                                arg9.method477(!var12.field2038, arg4, arg1, -115, var12.field2067, arg3, arg2);
                            }
                        } else if (arg3 == 9) {
                            class237 var47;
                            if (var24) {
                                class70 var46 = new class70(arg0, var12, arg7, arg6, var21, var20, var22, super.field9135, arg4, arg4, arg1, arg1, arg3, arg2, var23);
                                if (var46.method162(-177)) {
                                    var46.method158(arg0, (byte) -88);
                                }
                                var47 = var46;
                            } else {
                                var47 = new class100(arg0, var12, arg7, arg6, var21, var20, var22, super.field9135, arg4, arg4 + var13 - 1, arg1, var14 - 1 + arg1, arg3, arg2, arg10);
                            }
                            class237 var48 = class488.method2956(arg7, arg4, arg1, field5216 != null ? field5216 : (field5216 = method2210("ej")));
                            if (var48 instanceof class34 && var48.field3469 == arg4 && var48.field3472 == arg1) {
                                ((class34) var48).field367 = var47;
                            } else {
                                class390.method2355(var47, false);
                            }
                            if (var12.field2059 != 0 && arg9 != null) {
                                arg9.method484(var13, var12.field2067, var14, !var12.field2038, arg5 + -2016, arg1, arg4);
                            }
                            if (var12.field2077 != 16) {
                                class20.method92(arg7, arg4, arg1, var12.field2077);
                            }
                        } else if (arg3 == 4) {
                            class73 var49;
                            if (!var24) {
                                var49 = new class154(arg0, var12, arg7, arg6, var21, var20, var22, super.field9135, 0, 0, 0, arg3, arg2, arg10);
                            } else {
                                class159 var50 = new class159(arg0, var12, arg6, var21, var20, var22, super.field9135, 0, 0, 0, arg3, arg2);
                                if (var50.method162(-177)) {
                                    var50.method158(arg0, (byte) -88);
                                }
                                var49 = var50;
                            }
                            class73 var51 = class427.method2549(arg7, arg4, arg1);
                            if (!(var51 instanceof class50)) {
                                class241.method1555(arg7, arg4, arg1, var49, (class73) null);
                            } else {
                                ((class50) var51).field585 = var49;
                            }
                        } else if (~arg3 == -6) {
                            int var52 = 17;
                            class438 var53 = (class438) class491.method2972(arg7, arg4, arg1);
                            if (var53 != null) {
                                var52 = class312.field4690.method2004(false, var53.method173(94)).field2077 - -1;
                            }
                            class73 var54;
                            if (!var24) {
                                var54 = new class154(arg0, var12, arg7, arg6, var21, var20, var22, super.field9135, 0, class532.field7889[arg2] * var52, class356.field5180[arg2] * var52, arg3, arg2, arg10);
                            } else {
                                class159 var55 = new class159(arg0, var12, arg6, var21, var20, var22, super.field9135, 0, class532.field7889[arg2] * var52, class356.field5180[arg2] * var52, arg3, arg2);
                                var54 = var55;
                                if (var55.method162(-177)) {
                                    var55.method158(arg0, (byte) -97);
                                }
                            }
                            class73 var56 = class427.method2549(arg7, arg4, arg1);
                            if (var56 instanceof class50) {
                                ((class50) var56).field585 = var54;
                            } else {
                                class241.method1555(arg7, arg4, arg1, var54, (class73) null);
                            }
                        } else if (~arg3 == -7) {
                            int var57 = 9;
                            class438 var58 = (class438) class491.method2972(arg7, arg4, arg1);
                            if (var58 != null) {
                                var57 = 1 + class312.field4690.method2004(false, var58.method173(58)).field2077 / 2;
                            }
                            class73 var59;
                            if (!var24) {
                                var59 = new class154(arg0, var12, arg7, arg6, var21, var20, var22, super.field9135, arg2, class535.field7911[arg2] * var57, class371.field5355[arg2] * var57, arg3, arg2 + 4, arg10);
                            } else {
                                class159 var60 = new class159(arg0, var12, arg6, var21, var20, var22, super.field9135, arg2, class532.field7889[arg2] * var57, class356.field5180[arg2] * var57, arg3, arg2 + 4);
                                if (var60.method162(-177)) {
                                    var60.method158(arg0, (byte) -101);
                                }
                                var59 = var60;
                            }
                            class73 var61 = class427.method2549(arg7, arg4, arg1);
                            if (!(var61 instanceof class50)) {
                                class241.method1555(arg7, arg4, arg1, var59, (class73) null);
                            } else {
                                ((class50) var61).field585 = var59;
                            }
                        } else if (arg3 == 7) {
                            int var62 = 3 & arg2 + 2;
                            class73 var64;
                            if (var24) {
                                class159 var63 = new class159(arg0, var12, arg6, var21, var20, var22, super.field9135, var62, 0, 0, arg3, var62 - -4);
                                if (var63.method162(-177)) {
                                    var63.method158(arg0, (byte) -94);
                                }
                                var64 = var63;
                            } else {
                                var64 = new class154(arg0, var12, arg7, arg6, var21, var20, var22, super.field9135, var62, 0, 0, arg3, var62 + 4, arg10);
                            }
                            class73 var65 = class427.method2549(arg7, arg4, arg1);
                            if (var65 instanceof class50) {
                                ((class50) var65).field585 = var64;
                            } else {
                                class241.method1555(arg7, arg4, arg1, var64, (class73) null);
                            }
                        } else if (~arg3 == -9) {
                            int var66 = arg2 + 2 & 3;
                            int var67 = 9;
                            class438 var68 = (class438) class491.method2972(arg7, arg4, arg1);
                            if (var68 != null) {
                                var67 = class312.field4690.method2004(false, var68.method173(79)).field2077 / 2 - -1;
                            }
                            class73 var70;
                            class73 var72;
                            if (!var24) {
                                class154 var69 = new class154(arg0, var12, arg7, arg6, var21, var20, var22, super.field9135, arg2, class535.field7911[arg2] * var67, class371.field5355[arg2] * var67, arg3, arg2 + 4, arg10);
                                var70 = var69;
                                class154 var71 = new class154(arg0, var12, arg7, arg6, var21, var20, var22, super.field9135, arg2, 0, 0, arg3, var66 + 4, arg10);
                                var72 = var71;
                            } else {
                                class159 var73 = new class159(arg0, var12, arg6, var21, var20, var22, super.field9135, arg2, class535.field7911[arg2] * var67, class371.field5355[arg2] * var67, arg3, arg2 - -4);
                                class159 var74 = new class159(arg0, var12, arg6, var21, var20, var22, super.field9135, arg2, 0, 0, arg3, var66 + 4);
                                if (var73.method162(arg5 ^ -177)) {
                                    var73.method158(arg0, (byte) -108);
                                }
                                var72 = var74;
                                if (var74.method162(-177)) {
                                    var74.method158(arg0, (byte) -83);
                                }
                                var70 = var73;
                            }
                            class241.method1555(arg7, arg4, arg1, var70, var72);
                        }
                    } else {
                        class70 var75 = null;
                        class237 var77;
                        int var78;
                        if (var24) {
                            class70 var76 = new class70(arg0, var12, arg7, arg6, var21, var20, var22, super.field9135, arg4, var13 + -1 + arg4, arg1, arg1 - -var14 + -1, arg3, arg2, var23);
                            var75 = var76;
                            var77 = var76;
                            var78 = var76.method425(121);
                        } else {
                            var77 = new class100(arg0, var12, arg7, arg6, var21, var20, var22, super.field9135, arg4, arg4 + -1 + var13, arg1, var14 + -1 + arg1, arg3, arg2, arg10);
                            var78 = 15;
                        }
                        class237 var79 = class488.method2956(arg7, arg4, arg1, field5216 != null ? field5216 : (field5216 = method2210("ej")));
                        boolean var80 = false;
                        if (var79 instanceof class34 && var79.field3469 == arg4 && ~var79.field3472 == ~arg1) {
                            ((class34) var79).field367 = var77;
                            var80 = true;
                        }
                        if (var80 || class390.method2355(var77, false)) {
                            if (var75 != null && var75.method162(-177)) {
                                var75.method158(arg0, (byte) -89);
                            }
                            if (var12.field2057 && class336.field4936) {
                                if (~var78 < -31) {
                                    var78 = 30;
                                }
                                for (int var81 = 0; var81 <= var13; ++var81) {
                                    for (int var82 = 0; ~var14 <= ~var82; ++var82) {
                                        var19.method1317(arg4 + var81, arg1 + var82, var78);
                                    }
                                }
                            }
                        }
                        if (~var12.field2059 != -1 && arg9 != null) {
                            arg9.method484(var13, var12.field2067, var14, !var12.field2038, -2016, arg1, arg4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lqa;Lps;II[II)V")
    public final void method2209(class167 arg0, class428 arg1, int arg2, int arg3, int[] arg4, int arg5) {
        ++field5213;
        if (!super.field9135) {
            boolean var7 = false;
            if (arg5 > -121) {
                field5215 = null;
            }
            if (arg4 != null) {
                arg4[0] = -1;
            }
            class278 var8 = null;
            while (true) {
                int var19;
                label315: do {
                    while (true) {
                        while (arg1.field6162.length > arg1.field6221) {
                            int var18 = arg1.method2561((byte) 109);
                            if (var18 != 0) {
                                if (~var18 == -2) {
                                    var19 = arg1.method2561((byte) -14);
                                    continue label315;
                                }
                                if (var18 == 2) {
                                    if (var8 == null) {
                                        var8 = new class278();
                                    }
                                    var8.method1755(arg1, 8);
                                } else if (~var18 == -129) {
                                    if (arg4 != null) {
                                        arg4[0] = arg1.method2620(65);
                                        arg4[1] = arg1.method2622((byte) 127);
                                        arg4[2] = arg1.method2622((byte) 126);
                                        arg4[3] = arg1.method2622((byte) 125);
                                        arg4[4] = arg1.method2620(61);
                                    } else {
                                        arg1.field6221 += 10;
                                    }
                                } else {
                                    if (~var18 != -130) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field9136 == null) {
                                        super.field9136 = new byte[4][][];
                                    }
                                    for (int var28 = 0; var28 < 4; ++var28) {
                                        byte var29 = arg1.method2570((byte) 57);
                                        if (~var29 == -1 && super.field9136[var28] != null) {
                                            int var30 = arg2;
                                            int var31 = arg2 + 64;
                                            int var32 = arg3;
                                            if (~arg2 > -1) {
                                                var30 = 0;
                                            } else if (~super.field9139 >= ~arg2) {
                                                var30 = super.field9139;
                                            }
                                            int var33 = arg3 + 64;
                                            if (~var31 > -1) {
                                                var31 = 0;
                                            } else if (super.field9139 <= var31) {
                                                var31 = super.field9139;
                                            }
                                            if (arg3 < 0) {
                                                var32 = 0;
                                            } else if (~super.field9125 >= ~arg3) {
                                                var32 = super.field9125;
                                            }
                                            if (~var33 > -1) {
                                                var33 = 0;
                                            } else if (var33 >= super.field9125) {
                                                var33 = super.field9125;
                                            }
                                            while (var30 < var31) {
                                                while (var33 > var32) {
                                                    super.field9136[var28][var30][var32] = 0;
                                                    ++var32;
                                                }
                                                ++var30;
                                            }
                                        } else if (~var29 != -2) {
                                            if (var29 == 2) {
                                                if (super.field9136[var28] == null) {
                                                    super.field9136[var28] = new byte[super.field9139 + 1][super.field9125 + 1];
                                                }
                                                if (~var28 < -1) {
                                                    int var34 = arg2;
                                                    int var35 = arg2 + 64;
                                                    int var36 = arg3;
                                                    int var37 = arg3 + 64;
                                                    if (arg2 >= 0) {
                                                        if (~super.field9139 >= ~arg2) {
                                                            var34 = super.field9139;
                                                        }
                                                    } else {
                                                        var34 = 0;
                                                    }
                                                    if (arg3 >= 0) {
                                                        if (super.field9125 <= arg3) {
                                                            var36 = super.field9125;
                                                        }
                                                    } else {
                                                        var36 = 0;
                                                    }
                                                    if (~var35 <= -1) {
                                                        if (~var35 <= ~super.field9139) {
                                                            var35 = super.field9139;
                                                        }
                                                    } else {
                                                        var35 = 0;
                                                    }
                                                    if (~var37 <= -1) {
                                                        if (~super.field9125 >= ~var37) {
                                                            var37 = super.field9125;
                                                        }
                                                    } else {
                                                        var37 = 0;
                                                    }
                                                    while (~var34 > ~var35) {
                                                        while (~var36 > ~var37) {
                                                            super.field9136[var28][var34][var36] = super.field9136[var28 + -1][var34][var36];
                                                            ++var36;
                                                        }
                                                        ++var34;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (super.field9136[var28] == null) {
                                                super.field9136[var28] = new byte[super.field9139 + 1][super.field9125 + 1];
                                            }
                                            for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                                for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                                    byte var40 = arg1.method2570((byte) 57);
                                                    for (int var41 = arg2 + var38; var41 < arg2 + var38 + 4; ++var41) {
                                                        for (int var42 = var39 - -arg3; ~(arg3 + var39 + 4) < ~var42; ++var42) {
                                                            if (var41 >= 0 && ~var41 > ~super.field9139 && var42 >= 0 && ~super.field9125 < ~var42) {
                                                                super.field9136[var28][var41][var42] = var40;
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
                                var8 = new class278(arg1);
                            }
                        }
                        if (var8 != null) {
                            for (int var9 = 0; ~var9 > -9; ++var9) {
                                for (int var10 = 0; var10 < 8; ++var10) {
                                    int var11 = (arg2 >> 3) - -var9;
                                    int var12 = (arg3 >> 3) - -var10;
                                    if (~var11 <= -1 && super.field9139 >> 3 > var11 && var12 >= 0 && super.field9125 >> 3 > var12) {
                                        class51.method266(var8, var11, var12, (byte) 70);
                                    }
                                }
                            }
                        }
                        if (!var7 && super.field9136 != null) {
                            for (int var13 = 0; var13 < 4; ++var13) {
                                if (super.field9136[var13] != null) {
                                    for (int var14 = 0; var14 < 16; ++var14) {
                                        for (int var15 = 0; ~var15 > -17; ++var15) {
                                            int var16 = (arg2 >> 2) + var14;
                                            int var17 = (arg3 >> 2) + var15;
                                            if (~var16 <= -1 && ~var16 > -27 && ~var17 <= -1 && ~var17 > -27) {
                                                super.field9136[var13][var16][var17] = 0;
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
                for (int var20 = 0; var19 > var20; ++var20) {
                    class323 var21 = new class323(arg0, arg1, 0);
                    if (~var21.field4790 == -32) {
                        class390 var22 = class191.field2897.method2920(arg1.method2620(41), true);
                        var21.method2023(var22.field5684, -128, var22.field5689, var22.field5683, var22.field5693);
                    }
                    if (arg0.method994() > 0) {
                        class535 var23 = var21.field4799;
                        int var24 = var23.method3151(-94) + (arg2 << 7);
                        int var25 = var23.method3143(-104) + (arg3 << 7);
                        int var26 = var24 >> 7;
                        int var27 = var25 >> 7;
                        if (var26 >= 0 && ~var27 <= -1 && ~var26 > ~super.field9139 && var27 < super.field9125) {
                            var23.method93(-1, var24, var25, super.field9138[var21.field4791][var26][var27] + -var23.method3150(2));
                            class259.method1637(var21);
                        }
                    }
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2210(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
