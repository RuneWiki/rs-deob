import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class443 {

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Luc;")
    private static class58 field6448 = new class58(16);

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "[S")
    private static short[] field6449 = new short[1];

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field6454 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field6453 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "[B")
    private static byte[] field6452 = new byte[1];

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "Lmk;")
    public static class154 field6455 = new class154();

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "F")
    public static float field6450;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "F")
    public static float field6457;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "Lpm;")
    public static class10 field6458;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Lin;")
    public static class180 field6447;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "Lam;")
    public static class286 field6446;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "Luc;")
    private static class58 field6462;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "[B")
    private static byte[] field6461;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "[B")
    private static byte[] field6466;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "[B")
    private static byte[] field6467;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "[B")
    private static byte[] field6473;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "[B")
    private static byte[] field6474;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "[I")
    private static int[] field6478;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "[S")
    private static short[] field6471;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "[S")
    private static short[] field6480;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "[[[B")
    public static byte[][][] field6456;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "[[[Lum;")
    private static class184[][][] field6476;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2731(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6463 = arg0 - field6479;
        field6477 = arg1 - field6469;
        field6464 = arg2 - field6479;
        field6468 = arg3 - field6469;
        field6475 = arg4;
        field6470 = arg5;
        field6459 = arg6;
        field6460 = arg7;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lvm;II)V")
    public static final void method2732(class322 arg0, int arg1, int arg2) {
        class250 var3 = new class250(field6446.method1682("area", (byte) -7, field6447.field2258));
        int var4 = var3.method1350(31351);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1350(31351);
        }
        int var7 = var3.method1350(31351);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1350(31351);
        }
        while (true) {
            while (var3.field3389 < var3.field3406.length) {
                if (var3.method1350(31351) == 0) {
                    int var22 = var3.method1350(31351);
                    int var23 = var3.method1350(31351);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field6479;
                            int var27 = var23 * 64 + var25 - field6469;
                            method2751(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1350(31351);
                    int var29 = var3.method1350(31351);
                    int var30 = var3.method1350(31351);
                    int var31 = var3.method1350(31351);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field6479;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field6469;
                            method2751(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field6461 = new byte[field6472 * field6465];
            field6471 = new short[field6472 * field6465];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field6472 * field6465];
                for (int var13 = 0; var13 < field6476[var11].length; var13++) {
                    for (int var19 = 0; var19 < field6476[var11][0].length; var19++) {
                        class184 var20 = field6476[var11][var13][var19];
                        if (var20 != null) {
                            for (class121 var21 = (class121) var20.method986((byte) -126); var21 != null; var21 = (class121) var20.method984((byte) 113)) {
                                var12[(var19 * 64 + var21.field1497) * field6472 + var13 * 64 + var21.field1500] = (byte) var21.field1495;
                            }
                        }
                    }
                }
                method2748(var12, field6461, field6471, arg1, arg2);
                for (int var14 = 0; var14 < field6476[var11].length; var14++) {
                    for (int var15 = 0; var15 < field6476[var11][0].length; var15++) {
                        class184 var16 = field6476[var11][var14][var15];
                        if (var16 != null) {
                            for (class121 var17 = (class121) var16.method986((byte) -126); var17 != null; var17 = (class121) var16.method984((byte) 106)) {
                                int var18 = (var15 * 64 + var17.field1497) * field6472 + var14 * 64 + var17.field1500;
                                var17.field1495 = (field6461[var18] & 0xFF) << 16 | field6471[var18] & 0xFFFF;
                                if (var17.field1495 != 0) {
                                    var17.field1495 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2748(field6466, field6461, field6471, arg1, arg2);
            field6466 = null;
            method2742();
            return;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static final void method2733(int arg0) {
        field6447 = (class180) field6448.method308((long) arg0, (byte) -95);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lvm;IIII)Lmk;")
    private static final class154 method2734(class322 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class216 var5 = (class216) field6455.method814((byte) 90); var5 != null; var5 = (class216) field6455.method827(57)) {
            method2753(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field6455;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)Lin;")
    public static final class180 method2735(int arg0) {
        return (class180) field6448.method308((long) arg0, (byte) 40);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lam;)V")
    public static final void method2736(class286 arg0) {
        field6446 = arg0;
        field6448.method307((byte) 115);
        int var1 = field6446.method1700("details", (byte) -70);
        int[] var2 = field6446.method1685(0, var1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class180 var4 = class416.method2584(var1, var2[var3], field6446, 31968);
            field6448.method314((long) var4.field2266, var4, 7079);
        }
        class67.method382(-80, false, true);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lvm;IIII[S[B)V")
    private static final void method2737(class322 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class225 var8 = class281.method1655((byte) -28, arg5[var7] & 0xFFFF);
            int var9 = var8.field2986;
            if (var9 != -1) {
                class339 var10 = class315.method1827(var9, (byte) 115);
                class20 var11 = var10.method1979(var8.field3046 ? arg6[var7] >> 6 & 0x3 : 0, var8.field3030 ? var8.field3053 : false, arg0, (byte) 106);
                if (var11 != null) {
                    int var12 = arg3 * var11.method101() >> 2;
                    int var13 = arg4 * var11.method109() >> 2;
                    if (var10.field4518) {
                        int var14 = var8.field2995;
                        int var15 = var8.field3019;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field4525 == 0) {
                            var11.method106(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method110(arg1, arg2 + arg4 - var13, var12, var13, 1, var10.field4525 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Lrh;")
    public static final class69 method2738(int arg0, int arg1) {
        class69 var2 = new class69();
        for (class180 var3 = (class180) field6448.method315((byte) -82); var3 != null; var3 = (class180) field6448.method310(-81)) {
            if (var3.field2261 && var3.method954(arg1, arg0, 12800)) {
                var2.method393((byte) 83, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "()V")
    public static final void method2739() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field6458.field94; var1++) {
            boolean var2 = field6447.method952(var0, field6458.field87[var1] >> 14 & 0x3FFF, true, field6458.field87[var1] & 0x3FFF, field6458.field87[var1] >> 28 & 0x3);
            if (var2) {
                class216 var3 = new class216(field6458.field88[var1]);
                var3.field2908 = var0[1] - field6479;
                var3.field2896 = var0[2] - field6469;
                field6455.method825(-50, var3);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "()V")
    public static void method2740() {
        field6447 = null;
        field6446 = null;
        field6448 = null;
        field6456 = null;
        field6449 = null;
        field6452 = null;
        field6458 = null;
        field6455 = null;
        field6478 = null;
        field6466 = null;
        field6461 = null;
        field6471 = null;
        field6474 = null;
        field6473 = null;
        field6480 = null;
        field6467 = null;
        field6462 = null;
        field6476 = null;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)Lin;")
    public static final class180 method2741(int arg0, int arg1) {
        for (class180 var2 = (class180) field6448.method315((byte) -117); var2 != null; var2 = (class180) field6448.method310(-105)) {
            if (var2.field2261 && var2.method954(arg1, arg0, 12800)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "()V")
    private static final void method2742() {
        for (int var0 = 0; var0 < field6472; var0++) {
            for (int var9 = 0; var9 < field6465; var9++) {
                int var10 = field6480[field6472 * var9 + var0] & 0xFFFF;
                if (var10 != 0) {
                    if (var10 == 65535) {
                        class66 var11 = (class66) field6462.method308((long) (var0 << 16 | var9), (byte) -3);
                        if (var11 != null) {
                            for (int var12 = 0; var12 < var11.field685.length; var12++) {
                                class225 var13 = class281.method1655((byte) -28, var11.field685[var12] & 0xFFFF);
                                if (var13.field2988 != -1) {
                                    class216 var14 = new class216(var13.field2988);
                                    var14.field2908 = var0;
                                    var14.field2896 = var9;
                                    field6455.method825(61, var14);
                                }
                            }
                        }
                    } else {
                        class225 var15 = class281.method1655((byte) -28, var10 - 1);
                        if (var15.field2988 != -1) {
                            class216 var16 = new class216(var15.field2988);
                            var16.field2908 = var0;
                            var16.field2896 = var9;
                            field6455.method825(79, var16);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field6476[0].length; var2++) {
                for (int var3 = 0; var3 < field6476[0][0].length; var3++) {
                    class184 var4 = field6476[var1][var2][var3];
                    if (var4 != null) {
                        for (class121 var5 = (class121) var4.method986((byte) 115); var5 != null; var5 = (class121) var4.method984((byte) 116)) {
                            if (var5.field1499 != null) {
                                for (int var6 = 0; var6 < var5.field1499.length; var6++) {
                                    class225 var7 = class281.method1655((byte) -28, var5.field1499[var6] & 0xFFFF);
                                    if (var7.field2988 != -1) {
                                        class216 var8 = new class216(var7.field2988);
                                        var8.field2908 = ((field6479 >> 6) + var2) * 64 + var5.field1500 - field6479;
                                        var8.field2896 = ((field6469 >> 6) + var3) * 64 + var5.field1497 - field6469;
                                        field6455.method825(99, var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lvm;)Lmk;")
    public static final class154 method2743(class322 arg0) {
        int var1 = field6464 - field6463;
        int var2 = field6477 - field6468;
        int var3 = (field6459 - field6475 << 16) / var1;
        int var4 = (field6460 - field6470 << 16) / var2;
        return method2734(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Lvm;IIII)V")
    private static final void method2744(class322 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field6464 - field6463;
        int var6 = field6477 - field6468;
        if (field6464 < field6472) {
            var5++;
        }
        if (field6477 < field6465) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field6475;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field6475;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field6463 + var7;
                if (var52 >= 0 && var52 < field6472) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field6460 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field6460 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field6468 + var53;
                            int var58 = field6472 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field6465) {
                                var59 = (field6461[var58] & 0xFF) << 16 | field6471[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field6474[var58] & 0xFF;
                                var61 = field6480[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field6447.field2273 != -1) {
                                    var62 = field6447.field2273 | 0xFF000000;
                                } else if ((field6477 + var53 & 0x4) == (field6463 + var7 & 0x4)) {
                                    var62 = field6478[class36.field348 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method1614(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2752(arg0, var49, var54, var51, var56, var59, var60, field6473[var58], (short[]) null, (byte[]) null, true);
                            } else if (var61 == 65535) {
                                class66 var63 = (class66) field6462.method308((long) (var52 << 16 | var57), (byte) -111);
                                if (var63 != null) {
                                    method2752(arg0, var49, var54, var51, var56, var59, var60, field6473[var58], var63.field685, var63.field686, true);
                                }
                            } else {
                                field6449[0] = (short) (var61 - 1);
                                field6452[0] = field6467[var58];
                                method2752(arg0, var49, var54, var51, var56, var59, var60, field6473[var58], field6449, field6452, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field6460 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field6460 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field6447.field2273 != -1) {
                            var68 = field6447.field2273 | 0xFF000000;
                        } else if ((field6477 + var64 & 0x4) == (field6463 + var7 & 0x4)) {
                            var68 = field6478[class36.field348 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method1614(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field6475;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field6475;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field6463 + var8;
                if (var41 >= 0 && var41 < field6472) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field6460 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field6460 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field6468 + var42;
                            if (var46 >= 0 && var46 < field6465) {
                                int var47 = field6480[field6472 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2737(arg0, var38, var43, var40, var45, (short[]) null, (byte[]) null);
                                } else if (var47 == 65535) {
                                    class66 var48 = (class66) field6462.method308((long) (var41 << 16 | var46), (byte) -14);
                                    if (var48 != null) {
                                        method2737(arg0, var38, var43, var40, var45, var48.field685, var48.field686);
                                    }
                                } else {
                                    field6449[0] = (short) (var47 - 1);
                                    field6452[0] = field6467[field6472 * var46 + var41];
                                    method2737(arg0, var38, var43, var40, var45, field6449, field6452);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field6463 >> 6;
        int var10 = field6468 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field6464 >> 6;
        int var12 = field6477 >> 6;
        if (var11 >= field6476[0].length) {
            var11 = field6476[0].length - 1;
        }
        if (var12 >= field6476[0][0].length) {
            var12 = field6476[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class184 var28 = field6476[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field6479 >> 6) + var14) * 64;
                        int var30 = ((field6469 >> 6) + var27) * 64;
                        for (class121 var31 = (class121) var28.method986((byte) -20); var31 != null; var31 = (class121) var28.method984((byte) 46)) {
                            int var32 = var31.field1500 + var29 - field6479 - field6463;
                            int var33 = var31.field1497 + var30 - field6469 - field6468;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field6475;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field6475;
                            int var36 = field6460 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field6460 - (arg2 * var33 + arg4 >> 16);
                            method2752(arg0, var34, var36, var35 - var34, var37 - var36, var31.field1495, var31.field1496 & 0xFF, var31.field1498, var31.field1499, var31.field1494, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class184 var17 = field6476[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field6479 >> 6) + var15) * 64;
                        int var19 = ((field6469 >> 6) + var16) * 64;
                        for (class121 var20 = (class121) var17.method986((byte) -8); var20 != null; var20 = (class121) var17.method984((byte) 114)) {
                            int var21 = var20.field1500 + var18 - field6479 - field6463;
                            int var22 = var20.field1497 + var19 - field6469 - field6468;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field6475;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field6475;
                            int var25 = field6460 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field6460 - (arg2 * var22 + arg4 >> 16);
                            method2737(arg0, var23, var25, var24 - var23, var26 - var25, var20.field1499, var20.field1494);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "()V")
    public static final void method2745() {
        field6466 = null;
        field6461 = null;
        field6471 = null;
        field6474 = null;
        field6473 = null;
        field6480 = null;
        field6467 = null;
        field6462 = null;
        field6476 = null;
        field6478 = null;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Lvm;)V")
    public static final void method2746(class322 arg0) {
        int var1 = field6464 - field6463;
        int var2 = field6477 - field6468;
        int var3 = (field6459 - field6475 << 16) / var1;
        int var4 = (field6460 - field6470 << 16) / var2;
        method2744(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lal;II)V")
    public static final void method2747(class369 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class80.field886; var3++) {
            field6478[var3 + 1] = method2750(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([B[B[SII)V")
    private static final void method2748(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field6465];
        int[] var6 = new int[field6465];
        int[] var7 = new int[field6465];
        int[] var8 = new int[field6465];
        int[] var9 = new int[field6465];
        for (int var10 = -5; var10 < field6472; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field6465; var13++) {
                int var10002;
                if (var11 < field6472) {
                    int var28 = arg0[field6472 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class262 var29 = class405.method2536((byte) 90, var28 - 1);
                        var5[var13] += var29.field3571;
                        var6[var13] += var29.field3568;
                        var7[var13] += var29.field3569;
                        var8[var13] += var29.field3583;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field6472 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class262 var31 = class405.method2536((byte) 90, var30 - 1);
                        var5[var13] -= var31.field3571;
                        var6[var13] -= var31.field3568;
                        var7[var13] -= var31.field3569;
                        var8[var13] -= var31.field3583;
                        var10002 = var9[var13]--;
                    }
                }
            }
            if (var10 >= 0) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                for (int var19 = -5; var19 < field6465; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field6465) {
                        var14 += var5[var20];
                        var15 += var6[var20];
                        var16 += var7[var20];
                        var17 += var8[var20];
                        var18 += var9[var20];
                    }
                    int var21 = var19 - 5;
                    if (var21 >= 0) {
                        var14 -= var5[var21];
                        var15 -= var6[var21];
                        var16 -= var7[var21];
                        var17 -= var8[var21];
                        var18 -= var9[var21];
                    }
                    if (var19 >= 0 && var18 > 0) {
                        if ((arg0[field6472 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field6472 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class384.method2386((byte) -113, var15 / var18, var14 * 256 / var17, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field6472 * var19 + var10;
                            int var27 = class284.field3878[class347.method2109(class359.method2191((byte) -103, var25, 96), 19) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "()V")
    public static final void method2749() {
        field6466 = new byte[field6472 * field6465];
        field6474 = new byte[field6472 * field6465];
        field6473 = new byte[field6472 * field6465];
        field6480 = new short[field6472 * field6465];
        field6467 = new byte[field6472 * field6465];
        field6462 = new class58(1024);
        field6476 = new class184[3][field6472 >> 6][field6465 >> 6];
        field6478 = new int[class80.field886 + 1];
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lal;III)I")
    private static final int method2750(class369 arg0, int arg1, int arg2, int arg3) {
        class191 var4 = class247.method1317((byte) 97, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field2412;
        if (var5 >= 0 && arg0.method1660(var5, (byte) -87).field823) {
            var5 = -1;
        }
        int var9;
        if (var4.field2413 >= 0) {
            int var6 = var4.field2413;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class284.field3878[class347.method2109(class395.method2466(-22897, var8, 96), -70) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class284.field3878[class347.method2109(class395.method2466(-22897, arg0.method1660(var5, (byte) -77).field827, 96), -43) & 0xFFFF] | 0xFF000000;
        } else if (var4.field2417 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field2417;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class284.field3878[class347.method2109(class395.method2466(-22897, var12, 96), 115) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lvm;Ltq;IIII[I[I)V")
    private static final void method2751(class322 arg0, class250 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1350(31351);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1350(31351);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field6466[field6472 * arg5 + arg4] = (byte) var11;
                    field6474[field6472 * arg5 + arg4] = 0;
                } else {
                    field6474[field6472 * arg5 + arg4] = (byte) var11;
                    field6473[field6472 * arg5 + arg4] = 0;
                    field6466[field6472 * arg5 + arg4] = arg1.method1363((byte) -10);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1350(31351);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1350(31351);
                var18 = arg1.method1350(31351);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1350(31351);
            }
            if (var15 == 0) {
                field6466[field6472 * arg5 + arg4] = (byte) var16;
                field6474[field6472 * arg5 + arg4] = (byte) var17;
                field6473[field6472 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field6480[field6472 * arg5 + arg4] = (short) (arg1.method1374(-2) + 1);
                    field6467[field6472 * arg5 + arg4] = arg1.method1363((byte) -33);
                } else if (var19 > 1) {
                    field6480[field6472 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1374(-2);
                        var21[var22] = arg1.method1363((byte) -121);
                    }
                    field6462.method314((long) (arg4 << 16 | arg5), new class66(var20, var21), 7079);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1374(-2);
                        var24[var25] = arg1.method1363((byte) 126);
                    }
                }
                if (field6476[var15 - 1][arg2 - (field6479 >> 6)][arg3 - (field6469 >> 6)] == null) {
                    field6476[var15 - 1][arg2 - (field6479 >> 6)][arg3 - (field6469 >> 6)] = new class184();
                }
                class121 var26 = new class121(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field6476[var15 - 1][arg2 - (field6479 >> 6)][arg3 - (field6469 >> 6)].method992(var26, -62);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lvm;IIIIIII[S[BZ)V")
    private static final void method2752(class322 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method1614(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field6478[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method1614(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class303.method1785(arg0, arg7 >> 6 & 0x3, field6456, (byte) 115, var11, field6478[arg6], arg2, arg3, arg5, var12, arg1, arg4, field6451);
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var14;
        if (arg3 == 1) {
            var14 = arg1;
        } else {
            var14 = arg1 + arg3 - 1;
        }
        int var15;
        if (arg4 == 1) {
            var15 = arg2;
        } else {
            var15 = arg2 + arg4 - 1;
        }
        for (int var16 = 0; var16 < arg8.length; var16++) {
            int var17 = arg9[var16] & 0x3F;
            if (var17 == 0 || var17 == 2 || var17 == 3 || var17 == 9) {
                class225 var18 = class281.method1655((byte) -28, arg8[var16] & 0xFFFF);
                if (var18.field2986 == -1) {
                    int var19 = -3355444;
                    if (var18.field3027 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method1644(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1591(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1644(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method1591(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method1644(arg1, arg2, arg4, -1, 0);
                            arg0.method1591(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1644(var14, arg2, arg4, -1, 0);
                            arg0.method1591(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1644(var14, arg2, arg4, -1, 0);
                            arg0.method1591(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method1644(arg1, arg2, arg4, -1, 0);
                            arg0.method1591(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method1591(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1591(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1591(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method1591(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method1591(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method1591(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lvm;Lir;IIII)V")
    private static final void method2753(class322 arg0, class216 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field2895 = ((arg1.field2908 - field6463) * arg2 + arg4 >> 16) + field6475;
        arg1.field2907 = field6460 - ((arg1.field2896 - field6468) * arg3 + arg5 >> 16);
    }
}
