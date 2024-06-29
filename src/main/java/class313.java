import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class313 {

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "[I")
    public int[] field3899;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "[[F")
    public float[][] field3903;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "[I")
    public int[] field3902;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "[I")
    public int[] field3897;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "D")
    public static double field3900;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "Z")
    public static boolean field3896;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II[II[J)V")
    public static final void method1834(int arg0, int arg1, int[] arg2, int arg3, long[] arg4) {
        field3901++;
        if (arg0 != 1 || arg3 <= arg1) {
            return;
        }
        int var5 = (arg1 + arg3) / 2;
        int var6 = arg1;
        long var7 = arg4[var5];
        arg4[var5] = arg4[arg3];
        arg4[arg3] = var7;
        int var9 = arg2[var5];
        arg2[var5] = arg2[arg3];
        arg2[arg3] = var9;
        int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
        for (int var11 = arg1; var11 < arg3; var11++) {
            if (((long) (var10 & var11) + var7) > arg4[var11]) {
                long var12 = arg4[var11];
                arg4[var11] = arg4[var6];
                arg4[var6] = var12;
                int var14 = arg2[var11];
                arg2[var11] = arg2[var6];
                arg2[var6++] = var14;
            }
        }
        arg4[arg3] = arg4[var6];
        arg4[var6] = var7;
        arg2[arg3] = arg2[var6];
        arg2[var6] = var9;
        method1834(arg0, arg1, arg2, var6 - 1, arg4);
        method1834(1, var6 + 1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "([I[I[I[[F)V")
    public class313(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field3899 = arg0;
        this.field3903 = arg3;
        this.field3902 = arg1;
        this.field3897 = arg2;
    }
}
