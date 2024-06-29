import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class499 {

    @OriginalMember(owner = "client!va", name = "c", descriptor = "[I")
    public static int[] field6717 = new int[8];

    @OriginalMember(owner = "client!va", name = "g", descriptor = "Z")
    public static boolean field6721 = false;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Z")
    public static boolean field6715 = true;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Lva;")
    public class499 field6716;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Lva;")
    public class499 field6720;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lpb;BLpb;)V")
    public static final void method2814(class656 arg0, byte arg1, class656 arg2) {
        if (arg1 < 41) {
            field6715 = false;
        }
        field6719++;
        if (arg2.field8681 != null) {
            arg2.method3564(true);
        }
        arg2.field8681 = arg0.field8681;
        arg2.field8677 = arg0;
        arg2.field8681.field8677 = arg2;
        arg2.field8677.field8681 = arg2;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public final void method2815(int arg0) {
        if (arg0 >= -117) {
            return;
        }
        field6718++;
        if (this.field6720 != null) {
            this.field6720.field6716 = this.field6716;
            this.field6716.field6720 = this.field6720;
            this.field6716 = null;
            this.field6720 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
    public static void method2816(int arg0) {
        field6717 = null;
        if (arg0 != -7865) {
            field6715 = false;
        }
    }
}
