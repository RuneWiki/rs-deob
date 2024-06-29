import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class477 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public int field6934;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public int field6935;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public int field6938;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public int field6940;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Lhu;")
    public static class469 field6937;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static final void method2857(int arg0) {
        class353.field5479 = new class32(class120.field1690.method2335((byte) -100, class288.field4292), "", class479.field7008, 1003, -1, 0L, arg0, 0, true, false);
        field6936++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Z")
    public static final boolean method2858(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            field6939++;
            return (arg2 & 0x800) != 0 | class393.method2416(-128, arg2, arg1) || class170.method1196(arg2, arg0 ^ 0xB000, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public static void method2859(boolean arg0) {
        if (!arg0) {
            field6937 = null;
        }
        field6937 = null;
    }
}
