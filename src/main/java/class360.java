import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class360 extends class165 {

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Lvj;")
    public class179 field4976;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lmm;[I[IIIB)Lre;", line = 5)
    public static final class360 method2221(class357 arg0, int[] arg1, int[] arg2, int arg3, int arg4, byte arg5) {
        byte[] var6 = new byte[arg3 * arg4];
        for (int var7 = 0; var7 < arg3; var7++) {
            int var8 = arg4 * var7 + arg2[var7];
            for (int var9 = 0; var9 < arg1[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        if (arg5 >= -102) {
            return (class360) null;
        } else {
            return new class360(arg0, arg4, arg3, var6);
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lmm;II[B)V", line = 32)
    private class360(class357 arg0, int arg1, int arg2, byte[] arg3) {
        this.field4976 = class179.method1267(6408, false, arg2, arg3, 6406, 6406, arg1, arg0);
        this.field4976.method1659(false, false);
    }
}
