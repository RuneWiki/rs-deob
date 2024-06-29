import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class405 {

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public int field5404 = 0;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "[I")
    public static int[] field5407 = new int[] { 4, 4, 1, 2, 6, 4, 2, 45, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0 };

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public static int field5405 = -1;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Liaa;II)V", line = 4)
    private final void method2202(class452 arg0, int arg1, int arg2) {
        field5402++;
        if (arg2 == 5) {
            this.field5404 = arg0.method2574(-1758460248);
        }
        if (arg1 > -83) {
            method2204(55, 53);
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V", line = 21)
    public static void method2203(byte arg0) {
        field5407 = null;
        if (arg0 <= 95) {
            field5405 = 48;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)V", line = 33)
    public static final void method2204(int arg0, int arg1) {
        field5406++;
        class425.field5648 = arg0;
        class522.field7475.method3687((byte) -10);
        if (arg1 != 1) {
            method2204(25, -95);
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Liaa;B)V", line = 53)
    public final void method2205(class452 arg0, byte arg1) {
        field5403++;
        while (true) {
            int var3 = arg0.method2541(106);
            if (var3 == 0) {
                if (arg1 >= -105) {
                    field5407 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method2202(arg0, -128, var3);
        }
    }
}
