import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class662 extends class512 {

    @OriginalMember(owner = "client!eba", name = "p", descriptor = "Z")
    public static boolean field9335 = false;

    @OriginalMember(owner = "client!eba", name = "o", descriptor = "I")
    public static int field9334;

    @OriginalMember(owner = "client!eba", name = "q", descriptor = "I")
    public static int field9336;

    @OriginalMember(owner = "client!eba", name = "r", descriptor = "I")
    public static int field9337;

    @OriginalMember(owner = "client!eba", name = "s", descriptor = "I")
    public static int field9338;

    @OriginalMember(owner = "client!eba", name = "t", descriptor = "I")
    public static int field9339;

    @OriginalMember(owner = "client!eba", name = "u", descriptor = "I")
    public static int field9340;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZZ)V")
    public final void method33(boolean arg0, boolean arg1) {
        ++field9339;
        if (!arg0) {
            field9335 = true;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIZ)V")
    public final void method38(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            ++field9336;
        }
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)V")
    public final void method39(int arg0) {
        if (arg0 == 6) {
            ++field9338;
        }
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lpga;)V")
    public class662(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "(I)Z")
    public final boolean method35(int arg0) {
        int var2 = 73 / ((-72 - arg0) / 37);
        ++field9340;
        return false;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IILlo;)V")
    public final void method40(int arg0, int arg1, class117 arg2) {
        super.field7153.method2933((byte) -81, arg2);
        ++field9334;
        if (arg1 != -37) {
            field9335 = true;
        }
        super.field7153.method2881(arg0, -1);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IZ)V")
    public final void method36(int arg0, boolean arg1) {
        ++field9337;
        if (arg0 > -62) {
            field9335 = true;
        }
    }
}
