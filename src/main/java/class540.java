import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class540 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Z")
    public static boolean field7776 = false;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field7778 = 0;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field7777;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 15)
    public static final void method3178(String arg0, int arg1) {
        field7777++;
        if (arg0.equals("")) {
            return;
        }
        class340.field4392++;
        if (arg1 != 2317) {
            field7779 = 26;
        }
        class249 var2 = class289.method1715(class271.field3349, 99, class41.field470);
        var2.field3016.method1460(class729.method4063(arg1 ^ 0xFFFFF6F2, arg0), 24710);
        var2.field3016.method1480(arg0, false);
        class510.method3017(var2, arg1 ^ 0x961);
    }
}
