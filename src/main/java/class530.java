import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class530 {

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field7064 = 0;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Laea;")
    public static class47 field7061 = new class47();

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field7063;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)Lkca;")
    public static final class76 method2957(int arg0, byte arg1) {
        field7063++;
        if (arg1 != -72) {
            field7064 = -96;
        }
        if (arg0 == 0) {
            if ((double) class567.field7506 == 3.0D) {
                return class237.field3348;
            }
            if ((double) class567.field7506 == 4.0D) {
                return class398.field5294;
            }
            if ((double) class567.field7506 == 6.0D) {
                return class225.field3188;
            }
            if ((double) class567.field7506 >= 8.0D) {
                return class154.field2437;
            }
        } else if (arg0 == 1) {
            if ((double) class567.field7506 == 3.0D) {
                return class225.field3188;
            }
            if ((double) class567.field7506 == 4.0D) {
                return class154.field2437;
            }
            if ((double) class567.field7506 == 6.0D) {
                return class352.field4811;
            }
            if ((double) class567.field7506 >= 8.0D) {
                return class218.field3095;
            }
        } else if (arg0 == 2) {
            if ((double) class567.field7506 == 3.0D) {
                return class352.field4811;
            }
            if ((double) class567.field7506 == 4.0D) {
                return class218.field3095;
            }
            if ((double) class567.field7506 == 6.0D) {
                return class436.field5964;
            }
            if ((double) class567.field7506 >= 8.0D) {
                return class697.field9786;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)Z")
    public static final boolean method2958(int arg0, int arg1) {
        if (arg1 >= -23) {
            return true;
        } else {
            field7062++;
            return arg0 == 10 || arg0 == 11 || arg0 == 12;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method2959(int arg0) {
        field7061 = null;
        if (arg0 != -9227) {
            field7061 = null;
        }
    }
}
