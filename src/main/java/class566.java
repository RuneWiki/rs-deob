import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class566 {

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field7799 = 0;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field7797 = 0;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field7796 = -1;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field7800;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
    public static final void method3267(int arg0, int arg1) {
        class137.field1715 = arg1;
        field7798++;
        class288 var2 = class462.field6485;
        synchronized (class462.field6485) {
            class462.field6485.method1690(arg0 ^ arg0);
        }
        class288 var3 = class692.field9424;
        synchronized (class692.field9424) {
            class692.field9424.method1690(0);
        }
    }
}
