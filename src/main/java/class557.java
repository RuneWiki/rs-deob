import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class557 {

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field8283;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "[[B")
    public static byte[][] field8282;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I[BII[BIIII)V", line = 8)
    public static final void method3359(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        field8283++;
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        for (int var11 = -arg0; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg4[var10001] += arg1[arg7++];
                int var14 = arg6++;
                arg4[var14] += arg1[arg7++];
                int var15 = arg6++;
                arg4[var15] += arg1[arg7++];
                int var16 = arg6++;
                arg4[var16] += arg1[arg7++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg4[var10001] += arg1[arg7++];
            }
            arg6 += arg5;
            arg7 += arg2;
        }
        if (arg8 != 14687) {
            field8282 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V", line = 54)
    public static void method3360(byte arg0) {
        field8282 = null;
        if (arg0 >= -10) {
            method3359(31, null, 61, -30, null, -24, 62, 26, 42);
        }
    }
}
