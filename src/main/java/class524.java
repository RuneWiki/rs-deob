import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class524 {

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "Lgea;")
    public static class67 field7111 = new class67();

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "[I")
    public static int[] field7113 = new int[25];

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "[Z")
    public static boolean[] field7115 = new boolean[5];

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "Llh;")
    public static class487 field7114 = new class487(50, 3);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field7108;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public static int field7110;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "Lq;")
    public static class392 field7112;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIII)V", line = 3)
    public static final void method2986(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7110++;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg1 * arg1;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var10;
        if (arg4 < 40) {
            field7115 = null;
        }
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg5 >= class469.field6466 && arg5 <= class533.field7200) {
            int var20 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg0 + arg1);
            int var21 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg0 - arg1);
            class470.method2660(var21, var20, class344.field4599[arg5], (byte) 11, arg3);
        }
        int var22 = (arg2 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    var19 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var19 += var16;
                var6++;
            }
            var13 += -var22;
            var14 += -var18;
            var7--;
            var18 -= var15;
            var22 -= var15;
            int var23 = arg5 - var7;
            int var24 = arg5 + var7;
            if (var24 >= class469.field6466 && var23 <= class533.field7200) {
                int var25 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg0 + var6);
                int var26 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg0 - var6);
                if (class469.field6466 <= var23) {
                    class470.method2660(var26, var25, class344.field4599[var23], (byte) 11, arg3);
                }
                if (var24 <= class533.field7200) {
                    class470.method2660(var26, var25, class344.field4599[var24], (byte) 11, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)Lbca;", line = 106)
    public static final class614 method2987(int arg0, int arg1) {
        if (arg0 != 6257) {
            method2988(99, -106, 98, null, 127, 0.21444374F, -83, -5, 16, 77);
        }
        field7108++;
        class693[] var2 = class570.field8097;
        synchronized (class570.field8097) {
            class614 var3;
            if (class570.field8097.length <= arg1 || class570.field8097[arg1].method3904((byte) 49)) {
                var3 = new class614();
                var3.field8572 = new class551[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field8572[var4] = new class551();
                }
            } else {
                var3 = (class614) class570.field8097[arg1].method3900((byte) 78);
                var3.method3074((byte) 48);
                int var10002 = class622.field8639[arg1]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III[FIFIIII)V", line = 142)
    public static final void method2988(int arg0, int arg1, int arg2, float[] arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = arg4 - arg0;
        int var11 = arg8 - arg6;
        int var12 = arg9 - arg2;
        field7109++;
        float var13 = arg3[2] * (float) var12 + arg3[1] * (float) var11 + arg3[0] * (float) var10;
        float var14 = arg3[5] * (float) var12 + arg3[4] * (float) var11 + arg3[3] * (float) var10;
        float var15 = arg3[8] * (float) var12 + arg3[7] * (float) var11 + arg3[6] * (float) var10;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg5 + 0.5F;
        if (arg7 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg7 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        if (arg1 <= 76) {
            field7111 = null;
        }
        class256.field3493 = var18;
        class659.field9159 = var17;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 194)
    public static void method2989(int arg0) {
        field7114 = null;
        field7113 = null;
        int var1 = 61 / ((74 - arg0) / 47);
        field7115 = null;
        field7112 = null;
        field7111 = null;
    }
}
