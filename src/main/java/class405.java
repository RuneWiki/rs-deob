import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class405 extends class121 {

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "Lan;")
    public class17 field5894;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILpo;I[IB[I)Lar;")
    public static final class405 method2562(int arg0, class332 arg1, int arg2, int[] arg3, byte arg4, int[] arg5) {
        byte[] var6 = new byte[arg0 * arg2];
        if (arg4 >= -27) {
            return (class405) null;
        }
        for (int var7 = 0; var7 < arg0; var7++) {
            int var8 = arg2 * var7 + arg3[var7];
            for (int var9 = 0; var9 < arg5[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class405(arg1, arg2, arg0, var6);
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lpo;II[B)V")
    private class405(class332 arg0, int arg1, int arg2, byte[] arg3) {
        this.field5894 = class17.method113(6406, 3553, arg0, arg2, arg3, 6406, false, arg1);
        this.field5894.method837(false, false);
    }
}
