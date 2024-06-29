import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class195 {

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "[F")
    private static float[] field2961 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field2970 = 0;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    private static int field2957;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    private static int field2962;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    private static int field2963;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    private static int field2964;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    private static int field2965;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    private static int field2967;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    private static int field2969;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    private static int field2971;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "[I")
    private static int[] field2959;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "[I")
    private static int[] field2968;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "[Lh;")
    public static class244[] field2960;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "[Z")
    private static boolean[] field2958;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[Z")
    private static boolean[] field2966;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "[[[I")
    private static int[][][] field2956;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method1353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class290.field4566 || field2971 == arg3 && field2965 == arg4 && field2957 == arg5 && field2962 == arg4 && field2969 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field2958[var6] = false;
        }
        int var7 = 0;
        int var8 = field2956[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field2968[var10] == var9) {
                        field2958[var10] = true;
                        continue label72;
                    }
                }
                field2959[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field2958[var12]) {
                        field2968[var12] = field2959[var11];
                        field2958[var12] = true;
                        method1359(var12, field2960[field2959[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field2958[var13]) {
                    field2968[var13] = -1;
                    method1361(var13);
                }
            }
            field2971 = arg3;
            field2965 = arg4;
            field2957 = arg5;
            field2962 = arg4;
            field2969 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "()V", line = 97)
    public static final void method1354() {
        for (int var0 = 0; var0 < field2970; var0++) {
            class244 var1 = field2960[var0];
            int var2 = var1.field3831;
            if (var1.field3817) {
                var2 = 0;
            }
            int var3 = var1.field3831;
            if (var1.field3820) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field3841 >> 7) - var1.field3835;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field3841 >> 7) + var1.field3835;
                if (var7 > field2964 - 1) {
                    var7 = field2964 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field3837[var5++];
                    int var10 = (var9 >> 8) + ((var1.field3839 >> 7) - var1.field3835);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field2963 - 1) {
                        var11 = field2963 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field2956[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field2956[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field2956[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field2956[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field2956[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "()V", line = 185)
    public static final void method1355() {
        field2970 = 0;
        for (int var0 = 0; var0 < field2967; var0++) {
            for (int var1 = 0; var1 < field2963; var1++) {
                for (int var2 = 0; var2 < field2964; var2++) {
                    field2956[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "()V", line = 215)
    public static final void method1356() {
        for (int var0 = 0; var0 < 4; var0++) {
            field2968[var0] = -1;
            method1361(var0);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lh;)V", line = 225)
    public static final void method1357(class244 arg0) {
        if (field2970 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field2960[field2970++] = arg0;
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "()V", line = 242)
    public static void method1358() {
        field2960 = null;
        field2956 = (int[][][]) null;
        field2968 = null;
        field2966 = null;
        field2961 = null;
        field2959 = null;
        field2958 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILh;III)V", line = 254)
    private static final void method1359(int arg0, class244 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class272.field4310;
        if (!field2966[arg0]) {
            var6.glEnable(var5);
            field2966[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field3834);
        var6.glLightfv(var5, 4609, arg1.field3836, 0);
        field2961[0] = (float) (arg1.field3839 - arg2);
        field2961[1] = (float) (arg1.field3823 - arg3);
        field2961[2] = (float) (arg1.field3841 - arg4);
        var6.glLightfv(var5, 4611, field2961, 0);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIII)V", line = 273)
    public static final void method1360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class290.field4566) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1353(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field2963 - 1) {
            method1353(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1353(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field2964 - 1) {
            method1353(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field2964 - 1) {
            method1353(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field2963 - 1 && arg6 < field2964 - 1) {
            method1353(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1353(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field2963 - 1 && arg6 > 0) {
            method1353(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 326)
    private static final void method1361(int arg0) {
        if (field2966[arg0]) {
            field2966[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class272.field4310;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V", line = 338)
    public static final void method1362(int arg0, int arg1, int arg2) {
        field2967 = arg0;
        field2963 = arg1;
        field2964 = arg2;
        field2956 = new int[field2967][field2963][field2964];
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)V", line = 344)
    public static final void method1363(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class290.field4566) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field2968[var5] != -1) {
                int var6 = field2956[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field2968[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field2956[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field2968[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field2968[var5] = -1;
            method1361(var5);
        }
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "()V", line = 388)
    public static final void method1364() {
        field2960 = new class244[255];
        field2968 = new int[4];
        field2966 = new boolean[4];
        field2959 = new int[4];
        field2958 = new boolean[4];
        field2956 = new int[field2967][field2963][field2964];
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)V", line = 399)
    public static final void method1365(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field2970; var2++) {
            field2960[var2].method1728(arg0, arg1, (byte) 79);
        }
        field2971 = -1;
        field2965 = -1;
        field2957 = -1;
        field2962 = -1;
        field2969 = -1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIII)V", line = 415)
    public static final void method1366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class290.field4566 || field2971 == arg3 && field2965 == arg4 && field2957 == arg5 && field2962 == arg6 && field2969 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field2958[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field2956[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field2959[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field2968[var16] == var14) {
                                    if (!field2958[var16]) {
                                        field2958[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field2959[var10++] = var14;
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
                if (!field2958[var18]) {
                    field2968[var18] = field2959[var17];
                    field2958[var18] = true;
                    method1359(var18, field2960[field2959[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field2958[var19]) {
                field2968[var19] = -1;
                method1361(var19);
            }
        }
        field2971 = arg3;
        field2965 = arg4;
        field2957 = arg5;
        field2962 = arg6;
        field2969 = arg7;
    }

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "()V", line = 545)
    public static final void method1367() {
        field2960 = null;
        field2968 = null;
        field2966 = null;
        field2959 = null;
        field2958 = null;
        field2956 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "()V", line = 556)
    public static final void method1368() {
        GL var0 = class272.field4310;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field2968[var3] = -1;
            method1361(var3);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II[[[Lwk;)V", line = 583)
    public static final void method1369(int arg0, int arg1, class196[][][] arg2) {
        if (!class290.field4566) {
            return;
        }
        GL var3 = class272.field4310;
        class11.method69(-116, 0, 0);
        class272.method1961(0);
        class272.method1926();
        class272.method1965(class272.field4303);
        var3.glDepthMask(false);
        class272.method1941(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field2970; var4++) {
            class244 var5 = field2960[var4];
            int var6 = var5.field3831;
            if (var5.field3830) {
                var6--;
            }
            if (var5.field3821 != null) {
                int var7 = 0;
                int var8 = (var5.field3841 >> 7) - var5.field3835;
                int var9 = (var5.field3841 >> 7) + var5.field3835;
                if (var9 >= class294.field4629) {
                    var9 = class294.field4629 - 1;
                }
                if (var8 < class238.field3660) {
                    var7 += class238.field3660 - var8;
                    var8 = class238.field3660;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field3837[var7++];
                    int var12 = (var11 >> 8) + ((var5.field3839 >> 7) - var5.field3835);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class185.field2788) {
                        var12 = class185.field2788;
                    }
                    if (var13 >= class13.field133) {
                        var13 = class13.field133 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class196 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field2983) {
                            class272.method1924(201.5F - (float) var5.field3831 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field3842 }, 0);
                            var5.field3821.method2430();
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
        var3.glFogfv(2918, class26.field299, 0);
        var3.glEnableClientState(32888);
        class272.method1938();
    }
}
