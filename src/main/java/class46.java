import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class46 extends class478 {

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    private int field474 = 2048;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
    private int field475 = 1024;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    private int field481 = 3072;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "[I")
    public static int[] field480 = new int[8];

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    public static int field482 = 0;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "[I")
    public static int[] field473;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "[I")
    public static int[] field479;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)[I", line = 6)
    public final int[] method35(int arg0, int arg1) {
        ++field486;
        int[] var3 = super.field6886.method789(arg0, (byte) -37);
        if (arg1 != -11323) {
            this.method104(false, -58);
        }
        if (super.field6886.field1592) {
            int[] var4 = this.method2752(arg0, -29, 0);
            for (int var5 = 0; ~var5 > ~class436.field6154; ++var5) {
                var3[var5] = (var4[var5] * this.field474 >> 12) + this.field475;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V", line = 38)
    public static void method242(int arg0) {
        if (arg0 != 1) {
            field480 = null;
        }
        field480 = null;
        field479 = null;
        field473 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 50)
    public final void method34(byte arg0) {
        if (arg0 != 23) {
            this.field474 = 15;
        }
        this.field474 = this.field481 - this.field475;
        ++field484;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V", line = 167)
    public class46() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILnp;I)V", line = 77)
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (arg0 != 255) {
            this.field481 = 21;
        }
        ++field476;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field6881 = arg1.method620((byte) 51) == 1;
                }
            } else {
                this.field481 = arg1.method643((byte) -77);
            }
        } else {
            this.field475 = arg1.method643((byte) -77);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)[[I", line = 120)
    public final int[][] method104(boolean arg0, int arg1) {
        ++field485;
        int[][] var3 = super.field6889.method2091(28, arg1);
        if (super.field6889.field4765) {
            int[][] var4 = this.method2753(0, arg1, (byte) 11);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class436.field6154; ++var11) {
                var8[var11] = (var5[var11] * this.field474 >> 12) + this.field475;
                var9[var11] = (var6[var11] * this.field474 >> 12) + this.field475;
                var10[var11] = (var7[var11] * this.field474 >> 12) + this.field475;
            }
        }
        if (!arg0) {
            this.method35(-94, 94);
        }
        return var3;
    }
}
