import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class518 extends class634 {

    @OriginalMember(owner = "client!hha", name = "K", descriptor = "I")
    private int field7366 = 1;

    @OriginalMember(owner = "client!hha", name = "U", descriptor = "I")
    private int field7376 = 1;

    @OriginalMember(owner = "client!hha", name = "I", descriptor = "I")
    public static int field7364 = 2;

    @OriginalMember(owner = "client!hha", name = "H", descriptor = "Lsq;")
    public static class178 field7363 = new class178(14, 0, 4, 1);

    @OriginalMember(owner = "client!hha", name = "P", descriptor = "Z")
    public static boolean field7371 = false;

    @OriginalMember(owner = "client!hha", name = "T", descriptor = "[F")
    public static float[] field7375 = new float[16];

    @OriginalMember(owner = "client!hha", name = "S", descriptor = "Lbq;")
    public static class289 field7374 = new class289();

    @OriginalMember(owner = "client!hha", name = "F", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!hha", name = "G", descriptor = "I")
    public static int field7362;

    @OriginalMember(owner = "client!hha", name = "J", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!hha", name = "L", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!hha", name = "M", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!hha", name = "N", descriptor = "I")
    public static int field7369;

    @OriginalMember(owner = "client!hha", name = "O", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!hha", name = "Q", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!hha", name = "R", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "(BI)V", line = 14)
    public static final void method3041(byte arg0, int arg1) {
        class120.field1257 = arg1;
        ++field7367;
        int var2 = 1 / ((53 - arg0) / 32);
        class430.field6248.method3549(0);
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(Lwp;I)V", line = 25)
    public static final void method3042(class179 arg0, int arg1) {
        ++field7365;
        int var2 = 0;
        arg0.method1108(-103);
        for (int var3 = 0; var3 < class585.field8256; ++var3) {
            int var15 = class399.field5459[var3];
            if (~(1 & class480.field6871[var15]) == -1) {
                if (var2 > 0) {
                    --var2;
                    class480.field6871[var15] = (byte) class695.method3919(class480.field6871[var15], 2);
                } else {
                    int var16 = arg0.method1102(255, 1);
                    if (var16 == 0) {
                        var2 = class84.method584(2, arg0);
                        class480.field6871[var15] = (byte) class695.method3919(class480.field6871[var15], 2);
                    } else {
                        class359.method2108(arg0, 4857, var15);
                    }
                }
            }
        }
        arg0.method1106(-104);
        if (~var2 != -1) {
            throw new RuntimeException("nsn0");
        } else {
            arg0.method1108(-124);
            for (int var4 = 0; var4 < class585.field8256; ++var4) {
                int var13 = class399.field5459[var4];
                if (~(class480.field6871[var13] & 1) != -1) {
                    if (var2 > 0) {
                        class480.field6871[var13] = (byte) class695.method3919(class480.field6871[var13], 2);
                        --var2;
                    } else {
                        int var14 = arg0.method1102(255, 1);
                        if (var14 == 0) {
                            var2 = class84.method584(2, arg0);
                            class480.field6871[var13] = (byte) class695.method3919(class480.field6871[var13], 2);
                        } else {
                            class359.method2108(arg0, 4857, var13);
                        }
                    }
                }
            }
            arg0.method1106(-126);
            if (var2 != 0) {
                throw new RuntimeException("nsn1");
            } else {
                arg0.method1108(-114);
                if (arg1 > 119) {
                    for (int var5 = 0; class606.field8617 > var5; ++var5) {
                        int var11 = class35.field376[var5];
                        if (~(class480.field6871[var11] & 1) != -1) {
                            if (~var2 < -1) {
                                class480.field6871[var11] = (byte) class695.method3919(class480.field6871[var11], 2);
                                --var2;
                            } else {
                                int var12 = arg0.method1102(255, 1);
                                if (var12 == 0) {
                                    var2 = class84.method584(2, arg0);
                                    class480.field6871[var11] = (byte) class695.method3919(class480.field6871[var11], 2);
                                } else if (class556.method3261(arg0, -63, var11)) {
                                    class480.field6871[var11] = (byte) class695.method3919(class480.field6871[var11], 2);
                                }
                            }
                        }
                    }
                    arg0.method1106(60);
                    if (var2 != 0) {
                        throw new RuntimeException("nsn2");
                    } else {
                        arg0.method1108(-104);
                        for (int var6 = 0; var6 < class606.field8617; ++var6) {
                            int var9 = class35.field376[var6];
                            if (~(1 & class480.field6871[var9]) == -1) {
                                if (var2 > 0) {
                                    class480.field6871[var9] = (byte) class695.method3919(class480.field6871[var9], 2);
                                    --var2;
                                } else {
                                    int var10 = arg0.method1102(255, 1);
                                    if (~var10 == -1) {
                                        var2 = class84.method584(2, arg0);
                                        class480.field6871[var9] = (byte) class695.method3919(class480.field6871[var9], 2);
                                    } else if (class556.method3261(arg0, -100, var9)) {
                                        class480.field6871[var9] = (byte) class695.method3919(class480.field6871[var9], 2);
                                    }
                                }
                            }
                        }
                        arg0.method1106(-114);
                        if (var2 != 0) {
                            throw new RuntimeException("nsn3");
                        } else {
                            class606.field8617 = 0;
                            class585.field8256 = 0;
                            for (int var7 = 1; ~var7 > -2049; ++var7) {
                                class480.field6871[var7] = (byte) (class480.field6871[var7] >> 1);
                                class183 var8 = class75.field792[var7];
                                if (var8 == null) {
                                    class35.field376[class606.field8617++] = var7;
                                } else {
                                    class399.field5459[class585.field8256++] = var7;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hha", name = "<init>", descriptor = "()V", line = 487)
    public class518() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hha", name = "f", descriptor = "(I)V", line = 229)
    public static void method3043(int arg0) {
        if (arg0 != 5882) {
            method3043(5);
        }
        field7375 = null;
        field7363 = null;
        field7374 = null;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(ILig;Z)V", line = 241)
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        ++field7372;
        if (!arg2) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (~arg0 == -3) {
                        super.field9121 = ~arg1.method1423(-57) == -2;
                    }
                } else {
                    this.field7376 = arg1.method1423(-128);
                }
            } else {
                this.field7366 = arg1.method1423(-91);
            }
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "([I[II)V", line = 290)
    public static final void method3044(int[] arg0, int[] arg1, int arg2) {
        ++field7368;
        if (arg0 != null && arg1 != null) {
            class448.field6473 = arg0;
            class293.field3608 = new int[arg0.length];
            class413.field5626 = new byte[arg0.length][][];
            int var3 = 0;
            if (arg2 != -10451) {
                method3047(-108, 95, -72, -46, 43, -122, 7, -14);
            }
            while (~class448.field6473.length < ~var3) {
                class413.field5626[var3] = new byte[arg1[var3]][];
                ++var3;
            }
        } else {
            class293.field3608 = null;
            class448.field6473 = null;
            class413.field5626 = null;
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(BI)[[I", line = 324)
    public final int[][] method7(byte arg0, int arg1) {
        ++field7369;
        int[][] var3 = super.field9126.method132(0, arg1);
        int var4 = 76 % ((arg0 - -56) / 53);
        if (super.field9126.field295) {
            int var5 = this.field7376 + this.field7376 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field7366 - -this.field7366 + 1;
            int var8 = 65536 / var7;
            int[][][] var9 = new int[var5][][];
            for (int var10 = -this.field7376 + arg1; var10 <= arg1 - -this.field7376; ++var10) {
                int[][] var20 = this.method3642(0, var10 & class312.field3870, true);
                int[][] var21 = new int[3][class635.field9139];
                int var22 = 0;
                int var23 = 0;
                int var24 = 0;
                int[] var25 = var20[0];
                int[] var26 = var20[1];
                int[] var27 = var20[2];
                for (int var28 = -this.field7366; var28 <= this.field7366; ++var28) {
                    int var38 = var28 & class110.field1162;
                    var22 += var25[var38];
                    var23 += var26[var38];
                    var24 += var27[var38];
                }
                int[] var29 = var21[0];
                int[] var30 = var21[1];
                int[] var31 = var21[2];
                int var32 = 0;
                while (class635.field9139 > var32) {
                    var29[var32] = var8 * var22 >> 16;
                    var30[var32] = var8 * var23 >> 16;
                    var31[var32] = var8 * var24 >> 16;
                    int var33 = var32 - this.field7366 & class110.field1162;
                    int var34 = var24 - var27[var33];
                    ++var32;
                    int var35 = var23 - var26[var33];
                    int var36 = var22 - var25[var33];
                    int var37 = var32 - -this.field7366 & class110.field1162;
                    var24 = var27[var37] + var34;
                    var22 = var25[var37] + var36;
                    var23 = var26[var37] + var35;
                }
                var9[-arg1 + this.field7376 + var10] = var21;
            }
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class635.field9139; ++var14) {
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                for (int var18 = 0; ~var5 < ~var18; ++var18) {
                    int[][] var19 = var9[var18];
                    var15 += var19[0][var14];
                    var16 += var19[1][var14];
                    var17 += var19[2][var14];
                }
                var11[var14] = var6 * var15 >> 16;
                var12[var14] = var6 * var16 >> 16;
                var13[var14] = var6 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(Lefa;I)V", line = 458)
    public static final void method3045(class183 arg0, int arg1) {
        ++field7370;
        if (arg1 == 65536) {
            class376 var2 = (class376) class653.field9319.method1754(false, (long) arg0.field7107);
            if (var2 != null) {
                if (var2.field4859 != null) {
                    class597.field8470.method1690(var2.field4859);
                    var2.field4859 = null;
                }
                var2.method864(12983);
            }
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(BIIIIIFZI)[[I", line = 490)
    public static final int[][] method3046(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, boolean arg7, int arg8) {
        ++field7361;
        int[][] var9 = new int[arg5][arg1];
        class230 var10 = new class230();
        var10.field2682 = (int) (arg6 * 4096.0F);
        var10.field2677 = arg7;
        var10.field2681 = arg3;
        if (arg0 > -83) {
            return null;
        } else {
            var10.field2693 = arg2;
            var10.field2674 = arg8;
            var10.method87((byte) 66);
            class341.method2025(arg1, arg5, (byte) 95);
            for (int var11 = 0; ~arg5 < ~var11; ++var11) {
                var10.method1335(var11, (byte) -103, var9[var11]);
            }
            return var9;
        }
    }

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "(BI)[I", line = 524)
    public final int[] method13(byte arg0, int arg1) {
        ++field7373;
        int[] var3 = super.field9114.method1858(100, arg1);
        if (arg0 > -55) {
            this.method13((byte) -92, 9);
        }
        if (super.field9114.field3897) {
            int var4 = this.field7376 + this.field7376 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field7366 + 1 + this.field7366;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field7376 + arg1; arg1 - -this.field7376 >= var9; ++var9) {
                int[] var13 = this.method3641(var9 & class312.field3870, 20604, 0);
                int[] var14 = new int[class635.field9139];
                int var15 = 0;
                for (int var16 = -this.field7366; var16 <= this.field7366; ++var16) {
                    var15 += var13[var16 & class110.field1162];
                }
                int var17 = 0;
                while (class635.field9139 > var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field7366 + var17 & class110.field1162];
                    ++var17;
                    var15 = var13[class110.field1162 & this.field7366 + var17] + var18;
                }
                var8[-arg1 + var9 - -this.field7376] = var14;
            }
            for (int var10 = 0; ~class635.field9139 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(IIIIIIII)V", line = 617)
    public static final void method3047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field7362;
        if (arg6 != -1) {
            method3042((class179) null, -87);
        }
        if (~class338.field4355 >= ~arg0 && arg1 <= class744.field10385 && ~class224.field2571 >= ~arg5 && class578.field8182 >= arg3) {
            class687.method3888(arg0, arg5, arg2, arg1, arg4, (byte) -98, arg7, arg3);
        } else {
            class126.method806(arg2, arg5, arg4, arg1, arg0, arg3, arg7, 25);
        }
    }
}
