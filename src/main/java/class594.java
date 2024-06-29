import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class594 {

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "[Z")
    public static boolean[] field8302 = new boolean[8];

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "Lhg;")
    public static class693 field8297 = new class693(6, -1);

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "Z")
    public static boolean field8303 = false;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "I")
    public static int field8296;

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "I")
    public static int field8298;

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "I")
    public static int field8299;

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "I")
    public static int field8300;

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "I")
    public static int field8301;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IB)Lmia;", line = 4)
    public static final class63 method3364(int arg0, byte arg1) {
        if (arg1 >= -94) {
            field8303 = false;
        }
        field8296++;
        return new class63(arg0, false);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)Z", line = 20)
    public static final boolean method3365(byte arg0) {
        if (arg0 != 89) {
            method3369(11, -10, -104);
        }
        field8300++;
        return class514.field7217 != 0;
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)V", line = 31)
    public static final void method3366(byte arg0) {
        field8298++;
        if (arg0 == 98) {
            class310.field4077.method1161(false);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Ljava/net/Socket;BI)Lar;", line = 44)
    public static final class684 method3367(Socket arg0, byte arg1, int arg2) throws IOException {
        field8301++;
        if (arg1 != -51) {
            field8297 = null;
        }
        return new class411(arg0, arg2);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Z)V", line = 56)
    public static void method3368(boolean arg0) {
        if (!arg0) {
            method3369(71, 78, 20);
        }
        field8302 = null;
        field8297 = null;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)Z", line = 67)
    public static final boolean method3369(int arg0, int arg1, int arg2) {
        if (arg1 != 8) {
            field8303 = true;
        }
        field8299++;
        return class539.method3093(arg0, 96, arg2) || class63.method579(-23611, arg2, arg0);
    }
}
