import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class2 {

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field12 = 0;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "[F")
    private static float[] field17 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    private static int field10;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    private static int field11;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    private static int field13;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    private static int field14;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    private static int field5;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    private static int field6;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    private static int field7;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    private static int field9;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "[I")
    private static int[] field16;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "[I")
    private static int[] field8;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "[Lqf;")
    public static class300[] field15;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "[Z")
    private static boolean[] field3;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "[Z")
    private static boolean[] field4;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "[[[I")
    private static int[][][] field2;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()V", line = 7)
    public static final void method3() {
        for (int var0 = 0; var0 < 4; var0++) {
            field8[var0] = -1;
            method5(var0);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V", line = 18)
    public static final void method4(int arg0, int arg1, int arg2) {
        field13 = arg0;
        field6 = arg1;
        field14 = arg2;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 25)
    private static final void method5(int arg0) {
        if (field4[arg0]) {
            field4[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class147.field2479;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIII)V", line = 36)
    public static final void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class75.field1303) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method18(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field6 - 1) {
            method18(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method18(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field14 - 1) {
            method18(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field14 - 1) {
            method18(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field6 - 1 && arg6 < field14 - 1) {
            method18(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method18(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field6 - 1 && arg6 > 0) {
            method18(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II[[[Lrk;)V", line = 91)
    public static final void method7(int arg0, int arg1, class16[][][] arg2) {
        if (!class75.field1303) {
            return;
        }
        GL var3 = class147.field2479;
        class171.method1211(0, 0, false);
        class147.method1012(0);
        class147.method1000();
        class147.method1002(class147.field2483);
        var3.glDepthMask(false);
        class147.method997(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label58: for (int var4 = 0; var4 < field12; var4++) {
            class300 var5 = field15[var4];
            if (var5.field5093 != null) {
                int var6 = 0;
                int var7 = (var5.field5105 >> 7) - var5.field5106;
                int var8 = (var5.field5105 >> 7) + var5.field5106;
                if (var8 >= class203.field3520) {
                    var8 = class203.field3520 - 1;
                }
                if (var7 < class126.field2218) {
                    var6 += class126.field2218 - var7;
                    var7 = class126.field2218;
                }
                for (int var9 = var7; var9 <= var8; var9++) {
                    short var10 = var5.field5116[var6++];
                    int var11 = (var10 >> 8) + ((var5.field5101 >> 7) - var5.field5106);
                    int var12 = (var10 & 0xFF) + var11 - 1;
                    if (var11 < class87.field1546) {
                        var11 = class87.field1546;
                    }
                    if (var12 >= class247.field4275) {
                        var12 = class247.field4275 - 1;
                    }
                    for (int var13 = var11; var13 <= var12; var13++) {
                        class16 var14 = arg2[var5.field5114][var13][var9];
                        if (var14 != null && var14.field169) {
                            class147.method1020(201.5F - (float) var5.field5114 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field5092 }, 0);
                            var5.field5093.method1220();
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
        var3.glFogfv(2918, class85.field1530, 0);
        var3.glEnableClientState(32888);
        class147.method1019();
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)V", line = 187)
    public static final void method8(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field12; var2++) {
            field15[var2].method2077(arg1, arg0, true);
        }
        field9 = -1;
        field11 = -1;
        field7 = -1;
        field10 = -1;
        field5 = -1;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "()V", line = 201)
    public static void method9() {
        field15 = null;
        field2 = (int[][][]) null;
        field8 = null;
        field4 = null;
        field17 = null;
        field16 = null;
        field3 = null;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "()V", line = 213)
    public static final void method10() {
        for (int var0 = 0; var0 < field12; var0++) {
            class300 var1 = field15[var0];
            int var2 = var1.field5114;
            if (var1.field5115) {
                var2 = 0;
            }
            int var3 = var1.field5114;
            if (var1.field5110) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field5105 >> 7) - var1.field5106;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field5105 >> 7) + var1.field5106;
                if (var7 > field14 - 1) {
                    var7 = field14 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field5116[var5++];
                    int var10 = (var9 >> 8) + ((var1.field5101 >> 7) - var1.field5106);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field6 - 1) {
                        var11 = field6 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field2[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field2[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field2[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field2[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field2[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lqf;)V", line = 301)
    public static final void method11(class300 arg0) {
        if (field12 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field15[field12++] = arg0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILqf;III)V", line = 314)
    private static final void method12(int arg0, class300 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class147.field2479;
        if (!field4[arg0]) {
            var6.glEnable(var5);
            field4[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field5096);
        var6.glLightfv(var5, 4609, arg1.field5103, 0);
        field17[0] = (float) (arg1.field5101 - arg2);
        field17[1] = (float) (arg1.field5118 - arg3);
        field17[2] = (float) (arg1.field5105 - arg4);
        var6.glLightfv(var5, 4611, field17, 0);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIII)V", line = 333)
    public static final void method13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class75.field1303 || field9 == arg3 && field11 == arg4 && field7 == arg5 && field10 == arg6 && field5 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field3[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field2[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field16[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field8[var16] == var14) {
                                    if (!field3[var16]) {
                                        field3[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field16[var10++] = var14;
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
                if (!field3[var18]) {
                    field8[var18] = field16[var17];
                    field3[var18] = true;
                    method12(var18, field15[field16[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field3[var19]) {
                field8[var19] = -1;
                method5(var19);
            }
        }
        field9 = arg3;
        field11 = arg4;
        field7 = arg5;
        field10 = arg6;
        field5 = arg7;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "()V", line = 463)
    public static final void method14() {
        field12 = 0;
        for (int var0 = 0; var0 < field13; var0++) {
            for (int var1 = 0; var1 < field6; var1++) {
                for (int var2 = 0; var2 < field14; var2++) {
                    field2[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "()V", line = 491)
    public static final void method15() {
        field15 = null;
        field8 = null;
        field4 = null;
        field16 = null;
        field3 = null;
        field2 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "()V", line = 501)
    public static final void method16() {
        GL var0 = class147.field2479;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        field15 = new class300[255];
        field8 = new int[4];
        field4 = new boolean[4];
        field16 = new int[4];
        field3 = new boolean[4];
        field2 = new int[field13][field6][field14];
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)V", line = 523)
    public static final void method17(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class75.field1303) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field8[var5] != -1) {
                int var6 = field2[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field8[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field2[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field8[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field8[var5] = -1;
            method5(var5);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIII)V", line = 582)
    public static final void method18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class75.field1303 || field9 == arg3 && field11 == arg4 && field7 == arg5 && field10 == arg4 && field5 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field3[var6] = false;
        }
        int var7 = 0;
        int var8 = field2[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field8[var10] == var9) {
                        field3[var10] = true;
                        continue label72;
                    }
                }
                field16[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field3[var12]) {
                        field8[var12] = field16[var11];
                        field3[var12] = true;
                        method12(var12, field15[field16[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field3[var13]) {
                    field8[var13] = -1;
                    method5(var13);
                }
            }
            field9 = arg3;
            field11 = arg4;
            field7 = arg5;
            field10 = arg4;
            field5 = arg5;
            return;
        }
    }
}
