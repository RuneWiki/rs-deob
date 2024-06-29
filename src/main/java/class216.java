import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class216 {

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "[I")
    public static int[] field3530 = new int[50];

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "J")
    public static long field3526;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Z", line = 8)
    public static final boolean method1499(int arg0, int arg1) {
        field3529++;
        if (arg0 == -19308) {
            return (arg1 >> 31 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 30)
    public static final void method1500(int arg0) {
        field3531++;
        class224.field3629.method1484(false);
        if (arg0 != -17121) {
            method1501(62);
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 43)
    public static void method1501(int arg0) {
        if (arg0 == 23972) {
            field3530 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIILme;)[Llj;", line = 60)
    public static final class5[] method1502(int arg0, int arg1, int arg2, class295 arg3) {
        field3533++;
        if (class33.method222(6, arg1, arg2, arg3)) {
            int var4 = -35 % ((-arg0 - 11) / 41);
            return class145.method1054((byte) -99);
        } else {
            return null;
        }
    }
}
