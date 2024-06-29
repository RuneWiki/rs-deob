import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class148 {

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field2823 = 0;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "Lrd;")
    public static class173 field2833 = class133.method843("<)4col>", -102);

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "Lof;")
    public static class145 field2835 = new class145();

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public int field2827;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public int field2830;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public int field2832;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public int field2836;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "J")
    public long field2829;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "Ldd;")
    public class35 field2821;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "Ldd;")
    public class35 field2822;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "Ldd;")
    public class35 field2824;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "[I")
    public static int[] field2826;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIII[Lqf;III)V")
    public static final void method976(int arg0, int arg1, int arg2, int arg3, int arg4, class165[] arg5, int arg6, int arg7, int arg8) {
        int var9 = -62 % ((67 - arg3) / 38);
        field2828++;
        for (int var10 = 0; var10 < arg5.length; var10++) {
            class165 var11 = arg5[var10];
            if (var11 != null && (!var11.field3108 || var11.field3077 == 0 || var11.field3113 || class78.method474(var11, 104) != 0 || class26.field558 == var11 || var11.field3170 == 1338) && var11.field3072 == arg2 && (!var11.field3108 || !class82.method507(var11, -1))) {
                int var12 = var11.field3120 + arg8;
                int var13 = var11.field3174 + arg6;
                if (class71.field1376 == var11) {
                    class122.field2288 = var12;
                    class89.field1724 = true;
                    class138.field2591 = var13;
                }
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field3077 == 2) {
                    var14 = arg0;
                    var15 = arg4;
                    var16 = arg7;
                    var17 = arg1;
                } else if (var11.field3077 == 9) {
                    int var20 = var12;
                    int var21 = var13;
                    int var22 = var11.field3105 + var13;
                    int var23 = var12 + var11.field3156;
                    if (var12 > var23) {
                        var20 = var23;
                        var23 = var12;
                    }
                    var16 = var20 <= arg7 ? arg7 : var20;
                    if (var13 > var22) {
                        var21 = var22;
                        var22 = var13;
                    }
                    var22++;
                    var23++;
                    var14 = var21 <= arg0 ? arg0 : var21;
                    var15 = arg4 > var22 ? var22 : arg4;
                    var17 = arg1 > var23 ? var23 : arg1;
                } else {
                    var16 = var12 > arg7 ? var12 : arg7;
                    int var18 = var11.field3156 + var12;
                    int var19 = var11.field3105 + var13;
                    var17 = arg1 <= var18 ? arg1 : var18;
                    var14 = var13 <= arg0 ? arg0 : var13;
                    var15 = var19 >= arg4 ? arg4 : var19;
                }
                if (!var11.field3108 || var17 > var16 && var14 < var15) {
                    if (var11.field3170 == 1337) {
                        class209.method1379(1, var11);
                    } else {
                        if (var11.field3077 == 0) {
                            if (!var11.field3108 && class82.method507(var11, -1) && class96.field1768 != var11) {
                                continue;
                            }
                            method976(var14, var17, var11.field3132, 109, var15, arg5, var13 - var11.field3087, var16, var12 - var11.field3106);
                            if (var11.field3067 != null) {
                                method976(var14, var17, var11.field3132, 126, var15, var11.field3067, var13 - var11.field3087, var16, var12 - var11.field3106);
                            }
                            class157 var26 = (class157) client.field637.method677(-2755, (long) var11.field3132);
                            if (var26 != null) {
                                class160.method1048(var17, var14, var15, var26.field2940, var12, var13, var16, -1791);
                            }
                        }
                        if (var11.field3108) {
                            boolean var27;
                            if (class214.field4154 >= var16 && class4.field72 >= var14 && class214.field4154 < var17 && var15 > class4.field72) {
                                var27 = true;
                            } else {
                                var27 = false;
                            }
                            boolean var28 = false;
                            if (class144.field2685 == 1 && var27) {
                                var28 = true;
                            }
                            boolean var29 = false;
                            if (class120.field2208 == 1 && var16 <= class41.field849 && class23.field493 >= var14 && var17 > class41.field849 && class23.field493 < var15) {
                                var29 = true;
                            }
                            if (var11.field3170 == 1338) {
                                if (var29) {
                                    class117.method710(-1107721013, class41.field849 - var12, -var13 + class23.field493, var11);
                                }
                                continue;
                            }
                            if (var29) {
                                class177.method1181(class41.field849 - var12, class23.field493 - var13, var11, -96);
                            }
                            if (class71.field1376 != null && class71.field1376 != var11 && var27 && class67.method419(true, class78.method474(var11, 94))) {
                                class105.field1941 = var11;
                            }
                            if (class26.field558 == var11) {
                                class167.field3227 = var12;
                                class174.field3435 = true;
                                class51.field1048 = var13;
                            }
                            if (var11.field3113) {
                                if (var27 && class166.field3202 != 0 && var11.field3145 != null) {
                                    class117 var30 = new class117();
                                    var30.field2155 = var11;
                                    var30.field2176 = class166.field3202;
                                    var30.field2174 = var11.field3145;
                                    field2835.method920(false, var30);
                                }
                                if (class71.field1376 != null || class177.field3470 != null || class167.field3223) {
                                    var28 = false;
                                    var27 = false;
                                    var29 = false;
                                }
                                if (!var11.field3166 && var29) {
                                    var11.field3166 = true;
                                    if (var11.field3082 != null) {
                                        class117 var31 = new class117();
                                        var31.field2155 = var11;
                                        var31.field2174 = var11.field3082;
                                        var31.field2176 = class23.field493 - var13;
                                        var31.field2168 = class41.field849 - var12;
                                        field2835.method920(false, var31);
                                    }
                                }
                                if (var11.field3166 && var28 && var11.field3062 != null) {
                                    class117 var32 = new class117();
                                    var32.field2155 = var11;
                                    var32.field2174 = var11.field3062;
                                    var32.field2176 = class4.field72 - var13;
                                    var32.field2168 = class214.field4154 - var12;
                                    field2835.method920(false, var32);
                                }
                                if (var11.field3166 && !var28) {
                                    var11.field3166 = false;
                                    if (var11.field3048 != null) {
                                        class117 var33 = new class117();
                                        var33.field2155 = var11;
                                        var33.field2174 = var11.field3048;
                                        var33.field2176 = class4.field72 - var13;
                                        var33.field2168 = class214.field4154 - var12;
                                        class186.field3626.method920(false, var33);
                                    }
                                }
                                if (var28 && var11.field3112 != null) {
                                    class117 var34 = new class117();
                                    var34.field2176 = class4.field72 - var13;
                                    var34.field2168 = class214.field4154 - var12;
                                    var34.field2174 = var11.field3112;
                                    var34.field2155 = var11;
                                    field2835.method920(false, var34);
                                }
                                if (!var11.field3172 && var27) {
                                    var11.field3172 = true;
                                    if (var11.field3051 != null) {
                                        class117 var35 = new class117();
                                        var35.field2168 = class214.field4154 - var12;
                                        var35.field2174 = var11.field3051;
                                        var35.field2155 = var11;
                                        var35.field2176 = class4.field72 - var13;
                                        field2835.method920(false, var35);
                                    }
                                }
                                if (var11.field3172 && var27 && var11.field3046 != null) {
                                    class117 var36 = new class117();
                                    var36.field2155 = var11;
                                    var36.field2176 = class4.field72 - var13;
                                    var36.field2174 = var11.field3046;
                                    var36.field2168 = class214.field4154 - var12;
                                    field2835.method920(false, var36);
                                }
                                if (var11.field3172 && !var27) {
                                    var11.field3172 = false;
                                    if (var11.field3083 != null) {
                                        class117 var37 = new class117();
                                        var37.field2176 = class4.field72 - var13;
                                        var37.field2174 = var11.field3083;
                                        var37.field2155 = var11;
                                        var37.field2168 = class214.field4154 - var12;
                                        class186.field3626.method920(false, var37);
                                    }
                                }
                                if (var11.field3090 != null) {
                                    class117 var38 = new class117();
                                    var38.field2155 = var11;
                                    var38.field2174 = var11.field3090;
                                    class87.field1685.method920(false, var38);
                                }
                                if (var11.field3157 != null && class122.field2293 > var11.field3151) {
                                    if (var11.field3066 == null || class122.field2293 - var11.field3151 > 32) {
                                        class117 var43 = new class117();
                                        var43.field2155 = var11;
                                        var43.field2174 = var11.field3157;
                                        field2835.method920(false, var43);
                                    } else {
                                        label390: for (int var39 = var11.field3151; var39 < class122.field2293; var39++) {
                                            int var40 = class211.field4090[var39 & 0x1F];
                                            for (int var41 = 0; var41 < var11.field3066.length; var41++) {
                                                if (var11.field3066[var41] == var40) {
                                                    class117 var42 = new class117();
                                                    var42.field2155 = var11;
                                                    var42.field2174 = var11.field3157;
                                                    field2835.method920(false, var42);
                                                    break label390;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3151 = class122.field2293;
                                }
                                if (var11.field3184 != null && class196.field3818 > var11.field3177) {
                                    if (var11.field3144 == null || class196.field3818 - var11.field3177 > 32) {
                                        class117 var48 = new class117();
                                        var48.field2155 = var11;
                                        var48.field2174 = var11.field3184;
                                        field2835.method920(false, var48);
                                    } else {
                                        label366: for (int var44 = var11.field3177; var44 < class196.field3818; var44++) {
                                            int var45 = class175.field3440[var44 & 0x1F];
                                            for (int var46 = 0; var46 < var11.field3144.length; var46++) {
                                                if (var11.field3144[var46] == var45) {
                                                    class117 var47 = new class117();
                                                    var47.field2174 = var11.field3184;
                                                    var47.field2155 = var11;
                                                    field2835.method920(false, var47);
                                                    break label366;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3177 = class196.field3818;
                                }
                                if (var11.field3148 != null && var11.field3078 < class35.field765) {
                                    if (var11.field3070 == null || class35.field765 - var11.field3078 > 32) {
                                        class117 var53 = new class117();
                                        var53.field2155 = var11;
                                        var53.field2174 = var11.field3148;
                                        field2835.method920(false, var53);
                                    } else {
                                        label342: for (int var49 = var11.field3078; var49 < class35.field765; var49++) {
                                            int var50 = class43.field880[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var11.field3070.length; var51++) {
                                                if (var11.field3070[var51] == var50) {
                                                    class117 var52 = new class117();
                                                    var52.field2174 = var11.field3148;
                                                    var52.field2155 = var11;
                                                    field2835.method920(false, var52);
                                                    break label342;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3078 = class35.field765;
                                }
                                if (var11.field3161 < class197.field3849 && var11.field3186 != null) {
                                    class117 var54 = new class117();
                                    var54.field2155 = var11;
                                    var54.field2174 = var11.field3186;
                                    field2835.method920(false, var54);
                                }
                                if (var11.field3161 < class189.field3692 && var11.field3064 != null) {
                                    class117 var55 = new class117();
                                    var55.field2155 = var11;
                                    var55.field2174 = var11.field3064;
                                    field2835.method920(false, var55);
                                }
                                if (var11.field3161 < class129.field2441 && var11.field3165 != null) {
                                    class117 var56 = new class117();
                                    var56.field2174 = var11.field3165;
                                    var56.field2155 = var11;
                                    field2835.method920(false, var56);
                                }
                                if (class133.field2512 > var11.field3161 && var11.field3127 != null) {
                                    class117 var57 = new class117();
                                    var57.field2174 = var11.field3127;
                                    var57.field2155 = var11;
                                    field2835.method920(false, var57);
                                }
                                if (class117.field2158 > var11.field3161 && var11.field3164 != null) {
                                    class117 var58 = new class117();
                                    var58.field2155 = var11;
                                    var58.field2174 = var11.field3164;
                                    field2835.method920(false, var58);
                                }
                                var11.field3161 = class34.field741;
                                if (var11.field3101 != null) {
                                    for (int var59 = 0; var59 < class106.field1983; var59++) {
                                        class117 var60 = new class117();
                                        var60.field2155 = var11;
                                        var60.field2172 = class4.field98[var59];
                                        var60.field2161 = class9.field169[var59];
                                        var60.field2174 = var11.field3101;
                                        field2835.method920(false, var60);
                                    }
                                }
                            }
                        }
                        if (!var11.field3108) {
                            if (class71.field1376 != null || class177.field3470 != null || class167.field3223) {
                                return;
                            }
                            if ((var11.field3081 >= 0 || var11.field3068 != 0) && class214.field4154 >= var16 && var14 <= class4.field72 && var17 > class214.field4154 && class4.field72 < var15) {
                                if (var11.field3081 < 0) {
                                    class96.field1768 = var11;
                                } else {
                                    class96.field1768 = arg5[var11.field3081];
                                }
                            }
                            if (var11.field3077 == 8 && class214.field4154 >= var16 && var14 <= class4.field72 && class214.field4154 < var17 && class4.field72 < var15) {
                                class104.field1924 = var11;
                            }
                            if (var11.field3105 < var11.field3153) {
                                class96.method596(var12 + var11.field3156, class214.field4154, var11.field3153, (byte) -32, var11.field3105, class4.field72, var13, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
    public static void method977(boolean arg0) {
        field2833 = null;
        field2826 = null;
        if (!arg0) {
            field2835 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V")
    public static final void method978(int arg0, int arg1) {
        field2834++;
        if (class24.field525 == arg0 || arg1 != 8780) {
            return;
        }
        if (class24.field525 == 0) {
            class99.method612(10);
        }
        if (arg0 == 20 || arg0 == 40) {
            class54.field1090 = 0;
            class42.field871 = 0;
            class140.field2612 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class133.field2523 != null) {
            class133.field2523.method1095((byte) 127);
            class133.field2523 = null;
        }
        if (class24.field525 == 25) {
            class217.field4197 = 0;
            class89.field1722 = 1;
            class51.field1058 = 1;
            class197.field3834 = 0;
            class119.field2185 = 0;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class62.method391(class145.field2700, class187.field3659, (byte) 103, class165.field3183);
        } else {
            class64.method408(0);
        }
        class24.field525 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)Lrd;")
    public static final class173 method979(int arg0, byte arg1) {
        field2825++;
        return arg1 >= -91 ? null : class173.method1158(-3, new class173[] { class93.method588(arg0 >> 24 & 0xFF, true), class119.field2191, class93.method588(arg0 >> 16 & 0xFF, true), class119.field2191, class93.method588(arg0 >> 8 & 0xFF, true), class119.field2191, class93.method588(arg0 & 0xFF, true) });
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)Lca;")
    public static final class22 method980(int arg0, int arg1, int arg2) {
        class105 var3 = class208.field4055[arg0][arg1][arg2];
        return var3 == null || var3.field1954 == null ? null : var3.field1954;
    }
}
