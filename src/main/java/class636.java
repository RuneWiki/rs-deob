import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class636 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field9045;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field9046;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field9047;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method3699(int arg0, int arg1, int arg2) {
        field9045++;
        if (arg0 != -1) {
            method3700(false, 65);
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V", line = 22)
    public static final void method3700(boolean arg0, int arg1) {
        class101.method685(class582.field8281, true, arg0, class312.field4004, class58.field807);
        field9047++;
        if (arg1 != 1) {
            field9046 = -32;
        }
    }
}
