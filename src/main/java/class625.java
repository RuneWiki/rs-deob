import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class625 {

    @OriginalMember(owner = "client!im", name = "n", descriptor = "Lov;")
    public class668 field8760;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public int field8756;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public int field8762;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public int field8761;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "B")
    public byte field8758;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public int field8747;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public int field8759;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public int field8748;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    public static int field8754 = 0;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field8750;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "Lso;")
    public class538 field8752;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "Lsv;")
    public class57 field8751;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "Lkda;")
    public class61 field8749;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "Lgd;")
    public class667 field8757;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "[I")
    public static int[] field8763;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "[Lit;")
    public static class34[] field8753;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)Z", line = 8)
    public final boolean method3532(int arg0) {
        field8750++;
        if (arg0 <= 83) {
            this.field8747 = -34;
        }
        return this.field8758 == 2 || this.field8758 == 3;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 21)
    public static final void method3533(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class235.field3785[var1] = false;
        }
        field8764++;
        if (arg0 != -107) {
            return;
        }
        class366.field5581 = 0;
        class188.field3134 = 0;
        class440.field6414 = -1;
        class639.field8978 = 1;
        class448.field6538 = -1;
        class275.field4202 = -1;
        class87.field1279 = -1;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIBZIII)V", line = 47)
    public static final void method3534(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg3 != -81) {
            method3534(-52, -99, 93, (byte) -120, true, -66, 96, 112);
        }
        if ((arg4 ? class654.field9289.field5426.method155(3) : class654.field9289.field5439.method155(arg3 ^ 0xFFFFFFAC)) != 0 && arg1 != 0 && class115.field1790 < 50 && arg5 != -1) {
            class374.field5649[class115.field1790++] = new class625((byte) (arg4 ? 3 : 2), arg5, arg1, arg2, arg6, arg0, arg7, null);
        }
        field8755++;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V", line = 69)
    public static void method3535(boolean arg0) {
        field8763 = null;
        if (!arg0) {
            method3535(true);
        }
        field8753 = null;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(BIIIIIILov;)V", line = 88)
    public class625(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class668 arg7) {
        this.field8760 = arg7;
        this.field8756 = arg1;
        this.field8762 = arg4;
        this.field8761 = arg2;
        this.field8758 = arg0;
        this.field8747 = arg5;
        this.field8759 = arg6;
        this.field8748 = arg3;
    }
}
