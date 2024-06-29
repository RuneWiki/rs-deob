import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class412 extends class601 {

    @OriginalMember(owner = "client!taa", name = "C", descriptor = "I")
    private int field5712 = -1;

    @OriginalMember(owner = "client!taa", name = "G", descriptor = "I")
    public static int field5715 = 13156520;

    @OriginalMember(owner = "client!taa", name = "D", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!taa", name = "F", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!taa", name = "H", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!taa", name = "I", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!taa", name = "L", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!taa", name = "M", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!taa", name = "O", descriptor = "I")
    private int field5722;

    @OriginalMember(owner = "client!taa", name = "P", descriptor = "I")
    private int field5723;

    @OriginalMember(owner = "client!taa", name = "Q", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!taa", name = "N", descriptor = "J")
    public static long field5721;

    @OriginalMember(owner = "client!taa", name = "J", descriptor = "[I")
    private int[] field5718;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "(I)I")
    public final int method2401(int arg0) {
        ++field5713;
        if (arg0 <= 85) {
            this.field5723 = -57;
        }
        return this.field5712;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)Z")
    public static final boolean method2402(int arg0, int arg1) {
        ++field5724;
        if (arg1 < 72) {
            field5715 = 75;
        }
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IBI)V")
    public final void method2403(int arg0, byte arg1, int arg2) {
        ++field5716;
        int var4 = 105 % ((arg1 - 47) / 38);
        super.method2403(arg0, (byte) -117, arg2);
        if (~this.field5712 <= -1 && class293.field4204 != null) {
            int var5 = !class293.field4204.method91(this.field5712, (byte) 127).field10548 ? 128 : 64;
            this.field5718 = class293.field4204.method86(-125, var5, 1.0F, false, this.field5712, var5);
            this.field5722 = var5;
            this.field5723 = var5;
        }
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(IZ)[[I")
    public final int[][] method7(int arg0, boolean arg1) {
        ++field5720;
        if (!arg1) {
            this.field5718 = null;
        }
        int[][] var3 = super.field7890.method3963(1, arg0);
        if (super.field7890.field9769) {
            int var4 = (class671.field9149 != this.field5723 ? this.field5723 * arg0 / class671.field9149 : arg0) * this.field5722;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class171.field2624 != ~this.field5722) {
                for (int var8 = 0; ~var8 > ~class171.field2624; ++var8) {
                    int var9 = this.field5722 * var8 / class171.field2624;
                    int var10 = this.field5718[var4 - -var9];
                    var7[var8] = class48.method346(var10 << 4, 4080);
                    var6[var8] = class48.method346(4080, var10 >> 4);
                    var5[var8] = class48.method346(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; ~class171.field2624 < ~var11; ++var11) {
                    int var12 = this.field5718[var4++];
                    var7[var11] = class48.method346(var12 << 4, 4080);
                    var6[var11] = class48.method346(var12 >> 4, 4080);
                    var5[var11] = class48.method346(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZI)V")
    public static final void method2404(boolean arg0, int arg1) {
        ++field5714;
        if (arg0) {
            method2402(116, 71);
        }
        class14.field209 = arg1;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Lee;BI)V")
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            this.field5712 = arg0.method3807(-1);
        }
        ++field5719;
        if (arg1 != -61) {
            this.field5718 = null;
        }
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "()V")
    public class412() {
        super(0, false);
    }

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "(Z)V")
    public final void method1986(boolean arg0) {
        super.method1986(arg0);
        ++field5717;
        if (!arg0) {
            field5715 = -97;
        }
        this.field5718 = null;
    }
}
