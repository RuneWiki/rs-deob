import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public abstract class class91 extends class104 {

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "[I")
    public static int[] field1145 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public int field1136;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public int field1137;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public int field1140;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    public int field1144;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "[I")
    public static int[] field1141;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Lcc;", line = 7)
    public static final class263 method530(int arg0, int arg1) {
        field1133++;
        int var2 = arg0 & 0xFFFF;
        if (arg1 != 10989328) {
            return (class263) null;
        }
        int var3 = arg0 >> 16;
        if (class175.field2535[var3] == null || class175.field2535[var3][var2] == null) {
            boolean var4 = class285.method2039(var3, -32660);
            if (!var4) {
                return null;
            }
        }
        return class175.field2535[var3][var2];
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZIZILhm;IIII)V", line = 46)
    public static final void method532(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, class22 arg6, int arg7, int arg8, int arg9, int arg10) {
        field1142++;
        if (arg4 && !class339.method2348((byte) 69) && (class264.field4163[0][arg7][arg10] & 0x2) == 0) {
            if ((class264.field4163[arg3][arg7][arg10] & 0x10) != 0) {
                return;
            }
            if (class183.method1273(arg7, -119, arg3, arg10) != class244.field3669) {
                return;
            }
        }
        if (arg3 < class311.field4822) {
            class311.field4822 = arg3;
        }
        class238 var11 = class142.method951(arg9, 26915);
        if (class250.field3787 && var11.field3544) {
            return;
        }
        int var12;
        int var13;
        if (arg1 == 1 || arg1 == 3) {
            var12 = var11.field3489;
            var13 = var11.field3532;
        } else {
            var12 = var11.field3532;
            var13 = var11.field3489;
        }
        int var14;
        int var15;
        if (arg7 + var13 <= 104) {
            var14 = (var13 >> 1) + arg7;
            var15 = arg7 + (var13 + 1 >> 1);
        } else {
            var15 = arg7 + 1;
            var14 = arg7;
        }
        int var16;
        int var17;
        if ((arg10 + var12) <= 104) {
            var16 = (var12 + 1 >> 1) + arg10;
            var17 = (var12 >> 1) + arg10;
        } else {
            var17 = arg10;
            var16 = arg10 + 1;
        }
        int[][] var18 = class167.field2324[arg5];
        int var19 = var18[var14][var16] + var18[var14][var17] + var18[var15][var17] + var18[var15][var16] >> 2;
        int var20 = (arg7 << 7) + (var13 << 6);
        int var21 = (arg10 << 7) + (var12 << 6);
        int var22 = 0;
        if (class250.field3787 && arg5 != 0) {
            int[][] var23 = class167.field2324[0];
            var22 = var19 - (var23[var14][var17] + var23[var15][var17] + var23[var14][var16] + var23[var15][var16] >> 2);
        }
        int[][] var24 = (int[][]) null;
        if (arg2) {
            var24 = class74.field957[0];
        } else if (arg5 < 3) {
            var24 = class167.field2324[arg5 + 1];
        }
        long var25 = (long) (arg1 << 20 | arg0 << 14 | arg7 | arg10 << 7 | 0x40000000);
        if (var11.field3509 == 0 || arg2) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field3497 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field3554) {
            var25 |= 0x80000000L;
        }
        long var27 = var25 | (long) arg9 << 32;
        if (var11.method1703(arg8 + 101)) {
            class300.method2116(arg10, 25, (class109) null, (class184) null, arg1, arg7, var11, arg3);
        }
        int var29 = var11.field3503;
        boolean var30 = !arg2 & var11.field3560;
        if (arg0 == 22) {
            if (class90.field1124 || var11.field3509 != 0 || var11.field3507 == 1 || var11.field3488) {
                class47 var32;
                if (var29 == -1 && var11.field3525 == null && !var11.field3492) {
                    class42 var31 = var11.method1701(var24, 22, (byte) -118, var18, arg1, arg4, var30, (class234) null, var19, var21, var20);
                    if (class250.field3787 && var30) {
                        class178.method1219(var31.field497, var20, var22, var21);
                    }
                    var32 = var31.field496;
                } else {
                    var32 = new class110(arg9, 22, arg1, arg5, arg7, arg10, var29, var11.field3563, (class47) null);
                }
                class103.method608(arg3, arg7, arg10, var19, var32, var27, var11.field3516);
                if (var11.field3507 == 1 && arg6 != null) {
                    arg6.method132(arg10, (byte) -127, arg7);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class47 var74;
            if (var29 == -1 && var11.field3525 == null && !var11.field3492) {
                class42 var73 = var11.method1701(var24, 10, (byte) -98, var18, arg0 == 11 ? arg1 + 4 : arg1, arg4, var30, (class234) null, var19, var21, var20);
                if (class250.field3787 && var30) {
                    class178.method1219(var73.field497, var20, var22, var21);
                }
                var74 = var73.field496;
            } else {
                var74 = new class110(arg9, 10, arg0 == 11 ? arg1 + 4 : arg1, arg5, arg7, arg10, var29, var11.field3563, (class47) null);
            }
            if (var74 != null) {
                boolean var75 = class272.method1966(arg3, arg7, arg10, var19, var13, var12, var74, 0, var27);
                if (var11.field3542 && var75 && arg4) {
                    int var76 = 15;
                    if (var74 instanceof class201) {
                        var76 = ((class201) var74).method697() / 4;
                        if (var76 > 30) {
                            var76 = 30;
                        }
                    }
                    for (int var77 = 0; var77 <= var13; var77++) {
                        for (int var78 = 0; var78 <= var12; var78++) {
                            if (class292.field4586[arg3][arg7 + var77][arg10 + var78] < var76) {
                                class292.field4586[arg3][arg7 + var77][arg10 + var78] = (byte) var76;
                            }
                        }
                    }
                }
            }
            if (var11.field3507 != 0 && arg6 != null) {
                arg6.method133(var13, 8, !var11.field3535, var11.field3565, var12, arg7, arg10);
            }
        } else if (arg0 >= 12) {
            class47 var72;
            if (var29 == -1 && var11.field3525 == null && !var11.field3492) {
                class42 var71 = var11.method1701(var24, arg0, (byte) -61, var18, arg1, arg4, var30, (class234) null, var19, var21, var20);
                if (class250.field3787 && var30) {
                    class178.method1219(var71.field497, var20, var22, var21);
                }
                var72 = var71.field496;
            } else {
                var72 = new class110(arg9, arg0, arg1, arg5, arg7, arg10, var29, var11.field3563, (class47) null);
            }
            class272.method1966(arg3, arg7, arg10, var19, 1, 1, var72, 0, var27);
            if (arg4 && arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg3 > 0 && var11.field3543 != 0) {
                class21.field268[arg3][arg7][arg10] = class48.method283(class21.field268[arg3][arg7][arg10], 4);
            }
            if (var11.field3507 != 0 && arg6 != null) {
                arg6.method133(var13, 8, !var11.field3535, var11.field3565, var12, arg7, arg10);
            }
        } else if (arg0 == 0) {
            class47 var34;
            if (var29 == -1 && var11.field3525 == null && !var11.field3492) {
                class42 var33 = var11.method1701(var24, 0, (byte) -112, var18, arg1, arg4, var30, (class234) null, var19, var21, var20);
                if (class250.field3787 && var30) {
                    class178.method1219(var33.field497, var20, var22, var21);
                }
                var34 = var33.field496;
            } else {
                var34 = new class110(arg9, 0, arg1, arg5, arg7, arg10, var29, var11.field3563, (class47) null);
            }
            class172.method1130(arg3, arg7, arg10, var19, var34, (class47) null, class25.field336[arg1], 0, var27);
            if (arg4) {
                if (arg1 == 0) {
                    if (var11.field3542) {
                        class292.field4586[arg3][arg7][arg10] = 50;
                        class292.field4586[arg3][arg7][arg10 + 1] = 50;
                    }
                    if (var11.field3543 == 1) {
                        class21.field268[arg3][arg7][arg10] = class48.method283(class21.field268[arg3][arg7][arg10], 1);
                    }
                } else if (arg1 == 1) {
                    if (var11.field3542) {
                        class292.field4586[arg3][arg7][arg10 + 1] = 50;
                        class292.field4586[arg3][arg7 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field3543 == 1) {
                        class21.field268[arg3][arg7][arg10 + 1] = class48.method283(class21.field268[arg3][arg7][arg10 + 1], 2);
                    }
                } else if (arg1 == 2) {
                    if (var11.field3542) {
                        class292.field4586[arg3][arg7 + 1][arg10] = 50;
                        class292.field4586[arg3][arg7 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field3543 == 1) {
                        class21.field268[arg3][arg7 + 1][arg10] = class48.method283(class21.field268[arg3][arg7 + 1][arg10], 1);
                    }
                } else if (arg1 == 3) {
                    if (var11.field3542) {
                        class292.field4586[arg3][arg7][arg10] = 50;
                        class292.field4586[arg3][arg7 + 1][arg10] = 50;
                    }
                    if (var11.field3543 == 1) {
                        class21.field268[arg3][arg7][arg10] = class48.method283(class21.field268[arg3][arg7][arg10], 2);
                    }
                }
            }
            if (var11.field3507 != 0 && arg6 != null) {
                arg6.method145(arg7, var11.field3565, arg0, 104, arg10, !var11.field3535, arg1);
            }
            if (var11.field3506 != 16) {
                class118.method802(arg3, arg7, arg10, var11.field3506);
            }
        } else if (arg0 == 1) {
            class47 var70;
            if (var29 == -1 && var11.field3525 == null && !var11.field3492) {
                class42 var69 = var11.method1701(var24, 1, (byte) -117, var18, arg1, arg4, var30, (class234) null, var19, var21, var20);
                if (class250.field3787 && var30) {
                    class178.method1219(var69.field497, var20, var22, var21);
                }
                var70 = var69.field496;
            } else {
                var70 = new class110(arg9, 1, arg1, arg5, arg7, arg10, var29, var11.field3563, (class47) null);
            }
            class172.method1130(arg3, arg7, arg10, var19, var70, (class47) null, class89.field1121[arg1], 0, var27);
            if (var11.field3542 && arg4) {
                if (arg1 == 0) {
                    class292.field4586[arg3][arg7][arg10 + 1] = 50;
                } else if (arg1 == 1) {
                    class292.field4586[arg3][arg7 + 1][arg10 + 1] = 50;
                } else if (arg1 == 2) {
                    class292.field4586[arg3][arg7 + 1][arg10] = 50;
                } else if (arg1 == 3) {
                    class292.field4586[arg3][arg7][arg10] = 50;
                }
            }
            if (var11.field3507 != 0 && arg6 != null) {
                arg6.method145(arg7, var11.field3565, arg0, 95, arg10, !var11.field3535, arg1);
            }
        } else if (arg0 == 2) {
            int var35 = arg1 + 1 & 0x3;
            class47 var37;
            class47 var39;
            if (var29 == -1 && var11.field3525 == null && !var11.field3492) {
                class42 var36 = var11.method1701(var24, 2, (byte) -109, var18, arg1 + 4, arg4, var30, (class234) null, var19, var21, var20);
                if (class250.field3787 && var30) {
                    class178.method1219(var36.field497, var20, var22, var21);
                }
                var37 = var36.field496;
                class42 var38 = var11.method1701(var24, 2, (byte) -53, var18, var35, arg4, var30, (class234) null, var19, var21, var20);
                if (class250.field3787 && var30) {
                    class178.method1219(var38.field497, var20, var22, var21);
                }
                var39 = var38.field496;
            } else {
                var37 = new class110(arg9, 2, arg1 + 4, arg5, arg7, arg10, var29, var11.field3563, (class47) null);
                var39 = new class110(arg9, 2, var35, arg5, arg7, arg10, var29, var11.field3563, (class47) null);
            }
            class172.method1130(arg3, arg7, arg10, var19, var37, var39, class25.field336[arg1], class25.field336[var35], var27);
            if (var11.field3543 == 1 && arg4) {
                if (arg1 == 0) {
                    class21.field268[arg3][arg7][arg10] = class48.method283(class21.field268[arg3][arg7][arg10], 1);
                    class21.field268[arg3][arg7][arg10 + 1] = class48.method283(class21.field268[arg3][arg7][arg10 + 1], 2);
                } else if (arg1 == 1) {
                    class21.field268[arg3][arg7][arg10 + 1] = class48.method283(class21.field268[arg3][arg7][arg10 + 1], 2);
                    class21.field268[arg3][arg7 + 1][arg10] = class48.method283(class21.field268[arg3][arg7 + 1][arg10], 1);
                } else if (arg1 == 2) {
                    class21.field268[arg3][arg7 + 1][arg10] = class48.method283(class21.field268[arg3][arg7 + 1][arg10], 1);
                    class21.field268[arg3][arg7][arg10] = class48.method283(class21.field268[arg3][arg7][arg10], 2);
                } else if (arg1 == 3) {
                    class21.field268[arg3][arg7][arg10] = class48.method283(class21.field268[arg3][arg7][arg10], 2);
                    class21.field268[arg3][arg7][arg10] = class48.method283(class21.field268[arg3][arg7][arg10], 1);
                }
            }
            if (var11.field3507 != 0 && arg6 != null) {
                arg6.method145(arg7, var11.field3565, arg0, 90, arg10, !var11.field3535, arg1);
            }
            if (var11.field3506 != 16) {
                class118.method802(arg3, arg7, arg10, var11.field3506);
            }
        } else if (arg0 == arg8) {
            class47 var41;
            if (var29 == -1 && var11.field3525 == null && !var11.field3492) {
                class42 var40 = var11.method1701(var24, 3, (byte) -64, var18, arg1, arg4, var30, (class234) null, var19, var21, var20);
                if (class250.field3787 && var30) {
                    class178.method1219(var40.field497, var20, var22, var21);
                }
                var41 = var40.field496;
            } else {
                var41 = new class110(arg9, 3, arg1, arg5, arg7, arg10, var29, var11.field3563, (class47) null);
            }
            class172.method1130(arg3, arg7, arg10, var19, var41, (class47) null, class89.field1121[arg1], 0, var27);
            if (var11.field3542 && arg4) {
                if (arg1 == 0) {
                    class292.field4586[arg3][arg7][arg10 + 1] = 50;
                } else if (arg1 == 1) {
                    class292.field4586[arg3][arg7 + 1][arg10 + 1] = 50;
                } else if (arg1 == 2) {
                    class292.field4586[arg3][arg7 + 1][arg10] = 50;
                } else if (arg1 == 3) {
                    class292.field4586[arg3][arg7][arg10] = 50;
                }
            }
            if (var11.field3507 != 0 && arg6 != null) {
                arg6.method145(arg7, var11.field3565, arg0, 99, arg10, !var11.field3535, arg1);
            }
        } else if (arg0 == 9) {
            class47 var68;
            if (var29 == -1 && var11.field3525 == null && !var11.field3492) {
                class42 var67 = var11.method1701(var24, arg0, (byte) -75, var18, arg1, arg4, var30, (class234) null, var19, var21, var20);
                if (class250.field3787 && var30) {
                    class178.method1219(var67.field497, var20, var22, var21);
                }
                var68 = var67.field496;
            } else {
                var68 = new class110(arg9, arg0, arg1, arg5, arg7, arg10, var29, var11.field3563, (class47) null);
            }
            class272.method1966(arg3, arg7, arg10, var19, 1, 1, var68, 0, var27);
            if (var11.field3507 != 0 && arg6 != null) {
                arg6.method133(var13, arg8 ^ 0xB, !var11.field3535, var11.field3565, var12, arg7, arg10);
            }
            if (var11.field3506 != 16) {
                class118.method802(arg3, arg7, arg10, var11.field3506);
            }
        } else if (arg0 == 4) {
            class47 var66;
            if (var29 == -1 && var11.field3525 == null && !var11.field3492) {
                class42 var65 = var11.method1701(var24, 4, (byte) -121, var18, arg1, arg4, var30, (class234) null, var19, var21, var20);
                if (class250.field3787 && var30) {
                    class178.method1219(var65.field497, var20, var22, var21);
                }
                var66 = var65.field496;
            } else {
                var66 = new class110(arg9, 4, arg1, arg5, arg7, arg10, var29, var11.field3563, (class47) null);
            }
            class255.method1851(arg3, arg7, arg10, var19, var66, (class47) null, class25.field336[arg1], 0, 0, 0, var27);
        } else if (arg0 == 5) {
            long var42 = class256.method1858(arg3, arg7, arg10);
            int var44 = 16;
            if (var42 != 0L) {
                var44 = class142.method951((int) (var42 >>> 32) & Integer.MAX_VALUE, 26915).field3506;
            }
            class47 var46;
            if (var29 == -1 && var11.field3525 == null && !var11.field3492) {
                class42 var45 = var11.method1701(var24, 4, (byte) -89, var18, arg1, arg4, var30, (class234) null, var19, var21, var20);
                if (class250.field3787 && var30) {
                    class178.method1219(var45.field497, var20 - (class40.field480[arg1] * 8), var22, var21 - (class311.field4814[arg1] * 8));
                }
                var46 = var45.field496;
            } else {
                var46 = new class110(arg9, 4, arg1, arg5, arg7, arg10, var29, var11.field3563, (class47) null);
            }
            class255.method1851(arg3, arg7, arg10, var19, var46, (class47) null, class25.field336[arg1], 0, class40.field480[arg1] * var44, class311.field4814[arg1] * var44, var27);
        } else if (arg0 == 6) {
            int var60 = 8;
            long var61 = class256.method1858(arg3, arg7, arg10);
            if (var61 != 0L) {
                var60 = class142.method951(Integer.MAX_VALUE & (int) (var61 >>> 32), arg8 + 26912).field3506 / 2;
            }
            class47 var64;
            if (var29 == -1 && var11.field3525 == null && !var11.field3492) {
                class42 var63 = var11.method1701(var24, 4, (byte) -64, var18, arg1 + 4, arg4, var30, (class234) null, var19, var21, var20);
                if (class250.field3787 && var30) {
                    class178.method1219(var63.field497, var20 - (class276.field4300[arg1] * 8), var22, var21 - (class208.field2954[arg1] * 8));
                }
                var64 = var63.field496;
            } else {
                var64 = new class110(arg9, 4, arg1 + 4, arg5, arg7, arg10, var29, var11.field3563, (class47) null);
            }
            class255.method1851(arg3, arg7, arg10, var19, var64, (class47) null, 256, arg1, class276.field4300[arg1] * var60, class208.field2954[arg1] * var60, var27);
        } else if (arg0 == 7) {
            int var57 = arg1 + 2 & 0x3;
            class47 var59;
            if (var29 == -1 && var11.field3525 == null && !var11.field3492) {
                class42 var58 = var11.method1701(var24, 4, (byte) -98, var18, var57 + 4, arg4, var30, (class234) null, var19, var21, var20);
                if (class250.field3787 && var30) {
                    class178.method1219(var58.field497, var20, var22, var21);
                }
                var59 = var58.field496;
            } else {
                var59 = new class110(arg9, 4, var57 + 4, arg5, arg7, arg10, var29, var11.field3563, (class47) null);
            }
            class255.method1851(arg3, arg7, arg10, var19, var59, (class47) null, 256, var57, 0, 0, var27);
        } else if (arg0 == 8) {
            int var47 = 8;
            long var48 = class256.method1858(arg3, arg7, arg10);
            if (var48 != 0L) {
                var47 = class142.method951(Integer.MAX_VALUE & (int) (var48 >>> 32), arg8 + 26912).field3506 / 2;
            }
            int var50 = arg1 + 2 & 0x3;
            class47 var54;
            class47 var56;
            if (var29 == -1 && var11.field3525 == null && !var11.field3492) {
                int var51 = class276.field4300[arg1] * 8;
                int var52 = class208.field2954[arg1] * 8;
                class42 var53 = var11.method1701(var24, 4, (byte) -89, var18, arg1 + 4, arg4, var30, (class234) null, var19, var21, var20);
                if (class250.field3787 && var30) {
                    class178.method1219(var53.field497, var20 - var51, var22, var21 - var52);
                }
                var54 = var53.field496;
                class42 var55 = var11.method1701(var24, 4, (byte) -119, var18, var50 + 4, arg4, var30, (class234) null, var19, var21, var20);
                if (class250.field3787 && var30) {
                    class178.method1219(var55.field497, var20 - var51, var22, var21 - var52);
                }
                var56 = var55.field496;
            } else {
                var54 = new class110(arg9, 4, arg1 + 4, arg5, arg7, arg10, var29, var11.field3563, (class47) null);
                var56 = new class110(arg9, 4, var50 + 4, arg5, arg7, arg10, var29, var11.field3563, (class47) null);
            }
            class255.method1851(arg3, arg7, arg10, var19, var54, var56, 256, arg1, class276.field4300[arg1] * var47, class208.field2954[arg1] * var47, var27);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 703)
    public static final void method533(String arg0, int arg1) {
        field1138++;
        class230.field3363 = arg0;
        if (class9.field131.field4179 == null) {
            return;
        }
        try {
            String var2 = class9.field131.field4179.getParameter("cookieprefix");
            String var3 = class9.field131.field4179.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == arg1) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class135.method895(true, class200.method1375(arg1 - 16185) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class122.method825(class9.field131.field4179, arg1 ^ 0x7D, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V", line = 734)
    public static void method534(byte arg0) {
        field1141 = null;
        int var1 = 8 / ((arg0 - 3) / 43);
        field1145 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIII)V", line = 752)
    public final void method535(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1146++;
        int var6 = this.field1135 << 3;
        int var7 = (arg0 << 4) + (var6 & 0xF);
        int var8 = this.field1140 << 3;
        if (arg4 > -1) {
            field1143 = -28;
        }
        int var9 = (arg1 << 4) + (var8 & 0xF);
        this.method543(var6, var8, var7, var9, arg3, arg2);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)Lv;", line = 770)
    public static final class80 method536(int arg0, int arg1, int arg2) {
        class225 var3 = class158.field2184[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3214; var4++) {
            class80 var5 = var3.field3199[var4];
            if ((var5.field1026 >> 29 & 0x3L) == 2L && var5.field1015 == arg1 && var5.field1027 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(II)I", line = 805)
    public static final int method542(int arg0, int arg1) {
        field1147++;
        if (arg1 > 0) {
            return 1;
        } else {
            if (arg0 != -1) {
                method542(-100, 60);
            }
            return arg1 < 0 ? -1 : 0;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)V")
    public abstract void method531(int arg0, int arg1);

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)V")
    public abstract void method537(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(II)V")
    public abstract void method538(int arg0, int arg1);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)V")
    public abstract void method539(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(II)V")
    public abstract void method540(int arg0, int arg1);

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(IIIII)V")
    public abstract void method541(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIII)V")
    public abstract void method543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
