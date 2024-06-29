import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class24 extends class330 {

    @OriginalMember(owner = "client!k", name = "S", descriptor = "I")
    public static int field257 = 0;

    @OriginalMember(owner = "client!k", name = "P", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!k", name = "T", descriptor = "[I")
    public static int[] field258;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIZB[Lae;)V", line = 3)
    public static final void method169(int arg0, int arg1, int arg2, boolean arg3, byte arg4, class172[] arg5) {
        for (int var6 = 0; var6 < arg5.length; var6++) {
            class172 var7 = arg5[var6];
            if (var7 != null && var7.field2532 == arg2) {
                class292.method1912(arg1, arg0, arg3, var7, (byte) 67);
                class309.method1977(arg0, arg1, var7, 2);
                if (var7.field2477 > (var7.field2499 - var7.field2554)) {
                    var7.field2477 = var7.field2499 - var7.field2554;
                }
                if (var7.field2477 < 0) {
                    var7.field2477 = 0;
                }
                if (var7.field2518 > (var7.field2506 - var7.field2579)) {
                    var7.field2518 = var7.field2506 - var7.field2579;
                }
                if (var7.field2518 < 0) {
                    var7.field2518 = 0;
                }
                if (var7.field2602 == 0) {
                    class110.method877(var7, arg3, -1);
                }
            }
        }
        field255++;
        if (arg4 > -70) {
            method172(-121, 114);
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V", line = 51)
    public static void method170(int arg0) {
        field258 = null;
        if (arg0 >= -96) {
            method169(98, -85, -26, true, (byte) 124, (class172[]) null);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 68)
    public static final void method171(byte arg0) {
        class289.field4105.method2109(-1);
        if (arg0 >= 94) {
            field254++;
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(II)I", line = 79)
    public static final int method172(int arg0, int arg1) {
        field256++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (arg0 != 17414) {
            field258 = null;
        }
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return ((var20 >> 2 & 0x3F) << 10) + (var21 >> 5 << 7) + (var22 >> 1);
    }
}
