import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class529 extends class145 {

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "Lkca;")
    public static class73 field7653 = new class73(48, 12);

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
    public static int field7661 = 0;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "Z")
    public static boolean field7659 = false;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
    private int field7652;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    private int field7655;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
    private int field7662;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(III)B")
    public static final byte method3103(int arg0, int arg1, int arg2) {
        if (arg0 > -79) {
            field7653 = null;
        }
        ++field7658;
        if (~arg1 != -10) {
            return 0;
        } else {
            return (byte) ((1 & arg2) != 0 ? 2 : 1);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (~arg0 == -1) {
            this.method3105(0, arg2.method1180(-832631516));
        }
        ++field7656;
        if (arg1 >= -67) {
            field7661 = 7;
        }
    }

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "(I)V")
    public static void method3104(int arg0) {
        field7653 = null;
        int var1 = -127 / ((30 - arg0) / 63);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
    private final void method3105(int arg0, int arg1) {
        this.field7662 = 4080 & arg1 >> 4;
        this.field7652 = 4080 & arg1 >> 12;
        ++field7654;
        if (arg0 == 0) {
            this.field7655 = 4080 & arg1 << 4;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(I)V")
    private class529(int arg0) {
        super(0, false);
        this.method3105(0, arg0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I[FIIIIIFIFI)V")
    public static final void method3106(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7, int arg8, float arg9, int arg10) {
        ++field7657;
        int var11 = arg10 - arg8;
        if (arg2 != -10) {
            field7653 = null;
        }
        int var12 = arg0 - arg3;
        int var13 = arg4 - arg5;
        float var14 = arg1[2] * (float) var11 + arg1[0] * (float) var12 + arg1[1] * (float) var13;
        float var15 = arg1[5] * (float) var11 + arg1[3] * (float) var12 + arg1[4] * (float) var13;
        float var16 = arg1[8] * (float) var11 + arg1[7] * (float) var13 + arg1[6] * (float) var12;
        float var17 = 0.5F + (float) Math.atan2((double) var14, (double) var16) / 6.2831855F;
        if (arg9 != 1.0F) {
            var17 = arg9 * var17;
        }
        float var18 = var15 + 0.5F + arg7;
        if (~arg6 == -2) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg6 != 2) {
            if (arg6 == 3) {
                float var20 = var17;
                var17 = var18;
                var18 = -var20;
            }
        } else {
            var18 = -var18;
            var17 = -var17;
        }
        class630.field9085 = var18;
        class74.field793 = var17;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    public class529() {
        this(0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BI)[[I")
    public final int[][] method75(byte arg0, int arg1) {
        ++field7660;
        if (arg0 > -28) {
            this.method28(-32, 39, (class194) null);
        }
        int[][] var3 = super.field1792.method1826(arg1, -16486);
        if (super.field1792.field3917) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class647.field9368; ++var7) {
                var4[var7] = this.field7652;
                var5[var7] = this.field7662;
                var6[var7] = this.field7655;
            }
        }
        return var3;
    }
}
