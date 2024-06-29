import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class277 extends class95 {

    @OriginalMember(owner = "client!jda", name = "X", descriptor = "I")
    public int field3626 = 99;

    @OriginalMember(owner = "client!jda", name = "N", descriptor = "[I")
    public static int[] field3616 = new int[2];

    @OriginalMember(owner = "client!jda", name = "W", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!jda", name = "J", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!jda", name = "L", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!jda", name = "M", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!jda", name = "O", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!jda", name = "P", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!jda", name = "Q", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!jda", name = "R", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!jda", name = "S", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!jda", name = "T", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!jda", name = "U", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!jda", name = "V", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!jda", name = "H", descriptor = "Lkr;")
    public static class329 field3612;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jda", name = "Y", descriptor = "Ljava/lang/Class;")
    public static Class field3627;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lge;Lqa;[IIIIIIIII)V")
    public final void method1707(class551 arg0, class167 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg9 != 14546) {
            field3625 = 48;
        }
        ++field3613;
        if (!super.field1257) {
            boolean var12 = false;
            class266 var13 = null;
            if (arg2 != null) {
                arg2[0] = -1;
            }
            int var14 = (arg10 & 7) * 8;
            int var15 = (7 & arg3) * 8;
            while (true) {
                while (arg0.field7707 < arg0.field7693.length) {
                    int var20 = arg0.method3045(-126);
                    if (~var20 == -1) {
                        var13 = new class266(arg0);
                    } else if (~var20 == -2) {
                        int var21 = arg0.method3045(-125);
                        if (var21 > 0) {
                            for (int var22 = 0; var21 > var22; ++var22) {
                                class597 var23 = new class597(arg1, arg0, 2);
                                if (~var23.field8618 == -32) {
                                    class281 var24 = class192.field2492.method1322(arg9 ^ -9902, arg0.method3090(-122));
                                    var23.method3435(var24.field3677, var24.field3679, var24.field3675, var24.field3680, (byte) 123);
                                }
                                if (arg1.method914() > 0) {
                                    class592 var25 = var23.field8621;
                                    int var26 = var25.method3414(232) >> 9;
                                    int var27 = var25.method3415((byte) 117) >> 9;
                                    if (var23.field8612 == arg5 && ~var14 >= ~var26 && ~(var14 + 8) < ~var26 && var27 >= var15 && var27 < var15 + 8) {
                                        int var28 = (arg6 << 9) - -class620.method3556(var25.method3414(232) & 4095, 15199, var25.method3415((byte) 117) & 4095, arg4);
                                        int var29 = var28 >> 9;
                                        int var30 = (arg8 << 9) + class21.method121(4095 & var25.method3414(232), 8963, arg4, var25.method3415((byte) 117) & 4095);
                                        int var31 = var30 >> 9;
                                        if (~var29 <= -1 && var31 >= 0 && ~var29 > ~super.field1255 && ~var31 > ~super.field1279) {
                                            var25.method551(var30, super.field1277[arg5][var29][var31] + -var25.method3416(arg9 + -14548), (byte) -10, var28);
                                            class35.method208(var23);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~var20 == -3) {
                        if (var13 == null) {
                            var13 = new class266();
                        }
                        var13.method1636(arg0, 0);
                    } else if (~var20 == -129) {
                        if (arg2 != null) {
                            arg2[0] = arg0.method3090(-77);
                            arg2[1] = arg0.method3087(true);
                            arg2[2] = arg0.method3087(true);
                            arg2[3] = arg0.method3087(true);
                            arg2[4] = arg0.method3090(-81);
                        } else {
                            arg0.field7707 += 10;
                        }
                    } else {
                        if (~var20 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field1283 == null) {
                            super.field1283 = new byte[4][][];
                        }
                        for (int var32 = 0; ~var32 > -5; ++var32) {
                            byte var33 = arg0.method3051((byte) -112);
                            if (~var33 == -1 && super.field1283[arg7] != null) {
                                if (~var32 >= ~arg5) {
                                    int var34 = arg6;
                                    int var35 = arg6 - -7;
                                    int var36 = arg8;
                                    if (var35 < 0) {
                                        var35 = 0;
                                    } else if (var35 >= super.field1255) {
                                        var35 = super.field1255;
                                    }
                                    if (~arg6 > -1) {
                                        var34 = 0;
                                    } else if (~super.field1255 >= ~arg6) {
                                        var34 = super.field1255;
                                    }
                                    int var37 = arg8 + 7;
                                    if (arg8 >= 0) {
                                        if (~super.field1279 >= ~arg8) {
                                            var36 = super.field1279;
                                        }
                                    } else {
                                        var36 = 0;
                                    }
                                    if (~var37 > -1) {
                                        var37 = 0;
                                    } else if (~super.field1279 >= ~var37) {
                                        var37 = super.field1279;
                                    }
                                    while (~var34 > ~var35) {
                                        while (~var37 < ~var36) {
                                            super.field1283[arg7][var34][var36] = 0;
                                            ++var36;
                                        }
                                        ++var34;
                                    }
                                }
                            } else if (var33 == 1) {
                                if (super.field1283[arg7] == null) {
                                    super.field1283[arg7] = new byte[super.field1255 - -1][super.field1279 + 1];
                                }
                                for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                    for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                        byte var40 = arg0.method3051((byte) 119);
                                        if (arg5 >= var32) {
                                            for (int var41 = var38; ~var41 > ~(var38 + 4); ++var41) {
                                                for (int var42 = var39; ~var42 > ~(var39 + 4); ++var42) {
                                                    if (var14 <= var41 && var14 - -8 > var41 && var42 >= var15 && var15 < var15 + 8) {
                                                        int var43 = class449.method2618(-81, arg4, var42 & 7, var41 & 7) + arg6;
                                                        int var44 = arg8 - -class506.method2833((byte) 89, 7 & var42, 7 & var41, arg4);
                                                        if (var43 >= 0 && super.field1255 > var43 && ~var44 <= -1 && ~super.field1279 < ~var44) {
                                                            super.field1283[arg7][var43][var44] = var40;
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
                    class52.method284(arg8 >> 3, var13, -33, arg6 >> 3);
                }
                if (!var12 && super.field1283 != null && super.field1283[arg7] != null) {
                    int var16 = arg6 - -7;
                    int var17 = arg8 - -7;
                    for (int var18 = arg6; var18 < var16; ++var18) {
                        for (int var19 = arg8; var17 > var19; ++var19) {
                            super.field1283[arg7][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V")
    public static final void method1708(int arg0) {
        ++field3621;
        class29.method175(-21, class301.field3918, (long) class7.field61);
        if (~class126.field1565 != 0) {
            class324.method2009((byte) 45, class126.field1565);
        }
        for (int var1 = 0; var1 < class161.field2051; ++var1) {
            if (class99.field1326[var1]) {
                class584.field8455[var1] = true;
            }
            class202.field2644[var1] = class99.field1326[var1];
            class99.field1326[var1] = false;
        }
        if (arg0 != 1363) {
            method1714((byte[]) null, -54, 64, -104, 15, -73, -87);
        }
        class592.field8557 = class7.field61;
        if (class301.field3918.method195()) {
            class60.field829 = true;
        }
        if (~class126.field1565 != 0) {
            class161.field2051 = 0;
            class207.method1321((byte) 2);
        }
        class301.field3918.method962();
        class115.method614(class301.field3918, -121);
        int var2 = class406.method2423(arg0 + -12028);
        if (~var2 == 0) {
            var2 = class48.field659;
        }
        if (~var2 == 0) {
            var2 = class646.field9349;
        }
        class211.method1344(98, var2);
        class153.field1999 = 0;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I[ILqa;Lge;II)V")
    public final void method1709(int arg0, int[] arg1, class167 arg2, class551 arg3, int arg4, int arg5) {
        ++field3617;
        if (!super.field1257) {
            boolean var7 = false;
            if (arg1 != null) {
                arg1[0] = -1;
            }
            class266 var8 = null;
            while (true) {
                int var20;
                label312: do {
                    while (true) {
                        while (arg3.field7707 < arg3.field7693.length) {
                            int var19 = arg3.method3045(-126);
                            if (var19 != 0) {
                                if (~var19 == -2) {
                                    var20 = arg3.method3045(-125);
                                    continue label312;
                                }
                                if (~var19 == -3) {
                                    if (var8 == null) {
                                        var8 = new class266();
                                    }
                                    var8.method1636(arg3, 0);
                                } else if (~var19 == -129) {
                                    if (arg1 != null) {
                                        arg1[0] = arg3.method3090(-72);
                                        arg1[1] = arg3.method3087(true);
                                        arg1[2] = arg3.method3087(true);
                                        arg1[3] = arg3.method3087(true);
                                        arg1[4] = arg3.method3090(-104);
                                    } else {
                                        arg3.field7707 += 10;
                                    }
                                } else {
                                    if (var19 != 129) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field1283 == null) {
                                        super.field1283 = new byte[4][][];
                                    }
                                    for (int var29 = 0; ~var29 > -5; ++var29) {
                                        byte var30 = arg3.method3051((byte) 99);
                                        if (~var30 == -1 && super.field1283[var29] != null) {
                                            int var31 = arg4;
                                            int var32 = arg4 - -64;
                                            int var33 = arg5;
                                            if (~arg4 <= -1) {
                                                if (~super.field1255 >= ~arg4) {
                                                    var31 = super.field1255;
                                                }
                                            } else {
                                                var31 = 0;
                                            }
                                            int var34 = arg5 + 64;
                                            if (var32 < 0) {
                                                var32 = 0;
                                            } else if (super.field1255 <= var32) {
                                                var32 = super.field1255;
                                            }
                                            if (~arg5 > -1) {
                                                var33 = 0;
                                            } else if (~arg5 <= ~super.field1279) {
                                                var33 = super.field1279;
                                            }
                                            if (~var34 > -1) {
                                                var34 = 0;
                                            } else if (~var34 <= ~super.field1279) {
                                                var34 = super.field1279;
                                            }
                                            while (var32 > var31) {
                                                while (~var34 < ~var33) {
                                                    super.field1283[var29][var31][var33] = 0;
                                                    ++var33;
                                                }
                                                ++var31;
                                            }
                                        } else if (var30 == 1) {
                                            if (super.field1283[var29] == null) {
                                                super.field1283[var29] = new byte[super.field1255 - -1][super.field1279 - -1];
                                            }
                                            for (int var35 = 0; ~var35 > -65; var35 += 4) {
                                                for (int var36 = 0; ~var36 > -65; var36 += 4) {
                                                    byte var37 = arg3.method3051((byte) 82);
                                                    for (int var38 = var35 - -arg4; ~var38 > ~(arg4 + var35 + 4); ++var38) {
                                                        for (int var39 = arg5 + var36; ~var39 > ~(arg5 + 4 + var36); ++var39) {
                                                            if (~var38 <= -1 && var38 < super.field1255 && ~var39 <= -1 && var39 < super.field1279) {
                                                                super.field1283[var29][var38][var39] = var37;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (~var30 == -3) {
                                            if (super.field1283[var29] == null) {
                                                super.field1283[var29] = new byte[super.field1255 + 1][super.field1279 - -1];
                                            }
                                            if (~var29 < -1) {
                                                int var40 = arg4;
                                                int var41 = arg4 + 64;
                                                int var42 = arg5;
                                                if (~arg4 <= -1) {
                                                    if (~super.field1255 >= ~arg4) {
                                                        var40 = super.field1255;
                                                    }
                                                } else {
                                                    var40 = 0;
                                                }
                                                int var43 = arg5 + 64;
                                                if (arg5 >= 0) {
                                                    if (super.field1279 <= arg5) {
                                                        var42 = super.field1279;
                                                    }
                                                } else {
                                                    var42 = 0;
                                                }
                                                if (~var41 > -1) {
                                                    var41 = 0;
                                                } else if (~var41 <= ~super.field1255) {
                                                    var41 = super.field1255;
                                                }
                                                if (~var43 <= -1) {
                                                    if (super.field1279 <= var43) {
                                                        var43 = super.field1279;
                                                    }
                                                } else {
                                                    var43 = 0;
                                                }
                                                while (~var41 < ~var40) {
                                                    while (var42 < var43) {
                                                        super.field1283[var29][var40][var42] = super.field1283[var29 - 1][var40][var42];
                                                        ++var42;
                                                    }
                                                    ++var40;
                                                }
                                            }
                                        }
                                    }
                                    var7 = true;
                                }
                            } else {
                                var8 = new class266(arg3);
                            }
                        }
                        if (var8 != null) {
                            for (int var9 = 0; ~var9 > -9; ++var9) {
                                for (int var10 = 0; var10 < 8; ++var10) {
                                    int var11 = (arg4 >> 3) + var9;
                                    int var12 = (arg5 >> 3) + var10;
                                    if (var11 >= 0 && var11 < super.field1255 >> 3 && var12 >= 0 && super.field1279 >> 3 > var12) {
                                        class52.method284(var12, var8, -55, var11);
                                    }
                                }
                            }
                        }
                        if (!var7 && super.field1283 != null) {
                            for (int var13 = 0; ~var13 > -5; ++var13) {
                                if (super.field1283[var13] != null) {
                                    for (int var14 = 0; var14 < 16; ++var14) {
                                        for (int var15 = 0; var15 < 16; ++var15) {
                                            int var16 = (arg4 >> 2) + var14;
                                            int var17 = (arg5 >> 2) + var15;
                                            if (var16 >= 0 && ~var16 > -27 && ~var17 <= -1 && ~var17 > -27) {
                                                super.field1283[var13][var16][var17] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        int var18 = -26 % ((arg0 - 44) / 35);
                        return;
                    }
                } while (~var20 >= -1);
                for (int var21 = 0; ~var21 > ~var20; ++var21) {
                    class597 var22 = new class597(arg2, arg3, 2);
                    if (var22.field8618 == 31) {
                        class281 var23 = class192.field2492.method1322(-7808, arg3.method3090(-122));
                        var22.method3435(var23.field3677, var23.field3679, var23.field3675, var23.field3680, (byte) 121);
                    }
                    if (arg2.method914() > 0) {
                        class592 var24 = var22.field8621;
                        int var25 = var24.method3414(232) - -(arg4 << 9);
                        int var26 = var24.method3415((byte) 117) - -(arg5 << 9);
                        int var27 = var25 >> 9;
                        int var28 = var26 >> 9;
                        if (var27 >= 0 && ~var28 <= -1 && var27 < super.field1255 && ~super.field1279 < ~var28) {
                            var24.method551(var26, super.field1277[var22.field8612][var27][var28] - var24.method3416(-2), (byte) -10, var25);
                            class35.method208(var22);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(IIIZ)V")
    public class277(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class552.field7724, class39.field585);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lqa;B)V")
    public final void method1710(class167 arg0, byte arg1) {
        ++field3623;
        class29.method174(arg0);
        if (super.field1271 > 1) {
            for (int var3 = 0; ~var3 > ~super.field1255; ++var3) {
                for (int var4 = 0; var4 < super.field1279; ++var4) {
                    if (~(class310.field3971[1][var3][var4] & 2) == -3) {
                        class375.method2295(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; super.field1271 > var5; ++var5) {
            for (int var6 = 0; super.field1279 >= var6; ++var6) {
                for (int var7 = 0; super.field1255 >= var7; ++var7) {
                    if (~(super.field1270[var5][var7][var6] & 1) != -1) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        int var11 = var5;
                        while (var8 > 0 && (1 & super.field1270[var5][var7][var8 + -1]) != 0) {
                            --var8;
                        }
                        while (~var9 > ~super.field1279 && ~(super.field1270[var5][var7][var9 - -1] & 1) != -1) {
                            ++var9;
                        }
                        label170: while (~var10 < -1) {
                            for (int var12 = var8; var12 <= var9; ++var12) {
                                if (~(super.field1270[var10 + -1][var7][var12] & 1) == -1) {
                                    break label170;
                                }
                            }
                            --var10;
                        }
                        label159: while (var11 < 3) {
                            for (int var13 = var8; ~var13 >= ~var9; ++var13) {
                                if ((super.field1270[var11 + 1][var7][var13] & 1) == 0) {
                                    break label159;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (-var8 + var9 + 1) * (-var10 + var11 + 1);
                        if (~var14 <= -3) {
                            short var15 = 960;
                            int var16 = super.field1277[var11][var7][var8] + -var15;
                            int var17 = super.field1277[var10][var7][var8];
                            class354.method2210(1, var7 << 9, var7 << 9, var8 << 9, (var9 << 9) + 512, var16, var17);
                            for (int var18 = var10; var11 >= var18; ++var18) {
                                for (int var19 = var8; ~var19 >= ~var9; ++var19) {
                                    super.field1270[var18][var7][var19] = (byte) class143.method783(super.field1270[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if (~(2 & super.field1270[var5][var7][var6]) != -1) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (~var20 < -1 && (2 & super.field1270[var5][var20 + -1][var6]) != 0) {
                            --var20;
                        }
                        while (~var21 > ~super.field1255 && ~(2 & super.field1270[var5][var21 - -1][var6]) != -1) {
                            ++var21;
                        }
                        int var23 = var5;
                        label223: while (~var22 < -1) {
                            for (int var24 = var20; var21 >= var24; ++var24) {
                                if ((2 & super.field1270[var22 - 1][var24][var6]) == 0) {
                                    break label223;
                                }
                            }
                            --var22;
                        }
                        label212: while (~var23 > -4) {
                            for (int var25 = var20; var21 >= var25; ++var25) {
                                if (~(2 & super.field1270[var23 + 1][var25][var6]) == -1) {
                                    break label212;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (var21 - var20 + 1) * (var23 - -1 + -var22);
                        if (var26 >= 2) {
                            short var27 = 960;
                            int var28 = super.field1277[var23][var20][var6] - var27;
                            int var29 = super.field1277[var22][var20][var6];
                            class354.method2210(2, var20 << 9, (var21 << 9) + 512, var6 << 9, var6 << 9, var28, var29);
                            for (int var30 = var22; ~var30 >= ~var23; ++var30) {
                                for (int var31 = var20; var21 >= var31; ++var31) {
                                    super.field1270[var30][var31][var6] = (byte) class143.method783(super.field1270[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if (~(4 & super.field1270[var5][var7][var6]) != -1) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (var34 > 0 && (4 & super.field1270[var5][var7][var34 + -1]) != 0) {
                            --var34;
                        }
                        while (var35 < super.field1279 && ~(super.field1270[var5][var7][var35 + 1] & 4) != -1) {
                            ++var35;
                        }
                        label277: while (var32 > 0) {
                            for (int var36 = var34; var36 <= var35; ++var36) {
                                if ((super.field1270[var5][var32 + -1][var36] & 4) == 0) {
                                    break label277;
                                }
                            }
                            --var32;
                        }
                        label266: while (~super.field1255 < ~var33) {
                            for (int var37 = var34; var35 >= var37; ++var37) {
                                if ((super.field1270[var5][var33 + 1][var37] & 4) == 0) {
                                    break label266;
                                }
                            }
                            ++var33;
                        }
                        if ((-var32 + var33 + 1) * (-var34 + var35 + 1) >= 4) {
                            int var38 = super.field1277[var5][var32][var34];
                            class354.method2210(4, var32 << 9, (var33 << 9) + 512, var34 << 9, (var35 << 9) + 512, var38, var38);
                            for (int var39 = var32; var33 >= var39; ++var39) {
                                for (int var40 = var34; ~var35 <= ~var40; ++var40) {
                                    super.field1270[var5][var39][var40] = (byte) class143.method783(super.field1270[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 < 17) {
            method1715(10);
        }
        super.field1270 = null;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILfd;Lqa;IIII)V")
    public final void method1711(int arg0, class143 arg1, class167 arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3615;
        if (arg5 <= 91) {
            this.method1707((class551) null, (class167) null, (int[]) null, 22, -91, -9, 85, 116, -9, -29, -94);
        }
        class246 var8 = null;
        if (~arg6 == -1) {
            var8 = (class246) class146.method798(arg4, arg0, arg3);
        }
        if (~arg6 == -2) {
            var8 = (class246) class234.method1474(arg4, arg0, arg3);
        }
        if (~arg6 == -3) {
            var8 = (class246) class49.method273(arg4, arg0, arg3, field3627 != null ? field3627 : (field3627 = method1718("vaa")));
        }
        if (arg6 == 3) {
            var8 = (class246) class380.method2313(arg4, arg0, arg3);
        }
        if (var8 != null) {
            class137 var9 = class626.field9084.method1093(0, var8.method52(-17817));
            int var10 = var8.method57(-29185);
            int var11 = var8.method60(1901);
            if (var9.method719((byte) 71)) {
                class98.method550(arg3, arg4, 19649, var9, arg0);
            }
            if (var8.method55((byte) -121)) {
                var8.method61(arg2, -9785);
            }
            if (~arg6 != -1) {
                if (arg6 == 1) {
                    class486 var12 = class234.method1474(arg4, arg0, arg3);
                    if (!(var12 instanceof class579)) {
                        class327.method2019(arg4, arg0, arg3);
                        return;
                    }
                    ((class579) var12).field8050 = null;
                    return;
                }
                if (~arg6 != -3) {
                    if (~arg6 == -4) {
                        class249 var13 = class380.method2313(arg4, arg0, arg3);
                        if (!(var13 instanceof class12)) {
                            class388.method2344(arg4, arg0, arg3);
                        } else {
                            ((class12) var13).field115 = null;
                        }
                        if (var9.field1709 == 1) {
                            arg1.method770(arg3, (byte) -61, arg0);
                            return;
                        }
                    }
                    return;
                }
                class450 var14 = class49.method273(arg4, arg0, arg3, field3627 != null ? field3627 : (field3627 = method1718("vaa")));
                if (var14 instanceof class515 && ~var14.field6361 == ~arg0 && var14.field6359 == arg3) {
                    ((class515) var14).field7158 = null;
                } else {
                    class32.method185(arg4, arg0, arg3, field3627 != null ? field3627 : (field3627 = method1718("vaa")));
                }
                if (var9.field1709 != 0 && ~super.field1255 < ~(var9.field1717 + arg0) && ~(arg3 - -var9.field1717) > ~super.field1279 && super.field1255 > var9.field1670 + arg0 && ~super.field1279 < ~(arg3 - -var9.field1670)) {
                    arg1.method787(var9.field1745, arg0, !var9.field1701, var9.field1717, var11, (byte) -56, var9.field1670, arg3);
                    return;
                }
                return;
            }
            class8 var15 = class146.method798(arg4, arg0, arg3);
            if (!(var15 instanceof class265)) {
                class139.method736(arg4, arg0, arg3);
            } else {
                ((class265) var15).field3382 = null;
            }
            if (var9.field1709 != 0) {
                arg1.method777(var11, 2, !var9.field1701, var10, var9.field1745, arg0, arg3);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IBI[BILqa;II[Lfd;II)V")
    public final void method1712(int arg0, byte arg1, int arg2, byte[] arg3, int arg4, class167 arg5, int arg6, int arg7, class143[] arg8, int arg9, int arg10) {
        ++field3622;
        if (arg1 <= 122) {
            method1708(-82);
        }
        class551 var12 = new class551(arg3);
        int var13 = -1;
        while (true) {
            int var14 = var12.method3036(-117);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method3059(51);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = 63 & var15 >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method3045(-125);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (~arg7 == ~var19 && arg6 <= var18 && ~var18 > ~(arg6 + 8) && ~arg0 >= ~var17 && var17 < arg0 + 8) {
                    class137 var23 = class626.field9084.method1093(0, var13);
                    int var24 = class365.method2248(var22, 7 & var17, var23.field1717, 87, var23.field1670, var18 & 7, arg4) + arg10;
                    int var25 = class442.method2567(arg4, var22, var18 & 7, var23.field1670, var23.field1717, 7 & var17, 7) + arg2;
                    if (var24 > 0 && ~var25 < -1 && ~var24 > ~(super.field1255 + -1) && super.field1279 + -1 > var25) {
                        class143 var26 = null;
                        if (!super.field1257) {
                            int var27 = arg9;
                            if ((2 & class310.field3971[1][var24][var25]) == 2) {
                                var27 = arg9 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg8[var27];
                            }
                        }
                        this.method1716(3 & arg4 + var22, var21, var26, arg5, var13, arg9, -1, var25, arg9, 0, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIB[BLqa;[Lfd;)V")
    public final void method1713(int arg0, int arg1, byte arg2, byte[] arg3, class167 arg4, class143[] arg5) {
        ++field3619;
        class551 var7 = new class551(arg3);
        int var8 = -1;
        while (true) {
            int var9 = var7.method3036(-42);
            if (var9 == 0) {
                if (arg2 > -54) {
                    this.method1712(-75, (byte) 5, 12, (byte[]) null, -11, (class167) null, -85, -121, (class143[]) null, 101, 112);
                    return;
                }
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method3059(127);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = 63 & var10;
                int var13 = 63 & var10 >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method3045(-125);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = arg1 + var13;
                int var19 = var12 - -arg0;
                if (~var18 < -1 && var19 > 0 && super.field1255 - 1 > var18 && var19 < super.field1279 + -1) {
                    class143 var20 = null;
                    if (!super.field1257) {
                        int var21 = var14;
                        if (~(2 & class310.field3971[1][var18][var19]) == -3) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg5[var21];
                        }
                    }
                    this.method1716(var17, var16, var20, arg4, var8, var14, -1, var19, var14, 0, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "([BIIIIII)Z")
    public static final boolean method1714(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 >= -44) {
            method1715(-109);
        }
        ++field3620;
        int var7 = arg3 % arg6;
        int var8;
        if (~var7 != -1) {
            var8 = -var7 + arg6;
        } else {
            var8 = 0;
        }
        int var9 = -((arg4 - (-arg6 - -1)) / arg6);
        int var10 = -((arg3 + -1 - -arg6) / arg6);
        for (int var11 = var9; var11 < 0; ++var11) {
            for (int var12 = var10; ~var12 > -1; ++var12) {
                if (~arg0[arg5] == -1) {
                    return true;
                }
                arg5 += arg6;
            }
            int var13 = arg5 - var8;
            if (arg0[var13 + -1] == 0) {
                return true;
            }
            arg5 = arg1 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)V")
    public static void method1715(int arg0) {
        field3616 = null;
        field3612 = null;
        if (arg0 != -1) {
            method1715(80);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IILfd;Lqa;IIIIIII)V")
    public final void method1716(int arg0, int arg1, class143 arg2, class167 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field3618;
        if (class501.field6954.method3539(class428.field5845, 2) || class68.method387(arg5, arg7, arg10, arg9, class475.field6698)) {
            if (arg8 < this.field3626) {
                this.field3626 = arg8;
            }
            class137 var12 = class626.field9084.method1093(0, arg4);
            if (!arg3.method924() || !class501.field6954.field7880 || !var12.field1752) {
                int var13;
                int var14;
                if (arg0 != 1 && arg0 != 3) {
                    var13 = var12.field1670;
                    var14 = var12.field1717;
                } else {
                    var13 = var12.field1717;
                    var14 = var12.field1670;
                }
                int var15;
                int var16;
                if (~super.field1255 > ~(arg10 + var14)) {
                    var15 = arg10;
                    var16 = arg10 + 1;
                } else {
                    var16 = (var14 + 1 >> 1) + arg10;
                    var15 = arg10 - -(var14 >> 1);
                }
                int var17;
                int var18;
                if (~super.field1279 > ~(arg7 + var13)) {
                    var17 = arg7 + 1;
                    var18 = arg7;
                } else {
                    var18 = (var13 >> 1) + arg7;
                    var17 = (var13 + 1 >> 1) + arg7;
                }
                class544 var19 = class501.field6947[arg5];
                int var20 = var19.method1031(var15, var18) + (var19.method1031(var16, var18) - -var19.method1031(var15, var17)) + var19.method1031(var16, var17) >> 2;
                int var21 = (arg10 << 9) + (var14 << 8);
                int var22 = (arg7 << 9) - -(var13 << 8);
                boolean var23 = class375.field5230 && !super.field1257 && var12.field1668;
                if (var12.method719((byte) 77)) {
                    class318.method1980(arg8, (byte) 90, arg0, (class585) null, arg7, var12, (class20) null, arg10);
                }
                boolean var24 = ~arg6 == arg9 && var12.field1689 == -1 && var12.field1675 == null && var12.field1719 == null && !var12.field1698;
                if (!class501.field6948 || (!class554.method3108(arg1, (byte) 121) || ~var12.field1714 == -2) && (!class94.method513(arg9 + -125, arg1) || var12.field1714 != 0)) {
                    if (~arg1 == -23) {
                        if (class501.field6954.field7843 || ~var12.field1749 != -1 || var12.field1709 == 1 || var12.field1750) {
                            class249 var25;
                            if (!var24) {
                                var25 = new class197(arg3, var12, arg8, arg5, var21, var20, var22, super.field1257, arg0, arg6);
                            } else {
                                class286 var26 = new class286(arg3, var12, arg5, var21, var20, var22, super.field1257, arg0, var23);
                                if (var26.method55((byte) 62)) {
                                    var26.method62(arg9 + 22132, arg3);
                                }
                                var25 = var26;
                            }
                            class249 var27 = class380.method2313(arg8, arg10, arg7);
                            if (var27 instanceof class12) {
                                ((class12) var27).field115 = var25;
                            } else {
                                class193.method1239(arg8, arg10, arg7, var25);
                            }
                            if (var12.field1709 == 1 && arg2 != null) {
                                arg2.method773(arg7, arg10, (byte) 111);
                            }
                        }
                    } else if (~arg1 != -11 && arg1 != 11) {
                        if (~arg1 <= -13 && arg1 <= 17 || arg1 >= 18 && ~arg1 >= -22) {
                            class450 var29;
                            if (var24) {
                                class144 var28 = new class144(arg3, var12, arg8, arg5, var21, var20, var22, super.field1257, arg10, arg10 + var14 + -1, arg7, var13 + -1 + arg7, arg1, arg0, var23);
                                var29 = var28;
                                if (var28.method55((byte) -73)) {
                                    var28.method62(22132, arg3);
                                }
                            } else {
                                var29 = new class599(arg3, var12, arg8, arg5, var21, var20, var22, super.field1257, arg10, var14 + -1 + arg10, arg7, arg7 - -var13 + -1, arg1, arg0, arg6);
                            }
                            class450 var30 = class49.method273(arg8, arg10, arg7, field3627 != null ? field3627 : (field3627 = method1718("vaa")));
                            if (var30 instanceof class515 && var30.field6361 == arg10 && var30.field6359 == arg7) {
                                ((class515) var30).field7158 = var29;
                            } else {
                                class523.method2925(var29, false);
                            }
                            if (class375.field5230 && !super.field1257 && arg1 >= 12 && ~arg1 >= -18 && arg1 != 13 && arg8 > 0 && var12.field1714 != 0) {
                                super.field1270[arg8][arg10][arg7] = (byte) class292.method1790(super.field1270[arg8][arg10][arg7], 4);
                            }
                            if (~var12.field1709 != -1 && arg2 != null) {
                                arg2.method779(arg9 + 80, var14, !var12.field1701, arg7, arg10, var13, var12.field1745);
                            }
                        } else if (arg1 == 0) {
                            int var31 = var12.field1714;
                            if (class297.field3894 && ~var12.field1714 == 0) {
                                var31 = 1;
                            }
                            class8 var33;
                            if (var24) {
                                class502 var32 = new class502(arg3, var12, arg5, var21, var20, var22, super.field1257, arg1, arg0, var23);
                                if (var32.method55((byte) -87)) {
                                    var32.method62(22132, arg3);
                                }
                                var33 = var32;
                            } else {
                                var33 = new class453(arg3, var12, arg8, arg5, var21, var20, var22, super.field1257, arg1, arg0, arg6);
                            }
                            class8 var34 = class146.method798(arg8, arg10, arg7);
                            if (!(var34 instanceof class265)) {
                                class181.method1116(arg8, arg10, arg7, var33, (class8) null);
                            } else {
                                ((class265) var34).field3382 = var33;
                            }
                            if (class375.field5230) {
                                if (arg0 == 0) {
                                    if (var12.field1704) {
                                        var19.method1044(arg10, arg7, 50);
                                        var19.method1044(arg10, arg7 + 1, 50);
                                    }
                                    if (var31 == 1 && !super.field1257) {
                                        super.field1270[arg8][arg10][arg7] = (byte) class292.method1790(super.field1270[arg8][arg10][arg7], 1);
                                    }
                                } else if (~arg0 != -2) {
                                    if (~arg0 != -3) {
                                        if (arg0 == 3) {
                                            if (var12.field1704) {
                                                var19.method1044(arg10, arg7, 50);
                                                var19.method1044(arg10 + 1, arg7, 50);
                                            }
                                            if (var31 == 1 && !super.field1257) {
                                                super.field1270[arg8][arg10][arg7] = (byte) class292.method1790(super.field1270[arg8][arg10][arg7], 2);
                                            }
                                        }
                                    } else {
                                        if (var12.field1704) {
                                            var19.method1044(arg10 + 1, arg7, 50);
                                            var19.method1044(arg10 - -1, arg7 + 1, 50);
                                        }
                                        if (~var31 == -2 && !super.field1257) {
                                            super.field1270[arg8][arg10 + 1][arg7] = (byte) class292.method1790(super.field1270[arg8][arg10 + 1][arg7], 1);
                                        }
                                    }
                                } else {
                                    if (var12.field1704) {
                                        var19.method1044(arg10, arg7 + 1, 50);
                                        var19.method1044(arg10 + 1, arg7 - -1, 50);
                                    }
                                    if (var31 == 1 && !super.field1257) {
                                        super.field1270[arg8][arg10][arg7 + 1] = (byte) class292.method1790(super.field1270[arg8][arg10][arg7 + 1], 2);
                                    }
                                }
                            }
                            if (~var12.field1709 != -1 && arg2 != null) {
                                arg2.method782((byte) -74, arg0, !var12.field1701, arg1, arg10, var12.field1745, arg7);
                            }
                            if (var12.field1756 != 64) {
                                class271.method1656(arg8, arg10, arg7, var12.field1756);
                            }
                        } else if (~arg1 == -2) {
                            class8 var36;
                            if (var24) {
                                class502 var35 = new class502(arg3, var12, arg5, var21, var20, var22, super.field1257, arg1, arg0, var23);
                                if (var35.method55((byte) 99)) {
                                    var35.method62(22132, arg3);
                                }
                                var36 = var35;
                            } else {
                                var36 = new class453(arg3, var12, arg8, arg5, var21, var20, var22, super.field1257, arg1, arg0, arg6);
                            }
                            class8 var37 = class146.method798(arg8, arg10, arg7);
                            if (!(var37 instanceof class265)) {
                                class181.method1116(arg8, arg10, arg7, var36, (class8) null);
                            } else {
                                ((class265) var37).field3382 = var36;
                            }
                            if (var12.field1704 && class375.field5230) {
                                if (~arg0 != -1) {
                                    if (~arg0 == -2) {
                                        var19.method1044(arg10 - -1, arg7 - -1, 50);
                                    } else if (arg0 != 2) {
                                        if (~arg0 == -4) {
                                            var19.method1044(arg10, arg7, 50);
                                        }
                                    } else {
                                        var19.method1044(arg10 + 1, arg7, 50);
                                    }
                                } else {
                                    var19.method1044(arg10, arg7 + 1, 50);
                                }
                            }
                            if (~var12.field1709 != -1 && arg2 != null) {
                                arg2.method782((byte) 118, arg0, !var12.field1701, arg1, arg10, var12.field1745, arg7);
                            }
                        } else if (arg1 == 2) {
                            int var38 = arg0 + 1 & 3;
                            class8 var41;
                            class8 var42;
                            if (var24) {
                                class502 var39 = new class502(arg3, var12, arg5, var21, var20, var22, super.field1257, arg1, arg0 + 4, var23);
                                class502 var40 = new class502(arg3, var12, arg5, var21, var20, var22, super.field1257, arg1, var38, var23);
                                if (var39.method55((byte) 21)) {
                                    var39.method62(22132, arg3);
                                }
                                if (var40.method55((byte) 18)) {
                                    var40.method62(arg9 ^ 22132, arg3);
                                }
                                var41 = var39;
                                var42 = var40;
                            } else {
                                var41 = new class453(arg3, var12, arg8, arg5, var21, var20, var22, super.field1257, arg1, arg0 + 4, arg6);
                                var42 = new class453(arg3, var12, arg8, arg5, var21, var20, var22, super.field1257, arg1, var38, arg6);
                            }
                            class181.method1116(arg8, arg10, arg7, var41, var42);
                            if (var12.field1714 == 1 && class375.field5230 && !super.field1257) {
                                if (arg0 == 0) {
                                    super.field1270[arg8][arg10][arg7] = (byte) class292.method1790(super.field1270[arg8][arg10][arg7], 1);
                                    super.field1270[arg8][arg10][arg7 + 1] = (byte) class292.method1790(super.field1270[arg8][arg10][arg7 + 1], 2);
                                } else if (~arg0 == -2) {
                                    super.field1270[arg8][arg10][arg7 + 1] = (byte) class292.method1790(super.field1270[arg8][arg10][arg7 + 1], 2);
                                    super.field1270[arg8][arg10 - -1][arg7] = (byte) class292.method1790(super.field1270[arg8][arg10 - -1][arg7], 1);
                                } else if (~arg0 != -3) {
                                    if (~arg0 == -4) {
                                        super.field1270[arg8][arg10][arg7] = (byte) class292.method1790(super.field1270[arg8][arg10][arg7], 2);
                                        super.field1270[arg8][arg10][arg7] = (byte) class292.method1790(super.field1270[arg8][arg10][arg7], 1);
                                    }
                                } else {
                                    super.field1270[arg8][arg10 + 1][arg7] = (byte) class292.method1790(super.field1270[arg8][arg10 + 1][arg7], 1);
                                    super.field1270[arg8][arg10][arg7] = (byte) class292.method1790(super.field1270[arg8][arg10][arg7], 2);
                                }
                            }
                            if (var12.field1709 != 0 && arg2 != null) {
                                arg2.method782((byte) -77, arg0, !var12.field1701, arg1, arg10, var12.field1745, arg7);
                            }
                            if (var12.field1756 != 64) {
                                class271.method1656(arg8, arg10, arg7, var12.field1756);
                            }
                        } else if (~arg1 == -4) {
                            class8 var43;
                            if (!var24) {
                                var43 = new class453(arg3, var12, arg8, arg5, var21, var20, var22, super.field1257, arg1, arg0, arg6);
                            } else {
                                class502 var44 = new class502(arg3, var12, arg5, var21, var20, var22, super.field1257, arg1, arg0, var23);
                                var43 = var44;
                                if (var44.method55((byte) -112)) {
                                    var44.method62(22132, arg3);
                                }
                            }
                            class8 var45 = class146.method798(arg8, arg10, arg7);
                            if (var45 instanceof class265) {
                                ((class265) var45).field3382 = var43;
                            } else {
                                class181.method1116(arg8, arg10, arg7, var43, (class8) null);
                            }
                            if (var12.field1704 && class375.field5230) {
                                if (~arg0 != -1) {
                                    if (~arg0 == -2) {
                                        var19.method1044(arg10 - -1, arg7 + 1, 50);
                                    } else if (arg0 != 2) {
                                        if (~arg0 == -4) {
                                            var19.method1044(arg10, arg7, 50);
                                        }
                                    } else {
                                        var19.method1044(arg10 + 1, arg7, 50);
                                    }
                                } else {
                                    var19.method1044(arg10, arg7 - -1, 50);
                                }
                            }
                            if (~var12.field1709 != -1 && arg2 != null) {
                                arg2.method782((byte) -51, arg0, !var12.field1701, arg1, arg10, var12.field1745, arg7);
                            }
                        } else if (~arg1 == -10) {
                            class450 var47;
                            if (var24) {
                                class144 var46 = new class144(arg3, var12, arg8, arg5, var21, var20, var22, super.field1257, arg10, arg10, arg7, arg7, arg1, arg0, var23);
                                var47 = var46;
                                if (var46.method55((byte) 62)) {
                                    var46.method62(22132, arg3);
                                }
                            } else {
                                var47 = new class599(arg3, var12, arg8, arg5, var21, var20, var22, super.field1257, arg10, arg10 + var14 + -1, arg7, arg7 + var13 + -1, arg1, arg0, arg6);
                            }
                            class450 var48 = class49.method273(arg8, arg10, arg7, field3627 != null ? field3627 : (field3627 = method1718("vaa")));
                            if (var48 instanceof class515 && ~var48.field6361 == ~arg10 && ~var48.field6359 == ~arg7) {
                                ((class515) var48).field7158 = var47;
                            } else {
                                class523.method2925(var47, false);
                            }
                            if (~var12.field1709 != -1 && arg2 != null) {
                                arg2.method779(arg9 ^ 33, var14, !var12.field1701, arg7, arg10, var13, var12.field1745);
                            }
                            if (var12.field1756 != 64) {
                                class271.method1656(arg8, arg10, arg7, var12.field1756);
                            }
                        } else if (arg1 == 4) {
                            class486 var50;
                            if (var24) {
                                class337 var49 = new class337(arg3, var12, arg5, var21, var20, var22, super.field1257, 0, 0, 0, arg1, arg0);
                                var50 = var49;
                                if (var49.method55((byte) -57)) {
                                    var49.method62(22132, arg3);
                                }
                            } else {
                                var50 = new class403(arg3, var12, arg8, arg5, var21, var20, var22, super.field1257, 0, 0, 0, arg1, arg0, arg6);
                            }
                            class486 var51 = class234.method1474(arg8, arg10, arg7);
                            if (!(var51 instanceof class579)) {
                                class464.method2676(arg8, arg10, arg7, var50, (class486) null);
                            } else {
                                ((class579) var51).field8050 = var50;
                            }
                        } else if (~arg1 == -6) {
                            int var52 = 65;
                            class246 var53 = (class246) class146.method798(arg8, arg10, arg7);
                            if (var53 != null) {
                                var52 = class626.field9084.method1093(arg9, var53.method52(arg9 + -17817)).field1756 - -1;
                            }
                            class486 var55;
                            if (var24) {
                                class337 var54 = new class337(arg3, var12, arg5, var21, var20, var22, super.field1257, 0, class632.field9196[arg0] * var52, class247.field3112[arg0] * var52, arg1, arg0);
                                var55 = var54;
                                if (var54.method55((byte) -66)) {
                                    var54.method62(22132, arg3);
                                }
                            } else {
                                var55 = new class403(arg3, var12, arg8, arg5, var21, var20, var22, super.field1257, 0, class632.field9196[arg0] * var52, class247.field3112[arg0] * var52, arg1, arg0, arg6);
                            }
                            class486 var56 = class234.method1474(arg8, arg10, arg7);
                            if (!(var56 instanceof class579)) {
                                class464.method2676(arg8, arg10, arg7, var55, (class486) null);
                            } else {
                                ((class579) var56).field8050 = var55;
                            }
                        } else if (~arg1 == -7) {
                            int var57 = 33;
                            class246 var58 = (class246) class146.method798(arg8, arg10, arg7);
                            if (var58 != null) {
                                var57 = 1 + class626.field9084.method1093(0, var58.method52(-17817)).field1756 / 2;
                            }
                            class486 var59;
                            if (!var24) {
                                var59 = new class403(arg3, var12, arg8, arg5, var21, var20, var22, super.field1257, arg0, class424.field5742[arg0] * var57, class438.field5986[arg0] * var57, arg1, arg0 - -4, arg6);
                            } else {
                                class337 var60 = new class337(arg3, var12, arg5, var21, var20, var22, super.field1257, arg0, class632.field9196[arg0] * var57, class247.field3112[arg0] * var57, arg1, arg0 + 4);
                                if (var60.method55((byte) 99)) {
                                    var60.method62(22132, arg3);
                                }
                                var59 = var60;
                            }
                            class486 var61 = class234.method1474(arg8, arg10, arg7);
                            if (!(var61 instanceof class579)) {
                                class464.method2676(arg8, arg10, arg7, var59, (class486) null);
                            } else {
                                ((class579) var61).field8050 = var59;
                            }
                        } else if (~arg1 == -8) {
                            int var62 = arg0 + 2 & 3;
                            class486 var64;
                            if (var24) {
                                class337 var63 = new class337(arg3, var12, arg5, var21, var20, var22, super.field1257, var62, 0, 0, arg1, var62 + 4);
                                var64 = var63;
                                if (var63.method55((byte) 40)) {
                                    var63.method62(22132, arg3);
                                }
                            } else {
                                var64 = new class403(arg3, var12, arg8, arg5, var21, var20, var22, super.field1257, var62, 0, 0, arg1, var62 - -4, arg6);
                            }
                            class486 var65 = class234.method1474(arg8, arg10, arg7);
                            if (!(var65 instanceof class579)) {
                                class464.method2676(arg8, arg10, arg7, var64, (class486) null);
                            } else {
                                ((class579) var65).field8050 = var64;
                            }
                        } else if (~arg1 == -9) {
                            int var66 = arg0 + 2 & 3;
                            int var67 = 33;
                            class246 var68 = (class246) class146.method798(arg8, arg10, arg7);
                            if (var68 != null) {
                                var67 = class626.field9084.method1093(0, var68.method52(arg9 ^ -17817)).field1756 / 2 - -1;
                            }
                            class486 var70;
                            class486 var72;
                            if (!var24) {
                                class403 var69 = new class403(arg3, var12, arg8, arg5, var21, var20, var22, super.field1257, arg0, class424.field5742[arg0] * var67, class438.field5986[arg0] * var67, arg1, arg0 + 4, arg6);
                                var70 = var69;
                                class403 var71 = new class403(arg3, var12, arg8, arg5, var21, var20, var22, super.field1257, arg0, 0, 0, arg1, var66 + 4, arg6);
                                var72 = var71;
                            } else {
                                class337 var73 = new class337(arg3, var12, arg5, var21, var20, var22, super.field1257, arg0, class424.field5742[arg0] * var67, class438.field5986[arg0] * var67, arg1, arg0 + 4);
                                class337 var74 = new class337(arg3, var12, arg5, var21, var20, var22, super.field1257, arg0, 0, 0, arg1, var66 + 4);
                                if (var73.method55((byte) -104)) {
                                    var73.method62(22132, arg3);
                                }
                                var70 = var73;
                                if (var74.method55((byte) 40)) {
                                    var74.method62(arg9 + 22132, arg3);
                                }
                                var72 = var74;
                            }
                            class464.method2676(arg8, arg10, arg7, var70, var72);
                        }
                    } else {
                        class144 var75 = null;
                        int var76;
                        class450 var77;
                        if (!var24) {
                            var76 = 15;
                            var77 = new class599(arg3, var12, arg8, arg5, var21, var20, var22, super.field1257, arg10, arg10 - -var14 + -1, arg7, arg7 + var13 - 1, arg1, arg0, arg6);
                        } else {
                            class144 var78 = new class144(arg3, var12, arg8, arg5, var21, var20, var22, super.field1257, arg10, arg10 + -1 + var14, arg7, arg7 + var13 + -1, arg1, arg0, var23);
                            var77 = var78;
                            var75 = var78;
                            var76 = var78.method789(-38);
                        }
                        class450 var79 = class49.method273(arg8, arg10, arg7, field3627 != null ? field3627 : (field3627 = method1718("vaa")));
                        boolean var80 = false;
                        if (var79 instanceof class515 && ~var79.field6361 == ~arg10 && var79.field6359 == arg7) {
                            var80 = true;
                            ((class515) var79).field7158 = var77;
                        }
                        if (var80 || class523.method2925(var77, false)) {
                            if (var75 != null && var75.method55((byte) -52)) {
                                var75.method62(22132, arg3);
                            }
                            if (var12.field1704 && class375.field5230) {
                                if (~var76 < -31) {
                                    var76 = 30;
                                }
                                for (int var81 = 0; var14 >= var81; ++var81) {
                                    for (int var82 = 0; var13 >= var82; ++var82) {
                                        var19.method1044(arg10 - -var81, arg7 - -var82, var76);
                                    }
                                }
                            }
                        }
                        if (var12.field1709 != 0 && arg2 != null) {
                            arg2.method779(84, var14, !var12.field1701, arg7, arg10, var13, var12.field1745);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lna;ILqa;IIIIIIIIIIILr;)Lr;")
    public static final class521 method1717(class320 arg0, int arg1, class167 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class521 arg14) {
        ++field3624;
        if (arg14 == null) {
            return null;
        } else {
            int var15 = 2055;
            if (arg0 != null) {
                int var16 = var15 | arg0.method1993(arg3, false, -1, 0);
                var15 = var16 & -513;
            }
            long var17 = ((long) arg8 << 32) + ((long) arg5 << 48) + (long) ((arg9 << 24) + (arg11 << 16) + arg4);
            class58 var19 = class255.field3171;
            class521 var20;
            synchronized (class255.field3171) {
                var20 = (class521) class255.field3171.method323(var17, -19814);
            }
            if (var20 == null || arg2.method921(var20.method1601(), var15) != 0) {
                if (var20 != null) {
                    var15 = arg2.method938(var15, var20.method1601());
                }
                byte var21;
                if (~arg4 != -2) {
                    if (arg4 != 2) {
                        if (arg4 != 3) {
                            if (arg4 == 4) {
                                var21 = 18;
                            } else {
                                var21 = 21;
                            }
                        } else {
                            var21 = 15;
                        }
                    } else {
                        var21 = 12;
                    }
                } else {
                    var21 = 9;
                }
                byte var22 = 3;
                int[] var23 = new int[] { 64, 96, 128 };
                class528 var24 = new class528(var21 * var22 + 1, var21 * var22 * 2 - var21, 0);
                int var25 = var24.method2936(0, 0, 0, (byte) -113);
                int[][] var26 = new int[var22][var21];
                for (int var27 = 0; var22 > var27; ++var27) {
                    int var28 = var23[var27];
                    int var29 = var23[var27];
                    for (int var30 = 0; ~var21 < ~var30; ++var30) {
                        int var31 = (var30 << 14) / var21;
                        int var32 = class310.field3966[var31] * var28 >> 14;
                        int var33 = class310.field3965[var31] * var29 >> 14;
                        var26[var27][var30] = var24.method2936(var33, 0, var32, (byte) -126);
                    }
                }
                for (int var34 = 0; var22 > var34; ++var34) {
                    int var35 = (var34 * 256 - -128) / var22;
                    int var36 = -var35 + 256;
                    byte var37 = (byte) (arg9 * var35 + arg11 * var36 >> 8);
                    short var38 = (short) (((64512 & arg5) * var35 + (arg8 & 64512) * var36 & 16515072) + (32512 & (127 & arg5) * var35 + (127 & arg8) * var36) + (229376 & (arg5 & 896) * var35 + (arg8 & 896) * var36) >> 8);
                    for (int var39 = 0; ~var39 > ~var21; ++var39) {
                        if (~var34 == -1) {
                            var24.method2950(var26[0][(var39 + 1) % var21], var38, (byte) 1, var26[0][var39], -15280, (byte) -1, var37, (short) -1, var25);
                        } else {
                            var24.method2950(var26[var34 - 1][(var39 - -1) % var21], var38, (byte) 1, var26[var34][(var39 + 1) % var21], -15280, (byte) -1, var37, (short) -1, var26[var34 + -1][var39]);
                            var24.method2950(var26[var34][(var39 + 1) % var21], var38, (byte) 1, var26[var34][var39], -15280, (byte) -1, var37, (short) -1, var26[var34 + -1][var39]);
                        }
                    }
                }
                var20 = arg2.method197(var24, var15, class253.field3154, 64, 768);
                class58 var40 = class255.field3171;
                synchronized (class255.field3171) {
                    class255.field3171.method316(var17, (byte) -124, var20);
                }
            }
            int var41 = (arg4 << 8) + -1;
            int var42 = -var41;
            int var43 = -var41;
            int var44 = var41;
            int var45 = var41;
            if (~arg10 != -1) {
                if (~(1 & arg10) != -1) {
                    var45 = var41 + 512;
                }
                if (~(arg10 & 8) != -1) {
                    var42 -= 512;
                }
                if ((4 & arg10) != 0) {
                    var44 = var41 + 512;
                }
                if (~(2 & arg10) != -1) {
                    var43 -= 512;
                }
            }
            int var46 = arg14.method1561();
            int var47 = arg14.method1563();
            int var48 = arg14.method1565();
            if (~var46 > ~var42) {
                var46 = var42;
            }
            if (~var48 > ~var43) {
                var48 = var43;
            }
            if (var47 > var44) {
                var47 = var44;
            }
            int var49 = arg14.method1597();
            if (~var49 < ~var45) {
                var49 = var45;
            }
            class556 var50 = null;
            if (arg7 != 9) {
                method1715(-87);
            }
            if (arg0 != null) {
                int var51 = arg0.field4431[arg3];
                var50 = class609.field8754.method536(var51 >> 16, (byte) -46);
                arg3 = var51 & 65535;
            }
            class521 var52;
            if (var50 == null) {
                var52 = var20.method1607((byte) 3, var15, true);
                var52.method1566(-var46 + var47 >> 1, 128, -var48 + var49 >> 1);
                var52.method1602(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            } else {
                var52 = var20.method1607((byte) 3, var15, true);
                var52.method1566(-var46 + var47 >> 1, 128, -var48 + var49 >> 1);
                var52.method1602(var46 - -var47 >> 1, 0, var48 + var49 >> 1);
                var52.method2912(arg3, -109, var50);
            }
            if (arg12 != 0) {
                var52.method1580(arg12);
            }
            if (~arg13 != -1) {
                var52.method1574(arg13);
            }
            if (~arg6 != -1) {
                var52.method1602(0, arg6, 0);
            }
            return var52;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1718(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class344("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
        field3625 = 0;
    }
}
