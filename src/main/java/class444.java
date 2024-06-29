import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class444 extends class521 {

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V")
    public final void method455(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            ++field6126;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BZ)V")
    public final void method454(byte arg0, boolean arg1) {
        super.field7319.method2456((byte) 103, true);
        ++field6128;
        if (arg0 == 21) {
            ;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILhv;I)V")
    public final void method446(int arg0, class440 arg1, int arg2) {
        if (arg2 != 26440) {
            method2600((class545) null, (byte) 123);
        }
        ++field6125;
        super.field7319.method2459(104, arg1);
        super.field7319.method2437(arg0, -3);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lbda;)V")
    public class444(class428 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lav;B)V")
    public static final void method2600(class545 arg0, byte arg1) {
        ++field6129;
        if (arg1 != -101) {
            method2600((class545) null, (byte) -10);
        }
        class416 var2 = (class416) class593.field8610.method2645((long) arg0.field6399, (byte) -121);
        if (var2 != null) {
            if (var2.field5417 != null) {
                class534.field7500.method803(var2.field5417);
                var2.field5417 = null;
            }
            var2.method3187(true);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)V")
    public final void method449(int arg0, boolean arg1) {
        if (arg0 != 256) {
            this.method449(-92, false);
        }
        ++field6127;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Z")
    public final boolean method452(int arg0) {
        if (arg0 < 49) {
            return false;
        } else {
            ++field6124;
            return true;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
    public final void method448(boolean arg0) {
        super.field7319.method2456((byte) 104, arg0);
        ++field6123;
    }
}
