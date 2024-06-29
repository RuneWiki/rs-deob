import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class677 {

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "F")
    public static float field9647 = 0.0F;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field9644 = 0;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "[I")
    public static int[] field9636 = new int[2];

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Leda;")
    public static class116 field9632 = new class116(47, 0);

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "Leda;")
    public static class116 field9649 = new class116(63, 3);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field9631;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field9633;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public int field9634;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public int field9635;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public int field9637;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public int field9638;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public int field9639;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public int field9640;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public int field9641;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public int field9642;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public int field9643;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public int field9645;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public int field9646;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public int field9648;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILak;)Z")
    public final boolean method3828(int arg0, class677 arg1) {
        field9633++;
        if (arg0 == 47) {
            return this.field9648 == arg1.field9648 && this.field9646 == arg1.field9646 && this.field9640 == arg1.field9640;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BZ)Z")
    public static final boolean method3829(byte arg0, boolean arg1) {
        field9631++;
        boolean var2 = class637.field9048.method95();
        if (arg0 >= -126) {
            return false;
        } else if (arg1 == var2) {
            return true;
        } else {
            if (!arg1) {
                class637.field9048.method67();
            } else if (!class637.field9048.method100()) {
                arg1 = false;
            }
            if (var2 == arg1) {
                return false;
            } else {
                class525.field7713.field5964 = arg1;
                class525.field7713.method3481(true, class653.field9220);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static void method3830(int arg0) {
        field9649 = null;
        field9632 = null;
        if (arg0 != 16824) {
            method3830(-125);
        }
        field9636 = null;
    }
}
