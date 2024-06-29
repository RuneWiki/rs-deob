import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class467 extends class666 {

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "I")
    private int field6473 = -1;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "Z")
    public static boolean field6478 = false;

    @OriginalMember(owner = "client!dk", name = "D", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    private int field6476;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    private int field6479;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "[I")
    private int[] field6477;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)I")
    public final int method2648(int arg0) {
        if (arg0 != -1) {
            this.method2649(83, 103, -102);
        }
        ++field6480;
        return this.field6473;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(III)V")
    public final void method2649(int arg0, int arg1, int arg2) {
        ++field6474;
        super.method2649(90, arg1, arg2);
        if (arg0 < 87) {
            this.field6473 = 78;
        }
        if (this.field6473 >= 0 && class19.field169 != null) {
            int var4 = !class19.field169.method846((byte) -108, this.field6473).field5499 ? 128 : 64;
            this.field6477 = class19.field169.method854(1.0F, -4476, false, var4, this.field6473, var4);
            this.field6476 = var4;
            this.field6479 = var4;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILiaa;Z)V")
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (!arg2) {
            this.field6479 = 35;
        }
        ++field6472;
        if (arg0 == 0) {
            this.field6473 = arg1.method2574(-1758460248);
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
    public class467() {
        super(0, false);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method1251(int arg0, byte arg1) {
        ++field6475;
        if (arg1 != 98) {
            return null;
        } else {
            int[][] var3 = super.field9471.method3639(83, arg0);
            if (super.field9471.field9180) {
                int var4 = (~class567.field8041 == ~this.field6476 ? arg0 : this.field6476 * arg0 / class567.field8041) * this.field6479;
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (class501.field7222 != this.field6479) {
                    for (int var8 = 0; ~var8 > ~class501.field7222; ++var8) {
                        int var9 = this.field6479 * var8 / class501.field7222;
                        int var10 = this.field6477[var4 + var9];
                        var7[var8] = class203.method1246(var10, 255) << 4;
                        var6[var8] = class203.method1246(var10 >> 4, 4080);
                        var5[var8] = class203.method1246(16711680, var10) >> 12;
                    }
                } else {
                    for (int var11 = 0; var11 < class501.field7222; ++var11) {
                        int var12 = this.field6477[var4++];
                        var7[var11] = class203.method1246(var12, 255) << 4;
                        var6[var11] = class203.method1246(65280, var12) >> 4;
                        var5[var11] = class203.method1246(var12, 16711680) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V")
    public final void method2081(int arg0) {
        ++field6481;
        super.method2081(arg0);
        this.field6477 = null;
    }
}
