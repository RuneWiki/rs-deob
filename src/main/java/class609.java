import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class609 extends class188 {

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "Lee;")
    public static class706 field8283 = new class706(8);

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "Ljava/lang/String;")
    public static String field8288 = null;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field8281;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field8285;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field8286;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field8287;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBLbm;)V", line = 3)
    public final void method959(int arg0, byte arg1, class123 arg2) {
        int var4 = -9 % ((60 - arg1) / 61);
        super.field2510.method3520(true, arg2);
        ++field8287;
        super.field2510.method3503((byte) 96, arg0);
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(B)V", line = 15)
    public final void method955(byte arg0) {
        super.field2510.method3487((byte) 18, false);
        if (arg0 < 54) {
            field8288 = null;
        }
        ++field8286;
    }

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "(B)V", line = 30)
    public static void method3373(byte arg0) {
        if (arg0 != -43) {
            field8283 = null;
        }
        field8283 = null;
        field8288 = null;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lai;)V", line = 42)
    public class609(class626 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)V", line = 46)
    public final void method961(boolean arg0, int arg1) {
        ++field8281;
        if (arg1 != 2) {
            this.method955((byte) 27);
        }
        super.field2510.method3487((byte) 18, true);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)Z", line = 65)
    public final boolean method956(int arg0) {
        if (arg0 <= 53) {
            return false;
        } else {
            ++field8282;
            return true;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZ)V", line = 76)
    public final void method958(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method959(71, (byte) -89, (class123) null);
        }
        ++field8284;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)V", line = 86)
    public final void method962(int arg0, boolean arg1) {
        if (arg0 == 22789) {
            ++field8285;
        }
    }
}
