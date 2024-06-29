import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class176 {

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field2892 = 0;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "[F")
    private static float[] field2890 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    private static int field2879;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    private static int field2880;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    private static int field2883;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    private static int field2884;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    private static int field2885;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    private static int field2888;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    private static int field2893;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    private static int field2894;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "[I")
    private static int[] field2881;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "[I")
    private static int[] field2882;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "[Lvb;")
    public static class79[] field2891;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "[Z")
    private static boolean[] field2886;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "[Z")
    private static boolean[] field2889;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "[[[I")
    private static int[][][] field2887;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lvb;)V", line = 4)
    public static final void method1295(class79 arg0) {
        if (field2892 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field2891[field2892++] = arg0;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()V", line = 15)
    public static final void method1296() {
        field2891 = null;
        field2881 = null;
        field2886 = null;
        field2882 = null;
        field2889 = null;
        field2887 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II[[[Lsm;)V", line = 25)
    public static final void method1297(int arg0, int arg1, class124[][][] arg2) {
        if (!class220.field3482) {
            return;
        }
        GL var3 = class109.field1456;
        class256.method1855(0, -119, 0);
        class109.method766(0);
        class109.method762();
        class109.method752(class109.field1476);
        var3.glDepthMask(false);
        class109.method749(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field2892; var4++) {
            class79 var5 = field2891[var4];
            int var6 = var5.field1061;
            if (var5.field1064) {
                var6--;
            }
            if (var5.field1069 != null) {
                int var7 = 0;
                int var8 = (var5.field1072 >> 7) - var5.field1056;
                int var9 = (var5.field1072 >> 7) + var5.field1056;
                if (var9 >= class294.field4563) {
                    var9 = class294.field4563 - 1;
                }
                if (var8 < class206.field3272) {
                    var7 += class206.field3272 - var8;
                    var8 = class206.field3272;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field1077[var7++];
                    int var12 = (var11 >> 8) + ((var5.field1068 >> 7) - var5.field1056);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class48.field632) {
                        var12 = class48.field632;
                    }
                    if (var13 >= class52.field661) {
                        var13 = class52.field661 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class124 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field1785) {
                            class109.method745(201.5F - (float) var5.field1061 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field1076 }, 0);
                            var5.field1069.method1124();
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
        var3.glFogfv(2918, class115.field1602, 0);
        var3.glEnableClientState(32888);
        class109.method751();
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)V", line = 129)
    public static final void method1298(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field2892; var2++) {
            field2891[var2].method585(arg1, 19851, arg0);
        }
        field2884 = -1;
        field2894 = -1;
        field2883 = -1;
        field2893 = -1;
        field2880 = -1;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "()V", line = 147)
    public static final void method1299() {
        for (int var0 = 0; var0 < field2892; var0++) {
            class79 var1 = field2891[var0];
            int var2 = var1.field1061;
            if (var1.field1057) {
                var2 = 0;
            }
            int var3 = var1.field1061;
            if (var1.field1086) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field1072 >> 7) - var1.field1056;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field1072 >> 7) + var1.field1056;
                if (var7 > field2879 - 1) {
                    var7 = field2879 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field1077[var5++];
                    int var10 = (var9 >> 8) + ((var1.field1068 >> 7) - var1.field1056);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field2885 - 1) {
                        var11 = field2885 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field2887[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field2887[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field2887[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field2887[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field2887[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIII)V", line = 235)
    public static final void method1300(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class220.field3482) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field2881[var5] != -1) {
                int var6 = field2887[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field2881[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field2887[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field2881[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field2881[var5] = -1;
            method1306(var5);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIII)V", line = 278)
    public static final void method1301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class220.field3482 || field2884 == arg3 && field2894 == arg4 && field2883 == arg5 && field2893 == arg6 && field2880 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field2889[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field2887[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field2882[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field2881[var16] == var14) {
                                    if (!field2889[var16]) {
                                        field2889[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field2882[var10++] = var14;
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
                if (!field2889[var18]) {
                    field2881[var18] = field2882[var17];
                    field2889[var18] = true;
                    method1308(var18, field2891[field2882[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field2889[var19]) {
                field2881[var19] = -1;
                method1306(var19);
            }
        }
        field2884 = arg3;
        field2894 = arg4;
        field2883 = arg5;
        field2893 = arg6;
        field2880 = arg7;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "()V", line = 407)
    public static final void method1302() {
        field2891 = new class79[255];
        field2881 = new int[4];
        field2886 = new boolean[4];
        field2882 = new int[4];
        field2889 = new boolean[4];
        field2887 = new int[field2888][field2885][field2879];
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIII)V", line = 415)
    public static final void method1303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class220.field3482) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1311(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field2885 - 1) {
            method1311(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1311(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field2879 - 1) {
            method1311(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field2879 - 1) {
            method1311(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field2885 - 1 && arg6 < field2879 - 1) {
            method1311(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1311(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field2885 - 1 && arg6 > 0) {
            method1311(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V", line = 468)
    public static final void method1304(int arg0, int arg1, int arg2) {
        field2888 = arg0;
        field2885 = arg1;
        field2879 = arg2;
        field2887 = new int[field2888][field2885][field2879];
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "()V", line = 476)
    public static final void method1305() {
        for (int var0 = 0; var0 < 4; var0++) {
            field2881[var0] = -1;
            method1306(var0);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 493)
    private static final void method1306(int arg0) {
        if (field2886[arg0]) {
            field2886[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class109.field1456;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "()V", line = 506)
    public static void method1307() {
        field2891 = null;
        field2887 = (int[][][]) null;
        field2881 = null;
        field2886 = null;
        field2890 = null;
        field2882 = null;
        field2889 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILvb;III)V", line = 518)
    private static final void method1308(int arg0, class79 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class109.field1456;
        if (!field2886[arg0]) {
            var6.glEnable(var5);
            field2886[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field1063);
        var6.glLightfv(var5, 4609, arg1.field1073, 0);
        field2890[0] = (float) (arg1.field1068 - arg2);
        field2890[1] = (float) (arg1.field1060 - arg3);
        field2890[2] = (float) (arg1.field1072 - arg4);
        var6.glLightfv(var5, 4611, field2890, 0);
    }

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "()V", line = 535)
    public static final void method1309() {
        field2892 = 0;
        for (int var0 = 0; var0 < field2888; var0++) {
            for (int var1 = 0; var1 < field2885; var1++) {
                for (int var2 = 0; var2 < field2879; var2++) {
                    field2887[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "()V", line = 567)
    public static final void method1310() {
        GL var0 = class109.field1456;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field2881[var3] = -1;
            method1306(var3);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIII)V", line = 593)
    public static final void method1311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class220.field3482 || field2884 == arg3 && field2894 == arg4 && field2883 == arg5 && field2893 == arg4 && field2880 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field2889[var6] = false;
        }
        int var7 = 0;
        int var8 = field2887[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field2881[var10] == var9) {
                        field2889[var10] = true;
                        continue label72;
                    }
                }
                field2882[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field2889[var12]) {
                        field2881[var12] = field2882[var11];
                        field2889[var12] = true;
                        method1308(var12, field2891[field2882[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field2889[var13]) {
                    field2881[var13] = -1;
                    method1306(var13);
                }
            }
            field2884 = arg3;
            field2894 = arg4;
            field2883 = arg5;
            field2893 = arg4;
            field2880 = arg5;
            return;
        }
    }
}
