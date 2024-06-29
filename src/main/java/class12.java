import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class12 extends class93 {

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "I")
    private int field370 = 4;

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "I")
    private int field373 = 4;

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "Z")
    public static boolean field372 = false;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "Lud;")
    public static class192 field366;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)V")
    public static void method78(int arg0) {
        field366 = null;
        int var1 = -122 % ((34 - arg0) / 53);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class13 var8 = new class13();
        var8.field387 = arg2 / 128;
        var8.field391 = arg3 / 128;
        var8.field378 = arg4 / 128;
        var8.field393 = arg5 / 128;
        var8.field394 = arg1;
        var8.field392 = arg2;
        var8.field374 = arg3;
        var8.field389 = arg4;
        var8.field380 = arg5;
        var8.field379 = arg6;
        var8.field395 = arg7;
        class33.field753[arg0][class33.field739[arg0]++] = var8;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        ++field367;
        int var3 = -108 / ((arg1 - 67) / 42);
        int[] var4 = super.field1887.method916(arg0, -122);
        if (super.field1887.field2757) {
            int var5 = class68.field1385 / this.field370;
            int var6 = class150.field2985 / this.field373;
            int[] var7;
            if (var5 <= 0) {
                var7 = this.method648((byte) 46, 0, 0);
            } else {
                int var8 = arg0 % var5;
                var7 = this.method648((byte) 55, class68.field1385 * var8 / var5, 0);
            }
            for (int var9 = 0; class150.field2985 > var9; ++var9) {
                if (~var6 < -1) {
                    int var10 = var9 % var6;
                    var4[var9] = var7[class150.field2985 * var10 / var6];
                } else {
                    var4[var9] = var7[0];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILmb;ZIIIII)V")
    public static final void method80(int arg0, int arg1, class118 arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field371;
        class214 var9 = class126.method846(0, arg8);
        int[][] var10 = class125.field2538[arg1];
        int var11;
        int var12;
        if (~arg7 != -2 && ~arg7 != -4) {
            var11 = var9.field4197;
            var12 = var9.field4191;
        } else {
            var12 = var9.field4197;
            var11 = var9.field4191;
        }
        int var13;
        int var14;
        if (arg0 - -var11 <= 104) {
            var13 = arg0 - -(var11 >> 1);
            var14 = (var11 + 1 >> 1) + arg0;
        } else {
            var13 = arg0;
            var14 = arg0 + 1;
        }
        int var15;
        int var16;
        if (arg5 + var12 > 104) {
            var15 = arg5 - -1;
            var16 = arg5;
        } else {
            var15 = (var12 + 1 >> 1) + arg5;
            var16 = (var12 >> 1) + arg5;
        }
        int var17 = var10[var13][var16] + var10[var14][var15] - -var10[var14][var16] + var10[var13][var15] >> 2;
        int var18 = (arg0 << 7) - -(var11 << 6);
        long var19 = (long) (1073741824 | arg7 << 20 | arg0 | arg5 << 7 | arg4 << 14);
        if (var9.field4169 == 0) {
            var19 |= Long.MIN_VALUE;
        }
        int var21 = (arg5 << 7) + (var12 << 6);
        if (var9.field4154 == 1) {
            var19 |= 4194304L;
        }
        long var22 = var19 | (long) arg8 << 32;
        if (arg4 == 22) {
            class186 var24;
            if (var9.field4189 == -1 && var9.field4134 == null) {
                var24 = var9.method1396(false, arg7, var18, var21, 22, var17, var10);
            } else {
                var24 = new class34(arg8, 22, arg7, arg1, arg0, arg5, var9.field4189, var9.field4185, (class186) null);
            }
            class47.method294(arg6, arg0, arg5, var17, var24, var22, var9.field4158);
            if (~var9.field4143 == -2) {
                arg2.method795(-4, arg0, arg5);
            }
        } else if (arg4 != 10 && arg4 != 11) {
            if (arg4 >= 12) {
                class186 var25;
                if (~var9.field4189 == 0 && var9.field4134 == null) {
                    var25 = var9.method1396(false, arg7, var18, var21, arg4, var17, var10);
                } else {
                    var25 = new class34(arg8, arg4, arg7, arg1, arg0, arg5, var9.field4189, var9.field4185, (class186) null);
                }
                class114.method767(arg6, arg0, arg5, var17, 1, 1, var25, 0, var22);
                if (~var9.field4143 != -1) {
                    arg2.method796(var9.field4179, arg0, -117, var11, var12, arg5);
                }
            } else if (~arg4 == -1) {
                class186 var26;
                if (var9.field4189 == -1 && var9.field4134 == null) {
                    var26 = var9.method1396(arg3, arg7, var18, var21, 0, var17, var10);
                } else {
                    var26 = new class34(arg8, 0, arg7, arg1, arg0, arg5, var9.field4189, var9.field4185, (class186) null);
                }
                class1.method5(arg6, arg0, arg5, var17, var26, (class186) null, class42.field920[arg7], 0, var22);
                if (~var9.field4143 != -1) {
                    arg2.method797(arg4, arg5, (byte) -77, var9.field4179, arg7, arg0);
                }
            } else if (arg4 == 1) {
                class186 var27;
                if (~var9.field4189 == 0 && var9.field4134 == null) {
                    var27 = var9.method1396(false, arg7, var18, var21, 1, var17, var10);
                } else {
                    var27 = new class34(arg8, 1, arg7, arg1, arg0, arg5, var9.field4189, var9.field4185, (class186) null);
                }
                class1.method5(arg6, arg0, arg5, var17, var27, (class186) null, class105.field2153[arg7], 0, var22);
                if (~var9.field4143 != -1) {
                    arg2.method797(arg4, arg5, (byte) -77, var9.field4179, arg7, arg0);
                }
            } else if (~arg4 == -3) {
                int var28 = 3 & arg7 - -1;
                class186 var29;
                class186 var30;
                if (var9.field4189 == -1 && var9.field4134 == null) {
                    var29 = var9.method1396(false, arg7 + 4, var18, var21, 2, var17, var10);
                    var30 = var9.method1396(arg3, var28, var18, var21, 2, var17, var10);
                } else {
                    var29 = new class34(arg8, 2, arg7 + 4, arg1, arg0, arg5, var9.field4189, var9.field4185, (class186) null);
                    var30 = new class34(arg8, 2, var28, arg1, arg0, arg5, var9.field4189, var9.field4185, (class186) null);
                }
                class1.method5(arg6, arg0, arg5, var17, var29, var30, class42.field920[arg7], class42.field920[var28], var22);
                if (var9.field4143 != 0) {
                    arg2.method797(arg4, arg5, (byte) -77, var9.field4179, arg7, arg0);
                }
            } else if (arg4 == 3) {
                class186 var31;
                if (~var9.field4189 == 0 && var9.field4134 == null) {
                    var31 = var9.method1396(false, arg7, var18, var21, 3, var17, var10);
                } else {
                    var31 = new class34(arg8, 3, arg7, arg1, arg0, arg5, var9.field4189, var9.field4185, (class186) null);
                }
                class1.method5(arg6, arg0, arg5, var17, var31, (class186) null, class105.field2153[arg7], 0, var22);
                if (~var9.field4143 != -1) {
                    arg2.method797(arg4, arg5, (byte) -77, var9.field4179, arg7, arg0);
                }
            } else if (arg4 == 9) {
                class186 var32;
                if (~var9.field4189 == 0 && var9.field4134 == null) {
                    var32 = var9.method1396(false, arg7, var18, var21, arg4, var17, var10);
                } else {
                    var32 = new class34(arg8, arg4, arg7, arg1, arg0, arg5, var9.field4189, var9.field4185, (class186) null);
                }
                class114.method767(arg6, arg0, arg5, var17, 1, 1, var32, 0, var22);
                if (var9.field4143 != 0) {
                    arg2.method796(var9.field4179, arg0, -125, var11, var12, arg5);
                }
            } else if (~arg4 == -5) {
                class186 var33;
                if (var9.field4189 == -1 && var9.field4134 == null) {
                    var33 = var9.method1396(arg3, arg7, var18, var21, 4, var17, var10);
                } else {
                    var33 = new class34(arg8, 4, arg7, arg1, arg0, arg5, var9.field4189, var9.field4185, (class186) null);
                }
                class59.method361(arg6, arg0, arg5, var17, var33, (class186) null, class42.field920[arg7], 0, 0, 0, var22);
            } else if (~arg4 == -6) {
                int var34 = 16;
                long var35 = class124.method831(arg6, arg0, arg5);
                if (~var35 != -1L) {
                    var34 = class126.method846(0, (int) (var35 >>> 32) & Integer.MAX_VALUE).field4159;
                }
                class186 var37;
                if (var9.field4189 == -1 && var9.field4134 == null) {
                    var37 = var9.method1396(false, arg7, var18, var21, 4, var17, var10);
                } else {
                    var37 = new class34(arg8, 4, arg7, arg1, arg0, arg5, var9.field4189, var9.field4185, (class186) null);
                }
                class59.method361(arg6, arg0, arg5, var17, var37, (class186) null, class42.field920[arg7], 0, class77.field1601[arg7] * var34, class123.field2476[arg7] * var34, var22);
            } else {
                if (arg3) {
                    method80(-72, 75, (class118) null, false, 56, 48, 61, 40, 60);
                }
                if (~arg4 == -7) {
                    long var38 = class124.method831(arg6, arg0, arg5);
                    int var40 = 8;
                    if (var38 != 0L) {
                        var40 = class126.method846(0, (int) (var38 >>> 32) & Integer.MAX_VALUE).field4159 / 2;
                    }
                    class186 var41;
                    if (~var9.field4189 == 0 && var9.field4134 == null) {
                        var41 = var9.method1396(arg3, arg7 + 4, var18, var21, 4, var17, var10);
                    } else {
                        var41 = new class34(arg8, 4, arg7 - -4, arg1, arg0, arg5, var9.field4189, var9.field4185, (class186) null);
                    }
                    class59.method361(arg6, arg0, arg5, var17, var41, (class186) null, 256, arg7, class9.field337[arg7] * var40, class111.field2257[arg7] * var40, var22);
                } else if (arg4 == 7) {
                    int var42 = arg7 + 2 & 3;
                    class186 var43;
                    if (~var9.field4189 == 0 && var9.field4134 == null) {
                        var43 = var9.method1396(false, var42 - -4, var18, var21, 4, var17, var10);
                    } else {
                        var43 = new class34(arg8, 4, var42 + 4, arg1, arg0, arg5, var9.field4189, var9.field4185, (class186) null);
                    }
                    class59.method361(arg6, arg0, arg5, var17, var43, (class186) null, 256, var42, 0, 0, var22);
                } else if (arg4 == 8) {
                    int var44 = 8;
                    long var45 = class124.method831(arg6, arg0, arg5);
                    if (var45 != 0L) {
                        var44 = class126.method846(0, (int) (var45 >>> 32) & Integer.MAX_VALUE).field4159 / 2;
                    }
                    int var47 = 3 & arg7 + 2;
                    class186 var48;
                    class186 var49;
                    if (var9.field4189 == -1 && var9.field4134 == null) {
                        var48 = var9.method1396(false, arg7 - -4, var18, var21, 4, var17, var10);
                        var49 = var9.method1396(false, var47 + 4, var18, var21, 4, var17, var10);
                    } else {
                        var48 = new class34(arg8, 4, arg7 + 4, arg1, arg0, arg5, var9.field4189, var9.field4185, (class186) null);
                        var49 = new class34(arg8, 4, var47 - -4, arg1, arg0, arg5, var9.field4189, var9.field4185, (class186) null);
                    }
                    class59.method361(arg6, arg0, arg5, var17, var48, var49, 256, arg7, class9.field337[arg7] * var44, class111.field2257[arg7] * var44, var22);
                }
            }
        } else {
            class186 var50;
            if (var9.field4189 == -1 && var9.field4134 == null) {
                var50 = var9.method1396(false, arg7, var18, var21, 10, var17, var10);
            } else {
                var50 = new class34(arg8, 10, arg7, arg1, arg0, arg5, var9.field4189, var9.field4185, (class186) null);
            }
            if (var50 != null) {
                class114.method767(arg6, arg0, arg5, var17, var11, var12, var50, ~arg4 == -12 ? 256 : 0, var22);
            }
            if (var9.field4143 != 0) {
                arg2.method796(var9.field4179, arg0, -128, var11, var12, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)V")
    public static final void method81(int arg0, int arg1) {
        if (arg0 != -15844) {
            field372 = true;
        }
        class156.field3100 = null;
        ++field369;
        class150.field2980 = -1;
        class110.field2245 = 0;
        class33.field738 = arg1;
        class151.field2989 = false;
        class151.field3002 = -1;
        class79.field1619 = 1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        if (arg1 != 4096) {
            this.field373 = -42;
        }
        int[][] var3 = super.field1873.method553(arg0, 0);
        if (super.field1873.field1656) {
            int var4 = class68.field1385 / this.field370;
            int var5 = class150.field2985 / this.field373;
            int[][] var7;
            if (var4 > 0) {
                int var6 = arg0 % var4;
                var7 = this.method649(0, true, class68.field1385 * var6 / var4);
            } else {
                var7 = this.method649(0, true, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class150.field2985 < ~var14; ++var14) {
                int var16;
                if (var5 > 0) {
                    int var15 = var14 % var5;
                    var16 = class150.field2985 * var15 / var5;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        ++field364;
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)I")
    public static final int method82(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (arg2 != 0) {
            method78(80);
        }
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field370 = arg1.method443(arg2 ^ 255);
            }
        } else {
            this.field373 = arg1.method443(arg2 ^ 255);
        }
        ++field365;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    public class12() {
        super(1, false);
    }
}
