import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class257 {

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "[Z")
    private static boolean[] field4366 = new boolean[4];

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "[Llf;")
    public static class291[] field4371 = new class291[255];

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field4370 = 0;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "[F")
    private static float[] field4373 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "[I")
    private static int[] field4367 = new int[4];

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "[I")
    private static int[] field4375 = new int[4];

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "[Z")
    private static boolean[] field4377 = new boolean[4];

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    private static int field4363;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    private static int field4364;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    private static int field4365;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    private static int field4368;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    private static int field4369;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    private static int field4372;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    private static int field4376;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
    private static int field4378;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "[[[I")
    private static int[][][] field4374;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "()V", line = 4)
    public static final void method1755() {
        field4370 = 0;
        for (int var0 = 0; var0 < field4369; var0++) {
            for (int var1 = 0; var1 < field4378; var1++) {
                for (int var2 = 0; var2 < field4376; var2++) {
                    field4374[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 32)
    private static final void method1756(int arg0) {
        if (field4377[arg0]) {
            field4377[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class90.field1390;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Llf;)V", line = 43)
    public static final void method1757(class291 arg0) {
        if (field4370 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field4371[field4370++] = arg0;
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "()V", line = 57)
    public static final void method1758() {
        GL var0 = class90.field1390;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZ)V", line = 75)
    public static final void method1759(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field4370; var2++) {
            field4371[var2].method1996(122, arg0, arg1);
        }
        field4365 = -1;
        field4364 = -1;
        field4368 = -1;
        field4363 = -1;
        field4372 = -1;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILlf;III)V", line = 91)
    private static final void method1760(int arg0, class291 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class90.field1390;
        if (!field4377[arg0]) {
            var6.glEnable(var5);
            field4377[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field4885);
        var6.glLightfv(var5, 4609, arg1.field4888, 0);
        field4373[0] = (float) (arg1.field4905 - arg2);
        field4373[1] = (float) (arg1.field4902 - arg3);
        field4373[2] = (float) (arg1.field4909 - arg4);
        var6.glLightfv(var5, 4611, field4373, 0);
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "()V", line = 111)
    public static void method1761() {
        field4371 = null;
        field4374 = (int[][][]) null;
        field4367 = null;
        field4377 = null;
        field4373 = null;
        field4375 = null;
        field4366 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIII)V", line = 123)
    public static final void method1762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class44.field539) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1763(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field4378 - 1) {
            method1763(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1763(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field4376 - 1) {
            method1763(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field4376 - 1) {
            method1763(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field4378 - 1 && arg6 < field4376 - 1) {
            method1763(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1763(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field4378 - 1 && arg6 > 0) {
            method1763(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIII)V", line = 176)
    public static final void method1763(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class44.field539 || field4365 == arg3 && field4364 == arg4 && field4368 == arg5 && field4363 == arg4 && field4372 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field4366[var6] = false;
        }
        int var7 = 0;
        int var8 = field4374[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field4367[var10] == var9) {
                        field4366[var10] = true;
                        continue label72;
                    }
                }
                field4375[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field4366[var12]) {
                        field4367[var12] = field4375[var11];
                        field4366[var12] = true;
                        method1760(var12, field4371[field4375[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field4366[var13]) {
                    field4367[var13] = -1;
                    method1756(var13);
                }
            }
            field4365 = arg3;
            field4364 = arg4;
            field4368 = arg5;
            field4363 = arg4;
            field4372 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)V", line = 263)
    public static final void method1764(int arg0, int arg1, int arg2) {
        field4369 = arg0;
        field4378 = arg1;
        field4376 = arg2;
        field4374 = new int[field4369][field4378][field4376];
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIII)V", line = 271)
    public static final void method1765(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class44.field539 || field4365 == arg3 && field4364 == arg4 && field4368 == arg5 && field4363 == arg6 && field4372 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field4366[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field4374[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field4375[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field4367[var16] == var14) {
                                    if (!field4366[var16]) {
                                        field4366[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field4375[var10++] = var14;
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
                if (!field4366[var18]) {
                    field4367[var18] = field4375[var17];
                    field4366[var18] = true;
                    method1760(var18, field4371[field4375[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field4366[var19]) {
                field4367[var19] = -1;
                method1756(var19);
            }
        }
        field4365 = arg3;
        field4364 = arg4;
        field4368 = arg5;
        field4363 = arg6;
        field4372 = arg7;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIII)V", line = 400)
    public static final void method1766(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class44.field539) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field4367[var5] != -1) {
                int var6 = field4374[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field4367[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field4374[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field4367[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field4367[var5] = -1;
            method1756(var5);
        }
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "()V", line = 453)
    public static final void method1767() {
        for (int var0 = 0; var0 < field4370; var0++) {
            class291 var1 = field4371[var0];
            int var2 = var1.field4889;
            if (var1.field4908) {
                var2 = 0;
            }
            int var3 = var1.field4889;
            if (var1.field4901) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field4909 >> 7) - var1.field4893;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field4909 >> 7) + var1.field4893;
                if (var7 > field4376 - 1) {
                    var7 = field4376 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field4892[var5++];
                    int var10 = (var9 >> 8) + ((var1.field4905 >> 7) - var1.field4893);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field4378 - 1) {
                        var11 = field4378 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field4374[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field4374[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field4374[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field4374[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field4374[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "()V", line = 545)
    public static final void method1768() {
        for (int var0 = 0; var0 < 4; var0++) {
            field4367[var0] = -1;
            method1756(var0);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II[[[Lsb;)V", line = 568)
    public static final void method1769(int arg0, int arg1, class127[][][] arg2) {
        if (!class44.field539) {
            return;
        }
        GL var3 = class90.field1390;
        class284.method1960(0, 0, 15);
        class90.method609(0);
        class90.method632();
        class90.method617(class90.field1362);
        var3.glDepthMask(false);
        class90.method624(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label58: for (int var4 = 0; var4 < field4370; var4++) {
            class291 var5 = field4371[var4];
            if (var5.field4903 != null) {
                int var6 = 0;
                int var7 = (var5.field4909 >> 7) - var5.field4893;
                int var8 = (var5.field4909 >> 7) + var5.field4893;
                if (var8 >= class27.field343) {
                    var8 = class27.field343 - 1;
                }
                if (var7 < class297.field5020) {
                    var6 += class297.field5020 - var7;
                    var7 = class297.field5020;
                }
                for (int var9 = var7; var9 <= var8; var9++) {
                    short var10 = var5.field4892[var6++];
                    int var11 = (var10 >> 8) + ((var5.field4905 >> 7) - var5.field4893);
                    int var12 = (var10 & 0xFF) + var11 - 1;
                    if (var11 < class145.field2245) {
                        var11 = class145.field2245;
                    }
                    if (var12 >= class85.field1292) {
                        var12 = class85.field1292 - 1;
                    }
                    for (int var13 = var11; var13 <= var12; var13++) {
                        class127 var14 = arg2[var5.field4889][var13][var9];
                        if (var14 != null && var14.field1975) {
                            class90.method622(201.5F - (float) var5.field4889 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field4884 }, 0);
                            var5.field4903.method1520();
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
        var3.glFogfv(2918, class34.field400, 0);
        var3.glEnableClientState(32888);
        class90.method637();
    }
}
