import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class309 extends class165 {

    @OriginalMember(owner = "client!te", name = "S", descriptor = "[I")
    public static int[] field4826 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public int field4797;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public int field4798;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public int field4800;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public int field4801;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public int field4803;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public int field4805;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public int field4807;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public int field4808;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public int field4813;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public int field4815;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public int field4817;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public int field4818;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "I")
    public int field4820;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "I")
    public int field4821;

    @OriginalMember(owner = "client!te", name = "O", descriptor = "I")
    public int field4822;

    @OriginalMember(owner = "client!te", name = "P", descriptor = "I")
    public int field4823;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    public int field4825;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "Lom;")
    public class125 field4809;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "Lak;")
    public static class172 field4806;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "Lfb;")
    public class198 field4816;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "Lfe;")
    public class272 field4802;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "Ldd;")
    public class42 field4812;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "[I")
    public static int[] field4804;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "[I")
    public static int[] field4810;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "[[[I")
    public static int[][][] field4799;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V", line = 22)
    public static void method2184(int arg0) {
        field4826 = null;
        field4810 = null;
        if (arg0 <= 107) {
            method2186((float[][]) ((float[][]) null), (float[][]) ((float[][]) null), -53, true, (class206) null, -14, 16, 7, (byte) -27, (int[][]) ((int[][]) null), (byte) 40, (byte) 103, -3, 91, 6, (float[][]) ((float[][]) null));
        }
        field4804 = null;
        field4799 = (int[][][]) null;
        field4806 = null;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V", line = 50)
    public final void method2185(byte arg0) {
        if (arg0 != -1) {
            field4806 = (class172) null;
        }
        field4811++;
        this.field4802 = null;
        this.field4816 = null;
        this.field4812 = null;
        this.field4809 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([[F[[FIZLrc;IIIB[[IBBIII[[F)V", line = 73)
    public static final void method2186(float[][] arg0, float[][] arg1, int arg2, boolean arg3, class206 arg4, int arg5, int arg6, int arg7, byte arg8, int[][] arg9, byte arg10, byte arg11, int arg12, int arg13, int arg14, float[][] arg15) {
        int var16 = (arg6 << 8) + 255;
        if (arg10 >= -1) {
            return;
        }
        int var17 = (arg12 << 8) + 255;
        int[] var18 = class17.field233[arg8];
        int var19 = (arg14 << 8) + 255;
        int var20 = (arg7 << 8) + 255;
        int[] var21 = null;
        field4819++;
        int[] var22 = new int[var18.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class193.method1430(arg11, arg0, false, var19, var20, var18[var23 + var23 + 1], arg15, true, arg5, 0.0F, arg1, var17, arg9, (int[][]) null, var16, arg2, var18[var23 + var23], arg4);
        }
        if (arg3) {
            if (arg8 == 1) {
                var21 = new int[6];
                int var42 = class193.method1430(arg11, arg0, true, var19, var20, 128, arg15, true, arg5, 0.0F, arg1, var17, arg9, (int[][]) null, var16, arg2, 64, arg4);
                int var43 = class193.method1430(arg11, arg0, true, var19, var20, 64, arg15, true, arg5, 0.0F, arg1, var17, arg9, (int[][]) null, var16, arg2, 128, arg4);
                var21[0] = var43;
                var21[1] = var42;
                var21[3] = var42;
                var21[4] = var22[0];
                var21[2] = var22[2];
                var21[5] = var22[2];
            } else if (arg8 == 2) {
                var21 = new int[6];
                int var40 = class193.method1430(arg11, arg0, true, var19, var20, 128, arg15, true, arg5, 0.0F, arg1, var17, arg9, (int[][]) null, var16, arg2, 128, arg4);
                int var41 = class193.method1430(arg11, arg0, true, var19, var20, 0, arg15, true, arg5, 0.0F, arg1, var17, arg9, (int[][]) null, var16, arg2, 64, arg4);
                var21[0] = var22[0];
                var21[1] = var41;
                var21[5] = var22[0];
                var21[4] = var22[1];
                var21[2] = var40;
                var21[3] = var40;
            } else if (arg8 == 3) {
                int var25 = class193.method1430(arg11, arg0, true, var19, var20, 128, arg15, true, arg5, 0.0F, arg1, var17, arg9, (int[][]) null, var16, arg2, 0, arg4);
                var21 = new int[6];
                int var26 = class193.method1430(arg11, arg0, true, var19, var20, 0, arg15, true, arg5, 0.0F, arg1, var17, arg9, (int[][]) null, var16, arg2, 64, arg4);
                var21[1] = var22[1];
                var21[4] = var26;
                var21[3] = var25;
                var21[0] = var22[2];
                var21[2] = var25;
                var21[5] = var22[2];
            } else if (arg8 == 4) {
                var21 = new int[3];
                int var27 = class193.method1430(arg11, arg0, true, var19, var20, 128, arg15, true, arg5, 0.0F, arg1, var17, arg9, (int[][]) null, var16, arg2, 0, arg4);
                var21[1] = var27;
                var21[0] = var22[3];
                var21[2] = var22[0];
            } else if (arg8 == 5) {
                var21 = new int[3];
                int var39 = class193.method1430(arg11, arg0, true, var19, var20, 128, arg15, true, arg5, 0.0F, arg1, var17, arg9, (int[][]) null, var16, arg2, 128, arg4);
                var21[1] = var39;
                var21[0] = var22[2];
                var21[2] = var22[3];
            } else if (arg8 == 6) {
                int var37 = class193.method1430(arg11, arg0, true, var19, var20, 0, arg15, true, arg5, 0.0F, arg1, var17, arg9, (int[][]) null, var16, arg2, 128, arg4);
                int var38 = class193.method1430(arg11, arg0, true, var19, var20, 128, arg15, true, arg5, 0.0F, arg1, var17, arg9, (int[][]) null, var16, arg2, 128, arg4);
                var21 = new int[] { var22[3], var37, var38, var38, var22[0], var22[3] };
            } else if (arg8 == 7) {
                var21 = new int[6];
                int var28 = class193.method1430(arg11, arg0, true, var19, var20, 128, arg15, true, arg5, 0.0F, arg1, var17, arg9, (int[][]) null, var16, arg2, 0, arg4);
                int var29 = class193.method1430(arg11, arg0, true, var19, var20, 0, arg15, true, arg5, 0.0F, arg1, var17, arg9, (int[][]) null, var16, arg2, 128, arg4);
                var21[0] = var22[1];
                var21[1] = var29;
                var21[5] = var22[1];
                var21[2] = var28;
                var21[4] = var22[2];
                var21[3] = var28;
            } else if (arg8 == 8) {
                var21 = new int[3];
                int var36 = class193.method1430(arg11, arg0, true, var19, var20, 0, arg15, true, arg5, 0.0F, arg1, var17, arg9, (int[][]) null, var16, arg2, 0, arg4);
                var21[0] = var22[3];
                var21[2] = var22[4];
                var21[1] = var36;
            } else if (arg8 == 9) {
                int var33 = class193.method1430(arg11, arg0, true, var19, var20, 64, arg15, true, arg5, 0.0F, arg1, var17, arg9, (int[][]) null, var16, arg2, 128, arg4);
                var21 = new int[15];
                int var34 = class193.method1430(arg11, arg0, true, var19, var20, 32, arg15, true, arg5, 0.0F, arg1, var17, arg9, (int[][]) null, var16, arg2, 96, arg4);
                int var35 = class193.method1430(arg11, arg0, true, var19, var20, 0, arg15, true, arg5, 0.0F, arg1, var17, arg9, (int[][]) null, var16, arg2, 64, arg4);
                var21[0] = var34;
                var21[14] = var35;
                var21[2] = var22[4];
                var21[9] = var34;
                var21[10] = var22[2];
                var21[12] = var34;
                var21[4] = var22[4];
                var21[3] = var34;
                var21[1] = var33;
                var21[11] = var22[1];
                var21[13] = var22[1];
                var21[7] = var22[3];
                var21[6] = var34;
                var21[8] = var22[2];
                var21[5] = var22[3];
            } else if (arg8 == 10) {
                var21 = new int[9];
                int var32 = class193.method1430(arg11, arg0, true, var19, var20, 128, arg15, true, arg5, 0.0F, arg1, var17, arg9, (int[][]) null, var16, arg2, 0, arg4);
                var21[7] = var32;
                var21[4] = var32;
                var21[0] = var22[2];
                var21[6] = var22[4];
                var21[1] = var32;
                var21[5] = var22[4];
                var21[2] = var22[3];
                var21[3] = var22[3];
                var21[8] = var22[0];
            } else if (arg8 == 11) {
                var21 = new int[12];
                int var30 = class193.method1430(arg11, arg0, true, var19, var20, 64, arg15, true, arg5, 0.0F, arg1, var17, arg9, (int[][]) null, var16, arg2, 0, arg4);
                int var31 = class193.method1430(arg11, arg0, true, var19, var20, 64, arg15, true, arg5, 0.0F, arg1, var17, arg9, (int[][]) null, var16, arg2, 128, arg4);
                var21[7] = var31;
                var21[0] = var22[3];
                var21[5] = var30;
                var21[1] = var30;
                var21[3] = var22[3];
                var21[10] = var22[1];
                var21[2] = var22[0];
                var21[4] = var22[2];
                var21[11] = var31;
                var21[8] = var30;
                var21[6] = var22[2];
                var21[9] = var22[2];
            }
        }
        arg4.method1497(arg13, arg5, arg2, var22, var21, false);
    }
}
