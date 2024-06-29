import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class524 {

    @OriginalMember(owner = "client!au", name = "a", descriptor = "I")
    public static int field7713 = 0;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Lza;I)V", line = 5)
    public static final void method3100(class491 arg0, int arg1) {
        field7714++;
        if (class482.field7087 != class302.field4850.field4720 && class66.field977 != null && arg1 == 19794 && class215.method1489(class302.field4850.field4720, 1024, arg0)) {
            class482.field7087 = class302.field4850.field4720;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I[B[BIBIIII)V", line = 36)
    public static final void method3101(int arg0, byte[] arg1, byte[] arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field7715++;
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & 0x3);
        int var11 = -arg5;
        if (arg4 > -78) {
            return;
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg1[var10001] += arg2[arg6++];
                int var14 = arg3++;
                arg1[var14] += arg2[arg6++];
                int var15 = arg3++;
                arg1[var15] += arg2[arg6++];
                int var16 = arg3++;
                arg1[var16] += arg2[arg6++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg3++;
                arg1[var10001] += arg2[arg6++];
            }
            arg3 += arg0;
            arg6 += arg7;
            var11++;
        }
    }
}
