import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class71 {

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public final int field1121;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public final int field1123;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public final int field1116;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lib;")
    public final class56 field1119;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Lmg;")
    public static class53 field1118 = new class53(128);

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Leg;")
    private static class37 field1126 = class174.method1167(")3en", 61);

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Leg;")
    private static class37 field1122 = class174.method1167("pt", 123);

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "Leg;")
    private static class37 field1127 = class174.method1167(")3pt", 64);

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "Leg;")
    private static class37 field1125 = class174.method1167("fr", -50);

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "Leg;")
    private static class37 field1128 = class174.method1167(")3de", 72);

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "Leg;")
    private static class37 field1133 = class174.method1167("de", -91);

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "Leg;")
    private static class37 field1129 = class174.method1167(")3fr", 61);

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "Leg;")
    private static class37 field1130 = class174.method1167("en", -106);

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "[Leg;")
    public static class37[] field1124 = new class37[] { field1130, field1133, field1125, field1122 };

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "[Leg;")
    private static class37[] field1132 = new class37[] { field1126, field1128, field1129, field1127 };

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Ljava/awt/Frame;")
    public static Frame field1114;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static final void method482(int arg0) {
        if (class79.field1229 < class19.field252) {
            class79.field1229 = (float) ((double) class79.field1229 / 30.0D + (double) class79.field1229);
            if (class19.field252 < class79.field1229) {
                class79.field1229 = class19.field252;
            }
            class78.method530(-1);
        } else if (class19.field252 < class79.field1229) {
            class79.field1229 = (float) ((double) class79.field1229 - (double) class79.field1229 / 30.0D);
            if (class79.field1229 < class19.field252) {
                class79.field1229 = class19.field252;
            }
            class78.method530(-1);
        }
        field1117++;
        if (class153.field2572 != -1 && class82.field1291 != -1) {
            int var1 = class153.field2572 - class217.field3738;
            int var2 = class82.field1291 - class28.field414;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class28.field414 -= -var2;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            if (var1 == 0 && var2 == 0) {
                class153.field2572 = -1;
                class82.field1291 = -1;
            }
            class217.field3738 += var1;
            class78.method530(-1);
        }
        int var3 = -102 / ((arg0 + 10) / 58);
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public static void method483(int arg0) {
        if (arg0 != -19248) {
            field1128 = null;
        }
        field1122 = null;
        field1114 = null;
        field1124 = null;
        field1126 = null;
        field1133 = null;
        field1127 = null;
        field1130 = null;
        field1132 = null;
        field1128 = null;
        field1125 = null;
        field1118 = null;
        field1129 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static final void method484(byte arg0) {
        field1131++;
        if (arg0 < 97) {
            field1126 = null;
        }
        if (class233.field4017 != null) {
            class125 var1 = class233.field4017;
            synchronized (class233.field4017) {
                class233.field4017 = null;
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZIIZLaf;IIIII)V")
    public static final void method485(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, class165 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg6 != -32264) {
            return;
        }
        field1113++;
        if (arg4 && !class72.method492(-2001) && (class241.field4312[0][arg10][arg9] & 0x2) == 0) {
            if ((class241.field4312[arg0][arg10][arg9] & 0x10) != 0) {
                return;
            }
            if (class188.method1304(arg0, arg9, (byte) -93, arg10) != class73.field1149) {
                return;
            }
        }
        if (class271.field4758 > arg0) {
            class271.field4758 = arg0;
        }
        class133 var11 = class178.method1186(arg2, 0);
        int var12;
        int var13;
        if (arg3 == 1 || arg3 == 3) {
            var13 = var11.field2272;
            var12 = var11.field2306;
        } else {
            var12 = var11.field2272;
            var13 = var11.field2306;
        }
        int var14;
        int var15;
        if (arg10 + var12 <= 104) {
            var14 = arg10 + (var12 >> 1);
            var15 = (var12 + 1 >> 1) + arg10;
        } else {
            var14 = arg10;
            var15 = arg10 + 1;
        }
        int[][] var16 = class218.field3754[arg8];
        int var17 = (arg9 << 7) + (var13 << 6);
        int var18 = (arg10 << 7) + (var12 << 6);
        int[][] var19 = null;
        if (arg1) {
            var19 = class177.field2958[0];
        } else if (arg8 < 3) {
            var19 = class218.field3754[arg8 + 1];
        }
        int var20;
        int var21;
        if ((arg9 + var13) > 104) {
            var20 = arg9 + 1;
            var21 = arg9;
        } else {
            var21 = (var13 >> 1) + arg9;
            var20 = (var13 + 1 >> 1) + arg9;
        }
        long var22 = (long) (arg3 << 20 | arg7 << 14 | arg10 | arg9 << 7 | 0x40000000);
        int var24 = var16[var14][var21] + var16[var15][var20] + var16[var15][var21] + var16[var14][var20] >> 2;
        if (var11.field2294 == 0 || arg1) {
            var22 |= Long.MIN_VALUE;
        }
        if (var11.field2269 == 1) {
            var22 |= 0x400000L;
        }
        if (var11.field2315) {
            var22 |= 0x80000000L;
        }
        if (var11.method956(arg6 ^ 0xFFFFCBE4)) {
            class47.method314(arg3, var11, arg9, arg0, arg10, (class163) null, true, (class188) null);
        }
        boolean var25 = !arg1 & var11.field2275;
        long var26 = var22 | (long) arg2 << 32;
        if (arg7 == 22) {
            if (class271.field4754 || var11.field2294 != 0 || var11.field2254 == 1 || var11.field2231) {
                class67 var29;
                if (var11.field2316 == -1 && var11.field2303 == null && !var11.field2283) {
                    class40 var28 = var11.method959((class14) null, arg3, var24, var19, var16, var18, arg6 + 32280, 22, var17, var25, arg4);
                    var29 = var28.field648;
                } else {
                    var29 = new class139(arg2, 22, arg3, arg8, arg10, arg9, var11.field2316, var11.field2266, (class67) null);
                }
                class200.method1389(arg0, arg10, arg9, var24, var29, var26, var11.field2298);
                if (var11.field2254 == 1 && arg5 != null) {
                    arg5.method1103(arg10, arg9, -105);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class67 var69;
            if (var11.field2316 == -1 && var11.field2303 == null && !var11.field2283) {
                class40 var68 = var11.method959((class14) null, arg7 == 11 ? arg3 + 4 : arg3, var24, var19, var16, var18, 3, 10, var17, var25, arg4);
                var69 = var68.field648;
            } else {
                var69 = new class139(arg2, 10, arg7 == 11 ? arg3 + 4 : arg3, arg8, arg10, arg9, var11.field2316, var11.field2266, (class67) null);
            }
            if (var69 != null) {
                boolean var70 = class67.method465(arg0, arg10, arg9, var24, var12, var13, var69, 0, var26);
                if (var11.field2277 && var70 && arg4) {
                    int var71 = 15;
                    if (var69 instanceof class253) {
                        var71 = ((class253) var69).method1463() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var12; var72++) {
                        for (int var73 = 0; var73 <= var13; var73++) {
                            if (class10.field173[arg0][arg10 + var72][arg9 + var73] < var71) {
                                class10.field173[arg0][arg10 + var72][arg9 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field2254 != 0 && arg5 != null) {
                arg5.method1106(0, var11.field2279, arg9, arg10, var13, var12);
            }
        } else if (arg7 >= 12) {
            class67 var31;
            if (var11.field2316 == -1 && var11.field2303 == null && !var11.field2283) {
                class40 var30 = var11.method959((class14) null, arg3, var24, var19, var16, var18, -113, arg7, var17, var25, arg4);
                var31 = var30.field648;
            } else {
                var31 = new class139(arg2, arg7, arg3, arg8, arg10, arg9, var11.field2316, var11.field2266, (class67) null);
            }
            class67.method465(arg0, arg10, arg9, var24, 1, 1, var31, 0, var26);
            if (arg4 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg0 > 0) {
                class228.field3925[arg0][arg10][arg9] = class94.method617(class228.field3925[arg0][arg10][arg9], 4);
            }
            if (var11.field2254 != 0 && arg5 != null) {
                arg5.method1106(arg6 ^ 0xFFFF81F8, var11.field2279, arg9, arg10, var13, var12);
            }
        } else if (arg7 == 0) {
            class67 var33;
            if (var11.field2316 == -1 && var11.field2303 == null && !var11.field2283) {
                class40 var32 = var11.method959((class14) null, arg3, var24, var19, var16, var18, -108, 0, var17, var25, arg4);
                var33 = var32.field648;
            } else {
                var33 = new class139(arg2, 0, arg3, arg8, arg10, arg9, var11.field2316, var11.field2266, (class67) null);
            }
            class188.method1302(arg0, arg10, arg9, var24, var33, (class67) null, class235.field4048[arg3], 0, var26);
            if (arg4) {
                if (arg3 == 0) {
                    if (var11.field2277) {
                        class10.field173[arg0][arg10][arg9] = 50;
                        class10.field173[arg0][arg10][arg9 + 1] = 50;
                    }
                    if (var11.field2311) {
                        class228.field3925[arg0][arg10][arg9] = class94.method617(class228.field3925[arg0][arg10][arg9], 1);
                    }
                } else if (arg3 == 1) {
                    if (var11.field2277) {
                        class10.field173[arg0][arg10][arg9 + 1] = 50;
                        class10.field173[arg0][arg10 + 1][arg9 + 1] = 50;
                    }
                    if (var11.field2311) {
                        class228.field3925[arg0][arg10][arg9 + 1] = class94.method617(class228.field3925[arg0][arg10][arg9 + 1], 2);
                    }
                } else if (arg3 == 2) {
                    if (var11.field2277) {
                        class10.field173[arg0][arg10 + 1][arg9] = 50;
                        class10.field173[arg0][arg10 + 1][arg9 + 1] = 50;
                    }
                    if (var11.field2311) {
                        class228.field3925[arg0][arg10 + 1][arg9] = class94.method617(class228.field3925[arg0][arg10 + 1][arg9], 1);
                    }
                } else if (arg3 == 3) {
                    if (var11.field2277) {
                        class10.field173[arg0][arg10][arg9] = 50;
                        class10.field173[arg0][arg10 + 1][arg9] = 50;
                    }
                    if (var11.field2311) {
                        class228.field3925[arg0][arg10][arg9] = class94.method617(class228.field3925[arg0][arg10][arg9], 2);
                    }
                }
            }
            if (var11.field2254 != 0 && arg5 != null) {
                arg5.method1108(arg3, var11.field2279, arg10, (byte) 112, arg7, arg9);
            }
            if (var11.field2278 != 16) {
                class127.method907(arg0, arg10, arg9, var11.field2278);
            }
        } else if (arg7 == 1) {
            class67 var35;
            if (var11.field2316 == -1 && var11.field2303 == null && !var11.field2283) {
                class40 var34 = var11.method959((class14) null, arg3, var24, var19, var16, var18, -102, 1, var17, var25, arg4);
                var35 = var34.field648;
            } else {
                var35 = new class139(arg2, 1, arg3, arg8, arg10, arg9, var11.field2316, var11.field2266, (class67) null);
            }
            class188.method1302(arg0, arg10, arg9, var24, var35, (class67) null, class73.field1152[arg3], 0, var26);
            if (var11.field2277 && arg4) {
                if (arg3 == 0) {
                    class10.field173[arg0][arg10][arg9 + 1] = 50;
                } else if (arg3 == 1) {
                    class10.field173[arg0][arg10 + 1][arg9 + 1] = 50;
                } else if (arg3 == 2) {
                    class10.field173[arg0][arg10 + 1][arg9] = 50;
                } else if (arg3 == 3) {
                    class10.field173[arg0][arg10][arg9] = 50;
                }
            }
            if (var11.field2254 != 0 && arg5 != null) {
                arg5.method1108(arg3, var11.field2279, arg10, (byte) 126, arg7, arg9);
            }
        } else if (arg7 == 2) {
            int var36 = arg3 + 1 & 0x3;
            class67 var38;
            class67 var40;
            if (var11.field2316 == -1 && var11.field2303 == null && !var11.field2283) {
                class40 var37 = var11.method959((class14) null, arg3 + 4, var24, var19, var16, var18, -11, 2, var17, var25, arg4);
                var38 = var37.field648;
                class40 var39 = var11.method959((class14) null, var36, var24, var19, var16, var18, -124, 2, var17, var25, arg4);
                var40 = var39.field648;
            } else {
                var38 = new class139(arg2, 2, arg3 + 4, arg8, arg10, arg9, var11.field2316, var11.field2266, (class67) null);
                var40 = new class139(arg2, 2, var36, arg8, arg10, arg9, var11.field2316, var11.field2266, (class67) null);
            }
            class188.method1302(arg0, arg10, arg9, var24, var38, var40, class235.field4048[arg3], class235.field4048[var36], var26);
            if (var11.field2311 && arg4) {
                if (arg3 == 0) {
                    class228.field3925[arg0][arg10][arg9] = class94.method617(class228.field3925[arg0][arg10][arg9], 1);
                    class228.field3925[arg0][arg10][arg9 + 1] = class94.method617(class228.field3925[arg0][arg10][arg9 + 1], 2);
                } else if (arg3 == 1) {
                    class228.field3925[arg0][arg10][arg9 + 1] = class94.method617(class228.field3925[arg0][arg10][arg9 + 1], 2);
                    class228.field3925[arg0][arg10 + 1][arg9] = class94.method617(class228.field3925[arg0][arg10 + 1][arg9], 1);
                } else if (arg3 == 2) {
                    class228.field3925[arg0][arg10 + 1][arg9] = class94.method617(class228.field3925[arg0][arg10 + 1][arg9], 1);
                    class228.field3925[arg0][arg10][arg9] = class94.method617(class228.field3925[arg0][arg10][arg9], 2);
                } else if (arg3 == 3) {
                    class228.field3925[arg0][arg10][arg9] = class94.method617(class228.field3925[arg0][arg10][arg9], 2);
                    class228.field3925[arg0][arg10][arg9] = class94.method617(class228.field3925[arg0][arg10][arg9], 1);
                }
            }
            if (var11.field2254 != 0 && arg5 != null) {
                arg5.method1108(arg3, var11.field2279, arg10, (byte) 125, arg7, arg9);
            }
            if (var11.field2278 != 16) {
                class127.method907(arg0, arg10, arg9, var11.field2278);
            }
        } else if (arg7 == 3) {
            class67 var42;
            if (var11.field2316 == -1 && var11.field2303 == null && !var11.field2283) {
                class40 var41 = var11.method959((class14) null, arg3, var24, var19, var16, var18, -19, 3, var17, var25, arg4);
                var42 = var41.field648;
            } else {
                var42 = new class139(arg2, 3, arg3, arg8, arg10, arg9, var11.field2316, var11.field2266, (class67) null);
            }
            class188.method1302(arg0, arg10, arg9, var24, var42, (class67) null, class73.field1152[arg3], 0, var26);
            if (var11.field2277 && arg4) {
                if (arg3 == 0) {
                    class10.field173[arg0][arg10][arg9 + 1] = 50;
                } else if (arg3 == 1) {
                    class10.field173[arg0][arg10 + 1][arg9 + 1] = 50;
                } else if (arg3 == 2) {
                    class10.field173[arg0][arg10 + 1][arg9] = 50;
                } else if (arg3 == 3) {
                    class10.field173[arg0][arg10][arg9] = 50;
                }
            }
            if (var11.field2254 != 0 && arg5 != null) {
                arg5.method1108(arg3, var11.field2279, arg10, (byte) -108, arg7, arg9);
            }
        } else if (arg7 == 9) {
            class67 var44;
            if (var11.field2316 == -1 && var11.field2303 == null && !var11.field2283) {
                class40 var43 = var11.method959((class14) null, arg3, var24, var19, var16, var18, 99, arg7, var17, var25, arg4);
                var44 = var43.field648;
            } else {
                var44 = new class139(arg2, arg7, arg3, arg8, arg10, arg9, var11.field2316, var11.field2266, (class67) null);
            }
            class67.method465(arg0, arg10, arg9, var24, 1, 1, var44, 0, var26);
            if (var11.field2254 != 0 && arg5 != null) {
                arg5.method1106(arg6 + 32264, var11.field2279, arg9, arg10, var13, var12);
            }
            if (var11.field2278 != 16) {
                class127.method907(arg0, arg10, arg9, var11.field2278);
            }
        } else if (arg7 == 4) {
            class67 var46;
            if (var11.field2316 == -1 && var11.field2303 == null && !var11.field2283) {
                class40 var45 = var11.method959((class14) null, arg3, var24, var19, var16, var18, 122, 4, var17, var25, arg4);
                var46 = var45.field648;
            } else {
                var46 = new class139(arg2, 4, arg3, arg8, arg10, arg9, var11.field2316, var11.field2266, (class67) null);
            }
            class113.method811(arg0, arg10, arg9, var24, var46, (class67) null, class235.field4048[arg3], 0, 0, 0, var26);
        } else if (arg7 == 5) {
            int var47 = 16;
            long var48 = class23.method141(arg0, arg10, arg9);
            if (var48 != 0L) {
                var47 = class178.method1186((int) (var48 >>> 32) & Integer.MAX_VALUE, 0).field2278;
            }
            class67 var51;
            if (var11.field2316 == -1 && var11.field2303 == null && !var11.field2283) {
                class40 var50 = var11.method959((class14) null, arg3, var24, var19, var16, var18, -106, 4, var17, var25, arg4);
                var51 = var50.field648;
            } else {
                var51 = new class139(arg2, 4, arg3, arg8, arg10, arg9, var11.field2316, var11.field2266, (class67) null);
            }
            class113.method811(arg0, arg10, arg9, var24, var51, (class67) null, class235.field4048[arg3], 0, class129.field2145[arg3] * var47, class285.field5040[arg3] * var47, var26);
        } else if (arg7 == 6) {
            int var52 = 8;
            long var53 = class23.method141(arg0, arg10, arg9);
            if (var53 != 0L) {
                var52 = class178.method1186(Integer.MAX_VALUE & (int) (var53 >>> 32), 0).field2278 / 2;
            }
            class67 var56;
            if (var11.field2316 == -1 && var11.field2303 == null && !var11.field2283) {
                class40 var55 = var11.method959((class14) null, arg3 + 4, var24, var19, var16, var18, -104, 4, var17, var25, arg4);
                var56 = var55.field648;
            } else {
                var56 = new class139(arg2, 4, arg3 + 4, arg8, arg10, arg9, var11.field2316, var11.field2266, (class67) null);
            }
            class113.method811(arg0, arg10, arg9, var24, var56, (class67) null, 256, arg3, class25.field360[arg3] * var52, class47.field749[arg3] * var52, var26);
        } else if (arg7 == 7) {
            int var57 = arg3 + 2 & 0x3;
            class67 var59;
            if (var11.field2316 == -1 && var11.field2303 == null && !var11.field2283) {
                class40 var58 = var11.method959((class14) null, var57 + 4, var24, var19, var16, var18, arg6 + 32238, 4, var17, var25, arg4);
                var59 = var58.field648;
            } else {
                var59 = new class139(arg2, 4, var57 + 4, arg8, arg10, arg9, var11.field2316, var11.field2266, (class67) null);
            }
            class113.method811(arg0, arg10, arg9, var24, var59, (class67) null, 256, var57, 0, 0, var26);
        } else if (arg7 == 8) {
            int var60 = 8;
            long var61 = class23.method141(arg0, arg10, arg9);
            if (var61 != 0L) {
                var60 = class178.method1186(Integer.MAX_VALUE & (int) (var61 >>> 32), arg6 ^ 0xFFFF81F8).field2278 / 2;
            }
            int var63 = arg3 + 2 & 0x3;
            class67 var65;
            class67 var67;
            if (var11.field2316 == -1 && var11.field2303 == null && !var11.field2283) {
                class40 var64 = var11.method959((class14) null, arg3 + 4, var24, var19, var16, var18, 72, 4, var17, var25, arg4);
                var65 = var64.field648;
                class40 var66 = var11.method959((class14) null, var63 + 4, var24, var19, var16, var18, -128, 4, var17, var25, arg4);
                var67 = var66.field648;
            } else {
                var65 = new class139(arg2, 4, arg3 + 4, arg8, arg10, arg9, var11.field2316, var11.field2266, (class67) null);
                var67 = new class139(arg2, 4, var63 + 4, arg8, arg10, arg9, var11.field2316, var11.field2266, (class67) null);
            }
            class113.method811(arg0, arg10, arg9, var24, var65, var67, 256, arg3, class25.field360[arg3] * var60, class47.field749[arg3] * var60, var26);
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(IIII)V")
    public class71(int arg0, int arg1, int arg2, int arg3) {
        class56 var5 = class274.method1845(2, arg0);
        this.field1121 = arg3;
        this.field1123 = arg1;
        this.field1116 = arg2;
        if (var5.field913 == -1) {
            this.field1119 = var5;
        } else {
            this.field1119 = class274.method1845(2, var5.field913);
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lib;III)V")
    public class71(class56 arg0, int arg1, int arg2, int arg3) {
        this.field1116 = arg2;
        this.field1119 = arg0;
        this.field1123 = arg1;
        this.field1121 = arg3;
    }
}
