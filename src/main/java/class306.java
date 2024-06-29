import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class306 extends OutputStream {

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field4068 = 0;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "[I")
    public static int[] field4070 = new int[8];

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BI[ILkga;IZ)Leb;", line = 5)
    public static final class577 method1812(byte arg0, int arg1, int[] arg2, class506 arg3, int arg4, boolean arg5) {
        field4066++;
        if (arg0 != -87) {
            method1812((byte) -125, 8, null, null, -24, false);
        }
        if (!arg3.field7360 && (!class326.method1894(arg4, 32) || !class326.method1894(arg1, arg0 + 119))) {
            return arg3.field7355 ? new class577(arg3, 34037, arg4, arg1, arg5, arg2) : new class577(arg3, arg4, arg1, class698.method3915(arg4, (byte) 93), class698.method3915(arg1, (byte) 93), arg2);
        } else {
            return new class577(arg3, 3553, arg4, arg1, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)V", line = 24)
    public static void method1813(boolean arg0) {
        field4070 = null;
        if (!arg0) {
            method1813(false);
        }
    }

    @OriginalMember(owner = "client!jo", name = "write", descriptor = "(I)V", line = 38)
    public final void write(int arg0) throws IOException {
        field4069++;
        throw new IOException();
    }
}
