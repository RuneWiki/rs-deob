import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class782 {

    @OriginalMember(owner = "client!gfa", name = "h", descriptor = "J")
    public long field10793;

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "[S")
    public short[] field10787;

    @OriginalMember(owner = "client!gfa", name = "g", descriptor = "[S")
    public short[] field10792;

    @OriginalMember(owner = "client!gfa", name = "f", descriptor = "[I")
    public int[] field10791;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
    public static int field10786 = 0;

    @OriginalMember(owner = "client!gfa", name = "e", descriptor = "I")
    public static int field10790 = -1;

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "I")
    public static int field10788;

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "I")
    public static int field10789;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ILes;)Ltda;", line = 8)
    public static final class665 method4332(int arg0, class403 arg1) {
        if (arg0 == 7) {
            field10789++;
            int var2 = arg1.method2390((byte) 97);
            return new class665(var2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IFI[FI[FIFIIFIII)V", line = 31)
    public static final void method4333(int arg0, float arg1, int arg2, float[] arg3, int arg4, float[] arg5, int arg6, float arg7, int arg8, int arg9, float arg10, int arg11, int arg12, int arg13) {
        field10788++;
        int var14 = arg12 - arg6;
        int var15 = arg2 - arg11;
        int var16 = arg13 - arg8;
        float var17 = arg3[2] * (float) var16 + arg3[1] * (float) var14 + arg3[0] * (float) var15;
        float var18 = arg3[5] * (float) var16 + arg3[3] * (float) var15 + arg3[4] * (float) var14;
        float var19 = arg3[8] * (float) var16 + arg3[7] * (float) var14 + arg3[6] * (float) var15;
        float var20;
        float var21;
        if (arg9 == 0) {
            var20 = arg7 + 0.5F - var19;
            var21 = arg10 + var17 + 0.5F;
        } else if (arg9 == 1) {
            var20 = arg7 + var19 + 0.5F;
            var21 = arg10 + var17 + 0.5F;
        } else if (arg9 == 2) {
            var21 = arg10 + 0.5F - var17;
            var20 = arg1 + 0.5F - var18;
        } else if (arg9 == 3) {
            var20 = arg1 + 0.5F - var18;
            var21 = arg10 + var17 + 0.5F;
        } else if (arg9 == 4) {
            var20 = arg1 + 0.5F - var18;
            var21 = arg7 + var19 + 0.5F;
        } else {
            var21 = arg7 + 0.5F - var19;
            var20 = arg1 + 0.5F - var18;
        }
        if (arg4 == 1) {
            float var22 = var21;
            var21 = -var20;
            var20 = var22;
        } else if (arg4 == 2) {
            var21 = -var21;
            var20 = -var20;
        } else if (arg4 == 3) {
            float var23 = var21;
            var21 = var20;
            var20 = -var23;
        }
        arg5[1] = var20;
        arg5[0] = var21;
        if (arg0 != -21631) {
            method4333(105, 0.2974862F, -1, null, -128, null, -41, 0.6709858F, 106, 108, -0.98962545F, -44, 67, 11);
        }
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(J[I[S[S)V", line = 123)
    public class782(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field10793 = arg0;
        this.field10787 = arg3;
        this.field10792 = arg2;
        this.field10791 = arg1;
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "()V", line = 133)
    protected class782() {
    }
}
