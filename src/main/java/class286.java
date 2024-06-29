import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class286 {

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "[F")
    private static float[] field4401 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field4412 = 0;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    private static int field4398;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    private static int field4399;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    private static int field4400;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    private static int field4404;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    private static int field4405;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    private static int field4408;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    private static int field4409;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    private static int field4410;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "[I")
    private static int[] field4402;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "[I")
    private static int[] field4403;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "[Lcj;")
    public static class318[] field4411;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "[Z")
    private static boolean[] field4406;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "[Z")
    private static boolean[] field4407;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "[[[I")
    private static int[][][] field4413;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "()V", line = 11)
    public static final void method2003() {
        field4412 = 0;
        for (int var0 = 0; var0 < field4400; var0++) {
            for (int var1 = 0; var1 < field4410; var1++) {
                for (int var2 = 0; var2 < field4409; var2++) {
                    field4413[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIII)V", line = 41)
    public static final void method2004(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class175.field2589 || field4399 == arg3 && field4405 == arg4 && field4404 == arg5 && field4398 == arg4 && field4408 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field4407[var6] = false;
        }
        int var7 = 0;
        int var8 = field4413[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field4403[var10] == var9) {
                        field4407[var10] = true;
                        continue label72;
                    }
                }
                field4402[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field4407[var12]) {
                        field4403[var12] = field4402[var11];
                        field4407[var12] = true;
                        method2009(var12, field4411[field4402[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field4407[var13]) {
                    field4403[var13] = -1;
                    method2019(var13);
                }
            }
            field4399 = arg3;
            field4405 = arg4;
            field4404 = arg5;
            field4398 = arg4;
            field4408 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)V", line = 128)
    public static final void method2005(int arg0, int arg1, int arg2) {
        field4400 = arg0;
        field4410 = arg1;
        field4409 = arg2;
        field4413 = new int[field4400][field4410][field4409];
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "()V", line = 135)
    public static final void method2006() {
        GL var0 = class36.field518;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field4403[var3] = -1;
            method2019(var3);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIIIII)V", line = 161)
    public static final void method2007(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class175.field2589 || field4399 == arg3 && field4405 == arg4 && field4404 == arg5 && field4398 == arg6 && field4408 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field4407[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field4413[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field4402[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field4403[var16] == var14) {
                                    if (!field4407[var16]) {
                                        field4407[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field4402[var10++] = var14;
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
                if (!field4407[var18]) {
                    field4403[var18] = field4402[var17];
                    field4407[var18] = true;
                    method2009(var18, field4411[field4402[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field4407[var19]) {
                field4403[var19] = -1;
                method2019(var19);
            }
        }
        field4399 = arg3;
        field4405 = arg4;
        field4404 = arg5;
        field4398 = arg6;
        field4408 = arg7;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIIII)V", line = 290)
    public static final void method2008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class175.field2589) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method2004(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field4410 - 1) {
            method2004(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method2004(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field4409 - 1) {
            method2004(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field4409 - 1) {
            method2004(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field4410 - 1 && arg6 < field4409 - 1) {
            method2004(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method2004(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field4410 - 1 && arg6 > 0) {
            method2004(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILcj;III)V", line = 345)
    private static final void method2009(int arg0, class318 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class36.field518;
        if (!field4406[arg0]) {
            var6.glEnable(var5);
            field4406[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field4956);
        var6.glLightfv(var5, 4609, arg1.field4934, 0);
        field4401[0] = (float) (arg1.field4931 - arg2);
        field4401[1] = (float) (arg1.field4935 - arg3);
        field4401[2] = (float) (arg1.field4952 - arg4);
        var6.glLightfv(var5, 4611, field4401, 0);
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "()V", line = 364)
    public static final void method2010() {
        for (int var0 = 0; var0 < 4; var0++) {
            field4403[var0] = -1;
            method2019(var0);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II[[[Lp;)V", line = 376)
    public static final void method2011(int arg0, int arg1, class99[][][] arg2) {
        if (!class175.field2589) {
            return;
        }
        GL var3 = class36.field518;
        class309.method2143(0, -119, 0);
        class36.method313(0);
        class36.method320();
        class36.method310(class36.field535);
        var3.glDepthMask(false);
        class36.method337(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field4412; var4++) {
            class318 var5 = field4411[var4];
            int var6 = var5.field4937;
            if (var5.field4936) {
                var6--;
            }
            if (var5.field4944 != null) {
                int var7 = 0;
                int var8 = (var5.field4952 >> 7) - var5.field4941;
                int var9 = (var5.field4952 >> 7) + var5.field4941;
                if (var9 >= class29.field335) {
                    var9 = class29.field335 - 1;
                }
                if (var8 < class102.field1580) {
                    var7 += class102.field1580 - var8;
                    var8 = class102.field1580;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field4950[var7++];
                    int var12 = (var11 >> 8) + ((var5.field4931 >> 7) - var5.field4941);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class117.field1841) {
                        var12 = class117.field1841;
                    }
                    if (var13 >= class90.field1311) {
                        var13 = class90.field1311 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class99 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field1485) {
                            class36.method330(201.5F - (float) var5.field4937 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field4946 }, 0);
                            var5.field4944.method1549();
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
        var3.glFogfv(2918, class264.field3952, 0);
        var3.glEnableClientState(32888);
        class36.method311();
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIII)V", line = 479)
    public static final void method2012(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class175.field2589) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field4403[var5] != -1) {
                int var6 = field4413[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field4403[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field4413[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field4403[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field4403[var5] = -1;
            method2019(var5);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZ)V", line = 524)
    public static final void method2013(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field4412; var2++) {
            field4411[var2].method2181((byte) 116, arg0, arg1);
        }
        field4399 = -1;
        field4405 = -1;
        field4404 = -1;
        field4398 = -1;
        field4408 = -1;
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "()V", line = 538)
    public static void method2014() {
        field4411 = null;
        field4413 = (int[][][]) null;
        field4403 = null;
        field4406 = null;
        field4401 = null;
        field4402 = null;
        field4407 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lcj;)V", line = 550)
    public static final void method2015(class318 arg0) {
        if (field4412 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field4411[field4412++] = arg0;
        }
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "()V", line = 561)
    public static final void method2016() {
        field4411 = null;
        field4403 = null;
        field4406 = null;
        field4402 = null;
        field4407 = null;
        field4413 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "()V", line = 572)
    public static final void method2017() {
        for (int var0 = 0; var0 < field4412; var0++) {
            class318 var1 = field4411[var0];
            int var2 = var1.field4937;
            if (var1.field4958) {
                var2 = 0;
            }
            int var3 = var1.field4937;
            if (var1.field4933) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field4952 >> 7) - var1.field4941;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field4952 >> 7) + var1.field4941;
                if (var7 > field4409 - 1) {
                    var7 = field4409 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field4950[var5++];
                    int var10 = (var9 >> 8) + ((var1.field4931 >> 7) - var1.field4941);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field4410 - 1) {
                        var11 = field4410 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field4413[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field4413[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field4413[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field4413[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field4413[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "()V", line = 663)
    public static final void method2018() {
        field4411 = new class318[255];
        field4403 = new int[4];
        field4406 = new boolean[4];
        field4402 = new int[4];
        field4407 = new boolean[4];
        field4413 = new int[field4400][field4410][field4409];
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 679)
    private static final void method2019(int arg0) {
        if (field4406[arg0]) {
            field4406[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class36.field518;
            var2.glDisable(var1);
        }
    }
}
