import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class309 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "F")
    public static float field4169 = 0.0F;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "Ln;")
    public static class17 field4175;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Lbp;")
    public static class323 field4170;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "[S")
    public static short[] field4173;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static void method1941(int arg0) {
        field4175 = null;
        field4170 = null;
        field4173 = null;
        if (arg0 != -1) {
            method1941(-1);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBI[BII[BII)V")
    public static final void method1942(int arg0, byte arg1, int arg2, byte[] arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        field4174++;
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg3[var10001] += arg6[arg5++];
                int var14 = arg0++;
                arg3[var14] += arg6[arg5++];
                int var15 = arg0++;
                arg3[var15] += arg6[arg5++];
                int var16 = arg0++;
                arg3[var16] += arg6[arg5++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg3[var10001] += arg6[arg5++];
            }
            arg5 += arg7;
            arg0 += arg8;
        }
        if (arg1 > -6) {
            field4172 = -12;
        }
    }
}
