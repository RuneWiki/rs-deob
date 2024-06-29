import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class186 extends class14 {

    @OriginalMember(owner = "client!ol", name = "O", descriptor = "I")
    private int field2632 = 3072;

    @OriginalMember(owner = "client!ol", name = "S", descriptor = "I")
    private int field2636 = 2048;

    @OriginalMember(owner = "client!ol", name = "R", descriptor = "I")
    private int field2635 = 1024;

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "I")
    public static int field2630 = -1;

    @OriginalMember(owner = "client!ol", name = "Q", descriptor = "I")
    public static int field2634 = -1;

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "[I")
    public static int[] field2628 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ol", name = "T", descriptor = "[[Z")
    public static boolean[][] field2637 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!ol", name = "U", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)[[I")
    public final int[][] method141(int arg0, int arg1) {
        ++field2633;
        if (arg0 != -30909) {
            this.method142((byte) -48);
        }
        int[][] var3 = super.field268.method2561(arg1, 0);
        if (super.field268.field6091) {
            int[][] var4 = this.method139(0, arg0 ^ -30911, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class115.field1637; ++var11) {
                var8[var11] = (var5[var11] * this.field2636 >> 12) + this.field2635;
                var9[var11] = (var6[var11] * this.field2636 >> 12) + this.field2635;
                var10[var11] = (var7[var11] * this.field2636 >> 12) + this.field2635;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field263 = ~arg2.method2238(255) == -2;
                }
            } else {
                this.field2632 = arg2.method2212((byte) 83);
            }
        } else {
            this.field2635 = arg2.method2212((byte) 83);
        }
        int var5 = -18 % ((-51 - arg1) / 37);
        ++field2629;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
    public final void method142(byte arg0) {
        ++field2638;
        int var2 = 31 / ((arg0 - 39) / 59);
        this.field2636 = -this.field2635 + this.field2632;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
    public class186() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII[FFFIIII)V")
    public static final void method1207(int arg0, int arg1, int arg2, int arg3, float[] arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg8 - arg0;
        if (arg9 == 14642) {
            int var12 = arg2 - arg7;
            int var13 = arg1 - arg3;
            ++field2627;
            float var14 = arg4[2] * (float) var11 + arg4[1] * (float) var12 + arg4[0] * (float) var13;
            float var15 = arg4[5] * (float) var11 + arg4[4] * (float) var12 + arg4[3] * (float) var13;
            float var16 = arg4[8] * (float) var11 + arg4[7] * (float) var12 + arg4[6] * (float) var13;
            float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
            if (arg5 != 1.0F) {
                var17 = arg5 * var17;
            }
            float var18 = var15 + 0.5F + arg6;
            if (~arg10 != -2) {
                if (arg10 == 2) {
                    var18 = -var18;
                    var17 = -var17;
                } else if (arg10 == 3) {
                    float var19 = var17;
                    var17 = var18;
                    var18 = -var19;
                }
            } else {
                float var20 = var17;
                var17 = -var18;
                var18 = var20;
            }
            class522.field7724 = var17;
            class1.field96 = var18;
        }
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(Z)V")
    public static void method1208(boolean arg0) {
        field2637 = null;
        field2628 = null;
        if (!arg0) {
            field2628 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)[I")
    public final int[] method140(int arg0, byte arg1) {
        ++field2631;
        if (arg1 > -2) {
            field2630 = 54;
        }
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (super.field270.field5222) {
            int[] var4 = this.method145(arg0, 0, -18596);
            for (int var5 = 0; ~class115.field1637 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field2636 >> 12) + this.field2635;
            }
        }
        return var3;
    }
}
