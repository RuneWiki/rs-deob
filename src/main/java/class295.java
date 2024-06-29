import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class295 extends class381 {

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "[I")
    public static int[] field3972 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "[I")
    public static int[] field3978 = new int[32];

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field3971 = 0;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "Ljava/lang/String;")
    public static String field3986 = "Loading config - ";

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "J")
    public long field3984;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "Lhq;")
    public static class175 field3976;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "Ltg;")
    public class295 field3979;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "Ltg;")
    public class295 field3980;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "Ljava/lang/String;")
    public static String field3985;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V")
    public static void method1896(byte arg0) {
        field3978 = null;
        field3972 = null;
        field3985 = null;
        if (arg0 != -110) {
            method1896((byte) -13);
        }
        field3976 = null;
        field3986 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
    public static final void method1897(boolean arg0) {
        class53.field860 = class442.field6362.field4376 + class442.field6362.field4389 + 2;
        field3975++;
        class74.field1103 = class19.field375.field4389 + class19.field375.field4376 + 2;
        class77.field1161 = new String[350 / class53.field860];
        int var1 = 0;
        if (arg0) {
            method1900((byte) 120);
        }
        while (class77.field1161.length > var1) {
            class77.field1161[var1] = "";
            var1++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)Z")
    public final boolean method1898(int arg0) {
        field3973++;
        if (this.field3980 == null) {
            return false;
        } else {
            return arg0 == 7;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)V")
    public static final void method1899(int arg0, int arg1, int arg2, int arg3) {
        field3974++;
        int var4 = class148.field2284 * arg2 >> 8;
        if (var4 != 0 && arg3 != -1) {
            class138.method1086(arg3, -54, class227.field3137, false, var4, 0);
            class166.field2473 = true;
        }
        if (arg1 != -9) {
            field3971 = 83;
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)V")
    public static final void method1900(byte arg0) {
        field3981++;
        if (class304.field4109 != 3) {
            class227.field3144 = -1;
        }
        if (arg0 > -77) {
            method1896((byte) 19);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[[BLwd;II[[BIBILpe;[ZI[[BLfr;)V")
    public static final void method1901(int arg0, byte[][] arg1, class36 arg2, int arg3, int arg4, byte[][] arg5, int arg6, byte arg7, int arg8, class391 arg9, boolean[] arg10, int arg11, byte[][] arg12, class101 arg13) {
        if (arg2 != null && arg13 != null || arg13 != null && arg4 == 12 || arg2 != null && arg4 == 0) {
            boolean[] var14 = arg2 != null && arg2.field559 ? class450.field6510[arg4] : class408.field5719[arg4];
            if (arg11 > 0) {
                if (arg3 > 0) {
                    int var15 = arg5[arg3 - 1][arg11 - 1] & 0xFF;
                    if (var15 > 0) {
                        class36 var16 = class382.method2374(var15 - 1, 90);
                        if (var16.field550 != -1 && var16.field559) {
                            byte var17 = arg1[arg3 - 1][arg11 - 1];
                            int var18 = arg12[arg3 - 1][arg11 - 1] * 2 + 4 & 0x7;
                            int var19 = class156.method1194(var16, -103, arg9);
                            if (class291.field3947[var17][var18]) {
                                class75.field1124[0] = var16.field550;
                                class27.field479[0] = var19;
                                class224.field3105[0] = arg9.method172() ? var16.field546 : var16.field549;
                                class283.field3784[0] = var16.field555;
                                class23.field416[0] = var16.field560;
                                class416.field5827[0] = 256;
                            }
                        }
                    }
                }
                if ((arg0 - 1) > arg3) {
                    int var20 = arg5[arg3 + 1][arg11 - 1] & 0xFF;
                    if (var20 > 0) {
                        class36 var21 = class382.method2374(var20 - 1, 117);
                        if (var21.field550 != -1 && var21.field559) {
                            byte var22 = arg1[arg3 + 1][arg11 - 1];
                            int var23 = arg12[arg3 + 1][arg11 - 1] * 2 + 6 & 0x7;
                            int var24 = class156.method1194(var21, 5, arg9);
                            if (class291.field3947[var22][var23]) {
                                class75.field1124[2] = var21.field550;
                                class27.field479[2] = var24;
                                class224.field3105[2] = arg9.method172() ? var21.field546 : var21.field549;
                                class283.field3784[2] = var21.field555;
                                class23.field416[2] = var21.field560;
                                class416.field5827[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg11 < (arg6 - 1)) {
                if (arg3 > 0) {
                    int var25 = arg5[arg3 - 1][arg11 + 1] & 0xFF;
                    if (var25 > 0) {
                        class36 var26 = class382.method2374(var25 - 1, 26);
                        if (var26.field550 != -1 && var26.field559) {
                            byte var27 = arg1[arg3 - 1][arg11 + 1];
                            int var28 = arg12[arg3 - 1][arg11 + 1] * 2 + 2 & 0x7;
                            int var29 = class156.method1194(var26, arg7 - 54, arg9);
                            if (class291.field3947[var27][var28]) {
                                class75.field1124[6] = var26.field550;
                                class27.field479[6] = var29;
                                class224.field3105[6] = arg9.method172() ? var26.field546 : var26.field549;
                                class283.field3784[6] = var26.field555;
                                class23.field416[6] = var26.field560;
                                class416.field5827[6] = 64;
                            }
                        }
                    }
                }
                if (arg3 < (arg0 - 1)) {
                    int var30 = arg5[arg3 + 1][arg11 + 1] & 0xFF;
                    if (var30 > 0) {
                        class36 var31 = class382.method2374(var30 - 1, 83);
                        if (var31.field550 != -1 && var31.field559) {
                            byte var32 = arg1[arg3 + 1][arg11 + 1];
                            int var33 = arg12[arg3 + 1][arg11 + 1] * 2 & 0x7;
                            int var34 = class156.method1194(var31, -24, arg9);
                            if (class291.field3947[var32][var33]) {
                                class75.field1124[4] = var31.field550;
                                class27.field479[4] = var34;
                                class224.field3105[4] = arg9.method172() ? var31.field546 : var31.field549;
                                class283.field3784[4] = var31.field555;
                                class23.field416[4] = var31.field560;
                                class416.field5827[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg11 > 0) {
                int var35 = arg5[arg3][arg11 - 1] & 0xFF;
                if (var35 > 0) {
                    class36 var36 = class382.method2374(var35 - 1, 81);
                    if (var36.field550 != -1) {
                        byte var37 = arg1[arg3][arg11 - 1];
                        byte var38 = arg12[arg3][arg11 - 1];
                        if (var36.field559) {
                            int var39 = 2;
                            int var40 = var38 * 2 + 4;
                            int var41 = class156.method1194(var36, -52, arg9);
                            for (int var42 = 0; var42 < 3; var42++) {
                                var40 &= 0x7;
                                var39 &= 0x7;
                                if (class291.field3947[var37][var40] && var36.field560 >= class23.field416[var39]) {
                                    class75.field1124[var39] = var36.field550;
                                    class27.field479[var39] = var41;
                                    class224.field3105[var39] = arg9.method172() ? var36.field546 : var36.field549;
                                    class283.field3784[var39] = var36.field555;
                                    if (class23.field416[var39] == var36.field560) {
                                        class416.field5827[var39] = class260.method1678(class416.field5827[var39], 32);
                                    } else {
                                        class416.field5827[var39] = 32;
                                    }
                                    class23.field416[var39] = var36.field560;
                                }
                                var39--;
                                var40++;
                            }
                            if (!var14[arg8 & 0x3]) {
                                arg10[0] = class450.field6510[var37][class323.method2059(3, var38 + 2)];
                            }
                        } else if (!var14[arg8 & 0x3]) {
                            arg10[0] = class408.field5719[var37][class323.method2059(3, var38 + 2)];
                        }
                    }
                }
            }
            if (arg11 < (arg6 - 1)) {
                int var43 = arg5[arg3][arg11 + 1] & 0xFF;
                if (var43 > 0) {
                    class36 var44 = class382.method2374(var43 - 1, -84);
                    if (var44.field550 != -1) {
                        byte var45 = arg1[arg3][arg11 + 1];
                        byte var46 = arg12[arg3][arg11 + 1];
                        if (var44.field559) {
                            int var47 = 4;
                            int var48 = var46 * 2 + 2;
                            int var49 = class156.method1194(var44, arg7 + 130, arg9);
                            for (int var50 = 0; var50 < 3; var50++) {
                                var48 &= 0x7;
                                var47 &= 0x7;
                                if (class291.field3947[var45][var48] && var44.field560 >= class23.field416[var47]) {
                                    class75.field1124[var47] = var44.field550;
                                    class27.field479[var47] = var49;
                                    class224.field3105[var47] = arg9.method172() ? var44.field546 : var44.field549;
                                    class283.field3784[var47] = var44.field555;
                                    if (class23.field416[var47] == var44.field560) {
                                        class416.field5827[var47] = class260.method1678(class416.field5827[var47], 16);
                                    } else {
                                        class416.field5827[var47] = 16;
                                    }
                                    class23.field416[var47] = var44.field560;
                                }
                                var47++;
                                var48--;
                            }
                            if (!var14[arg8 + 2 & 0x3]) {
                                arg10[2] = class450.field6510[var45][class323.method2059(3, var46)];
                            }
                        } else if (!var14[arg8 + 2 & 0x3]) {
                            arg10[2] = class408.field5719[var45][class323.method2059(var46, 3)];
                        }
                    }
                }
            }
            if (arg3 > 0) {
                int var51 = arg5[arg3 - 1][arg11] & 0xFF;
                if (var51 > 0) {
                    class36 var52 = class382.method2374(var51 - 1, -116);
                    if (var52.field550 != -1) {
                        byte var53 = arg1[arg3 - 1][arg11];
                        byte var54 = arg12[arg3 - 1][arg11];
                        if (var52.field559) {
                            int var55 = 6;
                            int var56 = (var54 * 2) + 4;
                            int var57 = class156.method1194(var52, 124, arg9);
                            for (int var58 = 0; var58 < 3; var58++) {
                                var56 &= 0x7;
                                var55 &= 0x7;
                                if (class291.field3947[var53][var56] && class23.field416[var55] <= var52.field560) {
                                    class75.field1124[var55] = var52.field550;
                                    class27.field479[var55] = var57;
                                    class224.field3105[var55] = arg9.method172() ? var52.field546 : var52.field549;
                                    class283.field3784[var55] = var52.field555;
                                    if (class23.field416[var55] == var52.field560) {
                                        class416.field5827[var55] = class260.method1678(class416.field5827[var55], 8);
                                    } else {
                                        class416.field5827[var55] = 8;
                                    }
                                    class23.field416[var55] = var52.field560;
                                }
                                var56--;
                                var55++;
                            }
                            if (!var14[arg8 + 3 & 0x3]) {
                                arg10[3] = class450.field6510[var53][class323.method2059(var54 + 1, 3)];
                            }
                        } else if (!var14[arg8 + 3 & 0x3]) {
                            arg10[3] = class408.field5719[var53][class323.method2059(3, var54 + 1)];
                        }
                    }
                }
            }
            if (arg3 < arg0 - 1) {
                int var59 = arg5[arg3 + 1][arg11] & 0xFF;
                if (var59 > 0) {
                    class36 var60 = class382.method2374(var59 - 1, -125);
                    if (var60.field550 != -1) {
                        byte var61 = arg1[arg3 + 1][arg11];
                        byte var62 = arg12[arg3 + 1][arg11];
                        if (var60.field559) {
                            int var63 = 4;
                            int var64 = (var62 * 2) + 6;
                            int var65 = class156.method1194(var60, 113, arg9);
                            for (int var66 = 0; var66 < 3; var66++) {
                                var63 &= 0x7;
                                var64 &= 0x7;
                                if (class291.field3947[var61][var64] && var60.field560 >= class23.field416[var63]) {
                                    class75.field1124[var63] = var60.field550;
                                    class27.field479[var63] = var65;
                                    class224.field3105[var63] = arg9.method172() ? var60.field546 : var60.field549;
                                    class283.field3784[var63] = var60.field555;
                                    if (class23.field416[var63] == var60.field560) {
                                        class416.field5827[var63] = class260.method1678(class416.field5827[var63], 4);
                                    } else {
                                        class416.field5827[var63] = 4;
                                    }
                                    class23.field416[var63] = var60.field560;
                                }
                                var63--;
                                var64++;
                            }
                            if (!var14[arg8 + 1 & 0x3]) {
                                arg10[1] = class450.field6510[var61][class323.method2059(var62 + 3, 3)];
                            }
                        } else if (!var14[arg8 + 1 & 0x3]) {
                            arg10[1] = class408.field5719[var61][class323.method2059(var62 + 3, 3)];
                        }
                    }
                }
            }
        }
        field3982++;
        if (arg7 != -22 || arg2 == null) {
            return;
        }
        int var67 = class156.method1194(arg2, -20, arg9);
        if (!arg2.field559) {
            return;
        }
        for (int var68 = 0; var68 < 8; var68++) {
            int var69 = var68 - (arg8 * 2) & 0x7;
            if (class291.field3947[arg4][var68] && class23.field416[var69] <= arg2.field560) {
                class75.field1124[var69] = arg2.field550;
                class27.field479[var69] = var67;
                class224.field3105[var69] = arg9.method172() ? arg2.field546 : arg2.field549;
                class283.field3784[var69] = arg2.field555;
                if (class23.field416[var69] == arg2.field560) {
                    class416.field5827[var69] = class260.method1678(class416.field5827[var69], 2);
                } else {
                    class416.field5827[var69] = 2;
                }
                class23.field416[var69] = arg2.field560;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)V")
    public final void method1902(int arg0) {
        if (arg0 != 32) {
            field3985 = null;
        }
        field3977++;
        if (this.field3980 != null) {
            this.field3980.field3979 = this.field3979;
            this.field3979.field3980 = this.field3980;
            this.field3980 = null;
            this.field3979 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILpe;)V")
    public static final void method1903(int arg0, class391 arg1) {
        if (arg0 > 0) {
            field3983++;
            if (class69.field1046 != class151.field2323 && class118.field1653 != null && class199.method1405(class69.field1046, arg1, -104)) {
                class151.field2323 = class69.field1046;
            }
        }
    }
}
