import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class23 {

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "Lpq;")
    public static class159 field219;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Lpq;")
    public static class159 field223;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "[B")
    public static byte[] field221;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BII)V", line = 5)
    public static final void method138(byte arg0, int arg1, int arg2) {
        class389.method2326((byte) 118, class528.field7305);
        if (arg0 > -5) {
            method139(true);
        }
        class160.field2027++;
        field220++;
        class253.field3491.method896(1464076016, arg1);
        class253.field3491.method906(-1, arg2);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V", line = 23)
    public static void method139(boolean arg0) {
        if (!arg0) {
            field221 = null;
        }
        field221 = null;
        field219 = null;
        field223 = null;
    }
}
