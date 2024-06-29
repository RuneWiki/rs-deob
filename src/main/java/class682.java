import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public abstract class class682 extends class421 {

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "S")
    public short field9454;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "S")
    public short field9459;

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "Z")
    public static boolean field9452 = false;

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "I")
    public static int field9451;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
    public static int field9453;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
    public static int field9455;

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
    public static int field9456;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
    public static int field9457;

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
    public static int field9458;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
    public static int field9460;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    public static int field9461;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "(I)V", line = 5)
    public final void method903(int arg0) {
        ++field9460;
        if (arg0 != -772) {
            this.method905(false, (class421) null, 7, -37, 66, (class65) null, 16);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "(B)Z", line = 17)
    public final boolean method2457(byte arg0) {
        ++field9453;
        return arg0 <= 117 ? true : class735.field10157[(super.field5742 >> class645.field9018) + -class276.field4007 + class259.field3820][(super.field5746 >> class645.field9018) + class259.field3820 + -class296.field4301];
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V", line = 30)
    public static final void method3856(int arg0, int arg1) {
        ++field9461;
        if (arg1 == 30515) {
            class82.field911 = arg0;
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(Z)Z", line = 41)
    public final boolean method910(boolean arg0) {
        ++field9451;
        return !arg0;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I[Lqm;)I", line = 52)
    public final int method2458(int arg0, class154[] arg1) {
        if (arg0 != 48) {
            return 126;
        } else {
            ++field9455;
            return this.method2550(false, super.field5746 >> class645.field9018, arg1, super.field5742 >> class645.field9018);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII)Z", line = 63)
    public static final boolean method3857(int arg0, int arg1, int arg2, int arg3) {
        class27.field400.method1885(arg1, arg2, arg3, class520.field7342);
        ++field9456;
        int var4 = class520.field7342[2];
        if (~var4 > -51) {
            return false;
        } else {
            class520.field7342[2] = var4;
            class520.field7342[0] = class520.field7342[0] * class348.field4874 / var4 + class244.field3631;
            class520.field7342[1] = class520.field7342[arg0] * class662.field9215 / var4 + class284.field4195;
            return true;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZLje;IIILha;I)V", line = 83)
    public final void method905(boolean arg0, class421 arg1, int arg2, int arg3, int arg4, class65 arg5, int arg6) {
        ++field9458;
        if (arg2 != 0) {
            field9452 = true;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(ILha;)Z", line = 98)
    public final boolean method2456(int arg0, class65 arg1) {
        ++field9457;
        return arg0 <= 92 ? false : class200.method1373(this.method916(true), 0, super.field5746 >> class645.field9018, super.field5742 >> class645.field9018, super.field5749);
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(IIIIIII)V", line = 109)
    public class682(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field5741 = arg1;
        super.field5749 = (byte) arg4;
        this.field9454 = (short) arg5;
        super.field5746 = arg2;
        super.field5742 = arg0;
        this.field9459 = (short) arg6;
        super.field5755 = (byte) arg3;
    }
}
