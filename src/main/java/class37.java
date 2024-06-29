import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public abstract class class37 extends class170 {

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "Z")
    public volatile boolean field484 = true;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "Lto;")
    public static class274 field480 = new class274();

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "Z")
    public boolean field482;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "Z")
    public boolean field486;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIILp;)V")
    public static final void method319(int arg0, int arg1, int arg2, int arg3, class447 arg4) {
        field483++;
        if (arg3 < 42) {
            return;
        }
        for (class328 var5 = (class328) class159.field2268.method1173(0); var5 != null; var5 = (class328) class159.field2268.method1165(true)) {
            if (var5.field4447 == arg1 && arg0 * 128 == var5.field4466 && (arg2 * 128) == var5.field4467 && var5.field4454.field6323 == arg4.field6323) {
                if (var5.field4452 != null) {
                    class48.field616.method1128(var5.field4452);
                    var5.field4452 = null;
                }
                if (var5.field4460 != null) {
                    class48.field616.method1128(var5.field4460);
                    var5.field4460 = null;
                }
                var5.method1884(false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)I")
    public abstract int method156(byte arg0);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II[J[II)V")
    public static final void method320(int arg0, int arg1, long[] arg2, int[] arg3, int arg4) {
        if (arg4 < arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var7;
            int var9 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var9;
            for (int var10 = arg4; var10 < arg0; var10++) {
                if (arg2[var10] < (long) (var10 & 0x1) + var7) {
                    long var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    int var13 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var13;
                }
            }
            arg2[arg0] = arg2[var6];
            arg2[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var9;
            method320(var6 - 1, 14407, arg2, arg3, arg4);
            method320(arg0, 14407, arg2, arg3, var6 + 1);
        }
        if (arg1 != 14407) {
            field480 = null;
        }
        field481++;
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V")
    public static void method321(int arg0) {
        field480 = null;
        if (arg0 != 1) {
            method319(73, -96, -29, -45, (class447) null);
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)[B")
    public abstract byte[] method154(boolean arg0);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z[J[Ljava/lang/Object;II)V")
    public static final void method322(boolean arg0, long[] arg1, Object[] arg2, int arg3, int arg4) {
        field485++;
        if (arg3 < arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var7;
            Object var9 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var9;
            for (int var10 = arg3; var10 < arg4; var10++) {
                if (var7 + ((long) (var10 & 0x1)) > arg1[var10]) {
                    long var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    Object var13 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var13;
                }
            }
            arg1[arg4] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var9;
            method322(false, arg1, arg2, arg3, var6 - 1);
            method322(false, arg1, arg2, var6 + 1, arg4);
        }
        if (arg0) {
            field480 = null;
        }
    }
}
