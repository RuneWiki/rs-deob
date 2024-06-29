import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class598 extends class450 {

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!oea", name = "g", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!oea", name = "h", descriptor = "I")
    public static int field7845;

    @OriginalMember(owner = "client!oea", name = "i", descriptor = "I")
    public static int field7846;

    @OriginalMember(owner = "client!oea", name = "j", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!oea", name = "k", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!oea", name = "l", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V")
    public final void method73(byte arg0) {
        ++field7846;
        if (super.field6170 < 0 && ~super.field6170 < -5) {
            super.field6170 = this.method68(false);
        }
        if (arg0 != 98) {
            field7848 = -108;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        ++field7844;
        return arg0 != 0 ? 45 : 1;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZI)V")
    public final void method67(boolean arg0, int arg1) {
        ++field7843;
        if (arg0) {
            super.field6170 = arg1;
        }
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(Lup;)V")
    public class598(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Z)I")
    public final int method68(boolean arg0) {
        ++field7845;
        if (~super.field6171.method1680(-18640).method1228(-47) < -2) {
            return 4;
        } else {
            if (arg0) {
                this.method3261(true);
            }
            return 2;
        }
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(ILup;)V")
    public class598(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(III)Z")
    public static final boolean method3260(int arg0, int arg1, int arg2) {
        ++field7849;
        if (arg1 != 4) {
            method3260(122, 94, -120);
        }
        return ~(65536 & arg2) != -1;
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(Z)I")
    public final int method3261(boolean arg0) {
        if (!arg0) {
            method3260(6, 83, -37);
        }
        ++field7847;
        return super.field6170;
    }
}
