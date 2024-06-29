import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class class464 extends class483 {

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Los;")
    public static class412 field6265 = new class412(7, 2);

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field6266 = -1;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "[C")
    public static char[] field6267 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method2625(int arg0) {
        if (arg0 >= -121) {
            method2625(89);
        }
        field6267 = null;
        field6265 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIII[BI)Z")
    public static final boolean method2626(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        field6264++;
        int var7 = -49 % ((-arg0 - 58) / 55);
        int var8 = arg4 % arg1;
        int var9;
        if (var8 == 0) {
            var9 = 0;
        } else {
            var9 = arg1 - var8;
        }
        int var10 = -((arg3 + arg1 - 1) / arg1);
        int var11 = -((arg4 - (1 - arg1)) / arg1);
        for (int var12 = var10; var12 < 0; var12++) {
            for (int var13 = var11; var13 < 0; var13++) {
                if (arg5[arg2] == 0) {
                    return true;
                }
                arg2 += arg1;
            }
            int var14 = arg2 - var9;
            if (arg5[var14 - 1] == 0) {
                return true;
            }
            arg2 = arg6 + var14;
        }
        return false;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)Lul;")
    public abstract class537 method2627(byte arg0);
}
