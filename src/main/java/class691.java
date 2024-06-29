import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class691 implements class630 {

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public int field9670;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "[I")
    public static int[] field9675 = new int[14];

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Lqk;")
    public static class148 field9674 = new class148(38, 10);

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field9671;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field9672;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field9673;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field9676;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V", line = 6)
    public static void method3931(int arg0) {
        field9674 = null;
        if (arg0 == 38) {
            field9675 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Lag;", line = 18)
    public final class214 method210(int arg0) {
        field9671++;
        if (arg0 != 7288) {
            this.field9670 = -59;
        }
        return class526.field7362;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILqs;)I", line = 34)
    public static final int method3932(int arg0, class605 arg1) {
        field9676++;
        if (class186.field2725 == arg1) {
            return 5890;
        } else if (class87.field1198 == arg1) {
            return 34167;
        } else if (class214.field3017 == arg1) {
            return 34168;
        } else if (class123.field1675 == arg1) {
            return 34166;
        } else if (arg0 == 34168) {
            throw new IllegalArgumentException();
        } else {
            return -72;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IBI)Z", line = 70)
    public static final boolean method3933(int arg0, byte arg1, int arg2) {
        if (arg1 != -39) {
            field9673 = -109;
        }
        field9672++;
        return class682.method3899(arg0, false, arg2) & class565.method3379(arg2, (byte) 89, arg0);
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V", line = 80)
    public class691(int arg0) {
        this.field9670 = arg0;
    }
}
