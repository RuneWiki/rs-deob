import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oja")
public class class476 extends class407 {

    @OriginalMember(owner = "client!oja", name = "C", descriptor = "Lbu;")
    public static class21 field6668 = new class21(121, 9);

    @OriginalMember(owner = "client!oja", name = "F", descriptor = "[I")
    public static int[] field6671 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!oja", name = "G", descriptor = "I")
    public static int field6672 = -1;

    @OriginalMember(owner = "client!oja", name = "s", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!oja", name = "u", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!oja", name = "v", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!oja", name = "y", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!oja", name = "z", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!oja", name = "A", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!oja", name = "B", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!oja", name = "r", descriptor = "Ljd;")
    private class241 field6657;

    @OriginalMember(owner = "client!oja", name = "t", descriptor = "Ljd;")
    private class241 field6659;

    @OriginalMember(owner = "client!oja", name = "w", descriptor = "Ljd;")
    private class241 field6662;

    @OriginalMember(owner = "client!oja", name = "x", descriptor = "Ljd;")
    private class241 field6663;

    @OriginalMember(owner = "client!oja", name = "D", descriptor = "Ljd;")
    private class241 field6669;

    @OriginalMember(owner = "client!oja", name = "E", descriptor = "Ljd;")
    public class241 field6670;

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(IIIBI)V")
    public void method2827(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field6666;
        if (arg3 == 55) {
            this.field6670.method1610(arg0, arg1, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(IIIZ)V")
    public final void method1919(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            int[] var5 = new int[4];
            class37.field491.method449(var5);
            class37.field491.method434(arg1, arg0, super.field5543.field9833 + arg1, arg0 - -super.field5543.field9837);
            int var6 = this.field6662.method1507();
            int var7 = this.field6662.method1505();
            int var8 = this.field6669.method1507();
            int var9 = this.field6669.method1505();
            this.field6662.method1604(arg1, arg0 - -((-var7 + super.field5543.field9837) / 2));
            this.field6669.method1604(-var8 + arg1 + super.field5543.field9833, (-var9 + super.field5543.field9837) / 2 + arg0);
            class37.field491.method434(arg1, arg0, arg1 - -super.field5543.field9833, this.field6663.method1505() + arg0);
            this.field6663.method1610(arg1 + var6, arg0, -var6 + super.field5543.field9833 + -var8, super.field5543.field9837);
            int var10 = this.field6659.method1505();
            class37.field491.method434(arg1, -var10 + arg0 + super.field5543.field9837, super.field5543.field9833 + arg1, super.field5543.field9837 + arg0);
            this.field6659.method1610(arg1 + var6, super.field5543.field9837 + arg0 + -var10, -var6 + super.field5543.field9833 - var8, super.field5543.field9837);
            class37.field491.method434(var5[0], var5[1], var5[2], var5[3]);
        }
        ++field6658;
        if (arg2 != 7) {
            this.method1920(28, (byte) -117, 69, false);
        }
    }

    @OriginalMember(owner = "client!oja", name = "<init>", descriptor = "(Lwia;Lwia;Leia;)V")
    public class476(class791 arg0, class791 arg1, class253 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!oja", name = "c", descriptor = "(B)V")
    public static void method2828(byte arg0) {
        field6671 = null;
        if (arg0 < 8) {
            method2829(true);
        }
        field6668 = null;
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(Z)V")
    public static final void method2829(boolean arg0) {
        if (arg0) {
            field6671 = null;
        }
        ++field6660;
        class180.field2795 = 0;
        int var1 = (class210.field3250.field5742 >> 9) + class124.field1922;
        int var2 = (class210.field3250.field5746 >> 9) + class88.field999;
        if (~var1 <= -3054 && ~var1 >= -3157 && ~var2 <= -3057 && ~var2 >= -3137) {
            class180.field2795 = 1;
        }
        if (~var1 <= -3073 && var1 <= 3118 && ~var2 <= -9493 && ~var2 >= -9536) {
            class180.field2795 = 1;
        }
        if (~class180.field2795 == -2 && ~var1 <= -3140 && ~var1 >= -3200 && var2 >= 3008 && var2 <= 3062) {
            class180.field2795 = 0;
        }
    }

    @OriginalMember(owner = "client!oja", name = "b", descriptor = "(Z)V")
    public static final void method2830(boolean arg0) {
        ++field6665;
        for (class229 var1 = (class229) class494.field7055.method1731((byte) -122); var1 != null; var1 = (class229) class494.field7055.method1724(0)) {
            class485 var2 = var1.field3498;
            if (!var2.field6830) {
                if (~class192.field2961 <= ~var2.field6844) {
                    var2.method2891(0, class471.field6608);
                    if (!var2.field6830) {
                        class490.method2926(var2, true);
                    } else {
                        var1.method3387((byte) -43);
                    }
                }
            } else {
                var1.method3387((byte) -83);
                var2.method2892((byte) 119);
            }
        }
        if (!arg0) {
            method2830(true);
        }
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(IBIZ)V")
    public final void method1920(int arg0, byte arg1, int arg2, boolean arg3) {
        ++field6664;
        int var5 = this.field6662.method1507() + arg0;
        int var6 = super.field5543.field9833 + arg0 - this.field6669.method1507();
        int var7 = this.field6663.method1505() + arg2;
        int var8 = arg2 + super.field5543.field9837 + -this.field6659.method1505();
        if (arg1 != 105) {
            method2830(true);
        }
        int var9 = -var5 + var6;
        int var10 = var8 - var7;
        int var11 = this.method2489(10000) * var9 / 10000;
        int[] var12 = new int[4];
        class37.field491.method449(var12);
        class37.field491.method434(var5, var7, var5 - -var11, var8);
        this.method2827(var5, var7, var10, (byte) 55, var9);
        class37.field491.method434(var5 + var11, var7, var6, var8);
        this.field6657.method1610(var5, var7, var9, var10);
        class37.field491.method434(var12[0], var12[1], var12[2], var12[3]);
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(B)Z")
    public final boolean method298(byte arg0) {
        ++field6661;
        if (!super.method298(arg0)) {
            return false;
        } else {
            class253 var2 = (class253) super.field5543;
            if (!super.field5544.method4349((byte) -102, var2.field3728)) {
                return false;
            } else if (!super.field5544.method4349((byte) -102, var2.field3721)) {
                return false;
            } else if (!super.field5544.method4349((byte) -102, var2.field3726)) {
                return false;
            } else if (!super.field5544.method4349((byte) -102, var2.field3724)) {
                return false;
            } else if (!super.field5544.method4349((byte) -102, var2.field3720)) {
                return false;
            } else {
                return super.field5544.method4349((byte) -102, var2.field3725);
            }
        }
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(I)V")
    public final void method297(int arg0) {
        ++field6667;
        super.method297(-89);
        class253 var2 = (class253) super.field5543;
        this.field6670 = class611.method3549(0, super.field5544, var2.field3728);
        this.field6657 = class611.method3549(0, super.field5544, var2.field3721);
        this.field6662 = class611.method3549(0, super.field5544, var2.field3726);
        this.field6669 = class611.method3549(0, super.field5544, var2.field3724);
        this.field6663 = class611.method3549(0, super.field5544, var2.field3720);
        this.field6659 = class611.method3549(0, super.field5544, var2.field3725);
        int var3 = 5 / ((arg0 - 83) / 32);
    }
}
