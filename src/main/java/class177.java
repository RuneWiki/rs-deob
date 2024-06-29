import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class177 implements Runnable {

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "[Lrh;")
    public volatile class110[] field3043 = new class110[2];

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Z")
    public volatile boolean field3042 = false;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "Z")
    public volatile boolean field3056 = false;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Lhi;")
    public static class82 field3048 = class95.method664((byte) -126, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "Lhi;")
    private static class82 field3052 = class95.method664((byte) -44, "Members object");

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Lhi;")
    public static class82 field3050 = class95.method664((byte) -110, "n");

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Lhi;")
    public static class82 field3054 = field3052;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Lhi;")
    public static class82 field3047 = class95.method664((byte) -63, "null");

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "[I")
    public static int[] field3045 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Lsm;")
    public class120 field3041;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLme;Z)V", line = 7)
    public static final void method1253(byte arg0, class75 arg1, boolean arg2) {
        field3053++;
        if (arg0 != -55) {
            field3054 = (class82) null;
        }
        int var3 = arg1.field1220 == 0 ? arg1.field1216 : arg1.field1220;
        int var4 = arg1.field1224 == 0 ? arg1.field1205 : arg1.field1224;
        class88.method615(arg1.field1172, var3, arg2, class277.field4660[arg1.field1172 >> 16], var4, -21299);
        if (arg1.field1274 != null) {
            class88.method615(arg1.field1172, var3, arg2, arg1.field1274, var4, -21299);
        }
        class146 var5 = (class146) class191.field3195.method507((long) arg1.field1172, 602425312);
        if (var5 != null) {
            class331.method2261(arg2, var3, arg0 ^ 0x36, var5.field2474, var4);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 35)
    public static void method1254(byte arg0) {
        field3054 = null;
        field3052 = null;
        if (arg0 != 73) {
            method1254((byte) 56);
        }
        field3050 = null;
        field3045 = null;
        field3047 = null;
        field3048 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILum;)Ljf;", line = 55)
    public static final class86 method1255(int arg0, int arg1, class222 arg2) {
        if (arg0 != 1181) {
            field3048 = (class82) null;
        }
        field3051++;
        return class281.method1959(arg0 ^ 0xFFFFFB1F, arg2, arg1) ? class171.method1209(0) : null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIZIIIIILuf;Z)V", line = 77)
    public static final void method1256(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class189 arg9, boolean arg10) {
        field3055++;
        if (arg10 && !class123.method841(false) && (class204.field3567[0][arg6][arg4] & 0x2) == 0) {
            if ((class204.field3567[arg5][arg6][arg4] & 0x10) != 0) {
                return;
            }
            if (class82.method554(arg6, arg5, false, arg4) != class287.field4826) {
                return;
            }
        }
        if (arg5 < class193.field3280) {
            class193.field3280 = arg5;
        }
        class157 var11 = class99.method682(arg7, (byte) -84);
        if (class147.field2485 && var11.field2669) {
            return;
        }
        int var12;
        int var13;
        if (arg0 == 1 || arg0 == 3) {
            var12 = var11.field2704;
            var13 = var11.field2725;
        } else {
            var12 = var11.field2725;
            var13 = var11.field2704;
        }
        int var14;
        int var15;
        if ((arg6 + var13) <= 104) {
            var14 = (var13 >> 1) + arg6;
            var15 = (var13 + 1 >> 1) + arg6;
        } else {
            var15 = arg6 + 1;
            var14 = arg6;
        }
        if (arg1 != 20192) {
            method1254((byte) 55);
        }
        int var16;
        int var17;
        if ((arg4 + var12) <= 104) {
            var16 = (var12 >> 1) + arg4;
            var17 = (var12 + 1 >> 1) + arg4;
        } else {
            var17 = arg4 + 1;
            var16 = arg4;
        }
        int var18 = (arg6 << 7) + (var13 << 6);
        int[][] var19 = class245.field4255[arg8];
        int var20 = var19[var14][var17] + var19[var15][var17] + var19[var14][var16] + var19[var15][var16] >> 2;
        int var21 = (arg4 << 7) + (var12 << 6);
        int var22 = 0;
        if (class147.field2485 && arg8 != 0) {
            int[][] var23 = class245.field4255[0];
            var22 = var20 - (var23[var14][var16] + var23[var15][var16] + var23[var15][var17] + var23[var14][var17] >> 2);
        }
        int[][] var24 = (int[][]) null;
        if (arg3) {
            var24 = class180.field3073[0];
        } else if (arg8 < 3) {
            var24 = class245.field4255[arg8 + 1];
        }
        long var25 = (long) (arg4 | 0x800000 << 7 | arg6 | arg2 << 14 | arg0 << 20);
        if (var11.field2661 == 0 || arg3) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field2702 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field2711) {
            var25 |= 0x80000000L;
        }
        long var27 = var25 | (long) arg7 << 32;
        if (var11.method1120(-3)) {
            class81.method519(arg5, arg6, arg0, arg4, (byte) -83, (class81) null, (class275) null, var11);
        }
        boolean var29 = !arg3 & var11.field2683;
        if (arg2 == 22) {
            if (class256.field4409 || var11.field2661 != 0 || var11.field2670 == 1 || var11.field2699) {
                class175 var31;
                if (var11.field2682 == -1 && var11.field2688 == null && !var11.field2710) {
                    class22 var30 = var11.method1118(22, var29, (class186) null, var20, arg10, arg0, var21, var24, var18, var19, (byte) -114);
                    if (class147.field2485 && var29) {
                        class248.method1784(var30.field299, var18, var22, var21);
                    }
                    var31 = var30.field298;
                } else {
                    var31 = new class160(arg7, 22, arg0, arg8, arg6, arg4, var11.field2682, var11.field2680, (class175) null);
                }
                class187.method1290(arg5, arg6, arg4, var20, var31, var27, var11.field2739);
                if (var11.field2670 == 1 && arg9 != null) {
                    arg9.method1300(arg6, arg4, (byte) -81);
                }
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class175 var73;
            if (var11.field2682 == -1 && var11.field2688 == null && !var11.field2710) {
                class22 var72 = var11.method1118(10, var29, (class186) null, var20, arg10, arg2 == 11 ? arg0 + 4 : arg0, var21, var24, var18, var19, (byte) -116);
                if (class147.field2485 && var29) {
                    class248.method1784(var72.field299, var18, var22, var21);
                }
                var73 = var72.field298;
            } else {
                var73 = new class160(arg7, 10, arg2 == 11 ? arg0 + 4 : arg0, arg8, arg6, arg4, var11.field2682, var11.field2680, (class175) null);
            }
            if (var73 != null) {
                boolean var74 = class219.method1554(arg5, arg6, arg4, var20, var13, var12, var73, 0, var27);
                if (var11.field2707 && var74 && arg10) {
                    int var75 = 15;
                    if (var73 instanceof class155) {
                        var75 = ((class155) var73).method222() / 4;
                        if (var75 > 30) {
                            var75 = 30;
                        }
                    }
                    for (int var76 = 0; var76 <= var13; var76++) {
                        for (int var77 = 0; var77 <= var12; var77++) {
                            if (class255.field4389[arg5][arg6 + var76][arg4 + var77] < var75) {
                                class255.field4389[arg5][arg6 + var76][arg4 + var77] = (byte) var75;
                            }
                        }
                    }
                }
            }
            if (var11.field2670 != 0 && arg9 != null) {
                arg9.method1301((byte) 98, arg6, arg4, var11.field2664, var13, var12);
            }
        } else if (arg2 >= 12) {
            class175 var33;
            if (var11.field2682 == -1 && var11.field2688 == null && !var11.field2710) {
                class22 var32 = var11.method1118(arg2, var29, (class186) null, var20, arg10, arg0, var21, var24, var18, var19, (byte) -96);
                if (class147.field2485 && var29) {
                    class248.method1784(var32.field299, var18, var22, var21);
                }
                var33 = var32.field298;
            } else {
                var33 = new class160(arg7, arg2, arg0, arg8, arg6, arg4, var11.field2682, var11.field2680, (class175) null);
            }
            class219.method1554(arg5, arg6, arg4, var20, 1, 1, var33, 0, var27);
            if (arg10 && arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg5 > 0) {
                class325.field5582[arg5][arg6][arg4] = class98.method674(class325.field5582[arg5][arg6][arg4], 4);
            }
            if (var11.field2670 != 0 && arg9 != null) {
                arg9.method1301((byte) 98, arg6, arg4, var11.field2664, var13, var12);
            }
        } else if (arg2 == 0) {
            class175 var35;
            if (var11.field2682 == -1 && var11.field2688 == null && !var11.field2710) {
                class22 var34 = var11.method1118(0, var29, (class186) null, var20, arg10, arg0, var21, var24, var18, var19, (byte) -122);
                if (class147.field2485 && var29) {
                    class248.method1784(var34.field299, var18, var22, var21);
                }
                var35 = var34.field298;
            } else {
                var35 = new class160(arg7, 0, arg0, arg8, arg6, arg4, var11.field2682, var11.field2680, (class175) null);
            }
            class98.method673(arg5, arg6, arg4, var20, var35, (class175) null, class163.field2834[arg0], 0, var27);
            if (arg10) {
                if (arg0 == 0) {
                    if (var11.field2707) {
                        class255.field4389[arg5][arg6][arg4] = 50;
                        class255.field4389[arg5][arg6][arg4 + 1] = 50;
                    }
                    if (var11.field2665) {
                        class325.field5582[arg5][arg6][arg4] = class98.method674(class325.field5582[arg5][arg6][arg4], 1);
                    }
                } else if (arg0 == 1) {
                    if (var11.field2707) {
                        class255.field4389[arg5][arg6][arg4 + 1] = 50;
                        class255.field4389[arg5][arg6 + 1][arg4 + 1] = 50;
                    }
                    if (var11.field2665) {
                        class325.field5582[arg5][arg6][arg4 + 1] = class98.method674(class325.field5582[arg5][arg6][arg4 + 1], 2);
                    }
                } else if (arg0 == 2) {
                    if (var11.field2707) {
                        class255.field4389[arg5][arg6 + 1][arg4] = 50;
                        class255.field4389[arg5][arg6 + 1][arg4 + 1] = 50;
                    }
                    if (var11.field2665) {
                        class325.field5582[arg5][arg6 + 1][arg4] = class98.method674(class325.field5582[arg5][arg6 + 1][arg4], 1);
                    }
                } else if (arg0 == 3) {
                    if (var11.field2707) {
                        class255.field4389[arg5][arg6][arg4] = 50;
                        class255.field4389[arg5][arg6 + 1][arg4] = 50;
                    }
                    if (var11.field2665) {
                        class325.field5582[arg5][arg6][arg4] = class98.method674(class325.field5582[arg5][arg6][arg4], 2);
                    }
                }
            }
            if (var11.field2670 != 0 && arg9 != null) {
                arg9.method1306(var11.field2664, arg4, arg1 - 20191, arg6, arg2, arg0);
            }
            if (var11.field2701 != 16) {
                class104.method715(arg5, arg6, arg4, var11.field2701);
            }
        } else if (arg2 == 1) {
            class175 var37;
            if (var11.field2682 == -1 && var11.field2688 == null && !var11.field2710) {
                class22 var36 = var11.method1118(1, var29, (class186) null, var20, arg10, arg0, var21, var24, var18, var19, (byte) -79);
                if (class147.field2485 && var29) {
                    class248.method1784(var36.field299, var18, var22, var21);
                }
                var37 = var36.field298;
            } else {
                var37 = new class160(arg7, 1, arg0, arg8, arg6, arg4, var11.field2682, var11.field2680, (class175) null);
            }
            class98.method673(arg5, arg6, arg4, var20, var37, (class175) null, class292.field4903[arg0], 0, var27);
            if (var11.field2707 && arg10) {
                if (arg0 == 0) {
                    class255.field4389[arg5][arg6][arg4 + 1] = 50;
                } else if (arg0 == 1) {
                    class255.field4389[arg5][arg6 + 1][arg4 + 1] = 50;
                } else if (arg0 == 2) {
                    class255.field4389[arg5][arg6 + 1][arg4] = 50;
                } else if (arg0 == 3) {
                    class255.field4389[arg5][arg6][arg4] = 50;
                }
            }
            if (var11.field2670 != 0 && arg9 != null) {
                arg9.method1306(var11.field2664, arg4, arg1 - 20191, arg6, arg2, arg0);
            }
        } else if (arg2 == 2) {
            int var38 = arg0 + 1 & 0x3;
            class175 var40;
            class175 var42;
            if (var11.field2682 == -1 && var11.field2688 == null && !var11.field2710) {
                class22 var39 = var11.method1118(2, var29, (class186) null, var20, arg10, arg0 + 4, var21, var24, var18, var19, (byte) -83);
                if (class147.field2485 && var29) {
                    class248.method1784(var39.field299, var18, var22, var21);
                }
                var40 = var39.field298;
                class22 var41 = var11.method1118(2, var29, (class186) null, var20, arg10, var38, var21, var24, var18, var19, (byte) -74);
                if (class147.field2485 && var29) {
                    class248.method1784(var41.field299, var18, var22, var21);
                }
                var42 = var41.field298;
            } else {
                var40 = new class160(arg7, 2, arg0 + 4, arg8, arg6, arg4, var11.field2682, var11.field2680, (class175) null);
                var42 = new class160(arg7, 2, var38, arg8, arg6, arg4, var11.field2682, var11.field2680, (class175) null);
            }
            class98.method673(arg5, arg6, arg4, var20, var40, var42, class163.field2834[arg0], class163.field2834[var38], var27);
            if (var11.field2665 && arg10) {
                if (arg0 == 0) {
                    class325.field5582[arg5][arg6][arg4] = class98.method674(class325.field5582[arg5][arg6][arg4], 1);
                    class325.field5582[arg5][arg6][arg4 + 1] = class98.method674(class325.field5582[arg5][arg6][arg4 + 1], 2);
                } else if (arg0 == 1) {
                    class325.field5582[arg5][arg6][arg4 + 1] = class98.method674(class325.field5582[arg5][arg6][arg4 + 1], 2);
                    class325.field5582[arg5][arg6 + 1][arg4] = class98.method674(class325.field5582[arg5][arg6 + 1][arg4], 1);
                } else if (arg0 == 2) {
                    class325.field5582[arg5][arg6 + 1][arg4] = class98.method674(class325.field5582[arg5][arg6 + 1][arg4], 1);
                    class325.field5582[arg5][arg6][arg4] = class98.method674(class325.field5582[arg5][arg6][arg4], 2);
                } else if (arg0 == 3) {
                    class325.field5582[arg5][arg6][arg4] = class98.method674(class325.field5582[arg5][arg6][arg4], 2);
                    class325.field5582[arg5][arg6][arg4] = class98.method674(class325.field5582[arg5][arg6][arg4], 1);
                }
            }
            if (var11.field2670 != 0 && arg9 != null) {
                arg9.method1306(var11.field2664, arg4, 1, arg6, arg2, arg0);
            }
            if (var11.field2701 != 16) {
                class104.method715(arg5, arg6, arg4, var11.field2701);
            }
        } else if (arg2 == 3) {
            class175 var44;
            if (var11.field2682 == -1 && var11.field2688 == null && !var11.field2710) {
                class22 var43 = var11.method1118(3, var29, (class186) null, var20, arg10, arg0, var21, var24, var18, var19, (byte) -96);
                if (class147.field2485 && var29) {
                    class248.method1784(var43.field299, var18, var22, var21);
                }
                var44 = var43.field298;
            } else {
                var44 = new class160(arg7, 3, arg0, arg8, arg6, arg4, var11.field2682, var11.field2680, (class175) null);
            }
            class98.method673(arg5, arg6, arg4, var20, var44, (class175) null, class292.field4903[arg0], 0, var27);
            if (var11.field2707 && arg10) {
                if (arg0 == 0) {
                    class255.field4389[arg5][arg6][arg4 + 1] = 50;
                } else if (arg0 == 1) {
                    class255.field4389[arg5][arg6 + 1][arg4 + 1] = 50;
                } else if (arg0 == 2) {
                    class255.field4389[arg5][arg6 + 1][arg4] = 50;
                } else if (arg0 == 3) {
                    class255.field4389[arg5][arg6][arg4] = 50;
                }
            }
            if (var11.field2670 != 0 && arg9 != null) {
                arg9.method1306(var11.field2664, arg4, arg1 ^ 0x4EE1, arg6, arg2, arg0);
            }
        } else if (arg2 == 9) {
            class175 var46;
            if (var11.field2682 == -1 && var11.field2688 == null && !var11.field2710) {
                class22 var45 = var11.method1118(arg2, var29, (class186) null, var20, arg10, arg0, var21, var24, var18, var19, (byte) -50);
                if (class147.field2485 && var29) {
                    class248.method1784(var45.field299, var18, var22, var21);
                }
                var46 = var45.field298;
            } else {
                var46 = new class160(arg7, arg2, arg0, arg8, arg6, arg4, var11.field2682, var11.field2680, (class175) null);
            }
            class219.method1554(arg5, arg6, arg4, var20, 1, 1, var46, 0, var27);
            if (var11.field2670 != 0 && arg9 != null) {
                arg9.method1301((byte) 98, arg6, arg4, var11.field2664, var13, var12);
            }
            if (var11.field2701 != 16) {
                class104.method715(arg5, arg6, arg4, var11.field2701);
            }
        } else if (arg2 == 4) {
            class175 var48;
            if (var11.field2682 == -1 && var11.field2688 == null && !var11.field2710) {
                class22 var47 = var11.method1118(4, var29, (class186) null, var20, arg10, arg0, var21, var24, var18, var19, (byte) -90);
                if (class147.field2485 && var29) {
                    class248.method1784(var47.field299, var18, var22, var21);
                }
                var48 = var47.field298;
            } else {
                var48 = new class160(arg7, 4, arg0, arg8, arg6, arg4, var11.field2682, var11.field2680, (class175) null);
            }
            class288.method1993(arg5, arg6, arg4, var20, var48, (class175) null, class163.field2834[arg0], 0, 0, 0, var27);
        } else if (arg2 == 5) {
            long var67 = class317.method2173(arg5, arg6, arg4);
            int var69 = 16;
            if (var67 != 0L) {
                var69 = class99.method682(Integer.MAX_VALUE & (int) (var67 >>> 32), (byte) -105).field2701;
            }
            class175 var71;
            if (var11.field2682 == -1 && var11.field2688 == null && !var11.field2710) {
                class22 var70 = var11.method1118(4, var29, (class186) null, var20, arg10, arg0, var21, var24, var18, var19, (byte) -78);
                if (class147.field2485 && var29) {
                    class248.method1784(var70.field299, var18 - (class245.field4251[arg0] * 8), var22, var21 - (class66.field1033[arg0] * 8));
                }
                var71 = var70.field298;
            } else {
                var71 = new class160(arg7, 4, arg0, arg8, arg6, arg4, var11.field2682, var11.field2680, (class175) null);
            }
            class288.method1993(arg5, arg6, arg4, var20, var71, (class175) null, class163.field2834[arg0], 0, class245.field4251[arg0] * var69, class66.field1033[arg0] * var69, var27);
        } else if (arg2 == 6) {
            int var62 = 8;
            long var63 = class317.method2173(arg5, arg6, arg4);
            if (var63 != 0L) {
                var62 = class99.method682((int) (var63 >>> 32) & Integer.MAX_VALUE, (byte) -92).field2701 / 2;
            }
            class175 var66;
            if (var11.field2682 == -1 && var11.field2688 == null && !var11.field2710) {
                class22 var65 = var11.method1118(4, var29, (class186) null, var20, arg10, arg0 + 4, var21, var24, var18, var19, (byte) -69);
                if (class147.field2485 && var29) {
                    class248.method1784(var65.field299, var18 - (class100.field1793[arg0] * 8), var22, var21 - (class224.field3891[arg0] * 8));
                }
                var66 = var65.field298;
            } else {
                var66 = new class160(arg7, 4, arg0 + 4, arg8, arg6, arg4, var11.field2682, var11.field2680, (class175) null);
            }
            class288.method1993(arg5, arg6, arg4, var20, var66, (class175) null, 256, arg0, class100.field1793[arg0] * var62, class224.field3891[arg0] * var62, var27);
        } else if (arg2 == 7) {
            int var59 = arg0 + 2 & 0x3;
            class175 var61;
            if (var11.field2682 == -1 && var11.field2688 == null && !var11.field2710) {
                class22 var60 = var11.method1118(4, var29, (class186) null, var20, arg10, var59 + 4, var21, var24, var18, var19, (byte) -69);
                if (class147.field2485 && var29) {
                    class248.method1784(var60.field299, var18, var22, var21);
                }
                var61 = var60.field298;
            } else {
                var61 = new class160(arg7, 4, var59 + 4, arg8, arg6, arg4, var11.field2682, var11.field2680, (class175) null);
            }
            class288.method1993(arg5, arg6, arg4, var20, var61, (class175) null, 256, var59, 0, 0, var27);
        } else if (arg2 == 8) {
            int var49 = 8;
            long var50 = class317.method2173(arg5, arg6, arg4);
            if (var50 != 0L) {
                var49 = class99.method682((int) (var50 >>> 32) & Integer.MAX_VALUE, (byte) -89).field2701 / 2;
            }
            int var52 = arg0 + 2 & 0x3;
            class175 var56;
            class175 var58;
            if (var11.field2682 == -1 && var11.field2688 == null && !var11.field2710) {
                int var53 = class100.field1793[arg0] * 8;
                int var54 = class224.field3891[arg0] * 8;
                class22 var55 = var11.method1118(4, var29, (class186) null, var20, arg10, arg0 + 4, var21, var24, var18, var19, (byte) -81);
                if (class147.field2485 && var29) {
                    class248.method1784(var55.field299, var18 - var53, var22, var21 - var54);
                }
                var56 = var55.field298;
                class22 var57 = var11.method1118(4, var29, (class186) null, var20, arg10, var52 + 4, var21, var24, var18, var19, (byte) -78);
                if (class147.field2485 && var29) {
                    class248.method1784(var57.field299, var18 - var53, var22, var21 - var54);
                }
                var58 = var57.field298;
            } else {
                var56 = new class160(arg7, 4, arg0 + 4, arg8, arg6, arg4, var11.field2682, var11.field2680, (class175) null);
                var58 = new class160(arg7, 4, var52 + 4, arg8, arg6, arg4, var11.field2682, var11.field2680, (class175) null);
            }
            class288.method1993(arg5, arg6, arg4, var20, var56, var58, 256, arg0, class100.field1793[arg0] * var49, class224.field3891[arg0] * var49, var27);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ltg;I)V", line = 752)
    public static final void method1257(class93 arg0, int arg1) {
        field3049++;
        if (arg1 != -3802) {
            method1253((byte) 123, (class75) null, true);
        }
        arg0.field1705 = false;
        if (arg0.field1668 != -1) {
            class35 var2 = class284.method1973(arg0.field1668, false);
            if (var2 == null || var2.field547 == null) {
                arg0.field1668 = -1;
            } else {
                arg0.field1676++;
                if (arg0.field1692 < var2.field547.length && var2.field539[arg0.field1692] < arg0.field1676) {
                    arg0.field1692++;
                    arg0.field1676 = 1;
                    class205.method1474(var2, class168.field2932 == arg0, arg0.field1692, arg0.field1685, arg0.field1689, (byte) -109);
                }
                if (var2.field547.length <= arg0.field1692) {
                    arg0.field1692 = 0;
                    arg0.field1676 = 0;
                    class205.method1474(var2, class168.field2932 == arg0, arg0.field1692, arg0.field1685, arg0.field1689, (byte) -122);
                }
            }
        }
        if (arg0.field1715 != -1 && class212.field3708 >= arg0.field1688) {
            int var3 = class187.method1289(arg0.field1715, (byte) -128).field999;
            if (var3 == -1) {
                arg0.field1715 = -1;
            } else {
                class35 var4 = class284.method1973(var3, false);
                if (var4 == null || var4.field547 == null) {
                    arg0.field1715 = -1;
                } else {
                    if (arg0.field1678 < 0) {
                        arg0.field1678 = 0;
                        class205.method1474(var4, class168.field2932 == arg0, 0, arg0.field1685, arg0.field1689, (byte) -100);
                    }
                    arg0.field1662++;
                    if (var4.field547.length > arg0.field1678 && arg0.field1662 > var4.field539[arg0.field1678]) {
                        arg0.field1662 = 1;
                        arg0.field1678++;
                        class205.method1474(var4, class168.field2932 == arg0, arg0.field1678, arg0.field1685, arg0.field1689, (byte) -128);
                    }
                    if (arg0.field1678 >= var4.field547.length) {
                        arg0.field1715 = -1;
                    }
                }
            }
        }
        if (arg0.field1709 != -1 && arg0.field1671 <= 1) {
            class35 var5 = class284.method1973(arg0.field1709, false);
            if (var5.field562 == 1 && arg0.field1722 > 0 && class212.field3708 >= arg0.field1690 && arg0.field1656 < class212.field3708) {
                arg0.field1671 = 1;
                return;
            }
        }
        if (arg0.field1709 != -1 && arg0.field1671 == 0) {
            class35 var6 = class284.method1973(arg0.field1709, false);
            if (var6 == null || var6.field547 == null) {
                arg0.field1709 = -1;
            } else {
                arg0.field1708++;
                if (var6.field547.length > arg0.field1659 && arg0.field1708 > var6.field539[arg0.field1659]) {
                    arg0.field1708 = 1;
                    arg0.field1659++;
                    class205.method1474(var6, class168.field2932 == arg0, arg0.field1659, arg0.field1685, arg0.field1689, (byte) -87);
                }
                if (var6.field547.length <= arg0.field1659) {
                    arg0.field1655++;
                    arg0.field1659 -= var6.field541;
                    if (var6.field548 <= arg0.field1655) {
                        arg0.field1709 = -1;
                    } else if (arg0.field1659 >= 0 && arg0.field1659 < var6.field547.length) {
                        class205.method1474(var6, class168.field2932 == arg0, arg0.field1659, arg0.field1685, arg0.field1689, (byte) -102);
                    } else {
                        arg0.field1709 = -1;
                    }
                }
                arg0.field1705 = var6.field558;
            }
        }
        if (arg0.field1671 > 0) {
            arg0.field1671--;
        }
    }

    @OriginalMember(owner = "client!lg", name = "run", descriptor = "()V", line = 895)
    public final void run() {
        this.field3056 = true;
        field3046++;
        try {
            while (!this.field3042) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class110 var2 = this.field3043[var1];
                    if (var2 != null) {
                        var2.method767((byte) -87);
                    }
                }
                class290.method2001(10L, false);
                class302.method2086(false, (Object) null, this.field3041);
            }
        } catch (Exception var7) {
            class48.method348(-2, (String) null, var7);
        } finally {
            this.field3056 = false;
        }
    }
}
