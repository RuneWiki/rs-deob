import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class250 extends class82 {

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "Lik;")
    public static class267 field3799 = new class267(64);

    @OriginalMember(owner = "client!ci", name = "R", descriptor = "Z")
    public static boolean field3810 = false;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public int field3786;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    public int field3788;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    public int field3789;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
    public int field3790;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    public int field3791;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public int field3792;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    public int field3793;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "I")
    public int field3794;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
    public int field3795;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
    public int field3797;

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
    public int field3798;

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "I")
    public int field3800;

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "I")
    public int field3802;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!ci", name = "N", descriptor = "I")
    public int field3806;

    @OriginalMember(owner = "client!ci", name = "O", descriptor = "I")
    public int field3807;

    @OriginalMember(owner = "client!ci", name = "P", descriptor = "I")
    public int field3808;

    @OriginalMember(owner = "client!ci", name = "Q", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!ci", name = "S", descriptor = "I")
    public int field3811;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "Lnf;")
    public static class160 field3801;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "Lae;")
    public class173 field3784;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "Luf;")
    public class176 field3787;

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "Lfa;")
    public class257 field3805;

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "Ljk;")
    public class260 field3803;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "[Lrf;")
    public static class289[] field3785;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)V")
    public static void method1642(byte arg0) {
        field3785 = null;
        field3799 = null;
        int var1 = -29 / ((arg0 - 13) / 34);
        field3801 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IJ)V")
    public static final void method1643(int arg0, long arg1) {
        field3804++;
        if (arg0 != 1) {
            method1642((byte) 6);
        }
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class142.method873(arg1 - 1L, 0);
            class142.method873(1L, 0);
        } else {
            class142.method873(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)I")
    public static final int method1644(int arg0, byte arg1) {
        field3809++;
        return arg1 == -14 ? arg0 >>> 8 : -43;
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(B)V")
    public final void method1645(byte arg0) {
        field3796++;
        this.field3805 = null;
        this.field3784 = null;
        int var2 = 68 / ((arg0 + 2) / 59);
        this.field3787 = null;
        this.field3803 = null;
    }
}
