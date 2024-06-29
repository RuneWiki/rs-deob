import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class125 {

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "Lsw;")
    public static class787 field1891 = new class787(2);

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V", line = 9)
    public static void method1022(int arg0) {
        field1891 = null;
        if (arg0 != 34037) {
            method1023(null, -28, 121, null, -15, -94, false, (byte) -37);
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "([BIILdia;IIZB)Lme;", line = 20)
    public static final class207 method1023(byte[] arg0, int arg1, int arg2, class246 arg3, int arg4, int arg5, boolean arg6, byte arg7) {
        field1892++;
        int var8 = 5 / ((arg7 + 33) / 62);
        if (!arg3.field3609 && (!class117.method957(-6602, arg4) || !class117.method957(-6602, arg2))) {
            return arg3.field3653 ? new class207(arg3, 34037, arg1, arg4, arg2, arg6, arg0, arg5) : new class207(arg3, arg1, arg4, arg2, class719.method4014(arg4, (byte) -100), class719.method4014(arg2, (byte) -100), arg0, arg5);
        } else {
            return new class207(arg3, 3553, arg1, arg4, arg2, arg6, arg0, arg5);
        }
    }
}
