import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class248 {

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    private int field3563;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    private int field3565;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    private int field3561;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    private int field3570;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public int field3562;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public int field3559;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public int field3566;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public int field3567;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public int field3568;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public int field3560;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "Low;")
    public static class665 field3573 = new class665();

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "Lot;")
    public static class746 field3564;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 6)
    public static void method1646(int arg0) {
        if (arg0 <= -120) {
            field3564 = null;
            field3573 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BIIIIIIIIII)V", line = 18)
    public final void method1647(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field3570 = arg2 * arg2;
        this.field3565 = arg5;
        this.field3563 = arg4;
        field3569++;
        if (arg0 < 114) {
            method1646(69);
        }
        this.field3561 = arg7;
        this.field3559 = this.field3563 + arg9;
        this.field3567 = this.field3565 + arg6;
        this.field3568 = this.field3561 + arg3;
        this.field3562 = this.field3561 + arg1;
        this.field3566 = this.field3563 + arg10;
        this.field3560 = this.field3565 + arg8;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)V", line = 43)
    public static final void method1648(boolean arg0, int arg1) {
        if (arg0) {
            field3571++;
            class371 var2 = class490.method2867((byte) -64, 17, (long) arg1);
            var2.method2215(4);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)Z", line = 59)
    public final boolean method1649(int arg0, int arg1, int arg2, int arg3) {
        field3572++;
        if (arg3 < this.field3562 || arg3 > this.field3568) {
            return false;
        } else if (arg1 < this.field3559 || this.field3566 < arg1) {
            return false;
        } else if (this.field3560 <= arg2 && this.field3567 >= arg2) {
            int var5 = arg3 - this.field3561;
            int var6 = arg2 - this.field3565;
            if (arg0 >= -36) {
                this.field3560 = 55;
            }
            return var5 * var5 + var6 * var6 < this.field3570;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 85)
    public class248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field3563 = arg1;
        this.field3565 = arg2;
        this.field3561 = arg0;
        this.field3570 = arg3 * arg3;
        this.field3562 = this.field3561 + arg4;
        this.field3559 = this.field3563 + arg6;
        this.field3566 = this.field3563 + arg7;
        this.field3567 = this.field3565 + arg9;
        this.field3568 = this.field3561 + arg5;
        this.field3560 = this.field3565 + arg8;
    }
}
