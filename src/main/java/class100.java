import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class100 extends class423 {

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "Ldg;")
    public class10 field1172;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([IILh;I[II)Lkk;")
    public static final class100 method607(int[] arg0, int arg1, class327 arg2, int arg3, int[] arg4, int arg5) {
        byte[] var6 = new byte[arg3 * arg5];
        if (arg1 != -21482) {
            return (class100) null;
        }
        for (int var7 = 0; var7 < arg5; var7++) {
            int var8 = arg3 * var7 + arg4[var7];
            for (int var9 = 0; var9 < arg0[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class100(arg2, arg3, arg5, var6);
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lh;II[B)V")
    private class100(class327 arg0, int arg1, int arg2, byte[] arg3) {
        this.field1172 = class10.method52(false, arg0, arg1, 6406, arg2, arg3, (byte) -124, 6406);
        this.field1172.method1975(false, false);
    }
}
