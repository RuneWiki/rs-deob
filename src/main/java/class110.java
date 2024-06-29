import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class110 {

    @OriginalMember(owner = "client!th", name = "g", descriptor = "[Lqk;")
    public static class207[] field1926 = new class207[500];

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Lqk;")
    public static class207 field1925 = class24.method212(255, "::serverjs5drop");

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field1930 = 0;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public int field1928;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Lqk;")
    public class207 field1923;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "[Luh;")
    public static class100[] field1924;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZZIIIIIILgi;I)V")
    public static final void method787(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class155 arg9, int arg10) {
        field1922++;
        if (arg2 && !class212.method1512(-87) && (class271.field4791[0][arg0][arg10] & 0x2) == 0) {
            if ((class271.field4791[arg6][arg0][arg10] & 0x10) != 0) {
                return;
            }
            if (class126.method885(arg0, arg10, arg6, arg8 + 2147483583) != class141.field2446) {
                return;
            }
        }
        if (arg6 < class32.field647) {
            class32.field647 = arg6;
        }
        if (arg8 != Integer.MAX_VALUE) {
            return;
        }
        class22 var11 = class33.method251(0, arg3);
        int var12;
        int var13;
        if (arg4 == 1 || arg4 == 3) {
            var12 = var11.field392;
            var13 = var11.field414;
        } else {
            var12 = var11.field414;
            var13 = var11.field392;
        }
        int var14;
        int var15;
        if (arg10 + var12 <= 104) {
            var14 = arg10 + (var12 >> 1);
            var15 = arg10 + (var12 + 1 >> 1);
        } else {
            var14 = arg10;
            var15 = arg10 + 1;
        }
        int[][] var16 = class163.field2881[arg7];
        int var17;
        int var18;
        if (arg0 + var13 > 104) {
            var17 = arg0;
            var18 = arg0 + 1;
        } else {
            var18 = (var13 + 1 >> 1) + arg0;
            var17 = (var13 >> 1) + arg0;
        }
        int var19 = (arg0 << 7) + (var13 << 6);
        int var20 = var16[var17][var15] + var16[var18][var15] + var16[var18][var14] + var16[var17][var14] >> 2;
        int[][] var21 = null;
        int var22 = (arg10 << 7) + (var12 << 6);
        long var23 = (long) (arg5 << 14 | arg0 | arg10 << 7 | arg4 << 20 | 0x40000000);
        if (var11.field374 == 0 || arg1) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field422 == 1) {
            var23 |= 0x400000L;
        }
        if (arg1) {
            var21 = class3.field47[0];
        } else if (arg7 < 3) {
            var21 = class163.field2881[arg7 + 1];
        }
        if (var11.field398) {
            var23 |= 0x80000000L;
        }
        long var25 = var23 | (long) arg3 << 32;
        if (var11.method134(false)) {
            class118.method842((byte) -74, arg0, arg10, arg4, var11, arg6, (class256) null, (class14) null);
        }
        boolean var27 = var11.field412 & !arg1;
        if (arg5 == 22) {
            if (class278.field4884 || var11.field374 != 0 || var11.field393 == 1 || var11.field387) {
                class235 var29;
                if (var11.field370 == -1 && var11.field428 == null && !var11.field368) {
                    class106 var28 = var11.method136(22, var22, (class130) null, var27, var20, arg2, arg4, var19, 53, var21, var16);
                    var29 = var28.field1884;
                } else {
                    var29 = new class232(arg3, 22, arg4, arg7, arg0, arg10, var11.field370, var11.field423, (class235) null);
                }
                class140.method978(arg6, arg0, arg10, var20, var29, var25, var11.field373);
                if (var11.field393 == 1 && arg9 != null) {
                    arg9.method1120(arg0, arg10, -38);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class235 var69;
            if (var11.field370 == -1 && var11.field428 == null && !var11.field368) {
                class106 var68 = var11.method136(10, var22, (class130) null, var27, var20, arg2, arg5 == 11 ? arg4 + 4 : arg4, var19, 10, var21, var16);
                var69 = var68.field1884;
            } else {
                var69 = new class232(arg3, 10, arg5 == 11 ? arg4 + 4 : arg4, arg7, arg0, arg10, var11.field370, var11.field423, (class235) null);
            }
            if (var69 != null) {
                boolean var70 = class160.method1161(arg6, arg0, arg10, var20, var13, var12, var69, 0, var25);
                if (var11.field379 && var70 && arg2) {
                    int var71 = 15;
                    if (var69 instanceof class166) {
                        var71 = ((class166) var69).method270() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var12; var73++) {
                            if (var71 > class43.field855[arg6][arg0 + var72][arg10 + var73]) {
                                class43.field855[arg6][arg0 + var72][arg10 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field393 != 0 && arg9 != null) {
                arg9.method1128(var12, arg0, -23, arg10, var13, var11.field388);
            }
        } else if (arg5 >= 12) {
            class235 var31;
            if (var11.field370 == -1 && var11.field428 == null && !var11.field368) {
                class106 var30 = var11.method136(arg5, var22, (class130) null, var27, var20, arg2, arg4, var19, 98, var21, var16);
                var31 = var30.field1884;
            } else {
                var31 = new class232(arg3, arg5, arg4, arg7, arg0, arg10, var11.field370, var11.field423, (class235) null);
            }
            class160.method1161(arg6, arg0, arg10, var20, 1, 1, var31, 0, var25);
            if (arg2 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg6 > 0) {
                class192.field3384[arg6][arg0][arg10] = class281.method1906(class192.field3384[arg6][arg0][arg10], 4);
            }
            if (var11.field393 != 0 && arg9 != null) {
                arg9.method1128(var12, arg0, 102, arg10, var13, var11.field388);
            }
        } else if (arg5 == 0) {
            class235 var33;
            if (var11.field370 == -1 && var11.field428 == null && !var11.field368) {
                class106 var32 = var11.method136(0, var22, (class130) null, var27, var20, arg2, arg4, var19, 22, var21, var16);
                var33 = var32.field1884;
            } else {
                var33 = new class232(arg3, 0, arg4, arg7, arg0, arg10, var11.field370, var11.field423, (class235) null);
            }
            class16.method102(arg6, arg0, arg10, var20, var33, (class235) null, class31.field627[arg4], 0, var25);
            if (arg2) {
                if (arg4 == 0) {
                    if (var11.field379) {
                        class43.field855[arg6][arg0][arg10] = 50;
                        class43.field855[arg6][arg0][arg10 + 1] = 50;
                    }
                    if (var11.field366) {
                        class192.field3384[arg6][arg0][arg10] = class281.method1906(class192.field3384[arg6][arg0][arg10], 1);
                    }
                } else if (arg4 == 1) {
                    if (var11.field379) {
                        class43.field855[arg6][arg0][arg10 + 1] = 50;
                        class43.field855[arg6][arg0 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field366) {
                        class192.field3384[arg6][arg0][arg10 + 1] = class281.method1906(class192.field3384[arg6][arg0][arg10 + 1], 2);
                    }
                } else if (arg4 == 2) {
                    if (var11.field379) {
                        class43.field855[arg6][arg0 + 1][arg10] = 50;
                        class43.field855[arg6][arg0 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field366) {
                        class192.field3384[arg6][arg0 + 1][arg10] = class281.method1906(class192.field3384[arg6][arg0 + 1][arg10], 1);
                    }
                } else if (arg4 == 3) {
                    if (var11.field379) {
                        class43.field855[arg6][arg0][arg10] = 50;
                        class43.field855[arg6][arg0 + 1][arg10] = 50;
                    }
                    if (var11.field366) {
                        class192.field3384[arg6][arg0][arg10] = class281.method1906(class192.field3384[arg6][arg0][arg10], 2);
                    }
                }
            }
            if (var11.field393 != 0 && arg9 != null) {
                arg9.method1125(var11.field388, arg0, arg10, -1845, arg4, arg5);
            }
            if (var11.field354 != 16) {
                class185.method1297(arg6, arg0, arg10, var11.field354);
            }
        } else if (arg5 == 1) {
            class235 var35;
            if (var11.field370 == -1 && var11.field428 == null && !var11.field368) {
                class106 var34 = var11.method136(1, var22, (class130) null, var27, var20, arg2, arg4, var19, 18, var21, var16);
                var35 = var34.field1884;
            } else {
                var35 = new class232(arg3, 1, arg4, arg7, arg0, arg10, var11.field370, var11.field423, (class235) null);
            }
            class16.method102(arg6, arg0, arg10, var20, var35, (class235) null, class26.field539[arg4], 0, var25);
            if (var11.field379 && arg2) {
                if (arg4 == 0) {
                    class43.field855[arg6][arg0][arg10 + 1] = 50;
                } else if (arg4 == 1) {
                    class43.field855[arg6][arg0 + 1][arg10 + 1] = 50;
                } else if (arg4 == 2) {
                    class43.field855[arg6][arg0 + 1][arg10] = 50;
                } else if (arg4 == 3) {
                    class43.field855[arg6][arg0][arg10] = 50;
                }
            }
            if (var11.field393 != 0 && arg9 != null) {
                arg9.method1125(var11.field388, arg0, arg10, -1845, arg4, arg5);
            }
        } else if (arg5 == 2) {
            int var36 = arg4 + 1 & 0x3;
            class235 var38;
            class235 var40;
            if (var11.field370 == -1 && var11.field428 == null && !var11.field368) {
                class106 var37 = var11.method136(2, var22, (class130) null, var27, var20, arg2, arg4 + 4, var19, arg8 - 2147483546, var21, var16);
                var38 = var37.field1884;
                class106 var39 = var11.method136(2, var22, (class130) null, var27, var20, arg2, var36, var19, arg8 - 2147483545, var21, var16);
                var40 = var39.field1884;
            } else {
                var38 = new class232(arg3, 2, arg4 + 4, arg7, arg0, arg10, var11.field370, var11.field423, (class235) null);
                var40 = new class232(arg3, 2, var36, arg7, arg0, arg10, var11.field370, var11.field423, (class235) null);
            }
            class16.method102(arg6, arg0, arg10, var20, var38, var40, class31.field627[arg4], class31.field627[var36], var25);
            if (var11.field366 && arg2) {
                if (arg4 == 0) {
                    class192.field3384[arg6][arg0][arg10] = class281.method1906(class192.field3384[arg6][arg0][arg10], 1);
                    class192.field3384[arg6][arg0][arg10 + 1] = class281.method1906(class192.field3384[arg6][arg0][arg10 + 1], 2);
                } else if (arg4 == 1) {
                    class192.field3384[arg6][arg0][arg10 + 1] = class281.method1906(class192.field3384[arg6][arg0][arg10 + 1], 2);
                    class192.field3384[arg6][arg0 + 1][arg10] = class281.method1906(class192.field3384[arg6][arg0 + 1][arg10], 1);
                } else if (arg4 == 2) {
                    class192.field3384[arg6][arg0 + 1][arg10] = class281.method1906(class192.field3384[arg6][arg0 + 1][arg10], 1);
                    class192.field3384[arg6][arg0][arg10] = class281.method1906(class192.field3384[arg6][arg0][arg10], 2);
                } else if (arg4 == 3) {
                    class192.field3384[arg6][arg0][arg10] = class281.method1906(class192.field3384[arg6][arg0][arg10], 2);
                    class192.field3384[arg6][arg0][arg10] = class281.method1906(class192.field3384[arg6][arg0][arg10], 1);
                }
            }
            if (var11.field393 != 0 && arg9 != null) {
                arg9.method1125(var11.field388, arg0, arg10, -1845, arg4, arg5);
            }
            if (var11.field354 != 16) {
                class185.method1297(arg6, arg0, arg10, var11.field354);
            }
        } else if (arg5 == 3) {
            class235 var42;
            if (var11.field370 == -1 && var11.field428 == null && !var11.field368) {
                class106 var41 = var11.method136(3, var22, (class130) null, var27, var20, arg2, arg4, var19, arg8 - 2147483599, var21, var16);
                var42 = var41.field1884;
            } else {
                var42 = new class232(arg3, 3, arg4, arg7, arg0, arg10, var11.field370, var11.field423, (class235) null);
            }
            class16.method102(arg6, arg0, arg10, var20, var42, (class235) null, class26.field539[arg4], 0, var25);
            if (var11.field379 && arg2) {
                if (arg4 == 0) {
                    class43.field855[arg6][arg0][arg10 + 1] = 50;
                } else if (arg4 == 1) {
                    class43.field855[arg6][arg0 + 1][arg10 + 1] = 50;
                } else if (arg4 == 2) {
                    class43.field855[arg6][arg0 + 1][arg10] = 50;
                } else if (arg4 == 3) {
                    class43.field855[arg6][arg0][arg10] = 50;
                }
            }
            if (var11.field393 != 0 && arg9 != null) {
                arg9.method1125(var11.field388, arg0, arg10, arg8 + 2147481804, arg4, arg5);
            }
        } else if (arg5 == 9) {
            class235 var44;
            if (var11.field370 == -1 && var11.field428 == null && !var11.field368) {
                class106 var43 = var11.method136(arg5, var22, (class130) null, var27, var20, arg2, arg4, var19, arg8 - 2147483629, var21, var16);
                var44 = var43.field1884;
            } else {
                var44 = new class232(arg3, arg5, arg4, arg7, arg0, arg10, var11.field370, var11.field423, (class235) null);
            }
            class160.method1161(arg6, arg0, arg10, var20, 1, 1, var44, 0, var25);
            if (var11.field393 != 0 && arg9 != null) {
                arg9.method1128(var12, arg0, 33, arg10, var13, var11.field388);
            }
            if (var11.field354 != 16) {
                class185.method1297(arg6, arg0, arg10, var11.field354);
            }
        } else if (arg5 == 4) {
            class235 var46;
            if (var11.field370 == -1 && var11.field428 == null && !var11.field368) {
                class106 var45 = var11.method136(4, var22, (class130) null, var27, var20, arg2, arg4, var19, 35, var21, var16);
                var46 = var45.field1884;
            } else {
                var46 = new class232(arg3, 4, arg4, arg7, arg0, arg10, var11.field370, var11.field423, (class235) null);
            }
            class191.method1331(arg6, arg0, arg10, var20, var46, (class235) null, class31.field627[arg4], 0, 0, 0, var25);
        } else if (arg5 == 5) {
            int var47 = 16;
            long var48 = class20.method116(arg6, arg0, arg10);
            if (var48 != 0L) {
                var47 = class33.method251(0, (int) (var48 >>> 32) & Integer.MAX_VALUE).field354;
            }
            class235 var51;
            if (var11.field370 == -1 && var11.field428 == null && !var11.field368) {
                class106 var50 = var11.method136(4, var22, (class130) null, var27, var20, arg2, arg4, var19, arg8 - 2147483599, var21, var16);
                var51 = var50.field1884;
            } else {
                var51 = new class232(arg3, 4, arg4, arg7, arg0, arg10, var11.field370, var11.field423, (class235) null);
            }
            class191.method1331(arg6, arg0, arg10, var20, var51, (class235) null, class31.field627[arg4], 0, class194.field3417[arg4] * var47, class236.field4360[arg4] * var47, var25);
        } else if (arg5 == 6) {
            int var52 = 8;
            long var53 = class20.method116(arg6, arg0, arg10);
            if (var53 != 0L) {
                var52 = class33.method251(arg8 ^ Integer.MAX_VALUE, Integer.MAX_VALUE & (int) (var53 >>> 32)).field354 / 2;
            }
            class235 var56;
            if (var11.field370 == -1 && var11.field428 == null && !var11.field368) {
                class106 var55 = var11.method136(4, var22, (class130) null, var27, var20, arg2, arg4 + 4, var19, 5, var21, var16);
                var56 = var55.field1884;
            } else {
                var56 = new class232(arg3, 4, arg4 + 4, arg7, arg0, arg10, var11.field370, var11.field423, (class235) null);
            }
            class191.method1331(arg6, arg0, arg10, var20, var56, (class235) null, 256, arg4, class217.field3852[arg4] * var52, class102.field1840[arg4] * var52, var25);
        } else if (arg5 == 7) {
            int var57 = arg4 + 2 & 0x3;
            class235 var59;
            if (var11.field370 == -1 && var11.field428 == null && !var11.field368) {
                class106 var58 = var11.method136(4, var22, (class130) null, var27, var20, arg2, var57 + 4, var19, 43, var21, var16);
                var59 = var58.field1884;
            } else {
                var59 = new class232(arg3, 4, var57 + 4, arg7, arg0, arg10, var11.field370, var11.field423, (class235) null);
            }
            class191.method1331(arg6, arg0, arg10, var20, var59, (class235) null, 256, var57, 0, 0, var25);
        } else if (arg5 == 8) {
            long var60 = class20.method116(arg6, arg0, arg10);
            int var62 = arg4 + 2 & 0x3;
            int var63 = 8;
            if (var60 != 0L) {
                var63 = class33.method251(0, (int) (var60 >>> 32) & Integer.MAX_VALUE).field354 / 2;
            }
            class235 var65;
            class235 var67;
            if (var11.field370 == -1 && var11.field428 == null && !var11.field368) {
                class106 var64 = var11.method136(4, var22, (class130) null, var27, var20, arg2, arg4 + 4, var19, 91, var21, var16);
                var65 = var64.field1884;
                class106 var66 = var11.method136(4, var22, (class130) null, var27, var20, arg2, var62 + 4, var19, 98, var21, var16);
                var67 = var66.field1884;
            } else {
                var65 = new class232(arg3, 4, arg4 + 4, arg7, arg0, arg10, var11.field370, var11.field423, (class235) null);
                var67 = new class232(arg3, 4, var62 + 4, arg7, arg0, arg10, var11.field370, var11.field423, (class235) null);
            }
            class191.method1331(arg6, arg0, arg10, var20, var65, var67, 256, arg4, class217.field3852[arg4] * var63, class102.field1840[arg4] * var63, var25);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static void method788(byte arg0) {
        field1924 = null;
        if (arg0 != -116) {
            method791(108, (byte) 14);
        }
        field1926 = null;
        field1925 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IBIIII)V")
    public static final void method789(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg0; var6 <= (arg0 + arg5); var6++) {
            for (int var11 = arg4; var11 <= arg4 + arg3; var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class43.field855[arg2][var11][var6] = 127;
                }
            }
        }
        field1929++;
        if (arg1 >= -103) {
            field1925 = null;
        }
        for (int var7 = arg0; var7 < arg0 + arg5; var7++) {
            for (int var10 = arg4; var10 < arg4 + arg3; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class163.field2881[arg2][var10][var7] = arg2 > 0 ? class163.field2881[arg2 - 1][var10][var7] : 0;
                }
            }
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var8 = arg0 + 1; var8 < arg0 + arg5; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class163.field2881[arg2][arg4][var8] = class163.field2881[arg2][arg4 - 1][var8];
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var9 = arg4 + 1; var9 < (arg4 + arg3); var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class163.field2881[arg2][var9][arg0] = class163.field2881[arg2][var9][arg0 - 1];
                }
            }
        }
        if (arg4 < 0 || arg0 < 0 || arg4 >= 104 || arg0 >= 104) {
            return;
        }
        if (arg2 != 0) {
            if (arg4 > 0 && class163.field2881[arg2 - 1][arg4 - 1][arg0] != class163.field2881[arg2][arg4 - 1][arg0]) {
                class163.field2881[arg2][arg4][arg0] = class163.field2881[arg2][arg4 - 1][arg0];
                return;
            }
            if (arg0 > 0 && class163.field2881[arg2 - 1][arg4][arg0 - 1] != class163.field2881[arg2][arg4][arg0 - 1]) {
                class163.field2881[arg2][arg4][arg0] = class163.field2881[arg2][arg4][arg0 - 1];
                return;
            }
            if (arg4 > 0 && arg0 > 0 && class163.field2881[arg2 - 1][arg4 - 1][arg0 - 1] != class163.field2881[arg2][arg4 - 1][arg0 - 1]) {
                class163.field2881[arg2][arg4][arg0] = class163.field2881[arg2][arg4 - 1][arg0 - 1];
                return;
            }
            return;
        }
        if (arg4 > 0 && class163.field2881[arg2][arg4 - 1][arg0] != 0) {
            class163.field2881[arg2][arg4][arg0] = class163.field2881[arg2][arg4 - 1][arg0];
            return;
        }
        if (arg0 > 0 && class163.field2881[arg2][arg4][arg0 - 1] != 0) {
            class163.field2881[arg2][arg4][arg0] = class163.field2881[arg2][arg4][arg0 - 1];
            return;
        }
        if (arg4 > 0 && arg0 > 0 && class163.field2881[arg2][arg4 - 1][arg0 - 1] != 0) {
            class163.field2881[arg2][arg4][arg0] = class163.field2881[arg2][arg4 - 1][arg0 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)I")
    public static final int method790(int arg0, int arg1) {
        field1920++;
        if (arg0 != 27528) {
            field1930 = 116;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)V")
    public static final void method791(int arg0, byte arg1) {
        field1921++;
        if (arg1 != 57) {
            field1926 = null;
        }
        if (arg0 == -1 && !class223.field4081) {
            class221.method1574(arg1 ^ 0x50BD);
        } else if (arg0 != -1 && (class219.field3865 != arg0 || !class178.method1274(115)) && class123.field2125 != 0 && !class223.field4081) {
            class285.method1936(class123.field2125, 2, class56.field1050, false, false, arg0, 0);
        }
        class219.field3865 = arg0;
    }
}
