import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class180 extends class435 {

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
    public int field2835;

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "I")
    public int field2843;

    @OriginalMember(owner = "client!gp", name = "A", descriptor = "I")
    public int field2845;

    @OriginalMember(owner = "client!gp", name = "F", descriptor = "I")
    private int field2850;

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
    private int field2842;

    @OriginalMember(owner = "client!gp", name = "H", descriptor = "I")
    private int field2852;

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
    private int field2841;

    @OriginalMember(owner = "client!gp", name = "s", descriptor = "I")
    public int field2837;

    @OriginalMember(owner = "client!gp", name = "D", descriptor = "I")
    private int field2848;

    @OriginalMember(owner = "client!gp", name = "u", descriptor = "Leda;")
    public static class116 field2839 = new class116(70, 8);

    @OriginalMember(owner = "client!gp", name = "r", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!gp", name = "t", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!gp", name = "v", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!gp", name = "B", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!gp", name = "G", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!gp", name = "J", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!gp", name = "C", descriptor = "Lll;")
    public static class490 field2847;

    @OriginalMember(owner = "client!gp", name = "I", descriptor = "Lfda;")
    public static class628 field2853;

    @OriginalMember(owner = "client!gp", name = "E", descriptor = "Z")
    public static boolean field2849;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I[III)V", line = 4)
    public final void method1296(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[1] = this.field2841 + arg2 - this.field2835;
        arg1[0] = this.field2852;
        if (arg0 != 25612) {
            this.field2842 = 58;
        }
        field2854++;
        arg1[2] = arg3 - (this.field2845 - this.field2842);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIII)Z", line = 19)
    public final boolean method1297(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 1) {
            this.method1301(null, 22, -44, -4);
        }
        field2846++;
        return this.field2852 == arg1 && this.field2841 <= arg2 && arg2 <= this.field2850 && arg3 >= this.field2842 && this.field2848 >= arg3;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)Z", line = 34)
    public final boolean method1298(int arg0, int arg1, int arg2) {
        if (arg2 == -32144) {
            field2840++;
            return this.field2835 <= arg1 && arg1 <= this.field2837 && arg0 >= this.field2845 && arg0 <= this.field2843;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)V", line = 52)
    public static void method1299(byte arg0) {
        if (arg0 < -49) {
            field2853 = null;
            field2839 = null;
            field2847 = null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(III)Z", line = 69)
    public final boolean method1300(int arg0, int arg1, int arg2) {
        field2844++;
        if (arg2 != 1) {
            this.field2843 = 30;
        }
        return this.field2841 <= arg0 && this.field2850 >= arg0 && this.field2842 <= arg1 && this.field2848 >= arg1;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "([IIII)V", line = 84)
    public final void method1301(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 > -83) {
            method1299((byte) 26);
        }
        arg0[1] = this.field2835 + arg3 - this.field2841;
        field2838++;
        arg0[0] = 0;
        arg0[2] = arg1 + this.field2845 - this.field2842;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)I", line = 98)
    public static final int method1302(int arg0) {
        field2836++;
        if (class634.field8978 == null) {
            return 0;
        } else {
            int var1 = 76 % ((arg0 - 54) / 54);
            return class634.field8978.length * 2;
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(IIIIIIIII)V", line = 121)
    public class180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field2835 = arg5;
        this.field2843 = arg8;
        this.field2845 = arg6;
        this.field2850 = arg3;
        this.field2842 = arg2;
        this.field2852 = arg0;
        this.field2841 = arg1;
        this.field2837 = arg7;
        this.field2848 = arg4;
    }
}
