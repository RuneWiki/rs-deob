import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class48 extends class766 {

    @OriginalMember(owner = "client!gv", name = "z", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "client!gv", name = "s", descriptor = "I")
    public int field661;

    @OriginalMember(owner = "client!gv", name = "x", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "client!gv", name = "B", descriptor = "I")
    private int field670;

    @OriginalMember(owner = "client!gv", name = "A", descriptor = "I")
    private int field669;

    @OriginalMember(owner = "client!gv", name = "p", descriptor = "I")
    private int field658;

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
    private int field656;

    @OriginalMember(owner = "client!gv", name = "y", descriptor = "I")
    private int field667;

    @OriginalMember(owner = "client!gv", name = "C", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "client!gv", name = "q", descriptor = "Lsv;")
    public static class570 field659 = new class570(69, 18);

    @OriginalMember(owner = "client!gv", name = "E", descriptor = "Lin;")
    public static class380 field673 = new class380(8, 2);

    @OriginalMember(owner = "client!gv", name = "G", descriptor = "Lkja;")
    public static class373 field674 = new class373(15000);

    @OriginalMember(owner = "client!gv", name = "J", descriptor = "[I")
    public static int[] field677 = new int[1];

    @OriginalMember(owner = "client!gv", name = "I", descriptor = "Lhk;")
    public static class153 field676 = new class153(13, 0, 1, 0);

    @OriginalMember(owner = "client!gv", name = "o", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!gv", name = "r", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!gv", name = "t", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!gv", name = "u", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!gv", name = "v", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!gv", name = "w", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!gv", name = "D", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!gv", name = "H", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIII)Z", line = 6)
    public final boolean method374(int arg0, int arg1, int arg2, int arg3) {
        field662++;
        if (arg2 >= -33) {
            return false;
        } else {
            return this.field669 == arg3 && this.field658 <= arg1 && this.field667 >= arg1 && this.field656 <= arg0 && arg0 <= this.field670;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V", line = 26)
    public static final void method375(int arg0) {
        if (arg0 != 1) {
            method378(true);
        }
        class379.field5318.method2881((byte) -77);
        field665++;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIZ)Z", line = 37)
    public final boolean method376(int arg0, int arg1, boolean arg2) {
        field657++;
        if (arg2) {
            return true;
        } else {
            return arg0 >= this.field658 && arg0 <= this.field667 && arg1 >= this.field656 && arg1 <= this.field670;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIB)Z", line = 52)
    public final boolean method377(int arg0, int arg1, byte arg2) {
        if (arg2 < 98) {
            return false;
        } else {
            field660++;
            return arg0 >= this.field666 && arg0 <= this.field668 && arg1 >= this.field671 && this.field661 >= arg1;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)V", line = 68)
    public static void method378(boolean arg0) {
        field677 = null;
        if (arg0) {
            method375(-28);
        }
        field659 = null;
        field673 = null;
        field674 = null;
        field676 = null;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II[II)V", line = 88)
    public final void method379(int arg0, int arg1, int[] arg2, int arg3) {
        field664++;
        arg2[2] = arg1 + this.field656 - this.field671;
        arg2[1] = this.field658 + arg3 - this.field666;
        if (arg0 < 94) {
            method378(false);
        }
        arg2[0] = this.field669;
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(II[II)V", line = 108)
    public final void method380(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg0 != -5257) {
            this.field656 = -13;
        }
        arg2[0] = 0;
        field663++;
        arg2[1] = this.field666 + arg3 - this.field658;
        arg2[2] = this.field671 + arg1 - this.field656;
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(IIIIIIIII)V", line = 127)
    public class48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field668 = arg7;
        this.field661 = arg8;
        this.field666 = arg5;
        this.field670 = arg4;
        this.field669 = arg0;
        this.field658 = arg1;
        this.field656 = arg2;
        this.field667 = arg3;
        this.field671 = arg6;
    }
}
