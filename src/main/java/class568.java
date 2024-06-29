import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class568 extends class63 {

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public int field8113 = 99;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field8103;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field8104;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field8105;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public static int field8106;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public static int field8107;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public static int field8108;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field8109;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public static int field8112;

    // $FF: synthetic field
    @OriginalMember(owner = "client!od", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field8114;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZI)V")
    public static final void method3221(int arg0, boolean arg1, int arg2) {
        ++field8107;
        class21 var3 = class601.method3413(0, 15, (byte) 101);
        if (arg1) {
            var3.method230(18340);
            var3.field308 = arg2;
            var3.field302 = arg0;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILco;[IILqa;I)V")
    public final void method3222(int arg0, class268 arg1, int[] arg2, int arg3, class167 arg4, int arg5) {
        ++field8106;
        if (!super.field870) {
            boolean var7 = false;
            if (arg2 != null) {
                arg2[0] = -1;
            }
            class366 var8 = null;
            while (true) {
                int var19;
                label316: do {
                    while (true) {
                        while (~arg1.field3913 > ~arg1.field3952.length) {
                            int var18 = arg1.method1738(255);
                            if (var18 != 0) {
                                if (~var18 == -2) {
                                    var19 = arg1.method1738(255);
                                    continue label316;
                                }
                                if (var18 == 2) {
                                    if (var8 == null) {
                                        var8 = new class366();
                                    }
                                    var8.method2213(arg1, (byte) -126);
                                } else if (var18 == 128) {
                                    if (arg2 != null) {
                                        arg2[0] = arg1.method1745(32132);
                                        arg2[1] = arg1.method1730(13436);
                                        arg2[2] = arg1.method1730(13436);
                                        arg2[3] = arg1.method1730(13436);
                                        arg2[4] = arg1.method1745(class631.method3567(arg0, -32133));
                                    } else {
                                        arg1.field3913 += 10;
                                    }
                                } else {
                                    if (~var18 != -130) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field886 == null) {
                                        super.field886 = new byte[4][][];
                                    }
                                    for (int var28 = 0; var28 < 4; ++var28) {
                                        byte var29 = arg1.method1714(-31536);
                                        if (~var29 == -1 && super.field886[var28] != null) {
                                            int var30 = arg3;
                                            int var31 = arg3 + 64;
                                            int var32 = arg5;
                                            if (var31 < 0) {
                                                var31 = 0;
                                            } else if (~super.field872 >= ~var31) {
                                                var31 = super.field872;
                                            }
                                            int var33 = arg5 + 64;
                                            if (~arg5 <= -1) {
                                                if (arg5 >= super.field880) {
                                                    var32 = super.field880;
                                                }
                                            } else {
                                                var32 = 0;
                                            }
                                            if (arg3 >= 0) {
                                                if (~super.field872 >= ~arg3) {
                                                    var30 = super.field872;
                                                }
                                            } else {
                                                var30 = 0;
                                            }
                                            if (~var33 <= -1) {
                                                if (var33 >= super.field880) {
                                                    var33 = super.field880;
                                                }
                                            } else {
                                                var33 = 0;
                                            }
                                            while (~var30 > ~var31) {
                                                while (~var33 < ~var32) {
                                                    super.field886[var28][var30][var32] = 0;
                                                    ++var32;
                                                }
                                                ++var30;
                                            }
                                        } else if (var29 == 1) {
                                            if (super.field886[var28] == null) {
                                                super.field886[var28] = new byte[super.field872 + 1][super.field880 + 1];
                                            }
                                            for (int var34 = 0; var34 < 64; var34 += 4) {
                                                for (int var35 = 0; var35 < 64; var35 += 4) {
                                                    byte var36 = arg1.method1714(-31536);
                                                    for (int var37 = arg3 + var34; var37 < arg3 + 4 + var34; ++var37) {
                                                        for (int var38 = arg5 + var35; var38 < arg5 + var35 + 4; ++var38) {
                                                            if (~var37 <= -1 && ~var37 > ~super.field872 && var38 >= 0 && var38 < super.field880) {
                                                                super.field886[var28][var37][var38] = var36;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (~var29 == -3) {
                                            if (super.field886[var28] == null) {
                                                super.field886[var28] = new byte[super.field872 - -1][super.field880 + 1];
                                            }
                                            if (var28 > 0) {
                                                int var39 = arg3;
                                                int var40 = arg3 - -64;
                                                int var41 = arg5;
                                                if (arg3 >= 0) {
                                                    if (~arg3 <= ~super.field872) {
                                                        var39 = super.field872;
                                                    }
                                                } else {
                                                    var39 = 0;
                                                }
                                                if (arg5 >= 0) {
                                                    if (arg5 >= super.field880) {
                                                        var41 = super.field880;
                                                    }
                                                } else {
                                                    var41 = 0;
                                                }
                                                int var42 = arg5 + 64;
                                                if (var40 >= 0) {
                                                    if (~super.field872 >= ~var40) {
                                                        var40 = super.field872;
                                                    }
                                                } else {
                                                    var40 = 0;
                                                }
                                                if (~var42 <= -1) {
                                                    if (~super.field880 >= ~var42) {
                                                        var42 = super.field880;
                                                    }
                                                } else {
                                                    var42 = 0;
                                                }
                                                while (~var39 > ~var40) {
                                                    while (~var41 > ~var42) {
                                                        super.field886[var28][var39][var41] = super.field886[var28 + -1][var39][var41];
                                                        ++var41;
                                                    }
                                                    ++var39;
                                                }
                                            }
                                        }
                                    }
                                    var7 = true;
                                }
                            } else {
                                var8 = new class366(arg1);
                            }
                        }
                        if (arg0 != -1) {
                            this.field8113 = -101;
                        }
                        if (var8 != null) {
                            for (int var9 = 0; var9 < 8; ++var9) {
                                for (int var10 = 0; var10 < 8; ++var10) {
                                    int var11 = (arg3 >> 3) - -var9;
                                    int var12 = (arg5 >> 3) - -var10;
                                    if (~var11 <= -1 && super.field872 >> 3 > var11 && var12 >= 0 && var12 < super.field880 >> 3) {
                                        class175.method1204((byte) 56, var8, var11, var12);
                                    }
                                }
                            }
                        }
                        if (!var7 && super.field886 != null) {
                            for (int var13 = 0; ~var13 > -5; ++var13) {
                                if (super.field886[var13] != null) {
                                    for (int var14 = 0; var14 < 16; ++var14) {
                                        for (int var15 = 0; ~var15 > -17; ++var15) {
                                            int var16 = (arg3 >> 2) + var14;
                                            int var17 = (arg5 >> 2) - -var15;
                                            if (var16 >= 0 && var16 < 26 && ~var17 <= -1 && var17 < 26) {
                                                super.field886[var13][var16][var17] = 0;
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
                    class624 var21 = new class624(arg4, arg1, 0);
                    if (var21.field8802 == 31) {
                        class136 var22 = class639.field9269.method2724((byte) -60, arg1.method1745(32132));
                        var21.method3540(-28197, var22.field2169, var22.field2177, var22.field2172, var22.field2171);
                    }
                    if (arg4.method612() > 0) {
                        class637 var23 = var21.field8805;
                        int var24 = (arg3 << 7) + var23.method3681(-27102);
                        int var25 = var23.method3677(-26984) - -(arg5 << 7);
                        int var26 = var24 >> 7;
                        int var27 = var25 >> 7;
                        if (~var26 <= -1 && ~var27 <= -1 && var26 < super.field872 && super.field880 > var27) {
                            var23.method448(super.field881[var21.field8804][var26][var27] - var23.method3682(false), var24, var25, (byte) 24);
                            class28.method256(var21);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static final void method3223(int arg0) {
        ++field8104;
        if (class443.field6474 == null) {
            Container var1;
            if (class327.field4718 != null) {
                var1 = class327.field4718;
            } else {
                var1 = class270.field3976.field549;
            }
            class416.field6134 = var1.getSize().width;
            class638.field9262 = var1.getSize().height;
            if (class327.field4718 == var1) {
                Insets var2 = class327.field4718.getInsets();
                class416.field6134 -= var2.right + var2.left;
                class638.field9262 -= var2.top + var2.bottom;
            }
            if (~class512.method2868(2) == -2) {
                class39.field516 = 0;
                class335.field4800 = (-class356.field5086 + class416.field6134) / 2;
                class68.field1285 = class356.field5086;
                class442.field6464 = class434.field6380;
            } else if (~class555.field7861 > -97 && class646.field9388 == 0) {
                int var3 = ~class416.field6134 < -1025 ? 1024 : class416.field6134;
                class68.field1285 = var3;
                int var4 = ~class638.field9262 >= -769 ? class638.field9262 : 768;
                class335.field4800 = (-var3 + class416.field6134) / 2;
                class442.field6464 = var4;
                class39.field516 = 0;
            } else {
                class335.field4800 = 0;
                class442.field6464 = class638.field9262;
                class68.field1285 = class416.field6134;
                class39.field516 = 0;
            }
            if (class563.field8065 != class47.field657) {
                boolean var10000;
                if (~class68.field1285 > -1025 && class442.field6464 < 768) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            class474.field6795.setSize(class68.field1285, class442.field6464);
            if (class159.field2378 != null) {
                class159.field2378.method402(class474.field6795);
            }
            if (arg0 == -1025) {
                if (class327.field4718 == var1) {
                    Insets var5 = class327.field4718.getInsets();
                    class474.field6795.setLocation(var5.left - -class335.field4800, var5.top - -class39.field516);
                } else {
                    class474.field6795.setLocation(class335.field4800, class39.field516);
                }
                if (class609.field8659 != -1) {
                    class185.method1240(arg0 ^ -33793, true);
                }
                class629.method3560(-1);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lgp;BLqa;Lgp;)V")
    public static final void method3224(class561 arg0, byte arg1, class167 arg2, class561 arg3) {
        ++field8103;
        class258.field3751 = class446.method2633(class517.field7194, (byte) -64, arg0, 0);
        class380.field5593 = arg2.method626(class258.field3751, class518.method2924(arg3, class517.field7194, 0), true);
        if (arg1 != 11) {
            method3221(54, false, -95);
        }
        class106.field1780 = class446.method2633(class97.field1697, (byte) 111, arg0, 0);
        class409.field6077 = arg2.method626(class106.field1780, class518.method2924(arg3, class97.field1697, 0), true);
        class26.field358 = class446.method2633(class404.field6021, (byte) 93, arg0, 0);
        class273.field3996 = arg2.method626(class26.field358, class518.method2924(arg3, class404.field6021, 0), true);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLqa;)V")
    public final void method3225(boolean arg0, class167 arg1) {
        ++field8112;
        class560.method3148(arg1);
        if (super.field882 > 1) {
            for (int var3 = 0; ~var3 > ~super.field872; ++var3) {
                for (int var4 = 0; ~super.field880 < ~var4; ++var4) {
                    if (~(2 & class104.field1755[1][var3][var4]) == -3) {
                        class130.method1017(var3, var4);
                    }
                }
            }
        }
        if (arg0) {
            this.field8113 = 71;
        }
        for (int var5 = 0; ~var5 > ~super.field882; ++var5) {
            for (int var6 = 0; ~super.field880 <= ~var6; ++var6) {
                for (int var7 = 0; ~var7 >= ~super.field872; ++var7) {
                    if (~(super.field867[var5][var7][var6] & 1) != -1) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (super.field880 > var9 && (1 & super.field867[var5][var7][var9 + 1]) != 0) {
                            ++var9;
                        }
                        int var11 = var5;
                        while (var8 > 0 && ~(1 & super.field867[var5][var7][var8 + -1]) != -1) {
                            --var8;
                        }
                        label171: while (~var10 < -1) {
                            for (int var12 = var8; var12 <= var9; ++var12) {
                                if (~(super.field867[var10 + -1][var7][var12] & 1) == -1) {
                                    break label171;
                                }
                            }
                            --var10;
                        }
                        label160: while (var11 < 3) {
                            for (int var13 = var8; var13 <= var9; ++var13) {
                                if (~(super.field867[var11 + 1][var7][var13] & 1) == -1) {
                                    break label160;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (var9 + 1 - var8) * (-var10 + 1 + var11);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = super.field881[var11][var7][var8] + -var15;
                            int var17 = super.field881[var10][var7][var8];
                            class601.method3412(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) + 128, var16, var17);
                            for (int var18 = var10; ~var11 <= ~var18; ++var18) {
                                for (int var19 = var8; var19 <= var9; ++var19) {
                                    super.field867[var18][var7][var19] = (byte) class424.method2540(super.field867[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((2 & super.field867[var5][var7][var6]) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        int var23 = var5;
                        while (~var20 < -1 && (super.field867[var5][var20 + -1][var6] & 2) != 0) {
                            --var20;
                        }
                        while (~super.field872 < ~var21 && ~(super.field867[var5][var21 - -1][var6] & 2) != -1) {
                            ++var21;
                        }
                        label225: while (var22 > 0) {
                            for (int var24 = var20; ~var24 >= ~var21; ++var24) {
                                if (~(2 & super.field867[var22 + -1][var24][var6]) == -1) {
                                    break label225;
                                }
                            }
                            --var22;
                        }
                        label214: while (var23 < 3) {
                            for (int var25 = var20; var21 >= var25; ++var25) {
                                if (~(super.field867[var23 + 1][var25][var6] & 2) == -1) {
                                    break label214;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (-var20 + var21 - -1) * (-var22 + var23 - -1);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = super.field881[var23][var20][var6] + -var27;
                            int var29 = super.field881[var22][var20][var6];
                            class601.method3412(2, var20 << 7, (var21 << 7) + 128, var6 << 7, var6 << 7, var28, var29);
                            for (int var30 = var22; ~var30 >= ~var23; ++var30) {
                                for (int var31 = var20; ~var31 >= ~var21; ++var31) {
                                    super.field867[var30][var31][var6] = (byte) class424.method2540(super.field867[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((super.field867[var5][var7][var6] & 4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34;
                        for (var34 = var6; ~var34 < -1 && ~(4 & super.field867[var5][var7][var34 - 1]) != -1; --var34) {
                        }
                        int var35;
                        for (var35 = var6; ~super.field880 < ~var35 && (super.field867[var5][var7][var35 + 1] & 4) != 0; ++var35) {
                        }
                        label278: while (var32 > 0) {
                            for (int var36 = var34; var35 >= var36; ++var36) {
                                if (~(super.field867[var5][var32 + -1][var36] & 4) == -1) {
                                    break label278;
                                }
                            }
                            --var32;
                        }
                        label267: while (~var33 > ~super.field872) {
                            for (int var37 = var34; var37 <= var35; ++var37) {
                                if ((super.field867[var5][var33 + 1][var37] & 4) == 0) {
                                    break label267;
                                }
                            }
                            ++var33;
                        }
                        if ((-var34 + var35 - -1) * (var33 - var32 + 1) >= 4) {
                            int var38 = super.field881[var5][var32][var34];
                            class601.method3412(4, var32 << 7, (var33 << 7) - -128, var34 << 7, (var35 << 7) + 128, var38, var38);
                            for (int var39 = var32; var33 >= var39; ++var39) {
                                for (int var40 = var34; var35 >= var40; ++var40) {
                                    super.field867[var5][var39][var40] = (byte) class424.method2540(super.field867[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field867 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILqa;ILaea;III)V")
    public final void method3226(int arg0, class167 arg1, int arg2, class39 arg3, int arg4, int arg5, int arg6) {
        ++field8105;
        class231 var8 = null;
        if (arg6 > 107) {
            if (arg0 == 0) {
                var8 = (class231) class507.method2859(arg4, arg2, arg5);
            }
            if (arg0 == 1) {
                var8 = (class231) class485.method2786(arg4, arg2, arg5);
            }
            if (~arg0 == -3) {
                var8 = (class231) class460.method2691(arg4, arg2, arg5, field8114 != null ? field8114 : (field8114 = method3231("p")));
            }
            if (arg0 == 3) {
                var8 = (class231) class621.method3504(arg4, arg2, arg5);
            }
            if (var8 != null) {
                class370 var9 = class552.field7819.method2890(0, var8.method264(-25792));
                int var10 = var8.method269(-13265);
                int var11 = var8.method258((byte) -36);
                if (var9.method2249(-120)) {
                    class633.method3649(arg2, arg5, var9, true, arg4);
                }
                if (var8.method262(-21131)) {
                    var8.method268(true, arg1);
                }
                if (arg0 == 0) {
                    class363 var12 = class507.method2859(arg4, arg2, arg5);
                    if (!(var12 instanceof class121)) {
                        class214.method1452(arg4, arg2, arg5);
                    } else {
                        ((class121) var12).field1933 = null;
                    }
                    if (var9.field5292 != 0) {
                        arg3.method332(95, arg5, arg2, var10, !var9.field5330, var11, var9.field5315);
                        return;
                    }
                } else if (~arg0 != -2) {
                    if (arg0 == 2) {
                        class360 var13 = class460.method2691(arg4, arg2, arg5, field8114 != null ? field8114 : (field8114 = method3231("p")));
                        if (var13 instanceof class262 && var13.field5117 == arg2 && ~var13.field5113 == ~arg5) {
                            ((class262) var13).field3809 = null;
                        } else {
                            class222.method1485(arg4, arg2, arg5, field8114 != null ? field8114 : (field8114 = method3231("p")));
                        }
                        if (var9.field5292 != 0 && ~(var9.field5322 + arg2) > ~super.field872 && ~super.field880 < ~(arg5 - -var9.field5322) && ~super.field872 < ~(var9.field5277 + arg2) && super.field880 > var9.field5277 + arg5) {
                            arg3.method333(arg2, !var9.field5330, arg5, (byte) -44, var9.field5322, var11, var9.field5277, var9.field5315);
                            return;
                        }
                        return;
                    }
                    if (arg0 == 3) {
                        class493 var14 = class621.method3504(arg4, arg2, arg5);
                        if (!(var14 instanceof class409)) {
                            class432.method2579(arg4, arg2, arg5);
                        } else {
                            ((class409) var14).field6083 = null;
                        }
                        if (~var9.field5292 == -2) {
                            arg3.method334(20891, arg2, arg5);
                            return;
                        }
                    }
                } else {
                    class367 var15 = class485.method2786(arg4, arg2, arg5);
                    if (!(var15 instanceof class280)) {
                        class298.method1871(arg4, arg2, arg5);
                        return;
                    }
                    ((class280) var15).field4091 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILqa;IIIBLaea;IIII)V")
    public final void method3227(int arg0, class167 arg1, int arg2, int arg3, int arg4, byte arg5, class39 arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field8111;
        if (class202.field2854.method2628((byte) 68, class646.field9388) || class85.method774(arg2, arg3, (byte) 51, class466.field6714, arg9)) {
            if (arg5 != 106) {
                this.method3229(-55, 111, 59, -21, (class268) null, (int[]) null, (class167) null, -62, 121, (byte) -118, -89);
            }
            if (this.field8113 > arg0) {
                this.field8113 = arg0;
            }
            class370 var12 = class552.field7819.method2890(0, arg7);
            if (!arg1.method629() || !class202.field2854.field7893 || !var12.field5289) {
                int var13;
                int var14;
                if (arg8 != 1 && arg8 != 3) {
                    var13 = var12.field5277;
                    var14 = var12.field5322;
                } else {
                    var14 = var12.field5277;
                    var13 = var12.field5322;
                }
                int var15;
                int var16;
                if (~super.field872 <= ~(arg3 + var14)) {
                    var15 = (var14 + 1 >> 1) + arg3;
                    var16 = arg3 - -(var14 >> 1);
                } else {
                    var16 = arg3;
                    var15 = arg3 + 1;
                }
                int var17;
                int var18;
                if (super.field880 >= arg2 + var13) {
                    var17 = (var13 >> 1) + arg2;
                    var18 = (var13 - -1 >> 1) + arg2;
                } else {
                    var18 = arg2 + 1;
                    var17 = arg2;
                }
                class542 var19 = class88.field1594[arg9];
                int var20 = var19.method694(var16, var17) + (var19.method694(var15, var17) - -var19.method694(var16, var18) - -var19.method694(var15, var18)) >> 2;
                int var21 = (arg3 << 7) + (var14 << 6);
                int var22 = (arg2 << 7) - -(var13 << 6);
                boolean var23 = class69.field1306 && !super.field870 && var12.field5339;
                if (var12.method2249(arg5 + -214)) {
                    class589.method3371(arg3, arg8, var12, arg2, arg0, (class400) null, (byte) -98, (class170) null);
                }
                boolean var24 = ~arg10 == 0 && var12.field5280 == -1 && var12.field5343 == null && var12.field5272 == null && !var12.field5303;
                if (!class527.field7333 || (!class59.method479(arg4, arg5 + -110) || var12.field5287 == 1) && (!class481.method2769((byte) -106, arg4) || ~var12.field5287 != -1)) {
                    if (arg4 == 22) {
                        if (class202.field2854.field7902 || var12.field5276 != 0 || var12.field5292 == 1 || var12.field5336) {
                            class493 var25;
                            if (!var24) {
                                var25 = new class332(arg1, var12, arg0, arg9, var21, var20, var22, super.field870, arg8, arg10);
                            } else {
                                class543 var26 = new class543(arg1, var12, arg9, var21, var20, var22, super.field870, arg8, var23);
                                if (var26.method262(-21131)) {
                                    var26.method255(-97, arg1);
                                }
                                var25 = var26;
                            }
                            class493 var27 = class621.method3504(arg0, arg3, arg2);
                            if (var27 instanceof class409) {
                                ((class409) var27).field6083 = var25;
                            } else {
                                class561.method3162(arg0, arg3, arg2, var25);
                            }
                            if (~var12.field5292 == -2 && arg6 != null) {
                                arg6.method331(arg3, 262144, arg2);
                            }
                        }
                    } else if (arg4 != 10 && ~arg4 != -12) {
                        if (arg4 >= 12 && arg4 <= 17 || ~arg4 <= -19 && ~arg4 >= -22) {
                            class360 var29;
                            if (var24) {
                                class388 var28 = new class388(arg1, var12, arg0, arg9, var21, var20, var22, super.field870, arg3, arg3 - -var14 + -1, arg2, arg2 + -1 + var13, arg4, arg8, var23);
                                var29 = var28;
                                if (var28.method262(-21131)) {
                                    var28.method255(arg5 + -59, arg1);
                                }
                            } else {
                                var29 = new class390(arg1, var12, arg0, arg9, var21, var20, var22, super.field870, arg3, arg3 - (-var14 + 1), arg2, arg2 + var13 + -1, arg4, arg8, arg10);
                            }
                            class360 var30 = class460.method2691(arg0, arg3, arg2, field8114 != null ? field8114 : (field8114 = method3231("p")));
                            if (var30 instanceof class262 && var30.field5117 == arg3 && ~var30.field5113 == ~arg2) {
                                ((class262) var30).field3809 = var29;
                            } else {
                                client.method3524(var29, false);
                            }
                            if (class69.field1306 && !super.field870 && ~arg4 <= -13 && ~arg4 >= -18 && ~arg4 != -14 && arg0 > 0 && var12.field5287 != 0) {
                                super.field867[arg0][arg3][arg2] = (byte) class188.method1258(super.field867[arg0][arg3][arg2], 4);
                            }
                            if (var12.field5292 != 0 && arg6 != null) {
                                arg6.method339(arg3, arg2, var13, 0, var14, !var12.field5330, var12.field5315);
                            }
                        } else if (~arg4 == -1) {
                            int var31 = var12.field5287;
                            if (class639.field9272 && var12.field5287 == -1) {
                                var31 = 1;
                            }
                            class363 var32;
                            if (!var24) {
                                var32 = new class631(arg1, var12, arg0, arg9, var21, var20, var22, super.field870, arg4, arg8, arg10);
                            } else {
                                class265 var33 = new class265(arg1, var12, arg9, var21, var20, var22, super.field870, arg4, arg8, var23);
                                if (var33.method262(-21131)) {
                                    var33.method255(arg5 + -219, arg1);
                                }
                                var32 = var33;
                            }
                            class363 var34 = class507.method2859(arg0, arg3, arg2);
                            if (!(var34 instanceof class121)) {
                                class74.method714(arg0, arg3, arg2, var32, (class363) null);
                            } else {
                                ((class121) var34).field1933 = var32;
                            }
                            if (class69.field1306) {
                                if (arg8 != 0) {
                                    if (~arg8 != -2) {
                                        if (~arg8 == -3) {
                                            if (var12.field5346) {
                                                var19.method699(arg3 + 1, arg2, 50);
                                                var19.method699(arg3 + 1, arg2 + 1, 50);
                                            }
                                            if (var31 == 1 && !super.field870) {
                                                super.field867[arg0][arg3 - -1][arg2] = (byte) class188.method1258(super.field867[arg0][arg3 - -1][arg2], 1);
                                            }
                                        } else if (arg8 == 3) {
                                            if (var12.field5346) {
                                                var19.method699(arg3, arg2, 50);
                                                var19.method699(arg3 - -1, arg2, 50);
                                            }
                                            if (~var31 == -2 && !super.field870) {
                                                super.field867[arg0][arg3][arg2] = (byte) class188.method1258(super.field867[arg0][arg3][arg2], 2);
                                            }
                                        }
                                    } else {
                                        if (var12.field5346) {
                                            var19.method699(arg3, arg2 + 1, 50);
                                            var19.method699(arg3 + 1, arg2 + 1, 50);
                                        }
                                        if (var31 == 1 && !super.field870) {
                                            super.field867[arg0][arg3][arg2 + 1] = (byte) class188.method1258(super.field867[arg0][arg3][arg2 + 1], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field5346) {
                                        var19.method699(arg3, arg2, 50);
                                        var19.method699(arg3, arg2 + 1, 50);
                                    }
                                    if (var31 == 1 && !super.field870) {
                                        super.field867[arg0][arg3][arg2] = (byte) class188.method1258(super.field867[arg0][arg3][arg2], 1);
                                    }
                                }
                            }
                            if (var12.field5292 != 0 && arg6 != null) {
                                arg6.method336(arg3, arg8, !var12.field5330, arg2, arg5 + 12, var12.field5315, arg4);
                            }
                            if (var12.field5265 != 16) {
                                class216.method1462(arg0, arg3, arg2, var12.field5265);
                            }
                        } else if (arg4 == 1) {
                            class363 var36;
                            if (var24) {
                                class265 var35 = new class265(arg1, var12, arg9, var21, var20, var22, super.field870, arg4, arg8, var23);
                                if (var35.method262(-21131)) {
                                    var35.method255(119, arg1);
                                }
                                var36 = var35;
                            } else {
                                var36 = new class631(arg1, var12, arg0, arg9, var21, var20, var22, super.field870, arg4, arg8, arg10);
                            }
                            class363 var37 = class507.method2859(arg0, arg3, arg2);
                            if (!(var37 instanceof class121)) {
                                class74.method714(arg0, arg3, arg2, var36, (class363) null);
                            } else {
                                ((class121) var37).field1933 = var36;
                            }
                            if (var12.field5346 && class69.field1306) {
                                if (arg8 != 0) {
                                    if (~arg8 != -2) {
                                        if (~arg8 != -3) {
                                            if (~arg8 == -4) {
                                                var19.method699(arg3, arg2, 50);
                                            }
                                        } else {
                                            var19.method699(arg3 - -1, arg2, 50);
                                        }
                                    } else {
                                        var19.method699(arg3 + 1, arg2 + 1, 50);
                                    }
                                } else {
                                    var19.method699(arg3, arg2 - -1, 50);
                                }
                            }
                            if (~var12.field5292 != -1 && arg6 != null) {
                                arg6.method336(arg3, arg8, !var12.field5330, arg2, 90, var12.field5315, arg4);
                            }
                        } else if (arg4 == 2) {
                            int var38 = arg8 + 1 & 3;
                            class363 var41;
                            class363 var42;
                            if (var24) {
                                class265 var39 = new class265(arg1, var12, arg9, var21, var20, var22, super.field870, arg4, arg8 + 4, var23);
                                class265 var40 = new class265(arg1, var12, arg9, var21, var20, var22, super.field870, arg4, var38, var23);
                                if (var39.method262(-21131)) {
                                    var39.method255(arg5 ^ 16, arg1);
                                }
                                var41 = var40;
                                var42 = var39;
                                if (var40.method262(-21131)) {
                                    var40.method255(13, arg1);
                                }
                            } else {
                                var42 = new class631(arg1, var12, arg0, arg9, var21, var20, var22, super.field870, arg4, arg8 + 4, arg10);
                                var41 = new class631(arg1, var12, arg0, arg9, var21, var20, var22, super.field870, arg4, var38, arg10);
                            }
                            class74.method714(arg0, arg3, arg2, var42, var41);
                            if (~var12.field5287 == -2 && class69.field1306 && !super.field870) {
                                if (arg8 != 0) {
                                    if (~arg8 == -2) {
                                        super.field867[arg0][arg3][arg2 - -1] = (byte) class188.method1258(super.field867[arg0][arg3][arg2 - -1], 2);
                                        super.field867[arg0][arg3 + 1][arg2] = (byte) class188.method1258(super.field867[arg0][arg3 + 1][arg2], 1);
                                    } else if (arg8 == 2) {
                                        super.field867[arg0][arg3 + 1][arg2] = (byte) class188.method1258(super.field867[arg0][arg3 + 1][arg2], 1);
                                        super.field867[arg0][arg3][arg2] = (byte) class188.method1258(super.field867[arg0][arg3][arg2], 2);
                                    } else if (~arg8 == -4) {
                                        super.field867[arg0][arg3][arg2] = (byte) class188.method1258(super.field867[arg0][arg3][arg2], 2);
                                        super.field867[arg0][arg3][arg2] = (byte) class188.method1258(super.field867[arg0][arg3][arg2], 1);
                                    }
                                } else {
                                    super.field867[arg0][arg3][arg2] = (byte) class188.method1258(super.field867[arg0][arg3][arg2], 1);
                                    super.field867[arg0][arg3][arg2 + 1] = (byte) class188.method1258(super.field867[arg0][arg3][arg2 + 1], 2);
                                }
                            }
                            if (~var12.field5292 != -1 && arg6 != null) {
                                arg6.method336(arg3, arg8, !var12.field5330, arg2, arg5 + -5, var12.field5315, arg4);
                            }
                            if (~var12.field5265 != -17) {
                                class216.method1462(arg0, arg3, arg2, var12.field5265);
                            }
                        } else if (arg4 == 3) {
                            class363 var43;
                            if (!var24) {
                                var43 = new class631(arg1, var12, arg0, arg9, var21, var20, var22, super.field870, arg4, arg8, arg10);
                            } else {
                                class265 var44 = new class265(arg1, var12, arg9, var21, var20, var22, super.field870, arg4, arg8, var23);
                                var43 = var44;
                                if (var44.method262(-21131)) {
                                    var44.method255(55, arg1);
                                }
                            }
                            class363 var45 = class507.method2859(arg0, arg3, arg2);
                            if (var45 instanceof class121) {
                                ((class121) var45).field1933 = var43;
                            } else {
                                class74.method714(arg0, arg3, arg2, var43, (class363) null);
                            }
                            if (var12.field5346 && class69.field1306) {
                                if (arg8 != 0) {
                                    if (~arg8 != -2) {
                                        if (arg8 != 2) {
                                            if (arg8 == 3) {
                                                var19.method699(arg3, arg2, 50);
                                            }
                                        } else {
                                            var19.method699(arg3 - -1, arg2, 50);
                                        }
                                    } else {
                                        var19.method699(arg3 + 1, arg2 + 1, 50);
                                    }
                                } else {
                                    var19.method699(arg3, arg2 + 1, 50);
                                }
                            }
                            if (var12.field5292 != 0 && arg6 != null) {
                                arg6.method336(arg3, arg8, !var12.field5330, arg2, 69, var12.field5315, arg4);
                            }
                        } else if (arg4 == 9) {
                            class360 var47;
                            if (var24) {
                                class388 var46 = new class388(arg1, var12, arg0, arg9, var21, var20, var22, super.field870, arg3, arg3, arg2, arg2, arg4, arg8, var23);
                                var47 = var46;
                                if (var46.method262(-21131)) {
                                    var46.method255(33, arg1);
                                }
                            } else {
                                var47 = new class390(arg1, var12, arg0, arg9, var21, var20, var22, super.field870, arg3, arg3 + -1 + var14, arg2, arg2 - -var13 + -1, arg4, arg8, arg10);
                            }
                            class360 var48 = class460.method2691(arg0, arg3, arg2, field8114 != null ? field8114 : (field8114 = method3231("p")));
                            if (var48 instanceof class262 && ~var48.field5117 == ~arg3 && ~var48.field5113 == ~arg2) {
                                ((class262) var48).field3809 = var47;
                            } else {
                                client.method3524(var47, false);
                            }
                            if (~var12.field5292 != -1 && arg6 != null) {
                                arg6.method339(arg3, arg2, var13, 0, var14, !var12.field5330, var12.field5315);
                            }
                            if (~var12.field5265 != -17) {
                                class216.method1462(arg0, arg3, arg2, var12.field5265);
                            }
                        } else if (arg4 == 4) {
                            class367 var50;
                            if (var24) {
                                class339 var49 = new class339(arg1, var12, arg9, var21, var20, var22, super.field870, 0, 0, 0, arg4, arg8);
                                var50 = var49;
                                if (var49.method262(-21131)) {
                                    var49.method255(-89, arg1);
                                }
                            } else {
                                var50 = new class28(arg1, var12, arg0, arg9, var21, var20, var22, super.field870, 0, 0, 0, arg4, arg8, arg10);
                            }
                            class367 var51 = class485.method2786(arg0, arg3, arg2);
                            if (!(var51 instanceof class280)) {
                                class383.method2335(arg0, arg3, arg2, var50, (class367) null);
                            } else {
                                ((class280) var51).field4091 = var50;
                            }
                        } else if (arg4 == 5) {
                            int var52 = 17;
                            class231 var53 = (class231) class507.method2859(arg0, arg3, arg2);
                            if (var53 != null) {
                                var52 = 1 + class552.field7819.method2890(0, var53.method264(arg5 ^ -25814)).field5265;
                            }
                            class367 var54;
                            if (!var24) {
                                var54 = new class28(arg1, var12, arg0, arg9, var21, var20, var22, super.field870, 0, class310.field4554[arg8] * var52, class331.field4753[arg8] * var52, arg4, arg8, arg10);
                            } else {
                                class339 var55 = new class339(arg1, var12, arg9, var21, var20, var22, super.field870, 0, class310.field4554[arg8] * var52, class331.field4753[arg8] * var52, arg4, arg8);
                                var54 = var55;
                                if (var55.method262(-21131)) {
                                    var55.method255(arg5 + -83, arg1);
                                }
                            }
                            class367 var56 = class485.method2786(arg0, arg3, arg2);
                            if (var56 instanceof class280) {
                                ((class280) var56).field4091 = var54;
                            } else {
                                class383.method2335(arg0, arg3, arg2, var54, (class367) null);
                            }
                        } else if (~arg4 == -7) {
                            int var57 = 9;
                            class231 var58 = (class231) class507.method2859(arg0, arg3, arg2);
                            if (var58 != null) {
                                var57 = class552.field7819.method2890(0, var58.method264(-25792)).field5265 / 2 - -1;
                            }
                            class367 var59;
                            if (!var24) {
                                var59 = new class28(arg1, var12, arg0, arg9, var21, var20, var22, super.field870, arg8, class32.field441[arg8] * var57, class217.field3283[arg8] * var57, arg4, arg8 - -4, arg10);
                            } else {
                                class339 var60 = new class339(arg1, var12, arg9, var21, var20, var22, super.field870, arg8, class310.field4554[arg8] * var57, class331.field4753[arg8] * var57, arg4, arg8 + 4);
                                var59 = var60;
                                if (var60.method262(-21131)) {
                                    var60.method255(-103, arg1);
                                }
                            }
                            class367 var61 = class485.method2786(arg0, arg3, arg2);
                            if (!(var61 instanceof class280)) {
                                class383.method2335(arg0, arg3, arg2, var59, (class367) null);
                            } else {
                                ((class280) var61).field4091 = var59;
                            }
                        } else if (~arg4 == -8) {
                            int var62 = 3 & arg8 - -2;
                            class367 var64;
                            if (var24) {
                                class339 var63 = new class339(arg1, var12, arg9, var21, var20, var22, super.field870, var62, 0, 0, arg4, var62 - -4);
                                var64 = var63;
                                if (var63.method262(-21131)) {
                                    var63.method255(-106, arg1);
                                }
                            } else {
                                var64 = new class28(arg1, var12, arg0, arg9, var21, var20, var22, super.field870, var62, 0, 0, arg4, var62 - -4, arg10);
                            }
                            class367 var65 = class485.method2786(arg0, arg3, arg2);
                            if (!(var65 instanceof class280)) {
                                class383.method2335(arg0, arg3, arg2, var64, (class367) null);
                            } else {
                                ((class280) var65).field4091 = var64;
                            }
                        } else if (~arg4 == -9) {
                            int var66 = 3 & arg8 + 2;
                            int var67 = 9;
                            class231 var68 = (class231) class507.method2859(arg0, arg3, arg2);
                            if (var68 != null) {
                                var67 = 1 + class552.field7819.method2890(0, var68.method264(arg5 + -25898)).field5265 / 2;
                            }
                            class367 var71;
                            class367 var72;
                            if (var24) {
                                class339 var69 = new class339(arg1, var12, arg9, var21, var20, var22, super.field870, arg8, class32.field441[arg8] * var67, class217.field3283[arg8] * var67, arg4, arg8 + 4);
                                class339 var70 = new class339(arg1, var12, arg9, var21, var20, var22, super.field870, arg8, 0, 0, arg4, var66 - -4);
                                if (var69.method262(-21131)) {
                                    var69.method255(-105, arg1);
                                }
                                var71 = var69;
                                if (var70.method262(-21131)) {
                                    var70.method255(-125, arg1);
                                }
                                var72 = var70;
                            } else {
                                class28 var73 = new class28(arg1, var12, arg0, arg9, var21, var20, var22, super.field870, arg8, class32.field441[arg8] * var67, class217.field3283[arg8] * var67, arg4, arg8 + 4, arg10);
                                class28 var74 = new class28(arg1, var12, arg0, arg9, var21, var20, var22, super.field870, arg8, 0, 0, arg4, var66 - -4, arg10);
                                var71 = var73;
                                var72 = var74;
                            }
                            class383.method2335(arg0, arg3, arg2, var71, var72);
                        }
                    } else {
                        class388 var75 = null;
                        int var77;
                        class360 var78;
                        if (var24) {
                            class388 var76 = new class388(arg1, var12, arg0, arg9, var21, var20, var22, super.field870, arg3, arg3 + var14 - 1, arg2, arg2 + -1 - -var13, arg4, arg8, var23);
                            var75 = var76;
                            var77 = var76.method2349(true);
                            var78 = var76;
                        } else {
                            var78 = new class390(arg1, var12, arg0, arg9, var21, var20, var22, super.field870, arg3, arg3 + -1 + var14, arg2, arg2 + var13 + -1, arg4, arg8, arg10);
                            var77 = 15;
                        }
                        class360 var79 = class460.method2691(arg0, arg3, arg2, field8114 != null ? field8114 : (field8114 = method3231("p")));
                        boolean var80 = false;
                        if (var79 instanceof class262 && var79.field5117 == arg3 && var79.field5113 == arg2) {
                            var80 = true;
                            ((class262) var79).field3809 = var78;
                        }
                        if (var80 || client.method3524(var78, false)) {
                            if (var75 != null && var75.method262(-21131)) {
                                var75.method255(arg5 + 15, arg1);
                            }
                            if (var12.field5346 && class69.field1306) {
                                if (~var77 < -31) {
                                    var77 = 30;
                                }
                                for (int var81 = 0; var14 >= var81; ++var81) {
                                    for (int var82 = 0; var82 <= var13; ++var82) {
                                        var19.method699(arg3 + var81, arg2 - -var82, var77);
                                    }
                                }
                            }
                        }
                        if (~var12.field5292 != -1 && arg6 != null) {
                            arg6.method339(arg3, arg2, var13, 0, var14, !var12.field5330, var12.field5315);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([Laea;Lqa;I[BBI)V")
    public final void method3228(class39[] arg0, class167 arg1, int arg2, byte[] arg3, byte arg4, int arg5) {
        ++field8110;
        class268 var7 = new class268(arg3);
        int var8 = -1;
        if (arg4 != 54) {
            this.field8113 = 49;
        }
        while (true) {
            int var9 = var7.method1717(32767);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1749((byte) -105);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = 63 & var10;
                int var13 = (var10 & 4060) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method1738(arg4 + 201);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = arg2 + var13;
                int var19 = var12 - -arg5;
                if (~var18 < -1 && var19 > 0 && var18 < super.field872 + -1 && var19 < super.field880 + -1) {
                    class39 var20 = null;
                    if (!super.field870) {
                        int var21 = var14;
                        if ((2 & class104.field1755[1][var18][var19]) == 2) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg0[var21];
                        }
                    }
                    this.method3227(var14, arg1, var19, var18, var16, (byte) 106, var20, var8, var17, var14, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIILco;[ILqa;IIBI)V")
    public final void method3229(int arg0, int arg1, int arg2, int arg3, class268 arg4, int[] arg5, class167 arg6, int arg7, int arg8, byte arg9, int arg10) {
        ++field8109;
        if (!super.field870) {
            boolean var12 = false;
            if (arg9 <= -60) {
                class366 var13 = null;
                if (arg5 != null) {
                    arg5[0] = -1;
                }
                int var14 = (7 & arg2) * 8;
                int var15 = (arg7 & 7) * 8;
                while (true) {
                    while (true) {
                        while (true) {
                            while (true) {
                                while (~arg4.field3913 > ~arg4.field3952.length) {
                                    int var20 = arg4.method1738(255);
                                    if (var20 != 0) {
                                        if (var20 != 1) {
                                            if (~var20 != -3) {
                                                if (~var20 != -129) {
                                                    if (var20 != 129) {
                                                        throw new IllegalStateException("");
                                                    }
                                                    if (super.field886 == null) {
                                                        super.field886 = new byte[4][][];
                                                    }
                                                    for (int var21 = 0; ~var21 > -5; ++var21) {
                                                        byte var22 = arg4.method1714(-31536);
                                                        if (var22 == 0 && super.field886[arg3] != null) {
                                                            if (var21 <= arg1) {
                                                                int var23 = arg0;
                                                                int var24 = arg0 - -7;
                                                                int var25 = arg10;
                                                                if (arg10 < 0) {
                                                                    var25 = 0;
                                                                } else if (~super.field880 >= ~arg10) {
                                                                    var25 = super.field880;
                                                                }
                                                                if (arg0 >= 0) {
                                                                    if (arg0 >= super.field872) {
                                                                        var23 = super.field872;
                                                                    }
                                                                } else {
                                                                    var23 = 0;
                                                                }
                                                                int var26 = arg10 + 7;
                                                                if (~var24 <= -1) {
                                                                    if (~super.field872 >= ~var24) {
                                                                        var24 = super.field872;
                                                                    }
                                                                } else {
                                                                    var24 = 0;
                                                                }
                                                                if (var26 >= 0) {
                                                                    if (super.field880 <= var26) {
                                                                        var26 = super.field880;
                                                                    }
                                                                } else {
                                                                    var26 = 0;
                                                                }
                                                                while (var24 > var23) {
                                                                    while (var26 > var25) {
                                                                        super.field886[arg3][var23][var25] = 0;
                                                                        ++var25;
                                                                    }
                                                                    ++var23;
                                                                }
                                                            }
                                                        } else if (var22 == 1) {
                                                            if (super.field886[arg3] == null) {
                                                                super.field886[arg3] = new byte[super.field872 - -1][super.field880 + 1];
                                                            }
                                                            for (int var27 = 0; var27 < 64; var27 += 4) {
                                                                for (int var28 = 0; ~var28 > -65; var28 += 4) {
                                                                    byte var29 = arg4.method1714(-31536);
                                                                    if (~arg1 <= ~var21) {
                                                                        for (int var30 = var27; var30 < var27 + 4; ++var30) {
                                                                            for (int var31 = var28; var31 < var28 - -4; ++var31) {
                                                                                if (var14 <= var30 && ~(var14 + 8) < ~var30 && ~var31 <= ~var15 && ~(var15 - -8) < ~var15) {
                                                                                    int var32 = arg0 - -class466.method2714(7 & var30, 7 & var31, -23183, arg8);
                                                                                    int var33 = arg10 - -class335.method2063(-27960, 7 & var30, 7 & var31, arg8);
                                                                                    if (~var32 <= -1 && ~var32 > ~super.field872 && var33 >= 0 && ~super.field880 < ~var33) {
                                                                                        super.field886[arg3][var32][var33] = var29;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (arg5 != null) {
                                                    arg5[0] = arg4.method1745(32132);
                                                    arg5[1] = arg4.method1730(13436);
                                                    arg5[2] = arg4.method1730(13436);
                                                    arg5[3] = arg4.method1730(13436);
                                                    arg5[4] = arg4.method1745(32132);
                                                } else {
                                                    arg4.field3913 += 10;
                                                }
                                            } else {
                                                if (var13 == null) {
                                                    var13 = new class366();
                                                }
                                                var13.method2213(arg4, (byte) -119);
                                            }
                                        } else {
                                            int var34 = arg4.method1738(255);
                                            if (var34 > 0) {
                                                for (int var35 = 0; var35 < var34; ++var35) {
                                                    class624 var36 = new class624(arg6, arg4, 0);
                                                    if (var36.field8802 == 31) {
                                                        class136 var37 = class639.field9269.method2724((byte) -74, arg4.method1745(32132));
                                                        var36.method3540(-28197, var37.field2169, var37.field2177, var37.field2172, var37.field2171);
                                                    }
                                                    if (arg6.method612() > 0) {
                                                        class637 var38 = var36.field8805;
                                                        int var39 = var38.method3681(-27102) >> 7;
                                                        int var40 = var38.method3677(-26984) >> 7;
                                                        if (var36.field8804 == arg1 && ~var39 <= ~var14 && ~var39 > ~(var14 + 8) && ~var40 <= ~var15 && var40 < var15 + 8) {
                                                            int var41 = class302.method1884(arg8, var38.method3681(-27102) & 1023, 48, 1023 & var38.method3677(-26984)) + (arg0 << 7);
                                                            int var42 = class403.method2458(1023 & var38.method3677(-26984), 1023 & var38.method3681(-27102), -80, arg8) + (arg10 << 7);
                                                            int var43 = var41 >> 7;
                                                            int var44 = var42 >> 7;
                                                            if (~var43 <= -1 && ~var44 <= -1 && var43 < super.field872 && super.field880 > var44) {
                                                                var38.method448(super.field881[arg1][var43][var44] - var38.method3682(false), var41, var42, (byte) 24);
                                                                class28.method256(var36);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        var13 = new class366(arg4);
                                    }
                                }
                                if (var13 != null) {
                                    class175.method1204((byte) 56, var13, arg0 >> 3, arg10 >> 3);
                                }
                                if (!var12 && super.field886 != null && super.field886[arg3] != null) {
                                    int var16 = arg0 + 7;
                                    int var17 = arg10 + 7;
                                    for (int var18 = arg0; ~var18 > ~var16; ++var18) {
                                        for (int var19 = arg10; var19 < var17; ++var19) {
                                            super.field886[arg3][var18][var19] = 0;
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
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IILqa;IIII[Laea;[BII)V")
    public final void method3230(int arg0, int arg1, class167 arg2, int arg3, int arg4, int arg5, int arg6, class39[] arg7, byte[] arg8, int arg9, int arg10) {
        ++field8108;
        if (arg10 >= -59) {
            this.field8113 = 65;
        }
        class268 var12 = new class268(arg8);
        int var13 = -1;
        while (true) {
            int var14 = var12.method1717(32767);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1749((byte) -37);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = (var15 & 4093) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method1738(255);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (~arg1 == ~var19 && ~var18 <= ~arg0 && ~(arg0 + 8) < ~var18 && ~arg6 >= ~var17 && ~var17 > ~(arg6 + 8)) {
                    class370 var23 = class552.field7819.method2890(0, var13);
                    int var24 = class230.method1514(arg9, 7 & var18, var17 & 7, var22, var23.field5322, var23.field5277, (byte) 38) + arg4;
                    int var25 = class261.method1659(7 & var18, var23.field5277, var23.field5322, true, var22, 7 & var17, arg9) + arg3;
                    if (var24 > 0 && ~var25 < -1 && var24 < super.field872 + -1 && var25 < super.field880 + -1) {
                        class39 var26 = null;
                        if (!super.field870) {
                            int var27 = arg5;
                            if ((class104.field1755[1][var24][var25] & 2) == 2) {
                                var27 = arg5 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg7[var27];
                            }
                        }
                        this.method3227(arg5, arg2, var25, var24, var21, (byte) 106, var26, var13, arg9 + var22 & 3, arg5, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIZ)V")
    public class568(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class275.field4027, class540.field7521);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3231(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
