import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class177 {

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field3014 = 0;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "[F")
    private static float[] field3020 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    private static int field3015;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    private static int field3018;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    private static int field3021;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    private static int field3022;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    private static int field3023;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    private static int field3024;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    private static int field3026;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    private static int field3027;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "[I")
    private static int[] field3025;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "[I")
    private static int[] field3028;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "[Lgj;")
    public static class220[] field3019;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "[Z")
    private static boolean[] field3016;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "[Z")
    private static boolean[] field3029;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "[[[I")
    private static int[][][] field3017;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()V", line = 5)
    public static final void method1237() {
        GL var0 = class123.field2212;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        field3019 = new class220[255];
        field3028 = new int[4];
        field3029 = new boolean[4];
        field3025 = new int[4];
        field3016 = new boolean[4];
        field3017 = new int[field3027][field3015][field3021];
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIII)V", line = 30)
    public static final void method1238(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class274.field4701) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field3028[var5] != -1) {
                int var6 = field3017[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field3028[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field3017[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field3028[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field3028[var5] = -1;
            method1250(var5);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lgj;)V", line = 79)
    public static final void method1239(class220 arg0) {
        if (field3014 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field3019[field3014++] = arg0;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIII)V", line = 96)
    public static final void method1240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class274.field4701 || field3024 == arg3 && field3026 == arg4 && field3023 == arg5 && field3018 == arg4 && field3022 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field3016[var6] = false;
        }
        int var7 = 0;
        int var8 = field3017[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field3028[var10] == var9) {
                        field3016[var10] = true;
                        continue label72;
                    }
                }
                field3025[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field3016[var12]) {
                        field3028[var12] = field3025[var11];
                        field3016[var12] = true;
                        method1247(var12, field3019[field3025[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field3016[var13]) {
                    field3028[var13] = -1;
                    method1250(var13);
                }
            }
            field3024 = arg3;
            field3026 = arg4;
            field3023 = arg5;
            field3018 = arg4;
            field3022 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "()V", line = 185)
    public static final void method1241() {
        for (int var0 = 0; var0 < field3014; var0++) {
            class220 var1 = field3019[var0];
            int var2 = var1.field3717;
            if (var1.field3720) {
                var2 = 0;
            }
            int var3 = var1.field3717;
            if (var1.field3738) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field3734 >> 7) - var1.field3716;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field3734 >> 7) + var1.field3716;
                if (var7 > field3021 - 1) {
                    var7 = field3021 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field3728[var5++];
                    int var10 = (var9 >> 8) + ((var1.field3730 >> 7) - var1.field3716);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field3015 - 1) {
                        var11 = field3015 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field3017[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field3017[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field3017[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field3017[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field3017[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "()V", line = 276)
    public static final void method1242() {
        for (int var0 = 0; var0 < 4; var0++) {
            field3028[var0] = -1;
            method1250(var0);
        }
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "()V", line = 287)
    public static void method1243() {
        field3019 = null;
        field3017 = (int[][][]) null;
        field3028 = null;
        field3029 = null;
        field3020 = null;
        field3025 = null;
        field3016 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZ)V", line = 300)
    public static final void method1244(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field3014; var2++) {
            field3019[var2].method1567(arg1, 2048, arg0);
        }
        field3024 = -1;
        field3026 = -1;
        field3023 = -1;
        field3018 = -1;
        field3022 = -1;
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "()V", line = 314)
    public static final void method1245() {
        field3014 = 0;
        for (int var0 = 0; var0 < field3027; var0++) {
            for (int var1 = 0; var1 < field3015; var1++) {
                for (int var2 = 0; var2 < field3021; var2++) {
                    field3017[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II[[[Lbd;)V", line = 342)
    public static final void method1246(int arg0, int arg1, class295[][][] arg2) {
        if (!class274.field4701) {
            return;
        }
        GL var3 = class123.field2212;
        class125.method908(0, -5, 0);
        class123.method894(0);
        class123.method885();
        class123.method867(class123.field2232);
        var3.glDepthMask(false);
        class123.method864(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label58: for (int var4 = 0; var4 < field3014; var4++) {
            class220 var5 = field3019[var4];
            if (var5.field3721 != null) {
                int var6 = 0;
                int var7 = (var5.field3734 >> 7) - var5.field3716;
                int var8 = (var5.field3734 >> 7) + var5.field3716;
                if (var8 >= class265.field4550) {
                    var8 = class265.field4550 - 1;
                }
                if (var7 < class246.field4290) {
                    var6 += class246.field4290 - var7;
                    var7 = class246.field4290;
                }
                for (int var9 = var7; var9 <= var8; var9++) {
                    short var10 = var5.field3728[var6++];
                    int var11 = (var10 >> 8) + ((var5.field3730 >> 7) - var5.field3716);
                    int var12 = (var10 & 0xFF) + var11 - 1;
                    if (var11 < class69.field1323) {
                        var11 = class69.field1323;
                    }
                    if (var12 >= class278.field4797) {
                        var12 = class278.field4797 - 1;
                    }
                    for (int var13 = var11; var13 <= var12; var13++) {
                        class295 var14 = arg2[var5.field3717][var13][var9];
                        if (var14 != null && var14.field5096) {
                            class123.method875(201.5F - (float) var5.field3717 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field3739 }, 0);
                            var5.field3721.method825();
                            continue label58;
                        }
                    }
                }
            }
        }
        var3.glTexEnvi(8960, 34176, 5890);
        var3.glTexEnvi(8960, 34192, 768);
        var3.glBlendFunc(770, 771);
        var3.glDepthMask(true);
        var3.glFogfv(2918, class52.field839, 0);
        var3.glEnableClientState(32888);
        class123.method888();
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILgj;III)V", line = 442)
    private static final void method1247(int arg0, class220 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class123.field2212;
        if (!field3029[arg0]) {
            var6.glEnable(var5);
            field3029[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field3722);
        var6.glLightfv(var5, 4609, arg1.field3733, 0);
        field3020[0] = (float) (arg1.field3730 - arg2);
        field3020[1] = (float) (arg1.field3744 - arg3);
        field3020[2] = (float) (arg1.field3734 - arg4);
        var6.glLightfv(var5, 4611, field3020, 0);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIII)V", line = 461)
    public static final void method1248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class274.field4701 || field3024 == arg3 && field3026 == arg4 && field3023 == arg5 && field3018 == arg6 && field3022 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field3016[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field3017[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field3025[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field3028[var16] == var14) {
                                    if (!field3016[var16]) {
                                        field3016[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field3025[var10++] = var14;
                            var9++;
                            if (var9 == 4) {
                                break label112;
                            }
                        }
                    }
                }
            }
        }
        for (int var17 = 0; var17 < var10; var17++) {
            for (int var18 = 0; var18 < 4; var18++) {
                if (!field3016[var18]) {
                    field3028[var18] = field3025[var17];
                    field3016[var18] = true;
                    method1247(var18, field3019[field3025[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field3016[var19]) {
                field3028[var19] = -1;
                method1250(var19);
            }
        }
        field3024 = arg3;
        field3026 = arg4;
        field3023 = arg5;
        field3018 = arg6;
        field3022 = arg7;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V", line = 590)
    public static final void method1249(int arg0, int arg1, int arg2) {
        field3027 = arg0;
        field3015 = arg1;
        field3021 = arg2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 597)
    private static final void method1250(int arg0) {
        if (field3029[arg0]) {
            field3029[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class123.field2212;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIII)V", line = 608)
    public static final void method1251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class274.field4701) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1240(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field3015 - 1) {
            method1240(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1240(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field3021 - 1) {
            method1240(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field3021 - 1) {
            method1240(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field3015 - 1 && arg6 < field3021 - 1) {
            method1240(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1240(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field3015 - 1 && arg6 > 0) {
            method1240(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "()V", line = 661)
    public static final void method1252() {
        field3019 = null;
        field3028 = null;
        field3029 = null;
        field3025 = null;
        field3016 = null;
        field3017 = (int[][][]) null;
    }
}
