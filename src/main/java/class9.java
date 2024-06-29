import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class9 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field126 = 0;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Lve;")
    private static class255 field128 = class87.method607(36, "Unable to find ");

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Lve;")
    public static class255 field129 = field128;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field133 = 0;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Lve;")
    public static class255 field132 = class87.method607(93, ")4p=");

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "[I")
    public static int[] field134 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Z")
    public static boolean field127;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)Lve;", line = 13)
    public static final class255 method47(boolean arg0, int arg1) {
        field131++;
        if (!arg0) {
            method47(false, -12);
        }
        return class44.field684[arg1].method1774(-41) <= 0 ? class203.field3509[arg1] : class3.method14(new class255[] { class203.field3509[arg1], class225.field3764, class44.field684[arg1] }, (byte) -81);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIZIIILmg;I)V", line = 32)
    public static final void method48(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, class145 arg7, int arg8) {
        field135++;
        int var9 = arg4 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg7.field2442;
            var11 = arg7.field2444;
        } else {
            var10 = arg7.field2444;
            var11 = arg7.field2442;
        }
        int var12;
        int var13;
        if (arg6 + var11 > 104) {
            var12 = arg6 + 1;
            var13 = arg6;
        } else {
            var13 = (var11 >> 1) + arg6;
            var12 = arg6 + (var11 + 1 >> 1);
        }
        int var14 = (arg6 << 7) + (var11 << 6);
        int var15 = (arg2 << 7) + (var10 << 6);
        int var16;
        int var17;
        if ((arg2 + var10) <= 104) {
            var16 = (var10 + 1 >> 1) + arg2;
            var17 = arg2 + (var10 >> 1);
        } else {
            var16 = arg2 + 1;
            var17 = arg2;
        }
        int[][] var18 = class106.field1783[arg5];
        int var19 = var18[var12][var17] + var18[var13][var16] + var18[var12][var16] + var18[var13][var17] >> 2;
        int var20 = 0;
        if (arg5 != 0) {
            int[][] var21 = class106.field1783[0];
            var20 = var19 - (var21[var12][var17] + var21[var13][var17] - (-var21[var13][var16] - var21[var12][var16]) >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg5 < 3) {
            var22 = class106.field1783[arg5 + 1];
        }
        class209 var23 = arg7.method1077(arg8, var22, var19, arg4, var18, var14, false, -106, arg3, var15, (class273) null);
        class35.method197(var23.field3572, var14 - arg0, var20, var15 - arg1);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ltg;Z)V", line = 104)
    public static final void method49(class301 arg0, boolean arg1) {
        field130++;
        if (arg0.field5148 == 0) {
            return;
        }
        if (arg0.field5137 != -1 && arg0.field5137 < 32768) {
            class186 var2 = class82.field1334[arg0.field5137];
            if (var2 != null) {
                int var3 = arg0.field5130 - var2.field5130;
                int var4 = arg0.field5173 - var2.field5173;
                if (var3 != 0 || var4 != 0) {
                    arg0.field5129 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field5137 >= 32768) {
            int var5 = arg0.field5137 - 32768;
            if (class14.field210 == var5) {
                var5 = 2047;
            }
            class242 var6 = class151.field2555[var5];
            if (var6 != null) {
                int var7 = arg0.field5130 - var6.field5130;
                int var8 = arg0.field5173 - var6.field5173;
                if (var7 != 0 || var8 != 0) {
                    arg0.field5129 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field5161 != 0 || arg0.field5159 != 0) && (arg0.field5127 == 0 || arg0.field5144 > 0)) {
            int var9 = arg0.field5130 + arg0.method1680(-101) * 64 - ((arg0.field5161 - class197.field3355 - class197.field3355) * 64) - 64;
            int var10 = arg0.field5173 + (arg0.method1680(-118) - 1) * 64 - ((-class268.field4615 + arg0.field5159 + -class268.field4615) * 64);
            if (var9 != 0 || var10 != 0) {
                arg0.field5129 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field5161 = 0;
            arg0.field5159 = 0;
        }
        int var11 = arg0.field5129 - arg0.field5157 & 0x7FF;
        if (var11 == 0) {
            arg0.field5178 = 0;
        } else {
            arg0.field5178++;
            if (var11 <= 1024) {
                boolean var12 = true;
                arg0.field5157 += arg0.field5148;
                if (var11 < arg0.field5148 || (2048 - arg0.field5148) < var11) {
                    arg0.field5157 = arg0.field5129;
                    var12 = false;
                }
                if (arg0.field5114 == arg0.field5113 && (arg0.field5178 > 25 || var12)) {
                    if (arg0.field5121 == -1) {
                        arg0.field5114 = arg0.field5120;
                    } else {
                        arg0.field5114 = arg0.field5121;
                    }
                }
            } else {
                arg0.field5157 -= arg0.field5148;
                boolean var13 = true;
                if (arg0.field5148 > var11 || var11 > (2048 - arg0.field5148)) {
                    arg0.field5157 = arg0.field5129;
                    var13 = false;
                }
                if (arg0.field5114 == arg0.field5113 && (arg0.field5178 > 25 || var13)) {
                    if (arg0.field5138 == -1) {
                        arg0.field5114 = arg0.field5120;
                    } else {
                        arg0.field5114 = arg0.field5138;
                    }
                }
            }
            arg0.field5157 &= 0x7FF;
        }
        if (!arg1) {
            field132 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V", line = 235)
    public static void method50(byte arg0) {
        field132 = null;
        field134 = null;
        int var1 = -116 % ((17 - arg0) / 58);
        field129 = null;
        field128 = null;
    }
}
