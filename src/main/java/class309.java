import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class309 extends class51 implements class209 {

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
    private int field4570;

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "I")
    public static int field4573 = 1406;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!ks", name = "v", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZZ)V")
    public static final void method1967(boolean arg0, boolean arg1) {
        ++field4572;
        if (class504.field7294.length() != 0) {
            if (arg0) {
                class329.method2077(-1, "--> " + class504.field7294);
                class162.method1175(312929383, class504.field7294, false, arg1);
                class504.field7294 = "";
                class269.field4057 = 0;
                class528.field7712 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(B)I")
    public final int method413(byte arg0) {
        int var2 = 123 / ((arg0 - -55) / 49);
        ++field4567;
        return super.field932;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
    public final void method451(int arg0) {
        ++field4571;
        super.field943.method330(this, (byte) -104);
        if (arg0 != 0) {
            this.method414((byte) -50);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)J")
    public final long method414(byte arg0) {
        if (arg0 < 46) {
            field4573 = 70;
        }
        ++field4566;
        return 0L;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Lqn;")
    public static final class46 method1968(int arg0) {
        ++field4569;
        if (arg0 != 0) {
            field4573 = -44;
        }
        try {
            return (class46) Class.forName("qf").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "([BIII)V")
    public final void method412(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 23432) {
            this.field4570 = -34;
        }
        this.method449(arg0, (byte) -66, arg3);
        ++field4568;
        this.field4570 = arg1;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)I")
    public final int method408(byte arg0) {
        ++field4574;
        return arg0 != -62 ? 45 : this.field4570;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lbt;I[BIZ)V")
    public class309(class33 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field4570 = arg1;
    }
}
