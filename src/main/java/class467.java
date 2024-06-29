import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class467 {

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "F")
    public static float field6440 = 0.0F;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "[I")
    public static int[] field6437;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V", line = 8)
    public static final void method2651(byte arg0) {
        field6438++;
        if (class265.field3500 > 0) {
            class476.method2735(255);
            return;
        }
        class297.field3880 = class304.field4004;
        class304.field4004 = null;
        class507.method2898(arg0 ^ 0xFFFFFFD1, 40);
        if (arg0 != -48) {
            method2652(false);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Z)V", line = 29)
    public static void method2652(boolean arg0) {
        field6437 = null;
        if (arg0) {
            method2652(false);
        }
    }
}
