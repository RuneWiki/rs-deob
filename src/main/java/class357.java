import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class357 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5471 = "Use";

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "[I")
    public static int[] field5474 = new int[500];

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Lth;")
    public static class57 field5473 = new class57(64);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Lph;")
    public static class361 field5472;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 8)
    public static void method2475(int arg0) {
        field5472 = null;
        if (arg0 == 0) {
            field5474 = null;
            field5471 = null;
            field5473 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILqf;)I", line = 30)
    public static final int method2476(int arg0, int arg1, class359 arg2) {
        field5476++;
        if (!client.method347(arg2).method1452(false, arg1) && arg2.field5670 == null) {
            return -1;
        } else {
            if (arg0 != -13081) {
                method2477(true);
            }
            return arg2.field5549 == null || arg2.field5549.length <= arg1 ? -1 : arg2.field5549[arg1];
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V", line = 44)
    public static final void method2477(boolean arg0) {
        class116.field1642.method462(24);
        field5477++;
        if (arg0) {
            method2476(106, 65, (class359) null);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[[IZIII[[FIBI[[FZ[[F[[I[ILnk;I[ZZIZ)V", line = 71)
    public static final void method2478(int arg0, int arg1, int[][] arg2, boolean arg3, int arg4, int arg5, int arg6, float[][] arg7, int arg8, byte arg9, int arg10, float[][] arg11, boolean arg12, float[][] arg13, int[][] arg14, int[] arg15, class224 arg16, int arg17, boolean[] arg18, boolean arg19, int arg20, boolean arg21) {
        field5470++;
        if (arg1 <= 123) {
            method2475(23);
        }
        int var22 = (arg8 << 8) + (arg3 ? 255 : 0);
        int var23 = (arg5 << 8) + (arg21 ? 255 : 0);
        int var24 = (arg4 << 8) + (arg19 ? 255 : 0);
        int var25 = (arg12 ? 255 : 0) + (arg17 << 8);
        int[] var26 = new int[arg15.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg15[var27 + var27];
            int var29 = arg15[var27 + var27 + 1];
            int[][] var30 = arg14 == null || arg18 == null || !arg18[var27] ? arg2 : arg14;
            var26[var27] = class259.method1902(arg9, false, arg7, arg13, (float) arg20, arg16, arg11, var24, var30, arg10, var28, arg14, var29, var25, var23, var22, (byte) 107, arg6);
        }
        arg16.method1641(arg0, arg6, arg10, var26, (int[]) null, false);
    }
}
