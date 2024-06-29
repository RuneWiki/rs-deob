import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class133 extends class226 {

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Lrk;")
    public class22 field2052;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI[I[IILig;)Lnj;")
    public static final class133 method1028(byte arg0, int arg1, int[] arg2, int[] arg3, int arg4, class132 arg5) {
        byte[] var6 = new byte[arg1 * arg4];
        if (arg0 != 38) {
            return (class133) null;
        }
        for (int var7 = 0; var7 < arg4; var7++) {
            int var8 = arg1 * var7 + arg2[var7];
            for (int var9 = 0; var9 < arg3[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class133(arg5, arg1, arg4, var6);
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lig;II[B)V")
    private class133(class132 arg0, int arg1, int arg2, byte[] arg3) {
        this.field2052 = class22.method121(arg0, (byte) -125, 6406, arg3, 6406, arg1, arg2, false);
        this.field2052.method1580(false, false);
    }
}
