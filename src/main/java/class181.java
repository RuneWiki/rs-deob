import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class181 {

    @OriginalMember(owner = "client!q", name = "b", descriptor = "[Ldh;")
    public static class134[] field2699 = new class134[14];

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2704 = "white:";

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Lfe;")
    public static class248 field2702 = new class248(64);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 12)
    public static void method1253(int arg0) {
        int var1 = 68 / ((arg0 + 88) / 34);
        field2704 = null;
        field2699 = null;
        field2702 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)V", line = 35)
    public static final void method1254(byte arg0, int arg1) {
        field2698++;
        class159.field2383 = arg1;
        if (arg0 <= -12) {
            class167.method1167(26022, 3);
            class167.method1167(26022, 4);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I[Lla;BIZIII[BII)V", line = 53)
    public static final void method1255(int arg0, class191[] arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        byte var11;
        if (arg4) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        field2700++;
        if (!arg4) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if ((arg10 + var12) > 0 && arg10 + var12 < 103 && (arg3 + var13) > 0 && (arg3 + var13) < 103) {
                        arg1[arg6].field2857[arg10 + var12][arg3 + var13] = class124.method893(arg1[arg6].field2857[arg10 + var12][arg3 + var13], -16777217);
                    }
                }
            }
        }
        if (arg2 != 87) {
            return;
        }
        class263 var14 = new class263(arg8);
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg0 == var15 && var16 >= arg7 && var16 < arg7 + 8 && var17 >= arg9 && (arg9 + 8) > var17) {
                        class288.method1999(-1, arg6, 0, 0, class292.method2046(var17 & 0x7, arg5, (byte) -11, var16 & 0x7) + arg3, var14, class281.method1962(var17 & 0x7, var16 & 0x7, -1, arg5) + arg10, arg4, arg5);
                    } else {
                        class288.method1999(-1, 0, 0, 0, -1, var14, -1, arg4, 0);
                    }
                }
            }
        }
        boolean var18 = false;
        while (var14.field3986.length > var14.field4025) {
            int var19 = var14.method1787(false);
            if (var19 != 129) {
                var14.field4025--;
                break;
            }
            for (int var20 = 0; var20 < 4; var20++) {
                byte var21 = var14.method1810((byte) 100);
                if (var21 == 0) {
                    if (arg0 >= var20) {
                        int var29 = arg10 + 7;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 >= 104) {
                            var29 = 104;
                        }
                        int var30 = arg3 + 7;
                        int var31 = arg10;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 >= 104) {
                            var30 = 104;
                        }
                        int var32 = arg3;
                        if (arg10 < 0) {
                            var31 = 0;
                        } else if (arg10 >= 104) {
                            var31 = 104;
                        }
                        if (arg3 < 0) {
                            var32 = 0;
                        } else if (arg3 >= 104) {
                            var32 = 104;
                        }
                        while (var31 < var29) {
                            while (var30 > var32) {
                                class187.field2783[arg6][var31][var32] = 0;
                                var32++;
                            }
                            var31++;
                        }
                    }
                } else if (var21 == 1) {
                    for (int var22 = 0; var22 < 64; var22 += 4) {
                        for (int var23 = 0; var23 < 64; var23 += 4) {
                            byte var24 = var14.method1810((byte) 111);
                            if (arg0 >= var20) {
                                for (int var25 = var22; var25 < var22 + 4; var25++) {
                                    for (int var26 = var23; var26 < var23 + 4; var26++) {
                                        if (var25 >= arg7 && var25 < arg7 + 8 && var26 >= arg9 && (arg9 + 8) > arg9) {
                                            int var27 = class281.method1962(var26 & 0x7, var25 & 0x7, -1, arg5) + arg10;
                                            int var28 = arg3 + class292.method2046(var26 & 0x7, arg5, (byte) -11, var25 & 0x7);
                                            if (var27 >= 0 && var27 < 104 && var28 >= 0 && var28 < 104) {
                                                class187.field2783[arg6][var27][var28] = var24;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (var21 == 2) {
                }
            }
        }
        if (class117.field1817 && !arg4) {
            class183 var33 = null;
            label217: while (true) {
                int var35;
                label210: do {
                    while (var14.field3986.length > var14.field4025) {
                        int var34 = var14.method1787(false);
                        if (var34 != 0) {
                            if (var34 != 1) {
                                throw new IllegalStateException();
                            }
                            var35 = var14.method1787(false);
                            continue label210;
                        }
                        var33 = new class183(var14);
                    }
                    if (var33 == null) {
                        var33 = new class183();
                    }
                    class38.field462[arg10 >> 3][arg3 >> 3] = var33;
                    break label217;
                } while (var35 <= 0);
                for (int var36 = 0; var36 < var35; var36++) {
                    class266 var37 = new class266(var14);
                    if (var37.field4081 == 31) {
                        class234 var38 = class155.method1107(var14.method1830((byte) -77), true);
                        var37.method1867(var38.field3509, 1002, var38.field3517, var38.field3513, var38.field3521);
                    }
                    int var39 = var37.field4074 >> 7;
                    int var40 = var37.field4088 >> 7;
                    if (var37.field4076 == arg0 && arg7 <= var40 && var40 < (arg7 + 8) && var39 >= arg9 && (arg9 + 8) > var39) {
                        int var41 = class265.method1859(arg5, var37.field4074 & 0x3FF, var37.field4088 & 0x3FF, true) + (arg10 << 7);
                        int var42 = class75.method479(var37.field4088 & 0x3FF, arg5, (byte) 125, var37.field4074 & 0x3FF) + (arg3 << 7);
                        var37.field4088 = var41;
                        var37.field4074 = var42;
                        int var43 = var37.field4088 >> 7;
                        int var44 = var37.field4074 >> 7;
                        if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
                            var37.field4086 = (class179.field2645[1][var43][var44] & 0x2) != 0;
                            var37.field4092 = class294.field4502[var37.field4076][var43][var44] - var37.field4092;
                            class31.method212(var37);
                        }
                    }
                }
            }
        }
        if (var18) {
            return;
        }
        int var45 = arg10 + 7;
        int var46 = arg3 + 7;
        for (int var47 = arg10; var47 < var45; var47++) {
            for (int var48 = arg3; var48 < var46; var48++) {
                class187.field2783[arg6][var47][var48] = 0;
            }
        }
    }
}
