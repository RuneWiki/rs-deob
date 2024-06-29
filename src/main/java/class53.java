import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class53 {

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "[F")
    private static float[] field834 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "[I")
    private static int[] field842 = new int[4];

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "[Z")
    private static boolean[] field845 = new boolean[4];

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[Lke;")
    public static class239[] field844 = new class239[255];

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "[Z")
    private static boolean[] field847 = new boolean[4];

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "[I")
    private static int[] field846 = new int[4];

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field838 = 0;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    private static int field836;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    private static int field837;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    private static int field839;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    private static int field840;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    private static int field841;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    private static int field843;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    private static int field848;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    private static int field849;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "[[[I")
    private static int[][][] field835;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)V", line = 11)
    public static final void method399(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field838; var2++) {
            field844[var2].method1694(arg0, arg1, (byte) 93);
        }
        field843 = -1;
        field840 = -1;
        field849 = -1;
        field848 = -1;
        field841 = -1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "()V", line = 27)
    public static final void method400() {
        for (int var0 = 0; var0 < 4; var0++) {
            field842[var0] = -1;
            method403(var0);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIII)V", line = 37)
    public static final void method401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class8.field114 || field843 == arg3 && field840 == arg4 && field849 == arg5 && field848 == arg6 && field841 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field847[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field835[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field846[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field842[var16] == var14) {
                                    if (!field847[var16]) {
                                        field847[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field846[var10++] = var14;
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
                if (!field847[var18]) {
                    field842[var18] = field846[var17];
                    field847[var18] = true;
                    method409(var18, field844[field846[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field847[var19]) {
                field842[var19] = -1;
                method403(var19);
            }
        }
        field843 = arg3;
        field840 = arg4;
        field849 = arg5;
        field848 = arg6;
        field841 = arg7;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V", line = 167)
    public static final void method402(int arg0, int arg1, int arg2) {
        field837 = arg0;
        field839 = arg1;
        field836 = arg2;
        field835 = new int[field837][field839][field836];
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 174)
    private static final void method403(int arg0) {
        if (field845[arg0]) {
            field845[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class45.field688;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "()V", line = 185)
    public static void method404() {
        field844 = null;
        field835 = (int[][][]) null;
        field842 = null;
        field845 = null;
        field834 = null;
        field846 = null;
        field847 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)V", line = 199)
    public static final void method405(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class8.field114) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field842[var5] != -1) {
                int var6 = field835[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field842[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field835[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field842[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field842[var5] = -1;
            method403(var5);
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "()V", line = 244)
    public static final void method406() {
        for (int var0 = 0; var0 < field838; var0++) {
            class239 var1 = field844[var0];
            int var2 = var1.field3961;
            if (var1.field3954) {
                var2 = 0;
            }
            int var3 = var1.field3961;
            if (var1.field3964) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field3958 >> 7) - var1.field3946;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field3958 >> 7) + var1.field3946;
                if (var7 > field836 - 1) {
                    var7 = field836 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field3952[var5++];
                    int var10 = (var9 >> 8) + ((var1.field3944 >> 7) - var1.field3946);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field839 - 1) {
                        var11 = field839 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field835[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field835[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field835[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field835[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field835[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II[[[Lek;)V", line = 337)
    public static final void method407(int arg0, int arg1, class198[][][] arg2) {
        if (!class8.field114) {
            return;
        }
        GL var3 = class45.field688;
        class264.method1814(0, 0, (byte) 83);
        class45.method330(0);
        class45.method326();
        class45.method321(class45.field683);
        var3.glDepthMask(false);
        class45.method314(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label58: for (int var4 = 0; var4 < field838; var4++) {
            class239 var5 = field844[var4];
            if (var5.field3957 != null) {
                int var6 = 0;
                int var7 = (var5.field3958 >> 7) - var5.field3946;
                int var8 = (var5.field3958 >> 7) + var5.field3946;
                if (var8 >= class80.field1242) {
                    var8 = class80.field1242 - 1;
                }
                if (var7 < class74.field1159) {
                    var6 += class74.field1159 - var7;
                    var7 = class74.field1159;
                }
                for (int var9 = var7; var9 <= var8; var9++) {
                    short var10 = var5.field3952[var6++];
                    int var11 = (var10 >> 8) + ((var5.field3944 >> 7) - var5.field3946);
                    int var12 = (var10 & 0xFF) + var11 - 1;
                    if (var11 < class70.field1111) {
                        var11 = class70.field1111;
                    }
                    if (var12 >= class72.field1132) {
                        var12 = class72.field1132 - 1;
                    }
                    for (int var13 = var11; var13 <= var12; var13++) {
                        class198 var14 = arg2[var5.field3961][var13][var9];
                        if (var14 != null && var14.field3157) {
                            class45.method315(201.5F - (float) var5.field3961 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field3948 }, 0);
                            var5.field3957.method180();
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
        var3.glFogfv(2918, class293.field4948, 0);
        var3.glEnableClientState(32888);
        class45.method306();
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lke;)V", line = 436)
    public static final void method408(class239 arg0) {
        if (field838 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field844[field838++] = arg0;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILke;III)V", line = 448)
    private static final void method409(int arg0, class239 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class45.field688;
        if (!field845[arg0]) {
            var6.glEnable(var5);
            field845[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field3963);
        var6.glLightfv(var5, 4609, arg1.field3949, 0);
        field834[0] = (float) (arg1.field3944 - arg2);
        field834[1] = (float) (arg1.field3966 - arg3);
        field834[2] = (float) (arg1.field3958 - arg4);
        var6.glLightfv(var5, 4611, field834, 0);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIII)V", line = 472)
    public static final void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class8.field114 || field843 == arg3 && field840 == arg4 && field849 == arg5 && field848 == arg4 && field841 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field847[var6] = false;
        }
        int var7 = 0;
        int var8 = field835[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field842[var10] == var9) {
                        field847[var10] = true;
                        continue label72;
                    }
                }
                field846[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field847[var12]) {
                        field842[var12] = field846[var11];
                        field847[var12] = true;
                        method409(var12, field844[field846[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field847[var13]) {
                    field842[var13] = -1;
                    method403(var13);
                }
            }
            field843 = arg3;
            field840 = arg4;
            field849 = arg5;
            field848 = arg4;
            field841 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIII)V", line = 561)
    public static final void method411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class8.field114) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method410(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field839 - 1) {
            method410(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method410(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field836 - 1) {
            method410(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field836 - 1) {
            method410(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field839 - 1 && arg6 < field836 - 1) {
            method410(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method410(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field839 - 1 && arg6 > 0) {
            method410(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "()V", line = 616)
    public static final void method412() {
        GL var0 = class45.field688;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "()V", line = 632)
    public static final void method413() {
        field838 = 0;
        for (int var0 = 0; var0 < field837; var0++) {
            for (int var1 = 0; var1 < field839; var1++) {
                for (int var2 = 0; var2 < field836; var2++) {
                    field835[var0][var1][var2] = 0;
                }
            }
        }
    }
}
