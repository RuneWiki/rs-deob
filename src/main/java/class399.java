import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class399 extends class45 {

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
    private int field6008 = -1;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "Liv;")
    public static class64 field6017 = new class64(81, 8);

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "Lef;")
    public static class335 field6020 = new class335(6, 0, 4, 2);

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    private int field6009;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    private int field6012;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "[I")
    private int[] field6015;

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "[Lf;")
    public static class529[] field6021;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
    public final void method433(int arg0) {
        super.method433(arg0);
        ++field6010;
        this.field6015 = null;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)[[I")
    public final int[][] method49(int arg0, int arg1) {
        ++field6016;
        int[][] var3 = super.field833.method835(arg1, (byte) 23);
        if (super.field833.field1888) {
            int var4 = (class457.field6849 == this.field6012 ? arg1 : this.field6012 * arg1 / class457.field6849) * this.field6009;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class259.field3768 == ~this.field6009) {
                for (int var8 = 0; ~class259.field3768 < ~var8; ++var8) {
                    int var9 = this.field6015[var4++];
                    var7[var8] = class207.method1405(255, var9) << 4;
                    var6[var8] = class207.method1405(65280, var9) >> 4;
                    var5[var8] = class207.method1405(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; ~class259.field3768 < ~var10; ++var10) {
                    int var11 = this.field6009 * var10 / class259.field3768;
                    int var12 = this.field6015[var4 - -var11];
                    var7[var10] = class207.method1405(255, var12) << 4;
                    var6[var10] = class207.method1405(65280, var12) >> 4;
                    var5[var10] = class207.method1405(var12, 16711680) >> 12;
                }
            }
        }
        if (arg0 != 8) {
            this.field6009 = 18;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BII)V")
    public final void method435(byte arg0, int arg1, int arg2) {
        super.method435((byte) 111, arg1, arg2);
        if (arg0 < 102) {
            this.field6012 = 82;
        }
        ++field6014;
        if (this.field6008 >= 0 && class159.field2472 != null) {
            int var4 = !class159.field2472.method956(-945, this.field6008).field1429 ? 128 : 64;
            this.field6015 = class159.field2472.method958(this.field6008, var4, var4, true, false, 1.0F);
            this.field6012 = var4;
            this.field6009 = var4;
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
    public class399() {
        super(0, false);
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V")
    public static void method2459(int arg0) {
        field6017 = null;
        field6020 = null;
        if (arg0 != 0) {
            field6021 = null;
        }
        field6021 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)I")
    public final int method436(byte arg0) {
        if (arg0 != -15) {
            return -40;
        } else {
            ++field6011;
            return this.field6008;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (arg1 != -26471) {
            this.field6012 = -56;
        }
        ++field6013;
        if (~arg2 == -1) {
            this.field6008 = arg0.method1069((byte) -37);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIII)V")
    public static final void method2460(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6018;
        class410.field6141.field2289 = 0;
        class410.field6141.method1109(false, class339.field5133.field6139);
        class410.field6141.method1109(false, arg2);
        class410.field6141.method1109(false, arg4);
        class410.field6141.method1094(1618659784, arg3);
        if (arg1 < 95) {
            method2459(-32);
        }
        class410.field6141.method1094(1618659784, arg0);
        class457.field6848 = 0;
        class369.field5594 = 0;
        class47.field864 = -3;
        class91.field1568 = 1;
    }
}
