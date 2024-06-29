import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class70 {

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "Lhb;")
    public static class347 field693 = new class347(2);

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
    public static void method365(int arg0) {
        field693 = null;
        if (arg0 != 23941) {
            method365(42);
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)I")
    public static final int method366(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class531.field7481 - 1; var2++) {
            if (arg0 < class61.field625[var2] + class494.field7162[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class531.field7481 - 1;
        }
        return var1;
    }
}
