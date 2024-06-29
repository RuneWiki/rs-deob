import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class252 {

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    private int field3548;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    private int field3550;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "[[I")
    private int[][] field3556;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
    public static final void method1683(byte arg0) {
        class131 var1 = class99.field1373;
        synchronized (class99.field1373) {
            class99.field1373.method905((byte) 116);
            int var2 = 81 / ((arg0 + 2) / 56);
        }
        field3555++;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIII)V")
    public static final void method1684(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != -1) {
            method1684(120, 63, 15, -109, 105, -18);
        }
        if (arg0 <= class442.field6212 && arg4 >= class290.field4058) {
            boolean var6;
            if (arg1 < class154.field2161) {
                arg1 = class154.field2161;
                var6 = false;
            } else if (class233.field3350 >= arg1) {
                var6 = true;
            } else {
                arg1 = class233.field3350;
                var6 = false;
            }
            boolean var7;
            if (arg5 < class154.field2161) {
                arg5 = class154.field2161;
                var7 = false;
            } else if (class233.field3350 >= arg5) {
                var7 = true;
            } else {
                arg5 = class233.field3350;
                var7 = false;
            }
            if (class290.field4058 > arg0) {
                arg0 = class290.field4058;
            } else {
                class295.method1924(3289650, class296.field4138[arg0++], arg5, arg2, arg1);
            }
            if (arg4 > class442.field6212) {
                arg4 = class442.field6212;
            } else {
                class295.method1924(3289650, class296.field4138[arg4--], arg5, arg2, arg1);
            }
            if (var6 && var7) {
                for (int var8 = arg0; var8 <= arg4; var8++) {
                    int[] var9 = class296.field4138[var8];
                    var9[arg1] = var9[arg5] = arg2;
                }
            } else if (var6) {
                for (int var11 = arg0; var11 <= arg4; var11++) {
                    class296.field4138[var11][arg1] = arg2;
                }
            } else if (var7) {
                for (int var10 = arg0; var10 <= arg4; var10++) {
                    class296.field4138[var10][arg5] = arg2;
                }
            }
        }
        field3554++;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "([BI)[B")
    public final byte[] method1685(byte[] arg0, int arg1) {
        field3552++;
        if (this.field3556 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field3548 / (long) this.field3550) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field3556[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3548 + var6;
                int var14 = var13 / this.field3550;
                var5 += var14;
                var6 = var13 - this.field3550 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        if (arg1 < 2) {
            this.method1687(-55, -106);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIILhh;IIII)Z")
    public static final boolean method1686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class67 arg6, int arg7, int arg8, int arg9, int arg10) {
        field3549++;
        int var11 = arg1;
        int var12 = arg4;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg1 - var13;
        int var16 = arg4 - var14;
        class362.field5005[var13][var14] = 99;
        class347.field4756[var13][var14] = 0;
        if (arg8 != 3) {
            return false;
        }
        byte var17 = 0;
        int var18 = 0;
        class212.field2963[var17] = arg1;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class450.field6300[var10001] = arg4;
        int[][] var19 = arg6.field1016;
        while (var26 != var18) {
            var11 = class212.field2963[var18];
            var12 = class450.field6300[var18];
            int var20 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var11 - var15;
            int var22 = var11 - arg6.field993;
            int var23 = var12 - arg6.field1009;
            if (arg7 == -4) {
                if (arg2 == var11 && arg0 == var12) {
                    class198.field2736 = var11;
                    class364.field5136 = var12;
                    return true;
                }
            } else if (arg7 == -3) {
                if (class204.method1329(arg5, false, arg10, var12, 2, 2, var11, arg2, arg0)) {
                    class198.field2736 = var11;
                    class364.field5136 = var12;
                    return true;
                }
            } else if (arg7 == -2) {
                if (arg6.method526(arg10, (byte) -113, 2, arg2, arg5, arg0, var12, var11, arg3, 2)) {
                    class364.field5136 = var12;
                    class198.field2736 = var11;
                    return true;
                }
            } else if (arg7 == -1) {
                if (arg6.method530(arg5, arg10, arg3, var11, (byte) -113, 2, arg2, var12, arg0)) {
                    class364.field5136 = var12;
                    class198.field2736 = var11;
                    return true;
                }
            } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                if (arg6.method519(arg7, var12, arg9, arg0, arg2, var11, false, 2)) {
                    class364.field5136 = var12;
                    class198.field2736 = var11;
                    return true;
                }
            } else if (arg6.method528(arg0, arg9, var12, arg7, 2, -28301, arg2, var11)) {
                class198.field2736 = var11;
                class364.field5136 = var12;
                return true;
            }
            int var25 = class347.field4756[var21][var20] + 1;
            if (var21 > 0 && class362.field5005[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class212.field2963[var26] = var11 - 1;
                class450.field6300[var26] = var12;
                class362.field5005[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class347.field4756[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class362.field5005[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class212.field2963[var26] = var11 + 1;
                class450.field6300[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class362.field5005[var21 + 1][var20] = 8;
                class347.field4756[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class362.field5005[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class212.field2963[var26] = var11;
                class450.field6300[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class362.field5005[var21][var20 - 1] = 1;
                class347.field4756[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class362.field5005[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class212.field2963[var26] = var11;
                class450.field6300[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class362.field5005[var21][var20 + 1] = 4;
                class347.field4756[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class362.field5005[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class212.field2963[var26] = var11 - 1;
                class450.field6300[var26] = var12 - 1;
                class362.field5005[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class347.field4756[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class362.field5005[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class212.field2963[var26] = var11 + 1;
                class450.field6300[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class362.field5005[var21 + 1][var20 - 1] = 9;
                class347.field4756[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class362.field5005[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class212.field2963[var26] = var11 - 1;
                class450.field6300[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class362.field5005[var21 - 1][var20 + 1] = 6;
                class347.field4756[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class362.field5005[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class212.field2963[var26] = var11 + 1;
                class450.field6300[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class362.field5005[var21 + 1][var20 + 1] = 12;
                class347.field4756[var21 + 1][var20 + 1] = var25;
            }
        }
        class198.field2736 = var11;
        class364.field5136 = var12;
        return false;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)I")
    public final int method1687(int arg0, int arg1) {
        if (this.field3556 != null) {
            arg0 = (int) ((long) this.field3548 * (long) arg0 / (long) this.field3550) + 6;
        }
        field3551++;
        int var3 = 104 / ((-arg1 - 28) / 54);
        return arg0;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)I")
    public final int method1688(byte arg0, int arg1) {
        if (arg0 != 80) {
            method1684(-111, 62, -70, 70, 98, 103);
        }
        if (this.field3556 != null) {
            arg1 = (int) ((long) this.field3548 * (long) arg1 / (long) this.field3550);
        }
        field3553++;
        return arg1;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(II)V")
    public class252(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class242.method1640(arg0, true, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field3548 = var4;
            this.field3550 = var5;
            this.field3556 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field3556[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
