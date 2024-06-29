import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class698 extends class354 {

    @OriginalMember(owner = "client!sfa", name = "k", descriptor = "[I")
    public static int[] field9713 = new int[200];

    @OriginalMember(owner = "client!sfa", name = "n", descriptor = "Z")
    public static boolean field9716 = false;

    @OriginalMember(owner = "client!sfa", name = "r", descriptor = "Lkg;")
    public static class275 field9720 = new class275(29, -1);

    @OriginalMember(owner = "client!sfa", name = "s", descriptor = "I")
    public static int field9721 = 0;

    @OriginalMember(owner = "client!sfa", name = "h", descriptor = "I")
    public static int field9710;

    @OriginalMember(owner = "client!sfa", name = "i", descriptor = "I")
    public static int field9711;

    @OriginalMember(owner = "client!sfa", name = "j", descriptor = "I")
    public static int field9712;

    @OriginalMember(owner = "client!sfa", name = "l", descriptor = "I")
    public static int field9714;

    @OriginalMember(owner = "client!sfa", name = "m", descriptor = "I")
    public static int field9715;

    @OriginalMember(owner = "client!sfa", name = "o", descriptor = "I")
    public static int field9717;

    @OriginalMember(owner = "client!sfa", name = "p", descriptor = "I")
    public static int field9718;

    @OriginalMember(owner = "client!sfa", name = "q", descriptor = "I")
    public static int field9719;

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "(I)Z")
    public final boolean method3926(int arg0) {
        ++field9719;
        int var2 = -65 % ((-34 - arg0) / 41);
        return true;
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "(II)V")
    public final void method389(int arg0, int arg1) {
        if (arg0 == -1) {
            ++field9717;
            super.field4545 = arg1;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(ILwo;)V")
    public class698(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "(I)V")
    public static void method3927(int arg0) {
        field9720 = null;
        field9713 = null;
        if (arg0 <= 80) {
            field9721 = -121;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(B)I")
    public final int method3928(byte arg0) {
        ++field9710;
        int var2 = 111 % ((arg0 - 7) / 45);
        return super.field4545;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        if (arg0 == 6384) {
            ++field9711;
            if (~super.field4545 != -1 && ~super.field4544.field10405.method3198((byte) -127) != -2) {
                super.field4545 = 0;
            }
            if (~super.field4545 > -1 || ~super.field4545 < -2) {
                super.field4545 = this.method393((byte) 125);
            }
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)I")
    public final int method393(byte arg0) {
        int var2 = -123 / ((37 - arg0) / 63);
        ++field9714;
        return 1;
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lwo;)V")
    public class698(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(II)I")
    public final int method391(int arg0, int arg1) {
        if (arg0 != 3) {
            return -14;
        } else {
            ++field9718;
            return arg1 != 0 && ~super.field4544.field10405.method3198((byte) 100) != -2 ? 2 : 1;
        }
    }
}
