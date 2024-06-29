import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class282 {

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public int field4262 = -1;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Laa;")
    public static class76 field4259 = new class76(31, -1);

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "[I")
    public static int[] field4261 = new int[1000];

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "S")
    public static short field4268 = 32767;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "F")
    public static float field4265;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Ltv;")
    public static class294 field4266;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Ltq;")
    public class68 field4267;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "[I")
    public int[] field4270;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[Ljava/lang/String;")
    public String[] field4260;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "[[B")
    public static byte[][] field4269;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II[III[IIZIILep;IIII)I")
    public static final int method1758(int arg0, int arg1, int[] arg2, int arg3, int arg4, int[] arg5, int arg6, boolean arg7, int arg8, int arg9, class311 arg10, int arg11, int arg12, int arg13, int arg14) {
        field4264++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class143.field2158[var15][var35] = 0;
                class239.field3353[var15][var35] = 99999999;
            }
        }
        if (arg12 < 67) {
            field4266 = null;
        }
        boolean var16;
        if (arg0 == 1) {
            var16 = class203.method1334(arg3, arg4, arg13, 80, arg8, arg6, arg9, arg14, arg11, arg10, arg1);
        } else if (arg0 == 2) {
            var16 = class226.method1417(arg13, arg4, arg10, arg3, arg11, (byte) 120, arg6, arg9, arg8, arg1, arg14);
        } else {
            var16 = class59.method426(arg13, arg4, arg3, arg14, arg9, arg10, arg0, arg8, arg11, arg1, arg6, 0);
        }
        int var17 = arg1 - 64;
        int var18 = arg11 - 64;
        int var19 = class227.field3203;
        int var20 = class425.field6332;
        if (!var16) {
            if (!arg7) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg14 - var23; var24 <= (arg14 + var23); var24++) {
                for (int var25 = arg4 - var23; var25 <= arg4 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class239.field3353[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg14 > var24) {
                            var28 = arg14 - var24;
                        } else if (arg14 - (1 - arg9) < var24) {
                            var28 = var24 + 1 - arg14 - arg9;
                        }
                        int var29 = 0;
                        if (arg4 > var25) {
                            var29 = arg4 - var25;
                        } else if (var25 > arg4 + arg8 - 1) {
                            var29 = var25 + 1 - arg4 - arg8;
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var21 > var30 || var21 == var30 && var22 > class239.field3353[var26][var27]) {
                            var21 = var30;
                            var22 = class239.field3353[var26][var27];
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
        if (arg1 == var19 && arg11 == var20) {
            return 0;
        }
        byte var31 = 0;
        class491.field7326[var31] = var19;
        int var37 = var31 + 1;
        class110.field1659[var31] = var20;
        int var32;
        int var33 = var32 = class143.field2158[var19 - var17][var20 - var18];
        while (arg1 != var19 || arg11 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class491.field7326[var37] = var19;
                class110.field1659[var37++] = var20;
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
            var33 = class143.field2158[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg5[var34] = class491.field7326[var37];
            arg2[var34++] = class110.field1659[var37];
            if (var34 >= arg5.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method1759(int arg0) {
        field4269 = null;
        field4266 = null;
        field4259 = null;
        field4261 = null;
        if (arg0 < 68) {
            field4269 = null;
        }
    }
}
