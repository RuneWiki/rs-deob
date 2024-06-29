import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class118 {

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "[F")
    private static float[] field1783 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field1793 = 0;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    private static int field1785;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    private static int field1786;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    private static int field1789;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    private static int field1790;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    private static int field1791;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    private static int field1795;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    private static int field1796;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    private static int field1797;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "[I")
    private static int[] field1782;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "[I")
    private static int[] field1794;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "[Lhm;")
    public static class48[] field1784;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "[Z")
    private static boolean[] field1788;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "[Z")
    private static boolean[] field1792;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "[[[I")
    private static int[][][] field1787;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "()V", line = 4)
    public static void method814() {
        field1784 = null;
        field1787 = (int[][][]) null;
        field1782 = null;
        field1788 = null;
        field1783 = null;
        field1794 = null;
        field1792 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIII)V", line = 13)
    public static final void method815(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class322.field4994) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method817(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field1786 - 1) {
            method817(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method817(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field1795 - 1) {
            method817(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field1795 - 1) {
            method817(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field1786 - 1 && arg6 < field1795 - 1) {
            method817(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method817(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field1786 - 1 && arg6 > 0) {
            method817(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lhm;)V", line = 66)
    public static final void method816(class48 arg0) {
        if (field1793 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field1784[field1793++] = arg0;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIII)V", line = 77)
    public static final void method817(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class322.field4994 || field1789 == arg3 && field1791 == arg4 && field1790 == arg5 && field1785 == arg4 && field1797 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field1792[var6] = false;
        }
        int var7 = 0;
        int var8 = field1787[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field1782[var10] == var9) {
                        field1792[var10] = true;
                        continue label72;
                    }
                }
                field1794[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field1792[var12]) {
                        field1782[var12] = field1794[var11];
                        field1792[var12] = true;
                        method829(var12, field1784[field1794[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field1792[var13]) {
                    field1782[var13] = -1;
                    method825(var13);
                }
            }
            field1789 = arg3;
            field1791 = arg4;
            field1790 = arg5;
            field1785 = arg4;
            field1797 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIIII)V", line = 165)
    public static final void method818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class322.field4994 || field1789 == arg3 && field1791 == arg4 && field1790 == arg5 && field1785 == arg6 && field1797 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field1792[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field1787[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field1794[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field1782[var16] == var14) {
                                    if (!field1792[var16]) {
                                        field1792[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field1794[var10++] = var14;
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
                if (!field1792[var18]) {
                    field1782[var18] = field1794[var17];
                    field1792[var18] = true;
                    method829(var18, field1784[field1794[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field1792[var19]) {
                field1782[var19] = -1;
                method825(var19);
            }
        }
        field1789 = arg3;
        field1791 = arg4;
        field1790 = arg5;
        field1785 = arg6;
        field1797 = arg7;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "()V", line = 294)
    public static final void method819() {
        field1784 = null;
        field1782 = null;
        field1788 = null;
        field1794 = null;
        field1792 = null;
        field1787 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIII)V", line = 303)
    public static final void method820(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class322.field4994) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field1782[var5] != -1) {
                int var6 = field1787[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field1782[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field1787[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field1782[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field1782[var5] = -1;
            method825(var5);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V", line = 348)
    public static final void method821(int arg0, int arg1, int arg2) {
        field1796 = arg0;
        field1786 = arg1;
        field1795 = arg2;
        field1787 = new int[field1796][field1786][field1795];
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZ)V", line = 357)
    public static final void method822(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field1793; var2++) {
            field1784[var2].method307(arg1, arg0, -101);
        }
        field1789 = -1;
        field1791 = -1;
        field1790 = -1;
        field1785 = -1;
        field1797 = -1;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "()V", line = 372)
    public static final void method823() {
        GL var0 = class232.field3716;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field1782[var3] = -1;
            method825(var3);
        }
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "()V", line = 405)
    public static final void method824() {
        for (int var0 = 0; var0 < field1793; var0++) {
            class48 var1 = field1784[var0];
            int var2 = var1.field666;
            if (var1.field651) {
                var2 = 0;
            }
            int var3 = var1.field666;
            if (var1.field684) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field657 >> 7) - var1.field665;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field657 >> 7) + var1.field665;
                if (var7 > field1795 - 1) {
                    var7 = field1795 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field674[var5++];
                    int var10 = (var9 >> 8) + ((var1.field678 >> 7) - var1.field665);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field1786 - 1) {
                        var11 = field1786 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field1787[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field1787[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field1787[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field1787[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field1787[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 496)
    private static final void method825(int arg0) {
        if (field1788[arg0]) {
            field1788[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class232.field3716;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II[[[Lkb;)V", line = 507)
    public static final void method826(int arg0, int arg1, class204[][][] arg2) {
        if (!class322.field4994) {
            return;
        }
        GL var3 = class232.field3716;
        class179.method1343(0, 0, -3);
        class232.method1677(0);
        class232.method1654();
        class232.method1662(class232.field3685);
        var3.glDepthMask(false);
        class232.method1660(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field1793; var4++) {
            class48 var5 = field1784[var4];
            int var6 = var5.field666;
            if (var5.field661) {
                var6--;
            }
            if (var5.field650 != null) {
                int var7 = 0;
                int var8 = (var5.field657 >> 7) - var5.field665;
                int var9 = (var5.field657 >> 7) + var5.field665;
                if (var9 >= class113.field1720) {
                    var9 = class113.field1720 - 1;
                }
                if (var8 < class180.field2983) {
                    var7 += class180.field2983 - var8;
                    var8 = class180.field2983;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field674[var7++];
                    int var12 = (var11 >> 8) + ((var5.field678 >> 7) - var5.field665);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class85.field1186) {
                        var12 = class85.field1186;
                    }
                    if (var13 >= class197.field3207) {
                        var13 = class197.field3207 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class204 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field3352) {
                            class232.method1682(201.5F - (float) var5.field666 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field664 }, 0);
                            var5.field650.method103();
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
        var3.glFogfv(2918, class87.field1199, 0);
        var3.glEnableClientState(32888);
        class232.method1648();
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "()V", line = 608)
    public static final void method827() {
        field1793 = 0;
        for (int var0 = 0; var0 < field1796; var0++) {
            for (int var1 = 0; var1 < field1786; var1++) {
                for (int var2 = 0; var2 < field1795; var2++) {
                    field1787[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "()V", line = 641)
    public static final void method828() {
        for (int var0 = 0; var0 < 4; var0++) {
            field1782[var0] = -1;
            method825(var0);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILhm;III)V", line = 659)
    private static final void method829(int arg0, class48 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class232.field3716;
        if (!field1788[arg0]) {
            var6.glEnable(var5);
            field1788[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field656);
        var6.glLightfv(var5, 4609, arg1.field658, 0);
        field1783[0] = (float) (arg1.field678 - arg2);
        field1783[1] = (float) (arg1.field682 - arg3);
        field1783[2] = (float) (arg1.field657 - arg4);
        var6.glLightfv(var5, 4611, field1783, 0);
    }

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "()V", line = 680)
    public static final void method830() {
        field1784 = new class48[255];
        field1782 = new int[4];
        field1788 = new boolean[4];
        field1794 = new int[4];
        field1792 = new boolean[4];
        field1787 = new int[field1796][field1786][field1795];
    }
}
