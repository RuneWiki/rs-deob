import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class82 {

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "Loh;")
    public static class258 field1382 = class153.method1046("settings=", 93);

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "[[[Lmi;")
    public static class12[][][] field1386 = new class12[4][104][104];

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "[[[I")
    public static int[][][] field1385 = new int[2][][];

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Loh;")
    public static class258 field1388 = class153.method1046("Hierhin gehen", 118);

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "Ljava/awt/Font;")
    public static Font field1390;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "[Ldb;")
    public static class41[] field1384;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZI)I", line = 9)
    public static final int method594(boolean arg0, int arg1) {
        field1387++;
        return arg0 ? arg1 >> 18 & 0x7 : 9;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 24)
    public static void method595(int arg0) {
        field1384 = null;
        field1385 = (int[][][]) null;
        field1382 = null;
        if (arg0 >= -74) {
            method597(43, true);
        }
        field1390 = null;
        field1388 = null;
        field1386 = (class12[][][]) null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V", line = 46)
    public static final void method596(int arg0, int arg1) {
        if (arg1 >= -87) {
            method595(-54);
        }
        class176.field3163 = arg0;
        field1389++;
        class299.field5122 = -1;
        class299.field5122 = -1;
        class178.method1222(false);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)V", line = 69)
    public static final void method597(int arg0, boolean arg1) {
        if (arg0 != 6) {
            return;
        }
        for (class124 var2 = (class124) class140.field2387.method83(-106); var2 != null; var2 = (class124) class140.field2387.method87((byte) -80)) {
            if (var2.field2193 != null) {
                class184.field3279.method112(var2.field2193);
                var2.field2193 = null;
            }
            if (var2.field2213 != null) {
                class184.field3279.method112(var2.field2213);
                var2.field2213 = null;
            }
            var2.method1054((byte) 112);
        }
        field1383++;
        if (!arg1) {
            return;
        }
        for (class124 var3 = (class124) class281.field4821.method83(-59); var3 != null; var3 = (class124) class281.field4821.method87((byte) -80)) {
            if (var3.field2193 != null) {
                class184.field3279.method112(var3.field2193);
                var3.field2193 = null;
            }
            var3.method1054((byte) 86);
        }
        for (class124 var4 = (class124) class205.field3542.method985(126); var4 != null; var4 = (class124) class205.field3542.method983(arg0 - 7)) {
            if (var4.field2193 != null) {
                class184.field3279.method112(var4.field2193);
                var4.field2193 = null;
            }
            var4.method1054((byte) 113);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lgd;II[[FI[[FIII[[FII[[IZBB)V", line = 142)
    public static final void method598(class157 arg0, int arg1, int arg2, float[][] arg3, int arg4, float[][] arg5, int arg6, int arg7, int arg8, float[][] arg9, int arg10, int arg11, int[][] arg12, boolean arg13, byte arg14, byte arg15) {
        field1391++;
        int[] var16 = null;
        if (arg6 <= 95) {
            method596(19, 114);
        }
        int[] var17 = class171.field3047[arg14];
        int var18 = (arg10 << 8) + 255;
        int var19 = (arg1 << 8) + 255;
        int var20 = (arg11 << 8) + 255;
        int var21 = (arg2 << 8) + 255;
        int[] var22 = new int[var17.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class147.method1016(false, var21, var20, arg8, arg15, arg12, var17[var23 + var23], arg5, arg3, 2, var18, (int[][]) null, var17[var23 + var23 + 1], arg4, arg0, var19, 0.0F, arg9);
        }
        if (arg13) {
            if (arg14 == 1) {
                var16 = new int[6];
                int var42 = class147.method1016(true, var21, var20, arg8, arg15, arg12, 64, arg5, arg3, 2, var18, (int[][]) null, 128, arg4, arg0, var19, 0.0F, arg9);
                int var43 = class147.method1016(true, var21, var20, arg8, arg15, arg12, 128, arg5, arg3, 2, var18, (int[][]) null, 64, arg4, arg0, var19, 0.0F, arg9);
                var16[0] = var43;
                var16[3] = var42;
                var16[1] = var42;
                var16[4] = var22[0];
                var16[2] = var22[2];
                var16[5] = var22[2];
            } else if (arg14 == 2) {
                var16 = new int[6];
                int var40 = class147.method1016(true, var21, var20, arg8, arg15, arg12, 128, arg5, arg3, 2, var18, (int[][]) null, 128, arg4, arg0, var19, 0.0F, arg9);
                int var41 = class147.method1016(true, var21, var20, arg8, arg15, arg12, 64, arg5, arg3, 2, var18, (int[][]) null, 0, arg4, arg0, var19, 0.0F, arg9);
                var16[2] = var40;
                var16[3] = var40;
                var16[0] = var22[0];
                var16[5] = var22[0];
                var16[1] = var41;
                var16[4] = var22[1];
            } else if (arg14 == 3) {
                var16 = new int[6];
                int var38 = class147.method1016(true, var21, var20, arg8, arg15, arg12, 0, arg5, arg3, 2, var18, (int[][]) null, 128, arg4, arg0, var19, 0.0F, arg9);
                int var39 = class147.method1016(true, var21, var20, arg8, arg15, arg12, 64, arg5, arg3, 2, var18, (int[][]) null, 0, arg4, arg0, var19, 0.0F, arg9);
                var16[4] = var39;
                var16[3] = var38;
                var16[1] = var22[1];
                var16[0] = var22[2];
                var16[2] = var38;
                var16[5] = var22[2];
            } else if (arg14 == 4) {
                var16 = new int[3];
                int var25 = class147.method1016(true, var21, var20, arg8, arg15, arg12, 0, arg5, arg3, 2, var18, (int[][]) null, 128, arg4, arg0, var19, 0.0F, arg9);
                var16[0] = var22[3];
                var16[1] = var25;
                var16[2] = var22[0];
            } else if (arg14 == 5) {
                var16 = new int[3];
                int var26 = class147.method1016(true, var21, var20, arg8, arg15, arg12, 128, arg5, arg3, 2, var18, (int[][]) null, 128, arg4, arg0, var19, 0.0F, arg9);
                var16[0] = var22[2];
                var16[2] = var22[3];
                var16[1] = var26;
            } else if (arg14 == 6) {
                var16 = new int[6];
                int var27 = class147.method1016(true, var21, var20, arg8, arg15, arg12, 128, arg5, arg3, 2, var18, (int[][]) null, 0, arg4, arg0, var19, 0.0F, arg9);
                int var28 = class147.method1016(true, var21, var20, arg8, arg15, arg12, 128, arg5, arg3, 2, var18, (int[][]) null, 128, arg4, arg0, var19, 0.0F, arg9);
                var16[1] = var27;
                var16[0] = var22[3];
                var16[3] = var28;
                var16[5] = var22[3];
                var16[4] = var22[0];
                var16[2] = var28;
            } else if (arg14 == 7) {
                var16 = new int[6];
                int var36 = class147.method1016(true, var21, var20, arg8, arg15, arg12, 0, arg5, arg3, 2, var18, (int[][]) null, 128, arg4, arg0, var19, 0.0F, arg9);
                int var37 = class147.method1016(true, var21, var20, arg8, arg15, arg12, 128, arg5, arg3, 2, var18, (int[][]) null, 0, arg4, arg0, var19, 0.0F, arg9);
                var16[2] = var36;
                var16[0] = var22[1];
                var16[3] = var36;
                var16[4] = var22[2];
                var16[1] = var37;
                var16[5] = var22[1];
            } else if (arg14 == 8) {
                var16 = new int[3];
                int var29 = class147.method1016(true, var21, var20, arg8, arg15, arg12, 0, arg5, arg3, 2, var18, (int[][]) null, 0, arg4, arg0, var19, 0.0F, arg9);
                var16[0] = var22[3];
                var16[1] = var29;
                var16[2] = var22[4];
            } else if (arg14 == 9) {
                var16 = new int[15];
                int var30 = class147.method1016(true, var21, var20, arg8, arg15, arg12, 128, arg5, arg3, 2, var18, (int[][]) null, 64, arg4, arg0, var19, 0.0F, arg9);
                int var31 = class147.method1016(true, var21, var20, arg8, arg15, arg12, 96, arg5, arg3, 2, var18, (int[][]) null, 32, arg4, arg0, var19, 0.0F, arg9);
                int var32 = class147.method1016(true, var21, var20, arg8, arg15, arg12, 64, arg5, arg3, 2, var18, (int[][]) null, 0, arg4, arg0, var19, 0.0F, arg9);
                var16[3] = var31;
                var16[12] = var31;
                var16[14] = var32;
                var16[7] = var22[3];
                var16[6] = var31;
                var16[9] = var31;
                var16[5] = var22[3];
                var16[0] = var31;
                var16[2] = var22[4];
                var16[1] = var30;
                var16[10] = var22[2];
                var16[4] = var22[4];
                var16[11] = var22[1];
                var16[8] = var22[2];
                var16[13] = var22[1];
            } else if (arg14 == 10) {
                int var33 = class147.method1016(true, var21, var20, arg8, arg15, arg12, 0, arg5, arg3, 2, var18, (int[][]) null, 128, arg4, arg0, var19, 0.0F, arg9);
                var16 = new int[] { var22[2], var33, var22[3], var22[3], var33, var22[4], var22[4], var33, var22[0] };
            } else if (arg14 == 11) {
                int var34 = class147.method1016(true, var21, var20, arg8, arg15, arg12, 0, arg5, arg3, 2, var18, (int[][]) null, 64, arg4, arg0, var19, 0.0F, arg9);
                var16 = new int[12];
                int var35 = class147.method1016(true, var21, var20, arg8, arg15, arg12, 128, arg5, arg3, 2, var18, (int[][]) null, 64, arg4, arg0, var19, 0.0F, arg9);
                var16[8] = var34;
                var16[7] = var35;
                var16[0] = var22[3];
                var16[11] = var35;
                var16[5] = var34;
                var16[3] = var22[3];
                var16[1] = var34;
                var16[2] = var22[0];
                var16[9] = var22[2];
                var16[6] = var22[2];
                var16[10] = var22[1];
                var16[4] = var22[2];
            }
        }
        arg0.method1068(arg7, arg8, arg4, var22, var16, false);
    }
}
