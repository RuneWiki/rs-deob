import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class324 {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(FFFZ)I")
    public static final int method2081(float arg0, float arg1, float arg2, boolean arg3) {
        field4733++;
        if (!arg3) {
            method2083(-7, null, -5, null, 23);
        }
        float var4 = arg2 < 0.0F ? -arg2 : arg2;
        float var5 = (arg1 < 0.0F) ? -arg1 : arg1;
        float var6 = (arg0 < 0.0F) ? -arg0 : arg0;
        if (var5 > var4 && var6 < var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return (arg0 > 0.0F) ? 2 : 3;
        } else if ((arg2 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V")
    public static final void method2082(int arg0, int arg1) {
        class560 var2 = class445.field6125;
        synchronized (class445.field6125) {
            class445.field6125.method3129(arg1, 14583);
        }
        field4735++;
        class560 var3 = class31.field301;
        synchronized (class31.field301) {
            class31.field301.method3129(arg1, 14583);
        }
        int var4 = 86 / ((77 - arg0) / 48);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I[II[II)V")
    public static final void method2083(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        if (arg2 != 1) {
            method2084(-94, -65, 28, (byte) -107, -101);
        }
        if (arg4 > arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var7;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg0; var10 < arg4; var10++) {
                if (arg3[var10] < (var10 & var9) + var7) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg3[arg4] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var8;
            method2083(arg0, arg1, arg2, arg3, var6 - 1);
            method2083(var6 + 1, arg1, arg2, arg3, arg4);
        }
        field4736++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIBI)V")
    public static final void method2084(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg1 > arg0) {
            for (int var5 = arg0; var5 < arg1; var5++) {
                class319.field4673[var5][arg4] = arg2;
            }
        } else {
            for (int var6 = arg1; var6 < arg0; var6++) {
                class319.field4673[var6][arg4] = arg2;
            }
        }
        if (arg3 != 121) {
            method2082(-48, 38);
        }
        field4734++;
    }
}
