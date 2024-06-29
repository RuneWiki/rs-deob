import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class245 extends class292 {

    @OriginalMember(owner = "client!s", name = "E", descriptor = "Lrh;")
    public class47 field3795;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "Lta;")
    public static class262 field3797 = new class262(64);

    @OriginalMember(owner = "client!s", name = "M", descriptor = "Lta;")
    public static class262 field3802 = new class262(64);

    @OriginalMember(owner = "client!s", name = "D", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "Luf;")
    public static class176 field3798;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "Luf;")
    public static class176 field3800;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "Lqd;")
    public static class3 field3803;

    @OriginalMember(owner = "client!s", name = "L", descriptor = "Z")
    public static boolean field3801;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "[[[I")
    public static int[][][] field3799;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BLjava/lang/Object;Z)[B")
    public static final byte[] method1658(byte arg0, Object arg1, boolean arg2) {
        field3794++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class220.method1476((byte) 62, var3) : var3;
        } else if (arg1 instanceof class9) {
            class9 var4 = (class9) arg1;
            return var4.method109(0);
        } else {
            if (arg0 > -116) {
                field3801 = false;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)I")
    public static final int method1659(int arg0) {
        if (arg0 <= 52) {
            field3799 = null;
        }
        field3796++;
        return 0;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lrh;)V")
    public class245(class47 arg0) {
        this.field3795 = arg0;
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
    public static void method1660(int arg0) {
        field3798 = null;
        field3800 = null;
        field3797 = null;
        field3803 = null;
        field3802 = null;
        field3799 = null;
        if (arg0 != 64) {
            field3800 = null;
        }
    }
}
