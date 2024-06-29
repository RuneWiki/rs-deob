import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class558 {

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I[B[BIIIIBI)V")
    public static final void method3182(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field7735++;
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg8; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg2[var10001] = (byte) (arg2[var10001] - arg1[arg0++]);
                int var14 = arg4++;
                arg2[var14] = (byte) (arg2[var14] - arg1[arg0++]);
                int var15 = arg4++;
                arg2[var15] = (byte) (arg2[var15] - arg1[arg0++]);
                int var16 = arg4++;
                arg2[var16] = (byte) (arg2[var16] - arg1[arg0++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg2[var10001] = (byte) (arg2[var10001] - arg1[arg0++]);
            }
            arg0 += arg3;
            arg4 += arg6;
        }
        if (arg7 == 4) {
            ;
        }
    }
}
