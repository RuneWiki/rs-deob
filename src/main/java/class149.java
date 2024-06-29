import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class149 {

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field2399 = 0;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[I")
    public static int[] field2398 = new int[2048];

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLja;)V", line = 5)
    public static final void method1150(byte arg0, class64 arg1) {
        field2400++;
        class202.field3175 = arg1;
        if (arg0 != -70) {
            method1150((byte) 118, (class64) null);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V", line = 19)
    public static void method1151(byte arg0) {
        field2398 = null;
        if (arg0 <= 45) {
            method1151((byte) -79);
        }
    }
}
