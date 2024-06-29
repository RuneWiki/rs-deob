import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class657 {

    @OriginalMember(owner = "client!no", name = "c", descriptor = "[I")
    public static int[] field8937 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!no", name = "e", descriptor = "S")
    public static short field8939 = 32767;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "[I")
    public static int[] field8941 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "Lkf;")
    public static class237 field8935;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "[I")
    public static int[] field8938;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "[Lxa;")
    public static class468[] field8940;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(III)I")
    public static final int method3665(int arg0, int arg1, int arg2) {
        field8936++;
        if (arg0 != -1647235009) {
            field8935 = null;
        }
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V")
    public static void method3666(byte arg0) {
        field8938 = null;
        field8935 = null;
        int var1 = -111 % ((arg0 - 83) / 37);
        field8937 = null;
        field8940 = null;
        field8941 = null;
    }
}
