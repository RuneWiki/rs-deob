import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class272 extends class17 {

    @OriginalMember(owner = "client!pp", name = "G", descriptor = "I")
    private int field4030 = 4096;

    @OriginalMember(owner = "client!pp", name = "H", descriptor = "I")
    private int field4031 = 4096;

    @OriginalMember(owner = "client!pp", name = "F", descriptor = "I")
    private int field4029 = 4096;

    @OriginalMember(owner = "client!pp", name = "I", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!pp", name = "J", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!pp", name = "K", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lwm;II)V")
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (arg2 != 5159) {
            this.method89(-37, (byte) 81);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field4030 = arg0.method2338(0);
                }
            } else {
                this.field4029 = arg0.method2338(0);
            }
        } else {
            this.field4031 = arg0.method2338(0);
        }
        ++field4034;
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
    public class272() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field4033;
        if (arg1 != -25) {
            this.field4029 = -82;
        }
        int[][] var3 = super.field201.method1851(arg0, (byte) -56);
        if (super.field201.field4431) {
            int[][] var4 = this.method91(0, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class530.field7763 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field4031 * var12 >> 12;
                    var9[var11] = this.field4029 * var13 >> 12;
                    var10[var11] = this.field4030 * var14 >> 12;
                } else {
                    var8[var11] = this.field4031;
                    var9[var11] = this.field4029;
                    var10[var11] = this.field4030;
                }
            }
        }
        return var3;
    }
}
