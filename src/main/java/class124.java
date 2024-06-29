import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class124 {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field1856 = 0;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Lha;")
    public static class318 field1855;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZ[Z[[F[[IZILkd;Z[[FI[IZIBII[[IZI[[F)V", line = 9)
    public static final void method861(int arg0, int arg1, boolean arg2, boolean[] arg3, float[][] arg4, int[][] arg5, boolean arg6, int arg7, class83 arg8, boolean arg9, float[][] arg10, int arg11, int[] arg12, boolean arg13, int arg14, byte arg15, int arg16, int arg17, int[][] arg18, boolean arg19, int arg20, float[][] arg21) {
        field1857++;
        int var22 = (arg7 << 8) + (arg19 ? 255 : 0);
        int var23 = (arg13 ? 255 : 0) + (arg0 << 8);
        int var24 = (arg6 ? 255 : 0) + (arg17 << 8);
        int var25 = (arg16 << 8) + (arg9 ? 255 : 0);
        int[] var26 = new int[arg12.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg12[var27 + var27 + 1];
            int[][] var29 = arg5 == null || arg3 == null || !arg3[var27] ? arg18 : arg5;
            int var30 = arg12[var27 + var27];
            var26[var27] = class341.method2349(arg10, arg21, arg11, arg4, arg5, false, var30, (float) arg20, arg14, arg8, var24, var28, arg15, var29, var22, -1, var25, var23);
        }
        arg8.method615(arg1, arg11, arg14, var26, (int[]) null, arg2);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V", line = 47)
    public static void method862(boolean arg0) {
        field1855 = null;
        if (arg0) {
            field1855 = (class318) null;
        }
    }
}
