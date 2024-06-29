import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class154 extends class184 {

    @OriginalMember(owner = "client!ra", name = "Cc", descriptor = "Z")
    public static boolean field2957 = false;

    @OriginalMember(owner = "client!ra", name = "Oc", descriptor = "[I")
    public static int[] field2969 = new int[5];

    @OriginalMember(owner = "client!ra", name = "Nc", descriptor = "Lsd;")
    private static class166 field2968 = class135.method935("Starting game engine)3)3)3", 0);

    @OriginalMember(owner = "client!ra", name = "Pc", descriptor = "[I")
    public static int[] field2970 = new int[50];

    @OriginalMember(owner = "client!ra", name = "Gc", descriptor = "Lsd;")
    public static class166 field2961 = field2968;

    @OriginalMember(owner = "client!ra", name = "Qc", descriptor = "Lsd;")
    private static class166 field2971 = class135.method935("You have only just left another world)3", 0);

    @OriginalMember(owner = "client!ra", name = "Rc", descriptor = "[I")
    public static int[] field2972 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ra", name = "Lc", descriptor = "Lsd;")
    public static class166 field2966 = field2971;

    @OriginalMember(owner = "client!ra", name = "Tc", descriptor = "I")
    public static int field2974 = 0;

    @OriginalMember(owner = "client!ra", name = "Jc", descriptor = "[J")
    public static long[] field2964 = new long[200];

    @OriginalMember(owner = "client!ra", name = "Uc", descriptor = "Lsd;")
    public static class166 field2975 = class135.method935("Cabbage", 0);

    @OriginalMember(owner = "client!ra", name = "Ec", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!ra", name = "Hc", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!ra", name = "Ic", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!ra", name = "Kc", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!ra", name = "Mc", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!ra", name = "Sc", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!ra", name = "Fc", descriptor = "Lhb;")
    public static class66 field2960;

    @OriginalMember(owner = "client!ra", name = "Dc", descriptor = "Lid;")
    public class77 field2958;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "(I)V")
    public static final void method1035(int arg0) {
        if (arg0 != 200) {
            method1036(-24);
        }
        class73.field1475 = false;
        ++field2963;
        class97.field1858 = false;
    }

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "(I)Z")
    public final boolean method885(int arg0) {
        if (arg0 != 5) {
            return true;
        } else {
            ++field2959;
            return this.field2958 != null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "(I)V")
    public static void method1036(int arg0) {
        field2960 = null;
        field2961 = null;
        field2969 = null;
        field2971 = null;
        field2966 = null;
        field2964 = null;
        field2970 = null;
        field2972 = null;
        field2968 = null;
        field2975 = null;
        if (arg0 != 16) {
            field2972 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2962;
        if (this.field2958 != null) {
            class62 var10 = super.field3543 != -1 && super.field3530 == 0 ? class110.method798(super.field3543, 12) : null;
            class62 var11 = ~super.field3491 == 0 || ~super.field3507 == ~super.field3491 && var10 != null ? null : class110.method798(super.field3491, 12);
            class126 var12 = this.field2958.method641(true, var10, var11, super.field3529, super.field3531);
            if (var12 != null) {
                class126 var13 = null;
                if (super.field3501 != -1 && super.field3550 != -1) {
                    var13 = class12.method77(super.field3501, 13).method843((byte) 117, super.field3550);
                    if (var13 != null) {
                        var13.method895(0, -super.field3511, 0);
                    }
                }
                if (var13 != null) {
                    var12 = ((class118) var12).method844(var13);
                }
                if (this.field2958.field1562 == 1) {
                    var12.field2484 = true;
                }
                var12.method290(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                super.field756 = var12.field756;
            }
        }
    }
}
