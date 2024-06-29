import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class681 {

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "I")
    public static int field9672;

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "I")
    public static int field9673;

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "I")
    public static int field9674;

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "I")
    public static int field9675;

    @OriginalMember(owner = "client!iaa", name = "g", descriptor = "I")
    public int field9678;

    @OriginalMember(owner = "client!iaa", name = "h", descriptor = "I")
    public int field9679;

    @OriginalMember(owner = "client!iaa", name = "i", descriptor = "I")
    private int field9680;

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "Lbr;")
    public class224 field9676;

    @OriginalMember(owner = "client!iaa", name = "j", descriptor = "Lu;")
    public static class69 field9681;

    @OriginalMember(owner = "client!iaa", name = "f", descriptor = "[[B")
    public static byte[][] field9677;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Ldga;B)V")
    public final void method3757(class138 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method957((byte) -69);
            if (var3 == 0) {
                field9675++;
                if (arg1 != -45) {
                    this.method3759(null, 25, 40);
                    return;
                }
                return;
            }
            this.method3759(arg0, -2, var3);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IF[FIFIFIIIIII)V")
    public static final void method3758(int arg0, float arg1, float[] arg2, int arg3, float arg4, int arg5, float arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field9673++;
        int var13 = arg9 - arg12;
        int var14 = arg7 - arg3;
        int var15 = arg11 - arg0;
        float var16 = arg2[2] * (float) var15 + arg2[1] * (float) var14 + arg2[0] * (float) var13;
        float var17 = arg2[5] * (float) var15 + arg2[4] * (float) var14 + arg2[3] * (float) var13;
        int var18 = -87 % ((46 - arg8) / 34);
        float var19 = arg2[8] * (float) var15 + arg2[7] * (float) var14 + arg2[6] * (float) var13;
        float var20;
        float var21;
        if (arg5 == 0) {
            var21 = arg4 + var16 + 0.5F;
            var20 = arg6 + 0.5F - var19;
        } else if (arg5 == 1) {
            var21 = arg4 + var16 + 0.5F;
            var20 = arg6 + var19 + 0.5F;
        } else if (arg5 == 2) {
            var20 = arg1 + 0.5F - var17;
            var21 = arg4 + 0.5F - var16;
        } else if (arg5 == 3) {
            var20 = arg1 + 0.5F - var17;
            var21 = arg4 + var16 + 0.5F;
        } else if (arg5 == 4) {
            var20 = arg1 + 0.5F - var17;
            var21 = arg6 + var19 + 0.5F;
        } else {
            var21 = arg6 + 0.5F - var19;
            var20 = arg1 + 0.5F - var17;
        }
        if (arg10 == 1) {
            float var23 = var21;
            var21 = -var20;
            var20 = var23;
        } else if (arg10 == 2) {
            var21 = -var21;
            var20 = -var20;
        } else if (arg10 == 3) {
            float var22 = var21;
            var21 = var20;
            var20 = -var22;
        }
        class667.field9486 = var21;
        class625.field8505 = var20;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Ldga;II)V")
    private final void method3759(class138 arg0, int arg1, int arg2) {
        field9674++;
        if (arg2 == 1) {
            this.field9680 = arg0.method922((byte) -124);
        } else if (arg2 == 2) {
            this.field9679 = arg0.method957((byte) -123);
            this.field9678 = arg0.method957((byte) -101);
        }
        int var4 = -69 % ((-arg1 - 71) / 45);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z)Lme;")
    public final synchronized class366 method3760(boolean arg0) {
        field9672++;
        class366 var2 = (class366) this.field9676.field2920.method3134((long) this.field9680, -20);
        if (var2 != null) {
            return var2;
        } else if (arg0) {
            return null;
        } else {
            class366 var3 = class366.method2245(this.field9676.field2908, this.field9680, 0);
            if (var3 != null) {
                this.field9676.field2920.method3130((long) this.field9680, !arg0, var3);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V")
    public static void method3761(int arg0) {
        if (arg0 != -23712) {
            field9681 = null;
        }
        field9681 = null;
        field9677 = null;
    }
}
