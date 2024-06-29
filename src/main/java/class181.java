import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class181 extends class221 {

    @OriginalMember(owner = "client!pb", name = "Y", descriptor = "Ljava/lang/Object;")
    private Object field2942;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "Lok;")
    public static class41 field2928 = class137.method956("lila:", 45);

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "I")
    public static int field2930 = 1;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "Lok;")
    public static class41 field2933 = class137.method956("Verbindung abgebrochen)3", 45);

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "Lok;")
    public static class41 field2938 = class137.method956("Musik)2Engine vorbereitet)3", 45);

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!pb", name = "X", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "Lmh;")
    public static class65 field2937;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILue;IIIBZZII)V", line = 6)
    public static final void method1295(int arg0, int arg1, class223 arg2, int arg3, int arg4, int arg5, byte arg6, boolean arg7, boolean arg8, int arg9, int arg10) {
        field2939++;
        if (arg8 && !class75.method553(23987) && (class126.field1879[0][arg4][arg0] & 0x2) == 0) {
            if ((class126.field1879[arg3][arg4][arg0] & 0x10) != 0) {
                return;
            }
            if (class251.method1776(arg4, arg3, true, arg0) != class5.field58) {
                return;
            }
        }
        if (arg3 < class36.field539) {
            class36.field539 = arg3;
        }
        class171 var11 = class234.method1684(-2441, arg10);
        if (class166.field2625 && var11.field2782) {
            return;
        }
        int var12;
        int var13;
        if (arg9 == 1 || arg9 == 3) {
            var13 = var11.field2752;
            var12 = var11.field2784;
        } else {
            var12 = var11.field2752;
            var13 = var11.field2784;
        }
        int var14;
        int var15;
        if (arg4 + var12 <= 104) {
            var14 = (var12 + 1 >> 1) + arg4;
            var15 = (var12 >> 1) + arg4;
        } else {
            var15 = arg4;
            var14 = arg4 + 1;
        }
        int var16;
        int var17;
        if (arg0 + var13 > 104) {
            var16 = arg0;
            var17 = arg0 + 1;
        } else {
            var16 = (var13 >> 1) + arg0;
            var17 = arg0 + (var13 + 1 >> 1);
        }
        int var18 = (arg4 << 7) + (var12 << 6);
        int[][] var19 = class278.field4548[arg5];
        if (arg6 != -120) {
            field2930 = 28;
        }
        int var20 = var19[var15][var16] - (-var19[var15][var17] - var19[var14][var17] - var19[var14][var16]) >> 2;
        int var21 = 0;
        int var22 = (arg0 << 7) + (var13 << 6);
        if (class166.field2625 && arg5 != 0) {
            int[][] var23 = class278.field4548[0];
            var21 = var20 - (var23[var14][var16] + var23[var14][var17] + var23[var15][var16] + var23[var15][var17] >> 2);
        }
        int[][] var24 = (int[][]) null;
        if (arg7) {
            var24 = class214.field3443[0];
        } else if (arg5 < 3) {
            var24 = class278.field4548[arg5 + 1];
        }
        long var25 = (long) (arg9 | 0x400 << 20 | arg1 << 14 | arg0 << 7 | arg4);
        if (var11.field2725 == 0 || arg7) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field2788 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field2789) {
            var25 |= 0x80000000L;
        }
        if (var11.method1219(true)) {
            class74.method546(arg3, arg6 ^ 0xFFFFEA3F, var11, (class50) null, arg9, arg0, arg4, (class245) null);
        }
        long var27 = var25 | (long) arg10 << 32;
        boolean var29 = !arg7 & var11.field2781;
        if (arg1 == 22) {
            if (class296.field4778 || var11.field2725 != 0 || var11.field2771 == 1 || var11.field2750) {
                class126 var77;
                if (var11.field2743 == -1 && var11.field2745 == null) {
                    class175 var76 = var11.method1231((class279) null, arg8, arg9, var19, var22, var29, 3778, var18, var20, var24, 22);
                    if (class166.field2625 && var29) {
                        class263.method1852(var76.field2840, var18, var21, var22);
                    }
                    var77 = var76.field2846;
                } else {
                    var77 = new class272(arg10, 22, arg9, arg5, arg4, arg0, var11.field2743, var11.field2729, (class126) null);
                }
                class134.method942(arg3, arg4, arg0, var20, var77, var27, var11.field2724);
                if (var11.field2771 == 1 && arg2 != null) {
                    arg2.method1595(arg0, 19550, arg4);
                }
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class126 var71;
            if (var11.field2743 == -1 && var11.field2745 == null) {
                class175 var70 = var11.method1231((class279) null, arg8, arg1 == 11 ? arg9 + 4 : arg9, var19, var22, var29, arg6 + 3898, var18, var20, var24, 10);
                if (class166.field2625 && var29) {
                    class263.method1852(var70.field2840, var18, var21, var22);
                }
                var71 = var70.field2846;
            } else {
                var71 = new class272(arg10, 10, arg1 == 11 ? arg9 + 4 : arg9, arg5, arg4, arg0, var11.field2743, var11.field2729, (class126) null);
            }
            if (var71 != null) {
                boolean var72 = class50.method353(arg3, arg4, arg0, var20, var12, var13, var71, 0, var27);
                if (var11.field2730 && var72 && arg8) {
                    int var73 = 15;
                    if (var71 instanceof class287) {
                        var73 = ((class287) var71).method124() / 4;
                        if (var73 > 30) {
                            var73 = 30;
                        }
                    }
                    for (int var74 = 0; var74 <= var12; var74++) {
                        for (int var75 = 0; var75 <= var13; var75++) {
                            if (class314.field5301[arg3][arg4 + var74][arg0 + var75] < var73) {
                                class314.field5301[arg3][arg4 + var74][arg0 + var75] = (byte) var73;
                            }
                        }
                    }
                }
            }
            if (var11.field2771 != 0 && arg2 != null) {
                arg2.method1599(var11.field2727, arg0, (byte) 85, arg4, var12, var13);
            }
        } else if (arg1 >= 12) {
            class126 var31;
            if (var11.field2743 == -1 && var11.field2745 == null) {
                class175 var30 = var11.method1231((class279) null, arg8, arg9, var19, var22, var29, 3778, var18, var20, var24, arg1);
                if (class166.field2625 && var29) {
                    class263.method1852(var30.field2840, var18, var21, var22);
                }
                var31 = var30.field2846;
            } else {
                var31 = new class272(arg10, arg1, arg9, arg5, arg4, arg0, var11.field2743, var11.field2729, (class126) null);
            }
            class50.method353(arg3, arg4, arg0, var20, 1, 1, var31, 0, var27);
            if (arg8 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg3 > 0) {
                class57.field819[arg3][arg4][arg0] = class255.method1813(class57.field819[arg3][arg4][arg0], 4);
            }
            if (var11.field2771 != 0 && arg2 != null) {
                arg2.method1599(var11.field2727, arg0, (byte) 93, arg4, var12, var13);
            }
        } else if (arg1 == 0) {
            class126 var69;
            if (var11.field2743 == -1 && var11.field2745 == null) {
                class175 var68 = var11.method1231((class279) null, arg8, arg9, var19, var22, var29, 3778, var18, var20, var24, 0);
                if (class166.field2625 && var29) {
                    class263.method1852(var68.field2840, var18, var21, var22);
                }
                var69 = var68.field2846;
            } else {
                var69 = new class272(arg10, 0, arg9, arg5, arg4, arg0, var11.field2743, var11.field2729, (class126) null);
            }
            class297.method2046(arg3, arg4, arg0, var20, var69, (class126) null, class93.field1370[arg9], 0, var27);
            if (arg8) {
                if (arg9 == 0) {
                    if (var11.field2730) {
                        class314.field5301[arg3][arg4][arg0] = 50;
                        class314.field5301[arg3][arg4][arg0 + 1] = 50;
                    }
                    if (var11.field2770) {
                        class57.field819[arg3][arg4][arg0] = class255.method1813(class57.field819[arg3][arg4][arg0], 1);
                    }
                } else if (arg9 == 1) {
                    if (var11.field2730) {
                        class314.field5301[arg3][arg4][arg0 + 1] = 50;
                        class314.field5301[arg3][arg4 + 1][arg0 + 1] = 50;
                    }
                    if (var11.field2770) {
                        class57.field819[arg3][arg4][arg0 + 1] = class255.method1813(class57.field819[arg3][arg4][arg0 + 1], 2);
                    }
                } else if (arg9 == 2) {
                    if (var11.field2730) {
                        class314.field5301[arg3][arg4 + 1][arg0] = 50;
                        class314.field5301[arg3][arg4 + 1][arg0 + 1] = 50;
                    }
                    if (var11.field2770) {
                        class57.field819[arg3][arg4 + 1][arg0] = class255.method1813(class57.field819[arg3][arg4 + 1][arg0], 1);
                    }
                } else if (arg9 == 3) {
                    if (var11.field2730) {
                        class314.field5301[arg3][arg4][arg0] = 50;
                        class314.field5301[arg3][arg4 + 1][arg0] = 50;
                    }
                    if (var11.field2770) {
                        class57.field819[arg3][arg4][arg0] = class255.method1813(class57.field819[arg3][arg4][arg0], 2);
                    }
                }
            }
            if (var11.field2771 != 0 && arg2 != null) {
                arg2.method1596(arg4, arg1, -95, arg9, arg0, var11.field2727);
            }
            if (var11.field2741 != 16) {
                class65.method480(arg3, arg4, arg0, var11.field2741);
            }
        } else if (arg1 == 1) {
            class126 var33;
            if (var11.field2743 == -1 && var11.field2745 == null) {
                class175 var32 = var11.method1231((class279) null, arg8, arg9, var19, var22, var29, 3778, var18, var20, var24, 1);
                if (class166.field2625 && var29) {
                    class263.method1852(var32.field2840, var18, var21, var22);
                }
                var33 = var32.field2846;
            } else {
                var33 = new class272(arg10, 1, arg9, arg5, arg4, arg0, var11.field2743, var11.field2729, (class126) null);
            }
            class297.method2046(arg3, arg4, arg0, var20, var33, (class126) null, class316.field5331[arg9], 0, var27);
            if (var11.field2730 && arg8) {
                if (arg9 == 0) {
                    class314.field5301[arg3][arg4][arg0 + 1] = 50;
                } else if (arg9 == 1) {
                    class314.field5301[arg3][arg4 + 1][arg0 + 1] = 50;
                } else if (arg9 == 2) {
                    class314.field5301[arg3][arg4 + 1][arg0] = 50;
                } else if (arg9 == 3) {
                    class314.field5301[arg3][arg4][arg0] = 50;
                }
            }
            if (var11.field2771 != 0 && arg2 != null) {
                arg2.method1596(arg4, arg1, arg6 + 2, arg9, arg0, var11.field2727);
            }
        } else if (arg1 == 2) {
            int var63 = arg9 + 1 & 0x3;
            class126 var65;
            class126 var67;
            if (var11.field2743 == -1 && var11.field2745 == null) {
                class175 var64 = var11.method1231((class279) null, arg8, arg9 + 4, var19, var22, var29, arg6 + 3898, var18, var20, var24, 2);
                if (class166.field2625 && var29) {
                    class263.method1852(var64.field2840, var18, var21, var22);
                }
                var65 = var64.field2846;
                class175 var66 = var11.method1231((class279) null, arg8, var63, var19, var22, var29, 3778, var18, var20, var24, 2);
                if (class166.field2625 && var29) {
                    class263.method1852(var66.field2840, var18, var21, var22);
                }
                var67 = var66.field2846;
            } else {
                var65 = new class272(arg10, 2, arg9 + 4, arg5, arg4, arg0, var11.field2743, var11.field2729, (class126) null);
                var67 = new class272(arg10, 2, var63, arg5, arg4, arg0, var11.field2743, var11.field2729, (class126) null);
            }
            class297.method2046(arg3, arg4, arg0, var20, var65, var67, class93.field1370[arg9], class93.field1370[var63], var27);
            if (var11.field2770 && arg8) {
                if (arg9 == 0) {
                    class57.field819[arg3][arg4][arg0] = class255.method1813(class57.field819[arg3][arg4][arg0], 1);
                    class57.field819[arg3][arg4][arg0 + 1] = class255.method1813(class57.field819[arg3][arg4][arg0 + 1], 2);
                } else if (arg9 == 1) {
                    class57.field819[arg3][arg4][arg0 + 1] = class255.method1813(class57.field819[arg3][arg4][arg0 + 1], 2);
                    class57.field819[arg3][arg4 + 1][arg0] = class255.method1813(class57.field819[arg3][arg4 + 1][arg0], 1);
                } else if (arg9 == 2) {
                    class57.field819[arg3][arg4 + 1][arg0] = class255.method1813(class57.field819[arg3][arg4 + 1][arg0], 1);
                    class57.field819[arg3][arg4][arg0] = class255.method1813(class57.field819[arg3][arg4][arg0], 2);
                } else if (arg9 == 3) {
                    class57.field819[arg3][arg4][arg0] = class255.method1813(class57.field819[arg3][arg4][arg0], 2);
                    class57.field819[arg3][arg4][arg0] = class255.method1813(class57.field819[arg3][arg4][arg0], 1);
                }
            }
            if (var11.field2771 != 0 && arg2 != null) {
                arg2.method1596(arg4, arg1, 121, arg9, arg0, var11.field2727);
            }
            if (var11.field2741 != 16) {
                class65.method480(arg3, arg4, arg0, var11.field2741);
            }
        } else if (arg1 == 3) {
            class126 var35;
            if (var11.field2743 == -1 && var11.field2745 == null) {
                class175 var34 = var11.method1231((class279) null, arg8, arg9, var19, var22, var29, 3778, var18, var20, var24, 3);
                if (class166.field2625 && var29) {
                    class263.method1852(var34.field2840, var18, var21, var22);
                }
                var35 = var34.field2846;
            } else {
                var35 = new class272(arg10, 3, arg9, arg5, arg4, arg0, var11.field2743, var11.field2729, (class126) null);
            }
            class297.method2046(arg3, arg4, arg0, var20, var35, (class126) null, class316.field5331[arg9], 0, var27);
            if (var11.field2730 && arg8) {
                if (arg9 == 0) {
                    class314.field5301[arg3][arg4][arg0 + 1] = 50;
                } else if (arg9 == 1) {
                    class314.field5301[arg3][arg4 + 1][arg0 + 1] = 50;
                } else if (arg9 == 2) {
                    class314.field5301[arg3][arg4 + 1][arg0] = 50;
                } else if (arg9 == 3) {
                    class314.field5301[arg3][arg4][arg0] = 50;
                }
            }
            if (var11.field2771 != 0 && arg2 != null) {
                arg2.method1596(arg4, arg1, -119, arg9, arg0, var11.field2727);
            }
        } else if (arg1 == 9) {
            class126 var37;
            if (var11.field2743 == -1 && var11.field2745 == null) {
                class175 var36 = var11.method1231((class279) null, arg8, arg9, var19, var22, var29, 3778, var18, var20, var24, arg1);
                if (class166.field2625 && var29) {
                    class263.method1852(var36.field2840, var18, var21, var22);
                }
                var37 = var36.field2846;
            } else {
                var37 = new class272(arg10, arg1, arg9, arg5, arg4, arg0, var11.field2743, var11.field2729, (class126) null);
            }
            class50.method353(arg3, arg4, arg0, var20, 1, 1, var37, 0, var27);
            if (var11.field2771 != 0 && arg2 != null) {
                arg2.method1599(var11.field2727, arg0, (byte) 102, arg4, var12, var13);
            }
            if (var11.field2741 != 16) {
                class65.method480(arg3, arg4, arg0, var11.field2741);
            }
        } else if (arg1 == 4) {
            class126 var39;
            if (var11.field2743 == -1 && var11.field2745 == null) {
                class175 var38 = var11.method1231((class279) null, arg8, arg9, var19, var22, var29, 3778, var18, var20, var24, 4);
                if (class166.field2625 && var29) {
                    class263.method1852(var38.field2840, var18, var21, var22);
                }
                var39 = var38.field2846;
            } else {
                var39 = new class272(arg10, 4, arg9, arg5, arg4, arg0, var11.field2743, var11.field2729, (class126) null);
            }
            class223.method1606(arg3, arg4, arg0, var20, var39, (class126) null, class93.field1370[arg9], 0, 0, 0, var27);
        } else if (arg1 == 5) {
            int var40 = 16;
            long var41 = class95.method679(arg3, arg4, arg0);
            if (var41 != 0L) {
                var40 = class234.method1684(-2441, Integer.MAX_VALUE & (int) (var41 >>> 32)).field2741;
            }
            class126 var44;
            if (var11.field2743 == -1 && var11.field2745 == null) {
                class175 var43 = var11.method1231((class279) null, arg8, arg9, var19, var22, var29, 3778, var18, var20, var24, 4);
                if (class166.field2625 && var29) {
                    class263.method1852(var43.field2840, var18 - class151.field2343[arg9] * 8, var21, var22 - (class245.field3913[arg9] * 8));
                }
                var44 = var43.field2846;
            } else {
                var44 = new class272(arg10, 4, arg9, arg5, arg4, arg0, var11.field2743, var11.field2729, (class126) null);
            }
            class223.method1606(arg3, arg4, arg0, var20, var44, (class126) null, class93.field1370[arg9], 0, class151.field2343[arg9] * var40, class245.field3913[arg9] * var40, var27);
        } else if (arg1 == 6) {
            long var58 = class95.method679(arg3, arg4, arg0);
            int var60 = 8;
            if (var58 != 0L) {
                var60 = class234.method1684(-2441, (int) (var58 >>> 32) & Integer.MAX_VALUE).field2741 / 2;
            }
            class126 var62;
            if (var11.field2743 == -1 && var11.field2745 == null) {
                class175 var61 = var11.method1231((class279) null, arg8, arg9 + 4, var19, var22, var29, 3778, var18, var20, var24, 4);
                if (class166.field2625 && var29) {
                    class263.method1852(var61.field2840, var18 - (class138.field2077[arg9] * 8), var21, var22 - (class27.field399[arg9] * 8));
                }
                var62 = var61.field2846;
            } else {
                var62 = new class272(arg10, 4, arg9 + 4, arg5, arg4, arg0, var11.field2743, var11.field2729, (class126) null);
            }
            class223.method1606(arg3, arg4, arg0, var20, var62, (class126) null, 256, arg9, class138.field2077[arg9] * var60, class27.field399[arg9] * var60, var27);
        } else if (arg1 == 7) {
            int var45 = arg9 + 2 & 0x3;
            class126 var47;
            if (var11.field2743 == -1 && var11.field2745 == null) {
                class175 var46 = var11.method1231((class279) null, arg8, var45 + 4, var19, var22, var29, arg6 ^ 0xFFFFF14A, var18, var20, var24, 4);
                if (class166.field2625 && var29) {
                    class263.method1852(var46.field2840, var18, var21, var22);
                }
                var47 = var46.field2846;
            } else {
                var47 = new class272(arg10, 4, var45 + 4, arg5, arg4, arg0, var11.field2743, var11.field2729, (class126) null);
            }
            class223.method1606(arg3, arg4, arg0, var20, var47, (class126) null, 256, var45, 0, 0, var27);
        } else if (arg1 == 8) {
            int var48 = 8;
            long var49 = class95.method679(arg3, arg4, arg0);
            if (var49 != 0L) {
                var48 = class234.method1684(-2441, (int) (var49 >>> 32) & Integer.MAX_VALUE).field2741 / 2;
            }
            int var51 = arg9 + 2 & 0x3;
            class126 var55;
            class126 var57;
            if (var11.field2743 == -1 && var11.field2745 == null) {
                int var52 = class27.field399[arg9] * 8;
                int var53 = class138.field2077[arg9] * 8;
                class175 var54 = var11.method1231((class279) null, arg8, arg9 + 4, var19, var22, var29, 3778, var18, var20, var24, 4);
                if (class166.field2625 && var29) {
                    class263.method1852(var54.field2840, var18 - var53, var21, var22 - var52);
                }
                var55 = var54.field2846;
                class175 var56 = var11.method1231((class279) null, arg8, var51 + 4, var19, var22, var29, 3778, var18, var20, var24, 4);
                if (class166.field2625 && var29) {
                    class263.method1852(var56.field2840, var18 - var53, var21, var22 - var52);
                }
                var57 = var56.field2846;
            } else {
                var55 = new class272(arg10, 4, arg9 + 4, arg5, arg4, arg0, var11.field2743, var11.field2729, (class126) null);
                var57 = new class272(arg10, 4, var51 + 4, arg5, arg4, arg0, var11.field2743, var11.field2729, (class126) null);
            }
            class223.method1606(arg3, arg4, arg0, var20, var55, var57, 256, arg9, class138.field2077[arg9] * var48, class27.field399[arg9] * var48, var27);
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 668)
    public final Object method710(byte arg0) {
        int var2 = 59 / ((arg0 + 20) / 52);
        field2934++;
        return this.field2942;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BZLjava/lang/Object;)[B", line = 683)
    public static final byte[] method1296(byte arg0, boolean arg1, Object arg2) {
        field2932++;
        if (arg2 == null) {
            return null;
        } else if ((arg2 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg2);
            return arg1 ? class38.method260((byte) 61, var4) : var4;
        } else if (arg0 >= -8) {
            return (byte[]) null;
        } else if ((arg2 instanceof class43)) {
            class43 var3 = (class43) arg2;
            return var3.method320(32);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V", line = 721)
    public static void method1297(boolean arg0) {
        if (!arg0) {
            field2938 = null;
            field2933 = null;
            field2937 = null;
            field2928 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZIIII)V", line = 744)
    public static final void method1298(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class237.field3801 >= arg4 && arg2 >= class15.field192) {
            boolean var6;
            if (arg5 < class273.field4449) {
                arg5 = class273.field4449;
                var6 = false;
            } else if (class153.field2439 >= arg5) {
                var6 = true;
            } else {
                arg5 = class153.field2439;
                var6 = false;
            }
            boolean var7;
            if (class273.field4449 > arg3) {
                arg3 = class273.field4449;
                var7 = false;
            } else if (class153.field2439 >= arg3) {
                var7 = true;
            } else {
                arg3 = class153.field2439;
                var7 = false;
            }
            if (class15.field192 > arg4) {
                arg4 = class15.field192;
            } else {
                class269.method1908(19, class239.field3829[arg4++], arg0, arg3, arg5);
            }
            if (class237.field3801 >= arg2) {
                class269.method1908(19, class239.field3829[arg2--], arg0, arg3, arg5);
            } else {
                arg2 = class237.field3801;
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg2; var8++) {
                    int[] var9 = class239.field3829[var8];
                    var9[arg5] = var9[arg3] = arg0;
                }
            } else if (var6) {
                for (int var10 = arg4; var10 <= arg2; var10++) {
                    class239.field3829[var10][arg5] = arg0;
                }
            } else if (var7) {
                for (int var11 = arg4; var11 <= arg2; var11++) {
                    class239.field3829[var11][arg3] = arg0;
                }
            }
        }
        field2931++;
        if (arg1) {
            method1296((byte) -25, false, (Object) null);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)V", line = 848)
    public static final void method1299(byte arg0, int arg1) {
        field2941++;
        if (!class32.method223(arg1, 255)) {
            return;
        }
        class302[] var2 = class273.field4446[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class302 var4 = var2[var3];
            if (var4 != null) {
                var4.field4994 = 0;
                var4.field4914 = 0;
            }
        }
        if (arg0 != -49) {
            method1299((byte) -95, 20);
        }
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)Z", line = 882)
    public final boolean method709(byte arg0) {
        if (arg0 > -39) {
            field2928 = (class41) null;
        }
        field2936++;
        return false;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 909)
    public class181(Object arg0) {
        this.field2942 = arg0;
    }
}
