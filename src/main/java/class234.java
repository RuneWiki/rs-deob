import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class234 extends class424 {

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "Lpca;")
    public class532 field3131;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "[B")
    public static byte[] field3133 = new byte[32896];

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "Lwq;")
    public static class492 field3135;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(III[IIII[IIZLwca;IIII)I")
    public static final int method1484(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, boolean arg9, class36 arg10, int arg11, int arg12, int arg13, int arg14) {
        if (arg14 != -20943) {
            method1485(118);
        }
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class366.field4724[var15][var35] = 0;
                class649.field9041[var15][var35] = 99999999;
            }
        }
        field3132++;
        boolean var16;
        if (arg13 == 1) {
            var16 = class614.method3331(arg4, arg11, false, arg0, arg8, arg6, arg5, arg10, arg1, arg12, arg2);
        } else if (arg13 == 2) {
            var16 = class316.method1846(arg11, 1, arg5, arg4, arg0, arg10, arg1, arg12, arg8, arg2, arg6);
        } else {
            var16 = class194.method1278(arg12, arg6, (byte) -67, arg11, arg5, arg0, arg8, arg1, arg10, arg13, arg4, arg2);
        }
        int var17 = arg11 - 64;
        int var18 = arg12 - 64;
        int var19 = class354.field4560;
        int var20 = class289.field3734;
        if (!var16) {
            if (!arg9) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg0 - var23; var24 <= (arg0 + var23); var24++) {
                for (int var25 = arg4 - var23; var25 <= arg4 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class649.field9041[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg0 > var24) {
                            var28 = arg0 - var24;
                        } else if (var24 > arg0 + arg2 - 1) {
                            var28 = 1 - arg0 - (arg2 - var24);
                        }
                        int var29 = 0;
                        if (var25 < arg4) {
                            var29 = arg4 - var25;
                        } else if (var25 > arg4 + arg8 - 1) {
                            var29 = var25 + 1 - arg8 - arg4;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && var22 > class649.field9041[var26][var27]) {
                            var22 = class649.field9041[var26][var27];
                            var21 = var30;
                            var19 = var24;
                            var20 = var25;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg11 == var19 && arg12 == var20) {
            return 0;
        }
        byte var31 = 0;
        class191.field2440[var31] = var19;
        int var37 = var31 + 1;
        class181.field2231[var31] = var20;
        int var32;
        int var33 = var32 = class366.field4724[var19 - var17][var20 - var18];
        while (arg11 != var19 || arg12 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class191.field2440[var37] = var19;
                class181.field2231[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class366.field4724[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg3[var34] = class191.field2440[var37];
            arg7[var34++] = class181.field2231[var37];
            if (var34 >= arg3.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
    public static void method1485(int arg0) {
        if (arg0 != 2054) {
            field3133 = null;
        }
        field3133 = null;
        field3135 = null;
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lpca;)V")
    public class234(class532 arg0) {
        this.field3131 = arg0;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3133[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field3134 = 0;
        field3135 = new class492();
    }
}
