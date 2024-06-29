import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class class224 {

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I[[B[[BIILcf;[Z[[BILqn;IIILuo;)V", line = 3)
    public static final void method1494(int arg0, byte[][] arg1, byte[][] arg2, int arg3, int arg4, class361 arg5, boolean[] arg6, byte[][] arg7, int arg8, class40 arg9, int arg10, int arg11, int arg12, class345 arg13) {
        if (arg4 != 4) {
            return;
        }
        if (arg5 != null && arg9 != null || arg9 != null && arg3 == 12 || arg5 != null && arg3 == 0) {
            boolean[] var14 = arg5 != null && arg5.field4996 ? class329.field4566[arg3] : class62.field861[arg3];
            if (arg10 > 0) {
                if (arg0 > 0) {
                    int var15 = arg7[arg0 - 1][arg10 - 1] & 0xFF;
                    if (var15 > 0) {
                        class361 var16 = class39.method362((byte) 3, var15 - 1);
                        if (var16.field4989 != -1 && var16.field4996) {
                            byte var17 = arg2[arg0 - 1][arg10 - 1];
                            int var18 = (arg1[arg0 - 1][arg10 - 1] * 2) + 4 & 0x7;
                            int var19 = class61.method470(127, arg13, var16);
                            if (class44.field627[var17][var18]) {
                                class188.field2598[0] = var16.field4989;
                                class352.field4823[0] = var19;
                                class22.field401[0] = arg13.method51() ? var16.field4991 : var16.field4995;
                                class413.field5861[0] = var16.field4999;
                                class171.field2340[0] = var16.field4985;
                                class35.field543[0] = 256;
                            }
                        }
                    }
                }
                if (arg0 < arg8 - 1) {
                    int var20 = arg7[arg0 + 1][arg10 - 1] & 0xFF;
                    if (var20 > 0) {
                        class361 var21 = class39.method362((byte) 3, var20 - 1);
                        if (var21.field4989 != -1 && var21.field4996) {
                            byte var22 = arg2[arg0 + 1][arg10 - 1];
                            int var23 = arg1[arg0 + 1][arg10 - 1] * 2 + 6 & 0x7;
                            int var24 = class61.method470(122, arg13, var21);
                            if (class44.field627[var22][var23]) {
                                class188.field2598[2] = var21.field4989;
                                class352.field4823[2] = var24;
                                class22.field401[2] = arg13.method51() ? var21.field4991 : var21.field4995;
                                class413.field5861[2] = var21.field4999;
                                class171.field2340[2] = var21.field4985;
                                class35.field543[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg10 < (arg12 - 1)) {
                if (arg0 > 0) {
                    int var25 = arg7[arg0 - 1][arg10 + 1] & 0xFF;
                    if (var25 > 0) {
                        class361 var26 = class39.method362((byte) 3, var25 - 1);
                        if (var26.field4989 != -1 && var26.field4996) {
                            byte var27 = arg2[arg0 - 1][arg10 + 1];
                            int var28 = arg1[arg0 - 1][arg10 + 1] * 2 + 2 & 0x7;
                            int var29 = class61.method470(125, arg13, var26);
                            if (class44.field627[var27][var28]) {
                                class188.field2598[6] = var26.field4989;
                                class352.field4823[6] = var29;
                                class22.field401[6] = arg13.method51() ? var26.field4991 : var26.field4995;
                                class413.field5861[6] = var26.field4999;
                                class171.field2340[6] = var26.field4985;
                                class35.field543[6] = 64;
                            }
                        }
                    }
                }
                if (arg8 - 1 > arg0) {
                    int var30 = arg7[arg0 + 1][arg10 + 1] & 0xFF;
                    if (var30 > 0) {
                        class361 var31 = class39.method362((byte) 3, var30 - 1);
                        if (var31.field4989 != -1 && var31.field4996) {
                            byte var32 = arg2[arg0 + 1][arg10 + 1];
                            int var33 = -(-(arg1[arg0 + 1][arg10 + 1] * 2)) & 0x7;
                            int var34 = class61.method470(126, arg13, var31);
                            if (class44.field627[var32][var33]) {
                                class188.field2598[4] = var31.field4989;
                                class352.field4823[4] = var34;
                                class22.field401[4] = arg13.method51() ? var31.field4991 : var31.field4995;
                                class413.field5861[4] = var31.field4999;
                                class171.field2340[4] = var31.field4985;
                                class35.field543[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg10 > 0) {
                int var35 = arg7[arg0][arg10 - 1] & 0xFF;
                if (var35 > 0) {
                    class361 var36 = class39.method362((byte) 3, var35 - 1);
                    if (var36.field4989 != -1) {
                        byte var37 = arg2[arg0][arg10 - 1];
                        byte var38 = arg1[arg0][arg10 - 1];
                        if (var36.field4996) {
                            int var39 = 2;
                            int var40 = (var38 * 2) + 4;
                            int var41 = class61.method470(125, arg13, var36);
                            for (int var42 = 0; var42 < 3; var42++) {
                                var39 &= 0x7;
                                var40 &= 0x7;
                                if (class44.field627[var37][var40] && class171.field2340[var39] <= var36.field4985) {
                                    class188.field2598[var39] = var36.field4989;
                                    class352.field4823[var39] = var41;
                                    class22.field401[var39] = arg13.method51() ? var36.field4991 : var36.field4995;
                                    class413.field5861[var39] = var36.field4999;
                                    if (class171.field2340[var39] == var36.field4985) {
                                        class35.field543[var39] = class393.method2487(class35.field543[var39], 32);
                                    } else {
                                        class35.field543[var39] = 32;
                                    }
                                    class171.field2340[var39] = var36.field4985;
                                }
                                var39--;
                                var40++;
                            }
                            if (!var14[arg11 & 0x3]) {
                                arg6[0] = class329.field4566[var37][class387.method2454(3, var38 + 2)];
                            }
                        } else if (!var14[arg11 & 0x3]) {
                            arg6[0] = class62.field861[var37][class387.method2454(var38 + 2, 3)];
                        }
                    }
                }
            }
            if ((arg12 - 1) > arg10) {
                int var43 = arg7[arg0][arg10 + 1] & 0xFF;
                if (var43 > 0) {
                    class361 var44 = class39.method362((byte) 3, var43 - 1);
                    if (var44.field4989 != -1) {
                        byte var45 = arg2[arg0][arg10 + 1];
                        byte var46 = arg1[arg0][arg10 + 1];
                        if (var44.field4996) {
                            int var47 = 4;
                            int var48 = var46 * 2 + 2;
                            int var49 = class61.method470(123, arg13, var44);
                            for (int var50 = 0; var50 < 3; var50++) {
                                var48 &= 0x7;
                                var47 &= 0x7;
                                if (class44.field627[var45][var48] && class171.field2340[var47] <= var44.field4985) {
                                    class188.field2598[var47] = var44.field4989;
                                    class352.field4823[var47] = var49;
                                    class22.field401[var47] = arg13.method51() ? var44.field4991 : var44.field4995;
                                    class413.field5861[var47] = var44.field4999;
                                    if (class171.field2340[var47] == var44.field4985) {
                                        class35.field543[var47] = class393.method2487(class35.field543[var47], 16);
                                    } else {
                                        class35.field543[var47] = 16;
                                    }
                                    class171.field2340[var47] = var44.field4985;
                                }
                                var47++;
                                var48--;
                            }
                            if (!var14[arg11 + 2 & 0x3]) {
                                arg6[2] = class329.field4566[var45][class387.method2454(var46, 3)];
                            }
                        } else if (!var14[arg11 + 2 & 0x3]) {
                            arg6[2] = class62.field861[var45][class387.method2454(var46, 3)];
                        }
                    }
                }
            }
            if (arg0 > 0) {
                int var51 = arg7[arg0 - 1][arg10] & 0xFF;
                if (var51 > 0) {
                    class361 var52 = class39.method362((byte) 3, var51 - 1);
                    if (var52.field4989 != -1) {
                        byte var53 = arg2[arg0 - 1][arg10];
                        byte var54 = arg1[arg0 - 1][arg10];
                        if (var52.field4996) {
                            int var55 = 6;
                            int var56 = var54 * 2 + 4;
                            int var57 = class61.method470(123, arg13, var52);
                            for (int var58 = 0; var58 < 3; var58++) {
                                var56 &= 0x7;
                                var55 &= 0x7;
                                if (class44.field627[var53][var56] && var52.field4985 >= class171.field2340[var55]) {
                                    class188.field2598[var55] = var52.field4989;
                                    class352.field4823[var55] = var57;
                                    class22.field401[var55] = arg13.method51() ? var52.field4991 : var52.field4995;
                                    class413.field5861[var55] = var52.field4999;
                                    if (class171.field2340[var55] == var52.field4985) {
                                        class35.field543[var55] = class393.method2487(class35.field543[var55], 8);
                                    } else {
                                        class35.field543[var55] = 8;
                                    }
                                    class171.field2340[var55] = var52.field4985;
                                }
                                var55++;
                                var56--;
                            }
                            if (!var14[arg11 + 3 & 0x3]) {
                                arg6[3] = class329.field4566[var53][class387.method2454(var54 + 1, 3)];
                            }
                        } else if (!var14[arg11 + 3 & 0x3]) {
                            arg6[3] = class62.field861[var53][class387.method2454(3, var54 + 1)];
                        }
                    }
                }
            }
            if (arg8 - 1 > arg0) {
                int var59 = arg7[arg0 + 1][arg10] & 0xFF;
                if (var59 > 0) {
                    class361 var60 = class39.method362((byte) 3, var59 - 1);
                    if (var60.field4989 != -1) {
                        byte var61 = arg2[arg0 + 1][arg10];
                        byte var62 = arg1[arg0 + 1][arg10];
                        if (var60.field4996) {
                            int var63 = 4;
                            int var64 = (var62 * 2) + 6;
                            int var65 = class61.method470(124, arg13, var60);
                            for (int var66 = 0; var66 < 3; var66++) {
                                var64 &= 0x7;
                                var63 &= 0x7;
                                if (class44.field627[var61][var64] && class171.field2340[var63] <= var60.field4985) {
                                    class188.field2598[var63] = var60.field4989;
                                    class352.field4823[var63] = var65;
                                    class22.field401[var63] = arg13.method51() ? var60.field4991 : var60.field4995;
                                    class413.field5861[var63] = var60.field4999;
                                    if (class171.field2340[var63] == var60.field4985) {
                                        class35.field543[var63] = class393.method2487(class35.field543[var63], 4);
                                    } else {
                                        class35.field543[var63] = 4;
                                    }
                                    class171.field2340[var63] = var60.field4985;
                                }
                                var64++;
                                var63--;
                            }
                            if (!var14[arg11 + 1 & 0x3]) {
                                arg6[1] = class329.field4566[var61][class387.method2454(3, var62 + 3)];
                            }
                        } else if (!var14[arg11 + 1 & 0x3]) {
                            arg6[1] = class62.field861[var61][class387.method2454(3, var62 + 3)];
                        }
                    }
                }
            }
        }
        field3172++;
        if (arg5 == null) {
            return;
        }
        int var67 = class61.method470(126, arg13, arg5);
        if (!arg5.field4996) {
            return;
        }
        for (int var68 = 0; var68 < 8; var68++) {
            int var69 = var68 - (arg11 * 2) & 0x7;
            if (class44.field627[arg3][var68] && arg5.field4985 >= class171.field2340[var69]) {
                class188.field2598[var69] = arg5.field4989;
                class352.field4823[var69] = var67;
                class22.field401[var69] = arg13.method51() ? arg5.field4991 : arg5.field4995;
                class413.field5861[var69] = arg5.field4999;
                if (class171.field2340[var69] == arg5.field4985) {
                    class35.field543[var69] = class393.method2487(class35.field543[var69], 2);
                } else {
                    class35.field543[var69] = 2;
                }
                class171.field2340[var69] = arg5.field4985;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZBLms;)V", line = 490)
    public static final void method1496(boolean arg0, byte arg1, class453 arg2) {
        field3174++;
        int var3 = arg2.field6434 == 0 ? arg2.field6342 : arg2.field6434;
        int var4 = arg2.field6377 == 0 ? arg2.field6447 : arg2.field6377;
        int var5 = -78 / ((arg1 - 77) / 38);
        class401.method2521(var3, arg2.field6314, var4, class143.field2057[arg2.field6314 >> 16], 10906, arg0);
        if (arg2.field6382 != null) {
            class401.method2521(var3, arg2.field6314, var4, arg2.field6382, 10906, arg0);
        }
        class26 var6 = (class26) class454.field6477.method886((long) arg2.field6314, 25651);
        if (var6 != null) {
            class108.method764(arg0, -125, var4, var6.field463, var3);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lod;I)Lod;")
    public abstract class295 method1495(class295 arg0, int arg1);
}
