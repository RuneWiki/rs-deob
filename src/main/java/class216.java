import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class216 {

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "Ltr;")
    private class173 field3019 = new class173();

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    private int field3017;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    private int field3010;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Lbo;")
    private class453 field3005;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public static int field3021 = 0;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "[I")
    public static int[] field3014;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lbc;I)Ljava/lang/Object;", line = 3)
    public final Object method1416(class103 arg0, int arg1) {
        field3012++;
        long var3 = arg0.method782((byte) -98);
        if (arg1 != 0) {
            this.field3005 = null;
        }
        for (class365 var5 = (class365) this.field3005.method2826(false, var3); var5 != null; var5 = (class365) this.field3005.method2817(-1)) {
            if (var5.field5396.method781(arg0, arg1 - 30499)) {
                Object var6 = var5.method1342(arg1 ^ 0x3EA2);
                if (var6 != null) {
                    if (var5.method1343((byte) -51)) {
                        class329 var7 = new class329(arg0, var6);
                        this.field3005.method2815(arg1 - 1, var5.field6091, var7);
                        this.field3019.method1154(var7, arg1);
                        var7.field6404 = 0L;
                        var5.method2632(true);
                        var5.method2764((byte) 119);
                    } else {
                        this.field3019.method1154(var5, 0);
                        var5.field6404 = 0L;
                    }
                    return var6;
                }
                var5.method2632(true);
                var5.method2764((byte) 119);
                this.field3017++;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([[BLda;ZIILtj;IB[[B[[I[[B[[BLda;)V", line = 59)
    public static final void method1417(byte[][] arg0, class193 arg1, boolean arg2, int arg3, int arg4, class298 arg5, int arg6, byte arg7, byte[][] arg8, int[][] arg9, byte[][] arg10, byte[][] arg11, class193 arg12) {
        for (int var13 = 0; var13 < arg3; var13++) {
            int var14 = var13 < (arg3 - 1) ? var13 + 1 : var13;
            for (int var15 = 0; var15 < arg6; var15++) {
                int var16 = arg6 - 1 <= var15 ? var15 : var15 + 1;
                if (class226.method1467(0) || class329.method2155(arg7 ^ 0xFFFFFFD5, var15, arg4, var13, class63.field946)) {
                    boolean var17 = false;
                    boolean var18 = false;
                    boolean[] var19 = new boolean[4];
                    int var20 = arg0[var13][var15];
                    int var21 = arg8[var13][var15];
                    int var22 = arg11[var13][var15] & 0xFF;
                    int var23 = arg10[var13][var15] & 0xFF;
                    int var24 = arg10[var13][var16] & 0xFF;
                    int var25 = arg10[var14][var16] & 0xFF;
                    int var26 = arg10[var14][var15] & 0xFF;
                    if (var22 != 0 || var23 != 0) {
                        class21 var27 = var22 == 0 ? null : class269.method1794(-18176, var22 - 1);
                        class149 var28 = var23 == 0 ? null : class15.method115(var23 - 1, (byte) -98);
                        if (var20 == 0 && var27 == null) {
                            var20 = 12;
                        }
                        class21 var29 = var27;
                        if (var27 != null) {
                            if (var27.field387 == -1 && var27.field390 == -1) {
                                var29 = var27;
                                var27 = null;
                            } else if (var28 != null && var20 != 0) {
                                var18 = var27.field378;
                            }
                        }
                        if ((var20 == 0 || var20 == 12) && var13 > 0 && var15 > 0 && var13 < arg3 && var15 < arg6) {
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            byte var33 = 0;
                            int var34 = var32 + (arg10[var14][var16] == var23 ? 1 : -1);
                            int var35 = var31 + (arg10[var14][var15 - 1] == var23 ? 1 : -1);
                            int var36 = var30 + (arg10[var13 - 1][var15 - 1] == var23 ? 1 : -1);
                            int var37 = var33 + (arg10[var13 - 1][var16] == var23 ? 1 : -1);
                            if (arg10[var13][var15 - 1] == var23) {
                                var35++;
                                var36++;
                            } else {
                                var35--;
                                var36--;
                            }
                            if (arg10[var14][var15] == var23) {
                                var35++;
                                var34++;
                            } else {
                                var35--;
                                var34--;
                            }
                            if (arg10[var13][var16] == var23) {
                                var34++;
                                var37++;
                            } else {
                                var37--;
                                var34--;
                            }
                            if (arg10[var13 - 1][var15] == var23) {
                                var36++;
                                var37++;
                            } else {
                                var37--;
                                var36--;
                            }
                            int var38 = var36 - var34;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            int var39 = var35 - var37;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            if (var38 == var39) {
                                var38 = arg1.method722(var13, var15) - arg1.method722(var14, var16);
                                var39 = arg1.method722(var14, var15) - arg1.method722(var13, var16);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                            }
                            var21 = var38 >= var39 ? 0 : 1;
                        }
                        for (int var40 = 0; var40 < 13; var40++) {
                            class273.field4013[var40] = -1;
                            class266.field3952[var40] = 1;
                        }
                        boolean[] var41 = var27 != null && var27.field378 ? class234.field3257[var20] : class334.field4936[var20];
                        class165.method1116(arg6, var19, var15, var20, arg5, arg0, arg8, var28, var13, var21, arg7 ^ 0xFFFFFFBA, var27, arg3, arg11);
                        boolean var42 = var27 != null && var27.field390 != var27.field387;
                        if (!var42) {
                            for (int var43 = 0; var43 < 8; var43++) {
                                if (class273.field4013[var43] >= 0 && class242.field3403[var43] != class166.field2251[var43]) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                        if (!var41[var21 + 1 & 0x3]) {
                            var19[1] = class429.method2682(var19[1], class394.method2529(class266.field3952[4], class266.field3952[2]) == 0);
                        }
                        if (!var41[var21 + 3 & 0x3]) {
                            var19[3] = class429.method2682(var19[3], class394.method2529(class266.field3952[6], class266.field3952[0]) == 0);
                        }
                        if (!var41[var21 & 0x3]) {
                            var19[0] = class429.method2682(var19[0], class394.method2529(class266.field3952[0], class266.field3952[2]) == 0);
                        }
                        if (!var41[var21 + 2 & 0x3]) {
                            var19[2] = class429.method2682(var19[2], class394.method2529(class266.field3952[4], class266.field3952[6]) == 0);
                        }
                        if (!var18 && (var20 == 0 || var20 == 12)) {
                            if (var19[0] && !var19[1] && !var19[2] && var19[3]) {
                                var20 = var20 == 0 ? 13 : 14;
                                var19[0] = var19[3] = false;
                                var21 = 0;
                            } else if (var19[0] && var19[1] && !var19[2] && !var19[3]) {
                                var21 = 3;
                                var19[0] = var19[1] = false;
                                var20 = var20 == 0 ? 13 : 14;
                            } else if (!var19[0] && var19[1] && var19[2] && !var19[3]) {
                                var21 = 2;
                                var20 = var20 == 0 ? 13 : 14;
                                var19[1] = var19[2] = false;
                            } else if (!var19[0] && !var19[1] && var19[2] && var19[3]) {
                                var21 = 1;
                                var20 = var20 == 0 ? 13 : 14;
                                var19[2] = var19[3] = false;
                            }
                        }
                        boolean var44 = !var18 && !var19[0] && !var19[2] && !var19[1] && !var19[3];
                        int[] var45 = null;
                        int[] var46;
                        int[] var47;
                        int var48;
                        int[] var49;
                        int var50;
                        if (var44) {
                            var46 = class81.field1108[var20];
                            var47 = class393.field5721[var20];
                            var48 = var27 == null ? 0 : class145.field1867[var20];
                            var49 = class50.field772[var20];
                            var50 = var28 == null ? 0 : class50.field766[var20];
                        } else if (var18) {
                            var49 = class390.field5707[var20];
                            var45 = class261.field3834[var20];
                            var47 = class194.field2695[var20];
                            var46 = class106.field1398[var20];
                            var48 = var27 == null ? 0 : class64.field967[var20];
                            var50 = var28 == null ? 0 : class263.field3864[var20];
                        } else {
                            var49 = class294.field4437[var20];
                            var45 = class301.field4543[var20];
                            var48 = var27 == null ? 0 : class123.field1596[var20];
                            var50 = var28 == null ? 0 : class215.field3002[var20];
                            var47 = class295.field4455[var20];
                            var46 = class227.field3129[var20];
                        }
                        int var51 = var48 + var50;
                        if (var51 <= 0) {
                            class267.method1787(arg4, var13, var15);
                        } else {
                            if (var19[0]) {
                                var51++;
                            }
                            if (var19[2]) {
                                var51++;
                            }
                            if (var19[1]) {
                                var51++;
                            }
                            if (var19[3]) {
                                var51++;
                            }
                            int var52 = 0;
                            int var53 = 0;
                            int var54 = var51 * 3;
                            int[] var55 = arg2 ? new int[var54] : null;
                            int[] var56 = var42 ? new int[var54] : null;
                            int[] var57 = new int[var54];
                            int[] var58 = new int[var54];
                            int[] var59 = new int[var54];
                            int[] var60 = new int[var54];
                            int[] var61 = new int[var54];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var27 != null) {
                                var62 = var27.field387;
                                var63 = arg5.method479() ? var27.field391 : var27.field389;
                                var64 = var27.field375;
                                int var65 = class362.method2383(arg7 + 59, var27, arg5);
                                for (int var66 = 0; var66 < var48; var66++) {
                                    boolean var92 = false;
                                    byte var93;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class452.field6562[0] = var49[var52];
                                        class452.field6562[1] = 1;
                                        class452.field6562[2] = var47[var52];
                                        class452.field6562[3] = 1;
                                        class452.field6562[4] = var46[var52];
                                        var93 = 6;
                                        class452.field6562[5] = var47[var52];
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class452.field6562[0] = var49[var52];
                                        class452.field6562[1] = 5;
                                        class452.field6562[2] = var47[var52];
                                        class452.field6562[3] = 5;
                                        class452.field6562[4] = var46[var52];
                                        var93 = 6;
                                        class452.field6562[5] = var47[var52];
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class452.field6562[0] = var49[var52];
                                        class452.field6562[1] = 3;
                                        class452.field6562[2] = var47[var52];
                                        class452.field6562[3] = 3;
                                        class452.field6562[4] = var46[var52];
                                        class452.field6562[5] = var47[var52];
                                        var93 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class452.field6562[0] = var49[var52];
                                        class452.field6562[1] = 7;
                                        class452.field6562[2] = var47[var52];
                                        class452.field6562[3] = 7;
                                        class452.field6562[4] = var46[var52];
                                        var93 = 6;
                                        class452.field6562[5] = var47[var52];
                                    } else {
                                        class452.field6562[0] = var49[var52];
                                        class452.field6562[1] = var46[var52];
                                        class452.field6562[2] = var47[var52];
                                        var93 = 3;
                                    }
                                    var52++;
                                    for (int var94 = 0; var94 < var93; var94++) {
                                        int var95 = class452.field6562[var94];
                                        int var96 = var95 - (var21 * 2) & 0x7;
                                        int var97 = class113.field1461[var95];
                                        int var98 = class40.field611[var95];
                                        if (var21 == 1) {
                                            var57[var53] = var98;
                                            var58[var53] = 128 - var97;
                                        } else if (var21 == 2) {
                                            var57[var53] = 128 - var97;
                                            var58[var53] = 128 - var98;
                                        } else if (var21 == 3) {
                                            var57[var53] = 128 - var98;
                                            var58[var53] = var97;
                                        } else {
                                            var57[var53] = var97;
                                            var58[var53] = var98;
                                        }
                                        if (arg2 && class389.field5698[var20][var95]) {
                                            int var99 = (var13 << 7) + var57[var53];
                                            int var100 = (var15 << 7) + var58[var53];
                                            var55[var53] = arg12.method725(var99, var100) - arg1.method725(var99, var100);
                                        }
                                        if (var95 < 8 && class273.field4013[var96] > var27.field380) {
                                            if (var56 != null) {
                                                var56[var53] = class242.field3403[var96];
                                            }
                                            var61[var53] = class204.field2817[var96];
                                            var60[var53] = class85.field1172[var96];
                                            var59[var53] = class166.field2251[var96];
                                        } else {
                                            if (var56 != null) {
                                                var56[var53] = var65;
                                            }
                                            var60[var53] = arg5.method479() ? var27.field391 : var27.field389;
                                            var61[var53] = var27.field375;
                                            var59[var53] = var62;
                                        }
                                        var53++;
                                    }
                                }
                                if (!arg2 && arg4 == 0) {
                                    class317.method2082(var13, var15, var27.field372, var27.field379 * 8);
                                }
                                if (var20 != 12 && var27.field387 != -1 && var27.field376) {
                                    var17 = true;
                                }
                            } else if (var44) {
                                var52 += class145.field1867[var20];
                            } else if (var18) {
                                var52 += class64.field967[var20];
                            } else {
                                var52 += class123.field1596[var20];
                            }
                            if (var28 != null) {
                                if (var25 == 0) {
                                    var25 = var23;
                                }
                                if (var24 == 0) {
                                    var24 = var23;
                                }
                                if (var26 == 0) {
                                    var26 = var23;
                                }
                                class149 var67 = class15.method115(var23 - 1, (byte) -98);
                                class149 var68 = class15.method115(var24 - 1, (byte) -98);
                                class149 var69 = class15.method115(var25 - 1, (byte) -98);
                                class149 var70 = class15.method115(var26 - 1, (byte) -98);
                                for (int var71 = 0; var71 < var50; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class452.field6562[0] = var49[var52];
                                        class452.field6562[1] = 1;
                                        class452.field6562[2] = var47[var52];
                                        class452.field6562[3] = 1;
                                        class452.field6562[4] = var46[var52];
                                        var73 = 6;
                                        class452.field6562[5] = var47[var52];
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class452.field6562[0] = var49[var52];
                                        class452.field6562[1] = 5;
                                        class452.field6562[2] = var47[var52];
                                        class452.field6562[3] = 5;
                                        class452.field6562[4] = var46[var52];
                                        class452.field6562[5] = var47[var52];
                                        var73 = 6;
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class452.field6562[0] = var49[var52];
                                        class452.field6562[1] = 3;
                                        class452.field6562[2] = var47[var52];
                                        class452.field6562[3] = 3;
                                        class452.field6562[4] = var46[var52];
                                        class452.field6562[5] = var47[var52];
                                        var73 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class452.field6562[0] = var49[var52];
                                        class452.field6562[1] = 7;
                                        class452.field6562[2] = var47[var52];
                                        class452.field6562[3] = 7;
                                        class452.field6562[4] = var46[var52];
                                        class452.field6562[5] = var47[var52];
                                        var73 = 6;
                                    } else {
                                        class452.field6562[0] = var49[var52];
                                        class452.field6562[1] = var46[var52];
                                        var73 = 3;
                                        class452.field6562[2] = var47[var52];
                                    }
                                    var52++;
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class452.field6562[var74];
                                        int var76 = var75 - (var21 * 2) & 0x7;
                                        int var77 = class113.field1461[var75];
                                        int var78 = class40.field611[var75];
                                        int var79;
                                        int var80;
                                        if (var21 == 1) {
                                            var79 = var78;
                                            var80 = 128 - var77;
                                        } else if (var21 == 2) {
                                            var80 = 128 - var78;
                                            var79 = 128 - var77;
                                        } else if (var21 == 3) {
                                            var80 = var77;
                                            var79 = 128 - var78;
                                        } else {
                                            var79 = var77;
                                            var80 = var78;
                                        }
                                        var57[var53] = var79;
                                        var58[var53] = var80;
                                        if (arg2 && class389.field5698[var20][var75]) {
                                            int var81 = (var13 << 7) + var79;
                                            int var82 = (var15 << 7) + var80;
                                            var55[var53] = arg12.method725(var81, var82) - arg1.method725(var81, var82);
                                        }
                                        if (var75 < 8 && class273.field4013[var76] >= 0) {
                                            if (var56 != null) {
                                                var56[var53] = class242.field3403[var76];
                                            }
                                            var61[var53] = class204.field2817[var76];
                                            var60[var53] = class85.field1172[var76];
                                            var59[var53] = class166.field2251[var76];
                                        } else {
                                            if (var18 && class389.field5698[var20][var75]) {
                                                var60[var53] = var63;
                                                var61[var53] = var64;
                                                var59[var53] = var62;
                                            } else if (var79 == 0 && var80 == 0) {
                                                var59[var53] = arg9[var13][var15];
                                                var60[var53] = var67.field1894;
                                                var61[var53] = var67.field1903;
                                            } else if (var79 == 0 && var80 == 128) {
                                                var59[var53] = arg9[var13][var16];
                                                var60[var53] = var68.field1894;
                                                var61[var53] = var68.field1903;
                                            } else if (var79 == 128 && var80 == 128) {
                                                var59[var53] = arg9[var14][var16];
                                                var60[var53] = var69.field1894;
                                                var61[var53] = var69.field1903;
                                            } else if (var79 == 128 && var80 == 0) {
                                                var59[var53] = arg9[var14][var15];
                                                var60[var53] = var70.field1894;
                                                var61[var53] = var70.field1903;
                                            } else {
                                                if (var79 >= 64) {
                                                    if (var80 >= 64) {
                                                        var60[var53] = var69.field1894;
                                                        var61[var53] = var69.field1903;
                                                    } else {
                                                        var60[var53] = var70.field1894;
                                                        var61[var53] = var70.field1903;
                                                    }
                                                } else if (var80 >= 64) {
                                                    var60[var53] = var68.field1894;
                                                    var61[var53] = var68.field1903;
                                                } else {
                                                    var60[var53] = var67.field1894;
                                                    var61[var53] = var67.field1903;
                                                }
                                                int var83 = class30.method240((byte) 79, var79 << 7 >> 7, arg9[var14][var15], arg9[var13][var15]);
                                                int var84 = class30.method240((byte) 90, var79 << 7 >> 7, arg9[var14][var16], arg9[var13][var16]);
                                                var59[var53] = class30.method240((byte) -95, var80 << 7 >> 7, var84, var83);
                                            }
                                            if (var56 != null) {
                                                var56[var53] = var59[var53];
                                            }
                                        }
                                        var53++;
                                    }
                                }
                                if (var20 != 0 && var28.field1895) {
                                    var17 = true;
                                }
                            }
                            int var85 = arg1.method722(var13, var15);
                            int var86 = arg1.method722(var14, var15);
                            int var87 = arg1.method722(var14, var16);
                            int var88 = arg1.method722(var13, var16);
                            if (arg4 > 0) {
                                boolean var89 = true;
                                if (var23 == 0 && var20 != 0) {
                                    var89 = false;
                                }
                                if (var22 > 0 && var29 != null && !var29.field373) {
                                    var89 = false;
                                }
                                if (var89 && var85 == var86 && var85 == var87 && var85 == var88) {
                                    class173.field2355[arg4][var13][var15] = (byte) class258.method1708(class173.field2355[arg4][var13][var15], 4);
                                }
                            }
                            int var90 = 0;
                            int var91 = 0;
                            if (arg2) {
                                var90 = class14.method102(var13, var15);
                                var91 = class179.method1177(var13, var15);
                            }
                            arg1.method726(var13, var15, var57, var55, var58, var59, var56, var60, var61, var90, var91, var17);
                            class267.method1787(arg4, var13, var15);
                        }
                    }
                }
            }
        }
        if (arg7 != -59) {
            field3021 = 109;
        }
        field3007++;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(Lbc;I)V", line = 862)
    private final void method1418(class103 arg0, int arg1) {
        field3020++;
        long var3 = arg0.method782((byte) -95);
        for (class365 var5 = (class365) this.field3005.method2826(false, var3); var5 != null; var5 = (class365) this.field3005.method2817(-1)) {
            if (var5.field5396.method781(arg0, -30499)) {
                var5.method2632(true);
                var5.method2764((byte) 119);
                this.field3017++;
                break;
            }
        }
        int var6 = -96 / ((arg1 + 37) / 49);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)I", line = 893)
    public final int method1419(byte arg0) {
        if (arg0 > -92) {
            field3014 = null;
        }
        field3018++;
        return this.field3010;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 904)
    public final void method1420(int arg0) {
        this.field3019.method1156(-7585);
        field3011++;
        if (arg0 != -1) {
            this.method1422(-37, -119);
        }
        this.field3005.method2825(11);
        this.field3017 = this.field3010;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lbc;BLjava/lang/Object;)V", line = 923)
    public final void method1421(class103 arg0, byte arg1, Object arg2) {
        this.method1418(arg0, arg1 ^ 0xFFFFFFBA);
        field3006++;
        if (this.field3017 == 0) {
            class365 var4 = (class365) this.field3019.method1149(0);
            var4.method2632(true);
            var4.method2764((byte) 119);
        } else {
            this.field3017--;
        }
        if (arg1 == 33) {
            class329 var5 = new class329(arg0, arg2);
            this.field3005.method2815(-1, arg0.method782((byte) 125), var5);
            this.field3019.method1154(var5, 0);
            var5.field6404 = 0L;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V", line = 951)
    public final void method1422(int arg0, int arg1) {
        field3009++;
        if (arg0 != -1) {
            method1417((byte[][]) null, (class193) null, true, -127, -73, (class298) null, 58, (byte) -87, (byte[][]) null, (int[][]) null, (byte[][]) null, (byte[][]) null, (class193) null);
        }
        if (class158.field1993 == null) {
            return;
        }
        for (class365 var3 = (class365) this.field3019.method1157(arg0 ^ 0xFFFFFFD3); var3 != null; var3 = (class365) this.field3019.method1151((byte) 72)) {
            if (var3.method1343((byte) 105)) {
                if (var3.method1342(16034) == null) {
                    var3.method2632(true);
                    var3.method2764((byte) 119);
                    this.field3017++;
                }
            } else if ((++var3.field6404) > ((long) arg1)) {
                class365 var4 = class158.field1993.method235(110, var3);
                this.field3005.method2815(-1, var3.field6091, var4);
                class57.method419(var3, 0, var4);
                var3.method2632(true);
                var3.method2764((byte) 119);
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V", line = 1006)
    public static final void method1423(int arg0) {
        field3013++;
        if (arg0 > -88) {
            return;
        }
        class361.method2375(true, class249.field3681);
        int var1 = (class326.field4829 >> 10) + (class236.field3292 >> 3);
        int var2 = (class90.field1223 >> 3) + (class279.field4099 >> 10);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class338.field4996 = new int[var6][4];
        class436.field6331 = new int[var6];
        class312.field4601 = new byte[var6][];
        class6.field81 = new byte[var6][];
        class290.field4391 = new byte[var6][];
        class238.field3324 = new byte[var6][];
        class166.field2249 = new int[var6];
        class51.field797 = new int[var6];
        class243.field3411 = new byte[var6][];
        class51.field791 = new int[var6];
        class9.field169 = new int[var6];
        class184.field2464 = new int[var6];
        int var7 = 0;
        for (int var8 = (var1 - (class351.field5217 >> 4)) / 8; var8 <= ((class351.field5217 >> 4) + var1) / 8; var8++) {
            for (int var10 = (var2 - (class143.field1815 >> 4)) / 8; var10 <= ((class143.field1815 >> 4) + var2) / 8; var10++) {
                int var11 = (var8 << 8) + var10;
                class166.field2249[var7] = var11;
                class51.field791[var7] = class68.field992.method1220("m" + var8 + "_" + var10, 0);
                class51.field797[var7] = class68.field992.method1220("l" + var8 + "_" + var10, 0);
                class9.field169[var7] = class68.field992.method1220("n" + var8 + "_" + var10, 0);
                class184.field2464[var7] = class68.field992.method1220("um" + var8 + "_" + var10, 0);
                class436.field6331[var7] = class68.field992.method1220("ul" + var8 + "_" + var10, 0);
                if (class9.field169[var7] == -1) {
                    class51.field791[var7] = -1;
                    class51.field797[var7] = -1;
                    class184.field2464[var7] = -1;
                    class436.field6331[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class9.field169.length; var9++) {
            class9.field169[var9] = -1;
            class51.field791[var9] = -1;
            class51.field797[var9] = -1;
            class184.field2464[var9] = -1;
            class436.field6331[var9] = -1;
        }
        class199.method1317(true, var4, false, var3, var2, var1, var5, 75);
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V", line = 1092)
    public static void method1424(int arg0) {
        field3014 = null;
        if (arg0 != 1) {
            field3021 = -57;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[[[BIBII)V", line = 1102)
    public static final void method1425(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class13.field207++;
        class132.field1728 = 0;
        for (int var6 = class346.field5155; var6 < class134.field1752; var6++) {
            class77[][] var17 = class106.field1405[var6];
            for (int var18 = class396.field5788; var18 < class74.field1043; var18++) {
                for (int var19 = class427.field6217; var19 < class154.field1957; var19++) {
                    class77 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class277.field4069[var18 + class251.field3687 - class167.field2261][var19 + class251.field3687 - class437.field6352] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field1062 = true;
                            var20.field1068 = true;
                            if (var20.field1064 == null) {
                                var20.field1082 = false;
                            } else {
                                var20.field1082 = true;
                            }
                            class132.field1728++;
                        } else {
                            var20.field1062 = false;
                            var20.field1068 = false;
                            var20.field1077 = 0;
                            if (var18 >= class167.field2261 - 16 && var18 <= class167.field2261 + 16 && var19 >= class437.field6352 - 16 && var19 <= class437.field6352 + 16 && (var20.field1067 != null || var20.field1087 != null || var20.field1063 != null || var20.field1076 != null || var20.field1079 != null || var20.field1064 != null)) {
                                class395.field5742.method1275(var20, -25427);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class370.field5469 == class266.field3950;
        for (int var8 = class346.field5155; var8 < class134.field1752; var8++) {
            float var9 = var7 ? 202.0F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class185.field2528.method479() && var8 >= arg2 && arg1 != null) {
                int var10 = class277.field4069.length;
                if (class277.field4069.length + class396.field5788 > class108.field1421) {
                    var10 -= class277.field4069.length + class396.field5788 - class108.field1421;
                }
                int var11 = class277.field4069[0].length;
                if (class277.field4069[0].length + class427.field6217 > class186.field2554) {
                    var11 -= class277.field4069[0].length + class427.field6217 - class186.field2554;
                }
                int var12 = class72.field1028;
                while (true) {
                    if (var12 >= var10) {
                        class395.field5742.method1282(true, var9, 1, var8, class266.field3950[var8]);
                        break;
                    }
                    int var13 = class396.field5788 + var12 - class72.field1028;
                    for (int var14 = class320.field4749; var14 < var11; var14++) {
                        class349.field5191[var12][var14] = false;
                        if (class277.field4069[var12][var14]) {
                            int var15 = class427.field6217 + var14 - class320.field4749;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class106.field1405[var16][var13][var15] != null && class106.field1405[var16][var13][var15].field1073 == var8) {
                                    class349.field5191[var12][var14] = class106.field1405[var16][var13][var15].field1062;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class395.field5742.method1282(false, var9, 1, var8, class266.field3950[var8]);
            }
            class395.field5742.method1279(8192);
        }
        if (!class145.method1003(true)) {
            class145.method1003(false);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)I", line = 1240)
    public final int method1426(byte arg0) {
        if (arg0 < 57) {
            return -94;
        } else {
            field3015++;
            return this.field3017;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(I)V", line = 1298)
    public class216(int arg0) {
        this.field3017 = arg0;
        this.field3010 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field3005 = new class453(var2);
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V", line = 1255)
    public final void method1427(int arg0) {
        field3016++;
        for (class365 var2 = (class365) this.field3019.method1157(41); var2 != null; var2 = (class365) this.field3019.method1151((byte) 72)) {
            if (var2.method1343((byte) -25)) {
                var2.method2632(true);
                var2.method2764((byte) 119);
                this.field3017++;
            }
        }
        if (arg0 != 15477) {
            field3021 = 31;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZI)V", line = 1281)
    public static final void method1428(boolean arg0, int arg1) {
        field3022++;
        class51 var2 = class223.field3073;
        synchronized (class223.field3073) {
            class223.field3073.method379(arg1, false);
            if (!arg0) {
                field3014 = null;
            }
        }
    }
}
