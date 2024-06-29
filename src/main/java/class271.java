import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class class271 {

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public int field3648 = 0;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "Z")
    public boolean field3654 = true;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "Z")
    public boolean field3655 = true;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public int field3650 = 0;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "Z")
    public boolean field3658 = true;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public int field3651 = 127;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "Z")
    public boolean field3663 = true;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    public int field3666 = 3;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "Z")
    public boolean field3664 = true;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
    public int field3671 = 2;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "Z")
    public boolean field3677 = false;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public int field3653 = 0;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "Z")
    public boolean field3669 = true;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "Z")
    public boolean field3652 = true;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "Z")
    public boolean field3679 = false;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "Z")
    public boolean field3656 = true;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public int field3661 = 0;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public int field3665 = 1;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
    public int field3682 = 127;

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "I")
    public int field3676 = 2;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
    public int field3683 = 0;

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "Z")
    public boolean field3674 = true;

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "Z")
    public boolean field3681 = false;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "Z")
    public boolean field3667 = true;

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "Z")
    public boolean field3672 = true;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "Z")
    public boolean field3673 = true;

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "I")
    public int field3685 = 255;

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "I")
    public int field3689 = 0;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
    public int field3688 = 2;

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
    public int field3686 = 2;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
    public int field3687 = 0;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "Lvr;")
    public static class187 field3659 = new class187("WTQA", 2);

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "Ljava/awt/Font;")
    public static Font field3670;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "Z")
    public boolean field3649;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "Z")
    public boolean field3660;

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "Z")
    public boolean field3675;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "[Lo;")
    public static class359[] field3684;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)I")
    public final int method1593(int arg0, int arg1) {
        field3657++;
        if (arg1 < 54) {
            this.field3672 = true;
        }
        return arg0 == 1 || arg0 == 3 ? this.field3671 : this.field3687;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIZ)V")
    public final void method1594(int arg0, int arg1, boolean arg2) {
        field3678++;
        if (arg0 != 0) {
            this.field3658 = true;
        }
        if (arg1 == 1 || arg1 == 3) {
            this.field3675 = arg2;
        } else {
            this.field3660 = arg2;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
    public static void method1595(int arg0) {
        field3659 = null;
        field3670 = null;
        field3684 = null;
        if (arg0 != 0) {
            method1595(24);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IBI)V")
    public final void method1596(int arg0, byte arg1, int arg2) {
        field3668++;
        if (arg1 != -81) {
            this.field3683 = -31;
        }
        if (arg2 == 1 || arg2 == 3) {
            this.field3671 = arg0;
        } else {
            this.field3687 = arg0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZI)Z")
    public final boolean method1597(boolean arg0, int arg1) {
        if (arg0) {
            this.method1593(-34, -17);
        }
        field3680++;
        return arg1 == 1 || arg1 == 3 ? this.field3675 : this.field3660;
    }
}
