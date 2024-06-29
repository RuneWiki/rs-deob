import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class416 {

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Lqh;")
    private static class50 field5986 = new class50(16);

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field5991 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "[S")
    private static short[] field5993 = new short[1];

    @OriginalMember(owner = "client!id", name = "k", descriptor = "[B")
    private static byte[] field5992 = new byte[1];

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field6000 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Lsr;")
    public static class167 field5994 = new class167();

    @OriginalMember(owner = "client!id", name = "o", descriptor = "F")
    public static float field5996;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "F")
    public static float field5998;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Lok;")
    public static class169 field5987;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Lro;")
    public static class2 field5985;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Lfo;")
    public static class361 field5990;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Lum;")
    private static class366 field5988;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Lhl;")
    public static class370 field5995;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Ltv;")
    public static class395 field5983;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Lua;")
    private static class474 field5984;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Lfb;")
    public static class478 field5982;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "Lqh;")
    private static class50 field6008;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Lwf;")
    public static class90 field5989;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "[B")
    private static byte[] field6002;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "[B")
    private static byte[] field6005;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "[B")
    private static byte[] field6011;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "[B")
    private static byte[] field6021;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "[B")
    private static byte[] field6022;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "[I")
    private static int[] field6001;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "[S")
    private static short[] field6004;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "[S")
    private static short[] field6006;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "[[[B")
    public static byte[][][] field5999;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "[[[Lwc;")
    private static class49[][][] field6003;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lza;IIII[S[B)V")
    private static final void method2552(class287 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class70 var8 = field5982.method2920(arg5[var7] & 0xFFFF, 19219);
            int var9 = var8.field853;
            if (var9 != -1) {
                class470 var10 = field5989.method502((byte) -106, var9);
                class24 var11 = var10.method2871(arg0, var8.field824 ? arg6[var7] >> 6 & 0x3 : 0, 262144, var8.field839 ? var8.field905 : false);
                if (var11 != null) {
                    int var12 = arg3 * var11.method155() >> 2;
                    int var13 = arg4 * var11.method153() >> 2;
                    if (var10.field6972) {
                        int var14 = var8.field865;
                        int var15 = var8.field857;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field6964 == 0) {
                            var11.method141(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method6(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field6964 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()V")
    public static final void method2553() {
        field6021 = null;
        field6002 = null;
        field6004 = null;
        field6011 = null;
        field6005 = null;
        field6006 = null;
        field6022 = null;
        field6008 = null;
        field6003 = null;
        field6001 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lza;IIII)V")
    private static final void method2554(class287 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field6019 - field6018;
        int var6 = field6013 - field6010;
        if (field6019 < field6014) {
            var5++;
        }
        if (field6013 < field6015) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field6016;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field6016;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field6018 + var7;
                if (var52 >= 0 && var52 < field6014) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field6007 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field6007 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field6010 + var53;
                            int var58 = field6014 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field6015) {
                                var59 = (field6002[var58] & 0xFF) << 16 | field6004[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field6011[var58] & 0xFF;
                                var61 = field6006[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field5983.field5702 != -1) {
                                    var62 = field5983.field5702 | 0xFF000000;
                                } else if ((field6018 + var7 & 0x4) == (field6013 + var53 & 0x4)) {
                                    var62 = field6001[field5984.field7026 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method1153(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2567(arg0, var49, var54, var51, var56, var59, var60, field6005[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class506 var63 = (class506) field6008.method295((long) (var52 << 16 | var57), -90);
                                if (var63 != null) {
                                    method2567(arg0, var49, var54, var51, var56, var59, var60, field6005[var58], var63.field7342, var63.field7343, true);
                                }
                            } else {
                                field5993[0] = (short) (var61 - 1);
                                field5992[0] = field6022[var58];
                                method2567(arg0, var49, var54, var51, var56, var59, var60, field6005[var58], field5993, field5992, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field6007 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field6007 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field5983.field5702 != -1) {
                            var68 = field5983.field5702 | 0xFF000000;
                        } else if ((field6018 + var7 & 0x4) == (field6013 + var64 & 0x4)) {
                            var68 = field6001[field5984.field7026 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method1153(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field6016;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field6016;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field6018 + var8;
                if (var41 >= 0 && var41 < field6014) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field6007 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field6007 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field6010 + var42;
                            if (var46 >= 0 && var46 < field6015) {
                                int var47 = field6006[field6014 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2552(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class506 var48 = (class506) field6008.method295((long) (var41 << 16 | var46), -121);
                                    if (var48 != null) {
                                        method2552(arg0, var38, var43, var40, var45, var48.field7342, var48.field7343);
                                    }
                                } else {
                                    field5993[0] = (short) (var47 - 1);
                                    field5992[0] = field6022[field6014 * var46 + var41];
                                    method2552(arg0, var38, var43, var40, var45, field5993, field5992);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field6018 >> 6;
        int var10 = field6010 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field6019 >> 6;
        int var12 = field6013 >> 6;
        if (var11 >= field6003[0].length) {
            var11 = field6003[0].length - 1;
        }
        if (var12 >= field6003[0][0].length) {
            var12 = field6003[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class49 var28 = field6003[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field6009 >> 6) + var14) * 64;
                        int var30 = ((field6020 >> 6) + var27) * 64;
                        for (class332 var31 = (class332) var28.method290(-1); var31 != null; var31 = (class332) var28.method284(10748)) {
                            int var32 = var31.field4395 + var29 - field6009 - field6018;
                            int var33 = var31.field4398 + var30 - field6020 - field6010;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field6016;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field6016;
                            int var36 = field6007 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field6007 - (arg2 * var33 + arg4 >> 16);
                            method2567(arg0, var34, var36, var35 - var34, var37 - var36, var31.field4401, var31.field4397 & 0xFF, var31.field4400, var31.field4399, var31.field4396, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class49 var17 = field6003[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field6009 >> 6) + var15) * 64;
                        int var19 = ((field6020 >> 6) + var16) * 64;
                        for (class332 var20 = (class332) var17.method290(-1); var20 != null; var20 = (class332) var17.method284(10748)) {
                            int var21 = var20.field4395 + var18 - field6009 - field6018;
                            int var22 = var20.field4398 + var19 - field6020 - field6010;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field6016;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field6016;
                            int var25 = field6007 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field6007 - (arg2 * var22 + arg4 >> 16);
                            method2552(arg0, var23, var25, var24 - var23, var26 - var25, var20.field4399, var20.field4396);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lza;II)V")
    public static final void method2555(class287 arg0, int arg1, int arg2) {
        class396 var3 = new class396(field5990.method2132(field5983.field5697, (byte) 77, "area"));
        int var4 = var3.method2388((byte) -113);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method2388((byte) -113);
        }
        int var7 = var3.method2388((byte) -120);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2388((byte) -126);
        }
        while (true) {
            while (var3.field5729 < var3.field5761.length) {
                if (var3.method2388((byte) -112) == 0) {
                    int var22 = var3.method2388((byte) -126);
                    int var23 = var3.method2388((byte) -122);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field6009;
                            int var27 = var23 * 64 + var25 - field6020;
                            method2570(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method2388((byte) -111);
                    int var29 = var3.method2388((byte) -123);
                    int var30 = var3.method2388((byte) -123);
                    int var31 = var3.method2388((byte) -121);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field6009;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field6020;
                            method2570(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field6002 = new byte[field6015 * field6014];
            field6004 = new short[field6015 * field6014];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field6015 * field6014];
                for (int var13 = 0; var13 < field6003[var11].length; var13++) {
                    for (int var19 = 0; var19 < field6003[var11][0].length; var19++) {
                        class49 var20 = field6003[var11][var13][var19];
                        if (var20 != null) {
                            for (class332 var21 = (class332) var20.method290(-1); var21 != null; var21 = (class332) var20.method284(10748)) {
                                var12[(var19 * 64 + var21.field4398) * field6014 + var13 * 64 + var21.field4395] = (byte) var21.field4401;
                            }
                        }
                    }
                }
                method2571(var12, field6002, field6004, arg1, arg2);
                for (int var14 = 0; var14 < field6003[var11].length; var14++) {
                    for (int var15 = 0; var15 < field6003[var11][0].length; var15++) {
                        class49 var16 = field6003[var11][var14][var15];
                        if (var16 != null) {
                            for (class332 var17 = (class332) var16.method290(-1); var17 != null; var17 = (class332) var16.method284(10748)) {
                                int var18 = (var15 * 64 + var17.field4398) * field6014 + var14 * 64 + var17.field4395;
                                var17.field4401 = (field6002[var18] & 0xFF) << 16 | field6004[var18] & 0xFFFF;
                                if (var17.field4401 != 0) {
                                    var17.field4401 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2571(field6021, field6002, field6004, arg1, arg2);
            field6021 = null;
            method2559();
            return;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static final void method2556(int arg0) {
        field5983 = (class395) field5986.method295((long) arg0, -110);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lza;Lql;IIII)V")
    private static final void method2557(class287 arg0, class519 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field7645 = ((arg1.field7651 - field6018) * arg2 + arg4 >> 16) + field6016;
        arg1.field7650 = field6007 - ((arg1.field7648 - field6010) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)Ltv;")
    public static final class395 method2558(int arg0) {
        return (class395) field5986.method295((long) arg0, -100);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "()V")
    private static final void method2559() {
        for (int var0 = 0; var0 < field6014; var0++) {
            for (int var11 = 0; var11 < field6015; var11++) {
                int var12 = field6006[field6014 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class506 var13 = (class506) field6008.method295((long) (var0 << 16 | var11), -95);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field7342.length; var14++) {
                                class70 var15 = field5982.method2920(var13.field7342[var14] & 0xFFFF, 19219);
                                int var16 = var15.field862;
                                if (var15.field848 != null) {
                                    class70 var17 = var15.method403(-1, field5985);
                                    if (var17 != null) {
                                        var16 = var17.field862;
                                    }
                                }
                                if (var16 != -1) {
                                    class519 var18 = new class519(var16);
                                    var18.field7651 = var0;
                                    var18.field7648 = var11;
                                    field5994.method975(0, var18);
                                }
                            }
                        }
                    } else {
                        class70 var19 = field5982.method2920(var12 - 1, 19219);
                        int var20 = var19.field862;
                        if (var19.field848 != null) {
                            class70 var21 = var19.method403(-1, field5985);
                            if (var21 != null) {
                                var20 = var21.field862;
                            }
                        }
                        if (var20 != -1) {
                            class519 var22 = new class519(var20);
                            var22.field7651 = var0;
                            var22.field7648 = var11;
                            field5994.method975(0, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field6003[0].length; var2++) {
                for (int var3 = 0; var3 < field6003[0][0].length; var3++) {
                    class49 var4 = field6003[var1][var2][var3];
                    if (var4 != null) {
                        for (class332 var5 = (class332) var4.method290(-1); var5 != null; var5 = (class332) var4.method284(10748)) {
                            if (var5.field4399 != null) {
                                for (int var6 = 0; var6 < var5.field4399.length; var6++) {
                                    class70 var7 = field5982.method2920(var5.field4399[var6] & 0xFFFF, 19219);
                                    int var8 = var7.field862;
                                    if (var7.field848 != null) {
                                        class70 var9 = var7.method403(-1, field5985);
                                        if (var9 != null) {
                                            var8 = var9.field862;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class519 var10 = new class519(var8);
                                        var10.field7651 = ((field6009 >> 6) + var2) * 64 + var5.field4395 - field6009;
                                        var10.field7648 = ((field6020 >> 6) + var3) * 64 + var5.field4398 - field6020;
                                        field5994.method975(0, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lfo;Lua;Lum;Lfb;Lok;Lwf;Lro;)V")
    public static final void method2560(class361 arg0, class474 arg1, class366 arg2, class478 arg3, class169 arg4, class90 arg5, class2 arg6) {
        field5990 = arg0;
        field5984 = arg1;
        field5988 = arg2;
        field5982 = arg3;
        field5987 = arg4;
        field5989 = arg5;
        field5985 = arg6;
        field5986.method293((byte) 39);
        int var7 = field5990.method2148("details", 0);
        int[] var8 = field5990.method2152(var7, -1);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class395 var10 = class99.method606(var7, var8[var9], true, field5990);
                field5986.method291((long) var10.field5698, var10, -27);
            }
        }
        class66.method388(true, false, 0);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lza;)V")
    public static final void method2561(class287 arg0) {
        int var1 = field6019 - field6018;
        int var2 = field6013 - field6010;
        int var3 = (field6017 - field6016 << 16) / var1;
        int var4 = (field6007 - field6012 << 16) / var2;
        method2554(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Lza;IIII)Lsr;")
    private static final class167 method2562(class287 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class519 var5 = (class519) field5994.method970(12); var5 != null; var5 = (class519) field5994.method976((byte) -124)) {
            method2557(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field5994;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "()V")
    public static final void method2563() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field5995.field5038; var1++) {
            boolean var2 = field5983.method2375(field5995.field5039[var1] >> 28 & 0x3, 102, field5995.field5039[var1] & 0x3FFF, var0, field5995.field5039[var1] >> 14 & 0x3FFF);
            if (var2) {
                class519 var3 = new class519(field5995.field5035[var1]);
                var3.field7651 = var0[1] - field6009;
                var3.field7648 = var0[2] - field6020;
                field5994.method975(0, var3);
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "()V")
    public static void method2564() {
        field5984 = null;
        field5988 = null;
        field5982 = null;
        field5987 = null;
        field5989 = null;
        field5985 = null;
        field5983 = null;
        field5990 = null;
        field5986 = null;
        field5999 = null;
        field5993 = null;
        field5992 = null;
        field5995 = null;
        field5994 = null;
        field6001 = null;
        field6021 = null;
        field6002 = null;
        field6004 = null;
        field6011 = null;
        field6005 = null;
        field6006 = null;
        field6022 = null;
        field6008 = null;
        field6003 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ll;III)I")
    private static final int method2565(class16 arg0, int arg1, int arg2, int arg3) {
        class200 var4 = field5984.method2895(17, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field2672;
        if (var5 >= 0 && arg0.method94(var5, (byte) -72).field6305) {
            var5 = -1;
        }
        int var9;
        if (var4.field2676 >= 0) {
            int var6 = var4.field2676;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class445.field6483[class412.method2517(-127, class373.method2206(var8, 96, -121)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class445.field6483[class412.method2517(-110, class373.method2206(arg0.method94(var5, (byte) -72).field6309, 96, -124)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field2671 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field2671;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class445.field6483[class412.method2517(-126, class373.method2206(var12, 96, -123)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ll;II)V")
    public static final void method2566(class16 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field5984.field7024; var3++) {
            field6001[var3 + 1] = method2565(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lza;IIIIIII[S[BZ)V")
    private static final void method2567(class287 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method1153(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field6001[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method1153(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class50.method296((byte) -117, field5999, arg5, arg0, arg1, var11, var12, arg2, arg7 >> 6 & 0x3, field6001[arg6], field5997, arg4, arg3);
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
                class70 var18 = field5982.method2920(arg8[var16] & 0xFFFF, 19219);
                if (var18.field853 == -1) {
                    int var19 = -3355444;
                    if (var18.field886 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method1185(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1128(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1185(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method1128(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method1185(arg1, arg2, arg4, -1, 0);
                            arg0.method1128(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1185(var14, arg2, arg4, -1, 0);
                            arg0.method1128(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1185(var14, arg2, arg4, -1, 0);
                            arg0.method1128(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method1185(arg1, arg2, arg4, -1, 0);
                            arg0.method1128(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method1128(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1128(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1128(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method1128(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method1128(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method1128(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "()V")
    public static final void method2568() {
        field6021 = new byte[field6015 * field6014];
        field6011 = new byte[field6015 * field6014];
        field6005 = new byte[field6015 * field6014];
        field6006 = new short[field6015 * field6014];
        field6022 = new byte[field6015 * field6014];
        field6008 = new class50(1024);
        field6003 = new class49[3][field6014 >> 6][field6015 >> 6];
        field6001 = new int[field5984.field7024 + 1];
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Lza;)Lsr;")
    public static final class167 method2569(class287 arg0) {
        int var1 = field6019 - field6018;
        int var2 = field6013 - field6010;
        int var3 = (field6017 - field6016 << 16) / var1;
        int var4 = (field6007 - field6012 << 16) / var2;
        return method2562(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lza;Lug;IIII[I[I)V")
    private static final void method2570(class287 arg0, class396 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method2388((byte) -126);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method2388((byte) -118);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field6021[field6014 * arg5 + arg4] = (byte) var11;
                    field6011[field6014 * arg5 + arg4] = 0;
                } else {
                    field6011[field6014 * arg5 + arg4] = (byte) var11;
                    field6005[field6014 * arg5 + arg4] = 0;
                    field6021[field6014 * arg5 + arg4] = arg1.method2418(-23);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method2388((byte) -126);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method2388((byte) -117);
                var18 = arg1.method2388((byte) -123);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method2388((byte) -121);
            }
            if (var15 == 0) {
                field6021[field6014 * arg5 + arg4] = (byte) var16;
                field6011[field6014 * arg5 + arg4] = (byte) var17;
                field6005[field6014 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field6006[field6014 * arg5 + arg4] = (short) (arg1.method2386(-23648) + 1);
                    field6022[field6014 * arg5 + arg4] = arg1.method2418(102);
                } else if (var19 > 1) {
                    field6006[field6014 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method2386(-23648);
                        var21[var22] = arg1.method2418(121);
                    }
                    field6008.method291((long) (arg4 << 16 | arg5), new class506(var20, var21), -76);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method2386(-23648);
                        var24[var25] = arg1.method2418(115);
                    }
                }
                if (field6003[var15 - 1][arg2 - (field6009 >> 6)][arg3 - (field6020 >> 6)] == null) {
                    field6003[var15 - 1][arg2 - (field6009 >> 6)][arg3 - (field6020 >> 6)] = new class49();
                }
                class332 var26 = new class332(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field6003[var15 - 1][arg2 - (field6009 >> 6)][arg3 - (field6020 >> 6)].method286((byte) 123, var26);
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([B[B[SII)V")
    private static final void method2571(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field6015];
        int[] var6 = new int[field6015];
        int[] var7 = new int[field6015];
        int[] var8 = new int[field6015];
        int[] var9 = new int[field6015];
        for (int var10 = -5; var10 < field6014; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field6015; var13++) {
                int var10002;
                if (var11 < field6014) {
                    int var28 = arg0[field6014 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class451 var29 = field5988.method2180(var28 - 1, (byte) 63);
                        var5[var13] += var29.field6711;
                        var6[var13] += var29.field6713;
                        var7[var13] += var29.field6719;
                        var8[var13] += var29.field6712;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field6014 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class451 var31 = field5988.method2180(var30 - 1, (byte) -104);
                        var5[var13] -= var31.field6711;
                        var6[var13] -= var31.field6713;
                        var7[var13] -= var31.field6719;
                        var8[var13] -= var31.field6712;
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
                for (int var19 = -5; var19 < field6015; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field6015) {
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
                        if ((arg0[field6014 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field6014 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class377.method2284(var15 / var18, -25669, var16 / var18, var14 * 256 / var17);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field6014 * var19 + var10;
                            int var27 = class445.field6483[class412.method2517(-111, class241.method1506(true, 96, var25)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Lso;")
    public static final class330 method2572(int arg0, int arg1) {
        class330 var2 = new class330();
        for (class395 var3 = (class395) field5986.method300((byte) -107); var3 != null; var3 = (class395) field5986.method301(-112)) {
            if (var3.field5692 && var3.method2383(arg0, arg1, -1)) {
                var2.method1938(true, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6018 = arg0 - field6009;
        field6013 = arg1 - field6020;
        field6019 = arg2 - field6009;
        field6010 = arg3 - field6020;
        field6016 = arg4;
        field6012 = arg5;
        field6017 = arg6;
        field6007 = arg7;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)Ltv;")
    public static final class395 method2574(int arg0, int arg1) {
        for (class395 var2 = (class395) field5986.method300((byte) -120); var2 != null; var2 = (class395) field5986.method301(-116)) {
            if (var2.field5692 && var2.method2383(arg0, arg1, -1)) {
                return var2;
            }
        }
        return null;
    }
}
