import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class29 {

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field404 = 0;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)V")
    public static final void method273(int arg0, int arg1, int arg2) {
        if (arg2 != -9873) {
            method273(-17, 108, -49);
        }
        if (class568.field8311 != 0) {
            if (arg1 < 0) {
                for (int var3 = 0; var3 < 16; var3++) {
                    class183.field2881[var3] = arg0;
                }
            } else {
                class183.field2881[arg1] = arg0;
            }
        }
        field403++;
        class43.field585.method1801((byte) -22, arg0, arg1);
    }
}
