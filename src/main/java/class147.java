import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class147 {

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field2036 = 0;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "[F")
    private static float[] field2035 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    private static int field2023;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    private static int field2024;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    private static int field2026;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    private static int field2027;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    private static int field2030;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    private static int field2032;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    private static int field2033;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    private static int field2038;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "[I")
    private static int[] field2025;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "[I")
    private static int[] field2028;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "[Lre;")
    public static class270[] field2037;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "[Z")
    private static boolean[] field2029;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "[Z")
    private static boolean[] field2031;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "[[[I")
    private static int[][][] field2034;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII)V", line = 7)
    public static final void method1055(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class314.field4736) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field2025[var5] != -1) {
                int var6 = field2034[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field2025[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field2034[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field2025[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field2025[var5] = -1;
            method1063(var5);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V", line = 50)
    public static final void method1056(int arg0, int arg1, int arg2) {
        field2032 = arg0;
        field2024 = arg1;
        field2030 = arg2;
        field2034 = new int[field2032][field2024][field2030];
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()V", line = 59)
    public static final void method1057() {
        field2036 = 0;
        for (int var0 = 0; var0 < field2032; var0++) {
            for (int var1 = 0; var1 < field2024; var1++) {
                for (int var2 = 0; var2 < field2030; var2++) {
                    field2034[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIII)V", line = 91)
    public static final void method1058(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class314.field4736 || field2033 == arg3 && field2038 == arg4 && field2027 == arg5 && field2023 == arg4 && field2026 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field2029[var6] = false;
        }
        int var7 = 0;
        int var8 = field2034[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field2025[var10] == var9) {
                        field2029[var10] = true;
                        continue label72;
                    }
                }
                field2028[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field2029[var12]) {
                        field2025[var12] = field2028[var11];
                        field2029[var12] = true;
                        method1062(var12, field2037[field2028[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field2029[var13]) {
                    field2025[var13] = -1;
                    method1063(var13);
                }
            }
            field2033 = arg3;
            field2038 = arg4;
            field2027 = arg5;
            field2023 = arg4;
            field2026 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "()V", line = 182)
    public static final void method1059() {
        GL var0 = class67.field899;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field2025[var3] = -1;
            method1063(var3);
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "()V", line = 211)
    public static final void method1060() {
        for (int var0 = 0; var0 < 4; var0++) {
            field2025[var0] = -1;
            method1063(var0);
        }
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "()V", line = 221)
    public static void method1061() {
        field2037 = null;
        field2034 = (int[][][]) null;
        field2025 = null;
        field2031 = null;
        field2035 = null;
        field2028 = null;
        field2029 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILre;III)V", line = 231)
    private static final void method1062(int arg0, class270 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class67.field899;
        if (!field2031[arg0]) {
            var6.glEnable(var5);
            field2031[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field4021);
        var6.glLightfv(var5, 4609, arg1.field4022, 0);
        field2035[0] = (float) (arg1.field4025 - arg2);
        field2035[1] = (float) (arg1.field4000 - arg3);
        field2035[2] = (float) (arg1.field4008 - arg4);
        var6.glLightfv(var5, 4611, field2035, 0);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 248)
    private static final void method1063(int arg0) {
        if (field2031[arg0]) {
            field2031[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class67.field899;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "()V", line = 261)
    public static final void method1064() {
        for (int var0 = 0; var0 < field2036; var0++) {
            class270 var1 = field2037[var0];
            int var2 = var1.field4010;
            if (var1.field4024) {
                var2 = 0;
            }
            int var3 = var1.field4010;
            if (var1.field4001) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field4008 >> 7) - var1.field4026;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field4008 >> 7) + var1.field4026;
                if (var7 > field2030 - 1) {
                    var7 = field2030 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field4017[var5++];
                    int var10 = (var9 >> 8) + ((var1.field4025 >> 7) - var1.field4026);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field2024 - 1) {
                        var11 = field2024 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field2034[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field2034[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field2034[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field2034[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field2034[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)V", line = 351)
    public static final void method1065(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field2036; var2++) {
            field2037[var2].method1858(arg0, arg1, -21587);
        }
        field2033 = -1;
        field2038 = -1;
        field2027 = -1;
        field2023 = -1;
        field2026 = -1;
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "()V", line = 365)
    public static final void method1066() {
        field2037 = new class270[255];
        field2025 = new int[4];
        field2031 = new boolean[4];
        field2028 = new int[4];
        field2029 = new boolean[4];
        field2034 = new int[field2032][field2024][field2030];
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIII)V", line = 374)
    public static final void method1067(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class314.field4736 || field2033 == arg3 && field2038 == arg4 && field2027 == arg5 && field2023 == arg6 && field2026 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field2029[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field2034[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field2028[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field2025[var16] == var14) {
                                    if (!field2029[var16]) {
                                        field2029[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field2028[var10++] = var14;
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
                if (!field2029[var18]) {
                    field2025[var18] = field2028[var17];
                    field2029[var18] = true;
                    method1062(var18, field2037[field2028[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field2029[var19]) {
                field2025[var19] = -1;
                method1063(var19);
            }
        }
        field2033 = arg3;
        field2038 = arg4;
        field2027 = arg5;
        field2023 = arg6;
        field2026 = arg7;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIII)V", line = 504)
    public static final void method1068(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class314.field4736) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1058(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field2024 - 1) {
            method1058(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1058(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field2030 - 1) {
            method1058(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field2030 - 1) {
            method1058(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field2024 - 1 && arg6 < field2030 - 1) {
            method1058(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1058(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field2024 - 1 && arg6 > 0) {
            method1058(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[[[Lpi;)V", line = 558)
    public static final void method1069(int arg0, int arg1, class202[][][] arg2) {
        if (!class314.field4736) {
            return;
        }
        GL var3 = class67.field899;
        class123.method884(0, 0, 126);
        class67.method489(0);
        class67.method477();
        class67.method479(class67.field876);
        var3.glDepthMask(false);
        class67.method460(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field2036; var4++) {
            class270 var5 = field2037[var4];
            int var6 = var5.field4010;
            if (var5.field4029) {
                var6--;
            }
            if (var5.field4006 != null) {
                int var7 = 0;
                int var8 = (var5.field4008 >> 7) - var5.field4026;
                int var9 = (var5.field4008 >> 7) + var5.field4026;
                if (var9 >= class230.field3254) {
                    var9 = class230.field3254 - 1;
                }
                if (var8 < class161.field2213) {
                    var7 += class161.field2213 - var8;
                    var8 = class161.field2213;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field4017[var7++];
                    int var12 = (var11 >> 8) + ((var5.field4025 >> 7) - var5.field4026);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class110.field1484) {
                        var12 = class110.field1484;
                    }
                    if (var13 >= class316.field4758) {
                        var13 = class316.field4758 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class202 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field2870) {
                            class67.method488(201.5F - (float) var5.field4010 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field4013 }, 0);
                            var5.field4006.method1608();
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
        var3.glFogfv(2918, class139.field1908, 0);
        var3.glEnableClientState(32888);
        class67.method483();
    }

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "()V", line = 660)
    public static final void method1070() {
        field2037 = null;
        field2025 = null;
        field2031 = null;
        field2028 = null;
        field2029 = null;
        field2034 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lre;)V", line = 669)
    public static final void method1071(class270 arg0) {
        if (field2036 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field2037[field2036++] = arg0;
        }
    }
}
