import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class124 extends class70 {

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "Lqf;")
    private static class117 field2915 = class72.method514(113, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "Lqf;")
    public static class117 field2921 = class72.method514(100, "@cr2@");

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "[I")
    public static int[] field2923 = new int[50];

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    public static int field2922 = 0;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
    public static int field2920 = 20;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public static int field2924 = 0;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
    public static volatile int field2931 = 0;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "Lqf;")
    public static class117 field2925 = class72.method514(115, "Neuer Benutzer");

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "I")
    public static int field2933 = -1;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "I")
    public static volatile int field2916 = -1;

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "Lqf;")
    public static class117 field2932 = class72.method514(112, ":tradereq:");

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "Lqf;")
    public static class117 field2930 = field2915;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    public int field2929;

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!rf", name = "cb", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "Lca;")
    public class16 field2914;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "Lha;")
    public class50 field2918;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "[B")
    public byte[] field2927;

    @OriginalMember(owner = "client!rf", name = "bb", descriptor = "[Lma;")
    public static class84[] field2936;

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "[[I")
    public static int[][] field2935;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V")
    public static final void method982(byte arg0) {
        class134.field3186.method214(8);
        class76.field1677.method951(0, 0);
        class12.method95();
        if (arg0 > -110) {
            method988(-52, (byte) 64, null);
        }
        field2926++;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILqb;IILtd;IBI)V")
    public static final void method983(int arg0, int arg1, class113 arg2, int arg3, int arg4, class135 arg5, int arg6, byte arg7, int arg8) {
        field2928++;
        if (class20.field334 && (class73.field1606[0][arg3][arg1] & 0x2) == 0) {
            if ((class73.field1606[arg8][arg3][arg1] & 0x10) != 0) {
                return;
            }
            if (class114.method887(arg8, (byte) -98, arg3, arg1) != class67.field1399) {
                return;
            }
        }
        if (arg8 < class21.field362) {
            class21.field362 = arg8;
        }
        int var9 = class64.field1306[arg8][arg3][arg1];
        int var10 = class64.field1306[arg8][arg3 + 1][arg1];
        int var11 = class64.field1306[arg8][arg3 + 1][arg1 + 1];
        int var12 = class64.field1306[arg8][arg3][arg1 + 1];
        int var13 = var11 + var12 + var9 + var10 >> 2;
        int var14 = (arg4 << 14) + (arg1 << 7) + arg3 + 1073741824;
        class148 var15 = class23.method181((byte) -123, arg4);
        int var16 = (arg0 << 6) + arg6;
        if (var15.field3627 == 0) {
            var14 += Integer.MIN_VALUE;
        }
        if (var15.field3618 == 1) {
            var16 += 256;
        }
        if (var15.method1180(-89)) {
            class52.method386(14072, arg3, var15, arg8, arg0, arg1);
        }
        if (arg6 == 22) {
            if (!class20.field334 || var15.field3627 != 0 || var15.field3643 == 1 || var15.field3639) {
                class34 var17;
                if (var15.field3644 == -1 && var15.field3653 == null) {
                    var17 = var15.method1194(-917, var12, arg0, var9, var11, 22, var10);
                } else {
                    var17 = new class8(arg4, 22, arg0, var9, var10, var11, var12, var15.field3644, true, null);
                }
                arg2.method877(arg8, arg3, arg1, var13, var17, var14, var16);
                if (var15.field3643 == 1 && arg5 != null) {
                    arg5.method1045(arg3, 262144, arg1);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class34 var37;
            if (var15.field3644 == -1 && var15.field3653 == null) {
                var37 = var15.method1194(-917, var12, arg0, var9, var11, 10, var10);
            } else {
                var37 = new class8(arg4, 10, arg0, var9, var10, var11, var12, var15.field3644, true, null);
            }
            if (var37 != null) {
                int var38;
                int var39;
                if (arg0 == 1 || arg0 == 3) {
                    var39 = var15.field3665;
                    var38 = var15.field3649;
                } else {
                    var38 = var15.field3665;
                    var39 = var15.field3649;
                }
                int var40 = 0;
                if (arg6 == 11) {
                    var40 += 256;
                }
                if (arg2.method849(arg8, arg3, arg1, var13, var38, var39, var37, var40, var14, var16) && var15.field3614) {
                    int var41 = 15;
                    if (var37 instanceof class30) {
                        var41 = ((class30) var37).method234() / 4;
                        if (var41 > 30) {
                            var41 = 30;
                        }
                    }
                    for (int var42 = 0; var42 <= var38; var42++) {
                        for (int var43 = 0; var43 <= var39; var43++) {
                            if (var41 > class16.field258[arg8][arg3 + var42][arg1 + var43]) {
                                class16.field258[arg8][arg3 + var42][arg1 + var43] = (byte) var41;
                            }
                        }
                    }
                }
            }
            if (var15.field3643 != 0 && arg5 != null) {
                arg5.method1044(var15.field3665, (byte) -128, var15.field3668, arg1, arg3, var15.field3649, arg0);
            }
        } else if (arg6 >= 12) {
            class34 var18;
            if (var15.field3644 == -1 && var15.field3653 == null) {
                var18 = var15.method1194(-917, var12, arg0, var9, var11, arg6, var10);
            } else {
                var18 = new class8(arg4, arg6, arg0, var9, var10, var11, var12, var15.field3644, true, null);
            }
            arg2.method849(arg8, arg3, arg1, var13, 1, 1, var18, 0, var14, var16);
            if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg8 > 0) {
                class32.field696[arg8][arg3][arg1] = class96.method763(class32.field696[arg8][arg3][arg1], 2340);
            }
            if (var15.field3643 != 0 && arg5 != null) {
                arg5.method1044(var15.field3665, (byte) 104, var15.field3668, arg1, arg3, var15.field3649, arg0);
            }
        } else if (arg6 == 0) {
            class34 var19;
            if (var15.field3644 == -1 && var15.field3653 == null) {
                var19 = var15.method1194(-917, var12, arg0, var9, var11, 0, var10);
            } else {
                var19 = new class8(arg4, 0, arg0, var9, var10, var11, var12, var15.field3644, true, null);
            }
            arg2.method882(arg8, arg3, arg1, var13, var19, null, class15.field214[arg0], 0, var14, var16);
            if (arg0 == 0) {
                if (var15.field3614) {
                    class16.field258[arg8][arg3][arg1] = 50;
                    class16.field258[arg8][arg3][arg1 + 1] = 50;
                }
                if (var15.field3672) {
                    class32.field696[arg8][arg3][arg1] = class96.method763(class32.field696[arg8][arg3][arg1], 585);
                }
            } else if (arg0 == 1) {
                if (var15.field3614) {
                    class16.field258[arg8][arg3][arg1 + 1] = 50;
                    class16.field258[arg8][arg3 + 1][arg1 + 1] = 50;
                }
                if (var15.field3672) {
                    class32.field696[arg8][arg3][arg1 + 1] = class96.method763(class32.field696[arg8][arg3][arg1 + 1], 1170);
                }
            } else if (arg0 == 2) {
                if (var15.field3614) {
                    class16.field258[arg8][arg3 + 1][arg1] = 50;
                    class16.field258[arg8][arg3 + 1][arg1 + 1] = 50;
                }
                if (var15.field3672) {
                    class32.field696[arg8][arg3 + 1][arg1] = class96.method763(class32.field696[arg8][arg3 + 1][arg1], 585);
                }
            } else if (arg0 == 3) {
                if (var15.field3614) {
                    class16.field258[arg8][arg3][arg1] = 50;
                    class16.field258[arg8][arg3 + 1][arg1] = 50;
                }
                if (var15.field3672) {
                    class32.field696[arg8][arg3][arg1] = class96.method763(class32.field696[arg8][arg3][arg1], 1170);
                }
            }
            if (var15.field3643 != 0 && arg5 != null) {
                arg5.method1053(var15.field3668, 2, arg3, arg0, arg1, arg6);
            }
            if (var15.field3658 != 16) {
                arg2.method845(arg8, arg3, arg1, var15.field3658);
            }
        } else if (arg6 == 1) {
            class34 var20;
            if (var15.field3644 == -1 && var15.field3653 == null) {
                var20 = var15.method1194(-917, var12, arg0, var9, var11, 1, var10);
            } else {
                var20 = new class8(arg4, 1, arg0, var9, var10, var11, var12, var15.field3644, true, null);
            }
            arg2.method882(arg8, arg3, arg1, var13, var20, null, class69.field1438[arg0], 0, var14, var16);
            if (var15.field3614) {
                if (arg0 == 0) {
                    class16.field258[arg8][arg3][arg1 + 1] = 50;
                } else if (arg0 == 1) {
                    class16.field258[arg8][arg3 + 1][arg1 + 1] = 50;
                } else if (arg0 == 2) {
                    class16.field258[arg8][arg3 + 1][arg1] = 50;
                } else if (arg0 == 3) {
                    class16.field258[arg8][arg3][arg1] = 50;
                }
            }
            if (var15.field3643 != 0 && arg5 != null) {
                arg5.method1053(var15.field3668, 2, arg3, arg0, arg1, arg6);
            }
        } else if (arg6 == 2) {
            int var21 = arg0 + 1 & 0x3;
            class34 var22;
            class34 var23;
            if (var15.field3644 == -1 && var15.field3653 == null) {
                var22 = var15.method1194(-917, var12, arg0 + 4, var9, var11, 2, var10);
                var23 = var15.method1194(-917, var12, var21, var9, var11, 2, var10);
            } else {
                var22 = new class8(arg4, 2, arg0 + 4, var9, var10, var11, var12, var15.field3644, true, null);
                var23 = new class8(arg4, 2, var21, var9, var10, var11, var12, var15.field3644, true, null);
            }
            arg2.method882(arg8, arg3, arg1, var13, var22, var23, class15.field214[arg0], class15.field214[var21], var14, var16);
            if (var15.field3672) {
                if (arg0 == 0) {
                    class32.field696[arg8][arg3][arg1] = class96.method763(class32.field696[arg8][arg3][arg1], 585);
                    class32.field696[arg8][arg3][arg1 + 1] = class96.method763(class32.field696[arg8][arg3][arg1 + 1], 1170);
                } else if (arg0 == 1) {
                    class32.field696[arg8][arg3][arg1 + 1] = class96.method763(class32.field696[arg8][arg3][arg1 + 1], 1170);
                    class32.field696[arg8][arg3 + 1][arg1] = class96.method763(class32.field696[arg8][arg3 + 1][arg1], 585);
                } else if (arg0 == 2) {
                    class32.field696[arg8][arg3 + 1][arg1] = class96.method763(class32.field696[arg8][arg3 + 1][arg1], 585);
                    class32.field696[arg8][arg3][arg1] = class96.method763(class32.field696[arg8][arg3][arg1], 1170);
                } else if (arg0 == 3) {
                    class32.field696[arg8][arg3][arg1] = class96.method763(class32.field696[arg8][arg3][arg1], 1170);
                    class32.field696[arg8][arg3][arg1] = class96.method763(class32.field696[arg8][arg3][arg1], 585);
                }
            }
            if (var15.field3643 != 0 && arg5 != null) {
                arg5.method1053(var15.field3668, 2, arg3, arg0, arg1, arg6);
            }
            if (var15.field3658 != 16) {
                arg2.method845(arg8, arg3, arg1, var15.field3658);
            }
        } else if (arg6 == 3) {
            class34 var24;
            if (var15.field3644 == -1 && var15.field3653 == null) {
                var24 = var15.method1194(-917, var12, arg0, var9, var11, 3, var10);
            } else {
                var24 = new class8(arg4, 3, arg0, var9, var10, var11, var12, var15.field3644, true, null);
            }
            arg2.method882(arg8, arg3, arg1, var13, var24, null, class69.field1438[arg0], 0, var14, var16);
            if (var15.field3614) {
                if (arg0 == 0) {
                    class16.field258[arg8][arg3][arg1 + 1] = 50;
                } else if (arg0 == 1) {
                    class16.field258[arg8][arg3 + 1][arg1 + 1] = 50;
                } else if (arg0 == 2) {
                    class16.field258[arg8][arg3 + 1][arg1] = 50;
                } else if (arg0 == 3) {
                    class16.field258[arg8][arg3][arg1] = 50;
                }
            }
            if (var15.field3643 != 0 && arg5 != null) {
                arg5.method1053(var15.field3668, 2, arg3, arg0, arg1, arg6);
            }
        } else {
            if (arg7 < 58) {
                field2930 = null;
            }
            if (arg6 == 9) {
                class34 var25;
                if (var15.field3644 == -1 && var15.field3653 == null) {
                    var25 = var15.method1194(-917, var12, arg0, var9, var11, arg6, var10);
                } else {
                    var25 = new class8(arg4, arg6, arg0, var9, var10, var11, var12, var15.field3644, true, null);
                }
                arg2.method849(arg8, arg3, arg1, var13, 1, 1, var25, 0, var14, var16);
                if (var15.field3643 != 0 && arg5 != null) {
                    arg5.method1044(var15.field3665, (byte) 107, var15.field3668, arg1, arg3, var15.field3649, arg0);
                }
            } else {
                if (var15.field3670) {
                    if (arg0 == 1) {
                        int var29 = var12;
                        var12 = var11;
                        var11 = var10;
                        var10 = var9;
                        var9 = var29;
                    } else if (arg0 == 2) {
                        int var26 = var12;
                        var12 = var10;
                        var10 = var26;
                        int var27 = var11;
                        var11 = var9;
                        var9 = var27;
                    } else if (arg0 == 3) {
                        int var28 = var12;
                        var12 = var9;
                        var9 = var10;
                        var10 = var11;
                        var11 = var28;
                    }
                }
                if (arg6 == 4) {
                    class34 var30;
                    if (var15.field3644 == -1 && var15.field3653 == null) {
                        var30 = var15.method1194(-917, var12, 0, var9, var11, 4, var10);
                    } else {
                        var30 = new class8(arg4, 4, 0, var9, var10, var11, var12, var15.field3644, true, null);
                    }
                    arg2.method864(arg8, arg3, arg1, var13, var30, class15.field214[arg0], arg0 * 512, 0, 0, var14, var16);
                } else if (arg6 == 5) {
                    int var31 = 16;
                    int var32 = arg2.method846(arg8, arg3, arg1);
                    if (var32 != 0) {
                        var31 = class23.method181((byte) -127, var32 >> 14 & 0x7FFF).field3658;
                    }
                    class34 var33;
                    if (var15.field3644 == -1 && var15.field3653 == null) {
                        var33 = var15.method1194(-917, var12, 0, var9, var11, 4, var10);
                    } else {
                        var33 = new class8(arg4, 4, 0, var9, var10, var11, var12, var15.field3644, true, null);
                    }
                    arg2.method864(arg8, arg3, arg1, var13, var33, class15.field214[arg0], arg0 * 512, class26.field513[arg0] * var31, class102.field2470[arg0] * var31, var14, var16);
                } else if (arg6 == 6) {
                    class34 var34;
                    if (var15.field3644 == -1 && var15.field3653 == null) {
                        var34 = var15.method1194(-917, var12, 0, var9, var11, 4, var10);
                    } else {
                        var34 = new class8(arg4, 4, 0, var9, var10, var11, var12, var15.field3644, true, null);
                    }
                    arg2.method864(arg8, arg3, arg1, var13, var34, 256, arg0, 0, 0, var14, var16);
                } else if (arg6 == 7) {
                    class34 var35;
                    if (var15.field3644 == -1 && var15.field3653 == null) {
                        var35 = var15.method1194(-917, var12, 0, var9, var11, 4, var10);
                    } else {
                        var35 = new class8(arg4, 4, 0, var9, var10, var11, var12, var15.field3644, true, null);
                    }
                    arg2.method864(arg8, arg3, arg1, var13, var35, 512, arg0, 0, 0, var14, var16);
                } else if (arg6 == 8) {
                    class34 var36;
                    if (var15.field3644 == -1 && var15.field3653 == null) {
                        var36 = var15.method1194(-917, var12, 0, var9, var11, 4, var10);
                    } else {
                        var36 = new class8(arg4, 4, 0, var9, var10, var11, var12, var15.field3644, true, null);
                    }
                    arg2.method864(arg8, arg3, arg1, var13, var36, 768, arg0, 0, 0, var14, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBLjb;)Lk;")
    public static final class69 method984(int arg0, byte arg1, class64 arg2) {
        field2917++;
        byte[] var3 = arg2.method455((byte) 26, arg0);
        if (var3 == null) {
            return null;
        } else {
            int var4 = -114 / ((arg1 + 44) / 43);
            return new class69(var3);
        }
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
    public static final void method985(int arg0) {
        if (class126.field2977 != null) {
            class126.field2977.method738(1);
        }
        if (arg0 != -1) {
            method984(92, (byte) -119, null);
        }
        field2937++;
    }

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "(I)V")
    public static final void method986(int arg0) {
        field2934++;
        if (arg0 != 7962) {
            return;
        }
        for (class81 var1 = (class81) class129.field3056.method27(18823); var1 != null; var1 = (class81) class129.field3056.method25((byte) -127)) {
            if (class140.field3344 != var1.field1841 || var1.field1857) {
                var1.method495(-26);
            } else if (var1.field1856 <= class43.field856) {
                var1.method630(82, class83.field1911);
                if (var1.field1857) {
                    var1.method495(arg0 ^ 0xFFFFE0C7);
                } else {
                    class19.field311.method868(var1.field1841, var1.field1836, var1.field1840, var1.field1861, 60, var1, 0, -1, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "(I)V")
    public static void method987(int arg0) {
        field2935 = null;
        field2936 = null;
        field2915 = null;
        field2921 = null;
        if (arg0 == 585) {
            field2923 = null;
            field2932 = null;
            field2930 = null;
            field2925 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBLmd;)V")
    public static final void method988(int arg0, byte arg1, class87 arg2) {
        field2919++;
        if (arg2.field2013 > class43.field856) {
            class80.method625(arg2, -125);
        } else if (class43.field856 <= arg2.field1976) {
            class34.method267((byte) -30, arg2);
        } else {
            class66.method473(arg2, -123);
        }
        if (arg2.field1998 < 128 || arg2.field1960 < 128 || arg2.field1998 >= 13184 || arg2.field1960 >= 13184) {
            arg2.field1976 = 0;
            arg2.field2014 = -1;
            arg2.field1998 = arg2.field2004[0] * 128 + arg2.field2009 * 64;
            arg2.field2013 = 0;
            arg2.field2017 = -1;
            arg2.field1960 = arg2.field1970[0] * 128 + arg2.field2009 * 64;
            arg2.method693((byte) -116);
        }
        if (class141.field3395 == arg2 && (arg2.field1998 < 1536 || arg2.field1960 < 1536 || arg2.field1998 >= 11776 || arg2.field1960 >= 11776)) {
            arg2.field2013 = 0;
            arg2.field2017 = -1;
            arg2.field1960 = arg2.field1970[0] * 128 + arg2.field2009 * 64;
            arg2.field2014 = -1;
            arg2.field1998 = arg2.field2004[0] * 128 + arg2.field2009 * 64;
            arg2.field1976 = 0;
            arg2.method693((byte) -103);
        }
        int var3 = -71 % ((-arg1 - 20) / 49);
        class18.method148((byte) 70, arg2);
        class150.method1206(arg2, (byte) 109);
    }
}
