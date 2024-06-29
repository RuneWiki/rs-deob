import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class193 {

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "[F")
    private static float[] field2774 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public static int field2775 = 0;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    private static int field2766;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    private static int field2768;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    private static int field2769;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    private static int field2771;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    private static int field2772;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    private static int field2777;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    private static int field2778;

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
    private static int field2781;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "[I")
    private static int[] field2776;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "[I")
    private static int[] field2779;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "[Lsj;")
    public static class62[] field2767;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "[Z")
    private static boolean[] field2773;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "[Z")
    private static boolean[] field2780;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "[[[I")
    private static int[][][] field2770;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "()V", line = 7)
    public static final void method1331() {
        for (int var0 = 0; var0 < field2775; var0++) {
            class62 var1 = field2767[var0];
            int var2 = var1.field773;
            if (var1.field760) {
                var2 = 0;
            }
            int var3 = var1.field773;
            if (var1.field768) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field764 >> 7) - var1.field777;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field764 >> 7) + var1.field777;
                if (var7 > field2766 - 1) {
                    var7 = field2766 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field775[var5++];
                    int var10 = (var9 >> 8) + ((var1.field759 >> 7) - var1.field777);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field2781 - 1) {
                        var11 = field2781 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field2770[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field2770[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field2770[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field2770[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field2770[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "()V", line = 97)
    public static void method1332() {
        field2767 = null;
        field2770 = (int[][][]) null;
        field2779 = null;
        field2780 = null;
        field2774 = null;
        field2776 = null;
        field2773 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIII)V", line = 108)
    public static final void method1333(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class162.field2241) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field2779[var5] != -1) {
                int var6 = field2770[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field2779[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field2770[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field2779[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field2779[var5] = -1;
            method1347(var5);
        }
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "()V", line = 152)
    public static final void method1334() {
        GL var0 = class250.field3818;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field2779[var3] = -1;
            method1347(var3);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIII)V", line = 180)
    public static final void method1335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class162.field2241 || field2771 == arg3 && field2777 == arg4 && field2772 == arg5 && field2769 == arg4 && field2778 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field2773[var6] = false;
        }
        int var7 = 0;
        int var8 = field2770[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field2779[var10] == var9) {
                        field2773[var10] = true;
                        continue label72;
                    }
                }
                field2776[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field2773[var12]) {
                        field2779[var12] = field2776[var11];
                        field2773[var12] = true;
                        method1336(var12, field2767[field2776[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field2773[var13]) {
                    field2779[var13] = -1;
                    method1347(var13);
                }
            }
            field2771 = arg3;
            field2777 = arg4;
            field2772 = arg5;
            field2769 = arg4;
            field2778 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILsj;III)V", line = 269)
    private static final void method1336(int arg0, class62 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class250.field3818;
        if (!field2780[arg0]) {
            var6.glEnable(var5);
            field2780[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field781);
        var6.glLightfv(var5, 4609, arg1.field786, 0);
        field2774[0] = (float) (arg1.field759 - arg2);
        field2774[1] = (float) (arg1.field758 - arg3);
        field2774[2] = (float) (arg1.field764 - arg4);
        var6.glLightfv(var5, 4611, field2774, 0);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII)V", line = 286)
    public static final void method1337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class162.field2241) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1335(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field2781 - 1) {
            method1335(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1335(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field2766 - 1) {
            method1335(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field2766 - 1) {
            method1335(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field2781 - 1 && arg6 < field2766 - 1) {
            method1335(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1335(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field2781 - 1 && arg6 > 0) {
            method1335(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)V", line = 340)
    public static final void method1338(int arg0, int arg1, int arg2) {
        field2768 = arg0;
        field2781 = arg1;
        field2766 = arg2;
        field2770 = new int[field2768][field2781][field2766];
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)V", line = 348)
    public static final void method1339(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field2775; var2++) {
            field2767[var2].method362(arg1, arg0, 1683129931);
        }
        field2771 = -1;
        field2777 = -1;
        field2772 = -1;
        field2769 = -1;
        field2778 = -1;
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "()V", line = 363)
    public static final void method1340() {
        field2775 = 0;
        for (int var0 = 0; var0 < field2768; var0++) {
            for (int var1 = 0; var1 < field2781; var1++) {
                for (int var2 = 0; var2 < field2766; var2++) {
                    field2770[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lsj;)V", line = 393)
    public static final void method1341(class62 arg0) {
        if (field2775 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field2767[field2775++] = arg0;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIII)V", line = 404)
    public static final void method1342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class162.field2241 || field2771 == arg3 && field2777 == arg4 && field2772 == arg5 && field2769 == arg6 && field2778 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field2773[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field2770[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field2776[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field2779[var16] == var14) {
                                    if (!field2773[var16]) {
                                        field2773[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field2776[var10++] = var14;
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
                if (!field2773[var18]) {
                    field2779[var18] = field2776[var17];
                    field2773[var18] = true;
                    method1336(var18, field2767[field2776[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field2773[var19]) {
                field2779[var19] = -1;
                method1347(var19);
            }
        }
        field2771 = arg3;
        field2777 = arg4;
        field2772 = arg5;
        field2769 = arg6;
        field2778 = arg7;
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "()V", line = 535)
    public static final void method1343() {
        field2767 = null;
        field2779 = null;
        field2780 = null;
        field2776 = null;
        field2773 = null;
        field2770 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "()V", line = 546)
    public static final void method1344() {
        for (int var0 = 0; var0 < 4; var0++) {
            field2779[var0] = -1;
            method1347(var0);
        }
    }

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "()V", line = 557)
    public static final void method1345() {
        field2767 = new class62[255];
        field2779 = new int[4];
        field2780 = new boolean[4];
        field2776 = new int[4];
        field2773 = new boolean[4];
        field2770 = new int[field2768][field2781][field2766];
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[[[Ldk;)V", line = 573)
    public static final void method1346(int arg0, int arg1, class225[][][] arg2) {
        if (!class162.field2241) {
            return;
        }
        GL var3 = class250.field3818;
        class262.method1886(0, 3, 0);
        class250.method1797(0);
        class250.method1834();
        class250.method1806(class250.field3792);
        var3.glDepthMask(false);
        class250.method1819(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field2775; var4++) {
            class62 var5 = field2767[var4];
            int var6 = var5.field773;
            if (var5.field784) {
                var6--;
            }
            if (var5.field783 != null) {
                int var7 = 0;
                int var8 = (var5.field764 >> 7) - var5.field777;
                int var9 = (var5.field764 >> 7) + var5.field777;
                if (var9 >= class228.field3278) {
                    var9 = class228.field3278 - 1;
                }
                if (var8 < class19.field256) {
                    var7 += class19.field256 - var8;
                    var8 = class19.field256;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field775[var7++];
                    int var12 = (var11 >> 8) + ((var5.field759 >> 7) - var5.field777);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class222.field3136) {
                        var12 = class222.field3136;
                    }
                    if (var13 >= class237.field3485) {
                        var13 = class237.field3485 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class225 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field3215) {
                            class250.method1814(201.5F - (float) var5.field773 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field774 }, 0);
                            var5.field783.method761();
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
        var3.glFogfv(2918, class64.field838, 0);
        var3.glEnableClientState(32888);
        class250.method1800();
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 679)
    private static final void method1347(int arg0) {
        if (field2780[arg0]) {
            field2780[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class250.field3818;
            var2.glDisable(var1);
        }
    }
}
