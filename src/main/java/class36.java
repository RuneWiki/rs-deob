import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class36 extends class187 {

    @OriginalMember(owner = "client!di", name = "q", descriptor = "J")
    public long field454;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "Z")
    public static boolean field451 = false;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "F")
    public static float field456;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "Lwf;")
    public static class306 field455;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Luc;IZLuc;I)I", line = 10)
    public static final int method258(class130 arg0, int arg1, boolean arg2, class130 arg3, int arg4) {
        field453++;
        if (arg1 <= 110) {
            return -54;
        } else if (arg4 == 1) {
            int var5 = arg3.field4228;
            int var6 = arg0.field4228;
            if (!arg2) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var6 - var5;
        } else if (arg4 == 2) {
            return class63.method442(-123, arg3.method880(-9).field4160, arg0.method880(-71).field4160, class157.field2462);
        } else if (arg4 == 3) {
            if (arg0.field2032.equals("-")) {
                if (arg3.field2032.equals("-")) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field2032.equals("-")) {
                return arg2 ? 1 : -1;
            } else {
                return class63.method442(-91, arg3.field2032, arg0.field2032, class157.field2462);
            }
        } else if (arg4 == 4) {
            return arg0.method1804(-85) ? (arg3.method1804(-125) ? 0 : 1) : (arg3.method1804(-123) ? -1 : 0);
        } else if (arg4 == 5) {
            return arg0.method1803(20192) ? (arg3.method1803(20192) ? 0 : 1) : (arg3.method1803(20192) ? -1 : 0);
        } else if (arg4 == 6) {
            return arg0.method1806(117) ? (arg3.method1806(122) ? 0 : 1) : (arg3.method1806(124) ? -1 : 0);
        } else if (arg4 == 7) {
            return arg0.method1801(-5306) ? (arg3.method1801(-5306) ? 0 : 1) : (arg3.method1801(-5306) ? -1 : 0);
        } else {
            return arg0.field2029 - arg3.field2029;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII)I", line = 76)
    public static final int method259(int arg0, int arg1, int arg2, int arg3) {
        field452++;
        if ((class305.field4784[arg1][arg2][arg3] & 0x8) == 0) {
            int var4 = -24 / ((arg0 - 27) / 59);
            return arg1 <= 0 || (class305.field4784[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I[I[[FI[[ILwi;Lwm;[[FII[[F)V", line = 101)
    public static final void method260(int arg0, int[] arg1, float[][] arg2, int arg3, int[][] arg4, class310 arg5, class31 arg6, float[][] arg7, int arg8, int arg9, float[][] arg10) {
        if (arg8 != 1) {
            method260(-97, (int[]) null, (float[][]) ((float[][]) null), 78, (int[][]) ((int[][]) null), (class310) null, (class31) null, (float[][]) ((float[][]) null), 123, -62, (float[][]) ((float[][]) null));
        }
        field457++;
        int[] var11 = new int[arg1.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg1[var12 + var12 + 1];
            int var14 = arg1[var12 + var12];
            if (arg9 == 1) {
                int var16 = var14;
                var14 = var13;
                var13 = 128 - var16;
            } else if (arg9 == 2) {
                var13 = 128 - var13;
                var14 = 128 - var14;
            } else if (arg9 == 3) {
                int var15 = var14;
                var14 = 128 - var13;
                var13 = var15;
            }
            float var17;
            float var18;
            float var19;
            if (var14 == 0 && var13 == 0) {
                var17 = arg2[arg0][arg3];
                var18 = arg10[arg0][arg3];
                var19 = arg7[arg0][arg3];
            } else if (var14 == 128 && var13 == 0) {
                var19 = arg7[arg0 + 1][arg3];
                var17 = arg2[arg0 + 1][arg3];
                var18 = arg10[arg0 + 1][arg3];
            } else if (var14 == 128 && var13 == 128) {
                var18 = arg10[arg0 + 1][arg3 + 1];
                var17 = arg2[arg0 + 1][arg3 + 1];
                var19 = arg7[arg0 + 1][arg3 + 1];
            } else if (var14 == 0 && var13 == 128) {
                var17 = arg2[arg0][arg3 + 1];
                var19 = arg7[arg0][arg3 + 1];
                var18 = arg10[arg0][arg3 + 1];
            } else {
                float var20 = arg7[arg0][arg3];
                float var21 = arg10[arg0][arg3];
                float var22 = arg2[arg0][arg3];
                float var23 = (float) var14 / 128.0F;
                float var24 = (arg10[arg0 + 1][arg3] - var21) * var23 + var21;
                float var25 = (arg2[arg0 + 1][arg3] - var22) * var23 + var22;
                float var26 = (arg7[arg0 + 1][arg3] - var20) * var23 + var20;
                float var27 = (float) var13 / 128.0F;
                float var28 = arg7[arg0][arg3 + 1];
                float var29 = (arg7[arg0 + 1][arg3 + 1] - var28) * var23 + var28;
                float var30 = arg10[arg0][arg3 + 1];
                var19 = (var29 - var26) * var27 + var26;
                float var31 = arg2[arg0][arg3 + 1];
                float var32 = (arg10[arg0 + 1][arg3 + 1] - var30) * var23 + var30;
                float var33 = (arg2[arg0 + 1][arg3 + 1] - var31) * var23 + var31;
                var17 = (var33 - var25) * var27 + var25;
                var18 = (var32 - var24) * var27 + var24;
            }
            int var34 = (arg0 << 7) + var14;
            int var35 = (arg3 << 7) + var13;
            int var36 = class225.method1532(var14, var13, arg3, arg4, arg0, 10);
            var11[var12] = arg6.method230(arg5, var34, var36, var35, var18, var19, var17);
        }
        arg6.method234(var11);
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V", line = 217)
    public static void method261(int arg0) {
        if (arg0 == 1) {
            field455 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V", line = 226)
    public class36() {
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(J)V", line = 228)
    public class36(long arg0) {
        this.field454 = arg0;
    }
}
