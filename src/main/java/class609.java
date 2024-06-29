import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class609 extends class145 {

    @OriginalMember(owner = "client!gn", name = "F", descriptor = "[I")
    public static int[] field8883 = new int[5];

    @OriginalMember(owner = "client!gn", name = "E", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!gn", name = "G", descriptor = "I")
    public static int field8884;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[J[Ljava/lang/Object;II)V")
    public static final void method3533(int arg0, long[] arg1, Object[] arg2, int arg3, int arg4) {
        if (~arg0 > ~arg3) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg0;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            Object var9 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg0; var11 < arg3; ++var11) {
                if (~((long) (var10 & var11) + var7) < ~arg1[var11]) {
                    long var12 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6] = var12;
                    Object var14 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6++] = var14;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg3] = arg2[var6];
            arg2[var6] = var9;
            method3533(arg0, arg1, arg2, var6 + -1, 1);
            method3533(var6 + 1, arg1, arg2, arg3, 1);
        }
        ++field8884;
        if (arg4 != 1) {
            field8883 = null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        ++field8882;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            class210.method1331(var3, 0, class647.field9368, class573.field8270[arg1]);
        }
        return arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "(I)V")
    public static void method3534(int arg0) {
        field8883 = null;
        if (arg0 != 1) {
            method3534(-41);
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
    public class609() {
        super(0, true);
    }
}
