import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class62 {

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "[F")
    private static float[] field885 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field891 = 0;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    private static int field883;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    private static int field884;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    private static int field887;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    private static int field888;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    private static int field890;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    private static int field892;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    private static int field893;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    private static int field896;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "[I")
    private static int[] field894;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "[I")
    private static int[] field895;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "[Lla;")
    public static class195[] field889;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "[Z")
    private static boolean[] field886;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "[Z")
    private static boolean[] field897;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "[[[I")
    private static int[][][] field898;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()V", line = 4)
    public static final void method420() {
        field891 = 0;
        for (int var0 = 0; var0 < field896; var0++) {
            for (int var1 = 0; var1 < field888; var1++) {
                for (int var2 = 0; var2 < field887; var2++) {
                    field898[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "()V", line = 35)
    public static final void method421() {
        for (int var0 = 0; var0 < field891; var0++) {
            class195 var1 = field889[var0];
            int var2 = var1.field3262;
            if (var1.field3241) {
                var2 = 0;
            }
            int var3 = var1.field3262;
            if (var1.field3259) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field3263 >> 7) - var1.field3264;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field3263 >> 7) + var1.field3264;
                if (var7 > field887 - 1) {
                    var7 = field887 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field3258[var5++];
                    int var10 = (var9 >> 8) + ((var1.field3244 >> 7) - var1.field3264);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field888 - 1) {
                        var11 = field888 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field898[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field898[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field898[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field898[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field898[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[[[Lkk;)V", line = 123)
    public static final void method422(int arg0, int arg1, class72[][][] arg2) {
        if (!class88.field1483) {
            return;
        }
        GL var3 = class99.field1682;
        class285.method1964(121, 0, 0);
        class99.method758(0);
        class99.method750();
        class99.method749(class99.field1694);
        var3.glDepthMask(false);
        class99.method730(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label58: for (int var4 = 0; var4 < field891; var4++) {
            class195 var5 = field889[var4];
            if (var5.field3255 != null) {
                int var6 = 0;
                int var7 = (var5.field3263 >> 7) - var5.field3264;
                int var8 = (var5.field3263 >> 7) + var5.field3264;
                if (var8 >= class324.field5543) {
                    var8 = class324.field5543 - 1;
                }
                if (var7 < class328.field5589) {
                    var6 += class328.field5589 - var7;
                    var7 = class328.field5589;
                }
                for (int var9 = var7; var9 <= var8; var9++) {
                    short var10 = var5.field3258[var6++];
                    int var11 = (var10 >> 8) + ((var5.field3244 >> 7) - var5.field3264);
                    int var12 = (var10 & 0xFF) + var11 - 1;
                    if (var11 < class70.field1182) {
                        var11 = class70.field1182;
                    }
                    if (var12 >= class141.field2274) {
                        var12 = class141.field2274 - 1;
                    }
                    for (int var13 = var11; var13 <= var12; var13++) {
                        class72 var14 = arg2[var5.field3262][var13][var9];
                        if (var14 != null && var14.field1217) {
                            class99.method741(201.5F - (float) var5.field3262 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field3257 }, 0);
                            var5.field3255.method284();
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
        var3.glFogfv(2918, class117.field1975, 0);
        var3.glEnableClientState(32888);
        class99.method764();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)V", line = 222)
    public static final void method423(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field891; var2++) {
            field889[var2].method1380(arg1, -8, arg0);
        }
        field892 = -1;
        field883 = -1;
        field890 = -1;
        field893 = -1;
        field884 = -1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIII)V", line = 237)
    public static final void method424(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class88.field1483) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field894[var5] != -1) {
                int var6 = field898[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field894[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field898[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field894[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field894[var5] = -1;
            method433(var5);
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "()V", line = 282)
    public static final void method425() {
        for (int var0 = 0; var0 < 4; var0++) {
            field894[var0] = -1;
            method433(var0);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIII)V", line = 292)
    public static final void method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class88.field1483) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method431(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field888 - 1) {
            method431(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method431(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field887 - 1) {
            method431(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field887 - 1) {
            method431(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field888 - 1 && arg6 < field887 - 1) {
            method431(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method431(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field888 - 1 && arg6 > 0) {
            method431(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIIII)V", line = 346)
    public static final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class88.field1483 || field892 == arg3 && field883 == arg4 && field890 == arg5 && field893 == arg6 && field884 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field897[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field898[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field895[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field894[var16] == var14) {
                                    if (!field897[var16]) {
                                        field897[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field895[var10++] = var14;
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
                if (!field897[var18]) {
                    field894[var18] = field895[var17];
                    field897[var18] = true;
                    method434(var18, field889[field895[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field897[var19]) {
                field894[var19] = -1;
                method433(var19);
            }
        }
        field892 = arg3;
        field883 = arg4;
        field890 = arg5;
        field893 = arg6;
        field884 = arg7;
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "()V", line = 476)
    public static final void method428() {
        field889 = null;
        field894 = null;
        field886 = null;
        field895 = null;
        field897 = null;
        field898 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lla;)V", line = 495)
    public static final void method429(class195 arg0) {
        if (field891 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field889[field891++] = arg0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "()V", line = 507)
    public static void method430() {
        field889 = null;
        field898 = (int[][][]) null;
        field894 = null;
        field886 = null;
        field885 = null;
        field895 = null;
        field897 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIII)V", line = 516)
    public static final void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class88.field1483 || field892 == arg3 && field883 == arg4 && field890 == arg5 && field893 == arg4 && field884 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field897[var6] = false;
        }
        int var7 = 0;
        int var8 = field898[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field894[var10] == var9) {
                        field897[var10] = true;
                        continue label72;
                    }
                }
                field895[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field897[var12]) {
                        field894[var12] = field895[var11];
                        field897[var12] = true;
                        method434(var12, field889[field895[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field897[var13]) {
                    field894[var13] = -1;
                    method433(var13);
                }
            }
            field892 = arg3;
            field883 = arg4;
            field890 = arg5;
            field893 = arg4;
            field884 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V", line = 603)
    public static final void method432(int arg0, int arg1, int arg2) {
        field896 = arg0;
        field888 = arg1;
        field887 = arg2;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 611)
    private static final void method433(int arg0) {
        if (field886[arg0]) {
            field886[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class99.field1682;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILla;III)V", line = 628)
    private static final void method434(int arg0, class195 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class99.field1682;
        if (!field886[arg0]) {
            var6.glEnable(var5);
            field886[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field3245);
        var6.glLightfv(var5, 4609, arg1.field3254, 0);
        field885[0] = (float) (arg1.field3244 - arg2);
        field885[1] = (float) (arg1.field3261 - arg3);
        field885[2] = (float) (arg1.field3263 - arg4);
        var6.glLightfv(var5, 4611, field885, 0);
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "()V", line = 647)
    public static final void method435() {
        GL var0 = class99.field1682;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        field889 = new class195[255];
        field894 = new int[4];
        field886 = new boolean[4];
        field895 = new int[4];
        field897 = new boolean[4];
        field898 = new int[field896][field888][field887];
    }
}
