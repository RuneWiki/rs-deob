import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class114 {

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Lpe;")
    private static class109 field2506 = class141.method1120("M", 0);

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Lpe;")
    public static class109 field2504 = field2506;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field2510 = 0;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Lpe;")
    private static class109 field2514 = class141.method1120("Welcome to RuneScape", 0);

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Lpe;")
    public static class109 field2507 = field2514;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "Lpe;")
    public static class109 field2521 = field2506;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field2505 = -1;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "[I")
    public static int[] field2520 = new int[100];

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lbc;")
    public static class11 field2508 = new class11(64);

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "I")
    public static int field2528 = 0;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "Lpe;")
    private static class109 field2529 = class141.method1120("Too many connections from your address)3", 0);

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "Lpe;")
    public static class109 field2527 = field2529;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public int field2502;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public int field2509;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public int field2511;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public int field2512;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public int field2513;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Lre;")
    public static class123 field2503;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "Lwa;")
    public static class154 field2526;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Lma;")
    public class84 field2517;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "Lna;")
    public static class91 field2515;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "[[Lwa;")
    public static class154[][] field2525;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method942(int arg0) {
        field2520 = null;
        field2529 = null;
        field2515 = null;
        field2503 = null;
        if (arg0 != 1) {
            return;
        }
        field2521 = null;
        field2506 = null;
        field2514 = null;
        field2504 = null;
        field2526 = null;
        field2525 = null;
        field2508 = null;
        field2507 = null;
        field2527 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLwa;)Lwa;")
    public static final class154 method943(byte arg0, class154 arg1) {
        field2518++;
        int var2 = class45.method409((byte) 77, class136.method1084(0, arg1));
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1 = class44.method403(arg1.field3458, true);
            if (arg1 == null) {
                return null;
            }
        }
        if (arg0 <= 118) {
            method946(11, null);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public static final void method944(boolean arg0) {
        field2516++;
        if (arg0) {
            class20.field495.method92((byte) 117);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)Z")
    public static final boolean method945(int arg0, int arg1) {
        field2523++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        }
        if (arg0 > -12) {
            field2503 = null;
        }
        if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILce;)V")
    public static final void method946(int arg0, class20 arg1) {
        class92.field1976 = arg1;
        if (arg0 != 7) {
            field2510 = -11;
        }
        field2519++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[BI[Lla;Lle;IIIIII)V")
    public static final void method947(int arg0, byte[] arg1, int arg2, class77[] arg3, class81 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = -1;
        class13 var12 = new class13(arg1);
        while (true) {
            int var13 = var12.method147(false);
            if (var13 == 0) {
                if (arg5 != 1) {
                    return;
                }
                field2524++;
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method147(false);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 12;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var12.method142(27467);
                int var19 = var14 & 0x3F;
                int var20 = var18 >> 2;
                int var21 = var18 & 0x3;
                if (arg2 == var16 && var17 >= arg6 && arg6 + 8 > var17 && arg0 <= var19 && var19 < arg0 + 8) {
                    class148 var22 = class89.method736(var11, 11893);
                    int var23 = arg10 + class78.method623(arg7, -56, var17 & 0x7, var22.field3268, var22.field3240, var21, var19 & 0x7);
                    int var24 = class38.method362(var21, arg7, var19 & 0x7, var22.field3268, var17 & 0x7, -62, var22.field3240) + arg8;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class77 var25 = null;
                        int var26 = arg9;
                        if ((class107.field2249[1][var23][var24] & 0x2) == 2) {
                            var26 = arg9 - 1;
                        }
                        if (var26 >= 0) {
                            var25 = arg3[var26];
                        }
                        class86.method725(arg7 + var21 & 0x3, var25, arg4, var24, true, var11, var23, arg9, var20);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIILle;IIIILla;)V")
    public static final void method948(int arg0, int arg1, int arg2, int arg3, class81 arg4, int arg5, int arg6, int arg7, int arg8, class77 arg9) {
        class148 var10 = class89.method736(arg5, 11893);
        field2501++;
        int var11;
        int var12;
        if (arg2 == 1 || arg2 == 3) {
            var11 = var10.field3268;
            var12 = var10.field3240;
        } else {
            var11 = var10.field3240;
            var12 = var10.field3268;
        }
        int var13;
        int var14;
        if (arg0 + var12 > 104) {
            var13 = arg0;
            var14 = arg0 + 1;
        } else {
            var13 = (var12 >> 1) + arg0;
            var14 = (var12 + 1 >> 1) + arg0;
        }
        int[][] var15 = class83.field1775[arg7];
        int var16;
        int var17;
        if (arg3 + var11 > 104) {
            var16 = arg3;
            var17 = arg3 + 1;
        } else {
            var16 = (var11 >> 1) + arg3;
            var17 = (var11 + 1 >> 1) + arg3;
        }
        int var18 = var15[var16][var13] + var15[var17][var13] + var15[var16][var14] + var15[var17][var14] >> 2;
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = arg3 + (arg0 << 7) + (arg5 << 14) + 1073741824;
        int var21 = (arg0 << 7) + (var12 << 6);
        if (var10.field3226 == 0) {
            var20 += Integer.MIN_VALUE;
        }
        int var22 = (arg2 << 6) + arg8;
        if (var10.field3239 == 1) {
            var22 += 256;
        }
        if (arg8 == 22) {
            class84 var23;
            if (var10.field3273 == -1 && var10.field3229 == null) {
                var23 = var10.method1156(var21, arg2, var19, var15, var18, 19981, 22);
            } else {
                var23 = new class2(arg5, 22, arg2, arg7, arg3, arg0, var10.field3273, true, null);
            }
            arg4.method662(arg6, arg3, arg0, var18, var23, var20, var22);
            if (var10.field3278 == 1) {
                arg9.method619(arg3, arg0, (byte) -121);
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class84 var46;
            if (var10.field3273 == -1 && var10.field3229 == null) {
                var46 = var10.method1156(var21, arg2, var19, var15, var18, arg1 ^ 0x4E09, 10);
            } else {
                var46 = new class2(arg5, 10, arg2, arg7, arg3, arg0, var10.field3273, true, null);
            }
            if (var46 != null) {
                arg4.method679(arg6, arg3, arg0, var18, var11, var12, var46, arg8 == 11 ? 256 : 0, var20, var22);
            }
            if (var10.field3278 != 0) {
                arg9.method620(var12, var11, arg3, var10.field3276, arg0, (byte) 118);
            }
        } else if (arg8 >= 12) {
            class84 var24;
            if (var10.field3273 == -1 && var10.field3229 == null) {
                var24 = var10.method1156(var21, arg2, var19, var15, var18, 19981, arg8);
            } else {
                var24 = new class2(arg5, arg8, arg2, arg7, arg3, arg0, var10.field3273, true, null);
            }
            arg4.method679(arg6, arg3, arg0, var18, 1, 1, var24, 0, var20, var22);
            if (var10.field3278 != 0) {
                arg9.method620(var12, var11, arg3, var10.field3276, arg0, (byte) 118);
            }
        } else if (arg8 == 0) {
            class84 var25;
            if (var10.field3273 == -1 && var10.field3229 == null) {
                var25 = var10.method1156(var21, arg2, var19, var15, var18, 19981, 0);
            } else {
                var25 = new class2(arg5, 0, arg2, arg7, arg3, arg0, var10.field3273, true, null);
            }
            arg4.method674(arg6, arg3, arg0, var18, var25, null, class64.field1304[arg2], 0, var20, var22);
            if (var10.field3278 != 0) {
                arg9.method613(arg8, arg3, arg2, (byte) 86, var10.field3276, arg0);
            }
        } else if (arg8 == 1) {
            class84 var26;
            if (var10.field3273 == -1 && var10.field3229 == null) {
                var26 = var10.method1156(var21, arg2, var19, var15, var18, 19981, 1);
            } else {
                var26 = new class2(arg5, 1, arg2, arg7, arg3, arg0, var10.field3273, true, null);
            }
            arg4.method674(arg6, arg3, arg0, var18, var26, null, class19.field479[arg2], 0, var20, var22);
            if (var10.field3278 != 0) {
                arg9.method613(arg8, arg3, arg2, (byte) 74, var10.field3276, arg0);
            }
        } else if (arg8 == 2) {
            int var27 = arg2 + 1 & 0x3;
            class84 var28;
            class84 var29;
            if (var10.field3273 == -1 && var10.field3229 == null) {
                var28 = var10.method1156(var21, arg2 + 4, var19, var15, var18, arg1 + 19977, 2);
                var29 = var10.method1156(var21, var27, var19, var15, var18, arg1 + 19977, 2);
            } else {
                var28 = new class2(arg5, 2, arg2 + 4, arg7, arg3, arg0, var10.field3273, true, null);
                var29 = new class2(arg5, 2, var27, arg7, arg3, arg0, var10.field3273, true, null);
            }
            arg4.method674(arg6, arg3, arg0, var18, var28, var29, class64.field1304[arg2], class64.field1304[var27], var20, var22);
            if (var10.field3278 != 0) {
                arg9.method613(arg8, arg3, arg2, (byte) 66, var10.field3276, arg0);
            }
        } else if (arg8 == 3) {
            class84 var30;
            if (var10.field3273 == -1 && var10.field3229 == null) {
                var30 = var10.method1156(var21, arg2, var19, var15, var18, 19981, 3);
            } else {
                var30 = new class2(arg5, 3, arg2, arg7, arg3, arg0, var10.field3273, true, null);
            }
            arg4.method674(arg6, arg3, arg0, var18, var30, null, class19.field479[arg2], 0, var20, var22);
            if (var10.field3278 != 0) {
                arg9.method613(arg8, arg3, arg2, (byte) 82, var10.field3276, arg0);
            }
        } else if (arg8 == 9) {
            class84 var31;
            if (var10.field3273 == -1 && var10.field3229 == null) {
                var31 = var10.method1156(var21, arg2, var19, var15, var18, 19981, arg8);
            } else {
                var31 = new class2(arg5, arg8, arg2, arg7, arg3, arg0, var10.field3273, true, null);
            }
            arg4.method679(arg6, arg3, arg0, var18, 1, 1, var31, 0, var20, var22);
            if (var10.field3278 != 0) {
                arg9.method620(var12, var11, arg3, var10.field3276, arg0, (byte) 118);
            }
        } else if (arg1 == arg8) {
            class84 var32;
            if (var10.field3273 == -1 && var10.field3229 == null) {
                var32 = var10.method1156(var21, arg2, var19, var15, var18, 19981, 4);
            } else {
                var32 = new class2(arg5, 4, arg2, arg7, arg3, arg0, var10.field3273, true, null);
            }
            arg4.method657(arg6, arg3, arg0, var18, var32, null, class64.field1304[arg2], 0, 0, 0, var20, var22);
        } else if (arg8 == 5) {
            int var33 = arg4.method677(arg6, arg3, arg0);
            int var34 = 16;
            if (var33 != 0) {
                var34 = class89.method736(var33 >> 14 & 0x7FFF, 11893).field3234;
            }
            class84 var35;
            if (var10.field3273 == -1 && var10.field3229 == null) {
                var35 = var10.method1156(var21, arg2, var19, var15, var18, 19981, 4);
            } else {
                var35 = new class2(arg5, 4, arg2, arg7, arg3, arg0, var10.field3273, true, null);
            }
            arg4.method657(arg6, arg3, arg0, var18, var35, null, class64.field1304[arg2], 0, class93.field1998[arg2] * var34, class107.field2252[arg2] * var34, var20, var22);
        } else if (arg8 == 6) {
            int var36 = 8;
            int var37 = arg4.method677(arg6, arg3, arg0);
            if (var37 != 0) {
                var36 = class89.method736(var37 >> 14 & 0x7FFF, arg1 ^ 0x2E71).field3234 / 2;
            }
            class84 var38;
            if (var10.field3273 == -1 && var10.field3229 == null) {
                var38 = var10.method1156(var21, arg2 + 4, var19, var15, var18, 19981, 4);
            } else {
                var38 = new class2(arg5, 4, arg2 + 4, arg7, arg3, arg0, var10.field3273, true, null);
            }
            arg4.method657(arg6, arg3, arg0, var18, var38, null, 256, arg2, class158.field3652[arg2] * var36, class11.field240[arg2] * var36, var20, var22);
        } else if (arg8 == 7) {
            int var39 = arg2 + 2 & 0x3;
            class84 var40;
            if (var10.field3273 == -1 && var10.field3229 == null) {
                var40 = var10.method1156(var21, var39 + 4, var19, var15, var18, 19981, 4);
            } else {
                var40 = new class2(arg5, 4, var39 + 4, arg7, arg3, arg0, var10.field3273, true, null);
            }
            arg4.method657(arg6, arg3, arg0, var18, var40, null, 256, var39, 0, 0, var20, var22);
        } else if (arg8 == 8) {
            int var41 = arg4.method677(arg6, arg3, arg0);
            int var42 = 8;
            if (var41 != 0) {
                var42 = class89.method736(var41 >> 14 & 0x7FFF, 11893).field3234 / 2;
            }
            int var43 = arg2 + 2 & 0x3;
            class84 var44;
            class84 var45;
            if (var10.field3273 == -1 && var10.field3229 == null) {
                var44 = var10.method1156(var21, arg2 + 4, var19, var15, var18, 19981, 4);
                var45 = var10.method1156(var21, var43 + 4, var19, var15, var18, 19981, 4);
            } else {
                var44 = new class2(arg5, 4, arg2 + 4, arg7, arg3, arg0, var10.field3273, true, null);
                var45 = new class2(arg5, 4, var43 + 4, arg7, arg3, arg0, var10.field3273, true, null);
            }
            arg4.method657(arg6, arg3, arg0, var18, var44, var45, 256, arg2, class158.field3652[arg2] * var42, class11.field240[arg2] * var42, var20, var22);
        }
    }
}
