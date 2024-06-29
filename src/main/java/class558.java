import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class558 {

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "[I")
    public static int[] field7608 = new int[3];

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "[Lfq;")
    public static class463[] field7606 = new class463[14];

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIII[BI)Z")
    public static final boolean method3120(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        field7607++;
        int var7 = arg0 % arg6;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg6 - var7;
        }
        int var9 = -((arg4 - (arg2 - arg6)) / arg6);
        int var10 = -((arg0 + arg6 - 1) / arg6);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg5[arg3] == 0) {
                    return true;
                }
                arg3 += arg6;
            }
            int var13 = arg3 - var8;
            if (arg5[var13 - 1] == 0) {
                return true;
            }
            arg3 = arg1 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method3121(int arg0, int arg1, boolean arg2) {
        field7605++;
        return arg2 ? (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544 : true;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
    public static void method3122(byte arg0) {
        field7608 = null;
        if (arg0 != -70) {
            field7608 = null;
        }
        field7606 = null;
    }
}
