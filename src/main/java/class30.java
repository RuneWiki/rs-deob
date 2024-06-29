import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class30 {

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    public static int field428 = 0;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "[F")
    private static float[] field432 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    private static int field421;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    private static int field422;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    private static int field423;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    private static int field424;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    private static int field425;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
    private static int field431;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
    private static int field433;

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "I")
    private static int field435;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "[I")
    private static int[] field430;

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "[I")
    private static int[] field436;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "[Lfn;")
    public static class314[] field429;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "[Z")
    private static boolean[] field427;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "[Z")
    private static boolean[] field434;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "[[[I")
    private static int[][][] field426;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "()V", line = 5)
    public static final void method197() {
        GL var0 = class42.field627;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field430[var3] = -1;
            method205(var3);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIIII)V", line = 34)
    public static final void method198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class3.field36 || field425 == arg3 && field433 == arg4 && field435 == arg5 && field431 == arg6 && field422 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field427[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field426[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field436[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field430[var16] == var14) {
                                    if (!field427[var16]) {
                                        field427[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field436[var10++] = var14;
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
                if (!field427[var18]) {
                    field430[var18] = field436[var17];
                    field427[var18] = true;
                    method208(var18, field429[field436[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field427[var19]) {
                field430[var19] = -1;
                method205(var19);
            }
        }
        field425 = arg3;
        field433 = arg4;
        field435 = arg5;
        field431 = arg6;
        field422 = arg7;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "()V", line = 164)
    public static final void method199() {
        field429 = new class314[255];
        field430 = new int[4];
        field434 = new boolean[4];
        field436 = new int[4];
        field427 = new boolean[4];
        field426 = new int[field421][field423][field424];
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZ)V", line = 175)
    public static final void method200(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field428; var2++) {
            field429[var2].method2223(-2042198101, arg1, arg0);
        }
        field425 = -1;
        field433 = -1;
        field435 = -1;
        field431 = -1;
        field422 = -1;
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "()V", line = 194)
    public static final void method201() {
        for (int var0 = 0; var0 < 4; var0++) {
            field430[var0] = -1;
            method205(var0);
        }
    }

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "()V", line = 206)
    public static final void method202() {
        field428 = 0;
        for (int var0 = 0; var0 < field421; var0++) {
            for (int var1 = 0; var1 < field423; var1++) {
                for (int var2 = 0; var2 < field424; var2++) {
                    field426[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIII)V", line = 238)
    public static final void method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class3.field36) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method210(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field423 - 1) {
            method210(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method210(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field424 - 1) {
            method210(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field424 - 1) {
            method210(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field423 - 1 && arg6 < field424 - 1) {
            method210(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method210(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field423 - 1 && arg6 > 0) {
            method210(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "()V", line = 292)
    public static void method204() {
        field429 = null;
        field426 = (int[][][]) null;
        field430 = null;
        field434 = null;
        field432 = null;
        field436 = null;
        field427 = null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V", line = 301)
    private static final void method205(int arg0) {
        if (field434[arg0]) {
            field434[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class42.field627;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II[[[Laa;)V", line = 312)
    public static final void method206(int arg0, int arg1, class36[][][] arg2) {
        if (!class3.field36) {
            return;
        }
        GL var3 = class42.field627;
        class310.method2203(0, 0, 7);
        class42.method275(0);
        class42.method299();
        class42.method273(class42.field641);
        var3.glDepthMask(false);
        class42.method283(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field428; var4++) {
            class314 var5 = field429[var4];
            int var6 = var5.field5007;
            if (var5.field5015) {
                var6--;
            }
            if (var5.field4990 != null) {
                int var7 = 0;
                int var8 = (var5.field4999 >> 7) - var5.field4993;
                int var9 = (var5.field4999 >> 7) + var5.field4993;
                if (var9 >= class117.field1980) {
                    var9 = class117.field1980 - 1;
                }
                if (var8 < class159.field2533) {
                    var7 += class159.field2533 - var8;
                    var8 = class159.field2533;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field4992[var7++];
                    int var12 = (var11 >> 8) + ((var5.field5008 >> 7) - var5.field4993);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class184.field2971) {
                        var12 = class184.field2971;
                    }
                    if (var13 >= class83.field1414) {
                        var13 = class83.field1414 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class36 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field543) {
                            class42.method298(201.5F - (float) var5.field5007 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field5005 }, 0);
                            var5.field4990.method2020();
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
        var3.glFogfv(2918, class167.field2664, 0);
        var3.glEnableClientState(32888);
        class42.method287();
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIII)V", line = 414)
    public static final void method207(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class3.field36) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field430[var5] != -1) {
                int var6 = field426[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field430[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field426[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field430[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field430[var5] = -1;
            method205(var5);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILfn;III)V", line = 458)
    private static final void method208(int arg0, class314 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class42.field627;
        if (!field434[arg0]) {
            var6.glEnable(var5);
            field434[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field5004);
        var6.glLightfv(var5, 4609, arg1.field4989, 0);
        field432[0] = (float) (arg1.field5008 - arg2);
        field432[1] = (float) (arg1.field5002 - arg3);
        field432[2] = (float) (arg1.field4999 - arg4);
        var6.glLightfv(var5, 4611, field432, 0);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lfn;)V", line = 475)
    public static final void method209(class314 arg0) {
        if (field428 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field429[field428++] = arg0;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIII)V", line = 487)
    public static final void method210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class3.field36 || field425 == arg3 && field433 == arg4 && field435 == arg5 && field431 == arg4 && field422 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field427[var6] = false;
        }
        int var7 = 0;
        int var8 = field426[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field430[var10] == var9) {
                        field427[var10] = true;
                        continue label72;
                    }
                }
                field436[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field427[var12]) {
                        field430[var12] = field436[var11];
                        field427[var12] = true;
                        method208(var12, field429[field436[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field427[var13]) {
                    field430[var13] = -1;
                    method205(var13);
                }
            }
            field425 = arg3;
            field433 = arg4;
            field435 = arg5;
            field431 = arg4;
            field422 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)V", line = 574)
    public static final void method211(int arg0, int arg1, int arg2) {
        field421 = arg0;
        field423 = arg1;
        field424 = arg2;
        field426 = new int[field421][field423][field424];
    }

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "()V", line = 586)
    public static final void method212() {
        for (int var0 = 0; var0 < field428; var0++) {
            class314 var1 = field429[var0];
            int var2 = var1.field5007;
            if (var1.field5001) {
                var2 = 0;
            }
            int var3 = var1.field5007;
            if (var1.field4995) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field4999 >> 7) - var1.field4993;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field4999 >> 7) + var1.field4993;
                if (var7 > field424 - 1) {
                    var7 = field424 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field4992[var5++];
                    int var10 = (var9 >> 8) + ((var1.field5008 >> 7) - var1.field4993);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field423 - 1) {
                        var11 = field423 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field426[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field426[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field426[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field426[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field426[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "()V", line = 677)
    public static final void method213() {
        field429 = null;
        field430 = null;
        field434 = null;
        field436 = null;
        field427 = null;
        field426 = (int[][][]) null;
    }
}
