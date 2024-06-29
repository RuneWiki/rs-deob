import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public abstract class class311 extends class331 {

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "Lmn;")
    public class205 field4391;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "Llg;")
    public static class237 field4396;

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "Ltq;")
    public static class376 field4389;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field4399;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hl", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field4400;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hl", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field4401;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field4395;

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "[[Ljs;")
    public static class180[][] field4398;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2056(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class362("From", "Von:", "De", "De");
        field4397 = 0;
        field4396 = new class237(10);
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)V", line = 11)
    public static final void method2051(byte arg0) {
        field4388++;
        class237 var1 = class254.field3653;
        synchronized (class254.field3653) {
            class254.field3653.method1626((byte) 106);
        }
        class237 var2 = class43.field534;
        synchronized (class43.field534) {
            class43.field534.method1626((byte) 106);
            if (arg0 != 8) {
                field4398 = null;
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBIZZILp;IIILae;II)V", line = 28)
    public static final void method2052(int arg0, byte arg1, int arg2, boolean arg3, boolean arg4, int arg5, class119 arg6, int arg7, int arg8, int arg9, class134 arg10, int arg11, int arg12) {
        field4390++;
        if (!class12.method93(1) && !class310.method2050(arg7, (byte) -77, arg12, class422.field6035, arg2)) {
            return;
        }
        if (arg7 < class306.field4294) {
            class306.field4294 = arg7;
        }
        class88 var13 = class374.method2382(arg5, false);
        if (class26.field329 == 1 && var13.field1064) {
            return;
        }
        int var14;
        int var15;
        if (arg11 == 1 || arg11 == 3) {
            var14 = var13.field1029;
            var15 = var13.field1008;
        } else {
            var14 = var13.field1008;
            var15 = var13.field1029;
        }
        int var16;
        int var17;
        if (class176.field2403 < (arg2 + var14)) {
            var16 = arg2 + 1;
            var17 = arg2;
        } else {
            var17 = arg2 + (var14 >> 1);
            var16 = (var14 + 1 >> 1) + arg2;
        }
        int var18;
        int var19;
        if (class383.field5395 >= (arg12 + var15)) {
            var18 = (var15 + 1 >> 1) + arg12;
            var19 = (var15 >> 1) + arg12;
        } else {
            var18 = arg12 + 1;
            var19 = arg12;
        }
        class327 var20 = class161.field2122[arg9];
        int var21 = var20.method328(var17, var19) - (-var20.method328(var16, var19) - var20.method328(var17, var18)) + var20.method328(var16, var18) >> 2;
        int var22 = (arg2 << 7) + (var14 << 6);
        int var23 = (arg12 << 7) + (var15 << 6);
        boolean var24 = arg3 && !arg4 && var13.field1041;
        if (var13.method475(-27135)) {
            class3.method15((class77) null, arg7, var13, -115, arg11, arg12, (class40) null, arg2);
        }
        boolean var25 = arg8 == -1 && var13.field1057 == -1 && var13.field1005 == null && var13.field1068 == null && !var13.field1030;
        if (class34.field390 && var13.field1052 != 1) {
            return;
        }
        if (arg0 == 22) {
            if (class332.field4706 || var13.field998 != 0 || var13.field1003 == 1 || var13.field1073) {
                class46 var26;
                if (var25) {
                    class253 var27 = new class253(arg10, var13, arg9, var22, var21, var23, arg4, arg11, var24);
                    if (var27.method67(-3673)) {
                        var27.method72(-82, arg10);
                    }
                    var26 = var27;
                } else {
                    var26 = new class423(arg10, var13, arg11, arg7, arg9, var22, var21, var23, arg4, arg8);
                }
                class232.method1536(arg7, arg2, arg12, var26);
                if (var13.field1003 == 1 && arg6 != null) {
                    arg6.method744(arg12, -12854, arg2);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class444 var65 = null;
            int var67;
            class233 var68;
            if (var25) {
                class444 var66 = new class444(arg10, var13, arg7, arg9, var22, var21, var23, arg4, arg2, arg2 - (1 - var14), arg12, arg12 + var15 - 1, arg0, arg11, var24);
                var67 = var66.method2770(4);
                var65 = var66;
                var68 = var66;
            } else {
                var67 = 15;
                var68 = new class403(arg10, var13, arg0, arg11, arg7, arg9, var22, var21, var23, arg4, arg2, arg2 + var14 - 1, arg12, var15 + arg12 - 1, arg8);
            }
            if (class371.method2364(var68, false)) {
                if (var65 != null && var65.method67(-3673)) {
                    var65.method72(-84, arg10);
                }
                if (var13.field1065 && arg3) {
                    if (var67 > 30) {
                        var67 = 30;
                    }
                    for (int var69 = 0; var69 <= var14; var69++) {
                        for (int var70 = 0; var70 <= var15; var70++) {
                            var20.method341(arg2 + var69, arg12 + var70, var67);
                        }
                    }
                }
            }
            if (var13.field1003 != 0 && arg6 != null) {
                arg6.method751(arg12, var13.field1040, arg2, var15, !var13.field1069, var14, -10763);
            }
        } else if (arg0 >= 12 && arg0 <= 17 || arg0 >= 18 && arg0 <= 21) {
            class233 var29;
            if (var25) {
                class444 var28 = new class444(arg10, var13, arg7, arg9, var22, var21, var23, arg4, arg2, arg2 + var14 - 1, arg12, arg12 + var15 - 1, arg0, arg11, var24);
                var29 = var28;
                if (var28.method67(-3673)) {
                    var28.method72(98, arg10);
                }
            } else {
                var29 = new class403(arg10, var13, arg0, arg11, arg7, arg9, var22, var21, var23, arg4, arg2, arg2 + var14 - 1, arg12, arg12 + var15 - 1, arg8);
            }
            class371.method2364(var29, false);
            if (arg3 && !arg4 && arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg7 > 0 && var13.field1052 != 0) {
                class143.field1767[arg7][arg2][arg12] = (byte) class429.method2704(class143.field1767[arg7][arg2][arg12], 4);
            }
            if (var13.field1003 != 0 && arg6 != null) {
                arg6.method751(arg12, var13.field1040, arg2, var15, !var13.field1069, var14, -10763);
            }
        } else if (arg0 == 0) {
            class394 var30;
            if (var25) {
                class335 var31 = new class335(arg10, var13, arg9, var22, var21, var23, arg4, arg0, arg11, var24);
                var30 = var31;
                if (var31.method67(-3673)) {
                    var31.method72(117, arg10);
                }
            } else {
                var30 = new class254(arg10, var13, 0, arg11, arg7, arg9, var22, var21, var23, arg4, arg8);
            }
            class73.method413(arg7, arg2, arg12, var30, (class394) null);
            if (arg3) {
                if (arg11 == 0) {
                    if (var13.field1065) {
                        var20.method341(arg2, arg12, 50);
                        var20.method341(arg2, arg12 + 1, 50);
                    }
                    if (var13.field1052 == 1 && !arg4) {
                        class143.field1767[arg7][arg2][arg12] = (byte) class429.method2704(class143.field1767[arg7][arg2][arg12], 1);
                    }
                } else if (arg11 == 1) {
                    if (var13.field1065) {
                        var20.method341(arg2, arg12 + 1, 50);
                        var20.method341(arg2 + 1, arg12 + 1, 50);
                    }
                    if (var13.field1052 == 1 && !arg4) {
                        class143.field1767[arg7][arg2][arg12 + 1] = (byte) class429.method2704(class143.field1767[arg7][arg2][arg12 + 1], 2);
                    }
                } else if (arg11 == 2) {
                    if (var13.field1065) {
                        var20.method341(arg2 + 1, arg12, 50);
                        var20.method341(arg2 + 1, arg12 + 1, 50);
                    }
                    if (var13.field1052 == 1 && !arg4) {
                        class143.field1767[arg7][arg2 + 1][arg12] = (byte) class429.method2704(class143.field1767[arg7][arg2 + 1][arg12], 1);
                    }
                } else if (arg11 == 3) {
                    if (var13.field1065) {
                        var20.method341(arg2, arg12, 50);
                        var20.method341(arg2 + 1, arg12, 50);
                    }
                    if (var13.field1052 == 1 && !arg4) {
                        class143.field1767[arg7][arg2][arg12] = (byte) class429.method2704(class143.field1767[arg7][arg2][arg12], 2);
                    }
                }
            }
            if (var13.field1003 != 0 && arg6 != null) {
                arg6.method735(arg11, arg0, 1, arg2, var13.field1040, !var13.field1069, arg12);
            }
            if (var13.field1055 != 16) {
                class369.method2350(arg7, arg2, arg12, var13.field1055);
            }
        } else if (arg0 == 1) {
            class394 var32;
            if (var25) {
                class335 var33 = new class335(arg10, var13, arg9, var22, var21, var23, arg4, arg0, arg11, var24);
                if (var33.method67(-3673)) {
                    var33.method72(-119, arg10);
                }
                var32 = var33;
            } else {
                var32 = new class254(arg10, var13, 1, arg11, arg7, arg9, var22, var21, var23, arg4, arg8);
            }
            class73.method413(arg7, arg2, arg12, var32, (class394) null);
            if (var13.field1065 && arg3) {
                if (arg11 == 0) {
                    var20.method341(arg2, arg12 + 1, 50);
                } else if (arg11 == 1) {
                    var20.method341(arg2 + 1, arg12 + 1, 50);
                } else if (arg11 == 2) {
                    var20.method341(arg2 + 1, arg12, 50);
                } else if (arg11 == 3) {
                    var20.method341(arg2, arg12, 50);
                }
            }
            if (var13.field1003 != 0 && arg6 != null) {
                arg6.method735(arg11, arg0, 1, arg2, var13.field1040, !var13.field1069, arg12);
            }
        } else if (arg0 == 2) {
            int var34 = arg11 + 1 & 0x3;
            class394 var37;
            class394 var38;
            if (var25) {
                class335 var35 = new class335(arg10, var13, arg9, var22, var21, var23, arg4, arg0, arg11 + 4, var24);
                class335 var36 = new class335(arg10, var13, arg9, var22, var21, var23, arg4, arg0, var34, var24);
                if (var35.method67(-3673)) {
                    var35.method72(-97, arg10);
                }
                var37 = var35;
                if (var36.method67(-3673)) {
                    var36.method72(-64, arg10);
                }
                var38 = var36;
            } else {
                var37 = new class254(arg10, var13, 2, arg11 + 4, arg7, arg9, var22, var21, var23, arg4, arg8);
                var38 = new class254(arg10, var13, 2, var34, arg7, arg9, var22, var21, var23, arg4, arg8);
            }
            class73.method413(arg7, arg2, arg12, var37, var38);
            if (var13.field1052 == 1 && arg3 && !arg4) {
                if (arg11 == 0) {
                    class143.field1767[arg7][arg2][arg12] = (byte) class429.method2704(class143.field1767[arg7][arg2][arg12], 1);
                    class143.field1767[arg7][arg2][arg12 + 1] = (byte) class429.method2704(class143.field1767[arg7][arg2][arg12 + 1], 2);
                } else if (arg11 == 1) {
                    class143.field1767[arg7][arg2][arg12 + 1] = (byte) class429.method2704(class143.field1767[arg7][arg2][arg12 + 1], 2);
                    class143.field1767[arg7][arg2 + 1][arg12] = (byte) class429.method2704(class143.field1767[arg7][arg2 + 1][arg12], 1);
                } else if (arg11 == 2) {
                    class143.field1767[arg7][arg2 + 1][arg12] = (byte) class429.method2704(class143.field1767[arg7][arg2 + 1][arg12], 1);
                    class143.field1767[arg7][arg2][arg12] = (byte) class429.method2704(class143.field1767[arg7][arg2][arg12], 2);
                } else if (arg11 == 3) {
                    class143.field1767[arg7][arg2][arg12] = (byte) class429.method2704(class143.field1767[arg7][arg2][arg12], 2);
                    class143.field1767[arg7][arg2][arg12] = (byte) class429.method2704(class143.field1767[arg7][arg2][arg12], 1);
                }
            }
            if (var13.field1003 != 0 && arg6 != null) {
                arg6.method735(arg11, arg0, 1, arg2, var13.field1040, !var13.field1069, arg12);
            }
            if (var13.field1055 != 16) {
                class369.method2350(arg7, arg2, arg12, var13.field1055);
            }
        } else if (arg0 == 3) {
            class394 var40;
            if (var25) {
                class335 var39 = new class335(arg10, var13, arg9, var22, var21, var23, arg4, arg0, arg11, var24);
                var40 = var39;
                if (var39.method67(-3673)) {
                    var39.method72(76, arg10);
                }
            } else {
                var40 = new class254(arg10, var13, 3, arg11, arg7, arg9, var22, var21, var23, arg4, arg8);
            }
            class73.method413(arg7, arg2, arg12, var40, (class394) null);
            if (var13.field1065 && arg3) {
                if (arg11 == 0) {
                    var20.method341(arg2, arg12 + 1, 50);
                } else if (arg11 == 1) {
                    var20.method341(arg2 + 1, arg12 + 1, 50);
                } else if (arg11 == 2) {
                    var20.method341(arg2 + 1, arg12, 50);
                } else if (arg11 == 3) {
                    var20.method341(arg2, arg12, 50);
                }
            }
            if (var13.field1003 != 0 && arg6 != null) {
                arg6.method735(arg11, arg0, 1, arg2, var13.field1040, !var13.field1069, arg12);
            }
        } else if (arg0 == 9) {
            class233 var41;
            if (var25) {
                class444 var42 = new class444(arg10, var13, arg7, arg9, var22, var21, var23, arg4, arg2, arg2, arg12, arg12, arg0, arg11, var24);
                var41 = var42;
                if (var42.method67(-3673)) {
                    var42.method72(99, arg10);
                }
            } else {
                var41 = new class403(arg10, var13, arg0, arg11, arg7, arg9, var22, var21, var23, arg4, arg2, arg2 + var14 - 1, arg12, arg12 + var15 - 1, arg8);
            }
            class371.method2364(var41, false);
            if (var13.field1003 != 0 && arg6 != null) {
                arg6.method751(arg12, var13.field1040, arg2, var15, !var13.field1069, var14, -10763);
            }
            if (var13.field1055 != 16) {
                class369.method2350(arg7, arg2, arg12, var13.field1055);
            }
        } else if (arg0 == 4) {
            class48 var43;
            if (var25) {
                class297 var44 = new class297(arg10, var13, arg9, var22, var21, var23, arg4, 0, 0, 0, arg0, arg11);
                if (var44.method67(-3673)) {
                    var44.method72(87, arg10);
                }
                var43 = var44;
            } else {
                var43 = new class420(arg10, var13, arg0, arg11, arg7, arg9, var22, var21, var23, arg4, 0, 0, 0, arg8);
            }
            class28.method193(arg7, arg2, arg12, var43, (class48) null);
        } else if (arg1 >= 50) {
            if (arg0 == 5) {
                int var45 = 16;
                class9 var46 = (class9) class137.method847(arg7, arg2, arg12);
                if (var46 != null) {
                    var45 = class374.method2382(var46.method71((byte) -110), false).field1055;
                }
                class48 var47;
                if (var25) {
                    class297 var48 = new class297(arg10, var13, arg9, var22, var21, var23, arg4, 0, class332.field4699[arg11] * var45, class421.field6015[arg11] * var45, arg0, arg11);
                    if (var48.method67(-3673)) {
                        var48.method72(-120, arg10);
                    }
                    var47 = var48;
                } else {
                    var47 = new class420(arg10, var13, arg0, arg11, arg7, arg9, var22, var21, var23, arg4, 0, class332.field4699[arg11] * var45, class421.field6015[arg11] * var45, arg8);
                }
                class28.method193(arg7, arg2, arg12, var47, (class48) null);
            } else if (arg0 == 6) {
                int var49 = 8;
                class9 var50 = (class9) class137.method847(arg7, arg2, arg12);
                if (var50 != null) {
                    var49 = class374.method2382(var50.method71((byte) -116), false).field1055 / 2;
                }
                class48 var52;
                if (var25) {
                    class297 var51 = new class297(arg10, var13, arg9, var22, var21, var23, arg4, arg11, class332.field4699[arg11] * var49, class421.field6015[arg11] * var49, arg0, arg11 + 4);
                    if (var51.method67(-3673)) {
                        var51.method72(67, arg10);
                    }
                    var52 = var51;
                } else {
                    var52 = new class420(arg10, var13, arg0, arg11 + 4, arg7, arg9, var22, var21, var23, arg4, arg11, class207.field2951[arg11] * var49, class339.field4808[arg11] * var49, arg8);
                }
                class28.method193(arg7, arg2, arg12, var52, (class48) null);
            } else if (arg0 == 7) {
                int var53 = arg11 + 2 & 0x3;
                class48 var55;
                if (var25) {
                    class297 var54 = new class297(arg10, var13, arg9, var22, var21, var23, arg4, var53, 0, 0, arg0, var53 + 4);
                    var55 = var54;
                    if (var54.method67(-3673)) {
                        var54.method72(98, arg10);
                    }
                } else {
                    var55 = new class420(arg10, var13, arg0, var53 + 4, arg7, arg9, var22, var21, var23, arg4, var53, 0, 0, arg8);
                }
                class28.method193(arg7, arg2, arg12, var55, (class48) null);
            } else if (arg0 == 8) {
                int var56 = arg11 + 2 & 0x3;
                int var57 = 8;
                class9 var58 = (class9) class137.method847(arg7, arg2, arg12);
                if (var58 != null) {
                    var57 = class374.method2382(var58.method71((byte) -106), false).field1055 / 2;
                }
                class48 var61;
                class48 var62;
                if (var25) {
                    class297 var59 = new class297(arg10, var13, arg9, var22, var21, var23, arg4, arg11, class207.field2951[arg11] * var57, class339.field4808[arg11] * var57, arg0, arg11 + 4);
                    class297 var60 = new class297(arg10, var13, arg9, var22, var21, var23, arg4, arg11, 0, 0, arg0, var56 + 4);
                    if (var59.method67(-3673)) {
                        var59.method72(88, arg10);
                    }
                    if (var60.method67(-3673)) {
                        var60.method72(-56, arg10);
                    }
                    var61 = var60;
                    var62 = var59;
                } else {
                    class420 var63 = new class420(arg10, var13, arg0, arg11 + 4, arg7, arg9, var22, var21, var23, arg4, arg11, class207.field2951[arg11] * var57, class339.field4808[arg11] * var57, arg8);
                    class420 var64 = new class420(arg10, var13, arg0, var56 + 4, arg7, arg9, var22, var21, var23, arg4, arg11, 0, 0, arg8);
                    var62 = var63;
                    var61 = var64;
                }
                class28.method193(arg7, arg2, arg12, var62, var61);
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)V", line = 648)
    public static void method2053(int arg0) {
        field4396 = null;
        field4389 = null;
        field4398 = null;
        field4395 = null;
        int var1 = 102 / ((-arg0 - 73) / 48);
    }

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)V", line = 660)
    public static final void method2054(int arg0) {
        field4392++;
        class237 var1 = class88.field1039;
        synchronized (class88.field1039) {
            class88.field1039.method1618(arg0 + 1);
        }
        if (arg0 != -1) {
            field4398 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lmn;)V", line = 672)
    public class311(class205 arg0) {
        this.field4391 = arg0;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/awt/Canvas;Lul;IIBLrd;)Lae;", line = 681)
    public static final class134 method2055(Canvas arg0, class343 arg1, int arg2, int arg3, byte arg4, class185 arg5) {
        field4394++;
        try {
            if (arg4 == 53) {
                Class var6 = Class.forName("ao");
                Constructor var7 = var6.getConstructor(field4399 == null ? (field4399 = method2056("java.awt.Canvas")) : field4399, field4400 == null ? (field4400 = method2056("ul")) : field4400, Integer.TYPE, Integer.TYPE, field4401 == null ? (field4401 = method2056("rd")) : field4401);
                return (class134) var7.newInstance(arg0, arg1, Integer.valueOf(arg3), new Integer(arg2), arg5);
            } else {
                return null;
            }
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(I)Z")
    public abstract boolean method422(int arg0);

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method423(int arg0);
}
