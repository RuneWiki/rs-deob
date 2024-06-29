import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class707 {

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public static int field9898 = 0;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field9895;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "Lsia;")
    public static class735 field9894;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field9897;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "[Lgg;")
    public static class176[] field9896;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIII[BI)Z", line = 7)
    public static final boolean method3978(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        field9895++;
        int var7 = arg4 % arg0;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg0 - var7;
        }
        int var9 = -((arg0 + arg6 - 1) / arg0);
        int var10 = -((arg4 + arg0 - arg2) / arg0);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg5[arg1] == 0) {
                    return true;
                }
                arg1 += arg0;
            }
            int var13 = arg1 - var8;
            if (arg5[var13 - 1] == 0) {
                return true;
            }
            arg1 = arg3 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V", line = 55)
    public static void method3979(int arg0) {
        field9894 = null;
        field9896 = null;
        field9897 = null;
        if (arg0 != 0) {
            field9898 = 29;
        }
    }
}
