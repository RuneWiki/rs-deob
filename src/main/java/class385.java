import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class385 extends class333 {

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Lad;")
    public static class19 field5192 = new class19(64);

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field5196 = 0;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "[Li;")
    public static class274[] field5193;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "[Lqo;")
    public static class550[] field5195;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I[BIIIII)Z")
    public static final boolean method2205(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5194++;
        int var7 = arg6 % arg0;
        if (arg3 != 23511) {
            return false;
        }
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg0 - var7;
        }
        int var9 = -((arg0 + arg5 - 1) / arg0);
        int var10 = -((arg0 + arg6 - 1) / arg0);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg1[arg4] == 0) {
                    return true;
                }
                arg4 += arg0;
            }
            int var13 = arg4 - var8;
            if (arg1[var13 - 1] == 0) {
                return true;
            }
            arg4 = arg2 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static void method2206(byte arg0) {
        if (arg0 != -116) {
            field5192 = null;
        }
        field5195 = null;
        field5192 = null;
        field5193 = null;
    }
}
