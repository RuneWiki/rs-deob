import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class228 extends class191 {

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field3799 = -1;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "Lok;")
    private static class146 field3801 = class235.method1724(-12908, "glow3:");

    @OriginalMember(owner = "client!k", name = "z", descriptor = "Lok;")
    public static class146 field3807 = class235.method1724(-12908, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!k", name = "B", descriptor = "[I")
    public static int[] field3809 = new int[2048];

    @OriginalMember(owner = "client!k", name = "A", descriptor = "Lok;")
    public static class146 field3808 = field3801;

    @OriginalMember(owner = "client!k", name = "E", descriptor = "Lok;")
    private static class146 field3812 = class235.method1724(-12908, "Continue");

    @OriginalMember(owner = "client!k", name = "w", descriptor = "Lok;")
    public static class146 field3804 = field3801;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "Lok;")
    public static class146 field3813 = field3812;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    public int field3806;

    @OriginalMember(owner = "client!k", name = "C", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "Lok;")
    public class146 field3802;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "Lok;")
    public class146 field3811;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(I)Lbe;", line = 16)
    public final class292 method1679(int arg0) {
        if (arg0 == 2568) {
            field3800++;
            return class189.field3127[this.field3161];
        } else {
            return (class292) null;
        }
    }

    @OriginalMember(owner = "client!k", name = "g", descriptor = "(I)V", line = 43)
    public static void method1680(int arg0) {
        if (arg0 > -55) {
            return;
        }
        field3807 = null;
        field3808 = null;
        field3812 = null;
        field3809 = null;
        field3813 = null;
        field3804 = null;
        field3801 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Loh;B)V", line = 74)
    public static final void method1681(class15 arg0, byte arg1) {
        if (arg1 > -110) {
            field3809 = (int[]) null;
        }
        field3805++;
        class282.field4833 = arg0.method103(61, class140.field2345);
        class278.field4769 = arg0.method103(124, class62.field1074);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 97)
    public static final void method1682(Component arg0, int arg1) {
        arg0.removeMouseListener(class66.field1117);
        arg0.removeMouseMotionListener(class66.field1117);
        field3803++;
        arg0.removeFocusListener(class66.field1117);
        class35.field652 = arg1;
    }
}
