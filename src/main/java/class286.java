import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class286 {

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field4059 = 0;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "Lgda;")
    public static class53 field4057 = new class53(14, 3);

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "Lij;")
    public static class421 field4060;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)I")
    public static int method1875(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public static void method1876(int arg0) {
        field4057 = null;
        if (arg0 != 3) {
            method1878(112, -98, 34, 54, null, -24, null, -125, -49);
        }
        field4060 = null;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)I")
    public static int method1877(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIII[BI[BII)V")
    public static final void method1878(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        field4058++;
        int var9 = -(arg7 >> 2);
        if (arg3 != -24147) {
            return;
        }
        int var10 = -(arg7 & 0x3);
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg4[var10001] = (byte) (arg4[var10001] - arg6[arg2++]);
                int var14 = arg1++;
                arg4[var14] = (byte) (arg4[var14] - arg6[arg2++]);
                int var15 = arg1++;
                arg4[var15] = (byte) (arg4[var15] - arg6[arg2++]);
                int var16 = arg1++;
                arg4[var16] = (byte) (arg4[var16] - arg6[arg2++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg4[var10001] = (byte) (arg4[var10001] - arg6[arg2++]);
            }
            arg1 += arg0;
            arg2 += arg8;
        }
    }
}
