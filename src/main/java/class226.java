import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class226 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "[F")
    private static float[] field3578 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field3588 = 0;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    private static int field3580;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    private static int field3581;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    private static int field3585;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    private static int field3586;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    private static int field3587;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    private static int field3590;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    private static int field3591;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    private static int field3592;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "[I")
    private static int[] field3579;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "[I")
    private static int[] field3584;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "[Lgi;")
    public static class215[] field3577;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "[Z")
    private static boolean[] field3582;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "[Z")
    private static boolean[] field3589;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "[[[I")
    private static int[][][] field3583;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method1500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class25.field360) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1505(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field3592 - 1) {
            method1505(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1505(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field3591 - 1) {
            method1505(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field3591 - 1) {
            method1505(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field3592 - 1 && arg6 < field3591 - 1) {
            method1505(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1505(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field3592 - 1 && arg6 > 0) {
            method1505(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lgi;)V", line = 61)
    public static final void method1501(class215 arg0) {
        if (field3588 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field3577[field3588++] = arg0;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "()V", line = 74)
    public static final void method1502() {
        for (int var0 = 0; var0 < 4; var0++) {
            field3584[var0] = -1;
            method1508(var0);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIII)V", line = 85)
    public static final void method1503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class25.field360 || field3585 == arg3 && field3587 == arg4 && field3580 == arg5 && field3590 == arg6 && field3581 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field3589[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field3583[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field3579[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field3584[var16] == var14) {
                                    if (!field3589[var16]) {
                                        field3589[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field3579[var10++] = var14;
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
                if (!field3589[var18]) {
                    field3584[var18] = field3579[var17];
                    field3589[var18] = true;
                    method1515(var18, field3577[field3579[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field3589[var19]) {
                field3584[var19] = -1;
                method1508(var19);
            }
        }
        field3585 = arg3;
        field3587 = arg4;
        field3580 = arg5;
        field3590 = arg6;
        field3581 = arg7;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V", line = 214)
    public static final void method1504(int arg0, int arg1, int arg2) {
        field3586 = arg0;
        field3592 = arg1;
        field3591 = arg2;
        field3583 = new int[field3586][field3592][field3591];
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIII)V", line = 221)
    public static final void method1505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class25.field360 || field3585 == arg3 && field3587 == arg4 && field3580 == arg5 && field3590 == arg4 && field3581 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field3589[var6] = false;
        }
        int var7 = 0;
        int var8 = field3583[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field3584[var10] == var9) {
                        field3589[var10] = true;
                        continue label72;
                    }
                }
                field3579[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field3589[var12]) {
                        field3584[var12] = field3579[var11];
                        field3589[var12] = true;
                        method1515(var12, field3577[field3579[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field3589[var13]) {
                    field3584[var13] = -1;
                    method1508(var13);
                }
            }
            field3585 = arg3;
            field3587 = arg4;
            field3580 = arg5;
            field3590 = arg4;
            field3581 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)V", line = 312)
    public static final void method1506(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field3588; var2++) {
            field3577[var2].method1440(arg1, arg0, -3696);
        }
        field3585 = -1;
        field3587 = -1;
        field3580 = -1;
        field3590 = -1;
        field3581 = -1;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "()V", line = 331)
    public static final void method1507() {
        for (int var0 = 0; var0 < field3588; var0++) {
            class215 var1 = field3577[var0];
            int var2 = var1.field3363;
            if (var1.field3346) {
                var2 = 0;
            }
            int var3 = var1.field3363;
            if (var1.field3372) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field3369 >> 7) - var1.field3355;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field3369 >> 7) + var1.field3355;
                if (var7 > field3591 - 1) {
                    var7 = field3591 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field3366[var5++];
                    int var10 = (var9 >> 8) + ((var1.field3362 >> 7) - var1.field3355);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field3592 - 1) {
                        var11 = field3592 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field3583[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field3583[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field3583[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field3583[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field3583[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 419)
    private static final void method1508(int arg0) {
        if (field3582[arg0]) {
            field3582[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class255.field4181;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIII)V", line = 430)
    public static final void method1509(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class25.field360) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field3584[var5] != -1) {
                int var6 = field3583[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field3584[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field3583[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field3584[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field3584[var5] = -1;
            method1508(var5);
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "()V", line = 473)
    public static final void method1510() {
        field3577 = null;
        field3584 = null;
        field3582 = null;
        field3579 = null;
        field3589 = null;
        field3583 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "()V", line = 481)
    public static void method1511() {
        field3577 = null;
        field3583 = (int[][][]) null;
        field3584 = null;
        field3582 = null;
        field3578 = null;
        field3579 = null;
        field3589 = null;
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "()V", line = 492)
    public static final void method1512() {
        GL var0 = class255.field4181;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field3584[var3] = -1;
            method1508(var3);
        }
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "()V", line = 521)
    public static final void method1513() {
        field3577 = new class215[255];
        field3584 = new int[4];
        field3582 = new boolean[4];
        field3579 = new int[4];
        field3589 = new boolean[4];
        field3583 = new int[field3586][field3592][field3591];
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II[[[Lbj;)V", line = 529)
    public static final void method1514(int arg0, int arg1, class55[][][] arg2) {
        if (!class25.field360) {
            return;
        }
        GL var3 = class255.field4181;
        class281.method1973(0, 0, 0);
        class255.method1796(0);
        class255.method1763();
        class255.method1790(class255.field4187);
        var3.glDepthMask(false);
        class255.method1777(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field3588; var4++) {
            class215 var5 = field3577[var4];
            int var6 = var5.field3363;
            if (var5.field3352) {
                var6--;
            }
            if (var5.field3373 != null) {
                int var7 = 0;
                int var8 = (var5.field3369 >> 7) - var5.field3355;
                int var9 = (var5.field3369 >> 7) + var5.field3355;
                if (var9 >= class136.field2079) {
                    var9 = class136.field2079 - 1;
                }
                if (var8 < class8.field94) {
                    var7 += class8.field94 - var8;
                    var8 = class8.field94;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field3366[var7++];
                    int var12 = (var11 >> 8) + ((var5.field3362 >> 7) - var5.field3355);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class139.field2121) {
                        var12 = class139.field2121;
                    }
                    if (var13 >= class9.field114) {
                        var13 = class9.field114 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class55 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field878) {
                            class255.method1772(201.5F - (float) var5.field3363 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field3368 }, 0);
                            var5.field3373.method1591();
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
        var3.glFogfv(2918, class289.field4819, 0);
        var3.glEnableClientState(32888);
        class255.method1786();
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILgi;III)V", line = 632)
    private static final void method1515(int arg0, class215 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class255.field4181;
        if (!field3582[arg0]) {
            var6.glEnable(var5);
            field3582[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field3371);
        var6.glLightfv(var5, 4609, arg1.field3380, 0);
        field3578[0] = (float) (arg1.field3362 - arg2);
        field3578[1] = (float) (arg1.field3354 - arg3);
        field3578[2] = (float) (arg1.field3369 - arg4);
        var6.glLightfv(var5, 4611, field3578, 0);
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "()V", line = 662)
    public static final void method1516() {
        field3588 = 0;
        for (int var0 = 0; var0 < field3586; var0++) {
            for (int var1 = 0; var1 < field3592; var1++) {
                for (int var2 = 0; var2 < field3591; var2++) {
                    field3583[var0][var1][var2] = 0;
                }
            }
        }
    }
}
