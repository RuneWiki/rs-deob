import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class242 {

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "Lip;")
    public static class304 field3576;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "[Ltd;")
    public static class515[] field3575;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V")
    public static void method1662(int arg0) {
        field3575 = null;
        field3576 = null;
        if (arg0 != 15) {
            field3575 = null;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lqk;I)Ljava/lang/String;")
    public static final String method1663(class146 arg0, int arg1) {
        int var2 = 29 % ((-arg1 - 11) / 32);
        field3577++;
        if (client.method2732(arg0).method2860(false) == 0) {
            return null;
        } else if (arg0.field2137 == null || arg0.field2137.trim().length() == 0) {
            return class284.field3960 ? "Hidden-use" : null;
        } else {
            return arg0.field2137;
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)V")
    public static final void method1664(int arg0) {
        field3574++;
        class558.method3353((byte) 116);
        if (arg0 != 48) {
            field3576 = null;
        }
    }
}
