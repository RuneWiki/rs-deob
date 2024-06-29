import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class219 {

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field3514 = 0;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field3512 = 10;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "[I")
    public static int[] field3516 = new int[14];

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Ljh;")
    public static class253 field3511 = new class253(0, -1);

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "Lsb;")
    public static class124 field3513;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Lsb;")
    public static class124 field3515;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
    public static void method1452(boolean arg0) {
        field3515 = null;
        field3511 = null;
        field3516 = null;
        if (!arg0) {
            method1452(false);
        }
        field3513 = null;
    }
}
