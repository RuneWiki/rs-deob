import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class232 extends class175 {

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
    private int field3892 = 0;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    private int field3894 = 0;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    private int field3900 = 1;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "Lkj;")
    public static class56 field3889 = new class56(4096);

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "Lij;")
    public static class50 field3895 = class78.method578(122, "sl_back");

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "Lij;")
    private static class50 field3893 = class78.method578(123, "Loading sprites )2 ");

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "Lij;")
    public static class50 field3897 = field3893;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "Lij;")
    public static class50 field3899 = class78.method578(124, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "Lkj;")
    public static class56 field3896 = new class56(512);

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)V")
    public static void method1581(byte arg0) {
        field3897 = null;
        if (arg0 >= 51) {
            field3896 = null;
            field3893 = null;
            field3895 = null;
            field3899 = null;
            field3889 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
    public final void method44(int arg0) {
        if (arg0 != 0) {
            field3899 = null;
        }
        ++field3890;
        class160.method1128((byte) -98);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        ++field3891;
        if (arg1 != -27746) {
            this.field3894 = -58;
        }
        int[] var3 = super.field2941.method1427(-21281, arg0);
        if (super.field2941.field3565) {
            int var4 = class29.field616[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; ~class211.field3514 < ~var6; ++var6) {
                int var7 = class129.field2272[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (~this.field3892 == -1) {
                    var9 = (-var4 + var7) * this.field3900;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field3900 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (~this.field3894 == -1) {
                    var12 = class247.field4305[255 & var12 >> 4] + 4096 >> 1;
                } else if (~this.field3894 == -3) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 3) {
                    this.field3900 = arg2.method1487(255);
                }
            } else {
                this.field3894 = arg2.method1487(255);
            }
        } else {
            this.field3892 = arg2.method1487(255);
        }
        if (!arg0) {
            this.method44(21);
        }
        ++field3898;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class232() {
        super(0, true);
    }
}
