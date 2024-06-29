import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class324 extends class195 {

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "Lmf;")
    public class16 field4778;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lks;[IIBI[I)Lij;", line = 5)
    public static final class324 method2124(class173 arg0, int[] arg1, int arg2, byte arg3, int arg4, int[] arg5) {
        byte[] var6 = new byte[arg2 * arg4];
        if (arg3 != -1) {
            return (class324) null;
        }
        for (int var7 = 0; var7 < arg2; var7++) {
            int var8 = arg4 * var7 + arg1[var7];
            for (int var9 = 0; var9 < arg5[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class324(arg0, arg4, arg2, var6);
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lks;II[B)V", line = 32)
    private class324(class173 arg0, int arg1, int arg2, byte[] arg3) {
        this.field4778 = class16.method220(6406, 6406, arg2, arg0, 34037, arg1, false, arg3);
        this.field4778.method599(false, false);
    }
}
