import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class242 {

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field3711 = 0;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3712 = "Face here";

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "Lhc;")
    public static class235 field3713;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZII)I")
    public static final int method1625(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field3714++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else if (arg1) {
            return 7 - arg2;
        } else {
            return -18;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static void method1626(int arg0) {
        if (arg0 == 7) {
            field3712 = null;
            field3713 = null;
        }
    }
}
