import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class176 extends class2 {

    @OriginalMember(owner = "client!as", name = "g", descriptor = "Ldh;")
    public class190 field2335;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lnf;II[I[IB)Las;", line = 5)
    public static final class176 method1077(class256 arg0, int arg1, int arg2, int[] arg3, int[] arg4, byte arg5) {
        byte[] var6 = new byte[arg1 * arg2];
        if (arg5 != -1) {
            return (class176) null;
        }
        for (int var7 = 0; var7 < arg2; var7++) {
            int var8 = arg1 * var7 + arg4[var7];
            for (int var9 = 0; var9 < arg3[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class176(arg0, arg1, arg2, var6);
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lnf;II[B)V", line = 32)
    private class176(class256 arg0, int arg1, int arg2, byte[] arg3) {
        this.field2335 = class190.method1148(34037, arg3, 6406, arg0, arg1, arg2, 6406, false);
        this.field2335.method1271(false, false);
    }
}
