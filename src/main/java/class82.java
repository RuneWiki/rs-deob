import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class82 {

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Z")
    public static boolean field1385 = false;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "[I")
    public static int[] field1388 = new int[5];

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field1392 = 0;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZIIIIIZZILrh;I)V")
    public static final void method584(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, int arg8, class47 arg9, int arg10) {
        field1390++;
        if (arg7 && !class191.method1284(-106) && (class181.field2827[0][arg3][arg5] & 0x2) == 0) {
            if ((class181.field2827[arg2][arg3][arg5] & 0x10) != 0) {
                return;
            }
            if (class192.method1293(-1, arg5, arg2, arg3) != class255.field4081) {
                return;
            }
        }
        if (arg2 < class259.field4137) {
            class259.field4137 = arg2;
        }
        class193 var11 = class69.method501(0, arg1);
        if (!arg6) {
            return;
        }
        int var12;
        int var13;
        if (arg4 == 1 || arg4 == 3) {
            var12 = var11.field3063;
            var13 = var11.field3028;
        } else {
            var12 = var11.field3028;
            var13 = var11.field3063;
        }
        int var14;
        int var15;
        if (arg3 + var13 > 104) {
            var14 = arg3;
            var15 = arg3 + 1;
        } else {
            var14 = (var13 >> 1) + arg3;
            var15 = (var13 + 1 >> 1) + arg3;
        }
        int var16 = (arg3 << 7) + (var13 << 6);
        int[][] var17 = class66.field1107[arg8];
        int var18 = (arg5 << 7) + (var12 << 6);
        int var19;
        int var20;
        if (arg5 + var12 <= 104) {
            var19 = (var12 + 1 >> 1) + arg5;
            var20 = (var12 >> 1) + arg5;
        } else {
            var19 = arg5 + 1;
            var20 = arg5;
        }
        int[][] var21 = null;
        long var22 = (long) (arg4 | 0x400 << 20 | arg5 << 7 | arg3 | arg10 << 14);
        if (var11.field3020 == 0 || arg0) {
            var22 |= Long.MIN_VALUE;
        }
        if (arg0) {
            var21 = class5.field60[0];
        } else if (arg8 < 3) {
            var21 = class66.field1107[arg8 + 1];
        }
        int var24 = var17[var14][var20] + var17[var15][var19] + var17[var15][var20] + var17[var14][var19] >> 2;
        if (var11.field3054 == 1) {
            var22 |= 0x400000L;
        }
        if (var11.field3027) {
            var22 |= 0x80000000L;
        }
        if (var11.method1301((byte) 89)) {
            class3.method13(arg5, arg2, arg4, (class45) null, var11, arg3, (class236) null, 127);
        }
        long var25 = var22 | (long) arg1 << 32;
        boolean var27 = !arg0 & var11.field3049;
        int var28 = var11.field2994;
        if (arg10 == 22) {
            if (class132.field2072 || var11.field3020 != 0 || var11.field3057 == 1 || var11.field3037) {
                class43 var30;
                if (var28 == -1 && var11.field2997 == null && !var11.field3053) {
                    class24 var29 = var11.method1298(var16, var24, 22, arg4, arg7, var18, 0, var27, (class290) null, var17, var21);
                    var30 = var29.field328;
                } else {
                    var30 = new class269(arg1, 22, arg4, arg8, arg3, arg5, var28, var11.field3015, (class43) null);
                }
                class206.method1389(arg2, arg3, arg5, var24, var30, var25, var11.field3018);
                if (var11.field3057 == 1 && arg9 != null) {
                    arg9.method345(arg3, arg5, (byte) -120);
                }
            }
        } else if (arg10 == 10 || arg10 == 11) {
            class43 var70;
            if (var28 == -1 && var11.field2997 == null && !var11.field3053) {
                class24 var69 = var11.method1298(var16, var24, 10, arg10 == 11 ? arg4 + 4 : arg4, arg7, var18, 0, var27, (class290) null, var17, var21);
                var70 = var69.field328;
            } else {
                var70 = new class269(arg1, 10, arg10 == 11 ? arg4 + 4 : arg4, arg8, arg3, arg5, var28, var11.field3015, (class43) null);
            }
            if (var70 != null) {
                boolean var71 = class261.method1768(arg2, arg3, arg5, var24, var13, var12, var70, 0, var25);
                if (var11.field2991 && var71 && arg7) {
                    int var72 = 15;
                    if (var70 instanceof class9) {
                        var72 = ((class9) var70).method91() / 4;
                        if (var72 > 30) {
                            var72 = 30;
                        }
                    }
                    for (int var73 = 0; var73 <= var13; var73++) {
                        for (int var74 = 0; var74 <= var12; var74++) {
                            if (var72 > class86.field1435[arg2][arg3 + var73][arg5 + var74]) {
                                class86.field1435[arg2][arg3 + var73][arg5 + var74] = (byte) var72;
                            }
                        }
                    }
                }
            }
            if (var11.field3057 != 0 && arg9 != null) {
                arg9.method349(var12, arg5, var13, !var11.field3045, var11.field3058, arg3, (byte) -53);
            }
        } else if (arg10 >= 12) {
            class43 var32;
            if (var28 == -1 && var11.field2997 == null && !var11.field3053) {
                class24 var31 = var11.method1298(var16, var24, arg10, arg4, arg7, var18, 0, var27, (class290) null, var17, var21);
                var32 = var31.field328;
            } else {
                var32 = new class269(arg1, arg10, arg4, arg8, arg3, arg5, var28, var11.field3015, (class43) null);
            }
            class261.method1768(arg2, arg3, arg5, var24, 1, 1, var32, 0, var25);
            if (arg7 && arg10 >= 12 && arg10 <= 17 && arg10 != 13 && arg2 > 0 && var11.field3008 != 0) {
                class240.field3891[arg2][arg3][arg5] = class45.method330(class240.field3891[arg2][arg3][arg5], 4);
            }
            if (var11.field3057 != 0 && arg9 != null) {
                arg9.method349(var12, arg5, var13, !var11.field3045, var11.field3058, arg3, (byte) -53);
            }
        } else if (arg10 == 0) {
            class43 var34;
            if (var28 == -1 && var11.field2997 == null && !var11.field3053) {
                class24 var33 = var11.method1298(var16, var24, 0, arg4, arg7, var18, 0, var27, (class290) null, var17, var21);
                var34 = var33.field328;
            } else {
                var34 = new class269(arg1, 0, arg4, arg8, arg3, arg5, var28, var11.field3015, (class43) null);
            }
            class288.method1926(arg2, arg3, arg5, var24, var34, (class43) null, class249.field4025[arg4], 0, var25);
            if (arg7) {
                if (arg4 == 0) {
                    if (var11.field2991) {
                        class86.field1435[arg2][arg3][arg5] = 50;
                        class86.field1435[arg2][arg3][arg5 + 1] = 50;
                    }
                    if (var11.field3008 == 1) {
                        class240.field3891[arg2][arg3][arg5] = class45.method330(class240.field3891[arg2][arg3][arg5], 1);
                    }
                } else if (arg4 == 1) {
                    if (var11.field2991) {
                        class86.field1435[arg2][arg3][arg5 + 1] = 50;
                        class86.field1435[arg2][arg3 + 1][arg5 + 1] = 50;
                    }
                    if (var11.field3008 == 1) {
                        class240.field3891[arg2][arg3][arg5 + 1] = class45.method330(class240.field3891[arg2][arg3][arg5 + 1], 2);
                    }
                } else if (arg4 == 2) {
                    if (var11.field2991) {
                        class86.field1435[arg2][arg3 + 1][arg5] = 50;
                        class86.field1435[arg2][arg3 + 1][arg5 + 1] = 50;
                    }
                    if (var11.field3008 == 1) {
                        class240.field3891[arg2][arg3 + 1][arg5] = class45.method330(class240.field3891[arg2][arg3 + 1][arg5], 1);
                    }
                } else if (arg4 == 3) {
                    if (var11.field2991) {
                        class86.field1435[arg2][arg3][arg5] = 50;
                        class86.field1435[arg2][arg3 + 1][arg5] = 50;
                    }
                    if (var11.field3008 == 1) {
                        class240.field3891[arg2][arg3][arg5] = class45.method330(class240.field3891[arg2][arg3][arg5], 2);
                    }
                }
            }
            if (var11.field3057 != 0 && arg9 != null) {
                arg9.method337(arg3, false, arg10, !var11.field3045, var11.field3058, arg4, arg5);
            }
            if (var11.field3016 != 16) {
                class251.method1718(arg2, arg3, arg5, var11.field3016);
            }
        } else if (arg10 == 1) {
            class43 var36;
            if (var28 == -1 && var11.field2997 == null && !var11.field3053) {
                class24 var35 = var11.method1298(var16, var24, 1, arg4, arg7, var18, 0, var27, (class290) null, var17, var21);
                var36 = var35.field328;
            } else {
                var36 = new class269(arg1, 1, arg4, arg8, arg3, arg5, var28, var11.field3015, (class43) null);
            }
            class288.method1926(arg2, arg3, arg5, var24, var36, (class43) null, class235.field3779[arg4], 0, var25);
            if (var11.field2991 && arg7) {
                if (arg4 == 0) {
                    class86.field1435[arg2][arg3][arg5 + 1] = 50;
                } else if (arg4 == 1) {
                    class86.field1435[arg2][arg3 + 1][arg5 + 1] = 50;
                } else if (arg4 == 2) {
                    class86.field1435[arg2][arg3 + 1][arg5] = 50;
                } else if (arg4 == 3) {
                    class86.field1435[arg2][arg3][arg5] = 50;
                }
            }
            if (var11.field3057 != 0 && arg9 != null) {
                arg9.method337(arg3, !arg6, arg10, !var11.field3045, var11.field3058, arg4, arg5);
            }
        } else if (arg10 == 2) {
            int var37 = arg4 + 1 & 0x3;
            class43 var39;
            class43 var41;
            if (var28 == -1 && var11.field2997 == null && !var11.field3053) {
                class24 var38 = var11.method1298(var16, var24, 2, arg4 + 4, arg7, var18, 0, var27, (class290) null, var17, var21);
                var39 = var38.field328;
                class24 var40 = var11.method1298(var16, var24, 2, var37, arg7, var18, 0, var27, (class290) null, var17, var21);
                var41 = var40.field328;
            } else {
                var39 = new class269(arg1, 2, arg4 + 4, arg8, arg3, arg5, var28, var11.field3015, (class43) null);
                var41 = new class269(arg1, 2, var37, arg8, arg3, arg5, var28, var11.field3015, (class43) null);
            }
            class288.method1926(arg2, arg3, arg5, var24, var39, var41, class249.field4025[arg4], class249.field4025[var37], var25);
            if (var11.field3008 == 1 && arg7) {
                if (arg4 == 0) {
                    class240.field3891[arg2][arg3][arg5] = class45.method330(class240.field3891[arg2][arg3][arg5], 1);
                    class240.field3891[arg2][arg3][arg5 + 1] = class45.method330(class240.field3891[arg2][arg3][arg5 + 1], 2);
                } else if (arg4 == 1) {
                    class240.field3891[arg2][arg3][arg5 + 1] = class45.method330(class240.field3891[arg2][arg3][arg5 + 1], 2);
                    class240.field3891[arg2][arg3 + 1][arg5] = class45.method330(class240.field3891[arg2][arg3 + 1][arg5], 1);
                } else if (arg4 == 2) {
                    class240.field3891[arg2][arg3 + 1][arg5] = class45.method330(class240.field3891[arg2][arg3 + 1][arg5], 1);
                    class240.field3891[arg2][arg3][arg5] = class45.method330(class240.field3891[arg2][arg3][arg5], 2);
                } else if (arg4 == 3) {
                    class240.field3891[arg2][arg3][arg5] = class45.method330(class240.field3891[arg2][arg3][arg5], 2);
                    class240.field3891[arg2][arg3][arg5] = class45.method330(class240.field3891[arg2][arg3][arg5], 1);
                }
            }
            if (var11.field3057 != 0 && arg9 != null) {
                arg9.method337(arg3, false, arg10, !var11.field3045, var11.field3058, arg4, arg5);
            }
            if (var11.field3016 != 16) {
                class251.method1718(arg2, arg3, arg5, var11.field3016);
            }
        } else if (arg10 == 3) {
            class43 var43;
            if (var28 == -1 && var11.field2997 == null && !var11.field3053) {
                class24 var42 = var11.method1298(var16, var24, 3, arg4, arg7, var18, 0, var27, (class290) null, var17, var21);
                var43 = var42.field328;
            } else {
                var43 = new class269(arg1, 3, arg4, arg8, arg3, arg5, var28, var11.field3015, (class43) null);
            }
            class288.method1926(arg2, arg3, arg5, var24, var43, (class43) null, class235.field3779[arg4], 0, var25);
            if (var11.field2991 && arg7) {
                if (arg4 == 0) {
                    class86.field1435[arg2][arg3][arg5 + 1] = 50;
                } else if (arg4 == 1) {
                    class86.field1435[arg2][arg3 + 1][arg5 + 1] = 50;
                } else if (arg4 == 2) {
                    class86.field1435[arg2][arg3 + 1][arg5] = 50;
                } else if (arg4 == 3) {
                    class86.field1435[arg2][arg3][arg5] = 50;
                }
            }
            if (var11.field3057 != 0 && arg9 != null) {
                arg9.method337(arg3, !arg6, arg10, !var11.field3045, var11.field3058, arg4, arg5);
            }
        } else if (arg10 == 9) {
            class43 var45;
            if (var28 == -1 && var11.field2997 == null && !var11.field3053) {
                class24 var44 = var11.method1298(var16, var24, arg10, arg4, arg7, var18, 0, var27, (class290) null, var17, var21);
                var45 = var44.field328;
            } else {
                var45 = new class269(arg1, arg10, arg4, arg8, arg3, arg5, var28, var11.field3015, (class43) null);
            }
            class261.method1768(arg2, arg3, arg5, var24, 1, 1, var45, 0, var25);
            if (var11.field3057 != 0 && arg9 != null) {
                arg9.method349(var12, arg5, var13, !var11.field3045, var11.field3058, arg3, (byte) -53);
            }
            if (var11.field3016 != 16) {
                class251.method1718(arg2, arg3, arg5, var11.field3016);
            }
        } else if (arg10 == 4) {
            class43 var47;
            if (var28 == -1 && var11.field2997 == null && !var11.field3053) {
                class24 var46 = var11.method1298(var16, var24, 4, arg4, arg7, var18, 0, var27, (class290) null, var17, var21);
                var47 = var46.field328;
            } else {
                var47 = new class269(arg1, 4, arg4, arg8, arg3, arg5, var28, var11.field3015, (class43) null);
            }
            class212.method1436(arg2, arg3, arg5, var24, var47, (class43) null, class249.field4025[arg4], 0, 0, 0, var25);
        } else if (arg10 == 5) {
            int var48 = 16;
            long var49 = class237.method1630(arg2, arg3, arg5);
            if (var49 != 0L) {
                var48 = class69.method501(0, Integer.MAX_VALUE & (int) (var49 >>> 32)).field3016;
            }
            class43 var52;
            if (var28 == -1 && var11.field2997 == null && !var11.field3053) {
                class24 var51 = var11.method1298(var16, var24, 4, arg4, arg7, var18, 0, var27, (class290) null, var17, var21);
                var52 = var51.field328;
            } else {
                var52 = new class269(arg1, 4, arg4, arg8, arg3, arg5, var28, var11.field3015, (class43) null);
            }
            class212.method1436(arg2, arg3, arg5, var24, var52, (class43) null, class249.field4025[arg4], 0, class61.field1055[arg4] * var48, class219.field3378[arg4] * var48, var25);
        } else if (arg10 == 6) {
            int var53 = 8;
            long var54 = class237.method1630(arg2, arg3, arg5);
            if (var54 != 0L) {
                var53 = class69.method501(0, (int) (var54 >>> 32) & Integer.MAX_VALUE).field3016 / 2;
            }
            class43 var57;
            if (var28 == -1 && var11.field2997 == null && !var11.field3053) {
                class24 var56 = var11.method1298(var16, var24, 4, arg4 + 4, arg7, var18, 0, var27, (class290) null, var17, var21);
                var57 = var56.field328;
            } else {
                var57 = new class269(arg1, 4, arg4 + 4, arg8, arg3, arg5, var28, var11.field3015, (class43) null);
            }
            class212.method1436(arg2, arg3, arg5, var24, var57, (class43) null, 256, arg4, class281.field4452[arg4] * var53, class159.field2466[arg4] * var53, var25);
        } else if (arg10 == 7) {
            int var58 = arg4 + 2 & 0x3;
            class43 var60;
            if (var28 == -1 && var11.field2997 == null && !var11.field3053) {
                class24 var59 = var11.method1298(var16, var24, 4, var58 + 4, arg7, var18, 0, var27, (class290) null, var17, var21);
                var60 = var59.field328;
            } else {
                var60 = new class269(arg1, 4, var58 + 4, arg8, arg3, arg5, var28, var11.field3015, (class43) null);
            }
            class212.method1436(arg2, arg3, arg5, var24, var60, (class43) null, 256, var58, 0, 0, var25);
        } else if (arg10 == 8) {
            int var61 = 8;
            long var62 = class237.method1630(arg2, arg3, arg5);
            int var64 = arg4 + 2 & 0x3;
            if (var62 != 0L) {
                var61 = class69.method501(0, Integer.MAX_VALUE & (int) (var62 >>> 32)).field3016 / 2;
            }
            class43 var66;
            class43 var68;
            if (var28 == -1 && var11.field2997 == null && !var11.field3053) {
                class24 var65 = var11.method1298(var16, var24, 4, arg4 + 4, arg7, var18, 0, var27, (class290) null, var17, var21);
                var66 = var65.field328;
                class24 var67 = var11.method1298(var16, var24, 4, var64 + 4, arg7, var18, 0, var27, (class290) null, var17, var21);
                var68 = var67.field328;
            } else {
                var66 = new class269(arg1, 4, arg4 + 4, arg8, arg3, arg5, var28, var11.field3015, (class43) null);
                var68 = new class269(arg1, 4, var64 + 4, arg8, arg3, arg5, var28, var11.field3015, (class43) null);
            }
            class212.method1436(arg2, arg3, arg5, var24, var66, var68, 256, arg4, class281.field4452[arg4] * var61, class159.field2466[arg4] * var61, var25);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static final void method585(int arg0) {
        field1389++;
        if (class268.field4278 != null) {
            return;
        }
        int var1 = 22 % ((arg0 + 92) / 32);
        if (class205.field3205 != null) {
            return;
        }
        int var2 = class164.field2581;
        if (!class47.field687) {
            if (var2 == 1 && class128.field2018 > 0) {
                short var14 = class146.field2319[class128.field2018 - 1];
                if (var14 == 13 || var14 == 25 || var14 == 48 || var14 == 5 || var14 == 49 || var14 == 37 || var14 == 10 || var14 == 44 || var14 == 26 || var14 == 43 || var14 == 20 || var14 == 1005) {
                    int var15 = class29.field415[class128.field2018 - 1];
                    int var16 = class45.field648[class128.field2018 - 1];
                    class228 var17 = class84.method596((byte) 35, var16);
                    class271 var18 = client.method1059(var17);
                    if (var18.method1823(true) || var18.method1833(-32687)) {
                        class152.field2383 = 0;
                        class100.field1672 = false;
                        if (class268.field4278 != null) {
                            method591(class268.field4278, false);
                        }
                        class268.field4278 = class84.method596((byte) 35, var16);
                        class131.field2063 = class112.field1838;
                        class248.field4010 = class291.field4584;
                        class288.field4568 = var15;
                        method591(class268.field4278, false);
                        return;
                    }
                }
            }
            if (var2 == 1 && (class37.field524 == 1 && class128.field2018 > 2 || class173.method1177(class128.field2018 - 1, (byte) -111))) {
                var2 = 2;
            }
            if (var2 == 2 && class128.field2018 > 0 || class40.field571 == 1) {
                class180.method1220((byte) -105);
            }
            if ((var2 != 1 || class128.field2018 <= 0) && class40.field571 != 2) {
                return;
            }
            class93.method704(0);
            return;
        }
        if (var2 != 1) {
            int var3 = class115.field1883;
            int var4 = class79.field1323;
            if (class286.field4520 - 10 > var4 || class286.field4520 + class141.field2150 + 10 < var4 || var3 < class157.field2446 - 10 || (class157.field2446 + class190.field2951 + 10) < var3) {
                class47.field687 = false;
                class95.method711(239, class157.field2446, class286.field4520, class190.field2951, class141.field2150);
            }
        }
        if (var2 != 1) {
            return;
        }
        int var5 = class157.field2446;
        int var6 = class141.field2150;
        int var7 = class286.field4520;
        int var8 = -1;
        int var9 = class112.field1838;
        int var10 = class291.field4584;
        for (int var11 = 0; var11 < class128.field2018; var11++) {
            if (class180.field2798) {
                int var12 = var5 + ((class128.field2018 + -1 + -var11) * 15) + 33;
                if (var7 < var10 && var7 + var6 > var10 && (var12 - 13) < var9 && var9 < (var12 + 3)) {
                    var8 = var11;
                }
            } else {
                int var13 = (class128.field2018 - var11 - 1) * 15 + var5 + 31;
                if (var7 < var10 && var10 < var6 + var7 && var9 > var13 - 13 && var13 + 3 > var9) {
                    var8 = var11;
                }
            }
        }
        if (var8 != -1) {
            class201.method1359(var8, 5469);
        }
        class47.field687 = false;
        class95.method711(239, class157.field2446, class286.field4520, class190.field2951, class141.field2150);
        return;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZIIIII)V")
    public static final void method586(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1391++;
        int var7 = class219.method1470(class90.field1568, arg3, -1, class266.field4247);
        int var8 = class219.method1470(class90.field1568, arg2, -1, class266.field4247);
        int var9 = class219.method1470(class223.field3423, arg4, -1, class148.field2338);
        int var10 = class219.method1470(class223.field3423, arg0, -1, class148.field2338);
        int var11 = class219.method1470(class90.field1568, arg3 + arg6, -1, class266.field4247);
        int var12 = class219.method1470(class90.field1568, arg2 - arg6, -1, class266.field4247);
        for (int var13 = var7; var13 < var11; var13++) {
            class166.method1124(true, class154.field2406[var13], var10, arg5, var9);
        }
        if (!arg1) {
            field1388 = null;
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class166.method1124(true, class154.field2406[var14], var10, arg5, var9);
        }
        int var15 = class219.method1470(class223.field3423, arg4 + arg6, -1, class148.field2338);
        int var16 = class219.method1470(class223.field3423, arg0 - arg6, -1, class148.field2338);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class154.field2406[var17];
            class166.method1124(arg1, var18, var15, arg5, var9);
            class166.method1124(true, var18, var10, arg5, var16);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
    public static void method587(int arg0) {
        if (arg0 != 1) {
            field1386 = 78;
        }
        field1388 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method588(int arg0, String arg1) {
        int var2 = -57 % ((arg0 + 64) / 48);
        field1387++;
        String var3 = class130.method903(-26704, class148.method1000(arg1, 934));
        if (var3 == null) {
            var3 = "";
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)I")
    public static final int method589(int arg0, int arg1) {
        if (arg1 != 1) {
            return 78;
        }
        field1384++;
        if (arg0 > 0) {
            return 1;
        } else if (arg0 < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
    public static final void method590(int arg0) {
        class297.method1982(-1, 5);
        class70.method504(5, arg0 - 13271);
        field1393++;
        class283.method1903(5, 13819);
        class103.method747(5, 68);
        class200.method1354(5, (byte) -46);
        class86.method608((byte) -127, 5);
        class229.method1531(5, 26);
        class166.method1119(5, arg0 ^ 0x33D5);
        class212.method1443(5, arg0 - 13151);
        class223.method1498(5, (byte) -125);
        class125.method870(5, 0);
        class116.method819(5, 7855);
        class204.method1378((byte) -74, 5);
        class17.method166(5, (byte) -67);
        if (arg0 != 13271) {
            method591((class228) null, false);
        }
        class182.method1239(5, 0);
        class281.method1891(5, -127);
        class73.method530(true, 5);
        class40.method296(50, -97);
        class18.method175(43, 5);
        class143.method962(5, -14575);
        class181.field2824.method1897(true, 5);
        class217.field3355.method1897(true, 5);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lre;Z)V")
    public static final void method591(class228 arg0, boolean arg1) {
        if (class185.field2867 == arg0.field3575) {
            class25.field335[arg0.field3617] = true;
        }
        field1383++;
        if (arg1) {
            field1385 = false;
        }
    }
}
