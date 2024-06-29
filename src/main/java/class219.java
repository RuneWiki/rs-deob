import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class219 extends class228 {

    @OriginalMember(owner = "client!ql", name = "T", descriptor = "[Loa;")
    public static class99[] field3812 = new class99[500];

    @OriginalMember(owner = "client!ql", name = "U", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!ql", name = "V", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!ql", name = "W", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!ql", name = "X", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!ql", name = "S", descriptor = "Ltg;")
    public static class182 field3811;

    @OriginalMember(owner = "client!ql", name = "Y", descriptor = "[I")
    public static int[] field3817;

    @OriginalMember(owner = "client!ql", name = "Z", descriptor = "[I")
    public static int[] field3818;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        ++field3816;
        if (arg1 != -3) {
            field3818 = null;
        }
        int[] var3 = super.field3952.method1262(arg0, arg1 + 7495);
        if (super.field3952.field3276) {
            int[] var4 = this.method1500(arg0, 0, (byte) 124);
            int[] var5 = this.method1500(arg0, 1, (byte) 111);
            int[] var6 = this.method1500(arg0, 2, (byte) 106);
            for (int var7 = 0; ~var7 > ~class234.field4046; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (~var8 != -1) {
                    var3[var7] = var4[var7] * var8 - -((4096 - var8) * var5[var7]) >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
    public class219() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg2 == -7618) {
            if (arg0 == 0) {
                super.field3943 = ~arg1.method1693((byte) 44) == -2;
            }
            ++field3815;
        }
    }

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "(B)V")
    public static void method1457(byte arg0) {
        if (arg0 == -20) {
            field3817 = null;
            field3812 = null;
            field3811 = null;
            field3818 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)[[I")
    public final int[][] method19(byte arg0, int arg1) {
        ++field3813;
        int[][] var3 = super.field3948.method1797(arg1, (byte) -124);
        if (super.field3948.field4791) {
            int[] var4 = this.method1500(arg1, 2, (byte) 115);
            int[][] var5 = this.method1502(255, arg1, 0);
            int[][] var6 = this.method1502(arg0 ^ -230, arg1, 1);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[2];
            int[] var12 = var6[0];
            int[] var13 = var5[1];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; class234.field4046 > var16; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (~var17 == -1) {
                        var8[var16] = var12[var16];
                        var7[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var8[var16] = var10[var16] * var17 - -(var12[var16] * var18) >> 12;
                        var7[var16] = var13[var16] * var17 - -(var14[var16] * var18) >> 12;
                        var9[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                } else {
                    var8[var16] = var10[var16];
                    var7[var16] = var13[var16];
                    var9[var16] = var11[var16];
                }
            }
        }
        if (arg0 != -27) {
            this.method19((byte) 18, 93);
        }
        return var3;
    }
}
