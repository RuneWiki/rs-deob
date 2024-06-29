import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class263 extends class26 {

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public int field3821;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    private int field3814;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    private int field3816;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    private int field3820;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    private int field3818;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    private int field3824;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    private int field3811;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public int field3813;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public int field3810;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public int field3812;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "Lll;")
    public static class54 field3817 = new class54();

    @OriginalMember(owner = "client!e", name = "A", descriptor = "Lll;")
    public static class54 field3822 = new class54();

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "[[[B")
    public static byte[][][] field3827;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BIII)Z", line = 11)
    public final boolean method1810(byte arg0, int arg1, int arg2, int arg3) {
        field3825++;
        if (arg0 != -21) {
            this.method1813(-40, -52, (byte) -32, (int[]) null);
        }
        return this.field3811 == arg3 && arg1 >= this.field3814 && arg1 <= this.field3824 && arg2 >= this.field3820 && this.field3818 >= arg2;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)Z", line = 27)
    public final boolean method1811(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field3823++;
            return arg0 >= this.field3821 && arg0 <= this.field3812 && arg1 >= this.field3810 && arg1 <= this.field3813;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IBI)Z", line = 42)
    public final boolean method1812(int arg0, byte arg1, int arg2) {
        field3826++;
        if (arg1 != 33) {
            method1814((byte) 9);
        }
        return this.field3814 <= arg2 && arg2 <= this.field3824 && this.field3820 <= arg0 && arg0 <= this.field3818;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIB[I)V", line = 58)
    public final void method1813(int arg0, int arg1, byte arg2, int[] arg3) {
        arg3[0] = this.field3816;
        arg3[2] = this.field3810 + arg0 - this.field3820;
        arg3[1] = this.field3821 + arg1 - this.field3814;
        field3819++;
        int var5 = 49 / ((arg2 - 2) / 40);
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(B)V", line = 80)
    public static void method1814(byte arg0) {
        int var1 = 105 % ((-arg0 - 22) / 44);
        field3817 = null;
        field3827 = (byte[][][]) null;
        field3822 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II[II)V", line = 93)
    public final void method1815(int arg0, int arg1, int[] arg2, int arg3) {
        field3815++;
        int var5 = 2 / ((arg3 + 69) / 48);
        arg2[1] = arg1 + this.field3814 - this.field3821;
        arg2[0] = this.field3811;
        arg2[2] = arg0 + this.field3820 - this.field3810;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 110)
    public class263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field3821 = arg6;
        this.field3814 = arg2;
        this.field3816 = arg1;
        this.field3820 = arg3;
        this.field3818 = arg5;
        this.field3824 = arg4;
        this.field3811 = arg0;
        this.field3813 = arg9;
        this.field3810 = arg7;
        this.field3812 = arg8;
    }
}
