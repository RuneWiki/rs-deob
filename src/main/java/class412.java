import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class412 {

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public int field5981;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public int field5983;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public int field5985;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public int field5986;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z[BIILqo;III)Leba;", line = 9)
    public static final class588 method2551(boolean arg0, byte[] arg1, int arg2, int arg3, class22 arg4, int arg5, int arg6, int arg7) {
        field5982++;
        if (arg5 > -17) {
            return null;
        } else if (!arg4.field615 && (!class476.method2796(-58, arg7) || !class476.method2796(-68, arg3))) {
            return arg4.field659 ? new class588(arg4, 34037, arg6, arg7, arg3, arg0, arg1, arg2) : new class588(arg4, arg6, arg7, arg3, class529.method3059(arg7, (byte) 108), class529.method3059(arg3, (byte) 108), arg1, arg2);
        } else {
            return new class588(arg4, 3553, arg6, arg7, arg3, arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)Z", line = 28)
    public static final boolean method2552(int arg0, int arg1) {
        if (arg1 == 1) {
            field5984++;
            return arg0 == 0 || arg0 == 1 || arg0 == 2;
        } else {
            return false;
        }
    }
}
