import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class175 extends class429 {

    @OriginalMember(owner = "client!ov", name = "A", descriptor = "Lcba;")
    public static class516 field2696 = new class516();

    @OriginalMember(owner = "client!ov", name = "B", descriptor = "F")
    public static float field2697;

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!ov", name = "r", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!ov", name = "w", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!ov", name = "x", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!ov", name = "y", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!ov", name = "E", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!ov", name = "s", descriptor = "Lxa;")
    private class468 field2688;

    @OriginalMember(owner = "client!ov", name = "t", descriptor = "Lxa;")
    private class468 field2689;

    @OriginalMember(owner = "client!ov", name = "u", descriptor = "Lxa;")
    private class468 field2690;

    @OriginalMember(owner = "client!ov", name = "v", descriptor = "Lxa;")
    private class468 field2691;

    @OriginalMember(owner = "client!ov", name = "C", descriptor = "Lxa;")
    private class468 field2698;

    @OriginalMember(owner = "client!ov", name = "D", descriptor = "Lxa;")
    public class468 field2699;

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "[I")
    public static int[] field2685;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V")
    public final void method911(byte arg0) {
        ++field2694;
        super.method911(arg0);
        class566 var2 = (class566) super.field5899;
        this.field2699 = class429.method2448(super.field5888, 18638, var2.field7484);
        this.field2688 = class429.method2448(super.field5888, 18638, var2.field7485);
        this.field2689 = class429.method2448(super.field5888, 18638, var2.field7481);
        this.field2691 = class429.method2448(super.field5888, arg0 + 18651, var2.field7480);
        this.field2690 = class429.method2448(super.field5888, 18638, var2.field7482);
        this.field2698 = class429.method2448(super.field5888, arg0 ^ -18627, var2.field7488);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIZ)V")
    public final void method1179(int arg0, int arg1, int arg2, boolean arg3) {
        ++field2687;
        int var5 = this.field2689.method1025() + arg2;
        int var6 = super.field5899.field4067 + arg2 - this.field2691.method1025();
        int var7 = arg1 + this.field2690.method1030();
        int var8 = super.field5899.field4075 + arg1 + -this.field2698.method1030();
        int var9 = -var5 + var6;
        int var10 = -var7 + var8;
        int var11 = this.method2450(7555) * var9 / 10000;
        int[] var12 = new int[4];
        class10.field197.method433(var12);
        class10.field197.method421(var5, var7, var5 - -var11, var8);
        this.method1180(var5, var10, var7, false, var9);
        class10.field197.method421(var5 + var11, var7, var6, var8);
        this.field2688.method2643(var5, var7, var9, var10);
        class10.field197.method421(var12[0], var12[1], var12[arg0], var12[3]);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIZI)V")
    public void method1180(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            this.method911((byte) -6);
        }
        this.field2699.method2643(arg0, arg2, arg4, arg1);
        ++field2686;
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lbi;Lbi;Lcf;)V")
    public class175(class449 arg0, class449 arg1, class566 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(IIIZ)V")
    public final void method1181(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            int[] var5 = new int[4];
            class10.field197.method433(var5);
            class10.field197.method421(arg1, arg0, super.field5899.field4067 + arg1, super.field5899.field4075 + arg0);
            int var6 = this.field2689.method1025();
            int var7 = this.field2689.method1030();
            int var8 = this.field2691.method1025();
            int var9 = this.field2691.method1030();
            this.field2689.method2637(arg1, (-var7 + super.field5899.field4075) / 2 + arg0);
            this.field2691.method2637(super.field5899.field4067 + arg1 + -var8, arg0 - -((-var9 + super.field5899.field4075) / 2));
            class10.field197.method421(arg1, arg0, super.field5899.field4067 + arg1, this.field2690.method1030() + arg0);
            this.field2690.method2643(arg1 + var6, arg0, -var6 + -var8 + super.field5899.field4067, super.field5899.field4075);
            int var10 = this.field2698.method1030();
            class10.field197.method421(arg1, -var10 + arg0 + super.field5899.field4075, super.field5899.field4067 + arg1, super.field5899.field4075 + arg0);
            this.field2698.method2643(arg1 - -var6, -var10 + arg0 + super.field5899.field4075, -var6 + super.field5899.field4067 + -var8, super.field5899.field4075);
            class10.field197.method421(var5[0], var5[1], var5[2], var5[3]);
        }
        int var11 = 59 % ((2 - arg2) / 54);
        ++field2700;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)Z")
    public final boolean method913(int arg0) {
        ++field2693;
        if (!super.method913(30)) {
            return false;
        } else {
            class566 var2 = (class566) super.field5899;
            if (!super.field5888.method2549(var2.field7484, 3015)) {
                return false;
            } else if (!super.field5888.method2549(var2.field7485, 3015)) {
                return false;
            } else if (!super.field5888.method2549(var2.field7481, 3015)) {
                return false;
            } else if (!super.field5888.method2549(var2.field7480, 3015)) {
                return false;
            } else if (!super.field5888.method2549(var2.field7482, 3015)) {
                return false;
            } else if (!super.field5888.method2549(var2.field7488, 3015)) {
                return false;
            } else {
                return arg0 > 13;
            }
        }
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(B)V")
    public static void method1182(byte arg0) {
        field2685 = null;
        field2696 = null;
        if (arg0 >= -6) {
            field2692 = 80;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)Z")
    public static final boolean method1183(int arg0, int arg1) {
        ++field2695;
        if (arg1 != -8) {
            method1183(22, 10);
        }
        return ~arg0 == -4 || ~arg0 == -8 || ~arg0 == -11;
    }
}
