import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class234 extends class241 {

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "Lkf;")
    public class137 field3353;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II[ILtb;[II)Lwl;", line = 6)
    public static final class234 method1597(int arg0, int arg1, int[] arg2, class227 arg3, int[] arg4, int arg5) {
        byte[] var6 = new byte[arg0 * arg1];
        for (int var7 = 0; var7 < arg1; var7++) {
            int var8 = arg0 * var7 + arg2[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        int var10 = 78 % ((arg5 + 40) / 37);
        return new class234(arg3, arg0, arg1, var6);
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Ltb;II[B)V", line = 31)
    private class234(class227 arg0, int arg1, int arg2, byte[] arg3) {
        this.field3353 = class137.method949(6406, false, 6406, arg0, (byte) 125, arg1, arg3, arg2);
        this.field3353.method2174(false, false);
    }
}
