import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class27 {

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Ljava/lang/String;")
    public static String field457;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 11)
    public static void method218(int arg0) {
        field457 = null;
        if (arg0 != 1) {
            field457 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V", line = 21)
    public static final void method219(int arg0, int arg1, int arg2) {
        field456++;
        class434 var3 = class483.method2888(arg1, 50, 13);
        if (arg0 != 30727) {
            field457 = null;
        }
        var3.method2632((byte) 81);
        var3.field6310 = arg2;
    }
}
