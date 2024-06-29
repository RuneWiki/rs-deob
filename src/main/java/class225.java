import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class225 extends class17 {

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "I")
    public static int field3652 = 0;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    public static int field3653 = 0;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    public static int field3659 = 0;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
    public static volatile int field3661 = -1;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "B")
    public byte field3654;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    public int field3655;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "Lwd;")
    public class162 field3660;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(II)V")
    public static final void method1540(int arg0, int arg1) {
        class274.field4401 = 3;
        class98.field1584 = 100;
        class26.field331 = arg0;
        ++field3656;
        class119.field1907 = -1;
        if (arg1 != 0) {
            field3652 = 19;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)I")
    public final int method68(byte arg0) {
        int var2 = -25 / ((64 - arg0) / 48);
        ++field3657;
        return this.field3660 == null ? 0 : this.field3660.field2568 * 100 / (this.field3660.field2573.length - this.field3654);
    }

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "(I)[B")
    public final byte[] method66(int arg0) {
        if (arg0 > -44) {
            field3653 = -14;
        }
        ++field3658;
        if (!super.field205 && ~this.field3660.field2568 <= ~(this.field3660.field2573.length - this.field3654)) {
            return this.field3660.field2573;
        } else {
            throw new RuntimeException();
        }
    }
}
