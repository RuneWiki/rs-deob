import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class class340 extends class275 {

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "[Li;")
    public static class37[] field4500;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 3)
    public static void method1958(byte arg0) {
        if (arg0 < -121) {
            field4500 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBII[BII[BI)V", line = 17)
    public static final void method1960(int arg0, byte arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        field4501++;
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        if (arg1 < 111) {
            method1960(95, (byte) -115, 0, 78, null, -87, -66, null, -82);
        }
        for (int var11 = -arg8; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg5++;
                arg7[var10001] += arg4[arg6++];
                int var14 = arg5++;
                arg7[var14] += arg4[arg6++];
                int var15 = arg5++;
                arg7[var15] += arg4[arg6++];
                int var16 = arg5++;
                arg7[var16] += arg4[arg6++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg5++;
                arg7[var10001] += arg4[arg6++];
            }
            arg5 += arg0;
            arg6 += arg3;
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)Lsa;")
    public abstract class187 method1959(int arg0);
}
