import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public abstract class class262 {

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "[I")
    public static int[] field3834 = new int[1000];

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "Ljn;")
    public static class134 field3835 = new class134(119, 7);

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "Ljn;")
    public static class134 field3836 = new class134(126, 6);

    @OriginalMember(owner = "client!bfa", name = "f", descriptor = "[Z")
    public static boolean[] field3837 = new boolean[8];

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!bfa", name = "g", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V")
    public static void method1725(byte arg0) {
        field3835 = null;
        if (arg0 >= -37) {
            method1726(-0.29517602214385796D, 65);
        }
        field3834 = null;
        field3836 = null;
        field3837 = null;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(DI)V")
    public static final void method1726(double arg0, int arg1) {
        if (arg1 != -25645) {
            field3838 = -82;
        }
        field3832++;
        if (class381.field5455 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
            class43.field441[var3] = var4 <= 255 ? var4 : 255;
        }
        class381.field5455 = arg0;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(II)Z")
    public static final boolean method1727(int arg0, int arg1) {
        if (arg0 == -13) {
            field3833++;
            return arg1 >= 12 && arg1 <= 17;
        } else {
            return false;
        }
    }
}
