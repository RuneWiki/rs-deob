import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class405 extends class123 {

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    private int field5566;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Lre;")
    private class582 field5557;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    private int field5559;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    private int field5558;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    private int field5561;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    private int field5565;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    private int field5562;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Luv;")
    public static class3 field5563 = new class3(41, 8);

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "Ljava/lang/String;")
    public static String field5567 = "";

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "[I")
    public static int[] field5570 = new int[8];

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Lmca;")
    private class5 field5564;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)Lcm;")
    public static final class530 method2418(int arg0, boolean arg1) {
        field5568++;
        if (!arg1) {
            field5563 = null;
        }
        return arg0 >= 0 && arg0 < 100 ? class615.field8872[arg0] : null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIFIII[F)V")
    public static final void method2419(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, float[] arg9) {
        int var10 = arg1 - arg6;
        int var11 = arg8 - arg0;
        field5569++;
        int var12 = arg7 - arg2;
        float var13 = arg9[2] * (float) var11 + arg9[0] * (float) var10 + arg9[1] * (float) var12;
        float var14 = arg9[5] * (float) var11 + arg9[3] * (float) var10 + arg9[4] * (float) var12;
        float var15 = arg9[8] * (float) var11 + arg9[6] * (float) var10 + arg9[7] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg5 + 0.5F;
        if (arg3 != -12638) {
            return;
        }
        if (arg4 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg4 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg4 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class308.field3938 = var18;
        class199.field2602 = var17;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Lmca;")
    public final class5 method668(int arg0) {
        if (arg0 != 3) {
            return null;
        }
        field5571++;
        if (this.field5564 == null) {
            class14.field147[1] = this.field5562;
            class14.field147[0] = this.field5558;
            class14.field147[5] = this.field5561;
            class14.field147[2] = this.field5559;
            class473 var2 = this.field5557.field2114;
            class14.field147[4] = this.field5566;
            class14.field147[3] = this.field5565;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method2144(arg0 + 124, class14.field147[var5])) {
                    return null;
                }
                class41 var7 = var2.method2151(true, class14.field147[var5]);
                int var8 = var7.field613 ? 64 : 128;
                if (var7.field606 > 0) {
                    var3 = true;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class59.field802[var6] = var2.method2143(class14.field147[var6], (byte) 15, false, var4, 1.0F, var4);
            }
            this.field5564 = this.field5557.method1200(var4, class59.field802, 15, var3);
        }
        return this.field5564;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lre;IIIIII)V")
    public class405(class582 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5566 = arg5;
        this.field5557 = arg0;
        this.field5559 = arg3;
        this.field5558 = arg1;
        this.field5561 = arg6;
        this.field5565 = arg4;
        this.field5562 = arg2;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static void method2420(byte arg0) {
        field5567 = null;
        field5563 = null;
        field5570 = null;
        if (arg0 != -33) {
            field5560 = -14;
        }
    }
}
