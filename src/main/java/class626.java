import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class626 {

    @OriginalMember(owner = "client!fba", name = "n", descriptor = "I")
    public int field8771;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "B")
    public byte field8758;

    @OriginalMember(owner = "client!fba", name = "m", descriptor = "I")
    private int field8770;

    @OriginalMember(owner = "client!fba", name = "r", descriptor = "I")
    public int field8775;

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "I")
    public int field8760;

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "I")
    public static int field8766 = 0;

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "Lo;")
    public static class208 field8765 = new class208(10, 2, 2, 0);

    @OriginalMember(owner = "client!fba", name = "o", descriptor = "[I")
    public static int[] field8772 = new int[25];

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "I")
    public int field8759;

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "I")
    public int field8762;

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "I")
    public int field8763;

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "I")
    public int field8764;

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "I")
    public int field8767;

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
    public int field8768;

    @OriginalMember(owner = "client!fba", name = "l", descriptor = "I")
    public static int field8769;

    @OriginalMember(owner = "client!fba", name = "p", descriptor = "I")
    public int field8773;

    @OriginalMember(owner = "client!fba", name = "q", descriptor = "I")
    public static int field8774;

    @OriginalMember(owner = "client!fba", name = "s", descriptor = "I")
    public int field8776;

    @OriginalMember(owner = "client!fba", name = "t", descriptor = "I")
    public int field8777;

    @OriginalMember(owner = "client!fba", name = "u", descriptor = "I")
    public static int field8778;

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "Lfba;")
    public class626 field8761;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
    public static void method3604(int arg0) {
        field8765 = null;
        if (arg0 >= 77) {
            field8772 = null;
        }
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)Lgda;")
    public final class542 method3605(int arg0) {
        if (arg0 != 0) {
            this.method3606(75, true, -35, -27);
        }
        field8774++;
        return class75.method551(this.field8770, true);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IZII)Lfba;")
    public final class626 method3606(int arg0, boolean arg1, int arg2, int arg3) {
        field8778++;
        if (arg1) {
            method3604(-18);
        }
        return new class626(this.field8770, arg3, arg0, arg2, this.field8758);
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(I)V")
    public static final void method3607(int arg0) {
        class31.field299.method314(-2);
        if (arg0 != 25) {
            method3604(-49);
        }
        field8769++;
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(IIIIB)V")
    public class626(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field8771 = arg1;
        this.field8758 = arg4;
        this.field8770 = arg0;
        this.field8775 = arg2;
        this.field8760 = arg3;
    }
}
