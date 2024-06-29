import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class438 extends class245 {

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Ll;")
    public class14 field6430;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([IILsq;II[I)Lob;")
    public static final class438 method2698(int[] arg0, int arg1, class96 arg2, int arg3, int arg4, int[] arg5) {
        byte[] var6 = new byte[arg1 * arg3];
        for (int var7 = 0; var7 < arg1; var7++) {
            int var8 = arg3 * var7 + arg0[var7];
            for (int var9 = 0; var9 < arg5[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        if (arg4 != -3073) {
            method2698((int[]) null, -91, (class96) null, 122, 77, (int[]) null);
        }
        return new class438(arg2, arg3, arg1, var6);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lsq;II[B)V")
    private class438(class96 arg0, int arg1, int arg2, byte[] arg3) {
        this.field6430 = class14.method124(arg0, arg3, 3553, arg1, 6406, 6406, arg2, false);
        this.field6430.method2309(false, false);
    }
}
