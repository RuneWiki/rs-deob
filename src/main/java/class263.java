import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class263 extends class38 {

    @OriginalMember(owner = "client!jm", name = "F", descriptor = "Z")
    public static boolean field4321 = false;

    @OriginalMember(owner = "client!jm", name = "G", descriptor = "Ljava/lang/String;")
    public static String field4322 = "slide:";

    @OriginalMember(owner = "client!jm", name = "H", descriptor = "I")
    public static int field4323 = 0;

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!jm", name = "I", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!jm", name = "E", descriptor = "[Lbn;")
    public static class75[] field4320;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 8)
    public static final void method1848(Component arg0, byte arg1) {
        field4319++;
        arg0.removeKeyListener(class181.field3149);
        arg0.removeFocusListener(class181.field3149);
        class173.field2880 = -1;
        int var2 = -59 / ((59 - arg1) / 38);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lek;I)V", line = 27)
    public static final void method1849(class206 arg0, int arg1) {
        class108.field1993 = arg0;
        if (arg1 <= 12) {
            field4322 = (String) null;
        }
        field4324++;
        class197.field3306 = class108.field1993.method1417(true, 4);
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)V", line = 52)
    public static void method1850(int arg0) {
        field4322 = null;
        field4320 = null;
        if (arg0 != 4) {
            method1849((class206) null, 55);
        }
    }
}
