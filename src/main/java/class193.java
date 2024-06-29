import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class193 {

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "([BIIZ[BIIII)V", line = 4)
    public static final void method1304(byte[] arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        field2584++;
        int var9 = -(arg8 >> 2);
        if (arg3) {
            return;
        }
        int var10 = -(arg8 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg0[var10001] = (byte) (arg0[var10001] - arg4[arg2++]);
                int var14 = arg7++;
                arg0[var14] = (byte) (arg0[var14] - arg4[arg2++]);
                int var15 = arg7++;
                arg0[var15] = (byte) (arg0[var15] - arg4[arg2++]);
                int var16 = arg7++;
                arg0[var16] = (byte) (arg0[var16] - arg4[arg2++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg0[var10001] = (byte) (arg0[var10001] - arg4[arg2++]);
            }
            arg7 += arg5;
            arg2 += arg1;
        }
    }
}
