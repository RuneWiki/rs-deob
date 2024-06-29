import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class430 {

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Lhg;")
    public static class693 field5751 = new class693(45, 15);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Z")
    public static boolean field5752;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V", line = 45)
    public static void method2463(boolean arg0) {
        field5751 = null;
        if (arg0) {
            method2463(false);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILug;)V", line = 57)
    public static final void method2464(int arg0, class563 arg1) {
        if (arg0 == 30240) {
            class43.field636 = arg1;
            field5749++;
        }
    }
}
