import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class60 extends class405 {

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "Lwc;")
    public class245 field880;

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lfu;II[B)V", line = 3)
    private class60(class42 arg0, int arg1, int arg2, byte[] arg3) {
        this.field880 = class245.method1690(false, 6406, (byte) 108, 6406, arg3, arg2, arg1, arg0);
        this.field880.method2564(false, false);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II[IB[ILfu;)Ltk;", line = 16)
    public static final class60 method553(int arg0, int arg1, int[] arg2, byte arg3, int[] arg4, class42 arg5) {
        byte[] var6 = new byte[arg0 * arg1];
        if (arg3 <= 55) {
            return (class60) null;
        }
        for (int var7 = 0; var7 < arg1; var7++) {
            int var8 = arg0 * var7 + arg2[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class60(arg5, arg0, arg1, var6);
    }
}
