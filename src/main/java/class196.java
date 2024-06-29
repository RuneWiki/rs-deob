import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class196 {

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "Lvf;")
    public static class265 field3503 = class87.method582(-46, "clignotant1:");

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "[I")
    public static int[] field3508 = new int[200];

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "Z")
    public static boolean field3505 = true;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "B")
    public static byte field3507;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public static void method1357(int arg0) {
        if (arg0 != 200) {
            method1358(4);
        }
        field3508 = null;
        field3503 = null;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)I")
    public static final int method1358(int arg0) {
        field3506++;
        if (arg0 > -55) {
            method1358(-99);
        }
        return class208.field3748;
    }
}
