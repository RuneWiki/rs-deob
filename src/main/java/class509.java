import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class509 {

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Lfba;")
    public static class348 field7378 = new class348(64);

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Z")
    public static boolean field7380 = false;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Z")
    public static boolean field7381 = false;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Ltd;")
    public static class515 field7379;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method3100(int arg0) {
        if (arg0 >= -106) {
            field7379 = null;
        }
        field7379 = null;
        field7378 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BII[BIIIII)V")
    public static final void method3101(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field7377++;
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & arg6);
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg0[var10001] += arg3[arg8++];
                int var14 = arg1++;
                arg0[var14] += arg3[arg8++];
                int var15 = arg1++;
                arg0[var15] += arg3[arg8++];
                int var16 = arg1++;
                arg0[var16] += arg3[arg8++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg0[var10001] += arg3[arg8++];
            }
            arg8 += arg7;
            arg1 += arg2;
        }
    }
}
