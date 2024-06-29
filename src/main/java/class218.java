import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class218 extends class263 {

    @OriginalMember(owner = "client!rs", name = "F", descriptor = "I")
    private int field3120 = 0;

    @OriginalMember(owner = "client!rs", name = "E", descriptor = "I")
    private int field3119 = 1365;

    @OriginalMember(owner = "client!rs", name = "N", descriptor = "I")
    private int field3128 = 20;

    @OriginalMember(owner = "client!rs", name = "K", descriptor = "I")
    private int field3125 = 0;

    @OriginalMember(owner = "client!rs", name = "H", descriptor = "I")
    public static int field3122 = 1;

    @OriginalMember(owner = "client!rs", name = "L", descriptor = "I")
    public static int field3126 = 0;

    @OriginalMember(owner = "client!rs", name = "G", descriptor = "Luv;")
    public static class2 field3121 = new class2(41, 15);

    @OriginalMember(owner = "client!rs", name = "I", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!rs", name = "J", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!rs", name = "M", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!rs", name = "O", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V", line = 4)
    public class218() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(III)V", line = 9)
    public static final void method1378(int arg0, int arg1, int arg2) {
        class306 var3 = class236.field3305[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field4596 != null) {
                var3.field4596 = null;
            }
            if (var3.field4582 != null) {
                var3.field4582 = null;
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IB)[I", line = 35)
    public final int[] method33(int arg0, byte arg1) {
        ++field3124;
        int[] var3 = super.field3917.method41(arg0, 1);
        if (arg1 < 40) {
            field3121 = null;
        }
        if (super.field3917.field91) {
            for (int var4 = 0; class367.field5597 > var4; ++var4) {
                int var5 = (class379.field5711[var4] << 12) / this.field3119 + this.field3125;
                int var6 = (class170.field2509[arg0] << 12) / this.field3119 + this.field3120;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13;
                for (var13 = 0; var11 - -var12 < 16384 && this.field3128 > var13; ++var13) {
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = -var12 + var7 + var11;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = ~var13 <= ~(this.field3128 + -1) ? 0 : (var13 << 12) / this.field3128;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)V", line = 95)
    public static final void method1379(int arg0) {
        class311.field4830 = arg0;
        ++field3127;
        int var1 = class400.field5966.method2765(90);
        int var2 = class400.field5966.method2730(-1458809016);
        int var3 = class400.field5966.method2774(32);
        boolean var4 = ~class400.field5966.method2752((byte) -10) == -2;
        class476.method2836(var1, arg0 ^ -96);
        int var5 = (-class400.field5966.field6830 + class158.field2386) / 16;
        class23.field335 = new int[var5][4];
        for (int var6 = 0; ~var6 > ~var5; ++var6) {
            for (int var10 = 0; ~var10 > -5; ++var10) {
                class23.field335[var6][var10] = class400.field5966.method2722(false);
            }
        }
        class50.field639 = new byte[var5][];
        class163.field2433 = new int[var5];
        class451.field6630 = null;
        class180.field2659 = new int[var5];
        class495.field7349 = new int[var5];
        class27.field393 = new int[var5];
        class450.field6624 = new byte[var5][];
        class146.field2201 = new int[var5];
        class229.field3226 = new byte[var5][];
        class194.field2866 = new byte[var5][];
        class230.field3231 = null;
        int var7 = 0;
        for (int var8 = (-(class50.field640 >> 4) + var2) / 8; var8 <= ((class50.field640 >> 4) + var2) / 8; ++var8) {
            for (int var9 = (-(class448.field6611 >> 4) + var3) / 8; ~((var3 - -(class448.field6611 >> 4)) / 8) <= ~var9; ++var9) {
                class495.field7349[var7] = (var8 << 8) - -var9;
                class27.field393[var7] = class302.field4502.method539((byte) 27, "m" + var8 + "_" + var9);
                class163.field2433[var7] = class302.field4502.method539((byte) 27, "l" + var8 + "_" + var9);
                class146.field2201[var7] = class302.field4502.method539((byte) 27, "um" + var8 + "_" + var9);
                class180.field2659[var7] = class302.field4502.method539((byte) 27, "ul" + var8 + "_" + var9);
                ++var7;
            }
        }
        class498.method2963(10, (byte) 89, var3, var2, var4);
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(II)Z", line = 180)
    public static final boolean method1380(int arg0, int arg1) {
        if (arg1 != 0) {
            return true;
        } else {
            ++field3129;
            return ~arg0 == -7 || arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZLgk;)V", line = 191)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        if (!arg1) {
            field3121 = null;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.field3120 = arg2.method2727((byte) 43);
                    }
                } else {
                    this.field3125 = arg2.method2727((byte) 43);
                }
            } else {
                this.field3128 = arg2.method2727((byte) 43);
            }
        } else {
            this.field3119 = arg2.method2727((byte) 43);
        }
        ++field3123;
    }

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "(I)V", line = 243)
    public static void method1381(int arg0) {
        if (arg0 == 8) {
            field3121 = null;
        }
    }
}
