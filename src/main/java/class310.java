import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class310 {

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "[F")
    private static float[] field4710 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field4719 = 0;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    private static int field4706;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    private static int field4707;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    private static int field4709;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    private static int field4713;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    private static int field4715;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    private static int field4717;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    private static int field4718;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    private static int field4720;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "[I")
    private static int[] field4712;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "[I")
    private static int[] field4714;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "[Lqk;")
    public static class1[] field4711;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "[Z")
    private static boolean[] field4708;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "[Z")
    private static boolean[] field4716;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "[[[I")
    private static int[][][] field4705;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()V", line = 7)
    public static final void method2071() {
        for (int var0 = 0; var0 < field4719; var0++) {
            class1 var1 = field4711[var0];
            int var2 = var1.field28;
            if (var1.field3) {
                var2 = 0;
            }
            int var3 = var1.field28;
            if (var1.field18) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field11 >> 7) - var1.field9;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field11 >> 7) + var1.field9;
                if (var7 > field4707 - 1) {
                    var7 = field4707 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field2[var5++];
                    int var10 = (var9 >> 8) + ((var1.field5 >> 7) - var1.field9);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field4713 - 1) {
                        var11 = field4713 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field4705[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field4705[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field4705[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field4705[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field4705[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "()V", line = 101)
    public static final void method2072() {
        for (int var0 = 0; var0 < 4; var0++) {
            field4714[var0] = -1;
            method2087(var0);
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "()V", line = 111)
    public static void method2073() {
        field4711 = null;
        field4705 = (int[][][]) null;
        field4714 = null;
        field4708 = null;
        field4710 = null;
        field4712 = null;
        field4716 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II[[[Lmj;)V", line = 121)
    public static final void method2074(int arg0, int arg1, class47[][][] arg2) {
        if (!class334.field5115) {
            return;
        }
        GL var3 = class249.field3898;
        class128.method844(0, 0, (byte) -51);
        class249.method1653(0);
        class249.method1657();
        class249.method1689(class249.field3909);
        var3.glDepthMask(false);
        class249.method1648(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field4719; var4++) {
            class1 var5 = field4711[var4];
            int var6 = var5.field28;
            if (var5.field15) {
                var6--;
            }
            if (var5.field24 != null) {
                int var7 = 0;
                int var8 = (var5.field11 >> 7) - var5.field9;
                int var9 = (var5.field11 >> 7) + var5.field9;
                if (var9 >= class121.field2092) {
                    var9 = class121.field2092 - 1;
                }
                if (var8 < class23.field471) {
                    var7 += class23.field471 - var8;
                    var8 = class23.field471;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field2[var7++];
                    int var12 = (var11 >> 8) + ((var5.field5 >> 7) - var5.field9);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class189.field3061) {
                        var12 = class189.field3061;
                    }
                    if (var13 >= class190.field3081) {
                        var13 = class190.field3081 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class47 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field963) {
                            class249.method1678(201.5F - (float) var5.field28 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field27 }, 0);
                            var5.field24.method1994();
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
        var3.glFogfv(2918, class65.field1239, 0);
        var3.glEnableClientState(32888);
        class249.method1666();
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "()V", line = 222)
    public static final void method2075() {
        field4711 = null;
        field4714 = null;
        field4708 = null;
        field4712 = null;
        field4716 = null;
        field4705 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "()V", line = 231)
    public static final void method2076() {
        GL var0 = class249.field3898;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field4714[var3] = -1;
            method2087(var3);
        }
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "()V", line = 257)
    public static final void method2077() {
        field4719 = 0;
        for (int var0 = 0; var0 < field4720; var0++) {
            for (int var1 = 0; var1 < field4713; var1++) {
                for (int var2 = 0; var2 < field4707; var2++) {
                    field4705[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIII)V", line = 285)
    public static final void method2078(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class334.field5115 || field4706 == arg3 && field4715 == arg4 && field4709 == arg5 && field4717 == arg6 && field4718 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field4716[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field4705[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field4712[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field4714[var16] == var14) {
                                    if (!field4716[var16]) {
                                        field4716[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field4712[var10++] = var14;
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
                if (!field4716[var18]) {
                    field4714[var18] = field4712[var17];
                    field4716[var18] = true;
                    method2079(var18, field4711[field4712[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field4716[var19]) {
                field4714[var19] = -1;
                method2087(var19);
            }
        }
        field4706 = arg3;
        field4715 = arg4;
        field4709 = arg5;
        field4717 = arg6;
        field4718 = arg7;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILqk;III)V", line = 417)
    private static final void method2079(int arg0, class1 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class249.field3898;
        if (!field4708[arg0]) {
            var6.glEnable(var5);
            field4708[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field30);
        var6.glLightfv(var5, 4609, arg1.field17, 0);
        field4710[0] = (float) (arg1.field5 - arg2);
        field4710[1] = (float) (arg1.field29 - arg3);
        field4710[2] = (float) (arg1.field11 - arg4);
        var6.glLightfv(var5, 4611, field4710, 0);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)V", line = 438)
    public static final void method2080(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field4719; var2++) {
            field4711[var2].method6((byte) 59, arg1, arg0);
        }
        field4706 = -1;
        field4715 = -1;
        field4709 = -1;
        field4717 = -1;
        field4718 = -1;
    }

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "()V", line = 452)
    public static final void method2081() {
        field4711 = new class1[255];
        field4714 = new int[4];
        field4708 = new boolean[4];
        field4712 = new int[4];
        field4716 = new boolean[4];
        field4705 = new int[field4720][field4713][field4707];
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIII)V", line = 471)
    public static final void method2082(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class334.field5115) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field4714[var5] != -1) {
                int var6 = field4705[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field4714[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field4705[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field4714[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field4714[var5] = -1;
            method2087(var5);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIII)V", line = 517)
    public static final void method2083(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class334.field5115 || field4706 == arg3 && field4715 == arg4 && field4709 == arg5 && field4717 == arg4 && field4718 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field4716[var6] = false;
        }
        int var7 = 0;
        int var8 = field4705[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field4714[var10] == var9) {
                        field4716[var10] = true;
                        continue label72;
                    }
                }
                field4712[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field4716[var12]) {
                        field4714[var12] = field4712[var11];
                        field4716[var12] = true;
                        method2079(var12, field4711[field4712[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field4716[var13]) {
                    field4714[var13] = -1;
                    method2087(var13);
                }
            }
            field4706 = arg3;
            field4715 = arg4;
            field4709 = arg5;
            field4717 = arg4;
            field4718 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lqk;)V", line = 604)
    public static final void method2084(class1 arg0) {
        if (field4719 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field4711[field4719++] = arg0;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V", line = 617)
    public static final void method2085(int arg0, int arg1, int arg2) {
        field4720 = arg0;
        field4713 = arg1;
        field4707 = arg2;
        field4705 = new int[field4720][field4713][field4707];
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIII)V", line = 623)
    public static final void method2086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class334.field5115) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method2083(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field4713 - 1) {
            method2083(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method2083(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field4707 - 1) {
            method2083(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field4707 - 1) {
            method2083(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field4713 - 1 && arg6 < field4707 - 1) {
            method2083(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method2083(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field4713 - 1 && arg6 > 0) {
            method2083(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 679)
    private static final void method2087(int arg0) {
        if (field4708[arg0]) {
            field4708[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class249.field3898;
            var2.glDisable(var1);
        }
    }
}
