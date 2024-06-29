import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class36 extends class172 {

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "[I")
    public static int[] field537 = new int[200];

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public static int field544 = -1;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public int field540;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public int field543;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "Lrn;")
    public static class18 field545;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field538;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)I", line = 15)
    public static final int method363(int arg0, int arg1) {
        field536++;
        if (arg1 != 1) {
            method367(12);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIBI)I", line = 26)
    public static final int method364(int arg0, int arg1, byte arg2, int arg3) {
        field542++;
        if (arg2 != 97) {
            field546 = -56;
        }
        if (arg0 == arg1) {
            return arg1;
        } else {
            int var4 = 128 - arg3;
            int var5 = ((arg0 & 0xFF00FF00) >>> 7) * arg3 + ((arg1 & 0xFF00FF00) >>> 7) * var4 & 0xFF00FF00;
            int var6 = (arg0 & 0xFF00FF) * arg3 + (arg1 & 0xFF00FF) * var4 & 0xFF00FF00;
            return (var6 >> 7) + var5;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([[FI[[F[[I[[FIIZIBBLmi;IIBI)V", line = 52)
    public static final void method365(float[][] arg0, int arg1, float[][] arg2, int[][] arg3, float[][] arg4, int arg5, int arg6, boolean arg7, int arg8, byte arg9, byte arg10, class125 arg11, int arg12, int arg13, byte arg14, int arg15) {
        int var16 = (arg1 << 8) + 255;
        int var17 = (arg5 << 8) + 255;
        field541++;
        int var18 = (arg15 << 8) + 255;
        int var19 = (arg6 << 8) + 255;
        int[] var20 = class263.field4091[arg10];
        int[] var21 = null;
        int[] var22 = new int[var20.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class146.method1216(arg14, (int[][]) null, var19, arg3, arg2, arg4, false, arg13, arg9 - 11385, var20[var23 - -var23 + 1], var16, arg8, var20[var23 + var23], arg0, var18, arg11, 0.0F, var17);
        }
        if (arg9 != 38) {
            return;
        }
        if (arg7) {
            if (arg10 == 1) {
                int var42 = class146.method1216(arg14, (int[][]) null, var19, arg3, arg2, arg4, true, arg13, -11347, 128, var16, arg8, 64, arg0, var18, arg11, 0.0F, var17);
                var21 = new int[6];
                int var43 = class146.method1216(arg14, (int[][]) null, var19, arg3, arg2, arg4, true, arg13, arg9 ^ 0xFFFFD38B, 64, var16, arg8, 128, arg0, var18, arg11, 0.0F, var17);
                var21[0] = var43;
                var21[3] = var42;
                var21[1] = var42;
                var21[4] = var22[0];
                var21[2] = var22[2];
                var21[5] = var22[2];
            } else if (arg10 == 2) {
                var21 = new int[6];
                int var40 = class146.method1216(arg14, (int[][]) null, var19, arg3, arg2, arg4, true, arg13, -11347, 128, var16, arg8, 128, arg0, var18, arg11, 0.0F, var17);
                int var41 = class146.method1216(arg14, (int[][]) null, var19, arg3, arg2, arg4, true, arg13, -11347, 0, var16, arg8, 64, arg0, var18, arg11, 0.0F, var17);
                var21[3] = var40;
                var21[1] = var41;
                var21[2] = var40;
                var21[0] = var22[0];
                var21[4] = var22[1];
                var21[5] = var22[0];
            } else if (arg10 == 3) {
                var21 = new int[6];
                int var25 = class146.method1216(arg14, (int[][]) null, var19, arg3, arg2, arg4, true, arg13, -11347, 128, var16, arg8, 0, arg0, var18, arg11, 0.0F, var17);
                int var26 = class146.method1216(arg14, (int[][]) null, var19, arg3, arg2, arg4, true, arg13, arg9 - 11385, 0, var16, arg8, 64, arg0, var18, arg11, 0.0F, var17);
                var21[4] = var26;
                var21[1] = var22[1];
                var21[3] = var25;
                var21[0] = var22[2];
                var21[2] = var25;
                var21[5] = var22[2];
            } else if (arg10 == 4) {
                var21 = new int[3];
                int var39 = class146.method1216(arg14, (int[][]) null, var19, arg3, arg2, arg4, true, arg13, arg9 - 11385, 128, var16, arg8, 0, arg0, var18, arg11, 0.0F, var17);
                var21[0] = var22[3];
                var21[2] = var22[0];
                var21[1] = var39;
            } else if (arg10 == 5) {
                var21 = new int[3];
                int var38 = class146.method1216(arg14, (int[][]) null, var19, arg3, arg2, arg4, true, arg13, arg9 ^ 0xFFFFD38B, 128, var16, arg8, 128, arg0, var18, arg11, 0.0F, var17);
                var21[0] = var22[2];
                var21[2] = var22[3];
                var21[1] = var38;
            } else if (arg10 == 6) {
                var21 = new int[6];
                int var36 = class146.method1216(arg14, (int[][]) null, var19, arg3, arg2, arg4, true, arg13, -11347, 0, var16, arg8, 128, arg0, var18, arg11, 0.0F, var17);
                int var37 = class146.method1216(arg14, (int[][]) null, var19, arg3, arg2, arg4, true, arg13, -11347, 128, var16, arg8, 128, arg0, var18, arg11, 0.0F, var17);
                var21[1] = var36;
                var21[0] = var22[3];
                var21[2] = var37;
                var21[3] = var37;
                var21[4] = var22[0];
                var21[5] = var22[3];
            } else if (arg10 == 7) {
                var21 = new int[6];
                int var27 = class146.method1216(arg14, (int[][]) null, var19, arg3, arg2, arg4, true, arg13, -11347, 128, var16, arg8, 0, arg0, var18, arg11, 0.0F, var17);
                int var28 = class146.method1216(arg14, (int[][]) null, var19, arg3, arg2, arg4, true, arg13, -11347, 0, var16, arg8, 128, arg0, var18, arg11, 0.0F, var17);
                var21[3] = var27;
                var21[2] = var27;
                var21[0] = var22[1];
                var21[1] = var28;
                var21[4] = var22[2];
                var21[5] = var22[1];
            } else if (arg10 == 8) {
                var21 = new int[3];
                int var35 = class146.method1216(arg14, (int[][]) null, var19, arg3, arg2, arg4, true, arg13, arg9 - 11385, 0, var16, arg8, 0, arg0, var18, arg11, 0.0F, var17);
                var21[0] = var22[3];
                var21[2] = var22[4];
                var21[1] = var35;
            } else if (arg10 == 9) {
                var21 = new int[15];
                int var32 = class146.method1216(arg14, (int[][]) null, var19, arg3, arg2, arg4, true, arg13, arg9 ^ 0xFFFFD38B, 64, var16, arg8, 128, arg0, var18, arg11, 0.0F, var17);
                int var33 = class146.method1216(arg14, (int[][]) null, var19, arg3, arg2, arg4, true, arg13, -11347, 32, var16, arg8, 96, arg0, var18, arg11, 0.0F, var17);
                int var34 = class146.method1216(arg14, (int[][]) null, var19, arg3, arg2, arg4, true, arg13, -11347, 0, var16, arg8, 64, arg0, var18, arg11, 0.0F, var17);
                var21[12] = var33;
                var21[9] = var33;
                var21[0] = var33;
                var21[2] = var22[4];
                var21[4] = var22[4];
                var21[8] = var22[2];
                var21[3] = var33;
                var21[1] = var32;
                var21[5] = var22[3];
                var21[10] = var22[2];
                var21[7] = var22[3];
                var21[14] = var34;
                var21[6] = var33;
                var21[11] = var22[1];
                var21[13] = var22[1];
            } else if (arg10 == 10) {
                var21 = new int[9];
                int var29 = class146.method1216(arg14, (int[][]) null, var19, arg3, arg2, arg4, true, arg13, -11347, 128, var16, arg8, 0, arg0, var18, arg11, 0.0F, var17);
                var21[7] = var29;
                var21[0] = var22[2];
                var21[1] = var29;
                var21[4] = var29;
                var21[2] = var22[3];
                var21[6] = var22[4];
                var21[3] = var22[3];
                var21[5] = var22[4];
                var21[8] = var22[0];
            } else if (arg10 == 11) {
                int var30 = class146.method1216(arg14, (int[][]) null, var19, arg3, arg2, arg4, true, arg13, -11347, 64, var16, arg8, 0, arg0, var18, arg11, 0.0F, var17);
                var21 = new int[12];
                int var31 = class146.method1216(arg14, (int[][]) null, var19, arg3, arg2, arg4, true, arg13, -11347, 64, var16, arg8, 128, arg0, var18, arg11, 0.0F, var17);
                var21[0] = var22[3];
                var21[3] = var22[3];
                var21[7] = var31;
                var21[5] = var30;
                var21[11] = var31;
                var21[8] = var30;
                var21[2] = var22[0];
                var21[9] = var22[2];
                var21[1] = var30;
                var21[4] = var22[2];
                var21[6] = var22[2];
                var21[10] = var22[1];
            }
        }
        arg11.method1085(arg12, arg13, arg8, var22, var21, false);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)V", line = 327)
    public static final void method366(byte arg0, int arg1) {
        field539++;
        class224.field3496.method649((byte) 75, arg1);
        if (arg0 <= -40) {
            class63.field967.method649((byte) 75, arg1);
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V", line = 353)
    public static void method367(int arg0) {
        if (arg0 == 10018) {
            field545 = null;
            field537 = null;
            field538 = null;
        }
    }
}
