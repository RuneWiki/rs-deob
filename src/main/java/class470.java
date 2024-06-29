import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class470 extends class90 {

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "Lr;")
    public class414 field6580;

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lqi;II[B)V")
    private class470(class458 arg0, int arg1, int arg2, byte[] arg3) {
        this.field6580 = class414.method2416(-47, arg2, arg0, arg3, arg1, false, 6406, 6406);
        this.field6580.method1279(false, false);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BIILqi;[I[I)Ltg;")
    public static final class470 method2756(byte arg0, int arg1, int arg2, class458 arg3, int[] arg4, int[] arg5) {
        byte[] var6 = new byte[arg1 * arg2];
        for (int var7 = 0; var7 < arg1; var7++) {
            int var8 = arg2 * var7 + arg4[var7];
            for (int var9 = 0; var9 < arg5[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        if (arg0 != 59) {
            method2756((byte) 25, 104, 60, (class458) null, (int[]) null, (int[]) null);
        }
        return new class470(arg3, arg2, arg1, var6);
    }
}
