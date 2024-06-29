import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class413 extends class189 {

    @OriginalMember(owner = "client!za", name = "k", descriptor = "Lbda;")
    public static class505 field5819 = new class505(1);

    @OriginalMember(owner = "client!za", name = "j", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!za", name = "l", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V")
    public static final void method2538(boolean arg0) {
        class656.field8997 = -1;
        if (arg0) {
            method2540(false);
        }
        field5818++;
        class210.field2763 = -1;
        class454.field6418 = 0;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V")
    public static void method2539(int arg0) {
        field5819 = null;
        if (arg0 != -1) {
            field5819 = null;
        }
    }

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(Z)V")
    public static final void method2540(boolean arg0) {
        if (arg0) {
            return;
        }
        field5820++;
        if (class222.field2897 == 9) {
            class60.method514(false, 5);
        } else if (class222.field2897 == 5 || class222.field2897 == 6) {
            class60.method514(false, 3);
        } else if (class222.field2897 == 12) {
            class60.method514(false, 3);
        }
    }
}
