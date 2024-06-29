import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class315 {

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field4879 = 0;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "[F")
    private static float[] field4884 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    private static int field4877;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    private static int field4878;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    private static int field4881;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    private static int field4882;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    private static int field4887;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    private static int field4888;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    private static int field4889;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    private static int field4892;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "[I")
    private static int[] field4890;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "[I")
    private static int[] field4891;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "[Lk;")
    public static class255[] field4885;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "[Z")
    private static boolean[] field4883;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "[Z")
    private static boolean[] field4886;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "[[[I")
    private static int[][][] field4880;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[[[Lvb;)V", line = 4)
    public static final void method2148(int arg0, int arg1, class79[][][] arg2) {
        if (!class309.field4812) {
            return;
        }
        GL var3 = class73.field1051;
        class241.method1672(0, -126, 0);
        class73.method519(0);
        class73.method552();
        class73.method537(class73.field1083);
        var3.glDepthMask(false);
        class73.method544(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field4879; var4++) {
            class255 var5 = field4885[var4];
            int var6 = var5.field3911;
            if (var5.field3893) {
                var6--;
            }
            if (var5.field3885 != null) {
                int var7 = 0;
                int var8 = (var5.field3902 >> 7) - var5.field3908;
                int var9 = (var5.field3902 >> 7) + var5.field3908;
                if (var9 >= class29.field345) {
                    var9 = class29.field345 - 1;
                }
                if (var8 < class75.field1087) {
                    var7 += class75.field1087 - var8;
                    var8 = class75.field1087;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field3904[var7++];
                    int var12 = (var11 >> 8) + ((var5.field3882 >> 7) - var5.field3908);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class162.field2629) {
                        var12 = class162.field2629;
                    }
                    if (var13 >= class30.field361) {
                        var13 = class30.field361 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class79 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field1163) {
                            class73.method522(201.5F - (float) var5.field3911 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field3889 }, 0);
                            var5.field3885.method496();
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
        var3.glFogfv(2918, class179.field2845, 0);
        var3.glEnableClientState(32888);
        class73.method550();
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "()V", line = 105)
    public static void method2149() {
        field4885 = null;
        field4880 = (int[][][]) null;
        field4891 = null;
        field4883 = null;
        field4884 = null;
        field4890 = null;
        field4886 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILk;III)V", line = 116)
    private static final void method2150(int arg0, class255 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class73.field1051;
        if (!field4883[arg0]) {
            var6.glEnable(var5);
            field4883[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field3912);
        var6.glLightfv(var5, 4609, arg1.field3896, 0);
        field4884[0] = (float) (arg1.field3882 - arg2);
        field4884[1] = (float) (arg1.field3895 - arg3);
        field4884[2] = (float) (arg1.field3902 - arg4);
        var6.glLightfv(var5, 4611, field4884, 0);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 135)
    private static final void method2151(int arg0) {
        if (field4883[arg0]) {
            field4883[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class73.field1051;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "()V", line = 148)
    public static final void method2152() {
        GL var0 = class73.field1051;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field4891[var3] = -1;
            method2151(var3);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)V", line = 177)
    public static final void method2153(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field4879; var2++) {
            field4885[var2].method1791(arg0, (byte) 45, arg1);
        }
        field4888 = -1;
        field4887 = -1;
        field4877 = -1;
        field4881 = -1;
        field4882 = -1;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "()V", line = 191)
    public static final void method2154() {
        field4885 = new class255[255];
        field4891 = new int[4];
        field4883 = new boolean[4];
        field4890 = new int[4];
        field4886 = new boolean[4];
        field4880 = new int[field4878][field4889][field4892];
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "()V", line = 207)
    public static final void method2155() {
        for (int var0 = 0; var0 < 4; var0++) {
            field4891[var0] = -1;
            method2151(var0);
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "()V", line = 219)
    public static final void method2156() {
        field4879 = 0;
        for (int var0 = 0; var0 < field4878; var0++) {
            for (int var1 = 0; var1 < field4889; var1++) {
                for (int var2 = 0; var2 < field4892; var2++) {
                    field4880[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lk;)V", line = 252)
    public static final void method2157(class255 arg0) {
        if (field4879 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field4885[field4879++] = arg0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "()V", line = 263)
    public static final void method2158() {
        field4885 = null;
        field4891 = null;
        field4883 = null;
        field4890 = null;
        field4886 = null;
        field4880 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIII)V", line = 271)
    public static final void method2159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class309.field4812 || field4888 == arg3 && field4887 == arg4 && field4877 == arg5 && field4881 == arg4 && field4882 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field4886[var6] = false;
        }
        int var7 = 0;
        int var8 = field4880[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field4891[var10] == var9) {
                        field4886[var10] = true;
                        continue label72;
                    }
                }
                field4890[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field4886[var12]) {
                        field4891[var12] = field4890[var11];
                        field4886[var12] = true;
                        method2150(var12, field4885[field4890[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field4886[var13]) {
                    field4891[var13] = -1;
                    method2151(var13);
                }
            }
            field4888 = arg3;
            field4887 = arg4;
            field4877 = arg5;
            field4881 = arg4;
            field4882 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII)V", line = 358)
    public static final void method2160(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class309.field4812) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field4891[var5] != -1) {
                int var6 = field4880[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field4891[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field4880[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field4891[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field4891[var5] = -1;
            method2151(var5);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V", line = 403)
    public static final void method2161(int arg0, int arg1, int arg2) {
        field4878 = arg0;
        field4889 = arg1;
        field4892 = arg2;
        field4880 = new int[field4878][field4889][field4892];
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIII)V", line = 414)
    public static final void method2162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class309.field4812 || field4888 == arg3 && field4887 == arg4 && field4877 == arg5 && field4881 == arg6 && field4882 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field4886[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field4880[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field4890[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field4891[var16] == var14) {
                                    if (!field4886[var16]) {
                                        field4886[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field4890[var10++] = var14;
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
                if (!field4886[var18]) {
                    field4891[var18] = field4890[var17];
                    field4886[var18] = true;
                    method2150(var18, field4885[field4890[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field4886[var19]) {
                field4891[var19] = -1;
                method2151(var19);
            }
        }
        field4888 = arg3;
        field4887 = arg4;
        field4877 = arg5;
        field4881 = arg6;
        field4882 = arg7;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIII)V", line = 544)
    public static final void method2163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class309.field4812) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method2159(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field4889 - 1) {
            method2159(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method2159(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field4892 - 1) {
            method2159(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field4892 - 1) {
            method2159(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field4889 - 1 && arg6 < field4892 - 1) {
            method2159(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method2159(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field4889 - 1 && arg6 > 0) {
            method2159(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "()V", line = 602)
    public static final void method2164() {
        for (int var0 = 0; var0 < field4879; var0++) {
            class255 var1 = field4885[var0];
            int var2 = var1.field3911;
            if (var1.field3905) {
                var2 = 0;
            }
            int var3 = var1.field3911;
            if (var1.field3903) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field3902 >> 7) - var1.field3908;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field3902 >> 7) + var1.field3908;
                if (var7 > field4892 - 1) {
                    var7 = field4892 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field3904[var5++];
                    int var10 = (var9 >> 8) + ((var1.field3882 >> 7) - var1.field3908);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field4889 - 1) {
                        var11 = field4889 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field4880[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field4880[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field4880[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field4880[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field4880[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }
}
