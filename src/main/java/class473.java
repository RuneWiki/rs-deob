import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class473 implements class419 {

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Lpfa;")
    private class275 field5845;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(FFIIIIIIIZIF[F)V", line = 4)
    public static final void method2568(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, float arg11, float[] arg12) {
        int var13 = arg2 - arg10;
        field5848++;
        int var14 = arg8 - arg3;
        int var15 = arg6 - arg5;
        float var16 = arg12[2] * (float) var15 + arg12[1] * (float) var13 + arg12[0] * (float) var14;
        float var17 = arg12[5] * (float) var15 + arg12[3] * (float) var14 + arg12[4] * (float) var13;
        float var18 = arg12[8] * (float) var15 + arg12[6] * (float) var14 + arg12[7] * (float) var13;
        float var19;
        float var20;
        if (arg7 == 0) {
            var19 = arg1 + var16 + 0.5F;
            var20 = arg0 + 0.5F - var18;
        } else if (arg7 == 1) {
            var19 = arg1 + var16 + 0.5F;
            var20 = arg0 + var18 + 0.5F;
        } else if (arg7 == 2) {
            var20 = arg11 + 0.5F - var17;
            var19 = arg1 + 0.5F - var16;
        } else if (arg7 == 3) {
            var20 = arg11 + 0.5F - var17;
            var19 = arg1 + var16 + 0.5F;
        } else if (arg7 == 4) {
            var19 = arg0 + var18 + 0.5F;
            var20 = arg11 + 0.5F - var17;
        } else {
            var20 = arg11 + 0.5F - var17;
            var19 = arg0 + 0.5F - var18;
        }
        if (arg4 == 1) {
            float var22 = var19;
            var19 = -var20;
            var20 = var22;
        } else if (arg4 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg4 == 3) {
            float var21 = var19;
            var19 = var20;
            var20 = -var21;
        }
        if (!arg9) {
            class432.field5454 = var20;
            class213.field2497 = var19;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)I", line = 92)
    public final int method909(int arg0) {
        field5847++;
        if (arg0 != -1038) {
            method2569(43, 16, 68, -15, -93, -97, 62);
        }
        return this.field5845.method1645((byte) -106) ? 100 : this.field5845.method1658(arg0 + 22324);
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lpfa;)V", line = 108)
    public class473(class275 arg0) {
        this.field5845 = arg0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)V", line = 120)
    public static final void method2569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5844++;
        if (arg4 != -11270) {
            method2568(0.9213287F, 1.6740916F, -92, -89, -102, 95, -89, -29, 62, true, -9, -0.017461745F, null);
        }
        for (class190 var7 = (class190) class67.field803.method1715((byte) 122); var7 != null; var7 = (class190) class67.field803.method1712((byte) -89)) {
            if (class665.field9027 >= var7.field2262) {
                var7.method1619((byte) -84);
            } else {
                class131.method846((var7.field2265 << 9) + 256, arg3, arg6, (byte) 124, arg5 >> 1, var7.field2258 * 2, (var7.field2259 << 9) + 256, var7.field2257, arg0 >> 1);
                class336.field4143.method1162(true, class347.field4465[0] + arg2, var7.field2260, var7.field2263 | 0xFF000000, 0, class347.field4465[1] + arg1);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)Ldda;", line = 146)
    public final class354 method908(byte arg0) {
        int var2 = -25 / ((arg0 - 26) / 46);
        field5846++;
        return class354.field4570;
    }
}
