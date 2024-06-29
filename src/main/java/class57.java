import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class57 {

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(BI)V")
    public static final void method517(byte arg0, int arg1) {
        field693++;
        class372.field5543.method91(70, arg1);
        class100.field1426.method91(58, arg1);
        if (arg0 < -49) {
            class23.field282.method91(104, arg1);
            class48.field619.method91(63, arg1);
            class202.field3364.method91(110, arg1);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZII)Z")
    public static final boolean method518(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field692++;
            return class265.method1768(arg2, (byte) -79, arg1) & class405.method2528(arg1, false, arg2);
        } else {
            return false;
        }
    }
}
