import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class24 {

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "[F")
    private static float[] field413 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field409 = 0;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    private static int field416;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    private static int field417;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    private static int field419;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    private static int field420;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    private static int field421;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    private static int field422;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    private static int field423;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    private static int field424;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "[I")
    private static int[] field411;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "[I")
    private static int[] field415;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "[Lvb;")
    public static class54[] field412;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "[Z")
    private static boolean[] field410;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "[Z")
    private static boolean[] field418;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "[[[I")
    private static int[][][] field414;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIII)V", line = 7)
    public static final void method198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class81.field1131 || field420 == arg3 && field417 == arg4 && field416 == arg5 && field423 == arg4 && field419 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field418[var6] = false;
        }
        int var7 = 0;
        int var8 = field414[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field411[var10] == var9) {
                        field418[var10] = true;
                        continue label72;
                    }
                }
                field415[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field418[var12]) {
                        field411[var12] = field415[var11];
                        field418[var12] = true;
                        method203(var12, field412[field415[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field418[var13]) {
                    field411[var13] = -1;
                    method204(var13);
                }
            }
            field420 = arg3;
            field417 = arg4;
            field416 = arg5;
            field423 = arg4;
            field419 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()V", line = 100)
    public static final void method199() {
        for (int var0 = 0; var0 < 4; var0++) {
            field411[var0] = -1;
            method204(var0);
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "()V", line = 112)
    public static final void method200() {
        for (int var0 = 0; var0 < field409; var0++) {
            class54 var1 = field412[var0];
            int var2 = var1.field837;
            if (var1.field850) {
                var2 = 0;
            }
            int var3 = var1.field837;
            if (var1.field835) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field848 >> 7) - var1.field854;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field848 >> 7) + var1.field854;
                if (var7 > field422 - 1) {
                    var7 = field422 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field845[var5++];
                    int var10 = (var9 >> 8) + ((var1.field838 >> 7) - var1.field854);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field424 - 1) {
                        var11 = field424 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field414[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field414[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field414[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field414[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field414[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIII)V", line = 200)
    public static final void method201(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class81.field1131) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field411[var5] != -1) {
                int var6 = field414[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field411[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field414[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field411[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field411[var5] = -1;
            method204(var5);
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "()V", line = 244)
    public static final void method202() {
        field412 = new class54[255];
        field411 = new int[4];
        field410 = new boolean[4];
        field415 = new int[4];
        field418 = new boolean[4];
        field414 = new int[field421][field424][field422];
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILvb;III)V", line = 253)
    private static final void method203(int arg0, class54 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class217.field3551;
        if (!field410[arg0]) {
            var6.glEnable(var5);
            field410[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field842);
        var6.glLightfv(var5, 4609, arg1.field852, 0);
        field413[0] = (float) (arg1.field838 - arg2);
        field413[1] = (float) (arg1.field849 - arg3);
        field413[2] = (float) (arg1.field848 - arg4);
        var6.glLightfv(var5, 4611, field413, 0);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 270)
    private static final void method204(int arg0) {
        if (field410[arg0]) {
            field410[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class217.field3551;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "()V", line = 287)
    public static final void method205() {
        GL var0 = class217.field3551;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field411[var3] = -1;
            method204(var3);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIII)V", line = 313)
    public static final void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class81.field1131 || field420 == arg3 && field417 == arg4 && field416 == arg5 && field423 == arg6 && field419 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field418[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field414[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field415[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field411[var16] == var14) {
                                    if (!field418[var16]) {
                                        field418[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field415[var10++] = var14;
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
                if (!field418[var18]) {
                    field411[var18] = field415[var17];
                    field418[var18] = true;
                    method203(var18, field412[field415[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field418[var19]) {
                field411[var19] = -1;
                method204(var19);
            }
        }
        field420 = arg3;
        field417 = arg4;
        field416 = arg5;
        field423 = arg6;
        field419 = arg7;
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "()V", line = 445)
    public static final void method207() {
        field412 = null;
        field411 = null;
        field410 = null;
        field415 = null;
        field418 = null;
        field414 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V", line = 453)
    public static final void method208(int arg0, int arg1, int arg2) {
        field421 = arg0;
        field424 = arg1;
        field422 = arg2;
        field414 = new int[field421][field424][field422];
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIII)V", line = 461)
    public static final void method209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class81.field1131) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method198(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field424 - 1) {
            method198(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method198(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field422 - 1) {
            method198(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field422 - 1) {
            method198(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field424 - 1 && arg6 < field422 - 1) {
            method198(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method198(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field424 - 1 && arg6 > 0) {
            method198(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)V", line = 516)
    public static final void method210(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field409; var2++) {
            field412[var2].method363(arg1, arg0, (byte) 42);
        }
        field420 = -1;
        field417 = -1;
        field416 = -1;
        field423 = -1;
        field419 = -1;
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "()V", line = 539)
    public static void method211() {
        field412 = null;
        field414 = (int[][][]) null;
        field411 = null;
        field410 = null;
        field413 = null;
        field415 = null;
        field418 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[[[Lkb;)V", line = 550)
    public static final void method212(int arg0, int arg1, class34[][][] arg2) {
        if (!class81.field1131) {
            return;
        }
        GL var3 = class217.field3551;
        class89.method587(0, 0, -48);
        class217.method1454(0);
        class217.method1458();
        class217.method1457(class217.field3523);
        var3.glDepthMask(false);
        class217.method1469(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field409; var4++) {
            class54 var5 = field412[var4];
            int var6 = var5.field837;
            if (var5.field830) {
                var6--;
            }
            if (var5.field841 != null) {
                int var7 = 0;
                int var8 = (var5.field848 >> 7) - var5.field854;
                int var9 = (var5.field848 >> 7) + var5.field854;
                if (var9 >= class314.field5445) {
                    var9 = class314.field5445 - 1;
                }
                if (var8 < class237.field3878) {
                    var7 += class237.field3878 - var8;
                    var8 = class237.field3878;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field845[var7++];
                    int var12 = (var11 >> 8) + ((var5.field838 >> 7) - var5.field854);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class195.field3130) {
                        var12 = class195.field3130;
                    }
                    if (var13 >= class134.field2068) {
                        var13 = class134.field2068 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class34 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field559) {
                            class217.method1488(201.5F - (float) var5.field837 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field856 }, 0);
                            var5.field841.method300();
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
        var3.glFogfv(2918, class14.field193, 0);
        var3.glEnableClientState(32888);
        class217.method1483();
    }

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "()V", line = 651)
    public static final void method213() {
        field409 = 0;
        for (int var0 = 0; var0 < field421; var0++) {
            for (int var1 = 0; var1 < field424; var1++) {
                for (int var2 = 0; var2 < field422; var2++) {
                    field414[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lvb;)V", line = 679)
    public static final void method214(class54 arg0) {
        if (field409 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field412[field409++] = arg0;
        }
    }
}
