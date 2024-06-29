import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class143 extends class418 {

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "Ljava/lang/String;")
    public String field1813;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1810 = "red:";

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
    public static int field1815 = 104;

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "[I")
    public static int[] field1818 = new int[2];

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)V")
    public static final void method988(int arg0, int arg1) {
        field1811++;
        if (arg0 != 13428) {
            return;
        }
        class430.field6243 = arg1;
        class51 var2 = class370.field5462;
        synchronized (class370.field5462) {
            class370.field5462.method372(119);
        }
        class51 var3 = class431.field6263;
        synchronized (class431.field6263) {
            class431.field6263.method372(arg0 ^ 0x340D);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IBIIILtj;ZIIIIZLao;)V")
    public static final void method989(int arg0, byte arg1, int arg2, int arg3, int arg4, class298 arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11, class280 arg12) {
        field1812++;
        if (!class226.method1467(0) && !class329.method2155(16, arg8, arg0, arg4, class63.field946)) {
            return;
        }
        if (class113.field1458 > arg0) {
            class113.field1458 = arg0;
        }
        class212 var13 = class372.method2447(arg10, (byte) 90);
        if (class397.field5796 == 1 && var13.field2912) {
            return;
        }
        int var14;
        int var15;
        if (arg9 == 1 || arg9 == 3) {
            var14 = var13.field2946;
            var15 = var13.field2970;
        } else {
            var14 = var13.field2970;
            var15 = var13.field2946;
        }
        int var16;
        int var17;
        if (class351.field5217 >= (arg4 + var15)) {
            var16 = (var15 >> 1) + arg4;
            var17 = arg4 + (var15 + 1 >> 1);
        } else {
            var17 = arg4 + 1;
            var16 = arg4;
        }
        int var18;
        int var19;
        if (field1815 < (arg8 + var14)) {
            var18 = arg8;
            var19 = arg8 + 1;
        } else {
            var19 = (var14 + 1 >> 1) + arg8;
            var18 = arg8 + (var14 >> 1);
        }
        class193 var20 = class266.field3950[arg2];
        int var21 = var20.method722(var16, var18) + var20.method722(var17, var18) - (-var20.method722(var16, var19) + -var20.method722(var17, var19)) >> 2;
        int var22 = (arg4 << 7) + (var15 << 6);
        int var23 = (arg8 << 7) + (var14 << 6);
        boolean var24 = arg11 && !arg6 && var13.field2898;
        if (var13.method1389(-60)) {
            class273.method1809(arg8, (class163) null, arg9, (byte) -107, arg4, var13, arg0, (class317) null);
        }
        boolean var25 = arg7 == -1 && var13.field2919 == -1 && var13.field2896 == null && var13.field2944 == null && !var13.field2893;
        if (class246.field3464 && var13.field2887 != 1) {
            return;
        }
        if (arg3 != 22) {
            if (arg1 != 57) {
                field1818 = null;
            }
            if (arg3 == 10 || arg3 == 11) {
                class48 var65 = null;
                int var67;
                class407 var68;
                if (var25) {
                    class48 var66 = new class48(arg5, var13, arg0, arg2, var22, var21, var23, arg6, arg4, arg4 + var15 - 1, arg8, arg8 - (1 - var14), arg3, arg9, var24);
                    var67 = var66.method342(0);
                    var68 = var66;
                    var65 = var66;
                } else {
                    var68 = new class186(arg5, var13, arg3, arg9, arg0, arg2, var22, var21, var23, arg6, arg4, arg4 + var15 - 1, arg8, arg8 + var14 - 1, arg7);
                    var67 = 15;
                }
                if (class197.method1306(var68, false)) {
                    if (var65 != null && var65.method125(-113)) {
                        var65.method108(-123, arg5);
                    }
                    if (var13.field2975 && arg11) {
                        if (var67 > 30) {
                            var67 = 30;
                        }
                        for (int var69 = 0; var69 <= var15; var69++) {
                            for (int var70 = 0; var70 <= var14; var70++) {
                                var20.method728(arg4 + var69, arg8 + var70, var67);
                            }
                        }
                    }
                }
                if (var13.field2905 != 0 && arg12 != null) {
                    arg12.method1840(arg4, var13.field2885, var15, !var13.field2936, var14, 1, arg8);
                }
            } else if (!(arg3 < 12 || arg3 > 17) || !(arg3 < 18 || arg3 > 21)) {
                class407 var28;
                if (var25) {
                    class48 var29 = new class48(arg5, var13, arg0, arg2, var22, var21, var23, arg6, arg4, arg4 + var15 - 1, arg8, arg8 + var14 - 1, arg3, arg9, var24);
                    var28 = var29;
                    if (var29.method125(-126)) {
                        var29.method108(-11, arg5);
                    }
                } else {
                    var28 = new class186(arg5, var13, arg3, arg9, arg0, arg2, var22, var21, var23, arg6, arg4, var15 + arg4 - 1, arg8, arg8 + var14 - 1, arg7);
                }
                class197.method1306(var28, false);
                if (arg11 && !arg6 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg0 > 0 && var13.field2887 != 0) {
                    class173.field2355[arg0][arg4][arg8] = (byte) class258.method1708(class173.field2355[arg0][arg4][arg8], 4);
                }
                if (var13.field2905 != 0 && arg12 != null) {
                    arg12.method1840(arg4, var13.field2885, var15, !var13.field2936, var14, 1, arg8);
                }
            } else if (arg3 == 0) {
                class400 var30;
                if (var25) {
                    class106 var31 = new class106(arg5, var13, arg2, var22, var21, var23, arg6, arg3, arg9, var24);
                    if (var31.method125(arg1 ^ 0xFFFFFFB1)) {
                        var31.method108(-112, arg5);
                    }
                    var30 = var31;
                } else {
                    var30 = new class424(arg5, var13, 0, arg9, arg0, arg2, var22, var21, var23, arg6, arg7);
                }
                class436.method2728(arg0, arg4, arg8, var30, (class400) null);
                if (arg11) {
                    if (arg9 == 0) {
                        if (var13.field2975) {
                            var20.method728(arg4, arg8, 50);
                            var20.method728(arg4, arg8 + 1, 50);
                        }
                        if (var13.field2887 == 1 && !arg6) {
                            class173.field2355[arg0][arg4][arg8] = (byte) class258.method1708(class173.field2355[arg0][arg4][arg8], 1);
                        }
                    } else if (arg9 == 1) {
                        if (var13.field2975) {
                            var20.method728(arg4, arg8 + 1, 50);
                            var20.method728(arg4 + 1, arg8 + 1, 50);
                        }
                        if (var13.field2887 == 1 && !arg6) {
                            class173.field2355[arg0][arg4][arg8 + 1] = (byte) class258.method1708(class173.field2355[arg0][arg4][arg8 + 1], 2);
                        }
                    } else if (arg9 == 2) {
                        if (var13.field2975) {
                            var20.method728(arg4 + 1, arg8, 50);
                            var20.method728(arg4 + 1, arg8 - -1, 50);
                        }
                        if (var13.field2887 == 1 && !arg6) {
                            class173.field2355[arg0][arg4 + 1][arg8] = (byte) class258.method1708(class173.field2355[arg0][arg4 + 1][arg8], 1);
                        }
                    } else if (arg9 == 3) {
                        if (var13.field2975) {
                            var20.method728(arg4, arg8, 50);
                            var20.method728(arg4 + 1, arg8, 50);
                        }
                        if (var13.field2887 == 1 && !arg6) {
                            class173.field2355[arg0][arg4][arg8] = (byte) class258.method1708(class173.field2355[arg0][arg4][arg8], 2);
                        }
                    }
                }
                if (var13.field2905 != 0 && arg12 != null) {
                    arg12.method1854(var13.field2885, arg8, arg3, arg4, arg9, true, !var13.field2936);
                }
                if (var13.field2921 != 16) {
                    class435.method2721(arg0, arg4, arg8, var13.field2921);
                }
            } else if (arg3 == 1) {
                class400 var32;
                if (var25) {
                    class106 var33 = new class106(arg5, var13, arg2, var22, var21, var23, arg6, arg3, arg9, var24);
                    if (var33.method125(arg1 ^ 0xFFFFFFB0)) {
                        var33.method108(-36, arg5);
                    }
                    var32 = var33;
                } else {
                    var32 = new class424(arg5, var13, 1, arg9, arg0, arg2, var22, var21, var23, arg6, arg7);
                }
                class436.method2728(arg0, arg4, arg8, var32, (class400) null);
                if (var13.field2975 && arg11) {
                    if (arg9 == 0) {
                        var20.method728(arg4, arg8 + 1, 50);
                    } else if (arg9 == 1) {
                        var20.method728(arg4 + 1, arg8 - -1, 50);
                    } else if (arg9 == 2) {
                        var20.method728(arg4 + 1, arg8, 50);
                    } else if (arg9 == 3) {
                        var20.method728(arg4, arg8, 50);
                    }
                }
                if (var13.field2905 != 0 && arg12 != null) {
                    arg12.method1854(var13.field2885, arg8, arg3, arg4, arg9, true, !var13.field2936);
                }
            } else if (arg3 == 2) {
                int var34 = arg9 + 1 & 0x3;
                class400 var35;
                class400 var36;
                if (var25) {
                    class106 var37 = new class106(arg5, var13, arg2, var22, var21, var23, arg6, arg3, arg9 + 4, var24);
                    class106 var38 = new class106(arg5, var13, arg2, var22, var21, var23, arg6, arg3, var34, var24);
                    if (var37.method125(-116)) {
                        var37.method108(-89, arg5);
                    }
                    var36 = var38;
                    if (var38.method125(-126)) {
                        var38.method108(arg1 - 138, arg5);
                    }
                    var35 = var37;
                } else {
                    var35 = new class424(arg5, var13, 2, arg9 + 4, arg0, arg2, var22, var21, var23, arg6, arg7);
                    var36 = new class424(arg5, var13, 2, var34, arg0, arg2, var22, var21, var23, arg6, arg7);
                }
                class436.method2728(arg0, arg4, arg8, var35, var36);
                if (var13.field2887 == 1 && arg11 && !arg6) {
                    if (arg9 == 0) {
                        class173.field2355[arg0][arg4][arg8] = (byte) class258.method1708(class173.field2355[arg0][arg4][arg8], 1);
                        class173.field2355[arg0][arg4][arg8 + 1] = (byte) class258.method1708(class173.field2355[arg0][arg4][arg8 + 1], 2);
                    } else if (arg9 == 1) {
                        class173.field2355[arg0][arg4][arg8 + 1] = (byte) class258.method1708(class173.field2355[arg0][arg4][arg8 + 1], 2);
                        class173.field2355[arg0][arg4 + 1][arg8] = (byte) class258.method1708(class173.field2355[arg0][arg4 + 1][arg8], 1);
                    } else if (arg9 == 2) {
                        class173.field2355[arg0][arg4 + 1][arg8] = (byte) class258.method1708(class173.field2355[arg0][arg4 + 1][arg8], 1);
                        class173.field2355[arg0][arg4][arg8] = (byte) class258.method1708(class173.field2355[arg0][arg4][arg8], 2);
                    } else if (arg9 == 3) {
                        class173.field2355[arg0][arg4][arg8] = (byte) class258.method1708(class173.field2355[arg0][arg4][arg8], 2);
                        class173.field2355[arg0][arg4][arg8] = (byte) class258.method1708(class173.field2355[arg0][arg4][arg8], 1);
                    }
                }
                if (var13.field2905 != 0 && arg12 != null) {
                    arg12.method1854(var13.field2885, arg8, arg3, arg4, arg9, true, !var13.field2936);
                }
                if (var13.field2921 != 16) {
                    class435.method2721(arg0, arg4, arg8, var13.field2921);
                }
            } else if (arg3 == 3) {
                class400 var40;
                if (var25) {
                    class106 var39 = new class106(arg5, var13, arg2, var22, var21, var23, arg6, arg3, arg9, var24);
                    var40 = var39;
                    if (var39.method125(-125)) {
                        var39.method108(-15, arg5);
                    }
                } else {
                    var40 = new class424(arg5, var13, 3, arg9, arg0, arg2, var22, var21, var23, arg6, arg7);
                }
                class436.method2728(arg0, arg4, arg8, var40, (class400) null);
                if (var13.field2975 && arg11) {
                    if (arg9 == 0) {
                        var20.method728(arg4, arg8 + 1, 50);
                    } else if (arg9 == 1) {
                        var20.method728(arg4 + 1, arg8 - -1, 50);
                    } else if (arg9 == 2) {
                        var20.method728(arg4 + 1, arg8, 50);
                    } else if (arg9 == 3) {
                        var20.method728(arg4, arg8, 50);
                    }
                }
                if (var13.field2905 != 0 && arg12 != null) {
                    arg12.method1854(var13.field2885, arg8, arg3, arg4, arg9, true, !var13.field2936);
                }
            } else if (arg3 == 9) {
                class407 var42;
                if (var25) {
                    class48 var41 = new class48(arg5, var13, arg0, arg2, var22, var21, var23, arg6, arg4, arg4, arg8, arg8, arg3, arg9, var24);
                    var42 = var41;
                    if (var41.method125(-123)) {
                        var41.method108(arg1 ^ 0xFFFFFFB4, arg5);
                    }
                } else {
                    var42 = new class186(arg5, var13, arg3, arg9, arg0, arg2, var22, var21, var23, arg6, arg4, arg4 + var15 - 1, arg8, arg8 + var14 - 1, arg7);
                }
                class197.method1306(var42, false);
                if (var13.field2905 != 0 && arg12 != null) {
                    arg12.method1840(arg4, var13.field2885, var15, !var13.field2936, var14, 1, arg8);
                }
                if (var13.field2921 != 16) {
                    class435.method2721(arg0, arg4, arg8, var13.field2921);
                }
            } else if (arg3 == 4) {
                class236 var43;
                if (var25) {
                    class423 var44 = new class423(arg5, var13, arg2, var22, var21, var23, arg6, 0, 0, 0, arg3, arg9);
                    var43 = var44;
                    if (var44.method125(-124)) {
                        var44.method108(arg1 - 171, arg5);
                    }
                } else {
                    var43 = new class406(arg5, var13, arg3, arg9, arg0, arg2, var22, var21, var23, arg6, 0, 0, 0, arg7);
                }
                class43.method305(arg0, arg4, arg8, var43, (class236) null);
            } else if (arg3 == 5) {
                int var45 = 16;
                class56 var46 = (class56) class57.method421(arg0, arg4, arg8);
                if (var46 != null) {
                    var45 = class372.method2447(var46.method116(24186), (byte) -126).field2921;
                }
                class236 var47;
                if (var25) {
                    class423 var48 = new class423(arg5, var13, arg2, var22, var21, var23, arg6, 0, class134.field1749[arg9] * var45, class453.field6592[arg9] * var45, arg3, arg9);
                    if (var48.method125(-123)) {
                        var48.method108(-70, arg5);
                    }
                    var47 = var48;
                } else {
                    var47 = new class406(arg5, var13, arg3, arg9, arg0, arg2, var22, var21, var23, arg6, 0, class134.field1749[arg9] * var45, class453.field6592[arg9] * var45, arg7);
                }
                class43.method305(arg0, arg4, arg8, var47, (class236) null);
            } else if (arg3 == 6) {
                int var49 = 8;
                class56 var50 = (class56) class57.method421(arg0, arg4, arg8);
                if (var50 != null) {
                    var49 = class372.method2447(var50.method116(24186), (byte) -115).field2921 / 2;
                }
                class236 var52;
                if (var25) {
                    class423 var51 = new class423(arg5, var13, arg2, var22, var21, var23, arg6, arg9, class134.field1749[arg9] * var49, class453.field6592[arg9] * var49, arg3, arg9 + 4);
                    if (var51.method125(-126)) {
                        var51.method108(-88, arg5);
                    }
                    var52 = var51;
                } else {
                    var52 = new class406(arg5, var13, arg3, arg9 + 4, arg0, arg2, var22, var21, var23, arg6, arg9, class15.field232[arg9] * var49, class199.field2743[arg9] * var49, arg7);
                }
                class43.method305(arg0, arg4, arg8, var52, (class236) null);
            } else if (arg3 == 7) {
                int var53 = arg9 + 2 & 0x3;
                class236 var54;
                if (var25) {
                    class423 var55 = new class423(arg5, var13, arg2, var22, var21, var23, arg6, var53, 0, 0, arg3, var53 + 4);
                    if (var55.method125(-121)) {
                        var55.method108(-9, arg5);
                    }
                    var54 = var55;
                } else {
                    var54 = new class406(arg5, var13, arg3, var53 + 4, arg0, arg2, var22, var21, var23, arg6, var53, 0, 0, arg7);
                }
                class43.method305(arg0, arg4, arg8, var54, (class236) null);
            } else if (arg3 == 8) {
                int var56 = arg9 + 2 & 0x3;
                int var57 = 8;
                class56 var58 = (class56) class57.method421(arg0, arg4, arg8);
                if (var58 != null) {
                    var57 = class372.method2447(var58.method116(24186), (byte) 12).field2921 / 2;
                }
                class236 var61;
                class236 var62;
                if (var25) {
                    class423 var59 = new class423(arg5, var13, arg2, var22, var21, var23, arg6, arg9, class15.field232[arg9] * var57, class199.field2743[arg9] * var57, arg3, arg9 + 4);
                    class423 var60 = new class423(arg5, var13, arg2, var22, var21, var23, arg6, arg9, 0, 0, arg3, var56 + 4);
                    if (var59.method125(-118)) {
                        var59.method108(-84, arg5);
                    }
                    if (var60.method125(-127)) {
                        var60.method108(arg1 - 96, arg5);
                    }
                    var61 = var60;
                    var62 = var59;
                } else {
                    class406 var63 = new class406(arg5, var13, arg3, arg9, arg0, arg2, var22, var21, var23, arg6, arg9, class15.field232[arg9] * var57, class199.field2743[arg9] * var57, arg7);
                    class406 var64 = new class406(arg5, var13, arg3, arg9, arg0, arg2, var22, var21, var23, arg6, arg9, 0, 0, arg7);
                    var62 = var63;
                    var61 = var64;
                }
                class43.method305(arg0, arg4, arg8, var62, var61);
            }
        } else if (class24.field434 || var13.field2932 != 0 || var13.field2905 == 1 || var13.field2962) {
            class441 var27;
            if (var25) {
                class15 var26 = new class15(arg5, var13, arg2, var22, var21, var23, arg6, arg9, var24);
                var27 = var26;
                if (var26.method125(-126)) {
                    var26.method108(arg1 - 165, arg5);
                }
            } else {
                var27 = new class40(arg5, var13, arg9, arg0, arg2, var22, var21, var23, arg6, arg7);
            }
            class234.method1520(arg0, arg4, arg8, var27);
            if (var13.field2905 == 1 && arg12 != null) {
                arg12.method1851(arg1 + 262087, arg8, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lir;B)I")
    public static final int method990(class185 arg0, byte arg1) {
        field1817++;
        if (arg1 != -78) {
            return 50;
        }
        int var2 = 0;
        if (arg0.method1205((byte) -48, class337.field4981)) {
            var2++;
        }
        if (arg0.method1205((byte) -48, class72.field1023)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V")
    public static void method991(int arg0) {
        field1810 = null;
        field1818 = null;
        if (arg0 != 15702) {
            method991(-111);
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
    public class143() {
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)V")
    public static final void method992(int arg0, int arg1) {
        class51 var2 = class257.field3768;
        synchronized (class257.field3768) {
            class257.field3768.method372(120);
            class257.field3768 = new class51(arg1);
            int var3 = 66 % ((87 - arg0) / 37);
        }
        field1816++;
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class143(String arg0) {
        this.field1813 = arg0;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BI)V")
    public static final void method993(byte arg0, int arg1) {
        if (arg0 != 80) {
            method988(33, -115);
        }
        class178.field2390 = arg1;
        field1814++;
        class415.field6013.method372(118);
    }
}
