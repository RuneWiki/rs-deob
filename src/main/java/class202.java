import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class202 extends class739 {

    @OriginalMember(owner = "client!fq", name = "s", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!fq", name = "u", descriptor = "I")
    public int field3023;

    @OriginalMember(owner = "client!fq", name = "t", descriptor = "Z")
    public static boolean field3022 = false;

    @OriginalMember(owner = "client!fq", name = "r", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!fq", name = "v", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)Lio;", line = 3)
    public final class439 method69(byte arg0) {
        field3024++;
        int var2 = 20 / ((-arg0 - 69) / 39);
        return class463.field6817;
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Log;Lega;IIIIIIIIII)V", line = 14)
    public class202(class651 arg0, class713 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field3021 = arg10;
        this.field3023 = arg11;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)Z", line = 27)
    public static final boolean method1383(byte arg0, int arg1) {
        field3020++;
        if (arg0 == -94) {
            return arg1 == 0 || arg1 == 2;
        } else {
            return false;
        }
    }
}
