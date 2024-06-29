import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class37 {

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public int field523 = 128;

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
    public int field526 = 128;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
    public int field525;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIIIIFF[F[FIZ)V")
    public static final void method259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float[] arg8, float[] arg9, int arg10, boolean arg11) {
        int var12 = arg2 - arg1;
        field521++;
        int var13 = arg3 - arg10;
        int var14 = arg0 - arg5;
        float var15 = arg8[2] * (float) var13 + arg8[0] * (float) var12 + arg8[1] * (float) var14;
        if (arg11) {
            return;
        }
        float var16 = arg8[5] * (float) var13 + arg8[4] * (float) var14 + arg8[3] * (float) var12;
        float var17 = arg8[8] * (float) var13 + arg8[6] * (float) var12 + arg8[7] * (float) var14;
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var18 = arg7 * var18;
        }
        float var19 = var16 + arg6 + 0.5F;
        if (arg4 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg4 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg4 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        arg9[1] = var19;
        arg9[0] = var18;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)Ljt;")
    public final class37 method260(byte arg0) {
        if (arg0 > -39) {
            this.method261(-59, null);
        }
        field522++;
        return new class37(this.field519, this.field523, this.field526, this.field525, this.field520, this.field524);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILjt;)V")
    public final void method261(int arg0, class37 arg1) {
        this.field526 = arg1.field526;
        field518++;
        this.field519 = arg1.field519;
        this.field520 = arg1.field520;
        int var3 = 3 / ((arg0 - 81) / 38);
        this.field523 = arg1.field523;
        this.field525 = arg1.field525;
        this.field524 = arg1.field524;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(I)V")
    public class37(int arg0) {
        this.field519 = arg0;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(IIIIII)V")
    private class37(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field524 = arg5;
        this.field519 = arg0;
        this.field525 = arg3;
        this.field520 = arg4;
        this.field526 = arg2;
        this.field523 = arg1;
    }
}
