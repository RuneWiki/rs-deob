import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class680 {

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "Z")
    public static boolean field9681 = false;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field9683 = 1;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "[I")
    public static int[] field9679 = new int[] { 25000, 2000 };

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "Leda;")
    public static class116 field9684 = new class116(3, -1);

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public int field9674;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field9675;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field9676;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public int field9677;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public int field9678;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public static int field9680;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public int field9682;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)[Lkga;")
    public static final class520[] method3846(int arg0) {
        if (arg0 > -114) {
            field9684 = null;
        }
        field9676++;
        return new class520[] { class198.field3079, class480.field6872, class440.field6367 };
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
    public static final void method3847(int arg0) {
        field9680++;
        if (arg0 != 0) {
            field9683 = 82;
        }
        class117 var1 = class603.field8668;
        synchronized (class603.field8668) {
            class603.field8668.method936(-113);
        }
        class117 var2 = class45.field602;
        synchronized (class45.field602) {
            class45.field602.method936(-48);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static void method3848(byte arg0) {
        field9679 = null;
        field9684 = null;
        if (arg0 < 95) {
            method3847(-22);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIZ)V")
    public static final void method3849(int arg0, int arg1, boolean arg2) {
        field9675++;
        if (!arg2) {
            return;
        }
        if (class486.field6942 == class302.field4235) {
            if (!class534.method3135(arg1, 0, 1, -125, 1, false, -2, 0, arg0)) {
                class534.method3135(arg1, 0, 1, 106, 1, false, -3, 0, arg0);
            }
        } else if (!class534.method3135(arg1, 0, 1, -84, 1, false, -3, 0, arg0)) {
            class534.method3135(arg1, 0, 1, 122, 1, false, -2, 0, arg0);
        }
    }
}
