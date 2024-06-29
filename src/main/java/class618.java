import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class618 {

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "[[I")
    public static int[][] field8975 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
    public static int field8973;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "I")
    public static int field8974;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
    public static int field8976;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "[I")
    public static int[] field8972;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Z)V", line = 5)
    public static void method3558(boolean arg0) {
        field8975 = null;
        if (arg0) {
            field8972 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IBII[B[BIII)V", line = 17)
    public static final void method3559(int arg0, byte arg1, int arg2, int arg3, byte[] arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        field8973++;
        int var9 = -(arg3 >> 2);
        if (arg1 != 68) {
            field8975 = null;
        }
        int var10 = -(arg3 & 0x3);
        for (int var11 = -arg2; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg4[var10001] += arg5[arg0++];
                int var14 = arg7++;
                arg4[var14] += arg5[arg0++];
                int var15 = arg7++;
                arg4[var15] += arg5[arg0++];
                int var16 = arg7++;
                arg4[var16] += arg5[arg0++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg4[var10001] += arg5[arg0++];
            }
            arg0 += arg8;
            arg7 += arg6;
        }
    }
}
