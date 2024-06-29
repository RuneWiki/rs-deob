import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class46 {

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "[F")
    private static float[] field927 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field931 = 0;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    private static int field920;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    private static int field922;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    private static int field923;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    private static int field924;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    private static int field926;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    private static int field929;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    private static int field930;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    private static int field933;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "[I")
    private static int[] field925;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "[I")
    private static int[] field932;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "[Lwc;")
    public static class97[] field919;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "[Z")
    private static boolean[] field921;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "[Z")
    private static boolean[] field928;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "[[[I")
    private static int[][][] field934;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZ)V", line = 6)
    public static final void method307(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field931; var2++) {
            field919[var2].method607(arg1, arg0, 1404891777);
        }
        field929 = -1;
        field933 = -1;
        field923 = -1;
        field920 = -1;
        field924 = -1;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "()V", line = 24)
    public static final void method308() {
        for (int var0 = 0; var0 < 4; var0++) {
            field925[var0] = -1;
            method314(var0);
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "()V", line = 37)
    public static final void method309() {
        for (int var0 = 0; var0 < field931; var0++) {
            class97 var1 = field919[var0];
            int var2 = var1.field1686;
            if (var1.field1648) {
                var2 = 0;
            }
            int var3 = var1.field1686;
            if (var1.field1663) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field1660 >> 7) - var1.field1646;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field1660 >> 7) + var1.field1646;
                if (var7 > field930 - 1) {
                    var7 = field930 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field1653[var5++];
                    int var10 = (var9 >> 8) + ((var1.field1657 >> 7) - var1.field1646);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field922 - 1) {
                        var11 = field922 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field934[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field934[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field934[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field934[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field934[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIII)V", line = 126)
    public static final void method310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class90.field1536 || field929 == arg3 && field933 == arg4 && field923 == arg5 && field920 == arg4 && field924 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field928[var6] = false;
        }
        int var7 = 0;
        int var8 = field934[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field925[var10] == var9) {
                        field928[var10] = true;
                        continue label72;
                    }
                }
                field932[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field928[var12]) {
                        field925[var12] = field932[var11];
                        field928[var12] = true;
                        method319(var12, field919[field932[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field928[var13]) {
                    field925[var13] = -1;
                    method314(var13);
                }
            }
            field929 = arg3;
            field933 = arg4;
            field923 = arg5;
            field920 = arg4;
            field924 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "()V", line = 213)
    public static final void method311() {
        field919 = null;
        field925 = null;
        field921 = null;
        field932 = null;
        field928 = null;
        field934 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "()V", line = 223)
    public static final void method312() {
        GL var0 = class247.field4253;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        field919 = new class97[255];
        field925 = new int[4];
        field921 = new boolean[4];
        field932 = new int[4];
        field928 = new boolean[4];
        field934 = new int[field926][field922][field930];
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIII)V", line = 245)
    public static final void method313(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class90.field1536) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field925[var5] != -1) {
                int var6 = field934[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field925[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field934[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field925[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field925[var5] = -1;
            method314(var5);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 288)
    private static final void method314(int arg0) {
        if (field921[arg0]) {
            field921[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class247.field4253;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIIII)V", line = 307)
    public static final void method315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class90.field1536 || field929 == arg3 && field933 == arg4 && field923 == arg5 && field920 == arg6 && field924 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field928[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field934[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field932[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field925[var16] == var14) {
                                    if (!field928[var16]) {
                                        field928[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field932[var10++] = var14;
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
                if (!field928[var18]) {
                    field925[var18] = field932[var17];
                    field928[var18] = true;
                    method319(var18, field919[field932[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field928[var19]) {
                field925[var19] = -1;
                method314(var19);
            }
        }
        field929 = arg3;
        field933 = arg4;
        field923 = arg5;
        field920 = arg6;
        field924 = arg7;
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "()V", line = 437)
    public static final void method316() {
        field931 = 0;
        for (int var0 = 0; var0 < field926; var0++) {
            for (int var1 = 0; var1 < field922; var1++) {
                for (int var2 = 0; var2 < field930; var2++) {
                    field934[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II[[[Le;)V", line = 469)
    public static final void method317(int arg0, int arg1, class150[][][] arg2) {
        if (!class90.field1536) {
            return;
        }
        GL var3 = class247.field4253;
        class217.method1498((byte) -29, 0, 0);
        class247.method1701(0);
        class247.method1710();
        class247.method1691(class247.field4259);
        var3.glDepthMask(false);
        class247.method1706(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label58: for (int var4 = 0; var4 < field931; var4++) {
            class97 var5 = field919[var4];
            if (var5.field1667 != null) {
                int var6 = 0;
                int var7 = (var5.field1660 >> 7) - var5.field1646;
                int var8 = (var5.field1660 >> 7) + var5.field1646;
                if (var8 >= class115.field1939) {
                    var8 = class115.field1939 - 1;
                }
                if (var7 < class96.field1631) {
                    var6 += class96.field1631 - var7;
                    var7 = class96.field1631;
                }
                for (int var9 = var7; var9 <= var8; var9++) {
                    short var10 = var5.field1653[var6++];
                    int var11 = (var10 >> 8) + ((var5.field1657 >> 7) - var5.field1646);
                    int var12 = (var10 & 0xFF) + var11 - 1;
                    if (var11 < class170.field2972) {
                        var11 = class170.field2972;
                    }
                    if (var12 >= class181.field3172) {
                        var12 = class181.field3172 - 1;
                    }
                    for (int var13 = var11; var13 <= var12; var13++) {
                        class150 var14 = arg2[var5.field1686][var13][var9];
                        if (var14 != null && var14.field2574) {
                            class247.method1718(201.5F - (float) var5.field1686 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field1659 }, 0);
                            var5.field1667.method1958();
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
        var3.glFogfv(2918, class119.field2014, 0);
        var3.glEnableClientState(32888);
        class247.method1715();
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "()V", line = 564)
    public static void method318() {
        field919 = null;
        field934 = (int[][][]) null;
        field925 = null;
        field921 = null;
        field927 = null;
        field932 = null;
        field928 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILwc;III)V", line = 580)
    private static final void method319(int arg0, class97 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class247.field4253;
        if (!field921[arg0]) {
            var6.glEnable(var5);
            field921[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field1664);
        var6.glLightfv(var5, 4609, arg1.field1662, 0);
        field927[0] = (float) (arg1.field1657 - arg2);
        field927[1] = (float) (arg1.field1651 - arg3);
        field927[2] = (float) (arg1.field1660 - arg4);
        var6.glLightfv(var5, 4611, field927, 0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIII)V", line = 597)
    public static final void method320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class90.field1536) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method310(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field922 - 1) {
            method310(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method310(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field930 - 1) {
            method310(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field930 - 1) {
            method310(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field922 - 1 && arg6 < field930 - 1) {
            method310(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method310(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field922 - 1 && arg6 > 0) {
            method310(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)V", line = 651)
    public static final void method321(int arg0, int arg1, int arg2) {
        field926 = arg0;
        field922 = arg1;
        field930 = arg2;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lwc;)V", line = 657)
    public static final void method322(class97 arg0) {
        if (field931 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field919[field931++] = arg0;
        }
    }
}
