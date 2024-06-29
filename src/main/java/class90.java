import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class90 extends class433 {

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "Lrn;")
    public class145 field1089;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[I[IIILao;)Luq;")
    public static final class90 method496(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, class157 arg5) {
        if (arg0 != 14108) {
            return (class90) null;
        }
        byte[] var6 = new byte[arg3 * arg4];
        for (int var7 = 0; var7 < arg3; var7++) {
            int var8 = arg4 * var7 + arg1[var7];
            for (int var9 = 0; var9 < arg2[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class90(arg5, arg4, arg3, var6);
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lao;II[B)V")
    private class90(class157 arg0, int arg1, int arg2, byte[] arg3) {
        this.field1089 = class145.method883(arg1, false, arg0, arg3, false, arg2, 6406, 6406);
        this.field1089.method2254(false, false);
    }
}
