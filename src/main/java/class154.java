import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class154 extends OutputStream {

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "Ljw;")
    public static class581 field2108 = new class581(2, 6);

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "Ljw;")
    public static class581 field2109 = new class581(63, -1);

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
    public static void method1128(byte arg0) {
        if (arg0 != -42) {
            method1129(null, true, null);
        }
        field2109 = null;
        field2108 = null;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ltia;ZLtia;)V")
    public static final void method1129(class281 arg0, boolean arg1, class281 arg2) {
        field2107++;
        if (arg2.field4145 != null) {
            arg2.method1811(28064);
        }
        arg2.field4145 = arg0;
        if (!arg1) {
            arg2.field4146 = arg0.field4146;
            arg2.field4145.field4146 = arg2;
            arg2.field4146.field4145 = arg2;
        }
    }

    @OriginalMember(owner = "client!mr", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field2110++;
        throw new IOException();
    }
}
