import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class197 {

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public int field3169 = 0;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "[[B")
    public byte[][] field3178 = new byte[6][258];

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public int field3175 = 0;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "[B")
    public byte[] field3186 = new byte[18002];

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "[I")
    public int[] field3188 = new int[257];

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "[[I")
    public int[][] field3184 = new int[6][258];

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "[B")
    public byte[] field3190 = new byte[18002];

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "[[I")
    public int[][] field3196 = new int[6][258];

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "[I")
    public int[] field3170 = new int[16];

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "[[I")
    public int[][] field3195 = new int[6][258];

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "[Z")
    public boolean[] field3180 = new boolean[256];

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "[Z")
    public boolean[] field3198 = new boolean[16];

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "[I")
    public int[] field3193 = new int[256];

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "[I")
    public int[] field3197 = new int[6];

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "[B")
    public byte[] field3199 = new byte[4096];

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "[B")
    public byte[] field3207 = new byte[256];

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "Z")
    public static boolean field3201 = true;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "[I")
    public static int[] field3204 = new int[500];

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "B")
    public byte field3203;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public int field3171;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public int field3172;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public int field3173;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public int field3176;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public int field3177;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public int field3181;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public int field3185;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public int field3187;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public int field3189;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    public int field3192;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public int field3202;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public int field3205;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "Laj;")
    public static class151 field3182;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "[B")
    public byte[] field3183;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "[B")
    public byte[] field3206;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static final void method1400(int arg0) {
        field3200++;
        class85.method600(false, (byte) 7);
        System.gc();
        class240.method1719(25, 31136);
        if (arg0 != 16) {
            field3182 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lla;IIIIIIIZ)V")
    public static final void method1401(class256 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class118.field1987;
        int var11;
        int var12 = var11 = (arg7 << 7) - class84.field1398;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class245.field4123[arg1][arg6][arg7] - class28.field481;
        int var18 = class245.field4123[arg1][arg6 + 1][arg7] - class28.field481;
        int var19 = class245.field4123[arg1][arg6 + 1][arg7 + 1] - class28.field481;
        int var20 = class245.field4123[arg1][arg6][arg7 + 1] - class28.field481;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class128.field2132;
        int var46 = (var24 << 9) / var25 + class128.field2137;
        int var47 = (var27 << 9) / var31 + class128.field2132;
        int var48 = (var30 << 9) / var31 + class128.field2137;
        int var49 = (var33 << 9) / var37 + class128.field2132;
        int var50 = (var36 << 9) / var37 + class128.field2137;
        int var51 = (var39 << 9) / var43 + class128.field2132;
        int var52 = (var42 << 9) / var43 + class128.field2137;
        class128.field2126 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class80.field1345 && class179.method1306(class307.field4963 + class128.field2132, class295.field4845 + class128.field2137, var50, var52, var48, var49, var51, var47)) {
                class97.field1571 = arg6;
                class100.field1587 = arg7;
            }
            if (!arg8) {
                class128.field2141 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class128.field2135 || var51 > class128.field2135 || var47 > class128.field2135) {
                    class128.field2141 = true;
                }
                if (arg0.field4323 == -1) {
                    if (arg0.field4324 != 12345678) {
                        class128.method953(var50, var52, var48, var49, var51, var47, arg0.field4324, arg0.field4328, arg0.field4330);
                    }
                } else if (!class190.field3044) {
                    int var53 = class128.field2136.method703(2213, arg0.field4323);
                    class128.method953(var50, var52, var48, var49, var51, var47, class143.method1058(var53, arg0.field4324), class143.method1058(var53, arg0.field4328), class143.method1058(var53, arg0.field4330));
                } else if (arg0.field4326) {
                    class128.method959(var50, var52, var48, var49, var51, var47, arg0.field4324, arg0.field4328, arg0.field4330, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4323);
                } else {
                    class128.method959(var50, var52, var48, var49, var51, var47, arg0.field4324, arg0.field4328, arg0.field4330, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field4323);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class80.field1345 && class179.method1306(class307.field4963 + class128.field2132, class295.field4845 + class128.field2137, var46, var48, var52, var45, var47, var51)) {
            class97.field1571 = arg6;
            class100.field1587 = arg7;
        }
        if (arg8) {
            return;
        }
        class128.field2141 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class128.field2135 || var47 > class128.field2135 || var51 > class128.field2135) {
            class128.field2141 = true;
        }
        if (arg0.field4323 != -1) {
            if (class190.field3044) {
                class128.method959(var46, var48, var52, var45, var47, var51, arg0.field4331, arg0.field4330, arg0.field4328, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4323);
                return;
            }
            int var54 = class128.field2136.method703(2213, arg0.field4323);
            class128.method953(var46, var48, var52, var45, var47, var51, class143.method1058(var54, arg0.field4331), class143.method1058(var54, arg0.field4330), class143.method1058(var54, arg0.field4328));
        } else if (arg0.field4331 != 12345678) {
            class128.method953(var46, var48, var52, var45, var47, var51, arg0.field4331, arg0.field4330, arg0.field4328);
            return;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method1402(byte arg0) {
        field3182 = null;
        field3204 = null;
        if (arg0 != -11) {
            method1403((class151) null, true, -20);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Laj;ZI)[Lkm;")
    public static final class230[] method1403(class151 arg0, boolean arg1, int arg2) {
        field3179++;
        if (class313.method2118(arg0, (byte) -118, arg2)) {
            if (!arg1) {
                field3182 = null;
            }
            return class123.method922(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
    public static final void method1404(int arg0, int arg1) {
        class36 var2 = class136.method1013(6, arg0, (byte) -90);
        field3191++;
        if (arg1 != -22592) {
            method1402((byte) -7);
        }
        var2.method221(1);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Laj;I)V")
    public static final void method1405(class151 arg0, int arg1) {
        field3168++;
        if (arg1 != 31167) {
            method1405((class151) null, 126);
        }
        class166.field2691 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)I")
    public static final int method1406(byte arg0, int arg1) {
        int var2 = -108 / ((41 - arg0) / 55);
        field3174++;
        return arg1 & 0x7F;
    }
}
