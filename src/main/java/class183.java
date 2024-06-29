import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class183 {

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "Lue;")
    public static class235 field2976;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "[S")
    public static short[] field2975;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([[II[[FIIIZZZI[[F[I[ZILqj;I[[IB[[FZII)V", line = 24)
    public static final void method1293(int[][] arg0, int arg1, float[][] arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, boolean arg8, int arg9, float[][] arg10, int[] arg11, boolean[] arg12, int arg13, class264 arg14, int arg15, int[][] arg16, byte arg17, float[][] arg18, boolean arg19, int arg20, int arg21) {
        int var22 = (arg9 << 8) + (arg7 ? 255 : 0);
        int var23 = (arg19 ? 255 : 0) + (arg1 << 8);
        field2977++;
        int var24 = (arg15 << 8) + (arg8 ? 255 : 0);
        int var25 = (arg6 ? 255 : 0) + (arg5 << 8);
        int[] var26 = new int[arg11.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg11[var27 + var27];
            int var29 = arg11[var27 + var27 + 1];
            int[][] var30 = arg0 == null || arg12 == null || !arg12[var27] ? arg16 : arg0;
            var26[var27] = class161.method1137(arg10, arg2, arg14, var29, (float) arg21, arg4, var30, arg18, var25, false, -2, arg17, var22, var28, var24, arg3, var23, arg0);
        }
        arg14.method1838(arg20, arg4, arg3, var26, (int[]) null, false);
        int var31 = -91 % ((43 - arg13) / 63);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)Ljm;", line = 58)
    public static final class134 method1294(int arg0, byte arg1) {
        field2978++;
        int var2 = 15 % ((-arg1 - 22) / 35);
        return class229.field3762 && arg0 >= class124.field2081 && class287.field4718 >= arg0 ? class85.field1464[arg0 - class124.field2081] : null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 74)
    public static void method1295(int arg0) {
        field2975 = null;
        field2976 = null;
        if (arg0 != 1871936072) {
            field2976 = (class235) null;
        }
    }
}
