import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public abstract class class266 extends class274 {

    @OriginalMember(owner = "client!un", name = "f", descriptor = "Lnj;")
    public static class415 field3558 = new class415(32, 12);

    @OriginalMember(owner = "client!un", name = "m", descriptor = "I")
    public static int field3565 = -1;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "Lnj;")
    public static class415 field3567 = new class415(73, 4);

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public int field3557;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public int field3560;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public int field3561;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "Ldc;")
    public static class304 field3566;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "Luf;")
    public static class466 field3564;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "Z")
    public boolean field3556;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "[I")
    public static int[] field3568;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(I)Z")
    public final boolean method78(int arg0) {
        if (arg0 != 0) {
            method1644(-42);
        }
        field3563++;
        return false;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
    public static void method1644(int arg0) {
        field3564 = null;
        field3567 = null;
        field3558 = null;
        field3568 = null;
        if (arg0 == 4) {
            field3566 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "d", descriptor = "(B)V")
    public final void method77(byte arg0) {
        if (arg0 != 7) {
            field3568 = null;
        }
        field3559++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IILoa;ILcq;ZI)V")
    public final void method73(int arg0, int arg1, class43 arg2, int arg3, class274 arg4, boolean arg5, int arg6) {
        field3562++;
        if (arg6 >= -2) {
            this.method73(-92, 115, null, -88, null, true, 35);
        }
        throw new IllegalStateException();
    }
}
