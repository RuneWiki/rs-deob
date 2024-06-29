import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class526 extends class305 {

    @OriginalMember(owner = "client!um", name = "i", descriptor = "[I")
    public static int[] field7500 = new int[1];

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V")
    public static void method3081(boolean arg0) {
        if (!arg0) {
            field7500 = null;
        }
        field7500 = null;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        ++field7504;
        if (arg1 != 0 && super.field4323.field10207.method3961(arg0 ^ 16118) != 1) {
            return arg0 != 31401 ? -120 : 2;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        if (super.field4320 != 0 && ~super.field4323.field10207.method3961(17503) != -2) {
            super.field4320 = 0;
        }
        ++field7506;
        if (arg0 > -40) {
            field7500 = null;
        }
        if (super.field4320 < 0 || ~super.field4320 < -2) {
            super.field4320 = this.method305((byte) 68);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)I")
    public final int method305(byte arg0) {
        ++field7505;
        if (arg0 != 68) {
            this.method306(-39, -67);
        }
        return 1;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)Z")
    public final boolean method3082(int arg0) {
        ++field7501;
        if (arg0 != 2) {
            field7500 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(ILhb;)V")
    public class526(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)I")
    public final int method3083(int arg0) {
        if (arg0 != 17503) {
            field7500 = null;
        }
        ++field7502;
        return super.field4320;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(II)V")
    public final void method303(int arg0, int arg1) {
        if (arg0 != -27751) {
            field7500 = null;
        }
        super.field4320 = arg1;
        ++field7503;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lhb;)V")
    public class526(class728 arg0) {
        super(arg0);
    }
}
