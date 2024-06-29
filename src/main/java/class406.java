import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class406 {

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Lad;")
    public static class426 field5948 = new class426(8, 1);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
    public static void method2529(boolean arg0) {
        field5948 = null;
        if (arg0) {
            field5949 = 37;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIII)I")
    public static final int method2530(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field5947++;
        if (var4 == 0) {
            return arg1;
        } else if (~var4 == arg2) {
            return arg0;
        } else if (var4 == 2) {
            return 4095 - arg1;
        } else {
            return 4095 - arg0;
        }
    }
}
