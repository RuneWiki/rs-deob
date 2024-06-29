import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class135 {

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    private int field2362;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    private int field2364;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "[[I")
    private int[][] field2359;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Loa;")
    public static class99 field2354 = class221.method1463(2844, " loggt sich aus)3");

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Loa;")
    public static class99 field2356 = class221.method1463(2844, "Konfig geladen)3");

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "[S")
    public static short[] field2363 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
    public final int method912(int arg0, int arg1) {
        if (this.field2359 != null) {
            arg0 = (int) ((long) this.field2362 * (long) arg0 / (long) this.field2364) + 6;
        }
        int var3 = 96 % ((66 - arg1) / 55);
        field2361++;
        return arg0;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method913(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 != -21673) {
            return;
        }
        if (arg5 == arg9 && arg7 == arg8 && arg3 == arg6 && arg1 == arg4) {
            class224.method1482(arg8, arg5, arg4, arg2, true, arg3);
        } else {
            int var10 = arg8;
            int var11 = arg5;
            int var12 = arg5 * 3;
            int var13 = arg9 * 3;
            int var14 = arg8 * 3;
            int var15 = arg7 * 3;
            int var16 = arg6 * 3;
            int var17 = arg3 - (arg5 - var13) - var16;
            int var18 = var16 - var13 - (-var12 + var13);
            int var19 = arg1 * 3;
            int var20 = var15 - var14;
            int var21 = var19 + var14 - (var15 + var15);
            int var22 = var13 - var12;
            int var23 = arg4 + var15 - var19 - arg8;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var23 * var26;
                int var28 = var21 * var25;
                int var29 = var18 * var25;
                int var30 = var22 * var24;
                int var31 = var20 * var24;
                int var32 = (var27 + var28 + var31 >> 12) + arg8;
                int var33 = var17 * var26;
                int var34 = arg5 + (var30 + var33 + var29 >> 12);
                class224.method1482(var10, var11, var32, arg2, true, var34);
                var11 = var34;
                var10 = var32;
            }
        }
        field2365++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)I")
    public final int method914(int arg0, byte arg1) {
        if (arg1 > -21) {
            method918(53, (byte) 114, 111);
        }
        if (this.field2359 != null) {
            arg0 = (int) ((long) this.field2362 * (long) arg0 / (long) this.field2364);
        }
        field2358++;
        return arg0;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static final void method915(int arg0) {
        field2352++;
        class262.field4629.method1812(arg0 - 65654);
        class267.field4707.method1812(arg0 - 65660);
        if (arg0 != 65536) {
            method913(74, -124, -8, -128, 22, -14, 5, -101, -61, 20);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[B)[B")
    public final byte[] method916(int arg0, byte[] arg1) {
        if (this.field2359 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field2362 / (long) this.field2364) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                int[] var10 = this.field2359[var6];
                byte var11 = arg1[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var10[var12] * var11;
                }
                int var13 = this.field2362 + var6;
                int var14 = var13 / this.field2364;
                var5 += var14;
                var6 = var13 - this.field2364 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        field2353++;
        if (arg0 != 9599) {
            this.method916(-47, (byte[]) null);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static void method917(int arg0) {
        field2356 = null;
        if (arg0 != 4628) {
            field2355 = -59;
        }
        field2354 = null;
        field2363 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBI)I")
    private static final int method918(int arg0, byte arg1, int arg2) {
        int var3 = -98 / ((-arg1 - 34) / 60);
        if (arg0 > arg2) {
            int var4 = arg2;
            arg2 = arg0;
            arg0 = var4;
        }
        while (arg0 != 0) {
            int var5 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var5;
        }
        field2357++;
        return arg2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static final void method919(byte arg0) {
        field2360++;
        class174.field3074 = 0;
        int var1 = (class168.field3006.field1325 >> 7) + class280.field4910;
        int var2 = (class168.field3006.field1301 >> 7) + class215.field3731;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class174.field3074 = 1;
        }
        int var3 = 23 / ((-arg0 - 7) / 34);
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class174.field3074 = 1;
        }
        if (class174.field3074 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class174.field3074 = 0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(II)V")
    public class135(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = method918(arg1, (byte) -99, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field2362 = var5;
            this.field2364 = var4;
            this.field2359 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                int[] var9 = this.field2359[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var7 + 7.0D);
                double var12 = (double) var5 / (double) var4;
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var10 < var11) {
                    double var14 = ((double) var10 - var7) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
