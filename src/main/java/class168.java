import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class168 extends class89 {

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "I")
    private int field2914 = 0;

    @OriginalMember(owner = "client!bl", name = "gb", descriptor = "I")
    private int field2927 = 4096;

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "Lda;")
    private static class275 field2912 = class255.method1672(113, ")3fr");

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
    public static int field2917 = 0;

    @OriginalMember(owner = "client!bl", name = "Y", descriptor = "Lda;")
    private static class275 field2919 = class255.method1672(122, ")3en");

    @OriginalMember(owner = "client!bl", name = "X", descriptor = "Lda;")
    private static class275 field2918 = class255.method1672(122, " has logged in)3");

    @OriginalMember(owner = "client!bl", name = "eb", descriptor = "I")
    public static int field2925 = 0;

    @OriginalMember(owner = "client!bl", name = "fb", descriptor = "Lda;")
    public static class275 field2926 = class255.method1672(112, "<)4col>");

    @OriginalMember(owner = "client!bl", name = "mb", descriptor = "Lda;")
    private static class275 field2933 = class255.method1672(94, "en");

    @OriginalMember(owner = "client!bl", name = "bb", descriptor = "Lda;")
    private static class275 field2922 = class255.method1672(119, ")3de");

    @OriginalMember(owner = "client!bl", name = "db", descriptor = "Lda;")
    private static class275 field2924 = class255.method1672(101, "fr");

    @OriginalMember(owner = "client!bl", name = "jb", descriptor = "Lda;")
    private static class275 field2930 = class255.method1672(100, "de");

    @OriginalMember(owner = "client!bl", name = "cb", descriptor = "[Lda;")
    private static class275[] field2923 = new class275[] { field2919, field2922, field2912 };

    @OriginalMember(owner = "client!bl", name = "kb", descriptor = "[Lda;")
    public static class275[] field2931 = new class275[] { field2933, field2930, field2924 };

    @OriginalMember(owner = "client!bl", name = "nb", descriptor = "Lda;")
    public static class275 field2934 = field2918;

    @OriginalMember(owner = "client!bl", name = "ib", descriptor = "Lda;")
    public static class275 field2929 = class255.method1672(97, ")4p=");

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!bl", name = "U", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!bl", name = "Z", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!bl", name = "ab", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!bl", name = "hb", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!bl", name = "ob", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!bl", name = "lb", descriptor = "[I")
    public static int[] field2932;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        ++field2916;
        if (arg1) {
            method1153((byte) -75);
        }
        int[] var3 = super.field1503.method229(arg0, (byte) -104);
        if (super.field1503.field664) {
            int[] var4 = this.method645(30, 0, arg0);
            for (int var5 = 0; class65.field1070 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field2914 >= ~var6 && ~this.field2927 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILfd;I)V")
    public static final void method1151(int arg0, int arg1, class229 arg2, int arg3) {
        if (~arg2.field4011 == -1) {
            arg2.field3889 = arg2.field3939;
        } else if (arg2.field4011 != 1) {
            if (arg2.field4011 != 2) {
                if (arg2.field4011 != 3) {
                    if (~arg2.field4011 != -5) {
                        arg2.field3889 = -arg2.field3885 + arg0 - (arg2.field3939 * arg0 >> 14);
                    } else {
                        arg2.field3889 = (-arg2.field3885 + arg0) / 2 - -(arg2.field3939 * arg0 >> 14);
                    }
                } else {
                    arg2.field3889 = arg2.field3939 * arg0 >> 14;
                }
            } else {
                arg2.field3889 = -arg2.field3939 + arg0 + -arg2.field3885;
            }
        } else {
            arg2.field3889 = (-arg2.field3885 + arg0) / 2 + arg2.field3939;
        }
        ++field2928;
        int var4 = -61 % ((-62 - arg3) / 58);
        if (~arg2.field3898 != -1) {
            if (~arg2.field3898 != -2) {
                if (arg2.field3898 != 2) {
                    if (arg2.field3898 != 3) {
                        if (~arg2.field3898 != -5) {
                            arg2.field4012 = -(arg2.field3875 * arg1 >> 14) + arg1 + -arg2.field3980;
                        } else {
                            arg2.field4012 = (-arg2.field3980 + arg1) / 2 - -(arg2.field3875 * arg1 >> 14);
                        }
                    } else {
                        arg2.field4012 = arg2.field3875 * arg1 >> 14;
                    }
                } else {
                    arg2.field4012 = -arg2.field3875 + arg1 + -arg2.field3980;
                }
            } else {
                arg2.field4012 = (-arg2.field3980 + arg1) / 2 + arg2.field3875;
            }
        } else {
            arg2.field4012 = arg2.field3875;
        }
        if (class143.field2518) {
            if (~client.method635(arg2) != -1 || ~arg2.field3858 == -1) {
                if (arg2.field3889 < 0) {
                    arg2.field3889 = 0;
                } else if (~arg0 > ~(arg2.field3889 + arg2.field3885)) {
                    arg2.field3889 = -arg2.field3885 + arg0;
                }
                if (~arg2.field4012 <= -1) {
                    if (~(arg2.field4012 - -arg2.field3980) < ~arg1) {
                        arg2.field4012 = -arg2.field3980 + arg1;
                        return;
                    }
                } else {
                    arg2.field4012 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)V")
    public static final void method1152(byte arg0) {
        if (class72.field1166 != null) {
            class72.field1166.method886(-29988);
        }
        ++field2935;
        int var1 = -32 % ((arg0 - -11) / 61);
        if (class120.field2160 != null) {
            class120.field2160.method886(-29988);
        }
        class17.method91(2, 22050, -1, class225.field3810);
        class72.field1166 = class238.method1553(class93.field1601, 22050, class3.field24, 2, 0);
        class72.field1166.method883(class265.field4609, (byte) -104);
        class120.field2160 = class238.method1553(class93.field1601, 2048, class3.field24, 2, 1);
        class120.field2160.method883(class258.field4522, (byte) -104);
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(B)V")
    public static final void method1153(byte arg0) {
        class83.field1341 = null;
        class51.field839 = null;
        class123.field2207 = null;
        class114.field2027 = null;
        if (arg0 == 108) {
            class157.field2768 = null;
            class57.field964 = null;
            ++field2920;
            class233.field4075 = null;
            class191.field3279 = null;
            class262.field4556 = null;
            class144.field2526 = null;
            class107.field1855 = null;
            class95.field1628 = 0;
            class134.field2386.method549((byte) 120);
            class11.field165 = null;
            class91.field1545 = null;
            class108.field1879 = null;
            class200.field3417 = null;
            class48.field803 = null;
            class229.field3933 = null;
            class162.field2831 = null;
            class215.field3655 = null;
            class69.field1110 = null;
            class251.field4445 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "(I)V")
    public static void method1154(int arg0) {
        field2934 = null;
        field2931 = null;
        field2922 = null;
        field2926 = null;
        field2912 = null;
        field2932 = null;
        field2924 = null;
        field2929 = null;
        field2923 = null;
        field2918 = null;
        field2930 = null;
        field2933 = null;
        field2919 = null;
        if (arg0 != 0) {
            method1154(84);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIIIIIZII)Z")
    public static final boolean method1155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11, int arg12) {
        ++field2915;
        for (int var13 = 0; var13 < 104; ++var13) {
            for (int var40 = 0; ~var40 > -105; ++var40) {
                class74.field1215[var13][var40] = 0;
                class19.field278[var13][var40] = 99999999;
            }
        }
        int var14 = arg8;
        class74.field1215[arg8][arg3] = 99;
        class19.field278[arg8][arg3] = 0;
        int var15 = arg3;
        int var16 = 0;
        byte var17 = 0;
        class150.field2617[var17] = arg8;
        int var41 = var17 + 1;
        class8.field123[var17] = arg3;
        boolean var18 = false;
        int[][] var19 = class173.field3003[class159.field2790].field2094;
        label372: while (~var16 != ~var41) {
            var14 = class150.field2617[var16];
            var15 = class8.field123[var16];
            var16 = 4095 & var16 - -1;
            if (~arg2 == ~var14 && ~arg4 == ~var15) {
                var18 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || ~arg7 == -11) && class173.field3003[class159.field2790].method856((byte) 121, arg5, arg2, arg4, arg7 - 1, arg11, var14, var15)) {
                    var18 = true;
                    break;
                }
                if (arg7 < 10 && class173.field3003[class159.field2790].method866(var15, arg4, arg7 + -1, arg2, arg5, (byte) -46, var14, arg11)) {
                    var18 = true;
                    break;
                }
            }
            if (~arg9 != -1 && arg12 != 0 && class173.field3003[class159.field2790].method863(arg6, arg12, arg11, var15, arg9, var14, arg2, arg4, -1)) {
                var18 = true;
                break;
            }
            int var31 = class19.field278[var14][var15] + 1;
            if (~var14 < -1 && class74.field1215[var14 - 1][var15] == 0 && (19661070 & var19[var14 + -1][var15]) == 0 && ~(19661112 & var19[var14 + -1][var15 + -1 + arg11]) == -1) {
                int var32 = 1;
                while (true) {
                    if (arg11 - 1 <= var32) {
                        class150.field2617[var41] = var14 + -1;
                        class8.field123[var41] = var15;
                        var41 = 4095 & var41 - -1;
                        class74.field1215[var14 - 1][var15] = 2;
                        class19.field278[var14 + -1][var15] = var31;
                        break;
                    }
                    if ((var19[var14 + -1][var15 - -var32] & 19661118) != 0) {
                        break;
                    }
                    ++var32;
                }
            }
            if (var14 < 102 && ~class74.field1215[var14 - -1][var15] == -1 && (var19[arg11 + var14][var15] & 19661187) == 0 && (var19[var14 - -arg11][var15 - (-arg11 - -1)] & 19661280) == 0) {
                int var33 = 1;
                while (true) {
                    if (~(arg11 + -1) >= ~var33) {
                        class150.field2617[var41] = var14 + 1;
                        class8.field123[var41] = var15;
                        class74.field1215[var14 + 1][var15] = 8;
                        class19.field278[var14 + 1][var15] = var31;
                        var41 = var41 + 1 & 4095;
                        break;
                    }
                    if (~(19661283 & var19[arg11 + var14][var15 - -var33]) != -1) {
                        break;
                    }
                    ++var33;
                }
            }
            if (var15 > 0 && class74.field1215[var14][var15 + -1] == 0 && (19661070 & var19[var14][var15 + -1]) == 0 && ~(var19[arg11 + var14 + -1][var15 + -1] & 19661187) == -1) {
                int var34 = 1;
                while (true) {
                    if (var34 >= arg11 + -1) {
                        class150.field2617[var41] = var14;
                        class8.field123[var41] = var15 + -1;
                        class74.field1215[var14][var15 + -1] = 1;
                        var41 = var41 + 1 & 4095;
                        class19.field278[var14][var15 + -1] = var31;
                        break;
                    }
                    if ((var19[var14 + var34][var15 + -1] & 19661199) != 0) {
                        break;
                    }
                    ++var34;
                }
            }
            if (var15 < 102 && ~class74.field1215[var14][var15 + 1] == -1 && (19661112 & var19[var14][var15 - -arg11]) == 0 && (19661280 & var19[arg11 + -1 + var14][arg11 + var15]) == 0) {
                int var35 = 1;
                while (true) {
                    if (~(arg11 + -1) >= ~var35) {
                        class150.field2617[var41] = var14;
                        class8.field123[var41] = var15 + 1;
                        class74.field1215[var14][var15 + 1] = 4;
                        class19.field278[var14][var15 + 1] = var31;
                        var41 = var41 - -1 & 4095;
                        break;
                    }
                    if (~(19661304 & var19[var14 + var35][arg11 + var15]) != -1) {
                        break;
                    }
                    ++var35;
                }
            }
            if (~var14 < -1 && ~var15 < -1 && ~class74.field1215[var14 + -1][var15 + -1] == -1 && (19661112 & var19[var14 + -1][var15 + -2 - -arg11]) == 0 && (19661070 & var19[var14 + -1][var15 + -1]) == 0 && (19661187 & var19[var14 + -1 + arg11 + -1][var15 + -1]) == 0) {
                int var36 = 1;
                while (true) {
                    if (~(arg11 + -1) >= ~var36) {
                        class150.field2617[var41] = var14 + -1;
                        class8.field123[var41] = var15 + -1;
                        class74.field1215[var14 + -1][var15 - 1] = 3;
                        var41 = 4095 & var41 + 1;
                        class19.field278[var14 + -1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 + -1][var15 - 1 + var36] & 19661118) != 0 || (19661199 & var19[var36 + -1 + var14][var15 + -1]) != 0) {
                        break;
                    }
                    ++var36;
                }
            }
            if (var14 < 102 && ~var15 < -1 && class74.field1215[var14 + 1][var15 + -1] == 0 && (19661070 & var19[var14 + 1][var15 + -1]) == 0 && ~(19661187 & var19[arg11 + var14][var15 - 1]) == -1 && (19661280 & var19[var14 - -arg11][var15 - (-arg11 + 1) + -1]) == 0) {
                int var37 = 1;
                while (true) {
                    if (~(arg11 - 1) >= ~var37) {
                        class150.field2617[var41] = var14 - -1;
                        class8.field123[var41] = var15 + -1;
                        class74.field1215[var14 + 1][var15 - 1] = 9;
                        var41 = 4095 & var41 + 1;
                        class19.field278[var14 - -1][var15 + -1] = var31;
                        break;
                    }
                    if ((19661283 & var19[var14 - -arg11][var15 + -1 + var37]) != 0 || ~(19661199 & var19[var14 + 1 - -var37][var15 - 1]) != -1) {
                        break;
                    }
                    ++var37;
                }
            }
            if (~var14 < -1 && var15 < 102 && ~class74.field1215[var14 + -1][var15 - -1] == -1 && ~(var19[var14 - 1][var15 + 1] & 19661070) == -1 && ~(var19[var14 - 1][arg11 + var15] & 19661112) == -1 && (var19[var14][arg11 + var15] & 19661280) == 0) {
                int var38 = 1;
                while (true) {
                    if (var38 >= arg11 + -1) {
                        class150.field2617[var41] = var14 + -1;
                        class8.field123[var41] = var15 + 1;
                        var41 = var41 + 1 & 4095;
                        class74.field1215[var14 + -1][var15 - -1] = 6;
                        class19.field278[var14 - 1][var15 + 1] = var31;
                        break;
                    }
                    if ((19661118 & var19[var14 - 1][var15 + 1 + var38]) != 0 || (19661304 & var19[var14 + var38 - 1][arg11 + var15]) != 0) {
                        break;
                    }
                    ++var38;
                }
            }
            if (~var14 > -103 && ~var15 > -103 && ~class74.field1215[var14 - -1][var15 + 1] == -1 && (var19[var14 + 1][var15 - -arg11] & 19661112) == 0 && (var19[var14 - -arg11][arg11 + var15] & 19661280) == 0 && ~(19661187 & var19[var14 - -arg11][var15 + 1]) == -1) {
                for (int var39 = 1; var39 < arg11 + -1; ++var39) {
                    if (~(19661304 & var19[var14 + 1 + var39][arg11 + var15]) != -1 || ~(var19[arg11 + var14][var15 + 1 + var39] & 19661283) != -1) {
                        continue label372;
                    }
                }
                class150.field2617[var41] = var14 + 1;
                class8.field123[var41] = var15 - -1;
                class74.field1215[var14 - -1][var15 + 1] = 12;
                var41 = 4095 & var41 + 1;
                class19.field278[var14 + 1][var15 + 1] = var31;
            }
        }
        class129.field2273 = 0;
        if (arg1 != -1) {
            field2932 = null;
        }
        if (!var18) {
            if (!arg10) {
                return false;
            }
            int var20 = 1000;
            byte var21 = 10;
            int var22 = 100;
            for (int var23 = -var21 + arg2; arg2 - -var21 >= var23; ++var23) {
                for (int var24 = arg4 - var21; ~(arg4 + var21) <= ~var24; ++var24) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && ~class19.field278[var23][var24] > -101) {
                        int var25 = 0;
                        if (~var24 <= ~arg4) {
                            if (arg4 - 1 + arg12 < var24) {
                                var25 = var24 - (arg4 + arg12 - 1);
                            }
                        } else {
                            var25 = -var24 + arg4;
                        }
                        int var26 = 0;
                        if (~var23 <= ~arg2) {
                            if (~var23 < ~(arg2 + arg9 + -1)) {
                                var26 = -arg2 + -arg9 + var23 + 1;
                            }
                        } else {
                            var26 = arg2 - var23;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (~var27 > ~var20 || ~var20 == ~var27 && ~class19.field278[var23][var24] > ~var22) {
                            var15 = var24;
                            var14 = var23;
                            var22 = class19.field278[var23][var24];
                            var20 = var27;
                        }
                    }
                }
            }
            if (~var20 == -1001) {
                return false;
            }
            if (arg8 == var14 && ~arg3 == ~var15) {
                return false;
            }
            class129.field2273 = 1;
        }
        byte var28 = 0;
        class150.field2617[var28] = var14;
        int var42 = var28 + 1;
        class8.field123[var28] = var15;
        int var29;
        int var30 = var29 = class74.field1215[var14][var15];
        while (~arg8 != ~var14 || arg3 != var15) {
            if (var29 != var30) {
                class150.field2617[var42] = var14;
                class8.field123[var42++] = var15;
                var29 = var30;
            }
            if (~(2 & var30) != -1) {
                ++var14;
            } else if (~(var30 & 8) != -1) {
                --var14;
            }
            if ((var30 & 1) == 0) {
                if ((var30 & 4) != 0) {
                    --var15;
                }
            } else {
                ++var15;
            }
            var30 = class74.field1215[var14][var15];
        }
        if (var42 > 0) {
            class167.method1147(var42, (byte) -125, arg0);
            return true;
        } else if (~arg0 == -2) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        ++field2913;
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field2927 = arg1.method608(arg0 ^ -20567);
            }
        } else {
            this.field2914 = arg1.method608(100);
        }
        if (arg0 != -20503) {
            field2929 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)Lr;")
    public static final class19 method1156(int arg0, int arg1) {
        if (arg1 != -22) {
            return null;
        } else {
            ++field2921;
            class19 var2 = (class19) class250.field4413.method252(true, (long) arg0);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class147.field2574.method775(arg0, 0, -24799);
                if (var3 == null) {
                    return null;
                } else {
                    class19 var4 = new class19();
                    class85 var5 = new class85(var3);
                    var5.field1392 = var5.field1381.length + -2;
                    int var6 = var5.method608(53);
                    int var7 = var5.field1381.length + -var6 - 2 + -12;
                    var5.field1392 = var7;
                    int var8 = var5.method568(19845);
                    var4.field274 = var5.method608(121);
                    var4.field269 = var5.method608(108);
                    var4.field267 = var5.method608(45);
                    var4.field268 = var5.method608(62);
                    int var9 = var5.method564((byte) 104);
                    if (var9 > 0) {
                        var4.field279 = new class276[var9];
                        for (int var10 = 0; ~var9 < ~var10; ++var10) {
                            int var11 = var5.method608(54);
                            class276 var12 = new class276(class181.method1214(var11, -1));
                            var4.field279[var10] = var12;
                            while (var11-- > 0) {
                                int var13 = var5.method568(19845);
                                int var14 = var5.method568(19845);
                                var12.method1867(true, (long) var13, new class216(var14));
                            }
                        }
                    }
                    var5.field1392 = 0;
                    int var15 = 0;
                    var4.field271 = var5.method585(9410);
                    var4.field272 = new int[var8];
                    var4.field270 = new int[var8];
                    var4.field265 = new class275[var8];
                    while (~var5.field1392 > ~var7) {
                        int var16 = var5.method608(54);
                        if (~var16 == -4) {
                            var4.field265[var15] = var5.method599(arg1 + 21);
                        } else if (~var16 > -101 && ~var16 != -22 && ~var16 != -39 && var16 != 39) {
                            var4.field272[var15] = var5.method568(class261.method1705(arg1, -19857));
                        } else {
                            var4.field272[var15] = var5.method564((byte) 49);
                        }
                        var4.field270[var15++] = var16;
                    }
                    class250.field4413.method251(var4, (byte) 69, (long) arg0);
                    return var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
    public class168() {
        super(1, true);
    }
}
