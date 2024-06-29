import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class50 extends class179 {

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Lmc;")
    public class317 field836;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([I[IBILhd;I)Lna;")
    public static final class50 method496(int[] arg0, int[] arg1, byte arg2, int arg3, class17 arg4, int arg5) {
        byte[] var6 = new byte[arg3 * arg5];
        if (arg2 != 68) {
            return (class50) null;
        }
        for (int var7 = 0; var7 < arg3; var7++) {
            int var8 = arg5 * var7 + arg1[var7];
            for (int var9 = 0; var9 < arg0[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class50(arg4, arg5, arg3, var6);
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lhd;II[B)V")
    private class50(class17 arg0, int arg1, int arg2, byte[] arg3) {
        this.field836 = class317.method2018(arg0, 6406, arg2, true, false, arg1, arg3, 6406);
        this.field836.method1543(false, false);
    }
}
