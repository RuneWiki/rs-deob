import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class179 {

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    public static int field2896 = 0;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "[F")
    private static float[] field2901 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    private static int field2892;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    private static int field2894;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    private static int field2895;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    private static int field2897;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    private static int field2898;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "I")
    private static int field2899;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "I")
    private static int field2900;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    private static int field2903;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "[I")
    private static int[] field2890;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "[I")
    private static int[] field2902;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "[Lwa;")
    public static class297[] field2889;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "[Z")
    private static boolean[] field2893;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "[Z")
    private static boolean[] field2904;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "[[[I")
    private static int[][][] field2891;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIII)V", line = 10)
    public static final void method1269(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class66.field1006) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field2902[var5] != -1) {
                int var6 = field2891[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field2902[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field2891[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field2902[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field2902[var5] = -1;
            method1276(var5);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "()V", line = 54)
    public static final void method1270() {
        field2896 = 0;
        for (int var0 = 0; var0 < field2899; var0++) {
            for (int var1 = 0; var1 < field2895; var1++) {
                for (int var2 = 0; var2 < field2897; var2++) {
                    field2891[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIIII)V", line = 83)
    public static final void method1271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class66.field1006 || field2894 == arg3 && field2892 == arg4 && field2898 == arg5 && field2903 == arg6 && field2900 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field2904[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field2891[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field2890[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field2902[var16] == var14) {
                                    if (!field2904[var16]) {
                                        field2904[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field2890[var10++] = var14;
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
                if (!field2904[var18]) {
                    field2902[var18] = field2890[var17];
                    field2904[var18] = true;
                    method1272(var18, field2889[field2890[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field2904[var19]) {
                field2902[var19] = -1;
                method1276(var19);
            }
        }
        field2894 = arg3;
        field2892 = arg4;
        field2898 = arg5;
        field2903 = arg6;
        field2900 = arg7;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILwa;III)V", line = 215)
    private static final void method1272(int arg0, class297 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class166.field2648;
        if (!field2893[arg0]) {
            var6.glEnable(var5);
            field2893[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field4800);
        var6.glLightfv(var5, 4609, arg1.field4806, 0);
        field2901[0] = (float) (arg1.field4803 - arg2);
        field2901[1] = (float) (arg1.field4795 - arg3);
        field2901[2] = (float) (arg1.field4808 - arg4);
        var6.glLightfv(var5, 4611, field2901, 0);
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "()V", line = 237)
    public static final void method1273() {
        for (int var0 = 0; var0 < field2896; var0++) {
            class297 var1 = field2889[var0];
            int var2 = var1.field4813;
            if (var1.field4818) {
                var2 = 0;
            }
            int var3 = var1.field4813;
            if (var1.field4809) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field4808 >> 7) - var1.field4816;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field4808 >> 7) + var1.field4816;
                if (var7 > field2897 - 1) {
                    var7 = field2897 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field4811[var5++];
                    int var10 = (var9 >> 8) + ((var1.field4803 >> 7) - var1.field4816);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field2895 - 1) {
                        var11 = field2895 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field2891[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field2891[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field2891[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field2891[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field2891[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "()V", line = 327)
    public static final void method1274() {
        for (int var0 = 0; var0 < 4; var0++) {
            field2902[var0] = -1;
            method1276(var0);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIII)V", line = 337)
    public static final void method1275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class66.field1006 || field2894 == arg3 && field2892 == arg4 && field2898 == arg5 && field2903 == arg4 && field2900 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field2904[var6] = false;
        }
        int var7 = 0;
        int var8 = field2891[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field2902[var10] == var9) {
                        field2904[var10] = true;
                        continue label72;
                    }
                }
                field2890[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field2904[var12]) {
                        field2902[var12] = field2890[var11];
                        field2904[var12] = true;
                        method1272(var12, field2889[field2890[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field2904[var13]) {
                    field2902[var13] = -1;
                    method1276(var13);
                }
            }
            field2894 = arg3;
            field2892 = arg4;
            field2898 = arg5;
            field2903 = arg4;
            field2900 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 425)
    private static final void method1276(int arg0) {
        if (field2893[arg0]) {
            field2893[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class166.field2648;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIII)V", line = 441)
    public static final void method1277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class66.field1006) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1275(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field2895 - 1) {
            method1275(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1275(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field2897 - 1) {
            method1275(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field2897 - 1) {
            method1275(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field2895 - 1 && arg6 < field2897 - 1) {
            method1275(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1275(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field2895 - 1 && arg6 > 0) {
            method1275(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "()V", line = 495)
    public static void method1278() {
        field2889 = null;
        field2891 = (int[][][]) null;
        field2902 = null;
        field2893 = null;
        field2901 = null;
        field2890 = null;
        field2904 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lwa;)V", line = 504)
    public static final void method1279(class297 arg0) {
        if (field2896 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field2889[field2896++] = arg0;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II[[[Lnh;)V", line = 516)
    public static final void method1280(int arg0, int arg1, class308[][][] arg2) {
        if (!class66.field1006) {
            return;
        }
        GL var3 = class166.field2648;
        class274.method1934(0, 0, (byte) 101);
        class166.method1160(0);
        class166.method1173();
        class166.method1182(class166.field2621);
        var3.glDepthMask(false);
        class166.method1190(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label58: for (int var4 = 0; var4 < field2896; var4++) {
            class297 var5 = field2889[var4];
            if (var5.field4801 != null) {
                int var6 = 0;
                int var7 = (var5.field4808 >> 7) - var5.field4816;
                int var8 = (var5.field4808 >> 7) + var5.field4816;
                if (var8 >= class171.field2728) {
                    var8 = class171.field2728 - 1;
                }
                if (var7 < class238.field3816) {
                    var6 += class238.field3816 - var7;
                    var7 = class238.field3816;
                }
                for (int var9 = var7; var9 <= var8; var9++) {
                    short var10 = var5.field4811[var6++];
                    int var11 = (var10 >> 8) + ((var5.field4803 >> 7) - var5.field4816);
                    int var12 = (var10 & 0xFF) + var11 - 1;
                    if (var11 < class236.field3798) {
                        var11 = class236.field3798;
                    }
                    if (var12 >= class169.field2691) {
                        var12 = class169.field2691 - 1;
                    }
                    for (int var13 = var11; var13 <= var12; var13++) {
                        class308 var14 = arg2[var5.field4813][var13][var9];
                        if (var14 != null && var14.field5200) {
                            class166.method1164(201.5F - (float) var5.field4813 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field4794 }, 0);
                            var5.field4801.method1737();
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
        var3.glFogfv(2918, class58.field828, 0);
        var3.glEnableClientState(32888);
        class166.method1195();
    }

    @OriginalMember(owner = "client!im", name = "e", descriptor = "()V", line = 609)
    public static final void method1281() {
        field2889 = null;
        field2902 = null;
        field2893 = null;
        field2890 = null;
        field2904 = null;
        field2891 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(III)V", line = 621)
    public static final void method1282(int arg0, int arg1, int arg2) {
        field2899 = arg0;
        field2895 = arg1;
        field2897 = arg2;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IZ)V", line = 630)
    public static final void method1283(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field2896; var2++) {
            field2889[var2].method2045(arg1, arg0, 2047);
        }
        field2894 = -1;
        field2892 = -1;
        field2898 = -1;
        field2903 = -1;
        field2900 = -1;
    }

    @OriginalMember(owner = "client!im", name = "f", descriptor = "()V", line = 647)
    public static final void method1284() {
        GL var0 = class166.field2648;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        field2889 = new class297[255];
        field2902 = new int[4];
        field2893 = new boolean[4];
        field2890 = new int[4];
        field2904 = new boolean[4];
        field2891 = new int[field2899][field2895][field2897];
    }
}
