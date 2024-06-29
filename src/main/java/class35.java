import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class35 {

    @OriginalMember(owner = "client!va", name = "a", descriptor = "[J")
    public static long[] field493 = new long[100];

    @OriginalMember(owner = "client!va", name = "b", descriptor = "[I")
    public static int[] field494 = new int[2500];

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method219(int arg0) {
        field494 = null;
        if (arg0 <= 73) {
            method220(-95, -126, (byte) 76, 82, 12);
        }
        field493 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIBII)V")
    public static final void method220(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (class248.field3765 <= arg4 && arg4 <= class163.field2505) {
            int var5 = class86.method565(class243.field3635, arg1, class118.field1782, 8142);
            int var6 = class86.method565(class243.field3635, arg3, class118.field1782, 8142);
            class276.method1832(var5, arg4, -32768, var6, arg0);
        }
        if (arg2 != 24) {
            field493 = null;
        }
        field495++;
    }
}
