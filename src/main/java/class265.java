import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class265 extends class219 {

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "I")
    private int field4418 = 0;

    @OriginalMember(owner = "client!rl", name = "W", descriptor = "I")
    private int field4421 = 4096;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "I")
    public static int field4412 = -1;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "I")
    public static int field4414 = 0;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!rl", name = "U", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!rl", name = "V", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "[S")
    public static short[] field4410;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lbd;I)V", line = 15)
    public static final void method1813(class162 arg0, int arg1) {
        field4409++;
        if (arg1 != 0) {
            method1817((float[][]) ((float[][]) null), 37, (float[][]) ((float[][]) null), -116, true, (float[][]) ((float[][]) null), 97, 123, -2, 60, true, (class26) null, -94, 17, -117, (int[][]) ((int[][]) null), 0.3472344F, (int[][]) ((int[][]) null));
        }
        for (class177 var2 = (class177) class50.field800.method169(66); var2 != null; var2 = (class177) class50.field800.method165((byte) -101)) {
            if (var2.field3028.method1248(arg0, (byte) 121)) {
                class180.field3101 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([J[Ljava/lang/Object;I)V", line = 40)
    public static final void method1814(long[] arg0, Object[] arg1, int arg2) {
        class162.method1274(arg0.length - 1, arg0, arg2, -1, arg1);
        field4419++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lbd;IZ)V", line = 49)
    public static final void method1815(class162 arg0, int arg1, boolean arg2) {
        field4415++;
        class63 var3 = class46.method332(2, arg1, -12770);
        var3.method430(arg2);
        var3.field987 = arg0;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILda;BI)Ldc;", line = 61)
    public static final class71 method1816(int arg0, class143 arg1, byte arg2, int arg3) {
        if (arg2 == 52) {
            field4408++;
            return class94.method757(arg1, arg0, -1908303920, arg3) ? class115.method909((byte) -3) : null;
        } else {
            return (class71) null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)[[I", line = 83)
    public final int[][] method219(int arg0, byte arg1) {
        field4416++;
        int[][] var3 = this.field3651.method406(false, arg0);
        if (this.field3651.field917) {
            int[][] var4 = this.method1583(arg0, true, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class128.field2326; var11++) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 < this.field4418) {
                    var8[var11] = this.field4418;
                } else if (this.field4421 >= var12) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field4421;
                }
                if (var13 < this.field4418) {
                    var9[var11] = this.field4418;
                } else if (var13 <= this.field4421) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field4421;
                }
                if (var14 < this.field4418) {
                    var10[var11] = this.field4418;
                } else if (this.field4421 >= var14) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field4421;
                }
            }
        }
        if (arg1 != 83) {
            this.field4421 = -98;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([[FI[[FIZ[[FIIIIZLba;III[[IF[[I)I", line = 164)
    public static final int method1817(float[][] arg0, int arg1, float[][] arg2, int arg3, boolean arg4, float[][] arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, class26 arg11, int arg12, int arg13, int arg14, int[][] arg15, float arg16, int[][] arg17) {
        field4417++;
        if (arg1 == 1) {
            int var18 = arg7;
            arg7 = arg6;
            arg6 = 128 - var18;
        } else if (arg1 == 2) {
            arg7 = 128 - arg7;
            arg6 = 128 - arg6;
        } else if (arg1 == 3) {
            int var19 = arg7;
            arg7 = 128 - arg6;
            arg6 = var19;
        }
        if (arg4) {
            field4412 = -83;
        }
        float var20;
        float var21;
        int var22;
        float var23;
        if (arg7 == 0 && arg6 == 0) {
            var20 = arg0[arg9][arg13];
            var21 = arg5[arg9][arg13];
            var22 = arg8;
            var23 = arg2[arg9][arg13];
        } else if (arg7 == 128 && arg6 == 0) {
            var22 = arg3;
            var23 = arg2[arg9 + 1][arg13];
            var21 = arg5[arg9 + 1][arg13];
            var20 = arg0[arg9 + 1][arg13];
        } else if (arg7 == 128 && arg6 == 128) {
            var21 = arg5[arg9 + 1][arg13 + 1];
            var22 = arg14;
            var23 = arg2[arg9 + 1][arg13 + 1];
            var20 = arg0[arg9 + 1][arg13 + 1];
        } else if (arg7 == 0 && arg6 == 128) {
            var23 = arg2[arg9][arg13 + 1];
            var22 = arg12;
            var21 = arg5[arg9][arg13 + 1];
            var20 = arg0[arg9][arg13 + 1];
        } else {
            float var24 = arg0[arg9][arg13];
            float var25 = arg5[arg9][arg13];
            float var26 = (float) arg6 / 128.0F;
            float var27 = arg0[arg9][arg13 + 1];
            float var28 = (float) arg7 / 128.0F;
            float var29 = arg2[arg9][arg13];
            float var30 = arg2[arg9][arg13 + 1];
            float var31 = (arg0[arg9 + 1][arg13 + 1] - var27) * var28 + var27;
            float var32 = (arg2[arg9 + 1][arg13] - var29) * var28 + var29;
            float var33 = (arg2[arg9 + 1][arg13 + 1] - var30) * var28 + var30;
            float var34 = arg5[arg9][arg13 + 1];
            float var35 = (arg0[arg9 + 1][arg13] - var24) * var28 + var24;
            float var36 = (arg5[arg9 + 1][arg13] - var25) * var28 + var25;
            float var37 = (arg5[arg9 + 1][arg13 + 1] - var34) * var28 + var34;
            var21 = (var37 - var36) * var26 + var36;
            var23 = (var33 - var32) * var26 + var32;
            int var38 = class46.method334(arg3, arg8, -830811705, arg7);
            var20 = (var31 - var35) * var26 + var35;
            int var39 = class46.method334(arg14, arg12, -830811705, arg7);
            var22 = class46.method334(var39, var38, -830811705, arg6);
        }
        int var40 = (arg9 << 7) + arg7;
        int var41 = (arg13 << 7) + arg6;
        int var42 = class90.method680(arg9, arg13, arg7, arg6, arg17, -117);
        return arg11.method206(var40, var42, var41, var20, var23, var21, arg10 ? var22 & 0xFFFFFF00 : var22, arg15 == null ? 0.0F : (float) (var42 - class90.method680(arg9, arg13, arg7, arg6, arg15, -116)) / arg16);
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V", line = 274)
    public class265() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILb;)V", line = 292)
    public final void method42(int arg0, int arg1, class94 arg2) {
        field4420++;
        if (arg0 == 0) {
            this.field4418 = arg2.method761((byte) 108);
        } else if (arg0 == 1) {
            this.field4421 = arg2.method761((byte) 108);
        } else if (arg0 == 2) {
            this.field3647 = arg2.method756(915905888) == 1;
        }
        if (arg1 != 0) {
            field4412 = 105;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lbd;B)I", line = 349)
    public static final int method1818(class162 arg0, byte arg1) {
        field4411++;
        int var2 = 0;
        int var3 = 48 % ((arg1 - 5) / 61);
        while (var2 < class143.field2568.length) {
            if (class143.field2568[var2].method1282(arg0, 44)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZI)[I", line = 371)
    public final int[] method41(boolean arg0, int arg1) {
        if (!arg0) {
            return (int[]) null;
        }
        int[] var3 = this.field3654.method2032(3, arg1);
        if (this.field3654.field4967) {
            int[] var4 = this.method1585(0, arg1, -6606);
            for (int var5 = 0; var5 < class128.field2326; var5++) {
                int var6 = var4[var5];
                if (this.field4418 > var6) {
                    var3[var5] = this.field4418;
                } else if (var6 <= this.field4421) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field4421;
                }
            }
        }
        field4413++;
        return var3;
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V", line = 416)
    public static void method1819(int arg0) {
        field4410 = null;
        if (arg0 != 1) {
            method1815((class162) null, 29, false);
        }
    }
}
