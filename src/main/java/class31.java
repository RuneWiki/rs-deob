import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class31 {

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "[F")
    private static float[] field415 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field409 = 0;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    private static int field408;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    private static int field412;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    private static int field413;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    private static int field416;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    private static int field419;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    private static int field420;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    private static int field421;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    private static int field422;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "[I")
    private static int[] field414;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "[I")
    private static int[] field418;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "[Lpe;")
    public static class266[] field411;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "[Z")
    private static boolean[] field410;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "[Z")
    private static boolean[] field417;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "[[[I")
    private static int[][][] field407;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILpe;III)V", line = 5)
    private static final void method201(int arg0, class266 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class117.field1801;
        if (!field417[arg0]) {
            var6.glEnable(var5);
            field417[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field4080);
        var6.glLightfv(var5, 4609, arg1.field4082, 0);
        field415[0] = (float) (arg1.field4088 - arg2);
        field415[1] = (float) (arg1.field4092 - arg3);
        field415[2] = (float) (arg1.field4074 - arg4);
        var6.glLightfv(var5, 4611, field415, 0);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIII)V", line = 22)
    public static final void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class292.field4447 || field412 == arg3 && field421 == arg4 && field420 == arg5 && field416 == arg4 && field408 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field410[var6] = false;
        }
        int var7 = 0;
        int var8 = field407[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field418[var10] == var9) {
                        field410[var10] = true;
                        continue label72;
                    }
                }
                field414[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field410[var12]) {
                        field418[var12] = field414[var11];
                        field410[var12] = true;
                        method201(var12, field411[field414[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field410[var13]) {
                    field418[var13] = -1;
                    method209(var13);
                }
            }
            field412 = arg3;
            field421 = arg4;
            field420 = arg5;
            field416 = arg4;
            field408 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIII)V", line = 110)
    public static final void method203(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class292.field4447) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field418[var5] != -1) {
                int var6 = field407[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field418[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field407[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field418[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field418[var5] = -1;
            method209(var5);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIII)V", line = 157)
    public static final void method204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class292.field4447) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method202(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field413 - 1) {
            method202(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method202(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field422 - 1) {
            method202(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field422 - 1) {
            method202(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field413 - 1 && arg6 < field422 - 1) {
            method202(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method202(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field413 - 1 && arg6 > 0) {
            method202(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()V", line = 211)
    public static final void method205() {
        GL var0 = class117.field1801;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field418[var3] = -1;
            method209(var3);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "()V", line = 240)
    public static final void method206() {
        for (int var0 = 0; var0 < field409; var0++) {
            class266 var1 = field411[var0];
            int var2 = var1.field4076;
            if (var1.field4083) {
                var2 = 0;
            }
            int var3 = var1.field4076;
            if (var1.field4073) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field4074 >> 7) - var1.field4098;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field4074 >> 7) + var1.field4098;
                if (var7 > field422 - 1) {
                    var7 = field422 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field4093[var5++];
                    int var10 = (var9 >> 8) + ((var1.field4088 >> 7) - var1.field4098);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field413 - 1) {
                        var11 = field413 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field407[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field407[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field407[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field407[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field407[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "()V", line = 330)
    public static void method207() {
        field411 = null;
        field407 = (int[][][]) null;
        field418 = null;
        field417 = null;
        field415 = null;
        field414 = null;
        field410 = null;
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "()V", line = 339)
    public static final void method208() {
        field411 = new class266[255];
        field418 = new int[4];
        field417 = new boolean[4];
        field414 = new int[4];
        field410 = new boolean[4];
        field407 = new int[field419][field413][field422];
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 347)
    private static final void method209(int arg0) {
        if (field417[arg0]) {
            field417[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class117.field1801;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II[[[Lum;)V", line = 362)
    public static final void method210(int arg0, int arg1, class221[][][] arg2) {
        if (!class292.field4447) {
            return;
        }
        GL var3 = class117.field1801;
        class204.method1397(-46, 0, 0);
        class117.method809(0);
        class117.method821();
        class117.method814(class117.field1788);
        var3.glDepthMask(false);
        class117.method830(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field409; var4++) {
            class266 var5 = field411[var4];
            int var6 = var5.field4076;
            if (var5.field4086) {
                var6--;
            }
            if (var5.field4085 != null) {
                int var7 = 0;
                int var8 = (var5.field4074 >> 7) - var5.field4098;
                int var9 = (var5.field4074 >> 7) + var5.field4098;
                if (var9 >= class76.field993) {
                    var9 = class76.field993 - 1;
                }
                if (var8 < class212.field3223) {
                    var7 += class212.field3223 - var8;
                    var8 = class212.field3223;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field4093[var7++];
                    int var12 = (var11 >> 8) + ((var5.field4088 >> 7) - var5.field4098);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class183.field2741) {
                        var12 = class183.field2741;
                    }
                    if (var13 >= class327.field4917) {
                        var13 = class327.field4917 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class221 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field3365) {
                            class117.method801(201.5F - (float) var5.field4076 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field4079 }, 0);
                            var5.field4085.method164();
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
        var3.glFogfv(2918, class280.field4254, 0);
        var3.glEnableClientState(32888);
        class117.method808();
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "()V", line = 465)
    public static final void method211() {
        for (int var0 = 0; var0 < 4; var0++) {
            field418[var0] = -1;
            method209(var0);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lpe;)V", line = 475)
    public static final void method212(class266 arg0) {
        if (field409 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field411[field409++] = arg0;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)V", line = 495)
    public static final void method213(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field409; var2++) {
            field411[var2].method1865(arg0, arg1, -27366);
        }
        field412 = -1;
        field421 = -1;
        field420 = -1;
        field416 = -1;
        field408 = -1;
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "()V", line = 510)
    public static final void method214() {
        field411 = null;
        field418 = null;
        field417 = null;
        field414 = null;
        field410 = null;
        field407 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "()V", line = 518)
    public static final void method215() {
        field409 = 0;
        for (int var0 = 0; var0 < field419; var0++) {
            for (int var1 = 0; var1 < field413; var1++) {
                for (int var2 = 0; var2 < field422; var2++) {
                    field407[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V", line = 547)
    public static final void method216(int arg0, int arg1, int arg2) {
        field419 = arg0;
        field413 = arg1;
        field422 = arg2;
        field407 = new int[field419][field413][field422];
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIII)V", line = 560)
    public static final void method217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class292.field4447 || field412 == arg3 && field421 == arg4 && field420 == arg5 && field416 == arg6 && field408 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field410[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field407[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field414[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field418[var16] == var14) {
                                    if (!field410[var16]) {
                                        field410[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field414[var10++] = var14;
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
                if (!field410[var18]) {
                    field418[var18] = field414[var17];
                    field410[var18] = true;
                    method201(var18, field411[field414[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field410[var19]) {
                field418[var19] = -1;
                method209(var19);
            }
        }
        field412 = arg3;
        field421 = arg4;
        field420 = arg5;
        field416 = arg6;
        field408 = arg7;
    }
}
