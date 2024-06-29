import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class493 {

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field7192 = 0;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "Lvp;")
    public static class123 field7190 = new class123(17, -1);

    @OriginalMember(owner = "client!no", name = "d", descriptor = "J")
    public static long field7193 = -1L;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V", line = 7)
    public static void method2942(int arg0) {
        field7190 = null;
        if (arg0 >= -91) {
            field7192 = 7;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIZ)V", line = 20)
    public static final void method2943(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 == 0) {
            class114.method841(false, class53.field786);
            class427.field6243++;
        }
        field7191++;
        if (arg1 == 1) {
            class114.method841(false, class241.field3501);
            class341.field5206++;
        }
        if (!arg3) {
            return;
        }
        class86.field1436.method1905(class483.field7082 + arg2, -28);
        class86.field1436.method1923((byte) 62, class351.field5334.method1767(82, (byte) 57) ? 1 : 0);
        class86.field1436.method1875(class465.field6840 + arg0, (byte) -91);
        class48.field723 = arg0;
        class403.field5926 = arg2;
        class425.field6240 = false;
        class91.method740((byte) -61);
    }
}
