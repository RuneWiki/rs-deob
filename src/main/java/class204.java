import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class204 {

    @OriginalMember(owner = "client!si", name = "e", descriptor = "[I")
    public static int[] field2840 = new int[99];

    @OriginalMember(owner = "client!si", name = "g", descriptor = "[I")
    public static int[] field2842 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!si", name = "h", descriptor = "Z")
    public static boolean field2843;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "[Laa;")
    public static class173[] field2844;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIII)V")
    public static final void method1295(int arg0, int arg1, int arg2, int arg3) {
        class32.method204(-1, false);
        class235.field3568 = arg3;
        class57.field822 = arg0;
        field2836++;
        if (arg2 == 999814092) {
            class107.method688(arg2 ^ 0x3B97F3C4, arg1);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method1296(int arg0) {
        field2844 = null;
        field2842 = null;
        field2840 = null;
        if (arg0 < 0) {
            field2840 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1297(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 128) {
            method1298(52, -70);
        }
        if (arg6 == arg7 && arg1 == arg9 && arg5 == arg8 && arg0 == arg4) {
            class171.method1118(arg2, arg7, arg9, 25478, arg5, arg4);
        } else {
            int var10 = arg7;
            int var11 = arg9 * 3;
            int var12 = arg9;
            int var13 = arg7 * 3;
            int var14 = arg6 * 3;
            int var15 = arg1 * 3;
            int var16 = arg0 * 3;
            int var17 = arg8 * 3;
            int var18 = arg5 + var14 - var17 - arg7;
            int var19 = var14 - var13;
            int var20 = var16 + var11 - var15 - var15;
            int var21 = var17 - var14 - (-var13 + var14);
            int var22 = arg4 + var15 - var16 - arg9;
            int var23 = var15 - var11;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var22 * var26;
                int var28 = var21 * var25;
                int var29 = var20 * var25;
                int var30 = var18 * var26;
                int var31 = var19 * var24;
                int var32 = var23 * var24;
                int var33 = (var28 + var30 + var31 >> 12) + arg7;
                int var34 = (var27 + var29 + var32 >> 12) + arg9;
                class171.method1118(arg2, var10, var12, arg3 + 25350, var33, var34);
                var10 = var33;
                var12 = var34;
            }
        }
        field2841++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)I")
    public static final int method1298(int arg0, int arg1) {
        field2839++;
        if (arg0 != -27703) {
            field2845 = 43;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lai;I)I")
    public static final int method1299(class88 arg0, int arg1) {
        field2838++;
        int var2 = arg0.field1206;
        if (arg1 < 69) {
            return 37;
        }
        class151 var3 = arg0.method1741((byte) 83);
        if (arg0.field4050 == var3.field2106) {
            var2 = arg0.field1194;
        } else if (arg0.field4050 == var3.field2087 || arg0.field4050 == var3.field2090 || arg0.field4050 == var3.field2086 || arg0.field4050 == var3.field2103) {
            var2 = arg0.field1204;
        } else if (arg0.field4050 == var3.field2121 || arg0.field4050 == var3.field2119 || arg0.field4050 == var3.field2113 || arg0.field4050 == var3.field2101) {
            var2 = arg0.field1216;
        }
        return var2;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)I")
    public static final int method1300(int arg0, int arg1, int arg2) {
        field2837++;
        if (arg1 != 255) {
            return -106;
        }
        if (arg0 < arg2) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2840[var1] = var0 / 4;
        }
        field2843 = false;
    }
}
