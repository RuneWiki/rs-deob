import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class167 extends class335 {

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "I")
    public int field2432 = 99;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "Lui;")
    public static class375 field2428 = new class375("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "I")
    public static int field2433 = 0;

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "Lpg;")
    public static class492 field2434 = new class492(24, -1);

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "I")
    public static int field2431;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tf", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field2435;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILqa;)V")
    public final void method1170(int arg0, class496 arg1) {
        ++field2421;
        class276.method1752(arg1);
        int var3 = -6 % ((-73 - arg0) / 46);
        if (super.field5171 > 1) {
            for (int var4 = 0; super.field5186 > var4; ++var4) {
                for (int var5 = 0; ~var5 > ~super.field5170; ++var5) {
                    if ((2 & class129.field1816[1][var4][var5]) == 2) {
                        class323.method2099(var4, var5);
                    }
                }
            }
        }
        for (int var6 = 0; ~super.field5171 < ~var6; ++var6) {
            for (int var7 = 0; ~super.field5170 <= ~var7; ++var7) {
                for (int var8 = 0; ~super.field5186 <= ~var8; ++var8) {
                    if ((super.field5191[var6][var8][var7] & 1) != 0) {
                        int var9 = var7;
                        int var10 = var7;
                        int var11 = var6;
                        while (~var9 < -1 && (1 & super.field5191[var6][var8][var9 + -1]) != 0) {
                            --var9;
                        }
                        while (var10 < super.field5170 && ~(1 & super.field5191[var6][var8][var10 + 1]) != -1) {
                            ++var10;
                        }
                        int var12 = var6;
                        label167: while (var11 > 0) {
                            for (int var13 = var9; var10 >= var13; ++var13) {
                                if (~(super.field5191[var11 + -1][var8][var13] & 1) == -1) {
                                    break label167;
                                }
                            }
                            --var11;
                        }
                        label156: while (~var12 > -4) {
                            for (int var14 = var9; var10 >= var14; ++var14) {
                                if (~(super.field5191[var12 + 1][var8][var14] & 1) == -1) {
                                    break label156;
                                }
                            }
                            ++var12;
                        }
                        int var15 = (var10 - var9 + 1) * (var12 + 1 + -var11);
                        if (~var15 <= -3) {
                            short var16 = 240;
                            int var17 = super.field5184[var12][var8][var9] + -var16;
                            int var18 = super.field5184[var11][var8][var9];
                            class228.method1563(1, var8 << 7, var8 << 7, var9 << 7, (var10 << 7) + 128, var17, var18);
                            for (int var19 = var11; ~var19 >= ~var12; ++var19) {
                                for (int var20 = var9; ~var10 <= ~var20; ++var20) {
                                    super.field5191[var19][var8][var20] = (byte) class494.method2942(super.field5191[var19][var8][var20], -2);
                                }
                            }
                        }
                    }
                    if (~(super.field5191[var6][var8][var7] & 2) != -1) {
                        int var21 = var8;
                        int var22 = var8;
                        int var23 = var6;
                        while (~super.field5186 < ~var22 && (2 & super.field5191[var6][var22 - -1][var7]) != 0) {
                            ++var22;
                        }
                        int var24 = var6;
                        while (var21 > 0 && ~(super.field5191[var6][var21 + -1][var7] & 2) != -1) {
                            --var21;
                        }
                        label221: while (var23 > 0) {
                            for (int var25 = var21; var22 >= var25; ++var25) {
                                if ((super.field5191[var23 + -1][var25][var7] & 2) == 0) {
                                    break label221;
                                }
                            }
                            --var23;
                        }
                        label210: while (~var24 > -4) {
                            for (int var26 = var21; var22 >= var26; ++var26) {
                                if (~(super.field5191[var24 + 1][var26][var7] & 2) == -1) {
                                    break label210;
                                }
                            }
                            ++var24;
                        }
                        int var27 = (-var21 + var22 + 1) * (var24 + 1 + -var23);
                        if (var27 >= 2) {
                            short var28 = 240;
                            int var29 = super.field5184[var24][var21][var7] + -var28;
                            int var30 = super.field5184[var23][var21][var7];
                            class228.method1563(2, var21 << 7, (var22 << 7) + 128, var7 << 7, var7 << 7, var29, var30);
                            for (int var31 = var23; var31 <= var24; ++var31) {
                                for (int var32 = var21; var22 >= var32; ++var32) {
                                    super.field5191[var31][var32][var7] = (byte) class494.method2942(super.field5191[var31][var32][var7], -3);
                                }
                            }
                        }
                    }
                    if (~(4 & super.field5191[var6][var8][var7]) != -1) {
                        int var33 = var8;
                        int var34 = var8;
                        int var35 = var7;
                        int var36 = var7;
                        while (var35 > 0 && ~(4 & super.field5191[var6][var8][var35 - 1]) != -1) {
                            --var35;
                        }
                        while (var36 < super.field5170 && ~(super.field5191[var6][var8][var36 + 1] & 4) != -1) {
                            ++var36;
                        }
                        label275: while (~var33 < -1) {
                            for (int var37 = var35; ~var37 >= ~var36; ++var37) {
                                if ((super.field5191[var6][var33 - 1][var37] & 4) == 0) {
                                    break label275;
                                }
                            }
                            --var33;
                        }
                        label264: while (super.field5186 > var34) {
                            for (int var38 = var35; ~var36 <= ~var38; ++var38) {
                                if ((4 & super.field5191[var6][var34 + 1][var38]) == 0) {
                                    break label264;
                                }
                            }
                            ++var34;
                        }
                        if ((var34 - (var33 + -1)) * (-var35 + var36 + 1) >= 4) {
                            int var39 = super.field5184[var6][var33][var35];
                            class228.method1563(4, var33 << 7, (var34 << 7) - -128, var35 << 7, (var36 << 7) + 128, var39, var39);
                            for (int var40 = var33; ~var40 >= ~var34; ++var40) {
                                for (int var41 = var35; var36 >= var41; ++var41) {
                                    super.field5191[var6][var40][var41] = (byte) class494.method2942(super.field5191[var6][var40][var41], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field5191 = null;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(IIIZ)V")
    public class167(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class423.field6309, class398.field6048);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lwq;Lqa;IIIIZ)V")
    public final void method1171(class370 arg0, class496 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        ++field2429;
        class196 var8 = null;
        if (~arg2 == -1) {
            var8 = (class196) class456.method2743(arg4, arg3, arg5);
        }
        if (~arg2 == -2) {
            var8 = (class196) class174.method1214(arg4, arg3, arg5);
        }
        if (~arg2 == -3) {
            var8 = (class196) class432.method2587(arg4, arg3, arg5, field2435 != null ? field2435 : (field2435 = method1180("ou")));
        }
        if (!arg6) {
            field2428 = null;
        }
        if (~arg2 == -4) {
            var8 = (class196) class380.method2357(arg4, arg3, arg5);
        }
        if (var8 != null) {
            class130 var9 = class56.field755.method2031(-40, var8.method50(25707));
            int var10 = var8.method63((byte) 63);
            int var11 = var8.method66(-7234);
            if (var9.method837(25828)) {
                class352.method2227(arg3, arg4, -427947833, arg5, var9);
            }
            if (var8.method60((byte) -116)) {
                var8.method67(-12, arg1);
            }
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (arg2 == 3) {
                            class383 var12 = class380.method2357(arg4, arg3, arg5);
                            if (!(var12 instanceof class286)) {
                                class77.method510(arg4, arg3, arg5);
                            } else {
                                ((class286) var12).field4270 = null;
                            }
                            if (var9.field1897 == 1) {
                                arg0.method2310(arg5, 20085, arg3);
                                return;
                            }
                        }
                        return;
                    }
                    class153 var13 = class432.method2587(arg4, arg3, arg5, field2435 != null ? field2435 : (field2435 = method1180("ou")));
                    if (var13 instanceof class399 && ~var13.field2208 == ~arg3 && ~var13.field2216 == ~arg5) {
                        ((class399) var13).field6076 = null;
                    } else {
                        class268.method1711(arg4, arg3, arg5, field2435 != null ? field2435 : (field2435 = method1180("ou")));
                    }
                    if (var9.field1897 != 0 && ~super.field5186 < ~(var9.field1843 + arg3) && ~super.field5170 < ~(var9.field1843 + arg5) && super.field5186 > arg3 - -var9.field1898 && ~super.field5170 < ~(var9.field1898 + arg5)) {
                        arg0.method2306(arg5, arg3, -3, var11, var9.field1898, var9.field1869, !var9.field1893, var9.field1843);
                        return;
                    }
                } else {
                    class255 var14 = class174.method1214(arg4, arg3, arg5);
                    if (var14 instanceof class392) {
                        ((class392) var14).field5955 = null;
                        return;
                    }
                    class507.method3027(arg4, arg3, arg5);
                }
                return;
            }
            class70 var15 = class456.method2743(arg4, arg3, arg5);
            if (var15 instanceof class458) {
                ((class458) var15).field6719 = null;
            } else {
                class38.method271(arg4, arg3, arg5);
            }
            if (var9.field1897 != 0) {
                arg0.method2312(arg5, false, var9.field1869, var10, arg3, var11, !var9.field1893);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lqa;I[IIIIIIIILtl;)V")
    public final void method1172(class496 arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class91 arg10) {
        ++field2422;
        if (!super.field5190) {
            boolean var12 = false;
            if (arg9 != 1904049923) {
                field2430 = 13;
            }
            if (arg2 != null) {
                arg2[0] = -1;
            }
            class20 var13 = null;
            int var14 = (7 & arg3) * 8;
            int var15 = (7 & arg7) * 8;
            while (true) {
                while (~arg10.field1292 > ~arg10.field1277.length) {
                    int var20 = arg10.method618((byte) 100);
                    if (var20 == 0) {
                        var13 = new class20(arg10);
                    } else if (var20 == 1) {
                        int var34 = arg10.method618((byte) 100);
                        if (var34 > 0) {
                            for (int var35 = 0; ~var35 > ~var34; ++var35) {
                                class138 var36 = new class138(arg0, arg10, 0);
                                if (var36.field2019 == 31) {
                                    class437 var37 = class64.field896.method2774(true, arg10.method631(10494));
                                    var36.method920(14708, var37.field6483, var37.field6476, var37.field6484, var37.field6486);
                                }
                                if (arg0.method1084() > 0) {
                                    class471 var38 = var36.field2020;
                                    int var39 = var38.method2827(arg9 ^ 1904026924) >> 7;
                                    int var40 = var38.method2832(15) >> 7;
                                    if (var36.field2015 == arg1 && var39 >= var14 && ~(var14 + 8) < ~var39 && var40 >= var15 && var15 - -8 > var40) {
                                        int var41 = (arg4 << 7) + class423.method2548(var38.method2827(23087) & 1023, arg9 ^ 1904049921, arg8, 1023 & var38.method2832(15));
                                        int var42 = class2.method15(var38.method2832(15) & 1023, 1126076368, 1023 & var38.method2827(23087), arg8) + (arg5 << 7);
                                        int var43 = var41 >> 7;
                                        int var44 = var42 >> 7;
                                        if (~var43 <= -1 && ~var44 <= -1 && var43 < super.field5186 && ~var44 > ~super.field5170) {
                                            var38.method428(var41, var42, super.field5184[arg1][var43][var44] + -var38.method2825(45), -20104);
                                            if (arg0.method1084() > 0) {
                                                class107.method714(var36);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2) {
                        if (var13 == null) {
                            var13 = new class20();
                        }
                        var13.method163(0, arg10);
                    } else if (~var20 == -129) {
                        if (arg2 != null) {
                            arg2[0] = arg10.method631(class41.method323(arg9, 1904039933));
                            arg2[1] = arg10.method643((byte) 120);
                            arg2[2] = arg10.method643((byte) 104);
                            arg2[3] = arg10.method643((byte) 110);
                            arg2[4] = arg10.method631(10494);
                        } else {
                            arg10.field1292 += 10;
                        }
                    } else {
                        if (~var20 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field5182 == null) {
                            super.field5182 = new byte[4][][];
                        }
                        for (int var21 = 0; var21 < 4; ++var21) {
                            byte var22 = arg10.method619((byte) -23);
                            if (var22 == 0 && super.field5182[arg6] != null) {
                                if (~var21 >= ~arg1) {
                                    int var23 = arg4;
                                    int var24 = arg4 - -7;
                                    int var25 = arg5;
                                    if (~arg4 <= -1) {
                                        if (~super.field5186 >= ~arg4) {
                                            var23 = super.field5186;
                                        }
                                    } else {
                                        var23 = 0;
                                    }
                                    if (var24 >= 0) {
                                        if (~var24 <= ~super.field5186) {
                                            var24 = super.field5186;
                                        }
                                    } else {
                                        var24 = 0;
                                    }
                                    if (arg5 >= 0) {
                                        if (~super.field5170 >= ~arg5) {
                                            var25 = super.field5170;
                                        }
                                    } else {
                                        var25 = 0;
                                    }
                                    int var26 = arg5 + 7;
                                    if (var26 >= 0) {
                                        if (~super.field5170 >= ~var26) {
                                            var26 = super.field5170;
                                        }
                                    } else {
                                        var26 = 0;
                                    }
                                    while (~var24 < ~var23) {
                                        while (var25 < var26) {
                                            super.field5182[arg6][var23][var25] = 0;
                                            ++var25;
                                        }
                                        ++var23;
                                    }
                                }
                            } else if (var22 == 1) {
                                if (super.field5182[arg6] == null) {
                                    super.field5182[arg6] = new byte[super.field5186 + 1][super.field5170 + 1];
                                }
                                for (int var27 = 0; var27 < 64; var27 += 4) {
                                    for (int var28 = 0; var28 < 64; var28 += 4) {
                                        byte var29 = arg10.method619((byte) -23);
                                        if (arg1 >= var21) {
                                            for (int var30 = var27; ~var30 > ~(var27 + 4); ++var30) {
                                                for (int var31 = var28; var28 + 4 > var31; ++var31) {
                                                    if (~var14 >= ~var30 && ~(var14 - -8) < ~var30 && var31 >= var15 && ~var15 > ~(var15 + 8)) {
                                                        int var32 = class237.method1603(true, var31 & 7, 7 & var30, arg8) + arg4;
                                                        int var33 = class491.method2915(arg8, 14954, 7 & var31, var30 & 7) + arg5;
                                                        if (var32 >= 0 && super.field5186 > var32 && var33 >= 0 && super.field5170 > var33) {
                                                            super.field5182[arg6][var32][var33] = var29;
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
                    class240.method1613(var13, arg4 >> 3, arg5 >> 3, 8);
                }
                if (!var12 && super.field5182 != null && super.field5182[arg6] != null) {
                    int var16 = arg4 + 7;
                    int var17 = arg5 - -7;
                    for (int var18 = arg4; ~var16 < ~var18; ++var18) {
                        for (int var19 = arg5; var19 < var17; ++var19) {
                            super.field5182[arg6][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILqa;[Lwq;[BI)V")
    public final void method1173(int arg0, int arg1, class496 arg2, class370[] arg3, byte[] arg4, int arg5) {
        ++field2425;
        if (arg5 == -16370) {
            class91 var7 = new class91(arg4);
            int var8 = -1;
            while (true) {
                int var9 = var7.method581((byte) 65);
                if (var9 == 0) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.method598(false);
                    if (~var11 == -1) {
                        break;
                    }
                    var10 += var11 + -1;
                    int var12 = var10 & 63;
                    int var13 = (var10 & 4038) >> 6;
                    int var14 = var10 >> 12;
                    int var15 = var7.method618((byte) 100);
                    int var16 = var15 >> 2;
                    int var17 = var15 & 3;
                    int var18 = arg0 + var13;
                    int var19 = arg1 + var12;
                    if (var18 > 0 && ~var19 < -1 && super.field5186 + -1 > var18 && var19 < super.field5170 + -1) {
                        class370 var20 = null;
                        if (!super.field5190) {
                            int var21 = var14;
                            if (~(class129.field1816[1][var18][var19] & 2) == -3) {
                                var21 = var14 - 1;
                            }
                            if (~var21 <= -1) {
                                var20 = arg3[var21];
                            }
                        }
                        this.method1179(arg2, var14, var18, var14, (byte) -48, var17, var16, var19, var8, var20, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V")
    public static final void method1174(byte arg0) {
        ++field2423;
        if (class520.field7708 != 0 && ~class520.field7708 != -6) {
            try {
                if (~(++class72.field981) < -2001) {
                    if (class81.field1092 != null) {
                        class81.field1092.method2994(-1);
                        class81.field1092 = null;
                    }
                    if (~class203.field2859 <= -2) {
                        class520.field7708 = 0;
                        class376.field5748 = -5;
                        return;
                    }
                    if (~class529.field7815 != ~class391.field5947) {
                        class529.field7815 = class391.field5947;
                    } else {
                        class529.field7815 = class116.field1635;
                    }
                    ++class203.field2859;
                    class72.field981 = 0;
                    class520.field7708 = 1;
                }
                if (~class520.field7708 == -2) {
                    class170.field2472 = class419.field6254.method2814(class529.field7815, class244.field3414, 0);
                    class520.field7708 = 2;
                }
                if (class520.field7708 == 2) {
                    if (class170.field2472.field1791 == 2) {
                        throw new IOException();
                    }
                    if (~class170.field2472.field1791 != -2) {
                        return;
                    }
                    class81.field1092 = new class501((Socket) class170.field2472.field1793, class419.field6254);
                    class170.field2472 = null;
                    long var1 = class45.field662 = class220.method1486(class245.field3429, -48);
                    int var3 = (int) (var1 >> 16 & 31L);
                    class75.field1006.field1292 = 0;
                    class75.field1006.method625(class442.field6576.field2934, false);
                    class75.field1006.method625(var3, false);
                    class81.field1092.method2999(class75.field1006.field1277, 2, 1, 0);
                    class273.method1740(true);
                    int var4 = class81.field1092.method3000((byte) -116);
                    class273.method1740(true);
                    if (~var4 != -1) {
                        class376.field5748 = var4;
                        class520.field7708 = 0;
                        class81.field1092.method2994(-1);
                        class81.field1092 = null;
                        return;
                    }
                    class520.field7708 = 3;
                }
                if (class520.field7708 == 3) {
                    if (class81.field1092.method2995((byte) 40) < 8) {
                        return;
                    }
                    class81.field1092.method2997(class486.field7134.field1277, 8, (byte) 98, 0);
                    class486.field7134.field1292 = 0;
                    class308.field4602 = class486.field7134.method607(-28);
                    class91 var5 = new class91(70);
                    int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (9.9999999E7D * Math.random()), (int) (class308.field4602 >> 32), (int) class308.field4602 };
                    var5.method625(10, false);
                    var5.method615(28010, var6[0]);
                    var5.method615(28010, var6[1]);
                    var5.method615(28010, var6[2]);
                    var5.method615(28010, var6[3]);
                    var5.method614(class220.method1486(class245.field3429, -48), false);
                    var5.method603(121, class313.field4781);
                    var5.method604(class353.field5470, class62.field883, true);
                    class75.field1006.field1292 = 0;
                    if (~class144.field2077 == -41) {
                        class75.field1006.method625(class442.field6580.field2934, false);
                    } else {
                        class75.field1006.method625(class442.field6578.field2934, false);
                    }
                    class75.field1006.method600(0, -12891);
                    int var7 = class75.field1006.field1292;
                    class75.field1006.method615(28010, 587);
                    class75.field1006.method625(class329.field5070, false);
                    class75.field1006.method625(class320.method2074(-32190), false);
                    class75.field1006.method600(class7.field112, -12891);
                    class75.field1006.method600(class486.field7136, -12891);
                    class75.field1006.method625(class96.field1399.field5212, false);
                    class129.method819(20999, class75.field1006);
                    class75.field1006.method603(-86, class165.field2407);
                    class75.field1006.method615(28010, class97.field1409);
                    class91 var8 = class96.field1399.method1732(true);
                    class75.field1006.method625(var8.field1292, false);
                    class75.field1006.method597(0, var8.field1277, false, var8.field1292);
                    class406.field6129 = true;
                    class75.field1006.method600(class427.field6353, -12891);
                    class75.field1006.method615(28010, class339.field5360.method2622(1));
                    class75.field1006.method615(28010, class512.field7606.method2622(1));
                    class75.field1006.method615(28010, class338.field5355.method2622(1));
                    class75.field1006.method615(28010, class486.field7135.method2622(1));
                    class75.field1006.method615(28010, class29.field459.method2622(1));
                    class75.field1006.method615(28010, class255.field3538.method2622(1));
                    class75.field1006.method615(28010, class438.field6532.method2622(1));
                    class75.field1006.method615(28010, class274.field3819.method2622(1));
                    class75.field1006.method615(28010, class113.field1576.method2622(1));
                    class75.field1006.method615(28010, class504.field7527.method2622(1));
                    class75.field1006.method615(28010, class59.field790.method2622(1));
                    class75.field1006.method615(28010, class21.field335.method2622(1));
                    class75.field1006.method615(28010, class501.field7486.method2622(1));
                    class75.field1006.method615(28010, class119.field1677.method2622(1));
                    class75.field1006.method615(28010, class394.field5985.method2622(1));
                    class75.field1006.method615(28010, class48.field675.method2622(1));
                    class75.field1006.method615(28010, class359.field5553.method2622(1));
                    class75.field1006.method615(28010, class354.field5499.method2622(1));
                    class75.field1006.method615(28010, class261.field3633.method2622(1));
                    class75.field1006.method615(28010, class498.field7275.method2622(1));
                    class75.field1006.method615(28010, class99.field1427.method2622(1));
                    class75.field1006.method615(28010, class508.field7553.method2622(1));
                    class75.field1006.method615(28010, class391.field5943.method2622(1));
                    class75.field1006.method615(28010, class149.field2158.method2622(1));
                    class75.field1006.method615(28010, class265.field3705.method2622(1));
                    class75.field1006.method615(28010, class150.field2169.method2622(1));
                    class75.field1006.method615(28010, class33.field522.method2622(1));
                    class75.field1006.method615(28010, class86.field1176.method2622(1));
                    class75.field1006.method615(28010, class127.field1806.method2622(1));
                    class75.field1006.method615(28010, class251.field3477.method2622(1));
                    class75.field1006.method597(0, var5.field1277, false, var5.field1292);
                    class75.field1006.method638(-1, -var7 + class75.field1006.field1292);
                    class81.field1092.method2999(class75.field1006.field1277, class75.field1006.field1292, 1, 0);
                    class75.field1006.method2078(-13147, var6);
                    for (int var9 = 0; var9 < 4; ++var9) {
                        var6[var9] += 50;
                    }
                    class486.field7134.method2078(-13147, var6);
                    class520.field7708 = 4;
                }
                if (class520.field7708 == 4) {
                    if (class81.field1092.method2995((byte) 116) < 1) {
                        return;
                    }
                    int var10 = class81.field1092.method3000((byte) 71);
                    if (~var10 == -22) {
                        class520.field7708 = 7;
                    } else if (var10 == 29) {
                        class520.field7708 = 11;
                    } else {
                        if (var10 == 1) {
                            class376.field5748 = var10;
                            class520.field7708 = 5;
                            return;
                        }
                        if (var10 == 2) {
                            class520.field7708 = 8;
                        } else {
                            if (var10 != 15) {
                                if (~var10 == -24 && ~class203.field2859 > -2) {
                                    class72.field981 = 0;
                                    class520.field7708 = 1;
                                    ++class203.field2859;
                                    class81.field1092.method2994(-1);
                                    class81.field1092 = null;
                                    return;
                                }
                                class520.field7708 = 0;
                                class376.field5748 = var10;
                                class81.field1092.method2994(-1);
                                class81.field1092 = null;
                                return;
                            }
                            class520.field7708 = 12;
                            class461.field6755 = -2;
                        }
                    }
                }
                if (class520.field7708 == 6) {
                    class75.field1006.field1292 = 0;
                    class75.field1006.method2082(100, class442.field6579.field2934);
                    class81.field1092.method2999(class75.field1006.field1277, class75.field1006.field1292, 1, 0);
                    class520.field7708 = 4;
                } else if (~class520.field7708 == -8) {
                    if (~class81.field1092.method2995((byte) 99) <= -2) {
                        class76.field1033 = (3 + class81.field1092.method3000((byte) -91)) * 60;
                        class376.field5748 = 21;
                        class520.field7708 = 0;
                        class81.field1092.method2994(-1);
                        class81.field1092 = null;
                    }
                } else {
                    if (arg0 >= -104) {
                        method1177((class321) null, -113);
                    }
                    if (~class520.field7708 == -12) {
                        if (~class81.field1092.method2995((byte) 72) <= -2) {
                            class479.field7006 = class81.field1092.method3000((byte) 89);
                            class520.field7708 = 0;
                            class376.field5748 = 29;
                            class81.field1092.method2994(-1);
                            class81.field1092 = null;
                        }
                    } else {
                        if (~class520.field7708 == -9) {
                            if (~class81.field1092.method2995((byte) 108) > -14) {
                                return;
                            }
                            class81.field1092.method2997(class486.field7134.field1277, 13, (byte) 98, 0);
                            class486.field7134.field1292 = 0;
                            class528.field7809 = class486.field7134.method618((byte) 100);
                            class103.field1477 = class486.field7134.method618((byte) 100);
                            class123.field1760 = ~class486.field7134.method618((byte) 100) == -2;
                            class482.field7026 = class486.field7134.method618((byte) 100) == 1;
                            class515.field7640 = class486.field7134.method618((byte) 100) == 1;
                            class422.field6304 = ~class486.field7134.method618((byte) 100) == -2;
                            class452.field6641 = class486.field7134.method631(10494);
                            class329.field5103 = ~class486.field7134.method618((byte) 100) == -2;
                            class289.field4305 = ~class486.field7134.method618((byte) 100) == -2;
                            class56.field755.method2035(class289.field4305, -77);
                            class84.field1154.method2446(-122, class289.field4305);
                            class410.field6175.method1210(class289.field4305, (byte) -53);
                            if ((!class123.field1760 || class515.field7640) && !class329.field5103) {
                                try {
                                    class131.method841(class419.field6254.field6861, -14144, "unzap");
                                } catch (Throwable var14) {
                                }
                            } else {
                                try {
                                    class131.method841(class419.field6254.field6861, -14144, "zap");
                                } catch (Throwable var16) {
                                    if (class472.field6899) {
                                        try {
                                            class419.field6254.field6861.getAppletContext().showDocument(new URL(class419.field6254.field6861.getCodeBase(), "blank.ws"), "tbi");
                                        } catch (Exception var15) {
                                        }
                                    }
                                }
                            }
                            if (class74.field999 == class140.field2031) {
                                try {
                                    class131.method841(class419.field6254.field6861, -14144, "loggedin");
                                } catch (Throwable var13) {
                                }
                            }
                            class520.field7708 = 10;
                        }
                        if (class520.field7708 == 10) {
                            if (class486.field7134.method2076(-129)) {
                                if (class81.field1092.method2995((byte) 55) < 1) {
                                    return;
                                }
                                class81.field1092.method2997(class486.field7134.field1277, 1, (byte) 98, class486.field7134.field1292 + 2);
                            }
                            class339.field5361 = class26.method204(0)[class486.field7134.method2079((byte) -31)];
                            class461.field6755 = class486.field7134.method631(10494);
                            class520.field7708 = 9;
                        }
                        if (~class520.field7708 == -10) {
                            if (~class81.field1092.method2995((byte) 113) <= ~class461.field6755) {
                                class81.field1092.method2997(class486.field7134.field1277, class461.field6755, (byte) 98, 0);
                                class486.field7134.field1292 = 0;
                                class376.field5748 = 2;
                                int var11 = class461.field6755;
                                class520.field7708 = 0;
                                class357.method2259(-15437);
                                class169.method1184(126, class486.field7134);
                                class10.field163 = -1;
                                class88.method576((byte) -109);
                                if (~class486.field7134.field1292 != ~var11) {
                                    throw new RuntimeException("lswp pos:" + class486.field7134.field1292 + " psize:" + var11);
                                } else {
                                    class339.field5361 = null;
                                }
                            }
                        } else if (~class520.field7708 == -13) {
                            if (~class461.field6755 == 1) {
                                if (~class81.field1092.method2995((byte) 116) > -3) {
                                    return;
                                }
                                class81.field1092.method2997(class486.field7134.field1277, 2, (byte) 98, 0);
                                class486.field7134.field1292 = 0;
                                class461.field6755 = class486.field7134.method631(10494);
                            }
                            if (~class81.field1092.method2995((byte) 91) <= ~class461.field6755) {
                                class81.field1092.method2997(class486.field7134.field1277, class461.field6755, (byte) 98, 0);
                                class486.field7134.field1292 = 0;
                                class520.field7708 = 0;
                                int var12 = class461.field6755;
                                class376.field5748 = 15;
                                class440.method2660((byte) 103);
                                class169.method1184(121, class486.field7134);
                                if (class486.field7134.field1292 != var12) {
                                    throw new RuntimeException("lswpr pos:" + class486.field7134.field1292 + " psize:" + var12);
                                } else {
                                    class339.field5361 = null;
                                }
                            }
                        }
                    }
                }
            } catch (IOException var17) {
                if (class81.field1092 != null) {
                    class81.field1092.method2994(-1);
                    class81.field1092 = null;
                }
                if (~class203.field2859 > -2) {
                    ++class203.field2859;
                    class72.field981 = 0;
                    class520.field7708 = 1;
                    if (class529.field7815 != class391.field5947) {
                        class529.field7815 = class391.field5947;
                    } else {
                        class529.field7815 = class116.field1635;
                    }
                } else {
                    class520.field7708 = 0;
                    class376.field5748 = -4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static void method1175(int arg0) {
        field2428 = null;
        int var1 = -101 / ((19 - arg0) / 48);
        field2434 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I[ILqa;IILtl;)V")
    public final void method1176(int arg0, int[] arg1, class496 arg2, int arg3, int arg4, class91 arg5) {
        ++field2424;
        if (!super.field5190) {
            boolean var7 = false;
            class20 var8 = null;
            if (arg1 != null) {
                arg1[0] = -1;
            }
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (~arg5.field1292 > ~arg5.field1277.length) {
                                int var18 = arg5.method618((byte) 100);
                                if (var18 != 0) {
                                    if (var18 != 1) {
                                        if (~var18 != -3) {
                                            if (~var18 == -129) {
                                                if (arg1 != null) {
                                                    arg1[0] = arg5.method631(10494);
                                                    arg1[1] = arg5.method643((byte) 109);
                                                    arg1[2] = arg5.method643((byte) 118);
                                                    arg1[3] = arg5.method643((byte) 106);
                                                    arg1[4] = arg5.method631(10494);
                                                } else {
                                                    arg5.field1292 += 10;
                                                }
                                            } else {
                                                if (~var18 != -130) {
                                                    throw new IllegalStateException("");
                                                }
                                                if (super.field5182 == null) {
                                                    super.field5182 = new byte[4][][];
                                                }
                                                var7 = true;
                                                for (int var19 = 0; var19 < 4; ++var19) {
                                                    byte var20 = arg5.method619((byte) -23);
                                                    if (var20 == 0 && super.field5182[var19] != null) {
                                                        int var21 = arg3;
                                                        int var22 = arg3 + 64;
                                                        int var23 = arg4;
                                                        if (arg3 < 0) {
                                                            var21 = 0;
                                                        } else if (arg3 >= super.field5186) {
                                                            var21 = super.field5186;
                                                        }
                                                        if (arg4 < 0) {
                                                            var23 = 0;
                                                        } else if (~super.field5170 >= ~arg4) {
                                                            var23 = super.field5170;
                                                        }
                                                        int var24 = arg4 + 64;
                                                        if (~var22 <= -1) {
                                                            if (super.field5186 <= var22) {
                                                                var22 = super.field5186;
                                                            }
                                                        } else {
                                                            var22 = 0;
                                                        }
                                                        if (var24 >= 0) {
                                                            if (var24 >= super.field5170) {
                                                                var24 = super.field5170;
                                                            }
                                                        } else {
                                                            var24 = 0;
                                                        }
                                                        while (~var22 < ~var21) {
                                                            while (~var24 < ~var23) {
                                                                super.field5182[var19][var21][var23] = 0;
                                                                ++var23;
                                                            }
                                                            ++var21;
                                                        }
                                                    } else if (~var20 == -2) {
                                                        if (super.field5182[var19] == null) {
                                                            super.field5182[var19] = new byte[super.field5186 + 1][super.field5170 + 1];
                                                        }
                                                        for (int var25 = 0; ~var25 > -65; var25 += 4) {
                                                            for (int var26 = 0; var26 < 64; var26 += 4) {
                                                                byte var27 = arg5.method619((byte) -23);
                                                                for (int var28 = arg3 + var25; ~(arg3 + 4 + var25) < ~var28; ++var28) {
                                                                    for (int var29 = arg4 + var26; var29 < arg4 - -4 + var26; ++var29) {
                                                                        if (~var28 <= -1 && ~var28 > ~super.field5186 && var29 >= 0 && var29 < super.field5170) {
                                                                            super.field5182[var19][var28][var29] = var27;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (var20 == 2) {
                                                        if (super.field5182[var19] == null) {
                                                            super.field5182[var19] = new byte[super.field5186 + 1][super.field5170 + 1];
                                                        }
                                                        if (~var19 < -1) {
                                                            int var30 = arg3;
                                                            int var31 = arg3 - -64;
                                                            int var32 = arg4;
                                                            if (arg4 < 0) {
                                                                var32 = 0;
                                                            } else if (~arg4 <= ~super.field5170) {
                                                                var32 = super.field5170;
                                                            }
                                                            if (~var31 > -1) {
                                                                var31 = 0;
                                                            } else if (super.field5186 <= var31) {
                                                                var31 = super.field5186;
                                                            }
                                                            int var33 = arg4 - -64;
                                                            if (~arg3 > -1) {
                                                                var30 = 0;
                                                            } else if (super.field5186 <= arg3) {
                                                                var30 = super.field5186;
                                                            }
                                                            if (~var33 > -1) {
                                                                var33 = 0;
                                                            } else if (~super.field5170 >= ~var33) {
                                                                var33 = super.field5170;
                                                            }
                                                            while (var31 > var30) {
                                                                while (var32 < var33) {
                                                                    super.field5182[var19][var30][var32] = super.field5182[var19 + -1][var30][var32];
                                                                    ++var32;
                                                                }
                                                                ++var30;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (var8 == null) {
                                                var8 = new class20();
                                            }
                                            var8.method163(arg0 + -17459, arg5);
                                        }
                                    } else {
                                        int var34 = arg5.method618((byte) 100);
                                        if (var34 > 0) {
                                            for (int var35 = 0; var35 < var34; ++var35) {
                                                class138 var36 = new class138(arg2, arg5, 0);
                                                if (~var36.field2019 == -32) {
                                                    class437 var37 = class64.field896.method2774(true, arg5.method631(10494));
                                                    var36.method920(14708, var37.field6483, var37.field6476, var37.field6484, var37.field6486);
                                                }
                                                if (arg2.method1084() > 0) {
                                                    class471 var38 = var36.field2020;
                                                    int var39 = (arg3 << 7) + var38.method2827(arg0 ^ 7708);
                                                    int var40 = var38.method2832(arg0 + -17444) - -(arg4 << 7);
                                                    int var41 = var39 >> 7;
                                                    int var42 = var40 >> 7;
                                                    if (~var41 <= -1 && var42 >= 0 && ~super.field5186 < ~var41 && var42 < super.field5170) {
                                                        var38.method428(var39, var40, super.field5184[var36.field2015][var41][var42] + -var38.method2825(arg0 ^ 17438), -20104);
                                                        if (arg2.method1084() > 0) {
                                                            class107.method714(var36);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var8 = new class20(arg5);
                                }
                            }
                            if (var8 != null) {
                                for (int var9 = 0; var9 < 8; ++var9) {
                                    for (int var10 = 0; ~var10 > -9; ++var10) {
                                        int var11 = (arg3 >> 3) - -var9;
                                        int var12 = (arg4 >> 3) + var10;
                                        if (~var11 <= -1 && ~var11 > ~(super.field5186 >> 3) && ~var12 <= -1 && super.field5170 >> 3 > var12) {
                                            class240.method1613(var8, var11, var12, 8);
                                        }
                                    }
                                }
                            }
                            if (arg0 != 17459) {
                                this.method1178((class370[]) null, (byte[]) null, -105, 38, 111, 4, -38, -126, -100, -72, (class496) null);
                            }
                            if (!var7 && super.field5182 != null) {
                                for (int var13 = 0; ~var13 > -5; ++var13) {
                                    if (super.field5182[var13] != null) {
                                        for (int var14 = 0; ~var14 > -17; ++var14) {
                                            for (int var15 = 0; ~var15 > -17; ++var15) {
                                                int var16 = (arg3 >> 2) + var14;
                                                int var17 = (arg4 >> 2) + var15;
                                                if (var16 >= 0 && ~var16 > -27 && var17 >= 0 && var17 < 26) {
                                                    super.field5182[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lof;I)I")
    public static final int method1177(class321 arg0, int arg1) {
        ++field2431;
        int var2 = arg0.method2084((byte) -118, 2);
        if (arg1 != 5) {
            return -10;
        } else {
            int var3;
            if (var2 == 0) {
                var3 = 0;
            } else if (var2 != 1) {
                if (~var2 == -3) {
                    var3 = arg0.method2084((byte) -118, 8);
                } else {
                    var3 = arg0.method2084((byte) -118, 11);
                }
            } else {
                var3 = arg0.method2084((byte) -118, 5);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([Lwq;[BIIIIIIIILqa;)V")
    public final void method1178(class370[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class496 arg10) {
        ++field2427;
        class91 var12 = new class91(arg1);
        int var13 = -1;
        while (true) {
            int var14 = var12.method581((byte) 110);
            if (var14 == 0) {
                if (arg8 != 0) {
                    this.field2432 = -8;
                    return;
                }
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method598(false);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = 63 & var15;
                int var18 = (var15 & 4057) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method618((byte) 100);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (arg4 == var19 && var18 >= arg7 && var18 < arg7 + 8 && var17 >= arg5 && arg5 - -8 > var17) {
                    class130 var23 = class56.field755.method2031(-98, var13);
                    int var24 = arg6 - -class456.method2746(var23.field1898, (byte) 86, var22, arg3, var23.field1843, var18 & 7, var17 & 7);
                    int var25 = arg2 - -class509.method3033(var23.field1898, 7 & var18, var22, var17 & 7, var23.field1843, arg3, -10);
                    if (var24 > 0 && ~var25 < -1 && super.field5186 + -1 > var24 && super.field5170 + -1 > var25) {
                        class370 var26 = null;
                        if (!super.field5190) {
                            int var27 = arg9;
                            if ((class129.field1816[1][var24][var25] & 2) == 2) {
                                var27 = arg9 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg0[var27];
                            }
                        }
                        this.method1179(arg10, arg9, var24, arg9, (byte) -48, arg3 + var22 & 3, var21, var25, var13, var26, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lqa;IIIBIIIILwq;I)V")
    public final void method1179(class496 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, class370 arg9, int arg10) {
        ++field2426;
        if (class96.field1399.method1734(116, class441.field6563) || class411.method2500(arg3, class430.field6399, arg2, arg7, (byte) 113)) {
            if (~arg1 > ~this.field2432) {
                this.field2432 = arg1;
            }
            class130 var12 = class56.field755.method2031(113, arg8);
            if (!arg0.method1077() || !class96.field1399.field5209 || !var12.field1828) {
                int var13;
                int var14;
                if (~arg5 != -2 && ~arg5 != -4) {
                    var13 = var12.field1843;
                    var14 = var12.field1898;
                } else {
                    var13 = var12.field1898;
                    var14 = var12.field1843;
                }
                int var15;
                int var16;
                if (super.field5186 < arg2 + var13) {
                    var15 = arg2 + 1;
                    var16 = arg2;
                } else {
                    var16 = (var13 >> 1) + arg2;
                    var15 = (var13 + 1 >> 1) + arg2;
                }
                if (arg4 != -48) {
                    method1175(28);
                }
                int var17;
                int var18;
                if (arg7 + var14 <= super.field5170) {
                    var17 = (var14 + 1 >> 1) + arg7;
                    var18 = arg7 - -(var14 >> 1);
                } else {
                    var18 = arg7;
                    var17 = arg7 + 1;
                }
                class206 var19 = class455.field6683[arg3];
                int var20 = var19.method849(var16, var18) - -var19.method849(var15, var18) - (-var19.method849(var16, var17) - var19.method849(var15, var17)) >> 2;
                int var21 = (arg2 << 7) + (var13 << 6);
                int var22 = (arg7 << 7) + (var14 << 6);
                boolean var23 = class265.field3700 && !super.field5190 && var12.field1857;
                if (var12.method837(25828)) {
                    class242.method1617((class194) null, arg2, (byte) -51, arg7, var12, arg5, (class322) null, arg1);
                }
                boolean var24 = arg10 == -1 && ~var12.field1848 == 0 && var12.field1860 == null && var12.field1823 == null && !var12.field1889;
                if (!class391.field5944 || (!class500.method2986((byte) -14, arg6) || ~var12.field1852 == -2) && (!class341.method2196(0, arg6) || var12.field1852 != 0)) {
                    if (arg6 == 22) {
                        if (class96.field1399.field5196 || ~var12.field1886 != -1 || ~var12.field1897 == -2 || var12.field1856) {
                            class383 var25;
                            if (!var24) {
                                var25 = new class353(arg0, var12, arg1, arg3, var21, var20, var22, super.field5190, arg5, arg10);
                            } else {
                                class273 var26 = new class273(arg0, var12, arg3, var21, var20, var22, super.field5190, arg5, var23);
                                var25 = var26;
                                if (var26.method60((byte) -110)) {
                                    var26.method55((byte) -91, arg0);
                                }
                            }
                            class383 var27 = class380.method2357(arg1, arg2, arg7);
                            if (var27 instanceof class286) {
                                ((class286) var27).field4270 = var25;
                            } else {
                                class288.method1868(arg1, arg2, arg7, var25);
                            }
                            if (~var12.field1897 == -2 && arg9 != null) {
                                arg9.method2321(arg2, arg7, -121);
                            }
                        }
                    } else if (~arg6 != -11 && ~arg6 != -12) {
                        if (~arg6 <= -13 && ~arg6 >= -18 || arg6 >= 18 && ~arg6 >= -22) {
                            class153 var28;
                            if (!var24) {
                                var28 = new class425(arg0, var12, arg1, arg3, var21, var20, var22, super.field5190, arg2, arg2 + -1 + var13, arg7, arg7 - 1 + var14, arg6, arg5, arg10);
                            } else {
                                class121 var29 = new class121(arg0, var12, arg1, arg3, var21, var20, var22, super.field5190, arg2, arg2 - 1 + var13, arg7, arg7 + var14 + -1, arg6, arg5, var23);
                                if (var29.method60((byte) -124)) {
                                    var29.method55((byte) -66, arg0);
                                }
                                var28 = var29;
                            }
                            class153 var30 = class432.method2587(arg1, arg2, arg7, field2435 != null ? field2435 : (field2435 = method1180("ou")));
                            if (var30 instanceof class399 && ~var30.field2208 == ~arg2 && var30.field2216 == arg7) {
                                ((class399) var30).field6076 = var28;
                            } else {
                                class223.method1511(var28, false);
                            }
                            if (class265.field3700 && !super.field5190 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg1 > 0 && ~var12.field1852 != -1) {
                                super.field5191[arg1][arg2][arg7] = (byte) class286.method1860(super.field5191[arg1][arg2][arg7], 4);
                            }
                            if (var12.field1897 != 0 && arg9 != null) {
                                arg9.method2315(arg7, -1, !var12.field1893, var12.field1869, var13, arg2, var14);
                            }
                        } else if (arg6 == 0) {
                            int var31 = var12.field1852;
                            if (class441.field6559 && ~var12.field1852 == 0) {
                                var31 = 1;
                            }
                            class70 var33;
                            if (var24) {
                                class6 var32 = new class6(arg0, var12, arg3, var21, var20, var22, super.field5190, arg6, arg5, var23);
                                if (var32.method60((byte) -114)) {
                                    var32.method55((byte) -103, arg0);
                                }
                                var33 = var32;
                            } else {
                                var33 = new class26(arg0, var12, arg1, arg3, var21, var20, var22, super.field5190, arg6, arg5, arg10);
                            }
                            class70 var34 = class456.method2743(arg1, arg2, arg7);
                            if (!(var34 instanceof class458)) {
                                class250.method1638(arg1, arg2, arg7, var33, (class70) null);
                            } else {
                                ((class458) var34).field6719 = var33;
                            }
                            if (class265.field3700) {
                                if (arg5 != 0) {
                                    if (arg5 == 1) {
                                        if (var12.field1890) {
                                            var19.method848(arg2, arg7 + 1, 50);
                                            var19.method848(arg2 + 1, arg7 - -1, 50);
                                        }
                                        if (var31 == 1 && !super.field5190) {
                                            super.field5191[arg1][arg2][arg7 + 1] = (byte) class286.method1860(super.field5191[arg1][arg2][arg7 + 1], 2);
                                        }
                                    } else if (arg5 == 2) {
                                        if (var12.field1890) {
                                            var19.method848(arg2 - -1, arg7, 50);
                                            var19.method848(arg2 + 1, arg7 - -1, 50);
                                        }
                                        if (var31 == 1 && !super.field5190) {
                                            super.field5191[arg1][arg2 + 1][arg7] = (byte) class286.method1860(super.field5191[arg1][arg2 + 1][arg7], 1);
                                        }
                                    } else if (arg5 == 3) {
                                        if (var12.field1890) {
                                            var19.method848(arg2, arg7, 50);
                                            var19.method848(arg2 + 1, arg7, 50);
                                        }
                                        if (~var31 == -2 && !super.field5190) {
                                            super.field5191[arg1][arg2][arg7] = (byte) class286.method1860(super.field5191[arg1][arg2][arg7], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field1890) {
                                        var19.method848(arg2, arg7, 50);
                                        var19.method848(arg2, arg7 + 1, 50);
                                    }
                                    if (~var31 == -2 && !super.field5190) {
                                        super.field5191[arg1][arg2][arg7] = (byte) class286.method1860(super.field5191[arg1][arg2][arg7], 1);
                                    }
                                }
                            }
                            if (var12.field1897 != 0 && arg9 != null) {
                                arg9.method2316(arg5, arg2, var12.field1869, -60, arg6, !var12.field1893, arg7);
                            }
                            if (var12.field1900 != 16) {
                                class215.method1464(arg1, arg2, arg7, var12.field1900);
                            }
                        } else if (~arg6 == -2) {
                            class70 var35;
                            if (!var24) {
                                var35 = new class26(arg0, var12, arg1, arg3, var21, var20, var22, super.field5190, arg6, arg5, arg10);
                            } else {
                                class6 var36 = new class6(arg0, var12, arg3, var21, var20, var22, super.field5190, arg6, arg5, var23);
                                var35 = var36;
                                if (var36.method60((byte) -116)) {
                                    var36.method55((byte) -87, arg0);
                                }
                            }
                            class70 var37 = class456.method2743(arg1, arg2, arg7);
                            if (!(var37 instanceof class458)) {
                                class250.method1638(arg1, arg2, arg7, var35, (class70) null);
                            } else {
                                ((class458) var37).field6719 = var35;
                            }
                            if (var12.field1890 && class265.field3700) {
                                if (~arg5 == -1) {
                                    var19.method848(arg2, arg7 - -1, 50);
                                } else if (~arg5 != -2) {
                                    if (~arg5 == -3) {
                                        var19.method848(arg2 + 1, arg7, 50);
                                    } else if (arg5 == 3) {
                                        var19.method848(arg2, arg7, 50);
                                    }
                                } else {
                                    var19.method848(arg2 + 1, arg7 + 1, 50);
                                }
                            }
                            if (~var12.field1897 != -1 && arg9 != null) {
                                arg9.method2316(arg5, arg2, var12.field1869, arg4 ^ 90, arg6, !var12.field1893, arg7);
                            }
                        } else if (~arg6 == -3) {
                            int var38 = arg5 + 1 & 3;
                            class70 var41;
                            class70 var42;
                            if (var24) {
                                class6 var39 = new class6(arg0, var12, arg3, var21, var20, var22, super.field5190, arg6, arg5 + 4, var23);
                                class6 var40 = new class6(arg0, var12, arg3, var21, var20, var22, super.field5190, arg6, var38, var23);
                                if (var39.method60((byte) -114)) {
                                    var39.method55((byte) -83, arg0);
                                }
                                var41 = var40;
                                var42 = var39;
                                if (var40.method60((byte) -111)) {
                                    var40.method55((byte) -126, arg0);
                                }
                            } else {
                                var42 = new class26(arg0, var12, arg1, arg3, var21, var20, var22, super.field5190, arg6, arg5 + 4, arg10);
                                var41 = new class26(arg0, var12, arg1, arg3, var21, var20, var22, super.field5190, arg6, var38, arg10);
                            }
                            class250.method1638(arg1, arg2, arg7, var42, var41);
                            if (~var12.field1852 == -2 && class265.field3700 && !super.field5190) {
                                if (~arg5 == -1) {
                                    super.field5191[arg1][arg2][arg7] = (byte) class286.method1860(super.field5191[arg1][arg2][arg7], 1);
                                    super.field5191[arg1][arg2][arg7 + 1] = (byte) class286.method1860(super.field5191[arg1][arg2][arg7 + 1], 2);
                                } else if (arg5 == 1) {
                                    super.field5191[arg1][arg2][arg7 - -1] = (byte) class286.method1860(super.field5191[arg1][arg2][arg7 - -1], 2);
                                    super.field5191[arg1][arg2 + 1][arg7] = (byte) class286.method1860(super.field5191[arg1][arg2 + 1][arg7], 1);
                                } else if (arg5 != 2) {
                                    if (arg5 == 3) {
                                        super.field5191[arg1][arg2][arg7] = (byte) class286.method1860(super.field5191[arg1][arg2][arg7], 2);
                                        super.field5191[arg1][arg2][arg7] = (byte) class286.method1860(super.field5191[arg1][arg2][arg7], 1);
                                    }
                                } else {
                                    super.field5191[arg1][arg2 + 1][arg7] = (byte) class286.method1860(super.field5191[arg1][arg2 + 1][arg7], 1);
                                    super.field5191[arg1][arg2][arg7] = (byte) class286.method1860(super.field5191[arg1][arg2][arg7], 2);
                                }
                            }
                            if (~var12.field1897 != -1 && arg9 != null) {
                                arg9.method2316(arg5, arg2, var12.field1869, -128, arg6, !var12.field1893, arg7);
                            }
                            if (~var12.field1900 != -17) {
                                class215.method1464(arg1, arg2, arg7, var12.field1900);
                            }
                        } else if (arg6 == 3) {
                            class70 var44;
                            if (var24) {
                                class6 var43 = new class6(arg0, var12, arg3, var21, var20, var22, super.field5190, arg6, arg5, var23);
                                var44 = var43;
                                if (var43.method60((byte) -109)) {
                                    var43.method55((byte) -77, arg0);
                                }
                            } else {
                                var44 = new class26(arg0, var12, arg1, arg3, var21, var20, var22, super.field5190, arg6, arg5, arg10);
                            }
                            class70 var45 = class456.method2743(arg1, arg2, arg7);
                            if (!(var45 instanceof class458)) {
                                class250.method1638(arg1, arg2, arg7, var44, (class70) null);
                            } else {
                                ((class458) var45).field6719 = var44;
                            }
                            if (var12.field1890 && class265.field3700) {
                                if (~arg5 == -1) {
                                    var19.method848(arg2, arg7 - -1, 50);
                                } else if (arg5 != 1) {
                                    if (~arg5 != -3) {
                                        if (arg5 == 3) {
                                            var19.method848(arg2, arg7, 50);
                                        }
                                    } else {
                                        var19.method848(arg2 + 1, arg7, 50);
                                    }
                                } else {
                                    var19.method848(arg2 + 1, arg7 + 1, 50);
                                }
                            }
                            if (~var12.field1897 != -1 && arg9 != null) {
                                arg9.method2316(arg5, arg2, var12.field1869, arg4 ^ 99, arg6, !var12.field1893, arg7);
                            }
                        } else if (~arg6 == -10) {
                            class153 var47;
                            if (var24) {
                                class121 var46 = new class121(arg0, var12, arg1, arg3, var21, var20, var22, super.field5190, arg2, arg2, arg7, arg7, arg6, arg5, var23);
                                if (var46.method60((byte) -120)) {
                                    var46.method55((byte) -85, arg0);
                                }
                                var47 = var46;
                            } else {
                                var47 = new class425(arg0, var12, arg1, arg3, var21, var20, var22, super.field5190, arg2, arg2 + var13 + -1, arg7, arg7 + -1 + var14, arg6, arg5, arg10);
                            }
                            class153 var48 = class432.method2587(arg1, arg2, arg7, field2435 != null ? field2435 : (field2435 = method1180("ou")));
                            if (var48 instanceof class399 && ~var48.field2208 == ~arg2 && var48.field2216 == arg7) {
                                ((class399) var48).field6076 = var47;
                            } else {
                                class223.method1511(var47, false);
                            }
                            if (~var12.field1897 != -1 && arg9 != null) {
                                arg9.method2315(arg7, -1, !var12.field1893, var12.field1869, var13, arg2, var14);
                            }
                            if (~var12.field1900 != -17) {
                                class215.method1464(arg1, arg2, arg7, var12.field1900);
                            }
                        } else if (~arg6 == -5) {
                            class255 var50;
                            if (var24) {
                                class77 var49 = new class77(arg0, var12, arg3, var21, var20, var22, super.field5190, 0, 0, 0, arg6, arg5);
                                if (var49.method60((byte) -110)) {
                                    var49.method55((byte) -51, arg0);
                                }
                                var50 = var49;
                            } else {
                                var50 = new class249(arg0, var12, arg1, arg3, var21, var20, var22, super.field5190, 0, 0, 0, arg6, arg5, arg10);
                            }
                            class255 var51 = class174.method1214(arg1, arg2, arg7);
                            if (var51 instanceof class392) {
                                ((class392) var51).field5955 = var50;
                            } else {
                                class393.method2414(arg1, arg2, arg7, var50, (class255) null);
                            }
                        } else if (~arg6 == -6) {
                            int var52 = 17;
                            class196 var53 = (class196) class456.method2743(arg1, arg2, arg7);
                            if (var53 != null) {
                                var52 = class56.field755.method2031(123, var53.method50(25707)).field1900 - -1;
                            }
                            class255 var54;
                            if (!var24) {
                                var54 = new class249(arg0, var12, arg1, arg3, var21, var20, var22, super.field5190, 0, class41.field631[arg5] * var52, class395.field5997[arg5] * var52, arg6, arg5, arg10);
                            } else {
                                class77 var55 = new class77(arg0, var12, arg3, var21, var20, var22, super.field5190, 0, class41.field631[arg5] * var52, class395.field5997[arg5] * var52, arg6, arg5);
                                var54 = var55;
                                if (var55.method60((byte) -114)) {
                                    var55.method55((byte) -83, arg0);
                                }
                            }
                            class255 var56 = class174.method1214(arg1, arg2, arg7);
                            if (!(var56 instanceof class392)) {
                                class393.method2414(arg1, arg2, arg7, var54, (class255) null);
                            } else {
                                ((class392) var56).field5955 = var54;
                            }
                        } else if (~arg6 == -7) {
                            int var57 = 9;
                            class196 var58 = (class196) class456.method2743(arg1, arg2, arg7);
                            if (var58 != null) {
                                var57 = class56.field755.method2031(arg4 + -45, var58.method50(25707)).field1900 / 2 + 1;
                            }
                            class255 var59;
                            if (!var24) {
                                var59 = new class249(arg0, var12, arg1, arg3, var21, var20, var22, super.field5190, arg5, class113.field1584[arg5] * var57, class375.field5740[arg5] * var57, arg6, arg5 + 4, arg10);
                            } else {
                                class77 var60 = new class77(arg0, var12, arg3, var21, var20, var22, super.field5190, arg5, class41.field631[arg5] * var57, class395.field5997[arg5] * var57, arg6, arg5 + 4);
                                if (var60.method60((byte) -111)) {
                                    var60.method55((byte) -116, arg0);
                                }
                                var59 = var60;
                            }
                            class255 var61 = class174.method1214(arg1, arg2, arg7);
                            if (var61 instanceof class392) {
                                ((class392) var61).field5955 = var59;
                            } else {
                                class393.method2414(arg1, arg2, arg7, var59, (class255) null);
                            }
                        } else if (arg6 == 7) {
                            int var62 = arg5 + 2 & 3;
                            class255 var64;
                            if (var24) {
                                class77 var63 = new class77(arg0, var12, arg3, var21, var20, var22, super.field5190, var62, 0, 0, arg6, var62 + 4);
                                var64 = var63;
                                if (var63.method60((byte) -124)) {
                                    var63.method55((byte) -70, arg0);
                                }
                            } else {
                                var64 = new class249(arg0, var12, arg1, arg3, var21, var20, var22, super.field5190, var62, 0, 0, arg6, var62 + 4, arg10);
                            }
                            class255 var65 = class174.method1214(arg1, arg2, arg7);
                            if (!(var65 instanceof class392)) {
                                class393.method2414(arg1, arg2, arg7, var64, (class255) null);
                            } else {
                                ((class392) var65).field5955 = var64;
                            }
                        } else if (arg6 == 8) {
                            int var66 = 3 & arg5 + 2;
                            int var67 = 9;
                            class196 var68 = (class196) class456.method2743(arg1, arg2, arg7);
                            if (var68 != null) {
                                var67 = 1 + class56.field755.method2031(123, var68.method50(25707)).field1900 / 2;
                            }
                            class255 var71;
                            class255 var72;
                            if (var24) {
                                class77 var69 = new class77(arg0, var12, arg3, var21, var20, var22, super.field5190, arg5, class113.field1584[arg5] * var67, class375.field5740[arg5] * var67, arg6, arg5 + 4);
                                class77 var70 = new class77(arg0, var12, arg3, var21, var20, var22, super.field5190, arg5, 0, 0, arg6, var66 + 4);
                                if (var69.method60((byte) -128)) {
                                    var69.method55((byte) -50, arg0);
                                }
                                if (var70.method60((byte) -117)) {
                                    var70.method55((byte) -57, arg0);
                                }
                                var71 = var70;
                                var72 = var69;
                            } else {
                                class249 var73 = new class249(arg0, var12, arg1, arg3, var21, var20, var22, super.field5190, arg5, class113.field1584[arg5] * var67, class375.field5740[arg5] * var67, arg6, arg5 + 4, arg10);
                                class249 var74 = new class249(arg0, var12, arg1, arg3, var21, var20, var22, super.field5190, arg5, 0, 0, arg6, var66 + 4, arg10);
                                var72 = var73;
                                var71 = var74;
                            }
                            class393.method2414(arg1, arg2, arg7, var72, var71);
                        }
                    } else {
                        class121 var75 = null;
                        int var76;
                        class153 var77;
                        if (!var24) {
                            var76 = 15;
                            var77 = new class425(arg0, var12, arg1, arg3, var21, var20, var22, super.field5190, arg2, arg2 + -1 + var13, arg7, var14 - 1 + arg7, arg6, arg5, arg10);
                        } else {
                            class121 var78 = new class121(arg0, var12, arg1, arg3, var21, var20, var22, super.field5190, arg2, arg2 + -1 - -var13, arg7, var14 + -1 + arg7, arg6, arg5, var23);
                            var75 = var78;
                            var77 = var78;
                            var76 = var78.method778(4);
                        }
                        class153 var79 = class432.method2587(arg1, arg2, arg7, field2435 != null ? field2435 : (field2435 = method1180("ou")));
                        boolean var80 = false;
                        if (var79 instanceof class399 && ~var79.field2208 == ~arg2 && ~var79.field2216 == ~arg7) {
                            var80 = true;
                            ((class399) var79).field6076 = var77;
                        }
                        if (var80 || class223.method1511(var77, false)) {
                            if (var75 != null && var75.method60((byte) -110)) {
                                var75.method55((byte) -71, arg0);
                            }
                            if (var12.field1890 && class265.field3700) {
                                if (var76 > 30) {
                                    var76 = 30;
                                }
                                for (int var81 = 0; var13 >= var81; ++var81) {
                                    for (int var82 = 0; ~var82 >= ~var14; ++var82) {
                                        var19.method848(arg2 + var81, arg7 + var82, var76);
                                    }
                                }
                            }
                        }
                        if (~var12.field1897 != -1 && arg9 != null) {
                            arg9.method2315(arg7, -1, !var12.field1893, var12.field1869, var13, arg2, var14);
                        }
                    }
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1180(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
