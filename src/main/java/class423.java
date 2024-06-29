import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public abstract class class423 {

    @OriginalMember(owner = "client!em", name = "d", descriptor = "[S")
    public static short[] field5796 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "[S")
    public static short[] field5793;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method2590(boolean arg0) {
        field5799++;
        if (arg0) {
            class276.field3581.method688(((float) class2.field18 * 0.1F + 0.7F) * 1.1523438F);
            class276.field3581.method737(class314.field4231, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
            class276.field3581.method752(class319.field4293, -1);
            class276.field3581.method717(class190.field2227);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILuo;IIZIZIIIZILg;)V", line = 18)
    public static final void method2591(int arg0, class118 arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11, class366 arg12) {
        field5794++;
        if (!class98.method602(65280) && !class221.method1341(125, arg11, arg9, class41.field488, arg3)) {
            return;
        }
        if (class421.field5777 > arg3) {
            class421.field5777 = arg3;
        }
        class446 var13 = class380.method2361(arg7, -29012);
        if (class20.field220 == 1 && var13.field6178) {
            return;
        }
        int var14;
        int var15;
        if (arg5 == 1 || arg5 == 3) {
            var14 = var13.field6170;
            var15 = var13.field6244;
        } else {
            var14 = var13.field6244;
            var15 = var13.field6170;
        }
        int var16;
        int var17;
        if ((arg9 + var14) <= class22.field232) {
            var16 = arg9 + (var14 >> 1);
            var17 = (var14 + 1 >> 1) + arg9;
        } else {
            var17 = arg9 + 1;
            var16 = arg9;
        }
        int var18;
        int var19;
        if (arg11 + var15 <= class196.field2329) {
            var18 = arg11 + (var15 >> 1);
            var19 = arg11 + (var15 + 1 >> 1);
        } else {
            var18 = arg11;
            var19 = arg11 + 1;
        }
        class279 var20 = class304.field4096[arg2];
        int var21 = var20.method1050(var16, var18) - (-var20.method1050(var17, var18) - var20.method1050(var16, var19) - var20.method1050(var17, var19)) >> 2;
        int var22 = (arg9 << 7) + (var14 << 6);
        int var23 = (arg11 << 7) + (var15 << 6);
        boolean var24 = arg4 && !arg10 && var13.field6191;
        if (var13.method2761((byte) 82)) {
            class378.method2351(arg5, (class131) null, (byte) -6, var13, (class298) null, arg3, arg9, arg11);
        }
        boolean var25 = arg0 == -1 && var13.field6207 == -1 && var13.field6245 == null && var13.field6233 == null && !var13.field6177;
        if (!arg6) {
            field5800 = 37;
        }
        if (class131.field1499 && var13.field6221 != 1) {
            return;
        }
        if (arg8 == 22) {
            if (class167.field1948 || var13.field6235 != 0 || var13.field6179 == 1 || var13.field6195) {
                class388 var27;
                if (var25) {
                    class234 var26 = new class234(arg1, var13, arg2, var22, var21, var23, arg10, arg5, var24);
                    var27 = var26;
                    if (var26.method412(18942)) {
                        var26.method422(arg1, (byte) -7);
                    }
                } else {
                    var27 = new class218(arg1, var13, arg5, arg3, arg2, var22, var21, var23, arg10, arg0);
                }
                class358.method2265(arg3, arg9, arg11, var27);
                if (var13.field6179 == 1 && arg12 != null) {
                    arg12.method2299(arg11, 6311, arg9);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class442 var65 = null;
            int var67;
            class133 var68;
            if (var25) {
                class442 var66 = new class442(arg1, var13, arg3, arg2, var22, var21, var23, arg10, arg9, arg9 + var14 - 1, arg11, arg11 + var15 - 1, arg8, arg5, var24);
                var65 = var66;
                var67 = var66.method2738(4);
                var68 = var66;
            } else {
                var67 = 15;
                var68 = new class211(arg1, var13, arg8, arg5, arg3, arg2, var22, var21, var23, arg10, arg9, arg9 + var14 - 1, arg11, arg11 + var15 - 1, arg0);
            }
            if (class94.method591(var68, false)) {
                if (var65 != null && var65.method412(18942)) {
                    var65.method422(arg1, (byte) -7);
                }
                if (var13.field6190 && arg4) {
                    if (var67 > 30) {
                        var67 = 30;
                    }
                    for (int var69 = 0; var69 <= var14; var69++) {
                        for (int var70 = 0; var70 <= var15; var70++) {
                            var20.method1045(arg9 + var69, arg11 + var70, var67);
                        }
                    }
                }
            }
            if (var13.field6179 != 0 && arg12 != null) {
                arg12.method2301(!var13.field6222, arg9, arg11, -25599, var14, var15, var13.field6238);
            }
        } else if (!(arg8 < 12 || arg8 > 17) || !(arg8 < 18 || arg8 > 21)) {
            class133 var29;
            if (var25) {
                class442 var28 = new class442(arg1, var13, arg3, arg2, var22, var21, var23, arg10, arg9, var14 + arg9 - 1, arg11, arg11 + var15 - 1, arg8, arg5, var24);
                if (var28.method412(18942)) {
                    var28.method422(arg1, (byte) -7);
                }
                var29 = var28;
            } else {
                var29 = new class211(arg1, var13, arg8, arg5, arg3, arg2, var22, var21, var23, arg10, arg9, arg9 + var14 - 1, arg11, arg11 + var15 - 1, arg0);
            }
            class94.method591(var29, false);
            if (arg4 && !arg10 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg3 > 0 && var13.field6221 != 0) {
                class80.field972[arg3][arg9][arg11] = (byte) class213.method1307(class80.field972[arg3][arg9][arg11], 4);
            }
            if (var13.field6179 != 0 && arg12 != null) {
                arg12.method2301(!var13.field6222, arg9, arg11, -25599, var14, var15, var13.field6238);
            }
        } else if (arg8 == 0) {
            class226 var30;
            if (var25) {
                class420 var31 = new class420(arg1, var13, arg2, var22, var21, var23, arg10, arg8, arg5, var24);
                var30 = var31;
                if (var31.method412(18942)) {
                    var31.method422(arg1, (byte) -7);
                }
            } else {
                var30 = new class225(arg1, var13, 0, arg5, arg3, arg2, var22, var21, var23, arg10, arg0);
            }
            class310.method1964(arg3, arg9, arg11, var30, (class226) null);
            if (arg4) {
                if (arg5 == 0) {
                    if (var13.field6190) {
                        var20.method1045(arg9, arg11, 50);
                        var20.method1045(arg9, arg11 + 1, 50);
                    }
                    if (var13.field6221 == 1 && !arg10) {
                        class80.field972[arg3][arg9][arg11] = (byte) class213.method1307(class80.field972[arg3][arg9][arg11], 1);
                    }
                } else if (arg5 == 1) {
                    if (var13.field6190) {
                        var20.method1045(arg9, arg11 + 1, 50);
                        var20.method1045(arg9 + 1, arg11 + 1, 50);
                    }
                    if (var13.field6221 == 1 && !arg10) {
                        class80.field972[arg3][arg9][arg11 + 1] = (byte) class213.method1307(class80.field972[arg3][arg9][arg11 + 1], 2);
                    }
                } else if (arg5 == 2) {
                    if (var13.field6190) {
                        var20.method1045(arg9 + 1, arg11, 50);
                        var20.method1045(arg9 + 1, arg11 - -1, 50);
                    }
                    if (var13.field6221 == 1 && !arg10) {
                        class80.field972[arg3][arg9 + 1][arg11] = (byte) class213.method1307(class80.field972[arg3][arg9 + 1][arg11], 1);
                    }
                } else if (arg5 == 3) {
                    if (var13.field6190) {
                        var20.method1045(arg9, arg11, 50);
                        var20.method1045(arg9 + 1, arg11, 50);
                    }
                    if (var13.field6221 == 1 && !arg10) {
                        class80.field972[arg3][arg9][arg11] = (byte) class213.method1307(class80.field972[arg3][arg9][arg11], 2);
                    }
                }
            }
            if (var13.field6179 != 0 && arg12 != null) {
                arg12.method2306(arg5, arg11, var13.field6238, false, arg9, !var13.field6222, arg8);
            }
            if (var13.field6247 != 16) {
                class210.method1287(arg3, arg9, arg11, var13.field6247);
            }
        } else if (arg8 == 1) {
            class226 var32;
            if (var25) {
                class420 var33 = new class420(arg1, var13, arg2, var22, var21, var23, arg10, arg8, arg5, var24);
                if (var33.method412(18942)) {
                    var33.method422(arg1, (byte) -7);
                }
                var32 = var33;
            } else {
                var32 = new class225(arg1, var13, 1, arg5, arg3, arg2, var22, var21, var23, arg10, arg0);
            }
            class310.method1964(arg3, arg9, arg11, var32, (class226) null);
            if (var13.field6190 && arg4) {
                if (arg5 == 0) {
                    var20.method1045(arg9, arg11 + 1, 50);
                } else if (arg5 == 1) {
                    var20.method1045(arg9 + 1, arg11 + 1, 50);
                } else if (arg5 == 2) {
                    var20.method1045(arg9 + 1, arg11, 50);
                } else if (arg5 == 3) {
                    var20.method1045(arg9, arg11, 50);
                }
            }
            if (var13.field6179 != 0 && arg12 != null) {
                arg12.method2306(arg5, arg11, var13.field6238, false, arg9, !var13.field6222, arg8);
            }
        } else if (arg8 == 2) {
            int var34 = arg5 + 1 & 0x3;
            class226 var37;
            class226 var38;
            if (var25) {
                class420 var35 = new class420(arg1, var13, arg2, var22, var21, var23, arg10, arg8, arg5 + 4, var24);
                class420 var36 = new class420(arg1, var13, arg2, var22, var21, var23, arg10, arg8, var34, var24);
                if (var35.method412(18942)) {
                    var35.method422(arg1, (byte) -7);
                }
                var37 = var35;
                if (var36.method412(18942)) {
                    var36.method422(arg1, (byte) -7);
                }
                var38 = var36;
            } else {
                var37 = new class225(arg1, var13, 2, arg5 + 4, arg3, arg2, var22, var21, var23, arg10, arg0);
                var38 = new class225(arg1, var13, 2, var34, arg3, arg2, var22, var21, var23, arg10, arg0);
            }
            class310.method1964(arg3, arg9, arg11, var37, var38);
            if (var13.field6221 == 1 && arg4 && !arg10) {
                if (arg5 == 0) {
                    class80.field972[arg3][arg9][arg11] = (byte) class213.method1307(class80.field972[arg3][arg9][arg11], 1);
                    class80.field972[arg3][arg9][arg11 + 1] = (byte) class213.method1307(class80.field972[arg3][arg9][arg11 + 1], 2);
                } else if (arg5 == 1) {
                    class80.field972[arg3][arg9][arg11 + 1] = (byte) class213.method1307(class80.field972[arg3][arg9][arg11 + 1], 2);
                    class80.field972[arg3][arg9 + 1][arg11] = (byte) class213.method1307(class80.field972[arg3][arg9 + 1][arg11], 1);
                } else if (arg5 == 2) {
                    class80.field972[arg3][arg9 + 1][arg11] = (byte) class213.method1307(class80.field972[arg3][arg9 + 1][arg11], 1);
                    class80.field972[arg3][arg9][arg11] = (byte) class213.method1307(class80.field972[arg3][arg9][arg11], 2);
                } else if (arg5 == 3) {
                    class80.field972[arg3][arg9][arg11] = (byte) class213.method1307(class80.field972[arg3][arg9][arg11], 2);
                    class80.field972[arg3][arg9][arg11] = (byte) class213.method1307(class80.field972[arg3][arg9][arg11], 1);
                }
            }
            if (var13.field6179 != 0 && arg12 != null) {
                arg12.method2306(arg5, arg11, var13.field6238, false, arg9, !var13.field6222, arg8);
            }
            if (var13.field6247 != 16) {
                class210.method1287(arg3, arg9, arg11, var13.field6247);
            }
        } else if (arg8 == 3) {
            class226 var39;
            if (var25) {
                class420 var40 = new class420(arg1, var13, arg2, var22, var21, var23, arg10, arg8, arg5, var24);
                var39 = var40;
                if (var40.method412(18942)) {
                    var40.method422(arg1, (byte) -7);
                }
            } else {
                var39 = new class225(arg1, var13, 3, arg5, arg3, arg2, var22, var21, var23, arg10, arg0);
            }
            class310.method1964(arg3, arg9, arg11, var39, (class226) null);
            if (var13.field6190 && arg4) {
                if (arg5 == 0) {
                    var20.method1045(arg9, arg11 + 1, 50);
                } else if (arg5 == 1) {
                    var20.method1045(arg9 + 1, arg11 - -1, 50);
                } else if (arg5 == 2) {
                    var20.method1045(arg9 + 1, arg11, 50);
                } else if (arg5 == 3) {
                    var20.method1045(arg9, arg11, 50);
                }
            }
            if (var13.field6179 != 0 && arg12 != null) {
                arg12.method2306(arg5, arg11, var13.field6238, !arg6, arg9, !var13.field6222, arg8);
            }
        } else if (arg8 == 9) {
            class133 var41;
            if (var25) {
                class442 var42 = new class442(arg1, var13, arg3, arg2, var22, var21, var23, arg10, arg9, arg9, arg11, arg11, arg8, arg5, var24);
                if (var42.method412(18942)) {
                    var42.method422(arg1, (byte) -7);
                }
                var41 = var42;
            } else {
                var41 = new class211(arg1, var13, arg8, arg5, arg3, arg2, var22, var21, var23, arg10, arg9, arg9 + var14 - 1, arg11, arg11 + var15 - 1, arg0);
            }
            class94.method591(var41, false);
            if (var13.field6179 != 0 && arg12 != null) {
                arg12.method2301(!var13.field6222, arg9, arg11, -25599, var14, var15, var13.field6238);
            }
            if (var13.field6247 != 16) {
                class210.method1287(arg3, arg9, arg11, var13.field6247);
            }
        } else if (arg8 == 4) {
            class364 var44;
            if (var25) {
                class70 var43 = new class70(arg1, var13, arg2, var22, var21, var23, arg10, 0, 0, 0, arg8, arg5);
                if (var43.method412(18942)) {
                    var43.method422(arg1, (byte) -7);
                }
                var44 = var43;
            } else {
                var44 = new class380(arg1, var13, arg8, arg5, arg3, arg2, var22, var21, var23, arg10, 0, 0, 0, arg0);
            }
            class129.method823(arg3, arg9, arg11, var44, (class364) null);
        } else if (arg8 == 5) {
            int var45 = 16;
            class171 var46 = (class171) class440.method2708(arg3, arg9, arg11);
            if (var46 != null) {
                var45 = class380.method2361(var46.method409(-50), -29012).field6247;
            }
            class364 var47;
            if (var25) {
                class70 var48 = new class70(arg1, var13, arg2, var22, var21, var23, arg10, 0, class347.field4704[arg5] * var45, class318.field4285[arg5] * var45, arg8, arg5);
                if (var48.method412(18942)) {
                    var48.method422(arg1, (byte) -7);
                }
                var47 = var48;
            } else {
                var47 = new class380(arg1, var13, arg8, arg5, arg3, arg2, var22, var21, var23, arg10, 0, class347.field4704[arg5] * var45, class318.field4285[arg5] * var45, arg0);
            }
            class129.method823(arg3, arg9, arg11, var47, (class364) null);
        } else if (arg8 == 6) {
            int var49 = 8;
            class171 var50 = (class171) class440.method2708(arg3, arg9, arg11);
            if (var50 != null) {
                var49 = class380.method2361(var50.method409(-50), -29012).field6247 / 2;
            }
            class364 var51;
            if (var25) {
                class70 var52 = new class70(arg1, var13, arg2, var22, var21, var23, arg10, arg5, class347.field4704[arg5] * var49, class318.field4285[arg5] * var49, arg8, arg5 + 4);
                var51 = var52;
                if (var52.method412(18942)) {
                    var52.method422(arg1, (byte) -7);
                }
            } else {
                var51 = new class380(arg1, var13, arg8, arg5 + 4, arg3, arg2, var22, var21, var23, arg10, arg5, class265.field3420[arg5] * var49, class424.field5814[arg5] * var49, arg0);
            }
            class129.method823(arg3, arg9, arg11, var51, (class364) null);
        } else if (arg8 == 7) {
            int var53 = arg5 + 2 & 0x3;
            class364 var54;
            if (var25) {
                class70 var55 = new class70(arg1, var13, arg2, var22, var21, var23, arg10, var53, 0, 0, arg8, var53 + 4);
                if (var55.method412(18942)) {
                    var55.method422(arg1, (byte) -7);
                }
                var54 = var55;
            } else {
                var54 = new class380(arg1, var13, arg8, var53 + 4, arg3, arg2, var22, var21, var23, arg10, var53, 0, 0, arg0);
            }
            class129.method823(arg3, arg9, arg11, var54, (class364) null);
        } else if (arg8 == 8) {
            int var56 = arg5 + 2 & 0x3;
            int var57 = 8;
            class171 var58 = (class171) class440.method2708(arg3, arg9, arg11);
            if (var58 != null) {
                var57 = class380.method2361(var58.method409(-50), -29012).field6247 / 2;
            }
            class364 var61;
            class364 var62;
            if (var25) {
                class70 var59 = new class70(arg1, var13, arg2, var22, var21, var23, arg10, arg5, class265.field3420[arg5] * var57, class424.field5814[arg5] * var57, arg8, arg5 + 4);
                class70 var60 = new class70(arg1, var13, arg2, var22, var21, var23, arg10, arg5, 0, 0, arg8, var56 + 4);
                if (var59.method412(18942)) {
                    var59.method422(arg1, (byte) -7);
                }
                if (var60.method412(18942)) {
                    var60.method422(arg1, (byte) -7);
                }
                var61 = var60;
                var62 = var59;
            } else {
                class380 var63 = new class380(arg1, var13, arg8, arg5 + 4, arg3, arg2, var22, var21, var23, arg10, arg5, class265.field3420[arg5] * var57, class424.field5814[arg5] * var57, arg0);
                var62 = var63;
                class380 var64 = new class380(arg1, var13, arg8, var56 + 4, arg3, arg2, var22, var21, var23, arg10, arg5, 0, 0, arg0);
                var61 = var64;
            }
            class129.method823(arg3, arg9, arg11, var62, var61);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIZ)V", line = 627)
    public static final void method2592(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field5798++;
            class12 var3 = class390.method2422(341555040, arg0, 14);
            var3.method66(-123);
            var3.field144 = arg1;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)Z", line = 651)
    public static final boolean method2593(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class325.field4336; var3++) {
            class264 var4 = class104.field1223[var3];
            if (var4.field3389 == 1) {
                int var5 = var4.field3405 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3395 * var5 >> 8) + var4.field3391;
                    int var7 = (var4.field3381 * var5 >> 8) + var4.field3392;
                    int var8 = (var4.field3398 * var5 >> 8) + var4.field3387;
                    int var9 = (var4.field3400 * var5 >> 8) + var4.field3388;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3389 == 2) {
                int var10 = arg0 - var4.field3405;
                if (var10 > 0) {
                    int var11 = (var4.field3395 * var10 >> 8) + var4.field3391;
                    int var12 = (var4.field3381 * var10 >> 8) + var4.field3392;
                    int var13 = (var4.field3398 * var10 >> 8) + var4.field3387;
                    int var14 = (var4.field3400 * var10 >> 8) + var4.field3388;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3389 == 3) {
                int var15 = var4.field3391 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3390 * var15 >> 8) + var4.field3405;
                    int var17 = (var4.field3383 * var15 >> 8) + var4.field3393;
                    int var18 = (var4.field3398 * var15 >> 8) + var4.field3387;
                    int var19 = (var4.field3400 * var15 >> 8) + var4.field3388;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3389 == 4) {
                int var20 = arg2 - var4.field3391;
                if (var20 > 0) {
                    int var21 = (var4.field3390 * var20 >> 8) + var4.field3405;
                    int var22 = (var4.field3383 * var20 >> 8) + var4.field3393;
                    int var23 = (var4.field3398 * var20 >> 8) + var4.field3387;
                    int var24 = (var4.field3400 * var20 >> 8) + var4.field3388;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3389 == 5) {
                int var25 = arg1 - var4.field3387;
                if (var25 > 0) {
                    int var26 = (var4.field3390 * var25 >> 8) + var4.field3405;
                    int var27 = (var4.field3383 * var25 >> 8) + var4.field3393;
                    int var28 = (var4.field3395 * var25 >> 8) + var4.field3391;
                    int var29 = (var4.field3381 * var25 >> 8) + var4.field3392;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 775)
    public static void method2594(int arg0) {
        if (arg0 != -11251) {
            method2593(-63, -48, -34);
        }
        field5793 = null;
        field5796 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIZ)V", line = 787)
    public static final void method2595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class387.field5289 = arg2;
        class152.field1776 = arg3;
        class116.field1340 = arg4;
        class285.field3742 = arg0;
        field5795++;
        class28.field310 = arg1;
        if (arg6 && class285.field3742 >= 100) {
            class287.field3784 = class387.field5289 * 128 + 64;
            class80.field979 = class152.field1776 * 128 + 64;
            class51.field587 = class189.method1170(class80.field979, class287.field3784, true, class43.field513) - class116.field1340;
        }
        class320.field4294 = arg5;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)[[[B", line = 813)
    public static final byte[][][] method2596(int arg0, int arg1) {
        field5797++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg1;
        int var4 = arg1;
        byte[] var5 = new byte[arg1 * arg1];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var132 = 0; var132 < var3; var132++) {
                if (var132 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        var2[0][0] = var5;
        byte[] var8 = new byte[var3 * var4];
        int var9 = 0;
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var10 >= var131) {
                    var8[var9] = -1;
                }
                var9++;
            }
        }
        var2[0][1] = var8;
        int var11 = 0;
        byte[] var12 = new byte[var3 * var4];
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var130 >= var13) {
                    var12[var11] = -1;
                }
                var11++;
            }
        }
        var2[0][2] = var12;
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var16 <= var129) {
                    var15[var14] = -1;
                }
                var14++;
            }
        }
        var2[0][3] = var15;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var19 >> 1 >= var128) {
                    var18[var17] = -1;
                }
                var17++;
            }
        }
        var2[1][0] = var18;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var20 >= 0 && var20 < var21.length) {
                    if ((var22 << 1) <= var127) {
                        var21[var20] = -1;
                    }
                    var20++;
                } else {
                    var20++;
                }
            }
        }
        var2[1][1] = var21;
        int var23 = 0;
        byte[] var24 = new byte[var3 * var4];
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if ((var25 >> 1) >= var126) {
                    var24[var23] = -1;
                }
                var23++;
            }
        }
        var2[1][2] = var24;
        int var26 = 0;
        byte[] var27 = new byte[var3 * var4];
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var125 >= var28 << 1) {
                    var27[var26] = -1;
                }
                var26++;
            }
        }
        var2[1][3] = var27;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if (var124 <= (var31 >> 1)) {
                    var29[var30] = -1;
                }
                var30++;
            }
        }
        var2[2][0] = var29;
        byte[] var32 = new byte[var3 * var4];
        int var33 = 0;
        if (arg0 != 26363) {
            method2595(95, -50, 125, 52, -119, -50, false);
        }
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var123 >= (var34 << 1)) {
                    var32[var33] = -1;
                }
                var33++;
            }
        }
        var2[2][1] = var32;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if ((var37 >> 1) >= var122) {
                    var35[var36] = -1;
                }
                var36++;
            }
        }
        var2[2][2] = var35;
        int var38 = 0;
        byte[] var39 = new byte[var3 * var4];
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if (var121 >= (var40 << 1)) {
                    var39[var38] = -1;
                }
                var38++;
            }
        }
        var2[2][3] = var39;
        byte[] var41 = new byte[var3 * var4];
        int var42 = 0;
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if ((var43 >> 1) <= var120) {
                    var41[var42] = -1;
                }
                var42++;
            }
        }
        var2[3][0] = var41;
        int var44 = 0;
        byte[] var45 = new byte[var3 * var4];
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if ((var46 << 1) >= var119) {
                    var45[var44] = -1;
                }
                var44++;
            }
        }
        var2[3][1] = var45;
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var49 >> 1 <= var118) {
                    var47[var48] = -1;
                }
                var48++;
            }
        }
        var2[3][2] = var47;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if (var117 <= (var52 << 1)) {
                    var50[var51] = -1;
                }
                var51++;
            }
        }
        var2[3][3] = var50;
        int var53 = 0;
        byte[] var54 = new byte[var3 * var4];
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if (var116 >= (var55 >> 1)) {
                    var54[var53] = -1;
                }
                var53++;
            }
        }
        var2[4][0] = var54;
        byte[] var56 = new byte[var3 * var4];
        int var57 = 0;
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var115 <= (var58 << 1)) {
                    var56[var57] = -1;
                }
                var57++;
            }
        }
        var2[4][1] = var56;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if (var61 >> 1 <= var114) {
                    var60[var59] = -1;
                }
                var59++;
            }
        }
        var2[4][2] = var60;
        byte[] var62 = new byte[var3 * var4];
        int var63 = 0;
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if (var113 <= var64 << 1) {
                    var62[var63] = -1;
                }
                var63++;
            }
        }
        var2[4][3] = var62;
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if ((var3 / 2) >= var112) {
                    var66[var65] = -1;
                }
                var65++;
            }
        }
        var2[5][0] = var66;
        byte[] var68 = new byte[var3 * var4];
        int var69 = 0;
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var4 / 2 >= var70) {
                    var68[var69] = -1;
                }
                var69++;
            }
        }
        var2[5][1] = var68;
        byte[] var71 = new byte[var3 * var4];
        int var72 = 0;
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if ((var3 / 2) <= var110) {
                    var71[var72] = -1;
                }
                var72++;
            }
        }
        var2[5][2] = var71;
        int var74 = 0;
        byte[] var75 = new byte[var3 * var4];
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var4 / 2 <= var76) {
                    var75[var74] = -1;
                }
                var74++;
            }
        }
        var2[5][3] = var75;
        int var77 = 0;
        byte[] var78 = new byte[var3 * var4];
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var79 - (var4 / 2) >= var108) {
                    var78[var77] = -1;
                }
                var77++;
            }
        }
        var2[6][0] = var78;
        byte[] var80 = new byte[var3 * var4];
        int var81 = 0;
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if (var82 - (var4 / 2) >= var107) {
                    var80[var81] = -1;
                }
                var81++;
            }
        }
        var2[6][1] = var80;
        byte[] var83 = new byte[var3 * var4];
        int var84 = 0;
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var106 <= (var85 - (var4 / 2))) {
                    var83[var84] = -1;
                }
                var84++;
            }
        }
        var2[6][2] = var83;
        byte[] var86 = new byte[var3 * var4];
        int var87 = 0;
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if ((var88 - (var4 / 2)) >= var105) {
                    var86[var87] = -1;
                }
                var87++;
            }
        }
        var2[6][3] = var86;
        byte[] var89 = new byte[var3 * var4];
        int var90 = 0;
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var104 >= var91 - (var4 / 2)) {
                    var89[var90] = -1;
                }
                var90++;
            }
        }
        var2[7][0] = var89;
        int var92 = 0;
        byte[] var93 = new byte[var3 * var4];
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if (var103 >= (var94 - (var4 / 2))) {
                    var93[var92] = -1;
                }
                var92++;
            }
        }
        var2[7][1] = var93;
        byte[] var95 = new byte[var3 * var4];
        int var96 = 0;
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var102 >= var97 - (var4 / 2)) {
                    var95[var96] = -1;
                }
                var96++;
            }
        }
        var2[7][2] = var95;
        byte[] var98 = new byte[var3 * var4];
        int var99 = 0;
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var100 - (var4 / 2) <= var101) {
                    var98[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var98;
        return var2;
    }
}
