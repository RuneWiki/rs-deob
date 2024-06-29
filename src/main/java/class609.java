import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class609 extends class292 {

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "Z")
    public static boolean field8870 = false;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "Lqfa;")
    public static class85 field8866 = new class85(45, 0);

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field8864;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field8865;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field8868;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public static int field8869;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public static int field8871;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public static int field8873;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public static int field8874;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(ZB)V")
    public final void method599(boolean arg0, byte arg1) {
        ++field8873;
        if (arg1 != -116) {
            this.method603((byte) -45, -20, (class116) null);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BILhw;)V")
    public final void method603(byte arg0, int arg1, class116 arg2) {
        super.field4393.method3266(-2, arg2);
        ++field8871;
        super.field4393.method3195(-12, arg1);
        if (arg0 <= 28) {
            this.method601(27);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
    public final void method600(int arg0, int arg1, int arg2) {
        int var4 = -61 / ((arg1 - -45) / 59);
        ++field8867;
    }

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)V")
    public static void method3500(int arg0) {
        int var1 = 32 % ((4 - arg0) / 35);
        field8866 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZB)V")
    public final void method602(boolean arg0, byte arg1) {
        ++field8869;
        if (arg1 != 54) {
            this.method600(95, -65, -46);
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public final void method601(int arg0) {
        ++field8864;
        if (arg0 < 27) {
            method3500(-106);
        }
    }

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "(I)V")
    public static final void method3501(int arg0) {
        class696.field9798 = new String[500];
        class694.field9788 = class141.field2478.field575 - -2 + class141.field2478.field564;
        ++field8868;
        class409.field5927 = class612.field8916.field564 + 2 + class612.field8916.field575;
        for (int var1 = 0; ~var1 > ~class696.field9798.length; ++var1) {
            class696.field9798[var1] = "";
        }
        if (arg0 != 45) {
            method3500(56);
        }
        class686.method3857(class265.field3876.method1733(255, class140.field2466), 66);
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lcf;)V")
    public class609(class562 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)Z")
    public final boolean method604(int arg0) {
        ++field8872;
        return arg0 != 24561;
    }
}
