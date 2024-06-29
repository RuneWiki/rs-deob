import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class45 {

    @OriginalMember(owner = "client!e", name = "b", descriptor = "Lmb;")
    private static class132 field774 = class166.method1092("Free world", 117);

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Lmb;")
    public static class132 field778 = field774;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "Lmb;")
    public static class132 field773 = class166.method1092("Bitte warten Sie)3)3)3", 112);

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field784 = -1;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "Lmb;")
    public static class132 field781 = class166.method1092("cross", 127);

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Lmb;")
    public static class132 field782 = class166.method1092("Spieler", 126);

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field783 = 0;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field775 = 0;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Z")
    public static boolean field785;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "[Lvi;")
    public static class233[] field780;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/Object;Lhf;I)V")
    public static final void method304(Object arg0, class83 arg1, int arg2) {
        field777++;
        if (arg1.field1401 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field1401.peekEvent() != null; var3++) {
            class130.method856(1, 1L);
        }
        if (arg2 != 1) {
            method305(true);
        }
        if (arg0 != null) {
            arg1.field1401.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V")
    public static void method305(boolean arg0) {
        field780 = null;
        field781 = null;
        field773 = null;
        field774 = null;
        field782 = null;
        field778 = null;
        if (arg0) {
            field783 = -51;
        }
    }
}
