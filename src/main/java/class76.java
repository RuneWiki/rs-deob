import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class76 extends class153 {

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Lqq;")
    public class434 field1023;

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lcg;II[B)V")
    private class76(class393 arg0, int arg1, int arg2, byte[] arg3) {
        this.field1023 = class434.method2666(6406, arg1, arg2, false, 6406, false, arg3, arg0);
        this.field1023.method258(false, false);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBI[ILcg;[I)Lrf;")
    public static final class76 method496(int arg0, byte arg1, int arg2, int[] arg3, class393 arg4, int[] arg5) {
        byte[] var6 = new byte[arg0 * arg2];
        for (int var7 = 0; var7 < arg0; var7++) {
            int var8 = arg2 * var7 + arg3[var7];
            for (int var9 = 0; var9 < arg5[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        if (arg1 < 22) {
            return (class76) null;
        } else {
            return new class76(arg4, arg2, arg0, var6);
        }
    }
}
