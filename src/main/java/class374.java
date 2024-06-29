import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class374 {

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "J")
    public static long field5050 = 20000000L;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "J")
    public static volatile long field5049 = 0L;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Lbi;")
    public static class449 field5048;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 16)
    public static void method2200(byte arg0) {
        field5048 = null;
        if (arg0 != -41) {
            field5048 = null;
        }
    }
}
