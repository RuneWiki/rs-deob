import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class177 {

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field2593 = 0;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field2598 = 0;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field2599 = 0;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "Z")
    public static boolean field2603 = false;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "Lhl;")
    public static class139 field2591 = new class139(50);

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "[Lwh;")
    public static class289[] field2592;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIILjk;)V")
    public static final void method1168(int arg0, int arg1, int arg2, class297 arg3) {
        field2600++;
        if (arg1 >= -88) {
            field2591 = null;
        }
        if (class223.field3464 != null || class66.field1093 || arg3 == null || class87.method664(arg3, (byte) 109) == null) {
            return;
        }
        class223.field3464 = arg3;
        class260.field3988 = class87.method664(arg3, (byte) 98);
        class287.field4394 = arg0;
        class190.field2887 = false;
        class8.field92 = 0;
        class234.field3609 = arg2;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZIZIIIZIIILql;)V")
    public static final void method1169(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, class78 arg10) {
        field2601++;
        if (arg2 && !class101.method741(-6425) && (class247.field3844[0][arg5][arg3] & 0x2) == 0) {
            if ((class247.field3844[arg8][arg5][arg3] & 0x10) != 0) {
                return;
            }
            if (class190.method1269(false, arg8, arg5, arg3) != class51.field832) {
                return;
            }
        }
        if (arg8 < class133.field1953) {
            class133.field1953 = arg8;
        }
        class188 var11 = class3.method42(-116, arg1);
        int var12;
        int var13;
        if (arg4 == 1 || arg4 == 3) {
            var12 = var11.field2757;
            var13 = var11.field2805;
        } else {
            var12 = var11.field2805;
            var13 = var11.field2757;
        }
        int var14;
        int var15;
        if (arg5 + var13 > 104) {
            var14 = arg5;
            var15 = arg5 + 1;
        } else {
            var14 = (var13 >> 1) + arg5;
            var15 = (var13 + 1 >> 1) + arg5;
        }
        int var16;
        int var17;
        if (arg3 + var12 > 104) {
            var16 = arg3;
            var17 = arg3 + 1;
        } else {
            var16 = (var12 >> 1) + arg3;
            var17 = arg3 + (var12 + 1 >> 1);
        }
        int[][] var18 = class166.field2451[arg9];
        int var19 = var18[var14][var16] + var18[var15][var17] + var18[var14][var17] + var18[var15][var16] >> 2;
        int var20 = (arg5 << 7) + (var13 << 6);
        int var21 = (arg3 << 7) + (var12 << 6);
        int[][] var22 = null;
        if (arg6) {
            var22 = class287.field4389[0];
        } else if (arg9 < 3) {
            var22 = class166.field2451[arg9 + 1];
        }
        long var23 = (long) (arg7 | 0x10000 << 14 | arg3 << 7 | arg5 | arg4 << 20);
        if (var11.field2759 == 0 || arg6) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field2745 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field2796) {
            var23 |= 0x80000000L;
        }
        long var25 = var23 | (long) arg1 << 32;
        if (var11.method1245(0)) {
            class102.method744(arg8, arg5, (class224) null, arg4, arg3, (class87) null, 8, var11);
        }
        boolean var27 = !arg6 & var11.field2741;
        int var28 = var11.field2801;
        if (arg7 == 22) {
            if (class127.field1867 || var11.field2759 != 0 || var11.field2785 == 1 || var11.field2800) {
                class264 var30;
                if (var28 == -1 && var11.field2804 == null && !var11.field2743) {
                    class122 var29 = var11.method1243(var19, 22, var18, var27, var22, arg4, arg2, 768, var20, var21, (class46) null);
                    var30 = var29.field1811;
                } else {
                    var30 = new class109(arg1, 22, arg4, arg9, arg5, arg3, var28, var11.field2784, (class264) null);
                }
                class210.method1381(arg8, arg5, arg3, var19, var30, var25, var11.field2783);
                if (var11.field2785 == 1 && arg10 != null) {
                    arg10.method624(arg5, arg3, 1);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class264 var70;
            if (var28 == -1 && var11.field2804 == null && !var11.field2743) {
                class122 var69 = var11.method1243(var19, 10, var18, var27, var22, arg7 == 11 ? arg4 + 4 : arg4, arg2, 768, var20, var21, (class46) null);
                var70 = var69.field1811;
            } else {
                var70 = new class109(arg1, 10, arg7 == 11 ? arg4 + 4 : arg4, arg9, arg5, arg3, var28, var11.field2784, (class264) null);
            }
            if (var70 != null) {
                boolean var71 = class218.method1466(arg8, arg5, arg3, var19, var13, var12, var70, 0, var25);
                if (var11.field2772 && var71 && arg2) {
                    int var72 = 15;
                    if (var70 instanceof class2) {
                        var72 = ((class2) var70).method30() / 4;
                        if (var72 > 30) {
                            var72 = 30;
                        }
                    }
                    for (int var73 = 0; var73 <= var13; var73++) {
                        for (int var74 = 0; var74 <= var12; var74++) {
                            if (var72 > class51.field834[arg8][arg5 + var73][arg3 + var74]) {
                                class51.field834[arg8][arg5 + var73][arg3 + var74] = (byte) var72;
                            }
                        }
                    }
                }
            }
            if (var11.field2785 != 0 && arg10 != null) {
                arg10.method616(var12, var11.field2730, true, var13, arg5, !var11.field2781, arg3);
            }
        } else if (arg7 >= 12) {
            class264 var32;
            if (var28 == -1 && var11.field2804 == null && !var11.field2743) {
                class122 var31 = var11.method1243(var19, arg7, var18, var27, var22, arg4, arg2, 768, var20, var21, (class46) null);
                var32 = var31.field1811;
            } else {
                var32 = new class109(arg1, arg7, arg4, arg9, arg5, arg3, var28, var11.field2784, (class264) null);
            }
            class218.method1466(arg8, arg5, arg3, var19, 1, 1, var32, 0, var25);
            if (arg2 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg8 > 0 && var11.field2771 != 0) {
                class265.field4136[arg8][arg5][arg3] = class186.method1215(class265.field4136[arg8][arg5][arg3], 4);
            }
            if (var11.field2785 != 0 && arg10 != null) {
                arg10.method616(var12, var11.field2730, arg0, var13, arg5, !var11.field2781, arg3);
            }
        } else if (arg7 == 0) {
            class264 var34;
            if (var28 == -1 && var11.field2804 == null && !var11.field2743) {
                class122 var33 = var11.method1243(var19, 0, var18, var27, var22, arg4, arg2, 768, var20, var21, (class46) null);
                var34 = var33.field1811;
            } else {
                var34 = new class109(arg1, 0, arg4, arg9, arg5, arg3, var28, var11.field2784, (class264) null);
            }
            class105.method766(arg8, arg5, arg3, var19, var34, (class264) null, class106.field1569[arg4], 0, var25);
            if (arg2) {
                if (arg4 == 0) {
                    if (var11.field2772) {
                        class51.field834[arg8][arg5][arg3] = 50;
                        class51.field834[arg8][arg5][arg3 + 1] = 50;
                    }
                    if (var11.field2771 == 1) {
                        class265.field4136[arg8][arg5][arg3] = class186.method1215(class265.field4136[arg8][arg5][arg3], 1);
                    }
                } else if (arg4 == 1) {
                    if (var11.field2772) {
                        class51.field834[arg8][arg5][arg3 + 1] = 50;
                        class51.field834[arg8][arg5 + 1][arg3 + 1] = 50;
                    }
                    if (var11.field2771 == 1) {
                        class265.field4136[arg8][arg5][arg3 + 1] = class186.method1215(class265.field4136[arg8][arg5][arg3 + 1], 2);
                    }
                } else if (arg4 == 2) {
                    if (var11.field2772) {
                        class51.field834[arg8][arg5 + 1][arg3] = 50;
                        class51.field834[arg8][arg5 + 1][arg3 + 1] = 50;
                    }
                    if (var11.field2771 == 1) {
                        class265.field4136[arg8][arg5 + 1][arg3] = class186.method1215(class265.field4136[arg8][arg5 + 1][arg3], 1);
                    }
                } else if (arg4 == 3) {
                    if (var11.field2772) {
                        class51.field834[arg8][arg5][arg3] = 50;
                        class51.field834[arg8][arg5 + 1][arg3] = 50;
                    }
                    if (var11.field2771 == 1) {
                        class265.field4136[arg8][arg5][arg3] = class186.method1215(class265.field4136[arg8][arg5][arg3], 2);
                    }
                }
            }
            if (var11.field2785 != 0 && arg10 != null) {
                arg10.method626(arg7, var11.field2730, 5623, arg3, arg4, !var11.field2781, arg5);
            }
            if (var11.field2749 != 16) {
                class155.method1050(arg8, arg5, arg3, var11.field2749);
            }
        } else if (arg7 == 1) {
            class264 var36;
            if (var28 == -1 && var11.field2804 == null && !var11.field2743) {
                class122 var35 = var11.method1243(var19, 1, var18, var27, var22, arg4, arg2, 768, var20, var21, (class46) null);
                var36 = var35.field1811;
            } else {
                var36 = new class109(arg1, 1, arg4, arg9, arg5, arg3, var28, var11.field2784, (class264) null);
            }
            class105.method766(arg8, arg5, arg3, var19, var36, (class264) null, class260.field3994[arg4], 0, var25);
            if (var11.field2772 && arg2) {
                if (arg4 == 0) {
                    class51.field834[arg8][arg5][arg3 + 1] = 50;
                } else if (arg4 == 1) {
                    class51.field834[arg8][arg5 + 1][arg3 + 1] = 50;
                } else if (arg4 == 2) {
                    class51.field834[arg8][arg5 + 1][arg3] = 50;
                } else if (arg4 == 3) {
                    class51.field834[arg8][arg5][arg3] = 50;
                }
            }
            if (var11.field2785 != 0 && arg10 != null) {
                arg10.method626(arg7, var11.field2730, 5623, arg3, arg4, !var11.field2781, arg5);
            }
        } else if (arg7 == 2) {
            int var37 = arg4 + 1 & 0x3;
            class264 var39;
            class264 var41;
            if (var28 == -1 && var11.field2804 == null && !var11.field2743) {
                class122 var38 = var11.method1243(var19, 2, var18, var27, var22, arg4 + 4, arg2, 768, var20, var21, (class46) null);
                var39 = var38.field1811;
                class122 var40 = var11.method1243(var19, 2, var18, var27, var22, var37, arg2, 768, var20, var21, (class46) null);
                var41 = var40.field1811;
            } else {
                var39 = new class109(arg1, 2, arg4 + 4, arg9, arg5, arg3, var28, var11.field2784, (class264) null);
                var41 = new class109(arg1, 2, var37, arg9, arg5, arg3, var28, var11.field2784, (class264) null);
            }
            class105.method766(arg8, arg5, arg3, var19, var39, var41, class106.field1569[arg4], class106.field1569[var37], var25);
            if (var11.field2771 == 1 && arg2) {
                if (arg4 == 0) {
                    class265.field4136[arg8][arg5][arg3] = class186.method1215(class265.field4136[arg8][arg5][arg3], 1);
                    class265.field4136[arg8][arg5][arg3 + 1] = class186.method1215(class265.field4136[arg8][arg5][arg3 + 1], 2);
                } else if (arg4 == 1) {
                    class265.field4136[arg8][arg5][arg3 + 1] = class186.method1215(class265.field4136[arg8][arg5][arg3 + 1], 2);
                    class265.field4136[arg8][arg5 + 1][arg3] = class186.method1215(class265.field4136[arg8][arg5 + 1][arg3], 1);
                } else if (arg4 == 2) {
                    class265.field4136[arg8][arg5 + 1][arg3] = class186.method1215(class265.field4136[arg8][arg5 + 1][arg3], 1);
                    class265.field4136[arg8][arg5][arg3] = class186.method1215(class265.field4136[arg8][arg5][arg3], 2);
                } else if (arg4 == 3) {
                    class265.field4136[arg8][arg5][arg3] = class186.method1215(class265.field4136[arg8][arg5][arg3], 2);
                    class265.field4136[arg8][arg5][arg3] = class186.method1215(class265.field4136[arg8][arg5][arg3], 1);
                }
            }
            if (var11.field2785 != 0 && arg10 != null) {
                arg10.method626(arg7, var11.field2730, 5623, arg3, arg4, !var11.field2781, arg5);
            }
            if (var11.field2749 != 16) {
                class155.method1050(arg8, arg5, arg3, var11.field2749);
            }
        } else if (arg7 == 3) {
            class264 var43;
            if (var28 == -1 && var11.field2804 == null && !var11.field2743) {
                class122 var42 = var11.method1243(var19, 3, var18, var27, var22, arg4, arg2, 768, var20, var21, (class46) null);
                var43 = var42.field1811;
            } else {
                var43 = new class109(arg1, 3, arg4, arg9, arg5, arg3, var28, var11.field2784, (class264) null);
            }
            class105.method766(arg8, arg5, arg3, var19, var43, (class264) null, class260.field3994[arg4], 0, var25);
            if (var11.field2772 && arg2) {
                if (arg4 == 0) {
                    class51.field834[arg8][arg5][arg3 + 1] = 50;
                } else if (arg4 == 1) {
                    class51.field834[arg8][arg5 + 1][arg3 + 1] = 50;
                } else if (arg4 == 2) {
                    class51.field834[arg8][arg5 + 1][arg3] = 50;
                } else if (arg4 == 3) {
                    class51.field834[arg8][arg5][arg3] = 50;
                }
            }
            if (var11.field2785 != 0 && arg10 != null) {
                arg10.method626(arg7, var11.field2730, 5623, arg3, arg4, !var11.field2781, arg5);
            }
        } else if (arg7 == 9) {
            class264 var45;
            if (var28 == -1 && var11.field2804 == null && !var11.field2743) {
                class122 var44 = var11.method1243(var19, arg7, var18, var27, var22, arg4, arg2, 768, var20, var21, (class46) null);
                var45 = var44.field1811;
            } else {
                var45 = new class109(arg1, arg7, arg4, arg9, arg5, arg3, var28, var11.field2784, (class264) null);
            }
            class218.method1466(arg8, arg5, arg3, var19, 1, 1, var45, 0, var25);
            if (var11.field2785 != 0 && arg10 != null) {
                arg10.method616(var12, var11.field2730, true, var13, arg5, !var11.field2781, arg3);
            }
            if (var11.field2749 != 16) {
                class155.method1050(arg8, arg5, arg3, var11.field2749);
            }
        } else if (arg7 == 4) {
            class264 var47;
            if (var28 == -1 && var11.field2804 == null && !var11.field2743) {
                class122 var46 = var11.method1243(var19, 4, var18, var27, var22, arg4, arg2, 768, var20, var21, (class46) null);
                var47 = var46.field1811;
            } else {
                var47 = new class109(arg1, 4, arg4, arg9, arg5, arg3, var28, var11.field2784, (class264) null);
            }
            class190.method1273(arg8, arg5, arg3, var19, var47, (class264) null, class106.field1569[arg4], 0, 0, 0, var25);
        } else {
            if (!arg0) {
                field2598 = -47;
            }
            if (arg7 == 5) {
                long var48 = class236.method1596(arg8, arg5, arg3);
                int var50 = 16;
                if (var48 != 0L) {
                    var50 = class3.method42(67, (int) (var48 >>> 32) & Integer.MAX_VALUE).field2749;
                }
                class264 var52;
                if (var28 == -1 && var11.field2804 == null && !var11.field2743) {
                    class122 var51 = var11.method1243(var19, 4, var18, var27, var22, arg4, arg2, 768, var20, var21, (class46) null);
                    var52 = var51.field1811;
                } else {
                    var52 = new class109(arg1, 4, arg4, arg9, arg5, arg3, var28, var11.field2784, (class264) null);
                }
                class190.method1273(arg8, arg5, arg3, var19, var52, (class264) null, class106.field1569[arg4], 0, class259.field3981[arg4] * var50, class178.field2611[arg4] * var50, var25);
            } else if (arg7 == 6) {
                int var53 = 8;
                long var54 = class236.method1596(arg8, arg5, arg3);
                if (var54 != 0L) {
                    var53 = class3.method42(10, Integer.MAX_VALUE & (int) (var54 >>> 32)).field2749 / 2;
                }
                class264 var57;
                if (var28 == -1 && var11.field2804 == null && !var11.field2743) {
                    class122 var56 = var11.method1243(var19, 4, var18, var27, var22, arg4 + 4, arg2, 768, var20, var21, (class46) null);
                    var57 = var56.field1811;
                } else {
                    var57 = new class109(arg1, 4, arg4 + 4, arg9, arg5, arg3, var28, var11.field2784, (class264) null);
                }
                class190.method1273(arg8, arg5, arg3, var19, var57, (class264) null, 256, arg4, class240.field3736[arg4] * var53, class269.field4203[arg4] * var53, var25);
            } else if (arg7 == 7) {
                int var58 = arg4 + 2 & 0x3;
                class264 var60;
                if (var28 == -1 && var11.field2804 == null && !var11.field2743) {
                    class122 var59 = var11.method1243(var19, 4, var18, var27, var22, var58 + 4, arg2, 768, var20, var21, (class46) null);
                    var60 = var59.field1811;
                } else {
                    var60 = new class109(arg1, 4, var58 + 4, arg9, arg5, arg3, var28, var11.field2784, (class264) null);
                }
                class190.method1273(arg8, arg5, arg3, var19, var60, (class264) null, 256, var58, 0, 0, var25);
            } else if (arg7 == 8) {
                int var61 = 8;
                long var62 = class236.method1596(arg8, arg5, arg3);
                if (var62 != 0L) {
                    var61 = class3.method42(108, Integer.MAX_VALUE & (int) (var62 >>> 32)).field2749 / 2;
                }
                int var64 = arg4 + 2 & 0x3;
                class264 var66;
                class264 var68;
                if (var28 == -1 && var11.field2804 == null && !var11.field2743) {
                    class122 var65 = var11.method1243(var19, 4, var18, var27, var22, arg4 + 4, arg2, 768, var20, var21, (class46) null);
                    var66 = var65.field1811;
                    class122 var67 = var11.method1243(var19, 4, var18, var27, var22, var64 + 4, arg2, 768, var20, var21, (class46) null);
                    var68 = var67.field1811;
                } else {
                    var66 = new class109(arg1, 4, arg4 + 4, arg9, arg5, arg3, var28, var11.field2784, (class264) null);
                    var68 = new class109(arg1, 4, var64 + 4, arg9, arg5, arg3, var28, var11.field2784, (class264) null);
                }
                class190.method1273(arg8, arg5, arg3, var19, var66, var68, 256, arg4, class240.field3736[arg4] * var61, class269.field4203[arg4] * var61, var25);
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public static void method1170(byte arg0) {
        int var1 = 99 / ((arg0 + 51) / 57);
        field2592 = null;
        field2591 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1171(Component arg0, int arg1) {
        field2597++;
        arg0.removeKeyListener(class156.field2281);
        arg0.removeFocusListener(class156.field2281);
        class211.field3149 = arg1;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1172(int arg0, String[] arg1) {
        field2596++;
        String[] var2 = new String[5];
        if (arg0 != -6) {
            method1170((byte) 116);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }
}
