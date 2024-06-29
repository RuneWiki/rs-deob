import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class590 extends class362 {

    @OriginalMember(owner = "client!via", name = "B", descriptor = "Lfja;")
    public static class783 field8310 = new class783(118, -1);

    @OriginalMember(owner = "client!via", name = "y", descriptor = "I")
    public static int field8307;

    @OriginalMember(owner = "client!via", name = "z", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!via", name = "A", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!via", name = "C", descriptor = "I")
    public static int field8311;

    @OriginalMember(owner = "client!via", name = "D", descriptor = "I")
    public static int field8312;

    @OriginalMember(owner = "client!via", name = "c", descriptor = "(I)V")
    public static void method3381(int arg0) {
        field8310 = null;
        if (arg0 != -1) {
            field8310 = null;
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(Lfca;II)V")
    public final void method154(class93 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            super.field4929 = arg0.method793((byte) 121) == 1;
        }
        if (arg2 != -1) {
            field8308 = 88;
        }
        ++field8311;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(IB)[[I")
    public final int[][] method153(int arg0, byte arg1) {
        ++field8309;
        int[][] var3 = super.field4938.method3199(arg0, (byte) 103);
        if (arg1 <= 57) {
            this.method153(-119, (byte) -86);
        }
        if (super.field4938.field7848) {
            int[] var4 = this.method2221(2, arg0, -125);
            int[][] var5 = this.method2222(0, arg0, 28008);
            int[][] var6 = this.method2222(1, arg0, 28008);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class769.field10597; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 == -1) {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!via", name = "<init>", descriptor = "()V")
    public class590() {
        super(3, false);
    }

    @OriginalMember(owner = "client!via", name = "f", descriptor = "(I)I")
    public static final int method3382(int arg0) {
        ++field8307;
        if (arg0 != 100) {
            method3381(-113);
        }
        int var1 = class256.field3596.method2108((byte) -81);
        if (~(class676.field9430.length + -1) < ~var1) {
            class256.field3596 = class676.field9430[var1 + 1];
        }
        return 100;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(II)[I")
    public final int[] method156(int arg0, int arg1) {
        ++field8312;
        if (arg0 != -2026769311) {
            this.method156(103, -81);
        }
        int[] var3 = super.field4927.method808(-123, arg1);
        if (super.field4927.field1471) {
            int[] var4 = this.method2221(0, arg1, arg0 + 2026769210);
            int[] var5 = this.method2221(1, arg1, 71);
            int[] var6 = this.method2221(2, arg1, 113);
            for (int var7 = 0; var7 < class769.field10597; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (var8 != 0) {
                        var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }
}
