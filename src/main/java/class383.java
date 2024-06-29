import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class383 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[I")
    public static int[] field5747 = new int[14];

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "Lfa;")
    public static class564 field5749 = new class564();

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field5751 = 0;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Lla;")
    public static class422 field5748;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method2406(int arg0) {
        if (arg0 <= 22) {
            field5748 = null;
        }
        field5748 = null;
        field5747 = null;
        field5749 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZII)V")
    public static final void method2407(boolean arg0, int arg1, int arg2) {
        field5750++;
        class661.field9411 = arg1;
        if (!arg0) {
            method2407(true, 120, 44);
        }
        class478.field6934 = arg2;
        if (class554.field7897 == 0) {
            class208.field3477 = class146.field2300 * 2 + class661.field9411;
            class379.field5699 = class478.field6934 + (class694.field9852 * 2);
        } else if (class554.field7897 == 1) {
            class245.field3937 = class478.field6934 / class362.field5468 + class384.field5762 + 2;
            class390.field5830 = class661.field9411 / class412.field6070 + class558.field7923 + 2;
            class379.field5699 = class362.field5468 * class245.field3937;
            class208.field3477 = class412.field6070 * class390.field5830;
            class146.field2300 = class208.field3477 - class661.field9411 >> 1;
            class694.field9852 = class379.field5699 - class478.field6934 >> 1;
        } else if (class554.field7897 == 2) {
            class379.field5699 = class478.field6934;
            class208.field3477 = class661.field9411;
        }
    }
}
