import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class class202 {

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3657 = 0;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lkh;")
    private static class117 field3659 = class224.method1450((byte) 122, "Welcome to RuneScape");

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Lkh;")
    public static class117 field3661 = class224.method1450((byte) 114, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field3658 = -1;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Lkh;")
    public static class117 field3660 = field3659;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "[Llh;")
    public static class128[] field3655;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)I")
    public abstract int method386(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public abstract void method385(byte arg0);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    public static void method1346(boolean arg0) {
        field3661 = null;
        field3660 = null;
        field3659 = null;
        field3655 = null;
        if (arg0) {
            method1346(true);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1347(byte arg0, Component arg1) {
        arg1.addMouseListener(class199.field3581);
        arg1.addMouseMotionListener(class199.field3581);
        field3656++;
        arg1.addFocusListener(class199.field3581);
        if (arg0 <= 30) {
            field3660 = null;
        }
    }
}
