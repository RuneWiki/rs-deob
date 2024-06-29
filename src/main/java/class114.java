import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class114 extends class97 {

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "S")
    public short field1507;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "Lpf;")
    public static class425 field1508 = new class425(75, -1);

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "S")
    public static short field1512 = 205;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "Lwl;")
    public static class452 field1511 = new class452(18, -1);

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    public static int field1514 = 0;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
    public static void method690(boolean arg0) {
        field1508 = null;
        field1511 = null;
        if (!arg0) {
            method691((byte[][]) null, 45, 69, (byte[][]) null, 30, (class87) null, 59, 113, 8, (byte[][]) null, (class446) null, -42, (boolean[]) null, (class261) null);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([[BII[[BILkm;III[[BLeq;I[ZLdr;)V")
    public static final void method691(byte[][] arg0, int arg1, int arg2, byte[][] arg3, int arg4, class87 arg5, int arg6, int arg7, int arg8, byte[][] arg9, class446 arg10, int arg11, boolean[] arg12, class261 arg13) {
        field1513++;
        if (arg4 > -22) {
            return;
        }
        if (arg10 != null && arg5 != null || arg5 != null && arg2 == 12 || arg10 != null && arg2 == 0) {
            boolean[] var14 = arg10 != null && arg10.field6557 ? class343.field5139[arg2] : class26.field345[arg2];
            if (arg1 > 0) {
                if (arg11 > 0) {
                    int var15 = arg9[arg11 - 1][arg1 - 1] & 0xFF;
                    if (var15 > 0) {
                        class446 var16 = class292.method1815(-98, var15 - 1);
                        if (var16.field6564 != -1 && var16.field6557) {
                            byte var17 = arg0[arg11 - 1][arg1 - 1];
                            int var18 = (arg3[arg11 - 1][arg1 - 1] * 2) + 4 & 0x7;
                            int var19 = class136.method855(0, var16, arg13);
                            if (class255.field3933[var17][var18]) {
                                class90.field1278[0] = var16.field6564;
                                class148.field2050[0] = var19;
                                class440.field6475[0] = arg13.method398() ? var16.field6562 : var16.field6577;
                                class230.field3520[0] = var16.field6561;
                                class455.field6762[0] = var16.field6559;
                                class221.field3370[0] = 256;
                            }
                        }
                    }
                }
                if (arg11 < (arg8 - 1)) {
                    int var20 = arg9[arg11 + 1][arg1 - 1] & 0xFF;
                    if (var20 > 0) {
                        class446 var21 = class292.method1815(-113, var20 - 1);
                        if (var21.field6564 != -1 && var21.field6557) {
                            byte var22 = arg0[arg11 + 1][arg1 - 1];
                            int var23 = (arg3[arg11 + 1][arg1 - 1] * 2) + 6 & 0x7;
                            int var24 = class136.method855(0, var21, arg13);
                            if (class255.field3933[var22][var23]) {
                                class90.field1278[2] = var21.field6564;
                                class148.field2050[2] = var24;
                                class440.field6475[2] = arg13.method398() ? var21.field6562 : var21.field6577;
                                class230.field3520[2] = var21.field6561;
                                class455.field6762[2] = var21.field6559;
                                class221.field3370[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg1 < (arg7 - 1)) {
                if (arg11 > 0) {
                    int var25 = arg9[arg11 - 1][arg1 + 1] & 0xFF;
                    if (var25 > 0) {
                        class446 var26 = class292.method1815(-118, var25 - 1);
                        if (var26.field6564 != -1 && var26.field6557) {
                            byte var27 = arg0[arg11 - 1][arg1 + 1];
                            int var28 = arg3[arg11 - 1][arg1 + 1] * 2 + 2 & 0x7;
                            int var29 = class136.method855(0, var26, arg13);
                            if (class255.field3933[var27][var28]) {
                                class90.field1278[6] = var26.field6564;
                                class148.field2050[6] = var29;
                                class440.field6475[6] = arg13.method398() ? var26.field6562 : var26.field6577;
                                class230.field3520[6] = var26.field6561;
                                class455.field6762[6] = var26.field6559;
                                class221.field3370[6] = 64;
                            }
                        }
                    }
                }
                if ((arg8 - 1) > arg11) {
                    int var30 = arg9[arg11 + 1][arg1 + 1] & 0xFF;
                    if (var30 > 0) {
                        class446 var31 = class292.method1815(-117, var30 - 1);
                        if (var31.field6564 != -1 && var31.field6557) {
                            byte var32 = arg0[arg11 + 1][arg1 + 1];
                            int var33 = arg3[arg11 + 1][arg1 + 1] * 2 & 0x7;
                            int var34 = class136.method855(0, var31, arg13);
                            if (class255.field3933[var32][var33]) {
                                class90.field1278[4] = var31.field6564;
                                class148.field2050[4] = var34;
                                class440.field6475[4] = arg13.method398() ? var31.field6562 : var31.field6577;
                                class230.field3520[4] = var31.field6561;
                                class455.field6762[4] = var31.field6559;
                                class221.field3370[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg1 > 0) {
                int var35 = arg9[arg11][arg1 - 1] & 0xFF;
                if (var35 > 0) {
                    class446 var36 = class292.method1815(-125, var35 - 1);
                    if (var36.field6564 != -1) {
                        byte var37 = arg0[arg11][arg1 - 1];
                        byte var38 = arg3[arg11][arg1 - 1];
                        if (var36.field6557) {
                            int var39 = 2;
                            int var40 = (var38 * 2) + 4;
                            int var41 = class136.method855(0, var36, arg13);
                            for (int var42 = 0; var42 < 3; var42++) {
                                var39 &= 0x7;
                                var40 &= 0x7;
                                if (class255.field3933[var37][var40] && class455.field6762[var39] <= var36.field6559) {
                                    class90.field1278[var39] = var36.field6564;
                                    class148.field2050[var39] = var41;
                                    class440.field6475[var39] = arg13.method398() ? var36.field6562 : var36.field6577;
                                    class230.field3520[var39] = var36.field6561;
                                    if (class455.field6762[var39] == var36.field6559) {
                                        class221.field3370[var39] = class276.method1712(class221.field3370[var39], 32);
                                    } else {
                                        class221.field3370[var39] = 32;
                                    }
                                    class455.field6762[var39] = var36.field6559;
                                }
                                var40++;
                                var39--;
                            }
                            if (!var14[arg6 & 0x3]) {
                                arg12[0] = class343.field5139[var37][class406.method2552(var38 + 2, 3)];
                            }
                        } else if (!var14[arg6 & 0x3]) {
                            arg12[0] = class26.field345[var37][class406.method2552(3, var38 + 2)];
                        }
                    }
                }
            }
            if ((arg7 - 1) > arg1) {
                int var43 = arg9[arg11][arg1 + 1] & 0xFF;
                if (var43 > 0) {
                    class446 var44 = class292.method1815(-119, var43 - 1);
                    if (var44.field6564 != -1) {
                        byte var45 = arg0[arg11][arg1 + 1];
                        byte var46 = arg3[arg11][arg1 + 1];
                        if (var44.field6557) {
                            int var47 = 4;
                            int var48 = (var46 * 2) + 2;
                            int var49 = class136.method855(0, var44, arg13);
                            for (int var50 = 0; var50 < 3; var50++) {
                                var48 &= 0x7;
                                var47 &= 0x7;
                                if (class255.field3933[var45][var48] && var44.field6559 >= class455.field6762[var47]) {
                                    class90.field1278[var47] = var44.field6564;
                                    class148.field2050[var47] = var49;
                                    class440.field6475[var47] = arg13.method398() ? var44.field6562 : var44.field6577;
                                    class230.field3520[var47] = var44.field6561;
                                    if (class455.field6762[var47] == var44.field6559) {
                                        class221.field3370[var47] = class276.method1712(class221.field3370[var47], 16);
                                    } else {
                                        class221.field3370[var47] = 16;
                                    }
                                    class455.field6762[var47] = var44.field6559;
                                }
                                var47++;
                                var48--;
                            }
                            if (!var14[arg6 + 2 & 0x3]) {
                                arg12[2] = class343.field5139[var45][class406.method2552(3, var46)];
                            }
                        } else if (!var14[arg6 + 2 & 0x3]) {
                            arg12[2] = class26.field345[var45][class406.method2552(var46, 3)];
                        }
                    }
                }
            }
            if (arg11 > 0) {
                int var51 = arg9[arg11 - 1][arg1] & 0xFF;
                if (var51 > 0) {
                    class446 var52 = class292.method1815(-109, var51 - 1);
                    if (var52.field6564 != -1) {
                        byte var53 = arg0[arg11 - 1][arg1];
                        byte var54 = arg3[arg11 - 1][arg1];
                        if (var52.field6557) {
                            int var55 = 6;
                            int var56 = var54 * 2 + 4;
                            int var57 = class136.method855(0, var52, arg13);
                            for (int var58 = 0; var58 < 3; var58++) {
                                var56 &= 0x7;
                                var55 &= 0x7;
                                if (class255.field3933[var53][var56] && var52.field6559 >= class455.field6762[var55]) {
                                    class90.field1278[var55] = var52.field6564;
                                    class148.field2050[var55] = var57;
                                    class440.field6475[var55] = arg13.method398() ? var52.field6562 : var52.field6577;
                                    class230.field3520[var55] = var52.field6561;
                                    if (class455.field6762[var55] == var52.field6559) {
                                        class221.field3370[var55] = class276.method1712(class221.field3370[var55], 8);
                                    } else {
                                        class221.field3370[var55] = 8;
                                    }
                                    class455.field6762[var55] = var52.field6559;
                                }
                                var56--;
                                var55++;
                            }
                            if (!var14[arg6 + 3 & 0x3]) {
                                arg12[3] = class343.field5139[var53][class406.method2552(var54 + 1, 3)];
                            }
                        } else if (!var14[arg6 + 3 & 0x3]) {
                            arg12[3] = class26.field345[var53][class406.method2552(var54 + 1, 3)];
                        }
                    }
                }
            }
            if (arg11 < arg8 - 1) {
                int var59 = arg9[arg11 + 1][arg1] & 0xFF;
                if (var59 > 0) {
                    class446 var60 = class292.method1815(-104, var59 - 1);
                    if (var60.field6564 != -1) {
                        byte var61 = arg0[arg11 + 1][arg1];
                        byte var62 = arg3[arg11 + 1][arg1];
                        if (var60.field6557) {
                            int var63 = 4;
                            int var64 = var62 * 2 + 6;
                            int var65 = class136.method855(0, var60, arg13);
                            for (int var66 = 0; var66 < 3; var66++) {
                                var63 &= 0x7;
                                var64 &= 0x7;
                                if (class255.field3933[var61][var64] && var60.field6559 >= class455.field6762[var63]) {
                                    class90.field1278[var63] = var60.field6564;
                                    class148.field2050[var63] = var65;
                                    class440.field6475[var63] = arg13.method398() ? var60.field6562 : var60.field6577;
                                    class230.field3520[var63] = var60.field6561;
                                    if (class455.field6762[var63] == var60.field6559) {
                                        class221.field3370[var63] = class276.method1712(class221.field3370[var63], 4);
                                    } else {
                                        class221.field3370[var63] = 4;
                                    }
                                    class455.field6762[var63] = var60.field6559;
                                }
                                var64++;
                                var63--;
                            }
                            if (!var14[arg6 + 1 & 0x3]) {
                                arg12[1] = class343.field5139[var61][class406.method2552(var62 + 3, 3)];
                            }
                        } else if (!var14[arg6 + 1 & 0x3]) {
                            arg12[1] = class26.field345[var61][class406.method2552(3, var62 + 3)];
                        }
                    }
                }
            }
        }
        if (arg10 == null) {
            return;
        }
        int var67 = class136.method855(0, arg10, arg13);
        if (!arg10.field6557) {
            return;
        }
        for (int var68 = 0; var68 < 8; var68++) {
            int var69 = var68 - (arg6 * 2) & 0x7;
            if (class255.field3933[arg2][var68] && arg10.field6559 >= class455.field6762[var69]) {
                class90.field1278[var69] = arg10.field6564;
                class148.field2050[var69] = var67;
                class440.field6475[var69] = arg13.method398() ? arg10.field6562 : arg10.field6577;
                class230.field3520[var69] = arg10.field6561;
                if (class455.field6762[var69] == arg10.field6559) {
                    class221.field3370[var69] = class276.method1712(class221.field3370[var69], 2);
                } else {
                    class221.field3370[var69] = 2;
                }
                class455.field6762[var69] = arg10.field6559;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)V")
    public static final void method692(byte arg0, int arg1) {
        int var2 = -80 % ((-arg0 - 89) / 35);
        field1510++;
        if (class345.method2100(-1, arg1)) {
            class261.method1609(-1, (byte) 102, class130.field1650[arg1]);
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class114() {
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
    public static final String method693(String arg0, String arg1, int arg2, String arg3) {
        field1509++;
        for (int var4 = arg3.indexOf(arg0); var4 != -1; var4 = arg3.indexOf(arg0, var4 + arg1.length())) {
            arg3 = arg3.substring(0, var4) + arg1 + arg3.substring(var4 + arg0.length());
        }
        if (arg2 != 1) {
            field1508 = null;
        }
        return arg3;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(S)V")
    public class114(short arg0) {
        this.field1507 = arg0;
    }
}
