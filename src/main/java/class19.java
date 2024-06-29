import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class19 extends class220 {

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "Lbc;")
    public class205 field249;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BLhj;[III[I)Lir;", line = 6)
    public static final class19 method121(byte arg0, class338 arg1, int[] arg2, int arg3, int arg4, int[] arg5) {
        byte[] var6 = new byte[arg3 * arg4];
        for (int var7 = 0; var7 < arg3; var7++) {
            int var8 = arg4 * var7 + arg5[var7];
            for (int var9 = 0; var9 < arg2[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        if (arg0 >= -28) {
            return (class19) null;
        } else {
            return new class19(arg1, arg4, arg3, var6);
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lhj;II[B)V", line = 32)
    private class19(class338 arg0, int arg1, int arg2, byte[] arg3) {
        this.field249 = class205.method1343(arg0, false, 6406, arg2, arg3, 1673, 6406, arg1);
        this.field249.method1295(false, false);
    }
}
