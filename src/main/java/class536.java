import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class536 extends class184 {

    @OriginalMember(owner = "client!nw", name = "q", descriptor = "I")
    private int field7296 = 0;

    @OriginalMember(owner = "client!nw", name = "n", descriptor = "[I")
    public static int[] field7293 = new int[14];

    @OriginalMember(owner = "client!nw", name = "l", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!nw", name = "m", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!nw", name = "p", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!nw", name = "o", descriptor = "Lug;")
    public static class516 field7294;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIIFIII[FIF)V")
    public static final void method2961(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7, float[] arg8, int arg9, float arg10) {
        int var11 = arg0 - arg9;
        int var12 = arg7 - arg3;
        ++field7295;
        int var13 = arg1 - arg5;
        float var14 = arg8[2] * (float) var11 + arg8[1] * (float) var13 + arg8[0] * (float) var12;
        float var15 = arg8[5] * (float) var11 + arg8[3] * (float) var12 + arg8[4] * (float) var13;
        float var16 = arg8[8] * (float) var11 + arg8[arg6] * (float) var12 + arg8[7] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg4 != 1.0F) {
            var17 = arg4 * var17;
        }
        float var18 = var15 + 0.5F + arg10;
        if (~arg2 != -2) {
            if (~arg2 != -3) {
                if (arg2 == 3) {
                    float var19 = var17;
                    var17 = var18;
                    var18 = -var19;
                }
            } else {
                var18 = -var18;
                var17 = -var17;
            }
        } else {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        }
        class159.field2385 = var18;
        class76.field1050 = var17;
    }

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "(I)V")
    public static void method2962(int arg0) {
        field7294 = null;
        field7293 = null;
        if (arg0 != 2) {
            method2963(91L, true);
        }
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lpj;Lmu;)V")
    public class536(class132 arg0, class272 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(JZ)V")
    public static final void method2963(long arg0, boolean arg1) {
        if (!arg1) {
            field7293 = null;
        }
        ++field7292;
        int var3 = class253.field3576.field509 - -class184.field2710;
        int var4 = class253.field3576.field514 - -class154.field2331;
        if (~(-var3 + class581.field8108) > 1999 || ~(class581.field8108 - var3) < -2001 || ~(-var4 + class652.field9218) > 1999 || -var4 + class652.field9218 > 2000) {
            class581.field8108 = var3;
            class652.field9218 = var4;
        }
        if (~class581.field8108 != ~var3) {
            int var5 = var3 - class581.field8108;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (~var6 == -1) {
                    var6 = -1;
                } else if (~var6 > ~var5) {
                    var6 = var5;
                }
            } else if (~var6 != -1) {
                if (var5 < var6) {
                    var6 = var5;
                }
            } else {
                var6 = 1;
            }
            class581.field8108 += var6;
        }
        if (class652.field9218 != var4) {
            int var7 = -class652.field9218 + var4;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (~var7 < -1) {
                if (~var8 == -1) {
                    var8 = 1;
                } else if (~var8 < ~var7) {
                    var8 = var7;
                }
            } else if (~var8 != -1) {
                if (var8 < var7) {
                    var8 = var7;
                }
            } else {
                var8 = -1;
            }
            class652.field9218 += var8;
        }
        if (!class274.field3872.field874) {
            class646.field9167 += (float) arg0 * class149.field2221 / 6.0F;
            class249.field3516 += (float) arg0 * class509.field6981 / 6.0F;
        }
        class407.method2320(29199);
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IZ)V")
    public final void method109(int arg0, boolean arg1) {
        if (arg0 != 8444) {
            method2963(65L, true);
        }
        ++field7291;
        int var3 = super.field2703.field6683.method371(super.field2709.method33(), (byte) -116, class652.field9217) - -super.field2703.field6687;
        int var4 = super.field2703.field6685.method2192(class603.field8386, 2, super.field2709.method29()) - -super.field2703.field6690;
        super.field2709.method2655((float) (var3 - -(super.field2709.method33() / 2)), (float) (super.field2709.method29() / 2 + var4), 4096, this.field7296);
        this.field7296 += ((class272) super.field2703).field3831;
    }
}
