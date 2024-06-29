import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class117 extends class59 {

    @OriginalMember(owner = "client!r", name = "Jb", descriptor = "[I")
    public static int[] field2804 = new int[100];

    @OriginalMember(owner = "client!r", name = "Hb", descriptor = "I")
    public static int field2802 = 0;

    @OriginalMember(owner = "client!r", name = "Rb", descriptor = "Lu;")
    public static class135 field2812 = class87.method676((byte) -118, "m-Ochte sich mit Ihnen duellieren)3");

    @OriginalMember(owner = "client!r", name = "Sb", descriptor = "Lu;")
    public static class135 field2813 = class87.method676((byte) -112, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!r", name = "Nb", descriptor = "[I")
    public static int[] field2808 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!r", name = "Ub", descriptor = "I")
    public static int field2815 = -1;

    @OriginalMember(owner = "client!r", name = "Xb", descriptor = "I")
    public static int field2818 = -1;

    @OriginalMember(owner = "client!r", name = "Yb", descriptor = "I")
    public static int field2819 = 0;

    @OriginalMember(owner = "client!r", name = "Vb", descriptor = "I")
    public static int field2816 = 0;

    @OriginalMember(owner = "client!r", name = "Gb", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!r", name = "Ib", descriptor = "I")
    private int field2803;

    @OriginalMember(owner = "client!r", name = "Kb", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!r", name = "Lb", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!r", name = "Mb", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!r", name = "Ob", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!r", name = "Pb", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!r", name = "Qb", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!r", name = "Tb", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!r", name = "Wb", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!r", name = "Zb", descriptor = "Lld;")
    private class80 field2820;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(II)V")
    public final void method929(int arg0, int arg1) {
        if (arg1 == -14044) {
            ++field2807;
            super.field1495[super.field1485++] = (byte) (this.field2820.method630(-120) + arg0);
        }
    }

    @OriginalMember(owner = "client!r", name = "q", descriptor = "(I)V")
    public static final void method930(int arg0) {
        ++field2817;
        class85.field2015.method234(-22666);
        class14.field296.method234(-22666);
        if (arg0 != 8) {
            method935(-122);
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(IZ)I")
    public final int method931(int arg0, boolean arg1) {
        ++field2805;
        return !arg1 ? -115 : arg0 * 8 - this.field2803;
    }

    @OriginalMember(owner = "client!r", name = "r", descriptor = "(I)I")
    public final int method932(int arg0) {
        if (arg0 != 1) {
            this.field2820 = null;
        }
        ++field2811;
        return super.field1495[super.field1485++] + -this.field2820.method630(-112) & 255;
    }

    @OriginalMember(owner = "client!r", name = "l", descriptor = "(B)V")
    public final void method933(byte arg0) {
        super.field1485 = (this.field2803 + 7) / 8;
        if (arg0 == 106) {
            ++field2809;
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(BI)I")
    public final int method934(byte arg0, int arg1) {
        ++field2801;
        int var3 = this.field2803 >> 3;
        int var4 = -(7 & this.field2803) + 8;
        this.field2803 += arg1;
        int var5 = 0;
        while (~var4 > ~arg1) {
            var5 += (class77.field1814[var4] & super.field1495[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 == ~var4) {
            var6 = (super.field1495[var3] & class77.field1814[var4]) + var5;
        } else {
            var6 = (super.field1495[var3] >> -arg1 + var4 & class77.field1814[arg1]) + var5;
        }
        if (arg0 <= 100) {
            this.method932(39);
        }
        return var6;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(I)V")
    public class117(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!r", name = "s", descriptor = "(I)V")
    public static void method935(int arg0) {
        field2812 = null;
        field2813 = null;
        field2808 = null;
        field2804 = null;
        if (arg0 != 2) {
            method935(-61);
        }
    }

    @OriginalMember(owner = "client!r", name = "t", descriptor = "(I)V")
    public final void method936(int arg0) {
        this.field2803 = super.field1485 * 8;
        if (arg0 != -1) {
            field2818 = -104;
        }
        ++field2810;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([II)V")
    public final void method937(int[] arg0, int arg1) {
        int var3 = -32 % ((arg1 - -71) / 40);
        this.field2820 = new class80(arg0);
        ++field2814;
    }
}
