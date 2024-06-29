import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class14 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field222 = 0;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "Z")
    public static boolean field226 = true;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "Lck;")
    private static class119 field227 = class298.method1987((byte) 65, "cyan:");

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "Lck;")
    public static class119 field223 = field227;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "Lck;")
    public static class119 field218 = field227;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "Z")
    public static boolean field220;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V", line = 20)
    public static final void method117(boolean arg0) {
        class32.field470.method486((byte) 93);
        field219++;
        if (!arg0) {
            field222 = 99;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIII)V", line = 41)
    public static final void method118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class270.field4458 = arg4;
        class164.field2589 = arg5;
        if (arg0 == 13724) {
            class81.field1233 = arg2;
            class254.field4089 = arg1;
            field216++;
            class297.field5008 = arg3;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 79)
    public static void method119(int arg0) {
        if (arg0 == 0) {
            field218 = null;
            field223 = null;
            field227 = null;
        }
    }
}
