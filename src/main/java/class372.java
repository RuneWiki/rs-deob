import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class372 {

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "Lup;")
    public class172 field5447 = new class172();

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Z")
    public boolean field5449 = false;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Lqi;")
    public static class382 field5448 = new class382("WTRC", 1);

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "F")
    public static float field5446;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public int field5450;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public int field5451;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static void method2247(int arg0) {
        if (arg0 != -26863) {
            method2248(-54, null, -29, -114, -48, 124, 116, 48, null);
        }
        field5448 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[BIIIIII[B)V")
    public static final void method2248(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        if (arg5 < 23) {
            field5446 = 0.6517163F;
        }
        field5445++;
        int var9 = -(arg6 >> 2);
        int var10 = -(arg6 & 0x3);
        for (int var11 = -arg0; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg1[var10001] += arg8[arg4++];
                int var14 = arg7++;
                arg1[var14] += arg8[arg4++];
                int var15 = arg7++;
                arg1[var15] += arg8[arg4++];
                int var16 = arg7++;
                arg1[var16] += arg8[arg4++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg1[var10001] += arg8[arg4++];
            }
            arg4 += arg3;
            arg7 += arg2;
        }
    }
}
