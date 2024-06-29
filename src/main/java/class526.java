import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class526 extends class214 {

    @OriginalMember(owner = "client!wp", name = "G", descriptor = "I")
    private int field7568;

    @OriginalMember(owner = "client!wp", name = "E", descriptor = "Ltm;")
    public static class334 field7566 = new class334(0, 4);

    @OriginalMember(owner = "client!wp", name = "L", descriptor = "Ltm;")
    public static class334 field7573 = new class334(65, -2);

    @OriginalMember(owner = "client!wp", name = "M", descriptor = "Lpfa;")
    public static class228 field7574 = new class228();

    @OriginalMember(owner = "client!wp", name = "D", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!wp", name = "F", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!wp", name = "H", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!wp", name = "I", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!wp", name = "J", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!wp", name = "K", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(Z)V", line = 3)
    public static void method3124(boolean arg0) {
        if (arg0) {
            field7573 = null;
        }
        field7573 = null;
        field7574 = null;
        field7566 = null;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIZ)V", line = 15)
    public static final void method3125(int arg0, int arg1, boolean arg2) {
        class573.method3331(-22364, arg2, class641.field9005.method3621(121, class467.field6804), arg1);
        if (arg0 == 1221653740) {
            ++field7572;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BIIII)V", line = 26)
    public static final void method3126(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7567;
        class118 var5 = class86.method755(true, 4, arg2);
        var5.method933((byte) 64);
        var5.field1821 = arg1;
        var5.field1811 = arg3;
        var5.field1817 = arg4;
        if (arg0 != -82) {
            method3126((byte) -128, -58, -4, 2, -79);
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(I)V", line = 42)
    public class526(int arg0) {
        super(0, true);
        this.field7568 = 4096;
        this.field7568 = arg0;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILla;)V", line = 50)
    public static final void method3127(int arg0, class422 arg1) {
        class161.field2511 = arg1;
        ++field7565;
        if (arg0 != -1) {
            field7573 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZI)I", line = 61)
    public static final int method3128(boolean arg0, int arg1) {
        ++field7569;
        if (!arg0) {
            field7573 = null;
        }
        return ~arg1 == -16711936 ? -1 : class616.method3519(arg1, (byte) 127);
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V", line = 81)
    public class526() {
        this(4096);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILofa;I)V", line = 84)
    public final void method59(int arg0, class301 arg1, int arg2) {
        ++field7570;
        if (arg2 == 0) {
            this.field7568 = (arg1.method1987(-21) << 12) / 255;
        }
        if (arg0 <= 92) {
            this.field7568 = 81;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IB)[I", line = 111)
    public final int[] method64(int arg0, byte arg1) {
        ++field7571;
        int[] var3 = super.field3544.method3869(arg0, arg1 + -119);
        if (arg1 != 5) {
            return null;
        } else {
            if (super.field3544.field9836) {
                class571.method3309(var3, 0, class626.field8787, this.field7568);
            }
            return var3;
        }
    }
}
