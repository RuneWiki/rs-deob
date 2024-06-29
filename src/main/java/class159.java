import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class159 extends class20 {

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "[I")
    public int[] field3647 = new int[1];

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "[I")
    public int[] field3641 = new int[] { -1 };

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "Lsc;")
    private static class128 field3639 = class129.method1017(false, "slide:");

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "Lsc;")
    public static class128 field3649 = class129.method1017(false, "null");

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
    public static int field3652 = 0;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
    public static int field3656 = 0;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "[I")
    public static int[] field3653 = new int[5];

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "Lsc;")
    public static class128 field3650 = class129.method1017(false, "<col=ffffff>");

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "Lsc;")
    public static class128 field3654 = field3639;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "Lsc;")
    private static class128 field3642 = class129.method1017(false, "green:");

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "Lsc;")
    private static class128 field3659 = class129.method1017(false, " from your friend list first)3");

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    public static int field3657 = 0;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "Lsc;")
    public static class128 field3658 = field3639;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "Lsc;")
    public static class128 field3645 = field3659;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "Lsc;")
    public static class128 field3660 = class129.method1017(false, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!wf", name = "X", descriptor = "I")
    public static volatile int field3661 = 0;

    @OriginalMember(owner = "client!wf", name = "Z", descriptor = "Lsc;")
    public static class128 field3663 = field3642;

    @OriginalMember(owner = "client!wf", name = "Y", descriptor = "Lsc;")
    public static class128 field3662 = field3642;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "[Lb;")
    public static class8[] field3644;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIZIIII[Lhe;II)V")
    public static final void method1231(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, class54[] arg7, int arg8, int arg9) {
        class138.method1125(arg8, arg0, arg5, arg3);
        if (arg2) {
            field3649 = null;
        }
        field3655++;
        class114.method879();
        for (int var10 = 0; var10 < arg7.length; var10++) {
            class54 var11 = arg7[var10];
            if (var11 != null && (var11.field1175 == arg4 || arg4 == -1412584499 && class43.field814 == var11)) {
                int var12;
                if (arg6 == -1) {
                    class35.field652[class117.field2657] = var11.field1110 + arg1;
                    class122.field2772[class117.field2657] = var11.field1194 + arg9;
                    class2.field16[class117.field2657] = var11.field1154;
                    class18.field336[class117.field2657] = var11.field1111;
                    var12 = class117.field2657++;
                } else {
                    var12 = arg6;
                }
                var11.field1124 = class29.field554;
                var11.field1193 = var12;
                if (!var11.field1146 || !class43.method312(var11, (byte) -73)) {
                    if (var11.field1078 > 0) {
                        class63.method466(true, var11);
                    }
                    int var13 = var11.field1120;
                    int var14 = var11.field1194 + arg9;
                    int var15 = var11.field1110 + arg1;
                    if (class43.field814 == var11) {
                        if (arg4 != -1412584499 && !var11.field1164) {
                            class33.field620 = arg7;
                            class118.field2675 = arg9;
                            class42.field774 = arg1;
                            continue;
                        }
                        if (class25.field504 && class6.field83) {
                            int var16 = class64.field1380;
                            int var17 = class18.field330;
                            int var18 = var17 - class25.field505;
                            if (var18 < class46.field860) {
                                var18 = class46.field860;
                            }
                            int var19 = var16 - class144.field3355;
                            if (class46.field860 + class37.field727.field1111 < var18 - -var11.field1111) {
                                var18 = class37.field727.field1111 + class46.field860 - var11.field1111;
                            }
                            if (class137.field3240 > var19) {
                                var19 = class137.field3240;
                            }
                            if (var11.field1154 + var19 > class137.field3240 + class37.field727.field1154) {
                                var19 = class37.field727.field1154 + class137.field3240 - var11.field1154;
                            }
                            var14 = var18;
                            var15 = var19;
                        }
                        if (!var11.field1164) {
                            var13 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field1137 == 2) {
                        var20 = arg5;
                        var21 = arg0;
                        var22 = arg8;
                        var23 = arg3;
                    } else if (var11.field1137 == 9) {
                        int var26 = var15;
                        int var27 = var11.field1154 + var15;
                        int var28 = var14;
                        if (var27 < var15) {
                            var26 = var27;
                            var27 = var15;
                        }
                        var27++;
                        var20 = arg5 > var27 ? var27 : arg5;
                        int var30 = var11.field1111 + var14;
                        if (var30 < var14) {
                            var28 = var30;
                            var30 = var14;
                        }
                        var21 = arg0 < var28 ? var28 : arg0;
                        var22 = arg8 < var26 ? var26 : arg8;
                        var30++;
                        var23 = arg3 > var30 ? var30 : arg3;
                    } else {
                        var21 = var14 > arg0 ? var14 : arg0;
                        int var24 = var14 + var11.field1111;
                        int var25 = var11.field1154 + var15;
                        var23 = var24 >= arg3 ? arg3 : var24;
                        var20 = var25 >= arg5 ? arg5 : var25;
                        var22 = arg8 >= var15 ? arg8 : var15;
                    }
                    if (!var11.field1146 || var22 < var20 && var21 < var23) {
                        if (var11.field1078 != 0) {
                            if (var11.field1078 == 1337) {
                                class119.field2689 = var15;
                                class75.field1644 = var14;
                                class149.method1190(83, var15, var11.field1111, var14, var11.field1154);
                                class138.method1125(arg8, arg0, arg5, arg3);
                                continue;
                            }
                            if (var11.field1078 == 1338) {
                                class93.method728(var14, var15, 0, var12);
                                class138.method1125(arg8, arg0, arg5, arg3);
                                continue;
                            }
                        }
                        int var32 = class64.field1380;
                        int var33 = class18.field330;
                        if (!class135.field3180 && var22 <= var32 && var33 >= var21 && var32 < var20 && var23 > var33) {
                            class6.method24(var11, var32 - var15, 22299, var33 - var14);
                        }
                        if (var11.field1137 == 0) {
                            if (!var11.field1146 && class43.method312(var11, (byte) -107) && class65.field1434 != var11) {
                                continue;
                            }
                            if (!var11.field1146) {
                                if (var11.field1127 - var11.field1111 < var11.field1211) {
                                    var11.field1211 = var11.field1127 - var11.field1111;
                                }
                                if (var11.field1211 < 0) {
                                    var11.field1211 = 0;
                                }
                            }
                            method1231(var21, var15 - var11.field1157, false, var23, var11.field1117, var20, var12, arg7, var22, var14 - var11.field1211);
                            if (var11.field1100 != null) {
                                method1231(var21, var15 - var11.field1157, arg2, var23, var11.field1117, var20, var12, var11.field1100, var22, var14 - var11.field1211);
                            }
                            class143 var34 = (class143) class66.field1492.method969((long) var11.field1117, -64);
                            if (var34 != null) {
                                if (var34.field3351 == 0 && var22 <= class64.field1380 && class18.field330 >= var21 && var20 > class64.field1380 && var23 > class18.field330 && !class135.field3180 && !class5.field43) {
                                    class121.field2760[0] = 1007;
                                    class120.field2738[0] = class125.field2833;
                                    class105.field2394[0] = class18.field323;
                                    class7.field103 = 1;
                                }
                                class60.method461(var34.field3349, var14, var21, var23, var22, -96, var15, var12, var20);
                            }
                            class138.method1125(arg8, arg0, arg5, arg3);
                            class114.method879();
                        }
                        if (class12.field194[var12] || class90.field2058 > 1) {
                            if (var11.field1137 == 0 && !var11.field1146 && var11.field1111 < var11.field1127) {
                                class150.method1193(var11.field1111, var11.field1211, var11.field1154 + var15, var14, (byte) 51, var11.field1127);
                            }
                            if (var11.field1137 != 1) {
                                if (var11.field1137 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var11.field1111; var36++) {
                                        for (int var37 = 0; var37 < var11.field1154; var37++) {
                                            int var38 = (var11.field1084 + 32) * var37 + var15;
                                            int var39 = (var11.field1147 + 32) * var36 + var14;
                                            if (var35 < 20) {
                                                var39 += var11.field1115[var35];
                                                var38 += var11.field1166[var35];
                                            }
                                            if (var11.field1144[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var11.field1144[var35] - 1;
                                                if (arg8 < var38 + 32 && var38 < arg5 && arg0 < var39 + 32 && arg3 > var39 || class115.field2603 == var11 && class84.field1862 == var35) {
                                                    class8 var43;
                                                    if (class105.field2392 == 1 && class5.field62 == var35 && class60.field1292 == var11.field1117) {
                                                        var43 = class152.method1207(-56, var42, var11.field1203[var35], false, 2, 0);
                                                    } else {
                                                        var43 = class152.method1207(105, var42, var11.field1203[var35], false, 1, 3153952);
                                                    }
                                                    if (var43 == null) {
                                                        class89.method696(var11, 1);
                                                    } else if (class115.field2603 == var11 && class84.field1862 == var35) {
                                                        int var44 = class64.field1380 - class103.field2343;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        int var45 = class18.field330 - class2.field27;
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (class127.field2879 < 5) {
                                                            var45 = 0;
                                                            var44 = 0;
                                                        }
                                                        var43.method61(var38 + var44, var39 + var45, 128);
                                                        if (arg4 != -1) {
                                                            class54 var46 = arg7[arg4 & 0xFFFF];
                                                            if (class138.field3249 > var39 + var45 && var46.field1211 > 0) {
                                                                int var47 = (class138.field3249 - var45 - var39) * class155.field3570 / 3;
                                                                if (class155.field3570 * 10 < var47) {
                                                                    var47 = class155.field3570 * 10;
                                                                }
                                                                if (var46.field1211 < var47) {
                                                                    var47 = var46.field1211;
                                                                }
                                                                class2.field27 += var47;
                                                                var46.field1211 -= var47;
                                                                class89.method696(var46, 1);
                                                            }
                                                            if (class138.field3250 < var39 + var45 + 32 && var46.field1211 < var46.field1127 - var46.field1111) {
                                                                int var48 = (var39 + var45 + 32 - class138.field3250) * class155.field3570 / 3;
                                                                if (var48 > class155.field3570 * 10) {
                                                                    var48 = class155.field3570 * 10;
                                                                }
                                                                if (var48 > var46.field1127 - var46.field1111 - var46.field1211) {
                                                                    var48 = var46.field1127 - var46.field1111 - var46.field1211;
                                                                }
                                                                var46.field1211 += var48;
                                                                class2.field27 -= var48;
                                                                class89.method696(var46, 1);
                                                            }
                                                        }
                                                    } else if (class36.field699 == var11 && class108.field2454 == var35) {
                                                        var43.method61(var38, var39, 128);
                                                    } else {
                                                        var43.method64(var38, var39);
                                                    }
                                                }
                                            } else if (var11.field1168 != null && var35 < 20) {
                                                class8 var49 = var11.method416(-10, var35);
                                                if (var49 != null) {
                                                    var49.method64(var38, var39);
                                                } else if (class49.field925) {
                                                    class89.method696(var11, 1);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var11.field1137 == 3) {
                                    int var50;
                                    if (class150.method1192(var11, (byte) 29)) {
                                        var50 = var11.field1188;
                                        if (class65.field1434 == var11 && var11.field1142 != 0) {
                                            var50 = var11.field1142;
                                        }
                                    } else {
                                        var50 = var11.field1082;
                                        if (class65.field1434 == var11 && var11.field1192 != 0) {
                                            var50 = var11.field1192;
                                        }
                                    }
                                    if (var13 == 0) {
                                        if (var11.field1109) {
                                            class138.method1136(var15, var14, var11.field1154, var11.field1111, var50);
                                        } else {
                                            class138.method1128(var15, var14, var11.field1154, var11.field1111, var50);
                                        }
                                    } else if (var11.field1109) {
                                        class138.method1126(var15, var14, var11.field1154, var11.field1111, var50, 256 - (var13 & 0xFF));
                                    } else {
                                        class138.method1135(var15, var14, var11.field1154, var11.field1111, var50, 256 - (var13 & 0xFF));
                                    }
                                } else if (var11.field1137 == 4) {
                                    class48 var51 = var11.method420(-128);
                                    if (var51 != null) {
                                        class128 var52 = var11.field1165;
                                        int var53;
                                        if (class150.method1192(var11, (byte) 29)) {
                                            var53 = var11.field1188;
                                            if (class65.field1434 == var11 && var11.field1142 != 0) {
                                                var53 = var11.field1142;
                                            }
                                            if (var11.field1104.method1014(-9) > 0) {
                                                var52 = var11.field1104;
                                            }
                                        } else {
                                            var53 = var11.field1082;
                                            if (class65.field1434 == var11 && var11.field1192 != 0) {
                                                var53 = var11.field1192;
                                            }
                                        }
                                        if (var11.field1146 && var11.field1214 != -1) {
                                            class64 var54 = class27.method230((byte) -44, var11.field1214);
                                            var52 = var54.field1378;
                                            if (var52 == null) {
                                                var52 = class66.field1483;
                                            }
                                            if ((var54.field1381 == 1 || var11.field1196 != 1) && var11.field1196 != -1) {
                                                var52 = class51.method395(new class128[] { class87.field1986, var52, class63.field1339, class132.method1051(-65, var11.field1196) }, false);
                                            }
                                        }
                                        if (class110.field2473 == var11) {
                                            var53 = var11.field1082;
                                            var52 = class35.field679;
                                        }
                                        if (!var11.field1146) {
                                            var52 = class108.method836(var11, 0, var52);
                                        }
                                        var51.method1062(var52, var15, var14, var11.field1154, var11.field1111, var53, var11.field1163 ? 0 : -1, var11.field1190, var11.field1180, var11.field1136);
                                    } else if (class49.field925) {
                                        class89.method696(var11, 1);
                                    }
                                } else if (var11.field1137 == 5) {
                                    if (var11.field1146) {
                                        class8 var55;
                                        if (var11.field1214 == -1) {
                                            var55 = var11.method422(false, (byte) 43);
                                        } else {
                                            var55 = class152.method1207(-115, var11.field1214, var11.field1196, false, var11.field1209, var11.field1148);
                                        }
                                        if (var55 != null) {
                                            int var56 = var55.field126;
                                            int var57 = var55.field122;
                                            if (var11.field1103) {
                                                class138.method1127(var15, var14, var11.field1154 + var15, var11.field1111 + var14);
                                                int var58 = (var56 + var11.field1111 - 1) / var56;
                                                int var59 = (var57 + var11.field1154 - 1) / var57;
                                                for (int var60 = 0; var60 < var59; var60++) {
                                                    for (int var61 = 0; var61 < var58; var61++) {
                                                        if (var11.field1126 != 0) {
                                                            var55.method52(var57 * var60 + var57 / 2 + var15, var56 / 2 + var56 * var61 + var14, var11.field1126, 4096);
                                                        } else if (var13 == 0) {
                                                            var55.method64(var15 + var57 * var60, var56 * var61 + var14);
                                                        } else {
                                                            var55.method61(var57 * var60 + var15, var56 * var61 + var14, 256 - (var13 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class138.method1125(arg8, arg0, arg5, arg3);
                                            } else {
                                                int var62 = var11.field1154 * 4096 / var57;
                                                if (var11.field1126 != 0) {
                                                    var55.method52(var15 + var11.field1154 / 2, var11.field1111 / 2 + var14, var11.field1126, var62);
                                                } else if (var13 != 0) {
                                                    var55.method63(var15, var14, var11.field1154, var11.field1111, 256 - (var13 & 0xFF));
                                                } else if (var11.field1154 == var57 && var11.field1111 == var56) {
                                                    var55.method64(var15, var14);
                                                } else {
                                                    var55.method58(var15, var14, var11.field1154, var11.field1111);
                                                }
                                            }
                                        } else if (class49.field925) {
                                            class89.method696(var11, 1);
                                        }
                                    } else {
                                        class8 var63 = var11.method422(class150.method1192(var11, (byte) 29), (byte) 43);
                                        if (var63 != null) {
                                            var63.method64(var15, var14);
                                        } else if (class49.field925) {
                                            class89.method696(var11, 1);
                                        }
                                    }
                                } else if (var11.field1137 == 6) {
                                    boolean var64 = class150.method1192(var11, (byte) 29);
                                    int var65 = 0;
                                    class78 var66 = null;
                                    int var67;
                                    if (var64) {
                                        var67 = var11.field1076;
                                    } else {
                                        var67 = var11.field1140;
                                    }
                                    if (var11.field1214 != -1) {
                                        class64 var69 = class27.method230((byte) -44, var11.field1214);
                                        if (var69 != null) {
                                            class64 var70 = var69.method478(var11.field1196, 0);
                                            var66 = var70.method483(1, -22577);
                                            if (var66 == null) {
                                                class89.method696(var11, 1);
                                            } else {
                                                var66.method584();
                                                var65 = var66.field3593 / 2;
                                            }
                                        }
                                    } else if (var11.field1179 == 5) {
                                        if (var11.field1093 == 0) {
                                            var66 = class135.field3182.method544(113, null, null, -1, -1);
                                        } else {
                                            var66 = class151.field3473.method1(-20521144);
                                        }
                                    } else if (var67 == -1) {
                                        var66 = var11.method411(var64, -1, class151.field3473.field1043, (byte) -77, null);
                                        if (var66 == null && class49.field925) {
                                            class89.method696(var11, 1);
                                        }
                                    } else {
                                        class134 var68 = class70.method527(12, var67);
                                        var66 = var11.method411(var64, var11.field1182, class151.field3473.field1043, (byte) -77, var68);
                                        if (var66 == null && class49.field925) {
                                            class89.method696(var11, 1);
                                        }
                                    }
                                    class114.method871(var15 + var11.field1154 / 2, var11.field1111 / 2 + var14);
                                    int var71 = class114.field2564[var11.field1217] * var11.field1173 >> 16;
                                    int var72 = class114.field2557[var11.field1217] * var11.field1173 >> 16;
                                    if (var66 != null) {
                                        if (var11.field1146) {
                                            var66.method584();
                                            if (var11.field1158) {
                                                var66.method590(0, var11.field1128, var11.field1185, var11.field1217, var11.field1156, var71 + var11.field1160 + var65, var11.field1160 + var72, var11.field1173);
                                            } else {
                                                var66.method591(0, var11.field1128, var11.field1185, var11.field1217, var11.field1156, var65 + var71 + var11.field1160, var11.field1160 + var72);
                                            }
                                        } else {
                                            var66.method591(0, var11.field1128, 0, var11.field1217, 0, var71, var72);
                                        }
                                    }
                                    class114.method875();
                                } else {
                                    if (var11.field1137 == 7) {
                                        class48 var73 = var11.method420(-112);
                                        if (var73 == null) {
                                            if (class49.field925) {
                                                class89.method696(var11, 1);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var11.field1111; var75++) {
                                            for (int var76 = 0; var76 < var11.field1154; var76++) {
                                                if (var11.field1144[var74] > 0) {
                                                    class64 var77 = class27.method230((byte) -44, var11.field1144[var74] - 1);
                                                    class128 var78;
                                                    if (var77.field1381 != 1 && var11.field1203[var74] == 1) {
                                                        var78 = class51.method395(new class128[] { class87.field1986, var77.field1378, class55.field1222 }, false);
                                                    } else {
                                                        var78 = class51.method395(new class128[] { class87.field1986, var77.field1378, class63.field1339, class132.method1051(92, var11.field1203[var74]) }, false);
                                                    }
                                                    int var79 = (var11.field1084 + 115) * var76 + var15;
                                                    int var80 = (var11.field1147 + 12) * var75 + var14;
                                                    if (var11.field1190 == 0) {
                                                        var73.method1078(var78, var79, var80, var11.field1082, var11.field1163 ? 0 : -1);
                                                    } else if (var11.field1190 == 1) {
                                                        var73.method1070(var78, var11.field1154 / 2 + var79, var80, var11.field1082, var11.field1163 ? 0 : -1);
                                                    } else {
                                                        var73.method1065(var78, var11.field1154 + var79 - 1, var80, var11.field1082, var11.field1163 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var11.field1137 == 8 && class58.field1257 == var11 && class29.field558 == class108.field2447) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class48 var83 = class137.field3235;
                                        class128 var84 = var11.field1165;
                                        class128 var85 = class108.method836(var11, 0, var84);
                                        while (var85.method1014(-9) > 0) {
                                            int var93 = var85.method986(class106.field2426, (byte) 67);
                                            class128 var94;
                                            if (var93 == -1) {
                                                var94 = var85;
                                                var85 = class18.field323;
                                            } else {
                                                var94 = var85.method974(0, (byte) -11, var93);
                                                var85 = var85.method998((byte) 85, var93 + 4);
                                            }
                                            int var95 = var83.method1079(var94);
                                            var82 += var83.field3138 + 1;
                                            if (var81 < var95) {
                                                var81 = var95;
                                            }
                                        }
                                        var81 += 6;
                                        int var86 = var11.field1154 + var15 - var81 - 5;
                                        if (var86 < var15 + 5) {
                                            var86 = var15 + 5;
                                        }
                                        var82 += 7;
                                        int var87 = var14 + var11.field1111 + 5;
                                        if (var82 + var87 > arg3) {
                                            var87 = arg3 - var82;
                                        }
                                        if (var81 + var86 > arg5) {
                                            var86 = arg5 - var81;
                                        }
                                        class138.method1136(var86, var87, var81, var82, 16777120);
                                        class138.method1128(var86, var87, var81, var82, 0);
                                        int var88 = var87 + var83.field3138 + 2;
                                        class128 var89 = var11.field1165;
                                        class128 var90 = class108.method836(var11, 0, var89);
                                        while (var90.method1014(-9) > 0) {
                                            int var91 = var90.method986(class106.field2426, (byte) -127);
                                            class128 var92;
                                            if (var91 == -1) {
                                                var92 = var90;
                                                var90 = class18.field323;
                                            } else {
                                                var92 = var90.method974(0, (byte) -11, var91);
                                                var90 = var90.method998((byte) 95, var91 + 4);
                                            }
                                            var83.method1078(var92, var86 + 3, var88, 0, -1);
                                            var88 += var83.field3138 + 1;
                                        }
                                    }
                                    if (var11.field1137 == 9) {
                                        if (var11.field1131 == 1) {
                                            class138.method1131(var15, var14, var11.field1154 + var15, var11.field1111 + var14, var11.field1082);
                                        } else {
                                            int var96 = var11.field1154 >= 0 ? var11.field1154 : -var11.field1154;
                                            int var97 = var96;
                                            int var98 = var11.field1111 >= 0 ? var11.field1111 : -var11.field1111;
                                            if (var98 > var96) {
                                                var97 = var98;
                                            }
                                            if (var97 != 0) {
                                                int var99 = (var11.field1154 << 16) / var97;
                                                int var100 = (var11.field1111 << 16) / var97;
                                                if (var100 <= var99) {
                                                    var99 = -var99;
                                                } else {
                                                    var100 = -var100;
                                                }
                                                int var101 = var11.field1131 * var100 + 1 >> 17;
                                                int var102 = var11.field1131 * var100 >> 17;
                                                int var103 = var11.field1131 * var99 >> 17;
                                                int var104 = var11.field1131 * var99 + 1 >> 17;
                                                int var105 = var15 + var102;
                                                int var106 = var15 - var101;
                                                int var107 = var15 + var11.field1154 - var101;
                                                int var108 = var15 + var102 + var11.field1154;
                                                int var109 = var14 + var103;
                                                int var110 = var14 - var104;
                                                int var111 = var14 + var103 + var11.field1111;
                                                int var112 = var11.field1111 + var14 - var104;
                                                class114.method883(var105, var106, var107);
                                                class114.method886(var109, var110, var112, var105, var106, var107, var11.field1082);
                                                class114.method883(var105, var107, var108);
                                                class114.method886(var109, var112, var111, var105, var107, var108, var11.field1082);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([BII)I")
    public static final int method1232(byte[] arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method1232(null, -101, -94);
        }
        field3643++;
        return class97.method752(arg2 ^ 0x6E, arg1, arg0, 0);
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public static void method1233(int arg0) {
        field3639 = null;
        field3660 = null;
        field3645 = null;
        field3650 = null;
        field3644 = null;
        field3663 = null;
        field3658 = null;
        field3649 = null;
        field3659 = null;
        if (arg0 == 128) {
            field3662 = null;
            field3653 = null;
            field3654 = null;
            field3642 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method1234(Throwable arg0, byte arg1) throws IOException {
        String var2;
        if (arg0 instanceof class150) {
            class150 var3 = (class150) arg0;
            var2 = var3.field3448 + " | ";
            arg0 = var3.field3450;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        field3646++;
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        if (arg1 > -101) {
            field3642 = null;
        }
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }
}
