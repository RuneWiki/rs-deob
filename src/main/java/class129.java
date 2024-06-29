import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class129 extends class376 {

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    private int field1801;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    private int field1808;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public int field1812;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public int field1797;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public int field1806;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    private int field1813;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    private int field1807;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
    public int field1811;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    private int field1810;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field1800 = 0;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "[[I")
    public static int[][] field1799 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1798 = " more options";

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "Ljava/lang/String;")
    public static String field1814 = "Allocating memory";

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "[Llf;")
    public static class130[] field1805;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZI[I)V", line = 5)
    public final void method859(int arg0, boolean arg1, int arg2, int[] arg3) {
        arg3[0] = this.field1810;
        if (!arg1) {
            this.method861(-15, -87, (byte) -76);
        }
        arg3[1] = this.field1808 + arg0 - this.field1806;
        arg3[2] = this.field1801 + arg2 - this.field1812;
        field1804++;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V", line = 26)
    public static void method860(byte arg0) {
        field1814 = null;
        int var1 = -3 % (arg0 / 55);
        field1805 = null;
        field1798 = null;
        field1799 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIB)Z", line = 43)
    public final boolean method861(int arg0, int arg1, byte arg2) {
        if (arg2 == 119) {
            field1802++;
            return arg1 >= this.field1806 && this.field1797 >= arg1 && this.field1812 <= arg0 && this.field1811 >= arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIB)Z", line = 69)
    public final boolean method862(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 < 112) {
            this.field1801 = 1;
        }
        field1803++;
        return this.field1810 == arg2 && this.field1808 <= arg1 && arg1 <= this.field1813 && arg0 >= this.field1801 && arg0 <= this.field1807;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(IIIIIIIII)V", line = 84)
    public class129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field1801 = arg2;
        this.field1808 = arg1;
        this.field1812 = arg6;
        this.field1797 = arg7;
        this.field1806 = arg5;
        this.field1813 = arg3;
        this.field1807 = arg4;
        this.field1811 = arg8;
        this.field1810 = arg0;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II[II)V", line = 103)
    public final void method863(int arg0, int arg1, int[] arg2, int arg3) {
        field1816++;
        int var5 = 0 % ((-arg1 - 32) / 51);
        arg2[2] = this.field1812 + arg3 - this.field1801;
        arg2[0] = 0;
        arg2[1] = arg0 - (this.field1808 - this.field1806);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BII)Z", line = 118)
    public final boolean method864(byte arg0, int arg1, int arg2) {
        field1809++;
        int var4 = -61 % ((-arg0 - 6) / 51);
        return arg1 >= this.field1808 && this.field1813 >= arg1 && this.field1801 <= arg2 && this.field1807 >= arg2;
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)V", line = 133)
    public static final void method865(byte arg0) {
        class190 var1 = class68.field1058;
        synchronized (class68.field1058) {
            class68.field1058.method1249(1);
            int var2 = -55 / ((62 - arg0) / 61);
        }
        field1815++;
    }
}
