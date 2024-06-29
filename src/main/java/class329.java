import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class329 extends class270 {

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "Z")
    private boolean field4735 = true;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "Z")
    private boolean field4739 = true;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "Lfg;")
    public static class18 field4734 = new class18(4);

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "[Lec;")
    public static class37[] field4742 = new class37[2048];

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "[I")
    public static int[] field4741 = new int[1000];

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)[I", line = 3)
    public final int[] method81(byte arg0, int arg1) {
        ++field4736;
        int[] var3 = super.field4053.method396(arg1, 87);
        if (arg0 <= 26) {
            return null;
        } else {
            if (super.field4053.field815) {
                int[] var4 = this.method1927(0, 0, !this.field4739 ? arg1 : -arg1 + class30.field442);
                if (this.field4735) {
                    for (int var5 = 0; ~class161.field2445 < ~var5; ++var5) {
                        var3[var5] = var4[-var5 + class267.field3997];
                    }
                } else {
                    class82.method634(var4, 0, var3, 0, class161.field2445);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V", line = 45)
    public static void method2164(int arg0) {
        if (arg0 <= 81) {
            method2164(-79);
        }
        field4741 = null;
        field4734 = null;
        field4742 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)[[I", line = 60)
    public final int[][] method123(boolean arg0, int arg1) {
        ++field4733;
        if (!arg0) {
            this.method81((byte) -125, 120);
        }
        int[][] var3 = super.field4046.method244(arg1, 127);
        if (super.field4046.field488) {
            int[][] var4 = this.method1930(!this.field4739 ? arg1 : -arg1 + class30.field442, 0, (byte) -75);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field4735) {
                for (int var11 = 0; ~class161.field2445 < ~var11; ++var11) {
                    var8[var11] = var5[-var11 + class267.field3997];
                    var9[var11] = var6[-var11 + class267.field3997];
                    var10[var11] = var7[class267.field3997 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class161.field2445; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLec;I)V", line = 125)
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg0 != 108) {
            this.field4739 = false;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field4055 = arg1.method271((byte) 115) == 1;
                }
            } else {
                this.field4739 = arg1.method271((byte) 107) == 1;
            }
        } else {
            this.field4735 = arg1.method271((byte) 125) == 1;
        }
        ++field4737;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V", line = 171)
    public class329() {
        super(1, false);
    }
}
