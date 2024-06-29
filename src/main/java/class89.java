import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class89 extends class437 {

    @OriginalMember(owner = "client!haa", name = "O", descriptor = "I")
    public int field1012 = 99;

    @OriginalMember(owner = "client!haa", name = "W", descriptor = "[Ljava/lang/String;")
    private static final String[] field1021 = new String[] { method769(method768("K\u007fiY")), method769(method768("Mkd\u001b\u000ed\"")), method769(method768("^$+\u001b1")), method769(method768("Mkd\u001b\u0018\r")), method769(method768("Mkd\u001b\u001e\r")), method769(method768("Knd")), method769(method768("Mkd\u001b\rd\"")), method769(method768("Mkd\u001b\u000fd\"")), method769(method768("Mkd\u001b\u001f\r")), method769(method768("Mkd\u001b\u001d\r")), method769(method768("Mkd\u001b\u0019\r")), method769(method768("Mkd\u001b\td\"")), method769(method768("Mkd\u001b\u001b\r")), method769(method768("Mkd\u001b\u001a\r")) };

    @OriginalMember(owner = "client!haa", name = "Q", descriptor = "[S")
    private static short[] field1004 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!haa", name = "U", descriptor = "[S")
    private static short[] field1006 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!haa", name = "A", descriptor = "[S")
    private static short[] field1011 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!haa", name = "N", descriptor = "[[S")
    public static short[][] field1016 = new short[][] { field1004, field1011, field1006 };

    @OriginalMember(owner = "client!haa", name = "R", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!haa", name = "T", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!haa", name = "S", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!haa", name = "L", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!haa", name = "G", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!haa", name = "V", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!haa", name = "J", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!haa", name = "H", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!haa", name = "K", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!haa", name = "I", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!haa", name = "P", descriptor = "Lkp;")
    public static class514 field1009;

    // $FF: synthetic field
    @OriginalMember(owner = "client!haa", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field1020;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIZIII)V")
    public static final void method754(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        try {
            if (arg3) {
                for (class14 var7 = (class14) class712.field10331.method4538(!arg3); var7 != null; var7 = (class14) class712.field10331.method4543(0)) {
                    if (~class375.field5711 <= ~var7.field180) {
                        var7.method4696(45);
                    } else {
                        class117.method1030(arg0 >> 1, arg6 >> 1, 1, var7.field175 * 2, var7.field173, arg5, (var7.field177 << 9) + 256, (var7.field174 << 9) + 256, arg2);
                        class269.field4100.method608(class694.field10139[0] + arg1, class694.field10139[1] + arg4, -16777216 | var7.field182, true, 0, var7.field183);
                    }
                }
                ++field1010;
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field1021[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
    public static final void method755(int arg0) {
        class87.field984 = arg0;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I[BIILha;[Ldja;BIIII)V")
    public final void method756(int arg0, byte[] arg1, int arg2, int arg3, class66 arg4, class324[] arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        try {
            ++field1005;
            if (arg6 != 105) {
                method766(-15, -60, -14);
            }
            class163 var12 = new class163(arg1);
            int var13 = -1;
            while (true) {
                int var14 = var12.method1468((byte) -126);
                if (var14 == 0) {
                    return;
                }
                var13 += var14;
                int var15 = 0;
                while (true) {
                    int var16 = var12.method1425(25);
                    if (~var16 == -1) {
                        break;
                    }
                    var15 += var16 + -1;
                    int var17 = 63 & var15;
                    int var18 = (4069 & var15) >> 6;
                    int var19 = var15 >> 12;
                    int var20 = var12.method1455((byte) 62);
                    int var21 = var20 >> 2;
                    int var22 = var20 & 3;
                    if (arg7 == var19 && ~arg10 >= ~var18 && arg10 - -8 > var18 && ~arg9 >= ~var17 && arg9 - -8 > var17) {
                        class198 var23 = class417.field6144.method3030(0, var13);
                        int var24 = arg3 + class204.method1817(var23.field3093, var23.field3087, arg2, var18 & 7, 15, var22, 7 & var17);
                        int var25 = arg0 + class554.method4166(var17 & 7, arg2, var23.field3087, var23.field3093, true, var22, var18 & 7);
                        if (var24 > 0 && var25 > 0 && ~(super.field6395 + -1) < ~var24 && super.field6405 + -1 > var25) {
                            class324 var26 = null;
                            if (!super.field6424) {
                                int var27 = arg8;
                                if ((2 & class184.field2545[1][var24][var25]) == 2) {
                                    var27 = arg8 - 1;
                                }
                                if (var27 >= 0) {
                                    var26 = arg5[var27];
                                }
                            }
                            this.method758(arg4, var26, var21, var25, -1, var24, 110, arg8, 3 & var22 - -arg2, var13, arg8);
                        }
                    }
                }
            }
        } catch (RuntimeException var29) {
            throw class759.method5498(var29, field1021[1] + arg0 + ',' + (arg1 != null ? field1021[2] : field1021[0]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1021[2] : field1021[0]) + ',' + (arg5 != null ? field1021[2] : field1021[0]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(IIIZ)V")
    public class89(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class546.field8157, class224.field3429);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IILdja;Lha;III)V")
    public final void method757(int arg0, int arg1, class324 arg2, class66 arg3, int arg4, int arg5, int arg6) {
        try {
            ++field1019;
            class583 var8 = this.method765(arg0, arg5, -1, arg6, arg4);
            if (arg1 != 1) {
                field1016 = null;
            }
            if (var8 != null) {
                class198 var9 = class417.field6144.method3030(arg1 + -1, var8.method1083((byte) 122));
                int var10 = var8.method1087(18636);
                int var11 = var8.method1097(false);
                if (var9.method1772((byte) 87)) {
                    class273.method2259(arg6, arg4, arg0, false, var9);
                }
                if (var8.method1095(-9842)) {
                    var8.method1096(-82, arg3);
                }
                if (~arg5 == -1) {
                    class57.method421(arg0, arg4, arg6);
                    if (~var9.field3078 != -1) {
                        arg2.method2737((byte) -5, !var9.field3018, var9.field3064, arg4, var10, arg6, var11);
                    }
                    if (~var9.field3021 == -2) {
                        if (~var11 == -1) {
                            class222.method1927(arg1 ^ 98, arg4, arg6, arg0, 1);
                            return;
                        }
                        if (var11 != 1) {
                            if (~var11 != -3) {
                                if (~var11 == -4) {
                                    class222.method1927(arg1 + -97, arg4, arg6, arg0, 2);
                                    return;
                                }
                            } else {
                                class222.method1927(-110, arg4 + 1, arg6, arg0, 1);
                            }
                            return;
                        }
                        class222.method1927(-76, arg4, arg6 + 1, arg0, 2);
                        return;
                    }
                } else {
                    if (arg5 == 1) {
                        class270.method2238(arg0, arg4, arg6);
                        return;
                    }
                    if (arg5 == 2) {
                        class212.method1862(arg0, arg4, arg6, field1020 != null ? field1020 : (field1020 = method767(field1021[5])));
                        if (~var9.field3078 != -1 && ~(arg4 - -var9.field3093) > ~super.field6395 && ~(arg6 - -var9.field3093) > ~super.field6405 && ~(var9.field3087 + arg4) > ~super.field6395 && ~super.field6405 < ~(arg6 - -var9.field3087)) {
                            arg2.method2754(arg6, var9.field3064, !var9.field3018, -1, var9.field3087, arg4, var9.field3093, var11);
                        }
                        if (~var10 == -10) {
                            if ((var11 & 1) != 0) {
                                class222.method1927(100, arg4, arg6, arg0, 16);
                                return;
                            }
                            class222.method1927(arg1 ^ -35, arg4, arg6, arg0, 8);
                            return;
                        }
                    } else {
                        if (~arg5 != -4) {
                            return;
                        }
                        class642.method4703(arg0, arg4, arg6);
                        if (var9.field3078 != 1) {
                            return;
                        }
                        arg2.method2738(arg6, (byte) 105, arg4);
                    }
                }
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field1021[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1021[2] : field1021[0]) + ',' + (arg3 != null ? field1021[2] : field1021[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lha;Ldja;IIIIIIIII)V")
    public final void method758(class66 arg0, class324 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        try {
            ++field1008;
            if (class289.field4305.field825.method717(false) != 0 || class256.method2171(2, arg7, arg3, class419.field6182, arg5)) {
                if (arg10 < this.field1012) {
                    this.field1012 = arg10;
                }
                class198 var12 = class417.field6144.method3030(0, arg9);
                if (class289.field4305.field835.method1184(false) != 0 || !var12.field3004) {
                    int var13;
                    int var14;
                    if (~arg8 != -2 && ~arg8 != -4) {
                        var13 = var12.field3093;
                        var14 = var12.field3087;
                    } else {
                        var13 = var12.field3087;
                        var14 = var12.field3093;
                    }
                    int var15;
                    int var16;
                    if (~(arg5 + var13) >= ~super.field6395) {
                        var15 = (var13 >> 1) + arg5;
                        var16 = (var13 + 1 >> 1) + arg5;
                    } else {
                        var16 = arg5 + 1;
                        var15 = arg5;
                    }
                    int var17;
                    int var18;
                    if (~super.field6405 <= ~(arg3 - -var14)) {
                        var17 = arg3 - -(var14 >> 1);
                        var18 = (var14 + 1 >> 1) + arg3;
                    } else {
                        var18 = arg3 + 1;
                        var17 = arg3;
                    }
                    class294 var19 = class555.field8261[arg7];
                    int var20 = var19.method2407(var17, var15, 62) + var19.method2407(var17, var16, 122) - -var19.method2407(var18, var15, 96) - -var19.method2407(var18, var16, -100) >> 2;
                    int var21 = (arg5 << 9) + (var13 << 8);
                    int var22 = (arg3 << 9) - -(var14 << 8);
                    boolean var23 = class459.field6679 && !super.field6424 && var12.field3073;
                    if (arg6 <= 32) {
                        field1004 = null;
                    }
                    if (var12.method1772((byte) 81)) {
                        class483.method3682(arg5, arg8, (class612) null, 29075, arg10, (class726) null, arg3, var12);
                    }
                    boolean var24 = arg4 == -1 && ~var12.field3052 == 0 && var12.field3026 == null && var12.field3017 == null && !var12.field3039 && !var12.field3058;
                    if (!class255.field3954 || (!class264.method2211(31161, arg2) || ~var12.field3021 == -2) && (!class87.method735(28692, arg2) || ~var12.field3021 != -1)) {
                        if (arg2 == 22) {
                            if (class289.field4305.field845.method4770(false) != 0 || var12.field3082 != 0 || var12.field3078 == 1 || var12.field3100) {
                                class749 var26;
                                if (var24) {
                                    class459 var25 = new class459(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, arg8, var23);
                                    if (var25.method1095(-9842)) {
                                        var25.method1090(11, arg0);
                                    }
                                    var26 = var25;
                                } else {
                                    var26 = new class362(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, arg8, arg4);
                                }
                                class402.method3153(arg10, arg5, arg3, var26);
                                if (var12.field3078 == 1 && arg1 != null) {
                                    arg1.method2733((byte) 80, arg5, arg3);
                                }
                            }
                        } else if (~arg2 != -11 && arg2 != 11) {
                            if ((arg2 < 12 || arg2 > 17) && (~arg2 > -19 || arg2 > 21)) {
                                if (~arg2 == -1) {
                                    int var35 = var12.field3021;
                                    if (class276.field4163 && var12.field3021 == -1) {
                                        var35 = 1;
                                    }
                                    class261 var36;
                                    if (!var24) {
                                        var36 = new class748(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, arg2, arg8, arg4);
                                    } else {
                                        class779 var37 = new class779(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, arg2, arg8, var23);
                                        var36 = var37;
                                        if (var37.method1095(-9842)) {
                                            var37.method1090(46, arg0);
                                        }
                                    }
                                    class671.method4937(arg10, arg5, arg3, var36, (class261) null);
                                    if (arg8 == 0) {
                                        if (class459.field6679 && var12.field3068) {
                                            var19.method1509(arg5, arg3, 50);
                                            var19.method1509(arg5, arg3 - -1, 50);
                                        }
                                        if (~var35 == -2 && !super.field6424) {
                                            class278.method2287(arg10, arg5, arg3, 126, var12.field3085, var12.field3008, 1);
                                        }
                                    } else if (arg8 != 1) {
                                        if (~arg8 == -3) {
                                            if (class459.field6679 && var12.field3068) {
                                                var19.method1509(arg5 + 1, arg3, 50);
                                                var19.method1509(arg5 + 1, arg3 + 1, 50);
                                            }
                                            if (~var35 == -2 && !super.field6424) {
                                                class278.method2287(arg10, arg5 + 1, arg3, 106, var12.field3085, -var12.field3008, 1);
                                            }
                                        } else if (~arg8 == -4) {
                                            if (class459.field6679 && var12.field3068) {
                                                var19.method1509(arg5, arg3, 50);
                                                var19.method1509(arg5 - -1, arg3, 50);
                                            }
                                            if (~var35 == -2 && !super.field6424) {
                                                class278.method2287(arg10, arg5, arg3, 125, var12.field3085, var12.field3008, 2);
                                            }
                                        }
                                    } else {
                                        if (class459.field6679 && var12.field3068) {
                                            var19.method1509(arg5, arg3 - -1, 50);
                                            var19.method1509(arg5 + 1, arg3 + 1, 50);
                                        }
                                        if (var35 == 1 && !super.field6424) {
                                            class278.method2287(arg10, arg5, arg3 + 1, 110, var12.field3085, -var12.field3008, 2);
                                        }
                                    }
                                    if (var12.field3078 != 0 && arg1 != null) {
                                        arg1.method2746(arg2, -1, arg3, !var12.field3018, var12.field3064, arg5, arg8);
                                    }
                                    if (~var12.field3023 != -65) {
                                        class670.method4929(arg10, arg5, arg3, var12.field3023);
                                    }
                                } else if (~arg2 == -2) {
                                    class261 var38;
                                    if (!var24) {
                                        var38 = new class748(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, arg2, arg8, arg4);
                                    } else {
                                        class779 var39 = new class779(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, arg2, arg8, var23);
                                        var38 = var39;
                                        if (var39.method1095(-9842)) {
                                            var39.method1090(-126, arg0);
                                        }
                                    }
                                    class671.method4937(arg10, arg5, arg3, var38, (class261) null);
                                    if (var12.field3068 && class459.field6679) {
                                        if (arg8 != 0) {
                                            if (arg8 == 1) {
                                                var19.method1509(arg5 - -1, arg3 + 1, 50);
                                            } else if (~arg8 == -3) {
                                                var19.method1509(arg5 + 1, arg3, 50);
                                            } else if (~arg8 == -4) {
                                                var19.method1509(arg5, arg3, 50);
                                            }
                                        } else {
                                            var19.method1509(arg5, arg3 + 1, 50);
                                        }
                                    }
                                    if (var12.field3078 != 0 && arg1 != null) {
                                        arg1.method2746(arg2, -1, arg3, !var12.field3018, var12.field3064, arg5, arg8);
                                    }
                                } else if (~arg2 == -3) {
                                    int var40 = arg8 + 1 & 3;
                                    class261 var43;
                                    class261 var44;
                                    if (var24) {
                                        class779 var41 = new class779(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, arg2, arg8 + 4, var23);
                                        class779 var42 = new class779(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, arg2, var40, var23);
                                        if (var41.method1095(-9842)) {
                                            var41.method1090(100, arg0);
                                        }
                                        var43 = var42;
                                        var44 = var41;
                                        if (var42.method1095(-9842)) {
                                            var42.method1090(85, arg0);
                                        }
                                    } else {
                                        var44 = new class748(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, arg2, arg8 + 4, arg4);
                                        var43 = new class748(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, arg2, var40, arg4);
                                    }
                                    class671.method4937(arg10, arg5, arg3, var44, var43);
                                    if ((~var12.field3021 == -2 || class276.field4163 && ~var12.field3021 == 0) && !super.field6424) {
                                        if (~arg8 != -1) {
                                            if (arg8 != 1) {
                                                if (arg8 == 2) {
                                                    class278.method2287(arg10, arg5 - -1, arg3, 126, var12.field3085, var12.field3008, 1);
                                                    class278.method2287(arg10, arg5, arg3, 118, var12.field3085, var12.field3008, 2);
                                                } else if (arg8 == 3) {
                                                    class278.method2287(arg10, arg5, arg3, 76, var12.field3085, var12.field3008, 1);
                                                    class278.method2287(arg10, arg5, arg3, 107, var12.field3085, var12.field3008, 2);
                                                }
                                            } else {
                                                class278.method2287(arg10, arg5 - -1, arg3, 98, var12.field3085, var12.field3008, 1);
                                                class278.method2287(arg10, arg5, arg3 - -1, 126, var12.field3085, var12.field3008, 2);
                                            }
                                        } else {
                                            class278.method2287(arg10, arg5, arg3, 127, var12.field3085, var12.field3008, 1);
                                            class278.method2287(arg10, arg5, arg3 - -1, 87, var12.field3085, var12.field3008, 2);
                                        }
                                    }
                                    if (var12.field3078 != 0 && arg1 != null) {
                                        arg1.method2746(arg2, -1, arg3, !var12.field3018, var12.field3064, arg5, arg8);
                                    }
                                    if (var12.field3023 != 64) {
                                        class670.method4929(arg10, arg5, arg3, var12.field3023);
                                    }
                                } else if (~arg2 == -4) {
                                    class261 var46;
                                    if (var24) {
                                        class779 var45 = new class779(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, arg2, arg8, var23);
                                        if (var45.method1095(-9842)) {
                                            var45.method1090(-125, arg0);
                                        }
                                        var46 = var45;
                                    } else {
                                        var46 = new class748(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, arg2, arg8, arg4);
                                    }
                                    class671.method4937(arg10, arg5, arg3, var46, (class261) null);
                                    if (var12.field3068 && class459.field6679) {
                                        if (~arg8 == -1) {
                                            var19.method1509(arg5, arg3 + 1, 50);
                                        } else if (arg8 != 1) {
                                            if (~arg8 == -3) {
                                                var19.method1509(arg5 + 1, arg3, 50);
                                            } else if (~arg8 == -4) {
                                                var19.method1509(arg5, arg3, 50);
                                            }
                                        } else {
                                            var19.method1509(arg5 + 1, arg3 + 1, 50);
                                        }
                                    }
                                    if (var12.field3078 != 0 && arg1 != null) {
                                        arg1.method2746(arg2, -1, arg3, !var12.field3018, var12.field3064, arg5, arg8);
                                    }
                                } else if (~arg2 == -10) {
                                    class343 var48;
                                    if (var24) {
                                        class742 var47 = new class742(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, arg5, arg5, arg3, arg3, arg2, arg8, var23);
                                        var48 = var47;
                                        if (var47.method1095(-9842)) {
                                            var47.method1090(104, arg0);
                                        }
                                    } else {
                                        var48 = new class677(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, arg5, arg5 + -1 - -var13, arg3, arg3 + var14 + -1, arg2, arg8, arg4);
                                    }
                                    class712.method5190(var48, false);
                                    if (~var12.field3021 == -2 && !super.field6424) {
                                        byte var49;
                                        if ((1 & arg8) == 0) {
                                            var49 = 8;
                                        } else {
                                            var49 = 16;
                                        }
                                        class278.method2287(arg10, arg5, arg3, 75, var12.field3085, 0, var49);
                                    }
                                    if (var12.field3078 != 0 && arg1 != null) {
                                        arg1.method2751(arg5, !var12.field3018, var14, var13, 110, arg3, var12.field3064);
                                    }
                                    if (~var12.field3023 != -65) {
                                        class670.method4929(arg10, arg5, arg3, var12.field3023);
                                    }
                                } else if (~arg2 == -5) {
                                    class535 var50;
                                    if (!var24) {
                                        var50 = new class125(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, 0, 0, arg2, arg8, arg4);
                                    } else {
                                        class419 var51 = new class419(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, 0, 0, arg2, arg8);
                                        if (var51.method1095(-9842)) {
                                            var51.method1090(-117, arg0);
                                        }
                                        var50 = var51;
                                    }
                                    class464.method3528(arg10, arg5, arg3, var50, (class535) null);
                                } else if (~arg2 == -6) {
                                    int var52 = 65;
                                    class583 var53 = (class583) class599.method4456(arg10, arg5, arg3);
                                    if (var53 != null) {
                                        var52 = 1 + class417.field6144.method3030(0, var53.method1083((byte) 1)).field3023;
                                    }
                                    class535 var54;
                                    if (!var24) {
                                        var54 = new class125(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, class660.field9538[arg8] * var52, class100.field1105[arg8] * var52, arg2, arg8, arg4);
                                    } else {
                                        class419 var55 = new class419(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, class660.field9538[arg8] * var52, class100.field1105[arg8] * var52, arg2, arg8);
                                        if (var55.method1095(-9842)) {
                                            var55.method1090(-127, arg0);
                                        }
                                        var54 = var55;
                                    }
                                    class464.method3528(arg10, arg5, arg3, var54, (class535) null);
                                } else if (~arg2 == -7) {
                                    int var56 = 33;
                                    class583 var57 = (class583) class599.method4456(arg10, arg5, arg3);
                                    if (var57 != null) {
                                        var56 = class417.field6144.method3030(0, var57.method1083((byte) 110)).field3023 / 2 + 1;
                                    }
                                    class535 var58;
                                    if (!var24) {
                                        var58 = new class125(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, class324.field5122[arg8] * var56, class690.field10001[arg8] * var56, arg2, arg8 + 4, arg4);
                                    } else {
                                        class419 var59 = new class419(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, class660.field9538[arg8] * var56, class100.field1105[arg8] * var56, arg2, arg8 - -4);
                                        if (var59.method1095(-9842)) {
                                            var59.method1090(104, arg0);
                                        }
                                        var58 = var59;
                                    }
                                    class464.method3528(arg10, arg5, arg3, var58, (class535) null);
                                } else if (arg2 == 7) {
                                    int var60 = arg8 + 2 & 3;
                                    class535 var62;
                                    if (var24) {
                                        class419 var61 = new class419(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, 0, 0, arg2, var60 + 4);
                                        if (var61.method1095(-9842)) {
                                            var61.method1090(107, arg0);
                                        }
                                        var62 = var61;
                                    } else {
                                        var62 = new class125(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, 0, 0, arg2, var60 + 4, arg4);
                                    }
                                    class464.method3528(arg10, arg5, arg3, var62, (class535) null);
                                } else if (~arg2 == -9) {
                                    int var63 = 3 & arg8 + 2;
                                    int var64 = 33;
                                    class583 var65 = (class583) class599.method4456(arg10, arg5, arg3);
                                    if (var65 != null) {
                                        var64 = class417.field6144.method3030(0, var65.method1083((byte) -45)).field3023 / 2 + 1;
                                    }
                                    class535 var68;
                                    class535 var69;
                                    if (var24) {
                                        class419 var66 = new class419(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, class324.field5122[arg8] * var64, class690.field10001[arg8] * var64, arg2, arg8 + 4);
                                        class419 var67 = new class419(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, 0, 0, arg2, var63 + 4);
                                        if (var66.method1095(-9842)) {
                                            var66.method1090(12, arg0);
                                        }
                                        if (var67.method1095(-9842)) {
                                            var67.method1090(25, arg0);
                                        }
                                        var68 = var67;
                                        var69 = var66;
                                    } else {
                                        class125 var70 = new class125(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, class324.field5122[arg8] * var64, class690.field10001[arg8] * var64, arg2, arg8 + 4, arg4);
                                        class125 var71 = new class125(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, 0, 0, arg2, var63 + 4, arg4);
                                        var69 = var70;
                                        var68 = var71;
                                    }
                                    class464.method3528(arg10, arg5, arg3, var69, var68);
                                }
                            } else {
                                class343 var33;
                                if (!var24) {
                                    var33 = new class677(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, arg5, arg5 + -1 - -var13, arg3, var14 + -1 + arg3, arg2, arg8, arg4);
                                } else {
                                    class742 var34 = new class742(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, arg5, var13 - 1 + arg5, arg3, arg3 - (-var14 - -1), arg2, arg8, var23);
                                    if (var34.method1095(-9842)) {
                                        var34.method1090(-123, arg0);
                                    }
                                    var33 = var34;
                                }
                                class712.method5190(var33, false);
                                if (class459.field6679 && !super.field6424 && arg2 >= 12 && ~arg2 >= -18 && ~arg2 != -14 && ~arg10 < -1 && ~var12.field3021 != -1) {
                                    super.field6414[arg10][arg5][arg3] = (byte) class544.method4107(super.field6414[arg10][arg5][arg3], 4);
                                }
                                if (var12.field3078 != 0 && arg1 != null) {
                                    arg1.method2751(arg5, !var12.field3018, var14, var13, -55, arg3, var12.field3064);
                                }
                            }
                        } else {
                            class742 var27 = null;
                            class343 var29;
                            int var30;
                            if (var24) {
                                class742 var28 = new class742(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, arg5, arg5 + var13 - 1, arg3, var14 + -1 + arg3, arg2, arg8, var23);
                                var27 = var28;
                                var29 = var28;
                                var30 = var28.method5411(15144);
                            } else {
                                var29 = new class677(arg0, var12, arg10, arg7, var21, var20, var22, super.field6424, arg5, arg5 + var13 + -1, arg3, arg3 + -1 - -var14, arg2, arg8, arg4);
                                var30 = 15;
                            }
                            if (class712.method5190(var29, false)) {
                                if (var27 != null && var27.method1095(-9842)) {
                                    var27.method1090(117, arg0);
                                }
                                if (var12.field3068 && class459.field6679) {
                                    if (~var30 < -31) {
                                        var30 = 30;
                                    }
                                    for (int var31 = 0; var13 >= var31; ++var31) {
                                        for (int var32 = 0; ~var14 <= ~var32; ++var32) {
                                            var19.method1509(arg5 + var31, arg3 + var32, var30);
                                        }
                                    }
                                }
                            }
                            if (~var12.field3078 != -1 && arg1 != null) {
                                arg1.method2751(arg5, !var12.field3018, var14, var13, -58, arg3, var12.field3064);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var73) {
            throw class759.method5498(var73, field1021[12] + (arg0 != null ? field1021[2] : field1021[0]) + ',' + (arg1 != null ? field1021[2] : field1021[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IBLha;[Ldja;I[B)V")
    public final void method759(int arg0, byte arg1, class66 arg2, class324[] arg3, int arg4, byte[] arg5) {
        try {
            ++field1013;
            if (arg1 <= -37) {
                class163 var7 = new class163(arg5);
                int var8 = -1;
                while (true) {
                    int var9 = var7.method1468((byte) -126);
                    if (~var9 == -1) {
                        return;
                    }
                    var8 += var9;
                    int var10 = 0;
                    while (true) {
                        int var11 = var7.method1425(120);
                        if (var11 == 0) {
                            break;
                        }
                        var10 += var11 + -1;
                        int var12 = 63 & var10;
                        int var13 = var10 >> 6 & 63;
                        int var14 = var10 >> 12;
                        int var15 = var7.method1455((byte) 62);
                        int var16 = var15 >> 2;
                        int var17 = 3 & var15;
                        int var18 = arg4 + var13;
                        int var19 = var12 - -arg0;
                        if (~var18 < -1 && ~var19 < -1 && ~(super.field6395 + -1) < ~var18 && var19 < super.field6405 - 1) {
                            class324 var20 = null;
                            if (!super.field6424) {
                                int var21 = var14;
                                if ((2 & class184.field2545[1][var18][var19]) == 2) {
                                    var21 = var14 - 1;
                                }
                                if (~var21 <= -1) {
                                    var20 = arg3[var21];
                                }
                            }
                            this.method758(arg2, var20, var16, var19, -1, var18, 94, var14, var17, var8, var14);
                        }
                    }
                }
            }
        } catch (RuntimeException var23) {
            throw class759.method5498(var23, field1021[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1021[2] : field1021[0]) + ',' + (arg3 != null ? field1021[2] : field1021[0]) + ',' + arg4 + ',' + (arg5 != null ? field1021[2] : field1021[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(ILib;Lha;II[I)V")
    public final void method760(int arg0, class163 arg1, class66 arg2, int arg3, int arg4, int[] arg5) {
        try {
            ++field1014;
            if (!super.field6424) {
                boolean var7 = false;
                if (arg0 == 23657) {
                    class338 var8 = null;
                    if (arg5 != null) {
                        arg5[0] = -1;
                    }
                    while (true) {
                        while (true) {
                            while (true) {
                                while (arg1.field2209.length > arg1.field2201) {
                                    int var9 = arg1.method1455((byte) 62);
                                    if (var9 != 0) {
                                        if (~var9 != -2) {
                                            if (~var9 == -3) {
                                                if (var8 == null) {
                                                    var8 = new class338();
                                                }
                                                var8.method2818(arg1, -122);
                                            } else if (~var9 == -129) {
                                                if (arg5 == null) {
                                                    arg1.field2201 += 10;
                                                } else {
                                                    arg5[0] = arg1.method1445((byte) 118);
                                                    arg5[1] = arg1.method1442(65280);
                                                    arg5[2] = arg1.method1442(class219.method1916(arg0, 41833));
                                                    arg5[3] = arg1.method1442(class219.method1916(arg0, 41833));
                                                    arg5[4] = arg1.method1445((byte) 101);
                                                }
                                            } else {
                                                if (~var9 != -130) {
                                                    throw new IllegalStateException("");
                                                }
                                                if (super.field6412 == null) {
                                                    super.field6412 = new byte[4][][];
                                                }
                                                var7 = true;
                                                for (int var10 = 0; ~var10 > -5; ++var10) {
                                                    byte var11 = arg1.method1414(1);
                                                    if (var11 == 0 && super.field6412[var10] != null) {
                                                        int var12 = arg4;
                                                        int var13 = arg4 + 64;
                                                        int var14 = arg3;
                                                        if (arg4 < 0) {
                                                            var12 = 0;
                                                        } else if (super.field6395 <= arg4) {
                                                            var12 = super.field6395;
                                                        }
                                                        if (arg3 < 0) {
                                                            var14 = 0;
                                                        } else if (~super.field6405 >= ~arg3) {
                                                            var14 = super.field6405;
                                                        }
                                                        int var15 = arg3 + 64;
                                                        if (var13 >= 0) {
                                                            if (~super.field6395 >= ~var13) {
                                                                var13 = super.field6395;
                                                            }
                                                        } else {
                                                            var13 = 0;
                                                        }
                                                        if (~var15 > -1) {
                                                            var15 = 0;
                                                        } else if (var15 >= super.field6405) {
                                                            var15 = super.field6405;
                                                        }
                                                        while (~var13 < ~var12) {
                                                            while (var15 > var14) {
                                                                super.field6412[var10][var12][var14] = 0;
                                                                ++var14;
                                                            }
                                                            ++var12;
                                                        }
                                                    } else if (var11 != 1) {
                                                        if (~var11 == -3) {
                                                            if (super.field6412[var10] == null) {
                                                                super.field6412[var10] = new byte[super.field6395 + 1][super.field6405 + 1];
                                                            }
                                                            if (~var10 < -1) {
                                                                int var16 = arg4;
                                                                int var17 = arg4 + 64;
                                                                int var18 = arg3;
                                                                if (arg3 < 0) {
                                                                    var18 = 0;
                                                                } else if (~super.field6405 >= ~arg3) {
                                                                    var18 = super.field6405;
                                                                }
                                                                if (var17 >= 0) {
                                                                    if (~super.field6395 >= ~var17) {
                                                                        var17 = super.field6395;
                                                                    }
                                                                } else {
                                                                    var17 = 0;
                                                                }
                                                                if (~arg4 > -1) {
                                                                    var16 = 0;
                                                                } else if (~super.field6395 >= ~arg4) {
                                                                    var16 = super.field6395;
                                                                }
                                                                int var19 = arg3 - -64;
                                                                if (var19 < 0) {
                                                                    var19 = 0;
                                                                } else if (super.field6405 <= var19) {
                                                                    var19 = super.field6405;
                                                                }
                                                                while (var17 > var16) {
                                                                    while (var18 < var19) {
                                                                        super.field6412[var10][var16][var18] = super.field6412[var10 + -1][var16][var18];
                                                                        ++var18;
                                                                    }
                                                                    ++var16;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (super.field6412[var10] == null) {
                                                            super.field6412[var10] = new byte[super.field6395 + 1][super.field6405 + 1];
                                                        }
                                                        for (int var20 = 0; var20 < 64; var20 += 4) {
                                                            for (int var21 = 0; ~var21 > -65; var21 += 4) {
                                                                byte var22 = arg1.method1414(1);
                                                                for (int var23 = arg4 + var20; arg4 + var20 + 4 > var23; ++var23) {
                                                                    for (int var24 = var21 - -arg3; ~var24 > ~(arg3 + var21 + 4); ++var24) {
                                                                        if (var23 >= 0 && ~var23 > ~super.field6395 && ~var24 <= -1 && ~var24 > ~super.field6405) {
                                                                            super.field6412[var10][var23][var24] = var22;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            int var25 = arg1.method1455((byte) 62);
                                            if (~var25 < -1) {
                                                for (int var26 = 0; var26 < var25; ++var26) {
                                                    class643 var27 = new class643(arg2, arg1, 2);
                                                    if (var27.field9329 == 31) {
                                                        class491 var28 = class640.field9301.method351(arg1.method1445((byte) 126), 31);
                                                        var27.method4710(true, var28.field7039, var28.field7042, var28.field7040, var28.field7043);
                                                    }
                                                    if (arg2.method578() > 0) {
                                                        class471 var29 = var27.field9313;
                                                        int var30 = (arg4 << 9) + var29.method3577(-32630);
                                                        int var31 = var29.method3580((byte) -123) - -(arg3 << 9);
                                                        int var32 = var30 >> 9;
                                                        int var33 = var31 >> 9;
                                                        if (~var32 <= -1 && var33 >= 0 && ~var32 > ~super.field6395 && var33 < super.field6405) {
                                                            var29.method1836(arg0 ^ -23604, super.field6418[var27.field9330][var32][var33] - var29.method3581(arg0 + -23779), var30, var31);
                                                            class366.method2965(var27);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        var8 = new class338(arg1);
                                    }
                                }
                                if (var8 != null) {
                                    for (int var34 = 0; var34 < 8; ++var34) {
                                        for (int var35 = 0; var35 < 8; ++var35) {
                                            int var36 = (arg4 >> 3) + var34;
                                            int var37 = (arg3 >> 3) + var35;
                                            if (var36 >= 0 && ~(super.field6395 >> 3) < ~var36 && var37 >= 0 && var37 < super.field6405 >> 3) {
                                                class222.method1929(var36, var37, (byte) -95, var8);
                                            }
                                        }
                                    }
                                }
                                if (!var7 && super.field6412 != null) {
                                    for (int var38 = 0; ~var38 > -5; ++var38) {
                                        if (super.field6412[var38] != null) {
                                            for (int var39 = 0; ~var39 > -17; ++var39) {
                                                for (int var40 = 0; var40 < 16; ++var40) {
                                                    int var41 = (arg4 >> 2) + var39;
                                                    int var42 = (arg3 >> 2) + var40;
                                                    if (~var41 <= -1 && ~var41 > -27 && ~var42 <= -1 && var42 < 26) {
                                                        super.field6412[var38][var41][var42] = 0;
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
        } catch (RuntimeException var44) {
            throw class759.method5498(var44, field1021[13] + arg0 + ',' + (arg1 != null ? field1021[2] : field1021[0]) + ',' + (arg2 != null ? field1021[2] : field1021[0]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1021[2] : field1021[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZLha;Z)V")
    public final void method761(boolean arg0, class66 arg1, boolean arg2) {
        try {
            ++field1015;
            class60.method438();
            if (!arg2) {
                if (~super.field6419 < -2) {
                    for (int var4 = 0; var4 < super.field6395; ++var4) {
                        for (int var5 = 0; super.field6405 > var5; ++var5) {
                            if (~(class184.field2545[1][var4][var5] & 2) == -3) {
                                class730.method5324(var4, var5);
                            }
                        }
                    }
                }
                for (int var6 = 0; super.field6419 > var6; ++var6) {
                    for (int var7 = 0; super.field6405 >= var7; ++var7) {
                        for (int var8 = 0; super.field6395 >= var8; ++var8) {
                            if ((4 & super.field6414[var6][var8][var7]) != 0) {
                                int var9 = var8;
                                int var10 = var8;
                                int var11 = var7;
                                int var12 = var7;
                                while (~var11 < -1 && (super.field6414[var6][var8][var11 + -1] & 4) != 0 && ~(-var11 + var12) > -11) {
                                    --var11;
                                }
                                while (var12 < super.field6405 && ~(4 & super.field6414[var6][var8][var12 + 1]) != -1 && -var11 + var12 < 10) {
                                    ++var12;
                                }
                                label151: while (~var9 < -1 && -var9 + var10 < 10) {
                                    for (int var13 = var11; ~var12 <= ~var13; ++var13) {
                                        if ((super.field6414[var6][var9 - 1][var13] & 4) == 0) {
                                            break label151;
                                        }
                                    }
                                    --var9;
                                }
                                label138: while (~super.field6395 < ~var10 && -var9 + var10 < 10) {
                                    for (int var14 = var11; ~var12 <= ~var14; ++var14) {
                                        if (~(4 & super.field6414[var6][var10 + 1][var14]) == -1) {
                                            break label138;
                                        }
                                    }
                                    ++var10;
                                }
                                if (~((-var9 + 1 + var10) * (-var11 + var12 + 1)) <= -5) {
                                    int var15 = super.field6418[var6][var9][var11];
                                    class670.method4932(false, 4, var11 << 9, var15, var6, (var12 << 9) - -512, var9 << 9, var15, (var10 << 9) + 512);
                                    for (int var16 = var9; ~var16 >= ~var10; ++var16) {
                                        for (int var17 = var11; ~var12 <= ~var17; ++var17) {
                                            super.field6414[var6][var16][var17] = (byte) class291.method2359(super.field6414[var6][var16][var17], -5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class532.method4022(true);
            }
            if (!arg0) {
                this.method760(-44, (class163) null, (class66) null, -115, 16, (int[]) null);
            }
            super.field6414 = null;
        } catch (RuntimeException var19) {
            throw class759.method5498(var19, field1021[11] + arg0 + ',' + (arg1 != null ? field1021[2] : field1021[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIIIILha;IILib;[I)V")
    public final void method762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class66 arg6, int arg7, int arg8, class163 arg9, int[] arg10) {
        try {
            ++field1007;
            if (!super.field6424) {
                boolean var12 = false;
                class338 var13 = null;
                if (arg10 != null) {
                    arg10[0] = -1;
                }
                int var14 = (7 & arg8) * 8;
                if (arg2 > 16) {
                    int var15 = (arg0 & 7) * 8;
                    while (true) {
                        int var17;
                        label299: do {
                            while (true) {
                                while (arg9.field2201 < arg9.field2209.length) {
                                    int var16 = arg9.method1455((byte) 62);
                                    if (var16 != 0) {
                                        if (~var16 == -2) {
                                            var17 = arg9.method1455((byte) 62);
                                            continue label299;
                                        }
                                        if (var16 == 2) {
                                            if (var13 == null) {
                                                var13 = new class338();
                                            }
                                            var13.method2818(arg9, -105);
                                        } else if (var16 == 128) {
                                            if (arg10 == null) {
                                                arg9.field2201 += 10;
                                            } else {
                                                arg10[0] = arg9.method1445((byte) 115);
                                                arg10[1] = arg9.method1442(65280);
                                                arg10[2] = arg9.method1442(65280);
                                                arg10[3] = arg9.method1442(65280);
                                                arg10[4] = arg9.method1445((byte) 120);
                                            }
                                        } else {
                                            if (~var16 != -130) {
                                                throw new IllegalStateException("");
                                            }
                                            if (super.field6412 == null) {
                                                super.field6412 = new byte[4][][];
                                            }
                                            for (int var28 = 0; var28 < 4; ++var28) {
                                                byte var29 = arg9.method1414(1);
                                                if (var29 == 0 && super.field6412[arg5] != null) {
                                                    if (~arg4 <= ~var28) {
                                                        int var37 = arg1;
                                                        int var38 = arg1 + 7;
                                                        int var39 = arg3;
                                                        int var40 = arg3 + 7;
                                                        if (var38 < 0) {
                                                            var38 = 0;
                                                        } else if (~var38 <= ~super.field6395) {
                                                            var38 = super.field6395;
                                                        }
                                                        if (arg3 < 0) {
                                                            var39 = 0;
                                                        } else if (super.field6405 <= arg3) {
                                                            var39 = super.field6405;
                                                        }
                                                        if (arg1 >= 0) {
                                                            if (~super.field6395 >= ~arg1) {
                                                                var37 = super.field6395;
                                                            }
                                                        } else {
                                                            var37 = 0;
                                                        }
                                                        if (~var40 <= -1) {
                                                            if (var40 >= super.field6405) {
                                                                var40 = super.field6405;
                                                            }
                                                        } else {
                                                            var40 = 0;
                                                        }
                                                        while (~var38 < ~var37) {
                                                            while (~var39 > ~var40) {
                                                                super.field6412[arg5][var37][var39] = 0;
                                                                ++var39;
                                                            }
                                                            ++var37;
                                                        }
                                                    }
                                                } else if (~var29 == -2) {
                                                    if (super.field6412[arg5] == null) {
                                                        super.field6412[arg5] = new byte[super.field6395 + 1][super.field6405 + 1];
                                                    }
                                                    for (int var30 = 0; ~var30 > -65; var30 += 4) {
                                                        for (int var31 = 0; var31 < 64; var31 += 4) {
                                                            byte var32 = arg9.method1414(1);
                                                            if (~var28 >= ~arg4) {
                                                                for (int var33 = var30; var30 + 4 > var33; ++var33) {
                                                                    for (int var34 = var31; ~var34 > ~(var31 + 4); ++var34) {
                                                                        if (var14 <= var33 && var14 + 8 > var33 && ~var15 >= ~var34 && var15 < var15 + 8) {
                                                                            int var35 = arg1 - -class122.method1057(7 & var33, -118, arg7, var34 & 7);
                                                                            int var36 = arg3 - -class383.method3066(arg7, 7 & var33, (byte) -124, 7 & var34);
                                                                            if (~var35 <= -1 && super.field6395 > var35 && var36 >= 0 && ~var36 > ~super.field6405) {
                                                                                super.field6412[arg5][var35][var36] = var32;
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
                                        var13 = new class338(arg9);
                                    }
                                }
                                if (var13 != null) {
                                    class222.method1929(arg1 >> 3, arg3 >> 3, (byte) -95, var13);
                                }
                                if (!var12 && super.field6412 != null && super.field6412[arg5] != null) {
                                    int var41 = arg1 + 7;
                                    int var42 = arg3 + 7;
                                    for (int var43 = arg1; ~var41 < ~var43; ++var43) {
                                        for (int var44 = arg3; ~var44 > ~var42; ++var44) {
                                            super.field6412[arg5][var43][var44] = 0;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                        } while (var17 <= 0);
                        for (int var18 = 0; var18 < var17; ++var18) {
                            class643 var19 = new class643(arg6, arg9, 2);
                            if (var19.field9329 == 31) {
                                class491 var20 = class640.field9301.method351(arg9.method1445((byte) 126), 31);
                                var19.method4710(true, var20.field7039, var20.field7042, var20.field7040, var20.field7043);
                            }
                            if (~arg6.method578() < -1) {
                                class471 var21 = var19.field9313;
                                int var22 = var21.method3577(-32630) >> 9;
                                int var23 = var21.method3580((byte) 120) >> 9;
                                if (var19.field9330 == arg4 && var22 >= var14 && var14 + 8 > var22 && ~var23 <= ~var15 && var23 < var15 + 8) {
                                    int var24 = class84.method716(var21.method3577(-32630) & 4095, 4095 & var21.method3580((byte) -124), (byte) 35, arg7) + (arg1 << 9);
                                    int var25 = class435.method3323((byte) 96, var21.method3580((byte) 51) & 4095, arg7, 4095 & var21.method3577(-32630)) + (arg3 << 9);
                                    int var26 = var24 >> 9;
                                    int var27 = var25 >> 9;
                                    if (var26 >= 0 && var27 >= 0 && var26 < super.field6395 && ~var27 > ~super.field6405) {
                                        var21.method1836(-67, super.field6418[arg4][var26][var27] + -var21.method3581(-124), var24, var25);
                                        class366.method2965(var19);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var46) {
            throw class759.method5498(var46, field1021[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1021[2] : field1021[0]) + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field1021[2] : field1021[0]) + ',' + (arg10 != null ? field1021[2] : field1021[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(ILcn;IIBLha;)V")
    public static final void method763(int arg0, class541 arg1, int arg2, int arg3, byte arg4, class66 arg5) {
        try {
            if (arg4 > 97) {
                for (int var6 = 7; var6 >= 0; --var6) {
                    for (int var7 = 127; ~var7 <= -1; --var7) {
                        int var8 = var7 & 127 | (63 & arg2) << 10 | (var6 & 7) << 7;
                        class624.method4635(false, -17200, true);
                        int var9 = class172.field2403[var8];
                        class223.method1937(true, -9743, false);
                        arg5.method556((arg1.field8029 * var7 >> 7) + arg3, ((-var6 + 7) * arg1.field8045 >> 3) + arg0, (arg1.field8029 >> 7) - -1, (arg1.field8045 >> 3) + 1, var9, 0);
                    }
                }
                ++field1017;
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field1021[10] + arg0 + ',' + (arg1 != null ? field1021[2] : field1021[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1021[2] : field1021[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)V")
    public static void method764(int arg0) {
        try {
            field1006 = null;
            field1004 = null;
            field1009 = null;
            if (arg0 < -28) {
                field1011 = null;
                field1016 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1021[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(IIIII)Lnda;")
    public final class583 method765(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field1018;
            class583 var6 = null;
            if (arg1 == 0) {
                var6 = (class583) class599.method4456(arg0, arg4, arg3);
            }
            if (arg1 == 1) {
                var6 = (class583) class271.method2248(arg0, arg4, arg3);
            }
            if (arg2 != -1) {
                return null;
            } else {
                if (arg1 == 2) {
                    var6 = (class583) class261.method2196(arg0, arg4, arg3, field1020 != null ? field1020 : (field1020 = method767(field1021[5])));
                }
                if (arg1 == 3) {
                    var6 = (class583) method766(arg0, arg4, arg3);
                }
                return var6;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1021[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(III)Ldr;")
    public static final class749 method766(int arg0, int arg1, int arg2) {
        class96 var3 = class734.field10683[arg0][arg1][arg2];
        return var3 != null && var3.field1081 != null ? var3.field1081 : null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method767(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!haa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method768(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 76);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!haa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method769(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 37;
                    break;
                case 1:
                    var10005 = 10;
                    break;
                case 2:
                    var10005 = 5;
                    break;
                case 3:
                    var10005 = 53;
                    break;
                default:
                    var10005 = 76;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
