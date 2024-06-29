import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class125 extends class539 {

    @OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
    public int field1737;

    @OriginalMember(owner = "client!ls", name = "x", descriptor = "I")
    private int field1740;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
    public int field1734;

    @OriginalMember(owner = "client!ls", name = "v", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "client!ls", name = "w", descriptor = "I")
    private int field1739;

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "I")
    private int field1742;

    @OriginalMember(owner = "client!ls", name = "B", descriptor = "I")
    private int field1744;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "Lfc;")
    public static class235 field1735 = new class235(104, 12);

    @OriginalMember(owner = "client!ls", name = "A", descriptor = "Lhs;")
    public static class295 field1743 = new class295(3, 1);

    @OriginalMember(owner = "client!ls", name = "D", descriptor = "Lfc;")
    public static class235 field1746 = new class235(102, 8);

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!ls", name = "y", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!ls", name = "C", descriptor = "[I")
    public static int[] field1745;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BIII)Z", line = 7)
    public final boolean method888(byte arg0, int arg1, int arg2, int arg3) {
        field1729++;
        if (arg0 != -113) {
            this.field1730 = -68;
        }
        return this.field1740 == arg3 && this.field1738 <= arg2 && arg2 <= this.field1739 && arg1 >= this.field1742 && this.field1744 >= arg1;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBI)Z", line = 26)
    public final boolean method889(int arg0, byte arg1, int arg2) {
        if (arg1 >= -76) {
            this.method892(34, -53, 46, null);
        }
        field1736++;
        return this.field1738 <= arg2 && arg2 <= this.field1739 && arg0 >= this.field1742 && arg0 <= this.field1744;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V", line = 42)
    public static void method890(byte arg0) {
        field1745 = null;
        field1735 = null;
        field1743 = null;
        field1746 = null;
        if (arg0 < 53) {
            field1743 = null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I[III)V", line = 59)
    public final void method891(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[0] = 0;
        field1732++;
        arg1[2] = this.field1731 + arg0 - this.field1742;
        arg1[arg2] = this.field1730 + arg3 - this.field1738;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(III[I)V", line = 69)
    public final void method892(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = arg0 + this.field1738 - this.field1730;
        arg3[arg1] = this.field1740;
        field1741++;
        arg3[2] = arg2 + this.field1742 - this.field1731;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(IIIIIIIII)V", line = 88)
    public class125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field1737 = arg7;
        this.field1740 = arg0;
        this.field1730 = arg5;
        this.field1734 = arg8;
        this.field1738 = arg1;
        this.field1731 = arg6;
        this.field1739 = arg3;
        this.field1742 = arg2;
        this.field1744 = arg4;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(III)Z", line = 112)
    public final boolean method893(int arg0, int arg1, int arg2) {
        if (arg0 != 104) {
            this.method889(19, (byte) -94, 26);
        }
        field1733++;
        return arg2 >= this.field1730 && this.field1737 >= arg2 && arg1 >= this.field1731 && arg1 <= this.field1734;
    }
}
