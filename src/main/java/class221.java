import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class221 extends class449 {

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "Lns;")
    public class173 field3143;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILih;[I[III)Lpi;")
    public static final class221 method1376(int arg0, class330 arg1, int[] arg2, int[] arg3, int arg4, int arg5) {
        if (arg0 != 6406) {
            return (class221) null;
        }
        byte[] var6 = new byte[arg4 * arg5];
        for (int var7 = 0; var7 < arg4; var7++) {
            int var8 = arg5 * var7 + arg2[var7];
            for (int var9 = 0; var9 < arg3[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class221(arg1, arg5, arg4, var6);
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lih;II[B)V")
    private class221(class330 arg0, int arg1, int arg2, byte[] arg3) {
        this.field3143 = class173.method1059(arg0, arg1, arg3, 6406, false, 6406, arg2, 20);
        this.field3143.method944(false, false);
    }
}
