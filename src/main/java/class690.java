import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class690 implements class257 {

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public int field9426;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field9427 = 0;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field9423;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field9425;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "J")
    public static long field9424;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILkd;)V", line = 5)
    public static final void method3857(int arg0, class280 arg1) {
        field9423++;
        if (arg0 <= 5) {
            field9427 = -22;
        }
        class231 var2 = (class231) class402.field5703.method1180((byte) 26, (long) arg1.field7958);
        if (var2 == null) {
            return;
        }
        if (var2.field3123 != null) {
            class192.field2560.method1733(var2.field3123);
            var2.field3123 = null;
        }
        var2.method1185(-113);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)Lg;", line = 33)
    public final class153 method769(boolean arg0) {
        if (arg0) {
            this.method769(false);
        }
        field9425++;
        return class509.field7293;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(I)V", line = 46)
    public class690(int arg0) {
        this.field9426 = arg0;
    }
}
