import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class232 extends class325 {

    @OriginalMember(owner = "client!um", name = "K", descriptor = "Lqd;")
    public class201 field3538;

    @OriginalMember(owner = "client!um", name = "E", descriptor = "[I")
    public static int[] field3532 = new int[14];

    @OriginalMember(owner = "client!um", name = "J", descriptor = "[I")
    public static int[] field3537 = new int[32];

    @OriginalMember(owner = "client!um", name = "F", descriptor = "I")
    public static int field3533 = 0;

    @OriginalMember(owner = "client!um", name = "G", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!um", name = "H", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!um", name = "I", descriptor = "Ljd;")
    public static class95 field3536;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V", line = 15)
    public static void method1631(int arg0) {
        field3532 = null;
        if (arg0 == 8160) {
            field3537 = null;
            field3536 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)Z", line = 32)
    public static final boolean method1632(int arg0) {
        field3535++;
        if (class106.field1540 == 0) {
            int var1 = 13 % ((-arg0 - 42) / 60);
            return class216.field3310.method435(false);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lqd;)V", line = 53)
    public class232(class201 arg0) {
        this.field3538 = arg0;
    }
}
