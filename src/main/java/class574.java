import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class574 {

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public int field7722;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public int field7724;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
    public static int field7725;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
    public int field7727;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IFI[FIIIIII)V", line = 5)
    public static final void method3154(int arg0, float arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = arg0 - arg4;
        int var11 = arg9 - arg2;
        field7726++;
        int var12 = arg5 - arg8;
        float var13 = arg3[2] * (float) var10 + arg3[0] * (float) var11 + arg3[1] * (float) var12;
        float var14 = arg3[5] * (float) var10 + arg3[4] * (float) var12 + arg3[3] * (float) var11;
        float var15 = arg3[8] * (float) var10 + arg3[6] * (float) var11 + arg3[7] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg1 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg6 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg6 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg6 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class199.field2934 = var18;
        class324.field4792 = var17;
        if (arg7 == -22113) {
            ;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljr;Z)V", line = 58)
    public final void method3155(class96 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field7725++;
        while (true) {
            int var3 = arg0.method718(-82);
            if (var3 == 0) {
                return;
            }
            this.method3157(var3, 16748, arg0);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Liv;B)I", line = 84)
    public static final int method3156(class84 arg0, byte arg1) {
        field7721++;
        if (class558.field7530 == arg0) {
            return 5890;
        } else if (class391.field5472 == arg0) {
            return 34167;
        } else if (class85.field1174 == arg0) {
            return 34168;
        } else if (class22.field305 == arg0) {
            return 34166;
        } else {
            if (arg1 <= 71) {
                method3156(null, (byte) -29);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IILjr;)V", line = 110)
    private final void method3157(int arg0, int arg1, class96 arg2) {
        if (arg1 != 16748) {
            this.method3157(53, -48, null);
        }
        field7723++;
        if (arg0 == 1) {
            this.field7727 = arg2.method743((byte) -66);
            this.field7724 = arg2.method718(-103);
            this.field7722 = arg2.method718(-120);
        }
    }
}
