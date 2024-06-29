import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public abstract class class314 {

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "[F")
    public float[] field4470 = new float[5000];

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
    public int field4473 = 0;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public int field4471 = 0;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "[B")
    public byte[] field4469 = new byte[5000];

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
    public volatile int field4479 = 0;

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "[Ljava/lang/Object;")
    public Object[] field4480 = new Object[5000];

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "I")
    public volatile int field4478 = 0;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "I")
    public static int field4476 = -1;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public static int field4474 = 0;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "[I")
    public static int[] field4468;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
    public static void method1961(int arg0) {
        if (arg0 != -1) {
            field4472 = 5;
        }
        field4468 = null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IBI)V")
    public static final void method1962(int arg0, byte arg1, int arg2) {
        if (arg1 != 109) {
            method1963(-104, (class174) null);
        }
        class169.field2360.method809(219, -28022);
        field4475++;
        class447.field6510++;
        class169.field2360.method1358(arg0, -127);
        class169.field2360.method1357((byte) 90, arg2);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILen;)V")
    public static final void method1963(int arg0, class174 arg1) {
        field4467++;
        int var2 = class162.field2286;
        int var3 = class428.field6219;
        int var4 = class119.field1595;
        int var5 = class149.field2094;
        int var6 = -10660793;
        if (arg0 != -1) {
            field4476 = 3;
        }
        arg1.method1150((byte) 107, var3, var2, var5, var4, var6);
        arg1.method1150((byte) 102, var3 + 1, var2 + 1, 16, var4 - 2, -16777216);
        arg1.method1149(-16777216, (byte) -88, var3 + 18, var2 + 1, var5 - 19, var4 + -2);
        class287.field4059.method1245(-1, var3 + 14, class326.field4582, true, var6, var2 + 3);
        int var7 = class57.field654;
        int var8 = class48.field562;
        int var9 = 0;
        for (class159 var10 = (class159) class32.field301.method1124(arg0); var10 != null; var10 = (class159) class32.field301.method1119(false)) {
            int var11 = var3 + ((-var9 + -1 + class433.field6324) * 16) + 31;
            short var12 = -1;
            if (var2 < var7 && var7 < (var2 + var4) && var11 - 13 < var8 && var8 < (var11 + 3)) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class172.method1139(-91, var10.field2257)) {
                var13 = class392.method2498((int) var10.field2259, arg0 - 108).field3569;
            } else if (class111.method613(arg0 ^ 0xC, var10.field2257)) {
                class358 var14 = class81.field917[(int) var10.field2259];
                if (var14 != null) {
                    var13 = var14.field5229.field4969;
                }
            } else if (class77.method438(arg0 - 7, var10.field2257)) {
                if (var10.field2257 == 1002) {
                    var13 = class157.method1036(arg0 + 1, (int) var10.field2259).field4671;
                } else {
                    var13 = class157.method1036(0, (int) (var10.field2259 >>> 32 & 0x7FFFFFFFL)).field4671;
                }
            }
            String var15 = class237.method1514(arg0 ^ 0x3A48, var10);
            if (var13 != null) {
                var15 = var15 + class245.method1551(var13, -1);
            }
            var9++;
            class287.field4059.method1248(var15, 0, var12, field4468, 120, var11, var2 + 3, class37.field375);
        }
        class310.method1948(class428.field6219, class162.field2286, class119.field1595, class149.field2094, 0);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIBI[[B[[BLen;ILng;[Z[[BLgf;II)V")
    public static final void method1964(int arg0, int arg1, byte arg2, int arg3, byte[][] arg4, byte[][] arg5, class174 arg6, int arg7, class190 arg8, boolean[] arg9, byte[][] arg10, class151 arg11, int arg12, int arg13) {
        if (arg8 != null && arg11 != null || arg11 != null && arg0 == 12 || arg8 != null && arg0 == 0) {
            boolean[] var14 = arg8 != null && arg8.field2585 ? class248.field3368[arg0] : class115.field1350[arg0];
            if (arg13 > 0) {
                if (arg3 > 0) {
                    int var15 = arg10[arg3 - 1][arg13 - 1] & 0xFF;
                    if (var15 > 0) {
                        class190 var16 = class196.method1260(var15 - 1, -48);
                        if (var16.field2596 != -1 && var16.field2585) {
                            byte var17 = arg4[arg3 - 1][arg13 - 1];
                            int var18 = (arg5[arg3 - 1][arg13 - 1] * 2) + 4 & 0x7;
                            int var19 = class344.method2205(arg6, var16, 126);
                            if (class349.field5104[var17][var18]) {
                                class444.field6495[0] = var16.field2596;
                                class303.field4335[0] = var19;
                                class191.field2607[0] = arg6.method996() ? var16.field2584 : var16.field2592;
                                class72.field817[0] = var16.field2582;
                                class178.field2459[0] = var16.field2595;
                                class440.field6444[0] = 256;
                            }
                        }
                    }
                }
                if (arg3 < arg12 - 1) {
                    int var20 = arg10[arg3 + 1][arg13 - 1] & 0xFF;
                    if (var20 > 0) {
                        class190 var21 = class196.method1260(var20 - 1, 82);
                        if (var21.field2596 != -1 && var21.field2585) {
                            byte var22 = arg4[arg3 + 1][arg13 - 1];
                            int var23 = arg5[arg3 + 1][arg13 - 1] * 2 + 6 & 0x7;
                            int var24 = class344.method2205(arg6, var21, 127);
                            if (class349.field5104[var22][var23]) {
                                class444.field6495[2] = var21.field2596;
                                class303.field4335[2] = var24;
                                class191.field2607[2] = arg6.method996() ? var21.field2584 : var21.field2592;
                                class72.field817[2] = var21.field2582;
                                class178.field2459[2] = var21.field2595;
                                class440.field6444[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg13 < (arg7 - 1)) {
                if (arg3 > 0) {
                    int var25 = arg10[arg3 - 1][arg13 + 1] & 0xFF;
                    if (var25 > 0) {
                        class190 var26 = class196.method1260(var25 - 1, 84);
                        if (var26.field2596 != -1 && var26.field2585) {
                            byte var27 = arg4[arg3 - 1][arg13 + 1];
                            int var28 = arg5[arg3 - 1][arg13 + 1] * 2 + 2 & 0x7;
                            int var29 = class344.method2205(arg6, var26, 38);
                            if (class349.field5104[var27][var28]) {
                                class444.field6495[6] = var26.field2596;
                                class303.field4335[6] = var29;
                                class191.field2607[6] = arg6.method996() ? var26.field2584 : var26.field2592;
                                class72.field817[6] = var26.field2582;
                                class178.field2459[6] = var26.field2595;
                                class440.field6444[6] = 64;
                            }
                        }
                    }
                }
                if (arg12 - 1 > arg3) {
                    int var30 = arg10[arg3 + 1][arg13 + 1] & 0xFF;
                    if (var30 > 0) {
                        class190 var31 = class196.method1260(var30 - 1, 112);
                        if (var31.field2596 != -1 && var31.field2585) {
                            byte var32 = arg4[arg3 + 1][arg13 + 1];
                            int var33 = arg5[arg3 + 1][arg13 + 1] * 2 & 0x7;
                            int var34 = class344.method2205(arg6, var31, 127);
                            if (class349.field5104[var32][var33]) {
                                class444.field6495[4] = var31.field2596;
                                class303.field4335[4] = var34;
                                class191.field2607[4] = arg6.method996() ? var31.field2584 : var31.field2592;
                                class72.field817[4] = var31.field2582;
                                class178.field2459[4] = var31.field2595;
                                class440.field6444[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg13 > 0) {
                int var35 = arg10[arg3][arg13 - 1] & 0xFF;
                if (var35 > 0) {
                    class190 var36 = class196.method1260(var35 - 1, -83);
                    if (var36.field2596 != -1) {
                        byte var37 = arg4[arg3][arg13 - 1];
                        byte var38 = arg5[arg3][arg13 - 1];
                        if (var36.field2585) {
                            int var39 = 2;
                            int var40 = var38 * 2 + 4;
                            int var41 = class344.method2205(arg6, var36, -78);
                            for (int var42 = 0; var42 < 3; var42++) {
                                var40 &= 0x7;
                                var39 &= 0x7;
                                if (class349.field5104[var37][var40] && var36.field2595 >= class178.field2459[var39]) {
                                    class444.field6495[var39] = var36.field2596;
                                    class303.field4335[var39] = var41;
                                    class191.field2607[var39] = arg6.method996() ? var36.field2584 : var36.field2592;
                                    class72.field817[var39] = var36.field2582;
                                    if (class178.field2459[var39] == var36.field2595) {
                                        class440.field6444[var39] = class164.method1059(class440.field6444[var39], 32);
                                    } else {
                                        class440.field6444[var39] = 32;
                                    }
                                    class178.field2459[var39] = var36.field2595;
                                }
                                var39--;
                                var40++;
                            }
                            if (!var14[arg1 & 0x3]) {
                                arg9[0] = class248.field3368[var37][class40.method253(3, var38 + 2)];
                            }
                        } else if (!var14[arg1 & 0x3]) {
                            arg9[0] = class115.field1350[var37][class40.method253(3, var38 + 2)];
                        }
                    }
                }
            }
            if (arg13 < arg7 - 1) {
                int var43 = arg10[arg3][arg13 + 1] & 0xFF;
                if (var43 > 0) {
                    class190 var44 = class196.method1260(var43 - 1, -93);
                    if (var44.field2596 != -1) {
                        byte var45 = arg4[arg3][arg13 + 1];
                        byte var46 = arg5[arg3][arg13 + 1];
                        if (var44.field2585) {
                            int var47 = 4;
                            int var48 = var46 * 2 + 2;
                            int var49 = class344.method2205(arg6, var44, 9);
                            for (int var50 = 0; var50 < 3; var50++) {
                                var48 &= 0x7;
                                var47 &= 0x7;
                                if (class349.field5104[var45][var48] && class178.field2459[var47] <= var44.field2595) {
                                    class444.field6495[var47] = var44.field2596;
                                    class303.field4335[var47] = var49;
                                    class191.field2607[var47] = arg6.method996() ? var44.field2584 : var44.field2592;
                                    class72.field817[var47] = var44.field2582;
                                    if (class178.field2459[var47] == var44.field2595) {
                                        class440.field6444[var47] = class164.method1059(class440.field6444[var47], 16);
                                    } else {
                                        class440.field6444[var47] = 16;
                                    }
                                    class178.field2459[var47] = var44.field2595;
                                }
                                var48--;
                                var47++;
                            }
                            if (!var14[arg1 + 2 & 0x3]) {
                                arg9[2] = class248.field3368[var45][class40.method253(3, var46)];
                            }
                        } else if (!var14[arg1 + 2 & 0x3]) {
                            arg9[2] = class115.field1350[var45][class40.method253(-(-var46), 3)];
                        }
                    }
                }
            }
            if (arg3 > 0) {
                int var51 = arg10[arg3 - 1][arg13] & 0xFF;
                if (var51 > 0) {
                    class190 var52 = class196.method1260(var51 - 1, 90);
                    if (var52.field2596 != -1) {
                        byte var53 = arg4[arg3 - 1][arg13];
                        byte var54 = arg5[arg3 - 1][arg13];
                        if (var52.field2585) {
                            int var55 = 6;
                            int var56 = var54 * 2 + 4;
                            int var57 = class344.method2205(arg6, var52, 126);
                            for (int var58 = 0; var58 < 3; var58++) {
                                var56 &= 0x7;
                                var55 &= 0x7;
                                if (class349.field5104[var53][var56] && class178.field2459[var55] <= var52.field2595) {
                                    class444.field6495[var55] = var52.field2596;
                                    class303.field4335[var55] = var57;
                                    class191.field2607[var55] = arg6.method996() ? var52.field2584 : var52.field2592;
                                    class72.field817[var55] = var52.field2582;
                                    if (class178.field2459[var55] == var52.field2595) {
                                        class440.field6444[var55] = class164.method1059(class440.field6444[var55], 8);
                                    } else {
                                        class440.field6444[var55] = 8;
                                    }
                                    class178.field2459[var55] = var52.field2595;
                                }
                                var55++;
                                var56--;
                            }
                            if (!var14[arg1 + 3 & 0x3]) {
                                arg9[3] = class248.field3368[var53][class40.method253(3, var54 + 1)];
                            }
                        } else if (!var14[arg1 + 3 & 0x3]) {
                            arg9[3] = class115.field1350[var53][class40.method253(var54 + 1, 3)];
                        }
                    }
                }
            }
            if ((arg12 - 1) > arg3) {
                int var59 = arg10[arg3 + 1][arg13] & 0xFF;
                if (var59 > 0) {
                    class190 var60 = class196.method1260(var59 - 1, -91);
                    if (var60.field2596 != -1) {
                        byte var61 = arg4[arg3 + 1][arg13];
                        byte var62 = arg5[arg3 + 1][arg13];
                        if (var60.field2585) {
                            int var63 = 4;
                            int var64 = var62 * 2 + 6;
                            int var65 = class344.method2205(arg6, var60, 126);
                            for (int var66 = 0; var66 < 3; var66++) {
                                var63 &= 0x7;
                                var64 &= 0x7;
                                if (class349.field5104[var61][var64] && var60.field2595 >= class178.field2459[var63]) {
                                    class444.field6495[var63] = var60.field2596;
                                    class303.field4335[var63] = var65;
                                    class191.field2607[var63] = arg6.method996() ? var60.field2584 : var60.field2592;
                                    class72.field817[var63] = var60.field2582;
                                    if (class178.field2459[var63] == var60.field2595) {
                                        class440.field6444[var63] = class164.method1059(class440.field6444[var63], 4);
                                    } else {
                                        class440.field6444[var63] = 4;
                                    }
                                    class178.field2459[var63] = var60.field2595;
                                }
                                var63--;
                                var64++;
                            }
                            if (!var14[arg1 + 1 & 0x3]) {
                                arg9[1] = class248.field3368[var61][class40.method253(var62 + 3, 3)];
                            }
                        } else if (!var14[arg1 + 1 & 0x3]) {
                            arg9[1] = class115.field1350[var61][class40.method253(var62 + 3, 3)];
                        }
                    }
                }
            }
        }
        if (arg2 >= -96) {
            method1962(-83, (byte) 36, -72);
        }
        field4477++;
        if (arg8 == null) {
            return;
        }
        int var67 = class344.method2205(arg6, arg8, 126);
        if (!arg8.field2585) {
            return;
        }
        for (int var68 = 0; var68 < 8; var68++) {
            int var69 = var68 - (arg1 * 2) & 0x7;
            if (class349.field5104[arg0][var68] && class178.field2459[var69] <= arg8.field2595) {
                class444.field6495[var69] = arg8.field2596;
                class303.field4335[var69] = var67;
                class191.field2607[var69] = arg6.method996() ? arg8.field2584 : arg8.field2592;
                class72.field817[var69] = arg8.field2582;
                if (class178.field2459[var69] == arg8.field2595) {
                    class440.field6444[var69] = class164.method1059(class440.field6444[var69], 2);
                } else {
                    class440.field6444[var69] = 2;
                }
                class178.field2459[var69] = arg8.field2595;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILdn;)V")
    public abstract void method1099(int arg0, class302 arg1);

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BI)V")
    public abstract void method1095(byte arg0, int arg1);

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IFLac;ZI)V")
    public abstract void method1102(int arg0, float arg1, class319 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IB[I)[I")
    public static final int[] method1965(int arg0, byte arg1, int[] arg2) {
        field4466++;
        if (arg1 != 88) {
            field4468 = null;
        }
        int[] var3 = new int[1152];
        int var4 = 0;
        for (int var5 = 0; var5 < 32; var5++) {
            for (int var6 = 0; var6 < 36; var6++) {
                int var7 = arg2[var4];
                if (var7 == 0) {
                    if (var6 > 0 && arg2[var4 - 1] != 0) {
                        var7 = arg0;
                    } else if (var5 > 0 && arg2[var4 - 36] != 0) {
                        var7 = arg0;
                    } else if (var6 < 35 && arg2[var4 + 1] != 0) {
                        var7 = arg0;
                    } else if (var5 < 31 && arg2[var4 + 36] != 0) {
                        var7 = arg0;
                    }
                }
                var3[var4++] = var7;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(III)Lmf;")
    public static final class240 method1966(int arg0, int arg1, int arg2) {
        class302 var3 = class19.field202[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class240 var4 = var3.field4316;
            var3.field4316 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ldn;I)V")
    public abstract void method1091(class302 arg0, int arg1);

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V")
    public abstract void method1093(byte arg0);

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ldn;B)V")
    public abstract void method1096(class302 arg0, byte arg1);

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)V")
    public abstract void method1098(byte arg0);

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)V")
    public abstract void method1097(int arg0, int arg1);
}
