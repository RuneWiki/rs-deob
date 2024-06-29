import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class17 {

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "[F")
    private static float[] field194 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field192 = 0;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "[Llg;")
    public static class115[] field198 = new class115[255];

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "[I")
    private static int[] field193 = new int[4];

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "[Z")
    private static boolean[] field202 = new boolean[4];

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "[I")
    private static int[] field206 = new int[4];

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "[Z")
    private static boolean[] field207 = new boolean[4];

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    private static int field195;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    private static int field196;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    private static int field197;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    private static int field199;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    private static int field200;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    private static int field201;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    private static int field204;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    private static int field205;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "[[[I")
    private static int[][][] field203;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "()V", line = 7)
    public static void method91() {
        field198 = null;
        field203 = (int[][][]) null;
        field193 = null;
        field202 = null;
        field194 = null;
        field206 = null;
        field207 = null;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "()V", line = 16)
    public static final void method92() {
        field192 = 0;
        for (int var0 = 0; var0 < field201; var0++) {
            for (int var1 = 0; var1 < field195; var1++) {
                for (int var2 = 0; var2 < field204; var2++) {
                    field203[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIII)V", line = 44)
    public static final void method93(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class44.field601) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field193[var5] != -1) {
                int var6 = field203[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field193[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field203[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field193[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field193[var5] = -1;
            method99(var5);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V", line = 90)
    public static final void method94(int arg0, int arg1, int arg2) {
        field201 = arg0;
        field195 = arg1;
        field204 = arg2;
        field203 = new int[field201][field195][field204];
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II[[[Lrd;)V", line = 97)
    public static final void method95(int arg0, int arg1, class160[][][] arg2) {
        if (!class44.field601) {
            return;
        }
        GL var3 = class167.field2806;
        class284.method1954(0, (byte) -128, 0);
        class167.method1047(0);
        class167.method1034();
        class167.method1033(class167.field2781);
        var3.glDepthMask(false);
        class167.method1044(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label58: for (int var4 = 0; var4 < field192; var4++) {
            class115 var5 = field198[var4];
            if (var5.field1943 != null) {
                int var6 = 0;
                int var7 = (var5.field1947 >> 7) - var5.field1929;
                int var8 = (var5.field1947 >> 7) + var5.field1929;
                if (var8 >= class88.field1482) {
                    var8 = class88.field1482 - 1;
                }
                if (var7 < class124.field2062) {
                    var6 += class124.field2062 - var7;
                    var7 = class124.field2062;
                }
                for (int var9 = var7; var9 <= var8; var9++) {
                    short var10 = var5.field1924[var6++];
                    int var11 = (var10 >> 8) + ((var5.field1936 >> 7) - var5.field1929);
                    int var12 = (var10 & 0xFF) + var11 - 1;
                    if (var11 < class90.field1518) {
                        var11 = class90.field1518;
                    }
                    if (var12 >= class309.field5288) {
                        var12 = class309.field5288 - 1;
                    }
                    for (int var13 = var11; var13 <= var12; var13++) {
                        class160 var14 = arg2[var5.field1944][var13][var9];
                        if (var14 != null && var14.field2633) {
                            class167.method1058(201.5F - (float) var5.field1944 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field1939 }, 0);
                            var5.field1943.method1234();
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
        var3.glFogfv(2918, class59.field814, 0);
        var3.glEnableClientState(32888);
        class167.method1043();
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIII)V", line = 191)
    public static final void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class44.field601 || field196 == arg3 && field205 == arg4 && field197 == arg5 && field200 == arg6 && field199 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field207[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field203[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field206[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field193[var16] == var14) {
                                    if (!field207[var16]) {
                                        field207[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field206[var10++] = var14;
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
                if (!field207[var18]) {
                    field193[var18] = field206[var17];
                    field207[var18] = true;
                    method103(var18, field198[field206[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field207[var19]) {
                field193[var19] = -1;
                method99(var19);
            }
        }
        field196 = arg3;
        field205 = arg4;
        field197 = arg5;
        field200 = arg6;
        field199 = arg7;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIII)V", line = 320)
    public static final void method97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class44.field601) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method100(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field195 - 1) {
            method100(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method100(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field204 - 1) {
            method100(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field204 - 1) {
            method100(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field195 - 1 && arg6 < field204 - 1) {
            method100(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method100(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field195 - 1 && arg6 > 0) {
            method100(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "()V", line = 381)
    public static final void method98() {
        for (int var0 = 0; var0 < field192; var0++) {
            class115 var1 = field198[var0];
            int var2 = var1.field1944;
            if (var1.field1934) {
                var2 = 0;
            }
            int var3 = var1.field1944;
            if (var1.field1941) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field1947 >> 7) - var1.field1929;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field1947 >> 7) + var1.field1929;
                if (var7 > field204 - 1) {
                    var7 = field204 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field1924[var5++];
                    int var10 = (var9 >> 8) + ((var1.field1936 >> 7) - var1.field1929);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field195 - 1) {
                        var11 = field195 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field203[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field203[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field203[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field203[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field203[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 487)
    private static final void method99(int arg0) {
        if (field202[arg0]) {
            field202[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class167.field2806;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIII)V", line = 502)
    public static final void method100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class44.field601 || field196 == arg3 && field205 == arg4 && field197 == arg5 && field200 == arg4 && field199 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field207[var6] = false;
        }
        int var7 = 0;
        int var8 = field203[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field193[var10] == var9) {
                        field207[var10] = true;
                        continue label72;
                    }
                }
                field206[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field207[var12]) {
                        field193[var12] = field206[var11];
                        field207[var12] = true;
                        method103(var12, field198[field206[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field207[var13]) {
                    field193[var13] = -1;
                    method99(var13);
                }
            }
            field196 = arg3;
            field205 = arg4;
            field197 = arg5;
            field200 = arg4;
            field199 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "()V", line = 591)
    public static final void method101() {
        for (int var0 = 0; var0 < 4; var0++) {
            field193[var0] = -1;
            method99(var0);
        }
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "()V", line = 602)
    public static final void method102() {
        GL var0 = class167.field2806;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILlg;III)V", line = 619)
    private static final void method103(int arg0, class115 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class167.field2806;
        if (!field202[arg0]) {
            var6.glEnable(var5);
            field202[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field1938);
        var6.glLightfv(var5, 4609, arg1.field1925, 0);
        field194[0] = (float) (arg1.field1936 - arg2);
        field194[1] = (float) (arg1.field1923 - arg3);
        field194[2] = (float) (arg1.field1947 - arg4);
        var6.glLightfv(var5, 4611, field194, 0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Llg;)V", line = 636)
    public static final void method104(class115 arg0) {
        if (field192 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field198[field192++] = arg0;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZ)V", line = 653)
    public static final void method105(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field192; var2++) {
            field198[var2].method744(true, arg0, arg1);
        }
        field196 = -1;
        field205 = -1;
        field197 = -1;
        field200 = -1;
        field199 = -1;
    }
}
