import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class164 {

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "[F")
    private static float[] field2767 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field2769 = 0;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    private static int field2768;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    private static int field2770;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    private static int field2771;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    private static int field2774;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    private static int field2776;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    private static int field2777;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    private static int field2778;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    private static int field2780;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "[I")
    private static int[] field2772;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "[I")
    private static int[] field2781;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "[Laj;")
    public static class1[] field2775;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "[Z")
    private static boolean[] field2766;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "[Z")
    private static boolean[] field2779;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "[[[I")
    private static int[][][] field2773;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)V", line = 5)
    public static final void method1193(int arg0, int arg1, int arg2) {
        field2771 = arg0;
        field2768 = arg1;
        field2780 = arg2;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 12)
    private static final void method1194(int arg0) {
        if (field2766[arg0]) {
            field2766[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class281.field4839;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZ)V", line = 32)
    public static final void method1195(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field2769; var2++) {
            field2775[var2].method2(arg1, 1, arg0);
        }
        field2774 = -1;
        field2770 = -1;
        field2776 = -1;
        field2777 = -1;
        field2778 = -1;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILaj;III)V", line = 51)
    private static final void method1196(int arg0, class1 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class281.field4839;
        if (!field2766[arg0]) {
            var6.glEnable(var5);
            field2766[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field2);
        var6.glLightfv(var5, 4609, arg1.field4, 0);
        field2767[0] = (float) (arg1.field1 - arg2);
        field2767[1] = (float) (arg1.field13 - arg3);
        field2767[2] = (float) (arg1.field16 - arg4);
        var6.glLightfv(var5, 4611, field2767, 0);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "()V", line = 72)
    public static final void method1197() {
        for (int var0 = 0; var0 < field2769; var0++) {
            class1 var1 = field2775[var0];
            int var2 = var1.field11;
            if (var1.field6) {
                var2 = 0;
            }
            int var3 = var1.field11;
            if (var1.field19) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field16 >> 7) - var1.field14;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field16 >> 7) + var1.field14;
                if (var7 > field2780 - 1) {
                    var7 = field2780 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field24[var5++];
                    int var10 = (var9 >> 8) + ((var1.field1 >> 7) - var1.field14);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field2768 - 1) {
                        var11 = field2768 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field2773[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field2773[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field2773[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field2773[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field2773[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "()V", line = 163)
    public static final void method1198() {
        for (int var0 = 0; var0 < 4; var0++) {
            field2772[var0] = -1;
            method1194(var0);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIII)V", line = 173)
    public static final void method1199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class114.field1921 || field2774 == arg3 && field2770 == arg4 && field2776 == arg5 && field2777 == arg4 && field2778 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field2779[var6] = false;
        }
        int var7 = 0;
        int var8 = field2773[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field2772[var10] == var9) {
                        field2779[var10] = true;
                        continue label72;
                    }
                }
                field2781[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field2779[var12]) {
                        field2772[var12] = field2781[var11];
                        field2779[var12] = true;
                        method1196(var12, field2775[field2781[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field2779[var13]) {
                    field2772[var13] = -1;
                    method1194(var13);
                }
            }
            field2774 = arg3;
            field2770 = arg4;
            field2776 = arg5;
            field2777 = arg4;
            field2778 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIII)V", line = 260)
    public static final void method1200(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class114.field1921) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field2772[var5] != -1) {
                int var6 = field2773[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field2772[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field2773[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field2772[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field2772[var5] = -1;
            method1194(var5);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II[[[Lsc;)V", line = 303)
    public static final void method1201(int arg0, int arg1, class249[][][] arg2) {
        if (!class114.field1921) {
            return;
        }
        GL var3 = class281.field4839;
        class256.method1795(0, 0, -536);
        class281.method1964(0);
        class281.method1960();
        class281.method1953(class281.field4814);
        var3.glDepthMask(false);
        class281.method1986(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label58: for (int var4 = 0; var4 < field2769; var4++) {
            class1 var5 = field2775[var4];
            if (var5.field10 != null) {
                int var6 = 0;
                int var7 = (var5.field16 >> 7) - var5.field14;
                int var8 = (var5.field16 >> 7) + var5.field14;
                if (var8 >= class4.field64) {
                    var8 = class4.field64 - 1;
                }
                if (var7 < class69.field1037) {
                    var6 += class69.field1037 - var7;
                    var7 = class69.field1037;
                }
                for (int var9 = var7; var9 <= var8; var9++) {
                    short var10 = var5.field24[var6++];
                    int var11 = (var10 >> 8) + ((var5.field1 >> 7) - var5.field14);
                    int var12 = (var10 & 0xFF) + var11 - 1;
                    if (var11 < class70.field1078) {
                        var11 = class70.field1078;
                    }
                    if (var12 >= class238.field3954) {
                        var12 = class238.field3954 - 1;
                    }
                    for (int var13 = var11; var13 <= var12; var13++) {
                        class249 var14 = arg2[var5.field11][var13][var9];
                        if (var14 != null && var14.field4187) {
                            class281.method1952(201.5F - (float) var5.field11 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field21 }, 0);
                            var5.field10.method44();
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
        var3.glFogfv(2918, class272.field4687, 0);
        var3.glEnableClientState(32888);
        class281.method1966();
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIII)V", line = 396)
    public static final void method1202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class114.field1921) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1199(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field2768 - 1) {
            method1199(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1199(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field2780 - 1) {
            method1199(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field2780 - 1) {
            method1199(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field2768 - 1 && arg6 < field2780 - 1) {
            method1199(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1199(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field2768 - 1 && arg6 > 0) {
            method1199(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "()V", line = 449)
    public static void method1203() {
        field2775 = null;
        field2773 = (int[][][]) null;
        field2772 = null;
        field2766 = null;
        field2767 = null;
        field2781 = null;
        field2779 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Laj;)V", line = 466)
    public static final void method1204(class1 arg0) {
        if (field2769 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field2775[field2769++] = arg0;
        }
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "()V", line = 478)
    public static final void method1205() {
        GL var0 = class281.field4839;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        field2775 = new class1[255];
        field2772 = new int[4];
        field2766 = new boolean[4];
        field2781 = new int[4];
        field2779 = new boolean[4];
        field2773 = new int[field2771][field2768][field2780];
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIIII)V", line = 500)
    public static final void method1206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class114.field1921 || field2774 == arg3 && field2770 == arg4 && field2776 == arg5 && field2777 == arg6 && field2778 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field2779[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field2773[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field2781[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field2772[var16] == var14) {
                                    if (!field2779[var16]) {
                                        field2779[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field2781[var10++] = var14;
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
                if (!field2779[var18]) {
                    field2772[var18] = field2781[var17];
                    field2779[var18] = true;
                    method1196(var18, field2775[field2781[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field2779[var19]) {
                field2772[var19] = -1;
                method1194(var19);
            }
        }
        field2774 = arg3;
        field2770 = arg4;
        field2776 = arg5;
        field2777 = arg6;
        field2778 = arg7;
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "()V", line = 629)
    public static final void method1207() {
        field2775 = null;
        field2772 = null;
        field2766 = null;
        field2781 = null;
        field2779 = null;
        field2773 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "()V", line = 637)
    public static final void method1208() {
        field2769 = 0;
        for (int var0 = 0; var0 < field2771; var0++) {
            for (int var1 = 0; var1 < field2768; var1++) {
                for (int var2 = 0; var2 < field2780; var2++) {
                    field2773[var0][var1][var2] = 0;
                }
            }
        }
    }
}
