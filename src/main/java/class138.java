import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class138 extends class34 {

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "Lcc;")
    public class209 field2594;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field2593 = 0;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLga;IIZIIIIII)V")
    public static final void method962(boolean arg0, class170 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2591++;
        if (arg0 && !class186.method1273(80) && (class285.field5023[0][arg6][arg10] & 0x2) == 0) {
            if ((class285.field5023[arg3][arg6][arg10] & 0x10) != 0) {
                return;
            }
            if (class58.method449(arg10, arg3, arg6, -4537) != class167.field3005) {
                return;
            }
        }
        if (arg3 < class84.field1669) {
            class84.field1669 = arg3;
        }
        class218 var11 = class245.method1711(27093, arg7);
        int var12;
        int var13;
        if (arg8 == 1 || arg8 == 3) {
            var12 = var11.field3912;
            var13 = var11.field3916;
        } else {
            var12 = var11.field3916;
            var13 = var11.field3912;
        }
        int[][] var14 = class271.field4803[arg2];
        int var15 = (arg6 << 7) + (var12 << 6);
        int var16 = (arg10 << 7) + (var13 << 6);
        int var17;
        int var18;
        if (arg10 + var13 > 104) {
            var17 = arg10 + 1;
            var18 = arg10;
        } else {
            var18 = (var13 >> 1) + arg10;
            var17 = (var13 + 1 >> 1) + arg10;
        }
        int var19;
        int var20;
        if ((arg6 + var12) > 104) {
            var19 = arg6;
            var20 = arg6 + 1;
        } else {
            var19 = (var12 >> 1) + arg6;
            var20 = (var12 + 1 >> 1) + arg6;
        }
        int var21 = var14[var19][var18] + var14[var20][var18] + var14[var19][var17] + var14[var20][var17] >> 2;
        int[][] var22 = null;
        long var23 = (long) (arg8 << 20 | arg6 | arg10 << 7 | arg9 << 14 | 0x40000000);
        if (arg4) {
            var22 = class38.field656[0];
        } else if (arg2 < 3) {
            var22 = class271.field4803[arg2 + 1];
        }
        if (var11.field3973 == 0 || arg4) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field3957 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field3940) {
            var23 |= 0x80000000L;
        }
        long var25 = var23 | (long) arg7 << 32;
        if (var11.method1527((byte) 86)) {
            class114.method810(var11, arg10, arg8, arg3, (byte) 121, (class163) null, arg6, (class108) null);
        }
        boolean var27 = !arg4 & var11.field3941;
        if (arg9 == 22) {
            if (class52.field1022 || var11.field3973 != 0 || var11.field3926 == 1 || var11.field3972) {
                class126 var29;
                if (var11.field3966 == -1 && var11.field3917 == null && !var11.field3950) {
                    class104 var28 = var11.method1537(arg0, arg5 ^ 0xFFFFA3E0, arg8, var16, var27, var15, (class194) null, var22, var14, var21, 22);
                    var29 = var28.field2012;
                } else {
                    var29 = new class115(arg7, 22, arg8, arg2, arg6, arg10, var11.field3966, var11.field3937, (class126) null);
                }
                class179.method1235(arg3, arg6, arg10, var21, var29, var25, var11.field3948);
                if (var11.field3926 == 1 && arg1 != null) {
                    arg1.method1182(arg6, 80, arg10);
                }
            }
        } else if (arg9 == 10 || arg9 == 11) {
            class126 var69;
            if (var11.field3966 == -1 && var11.field3917 == null && !var11.field3950) {
                class104 var68 = var11.method1537(arg0, -23584, ~arg9 == -12 ? arg8 + 4 : arg8, var16, var27, var15, (class194) null, var22, var14, var21, 10);
                var69 = var68.field2012;
            } else {
                var69 = new class115(arg7, 10, arg9 == 11 ? arg8 + 4 : arg8, arg2, arg6, arg10, var11.field3966, var11.field3937, (class126) null);
            }
            if (var69 != null) {
                boolean var70 = class216.method1515(arg3, arg6, arg10, var21, var12, var13, var69, 0, var25);
                if (var11.field3967 && var70 && arg0) {
                    int var71 = 15;
                    if (var69 instanceof class189) {
                        var71 = ((class189) var69).method405() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var12; var72++) {
                        for (int var73 = 0; var73 <= var13; var73++) {
                            if (var71 > class80.field1497[arg3][arg6 + var72][arg10 + var73]) {
                                class80.field1497[arg3][arg6 + var72][arg10 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field3926 != 0 && arg1 != null) {
                arg1.method1180(arg6, var12, var13, var11.field3949, 1, arg10);
            }
        } else if (arg9 >= 12) {
            class126 var31;
            if (var11.field3966 == -1 && var11.field3917 == null && !var11.field3950) {
                class104 var30 = var11.method1537(arg0, arg5 - 23584, arg8, var16, var27, var15, (class194) null, var22, var14, var21, arg9);
                var31 = var30.field2012;
            } else {
                var31 = new class115(arg7, arg9, arg8, arg2, arg6, arg10, var11.field3966, var11.field3937, (class126) null);
            }
            class216.method1515(arg3, arg6, arg10, var21, 1, 1, var31, 0, var25);
            if (arg0 && arg9 >= 12 && arg9 <= 17 && arg9 != 13 && arg3 > 0) {
                class97.field1887[arg3][arg6][arg10] = class6.method63(class97.field1887[arg3][arg6][arg10], 4);
            }
            if (var11.field3926 != 0 && arg1 != null) {
                arg1.method1180(arg6, var12, var13, var11.field3949, 1, arg10);
            }
        } else if (arg9 == 0) {
            class126 var33;
            if (var11.field3966 == -1 && var11.field3917 == null && !var11.field3950) {
                class104 var32 = var11.method1537(arg0, arg5 - 23584, arg8, var16, var27, var15, (class194) null, var22, var14, var21, 0);
                var33 = var32.field2012;
            } else {
                var33 = new class115(arg7, 0, arg8, arg2, arg6, arg10, var11.field3966, var11.field3937, (class126) null);
            }
            class66.method486(arg3, arg6, arg10, var21, var33, (class126) null, class128.field2471[arg8], 0, var25);
            if (arg0) {
                if (arg8 == 0) {
                    if (var11.field3967) {
                        class80.field1497[arg3][arg6][arg10] = 50;
                        class80.field1497[arg3][arg6][arg10 + 1] = 50;
                    }
                    if (var11.field3963) {
                        class97.field1887[arg3][arg6][arg10] = class6.method63(class97.field1887[arg3][arg6][arg10], 1);
                    }
                } else if (arg8 == 1) {
                    if (var11.field3967) {
                        class80.field1497[arg3][arg6][arg10 + 1] = 50;
                        class80.field1497[arg3][arg6 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field3963) {
                        class97.field1887[arg3][arg6][arg10 + 1] = class6.method63(class97.field1887[arg3][arg6][arg10 + 1], 2);
                    }
                } else if (arg8 == 2) {
                    if (var11.field3967) {
                        class80.field1497[arg3][arg6 + 1][arg10] = 50;
                        class80.field1497[arg3][arg6 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field3963) {
                        class97.field1887[arg3][arg6 + 1][arg10] = class6.method63(class97.field1887[arg3][arg6 + 1][arg10], 1);
                    }
                } else if (arg8 == 3) {
                    if (var11.field3967) {
                        class80.field1497[arg3][arg6][arg10] = 50;
                        class80.field1497[arg3][arg6 + 1][arg10] = 50;
                    }
                    if (var11.field3963) {
                        class97.field1887[arg3][arg6][arg10] = class6.method63(class97.field1887[arg3][arg6][arg10], 2);
                    }
                }
            }
            if (var11.field3926 != 0 && arg1 != null) {
                arg1.method1165(arg9, var11.field3949, arg6, arg8, -94, arg10);
            }
            if (var11.field3920 != 16) {
                class195.method1339(arg3, arg6, arg10, var11.field3920);
            }
        } else if (arg9 == 1) {
            class126 var35;
            if (var11.field3966 == -1 && var11.field3917 == null && !var11.field3950) {
                class104 var34 = var11.method1537(arg0, -23584, arg8, var16, var27, var15, (class194) null, var22, var14, var21, 1);
                var35 = var34.field2012;
            } else {
                var35 = new class115(arg7, 1, arg8, arg2, arg6, arg10, var11.field3966, var11.field3937, (class126) null);
            }
            class66.method486(arg3, arg6, arg10, var21, var35, (class126) null, class182.field3291[arg8], 0, var25);
            if (var11.field3967 && arg0) {
                if (arg8 == 0) {
                    class80.field1497[arg3][arg6][arg10 + 1] = 50;
                } else if (arg8 == 1) {
                    class80.field1497[arg3][arg6 + 1][arg10 + 1] = 50;
                } else if (arg8 == 2) {
                    class80.field1497[arg3][arg6 + 1][arg10] = 50;
                } else if (arg8 == 3) {
                    class80.field1497[arg3][arg6][arg10] = 50;
                }
            }
            if (var11.field3926 != 0 && arg1 != null) {
                arg1.method1165(arg9, var11.field3949, arg6, arg8, -105, arg10);
            }
        } else if (arg9 == 2) {
            int var36 = arg8 + 1 & 0x3;
            class126 var38;
            class126 var40;
            if (var11.field3966 == -1 && var11.field3917 == null && !var11.field3950) {
                class104 var37 = var11.method1537(arg0, -23584, arg8 + 4, var16, var27, var15, (class194) null, var22, var14, var21, 2);
                var38 = var37.field2012;
                class104 var39 = var11.method1537(arg0, -23584, var36, var16, var27, var15, (class194) null, var22, var14, var21, 2);
                var40 = var39.field2012;
            } else {
                var38 = new class115(arg7, 2, arg8 + 4, arg2, arg6, arg10, var11.field3966, var11.field3937, (class126) null);
                var40 = new class115(arg7, 2, var36, arg2, arg6, arg10, var11.field3966, var11.field3937, (class126) null);
            }
            class66.method486(arg3, arg6, arg10, var21, var38, var40, class128.field2471[arg8], class128.field2471[var36], var25);
            if (var11.field3963 && arg0) {
                if (arg8 == 0) {
                    class97.field1887[arg3][arg6][arg10] = class6.method63(class97.field1887[arg3][arg6][arg10], 1);
                    class97.field1887[arg3][arg6][arg10 + 1] = class6.method63(class97.field1887[arg3][arg6][arg10 + 1], 2);
                } else if (arg8 == 1) {
                    class97.field1887[arg3][arg6][arg10 + 1] = class6.method63(class97.field1887[arg3][arg6][arg10 + 1], 2);
                    class97.field1887[arg3][arg6 + 1][arg10] = class6.method63(class97.field1887[arg3][arg6 + 1][arg10], 1);
                } else if (arg8 == 2) {
                    class97.field1887[arg3][arg6 + 1][arg10] = class6.method63(class97.field1887[arg3][arg6 + 1][arg10], 1);
                    class97.field1887[arg3][arg6][arg10] = class6.method63(class97.field1887[arg3][arg6][arg10], 2);
                } else if (arg8 == 3) {
                    class97.field1887[arg3][arg6][arg10] = class6.method63(class97.field1887[arg3][arg6][arg10], 2);
                    class97.field1887[arg3][arg6][arg10] = class6.method63(class97.field1887[arg3][arg6][arg10], 1);
                }
            }
            if (var11.field3926 != 0 && arg1 != null) {
                arg1.method1165(arg9, var11.field3949, arg6, arg8, -96, arg10);
            }
            if (var11.field3920 != 16) {
                class195.method1339(arg3, arg6, arg10, var11.field3920);
            }
        } else if (arg9 == 3) {
            class126 var42;
            if (var11.field3966 == -1 && var11.field3917 == null && !var11.field3950) {
                class104 var41 = var11.method1537(arg0, arg5 ^ 0xFFFFA3E0, arg8, var16, var27, var15, (class194) null, var22, var14, var21, 3);
                var42 = var41.field2012;
            } else {
                var42 = new class115(arg7, 3, arg8, arg2, arg6, arg10, var11.field3966, var11.field3937, (class126) null);
            }
            class66.method486(arg3, arg6, arg10, var21, var42, (class126) null, class182.field3291[arg8], 0, var25);
            if (var11.field3967 && arg0) {
                if (arg8 == 0) {
                    class80.field1497[arg3][arg6][arg10 + 1] = 50;
                } else if (arg8 == 1) {
                    class80.field1497[arg3][arg6 + 1][arg10 + 1] = 50;
                } else if (arg8 == 2) {
                    class80.field1497[arg3][arg6 + 1][arg10] = 50;
                } else if (arg8 == 3) {
                    class80.field1497[arg3][arg6][arg10] = 50;
                }
            }
            if (var11.field3926 != 0 && arg1 != null) {
                arg1.method1165(arg9, var11.field3949, arg6, arg8, -126, arg10);
            }
        } else if (arg9 == 9) {
            class126 var44;
            if (var11.field3966 == -1 && var11.field3917 == null && !var11.field3950) {
                class104 var43 = var11.method1537(arg0, -23584, arg8, var16, var27, var15, (class194) null, var22, var14, var21, arg9);
                var44 = var43.field2012;
            } else {
                var44 = new class115(arg7, arg9, arg8, arg2, arg6, arg10, var11.field3966, var11.field3937, (class126) null);
            }
            class216.method1515(arg3, arg6, arg10, var21, 1, 1, var44, 0, var25);
            if (var11.field3926 != 0 && arg1 != null) {
                arg1.method1180(arg6, var12, var13, var11.field3949, 1, arg10);
            }
            if (var11.field3920 != 16) {
                class195.method1339(arg3, arg6, arg10, var11.field3920);
            }
        } else if (arg9 == 4) {
            class126 var46;
            if (var11.field3966 == -1 && var11.field3917 == null && !var11.field3950) {
                class104 var45 = var11.method1537(arg0, -23584, arg8, var16, var27, var15, (class194) null, var22, var14, var21, 4);
                var46 = var45.field2012;
            } else {
                var46 = new class115(arg7, 4, arg8, arg2, arg6, arg10, var11.field3966, var11.field3937, (class126) null);
            }
            class23.method198(arg3, arg6, arg10, var21, var46, (class126) null, class128.field2471[arg8], 0, 0, 0, var25);
        } else if (arg9 == 5) {
            int var47 = 16;
            long var48 = class227.method1598(arg3, arg6, arg10);
            if (var48 != 0L) {
                var47 = class245.method1711(27093, Integer.MAX_VALUE & (int) (var48 >>> 32)).field3920;
            }
            class126 var51;
            if (var11.field3966 == -1 && var11.field3917 == null && !var11.field3950) {
                class104 var50 = var11.method1537(arg0, -23584, arg8, var16, var27, var15, (class194) null, var22, var14, var21, 4);
                var51 = var50.field2012;
            } else {
                var51 = new class115(arg7, 4, arg8, arg2, arg6, arg10, var11.field3966, var11.field3937, (class126) null);
            }
            class23.method198(arg3, arg6, arg10, var21, var51, (class126) null, class128.field2471[arg8], 0, class235.field4225[arg8] * var47, class213.field3849[arg8] * var47, var25);
        } else if (arg9 == 6) {
            int var52 = 8;
            long var53 = class227.method1598(arg3, arg6, arg10);
            if (var53 != 0L) {
                var52 = class245.method1711(27093, (int) (var53 >>> 32) & Integer.MAX_VALUE).field3920 / 2;
            }
            class126 var56;
            if (var11.field3966 == -1 && var11.field3917 == null && !var11.field3950) {
                class104 var55 = var11.method1537(arg0, arg5 ^ 0xFFFFA3E0, arg8 + 4, var16, var27, var15, (class194) null, var22, var14, var21, 4);
                var56 = var55.field2012;
            } else {
                var56 = new class115(arg7, 4, arg8 + 4, arg2, arg6, arg10, var11.field3966, var11.field3937, (class126) null);
            }
            class23.method198(arg3, arg6, arg10, var21, var56, (class126) null, 256, arg8, class90.field1767[arg8] * var52, class157.field2867[arg8] * var52, var25);
        } else if (arg5 == 0) {
            if (arg9 == 7) {
                int var57 = arg8 + 2 & 0x3;
                class126 var59;
                if (var11.field3966 == -1 && var11.field3917 == null && !var11.field3950) {
                    class104 var58 = var11.method1537(arg0, -23584, var57 + 4, var16, var27, var15, (class194) null, var22, var14, var21, 4);
                    var59 = var58.field2012;
                } else {
                    var59 = new class115(arg7, 4, var57 + 4, arg2, arg6, arg10, var11.field3966, var11.field3937, (class126) null);
                }
                class23.method198(arg3, arg6, arg10, var21, var59, (class126) null, 256, var57, 0, 0, var25);
            } else if (arg9 == 8) {
                int var60 = 8;
                long var61 = class227.method1598(arg3, arg6, arg10);
                if (var61 != 0L) {
                    var60 = class245.method1711(27093, (int) (var61 >>> 32) & Integer.MAX_VALUE).field3920 / 2;
                }
                int var63 = arg8 + 2 & 0x3;
                class126 var65;
                class126 var67;
                if (var11.field3966 == -1 && var11.field3917 == null && !var11.field3950) {
                    class104 var64 = var11.method1537(arg0, -23584, arg8 + 4, var16, var27, var15, (class194) null, var22, var14, var21, 4);
                    var65 = var64.field2012;
                    class104 var66 = var11.method1537(arg0, -23584, var63 + 4, var16, var27, var15, (class194) null, var22, var14, var21, 4);
                    var67 = var66.field2012;
                } else {
                    var65 = new class115(arg7, 4, arg8 + 4, arg2, arg6, arg10, var11.field3966, var11.field3937, (class126) null);
                    var67 = new class115(arg7, 4, var63 + 4, arg2, arg6, arg10, var11.field3966, var11.field3937, (class126) null);
                }
                class23.method198(arg3, arg6, arg10, var21, var65, var67, 256, arg8, class90.field1767[arg8] * var60, class157.field2867[arg8] * var60, var25);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZII[IIIIIII)V")
    public static final void method963(int arg0, boolean arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2595++;
        int var11 = arg8;
        if (class4.field57 <= arg8) {
            return;
        }
        if (class4.field59 > arg8) {
            var11 = class4.field59;
        }
        int var12 = -98 / ((-arg10 - 4) / 56);
        int var13 = arg7 + arg8;
        if (var13 <= class4.field59) {
            return;
        }
        if (var13 > class4.field57) {
            var13 = class4.field57;
        }
        int var14 = arg5;
        if (arg5 >= class4.field56) {
            return;
        }
        if (class4.field54 > arg5) {
            var14 = class4.field54;
        }
        int var15 = arg2 + arg5;
        if (class4.field54 >= var15) {
            return;
        }
        int var16 = class4.field53 * var14 + var11;
        if (var15 > class4.field56) {
            var15 = class4.field56;
        }
        int var17 = var14 - arg5;
        int var18 = var11 + class4.field53 - var13;
        int var19 = var13 - arg8;
        int var20 = arg7 - var19;
        int var21 = var15 - arg5;
        if (arg6 == 9) {
            arg9 = arg9 + 1 & 0x3;
            arg6 = 1;
        }
        if (arg6 == 10) {
            arg9 = arg9 + 3 & 0x3;
            arg6 = 1;
        }
        if (arg6 == 11) {
            arg9 = arg9 + 3 & 0x3;
            arg6 = 8;
        }
        int var22 = arg2 - var17;
        int var23 = var11 - arg8;
        int var24 = arg2 - var21;
        int var25 = arg7 - var23;
        if (arg6 == 1) {
            if (arg9 == 0) {
                for (int var26 = var17; var26 < var21; var26++) {
                    for (int var27 = var23; var27 < var19; var27++) {
                        if (var26 >= var27) {
                            arg4[var16] = arg0;
                        } else if (arg1) {
                            arg4[var16] = arg3;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 1) {
                for (int var28 = var22 - 1; var28 >= var24; var28--) {
                    for (int var29 = var23; var29 < var19; var29++) {
                        if (var28 >= var29) {
                            arg4[var16] = arg0;
                        } else if (arg1) {
                            arg4[var16] = arg3;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 2) {
                for (int var30 = var17; var30 < var21; var30++) {
                    for (int var31 = var23; var31 < var19; var31++) {
                        if (var31 >= var30) {
                            arg4[var16] = arg0;
                        } else if (arg1) {
                            arg4[var16] = arg3;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 3) {
                for (int var32 = var22 - 1; var32 >= var24; var32--) {
                    for (int var33 = var23; var33 < var19; var33++) {
                        if (var33 >= var32) {
                            arg4[var16] = arg0;
                        } else if (arg1) {
                            arg4[var16] = arg3;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg6 == 2) {
            if (arg9 == 0) {
                for (int var34 = var22 - 1; var34 >= var24; var34--) {
                    for (int var35 = var23; var35 < var19; var35++) {
                        if ((var34 >> 1) >= var35) {
                            arg4[var16] = arg0;
                        } else if (arg1) {
                            arg4[var16] = arg3;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 1) {
                for (int var36 = var17; var36 < var21; var36++) {
                    for (int var37 = var23; var37 < var19; var37++) {
                        if (var16 >= 0 && var16 < arg4.length) {
                            if (var36 << 1 <= var37) {
                                arg4[var16] = arg0;
                            } else if (arg1) {
                                arg4[var16] = arg3;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var18;
                }
            } else if (arg9 == 2) {
                for (int var38 = var17; var38 < var21; var38++) {
                    for (int var39 = var25 - 1; var39 >= var20; var39--) {
                        if (var39 <= (var38 >> 1)) {
                            arg4[var16] = arg0;
                        } else if (arg1) {
                            arg4[var16] = arg3;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 3) {
                for (int var40 = var22 - 1; var40 >= var24; var40--) {
                    for (int var41 = var25 - 1; var41 >= var20; var41--) {
                        if ((var40 << 1) <= var41) {
                            arg4[var16] = arg0;
                        } else if (arg1) {
                            arg4[var16] = arg3;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg6 == 3) {
            if (arg9 == 0) {
                for (int var42 = var22 - 1; var42 >= var24; var42--) {
                    for (int var43 = var25 - 1; var43 >= var20; var43--) {
                        if (var43 <= (var42 >> 1)) {
                            arg4[var16] = arg0;
                        } else if (arg1) {
                            arg4[var16] = arg3;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 1) {
                for (int var44 = var22 - 1; var44 >= var24; var44--) {
                    for (int var45 = var23; var45 < var19; var45++) {
                        if (var45 >= (var44 << 1)) {
                            arg4[var16] = arg0;
                        } else if (arg1) {
                            arg4[var16] = arg3;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 2) {
                for (int var46 = var17; var46 < var21; var46++) {
                    for (int var47 = var23; var47 < var19; var47++) {
                        if ((var46 >> 1) >= var47) {
                            arg4[var16] = arg0;
                        } else if (arg1) {
                            arg4[var16] = arg3;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 3) {
                for (int var48 = var17; var48 < var21; var48++) {
                    for (int var49 = var25 - 1; var49 >= var20; var49--) {
                        if ((var48 << 1) <= var49) {
                            arg4[var16] = arg0;
                        } else if (arg1) {
                            arg4[var16] = arg3;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg6 == 4) {
            if (arg9 == 0) {
                for (int var50 = var22 - 1; var50 >= var24; var50--) {
                    for (int var51 = var23; var51 < var19; var51++) {
                        if (var51 >= (var50 >> 1)) {
                            arg4[var16] = arg0;
                        } else if (arg1) {
                            arg4[var16] = arg3;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 1) {
                for (int var52 = var17; var52 < var21; var52++) {
                    for (int var53 = var23; var53 < var19; var53++) {
                        if ((var52 << 1) >= var53) {
                            arg4[var16] = arg0;
                        } else if (arg1) {
                            arg4[var16] = arg3;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 2) {
                for (int var54 = var17; var54 < var21; var54++) {
                    for (int var55 = var25 - 1; var55 >= var20; var55--) {
                        if (var54 >> 1 <= var55) {
                            arg4[var16] = arg0;
                        } else if (arg1) {
                            arg4[var16] = arg3;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg9 == 3) {
                for (int var56 = var22 - 1; var56 >= var24; var56--) {
                    for (int var57 = var25 - 1; var57 >= var20; var57--) {
                        if ((var56 << 1) >= var57) {
                            arg4[var16] = arg0;
                        } else if (arg1) {
                            arg4[var16] = arg3;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg6 != 5) {
            if (arg6 == 6) {
                if (arg9 == 0) {
                    for (int var66 = var17; var66 < var21; var66++) {
                        for (int var67 = var23; var67 < var19; var67++) {
                            if ((arg7 / 2) >= var67) {
                                arg4[var16] = arg0;
                            } else if (arg1) {
                                arg4[var16] = arg3;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var68 = var17; var68 < var21; var68++) {
                        for (int var69 = var23; var69 < var19; var69++) {
                            if (arg2 / 2 >= var68) {
                                arg4[var16] = arg0;
                            } else if (arg1) {
                                arg4[var16] = arg3;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var70 = var17; var70 < var21; var70++) {
                        for (int var71 = var23; var71 < var19; var71++) {
                            if (var71 >= arg7 / 2) {
                                arg4[var16] = arg0;
                            } else if (arg1) {
                                arg4[var16] = arg3;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var72 = var17; var72 < var21; var72++) {
                        for (int var73 = var23; var73 < var19; var73++) {
                            if (var72 >= (arg2 / 2)) {
                                arg4[var16] = arg0;
                            } else if (arg1) {
                                arg4[var16] = arg3;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg6 == 7) {
                if (arg9 == 0) {
                    for (int var74 = var17; var74 < var21; var74++) {
                        for (int var75 = var23; var75 < var19; var75++) {
                            if ((var74 - (arg2 / 2)) >= var75) {
                                arg4[var16] = arg0;
                            } else if (arg1) {
                                arg4[var16] = arg3;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var76 = var22 - 1; var76 >= var24; var76--) {
                        for (int var77 = var23; var77 < var19; var77++) {
                            if (var77 <= (var76 - (arg2 / 2))) {
                                arg4[var16] = arg0;
                            } else if (arg1) {
                                arg4[var16] = arg3;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var78 = var22 - 1; var78 >= var24; var78--) {
                        for (int var79 = var25 - 1; var79 >= var20; var79--) {
                            if ((var78 - arg2 / 2) >= var79) {
                                arg4[var16] = arg0;
                            } else if (arg1) {
                                arg4[var16] = arg3;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var80 = var17; var80 < var21; var80++) {
                        for (int var81 = var25 - 1; var81 >= var20; var81--) {
                            if (var81 <= (var80 - (arg2 / 2))) {
                                arg4[var16] = arg0;
                            } else if (arg1) {
                                arg4[var16] = arg3;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg6 == 8) {
                if (arg9 == 0) {
                    for (int var82 = var17; var82 < var21; var82++) {
                        for (int var83 = var23; var83 < var19; var83++) {
                            if (var83 >= var82 - (arg2 / 2)) {
                                arg4[var16] = arg0;
                            } else if (arg1) {
                                arg4[var16] = arg3;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var84 = var22 - 1; var84 >= var24; var84--) {
                        for (int var85 = var23; var85 < var19; var85++) {
                            if (var84 - (arg2 / 2) <= var85) {
                                arg4[var16] = arg0;
                            } else if (arg1) {
                                arg4[var16] = arg3;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var86 = var22 - 1; var86 >= var24; var86--) {
                        for (int var87 = var25 - 1; var87 >= var20; var87--) {
                            if (var86 - (arg2 / 2) <= var87) {
                                arg4[var16] = arg0;
                            } else if (arg1) {
                                arg4[var16] = arg3;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var88 = var17; var88 < var21; var88++) {
                        for (int var89 = var25 - 1; var89 >= var20; var89--) {
                            if (var88 - (arg2 / 2) <= var89) {
                                arg4[var16] = arg0;
                            } else if (arg1) {
                                arg4[var16] = arg3;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
        } else if (arg9 == 0) {
            for (int var58 = var22 - 1; var58 >= var24; var58--) {
                for (int var59 = var25 - 1; var59 >= var20; var59--) {
                    if ((var58 >> 1) <= var59) {
                        arg4[var16] = arg0;
                    } else if (arg1) {
                        arg4[var16] = arg3;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg9 == 1) {
            for (int var60 = var22 - 1; var60 >= var24; var60--) {
                for (int var61 = var23; var61 < var19; var61++) {
                    if (var61 <= var60 << 1) {
                        arg4[var16] = arg0;
                    } else if (arg1) {
                        arg4[var16] = arg3;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg9 == 2) {
            for (int var62 = var17; var62 < var21; var62++) {
                for (int var63 = var23; var63 < var19; var63++) {
                    if (var63 >= (var62 >> 1)) {
                        arg4[var16] = arg0;
                    } else if (arg1) {
                        arg4[var16] = arg3;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg9 == 3) {
            for (int var64 = var17; var64 < var21; var64++) {
                for (int var65 = var25 - 1; var65 >= var20; var65--) {
                    if ((var64 << 1) >= var65) {
                        arg4[var16] = arg0;
                    } else if (arg1) {
                        arg4[var16] = arg3;
                    }
                    var16++;
                }
                var16 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
    public class138() {
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lcc;I)V")
    public class138(class209 arg0, int arg1) {
        this.field2594 = arg0;
    }
}
