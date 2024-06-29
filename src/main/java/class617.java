import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public abstract class class617 extends class421 {

    @OriginalMember(owner = "client!nu", name = "K", descriptor = "I")
    public static int field8632 = -1;

    @OriginalMember(owner = "client!nu", name = "L", descriptor = "I")
    public static int field8633 = -2;

    @OriginalMember(owner = "client!nu", name = "H", descriptor = "Lbu;")
    public static class21 field8630 = new class21(18, 0);

    @OriginalMember(owner = "client!nu", name = "B", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
    public static int field8628;

    @OriginalMember(owner = "client!nu", name = "F", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!nu", name = "J", descriptor = "I")
    public static int field8631;

    @OriginalMember(owner = "client!nu", name = "M", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!nu", name = "N", descriptor = "I")
    public static int field8635;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V", line = 4)
    public static void method3567(int arg0) {
        field8630 = null;
        if (arg0 < 39) {
            field8633 = -83;
        }
    }

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "(I)V", line = 16)
    public final void method903(int arg0) {
        if (arg0 != -772) {
            field8632 = -13;
        }
        ++field8627;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(Z)Z", line = 29)
    public final boolean method910(boolean arg0) {
        ++field8634;
        if (!arg0) {
            this.method910(false);
        }
        return false;
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(ILha;)Z", line = 46)
    public final boolean method2456(int arg0, class65 arg1) {
        if (arg0 < 92) {
            return false;
        } else {
            ++field8631;
            class48 var3 = class89.method667(super.field5755, super.field5742 >> class645.field9018, super.field5746 >> class645.field9018);
            return var3 != null && var3.field605.field9359 ? class200.method1373(var3.field605.method916(true) + this.method916(true), 0, super.field5746 >> class645.field9018, super.field5742 >> class645.field9018, super.field5755) : class295.method1924(super.field5746 >> class645.field9018, 1, super.field5742 >> class645.field9018, super.field5755);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZLje;IIILha;I)V", line = 72)
    public final void method905(boolean arg0, class421 arg1, int arg2, int arg3, int arg4, class65 arg5, int arg6) {
        if (arg2 != 0) {
            field8633 = -22;
        }
        ++field8629;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "(B)Z", line = 83)
    public final boolean method2457(byte arg0) {
        ++field8628;
        return arg0 <= 117 ? true : class735.field10157[(super.field5742 >> class645.field9018) + -class276.field4007 + class259.field3820][(super.field5746 >> class645.field9018) + class259.field3820 + -class296.field4301];
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(IIIII)V", line = 93)
    public class617(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field5749 = (byte) arg4;
        super.field5755 = (byte) arg3;
        super.field5746 = arg2;
        super.field5742 = arg0;
        super.field5741 = arg1;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I[Lqm;)I", line = 105)
    public final int method2458(int arg0, class154[] arg1) {
        ++field8635;
        if (arg0 != 48) {
            field8630 = null;
        }
        return this.method2550(false, super.field5746 >> class645.field9018, arg1, super.field5742 >> class645.field9018);
    }
}
