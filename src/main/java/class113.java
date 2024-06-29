import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class113 extends class175 {

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lgn;")
    public class170 field1409;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI[IILql;[I)Lte;")
    public static final class113 method603(byte arg0, int arg1, int[] arg2, int arg3, class346 arg4, int[] arg5) {
        byte[] var6 = new byte[arg1 * arg3];
        int var7 = 0;
        if (arg0 != -1) {
            method603((byte) -103, 91, (int[]) null, 92, (class346) null, (int[]) null);
        }
        while (var7 < arg3) {
            int var8 = arg1 * var7 + arg5[var7];
            for (int var9 = 0; var9 < arg2[var7]; var9++) {
                var6[var8++] = -1;
            }
            var7++;
        }
        return new class113(arg4, arg1, arg3, var6);
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lql;II[B)V")
    private class113(class346 arg0, int arg1, int arg2, byte[] arg3) {
        this.field1409 = class170.method897((byte) 17, 6406, 6406, arg2, arg3, arg1, arg0, false);
        this.field1409.method1171(false, false);
    }
}
