import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class189 extends class530 {

    @OriginalMember(owner = "client!lia", name = "g", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!lia", name = "h", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!lia", name = "i", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!lia", name = "k", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!lia", name = "l", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!lia", name = "m", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!lia", name = "j", descriptor = "Lhca;")
    public static class244 field2754;

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(I)I", line = 3)
    public final int method1259(int arg0) {
        if (arg0 != 0) {
            this.method75(-71, 36);
        }
        ++field2755;
        return super.field7419;
    }

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "(I)V", line = 14)
    public static void method1260(int arg0) {
        field2754 = null;
        if (arg0 > -49) {
            method1260(11);
        }
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(ILah;)V", line = 26)
    public class189(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(II)I", line = 29)
    public final int method75(int arg0, int arg1) {
        ++field2752;
        int var3 = 71 / ((63 - arg1) / 60);
        return 1;
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(II)V", line = 39)
    public final void method70(int arg0, int arg1) {
        ++field2753;
        super.field7419 = arg0;
        if (arg1 > -38) {
            field2754 = null;
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(I)I", line = 51)
    public final int method74(int arg0) {
        ++field2756;
        if (arg0 != 0) {
            this.method73(false);
        }
        return 1;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(Z)V", line = 65)
    public final void method73(boolean arg0) {
        if (super.field7419 != 1 && super.field7419 != 0) {
            super.field7419 = this.method74(0);
        }
        if (!arg0) {
            this.method73(true);
        }
        ++field2751;
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Lah;)V", line = 78)
    public class189(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lib;BLib;)V", line = 83)
    public static final void method1261(class1 arg0, byte arg1, class1 arg2) {
        if (arg1 == -113) {
            ++field2757;
            if (arg2.field4 != null) {
                arg2.method1(112);
            }
            arg2.field3 = arg0;
            arg2.field4 = arg0.field4;
            arg2.field4.field3 = arg2;
            arg2.field3.field4 = arg2;
        }
    }
}
