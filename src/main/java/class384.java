import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class384 {

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "Llf;")
    public static class130 field5438 = new class130(new byte[5000]);

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field5440 = -2;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5442 = null;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "[I")
    public static int[] field5441 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "[Lrg;")
    public static class385[] field5443 = new class385[14];

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field5439 = 0;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field5434;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public static final void method2440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5437++;
        class215.method1510(arg5, -11397);
        int var7 = 0;
        int var8 = arg5 - arg3;
        if (arg1 > -12) {
            return;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (class245.field3659 <= arg0 && arg0 <= class240.field3547) {
            int[] var15 = class440.field6288[arg0];
            int var16 = class209.method1485(class231.field3415, 1667, class408.field5789, arg6 - arg5);
            int var17 = class209.method1485(class231.field3415, 1667, class408.field5789, arg5 + arg6);
            int var18 = class209.method1485(class231.field3415, 1667, class408.field5789, arg6 - var8);
            int var19 = class209.method1485(class231.field3415, 1667, class408.field5789, arg6 + var8);
            class5.method17(var15, var18, arg4, (byte) 66, var16);
            class5.method17(var15, var19, arg2, (byte) 110, var18);
            class5.method17(var15, var17, arg4, (byte) 101, var19);
        }
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class403.field5651[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg0 - var9;
                int var21 = arg0 + var9;
                if (class245.field3659 <= var21 && var20 <= class240.field3547) {
                    if (var8 > var9) {
                        int var22 = class403.field5651[var9];
                        int var23 = class209.method1485(class231.field3415, 1667, class408.field5789, arg6 + var7);
                        int var24 = class209.method1485(class231.field3415, 1667, class408.field5789, arg6 - var7);
                        int var25 = class209.method1485(class231.field3415, 1667, class408.field5789, arg6 + var22);
                        int var26 = class209.method1485(class231.field3415, 1667, class408.field5789, arg6 - var22);
                        if (class240.field3547 >= var21) {
                            int[] var27 = class440.field6288[var21];
                            class5.method17(var27, var26, arg4, (byte) 126, var24);
                            class5.method17(var27, var25, arg2, (byte) 79, var26);
                            class5.method17(var27, var23, arg4, (byte) 87, var25);
                        }
                        if (class245.field3659 <= var20) {
                            int[] var28 = class440.field6288[var20];
                            class5.method17(var28, var26, arg4, (byte) 124, var24);
                            class5.method17(var28, var25, arg2, (byte) 123, var26);
                            class5.method17(var28, var23, arg4, (byte) 104, var25);
                        }
                    } else {
                        int var29 = class209.method1485(class231.field3415, 1667, class408.field5789, arg6 + var7);
                        int var30 = class209.method1485(class231.field3415, 1667, class408.field5789, arg6 - var7);
                        if (var21 <= class240.field3547) {
                            class5.method17(class440.field6288[var21], var29, arg4, (byte) 124, var30);
                        }
                        if (var20 >= class245.field3659) {
                            class5.method17(class440.field6288[var20], var29, arg4, (byte) 73, var30);
                        }
                    }
                }
            }
            int var31 = arg0 - var7;
            int var32 = arg0 + var7;
            if (var32 >= class245.field3659 && class240.field3547 >= var31) {
                int var33 = arg6 + var9;
                int var34 = arg6 - var9;
                if (var33 >= class408.field5789 && var34 <= class231.field3415) {
                    int var35 = class209.method1485(class231.field3415, 1667, class408.field5789, var33);
                    int var36 = class209.method1485(class231.field3415, 1667, class408.field5789, var34);
                    if (var8 <= var7) {
                        if (class240.field3547 >= var32) {
                            class5.method17(class440.field6288[var32], var35, arg4, (byte) 65, var36);
                        }
                        if (var31 >= class245.field3659) {
                            class5.method17(class440.field6288[var31], var35, arg4, (byte) 87, var36);
                        }
                    } else {
                        int var37 = var11 >= var7 ? var11 : class403.field5651[var7];
                        int var38 = class209.method1485(class231.field3415, 1667, class408.field5789, arg6 + var37);
                        int var39 = class209.method1485(class231.field3415, 1667, class408.field5789, arg6 - var37);
                        if (var32 <= class240.field3547) {
                            int[] var40 = class440.field6288[var32];
                            class5.method17(var40, var39, arg4, (byte) 98, var36);
                            class5.method17(var40, var38, arg2, (byte) 124, var39);
                            class5.method17(var40, var35, arg4, (byte) 117, var38);
                        }
                        if (var31 >= class245.field3659) {
                            int[] var41 = class440.field6288[var31];
                            class5.method17(var41, var39, arg4, (byte) 117, var36);
                            class5.method17(var41, var38, arg2, (byte) 65, var39);
                            class5.method17(var41, var35, arg4, (byte) 99, var38);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 192)
    public static void method2441(int arg0) {
        field5443 = null;
        field5438 = null;
        int var1 = 103 % ((-arg0 - 33) / 52);
        field5442 = null;
        field5441 = null;
        field5434 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IJ)V", line = 207)
    public static final void method2442(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field5436++;
        if (arg0 >= -26) {
            field5442 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([IIIIZIII[IIILqr;III)I", line = 226)
    public static final int method2443(int[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10, class41 arg11, int arg12, int arg13, int arg14) {
        field5435++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class87.field1132[var15][var35] = 0;
                class399.field5612[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg9 == 1) {
            var16 = class131.method860((byte) 66, arg7, arg12, arg5, arg13, arg11, arg6, arg10, arg1, arg14, arg2);
        } else if (arg9 == 2) {
            var16 = class264.method1814((byte) 31, arg10, arg11, arg13, arg2, arg1, arg12, arg6, arg5, arg14, arg7);
        } else {
            var16 = class243.method1657(arg1, arg7, arg6, arg10, arg5, arg12, (byte) -128, arg2, arg13, arg14, arg11, arg9);
        }
        int var17 = arg14 - 64;
        int var18 = arg7 - 64;
        int var19 = class88.field1154;
        int var20 = class418.field6003;
        if (!var16) {
            if (!arg4) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg10 - var23; var24 <= arg10 + var23; var24++) {
                for (int var25 = arg1 - var23; var25 <= arg1 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class399.field5612[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg10) {
                            var28 = arg10 - var24;
                        } else if (var24 > arg10 + arg13 - 1) {
                            var28 = var24 + 1 - arg13 - arg10;
                        }
                        int var29 = 0;
                        if (arg1 > var25) {
                            var29 = arg1 - var25;
                        } else if ((arg1 + arg12 - 1) < var25) {
                            var29 = var25 + 1 - arg1 - arg12;
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var30 < var21 || var21 == var30 && class399.field5612[var26][var27] < var22) {
                            var19 = var24;
                            var20 = var25;
                            var21 = var30;
                            var22 = class399.field5612[var26][var27];
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg14 == var19 && arg7 == var20) {
            return 0;
        }
        class287.field4187[arg3] = var19;
        int var31 = arg3 + 1;
        class451.field6468[arg3] = var20;
        int var32;
        int var33 = var32 = class87.field1132[var19 - var17][var20 - var18];
        while (arg14 != var19 || arg7 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class287.field4187[var31] = var19;
                class451.field6468[var31++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class87.field1132[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var31-- > 0) {
            arg0[var34] = class287.field4187[var31];
            arg8[var34++] = class451.field6468[var31];
            if (arg0.length <= var34) {
                break;
            }
        }
        return var34;
    }
}
