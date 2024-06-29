import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class329 extends class381 {

    @OriginalMember(owner = "client!el", name = "v", descriptor = "[I")
    public int[] field4472 = new int[] { -1 };

    @OriginalMember(owner = "client!el", name = "w", descriptor = "[I")
    public int[] field4473 = new int[1];

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    public static int field4471 = 0;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "Lfi;")
    public static class166 field4465 = new class166();

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "[[B")
    public static byte[][] field4474;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILbi;)Z")
    public static final boolean method2086(int arg0, class139 arg1) {
        field4469++;
        if (arg1.field2089 == null) {
            return false;
        }
        if (arg0 != -3) {
            field4465 = null;
        }
        for (int var2 = 0; var2 < arg1.field2089.length; var2++) {
            int var3 = class436.method2708(var2, arg0 + 21724, arg1);
            int var4 = arg1.field1957[var2];
            if (arg1.field2089[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field2089[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field2089[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V")
    public static void method2087(int arg0) {
        field4465 = null;
        field4474 = null;
        if (arg0 != 32561) {
            field4465 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(I)V")
    public static final void method2088(int arg0) {
        class234.field3219++;
        class355.field4828.method1801(193, (byte) -73);
        field4463++;
        class355.field4828.method1877(true, class69.field1040);
        if (arg0 <= 71) {
            method2094(-1, -57, 80, -111, -16);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLpe;IBIILwe;Lqi;II)Lsj;")
    public final class73 method2089(boolean arg0, class391 arg1, int arg2, byte arg3, int arg4, int arg5, class24 arg6, class209 arg7, int arg8, int arg9) {
        field4475++;
        class73 var11 = null;
        int var12 = arg9;
        class434 var13 = null;
        if (arg5 != -1) {
            var13 = class265.method1706(false, arg5);
        }
        int[] var14 = this.field4472;
        if (var13 != null && var13.field6177 != null) {
            var14 = new int[var13.field6177.length];
            for (int var15 = 0; var15 < var13.field6177.length; var15++) {
                int var16 = var13.field6177[var15];
                if (var16 >= 0 && this.field4472.length > var16) {
                    var14[var15] = this.field4472[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        int var20 = -1;
        int var21 = -1;
        int var22 = 0;
        if (arg3 >= -103) {
            method2090(4, true, -12, 89, (class362) null);
        }
        class61 var23 = null;
        class61 var24 = null;
        if (arg7 != null) {
            int var25 = arg7.field2915[arg8];
            var12 = arg9 | 0x20;
            int var26 = var25 >>> 16;
            var23 = class166.method1254((byte) -127, var26);
            var20 = var25 & 0xFFFF;
            if (var23 != null) {
                var18 |= var23.method546(var20, (byte) -87);
                var17 |= var23.method551(0, var20);
                var19 |= arg7.field2911;
            }
            if ((arg7.field2909 || class258.field3486) && arg2 != -1 && arg7.field2915.length > arg2) {
                var22 = arg7.field2894[arg8];
                int var27 = arg7.field2915[arg2];
                int var28 = var27 >>> 16;
                var21 = var27 & 0xFFFF;
                if (var26 == var28) {
                    var24 = var23;
                } else {
                    var24 = class166.method1254((byte) -127, var21 >>> 16);
                }
                if (var24 != null) {
                    var18 |= var24.method546(var21, (byte) -98);
                    var17 |= var24.method551(0, var21);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
        }
        long var29 = this.method2095(var14, arg6 == null ? null : arg6.field440, arg0, 0, arg5);
        if (class81.field1207 != null) {
            var11 = (class73) class81.field1207.method2537(-48, var29);
        }
        if (var11 == null || arg1.method183(var11.method426(), var12) != 0) {
            if (var11 != null) {
                var12 = arg1.method163(var12, var11.method426());
            }
            int var31 = var12;
            boolean var32 = false;
            for (int var33 = 0; var33 < var14.length; var33++) {
                if (var14[var33] != -1 && !class234.method1569(2142, var14[var33]).method2818((byte) 73, arg0)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class84[] var34 = new class84[var14.length];
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1) {
                    var34[var35] = class234.method1569(2142, var14[var35]).method2809((byte) 5, arg0);
                }
            }
            if (var13 != null && var13.field6186 != null) {
                for (int var36 = 0; var36 < var13.field6186.length; var36++) {
                    if (var13.field6186[var36] != null && var34[var36] != null) {
                        int var37 = var13.field6186[var36][0];
                        int var38 = var13.field6186[var36][1];
                        int var39 = var13.field6186[var36][2];
                        int var40 = var13.field6186[var36][3];
                        int var41 = var13.field6186[var36][4];
                        int var42 = var13.field6186[var36][5];
                        if (var40 != 0 || var41 != 0 || var42 != 0) {
                            var34[var36].method768(var42, var41, var40, 0);
                        }
                        if (var37 != 0 || var38 != 0 || var39 != 0) {
                            var34[var36].method770(var39, -111, var37, var38);
                        }
                    }
                }
            }
            if (arg6 != null) {
                var31 = var12 | 0x2000;
            }
            class84 var43 = new class84(var34, var34.length);
            var11 = arg1.method237(var43, var31, class125.field1748, 64, 850);
            if (arg6 != null) {
                for (int var44 = 0; var44 < 5; var44++) {
                    if (arg6.field440[var44] < class134.field1905[var44].length) {
                        var11.method424(class190.field2737[var44], class134.field1905[var44][arg6.field440[var44]]);
                    }
                    if (class417.field5857[var44].length > arg6.field440[var44]) {
                        var11.method424(class234.field3245[var44], class417.field5857[var44][arg6.field440[var44]]);
                    }
                }
            }
            if (class81.field1207 != null) {
                var11.method463(var12);
                class81.field1207.method2542(var11, (byte) -76, var29);
            }
        }
        if (arg7 == null || var23 == null) {
            return var11;
        } else {
            class73 var45 = var11.method440((byte) 1, var12, true);
            var45.method628(arg4 - 1, var23, var22, (byte) 116, var24, var21, var20, arg7.field2911, 0);
            return var45;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IZIILsb;)V")
    public static final void method2090(int arg0, boolean arg1, int arg2, int arg3, class362 arg4) {
        field4468++;
        class434 var5 = arg4.method2280(98);
        if (arg1) {
            return;
        }
        int var6 = arg4.field4948 - arg4.field4977.field4361 & 0x3FFF;
        if (arg2 == -1) {
            if (var6 != 0 || arg4.field4989 > 25) {
                arg4.field4982 = false;
                if (arg0 < 0 && var5.field6151 != -1) {
                    arg4.field4941 = var5.field6151;
                } else if (arg0 <= 0 || var5.field6184 == -1) {
                    arg4.field4941 = var5.field6149;
                } else {
                    arg4.field4941 = var5.field6184;
                }
            } else if (!arg4.field4982 || !var5.method2692(1, arg4.field4941)) {
                arg4.field4941 = var5.method2694((byte) -125);
                arg4.field4982 = arg4.field4941 != -1;
            }
        } else if (arg4.field4988 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class52.field850[arg3] - arg4.field4977.field4361 & 0x3FFF;
            if (arg2 == 2 && var5.field6190 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field6176 != -1) {
                    arg4.field4941 = var5.field6176;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field6154 != -1) {
                    arg4.field4941 = var5.field6154;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field6148 == -1) {
                    arg4.field4941 = var5.field6190;
                } else {
                    arg4.field4941 = var5.field6148;
                }
            } else if (arg2 == 0 && var5.field6174 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field6172 != -1) {
                    arg4.field4941 = var5.field6172;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field6195 != -1) {
                    arg4.field4941 = var5.field6195;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field6153 == -1) {
                    arg4.field4941 = var5.field6174;
                } else {
                    arg4.field4941 = var5.field6153;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field6168 != -1) {
                arg4.field4941 = var5.field6168;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field6170 != -1) {
                arg4.field4941 = var5.field6170;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field6150 == -1) {
                arg4.field4941 = var5.field6149;
            } else {
                arg4.field4941 = var5.field6150;
            }
            arg4.field4982 = false;
        } else if (var6 == 0 && arg4.field4989 <= 25) {
            if (arg2 == 2 && var5.field6190 != -1) {
                arg4.field4941 = var5.field6190;
            } else if (arg2 == 0 && var5.field6174 != -1) {
                arg4.field4941 = var5.field6174;
            } else {
                arg4.field4941 = var5.field6149;
            }
            arg4.field4982 = false;
        } else {
            if (arg2 == 2 && var5.field6190 != -1) {
                if (arg0 < 0 && var5.field6178 != -1) {
                    arg4.field4941 = var5.field6178;
                } else if (arg0 <= 0 || var5.field6182 == -1) {
                    arg4.field4941 = var5.field6190;
                } else {
                    arg4.field4941 = var5.field6182;
                }
            } else if (arg2 == 0 && var5.field6174 != -1) {
                if (arg0 < 0 && var5.field6188 != -1) {
                    arg4.field4941 = var5.field6188;
                } else if (arg0 <= 0 || var5.field6164 == -1) {
                    arg4.field4941 = var5.field6174;
                } else {
                    arg4.field4941 = var5.field6164;
                }
            } else if (arg0 < 0 && var5.field6180 != -1) {
                arg4.field4941 = var5.field6180;
            } else if (arg0 <= 0 || var5.field6162 == -1) {
                arg4.field4941 = var5.field6149;
            } else {
                arg4.field4941 = var5.field6162;
            }
            arg4.field4982 = false;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V")
    public static final void method2091(int arg0, int arg1) {
        class348.method2202(arg0 + 29713);
        field4467++;
        class190.method1366((byte) 119);
        int var2 = class394.method2426(arg1, -126).field2514;
        if (var2 == 0) {
            return;
        }
        int var3 = class414.field5782[arg1];
        if (var2 == 5) {
            class258.field3482 = var3;
        }
        if (var2 == 6) {
            class128.field1826 = var3;
        }
        if (var2 == 9) {
            class224.field3104 = var3;
        }
        if (arg0 != -29713) {
            method2094(-50, 109, 19, -35, -57);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
    public static final void method2092(boolean arg0) {
        class291.field3949 = new class139[class166.field2453.method2649((byte) -111)][];
        field4464++;
        class224.field3103 = new boolean[class166.field2453.method2649((byte) -118)];
        if (arg0) {
            method2090(21, false, 15, -17, (class362) null);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIBII)V")
    public static final void method2093(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4462++;
        if (class392.field5501 == 1) {
            class314.field4241[class416.field5821 / 100].method722(class233.field3203 - 8, class264.field3554 + -8);
        }
        if (class392.field5501 == 2) {
            class314.field4241[class416.field5821 / 100 + 4].method722(class233.field3203 - 8, class264.field3554 - 8);
        }
        if (arg2 <= 61) {
            method2087(84);
        }
        class341.method2170(-3157);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIII)V")
    public static final void method2094(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4466++;
        if (arg1 != 27621) {
            field4465 = null;
        }
        class450 var5 = class59.method540(4, arg0, arg1 - 26621);
        var5.method2800(arg1 - 27365);
        var5.field6503 = arg4;
        var5.field6498 = arg2;
        var5.field6509 = arg3;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([I[IZII)J")
    private final long method2095(int[] arg0, int[] arg1, boolean arg2, int arg3, int arg4) {
        field4470++;
        long[] var6 = class57.field914;
        long var7 = -1L;
        long var9 = var6[(int) ((var7 ^ (long) (arg4 >> 8)) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var6[(int) ((var9 ^ (long) arg4) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = arg3; var13 < arg0.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg0[var13] >> 24)) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) (((long) (arg0[var13] >> 16) ^ var17) & 0xFFL)];
            long var21 = var6[(int) ((var19 ^ (long) (arg0[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg0[var13]) & 0xFFL)];
        }
        if (arg1 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) (((long) arg1[var14] ^ var11) & 0xFFL)];
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg2 ? 1 : 0) ^ var11) & 0xFFL)];
    }
}
