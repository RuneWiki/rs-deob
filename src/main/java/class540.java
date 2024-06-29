import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class540 {

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "I")
    public int field7523;

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    public int field7520;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
    public int field7515;

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
    public int field7522;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "[I")
    public static int[] field7516 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "F")
    public static float field7519;

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "Lbt;")
    public static class114 field7521;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IB)Lbaa;", line = 9)
    public final class540 method3034(int arg0, byte arg1) {
        if (arg1 < 108) {
            field7519 = 0.84947276F;
        }
        field7518++;
        return new class540(this.field7522, arg0, this.field7520, this.field7515);
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V", line = 25)
    public static void method3035(int arg0) {
        int var1 = 1 % ((36 - arg0) / 46);
        field7516 = null;
        field7521 = null;
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)V", line = 40)
    public static final void method3036(int arg0) {
        if (class64.field893 == 2) {
            class307.method1904(true, 3);
        } else if (class64.field893 == 6) {
            class307.method1904(true, 7);
        } else if (class64.field893 == 9) {
            class307.method1904(true, 10);
        }
        if (arg0 == 3273) {
            field7517++;
        }
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(IIII)V", line = 63)
    public class540(int arg0, int arg1, int arg2, int arg3) {
        this.field7523 = arg1;
        this.field7520 = arg2;
        this.field7515 = arg3;
        this.field7522 = arg0;
    }
}
