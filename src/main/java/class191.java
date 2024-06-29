import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class191 extends class359 {

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2598 = "K";

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "[I")
    public static int[] field2607 = new int[13];

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "[I")
    public static int[] field2599 = new int[128];

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field2613 = null;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "F")
    public static float field2604;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public int field2608;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public int field2609;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public int field2614;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public int field2616;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "Ljf;")
    public class119 field2603;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "Ljf;")
    public class119 field2605;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "Ljava/lang/String;")
    public String field2600;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Z")
    public boolean field2606;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "[Ljava/lang/Object;")
    public Object[] field2602;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIILjf;II)V", line = 6)
    public static final void method1221(int arg0, int arg1, int arg2, int arg3, int arg4, class119 arg5, int arg6, int arg7) {
        field2615++;
        if (arg0 != 8) {
            return;
        }
        if (class206.field2805) {
            class314.field4474 = 32;
        } else {
            class314.field4474 = 0;
        }
        class206.field2805 = false;
        if (class137.field1922 != 0) {
            if (arg2 <= arg7 && (arg2 + 16) > arg7 && arg6 >= arg1 && arg6 < arg1 + 16) {
                arg5.field1467 -= 4;
                class101.method543((byte) 89, arg5);
            } else if (arg2 <= arg7 && arg2 + 16 > arg7 && (arg1 + arg3 - 16) <= arg6 && arg1 + arg3 > arg6) {
                arg5.field1467 += 4;
                class101.method543((byte) -63, arg5);
            } else if (arg2 - class314.field4474 <= arg7 && arg7 < (class314.field4474 + arg2 + 16) && arg6 >= (arg1 + 16) && arg6 < arg1 - (16 - arg3)) {
                int var8 = (arg3 - 32) * arg3 / arg4;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg6 - arg1 - (var8 / 2) - 16;
                int var10 = arg3 - var8 - 32;
                arg5.field1467 = (arg4 - arg3) * var9 / var10;
                class101.method543((byte) -87, arg5);
                class206.field2805 = true;
            }
        }
        if (class247.field3357 == 0) {
            return;
        }
        int var11 = arg5.field1552;
        if ((arg2 - var11) <= arg7 && arg1 <= arg6 && arg7 < (arg2 + 16) && arg6 <= arg1 + arg3) {
            arg5.field1467 += class247.field3357 * 45;
            class101.method543((byte) 69, arg5);
            return;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V", line = 77)
    public static final void method1222(int arg0, int arg1) {
        field2610++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class372.method2337(127);
        } else if (arg1 == 2) {
            class301.method1903(-49);
        } else if (arg1 == 3) {
            class260.method1640(-1);
        } else {
            throw new RuntimeException();
        }
        if (arg0 != -3) {
            field2604 = 1.0837604F;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I[[[BIILen;IIIIBIII)V", line = 116)
    public static final void method1223(int arg0, byte[][][] arg1, int arg2, int arg3, class174 arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10, int arg11, int arg12) {
        field2612++;
        if (arg2 == 0 || arg3 == 0) {
            return;
        }
        if (arg2 == 9) {
            arg2 = 1;
            arg8 = arg8 + 1 & 0x3;
        }
        if (arg2 == 10) {
            arg2 = 1;
            arg8 = arg8 + 3 & 0x3;
        }
        if (arg2 == 11) {
            arg2 = 8;
            arg8 = arg8 + 3 & 0x3;
        }
        int var13 = -19 / ((arg9 - 72) / 36);
        arg4.method939(arg6, arg11, arg7, arg12, arg0, arg10, arg1[arg2 - 1][arg8], arg3, arg5);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILen;Lac;[[B[[B[[BZLac;I[[BI[[I)V", line = 154)
    public static final void method1224(int arg0, int arg1, class174 arg2, class319 arg3, byte[][] arg4, byte[][] arg5, byte[][] arg6, boolean arg7, class319 arg8, int arg9, byte[][] arg10, int arg11, int[][] arg12) {
        int var13 = 0;
        if (arg1 != 15341) {
            field2607 = null;
        }
        while (var13 < arg0) {
            for (int var14 = 0; var14 < arg11; var14++) {
                if (class257.method1613(-122) || class139.method831(var13, class356.field5209, arg9, var14, (byte) -66)) {
                    byte var15 = arg4[var13][var14];
                    byte var16 = arg6[var13][var14];
                    int var17 = arg5[var13][var14] & 0xFF;
                    int var18 = arg10[var13][var14] & 0xFF;
                    class190 var19 = var17 == 0 ? null : class196.method1260(var17 - 1, -124);
                    class151 var20 = var18 == 0 ? null : class52.method311(-56, var18 - 1);
                    int var21 = 0;
                    int var22 = 0;
                    if (var15 != 0) {
                        var21 = var20 == null ? 0 : class156.field2222[var15];
                        var22 = var19 == null ? 0 : class192.field2624[var15];
                    } else if (var19 != null) {
                        var22 = class192.field2624[var15];
                    } else if (var20 != null) {
                        var21 = class192.field2624[var15];
                    }
                    int var23 = var22 + var21;
                    int var24 = 0;
                    if (var23 != 0) {
                        int[] var25 = new int[var23];
                        int[] var26 = new int[var23];
                        int[] var27 = new int[var23];
                        int[] var28 = new int[var23];
                        boolean var29 = false;
                        if (var19 != null && (var19.field2596 != -1 || var19.field2581 != -1 || var19.field2584 != -1)) {
                            int var30 = arg2.method996() ? var19.field2584 : var19.field2592;
                            if (!class420.field6046) {
                                var30 = -1;
                            }
                            for (int var31 = 0; var31 < var22; var31++) {
                                var27[var24] = var30;
                                var28[var24] = var19.field2582;
                                if (var19.field2596 == -1) {
                                    var25[var24] = -1;
                                } else {
                                    var25[var24] = var19.field2596;
                                }
                                if (var19.field2581 == -1) {
                                    var26[var24] = -1;
                                } else {
                                    var26[var24] = var19.field2581;
                                    var29 = true;
                                }
                                var24++;
                            }
                            if (!arg7 && arg9 == 0) {
                                class410.method2576(var13, var14, var19.field2590, var19.field2589 * 8);
                            }
                        } else {
                            for (int var32 = 0; var32 < var22; var32++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        }
                        if (!var29) {
                            var26 = null;
                        }
                        if (var20 == null) {
                            for (int var33 = 0; var33 < var21; var33++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        } else {
                            int var34 = var20.field2124;
                            if (!class420.field6046) {
                                var34 = -1;
                            }
                            for (int var35 = 0; var35 < var21; var35++) {
                                var27[var24] = var34;
                                var28[var24] = var20.field2127;
                                var25[var24] = arg12[var13][var14];
                                if (var26 != null) {
                                    var26[var24] = -1;
                                }
                                var24++;
                            }
                        }
                        int var36 = class344.field5064.length;
                        int[] var37 = arg7 ? new int[var36] : null;
                        int[] var38 = new int[var36];
                        int[] var39 = new int[var36];
                        for (int var40 = 0; var40 < var36; var40++) {
                            int var48 = class344.field5064[var40];
                            int var49 = class102.field1168[var40];
                            if (var16 == 0) {
                                var38[var40] = var48;
                                var39[var40] = var49;
                            } else if (var16 == 1) {
                                var38[var40] = var49;
                                var39[var40] = 128 - var48;
                            } else if (var16 == 2) {
                                var38[var40] = 128 - var48;
                                var39[var40] = 128 - var49;
                            } else if (var16 == 3) {
                                var38[var40] = 128 - var49;
                                var39[var40] = var48;
                            }
                            if (arg7 && class349.field5104[var15][var40]) {
                                int var52 = (var13 << 7) + var38[var40];
                                int var53 = (var14 << 7) + var39[var40];
                                var37[var40] = arg3.method1991(var52, var53) - arg8.method1991(var52, var53);
                            }
                        }
                        int var41 = arg8.method1990(var13, var14);
                        int var42 = arg8.method1990(var13 + 1, var14);
                        int var43 = arg8.method1990(var13 + 1, var14 + 1);
                        int var44 = arg8.method1990(var13, var14 + 1);
                        if (arg9 > 0) {
                            boolean var45 = true;
                            if (var18 == 0 && var15 != 0) {
                                var45 = false;
                            }
                            if (var17 > 0 && var19 != null && !var19.field2593) {
                                var45 = false;
                            }
                            if (var45 && var41 == var42 && var41 == var43 && var41 == var44) {
                                class275.field3883[arg9][var13][var14] = (byte) class164.method1059(class275.field3883[arg9][var13][var14], 4);
                            }
                        }
                        int var46 = 0;
                        int var47 = 0;
                        if (arg7) {
                            var46 = class437.method2712(var13, var14);
                            var47 = class109.method605(var13, var14);
                        }
                        arg8.method1984(var13, var14, var38, var37, var39, class57.field673[var15], class435.field6380[var15], class407.field5916[var15], var25, var26, var27, var28, var46, var47, false);
                        class252.method1578(arg9, var13, var14);
                    }
                }
            }
            var13++;
        }
        field2601++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V", line = 447)
    public static void method1225(boolean arg0) {
        field2598 = null;
        field2613 = null;
        if (!arg0) {
            field2599 = null;
            field2607 = null;
        }
    }
}
