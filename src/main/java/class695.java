import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class695 {

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "[Ljava/awt/Color;")
    public static Color[] field9859 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "Lec;")
    public static class146 field9862 = new class146(3);

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "I")
    public static int field9860;

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "I")
    public static int field9861;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)V", line = 5)
    public static void method3918(int arg0) {
        field9862 = null;
        if (arg0 != 3) {
            field9859 = null;
        }
        field9859 = null;
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(I)V", line = 18)
    public static final void method3919(int arg0) {
        field9861++;
        if (class504.field6675 == arg0) {
            class413.method2189((byte) 112, false);
        } else {
            class313.field4031 = class446.field5686;
            class446.field5686 = null;
            class361.method1987(13, arg0 - 134);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(III)Z", line = 36)
    public static final boolean method3920(int arg0, int arg1, int arg2) {
        field9860++;
        if (arg0 != 2048) {
            method3920(-69, 10, -20);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(II)I", line = 56)
    public static int method3921(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
