import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class270 {

    @OriginalMember(owner = "client!gga", name = "f", descriptor = "Ldaa;")
    private class11 field3763 = new class11();

    @OriginalMember(owner = "client!gga", name = "i", descriptor = "Lrda;")
    private class620 field3766 = new class620();

    @OriginalMember(owner = "client!gga", name = "j", descriptor = "I")
    private int field3767;

    @OriginalMember(owner = "client!gga", name = "h", descriptor = "I")
    private int field3765;

    @OriginalMember(owner = "client!gga", name = "l", descriptor = "Ljw;")
    private class520 field3769;

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "I")
    public static int field3759 = 0;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!gga", name = "e", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!gga", name = "g", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!gga", name = "k", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "[Lxa;")
    public static class468[] field3760;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)V", line = 17)
    public final void method1641(int arg0) {
        if (arg0 > -93) {
            this.field3767 = -6;
        }
        field3764++;
        this.field3766.method3398(false);
        this.field3769.method2916((byte) 113);
        this.field3763 = new class11();
        this.field3765 = this.field3767;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IJ)Ldaa;", line = 31)
    public final class11 method1642(int arg0, long arg1) {
        if (arg0 != -1717) {
            return null;
        }
        field3758++;
        class11 var4 = (class11) this.field3769.method2918(arg1, (byte) -58);
        if (var4 != null) {
            this.field3766.method3396(var4, -1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Ldaa;IJ)V", line = 58)
    public final void method1643(class11 arg0, int arg1, long arg2) {
        if (arg1 != 13642) {
            this.field3763 = null;
        }
        field3761++;
        if (this.field3765 == 0) {
            class11 var5 = this.field3766.method3392((byte) 112);
            var5.method2797(69);
            var5.method131(120);
            if (this.field3763 == var5) {
                class11 var6 = this.field3766.method3392((byte) 97);
                var6.method2797(-105);
                var6.method131(122);
            }
        } else {
            this.field3765--;
        }
        this.field3769.method2911(arg2, arg0, (byte) -28);
        this.field3766.method3396(arg0, -1);
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)V", line = 92)
    public static void method1644(byte arg0) {
        field3760 = null;
        if (arg0 != -82) {
            field3759 = -127;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(ILeh;)V", line = 105)
    public static final void method1645(int arg0, class335 arg1) {
        field3762++;
        if (arg0 < ~(arg1.field4600.length - arg1.field4619)) {
            return;
        }
        int var2 = arg1.method2034(255);
        if (var2 < 0 || var2 > 1 || (arg1.field4600.length - arg1.field4619) < 2) {
            return;
        }
        int var3 = arg1.method2001((byte) -83);
        if ((arg1.field4600.length - arg1.field4619) < (var3 * 6)) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg1.method2001((byte) -83);
            int var6 = arg1.method2045(-98);
            if (class476.field6352.length > var5 && class690.field9711[var5] && (class679.field9581.method3074(var5, 75).field2773 != '1' || var6 >= -1 && var6 <= 1)) {
                class476.field6352[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(I)V", line = 215)
    public class270(int arg0) {
        this.field3767 = arg0;
        this.field3765 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3769 = new class520(var2);
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(BIIIF[FIIII)V", line = 158)
    public static final void method1646(byte arg0, int arg1, int arg2, int arg3, float arg4, float[] arg5, int arg6, int arg7, int arg8, int arg9) {
        field3768++;
        int var10 = arg6 - arg2;
        int var11 = arg9 - arg7;
        int var12 = arg3 - arg8;
        float var13 = arg5[2] * (float) var11 + arg5[0] * (float) var10 + arg5[1] * (float) var12;
        float var14 = arg5[5] * (float) var11 + arg5[4] * (float) var12 + arg5[3] * (float) var10;
        if (arg0 >= -67) {
            field3759 = 56;
        }
        float var15 = arg5[8] * (float) var11 + arg5[7] * (float) var12 + arg5[6] * (float) var10;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg4 + 0.5F;
        if (arg1 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg1 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg1 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class48.field693 = var18;
        class205.field2966 = var17;
    }
}
