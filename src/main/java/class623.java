import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class623 extends class627 {

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field8702 = 0;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "F")
    public static float field8706;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field8703;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field8704;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field8707;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "J")
    public long field8700;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Lab;")
    public class623 field8705;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "Lab;")
    public class623 field8708;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)Z")
    public static final boolean method3408(int arg0, int arg1) {
        field8703++;
        if (arg1 == 8) {
            return arg0 >= 4 && arg0 <= 8;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public final void method3409(int arg0) {
        field8701++;
        if (this.field8708 == null) {
            return;
        }
        this.field8708.field8705 = this.field8705;
        this.field8705.field8708 = this.field8708;
        this.field8705 = null;
        this.field8708 = null;
        int var2 = -19 / ((-arg0 - 75) / 38);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)V")
    public static final void method3410(int arg0, int arg1) {
        field8704++;
        if (arg1 > -126) {
            return;
        }
        class303 var2 = (class303) class274.field3460.method3248((long) arg0, 0);
        if (var2 != null) {
            var2.field3898.method1825(10);
            class205.method1270(var2.field3899, 1, var2.field3900);
            var2.method3426((byte) -67);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Z")
    public final boolean method3411(byte arg0) {
        field8707++;
        if (this.field8708 == null) {
            return false;
        } else if (arg0 <= 82) {
            return true;
        } else {
            return true;
        }
    }
}
