import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class class204 {

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Lcc;")
    public static class209 field3653 = class95.method669(102, "Titelbild ge-Offnet)3");

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Lcc;")
    private static class209 field3650 = class95.method669(124, "Walk here");

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lcc;")
    public static class209 field3651 = field3650;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field3647 = -1;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method1395(Component arg0, byte arg1);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)V")
    public static final void method1396(int arg0, boolean arg1) {
        field3648++;
        if (arg1) {
            method1396(48, false);
        }
        if (arg0 == -1 && !class94.field1865) {
            class80.method567(-98);
        } else if (arg0 != -1 && (class59.field1184 != arg0 || !class244.method1700((byte) 65)) && class258.field4662 != 0 && !class94.field1865) {
            class185.method1258(false, class279.field4902, arg0, class258.field4662, 0, 2, -116);
        }
        class59.field1184 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static void method1397(byte arg0) {
        field3653 = null;
        field3650 = null;
        if (arg0 < 2) {
            field3651 = null;
        }
        field3651 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1398(Component arg0, int arg1);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)I")
    public abstract int method1399(int arg0);
}
