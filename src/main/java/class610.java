import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class610 {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[I")
    public static int[] field8513 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field8512;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field8515;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field8516;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field8514;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method3378(int arg0, int arg1, int arg2) {
        field8515++;
        if (arg1 != 262144) {
            field8512 = 31;
        }
        return class611.method3440(false, arg0, arg2) | (arg2 & 0x40000) != 0 || class391.method2283(arg0, (byte) 116, arg2);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 15)
    public static void method3379(int arg0) {
        if (arg0 != 14441) {
            field8513 = null;
        }
        field8513 = null;
        field8514 = null;
    }
}
