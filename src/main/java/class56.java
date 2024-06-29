import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class56 {

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public int field735 = 2048;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public int field744 = 0;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public int field745 = 0;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public int field734 = 2048;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field741 = 0;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "Z")
    public static boolean field739 = true;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field742 = 0;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "[I")
    public static int[] field746 = new int[500];

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Ltl;")
    public static class222 field737 = new class222(64);

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZII)I", line = 4)
    public static final int method394(boolean arg0, int arg1, int arg2) {
        field749++;
        int var3 = 0;
        if (!arg0) {
            field746 = (int[]) null;
        }
        while (arg2 > 0) {
            var3 = arg1 & 0x1 | var3 << 1;
            arg2--;
            arg1 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BI)I", line = 27)
    public static final int method395(byte arg0, int arg1) {
        int var2 = -100 / ((42 - arg0) / 59);
        field738++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BILim;)V", line = 39)
    public final void method396(byte arg0, int arg1, class192 arg2) {
        if (arg0 != -71) {
            return;
        }
        while (true) {
            int var4 = arg2.method1399(-1172389784);
            if (var4 == 0) {
                field743++;
                return;
            }
            this.method399(arg1, arg2, -57, var4);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 59)
    public static void method397(int arg0) {
        field737 = null;
        if (arg0 == 0) {
            field746 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([BIIIIIIZB[Lde;I)[I", line = 81)
    public static final int[] method398(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, byte arg8, class68[] arg9, int arg10) {
        field747++;
        int var11 = (arg2 & 0x7) * 8;
        int var12 = (arg3 & 0x7) * 8;
        if (!arg7) {
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = arg6 + class255.method1799(arg10, var13 & 0x7, var14 & 0x7, (byte) 45);
                    int var16 = class309.method2162(var13 & 0x7, -29962, var14 & 0x7, arg10) + arg5;
                    if (var15 > 0 && var15 < 103 && var16 > 0 && var16 < 103) {
                        arg9[arg1].field889[var15][var16] = class200.method1465(arg9[arg1].field889[var15][var16], -2097153);
                    }
                }
            }
        }
        byte var17;
        if (arg7) {
            var17 = 1;
        } else {
            var17 = 4;
        }
        if (arg8 >= -19) {
            field741 = -13;
        }
        int var18 = (arg2 & 0xFFFFFFF8) << 3;
        int var19 = (arg3 & 0xFFFFFFF8) << 3;
        class192 var20 = new class192(arg0);
        byte var21 = 0;
        byte var22 = 0;
        if (arg10 == 1) {
            var22 = 1;
        } else if (arg10 == 2) {
            var21 = 1;
            var22 = 1;
        } else if (arg10 == 3) {
            var21 = 1;
        }
        for (int var23 = 0; var23 < var17; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg4 != var23 || var11 > var24 || (var11 + 8) < var24 || var12 > var25 || var12 + 8 < var25) {
                        class78.method580(arg7, 0, var20, 0, 0, 0, -1, 0, 0, -1, false, (byte) -128);
                    } else if ((var11 + 8) == var24 || var12 + 8 == var25) {
                        int var32;
                        int var33;
                        if (arg10 == 0) {
                            var32 = arg6 - (var11 - var24);
                            var33 = arg5 + var25 - var12;
                        } else if (arg10 == 1) {
                            var33 = arg5 + var11 + 8 - var24;
                            var32 = var25 + arg6 - var12;
                        } else if (arg10 == 2) {
                            var32 = arg6 + var11 + 8 - var24;
                            var33 = 8 - var25 - (-var12 - arg5);
                        } else {
                            var32 = arg6 + 8 - (-var12 + var25);
                            var33 = var24 + arg5 - var11;
                        }
                        class78.method580(arg7, 0, var20, var18 + var24, 0, 0, var33, arg1, var19 + var25, var32, true, (byte) -123);
                    } else {
                        int var26 = class255.method1799(arg10, var24 & 0x7, var25 & 0x7, (byte) 41) + arg6;
                        int var27 = arg5 + class309.method2162(var24 & 0x7, -29962, var25 & 0x7, arg10);
                        class78.method580(arg7, var21, var20, var18 + var24, var22, arg10, var27, arg1, var19 + var25, var26, false, (byte) -124);
                        if (var24 == 63 || var25 == 63) {
                            int var28 = var25 == 63 ? 64 : var25;
                            int var29 = var24 == 63 ? 64 : var24;
                            int var30;
                            int var31;
                            if (arg10 == 0) {
                                var30 = arg6 + var29 - var11;
                                var31 = var28 + arg5 - var12;
                            } else if (arg10 == 1) {
                                var30 = var28 + arg6 - var12;
                                var31 = arg5 + var11 + 8 - var29;
                            } else if (arg10 == 2) {
                                var31 = arg5 + var12 + 8 - var28;
                                var30 = arg6 + var11 + 8 - var29;
                            } else {
                                var31 = var29 + arg5 - var11;
                                var30 = arg6 + var12 + 8 - var28;
                            }
                            if (var30 >= 0 && var30 < 104 && var31 >= 0 && var31 < 104) {
                                class84.field1282[arg1][var30][var31] = class84.field1282[arg1][var21 + var26][var22 + var27];
                            }
                        }
                    }
                }
            }
        }
        boolean var34 = false;
        boolean var35 = false;
        while (var20.field3128.length > var20.field3129) {
            int var36 = var20.method1399(-1172389784);
            if (var36 == 128) {
                class183.field2956[0] = var20.method1396(-104);
                class183.field2956[1] = var20.method1389(114);
                var35 = true;
                class183.field2956[2] = var20.method1389(119);
                class183.field2956[3] = var20.method1389(97);
                class183.field2956[4] = var20.method1396(-39);
            } else {
                if (var36 != 129) {
                    var20.field3129--;
                    break;
                }
                for (int var37 = 0; var37 < 4; var37++) {
                    byte var38 = var20.method1377(true);
                    if (var38 == 0) {
                        if (var37 <= arg4) {
                            int var39 = arg6 + 7;
                            if (var39 < 0) {
                                var39 = 0;
                            } else if (var39 >= 104) {
                                var39 = 104;
                            }
                            int var40 = arg6;
                            int var41 = arg5 + 7;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 >= 104) {
                                var41 = 104;
                            }
                            if (arg6 < 0) {
                                var40 = 0;
                            } else if (arg6 >= 104) {
                                var40 = 104;
                            }
                            int var42 = arg5;
                            if (arg5 < 0) {
                                var42 = 0;
                            } else if (arg5 >= 104) {
                                var42 = 104;
                            }
                            while (var39 > var40) {
                                while (var41 > var42) {
                                    class276.field4374[arg1][var40][var42] = 0;
                                    var42++;
                                }
                                var40++;
                            }
                        }
                    } else if (var38 == 1) {
                        for (int var43 = 0; var43 < 64; var43 += 4) {
                            for (int var44 = 0; var44 < 64; var44 += 4) {
                                byte var45 = var20.method1377(true);
                                if (arg4 >= var37) {
                                    for (int var46 = var43; var46 < (var43 + 4); var46++) {
                                        for (int var47 = var44; var47 < var44 + 4; var47++) {
                                            if (var11 <= var46 && (var11 + 8) > var46 && var47 >= var12 && var12 < var12 + 8) {
                                                int var48 = class255.method1799(arg10, var46 & 0x7, var47 & 0x7, (byte) 92) + arg6;
                                                int var49 = arg5 + class309.method2162(var46 & 0x7, -29962, var47 & 0x7, arg10);
                                                if (var48 >= 0 && var48 < 104 && var49 >= 0 && var49 < 104) {
                                                    class276.field4374[arg1][var48][var49] = var45;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var38 == 2) {
                    }
                }
            }
        }
        if (class186.field2991 && !arg7) {
            class21 var50 = null;
            while (true) {
                while (var20.field3128.length > var20.field3129) {
                    int var51 = var20.method1399(-1172389784);
                    if (var51 == 0) {
                        var50 = new class21(var20);
                    } else if (var51 == 1) {
                        int var52 = var20.method1399(-1172389784);
                        if (var52 > 0) {
                            for (int var53 = 0; var53 < var52; var53++) {
                                class272 var54 = new class272(var20);
                                if (var54.field4334 == 31) {
                                    class56 var55 = class77.method569(var20.method1396(-125), 42);
                                    var54.method1940(var55.field735, var55.field734, -91, var55.field744, var55.field745);
                                }
                                int var56 = var54.field4325 >> 7;
                                int var57 = var54.field4317 >> 7;
                                if (var54.field4311 == arg4 && var56 >= var11 && var11 + 8 > var56 && var57 >= var12 && var57 < (var12 + 8)) {
                                    int var58 = (arg6 << 7) + class221.method1611((byte) 37, arg10, var54.field4325 & 0x3FF, var54.field4317 & 0x3FF);
                                    int var59 = class87.method634(var54.field4325 & 0x3FF, 3, var54.field4317 & 0x3FF, arg10) + (arg5 << 7);
                                    var54.field4317 = var59;
                                    var54.field4325 = var58;
                                    int var60 = var54.field4317 >> 7;
                                    int var61 = var54.field4325 >> 7;
                                    if (var61 >= 0 && var60 >= 0 && var61 < 104 && var60 < 104) {
                                        var54.field4308 = (class81.field1229[1][var61][var60] & 0x2) != 0;
                                        var54.field4312 = class84.field1282[var54.field4311][var61][var60] - var54.field4312;
                                        class47.method315(var54);
                                    }
                                }
                            }
                        }
                    } else if (var51 == 2) {
                        if (var50 == null) {
                            var50 = new class21();
                        }
                        var50.method138(true, var20);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var50 == null) {
                    var50 = new class21();
                }
                class274.field4345[arg6 >> 3][arg5 >> 3] = var50;
                break;
            }
        }
        if (!var34) {
            int var62 = arg6 + 7;
            int var63 = arg5 + 7;
            for (int var64 = arg6; var64 < var62; var64++) {
                for (int var65 = arg5; var65 < var63; var65++) {
                    class276.field4374[arg1][var64][var65] = 0;
                }
            }
        }
        return var35 ? class183.field2956 : null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILim;II)V", line = 551)
    private final void method399(int arg0, class192 arg1, int arg2, int arg3) {
        field736++;
        int var5 = 85 / ((arg2 - 22) / 32);
        if (arg3 == 1) {
            this.field744 = arg1.method1399(-1172389784);
        } else if (arg3 == 2) {
            this.field734 = arg1.method1396(-93);
        } else if (arg3 == 3) {
            this.field735 = arg1.method1396(-89);
        } else if (arg3 == 4) {
            this.field745 = arg1.method1389(125);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIB)V", line = 586)
    public static final void method400(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var5 = -12 / ((arg4 - 27) / 38);
        field748++;
        if (arg1 >= arg0) {
            class245.method1738(48, class310.field4841[arg2], arg1, arg0, arg3);
        } else {
            class245.method1738(48, class310.field4841[arg2], arg0, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lok;III)V", line = 603)
    public static final void method401(class160 arg0, int arg1, int arg2, int arg3) {
        field750++;
        if (class126.field1887 < 2 && class49.field676 == 0 && !class313.field4874) {
            return;
        }
        String var4 = class69.method456(31152);
        if (arg1 != -8875) {
            field740 = -43;
        }
        if (arg0 == null) {
            int var6 = class55.field732.method1007(var4, arg3 + 4, arg2 - -15, 16777215, 0, class58.field753, class331.field5157);
            class325.method2260(class55.field732.method995(var4) + var6, arg1 ^ 0x10FF, arg3 + 4, 15, arg2);
            return;
        }
        class143 var5 = arg0.method1106(class256.field4061, (byte) 109);
        if (var5 == null) {
            var5 = class55.field732;
        }
        var5.method1004(var4, arg3, arg2, arg0.field2458, arg0.field2590, arg0.field2452, arg0.field2541, arg0.field2613, arg0.field2575, class58.field753, class331.field5157, class97.field1485);
        class325.method2260(class97.field1485[2], arg1 ^ 0x10FF, class97.field1485[0], class97.field1485[3], class97.field1485[1]);
    }
}
