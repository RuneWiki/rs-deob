import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class454 extends class270 {

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Lmfa;")
    public static class562 field6292 = new class562();

    @OriginalMember(owner = "client!va", name = "o", descriptor = "Ltr;")
    public static class263 field6293 = new class263();

    @OriginalMember(owner = "client!va", name = "q", descriptor = "Lgl;")
    public static class547 field6295 = new class547(7, 6);

    @OriginalMember(owner = "client!va", name = "t", descriptor = "Lpr;")
    public static class407 field6298 = new class407(33, -1);

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public int field6291;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public int field6297;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I[BIIIII)Z", line = 11)
    public static final boolean method2580(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6296++;
        int var7 = arg5 % arg6;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg6 - var7;
        }
        int var9 = -((arg0 + arg6 - 1) / arg6);
        int var10 = -((arg5 + arg6 + arg2) / arg6);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg1[arg4] == 0) {
                    return true;
                }
                arg4 += arg6;
            }
            int var13 = arg4 - var8;
            if (arg1[var13 - 1] == 0) {
                return true;
            }
            arg4 = arg3 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V", line = 56)
    public static void method2581(byte arg0) {
        field6298 = null;
        if (arg0 > -51) {
            field6295 = null;
        }
        field6295 = null;
        field6293 = null;
        field6292 = null;
    }
}
