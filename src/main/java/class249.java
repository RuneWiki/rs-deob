import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class249 extends class352 {

    @OriginalMember(owner = "client!oo", name = "K", descriptor = "Lfb;")
    public static class341 field3677 = new class341(new byte[5000]);

    @OriginalMember(owner = "client!oo", name = "O", descriptor = "I")
    public static int field3681 = 0;

    @OriginalMember(owner = "client!oo", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field3683 = "flash3:";

    @OriginalMember(owner = "client!oo", name = "S", descriptor = "Ljava/lang/String;")
    public static String field3685 = "Loading interfaces - ";

    @OriginalMember(owner = "client!oo", name = "H", descriptor = "I")
    public int field3674;

    @OriginalMember(owner = "client!oo", name = "J", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!oo", name = "L", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!oo", name = "N", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!oo", name = "R", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!oo", name = "P", descriptor = "Leg;")
    public class330 field3682;

    @OriginalMember(owner = "client!oo", name = "I", descriptor = "[B")
    public byte[] field3675;

    @OriginalMember(owner = "client!oo", name = "M", descriptor = "[I")
    public static int[] field3679;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "(I)[B", line = 4)
    public final byte[] method569(int arg0) {
        ++field3684;
        if (arg0 != 0) {
            return null;
        } else if (super.field5227) {
            throw new RuntimeException();
        } else {
            return this.field3675;
        }
    }

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "(I)I", line = 24)
    public final int method565(int arg0) {
        ++field3680;
        if (arg0 != 0) {
            return -15;
        } else {
            return super.field5227 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "(I)V", line = 50)
    public static void method1636(int arg0) {
        field3683 = null;
        field3679 = null;
        field3677 = null;
        if (arg0 != 0) {
            method1636(126);
        }
        field3685 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLir;Lir;)V", line = 69)
    public static final void method1637(boolean arg0, class185 arg1, class185 arg2) {
        class269.field3990 = arg2;
        ++field3678;
        class24.field436 = arg1;
        if (arg0) {
            field3685 = null;
        }
    }
}
