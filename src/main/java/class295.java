import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class295 {

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "[[I")
    public static int[][] field4633 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Lol;")
    public static class246 field4631 = new class246(16);

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field4634 = 0;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Lml;")
    public static class143 field4628;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "[Lab;")
    public static class157[] field4629;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLok;)V", line = 8)
    public static final void method2056(byte arg0, class160 arg1) {
        if (arg0 != 58) {
            method2057();
        }
        field4632++;
        class160 var2 = class26.method182(arg0 - 59, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class210.field3432;
            var4 = class160.field2601;
        } else {
            var4 = var2.field2458;
            var3 = var2.field2590;
        }
        class50.method347(var4, false, arg1, var3, 23739);
        class293.method2048(var3, arg1, arg0 - 11824, var4);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "()V", line = 41)
    public static final void method2057() {
        class183.field2958 = 0;
        label194: for (int var0 = 0; var0 < class181.field2918; var0++) {
            class157 var1 = class294.field4626[var0];
            if (class41.field571 != null) {
                for (int var2 = 0; var2 < class41.field571.length; var2++) {
                    if (class41.field571[var2] != -1000000 && (var1.field2405 <= class41.field571[var2] || var1.field2420 <= class41.field571[var2]) && (var1.field2419 <= class245.field3892[var2] || var1.field2406 <= class245.field3892[var2]) && (var1.field2419 >= class187.field3035[var2] || var1.field2406 >= class187.field3035[var2]) && (var1.field2417 <= class2.field11[var2] || var1.field2408 <= class2.field11[var2]) && (var1.field2417 >= class58.field752[var2] || var1.field2408 >= class58.field752[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field2414 == 1) {
                int var3 = var1.field2402 + class214.field3473 - class185.field2979;
                if (var3 >= 0 && var3 <= class214.field3473 + class214.field3473) {
                    int var4 = var1.field2413 + class214.field3473 - class313.field4870;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field2404 + class214.field3473 - class313.field4870;
                    if (var5 > class214.field3473 + class214.field3473) {
                        var5 = class214.field3473 + class214.field3473;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class197.field3221[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class88.field1347 - var1.field2419;
                        if (var7 > 32) {
                            var1.field2411 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field2411 = 2;
                            var7 = -var7;
                        }
                        var1.field2412 = (var1.field2417 - class2.field15 << 8) / var7;
                        var1.field2415 = (var1.field2408 - class2.field15 << 8) / var7;
                        var1.field2403 = (var1.field2405 - class189.field3081 << 8) / var7;
                        var1.field2409 = (var1.field2420 - class189.field3081 << 8) / var7;
                        field4629[class183.field2958++] = var1;
                    }
                }
            } else if (var1.field2414 == 2) {
                int var8 = var1.field2413 + class214.field3473 - class313.field4870;
                if (var8 >= 0 && var8 <= class214.field3473 + class214.field3473) {
                    int var9 = var1.field2402 + class214.field3473 - class185.field2979;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field2407 + class214.field3473 - class185.field2979;
                    if (var10 > class214.field3473 + class214.field3473) {
                        var10 = class214.field3473 + class214.field3473;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class197.field3221[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class2.field15 - var1.field2417;
                        if (var12 > 32) {
                            var1.field2411 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field2411 = 4;
                            var12 = -var12;
                        }
                        var1.field2416 = (var1.field2419 - class88.field1347 << 8) / var12;
                        var1.field2410 = (var1.field2406 - class88.field1347 << 8) / var12;
                        var1.field2403 = (var1.field2405 - class189.field3081 << 8) / var12;
                        var1.field2409 = (var1.field2420 - class189.field3081 << 8) / var12;
                        field4629[class183.field2958++] = var1;
                    }
                }
            } else if (var1.field2414 == 4) {
                int var13 = var1.field2405 - class189.field3081;
                if (var13 > 128) {
                    int var14 = var1.field2413 + class214.field3473 - class313.field4870;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field2404 + class214.field3473 - class313.field4870;
                    if (var15 > class214.field3473 + class214.field3473) {
                        var15 = class214.field3473 + class214.field3473;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field2402 + class214.field3473 - class185.field2979;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field2407 + class214.field3473 - class185.field2979;
                        if (var17 > class214.field3473 + class214.field3473) {
                            var17 = class214.field3473 + class214.field3473;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class197.field3221[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field2411 = 5;
                            var1.field2416 = (var1.field2419 - class88.field1347 << 8) / var13;
                            var1.field2410 = (var1.field2406 - class88.field1347 << 8) / var13;
                            var1.field2412 = (var1.field2417 - class2.field15 << 8) / var13;
                            var1.field2415 = (var1.field2408 - class2.field15 << 8) / var13;
                            field4629[class183.field2958++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 267)
    public static void method2058(int arg0) {
        field4628 = null;
        field4633 = (int[][]) null;
        field4629 = null;
        field4631 = null;
        int var1 = 20 % ((arg0 + 5) / 63);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB[[F[[F[[FLkd;B[[IIZIIIIII)V", line = 282)
    public static final void method2059(int arg0, byte arg1, float[][] arg2, float[][] arg3, float[][] arg4, class83 arg5, byte arg6, int[][] arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        if (arg10 != -1968038264) {
            method2056((byte) 21, (class160) null);
        }
        int var16 = (arg0 << 8) + 255;
        int var17 = (arg13 << 8) + 255;
        field4630++;
        int var18 = (arg11 << 8) + 255;
        int var19 = (arg15 << 8) + 255;
        int[] var20 = null;
        int[] var21 = field4633[arg6];
        int[] var22 = new int[var21.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class341.method2349(arg4, arg3, arg8, arg2, (int[][]) null, false, var21[var23 + var23], 0.0F, arg12, arg5, var19, var21[var23 + var23 + 1], arg1, arg7, var16, -1, var18, var17);
        }
        if (arg9) {
            if (arg6 == 1) {
                int var42 = class341.method2349(arg4, arg3, arg8, arg2, (int[][]) null, true, 64, 0.0F, arg12, arg5, var19, 128, arg1, arg7, var16, arg10 ^ 0x754DE177, var18, var17);
                int var43 = class341.method2349(arg4, arg3, arg8, arg2, (int[][]) null, true, 128, 0.0F, arg12, arg5, var19, 64, arg1, arg7, var16, -1, var18, var17);
                var20 = new int[] { var43, var42, var22[2], var42, var22[0], var22[2] };
            } else if (arg6 == 2) {
                var20 = new int[6];
                int var25 = class341.method2349(arg4, arg3, arg8, arg2, (int[][]) null, true, 128, 0.0F, arg12, arg5, var19, 128, arg1, arg7, var16, -1, var18, var17);
                int var26 = class341.method2349(arg4, arg3, arg8, arg2, (int[][]) null, true, 64, 0.0F, arg12, arg5, var19, 0, arg1, arg7, var16, -1, var18, var17);
                var20[3] = var25;
                var20[1] = var26;
                var20[4] = var22[1];
                var20[2] = var25;
                var20[0] = var22[0];
                var20[5] = var22[0];
            } else if (arg6 == 3) {
                var20 = new int[6];
                int var27 = class341.method2349(arg4, arg3, arg8, arg2, (int[][]) null, true, 0, 0.0F, arg12, arg5, var19, 128, arg1, arg7, var16, arg10 + 1968038263, var18, var17);
                int var28 = class341.method2349(arg4, arg3, arg8, arg2, (int[][]) null, true, 64, 0.0F, arg12, arg5, var19, 0, arg1, arg7, var16, -1, var18, var17);
                var20[1] = var22[1];
                var20[3] = var27;
                var20[4] = var28;
                var20[0] = var22[2];
                var20[2] = var27;
                var20[5] = var22[2];
            } else if (arg6 == 4) {
                var20 = new int[3];
                int var29 = class341.method2349(arg4, arg3, arg8, arg2, (int[][]) null, true, 0, 0.0F, arg12, arg5, var19, 128, arg1, arg7, var16, -1, var18, var17);
                var20[1] = var29;
                var20[0] = var22[3];
                var20[2] = var22[0];
            } else if (arg6 == 5) {
                var20 = new int[3];
                int var30 = class341.method2349(arg4, arg3, arg8, arg2, (int[][]) null, true, 128, 0.0F, arg12, arg5, var19, 128, arg1, arg7, var16, -1, var18, var17);
                var20[0] = var22[2];
                var20[1] = var30;
                var20[2] = var22[3];
            } else if (arg6 == 6) {
                var20 = new int[6];
                int var40 = class341.method2349(arg4, arg3, arg8, arg2, (int[][]) null, true, 128, 0.0F, arg12, arg5, var19, 0, arg1, arg7, var16, -1, var18, var17);
                int var41 = class341.method2349(arg4, arg3, arg8, arg2, (int[][]) null, true, 128, 0.0F, arg12, arg5, var19, 128, arg1, arg7, var16, -1, var18, var17);
                var20[0] = var22[3];
                var20[3] = var41;
                var20[4] = var22[0];
                var20[2] = var41;
                var20[1] = var40;
                var20[5] = var22[3];
            } else if (arg6 == 7) {
                var20 = new int[6];
                int var31 = class341.method2349(arg4, arg3, arg8, arg2, (int[][]) null, true, 0, 0.0F, arg12, arg5, var19, 128, arg1, arg7, var16, -1, var18, var17);
                int var32 = class341.method2349(arg4, arg3, arg8, arg2, (int[][]) null, true, 128, 0.0F, arg12, arg5, var19, 0, arg1, arg7, var16, arg10 + 1968038263, var18, var17);
                var20[0] = var22[1];
                var20[3] = var31;
                var20[1] = var32;
                var20[5] = var22[1];
                var20[2] = var31;
                var20[4] = var22[2];
            } else if (arg6 == 8) {
                int var33 = class341.method2349(arg4, arg3, arg8, arg2, (int[][]) null, true, 0, 0.0F, arg12, arg5, var19, 0, arg1, arg7, var16, -1, var18, var17);
                var20 = new int[] { var22[3], var33, var22[4] };
            } else if (arg6 == 9) {
                var20 = new int[15];
                int var37 = class341.method2349(arg4, arg3, arg8, arg2, (int[][]) null, true, 128, 0.0F, arg12, arg5, var19, 64, arg1, arg7, var16, -1, var18, var17);
                int var38 = class341.method2349(arg4, arg3, arg8, arg2, (int[][]) null, true, 96, 0.0F, arg12, arg5, var19, 32, arg1, arg7, var16, -1, var18, var17);
                int var39 = class341.method2349(arg4, arg3, arg8, arg2, (int[][]) null, true, 64, 0.0F, arg12, arg5, var19, 0, arg1, arg7, var16, -1, var18, var17);
                var20[1] = var37;
                var20[3] = var38;
                var20[0] = var38;
                var20[11] = var22[1];
                var20[14] = var39;
                var20[13] = var22[1];
                var20[6] = var38;
                var20[9] = var38;
                var20[5] = var22[3];
                var20[7] = var22[3];
                var20[12] = var38;
                var20[2] = var22[4];
                var20[8] = var22[2];
                var20[4] = var22[4];
                var20[10] = var22[2];
            } else if (arg6 == 10) {
                int var34 = class341.method2349(arg4, arg3, arg8, arg2, (int[][]) null, true, 0, 0.0F, arg12, arg5, var19, 128, arg1, arg7, var16, -1, var18, var17);
                var20 = new int[] { var22[2], var34, var22[3], var22[3], var34, var22[4], var22[4], var34, var22[0] };
            } else if (arg6 == 11) {
                int var35 = class341.method2349(arg4, arg3, arg8, arg2, (int[][]) null, true, 0, 0.0F, arg12, arg5, var19, 64, arg1, arg7, var16, -1, var18, var17);
                var20 = new int[12];
                int var36 = class341.method2349(arg4, arg3, arg8, arg2, (int[][]) null, true, 128, 0.0F, arg12, arg5, var19, 64, arg1, arg7, var16, arg10 ^ 0x754DE177, var18, var17);
                var20[0] = var22[3];
                var20[7] = var36;
                var20[2] = var22[0];
                var20[3] = var22[3];
                var20[6] = var22[2];
                var20[4] = var22[2];
                var20[5] = var35;
                var20[8] = var35;
                var20[9] = var22[2];
                var20[11] = var36;
                var20[1] = var35;
                var20[10] = var22[1];
            }
        }
        arg5.method615(arg14, arg8, arg12, var22, var20, false);
    }
}
