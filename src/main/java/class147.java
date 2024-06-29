import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class147 {

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field2321 = 0;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "[F")
    private static float[] field2322 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    private static int field2317;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    private static int field2318;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    private static int field2319;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    private static int field2320;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    private static int field2323;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    private static int field2324;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    private static int field2325;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    private static int field2328;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "[I")
    private static int[] field2327;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "[I")
    private static int[] field2329;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "[Lwi;")
    public static class310[] field2326;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "[Z")
    private static boolean[] field2314;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "[Z")
    private static boolean[] field2315;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "[[[I")
    private static int[][][] field2316;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method1024(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class192.field2903) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1035(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field2323 - 1) {
            method1035(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1035(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field2319 - 1) {
            method1035(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field2319 - 1) {
            method1035(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field2323 - 1 && arg6 < field2319 - 1) {
            method1035(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1035(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field2323 - 1 && arg6 > 0) {
            method1035(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "()V", line = 59)
    public static final void method1025() {
        field2326 = null;
        field2329 = null;
        field2314 = null;
        field2327 = null;
        field2315 = null;
        field2316 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[[[Lsa;)V", line = 67)
    public static final void method1026(int arg0, int arg1, class174[][][] arg2) {
        if (!class192.field2903) {
            return;
        }
        GL var3 = class333.field5160;
        class174.method1179(0, 0, (byte) 76);
        class333.method2306(0);
        class333.method2300();
        class333.method2282(class333.field5161);
        var3.glDepthMask(false);
        class333.method2308(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field2321; var4++) {
            class310 var5 = field2326[var4];
            int var6 = var5.field4915;
            if (var5.field4908) {
                var6--;
            }
            if (var5.field4892 != null) {
                int var7 = 0;
                int var8 = (var5.field4913 >> 7) - var5.field4893;
                int var9 = (var5.field4913 >> 7) + var5.field4893;
                if (var9 >= class272.field4184) {
                    var9 = class272.field4184 - 1;
                }
                if (var8 < class96.field1468) {
                    var7 += class96.field1468 - var8;
                    var8 = class96.field1468;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field4902[var7++];
                    int var12 = (var11 >> 8) + ((var5.field4925 >> 7) - var5.field4893);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class43.field607) {
                        var12 = class43.field607;
                    }
                    if (var13 >= class194.field2929) {
                        var13 = class194.field2929 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class174 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field2663) {
                            class333.method2305(201.5F - (float) var5.field4915 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field4903 }, 0);
                            var5.field4892.method232();
                            continue label72;
                        }
                    }
                }
            }
        }
        var3.glTexEnvi(8960, 34176, 5890);
        var3.glTexEnvi(8960, 34192, 768);
        var3.glBlendFunc(770, 771);
        var3.glDepthMask(true);
        var3.glFogfv(2918, class326.field5065, 0);
        var3.glEnableClientState(32888);
        class333.method2309();
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "()V", line = 174)
    public static final void method1027() {
        for (int var0 = 0; var0 < 4; var0++) {
            field2329[var0] = -1;
            method1032(var0);
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "()V", line = 187)
    public static final void method1028() {
        field2321 = 0;
        for (int var0 = 0; var0 < field2318; var0++) {
            for (int var1 = 0; var1 < field2323; var1++) {
                for (int var2 = 0; var2 < field2319; var2++) {
                    field2316[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "()V", line = 218)
    public static final void method1029() {
        for (int var0 = 0; var0 < field2321; var0++) {
            class310 var1 = field2326[var0];
            int var2 = var1.field4915;
            if (var1.field4914) {
                var2 = 0;
            }
            int var3 = var1.field4915;
            if (var1.field4911) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field4913 >> 7) - var1.field4893;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field4913 >> 7) + var1.field4893;
                if (var7 > field2319 - 1) {
                    var7 = field2319 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field4902[var5++];
                    int var10 = (var9 >> 8) + ((var1.field4925 >> 7) - var1.field4893);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field2323 - 1) {
                        var11 = field2323 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field2316[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field2316[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field2316[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field2316[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field2316[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIII)V", line = 310)
    public static final void method1030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class192.field2903 || field2324 == arg3 && field2328 == arg4 && field2317 == arg5 && field2320 == arg6 && field2325 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field2315[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field2316[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field2327[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field2329[var16] == var14) {
                                    if (!field2315[var16]) {
                                        field2315[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field2327[var10++] = var14;
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
                if (!field2315[var18]) {
                    field2329[var18] = field2327[var17];
                    field2315[var18] = true;
                    method1037(var18, field2326[field2327[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field2315[var19]) {
                field2329[var19] = -1;
                method1032(var19);
            }
        }
        field2324 = arg3;
        field2328 = arg4;
        field2317 = arg5;
        field2320 = arg6;
        field2325 = arg7;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V", line = 440)
    public static final void method1031(int arg0, int arg1, int arg2) {
        field2318 = arg0;
        field2323 = arg1;
        field2319 = arg2;
        field2316 = new int[field2318][field2323][field2319];
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 448)
    private static final void method1032(int arg0) {
        if (field2314[arg0]) {
            field2314[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class333.field5160;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)V", line = 461)
    public static final void method1033(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field2321; var2++) {
            field2326[var2].method2131(arg1, arg0, 16746135);
        }
        field2324 = -1;
        field2328 = -1;
        field2317 = -1;
        field2320 = -1;
        field2325 = -1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)V", line = 478)
    public static final void method1034(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class192.field2903) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field2329[var5] != -1) {
                int var6 = field2316[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field2329[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field2316[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field2329[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field2329[var5] = -1;
            method1032(var5);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIII)V", line = 523)
    public static final void method1035(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class192.field2903 || field2324 == arg3 && field2328 == arg4 && field2317 == arg5 && field2320 == arg4 && field2325 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field2315[var6] = false;
        }
        int var7 = 0;
        int var8 = field2316[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field2329[var10] == var9) {
                        field2315[var10] = true;
                        continue label72;
                    }
                }
                field2327[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field2315[var12]) {
                        field2329[var12] = field2327[var11];
                        field2315[var12] = true;
                        method1037(var12, field2326[field2327[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field2315[var13]) {
                    field2329[var13] = -1;
                    method1032(var13);
                }
            }
            field2324 = arg3;
            field2328 = arg4;
            field2317 = arg5;
            field2320 = arg4;
            field2325 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "()V", line = 614)
    public static final void method1036() {
        GL var0 = class333.field5160;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field2329[var3] = -1;
            method1032(var3);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILwi;III)V", line = 642)
    private static final void method1037(int arg0, class310 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class333.field5160;
        if (!field2314[arg0]) {
            var6.glEnable(var5);
            field2314[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field4898);
        var6.glLightfv(var5, 4609, arg1.field4921, 0);
        field2322[0] = (float) (arg1.field4925 - arg2);
        field2322[1] = (float) (arg1.field4906 - arg3);
        field2322[2] = (float) (arg1.field4913 - arg4);
        var6.glLightfv(var5, 4611, field2322, 0);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lwi;)V", line = 661)
    public static final void method1038(class310 arg0) {
        if (field2321 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field2326[field2321++] = arg0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "()V", line = 672)
    public static void method1039() {
        field2326 = null;
        field2316 = (int[][][]) null;
        field2329 = null;
        field2314 = null;
        field2322 = null;
        field2327 = null;
        field2315 = null;
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "()V", line = 682)
    public static final void method1040() {
        field2326 = new class310[255];
        field2329 = new int[4];
        field2314 = new boolean[4];
        field2327 = new int[4];
        field2315 = new boolean[4];
        field2316 = new int[field2318][field2323][field2319];
    }
}
