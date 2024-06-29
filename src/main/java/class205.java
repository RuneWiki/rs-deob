import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class205 {

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field3718 = 0;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field3720 = -1;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "[[S")
    public static short[][] field3722 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public int field3715;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public int field3723;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III[[FII[[FI[[IBI[[FBBLgf;Z)V", line = 6)
    public static final void method1453(int arg0, int arg1, int arg2, float[][] arg3, int arg4, int arg5, float[][] arg6, int arg7, int[][] arg8, byte arg9, int arg10, float[][] arg11, byte arg12, byte arg13, class113 arg14, boolean arg15) {
        if (arg9 <= 87) {
            method1456(-88, -117, 107);
        }
        int var16 = (arg1 << 8) + 255;
        field3724++;
        int var17 = (arg4 << 8) + 255;
        int var18 = (arg2 << 8) + 255;
        int var19 = (arg0 << 8) + 255;
        int[] var20 = class145.field2567[arg12];
        int[] var21 = null;
        int[] var22 = new int[var20.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class284.method1987(0.0F, var19, arg8, var18, arg13, arg6, arg11, (byte) 80, arg3, var16, false, (int[][]) null, arg5, arg14, arg7, var20[var23 + var23 + 1], var20[var23 + var23], var17);
        }
        if (arg15) {
            if (arg12 == 1) {
                var21 = new int[6];
                int var42 = class284.method1987(0.0F, var19, arg8, var18, arg13, arg6, arg11, (byte) 15, arg3, var16, true, (int[][]) null, arg5, arg14, arg7, 128, 64, var17);
                int var43 = class284.method1987(0.0F, var19, arg8, var18, arg13, arg6, arg11, (byte) 79, arg3, var16, true, (int[][]) null, arg5, arg14, arg7, 64, 128, var17);
                var21[1] = var42;
                var21[2] = var22[2];
                var21[5] = var22[2];
                var21[0] = var43;
                var21[4] = var22[0];
                var21[3] = var42;
            } else if (arg12 == 2) {
                var21 = new int[6];
                int var40 = class284.method1987(0.0F, var19, arg8, var18, arg13, arg6, arg11, (byte) -113, arg3, var16, true, (int[][]) null, arg5, arg14, arg7, 128, 128, var17);
                int var41 = class284.method1987(0.0F, var19, arg8, var18, arg13, arg6, arg11, (byte) 114, arg3, var16, true, (int[][]) null, arg5, arg14, arg7, 0, 64, var17);
                var21[2] = var40;
                var21[3] = var40;
                var21[0] = var22[0];
                var21[5] = var22[0];
                var21[1] = var41;
                var21[4] = var22[1];
            } else if (arg12 == 3) {
                var21 = new int[6];
                int var38 = class284.method1987(0.0F, var19, arg8, var18, arg13, arg6, arg11, (byte) -123, arg3, var16, true, (int[][]) null, arg5, arg14, arg7, 128, 0, var17);
                int var39 = class284.method1987(0.0F, var19, arg8, var18, arg13, arg6, arg11, (byte) 90, arg3, var16, true, (int[][]) null, arg5, arg14, arg7, 0, 64, var17);
                var21[4] = var39;
                var21[0] = var22[2];
                var21[2] = var38;
                var21[5] = var22[2];
                var21[3] = var38;
                var21[1] = var22[1];
            } else if (arg12 == 4) {
                var21 = new int[3];
                int var25 = class284.method1987(0.0F, var19, arg8, var18, arg13, arg6, arg11, (byte) 115, arg3, var16, true, (int[][]) null, arg5, arg14, arg7, 128, 0, var17);
                var21[1] = var25;
                var21[0] = var22[3];
                var21[2] = var22[0];
            } else if (arg12 == 5) {
                int var26 = class284.method1987(0.0F, var19, arg8, var18, arg13, arg6, arg11, (byte) 104, arg3, var16, true, (int[][]) null, arg5, arg14, arg7, 128, 128, var17);
                var21 = new int[] { var22[2], var26, var22[3] };
            } else if (arg12 == 6) {
                var21 = new int[6];
                int var27 = class284.method1987(0.0F, var19, arg8, var18, arg13, arg6, arg11, (byte) -120, arg3, var16, true, (int[][]) null, arg5, arg14, arg7, 0, 128, var17);
                int var28 = class284.method1987(0.0F, var19, arg8, var18, arg13, arg6, arg11, (byte) -124, arg3, var16, true, (int[][]) null, arg5, arg14, arg7, 128, 128, var17);
                var21[2] = var28;
                var21[1] = var27;
                var21[0] = var22[3];
                var21[3] = var28;
                var21[4] = var22[0];
                var21[5] = var22[3];
            } else if (arg12 == 7) {
                var21 = new int[6];
                int var36 = class284.method1987(0.0F, var19, arg8, var18, arg13, arg6, arg11, (byte) 44, arg3, var16, true, (int[][]) null, arg5, arg14, arg7, 128, 0, var17);
                int var37 = class284.method1987(0.0F, var19, arg8, var18, arg13, arg6, arg11, (byte) 120, arg3, var16, true, (int[][]) null, arg5, arg14, arg7, 0, 128, var17);
                var21[0] = var22[1];
                var21[2] = var36;
                var21[4] = var22[2];
                var21[3] = var36;
                var21[1] = var37;
                var21[5] = var22[1];
            } else if (arg12 == 8) {
                var21 = new int[3];
                int var29 = class284.method1987(0.0F, var19, arg8, var18, arg13, arg6, arg11, (byte) 72, arg3, var16, true, (int[][]) null, arg5, arg14, arg7, 0, 0, var17);
                var21[1] = var29;
                var21[0] = var22[3];
                var21[2] = var22[4];
            } else if (arg12 == 9) {
                var21 = new int[15];
                int var30 = class284.method1987(0.0F, var19, arg8, var18, arg13, arg6, arg11, (byte) -120, arg3, var16, true, (int[][]) null, arg5, arg14, arg7, 64, 128, var17);
                int var31 = class284.method1987(0.0F, var19, arg8, var18, arg13, arg6, arg11, (byte) 124, arg3, var16, true, (int[][]) null, arg5, arg14, arg7, 32, 96, var17);
                int var32 = class284.method1987(0.0F, var19, arg8, var18, arg13, arg6, arg11, (byte) -115, arg3, var16, true, (int[][]) null, arg5, arg14, arg7, 0, 64, var17);
                var21[6] = var31;
                var21[1] = var30;
                var21[9] = var31;
                var21[3] = var31;
                var21[14] = var32;
                var21[11] = var22[1];
                var21[7] = var22[3];
                var21[0] = var31;
                var21[5] = var22[3];
                var21[13] = var22[1];
                var21[12] = var31;
                var21[2] = var22[4];
                var21[8] = var22[2];
                var21[10] = var22[2];
                var21[4] = var22[4];
            } else if (arg12 == 10) {
                var21 = new int[9];
                int var33 = class284.method1987(0.0F, var19, arg8, var18, arg13, arg6, arg11, (byte) -123, arg3, var16, true, (int[][]) null, arg5, arg14, arg7, 128, 0, var17);
                var21[7] = var33;
                var21[4] = var33;
                var21[5] = var22[4];
                var21[0] = var22[2];
                var21[8] = var22[0];
                var21[6] = var22[4];
                var21[1] = var33;
                var21[2] = var22[3];
                var21[3] = var22[3];
            } else if (arg12 == 11) {
                var21 = new int[12];
                int var34 = class284.method1987(0.0F, var19, arg8, var18, arg13, arg6, arg11, (byte) -128, arg3, var16, true, (int[][]) null, arg5, arg14, arg7, 64, 0, var17);
                int var35 = class284.method1987(0.0F, var19, arg8, var18, arg13, arg6, arg11, (byte) 23, arg3, var16, true, (int[][]) null, arg5, arg14, arg7, 64, 128, var17);
                var21[7] = var35;
                var21[11] = var35;
                var21[1] = var34;
                var21[5] = var34;
                var21[8] = var34;
                var21[0] = var22[3];
                var21[2] = var22[0];
                var21[4] = var22[2];
                var21[3] = var22[3];
                var21[6] = var22[2];
                var21[9] = var22[2];
                var21[10] = var22[1];
            }
        }
        arg14.method777(arg10, arg7, arg5, var22, var21, false);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)V", line = 278)
    public static final void method1454(int arg0, int arg1, int arg2) {
        field3717++;
        class77 var3 = class156.method1158(arg1, false, arg2);
        var3.method584(22992);
        var3.field1455 = arg0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V", line = 289)
    public static void method1455(byte arg0) {
        if (arg0 != -87) {
            method1453(-115, 19, -34, (float[][]) ((float[][]) null), -21, 30, (float[][]) ((float[][]) null), 120, (int[][]) ((int[][]) null), (byte) -60, -21, (float[][]) ((float[][]) null), (byte) 95, (byte) 33, (class113) null, true);
        }
        field3722 = (short[][]) null;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(III)Lka;", line = 301)
    public static final class197 method1456(int arg0, int arg1, int arg2) {
        class271 var3 = class41.field790[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4639;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "()V", line = 345)
    public static final void method1457() {
        if (class114.field2015 != null) {
            for (int var0 = 0; var0 < class114.field2015.length; var0++) {
                for (int var1 = 0; var1 < class129.field2264; var1++) {
                    for (int var2 = 0; var2 < class57.field1051; var2++) {
                        class114.field2015[var0][var1][var2] = null;
                    }
                }
            }
        }
        class86.field1565 = (class113[][]) null;
        if (class1.field4 != null) {
            for (int var3 = 0; var3 < class1.field4.length; var3++) {
                for (int var4 = 0; var4 < class129.field2264; var4++) {
                    for (int var5 = 0; var5 < class57.field1051; var5++) {
                        class1.field4[var3][var4][var5] = null;
                    }
                }
            }
        }
        class237.field4041 = (class113[][]) null;
        class112.field1955 = 0;
        if (class143.field2502 != null) {
            for (int var6 = 0; var6 < class112.field1955; var6++) {
                class143.field2502[var6] = null;
            }
        }
        if (class174.field3091 != null) {
            for (int var7 = 0; var7 < class243.field4127; var7++) {
                class174.field3091[var7] = null;
            }
            class243.field4127 = 0;
        }
        if (class134.field2332 != null) {
            for (int var8 = 0; var8 < class134.field2332.length; var8++) {
                class134.field2332[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I[III[Ljava/lang/Object;)V", line = 450)
    public static final void method1458(int arg0, int[] arg1, int arg2, int arg3, Object[] arg4) {
        if (arg0 != 1) {
            return;
        }
        field3714++;
        if (arg2 <= arg3) {
            return;
        }
        int var5 = (arg2 + arg3) / 2;
        int var6 = arg1[var5];
        arg1[var5] = arg1[arg2];
        arg1[arg2] = var6;
        Object var7 = arg4[var5];
        arg4[var5] = arg4[arg2];
        int var8 = arg3;
        arg4[arg2] = var7;
        for (int var9 = arg3; var9 < arg2; var9++) {
            if (((var9 & 0x1) + var6) > arg1[var9]) {
                int var10 = arg1[var9];
                arg1[var9] = arg1[var8];
                arg1[var8] = var10;
                Object var11 = arg4[var9];
                arg4[var9] = arg4[var8];
                arg4[var8++] = var11;
            }
        }
        arg1[arg2] = arg1[var8];
        arg1[var8] = var6;
        arg4[arg2] = arg4[var8];
        arg4[var8] = var7;
        method1458(1, arg1, var8 - 1, arg3, arg4);
        method1458(1, arg1, arg2, var8 + 1, arg4);
    }
}
