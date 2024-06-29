import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class649 extends class183 {

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "Lcw;")
    public static class179 field9170 = null;

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
    public static int field9171;

    @OriginalMember(owner = "client!rs", name = "s", descriptor = "I")
    public static int field9172;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(B)V")
    public static void method3677(byte arg0) {
        int var1 = -37 % ((arg0 - -4) / 52);
        field9170 = null;
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Leq;Leq;Lk;)V")
    public class649(class209 arg0, class209 arg1, class562 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IBZI)V")
    public final void method1309(int arg0, byte arg1, boolean arg2, int arg3) {
        if (arg1 > -100) {
            field9170 = null;
        }
        ++field9171;
        int var5 = this.method1307(false) * super.field2610.field3705 / 10000;
        class359.field5046.method630(arg0, arg3 - -2, var5, super.field2610.field3701 + -2, ((class562) super.field2610).field7966, 0);
        class359.field5046.method630(arg0 - -var5, arg3 + 2, -var5 + super.field2610.field3705, super.field2610.field3701 - 2, 0, 0);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIZI)V")
    public final void method1313(int arg0, int arg1, boolean arg2, int arg3) {
        class359.field5046.method616(arg3 + -2, arg0, super.field2610.field3705 + 4, super.field2610.field3701 + 2, ((class562) super.field2610).field7964, 0);
        ++field9172;
        class359.field5046.method616(arg3 + -1, arg0 + 1, super.field2610.field3705 + 2, super.field2610.field3701, arg1, 0);
    }
}
