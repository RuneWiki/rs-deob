import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class122 extends class609 {

    @OriginalMember(owner = "client!fv", name = "C", descriptor = "I")
    public static int field1659 = 2;

    @OriginalMember(owner = "client!fv", name = "F", descriptor = "[Lci;")
    public static class451[] field1661 = null;

    @OriginalMember(owner = "client!fv", name = "A", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!fv", name = "B", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!fv", name = "D", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "Lql;")
    public static class738 field1656;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(FI)V", line = 3)
    public final void method879(float arg0, int arg1) {
        ++field1657;
        super.field8617 = arg0;
        int var3 = -51 % ((-47 - arg1) / 39);
    }

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "(B)V", line = 14)
    public static void method880(byte arg0) {
        field1656 = null;
        field1661 = null;
        if (arg0 != -113) {
            field1661 = null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(IIIIIF)V", line = 27)
    public class122(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIZ)V", line = 32)
    public final void method881(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            method882(46, -97, -74);
        }
        super.field8611 = arg0;
        super.field8614 = arg2;
        super.field8615 = arg1;
        ++field1660;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(III)Z", line = 45)
    public static final boolean method882(int arg0, int arg1, int arg2) {
        if (arg2 != -4109) {
            method880((byte) -1);
        }
        ++field1658;
        class211 var3 = class239.field3470.method388(arg1, arg2 + 4209);
        if (~arg0 == -12) {
            arg0 = 10;
        }
        if (~arg0 <= -6 && ~arg0 >= -9) {
            arg0 = 4;
        }
        return var3.method1431(arg0, (byte) -69);
    }
}
