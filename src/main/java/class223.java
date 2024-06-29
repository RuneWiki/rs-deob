import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class223 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Li;")
    public static class88 field4195 = class208.method1425(105, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field4201 = 0;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Li;")
    private static class88 field4204 = class208.method1425(105, "Please try using a different world)3");

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "Li;")
    public static class88 field4202 = field4204;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field4198 = 0;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Li;")
    public static class88 field4196 = field4204;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field4200 = 0;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Li;")
    public static class88 field4199 = field4204;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Li;")
    public static class88 field4208 = field4204;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "Li;")
    public static class88 field4210 = class208.method1425(105, "overlay2)3dat");

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "Li;")
    public static class88 field4211 = field4204;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field4213 = 127;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "Li;")
    public static class88 field4209 = field4204;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "Li;")
    private static class88 field4215 = class208.method1425(105, "Your account is already logged in)3");

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "Li;")
    public static class88 field4207 = field4215;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Lbj;")
    public static class22 field4203;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Li;IILi;)V")
    public static final void method1501(class88 arg0, int arg1, int arg2, class88 arg3) {
        if (arg1 == 12) {
            class118.method803(arg0, (byte) 28, -1, arg3, arg2, null);
            field4197++;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1502(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -69 % ((arg1 + 57) / 53);
        field4212++;
        int var10 = arg6 - arg7;
        int var11 = arg8 - arg5;
        int var12 = (arg3 - arg2 << 16) / var10;
        int var13 = (arg4 - arg0 << 16) / var11;
        boolean var14;
        if (class54.field1012 > 0 && class54.field1012 % 10 < 5) {
            var14 = true;
        } else {
            var14 = false;
        }
        for (int var15 = 0; var15 < var10; var15++) {
            int var32 = (var15 + 1) * var12 >> 16;
            int var33 = var12 * var15 >> 16;
            int var34 = var32 - var33;
            if (var34 > 0) {
                int[][] var35 = class48.field895[arg7 + var15 >> 6];
                int var10000 = arg2 + var32;
                int var37 = arg2 + var33;
                for (int var38 = 0; var38 < var11; var38++) {
                    int var39 = (var38 + 1) * var13 >> 16;
                    int var40 = var13 * var38 >> 16;
                    int var41 = var39 - var40;
                    if (var41 > 0) {
                        var10000 = arg0 + var39;
                        int var43 = arg0 + var40;
                        int var44 = arg5 + var38 >> 6;
                        if (var35[var44] != null) {
                            int var45 = ((var38 + arg5 & 0x3F) << 6) + (arg7 + var15 & 0x3F);
                            int var46 = var35[var44][var45];
                            if (var46 != 0) {
                                class148 var47 = class190.method1323(var46 - 1, -12450);
                                if (var14 && class44.field772 == var47.field2819) {
                                    class65 var48 = new class65();
                                    var48.field1179 = var37;
                                    var48.field1180 = var47.field2819;
                                    var48.field1175 = var43;
                                    class45.field783.method1624(var48, 49);
                                }
                                class31.field505[var47.field2819].method1157(var37 - 7, var43 + -7);
                            }
                        }
                    }
                }
            }
        }
        if (class59.field1110 == class150.field2917) {
            for (class244 var16 = (class244) class159.field3051.method1612(false); var16 != null; var16 = (class244) class159.field3051.method1621(82)) {
                int var17 = var16.field4485;
                int var18 = var17 - class16.field239;
                int var19 = var16.field4487;
                int var20 = class119.field2183 + class44.field760 - var19;
                int var21 = (arg3 - arg2) * (var18 - arg7) / (arg6 - arg7) + arg2;
                int var22 = (arg4 - arg0) * (var20 - arg5) / (arg8 - arg5) + arg0;
                int var23 = var16.field4494;
                int var24 = 16777215;
                class75 var25 = null;
                if (var23 == 0) {
                    if (class59.field1110 == 3.0D) {
                        var25 = class12.field175;
                    }
                    if (class59.field1110 == 4.0D) {
                        var25 = class118.field2149;
                    }
                    if (class59.field1110 == 6.0D) {
                        var25 = class236.field4399;
                    }
                    if (class59.field1110 == 8.0D) {
                        var25 = class196.field3764;
                    }
                }
                if (var23 == 1) {
                    if (class59.field1110 == 3.0D) {
                        var25 = class236.field4399;
                    }
                    if (class59.field1110 == 4.0D) {
                        var25 = class196.field3764;
                    }
                    if (class59.field1110 == 6.0D) {
                        var25 = class167.field3207;
                    }
                    if (class59.field1110 == 8.0D) {
                        var25 = class166.field3201;
                    }
                }
                if (var23 == 2) {
                    var24 = 16755200;
                    if (class59.field1110 == 3.0D) {
                        var25 = class167.field3207;
                    }
                    if (class59.field1110 == 4.0D) {
                        var25 = class166.field3201;
                    }
                    if (class59.field1110 == 6.0D) {
                        var25 = class231.field4327;
                    }
                    if (class59.field1110 == 8.0D) {
                        var25 = class227.field4252;
                    }
                }
                if (var25 != null) {
                    class88[] var26 = var16.field4492;
                    int var27 = var26.length;
                    int var28 = var22 - var25.method508() * (var27 - 1) / 2;
                    int var29 = var28 + var25.method505() / 2;
                    for (int var30 = 0; var30 < var27; var30++) {
                        var25.method511(var26[var30], var21, var29, var24, true);
                        var29 += var25.method508();
                    }
                }
            }
        }
        for (class65 var31 = (class65) class45.field783.method1612(false); var31 != null; var31 = (class65) class45.field783.method1621(82)) {
            class31.field505[var31.field1180].method1157(var31.field1179 - 7, var31.field1175 + -7);
            class72.method483(var31.field1179, var31.field1175, 15, 16776960, 128);
            class72.method483(var31.field1179, var31.field1175, 7, 16777215, 256);
        }
        class45.field783.method1618(-3);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static void method1503(byte arg0) {
        field4196 = null;
        field4215 = null;
        field4202 = null;
        field4203 = null;
        field4195 = null;
        field4204 = null;
        field4211 = null;
        if (arg0 != 96) {
            method1505((byte) -57, false, 113, false, -92, -61, true, -117, 47, null, -30, 18);
        }
        field4199 = null;
        field4208 = null;
        field4210 = null;
        field4207 = null;
        field4209 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1504(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        for (int var6 = arg3; var6 <= arg5; var6++) {
            class230.method1536(arg0, arg1, -7, arg2, class3.field42[var6]);
        }
        if (arg4) {
            field4210 = null;
        }
        field4206++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BZIZIIZIILia;II)V")
    public static final void method1505(byte arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, class89 arg9, int arg10, int arg11) {
        field4205++;
        if (arg6 && (class116.field2100[0][arg11][arg10] & 0x2) == 0) {
            if ((class116.field2100[arg2][arg11][arg10] & 0x10) != 0) {
                return;
            }
            if (class234.method1557(4570, arg10, arg11, arg2) != class157.field3028) {
                return;
            }
        }
        if (arg2 < class28.field468) {
            class28.field468 = arg2;
        }
        int var12 = -121 / ((arg0 + 12) / 50);
        class148 var13 = class190.method1323(arg7, -12450);
        int var14;
        int var15;
        if (arg4 == 1 || arg4 == 3) {
            var15 = var13.field2796;
            var14 = var13.field2776;
        } else {
            var14 = var13.field2796;
            var15 = var13.field2776;
        }
        int var16;
        int var17;
        if (arg11 + var15 <= 104) {
            var16 = (var15 >> 1) + arg11;
            var17 = (var15 + 1 >> 1) + arg11;
        } else {
            var16 = arg11;
            var17 = arg11 + 1;
        }
        int var18;
        int var19;
        if (arg10 + var14 > 104) {
            var18 = arg10;
            var19 = arg10 + 1;
        } else {
            var18 = (var14 >> 1) + arg10;
            var19 = arg10 + (var14 + 1 >> 1);
        }
        int[][] var20 = class62.field1137[arg8];
        int var21 = (arg11 << 7) + (var15 << 6);
        int var22 = var20[var16][var19] + var20[var17][var19] + var20[var17][var18] + var20[var16][var18] >> 2;
        int var23 = (arg10 << 7) + (var14 << 6);
        int[][] var24 = null;
        long var25 = (long) ((arg4 | 0x400) << 20 | arg5 << 14 | arg10 << 7 | arg11);
        if (var13.field2835 == 0 || arg3) {
            var25 |= Long.MIN_VALUE;
        }
        if (arg3) {
            var24 = class145.field2723[0];
        } else if (arg8 < 3) {
            var24 = class62.field1137[arg8 + 1];
        }
        if (var13.field2782 == 1) {
            var25 |= 0x400000L;
        }
        long var27 = var25 | (long) arg7 << 32;
        if (arg1 && var13.method996(-128)) {
            class17.method84(arg11, arg2, arg4, false, arg10, var13);
        }
        if (arg5 == 22) {
            if (!arg6 || var13.field2835 != 0 || var13.field2821 == 1 || var13.field2828) {
                class145 var30;
                if (var13.field2812 == -1 && var13.field2772 == null) {
                    class210 var29 = var13.method999(22, var24, var20, var21, arg1, var23, arg4, var22, -21737);
                    var30 = var29.field3986;
                } else {
                    var30 = new class81(arg7, 22, arg4, arg8, arg11, arg10, var13.field2812, var13.field2831, null);
                }
                class35.method232(arg2, arg11, arg10, var22, var30, var27, var13.field2801);
                if (var13.field2821 == 1 && arg9 != null) {
                    arg9.method647(262144, arg10, arg11);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class145 var70;
            if (var13.field2812 == -1 && var13.field2772 == null) {
                class210 var69 = var13.method999(10, var24, var20, var21, arg1, var23, arg4, var22, -21737);
                var70 = var69.field3986;
            } else {
                var70 = new class81(arg7, 10, arg4, arg8, arg11, arg10, var13.field2812, var13.field2831, null);
            }
            if (var70 != null) {
                boolean var71 = class53.method390(arg2, arg11, arg10, var22, var15, var14, var70, arg5 == 11 ? 256 : 0, var27);
                if (var13.field2784 && var71 && arg1) {
                    int var72 = 15;
                    if (var70 instanceof class30) {
                        var72 = ((class30) var70).method192() / 4;
                        if (var72 > 30) {
                            var72 = 30;
                        }
                    }
                    for (int var73 = 0; var73 <= var15; var73++) {
                        for (int var74 = 0; var74 <= var14; var74++) {
                            if (var72 > class111.field2022[arg2][arg11 + var73][arg10 + var74]) {
                                class111.field2022[arg2][arg11 + var73][arg10 + var74] = (byte) var72;
                            }
                        }
                    }
                }
            }
            if (var13.field2821 != 0 && arg9 != null) {
                arg9.method645(64, var15, var14, var13.field2791, arg11, arg10);
            }
        } else if (arg5 >= 12) {
            class145 var32;
            if (var13.field2812 == -1 && var13.field2772 == null) {
                class210 var31 = var13.method999(arg5, var24, var20, var21, arg1, var23, arg4, var22, -21737);
                var32 = var31.field3986;
            } else {
                var32 = new class81(arg7, arg5, arg4, arg8, arg11, arg10, var13.field2812, var13.field2831, null);
            }
            class53.method390(arg2, arg11, arg10, var22, 1, 1, var32, 0, var27);
            if (arg1 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg2 > 0) {
                class135.field2513[arg2][arg11][arg10] = class204.method1405(class135.field2513[arg2][arg11][arg10], 2340);
            }
            if (var13.field2821 != 0 && arg9 != null) {
                arg9.method645(64, var15, var14, var13.field2791, arg11, arg10);
            }
        } else if (arg5 == 0) {
            class145 var34;
            if (var13.field2812 == -1 && var13.field2772 == null) {
                class210 var33 = var13.method999(0, var24, var20, var21, arg1, var23, arg4, var22, -21737);
                var34 = var33.field3986;
            } else {
                var34 = new class81(arg7, 0, arg4, arg8, arg11, arg10, var13.field2812, var13.field2831, null);
            }
            class110.method764(arg2, arg11, arg10, var22, var34, null, class208.field3951[arg4], 0, var27);
            if (arg1) {
                if (arg4 == 0) {
                    if (var13.field2784) {
                        class111.field2022[arg2][arg11][arg10] = 50;
                        class111.field2022[arg2][arg11][arg10 + 1] = 50;
                    }
                    if (var13.field2774) {
                        class135.field2513[arg2][arg11][arg10] = class204.method1405(class135.field2513[arg2][arg11][arg10], 585);
                    }
                } else if (arg4 == 1) {
                    if (var13.field2784) {
                        class111.field2022[arg2][arg11][arg10 + 1] = 50;
                        class111.field2022[arg2][arg11 + 1][arg10 + 1] = 50;
                    }
                    if (var13.field2774) {
                        class135.field2513[arg2][arg11][arg10 + 1] = class204.method1405(class135.field2513[arg2][arg11][arg10 + 1], 1170);
                    }
                } else if (arg4 == 2) {
                    if (var13.field2784) {
                        class111.field2022[arg2][arg11 + 1][arg10] = 50;
                        class111.field2022[arg2][arg11 + 1][arg10 + 1] = 50;
                    }
                    if (var13.field2774) {
                        class135.field2513[arg2][arg11 + 1][arg10] = class204.method1405(class135.field2513[arg2][arg11 + 1][arg10], 585);
                    }
                } else if (arg4 == 3) {
                    if (var13.field2784) {
                        class111.field2022[arg2][arg11][arg10] = 50;
                        class111.field2022[arg2][arg11 + 1][arg10] = 50;
                    }
                    if (var13.field2774) {
                        class135.field2513[arg2][arg11][arg10] = class204.method1405(class135.field2513[arg2][arg11][arg10], 1170);
                    }
                }
            }
            if (var13.field2821 != 0 && arg9 != null) {
                arg9.method646(arg5, arg10, var13.field2791, false, arg4, arg11);
            }
            if (var13.field2807 != 16) {
                class245.method1604(arg2, arg11, arg10, var13.field2807);
            }
        } else if (arg5 == 1) {
            class145 var36;
            if (var13.field2812 == -1 && var13.field2772 == null) {
                class210 var35 = var13.method999(1, var24, var20, var21, arg1, var23, arg4, var22, -21737);
                var36 = var35.field3986;
            } else {
                var36 = new class81(arg7, 1, arg4, arg8, arg11, arg10, var13.field2812, var13.field2831, null);
            }
            class110.method764(arg2, arg11, arg10, var22, var36, null, class238.field4429[arg4], 0, var27);
            if (var13.field2784 && arg1) {
                if (arg4 == 0) {
                    class111.field2022[arg2][arg11][arg10 + 1] = 50;
                } else if (arg4 == 1) {
                    class111.field2022[arg2][arg11 + 1][arg10 + 1] = 50;
                } else if (arg4 == 2) {
                    class111.field2022[arg2][arg11 + 1][arg10] = 50;
                } else if (arg4 == 3) {
                    class111.field2022[arg2][arg11][arg10] = 50;
                }
            }
            if (var13.field2821 != 0 && arg9 != null) {
                arg9.method646(arg5, arg10, var13.field2791, false, arg4, arg11);
            }
        } else if (arg5 == 2) {
            int var37 = arg4 + 1 & 0x3;
            class145 var39;
            class145 var41;
            if (var13.field2812 == -1 && var13.field2772 == null) {
                class210 var38 = var13.method999(2, var24, var20, var21, arg1, var23, arg4 + 4, var22, -21737);
                var39 = var38.field3986;
                class210 var40 = var13.method999(2, var24, var20, var21, arg1, var23, var37, var22, -21737);
                var41 = var40.field3986;
            } else {
                var39 = new class81(arg7, 2, arg4 + 4, arg8, arg11, arg10, var13.field2812, var13.field2831, null);
                var41 = new class81(arg7, 2, var37, arg8, arg11, arg10, var13.field2812, var13.field2831, null);
            }
            class110.method764(arg2, arg11, arg10, var22, var39, var41, class208.field3951[arg4], class208.field3951[var37], var27);
            if (var13.field2774 && arg1) {
                if (arg4 == 0) {
                    class135.field2513[arg2][arg11][arg10] = class204.method1405(class135.field2513[arg2][arg11][arg10], 585);
                    class135.field2513[arg2][arg11][arg10 + 1] = class204.method1405(class135.field2513[arg2][arg11][arg10 + 1], 1170);
                } else if (arg4 == 1) {
                    class135.field2513[arg2][arg11][arg10 + 1] = class204.method1405(class135.field2513[arg2][arg11][arg10 + 1], 1170);
                    class135.field2513[arg2][arg11 + 1][arg10] = class204.method1405(class135.field2513[arg2][arg11 + 1][arg10], 585);
                } else if (arg4 == 2) {
                    class135.field2513[arg2][arg11 + 1][arg10] = class204.method1405(class135.field2513[arg2][arg11 + 1][arg10], 585);
                    class135.field2513[arg2][arg11][arg10] = class204.method1405(class135.field2513[arg2][arg11][arg10], 1170);
                } else if (arg4 == 3) {
                    class135.field2513[arg2][arg11][arg10] = class204.method1405(class135.field2513[arg2][arg11][arg10], 1170);
                    class135.field2513[arg2][arg11][arg10] = class204.method1405(class135.field2513[arg2][arg11][arg10], 585);
                }
            }
            if (var13.field2821 != 0 && arg9 != null) {
                arg9.method646(arg5, arg10, var13.field2791, false, arg4, arg11);
            }
            if (var13.field2807 != 16) {
                class245.method1604(arg2, arg11, arg10, var13.field2807);
            }
        } else if (arg5 == 3) {
            class145 var43;
            if (var13.field2812 == -1 && var13.field2772 == null) {
                class210 var42 = var13.method999(3, var24, var20, var21, arg1, var23, arg4, var22, -21737);
                var43 = var42.field3986;
            } else {
                var43 = new class81(arg7, 3, arg4, arg8, arg11, arg10, var13.field2812, var13.field2831, null);
            }
            class110.method764(arg2, arg11, arg10, var22, var43, null, class238.field4429[arg4], 0, var27);
            if (var13.field2784 && arg1) {
                if (arg4 == 0) {
                    class111.field2022[arg2][arg11][arg10 + 1] = 50;
                } else if (arg4 == 1) {
                    class111.field2022[arg2][arg11 + 1][arg10 + 1] = 50;
                } else if (arg4 == 2) {
                    class111.field2022[arg2][arg11 + 1][arg10] = 50;
                } else if (arg4 == 3) {
                    class111.field2022[arg2][arg11][arg10] = 50;
                }
            }
            if (var13.field2821 != 0 && arg9 != null) {
                arg9.method646(arg5, arg10, var13.field2791, false, arg4, arg11);
            }
        } else if (arg5 == 9) {
            class145 var45;
            if (var13.field2812 == -1 && var13.field2772 == null) {
                class210 var44 = var13.method999(arg5, var24, var20, var21, arg1, var23, arg4, var22, -21737);
                var45 = var44.field3986;
            } else {
                var45 = new class81(arg7, arg5, arg4, arg8, arg11, arg10, var13.field2812, var13.field2831, null);
            }
            class53.method390(arg2, arg11, arg10, var22, 1, 1, var45, 0, var27);
            if (var13.field2821 != 0 && arg9 != null) {
                arg9.method645(64, var15, var14, var13.field2791, arg11, arg10);
            }
            if (var13.field2807 != 16) {
                class245.method1604(arg2, arg11, arg10, var13.field2807);
            }
        } else if (arg5 == 4) {
            class145 var47;
            if (var13.field2812 == -1 && var13.field2772 == null) {
                class210 var46 = var13.method999(4, var24, var20, var21, arg1, var23, arg4, var22, -21737);
                var47 = var46.field3986;
            } else {
                var47 = new class81(arg7, 4, arg4, arg8, arg11, arg10, var13.field2812, var13.field2831, null);
            }
            class227.method1522(arg2, arg11, arg10, var22, var47, null, class208.field3951[arg4], 0, 0, 0, var27);
        } else if (arg5 == 5) {
            int var48 = 16;
            long var49 = class157.method1064(arg2, arg11, arg10);
            if (var49 != 0L) {
                var48 = class190.method1323((int) (var49 >>> 32) & Integer.MAX_VALUE, -12450).field2807;
            }
            class145 var52;
            if (var13.field2812 == -1 && var13.field2772 == null) {
                class210 var51 = var13.method999(4, var24, var20, var21, arg1, var23, arg4, var22, -21737);
                var52 = var51.field3986;
            } else {
                var52 = new class81(arg7, 4, arg4, arg8, arg11, arg10, var13.field2812, var13.field2831, null);
            }
            class227.method1522(arg2, arg11, arg10, var22, var52, null, class208.field3951[arg4], 0, class13.field198[arg4] * var48, class86.field1557[arg4] * var48, var27);
        } else if (arg5 == 6) {
            int var53 = 8;
            long var54 = class157.method1064(arg2, arg11, arg10);
            if (var54 != 0L) {
                var53 = class190.method1323(Integer.MAX_VALUE & (int) (var54 >>> 32), -12450).field2807 / 2;
            }
            class145 var57;
            if (var13.field2812 == -1 && var13.field2772 == null) {
                class210 var56 = var13.method999(4, var24, var20, var21, arg1, var23, arg4 + 4, var22, -21737);
                var57 = var56.field3986;
            } else {
                var57 = new class81(arg7, 4, arg4 + 4, arg8, arg11, arg10, var13.field2812, var13.field2831, null);
            }
            class227.method1522(arg2, arg11, arg10, var22, var57, null, 256, arg4, class168.field3242[arg4] * var53, class33.field551[arg4] * var53, var27);
        } else if (arg5 == 7) {
            int var58 = arg4 + 2 & 0x3;
            class145 var60;
            if (var13.field2812 == -1 && var13.field2772 == null) {
                class210 var59 = var13.method999(4, var24, var20, var21, arg1, var23, var58 + 4, var22, -21737);
                var60 = var59.field3986;
            } else {
                var60 = new class81(arg7, 4, var58 + 4, arg8, arg11, arg10, var13.field2812, var13.field2831, null);
            }
            class227.method1522(arg2, arg11, arg10, var22, var60, null, 256, var58, 0, 0, var27);
        } else if (arg5 == 8) {
            int var61 = 8;
            long var62 = class157.method1064(arg2, arg11, arg10);
            if (var62 != 0L) {
                var61 = class190.method1323((int) (var62 >>> 32) & Integer.MAX_VALUE, -12450).field2807 / 2;
            }
            int var64 = arg4 + 2 & 0x3;
            class145 var66;
            class145 var68;
            if (var13.field2812 == -1 && var13.field2772 == null) {
                class210 var65 = var13.method999(4, var24, var20, var21, arg1, var23, arg4 + 4, var22, -21737);
                var66 = var65.field3986;
                class210 var67 = var13.method999(4, var24, var20, var21, arg1, var23, var64 + 4, var22, -21737);
                var68 = var67.field3986;
            } else {
                var66 = new class81(arg7, 4, arg4 + 4, arg8, arg11, arg10, var13.field2812, var13.field2831, null);
                var68 = new class81(arg7, 4, var64 + 4, arg8, arg11, arg10, var13.field2812, var13.field2831, null);
            }
            class227.method1522(arg2, arg11, arg10, var22, var66, var68, 256, arg4, class168.field3242[arg4] * var61, class33.field551[arg4] * var61, var27);
        }
    }
}
