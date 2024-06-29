import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class379 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "[[I")
    public static int[][] field5659 = new int[128][128];

    @OriginalMember(owner = "client!k", name = "e", descriptor = "[I")
    public static int[] field5663 = new int[14];

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field5660 = -2;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "[[[B")
    public static byte[][][] field5661;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
    public static void method2292(boolean arg0) {
        if (!arg0) {
            field5661 = null;
            field5663 = null;
            field5659 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lrl;[BZIIIZI)Loc;")
    public static final class129 method2293(class487 arg0, byte[] arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field5662++;
        if (arg2) {
            return null;
        } else if (!arg0.field7454 && (!class403.method2418(arg7, (byte) 92) || !class403.method2418(arg3, (byte) 89))) {
            return arg0.field7459 ? new class129(arg0, 34037, arg4, arg7, arg3, arg6, arg1, arg5) : new class129(arg0, arg4, arg7, arg3, class340.method2064(48, arg7), class340.method2064(-102, arg3), arg1, arg5);
        } else {
            return new class129(arg0, 3553, arg4, arg7, arg3, arg6, arg1, arg5);
        }
    }
}
