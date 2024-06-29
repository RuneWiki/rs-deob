import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class22 {

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "Lwv;")
    public static class26 field389 = new class26("WTRC", 1);

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
    public static int field391 = 1;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V", line = 4)
    public static void method202(int arg0) {
        field389 = null;
        if (arg0 > -122) {
            method202(-107);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BIIII[BI)Z", line = 14)
    public static final boolean method203(byte arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        field387++;
        int var7 = arg6 % arg4;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg4 - var7;
        }
        if (arg0 <= 99) {
            return false;
        }
        int var9 = -((arg1 + arg4 - 1) / arg4);
        int var10 = -((arg6 + arg4 - 1) / arg4);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg5[arg2] == 0) {
                    return true;
                }
                arg2 += arg4;
            }
            int var13 = arg2 - var8;
            if (arg5[var13 - 1] == 0) {
                return true;
            }
            arg2 = arg3 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)B", line = 68)
    public static final byte method204(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            return -120;
        }
        field390++;
        if (arg2 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
