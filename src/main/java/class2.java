import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!aa")
public class class2 {

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "Lt;")
    public static class35 field64 = class3.method28(false, "Food Shop");

    @OriginalMember(owner = "mapview!aa", name = "d", descriptor = "Lt;")
    public static class35 field66 = class3.method28(false, "Saw Mill");

    @OriginalMember(owner = "mapview!aa", name = "i", descriptor = "Z")
    public static boolean field71 = false;

    @OriginalMember(owner = "mapview!aa", name = "g", descriptor = "Lt;")
    public static class35 field69 = class3.method28(false, "world");

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "mapview!aa", name = "f", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "mapview!aa", name = "h", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "mapview!aa", name = "j", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "Ljava/lang/String;")
    public static String field63;

    @OriginalMember(owner = "mapview!aa", name = "e", descriptor = "[I")
    public static int[] field67;

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;Z)I", line = 26)
    public static final int method24(KeyEvent arg0, boolean arg1) {
        int var2 = arg0.getKeyChar();
        if (arg1) {
            field64 = null;
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(B)V", line = 63)
    public static void method25(byte arg0) {
        if (arg0 < 126) {
            return;
        }
        field64 = null;
        field63 = null;
        field69 = null;
        field66 = null;
        field67 = null;
    }
}
