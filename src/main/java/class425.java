import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class425 extends class149 {

    @OriginalMember(owner = "client!qs", name = "N", descriptor = "I")
    public int field6238 = 99;

    @OriginalMember(owner = "client!qs", name = "D", descriptor = "Lao;")
    public static class188 field6228 = new class188(85, 12);

    @OriginalMember(owner = "client!qs", name = "M", descriptor = "Lgf;")
    public static class180 field6237 = new class180("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!qs", name = "P", descriptor = "Z")
    public static boolean field6240;

    @OriginalMember(owner = "client!qs", name = "Q", descriptor = "Z")
    public static volatile boolean field6241;

    @OriginalMember(owner = "client!qs", name = "C", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!qs", name = "E", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!qs", name = "F", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!qs", name = "G", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!qs", name = "H", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!qs", name = "I", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!qs", name = "J", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!qs", name = "K", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!qs", name = "L", descriptor = "I")
    public static int field6236;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qs", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field6242;

    @OriginalMember(owner = "client!qs", name = "O", descriptor = "[[B")
    public static byte[][] field6239;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lqa;IILoe;III)V")
    public final void method2593(class162 arg0, int arg1, int arg2, class133 arg3, int arg4, int arg5, int arg6) {
        ++field6230;
        if (arg6 != 25167) {
            field6240 = true;
        }
        class232 var8 = null;
        if (arg2 == 0) {
            var8 = (class232) class396.method2468(arg5, arg4, arg1);
        }
        if (arg2 == 1) {
            var8 = (class232) class7.method52(arg5, arg4, arg1);
        }
        if (arg2 == 2) {
            var8 = (class232) class51.method372(arg5, arg4, arg1, field6242 != null ? field6242 : (field6242 = method2603("rq")));
        }
        if (arg2 == 3) {
            var8 = (class232) class358.method2310(arg5, arg4, arg1);
        }
        if (var8 != null) {
            class510 var9 = class246.field3567.method609(108, var8.method379((byte) -96));
            int var10 = var8.method380(true);
            int var11 = var8.method375(-13015);
            if (var9.method3019(false)) {
                class530.method3146(arg5, var9, 97, arg4, arg1);
            }
            if (var8.method377(-57)) {
                var8.method374(arg0, 28339);
            }
            if (arg2 == 0) {
                class524 var12 = class396.method2468(arg5, arg4, arg1);
                if (var12 instanceof class448) {
                    ((class448) var12).field6563 = null;
                } else {
                    class456.method2741(arg5, arg4, arg1);
                }
                if (var9.field7492 != 0) {
                    arg3.method980(var10, (byte) -125, arg4, !var9.field7480, var11, var9.field7473, arg1);
                    return;
                }
                return;
            }
            if (arg2 == 1) {
                class177 var13 = class7.method52(arg5, arg4, arg1);
                if (!(var13 instanceof class385)) {
                    class149.method1070(arg5, arg4, arg1);
                    return;
                }
                ((class385) var13).field5698 = null;
                return;
            }
            if (~arg2 == -3) {
                class370 var14 = class51.method372(arg5, arg4, arg1, field6242 != null ? field6242 : (field6242 = method2603("rq")));
                if (var14 instanceof class504 && ~var14.field5532 == ~arg4 && ~var14.field5535 == ~arg1) {
                    ((class504) var14).field7398 = null;
                } else {
                    class86.method699(arg5, arg4, arg1, field6242 != null ? field6242 : (field6242 = method2603("rq")));
                }
                if (var9.field7492 != 0 && super.field2261 > var9.field7459 + arg4 && var9.field7459 + arg1 < super.field2248 && super.field2261 > var9.field7475 + arg4 && ~(var9.field7475 + arg1) > ~super.field2248) {
                    arg3.method981(var9.field7473, -94, var11, arg1, !var9.field7480, var9.field7475, var9.field7459, arg4);
                    return;
                }
                return;
            }
            if (~arg2 == -4) {
                class311 var15 = class358.method2310(arg5, arg4, arg1);
                if (!(var15 instanceof class244)) {
                    class225.method1496(arg5, arg4, arg1);
                } else {
                    ((class244) var15).field3514 = null;
                }
                if (var9.field7492 == 1) {
                    arg3.method985(125, arg1, arg4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(IIIZ)V")
    public class425(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class407.field5984, class224.field3259);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lti;BLqa;[III)V")
    public final void method2594(class303 arg0, byte arg1, class162 arg2, int[] arg3, int arg4, int arg5) {
        ++field6232;
        if (!super.field2251) {
            boolean var7 = false;
            if (arg1 < -76) {
                if (arg3 != null) {
                    arg3[0] = -1;
                }
                class151 var8 = null;
                while (true) {
                    while (true) {
                        while (true) {
                            while (arg0.field4326.length > arg0.field4333) {
                                int var18 = arg0.method1918((byte) -42);
                                if (var18 != 0) {
                                    if (~var18 != -2) {
                                        if (var18 == 2) {
                                            if (var8 == null) {
                                                var8 = new class151();
                                            }
                                            var8.method1095(8, arg0);
                                        } else if (~var18 == -129) {
                                            if (arg3 == null) {
                                                arg0.field4333 += 10;
                                            } else {
                                                arg3[0] = arg0.method1868(0);
                                                arg3[1] = arg0.method1901(127);
                                                arg3[2] = arg0.method1901(126);
                                                arg3[3] = arg0.method1901(123);
                                                arg3[4] = arg0.method1868(0);
                                            }
                                        } else {
                                            if (~var18 != -130) {
                                                throw new IllegalStateException("");
                                            }
                                            if (super.field2270 == null) {
                                                super.field2270 = new byte[4][][];
                                            }
                                            var7 = true;
                                            for (int var19 = 0; ~var19 > -5; ++var19) {
                                                byte var20 = arg0.method1899((byte) -128);
                                                if (~var20 == -1 && super.field2270[var19] != null) {
                                                    int var21 = arg5;
                                                    int var22 = arg5 - -64;
                                                    int var23 = arg4;
                                                    if (arg5 >= 0) {
                                                        if (~arg5 <= ~super.field2261) {
                                                            var21 = super.field2261;
                                                        }
                                                    } else {
                                                        var21 = 0;
                                                    }
                                                    int var24 = arg4 - -64;
                                                    if (~arg4 <= -1) {
                                                        if (arg4 >= super.field2248) {
                                                            var23 = super.field2248;
                                                        }
                                                    } else {
                                                        var23 = 0;
                                                    }
                                                    if (~var22 <= -1) {
                                                        if (var22 >= super.field2261) {
                                                            var22 = super.field2261;
                                                        }
                                                    } else {
                                                        var22 = 0;
                                                    }
                                                    if (~var24 <= -1) {
                                                        if (~var24 <= ~super.field2248) {
                                                            var24 = super.field2248;
                                                        }
                                                    } else {
                                                        var24 = 0;
                                                    }
                                                    while (var22 > var21) {
                                                        while (~var23 > ~var24) {
                                                            super.field2270[var19][var21][var23] = 0;
                                                            ++var23;
                                                        }
                                                        ++var21;
                                                    }
                                                } else if (var20 != 1) {
                                                    if (~var20 == -3) {
                                                        if (super.field2270[var19] == null) {
                                                            super.field2270[var19] = new byte[super.field2261 - -1][super.field2248 + 1];
                                                        }
                                                        if (var19 > 0) {
                                                            int var25 = arg5;
                                                            int var26 = arg5 + 64;
                                                            int var27 = arg4;
                                                            int var28 = arg4 - -64;
                                                            if (~arg5 > -1) {
                                                                var25 = 0;
                                                            } else if (~arg5 <= ~super.field2261) {
                                                                var25 = super.field2261;
                                                            }
                                                            if (~arg4 > -1) {
                                                                var27 = 0;
                                                            } else if (~super.field2248 >= ~arg4) {
                                                                var27 = super.field2248;
                                                            }
                                                            if (var26 < 0) {
                                                                var26 = 0;
                                                            } else if (~super.field2261 >= ~var26) {
                                                                var26 = super.field2261;
                                                            }
                                                            if (~var28 > -1) {
                                                                var28 = 0;
                                                            } else if (var28 >= super.field2248) {
                                                                var28 = super.field2248;
                                                            }
                                                            while (var25 < var26) {
                                                                while (var27 < var28) {
                                                                    super.field2270[var19][var25][var27] = super.field2270[var19 + -1][var25][var27];
                                                                    ++var27;
                                                                }
                                                                ++var25;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (super.field2270[var19] == null) {
                                                        super.field2270[var19] = new byte[super.field2261 + 1][super.field2248 + 1];
                                                    }
                                                    for (int var29 = 0; var29 < 64; var29 += 4) {
                                                        for (int var30 = 0; ~var30 > -65; var30 += 4) {
                                                            byte var31 = arg0.method1899((byte) -126);
                                                            for (int var32 = arg5 + var29; ~var32 > ~(arg5 + var29 + 4); ++var32) {
                                                                for (int var33 = arg4 + var30; arg4 + var30 + 4 > var33; ++var33) {
                                                                    if (~var32 <= -1 && ~var32 > ~super.field2261 && var33 >= 0 && ~super.field2248 < ~var33) {
                                                                        super.field2270[var19][var32][var33] = var31;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        int var34 = arg0.method1918((byte) -66);
                                        if (var34 > 0) {
                                            for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                                class480 var36 = new class480(arg2, arg0, 0);
                                                if (~var36.field7040 == -32) {
                                                    class318 var37 = class17.field267.method1280(arg0.method1868(0), 31);
                                                    var36.method2865(var37.field4552, var37.field4548, (byte) -128, var37.field4554, var37.field4556);
                                                }
                                                if (~arg2.method488() < -1) {
                                                    class131 var38 = var36.field7047;
                                                    int var39 = (arg5 << 7) + var38.method966(-80);
                                                    int var40 = (arg4 << 7) + var38.method965(false);
                                                    int var41 = var39 >> 7;
                                                    int var42 = var40 >> 7;
                                                    if (var41 >= 0 && var42 >= 0 && var41 < super.field2261 && var42 < super.field2248) {
                                                        var38.method653(var39, 6, super.field2252[var36.field7033][var41][var42] + -var38.method969((byte) -24), var40);
                                                        if (arg2.method488() > 0) {
                                                            class288.method1797(var36);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var8 = new class151(arg0);
                                }
                            }
                            if (var8 != null) {
                                for (int var9 = 0; var9 < 8; ++var9) {
                                    for (int var10 = 0; ~var10 > -9; ++var10) {
                                        int var11 = (arg5 >> 3) + var9;
                                        int var12 = (arg4 >> 3) + var10;
                                        if (~var11 <= -1 && super.field2261 >> 3 > var11 && ~var12 <= -1 && ~(super.field2248 >> 3) < ~var12) {
                                            class22.method183(var11, var8, var12, 4);
                                        }
                                    }
                                }
                            }
                            if (!var7 && super.field2270 != null) {
                                for (int var13 = 0; ~var13 > -5; ++var13) {
                                    if (super.field2270[var13] != null) {
                                        for (int var14 = 0; var14 < 16; ++var14) {
                                            for (int var15 = 0; ~var15 > -17; ++var15) {
                                                int var16 = (arg5 >> 2) + var14;
                                                int var17 = (arg4 >> 2) + var15;
                                                if (~var16 <= -1 && var16 < 26 && var17 >= 0 && ~var17 > -27) {
                                                    super.field2270[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIBI[Loe;Lqa;[BIII)V")
    public final void method2595(int arg0, int arg1, int arg2, byte arg3, int arg4, class133[] arg5, class162 arg6, byte[] arg7, int arg8, int arg9, int arg10) {
        ++field6234;
        class303 var12 = new class303(arg7);
        if (arg3 <= 26) {
            this.method2597(-69, 122, (byte) -24, 32, 64, -120, 120, (class303) null, (int[]) null, (class162) null, 67);
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method1877((byte) 99);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1891(false);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = var15 >> 6 & 63;
                int var19 = var15 >> 12;
                int var20 = var12.method1918((byte) 95);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (arg0 == var19 && var18 >= arg4 && arg4 + 8 > var18 && ~var17 <= ~arg10 && ~var17 > ~(arg10 + 8)) {
                    class510 var23 = class246.field3567.method609(110, var13);
                    int var24 = class353.method2285(var23.field7459, 7 & var18, var23.field7475, arg9, (byte) -84, var22, 7 & var17) + arg2;
                    int var25 = arg8 + class471.method2808(var23.field7475, 7 & var17, arg9, 1, var23.field7459, var22, var18 & 7);
                    if (~var24 < -1 && var25 > 0 && ~var24 > ~(super.field2261 + -1) && ~(super.field2248 + -1) < ~var25) {
                        class133 var26 = null;
                        if (!super.field2251) {
                            int var27 = arg1;
                            if ((2 & class364.field5475[1][var24][var25]) == 2) {
                                var27 = arg1 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg5[var27];
                            }
                        }
                        this.method2601(arg9 + var22 & 3, var21, var26, true, var13, var24, var25, -1, arg1, arg1, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "([Loe;BI[BLqa;I)V")
    public final void method2596(class133[] arg0, byte arg1, int arg2, byte[] arg3, class162 arg4, int arg5) {
        ++field6227;
        int var7 = -35 / ((-14 - arg1) / 38);
        class303 var8 = new class303(arg3);
        int var9 = -1;
        while (true) {
            int var10 = var8.method1877((byte) 88);
            if (var10 == 0) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var8.method1891(false);
                if (~var12 == -1) {
                    break;
                }
                var11 += var12 + -1;
                int var13 = 63 & var11;
                int var14 = var11 >> 6 & 63;
                int var15 = var11 >> 12;
                int var16 = var8.method1918((byte) 84);
                int var17 = var16 >> 2;
                int var18 = var16 & 3;
                int var19 = var14 - -arg2;
                int var20 = var13 - -arg5;
                if (~var19 < -1 && var20 > 0 && var19 < super.field2261 + -1 && var20 < super.field2248 + -1) {
                    class133 var21 = null;
                    if (!super.field2251) {
                        int var22 = var15;
                        if (~(class364.field5475[1][var19][var20] & 2) == -3) {
                            var22 = var15 - 1;
                        }
                        if (var22 >= 0) {
                            var21 = arg0[var22];
                        }
                    }
                    this.method2601(var18, var17, var21, true, var9, var19, var20, -1, var15, var15, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIBIIIILti;[ILqa;I)V")
    public final void method2597(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, class303 arg7, int[] arg8, class162 arg9, int arg10) {
        ++field6235;
        if (!super.field2251) {
            boolean var12 = false;
            class151 var13 = null;
            if (arg8 != null) {
                arg8[0] = -1;
            }
            if (arg2 != 20) {
                this.method2595(-3, 61, 84, (byte) 118, 121, (class133[]) null, (class162) null, (byte[]) null, -1, -75, -40);
            }
            int var14 = (arg5 & 7) * 8;
            int var15 = (arg3 & 7) * 8;
            while (true) {
                while (true) {
                    while (true) {
                        while (~arg7.field4326.length < ~arg7.field4333) {
                            int var20 = arg7.method1918((byte) 70);
                            if (~var20 != -1) {
                                if (var20 != 1) {
                                    if (~var20 == -3) {
                                        if (var13 == null) {
                                            var13 = new class151();
                                        }
                                        var13.method1095(8, arg7);
                                    } else if (var20 == 128) {
                                        if (arg8 != null) {
                                            arg8[0] = arg7.method1868(arg2 + -20);
                                            arg8[1] = arg7.method1901(124);
                                            arg8[2] = arg7.method1901(123);
                                            arg8[3] = arg7.method1901(122);
                                            arg8[4] = arg7.method1868(0);
                                        } else {
                                            arg7.field4333 += 10;
                                        }
                                    } else {
                                        if (var20 != 129) {
                                            throw new IllegalStateException("");
                                        }
                                        if (super.field2270 == null) {
                                            super.field2270 = new byte[4][][];
                                        }
                                        for (int var21 = 0; var21 < 4; ++var21) {
                                            byte var22 = arg7.method1899((byte) 38);
                                            if (var22 == 0 && super.field2270[arg1] != null) {
                                                if (var21 <= arg0) {
                                                    int var23 = arg10;
                                                    int var24 = arg10 + 7;
                                                    int var25 = arg6;
                                                    if (~arg10 <= -1) {
                                                        if (~arg10 <= ~super.field2261) {
                                                            var23 = super.field2261;
                                                        }
                                                    } else {
                                                        var23 = 0;
                                                    }
                                                    if (var24 < 0) {
                                                        var24 = 0;
                                                    } else if (super.field2261 <= var24) {
                                                        var24 = super.field2261;
                                                    }
                                                    if (~arg6 <= -1) {
                                                        if (arg6 >= super.field2248) {
                                                            var25 = super.field2248;
                                                        }
                                                    } else {
                                                        var25 = 0;
                                                    }
                                                    int var26 = arg6 + 7;
                                                    if (~var26 <= -1) {
                                                        if (~super.field2248 >= ~var26) {
                                                            var26 = super.field2248;
                                                        }
                                                    } else {
                                                        var26 = 0;
                                                    }
                                                    while (~var23 > ~var24) {
                                                        while (var26 > var25) {
                                                            super.field2270[arg1][var23][var25] = 0;
                                                            ++var25;
                                                        }
                                                        ++var23;
                                                    }
                                                }
                                            } else if (~var22 == -2) {
                                                if (super.field2270[arg1] == null) {
                                                    super.field2270[arg1] = new byte[super.field2261 + 1][super.field2248 + 1];
                                                }
                                                for (int var27 = 0; ~var27 > -65; var27 += 4) {
                                                    for (int var28 = 0; ~var28 > -65; var28 += 4) {
                                                        byte var29 = arg7.method1899((byte) -117);
                                                        if (~var21 >= ~arg0) {
                                                            for (int var30 = var27; var27 + 4 > var30; ++var30) {
                                                                for (int var31 = var28; ~var31 > ~(var28 + 4); ++var31) {
                                                                    if (~var14 >= ~var30 && var14 + 8 > var30 && var15 <= var31 && ~(var15 - -8) < ~var15) {
                                                                        int var32 = arg10 + class353.method2286(arg4, 7 & var31, 7 & var30, -127);
                                                                        int var33 = arg6 + class250.method1591(arg4, var30 & 7, (byte) -88, var31 & 7);
                                                                        if (var32 >= 0 && ~super.field2261 < ~var32 && var33 >= 0 && ~var33 > ~super.field2248) {
                                                                            super.field2270[arg1][var32][var33] = var29;
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
                                    int var34 = arg7.method1918((byte) 79);
                                    if (~var34 < -1) {
                                        for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                            class480 var36 = new class480(arg9, arg7, 0);
                                            if (~var36.field7040 == -32) {
                                                class318 var37 = class17.field267.method1280(arg7.method1868(arg2 ^ 20), arg2 + 11);
                                                var36.method2865(var37.field4552, var37.field4548, (byte) -128, var37.field4554, var37.field4556);
                                            }
                                            if (~arg9.method488() < -1) {
                                                class131 var38 = var36.field7047;
                                                int var39 = var38.method966(110) >> 7;
                                                int var40 = var38.method965(false) >> 7;
                                                if (var36.field7033 == arg0 && ~var14 >= ~var39 && ~var39 > ~(var14 - -8) && ~var15 >= ~var40 && ~(var15 - -8) < ~var40) {
                                                    int var41 = class32.method260(true, arg4, var38.method966(85) & 1023, 1023 & var38.method965(false)) + (arg10 << 7);
                                                    int var42 = var41 >> 7;
                                                    int var43 = class108.method806(1023 & var38.method966(arg2 + 107), arg4, arg2 ^ -93, var38.method965(false) & 1023) + (arg6 << 7);
                                                    int var44 = var43 >> 7;
                                                    if (~var42 <= -1 && var44 >= 0 && ~var42 > ~super.field2261 && super.field2248 > var44) {
                                                        var38.method653(var41, 6, super.field2252[arg0][var42][var44] - var38.method969((byte) -24), var43);
                                                        if (arg9.method488() > 0) {
                                                            class288.method1797(var36);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var13 = new class151(arg7);
                            }
                        }
                        if (var13 != null) {
                            class22.method183(arg10 >> 3, var13, arg6 >> 3, 4);
                        }
                        if (!var12 && super.field2270 != null && super.field2270[arg1] != null) {
                            int var16 = arg10 + 7;
                            int var17 = arg6 + 7;
                            for (int var18 = arg10; var18 < var16; ++var18) {
                                for (int var19 = arg6; ~var17 < ~var19; ++var19) {
                                    super.field2270[arg1][var18][var19] = 0;
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

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
    public static final void method2598(byte arg0) {
        if (arg0 > -5) {
            field6239 = null;
        }
        ++field6229;
        for (class64 var1 = (class64) class516.field7581.method2257((byte) 110); var1 != null; var1 = (class64) class516.field7581.method2256(93)) {
            if (~var1.field1125 < -1) {
                --var1.field1125;
            }
            if (var1.field1125 != 0) {
                if (var1.field1130 > 0) {
                    --var1.field1130;
                }
                if (var1.field1130 == 0 && var1.field1122 >= 1 && ~var1.field1121 <= -2 && ~var1.field1122 >= ~(class237.field3436 + -2) && var1.field1121 <= class83.field1366 + -2 && (var1.field1132 < 0 || class329.method2144(var1.field1132, -6385, var1.field1138))) {
                    class459.method2751(var1.field1123, var1.field1122, var1.field1134, (byte) 93, var1.field1121, var1.field1132, -1, var1.field1129, var1.field1138);
                    var1.field1130 = -1;
                    if (var1.field1137 == var1.field1132 && var1.field1137 == -1) {
                        var1.method2663(-128);
                    } else if (var1.field1137 == var1.field1132 && var1.field1133 == var1.field1123 && var1.field1138 == var1.field1136) {
                        var1.method2663(-112);
                    }
                }
            } else if (~var1.field1137 > -1 || class329.method2144(var1.field1137, -6385, var1.field1136)) {
                class459.method2751(var1.field1133, var1.field1122, var1.field1134, (byte) 17, var1.field1121, var1.field1137, -1, var1.field1129, var1.field1136);
                var1.method2663(-127);
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
    public static void method2599(int arg0) {
        field6237 = null;
        field6239 = null;
        field6228 = null;
        if (arg0 != 1) {
            field6228 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIB)V")
    public static final void method2600(int arg0, int arg1, byte arg2) {
        ++field6233;
        if (class321.field4649 != class193.field2824) {
            if (class303.method1925(arg0, arg1, 0, -3, false, 1, true, 0, 1)) {
                return;
            }
            class303.method1925(arg0, arg1, 0, -2, false, 1, true, 0, 1);
        } else {
            if (class303.method1925(arg0, arg1, 0, -2, false, 1, true, 0, 1)) {
                return;
            }
            class303.method1925(arg0, arg1, 0, -3, false, 1, true, 0, 1);
        }
        if (arg2 != 31) {
            field6239 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILoe;ZIIIIIILqa;)V")
    public final void method2601(int arg0, int arg1, class133 arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class162 arg10) {
        ++field6236;
        if (class397.field5830.method1292(class399.field5865, -2) || class110.method813(-106, arg5, class334.field5132, arg6, arg9)) {
            if (~arg8 > ~this.field6238) {
                this.field6238 = arg8;
            }
            class510 var12 = class246.field3567.method609(121, arg4);
            if (!arg10.method522() || !class397.field5830.field144 || !var12.field7518) {
                int var13;
                int var14;
                if (~arg0 != -2 && ~arg0 != -4) {
                    var13 = var12.field7475;
                    var14 = var12.field7459;
                } else {
                    var13 = var12.field7459;
                    var14 = var12.field7475;
                }
                int var15;
                int var16;
                if (~super.field2261 <= ~(arg5 + var14)) {
                    var15 = arg5 - -(var14 + 1 >> 1);
                    var16 = (var14 >> 1) + arg5;
                } else {
                    var16 = arg5;
                    var15 = arg5 + 1;
                }
                int var17;
                int var18;
                if (~(arg6 - -var13) < ~super.field2248) {
                    var17 = arg6 + 1;
                    var18 = arg6;
                } else {
                    var18 = (var13 >> 1) + arg6;
                    var17 = (var13 + 1 >> 1) + arg6;
                }
                class35 var19 = class529.field7807[arg9];
                int var20 = var19.method271(var16, var18) - (-var19.method271(var15, var18) + (-var19.method271(var16, var17) - var19.method271(var15, var17))) >> 2;
                int var21 = (arg5 << 7) + (var14 << 6);
                int var22 = (arg6 << 7) + (var13 << 6);
                boolean var23 = class240.field3496 && !super.field2251 && var12.field7496;
                if (var12.method3019(false)) {
                    class428.method2610(arg8, (class13) null, arg5, (byte) 106, var12, arg0, (class62) null, arg6);
                }
                boolean var24 = ~arg7 == 0 && ~var12.field7505 == 0 && var12.field7468 == null && var12.field7497 == null && !var12.field7526;
                if (!class398.field5857 || (!class40.method307(arg1, 125) || ~var12.field7530 == -2) && (!class410.method2539(-8927, arg1) || var12.field7530 != 0)) {
                    if (arg1 == 22) {
                        if (class397.field5830.field123 || var12.field7491 != 0 || var12.field7492 == 1 || var12.field7495) {
                            class311 var26;
                            if (var24) {
                                class339 var25 = new class339(arg10, var12, arg9, var21, var20, var22, super.field2251, arg0, var23);
                                if (var25.method377(-116)) {
                                    var25.method373(arg10, -2304);
                                }
                                var26 = var25;
                            } else {
                                var26 = new class412(arg10, var12, arg8, arg9, var21, var20, var22, super.field2251, arg0, arg7);
                            }
                            class311 var27 = class358.method2310(arg8, arg5, arg6);
                            if (!(var27 instanceof class244)) {
                                class507.method2998(arg8, arg5, arg6, var26);
                            } else {
                                ((class244) var27).field3514 = var26;
                            }
                            if (var12.field7492 == 1 && arg2 != null) {
                                arg2.method987(arg5, arg6, 28308);
                            }
                        }
                    } else if (~arg1 != -11 && ~arg1 != -12) {
                        if (~arg1 <= -13 && arg1 <= 17 || arg1 >= 18 && ~arg1 >= -22) {
                            class370 var29;
                            if (var24) {
                                class225 var28 = new class225(arg10, var12, arg8, arg9, var21, var20, var22, super.field2251, arg5, arg5 + var14 + -1, arg6, arg6 + -1 + var13, arg1, arg0, var23);
                                var29 = var28;
                                if (var28.method377(-32)) {
                                    var28.method373(arg10, -2304);
                                }
                            } else {
                                var29 = new class52(arg10, var12, arg8, arg9, var21, var20, var22, super.field2251, arg5, arg5 + -1 + var14, arg6, arg6 - -var13 - 1, arg1, arg0, arg7);
                            }
                            class370 var30 = class51.method372(arg8, arg5, arg6, field6242 != null ? field6242 : (field6242 = method2603("rq")));
                            if (var30 instanceof class504 && ~var30.field5532 == ~arg5 && ~var30.field5535 == ~arg6) {
                                ((class504) var30).field7398 = var29;
                            } else {
                                class333.method2194(var29, false);
                            }
                            if (class240.field3496 && !super.field2251 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && ~arg8 < -1 && var12.field7530 != 0) {
                                super.field2253[arg8][arg5][arg6] = (byte) class29.method239(super.field2253[arg8][arg5][arg6], 4);
                            }
                            if (~var12.field7492 != -1 && arg2 != null) {
                                arg2.method978(var13, arg6, var14, !var12.field7480, arg5, (byte) 105, var12.field7473);
                            }
                        } else if (arg1 == 0) {
                            int var31 = var12.field7530;
                            if (class101.field1625 && var12.field7530 == -1) {
                                var31 = 1;
                            }
                            class524 var32;
                            if (!var24) {
                                var32 = new class375(arg10, var12, arg8, arg9, var21, var20, var22, super.field2251, arg1, arg0, arg7);
                            } else {
                                class227 var33 = new class227(arg10, var12, arg9, var21, var20, var22, super.field2251, arg1, arg0, var23);
                                if (var33.method377(-52)) {
                                    var33.method373(arg10, -2304);
                                }
                                var32 = var33;
                            }
                            class524 var34 = class396.method2468(arg8, arg5, arg6);
                            if (!(var34 instanceof class448)) {
                                class430.method2615(arg8, arg5, arg6, var32, (class524) null);
                            } else {
                                ((class448) var34).field6563 = var32;
                            }
                            if (class240.field3496) {
                                if (~arg0 == -1) {
                                    if (var12.field7478) {
                                        var19.method272(arg5, arg6, 50);
                                        var19.method272(arg5, arg6 + 1, 50);
                                    }
                                    if (~var31 == -2 && !super.field2251) {
                                        super.field2253[arg8][arg5][arg6] = (byte) class29.method239(super.field2253[arg8][arg5][arg6], 1);
                                    }
                                } else if (~arg0 != -2) {
                                    if (arg0 == 2) {
                                        if (var12.field7478) {
                                            var19.method272(arg5 - -1, arg6, 50);
                                            var19.method272(arg5 - -1, arg6 + 1, 50);
                                        }
                                        if (~var31 == -2 && !super.field2251) {
                                            super.field2253[arg8][arg5 + 1][arg6] = (byte) class29.method239(super.field2253[arg8][arg5 + 1][arg6], 1);
                                        }
                                    } else if (~arg0 == -4) {
                                        if (var12.field7478) {
                                            var19.method272(arg5, arg6, 50);
                                            var19.method272(arg5 - -1, arg6, 50);
                                        }
                                        if (~var31 == -2 && !super.field2251) {
                                            super.field2253[arg8][arg5][arg6] = (byte) class29.method239(super.field2253[arg8][arg5][arg6], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field7478) {
                                        var19.method272(arg5, arg6 + 1, 50);
                                        var19.method272(arg5 + 1, arg6 + 1, 50);
                                    }
                                    if (~var31 == -2 && !super.field2251) {
                                        super.field2253[arg8][arg5][arg6 + 1] = (byte) class29.method239(super.field2253[arg8][arg5][arg6 + 1], 2);
                                    }
                                }
                            }
                            if (var12.field7492 != 0 && arg2 != null) {
                                arg2.method973(arg0, arg1, var12.field7473, (byte) -39, arg5, arg6, !var12.field7480);
                            }
                            if (var12.field7451 != 16) {
                                class25.method208(arg8, arg5, arg6, var12.field7451);
                            }
                        } else if (~arg1 == -2) {
                            class524 var35;
                            if (!var24) {
                                var35 = new class375(arg10, var12, arg8, arg9, var21, var20, var22, super.field2251, arg1, arg0, arg7);
                            } else {
                                class227 var36 = new class227(arg10, var12, arg9, var21, var20, var22, super.field2251, arg1, arg0, var23);
                                var35 = var36;
                                if (var36.method377(-80)) {
                                    var36.method373(arg10, -2304);
                                }
                            }
                            class524 var37 = class396.method2468(arg8, arg5, arg6);
                            if (!(var37 instanceof class448)) {
                                class430.method2615(arg8, arg5, arg6, var35, (class524) null);
                            } else {
                                ((class448) var37).field6563 = var35;
                            }
                            if (var12.field7478 && class240.field3496) {
                                if (~arg0 != -1) {
                                    if (arg0 == 1) {
                                        var19.method272(arg5 + 1, arg6 + 1, 50);
                                    } else if (arg0 == 2) {
                                        var19.method272(arg5 + 1, arg6, 50);
                                    } else if (~arg0 == -4) {
                                        var19.method272(arg5, arg6, 50);
                                    }
                                } else {
                                    var19.method272(arg5, arg6 + 1, 50);
                                }
                            }
                            if (var12.field7492 != 0 && arg2 != null) {
                                arg2.method973(arg0, arg1, var12.field7473, (byte) -107, arg5, arg6, !var12.field7480);
                            }
                        } else if (~arg1 == -3) {
                            int var38 = 3 & arg0 - -1;
                            class524 var39;
                            class524 var40;
                            if (!var24) {
                                var39 = new class375(arg10, var12, arg8, arg9, var21, var20, var22, super.field2251, arg1, arg0 + 4, arg7);
                                var40 = new class375(arg10, var12, arg8, arg9, var21, var20, var22, super.field2251, arg1, var38, arg7);
                            } else {
                                class227 var41 = new class227(arg10, var12, arg9, var21, var20, var22, super.field2251, arg1, arg0 + 4, var23);
                                class227 var42 = new class227(arg10, var12, arg9, var21, var20, var22, super.field2251, arg1, var38, var23);
                                if (var41.method377(-105)) {
                                    var41.method373(arg10, -2304);
                                }
                                var40 = var42;
                                var39 = var41;
                                if (var42.method377(-88)) {
                                    var42.method373(arg10, -2304);
                                }
                            }
                            class430.method2615(arg8, arg5, arg6, var39, var40);
                            if (var12.field7530 == 1 && class240.field3496 && !super.field2251) {
                                if (arg0 != 0) {
                                    if (arg0 != 1) {
                                        if (arg0 != 2) {
                                            if (arg0 == 3) {
                                                super.field2253[arg8][arg5][arg6] = (byte) class29.method239(super.field2253[arg8][arg5][arg6], 2);
                                                super.field2253[arg8][arg5][arg6] = (byte) class29.method239(super.field2253[arg8][arg5][arg6], 1);
                                            }
                                        } else {
                                            super.field2253[arg8][arg5 + 1][arg6] = (byte) class29.method239(super.field2253[arg8][arg5 + 1][arg6], 1);
                                            super.field2253[arg8][arg5][arg6] = (byte) class29.method239(super.field2253[arg8][arg5][arg6], 2);
                                        }
                                    } else {
                                        super.field2253[arg8][arg5][arg6 + 1] = (byte) class29.method239(super.field2253[arg8][arg5][arg6 + 1], 2);
                                        super.field2253[arg8][arg5 + 1][arg6] = (byte) class29.method239(super.field2253[arg8][arg5 + 1][arg6], 1);
                                    }
                                } else {
                                    super.field2253[arg8][arg5][arg6] = (byte) class29.method239(super.field2253[arg8][arg5][arg6], 1);
                                    super.field2253[arg8][arg5][arg6 + 1] = (byte) class29.method239(super.field2253[arg8][arg5][arg6 + 1], 2);
                                }
                            }
                            if (var12.field7492 != 0 && arg2 != null) {
                                arg2.method973(arg0, arg1, var12.field7473, (byte) -79, arg5, arg6, !var12.field7480);
                            }
                            if (var12.field7451 != 16) {
                                class25.method208(arg8, arg5, arg6, var12.field7451);
                            }
                        } else if (arg1 == 3) {
                            class524 var43;
                            if (!var24) {
                                var43 = new class375(arg10, var12, arg8, arg9, var21, var20, var22, super.field2251, arg1, arg0, arg7);
                            } else {
                                class227 var44 = new class227(arg10, var12, arg9, var21, var20, var22, super.field2251, arg1, arg0, var23);
                                var43 = var44;
                                if (var44.method377(-52)) {
                                    var44.method373(arg10, -2304);
                                }
                            }
                            class524 var45 = class396.method2468(arg8, arg5, arg6);
                            if (!(var45 instanceof class448)) {
                                class430.method2615(arg8, arg5, arg6, var43, (class524) null);
                            } else {
                                ((class448) var45).field6563 = var43;
                            }
                            if (var12.field7478 && class240.field3496) {
                                if (~arg0 != -1) {
                                    if (~arg0 == -2) {
                                        var19.method272(arg5 - -1, arg6 + 1, 50);
                                    } else if (arg0 != 2) {
                                        if (~arg0 == -4) {
                                            var19.method272(arg5, arg6, 50);
                                        }
                                    } else {
                                        var19.method272(arg5 + 1, arg6, 50);
                                    }
                                } else {
                                    var19.method272(arg5, arg6 + 1, 50);
                                }
                            }
                            if (~var12.field7492 != -1 && arg2 != null) {
                                arg2.method973(arg0, arg1, var12.field7473, (byte) -92, arg5, arg6, !var12.field7480);
                            }
                        } else if (~arg1 == -10) {
                            class370 var47;
                            if (var24) {
                                class225 var46 = new class225(arg10, var12, arg8, arg9, var21, var20, var22, super.field2251, arg5, arg5, arg6, arg6, arg1, arg0, var23);
                                if (var46.method377(-63)) {
                                    var46.method373(arg10, -2304);
                                }
                                var47 = var46;
                            } else {
                                var47 = new class52(arg10, var12, arg8, arg9, var21, var20, var22, super.field2251, arg5, arg5 - -var14 + -1, arg6, arg6 - 1 + var13, arg1, arg0, arg7);
                            }
                            class370 var48 = class51.method372(arg8, arg5, arg6, field6242 != null ? field6242 : (field6242 = method2603("rq")));
                            if (var48 instanceof class504 && var48.field5532 == arg5 && ~var48.field5535 == ~arg6) {
                                ((class504) var48).field7398 = var47;
                            } else {
                                class333.method2194(var47, false);
                            }
                            if (var12.field7492 != 0 && arg2 != null) {
                                arg2.method978(var13, arg6, var14, !var12.field7480, arg5, (byte) 106, var12.field7473);
                            }
                            if (~var12.field7451 != -17) {
                                class25.method208(arg8, arg5, arg6, var12.field7451);
                            }
                        } else if (~arg1 == -5) {
                            class177 var50;
                            if (var24) {
                                class414 var49 = new class414(arg10, var12, arg9, var21, var20, var22, super.field2251, 0, 0, 0, arg1, arg0);
                                if (var49.method377(-44)) {
                                    var49.method373(arg10, -2304);
                                }
                                var50 = var49;
                            } else {
                                var50 = new class258(arg10, var12, arg8, arg9, var21, var20, var22, super.field2251, 0, 0, 0, arg1, arg0, arg7);
                            }
                            class177 var51 = class7.method52(arg8, arg5, arg6);
                            if (!(var51 instanceof class385)) {
                                class470.method2805(arg8, arg5, arg6, var50, (class177) null);
                            } else {
                                ((class385) var51).field5698 = var50;
                            }
                        } else if (arg1 == 5) {
                            int var52 = 17;
                            class232 var53 = (class232) class396.method2468(arg8, arg5, arg6);
                            if (var53 != null) {
                                var52 = 1 + class246.field3567.method609(118, var53.method379((byte) -96)).field7451;
                            }
                            class177 var54;
                            if (!var24) {
                                var54 = new class258(arg10, var12, arg8, arg9, var21, var20, var22, super.field2251, 0, class443.field6506[arg0] * var52, class148.field2233[arg0] * var52, arg1, arg0, arg7);
                            } else {
                                class414 var55 = new class414(arg10, var12, arg9, var21, var20, var22, super.field2251, 0, class443.field6506[arg0] * var52, class148.field2233[arg0] * var52, arg1, arg0);
                                if (var55.method377(-87)) {
                                    var55.method373(arg10, -2304);
                                }
                                var54 = var55;
                            }
                            class177 var56 = class7.method52(arg8, arg5, arg6);
                            if (var56 instanceof class385) {
                                ((class385) var56).field5698 = var54;
                            } else {
                                class470.method2805(arg8, arg5, arg6, var54, (class177) null);
                            }
                        } else if (arg1 == 6) {
                            int var57 = 9;
                            class232 var58 = (class232) class396.method2468(arg8, arg5, arg6);
                            if (var58 != null) {
                                var57 = class246.field3567.method609(115, var58.method379((byte) -96)).field7451 / 2 - -1;
                            }
                            class177 var59;
                            if (!var24) {
                                var59 = new class258(arg10, var12, arg8, arg9, var21, var20, var22, super.field2251, arg0, class527.field7758[arg0] * var57, class172.field2579[arg0] * var57, arg1, arg0 + 4, arg7);
                            } else {
                                class414 var60 = new class414(arg10, var12, arg9, var21, var20, var22, super.field2251, arg0, class443.field6506[arg0] * var57, class148.field2233[arg0] * var57, arg1, arg0 + 4);
                                if (var60.method377(-39)) {
                                    var60.method373(arg10, -2304);
                                }
                                var59 = var60;
                            }
                            class177 var61 = class7.method52(arg8, arg5, arg6);
                            if (!(var61 instanceof class385)) {
                                class470.method2805(arg8, arg5, arg6, var59, (class177) null);
                            } else {
                                ((class385) var61).field5698 = var59;
                            }
                        } else if (arg3) {
                            if (arg1 == 7) {
                                int var62 = arg0 + 2 & 3;
                                class177 var63;
                                if (!var24) {
                                    var63 = new class258(arg10, var12, arg8, arg9, var21, var20, var22, super.field2251, var62, 0, 0, arg1, var62 + 4, arg7);
                                } else {
                                    class414 var64 = new class414(arg10, var12, arg9, var21, var20, var22, super.field2251, var62, 0, 0, arg1, var62 - -4);
                                    if (var64.method377(-80)) {
                                        var64.method373(arg10, -2304);
                                    }
                                    var63 = var64;
                                }
                                class177 var65 = class7.method52(arg8, arg5, arg6);
                                if (!(var65 instanceof class385)) {
                                    class470.method2805(arg8, arg5, arg6, var63, (class177) null);
                                } else {
                                    ((class385) var65).field5698 = var63;
                                }
                            } else if (~arg1 == -9) {
                                int var66 = arg0 - -2 & 3;
                                int var67 = 9;
                                class232 var68 = (class232) class396.method2468(arg8, arg5, arg6);
                                if (var68 != null) {
                                    var67 = class246.field3567.method609(114, var68.method379((byte) -96)).field7451 / 2 + 1;
                                }
                                class177 var71;
                                class177 var72;
                                if (var24) {
                                    class414 var69 = new class414(arg10, var12, arg9, var21, var20, var22, super.field2251, arg0, class527.field7758[arg0] * var67, class172.field2579[arg0] * var67, arg1, arg0 + 4);
                                    class414 var70 = new class414(arg10, var12, arg9, var21, var20, var22, super.field2251, arg0, 0, 0, arg1, var66 + 4);
                                    if (var69.method377(-93)) {
                                        var69.method373(arg10, -2304);
                                    }
                                    if (var70.method377(-54)) {
                                        var70.method373(arg10, -2304);
                                    }
                                    var71 = var70;
                                    var72 = var69;
                                } else {
                                    class258 var73 = new class258(arg10, var12, arg8, arg9, var21, var20, var22, super.field2251, arg0, class527.field7758[arg0] * var67, class172.field2579[arg0] * var67, arg1, arg0 + 4, arg7);
                                    var72 = var73;
                                    class258 var74 = new class258(arg10, var12, arg8, arg9, var21, var20, var22, super.field2251, arg0, 0, 0, arg1, var66 + 4, arg7);
                                    var71 = var74;
                                }
                                class470.method2805(arg8, arg5, arg6, var72, var71);
                            }
                        }
                    } else {
                        class225 var75 = null;
                        int var77;
                        class370 var78;
                        if (var24) {
                            class225 var76 = new class225(arg10, var12, arg8, arg9, var21, var20, var22, super.field2251, arg5, var14 + -1 + arg5, arg6, arg6 + var13 + -1, arg1, arg0, var23);
                            var77 = var76.method1490(-115);
                            var75 = var76;
                            var78 = var76;
                        } else {
                            var77 = 15;
                            var78 = new class52(arg10, var12, arg8, arg9, var21, var20, var22, super.field2251, arg5, arg5 + var14 + -1, arg6, arg6 - (-var13 + 1), arg1, arg0, arg7);
                        }
                        class370 var79 = class51.method372(arg8, arg5, arg6, field6242 != null ? field6242 : (field6242 = method2603("rq")));
                        boolean var80 = false;
                        if (var79 instanceof class504 && ~var79.field5532 == ~arg5 && ~var79.field5535 == ~arg6) {
                            ((class504) var79).field7398 = var78;
                            var80 = true;
                        }
                        if (var80 || class333.method2194(var78, false)) {
                            if (var75 != null && var75.method377(-54)) {
                                var75.method373(arg10, -2304);
                            }
                            if (var12.field7478 && class240.field3496) {
                                if (var77 > 30) {
                                    var77 = 30;
                                }
                                for (int var81 = 0; ~var81 >= ~var14; ++var81) {
                                    for (int var82 = 0; var13 >= var82; ++var82) {
                                        var19.method272(arg5 + var81, arg6 + var82, var77);
                                    }
                                }
                            }
                        }
                        if (~var12.field7492 != -1 && arg2 != null) {
                            arg2.method978(var13, arg6, var14, !var12.field7480, arg5, (byte) 101, var12.field7473);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(Lqa;I)V")
    public final void method2602(class162 arg0, int arg1) {
        ++field6231;
        class60.method538(arg0);
        if (~super.field2250 < -2) {
            for (int var3 = 0; ~super.field2261 < ~var3; ++var3) {
                for (int var4 = 0; ~var4 > ~super.field2248; ++var4) {
                    if ((class364.field5475[1][var3][var4] & 2) == 2) {
                        class53.method384(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; var5 < super.field2250; ++var5) {
            for (int var6 = 0; ~var6 >= ~super.field2248; ++var6) {
                for (int var7 = 0; ~super.field2261 <= ~var7; ++var7) {
                    if ((1 & super.field2253[var5][var7][var6]) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        int var11 = var5;
                        while (var8 > 0 && (1 & super.field2253[var5][var7][var8 + -1]) != 0) {
                            --var8;
                        }
                        while (~var9 > ~super.field2248 && (super.field2253[var5][var7][var9 + 1] & 1) != 0) {
                            ++var9;
                        }
                        label170: while (~var10 < -1) {
                            for (int var12 = var8; var9 >= var12; ++var12) {
                                if ((super.field2253[var10 + -1][var7][var12] & 1) == 0) {
                                    break label170;
                                }
                            }
                            --var10;
                        }
                        label159: while (var11 < 3) {
                            for (int var13 = var8; ~var9 <= ~var13; ++var13) {
                                if ((1 & super.field2253[var11 - -1][var7][var13]) == 0) {
                                    break label159;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (-var8 + var9 - -1) * (-var10 + var11 + 1);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = super.field2252[var11][var7][var8] + -var15;
                            int var17 = super.field2252[var10][var7][var8];
                            class1.method3(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) - -128, var16, var17);
                            for (int var18 = var10; var11 >= var18; ++var18) {
                                for (int var19 = var8; ~var9 <= ~var19; ++var19) {
                                    super.field2253[var18][var7][var19] = (byte) class388.method2441(super.field2253[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if (~(super.field2253[var5][var7][var6] & 2) != -1) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (~super.field2261 < ~var21 && (2 & super.field2253[var5][var21 + 1][var6]) != 0) {
                            ++var21;
                        }
                        int var23 = var5;
                        while (~var20 < -1 && (2 & super.field2253[var5][var20 - 1][var6]) != 0) {
                            --var20;
                        }
                        label223: while (~var22 < -1) {
                            for (int var24 = var20; var24 <= var21; ++var24) {
                                if (~(2 & super.field2253[var22 + -1][var24][var6]) == -1) {
                                    break label223;
                                }
                            }
                            --var22;
                        }
                        label212: while (~var23 > -4) {
                            for (int var25 = var20; ~var25 >= ~var21; ++var25) {
                                if ((2 & super.field2253[var23 + 1][var25][var6]) == 0) {
                                    break label212;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (var21 - var20 + 1) * (var23 + 1 + -var22);
                        if (~var26 <= -3) {
                            short var27 = 240;
                            int var28 = super.field2252[var23][var20][var6] + -var27;
                            int var29 = super.field2252[var22][var20][var6];
                            class1.method3(2, var20 << 7, (var21 << 7) + 128, var6 << 7, var6 << 7, var28, var29);
                            for (int var30 = var22; var30 <= var23; ++var30) {
                                for (int var31 = var20; ~var21 <= ~var31; ++var31) {
                                    super.field2253[var30][var31][var6] = (byte) class388.method2441(super.field2253[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if (~(4 & super.field2253[var5][var7][var6]) != -1) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (var34 > 0 && ~(super.field2253[var5][var7][var34 + -1] & 4) != -1) {
                            --var34;
                        }
                        while (~var35 > ~super.field2248 && ~(super.field2253[var5][var7][var35 + 1] & 4) != -1) {
                            ++var35;
                        }
                        label277: while (~var32 < -1) {
                            for (int var36 = var34; ~var35 <= ~var36; ++var36) {
                                if ((super.field2253[var5][var32 + -1][var36] & 4) == 0) {
                                    break label277;
                                }
                            }
                            --var32;
                        }
                        label266: while (var33 < super.field2261) {
                            for (int var37 = var34; var37 <= var35; ++var37) {
                                if ((super.field2253[var5][var33 + 1][var37] & 4) == 0) {
                                    break label266;
                                }
                            }
                            ++var33;
                        }
                        if ((-var34 + var35 + 1) * (var33 + 1 + -var32) >= 4) {
                            int var38 = super.field2252[var5][var32][var34];
                            class1.method3(4, var32 << 7, (var33 << 7) + 128, var34 << 7, (var35 << 7) + 128, var38, var38);
                            for (int var39 = var32; ~var39 >= ~var33; ++var39) {
                                for (int var40 = var34; ~var35 <= ~var40; ++var40) {
                                    super.field2253[var5][var39][var40] = (byte) class388.method2441(super.field2253[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field2253 = null;
        if (arg1 != 23992) {
            this.method2593((class162) null, -84, -36, (class133) null, -112, -75, -123);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2603(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class180("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        field6240 = true;
        field6241 = false;
    }
}
