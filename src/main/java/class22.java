import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class22 {

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field243 = 0;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "[F")
    private static float[] field251 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    private static int field236;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    private static int field237;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    private static int field239;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    private static int field240;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    private static int field244;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    private static int field246;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    private static int field248;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    private static int field249;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "[I")
    private static int[] field245;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "[I")
    private static int[] field250;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "[Lem;")
    public static class339[] field238;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "[Z")
    private static boolean[] field242;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "[Z")
    private static boolean[] field247;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "[[[I")
    private static int[][][] field241;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V", line = 4)
    public static final void method134(int arg0, int arg1, int arg2) {
        field246 = arg0;
        field236 = arg1;
        field237 = arg2;
        field241 = new int[field246][field236][field237];
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()V", line = 10)
    public static final void method135() {
        field243 = 0;
        for (int var0 = 0; var0 < field246; var0++) {
            for (int var1 = 0; var1 < field236; var1++) {
                for (int var2 = 0; var2 < field237; var2++) {
                    field241[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)V", line = 45)
    public static final void method136(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field243; var2++) {
            field238[var2].method2359(arg1, true, arg0);
        }
        field239 = -1;
        field244 = -1;
        field249 = -1;
        field240 = -1;
        field248 = -1;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "()V", line = 62)
    public static final void method137() {
        for (int var0 = 0; var0 < 4; var0++) {
            field245[var0] = -1;
            method149(var0);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lem;)V", line = 72)
    public static final void method138(class339 arg0) {
        if (field243 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field238[field243++] = arg0;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIII)V", line = 83)
    public static final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class67.field856 || field239 == arg3 && field244 == arg4 && field249 == arg5 && field240 == arg4 && field248 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field242[var6] = false;
        }
        int var7 = 0;
        int var8 = field241[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field245[var10] == var9) {
                        field242[var10] = true;
                        continue label72;
                    }
                }
                field250[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field242[var12]) {
                        field245[var12] = field250[var11];
                        field242[var12] = true;
                        method150(var12, field238[field250[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field242[var13]) {
                    field245[var13] = -1;
                    method149(var13);
                }
            }
            field239 = arg3;
            field244 = arg4;
            field249 = arg5;
            field240 = arg4;
            field248 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIII)V", line = 173)
    public static final void method140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class67.field856 || field239 == arg3 && field244 == arg4 && field249 == arg5 && field240 == arg6 && field248 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field242[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field241[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field250[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field245[var16] == var14) {
                                    if (!field242[var16]) {
                                        field242[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field250[var10++] = var14;
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
                if (!field242[var18]) {
                    field245[var18] = field250[var17];
                    field242[var18] = true;
                    method150(var18, field238[field250[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field242[var19]) {
                field245[var19] = -1;
                method149(var19);
            }
        }
        field239 = arg3;
        field244 = arg4;
        field249 = arg5;
        field240 = arg6;
        field248 = arg7;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II[[[Lnh;)V", line = 302)
    public static final void method141(int arg0, int arg1, class119[][][] arg2) {
        if (!class67.field856) {
            return;
        }
        GL var3 = class47.field592;
        class255.method1781(0, 0, -86);
        class47.method354(0);
        class47.method352();
        class47.method357(class47.field590);
        var3.glDepthMask(false);
        class47.method367(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field243; var4++) {
            class339 var5 = field238[var4];
            int var6 = var5.field5293;
            if (var5.field5295) {
                var6--;
            }
            if (var5.field5289 != null) {
                int var7 = 0;
                int var8 = (var5.field5282 >> 7) - var5.field5278;
                int var9 = (var5.field5282 >> 7) + var5.field5278;
                if (var9 >= class3.field20) {
                    var9 = class3.field20 - 1;
                }
                if (var8 < class16.field202) {
                    var7 += class16.field202 - var8;
                    var8 = class16.field202;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field5281[var7++];
                    int var12 = (var11 >> 8) + ((var5.field5309 >> 7) - var5.field5278);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class64.field800) {
                        var12 = class64.field800;
                    }
                    if (var13 >= class175.field2404) {
                        var13 = class175.field2404 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class119 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field1574) {
                            class47.method370(201.5F - (float) var5.field5293 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field5306 }, 0);
                            var5.field5289.method462();
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
        var3.glFogfv(2918, class41.field512, 0);
        var3.glEnableClientState(32888);
        class47.method375();
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V", line = 404)
    public static final void method142(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class67.field856) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field245[var5] != -1) {
                int var6 = field241[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field245[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field241[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field245[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field245[var5] = -1;
            method149(var5);
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "()V", line = 448)
    public static final void method143() {
        GL var0 = class47.field592;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field245[var3] = -1;
            method149(var3);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)V", line = 475)
    public static final void method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class67.field856) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method139(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field236 - 1) {
            method139(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method139(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field237 - 1) {
            method139(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field237 - 1) {
            method139(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field236 - 1 && arg6 < field237 - 1) {
            method139(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method139(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field236 - 1 && arg6 > 0) {
            method139(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "()V", line = 530)
    public static final void method145() {
        field238 = new class339[255];
        field245 = new int[4];
        field247 = new boolean[4];
        field250 = new int[4];
        field242 = new boolean[4];
        field241 = new int[field246][field236][field237];
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "()V", line = 538)
    public static void method146() {
        field238 = null;
        field241 = (int[][][]) null;
        field245 = null;
        field247 = null;
        field251 = null;
        field250 = null;
        field242 = null;
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "()V", line = 550)
    public static final void method147() {
        for (int var0 = 0; var0 < field243; var0++) {
            class339 var1 = field238[var0];
            int var2 = var1.field5293;
            if (var1.field5280) {
                var2 = 0;
            }
            int var3 = var1.field5293;
            if (var1.field5291) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field5282 >> 7) - var1.field5278;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field5282 >> 7) + var1.field5278;
                if (var7 > field237 - 1) {
                    var7 = field237 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field5281[var5++];
                    int var10 = (var9 >> 8) + ((var1.field5309 >> 7) - var1.field5278);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field236 - 1) {
                        var11 = field236 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field241[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field241[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field241[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field241[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field241[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "()V", line = 638)
    public static final void method148() {
        field238 = null;
        field245 = null;
        field247 = null;
        field250 = null;
        field242 = null;
        field241 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 646)
    private static final void method149(int arg0) {
        if (field247[arg0]) {
            field247[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class47.field592;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILem;III)V", line = 664)
    private static final void method150(int arg0, class339 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class47.field592;
        if (!field247[arg0]) {
            var6.glEnable(var5);
            field247[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field5297);
        var6.glLightfv(var5, 4609, arg1.field5286, 0);
        field251[0] = (float) (arg1.field5309 - arg2);
        field251[1] = (float) (arg1.field5284 - arg3);
        field251[2] = (float) (arg1.field5282 - arg4);
        var6.glLightfv(var5, 4611, field251, 0);
    }
}
