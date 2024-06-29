import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class127 {

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public int field2861 = 0;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public int field2863 = 0;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Loa;")
    private static class98 field2829 = class38.method349(255, "Offline");

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field2830 = 0;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "Loa;")
    private static class98 field2841 = class38.method349(255, "Enter your username (V password)3");

    @OriginalMember(owner = "client!se", name = "u", descriptor = "Loa;")
    public static class98 field2849 = class38.method349(255, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!se", name = "v", descriptor = "Loa;")
    public static class98 field2850 = field2829;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "Loa;")
    public static class98 field2855 = class38.method349(255, "backright2");

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field2843 = 128;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Loa;")
    public static class98 field2838 = class38.method349(255, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    public static int field2854 = 0;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field2844 = 0;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Loa;")
    public static class98 field2835 = field2841;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public int field2847;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public int field2851;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public int field2853;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    public int field2860;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "I")
    public int field2862;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "Loc;")
    public static class100 field2852;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Lab;")
    public static class3 field2842;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "Lha;")
    public static class50 field2858;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "Lkd;")
    public static class73 field2845;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Lnd;")
    public class94 field2832;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "Lnd;")
    public class94 field2859;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Z")
    public static boolean field2839;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "[I")
    public static int[] field2857;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "[I")
    public static int[] field2864;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLtb;ZILoa;ILoa;)V")
    public static final void method996(boolean arg0, class130 arg1, boolean arg2, int arg3, class98 arg4, int arg5, class98 arg6) {
        field2856++;
        int var7 = arg1.method1060((byte) -120, arg4);
        if (!arg2) {
            field2858 = null;
        }
        int var8 = arg1.method1048(arg6, var7, (byte) -100);
        class94.method752(arg1, arg5, var7, arg0, var8, 118, arg3);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V")
    public static final void method997(int arg0, int arg1) {
        field2848++;
        if (arg0 < 41 || (arg1 == -1 || !client.method202(arg1, -642990672))) {
            return;
        }
        class132[] var2 = class36.field901[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class132 var4 = var2[var3];
            if (var4.field3117 != null) {
                class67.method555(var4, 0, null, var4.field3117, -2401, 0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static final void method998(byte arg0) {
        class22.field554 = false;
        class94.field2151 = false;
        if (arg0 >= -79) {
            method998((byte) -95);
        }
        field2833++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    public static final void method999(boolean arg0) {
        if (!arg0) {
            field2854 = -10;
        }
        field2846++;
        class97.field2244.method714(122);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
    public static void method1000(boolean arg0) {
        field2849 = null;
        field2829 = null;
        field2835 = null;
        field2841 = null;
        field2852 = null;
        if (arg0) {
            method1003((byte) 10);
        }
        field2850 = null;
        field2838 = null;
        field2842 = null;
        field2864 = null;
        field2855 = null;
        field2845 = null;
        field2858 = null;
        field2857 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III[B)Z")
    public static final boolean method1001(int arg0, int arg1, int arg2, byte[] arg3) {
        field2836++;
        int var4 = -1;
        boolean var5 = true;
        if (arg1 >= -106) {
            method1004((byte) 89, 64);
        }
        class8 var6 = new class8(arg3);
        label58: while (true) {
            int var7 = var6.method103(-23734);
            if (var7 == 0) {
                return var5;
            }
            int var8 = 0;
            boolean var9 = false;
            var4 += var7;
            while (true) {
                while (!var9) {
                    int var11 = var6.method103(-23734);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var13 + arg2;
                    int var15 = arg0 + var12;
                    int var16 = var6.method62((byte) 111) >> 2;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class129 var17 = class145.method1167(var4, 65280);
                        if (var16 != 22 || !class94.field2151 || var17.field2969 != 0 || var17.field2952) {
                            if (!var17.method1040((byte) -24)) {
                                class113.field2549++;
                                var5 = false;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var6.method103(-23734);
                if (var10 == 0) {
                    break;
                }
                var6.method62((byte) 108);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILwc;IIIIIBLd;)V")
    public static final void method1002(int arg0, class149 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, class22 arg8) {
        field2834++;
        if (class94.field2151 && (class80.field1771[0][arg5][arg0] & 0x2) == 0) {
            if ((class80.field1771[arg4][arg5][arg0] & 0x10) != 0) {
                return;
            }
            if (class102.method841(-40, arg0, arg4, arg5) != class17.field346) {
                return;
            }
        }
        if (arg4 < class80.field1792) {
            class80.field1792 = arg4;
        }
        int var9 = class25.field616[arg4][arg5 + 1][arg0 + 1];
        int var10 = class25.field616[arg4][arg5 + 1][arg0];
        int var11 = class25.field616[arg4][arg5][arg0];
        int var12 = (arg0 << 7) + (arg6 << 14) + arg5 + 1073741824;
        int var13 = (arg2 << 6) + arg3;
        int var14 = class25.field616[arg4][arg5][arg0 + 1];
        int var15 = var10 + var11 + var9 + var14 >> 2;
        class129 var16 = class145.method1167(arg6, 65280);
        if (var16.field2959 == 1) {
            var13 += 256;
        }
        if (var16.field2969 == 0) {
            var12 += Integer.MIN_VALUE;
        }
        if (var16.method1033((byte) 9)) {
            class29.method295(arg5, arg0, arg4, var16, 128, arg2);
        }
        if (arg3 == 22) {
            if (!class94.field2151 || var16.field2969 != 0 || var16.field2952) {
                class94 var17;
                if (var16.field2990 == -1 && var16.field2932 == null) {
                    var17 = var16.method1037(-605751990, var14, 22, var11, arg2, var9, var10);
                } else {
                    var17 = new class88(arg6, 22, arg2, var11, var10, var9, var14, var16.field2990, true, null);
                }
                arg8.method241(arg4, arg5, arg0, var15, var17, var12, var13);
                if (var16.field2947 == 1 && arg1 != null) {
                    arg1.method1188((byte) -68, arg0, arg5);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class94 var38;
            if (var16.field2990 == -1 && var16.field2932 == null) {
                var38 = var16.method1037(-605751990, var14, 10, var11, arg2, var9, var10);
            } else {
                var38 = new class88(arg6, 10, arg2, var11, var10, var9, var14, var16.field2990, true, null);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg2 == 1 || arg2 == 3) {
                    var40 = var16.field2991;
                    var39 = var16.field2993;
                } else {
                    var39 = var16.field2991;
                    var40 = var16.field2993;
                }
                int var41 = 0;
                if (arg3 == 11) {
                    var41 += 256;
                }
                if (arg8.method233(arg4, arg5, arg0, var15, var40, var39, var38, var41, var12, var13) && var16.field2941) {
                    int var42 = 15;
                    if (var38 instanceof class128) {
                        var42 = ((class128) var38).method1020() / 4;
                        if (var42 > 30) {
                            var42 = 30;
                        }
                    }
                    for (int var43 = 0; var43 <= var40; var43++) {
                        for (int var44 = 0; var44 <= var39; var44++) {
                            if (class139.field3392[arg4][arg5 + var43][arg0 + var44] < var42) {
                                class139.field3392[arg4][arg5 + var43][arg0 + var44] = (byte) var42;
                            }
                        }
                    }
                }
            }
            if (var16.field2947 != 0 && arg1 != null) {
                arg1.method1187(arg0, arg2, var16.field2991, var16.field2993, var16.field2965, arg5, 256);
            }
        } else if (arg3 >= 12) {
            class94 var18;
            if (var16.field2990 == -1 && var16.field2932 == null) {
                var18 = var16.method1037(-605751990, var14, arg3, var11, arg2, var9, var10);
            } else {
                var18 = new class88(arg6, arg3, arg2, var11, var10, var9, var14, var16.field2990, true, null);
            }
            arg8.method233(arg4, arg5, arg0, var15, 1, 1, var18, 0, var12, var13);
            if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg4 > 0) {
                class88.field2026[arg4][arg5][arg0] = class94.method751(class88.field2026[arg4][arg5][arg0], 2340);
            }
            if (var16.field2947 != 0 && arg1 != null) {
                arg1.method1187(arg0, arg2, var16.field2991, var16.field2993, var16.field2965, arg5, 256);
            }
        } else if (arg3 == 0) {
            class94 var19;
            if (var16.field2990 == -1 && var16.field2932 == null) {
                var19 = var16.method1037(-605751990, var14, 0, var11, arg2, var9, var10);
            } else {
                var19 = new class88(arg6, 0, arg2, var11, var10, var9, var14, var16.field2990, true, null);
            }
            arg8.method253(arg4, arg5, arg0, var15, var19, null, class48.field1084[arg2], 0, var12, var13);
            if (arg2 == 0) {
                if (var16.field2941) {
                    class139.field3392[arg4][arg5][arg0] = 50;
                    class139.field3392[arg4][arg5][arg0 + 1] = 50;
                }
                if (var16.field2929) {
                    class88.field2026[arg4][arg5][arg0] = class94.method751(class88.field2026[arg4][arg5][arg0], 585);
                }
            } else if (arg2 == 1) {
                if (var16.field2941) {
                    class139.field3392[arg4][arg5][arg0 + 1] = 50;
                    class139.field3392[arg4][arg5 + 1][arg0 + 1] = 50;
                }
                if (var16.field2929) {
                    class88.field2026[arg4][arg5][arg0 + 1] = class94.method751(class88.field2026[arg4][arg5][arg0 + 1], 1170);
                }
            } else if (arg2 == 2) {
                if (var16.field2941) {
                    class139.field3392[arg4][arg5 + 1][arg0] = 50;
                    class139.field3392[arg4][arg5 + 1][arg0 + 1] = 50;
                }
                if (var16.field2929) {
                    class88.field2026[arg4][arg5 + 1][arg0] = class94.method751(class88.field2026[arg4][arg5 + 1][arg0], 585);
                }
            } else if (arg2 == 3) {
                if (var16.field2941) {
                    class139.field3392[arg4][arg5][arg0] = 50;
                    class139.field3392[arg4][arg5 + 1][arg0] = 50;
                }
                if (var16.field2929) {
                    class88.field2026[arg4][arg5][arg0] = class94.method751(class88.field2026[arg4][arg5][arg0], 1170);
                }
            }
            if (var16.field2947 != 0 && arg1 != null) {
                arg1.method1191(arg3, 25549, arg2, arg0, arg5, var16.field2965);
            }
            if (var16.field2951 != 16) {
                arg8.method245(arg4, arg5, arg0, var16.field2951);
            }
        } else if (arg3 == 1) {
            class94 var20;
            if (var16.field2990 == -1 && var16.field2932 == null) {
                var20 = var16.method1037(-605751990, var14, 1, var11, arg2, var9, var10);
            } else {
                var20 = new class88(arg6, 1, arg2, var11, var10, var9, var14, var16.field2990, true, null);
            }
            arg8.method253(arg4, arg5, arg0, var15, var20, null, class132.field3229[arg2], 0, var12, var13);
            if (var16.field2941) {
                if (arg2 == 0) {
                    class139.field3392[arg4][arg5][arg0 + 1] = 50;
                } else if (arg2 == 1) {
                    class139.field3392[arg4][arg5 + 1][arg0 + 1] = 50;
                } else if (arg2 == 2) {
                    class139.field3392[arg4][arg5 + 1][arg0] = 50;
                } else if (arg2 == 3) {
                    class139.field3392[arg4][arg5][arg0] = 50;
                }
            }
            if (var16.field2947 != 0 && arg1 != null) {
                arg1.method1191(arg3, 25549, arg2, arg0, arg5, var16.field2965);
            }
        } else if (arg3 == 2) {
            int var21 = arg2 + 1 & 0x3;
            class94 var22;
            class94 var23;
            if (var16.field2990 == -1 && var16.field2932 == null) {
                var22 = var16.method1037(-605751990, var14, 2, var11, arg2 + 4, var9, var10);
                var23 = var16.method1037(-605751990, var14, 2, var11, var21, var9, var10);
            } else {
                var22 = new class88(arg6, 2, arg2 + 4, var11, var10, var9, var14, var16.field2990, true, null);
                var23 = new class88(arg6, 2, var21, var11, var10, var9, var14, var16.field2990, true, null);
            }
            arg8.method253(arg4, arg5, arg0, var15, var22, var23, class48.field1084[arg2], class48.field1084[var21], var12, var13);
            if (var16.field2929) {
                if (arg2 == 0) {
                    class88.field2026[arg4][arg5][arg0] = class94.method751(class88.field2026[arg4][arg5][arg0], 585);
                    class88.field2026[arg4][arg5][arg0 + 1] = class94.method751(class88.field2026[arg4][arg5][arg0 + 1], 1170);
                } else if (arg2 == 1) {
                    class88.field2026[arg4][arg5][arg0 + 1] = class94.method751(class88.field2026[arg4][arg5][arg0 + 1], 1170);
                    class88.field2026[arg4][arg5 + 1][arg0] = class94.method751(class88.field2026[arg4][arg5 + 1][arg0], 585);
                } else if (arg2 == 2) {
                    class88.field2026[arg4][arg5 + 1][arg0] = class94.method751(class88.field2026[arg4][arg5 + 1][arg0], 585);
                    class88.field2026[arg4][arg5][arg0] = class94.method751(class88.field2026[arg4][arg5][arg0], 1170);
                } else if (arg2 == 3) {
                    class88.field2026[arg4][arg5][arg0] = class94.method751(class88.field2026[arg4][arg5][arg0], 1170);
                    class88.field2026[arg4][arg5][arg0] = class94.method751(class88.field2026[arg4][arg5][arg0], 585);
                }
            }
            if (var16.field2947 != 0 && arg1 != null) {
                arg1.method1191(arg3, 25549, arg2, arg0, arg5, var16.field2965);
            }
            if (var16.field2951 != 16) {
                arg8.method245(arg4, arg5, arg0, var16.field2951);
            }
        } else if (arg3 == 3) {
            class94 var24;
            if (var16.field2990 == -1 && var16.field2932 == null) {
                var24 = var16.method1037(-605751990, var14, 3, var11, arg2, var9, var10);
            } else {
                var24 = new class88(arg6, 3, arg2, var11, var10, var9, var14, var16.field2990, true, null);
            }
            arg8.method253(arg4, arg5, arg0, var15, var24, null, class132.field3229[arg2], 0, var12, var13);
            if (var16.field2941) {
                if (arg2 == 0) {
                    class139.field3392[arg4][arg5][arg0 + 1] = 50;
                } else if (arg2 == 1) {
                    class139.field3392[arg4][arg5 + 1][arg0 + 1] = 50;
                } else if (arg2 == 2) {
                    class139.field3392[arg4][arg5 + 1][arg0] = 50;
                } else if (arg2 == 3) {
                    class139.field3392[arg4][arg5][arg0] = 50;
                }
            }
            if (var16.field2947 != 0 && arg1 != null) {
                arg1.method1191(arg3, 25549, arg2, arg0, arg5, var16.field2965);
            }
        } else if (arg3 == 9) {
            class94 var25;
            if (var16.field2990 == -1 && var16.field2932 == null) {
                var25 = var16.method1037(-605751990, var14, arg3, var11, arg2, var9, var10);
            } else {
                var25 = new class88(arg6, arg3, arg2, var11, var10, var9, var14, var16.field2990, true, null);
            }
            arg8.method233(arg4, arg5, arg0, var15, 1, 1, var25, 0, var12, var13);
            if (var16.field2947 != 0 && arg1 != null) {
                arg1.method1187(arg0, arg2, var16.field2991, var16.field2993, var16.field2965, arg5, 256);
            }
        } else {
            if (var16.field2949) {
                if (arg2 == 1) {
                    int var29 = var14;
                    var14 = var9;
                    var9 = var10;
                    var10 = var11;
                    var11 = var29;
                } else if (arg2 == 2) {
                    int var26 = var14;
                    var14 = var10;
                    var10 = var26;
                    int var27 = var9;
                    var9 = var11;
                    var11 = var27;
                } else if (arg2 == 3) {
                    int var28 = var14;
                    var14 = var11;
                    var11 = var10;
                    var10 = var9;
                    var9 = var28;
                }
            }
            if (arg3 == 4) {
                class94 var30;
                if (var16.field2990 == -1 && var16.field2932 == null) {
                    var30 = var16.method1037(-605751990, var14, 4, var11, 0, var9, var10);
                } else {
                    var30 = new class88(arg6, 4, 0, var11, var10, var9, var14, var16.field2990, true, null);
                }
                arg8.method235(arg4, arg5, arg0, var15, var30, class48.field1084[arg2], arg2 * 512, 0, 0, var12, var13);
            } else {
                int var31 = 12 % ((49 - arg7) / 33);
                if (arg3 == 5) {
                    int var32 = arg8.method244(arg4, arg5, arg0);
                    int var33 = 16;
                    if (var32 != 0) {
                        var33 = class145.method1167(var32 >> 14 & 0x7FFF, 65280).field2951;
                    }
                    class94 var34;
                    if (var16.field2990 == -1 && var16.field2932 == null) {
                        var34 = var16.method1037(-605751990, var14, 4, var11, 0, var9, var10);
                    } else {
                        var34 = new class88(arg6, 4, 0, var11, var10, var9, var14, var16.field2990, true, null);
                    }
                    arg8.method235(arg4, arg5, arg0, var15, var34, class48.field1084[arg2], arg2 * 512, class138.field3380[arg2] * var33, class31.field749[arg2] * var33, var12, var13);
                } else if (arg3 == 6) {
                    class94 var35;
                    if (var16.field2990 == -1 && var16.field2932 == null) {
                        var35 = var16.method1037(-605751990, var14, 4, var11, 0, var9, var10);
                    } else {
                        var35 = new class88(arg6, 4, 0, var11, var10, var9, var14, var16.field2990, true, null);
                    }
                    arg8.method235(arg4, arg5, arg0, var15, var35, 256, arg2, 0, 0, var12, var13);
                } else if (arg3 == 7) {
                    class94 var36;
                    if (var16.field2990 == -1 && var16.field2932 == null) {
                        var36 = var16.method1037(-605751990, var14, 4, var11, 0, var9, var10);
                    } else {
                        var36 = new class88(arg6, 4, 0, var11, var10, var9, var14, var16.field2990, true, null);
                    }
                    arg8.method235(arg4, arg5, arg0, var15, var36, 512, arg2, 0, 0, var12, var13);
                } else if (arg3 == 8) {
                    class94 var37;
                    if (var16.field2990 == -1 && var16.field2932 == null) {
                        var37 = var16.method1037(-605751990, var14, 4, var11, 0, var9, var10);
                    } else {
                        var37 = new class88(arg6, 4, 0, var11, var10, var9, var14, var16.field2990, true, null);
                    }
                    arg8.method235(arg4, arg5, arg0, var15, var37, 768, arg2, 0, 0, var12, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
    public static final void method1003(byte arg0) {
        field2837++;
        int var1 = -59 % ((-arg0 - 14) / 49);
        if (class16.field334 == null) {
            return;
        }
        class132 var2 = class16.field334;
        class132 var3 = class58.method468((byte) -122, var2);
        if (var3 == null) {
            class16.field334 = null;
            return;
        }
        class19.field424++;
        int var4 = class42.field990;
        int var5 = class123.field2749;
        if (class51.field1135 == 0) {
            var4 -= 4;
            var5 -= 4;
        }
        if (class51.field1135 == 1) {
            var4 -= 553;
            var5 -= 205;
        }
        if (class51.field1135 == 2) {
            var5 -= 357;
            var4 -= 17;
        }
        int var6 = var4 - class31.field729;
        int var7 = var5 - class63.field1346;
        int[] var8 = class147.method1176(var3, (byte) 118);
        class132 var9 = class36.field901[var2.field3135 >> 16][var2.field3195 & 0xFFFF];
        if (var7 < var8[1]) {
            var7 = var8[1];
        }
        if (var2.field3165 + var7 > var8[1] + var3.field3165) {
            var7 = var3.field3165 + var8[1] - var2.field3165;
        }
        int var10 = var3.field3114 + var7 - var8[1];
        if (var6 < var8[0]) {
            var6 = var8[0];
        }
        if (var8[0] + var3.field3215 < var2.field3215 + var6) {
            var6 = var3.field3215 + var8[0] - var2.field3215;
        }
        int var11 = var3.field3189 + var6 - var8[0];
        int[] var12 = class147.method1176(var9, (byte) 101);
        int var13 = var6 + var9.field3189 - var12[0];
        int var14 = var7 + var9.field3114 - var12[1];
        int var15 = var14 - var2.field3102;
        int var16 = var13 - var2.field3216;
        int var10000;
        if (var16 <= var2.field3101 && var16 >= -var2.field3101 && var15 <= var2.field3101 && -var2.field3101 <= var15 && !class29.field691) {
            var10000 = var13 - var16;
            var11 -= var16;
            var10000 = var14 - var15;
            boolean var19 = false;
            var10 -= var15;
            boolean var20 = false;
        } else if (var2.field3168 < class19.field424 || class29.field691) {
            class29.field691 = true;
        } else {
            var11 -= var16;
            var10 -= var15;
            var10000 = var14 - var15;
            int var26 = var13 - var16;
            boolean var23 = false;
            boolean var24 = false;
        }
        if (class16.field334.field3154 != null && class29.field691) {
            class67.method555(var2, 0, null, var2.field3154, -2401, var10, var11);
        }
        if (class36.field899 != 0) {
            return;
        }
        if (class29.field691) {
            class132 var25 = class52.method433(var2, var3, class31.field729 + var11, class63.field1346 + var10, 0);
            if (class16.field334.field3209 != null) {
                class67.method555(var2, 0, var25, var2.field3209, -2401, var10, var11);
            }
            if (var25 != null && client.method209((byte) -90, var2) != null) {
                class90.field2054++;
                class132.field3116.method177(6624, 137);
                class132.field3116.method81((byte) 49, var2.field3115);
                class132.field3116.method89(var2.field3135, 26167);
                class132.field3116.method54((byte) -100, var25.field3115);
                class132.field3116.method66((byte) -31, var25.field3135);
            }
        } else {
            if (class16.field334.field3197 != null) {
                class67.method555(var2, 0, null, var2.field3197, -2401, var10, var11);
            }
            if ((class112.field2506 == 1 || class98.method816(104, class80.field1780 - 1)) && class80.field1780 > 2) {
                class29.method296(4);
            } else if (class80.field1780 > 0) {
                class21.method195(class80.field1780 - 1, 0);
            }
        }
        class16.field334 = null;
        return;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)Z")
    public static final boolean method1004(byte arg0, int arg1) {
        field2840++;
        if (arg0 > -48) {
            return false;
        } else {
            return (arg1 >> 21 & 0x1) != 0;
        }
    }
}
