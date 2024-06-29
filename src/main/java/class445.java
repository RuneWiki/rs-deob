import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class445 extends class227 implements class151 {

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    private int field6552;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "Z")
    public static boolean field6555 = true;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "[I")
    public static int[] field6558;

    @OriginalMember(owner = "client!am", name = "z", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "Lcn;")
    public static class356 field6560;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!am", name = "y", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!am", name = "B", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V")
    public final void method108(byte arg0) {
        int var2 = -17 % ((40 - arg0) / 62);
        ++field6561;
        super.field3227.method1982(34963, this);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I[BIB)V")
    public final void method1016(int arg0, byte[] arg1, int arg2, byte arg3) {
        ++field6557;
        this.method1412(arg0, arg1, false);
        if (arg3 != -87) {
            field6558 = null;
        }
        this.field6552 = arg2;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)I")
    public final int method1013(boolean arg0) {
        if (arg0) {
            field6560 = null;
        }
        ++field6553;
        return super.field3226;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lef;I[BIZ)V")
    public class445(class338 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field6552 = arg1;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
    public static void method2640(int arg0) {
        field6560 = null;
        field6558 = null;
        if (arg0 >= -105) {
            method2640(101);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)J")
    public final long method1015(int arg0) {
        if (arg0 != -6936) {
            this.method1016(-35, (byte[]) null, -115, (byte) 27);
        }
        ++field6554;
        return 0L;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(Z)I")
    public final int method1014(boolean arg0) {
        ++field6559;
        if (!arg0) {
            this.method1015(37);
        }
        return this.field6552;
    }

    static {
        new class466("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field6556 = 0;
        field6558 = new int[1];
        field6562 = 0;
        field6563 = 0;
        field6560 = new class356();
    }
}
