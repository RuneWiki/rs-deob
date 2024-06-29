import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class386 extends class359 implements class332 {

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    private int field5845;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
    public static int field5848 = 205;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "[I")
    public static int[] field5850;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "Lqu;")
    public static class63 field5853;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(Z)V")
    public final void method2231(boolean arg0) {
        ++field5844;
        super.field5502.method2119((byte) -64, this);
        if (!arg0) {
            method2358((byte) 65);
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lod;I[BIZ)V")
    public class386(class349 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field5845 = arg1;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)I")
    public final int method880(int arg0) {
        if (arg0 != 15868) {
            field5850 = null;
        }
        ++field5843;
        return this.field5845;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(B)V")
    public static void method2358(byte arg0) {
        field5850 = null;
        if (arg0 <= -109) {
            field5853 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI[BI)V")
    public final void method883(byte arg0, int arg1, byte[] arg2, int arg3) {
        this.method2233(arg1, arg2, (byte) -57);
        ++field5851;
        this.field5845 = arg3;
        if (arg0 != -80) {
            method2358((byte) 98);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)J")
    public final long method879(int arg0) {
        ++field5847;
        return arg0 < 124 ? -107L : 0L;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)I")
    public final int method878(byte arg0) {
        if (arg0 != 24) {
            field5852 = -50;
        }
        ++field5849;
        return super.field5508;
    }

    static {
        new class475("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field5852 = -1;
        field5850 = new int[] { 1, 0, -1, 0 };
    }
}
