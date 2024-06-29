import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class66 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field1167 = -1;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field1174 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Lta;")
    public static class300 field1171 = new class300(64);

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "[I")
    public static int[] field1178 = new int[2500];

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "Len;")
    public static class192 field1176;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BII[[FZBI[[II[[FIIILua;B[[F)V", line = 9)
    public static final void method566(byte arg0, int arg1, int arg2, float[][] arg3, boolean arg4, byte arg5, int arg6, int[][] arg7, int arg8, float[][] arg9, int arg10, int arg11, int arg12, class299 arg13, byte arg14, float[][] arg15) {
        field1173++;
        if (arg5 != -100) {
            method567((byte) -13, -47);
        }
        int var16 = (arg10 << 8) + 255;
        int var17 = (arg2 << 8) + 255;
        int var18 = (arg6 << 8) + 255;
        int var19 = (arg11 << 8) + 255;
        int[] var20 = null;
        int[] var21 = class21.field242[arg14];
        int[] var22 = new int[var21.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class321.method2266(arg3, arg13, var16, (byte) -21, arg15, var18, arg9, var21[var23 + var23], arg12, var19, arg0, 0.0F, false, (int[][]) null, var21[var23 + var23 + 1], var17, arg1, arg7);
        }
        if (arg4) {
            if (arg14 == 1) {
                var20 = new int[6];
                int var25 = class321.method2266(arg3, arg13, var16, (byte) -21, arg15, var18, arg9, 64, arg12, var19, arg0, 0.0F, true, (int[][]) null, 128, var17, arg1, arg7);
                int var26 = class321.method2266(arg3, arg13, var16, (byte) -21, arg15, var18, arg9, 128, arg12, var19, arg0, 0.0F, true, (int[][]) null, 64, var17, arg1, arg7);
                var20[2] = var22[2];
                var20[5] = var22[2];
                var20[3] = var25;
                var20[0] = var26;
                var20[1] = var25;
                var20[4] = var22[0];
            } else if (arg14 == 2) {
                var20 = new int[6];
                int var27 = class321.method2266(arg3, arg13, var16, (byte) -21, arg15, var18, arg9, 128, arg12, var19, arg0, 0.0F, true, (int[][]) null, 128, var17, arg1, arg7);
                int var28 = class321.method2266(arg3, arg13, var16, (byte) -21, arg15, var18, arg9, 64, arg12, var19, arg0, 0.0F, true, (int[][]) null, 0, var17, arg1, arg7);
                var20[3] = var27;
                var20[0] = var22[0];
                var20[1] = var28;
                var20[5] = var22[0];
                var20[4] = var22[1];
                var20[2] = var27;
            } else if (arg14 == 3) {
                var20 = new int[6];
                int var42 = class321.method2266(arg3, arg13, var16, (byte) -21, arg15, var18, arg9, 0, arg12, var19, arg0, 0.0F, true, (int[][]) null, 128, var17, arg1, arg7);
                int var43 = class321.method2266(arg3, arg13, var16, (byte) -21, arg15, var18, arg9, 64, arg12, var19, arg0, 0.0F, true, (int[][]) null, 0, var17, arg1, arg7);
                var20[4] = var43;
                var20[0] = var22[2];
                var20[1] = var22[1];
                var20[2] = var42;
                var20[3] = var42;
                var20[5] = var22[2];
            } else if (arg14 == 4) {
                var20 = new int[3];
                int var29 = class321.method2266(arg3, arg13, var16, (byte) -21, arg15, var18, arg9, 0, arg12, var19, arg0, 0.0F, true, (int[][]) null, 128, var17, arg1, arg7);
                var20[0] = var22[3];
                var20[2] = var22[0];
                var20[1] = var29;
            } else if (arg14 == 5) {
                var20 = new int[3];
                int var30 = class321.method2266(arg3, arg13, var16, (byte) -21, arg15, var18, arg9, 128, arg12, var19, arg0, 0.0F, true, (int[][]) null, 128, var17, arg1, arg7);
                var20[0] = var22[2];
                var20[1] = var30;
                var20[2] = var22[3];
            } else if (arg14 == 6) {
                int var40 = class321.method2266(arg3, arg13, var16, (byte) -21, arg15, var18, arg9, 128, arg12, var19, arg0, 0.0F, true, (int[][]) null, 0, var17, arg1, arg7);
                int var41 = class321.method2266(arg3, arg13, var16, (byte) -21, arg15, var18, arg9, 128, arg12, var19, arg0, 0.0F, true, (int[][]) null, 128, var17, arg1, arg7);
                var20 = new int[] { var22[3], var40, var41, var41, var22[0], var22[3] };
            } else if (arg14 == 7) {
                var20 = new int[6];
                int var38 = class321.method2266(arg3, arg13, var16, (byte) -21, arg15, var18, arg9, 0, arg12, var19, arg0, 0.0F, true, (int[][]) null, 128, var17, arg1, arg7);
                int var39 = class321.method2266(arg3, arg13, var16, (byte) -21, arg15, var18, arg9, 128, arg12, var19, arg0, 0.0F, true, (int[][]) null, 0, var17, arg1, arg7);
                var20[3] = var38;
                var20[0] = var22[1];
                var20[1] = var39;
                var20[5] = var22[1];
                var20[2] = var38;
                var20[4] = var22[2];
            } else if (arg14 == 8) {
                var20 = new int[3];
                int var37 = class321.method2266(arg3, arg13, var16, (byte) -21, arg15, var18, arg9, 0, arg12, var19, arg0, 0.0F, true, (int[][]) null, 0, var17, arg1, arg7);
                var20[2] = var22[4];
                var20[0] = var22[3];
                var20[1] = var37;
            } else if (arg14 == 9) {
                var20 = new int[15];
                int var34 = class321.method2266(arg3, arg13, var16, (byte) -21, arg15, var18, arg9, 128, arg12, var19, arg0, 0.0F, true, (int[][]) null, 64, var17, arg1, arg7);
                int var35 = class321.method2266(arg3, arg13, var16, (byte) -21, arg15, var18, arg9, 96, arg12, var19, arg0, 0.0F, true, (int[][]) null, 32, var17, arg1, arg7);
                int var36 = class321.method2266(arg3, arg13, var16, (byte) -21, arg15, var18, arg9, 64, arg12, var19, arg0, 0.0F, true, (int[][]) null, 0, var17, arg1, arg7);
                var20[0] = var35;
                var20[1] = var34;
                var20[6] = var35;
                var20[11] = var22[1];
                var20[2] = var22[4];
                var20[12] = var35;
                var20[14] = var36;
                var20[9] = var35;
                var20[4] = var22[4];
                var20[13] = var22[1];
                var20[10] = var22[2];
                var20[8] = var22[2];
                var20[3] = var35;
                var20[7] = var22[3];
                var20[5] = var22[3];
            } else if (arg14 == 10) {
                var20 = new int[9];
                int var31 = class321.method2266(arg3, arg13, var16, (byte) -21, arg15, var18, arg9, 0, arg12, var19, arg0, 0.0F, true, (int[][]) null, 128, var17, arg1, arg7);
                var20[0] = var22[2];
                var20[8] = var22[0];
                var20[1] = var31;
                var20[7] = var31;
                var20[2] = var22[3];
                var20[3] = var22[3];
                var20[4] = var31;
                var20[5] = var22[4];
                var20[6] = var22[4];
            } else if (arg14 == 11) {
                var20 = new int[12];
                int var32 = class321.method2266(arg3, arg13, var16, (byte) -21, arg15, var18, arg9, 0, arg12, var19, arg0, 0.0F, true, (int[][]) null, 64, var17, arg1, arg7);
                int var33 = class321.method2266(arg3, arg13, var16, (byte) -21, arg15, var18, arg9, 128, arg12, var19, arg0, 0.0F, true, (int[][]) null, 64, var17, arg1, arg7);
                var20[7] = var33;
                var20[11] = var33;
                var20[0] = var22[3];
                var20[5] = var32;
                var20[2] = var22[0];
                var20[9] = var22[2];
                var20[4] = var22[2];
                var20[3] = var22[3];
                var20[1] = var32;
                var20[10] = var22[1];
                var20[6] = var22[2];
                var20[8] = var32;
            }
        }
        arg13.method2143(arg8, arg1, arg12, var22, var20, false);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)[B", line = 286)
    public static final byte[] method567(byte arg0, int arg1) {
        field1168++;
        class14 var2 = (class14) class16.field181.method2147((byte) -90, (long) arg1);
        if (arg0 != 44) {
            field1167 = 21;
        }
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class2.method4(var7, var4, -94);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class14(var3);
            class16.field181.method2149(var2, -32563, (long) arg1);
        }
        return var2.field150;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIIII)V", line = 340)
    public static final void method568(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1172++;
        int var8 = arg5 + arg7;
        int var9 = arg1 - arg7;
        int var10 = arg4 - arg7;
        int var11 = arg3 + arg7;
        for (int var12 = arg3; var12 < var11; var12++) {
            class161.method1253(arg4, class353.field5599[var12], -1, arg2, arg5);
        }
        for (int var13 = arg1; var13 > var9; var13--) {
            class161.method1253(arg4, class353.field5599[var13], -1, arg2, arg5);
        }
        int var14 = var11;
        if (arg6 < 117) {
            field1171 = (class300) null;
        }
        while (var9 >= var14) {
            int[] var15 = class353.field5599[var14];
            class161.method1253(var8, var15, -1, arg2, arg5);
            class161.method1253(var10, var15, -1, arg0, var8);
            class161.method1253(arg4, var15, -1, arg2, var10);
            var14++;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)I", line = 392)
    public static final int method569(int arg0) {
        field1170++;
        if (arg0 != 0) {
            method569(115);
        }
        return class210.field3341;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V", line = 403)
    public static void method570(boolean arg0) {
        field1176 = null;
        if (arg0) {
            field1178 = null;
            field1171 = null;
            field1174 = null;
        }
    }
}
