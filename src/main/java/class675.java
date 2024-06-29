import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class675 {

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field9572 = 0;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field9571;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static final void method3778(byte arg0) {
        field9571++;
        if (arg0 < 124) {
            return;
        }
        if (class351.field4601 == 3) {
            class508.method2921(4, (byte) -97);
        } else if (class351.field4601 == 7) {
            class508.method2921(8, (byte) -121);
        } else if (class351.field4601 == 10) {
            class508.method2921(11, (byte) -127);
            return;
        }
    }
}
