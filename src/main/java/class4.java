import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class4 {

    @OriginalMember(owner = "client!uha", name = "f", descriptor = "Lqia;")
    public static class547 field33 = new class547();

    @OriginalMember(owner = "client!uha", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field34 = new String[200];

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!uha", name = "d", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "client!uha", name = "e", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!uha", name = "c", descriptor = "[I")
    public static int[] field30;

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)V", line = 14)
    public static void method15(int arg0) {
        field30 = null;
        if (arg0 != 200) {
            field34 = null;
        }
        field34 = null;
        field33 = null;
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(I)V", line = 26)
    public static final void method16(int arg0) {
        field29++;
        if (class147.field1776 == null) {
            return;
        }
        class733.field10249 = new class400();
        class733.field10249.method2372(class147.field1776.field2747.method3261(class416.field5920, (byte) 82), class147.field1776, class147.field1776.field2749, class551.field7749, (byte) -118);
        if (arg0 != 200) {
            method16(-125);
        }
        class238.field3077 = new Thread(class733.field10249, "");
        class238.field3077.start();
    }
}
