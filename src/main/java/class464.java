import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class464 extends class666 {

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    private int field6448 = 4096;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
    private int field6452 = 4096;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    private int field6450 = 4096;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "Lep;")
    public static class382 field6446 = null;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "Ltq;")
    public static class572 field6451 = new class572(512);

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "Lpr;")
    public static class407 field6454 = new class407(82, -1);

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILiaa;Z)V", line = 4)
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (arg2) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        this.field6450 = arg1.method2574(-1758460248);
                    }
                } else {
                    this.field6448 = arg1.method2574(-1758460248);
                }
            } else {
                this.field6452 = arg1.method2574(-1758460248);
            }
            ++field6453;
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V", line = 48)
    public class464() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)[[I", line = 51)
    public final int[][] method1251(int arg0, byte arg1) {
        ++field6447;
        if (arg1 != 98) {
            this.field6452 = 26;
        }
        int[][] var3 = super.field9471.method3639(59, arg0);
        if (super.field9471.field9180) {
            int[][] var4 = this.method3737(arg0, 0, 3);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class501.field7222 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var8[var11] = this.field6452 * var12 >> 12;
                    var9[var11] = this.field6448 * var13 >> 12;
                    var10[var11] = this.field6450 * var14 >> 12;
                } else {
                    var8[var11] = this.field6452;
                    var9[var11] = this.field6448;
                    var10[var11] = this.field6450;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIII)V", line = 118)
    public static final void method2642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg4; var6 <= arg2; ++var6) {
            class445.method2463(arg1, 123, arg5, arg3, class156.field1755[var6]);
        }
        if (arg0 != -1775995604) {
            field6451 = null;
        }
        ++field6449;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V", line = 140)
    public static void method2643(byte arg0) {
        field6451 = null;
        field6454 = null;
        field6446 = null;
        if (arg0 < 47) {
            method2642(68, 46, 24, 4, 13, 116);
        }
    }
}
