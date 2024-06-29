import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class415 extends class152 {

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "Lln;")
    public class234 field5655;

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lbf;II[B)V")
    private class415(class344 arg0, int arg1, int arg2, byte[] arg3) {
        this.field5655 = class234.method1307(false, 6406, arg0, arg3, arg2, 6406, 118, arg1);
        this.field5655.method415(false, false);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILbf;I[I[II)Lgj;")
    public static final class415 method2479(int arg0, class344 arg1, int arg2, int[] arg3, int[] arg4, int arg5) {
        byte[] var6 = new byte[arg0 * arg5];
        for (int var7 = 0; var7 < arg5; var7++) {
            int var8 = arg0 * var7 + arg4[var7];
            for (int var9 = 0; var9 < arg3[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        if (arg2 >= -88) {
            return (class415) null;
        } else {
            return new class415(arg1, arg0, arg5, var6);
        }
    }
}
