import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class183 {

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "[F")
    private static float[] field2761 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field2763 = 0;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    private static int field2749;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    private static int field2750;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    private static int field2751;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    private static int field2753;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    private static int field2754;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    private static int field2757;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    private static int field2762;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    private static int field2764;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "[I")
    private static int[] field2752;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "[I")
    private static int[] field2758;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "[Lri;")
    public static class204[] field2755;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "[Z")
    private static boolean[] field2756;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "[Z")
    private static boolean[] field2759;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "[[[I")
    private static int[][][] field2760;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "()V", line = 7)
    public static final void method1303() {
        for (int var0 = 0; var0 < field2763; var0++) {
            class204 var1 = field2755[var0];
            int var2 = var1.field3078;
            if (var1.field3066) {
                var2 = 0;
            }
            int var3 = var1.field3078;
            if (var1.field3055) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field3070 >> 7) - var1.field3068;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field3070 >> 7) + var1.field3068;
                if (var7 > field2757 - 1) {
                    var7 = field2757 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field3075[var5++];
                    int var10 = (var9 >> 8) + ((var1.field3061 >> 7) - var1.field3068);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field2751 - 1) {
                        var11 = field2751 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field2760[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field2760[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field2760[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field2760[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field2760[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)V", line = 95)
    public static final void method1304(int arg0, int arg1, int arg2) {
        field2750 = arg0;
        field2751 = arg1;
        field2757 = arg2;
        field2760 = new int[field2750][field2751][field2757];
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIII)V", line = 101)
    public static final void method1305(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class208.field3191) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field2758[var5] != -1) {
                int var6 = field2760[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field2758[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field2760[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field2758[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field2758[var5] = -1;
            method1313(var5);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lri;)V", line = 144)
    public static final void method1306(class204 arg0) {
        if (field2763 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field2755[field2763++] = arg0;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIII)V", line = 158)
    public static final void method1307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class208.field3191) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1315(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field2751 - 1) {
            method1315(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1315(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field2757 - 1) {
            method1315(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field2757 - 1) {
            method1315(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field2751 - 1 && arg6 < field2757 - 1) {
            method1315(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1315(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field2751 - 1 && arg6 > 0) {
            method1315(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II[[[Lff;)V", line = 213)
    public static final void method1308(int arg0, int arg1, class142[][][] arg2) {
        if (!class208.field3191) {
            return;
        }
        GL var3 = class94.field1473;
        class37.method313(0, 0, 0);
        class94.method677(0);
        class94.method695();
        class94.method698(class94.field1485);
        var3.glDepthMask(false);
        class94.method668(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field2763; var4++) {
            class204 var5 = field2755[var4];
            int var6 = var5.field3078;
            if (var5.field3063) {
                var6--;
            }
            if (var5.field3058 != null) {
                int var7 = 0;
                int var8 = (var5.field3070 >> 7) - var5.field3068;
                int var9 = (var5.field3070 >> 7) + var5.field3068;
                if (var9 >= class18.field249) {
                    var9 = class18.field249 - 1;
                }
                if (var8 < class259.field4061) {
                    var7 += class259.field4061 - var8;
                    var8 = class259.field4061;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field3075[var7++];
                    int var12 = (var11 >> 8) + ((var5.field3061 >> 7) - var5.field3068);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class304.field4751) {
                        var12 = class304.field4751;
                    }
                    if (var13 >= class46.field757) {
                        var13 = class46.field757 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class142 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field2202) {
                            class94.method671(201.5F - (float) var5.field3078 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field3073 }, 0);
                            var5.field3058.method543();
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
        var3.glFogfv(2918, class250.field3952, 0);
        var3.glEnableClientState(32888);
        class94.method692();
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILri;III)V", line = 315)
    private static final void method1309(int arg0, class204 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class94.field1473;
        if (!field2756[arg0]) {
            var6.glEnable(var5);
            field2756[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field3072);
        var6.glLightfv(var5, 4609, arg1.field3057, 0);
        field2761[0] = (float) (arg1.field3061 - arg2);
        field2761[1] = (float) (arg1.field3051 - arg3);
        field2761[2] = (float) (arg1.field3070 - arg4);
        var6.glLightfv(var5, 4611, field2761, 0);
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "()V", line = 337)
    public static final void method1310() {
        field2763 = 0;
        for (int var0 = 0; var0 < field2750; var0++) {
            for (int var1 = 0; var1 < field2751; var1++) {
                for (int var2 = 0; var2 < field2757; var2++) {
                    field2760[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)V", line = 368)
    public static final void method1311(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field2763; var2++) {
            field2755[var2].method1449(arg0, arg1, (byte) 44);
        }
        field2754 = -1;
        field2749 = -1;
        field2764 = -1;
        field2753 = -1;
        field2762 = -1;
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "()V", line = 383)
    public static final void method1312() {
        field2755 = null;
        field2758 = null;
        field2756 = null;
        field2752 = null;
        field2759 = null;
        field2760 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 394)
    private static final void method1313(int arg0) {
        if (field2756[arg0]) {
            field2756[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class94.field1473;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIII)V", line = 405)
    public static final void method1314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class208.field3191 || field2754 == arg3 && field2749 == arg4 && field2764 == arg5 && field2753 == arg6 && field2762 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field2759[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field2760[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field2752[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field2758[var16] == var14) {
                                    if (!field2759[var16]) {
                                        field2759[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field2752[var10++] = var14;
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
                if (!field2759[var18]) {
                    field2758[var18] = field2752[var17];
                    field2759[var18] = true;
                    method1309(var18, field2755[field2752[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field2759[var19]) {
                field2758[var19] = -1;
                method1313(var19);
            }
        }
        field2754 = arg3;
        field2749 = arg4;
        field2764 = arg5;
        field2753 = arg6;
        field2762 = arg7;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIII)V", line = 534)
    public static final void method1315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class208.field3191 || field2754 == arg3 && field2749 == arg4 && field2764 == arg5 && field2753 == arg4 && field2762 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field2759[var6] = false;
        }
        int var7 = 0;
        int var8 = field2760[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field2758[var10] == var9) {
                        field2759[var10] = true;
                        continue label72;
                    }
                }
                field2752[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field2759[var12]) {
                        field2758[var12] = field2752[var11];
                        field2759[var12] = true;
                        method1309(var12, field2755[field2752[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field2759[var13]) {
                    field2758[var13] = -1;
                    method1313(var13);
                }
            }
            field2754 = arg3;
            field2749 = arg4;
            field2764 = arg5;
            field2753 = arg4;
            field2762 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "()V", line = 623)
    public static final void method1316() {
        GL var0 = class94.field1473;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field2758[var3] = -1;
            method1313(var3);
        }
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "()V", line = 649)
    public static void method1317() {
        field2755 = null;
        field2760 = (int[][][]) null;
        field2758 = null;
        field2756 = null;
        field2761 = null;
        field2752 = null;
        field2759 = null;
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "()V", line = 667)
    public static final void method1318() {
        for (int var0 = 0; var0 < 4; var0++) {
            field2758[var0] = -1;
            method1313(var0);
        }
    }

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "()V", line = 682)
    public static final void method1319() {
        field2755 = new class204[255];
        field2758 = new int[4];
        field2756 = new boolean[4];
        field2752 = new int[4];
        field2759 = new boolean[4];
        field2760 = new int[field2750][field2751][field2757];
    }
}
