import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class187 extends class154 {

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public int field2831 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    public int field2839 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public int field2838 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public int field2841 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public int field2840 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public int field2835 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public int field2834 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public int field2833 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "Lfa;")
    public class238 field2842;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "[I")
    public static int[] field2836 = new int[3];

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "Lta;")
    public static class203 field2837;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)Z")
    public final boolean method1184(int arg0, int arg1, int arg2) {
        field2843++;
        if (this.field2840 <= arg2 && this.field2834 >= arg2 && this.field2831 <= arg0 && this.field2833 >= arg0) {
            return true;
        } else {
            if (arg1 != -17820) {
                method1186(-104, 25, -109);
            }
            return this.field2839 <= arg2 && arg2 <= this.field2841 && arg0 >= this.field2835 && this.field2838 >= arg0;
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V")
    public static void method1185(int arg0) {
        field2836 = null;
        if (arg0 < -23) {
            field2837 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(III)Z")
    public static final boolean method1186(int arg0, int arg1, int arg2) {
        field2832++;
        class240 var3 = class265.method1717(70, arg0);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg1 <= arg2 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method1570(100, arg2);
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lfa;)V")
    public class187(class238 arg0) {
        this.field2842 = arg0;
    }
}
