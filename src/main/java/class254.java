import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class254 {

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "[F")
    private static float[] field4035 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field4039 = 0;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    private static int field4025;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    private static int field4027;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    private static int field4029;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    private static int field4030;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    private static int field4031;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    private static int field4034;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    private static int field4036;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    private static int field4038;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "[I")
    private static int[] field4026;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "[I")
    private static int[] field4033;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "[Lni;")
    public static class241[] field4032;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "[Z")
    private static boolean[] field4024;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "[Z")
    private static boolean[] field4037;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "[[[I")
    private static int[][][] field4028;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()V", line = 6)
    public static final void method1796() {
        field4032 = new class241[255];
        field4033 = new int[4];
        field4024 = new boolean[4];
        field4026 = new int[4];
        field4037 = new boolean[4];
        field4028 = new int[field4031][field4030][field4027];
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 14)
    private static final void method1797(int arg0) {
        if (field4024[arg0]) {
            field4024[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class245.field3884;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIII)V", line = 26)
    public static final void method1798(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class322.field5287) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1807(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field4030 - 1) {
            method1807(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1807(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field4027 - 1) {
            method1807(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field4027 - 1) {
            method1807(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field4030 - 1 && arg6 < field4027 - 1) {
            method1807(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1807(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field4030 - 1 && arg6 > 0) {
            method1807(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIII)V", line = 79)
    public static final void method1799(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class322.field5287 || field4025 == arg3 && field4029 == arg4 && field4038 == arg5 && field4036 == arg6 && field4034 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field4037[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field4028[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field4026[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field4033[var16] == var14) {
                                    if (!field4037[var16]) {
                                        field4037[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field4026[var10++] = var14;
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
                if (!field4037[var18]) {
                    field4033[var18] = field4026[var17];
                    field4037[var18] = true;
                    method1803(var18, field4032[field4026[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field4037[var19]) {
                field4033[var19] = -1;
                method1797(var19);
            }
        }
        field4025 = arg3;
        field4029 = arg4;
        field4038 = arg5;
        field4036 = arg6;
        field4034 = arg7;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "()V", line = 208)
    public static final void method1800() {
        field4039 = 0;
        for (int var0 = 0; var0 < field4031; var0++) {
            for (int var1 = 0; var1 < field4030; var1++) {
                for (int var2 = 0; var2 < field4027; var2++) {
                    field4028[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)V", line = 238)
    public static final void method1801(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field4039; var2++) {
            field4032[var2].method1684(-1216, arg1, arg0);
        }
        field4025 = -1;
        field4029 = -1;
        field4038 = -1;
        field4036 = -1;
        field4034 = -1;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "()V", line = 254)
    public static void method1802() {
        field4032 = null;
        field4028 = (int[][][]) null;
        field4033 = null;
        field4024 = null;
        field4035 = null;
        field4026 = null;
        field4037 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILni;III)V", line = 264)
    private static final void method1803(int arg0, class241 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class245.field3884;
        if (!field4024[arg0]) {
            var6.glEnable(var5);
            field4024[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field3779);
        var6.glLightfv(var5, 4609, arg1.field3793, 0);
        field4035[0] = (float) (arg1.field3783 - arg2);
        field4035[1] = (float) (arg1.field3800 - arg3);
        field4035[2] = (float) (arg1.field3807 - arg4);
        var6.glLightfv(var5, 4611, field4035, 0);
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "()V", line = 283)
    public static final void method1804() {
        field4032 = null;
        field4033 = null;
        field4024 = null;
        field4026 = null;
        field4037 = null;
        field4028 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[[[Ljj;)V", line = 291)
    public static final void method1805(int arg0, int arg1, class50[][][] arg2) {
        if (!class322.field5287) {
            return;
        }
        GL var3 = class245.field3884;
        class7.method53(0, 0, true);
        class245.method1721(0);
        class245.method1710();
        class245.method1729(class245.field3853);
        var3.glDepthMask(false);
        class245.method1740(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field4039; var4++) {
            class241 var5 = field4032[var4];
            int var6 = var5.field3784;
            if (var5.field3805) {
                var6--;
            }
            if (var5.field3792 != null) {
                int var7 = 0;
                int var8 = (var5.field3807 >> 7) - var5.field3806;
                int var9 = (var5.field3807 >> 7) + var5.field3806;
                if (var9 >= class118.field1716) {
                    var9 = class118.field1716 - 1;
                }
                if (var8 < class214.field3303) {
                    var7 += class214.field3303 - var8;
                    var8 = class214.field3303;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field3804[var7++];
                    int var12 = (var11 >> 8) + ((var5.field3783 >> 7) - var5.field3806);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class352.field5611) {
                        var12 = class352.field5611;
                    }
                    if (var13 >= class92.field1333) {
                        var13 = class92.field1333 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class50 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field737) {
                            class245.method1714(201.5F - (float) var5.field3784 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field3808 }, 0);
                            var5.field3792.method2353();
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
        var3.glFogfv(2918, class234.field3721, 0);
        var3.glEnableClientState(32888);
        class245.method1723();
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "()V", line = 396)
    public static final void method1806() {
        GL var0 = class245.field3884;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field4033[var3] = -1;
            method1797(var3);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIII)V", line = 422)
    public static final void method1807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class322.field5287 || field4025 == arg3 && field4029 == arg4 && field4038 == arg5 && field4036 == arg4 && field4034 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field4037[var6] = false;
        }
        int var7 = 0;
        int var8 = field4028[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field4033[var10] == var9) {
                        field4037[var10] = true;
                        continue label72;
                    }
                }
                field4026[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field4037[var12]) {
                        field4033[var12] = field4026[var11];
                        field4037[var12] = true;
                        method1803(var12, field4032[field4026[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field4037[var13]) {
                    field4033[var13] = -1;
                    method1797(var13);
                }
            }
            field4025 = arg3;
            field4029 = arg4;
            field4038 = arg5;
            field4036 = arg4;
            field4034 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)V", line = 513)
    public static final void method1808(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class322.field5287) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field4033[var5] != -1) {
                int var6 = field4028[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field4033[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field4028[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field4033[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field4033[var5] = -1;
            method1797(var5);
        }
    }

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "()V", line = 560)
    public static final void method1809() {
        for (int var0 = 0; var0 < field4039; var0++) {
            class241 var1 = field4032[var0];
            int var2 = var1.field3784;
            if (var1.field3803) {
                var2 = 0;
            }
            int var3 = var1.field3784;
            if (var1.field3796) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field3807 >> 7) - var1.field3806;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field3807 >> 7) + var1.field3806;
                if (var7 > field4027 - 1) {
                    var7 = field4027 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field3804[var5++];
                    int var10 = (var9 >> 8) + ((var1.field3783 >> 7) - var1.field3806);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field4030 - 1) {
                        var11 = field4030 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field4028[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field4028[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field4028[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field4028[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field4028[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lni;)V", line = 649)
    public static final void method1810(class241 arg0) {
        if (field4039 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field4032[field4039++] = arg0;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V", line = 665)
    public static final void method1811(int arg0, int arg1, int arg2) {
        field4031 = arg0;
        field4030 = arg1;
        field4027 = arg2;
        field4028 = new int[field4031][field4030][field4027];
    }

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "()V", line = 676)
    public static final void method1812() {
        for (int var0 = 0; var0 < 4; var0++) {
            field4033[var0] = -1;
            method1797(var0);
        }
    }
}
