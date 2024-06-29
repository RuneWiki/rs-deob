import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class171 {

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "Lrh;")
    public class159 field34;

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lmi;II[B)V")
    private class4(class315 arg0, int arg1, int arg2, byte[] arg3) {
        this.field34 = class159.method990(arg2, 6406, false, arg1, arg3, 6406, arg0, 34037);
        this.field34.method93(false, false);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "([IIILmi;[II)Lft;")
    public static final class4 method18(int[] arg0, int arg1, int arg2, class315 arg3, int[] arg4, int arg5) {
        byte[] var6 = new byte[arg2 * arg5];
        if (arg1 != -10890) {
            return (class4) null;
        }
        for (int var7 = 0; var7 < arg2; var7++) {
            int var8 = arg5 * var7 + arg0[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class4(arg3, arg5, arg2, var6);
    }
}
