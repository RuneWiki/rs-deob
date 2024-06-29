import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class228 extends class41 {

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Z")
    public boolean field3910 = false;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lsc;")
    public static class181 field3911 = class149.method967(255, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "Lsc;")
    public static class181 field3917 = class149.method967(255, "runes");

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public int field3913;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public int field3914;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    public static void method1496(int arg0) {
        if (arg0 >= 67) {
            field3911 = null;
            field3917 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjb;)V")
    public static final void method1497(int arg0, class11 arg1) {
        field3912++;
        class247.field4321 = arg1.method107(class13.field260, 125);
        class125.field2071 = arg1.method107(class41.field624, 124);
        if (arg0 <= 30) {
            field3916 = 98;
        }
        class243.field4226 = arg1.method107(class194.field3396, 126);
        class55.field856 = arg1.method107(class212.field3647, 126);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/lang/Object;Lej;)V")
    public static final void method1498(int arg0, Object arg1, class142 arg2) {
        field3920++;
        if (arg2.field2292 == null) {
            return;
        }
        for (int var3 = arg0; var3 < 50 && arg2.field2292.peekEvent() != null; var3++) {
            class95.method632(true, 1L);
        }
        if (arg1 != null) {
            arg2.field2292.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
