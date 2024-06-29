import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class245 {

    @OriginalMember(owner = "client!im", name = "k", descriptor = "I")
    public static int field4174 = 0;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "[F")
    private static float[] field4173 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    private static int field4166;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    private static int field4167;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    private static int field4169;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    private static int field4170;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    private static int field4171;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    private static int field4172;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    private static int field4176;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    private static int field4179;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "[I")
    private static int[] field4164;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "[I")
    private static int[] field4175;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "[Lsm;")
    public static class118[] field4178;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "[Z")
    private static boolean[] field4165;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "[Z")
    private static boolean[] field4168;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "[[[I")
    private static int[][][] field4177;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "()V", line = 6)
    public static final void method1645() {
        GL var0 = class253.field4319;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        field4178 = new class118[255];
        field4164 = new int[4];
        field4168 = new boolean[4];
        field4175 = new int[4];
        field4165 = new boolean[4];
        field4177 = new int[field4170][field4179][field4172];
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 37)
    private static final void method1646(int arg0) {
        if (field4168[arg0]) {
            field4168[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class253.field4319;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lsm;)V", line = 52)
    public static final void method1647(class118 arg0) {
        if (field4174 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field4178[field4174++] = arg0;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILsm;III)V", line = 65)
    private static final void method1648(int arg0, class118 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class253.field4319;
        if (!field4168[arg0]) {
            var6.glEnable(var5);
            field4168[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field2080);
        var6.glLightfv(var5, 4609, arg1.field2075, 0);
        field4173[0] = (float) (arg1.field2096 - arg2);
        field4173[1] = (float) (arg1.field2079 - arg3);
        field4173[2] = (float) (arg1.field2092 - arg4);
        var6.glLightfv(var5, 4611, field4173, 0);
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "()V", line = 85)
    public static final void method1649() {
        for (int var0 = 0; var0 < field4174; var0++) {
            class118 var1 = field4178[var0];
            int var2 = var1.field2099;
            if (var1.field2068) {
                var2 = 0;
            }
            int var3 = var1.field2099;
            if (var1.field2087) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field2092 >> 7) - var1.field2082;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field2092 >> 7) + var1.field2082;
                if (var7 > field4172 - 1) {
                    var7 = field4172 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field2094[var5++];
                    int var10 = (var9 >> 8) + ((var1.field2096 >> 7) - var1.field2082);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field4179 - 1) {
                        var11 = field4179 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field4177[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field4177[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field4177[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field4177[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field4177[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IZ)V", line = 176)
    public static final void method1650(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field4174; var2++) {
            field4178[var2].method805(arg1, true, arg0);
        }
        field4171 = -1;
        field4167 = -1;
        field4169 = -1;
        field4166 = -1;
        field4176 = -1;
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "()V", line = 194)
    public static final void method1651() {
        field4178 = null;
        field4164 = null;
        field4168 = null;
        field4175 = null;
        field4165 = null;
        field4177 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "()V", line = 205)
    public static void method1652() {
        field4178 = null;
        field4177 = (int[][][]) null;
        field4164 = null;
        field4168 = null;
        field4173 = null;
        field4175 = null;
        field4165 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIIII)V", line = 217)
    public static final void method1653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class193.field3531 || field4171 == arg3 && field4167 == arg4 && field4169 == arg5 && field4166 == arg6 && field4176 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field4165[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field4177[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field4175[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field4164[var16] == var14) {
                                    if (!field4165[var16]) {
                                        field4165[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field4175[var10++] = var14;
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
                if (!field4165[var18]) {
                    field4164[var18] = field4175[var17];
                    field4165[var18] = true;
                    method1648(var18, field4178[field4175[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field4165[var19]) {
                field4164[var19] = -1;
                method1646(var19);
            }
        }
        field4171 = arg3;
        field4167 = arg4;
        field4169 = arg5;
        field4166 = arg6;
        field4176 = arg7;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIII)V", line = 346)
    public static final void method1654(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class193.field3531) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1657(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field4179 - 1) {
            method1657(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1657(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field4172 - 1) {
            method1657(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field4172 - 1) {
            method1657(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field4179 - 1 && arg6 < field4172 - 1) {
            method1657(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1657(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field4179 - 1 && arg6 > 0) {
            method1657(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(III)V", line = 399)
    public static final void method1655(int arg0, int arg1, int arg2) {
        field4170 = arg0;
        field4179 = arg1;
        field4172 = arg2;
    }

    @OriginalMember(owner = "client!im", name = "e", descriptor = "()V", line = 406)
    public static final void method1656() {
        for (int var0 = 0; var0 < 4; var0++) {
            field4164[var0] = -1;
            method1646(var0);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIII)V", line = 418)
    public static final void method1657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class193.field3531 || field4171 == arg3 && field4167 == arg4 && field4169 == arg5 && field4166 == arg4 && field4176 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field4165[var6] = false;
        }
        int var7 = 0;
        int var8 = field4177[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field4164[var10] == var9) {
                        field4165[var10] = true;
                        continue label72;
                    }
                }
                field4175[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field4165[var12]) {
                        field4164[var12] = field4175[var11];
                        field4165[var12] = true;
                        method1648(var12, field4178[field4175[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field4165[var13]) {
                    field4164[var13] = -1;
                    method1646(var13);
                }
            }
            field4171 = arg3;
            field4167 = arg4;
            field4169 = arg5;
            field4166 = arg4;
            field4176 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIII)V", line = 505)
    public static final void method1658(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class193.field3531) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field4164[var5] != -1) {
                int var6 = field4177[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field4164[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field4177[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field4164[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field4164[var5] = -1;
            method1646(var5);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II[[[Lmh;)V", line = 548)
    public static final void method1659(int arg0, int arg1, class271[][][] arg2) {
        if (!class193.field3531) {
            return;
        }
        GL var3 = class253.field4319;
        class277.method1910(0, 0, -19856);
        class253.method1704(0);
        class253.method1737();
        class253.method1714(class253.field4306);
        var3.glDepthMask(false);
        class253.method1703(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field4174; var4++) {
            class118 var5 = field4178[var4];
            int var6 = var5.field2099;
            if (var5.field2071) {
                var6--;
            }
            if (var5.field2098 != null) {
                int var7 = 0;
                int var8 = (var5.field2092 >> 7) - var5.field2082;
                int var9 = (var5.field2092 >> 7) + var5.field2082;
                if (var9 >= class186.field3273) {
                    var9 = class186.field3273 - 1;
                }
                if (var8 < class36.field599) {
                    var7 += class36.field599 - var8;
                    var8 = class36.field599;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field2094[var7++];
                    int var12 = (var11 >> 8) + ((var5.field2096 >> 7) - var5.field2082);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class284.field4935) {
                        var12 = class284.field4935;
                    }
                    if (var13 >= class173.field3069) {
                        var13 = class173.field3069 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class271 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field4644) {
                            class253.method1718(201.5F - (float) var5.field2099 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field2072 }, 0);
                            var5.field2098.method1174();
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
        var3.glFogfv(2918, class169.field2994, 0);
        var3.glEnableClientState(32888);
        class253.method1721();
    }

    @OriginalMember(owner = "client!im", name = "f", descriptor = "()V", line = 649)
    public static final void method1660() {
        field4174 = 0;
        for (int var0 = 0; var0 < field4170; var0++) {
            for (int var1 = 0; var1 < field4179; var1++) {
                for (int var2 = 0; var2 < field4172; var2++) {
                    field4177[var0][var1][var2] = 0;
                }
            }
        }
    }
}
