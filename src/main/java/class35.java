import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class35 {

    @OriginalMember(owner = "client!u", name = "k", descriptor = "J")
    public long field512 = 0L;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Lec;")
    public static class99 field509 = new class99(50);

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field515 = 0;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public int field506;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "Lfc;")
    public class110 field508;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Lfc;")
    public class110 field511;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "[I")
    public static int[] field504;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIZII)V", line = 12)
    public static final void method269(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field514++;
        int var6 = arg0 - arg2;
        int var7 = arg4 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class52.method384(arg1, arg4, arg2, 1, arg5);
            }
        } else if (var7 == 0) {
            class294.method2031(arg2, arg5, arg1, arg0, !arg3);
        } else {
            if (!arg3) {
                field504 = (int[]) null;
            }
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (arg2 < class234.field3569) {
                var10 = class234.field3569;
                var11 = (class234.field3569 * var8 >> 12) + var9;
            } else if (arg2 > class322.field4965) {
                var10 = class322.field4965;
                var11 = (class322.field4965 * var8 >> 12) + var9;
            } else {
                var11 = arg1;
                var10 = arg2;
            }
            int var12;
            int var13;
            if (class234.field3569 > arg0) {
                var12 = class234.field3569;
                var13 = (class234.field3569 * var8 >> 12) + var9;
            } else if (class322.field4965 < arg0) {
                var12 = class322.field4965;
                var13 = (class322.field4965 * var8 >> 12) + var9;
            } else {
                var12 = arg0;
                var13 = arg4;
            }
            if (var13 < class212.field3261) {
                var12 = (class212.field3261 - var9 << 12) / var8;
                var13 = class212.field3261;
            } else if (class182.field2888 < var13) {
                var13 = class182.field2888;
                var12 = (class182.field2888 - var9 << 12) / var8;
            }
            if (var11 < class212.field3261) {
                var11 = class212.field3261;
                var10 = (class212.field3261 - var9 << 12) / var8;
            } else if (var11 > class182.field2888) {
                var11 = class182.field2888;
                var10 = (class182.field2888 - var9 << 12) / var8;
            }
            class135.method1035(var13, var11, var10, (byte) 86, arg5, var12);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 118)
    public static void method270(int arg0) {
        if (arg0 == 31009) {
            field509 = null;
            field504 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I[[ILuh;II[[F[[F[I[[FILk;)V", line = 137)
    public static final void method271(int arg0, int[][] arg1, class70 arg2, int arg3, int arg4, float[][] arg5, float[][] arg6, int[] arg7, float[][] arg8, int arg9, class255 arg10) {
        field505++;
        int[] var11 = new int[arg7.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg7[var12 + var12];
            int var14 = arg7[var12 + var12 + 1];
            if (arg3 == 1) {
                int var16 = var13;
                var13 = var14;
                var14 = 128 - var16;
            } else if (arg3 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg3 == 3) {
                int var15 = var13;
                var13 = 128 - var14;
                var14 = var15;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg6[arg0][arg4];
                var18 = arg5[arg0][arg4];
                var19 = arg8[arg0][arg4];
            } else if (var13 == 128 && var14 == 0) {
                var18 = arg5[arg0 + 1][arg4];
                var17 = arg6[arg0 + 1][arg4];
                var19 = arg8[arg0 + 1][arg4];
            } else if (var13 == 128 && var14 == 128) {
                var19 = arg8[arg0 + 1][arg4 + 1];
                var17 = arg6[arg0 + 1][arg4 + 1];
                var18 = arg5[arg0 + 1][arg4 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var19 = arg8[arg0][arg4 + 1];
                var17 = arg6[arg0][arg4 + 1];
                var18 = arg5[arg0][arg4 + 1];
            } else {
                float var20 = arg5[arg0][arg4];
                float var21 = arg8[arg0][arg4];
                float var22 = arg6[arg0][arg4];
                float var23 = (float) var13 / 128.0F;
                float var24 = arg5[arg0][arg4 + 1];
                float var25 = (arg6[arg0 + 1][arg4] - var22) * var23 + var22;
                float var26 = (arg8[arg0 + 1][arg4] - var21) * var23 + var21;
                float var27 = (float) var14 / 128.0F;
                float var28 = (arg5[arg0 + 1][arg4 + 1] - var24) * var23 + var24;
                float var29 = arg8[arg0][arg4 + 1];
                float var30 = (arg5[arg0 + 1][arg4] - var20) * var23 + var20;
                float var31 = arg6[arg0][arg4 + 1];
                float var32 = (arg6[arg0 + 1][arg4 + 1] - var31) * var23 + var31;
                var18 = (var28 - var30) * var27 + var30;
                float var33 = (arg8[arg0 + 1][arg4 + 1] - var29) * var23 + var29;
                var19 = (var33 - var26) * var27 + var26;
                var17 = (var32 - var25) * var27 + var25;
            }
            int var34 = (arg0 << 7) + var13;
            int var35 = class28.method215(arg1, var13, arg0, 20667, var14, arg4);
            int var36 = (arg4 << 7) + var14;
            var11[var12] = arg2.method500(arg10, var34, var35, var36, var18, var17, var19);
        }
        if (arg9 > -80) {
            field504 = (int[]) null;
        }
        arg2.method498(var11);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 267)
    public static final void method272(byte arg0) {
        class223.field3414 = 0;
        class32.field393 = 0;
        class101.field1450 = -1;
        class255.field3900 = -1;
        class163.field2641 = 0;
        class151.field2297 = -1;
        class210.field3211 = 0;
        class51.field694 = -1;
        class330.field5089 = false;
        if (arg0 != 106) {
            return;
        }
        class241.field3679 = 0;
        class85.field1236.field3866 = 0;
        class204.field3136.field3866 = 0;
        field510++;
        class260.field4003 = 0;
        for (int var1 = 0; var1 < class201.field3096.length; var1++) {
            if (class201.field3096[var1] != null) {
                class201.field3096[var1].field4671 = -1;
            }
        }
        for (int var2 = 0; var2 < class264.field4064.length; var2++) {
            if (class264.field4064[var2] != null) {
                class264.field4064[var2].field4671 = -1;
            }
        }
        class132.method1027((byte) -64);
        class268.field4168 = 1;
        class101.method758(124, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class121.field1861[var3] = true;
        }
        class187.method1384((byte) -113);
    }
}
