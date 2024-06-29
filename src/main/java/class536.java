import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class536 {

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public int field7851;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field7848 = -1;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field7853;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "Loi;")
    public static class53 field7850;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "[Lo;")
    public static class24[] field7852;

    @OriginalMember(owner = "client!nh", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field7853++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 24)
    public static final void method3152(int arg0) {
        if (class151.field2167.toLowerCase().indexOf("microsoft") == -1) {
            class234.field3412[91] = 42;
            class234.field3412[93] = 43;
            class234.field3412[45] = 26;
            class234.field3412[46] = 72;
            if (class151.field2174 == null) {
                class234.field3412[222] = 59;
                class234.field3412[192] = 58;
            } else {
                class234.field3412[222] = 58;
                class234.field3412[520] = 59;
                class234.field3412[192] = 28;
            }
            class234.field3412[61] = 27;
            class234.field3412[59] = 57;
            class234.field3412[44] = 71;
            class234.field3412[47] = 73;
            class234.field3412[92] = 74;
        } else {
            class234.field3412[187] = 27;
            class234.field3412[188] = 71;
            class234.field3412[191] = 73;
            class234.field3412[190] = 72;
            class234.field3412[186] = 57;
            class234.field3412[220] = 74;
            class234.field3412[192] = 58;
            class234.field3412[221] = 43;
            class234.field3412[219] = 42;
            class234.field3412[189] = 26;
            class234.field3412[223] = 28;
            class234.field3412[222] = 59;
        }
        if (arg0 > -103) {
            method3153(-100);
        }
        field7849++;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V", line = 74)
    public static void method3153(int arg0) {
        field7850 = null;
        if (arg0 == 192) {
            field7852 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 87)
    public class536(String arg0, int arg1) {
        this.field7851 = arg1;
    }
}
