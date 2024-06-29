import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class164 extends class33 {

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
    private int field3037 = 1;

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
    private int field3029 = 0;

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "I")
    private int field3042 = 0;

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "[I")
    public static int[] field3027 = new int[50];

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "Lrd;")
    public static class173 field3030 = class133.method843(":assistreq:", 124);

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
    public static int field3034 = 0;

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "Lrd;")
    public static class173 field3041 = class133.method843("sl_arrows", 42);

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "Laf;")
    public static class7 field3044 = new class7(64);

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "I")
    public static int field3045 = 0;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "Lbc;")
    public static class14 field3032;

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "[[S")
    public static short[][] field3043;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLt;)V")
    public static final void method1054(boolean arg0, class189 arg1) {
        ++field3036;
        long var2 = 0L;
        if (~arg1.field3694 == -1) {
            var2 = class13.method97(arg1.field3691, arg1.field3707, arg1.field3681);
        }
        if (arg1.field3694 == 1) {
            var2 = class35.method273(arg1.field3691, arg1.field3707, arg1.field3681);
        }
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field3694 == 2) {
            var2 = class62.method392(arg1.field3691, arg1.field3707, arg1.field3681);
        }
        if (~arg1.field3694 == -4) {
            var2 = class34.method268(arg1.field3691, arg1.field3707, arg1.field3681);
        }
        if (arg0) {
            if (~var2 != -1L) {
                var5 = ((int) var2 & 513111) >> 14;
                var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
                var6 = (int) var2 >> 20 & 3;
            }
            arg1.field3697 = var4;
            arg1.field3683 = var6;
            arg1.field3688 = var5;
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
    public class164() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lqf;ILrd;)Lrd;")
    private static final class173 method1055(class165 arg0, int arg1, class173 arg2) {
        if (~arg2.method1151(class22.field482, false) != 0) {
            label58: while (true) {
                int var3 = arg2.method1151(class175.field3449, false);
                if (~var3 == 0) {
                    while (true) {
                        int var4 = arg2.method1151(class196.field3830, false);
                        if (~var4 == 0) {
                            while (true) {
                                int var5 = arg2.method1151(class116.field2143, false);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.method1151(class173.field3398, false);
                                        if (~var6 == 0) {
                                            while (true) {
                                                int var7 = arg2.method1151(class58.field1148, false);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.method1151(class26.field551, false);
                                                        if (~var8 == 0) {
                                                            break label58;
                                                        }
                                                        class173 var9 = class208.field4049;
                                                        if (class183.field3587 != null) {
                                                            var9 = class148.method979(class183.field3587.field4258, (byte) -98);
                                                            try {
                                                                if (class183.field3587.field4256 != null) {
                                                                    byte[] var10 = ((String) class183.field3587.field4256).getBytes("ISO-8859-1");
                                                                    var9 = class106.method652(0, var10, (byte) 37, var10.length);
                                                                }
                                                            } catch (UnsupportedEncodingException var12) {
                                                            }
                                                        }
                                                        arg2 = class173.method1158(-3, new class173[] { arg2.method1155(0, var8, (byte) 77), var9, arg2.method1140(var8 + 4, (byte) 115) });
                                                    }
                                                }
                                                arg2 = class173.method1158(-3, new class173[] { arg2.method1155(0, var7, (byte) 103), class140.method875(class149.method981((byte) 124, arg0, 4), (byte) -36), arg2.method1140(var7 - -2, (byte) 125) });
                                            }
                                        }
                                        arg2 = class173.method1158(-3, new class173[] { arg2.method1155(0, var6, (byte) 122), class140.method875(class149.method981((byte) 126, arg0, 3), (byte) -29), arg2.method1140(var6 + 2, (byte) 117) });
                                    }
                                }
                                arg2 = class173.method1158(-3, new class173[] { arg2.method1155(0, var5, (byte) 115), class140.method875(class149.method981((byte) 123, arg0, 2), (byte) -68), arg2.method1140(var5 + 2, (byte) 127) });
                            }
                        }
                        arg2 = class173.method1158(-3, new class173[] { arg2.method1155(0, var4, (byte) 93), class140.method875(class149.method981((byte) 125, arg0, 1), (byte) -22), arg2.method1140(var4 + 2, (byte) 116) });
                    }
                }
                arg2 = class173.method1158(-3, new class173[] { arg2.method1155(0, var3, (byte) 83), class140.method875(class149.method981((byte) 117, arg0, 0), (byte) -104), arg2.method1140(var3 + 2, (byte) 122) });
            }
        }
        ++field3033;
        int var11 = 27 % (arg1 / 53);
        return arg2;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
    public final void method179(int arg0) {
        if (arg0 != -1) {
            field3027 = null;
        }
        class172.method1105(5000);
        ++field3039;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIII[Lqf;II)V")
    public static final void method1056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class165[] arg7, int arg8, int arg9) {
        ++field3028;
        class27.method212(arg4, arg3, arg5, arg1);
        class72.method442();
        for (int var10 = arg8; ~var10 > ~arg7.length; ++var10) {
            class165 var11 = arg7[var10];
            if (var11 != null && (~var11.field3072 == ~arg0 || arg0 == -1412584499 && class71.field1376 == var11)) {
                int var12;
                if (arg6 != -1) {
                    var12 = arg6;
                } else {
                    class179.field3520[class67.field1297] = var11.field3120 + arg2;
                    class36.field776[class67.field1297] = var11.field3174 - -arg9;
                    class167.field3215[class67.field1297] = var11.field3156;
                    class145.field2707[class67.field1297] = var11.field3105;
                    var12 = class67.field1297++;
                }
                var11.field3178 = var12;
                var11.field3119 = class217.field4203;
                if (!var11.field3108 || !class82.method507(var11, ~arg8)) {
                    if (~var11.field3170 < -1) {
                        class129.method823(2670, var11);
                    }
                    int var13 = var11.field3120 - -arg2;
                    int var14 = var11.field3174 - -arg9;
                    int var15 = var11.field3075;
                    if (class71.field1376 == var11) {
                        if (~arg0 != 1412584498 && !var11.field3104) {
                            class169.field3267 = arg9;
                            class163.field3024 = arg2;
                            class176.field3456 = arg7;
                            continue;
                        }
                        if (!var11.field3104) {
                            var15 = 128;
                        }
                        if (class106.field1982 && class174.field3435) {
                            int var16 = class214.field4154;
                            int var17 = var16 - class148.field2823;
                            if (var17 < class167.field3227) {
                                var17 = class167.field3227;
                            }
                            int var18 = class4.field72;
                            int var19 = var18 - class111.field2052;
                            if (var19 < class51.field1048) {
                                var19 = class51.field1048;
                            }
                            if (class51.field1048 + class26.field558.field3105 < var19 - -var11.field3105) {
                                var19 = -var11.field3105 + class26.field558.field3105 + class51.field1048;
                            }
                            var14 = var19;
                            if (~(class167.field3227 - -class26.field558.field3156) > ~(var11.field3156 + var17)) {
                                var17 = class167.field3227 + class26.field558.field3156 + -var11.field3156;
                            }
                            var13 = var17;
                        }
                    }
                    int var26;
                    int var27;
                    int var28;
                    int var29;
                    if (var11.field3077 != 2) {
                        if (var11.field3077 == 9) {
                            int var20 = var13;
                            int var21 = var14;
                            int var22 = var11.field3105 + var14;
                            int var23 = var11.field3156 + var13;
                            if (var13 > var23) {
                                var20 = var23;
                                var23 = var13;
                            }
                            ++var23;
                            if (~var14 < ~var22) {
                                var21 = var22;
                                var22 = var14;
                            }
                            ++var22;
                            var26 = var20 > arg4 ? var20 : arg4;
                            var27 = arg1 <= var22 ? arg1 : var22;
                            var28 = ~var21 >= ~arg3 ? arg3 : var21;
                            var29 = arg5 > var23 ? var23 : arg5;
                        } else {
                            var26 = ~arg4 > ~var13 ? var13 : arg4;
                            var28 = arg3 >= var14 ? arg3 : var14;
                            int var30 = var13 - -var11.field3156;
                            var29 = var30 < arg5 ? var30 : arg5;
                            int var31 = var11.field3105 + var14;
                            var27 = arg1 > var31 ? var31 : arg1;
                        }
                    } else {
                        var27 = arg1;
                        var29 = arg5;
                        var28 = arg3;
                        var26 = arg4;
                    }
                    if (!var11.field3108 || ~var26 > ~var29 && var27 > var28) {
                        if (var11.field3170 != 0) {
                            if (var11.field3170 == 1337) {
                                class197.field3854 = var14;
                                class28.field581 = var13;
                                class187.method1257(var13, var14, arg8 + -29431, var11.field3105, var11.field3156);
                                class27.method212(arg4, arg3, arg5, arg1);
                                continue;
                            }
                            if (~var11.field3170 == -1339) {
                                if (var11.method1061(true)) {
                                    class219.method1428(var12, var11, var13, var14, 0);
                                    class27.method212(arg4, arg3, arg5, arg1);
                                }
                                continue;
                            }
                            if (var11.field3170 == 1339) {
                                if (var11.method1061(true)) {
                                    class70.method429(var13, var11, var12, true, var14);
                                    class27.method212(arg4, arg3, arg5, arg1);
                                }
                                continue;
                            }
                        }
                        int var32 = class4.field72;
                        int var33 = class214.field4154;
                        if (!class167.field3223 && ~var26 >= ~var33 && ~var32 <= ~var28 && ~var29 < ~var33 && var32 < var27) {
                            class122.method787(-var13 + var33, 39, -var14 + var32, var11);
                        }
                        if (var11.field3077 == 0) {
                            if (!var11.field3108 && class82.method507(var11, -1) && class96.field1768 != var11) {
                                continue;
                            }
                            if (!var11.field3108) {
                                if (-var11.field3105 + var11.field3153 < var11.field3087) {
                                    var11.field3087 = -var11.field3105 + var11.field3153;
                                }
                                if (var11.field3087 < 0) {
                                    var11.field3087 = 0;
                                }
                            }
                            method1056(var11.field3132, var27, var13 - var11.field3106, var28, var26, var29, var12, arg7, 0, -var11.field3087 + var14);
                            if (var11.field3067 != null) {
                                method1056(var11.field3132, var27, var13 - var11.field3106, var28, var26, var29, var12, var11.field3067, arg8, -var11.field3087 + var14);
                            }
                            class157 var34 = (class157) client.field637.method677(arg8 ^ -2755, (long) var11.field3132);
                            if (var34 != null) {
                                if (var34.field2947 == 0 && class214.field4154 >= var26 && var28 <= class4.field72 && class214.field4154 < var29 && var27 > class4.field72 && !class167.field3223 && !class119.field2189) {
                                    class195.field3792 = 1;
                                    class179.field3526[0] = 1005;
                                    class167.field3231[0] = class203.field3963;
                                    class21.field461[0] = class208.field4049;
                                }
                                class196.method1308(var28, var12, 21565, var13, var29, var26, var34.field2940, var14, var27);
                            }
                            class27.method212(arg4, arg3, arg5, arg1);
                            class72.method442();
                        }
                        if (class69.field1331[var12] || ~class114.field2117 < -2) {
                            if (~var11.field3077 == -1 && !var11.field3108 && ~var11.field3153 < ~var11.field3105) {
                                class104.method643(var11.field3087, var11.field3153, var11.field3156 + var13, var11.field3105, var14, arg8 ^ 1);
                            }
                            if (~var11.field3077 != -2) {
                                if (var11.field3077 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; ~var11.field3105 < ~var36; ++var36) {
                                        for (int var37 = 0; ~var37 > ~var11.field3156; ++var37) {
                                            int var38 = var13 - -((32 - -var11.field3179) * var37);
                                            int var39 = (var11.field3180 + 32) * var36 + var14;
                                            if (~var35 > -21) {
                                                var38 += var11.field3122[var35];
                                                var39 += var11.field3121[var35];
                                            }
                                            if (var11.field3111[var35] <= 0) {
                                                if (var11.field3098 != null && ~var35 > -21) {
                                                    class180 var51 = var11.method1070((byte) 118, var35);
                                                    if (var51 != null) {
                                                        var51.method1222(var38, var39);
                                                    } else if (class216.field4191) {
                                                        class209.method1379(arg8 ^ 1, var11);
                                                    }
                                                }
                                            } else {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var11.field3111[var35] + -1;
                                                if (~(var38 + 32) < ~arg4 && arg5 > var38 && ~arg3 > ~(var39 + 32) && var39 < arg1 || class177.field3470 == var11 && class172.field3328 == var35) {
                                                    class180 var43;
                                                    if (class9.field166 == 1 && class21.field468 == var35 && ~class144.field2692 == ~var11.field3132) {
                                                        var43 = class183.method1242(9, var42, var11.field3102[var35], 0, 2, false);
                                                    } else {
                                                        var43 = class183.method1242(arg8 ^ 9, var42, var11.field3102[var35], 3153952, 1, false);
                                                    }
                                                    if (var43 != null) {
                                                        if (class177.field3470 == var11 && ~class172.field3328 == ~var35) {
                                                            int var44 = class214.field4154 - class176.field3460;
                                                            if (~var44 > -6 && ~var44 < 4) {
                                                                var44 = 0;
                                                            }
                                                            int var45 = -class197.field3836 + class4.field72;
                                                            if (var45 < 5 && ~var45 < 4) {
                                                                var45 = 0;
                                                            }
                                                            if (class178.field3508 < 5) {
                                                                var45 = 0;
                                                                var44 = 0;
                                                            }
                                                            var43.method1209(var38 + var44, var39 - -var45, 128);
                                                            if (arg0 != -1) {
                                                                class165 var46 = arg7[arg0 & 65535];
                                                                int var47 = class27.field564;
                                                                int var48 = class27.field565;
                                                                if (var47 > var39 + var45 && ~var46.field3087 < -1) {
                                                                    int var49 = (var47 - var45 + -var39) * class171.field3305 / 3;
                                                                    if (var49 > class171.field3305 * 10) {
                                                                        var49 = class171.field3305 * 10;
                                                                    }
                                                                    if (~var46.field3087 > ~var49) {
                                                                        var49 = var46.field3087;
                                                                    }
                                                                    class197.field3836 += var49;
                                                                    var46.field3087 -= var49;
                                                                    class209.method1379(1, var46);
                                                                }
                                                                if (~(var39 - -32 + var45) < ~var48 && var46.field3087 < -var46.field3105 + var46.field3153) {
                                                                    int var50 = (var45 - var48 + var39 + 32) * class171.field3305 / 3;
                                                                    if (class171.field3305 * 10 < var50) {
                                                                        var50 = class171.field3305 * 10;
                                                                    }
                                                                    if (-var46.field3105 + var46.field3153 - var46.field3087 < var50) {
                                                                        var50 = var46.field3153 - var46.field3105 + -var46.field3087;
                                                                    }
                                                                    class197.field3836 -= var50;
                                                                    var46.field3087 += var50;
                                                                    class209.method1379(1, var46);
                                                                }
                                                            }
                                                        } else if (class75.field1485 == var11 && class214.field4160 == var35) {
                                                            var43.method1209(var38, var39, 128);
                                                        } else {
                                                            var43.method1222(var38, var39);
                                                        }
                                                    } else {
                                                        class209.method1379(1, var11);
                                                    }
                                                }
                                            }
                                            ++var35;
                                        }
                                    }
                                } else if (var11.field3077 == 3) {
                                    int var52;
                                    if (!class220.method1434(28267, var11)) {
                                        var52 = var11.field3063;
                                        if (class96.field1768 == var11 && ~var11.field3068 != -1) {
                                            var52 = var11.field3068;
                                        }
                                    } else {
                                        var52 = var11.field3076;
                                        if (class96.field1768 == var11 && var11.field3088 != 0) {
                                            var52 = var11.field3088;
                                        }
                                    }
                                    if (var15 != 0) {
                                        if (var11.field3085) {
                                            class27.method218(var13, var14, var11.field3156, var11.field3105, var52, 256 - (255 & var15));
                                        } else {
                                            class27.method220(var13, var14, var11.field3156, var11.field3105, var52, -(var15 & 255) + 256);
                                        }
                                    } else if (!var11.field3085) {
                                        class27.method207(var13, var14, var11.field3156, var11.field3105, var52);
                                    } else {
                                        class27.method219(var13, var14, var11.field3156, var11.field3105, var52);
                                    }
                                } else if (~var11.field3077 == -5) {
                                    class162 var53 = var11.method1072(0, class48.field1029);
                                    if (var53 == null) {
                                        if (class216.field4191) {
                                            class209.method1379(1, var11);
                                        }
                                    } else {
                                        class173 var54 = var11.field3129;
                                        int var55;
                                        if (class220.method1434(28267, var11)) {
                                            var55 = var11.field3076;
                                            if (class96.field1768 == var11 && ~var11.field3088 != -1) {
                                                var55 = var11.field3088;
                                            }
                                            if (var11.field3163.method1153((byte) -128) > 0) {
                                                var54 = var11.field3163;
                                            }
                                        } else {
                                            var55 = var11.field3063;
                                            if (class96.field1768 == var11 && ~var11.field3068 != -1) {
                                                var55 = var11.field3068;
                                            }
                                        }
                                        if (var11.field3108 && ~var11.field3126 != 0) {
                                            class19 var56 = class195.method1298(1639, var11.field3126);
                                            var54 = var56.field399;
                                            if (var54 == null) {
                                                var54 = class157.field2953;
                                            }
                                            if ((~var56.field441 == -2 || ~var11.field3146 != -2) && ~var11.field3146 != 0) {
                                                var54 = class173.method1158(-3, new class173[] { class214.field4151, var54, class1.field10, class45.method320(var11.field3146, -60) });
                                            }
                                        }
                                        if (class93.field1749 == var11) {
                                            var54 = class30.field613;
                                            var55 = var11.field3063;
                                        }
                                        if (!var11.field3108) {
                                            var54 = method1055(var11, arg8 ^ 125, var54);
                                        }
                                        var53.method517(var54, var13, var14, var11.field3156, var11.field3105, var55, var11.field3110 ? 0 : -1, var11.field3171, var11.field3162, var11.field3124);
                                    }
                                } else if (var11.field3077 == 5) {
                                    if (!var11.field3108) {
                                        class180 var65 = var11.method1065(-115, class220.method1434(28267, var11));
                                        if (var65 == null) {
                                            if (class216.field4191) {
                                                class209.method1379(arg8 ^ 1, var11);
                                            }
                                        } else {
                                            var65.method1222(var13, var14);
                                        }
                                    } else {
                                        class180 var57;
                                        if (~var11.field3126 != 0) {
                                            var57 = class183.method1242(9, var11.field3126, var11.field3146, var11.field3095, var11.field3128, false);
                                        } else {
                                            var57 = var11.method1065(arg8 + -125, false);
                                        }
                                        if (var57 == null) {
                                            if (class216.field4191) {
                                                class209.method1379(1, var11);
                                            }
                                        } else {
                                            int var58 = var57.field3548;
                                            int var59 = var57.field3542;
                                            if (!var11.field3103) {
                                                int var60 = var11.field3156 * 4096 / var58;
                                                if (var11.field3074 == 0) {
                                                    if (~var15 == -1) {
                                                        if (var11.field3156 == var58 && var11.field3105 == var59) {
                                                            var57.method1222(var13, var14);
                                                        } else {
                                                            var57.method1207(var13, var14, var11.field3156, var11.field3105);
                                                        }
                                                    } else {
                                                        var57.method1221(var13, var14, var11.field3156, var11.field3105, -(255 & var15) + 256);
                                                    }
                                                } else {
                                                    var57.method1228(var11.field3156 / 2 + var13, var11.field3105 / 2 + var14, var11.field3074, var60);
                                                }
                                            } else {
                                                class27.method213(var13, var14, var11.field3156 + var13, var11.field3105 + var14);
                                                int var61 = (var59 - (1 - var11.field3105)) / var59;
                                                int var62 = (var58 + -1 + var11.field3156) / var58;
                                                for (int var63 = 0; ~var62 < ~var63; ++var63) {
                                                    for (int var64 = 0; var64 < var61; ++var64) {
                                                        if (var11.field3074 == 0) {
                                                            if (var15 == 0) {
                                                                var57.method1222(var13 - -(var58 * var63), var59 * var64 + var14);
                                                            } else {
                                                                var57.method1209(var58 * var63 + var13, var59 * var64 + var14, -(255 & var15) + 256);
                                                            }
                                                        } else {
                                                            var57.method1228(var58 * var63 + var58 / 2 + var13, var59 * var64 + var14 - -(var59 / 2), var11.field3074, 4096);
                                                        }
                                                    }
                                                }
                                                class27.method212(arg4, arg3, arg5, arg1);
                                            }
                                        }
                                    }
                                } else if (~var11.field3077 == -7) {
                                    boolean var66 = class220.method1434(28267, var11);
                                    int var67;
                                    if (!var66) {
                                        var67 = var11.field3155;
                                    } else {
                                        var67 = var11.field3054;
                                    }
                                    class213 var68 = null;
                                    int var69 = 0;
                                    if (var11.field3126 != -1) {
                                        class19 var70 = class195.method1298(arg8 ^ 1639, var11.field3126);
                                        if (var70 != null) {
                                            class19 var71 = var70.method170(arg8 + 12871, var11.field3146);
                                            var68 = var71.method161((class178) null, 1, 234428564, 0);
                                            if (var68 == null) {
                                                class209.method1379(1, var11);
                                            } else {
                                                var68.method1404();
                                                var69 = -var68.field758 / 2;
                                            }
                                        }
                                    } else if (var11.field3086 == 5) {
                                        if (~var11.field3159 != 0) {
                                            int var72 = 2047 & var11.field3159;
                                            if (~class33.field733 == ~var72) {
                                                var72 = 2047;
                                            }
                                            class212 var73 = class183.field3600[var72];
                                            class178 var74 = ~var67 != 0 ? class167.method1080(11098, var67) : null;
                                            if (var73 != null && ~((int) var73.field4097.method1132(102) << 11) == ~(var11.field3159 & -2048)) {
                                                var68 = var73.field4109.method701(5, var11.field3084, (class178) null, 0, var74);
                                            }
                                        } else {
                                            var68 = class193.field3760.method701(5, -1, (class178) null, -1, (class178) null);
                                        }
                                    } else if (~var67 != 0) {
                                        class178 var75 = class167.method1080(11098, var67);
                                        var68 = var11.method1064(var11.field3084, class175.field3447.field4109, var66, arg8 + 118, var75);
                                        if (var68 == null && class216.field4191) {
                                            class209.method1379(1, var11);
                                        }
                                    } else {
                                        var68 = var11.method1064(-1, class175.field3447.field4109, var66, arg8 + 125, (class178) null);
                                        if (var68 == null && class216.field4191) {
                                            class209.method1379(arg8 + 1, var11);
                                        }
                                    }
                                    if (var68 != null) {
                                        class72.method436(var11.field3156 / 2 + var11.field3158 + var13, var14 - -(var11.field3105 / 2) + var11.field3133);
                                        int var76 = class72.field1404[var11.field3125] * var11.field3141 >> 16;
                                        int var77 = class72.field1396[var11.field3125] * var11.field3141 >> 16;
                                        if (var11.field3108) {
                                            if (var11.field3140) {
                                                var68.method626(0, var11.field3115, var11.field3069, var11.field3125, var11.field3057, var11.field3143 + var77 + var69, var11.field3143 + var76, var11.field3141);
                                            } else {
                                                var68.method632(0, var11.field3115, var11.field3069, var11.field3125, var11.field3057, var11.field3143 + var77 - -var69, var76 - -var11.field3143);
                                            }
                                        } else {
                                            var68.method632(0, var11.field3115, 0, var11.field3125, 0, var77, var76);
                                        }
                                        class72.method448();
                                    }
                                } else {
                                    if (var11.field3077 == 7) {
                                        class162 var78 = var11.method1072(0, class48.field1029);
                                        if (var78 == null) {
                                            if (class216.field4191) {
                                                class209.method1379(1, var11);
                                            }
                                            continue;
                                        }
                                        int var79 = 0;
                                        for (int var80 = 0; ~var80 > ~var11.field3105; ++var80) {
                                            for (int var81 = 0; ~var81 > ~var11.field3156; ++var81) {
                                                if (var11.field3111[var79] > 0) {
                                                    class19 var82 = class195.method1298(arg8 + 1639, var11.field3111[var79] - 1);
                                                    class173 var83;
                                                    if (~var82.field441 != -2 && ~var11.field3102[var79] == -2) {
                                                        var83 = class173.method1158(-3, new class173[] { class214.field4151, var82.field399, class148.field2833 });
                                                    } else {
                                                        var83 = class173.method1158(-3, new class173[] { class214.field4151, var82.field399, class1.field10, class45.method320(var11.field3102[var79], -73) });
                                                    }
                                                    int var84 = (var11.field3180 + 12) * var80 + var14;
                                                    int var85 = (115 - -var11.field3179) * var81 + var13;
                                                    if (var11.field3171 == 0) {
                                                        var78.method534(var83, var85, var84, var11.field3063, !var11.field3110 ? -1 : 0);
                                                    } else if (~var11.field3171 == -2) {
                                                        var78.method543(var83, var11.field3156 / 2 + var85, var84, var11.field3063, !var11.field3110 ? -1 : 0);
                                                    } else {
                                                        var78.method519(var83, var85 + -1 + var11.field3156, var84, var11.field3063, var11.field3110 ? 0 : -1);
                                                    }
                                                }
                                                ++var79;
                                            }
                                        }
                                    }
                                    if (~var11.field3077 == -9 && class104.field1924 == var11 && ~class56.field1109 == ~class189.field3690) {
                                        int var86 = 0;
                                        class162 var87 = class150.field2851;
                                        class173 var88 = var11.field3129;
                                        class173 var89 = method1055(var11, arg8 ^ 104, var88);
                                        int var90 = 0;
                                        while (var89.method1153((byte) -127) > 0) {
                                            int var98 = var89.method1151(class117.field2163, false);
                                            class173 var99;
                                            if (var98 != -1) {
                                                var99 = var89.method1155(0, var98, (byte) 122);
                                                var89 = var89.method1140(var98 - -4, (byte) 127);
                                            } else {
                                                var99 = var89;
                                                var89 = class208.field4049;
                                            }
                                            int var100 = var87.method539(var99);
                                            if (var100 > var86) {
                                                var86 = var100;
                                            }
                                            var90 += var87.field1617 - -1;
                                        }
                                        var90 += 7;
                                        var86 += 6;
                                        int var91 = var11.field3156 + -5 + var13 + -var86;
                                        if (~var91 > ~(var13 + 5)) {
                                            var91 = var13 - -5;
                                        }
                                        if (~(var86 + var91) < ~arg5) {
                                            var91 = -var86 + arg5;
                                        }
                                        int var92 = var14 - -var11.field3105 + 5;
                                        if (arg1 < var90 + var92) {
                                            var92 = -var90 + arg1;
                                        }
                                        class27.method219(var91, var92, var86, var90, 16777120);
                                        class27.method207(var91, var92, var86, var90, 0);
                                        int var93 = var92 + 2 + var87.field1617;
                                        class173 var94 = var11.field3129;
                                        class173 var95 = method1055(var11, -98, var94);
                                        while (~var95.method1153((byte) -128) < -1) {
                                            int var96 = var95.method1151(class117.field2163, false);
                                            class173 var97;
                                            if (~var96 == 0) {
                                                var97 = var95;
                                                var95 = class208.field4049;
                                            } else {
                                                var97 = var95.method1155(0, var96, (byte) 119);
                                                var95 = var95.method1140(var96 + 4, (byte) 126);
                                            }
                                            var87.method534(var97, var91 - -3, var93, 0, -1);
                                            var93 += var87.field1617 - -1;
                                        }
                                    }
                                    if (var11.field3077 == 9) {
                                        if (var11.field3131 != 1) {
                                            int var101 = ~var11.field3156 <= -1 ? var11.field3156 : -var11.field3156;
                                            int var102 = ~var11.field3105 <= -1 ? var11.field3105 : -var11.field3105;
                                            int var103 = var101;
                                            if (~var101 > ~var102) {
                                                var103 = var102;
                                            }
                                            if (~var103 != -1) {
                                                int var104 = (var11.field3156 << 16) / var103;
                                                int var105 = (var11.field3105 << 16) / var103;
                                                if (var104 >= var105) {
                                                    var104 = -var104;
                                                } else {
                                                    var105 = -var105;
                                                }
                                                int var106 = var11.field3131 * var105 >> 17;
                                                int var107 = var11.field3131 * var104 >> 17;
                                                int var108 = var11.field3131 * var105 - -1 >> 17;
                                                int var109 = var11.field3131 * var104 + 1 >> 17;
                                                int var110 = var13 - arg4;
                                                int var111 = var14 - arg3;
                                                int var112 = var106 + var110;
                                                int var113 = -var108 + var110;
                                                int var114 = -var108 + var110 - -var11.field3156;
                                                int var115 = var107 + var111;
                                                int var116 = var110 - -var106 + var11.field3156;
                                                int var117 = -var109 + var111;
                                                int var118 = var11.field3105 + var111 + -var109;
                                                int var119 = var107 + var111 + var11.field3105;
                                                class72.method450(var112, var113, var114);
                                                class72.method449(var115, var117, var118, var112, var113, var114, var11.field3063);
                                                class72.method450(var112, var114, var116);
                                                class72.method449(var115, var118, var119, var112, var114, var116, var11.field3063);
                                            }
                                        } else {
                                            class27.method211(var13, var14, var11.field3156 + var13, var11.field3105 + var14, var11.field3063);
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

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)Ldh;")
    public static final class39 method1057(byte arg0) {
        int var1 = -85 % ((arg0 - -31) / 62);
        ++field3038;
        class39 var2 = new class39();
        var2.field808 = class55.field1099[0];
        var2.field809 = class30.field622[0];
        var2.field814 = class20.field458[0];
        var2.field815 = class197.field3845;
        var2.field811 = class112.field2074;
        var2.field813 = class166.field3189;
        var2.field810 = class188.field3676[0];
        var2.field812 = class97.field1775[0];
        class184.method1246((byte) 31);
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILa;Llb;B)V")
    public static final void method1058(int arg0, class1 arg1, class111 arg2, byte arg3) {
        ++field3035;
        byte[] var4 = null;
        class145 var5 = class131.field2479;
        synchronized (class131.field2479) {
            for (class77 var6 = (class77) class131.field2479.method915(-1); var6 != null; var6 = (class77) class131.field2479.method910((byte) 88)) {
                if ((long) arg0 == var6.field2437 && var6.field1503 == arg2 && var6.field1498 == 0) {
                    var4 = var6.field1502;
                    break;
                }
            }
        }
        if (var4 != null) {
            arg1.method5(arg0, var4, arg2, true, -118);
        } else {
            if (arg3 > -57) {
                method1055((class165) null, 19, (class173) null);
            }
            byte[] var7 = arg2.method669(arg0, 255);
            arg1.method5(arg0, var7, arg2, true, -53);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        ++field3040;
        int var3 = -85 % ((-65 - arg1) / 60);
        int[] var4 = super.field718.method514(arg0, 126);
        if (super.field718.field1615) {
            int var5 = class105.field1937[arg0];
            int var6 = var5 + -2048 >> 1;
            for (int var7 = 0; ~class117.field2173 < ~var7; ++var7) {
                int var8 = class138.field2585[var7];
                int var9 = var8 - 2048 >> 1;
                int var12;
                if (~this.field3029 != -1) {
                    int var10 = var6 * var6 + var9 * var9 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var12 = (int) ((double) (this.field3037 * var11) * 3.141592653589793D);
                } else {
                    var12 = (-var5 + var8) * this.field3037;
                }
                int var13 = var12 - (-4096 & var12);
                if (~this.field3042 != -1) {
                    if (~this.field3042 == -3) {
                        var13 -= 2048;
                        if (var13 < 0) {
                            var13 = -var13;
                        }
                        var13 = -var13 + 2048 << 1;
                    }
                } else {
                    var13 = class57.field1143[var13 >> 4 & 255] - -4096 >> 1;
                }
                var4[var7] = var13;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
    public static void method1059(int arg0) {
        field3030 = null;
        field3043 = null;
        field3027 = null;
        field3044 = null;
        field3032 = null;
        if (arg0 > -10) {
            field3041 = null;
        }
        field3041 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (arg1 >= -99) {
            field3030 = null;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -4) {
                    this.field3037 = arg2.method751((byte) 90);
                }
            } else {
                this.field3042 = arg2.method751((byte) -60);
            }
        } else {
            this.field3029 = arg2.method751((byte) -103);
        }
        ++field3031;
    }
}
