import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class438 {

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field6368 = 0;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lbga;B)I")
    public static final int method2738(class356 arg0, byte arg1) {
        field6367++;
        int var2 = 104 % (-arg1 / 61);
        if (class94.field989 == arg0) {
            return 7681;
        } else if (class372.field4752 == arg0) {
            return 8448;
        } else if (class1.field4 == arg0) {
            return 34165;
        } else if (class360.field4624 == arg0) {
            return 260;
        } else if (class495.field7004 == arg0) {
            return 34023;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
