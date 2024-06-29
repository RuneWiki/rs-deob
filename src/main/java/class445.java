import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class445 extends class401 {

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "Lup;")
    public class259 field6264;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([I[IIBILnm;)Lvi;", line = 6)
    public static final class445 method2579(int[] arg0, int[] arg1, int arg2, byte arg3, int arg4, class254 arg5) {
        byte[] var6 = new byte[arg2 * arg4];
        int var7 = 10 % ((31 - arg3) / 41);
        for (int var8 = 0; var8 < arg4; var8++) {
            int var9 = arg2 * var8 + arg1[var8];
            for (int var10 = 0; var10 < arg0[var8]; var10++) {
                var6[var9++] = -1;
            }
        }
        return new class445(arg5, arg2, arg4, var6);
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lnm;II[B)V", line = 31)
    private class445(class254 arg0, int arg1, int arg2, byte[] arg3) {
        this.field6264 = class259.method1713(arg3, 6406, false, 6406, -34038, arg1, arg0, arg2);
        this.field6264.method312(false, false);
    }
}
