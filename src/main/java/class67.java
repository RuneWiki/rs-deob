import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class67 {

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public int field1041;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1039 = "glow2:";

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "[I")
    public static int[] field1049 = new int[32768];

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "[I")
    public static int[] field1045 = new int[2];

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Lve;")
    public static class233 field1040;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Lve;")
    public static class233 field1042;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static void method456(byte arg0) {
        field1042 = null;
        field1039 = null;
        field1040 = null;
        field1045 = null;
        int var1 = -96 % ((arg0 + 69) / 42);
        field1049 = null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
    public static final void method457(byte arg0) {
        class98.field1474 = new class97();
        field1046++;
        if (arg0 != 97) {
            field1042 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIZLqb;ZIIII)V")
    public static final void method458(int arg0, int arg1, int arg2, int arg3, boolean arg4, class86 arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        field1047++;
        if (arg6 && !class202.method1310(false) && (class189.field2684[0][arg0][arg1] & 0x2) == 0) {
            if ((class189.field2684[arg9][arg0][arg1] & 0x10) != 0) {
                return;
            }
            if (client.method1442((byte) -55, arg9, arg1, arg0) != class31.field456) {
                return;
            }
        }
        if (arg9 < class264.field3988) {
            class264.field3988 = arg9;
        }
        class250 var11 = class91.method618(122, arg8);
        int var12;
        int var13;
        if (arg2 == 1 || arg2 == 3) {
            var12 = var11.field3821;
            var13 = var11.field3808;
        } else {
            var12 = var11.field3808;
            var13 = var11.field3821;
        }
        int var14;
        int var15;
        if (arg1 + var12 > 104) {
            var14 = arg1;
            var15 = arg1 + 1;
        } else {
            var14 = (var12 >> 1) + arg1;
            var15 = (var12 + 1 >> 1) + arg1;
        }
        int[][] var16 = class107.field1556[arg10];
        int var17;
        int var18;
        if (arg0 + var13 <= 104) {
            var17 = (var13 >> 1) + arg0;
            var18 = arg0 + (var13 + 1 >> 1);
        } else {
            var18 = arg0 + 1;
            var17 = arg0;
        }
        int var19 = (arg0 << 7) + (var13 << 6);
        int var20 = var16[var17][var14] + var16[var18][var14] + var16[var18][var15] + var16[var17][var15] >> 2;
        int[][] var21 = null;
        if (arg4) {
            var21 = class176.field2502[0];
        } else if (arg10 < 3) {
            var21 = class107.field1556[arg10 + 1];
        }
        long var22 = (long) (arg2 | 0x400 << 20 | arg3 << 14 | arg0 | arg1 << 7);
        if (var11.field3764 == 0 || arg4) {
            var22 |= Long.MIN_VALUE;
        }
        if (var11.field3786 == 1) {
            var22 |= 0x400000L;
        }
        int var24 = (arg1 << 7) + (var12 << 6);
        if (var11.field3773) {
            var22 |= 0x80000000L;
        }
        long var25 = var22 | (long) arg8 << 32;
        if (var11.method1646((byte) -118)) {
            class276.method1861(var11, -91, (class53) null, arg1, arg2, arg9, arg0, (class72) null);
        }
        if (arg7 != 4) {
            field1043 = -89;
        }
        boolean var27 = !arg4 & var11.field3758;
        if (arg3 == 22) {
            if (class48.field695 || var11.field3764 != 0 || var11.field3820 == 1 || var11.field3747) {
                class219 var29;
                if (var11.field3761 == -1 && var11.field3817 == null && !var11.field3769) {
                    class110 var28 = var11.method1642(var16, arg2, var19, (class117) null, 22, var24, arg6, arg7 - 129, var21, var20, var27);
                    var29 = var28.field1586;
                } else {
                    var29 = new class26(arg8, 22, arg2, arg10, arg0, arg1, var11.field3761, var11.field3810, (class219) null);
                }
                class212.method1350(arg9, arg0, arg1, var20, var29, var25, var11.field3777);
                if (var11.field3820 == 1 && arg5 != null) {
                    arg5.method573(arg0, arg1, (byte) -96);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class219 var69;
            if (var11.field3761 == -1 && var11.field3817 == null && !var11.field3769) {
                class110 var68 = var11.method1642(var16, arg3 == 11 ? arg2 + 4 : arg2, var19, (class117) null, 10, var24, arg6, arg7 ^ 0xFFFFFF80, var21, var20, var27);
                var69 = var68.field1586;
            } else {
                var69 = new class26(arg8, 10, arg3 == 11 ? arg2 + 4 : arg2, arg10, arg0, arg1, var11.field3761, var11.field3810, (class219) null);
            }
            if (var69 != null) {
                boolean var70 = class245.method1605(arg9, arg0, arg1, var20, var13, var12, var69, 0, var25);
                if (var11.field3774 && var70 && arg6) {
                    int var71 = 15;
                    if (var69 instanceof class2) {
                        var71 = ((class2) var69).method25() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var12; var73++) {
                            if (var71 > class214.field3077[arg9][arg0 + var72][arg1 + var73]) {
                                class214.field3077[arg9][arg0 + var72][arg1 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field3820 != 0 && arg5 != null) {
                arg5.method578(-1, arg0, arg1, var12, var13, var11.field3754);
            }
        } else if (arg3 >= 12) {
            class219 var31;
            if (var11.field3761 == -1 && var11.field3817 == null && !var11.field3769) {
                class110 var30 = var11.method1642(var16, arg2, var19, (class117) null, arg3, var24, arg6, -125, var21, var20, var27);
                var31 = var30.field1586;
            } else {
                var31 = new class26(arg8, arg3, arg2, arg10, arg0, arg1, var11.field3761, var11.field3810, (class219) null);
            }
            class245.method1605(arg9, arg0, arg1, var20, 1, 1, var31, 0, var25);
            if (arg6 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg9 > 0) {
                class98.field1475[arg9][arg0][arg1] = class163.method1093(class98.field1475[arg9][arg0][arg1], 4);
            }
            if (var11.field3820 != 0 && arg5 != null) {
                arg5.method578(-1, arg0, arg1, var12, var13, var11.field3754);
            }
        } else if (arg3 == 0) {
            class219 var33;
            if (var11.field3761 == -1 && var11.field3817 == null && !var11.field3769) {
                class110 var32 = var11.method1642(var16, arg2, var19, (class117) null, 0, var24, arg6, -124, var21, var20, var27);
                var33 = var32.field1586;
            } else {
                var33 = new class26(arg8, 0, arg2, arg10, arg0, arg1, var11.field3761, var11.field3810, (class219) null);
            }
            class170.method1122(arg9, arg0, arg1, var20, var33, (class219) null, client.field3301[arg2], 0, var25);
            if (arg6) {
                if (arg2 == 0) {
                    if (var11.field3774) {
                        class214.field3077[arg9][arg0][arg1] = 50;
                        class214.field3077[arg9][arg0][arg1 + 1] = 50;
                    }
                    if (var11.field3785) {
                        class98.field1475[arg9][arg0][arg1] = class163.method1093(class98.field1475[arg9][arg0][arg1], 1);
                    }
                } else if (arg2 == 1) {
                    if (var11.field3774) {
                        class214.field3077[arg9][arg0][arg1 + 1] = 50;
                        class214.field3077[arg9][arg0 + 1][arg1 + 1] = 50;
                    }
                    if (var11.field3785) {
                        class98.field1475[arg9][arg0][arg1 + 1] = class163.method1093(class98.field1475[arg9][arg0][arg1 + 1], 2);
                    }
                } else if (arg2 == 2) {
                    if (var11.field3774) {
                        class214.field3077[arg9][arg0 + 1][arg1] = 50;
                        class214.field3077[arg9][arg0 + 1][arg1 + 1] = 50;
                    }
                    if (var11.field3785) {
                        class98.field1475[arg9][arg0 + 1][arg1] = class163.method1093(class98.field1475[arg9][arg0 + 1][arg1], 1);
                    }
                } else if (arg2 == 3) {
                    if (var11.field3774) {
                        class214.field3077[arg9][arg0][arg1] = 50;
                        class214.field3077[arg9][arg0 + 1][arg1] = 50;
                    }
                    if (var11.field3785) {
                        class98.field1475[arg9][arg0][arg1] = class163.method1093(class98.field1475[arg9][arg0][arg1], 2);
                    }
                }
            }
            if (var11.field3820 != 0 && arg5 != null) {
                arg5.method577(arg1, arg3, arg2, (byte) 52, var11.field3754, arg0);
            }
            if (var11.field3760 != 16) {
                class232.method1505(arg9, arg0, arg1, var11.field3760);
            }
        } else if (arg3 == 1) {
            class219 var35;
            if (var11.field3761 == -1 && var11.field3817 == null && !var11.field3769) {
                class110 var34 = var11.method1642(var16, arg2, var19, (class117) null, 1, var24, arg6, -127, var21, var20, var27);
                var35 = var34.field1586;
            } else {
                var35 = new class26(arg8, 1, arg2, arg10, arg0, arg1, var11.field3761, var11.field3810, (class219) null);
            }
            class170.method1122(arg9, arg0, arg1, var20, var35, (class219) null, class183.field2609[arg2], 0, var25);
            if (var11.field3774 && arg6) {
                if (arg2 == 0) {
                    class214.field3077[arg9][arg0][arg1 + 1] = 50;
                } else if (arg2 == 1) {
                    class214.field3077[arg9][arg0 + 1][arg1 + 1] = 50;
                } else if (arg2 == 2) {
                    class214.field3077[arg9][arg0 + 1][arg1] = 50;
                } else if (arg2 == 3) {
                    class214.field3077[arg9][arg0][arg1] = 50;
                }
            }
            if (var11.field3820 != 0 && arg5 != null) {
                arg5.method577(arg1, arg3, arg2, (byte) -117, var11.field3754, arg0);
            }
        } else if (arg3 == 2) {
            int var36 = arg2 + 1 & 0x3;
            class219 var38;
            class219 var40;
            if (var11.field3761 == -1 && var11.field3817 == null && !var11.field3769) {
                class110 var37 = var11.method1642(var16, arg2 + 4, var19, (class117) null, 2, var24, arg6, -125, var21, var20, var27);
                var38 = var37.field1586;
                class110 var39 = var11.method1642(var16, var36, var19, (class117) null, 2, var24, arg6, -126, var21, var20, var27);
                var40 = var39.field1586;
            } else {
                var38 = new class26(arg8, 2, arg2 + 4, arg10, arg0, arg1, var11.field3761, var11.field3810, (class219) null);
                var40 = new class26(arg8, 2, var36, arg10, arg0, arg1, var11.field3761, var11.field3810, (class219) null);
            }
            class170.method1122(arg9, arg0, arg1, var20, var38, var40, client.field3301[arg2], client.field3301[var36], var25);
            if (var11.field3785 && arg6) {
                if (arg2 == 0) {
                    class98.field1475[arg9][arg0][arg1] = class163.method1093(class98.field1475[arg9][arg0][arg1], 1);
                    class98.field1475[arg9][arg0][arg1 + 1] = class163.method1093(class98.field1475[arg9][arg0][arg1 + 1], 2);
                } else if (arg2 == 1) {
                    class98.field1475[arg9][arg0][arg1 + 1] = class163.method1093(class98.field1475[arg9][arg0][arg1 + 1], 2);
                    class98.field1475[arg9][arg0 + 1][arg1] = class163.method1093(class98.field1475[arg9][arg0 + 1][arg1], 1);
                } else if (arg2 == 2) {
                    class98.field1475[arg9][arg0 + 1][arg1] = class163.method1093(class98.field1475[arg9][arg0 + 1][arg1], 1);
                    class98.field1475[arg9][arg0][arg1] = class163.method1093(class98.field1475[arg9][arg0][arg1], 2);
                } else if (arg2 == 3) {
                    class98.field1475[arg9][arg0][arg1] = class163.method1093(class98.field1475[arg9][arg0][arg1], 2);
                    class98.field1475[arg9][arg0][arg1] = class163.method1093(class98.field1475[arg9][arg0][arg1], 1);
                }
            }
            if (var11.field3820 != 0 && arg5 != null) {
                arg5.method577(arg1, arg3, arg2, (byte) -86, var11.field3754, arg0);
            }
            if (var11.field3760 != 16) {
                class232.method1505(arg9, arg0, arg1, var11.field3760);
            }
        } else if (arg3 == 3) {
            class219 var42;
            if (var11.field3761 == -1 && var11.field3817 == null && !var11.field3769) {
                class110 var41 = var11.method1642(var16, arg2, var19, (class117) null, 3, var24, arg6, -127, var21, var20, var27);
                var42 = var41.field1586;
            } else {
                var42 = new class26(arg8, 3, arg2, arg10, arg0, arg1, var11.field3761, var11.field3810, (class219) null);
            }
            class170.method1122(arg9, arg0, arg1, var20, var42, (class219) null, class183.field2609[arg2], 0, var25);
            if (var11.field3774 && arg6) {
                if (arg2 == 0) {
                    class214.field3077[arg9][arg0][arg1 + 1] = 50;
                } else if (arg2 == 1) {
                    class214.field3077[arg9][arg0 + 1][arg1 + 1] = 50;
                } else if (arg2 == 2) {
                    class214.field3077[arg9][arg0 + 1][arg1] = 50;
                } else if (arg2 == 3) {
                    class214.field3077[arg9][arg0][arg1] = 50;
                }
            }
            if (var11.field3820 != 0 && arg5 != null) {
                arg5.method577(arg1, arg3, arg2, (byte) 39, var11.field3754, arg0);
            }
        } else if (arg3 == 9) {
            class219 var44;
            if (var11.field3761 == -1 && var11.field3817 == null && !var11.field3769) {
                class110 var43 = var11.method1642(var16, arg2, var19, (class117) null, arg3, var24, arg6, -125, var21, var20, var27);
                var44 = var43.field1586;
            } else {
                var44 = new class26(arg8, arg3, arg2, arg10, arg0, arg1, var11.field3761, var11.field3810, (class219) null);
            }
            class245.method1605(arg9, arg0, arg1, var20, 1, 1, var44, 0, var25);
            if (var11.field3820 != 0 && arg5 != null) {
                arg5.method578(arg7 - 5, arg0, arg1, var12, var13, var11.field3754);
            }
            if (var11.field3760 != 16) {
                class232.method1505(arg9, arg0, arg1, var11.field3760);
            }
        } else if (arg3 == 4) {
            class219 var46;
            if (var11.field3761 == -1 && var11.field3817 == null && !var11.field3769) {
                class110 var45 = var11.method1642(var16, arg2, var19, (class117) null, 4, var24, arg6, -126, var21, var20, var27);
                var46 = var45.field1586;
            } else {
                var46 = new class26(arg8, 4, arg2, arg10, arg0, arg1, var11.field3761, var11.field3810, (class219) null);
            }
            class64.method446(arg9, arg0, arg1, var20, var46, (class219) null, client.field3301[arg2], 0, 0, 0, var25);
        } else if (arg3 == 5) {
            int var47 = 16;
            long var48 = class155.method1052(arg9, arg0, arg1);
            if (var48 != 0L) {
                var47 = class91.method618(116, Integer.MAX_VALUE & (int) (var48 >>> 32)).field3760;
            }
            class219 var51;
            if (var11.field3761 == -1 && var11.field3817 == null && !var11.field3769) {
                class110 var50 = var11.method1642(var16, arg2, var19, (class117) null, 4, var24, arg6, -128, var21, var20, var27);
                var51 = var50.field1586;
            } else {
                var51 = new class26(arg8, 4, arg2, arg10, arg0, arg1, var11.field3761, var11.field3810, (class219) null);
            }
            class64.method446(arg9, arg0, arg1, var20, var51, (class219) null, client.field3301[arg2], 0, class12.field190[arg2] * var47, class229.field3440[arg2] * var47, var25);
        } else if (arg3 == 6) {
            long var52 = class155.method1052(arg9, arg0, arg1);
            int var54 = 8;
            if (var52 != 0L) {
                var54 = class91.method618(arg7 ^ 0x69, (int) (var52 >>> 32) & Integer.MAX_VALUE).field3760 / 2;
            }
            class219 var56;
            if (var11.field3761 == -1 && var11.field3817 == null && !var11.field3769) {
                class110 var55 = var11.method1642(var16, arg2 + 4, var19, (class117) null, 4, var24, arg6, -124, var21, var20, var27);
                var56 = var55.field1586;
            } else {
                var56 = new class26(arg8, 4, arg2 + 4, arg10, arg0, arg1, var11.field3761, var11.field3810, (class219) null);
            }
            class64.method446(arg9, arg0, arg1, var20, var56, (class219) null, 256, arg2, class183.field2616[arg2] * var54, class289.field4574[arg2] * var54, var25);
        } else if (arg3 == 7) {
            int var57 = arg2 + 2 & 0x3;
            class219 var59;
            if (var11.field3761 == -1 && var11.field3817 == null && !var11.field3769) {
                class110 var58 = var11.method1642(var16, var57 + 4, var19, (class117) null, 4, var24, arg6, -128, var21, var20, var27);
                var59 = var58.field1586;
            } else {
                var59 = new class26(arg8, 4, var57 + 4, arg10, arg0, arg1, var11.field3761, var11.field3810, (class219) null);
            }
            class64.method446(arg9, arg0, arg1, var20, var59, (class219) null, 256, var57, 0, 0, var25);
        } else if (arg3 == 8) {
            int var60 = 8;
            long var61 = class155.method1052(arg9, arg0, arg1);
            int var63 = arg2 + 2 & 0x3;
            if (var61 != 0L) {
                var60 = class91.method618(112, (int) (var61 >>> 32) & Integer.MAX_VALUE).field3760 / 2;
            }
            class219 var65;
            class219 var67;
            if (var11.field3761 == -1 && var11.field3817 == null && !var11.field3769) {
                class110 var64 = var11.method1642(var16, arg2 + 4, var19, (class117) null, 4, var24, arg6, arg7 - 128, var21, var20, var27);
                var65 = var64.field1586;
                class110 var66 = var11.method1642(var16, var63 + 4, var19, (class117) null, 4, var24, arg6, -126, var21, var20, var27);
                var67 = var66.field1586;
            } else {
                var65 = new class26(arg8, 4, arg2 + 4, arg10, arg0, arg1, var11.field3761, var11.field3810, (class219) null);
                var67 = new class26(arg8, 4, var63 + 4, arg10, arg0, arg1, var11.field3761, var11.field3810, (class219) null);
            }
            class64.method446(arg9, arg0, arg1, var20, var65, var67, 256, arg2, class183.field2616[arg2] * var60, class289.field4574[arg2] * var60, var25);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILrg;)V")
    public static final void method459(int arg0, class81 arg1) {
        field1051++;
        if (arg0 == -1) {
            class217.field3210 = arg1;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class67() {
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lwd;)V")
    public class67(class67 arg0) {
        this.field1041 = arg0.field1041;
        this.field1053 = arg0.field1053;
        this.field1052 = arg0.field1052;
        this.field1038 = arg0.field1038;
    }
}
