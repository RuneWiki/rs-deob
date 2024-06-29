import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class123 {

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "[I")
    public static int[] field1955 = new int[256];

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "Lbl;")
    public static class146 field1962;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "Lqk;")
    public class2 field1951;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "[[[I")
    public static int[][][] field1964;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V")
    public static final void method863(int arg0, int arg1, int arg2) {
        field1958++;
        if (arg1 >= -118) {
            field1962 = null;
        }
        class175 var3 = class182.method1317(1, arg0, false);
        var3.method1279((byte) -80);
        var3.field2855 = arg2;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIII)I")
    private static final int method864(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field1950++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else if (~var4 == arg3) {
            return 7 - arg0;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method865(int arg0, long arg1) {
        field1963++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            if (arg0 < 20) {
                method865(71, -46L);
            }
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class163.field2647[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIBI)I")
    public static final int method866(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = 34 % ((arg2 + 9) / 53);
        field1954++;
        if (arg1 >= arg0) {
            return arg3 >= arg1 ? arg1 : arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
    public static final void method867(int arg0, int arg1) {
        field1956++;
        if (arg1 < -91) {
            class68 var2 = class177.field2899;
            synchronized (class177.field2899) {
                class273.field4377 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
    public static void method868(byte arg0) {
        field1964 = null;
        field1955 = null;
        field1962 = null;
        int var1 = -3 / ((21 - arg0) / 51);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZII[Lpk;III[BII)[I")
    public static final int[] method869(int arg0, boolean arg1, int arg2, int arg3, class44[] arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        field1957++;
        int var11 = (arg10 & 0x7) * 8;
        int var12 = (arg6 & 0x7) * 8;
        if (arg2 != 10087) {
            field1959 = 99;
        }
        byte var13;
        if (arg1) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        if (!arg1) {
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = method864(var14 & 0x7, var15 & 0x7, arg9, -3) + arg0;
                    int var17 = arg3 + class53.method366(arg9, var14 & 0x7, 108, var15 & 0x7);
                    if (var16 > 0 && var16 < 103 && var17 > 0 && var17 < 103) {
                        arg4[arg5].field728[var16][var17] = class51.method359(arg4[arg5].field728[var16][var17], -2097153);
                    }
                }
            }
        }
        class162 var18 = new class162(arg8);
        int var19 = arg10 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        int var21 = (arg6 & 0xFFFFFFF8) << 3;
        byte var22 = 0;
        if (arg9 == 1) {
            var20 = 1;
        } else if (arg9 == 2) {
            var22 = 1;
            var20 = 1;
        } else if (arg9 == 3) {
            var22 = 1;
        }
        for (int var23 = 0; var23 < var13; var23++) {
            for (int var44 = 0; var44 < 64; var44++) {
                for (int var45 = 0; var45 < 64; var45++) {
                    if (arg7 != var23 || var11 > var44 || var11 + 8 < var44 || var12 > var45 || (var12 + 8) < var45) {
                        class310.method2076(-1, 0, 0, 0, 0, -1, (byte) -98, var18, 0, arg1, 0, false);
                    } else if ((var11 + 8) == var44 || (var12 + 8) == var45) {
                        int var52;
                        int var53;
                        if (arg9 == 0) {
                            var52 = var44 + arg0 - var11;
                            var53 = var45 + arg3 - var12;
                        } else if (arg9 == 1) {
                            var52 = var45 + arg0 - var12;
                            var53 = arg3 + 8 - (var44 - var11);
                        } else if (arg9 == 2) {
                            var52 = arg0 + var11 + 8 - var44;
                            var53 = arg3 + 8 - (-var12 + var45);
                        } else {
                            var53 = var44 - (var11 - arg3);
                            var52 = var12 + arg0 + 8 - var45;
                        }
                        class310.method2076(var53, 0, 0, var19 + var44, var21 + var45, var52, (byte) -98, var18, 0, arg1, arg5, true);
                    } else {
                        int var46 = method864(var44 & 0x7, var45 & 0x7, arg9, arg2 - 10090) + arg0;
                        int var47 = class53.method366(arg9, var44 & 0x7, 124, var45 & 0x7) + arg3;
                        class310.method2076(var47, arg9, var20, var19 + var44, var21 + var45, var46, (byte) -98, var18, var22, arg1, arg5, false);
                        if (var44 == 63 || var45 == 63) {
                            int var48 = var45 == 63 ? 64 : var45;
                            int var49 = var44 == 63 ? 64 : var44;
                            int var50;
                            int var51;
                            if (arg9 == 0) {
                                var51 = var48 + arg3 - var12;
                                var50 = var49 + arg0 - var11;
                            } else if (arg9 == 1) {
                                var51 = arg3 + var11 + 8 - var49;
                                var50 = var48 + arg0 - var12;
                            } else if (arg9 == 2) {
                                var50 = arg0 - var49 - (-var11 - 8);
                                var51 = -var48 - (-var12 - arg3 - 8);
                            } else {
                                var50 = arg0 + 8 - (-var12 + var48);
                                var51 = arg3 - (var11 - var49);
                            }
                            if (var50 >= 0 && var50 < 104 && var51 >= 0 && var51 < 104) {
                                class267.field4304[arg5][var50][var51] = class267.field4304[arg5][var22 + var46][var20 + var47];
                            }
                        }
                    }
                }
            }
        }
        boolean var24 = false;
        while (var18.field2568 < var18.field2573.length) {
            int var25 = var18.method1133((byte) 53);
            if (var25 == 128) {
                var24 = true;
                class184.field3019[0] = var18.method1142(-18970);
                class184.field3019[1] = var18.method1146(2);
                class184.field3019[2] = var18.method1146(2);
                class184.field3019[3] = var18.method1146(2);
                class184.field3019[4] = var18.method1142(-18970);
            } else {
                if (var25 != 129) {
                    var18.field2568--;
                    break;
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    byte var32 = var18.method1107((byte) -77);
                    if (var32 == 0) {
                        if (arg7 >= var31) {
                            int var40 = arg0;
                            if (arg0 < 0) {
                                var40 = 0;
                            } else if (arg0 >= 104) {
                                var40 = 104;
                            }
                            int var41 = arg3;
                            int var42 = arg3 + 7;
                            if (var42 < 0) {
                                var42 = 0;
                            } else if (var42 >= 104) {
                                var42 = 104;
                            }
                            int var43 = arg0 + 7;
                            if (var43 < 0) {
                                var43 = 0;
                            } else if (var43 >= 104) {
                                var43 = 104;
                            }
                            if (arg3 < 0) {
                                var41 = 0;
                            } else if (arg3 >= 104) {
                                var41 = 104;
                            }
                            while (var43 > var40) {
                                while (var41 < var42) {
                                    class107.field1702[arg5][var40][var41] = 0;
                                    var41++;
                                }
                                var40++;
                            }
                        }
                    } else if (var32 == 1) {
                        for (int var33 = 0; var33 < 64; var33 += 4) {
                            for (int var34 = 0; var34 < 64; var34 += 4) {
                                byte var35 = var18.method1107((byte) -95);
                                if (var31 <= arg7) {
                                    for (int var36 = var33; var36 < (var33 + 4); var36++) {
                                        for (int var37 = var34; var37 < (var34 + 4); var37++) {
                                            if (var11 <= var36 && var36 < var11 + 8 && var12 <= var37 && var12 < (var12 + 8)) {
                                                int var38 = arg0 + method864(var36 & 0x7, var37 & 0x7, arg9, -3);
                                                int var39 = arg3 + class53.method366(arg9, var36 & 0x7, arg2 ^ 0x2712, var37 & 0x7);
                                                if (var38 >= 0 && var38 < 104 && var39 >= 0 && var39 < 104) {
                                                    class107.field1702[arg5][var38][var39] = var35;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var26 = false;
        if (!var26) {
            int var27 = arg0 + 7;
            int var28 = arg3 + 7;
            for (int var29 = arg0; var29 < var27; var29++) {
                for (int var30 = arg3; var30 < var28; var30++) {
                    class107.field1702[arg5][var29][var30] = 0;
                }
            }
        }
        if (var24) {
            return class184.field3019;
        } else {
            return null;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1955[var0] = var1;
        }
        field1959 = 0;
        field1961 = -1;
    }
}
