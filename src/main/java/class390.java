import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class390 extends class646 {

    @OriginalMember(owner = "client!id", name = "I", descriptor = "F")
    public static float field5679;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "F")
    public static float field5682;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "[Lmg;")
    public static class221[] field5685;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "[[[Z")
    public static boolean[][][] field5686;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)[[I", line = 5)
    public final int[][] method298(int arg0, int arg1) {
        ++field5683;
        if (arg0 != -12424) {
            field5686 = null;
        }
        int[][] var3 = super.field9164.method1002(77, arg1);
        if (super.field9164.field2082) {
            int[] var4 = this.method3628(false, 2, arg1);
            int[][] var5 = this.method3626(arg0 + 12502, arg1, 0);
            int[][] var6 = this.method3626(38, arg1, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class89.field1330; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 != 0) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZILis;I)V", line = 85)
    public static final void method2374(boolean arg0, int arg1, class101 arg2, int arg3) {
        class555.field8123 = arg2;
        if (arg0) {
            field5686 = null;
        }
        ++field5684;
        class71.field1145 = arg3;
        class70.field1108 = arg1;
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V", line = 99)
    public static void method2375(int arg0) {
        field5685 = null;
        if (arg0 < 24) {
            method2374(false, -13, (class101) null, 120);
        }
        field5686 = null;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(IB)[I", line = 111)
    public final int[] method424(int arg0, byte arg1) {
        ++field5680;
        int[] var3 = super.field9156.method2193(arg1 + 1389, arg0);
        if (super.field9156.field5075) {
            int[] var4 = this.method3628(false, 0, arg0);
            int[] var5 = this.method3628(false, 1, arg0);
            int[] var6 = this.method3628(false, 2, arg0);
            for (int var7 = 0; ~class89.field1330 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (~var8 == -1) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        if (arg1 != -120) {
            this.method298(29, 15);
        }
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V", line = 164)
    public class390() {
        super(3, false);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIB)V", line = 169)
    public static final void method2376(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field5687;
        class449 var5 = class611.method3463(arg0, (byte) -110, 8);
        var5.method2615((byte) -59);
        var5.field6472 = arg2;
        var5.field6480 = arg1;
        var5.field6479 = arg3;
        if (arg4 > -91) {
            method2376(-23, -88, -96, -41, (byte) -72);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lek;IB)V", line = 186)
    public final void method295(class465 arg0, int arg1, byte arg2) {
        ++field5681;
        if (~arg1 == -1) {
            super.field9160 = arg0.method2705(-60) == 1;
        }
        if (arg2 < 7) {
            this.method295((class465) null, -80, (byte) 92);
        }
    }
}
