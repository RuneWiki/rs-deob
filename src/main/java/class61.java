import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class61 implements class58 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "[I")
    public static int[] field1041 = new int[64];

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "Z")
    public static boolean field1044 = false;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "[I")
    public static int[] field1046;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z[ZII[[FIZI[[F[[IIIB[[IIBZZ[[F[IILkc;)V", line = 13)
    public static final void method458(boolean arg0, boolean[] arg1, int arg2, int arg3, float[][] arg4, int arg5, boolean arg6, int arg7, float[][] arg8, int[][] arg9, int arg10, int arg11, byte arg12, int[][] arg13, int arg14, byte arg15, boolean arg16, boolean arg17, float[][] arg18, int[] arg19, int arg20, class37 arg21) {
        int var22 = (arg17 ? 255 : 0) + (arg11 << 8);
        int var23 = (arg14 << 8) + (arg0 ? 255 : 0);
        field1047++;
        if (arg15 != -81) {
            return;
        }
        int var24 = (arg16 ? 255 : 0) + (arg20 << 8);
        int var25 = (arg6 ? 255 : 0) + (arg10 << 8);
        int[] var26 = new int[arg19.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg19[var27 + var27];
            int var29 = arg19[var27 + var27 + 1];
            int[][] var30 = arg13 == null || arg1 == null || !arg1[var27] ? arg9 : arg13;
            var26[var27] = class45.method389(var24, var23, arg13, arg18, true, arg3, arg8, var29, var30, arg2, false, arg4, arg12, arg21, var28, var22, (float) arg7, var25);
        }
        arg21.method331(arg5, arg3, arg2, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 48)
    public static void method459(byte arg0) {
        field1046 = null;
        if (arg0 > -38) {
            method460(-33, -93, -67, -88, 29);
        }
        field1041 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I[IJI)Ljf;", line = 61)
    public final class229 method448(int arg0, int[] arg1, long arg2, int arg3) {
        field1043++;
        if (arg0 == 0) {
            class16 var6 = class289.method2016(arg1[0], 128);
            return var6.method154((int) arg2, (byte) 82);
        } else if (arg0 == 1 || arg0 == 10) {
            class313 var7 = class113.method799((int) arg2, (byte) 50);
            return var7.field5281;
        } else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
            return class289.method2016(arg1[0], arg3 ^ 0xB6BB9268).method154((int) arg2, (byte) 82);
        } else {
            if (arg3 != -1229221144) {
                method458(true, (boolean[]) null, -63, -116, (float[][]) ((float[][]) null), 28, false, 70, (float[][]) ((float[][]) null), (int[][]) ((int[][]) null), -2, -29, (byte) 90, (int[][]) ((int[][]) null), -124, (byte) 41, false, false, (float[][]) ((float[][]) null), (int[]) null, -12, (class37) null);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIII)V", line = 96)
    public static final void method460(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1042++;
        if (arg0 != 1867246152) {
            return;
        }
        if (class149.field2578 <= arg3 - arg1 && arg1 + arg3 <= class327.field5490 && arg4 - arg1 >= class56.field991 && class142.field2458 >= arg4 + arg1) {
            class5.method32(arg2, arg4, arg3, true, arg1);
        } else {
            class152.method1031(arg1, arg2, arg4, false, arg3);
        }
    }
}
