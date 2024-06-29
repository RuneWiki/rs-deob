import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class512 extends class114 {

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "[I")
    public static int[] field7311 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!kp", name = "w", descriptor = "[I")
    public static int[] field7319 = new int[32];

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "Ljo;")
    public static class351 field7313 = new class351(72, 2);

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!kp", name = "v", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!kp", name = "x", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!kp", name = "y", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!kp", name = "A", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!kp", name = "B", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!kp", name = "C", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!kp", name = "D", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!kp", name = "E", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!kp", name = "F", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "Lqda;")
    private class112 field7310;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "Lqda;")
    private class112 field7312;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "Lqda;")
    private class112 field7314;

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "Lqda;")
    public class112 field7316;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "Lqda;")
    private class112 field7317;

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "Lqda;")
    private class112 field7322;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(Z)V", line = 4)
    public static void method2987(boolean arg0) {
        if (!arg0) {
            method2989(116, 110L);
        }
        field7319 = null;
        field7311 = null;
        field7313 = null;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lcb;Lcb;Lgea;)V", line = 16)
    public class512(class544 arg0, class544 arg1, class82 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)Z", line = 20)
    public final boolean method814(byte arg0) {
        ++field7318;
        if (!super.method814((byte) -127)) {
            return false;
        } else {
            class82 var2 = (class82) super.field1443;
            if (!super.field1438.method3131(123, var2.field1084)) {
                return false;
            } else if (!super.field1438.method3131(120, var2.field1088)) {
                return false;
            } else {
                int var3 = 109 % ((-65 - arg0) / 37);
                if (!super.field1438.method3131(-38, var2.field1093)) {
                    return false;
                } else if (!super.field1438.method3131(-60, var2.field1086)) {
                    return false;
                } else if (!super.field1438.method3131(125, var2.field1087)) {
                    return false;
                } else {
                    return super.field1438.method3131(-87, var2.field1089);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IZII)V", line = 57)
    public final void method812(int arg0, boolean arg1, int arg2, int arg3) {
        ++field7328;
        if (arg0 != 1026) {
            this.method810(75, 96, (byte) 62, false);
        }
        if (arg1) {
            int[] var5 = new int[4];
            class638.field8979.method428(var5);
            class638.field8979.method455(arg2, arg3, arg2 - -super.field1443.field3769, super.field1443.field3773 + arg3);
            int var6 = this.field7317.method781();
            int var7 = this.field7317.method792();
            int var8 = this.field7314.method781();
            int var9 = this.field7314.method792();
            this.field7317.method785(arg2, arg3 - -((-var7 + super.field1443.field3773) / 2));
            this.field7314.method785(arg2 - var8 + super.field1443.field3769, (-var9 + super.field1443.field3773) / 2 + arg3);
            class638.field8979.method455(arg2, arg3, super.field1443.field3769 + arg2, this.field7312.method792() + arg3);
            this.field7312.method791(arg2 + var6, arg3, -var8 + super.field1443.field3769 + -var6, super.field1443.field3773);
            int var10 = this.field7322.method792();
            class638.field8979.method455(arg2, arg3 - (-super.field1443.field3773 + var10), arg2 - -super.field1443.field3769, super.field1443.field3773 + arg3);
            this.field7322.method791(arg2 + var6, -var10 + arg3 - -super.field1443.field3773, -var8 + super.field1443.field3769 + -var6, super.field1443.field3773);
            class638.field8979.method455(var5[0], var5[1], var5[2], var5[3]);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V", line = 98)
    public final void method811(boolean arg0) {
        super.method811(false);
        ++field7323;
        class82 var2 = (class82) super.field1443;
        this.field7316 = class158.method1258(arg0, var2.field1084, super.field1438);
        this.field7310 = class158.method1258(false, var2.field1088, super.field1438);
        this.field7317 = class158.method1258(false, var2.field1093, super.field1438);
        this.field7314 = class158.method1258(false, var2.field1086, super.field1438);
        this.field7312 = class158.method1258(false, var2.field1087, super.field1438);
        this.field7322 = class158.method1258(false, var2.field1089, super.field1438);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BI)Z", line = 115)
    public static final boolean method2988(byte arg0, int arg1) {
        if (arg0 < 72) {
            field7319 = null;
        }
        ++field7315;
        return arg1 == 0 || arg1 == 1 || ~arg1 == -3;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IJ)I", line = 147)
    public static final int method2989(int arg0, long arg1) {
        class527.method3060(-12477, arg1);
        if (arg0 != 11) {
            return 97;
        } else {
            ++field7324;
            return class241.field3461.get(1);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIII)V", line = 159)
    public void method922(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -17284) {
            this.field7316 = null;
        }
        this.field7316.method791(arg3, arg1, arg2, arg0);
        ++field7320;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIBZ)V", line = 170)
    public final void method810(int arg0, int arg1, byte arg2, boolean arg3) {
        ++field7321;
        int var5 = arg1 + this.field7317.method781();
        int var6 = super.field1443.field3769 + arg1 - this.field7314.method781();
        if (arg2 != 105) {
            method2987(true);
        }
        int var7 = this.field7312.method792() + arg0;
        int var8 = super.field1443.field3773 + (arg0 - this.field7322.method792());
        int var9 = -var5 + var6;
        int var10 = -var7 + var8;
        int var11 = var9 * this.method813(100) / 10000;
        int[] var12 = new int[4];
        class638.field8979.method428(var12);
        class638.field8979.method455(var5, var7, var5 + var11, var8);
        this.method922(var10, var7, var9, var5, -17284);
        class638.field8979.method455(var5 + var11, var7, var6, var8);
        this.field7310.method791(var5, var7, var9, var10);
        class638.field8979.method455(var12[0], var12[1], var12[2], var12[3]);
    }
}
