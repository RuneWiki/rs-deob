import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class402 {

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "[I")
    public static int[] field5702 = new int[2];

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Lgda;")
    public static class53 field5701 = new class53(56, 4);

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Lkk;")
    public static class188 field5703 = new class188(16);

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "Lgda;")
    public static class53 field5704 = new class53(41, 2);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public static void method2510(byte arg0) {
        field5703 = null;
        field5702 = null;
        field5701 = null;
        int var1 = 86 % ((arg0 + 14) / 53);
        field5704 = null;
    }
}
