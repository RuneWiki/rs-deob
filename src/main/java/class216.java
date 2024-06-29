import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class216 {

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field3710 = 0;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "[F")
    private static float[] field3715 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    private static int field3701;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    private static int field3705;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    private static int field3706;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    private static int field3707;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    private static int field3708;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    private static int field3709;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    private static int field3713;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    private static int field3714;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "[I")
    private static int[] field3700;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "[I")
    private static int[] field3712;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "[Ldb;")
    public static class186[] field3703;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "[Z")
    private static boolean[] field3704;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "[Z")
    private static boolean[] field3711;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "[[[I")
    private static int[][][] field3702;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()V", line = 7)
    public static final void method1481() {
        for (int var0 = 0; var0 < 4; var0++) {
            field3712[var0] = -1;
            method1486(var0);
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()V", line = 18)
    public static final void method1482() {
        GL var0 = class108.field1899;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        field3703 = new class186[255];
        field3712 = new int[4];
        field3704 = new boolean[4];
        field3700 = new int[4];
        field3711 = new boolean[4];
        field3702 = new int[field3713][field3705][field3709];
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIII)V", line = 40)
    public static final void method1483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class329.field5607 || field3707 == arg3 && field3706 == arg4 && field3708 == arg5 && field3701 == arg4 && field3714 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field3711[var6] = false;
        }
        int var7 = 0;
        int var8 = field3702[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field3712[var10] == var9) {
                        field3711[var10] = true;
                        continue label72;
                    }
                }
                field3700[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field3711[var12]) {
                        field3712[var12] = field3700[var11];
                        field3711[var12] = true;
                        method1494(var12, field3703[field3700[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field3711[var13]) {
                    field3712[var13] = -1;
                    method1486(var13);
                }
            }
            field3707 = arg3;
            field3706 = arg4;
            field3708 = arg5;
            field3701 = arg4;
            field3714 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIII)V", line = 133)
    public static final void method1484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class329.field5607 || field3707 == arg3 && field3706 == arg4 && field3708 == arg5 && field3701 == arg6 && field3714 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field3711[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field3702[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field3700[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field3712[var16] == var14) {
                                    if (!field3711[var16]) {
                                        field3711[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field3700[var10++] = var14;
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
                if (!field3711[var18]) {
                    field3712[var18] = field3700[var17];
                    field3711[var18] = true;
                    method1494(var18, field3703[field3700[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field3711[var19]) {
                field3712[var19] = -1;
                method1486(var19);
            }
        }
        field3707 = arg3;
        field3706 = arg4;
        field3708 = arg5;
        field3701 = arg6;
        field3714 = arg7;
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "()V", line = 267)
    public static final void method1485() {
        field3703 = null;
        field3712 = null;
        field3704 = null;
        field3700 = null;
        field3711 = null;
        field3702 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 276)
    private static final void method1486(int arg0) {
        if (field3704[arg0]) {
            field3704[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class108.field1899;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIII)V", line = 287)
    public static final void method1487(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class329.field5607) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field3712[var5] != -1) {
                int var6 = field3702[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field3712[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field3702[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field3712[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field3712[var5] = -1;
            method1486(var5);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[[[Llf;)V", line = 330)
    public static final void method1488(int arg0, int arg1, class125[][][] arg2) {
        if (!class329.field5607) {
            return;
        }
        GL var3 = class108.field1899;
        class257.method1832((byte) 113, 0, 0);
        class108.method766(0);
        class108.method764();
        class108.method736(class108.field1892);
        var3.glDepthMask(false);
        class108.method771(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label58: for (int var4 = 0; var4 < field3710; var4++) {
            class186 var5 = field3703[var4];
            if (var5.field3252 != null) {
                int var6 = 0;
                int var7 = (var5.field3253 >> 7) - var5.field3263;
                int var8 = (var5.field3253 >> 7) + var5.field3263;
                if (var8 >= class137.field2380) {
                    var8 = class137.field2380 - 1;
                }
                if (var7 < class5.field49) {
                    var6 += class5.field49 - var7;
                    var7 = class5.field49;
                }
                for (int var9 = var7; var9 <= var8; var9++) {
                    short var10 = var5.field3251[var6++];
                    int var11 = (var10 >> 8) + ((var5.field3266 >> 7) - var5.field3263);
                    int var12 = (var10 & 0xFF) + var11 - 1;
                    if (var11 < class211.field3631) {
                        var11 = class211.field3631;
                    }
                    if (var12 >= class167.field2867) {
                        var12 = class167.field2867 - 1;
                    }
                    for (int var13 = var11; var13 <= var12; var13++) {
                        class125 var14 = arg2[var5.field3264][var13][var9];
                        if (var14 != null && var14.field2212) {
                            class108.method756(201.5F - (float) var5.field3264 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field3274 }, 0);
                            var5.field3252.method1190();
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
        var3.glFogfv(2918, class276.field4755, 0);
        var3.glEnableClientState(32888);
        class108.method762();
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIII)V", line = 423)
    public static final void method1489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class329.field5607) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1483(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field3705 - 1) {
            method1483(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1483(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field3709 - 1) {
            method1483(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field3709 - 1) {
            method1483(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field3705 - 1 && arg6 < field3709 - 1) {
            method1483(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1483(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field3705 - 1 && arg6 > 0) {
            method1483(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)V", line = 479)
    public static final void method1490(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field3710; var2++) {
            field3703[var2].method1296(arg1, 69, arg0);
        }
        field3707 = -1;
        field3706 = -1;
        field3708 = -1;
        field3701 = -1;
        field3714 = -1;
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "()V", line = 495)
    public static final void method1491() {
        for (int var0 = 0; var0 < field3710; var0++) {
            class186 var1 = field3703[var0];
            int var2 = var1.field3264;
            if (var1.field3272) {
                var2 = 0;
            }
            int var3 = var1.field3264;
            if (var1.field3245) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field3253 >> 7) - var1.field3263;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field3253 >> 7) + var1.field3263;
                if (var7 > field3709 - 1) {
                    var7 = field3709 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field3251[var5++];
                    int var10 = (var9 >> 8) + ((var1.field3266 >> 7) - var1.field3263);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field3705 - 1) {
                        var11 = field3705 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field3702[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field3702[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field3702[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field3702[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field3702[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ldb;)V", line = 583)
    public static final void method1492(class186 arg0) {
        if (field3710 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field3703[field3710++] = arg0;
        }
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "()V", line = 600)
    public static void method1493() {
        field3703 = null;
        field3702 = (int[][][]) null;
        field3712 = null;
        field3704 = null;
        field3715 = null;
        field3700 = null;
        field3711 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILdb;III)V", line = 611)
    private static final void method1494(int arg0, class186 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class108.field1899;
        if (!field3704[arg0]) {
            var6.glEnable(var5);
            field3704[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field3277);
        var6.glLightfv(var5, 4609, arg1.field3256, 0);
        field3715[0] = (float) (arg1.field3266 - arg2);
        field3715[1] = (float) (arg1.field3254 - arg3);
        field3715[2] = (float) (arg1.field3253 - arg4);
        var6.glLightfv(var5, 4611, field3715, 0);
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "()V", line = 629)
    public static final void method1495() {
        field3710 = 0;
        for (int var0 = 0; var0 < field3713; var0++) {
            for (int var1 = 0; var1 < field3705; var1++) {
                for (int var2 = 0; var2 < field3709; var2++) {
                    field3702[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V", line = 657)
    public static final void method1496(int arg0, int arg1, int arg2) {
        field3713 = arg0;
        field3705 = arg1;
        field3709 = arg2;
    }
}
