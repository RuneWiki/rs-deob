import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class476 {

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "Lmq;")
    public static class78 field6802 = new class78(17, -2);

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "[I")
    public static int[] field6803 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "Lus;")
    public static class328 field6804 = new class328(44, 7);

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V", line = 20)
    public static void method2787(boolean arg0) {
        field6804 = null;
        if (!arg0) {
            method2787(true);
        }
        field6803 = null;
        field6802 = null;
    }
}
