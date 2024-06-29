import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class620 {

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "Ldc;")
    public static class303 field8837 = new class303(7, 0, 1, 1);

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field8839 = 0;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V", line = 8)
    public static void method3499(int arg0) {
        field8837 = null;
        if (arg0 != -5793) {
            field8837 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IBLr;)Lll;", line = 27)
    public static final class490 method3500(int arg0, byte arg1, class98 arg2) {
        field8836++;
        if (arg1 == -53) {
            class173 var3 = class673.method3811(true, arg2, arg0, (byte) -47);
            return var3 == null ? null : var3.field2787;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IZI)Lis;", line = 52)
    public static final class101 method3501(int arg0, boolean arg1, int arg2) {
        field8838++;
        class101 var3 = class271.method1711(arg0, 23727);
        if (arg2 == -1) {
            return var3;
        } else if (arg1) {
            return null;
        } else if (var3 == null || var3.field1578 == null || var3.field1578.length <= arg2) {
            return null;
        } else {
            return var3.field1578[arg2];
        }
    }
}
