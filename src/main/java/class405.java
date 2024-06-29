import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class405 {

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "Lcb;")
    public static class52 field5608 = new class52();

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field5612 = 0;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2521(int arg0) {
        class431.method2627();
        field5611++;
        for (int var1 = arg0; var1 < 4; var1++) {
            class156.field1815[var1].method2313(-114);
        }
        class281.method1773((byte) -122);
        class290.method1846(-126);
        System.gc();
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V", line = 26)
    public static void method2522(int arg0) {
        if (arg0 != 7) {
            field5612 = -107;
        }
        field5608 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIB)V", line = 36)
    public static final void method2523(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -27) {
            method2522(-88);
        }
        field5609++;
        if (class347.field4722 == null) {
            return;
        }
        long var4 = (long) (arg1 | arg2 << 14 | arg0 << 28);
        class14 var6 = (class14) class76.field939.method2218(1, var4);
        if (var6 == null) {
            class133.method866(arg0, arg1, arg2);
            return;
        }
        class228 var7 = (class228) var6.field171.method1690((byte) -125);
        if (var7 == null) {
            class133.method866(arg0, arg1, arg2);
            return;
        }
        class191 var8 = (class191) class133.method866(arg0, arg1, arg2);
        if (var8 == null) {
            var8 = new class191();
        } else {
            var8.field2246 = var8.field2247 = -1;
        }
        var8.field2240 = var7.field2878;
        var8.field2239 = var7.field2885;
        label48: while (true) {
            class228 var9 = (class228) var6.field171.method1699((byte) 94);
            if (var9 == null) {
                break;
            }
            if (var8.field2239 != var9.field2885) {
                var8.field2242 = var9.field2878;
                var8.field2246 = var9.field2885;
                while (true) {
                    class228 var10 = (class228) var6.field171.method1699((byte) 85);
                    if (var10 == null) {
                        break label48;
                    }
                    if (var8.field2239 != var10.field2885 && var8.field2246 != var10.field2885) {
                        var8.field2247 = var10.field2885;
                        var8.field2241 = var10.field2878;
                    }
                }
            }
        }
        int var11 = class189.method1170((arg2 << 7) + 64, (arg1 << 7) + 64, true, arg0);
        class51.method281(arg0, arg1, arg2, var11, var8);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 114)
    public static final String method2524(byte arg0, String arg1) {
        field5607++;
        if (arg1 == null) {
            return null;
        }
        int var2 = -45 % ((arg0 - 9) / 49);
        int var3 = 0;
        int var4 = arg1.length();
        while (var3 < var4 && class282.method1779((byte) 59, arg1.charAt(var3))) {
            var3++;
        }
        while (var3 < var4 && class282.method1779((byte) 59, arg1.charAt(var4 - 1))) {
            var4--;
        }
        int var5 = var4 - var3;
        if (var5 < 1 || var5 > 12) {
            return null;
        }
        StringBuffer var6 = new StringBuffer(var5);
        for (int var7 = var3; var7 < var4; var7++) {
            char var8 = arg1.charAt(var7);
            if (class299.method1899(var8, (byte) -59)) {
                char var9 = class373.method2336(var8, -6);
                if (var9 != '\u0000') {
                    var6.append(var9);
                }
            }
        }
        if (var6.length() == 0) {
            return null;
        } else {
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IBI[[B[[BI[ZLuo;[[BIILjn;ILrn;)V", line = 167)
    public static final void method2525(int arg0, byte arg1, int arg2, byte[][] arg3, byte[][] arg4, int arg5, boolean[] arg6, class118 arg7, byte[][] arg8, int arg9, int arg10, class352 arg11, int arg12, class214 arg13) {
        if (arg1 != 74) {
            return;
        }
        field5610++;
        if (arg11 != null && arg13 != null || arg13 != null && arg2 == 12 || arg11 != null && arg2 == 0) {
            boolean[] var14 = arg11 != null && arg11.field4782 ? class358.field4855[arg2] : class247.field3266[arg2];
            if (arg10 > 0) {
                if (arg0 > 0) {
                    int var15 = arg8[arg0 - 1][arg10 - 1] & 0xFF;
                    if (var15 > 0) {
                        class352 var16 = class67.method391(var15 - 1, true);
                        if (var16.field4787 != -1 && var16.field4782) {
                            byte var17 = arg4[arg0 - 1][arg10 - 1];
                            int var18 = arg3[arg0 - 1][arg10 - 1] * 2 + 4 & 0x7;
                            int var19 = class119.method794(arg7, var16, 49);
                            if (class393.field5350[var17][var18]) {
                                class27.field309[0] = var16.field4787;
                                class393.field5360[0] = var19;
                                class169.field1983[0] = arg7.method726() ? var16.field4780 : var16.field4794;
                                class92.field1077[0] = var16.field4792;
                                class180.field2097[0] = var16.field4778;
                                class252.field3302[0] = 256;
                            }
                        }
                    }
                }
                if (arg9 - 1 > arg0) {
                    int var20 = arg8[arg0 + 1][arg10 - 1] & 0xFF;
                    if (var20 > 0) {
                        class352 var21 = class67.method391(var20 - 1, true);
                        if (var21.field4787 != -1 && var21.field4782) {
                            byte var22 = arg4[arg0 + 1][arg10 - 1];
                            int var23 = arg3[arg0 + 1][arg10 - 1] * 2 + 6 & 0x7;
                            int var24 = class119.method794(arg7, var21, 53);
                            if (class393.field5350[var22][var23]) {
                                class27.field309[2] = var21.field4787;
                                class393.field5360[2] = var24;
                                class169.field1983[2] = arg7.method726() ? var21.field4780 : var21.field4794;
                                class92.field1077[2] = var21.field4792;
                                class180.field2097[2] = var21.field4778;
                                class252.field3302[2] = 512;
                            }
                        }
                    }
                }
            }
            if ((arg12 - 1) > arg10) {
                if (arg0 > 0) {
                    int var25 = arg8[arg0 - 1][arg10 + 1] & 0xFF;
                    if (var25 > 0) {
                        class352 var26 = class67.method391(var25 - 1, true);
                        if (var26.field4787 != -1 && var26.field4782) {
                            byte var27 = arg4[arg0 - 1][arg10 + 1];
                            int var28 = arg3[arg0 - 1][arg10 + 1] * 2 + 2 & 0x7;
                            int var29 = class119.method794(arg7, var26, 127);
                            if (class393.field5350[var27][var28]) {
                                class27.field309[6] = var26.field4787;
                                class393.field5360[6] = var29;
                                class169.field1983[6] = arg7.method726() ? var26.field4780 : var26.field4794;
                                class92.field1077[6] = var26.field4792;
                                class180.field2097[6] = var26.field4778;
                                class252.field3302[6] = 64;
                            }
                        }
                    }
                }
                if (arg0 < (arg9 - 1)) {
                    int var30 = arg8[arg0 + 1][arg10 + 1] & 0xFF;
                    if (var30 > 0) {
                        class352 var31 = class67.method391(var30 - 1, true);
                        if (var31.field4787 != -1 && var31.field4782) {
                            byte var32 = arg4[arg0 + 1][arg10 + 1];
                            int var33 = arg3[arg0 + 1][arg10 + 1] * 2 & 0x7;
                            int var34 = class119.method794(arg7, var31, 114);
                            if (class393.field5350[var32][var33]) {
                                class27.field309[4] = var31.field4787;
                                class393.field5360[4] = var34;
                                class169.field1983[4] = arg7.method726() ? var31.field4780 : var31.field4794;
                                class92.field1077[4] = var31.field4792;
                                class180.field2097[4] = var31.field4778;
                                class252.field3302[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg10 > 0) {
                int var35 = arg8[arg0][arg10 - 1] & 0xFF;
                if (var35 > 0) {
                    class352 var36 = class67.method391(var35 - 1, true);
                    if (var36.field4787 != -1) {
                        byte var37 = arg4[arg0][arg10 - 1];
                        byte var38 = arg3[arg0][arg10 - 1];
                        if (var36.field4782) {
                            int var39 = 2;
                            int var40 = var38 * 2 + 4;
                            int var41 = class119.method794(arg7, var36, 80);
                            for (int var42 = 0; var42 < 3; var42++) {
                                var40 &= 0x7;
                                var39 &= 0x7;
                                if (class393.field5350[var37][var40] && class180.field2097[var39] <= var36.field4778) {
                                    class27.field309[var39] = var36.field4787;
                                    class393.field5360[var39] = var41;
                                    class169.field1983[var39] = arg7.method726() ? var36.field4780 : var36.field4794;
                                    class92.field1077[var39] = var36.field4792;
                                    if (class180.field2097[var39] == var36.field4778) {
                                        class252.field3302[var39] = class213.method1307(class252.field3302[var39], 32);
                                    } else {
                                        class252.field3302[var39] = 32;
                                    }
                                    class180.field2097[var39] = var36.field4778;
                                }
                                var40++;
                                var39--;
                            }
                            if (!var14[-(-arg5) & 0x3]) {
                                arg6[0] = class358.field4855[var37][class191.method1183(3, var38 + 2)];
                            }
                        } else if (!var14[-(-arg5) & 0x3]) {
                            arg6[0] = class247.field3266[var37][class191.method1183(3, var38 + 2)];
                        }
                    }
                }
            }
            if ((arg12 - 1) > arg10) {
                int var43 = arg8[arg0][arg10 + 1] & 0xFF;
                if (var43 > 0) {
                    class352 var44 = class67.method391(var43 - 1, true);
                    if (var44.field4787 != -1) {
                        byte var45 = arg4[arg0][arg10 + 1];
                        byte var46 = arg3[arg0][arg10 + 1];
                        if (var44.field4782) {
                            int var47 = 4;
                            int var48 = var46 * 2 + 2;
                            int var49 = class119.method794(arg7, var44, 83);
                            for (int var50 = 0; var50 < 3; var50++) {
                                var48 &= 0x7;
                                var47 &= 0x7;
                                if (class393.field5350[var45][var48] && class180.field2097[var47] <= var44.field4778) {
                                    class27.field309[var47] = var44.field4787;
                                    class393.field5360[var47] = var49;
                                    class169.field1983[var47] = arg7.method726() ? var44.field4780 : var44.field4794;
                                    class92.field1077[var47] = var44.field4792;
                                    if (class180.field2097[var47] == var44.field4778) {
                                        class252.field3302[var47] = class213.method1307(class252.field3302[var47], 16);
                                    } else {
                                        class252.field3302[var47] = 16;
                                    }
                                    class180.field2097[var47] = var44.field4778;
                                }
                                var47++;
                                var48--;
                            }
                            if (!var14[arg5 + 2 & 0x3]) {
                                arg6[2] = class358.field4855[var45][class191.method1183(3, -(-var46))];
                            }
                        } else if (!var14[arg5 + 2 & 0x3]) {
                            arg6[2] = class247.field3266[var45][class191.method1183(3, var46)];
                        }
                    }
                }
            }
            if (arg0 > 0) {
                int var51 = arg8[arg0 - 1][arg10] & 0xFF;
                if (var51 > 0) {
                    class352 var52 = class67.method391(var51 - 1, true);
                    if (var52.field4787 != -1) {
                        byte var53 = arg4[arg0 - 1][arg10];
                        byte var54 = arg3[arg0 - 1][arg10];
                        if (var52.field4782) {
                            int var55 = 6;
                            int var56 = var54 * 2 + 4;
                            int var57 = class119.method794(arg7, var52, 113);
                            for (int var58 = 0; var58 < 3; var58++) {
                                var56 &= 0x7;
                                var55 &= 0x7;
                                if (class393.field5350[var53][var56] && class180.field2097[var55] <= var52.field4778) {
                                    class27.field309[var55] = var52.field4787;
                                    class393.field5360[var55] = var57;
                                    class169.field1983[var55] = arg7.method726() ? var52.field4780 : var52.field4794;
                                    class92.field1077[var55] = var52.field4792;
                                    if (class180.field2097[var55] == var52.field4778) {
                                        class252.field3302[var55] = class213.method1307(class252.field3302[var55], 8);
                                    } else {
                                        class252.field3302[var55] = 8;
                                    }
                                    class180.field2097[var55] = var52.field4778;
                                }
                                var56--;
                                var55++;
                            }
                            if (!var14[arg5 + 3 & 0x3]) {
                                arg6[3] = class358.field4855[var53][class191.method1183(3, var54 + 1)];
                            }
                        } else if (!var14[arg5 + 3 & 0x3]) {
                            arg6[3] = class247.field3266[var53][class191.method1183(var54 + 1, 3)];
                        }
                    }
                }
            }
            if ((arg9 - 1) > arg0) {
                int var59 = arg8[arg0 + 1][arg10] & 0xFF;
                if (var59 > 0) {
                    class352 var60 = class67.method391(var59 - 1, true);
                    if (var60.field4787 != -1) {
                        byte var61 = arg4[arg0 + 1][arg10];
                        byte var62 = arg3[arg0 + 1][arg10];
                        if (var60.field4782) {
                            int var63 = 4;
                            int var64 = var62 * 2 + 6;
                            int var65 = class119.method794(arg7, var60, 116);
                            for (int var66 = 0; var66 < 3; var66++) {
                                var63 &= 0x7;
                                var64 &= 0x7;
                                if (class393.field5350[var61][var64] && class180.field2097[var63] <= var60.field4778) {
                                    class27.field309[var63] = var60.field4787;
                                    class393.field5360[var63] = var65;
                                    class169.field1983[var63] = arg7.method726() ? var60.field4780 : var60.field4794;
                                    class92.field1077[var63] = var60.field4792;
                                    if (class180.field2097[var63] == var60.field4778) {
                                        class252.field3302[var63] = class213.method1307(class252.field3302[var63], 4);
                                    } else {
                                        class252.field3302[var63] = 4;
                                    }
                                    class180.field2097[var63] = var60.field4778;
                                }
                                var63--;
                                var64++;
                            }
                            if (!var14[arg5 + 1 & 0x3]) {
                                arg6[1] = class358.field4855[var61][class191.method1183(3, var62 + 3)];
                            }
                        } else if (!var14[arg5 + 1 & 0x3]) {
                            arg6[1] = class247.field3266[var61][class191.method1183(var62 + 3, 3)];
                        }
                    }
                }
            }
        }
        if (arg11 == null) {
            return;
        }
        int var67 = class119.method794(arg7, arg11, 57);
        if (!arg11.field4782) {
            return;
        }
        for (int var68 = 0; var68 < 8; var68++) {
            int var69 = var68 - arg5 * 2 & 0x7;
            if (class393.field5350[arg2][var68] && class180.field2097[var69] <= arg11.field4778) {
                class27.field309[var69] = arg11.field4787;
                class393.field5360[var69] = var67;
                class169.field1983[var69] = arg7.method726() ? arg11.field4780 : arg11.field4794;
                class92.field1077[var69] = arg11.field4792;
                if (class180.field2097[var69] == arg11.field4778) {
                    class252.field3302[var69] = class213.method1307(class252.field3302[var69], 2);
                } else {
                    class252.field3302[var69] = 2;
                }
                class180.field2097[var69] = arg11.field4778;
            }
        }
        return;
    }
}
