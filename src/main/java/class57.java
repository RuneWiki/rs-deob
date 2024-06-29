import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class57 extends class354 {

    @OriginalMember(owner = "client!gv", name = "L", descriptor = "I")
    private int field824 = 3072;

    @OriginalMember(owner = "client!gv", name = "K", descriptor = "I")
    private int field823 = 1024;

    @OriginalMember(owner = "client!gv", name = "N", descriptor = "I")
    private int field826 = 2048;

    @OriginalMember(owner = "client!gv", name = "M", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!gv", name = "O", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!gv", name = "P", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!gv", name = "Q", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!gv", name = "R", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!gv", name = "S", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "(BI)I")
    public static final int method426(byte arg0, int arg1) {
        ++field830;
        if (arg0 != -103) {
            return -13;
        } else {
            return arg1 == 16711935 ? -1 : class61.method439(arg0 ^ -32113, arg1);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IB)[[I")
    public final int[][] method354(int arg0, byte arg1) {
        ++field828;
        int var3 = -29 % ((arg1 - 48) / 60);
        int[][] var4 = super.field5474.method2414((byte) -120, arg0);
        if (super.field5474.field5870) {
            int[][] var5 = this.method2274((byte) 84, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; class531.field7814 > var12; ++var12) {
                var9[var12] = (var6[var12] * this.field826 >> 12) + this.field823;
                var10[var12] = (var7[var12] * this.field826 >> 12) + this.field823;
                var11[var12] = this.field823 - -(var8[var12] * this.field826 >> 12);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "()V")
    public class57() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lnj;II)V")
    public final void method272(class164 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field5466 = ~arg0.method1087(false) == -2;
                }
            } else {
                this.field824 = arg0.method1074(-635989152);
            }
        } else {
            this.field823 = arg0.method1074(arg2 + -635990790);
        }
        ++field825;
        if (arg2 != 1638) {
            this.method354(-113, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(BI)[I")
    public final int[] method270(byte arg0, int arg1) {
        ++field829;
        if (arg0 > -74) {
            this.method357(-29);
        }
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (super.field5478.field6213) {
            int[] var4 = this.method2275((byte) 101, 0, arg1);
            for (int var5 = 0; ~class531.field7814 < ~var5; ++var5) {
                var3[var5] = this.field823 - -(var4[var5] * this.field826 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "(I)V")
    public final void method357(int arg0) {
        ++field827;
        if (arg0 > 28) {
            this.field826 = this.field824 - this.field823;
        }
    }
}
