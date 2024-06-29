import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class442 extends class421 {

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "Lfj;")
    public class146 field6397;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II[IILse;[I)Lgl;", line = 5)
    public static final class442 method2761(int arg0, int arg1, int[] arg2, int arg3, class282 arg4, int[] arg5) {
        byte[] var6 = new byte[arg1 * arg3];
        if (arg0 != -19877) {
            return (class442) null;
        }
        for (int var7 = 0; var7 < arg3; var7++) {
            int var8 = arg1 * var7 + arg2[var7];
            for (int var9 = 0; var9 < arg5[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class442(arg4, arg1, arg3, var6);
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lse;II[B)V", line = 32)
    private class442(class282 arg0, int arg1, int arg2, byte[] arg3) {
        this.field6397 = class146.method1011(6406, arg3, false, arg1, 34037, arg0, arg2, 6406);
        this.field6397.method872(false, false);
    }
}
