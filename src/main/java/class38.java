import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class38 {

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field678 = 0;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "[F")
    private static float[] field684 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    private static int field680;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    private static int field681;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    private static int field682;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    private static int field686;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    private static int field687;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    private static int field688;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    private static int field689;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    private static int field692;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "[I")
    private static int[] field679;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "[I")
    private static int[] field691;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "[Lc;")
    public static class306[] field693;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "[Z")
    private static boolean[] field683;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "[Z")
    private static boolean[] field685;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "[[[I")
    private static int[][][] field690;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V", line = 6)
    public static final void method305(int arg0, int arg1, int arg2) {
        field689 = arg0;
        field688 = arg1;
        field692 = arg2;
        field690 = new int[field689][field688][field692];
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILc;III)V", line = 13)
    private static final void method306(int arg0, class306 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class265.field4099;
        if (!field685[arg0]) {
            var6.glEnable(var5);
            field685[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field4793);
        var6.glLightfv(var5, 4609, arg1.field4814, 0);
        field684[0] = (float) (arg1.field4816 - arg2);
        field684[1] = (float) (arg1.field4810 - arg3);
        field684[2] = (float) (arg1.field4792 - arg4);
        var6.glLightfv(var5, 4611, field684, 0);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "()V", line = 31)
    public static final void method307() {
        GL var0 = class265.field4099;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field691[var3] = -1;
            method310(var3);
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "()V", line = 59)
    public static final void method308() {
        field678 = 0;
        for (int var0 = 0; var0 < field689; var0++) {
            for (int var1 = 0; var1 < field688; var1++) {
                for (int var2 = 0; var2 < field692; var2++) {
                    field690[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIII)V", line = 88)
    public static final void method309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class302.field4753) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method321(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field688 - 1) {
            method321(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method321(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field692 - 1) {
            method321(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field692 - 1) {
            method321(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field688 - 1 && arg6 < field692 - 1) {
            method321(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method321(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field688 - 1 && arg6 > 0) {
            method321(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 142)
    private static final void method310(int arg0) {
        if (field685[arg0]) {
            field685[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class265.field4099;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIII)V", line = 155)
    public static final void method311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class302.field4753 || field681 == arg3 && field682 == arg4 && field686 == arg5 && field687 == arg6 && field680 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field683[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field690[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field679[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field691[var16] == var14) {
                                    if (!field683[var16]) {
                                        field683[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field679[var10++] = var14;
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
                if (!field683[var18]) {
                    field691[var18] = field679[var17];
                    field683[var18] = true;
                    method306(var18, field693[field679[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field683[var19]) {
                field691[var19] = -1;
                method310(var19);
            }
        }
        field681 = arg3;
        field682 = arg4;
        field686 = arg5;
        field687 = arg6;
        field680 = arg7;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lc;)V", line = 287)
    public static final void method312(class306 arg0) {
        if (field678 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field693[field678++] = arg0;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZ)V", line = 300)
    public static final void method313(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field678; var2++) {
            field693[var2].method2115(arg1, arg0, 22689);
        }
        field681 = -1;
        field682 = -1;
        field686 = -1;
        field687 = -1;
        field680 = -1;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II[[[Lw;)V", line = 319)
    public static final void method314(int arg0, int arg1, class272[][][] arg2) {
        if (!class302.field4753) {
            return;
        }
        GL var3 = class265.field4099;
        class308.method2132(0, (byte) -28, 0);
        class265.method1899(0);
        class265.method1910();
        class265.method1889(class265.field4110);
        var3.glDepthMask(false);
        class265.method1892(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field678; var4++) {
            class306 var5 = field693[var4];
            int var6 = var5.field4819;
            if (var5.field4799) {
                var6--;
            }
            if (var5.field4818 != null) {
                int var7 = 0;
                int var8 = (var5.field4792 >> 7) - var5.field4802;
                int var9 = (var5.field4792 >> 7) + var5.field4802;
                if (var9 >= class110.field1821) {
                    var9 = class110.field1821 - 1;
                }
                if (var8 < class90.field1464) {
                    var7 += class90.field1464 - var8;
                    var8 = class90.field1464;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field4805[var7++];
                    int var12 = (var11 >> 8) + ((var5.field4816 >> 7) - var5.field4802);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class276.field4277) {
                        var12 = class276.field4277;
                    }
                    if (var13 >= class219.field3513) {
                        var13 = class219.field3513 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class272 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field4232) {
                            class265.method1907(201.5F - (float) var5.field4819 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field4806 }, 0);
                            var5.field4818.method1461();
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
        var3.glFogfv(2918, class97.field1619, 0);
        var3.glEnableClientState(32888);
        class265.method1893();
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "()V", line = 422)
    public static final void method315() {
        for (int var0 = 0; var0 < 4; var0++) {
            field691[var0] = -1;
            method310(var0);
        }
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "()V", line = 434)
    public static final void method316() {
        for (int var0 = 0; var0 < field678; var0++) {
            class306 var1 = field693[var0];
            int var2 = var1.field4819;
            if (var1.field4821) {
                var2 = 0;
            }
            int var3 = var1.field4819;
            if (var1.field4795) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field4792 >> 7) - var1.field4802;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field4792 >> 7) + var1.field4802;
                if (var7 > field692 - 1) {
                    var7 = field692 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field4805[var5++];
                    int var10 = (var9 >> 8) + ((var1.field4816 >> 7) - var1.field4802);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field688 - 1) {
                        var11 = field688 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field690[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field690[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field690[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field690[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field690[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "()V", line = 524)
    public static void method317() {
        field693 = null;
        field690 = (int[][][]) null;
        field691 = null;
        field685 = null;
        field684 = null;
        field679 = null;
        field683 = null;
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "()V", line = 533)
    public static final void method318() {
        field693 = null;
        field691 = null;
        field685 = null;
        field679 = null;
        field683 = null;
        field690 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "()V", line = 547)
    public static final void method319() {
        field693 = new class306[255];
        field691 = new int[4];
        field685 = new boolean[4];
        field679 = new int[4];
        field683 = new boolean[4];
        field690 = new int[field689][field688][field692];
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIII)V", line = 559)
    public static final void method320(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class302.field4753) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field691[var5] != -1) {
                int var6 = field690[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field691[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field690[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field691[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field691[var5] = -1;
            method310(var5);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIII)V", line = 603)
    public static final void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class302.field4753 || field681 == arg3 && field682 == arg4 && field686 == arg5 && field687 == arg4 && field680 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field683[var6] = false;
        }
        int var7 = 0;
        int var8 = field690[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field691[var10] == var9) {
                        field683[var10] = true;
                        continue label72;
                    }
                }
                field679[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field683[var12]) {
                        field691[var12] = field679[var11];
                        field683[var12] = true;
                        method306(var12, field693[field679[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field683[var13]) {
                    field691[var13] = -1;
                    method310(var13);
                }
            }
            field681 = arg3;
            field682 = arg4;
            field686 = arg5;
            field687 = arg4;
            field680 = arg5;
            return;
        }
    }
}
