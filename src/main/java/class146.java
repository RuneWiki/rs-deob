import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class146 implements class15 {

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "Z")
    public static boolean field2386 = true;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field2387 = 0;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "J")
    public static long field2389 = 0L;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "Ltl;")
    public static class59 field2388 = class85.method639("RuneScape wird geladen )2 bitte warten)3)3)3", 9588);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Ltl;")
    private static class59 field2383 = class85.method639("Use", 9588);

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "Ltl;")
    public static class59 field2385 = field2383;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V", line = 7)
    public static void method1057(boolean arg0) {
        field2388 = null;
        field2385 = null;
        if (!arg0) {
            method1057(false);
        }
        field2383 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lsb;)V", line = 23)
    public static final void method1058(class165 arg0) {
        for (int var1 = arg0.field2682; var1 <= arg0.field2681; var1++) {
            for (int var2 = arg0.field2670; var2 <= arg0.field2676; var2++) {
                class245 var3 = class120.field2010[arg0.field2674][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field4092; var4++) {
                        if (var3.field4107[var4] == arg0) {
                            var3.field4092--;
                            for (int var5 = var4; var5 < var3.field4092; var5++) {
                                var3.field4107[var5] = var3.field4107[var5 + 1];
                                var3.field4094[var5] = var3.field4094[var5 + 1];
                            }
                            var3.field4107[var3.field4092] = null;
                            break;
                        }
                    }
                    var3.field4089 = 0;
                    for (int var6 = 0; var6 < var3.field4092; var6++) {
                        var3.field4089 |= var3.field4094[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZIIIIIBIIII)Z", line = 99)
    public static final boolean method1059(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class50.field769[var12][var13] = 0;
                class19.field257[var12][var13] = 99999999;
            }
        }
        int var14 = arg10;
        field2384++;
        int var15 = arg4;
        class50.field769[arg4][arg10] = 99;
        class19.field257[arg4][arg10] = 0;
        byte var16 = 0;
        class248.field4126[var16] = arg4;
        int var17 = 0;
        boolean var18 = false;
        int var32 = var16 + 1;
        class274.field4721[var16] = arg10;
        int[][] var19 = class41.field612[class247.field4119].field409;
        while (var32 != var17) {
            var15 = class248.field4126[var17];
            var14 = class274.field4721[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg11 == var15 && arg0 == var14) {
                var18 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class41.field612[class247.field4119].method203(arg3, arg0, 1, arg2 - 1, (byte) -123, arg11, var14, var15)) {
                    var18 = true;
                    break;
                }
                if (arg2 < 10 && class41.field612[class247.field4119].method193((byte) -65, arg3, var15, arg2 - 1, 1, var14, arg11, arg0)) {
                    var18 = true;
                    break;
                }
            }
            if (arg9 != 0 && arg5 != 0 && class41.field612[class247.field4119].method200(arg8, 12801, var14, arg0, arg5, 1, var15, arg9, arg11)) {
                var18 = true;
                break;
            }
            int var20 = class19.field257[var15][var14] + 1;
            if (var15 > 0 && class50.field769[var15 - 1][var14] == 0 && (var19[var15 - 1][var14] & 0x12C0108) == 0) {
                class248.field4126[var32] = var15 - 1;
                class274.field4721[var32] = var14;
                class50.field769[var15 - 1][var14] = 2;
                var32 = var32 + 1 & 0xFFF;
                class19.field257[var15 - 1][var14] = var20;
            }
            if (var15 < 103 && class50.field769[var15 + 1][var14] == 0 && (var19[var15 + 1][var14] & 0x12C0180) == 0) {
                class248.field4126[var32] = var15 + 1;
                class274.field4721[var32] = var14;
                class50.field769[var15 + 1][var14] = 8;
                class19.field257[var15 + 1][var14] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && class50.field769[var15][var14 - 1] == 0 && (var19[var15][var14 - 1] & 0x12C0102) == 0) {
                class248.field4126[var32] = var15;
                class274.field4721[var32] = var14 - 1;
                class50.field769[var15][var14 - 1] = 1;
                class19.field257[var15][var14 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 103 && class50.field769[var15][var14 + 1] == 0 && (var19[var15][var14 + 1] & 0x12C0120) == 0) {
                class248.field4126[var32] = var15;
                class274.field4721[var32] = var14 + 1;
                class50.field769[var15][var14 + 1] = 4;
                class19.field257[var15][var14 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 > 0 && var14 > 0 && class50.field769[var15 - 1][var14 - 1] == 0 && (var19[var15 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var15 - 1][var14] & 0x12C0108) == 0 && (var19[var15][var14 - 1] & 0x12C0102) == 0) {
                class248.field4126[var32] = var15 - 1;
                class274.field4721[var32] = var14 - 1;
                class50.field769[var15 - 1][var14 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class19.field257[var15 - 1][var14 - 1] = var20;
            }
            if (var15 < 103 && var14 > 0 && class50.field769[var15 + 1][var14 - 1] == 0 && (var19[var15 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var15 + 1][var14] & 0x12C0180) == 0 && (var19[var15][var14 - 1] & 0x12C0102) == 0) {
                class248.field4126[var32] = var15 + 1;
                class274.field4721[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class50.field769[var15 + 1][var14 - 1] = 9;
                class19.field257[var15 + 1][var14 - 1] = var20;
            }
            if (var15 > 0 && var14 < 103 && class50.field769[var15 - 1][var14 + 1] == 0 && (var19[var15 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var15 - 1][var14] & 0x12C0108) == 0 && (var19[var15][var14 + 1] & 0x12C0120) == 0) {
                class248.field4126[var32] = var15 - 1;
                class274.field4721[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class50.field769[var15 - 1][var14 + 1] = 6;
                class19.field257[var15 - 1][var14 + 1] = var20;
            }
            if (var15 < 103 && var14 < 103 && class50.field769[var15 + 1][var14 + 1] == 0 && (var19[var15 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var15 + 1][var14] & 0x12C0180) == 0 && (var19[var15][var14 + 1] & 0x12C0120) == 0) {
                class248.field4126[var32] = var15 + 1;
                class274.field4721[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class50.field769[var15 + 1][var14 + 1] = 12;
                class19.field257[var15 + 1][var14 + 1] = var20;
            }
        }
        class121.field2019 = 0;
        if (!var18) {
            if (!arg1) {
                return false;
            }
            int var21 = 100;
            byte var22 = 10;
            int var23 = 1000;
            for (int var24 = arg11 - var22; var24 <= arg11 + var22; var24++) {
                for (int var25 = arg0 - var22; var25 <= (arg0 + var22); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class19.field257[var24][var25] < 100) {
                        int var26 = 0;
                        int var27 = 0;
                        if (var24 < arg11) {
                            var26 = arg11 - var24;
                        } else if (var24 > arg9 + arg11 - 1) {
                            var26 = var24 + 1 - arg11 - arg9;
                        }
                        if (arg0 > var25) {
                            var27 = arg0 - var25;
                        } else if ((arg0 - (1 - arg5)) < var25) {
                            var27 = var25 + 1 - arg5 - arg0;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var23 > var28 || var23 == var28 && class19.field257[var24][var25] < var21) {
                            var14 = var25;
                            var15 = var24;
                            var23 = var28;
                            var21 = class19.field257[var24][var25];
                        }
                    }
                }
            }
            if (var23 == 1000) {
                return false;
            }
            if (arg4 == var15 && arg10 == var14) {
                return false;
            }
            class121.field2019 = 1;
        }
        if (arg7 > -86) {
            field2387 = -92;
        }
        byte var29 = 0;
        class248.field4126[var29] = var15;
        int var33 = var29 + 1;
        class274.field4721[var29] = var14;
        int var30;
        int var31 = var30 = class50.field769[var15][var14];
        while (arg4 != var15 || arg10 != var14) {
            if (var30 != var31) {
                var30 = var31;
                class248.field4126[var33] = var15;
                class274.field4721[var33++] = var14;
            }
            if ((var31 & 0x2) != 0) {
                var15++;
            } else if ((var31 & 0x8) != 0) {
                var15--;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            var31 = class50.field769[var15][var14];
        }
        if (var33 > 0) {
            class191.method1403((byte) -30, arg6, var33);
            return true;
        } else if (arg6 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IJZ[I)Ltl;", line = 400)
    public final class59 method100(int arg0, long arg1, boolean arg2, int[] arg3) {
        field2392++;
        if (arg0 == 0) {
            class33 var7 = class87.method651((byte) 98, arg3[0]);
            return var7.method225((int) arg1, (byte) -10);
        } else if (arg0 == 1 || arg0 == 10) {
            class44 var6 = class81.method616((int) arg1, (byte) 25);
            return var6.field699;
        } else {
            if (!arg2) {
                field2389 = 51L;
            }
            return arg0 == 6 || arg0 == 7 ? class87.method651((byte) 98, arg3[0]).method225((int) arg1, (byte) -10) : null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)Ljb;", line = 433)
    public static final class296 method1060(int arg0, int arg1, int arg2) {
        class245 var3 = class120.field2010[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class296 var4 = var3.field4085;
            var3.field4085 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIII)I", line = 448)
    public static final int method1061(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 25 / ((arg0 + 26) / 54);
        field2390++;
        int var6 = 65536 - class298.field5094[arg4 * 1024 / arg1] >> 1;
        return ((65536 - var6) * arg3 >> 16) + (arg2 * var6 >> 16);
    }
}
