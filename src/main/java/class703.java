import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class703 implements class236 {

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "I")
    public int field9880;

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "I")
    public int field9881;

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "Lfn;")
    public class286 field9882;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "Ltl;")
    public class566 field9876;

    @OriginalMember(owner = "client!tba", name = "h", descriptor = "I")
    public int field9883;

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "[I")
    public static int[] field9879 = new int[32];

    @OriginalMember(owner = "client!tba", name = "k", descriptor = "I")
    public static int field9886 = 104;

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "I")
    public static int field9877;

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
    public static int field9878;

    @OriginalMember(owner = "client!tba", name = "i", descriptor = "I")
    public static int field9884;

    @OriginalMember(owner = "client!tba", name = "j", descriptor = "I")
    public static int field9885;

    @OriginalMember(owner = "client!tba", name = "l", descriptor = "I")
    public static int field9887;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(III)I")
    public static final int method3946(int arg0, int arg1, int arg2) {
        field9877++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg2 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg0 == arg2) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)Ltca;")
    public class141 method421(int arg0) {
        if (arg0 != 4) {
            method3946(-40, -86, 7);
        }
        field9885++;
        return class545.field7457;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(BII)Z")
    public static final boolean method3947(byte arg0, int arg1, int arg2) {
        if (arg0 != 46) {
            method3948(-42);
        }
        field9884++;
        return class193.method1263(96, arg1, arg2) & class592.method3280(arg1, (byte) -125, arg2);
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(ILtl;Lfn;II)V")
    public class703(int arg0, class566 arg1, class286 arg2, int arg3, int arg4) {
        this.field9880 = arg3;
        this.field9881 = arg4;
        this.field9882 = arg2;
        this.field9876 = arg1;
        this.field9883 = arg0;
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)V")
    public static void method3948(int arg0) {
        field9879 = null;
        if (arg0 != 1) {
            method3947((byte) -2, 61, -29);
        }
    }
}
