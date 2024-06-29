import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public class class30 {

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "Lv;")
    public static class40 field427 = class24.method170("Apothecary", (byte) -106);

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "Lv;")
    public static class40 field428 = class24.method170("Sword Shop", (byte) -98);

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "Lv;")
    public static class40 field429 = class24.method170("Shield Shop", (byte) -100);

    @OriginalMember(owner = "mapview!q", name = "e", descriptor = "Lv;")
    public static class40 field430 = class24.method170("Legende", (byte) 89);

    @OriginalMember(owner = "mapview!q", name = "f", descriptor = "[J")
    public static long[] field431 = new long[32];

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(ZLjava/awt/Component;)V", line = 26)
    public static final void method197(boolean arg0, Component arg1) {
        arg1.addMouseListener(class23.field261);
        arg1.addMouseMotionListener(class23.field261);
        if (!arg0) {
            field426 = -80;
        }
        arg1.addFocusListener(class23.field261);
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(B)V", line = 43)
    public static void method198(byte arg0) {
        field431 = null;
        field430 = null;
        if (arg0 >= -3) {
            field426 = 73;
        }
        field427 = null;
        field429 = null;
        field428 = null;
    }
}
